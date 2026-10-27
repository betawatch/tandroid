package jh;

import android.graphics.RectF;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class d {
    public final int a;
    public final long b;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public final RectF c = new RectF();
    public float j = 0.0f;
    public float k = 0.0f;
    public float l = Float.MAX_VALUE;
    public float m = 0.0f;
    public final long d = Utilities.random.nextLong();

    public d(int i10, long j10) {
        this.a = i10;
        this.b = j10;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f7 = this.k;
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = f7 == 0.0f ? MediaDataController.MAX_STYLE_RUNS_COUNT : Math.round((this.j / f7) * 1000.0f);
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f7 = this.j;
        if (f7 == 0.0f) {
            return 0;
        }
        float f10 = this.l;
        float f11 = this.m;
        if (f10 > f11) {
            return 0;
        }
        return Math.round(((f11 - f10) / f7) * 1000.0f);
    }
}
