package kg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c2 {
    public float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public float f;
    public final /* synthetic */ d2 g;

    public c2(d2 d2Var) {
        this.g = d2Var;
    }

    public final void a(long j10, boolean z10) {
        d2 d2Var = this.g;
        RectF rectF = d2Var.a;
        long j11 = j10 + d2Var.h;
        d5.a aVar = Utilities.c;
        this.e = j11 + aVar.nextInt(1000);
        RectF rectF2 = z10 ? d2Var.b : rectF;
        float abs = Math.abs(((int) aVar.nextLong()) % rectF2.width()) + rectF2.left;
        float abs2 = Math.abs(((int) aVar.nextLong()) % rectF2.height()) + rectF2.top;
        this.a = abs;
        this.b = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.b - rectF.centerY());
        this.c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        aVar.nextInt(50);
        this.f = 0.0f;
    }
}
