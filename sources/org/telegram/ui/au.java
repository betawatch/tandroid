package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class au extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f = new ArrayList();
    public final /* synthetic */ cu h;

    public au(cu cuVar, Context context, HashMap hashMap) {
        this.h = cuVar;
        this.c = context;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                this.f.add((xt) it2.next());
            }
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        xt xtVar = (xt) this.e.get(i10);
        org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) c1Var.a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(cu.V(xtVar), eaVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + xtVar.c;
        } else {
            str = null;
        }
        eaVar.c(replaceEmoji, str, false, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.wk0(cu.U(this.c));
    }
}
