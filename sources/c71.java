// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class c71 extends i98 {
    public o39 a;
    public final /* synthetic */ o71 b;

    public c71(o71 o71Var) {
        this.b = o71Var;
    }

    @Override // i98, o98
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        qfa qfaVar;
        o39 listView = this.b.getListView();
        int i2 = 0;
        while (true) {
            if (i2 >= listView.getChildCount()) {
                qfaVar = null;
                break;
            }
            View childAt = listView.getChildAt(i2);
            if (RecyclerView.R(childAt) == i && (childAt instanceof qfa)) {
                qfaVar = (qfa) childAt;
                break;
            }
            i2++;
        }
        if (qfaVar == null) {
            return null;
        }
        int[] iArr = new int[2];
        qfaVar.getLocationInWindow(iArr);
        p98 p98Var = new p98();
        p98Var.b = iArr[0];
        p98Var.c = iArr[1];
        p98Var.d = this.a;
        ImageReceiver imageReceiver = qfaVar.c;
        p98Var.a = imageReceiver;
        p98Var.e = imageReceiver.p();
        p98Var.k = qfaVar.getScaleX();
        return p98Var;
    }
}
