package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class n extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.sl0 a;
    public m b;
    public boolean c;
    public TLRPC.GlobalPrivacySettings d;
    public int e;
    public final ArrayList f;
    public final ArrayList h;

    public n() {
        super(null);
        this.c = false;
        this.e = -3;
        this.f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void U(boolean z4) {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.h;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new l(0, 0, LocaleController.getString("ArchiveSettingUnmutedFolders")));
        arrayList2.add(new l(1, 1, LocaleController.getString("ArchiveSettingUnmutedFoldersCheck")));
        arrayList2.add(new l(2, 2, LocaleController.getString("ArchiveSettingUnmutedFoldersInfo")));
        if (getMessagesController().getDialogFilters().size() > 1) {
            arrayList2.add(new l(0, 3, LocaleController.getString("ArchiveSettingUnmutedChats")));
            arrayList2.add(new l(1, 4, LocaleController.getString("ArchiveSettingUnmutedChatsCheck")));
            arrayList2.add(new l(2, 5, LocaleController.getString("ArchiveSettingUnmutedChatsInfo")));
        }
        arrayList2.add(new l(0, 6, LocaleController.getString("NewChatsFromNonContacts")));
        arrayList2.add(new l(1, 7, LocaleController.getString("NewChatsFromNonContactsCheck")));
        arrayList2.add(new l(2, 8, LocaleController.getString("ArchiveAndMuteInfo")));
        m mVar = this.b;
        if (mVar == null) {
            return;
        }
        if (z4) {
            mVar.E(arrayList, arrayList2);
        } else {
            mVar.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ArchiveSettings));
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 5));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.a = sl0Var;
        sl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.setLayoutManager(new k(1, false, 0));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setLayoutAnimation(null);
        org.telegram.ui.Components.sl0 sl0Var2 = this.a;
        m mVar = new m(this);
        this.b = mVar;
        sl0Var2.setAdapter(mVar);
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.C = false;
        lVar.m = false;
        this.a.setItemAnimator(lVar);
        frameLayout.addView(this.a, k7.c6.c(-1.0f, -1));
        this.a.setOnItemClickListener(new j(this, 0));
        getContactsController().loadGlobalPrivacySetting();
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
        this.d = globalPrivacySettings;
        if (globalPrivacySettings == null) {
            this.d = new TLRPC.TL_globalPrivacySettings();
        }
        U(false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.privacyRulesUpdated) {
            if (i10 == NotificationCenter.dialogFiltersUpdated) {
                U(true);
                return;
            }
            return;
        }
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
        this.d = globalPrivacySettings;
        if (globalPrivacySettings == null) {
            this.d = new TLRPC.TL_globalPrivacySettings();
        }
        if (this.a != null) {
            for (int i12 = 0; i12 < this.a.getChildCount(); i12++) {
                View childAt = this.a.getChildAt(i12);
                this.a.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    ArrayList arrayList = this.h;
                    if (R < arrayList.size()) {
                        int i13 = ((l) arrayList.get(R)).d;
                        if (i13 == 1) {
                            ((org.telegram.ui.Cells.s8) childAt).setChecked(this.d.keep_archived_unmuted);
                        } else if (i13 == 4) {
                            ((org.telegram.ui.Cells.s8) childAt).setChecked(this.d.keep_archived_folders);
                        } else if (i13 == 7) {
                            ((org.telegram.ui.Cells.s8) childAt).setChecked(this.d.archive_and_mute_new_noncontact_peers);
                        }
                    }
                }
            }
        }
        this.c = false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        super.onFragmentDestroy();
        if (this.c) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.d;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new oh.p5(4));
            this.c = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
