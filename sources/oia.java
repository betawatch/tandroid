// default package

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class oia extends of3 {
    public final /* synthetic */ pia b5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oia(pia piaVar, Context context) {
        super(context, true);
        this.b5 = piaVar;
    }

    @Override // of3
    public final boolean Y() {
        return false;
    }

    @Override // of3
    public final boolean getIsPinned() {
        pia piaVar = this.b5;
        ArrayList arrayList = piaVar.f;
        jga jgaVar = piaVar.s;
        if (jgaVar == null || jgaVar.getAdapter() != piaVar) {
            return false;
        }
        piaVar.s.getClass();
        int S = RecyclerView.S(this);
        if (S < 0 || S >= arrayList.size()) {
            return false;
        }
        return ((mt9) arrayList.get(S)).b;
    }
}
