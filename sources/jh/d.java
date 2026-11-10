package jh;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
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
    public final long d = Utilities.b.nextLong();

    public d(int i7, long j3) {
        this.a = i7;
        this.b = j3;
    }

    public final TLRPC.TL_inputMessageReadMetric a() {
        TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
        tL_inputMessageReadMetric.msg_id = this.a;
        tL_inputMessageReadMetric.view_id = this.d;
        tL_inputMessageReadMetric.time_in_view_ms = (int) this.g;
        tL_inputMessageReadMetric.active_time_in_view_ms = (int) this.h;
        float f10 = this.k;
        tL_inputMessageReadMetric.height_to_viewport_ratio_permille = f10 == 0.0f ? 1000 : Math.round((this.j / f10) * 1000.0f);
        tL_inputMessageReadMetric.seen_range_ratio_permille = b();
        return tL_inputMessageReadMetric;
    }

    public final int b() {
        float f10 = this.j;
        if (f10 == 0.0f) {
            return 0;
        }
        float f11 = this.l;
        float f12 = this.m;
        if (f11 > f12) {
            return 0;
        }
        return Math.round(((f12 - f11) / f10) * 1000.0f);
    }
}
