// default package

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bx1 extends j47 {
    public final /* synthetic */ byte E0;
    public final /* synthetic */ Object F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bx1(Object obj, Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
        this.E0 = b;
        this.F0 = obj;
    }

    @Override // j47
    public final void m(long j) {
        byte b = this.E0;
        Object obj = this.F0;
        switch (b) {
            case 0:
                ((ChatActivityEnterView) obj).setEffectId(j);
                break;
            default:
                x02 x02Var = (x02) obj;
                e02 e02Var = x02Var.F2;
                x02Var.K2 = j;
                e02Var.setEffect(j);
                break;
        }
    }
}
