package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class e0 extends n39 {
    public final Context c;
    public akb d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public e0(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        f();
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override // w39
    public final int b() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // w39
    public final int d(int i) {
        return i == b() - 1 ? 1 : 0;
    }

    @Override // w39
    public final void f() {
        this.d = this.f.f == 1 ? bkb.J : bkb.B0();
        this.e = new ArrayList(this.d.c0);
        super.f();
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        View view = s49Var.a;
        int d = d(i);
        if (d == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            akb akbVar = this.d;
            zjb zjbVar = (zjb) this.e.get(i);
            innerAccentView.d = akbVar;
            innerAccentView.e = zjbVar;
            innerAccentView.a(false);
            return;
        }
        if (d != 1) {
            return;
        }
        nkb nkbVar = (nkb) view;
        akb akbVar2 = this.d;
        int i2 = nkb.c;
        nkbVar.getClass();
        if (akbVar2.X >= 8) {
            nkbVar.b = new int[]{akbVar2.j(6), akbVar2.j(4), akbVar2.j(7), akbVar2.j(2), akbVar2.j(0), akbVar2.j(5), akbVar2.j(3)};
        } else {
            nkbVar.b = new int[7];
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        return i != 0 ? new y29(new nkb(context)) : new y29(new ThemeActivity.InnerAccentView(context));
    }
}
