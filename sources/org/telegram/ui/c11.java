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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class c11 extends org.telegram.ui.Components.bk0 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ r11 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public c11(r11 r11Var) {
        this.s = r11Var;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 3 || i7 == 4;
    }

    public final void E(boolean z10) {
        r11 r11Var = this.s;
        int i7 = r11Var.a0;
        boolean z11 = r11Var.J;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z12 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = r11Var.C1;
        int i10 = 1;
        if (arrayList2 != null) {
            if (i7 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.n;
                this.n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i12 = 0; i12 < r11Var.C1.size(); i12++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, r11Var.C1.get(i12))));
            }
        }
        if (i7 == 14) {
            ArrayList arrayList3 = r11Var.D1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.n;
                this.n = i13 + 1;
                this.f = i13;
                arrayList.add(2);
                this.c = this.n;
                for (int i14 = 0; i14 < r11Var.D1.size(); i14++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, r11Var.D1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = r11Var.E1;
            if (arrayList4 != null) {
                if (i7 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.n;
                    this.n = i15 + 1;
                    this.f = i15;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i16 = 0; i16 < r11Var.E1.size(); i16++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, r11Var.E1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = r11Var.F1;
        if (arrayList5 != null) {
            int i17 = this.n;
            this.h = i17;
            this.n = arrayList5.size() + i17;
        }
        f();
        if (r11Var.A1 && this.n == 0) {
            z12 = true;
        }
        if (r11Var.I1 == z12) {
            return;
        }
        r11Var.I1 = z12;
        ValueAnimator valueAnimator = r11Var.J1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        r11Var.J1 = ofFloat;
        ofFloat.addUpdateListener(new yz0(r11Var, z12, i10));
        r11Var.J1.addListener(new l01(r11Var, z12, i10));
        r11Var.J1.setInterpolator(org.telegram.ui.Components.lr.h);
        r11Var.J1.setDuration(100L);
        r11Var.J1.start();
        if (z12) {
            r11.D(r11Var.W, r11Var.m0);
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
        r11 r11Var = this.s;
        if (r11Var.a0 == 14) {
            ArrayList arrayList = r11Var.D1;
            if (arrayList != null && i7 >= (i10 = this.c) && i7 - i10 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i7 > this.c && (i7 - r2) - 1 < r11Var.E1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = r11Var.C1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i7 > this.d && (i7 - r5) - 1 < arrayList2.size() && (r11Var.a0 == 13 || ((ch.p0) r11Var.C1.get((i7 - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i11 = this.h;
        if (i7 - i11 < 0 || i7 - i11 >= r11Var.F1.size()) {
            return 4;
        }
        return r11Var.F1.get(i7 - this.h) instanceof o11 ? 6 : 3;
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
        r11 r11Var = this.s;
        HashSet hashSet = r11Var.L;
        int i13 = r11Var.a0;
        int i14 = r11Var.W;
        f01 f01Var = r11Var.j0;
        int i15 = f1Var.f;
        View view = f1Var.a;
        if (i15 == 6) {
            x01 x01Var = (x01) view;
            ArrayList arrayList = r11Var.F1;
            if (arrayList != null && (i12 = i7 - this.h) >= 0 && i12 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) r11Var.F1.get(i7 - this.h);
                if (document2 instanceof o11) {
                    CharSequence charSequence = ((o11) document2).a;
                    String str = r11Var.B1;
                    x01Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Mf, x01Var.f.a1)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    x01Var.a.setText(charSequence);
                    x01Var.b(false);
                }
            } else if (i7 == this.e) {
                x01Var.a(org.telegram.messenger.gd.M0(2131751185, null), false);
            } else if (i13 == 14) {
                x01Var.a(org.telegram.messenger.gd.M0(2131744641, null), false);
            } else {
                x01Var.a(org.telegram.messenger.gd.M0(2131754756, null), false);
            }
            x01Var.c.setVisibility(8);
            return;
        }
        if (i15 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) r11Var.E1.get((i7 - this.c) - 1);
            b11 b11Var = (b11) view;
            b11Var.a(f01Var);
            b11Var.h.r0(org.telegram.messenger.fc.b(document3), "100_100_firstframe", null, null, org.telegram.messenger.u5.f(document3, org.telegram.ui.ActionBar.n6.m6, 0.2f, null), 0L, "tgs", document3, 0);
            b11Var.R = true;
            b11Var.d = document3;
            b11Var.e = null;
            return;
        }
        if (i15 != 4) {
            if (i15 == 3) {
                b11 b11Var2 = (b11) view;
                b11Var2.a = false;
                b11Var2.c = i7;
                b11Var2.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                b11Var2.setDrawable(null);
                ArrayList arrayList2 = r11Var.C1;
                if (arrayList2 == null || i7 < 0 || i7 >= arrayList2.size()) {
                    ArrayList arrayList3 = r11Var.F1;
                    if (arrayList3 != null && (i10 = i7 - this.h) >= 0 && i10 < arrayList3.size()) {
                        document = (TLRPC.Document) r11Var.F1.get(i7 - this.h);
                        if (!(document instanceof o11)) {
                            l10 = null;
                        }
                    }
                    document = null;
                    l10 = null;
                } else {
                    ch.p0 p0Var2 = (ch.p0) r11Var.C1.get(i7);
                    b11Var2.y = p0Var2;
                    long j3 = p0Var2.g;
                    if (j3 == 0) {
                        boolean contains2 = r11Var.K.contains(p0Var2);
                        b11Var2.E = true;
                        b11Var2.setDrawable(org.telegram.messenger.j6.g(p0Var2.f));
                        b11Var2.d(contains2, false);
                        return;
                    }
                    l10 = Long.valueOf(j3);
                    if (i13 == 14 && !org.telegram.messenger.j10.i(i14).q() && p0Var2.b && p0Var2.d) {
                        b11Var2.b();
                        b11Var2.K.setVisibility(0);
                    } else {
                        a11 a11Var = b11Var2.K;
                        if (a11Var != null) {
                            a11Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l10 == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        b11Var2.e = new org.telegram.ui.Components.x5(document, (Paint.FontMetricsInt) null);
                        b11Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(l10.longValue(), (Paint.FontMetricsInt) null);
                        b11Var2.e = x5Var;
                        b11Var2.d = x5Var.document;
                        contains = hashSet.contains(l10);
                    }
                    org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) f01Var.l3.get(b11Var2.e.getDocumentId());
                    if (o5Var == null) {
                        cacheType = r11Var.getCacheType();
                        o5Var = org.telegram.ui.Components.o5.m(i14, b11Var2.e.getDocumentId(), null, cacheType);
                        f01Var.l3.put(b11Var2.e.getDocumentId(), o5Var);
                    }
                    b11Var2.setDrawable(o5Var);
                }
                b11Var2.d(contains, false);
                return;
            }
            return;
        }
        b11 b11Var3 = (b11) view;
        b11Var3.c = i7;
        ImageReceiver imageReceiver = b11Var3.n;
        ArrayList arrayList4 = r11Var.C1;
        if (arrayList4 == null || i7 < 0 || i7 >= arrayList4.size()) {
            ArrayList arrayList5 = r11Var.D1;
            if (arrayList5 == null || i7 < (i11 = this.c) || i7 - i11 >= arrayList5.size()) {
                return;
            } else {
                p0Var = (ch.p0) r11Var.D1.get(i7 - this.c);
            }
        } else {
            p0Var = (ch.p0) r11Var.C1.get(i7);
        }
        if (b11Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(b11Var3);
            b11Var3.h = imageReceiver2;
            imageReceiver2.E0(7);
            b11Var3.h.P();
        }
        b11Var3.h.H0(f01Var);
        b11Var3.y = p0Var;
        b11Var3.E = false;
        b11Var3.d(r11Var.K.contains(p0Var), false);
        b11Var3.b = false;
        b11Var3.invalidate();
        if (i13 == 13) {
            b11Var3.setDrawable(org.telegram.messenger.j6.g(p0Var.f));
        } else if (p0Var.b || p0Var.f == null) {
            b11Var3.s = false;
            b11Var3.e = new org.telegram.ui.Components.x5(p0Var.g, (Paint.FontMetricsInt) null);
            b11Var3.d = null;
            b11Var3.h.f();
            imageReceiver.f();
            org.telegram.ui.Components.o5 o5Var2 = (org.telegram.ui.Components.o5) f01Var.l3.get(b11Var3.e.getDocumentId());
            if (o5Var2 == null) {
                cacheType2 = r11Var.getCacheType();
                o5Var2 = org.telegram.ui.Components.o5.m(i14, b11Var3.e.getDocumentId(), null, cacheType2);
                f01Var.l3.put(b11Var3.e.getDocumentId(), o5Var2);
            }
            b11Var3.setDrawable(o5Var2);
        } else {
            b11Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(i14).r.get(p0Var.f);
            if (tL_availableReaction != null) {
                org.telegram.messenger.lz f10 = org.telegram.messenger.u5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.n6.m6, 0.2f, null);
                if (org.telegram.messenger.pc.e(8200)) {
                    ch.p0 p0Var3 = p0Var;
                    b11Var3.h.u0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", p0Var3, 0);
                    p0Var = p0Var3;
                } else {
                    b11Var3.h.r0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", p0Var, 0);
                }
                org.telegram.messenger.ri.d0(i14);
                org.telegram.messenger.ri.p1(imageReceiver, org.telegram.messenger.fc.b(tL_availableReaction.around_animation), ch.l0.a());
            } else {
                b11Var3.h.f();
                imageReceiver.f();
            }
            b11Var3.e = null;
            b11Var3.d = null;
            b11Var3.setDrawable(null);
            a11 a11Var2 = b11Var3.K;
            if (a11Var2 != null) {
                a11Var2.setVisibility(8);
                b11Var3.K.setImageReceiver(null);
            }
            if (tL_availableReaction == null && p0Var.b) {
                b11Var3.setDrawable(org.telegram.messenger.j6.g(p0Var.f));
            }
        }
        if (!org.telegram.messenger.j10.i(i14).q() && i13 == 14 && p0Var.b && p0Var.d) {
            b11Var3.b();
            b11Var3.K.setVisibility(0);
            b11Var3.setEmojicon(null);
            return;
        }
        if (p0Var.e) {
            b11Var3.setEmojicon(p0Var.f);
        } else {
            b11Var3.setEmojicon(null);
        }
        a11 a11Var3 = b11Var3.K;
        if (a11Var3 != null) {
            a11Var3.setVisibility(4);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View b11Var;
        r11 r11Var = this.s;
        if (i7 == 6) {
            b11Var = new x01(r11Var, r11Var.getContext(), r11Var.a0 == 6);
        } else if (i7 == 7) {
            b11Var = new org.telegram.ui.Components.jn(r11Var.getContext(), 24);
            b11Var.setTag("searchbox");
        } else {
            b11Var = new b11(r11Var, r11Var.getContext());
        }
        if (r11.c(r11Var)) {
            b11Var.setScaleX(0.0f);
            b11Var.setScaleY(0.0f);
        }
        return new org.telegram.ui.Components.kj0(b11Var);
    }
}
