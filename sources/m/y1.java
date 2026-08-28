package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y1 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y1(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i9, long j10) {
        s1 s1Var;
        switch (this.a) {
            case 0:
                if (i9 != -1 && (s1Var = ((e2) this.b).c) != null) {
                    s1Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.b).n(i9);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i9 = this.a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
