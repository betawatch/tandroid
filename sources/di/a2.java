package di;

import org.telegram.messenger.p10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                return ((org.telegram.ui.ActionBar.g2) this.b).getSimpleMenuOverlay();
        }
    }
}
