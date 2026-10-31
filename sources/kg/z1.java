package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class z1 extends tk0 implements us, t0 {
    public final ArrayList e3;
    public final s4.a0 f3;
    public boolean g3;
    public boolean h3;
    public final int i3;
    public boolean j3;
    public boolean k3;
    public final androidx.activity.i l3;
    public final gr m3;
    public final ArrayList n3;
    public final a4.d o3;
    public View p3;
    public boolean q3;
    public int r3;
    public int s3;
    public boolean t3;
    public boolean u3;

    public z1(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.e3 = arrayList;
        this.g3 = true;
        this.h3 = true;
        b1 b1Var = (b1) this;
        this.l3 = new androidx.activity.i(b1Var, 24);
        this.m3 = new gr(0.0f, 0.5f, 0.5f, 1.0f);
        this.n3 = new ArrayList();
        this.o3 = new a4.d(9);
        this.s3 = -1;
        this.i3 = i10;
        s4.a0 a0Var = new s4.a0();
        this.f3 = a0Var;
        setLayoutManager(a0Var);
        setAdapter(new w1(b1Var));
        setClipChildren(false);
        setOnScrollListener(new ag.u(b1Var, 4));
        setOnItemClickListener(new ag.y0(b1Var, 7));
        ui.b0(i10).o1();
        arrayList.clear();
        arrayList.addAll(ui.b0(i10).B0);
        getAdapter().f();
        invalidate();
    }

    public final void A1() {
        if (this.u3) {
            androidx.activity.i iVar = this.l3;
            org.telegram.messenger.i0.r(iVar);
            org.telegram.messenger.i0.h3(iVar, 2700L);
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.l5) {
            ArrayList arrayList = this.e3;
            arrayList.clear();
            arrayList.addAll(ui.b0(this.i3).B0);
            getAdapter().f();
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.t3) {
            ArrayList arrayList = this.n3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                y1 y1Var = (y1) getChildAt(i10);
                float measuredHeight = ((y1Var.getMeasuredHeight() + y1Var.getTop()) + (y1Var.getMeasuredHeight() >> 1)) / (y1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float i11 = Utilities.i(measuredHeight, 1.0f, 0.0f);
                y1Var.a = i11;
                y1Var.b.setTranslationX((1.0f - this.m3.getInterpolation(i11)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(y1Var);
            }
            Collections.sort(arrayList, this.o3);
            if ((this.h3 || this.q3) && arrayList.size() > 0 && !this.e3.isEmpty()) {
                View view = (View) i0.a.g(1, arrayList);
                this.p3 = view;
                z1(view, !this.h3);
                this.h3 = false;
                this.q3 = false;
            } else if (this.p3 != i0.a.g(1, arrayList)) {
                this.p3 = (View) i0.a.g(1, arrayList);
                if (this.k3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                canvas.save();
                canvas.translate(((y1) arrayList.get(i12)).getX(), ((y1) arrayList.get(i12)).getY());
                ((y1) arrayList.get(i12)).draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return true;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.i3).c(this, zs.l5);
        A1();
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.i3).n(this, zs.l5);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.g3 && !this.e3.isEmpty() && getChildCount() > 0) {
            this.g3 = false;
            org.telegram.messenger.i0.g3(new gg.c(this, 25));
        }
        int i14 = this.s3;
        if (i14 > 0) {
            s4.c1 K = K(i14);
            if (K != null) {
                z1(K.a, false);
            }
            this.s3 = -1;
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.r3 = View.MeasureSpec.getSize(i10);
        } else {
            this.r3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.u3 != z10) {
            this.u3 = z10;
            if (!z10) {
                org.telegram.messenger.i0.r(this.l3);
                z1(null, true);
            } else {
                A1();
                this.q3 = true;
                invalidate();
            }
        }
    }

    public void setOffset(float f7) {
        boolean z10 = Math.abs(f7 / ((float) getMeasuredWidth())) < 1.0f;
        if (this.t3 != z10) {
            this.t3 = z10;
            invalidate();
        }
    }

    public final void z1(View view, boolean z10) {
        this.j3 = view != null;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            y1 y1Var = (y1) getChildAt(i10);
            if (y1Var == view) {
                y1Var.a(true, true, z10);
            } else {
                y1Var.a(!this.j3, false, z10);
            }
        }
    }
}
