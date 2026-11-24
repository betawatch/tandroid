// default package

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class od implements AdapterView.OnItemClickListener {
    public final /* synthetic */ sd a;
    public final /* synthetic */ pd b;

    public od(pd pdVar, sd sdVar) {
        this.b = pdVar;
        this.a = sdVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        pd pdVar = this.b;
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) pdVar.m;
        sd sdVar = this.a;
        onClickListener.onClick(sdVar.b, i);
        if (pdVar.a) {
            return;
        }
        sdVar.b.dismiss();
    }
}
