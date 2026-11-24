// default package

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class oc implements AdapterView.OnItemClickListener {
    public final /* synthetic */ sc a;
    public final /* synthetic */ pc b;

    public oc(pc pcVar, sc scVar) {
        this.b = pcVar;
        this.a = scVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        pc pcVar = this.b;
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) pcVar.m;
        sc scVar = this.a;
        onClickListener.onClick(scVar.b, i);
        if (pcVar.a) {
            return;
        }
        scVar.b.dismiss();
    }
}
