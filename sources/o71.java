// default package

import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class o71 extends j71 {
    public final ArrayList n;
    public final /* synthetic */ w71 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o71(w71 w71Var) {
        super(w71Var, 2);
        this.r = w71Var;
        this.n = new ArrayList();
    }

    @Override // j71, i71
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
            arrayList.add(new no6(0, ((p71) arrayList2.get(i)).d.a.getPath(), 0, ((p71) arrayList2.get(i)).d.d == 1, 0, 0));
            i++;
        }
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        View view = f89Var.a;
        n71 n71Var = (n71) view;
        zea zeaVar = (zea) n71Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        c71 c71Var = ((p71) arrayList.get(i)).d;
        boolean z = c71Var == view.getTag();
        boolean z2 = i != arrayList.size() - 1;
        view.setTag(c71Var);
        File file = c71Var.a;
        long lastModified = file.lastModified();
        String M0 = c71Var.h == 5 ? ob6.M0(2131753934, null) : file.getName();
        String s = ob6.s(lastModified / 1000, true);
        String name = file.getName();
        Pattern pattern = Utilities.a;
        int lastIndexOf = name.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? name.substring(lastIndexOf + 1) : null;
        zeaVar.d(M0, s, substring != null ? substring.toUpperCase() : null, null, 0, z2);
        if (!z) {
            zeaVar.setPhoto(file.getPath());
        }
        zeaVar.getImageView().setRoundRadius(hl.L(c71Var.h == 5 ? 20.0f : 4.0f));
        n71Var.d = z2;
        n71Var.c.setText(hl.i0(c71Var.c, false, false));
        n71Var.a.a(this.r.h.j.contains(c71Var), z);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        n71 n71Var = new n71(this, viewGroup.getContext(), (byte) 0);
        n71Var.e = (byte) 2;
        n71Var.b.addView(new zea(3, null, viewGroup.getContext()));
        return new n69(n71Var);
    }
}
