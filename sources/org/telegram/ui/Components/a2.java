package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.lr b;

    public /* synthetic */ a2(org.telegram.messenger.lr lrVar, int i7) {
        this.a = i7;
        this.b = lrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.lr lrVar = this.b;
                if (lrVar != null) {
                    lrVar.d(false);
                    break;
                }
                break;
            default:
                org.telegram.messenger.lr lrVar2 = this.b;
                if (lrVar2 != null) {
                    lrVar2.d(false);
                    break;
                }
                break;
        }
    }
}
