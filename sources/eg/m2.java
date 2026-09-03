package eg;

import android.graphics.RectF;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m2 {
    public float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public float f;
    public final /* synthetic */ n2 g;

    public m2(n2 n2Var) {
        this.g = n2Var;
    }

    public final void a(long j10, boolean z4) {
        n2 n2Var = this.g;
        RectF rectF = n2Var.a;
        this.e = j10 + n2Var.h + Utilities.fastRandom.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT);
        RectF rectF2 = z4 ? n2Var.b : rectF;
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF2.width()) + rectF2.left;
        float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF2.height()) + rectF2.top;
        this.a = abs;
        this.b = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.b - rectF.centerY());
        this.c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f = 0.0f;
    }
}
