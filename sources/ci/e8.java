package ci;

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
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class e8 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.j9 b;
    public final org.telegram.ui.Components.y9 c;
    public final TextView d;
    public ViewPropertyAnimator e;

    public e8(Activity activity, int i10) {
        super(activity);
        this.a = i10;
        this.b = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(activity);
        this.c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(y9Var, w7.x5.a(30.0f, 14.0f, 0.0f, 0.0f, 0.0f, 30, 19));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.x5.a(-2.0f, 53.0f, 11.33f, 12.0f, 0.0f, -1, 51));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.m1(0.85f, -1));
        addView(textView2, w7.x5.a(-2.0f, 53.0f, 29.33f, 12.0f, 0.0f, -1, 51));
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
            ViewPropertyAnimator duration = animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(hs.h).withEndAction(new bi.f(4, this, z10)).setDuration(320L);
            this.e = duration;
            duration.start();
        }
    }

    public void set(TLRPC.InputPeer inputPeer) {
        int i10 = this.a;
        long clientUserId = inputPeer == null ? UserConfig.getInstance(i10).getClientUserId() : DialogObject.getPeerDialogId(inputPeer);
        TextView textView = this.d;
        org.telegram.ui.Components.y9 y9Var = this.c;
        org.telegram.ui.Components.j9 j9Var = this.b;
        if (clientUserId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(clientUserId));
            j9Var.r(user);
            y9Var.e(user, j9Var);
            textView.setText(UserObject.getUserName(user));
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-clientUserId));
        j9Var.q(chat);
        y9Var.e(chat, j9Var);
        textView.setText(chat == null ? "" : chat.title);
    }
}
