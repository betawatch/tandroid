package bi;

import android.content.Context;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b4 extends di.c6 {
    public final /* synthetic */ int x3;
    public final /* synthetic */ c4 y3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4(c4 c4Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, i7, j3, e6Var, null);
        this.x3 = i10;
        this.y3 = c4Var;
    }

    @Override // di.c6, org.telegram.ui.ActionBar.u2, org.telegram.ui.ActionBar.a2
    public final cc k() {
        switch (this.x3) {
        }
        return cc.a0(this.y3.a.a);
    }
}
