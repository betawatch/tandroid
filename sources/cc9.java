// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class cc9 extends View implements tjb {
    public final wjb a;
    public final Paint b;
    public lk0 c;

    public cc9(Context context, wjb wjbVar) {
        super(context);
        this.b = new Paint();
        this.a = wjbVar;
        updateColors();
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.vl));
    }

    public lk0 getRow() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, gl.L(6.0f), getMeasuredWidth(), gl.L(6.0f) + 1, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(6.0f) + 1);
    }

    @Override // tjb
    public final void updateColors() {
        this.b.setColor(bkb.v0(bkb.vl, this.a));
    }
}
