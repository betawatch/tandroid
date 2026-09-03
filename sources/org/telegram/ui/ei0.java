package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ei0 extends f2.o0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ ui0 e;

    public ei0(ui0 ui0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = ui0Var;
        this.c = context;
        this.d = f6Var;
    }

    @Override // f2.o0
    public final int h() {
        return this.e.K.size();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        ui0 ui0Var = this.e;
        ArrayList arrayList = ui0Var.K;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) l1Var.a;
        MessageObject.GroupedMessages l10 = ui0Var.l(messageObject);
        int i11 = 0;
        s1Var.setInvalidatesParent(l10 != null);
        s1Var.X3(messageObject, l10, false, false, false, false);
        if (!ui0Var.M.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 != i11 || messageObject.needDrawForwarded()) {
            return;
        }
        ui0Var.N = s1Var;
        Point point = AndroidUtilities.displaySize;
        s1Var.Z3(point.x, point.y);
        ui0Var.O = messageObject.getId();
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        ui0 ui0Var = this.e;
        ti0 ti0Var = new ti0(ui0Var, this.c, ui0Var.c, this.d);
        ti0Var.setDelegate(new ab.a(17));
        return new org.telegram.ui.Components.dl0(ti0Var);
    }
}
