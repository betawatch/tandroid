package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements AdapterView.OnItemClickListener {
    public final /* synthetic */ f a;
    public final /* synthetic */ d b;

    public c(d dVar, f fVar) {
        this.b = dVar;
        this.a = fVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        d dVar = this.b;
        DialogInterface.OnClickListener onClickListener = dVar.j;
        f fVar = this.a;
        onClickListener.onClick(fVar.b, i10);
        if (dVar.l) {
            return;
        }
        fVar.b.dismiss();
    }
}
