// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jd implements no7, cha {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ jd(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = frameLayout;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        Rect rect = new Rect();
        int i = Build.VERSION.SDK_INT;
        sxc sxcVar = vxcVar.a;
        if (i >= 30) {
            io5 f = sxcVar.f(527);
            rect.set(f.a, f.b, f.c, f.d);
        } else {
            rect.set(sxcVar.i().a, sxcVar.i().b, sxcVar.i().c, sxcVar.i().d);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom + gl.n;
        FrameLayout frameLayout = this.b;
        frameLayout.setPadding(i2, i3, i4, i5);
        frameLayout.requestLayout();
        return vxcVar;
    }

    @Override // cha
    public final void m(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 1:
                o39 o39Var = (o39) recyclerView;
                tk0.a(o39Var, canvas, rectF, o39Var, frameLayout);
                break;
            default:
                o39 o39Var2 = (o39) recyclerView;
                tk0.a(o39Var2, canvas, rectF, o39Var2, frameLayout);
                break;
        }
    }
}
