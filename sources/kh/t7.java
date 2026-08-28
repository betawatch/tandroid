package kh;

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
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class t7 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.z8 b;
    public final org.telegram.ui.Components.o9 c;
    public final TextView d;
    public ViewPropertyAnimator e;

    public t7(Activity activity, int i9) {
        super(activity);
        this.a = i9;
        this.b = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(activity);
        this.c = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(o9Var, g7.e6.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, g7.e6.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.l1(0.85f, -1));
        addView(textView2, g7.e6.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
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
            ViewPropertyAnimator duration = animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(gr.h).withEndAction(new eh.f(10, this, z10)).setDuration(320L);
            this.e = duration;
            duration.start();
        }
    }

    public void set(TLRPC.InputPeer inputPeer) {
        int i9 = this.a;
        long clientUserId = inputPeer == null ? UserConfig.getInstance(i9).getClientUserId() : DialogObject.getPeerDialogId(inputPeer);
        TextView textView = this.d;
        org.telegram.ui.Components.o9 o9Var = this.c;
        org.telegram.ui.Components.z8 z8Var = this.b;
        if (clientUserId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(clientUserId));
            z8Var.r(user);
            o9Var.e(user, z8Var);
            textView.setText(UserObject.getUserName(user));
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-clientUserId));
        z8Var.q(chat);
        o9Var.e(chat, z8Var);
        textView.setText(chat == null ? "" : chat.title);
    }
}
