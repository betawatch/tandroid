package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ e a;
    public final /* synthetic */ b b;

    public a(b bVar, e eVar) {
        this.b = bVar;
        this.a = eVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        b bVar = this.b;
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) bVar.m;
        e eVar = this.a;
        onClickListener.onClick(eVar.b, i7);
        if (bVar.a) {
            return;
        }
        eVar.b.dismiss();
    }
}
