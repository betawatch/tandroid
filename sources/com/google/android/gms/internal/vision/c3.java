package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class c3 extends IllegalArgumentException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c3(int i7, int i10) {
        super(r0.toString());
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Unpaired surrogate at index ");
        sb2.append(i7);
        sb2.append(" of ");
        sb2.append(i10);
    }
}
