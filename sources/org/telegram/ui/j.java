package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public org.telegram.ui.Components.tk0 a;
    public i b;
    public boolean c;
    public TLRPC.GlobalPrivacySettings d;
    public int e;
    public final ArrayList f;
    public final ArrayList h;

    public j() {
        super(null);
        this.c = false;
        this.e = -3;
        this.f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void Y(boolean z10) {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.h;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new h(0, 0, org.telegram.messenger.cd.M0("ArchiveSettingUnmutedFolders")));
        arrayList2.add(new h(1, 1, org.telegram.messenger.cd.M0("ArchiveSettingUnmutedFoldersCheck")));
        arrayList2.add(new h(2, 2, org.telegram.messenger.cd.M0("ArchiveSettingUnmutedFoldersInfo")));
        if (getMessagesController().S0().size() > 1) {
            arrayList2.add(new h(0, 3, org.telegram.messenger.cd.M0("ArchiveSettingUnmutedChats")));
            arrayList2.add(new h(1, 4, org.telegram.messenger.cd.M0("ArchiveSettingUnmutedChatsCheck")));
            arrayList2.add(new h(2, 5, org.telegram.messenger.cd.M0("ArchiveSettingUnmutedChatsInfo")));
        }
        arrayList2.add(new h(0, 6, org.telegram.messenger.cd.M0("NewChatsFromNonContacts")));
        arrayList2.add(new h(1, 7, org.telegram.messenger.cd.M0("NewChatsFromNonContactsCheck")));
        arrayList2.add(new h(2, 8, org.telegram.messenger.cd.M0("ArchiveAndMuteInfo")));
        i iVar = this.b;
        if (iVar == null) {
            return;
        }
        if (z10) {
            iVar.E(arrayList, arrayList2);
        } else {
            iVar.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131754143, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.a = tk0Var;
        tk0Var.r1();
        this.a.setLayoutManager(new dh.f(i10, false, i10));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setSectionsDrawBackground(true);
        this.a.setLayoutAnimation(null);
        org.telegram.ui.Components.tk0 tk0Var2 = this.a;
        i iVar = new i(this);
        this.b = iVar;
        tk0Var2.setAdapter(iVar);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.m = false;
        this.a.setItemAnimator(jVar);
        frameLayout.addView(this.a, w7.b6.c(-1.0f, -1));
        this.a.setOnItemClickListener(new g(this, 0 == true ? 1 : 0));
        getContactsController().B();
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
        this.d = globalPrivacySettings;
        if (globalPrivacySettings == null) {
            this.d = new TLRPC.TL_globalPrivacySettings();
        }
        Y(false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != org.telegram.messenger.zs.k0) {
            if (i10 == org.telegram.messenger.zs.O2) {
                Y(true);
                return;
            }
            return;
        }
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
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
                        int i13 = ((h) arrayList.get(R)).d;
                        if (i13 == 1) {
                            ((org.telegram.ui.Cells.t8) childAt).setChecked(this.d.keep_archived_unmuted);
                        } else if (i13 == 4) {
                            ((org.telegram.ui.Cells.t8) childAt).setChecked(this.d.keep_archived_folders);
                        } else if (i13 == 7) {
                            ((org.telegram.ui.Cells.t8) childAt).setChecked(this.d.archive_and_mute_new_noncontact_peers);
                        }
                    }
                }
            }
        }
        this.c = false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.zs.k0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.zs.k0);
        super.onFragmentDestroy();
        if (this.c) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.d;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new ag.c3(4));
            this.c = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
