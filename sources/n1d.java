// default package

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class n1d extends djc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p1d b;

    public /* synthetic */ n1d(p1d p1dVar, byte b) {
        this.a = b;
        this.b = p1dVar;
    }

    @Override // cjc
    public final void c() {
        View view;
        byte b = this.a;
        p1d p1dVar = this.b;
        switch (b) {
            case 0:
                if (p1dVar.o && (view = p1dVar.g) != null) {
                    view.setTranslationY(0.0f);
                    p1dVar.d.setTranslationY(0.0f);
                }
                p1dVar.d.setVisibility(8);
                p1dVar.d.setTransitioning(false);
                p1dVar.s = null;
                lh2 lh2Var = p1dVar.k;
                if (lh2Var != null) {
                    lh2Var.F(p1dVar.j);
                    p1dVar.j = null;
                    p1dVar.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = p1dVar.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = ihc.a;
                    ygc.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                p1dVar.s = null;
                p1dVar.d.requestLayout();
                break;
        }
    }
}
