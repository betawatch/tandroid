// default package

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class aq implements AdapterView.OnItemClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aq(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                cq cqVar = (cq) obj;
                fq fqVar = cqVar.X;
                fqVar.setSelection(i);
                if (fqVar.getOnItemClickListener() != null) {
                    fqVar.performItemClick(view, i, cqVar.U.getItemId(i));
                }
                cqVar.dismiss();
                break;
            default:
                ((SearchView) obj).m(i);
                break;
        }
    }
}
