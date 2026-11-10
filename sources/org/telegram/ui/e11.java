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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e11 extends org.telegram.ui.Components.oj0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ t11 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public e11(t11 t11Var) {
        this.s = t11Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 3 || i7 == 4;
    }

    public final void E(boolean z9) {
        t11 t11Var = this.s;
        int i7 = t11Var.W;
        boolean z10 = t11Var.I;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z11 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = t11Var.B1;
        int i10 = 1;
        if (arrayList2 != null) {
            if (i7 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.n;
                this.n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i12 = 0; i12 < t11Var.B1.size(); i12++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, t11Var.B1.get(i12))));
            }
        }
        if (i7 == 14) {
            ArrayList arrayList3 = t11Var.C1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.n;
                this.n = i13 + 1;
                this.f = i13;
                arrayList.add(2);
                this.c = this.n;
                for (int i14 = 0; i14 < t11Var.C1.size(); i14++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, t11Var.C1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = t11Var.D1;
            if (arrayList4 != null) {
                if (i7 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.n;
                    this.n = i15 + 1;
                    this.f = i15;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i16 = 0; i16 < t11Var.D1.size(); i16++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, t11Var.D1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = t11Var.E1;
        if (arrayList5 != null) {
            int i17 = this.n;
            this.h = i17;
            this.n = arrayList5.size() + i17;
        }
        f();
        if (t11Var.z1 && this.n == 0) {
            z11 = true;
        }
        if (t11Var.H1 == z11) {
            return;
        }
        t11Var.H1 = z11;
        ValueAnimator valueAnimator = t11Var.I1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        t11Var.I1 = ofFloat;
        ofFloat.addUpdateListener(new a01(t11Var, z11, i10));
        t11Var.I1.addListener(new n01(t11Var, z11, i10));
        t11Var.I1.setInterpolator(org.telegram.ui.Components.wq.h);
        t11Var.I1.setDuration(100L);
        t11Var.I1.start();
        if (z11) {
            t11.D(t11Var.V, t11Var.l0);
        }
    }

    @Override // v4.g0
    public final int b() {
        return this.n;
    }

    @Override // v4.g0
    public final int d(int i7) {
        int i10;
        if (i7 == this.e || i7 == this.f) {
            return 6;
        }
        t11 t11Var = this.s;
        if (t11Var.W == 14) {
            ArrayList arrayList = t11Var.C1;
            if (arrayList != null && i7 >= (i10 = this.c) && i7 - i10 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i7 > this.c && (i7 - r2) - 1 < t11Var.D1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = t11Var.B1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i7 > this.d && (i7 - r5) - 1 < arrayList2.size() && (t11Var.W == 13 || ((ch.o0) t11Var.B1.get((i7 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i11 = this.h;
        if (i7 - i11 < 0 || i7 - i11 >= t11Var.E1.size()) {
            return 4;
        }
        return t11Var.E1.get(i7 - this.h) instanceof q11 ? 6 : 3;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.Document document;
        Long l10;
        int i10;
        boolean contains;
        int cacheType;
        int i11;
        ch.o0 o0Var;
        int cacheType2;
        int i12;
        int indexOf;
        t11 t11Var = this.s;
        HashSet hashSet = t11Var.K;
        int i13 = t11Var.W;
        int i14 = t11Var.V;
        h01 h01Var = t11Var.i0;
        int i15 = d1Var.f;
        View view = d1Var.a;
        if (i15 == 6) {
            z01 z01Var = (z01) view;
            ArrayList arrayList = t11Var.E1;
            if (arrayList != null && (i12 = i7 - this.h) >= 0 && i12 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) t11Var.E1.get(i7 - this.h);
                if (document2 instanceof q11) {
                    CharSequence charSequence = ((q11) document2).a;
                    String str = t11Var.A1;
                    z01Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Jf, z01Var.f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    z01Var.a.setText(charSequence);
                    z01Var.b(false);
                }
            } else if (i7 == this.e) {
                z01Var.a(org.telegram.messenger.id.M0(2131751196, null), false);
            } else if (i13 == 14) {
                z01Var.a(org.telegram.messenger.id.M0(2131744876, null), false);
            } else {
                z01Var.a(org.telegram.messenger.id.M0(2131754756, null), false);
            }
            z01Var.c.setVisibility(8);
            return;
        }
        if (i15 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) t11Var.D1.get((i7 - this.c) - 1);
            d11 d11Var = (d11) view;
            d11Var.a(h01Var);
            d11Var.h.r0(org.telegram.messenger.hc.b(document3), "100_100_firstframe", null, null, org.telegram.messenger.t5.f(document3, org.telegram.ui.ActionBar.m6.m6, 0.2f, null), 0L, "tgs", document3, 0);
            d11Var.Q = true;
            d11Var.d = document3;
            d11Var.e = null;
            return;
        }
        if (i15 != 4) {
            if (i15 == 3) {
                d11 d11Var2 = (d11) view;
                d11Var2.a = false;
                d11Var2.c = i7;
                d11Var2.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                d11Var2.setDrawable(null);
                ArrayList arrayList2 = t11Var.B1;
                if (arrayList2 == null || i7 < 0 || i7 >= arrayList2.size()) {
                    ArrayList arrayList3 = t11Var.E1;
                    if (arrayList3 != null && (i10 = i7 - this.h) >= 0 && i10 < arrayList3.size()) {
                        document = (TLRPC.Document) t11Var.E1.get(i7 - this.h);
                        if (!(document instanceof q11)) {
                            l10 = null;
                        }
                    }
                    document = null;
                    l10 = null;
                } else {
                    ch.o0 o0Var2 = (ch.o0) t11Var.B1.get(i7);
                    d11Var2.y = o0Var2;
                    long j3 = o0Var2.g;
                    if (j3 == 0) {
                        boolean contains2 = t11Var.J.contains(o0Var2);
                        d11Var2.D = true;
                        d11Var2.setDrawable(org.telegram.messenger.i6.g(o0Var2.f));
                        d11Var2.d(contains2, false);
                        return;
                    }
                    l10 = Long.valueOf(j3);
                    if (i13 == 14 && !org.telegram.messenger.p10.i(i14).q() && o0Var2.b && o0Var2.d) {
                        d11Var2.b();
                        d11Var2.J.setVisibility(0);
                    } else {
                        c11 c11Var = d11Var2.J;
                        if (c11Var != null) {
                            c11Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l10 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        d11Var2.e = new org.telegram.ui.Components.q5(document, (Paint.FontMetricsInt) null);
                        d11Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(l10.longValue(), (Paint.FontMetricsInt) null);
                        d11Var2.e = q5Var;
                        d11Var2.d = q5Var.document;
                        contains = hashSet.contains(l10);
                    }
                    org.telegram.ui.Components.h5 h5Var = (org.telegram.ui.Components.h5) h01Var.k3.get(d11Var2.e.getDocumentId());
                    if (h5Var == null) {
                        cacheType = t11Var.getCacheType();
                        h5Var = org.telegram.ui.Components.h5.m(i14, d11Var2.e.getDocumentId(), null, cacheType);
                        h01Var.k3.put(d11Var2.e.getDocumentId(), h5Var);
                    }
                    d11Var2.setDrawable(h5Var);
                }
                d11Var2.d(contains, false);
                return;
            }
            return;
        }
        d11 d11Var3 = (d11) view;
        d11Var3.c = i7;
        ImageReceiver imageReceiver = d11Var3.n;
        ArrayList arrayList4 = t11Var.B1;
        if (arrayList4 == null || i7 < 0 || i7 >= arrayList4.size()) {
            ArrayList arrayList5 = t11Var.C1;
            if (arrayList5 == null || i7 < (i11 = this.c) || i7 - i11 >= arrayList5.size()) {
                return;
            } else {
                o0Var = (ch.o0) t11Var.C1.get(i7 - this.c);
            }
        } else {
            o0Var = (ch.o0) t11Var.B1.get(i7);
        }
        if (d11Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(d11Var3);
            d11Var3.h = imageReceiver2;
            imageReceiver2.E0(7);
            d11Var3.h.P();
        }
        d11Var3.h.H0(h01Var);
        d11Var3.y = o0Var;
        d11Var3.D = false;
        d11Var3.d(t11Var.J.contains(o0Var), false);
        d11Var3.b = false;
        d11Var3.invalidate();
        if (i13 == 13) {
            d11Var3.setDrawable(org.telegram.messenger.i6.g(o0Var.f));
        } else if (o0Var.b || o0Var.f == null) {
            d11Var3.s = false;
            d11Var3.e = new org.telegram.ui.Components.q5(o0Var.g, (Paint.FontMetricsInt) null);
            d11Var3.d = null;
            d11Var3.h.f();
            imageReceiver.f();
            org.telegram.ui.Components.h5 h5Var2 = (org.telegram.ui.Components.h5) h01Var.k3.get(d11Var3.e.getDocumentId());
            if (h5Var2 == null) {
                cacheType2 = t11Var.getCacheType();
                h5Var2 = org.telegram.ui.Components.h5.m(i14, d11Var3.e.getDocumentId(), null, cacheType2);
                h01Var.k3.put(d11Var3.e.getDocumentId(), h5Var2);
            }
            d11Var3.setDrawable(h5Var2);
        } else {
            d11Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i14).r.get(o0Var.f);
            if (tL_availableReaction != null) {
                org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.m6.m6, 0.2f, null);
                if (org.telegram.messenger.sc.e(8200)) {
                    ch.o0 o0Var3 = o0Var;
                    d11Var3.h.u0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", o0Var3, 0);
                    o0Var = o0Var3;
                } else {
                    d11Var3.h.r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", o0Var, 0);
                }
                org.telegram.messenger.ui.b0(i14);
                org.telegram.messenger.ui.m1(imageReceiver, org.telegram.messenger.hc.b(tL_availableReaction.around_animation), ch.k0.a());
            } else {
                d11Var3.h.f();
                imageReceiver.f();
            }
            d11Var3.e = null;
            d11Var3.d = null;
            d11Var3.setDrawable(null);
            c11 c11Var2 = d11Var3.J;
            if (c11Var2 != null) {
                c11Var2.setVisibility(8);
                d11Var3.J.setImageReceiver(null);
            }
            if (tL_availableReaction == null && o0Var.b) {
                d11Var3.setDrawable(org.telegram.messenger.i6.g(o0Var.f));
            }
        }
        if (!org.telegram.messenger.p10.i(i14).q() && i13 == 14 && o0Var.b && o0Var.d) {
            d11Var3.b();
            d11Var3.J.setVisibility(0);
            d11Var3.setEmojicon(null);
            return;
        }
        if (o0Var.e) {
            d11Var3.setEmojicon(o0Var.f);
        } else {
            d11Var3.setEmojicon(null);
        }
        c11 c11Var3 = d11Var3.J;
        if (c11Var3 != null) {
            c11Var3.setVisibility(4);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View d11Var;
        t11 t11Var = this.s;
        if (i7 == 6) {
            d11Var = new z01(t11Var, t11Var.getContext(), t11Var.W == 6);
        } else if (i7 == 7) {
            d11Var = new org.telegram.ui.Components.sm(t11Var.getContext(), 24);
            d11Var.setTag("searchbox");
        } else {
            d11Var = new d11(t11Var, t11Var.getContext());
        }
        if (t11.c(t11Var)) {
            d11Var.setScaleX(0.0f);
            d11Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.xi0(d11Var);
    }
}
