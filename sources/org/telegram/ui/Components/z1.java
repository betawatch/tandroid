package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.lr b;

    public /* synthetic */ z1(org.telegram.messenger.lr lrVar, int i7) {
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
