package li;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.l41;
import r0.l1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements v10, r0.m {
    public final /* synthetic */ s a;

    @Override // r0.m
    public l1 P0(View view, l1 l1Var) {
        this.a.a0(l1Var.a.f(519).d);
        return l1.b;
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        s.Z(this.a, (l41) obj);
    }
}
