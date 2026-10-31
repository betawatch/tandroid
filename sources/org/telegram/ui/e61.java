package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class e61 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final Window a;
    public final bg.i b;
    public final bg.i c;
    public final dg.d d;
    public final RadialProgressView e;
    public final TextView f;
    public final dg0 h;
    public final ArrayList n;
    public g61 r;
    public final int s;

    public e61(Context context, int i10, bg.h hVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.a = ((Activity) context).getWindow();
        } else {
            this.a = null;
        }
        this.s = i10;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        this.h = new dg0(context, 11);
        dg.d dVar = new dg.d(getContext(), p6Var);
        this.d = dVar;
        dVar.d.setOnTouchListener(new org.telegram.ui.Components.bk0());
        final int i11 = 0;
        dVar.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a61
            public final /* synthetic */ e61 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.h(true);
                        break;
                    case 1:
                        this.b.c();
                        break;
                    default:
                        this.b.c.c(false);
                        break;
                }
            }
        });
        if (i10 == 1) {
            this.b = new bg.p(getContext(), p6Var);
            bg.p pVar = new bg.p(getContext(), p6Var);
            this.c = pVar;
            pVar.t0.D = true;
        } else if (i10 == 2) {
            this.b = new bg.u(getContext(), p6Var);
            bg.u uVar = new bg.u(getContext(), p6Var);
            this.c = uVar;
            uVar.t0.D = true;
        } else if (i10 == 3) {
            bg.a aVar = new bg.a(getContext(), null);
            aVar.w0 = true;
            aVar.x0 = true;
            this.b = aVar;
            bg.r rVar = new bg.r(getContext(), null);
            this.c = rVar;
            rVar.t0.D = true;
        } else if (i10 == 4) {
            bg.v vVar = new bg.v(getContext());
            this.b = vVar;
            vVar.t0.E = true;
            bg.s sVar = new bg.s(getContext());
            sVar.M1 = -1;
            sVar.N1 = new RectF();
            sVar.P1 = org.telegram.messenger.i0.L(9.0f);
            sVar.Q1 = org.telegram.messenger.i0.L(13.0f);
            sVar.R1 = new String[101];
            sVar.T1 = 1.0f;
            sVar.U1 = 0;
            sVar.V1 = -1;
            sVar.W1 = -1;
            for (int i12 = 1; i12 <= 100; i12++) {
                sVar.R1[i12] = a1.g.k(i12, "%");
            }
            TextPaint textPaint = new TextPaint(1);
            sVar.O1 = textPaint;
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(-1);
            textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
            sVar.h1 = true;
            this.c = sVar;
        } else if (i10 != 5) {
            this.b = new bg.r(getContext(), null);
            bg.r rVar2 = new bg.r(getContext(), null);
            this.c = rVar2;
            rVar2.t0.D = true;
        } else {
            this.b = new bg.q(getContext(), null);
            bg.q qVar = new bg.q(getContext(), null);
            this.c = qVar;
            qVar.t0.D = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.b.a = hVar;
        this.c.a = hVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.b);
        frameLayout.addView(this.b.t0, -2, -2);
        frameLayout.addView(this.c);
        frameLayout.addView(this.c.t0, -2, -2);
        frameLayout.addView(radialProgressView, w7.b6.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.s5, p6Var);
        this.b.setDateSelectionListener(new tj0(this, 18));
        this.b.t0.d(false, false);
        this.b.t0.setOnTouchListener(new org.telegram.ui.Components.bk0());
        final int i13 = 1;
        this.b.t0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a61
            public final /* synthetic */ e61 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.h(true);
                        break;
                    case 1:
                        this.b.c();
                        break;
                    default:
                        this.b.c.c(false);
                        break;
                }
            }
        });
        final int i14 = 2;
        this.c.t0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a61
            public final /* synthetic */ e61 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.h(true);
                        break;
                    case 1:
                        this.b.c();
                        break;
                    default:
                        this.b.c.c(false);
                        break;
                }
            }
        });
        this.b.setVisibility(0);
        this.c.setVisibility(4);
        this.b.setHeader(this.d);
        f7.addView(this.d, w7.b6.c(52.0f, -1));
        f7.addView(frameLayout, w7.b6.c(-2.0f, -1));
        f7.addView(this.h, w7.b6.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f7.setClipChildren(false);
            f7.setClipToPadding(false);
        }
        addView(f7);
    }

    public final ValueAnimator a(long j10, boolean z10) {
        Window window = this.a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        bg.i iVar = this.b;
        iVar.J = false;
        bg.i iVar2 = this.c;
        iVar2.J = false;
        iVar.y0 = 2;
        iVar2.y0 = 1;
        final dg.k kVar = new dg.k();
        bg.n nVar = iVar.g0;
        kVar.b = nVar.l;
        kVar.a = nVar.k;
        int binarySearch = Arrays.binarySearch(this.r.d.a, j10);
        if (binarySearch < 0) {
            binarySearch = this.r.d.a.length - 1;
        }
        kVar.c = this.r.d.b[binarySearch];
        iVar2.setVisibility(0);
        iVar2.z0 = kVar;
        iVar.z0 = kVar;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i10 = 0; i10 < this.r.d.d.size(); i10++) {
            if (((cg.a) this.r.d.d.get(i10)).a[binarySearch] > j11) {
                j11 = ((cg.a) this.r.d.d.get(i10)).a[binarySearch];
            }
            if (((cg.a) this.r.d.d.get(i10)).a[binarySearch] < j12) {
                j12 = ((cg.a) this.r.d.d.get(i10)).a[binarySearch];
            }
        }
        float f7 = j12 + (j11 - j12);
        float f10 = iVar.x;
        final float f11 = (f7 - f10) / (iVar.w - f10);
        iVar.q(kVar);
        iVar2.q(kVar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.b61
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                e61 e61Var = e61.this;
                bg.i iVar3 = e61Var.b;
                float f12 = iVar3.F0;
                bg.n nVar2 = iVar3.g0;
                float f13 = nVar2.l;
                float f14 = nVar2.k;
                float f15 = ((f12 / (f13 - f14)) * f14) - bg.i.k1;
                RectF rectF = iVar3.H0;
                float height = (rectF.height() * (1.0f - f11)) + rectF.top;
                dg.k kVar2 = kVar;
                kVar2.e = height;
                kVar2.d = (iVar3.G0 * kVar2.c) - f15;
                kVar2.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg.i iVar4 = e61Var.c;
                iVar4.invalidate();
                iVar4.q(kVar2);
                iVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(g61 g61Var);

    public abstract void c();

    public final void d() {
        cg.b bVar;
        ArrayList arrayList;
        bg.i iVar = this.b;
        iVar.G();
        iVar.invalidate();
        bg.i iVar2 = this.c;
        iVar2.G();
        iVar2.invalidate();
        dg.d dVar = this.d;
        dVar.a();
        dVar.invalidate();
        g61 g61Var = this.r;
        if (g61Var != null && (bVar = g61Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i10 = 0; i10 < this.r.d.d.size(); i10++) {
                int x02 = (((cg.a) this.r.d.d.get(i10)).g < 0 || !org.telegram.ui.ActionBar.t6.f1(((cg.a) this.r.d.d.get(i10)).g)) ? i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false)) < 0.5d ? ((cg.a) this.r.d.d.get(i10)).i : ((cg.a) this.r.d.d.get(i10)).h : org.telegram.ui.ActionBar.t6.x0(null, ((cg.a) this.r.d.d.get(i10)).g, false);
                ArrayList arrayList2 = this.n;
                if (i10 < arrayList2.size()) {
                    org.telegram.ui.Components.yz yzVar = ((d61) arrayList2.get(i10)).a;
                    yzVar.getClass();
                    yzVar.r = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false);
                    yzVar.w = -1;
                    yzVar.s = x02;
                    yzVar.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h6, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.s5, false));
    }

    public final void e(g61 g61Var, boolean z10) {
        if (g61Var == null) {
            return;
        }
        String str = g61Var.j;
        dg.d dVar = this.d;
        dVar.setTitle(str);
        boolean z11 = getContext().getResources().getConfiguration().orientation == 2;
        bg.i iVar = this.b;
        iVar.setLandscape(z11);
        ArrayList arrayList = iVar.d;
        bg.n nVar = iVar.g0;
        bg.i iVar2 = this.c;
        iVar2.setLandscape(z11);
        this.r = g61Var;
        boolean z12 = g61Var.l;
        ArrayList arrayList2 = this.n;
        dg0 dg0Var = this.h;
        RadialProgressView radialProgressView = this.e;
        int i10 = 8;
        TextView textView = this.f;
        if (z12 || g61Var.a) {
            radialProgressView.setVisibility(8);
            String str2 = g61Var.b;
            if (str2 != null) {
                textView.setText(str2);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            dg0Var.removeAllViews();
            arrayList2.clear();
            iVar.D(null);
            return;
        }
        textView.setVisibility(8);
        dg.f fVar = iVar.t0;
        boolean z13 = g61Var.n;
        fVar.a = z13;
        dVar.c(!z13);
        if (g61Var.d == null && g61Var.f != null) {
            radialProgressView.setAlpha(1.0f);
            radialProgressView.setVisibility(0);
            b(g61Var);
            iVar.D(null);
            return;
        }
        if (!z10) {
            radialProgressView.setVisibility(8);
        }
        if (iVar.D(g61Var.d) && g61Var.h) {
            nVar.k = 0.0f;
            nVar.l = 1.0f;
            nVar.a.A(true, false, false);
        }
        dVar.setUseWeekInterval(g61Var.o);
        iVar.t0.setUseWeek(g61Var.o);
        dg.f fVar2 = iVar.t0;
        fVar2.F = this.r.g != null || this.s == 4;
        iVar2.t0.F = false;
        fVar2.setEnabled(fVar2.F);
        dg.f fVar3 = iVar2.t0;
        fVar3.setEnabled(fVar3.F);
        int size = arrayList.size();
        dg0Var.removeAllViews();
        arrayList2.clear();
        if (size > 1) {
            for (int i11 = 0; i11 < size; i11++) {
                dg.g gVar = (dg.g) arrayList.get(i11);
                d61 d61Var = new d61(this, i11);
                d61Var.b = gVar;
                String str3 = gVar.a.d;
                org.telegram.ui.Components.yz yzVar = d61Var.a;
                yzVar.setText(str3);
                yzVar.a(gVar.n, false);
                yzVar.setOnTouchListener(new org.telegram.ui.Components.bk0());
                yzVar.setOnClickListener(new rv0(7, d61Var, gVar));
                yzVar.setOnLongClickListener(new org.telegram.ui.Components.b0(6, d61Var, gVar));
            }
        }
        long j10 = this.r.c;
        if (j10 > 0) {
            iVar.s0 = Arrays.binarySearch(iVar.h0.a, j10);
            iVar.u0 = true;
            iVar.t0.setVisibility(0);
            iVar.v0 = 1.0f;
            iVar.x((iVar.G0 * nVar.k) - bg.i.k1);
            try {
                iVar.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            g(true);
        } else {
            h(false);
            iVar.invalidate();
        }
        d();
        if (z10) {
            iVar.y0 = 3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            dg.k kVar = new dg.k();
            iVar.z0 = kVar;
            kVar.f = 0.0f;
            ofFloat.addUpdateListener(new u01(this, i10));
            ofFloat.addListener(new c61(this, 2));
            ofFloat.start();
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        bg.i iVar = this.b;
        long selectedDate = iVar.getSelectedDate();
        cg.b bVar = this.r.e;
        bg.i iVar2 = this.c;
        if (!z10 || iVar2.getVisibility() != 0) {
            iVar2.J(bVar, selectedDate);
        }
        iVar2.D(bVar);
        ArrayList arrayList2 = iVar2.d;
        if (this.r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.r.d.d.size();
                arrayList = this.n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= bVar.d.size()) {
                        z11 = false;
                        break;
                    }
                    if (((cg.a) bVar.d.get(i12)).c.equals(((cg.a) this.r.d.d.get(i10)).c)) {
                        boolean z12 = ((d61) arrayList.get(i10)).a.b;
                        ((dg.g) arrayList2.get(i12)).n = z12;
                        ((dg.g) arrayList2.get(i12)).o = z12 ? 1.0f : 0.0f;
                        ((d61) arrayList.get(i10)).a.c = true;
                        ((d61) arrayList.get(i10)).a.animate().alpha(1.0f).start();
                        if (z12) {
                            i11++;
                        }
                        z11 = true;
                    } else {
                        i12++;
                    }
                }
                if (!z11) {
                    ((d61) arrayList.get(i10)).a.c = false;
                    ((d61) arrayList.get(i10)).a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.r.d.d.size(); i13++) {
                    ((d61) arrayList.get(i13)).a.c = true;
                    ((d61) arrayList.get(i13)).a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.r.c = selectedDate;
        iVar.t0.setAlpha(0.0f);
        iVar.v0 = 0.0f;
        iVar.u0 = false;
        iVar.i1 = false;
        iVar2.G();
        dg.d dVar = this.d;
        if (!z10) {
            iVar2.d();
            dVar.d(selectedDate, true);
        }
        iVar2.setHeader(dVar);
        iVar.setHeader(null);
        if (!z10) {
            ValueAnimator a2 = a(selectedDate, true);
            a2.addListener(new c61(this, 0));
            a2.start();
            return;
        }
        iVar.setVisibility(4);
        iVar2.setVisibility(0);
        iVar.y0 = 0;
        iVar2.y0 = 0;
        iVar.J = false;
        iVar2.J = true;
        dVar.d(selectedDate, false);
    }

    public final void h(boolean z10) {
        cg.b bVar;
        g61 g61Var = this.r;
        if (g61Var == null || (bVar = g61Var.d) == null || bVar.a == null) {
            return;
        }
        dg.d dVar = this.d;
        TextView textView = dVar.d;
        TextView textView2 = dVar.a;
        bg.i iVar = this.b;
        dVar.b(iVar.getStartDate(), iVar.getEndDate());
        if (z10) {
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.3f);
            textView2.setScaleY(0.3f);
            textView2.setPivotX(0.0f);
            textView2.setPivotY(0.0f);
            textView2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(200L).start();
            textView.setAlpha(1.0f);
            textView.setTranslationX(0.0f);
            textView.setTranslationY(0.0f);
            textView.setScaleX(1.0f);
            textView.setScaleY(1.0f);
            textView.setPivotY(org.telegram.messenger.i0.L(40.0f));
            textView.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
        } else {
            textView2.setAlpha(1.0f);
            textView2.setScaleX(1.0f);
            textView2.setScaleY(1.0f);
            textView.setAlpha(0.0f);
        }
        iVar.t0.f.setAlpha(1.0f);
        bg.i iVar2 = this.c;
        iVar2.setHeader(null);
        long selectedDate = iVar.getSelectedDate();
        this.r.c = 0L;
        int i10 = 0;
        iVar.setVisibility(0);
        iVar2.d();
        iVar2.setHeader(null);
        iVar.setHeader(dVar);
        ArrayList arrayList = this.n;
        if (z10) {
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new c61(this, 1));
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d61 d61Var = (d61) obj;
                d61Var.a.animate().alpha(1.0f).start();
                d61Var.a.c = true;
            }
            a2.start();
            return;
        }
        iVar2.setVisibility(4);
        iVar.J = true;
        iVar2.J = false;
        iVar.invalidate();
        Window window = this.a;
        if (window != null) {
            window.clearFlags(16);
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            d61 d61Var2 = (d61) obj2;
            d61Var2.a.setAlpha(1.0f);
            d61Var2.a.c = true;
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            if (this.b != null && this.c != null && this.d != null && this.e != null && this.f != null) {
                d();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
