// default package

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class i47 extends gb2 {
    public int Ld;
    public int Md;
    public int Nd;
    public final /* synthetic */ j47 Od;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i47(j47 j47Var, Context context, int i, wjb wjbVar) {
        super(context, i, true, null, wjbVar);
        this.Od = j47Var;
        this.Ld = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Md = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Nd = -1;
    }

    @Override // gb2
    public final pla Y2() {
        return pla.d(1, this, this.Od.F);
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return false;
    }

    @Override // gb2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.ub.x0 || i2 == 0 || this.Ld == Integer.MAX_VALUE || i4 == 0 || this.Md == Integer.MAX_VALUE) {
            return;
        }
        if (this.Nd == (getMessageObject() == null ? 0 : getMessageObject().e1())) {
            if (!this.Od.A0) {
                setTranslationY(-(i2 - this.Ld));
                animate().translationY(0.0f).setDuration(320L).setInterpolator(s33.h).start();
            }
            this.Ld = getTop();
            this.Md = getBottom();
            this.Nd = getMessageObject() != null ? getMessageObject().e1() : 0;
        }
    }
}
