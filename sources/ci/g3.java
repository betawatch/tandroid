package ci;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.kk;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.pg;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class g3 extends ImageReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.x5
    public void invalidate() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 3:
                View view = ((tn) obj).b;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 4:
                ((org.telegram.ui.Components.r5) obj).k();
                super.invalidate();
                break;
            case 5:
            default:
                super.invalidate();
                break;
            case 6:
                super.invalidate();
                org.telegram.ui.Wallet.t7 t7Var = ((org.telegram.ui.Wallet.s7) obj).d0;
                int i11 = org.telegram.ui.Wallet.t7.G1;
                t7Var.f0();
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
                q4 q4Var = (q4) obj;
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (i10 == 1 && (runnable = q4Var.i1) != null) {
                    runnable.run();
                    q4Var.i1 = null;
                }
                return imageBitmapByKey;
            case 1:
                if (drawable != null && i10 != 1) {
                    kk.t(((ig.d1) ((k4) obj).H).n.animate().alpha(1.0f).translationY(0.0f), bs.k, 250L);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            case 2:
            case 3:
            case 6:
            default:
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            case 4:
                org.telegram.ui.Components.r5 r5Var = (org.telegram.ui.Components.r5) obj;
                r5Var.k();
                boolean imageBitmapByKey2 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (r5Var.m && hasImageLoaded()) {
                    r5Var.m = false;
                    AndroidUtilities.runOnUIThread(new pg(r5Var, 4));
                }
                return imageBitmapByKey2;
            case 5:
                boolean imageBitmapByKey3 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ((PhotoViewer) obj).m2();
                return imageBitmapByKey3;
            case 7:
                boolean imageBitmapByKey4 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new ei.i6(this, 13));
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
                rh.g gVar = u1Var.b6;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3(Object obj, View view, int i10) {
        super(view);
        this.a = i10;
        this.b = obj;
    }
}
