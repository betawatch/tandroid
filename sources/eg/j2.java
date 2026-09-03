package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class j2 extends rl0 implements NotificationCenter.NotificationCenterDelegate, x0 {
    public final ArrayList U2;
    public final f2.i0 V2;
    public boolean W2;
    public boolean X2;
    public final int Y2;
    public boolean Z2;
    public boolean a3;
    public final androidx.activity.i b3;
    public final mr c3;
    public final ArrayList d3;
    public final e5.e e3;
    public View f3;
    public boolean g3;
    public int h3;
    public int i3;
    public boolean j3;
    public boolean k3;

    public j2(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.U2 = arrayList;
        this.W2 = true;
        this.X2 = true;
        g1 g1Var = (g1) this;
        this.b3 = new androidx.activity.i(g1Var, 18);
        this.c3 = new mr(0.0f, 0.5f, 0.5f, 1.0f);
        this.d3 = new ArrayList();
        this.e3 = new e5.e(2);
        this.i3 = -1;
        this.Y2 = i10;
        f2.i0 i0Var = new f2.i0();
        this.V2 = i0Var;
        setLayoutManager(i0Var);
        setAdapter(new g2(g1Var));
        setClipChildren(false);
        setOnScrollListener(new f2(g1Var, 0));
        setOnItemClickListener(new dg.n(g1Var, 3));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        arrayList.clear();
        arrayList.addAll(MediaDataController.getInstance(i10).premiumPreviewStickers);
        getAdapter().l();
        invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.premiumStickersPreviewLoaded) {
            ArrayList arrayList = this.U2;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.Y2).premiumPreviewStickers);
            getAdapter().l();
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.rl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.j3) {
            ArrayList arrayList = this.d3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                i2 i2Var = (i2) getChildAt(i10);
                float measuredHeight = ((i2Var.getMeasuredHeight() + i2Var.getTop()) + (i2Var.getMeasuredHeight() >> 1)) / (i2Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float clamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                i2Var.a = clamp;
                i2Var.b.setTranslationX((1.0f - this.c3.getInterpolation(clamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(i2Var);
            }
            Collections.sort(arrayList, this.e3);
            if ((this.X2 || this.g3) && arrayList.size() > 0 && !this.U2.isEmpty()) {
                View view = (View) kf.k0.i(1, arrayList);
                this.f3 = view;
                v1(view, !this.X2);
                this.X2 = false;
                this.g3 = false;
            } else if (this.f3 != kf.k0.i(1, arrayList)) {
                this.f3 = (View) kf.k0.i(1, arrayList);
                if (this.a3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.save();
                canvas.translate(((i2) arrayList.get(i11)).getX(), ((i2) arrayList.get(i11)).getY());
                ((i2) arrayList.get(i11)).draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return true;
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.Y2).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        w1();
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.Y2).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.W2 && !this.U2.isEmpty() && getChildCount() > 0) {
            this.W2 = false;
            AndroidUtilities.runOnUIThread(new e3.h(this, 5));
        }
        int i14 = this.i3;
        if (i14 > 0) {
            f2.l1 K = K(i14);
            if (K != null) {
                v1(K.a, false);
            }
            this.i3 = -1;
        }
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.h3 = View.MeasureSpec.getSize(i10);
        } else {
            this.h3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z4) {
        if (this.k3 != z4) {
            this.k3 = z4;
            if (!z4) {
                AndroidUtilities.cancelRunOnUIThread(this.b3);
                v1(null, true);
            } else {
                w1();
                this.g3 = true;
                invalidate();
            }
        }
    }

    public void setOffset(float f10) {
        boolean z4 = Math.abs(f10 / ((float) getMeasuredWidth())) < 1.0f;
        if (this.j3 != z4) {
            this.j3 = z4;
            invalidate();
        }
    }

    public final void v1(View view, boolean z4) {
        this.Z2 = view != null;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            i2 i2Var = (i2) getChildAt(i10);
            if (i2Var == view) {
                i2Var.a(true, true, z4);
            } else {
                i2Var.a(!this.Z2, false, z4);
            }
        }
    }

    public final void w1() {
        if (this.k3) {
            androidx.activity.i iVar = this.b3;
            AndroidUtilities.cancelRunOnUIThread(iVar);
            AndroidUtilities.runOnUIThread(iVar, 2700L);
        }
    }
}
