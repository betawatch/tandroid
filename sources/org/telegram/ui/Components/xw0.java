package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class xw0 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float[] f;
    public boolean g;

    public final int a(int i7) {
        if (i7 <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        for (float f10 : this.f) {
            i10 = f10 <= i7 ? i10 + 1 : i10 + ((int) Math.ceil((r4 * 1.12f) / r5));
        }
        return Math.max(1, i10);
    }

    public final int b(int i7) {
        if (!this.g && i7 > 1 && this.f != null) {
            int i10 = this.d;
            int i11 = this.e;
            if (i10 < i11) {
                if (a(i11) > i7) {
                    return this.c + this.e;
                }
                int i12 = this.d;
                int i13 = this.e;
                while (i12 < i13) {
                    int i14 = (i12 + i13) >>> 1;
                    if (a(i14) <= i7) {
                        i13 = i14;
                    } else {
                        i12 = i14 + 1;
                    }
                }
                return this.c + i12;
            }
        }
        return this.c + this.e;
    }
}
