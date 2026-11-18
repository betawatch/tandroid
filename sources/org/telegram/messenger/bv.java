package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
