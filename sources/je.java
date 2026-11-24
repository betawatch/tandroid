// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class je implements qq7, eja {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ je(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = frameLayout;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        Rect rect = new Rect();
        int i = Build.VERSION.SDK_INT;
        tzc tzcVar = wzcVar.a;
        if (i >= 30) {
            iq5 f = tzcVar.f(527);
            rect.set(f.a, f.b, f.c, f.d);
        } else {
            rect.set(tzcVar.i().a, tzcVar.i().b, tzcVar.i().c, tzcVar.i().d);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom + gm.n;
        FrameLayout frameLayout = this.b;
        frameLayout.setPadding(i2, i3, i4, i5);
        frameLayout.requestLayout();
        return wzcVar;
    }

    @Override // eja
    public final void c(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 1:
                r59 r59Var = (r59) recyclerView;
                tl0.a(r59Var, canvas, rectF, r59Var, frameLayout);
                break;
            default:
                r59 r59Var2 = (r59) recyclerView;
                tl0.a(r59Var2, canvas, rectF, r59Var2, frameLayout);
                break;
        }
    }
}
