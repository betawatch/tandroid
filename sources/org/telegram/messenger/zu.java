package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class zu implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bv b;
    public final /* synthetic */ cv c;
    public final /* synthetic */ View d;

    public /* synthetic */ zu(bv bvVar, View view, cv cvVar) {
        this.b = bvVar;
        this.d = view;
        this.c = cvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bv bvVar = this.b;
                bvVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new zu(bvVar, this.c, view));
                    break;
                }
                break;
            default:
                bv bvVar2 = this.b;
                cv cvVar = this.c;
                if (cvVar != null) {
                    bvVar2.getClass();
                    zi ziVar = cvVar.b;
                    if (ziVar != null) {
                        ziVar.L0 = true;
                    }
                    ArrayList arrayList = cvVar.n;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) obj;
                        if (s9Var instanceof bv) {
                            ((bv) s9Var).x.clear();
                        }
                    }
                } else {
                    bvVar2.x.clear();
                }
                this.d.invalidate();
                break;
        }
    }

    public /* synthetic */ zu(bv bvVar, cv cvVar, View view) {
        this.b = bvVar;
        this.c = cvVar;
        this.d = view;
    }
}
