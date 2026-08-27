package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kk extends c2.x {
    public final /* synthetic */ rn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(rn rnVar, kj kjVar, nj njVar) {
        super(kjVar, njVar);
        this.l = rnVar;
    }

    public final void e(int i10) {
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
