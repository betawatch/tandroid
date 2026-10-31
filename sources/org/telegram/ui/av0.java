package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class av0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public final int D;
    public org.telegram.ui.Components.tk0 a;
    public s4.a0 b;
    public zu0 c;
    public org.telegram.ui.Components.xy d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public final boolean y;

    public av0() {
        super(null);
        this.D = 1;
        this.y = true;
    }

    public final void Y(Long l4, View view) {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, view);
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false)));
        int i10 = this.D;
        H.l(0, org.telegram.messenger.cd.L0(2131743936, null), new et0(7, this, l4), i10 == 1);
        boolean z10 = i10 != 1;
        H.m(i10 == 0 ? R.drawable.msg_user_remove : 0, new yu0(this, l4), org.telegram.messenger.cd.L0(2131746336, null), z10, true);
        H.S = org.telegram.messenger.zs.U2;
        H.Z();
    }

    public final void Z() {
        this.e = 0;
        this.f = -1;
        this.n = -1;
        this.h = -1;
        this.x = -1;
        if (!this.y || getMessagesController().H0 >= 0) {
            int i10 = this.e;
            int i11 = i10 + 1;
            this.e = i11;
            this.f = i10;
            int i12 = this.D;
            if (i12 == 1) {
                this.e = i10 + 2;
                this.h = i11;
            }
            if (i12 != 1) {
                throw null;
            }
            int size = getMessagesController().G0.size();
            if (size != 0) {
                if (i12 == 1) {
                    int i13 = this.e;
                    this.e = i13 + 1;
                    this.n = i13;
                }
                int i14 = this.e;
                this.r = i14;
                int i15 = i14 + size;
                this.s = i15;
                int i16 = i15 + 1;
                this.e = i16;
                this.w = i15;
                if (i12 != 1) {
                    this.e = i15 + 2;
                    this.x = i16;
                }
            } else {
                this.n = -1;
                this.r = -1;
                this.s = -1;
                this.w = -1;
                this.x = -1;
            }
        }
        zu0 zu0Var = this.c;
        if (zu0Var != null) {
            zu0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.D;
        if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131753681, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131750730, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131748304, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.d = xyVar;
        if (i10 == 1) {
            xyVar.setText(org.telegram.messenger.cd.L0(2131748256, null));
        } else {
            xyVar.setText(org.telegram.messenger.cd.L0(2131748240, null));
        }
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.a = tk0Var;
        tk0Var.r1();
        this.a.setItemSelectorColorProvider(new xu0(this));
        this.a.setSectionsDrawBackground(true);
        this.a.setEmptyView(this.d);
        org.telegram.ui.Components.tk0 tk0Var2 = this.a;
        s4.a0 a0Var = new s4.a0(1, false);
        this.b = a0Var;
        tk0Var2.setLayoutManager(a0Var);
        this.a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.tk0 tk0Var3 = this.a;
        zu0 zu0Var = new zu0(this, context);
        this.c = zu0Var;
        tk0Var3.setAdapter(zu0Var);
        this.a.setVerticalScrollbarPosition(org.telegram.messenger.cd.X ? 1 : 2);
        frameLayout.addView(this.a, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.d, w7.b6.c(-1.0f, -1));
        this.a.setOnItemClickListener(new g(this, 27));
        this.a.setOnItemLongClickListener(new xu0(this));
        if (i10 == 1) {
            this.a.setOnScrollListener(new h3(this, 26));
            if (getMessagesController().H0 < 0) {
                this.d.b();
            } else {
                this.d.c();
            }
        }
        Z();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.tk0 tk0Var;
        if (i10 != org.telegram.messenger.zs.r) {
            if (i10 == org.telegram.messenger.zs.g0) {
                this.d.c();
                Z();
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[0]).intValue();
        int i12 = org.telegram.messenger.vp.D8;
        if (((intValue & 2) == 0 && (intValue & 1) == 0) || (tk0Var = this.a) == null) {
            return;
        }
        int childCount = tk0Var.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = this.a.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.e5) {
                ((org.telegram.ui.Cells.e5) childAt).d(intValue);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(17, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 16, new Class[]{org.telegram.ui.Cells.e5.class, org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.p4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.r);
        if (this.D == 1) {
            org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.g0);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.r);
        if (this.D == 1) {
            org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.g0);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        zu0 zu0Var = this.c;
        if (zu0Var != null) {
            zu0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.xy xyVar = this.d;
            if (xyVar != null) {
                xyVar.setProgressBarColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h6, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
