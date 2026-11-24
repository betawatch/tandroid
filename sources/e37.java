// default package

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class e37 extends FrameLayout implements vlb {
    public TLRPC.User a;
    public l66 b;
    public tk4 c;
    public boolean d;
    public int e;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        l66 l66Var = this.b;
        tk4 tk4Var = this.c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm.L(36.0f), TLObject.FLAG_30);
        this.d = true;
        boolean z = tk4Var.getVisibility() == 0;
        l66Var.setVisibility(8);
        if (z) {
            tk4Var.setVisibility(8);
        }
        super.onMeasure(i, makeMeasureSpec);
        if (z) {
            tk4Var.getLayoutParams().width = getMeasuredWidth();
            tk4Var.setVisibility(0);
        }
        l66Var.setVisibility(0);
        l66Var.getLayoutParams().width = getMeasuredWidth() - gm.L(24.0f);
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

    @Override // vlb
    public final void updateColors() {
        try {
            int w0 = cmb.w0(null, cmb.H5, false);
            if (w0 != this.e) {
                this.e = w0;
                cmb.F1(getBackground(), w0, true);
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
