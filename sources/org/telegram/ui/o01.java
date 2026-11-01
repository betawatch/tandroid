package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class o01 extends hg.b {
    public final org.telegram.messenger.cw c;
    public final String d;

    public o01(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        org.telegram.messenger.cw cwVar;
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
        org.telegram.messenger.cw cwVar2 = this.c;
        return cwVar2 == null || (cwVar = o01Var.c) == null || cwVar2.d == cwVar.d;
    }

    public o01(org.telegram.messenger.cw cwVar) {
        super(2, false);
        this.c = cwVar;
    }

    public o01(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
