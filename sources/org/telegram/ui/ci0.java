package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ci0 extends f2.o0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ si0 e;

    public ci0(si0 si0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = si0Var;
        this.c = context;
        this.d = f6Var;
    }

    @Override // f2.o0
    public final int h() {
        return this.e.K.size();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        si0 si0Var = this.e;
        ArrayList arrayList = si0Var.K;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) l1Var.a;
        MessageObject.GroupedMessages l10 = si0Var.l(messageObject);
        int i11 = 0;
        t1Var.setInvalidatesParent(l10 != null);
        t1Var.X3(messageObject, l10, false, false, false, false);
        if (!si0Var.M.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 != i11 || messageObject.needDrawForwarded()) {
            return;
        }
        si0Var.N = t1Var;
        Point point = AndroidUtilities.displaySize;
        t1Var.Z3(point.x, point.y);
        si0Var.O = messageObject.getId();
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        si0 si0Var = this.e;
        ri0 ri0Var = new ri0(si0Var, this.c, si0Var.c, this.d);
        ri0Var.setDelegate(new db.a(16));
        return new org.telegram.ui.Components.el0(ri0Var);
    }
}
