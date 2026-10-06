package n2;

import android.os.Handler;
import e2.d0;
import i2.h0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class e implements m {
    public final k a;
    public h b;
    public boolean c;
    public final /* synthetic */ f d;

    public e(f fVar, k kVar) {
        this.d = fVar;
        this.a = kVar;
    }

    @Override // n2.m
    public final void release() {
        Handler handler = this.d.J;
        handler.getClass();
        d0.U(handler, new h0(this, 13));
    }
}
