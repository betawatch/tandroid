// default package

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o0b extends FrameLayout implements tjb {
    public wjb a;
    public ShapeDrawable b;
    public View c;

    @Override // tjb
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.b;
            if (shapeDrawable != null) {
                bkb.A1(bkb.p1(0.12f, bkb.v0(bkb.Df, this.a)), shapeDrawable);
                View view = this.c;
                if (view != null) {
                    view.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
