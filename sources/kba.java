// default package

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class kba implements ncc, occ, nr7 {
    public final /* synthetic */ tba a;

    public /* synthetic */ kba(tba tbaVar) {
        this.a = tbaVar;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        mq5 H0 = hl.H0(l2dVar, false);
        int i = H0.d;
        tba tbaVar = this.a;
        tbaVar.d0 = i;
        int i2 = H0.b;
        if (tbaVar.Q != null) {
            int currentActionBarHeight = a.getCurrentActionBarHeight() + i2;
            ViewGroup.LayoutParams layoutParams = tbaVar.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                tbaVar.Q.setLayoutParams(layoutParams);
            }
        }
        eg0.g(tbaVar.c, i2, i, hl.L(12.0f), tbaVar.e0);
        return l2d.b;
    }

    @Override // occ
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.valueOf(this.a.i0(b8cVar, view));
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.h0((b8c) obj);
    }
}
