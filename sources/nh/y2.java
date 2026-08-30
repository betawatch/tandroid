package nh;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.nr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ao;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class y2 extends ImageReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2(View view, View view2, int i10) {
        super(view2);
        this.a = i10;
        this.b = view;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.r5
    public void invalidate() {
        switch (this.a) {
            case 2:
                View view = ((ao) this.b).b;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 3:
                ((org.telegram.ui.Components.l5) this.b).k();
                super.invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver
    public boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        Runnable runnable;
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                d4 d4Var = (d4) obj;
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z4, i11);
                if (i10 == 1 && (runnable = d4Var.f1) != null) {
                    runnable.run();
                    d4Var.f1 = null;
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) obj;
                l5Var.k();
                boolean imageBitmapByKey2 = super.setImageBitmapByKey(drawable, str, i10, z4, i11);
                if (l5Var.m && hasImageLoaded()) {
                    l5Var.m = false;
                    AndroidUtilities.runOnUIThread(new fg(l5Var, 4));
                    break;
                }
                break;
            case 4:
                boolean imageBitmapByKey3 = super.setImageBitmapByKey(drawable, str, i10, z4, i11);
                ((PhotoViewer) obj).l2();
                break;
            case 5:
                boolean imageBitmapByKey4 = super.setImageBitmapByKey(drawable, str, i10, z4, i11);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new e5(this, 9));
                duration.start();
                break;
            case 6:
                if (drawable != null && i10 != 1) {
                    org.telegram.ui.b.p(((uf.u0) ((y3) obj).E).n.animate().alpha(1.0f).translationY(0.0f), nr.k, 250L);
                }
                break;
        }
        return super.setImageBitmapByKey(drawable, str, i10, z4, i11);
    }

    @Override // org.telegram.messenger.ImageReceiver
    public void setRoundRadius(int[] iArr) {
        switch (this.a) {
            case 1:
                super.setRoundRadius(iArr);
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.b;
                int[] iArr2 = t1Var.O0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int dp = AndroidUtilities.dp(6.0f);
                iArr2[3] = dp;
                iArr2[2] = dp;
                dh.j jVar = t1Var.Y5;
                if (jVar != null) {
                    jVar.b.setRoundRadius(t1Var.O0);
                    break;
                }
                break;
            default:
                super.setRoundRadius(iArr);
                break;
        }
    }

    public /* synthetic */ y2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
