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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public i10 a;
    public n10 b;
    public s4.y c;
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

    public static void U(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i10) {
        l10 l10Var;
        ArrayList arrayList = filtersSetupActivity.n;
        if (i10 < 0 || i10 >= arrayList.size() || (l10Var = (l10) arrayList.get(i10)) == null) {
            return;
        }
        int i11 = l10Var.a;
        if (i11 == 6) {
            if (!filtersSetupActivity.getUserConfig().isPremium()) {
                filtersSetupActivity.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) filtersSetupActivity, 35, true));
                return;
            }
            TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
            tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().folderTags;
            filtersSetupActivity.getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
            filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new xc(29, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
            ((org.telegram.ui.Cells.v8) view).setChecked(filtersSetupActivity.getMessagesController().folderTags);
            n10 n10Var = filtersSetupActivity.b;
            int i12 = filtersSetupActivity.s;
            n10Var.q(i12, filtersSetupActivity.v - i12);
            return;
        }
        if (i11 != 2) {
            if (i11 == 4) {
                filtersSetupActivity.X(filtersSetupActivity.getParentLayout());
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter = l10Var.d;
        if (dialogFilter == null || dialogFilter.isDefault()) {
            return;
        }
        if (dialogFilter.locked) {
            filtersSetupActivity.showDialog(new sg.k0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
        } else {
            filtersSetupActivity.presentFragment(new p00(dialogFilter, null));
        }
    }

    public final void X(org.telegram.ui.ActionBar.d5 d5Var) {
        int size = getMessagesController().getDialogFilters().size();
        if ((size - 1 >= getMessagesController().dialogFiltersLimitDefault && !getUserConfig().isPremium()) || size >= getMessagesController().dialogFiltersLimitPremium) {
            showDialog(new sg.k0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (d5Var != null) {
            ((ActionBarLayout) d5Var).P(new p00(null, null));
        }
    }

    public final UndoView Y() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            FrameLayout frameLayout = (FrameLayout) this.fragmentView;
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            frameLayout.addView(undoView, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void Z(boolean z10) {
        this.showTagsRow = -1;
        i10 i10Var = this.a;
        if (i10Var != null) {
            ArrayList arrayList = i10Var.I2;
            if (arrayList == null) {
                i10Var.I2 = new ArrayList();
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
        arrayList3.add(new l10(1, false));
        if (!arrayList4.isEmpty() && dialogFilters.size() < 10) {
            int size = arrayList3.size();
            String string = LocaleController.getString(R.string.FilterRecommended);
            l10 l10Var = new l10(0, false);
            l10Var.c = string;
            arrayList3.add(l10Var);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = arrayList4.get(i10);
                l10 l10Var2 = new l10(5, false);
                l10Var2.e = tL_dialogFilterSuggested;
                arrayList3.add(l10Var2);
            }
            i10 i10Var2 = this.a;
            if (i10Var2 != null) {
                i10Var2.I2.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            l10 l10Var3 = new l10(3, false);
            l10Var3.c = null;
            arrayList3.add(l10Var3);
        }
        if (dialogFilters.isEmpty()) {
            this.v = -1;
            this.s = -1;
        } else {
            this.s = arrayList3.size();
            String string2 = LocaleController.getString(R.string.Filters);
            l10 l10Var4 = new l10(0, false);
            l10Var4.c = string2;
            arrayList3.add(l10Var4);
            this.r = arrayList3.size();
            for (int i11 = 0; i11 < dialogFilters.size(); i11++) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i11);
                l10 l10Var5 = new l10(2, false);
                l10Var5.d = dialogFilter;
                arrayList3.add(l10Var5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i11).color >= 0) {
                    this.x = true;
                }
            }
            int size2 = arrayList3.size();
            this.v = size2;
            i10 i10Var3 = this.a;
            if (i10Var3 != null) {
                i10Var3.I2.add(Long.valueOf(AndroidUtilities.pack(this.s, (size2 - 1) + (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium ? 0 : 1))));
            }
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string3 = LocaleController.getString(R.string.CreateNewFilter);
            l10 l10Var6 = new l10(4, false);
            l10Var6.c = string3;
            arrayList3.add(l10Var6);
        }
        l10 l10Var7 = new l10(3, false);
        l10Var7.c = null;
        arrayList3.add(l10Var7);
        this.w = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String string4 = LocaleController.getString(R.string.FolderShowTags);
        l10 l10Var8 = new l10(6, false);
        l10Var8.c = string4;
        arrayList3.add(l10Var8);
        CharSequence replaceSingleTag = !getUserConfig().isPremium() ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), org.telegram.ui.ActionBar.h6.L6, 2, new h10(this, 0)) : LocaleController.getString(R.string.FolderShowTagsInfo);
        l10 l10Var9 = new l10(3, false);
        l10Var9.c = replaceSingleTag;
        arrayList3.add(l10Var9);
        n10 n10Var = this.b;
        if (n10Var != null) {
            if (z10) {
                n10Var.E(arrayList2, arrayList3);
            } else {
                n10Var.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Filters));
        this.actionBar.setActionBarMenuOnItemClick(new ga(this, 27));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false));
        i10 i10Var = new i10(0, context, this);
        this.a = i10Var;
        i10Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.m = false;
        this.a.setItemAnimator(kVar);
        ((s4.k) this.a.getItemAnimator()).C = false;
        this.a.setLayoutManager(new s4.b0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        s4.y yVar = new s4.y(new q10(this));
        this.c = yVar;
        yVar.d(this.a);
        frameLayout.addView(this.a, w7.z5.c(-1.0f, -1));
        i10 i10Var2 = this.a;
        n10 n10Var = new n10(this, context);
        this.b = n10Var;
        i10Var2.setAdapter(n10Var);
        this.a.setOnItemClickListener(new zu(5, this, context));
        if (this.f) {
            Z(false);
            this.f = false;
            this.a.u0(this.b.h() - 1);
            AndroidUtilities.runOnUIThread(new h10(this, 1), 200L);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogFiltersUpdated) {
            Z(true);
        } else if (i10 == NotificationCenter.suggestedFiltersLoaded) {
            Z(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 16, new Class[]{org.telegram.ui.Cells.l4.class, p10.class, j10.class, o10.class}, null, null, null, org.telegram.ui.ActionBar.h6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.k0, null, null, org.telegram.ui.ActionBar.h6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{j10.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{j10.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.z6));
        int i10 = org.telegram.ui.ActionBar.h6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{j10.class}, new String[]{"moveImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{j10.class}, new String[]{"optionsImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 196608, new Class[]{j10.class}, new String[]{"optionsImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{p10.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 32, new Class[]{p10.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.a, 0, new Class[]{p10.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.k7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        Z(false);
        getMessagesController().loadRemoteFilters(true);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogFiltersUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.suggestedFiltersLoaded);
        if (getMessagesController().suggestedFilters.isEmpty()) {
            getMessagesController().loadSuggestedFilters();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        NotificationCenter notificationCenter = getNotificationCenter();
        int i10 = NotificationCenter.dialogFiltersUpdated;
        notificationCenter.removeObserver(this, i10);
        getNotificationCenter().removeObserver(this, NotificationCenter.suggestedFiltersLoaded);
        if (this.e) {
            int i11 = 0;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
            getMessagesStorage().saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            while (i11 < size) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i11);
                i11 = com.google.android.gms.internal.play_billing.k3.f(dialogFilter.id, i11, 1, tL_messages_updateDialogFiltersOrder.order);
            }
            getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new ci.d6(8));
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        n10 n10Var = this.b;
        if (n10Var != null) {
            n10Var.l();
        }
    }
}
