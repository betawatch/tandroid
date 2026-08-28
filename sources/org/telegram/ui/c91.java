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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class c91 extends FrameLayout {
    public final Window a;
    public final qf.g b;
    public final qf.g c;
    public final sf.c d;
    public final RadialProgressView e;
    public final TextView f;
    public final b81 h;
    public final ArrayList n;
    public e91 r;
    public final int s;

    public c91(Context context, int i9, qf.f fVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.a = ((Activity) context).getWindow();
        } else {
            this.a = null;
        }
        this.s = i9;
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        this.h = new b81(context, 1);
        sf.c cVar = new sf.c(getContext(), b6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new org.telegram.ui.Components.hk0());
        final int i10 = 0;
        cVar.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y81
            public final /* synthetic */ c91 b;

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
        if (i9 == 1) {
            this.b = new qf.k(getContext(), b6Var);
            qf.k kVar = new qf.k(getContext(), b6Var);
            this.c = kVar;
            kVar.p0.y = true;
        } else if (i9 == 2) {
            this.b = new qf.p(getContext(), b6Var);
            qf.p pVar = new qf.p(getContext(), b6Var);
            this.c = pVar;
            pVar.p0.y = true;
        } else if (i9 == 3) {
            qf.a aVar = new qf.a(getContext(), null);
            aVar.s0 = true;
            aVar.t0 = true;
            this.b = aVar;
            qf.m mVar = new qf.m(getContext(), null);
            this.c = mVar;
            mVar.p0.y = true;
        } else if (i9 == 4) {
            qf.q qVar = new qf.q(getContext());
            this.b = qVar;
            qVar.p0.A = true;
            qf.n nVar = new qf.n(getContext());
            nVar.I1 = -1;
            nVar.J1 = new RectF();
            nVar.L1 = AndroidUtilities.dp(9.0f);
            nVar.M1 = AndroidUtilities.dp(13.0f);
            nVar.N1 = new String[101];
            nVar.P1 = 1.0f;
            nVar.Q1 = 0;
            nVar.R1 = -1;
            nVar.S1 = -1;
            for (int i11 = 1; i11 <= 100; i11++) {
                nVar.N1[i11] = ta.b.c(i11, "%");
            }
            TextPaint textPaint = new TextPaint(1);
            nVar.K1 = textPaint;
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(-1);
            textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
            nVar.d1 = true;
            this.c = nVar;
        } else if (i9 != 5) {
            this.b = new qf.m(getContext(), null);
            qf.m mVar2 = new qf.m(getContext(), null);
            this.c = mVar2;
            mVar2.p0.y = true;
        } else {
            this.b = new qf.l(getContext(), null);
            qf.l lVar = new qf.l(getContext(), null);
            this.c = lVar;
            lVar.p0.y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.b.a = fVar;
        this.c.a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.b);
        frameLayout.addView(this.b.p0, -2, -2);
        frameLayout.addView(this.c);
        frameLayout.addView(this.c.p0, -2, -2);
        frameLayout.addView(radialProgressView, g7.e6.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.s5, b6Var));
        this.b.setDateSelectionListener(new dl0(this, 19));
        this.b.p0.d(false, false);
        this.b.p0.setOnTouchListener(new org.telegram.ui.Components.hk0());
        final int i12 = 1;
        this.b.p0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y81
            public final /* synthetic */ c91 b;

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
        this.c.p0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y81
            public final /* synthetic */ c91 b;

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
        f10.addView(this.d, g7.e6.c(52.0f, -1));
        f10.addView(frameLayout, g7.e6.c(-2.0f, -1));
        f10.addView(this.h, g7.e6.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
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
        qf.g gVar = this.b;
        gVar.F = false;
        qf.g gVar2 = this.c;
        gVar2.F = false;
        gVar.u0 = 2;
        gVar2.u0 = 1;
        final sf.j jVar = new sf.j();
        qf.j jVar2 = gVar.c0;
        jVar.b = jVar2.l;
        jVar.a = jVar2.k;
        int binarySearch = Arrays.binarySearch(this.r.d.a, j10);
        if (binarySearch < 0) {
            binarySearch = this.r.d.a.length - 1;
        }
        jVar.c = this.r.d.b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.v0 = jVar;
        gVar.v0 = jVar;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i9 = 0; i9 < this.r.d.d.size(); i9++) {
            if (((rf.a) this.r.d.d.get(i9)).a[binarySearch] > j11) {
                j11 = ((rf.a) this.r.d.d.get(i9)).a[binarySearch];
            }
            if (((rf.a) this.r.d.d.get(i9)).a[binarySearch] < j12) {
                j12 = ((rf.a) this.r.d.d.get(i9)).a[binarySearch];
            }
        }
        float f10 = j12 + (j11 - j12);
        float f11 = gVar.w;
        final float f12 = (f10 - f11) / (gVar.v - f11);
        gVar.q(jVar);
        gVar2.q(jVar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.z81
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c91 c91Var = c91.this;
                qf.g gVar3 = c91Var.b;
                float f13 = gVar3.B0;
                qf.j jVar3 = gVar3.c0;
                float f14 = jVar3.l;
                float f15 = jVar3.k;
                float f16 = ((f13 / (f14 - f15)) * f15) - qf.g.g1;
                RectF rectF = gVar3.D0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                sf.j jVar4 = jVar;
                jVar4.e = height;
                jVar4.d = (gVar3.C0 * jVar4.c) - f16;
                jVar4.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qf.g gVar4 = c91Var.c;
                gVar4.invalidate();
                gVar4.q(jVar4);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(e91 e91Var);

    public abstract void c();

    public final void d() {
        rf.b bVar;
        ArrayList arrayList;
        qf.g gVar = this.b;
        gVar.G();
        gVar.invalidate();
        qf.g gVar2 = this.c;
        gVar2.G();
        gVar2.invalidate();
        sf.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        e91 e91Var = this.r;
        if (e91Var != null && (bVar = e91Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i9 = 0; i9 < this.r.d.d.size(); i9++) {
                int w02 = (((rf.a) this.r.d.d.get(i9)).g < 0 || !org.telegram.ui.ActionBar.f6.c1(((rf.a) this.r.d.d.get(i9)).g)) ? i0.a.f(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false)) < 0.5d ? ((rf.a) this.r.d.d.get(i9)).i : ((rf.a) this.r.d.d.get(i9)).h : org.telegram.ui.ActionBar.f6.w0(null, ((rf.a) this.r.d.d.get(i9)).g, false);
                ArrayList arrayList2 = this.n;
                if (i9 < arrayList2.size()) {
                    org.telegram.ui.Components.d00 d00Var = ((b91) arrayList2.get(i9)).a;
                    d00Var.getClass();
                    d00Var.r = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false);
                    d00Var.v = -1;
                    d00Var.s = w02;
                    d00Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h6, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.s5, false));
    }

    public final void e(e91 e91Var, boolean z10) {
        if (e91Var == null) {
            return;
        }
        String str = e91Var.j;
        sf.c cVar = this.d;
        cVar.setTitle(str);
        boolean z11 = getContext().getResources().getConfiguration().orientation == 2;
        qf.g gVar = this.b;
        gVar.setLandscape(z11);
        ArrayList arrayList = gVar.d;
        qf.j jVar = gVar.c0;
        qf.g gVar2 = this.c;
        gVar2.setLandscape(z11);
        this.r = e91Var;
        boolean z12 = e91Var.l;
        ArrayList arrayList2 = this.n;
        b81 b81Var = this.h;
        RadialProgressView radialProgressView = this.e;
        TextView textView = this.f;
        if (z12 || e91Var.a) {
            radialProgressView.setVisibility(8);
            String str2 = e91Var.b;
            if (str2 != null) {
                textView.setText(str2);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            b81Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
            return;
        }
        textView.setVisibility(8);
        sf.e eVar = gVar.p0;
        boolean z13 = e91Var.n;
        eVar.a = z13;
        cVar.c(!z13);
        if (e91Var.d == null && e91Var.f != null) {
            radialProgressView.setAlpha(1.0f);
            radialProgressView.setVisibility(0);
            b(e91Var);
            gVar.D(null);
            return;
        }
        if (!z10) {
            radialProgressView.setVisibility(8);
        }
        if (gVar.D(e91Var.d) && e91Var.h) {
            jVar.k = 0.0f;
            jVar.l = 1.0f;
            jVar.a.A(true, false, false);
        }
        cVar.setUseWeekInterval(e91Var.o);
        gVar.p0.setUseWeek(e91Var.o);
        sf.e eVar2 = gVar.p0;
        eVar2.B = this.r.g != null || this.s == 4;
        gVar2.p0.B = false;
        eVar2.setEnabled(eVar2.B);
        sf.e eVar3 = gVar2.p0;
        eVar3.setEnabled(eVar3.B);
        int size = arrayList.size();
        b81Var.removeAllViews();
        arrayList2.clear();
        if (size > 1) {
            for (int i9 = 0; i9 < size; i9++) {
                sf.f fVar = (sf.f) arrayList.get(i9);
                b91 b91Var = new b91(this, i9);
                b91Var.b = fVar;
                String str3 = fVar.a.d;
                org.telegram.ui.Components.d00 d00Var = b91Var.a;
                d00Var.setText(str3);
                d00Var.a(fVar.n, false);
                d00Var.setOnTouchListener(new org.telegram.ui.Components.hk0());
                d00Var.setOnClickListener(new v80(24, b91Var, fVar));
                d00Var.setOnLongClickListener(new ih.g2(6, b91Var, fVar));
            }
        }
        long j10 = this.r.c;
        if (j10 > 0) {
            gVar.o0 = Arrays.binarySearch(gVar.d0.a, j10);
            gVar.q0 = true;
            gVar.p0.setVisibility(0);
            gVar.r0 = 1.0f;
            gVar.x((gVar.C0 * jVar.k) - qf.g.g1);
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
            gVar.u0 = 3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            sf.j jVar2 = new sf.j();
            gVar.v0 = jVar2;
            jVar2.f = 0.0f;
            ofFloat.addUpdateListener(new v01(this, 12));
            ofFloat.addListener(new a91(this, 2));
            ofFloat.start();
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        qf.g gVar = this.b;
        long selectedDate = gVar.getSelectedDate();
        rf.b bVar = this.r.e;
        qf.g gVar2 = this.c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.r.d.d.size() > 1) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int size = this.r.d.d.size();
                arrayList = this.n;
                if (i9 >= size) {
                    break;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.d.size()) {
                        z11 = false;
                        break;
                    }
                    if (((rf.a) bVar.d.get(i11)).c.equals(((rf.a) this.r.d.d.get(i9)).c)) {
                        boolean z12 = ((b91) arrayList.get(i9)).a.b;
                        ((sf.f) arrayList2.get(i11)).n = z12;
                        ((sf.f) arrayList2.get(i11)).o = z12 ? 1.0f : 0.0f;
                        ((b91) arrayList.get(i9)).a.c = true;
                        ((b91) arrayList.get(i9)).a.animate().alpha(1.0f).start();
                        if (z12) {
                            i10++;
                        }
                        z11 = true;
                    } else {
                        i11++;
                    }
                }
                if (!z11) {
                    ((b91) arrayList.get(i9)).a.c = false;
                    ((b91) arrayList.get(i9)).a.animate().alpha(0.0f).start();
                }
                i9++;
            }
            if (i10 == 0) {
                for (int i12 = 0; i12 < this.r.d.d.size(); i12++) {
                    ((b91) arrayList.get(i12)).a.c = true;
                    ((b91) arrayList.get(i12)).a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.r.c = selectedDate;
        gVar.p0.setAlpha(0.0f);
        gVar.r0 = 0.0f;
        gVar.q0 = false;
        gVar.e1 = false;
        gVar2.G();
        sf.c cVar = this.d;
        if (!z10) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (!z10) {
            ValueAnimator a2 = a(selectedDate, true);
            a2.addListener(new a91(this, 0));
            a2.start();
            return;
        }
        gVar.setVisibility(4);
        gVar2.setVisibility(0);
        gVar.u0 = 0;
        gVar2.u0 = 0;
        gVar.F = false;
        gVar2.F = true;
        cVar.d(selectedDate, false);
    }

    public final void h(boolean z10) {
        rf.b bVar;
        e91 e91Var = this.r;
        if (e91Var == null || (bVar = e91Var.d) == null || bVar.a == null) {
            return;
        }
        sf.c cVar = this.d;
        TextView textView = cVar.d;
        TextView textView2 = cVar.a;
        qf.g gVar = this.b;
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
        gVar.p0.f.setAlpha(1.0f);
        qf.g gVar2 = this.c;
        gVar2.setHeader(null);
        long selectedDate = gVar.getSelectedDate();
        this.r.c = 0L;
        int i9 = 0;
        gVar.setVisibility(0);
        gVar2.d();
        gVar2.setHeader(null);
        gVar.setHeader(cVar);
        ArrayList arrayList = this.n;
        if (z10) {
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new a91(this, 1));
            int size = arrayList.size();
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                b91 b91Var = (b91) obj;
                b91Var.a.animate().alpha(1.0f).start();
                b91Var.a.c = true;
            }
            a2.start();
            return;
        }
        gVar2.setVisibility(4);
        gVar.F = true;
        gVar2.F = false;
        gVar.invalidate();
        Window window = this.a;
        if (window != null) {
            window.clearFlags(16);
        }
        int size2 = arrayList.size();
        while (i9 < size2) {
            Object obj2 = arrayList.get(i9);
            i9++;
            b91 b91Var2 = (b91) obj2;
            b91Var2.a.setAlpha(1.0f);
            b91Var2.a.c = true;
        }
    }
}
