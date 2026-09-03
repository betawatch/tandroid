package o4;

import android.animation.ValueAnimator;
import java.net.URL;
import k7.i8;
import org.telegram.ui.Components.mr;
import ph.z8;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h0 {
    public long a;
    public int b;
    public Object c;

    public h0(int i10, URL url, long j10) {
        this.b = i10;
        this.c = url;
        this.a = j10;
    }

    public void a(vh.a aVar, z8 z8Var) {
        int i10;
        int b10 = i8.b(aVar);
        long j10 = aVar != null ? aVar.a : Long.MIN_VALUE;
        boolean z4 = j10 == this.a && this.b >= 0;
        this.a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
        if (!z4 || (i10 = this.b) == b10) {
            this.b = b10;
            z8Var.c(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
        ofInt.addUpdateListener(new wh.d(1, this, z8Var));
        ofInt.setInterpolator(mr.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
