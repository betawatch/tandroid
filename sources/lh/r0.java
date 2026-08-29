package lh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class r0 extends FrameLayout {
    public final o0 a;
    public final t9 b;
    public final org.telegram.ui.Components.e9 c;
    public final ImageView d;
    public final p0 e;
    public t0 f;

    public r0(Context context) {
        super(context);
        i7.h6.a(this);
        o0 o0Var = new o0(this, context);
        this.a = o0Var;
        o0Var.setOrientation(0);
        addView(o0Var, i7.f6.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.c = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        t9 t9Var = new t9(context);
        this.b = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        o0Var.addView(t9Var, i7.f6.p(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        o0Var.addView(imageView, i7.f6.t(18, 18, 19, 0, 0, 3, 0));
        p0 p0Var = new p0(context);
        this.e = p0Var;
        p0Var.setLines(1);
        p0Var.setSingleLine();
        p0Var.setTextColor(-1);
        p0Var.setTextSize(1, 14.0f);
        p0Var.setTypeface(AndroidUtilities.bold());
        o0Var.addView(p0Var, i7.f6.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(t0 t0Var) {
        this.f = t0Var;
        long j10 = t0Var.b;
        t9 t9Var = this.b;
        org.telegram.ui.Components.e9 e9Var = this.c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(t0Var.b));
            e9Var.r(user);
            t9Var.e(user, e9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-t0Var.b));
            e9Var.q(chat);
            t9Var.e(chat, e9Var);
        }
        int i10 = t0Var.e;
        ImageView imageView = this.d;
        if (i10 > 0) {
            imageView.setImageDrawable(new j0(getContext(), t0Var.e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e.setText(DialogObject.getName(t0Var.b));
        this.a.invalidate();
    }
}
