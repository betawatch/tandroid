package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ t41(String str, int i10, Utilities.Callback2 callback2) {
        this.a = i10;
        this.b = callback2;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.Callback2 callback2 = this.b;
                if (callback2 != null) {
                    callback2.run(this.c, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                this.b.run(null, this.c);
                break;
            default:
                this.b.run(null, this.c);
                break;
        }
    }
}
