package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public final int D;
    public boolean E;
    public final a0.h a;
    public o b;
    public org.telegram.ui.Components.yy c;
    public f2.m0 d;
    public org.telegram.ui.Components.wk0 e;
    public final HashSet f;
    public final ArrayList h;
    public boolean n;
    public boolean r;
    public boolean s;
    public org.telegram.messenger.voip.l0 v;
    public int w;
    public int x;
    public int y;

    public p(int i9) {
        super(null);
        this.a = new a0.h();
        this.f = new HashSet();
        this.h = new ArrayList();
        this.D = i9;
    }

    public final void V() {
        if (this.E || this.r) {
            return;
        }
        this.E = true;
        org.telegram.ui.Components.yy yyVar = this.c;
        if (yyVar != null && !this.n) {
            yyVar.b();
        }
        o oVar = this.b;
        if (oVar != null) {
            oVar.l();
        }
        TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
        ArrayList arrayList = this.h;
        tL_messages_getArchivedStickers.offset_id = arrayList.isEmpty() ? 0L : ((TLRPC.StickerSetCovered) j3.r0.j(1, arrayList)).set.id;
        tL_messages_getArchivedStickers.limit = 15;
        int i9 = this.D;
        tL_messages_getArchivedStickers.masks = i9 == 1;
        tL_messages_getArchivedStickers.emojis = i9 == 5;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new m(this, 0)), this.classGuid);
    }

    public final void W(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        if (this.s) {
            this.v = new org.telegram.messenger.voip.l0(9, this, tL_messages_archivedStickers);
            return;
        }
        ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
        int size = arrayList.size();
        int i9 = 0;
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
                i9++;
            }
        }
        this.r = i9 <= 0;
        this.E = false;
        this.n = true;
        org.telegram.ui.Components.yy yyVar = this.c;
        if (yyVar != null) {
            yyVar.c();
        }
        X();
        o oVar = this.b;
        if (oVar != null) {
            oVar.l();
        }
    }

    public final void X() {
        int i9;
        this.C = 0;
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.A = -1;
            this.B = -1;
            return;
        }
        int i10 = this.D;
        if (i10 == 0 || i10 == 5) {
            i9 = this.C;
            this.C = i9 + 1;
        } else {
            i9 = -1;
        }
        this.w = i9;
        int i11 = this.C;
        this.x = i11;
        this.y = arrayList.size() + i11;
        int size = arrayList.size() + this.C;
        this.C = size;
        if (this.r) {
            this.C = size + 1;
            this.B = size;
            this.A = -1;
        } else {
            this.C = size + 1;
            this.A = size;
            this.B = -1;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i9 = this.D;
        if (i9 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedStickers));
        } else if (i9 == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedEmojiPacks));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedMasks));
        }
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 14));
        this.b = new o(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(context, null);
        this.c = yyVar;
        if (i9 == 0) {
            yyVar.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            yyVar.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        frameLayout.addView(this.c, g7.e6.c(-1.0f, -1));
        if (this.E) {
            this.c.b();
        } else {
            this.c.c();
        }
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.e = wk0Var;
        wk0Var.setFocusable(true);
        this.e.setEmptyView(this.c);
        org.telegram.ui.Components.wk0 wk0Var2 = this.e;
        f2.m0 m0Var = new f2.m0(1, false);
        this.d = m0Var;
        wk0Var2.setLayoutManager(m0Var);
        this.e.p1();
        this.actionBar.setAdaptiveBackground(this.e);
        frameLayout.addView(this.e, g7.e6.c(-1.0f, -1));
        this.e.setAdapter(this.b);
        int i10 = 1;
        this.e.setOnItemClickListener(new i(this, i10));
        this.e.setOnScrollListener(new l3(this, i10));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.Components.wk0 wk0Var;
        org.telegram.ui.Cells.w wVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i9 != NotificationCenter.needAddArchivedStickers) {
            if (i9 != NotificationCenter.stickersDidLoad || (wk0Var = this.e) == null) {
                return;
            }
            int childCount = wk0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.e.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.w) && (stickersSet = (wVar = (org.telegram.ui.Cells.w) childAt).getStickersSet()) != null) {
                    boolean isStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.id);
                    if (isStickerPackInstalled) {
                        this.a.l(stickersSet.set.id);
                        org.telegram.ui.Components.jh0 jh0Var = wVar.f;
                        if (jh0Var != null) {
                            jh0Var.a(false, true);
                        }
                    }
                    wVar.a(isStickerPackInstalled, true, false);
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
        X();
        o oVar = this.b;
        if (oVar != null) {
            oVar.s(this.x, arrayList2.size());
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 16, new Class[]{org.telegram.ui.Cells.w.class}, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.c7));
        org.telegram.ui.Components.yy yyVar = this.c;
        int i9 = org.telegram.ui.ActionBar.f6.h6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(yyVar, 2048, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        int i10 = org.telegram.ui.ActionBar.f6.Rh;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 131072, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Qh));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        V();
        X();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.needAddArchivedStickers);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.needAddArchivedStickers);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.e.setPadding(0, 0, 0, i12);
        this.e.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        o oVar = this.b;
        if (oVar != null) {
            oVar.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.s = false;
        org.telegram.messenger.voip.l0 l0Var = this.v;
        if (l0Var != null) {
            l0Var.run();
            this.v = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.s = true;
    }
}
