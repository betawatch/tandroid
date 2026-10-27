package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.nu;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements dh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // dh.a
    public final void b(ch.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // dh.a
    public final void f(Canvas canvas, RectF rectF) {
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((y) obj2).f.d(canvas, rectF, (f) obj);
                break;
            case 1:
                ((dd) obj2).U.d(canvas, rectF, (f) obj);
                break;
            case 2:
                ((gi.h) obj2).U.d(canvas, rectF, (f) obj);
                break;
            case 3:
                hp0 hp0Var = (hp0) obj2;
                ih.d.a(hp0Var, canvas, rectF, hp0Var, (FrameLayout) obj);
                break;
            case 4:
                nm0 nm0Var = (nm0) obj2;
                ih.d.a(nm0Var, canvas, rectF, nm0Var, (FrameLayout) obj);
                break;
            case 5:
                ((org.telegram.ui.c7) obj2).b0.d(canvas, rectF, (org.telegram.ui.e6) obj);
                break;
            case 6:
                ((m40) obj2).n.J(canvas, rectF, (FrameLayout) obj);
                break;
            case 7:
                ((ua0) obj2).R.J(canvas, rectF, (bh.r) obj);
                break;
            case 8:
                nu nuVar = (nu) obj2;
                di.i4 i4Var = (di.i4) obj;
                int childCount = nuVar.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = nuVar.a.getChildAt(i11);
                    if (childAt instanceof nm0) {
                        nm0 nm0Var2 = (nm0) childAt;
                        ih.d.a(nm0Var2, canvas, rectF, nm0Var2, i4Var);
                    }
                }
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                int i12 = ProfileActivity.R6;
                ((ch.j) obj).f(canvas, rectF);
                profileActivity.N.J(canvas, rectF, (ViewGroup) profileActivity.fragmentView);
                break;
        }
    }
}
