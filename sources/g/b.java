package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
