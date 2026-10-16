package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class m0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.b;
                r0 r0Var = o0Var.W;
                r0Var.setSelection(i10);
                if (r0Var.getOnItemClickListener() != null) {
                    r0Var.performItemClick(view, i10, o0Var.T.getItemId(i10));
                }
                o0Var.dismiss();
                break;
            default:
                ((SearchView) this.b).m(i10);
                break;
        }
    }
}
