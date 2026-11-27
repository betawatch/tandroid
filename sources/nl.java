// default package

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class nl extends ImageReceiver {
    public final /* synthetic */ byte K1;
    public final /* synthetic */ Object L1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nl(Object obj, byte b) {
        super(null);
        this.K1 = b;
        this.L1 = obj;
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        Runnable runnable;
        byte b = this.K1;
        Object obj = this.L1;
        switch (b) {
            case 0:
                wl wlVar = (wl) obj;
                wlVar.j();
                boolean h0 = super.h0(drawable, str, i, z, i2);
                if (wlVar.m && C()) {
                    wlVar.m = false;
                    hl.c3(new c1(wlVar, (byte) 13));
                }
                return h0;
            case 1:
                boolean h02 = super.h0(drawable, str, i, z, i2);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new g0(this, (byte) 19));
                duration.start();
                return h02;
            case 2:
            case 3:
            default:
                return super.h0(drawable, str, i, z, i2);
            case 4:
                if (drawable != null && i != 1) {
                    ik8.t(((tc6) ((mb0) obj).I).h.animate().alpha(1.0f).translationY(0.0f), k43.k, 250L);
                }
                return super.h0(drawable, str, i, z, i2);
            case 5:
                o68 o68Var = (o68) obj;
                boolean h03 = super.h0(drawable, str, i, z, i2);
                if (i == 1 && (runnable = o68Var.S0) != null) {
                    runnable.run();
                    o68Var.S0 = null;
                }
                return h03;
            case 6:
                boolean h04 = super.h0(drawable, str, i, z, i2);
                ((PhotoViewer) obj).u1();
                return h04;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver, em
    public final void invalidate() {
        byte b = this.K1;
        Object obj = this.L1;
        switch (b) {
            case 0:
                ((wl) obj).j();
                super.invalidate();
                break;
            case 2:
                View view = ((g82) obj).b;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 7:
                super.invalidate();
                wsc wscVar = ((vsc) obj).d0;
                int i = wsc.J1;
                wscVar.f0();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final void s0(int[] iArr) {
        mh8 mh8Var;
        switch (this.K1) {
            case 3:
                super.s0(iArr);
                wb2 wb2Var = (wb2) this.L1;
                int[] iArr2 = wb2Var.T0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int L = hl.L(6.0f);
                iArr2[3] = L;
                iArr2[2] = L;
                cc2 cc2Var = wb2Var.x2;
                if (cc2Var != null && (mh8Var = cc2Var.m) != null) {
                    mh8Var.b.s0(iArr2);
                    break;
                }
                break;
            default:
                super.s0(iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nl(Object obj, View view, byte b) {
        super(view);
        this.K1 = b;
        this.L1 = obj;
    }
}
