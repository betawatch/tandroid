package org.telegram.ui.Components;

import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ts implements xs, h2.j, cj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ts(ys ysVar, int i7, int i10, Runnable runnable) {
        this.c = ysVar;
        this.a = i7;
        this.b = i10;
        this.d = runnable;
    }

    @Override // org.telegram.ui.Components.xs
    public void a(String str) {
        ys ysVar = (ys) this.c;
        Runnable runnable = (Runnable) this.d;
        Editable text = ysVar.getText();
        int i7 = this.a;
        int i10 = this.b;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i7, i10, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof q5) && !(characterStyle instanceof tg0)) {
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
            text.setSpan(ysVar.A(str), i7, i10, 33);
        } catch (Exception unused) {
        }
        ws wsVar = ysVar.N1;
        if (wsVar != null) {
            wsVar.m();
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

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        wg.f1 f1Var = (wg.f1) this.c;
        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
        ah.a aVar = f1Var.Y1;
        org.telegram.ui.qg0 qg0Var = f1Var.U1;
        ArrayList arrayList = f1Var.b2;
        HashSet hashSet = f1Var.c2;
        boolean z9 = view instanceof org.telegram.ui.Cells.m8;
        int i10 = 2;
        int i11 = this.a;
        xg.h hVar = null;
        if (z9) {
            if (i11 != 4) {
                ((org.telegram.ui.ActionBar.w2) u4.l(f1Var.getContext(), org.telegram.messenger.id.M0(2131751238, null), org.telegram.messenger.id.M0(2131751243, null), null, new wg.y0(f1Var, i10), new wg.x0(f1Var, 9), false, false, f1Var.I0).b).show();
                return;
            }
            org.telegram.ui.v00 v00Var = f1Var.v2;
            if (v00Var != null) {
                v00Var.run();
                f1Var.dismiss();
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
                org.telegram.messenger.c20 c20Var = f1Var.w2;
                if (c20Var == null || hVar == null) {
                    return;
                }
                int i13 = hVar.i;
                if (i13 == 4) {
                    c20Var.a(-98L);
                    return;
                } else if (i13 == 5) {
                    c20Var.a(-97L);
                    return;
                } else {
                    c20Var.a(-99L);
                    return;
                }
            }
            if (user == null && chat == null) {
                return;
            }
            long j3 = user != null ? user.id : -chat.id;
            if (i11 == 3) {
                org.telegram.messenger.c20 c20Var2 = f1Var.w2;
                if (c20Var2 != null) {
                    c20Var2.a(Long.valueOf(j3));
                    return;
                }
                return;
            }
            if (i11 == 1) {
                if (qg0Var != null) {
                    org.telegram.messenger.g0.v1(qg0Var.getEditText());
                }
                bi.oc ocVar = new bi.oc(f1Var.getContext(), h6Var, user, new wg.x0(f1Var, 11));
                if (!org.telegram.messenger.g0.Q1()) {
                    ocVar.a0(f1Var.i1);
                }
                ocVar.show();
                return;
            }
            if (i11 == 0 || i11 == 2) {
                if (org.telegram.messenger.t10.b(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).b2(j3))) {
                    org.telegram.messenger.camera.q.s(org.telegram.messenger.id.a0(null, null, 2131743742, org.telegram.messenger.m5.t(j3)), new gc(f1Var.c, h6Var), R.raw.error, 36);
                    return;
                }
                zh.g1 g1Var = new zh.g1(f1Var.getContext(), this.b, j3, wg.r.c(wg.r.b(1, f1Var.m2)), new wg.y0(f1Var, true ? 1 : 0));
                org.telegram.messenger.t1 t1Var = f1Var.q2;
                g1Var.e1(t1Var != null && t1Var.a(j3));
                g1Var.show();
                return;
            }
            int i14 = 4;
            if (i11 == 4) {
                if (hashSet.isEmpty()) {
                    hashSet.add(Long.valueOf(j3));
                    org.telegram.messenger.v10 v10Var = f1Var.y2;
                    if (v10Var != null) {
                        wo woVar = f1Var.X1;
                        v10Var.a(Boolean.valueOf(woVar != null && woVar.a.q), hashSet);
                        f1Var.y2 = null;
                    }
                    f1Var.dismiss();
                    return;
                }
                i14 = 4;
            }
            boolean z10 = (i11 == i14 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                f1Var.i2.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == f1Var.h1() + 1) {
                hashSet.remove(Long.valueOf(j3));
                f1Var.m1();
                return;
            }
            boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                aVar.setVisibility(0);
                aVar.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : org.telegram.messenger.g0.L(12.0f)).setInterpolator(wq.h).setDuration(320L).withEndAction(!z11 ? new wg.x0(f1Var, true ? 1 : 0) : null).start();
                xg.i iVar = f1Var.k2;
                boolean z12 = !z11;
                if (iVar.D != z12) {
                    iVar.D = z12;
                    org.telegram.messenger.g0.d0(iVar.f, new xg.g(z12));
                }
            }
            f1Var.e1();
            qg0Var.b(true, hashSet, new wg.x0(f1Var, i10), null);
            f1Var.p1(true, true);
            f1Var.f1();
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    public /* synthetic */ ts(p4.c1 c1Var, Surface surface, int i7, int i10) {
        this.c = c1Var;
        this.d = surface;
        this.a = i7;
        this.b = i10;
    }

    public /* synthetic */ ts(wg.f1 f1Var, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        this.c = f1Var;
        this.a = i7;
        this.d = h6Var;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
