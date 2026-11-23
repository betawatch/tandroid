package m5;

import android.animation.ValueAnimator;
import c8.fa;
import ch.w;
import java.net.URL;
import kg.f1;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class b {
    public long a;
    public int b;
    public Object c;

    public b(int i7, URL url, long j3) {
        this.b = i7;
        this.c = url;
        this.a = j3;
    }

    public void a(oi.a aVar, f1 f1Var) {
        int i7;
        int b10 = fa.b(aVar);
        long j3 = aVar != null ? aVar.a : Long.MIN_VALUE;
        boolean z10 = j3 == this.a && this.b >= 0;
        this.a = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
        if (!z10 || (i7 = this.b) == b10) {
            this.b = b10;
            f1Var.c(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i7, b10);
        ofInt.addUpdateListener(new w(8, this, f1Var));
        ofInt.setInterpolator(kr.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
