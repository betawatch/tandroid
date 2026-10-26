package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements kw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ f(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // org.telegram.ui.Components.kw0
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                mm0 mm0Var = (mm0) recyclerView;
                ih.d.a(mm0Var, canvas, rectF, mm0Var, this.b);
                break;
            case 1:
                mm0 mm0Var2 = (mm0) recyclerView;
                ih.d.a(mm0Var2, canvas, rectF, mm0Var2, this.b);
                break;
            default:
                mm0 mm0Var3 = (mm0) recyclerView;
                ih.d.a(mm0Var3, canvas, rectF, mm0Var3, this.b);
                break;
        }
    }
}
