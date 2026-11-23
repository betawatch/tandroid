package di;

import org.telegram.messenger.o10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements o10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.o10
    public final Object run() {
        switch (this.a) {
            case 0:
                return ((f6) this.b).k();
            default:
                return ((org.telegram.ui.ActionBar.g2) this.b).getSimpleMenuOverlay();
        }
    }
}
