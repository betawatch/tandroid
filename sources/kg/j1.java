package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.w10;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements w10, x10 {
    public final /* synthetic */ s1 a;

    @Override // org.telegram.messenger.x10
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        if (o41Var.a == 16) {
            Object obj = o41Var.H;
            if (!(obj instanceof u1) || !((u1) obj).g) {
                this.a.j0(o41Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }

    @Override // org.telegram.messenger.w10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        s1.b0(this.a, (o41) obj, (View) obj2);
    }
}
