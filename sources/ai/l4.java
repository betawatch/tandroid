package ai;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ok;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.rr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class l4 extends ImageReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(View view, View view2, int i10) {
        super(view2);
        this.a = i10;
        this.b = view;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.w5
    public void invalidate() {
        switch (this.a) {
            case 3:
                View view = ((zn) this.b).b;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 4:
                ((org.telegram.ui.Components.q5) this.b).k();
                super.invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver
    public boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        Runnable runnable;
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                e6 e6Var = (e6) obj;
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (i10 == 1 && (runnable = e6Var.i1) != null) {
                    runnable.run();
                    e6Var.i1 = null;
                }
                return imageBitmapByKey;
            case 1:
                if (drawable != null && i10 != 1) {
                    ok.s(((hg.f1) ((y5) obj).H).n.animate().alpha(1.0f).translationY(0.0f), rr.k, 250L);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            case 2:
            case 3:
            default:
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            case 4:
                org.telegram.ui.Components.q5 q5Var = (org.telegram.ui.Components.q5) obj;
                q5Var.k();
                boolean imageBitmapByKey2 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (q5Var.m && hasImageLoaded()) {
                    q5Var.m = false;
                    AndroidUtilities.runOnUIThread(new pg(q5Var, 4));
                }
                return imageBitmapByKey2;
            case 5:
                boolean imageBitmapByKey3 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ((PhotoViewer) obj).l2();
                return imageBitmapByKey3;
            case 6:
                boolean imageBitmapByKey4 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 5));
                duration.start();
                return imageBitmapByKey4;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver
    public void setRoundRadius(int[] iArr) {
        switch (this.a) {
            case 2:
                super.setRoundRadius(iArr);
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.b;
                int[] iArr2 = u1Var.R0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int dp = AndroidUtilities.dp(6.0f);
                iArr2[3] = dp;
                iArr2[2] = dp;
                qh.g gVar = u1Var.b6;
                if (gVar != null) {
                    gVar.b.setRoundRadius(u1Var.R0);
                    break;
                }
                break;
            default:
                super.setRoundRadius(iArr);
                break;
        }
    }

    public /* synthetic */ l4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
