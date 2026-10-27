package k5;

import a8.zd;
import android.animation.ValueAnimator;
import bh.b0;
import java.net.URL;
import jg.e1;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b {
    public long a;
    public int b;
    public Object c;

    public b(int i10, URL url, long j10) {
        this.b = i10;
        this.c = url;
        this.a = j10;
    }

    public void a(li.a aVar, e1 e1Var) {
        int i10;
        int b10 = zd.b(aVar);
        long j10 = aVar != null ? aVar.a : Long.MIN_VALUE;
        boolean z10 = j10 == this.a && this.b >= 0;
        this.a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
        if (!z10 || (i10 = this.b) == b10) {
            this.b = b10;
            e1Var.i(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
        ofInt.addUpdateListener(new b0(8, this, e1Var));
        ofInt.setInterpolator(ds.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
