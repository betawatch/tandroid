package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class fv implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ hv b;
    public final /* synthetic */ iv c;
    public final /* synthetic */ View d;

    public /* synthetic */ fv(hv hvVar, View view, iv ivVar) {
        this.b = hvVar;
        this.d = view;
        this.c = ivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hv hvVar = this.b;
                hvVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new fv(hvVar, this.c, view));
                    break;
                }
                break;
            default:
                hv hvVar2 = this.b;
                iv ivVar = this.c;
                if (ivVar != null) {
                    hvVar2.getClass();
                    gj gjVar = ivVar.b;
                    if (gjVar != null) {
                        gjVar.N0 = true;
                    }
                    ArrayList arrayList = ivVar.n;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) obj;
                        if (s9Var instanceof hv) {
                            ((hv) s9Var).x.clear();
                        }
                    }
                } else {
                    hvVar2.x.clear();
                }
                this.d.invalidate();
                break;
        }
    }

    public /* synthetic */ fv(hv hvVar, iv ivVar, View view) {
        this.b = hvVar;
        this.c = ivVar;
        this.d = view;
    }
}
