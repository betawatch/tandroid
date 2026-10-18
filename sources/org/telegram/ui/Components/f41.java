package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ f41(String str, int i10, Utilities.Callback2 callback2) {
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
