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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class d91 extends FrameLayout {
    public final Window a;
    public final tf.g b;
    public final tf.g c;
    public final vf.c d;
    public final RadialProgressView e;
    public final TextView f;
    public final n31 h;
    public final ArrayList n;
    public f91 r;
    public final int s;

    public d91(Context context, int i10, tf.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.a = ((Activity) context).getWindow();
        } else {
            this.a = null;
        }
        this.s = i10;
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        this.h = new n31(context, 3);
        vf.c cVar = new vf.c(getContext(), c6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new org.telegram.ui.Components.uk0());
        final int i11 = 0;
        cVar.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z81
            public final /* synthetic */ d91 b;

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
            this.b = new tf.k(getContext(), c6Var);
            tf.k kVar = new tf.k(getContext(), c6Var);
            this.c = kVar;
            kVar.p0.y = true;
        } else if (i10 == 2) {
            this.b = new tf.p(getContext(), c6Var);
            tf.p pVar = new tf.p(getContext(), c6Var);
            this.c = pVar;
            pVar.p0.y = true;
        } else if (i10 == 3) {
            tf.a aVar = new tf.a(getContext(), null);
            aVar.s0 = true;
            aVar.t0 = true;
            this.b = aVar;
            tf.m mVar = new tf.m(getContext(), null);
            this.c = mVar;
            mVar.p0.y = true;
        } else if (i10 == 4) {
            tf.q qVar = new tf.q(getContext());
            this.b = qVar;
            qVar.p0.A = true;
            tf.n nVar = new tf.n(getContext());
            nVar.I1 = -1;
            nVar.J1 = new RectF();
            nVar.L1 = AndroidUtilities.dp(9.0f);
            nVar.M1 = AndroidUtilities.dp(13.0f);
            nVar.N1 = new String[101];
            nVar.P1 = 1.0f;
            nVar.Q1 = 0;
            nVar.R1 = -1;
            nVar.S1 = -1;
            for (int i12 = 1; i12 <= 100; i12++) {
                nVar.N1[i12] = u3.c.d(i12, "%");
            }
            TextPaint textPaint = new TextPaint(1);
            nVar.K1 = textPaint;
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(-1);
            textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
            nVar.d1 = true;
            this.c = nVar;
        } else if (i10 != 5) {
            this.b = new tf.m(getContext(), null);
            tf.m mVar2 = new tf.m(getContext(), null);
            this.c = mVar2;
            mVar2.p0.y = true;
        } else {
            this.b = new tf.l(getContext(), null);
            tf.l lVar = new tf.l(getContext(), null);
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
        frameLayout.addView(radialProgressView, i7.f6.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.s5, c6Var));
        this.b.setDateSelectionListener(new zk0(this, 19));
        this.b.p0.d(false, false);
        this.b.p0.setOnTouchListener(new org.telegram.ui.Components.uk0());
        final int i13 = 1;
        this.b.p0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z81
            public final /* synthetic */ d91 b;

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
        this.c.p0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z81
            public final /* synthetic */ d91 b;

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
        g10.addView(this.d, i7.f6.c(52.0f, -1));
        g10.addView(frameLayout, i7.f6.c(-2.0f, -1));
        g10.addView(this.h, i7.f6.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            g10.setClipChildren(false);
            g10.setClipToPadding(false);
        }
        addView(g10);
    }

    public final ValueAnimator a(long j10, boolean z10) {
        Window window = this.a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        tf.g gVar = this.b;
        gVar.F = false;
        tf.g gVar2 = this.c;
        gVar2.F = false;
        gVar.u0 = 2;
        gVar2.u0 = 1;
        final vf.j jVar = new vf.j();
        tf.j jVar2 = gVar.c0;
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
        for (int i10 = 0; i10 < this.r.d.d.size(); i10++) {
            if (((uf.a) this.r.d.d.get(i10)).a[binarySearch] > j11) {
                j11 = ((uf.a) this.r.d.d.get(i10)).a[binarySearch];
            }
            if (((uf.a) this.r.d.d.get(i10)).a[binarySearch] < j12) {
                j12 = ((uf.a) this.r.d.d.get(i10)).a[binarySearch];
            }
        }
        float f9 = j12 + (j11 - j12);
        float f10 = gVar.w;
        final float f11 = (f9 - f10) / (gVar.v - f10);
        gVar.q(jVar);
        gVar2.q(jVar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.a91
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                d91 d91Var = d91.this;
                tf.g gVar3 = d91Var.b;
                float f12 = gVar3.B0;
                tf.j jVar3 = gVar3.c0;
                float f13 = jVar3.l;
                float f14 = jVar3.k;
                float f15 = ((f12 / (f13 - f14)) * f14) - tf.g.g1;
                RectF rectF = gVar3.D0;
                float height = (rectF.height() * (1.0f - f11)) + rectF.top;
                vf.j jVar4 = jVar;
                jVar4.e = height;
                jVar4.d = (gVar3.C0 * jVar4.c) - f15;
                jVar4.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tf.g gVar4 = d91Var.c;
                gVar4.invalidate();
                gVar4.q(jVar4);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(f91 f91Var);

    public abstract void c();

    public final void d() {
        uf.b bVar;
        ArrayList arrayList;
        tf.g gVar = this.b;
        gVar.G();
        gVar.invalidate();
        tf.g gVar2 = this.c;
        gVar2.G();
        gVar2.invalidate();
        vf.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        f91 f91Var = this.r;
        if (f91Var != null && (bVar = f91Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i10 = 0; i10 < this.r.d.d.size(); i10++) {
                int w02 = (((uf.a) this.r.d.d.get(i10)).g < 0 || !org.telegram.ui.ActionBar.g6.c1(((uf.a) this.r.d.d.get(i10)).g)) ? i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false)) < 0.5d ? ((uf.a) this.r.d.d.get(i10)).i : ((uf.a) this.r.d.d.get(i10)).h : org.telegram.ui.ActionBar.g6.w0(null, ((uf.a) this.r.d.d.get(i10)).g, false);
                ArrayList arrayList2 = this.n;
                if (i10 < arrayList2.size()) {
                    org.telegram.ui.Components.o00 o00Var = ((c91) arrayList2.get(i10)).a;
                    o00Var.getClass();
                    o00Var.r = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false);
                    o00Var.v = -1;
                    o00Var.s = w02;
                    o00Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h6, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.s5, false));
    }

    public final void e(f91 f91Var, boolean z10) {
        if (f91Var == null) {
            return;
        }
        String str = f91Var.j;
        vf.c cVar = this.d;
        cVar.setTitle(str);
        boolean z11 = getContext().getResources().getConfiguration().orientation == 2;
        tf.g gVar = this.b;
        gVar.setLandscape(z11);
        ArrayList arrayList = gVar.d;
        tf.j jVar = gVar.c0;
        tf.g gVar2 = this.c;
        gVar2.setLandscape(z11);
        this.r = f91Var;
        boolean z12 = f91Var.l;
        ArrayList arrayList2 = this.n;
        n31 n31Var = this.h;
        RadialProgressView radialProgressView = this.e;
        TextView textView = this.f;
        if (z12 || f91Var.a) {
            radialProgressView.setVisibility(8);
            String str2 = f91Var.b;
            if (str2 != null) {
                textView.setText(str2);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            n31Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
            return;
        }
        textView.setVisibility(8);
        vf.e eVar = gVar.p0;
        boolean z13 = f91Var.n;
        eVar.a = z13;
        cVar.c(!z13);
        if (f91Var.d == null && f91Var.f != null) {
            radialProgressView.setAlpha(1.0f);
            radialProgressView.setVisibility(0);
            b(f91Var);
            gVar.D(null);
            return;
        }
        if (!z10) {
            radialProgressView.setVisibility(8);
        }
        if (gVar.D(f91Var.d) && f91Var.h) {
            jVar.k = 0.0f;
            jVar.l = 1.0f;
            jVar.a.A(true, false, false);
        }
        cVar.setUseWeekInterval(f91Var.o);
        gVar.p0.setUseWeek(f91Var.o);
        vf.e eVar2 = gVar.p0;
        eVar2.B = this.r.g != null || this.s == 4;
        gVar2.p0.B = false;
        eVar2.setEnabled(eVar2.B);
        vf.e eVar3 = gVar2.p0;
        eVar3.setEnabled(eVar3.B);
        int size = arrayList.size();
        n31Var.removeAllViews();
        arrayList2.clear();
        if (size > 1) {
            for (int i10 = 0; i10 < size; i10++) {
                vf.f fVar = (vf.f) arrayList.get(i10);
                c91 c91Var = new c91(this, i10);
                c91Var.b = fVar;
                String str3 = fVar.a.d;
                org.telegram.ui.Components.o00 o00Var = c91Var.a;
                o00Var.setText(str3);
                o00Var.a(fVar.n, false);
                o00Var.setOnTouchListener(new org.telegram.ui.Components.uk0());
                o00Var.setOnClickListener(new t70(25, c91Var, fVar));
                o00Var.setOnLongClickListener(new lh.e2(6, c91Var, fVar));
            }
        }
        long j10 = this.r.c;
        if (j10 > 0) {
            gVar.o0 = Arrays.binarySearch(gVar.d0.a, j10);
            gVar.q0 = true;
            gVar.p0.setVisibility(0);
            gVar.r0 = 1.0f;
            gVar.x((gVar.C0 * jVar.k) - tf.g.g1);
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
            vf.j jVar2 = new vf.j();
            gVar.v0 = jVar2;
            jVar2.f = 0.0f;
            ofFloat.addUpdateListener(new w01(this, 12));
            ofFloat.addListener(new b91(this, 2));
            ofFloat.start();
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        tf.g gVar = this.b;
        long selectedDate = gVar.getSelectedDate();
        uf.b bVar = this.r.e;
        tf.g gVar2 = this.c;
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
                    if (((uf.a) bVar.d.get(i12)).c.equals(((uf.a) this.r.d.d.get(i10)).c)) {
                        boolean z12 = ((c91) arrayList.get(i10)).a.b;
                        ((vf.f) arrayList2.get(i12)).n = z12;
                        ((vf.f) arrayList2.get(i12)).o = z12 ? 1.0f : 0.0f;
                        ((c91) arrayList.get(i10)).a.c = true;
                        ((c91) arrayList.get(i10)).a.animate().alpha(1.0f).start();
                        if (z12) {
                            i11++;
                        }
                        z11 = true;
                    } else {
                        i12++;
                    }
                }
                if (!z11) {
                    ((c91) arrayList.get(i10)).a.c = false;
                    ((c91) arrayList.get(i10)).a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.r.d.d.size(); i13++) {
                    ((c91) arrayList.get(i13)).a.c = true;
                    ((c91) arrayList.get(i13)).a.animate().alpha(1.0f).start();
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
        vf.c cVar = this.d;
        if (!z10) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (!z10) {
            ValueAnimator a2 = a(selectedDate, true);
            a2.addListener(new b91(this, 0));
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
        uf.b bVar;
        f91 f91Var = this.r;
        if (f91Var == null || (bVar = f91Var.d) == null || bVar.a == null) {
            return;
        }
        vf.c cVar = this.d;
        TextView textView = cVar.d;
        TextView textView2 = cVar.a;
        tf.g gVar = this.b;
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
        tf.g gVar2 = this.c;
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
            a2.addListener(new b91(this, 1));
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c91 c91Var = (c91) obj;
                c91Var.a.animate().alpha(1.0f).start();
                c91Var.a.c = true;
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
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            c91 c91Var2 = (c91) obj2;
            c91Var2.a.setAlpha(1.0f);
            c91Var2.a.c = true;
        }
    }
}
