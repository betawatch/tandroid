// default package

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class af4 extends kf4 {
    public final /* synthetic */ bf4 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af4(bf4 bf4Var, Context context, int i, int i2) {
        super(context, null, i, i2);
        this.F = bf4Var;
    }

    @Override // kf4
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        cf4 cf4Var = this.F.d;
        cf4Var.U1.remove(tL_exportedChatlistInvite);
        cf4Var.b1();
        cf4Var.c1(true);
    }

    @Override // kf4
    public final void c() {
        bu5 G = bu5.G(this.F.d.c, null, this);
        final byte b = 0;
        G.b(R.drawable.msg_copy, jb6.M0(2131751699, null), new Runnable(this) { // from class: ze4
            public final /* synthetic */ af4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                af4 af4Var = this.b;
                switch (b2) {
                    case 0:
                        String str = af4Var.y;
                        if (str != null && gm.g(str)) {
                            new c41(af4Var.F.d.V1, null).k(false).j();
                            break;
                        }
                        break;
                    case 1:
                        af4Var.d();
                        break;
                    default:
                        af4Var.a();
                        break;
                }
            }
        }, false);
        final byte b2 = 1;
        G.b(R.drawable.msg_qrcode, jb6.M0(2131750405, null), new Runnable(this) { // from class: ze4
            public final /* synthetic */ af4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                af4 af4Var = this.b;
                switch (b22) {
                    case 0:
                        String str = af4Var.y;
                        if (str != null && gm.g(str)) {
                            new c41(af4Var.F.d.V1, null).k(false).j();
                            break;
                        }
                        break;
                    case 1:
                        af4Var.d();
                        break;
                    default:
                        af4Var.a();
                        break;
                }
            }
        }, false);
        final byte b3 = 2;
        G.b(R.drawable.msg_delete, jb6.M0(2131751471, null), new Runnable(this) { // from class: ze4
            public final /* synthetic */ af4 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b3;
                af4 af4Var = this.b;
                switch (b22) {
                    case 0:
                        String str = af4Var.y;
                        if (str != null && gm.g(str)) {
                            new c41(af4Var.F.d.V1, null).k(false).j();
                            break;
                        }
                        break;
                    case 1:
                        af4Var.d();
                        break;
                    default:
                        af4Var.a();
                        break;
                }
            }
        }, true);
        if (jb6.a0) {
            G.i = (byte) 3;
        }
        G.a0();
    }
}
