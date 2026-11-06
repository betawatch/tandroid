package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b3 extends IllegalArgumentException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b3(int i7, int i10) {
        super(r0.toString());
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Unpaired surrogate at index ");
        sb2.append(i7);
        sb2.append(" of ");
        sb2.append(i10);
    }
}
