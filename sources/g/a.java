package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ e a;
    public final /* synthetic */ b b;

    public a(b bVar, e eVar) {
        this.b = bVar;
        this.a = eVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j10) {
        b bVar = this.b;
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) bVar.m;
        e eVar = this.a;
        onClickListener.onClick(eVar.b, i3);
        if (bVar.a) {
            return;
        }
        eVar.b.dismiss();
    }
}
