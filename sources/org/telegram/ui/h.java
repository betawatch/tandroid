package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h extends hg.b {
    public final CharSequence c;
    public final int d;

    public h(int i10, int i11, String str) {
        super(i10, false);
        this.d = i11;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.d == hVar.d && Objects.equals(this.c, hVar.c);
    }
}
