package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements aw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ e(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // org.telegram.ui.Components.aw0
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                zl0 zl0Var = (zl0) recyclerView;
                gh.d.a(zl0Var, canvas, rectF, zl0Var, this.b);
                break;
            case 1:
                zl0 zl0Var2 = (zl0) recyclerView;
                gh.d.a(zl0Var2, canvas, rectF, zl0Var2, this.b);
                break;
            default:
                zl0 zl0Var3 = (zl0) recyclerView;
                gh.d.a(zl0Var3, canvas, rectF, zl0Var3, this.b);
                break;
        }
    }
}
