package org.telegram.ui;

import android.content.Context;
import android.view.View;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class op extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.j6 A;
    public ArrayList B;
    public boolean C;
    public TLRPC.Chat a;
    public TLRPC.ChatFull b;
    public long c;
    public ArrayList d;
    public LinearLayout e;
    public org.telegram.ui.Components.wk0 f;
    public np h;
    public org.telegram.ui.Cells.t8 n;
    public ArrayList r;
    public LinearLayout s;
    public int v;
    public int w;
    public org.telegram.ui.Cells.j6 x;
    public org.telegram.ui.Cells.j6 y;

    public final void U(int i9, boolean z10) {
        np npVar;
        ArrayList arrayList = this.B;
        ArrayList arrayList2 = this.r;
        if (this.v == i9) {
            return;
        }
        org.telegram.ui.Cells.t8 t8Var = this.n;
        if (t8Var != null) {
            boolean z11 = i9 == 1 || i9 == 0;
            t8Var.setChecked(z11);
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, z11 ? org.telegram.ui.ActionBar.f6.f6 : org.telegram.ui.ActionBar.f6.e6, false);
            if (z11) {
                this.n.b(w02, z11);
            } else {
                this.n.setBackgroundColorAnimatedReverse(w02);
            }
        }
        this.v = i9;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            ((org.telegram.ui.Cells.j6) arrayList.get(i10)).a(i9 == i10, z10);
            i10++;
        }
        if (i9 == 1) {
            if (z10) {
                this.d.clear();
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
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
            np npVar2 = this.h;
            if (npVar2 != null && z10) {
                npVar2.s(this.C ? 1 : 2, arrayList2.size() + 1);
            }
        } else if (!this.d.isEmpty()) {
            this.d.clear();
            np npVar3 = this.h;
            if (npVar3 != null && z10) {
                npVar3.t(this.C ? 1 : 2, arrayList2.size() + 1);
            }
        }
        if (!this.C && (npVar = this.h) != null && z10) {
            npVar.m(1);
        }
        np npVar4 = this.h;
        if (npVar4 == null || z10) {
            return;
        }
        npVar4.l();
    }

    public final void V() {
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        org.telegram.ui.Cells.t8 t8Var = this.n;
        if (t8Var != null) {
            t8Var.d(org.telegram.ui.ActionBar.f6.g6, org.telegram.ui.ActionBar.f6.O6, org.telegram.ui.ActionBar.f6.P6, org.telegram.ui.ActionBar.f6.Q6, org.telegram.ui.ActionBar.f6.R6);
        }
        this.h.l();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        ArrayList arrayList = this.B;
        this.C = ChatObject.isChannelAndNotMegaGroup(this.c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 28));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.C) {
            org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
            this.n = t8Var;
            t8Var.setHeight(56);
            this.n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.t8 t8Var2 = this.n;
            t8Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, t8Var2.e.h ? org.telegram.ui.ActionBar.f6.f6 : org.telegram.ui.ActionBar.f6.e6, false));
            this.n.setTypeface(AndroidUtilities.bold());
            final int i9 = 0;
            this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lp
                public final /* synthetic */ op b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            op opVar = this.b;
                            opVar.U(opVar.n.e.h ? 2 : 1, true);
                            break;
                        case 1:
                            final int i10 = 0;
                            final op opVar2 = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            opVar2.U(0, true);
                                            break;
                                        case 1:
                                            opVar2.U(1, true);
                                            break;
                                        default:
                                            opVar2.U(2, true);
                                            break;
                                    }
                                }
                            });
                            break;
                        case 2:
                            final int i11 = 1;
                            final op opVar3 = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            opVar3.U(0, true);
                                            break;
                                        case 1:
                                            opVar3.U(1, true);
                                            break;
                                        default:
                                            opVar3.U(2, true);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i12 = 2;
                            final op opVar4 = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            opVar4.U(0, true);
                                            break;
                                        case 1:
                                            opVar4.U(1, true);
                                            break;
                                        default:
                                            opVar4.U(2, true);
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            linearLayout.addView(this.n, g7.e6.n(-1, -2));
        }
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        m4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
        this.x = j6Var;
        j6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, null);
        this.y = j6Var2;
        j6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.j6 j6Var3 = new org.telegram.ui.Cells.j6(context, null);
        this.A = j6Var3;
        j6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.s.addView(m4Var, g7.e6.n(-1, -2));
        this.s.addView(this.x, g7.e6.n(-1, -2));
        this.s.addView(this.y, g7.e6.n(-1, -2));
        this.s.addView(this.A, g7.e6.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.x);
        arrayList.add(this.y);
        arrayList.add(this.A);
        final int i10 = 1;
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lp
            public final /* synthetic */ op b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        op opVar = this.b;
                        opVar.U(opVar.n.e.h ? 2 : 1, true);
                        break;
                    case 1:
                        final int i102 = 0;
                        final op opVar2 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i102) {
                                    case 0:
                                        opVar2.U(0, true);
                                        break;
                                    case 1:
                                        opVar2.U(1, true);
                                        break;
                                    default:
                                        opVar2.U(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 2:
                        final int i11 = 1;
                        final op opVar3 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        opVar3.U(0, true);
                                        break;
                                    case 1:
                                        opVar3.U(1, true);
                                        break;
                                    default:
                                        opVar3.U(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i12 = 2;
                        final op opVar4 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        opVar4.U(0, true);
                                        break;
                                    case 1:
                                        opVar4.U(1, true);
                                        break;
                                    default:
                                        opVar4.U(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        final int i11 = 2;
        this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lp
            public final /* synthetic */ op b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        op opVar = this.b;
                        opVar.U(opVar.n.e.h ? 2 : 1, true);
                        break;
                    case 1:
                        final int i102 = 0;
                        final op opVar2 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i102) {
                                    case 0:
                                        opVar2.U(0, true);
                                        break;
                                    case 1:
                                        opVar2.U(1, true);
                                        break;
                                    default:
                                        opVar2.U(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 2:
                        final int i112 = 1;
                        final op opVar3 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i112) {
                                    case 0:
                                        opVar3.U(0, true);
                                        break;
                                    case 1:
                                        opVar3.U(1, true);
                                        break;
                                    default:
                                        opVar3.U(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i12 = 2;
                        final op opVar4 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        opVar4.U(0, true);
                                        break;
                                    case 1:
                                        opVar4.U(1, true);
                                        break;
                                    default:
                                        opVar4.U(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        final int i12 = 3;
        this.A.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lp
            public final /* synthetic */ op b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        op opVar = this.b;
                        opVar.U(opVar.n.e.h ? 2 : 1, true);
                        break;
                    case 1:
                        final int i102 = 0;
                        final op opVar2 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i102) {
                                    case 0:
                                        opVar2.U(0, true);
                                        break;
                                    case 1:
                                        opVar2.U(1, true);
                                        break;
                                    default:
                                        opVar2.U(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 2:
                        final int i112 = 1;
                        final op opVar3 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i112) {
                                    case 0:
                                        opVar3.U(0, true);
                                        break;
                                    case 1:
                                        opVar3.U(1, true);
                                        break;
                                    default:
                                        opVar3.U(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i122 = 2;
                        final op opVar4 = this.b;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.mp
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i122) {
                                    case 0:
                                        opVar4.U(0, true);
                                        break;
                                    case 1:
                                        opVar4.U(1, true);
                                        break;
                                    default:
                                        opVar4.U(2, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        int i13 = org.telegram.ui.ActionBar.f6.d6;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        org.telegram.ui.Cells.j6 j6Var4 = this.x;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i13, false);
        int i14 = org.telegram.ui.ActionBar.f6.i6;
        j6Var4.setBackground(org.telegram.ui.ActionBar.f6.g0(w02, org.telegram.ui.ActionBar.f6.w0(null, i14, false)));
        this.y.setBackground(org.telegram.ui.ActionBar.f6.g0(org.telegram.ui.ActionBar.f6.w0(null, i13, false), org.telegram.ui.ActionBar.f6.w0(null, i14, false)));
        this.A.setBackground(org.telegram.ui.ActionBar.f6.g0(org.telegram.ui.ActionBar.f6.w0(null, i13, false), org.telegram.ui.ActionBar.f6.w0(null, i14, false)));
        U(this.w, false);
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f = wk0Var;
        wk0Var.setLayoutManager(new f2.m0());
        org.telegram.ui.Components.wk0 wk0Var2 = this.f;
        np npVar = new np(this, context);
        this.h = npVar;
        wk0Var2.setAdapter(npVar);
        this.f.setOnItemClickListener(new i(this, 4));
        linearLayout.addView(this.f, g7.e6.l(1.0f, -1, 0));
        this.f.p1();
        this.actionBar.setAdaptiveBackground(this.f);
        this.e = linearLayout;
        this.fragmentView = linearLayout;
        V();
        return this.e;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ArrayList arrayList = this.r;
        if (i10 != this.currentAccount) {
            return;
        }
        if (i9 == NotificationCenter.reactionsDidLoad) {
            arrayList.clear();
            arrayList.addAll(getMediaDataController().getEnabledReactionsList());
            this.h.l();
        } else if (i9 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.c)) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var == null || b5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        return g7.h6.a(new e(this, 8), org.telegram.ui.ActionBar.f6.d6, org.telegram.ui.ActionBar.f6.G6, org.telegram.ui.ActionBar.f6.z6, org.telegram.ui.ActionBar.f6.i6, org.telegram.ui.ActionBar.f6.a7, org.telegram.ui.ActionBar.f6.B6, org.telegram.ui.ActionBar.f6.p7, org.telegram.ui.ActionBar.f6.f6, org.telegram.ui.ActionBar.f6.g6, org.telegram.ui.ActionBar.f6.O6, org.telegram.ui.ActionBar.f6.P6, org.telegram.ui.ActionBar.f6.Q6, org.telegram.ui.ActionBar.f6.R6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        if (r0 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.c;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        this.a = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j10);
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

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
