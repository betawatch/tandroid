package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class tv implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ vv b;
    public final /* synthetic */ wv c;
    public final /* synthetic */ View d;

    public /* synthetic */ tv(vv vvVar, View view, wv wvVar) {
        this.b = vvVar;
        this.d = view;
        this.c = wvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vv vvVar = this.b;
                vvVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new tv(vvVar, this.c, view));
                    break;
                }
                break;
            default:
                vv vvVar2 = this.b;
                wv wvVar = this.c;
                if (wvVar != null) {
                    vvVar2.getClass();
                    kj kjVar = wvVar.b;
                    if (kjVar != null) {
                        kjVar.L0 = true;
                    }
                    ArrayList arrayList = wvVar.n;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) obj;
                        if (u9Var instanceof vv) {
                            ((vv) u9Var).x.clear();
                        }
                    }
                } else {
                    vvVar2.x.clear();
                }
                this.d.invalidate();
                break;
        }
    }

    public /* synthetic */ tv(vv vvVar, wv wvVar, View view) {
        this.b = vvVar;
        this.c = wvVar;
        this.d = view;
    }
}
