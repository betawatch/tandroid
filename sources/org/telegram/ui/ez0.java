package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ez0 extends rg.a {
    public final org.telegram.messenger.qv c;
    public final String d;

    public ez0(int i7) {
        super(i7, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.qv qvVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || ez0.class != obj.getClass()) {
            return false;
        }
        ez0 ez0Var = (ez0) obj;
        if (this.a != ez0Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, ez0Var.d);
        }
        org.telegram.messenger.qv qvVar2 = this.c;
        return qvVar2 == null || (qvVar = ez0Var.c) == null || qvVar2.d == qvVar.d;
    }

    public ez0(org.telegram.messenger.qv qvVar) {
        super(2, false);
        this.c = qvVar;
    }

    public ez0(int i7, String str) {
        super(i7, false);
        this.d = str;
        this.c = null;
    }
}
