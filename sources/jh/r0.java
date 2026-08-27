package jh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class r0 extends FrameLayout {
    public final o0 a;
    public final org.telegram.ui.Components.n9 b;
    public final org.telegram.ui.Components.y8 c;
    public final ImageView d;
    public final p0 e;
    public t0 f;

    public r0(Context context) {
        super(context);
        h7.b6.a(this);
        o0 o0Var = new o0(this, context);
        this.a = o0Var;
        o0Var.setOrientation(0);
        addView(o0Var, h7.z5.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.c = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.b = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        o0Var.addView(n9Var, h7.z5.p(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        o0Var.addView(imageView, h7.z5.t(18, 18, 19, 0, 0, 3, 0));
        p0 p0Var = new p0(context);
        this.e = p0Var;
        p0Var.setLines(1);
        p0Var.setSingleLine();
        p0Var.setTextColor(-1);
        p0Var.setTextSize(1, 14.0f);
        p0Var.setTypeface(AndroidUtilities.bold());
        o0Var.addView(p0Var, h7.z5.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(t0 t0Var) {
        this.f = t0Var;
        long j10 = t0Var.b;
        org.telegram.ui.Components.n9 n9Var = this.b;
        org.telegram.ui.Components.y8 y8Var = this.c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(t0Var.b));
            y8Var.r(user);
            n9Var.e(user, y8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-t0Var.b));
            y8Var.q(chat);
            n9Var.e(chat, y8Var);
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
