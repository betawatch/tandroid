package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b0 extends q59 {
    public Context c;
    public ArrayList d;

    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override // y59
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override // y59
    public final int d(int i) {
        return i == 0 ? 1 : 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        if (u69Var.f == 0) {
            cnb cnbVar = (cnb) ((ArrayList) this.d.get(i - 1)).get(0);
            int c = cnbVar.e == cmb.De ? 0 : cnbVar.c();
            ejb ejbVar = (ejb) u69Var.a;
            ejbVar.a.setText(nxe.c(cnbVar.e));
            ejbVar.b = c;
            ejbVar.setWillNotDraw(c == 0);
            ejbVar.invalidate();
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View ejbVar;
        Context context = this.c;
        if (i != 0) {
            ejbVar = new View(context);
            ejbVar.setLayoutParams(new g69(-1, gm.L(56.0f)));
        } else {
            ejbVar = new ejb(context);
            ejbVar.setLayoutParams(new g69(-1, -2));
        }
        return new b59(ejbVar);
    }
}
