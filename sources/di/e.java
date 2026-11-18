package di;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.pt0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements pt0, r0.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ e(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        r0.i1 i1Var = l1Var.a;
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 30) {
            i0.b f10 = i1Var.f(527);
            rect.set(f10.a, f10.b, f10.c, f10.d);
        } else {
            rect.set(i1Var.i().a, i1Var.i().b, i1Var.i().c, i1Var.i().d);
        }
        int i7 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom + org.telegram.messenger.g0.n;
        FrameLayout frameLayout = this.b;
        frameLayout.setPadding(i7, i10, i11, i12);
        frameLayout.requestLayout();
        return l1Var;
    }

    @Override // org.telegram.ui.Components.pt0
    public void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                ck0 ck0Var = (ck0) recyclerView;
                ih.d.a(ck0Var, canvas, rectF, ck0Var, this.b);
                break;
            case 1:
                ck0 ck0Var2 = (ck0) recyclerView;
                ih.d.a(ck0Var2, canvas, rectF, ck0Var2, this.b);
                break;
            default:
                ck0 ck0Var3 = (ck0) recyclerView;
                ih.d.a(ck0Var3, canvas, rectF, ck0Var3, this.b);
                break;
        }
    }
}
