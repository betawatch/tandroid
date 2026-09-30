package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
