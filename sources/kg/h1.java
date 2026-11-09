package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.b20;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements a20, b20 {
    public final /* synthetic */ q1 a;

    @Override // org.telegram.messenger.b20
    public Boolean a(y31 y31Var, View view, Integer num, Float f10, Float f11) {
        boolean z9;
        if (y31Var.a == 16) {
            Object obj = y31Var.G;
            if (!(obj instanceof s1) || !((s1) obj).g) {
                this.a.j0(y31Var, view);
                z9 = true;
                return Boolean.valueOf(z9);
            }
        }
        z9 = false;
        return Boolean.valueOf(z9);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        q1.b0(this.a, (y31) obj, (View) obj2);
    }
}
