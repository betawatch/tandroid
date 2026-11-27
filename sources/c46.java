// default package

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
