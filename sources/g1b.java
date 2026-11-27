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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class g1b extends FrameLayout implements snb {
    public final Window a;
    public final pf0 b;
    public final pf0 c;
    public final qk1 d;
    public final RadialProgressView e;
    public final TextView f;
    public final ir8 h;
    public final ArrayList n;
    public i1b r;
    public final int s;

    public g1b(Context context, int i, of0 of0Var, vnb vnbVar) {
        super(context);
        pf0 pf0Var;
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
        LinearLayout j = uh9.j(context, 1);
        this.h = new ir8(context, (byte) 12);
        qk1 qk1Var = new qk1(getContext(), vnbVar);
        this.d = qk1Var;
        m69 m69Var = new m69();
        TextView textView = qk1Var.d;
        textView.setOnTouchListener(m69Var);
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: c1b
            public final /* synthetic */ g1b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                g1b g1bVar = this.b;
                switch (b3) {
                    case 0:
                        g1bVar.h(true);
                        break;
                    case 1:
                        g1bVar.c();
                        break;
                    default:
                        g1bVar.c.c(false);
                        break;
                }
            }
        });
        final byte b3 = 2;
        if (i == 1) {
            this.b = new tp3(getContext(), vnbVar);
            pf0 tp3Var = new tp3(getContext(), vnbVar);
            this.c = tp3Var;
            tp3Var.u0.E = true;
            pf0Var = tp3Var;
        } else if (i == 2) {
            this.b = new fqa(getContext(), vnbVar);
            pf0 fqaVar = new fqa(getContext(), vnbVar);
            this.c = fqaVar;
            fqaVar.u0.E = true;
            pf0Var = fqaVar;
        } else if (i == 3) {
            le0 le0Var = new le0(getContext(), null);
            le0Var.x0 = true;
            le0Var.y0 = true;
            this.b = le0Var;
            pf0 q46Var = new q46(getContext(), null);
            this.c = q46Var;
            q46Var.u0.E = true;
            pf0Var = q46Var;
        } else if (i == 4) {
            jqa jqaVar = new jqa(getContext());
            this.b = jqaVar;
            jqaVar.u0.F = true;
            td8 td8Var = new td8(getContext());
            td8Var.N1 = -1;
            td8Var.O1 = new RectF();
            td8Var.Q1 = hl.L(9.0f);
            td8Var.R1 = hl.L(13.0f);
            td8Var.S1 = new String[101];
            td8Var.U1 = 1.0f;
            td8Var.V1 = 0;
            td8Var.W1 = -1;
            td8Var.X1 = -1;
            for (int i2 = 1; i2 <= 100; i2++) {
                td8Var.S1[i2] = bp1.n(i2, "%");
            }
            TextPaint textPaint = new TextPaint(1);
            td8Var.P1 = textPaint;
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(-1);
            textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
            td8Var.i1 = true;
            this.c = td8Var;
            pf0Var = td8Var;
        } else if (i != 5) {
            this.b = new q46(getContext(), null);
            pf0 q46Var2 = new q46(getContext(), null);
            this.c = q46Var2;
            q46Var2.u0.E = true;
            pf0Var = q46Var2;
        } else {
            this.b = new p46(getContext(), null);
            pf0 p46Var = new p46(getContext(), null);
            this.c = p46Var;
            p46Var.u0.E = true;
            pf0Var = p46Var;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.b.a = of0Var;
        pf0Var.a = of0Var;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.b);
        frameLayout.addView(this.b.u0, -2, -2);
        frameLayout.addView(pf0Var);
        frameLayout.addView(pf0Var.u0, -2, -2);
        frameLayout.addView(radialProgressView, tre.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 15.0f);
        frameLayout.addView(textView2, tre.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        yob.X(textView2, aob.s5, vnbVar);
        this.b.setDateSelectionListener(new hja(this, (byte) 11));
        this.b.u0.d(false, false);
        this.b.u0.setOnTouchListener(new m69());
        this.b.u0.setOnClickListener(new View.OnClickListener(this) { // from class: c1b
            public final /* synthetic */ g1b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b2;
                g1b g1bVar = this.b;
                switch (b32) {
                    case 0:
                        g1bVar.h(true);
                        break;
                    case 1:
                        g1bVar.c();
                        break;
                    default:
                        g1bVar.c.c(false);
                        break;
                }
            }
        });
        pf0Var.u0.setOnClickListener(new View.OnClickListener(this) { // from class: c1b
            public final /* synthetic */ g1b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                g1b g1bVar = this.b;
                switch (b32) {
                    case 0:
                        g1bVar.h(true);
                        break;
                    case 1:
                        g1bVar.c();
                        break;
                    default:
                        g1bVar.c.c(false);
                        break;
                }
            }
        });
        this.b.setVisibility(0);
        pf0Var.setVisibility(4);
        this.b.setHeader(this.d);
        j.addView(this.d, tre.c(52.0f, -1));
        j.addView(frameLayout, tre.c(-2.0f, -1));
        j.addView(this.h, tre.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            j.setClipChildren(false);
            j.setClipToPadding(false);
        }
        addView(j);
    }

    public final ValueAnimator a(long j, boolean z) {
        Window window = this.a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        pf0 pf0Var = this.b;
        pf0Var.K = false;
        pf0 pf0Var2 = this.c;
        pf0Var2.K = false;
        pf0Var.z0 = (byte) 2;
        pf0Var2.z0 = (byte) 1;
        final z2c z2cVar = new z2c();
        uk1 uk1Var = pf0Var.h0;
        z2cVar.b = uk1Var.l;
        z2cVar.a = uk1Var.k;
        int binarySearch = Arrays.binarySearch(this.r.d.a, j);
        if (binarySearch < 0) {
            binarySearch = this.r.d.a.length - 1;
        }
        z2cVar.c = this.r.d.b[binarySearch];
        pf0Var2.setVisibility(0);
        pf0Var2.A0 = z2cVar;
        pf0Var.A0 = z2cVar;
        long j2 = 0;
        long j3 = 2147483647L;
        for (int i = 0; i < this.r.d.d.size(); i++) {
            if (((nk1) this.r.d.d.get(i)).a[binarySearch] > j2) {
                j2 = ((nk1) this.r.d.d.get(i)).a[binarySearch];
            }
            if (((nk1) this.r.d.d.get(i)).a[binarySearch] < j3) {
                j3 = ((nk1) this.r.d.d.get(i)).a[binarySearch];
            }
        }
        float f = j3 + (j2 - j3);
        float f2 = pf0Var.x;
        final float f3 = (f - f2) / (pf0Var.w - f2);
        pf0Var.q(z2cVar);
        pf0Var2.q(z2cVar);
        float f4 = 1.0f;
        float f5 = 0.0f;
        if (!z) {
            f5 = 1.0f;
            f4 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, f4);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: d1b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                g1b g1bVar = g1b.this;
                pf0 pf0Var3 = g1bVar.b;
                float f6 = pf0Var3.G0;
                uk1 uk1Var2 = pf0Var3.h0;
                float f7 = uk1Var2.l;
                float f8 = uk1Var2.k;
                float f9 = ((f6 / (f7 - f8)) * f8) - pf0.l1;
                RectF rectF = pf0Var3.I0;
                float height = (rectF.height() * (1.0f - f3)) + rectF.top;
                z2c z2cVar2 = z2cVar;
                z2cVar2.e = height;
                z2cVar2.d = (pf0Var3.H0 * z2cVar2.c) - f9;
                z2cVar2.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pf0 pf0Var4 = g1bVar.c;
                pf0Var4.invalidate();
                pf0Var4.q(z2cVar2);
                pf0Var3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new x84());
        return ofFloat;
    }

    public final void d() {
        ok1 ok1Var;
        ArrayList arrayList;
        int i;
        pf0 pf0Var = this.b;
        pf0Var.G();
        pf0Var.invalidate();
        pf0 pf0Var2 = this.c;
        pf0Var2.G();
        pf0Var2.invalidate();
        qk1 qk1Var = this.d;
        qk1Var.a();
        qk1Var.invalidate();
        i1b i1bVar = this.r;
        if (i1bVar != null && (ok1Var = i1bVar.d) != null && (arrayList = ok1Var.d) != null && arrayList.size() > 1) {
            for (int i2 = 0; i2 < this.r.d.d.size(); i2++) {
                if (((nk1) this.r.d.d.get(i2)).g < 0 || !aob.d1(((nk1) this.r.d.d.get(i2)).g)) {
                    double h = vm2.h(aob.w0(null, aob.d6, false));
                    i1b i1bVar2 = this.r;
                    i = h < 0.5d ? ((nk1) i1bVar2.d.d.get(i2)).i : ((nk1) i1bVar2.d.d.get(i2)).h;
                } else {
                    i = aob.w0(null, ((nk1) this.r.d.d.get(i2)).g, false);
                }
                ArrayList arrayList2 = this.n;
                if (i2 < arrayList2.size()) {
                    sk4 sk4Var = ((f1b) arrayList2.get(i2)).a;
                    sk4Var.getClass();
                    sk4Var.r = aob.w0(null, aob.d6, false);
                    sk4Var.w = -1;
                    sk4Var.s = i;
                    sk4Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(aob.w0(null, aob.h6, false));
        this.f.setTextColor(aob.w0(null, aob.s5, false));
    }

    public final void e(i1b i1bVar, boolean z) {
        if (i1bVar != null) {
            String str = i1bVar.j;
            qk1 qk1Var = this.d;
            qk1Var.setTitle(str);
            boolean z2 = getContext().getResources().getConfiguration().orientation == 2;
            pf0 pf0Var = this.b;
            pf0Var.setLandscape(z2);
            ArrayList arrayList = pf0Var.d;
            uk1 uk1Var = pf0Var.h0;
            pf0 pf0Var2 = this.c;
            pf0Var2.setLandscape(z2);
            this.r = i1bVar;
            boolean z3 = i1bVar.l;
            ArrayList arrayList2 = this.n;
            ir8 ir8Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f;
            if (z3 || i1bVar.a) {
                radialProgressView.setVisibility(8);
                String str2 = i1bVar.b;
                if (str2 != null) {
                    textView.setText(str2);
                    if (textView.getVisibility() == 8) {
                        textView.setAlpha(0.0f);
                        textView.animate().alpha(1.0f);
                    }
                    textView.setVisibility(0);
                }
                ir8Var.removeAllViews();
                arrayList2.clear();
                pf0Var.D(null);
                return;
            }
            textView.setVisibility(8);
            q26 q26Var = pf0Var.u0;
            boolean z4 = i1bVar.n;
            q26Var.a = z4;
            qk1Var.c(!z4);
            if (i1bVar.d == null && i1bVar.f != null) {
                radialProgressView.setAlpha(1.0f);
                radialProgressView.setVisibility(0);
                b(i1bVar);
                pf0Var.D(null);
                return;
            }
            if (!z) {
                radialProgressView.setVisibility(8);
            }
            if (pf0Var.D(i1bVar.d) && i1bVar.h) {
                uk1Var.k = 0.0f;
                uk1Var.l = 1.0f;
                uk1Var.a.A(true, false, false);
            }
            qk1Var.setUseWeekInterval(i1bVar.o);
            pf0Var.u0.setUseWeek(i1bVar.o);
            q26 q26Var2 = pf0Var.u0;
            q26Var2.G = this.r.g != null || this.s == 4;
            pf0Var2.u0.G = false;
            q26Var2.setEnabled(q26Var2.G);
            q26 q26Var3 = pf0Var2.u0;
            q26Var3.setEnabled(q26Var3.G);
            int size = arrayList.size();
            ir8Var.removeAllViews();
            arrayList2.clear();
            if (size > 1) {
                for (int i = 0; i < size; i++) {
                    o46 o46Var = (o46) arrayList.get(i);
                    f1b f1bVar = new f1b(this, i);
                    f1bVar.b = o46Var;
                    String str3 = o46Var.a.d;
                    sk4 sk4Var = f1bVar.a;
                    sk4Var.setText(str3);
                    sk4Var.a(o46Var.n, false);
                    sk4Var.setOnTouchListener(new m69());
                    sk4Var.setOnClickListener(new jy8(f1bVar, o46Var, (byte) 22));
                    sk4Var.setOnLongClickListener(new v0(f1bVar, o46Var, (byte) 7));
                }
            }
            long j = this.r.c;
            if (j > 0) {
                pf0Var.t0 = Arrays.binarySearch(pf0Var.i0.a, j);
                pf0Var.v0 = true;
                pf0Var.u0.setVisibility(0);
                pf0Var.w0 = 1.0f;
                pf0Var.x((pf0Var.H0 * uk1Var.k) - pf0.l1);
                try {
                    pf0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                g(true);
            } else {
                h(false);
                pf0Var.invalidate();
            }
            d();
            if (z) {
                pf0Var.z0 = (byte) 3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                z2c z2cVar = new z2c();
                pf0Var.A0 = z2cVar;
                z2cVar.f = 0.0f;
                ofFloat.addUpdateListener(new ija(this, (byte) 10));
                ofFloat.addListener(new e1b(this, (byte) 2));
                ofFloat.start();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(boolean z) {
        ArrayList arrayList;
        Object[] objArr;
        pf0 pf0Var = this.b;
        long selectedDate = pf0Var.getSelectedDate();
        ok1 ok1Var = this.r.e;
        pf0 pf0Var2 = this.c;
        if (!z || pf0Var2.getVisibility() != 0) {
            pf0Var2.J(ok1Var, selectedDate);
        }
        pf0Var2.D(ok1Var);
        ArrayList arrayList2 = pf0Var2.d;
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
                    if (i3 >= ok1Var.d.size()) {
                        objArr = false;
                        break;
                    }
                    if (((nk1) ok1Var.d.get(i3)).c.equals(((nk1) this.r.d.d.get(i)).c)) {
                        boolean z2 = ((f1b) arrayList.get(i)).a.b;
                        ((o46) arrayList2.get(i3)).n = z2;
                        ((o46) arrayList2.get(i3)).o = z2 ? 1.0f : 0.0f;
                        ((f1b) arrayList.get(i)).a.c = true;
                        ((f1b) arrayList.get(i)).a.animate().alpha(1.0f).start();
                        if (z2) {
                            i2++;
                        }
                        objArr = true;
                    } else {
                        i3++;
                    }
                }
                if (objArr == false) {
                    ((f1b) arrayList.get(i)).a.c = false;
                    ((f1b) arrayList.get(i)).a.animate().alpha(0.0f).start();
                }
                i++;
            }
            if (i2 == 0) {
                for (int i4 = 0; i4 < this.r.d.d.size(); i4++) {
                    ((f1b) arrayList.get(i4)).a.c = true;
                    ((f1b) arrayList.get(i4)).a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.r.c = selectedDate;
        pf0Var.u0.setAlpha(0.0f);
        pf0Var.w0 = 0.0f;
        pf0Var.v0 = false;
        pf0Var.j1 = false;
        pf0Var2.G();
        qk1 qk1Var = this.d;
        if (!z) {
            pf0Var2.d();
            qk1Var.d(selectedDate, true);
        }
        pf0Var2.setHeader(qk1Var);
        pf0Var.setHeader(null);
        if (!z) {
            ValueAnimator a = a(selectedDate, true);
            a.addListener(new e1b(this, objArr2 == true ? 1 : 0));
            a.start();
            return;
        }
        pf0Var.setVisibility(4);
        pf0Var2.setVisibility(0);
        pf0Var.z0 = (byte) 0;
        pf0Var2.z0 = (byte) 0;
        pf0Var.K = false;
        pf0Var2.K = true;
        qk1Var.d(selectedDate, false);
    }

    public final void h(boolean z) {
        ok1 ok1Var;
        i1b i1bVar = this.r;
        if (i1bVar == null || (ok1Var = i1bVar.d) == null || ok1Var.a == null) {
            return;
        }
        qk1 qk1Var = this.d;
        TextView textView = qk1Var.d;
        pf0 pf0Var = this.b;
        qk1Var.b(pf0Var.getStartDate(), pf0Var.getEndDate());
        TextView textView2 = qk1Var.a;
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
            textView.setPivotY(hl.L(40.0f));
            textView.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
        } else {
            textView2.setAlpha(1.0f);
            textView2.setScaleX(1.0f);
            textView2.setScaleY(1.0f);
            textView.setAlpha(0.0f);
        }
        pf0Var.u0.f.setAlpha(1.0f);
        pf0 pf0Var2 = this.c;
        pf0Var2.setHeader(null);
        long selectedDate = pf0Var.getSelectedDate();
        this.r.c = 0L;
        int i = 0;
        pf0Var.setVisibility(0);
        pf0Var2.d();
        pf0Var2.setHeader(null);
        pf0Var.setHeader(qk1Var);
        ArrayList arrayList = this.n;
        byte b = 1;
        if (z) {
            ValueAnimator a = a(selectedDate, false);
            a.addListener(new e1b(this, b));
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                f1b f1bVar = (f1b) obj;
                f1bVar.a.animate().alpha(1.0f).start();
                f1bVar.a.c = true;
            }
            a.start();
            return;
        }
        pf0Var2.setVisibility(4);
        pf0Var.K = true;
        pf0Var2.K = false;
        pf0Var.invalidate();
        Window window = this.a;
        if (window != null) {
            window.clearFlags(16);
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            f1b f1bVar2 = (f1b) obj2;
            f1bVar2.a.setAlpha(1.0f);
            f1bVar2.a.c = true;
        }
    }

    @Override // snb
    public final void updateColors() {
        try {
            if (this.b == null || this.c == null || this.d == null || this.e == null || this.f == null) {
                return;
            }
            d();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public void c() {
    }

    public void f() {
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(i1b i1bVar) {
    }
}
