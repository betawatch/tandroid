// default package

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class j71 extends b71 {
    public jb4 n;
    public final ArrayList r;
    public fm2 s;
    public final /* synthetic */ o71 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j71(o71 o71Var) {
        super(o71Var, 1);
        this.w = o71Var;
        this.r = new ArrayList();
    }

    @Override // b71, a71
    public final void F() {
        super.F();
        ArrayList arrayList = this.r;
        arrayList.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i >= arrayList2.size()) {
                return;
            }
            arrayList.add(new jm6(0, ((h71) arrayList2.get(i)).d.a.getPath(), 0, ((h71) arrayList2.get(i)).d.d == 1, 0, 0));
            i++;
        }
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        if (this.s == null) {
            fm2 fm2Var = new fm2(new ColorDrawable(bkb.w0(null, bkb.W9, false)), bkb.Q4);
            this.s = fm2Var;
            fm2Var.x = true;
        }
        qfa qfaVar = (qfa) s49Var.a;
        u61 u61Var = ((h71) this.e.get(i)).d;
        Object tag = qfaVar.getTag();
        ImageReceiver imageReceiver = qfaVar.c;
        boolean z = u61Var == tag;
        qfaVar.setTag(u61Var);
        int max = (int) Math.max(100.0f, gl.b1().x / gl.p);
        byte b = u61Var.d;
        File file = u61Var.a;
        if (b == 1) {
            imageReceiver.d0(gl5.g("vthumb://0:" + file.getAbsolutePath()), tb4.m(max, max, "_"), this.s, null, null, 0);
            qfaVar.m(gl.i0(u61Var.c, false, false), true);
        } else {
            imageReceiver.d0(gl5.g("thumb://0:" + file.getAbsolutePath()), tb4.m(max, max, "_"), this.s, null, null, 0);
            qfaVar.m(gl.i0(u61Var.c, false, false), false);
        }
        qfaVar.i(this.w.h.j.contains(u61Var), z);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        if (this.n == null) {
            this.n = new jb4(viewGroup.getContext(), null);
        }
        i71 i71Var = new i71(this, viewGroup.getContext(), this.n, this.w.e.getCurrentAccount());
        i71Var.setStyle(1);
        return new y29(i71Var);
    }
}
