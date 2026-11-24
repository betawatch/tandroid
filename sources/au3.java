// default package

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class au3 extends c69 {
    public final zt3[] a = new zt3[4];
    public final ArrayList b = new ArrayList();

    @Override // c69
    public final EdgeEffect a(RecyclerView recyclerView, int i) {
        zt3 zt3Var = new zt3(recyclerView, i, new yt3(this, (byte) 0));
        this.a[i] = zt3Var;
        return zt3Var;
    }

    public final float b(int i) {
        zt3 zt3Var = this.a[i];
        if (Build.VERSION.SDK_INT < 31 || zt3Var == null || zt3Var.isFinished()) {
            return 0.0f;
        }
        return zt3Var.getDistance();
    }
}
