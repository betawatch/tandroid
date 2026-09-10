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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class pa1 extends FrameLayout {
    public final Window a;
    public final hg.g b;
    public final hg.g c;
    public final jg.c d;
    public final RadialProgressView e;
    public final TextView f;
    public final m91 h;
    public final ArrayList n;
    public ra1 r;
    public final int s;

    public pa1(Context context, int i10, hg.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.a = ((Activity) context).getWindow();
        } else {
            this.a = null;
        }
        this.s = i10;
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        this.h = new m91(context, 1);
        jg.c cVar = new jg.c(getContext(), f6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new org.telegram.ui.Components.el0());
        final int i11 = 0;
        cVar.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.la1
            public final /* synthetic */ pa1 b;

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
            this.b = new hg.k(getContext(), f6Var);
            hg.k kVar = new hg.k(getContext(), f6Var);
            this.c = kVar;
            kVar.t0.y = true;
        } else if (i10 == 2) {
            this.b = new hg.p(getContext(), f6Var);
            hg.p pVar = new hg.p(getContext(), f6Var);
            this.c = pVar;
            pVar.t0.y = true;
        } else if (i10 == 3) {
            hg.a aVar = new hg.a(getContext(), null);
            aVar.w0 = true;
            aVar.x0 = true;
            this.b = aVar;
            hg.m mVar = new hg.m(getContext(), null);
            this.c = mVar;
            mVar.t0.y = true;
        } else if (i10 == 4) {
            hg.q qVar = new hg.q(getContext());
            this.b = qVar;
            qVar.t0.E = true;
            hg.n nVar = new hg.n(getContext());
            nVar.M1 = -1;
            nVar.N1 = new RectF();
            nVar.P1 = AndroidUtilities.dp(9.0f);
            nVar.Q1 = AndroidUtilities.dp(13.0f);
            nVar.R1 = new String[101];
            nVar.T1 = 1.0f;
            nVar.U1 = 0;
            nVar.V1 = -1;
            nVar.W1 = -1;
            for (int i12 = 1; i12 <= 100; i12++) {
                nVar.R1[i12] = a4.a.m(i12, "%");
            }
            TextPaint textPaint = new TextPaint(1);
            nVar.O1 = textPaint;
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(-1);
            textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
            nVar.h1 = true;
            this.c = nVar;
        } else if (i10 != 5) {
            this.b = new hg.m(getContext(), null);
            hg.m mVar2 = new hg.m(getContext(), null);
            this.c = mVar2;
            mVar2.t0.y = true;
        } else {
            this.b = new hg.l(getContext(), null);
            hg.l lVar = new hg.l(getContext(), null);
            this.c = lVar;
            lVar.t0.y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.b.a = fVar;
        this.c.a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.b);
        frameLayout.addView(this.b.t0, -2, -2);
        frameLayout.addView(this.c);
        frameLayout.addView(this.c.t0, -2, -2);
        frameLayout.addView(radialProgressView, w7.a6.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s5, f6Var));
        this.b.setDateSelectionListener(new ul0(this, 19));
        this.b.t0.d(false, false);
        this.b.t0.setOnTouchListener(new org.telegram.ui.Components.el0());
        final int i13 = 1;
        this.b.t0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.la1
            public final /* synthetic */ pa1 b;

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
        this.c.t0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.la1
            public final /* synthetic */ pa1 b;

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
        f7.addView(this.d, w7.a6.c(52.0f, -1));
        f7.addView(frameLayout, w7.a6.c(-2.0f, -1));
        f7.addView(this.h, w7.a6.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f7.setClipChildren(false);
            f7.setClipToPadding(false);
        }
        addView(f7);
    }

    public final ValueAnimator a(long j3, boolean z10) {
        Window window = this.a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        hg.g gVar = this.b;
        gVar.J = false;
        hg.g gVar2 = this.c;
        gVar2.J = false;
        gVar.y0 = 2;
        gVar2.y0 = 1;
        final jg.j jVar = new jg.j();
        hg.j jVar2 = gVar.g0;
        jVar.b = jVar2.l;
        jVar.a = jVar2.k;
        int binarySearch = Arrays.binarySearch(this.r.d.a, j3);
        if (binarySearch < 0) {
            binarySearch = this.r.d.a.length - 1;
        }
        jVar.c = this.r.d.b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.z0 = jVar;
        gVar.z0 = jVar;
        long j10 = 0;
        long j11 = 2147483647L;
        for (int i10 = 0; i10 < this.r.d.d.size(); i10++) {
            if (((ig.a) this.r.d.d.get(i10)).a[binarySearch] > j10) {
                j10 = ((ig.a) this.r.d.d.get(i10)).a[binarySearch];
            }
            if (((ig.a) this.r.d.d.get(i10)).a[binarySearch] < j11) {
                j11 = ((ig.a) this.r.d.d.get(i10)).a[binarySearch];
            }
        }
        float f7 = j11 + (j10 - j11);
        float f10 = gVar.w;
        final float f11 = (f7 - f10) / (gVar.v - f10);
        gVar.q(jVar);
        gVar2.q(jVar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ma1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                pa1 pa1Var = pa1.this;
                hg.g gVar3 = pa1Var.b;
                float f12 = gVar3.F0;
                hg.j jVar3 = gVar3.g0;
                float f13 = jVar3.l;
                float f14 = jVar3.k;
                float f15 = ((f12 / (f13 - f14)) * f14) - hg.g.k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f11)) + rectF.top;
                jg.j jVar4 = jVar;
                jVar4.e = height;
                jVar4.d = (gVar3.G0 * jVar4.c) - f15;
                jVar4.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg.g gVar4 = pa1Var.c;
                gVar4.invalidate();
                gVar4.q(jVar4);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(ra1 ra1Var);

    public abstract void c();

    public final void d() {
        ig.b bVar;
        ArrayList arrayList;
        hg.g gVar = this.b;
        gVar.G();
        gVar.invalidate();
        hg.g gVar2 = this.c;
        gVar2.G();
        gVar2.invalidate();
        jg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        ra1 ra1Var = this.r;
        if (ra1Var != null && (bVar = ra1Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i10 = 0; i10 < this.r.d.d.size(); i10++) {
                int w02 = (((ig.a) this.r.d.d.get(i10)).g < 0 || !org.telegram.ui.ActionBar.j6.c1(((ig.a) this.r.d.d.get(i10)).g)) ? i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false)) < 0.5d ? ((ig.a) this.r.d.d.get(i10)).i : ((ig.a) this.r.d.d.get(i10)).h : org.telegram.ui.ActionBar.j6.w0(null, ((ig.a) this.r.d.d.get(i10)).g, false);
                ArrayList arrayList2 = this.n;
                if (i10 < arrayList2.size()) {
                    org.telegram.ui.Components.z00 z00Var = ((oa1) arrayList2.get(i10)).a;
                    z00Var.getClass();
                    z00Var.r = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false);
                    z00Var.v = -1;
                    z00Var.s = w02;
                    z00Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h6, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.s5, false));
    }

    public final void e(ra1 ra1Var, boolean z10) {
        if (ra1Var == null) {
            return;
        }
        String str = ra1Var.j;
        jg.c cVar = this.d;
        cVar.setTitle(str);
        boolean z11 = getContext().getResources().getConfiguration().orientation == 2;
        hg.g gVar = this.b;
        gVar.setLandscape(z11);
        ArrayList arrayList = gVar.d;
        hg.j jVar = gVar.g0;
        hg.g gVar2 = this.c;
        gVar2.setLandscape(z11);
        this.r = ra1Var;
        boolean z12 = ra1Var.l;
        ArrayList arrayList2 = this.n;
        m91 m91Var = this.h;
        RadialProgressView radialProgressView = this.e;
        TextView textView = this.f;
        if (z12 || ra1Var.a) {
            radialProgressView.setVisibility(8);
            String str2 = ra1Var.b;
            if (str2 != null) {
                textView.setText(str2);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            m91Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
            return;
        }
        textView.setVisibility(8);
        jg.e eVar = gVar.t0;
        boolean z13 = ra1Var.n;
        eVar.a = z13;
        cVar.c(!z13);
        if (ra1Var.d == null && ra1Var.f != null) {
            radialProgressView.setAlpha(1.0f);
            radialProgressView.setVisibility(0);
            b(ra1Var);
            gVar.D(null);
            return;
        }
        if (!z10) {
            radialProgressView.setVisibility(8);
        }
        if (gVar.D(ra1Var.d) && ra1Var.h) {
            jVar.k = 0.0f;
            jVar.l = 1.0f;
            jVar.a.A(true, false, false);
        }
        cVar.setUseWeekInterval(ra1Var.o);
        gVar.t0.setUseWeek(ra1Var.o);
        jg.e eVar2 = gVar.t0;
        int i10 = 4;
        eVar2.F = this.r.g != null || this.s == 4;
        gVar2.t0.F = false;
        eVar2.setEnabled(eVar2.F);
        jg.e eVar3 = gVar2.t0;
        eVar3.setEnabled(eVar3.F);
        int size = arrayList.size();
        m91Var.removeAllViews();
        arrayList2.clear();
        if (size > 1) {
            for (int i11 = 0; i11 < size; i11++) {
                jg.f fVar = (jg.f) arrayList.get(i11);
                oa1 oa1Var = new oa1(this, i11);
                oa1Var.b = fVar;
                String str3 = fVar.a.d;
                org.telegram.ui.Components.z00 z00Var = oa1Var.a;
                z00Var.setText(str3);
                z00Var.a(fVar.n, false);
                z00Var.setOnTouchListener(new org.telegram.ui.Components.el0());
                z00Var.setOnClickListener(new w71(i10, oa1Var, fVar));
                z00Var.setOnLongClickListener(new org.telegram.ui.Components.b0(5, oa1Var, fVar));
            }
        }
        long j3 = this.r.c;
        if (j3 > 0) {
            gVar.s0 = Arrays.binarySearch(gVar.h0.a, j3);
            gVar.u0 = true;
            gVar.t0.setVisibility(0);
            gVar.v0 = 1.0f;
            gVar.x((gVar.G0 * jVar.k) - hg.g.k1);
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
            gVar.y0 = 3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            jg.j jVar2 = new jg.j();
            gVar.z0 = jVar2;
            jVar2.f = 0.0f;
            ofFloat.addUpdateListener(new f21(this, 12));
            ofFloat.addListener(new na1(this, 2));
            ofFloat.start();
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        hg.g gVar = this.b;
        long selectedDate = gVar.getSelectedDate();
        ig.b bVar = this.r.e;
        hg.g gVar2 = this.c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
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
                    if (((ig.a) bVar.d.get(i12)).c.equals(((ig.a) this.r.d.d.get(i10)).c)) {
                        boolean z12 = ((oa1) arrayList.get(i10)).a.b;
                        ((jg.f) arrayList2.get(i12)).n = z12;
                        ((jg.f) arrayList2.get(i12)).o = z12 ? 1.0f : 0.0f;
                        ((oa1) arrayList.get(i10)).a.c = true;
                        ((oa1) arrayList.get(i10)).a.animate().alpha(1.0f).start();
                        if (z12) {
                            i11++;
                        }
                        z11 = true;
                    } else {
                        i12++;
                    }
                }
                if (!z11) {
                    ((oa1) arrayList.get(i10)).a.c = false;
                    ((oa1) arrayList.get(i10)).a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.r.d.d.size(); i13++) {
                    ((oa1) arrayList.get(i13)).a.c = true;
                    ((oa1) arrayList.get(i13)).a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.r.c = selectedDate;
        gVar.t0.setAlpha(0.0f);
        gVar.v0 = 0.0f;
        gVar.u0 = false;
        gVar.i1 = false;
        gVar2.G();
        jg.c cVar = this.d;
        if (!z10) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (!z10) {
            ValueAnimator a2 = a(selectedDate, true);
            a2.addListener(new na1(this, 0));
            a2.start();
            return;
        }
        gVar.setVisibility(4);
        gVar2.setVisibility(0);
        gVar.y0 = 0;
        gVar2.y0 = 0;
        gVar.J = false;
        gVar2.J = true;
        cVar.d(selectedDate, false);
    }

    public final void h(boolean z10) {
        ig.b bVar;
        ra1 ra1Var = this.r;
        if (ra1Var == null || (bVar = ra1Var.d) == null || bVar.a == null) {
            return;
        }
        jg.c cVar = this.d;
        TextView textView = cVar.d;
        TextView textView2 = cVar.a;
        hg.g gVar = this.b;
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
            textView.setPivotY(AndroidUtilities.dp(40.0f));
            textView.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
        } else {
            textView2.setAlpha(1.0f);
            textView2.setScaleX(1.0f);
            textView2.setScaleY(1.0f);
            textView.setAlpha(0.0f);
        }
        gVar.t0.f.setAlpha(1.0f);
        hg.g gVar2 = this.c;
        gVar2.setHeader(null);
        long selectedDate = gVar.getSelectedDate();
        this.r.c = 0L;
        int i10 = 0;
        gVar.setVisibility(0);
        gVar2.d();
        gVar2.setHeader(null);
        gVar.setHeader(cVar);
        ArrayList arrayList = this.n;
        if (z10) {
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new na1(this, 1));
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                oa1 oa1Var = (oa1) obj;
                oa1Var.a.animate().alpha(1.0f).start();
                oa1Var.a.c = true;
            }
            a2.start();
            return;
        }
        gVar2.setVisibility(4);
        gVar.J = true;
        gVar2.J = false;
        gVar.invalidate();
        Window window = this.a;
        if (window != null) {
            window.clearFlags(16);
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            oa1 oa1Var2 = (oa1) obj2;
            oa1Var2.a.setAlpha(1.0f);
            oa1Var2.a.c = true;
        }
    }
}
