// default package

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class m4b extends FrameLayout implements snb {
    public vnb a;
    public ShapeDrawable b;
    public View c;

    @Override // snb
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.b;
            if (shapeDrawable != null) {
                aob.A1(aob.p1(0.12f, aob.v0(aob.Ef, this.a)), shapeDrawable);
                View view = this.c;
                if (view != null) {
                    view.invalidate();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
