package gg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.em;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.wr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ho;
import zh.a3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h1 extends ImageReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(View view, View view2, int i10) {
        super(view2);
        this.a = i10;
        this.b = view;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.v5
    public void invalidate() {
        switch (this.a) {
            case 2:
                View view = ((ho) this.b).b;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 3:
                ((p5) this.b).k();
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
                if (drawable != null && i10 != 1) {
                    em.q(((k1) ((i1) obj).H).n.animate().alpha(1.0f).translationY(0.0f), wr.k, 250L);
                }
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            case 1:
            case 2:
            default:
                return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
            case 3:
                p5 p5Var = (p5) obj;
                p5Var.k();
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (p5Var.m && hasImageLoaded()) {
                    p5Var.m = false;
                    AndroidUtilities.runOnUIThread(new rg(p5Var, 4));
                }
                return imageBitmapByKey;
            case 4:
                boolean imageBitmapByKey2 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ((PhotoViewer) obj).l2();
                return imageBitmapByKey2;
            case 5:
                boolean imageBitmapByKey3 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new ai.a(this, 21));
                duration.start();
                return imageBitmapByKey3;
            case 6:
                a3 a3Var = (a3) obj;
                boolean imageBitmapByKey4 = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
                if (i10 == 1 && (runnable = a3Var.i1) != null) {
                    runnable.run();
                    a3Var.i1 = null;
                }
                return imageBitmapByKey4;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver
    public void setRoundRadius(int[] iArr) {
        switch (this.a) {
            case 1:
                super.setRoundRadius(iArr);
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.b;
                int[] iArr2 = t1Var.R0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int dp = AndroidUtilities.dp(6.0f);
                iArr2[3] = dp;
                iArr2[2] = dp;
                ph.g gVar = t1Var.b6;
                if (gVar != null) {
                    gVar.b.setRoundRadius(t1Var.R0);
                    break;
                }
                break;
            default:
                super.setRoundRadius(iArr);
                break;
        }
    }

    public /* synthetic */ h1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
