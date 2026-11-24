// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oo2 extends FrameLayout implements vlb {
    public final bf0 a;

    public oo2(Context context) {
        super(context);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(20.0f));
        addView(bf0Var, qoe.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = cmb.R0;
        bf0 bf0Var = this.a;
        ur3.a(canvas, drawable, (bf0Var.getWidth() / 2.0f) + bf0Var.getLeft(), (bf0Var.getHeight() / 2.0f) + bf0Var.getTop(), bf0Var.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(136.0f), TLObject.FLAG_30));
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // vlb
    public final void updateColors() {
    }
}
