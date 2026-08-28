package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ik extends c2.y {
    public final /* synthetic */ qn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(qn qnVar, ij ijVar, lj ljVar) {
        super(ijVar, ljVar);
        this.l = qnVar;
    }

    public final void d(int i9) {
        if (this.l.La) {
            if (i9 == 0) {
                i9 = 1;
            } else if (i9 == 1) {
                i9 = 0;
            }
        }
        this.b = i9;
    }
}
