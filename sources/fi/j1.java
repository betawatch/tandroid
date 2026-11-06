package fi;

import android.content.Context;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.gy;
import org.telegram.ui.f01;
import org.telegram.ui.q11;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class j1 extends mi.m {
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(int i7, Context context, Object obj) {
        super(context, 2);
        this.q = i7;
        this.r = obj;
    }

    @Override // mi.m, v4.z0
    public void e() {
        switch (this.q) {
            case 0:
                ((m1) this.r).i3 = true;
                break;
            case 1:
                ((gy) this.r).f0 = true;
                break;
            case 4:
                ((q11) this.r).x1 = true;
                break;
        }
    }

    @Override // mi.m
    public final void i() {
        switch (this.q) {
            case 0:
                ((m1) this.r).i3 = false;
                break;
            case 1:
                ((gy) this.r).f0 = false;
                break;
            case 2:
                ((gw) this.r).Q.f0 = false;
                break;
            case 3:
                ((f01) this.r).R.x1 = false;
                break;
            case 4:
                ((q11) this.r).x1 = false;
                break;
            default:
                ((f01) this.r).R.x1 = false;
                break;
        }
    }
}
