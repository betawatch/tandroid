package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class l0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        switch (this.a) {
            case 0:
                n0 n0Var = (n0) this.b;
                q0 q0Var = n0Var.W;
                q0Var.setSelection(i7);
                if (q0Var.getOnItemClickListener() != null) {
                    q0Var.performItemClick(view, i7, n0Var.T.getItemId(i7));
                }
                n0Var.dismiss();
                break;
            default:
                ((SearchView) this.b).m(i7);
                break;
        }
    }
}
