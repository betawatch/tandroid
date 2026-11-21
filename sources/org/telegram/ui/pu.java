package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pu implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ cx b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ pu(cx cxVar, int i7, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.b = cxVar;
        this.c = i7;
        this.d = arrayList;
        this.e = z10;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.K4(this.d, this.c, false, this.e, this.f);
                break;
            default:
                cx.K0(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ pu(cx cxVar, ArrayList arrayList, int i7, boolean z10, HashSet hashSet) {
        this.b = cxVar;
        this.d = arrayList;
        this.c = i7;
        this.e = z10;
        this.f = hashSet;
    }
}
