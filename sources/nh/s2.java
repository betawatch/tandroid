package nh;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class s2 extends d4 {
    public final /* synthetic */ int V;
    public final /* synthetic */ Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(Object obj, Context context, int i10) {
        super(context);
        this.V = i10;
        this.W = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f10;
        int size;
        switch (this.V) {
            case 0:
                b3 b3Var = (b3) this.W;
                x2 x2Var = b3Var.h0;
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i12 = (int) (size2 / 3.5f);
                        if (i12 < 0) {
                            i12 = 0;
                        }
                        f10 = i12;
                        if (getOffsetY() != f10 && !b3Var.Y && b3Var.M0) {
                            b3Var.B = true;
                            setOffsetY(f10);
                            b3Var.B = false;
                            b3Var.M0 = false;
                        }
                        if (!b3Var.Z && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                            Point point2 = AndroidUtilities.displaySize;
                            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point2.x, point2.y) * 0.8f), TLObject.FLAG_30);
                        }
                        size = View.MeasureSpec.getSize(i11);
                        if (!b3Var.Z) {
                            size = (size - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                        }
                        if (x2Var != null && x2Var.getTotalHeight() > 0) {
                            size -= x2Var.getTotalHeight();
                        }
                        super.onMeasure(i10, rl.B(24.0f, size, TLObject.FLAG_30));
                        break;
                    }
                }
                i12 = (size2 / 5) * 2;
                if (i12 < 0) {
                }
                f10 = i12;
                if (getOffsetY() != f10) {
                    b3Var.B = true;
                    setOffsetY(f10);
                    b3Var.B = false;
                    b3Var.M0 = false;
                }
                if (!b3Var.Z) {
                    Point point22 = AndroidUtilities.displaySize;
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point22.x, point22.y) * 0.8f), TLObject.FLAG_30);
                }
                size = View.MeasureSpec.getSize(i11);
                if (!b3Var.Z) {
                }
                if (x2Var != null) {
                    size -= x2Var.getTotalHeight();
                }
                super.onMeasure(i10, rl.B(24.0f, size, TLObject.FLAG_30));
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i11) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(84.0f)) + ((e4) this.W).J, TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.V) {
            case 0:
                if (!((b3) this.W).B) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // nh.d4, android.view.View
    public void setTranslationY(float f10) {
        switch (this.V) {
            case 0:
                super.setTranslationY(f10);
                b3 b3Var = (b3) this.W;
                BotFullscreenButtons botFullscreenButtons = b3Var.i0;
                if (botFullscreenButtons != null) {
                    botFullscreenButtons.setTranslationY(AndroidUtilities.dp(24.0f) + f10);
                }
                FrameLayout frameLayout = b3Var.l0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(b3Var.v.getTranslationY() + AndroidUtilities.lerp(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(70.0f) + b3Var.h.top, b3Var.b0));
                    break;
                }
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
