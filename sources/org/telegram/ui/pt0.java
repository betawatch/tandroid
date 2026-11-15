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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class pt0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public final int E;
    public org.telegram.ui.Components.uj0 a;
    public v4.b0 b;
    public ot0 c;
    public org.telegram.ui.Components.ny d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public final boolean y;

    public pt0() {
        super(null);
        this.E = 1;
        this.y = true;
    }

    public final void Z(Long l10, View view) {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(this, view);
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false)));
        int i7 = this.E;
        H.l(0, org.telegram.messenger.hd.M0(2131743911, null), new mp0(10, this, l10), i7 == 1);
        boolean z10 = i7 != 1;
        H.m(i7 == 0 ? R.drawable.msg_user_remove : 0, new nt0(this, l10), org.telegram.messenger.hd.M0(2131746321, null), z10, true);
        H.S = org.telegram.messenger.ns.U2;
        H.Z();
    }

    public final void a0() {
        this.e = 0;
        this.f = -1;
        this.n = -1;
        this.h = -1;
        this.x = -1;
        if (!this.y || getMessagesController().I0 >= 0) {
            int i7 = this.e;
            int i10 = i7 + 1;
            this.e = i10;
            this.f = i7;
            int i11 = this.E;
            if (i11 == 1) {
                this.e = i7 + 2;
                this.h = i10;
            }
            if (i11 != 1) {
                throw null;
            }
            int size = getMessagesController().H0.size();
            if (size != 0) {
                if (i11 == 1) {
                    int i12 = this.e;
                    this.e = i12 + 1;
                    this.n = i12;
                }
                int i13 = this.e;
                this.r = i13;
                int i14 = i13 + size;
                this.s = i14;
                int i15 = i14 + 1;
                this.e = i15;
                this.w = i14;
                if (i11 != 1) {
                    this.e = i14 + 2;
                    this.x = i15;
                }
            } else {
                this.n = -1;
                this.r = -1;
                this.s = -1;
                this.w = -1;
                this.x = -1;
            }
        }
        ot0 ot0Var = this.c;
        if (ot0Var != null) {
            ot0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i7 = this.E;
        if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753681, null));
        } else if (i7 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131750729, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131748290, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, r1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ny nyVar = new org.telegram.ui.Components.ny(context, null);
        this.d = nyVar;
        if (i7 == 1) {
            nyVar.setText(org.telegram.messenger.hd.M0(2131748239, null));
        } else {
            nyVar.setText(org.telegram.messenger.hd.M0(2131748223, null));
        }
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.a = uj0Var;
        uj0Var.r1();
        this.a.setItemSelectorColorProvider(new mt0(this));
        this.a.setSectionsDrawBackground(true);
        this.a.setEmptyView(this.d);
        org.telegram.ui.Components.uj0 uj0Var2 = this.a;
        v4.b0 b0Var = new v4.b0(1, false);
        this.b = b0Var;
        uj0Var2.setLayoutManager(b0Var);
        this.a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.uj0 uj0Var3 = this.a;
        ot0 ot0Var = new ot0(this, context);
        this.c = ot0Var;
        uj0Var3.setAdapter(ot0Var);
        this.a.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        frameLayout.addView(this.a, c8.ja.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ja.c(-1.0f, -1));
        int i10 = 27;
        this.a.setOnItemClickListener(new h(this, i10));
        this.a.setOnItemLongClickListener(new mt0(this));
        if (i7 == 1) {
            this.a.setOnScrollListener(new g3(this, i10));
            if (getMessagesController().I0 < 0) {
                this.d.b();
            } else {
                this.d.c();
            }
        }
        a0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.uj0 uj0Var;
        if (i7 != org.telegram.messenger.ns.r) {
            if (i7 == org.telegram.messenger.ns.g0) {
                this.d.c();
                a0();
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[0]).intValue();
        int i11 = org.telegram.messenger.np.D8;
        if (((intValue & 2) == 0 && (intValue & 1) == 0) || (uj0Var = this.a) == null) {
            return;
        }
        int childCount = uj0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.a.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.a5) {
                ((org.telegram.ui.Cells.a5) childAt).d(intValue);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(17, this);
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 16, new Class[]{org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.n4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.r);
        if (this.E == 1) {
            org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.g0);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.r);
        if (this.E == 1) {
            org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.g0);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        ot0 ot0Var = this.c;
        if (ot0Var != null) {
            ot0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.ny nyVar = this.d;
            if (nyVar != null) {
                nyVar.setProgressBarColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
