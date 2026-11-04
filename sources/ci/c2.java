package ci;

import org.telegram.messenger.m10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements m10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c2(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.messenger.m10
    public final Object run() {
        switch (this.a) {
            case 0:
                return ((l6) this.b).k();
            default:
                return ((org.telegram.ui.ActionBar.d2) this.b).getSimpleMenuOverlay();
        }
    }
}
