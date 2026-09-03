package dg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.ql0;
import ph.j5;
import ph.o4;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class w1 extends ql0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ba d;
    public final /* synthetic */ j5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ o4 h;

    public w1(o4 o4Var, Context context, ba baVar, j5 j5Var, boolean z4) {
        this.h = o4Var;
        this.c = context;
        this.d = baVar;
        this.e = j5Var;
        this.f = z4;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        return this.h.p0.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return ((MessageObject) this.h.p0.get((r0.size() - 1) - i10)).contentType;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        MessageObject.GroupedMessagePosition position;
        o4 o4Var = this.h;
        ArrayList arrayList = o4Var.p0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = l1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.s1)) {
            if (view instanceof org.telegram.ui.Cells.v0) {
                ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
        MessageObject.GroupedMessages groupedMessages = o4Var.q0;
        if (groupedMessages == null || (position = groupedMessages.getPosition(messageObject)) == null) {
            z4 = false;
        } else {
            z4 = position.minY != 0;
        }
        MessageObject.GroupedMessages groupedMessages2 = o4Var.q0;
        s1Var.X3(messageObject, groupedMessages2, groupedMessages2 != null, z4, false, false);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        a9.a aVar = this.h.A0;
        Context context = this.c;
        if (i10 == 1) {
            return new dl0(new u1(this, context, aVar));
        }
        v1 v1Var = new v1(this, context, UserConfig.selectedAccount, aVar);
        v1Var.K7 = true;
        return new dl0(v1Var);
    }
}
