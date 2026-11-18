package di;

import org.telegram.messenger.p10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.p10
    public final Object run() {
        switch (this.a) {
            case 0:
                return ((f6) this.b).k();
            default:
                return ((org.telegram.ui.ActionBar.h2) this.b).getSimpleMenuOverlay();
        }
    }
}
