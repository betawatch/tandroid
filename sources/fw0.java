// default package

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class fw0 extends r12 {
    public final /* synthetic */ byte d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fw0(byte b, Context context, Object obj) {
        super(context);
        this.d0 = b;
        this.e0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        int size;
        byte b = this.d0;
        Object obj = this.e0;
        switch (b) {
            case 0:
                ow0 ow0Var = (ow0) obj;
                kw0 kw0Var = ow0Var.n0;
                int size2 = View.MeasureSpec.getSize(i2);
                if (!gl.O1()) {
                    Point point = gl.q;
                    if (point.x > point.y) {
                        i3 = (int) (size2 / 3.5f);
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        f = i3;
                        if (getOffsetY() != f && !ow0Var.e0 && ow0Var.V0) {
                            ow0Var.H = true;
                            setOffsetY(f);
                            ow0Var.H = false;
                            ow0Var.V0 = false;
                        }
                        if (!ow0Var.f0 && gl.O1() && !gl.E && !gl.N1()) {
                            Point point2 = gl.q;
                            i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point2.x, point2.y) * 0.8f), TLObject.FLAG_30);
                        }
                        size = View.MeasureSpec.getSize(i2);
                        if (!ow0Var.f0) {
                            size = (size - gl.m) - a.getCurrentActionBarHeight();
                        }
                        if (kw0Var != null && kw0Var.getTotalHeight() > 0) {
                            size -= kw0Var.getTotalHeight();
                        }
                        super.onMeasure(i, ug8.E(24.0f, size, TLObject.FLAG_30));
                        break;
                    }
                }
                i3 = (size2 / 5) << 1;
                if (i3 < 0) {
                }
                f = i3;
                if (getOffsetY() != f) {
                    ow0Var.H = true;
                    setOffsetY(f);
                    ow0Var.H = false;
                    ow0Var.V0 = false;
                }
                if (!ow0Var.f0) {
                    Point point22 = gl.q;
                    i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point22.x, point22.y) * 0.8f), TLObject.FLAG_30);
                }
                size = View.MeasureSpec.getSize(i2);
                if (!ow0Var.f0) {
                }
                if (kw0Var != null) {
                    size -= kw0Var.getTotalHeight();
                }
                super.onMeasure(i, ug8.E(24.0f, size, TLObject.FLAG_30));
            default:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i2) - a.getCurrentActionBarHeight()) - gl.L(84.0f)) + ((s12) obj).O, TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.d0) {
            case 0:
                if (!((ow0) this.e0).H) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // r12, android.view.View
    public final void setTranslationY(float f) {
        switch (this.d0) {
            case 0:
                super.setTranslationY(f);
                ow0 ow0Var = (ow0) this.e0;
                yp0 yp0Var = ow0Var.o0;
                if (yp0Var != null) {
                    yp0Var.setTranslationY(gl.L(24.0f) + f);
                }
                FrameLayout frameLayout = ow0Var.r0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(ow0Var.x.getTranslationY() + gl.U1(ow0Var.h0, a.getCurrentActionBarHeight() - gl.L(24.0f), gl.L(70.0f) + ow0Var.n.top));
                    break;
                }
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }
}
