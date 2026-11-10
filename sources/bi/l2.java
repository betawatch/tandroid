package bi;

import org.telegram.messenger.u10;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
