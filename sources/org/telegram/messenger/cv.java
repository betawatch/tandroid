package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class cv implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ev b;
    public final /* synthetic */ fv c;
    public final /* synthetic */ View d;

    public /* synthetic */ cv(ev evVar, View view, fv fvVar) {
        this.b = evVar;
        this.d = view;
        this.c = fvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ev evVar = this.b;
                evVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new cv(evVar, this.c, view));
                    break;
                }
                break;
            default:
                ev evVar2 = this.b;
                fv fvVar = this.c;
                if (fvVar != null) {
                    evVar2.getClass();
                    gj gjVar = fvVar.b;
                    if (gjVar != null) {
                        gjVar.N0 = true;
                    }
                    ArrayList arrayList = fvVar.n;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) obj;
                        if (u9Var instanceof ev) {
                            ((ev) u9Var).x.clear();
                        }
                    }
                } else {
                    evVar2.x.clear();
                }
                this.d.invalidate();
                break;
        }
    }

    public /* synthetic */ cv(ev evVar, fv fvVar, View view) {
        this.b = evVar;
        this.c = fvVar;
        this.d = view;
    }
}
