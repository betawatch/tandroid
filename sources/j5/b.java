package j5;

import ah.m0;
import android.animation.ValueAnimator;
import fi.f;
import java.net.URL;
import org.telegram.ui.Components.pr;
import v7.c9;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b {
    public long a;
    public int b;
    public Object c;

    public b(int i10, URL url, long j3) {
        this.b = i10;
        this.c = url;
        this.a = j3;
    }

    public void a(ji.a aVar, f fVar) {
        int i10;
        int b10 = c9.b(aVar);
        long j3 = aVar != null ? aVar.a : Long.MIN_VALUE;
        boolean z10 = j3 == this.a && this.b >= 0;
        this.a = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
        if (!z10 || (i10 = this.b) == b10) {
            this.b = b10;
            fVar.c(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
        ofInt.addUpdateListener(new m0(7, this, fVar));
        ofInt.setInterpolator(pr.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
