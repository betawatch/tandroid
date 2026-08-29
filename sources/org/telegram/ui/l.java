package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l extends zf.a {
    public final CharSequence c;
    public final int d;

    public l(int i10, int i11, String str) {
        super(i10, false);
        this.d = i11;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.d == lVar.d && Objects.equals(this.c, lVar.c);
    }
}
