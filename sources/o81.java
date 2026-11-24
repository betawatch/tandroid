// default package

import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o81 extends i81 {
    public final ArrayList n;
    public final /* synthetic */ w81 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o81(w81 w81Var) {
        super(w81Var, 2);
        this.r = w81Var;
        this.n = new ArrayList();
    }

    @Override // i81, h81
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
            arrayList.add(new jo6(0, ((p81) arrayList2.get(i)).d.a.getPath(), 0, ((p81) arrayList2.get(i)).d.d == 1, 0, 0));
            i++;
        }
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        View view = u69Var.a;
        n81 n81Var = (n81) view;
        ida idaVar = (ida) n81Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        b81 b81Var = ((p81) arrayList.get(i)).d;
        boolean z = b81Var == view.getTag();
        boolean z2 = i != arrayList.size() - 1;
        view.setTag(b81Var);
        File file = b81Var.a;
        long lastModified = file.lastModified();
        String M0 = b81Var.h == 5 ? jb6.M0(2131753906, null) : file.getName();
        String s = jb6.s(lastModified / 1000, true);
        String name = file.getName();
        Pattern pattern = Utilities.a;
        int lastIndexOf = name.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? name.substring(lastIndexOf + 1) : null;
        idaVar.d(M0, s, substring != null ? substring.toUpperCase() : null, null, 0, z2);
        if (!z) {
            idaVar.setPhoto(file.getPath());
        }
        idaVar.getImageView().setRoundRadius(gm.L(b81Var.h == 5 ? 20.0f : 4.0f));
        n81Var.d = z2;
        n81Var.c.setText(gm.i0(b81Var.c, false, false));
        n81Var.a.a(this.r.h.j.contains(b81Var), z);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        n81 n81Var = new n81(this, viewGroup.getContext(), (byte) 0);
        n81Var.e = (byte) 2;
        n81Var.b.addView(new ida(3, null, viewGroup.getContext()));
        return new b59(n81Var);
    }
}
