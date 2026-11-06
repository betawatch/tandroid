package bi;

import org.telegram.messenger.u10;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.u10
    public final Object run() {
        switch (this.a) {
            case 0:
                return ((k7) this.b).k();
            default:
                return ((org.telegram.ui.ActionBar.f2) this.b).getSimpleMenuOverlay();
        }
    }
}
