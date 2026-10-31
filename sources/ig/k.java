package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k extends ScrollView {
    public final /* synthetic */ LinearLayout a;
    public final /* synthetic */ u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(u uVar, Context context, LinearLayout linearLayout) {
        super(context);
        this.b = uVar;
        this.a = linearLayout;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float y3 = this.a.getY() + org.telegram.messenger.i0.L(1.0f);
        int L = org.telegram.messenger.i0.L(36.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set((getMeasuredWidth() - L) / 2.0f, y3, (getMeasuredWidth() + L) / 2.0f, org.telegram.messenger.i0.L(4.0f) + y3);
        t6.t0.setColor(-10790053);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), t6.t0);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((LinearLayout.LayoutParams) this.b.i1.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(24.0f)) * 0.8333333f) + org.telegram.messenger.i0.L(88.0f));
    }
}
