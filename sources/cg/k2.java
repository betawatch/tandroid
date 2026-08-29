package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class k2 extends jl0 implements NotificationCenter.NotificationCenterDelegate, y0 {
    public final ArrayList T2;
    public final f2.j0 U2;
    public boolean V2;
    public boolean W2;
    public final int X2;
    public boolean Y2;
    public boolean Z2;
    public final ag.q1 a3;
    public final jr b3;
    public final ArrayList c3;
    public final c5.e d3;
    public View e3;
    public boolean f3;
    public int g3;
    public int h3;
    public boolean i3;
    public boolean j3;

    public k2(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.T2 = arrayList;
        this.V2 = true;
        this.W2 = true;
        h1 h1Var = (h1) this;
        this.a3 = new ag.q1(h1Var, 12);
        this.b3 = new jr(0.0f, 0.5f, 0.5f, 1.0f);
        this.c3 = new ArrayList();
        this.d3 = new c5.e(2);
        this.h3 = -1;
        this.X2 = i10;
        f2.j0 j0Var = new f2.j0();
        this.U2 = j0Var;
        setLayoutManager(j0Var);
        setAdapter(new h2(h1Var));
        setClipChildren(false);
        setOnScrollListener(new g2(h1Var, 0));
        setOnItemClickListener(new bg.o(h1Var, 3));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        arrayList.clear();
        arrayList.addAll(MediaDataController.getInstance(i10).premiumPreviewStickers);
        getAdapter().l();
        invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.premiumStickersPreviewLoaded) {
            ArrayList arrayList = this.T2;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.X2).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.jl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.i3) {
            ArrayList arrayList = this.c3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                j2 j2Var = (j2) getChildAt(i10);
                float measuredHeight = ((j2Var.getMeasuredHeight() + j2Var.getTop()) + (j2Var.getMeasuredHeight() >> 1)) / (j2Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                j2Var.a = clamp;
                j2Var.b.setTranslationX((1.0f - this.b3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(j2Var);
            }
            Collections.sort(arrayList, this.d3);
            if ((this.W2 || this.f3) && arrayList.size() > 0 && !this.T2.isEmpty()) {
                View view = (View) j7.l1.i(1, arrayList);
                this.e3 = view;
                w1(view, !this.W2);
                this.W2 = false;
                this.f3 = false;
            } else if (this.e3 != j7.l1.i(1, arrayList)) {
                this.e3 = (View) j7.l1.i(1, arrayList);
                if (this.Z2) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.save();
                canvas.translate(((j2) arrayList.get(i11)).getX(), ((j2) arrayList.get(i11)).getY());
                ((j2) arrayList.get(i11)).draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return true;
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.X2).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        x1();
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.X2).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.V2 && !this.T2.isEmpty() && getChildCount() > 0) {
            this.V2 = false;
            AndroidUtilities.runOnUIThread(new a4.g(this, 29));
        }
        int i14 = this.h3;
        if (i14 > 0) {
            f2.n1 K = K(i14);
            if (K != null) {
                w1(K.a, false);
            }
            this.h3 = -1;
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.g3 = View.MeasureSpec.getSize(i10);
        } else {
            this.g3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.j3 != z10) {
            this.j3 = z10;
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.a3);
                w1(null, true);
            } else {
                x1();
                this.f3 = true;
                invalidate();
            }
        }
    }

    public void setOffset(float f9) {
        boolean z10 = Math.abs(f9 / ((float) getMeasuredWidth())) < 1.0f;
        if (this.i3 != z10) {
            this.i3 = z10;
            invalidate();
        }
    }

    public final void w1(View view, boolean z10) {
        this.Y2 = view != null;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            j2 j2Var = (j2) getChildAt(i10);
            if (j2Var == view) {
                j2Var.a(true, true, z10);
            } else {
                j2Var.a(!this.Y2, false, z10);
            }
        }
    }

    public final void x1() {
        if (this.j3) {
            ag.q1 q1Var = this.a3;
            AndroidUtilities.cancelRunOnUIThread(q1Var);
            AndroidUtilities.runOnUIThread(q1Var, 2700L);
        }
    }
}
