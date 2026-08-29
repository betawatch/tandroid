package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lk extends c2.z {
    public final /* synthetic */ tn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(tn tnVar, lj ljVar, oj ojVar) {
        super(ljVar, ojVar);
        this.l = tnVar;
    }

    public final void d(int i10) {
        if (this.l.La) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.b = i10;
    }
}
