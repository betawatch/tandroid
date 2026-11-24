// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dn2 extends FrameLayout implements tjb {
    public final be0 a;

    public dn2(Context context) {
        super(context);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(20.0f));
        addView(be0Var, nme.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = bkb.R0;
        be0 be0Var = this.a;
        kq3.a(canvas, drawable, (be0Var.getWidth() / 2.0f) + be0Var.getLeft(), (be0Var.getHeight() / 2.0f) + be0Var.getTop(), be0Var.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(136.0f), TLObject.FLAG_30));
    }

    @Override // tjb
    public final void updateColors() {
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
