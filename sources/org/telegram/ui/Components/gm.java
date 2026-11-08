package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gm implements bj0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gm(bn bnVar, org.telegram.ui.ActionBar.f6 f6Var, di diVar, Context context) {
        this.c = bnVar;
        this.b = f6Var;
        this.d = diVar;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i10 = this.a;
        int i11 = 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                bn bnVar = (bn) obj3;
                di diVar = (di) obj2;
                Context context = (Context) obj;
                y20 y20Var = bnVar.D;
                boolean[] zArr = bnVar.L;
                bg.w0 w0Var = bnVar.N0;
                qm qmVar = bnVar.w;
                org.telegram.ui.l4 l4Var = bnVar.r;
                org.telegram.ui.e61 e61Var = bnVar.s;
                int i12 = bnVar.L0;
                org.telegram.ui.ActionBar.f6 f6Var = this.b;
                if (i7 == i12) {
                    vh.g gVar = new vh.g(bnVar.getContext(), f6Var);
                    gVar.c2 = new gf.g(bnVar, 29);
                    ArrayList arrayList = bnVar.P0;
                    gVar.U1 = null;
                    gVar.g2 = new HashSet(arrayList);
                    gVar.show();
                    break;
                } else {
                    int i13 = 5;
                    if (i7 == bnVar.I0) {
                        k60 F = k60.F(diVar.c, f6Var, view);
                        int i14 = 0;
                        while (true) {
                            int[] iArr = bnVar.T0;
                            if (i14 >= iArr.length) {
                                F.c(R.drawable.msg_customize, org.telegram.messenger.id.M0(2131747132, null), new org.telegram.ui.m6(bnVar, context, view, f6Var, 18), false);
                                F.t = false;
                                F.s = 0;
                                F.Z();
                                break;
                            } else {
                                int i15 = iArr[i14];
                                a01 a10 = a01.a(i15);
                                int i16 = org.telegram.ui.ActionBar.k6.F8;
                                org.telegram.ui.ActionBar.r6.y(bnVar, a10, i16, f6Var, PorterDuff.Mode.SRC_IN);
                                F.b(0, a10, org.telegram.messenger.id.G(i15 / 3600, "Hours", new Object[0]), i16, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.q8(bnVar, i15, view, i13));
                                i14++;
                            }
                        }
                    } else if (i7 == bnVar.u0) {
                        bnVar.T();
                        break;
                    } else {
                        boolean z12 = view instanceof org.telegram.ui.Cells.r8;
                        if (z12 || (view instanceof org.telegram.ui.Cells.x5)) {
                            boolean z13 = bnVar.c0;
                            sm smVar = bnVar.y;
                            if (smVar != null) {
                                smVar.f();
                            }
                            bg.w0[] w0VarArr = bnVar.O0;
                            int length = w0VarArr.length;
                            int i17 = 0;
                            while (true) {
                                if (i17 < length) {
                                    bg.w0 w0Var2 = w0VarArr[i17];
                                    if (i7 == w0Var2.b) {
                                        boolean z14 = w0Var2.a;
                                        z10 = !z14;
                                        w0Var2.a = z10;
                                        int i18 = w0Var.b;
                                        bn bnVar2 = (bn) w0Var.c;
                                        org.telegram.ui.l4 l4Var2 = bnVar2.r;
                                        if (i7 == i18) {
                                            e61Var.setItemAnimator(qmVar);
                                            int i19 = w0Var.b;
                                            if (i19 >= 0) {
                                                v4.d1 K = bnVar2.s.K(i19);
                                                if (K != null) {
                                                    View view2 = K.a;
                                                    if (view2 instanceof org.telegram.ui.Cells.x5) {
                                                        ((org.telegram.ui.Cells.x5) view2).setDivider(z10);
                                                    }
                                                }
                                                l4Var2.g(w0Var.b);
                                            }
                                            if (z14) {
                                                z9 = true;
                                                l4Var2.p(w0Var.b + 1, 1);
                                            } else {
                                                z9 = true;
                                                l4Var2.o(w0Var.b + 1, 1);
                                            }
                                            bnVar.n0();
                                        } else {
                                            z9 = true;
                                        }
                                        z11 = z9;
                                    } else {
                                        i17++;
                                    }
                                } else {
                                    z9 = true;
                                    z10 = false;
                                    z11 = false;
                                }
                            }
                            if (!z11) {
                                if (i7 == bnVar.B0) {
                                    z10 = bnVar.a0;
                                    bnVar.a0 = !z10;
                                    bnVar.V();
                                } else {
                                    int i20 = bnVar.y0;
                                    if (i7 == i20) {
                                        z10 = !bnVar.f0;
                                        bnVar.f0 = z10;
                                    } else if (i7 == bnVar.C0) {
                                        if (!bnVar.c0 && !bnVar.a0) {
                                            bnVar.T ^= z9;
                                        }
                                        z10 = bnVar.T;
                                    } else if (i7 == bnVar.E0) {
                                        z10 = !bnVar.S;
                                        bnVar.S = z10;
                                    } else if (i7 == bnVar.H0) {
                                        if (bnVar.U == 0 && bnVar.V == 0) {
                                            bnVar.U = 86400;
                                            bnVar.V = 0;
                                            int i21 = bnVar.I0;
                                            bnVar.n0();
                                            if (i21 < 0) {
                                                v4.d1 K2 = e61Var.K(bnVar.H0);
                                                if (K2 != null) {
                                                    View view3 = K2.a;
                                                    if (view3 instanceof org.telegram.ui.Cells.x5) {
                                                        ((org.telegram.ui.Cells.x5) view3).setDivider(z9);
                                                    }
                                                }
                                                e61Var.setItemAnimator(qmVar);
                                                l4Var.o(bnVar.I0, 3);
                                            }
                                        } else {
                                            bnVar.U = 0;
                                            bnVar.V = 0;
                                            int i22 = bnVar.I0;
                                            bnVar.n0();
                                            e61Var.setItemAnimator(qmVar);
                                            l4Var.p(i22, 3);
                                            v4.d1 K3 = e61Var.K(bnVar.H0);
                                            if (K3 != null) {
                                                View view4 = K3.a;
                                                if (view4 instanceof org.telegram.ui.Cells.x5) {
                                                    ((org.telegram.ui.Cells.x5) view4).setDivider(false);
                                                }
                                            }
                                        }
                                        z10 = (bnVar.U == 0 && bnVar.V == 0) ? false : z9;
                                    } else if (i7 == bnVar.D0) {
                                        z10 = !bnVar.R;
                                        bnVar.R = z10;
                                    } else if (i7 == bnVar.z0) {
                                        z10 = bnVar.g0 ^ z9;
                                        bnVar.g0 = z10;
                                        bnVar.n0();
                                        int i23 = bnVar.y0;
                                        if (i23 >= 0 && i20 < 0) {
                                            e61Var.setItemAnimator(qmVar);
                                            l4Var.i(bnVar.y0);
                                        } else if (i20 >= 0 && i23 < 0) {
                                            e61Var.setItemAnimator(qmVar);
                                            l4Var.s(i20);
                                        }
                                    } else if (i7 == bnVar.F0) {
                                        boolean z15 = bnVar.b0;
                                        z10 = !z15;
                                        bnVar.b0 = z10;
                                        if (z15 && bnVar.c0) {
                                            boolean z16 = false;
                                            for (int i24 = 0; i24 < zArr.length; i24++) {
                                                if (z16) {
                                                    zArr[i24] = false;
                                                } else if (zArr[i24]) {
                                                    z16 = z9;
                                                }
                                            }
                                        }
                                        int childCount = e61Var.getChildCount();
                                        for (int i25 = 0; i25 < childCount; i25++) {
                                            v4.d1 T = e61Var.T(e61Var.getChildAt(i25));
                                            if (T.f == 5) {
                                                ((org.telegram.ui.Cells.a6) T.a).a.a(bnVar.b0, z9);
                                            }
                                        }
                                    } else if (i7 == bnVar.J0) {
                                        z10 = !bnVar.W;
                                        bnVar.W = z10;
                                    } else if (i7 == bnVar.G0) {
                                        if (!bnVar.e0) {
                                            e61Var.setItemAnimator(qmVar);
                                            z10 = !bnVar.c0;
                                            bnVar.c0 = z10;
                                            int i26 = bnVar.o0;
                                            bnVar.n0();
                                            if (bnVar.c0) {
                                                l4Var.o(bnVar.o0, 3);
                                            } else {
                                                l4Var.p(i26, 3);
                                            }
                                            l4Var.g(bnVar.A0);
                                            if (bnVar.c0) {
                                                bnVar.R = false;
                                                int i27 = bnVar.D0;
                                                if (i27 >= 0) {
                                                    v4.d1 K4 = e61Var.K(i27);
                                                    if (K4 != null) {
                                                        ((org.telegram.ui.Cells.x5) K4.a).setChecked(false);
                                                    } else {
                                                        l4Var.g(bnVar.D0);
                                                    }
                                                }
                                            } else {
                                                int i28 = bnVar.D0;
                                                if (i28 >= 0 && e61Var.K(i28) == null) {
                                                    l4Var.g(bnVar.D0);
                                                }
                                            }
                                            bnVar.V();
                                            if (bnVar.c0 && !bnVar.b0) {
                                                boolean z17 = false;
                                                for (int i29 = 0; i29 < zArr.length; i29++) {
                                                    if (z17) {
                                                        zArr[i29] = false;
                                                    } else if (zArr[i29]) {
                                                        z17 = z9;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (bnVar.d0 && !bnVar.c0) {
                                e61Var.getChildCount();
                                y20Var.a();
                            }
                            for (int i30 = bnVar.t0; i30 < bnVar.t0 + bnVar.M; i30++) {
                                v4.d1 K5 = e61Var.K(i30);
                                if (K5 != null) {
                                    View view5 = K5.a;
                                    if (view5 instanceof org.telegram.ui.Cells.a6) {
                                        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view5;
                                        a6Var.m(bnVar.c0, z9);
                                        a6Var.r.a(zArr[i30 - bnVar.t0], z13);
                                        if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == bnVar.G0 && !bnVar.d0) {
                                            y20Var.setText(org.telegram.messenger.id.M0(2131747156, null));
                                            y20Var.c(a6Var.getCheckBox());
                                            bnVar.d0 = z9;
                                        }
                                    }
                                }
                            }
                            if (z12) {
                                ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                            } else if (view instanceof org.telegram.ui.Cells.x5) {
                                ((org.telegram.ui.Cells.x5) view).setChecked(z10);
                            }
                            bnVar.X();
                            break;
                        }
                    }
                }
                break;
            default:
                ru ruVar = (ru) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                du duVar = ruVar.l1;
                if (arrayList2 == null || arrayList2.size() <= 1) {
                    org.telegram.ui.ActionBar.g1 g1Var = ruVar.x1;
                    if (g1Var != null) {
                        g1Var.d(true);
                        ruVar.x1 = null;
                        break;
                    } else if ((f2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var).Z.getVisibility() == 0 && (view instanceof ku)) {
                        r5 r5Var = ((ku) view).c;
                        try {
                            TLRPC.Document document = r5Var.document;
                            if (document == null) {
                                document = i5.e(ruVar.a, r5Var.getDocumentId());
                            }
                            SpannableString spannableString = new SpannableString(org.telegram.messenger.ij.U(document));
                            spannableString.setSpan(r5Var, 0, spannableString.length(), 33);
                            ((org.telegram.ui.an) f2Var).Z.E0.getText().append((CharSequence) spannableString);
                            ruVar.L0();
                            ruVar.dismiss();
                        } catch (Exception unused) {
                        }
                        try {
                            view.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                } else if (SystemClock.elapsedRealtime() - ruVar.H1 >= 250) {
                    int i31 = 0;
                    while (true) {
                        ArrayList[] arrayListArr = duVar.c;
                        if (i11 < arrayListArr.length) {
                            int size = arrayListArr[i11].size();
                            if (duVar.c.length > 1) {
                                size = Math.min(ruVar.u1.J * 2, size);
                            }
                            i31 += size + 2;
                            if (i7 >= i31) {
                                i11++;
                            }
                        }
                    }
                    ArrayList arrayList3 = duVar.b;
                    if (arrayList3 != null && i11 < arrayList3.size()) {
                        tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) duVar.b.get(i11);
                    }
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                        ArrayList arrayList4 = new ArrayList();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList4.add(tL_inputStickerSetID);
                        new eu(ruVar, f2Var, ruVar.getContext(), this.b, arrayList4).show();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ gm(ru ruVar, ArrayList arrayList, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.c = ruVar;
        this.d = arrayList;
        this.e = f2Var;
        this.b = f6Var;
    }
}
