// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class b92 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g92 b;

    public /* synthetic */ b92(g92 g92Var, byte b) {
        this.a = b;
        this.b = g92Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        g92 g92Var = this.b;
        switch (b) {
            case 0:
                g92Var.k0();
                break;
            case 1:
                g92Var.j0();
                break;
            case 2:
                g92Var.b.dismiss();
                g92Var.finishFragment();
                break;
            case 3:
                g92Var.N.setChecked(g92Var.x0.autotranslation);
                break;
            default:
                g92Var.e.setImageDrawable(g92Var.r);
                g92Var.c0.o(R.drawable.msg_addphoto, ob6.M0(2131752177, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = g92Var.D0;
                if (user != null) {
                    user.photo = null;
                    g92Var.getMessagesController().i4(g92Var.D0, true, false);
                }
                g92Var.P0 = true;
                if (g92Var.S0 == null) {
                    g92Var.S0 = new b29(R.raw.camera_outline, hl.L(50.0f), hl.L(50.0f), false, null);
                }
                g92Var.c0.e.setTranslationX(-hl.L(8.0f));
                g92Var.c0.e.setAnimation(g92Var.S0);
                break;
        }
    }
}
