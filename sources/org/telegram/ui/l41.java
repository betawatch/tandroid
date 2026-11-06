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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class l41 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final Window a;
    public final lg.g b;
    public final lg.g c;
    public final ng.c d;
    public final RadialProgressView e;
    public final TextView f;
    public final rq0 h;
    public final ArrayList n;
    public o41 r;
    public final int s;

    public l41(Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.a = ((Activity) context).getWindow();
        } else {
            this.a = null;
        }
        this.s = i7;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.h = new rq0(context, 8);
        ng.c cVar = new ng.c(getContext(), f6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new org.telegram.ui.Components.wi0());
        final int i10 = 0;
        cVar.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.h41
            public final /* synthetic */ l41 b;

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
        if (i7 == 1) {
            this.b = new lg.k(getContext(), f6Var);
            lg.k kVar = new lg.k(getContext(), f6Var);
            this.c = kVar;
            kVar.t0.D = true;
        } else if (i7 == 2) {
            this.b = new lg.p(getContext(), f6Var);
            lg.p pVar = new lg.p(getContext(), f6Var);
            this.c = pVar;
            pVar.t0.D = true;
        } else if (i7 == 3) {
            lg.a aVar = new lg.a(getContext(), null);
            aVar.w0 = true;
            aVar.x0 = true;
            this.b = aVar;
            lg.m mVar = new lg.m(getContext(), null);
            this.c = mVar;
            mVar.t0.D = true;
        } else if (i7 == 4) {
            lg.q qVar = new lg.q(getContext());
            this.b = qVar;
            qVar.t0.E = true;
            lg.n nVar = new lg.n(getContext());
            nVar.M1 = -1;
            nVar.N1 = new RectF();
            nVar.P1 = org.telegram.messenger.g0.L(9.0f);
            nVar.Q1 = org.telegram.messenger.g0.L(13.0f);
            nVar.R1 = new String[101];
            nVar.T1 = 1.0f;
            nVar.U1 = 0;
            nVar.V1 = -1;
            nVar.W1 = -1;
            for (int i11 = 1; i11 <= 100; i11++) {
                nVar.R1[i11] = com.google.android.recaptcha.internal.a.i(i11, "%");
            }
            TextPaint textPaint = new TextPaint(1);
            nVar.O1 = textPaint;
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(-1);
            textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
            nVar.h1 = true;
            this.c = nVar;
        } else if (i7 != 5) {
            this.b = new lg.m(getContext(), null);
            lg.m mVar2 = new lg.m(getContext(), null);
            this.c = mVar2;
            mVar2.t0.D = true;
        } else {
            this.b = new lg.l(getContext(), null);
            lg.l lVar = new lg.l(getContext(), null);
            this.c = lVar;
            lVar.t0.D = true;
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
        frameLayout.addView(radialProgressView, c8.ha.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.s5, f6Var);
        this.b.setDateSelectionListener(new li0(this, 17));
        this.b.t0.d(false, false);
        this.b.t0.setOnTouchListener(new org.telegram.ui.Components.wi0());
        final int i12 = 1;
        this.b.t0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.h41
            public final /* synthetic */ l41 b;

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
        this.c.t0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.h41
            public final /* synthetic */ l41 b;

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
        f10.addView(this.d, c8.ha.c(52.0f, -1));
        f10.addView(frameLayout, c8.ha.c(-2.0f, -1));
        f10.addView(this.h, c8.ha.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
        }
        addView(f10);
    }

    public final ValueAnimator a(long j3, boolean z9) {
        Window window = this.a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        lg.g gVar = this.b;
        gVar.J = false;
        lg.g gVar2 = this.c;
        gVar2.J = false;
        gVar.y0 = 2;
        gVar2.y0 = 1;
        final ng.j jVar = new ng.j();
        lg.j jVar2 = gVar.g0;
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
        for (int i7 = 0; i7 < this.r.d.d.size(); i7++) {
            if (((mg.a) this.r.d.d.get(i7)).a[binarySearch] > j10) {
                j10 = ((mg.a) this.r.d.d.get(i7)).a[binarySearch];
            }
            if (((mg.a) this.r.d.d.get(i7)).a[binarySearch] < j11) {
                j11 = ((mg.a) this.r.d.d.get(i7)).a[binarySearch];
            }
        }
        float f10 = j11 + (j10 - j11);
        float f11 = gVar.x;
        final float f12 = (f10 - f11) / (gVar.w - f11);
        gVar.q(jVar);
        gVar2.q(jVar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z9 ? 0.0f : 1.0f, z9 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.i41
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l41 l41Var = l41.this;
                lg.g gVar3 = l41Var.b;
                float f13 = gVar3.F0;
                lg.j jVar3 = gVar3.g0;
                float f14 = jVar3.l;
                float f15 = jVar3.k;
                float f16 = ((f13 / (f14 - f15)) * f15) - lg.g.k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                ng.j jVar4 = jVar;
                jVar4.e = height;
                jVar4.d = (gVar3.G0 * jVar4.c) - f16;
                jVar4.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg.g gVar4 = l41Var.c;
                gVar4.invalidate();
                gVar4.q(jVar4);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new x1.a());
        return ofFloat;
    }

    public abstract void b(o41 o41Var);

    public abstract void c();

    public final void d() {
        mg.b bVar;
        ArrayList arrayList;
        lg.g gVar = this.b;
        gVar.G();
        gVar.invalidate();
        lg.g gVar2 = this.c;
        gVar2.G();
        gVar2.invalidate();
        ng.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        o41 o41Var = this.r;
        if (o41Var != null && (bVar = o41Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i7 = 0; i7 < this.r.d.d.size(); i7++) {
                int x02 = (((mg.a) this.r.d.d.get(i7)).g < 0 || !org.telegram.ui.ActionBar.k6.f1(((mg.a) this.r.d.d.get(i7)).g)) ? i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false)) < 0.5d ? ((mg.a) this.r.d.d.get(i7)).i : ((mg.a) this.r.d.d.get(i7)).h : org.telegram.ui.ActionBar.k6.x0(null, ((mg.a) this.r.d.d.get(i7)).g, false);
                ArrayList arrayList2 = this.n;
                if (i7 < arrayList2.size()) {
                    org.telegram.ui.Components.kz kzVar = ((k41) arrayList2.get(i7)).a;
                    kzVar.getClass();
                    kzVar.r = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
                    kzVar.w = -1;
                    kzVar.s = x02;
                    kzVar.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h6, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s5, false));
    }

    public final void e(o41 o41Var, boolean z9) {
        if (o41Var == null) {
            return;
        }
        String str = o41Var.j;
        ng.c cVar = this.d;
        cVar.setTitle(str);
        boolean z10 = getContext().getResources().getConfiguration().orientation == 2;
        lg.g gVar = this.b;
        gVar.setLandscape(z10);
        ArrayList arrayList = gVar.d;
        lg.j jVar = gVar.g0;
        lg.g gVar2 = this.c;
        gVar2.setLandscape(z10);
        this.r = o41Var;
        boolean z11 = o41Var.l;
        ArrayList arrayList2 = this.n;
        rq0 rq0Var = this.h;
        RadialProgressView radialProgressView = this.e;
        int i7 = 8;
        TextView textView = this.f;
        if (z11 || o41Var.a) {
            radialProgressView.setVisibility(8);
            String str2 = o41Var.b;
            if (str2 != null) {
                textView.setText(str2);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            rq0Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
            return;
        }
        textView.setVisibility(8);
        ng.e eVar = gVar.t0;
        boolean z12 = o41Var.n;
        eVar.a = z12;
        cVar.c(!z12);
        if (o41Var.d == null && o41Var.f != null) {
            radialProgressView.setAlpha(1.0f);
            radialProgressView.setVisibility(0);
            b(o41Var);
            gVar.D(null);
            return;
        }
        if (!z9) {
            radialProgressView.setVisibility(8);
        }
        if (gVar.D(o41Var.d) && o41Var.h) {
            jVar.k = 0.0f;
            jVar.l = 1.0f;
            jVar.a.A(true, false, false);
        }
        cVar.setUseWeekInterval(o41Var.o);
        gVar.t0.setUseWeek(o41Var.o);
        ng.e eVar2 = gVar.t0;
        eVar2.F = this.r.g != null || this.s == 4;
        gVar2.t0.F = false;
        eVar2.setEnabled(eVar2.F);
        ng.e eVar3 = gVar2.t0;
        eVar3.setEnabled(eVar3.F);
        int size = arrayList.size();
        rq0Var.removeAllViews();
        arrayList2.clear();
        if (size > 1) {
            for (int i10 = 0; i10 < size; i10++) {
                ng.f fVar = (ng.f) arrayList.get(i10);
                k41 k41Var = new k41(this, i10);
                k41Var.b = fVar;
                String str3 = fVar.a.d;
                org.telegram.ui.Components.kz kzVar = k41Var.a;
                kzVar.setText(str3);
                kzVar.a(fVar.n, false);
                kzVar.setOnTouchListener(new org.telegram.ui.Components.wi0());
                kzVar.setOnClickListener(new fk0(13, k41Var, fVar));
                kzVar.setOnLongClickListener(new di.f2(7, k41Var, fVar));
            }
        }
        long j3 = this.r.c;
        if (j3 > 0) {
            gVar.s0 = Arrays.binarySearch(gVar.h0.a, j3);
            gVar.u0 = true;
            gVar.t0.setVisibility(0);
            gVar.v0 = 1.0f;
            gVar.x((gVar.G0 * jVar.k) - lg.g.k1);
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
        if (z9) {
            gVar.y0 = 3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ng.j jVar2 = new ng.j();
            gVar.z0 = jVar2;
            jVar2.f = 0.0f;
            ofFloat.addUpdateListener(new gz0(this, i7));
            ofFloat.addListener(new j41(this, 2));
            ofFloat.start();
        }
    }

    public abstract void f();

    public final void g(boolean z9) {
        ArrayList arrayList;
        boolean z10;
        lg.g gVar = this.b;
        long selectedDate = gVar.getSelectedDate();
        mg.b bVar = this.r.e;
        lg.g gVar2 = this.c;
        if (!z9 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.r.d.d.size() > 1) {
            int i7 = 0;
            int i10 = 0;
            while (true) {
                int size = this.r.d.d.size();
                arrayList = this.n;
                if (i7 >= size) {
                    break;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.d.size()) {
                        z10 = false;
                        break;
                    }
                    if (((mg.a) bVar.d.get(i11)).c.equals(((mg.a) this.r.d.d.get(i7)).c)) {
                        boolean z11 = ((k41) arrayList.get(i7)).a.b;
                        ((ng.f) arrayList2.get(i11)).n = z11;
                        ((ng.f) arrayList2.get(i11)).o = z11 ? 1.0f : 0.0f;
                        ((k41) arrayList.get(i7)).a.c = true;
                        ((k41) arrayList.get(i7)).a.animate().alpha(1.0f).start();
                        if (z11) {
                            i10++;
                        }
                        z10 = true;
                    } else {
                        i11++;
                    }
                }
                if (!z10) {
                    ((k41) arrayList.get(i7)).a.c = false;
                    ((k41) arrayList.get(i7)).a.animate().alpha(0.0f).start();
                }
                i7++;
            }
            if (i10 == 0) {
                for (int i12 = 0; i12 < this.r.d.d.size(); i12++) {
                    ((k41) arrayList.get(i12)).a.c = true;
                    ((k41) arrayList.get(i12)).a.animate().alpha(1.0f).start();
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
        ng.c cVar = this.d;
        if (!z9) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (!z9) {
            ValueAnimator a10 = a(selectedDate, true);
            a10.addListener(new j41(this, 0));
            a10.start();
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

    public final void h(boolean z9) {
        mg.b bVar;
        o41 o41Var = this.r;
        if (o41Var == null || (bVar = o41Var.d) == null || bVar.a == null) {
            return;
        }
        ng.c cVar = this.d;
        TextView textView = cVar.d;
        TextView textView2 = cVar.a;
        lg.g gVar = this.b;
        cVar.b(gVar.getStartDate(), gVar.getEndDate());
        if (z9) {
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
        gVar.t0.f.setAlpha(1.0f);
        lg.g gVar2 = this.c;
        gVar2.setHeader(null);
        long selectedDate = gVar.getSelectedDate();
        this.r.c = 0L;
        int i7 = 0;
        gVar.setVisibility(0);
        gVar2.d();
        gVar2.setHeader(null);
        gVar.setHeader(cVar);
        ArrayList arrayList = this.n;
        if (z9) {
            ValueAnimator a10 = a(selectedDate, false);
            a10.addListener(new j41(this, 1));
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                k41 k41Var = (k41) obj;
                k41Var.a.animate().alpha(1.0f).start();
                k41Var.a.c = true;
            }
            a10.start();
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
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            k41 k41Var2 = (k41) obj2;
            k41Var2.a.setAlpha(1.0f);
            k41Var2.a.c = true;
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            if (this.b != null && this.c != null && this.d != null && this.e != null && this.f != null) {
                d();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
