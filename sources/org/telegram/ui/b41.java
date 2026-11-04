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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class b41 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final Window a;
    public final mg.g b;
    public final mg.g c;
    public final og.c d;
    public final RadialProgressView e;
    public final TextView f;
    public final yg0 h;
    public final ArrayList n;
    public d41 r;
    public final int s;

    public b41(Context context, int i3, mg.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.a = ((Activity) context).getWindow();
        } else {
            this.a = null;
        }
        this.s = i3;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.h = new yg0(context, 10);
        og.c cVar = new og.c(getContext(), e6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new org.telegram.ui.Components.aj0());
        final int i10 = 0;
        cVar.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.x31
            public final /* synthetic */ b41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
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
        if (i3 == 1) {
            this.b = new mg.k(getContext(), e6Var);
            mg.k kVar = new mg.k(getContext(), e6Var);
            this.c = kVar;
            kVar.u0.E = true;
        } else if (i3 == 2) {
            this.b = new mg.p(getContext(), e6Var);
            mg.p pVar = new mg.p(getContext(), e6Var);
            this.c = pVar;
            pVar.u0.E = true;
        } else if (i3 == 3) {
            mg.a aVar = new mg.a(getContext(), null);
            aVar.x0 = true;
            aVar.y0 = true;
            this.b = aVar;
            mg.m mVar = new mg.m(getContext(), null);
            this.c = mVar;
            mVar.u0.E = true;
        } else if (i3 == 4) {
            mg.q qVar = new mg.q(getContext());
            this.b = qVar;
            qVar.u0.F = true;
            mg.n nVar = new mg.n(getContext());
            nVar.N1 = -1;
            nVar.O1 = new RectF();
            nVar.Q1 = org.telegram.messenger.g0.L(9.0f);
            nVar.R1 = org.telegram.messenger.g0.L(13.0f);
            nVar.S1 = new String[101];
            nVar.U1 = 1.0f;
            nVar.V1 = 0;
            nVar.W1 = -1;
            nVar.X1 = -1;
            for (int i11 = 1; i11 <= 100; i11++) {
                nVar.S1[i11] = com.google.android.recaptcha.internal.a.h(i11, "%");
            }
            TextPaint textPaint = new TextPaint(1);
            nVar.P1 = textPaint;
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(-1);
            textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
            nVar.i1 = true;
            this.c = nVar;
        } else if (i3 != 5) {
            this.b = new mg.m(getContext(), null);
            mg.m mVar2 = new mg.m(getContext(), null);
            this.c = mVar2;
            mVar2.u0.E = true;
        } else {
            this.b = new mg.l(getContext(), null);
            mg.l lVar = new mg.l(getContext(), null);
            this.c = lVar;
            lVar.u0.E = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.b.a = fVar;
        this.c.a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.b);
        frameLayout.addView(this.b.u0, -2, -2);
        frameLayout.addView(this.c);
        frameLayout.addView(this.c.u0, -2, -2);
        frameLayout.addView(radialProgressView, b8.mf.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.s5, e6Var);
        this.b.setDateSelectionListener(new ci0(this, 18));
        this.b.u0.d(false, false);
        this.b.u0.setOnTouchListener(new org.telegram.ui.Components.aj0());
        final int i12 = 1;
        this.b.u0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.x31
            public final /* synthetic */ b41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
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
        final int i13 = 2;
        this.c.u0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.x31
            public final /* synthetic */ b41 b;

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
        this.b.setVisibility(0);
        this.c.setVisibility(4);
        this.b.setHeader(this.d);
        f10.addView(this.d, b8.mf.c(52.0f, -1));
        f10.addView(frameLayout, b8.mf.c(-2.0f, -1));
        f10.addView(this.h, b8.mf.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
        }
        addView(f10);
    }

    public final ValueAnimator a(long j10, boolean z10) {
        Window window = this.a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        mg.g gVar = this.b;
        gVar.K = false;
        mg.g gVar2 = this.c;
        gVar2.K = false;
        gVar.z0 = 2;
        gVar2.z0 = 1;
        final og.j jVar = new og.j();
        mg.j jVar2 = gVar.h0;
        jVar.b = jVar2.l;
        jVar.a = jVar2.k;
        int binarySearch = Arrays.binarySearch(this.r.d.a, j10);
        if (binarySearch < 0) {
            binarySearch = this.r.d.a.length - 1;
        }
        jVar.c = this.r.d.b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.A0 = jVar;
        gVar.A0 = jVar;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i3 = 0; i3 < this.r.d.d.size(); i3++) {
            if (((ng.a) this.r.d.d.get(i3)).a[binarySearch] > j11) {
                j11 = ((ng.a) this.r.d.d.get(i3)).a[binarySearch];
            }
            if (((ng.a) this.r.d.d.get(i3)).a[binarySearch] < j12) {
                j12 = ((ng.a) this.r.d.d.get(i3)).a[binarySearch];
            }
        }
        float f10 = j12 + (j11 - j12);
        float f11 = gVar.x;
        final float f12 = (f10 - f11) / (gVar.w - f11);
        gVar.q(jVar);
        gVar2.q(jVar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.y31
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b41 b41Var = b41.this;
                mg.g gVar3 = b41Var.b;
                float f13 = gVar3.G0;
                mg.j jVar3 = gVar3.h0;
                float f14 = jVar3.l;
                float f15 = jVar3.k;
                float f16 = ((f13 / (f14 - f15)) * f15) - mg.g.l1;
                RectF rectF = gVar3.I0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                og.j jVar4 = jVar;
                jVar4.e = height;
                jVar4.d = (gVar3.H0 * jVar4.c) - f16;
                jVar4.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mg.g gVar4 = b41Var.c;
                gVar4.invalidate();
                gVar4.q(jVar4);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new w1.a());
        return ofFloat;
    }

    public abstract void b(d41 d41Var);

    public abstract void c();

    public final void d() {
        ng.b bVar;
        ArrayList arrayList;
        mg.g gVar = this.b;
        gVar.G();
        gVar.invalidate();
        mg.g gVar2 = this.c;
        gVar2.G();
        gVar2.invalidate();
        og.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        d41 d41Var = this.r;
        if (d41Var != null && (bVar = d41Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i3 = 0; i3 < this.r.d.d.size(); i3++) {
                int x02 = (((ng.a) this.r.d.d.get(i3)).g < 0 || !org.telegram.ui.ActionBar.k6.f1(((ng.a) this.r.d.d.get(i3)).g)) ? i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false)) < 0.5d ? ((ng.a) this.r.d.d.get(i3)).i : ((ng.a) this.r.d.d.get(i3)).h : org.telegram.ui.ActionBar.k6.x0(null, ((ng.a) this.r.d.d.get(i3)).g, false);
                ArrayList arrayList2 = this.n;
                if (i3 < arrayList2.size()) {
                    org.telegram.ui.Components.hz hzVar = ((a41) arrayList2.get(i3)).a;
                    hzVar.getClass();
                    hzVar.r = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
                    hzVar.w = -1;
                    hzVar.s = x02;
                    hzVar.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h6, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s5, false));
    }

    public final void e(d41 d41Var, boolean z10) {
        if (d41Var == null) {
            return;
        }
        String str = d41Var.j;
        og.c cVar = this.d;
        cVar.setTitle(str);
        boolean z11 = getContext().getResources().getConfiguration().orientation == 2;
        mg.g gVar = this.b;
        gVar.setLandscape(z11);
        ArrayList arrayList = gVar.d;
        mg.j jVar = gVar.h0;
        mg.g gVar2 = this.c;
        gVar2.setLandscape(z11);
        this.r = d41Var;
        boolean z12 = d41Var.l;
        ArrayList arrayList2 = this.n;
        yg0 yg0Var = this.h;
        RadialProgressView radialProgressView = this.e;
        int i3 = 8;
        TextView textView = this.f;
        if (z12 || d41Var.a) {
            radialProgressView.setVisibility(8);
            String str2 = d41Var.b;
            if (str2 != null) {
                textView.setText(str2);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            yg0Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
            return;
        }
        textView.setVisibility(8);
        og.e eVar = gVar.u0;
        boolean z13 = d41Var.n;
        eVar.a = z13;
        cVar.c(!z13);
        if (d41Var.d == null && d41Var.f != null) {
            radialProgressView.setAlpha(1.0f);
            radialProgressView.setVisibility(0);
            b(d41Var);
            gVar.D(null);
            return;
        }
        if (!z10) {
            radialProgressView.setVisibility(8);
        }
        if (gVar.D(d41Var.d) && d41Var.h) {
            jVar.k = 0.0f;
            jVar.l = 1.0f;
            jVar.a.A(true, false, false);
        }
        cVar.setUseWeekInterval(d41Var.o);
        gVar.u0.setUseWeek(d41Var.o);
        og.e eVar2 = gVar.u0;
        eVar2.G = this.r.g != null || this.s == 4;
        gVar2.u0.G = false;
        eVar2.setEnabled(eVar2.G);
        og.e eVar3 = gVar2.u0;
        eVar3.setEnabled(eVar3.G);
        int size = arrayList.size();
        yg0Var.removeAllViews();
        arrayList2.clear();
        if (size > 1) {
            for (int i10 = 0; i10 < size; i10++) {
                og.f fVar = (og.f) arrayList.get(i10);
                a41 a41Var = new a41(this, i10);
                a41Var.b = fVar;
                String str3 = fVar.a.d;
                org.telegram.ui.Components.hz hzVar = a41Var.a;
                hzVar.setText(str3);
                hzVar.a(fVar.n, false);
                hzVar.setOnTouchListener(new org.telegram.ui.Components.aj0());
                hzVar.setOnClickListener(new hb0(19, a41Var, fVar));
                hzVar.setOnLongClickListener(new ei.j2(7, a41Var, fVar));
            }
        }
        long j10 = this.r.c;
        if (j10 > 0) {
            gVar.t0 = Arrays.binarySearch(gVar.i0.a, j10);
            gVar.v0 = true;
            gVar.u0.setVisibility(0);
            gVar.w0 = 1.0f;
            gVar.x((gVar.H0 * jVar.k) - mg.g.l1);
            try {
                gVar.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            g(true);
        } else {
            h(false);
            gVar.invalidate();
        }
        d();
        if (z10) {
            gVar.z0 = 3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            og.j jVar2 = new og.j();
            gVar.A0 = jVar2;
            jVar2.f = 0.0f;
            ofFloat.addUpdateListener(new xy0(this, i3));
            ofFloat.addListener(new z31(this, 2));
            ofFloat.start();
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        mg.g gVar = this.b;
        long selectedDate = gVar.getSelectedDate();
        ng.b bVar = this.r.e;
        mg.g gVar2 = this.c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.r.d.d.size() > 1) {
            int i3 = 0;
            int i10 = 0;
            while (true) {
                int size = this.r.d.d.size();
                arrayList = this.n;
                if (i3 >= size) {
                    break;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.d.size()) {
                        z11 = false;
                        break;
                    }
                    if (((ng.a) bVar.d.get(i11)).c.equals(((ng.a) this.r.d.d.get(i3)).c)) {
                        boolean z12 = ((a41) arrayList.get(i3)).a.b;
                        ((og.f) arrayList2.get(i11)).n = z12;
                        ((og.f) arrayList2.get(i11)).o = z12 ? 1.0f : 0.0f;
                        ((a41) arrayList.get(i3)).a.c = true;
                        ((a41) arrayList.get(i3)).a.animate().alpha(1.0f).start();
                        if (z12) {
                            i10++;
                        }
                        z11 = true;
                    } else {
                        i11++;
                    }
                }
                if (!z11) {
                    ((a41) arrayList.get(i3)).a.c = false;
                    ((a41) arrayList.get(i3)).a.animate().alpha(0.0f).start();
                }
                i3++;
            }
            if (i10 == 0) {
                for (int i12 = 0; i12 < this.r.d.d.size(); i12++) {
                    ((a41) arrayList.get(i12)).a.c = true;
                    ((a41) arrayList.get(i12)).a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.r.c = selectedDate;
        gVar.u0.setAlpha(0.0f);
        gVar.w0 = 0.0f;
        gVar.v0 = false;
        gVar.j1 = false;
        gVar2.G();
        og.c cVar = this.d;
        if (!z10) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (!z10) {
            ValueAnimator a10 = a(selectedDate, true);
            a10.addListener(new z31(this, 0));
            a10.start();
            return;
        }
        gVar.setVisibility(4);
        gVar2.setVisibility(0);
        gVar.z0 = 0;
        gVar2.z0 = 0;
        gVar.K = false;
        gVar2.K = true;
        cVar.d(selectedDate, false);
    }

    public final void h(boolean z10) {
        ng.b bVar;
        d41 d41Var = this.r;
        if (d41Var == null || (bVar = d41Var.d) == null || bVar.a == null) {
            return;
        }
        og.c cVar = this.d;
        TextView textView = cVar.d;
        TextView textView2 = cVar.a;
        mg.g gVar = this.b;
        cVar.b(gVar.getStartDate(), gVar.getEndDate());
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
            textView.setPivotY(org.telegram.messenger.g0.L(40.0f));
            textView.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
        } else {
            textView2.setAlpha(1.0f);
            textView2.setScaleX(1.0f);
            textView2.setScaleY(1.0f);
            textView.setAlpha(0.0f);
        }
        gVar.u0.f.setAlpha(1.0f);
        mg.g gVar2 = this.c;
        gVar2.setHeader(null);
        long selectedDate = gVar.getSelectedDate();
        this.r.c = 0L;
        int i3 = 0;
        gVar.setVisibility(0);
        gVar2.d();
        gVar2.setHeader(null);
        gVar.setHeader(cVar);
        ArrayList arrayList = this.n;
        if (z10) {
            ValueAnimator a10 = a(selectedDate, false);
            a10.addListener(new z31(this, 1));
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                a41 a41Var = (a41) obj;
                a41Var.a.animate().alpha(1.0f).start();
                a41Var.a.c = true;
            }
            a10.start();
            return;
        }
        gVar2.setVisibility(4);
        gVar.K = true;
        gVar2.K = false;
        gVar.invalidate();
        Window window = this.a;
        if (window != null) {
            window.clearFlags(16);
        }
        int size2 = arrayList.size();
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            a41 a41Var2 = (a41) obj2;
            a41Var2.a.setAlpha(1.0f);
            a41Var2.a.c = true;
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            if (this.b != null && this.c != null && this.d != null && this.e != null && this.f != null) {
                d();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
