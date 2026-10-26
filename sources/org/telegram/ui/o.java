package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public final int H;
    public boolean I;
    public final a0.h a;
    public n b;
    public org.telegram.ui.Components.uz c;
    public s4.c0 d;
    public org.telegram.ui.Components.mm0 e;
    public final HashSet f;
    public final ArrayList h;
    public boolean n;
    public boolean r;
    public boolean s;
    public org.telegram.messenger.voip.m0 v;
    public int w;
    public int x;
    public int y;

    public o(int i10) {
        super(null);
        this.a = new a0.h();
        this.f = new HashSet();
        this.h = new ArrayList();
        this.H = i10;
    }

    public final void X() {
        if (this.I || this.r) {
            return;
        }
        this.I = true;
        org.telegram.ui.Components.uz uzVar = this.c;
        if (uzVar != null && !this.n) {
            uzVar.b();
        }
        n nVar = this.b;
        if (nVar != null) {
            nVar.l();
        }
        TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
        ArrayList arrayList = this.h;
        tL_messages_getArchivedStickers.offset_id = arrayList.isEmpty() ? 0L : ((TLRPC.StickerSetCovered) ic.a.g(1, arrayList)).set.id;
        tL_messages_getArchivedStickers.limit = 15;
        int i10 = this.H;
        tL_messages_getArchivedStickers.masks = i10 == 1;
        tL_messages_getArchivedStickers.emojis = i10 == 5;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new l(this, 0)), this.classGuid);
    }

    public final void Y(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        if (this.s) {
            this.v = new org.telegram.messenger.voip.m0(10, this, tL_messages_archivedStickers);
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
        org.telegram.ui.Components.uz uzVar = this.c;
        if (uzVar != null) {
            uzVar.c();
        }
        Z();
        n nVar = this.b;
        if (nVar != null) {
            nVar.l();
        }
    }

    public final void Z() {
        int i10;
        this.G = 0;
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.w = -1;
            this.x = -1;
            this.y = -1;
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
        this.w = i10;
        int i12 = this.G;
        this.x = i12;
        this.y = arrayList.size() + i12;
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

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Sh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Rh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.H;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.ArchivedStickers));
        } else if (i10 == 5) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.ArchivedEmojiPacks));
        } else {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.ArchivedMasks));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 21));
        this.b = new n(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.c = uzVar;
        if (i10 == 0) {
            uzVar.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            uzVar.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        if (this.I) {
            this.c.b();
        } else {
            this.c.c();
        }
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.e = mm0Var;
        mm0Var.setFocusable(true);
        this.e.setEmptyView(this.c);
        org.telegram.ui.Components.mm0 mm0Var2 = this.e;
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        mm0Var2.setLayoutManager(c0Var);
        this.e.u1();
        this.e.setSectionsDrawBackground(true);
        frameLayout.addView(this.e, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        frameLayout.addView(this.c, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.e.setAdapter(this.b);
        int i11 = 1;
        this.e.setOnItemClickListener(new h(this, i11));
        this.e.setOnScrollListener(new i3(this, i11));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.mm0 mm0Var;
        org.telegram.ui.Cells.v vVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i10 != NotificationCenter.needAddArchivedStickers) {
            if (i10 != NotificationCenter.stickersDidLoad || (mm0Var = this.e) == null) {
                return;
            }
            int childCount = mm0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.e.getChildAt(i12);
                if ((childAt instanceof org.telegram.ui.Cells.v) && (stickersSet = (vVar = (org.telegram.ui.Cells.v) childAt).getStickersSet()) != null) {
                    boolean isStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.id);
                    if (isStickerPackInstalled) {
                        this.a.l(stickersSet.set.id);
                        org.telegram.ui.Components.wi0 wi0Var = vVar.f;
                        if (wi0Var != null) {
                            wi0Var.a(false, true);
                        }
                    }
                    vVar.a(isStickerPackInstalled, true, false);
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
        Z();
        n nVar = this.b;
        if (nVar != null) {
            nVar.s(this.x, arrayList2.size());
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.e;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.c7));
        org.telegram.ui.Components.uz uzVar = this.c;
        int i10 = org.telegram.ui.ActionBar.y6.h6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(uzVar, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e, 196608, new Class[]{org.telegram.ui.Cells.v.class}, new String[]{"addButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Qh));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        X();
        Z();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.needAddArchivedStickers);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.needAddArchivedStickers);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        n nVar = this.b;
        if (nVar != null) {
            nVar.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.uz uzVar = this.c;
            if (uzVar != null) {
                uzVar.setProgressBarColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h6, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.s = false;
        org.telegram.messenger.voip.m0 m0Var = this.v;
        if (m0Var != null) {
            m0Var.run();
            this.v = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.s = true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
