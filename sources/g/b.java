package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
