package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ qj(rj rjVar, String str, int i7, int i10) {
        this.a = i10;
        this.b = rjVar;
        this.c = str;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rj rjVar = this.b;
                String str = this.c;
                int i7 = this.d;
                rjVar.getClass();
                org.telegram.messenger.g0.g3(new qj(rjVar, str, i7, 1));
                break;
            default:
                rj rjVar2 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                rjVar2.getClass();
                int i11 = org.telegram.messenger.j10.t0;
                Utilities.g.c(new bi.t3(rjVar2, str2, new ArrayList(org.telegram.messenger.i5.r(i11).Z.values()), new ArrayList(org.telegram.messenger.i5.r(i11).f0), i11, i10));
                break;
        }
    }
}
