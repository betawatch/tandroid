// default package

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class oo2 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ fn7 c;

    public /* synthetic */ oo2(fn7 fn7Var, boolean z, byte b) {
        this.a = b;
        this.c = fn7Var;
        this.b = z;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        qma qmaVar;
        TLRPC.PhotoSize w;
        byte b = this.a;
        int i = 0;
        boolean z = this.b;
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                xo2 xo2Var = (xo2) fn7Var;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    gp2.f(new d31((FrameLayout) xo2Var.b, xo2Var.J0), 1, z);
                    xo2Var.n1.F(0);
                    break;
                } else {
                    boolean equals = TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text);
                    ViewGroup viewGroup = xo2Var.b;
                    if (!equals) {
                        ik8.u((FrameLayout) viewGroup, xo2Var.J0, tL_error, false);
                        break;
                    } else {
                        gp2.f(new d31((FrameLayout) viewGroup, xo2Var.J0), 2, z);
                        xo2Var.n1.F(0);
                        break;
                    }
                }
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) fn7Var;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                RectF rectF = ProfileActivity.Z6;
                if (!profileActivity.V1()) {
                    if (d31.a(profileActivity)) {
                        if (num.intValue() == 1) {
                            d31.l(null, profileActivity, z).j();
                        } else if (num.intValue() == 2) {
                            d31.l(wf3.s(profileActivity.e1), profileActivity, z).j();
                        } else if (tL_error2 != null) {
                            d31.e0(tL_error2);
                        }
                    }
                    c34 c34Var = profileActivity.Y1;
                    if (c34Var != null) {
                        c34Var.i();
                        break;
                    }
                }
                break;
            default:
                sbb sbbVar = (sbb) fn7Var;
                Bitmap bitmap = (Bitmap) obj2;
                int i2 = sbbVar.c;
                if (obj != null && sbbVar.q2 == null && !sbbVar.X && sbbVar.H()) {
                    if (!z) {
                        sbbVar.h0(false, true);
                        sbbVar.R0.a(sbbVar.P1);
                        u59 u59Var = sbbVar.P0;
                        boolean z2 = sbbVar.P1 == 1;
                        u59Var.o0 = -1.0f;
                        u59Var.p0 = z2;
                        u59Var.invalidate();
                        sbbVar.c(false);
                        boolean z3 = obj instanceof no6;
                        if (!z3) {
                            if (obj instanceof c8b) {
                                c8b c8bVar = (c8b) obj;
                                if (c8bVar.L == null && !c8bVar.v()) {
                                    sbbVar.f1.c("Failed to load draft");
                                    uc7.s1(i2).O1().w.b(c8bVar);
                                    break;
                                } else {
                                    c8bVar.J0 = sbbVar.w0;
                                    c8bVar.K0 = sbbVar.x0;
                                    sbbVar.P1 = c8bVar.K ? 1 : 0;
                                    c8bVar.M0 = bitmap;
                                    sbbVar.M1 = false;
                                    sbbVar.B0.n(c8bVar);
                                    sbbVar.L1 = c8bVar;
                                    if (z3) {
                                        y9b.a(i2, c8bVar);
                                    }
                                    sbbVar.I(1, true);
                                }
                            }
                        } else {
                            no6 no6Var = (no6) obj;
                            if (no6Var.b && !no6Var.d()) {
                                i = 1;
                            }
                            sbbVar.P1 = i;
                            c8b l = c8b.l(no6Var);
                            l.M0 = bitmap;
                            l.J0 = sbbVar.w0;
                            l.K0 = sbbVar.x0;
                            l.z();
                            sbbVar.M1 = true;
                            if (sbbVar.B0.i()) {
                                sbbVar.H1 = null;
                                l.P = 1.0f;
                                if (sbbVar.B0.l(l)) {
                                    sbbVar.L1 = c8b.a(sbbVar.B0.getLayout(), sbbVar.B0.getContent());
                                }
                                sbbVar.l0(true);
                            } else {
                                l.A();
                                sbbVar.L1 = l;
                                if (z3) {
                                    y9b.a(i2, l);
                                }
                                sbbVar.I(1, true);
                            }
                        }
                    } else if (sbbVar.L1 != null) {
                        sbbVar.s();
                        sbbVar.L1.j = true;
                        if (obj instanceof no6) {
                            wab wabVar = sbbVar.w1;
                            wabVar.a0(wabVar.h0(((no6) obj).I, false));
                        } else if (obj instanceof TLObject) {
                            wab wabVar2 = sbbVar.w1;
                            TLObject tLObject = (TLObject) obj;
                            wabVar2.Z1 = true;
                            zw7 zw7Var = wabVar2.B0;
                            float f = (!(tLObject instanceof TLRPC.Photo) || (w = xb4.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false)) == null) ? 1.0f : w.w / w.h;
                            if (f > 1.0f) {
                                float floor = (float) Math.floor(Math.max(wabVar2.B1, zw7Var.getMeasuredWidth()) * 0.5d);
                                qmaVar = new qma(floor, floor / f);
                            } else {
                                float floor2 = (float) Math.floor(Math.max(wabVar2.C1, zw7Var.getMeasuredHeight()) * 0.5d);
                                qmaVar = new qma(f * floor2, floor2);
                            }
                            v98 v98Var = new v98(wabVar2.getContext(), wabVar2.b0(), qmaVar, tLObject);
                            v98Var.setDelegate(wabVar2);
                            zw7Var.addView(v98Var);
                            wabVar2.c0();
                            wabVar2.a0(v98Var);
                        }
                        sbbVar.c(false);
                    }
                    zt4 zt4Var = sbbVar.N0;
                    if (zt4Var != null) {
                        sbbVar.m2 = zt4Var.e.d0();
                        sbbVar.n2 = sbbVar.N0.getSelectedAlbum();
                        break;
                    }
                }
                break;
        }
    }
}
