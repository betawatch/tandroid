// default package

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ad4 extends jd4 {
    public final /* synthetic */ bd4 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad4(bd4 bd4Var, Context context, int i, int i2) {
        super(context, null, i, i2);
        this.F = bd4Var;
    }

    @Override // jd4
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        cd4 cd4Var = this.F.d;
        cd4Var.U1.remove(tL_exportedChatlistInvite);
        cd4Var.b1();
        cd4Var.c1(true);
    }

    @Override // jd4
    public final void c() {
        cs5 G = cs5.G(this.F.d.c, null, this);
        final byte b = 0;
        G.b(R.drawable.msg_copy, k96.M0(2131751750, null), new Runnable(this) { // from class: zc4
            public final /* synthetic */ ad4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                ad4 ad4Var = this.b;
                switch (b2) {
                    case 0:
                        String str = ad4Var.y;
                        if (str != null && gl.g(str)) {
                            new u21(ad4Var.F.d.V1, null).k(false).j();
                            break;
                        }
                        break;
                    case 1:
                        ad4Var.d();
                        break;
                    default:
                        ad4Var.a();
                        break;
                }
            }
        }, false);
        final byte b2 = 1;
        G.b(R.drawable.msg_qrcode, k96.M0(2131750456, null), new Runnable(this) { // from class: zc4
            public final /* synthetic */ ad4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                ad4 ad4Var = this.b;
                switch (b22) {
                    case 0:
                        String str = ad4Var.y;
                        if (str != null && gl.g(str)) {
                            new u21(ad4Var.F.d.V1, null).k(false).j();
                            break;
                        }
                        break;
                    case 1:
                        ad4Var.d();
                        break;
                    default:
                        ad4Var.a();
                        break;
                }
            }
        }, false);
        final byte b3 = 2;
        G.b(R.drawable.msg_delete, k96.M0(2131751522, null), new Runnable(this) { // from class: zc4
            public final /* synthetic */ ad4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b3;
                ad4 ad4Var = this.b;
                switch (b22) {
                    case 0:
                        String str = ad4Var.y;
                        if (str != null && gl.g(str)) {
                            new u21(ad4Var.F.d.V1, null).k(false).j();
                            break;
                        }
                        break;
                    case 1:
                        ad4Var.d();
                        break;
                    default:
                        ad4Var.a();
                        break;
                }
            }
        }, true);
        if (k96.a0) {
            G.i = (byte) 3;
        }
        G.a0();
    }
}
