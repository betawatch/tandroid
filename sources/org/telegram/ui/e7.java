package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e7 extends org.telegram.ui.Components.g71 {
    public org.telegram.ui.ActionBar.n1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c;
    public final /* synthetic */ s7 d;

    public e7(s7 s7Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = s7Var;
        this.b = context;
        this.c = n2Var;
    }

    @Override // org.telegram.ui.Components.g71
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.Components.zk0 zk0Var = (org.telegram.ui.Components.zk0) view;
        ArrayList arrayList = this.d.e;
        zk0Var.setAdapter(((r7) arrayList.get(i10)).c);
        if (((r7) arrayList.get(i10)).b == 1 || ((r7) arrayList.get(i10)).b == 4) {
            view.getContext();
            zk0Var.setLayoutManager(new f2.x(3));
        } else {
            view.getContext();
            zk0Var.setLayoutManager(new f2.k0());
        }
        zk0Var.setTag(Integer.valueOf(((r7) arrayList.get(i10)).b));
    }

    @Override // org.telegram.ui.Components.g71
    public final View d(int i10) {
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(this.b, null);
        f2.l lVar = (f2.l) zk0Var.getItemAnimator();
        lVar.C = false;
        lVar.m = false;
        zk0Var.setClipToPadding(false);
        zk0Var.setPadding(0, 0, 0, this.d.s);
        zk0Var.setOnItemClickListener(new d7(this, zk0Var));
        zk0Var.setOnItemLongClickListener(new b7(this, zk0Var, this.c, 0));
        return zk0Var;
    }

    @Override // org.telegram.ui.Components.g71
    public final int e() {
        return this.d.e.size();
    }

    @Override // org.telegram.ui.Components.g71
    public final int f(int i10) {
        return ((r7) this.d.e.get(i10)).b;
    }

    @Override // org.telegram.ui.Components.g71
    public final CharSequence g(int i10) {
        return ((r7) this.d.e.get(i10)).a;
    }
}
