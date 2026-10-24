package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class nk extends org.telegram.ui.Components.pl0 {
    public final /* synthetic */ sn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(sn snVar, nj njVar, qj qjVar) {
        super(njVar, qjVar);
        this.l = snVar;
    }

    public final void e(int i10) {
        if (this.l.cb) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.b = i10;
    }
}
