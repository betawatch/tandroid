package ag;

import android.os.Bundle;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ a(b bVar, String str, Bundle bundle, int i3) {
        this.a = i3;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b.getClass();
                break;
            case 1:
                this.b.b.getClass();
                break;
            case 2:
                this.b.b.getClass();
                break;
            default:
                this.b.b.getClass();
                break;
        }
    }

    public a(b bVar, int i3, Bundle bundle) {
        this.a = 0;
        this.b = bVar;
    }

    public a(b bVar, Bundle bundle) {
        this.a = 2;
        this.b = bVar;
    }
}
