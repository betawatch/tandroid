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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public class b6 extends org.telegram.ui.ActionBar.n2 {
    public z5 a;
    public org.telegram.ui.Components.ll0 b;
    public final ArrayList c;
    public ArrayList d;
    public int e;

    public b6(Bundle bundle) {
        super(bundle);
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void U() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.c;
        if (z10 || this.a == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        }
        arrayList2.clear();
        arrayList2.add(new a6(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            arrayList2.add(new a6(2, (CacheByChatsController.KeepMediaException) obj));
            z11 = true;
        }
        if (z11) {
            arrayList2.add(new a6(3, null));
            arrayList2.add(new a6(4, null));
        }
        arrayList2.add(new a6(3, null));
        z5 z5Var = this.a;
        if (z5Var != null) {
            if (arrayList != null) {
                z5Var.E(arrayList, arrayList2);
            } else {
                z5Var.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        hg.c.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.b = new org.telegram.ui.Components.ll0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.m = false;
        this.b.setItemAnimator(jVar);
        this.b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.ll0 ll0Var = this.b;
        z5 z5Var = new z5(this);
        this.a = z5Var;
        ll0Var.setAdapter(z5Var);
        this.b.setOnItemClickListener(new y0(this, 7));
        frameLayout.addView(this.b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.a7, false));
        U();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        this.e = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        U();
        return super.onFragmentCreate();
    }
}
