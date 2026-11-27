// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class k71 extends yc8 {
    public d79 a;
    public final /* synthetic */ w71 b;

    public k71(w71 w71Var) {
        this.b = w71Var;
    }

    @Override // yc8, ed8
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        jja jjaVar;
        d79 listView = this.b.getListView();
        int i2 = 0;
        while (true) {
            if (i2 >= listView.getChildCount()) {
                jjaVar = null;
                break;
            }
            View childAt = listView.getChildAt(i2);
            if (RecyclerView.S(childAt) == i && (childAt instanceof jja)) {
                jjaVar = (jja) childAt;
                break;
            }
            i2++;
        }
        if (jjaVar == null) {
            return null;
        }
        int[] iArr = new int[2];
        jjaVar.getLocationInWindow(iArr);
        fd8 fd8Var = new fd8();
        fd8Var.b = iArr[0];
        fd8Var.c = iArr[1];
        fd8Var.d = this.a;
        ImageReceiver imageReceiver = jjaVar.c;
        fd8Var.a = imageReceiver;
        fd8Var.e = imageReceiver.p();
        fd8Var.k = jjaVar.getScaleX();
        return fd8Var;
    }
}
