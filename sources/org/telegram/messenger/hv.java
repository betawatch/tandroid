package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class hv implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ jv b;
    public final /* synthetic */ kv c;
    public final /* synthetic */ View d;

    public /* synthetic */ hv(jv jvVar, View view, kv kvVar) {
        this.b = jvVar;
        this.d = view;
        this.c = kvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jv jvVar = this.b;
                jvVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new hv(jvVar, this.c, view));
                    break;
                }
                break;
            default:
                jv jvVar2 = this.b;
                kv kvVar = this.c;
                if (kvVar != null) {
                    jvVar2.getClass();
                    ij ijVar = kvVar.b;
                    if (ijVar != null) {
                        ijVar.L0 = true;
                    }
                    ArrayList arrayList = kvVar.n;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) obj;
                        if (t9Var instanceof jv) {
                            ((jv) t9Var).x.clear();
                        }
                    }
                } else {
                    jvVar2.x.clear();
                }
                this.d.invalidate();
                break;
        }
    }

    public /* synthetic */ hv(jv jvVar, kv kvVar, View view) {
        this.b = jvVar;
        this.c = kvVar;
        this.d = view;
    }
}
