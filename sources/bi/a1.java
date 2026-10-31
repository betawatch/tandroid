package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class a1 extends View implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public final Paint b;
    public a c;

    public a1(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.b = new Paint();
        this.a = p6Var;
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tl));
    }

    public a getRow() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, org.telegram.messenger.i0.L(6.0f), getMeasuredWidth(), org.telegram.messenger.i0.L(6.0f) + 1, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(6.0f) + 1);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        this.b.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.tl, this.a));
    }
}
