package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class b implements AdapterView.OnItemClickListener {
    public final /* synthetic */ f a;
    public final /* synthetic */ c b;

    public b(c cVar, f fVar) {
        this.b = cVar;
        this.a = fVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        c cVar = this.b;
        DialogInterface.OnClickListener onClickListener = cVar.j;
        f fVar = this.a;
        onClickListener.onClick(fVar.b, i10);
        if (cVar.l) {
            return;
        }
        fVar.b.dismiss();
    }
}
