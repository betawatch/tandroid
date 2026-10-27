package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.nm0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements lw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ f(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // org.telegram.ui.Components.lw0
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                nm0 nm0Var = (nm0) recyclerView;
                ih.d.a(nm0Var, canvas, rectF, nm0Var, this.b);
                break;
            case 1:
                nm0 nm0Var2 = (nm0) recyclerView;
                ih.d.a(nm0Var2, canvas, rectF, nm0Var2, this.b);
                break;
            default:
                nm0 nm0Var3 = (nm0) recyclerView;
                ih.d.a(nm0Var3, canvas, rectF, nm0Var3, this.b);
                break;
        }
    }
}
