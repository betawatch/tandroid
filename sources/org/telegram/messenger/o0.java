package org.telegram.messenger;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class o0 {
    public final n0 a;

    public o0(String str, long j10, int i10) {
        switch (i10) {
            case 1:
                TimeUnit timeUnit = TimeUnit.SECONDS;
                this.a = new n0(str, j10);
                break;
            default:
                this.a = new n0(str, j10);
                break;
        }
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.a.c, TimeUnit.SECONDS);
    }
}
