package org.telegram.messenger;

import org.telegram.ui.z50;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class qc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;
    public final /* synthetic */ String c;
    public final /* synthetic */ z50 d;

    public /* synthetic */ qc(bd bdVar, String str, z50 z50Var, int i3) {
        this.a = i3;
        this.b = bdVar;
        this.c = str;
        this.d = z50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.h3(new qc(this.b, this.c, this.d, 1));
                break;
            default:
                hp.e1().edit().putBoolean("langpack_patched" + this.c, true).apply();
                this.d.run();
                this.b.Q = false;
                break;
        }
    }
}
