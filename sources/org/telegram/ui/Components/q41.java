package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ q41(String str, int i10, Utilities.Callback2 callback2) {
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
