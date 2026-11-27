// default package

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class it3 extends n79 {
    public final ht3[] a = new ht3[4];
    public final ArrayList b = new ArrayList();

    @Override // n79
    public final EdgeEffect a(RecyclerView recyclerView, int i) {
        ht3 ht3Var = new ht3(recyclerView, i, new gt3(this, (byte) 0));
        this.a[i] = ht3Var;
        return ht3Var;
    }

    public final float b(int i) {
        ht3 ht3Var = this.a[i];
        if (Build.VERSION.SDK_INT < 31 || ht3Var == null || ht3Var.isFinished()) {
            return 0.0f;
        }
        return ht3Var.getDistance();
    }
}
