package di;

import org.telegram.messenger.q10;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.q10
    public final Object run() {
        switch (this.a) {
            case 0:
                return ((f6) this.b).k();
            default:
                return ((org.telegram.ui.ActionBar.g2) this.b).getSimpleMenuOverlay();
        }
    }
}
