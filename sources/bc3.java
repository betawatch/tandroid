// default package

import androidx.appcompat.widget.ActionBarContextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bc3 implements dhc {
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

    @Override // dhc
    public final void a() {
        this.a = true;
    }

    @Override // dhc
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.a = false;
    }

    @Override // dhc
    public final void c() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.b);
    }

    public final go4 e(go4 go4Var) {
        if (!this.a || !((fgf) this.c).h(go4Var)) {
            return go4Var;
        }
        fo4 a = go4Var.a();
        String str = go4Var.l;
        a.s = wf7.n("application/x-media3-cues");
        a.T = ((fgf) this.c).C(go4Var);
        StringBuilder sb = new StringBuilder();
        sb.append(go4Var.t);
        sb.append(str != null ? " ".concat(str) : "");
        a.k = sb.toString();
        a.x = Long.MAX_VALUE;
        return new go4(a);
    }
}
