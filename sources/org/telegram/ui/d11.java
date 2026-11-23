package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class d11 extends org.telegram.ui.Components.dk0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ s11 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public d11(s11 s11Var) {
        this.s = s11Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 3 || i7 == 4;
    }

    public final void E(boolean z10) {
        s11 s11Var = this.s;
        int i7 = s11Var.a0;
        boolean z11 = s11Var.J;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z12 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = s11Var.C1;
        int i10 = 1;
        if (arrayList2 != null) {
            if (i7 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.n;
                this.n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i12 = 0; i12 < s11Var.C1.size(); i12++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, s11Var.C1.get(i12))));
            }
        }
        if (i7 == 14) {
            ArrayList arrayList3 = s11Var.D1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.n;
                this.n = i13 + 1;
                this.f = i13;
                arrayList.add(2);
                this.c = this.n;
                for (int i14 = 0; i14 < s11Var.D1.size(); i14++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, s11Var.D1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = s11Var.E1;
            if (arrayList4 != null) {
                if (i7 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.n;
                    this.n = i15 + 1;
                    this.f = i15;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i16 = 0; i16 < s11Var.E1.size(); i16++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, s11Var.E1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = s11Var.F1;
        if (arrayList5 != null) {
            int i17 = this.n;
            this.h = i17;
            this.n = arrayList5.size() + i17;
        }
        f();
        if (s11Var.A1 && this.n == 0) {
            z12 = true;
        }
        if (s11Var.I1 == z12) {
            return;
        }
        s11Var.I1 = z12;
        ValueAnimator valueAnimator = s11Var.J1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        s11Var.J1 = ofFloat;
        ofFloat.addUpdateListener(new zz0(s11Var, z12, i10));
        s11Var.J1.addListener(new m01(s11Var, z12, i10));
        s11Var.J1.setInterpolator(org.telegram.ui.Components.nr.h);
        s11Var.J1.setDuration(100L);
        s11Var.J1.start();
        if (z12) {
            s11.D(s11Var.W, s11Var.m0);
        }
    }

    @Override // v4.i0
    public final int b() {
        return this.n;
    }

    @Override // v4.i0
    public final int d(int i7) {
        int i10;
        if (i7 == this.e || i7 == this.f) {
            return 6;
        }
        s11 s11Var = this.s;
        if (s11Var.a0 == 14) {
            ArrayList arrayList = s11Var.D1;
            if (arrayList != null && i7 >= (i10 = this.c) && i7 - i10 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i7 > this.c && (i7 - r2) - 1 < s11Var.E1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = s11Var.C1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i7 > this.d && (i7 - r5) - 1 < arrayList2.size() && (s11Var.a0 == 13 || ((ch.p0) s11Var.C1.get((i7 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i11 = this.h;
        if (i7 - i11 < 0 || i7 - i11 >= s11Var.F1.size()) {
            return 4;
        }
        return s11Var.F1.get(i7 - this.h) instanceof p11 ? 6 : 3;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.Document document;
        Long l10;
        int i10;
        boolean contains;
        int cacheType;
        int i11;
        ch.p0 p0Var;
        int cacheType2;
        int i12;
        int indexOf;
        s11 s11Var = this.s;
        HashSet hashSet = s11Var.L;
        int i13 = s11Var.a0;
        int i14 = s11Var.W;
        g01 g01Var = s11Var.j0;
        int i15 = f1Var.f;
        View view = f1Var.a;
        if (i15 == 6) {
            y01 y01Var = (y01) view;
            ArrayList arrayList = s11Var.F1;
            if (arrayList != null && (i12 = i7 - this.h) >= 0 && i12 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) s11Var.F1.get(i7 - this.h);
                if (document2 instanceof p11) {
                    CharSequence charSequence = ((p11) document2).a;
                    String str = s11Var.B1;
                    y01Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Mf, y01Var.f.a1)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    y01Var.a.setText(charSequence);
                    y01Var.b(false);
                }
            } else if (i7 == this.e) {
                y01Var.a(org.telegram.messenger.hd.N0(2131751184, null), false);
            } else if (i13 == 14) {
                y01Var.a(org.telegram.messenger.hd.N0(2131744633, null), false);
            } else {
                y01Var.a(org.telegram.messenger.hd.N0(2131754755, null), false);
            }
            y01Var.c.setVisibility(8);
            return;
        }
        if (i15 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) s11Var.E1.get((i7 - this.c) - 1);
            c11 c11Var = (c11) view;
            c11Var.a(g01Var);
            c11Var.h.r0(org.telegram.messenger.gc.b(document3), "100_100_firstframe", null, null, org.telegram.messenger.u5.f(document3, org.telegram.ui.ActionBar.m6.m6, 0.2f, null), 0L, "tgs", document3, 0);
            c11Var.R = true;
            c11Var.d = document3;
            c11Var.e = null;
            return;
        }
        if (i15 != 4) {
            if (i15 == 3) {
                c11 c11Var2 = (c11) view;
                c11Var2.a = false;
                c11Var2.c = i7;
                c11Var2.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                c11Var2.setDrawable(null);
                ArrayList arrayList2 = s11Var.C1;
                if (arrayList2 == null || i7 < 0 || i7 >= arrayList2.size()) {
                    ArrayList arrayList3 = s11Var.F1;
                    if (arrayList3 != null && (i10 = i7 - this.h) >= 0 && i10 < arrayList3.size()) {
                        document = (TLRPC.Document) s11Var.F1.get(i7 - this.h);
                        if (!(document instanceof p11)) {
                            l10 = null;
                        }
                    }
                    document = null;
                    l10 = null;
                } else {
                    ch.p0 p0Var2 = (ch.p0) s11Var.C1.get(i7);
                    c11Var2.y = p0Var2;
                    long j3 = p0Var2.g;
                    if (j3 == 0) {
                        boolean contains2 = s11Var.K.contains(p0Var2);
                        c11Var2.E = true;
                        c11Var2.setDrawable(org.telegram.messenger.j6.g(p0Var2.f));
                        c11Var2.d(contains2, false);
                        return;
                    }
                    l10 = Long.valueOf(j3);
                    if (i13 == 14 && !org.telegram.messenger.k10.i(i14).q() && p0Var2.b && p0Var2.d) {
                        c11Var2.b();
                        c11Var2.K.setVisibility(0);
                    } else {
                        b11 b11Var = c11Var2.K;
                        if (b11Var != null) {
                            b11Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l10 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        c11Var2.e = new org.telegram.ui.Components.y5(document, (Paint.FontMetricsInt) null);
                        c11Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(l10.longValue(), (Paint.FontMetricsInt) null);
                        c11Var2.e = y5Var;
                        c11Var2.d = y5Var.document;
                        contains = hashSet.contains(l10);
                    }
                    org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) g01Var.l3.get(c11Var2.e.getDocumentId());
                    if (p5Var == null) {
                        cacheType = s11Var.getCacheType();
                        p5Var = org.telegram.ui.Components.p5.m(i14, c11Var2.e.getDocumentId(), null, cacheType);
                        g01Var.l3.put(c11Var2.e.getDocumentId(), p5Var);
                    }
                    c11Var2.setDrawable(p5Var);
                }
                c11Var2.d(contains, false);
                return;
            }
            return;
        }
        c11 c11Var3 = (c11) view;
        c11Var3.c = i7;
        ImageReceiver imageReceiver = c11Var3.n;
        ArrayList arrayList4 = s11Var.C1;
        if (arrayList4 == null || i7 < 0 || i7 >= arrayList4.size()) {
            ArrayList arrayList5 = s11Var.D1;
            if (arrayList5 == null || i7 < (i11 = this.c) || i7 - i11 >= arrayList5.size()) {
                return;
            } else {
                p0Var = (ch.p0) s11Var.D1.get(i7 - this.c);
            }
        } else {
            p0Var = (ch.p0) s11Var.C1.get(i7);
        }
        if (c11Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(c11Var3);
            c11Var3.h = imageReceiver2;
            imageReceiver2.E0(7);
            c11Var3.h.P();
        }
        c11Var3.h.H0(g01Var);
        c11Var3.y = p0Var;
        c11Var3.E = false;
        c11Var3.d(s11Var.K.contains(p0Var), false);
        c11Var3.b = false;
        c11Var3.invalidate();
        if (i13 == 13) {
            c11Var3.setDrawable(org.telegram.messenger.j6.g(p0Var.f));
        } else if (p0Var.b || p0Var.f == null) {
            c11Var3.s = false;
            c11Var3.e = new org.telegram.ui.Components.y5(p0Var.g, (Paint.FontMetricsInt) null);
            c11Var3.d = null;
            c11Var3.h.f();
            imageReceiver.f();
            org.telegram.ui.Components.p5 p5Var2 = (org.telegram.ui.Components.p5) g01Var.l3.get(c11Var3.e.getDocumentId());
            if (p5Var2 == null) {
                cacheType2 = s11Var.getCacheType();
                p5Var2 = org.telegram.ui.Components.p5.m(i14, c11Var3.e.getDocumentId(), null, cacheType2);
                g01Var.l3.put(c11Var3.e.getDocumentId(), p5Var2);
            }
            c11Var3.setDrawable(p5Var2);
        } else {
            c11Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.si.d0(i14).r.get(p0Var.f);
            if (tL_availableReaction != null) {
                org.telegram.messenger.mz f10 = org.telegram.messenger.u5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.m6.m6, 0.2f, null);
                if (org.telegram.messenger.qc.e(8200)) {
                    ch.p0 p0Var3 = p0Var;
                    c11Var3.h.u0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", p0Var3, 0);
                    p0Var = p0Var3;
                } else {
                    c11Var3.h.r0(org.telegram.messenger.gc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", p0Var, 0);
                }
                org.telegram.messenger.si.d0(i14);
                org.telegram.messenger.si.p1(imageReceiver, org.telegram.messenger.gc.b(tL_availableReaction.around_animation), ch.l0.a());
            } else {
                c11Var3.h.f();
                imageReceiver.f();
            }
            c11Var3.e = null;
            c11Var3.d = null;
            c11Var3.setDrawable(null);
            b11 b11Var2 = c11Var3.K;
            if (b11Var2 != null) {
                b11Var2.setVisibility(8);
                c11Var3.K.setImageReceiver(null);
            }
            if (tL_availableReaction == null && p0Var.b) {
                c11Var3.setDrawable(org.telegram.messenger.j6.g(p0Var.f));
            }
        }
        if (!org.telegram.messenger.k10.i(i14).q() && i13 == 14 && p0Var.b && p0Var.d) {
            c11Var3.b();
            c11Var3.K.setVisibility(0);
            c11Var3.setEmojicon(null);
            return;
        }
        if (p0Var.e) {
            c11Var3.setEmojicon(p0Var.f);
        } else {
            c11Var3.setEmojicon(null);
        }
        b11 b11Var3 = c11Var3.K;
        if (b11Var3 != null) {
            b11Var3.setVisibility(4);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View c11Var;
        s11 s11Var = this.s;
        if (i7 == 6) {
            c11Var = new y01(s11Var, s11Var.getContext(), s11Var.a0 == 6);
        } else if (i7 == 7) {
            c11Var = new org.telegram.ui.Components.ln(s11Var.getContext(), 24);
            c11Var.setTag("searchbox");
        } else {
            c11Var = new c11(s11Var, s11Var.getContext());
        }
        if (s11.c(s11Var)) {
            c11Var.setScaleX(0.0f);
            c11Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.mj0(c11Var);
    }
}
