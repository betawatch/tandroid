package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public gh.f1 a;
    public l10 b;
    public f2.h0 c;
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

    public static void T(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i9) {
        j10 j10Var;
        ArrayList arrayList = filtersSetupActivity.n;
        if (i9 < 0 || i9 >= arrayList.size() || (j10Var = (j10) arrayList.get(i9)) == null) {
            return;
        }
        int i10 = j10Var.a;
        if (i10 == 6) {
            if (!filtersSetupActivity.getUserConfig().isPremium()) {
                filtersSetupActivity.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) filtersSetupActivity, 35, true));
                return;
            }
            TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
            tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().folderTags;
            filtersSetupActivity.getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
            filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new rc(29, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
            ((org.telegram.ui.Cells.t8) view).setChecked(filtersSetupActivity.getMessagesController().folderTags);
            l10 l10Var = filtersSetupActivity.b;
            int i11 = filtersSetupActivity.s;
            l10Var.q(i11, filtersSetupActivity.v - i11);
            return;
        }
        if (i10 != 2) {
            if (i10 == 4) {
                filtersSetupActivity.W(filtersSetupActivity.getParentLayout());
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter = j10Var.d;
        if (dialogFilter == null || dialogFilter.isDefault()) {
            return;
        }
        if (dialogFilter.locked) {
            filtersSetupActivity.showDialog(new zf.j0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
        } else {
            filtersSetupActivity.presentFragment(new n00(dialogFilter, null));
        }
    }

    public final void W(org.telegram.ui.ActionBar.b5 b5Var) {
        int size = getMessagesController().getDialogFilters().size();
        if ((size - 1 >= getMessagesController().dialogFiltersLimitDefault && !getUserConfig().isPremium()) || size >= getMessagesController().dialogFiltersLimitPremium) {
            showDialog(new zf.j0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (b5Var != null) {
            ((ActionBarLayout) b5Var).P(new n00(null, null));
        }
    }

    public final UndoView X() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            FrameLayout frameLayout = (FrameLayout) this.fragmentView;
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            frameLayout.addView(undoView, g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void Y(boolean z10) {
        this.showTagsRow = -1;
        gh.f1 f1Var = this.a;
        if (f1Var != null) {
            ArrayList arrayList = f1Var.G2;
            if (arrayList == null) {
                f1Var.G2 = new ArrayList();
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
        arrayList3.add(new j10(1, false));
        if (!arrayList4.isEmpty() && dialogFilters.size() < 10) {
            int size = arrayList3.size();
            String string = LocaleController.getString(R.string.FilterRecommended);
            j10 j10Var = new j10(0, false);
            j10Var.c = string;
            arrayList3.add(j10Var);
            for (int i9 = 0; i9 < arrayList4.size(); i9++) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = arrayList4.get(i9);
                j10 j10Var2 = new j10(5, false);
                j10Var2.e = tL_dialogFilterSuggested;
                arrayList3.add(j10Var2);
            }
            gh.f1 f1Var2 = this.a;
            if (f1Var2 != null) {
                f1Var2.G2.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            j10 j10Var3 = new j10(3, false);
            j10Var3.c = null;
            arrayList3.add(j10Var3);
        }
        if (dialogFilters.isEmpty()) {
            this.v = -1;
            this.s = -1;
        } else {
            this.s = arrayList3.size();
            String string2 = LocaleController.getString(R.string.Filters);
            j10 j10Var4 = new j10(0, false);
            j10Var4.c = string2;
            arrayList3.add(j10Var4);
            this.r = arrayList3.size();
            for (int i10 = 0; i10 < dialogFilters.size(); i10++) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i10);
                j10 j10Var5 = new j10(2, false);
                j10Var5.d = dialogFilter;
                arrayList3.add(j10Var5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i10).color >= 0) {
                    this.x = true;
                }
            }
            int size2 = arrayList3.size();
            this.v = size2;
            gh.f1 f1Var3 = this.a;
            if (f1Var3 != null) {
                f1Var3.G2.add(Long.valueOf(AndroidUtilities.pack(this.s, (size2 - 1) + (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium ? 0 : 1))));
            }
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string3 = LocaleController.getString(R.string.CreateNewFilter);
            j10 j10Var6 = new j10(4, false);
            j10Var6.c = string3;
            arrayList3.add(j10Var6);
        }
        j10 j10Var7 = new j10(3, false);
        j10Var7.c = null;
        arrayList3.add(j10Var7);
        this.w = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String string4 = LocaleController.getString(R.string.FolderShowTags);
        j10 j10Var8 = new j10(6, false);
        j10Var8.c = string4;
        arrayList3.add(j10Var8);
        CharSequence replaceSingleTag = !getUserConfig().isPremium() ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), org.telegram.ui.ActionBar.f6.L6, 2, new g10(this, 0)) : LocaleController.getString(R.string.FolderShowTagsInfo);
        j10 j10Var9 = new j10(3, false);
        j10Var9.c = replaceSingleTag;
        arrayList3.add(j10Var9);
        l10 l10Var = this.b;
        if (l10Var != null) {
            if (z10) {
                l10Var.E(arrayList2, arrayList3);
            } else {
                l10Var.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Filters));
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 19));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        gh.f1 f1Var = new gh.f1(this, context, 29);
        this.a = f1Var;
        f1Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        f2.n nVar = new f2.n();
        nVar.n(350L);
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.C = false;
        nVar.m = false;
        this.a.setItemAnimator(nVar);
        ((f2.n) this.a.getItemAnimator()).C = false;
        this.a.setLayoutManager(new f2.m0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        f2.h0 h0Var = new f2.h0(new o10(this));
        this.c = h0Var;
        h0Var.d(this.a);
        frameLayout.addView(this.a, g7.e6.c(-1.0f, -1));
        gh.f1 f1Var2 = this.a;
        l10 l10Var = new l10(this, context);
        this.b = l10Var;
        f1Var2.setAdapter(l10Var);
        this.a.setOnItemClickListener(new yr(9, this, context));
        if (this.f) {
            Y(false);
            this.f = false;
            this.a.u0(this.b.h() - 1);
            AndroidUtilities.runOnUIThread(new g10(this, 1), 200L);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.dialogFiltersUpdated) {
            Y(true);
        } else if (i9 == NotificationCenter.suggestedFiltersLoaded) {
            Y(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 16, new Class[]{org.telegram.ui.Cells.m4.class, n10.class, h10.class, m10.class}, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{h10.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{h10.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.z6));
        int i9 = org.telegram.ui.ActionBar.f6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{h10.class}, new String[]{"moveImageView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{h10.class}, new String[]{"optionsImageView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 196608, new Class[]{h10.class}, new String[]{"optionsImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{n10.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 32, new Class[]{n10.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 0, new Class[]{n10.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.k7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        Y(false);
        getMessagesController().loadRemoteFilters(true);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogFiltersUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.suggestedFiltersLoaded);
        if (getMessagesController().suggestedFilters.isEmpty()) {
            getMessagesController().loadSuggestedFilters();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        NotificationCenter notificationCenter = getNotificationCenter();
        int i9 = NotificationCenter.dialogFiltersUpdated;
        notificationCenter.removeObserver(this, i9);
        getNotificationCenter().removeObserver(this, NotificationCenter.suggestedFiltersLoaded);
        if (this.e) {
            int i10 = 0;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i9, new Object[0]);
            getMessagesStorage().saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            while (i10 < size) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i10);
                i10 = j3.r0.e(dialogFilter.id, i10, 1, tL_messages_updateDialogFiltersOrder.order);
            }
            getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new ih.q5(5));
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.a.setPadding(0, 0, 0, i12);
        this.a.setClipToPadding(false);
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        l10 l10Var = this.b;
        if (l10Var != null) {
            l10Var.l();
        }
    }
}
