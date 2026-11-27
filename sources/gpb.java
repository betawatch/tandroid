// default package

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gpb implements on5, s69, ovc, fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pqb b;

    public /* synthetic */ gpb(pqb pqbVar, byte b) {
        this.a = b;
        this.b = pqbVar;
    }

    @Override // s69
    public final boolean C(View view) {
        return false;
    }

    @Override // s69
    public final void d(float f, float f2, int i, View view) {
        if (view instanceof wb2) {
            wb2 wb2Var = (wb2) view;
            boolean E2 = wb2Var.E2(f);
            pqb pqbVar = this.b;
            if (!E2) {
                pqbVar.d1(2, true);
            } else if (wb2Var.getMessageObject().O3()) {
                pqbVar.d1(3, true);
            } else {
                pqbVar.d1(1, true);
            }
        }
    }

    @Override // ovc
    public final void e(int i, int i2) {
        pqb pqbVar = this.b;
        if (pqbVar.G1) {
            pqbVar.z0.getBackground();
            float scaleX = pqbVar.D0 != null ? (pqbVar.z0.getScaleX() - 1.0f) / (pqbVar.A1 - 1.0f) : 1.0f;
            pqbVar.z0.setTranslationX(i * scaleX);
            pqbVar.z0.setTranslationY(i2 * scaleX);
        }
    }

    @Override // on5
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        pqb pqbVar = this.b;
        if (pqbVar.D1 instanceof yvc) {
            return;
        }
        Drawable t = imageReceiver.t();
        if (!z || t == null) {
            return;
        }
        rpb rpbVar = pqbVar.a;
        hl.q(t);
        rpbVar.k(pqbVar.Q0(t), t, Float.valueOf(pqbVar.n1));
        if (!z2 && pqbVar.H1 && pqbVar.y1 == null) {
            pqbVar.z0.getImageReceiver().B0 = false;
            pqbVar.n1();
            pqbVar.z0.getImageReceiver().B0 = true;
        }
        pqbVar.X0();
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        pqb pqbVar = this.b;
        switch (b) {
            case 3:
                pqbVar.u0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                pqbVar.P0(false);
                break;
            case 5:
                ynb ynbVar = pqbVar.w;
                if (ynbVar.j == 4294967296L) {
                    ynbVar.j = 0L;
                    ynbVar.k = 0L;
                    ynbVar.l = 0L;
                    ynbVar.m = 0L;
                    pqbVar.r1(false);
                    aob.r1(false, false);
                }
                pqbVar.x = true;
                aob.t1(true);
                pqbVar.d1(2, false);
                break;
            case 6:
                ynb ynbVar2 = pqbVar.w;
                if (aob.a1() && aob.I.j0.d != 0) {
                    unb unbVar = ynbVar2.y;
                    ynbVar2.j = unbVar.d;
                    ynbVar2.k = unbVar.e;
                    ynbVar2.l = unbVar.f;
                    ynbVar2.m = unbVar.g;
                    ynbVar2.n = unbVar.h;
                    String str = unbVar.c;
                    ynbVar2.o = str;
                    float f = unbVar.k;
                    ynbVar2.p = f;
                    pqbVar.n1 = f;
                    if (str == null || "c".equals(str)) {
                        pqbVar.Y0 = null;
                    } else {
                        int size = pqbVar.W0.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) pqbVar.W0.get(i2);
                                if (tL_wallPaper.pattern && ynbVar2.o.equals(tL_wallPaper.slug)) {
                                    pqbVar.Y0 = tL_wallPaper;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                    pqbVar.x = true;
                    pqbVar.L0[1].a(pqbVar.Y0 != null, true);
                    pqbVar.r1(false);
                    aob.r1(false, false);
                }
                Drawable background = pqbVar.z0.getBackground();
                if (background instanceof hh7) {
                    hh7 hh7Var = (hh7) background;
                    hh7Var.r(100, null);
                    boolean o = aob.I.o();
                    float f2 = pqbVar.n1;
                    if (o) {
                        if (f2 < 0.0f) {
                            pqbVar.z0.getImageReceiver().W(hh7Var.k);
                        }
                        bz0 bz0Var = pqbVar.V0;
                        if (bz0Var != null) {
                            bz0Var.setTwoSided(true);
                        }
                    } else if (f2 < 0.0f) {
                        pqbVar.n1 = -f2;
                    }
                }
                bz0 bz0Var2 = pqbVar.V0;
                if (bz0Var2 != null) {
                    bz0Var2.setProgress(pqbVar.n1);
                }
                aob.t1(true);
                pqbVar.d1(2, false);
                break;
            default:
                ynb ynbVar3 = pqbVar.w;
                if (ynbVar3.j == 4294967296L) {
                    ynbVar3.j = 0L;
                    ynbVar3.k = 0L;
                    ynbVar3.l = 0L;
                    ynbVar3.m = 0L;
                    pqbVar.r1(false);
                    aob.r1(false, false);
                }
                pqbVar.x = true;
                aob.t1(true);
                pqbVar.d1(2, false);
                break;
        }
    }

    @Override // on5
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override // on5
    public final void z(int i, Drawable drawable) {
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
    }
}
