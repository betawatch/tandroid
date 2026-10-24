package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class pt extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f = new ArrayList();
    public final /* synthetic */ rt h;

    public pt(rt rtVar, Context context, HashMap hashMap) {
        this.h = rtVar;
        this.c = context;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                this.f.add((lt) it2.next());
            }
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        lt ltVar = (lt) this.e.get(i10);
        org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) b1Var.a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(rt.V(ltVar), caVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + ltVar.c;
        } else {
            str = null;
        }
        caVar.c(replaceEmoji, str, false, false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.wl0(rt.U(this.c));
    }
}
