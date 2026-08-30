package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b implements AdapterView.OnItemClickListener {
    public final /* synthetic */ e a;
    public final /* synthetic */ c b;

    public b(c cVar, e eVar) {
        this.b = cVar;
        this.a = eVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        c cVar = this.b;
        DialogInterface.OnClickListener onClickListener = cVar.j;
        e eVar = this.a;
        onClickListener.onClick(eVar.b, i10);
        if (cVar.l) {
            return;
        }
        eVar.b.dismiss();
    }
}
