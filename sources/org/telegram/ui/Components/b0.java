package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class b0 extends n39 {
    public Context c;
    public ArrayList d;

    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override // w39
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override // w39
    public final int d(int i) {
        return i == 0 ? 1 : 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        if (s49Var.f == 0) {
            blb blbVar = (blb) ((ArrayList) this.d.get(i - 1)).get(0);
            int c = blbVar.e == bkb.De ? 0 : blbVar.c();
            dhb dhbVar = (dhb) s49Var.a;
            dhbVar.a.setText(lve.c(blbVar.e));
            dhbVar.b = c;
            dhbVar.setWillNotDraw(c == 0);
            dhbVar.invalidate();
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View dhbVar;
        Context context = this.c;
        if (i != 0) {
            dhbVar = new View(context);
            dhbVar.setLayoutParams(new e49(-1, gl.L(56.0f)));
        } else {
            dhbVar = new dhb(context);
            dhbVar.setLayoutParams(new e49(-1, -2));
        }
        return new y29(dhbVar);
    }
}
