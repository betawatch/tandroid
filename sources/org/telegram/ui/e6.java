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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public class e6 extends org.telegram.ui.ActionBar.m2 {
    public c6 a;
    public org.telegram.ui.Components.mm0 b;
    public final ArrayList c;
    public ArrayList d;
    public int e;

    public e6(Bundle bundle) {
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
        arrayList2.add(new d6(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            arrayList2.add(new d6(2, (CacheByChatsController.KeepMediaException) obj));
            z11 = true;
        }
        if (z11) {
            arrayList2.add(new d6(3, null));
            arrayList2.add(new d6(4, null));
        }
        arrayList2.add(new d6(3, null));
        c6 c6Var = this.a;
        if (c6Var != null) {
            if (arrayList != null) {
                c6Var.E(arrayList, arrayList2);
            } else {
                c6Var.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        i2.d.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 23));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.b = new org.telegram.ui.Components.mm0(context, null);
        s4.k kVar = new s4.k();
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        this.b.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var = this.b;
        c6 c6Var = new c6(this);
        this.a = c6Var;
        mm0Var.setAdapter(c6Var);
        this.b.setOnItemClickListener(new b1(this, 7));
        frameLayout.addView(this.b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.a7, false));
        U();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        this.e = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        U();
        return super.onFragmentCreate();
    }
}
