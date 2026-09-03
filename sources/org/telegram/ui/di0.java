package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class di0 extends f2.p0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 d;
    public final /* synthetic */ ti0 e;

    public di0(ti0 ti0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = ti0Var;
        this.c = context;
        this.d = g6Var;
    }

    @Override // f2.p0
    public final int h() {
        return this.e.K.size();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        ti0 ti0Var = this.e;
        ArrayList arrayList = ti0Var.K;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) m1Var.a;
        MessageObject.GroupedMessages l10 = ti0Var.l(messageObject);
        int i11 = 0;
        t1Var.setInvalidatesParent(l10 != null);
        t1Var.X3(messageObject, l10, false, false, false, false);
        if (!ti0Var.M.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 != i11 || messageObject.needDrawForwarded()) {
            return;
        }
        ti0Var.N = t1Var;
        Point point = AndroidUtilities.displaySize;
        t1Var.Z3(point.x, point.y);
        ti0Var.O = messageObject.getId();
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        ti0 ti0Var = this.e;
        si0 si0Var = new si0(ti0Var, this.c, ti0Var.c, this.d);
        si0Var.setDelegate(new db.a(16));
        return new org.telegram.ui.Components.el0(si0Var);
    }
}
