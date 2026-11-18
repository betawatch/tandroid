package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c3 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ c3(int i7, int[] iArr, org.telegram.ui.o60 o60Var) {
        this.b = i7;
        this.c = iArr;
        this.d = o60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Runnable runnable = this.d;
        int[] iArr = this.c;
        int i10 = this.b;
        switch (i7) {
            case 0:
                iArr[0] = i10;
                runnable.run();
                break;
            default:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c3(int[] iArr, int i7, Runnable runnable) {
        this.c = iArr;
        this.b = i7;
        this.d = runnable;
    }
}
