package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class f6 extends org.telegram.ui.ActionBar.p2 {
    public d6 a;
    public org.telegram.ui.Components.rl0 b;
    public final ArrayList c;
    public ArrayList d;
    public int e;

    public f6(Bundle bundle) {
        super(bundle);
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void U() {
        ArrayList arrayList;
        boolean z4 = this.isPaused;
        ArrayList arrayList2 = this.c;
        if (z4 || this.a == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        }
        arrayList2.clear();
        arrayList2.add(new e6(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            arrayList2.add(new e6(2, (CacheByChatsController.KeepMediaException) obj));
            z10 = true;
        }
        if (z10) {
            arrayList2.add(new e6(3, null));
            arrayList2.add(new e6(4, null));
        }
        arrayList2.add(new e6(3, null));
        d6 d6Var = this.a;
        if (d6Var != null) {
            if (arrayList != null) {
                d6Var.E(arrayList, arrayList2);
            } else {
                d6Var.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        ai.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 8));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.b = new org.telegram.ui.Components.rl0(context, null);
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.m = false;
        this.b.setItemAnimator(lVar);
        this.b.setLayoutManager(new f2.i0());
        org.telegram.ui.Components.rl0 rl0Var = this.b;
        d6 d6Var = new d6(this);
        this.a = d6Var;
        rl0Var.setAdapter(d6Var);
        this.b.setOnItemClickListener(new c1(this, 7));
        frameLayout.addView(this.b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        U();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        this.e = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        U();
        return super.onFragmentCreate();
    }
}
