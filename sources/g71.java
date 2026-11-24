// default package

import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class g71 extends b71 {
    public final ArrayList n;
    public final /* synthetic */ o71 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g71(o71 o71Var) {
        super(o71Var, 2);
        this.r = o71Var;
        this.n = new ArrayList();
    }

    @Override // b71, a71
    public final void F() {
        super.F();
        ArrayList arrayList = this.n;
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
        View view = s49Var.a;
        f71 f71Var = (f71) view;
        iba ibaVar = (iba) f71Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        u61 u61Var = ((h71) arrayList.get(i)).d;
        boolean z = u61Var == view.getTag();
        boolean z2 = i != arrayList.size() - 1;
        view.setTag(u61Var);
        File file = u61Var.a;
        long lastModified = file.lastModified();
        String M0 = u61Var.h == 5 ? k96.M0(2131753938, null) : file.getName();
        String s = k96.s(lastModified / 1000, true);
        String name = file.getName();
        Pattern pattern = Utilities.a;
        int lastIndexOf = name.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? name.substring(lastIndexOf + 1) : null;
        ibaVar.d(M0, s, substring != null ? substring.toUpperCase() : null, null, 0, z2);
        if (!z) {
            ibaVar.setPhoto(file.getPath());
        }
        ibaVar.getImageView().setRoundRadius(gl.L(u61Var.h == 5 ? 20.0f : 4.0f));
        f71Var.d = z2;
        f71Var.c.setText(gl.i0(u61Var.c, false, false));
        f71Var.a.a(this.r.h.j.contains(u61Var), z);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        f71 f71Var = new f71(this, viewGroup.getContext(), (byte) 0);
        f71Var.e = (byte) 2;
        f71Var.b.addView(new iba(3, null, viewGroup.getContext()));
        return new y29(f71Var);
    }
}
