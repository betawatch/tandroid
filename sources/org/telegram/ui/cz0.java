package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class cz0 extends rg.a {
    public final org.telegram.messenger.kv c;
    public final String d;

    public cz0(int i7) {
        super(i7, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.kv kvVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || cz0.class != obj.getClass()) {
            return false;
        }
        cz0 cz0Var = (cz0) obj;
        if (this.a != cz0Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, cz0Var.d);
        }
        org.telegram.messenger.kv kvVar2 = this.c;
        return kvVar2 == null || (kvVar = cz0Var.c) == null || kvVar2.d == kvVar.d;
    }

    public cz0(org.telegram.messenger.kv kvVar) {
        super(2, false);
        this.c = kvVar;
    }

    public cz0(int i7, String str) {
        super(i7, false);
        this.d = str;
        this.c = null;
    }
}
