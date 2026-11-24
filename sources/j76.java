// default package

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j76 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j76(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        os3 os3Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i != -1 && (os3Var = ((o76) obj).c) != null) {
                    os3Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) obj).n(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        byte b = this.a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
