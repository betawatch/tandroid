package org.telegram.messenger;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
