package eg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.rl0;
import qh.h5;
import qh.n4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class u1 extends rl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ba d;
    public final /* synthetic */ h5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ n4 h;

    public u1(n4 n4Var, Context context, ba baVar, h5 h5Var, boolean z4) {
        this.h = n4Var;
        this.c = context;
        this.d = baVar;
        this.e = h5Var;
        this.f = z4;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        return this.h.p0.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((MessageObject) this.h.p0.get((r0.size() - 1) - i10)).contentType;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        MessageObject.GroupedMessagePosition position;
        n4 n4Var = this.h;
        ArrayList arrayList = n4Var.p0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = m1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.t1)) {
            if (view instanceof org.telegram.ui.Cells.v0) {
                ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
        MessageObject.GroupedMessages groupedMessages = n4Var.q0;
        if (groupedMessages == null || (position = groupedMessages.getPosition(messageObject)) == null) {
            z4 = false;
        } else {
            z4 = position.minY != 0;
        }
        MessageObject.GroupedMessages groupedMessages2 = n4Var.q0;
        t1Var.X3(messageObject, groupedMessages2, groupedMessages2 != null, z4, false, false);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        a9.a aVar = this.h.A0;
        Context context = this.c;
        if (i10 == 1) {
            return new el0(new s1(this, context, aVar));
        }
        t1 t1Var = new t1(this, context, UserConfig.selectedAccount, aVar);
        t1Var.K7 = true;
        return new el0(t1Var);
    }
}
