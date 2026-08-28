package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cw0 extends org.telegram.ui.Components.wk0 {
    public final Paint T2;
    public final Path U2;
    public final /* synthetic */ fw0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw0(fw0 fw0Var, Context context) {
        super(context, null);
        this.V2 = fw0Var;
        Paint paint = new Paint(1);
        this.T2 = paint;
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false));
        this.U2 = new Path();
    }

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.U2;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
        canvas.drawPath(path, this.T2);
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.V2.n.m0 >= 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.V2.n.m0 >= 1.0f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        PremiumPreviewFragment premiumPreviewFragment = this.V2.n;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            ArrayList arrayList = premiumPreviewFragment.d;
            if (i13 >= arrayList.size()) {
                premiumPreviewFragment.K = i14;
                return;
            }
            premiumPreviewFragment.I.a((hw0) arrayList.get(i13), false);
            premiumPreviewFragment.I.measure(View.MeasureSpec.makeMeasureSpec(i9, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
            ((hw0) arrayList.get(i13)).h = i14;
            i14 += premiumPreviewFragment.I.getMeasuredHeight();
            i13++;
        }
    }
}
