package org.telegram.messenger;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class sv implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ uv b;
    public final /* synthetic */ vv c;
    public final /* synthetic */ View d;

    public /* synthetic */ sv(uv uvVar, View view, vv vvVar) {
        this.b = uvVar;
        this.d = view;
        this.c = vvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uv uvVar = this.b;
                uvVar.getClass();
                View view = this.d;
                if (view != null) {
                    view.post(new sv(uvVar, this.c, view));
                    break;
                }
                break;
            default:
                uv uvVar2 = this.b;
                vv vvVar = this.c;
                if (vvVar != null) {
                    uvVar2.getClass();
                    jj jjVar = vvVar.b;
                    if (jjVar != null) {
                        jjVar.L0 = true;
                    }
                    ArrayList arrayList = vvVar.n;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) obj;
                        if (u9Var instanceof uv) {
                            ((uv) u9Var).x.clear();
                        }
                    }
                } else {
                    uvVar2.x.clear();
                }
                this.d.invalidate();
                break;
        }
    }

    public /* synthetic */ sv(uv uvVar, vv vvVar, View view) {
        this.b = uvVar;
        this.c = vvVar;
        this.d = view;
    }
}
