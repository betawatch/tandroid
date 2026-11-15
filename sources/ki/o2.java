package ki;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class o2 extends x3 {
    public final /* synthetic */ int d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(int i7, Context context, Object obj) {
        super(context);
        this.d0 = i7;
        this.e0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        int size;
        switch (this.d0) {
            case 0:
                x2 x2Var = (x2) this.e0;
                t2 t2Var = x2Var.n0;
                int size2 = View.MeasureSpec.getSize(i10);
                if (!org.telegram.messenger.g0.Q1()) {
                    Point point = org.telegram.messenger.g0.q;
                    if (point.x > point.y) {
                        i11 = (int) (size2 / 3.5f);
                        if (i11 < 0) {
                            i11 = 0;
                        }
                        f10 = i11;
                        if (getOffsetY() != f10 && !x2Var.e0 && x2Var.V0) {
                            x2Var.H = true;
                            setOffsetY(f10);
                            x2Var.H = false;
                            x2Var.V0 = false;
                        }
                        if (!x2Var.f0 && org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
                            Point point2 = org.telegram.messenger.g0.q;
                            i7 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point2.x, point2.y) * 0.8f), TLObject.FLAG_30);
                        }
                        size = View.MeasureSpec.getSize(i10);
                        if (!x2Var.f0) {
                            size = (size - org.telegram.messenger.g0.m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                        }
                        if (t2Var != null && t2Var.getTotalHeight() > 0) {
                            size -= t2Var.getTotalHeight();
                        }
                        super.onMeasure(i7, i20.B(24.0f, size, TLObject.FLAG_30));
                        break;
                    }
                }
                i11 = (size2 / 5) * 2;
                if (i11 < 0) {
                }
                f10 = i11;
                if (getOffsetY() != f10) {
                    x2Var.H = true;
                    setOffsetY(f10);
                    x2Var.H = false;
                    x2Var.V0 = false;
                }
                if (!x2Var.f0) {
                    Point point22 = org.telegram.messenger.g0.q;
                    i7 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point22.x, point22.y) * 0.8f), TLObject.FLAG_30);
                }
                size = View.MeasureSpec.getSize(i10);
                if (!x2Var.f0) {
                }
                if (t2Var != null) {
                    size -= t2Var.getTotalHeight();
                }
                super.onMeasure(i7, i20.B(24.0f, size, TLObject.FLAG_30));
            default:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i10) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(84.0f)) + ((y3) this.e0).O, TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.d0) {
            case 0:
                if (!((x2) this.e0).H) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // ki.x3, android.view.View
    public void setTranslationY(float f10) {
        switch (this.d0) {
            case 0:
                super.setTranslationY(f10);
                x2 x2Var = (x2) this.e0;
                org.telegram.messenger.h2 h2Var = x2Var.o0;
                if (h2Var != null) {
                    h2Var.setTranslationY(org.telegram.messenger.g0.L(24.0f) + f10);
                }
                FrameLayout frameLayout = x2Var.r0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(x2Var.x.getTranslationY() + org.telegram.messenger.g0.W1(x2Var.h0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(70.0f) + x2Var.n.top));
                    break;
                }
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
