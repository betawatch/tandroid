package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class bv implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ dv b;
    public final /* synthetic */ ev c;
    public final /* synthetic */ View d;

    public /* synthetic */ bv(dv dvVar, View view, ev evVar) {
        this.b = dvVar;
        this.d = view;
        this.c = evVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dv dvVar = this.b;
                dvVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new bv(dvVar, this.c, view));
                    break;
                }
                break;
            default:
                dv dvVar2 = this.b;
                ev evVar = this.c;
                if (evVar != null) {
                    dvVar2.getClass();
                    fj fjVar = evVar.b;
                    if (fjVar != null) {
                        fjVar.N0 = true;
                    }
                    ArrayList arrayList = evVar.n;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) obj;
                        if (u9Var instanceof dv) {
                            ((dv) u9Var).x.clear();
                        }
                    }
                } else {
                    dvVar2.x.clear();
                }
                this.d.invalidate();
                break;
        }
    }

    public /* synthetic */ bv(dv dvVar, ev evVar, View view) {
        this.b = dvVar;
        this.c = evVar;
        this.d = view;
    }
}
