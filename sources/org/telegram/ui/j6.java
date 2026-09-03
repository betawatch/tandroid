package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7 b;
    public final /* synthetic */ r6 c;
    public final /* synthetic */ s6 d;

    public /* synthetic */ j6(d7 d7Var, r6 r6Var, s6 s6Var, int i10) {
        this.a = i10;
        this.b = d7Var;
        this.c = r6Var;
        this.d = s6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.globalQueue.postRunnable(new j6(this.b, this.c, this.d, 1));
                break;
            default:
                d7.W(this.b, this.c, this.d);
                break;
        }
    }
}
