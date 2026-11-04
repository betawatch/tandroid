package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public int E;
    public int F;
    public int G;
    public int H;
    public final int I;
    public boolean J;
    public final a0.h a;
    public n b;
    public org.telegram.ui.Components.gy c;
    public u4.b0 d;
    public org.telegram.ui.Components.tj0 e;
    public final HashSet f;
    public final ArrayList h;
    public boolean n;
    public boolean r;
    public boolean s;
    public org.telegram.messenger.voip.l0 w;
    public int x;
    public int y;

    public o(int i3) {
        super(null);
        this.a = new a0.h();
        this.f = new HashSet();
        this.h = new ArrayList();
        this.I = i3;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    public final void b0() {
        if (this.J || this.r) {
            return;
        }
        this.J = true;
        org.telegram.ui.Components.gy gyVar = this.c;
        if (gyVar != null && !this.n) {
            gyVar.b();
        }
        n nVar = this.b;
        if (nVar != null) {
            nVar.f();
        }
        TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
        ArrayList arrayList = this.h;
        tL_messages_getArchivedStickers.offset_id = arrayList.isEmpty() ? 0L : ((TLRPC.StickerSetCovered) k2.p1.h(1, arrayList)).set.id;
        tL_messages_getArchivedStickers.limit = 15;
        int i3 = this.I;
        tL_messages_getArchivedStickers.masks = i3 == 1;
        tL_messages_getArchivedStickers.emojis = i3 == 5;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new l(this, 0)), this.classGuid);
    }

    public final void c0(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        if (this.s) {
            this.w = new org.telegram.messenger.voip.l0(10, this, tL_messages_archivedStickers);
            return;
        }
        ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i10);
            i10++;
            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
            Long valueOf = Long.valueOf(stickerSetCovered2.set.id);
            HashSet hashSet = this.f;
            if (!hashSet.contains(valueOf)) {
                hashSet.add(Long.valueOf(stickerSetCovered2.set.id));
                this.h.add(stickerSetCovered2);
                i3++;
            }
        }
        this.r = i3 <= 0;
        this.J = false;
        this.n = true;
        org.telegram.ui.Components.gy gyVar = this.c;
        if (gyVar != null) {
            gyVar.c();
        }
        d0();
        n nVar = this.b;
        if (nVar != null) {
            nVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.I;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131754128, null));
        } else if (i10 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131754134, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131754133, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ai.g5(this, 23));
        this.b = new n(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.c = gyVar;
        if (i10 == 0) {
            gyVar.setText(org.telegram.messenger.bd.M0(2131754125, null));
        } else {
            gyVar.setText(org.telegram.messenger.bd.M0(2131754130, null));
        }
        if (this.J) {
            this.c.b();
        } else {
            this.c.c();
        }
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.e = tj0Var;
        tj0Var.setFocusable(true);
        this.e.setEmptyView(this.c);
        org.telegram.ui.Components.tj0 tj0Var2 = this.e;
        u4.b0 b0Var = new u4.b0(1, false);
        this.d = b0Var;
        tj0Var2.setLayoutManager(b0Var);
        this.e.r1();
        this.e.setSectionsDrawBackground(true);
        frameLayout.addView(this.e, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.c, b8.mf.c(-1.0f, -1));
        this.e.setAdapter(this.b);
        this.e.setOnItemClickListener(new h(this, i3));
        this.e.setOnScrollListener(new h3(this, i3));
        return this.fragmentView;
    }

    public final void d0() {
        int i3;
        this.H = 0;
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.x = -1;
            this.y = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            return;
        }
        int i10 = this.I;
        if (i10 == 0 || i10 == 5) {
            i3 = this.H;
            this.H = i3 + 1;
        } else {
            i3 = -1;
        }
        this.x = i3;
        int i11 = this.H;
        this.y = i11;
        this.E = arrayList.size() + i11;
        int size = arrayList.size() + this.H;
        this.H = size;
        if (this.r) {
            this.H = size + 1;
            this.G = size;
            this.F = -1;
        } else {
            this.H = size + 1;
            this.F = size;
            this.G = -1;
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.Components.tj0 tj0Var;
        org.telegram.ui.Cells.v vVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i3 != org.telegram.messenger.hs.Y0) {
            if (i3 != org.telegram.messenger.hs.x0 || (tj0Var = this.e) == null) {
                return;
            }
            int childCount = tj0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.e.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.v) && (stickersSet = (vVar = (org.telegram.ui.Cells.v) childAt).getStickersSet()) != null) {
                    boolean B0 = org.telegram.messenger.li.b0(this.currentAccount).B0(stickersSet.set.id, true);
                    if (B0) {
                        this.a.l(stickersSet.set.id);
                        org.telegram.ui.Components.dg0 dg0Var = vVar.f;
                        if (dg0Var != null) {
                            dg0Var.a(false, true);
                        }
                    }
                    vVar.a(B0, true, false);
                }
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList((List) objArr[0]);
        int size = arrayList2.size() - 1;
        while (true) {
            arrayList = this.h;
            if (size < 0) {
                break;
            }
            int size2 = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                if (((TLRPC.StickerSetCovered) arrayList.get(i12)).set.id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.id) {
                    arrayList2.remove(size);
                    break;
                }
                i12++;
            }
            size--;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.addAll(0, arrayList2);
        d0();
        n nVar = this.b;
        if (nVar != null) {
            nVar.o(this.y, arrayList2.size());
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.e;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.c7));
        org.telegram.ui.Components.gy gyVar = this.c;
        int i3 = org.telegram.ui.ActionBar.k6.h6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(gyVar, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 196608, new Class[]{org.telegram.ui.Cells.v.class}, new String[]{"addButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ei));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        b0();
        d0();
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.Y0);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.x0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.Y0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.x0);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        n nVar = this.b;
        if (nVar != null) {
            nVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.gy gyVar = this.c;
            if (gyVar != null) {
                gyVar.setProgressBarColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.s = false;
        org.telegram.messenger.voip.l0 l0Var = this.w;
        if (l0Var != null) {
            l0Var.run();
            this.w = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.s = true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
