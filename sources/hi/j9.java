package hi;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.ef;
import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j9 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ fs c;

    public /* synthetic */ j9(fs fsVar, boolean z10, int i7) {
        this.a = i7;
        this.c = fsVar;
        this.b = z10;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        yt0 yt0Var;
        TLRPC.PhotoSize w10;
        int i7 = this.a;
        int i10 = 0;
        boolean z10 = this.b;
        fs fsVar = this.c;
        switch (i7) {
            case 0:
                sa saVar = (sa) fsVar;
                Bitmap bitmap = (Bitmap) obj2;
                int i11 = saVar.c;
                if (obj != null && saVar.q2 == null && !saVar.X && saVar.I()) {
                    if (!z10) {
                        saVar.h0(false, true);
                        saVar.R0.a(saVar.P1);
                        d6 d6Var = saVar.P0;
                        boolean z11 = saVar.P1 == 1;
                        d6Var.o0 = -1.0f;
                        d6Var.p0 = z11;
                        d6Var.invalidate();
                        saVar.e(false);
                        boolean z12 = obj instanceof ef;
                        if (!z12) {
                            if (obj instanceof c7) {
                                c7 c7Var = (c7) obj;
                                if (c7Var.L == null && !c7Var.v()) {
                                    saVar.f1.c("Failed to load draft");
                                    mp.u1(i11).R1().w.b(c7Var);
                                    break;
                                } else {
                                    c7Var.J0 = saVar.w0;
                                    c7Var.K0 = saVar.x0;
                                    saVar.P1 = c7Var.K ? 1 : 0;
                                    c7Var.M0 = bitmap;
                                    saVar.M1 = false;
                                    saVar.B0.n(c7Var);
                                    saVar.L1 = c7Var;
                                    if (z12) {
                                        q8.a(i11, c7Var);
                                    }
                                    saVar.J(1, true);
                                }
                            }
                        } else {
                            ef efVar = (ef) obj;
                            if (efVar.b && !efVar.d()) {
                                i10 = 1;
                            }
                            saVar.P1 = i10;
                            c7 l10 = c7.l(efVar);
                            l10.M0 = bitmap;
                            l10.J0 = saVar.w0;
                            l10.K0 = saVar.x0;
                            l10.A();
                            saVar.M1 = true;
                            if (saVar.B0.j()) {
                                saVar.H1 = null;
                                l10.P = 1.0f;
                                if (saVar.B0.l(l10)) {
                                    saVar.L1 = c7.a(saVar.B0.getLayout(), saVar.B0.getContent());
                                }
                                saVar.l0(true);
                            } else {
                                l10.B();
                                saVar.L1 = l10;
                                if (z12) {
                                    q8.a(i11, l10);
                                }
                                saVar.J(1, true);
                            }
                        }
                    } else if (saVar.L1 != null) {
                        saVar.t();
                        saVar.L1.j = true;
                        if (obj instanceof ef) {
                            u9 u9Var = saVar.w1;
                            u9Var.b0(u9Var.h0(((ef) obj).I, false));
                        } else if (obj instanceof TLObject) {
                            u9 u9Var2 = saVar.w1;
                            TLObject tLObject = (TLObject) obj;
                            u9Var2.V1 = true;
                            f5 f5Var = u9Var2.B0;
                            float f10 = (!(tLObject instanceof TLRPC.Photo) || (w10 = org.telegram.messenger.w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false)) == null) ? 1.0f : w10.w / w10.h;
                            if (f10 > 1.0f) {
                                float floor = (float) Math.floor(Math.max(u9Var2.B1, f5Var.getMeasuredWidth()) * 0.5d);
                                yt0Var = new yt0(floor, floor / f10);
                            } else {
                                float floor2 = (float) Math.floor(Math.max(u9Var2.C1, f5Var.getMeasuredHeight()) * 0.5d);
                                yt0Var = new yt0(f10 * floor2, floor2);
                            }
                            tg.p1 p1Var = new tg.p1(u9Var2.getContext(), u9Var2.c0(), yt0Var, tLObject);
                            p1Var.setDelegate(u9Var2);
                            f5Var.addView(p1Var);
                            u9Var2.d0();
                            u9Var2.b0(p1Var);
                        }
                        saVar.e(false);
                    }
                    g3 g3Var = saVar.N0;
                    if (g3Var != null) {
                        saVar.m2 = g3Var.e.e0();
                        saVar.n2 = saVar.N0.getSelectedAlbum();
                        break;
                    }
                }
                break;
            case 1:
                li.d0 d0Var = (li.d0) fsVar;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    li.l0.f(new lc((FrameLayout) d0Var.b, d0Var.J0), 1, z10);
                    d0Var.o1.A(0);
                    break;
                } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                    org.telegram.ui.Cells.c0.t((FrameLayout) d0Var.b, d0Var.J0, tL_error, false);
                    break;
                } else {
                    li.l0.f(new lc((FrameLayout) d0Var.b, d0Var.J0), 2, z10);
                    d0Var.o1.A(0);
                    break;
                }
            default:
                ProfileActivity profileActivity = (ProfileActivity) fsVar;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                RectF rectF = ProfileActivity.Z6;
                if (!profileActivity.c4()) {
                    if (lc.a(profileActivity)) {
                        if (num.intValue() == 1) {
                            lc.l(null, profileActivity, z10).j();
                        } else if (num.intValue() == 2) {
                            lc.l(org.telegram.messenger.n5.t(profileActivity.e1), profileActivity, z10).j();
                        } else if (tL_error2 != null) {
                            lc.e0(tL_error2);
                        }
                    }
                    org.telegram.messenger.n6 n6Var = profileActivity.Y1;
                    if (n6Var != null) {
                        n6Var.g();
                        break;
                    }
                }
                break;
        }
    }
}
