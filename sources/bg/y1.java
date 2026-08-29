package bg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import nh.e6;
import nh.f5;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y1 extends il0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ga d;
    public final /* synthetic */ e6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ f5 h;

    public y1(f5 f5Var, Context context, ga gaVar, e6 e6Var, boolean z10) {
        this.h = f5Var;
        this.c = context;
        this.d = gaVar;
        this.e = e6Var;
        this.f = z10;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        return this.h.o0.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((MessageObject) this.h.o0.get((r0.size() - 1) - i10)).contentType;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        MessageObject.GroupedMessagePosition position;
        f5 f5Var = this.h;
        ArrayList arrayList = f5Var.o0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = n1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.s1)) {
            if (view instanceof org.telegram.ui.Cells.v0) {
                ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
        MessageObject.GroupedMessages groupedMessages = f5Var.p0;
        if (groupedMessages == null || (position = groupedMessages.getPosition(messageObject)) == null) {
            z10 = false;
        } else {
            z10 = position.minY != 0;
        }
        MessageObject.GroupedMessages groupedMessages2 = f5Var.p0;
        s1Var.X3(messageObject, groupedMessages2, groupedMessages2 != null, z10, false, false);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        c2 c2Var = this.h.z0;
        Context context = this.c;
        if (i10 == 1) {
            return new vk0(new w1(this, context, c2Var));
        }
        x1 x1Var = new x1(this, context, UserConfig.selectedAccount, c2Var);
        x1Var.J7 = true;
        return new vk0(x1Var);
    }
}
