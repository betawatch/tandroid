package com.google.android.gms.internal.cast;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
