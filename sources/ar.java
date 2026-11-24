// default package

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ar implements AdapterView.OnItemClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ar(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                cr crVar = (cr) obj;
                fr frVar = crVar.X;
                frVar.setSelection(i);
                if (frVar.getOnItemClickListener() != null) {
                    frVar.performItemClick(view, i, crVar.U.getItemId(i));
                }
                crVar.dismiss();
                break;
            default:
                ((SearchView) obj).m(i);
                break;
        }
    }
}
