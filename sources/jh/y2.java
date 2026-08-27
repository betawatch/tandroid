package jh;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.er;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.un;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.q5
    public void invalidate() {
        switch (this.a) {
            case 2:
                View view = ((un) this.b).b;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 3:
                ((org.telegram.ui.Components.k5) this.b).k();
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
                e4 e4Var = (e4) obj;
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (i10 == 1 && (runnable = e4Var.e1) != null) {
                    runnable.run();
                    e4Var.e1 = null;
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) obj;
                k5Var.k();
                boolean imageBitmapByKey2 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (k5Var.m && hasImageLoaded()) {
                    k5Var.m = false;
                    AndroidUtilities.runOnUIThread(new bg(k5Var, 4));
                    break;
                }
                break;
            case 4:
                boolean imageBitmapByKey3 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ((PhotoViewer) obj).l2();
                break;
            case 5:
                boolean imageBitmapByKey4 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new lh.m2(this, 15));
                duration.start();
                break;
            case 6:
                if (drawable != null && i10 != 1) {
                    rl.o(((qf.w0) ((z3) obj).D).n.animate().alpha(1.0f).translationY(0.0f), er.k, 250L);
                }
                break;
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }

    @Override // org.telegram.messenger.ImageReceiver
    public void setRoundRadius(int[] iArr) {
        switch (this.a) {
            case 1:
                super.setRoundRadius(iArr);
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.b;
                int[] iArr2 = s1Var.N0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int dp = AndroidUtilities.dp(6.0f);
                iArr2[3] = dp;
                iArr2[2] = dp;
                zg.g gVar = s1Var.X5;
                if (gVar != null) {
                    gVar.b.setRoundRadius(s1Var.N0);
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
