// default package

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
