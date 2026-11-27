package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class b0 extends c79 {
    public Context c;
    public ArrayList d;

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override // j79
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override // j79
    public final int d(int i) {
        return i == 0 ? 1 : 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        if (f89Var.f == 0) {
            apb apbVar = (apb) ((ArrayList) this.d.get(i - 1)).get(0);
            int c = apbVar.e == aob.Ee ? 0 : apbVar.c();
            zkb zkbVar = (zkb) f89Var.a;
            zkbVar.a.setText(d0f.c(apbVar.e));
            zkbVar.b = c;
            zkbVar.setWillNotDraw(c == 0);
            zkbVar.invalidate();
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View zkbVar;
        Context context = this.c;
        if (i != 0) {
            zkbVar = new View(context);
            zkbVar.setLayoutParams(new r79(-1, hl.L(56.0f)));
        } else {
            zkbVar = new zkb(context);
            zkbVar.setLayoutParams(new r79(-1, -2));
        }
        return new n69(zkbVar);
    }
}
