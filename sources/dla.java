// default package

import android.graphics.RectF;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dla {
    public float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public float f;
    public final /* synthetic */ ela g;

    public dla(ela elaVar) {
        this.g = elaVar;
    }

    public final void a(long j, boolean z) {
        ela elaVar = this.g;
        RectF rectF = elaVar.a;
        yyc yycVar = Utilities.c;
        this.e = j + 2000 + yycVar.nextInt(1000);
        RectF rectF2 = z ? elaVar.b : rectF;
        float abs = Math.abs(((int) yycVar.nextLong()) % rectF2.width()) + rectF2.left;
        float abs2 = Math.abs(((int) yycVar.nextLong()) % rectF2.height()) + rectF2.top;
        this.a = abs;
        this.b = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.b - rectF.centerY());
        this.c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        yycVar.nextInt(50);
        this.f = 0.0f;
    }
}
