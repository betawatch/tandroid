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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public int D;
    public int E;
    public int F;
    public int G;
    public final int H;
    public boolean I;
    public final a0.h a;
    public m b;
    public org.telegram.ui.Components.xy c;
    public s4.a0 d;
    public org.telegram.ui.Components.tk0 e;
    public final HashSet f;
    public final ArrayList h;
    public boolean n;
    public boolean r;
    public boolean s;
    public mh.k w;
    public int x;
    public int y;

    public n(int i10) {
        super(null);
        this.a = new a0.h();
        this.f = new HashSet();
        this.h = new ArrayList();
        this.H = i10;
    }

    public final void a0() {
        if (this.I || this.r) {
            return;
        }
        this.I = true;
        org.telegram.ui.Components.xy xyVar = this.c;
        if (xyVar != null && !this.n) {
            xyVar.b();
        }
        m mVar = this.b;
        if (mVar != null) {
            mVar.f();
        }
        TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
        ArrayList arrayList = this.h;
        tL_messages_getArchivedStickers.offset_id = arrayList.isEmpty() ? 0L : ((TLRPC.StickerSetCovered) i0.a.g(1, arrayList)).set.id;
        tL_messages_getArchivedStickers.limit = 15;
        int i10 = this.H;
        tL_messages_getArchivedStickers.masks = i10 == 1;
        tL_messages_getArchivedStickers.emojis = i10 == 5;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new k(this, 0)), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    public final void b0(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        if (this.s) {
            this.w = new mh.k(29, this, tL_messages_archivedStickers);
            return;
        }
        ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i11);
            i11++;
            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
            Long valueOf = Long.valueOf(stickerSetCovered2.set.id);
            HashSet hashSet = this.f;
            if (!hashSet.contains(valueOf)) {
                hashSet.add(Long.valueOf(stickerSetCovered2.set.id));
                this.h.add(stickerSetCovered2);
                i10++;
            }
        }
        this.r = i10 <= 0;
        this.I = false;
        this.n = true;
        org.telegram.ui.Components.xy xyVar = this.c;
        if (xyVar != null) {
            xyVar.c();
        }
        c0();
        m mVar = this.b;
        if (mVar != null) {
            mVar.f();
        }
    }

    public final void c0() {
        int i10;
        this.G = 0;
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.x = -1;
            this.y = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            return;
        }
        int i11 = this.H;
        if (i11 == 0 || i11 == 5) {
            i10 = this.G;
            this.G = i10 + 1;
        } else {
            i10 = -1;
        }
        this.x = i10;
        int i12 = this.G;
        this.y = i12;
        this.D = arrayList.size() + i12;
        int size = arrayList.size() + this.G;
        this.G = size;
        if (this.r) {
            this.G = size + 1;
            this.F = size;
            this.E = -1;
        } else {
            this.G = size + 1;
            this.E = size;
            this.F = -1;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = this.H;
        if (i11 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131754128, null));
        } else if (i11 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131754134, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131754133, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 12));
        this.b = new m(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.c = xyVar;
        if (i11 == 0) {
            xyVar.setText(org.telegram.messenger.cd.L0(2131754125, null));
        } else {
            xyVar.setText(org.telegram.messenger.cd.L0(2131754130, null));
        }
        if (this.I) {
            this.c.b();
        } else {
            this.c.c();
        }
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.e = tk0Var;
        tk0Var.setFocusable(true);
        this.e.setEmptyView(this.c);
        org.telegram.ui.Components.tk0 tk0Var2 = this.e;
        s4.a0 a0Var = new s4.a0(1, false);
        this.d = a0Var;
        tk0Var2.setLayoutManager(a0Var);
        this.e.r1();
        this.e.setSectionsDrawBackground(true);
        frameLayout.addView(this.e, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.c, w7.b6.c(-1.0f, -1));
        this.e.setAdapter(this.b);
        this.e.setOnItemClickListener(new g(this, i10));
        this.e.setOnScrollListener(new h3(this, i10));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.tk0 tk0Var;
        org.telegram.ui.Cells.v vVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i10 != org.telegram.messenger.zs.Y0) {
            if (i10 != org.telegram.messenger.zs.x0 || (tk0Var = this.e) == null) {
                return;
            }
            int childCount = tk0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.e.getChildAt(i12);
                if ((childAt instanceof org.telegram.ui.Cells.v) && (stickersSet = (vVar = (org.telegram.ui.Cells.v) childAt).getStickersSet()) != null) {
                    boolean B0 = org.telegram.messenger.ui.b0(this.currentAccount).B0(stickersSet.set.id, true);
                    if (B0) {
                        this.a.l(stickersSet.set.id);
                        org.telegram.ui.Components.ch0 ch0Var = vVar.f;
                        if (ch0Var != null) {
                            ch0Var.a(false, true);
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
            int i13 = 0;
            while (true) {
                if (i13 >= size2) {
                    break;
                }
                if (((TLRPC.StickerSetCovered) arrayList.get(i13)).set.id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.id) {
                    arrayList2.remove(size);
                    break;
                }
                i13++;
            }
            size--;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.addAll(0, arrayList2);
        c0();
        m mVar = this.b;
        if (mVar != null) {
            mVar.o(this.y, arrayList2.size());
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.e;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.c7));
        org.telegram.ui.Components.xy xyVar = this.c;
        int i10 = org.telegram.ui.ActionBar.t6.h6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(xyVar, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.e, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.e, 196608, new Class[]{org.telegram.ui.Cells.v.class}, new String[]{"addButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ei));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        a0();
        c0();
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.Y0);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.x0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.Y0);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.x0);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        m mVar = this.b;
        if (mVar != null) {
            mVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.xy xyVar = this.c;
            if (xyVar != null) {
                xyVar.setProgressBarColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h6, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.s = false;
        mh.k kVar = this.w;
        if (kVar != null) {
            kVar.run();
            this.w = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.s = true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
