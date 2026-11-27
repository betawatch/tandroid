// default package

import android.graphics.RectF;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class apa {
    public float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public float f;
    public final /* synthetic */ bpa g;

    public apa(bpa bpaVar) {
        this.g = bpaVar;
    }

    public final void a(long j, boolean z) {
        bpa bpaVar = this.g;
        RectF rectF = bpaVar.a;
        o3d o3dVar = Utilities.c;
        this.e = j + 2000 + o3dVar.nextInt(1000);
        RectF rectF2 = z ? bpaVar.b : rectF;
        float abs = Math.abs(((int) o3dVar.nextLong()) % rectF2.width()) + rectF2.left;
        float abs2 = Math.abs(((int) o3dVar.nextLong()) % rectF2.height()) + rectF2.top;
        this.a = abs;
        this.b = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.b - rectF.centerY());
        this.c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        o3dVar.nextInt(50);
        this.f = 0.0f;
    }
}
