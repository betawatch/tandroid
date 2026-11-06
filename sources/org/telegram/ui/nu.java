package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nu implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ww b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ nu(ww wwVar, int i7, ArrayList arrayList, boolean z9, HashSet hashSet) {
        this.b = wwVar;
        this.c = i7;
        this.d = arrayList;
        this.e = z9;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.D4(this.d, this.c, false, this.e, this.f);
                break;
            default:
                ww.r0(this.b, this.c, this.d, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ nu(ww wwVar, ArrayList arrayList, int i7, boolean z9, HashSet hashSet) {
        this.b = wwVar;
        this.d = arrayList;
        this.c = i7;
        this.e = z9;
        this.f = hashSet;
    }
}
