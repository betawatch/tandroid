// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gz9 extends q59 {
    public int c;
    public int d;
    public int h;
    public final /* synthetic */ vz9 s;
    public int e = -1;
    public int f = -1;
    public int n = 1;
    public final ArrayList r = new ArrayList();

    public gz9(vz9 vz9Var) {
        this.s = vz9Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 3 || i == 4;
    }

    public final void E(boolean z) {
        vz9 vz9Var = this.s;
        int i = vz9Var.a0;
        ArrayList arrayList = this.r;
        new ArrayList(arrayList);
        this.h = -1;
        this.c = -1;
        boolean z2 = false;
        this.n = 0;
        arrayList.clear();
        ArrayList arrayList2 = vz9Var.C1;
        byte b = 1;
        if (arrayList2 != null) {
            if (i == 4 && !arrayList2.isEmpty()) {
                int i2 = this.n;
                this.n = i2 + 1;
                this.e = i2;
                arrayList.add(1);
            }
            this.d = this.n;
            for (int i3 = 0; i3 < vz9Var.C1.size(); i3++) {
                this.n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, vz9Var.C1.get(i3))));
            }
        }
        if (i == 14) {
            ArrayList arrayList3 = vz9Var.D1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i4 = this.n;
                this.n = i4 + 1;
                this.f = i4;
                arrayList.add(2);
                this.c = this.n;
                for (int i5 = 0; i5 < vz9Var.D1.size(); i5++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, vz9Var.D1.get(i5))));
                }
            }
        } else {
            ArrayList arrayList4 = vz9Var.E1;
            if (arrayList4 != null) {
                if (i == 4 && !arrayList4.isEmpty()) {
                    int i6 = this.n;
                    this.n = i6 + 1;
                    this.f = i6;
                    arrayList.add(2);
                }
                this.c = this.n;
                for (int i7 = 0; i7 < vz9Var.E1.size(); i7++) {
                    this.n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, vz9Var.E1.get(i7))));
                }
            }
        }
        ArrayList arrayList5 = vz9Var.F1;
        if (arrayList5 != null) {
            int i8 = this.n;
            this.h = i8;
            this.n = arrayList5.size() + i8;
        }
        f();
        if (vz9Var.A1 && this.n == 0) {
            z2 = true;
        }
        if (vz9Var.I1 != z2) {
            vz9Var.I1 = z2;
            ValueAnimator valueAnimator = vz9Var.J1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            vz9Var.J1 = ofFloat;
            ofFloat.addUpdateListener(new cy9(vz9Var, z2, b));
            vz9Var.J1.addListener(new py9(vz9Var, z2, b));
            vz9Var.J1.setInterpolator(d53.h);
            vz9Var.J1.setDuration(100L);
            vz9Var.J1.start();
            if (z2) {
                vz9.D(vz9Var.W, vz9Var.m0);
            }
        }
    }

    @Override // y59
    public final int b() {
        return this.n;
    }

    @Override // y59
    public final int d(int i) {
        int i2;
        vz9 vz9Var = this.s;
        int i3 = vz9Var.a0;
        if (i == this.e || i == this.f) {
            return 6;
        }
        if (i3 == 14) {
            ArrayList arrayList = vz9Var.D1;
            if (arrayList != null && i >= (i2 = this.c) && i - i2 < arrayList.size()) {
                return 4;
            }
        } else {
            if (i > this.c && (i - r2) - 1 < vz9Var.E1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = vz9Var.C1;
        if (arrayList2 == null) {
            return 3;
        }
        if (i > this.d && (i - r3) - 1 < arrayList2.size() && (i3 == 13 || ((k39) vz9Var.C1.get((i - this.d) - 1)).g != 0)) {
            return 3;
        }
        int i4 = i - this.h;
        if (i4 < 0 || i4 >= vz9Var.F1.size()) {
            return 4;
        }
        return !(vz9Var.F1.get(i - this.h) instanceof sz9) ? 3 : 6;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        TLRPC.Document document;
        Long l;
        int i2;
        boolean contains;
        int cacheType;
        int i3;
        k39 k39Var;
        int cacheType2;
        int i4;
        int indexOf;
        vz9 vz9Var = this.s;
        HashSet hashSet = vz9Var.L;
        int i5 = vz9Var.a0;
        int i6 = vz9Var.W;
        jy9 jy9Var = vz9Var.j0;
        int i7 = u69Var.f;
        View view = u69Var.a;
        if (i7 == 6) {
            bz9 bz9Var = (bz9) view;
            ArrayList arrayList = vz9Var.F1;
            if (arrayList != null && (i4 = i - this.h) >= 0 && i4 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) vz9Var.F1.get(i - this.h);
                if (document2 instanceof sz9) {
                    CharSequence charSequence = ((sz9) document2).a;
                    String str = vz9Var.B1;
                    bz9Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(cmb.v0(cmb.Lf, bz9Var.f.a1)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    bz9Var.a.setText(charSequence);
                    bz9Var.b(false);
                }
            } else if (i == this.e) {
                bz9Var.a(jb6.M0(2131751133, null), false);
            } else if (i5 == 14) {
                bz9Var.a(jb6.M0(2131744565, null), false);
            } else {
                bz9Var.a(jb6.M0(2131754755, null), false);
            }
            bz9Var.c.setVisibility(8);
            return;
        }
        if (i7 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) vz9Var.E1.get((i - this.c) - 1);
            fz9 fz9Var = (fz9) view;
            fz9Var.a(jy9Var);
            fz9Var.h.Z(gn5.b(document3), "100_100_firstframe", null, null, eq3.f(document3, cmb.l6, 0.2f, null), 0L, "tgs", document3, 0);
            fz9Var.R = true;
            fz9Var.d = document3;
            fz9Var.e = null;
            return;
        }
        if (i7 != 4) {
            if (i7 == 3) {
                fz9 fz9Var2 = (fz9) view;
                fz9Var2.a = false;
                fz9Var2.c = i;
                fz9Var2.setPadding(gm.L(1.0f), gm.L(1.0f), gm.L(1.0f), gm.L(1.0f));
                fz9Var2.setDrawable(null);
                ArrayList arrayList2 = vz9Var.C1;
                if (arrayList2 == null || i < 0 || i >= arrayList2.size()) {
                    ArrayList arrayList3 = vz9Var.F1;
                    if (arrayList3 != null && (i2 = i - this.h) >= 0 && i2 < arrayList3.size()) {
                        document = (TLRPC.Document) vz9Var.F1.get(i - this.h);
                        if (!(document instanceof sz9)) {
                            l = null;
                        }
                    }
                    document = null;
                    l = null;
                } else {
                    k39 k39Var2 = (k39) vz9Var.C1.get(i);
                    fz9Var2.y = k39Var2;
                    long j = k39Var2.g;
                    if (j == 0) {
                        boolean contains2 = vz9Var.K.contains(k39Var2);
                        fz9Var2.E = true;
                        fz9Var2.setDrawable(gw3.g(k39Var2.f));
                        fz9Var2.d(contains2, false);
                        return;
                    }
                    l = Long.valueOf(j);
                    if (i5 == 14 && !z8c.h(i6).p() && k39Var2.b && k39Var2.d) {
                        fz9Var2.b();
                        fz9Var2.K.setVisibility(0);
                    } else {
                        ez9 ez9Var = fz9Var2.K;
                        if (ez9Var != null) {
                            ez9Var.setVisibility(4);
                        }
                    }
                    document = null;
                }
                if (l == null && document == null) {
                    contains = false;
                } else {
                    if (document != null) {
                        fz9Var2.e = new gn(document, (Paint.FontMetricsInt) null);
                        fz9Var2.d = document;
                        contains = hashSet.contains(Long.valueOf(document.id));
                    } else {
                        gn gnVar = new gn(l.longValue(), (Paint.FontMetricsInt) null);
                        fz9Var2.e = gnVar;
                        fz9Var2.d = gnVar.document;
                        contains = hashSet.contains(l);
                    }
                    vm vmVar = (vm) jy9Var.l3.get(fz9Var2.e.getDocumentId());
                    if (vmVar == null) {
                        cacheType = vz9Var.getCacheType();
                        vmVar = vm.m(i6, fz9Var2.e.getDocumentId(), null, cacheType);
                        jy9Var.l3.put(fz9Var2.e.getDocumentId(), vmVar);
                    }
                    fz9Var2.setDrawable(vmVar);
                }
                fz9Var2.d(contains, false);
                return;
            }
            return;
        }
        fz9 fz9Var3 = (fz9) view;
        fz9Var3.c = i;
        ImageReceiver imageReceiver = fz9Var3.n;
        ArrayList arrayList4 = vz9Var.C1;
        if (arrayList4 == null || i < 0 || i >= arrayList4.size()) {
            ArrayList arrayList5 = vz9Var.D1;
            if (arrayList5 == null || i < (i3 = this.c) || i - i3 >= arrayList5.size()) {
                return;
            } else {
                k39Var = (k39) vz9Var.D1.get(i - this.c);
            }
        } else {
            k39Var = (k39) vz9Var.C1.get(i);
        }
        if (fz9Var3.h == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(fz9Var3);
            fz9Var3.h = imageReceiver2;
            imageReceiver2.m0(7);
            fz9Var3.h.I();
        }
        fz9Var3.h.p0(jy9Var);
        fz9Var3.y = k39Var;
        fz9Var3.E = false;
        fz9Var3.d(vz9Var.K.contains(k39Var), false);
        fz9Var3.b = false;
        fz9Var3.invalidate();
        if (i5 == 13) {
            fz9Var3.setDrawable(gw3.g(k39Var.f));
        } else if (k39Var.b || k39Var.f == null) {
            fz9Var3.s = false;
            fz9Var3.e = new gn(k39Var.g, (Paint.FontMetricsInt) null);
            fz9Var3.d = null;
            fz9Var3.h.f();
            imageReceiver.f();
            vm vmVar2 = (vm) jy9Var.l3.get(fz9Var3.e.getDocumentId());
            if (vmVar2 == null) {
                cacheType2 = vz9Var.getCacheType();
                vmVar2 = vm.m(i6, fz9Var3.e.getDocumentId(), null, cacheType2);
                jy9Var.l3.put(fz9Var3.e.getDocumentId(), vmVar2);
            }
            fz9Var3.setDrawable(vmVar2);
        } else {
            fz9Var3.s = true;
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(i6).r.get(k39Var.f);
            if (tL_availableReaction != null) {
                meb f = eq3.f(tL_availableReaction.activate_animation, cmb.l6, 0.2f, null);
                boolean e = e86.e(8200);
                ImageReceiver imageReceiver3 = fz9Var3.h;
                TLRPC.Document document4 = tL_availableReaction.select_animation;
                if (e) {
                    k39 k39Var3 = k39Var;
                    imageReceiver3.Y(gn5.b(document4), "60_60_pcache", gn5.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f, 0L, "tgs", k39Var3, 0);
                    k39Var = k39Var3;
                } else {
                    imageReceiver3.Z(gn5.b(document4), "60_60_firstframe", null, null, f, 0L, "tgs", k39Var, 0);
                }
                hs6.d0(i6);
                hs6.n1(imageReceiver, gn5.b(tL_availableReaction.around_animation), g39.a());
            } else {
                fz9Var3.h.f();
                imageReceiver.f();
            }
            fz9Var3.e = null;
            fz9Var3.d = null;
            fz9Var3.setDrawable(null);
            ez9 ez9Var2 = fz9Var3.K;
            if (ez9Var2 != null) {
                ez9Var2.setVisibility(8);
                fz9Var3.K.setImageReceiver(null);
            }
            if (tL_availableReaction == null && k39Var.b) {
                fz9Var3.setDrawable(gw3.g(k39Var.f));
            }
        }
        if (!z8c.h(i6).p() && i5 == 14 && k39Var.b && k39Var.d) {
            fz9Var3.b();
            fz9Var3.K.setVisibility(0);
            fz9Var3.setEmojicon(null);
            return;
        }
        if (k39Var.e) {
            fz9Var3.setEmojicon(k39Var.f);
        } else {
            fz9Var3.setEmojicon(null);
        }
        ez9 ez9Var3 = fz9Var3.K;
        if (ez9Var3 != null) {
            ez9Var3.setVisibility(4);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View fz9Var;
        vz9 vz9Var = this.s;
        if (i == 6) {
            fz9Var = new bz9(vz9Var, vz9Var.getContext(), vz9Var.a0 == 6);
        } else if (i == 7) {
            fz9Var = new o72(vz9Var.getContext(), (byte) 25);
            fz9Var.setTag("searchbox");
        } else {
            fz9Var = new fz9(vz9Var, vz9Var.getContext());
        }
        if (vz9Var.g()) {
            fz9Var.setScaleX(0.0f);
            fz9Var.setScaleY(0.0f);
        }
        return new b59(fz9Var);
    }
}
