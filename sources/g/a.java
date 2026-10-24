package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ e a;
    public final /* synthetic */ b b;

    public a(b bVar, e eVar) {
        this.b = bVar;
        this.a = eVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b bVar = this.b;
        DialogInterface.OnClickListener onClickListener = bVar.j;
        e eVar = this.a;
        onClickListener.onClick(eVar.b, i10);
        if (bVar.l) {
            return;
        }
        eVar.b.dismiss();
    }
}
