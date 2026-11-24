// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cn2 extends ScrollView {
    public final /* synthetic */ LinearLayout a;
    public final /* synthetic */ ln2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn2(ln2 ln2Var, Context context, LinearLayout linearLayout) {
        super(context);
        this.b = ln2Var;
        this.a = linearLayout;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float y = this.a.getY() + gm.L(1.0f);
        int L = gm.L(36.0f);
        RectF rectF = gm.P;
        rectF.set((getMeasuredWidth() - L) / 2.0f, y, (getMeasuredWidth() + L) / 2.0f, gm.L(4.0f) + y);
        cmb.s0.setColor(-10790053);
        canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), cmb.s0);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ((LinearLayout.LayoutParams) this.b.l1.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i) - gm.L(24.0f)) * 0.8333333f) + gm.L(88.0f));
    }
}
