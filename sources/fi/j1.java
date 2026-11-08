package fi;

import android.content.Context;
import org.telegram.ui.Components.hw;
import org.telegram.ui.Components.hy;
import org.telegram.ui.f01;
import org.telegram.ui.q11;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                ((hy) this.r).f0 = true;
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
                ((hy) this.r).f0 = false;
                break;
            case 2:
                ((hw) this.r).Q.f0 = false;
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
