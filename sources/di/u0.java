package di;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class u0 extends FrameLayout {
    public final r0 a;
    public final org.telegram.ui.Components.y9 b;
    public final org.telegram.ui.Components.j9 c;
    public final ImageView d;
    public final s0 e;
    public w0 f;

    public u0(Context context) {
        super(context);
        gb1.b(this);
        r0 r0Var = new r0(this, context);
        this.a = r0Var;
        r0Var.setOrientation(0);
        addView(r0Var, gb1.h(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.c = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        r0Var.addView(y9Var, gb1.t(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        r0Var.addView(imageView, gb1.x(18, 18, 19, 0, 0, 3, 0));
        s0 s0Var = new s0(context);
        this.e = s0Var;
        s0Var.setLines(1);
        s0Var.setSingleLine();
        s0Var.setTextColor(-1);
        s0Var.setTextSize(1, 14.0f);
        s0Var.setTypeface(AndroidUtilities.bold());
        r0Var.addView(s0Var, gb1.x(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(w0 w0Var) {
        this.f = w0Var;
        long j10 = w0Var.b;
        org.telegram.ui.Components.y9 y9Var = this.b;
        org.telegram.ui.Components.j9 j9Var = this.c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(w0Var.b));
            j9Var.r(user);
            y9Var.f(user, j9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-w0Var.b));
            j9Var.q(chat);
            y9Var.f(chat, j9Var);
        }
        int i10 = w0Var.e;
        ImageView imageView = this.d;
        if (i10 > 0) {
            imageView.setImageDrawable(new m0(getContext(), w0Var.e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e.setText(DialogObject.getName(w0Var.b));
        this.a.invalidate();
    }
}
