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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm implements oj0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vm(rn rnVar, org.telegram.ui.ActionBar.i6 i6Var, si siVar, Context context) {
        this.c = rnVar;
        this.b = i6Var;
        this.d = siVar;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void c(int i7, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = this.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i11 = 0;
        switch (i10) {
            case 0:
                rn rnVar = (rn) obj3;
                si siVar = (si) obj2;
                Context context = (Context) obj;
                j30 j30Var = rnVar.E;
                boolean[] zArr = rnVar.M;
                bg.w0 w0Var = rnVar.O0;
                fn fnVar = rnVar.w;
                org.telegram.ui.l4 l4Var = rnVar.r;
                org.telegram.ui.f61 f61Var = rnVar.s;
                int i12 = rnVar.M0;
                org.telegram.ui.ActionBar.i6 i6Var = this.b;
                if (i7 == i12) {
                    vh.g gVar = new vh.g(rnVar.getContext(), i6Var);
                    gVar.g2 = new hn(rnVar, 0);
                    ArrayList arrayList = rnVar.Q0;
                    gVar.Y1 = null;
                    gVar.k2 = new HashSet(arrayList);
                    gVar.show();
                    break;
                } else if (i7 == rnVar.J0) {
                    y60 G = y60.G(siVar.c, i6Var, view);
                    int i13 = 0;
                    while (true) {
                        int[] iArr = rnVar.U0;
                        if (i13 >= iArr.length) {
                            G.c(R.drawable.msg_customize, org.telegram.messenger.gd.M0(2131746938, null), new org.telegram.messenger.camera.i(rnVar, context, view, i6Var, 25), false);
                            G.t = false;
                            G.s = 0;
                            G.a0();
                            break;
                        } else {
                            int i14 = iArr[i13];
                            k01 a10 = k01.a(i14);
                            int i15 = org.telegram.ui.ActionBar.n6.F8;
                            org.telegram.ui.ActionBar.u6.x(rnVar, a10, i15, i6Var, PorterDuff.Mode.SRC_IN);
                            G.b(0, a10, org.telegram.messenger.gd.G(i14 / 3600, "Hours", new Object[0]), i15, org.telegram.ui.ActionBar.n6.E8, new org.telegram.ui.b0(rnVar, i14, view, 9));
                            i13++;
                        }
                    }
                } else if (i7 == rnVar.v0) {
                    rnVar.U();
                    break;
                } else {
                    boolean z14 = view instanceof org.telegram.ui.Cells.s8;
                    if (z14 || (view instanceof org.telegram.ui.Cells.z5)) {
                        boolean z15 = rnVar.d0;
                        in inVar = rnVar.y;
                        if (inVar != null) {
                            inVar.f();
                        }
                        bg.w0[] w0VarArr = rnVar.P0;
                        int length = w0VarArr.length;
                        int i16 = 0;
                        while (true) {
                            if (i16 < length) {
                                bg.w0 w0Var2 = w0VarArr[i16];
                                if (i7 == w0Var2.b) {
                                    boolean z16 = w0Var2.a;
                                    z11 = !z16;
                                    w0Var2.a = z11;
                                    int i17 = w0Var.b;
                                    rn rnVar2 = (rn) w0Var.c;
                                    org.telegram.ui.l4 l4Var2 = rnVar2.r;
                                    if (i7 == i17) {
                                        f61Var.setItemAnimator(fnVar);
                                        int i18 = w0Var.b;
                                        if (i18 >= 0) {
                                            v4.f1 K = rnVar2.s.K(i18);
                                            if (K != null) {
                                                View view2 = K.a;
                                                if (view2 instanceof org.telegram.ui.Cells.z5) {
                                                    ((org.telegram.ui.Cells.z5) view2).setDivider(z11);
                                                }
                                            }
                                            l4Var2.g(w0Var.b);
                                        }
                                        if (z16) {
                                            z13 = true;
                                            l4Var2.p(w0Var.b + 1, 1);
                                        } else {
                                            z13 = true;
                                            l4Var2.o(w0Var.b + 1, 1);
                                        }
                                        rnVar.n0();
                                    } else {
                                        z13 = true;
                                    }
                                    z10 = z13;
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
                            if (i7 == rnVar.C0) {
                                z11 = rnVar.b0;
                                rnVar.b0 = !z11;
                                rnVar.W();
                            } else {
                                int i19 = rnVar.z0;
                                if (i7 == i19) {
                                    z11 = rnVar.g0 ^ z10;
                                    rnVar.g0 = z11;
                                } else if (i7 == rnVar.D0) {
                                    if (!rnVar.d0 && !rnVar.b0) {
                                        rnVar.U ^= z10;
                                    }
                                    z11 = rnVar.U;
                                } else if (i7 == rnVar.F0) {
                                    z11 = rnVar.T ^ z10;
                                    rnVar.T = z11;
                                } else if (i7 == rnVar.I0) {
                                    if (rnVar.V == 0 && rnVar.W == 0) {
                                        rnVar.V = 86400;
                                        rnVar.W = 0;
                                        int i20 = rnVar.J0;
                                        rnVar.n0();
                                        if (i20 < 0) {
                                            v4.f1 K2 = f61Var.K(rnVar.I0);
                                            if (K2 != null) {
                                                View view3 = K2.a;
                                                if (view3 instanceof org.telegram.ui.Cells.z5) {
                                                    ((org.telegram.ui.Cells.z5) view3).setDivider(z10);
                                                }
                                            }
                                            f61Var.setItemAnimator(fnVar);
                                            l4Var.o(rnVar.J0, 3);
                                        }
                                    } else {
                                        rnVar.V = 0;
                                        rnVar.W = 0;
                                        int i21 = rnVar.J0;
                                        rnVar.n0();
                                        f61Var.setItemAnimator(fnVar);
                                        l4Var.p(i21, 3);
                                        v4.f1 K3 = f61Var.K(rnVar.I0);
                                        if (K3 != null) {
                                            View view4 = K3.a;
                                            if (view4 instanceof org.telegram.ui.Cells.z5) {
                                                ((org.telegram.ui.Cells.z5) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    z11 = (rnVar.V == 0 && rnVar.W == 0) ? false : z10;
                                } else if (i7 == rnVar.E0) {
                                    z11 = rnVar.S ^ z10;
                                    rnVar.S = z11;
                                } else if (i7 == rnVar.A0) {
                                    z11 = rnVar.h0 ^ z10;
                                    rnVar.h0 = z11;
                                    rnVar.n0();
                                    int i22 = rnVar.z0;
                                    if (i22 >= 0 && i19 < 0) {
                                        f61Var.setItemAnimator(fnVar);
                                        l4Var.i(rnVar.z0);
                                    } else if (i19 >= 0 && i22 < 0) {
                                        f61Var.setItemAnimator(fnVar);
                                        l4Var.s(i19);
                                    }
                                } else if (i7 == rnVar.G0) {
                                    boolean z17 = rnVar.c0;
                                    boolean z18 = !z17;
                                    rnVar.c0 = z18;
                                    if (z17 && rnVar.d0) {
                                        boolean z19 = false;
                                        for (int i23 = 0; i23 < zArr.length; i23++) {
                                            if (z19) {
                                                zArr[i23] = false;
                                            } else if (zArr[i23]) {
                                                z19 = z10;
                                            }
                                        }
                                    }
                                    int childCount = f61Var.getChildCount();
                                    for (int i24 = 0; i24 < childCount; i24++) {
                                        v4.f1 T = f61Var.T(f61Var.getChildAt(i24));
                                        if (T.f == 5) {
                                            ((org.telegram.ui.Cells.b6) T.a).a.a(rnVar.c0, z10);
                                        }
                                    }
                                    z11 = z18;
                                } else if (i7 == rnVar.K0) {
                                    z11 = rnVar.a0 ^ z10;
                                    rnVar.a0 = z11;
                                } else if (i7 == rnVar.H0) {
                                    if (!rnVar.f0) {
                                        f61Var.setItemAnimator(fnVar);
                                        z11 = rnVar.d0 ^ z10;
                                        rnVar.d0 = z11;
                                        int i25 = rnVar.p0;
                                        rnVar.n0();
                                        if (rnVar.d0) {
                                            l4Var.o(rnVar.p0, 3);
                                        } else {
                                            l4Var.p(i25, 3);
                                        }
                                        l4Var.g(rnVar.B0);
                                        if (rnVar.d0) {
                                            rnVar.S = false;
                                            int i26 = rnVar.E0;
                                            if (i26 >= 0) {
                                                v4.f1 K4 = f61Var.K(i26);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.z5) K4.a).setChecked(false);
                                                } else {
                                                    l4Var.g(rnVar.E0);
                                                }
                                            }
                                        } else {
                                            int i27 = rnVar.E0;
                                            if (i27 >= 0 && f61Var.K(i27) == null) {
                                                l4Var.g(rnVar.E0);
                                            }
                                        }
                                        rnVar.W();
                                        if (rnVar.d0 && !rnVar.c0) {
                                            boolean z20 = false;
                                            for (int i28 = 0; i28 < zArr.length; i28++) {
                                                if (z20) {
                                                    zArr[i28] = false;
                                                } else if (zArr[i28]) {
                                                    z20 = z10;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (rnVar.e0 && !rnVar.d0) {
                            f61Var.getChildCount();
                            j30Var.a();
                        }
                        for (int i29 = rnVar.u0; i29 < rnVar.u0 + rnVar.N; i29++) {
                            v4.f1 K5 = f61Var.K(i29);
                            if (K5 != null) {
                                View view5 = K5.a;
                                if (view5 instanceof org.telegram.ui.Cells.b6) {
                                    org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view5;
                                    b6Var.n(rnVar.d0, z10);
                                    b6Var.r.a(zArr[i29 - rnVar.u0], z15);
                                    if (b6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == rnVar.H0 && !rnVar.e0) {
                                        j30Var.setText(org.telegram.messenger.gd.M0(2131746962, null));
                                        j30Var.c(b6Var.getCheckBox());
                                        rnVar.e0 = z10;
                                    }
                                }
                            }
                        }
                        if (z14) {
                            ((org.telegram.ui.Cells.s8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.z5) {
                            ((org.telegram.ui.Cells.z5) view).setChecked(z11);
                        }
                        rnVar.Y();
                        break;
                    }
                }
                break;
            default:
                bv bvVar = (bv) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                nu nuVar = bvVar.p1;
                if (arrayList2 == null || arrayList2.size() <= 1) {
                    org.telegram.ui.ActionBar.h1 h1Var = bvVar.B1;
                    if (h1Var != null) {
                        h1Var.d(true);
                        bvVar.B1 = null;
                        break;
                    } else if ((h2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) h2Var).a0.getVisibility() == 0 && (view instanceof uu)) {
                        x5 x5Var = ((uu) view).c;
                        try {
                            TLRPC.Document document = x5Var.document;
                            if (document == null) {
                                document = o5.e(bvVar.a, x5Var.getDocumentId());
                            }
                            SpannableString spannableString = new SpannableString(org.telegram.messenger.fj.U(document));
                            spannableString.setSpan(x5Var, 0, spannableString.length(), 33);
                            ((org.telegram.ui.bn) h2Var).a0.F0.getText().append((CharSequence) spannableString);
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
                        new ou(bvVar, h2Var, bvVar.getContext(), this.b, arrayList4).show();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ vm(bv bvVar, ArrayList arrayList, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.c = bvVar;
        this.d = arrayList;
        this.e = h2Var;
        this.b = i6Var;
    }
}
