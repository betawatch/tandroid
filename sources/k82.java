// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class k82 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p82 b;

    public /* synthetic */ k82(p82 p82Var, byte b) {
        this.a = b;
        this.b = p82Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        p82 p82Var = this.b;
        switch (b) {
            case 0:
                p82Var.k0();
                break;
            case 1:
                p82Var.j0();
                break;
            case 2:
                p82Var.b.dismiss();
                p82Var.finishFragment();
                break;
            case 3:
                p82Var.N.setChecked(p82Var.x0.autotranslation);
                break;
            default:
                p82Var.e.setImageDrawable(p82Var.r);
                p82Var.c0.o(R.drawable.msg_addphoto, k96.M0(2131752200, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = p82Var.D0;
                if (user != null) {
                    user.photo = null;
                    p82Var.getMessagesController().Z3(p82Var.D0, true, false);
                }
                p82Var.P0 = true;
                if (p82Var.S0 == null) {
                    p82Var.S0 = new oy8(R.raw.camera_outline, gl.L(50.0f), gl.L(50.0f), false, null);
                }
                p82Var.c0.e.setTranslationX(-gl.L(8.0f));
                p82Var.c0.e.setAnimation(p82Var.S0);
                break;
        }
    }
}
