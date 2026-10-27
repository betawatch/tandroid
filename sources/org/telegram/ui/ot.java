package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ot extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public Timer d;
    public ArrayList e;
    public final ArrayList f = new ArrayList();
    public final /* synthetic */ qt h;

    public ot(qt qtVar, Context context, HashMap hashMap) {
        this.h = qtVar;
        this.c = context;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                this.f.add((lt) it2.next());
            }
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
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
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        lt ltVar = (lt) this.e.get(i10);
        org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) e1Var.a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(qt.W(ltVar), gaVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + ltVar.c;
        } else {
            str = null;
        }
        gaVar.c(replaceEmoji, str, false, false);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.wl0(qt.V(this.c));
    }
}
