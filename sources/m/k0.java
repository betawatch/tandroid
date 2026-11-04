package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j10) {
        switch (this.a) {
            case 0:
                m0 m0Var = (m0) this.b;
                p0 p0Var = m0Var.X;
                p0Var.setSelection(i3);
                if (p0Var.getOnItemClickListener() != null) {
                    p0Var.performItemClick(view, i3, m0Var.U.getItemId(i3));
                }
                m0Var.dismiss();
                break;
            default:
                ((SearchView) this.b).m(i3);
                break;
        }
    }
}
