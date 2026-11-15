package org.telegram.ui.Components;

import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class bt implements et, h2.j, hj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bt(ft ftVar, int i7, int i10, Runnable runnable) {
        this.c = ftVar;
        this.a = i7;
        this.b = i10;
        this.d = runnable;
    }

    @Override // org.telegram.ui.Components.et
    public void a(String str) {
        ft ftVar = (ft) this.c;
        Runnable runnable = (Runnable) this.d;
        Editable text = ftVar.getText();
        int i7 = this.a;
        int i10 = this.b;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i7, i10, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof p5) && !(characterStyle instanceof wg0)) {
                    int spanStart = text.getSpanStart(characterStyle);
                    int spanEnd = text.getSpanEnd(characterStyle);
                    text.removeSpan(characterStyle);
                    if (spanStart < i7) {
                        text.setSpan(characterStyle, spanStart, i7, 33);
                    }
                    if (spanEnd > i10) {
                        text.setSpan(characterStyle, i10, spanEnd, 33);
                    }
                }
            }
        }
        try {
            text.setSpan(ftVar.B(str), i7, i10, 33);
        } catch (Exception unused) {
        }
        dt dtVar = ftVar.T1;
        if (dtVar != null) {
            dtVar.E();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // h2.j
    public void accept(Object obj) {
        p4.c1 c1Var = (p4.c1) this.c;
        Surface surface = (Surface) this.d;
        p4.g1 g1Var = (p4.g1) obj;
        ((p4.d0) c1Var.a.get()).getClass();
        if (surface == null) {
            g1Var.S(null);
            c1Var.i = null;
        } else {
            p4.b1 b1Var = new p4.b1(surface, this.a, this.b);
            c1Var.i = b1Var;
            g1Var.S(b1Var);
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.hj0
    public void f(float f10, float f11, int i7, View view) {
        wg.c1 c1Var = (wg.c1) this.c;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
        ah.a aVar = c1Var.Z1;
        org.telegram.ui.ng0 ng0Var = c1Var.V1;
        ArrayList arrayList = c1Var.c2;
        HashSet hashSet = c1Var.d2;
        boolean z10 = view instanceof org.telegram.ui.Cells.l8;
        int i10 = 2;
        int i11 = this.a;
        xg.h hVar = null;
        if (z10) {
            if (i11 != 4) {
                ((org.telegram.ui.ActionBar.u2) t4.l(c1Var.getContext(), org.telegram.messenger.hd.M0(2131751238, null), org.telegram.messenger.hd.M0(2131751243, null), null, new wg.w0(c1Var, i10), new wg.v0(c1Var, 9), false, false, c1Var.J0).b).show();
                return;
            }
            org.telegram.ui.s00 s00Var = c1Var.w2;
            if (s00Var != null) {
                s00Var.run();
                c1Var.dismiss();
                return;
            }
            return;
        }
        if (view instanceof ah.r) {
            ah.r rVar = (ah.r) view;
            TLRPC.User user = rVar.getUser();
            TLRPC.Chat chat = rVar.getChat();
            if (user == null && chat == null && i11 == 3) {
                int i12 = i7 - 1;
                if (i12 >= 0 && i12 < arrayList.size()) {
                    hVar = (xg.h) arrayList.get(i12);
                }
                org.telegram.messenger.z10 z10Var = c1Var.x2;
                if (z10Var == null || hVar == null) {
                    return;
                }
                int i13 = hVar.i;
                if (i13 == 4) {
                    z10Var.a(-98L);
                    return;
                } else if (i13 == 5) {
                    z10Var.a(-97L);
                    return;
                } else {
                    z10Var.a(-99L);
                    return;
                }
            }
            if (user == null && chat == null) {
                return;
            }
            long j3 = user != null ? user.id : -chat.id;
            if (i11 == 3) {
                org.telegram.messenger.z10 z10Var2 = c1Var.x2;
                if (z10Var2 != null) {
                    z10Var2.a(Long.valueOf(j3));
                    return;
                }
                return;
            }
            if (i11 == 1) {
                if (ng0Var != null) {
                    org.telegram.messenger.g0.v1(ng0Var.getEditText());
                }
                di.xa xaVar = new di.xa(c1Var.getContext(), e6Var, user, new wg.v0(c1Var, 11));
                if (!org.telegram.messenger.g0.Q1()) {
                    xaVar.a0(c1Var.j1);
                }
                xaVar.show();
                return;
            }
            if (i11 == 0 || i11 == 2) {
                if (org.telegram.messenger.q10.b(org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).b2(j3))) {
                    org.telegram.messenger.i20.t(org.telegram.messenger.hd.a0(null, null, 2131743742, org.telegram.messenger.m5.t(j3)), new cc(c1Var.c, e6Var), R.raw.error, 36);
                    return;
                }
                bi.s2 s2Var = new bi.s2(c1Var.getContext(), this.b, j3, wg.q.c(wg.q.b(1, c1Var.n2)), new wg.w0(c1Var, true ? 1 : 0));
                org.telegram.messenger.t1 t1Var = c1Var.r2;
                s2Var.e1(t1Var != null && t1Var.a(j3));
                s2Var.show();
                return;
            }
            int i14 = 4;
            if (i11 == 4) {
                if (hashSet.isEmpty()) {
                    hashSet.add(Long.valueOf(j3));
                    org.telegram.messenger.s10 s10Var = c1Var.z2;
                    if (s10Var != null) {
                        fp fpVar = c1Var.Y1;
                        s10Var.a(Boolean.valueOf(fpVar != null && fpVar.a.q), hashSet);
                        c1Var.z2 = null;
                    }
                    c1Var.dismiss();
                    return;
                }
                i14 = 4;
            }
            boolean z11 = (i11 == i14 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                c1Var.j2.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == c1Var.h1() + 1) {
                hashSet.remove(Long.valueOf(j3));
                c1Var.m1();
                return;
            }
            boolean z12 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z11 != z12) {
                aVar.setVisibility(0);
                aVar.animate().alpha(z12 ? 1.0f : 0.0f).translationY(z12 ? 0.0f : org.telegram.messenger.g0.L(12.0f)).setInterpolator(er.h).setDuration(320L).withEndAction(!z12 ? new wg.v0(c1Var, true ? 1 : 0) : null).start();
                xg.i iVar = c1Var.l2;
                boolean z13 = !z12;
                if (iVar.E != z13) {
                    iVar.E = z13;
                    org.telegram.messenger.g0.d0(iVar.f, new xg.g(z13));
                }
            }
            c1Var.e1();
            ng0Var.b(true, hashSet, new wg.v0(c1Var, i10), null);
            c1Var.p1(true, true);
            c1Var.f1();
        }
    }

    public /* synthetic */ bt(p4.c1 c1Var, Surface surface, int i7, int i10) {
        this.c = c1Var;
        this.d = surface;
        this.a = i7;
        this.b = i10;
    }

    public /* synthetic */ bt(wg.c1 c1Var, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.c = c1Var;
        this.a = i7;
        this.d = e6Var;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
