package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class aq extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList E;
    public TLRPC.Chat a;
    public TLRPC.ChatFull b;
    public final long c;
    public ArrayList d;
    public FrameLayout e;
    public org.telegram.ui.Components.zl0 f;
    public zp h;
    public final ArrayList n;
    public LinearLayout r;
    public int s;
    public int v;
    public org.telegram.ui.Cells.k6 w;
    public org.telegram.ui.Cells.k6 x;
    public org.telegram.ui.Cells.k6 y;

    public aq(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.n = new ArrayList();
        this.s = -1;
        this.E = new ArrayList();
        this.c = bundle.getLong("chat_id", 0L);
    }

    public final void T(int i10, boolean z10) {
        if (this.s == i10) {
            return;
        }
        this.s = i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) arrayList.get(i11);
            if (i10 != i11) {
                z11 = false;
            }
            k6Var.a(z11, z10);
            i11++;
        }
        ArrayList arrayList2 = this.n;
        if (i10 == 1) {
            if (z10) {
                this.d.clear();
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                    if (tL_availableReaction.reaction.equals("👍") || tL_availableReaction.reaction.equals("👎")) {
                        this.d.add(tL_availableReaction.reaction);
                    }
                }
                if (this.d.isEmpty() && arrayList2.size() >= 2) {
                    this.d.add(((TLRPC.TL_availableReaction) arrayList2.get(0)).reaction);
                    this.d.add(((TLRPC.TL_availableReaction) arrayList2.get(1)).reaction);
                }
            }
            zp zpVar = this.h;
            if (zpVar != null && z10) {
                zpVar.s(2, arrayList2.size() + 1);
            }
        } else if (!this.d.isEmpty()) {
            this.d.clear();
            zp zpVar2 = this.h;
            if (zpVar2 != null && z10) {
                zpVar2.t(2, arrayList2.size() + 1);
            }
        }
        zp zpVar3 = this.h;
        if (zpVar3 != null && z10) {
            zpVar3.m(1);
        }
        zp zpVar4 = this.h;
        if (zpVar4 == null || z10) {
            return;
        }
        zpVar4.l();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, 3));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n.addAll(getMediaDataController().getEnabledReactionsList());
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        m4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout = new LinearLayout(context);
        this.r = linearLayout;
        linearLayout.setOrientation(1);
        this.r.setClickable(true);
        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
        this.w = k6Var;
        k6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(context, null);
        this.x = k6Var2;
        k6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var3 = new org.telegram.ui.Cells.k6(context, null);
        this.y = k6Var3;
        k6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.r.addView(m4Var, w7.z5.n(-1, -2));
        this.r.addView(this.w, w7.z5.n(-1, -2));
        this.r.addView(this.x, w7.z5.n(-1, -2));
        this.r.addView(this.y, w7.z5.n(-1, -2));
        ArrayList arrayList = this.E;
        arrayList.clear();
        arrayList.add(this.w);
        arrayList.add(this.x);
        arrayList.add(this.y);
        final int i10 = 0;
        this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xp
            public final /* synthetic */ aq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        final int i11 = 2;
                        final aq aqVar = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        aqVar.T(2, true);
                                        break;
                                    case 1:
                                        aqVar.T(1, true);
                                        break;
                                    default:
                                        aqVar.T(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 1:
                        final int i12 = 1;
                        final aq aqVar2 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        aqVar2.T(2, true);
                                        break;
                                    case 1:
                                        aqVar2.T(1, true);
                                        break;
                                    default:
                                        aqVar2.T(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i13 = 0;
                        final aq aqVar3 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        aqVar3.T(2, true);
                                        break;
                                    case 1:
                                        aqVar3.T(1, true);
                                        break;
                                    default:
                                        aqVar3.T(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        final int i11 = 1;
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xp
            public final /* synthetic */ aq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        final int i112 = 2;
                        final aq aqVar = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i112) {
                                    case 0:
                                        aqVar.T(2, true);
                                        break;
                                    case 1:
                                        aqVar.T(1, true);
                                        break;
                                    default:
                                        aqVar.T(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 1:
                        final int i12 = 1;
                        final aq aqVar2 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        aqVar2.T(2, true);
                                        break;
                                    case 1:
                                        aqVar2.T(1, true);
                                        break;
                                    default:
                                        aqVar2.T(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i13 = 0;
                        final aq aqVar3 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        aqVar3.T(2, true);
                                        break;
                                    case 1:
                                        aqVar3.T(1, true);
                                        break;
                                    default:
                                        aqVar3.T(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        final int i12 = 2;
        this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xp
            public final /* synthetic */ aq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        final int i112 = 2;
                        final aq aqVar = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i112) {
                                    case 0:
                                        aqVar.T(2, true);
                                        break;
                                    case 1:
                                        aqVar.T(1, true);
                                        break;
                                    default:
                                        aqVar.T(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 1:
                        final int i122 = 1;
                        final aq aqVar2 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i122) {
                                    case 0:
                                        aqVar2.T(2, true);
                                        break;
                                    case 1:
                                        aqVar2.T(1, true);
                                        break;
                                    default:
                                        aqVar2.T(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i13 = 0;
                        final aq aqVar3 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        aqVar3.T(2, true);
                                        break;
                                    case 1:
                                        aqVar3.T(1, true);
                                        break;
                                    default:
                                        aqVar3.T(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        org.telegram.ui.Cells.k6 k6Var4 = this.w;
        int i13 = org.telegram.ui.ActionBar.i6.d6;
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i13, false);
        int i14 = org.telegram.ui.ActionBar.i6.i6;
        k6Var4.setBackground(org.telegram.ui.ActionBar.i6.g0(w02, org.telegram.ui.ActionBar.i6.w0(null, i14, false)));
        this.x.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(null, i13, false), org.telegram.ui.ActionBar.i6.w0(null, i14, false)));
        this.y.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(null, i13, false), org.telegram.ui.ActionBar.i6.w0(null, i14, false)));
        T(this.v, false);
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f = zl0Var;
        zl0Var.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.zl0 zl0Var2 = this.f;
        zp zpVar = new zp(this, context);
        this.h = zpVar;
        zl0Var2.setAdapter(zpVar);
        this.f.setOnItemClickListener(new i(this, 4));
        frameLayout.addView(this.f, w7.z5.g());
        this.f.r1();
        this.f.setSectionsDrawBackground(true);
        this.e = frameLayout;
        this.fragmentView = frameLayout;
        this.h.l();
        return this.e;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == NotificationCenter.reactionsDidLoad) {
            ArrayList arrayList = this.n;
            arrayList.clear();
            arrayList.addAll(getMediaDataController().getEnabledReactionsList());
            this.h.l();
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.c)) {
            org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
            if (c5Var == null || c5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new e(this, 8), org.telegram.ui.ActionBar.i6.d6, org.telegram.ui.ActionBar.i6.G6, org.telegram.ui.ActionBar.i6.z6, org.telegram.ui.ActionBar.i6.i6, org.telegram.ui.ActionBar.i6.a7, org.telegram.ui.ActionBar.i6.B6, org.telegram.ui.ActionBar.i6.p7, org.telegram.ui.ActionBar.i6.f6, org.telegram.ui.ActionBar.i6.g6, org.telegram.ui.ActionBar.i6.O6, org.telegram.ui.ActionBar.i6.P6, org.telegram.ui.ActionBar.i6.Q6, org.telegram.ui.ActionBar.i6.R6);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        if (r0 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j3 = this.c;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        this.a = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j3);
            this.a = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.a, true);
                if (this.b == null) {
                    TLRPC.ChatFull loadChatInfo = MessagesStorage.getInstance(this.currentAccount).loadChatInfo(this.c, ChatObject.isChannel(this.a), new CountDownLatch(1), false, false);
                    this.b = loadChatInfo;
                }
            }
            return false;
        }
        getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.c, this.s, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
