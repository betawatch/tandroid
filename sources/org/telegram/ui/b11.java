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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class b11 extends org.telegram.ui.Components.oj0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ q11 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public b11(q11 q11Var) {
        this.s = q11Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 3 || i7 == 4;
    }

    public final void E(boolean z9) {
        q11 q11Var = this.s;
        int i7 = q11Var.W;
        boolean z10 = q11Var.I;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z11 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = q11Var.B1;
        int i10 = 1;
        if (arrayList2 != null) {
            if (i7 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.n;
                this.n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i12 = 0; i12 < q11Var.B1.size(); i12++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, q11Var.B1.get(i12))));
            }
        }
        if (i7 == 14) {
            ArrayList arrayList3 = q11Var.C1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.n;
                this.n = i13 + 1;
                this.f = i13;
                arrayList.add(2);
                this.c = this.n;
                for (int i14 = 0; i14 < q11Var.C1.size(); i14++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, q11Var.C1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = q11Var.D1;
            if (arrayList4 != null) {
                if (i7 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.n;
                    this.n = i15 + 1;
                    this.f = i15;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i16 = 0; i16 < q11Var.D1.size(); i16++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, q11Var.D1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = q11Var.E1;
        if (arrayList5 != null) {
            int i17 = this.n;
            this.h = i17;
            this.n = arrayList5.size() + i17;
        }
        f();
        if (q11Var.z1 && this.n == 0) {
            z11 = true;
        }
        if (q11Var.H1 == z11) {
            return;
        }
        q11Var.H1 = z11;
        ValueAnimator valueAnimator = q11Var.I1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        q11Var.I1 = ofFloat;
        ofFloat.addUpdateListener(new wz0(q11Var, z11, i10));
        q11Var.I1.addListener(new k01(q11Var, z11, i10));
        q11Var.I1.setInterpolator(org.telegram.ui.Components.xq.h);
        q11Var.I1.setDuration(100L);
        q11Var.I1.start();
        if (z11) {
            q11.D(q11Var.V, q11Var.l0);
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
        q11 q11Var = this.s;
        if (q11Var.W == 14) {
            ArrayList arrayList = q11Var.C1;
            if (arrayList != null && i7 >= (i10 = this.c) && i7 - i10 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i7 > this.c && (i7 - r2) - 1 < q11Var.D1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = q11Var.B1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i7 > this.d && (i7 - r5) - 1 < arrayList2.size() && (q11Var.W == 13 || ((ch.o0) q11Var.B1.get((i7 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i11 = this.h;
        if (i7 - i11 < 0 || i7 - i11 >= q11Var.E1.size()) {
            return 4;
        }
        return q11Var.E1.get(i7 - this.h) instanceof n11 ? 6 : 3;
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
        q11 q11Var = this.s;
        HashSet hashSet = q11Var.K;
        int i13 = q11Var.W;
        int i14 = q11Var.V;
        e01 e01Var = q11Var.i0;
        int i15 = d1Var.f;
        View view = d1Var.a;
        if (i15 == 6) {
            w01 w01Var = (w01) view;
            ArrayList arrayList = q11Var.E1;
            if (arrayList != null && (i12 = i7 - this.h) >= 0 && i12 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) q11Var.E1.get(i7 - this.h);
                if (document2 instanceof n11) {
                    CharSequence charSequence = ((n11) document2).a;
                    String str = q11Var.A1;
                    w01Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jf, w01Var.f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    w01Var.a.setText(charSequence);
                    w01Var.b(false);
                }
            } else if (i7 == this.e) {
                w01Var.a(org.telegram.messenger.hd.M0(2131751197, null), false);
            } else if (i13 == 14) {
                w01Var.a(org.telegram.messenger.hd.M0(2131744877, null), false);
            } else {
                w01Var.a(org.telegram.messenger.hd.M0(2131754756, null), false);
            }
            w01Var.c.setVisibility(8);
            return;
        }
        if (i15 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) q11Var.D1.get((i7 - this.c) - 1);
            a11 a11Var = (a11) view;
            a11Var.a(e01Var);
            a11Var.h.r0(org.telegram.messenger.hc.b(document3), "100_100_firstframe", null, null, org.telegram.messenger.t5.f(document3, org.telegram.ui.ActionBar.k6.m6, 0.2f, null), 0L, "tgs", document3, 0);
            a11Var.Q = true;
            a11Var.d = document3;
            a11Var.e = null;
            return;
        }
        if (i15 != 4) {
            if (i15 == 3) {
                a11 a11Var2 = (a11) view;
                a11Var2.a = false;
                a11Var2.c = i7;
                a11Var2.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                a11Var2.setDrawable(null);
                ArrayList arrayList2 = q11Var.B1;
                if (arrayList2 == null || i7 < 0 || i7 >= arrayList2.size()) {
                    ArrayList arrayList3 = q11Var.E1;
                    if (arrayList3 != null && (i10 = i7 - this.h) >= 0 && i10 < arrayList3.size()) {
                        document = (TLRPC.Document) q11Var.E1.get(i7 - this.h);
                        if (!(document instanceof n11)) {
                            l10 = null;
                        }
                    }
                    document = null;
                    l10 = null;
                } else {
                    ch.o0 o0Var2 = (ch.o0) q11Var.B1.get(i7);
                    a11Var2.y = o0Var2;
                    long j3 = o0Var2.g;
                    if (j3 == 0) {
                        boolean contains2 = q11Var.J.contains(o0Var2);
                        a11Var2.D = true;
                        a11Var2.setDrawable(org.telegram.messenger.i6.g(o0Var2.f));
                        a11Var2.d(contains2, false);
                        return;
                    }
                    l10 = Long.valueOf(j3);
                    if (i13 == 14 && !org.telegram.messenger.p10.i(i14).q() && o0Var2.b && o0Var2.d) {
                        a11Var2.b();
                        a11Var2.J.setVisibility(0);
                    } else {
                        z01 z01Var = a11Var2.J;
                        if (z01Var != null) {
                            z01Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l10 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        a11Var2.e = new org.telegram.ui.Components.r5(document, (Paint.FontMetricsInt) null);
                        a11Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(l10.longValue(), (Paint.FontMetricsInt) null);
                        a11Var2.e = r5Var;
                        a11Var2.d = r5Var.document;
                        contains = hashSet.contains(l10);
                    }
                    org.telegram.ui.Components.i5 i5Var = (org.telegram.ui.Components.i5) e01Var.k3.get(a11Var2.e.getDocumentId());
                    if (i5Var == null) {
                        cacheType = q11Var.getCacheType();
                        i5Var = org.telegram.ui.Components.i5.m(i14, a11Var2.e.getDocumentId(), null, cacheType);
                        e01Var.k3.put(a11Var2.e.getDocumentId(), i5Var);
                    }
                    a11Var2.setDrawable(i5Var);
                }
                a11Var2.d(contains, false);
                return;
            }
            return;
        }
        a11 a11Var3 = (a11) view;
        a11Var3.c = i7;
        ImageReceiver imageReceiver = a11Var3.n;
        ArrayList arrayList4 = q11Var.B1;
        if (arrayList4 == null || i7 < 0 || i7 >= arrayList4.size()) {
            ArrayList arrayList5 = q11Var.C1;
            if (arrayList5 == null || i7 < (i11 = this.c) || i7 - i11 >= arrayList5.size()) {
                return;
            } else {
                o0Var = (ch.o0) q11Var.C1.get(i7 - this.c);
            }
        } else {
            o0Var = (ch.o0) q11Var.B1.get(i7);
        }
        if (a11Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(a11Var3);
            a11Var3.h = imageReceiver2;
            imageReceiver2.E0(7);
            a11Var3.h.P();
        }
        a11Var3.h.H0(e01Var);
        a11Var3.y = o0Var;
        a11Var3.D = false;
        a11Var3.d(q11Var.J.contains(o0Var), false);
        a11Var3.b = false;
        a11Var3.invalidate();
        if (i13 == 13) {
            a11Var3.setDrawable(org.telegram.messenger.i6.g(o0Var.f));
        } else if (o0Var.b || o0Var.f == null) {
            a11Var3.s = false;
            a11Var3.e = new org.telegram.ui.Components.r5(o0Var.g, (Paint.FontMetricsInt) null);
            a11Var3.d = null;
            a11Var3.h.f();
            imageReceiver.f();
            org.telegram.ui.Components.i5 i5Var2 = (org.telegram.ui.Components.i5) e01Var.k3.get(a11Var3.e.getDocumentId());
            if (i5Var2 == null) {
                cacheType2 = q11Var.getCacheType();
                i5Var2 = org.telegram.ui.Components.i5.m(i14, a11Var3.e.getDocumentId(), null, cacheType2);
                e01Var.k3.put(a11Var3.e.getDocumentId(), i5Var2);
            }
            a11Var3.setDrawable(i5Var2);
        } else {
            a11Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i14).r.get(o0Var.f);
            if (tL_availableReaction != null) {
                org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.k6.m6, 0.2f, null);
                if (org.telegram.messenger.rc.e(8200)) {
                    ch.o0 o0Var3 = o0Var;
                    a11Var3.h.u0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", o0Var3, 0);
                    o0Var = o0Var3;
                } else {
                    a11Var3.h.r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", o0Var, 0);
                }
                org.telegram.messenger.ui.b0(i14);
                org.telegram.messenger.ui.m1(imageReceiver, org.telegram.messenger.hc.b(tL_availableReaction.around_animation), ch.k0.a());
            } else {
                a11Var3.h.f();
                imageReceiver.f();
            }
            a11Var3.e = null;
            a11Var3.d = null;
            a11Var3.setDrawable(null);
            z01 z01Var2 = a11Var3.J;
            if (z01Var2 != null) {
                z01Var2.setVisibility(8);
                a11Var3.J.setImageReceiver(null);
            }
            if (tL_availableReaction == null && o0Var.b) {
                a11Var3.setDrawable(org.telegram.messenger.i6.g(o0Var.f));
            }
        }
        if (!org.telegram.messenger.p10.i(i14).q() && i13 == 14 && o0Var.b && o0Var.d) {
            a11Var3.b();
            a11Var3.J.setVisibility(0);
            a11Var3.setEmojicon(null);
            return;
        }
        if (o0Var.e) {
            a11Var3.setEmojicon(o0Var.f);
        } else {
            a11Var3.setEmojicon(null);
        }
        z01 z01Var3 = a11Var3.J;
        if (z01Var3 != null) {
            z01Var3.setVisibility(4);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View a11Var;
        q11 q11Var = this.s;
        if (i7 == 6) {
            a11Var = new w01(q11Var, q11Var.getContext(), q11Var.W == 6);
        } else if (i7 == 7) {
            a11Var = new org.telegram.ui.Components.tm(q11Var.getContext(), 24);
            a11Var.setTag("searchbox");
        } else {
            a11Var = new a11(q11Var, q11Var.getContext());
        }
        if (q11.c(q11Var)) {
            a11Var.setScaleX(0.0f);
            a11Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.xi0(a11Var);
    }
}
