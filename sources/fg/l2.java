package fg;

import android.graphics.RectF;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l2 {
    public float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public float f;
    public final /* synthetic */ m2 g;

    public l2(m2 m2Var) {
        this.g = m2Var;
    }

    public final void a(long j10, boolean z4) {
        m2 m2Var = this.g;
        RectF rectF = m2Var.a;
        this.e = j10 + m2Var.h + Utilities.fastRandom.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT);
        RectF rectF2 = z4 ? m2Var.b : rectF;
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
