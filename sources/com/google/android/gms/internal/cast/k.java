package com.google.android.gms.internal.cast;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ k(n nVar, int i10) {
        this.a = i10;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n nVar = this.b;
                n4.y yVar = nVar.e;
                if (((p4.x) yVar.b) == null) {
                    yVar.b = p4.x.d((Context) yVar.a);
                }
                p4.x xVar = (p4.x) yVar.b;
                if (xVar != null) {
                    xVar.h(nVar);
                    break;
                }
                break;
            default:
                this.b.n();
                break;
        }
    }
}
