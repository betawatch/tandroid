package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
