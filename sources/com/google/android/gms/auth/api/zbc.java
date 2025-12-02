package com.google.android.gms.auth.api;

/* loaded from: classes.dex */
public final class zbc {
    protected Boolean zba;
    protected String zbb;

    public zbc() {
        this.zba = Boolean.FALSE;
    }

    public final zbc zba(String str) {
        this.zbb = str;
        return this;
    }

    public zbc(zbd zbdVar) {
        boolean z;
        String str;
        this.zba = Boolean.FALSE;
        zbd.zbb(zbdVar);
        z = zbdVar.zbc;
        this.zba = Boolean.valueOf(z);
        str = zbdVar.zbd;
        this.zbb = str;
    }
}
