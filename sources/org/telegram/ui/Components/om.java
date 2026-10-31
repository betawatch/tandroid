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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class om implements gk0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ om(jn jnVar, org.telegram.ui.ActionBar.p6 p6Var, bi biVar, Context context) {
        this.c = jnVar;
        this.b = p6Var;
        this.d = biVar;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void f(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i11 = this.a;
        int i12 = 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i11) {
            case 0:
                jn jnVar = (jn) obj3;
                bi biVar = (bi) obj2;
                Context context = (Context) obj;
                q30 q30Var = jnVar.D;
                boolean[] zArr = jnVar.L;
                c5.e eVar = jnVar.N0;
                ym ymVar = jnVar.w;
                fg.j jVar = jnVar.r;
                org.telegram.ui.w71 w71Var = jnVar.s;
                int i13 = jnVar.L0;
                org.telegram.ui.ActionBar.p6 p6Var = this.b;
                if (i10 == i13) {
                    lh.g gVar = new lh.g(jnVar.getContext(), p6Var);
                    gVar.c2 = new l2.f(jnVar, 15);
                    ArrayList arrayList = jnVar.P0;
                    gVar.U1 = null;
                    gVar.g2 = new HashSet(arrayList);
                    gVar.show();
                    break;
                } else if (i10 == jnVar.I0) {
                    z60 F = z60.F(biVar.c, p6Var, view);
                    int i14 = 0;
                    while (true) {
                        int[] iArr = jnVar.T0;
                        if (i14 >= iArr.length) {
                            F.c(R.drawable.msg_customize, org.telegram.messenger.cd.L0(2131747146, null), new org.telegram.ui.fp((Object) jnVar, (Object) context, (Object) view, (Object) p6Var, 8), false);
                            F.t = false;
                            F.s = 0;
                            F.Z();
                            break;
                        } else {
                            int i15 = iArr[i14];
                            f11 a2 = f11.a(i15);
                            int i16 = org.telegram.ui.ActionBar.t6.F8;
                            org.telegram.ui.ActionBar.a7.y(jnVar, a2, i16, p6Var, PorterDuff.Mode.SRC_IN);
                            F.b(0, a2, org.telegram.messenger.cd.G(i15 / 3600, "Hours", new Object[0]), i16, org.telegram.ui.ActionBar.t6.E8, new ag.o0(jnVar, i15, view, 22));
                            i14++;
                        }
                    }
                } else if (i10 == jnVar.u0) {
                    jnVar.S();
                    break;
                } else {
                    boolean z13 = view instanceof org.telegram.ui.Cells.t8;
                    if (z13 || (view instanceof org.telegram.ui.Cells.c6)) {
                        boolean z14 = jnVar.c0;
                        an anVar = jnVar.y;
                        if (anVar != null) {
                            anVar.f();
                        }
                        c5.e[] eVarArr = jnVar.O0;
                        int length = eVarArr.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 < length) {
                                c5.e eVar2 = eVarArr[i17];
                                if (i10 == eVar2.a) {
                                    boolean z15 = eVar2.b;
                                    z11 = !z15;
                                    eVar2.b = z11;
                                    int i18 = eVar.a;
                                    jn jnVar2 = (jn) eVar.c;
                                    fg.j jVar2 = jnVar2.r;
                                    if (i10 == i18) {
                                        w71Var.setItemAnimator(ymVar);
                                        int i19 = eVar.a;
                                        if (i19 >= 0) {
                                            s4.c1 K = jnVar2.s.K(i19);
                                            if (K != null) {
                                                View view2 = K.a;
                                                if (view2 instanceof org.telegram.ui.Cells.c6) {
                                                    ((org.telegram.ui.Cells.c6) view2).setDivider(z11);
                                                }
                                            }
                                            jVar2.g(eVar.a);
                                        }
                                        if (z15) {
                                            z10 = true;
                                            jVar2.p(eVar.a + 1, 1);
                                        } else {
                                            z10 = true;
                                            jVar2.o(eVar.a + 1, 1);
                                        }
                                        jnVar.l0();
                                    } else {
                                        z10 = true;
                                    }
                                    z12 = z10;
                                } else {
                                    i17++;
                                }
                            } else {
                                z10 = true;
                                z11 = false;
                                z12 = false;
                            }
                        }
                        if (!z12) {
                            if (i10 == jnVar.B0) {
                                z11 = jnVar.a0;
                                jnVar.a0 = !z11;
                                jnVar.U();
                            } else {
                                int i20 = jnVar.y0;
                                if (i10 == i20) {
                                    z11 = !jnVar.f0;
                                    jnVar.f0 = z11;
                                } else if (i10 == jnVar.C0) {
                                    if (!jnVar.c0 && !jnVar.a0) {
                                        jnVar.T ^= z10;
                                    }
                                    z11 = jnVar.T;
                                } else if (i10 == jnVar.E0) {
                                    z11 = !jnVar.S;
                                    jnVar.S = z11;
                                } else if (i10 == jnVar.H0) {
                                    if (jnVar.U == 0 && jnVar.V == 0) {
                                        jnVar.U = 86400;
                                        jnVar.V = 0;
                                        int i21 = jnVar.I0;
                                        jnVar.l0();
                                        if (i21 < 0) {
                                            s4.c1 K2 = w71Var.K(jnVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.a;
                                                if (view3 instanceof org.telegram.ui.Cells.c6) {
                                                    ((org.telegram.ui.Cells.c6) view3).setDivider(z10);
                                                }
                                            }
                                            w71Var.setItemAnimator(ymVar);
                                            jVar.o(jnVar.I0, 3);
                                        }
                                    } else {
                                        jnVar.U = 0;
                                        jnVar.V = 0;
                                        int i22 = jnVar.I0;
                                        jnVar.l0();
                                        w71Var.setItemAnimator(ymVar);
                                        jVar.p(i22, 3);
                                        s4.c1 K3 = w71Var.K(jnVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.a;
                                            if (view4 instanceof org.telegram.ui.Cells.c6) {
                                                ((org.telegram.ui.Cells.c6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    z11 = (jnVar.U == 0 && jnVar.V == 0) ? false : z10;
                                } else if (i10 == jnVar.D0) {
                                    z11 = !jnVar.R;
                                    jnVar.R = z11;
                                } else if (i10 == jnVar.z0) {
                                    z11 = jnVar.g0 ^ z10;
                                    jnVar.g0 = z11;
                                    jnVar.l0();
                                    int i23 = jnVar.y0;
                                    if (i23 >= 0 && i20 < 0) {
                                        w71Var.setItemAnimator(ymVar);
                                        jVar.i(jnVar.y0);
                                    } else if (i20 >= 0 && i23 < 0) {
                                        w71Var.setItemAnimator(ymVar);
                                        jVar.s(i20);
                                    }
                                } else if (i10 == jnVar.F0) {
                                    boolean z16 = jnVar.b0;
                                    z11 = !z16;
                                    jnVar.b0 = z11;
                                    if (z16 && jnVar.c0) {
                                        boolean z17 = false;
                                        for (int i24 = 0; i24 < zArr.length; i24++) {
                                            if (z17) {
                                                zArr[i24] = false;
                                            } else if (zArr[i24]) {
                                                z17 = z10;
                                            }
                                        }
                                    }
                                    int childCount = w71Var.getChildCount();
                                    for (int i25 = 0; i25 < childCount; i25++) {
                                        s4.c1 T = w71Var.T(w71Var.getChildAt(i25));
                                        if (T.f == 5) {
                                            ((org.telegram.ui.Cells.e6) T.a).a.a(jnVar.b0, z10);
                                        }
                                    }
                                } else if (i10 == jnVar.J0) {
                                    z11 = !jnVar.W;
                                    jnVar.W = z11;
                                } else if (i10 == jnVar.G0) {
                                    if (!jnVar.e0) {
                                        w71Var.setItemAnimator(ymVar);
                                        z11 = !jnVar.c0;
                                        jnVar.c0 = z11;
                                        int i26 = jnVar.o0;
                                        jnVar.l0();
                                        if (jnVar.c0) {
                                            jVar.o(jnVar.o0, 3);
                                        } else {
                                            jVar.p(i26, 3);
                                        }
                                        jVar.g(jnVar.A0);
                                        if (jnVar.c0) {
                                            jnVar.R = false;
                                            int i27 = jnVar.D0;
                                            if (i27 >= 0) {
                                                s4.c1 K4 = w71Var.K(i27);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.c6) K4.a).setChecked(false);
                                                } else {
                                                    jVar.g(jnVar.D0);
                                                }
                                            }
                                        } else {
                                            int i28 = jnVar.D0;
                                            if (i28 >= 0 && w71Var.K(i28) == null) {
                                                jVar.g(jnVar.D0);
                                            }
                                        }
                                        jnVar.U();
                                        if (jnVar.c0 && !jnVar.b0) {
                                            boolean z18 = false;
                                            for (int i29 = 0; i29 < zArr.length; i29++) {
                                                if (z18) {
                                                    zArr[i29] = false;
                                                } else if (zArr[i29]) {
                                                    z18 = z10;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (jnVar.d0 && !jnVar.c0) {
                            w71Var.getChildCount();
                            q30Var.b(z10);
                        }
                        for (int i30 = jnVar.t0; i30 < jnVar.t0 + jnVar.M; i30++) {
                            s4.c1 K5 = w71Var.K(i30);
                            if (K5 != null) {
                                View view5 = K5.a;
                                if (view5 instanceof org.telegram.ui.Cells.e6) {
                                    org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view5;
                                    e6Var.m(jnVar.c0, z10);
                                    e6Var.r.a(zArr[i30 - jnVar.t0], z14);
                                    if (e6Var.getTop() > org.telegram.messenger.i0.L(40.0f) && i10 == jnVar.G0 && !jnVar.d0) {
                                        q30Var.setText(org.telegram.messenger.cd.L0(2131747170, null));
                                        q30Var.f(e6Var.getCheckBox(), z10);
                                        jnVar.d0 = z10;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            ((org.telegram.ui.Cells.t8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.c6) {
                            ((org.telegram.ui.Cells.c6) view).setChecked(z11);
                        }
                        jnVar.W();
                        break;
                    }
                }
                break;
            default:
                cv cvVar = (cv) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                ou ouVar = cvVar.l1;
                if (arrayList2 == null || arrayList2.size() <= 1) {
                    org.telegram.ui.ActionBar.k1 k1Var = cvVar.x1;
                    if (k1Var != null) {
                        k1Var.d(true);
                        cvVar.x1 = null;
                        break;
                    } else if ((k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).Z.getVisibility() == 0 && (view instanceof vu)) {
                        o5 o5Var = ((vu) view).c;
                        try {
                            TLRPC.Document document = o5Var.document;
                            if (document == null) {
                                document = f5.e(cvVar.a, o5Var.getDocumentId());
                            }
                            SpannableString spannableString = new SpannableString(org.telegram.messenger.jj.U(document));
                            spannableString.setSpan(o5Var, 0, spannableString.length(), 33);
                            ((org.telegram.ui.un) k2Var).Z.E0.getText().append((CharSequence) spannableString);
                            cvVar.L0();
                            cvVar.dismiss();
                        } catch (Exception unused) {
                        }
                        try {
                            view.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                } else if (SystemClock.elapsedRealtime() - cvVar.H1 >= 250) {
                    int i31 = 0;
                    while (true) {
                        ArrayList[] arrayListArr = ouVar.c;
                        if (i12 < arrayListArr.length) {
                            int size = arrayListArr[i12].size();
                            if (ouVar.c.length > 1) {
                                size = Math.min(cvVar.u1.J * 2, size);
                            }
                            i31 += size + 2;
                            if (i10 >= i31) {
                                i12++;
                            }
                        }
                    }
                    ArrayList arrayList3 = ouVar.b;
                    if (arrayList3 != null && i12 < arrayList3.size()) {
                        tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) ouVar.b.get(i12);
                    }
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                        ArrayList arrayList4 = new ArrayList();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        arrayList4.add(tL_inputStickerSetID);
                        new pu(cvVar, k2Var, cvVar.getContext(), this.b, arrayList4).show();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ om(cv cvVar, ArrayList arrayList, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.c = cvVar;
        this.d = arrayList;
        this.e = k2Var;
        this.b = p6Var;
    }
}
