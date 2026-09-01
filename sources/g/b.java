package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
