package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class l0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        switch (this.a) {
            case 0:
                n0 n0Var = (n0) this.b;
                q0 q0Var = n0Var.T;
                q0Var.setSelection(i10);
                if (q0Var.getOnItemClickListener() != null) {
                    q0Var.performItemClick(view, i10, n0Var.Q.getItemId(i10));
                }
                n0Var.dismiss();
                break;
            default:
                ((SearchView) this.b).m(i10);
                break;
        }
    }
}
