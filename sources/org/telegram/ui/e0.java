package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e0 extends q59 {
    public final Context c;
    public bmb d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public e0(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        f();
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override // y59
    public final int b() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // y59
    public final int d(int i) {
        return i == b() - 1 ? 1 : 0;
    }

    @Override // y59
    public final void f() {
        this.d = this.f.f == 1 ? cmb.J : cmb.B0();
        this.e = new ArrayList(this.d.c0);
        super.f();
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        View view = u69Var.a;
        int d = d(i);
        if (d == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            bmb bmbVar = this.d;
            amb ambVar = (amb) this.e.get(i);
            innerAccentView.d = bmbVar;
            innerAccentView.e = ambVar;
            innerAccentView.a(false);
            return;
        }
        if (d != 1) {
            return;
        }
        omb ombVar = (omb) view;
        bmb bmbVar2 = this.d;
        int i2 = omb.c;
        ombVar.getClass();
        if (bmbVar2.X >= 8) {
            ombVar.b = new int[]{bmbVar2.j(6), bmbVar2.j(4), bmbVar2.j(7), bmbVar2.j(2), bmbVar2.j(0), bmbVar2.j(5), bmbVar2.j(3)};
        } else {
            ombVar.b = new int[7];
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        return i != 0 ? new b59(new omb(context)) : new b59(new ThemeActivity.InnerAccentView(context));
    }
}
