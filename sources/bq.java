// default package

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class bq implements AdapterView.OnItemClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bq(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                dq dqVar = (dq) obj;
                gq gqVar = dqVar.X;
                gqVar.setSelection(i);
                if (gqVar.getOnItemClickListener() != null) {
                    gqVar.performItemClick(view, i, dqVar.U.getItemId(i));
                }
                dqVar.dismiss();
                break;
            default:
                ((SearchView) obj).m(i);
                break;
        }
    }
}
