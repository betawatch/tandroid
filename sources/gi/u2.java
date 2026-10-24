package gi;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class u2 extends e4 {
    public final /* synthetic */ int c0;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(Object obj, Context context, int i10) {
        super(context);
        this.c0 = i10;
        this.d0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        int size;
        switch (this.c0) {
            case 0:
                d3 d3Var = (d3) this.d0;
                z2 z2Var = d3Var.m0;
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i12 = (int) (size2 / 3.5f);
                        if (i12 < 0) {
                            i12 = 0;
                        }
                        f7 = i12;
                        if (getOffsetY() != f7 && !d3Var.d0 && d3Var.U0) {
                            d3Var.G = true;
                            setOffsetY(f7);
                            d3Var.G = false;
                            d3Var.U0 = false;
                        }
                        if (!d3Var.e0 && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                            Point point2 = AndroidUtilities.displaySize;
                            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point2.x, point2.y) * 0.8f), TLObject.FLAG_30);
                        }
                        size = View.MeasureSpec.getSize(i11);
                        if (!d3Var.e0) {
                            size = (size - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                        }
                        if (z2Var != null && z2Var.getTotalHeight() > 0) {
                            size -= z2Var.getTotalHeight();
                        }
                        super.onMeasure(i10, sl.C(24.0f, size, TLObject.FLAG_30));
                        break;
                    }
                }
                i12 = (size2 / 5) * 2;
                if (i12 < 0) {
                }
                f7 = i12;
                if (getOffsetY() != f7) {
                    d3Var.G = true;
                    setOffsetY(f7);
                    d3Var.G = false;
                    d3Var.U0 = false;
                }
                if (!d3Var.e0) {
                    Point point22 = AndroidUtilities.displaySize;
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point22.x, point22.y) * 0.8f), TLObject.FLAG_30);
                }
                size = View.MeasureSpec.getSize(i11);
                if (!d3Var.e0) {
                }
                if (z2Var != null) {
                    size -= z2Var.getTotalHeight();
                }
                super.onMeasure(i10, sl.C(24.0f, size, TLObject.FLAG_30));
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i11) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(84.0f)) + ((f4) this.d0).N, TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.c0) {
            case 0:
                if (!((d3) this.d0).G) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // gi.e4, android.view.View
    public void setTranslationY(float f7) {
        switch (this.c0) {
            case 0:
                super.setTranslationY(f7);
                d3 d3Var = (d3) this.d0;
                BotFullscreenButtons botFullscreenButtons = d3Var.n0;
                if (botFullscreenButtons != null) {
                    botFullscreenButtons.setTranslationY(AndroidUtilities.dp(24.0f) + f7);
                }
                FrameLayout frameLayout = d3Var.q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(d3Var.w.getTranslationY() + AndroidUtilities.lerp(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(70.0f) + d3Var.n.top, d3Var.g0));
                    break;
                }
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }
}
