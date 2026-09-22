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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class ja1 extends FrameLayout {
    public final Window a;
    public final ig.g b;
    public final ig.g c;
    public final kg.c d;
    public final RadialProgressView e;
    public final TextView f;
    public final t51 h;
    public final ArrayList n;
    public la1 r;
    public final int s;

    public ja1(Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.a = ((Activity) context).getWindow();
        } else {
            this.a = null;
        }
        this.s = i10;
        LinearLayout f7 = org.telegram.messenger.vl.f(context, 1);
        this.h = new t51(context, 2);
        kg.c cVar = new kg.c(getContext(), e6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new org.telegram.ui.Components.uk0());
        final int i11 = 0;
        cVar.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fa1
            public final /* synthetic */ ja1 b;

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
            this.b = new ig.k(getContext(), e6Var);
            ig.k kVar = new ig.k(getContext(), e6Var);
            this.c = kVar;
            kVar.t0.y = true;
        } else if (i10 == 2) {
            this.b = new ig.p(getContext(), e6Var);
            ig.p pVar = new ig.p(getContext(), e6Var);
            this.c = pVar;
            pVar.t0.y = true;
        } else if (i10 == 3) {
            ig.a aVar = new ig.a(getContext(), null);
            aVar.w0 = true;
            aVar.x0 = true;
            this.b = aVar;
            ig.m mVar = new ig.m(getContext(), null);
            this.c = mVar;
            mVar.t0.y = true;
        } else if (i10 == 4) {
            ig.q qVar = new ig.q(getContext());
            this.b = qVar;
            qVar.t0.E = true;
            ig.n nVar = new ig.n(getContext());
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
                nVar.R1[i12] = a4.a.n(i12, "%");
            }
            TextPaint textPaint = new TextPaint(1);
            nVar.O1 = textPaint;
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(-1);
            textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
            nVar.h1 = true;
            this.c = nVar;
        } else if (i10 != 5) {
            this.b = new ig.m(getContext(), null);
            ig.m mVar2 = new ig.m(getContext(), null);
            this.c = mVar2;
            mVar2.t0.y = true;
        } else {
            this.b = new ig.l(getContext(), null);
            ig.l lVar = new ig.l(getContext(), null);
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
        frameLayout.addView(radialProgressView, w7.x5.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.s5, e6Var));
        this.b.setDateSelectionListener(new tl0(this, 19));
        this.b.t0.d(false, false);
        this.b.t0.setOnTouchListener(new org.telegram.ui.Components.uk0());
        final int i13 = 1;
        this.b.t0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fa1
            public final /* synthetic */ ja1 b;

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
        this.c.t0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fa1
            public final /* synthetic */ ja1 b;

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
        f7.addView(this.d, w7.x5.c(52.0f, -1));
        f7.addView(frameLayout, w7.x5.c(-2.0f, -1));
        f7.addView(this.h, w7.x5.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
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
        ig.g gVar = this.b;
        gVar.J = false;
        ig.g gVar2 = this.c;
        gVar2.J = false;
        gVar.y0 = 2;
        gVar2.y0 = 1;
        final kg.j jVar = new kg.j();
        ig.j jVar2 = gVar.g0;
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
            if (((jg.a) this.r.d.d.get(i10)).a[binarySearch] > j10) {
                j10 = ((jg.a) this.r.d.d.get(i10)).a[binarySearch];
            }
            if (((jg.a) this.r.d.d.get(i10)).a[binarySearch] < j11) {
                j11 = ((jg.a) this.r.d.d.get(i10)).a[binarySearch];
            }
        }
        float f7 = j11 + (j10 - j11);
        float f10 = gVar.w;
        final float f11 = (f7 - f10) / (gVar.v - f10);
        gVar.q(jVar);
        gVar2.q(jVar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ga1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ja1 ja1Var = ja1.this;
                ig.g gVar3 = ja1Var.b;
                float f12 = gVar3.F0;
                ig.j jVar3 = gVar3.g0;
                float f13 = jVar3.l;
                float f14 = jVar3.k;
                float f15 = ((f12 / (f13 - f14)) * f14) - ig.g.k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f11)) + rectF.top;
                kg.j jVar4 = jVar;
                jVar4.e = height;
                jVar4.d = (gVar3.G0 * jVar4.c) - f15;
                jVar4.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig.g gVar4 = ja1Var.c;
                gVar4.invalidate();
                gVar4.q(jVar4);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(la1 la1Var);

    public abstract void c();

    public final void d() {
        jg.b bVar;
        ArrayList arrayList;
        ig.g gVar = this.b;
        gVar.G();
        gVar.invalidate();
        ig.g gVar2 = this.c;
        gVar2.G();
        gVar2.invalidate();
        kg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        la1 la1Var = this.r;
        if (la1Var != null && (bVar = la1Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i10 = 0; i10 < this.r.d.d.size(); i10++) {
                int w02 = (((jg.a) this.r.d.d.get(i10)).g < 0 || !org.telegram.ui.ActionBar.i6.c1(((jg.a) this.r.d.d.get(i10)).g)) ? i0.a.f(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false)) < 0.5d ? ((jg.a) this.r.d.d.get(i10)).i : ((jg.a) this.r.d.d.get(i10)).h : org.telegram.ui.ActionBar.i6.w0(null, ((jg.a) this.r.d.d.get(i10)).g, false);
                ArrayList arrayList2 = this.n;
                if (i10 < arrayList2.size()) {
                    org.telegram.ui.Components.s00 s00Var = ((ia1) arrayList2.get(i10)).a;
                    s00Var.getClass();
                    s00Var.r = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false);
                    s00Var.v = -1;
                    s00Var.s = w02;
                    s00Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h6, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.s5, false));
    }

    public final void e(la1 la1Var, boolean z10) {
        if (la1Var == null) {
            return;
        }
        String str = la1Var.j;
        kg.c cVar = this.d;
        cVar.setTitle(str);
        boolean z11 = getContext().getResources().getConfiguration().orientation == 2;
        ig.g gVar = this.b;
        gVar.setLandscape(z11);
        ArrayList arrayList = gVar.d;
        ig.j jVar = gVar.g0;
        ig.g gVar2 = this.c;
        gVar2.setLandscape(z11);
        this.r = la1Var;
        boolean z12 = la1Var.l;
        ArrayList arrayList2 = this.n;
        t51 t51Var = this.h;
        RadialProgressView radialProgressView = this.e;
        TextView textView = this.f;
        if (z12 || la1Var.a) {
            radialProgressView.setVisibility(8);
            String str2 = la1Var.b;
            if (str2 != null) {
                textView.setText(str2);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            t51Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
            return;
        }
        textView.setVisibility(8);
        kg.e eVar = gVar.t0;
        boolean z13 = la1Var.n;
        eVar.a = z13;
        cVar.c(!z13);
        if (la1Var.d == null && la1Var.f != null) {
            radialProgressView.setAlpha(1.0f);
            radialProgressView.setVisibility(0);
            b(la1Var);
            gVar.D(null);
            return;
        }
        if (!z10) {
            radialProgressView.setVisibility(8);
        }
        if (gVar.D(la1Var.d) && la1Var.h) {
            jVar.k = 0.0f;
            jVar.l = 1.0f;
            jVar.a.A(true, false, false);
        }
        cVar.setUseWeekInterval(la1Var.o);
        gVar.t0.setUseWeek(la1Var.o);
        kg.e eVar2 = gVar.t0;
        eVar2.F = this.r.g != null || this.s == 4;
        gVar2.t0.F = false;
        eVar2.setEnabled(eVar2.F);
        kg.e eVar3 = gVar2.t0;
        eVar3.setEnabled(eVar3.F);
        int size = arrayList.size();
        t51Var.removeAllViews();
        arrayList2.clear();
        if (size > 1) {
            for (int i10 = 0; i10 < size; i10++) {
                kg.f fVar = (kg.f) arrayList.get(i10);
                ia1 ia1Var = new ia1(this, i10);
                ia1Var.b = fVar;
                String str3 = fVar.a.d;
                org.telegram.ui.Components.s00 s00Var = ia1Var.a;
                s00Var.setText(str3);
                s00Var.a(fVar.n, false);
                s00Var.setOnTouchListener(new org.telegram.ui.Components.uk0());
                s00Var.setOnClickListener(new wy0(7, ia1Var, fVar));
                s00Var.setOnLongClickListener(new ai.q3(6, ia1Var, fVar));
            }
        }
        long j3 = this.r.c;
        if (j3 > 0) {
            gVar.s0 = Arrays.binarySearch(gVar.h0.a, j3);
            gVar.u0 = true;
            gVar.t0.setVisibility(0);
            gVar.v0 = 1.0f;
            gVar.x((gVar.G0 * jVar.k) - ig.g.k1);
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
            kg.j jVar2 = new kg.j();
            gVar.z0 = jVar2;
            jVar2.f = 0.0f;
            ofFloat.addUpdateListener(new a21(this, 12));
            ofFloat.addListener(new ha1(this, 2));
            ofFloat.start();
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        ig.g gVar = this.b;
        long selectedDate = gVar.getSelectedDate();
        jg.b bVar = this.r.e;
        ig.g gVar2 = this.c;
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
                    if (((jg.a) bVar.d.get(i12)).c.equals(((jg.a) this.r.d.d.get(i10)).c)) {
                        boolean z12 = ((ia1) arrayList.get(i10)).a.b;
                        ((kg.f) arrayList2.get(i12)).n = z12;
                        ((kg.f) arrayList2.get(i12)).o = z12 ? 1.0f : 0.0f;
                        ((ia1) arrayList.get(i10)).a.c = true;
                        ((ia1) arrayList.get(i10)).a.animate().alpha(1.0f).start();
                        if (z12) {
                            i11++;
                        }
                        z11 = true;
                    } else {
                        i12++;
                    }
                }
                if (!z11) {
                    ((ia1) arrayList.get(i10)).a.c = false;
                    ((ia1) arrayList.get(i10)).a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.r.d.d.size(); i13++) {
                    ((ia1) arrayList.get(i13)).a.c = true;
                    ((ia1) arrayList.get(i13)).a.animate().alpha(1.0f).start();
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
        kg.c cVar = this.d;
        if (!z10) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (!z10) {
            ValueAnimator a2 = a(selectedDate, true);
            a2.addListener(new ha1(this, 0));
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
        jg.b bVar;
        la1 la1Var = this.r;
        if (la1Var == null || (bVar = la1Var.d) == null || bVar.a == null) {
            return;
        }
        kg.c cVar = this.d;
        TextView textView = cVar.d;
        TextView textView2 = cVar.a;
        ig.g gVar = this.b;
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
        ig.g gVar2 = this.c;
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
            a2.addListener(new ha1(this, 1));
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ia1 ia1Var = (ia1) obj;
                ia1Var.a.animate().alpha(1.0f).start();
                ia1Var.a.c = true;
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
            ia1 ia1Var2 = (ia1) obj2;
            ia1Var2.a.setAlpha(1.0f);
            ia1Var2.a.c = true;
        }
    }
}
