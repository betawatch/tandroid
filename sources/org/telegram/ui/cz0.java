package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class cz0 extends rg.a {
    public final org.telegram.messenger.lv c;
    public final String d;

    public cz0(int i7) {
        super(i7, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.lv lvVar;
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
        org.telegram.messenger.lv lvVar2 = this.c;
        return lvVar2 == null || (lvVar = cz0Var.c) == null || lvVar2.d == lvVar.d;
    }

    public cz0(org.telegram.messenger.lv lvVar) {
        super(2, false);
        this.c = lvVar;
    }

    public cz0(int i7, String str) {
        super(i7, false);
        this.d = str;
        this.c = null;
    }
}
