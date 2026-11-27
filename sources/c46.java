// default package

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class c46 implements View.OnClickListener {
    public final /* synthetic */ d46 a;

    public c46(d46 d46Var) {
        this.a = d46Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kb kbVar = (kb) view.getParent();
        ArrayList arrayList = new ArrayList();
        arrayList.add(kbVar.getCurrentChannel());
        l46 l46Var = this.a.c;
        int i = l46.R2;
        l46Var.p1(arrayList);
    }
}
