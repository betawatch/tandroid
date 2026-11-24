// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class gza extends FrameLayout implements vlb {
    public final Window a;
    public final ng0 b;
    public final ng0 c;
    public final pl1 d;
    public final RadialProgressView e;
    public final TextView f;
    public final ct8 h;
    public final ArrayList n;
    public jza r;
    public final int s;

    public gza(Context context, int i, mg0 mg0Var, ylb ylbVar) {
        super(context);
        ng0 ng0Var;
        this.n = new ArrayList();
        final byte b = 0;
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.a = ((Activity) context).getWindow();
        } else {
            this.a = null;
        }
        this.s = i;
        final byte b2 = 1;
        LinearLayout i2 = hg9.i(context, 1);
        this.h = new ct8(context, (byte) 11);
        pl1 pl1Var = new pl1(getContext(), ylbVar);
        this.d = pl1Var;
        a59 a59Var = new a59();
        TextView textView = pl1Var.d;
        textView.setOnTouchListener(a59Var);
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: cza
            public final /* synthetic */ gza b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                gza gzaVar = this.b;
                switch (b3) {
                    case 0:
                        gzaVar.h(true);
                        break;
                    case 1:
                        gzaVar.c();
                        break;
                    default:
                        gzaVar.c.c(false);
                        break;
                }
            }
        });
        final byte b3 = 2;
        if (i == 1) {
            this.b = new mq3(getContext(), ylbVar);
            ng0 mq3Var = new mq3(getContext(), ylbVar);
            this.c = mq3Var;
            mq3Var.u0.E = true;
            ng0Var = mq3Var;
        } else if (i == 2) {
            this.b = new joa(getContext(), ylbVar);
            ng0 joaVar = new joa(getContext(), ylbVar);
            this.c = joaVar;
            joaVar.u0.E = true;
            ng0Var = joaVar;
        } else if (i == 3) {
            jf0 jf0Var = new jf0(getContext(), null);
            jf0Var.x0 = true;
            jf0Var.y0 = true;
            this.b = jf0Var;
            ng0 n46Var = new n46(getContext(), null);
            this.c = n46Var;
            n46Var.u0.E = true;
            ng0Var = n46Var;
        } else if (i == 4) {
            noa noaVar = new noa(getContext());
            this.b = noaVar;
            noaVar.u0.F = true;
            ec8 ec8Var = new ec8(getContext());
            ec8Var.N1 = -1;
            ec8Var.O1 = new RectF();
            ec8Var.Q1 = gm.L(9.0f);
            ec8Var.R1 = gm.L(13.0f);
            ec8Var.S1 = new String[101];
            ec8Var.U1 = 1.0f;
            ec8Var.V1 = 0;
            ec8Var.W1 = -1;
            ec8Var.X1 = -1;
            for (int i3 = 1; i3 <= 100; i3++) {
                ec8Var.S1[i3] = aq1.n(i3, "%");
            }
            TextPaint textPaint = new TextPaint(1);
            ec8Var.P1 = textPaint;
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(-1);
            textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
            ec8Var.i1 = true;
            this.c = ec8Var;
            ng0Var = ec8Var;
        } else if (i != 5) {
            this.b = new n46(getContext(), null);
            ng0 n46Var2 = new n46(getContext(), null);
            this.c = n46Var2;
            n46Var2.u0.E = true;
            ng0Var = n46Var2;
        } else {
            this.b = new m46(getContext(), null);
            ng0 m46Var = new m46(getContext(), null);
            this.c = m46Var;
            m46Var.u0.E = true;
            ng0Var = m46Var;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.b.a = mg0Var;
        ng0Var.a = mg0Var;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.b);
        frameLayout.addView(this.b.u0, -2, -2);
        frameLayout.addView(ng0Var);
        frameLayout.addView(ng0Var.u0, -2, -2);
        frameLayout.addView(radialProgressView, qoe.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 15.0f);
        frameLayout.addView(textView2, qoe.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        anb.X(textView2, cmb.r5, ylbVar);
        this.b.setDateSelectionListener(new wta(this, b3));
        this.b.u0.d(false, false);
        this.b.u0.setOnTouchListener(new a59());
        this.b.u0.setOnClickListener(new View.OnClickListener(this) { // from class: cza
            public final /* synthetic */ gza b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b2;
                gza gzaVar = this.b;
                switch (b32) {
                    case 0:
                        gzaVar.h(true);
                        break;
                    case 1:
                        gzaVar.c();
                        break;
                    default:
                        gzaVar.c.c(false);
                        break;
                }
            }
        });
        ng0Var.u0.setOnClickListener(new View.OnClickListener(this) { // from class: cza
            public final /* synthetic */ gza b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                gza gzaVar = this.b;
                switch (b32) {
                    case 0:
                        gzaVar.h(true);
                        break;
                    case 1:
                        gzaVar.c();
                        break;
                    default:
                        gzaVar.c.c(false);
                        break;
                }
            }
        });
        this.b.setVisibility(0);
        ng0Var.setVisibility(4);
        this.b.setHeader(this.d);
        i2.addView(this.d, qoe.c(52.0f, -1));
        i2.addView(frameLayout, qoe.c(-2.0f, -1));
        i2.addView(this.h, qoe.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            i2.setClipChildren(false);
            i2.setClipToPadding(false);
        }
        addView(i2);
    }

    public final ValueAnimator a(long j, boolean z) {
        Window window = this.a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        ng0 ng0Var = this.b;
        ng0Var.K = false;
        ng0 ng0Var2 = this.c;
        ng0Var2.K = false;
        ng0Var.z0 = (byte) 2;
        ng0Var2.z0 = (byte) 1;
        final a1c a1cVar = new a1c();
        tl1 tl1Var = ng0Var.h0;
        a1cVar.b = tl1Var.l;
        a1cVar.a = tl1Var.k;
        int binarySearch = Arrays.binarySearch(this.r.d.a, j);
        if (binarySearch < 0) {
            binarySearch = this.r.d.a.length - 1;
        }
        a1cVar.c = this.r.d.b[binarySearch];
        ng0Var2.setVisibility(0);
        ng0Var2.A0 = a1cVar;
        ng0Var.A0 = a1cVar;
        long j2 = 0;
        long j3 = 2147483647L;
        for (int i = 0; i < this.r.d.d.size(); i++) {
            if (((ml1) this.r.d.d.get(i)).a[binarySearch] > j2) {
                j2 = ((ml1) this.r.d.d.get(i)).a[binarySearch];
            }
            if (((ml1) this.r.d.d.get(i)).a[binarySearch] < j3) {
                j3 = ((ml1) this.r.d.d.get(i)).a[binarySearch];
            }
        }
        float f = j3 + (j2 - j3);
        float f2 = ng0Var.x;
        final float f3 = (f - f2) / (ng0Var.w - f2);
        ng0Var.q(a1cVar);
        ng0Var2.q(a1cVar);
        float f4 = 1.0f;
        float f5 = 0.0f;
        if (!z) {
            f5 = 1.0f;
            f4 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, f4);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dza
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                gza gzaVar = gza.this;
                ng0 ng0Var3 = gzaVar.b;
                float f6 = ng0Var3.G0;
                tl1 tl1Var2 = ng0Var3.h0;
                float f7 = tl1Var2.l;
                float f8 = tl1Var2.k;
                float f9 = ((f6 / (f7 - f8)) * f8) - ng0.l1;
                RectF rectF = ng0Var3.I0;
                float height = (rectF.height() * (1.0f - f3)) + rectF.top;
                a1c a1cVar2 = a1cVar;
                a1cVar2.e = height;
                a1cVar2.d = (ng0Var3.H0 * a1cVar2.c) - f9;
                a1cVar2.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0 ng0Var4 = gzaVar.c;
                ng0Var4.invalidate();
                ng0Var4.q(a1cVar2);
                ng0Var3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new l94());
        return ofFloat;
    }

    public final void d() {
        nl1 nl1Var;
        ArrayList arrayList;
        int i;
        ng0 ng0Var = this.b;
        ng0Var.G();
        ng0Var.invalidate();
        ng0 ng0Var2 = this.c;
        ng0Var2.G();
        ng0Var2.invalidate();
        pl1 pl1Var = this.d;
        pl1Var.a();
        pl1Var.invalidate();
        jza jzaVar = this.r;
        if (jzaVar != null && (nl1Var = jzaVar.d) != null && (arrayList = nl1Var.d) != null && arrayList.size() > 1) {
            for (int i2 = 0; i2 < this.r.d.d.size(); i2++) {
                if (((ml1) this.r.d.d.get(i2)).g < 0 || !cmb.d1(((ml1) this.r.d.d.get(i2)).g)) {
                    double h = on2.h(cmb.w0(null, cmb.c6, false));
                    jza jzaVar2 = this.r;
                    i = h < 0.5d ? ((ml1) jzaVar2.d.d.get(i2)).i : ((ml1) jzaVar2.d.d.get(i2)).h;
                } else {
                    i = cmb.w0(null, ((ml1) this.r.d.d.get(i2)).g, false);
                }
                ArrayList arrayList2 = this.n;
                if (i2 < arrayList2.size()) {
                    sk4 sk4Var = ((fza) arrayList2.get(i2)).a;
                    sk4Var.getClass();
                    sk4Var.r = cmb.w0(null, cmb.c6, false);
                    sk4Var.w = -1;
                    sk4Var.s = i;
                    sk4Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(cmb.w0(null, cmb.g6, false));
        this.f.setTextColor(cmb.w0(null, cmb.r5, false));
    }

    public final void e(jza jzaVar, boolean z) {
        if (jzaVar != null) {
            String str = jzaVar.j;
            pl1 pl1Var = this.d;
            pl1Var.setTitle(str);
            boolean z2 = getContext().getResources().getConfiguration().orientation == 2;
            ng0 ng0Var = this.b;
            ng0Var.setLandscape(z2);
            ArrayList arrayList = ng0Var.d;
            tl1 tl1Var = ng0Var.h0;
            ng0 ng0Var2 = this.c;
            ng0Var2.setLandscape(z2);
            this.r = jzaVar;
            boolean z3 = jzaVar.l;
            ArrayList arrayList2 = this.n;
            ct8 ct8Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f;
            if (z3 || jzaVar.a) {
                radialProgressView.setVisibility(8);
                String str2 = jzaVar.b;
                if (str2 != null) {
                    textView.setText(str2);
                    if (textView.getVisibility() == 8) {
                        textView.setAlpha(0.0f);
                        textView.animate().alpha(1.0f);
                    }
                    textView.setVisibility(0);
                }
                ct8Var.removeAllViews();
                arrayList2.clear();
                ng0Var.D(null);
                return;
            }
            textView.setVisibility(8);
            m26 m26Var = ng0Var.u0;
            boolean z4 = jzaVar.n;
            m26Var.a = z4;
            pl1Var.c(!z4);
            if (jzaVar.d == null && jzaVar.f != null) {
                radialProgressView.setAlpha(1.0f);
                radialProgressView.setVisibility(0);
                b(jzaVar);
                ng0Var.D(null);
                return;
            }
            if (!z) {
                radialProgressView.setVisibility(8);
            }
            if (ng0Var.D(jzaVar.d) && jzaVar.h) {
                tl1Var.k = 0.0f;
                tl1Var.l = 1.0f;
                tl1Var.a.A(true, false, false);
            }
            pl1Var.setUseWeekInterval(jzaVar.o);
            ng0Var.u0.setUseWeek(jzaVar.o);
            m26 m26Var2 = ng0Var.u0;
            m26Var2.G = this.r.g != null || this.s == 4;
            ng0Var2.u0.G = false;
            m26Var2.setEnabled(m26Var2.G);
            m26 m26Var3 = ng0Var2.u0;
            m26Var3.setEnabled(m26Var3.G);
            int size = arrayList.size();
            ct8Var.removeAllViews();
            arrayList2.clear();
            if (size > 1) {
                for (int i = 0; i < size; i++) {
                    l46 l46Var = (l46) arrayList.get(i);
                    fza fzaVar = new fza(this, i);
                    fzaVar.b = l46Var;
                    String str3 = l46Var.a.d;
                    sk4 sk4Var = fzaVar.a;
                    sk4Var.setText(str3);
                    sk4Var.a(l46Var.n, false);
                    sk4Var.setOnTouchListener(new a59());
                    sk4Var.setOnClickListener(new r39(fzaVar, l46Var, (byte) 20));
                    sk4Var.setOnLongClickListener(new u0(fzaVar, l46Var, (byte) 7));
                }
            }
            long j = this.r.c;
            if (j > 0) {
                ng0Var.t0 = Arrays.binarySearch(ng0Var.i0.a, j);
                ng0Var.v0 = true;
                ng0Var.u0.setVisibility(0);
                ng0Var.w0 = 1.0f;
                ng0Var.x((ng0Var.H0 * tl1Var.k) - ng0.l1);
                try {
                    ng0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                g(true);
            } else {
                h(false);
                ng0Var.invalidate();
            }
            d();
            if (z) {
                ng0Var.z0 = (byte) 3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                a1c a1cVar = new a1c();
                ng0Var.A0 = a1cVar;
                a1cVar.f = 0.0f;
                ofFloat.addUpdateListener(new rha(this, (byte) 10));
                ofFloat.addListener(new eza(this, (byte) 2));
                ofFloat.start();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(boolean z) {
        ArrayList arrayList;
        Object[] objArr;
        ng0 ng0Var = this.b;
        long selectedDate = ng0Var.getSelectedDate();
        nl1 nl1Var = this.r.e;
        ng0 ng0Var2 = this.c;
        if (!z || ng0Var2.getVisibility() != 0) {
            ng0Var2.J(nl1Var, selectedDate);
        }
        ng0Var2.D(nl1Var);
        ArrayList arrayList2 = ng0Var2.d;
        Object[] objArr2 = 0;
        if (this.r.d.d.size() > 1) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int size = this.r.d.d.size();
                arrayList = this.n;
                if (i >= size) {
                    break;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= nl1Var.d.size()) {
                        objArr = false;
                        break;
                    }
                    if (((ml1) nl1Var.d.get(i3)).c.equals(((ml1) this.r.d.d.get(i)).c)) {
                        boolean z2 = ((fza) arrayList.get(i)).a.b;
                        ((l46) arrayList2.get(i3)).n = z2;
                        ((l46) arrayList2.get(i3)).o = z2 ? 1.0f : 0.0f;
                        ((fza) arrayList.get(i)).a.c = true;
                        ((fza) arrayList.get(i)).a.animate().alpha(1.0f).start();
                        if (z2) {
                            i2++;
                        }
                        objArr = true;
                    } else {
                        i3++;
                    }
                }
                if (objArr == false) {
                    ((fza) arrayList.get(i)).a.c = false;
                    ((fza) arrayList.get(i)).a.animate().alpha(0.0f).start();
                }
                i++;
            }
            if (i2 == 0) {
                for (int i4 = 0; i4 < this.r.d.d.size(); i4++) {
                    ((fza) arrayList.get(i4)).a.c = true;
                    ((fza) arrayList.get(i4)).a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.r.c = selectedDate;
        ng0Var.u0.setAlpha(0.0f);
        ng0Var.w0 = 0.0f;
        ng0Var.v0 = false;
        ng0Var.j1 = false;
        ng0Var2.G();
        pl1 pl1Var = this.d;
        if (!z) {
            ng0Var2.d();
            pl1Var.d(selectedDate, true);
        }
        ng0Var2.setHeader(pl1Var);
        ng0Var.setHeader(null);
        if (!z) {
            ValueAnimator a = a(selectedDate, true);
            a.addListener(new eza(this, objArr2 == true ? 1 : 0));
            a.start();
            return;
        }
        ng0Var.setVisibility(4);
        ng0Var2.setVisibility(0);
        ng0Var.z0 = (byte) 0;
        ng0Var2.z0 = (byte) 0;
        ng0Var.K = false;
        ng0Var2.K = true;
        pl1Var.d(selectedDate, false);
    }

    public final void h(boolean z) {
        nl1 nl1Var;
        jza jzaVar = this.r;
        if (jzaVar == null || (nl1Var = jzaVar.d) == null || nl1Var.a == null) {
            return;
        }
        pl1 pl1Var = this.d;
        TextView textView = pl1Var.d;
        ng0 ng0Var = this.b;
        pl1Var.b(ng0Var.getStartDate(), ng0Var.getEndDate());
        TextView textView2 = pl1Var.a;
        if (z) {
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
            textView.setPivotY(gm.L(40.0f));
            textView.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
        } else {
            textView2.setAlpha(1.0f);
            textView2.setScaleX(1.0f);
            textView2.setScaleY(1.0f);
            textView.setAlpha(0.0f);
        }
        ng0Var.u0.f.setAlpha(1.0f);
        ng0 ng0Var2 = this.c;
        ng0Var2.setHeader(null);
        long selectedDate = ng0Var.getSelectedDate();
        this.r.c = 0L;
        int i = 0;
        ng0Var.setVisibility(0);
        ng0Var2.d();
        ng0Var2.setHeader(null);
        ng0Var.setHeader(pl1Var);
        ArrayList arrayList = this.n;
        byte b = 1;
        if (z) {
            ValueAnimator a = a(selectedDate, false);
            a.addListener(new eza(this, b));
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                fza fzaVar = (fza) obj;
                fzaVar.a.animate().alpha(1.0f).start();
                fzaVar.a.c = true;
            }
            a.start();
            return;
        }
        ng0Var2.setVisibility(4);
        ng0Var.K = true;
        ng0Var2.K = false;
        ng0Var.invalidate();
        Window window = this.a;
        if (window != null) {
            window.clearFlags(16);
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            fza fzaVar2 = (fza) obj2;
            fzaVar2.a.setAlpha(1.0f);
            fzaVar2.a.c = true;
        }
    }

    @Override // vlb
    public final void updateColors() {
        try {
            if (this.b == null || this.c == null || this.d == null || this.e == null || this.f == null) {
                return;
            }
            d();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(jza jzaVar) {
    }

    public void c() {
    }

    public void f() {
    }
}
