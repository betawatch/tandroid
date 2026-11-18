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
import org.telegram.ui.Components.vt0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class k9 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ fs c;

    public /* synthetic */ k9(fs fsVar, boolean z10, int i7) {
        this.a = i7;
        this.c = fsVar;
        this.b = z10;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        vt0 vt0Var;
        TLRPC.PhotoSize w10;
        int i7 = this.a;
        int i10 = 0;
        boolean z10 = this.b;
        fs fsVar = this.c;
        switch (i7) {
            case 0:
                ta taVar = (ta) fsVar;
                Bitmap bitmap = (Bitmap) obj2;
                int i11 = taVar.c;
                if (obj != null && taVar.q2 == null && !taVar.X && taVar.I()) {
                    if (!z10) {
                        taVar.h0(false, true);
                        taVar.R0.a(taVar.P1);
                        e6 e6Var = taVar.P0;
                        boolean z11 = taVar.P1 == 1;
                        e6Var.o0 = -1.0f;
                        e6Var.p0 = z11;
                        e6Var.invalidate();
                        taVar.e(false);
                        boolean z12 = obj instanceof ef;
                        if (!z12) {
                            if (obj instanceof d7) {
                                d7 d7Var = (d7) obj;
                                if (d7Var.L == null && !d7Var.v()) {
                                    taVar.f1.c("Failed to load draft");
                                    mp.u1(i11).R1().w.b(d7Var);
                                    break;
                                } else {
                                    d7Var.J0 = taVar.w0;
                                    d7Var.K0 = taVar.x0;
                                    taVar.P1 = d7Var.K ? 1 : 0;
                                    d7Var.M0 = bitmap;
                                    taVar.M1 = false;
                                    taVar.B0.n(d7Var);
                                    taVar.L1 = d7Var;
                                    if (z12) {
                                        r8.a(i11, d7Var);
                                    }
                                    taVar.J(1, true);
                                }
                            }
                        } else {
                            ef efVar = (ef) obj;
                            if (efVar.b && !efVar.d()) {
                                i10 = 1;
                            }
                            taVar.P1 = i10;
                            d7 l10 = d7.l(efVar);
                            l10.M0 = bitmap;
                            l10.J0 = taVar.w0;
                            l10.K0 = taVar.x0;
                            l10.A();
                            taVar.M1 = true;
                            if (taVar.B0.j()) {
                                taVar.H1 = null;
                                l10.P = 1.0f;
                                if (taVar.B0.l(l10)) {
                                    taVar.L1 = d7.a(taVar.B0.getLayout(), taVar.B0.getContent());
                                }
                                taVar.l0(true);
                            } else {
                                l10.B();
                                taVar.L1 = l10;
                                if (z12) {
                                    r8.a(i11, l10);
                                }
                                taVar.J(1, true);
                            }
                        }
                    } else if (taVar.L1 != null) {
                        taVar.t();
                        taVar.L1.j = true;
                        if (obj instanceof ef) {
                            v9 v9Var = taVar.w1;
                            v9Var.b0(v9Var.h0(((ef) obj).I, false));
                        } else if (obj instanceof TLObject) {
                            v9 v9Var2 = taVar.w1;
                            TLObject tLObject = (TLObject) obj;
                            v9Var2.V1 = true;
                            g5 g5Var = v9Var2.B0;
                            float f10 = (!(tLObject instanceof TLRPC.Photo) || (w10 = org.telegram.messenger.w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false)) == null) ? 1.0f : w10.w / w10.h;
                            if (f10 > 1.0f) {
                                float floor = (float) Math.floor(Math.max(v9Var2.B1, g5Var.getMeasuredWidth()) * 0.5d);
                                vt0Var = new vt0(floor, floor / f10);
                            } else {
                                float floor2 = (float) Math.floor(Math.max(v9Var2.C1, g5Var.getMeasuredHeight()) * 0.5d);
                                vt0Var = new vt0(f10 * floor2, floor2);
                            }
                            tg.n1 n1Var = new tg.n1(v9Var2.getContext(), v9Var2.c0(), vt0Var, tLObject);
                            n1Var.setDelegate(v9Var2);
                            g5Var.addView(n1Var);
                            v9Var2.d0();
                            v9Var2.b0(n1Var);
                        }
                        taVar.e(false);
                    }
                    h3 h3Var = taVar.N0;
                    if (h3Var != null) {
                        taVar.m2 = h3Var.e.e0();
                        taVar.n2 = taVar.N0.getSelectedAlbum();
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
