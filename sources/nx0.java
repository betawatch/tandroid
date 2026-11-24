// default package

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class nx0 extends d32 {
    public final /* synthetic */ byte d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nx0(byte b, Context context, Object obj) {
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
                wx0 wx0Var = (wx0) obj;
                sx0 sx0Var = wx0Var.n0;
                int size2 = View.MeasureSpec.getSize(i2);
                if (!gm.O1()) {
                    Point point = gm.q;
                    if (point.x > point.y) {
                        i3 = (int) (size2 / 3.5f);
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        f = i3;
                        if (getOffsetY() != f && !wx0Var.e0 && wx0Var.V0) {
                            wx0Var.H = true;
                            setOffsetY(f);
                            wx0Var.H = false;
                            wx0Var.V0 = false;
                        }
                        if (!wx0Var.f0 && gm.O1() && !gm.E && !gm.N1()) {
                            Point point2 = gm.q;
                            i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point2.x, point2.y) * 0.8f), TLObject.FLAG_30);
                        }
                        size = View.MeasureSpec.getSize(i2);
                        if (!wx0Var.f0) {
                            size = (size - gm.m) - a.getCurrentActionBarHeight();
                        }
                        if (sx0Var != null && sx0Var.getTotalHeight() > 0) {
                            size -= sx0Var.getTotalHeight();
                        }
                        super.onMeasure(i, wi8.E(24.0f, size, TLObject.FLAG_30));
                        break;
                    }
                }
                i3 = (size2 / 5) << 1;
                if (i3 < 0) {
                }
                f = i3;
                if (getOffsetY() != f) {
                    wx0Var.H = true;
                    setOffsetY(f);
                    wx0Var.H = false;
                    wx0Var.V0 = false;
                }
                if (!wx0Var.f0) {
                    Point point22 = gm.q;
                    i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point22.x, point22.y) * 0.8f), TLObject.FLAG_30);
                }
                size = View.MeasureSpec.getSize(i2);
                if (!wx0Var.f0) {
                }
                if (sx0Var != null) {
                    size -= sx0Var.getTotalHeight();
                }
                super.onMeasure(i, wi8.E(24.0f, size, TLObject.FLAG_30));
            default:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i2) - a.getCurrentActionBarHeight()) - gm.L(84.0f)) + ((e32) obj).O, TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.d0) {
            case 0:
                if (!((wx0) this.e0).H) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // d32, android.view.View
    public final void setTranslationY(float f) {
        switch (this.d0) {
            case 0:
                super.setTranslationY(f);
                wx0 wx0Var = (wx0) this.e0;
                yq0 yq0Var = wx0Var.o0;
                if (yq0Var != null) {
                    yq0Var.setTranslationY(gm.L(24.0f) + f);
                }
                FrameLayout frameLayout = wx0Var.r0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(wx0Var.x.getTranslationY() + gm.U1(wx0Var.h0, a.getCurrentActionBarHeight() - gm.L(24.0f), gm.L(70.0f) + wx0Var.n.top));
                    break;
                }
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }
}
