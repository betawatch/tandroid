// default package

import androidx.appcompat.widget.ActionBarContextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ib3 implements cjc {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public boolean a;
    public byte b;
    public Object c;

    public static void d(int i, ArrayList arrayList) {
        int i2 = 0;
        while (true) {
            if (i2 >= 7) {
                i2 = -1;
                break;
            } else if (d[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    @Override // cjc
    public final void a() {
        this.a = true;
    }

    @Override // cjc
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.a = false;
    }

    @Override // cjc
    public final void c() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.b);
    }

    public final ko4 e(ko4 ko4Var) {
        if (!this.a || !((uif) this.c).j(ko4Var)) {
            return ko4Var;
        }
        jo4 a = ko4Var.a();
        String str = ko4Var.l;
        a.s = dg7.n("application/x-media3-cues");
        a.T = ((uif) this.c).y(ko4Var);
        StringBuilder sb = new StringBuilder();
        sb.append(ko4Var.t);
        sb.append(str != null ? " ".concat(str) : "");
        a.k = sb.toString();
        a.x = Long.MAX_VALUE;
        return new ko4(a);
    }
}
