package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
