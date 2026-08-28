package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ot extends org.telegram.ui.Components.vk0 {
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

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // f2.r0
    public final int h() {
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        lt ltVar = (lt) this.e.get(i9);
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) q1Var.a;
        CharSequence replaceEmoji = Emoji.replaceEmoji(qt.U(ltVar), baVar.getTextView().getPaint().getFontMetricsInt(), false);
        if (this.h.h) {
            str = "+" + ltVar.c;
        } else {
            str = null;
        }
        baVar.c(replaceEmoji, str, false, false);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new org.telegram.ui.Components.ik0(qt.T(this.c));
    }
}
