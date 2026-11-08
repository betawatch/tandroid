package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i extends rg.a {
    public final CharSequence c;
    public final int d;

    public i(int i7, int i10, String str) {
        super(i7, false);
        this.d = i10;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.d == iVar.d && Objects.equals(this.c, iVar.c);
    }
}
