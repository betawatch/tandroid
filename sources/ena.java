// default package

import android.graphics.RectF;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ena {
    public float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public float f;
    public final /* synthetic */ fna g;

    public ena(fna fnaVar) {
        this.g = fnaVar;
    }

    public final void a(long j, boolean z) {
        fna fnaVar = this.g;
        RectF rectF = fnaVar.a;
        z0d z0dVar = Utilities.c;
        this.e = j + 2000 + z0dVar.nextInt(1000);
        RectF rectF2 = z ? fnaVar.b : rectF;
        float abs = Math.abs(((int) z0dVar.nextLong()) % rectF2.width()) + rectF2.left;
        float abs2 = Math.abs(((int) z0dVar.nextLong()) % rectF2.height()) + rectF2.top;
        this.a = abs;
        this.b = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.b - rectF.centerY());
        this.c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        z0dVar.nextInt(50);
        this.f = 0.0f;
    }
}
