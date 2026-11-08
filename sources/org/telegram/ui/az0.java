package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class az0 extends rg.a {
    public final org.telegram.messenger.qv c;
    public final String d;

    public az0(int i7) {
        super(i7, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.qv qvVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || az0.class != obj.getClass()) {
            return false;
        }
        az0 az0Var = (az0) obj;
        if (this.a != az0Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, az0Var.d);
        }
        org.telegram.messenger.qv qvVar2 = this.c;
        return qvVar2 == null || (qvVar = az0Var.c) == null || qvVar2.d == qvVar.d;
    }

    public az0(org.telegram.messenger.qv qvVar) {
        super(2, false);
        this.c = qvVar;
    }

    public az0(int i7, String str) {
        super(i7, false);
        this.d = str;
        this.c = null;
    }
}
