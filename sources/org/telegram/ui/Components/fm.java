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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fm implements bj0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fm(an anVar, org.telegram.ui.ActionBar.h6 h6Var, ci ciVar, Context context) {
        this.c = anVar;
        this.b = h6Var;
        this.d = ciVar;
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
                an anVar = (an) obj3;
                ci ciVar = (ci) obj2;
                Context context = (Context) obj;
                y20 y20Var = anVar.D;
                boolean[] zArr = anVar.L;
                bg.w0 w0Var = anVar.N0;
                pm pmVar = anVar.w;
                org.telegram.ui.l4 l4Var = anVar.r;
                org.telegram.ui.g61 g61Var = anVar.s;
                int i12 = anVar.L0;
                org.telegram.ui.ActionBar.h6 h6Var = this.b;
                if (i7 == i12) {
                    vh.g gVar = new vh.g(anVar.getContext(), h6Var);
                    gVar.f2 = new gf.g(anVar, 29);
                    ArrayList arrayList = anVar.P0;
                    gVar.X1 = null;
                    gVar.j2 = new HashSet(arrayList);
                    gVar.show();
                    break;
                } else {
                    int i13 = 5;
                    if (i7 == anVar.I0) {
                        k60 F = k60.F(ciVar.c, h6Var, view);
                        int i14 = 0;
                        while (true) {
                            int[] iArr = anVar.T0;
                            if (i14 >= iArr.length) {
                                F.c(R.drawable.msg_customize, org.telegram.messenger.id.M0(2131747131, null), new org.telegram.ui.m6(anVar, context, view, h6Var, 18), false);
                                F.t = false;
                                F.s = 0;
                                F.Z();
                                break;
                            } else {
                                int i15 = iArr[i14];
                                a01 a10 = a01.a(i15);
                                int i16 = org.telegram.ui.ActionBar.m6.F8;
                                org.telegram.ui.ActionBar.t6.x(anVar, a10, i16, h6Var, PorterDuff.Mode.SRC_IN);
                                F.b(0, a10, org.telegram.messenger.id.G(i15 / 3600, "Hours", new Object[0]), i16, org.telegram.ui.ActionBar.m6.E8, new org.telegram.ui.q8(anVar, i15, view, i13));
                                i14++;
                            }
                        }
                    } else if (i7 == anVar.u0) {
                        anVar.T();
                        break;
                    } else {
                        boolean z12 = view instanceof org.telegram.ui.Cells.r8;
                        if (z12 || (view instanceof org.telegram.ui.Cells.x5)) {
                            boolean z13 = anVar.c0;
                            rm rmVar = anVar.y;
                            if (rmVar != null) {
                                rmVar.f();
                            }
                            bg.w0[] w0VarArr = anVar.O0;
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
                                        an anVar2 = (an) w0Var.c;
                                        org.telegram.ui.l4 l4Var2 = anVar2.r;
                                        if (i7 == i18) {
                                            g61Var.setItemAnimator(pmVar);
                                            int i19 = w0Var.b;
                                            if (i19 >= 0) {
                                                v4.d1 K = anVar2.s.K(i19);
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
                                            anVar.n0();
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
                                if (i7 == anVar.B0) {
                                    z10 = anVar.a0;
                                    anVar.a0 = !z10;
                                    anVar.V();
                                } else {
                                    int i20 = anVar.y0;
                                    if (i7 == i20) {
                                        z10 = !anVar.f0;
                                        anVar.f0 = z10;
                                    } else if (i7 == anVar.C0) {
                                        if (!anVar.c0 && !anVar.a0) {
                                            anVar.T ^= z9;
                                        }
                                        z10 = anVar.T;
                                    } else if (i7 == anVar.E0) {
                                        z10 = !anVar.S;
                                        anVar.S = z10;
                                    } else if (i7 == anVar.H0) {
                                        if (anVar.U == 0 && anVar.V == 0) {
                                            anVar.U = 86400;
                                            anVar.V = 0;
                                            int i21 = anVar.I0;
                                            anVar.n0();
                                            if (i21 < 0) {
                                                v4.d1 K2 = g61Var.K(anVar.H0);
                                                if (K2 != null) {
                                                    View view3 = K2.a;
                                                    if (view3 instanceof org.telegram.ui.Cells.x5) {
                                                        ((org.telegram.ui.Cells.x5) view3).setDivider(z9);
                                                    }
                                                }
                                                g61Var.setItemAnimator(pmVar);
                                                l4Var.o(anVar.I0, 3);
                                            }
                                        } else {
                                            anVar.U = 0;
                                            anVar.V = 0;
                                            int i22 = anVar.I0;
                                            anVar.n0();
                                            g61Var.setItemAnimator(pmVar);
                                            l4Var.p(i22, 3);
                                            v4.d1 K3 = g61Var.K(anVar.H0);
                                            if (K3 != null) {
                                                View view4 = K3.a;
                                                if (view4 instanceof org.telegram.ui.Cells.x5) {
                                                    ((org.telegram.ui.Cells.x5) view4).setDivider(false);
                                                }
                                            }
                                        }
                                        z10 = (anVar.U == 0 && anVar.V == 0) ? false : z9;
                                    } else if (i7 == anVar.D0) {
                                        z10 = !anVar.R;
                                        anVar.R = z10;
                                    } else if (i7 == anVar.z0) {
                                        z10 = anVar.g0 ^ z9;
                                        anVar.g0 = z10;
                                        anVar.n0();
                                        int i23 = anVar.y0;
                                        if (i23 >= 0 && i20 < 0) {
                                            g61Var.setItemAnimator(pmVar);
                                            l4Var.i(anVar.y0);
                                        } else if (i20 >= 0 && i23 < 0) {
                                            g61Var.setItemAnimator(pmVar);
                                            l4Var.s(i20);
                                        }
                                    } else if (i7 == anVar.F0) {
                                        boolean z15 = anVar.b0;
                                        z10 = !z15;
                                        anVar.b0 = z10;
                                        if (z15 && anVar.c0) {
                                            boolean z16 = false;
                                            for (int i24 = 0; i24 < zArr.length; i24++) {
                                                if (z16) {
                                                    zArr[i24] = false;
                                                } else if (zArr[i24]) {
                                                    z16 = z9;
                                                }
                                            }
                                        }
                                        int childCount = g61Var.getChildCount();
                                        for (int i25 = 0; i25 < childCount; i25++) {
                                            v4.d1 T = g61Var.T(g61Var.getChildAt(i25));
                                            if (T.f == 5) {
                                                ((org.telegram.ui.Cells.a6) T.a).a.a(anVar.b0, z9);
                                            }
                                        }
                                    } else if (i7 == anVar.J0) {
                                        z10 = !anVar.W;
                                        anVar.W = z10;
                                    } else if (i7 == anVar.G0) {
                                        if (!anVar.e0) {
                                            g61Var.setItemAnimator(pmVar);
                                            z10 = !anVar.c0;
                                            anVar.c0 = z10;
                                            int i26 = anVar.o0;
                                            anVar.n0();
                                            if (anVar.c0) {
                                                l4Var.o(anVar.o0, 3);
                                            } else {
                                                l4Var.p(i26, 3);
                                            }
                                            l4Var.g(anVar.A0);
                                            if (anVar.c0) {
                                                anVar.R = false;
                                                int i27 = anVar.D0;
                                                if (i27 >= 0) {
                                                    v4.d1 K4 = g61Var.K(i27);
                                                    if (K4 != null) {
                                                        ((org.telegram.ui.Cells.x5) K4.a).setChecked(false);
                                                    } else {
                                                        l4Var.g(anVar.D0);
                                                    }
                                                }
                                            } else {
                                                int i28 = anVar.D0;
                                                if (i28 >= 0 && g61Var.K(i28) == null) {
                                                    l4Var.g(anVar.D0);
                                                }
                                            }
                                            anVar.V();
                                            if (anVar.c0 && !anVar.b0) {
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
                            if (anVar.d0 && !anVar.c0) {
                                g61Var.getChildCount();
                                y20Var.a();
                            }
                            for (int i30 = anVar.t0; i30 < anVar.t0 + anVar.M; i30++) {
                                v4.d1 K5 = g61Var.K(i30);
                                if (K5 != null) {
                                    View view5 = K5.a;
                                    if (view5 instanceof org.telegram.ui.Cells.a6) {
                                        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view5;
                                        a6Var.m(anVar.c0, z9);
                                        a6Var.r.a(zArr[i30 - anVar.t0], z13);
                                        if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == anVar.G0 && !anVar.d0) {
                                            y20Var.setText(org.telegram.messenger.id.M0(2131747155, null));
                                            y20Var.c(a6Var.getCheckBox());
                                            anVar.d0 = z9;
                                        }
                                    }
                                }
                            }
                            if (z12) {
                                ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                            } else if (view instanceof org.telegram.ui.Cells.x5) {
                                ((org.telegram.ui.Cells.x5) view).setChecked(z10);
                            }
                            anVar.X();
                            break;
                        }
                    }
                }
                break;
            default:
                qu quVar = (qu) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                cu cuVar = quVar.o1;
                if (arrayList2 == null || arrayList2.size() <= 1) {
                    org.telegram.ui.ActionBar.g1 g1Var = quVar.A1;
                    if (g1Var != null) {
                        g1Var.d(true);
                        quVar.A1 = null;
                        break;
                    } else if ((f2Var instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var).Z.getVisibility() == 0 && (view instanceof ju)) {
                        q5 q5Var = ((ju) view).c;
                        try {
                            TLRPC.Document document = q5Var.document;
                            if (document == null) {
                                document = h5.e(quVar.a, q5Var.getDocumentId());
                            }
                            SpannableString spannableString = new SpannableString(org.telegram.messenger.ij.U(document));
                            spannableString.setSpan(q5Var, 0, spannableString.length(), 33);
                            ((org.telegram.ui.cn) f2Var).Z.E0.getText().append((CharSequence) spannableString);
                            quVar.L0();
                            quVar.dismiss();
                        } catch (Exception unused) {
                        }
                        try {
                            view.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                } else if (SystemClock.elapsedRealtime() - quVar.K1 >= 250) {
                    int i31 = 0;
                    while (true) {
                        ArrayList[] arrayListArr = cuVar.c;
                        if (i11 < arrayListArr.length) {
                            int size = arrayListArr[i11].size();
                            if (cuVar.c.length > 1) {
                                size = Math.min(quVar.x1.J * 2, size);
                            }
                            i31 += size + 2;
                            if (i7 >= i31) {
                                i11++;
                            }
                        }
                    }
                    ArrayList arrayList3 = cuVar.b;
                    if (arrayList3 != null && i11 < arrayList3.size()) {
                        tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) cuVar.b.get(i11);
                    }
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                        ArrayList arrayList4 = new ArrayList();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList4.add(tL_inputStickerSetID);
                        new du(quVar, f2Var, quVar.getContext(), this.b, arrayList4).show();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ fm(qu quVar, ArrayList arrayList, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.c = quVar;
        this.d = arrayList;
        this.e = f2Var;
        this.b = h6Var;
    }
}
