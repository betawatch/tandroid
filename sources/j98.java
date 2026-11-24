// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class j98 extends ImageView {
    public static final /* synthetic */ int r = 0;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public lbc e;
    public final s33 f;
    public ValueAnimator h;
    public final /* synthetic */ PhotoViewer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j98(Context context, PhotoViewer photoViewer) {
        super(context);
        this.n = photoViewer;
        this.a = 0;
        this.b = false;
        this.c = false;
        this.d = false;
        this.f = s33.i;
        setAlpha(0.0f);
    }

    public final void a() {
        PhotoViewer photoViewer = this.n;
        lbc lbcVar = photoViewer.G2;
        if (lbcVar == null || lbcVar.U() == -9223372036854775807L) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
            }
            setAlpha(0.0f);
            return;
        }
        long max = Math.max(0L, photoViewer.G2.U() - photoViewer.G2.S());
        float max2 = 1.0f - Math.max(Math.min(max / 250.0f, 1.0f), 0.0f);
        if (max2 <= 0.0f) {
            ValueAnimator valueAnimator2 = this.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.h = null;
            }
            setAlpha(0.0f);
            return;
        }
        boolean c0 = photoViewer.G2.c0();
        ValueAnimator valueAnimator3 = this.h;
        if (!c0) {
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                this.h = null;
            }
            setAlpha(max2);
            return;
        }
        if (valueAnimator3 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new u28(this, (byte) 5));
            this.h.setDuration(max);
            this.h.setInterpolator(this.f);
            this.h.start();
            setAlpha(max2);
        }
    }
}
