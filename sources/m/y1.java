package m;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class y1 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j3) {
        s1 s1Var;
        switch (this.a) {
            case 0:
                if (i7 != -1 && (s1Var = ((e2) this.b).c) != null) {
                    s1Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.b).n(i7);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i7 = this.a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
