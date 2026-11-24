// default package

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ml extends ImageReceiver {
    public final /* synthetic */ byte K1;
    public final /* synthetic */ Object L1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ml(Object obj, byte b) {
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
                vl vlVar = (vl) obj;
                vlVar.j();
                boolean h0 = super.h0(drawable, str, i, z, i2);
                if (vlVar.m && C()) {
                    vlVar.m = false;
                    gl.c3(new b1(vlVar, (byte) 13));
                }
                return h0;
            case 1:
                boolean h02 = super.h0(drawable, str, i, z, i2);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.addUpdateListener(new f0(this, (byte) 18));
                duration.start();
                return h02;
            case 2:
            case 3:
            default:
                return super.h0(drawable, str, i, z, i2);
            case 4:
                if (drawable != null && i != 1) {
                    ug8.t(((pa6) ((kb0) obj).I).h.animate().alpha(1.0f).translationY(0.0f), s33.k, 250L);
                }
                return super.h0(drawable, str, i, z, i2);
            case 5:
                y28 y28Var = (y28) obj;
                boolean h03 = super.h0(drawable, str, i, z, i2);
                if (i == 1 && (runnable = y28Var.Y0) != null) {
                    runnable.run();
                    y28Var.Y0 = null;
                }
                return h03;
            case 6:
                boolean h04 = super.h0(drawable, str, i, z, i2);
                ((PhotoViewer) obj).u1();
                return h04;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver, dm
    public final void invalidate() {
        byte b = this.K1;
        Object obj = this.L1;
        switch (b) {
            case 0:
                ((vl) obj).j();
                super.invalidate();
                break;
            case 2:
                View view = ((p72) obj).b;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 7:
                super.invalidate();
                koc kocVar = ((joc) obj).d0;
                int i = koc.J1;
                kocVar.f0();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver
    public final void s0(int[] iArr) {
        yd8 yd8Var;
        switch (this.K1) {
            case 3:
                super.s0(iArr);
                gb2 gb2Var = (gb2) this.L1;
                int[] iArr2 = gb2Var.T0;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                int L = gl.L(6.0f);
                iArr2[3] = L;
                iArr2[2] = L;
                mb2 mb2Var = gb2Var.x2;
                if (mb2Var != null && (yd8Var = mb2Var.m) != null) {
                    yd8Var.b.s0(iArr2);
                    break;
                }
                break;
            default:
                super.s0(iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ml(Object obj, View view, byte b) {
        super(view);
        this.K1 = b;
        this.L1 = obj;
    }
}
