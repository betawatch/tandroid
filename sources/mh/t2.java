package mh;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class t2 extends f4 {
    public final /* synthetic */ int V;
    public final /* synthetic */ Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2(Object obj, Context context, int i9) {
        super(context);
        this.V = i9;
        this.W = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i9, int i10) {
        int i11;
        float f10;
        int size;
        switch (this.V) {
            case 0:
                c3 c3Var = (c3) this.W;
                y2 y2Var = c3Var.h0;
                int size2 = View.MeasureSpec.getSize(i10);
                if (!AndroidUtilities.isTablet()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i11 = (int) (size2 / 3.5f);
                        if (i11 < 0) {
                            i11 = 0;
                        }
                        f10 = i11;
                        if (getOffsetY() != f10 && !c3Var.Y && c3Var.M0) {
                            c3Var.B = true;
                            setOffsetY(f10);
                            c3Var.B = false;
                            c3Var.M0 = false;
                        }
                        if (!c3Var.Z && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                            Point point2 = AndroidUtilities.displaySize;
                            i9 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point2.x, point2.y) * 0.8f), TLObject.FLAG_30);
                        }
                        size = View.MeasureSpec.getSize(i10);
                        if (!c3Var.Z) {
                            size = (size - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                        }
                        if (y2Var != null && y2Var.getTotalHeight() > 0) {
                            size -= y2Var.getTotalHeight();
                        }
                        super.onMeasure(i9, ll.C(24.0f, size, TLObject.FLAG_30));
                        break;
                    }
                }
                i11 = (size2 / 5) * 2;
                if (i11 < 0) {
                }
                f10 = i11;
                if (getOffsetY() != f10) {
                    c3Var.B = true;
                    setOffsetY(f10);
                    c3Var.B = false;
                    c3Var.M0 = false;
                }
                if (!c3Var.Z) {
                    Point point22 = AndroidUtilities.displaySize;
                    i9 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point22.x, point22.y) * 0.8f), TLObject.FLAG_30);
                }
                size = View.MeasureSpec.getSize(i10);
                if (!c3Var.Z) {
                }
                if (y2Var != null) {
                    size -= y2Var.getTotalHeight();
                }
                super.onMeasure(i9, ll.C(24.0f, size, TLObject.FLAG_30));
            default:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i10) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(84.0f)) + ((g4) this.W).J, TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.V) {
            case 0:
                if (!((c3) this.W).B) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // mh.f4, android.view.View
    public void setTranslationY(float f10) {
        switch (this.V) {
            case 0:
                super.setTranslationY(f10);
                c3 c3Var = (c3) this.W;
                BotFullscreenButtons botFullscreenButtons = c3Var.i0;
                if (botFullscreenButtons != null) {
                    botFullscreenButtons.setTranslationY(AndroidUtilities.dp(24.0f) + f10);
                }
                FrameLayout frameLayout = c3Var.l0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(c3Var.v.getTranslationY() + AndroidUtilities.lerp(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(70.0f) + c3Var.h.top, c3Var.b0));
                    break;
                }
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
