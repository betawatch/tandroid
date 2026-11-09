package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class dz0 extends rg.a {
    public final org.telegram.messenger.qv c;
    public final String d;

    public dz0(int i7) {
        super(i7, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.qv qvVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || dz0.class != obj.getClass()) {
            return false;
        }
        dz0 dz0Var = (dz0) obj;
        if (this.a != dz0Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, dz0Var.d);
        }
        org.telegram.messenger.qv qvVar2 = this.c;
        return qvVar2 == null || (qvVar = dz0Var.c) == null || qvVar2.d == qvVar.d;
    }

    public dz0(org.telegram.messenger.qv qvVar) {
        super(2, false);
        this.c = qvVar;
    }

    public dz0(int i7, String str) {
        super(i7, false);
        this.d = str;
        this.c = null;
    }
}
