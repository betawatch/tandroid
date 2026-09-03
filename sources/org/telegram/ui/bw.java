package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bw implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ py b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ HashSet f;

    public /* synthetic */ bw(py pyVar, int i10, ArrayList arrayList, boolean z4, HashSet hashSet) {
        this.b = pyVar;
        this.d = i10;
        this.c = arrayList;
        this.e = z4;
        this.f = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                py.o0(this.b, this.d, this.c, this.e, this.f);
                break;
            default:
                this.b.r4(this.c, this.d, false, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ bw(py pyVar, ArrayList arrayList, int i10, boolean z4, HashSet hashSet) {
        this.b = pyVar;
        this.c = arrayList;
        this.d = i10;
        this.e = z4;
        this.f = hashSet;
    }
}
