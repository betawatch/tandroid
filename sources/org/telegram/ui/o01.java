package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o01 extends hg.b {
    public final org.telegram.messenger.bw c;
    public final String d;

    public o01(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.bw bwVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || o01.class != obj.getClass()) {
            return false;
        }
        o01 o01Var = (o01) obj;
        if (this.a != o01Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, o01Var.d);
        }
        org.telegram.messenger.bw bwVar2 = this.c;
        return bwVar2 == null || (bwVar = o01Var.c) == null || bwVar2.d == bwVar.d;
    }

    public o01(org.telegram.messenger.bw bwVar) {
        super(2, false);
        this.c = bwVar;
    }

    public o01(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
