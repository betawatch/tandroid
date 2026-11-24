// default package

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i67 extends rc2 {
    public int Ld;
    public int Md;
    public int Nd;
    public final /* synthetic */ j67 Od;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i67(j67 j67Var, Context context, int i, ylb ylbVar) {
        super(context, i, true, null, ylbVar);
        this.Od = j67Var;
        this.Ld = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Md = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.Nd = -1;
    }

    @Override // rc2
    public final qna Y2() {
        return qna.d(1, this, this.Od.F);
    }

    @Override // android.view.View
    public final boolean isPressed() {
        return false;
    }

    @Override // rc2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.ub.x0 || i2 == 0 || this.Ld == Integer.MAX_VALUE || i4 == 0 || this.Md == Integer.MAX_VALUE) {
            return;
        }
        if (this.Nd == (getMessageObject() == null ? 0 : getMessageObject().e1())) {
            if (!this.Od.A0) {
                setTranslationY(-(i2 - this.Ld));
                animate().translationY(0.0f).setDuration(320L).setInterpolator(d53.h).start();
            }
            this.Ld = getTop();
            this.Md = getBottom();
            this.Nd = getMessageObject() != null ? getMessageObject().e1() : 0;
        }
    }
}
