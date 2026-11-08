package com.google.android.gms.internal.cast;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ j(m mVar, int i7) {
        this.a = i7;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m mVar = this.b;
                q4.q qVar = mVar.e;
                if (((s4.x) qVar.c) == null) {
                    qVar.c = s4.x.d((Context) qVar.b);
                }
                s4.x xVar = (s4.x) qVar.c;
                if (xVar != null) {
                    xVar.h(mVar);
                    break;
                }
                break;
            default:
                this.b.n();
                break;
        }
    }
}
