package ih;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class t0 extends FrameLayout {
    public final q0 a;
    public final org.telegram.ui.Components.o9 b;
    public final org.telegram.ui.Components.z8 c;
    public final ImageView d;
    public final r0 e;
    public v0 f;

    public t0(Context context) {
        super(context);
        g7.g6.a(this);
        q0 q0Var = new q0(this, context);
        this.a = q0Var;
        q0Var.setOrientation(0);
        addView(q0Var, g7.e6.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.c = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.b = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        q0Var.addView(o9Var, g7.e6.p(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        q0Var.addView(imageView, g7.e6.t(18, 18, 19, 0, 0, 3, 0));
        r0 r0Var = new r0(context);
        this.e = r0Var;
        r0Var.setLines(1);
        r0Var.setSingleLine();
        r0Var.setTextColor(-1);
        r0Var.setTextSize(1, 14.0f);
        r0Var.setTypeface(AndroidUtilities.bold());
        q0Var.addView(r0Var, g7.e6.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(v0 v0Var) {
        this.f = v0Var;
        long j10 = v0Var.b;
        org.telegram.ui.Components.o9 o9Var = this.b;
        org.telegram.ui.Components.z8 z8Var = this.c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(v0Var.b));
            z8Var.r(user);
            o9Var.e(user, z8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-v0Var.b));
            z8Var.q(chat);
            o9Var.e(chat, z8Var);
        }
        int i9 = v0Var.e;
        ImageView imageView = this.d;
        if (i9 > 0) {
            imageView.setImageDrawable(new l0(getContext(), v0Var.e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e.setText(DialogObject.getName(v0Var.b));
        this.a.invalidate();
    }
}
