package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ni0 extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ dj0 e;

    public ni0(dj0 dj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = dj0Var;
        this.c = context;
        this.d = f6Var;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.N.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        dj0 dj0Var = this.e;
        ArrayList arrayList = dj0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((h() - 1) - i10);
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) c1Var.a;
        MessageObject.GroupedMessages l4 = dj0Var.l(messageObject);
        int i11 = 0;
        u1Var.setInvalidatesParent(l4 != null);
        u1Var.X3(messageObject, l4, false, false, false, false);
        if (!dj0Var.P.i() && arrayList.size() >= 10) {
            i11 = arrayList.size() % 10;
        }
        if (i10 != i11 || messageObject.needDrawForwarded()) {
            return;
        }
        dj0Var.Q = u1Var;
        Point point = AndroidUtilities.displaySize;
        u1Var.Z3(point.x, point.y);
        dj0Var.R = messageObject.getId();
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        dj0 dj0Var = this.e;
        cj0 cj0Var = new cj0(dj0Var, this.c, dj0Var.c, this.d);
        cj0Var.setDelegate(new na.d(17));
        return new org.telegram.ui.Components.fl0(cj0Var);
    }
}
