package fi;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class a3 extends q4 {
    public final /* synthetic */ int c0;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(Object obj, Context context, int i10) {
        super(context);
        this.c0 = i10;
        this.d0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
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
                k3 k3Var = (k3) this.d0;
                g3 g3Var = k3Var.l0;
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i12 = (int) (size2 / 3.5f);
                        if (i12 < 0) {
                            i12 = 0;
                        }
                        f7 = i12;
                        if (getOffsetY() != f7 && !k3Var.c0 && k3Var.Q0) {
                            k3Var.F = true;
                            setOffsetY(f7);
                            k3Var.F = false;
                            k3Var.Q0 = false;
                        }
                        if (!k3Var.d0 && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                            Point point2 = AndroidUtilities.displaySize;
                            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point2.x, point2.y) * 0.8f), TLObject.FLAG_30);
                        }
                        size = View.MeasureSpec.getSize(i11);
                        if (!k3Var.d0) {
                            size = (size - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                        }
                        if (g3Var != null && g3Var.getTotalHeight() > 0) {
                            size -= g3Var.getTotalHeight();
                        }
                        super.onMeasure(i10, wl.C(24.0f, size, TLObject.FLAG_30));
                        break;
                    }
                }
                i12 = (size2 / 5) * 2;
                if (i12 < 0) {
                }
                f7 = i12;
                if (getOffsetY() != f7) {
                    k3Var.F = true;
                    setOffsetY(f7);
                    k3Var.F = false;
                    k3Var.Q0 = false;
                }
                if (!k3Var.d0) {
                    Point point22 = AndroidUtilities.displaySize;
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point22.x, point22.y) * 0.8f), TLObject.FLAG_30);
                }
                size = View.MeasureSpec.getSize(i11);
                if (!k3Var.d0) {
                }
                if (g3Var != null) {
                    size -= g3Var.getTotalHeight();
                }
                super.onMeasure(i10, wl.C(24.0f, size, TLObject.FLAG_30));
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i11) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(84.0f)) + ((r4) this.d0).N, TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.c0) {
            case 0:
                if (!((k3) this.d0).F) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // fi.q4, android.view.View
    public void setTranslationY(float f7) {
        switch (this.c0) {
            case 0:
                super.setTranslationY(f7);
                k3 k3Var = (k3) this.d0;
                BotFullscreenButtons botFullscreenButtons = k3Var.m0;
                if (botFullscreenButtons != null) {
                    botFullscreenButtons.setTranslationY(AndroidUtilities.dp(24.0f) + f7);
                }
                FrameLayout frameLayout = k3Var.p0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(k3Var.v.getTranslationY() + AndroidUtilities.lerp(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(70.0f) + k3Var.h.top, k3Var.f0));
                    break;
                }
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }
}
