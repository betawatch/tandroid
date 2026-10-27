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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class i91 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final Window a;
    public final kg.h b;
    public final kg.h c;
    public final mg.c d;
    public final RadialProgressView e;
    public final TextView f;
    public final r41 h;
    public final ArrayList n;
    public k91 r;
    public final int s;

    public i91(Context context, int i10, kg.g gVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.a = ((Activity) context).getWindow();
        } else {
            this.a = null;
        }
        this.s = i10;
        LinearLayout d = org.telegram.messenger.wh.d(context, 1);
        this.h = new r41(context, 2);
        mg.c cVar = new mg.c(getContext(), u6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new org.telegram.ui.Components.vl0());
        final int i11 = 0;
        cVar.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e91
            public final /* synthetic */ i91 b;

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
            this.b = new kg.l(getContext(), u6Var);
            kg.l lVar = new kg.l(getContext(), u6Var);
            this.c = lVar;
            lVar.t0.y = true;
        } else if (i10 == 2) {
            this.b = new kg.q(getContext(), u6Var);
            kg.q qVar = new kg.q(getContext(), u6Var);
            this.c = qVar;
            qVar.t0.y = true;
        } else if (i10 == 3) {
            kg.a aVar = new kg.a(getContext(), null);
            aVar.w0 = true;
            aVar.x0 = true;
            this.b = aVar;
            kg.n nVar = new kg.n(getContext(), null);
            this.c = nVar;
            nVar.t0.y = true;
        } else if (i10 == 4) {
            kg.r rVar = new kg.r(getContext());
            this.b = rVar;
            rVar.t0.E = true;
            kg.o oVar = new kg.o(getContext());
            oVar.M1 = -1;
            oVar.N1 = new RectF();
            oVar.P1 = AndroidUtilities.dp(9.0f);
            oVar.Q1 = AndroidUtilities.dp(13.0f);
            oVar.R1 = new String[101];
            oVar.T1 = 1.0f;
            oVar.U1 = 0;
            oVar.V1 = -1;
            oVar.W1 = -1;
            for (int i12 = 1; i12 <= 100; i12++) {
                oVar.R1[i12] = a1.g.m(i12, "%");
            }
            TextPaint textPaint = new TextPaint(1);
            oVar.O1 = textPaint;
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(-1);
            textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
            oVar.h1 = true;
            this.c = oVar;
        } else if (i10 != 5) {
            this.b = new kg.n(getContext(), null);
            kg.n nVar2 = new kg.n(getContext(), null);
            this.c = nVar2;
            nVar2.t0.y = true;
        } else {
            this.b = new kg.m(getContext(), null);
            kg.m mVar = new kg.m(getContext(), null);
            this.c = mVar;
            mVar.t0.y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.b.a = gVar;
        this.c.a = gVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.b);
        frameLayout.addView(this.b.t0, -2, -2);
        frameLayout.addView(this.c);
        frameLayout.addView(this.c.t0, -2, -2);
        frameLayout.addView(radialProgressView, org.telegram.ui.Components.kb1.h(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.s5, u6Var);
        this.b.setDateSelectionListener(new jl0(this, 19));
        this.b.t0.d(false, false);
        this.b.t0.setOnTouchListener(new org.telegram.ui.Components.vl0());
        final int i13 = 1;
        this.b.t0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e91
            public final /* synthetic */ i91 b;

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
        this.c.t0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e91
            public final /* synthetic */ i91 b;

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
        d.addView(this.d, org.telegram.ui.Components.kb1.g(52.0f, -1));
        d.addView(frameLayout, org.telegram.ui.Components.kb1.g(-2.0f, -1));
        d.addView(this.h, org.telegram.ui.Components.kb1.h(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            d.setClipChildren(false);
            d.setClipToPadding(false);
        }
        addView(d);
    }

    public final ValueAnimator a(long j10, boolean z10) {
        Window window = this.a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        kg.h hVar = this.b;
        hVar.J = false;
        kg.h hVar2 = this.c;
        hVar2.J = false;
        hVar.y0 = 2;
        hVar2.y0 = 1;
        final mg.j jVar = new mg.j();
        kg.k kVar = hVar.g0;
        jVar.b = kVar.l;
        jVar.a = kVar.k;
        int binarySearch = Arrays.binarySearch(this.r.d.a, j10);
        if (binarySearch < 0) {
            binarySearch = this.r.d.a.length - 1;
        }
        jVar.c = this.r.d.b[binarySearch];
        hVar2.setVisibility(0);
        hVar2.z0 = jVar;
        hVar.z0 = jVar;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i10 = 0; i10 < this.r.d.d.size(); i10++) {
            if (((lg.a) this.r.d.d.get(i10)).a[binarySearch] > j11) {
                j11 = ((lg.a) this.r.d.d.get(i10)).a[binarySearch];
            }
            if (((lg.a) this.r.d.d.get(i10)).a[binarySearch] < j12) {
                j12 = ((lg.a) this.r.d.d.get(i10)).a[binarySearch];
            }
        }
        float f7 = j12 + (j11 - j12);
        float f10 = hVar.w;
        final float f11 = (f7 - f10) / (hVar.v - f10);
        hVar.q(jVar);
        hVar2.q(jVar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.f91
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                i91 i91Var = i91.this;
                kg.h hVar3 = i91Var.b;
                float f12 = hVar3.F0;
                kg.k kVar2 = hVar3.g0;
                float f13 = kVar2.l;
                float f14 = kVar2.k;
                float f15 = ((f12 / (f13 - f14)) * f14) - kg.h.k1;
                RectF rectF = hVar3.H0;
                float height = (rectF.height() * (1.0f - f11)) + rectF.top;
                mg.j jVar2 = jVar;
                jVar2.e = height;
                jVar2.d = (hVar3.G0 * jVar2.c) - f15;
                jVar2.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kg.h hVar4 = i91Var.c;
                hVar4.invalidate();
                hVar4.q(jVar2);
                hVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(k91 k91Var);

    public abstract void c();

    public final void d() {
        lg.b bVar;
        ArrayList arrayList;
        kg.h hVar = this.b;
        hVar.G();
        hVar.invalidate();
        kg.h hVar2 = this.c;
        hVar2.G();
        hVar2.invalidate();
        mg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        k91 k91Var = this.r;
        if (k91Var != null && (bVar = k91Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i10 = 0; i10 < this.r.d.d.size(); i10++) {
                int x02 = (((lg.a) this.r.d.d.get(i10)).g < 0 || !org.telegram.ui.ActionBar.y6.e1(((lg.a) this.r.d.d.get(i10)).g)) ? i0.a.h(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false)) < 0.5d ? ((lg.a) this.r.d.d.get(i10)).i : ((lg.a) this.r.d.d.get(i10)).h : org.telegram.ui.ActionBar.y6.x0(null, ((lg.a) this.r.d.d.get(i10)).g, false);
                ArrayList arrayList2 = this.n;
                if (i10 < arrayList2.size()) {
                    org.telegram.ui.Components.a10 a10Var = ((h91) arrayList2.get(i10)).a;
                    a10Var.getClass();
                    a10Var.r = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false);
                    a10Var.v = -1;
                    a10Var.s = x02;
                    a10Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h6, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.s5, false));
    }

    public final void e(k91 k91Var, boolean z10) {
        if (k91Var == null) {
            return;
        }
        String str = k91Var.j;
        mg.c cVar = this.d;
        cVar.setTitle(str);
        boolean z11 = getContext().getResources().getConfiguration().orientation == 2;
        kg.h hVar = this.b;
        hVar.setLandscape(z11);
        ArrayList arrayList = hVar.d;
        kg.k kVar = hVar.g0;
        kg.h hVar2 = this.c;
        hVar2.setLandscape(z11);
        this.r = k91Var;
        boolean z12 = k91Var.l;
        ArrayList arrayList2 = this.n;
        r41 r41Var = this.h;
        RadialProgressView radialProgressView = this.e;
        TextView textView = this.f;
        if (z12 || k91Var.a) {
            radialProgressView.setVisibility(8);
            String str2 = k91Var.b;
            if (str2 != null) {
                textView.setText(str2);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            r41Var.removeAllViews();
            arrayList2.clear();
            hVar.D(null);
            return;
        }
        textView.setVisibility(8);
        mg.e eVar = hVar.t0;
        boolean z13 = k91Var.n;
        eVar.a = z13;
        cVar.c(!z13);
        if (k91Var.d == null && k91Var.f != null) {
            radialProgressView.setAlpha(1.0f);
            radialProgressView.setVisibility(0);
            b(k91Var);
            hVar.D(null);
            return;
        }
        if (!z10) {
            radialProgressView.setVisibility(8);
        }
        if (hVar.D(k91Var.d) && k91Var.h) {
            kVar.k = 0.0f;
            kVar.l = 1.0f;
            kVar.a.A(true, false, false);
        }
        cVar.setUseWeekInterval(k91Var.o);
        hVar.t0.setUseWeek(k91Var.o);
        mg.e eVar2 = hVar.t0;
        eVar2.F = this.r.g != null || this.s == 4;
        hVar2.t0.F = false;
        eVar2.setEnabled(eVar2.F);
        mg.e eVar3 = hVar2.t0;
        eVar3.setEnabled(eVar3.F);
        int size = arrayList.size();
        r41Var.removeAllViews();
        arrayList2.clear();
        if (size > 1) {
            for (int i10 = 0; i10 < size; i10++) {
                mg.f fVar = (mg.f) arrayList.get(i10);
                h91 h91Var = new h91(this, i10);
                h91Var.b = fVar;
                String str3 = fVar.a.d;
                org.telegram.ui.Components.a10 a10Var = h91Var.a;
                a10Var.setText(str3);
                a10Var.a(fVar.n, false);
                a10Var.setOnTouchListener(new org.telegram.ui.Components.vl0());
                a10Var.setOnClickListener(new zd0(18, h91Var, fVar));
                a10Var.setOnLongClickListener(new di.l2(6, h91Var, fVar));
            }
        }
        long j10 = this.r.c;
        if (j10 > 0) {
            hVar.s0 = Arrays.binarySearch(hVar.h0.a, j10);
            hVar.u0 = true;
            hVar.t0.setVisibility(0);
            hVar.v0 = 1.0f;
            hVar.x((hVar.G0 * kVar.k) - kg.h.k1);
            try {
                hVar.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            g(true);
        } else {
            h(false);
            hVar.invalidate();
        }
        d();
        if (z10) {
            hVar.y0 = 3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            mg.j jVar = new mg.j();
            hVar.z0 = jVar;
            jVar.f = 0.0f;
            ofFloat.addUpdateListener(new x11(this, 9));
            ofFloat.addListener(new g91(this, 2));
            ofFloat.start();
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        kg.h hVar = this.b;
        long selectedDate = hVar.getSelectedDate();
        lg.b bVar = this.r.e;
        kg.h hVar2 = this.c;
        if (!z10 || hVar2.getVisibility() != 0) {
            hVar2.J(bVar, selectedDate);
        }
        hVar2.D(bVar);
        ArrayList arrayList2 = hVar2.d;
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
                    if (((lg.a) bVar.d.get(i12)).c.equals(((lg.a) this.r.d.d.get(i10)).c)) {
                        boolean z12 = ((h91) arrayList.get(i10)).a.b;
                        ((mg.f) arrayList2.get(i12)).n = z12;
                        ((mg.f) arrayList2.get(i12)).o = z12 ? 1.0f : 0.0f;
                        ((h91) arrayList.get(i10)).a.c = true;
                        ((h91) arrayList.get(i10)).a.animate().alpha(1.0f).start();
                        if (z12) {
                            i11++;
                        }
                        z11 = true;
                    } else {
                        i12++;
                    }
                }
                if (!z11) {
                    ((h91) arrayList.get(i10)).a.c = false;
                    ((h91) arrayList.get(i10)).a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.r.d.d.size(); i13++) {
                    ((h91) arrayList.get(i13)).a.c = true;
                    ((h91) arrayList.get(i13)).a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.r.c = selectedDate;
        hVar.t0.setAlpha(0.0f);
        hVar.v0 = 0.0f;
        hVar.u0 = false;
        hVar.i1 = false;
        hVar2.G();
        mg.c cVar = this.d;
        if (!z10) {
            hVar2.d();
            cVar.d(selectedDate, true);
        }
        hVar2.setHeader(cVar);
        hVar.setHeader(null);
        if (!z10) {
            ValueAnimator a2 = a(selectedDate, true);
            a2.addListener(new g91(this, 0));
            a2.start();
            return;
        }
        hVar.setVisibility(4);
        hVar2.setVisibility(0);
        hVar.y0 = 0;
        hVar2.y0 = 0;
        hVar.J = false;
        hVar2.J = true;
        cVar.d(selectedDate, false);
    }

    public final void h(boolean z10) {
        lg.b bVar;
        k91 k91Var = this.r;
        if (k91Var == null || (bVar = k91Var.d) == null || bVar.a == null) {
            return;
        }
        mg.c cVar = this.d;
        TextView textView = cVar.d;
        TextView textView2 = cVar.a;
        kg.h hVar = this.b;
        cVar.b(hVar.getStartDate(), hVar.getEndDate());
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
        hVar.t0.f.setAlpha(1.0f);
        kg.h hVar2 = this.c;
        hVar2.setHeader(null);
        long selectedDate = hVar.getSelectedDate();
        this.r.c = 0L;
        int i10 = 0;
        hVar.setVisibility(0);
        hVar2.d();
        hVar2.setHeader(null);
        hVar.setHeader(cVar);
        ArrayList arrayList = this.n;
        if (z10) {
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new g91(this, 1));
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                h91 h91Var = (h91) obj;
                h91Var.a.animate().alpha(1.0f).start();
                h91Var.a.c = true;
            }
            a2.start();
            return;
        }
        hVar2.setVisibility(4);
        hVar.J = true;
        hVar2.J = false;
        hVar.invalidate();
        Window window = this.a;
        if (window != null) {
            window.clearFlags(16);
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            h91 h91Var2 = (h91) obj2;
            h91Var2.a.setAlpha(1.0f);
            h91Var2.a.c = true;
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            if (this.b != null && this.c != null && this.d != null && this.e != null && this.f != null) {
                d();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
