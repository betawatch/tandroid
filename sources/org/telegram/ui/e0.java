package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class e0 extends c79 {
    public final Context c;
    public znb d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public e0(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        f();
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override // j79
    public final int b() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // j79
    public final int d(int i) {
        return i == b() - 1 ? 1 : 0;
    }

    @Override // j79
    public final void f() {
        this.d = this.f.f == 1 ? aob.J : aob.B0();
        this.e = new ArrayList(this.d.c0);
        super.f();
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        View view = f89Var.a;
        int d = d(i);
        if (d == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            znb znbVar = this.d;
            ynb ynbVar = (ynb) this.e.get(i);
            innerAccentView.d = znbVar;
            innerAccentView.e = ynbVar;
            innerAccentView.a(false);
            return;
        }
        if (d != 1) {
            return;
        }
        mob mobVar = (mob) view;
        znb znbVar2 = this.d;
        int i2 = mob.c;
        mobVar.getClass();
        if (znbVar2.X >= 8) {
            mobVar.b = new int[]{znbVar2.j(6), znbVar2.j(4), znbVar2.j(7), znbVar2.j(2), znbVar2.j(0), znbVar2.j(5), znbVar2.j(3)};
        } else {
            mobVar.b = new int[7];
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        return i != 0 ? new n69(new mob(context)) : new n69(new ThemeActivity.InnerAccentView(context));
    }
}
