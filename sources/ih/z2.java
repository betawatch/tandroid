package ih;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.gr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class z2 extends ImageReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(View view, View view2, int i9) {
        super(view2);
        this.a = i9;
        this.b = view;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.q5
    public void invalidate() {
        switch (this.a) {
            case 2:
                View view = ((tn) this.b).b;
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
    public boolean setImageBitmapByKey(Drawable drawable, String str, int i9, boolean z10, int i10) {
        Runnable runnable;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                i4 i4Var = (i4) obj;
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i9, z10, i10);
                if (i9 == 1 && (runnable = i4Var.e1) != null) {
                    runnable.run();
                    i4Var.e1 = null;
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) obj;
                k5Var.k();
                boolean imageBitmapByKey2 = super.setImageBitmapByKey(drawable, str, i9, z10, i10);
                if (k5Var.m && hasImageLoaded()) {
                    k5Var.m = false;
                    AndroidUtilities.runOnUIThread(new fg(k5Var, 4));
                    break;
                }
                break;
            case 4:
                boolean imageBitmapByKey3 = super.setImageBitmapByKey(drawable, str, i9, z10, i10);
                ((PhotoViewer) obj).l2();
                break;
            case 5:
                boolean imageBitmapByKey4 = super.setImageBitmapByKey(drawable, str, i9, z10, i10);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new kh.g4(this, 12));
                duration.start();
                break;
            case 6:
                if (drawable != null && i9 != 1) {
                    ll.r(((pf.w0) ((d4) obj).D).n.animate().alpha(1.0f).translationY(0.0f), gr.k, 250L);
                }
                break;
        }
        return super.setImageBitmapByKey(drawable, str, i9, z10, i10);
    }

    @Override // org.telegram.messenger.ImageReceiver
    public void setRoundRadius(int[] iArr) {
        switch (this.a) {
            case 1:
                super.setRoundRadius(iArr);
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.b;
                int[] iArr2 = t1Var.N0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int dp = AndroidUtilities.dp(6.0f);
                iArr2[3] = dp;
                iArr2[2] = dp;
                yg.g gVar = t1Var.X5;
                if (gVar != null) {
                    gVar.b.setRoundRadius(t1Var.N0);
                    break;
                }
                break;
            default:
                super.setRoundRadius(iArr);
                break;
        }
    }

    public /* synthetic */ z2(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }
}
