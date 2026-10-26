package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.lu;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                gp0 gp0Var = (gp0) obj2;
                ih.d.a(gp0Var, canvas, rectF, gp0Var, (FrameLayout) obj);
                break;
            case 4:
                mm0 mm0Var = (mm0) obj2;
                ih.d.a(mm0Var, canvas, rectF, mm0Var, (FrameLayout) obj);
                break;
            case 5:
                ((org.telegram.ui.c7) obj2).b0.d(canvas, rectF, (org.telegram.ui.e6) obj);
                break;
            case 6:
                ((m40) obj2).n.J(canvas, rectF, (FrameLayout) obj);
                break;
            case 7:
                ((ta0) obj2).R.J(canvas, rectF, (bh.r) obj);
                break;
            case 8:
                lu luVar = (lu) obj2;
                di.i4 i4Var = (di.i4) obj;
                int childCount = luVar.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = luVar.a.getChildAt(i11);
                    if (childAt instanceof mm0) {
                        mm0 mm0Var2 = (mm0) childAt;
                        ih.d.a(mm0Var2, canvas, rectF, mm0Var2, i4Var);
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
