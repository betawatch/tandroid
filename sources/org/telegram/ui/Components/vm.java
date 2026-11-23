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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm implements qj0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vm(qn qnVar, org.telegram.ui.ActionBar.i6 i6Var, ti tiVar, Context context) {
        this.c = qnVar;
        this.b = i6Var;
        this.d = tiVar;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void b(int i7, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = this.a;
        int i11 = 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                qn qnVar = (qn) obj3;
                ti tiVar = (ti) obj2;
                Context context = (Context) obj;
                j30 j30Var = qnVar.E;
                boolean[] zArr = qnVar.M;
                bg.w0 w0Var = qnVar.O0;
                fn fnVar = qnVar.w;
                org.telegram.ui.l4 l4Var = qnVar.r;
                org.telegram.ui.d61 d61Var = qnVar.s;
                int i12 = qnVar.M0;
                org.telegram.ui.ActionBar.i6 i6Var = this.b;
                if (i7 == i12) {
                    vh.g gVar = new vh.g(qnVar.getContext(), i6Var);
                    gVar.g2 = new j6.r(qnVar, 27);
                    ArrayList arrayList = qnVar.Q0;
                    gVar.Y1 = null;
                    gVar.k2 = new HashSet(arrayList);
                    gVar.show();
                    break;
                } else if (i7 == qnVar.J0) {
                    x60 G = x60.G(tiVar.c, i6Var, view);
                    int i13 = 0;
                    while (true) {
                        int[] iArr = qnVar.U0;
                        if (i13 >= iArr.length) {
                            G.c(R.drawable.msg_customize, org.telegram.messenger.gd.N0(2131746937, null), new oi.h(qnVar, context, view, i6Var, 26), false);
                            G.t = false;
                            G.s = 0;
                            G.a0();
                            break;
                        } else {
                            int i14 = iArr[i13];
                            k01 a10 = k01.a(i14);
                            int i15 = org.telegram.ui.ActionBar.n6.F8;
                            org.telegram.ui.ActionBar.u6.x(qnVar, a10, i15, i6Var, PorterDuff.Mode.SRC_IN);
                            G.b(0, a10, org.telegram.messenger.gd.G(i14 / 3600, "Hours", new Object[0]), i15, org.telegram.ui.ActionBar.n6.E8, new org.telegram.ui.f0(qnVar, i14, view, 8));
                            i13++;
                        }
                    }
                } else if (i7 == qnVar.v0) {
                    qnVar.U();
                    break;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.r8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.y5)) {
                        boolean z14 = qnVar.d0;
                        hn hnVar = qnVar.y;
                        if (hnVar != null) {
                            hnVar.f();
                        }
                        bg.w0[] w0VarArr = qnVar.P0;
                        int length = w0VarArr.length;
                        int i16 = 0;
                        while (true) {
                            if (i16 < length) {
                                bg.w0 w0Var2 = w0VarArr[i16];
                                if (i7 == w0Var2.b) {
                                    boolean z15 = w0Var2.a;
                                    z11 = !z15;
                                    w0Var2.a = z11;
                                    int i17 = w0Var.b;
                                    qn qnVar2 = (qn) w0Var.c;
                                    org.telegram.ui.l4 l4Var2 = qnVar2.r;
                                    if (i7 == i17) {
                                        d61Var.setItemAnimator(fnVar);
                                        int i18 = w0Var.b;
                                        if (i18 >= 0) {
                                            v4.f1 K = qnVar2.s.K(i18);
                                            if (K != null) {
                                                View view2 = K.a;
                                                if (view2 instanceof org.telegram.ui.Cells.y5) {
                                                    ((org.telegram.ui.Cells.y5) view2).setDivider(z11);
                                                }
                                            }
                                            l4Var2.g(w0Var.b);
                                        }
                                        if (z15) {
                                            z10 = true;
                                            l4Var2.p(w0Var.b + 1, 1);
                                        } else {
                                            z10 = true;
                                            l4Var2.o(w0Var.b + 1, 1);
                                        }
                                        qnVar.n0();
                                    } else {
                                        z10 = true;
                                    }
                                    z12 = z10;
                                } else {
                                    i16++;
                                }
                            } else {
                                z10 = true;
                                z11 = false;
                                z12 = false;
                            }
                        }
                        if (!z12) {
                            if (i7 == qnVar.C0) {
                                z11 = qnVar.b0;
                                qnVar.b0 = !z11;
                                qnVar.W();
                            } else {
                                int i19 = qnVar.z0;
                                if (i7 == i19) {
                                    z11 = !qnVar.g0;
                                    qnVar.g0 = z11;
                                } else if (i7 == qnVar.D0) {
                                    if (!qnVar.d0 && !qnVar.b0) {
                                        qnVar.U ^= z10;
                                    }
                                    z11 = qnVar.U;
                                } else if (i7 == qnVar.F0) {
                                    z11 = !qnVar.T;
                                    qnVar.T = z11;
                                } else if (i7 == qnVar.I0) {
                                    if (qnVar.V == 0 && qnVar.W == 0) {
                                        qnVar.V = 86400;
                                        qnVar.W = 0;
                                        int i20 = qnVar.J0;
                                        qnVar.n0();
                                        if (i20 < 0) {
                                            v4.f1 K2 = d61Var.K(qnVar.I0);
                                            if (K2 != null) {
                                                View view3 = K2.a;
                                                if (view3 instanceof org.telegram.ui.Cells.y5) {
                                                    ((org.telegram.ui.Cells.y5) view3).setDivider(z10);
                                                }
                                            }
                                            d61Var.setItemAnimator(fnVar);
                                            l4Var.o(qnVar.J0, 3);
                                        }
                                    } else {
                                        qnVar.V = 0;
                                        qnVar.W = 0;
                                        int i21 = qnVar.J0;
                                        qnVar.n0();
                                        d61Var.setItemAnimator(fnVar);
                                        l4Var.p(i21, 3);
                                        v4.f1 K3 = d61Var.K(qnVar.I0);
                                        if (K3 != null) {
                                            View view4 = K3.a;
                                            if (view4 instanceof org.telegram.ui.Cells.y5) {
                                                ((org.telegram.ui.Cells.y5) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    z11 = (qnVar.V == 0 && qnVar.W == 0) ? false : z10;
                                } else if (i7 == qnVar.E0) {
                                    z11 = !qnVar.S;
                                    qnVar.S = z11;
                                } else if (i7 == qnVar.A0) {
                                    z11 = qnVar.h0 ^ z10;
                                    qnVar.h0 = z11;
                                    qnVar.n0();
                                    int i22 = qnVar.z0;
                                    if (i22 >= 0 && i19 < 0) {
                                        d61Var.setItemAnimator(fnVar);
                                        l4Var.i(qnVar.z0);
                                    } else if (i19 >= 0 && i22 < 0) {
                                        d61Var.setItemAnimator(fnVar);
                                        l4Var.s(i19);
                                    }
                                } else if (i7 == qnVar.G0) {
                                    boolean z16 = qnVar.c0;
                                    z11 = !z16;
                                    qnVar.c0 = z11;
                                    if (z16 && qnVar.d0) {
                                        boolean z17 = false;
                                        for (int i23 = 0; i23 < zArr.length; i23++) {
                                            if (z17) {
                                                zArr[i23] = false;
                                            } else if (zArr[i23]) {
                                                z17 = z10;
                                            }
                                        }
                                    }
                                    int childCount = d61Var.getChildCount();
                                    for (int i24 = 0; i24 < childCount; i24++) {
                                        v4.f1 T = d61Var.T(d61Var.getChildAt(i24));
                                        if (T.f == 5) {
                                            ((org.telegram.ui.Cells.a6) T.a).a.a(qnVar.c0, z10);
                                        }
                                    }
                                } else if (i7 == qnVar.K0) {
                                    z11 = !qnVar.a0;
                                    qnVar.a0 = z11;
                                } else if (i7 == qnVar.H0) {
                                    if (!qnVar.f0) {
                                        d61Var.setItemAnimator(fnVar);
                                        z11 = !qnVar.d0;
                                        qnVar.d0 = z11;
                                        int i25 = qnVar.p0;
                                        qnVar.n0();
                                        if (qnVar.d0) {
                                            l4Var.o(qnVar.p0, 3);
                                        } else {
                                            l4Var.p(i25, 3);
                                        }
                                        l4Var.g(qnVar.B0);
                                        if (qnVar.d0) {
                                            qnVar.S = false;
                                            int i26 = qnVar.E0;
                                            if (i26 >= 0) {
                                                v4.f1 K4 = d61Var.K(i26);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.y5) K4.a).setChecked(false);
                                                } else {
                                                    l4Var.g(qnVar.E0);
                                                }
                                            }
                                        } else {
                                            int i27 = qnVar.E0;
                                            if (i27 >= 0 && d61Var.K(i27) == null) {
                                                l4Var.g(qnVar.E0);
                                            }
                                        }
                                        qnVar.W();
                                        if (qnVar.d0 && !qnVar.c0) {
                                            boolean z18 = false;
                                            for (int i28 = 0; i28 < zArr.length; i28++) {
                                                if (z18) {
                                                    zArr[i28] = false;
                                                } else if (zArr[i28]) {
                                                    z18 = z10;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (qnVar.e0 && !qnVar.d0) {
                            d61Var.getChildCount();
                            j30Var.a();
                        }
                        for (int i29 = qnVar.u0; i29 < qnVar.u0 + qnVar.N; i29++) {
                            v4.f1 K5 = d61Var.K(i29);
                            if (K5 != null) {
                                View view5 = K5.a;
                                if (view5 instanceof org.telegram.ui.Cells.a6) {
                                    org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view5;
                                    a6Var.n(qnVar.d0, z10);
                                    a6Var.r.a(zArr[i29 - qnVar.u0], z14);
                                    if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == qnVar.H0 && !qnVar.e0) {
                                        j30Var.setText(org.telegram.messenger.gd.N0(2131746961, null));
                                        j30Var.c(a6Var.getCheckBox());
                                        qnVar.e0 = z10;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.r8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.y5) {
                            ((org.telegram.ui.Cells.y5) view).setChecked(z11);
                        }
                        qnVar.Y();
                        break;
                    }
                }
                break;
            default:
                bv bvVar = (bv) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                nu nuVar = bvVar.p1;
                if (arrayList2 == null || arrayList2.size() <= 1) {
                    org.telegram.ui.ActionBar.g1 g1Var = bvVar.B1;
                    if (g1Var != null) {
                        g1Var.d(true);
                        bvVar.B1 = null;
                        break;
                    } else if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).a0.getVisibility() == 0 && (view instanceof uu)) {
                        x5 x5Var = ((uu) view).c;
                        try {
                            TLRPC.Document document = x5Var.document;
                            if (document == null) {
                                document = o5.e(bvVar.a, x5Var.getDocumentId());
                            }
                            SpannableString spannableString = new SpannableString(org.telegram.messenger.fj.U(document));
                            spannableString.setSpan(x5Var, 0, spannableString.length(), 33);
                            ((org.telegram.ui.bn) g2Var).a0.F0.getText().append((CharSequence) spannableString);
                            bvVar.M0();
                            bvVar.dismiss();
                        } catch (Exception unused) {
                        }
                        try {
                            view.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                } else if (SystemClock.elapsedRealtime() - bvVar.L1 >= 250) {
                    int i30 = 0;
                    while (true) {
                        ArrayList[] arrayListArr = nuVar.c;
                        if (i11 < arrayListArr.length) {
                            int size = arrayListArr[i11].size();
                            if (nuVar.c.length > 1) {
                                size = Math.min(bvVar.y1.J * 2, size);
                            }
                            i30 += size + 2;
                            if (i7 >= i30) {
                                i11++;
                            }
                        }
                    }
                    ArrayList arrayList3 = nuVar.b;
                    if (arrayList3 != null && i11 < arrayList3.size()) {
                        tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) nuVar.b.get(i11);
                    }
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                        ArrayList arrayList4 = new ArrayList();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList4.add(tL_inputStickerSetID);
                        new ou(bvVar, g2Var, bvVar.getContext(), this.b, arrayList4).show();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ vm(bv bvVar, ArrayList arrayList, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.c = bvVar;
        this.d = arrayList;
        this.e = g2Var;
        this.b = i6Var;
    }
}
