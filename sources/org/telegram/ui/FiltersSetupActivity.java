package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public m10 a;
    public r10 b;
    public s4.z c;
    public UndoView d;
    public boolean e;
    public boolean f;
    public final ArrayList h;
    public final ArrayList n;
    public int r;
    public int s;
    private int showTagsRow;
    public int v;
    public int w;
    public boolean x;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.s = -1;
        this.v = -1;
    }

    public static void V(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i10) {
        p10 p10Var;
        ArrayList arrayList = filtersSetupActivity.n;
        if (i10 < 0 || i10 >= arrayList.size() || (p10Var = (p10) arrayList.get(i10)) == null) {
            return;
        }
        int i11 = p10Var.a;
        if (i11 == 6) {
            if (!filtersSetupActivity.getUserConfig().isPremium()) {
                filtersSetupActivity.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) filtersSetupActivity, 35, true));
                return;
            }
            TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
            tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().folderTags;
            filtersSetupActivity.getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
            filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new l10(0, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
            ((org.telegram.ui.Cells.a9) view).setChecked(filtersSetupActivity.getMessagesController().folderTags);
            r10 r10Var = filtersSetupActivity.b;
            int i12 = filtersSetupActivity.s;
            r10Var.q(i12, filtersSetupActivity.v - i12);
            return;
        }
        if (i11 != 2) {
            if (i11 == 4) {
                filtersSetupActivity.Z(filtersSetupActivity.getParentLayout());
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter = p10Var.d;
        if (dialogFilter == null || dialogFilter.isDefault()) {
            return;
        }
        if (dialogFilter.locked) {
            filtersSetupActivity.showDialog(new tg.j0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
        } else {
            filtersSetupActivity.presentFragment(new q00(dialogFilter, null));
        }
    }

    public final void Z(org.telegram.ui.ActionBar.j5 j5Var) {
        int size = getMessagesController().getDialogFilters().size();
        if ((size - 1 >= getMessagesController().dialogFiltersLimitDefault && !getUserConfig().isPremium()) || size >= getMessagesController().dialogFiltersLimitPremium) {
            showDialog(new tg.j0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (j5Var != null) {
            ((ActionBarLayout) j5Var).R(new q00(null, null));
        }
    }

    public final UndoView a0() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            FrameLayout frameLayout = (FrameLayout) this.fragmentView;
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            frameLayout.addView(undoView, org.telegram.ui.Components.kb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    public final void b0(k10 k10Var) {
        if (!this.e) {
            if (k10Var != null) {
                k10Var.run();
                return;
            }
            return;
        }
        int i10 = 0;
        this.e = false;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        getMessagesStorage().saveDialogFiltersOrder();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int size = dialogFilters.size();
        while (i10 < size) {
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(i10);
            i10 = c3.h0.i(dialogFilter.id, i10, 1, tL_messages_updateDialogFiltersOrder.order);
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new l(k10Var, 8));
    }

    public final void c0(boolean z10) {
        this.showTagsRow = -1;
        m10 m10Var = this.a;
        if (m10Var != null) {
            ArrayList arrayList = m10Var.K2;
            if (arrayList == null) {
                m10Var.K2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList<TLRPC.TL_dialogFilterSuggested> arrayList4 = getMessagesController().suggestedFilters;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        arrayList3.add(new p10(1, false));
        if (!arrayList4.isEmpty() && dialogFilters.size() < 10) {
            int size = arrayList3.size();
            String string = LocaleController.getString(R.string.FilterRecommended);
            p10 p10Var = new p10(0, false);
            p10Var.c = string;
            arrayList3.add(p10Var);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = arrayList4.get(i10);
                p10 p10Var2 = new p10(5, false);
                p10Var2.e = tL_dialogFilterSuggested;
                arrayList3.add(p10Var2);
            }
            m10 m10Var2 = this.a;
            if (m10Var2 != null) {
                m10Var2.K2.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            p10 p10Var3 = new p10(3, false);
            p10Var3.c = null;
            arrayList3.add(p10Var3);
        }
        if (dialogFilters.isEmpty()) {
            this.v = -1;
            this.s = -1;
        } else {
            this.s = arrayList3.size();
            String string2 = LocaleController.getString(R.string.Filters);
            p10 p10Var4 = new p10(0, false);
            p10Var4.c = string2;
            arrayList3.add(p10Var4);
            this.r = arrayList3.size();
            for (int i11 = 0; i11 < dialogFilters.size(); i11++) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i11);
                p10 p10Var5 = new p10(2, false);
                p10Var5.d = dialogFilter;
                arrayList3.add(p10Var5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i11).color >= 0) {
                    this.x = true;
                }
            }
            int size2 = arrayList3.size();
            this.v = size2;
            m10 m10Var3 = this.a;
            if (m10Var3 != null) {
                m10Var3.K2.add(Long.valueOf(AndroidUtilities.pack(this.s, (size2 - 1) + (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium ? 0 : 1))));
            }
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string3 = LocaleController.getString(R.string.CreateNewFilter);
            p10 p10Var6 = new p10(4, false);
            p10Var6.c = string3;
            arrayList3.add(p10Var6);
        }
        p10 p10Var7 = new p10(3, false);
        p10Var7.c = null;
        arrayList3.add(p10Var7);
        this.w = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String string4 = LocaleController.getString(R.string.FolderShowTags);
        p10 p10Var8 = new p10(6, false);
        p10Var8.c = string4;
        arrayList3.add(p10Var8);
        CharSequence replaceSingleTag = !getUserConfig().isPremium() ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), org.telegram.ui.ActionBar.y6.L6, 2, new k10(this, 0)) : LocaleController.getString(R.string.FolderShowTagsInfo);
        p10 p10Var9 = new p10(3, false);
        p10Var9.c = replaceSingleTag;
        arrayList3.add(p10Var9);
        r10 r10Var = this.b;
        if (r10Var != null) {
            if (z10) {
                r10Var.E(arrayList2, arrayList3);
            } else {
                r10Var.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Filters));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 29));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        m10 m10Var = new m10(0, context, this);
        this.a = m10Var;
        m10Var.u1();
        this.a.setClipChildren(false);
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.m = false;
        this.a.setItemAnimator(lVar);
        this.a.setSectionsDrawBackground(true);
        ((s4.l) this.a.getItemAnimator()).C = false;
        this.a.setLayoutManager(new s4.c0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        s4.z zVar = new s4.z(new u10(this));
        this.c = zVar;
        zVar.h(this.a);
        frameLayout.addView(this.a, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        m10 m10Var2 = this.a;
        r10 r10Var = new r10(this, context);
        this.b = r10Var;
        m10Var2.setAdapter(r10Var);
        this.a.setOnItemClickListener(new org.telegram.ui.Components.voip.k1(11, this, context));
        if (this.f) {
            c0(false);
            this.f = false;
            this.a.v0(this.b.h() - 1);
            AndroidUtilities.runOnUIThread(new k10(this, 1), 200L);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogFiltersUpdated) {
            c0(true);
        } else if (i10 == NotificationCenter.suggestedFiltersLoaded) {
            c0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 16, new Class[]{org.telegram.ui.Cells.q4.class, t10.class, s10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 196608, new Class[]{n10.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Vh));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        c0(false);
        getMessagesController().loadRemoteFilters(true);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.dialogFiltersUpdated);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.suggestedFiltersLoaded);
        if (getMessagesController().suggestedFilters.isEmpty()) {
            getMessagesController().loadSuggestedFilters();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogFiltersUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.suggestedFiltersLoaded);
        b0(null);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        r10 r10Var = this.b;
        if (r10Var != null) {
            r10Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
