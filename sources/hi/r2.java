package hi;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class r2 extends b4 {
    public final /* synthetic */ int c0;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2(int i7, Context context, Object obj) {
        super(context);
        this.c0 = i7;
        this.d0 = obj;
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
        switch (this.c0) {
            case 0:
                a3 a3Var = (a3) this.d0;
                w2 w2Var = a3Var.m0;
                int size2 = View.MeasureSpec.getSize(i10);
                if (!org.telegram.messenger.g0.Q1()) {
                    Point point = org.telegram.messenger.g0.q;
                    if (point.x > point.y) {
                        i11 = (int) (size2 / 3.5f);
                        if (i11 < 0) {
                            i11 = 0;
                        }
                        f10 = i11;
                        if (getOffsetY() != f10 && !a3Var.d0 && a3Var.U0) {
                            a3Var.G = true;
                            setOffsetY(f10);
                            a3Var.G = false;
                            a3Var.U0 = false;
                        }
                        if (!a3Var.e0 && org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.P1()) {
                            Point point2 = org.telegram.messenger.g0.q;
                            i7 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point2.x, point2.y) * 0.8f), TLObject.FLAG_30);
                        }
                        size = View.MeasureSpec.getSize(i10);
                        if (!a3Var.e0) {
                            size = (size - org.telegram.messenger.g0.m) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                        }
                        if (w2Var != null && w2Var.getTotalHeight() > 0) {
                            size -= w2Var.getTotalHeight();
                        }
                        super.onMeasure(i7, org.telegram.messenger.camera.q.B(24.0f, size, TLObject.FLAG_30));
                        break;
                    }
                }
                i11 = (size2 / 5) * 2;
                if (i11 < 0) {
                }
                f10 = i11;
                if (getOffsetY() != f10) {
                    a3Var.G = true;
                    setOffsetY(f10);
                    a3Var.G = false;
                    a3Var.U0 = false;
                }
                if (!a3Var.e0) {
                    Point point22 = org.telegram.messenger.g0.q;
                    i7 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point22.x, point22.y) * 0.8f), TLObject.FLAG_30);
                }
                size = View.MeasureSpec.getSize(i10);
                if (!a3Var.e0) {
                }
                if (w2Var != null) {
                    size -= w2Var.getTotalHeight();
                }
                super.onMeasure(i7, org.telegram.messenger.camera.q.B(24.0f, size, TLObject.FLAG_30));
            default:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i10) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(84.0f)) + ((c4) this.d0).N, TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.c0) {
            case 0:
                if (!((a3) this.d0).G) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // hi.b4, android.view.View
    public void setTranslationY(float f10) {
        switch (this.c0) {
            case 0:
                super.setTranslationY(f10);
                a3 a3Var = (a3) this.d0;
                org.telegram.messenger.h2 h2Var = a3Var.n0;
                if (h2Var != null) {
                    h2Var.setTranslationY(org.telegram.messenger.g0.L(24.0f) + f10);
                }
                FrameLayout frameLayout = a3Var.q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(a3Var.x.getTranslationY() + org.telegram.messenger.g0.W1(a3Var.g0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(70.0f) + a3Var.n.top));
                    break;
                }
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
