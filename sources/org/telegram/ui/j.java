package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j extends wf.a {
    public final CharSequence c;
    public final int d;

    public j(int i9, int i10, String str) {
        super(i9, false);
        this.d = i10;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.d == jVar.d && Objects.equals(this.c, jVar.c);
    }
}
