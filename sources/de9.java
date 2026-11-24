// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class de9 extends View implements vlb {
    public final ylb a;
    public final Paint b;
    public ll0 c;

    public de9(Context context, ylb ylbVar) {
        super(context);
        this.b = new Paint();
        this.a = ylbVar;
        updateColors();
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.vl));
    }

    public ll0 getRow() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, gm.L(6.0f), getMeasuredWidth(), gm.L(6.0f) + 1, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(6.0f) + 1);
    }

    @Override // vlb
    public final void updateColors() {
        this.b.setColor(cmb.v0(cmb.vl, this.a));
    }
}
