// default package

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lba implements ncc, occ, nr7 {
    public final /* synthetic */ uba a;

    public /* synthetic */ lba(uba ubaVar) {
        this.a = ubaVar;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        mq5 H0 = hl.H0(l2dVar, false);
        int i = H0.d;
        uba ubaVar = this.a;
        ubaVar.d0 = i;
        int i2 = H0.b;
        if (ubaVar.Q != null) {
            int currentActionBarHeight = a.getCurrentActionBarHeight() + i2;
            ViewGroup.LayoutParams layoutParams = ubaVar.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                ubaVar.Q.setLayoutParams(layoutParams);
            }
        }
        eg0.g(ubaVar.c, i2, i, hl.L(12.0f), ubaVar.e0);
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
