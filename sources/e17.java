// default package

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class e17 extends FrameLayout implements tjb {
    public TLRPC.User a;
    public l46 b;
    public pi4 c;
    public boolean d;
    public int e;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        l46 l46Var = this.b;
        pi4 pi4Var = this.c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gl.L(36.0f), TLObject.FLAG_30);
        this.d = true;
        boolean z = pi4Var.getVisibility() == 0;
        l46Var.setVisibility(8);
        if (z) {
            pi4Var.setVisibility(8);
        }
        super.onMeasure(i, makeMeasureSpec);
        if (z) {
            pi4Var.getLayoutParams().width = getMeasuredWidth();
            pi4Var.setVisibility(0);
        }
        l46Var.setVisibility(0);
        l46Var.getLayoutParams().width = getMeasuredWidth() - gl.L(24.0f);
        this.d = false;
        super.onMeasure(i, makeMeasureSpec);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }

    @Override // tjb
    public final void updateColors() {
        try {
            int w0 = bkb.w0(null, bkb.H5, false);
            if (w0 != this.e) {
                this.e = w0;
                bkb.F1(getBackground(), w0, true);
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
