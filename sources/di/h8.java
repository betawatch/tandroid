package di;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class h8 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.i9 b;
    public final org.telegram.ui.Components.x9 c;
    public final TextView d;
    public ViewPropertyAnimator e;

    public h8(Activity activity, int i10) {
        super(activity);
        this.a = i10;
        this.b = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(activity);
        this.c = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(x9Var, w7.x5.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.x5.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.85f, -1));
        addView(textView2, w7.x5.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.LiveStoryPeerChange), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.33f), 1.0f));
        set(null);
    }

    public final void a(boolean z10, boolean z11) {
        ViewPropertyAnimator viewPropertyAnimator = this.e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.e = null;
        }
        if (!z11) {
            setVisibility(z10 ? 0 : 8);
            setAlpha(z10 ? 1.0f : 0.0f);
        } else {
            setVisibility(0);
            ViewPropertyAnimator duration = animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(pr.h).withEndAction(new ah.u(5, this, z10)).setDuration(320L);
            this.e = duration;
            duration.start();
        }
    }

    public void set(TLRPC.InputPeer inputPeer) {
        int i10 = this.a;
        long clientUserId = inputPeer == null ? UserConfig.getInstance(i10).getClientUserId() : DialogObject.getPeerDialogId(inputPeer);
        TextView textView = this.d;
        org.telegram.ui.Components.x9 x9Var = this.c;
        org.telegram.ui.Components.i9 i9Var = this.b;
        if (clientUserId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(clientUserId));
            i9Var.r(user);
            x9Var.e(user, i9Var);
            textView.setText(UserObject.getUserName(user));
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-clientUserId));
        i9Var.q(chat);
        x9Var.e(chat, i9Var);
        textView.setText(chat == null ? "" : chat.title);
    }
}
