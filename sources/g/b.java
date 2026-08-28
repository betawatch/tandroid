package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements AdapterView.OnItemClickListener {
    public final /* synthetic */ e a;
    public final /* synthetic */ c b;

    public b(c cVar, e eVar) {
        this.b = cVar;
        this.a = eVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j10) {
        c cVar = this.b;
        DialogInterface.OnClickListener onClickListener = cVar.j;
        e eVar = this.a;
        onClickListener.onClick(eVar.b, i9);
        if (cVar.l) {
            return;
        }
        eVar.b.dismiss();
    }
}
