package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class k0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        switch (this.a) {
            case 0:
                m0 m0Var = (m0) this.b;
                p0 p0Var = m0Var.X;
                p0Var.setSelection(i7);
                if (p0Var.getOnItemClickListener() != null) {
                    p0Var.performItemClick(view, i7, m0Var.U.getItemId(i7));
                }
                m0Var.dismiss();
                break;
            default:
                ((SearchView) this.b).m(i7);
                break;
        }
    }
}
