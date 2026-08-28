package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j10) {
        switch (this.a) {
            case 0:
                n0 n0Var = (n0) this.b;
                q0 q0Var = n0Var.S;
                q0Var.setSelection(i9);
                if (q0Var.getOnItemClickListener() != null) {
                    q0Var.performItemClick(view, i9, n0Var.P.getItemId(i9));
                }
                n0Var.dismiss();
                break;
            default:
                ((SearchView) this.b).m(i9);
                break;
        }
    }
}
