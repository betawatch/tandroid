package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class k0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        switch (this.a) {
            case 0:
                m0 m0Var = (m0) this.b;
                p0 p0Var = m0Var.T;
                p0Var.setSelection(i10);
                if (p0Var.getOnItemClickListener() != null) {
                    p0Var.performItemClick(view, i10, m0Var.Q.getItemId(i10));
                }
                m0Var.dismiss();
                break;
            default:
                ((SearchView) this.b).m(i10);
                break;
        }
    }
}
