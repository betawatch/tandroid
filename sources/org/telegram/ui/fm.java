package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fm extends org.telegram.ui.Components.nl0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public final ArrayList P;
    public final /* synthetic */ un Q;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public fm(un unVar, Context context) {
        this.Q = unVar;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.s = -5;
        this.v = -5;
        this.w = -5;
        this.x = -5;
        this.y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.h = context;
        TLRPC.User user = unVar.f;
        this.n = user != null && user.bot;
        C(true);
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    public final void K(boolean z10) {
        un unVar = this.Q;
        if (UserObject.isBotForum(unVar.f)) {
            if (z10) {
                unVar.Jc = true;
            }
            if (this.I < 0 || N()) {
                return;
            }
            super.u(this.I);
            S();
        }
    }

    public final ArrayList L() {
        return this.L ? this.M : this.N ? this.P : this.Q.G6;
    }

    public final void M(MessageObject messageObject) {
        un unVar = this.Q;
        int childCount = unVar.x0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = unVar.x0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                if (s1Var.getMessageObject() == messageObject) {
                    s1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        un unVar = this.Q;
        return UserObject.isBotForumWithEditableTopics(unVar.f) && unVar.b() == 0 && !unVar.Jc && unVar.d4 == 0;
    }

    public final void O(boolean z10) {
        boolean z11;
        un unVar = this.Q;
        ArrayList arrayList = unVar.G6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + unVar.a6);
        }
        if (z10 && unVar.a6) {
            s4.m0 itemAnimator = unVar.x0.getItemAnimator();
            qj qjVar = unVar.y0;
            if (itemAnimator != qjVar) {
                unVar.x0.setItemAnimator(qjVar);
            }
        } else {
            unVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(size);
            if (messageObject.isDateObject) {
                size--;
            } else {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z11 = true;
                    }
                }
            }
        }
        z11 = false;
        boolean[] zArr = unVar.O6;
        if ((zArr[0] && (unVar.X6 == 0 || zArr[1])) || z11) {
            unVar.S6(((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow);
        }
    }

    public final void P(int i10, boolean z10) {
        MessageObject messageObject;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i10);
            ic.a.w(z10 ? " with thanos effect" : "", sb2);
        }
        un unVar = this.Q;
        if (((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = unVar.x0.getItemAnimator();
            qj qjVar = unVar.y0;
            if (itemAnimator != qjVar) {
                unVar.x0.setItemAnimator(qjVar);
            }
        } else {
            unVar.x0.setItemAnimator(null);
        }
        if (z10 && unVar.y0 != null) {
            s4.m0 itemAnimator2 = unVar.x0.getItemAnimator();
            qj qjVar2 = unVar.y0;
            if (itemAnimator2 == qjVar2) {
                s4.e1 K = unVar.x0.K(i10);
                if (K == null) {
                    qjVar2.getClass();
                } else {
                    qjVar2.S.add(K);
                    View view = K.a;
                    if ((view instanceof org.telegram.ui.Cells.s1) && (messageObject = ((org.telegram.ui.Cells.s1) view).getMessageObject()) != null) {
                        messageObject.deletedByThanos = true;
                    }
                }
            }
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void Q(int i10) {
        int i11;
        un unVar = this.Q;
        ArrayList arrayList = unVar.G6;
        if (unVar.z0 == null || this.L || this.N) {
            return;
        }
        int i12 = 0;
        if (!unVar.P4 && unVar.V7 != null) {
            int childCount = unVar.x0.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                View childAt = unVar.x0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                    MessageObject messageObject2 = unVar.V7;
                    if (messageObject == messageObject2) {
                        if (arrayList.indexOf(messageObject2) >= 0) {
                            i11 = arrayList.indexOf(unVar.V7) + this.J;
                            i12 = unVar.V8(childAt);
                        }
                    }
                }
                i13++;
            }
        }
        i11 = -1;
        m(i10);
        if (i11 != -1) {
            unVar.z0.h1(i11, i12);
        }
    }

    public final org.telegram.ui.Cells.s1 R(MessageObject messageObject, boolean z10, boolean z11) {
        un unVar = this.Q;
        if (z10) {
            int childCount = unVar.x0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = unVar.x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject() == messageObject && TextUtils.equals(s1Var.f7, s1Var.y7.messageOwner.post_author)) {
                        s1Var.Z3(messageObject, s1Var.getCurrentMessagesGroup(), s1Var.m3(), s1Var.n3(), s1Var.h3(), s1Var.j3());
                        return s1Var;
                    }
                }
                i10++;
                messageObject = messageObject;
            }
        }
        MessageObject messageObject2 = messageObject;
        int indexOf = (this.L ? this.M : this.N ? this.P : unVar.G6).indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (!z11) {
            Q(this.J + indexOf);
            return null;
        }
        int i11 = un.dd;
        un.dd = i11 + 1;
        messageObject2.stableId = i11;
        O(true);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S() {
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.User user3;
        int i10;
        TLRPC.PeerSettings peerSettings;
        TLRPC.PeerSettings peerSettings2;
        int i11;
        int i12;
        un unVar = this.Q;
        boolean[] zArr = unVar.O6;
        this.r = 0;
        ArrayList arrayList = this.L ? this.M : this.N ? this.P : unVar.G6;
        if (unVar.d4 == 3 && unVar.bb) {
            this.r = 1;
            this.s = 0;
        } else {
            this.s = -5;
        }
        this.v = -5;
        this.w = -5;
        this.y = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        if (N()) {
            int i13 = this.r;
            this.r = i13 + 1;
            this.I = i13;
        }
        if (arrayList.isEmpty()) {
            this.E = -5;
            this.F = -5;
            this.J = 0;
            this.K = 0;
            TLRPC.User user4 = unVar.f;
            if (user4 != null && !UserObject.isBot(user4) && !UserObject.isReplyUser(unVar.f)) {
                TLRPC.PeerSettings peerSettings3 = unVar.getMessagesController().getPeerSettings(unVar.f.id);
                int i14 = org.telegram.ui.Cells.cb.O;
                if (peerSettings3 != null && ((peerSettings3.phone_country != null || peerSettings3.registration_month != null) && !MessagesController.isSupportUser(unVar.f) && unVar.d4 == 0)) {
                    int i15 = this.r;
                    this.r = i15 + 1;
                    this.y = i15;
                    return;
                }
            }
            if (UserObject.isReplyUser(unVar.f) || ((user = unVar.f) != null && user.bot && !MessagesController.isSupportUser(user) && unVar.d4 == 0)) {
                int i16 = this.r;
                this.r = i16 + 1;
                this.w = i16;
                return;
            }
            return;
        }
        if (!this.N) {
            boolean[] zArr2 = unVar.Q6;
            if (((!zArr2[0] || (unVar.X6 != 0 && !zArr2[1])) && !unVar.R6) || unVar.jb) {
                int i17 = this.r;
                this.r = i17 + 1;
                this.F = i17;
                int i18 = this.r;
                this.J = i18;
                int size = arrayList.size() + i18;
                this.r = size;
                this.K = size;
                user2 = unVar.f;
                if (user2 != null && !UserObject.isBot(user2) && !UserObject.isReplyUser(unVar.f)) {
                    peerSettings = unVar.getMessagesController().getPeerSettings(unVar.f.id);
                    int i19 = org.telegram.ui.Cells.cb.O;
                    if (peerSettings != null && ((peerSettings.phone_country != null || peerSettings.registration_month != null) && !MessagesController.isSupportUser(unVar.f) && unVar.d4 == 0 && zArr[0])) {
                        peerSettings2 = unVar.getMessagesController().getPeerSettings(unVar.f.id);
                        i11 = peerSettings2.name_change_date;
                        if (i11 != 0 || (i12 = peerSettings2.photo_change_date) == 0) {
                            if (i11 != 0) {
                                int i20 = this.r;
                                this.r = i20 + 1;
                                this.H = i20;
                            }
                            if (peerSettings2.photo_change_date != 0) {
                                int i21 = this.r;
                                this.r = i21 + 1;
                                this.G = i21;
                            }
                        } else if (i11 < i12) {
                            int i22 = this.r;
                            this.H = i22;
                            this.r = i22 + 2;
                            this.G = i22 + 1;
                        } else {
                            int i23 = this.r;
                            this.G = i23;
                            this.r = i23 + 2;
                            this.H = i23 + 1;
                        }
                        int i24 = this.r;
                        this.r = i24 + 1;
                        this.y = i24;
                        i10 = unVar.d4;
                        if (i10 == 9) {
                            int i25 = this.r;
                            this.s = i25;
                            this.r = i25 + 2;
                            this.v = i25 + 1;
                        }
                        if (i10 == 5 && !jg.c2.g(unVar.c4)) {
                            int i26 = this.r;
                            this.r = i26 + 1;
                            this.s = i26;
                        }
                        if (this.N ? !(!(zArr[0] && (unVar.X6 == 0 || zArr[1])) && (AndroidUtilities.isTablet() || unVar.s4 || unVar.f != null)) : this.O) {
                            this.E = -5;
                            return;
                        }
                        int i27 = this.r;
                        this.r = i27 + 1;
                        this.E = i27;
                        return;
                    }
                }
                if ((!UserObject.isReplyUser(unVar.f) || ((user3 = unVar.f) != null && user3.bot && !MessagesController.isSupportUser(user3) && unVar.d4 == 0)) && zArr[0]) {
                    int i28 = this.r;
                    this.r = i28 + 1;
                    this.w = i28;
                }
                i10 = unVar.d4;
                if (i10 == 9) {
                }
                if (i10 == 5) {
                    int i262 = this.r;
                    this.r = i262 + 1;
                    this.s = i262;
                }
                if (this.N) {
                    int i272 = this.r;
                    this.r = i272 + 1;
                    this.E = i272;
                    return;
                } else {
                    int i2722 = this.r;
                    this.r = i2722 + 1;
                    this.E = i2722;
                    return;
                }
            }
        }
        this.F = -5;
        int i182 = this.r;
        this.J = i182;
        int size2 = arrayList.size() + i182;
        this.r = size2;
        this.K = size2;
        user2 = unVar.f;
        if (user2 != null) {
            peerSettings = unVar.getMessagesController().getPeerSettings(unVar.f.id);
            int i192 = org.telegram.ui.Cells.cb.O;
            if (peerSettings != null) {
                peerSettings2 = unVar.getMessagesController().getPeerSettings(unVar.f.id);
                i11 = peerSettings2.name_change_date;
                if (i11 != 0) {
                }
                if (i11 != 0) {
                }
                if (peerSettings2.photo_change_date != 0) {
                }
                int i242 = this.r;
                this.r = i242 + 1;
                this.y = i242;
                i10 = unVar.d4;
                if (i10 == 9) {
                }
                if (i10 == 5) {
                }
                if (this.N) {
                }
            }
        }
        if (!UserObject.isReplyUser(unVar.f)) {
        }
        int i282 = this.r;
        this.r = i282 + 1;
        this.w = i282;
        i10 = unVar.d4;
        if (i10 == 9) {
        }
        if (i10 == 5) {
        }
        if (this.N) {
        }
    }

    public final void T() {
        int i10 = this.r;
        int i11 = this.w;
        int i12 = this.y;
        int i13 = this.s;
        int i14 = this.v;
        int i15 = this.E;
        int i16 = this.F;
        int i17 = this.J;
        int i18 = this.K;
        int i19 = this.G;
        int i20 = this.H;
        int i21 = this.I;
        S();
        if (i10 == this.r && i11 == this.w && i15 == this.E && i16 == this.F && i17 == this.J && i18 == this.K && i13 == this.s && i14 == this.v && i12 == this.y && i19 == this.G && i20 == this.H && i21 == this.I) {
            return;
        }
        O(false);
    }

    @Override // s4.h0
    public final int h() {
        this.x = -5;
        un unVar = this.Q;
        a0.h hVar = unVar.p8;
        if (unVar.Y5.get(unVar.p4, 0) == 0) {
            return this.r;
        }
        TLRPC.User user = unVar.f;
        if (user == null || !user.bot || unVar.d4 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(unVar.f.id)).description == null && ((TL_bots.BotInfo) hVar.f(unVar.f.id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(unVar.f.id)).description_document == null)) && !UserObject.isReplyUser(unVar.f) && !UserObject.isBotForum(unVar.f))) {
            return 0;
        }
        this.x = 0;
        return 1;
    }

    @Override // s4.h0
    public final long i(int i10) {
        un unVar = this.Q;
        if (unVar.Y5.get(unVar.p4, 0) != 0 && i10 == this.x) {
            return 1L;
        }
        ArrayList arrayList = this.L ? this.M : this.N ? this.P : unVar.G6;
        if (i10 >= this.J && i10 < this.K) {
            return ((MessageObject) arrayList.get(i10 - r1)).stableId;
        }
        if (i10 == this.w || i10 == this.x) {
            return 1L;
        }
        if (i10 == this.E) {
            return 2L;
        }
        if (i10 == this.F) {
            return 3L;
        }
        if (i10 == this.s) {
            return 4L;
        }
        if (i10 == this.y) {
            return 6L;
        }
        if (i10 == this.G) {
            return 7L;
        }
        if (i10 == this.H) {
            return 8L;
        }
        if (i10 == this.I) {
            return 9L;
        }
        return i10 == this.v ? 10L : 5L;
    }

    @Override // s4.h0
    public final int j(int i10) {
        un unVar = this.Q;
        if (unVar.Y5.get(unVar.p4, 0) != 0 && i10 == this.x) {
            return 3;
        }
        if (i10 == this.s || i10 == this.v) {
            return 1;
        }
        int i11 = this.J;
        if (i10 >= i11 && i10 < this.K) {
            return ((MessageObject) (this.L ? this.M : this.N ? this.P : unVar.G6).get(i10 - i11)).contentType;
        }
        if (i10 == this.w) {
            return 3;
        }
        if (i10 == this.y) {
            return 6;
        }
        if (i10 == this.H || i10 == this.G) {
            return 7;
        }
        return i10 == this.I ? 8 : 4;
    }

    @Override // org.telegram.ui.Components.nl0, s4.h0
    public final void l() {
        O(false);
    }

    @Override // org.telegram.ui.Components.nl0, s4.h0
    public final void m(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item changed " + i10);
        }
        un unVar = this.Q;
        if (!((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow || unVar.Z0) {
            unVar.x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = unVar.x0.getItemAnimator();
            qj qjVar = unVar.y0;
            if (itemAnimator != qjVar) {
                unVar.x0.setItemAnimator(qjVar);
            }
        }
        S();
        try {
            super.m(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.nl0, s4.h0
    public final void o(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item inserted " + i10);
        }
        un unVar = this.Q;
        if (((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = unVar.x0.getItemAnimator();
            qj qjVar = unVar.y0;
            if (itemAnimator != qjVar) {
                unVar.x0.setItemAnimator(qjVar);
            }
        } else {
            unVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.o(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // s4.h0
    public final void p(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item moved" + i10 + ":" + i11);
        }
        un unVar = this.Q;
        if (((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = unVar.x0.getItemAnimator();
            qj qjVar = unVar.y0;
            if (itemAnimator != qjVar) {
                unVar.x0.setItemAnimator(qjVar);
            }
        } else {
            unVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.p(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.nl0, s4.h0
    public final void q(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range changed " + i10 + ":" + i11);
        }
        un unVar = this.Q;
        if (((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = unVar.x0.getItemAnimator();
            qj qjVar = unVar.y0;
            if (itemAnimator != qjVar) {
                unVar.x0.setItemAnimator(qjVar);
            }
        } else {
            unVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.q(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.nl0, s4.h0
    public final void s(int i10, int i11) {
        int i12;
        int i13;
        un unVar = this.Q;
        ArrayList arrayList = unVar.G6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        if (((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = unVar.x0.getItemAnimator();
            qj qjVar = unVar.y0;
            if (itemAnimator != qjVar) {
                unVar.x0.setItemAnimator(qjVar);
            }
        } else {
            unVar.x0.setItemAnimator(null);
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.J) && i12 < this.K) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.J) - 1);
            if ((unVar.e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (unVar.f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
                m(i10);
            }
        }
        try {
            super.s(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.nl0, s4.h0
    public final void t(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range removed" + i10 + ":" + i11);
        }
        un unVar = this.Q;
        if (((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = unVar.x0.getItemAnimator();
            qj qjVar = unVar.y0;
            if (itemAnimator != qjVar) {
                unVar.x0.setItemAnimator(qjVar);
            }
        } else {
            unVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.t(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.nl0, s4.h0
    public final void u(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item removed " + i10);
        }
        un unVar = this.Q;
        if (((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = unVar.x0.getItemAnimator();
            qj qjVar = unVar.y0;
            if (itemAnimator != qjVar) {
                unVar.x0.setItemAnimator(qjVar);
            }
        } else {
            unVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x05d1, code lost:
    
        if (r19 != r9) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x094d, code lost:
    
        if (r4.y0 == null) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0604, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.peer_id) == org.telegram.messenger.MessageObject.getPeerId(r8.messageOwner.peer_id)) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0679, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0622, code lost:
    
        if (r8.getSenderId() == r5.getSenderId()) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0677, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r2) == org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.fwd_from.from_id)) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x03f6, code lost:
    
        if (r4.d4 != 9) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0422, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.peer_id) == org.telegram.messenger.MessageObject.getPeerId(r11.messageOwner.peer_id)) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0494, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x043d, code lost:
    
        if (r11.getSenderId() == r5.getSenderId()) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0492, code lost:
    
        if (org.telegram.messenger.MessageObject.getPeerId(r10) == org.telegram.messenger.MessageObject.getPeerId(r5.messageOwner.fwd_from.from_id)) goto L267;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0a2f  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0a31  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v16 */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        TLRPC.UserFull userFull;
        TLObject tLObject;
        org.telegram.ui.Cells.g0 g0Var;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        ArrayList arrayList;
        long j10;
        int i14;
        int i15;
        int i16;
        boolean z12;
        boolean z13;
        boolean z14;
        int j11;
        boolean z15;
        boolean z16;
        ArrayList arrayList2;
        int i17;
        int i18;
        boolean z17;
        boolean z18;
        int i19;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        String str;
        byte[] bArr;
        Integer num;
        int indexOf;
        ?? r10;
        qj qjVar;
        MessageObject.SendAnimationData sendAnimationData;
        hk hkVar;
        int i20;
        int i21;
        boolean z27;
        org.telegram.ui.Components.t60 t60Var;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        boolean z28;
        long j12;
        long j13;
        long j14;
        MessageObject messageObject;
        String str3;
        boolean z29;
        int i22;
        TLRPC.ChatFull chatFull;
        View view = e1Var.a;
        un unVar = this.Q;
        a0.h hVar = unVar.p8;
        ArrayList arrayList3 = unVar.G4;
        HashMap hashMap = unVar.H4;
        boolean z30 = false;
        if (i10 == this.w || i10 == this.x) {
            org.telegram.ui.Cells.g0 g0Var2 = (org.telegram.ui.Cells.g0) view;
            if (UserObject.isReplyUser(unVar.f)) {
                g0Var = g0Var2;
                g0Var.b(false, 0L, LocaleController.getString(R.string.RepliesChatInfo), null, null, null);
            } else {
                TLRPC.User user = unVar.f;
                if (user == null || user.id != UserObject.VERIFY) {
                    TL_bots.BotInfo botInfo = hVar.m() != 0 ? (TL_bots.BotInfo) hVar.f(unVar.f.id) : null;
                    boolean z31 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && UserObject.isBot(unVar.f) && (userFull = unVar.m8) != null && userFull.bot_manager_id != 0 && unVar.f.bot_can_edit;
                    TLRPC.User user2 = unVar.f;
                    long j15 = user2 == null ? 0L : user2.id;
                    String str4 = botInfo != null ? botInfo.description : null;
                    if (botInfo != null) {
                        TLObject tLObject2 = botInfo.description_document;
                        if (tLObject2 == null) {
                            tLObject2 = botInfo.description_photo;
                        }
                        tLObject = tLObject2;
                    } else {
                        tLObject = null;
                    }
                    g0Var = g0Var2;
                    g0Var.b(true, j15, str4, tLObject, botInfo, z31 ? DialogObject.getName(((org.telegram.ui.ActionBar.r2) unVar).currentAccount, unVar.m8.bot_manager_id) : null);
                } else {
                    g0Var = g0Var2;
                    g0Var.b(false, 0L, LocaleController.getString(R.string.VerifyChatInfo), null, null, null);
                }
            }
            un.g4(unVar, g0Var);
            return;
        }
        if (i10 == this.I) {
            ((org.telegram.ui.Cells.a0) view).setDialogId(unVar.a());
            return;
        }
        if (i10 == this.y) {
            org.telegram.ui.Cells.cb cbVar = (org.telegram.ui.Cells.cb) view;
            TLRPC.EncryptedChat encryptedChat = unVar.h;
            long a2 = encryptedChat != null ? encryptedChat.user_id : unVar.a();
            cbVar.b(a2, unVar.getMessagesController().getPeerSettings(a2));
            return;
        }
        if (i10 == this.F || i10 == this.E) {
            ((org.telegram.ui.Cells.y0) view).setProgressVisible(unVar.V6 > 1);
            return;
        }
        if (i10 == this.H) {
            if (unVar.getMessagesController().getPeerSettings(unVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.v0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedName, LocaleController.formatRelativeDate(unVar.getConnectionsManager().getCurrentTime() - r1.name_change_date)));
            return;
        }
        if (i10 == this.G) {
            if (unVar.getMessagesController().getPeerSettings(unVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.v0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedPhoto, LocaleController.formatRelativeDate(unVar.getConnectionsManager().getCurrentTime() - r1.photo_change_date)));
            return;
        }
        if (i10 == this.s) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            un.h4(unVar);
            v0Var.setMessageObject(unVar.U3);
            int i23 = unVar.d4;
            if (i23 == 3) {
                v0Var.setCustomText(LocaleController.getString(R.string.SavedMessagesProfileHint));
            } else if (i23 == 5) {
                v0Var.setCustomText(LocaleController.getString(R.string.BusinessRepliesHint));
            } else if (i23 == 9) {
                v0Var.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint2));
            }
            v0Var.setAlpha(1.0f);
            v0Var.setSpoilersSuppressed(unVar.x0.getScrollState() != 0);
            return;
        }
        if (i10 == this.v) {
            org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) view;
            un.i4(unVar);
            v0Var2.setMessageObject(unVar.V3);
            v0Var2.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint));
            v0Var2.setAlpha(1.0f);
            v0Var2.setSpoilersSuppressed(unVar.x0.getScrollState() != 0);
            return;
        }
        int i24 = this.J;
        if (i10 < i24 || i10 >= this.K) {
            return;
        }
        ArrayList arrayList4 = this.L ? this.M : this.N ? this.P : unVar.G6;
        MessageObject messageObject2 = (MessageObject) arrayList4.get(i10 - i24);
        if (!(view instanceof org.telegram.ui.Cells.s1)) {
            ArrayList arrayList5 = arrayList4;
            MessageObject messageObject3 = null;
            if (!(view instanceof org.telegram.ui.Cells.v0)) {
                if (view instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.setText(LocaleController.getString(R.string.UnreadMessages));
                    u1Var.getTextView().setTranslationX(unVar.b9() / 2.0f);
                    if (unVar.P7 != 0) {
                        unVar.P7 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            if ((messageObject2 == null || !messageObject2.isDateObject) && (i12 = (i11 = i10 + 1) - this.J) >= 0 && i12 < arrayList5.size()) {
                MessageObject messageObject4 = (MessageObject) arrayList5.get(i11 - this.J);
                if (messageObject4 == null || !messageObject4.isDateObject) {
                    messageObject3 = messageObject4;
                } else {
                    int i25 = i10 + 2;
                    int i26 = i25 - this.J;
                    if (i26 >= 0 && i26 < arrayList5.size()) {
                        messageObject3 = (MessageObject) arrayList5.get(i25 - this.J);
                    }
                }
                if (messageObject3 == null || (messageObject2 != null && messageObject3.getTopicId() != messageObject2.getTopicId())) {
                    z10 = true;
                    org.telegram.ui.Cells.v0 v0Var3 = (org.telegram.ui.Cells.v0) view;
                    v0Var3.e0 = unVar.B9();
                    v0Var3.i0 = unVar.L9();
                    unVar.K9();
                    unVar.a9();
                    v0Var3.j0 = unVar.b9();
                    v0Var3.f0 = ChatObject.isForum(unVar.e);
                    v0Var3.g0 = ChatObject.isMonoForum(unVar.e);
                    v0Var3.h0 = UserObject.isBotForum(unVar.f);
                    boolean z32 = v0Var3.k0 == z10;
                    v0Var3.k0 = z10;
                    v0Var3.X(messageObject2, z32);
                    v0Var3.setAlpha(1.0f);
                    v0Var3.setShowTopic(true);
                    v0Var3.setSpoilersSuppressed(unVar.x0.getScrollState() == 0);
                    return;
                }
            }
            z10 = false;
            org.telegram.ui.Cells.v0 v0Var32 = (org.telegram.ui.Cells.v0) view;
            v0Var32.e0 = unVar.B9();
            v0Var32.i0 = unVar.L9();
            unVar.K9();
            unVar.a9();
            v0Var32.j0 = unVar.b9();
            v0Var32.f0 = ChatObject.isForum(unVar.e);
            v0Var32.g0 = ChatObject.isMonoForum(unVar.e);
            v0Var32.h0 = UserObject.isBotForum(unVar.f);
            if (v0Var32.k0 == z10) {
            }
            v0Var32.k0 = z10;
            v0Var32.X(messageObject2, z32);
            v0Var32.setAlpha(1.0f);
            v0Var32.setShowTopic(true);
            v0Var32.setSpoilersSuppressed(unVar.x0.getScrollState() == 0);
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
        MessageObject.GroupedMessages h92 = unVar.h9(messageObject2);
        s1Var.N7 = unVar.e != null || UserObject.isUserSelf(unVar.f) || UserObject.isReplyUser(unVar.f) || unVar.d4 == 7;
        s1Var.y.a(false, false);
        s1Var.O7 = UserObject.isBotForum(unVar.f);
        s1Var.a8 = unVar.J9();
        int i27 = unVar.d4;
        s1Var.P7 = i27 == 3;
        s1Var.Q7 = i27 == 3 && unVar.bb;
        TLRPC.User user3 = unVar.f;
        s1Var.R7 = user3 != null && user3.bot;
        s1Var.S7 = ChatObject.isChannel(unVar.e) && unVar.e.megagroup;
        s1Var.T7 = ChatObject.isForum(unVar.e);
        s1Var.U7 = ChatObject.isMonoForum(unVar.e);
        s1Var.V7 = ChatObject.isForum(unVar.e) && unVar.t4 && unVar.b() == 1;
        s1Var.W7 = (unVar.p4 != 0 || (s1Var.T7 && unVar.t4)) && !s1Var.U7;
        int i28 = unVar.d4;
        if (i28 != 1 && i28 != 9 && ChatObject.isChannel(unVar.e)) {
            TLRPC.Chat chat = unVar.e;
            if (chat.has_link && !chat.megagroup) {
                z11 = true;
                s1Var.X7 = z11;
                s1Var.Y7 = unVar.d4 != 0 && (unVar.V4.containsKey(Integer.valueOf(messageObject2.getId())) || !(h92 == null || h92.messages.isEmpty() || !unVar.V4.containsKey(Integer.valueOf(h92.messages.get(0).getId()))));
                i13 = unVar.d4;
                if (i13 != 1 || i13 == 9 || (chatFull = unVar.l8) == null) {
                    arrayList = arrayList4;
                    j10 = 0;
                } else {
                    arrayList = arrayList4;
                    j10 = chatFull.linked_chat_id;
                }
                s1Var.b8 = j10;
                if (i13 == 7 || unVar.a4 != 1) {
                    s1Var.c8 = UserObject.isReplyUser(unVar.f);
                } else {
                    s1Var.c8 = UserObject.isReplyUser(messageObject2.getDialogId());
                }
                s1Var.d8 = unVar.d4 != 2;
                s1Var.E8 = unVar.B9();
                s1Var.F8 = unVar.L9();
                s1Var.G8 = unVar.K9();
                s1Var.H8 = unVar.a9();
                s1Var.I8 = unVar.b9();
                if (messageObject2.isSponsored()) {
                    AndroidUtilities.doOnPreDraw(s1Var, new ag.c(25));
                }
                int i29 = i10 + 2;
                if (h92 == null) {
                    MessageObject.GroupedMessagePosition position = h92.getPosition(messageObject2);
                    if (position != null) {
                        if (h92.isDocuments) {
                            int indexOf2 = h92.posArray.indexOf(position) + i10 + 1;
                            i14 = 4;
                            int indexOf3 = h92.posArray.indexOf(position) + (i10 - h92.posArray.size());
                            i16 = indexOf2;
                            z13 = false;
                            z14 = false;
                            i15 = indexOf3;
                            z12 = false;
                        } else {
                            i14 = 4;
                            if ((position.flags & 4) != 0) {
                                i22 = h92.reversed ? h92.posArray.indexOf(position) + (i10 - h92.posArray.size()) : h92.posArray.indexOf(position) + i10 + 1;
                                z12 = false;
                                z29 = false;
                            } else {
                                z12 = true;
                                z29 = true;
                                i22 = -100;
                            }
                            if ((position.flags & 8) != 0) {
                                int i30 = i22;
                                i15 = h92.reversed ? h92.posArray.indexOf(position) + i10 + 1 : h92.posArray.indexOf(position) + (i10 - h92.posArray.size());
                                i16 = i30;
                                z30 = z29;
                                z13 = false;
                                z14 = false;
                            } else {
                                i16 = i22;
                                z30 = z29;
                                i15 = -100;
                                z13 = true;
                                z14 = true;
                            }
                        }
                        int j16 = j(i15);
                        boolean z33 = z12;
                        j11 = j(i16);
                        j(i29);
                        if ((messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && j16 == e1Var.f) {
                            arrayList2 = arrayList;
                            MessageObject messageObject5 = (MessageObject) arrayList2.get(i15 - this.J);
                            i17 = i16;
                            boolean z34 = messageObject5.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject5.messageOwner.date - messageObject2.messageOwner.date) <= 300 || unVar.d4 == 9);
                            if (z34) {
                                TLRPC.Message message2 = messageObject5.messageOwner;
                                z15 = z13;
                                z16 = z30;
                                if (message2 == null || message2.paid_message_stars <= 0) {
                                    if (messageObject2.isImportedForward() || messageObject5.isImportedForward()) {
                                        if (messageObject2.isImportedForward() && messageObject5.isImportedForward() && Math.abs(messageObject5.messageOwner.fwd_from.date - messageObject2.messageOwner.fwd_from.date) <= 300) {
                                            TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject5.messageOwner.fwd_from;
                                            String str5 = messageFwdHeader2.from_name;
                                            if (str5 == null || (str3 = messageObject2.messageOwner.fwd_from.from_name) == null) {
                                                TLRPC.Peer peer = messageFwdHeader2.from_id;
                                                if (peer != null) {
                                                    if (messageObject2.messageOwner.fwd_from.from_id != null) {
                                                    }
                                                }
                                            } else {
                                                z34 = str5.equals(str3);
                                                if (DialogObject.getPeerDialogId(messageObject5.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                                    z14 = false;
                                                }
                                            }
                                        }
                                    } else if (unVar.e != null) {
                                        long fromChatId = messageObject5.getFromChatId();
                                        z34 = fromChatId == messageObject2.getFromChatId();
                                        if (!z15) {
                                            if (z34) {
                                                if (fromChatId < 0) {
                                                    if (unVar.e.megagroup) {
                                                    }
                                                }
                                            }
                                        }
                                        if (DialogObject.getPeerDialogId(messageObject5.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    } else {
                                        if (UserObject.isUserSelf(unVar.f) || UserObject.isReplyUser(unVar.f)) {
                                            if (!messageObject2.isPrivateForward()) {
                                                if (!messageObject5.isPrivateForward()) {
                                                }
                                            }
                                        } else if (unVar.d4 == 7) {
                                        }
                                        if (DialogObject.getPeerDialogId(messageObject5.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    }
                                }
                                z34 = false;
                                if (DialogObject.getPeerDialogId(messageObject5.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                }
                            } else {
                                z15 = z13;
                                z16 = z30;
                            }
                            z14 = z34;
                        } else {
                            z15 = z13;
                            z16 = z30;
                            arrayList2 = arrayList;
                            i17 = i16;
                        }
                        i18 = i17 - this.J;
                        if (i18 >= 0 && i18 < arrayList2.size()) {
                            messageObject = (MessageObject) arrayList2.get(i17 - this.J);
                            if (messageObject != null && messageObject.isDateObject) {
                                int i31 = i17 + 1;
                                int i32 = i31 - this.J;
                                messageObject = (i32 >= 0 || i32 >= arrayList2.size()) ? null : (MessageObject) arrayList2.get(i31 - this.J);
                            }
                            if (messageObject != null && messageObject.getTopicId() == messageObject2.getTopicId()) {
                                z17 = z16;
                                z18 = false;
                                i19 = this.J;
                                if (i10 == i19) {
                                    z19 = z15;
                                    z20 = true;
                                } else {
                                    z19 = z15;
                                    z20 = false;
                                }
                                if (j11 == e1Var.f) {
                                    MessageObject messageObject6 = (MessageObject) arrayList2.get(i17 - i19);
                                    boolean z35 = !(messageObject6.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject6.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject6.messageOwner.date - messageObject2.messageOwner.date) <= 300 || unVar.d4 == 9);
                                    if (!z35) {
                                        z21 = z19;
                                        z22 = z35;
                                    } else if (messageObject2.isImportedForward() || messageObject6.isImportedForward()) {
                                        z21 = z19;
                                        if (messageObject2.isImportedForward() && messageObject6.isImportedForward() && Math.abs(messageObject2.messageOwner.fwd_from.date - messageObject6.messageOwner.fwd_from.date) <= 300) {
                                            TLRPC.MessageFwdHeader messageFwdHeader3 = messageObject6.messageOwner.fwd_from;
                                            String str6 = messageFwdHeader3.from_name;
                                            if (str6 == null || (str2 = messageObject2.messageOwner.fwd_from.from_name) == null) {
                                                TLRPC.Peer peer2 = messageFwdHeader3.from_id;
                                                if (peer2 != null) {
                                                    if (messageObject2.messageOwner.fwd_from.from_id != null) {
                                                    }
                                                }
                                            } else {
                                                z22 = str6.equals(str2);
                                                if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                                    z22 = false;
                                                }
                                            }
                                        }
                                        z22 = false;
                                        if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    } else if (unVar.e != null) {
                                        long fromChatId2 = messageObject6.getFromChatId();
                                        boolean z36 = (fromChatId2 != messageObject2.getFromChatId() || messageObject2.isImportedForward() || messageObject6.isImportedForward()) ? false : true;
                                        if (!z17 && z36 && fromChatId2 < 0 && unVar.e.megagroup && unVar.d4 != 9) {
                                            z36 = false;
                                        }
                                        if (z36 && unVar.D9()) {
                                            TLRPC.TL_forumTopic tL_forumTopic = messageObject2.replyToForumTopic;
                                            if (tL_forumTopic == null) {
                                                z28 = true;
                                                j12 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.r2) unVar).currentAccount, messageObject2.messageOwner, true);
                                            } else {
                                                z28 = true;
                                                j12 = tL_forumTopic.id;
                                            }
                                            TLRPC.TL_forumTopic tL_forumTopic2 = messageObject6.replyToForumTopic;
                                            if (tL_forumTopic2 == null) {
                                                z21 = z19;
                                                j13 = j12;
                                                j14 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.r2) unVar).currentAccount, messageObject6.messageOwner, z28);
                                            } else {
                                                z21 = z19;
                                                j13 = j12;
                                                j14 = tL_forumTopic2.id;
                                            }
                                        } else {
                                            z21 = z19;
                                        }
                                        z22 = z36;
                                        if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    } else {
                                        z21 = z19;
                                        if (UserObject.isUserSelf(unVar.f) || UserObject.isReplyUser(unVar.f)) {
                                            if (!messageObject2.isPrivateForward()) {
                                                if (!messageObject6.isPrivateForward()) {
                                                }
                                            }
                                            z22 = false;
                                        } else if (unVar.d4 != 7) {
                                            z22 = z35;
                                        }
                                        if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    }
                                } else {
                                    z21 = z19;
                                    z22 = z33;
                                }
                                if (ChatObject.isChannel(unVar.e) && unVar.e.megagroup && messageObject2.getFromChatId() <= 0 && (messageFwdHeader = messageObject2.messageOwner.fwd_from) != null && (messageFwdHeader.saved_from_peer instanceof TLRPC.TL_peerChannel)) {
                                    if (!z17) {
                                        z22 = false;
                                    }
                                    if (!z21) {
                                        z14 = false;
                                    }
                                }
                                if (!z17 && (message = messageObject2.messageOwner) != null && message.paid_message_stars > 0) {
                                    z22 = false;
                                }
                                boolean z37 = false;
                                messageObject2.updateTranslation(false);
                                if (h92 != null) {
                                    int i33 = 0;
                                    while (i33 < h92.messages.size()) {
                                        h92.messages.get(i33).updateTranslation(z37);
                                        i33++;
                                        z37 = false;
                                    }
                                }
                                if (!unVar.cb) {
                                    z23 = z22;
                                    z24 = z14;
                                } else {
                                    if (h92 != null) {
                                        z25 = true;
                                        z24 = false;
                                        z23 = false;
                                        s1Var.setShowTopic(z25);
                                        s1Var.Z3(messageObject2, h92, z24, z23, z18, z20);
                                        s1Var.setSpoilersSuppressed(unVar.x0.getScrollState() == 0);
                                        s1Var.setHighlighted(unVar.X7 == Integer.MAX_VALUE && messageObject2.getId() == unVar.X7);
                                        z26 = s1Var.f8;
                                        if (!z26 && unVar.b8 != null) {
                                            long currentTimeMillis = System.currentTimeMillis();
                                            s1Var.V3(unVar.b8, true, unVar.Z7 || currentTimeMillis - unVar.a8 < 200, unVar.e8);
                                            if (unVar.Z7) {
                                                unVar.a8 = currentTimeMillis;
                                            }
                                            unVar.Z7 = false;
                                        } else if (!z26 && (num = unVar.c8) != null) {
                                            s1Var.T3(num.intValue());
                                        } else if (!z26 && (bArr = unVar.d8) != null) {
                                            s1Var.R3(bArr);
                                        } else if (unVar.d4 == 7 && unVar.G3 != null && (str = unVar.F3) != null) {
                                            s1Var.U3(str);
                                        }
                                        if (unVar.X7 != Integer.MAX_VALUE) {
                                            unVar.lc();
                                        }
                                        indexOf = arrayList3.indexOf(messageObject2);
                                        if (indexOf != -1) {
                                            if (messageObject2.type == 5 && (t60Var = unVar.n3) != null && t60Var.getTextureView() != null) {
                                                jg jgVar = unVar.C7;
                                                if (jgVar != null) {
                                                    AndroidUtilities.cancelRunOnUIThread(jgVar);
                                                    unVar.C7 = null;
                                                }
                                                s1Var.getViewTreeObserver().addOnPreDrawListener(new zl(0, this, s1Var));
                                            } else if ((messageObject2.isAnyKindOfSticker() && !messageObject2.isAnimatedEmojiStickers()) || ((sendAnimationData = messageObject2.sendAnimationData) != null && sendAnimationData.fromPreview)) {
                                                if (!messageObject2.sendAnimationData.fromPreview || (hkVar = unVar.Y) == null || hkVar.L0 == null) {
                                                    s1Var.getViewTreeObserver().addOnPreDrawListener(new em(this, s1Var));
                                                } else {
                                                    if (((org.telegram.ui.ActionBar.r2) unVar).actionBar.getVisibility() == 0) {
                                                        int measuredHeight = ((org.telegram.ui.ActionBar.r2) unVar).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.r2) unVar).actionBar.getTranslationY());
                                                        sk skVar = unVar.A1;
                                                        int currentHeight = measuredHeight + (skVar != null ? skVar.getCurrentHeight() : 0);
                                                        ek ekVar = unVar.B1;
                                                        i20 = (((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode ? AndroidUtilities.statusBarHeight : 0) + currentHeight + (ekVar != null ? ekVar.getCurrentHeight() : 0);
                                                    } else {
                                                        i20 = 0;
                                                    }
                                                    float f7 = i20 + unVar.F9;
                                                    float height = unVar.fragmentView == null ? 0.0f : r9.getHeight();
                                                    org.telegram.ui.Components.mf mfVar = unVar.Y.L0;
                                                    Rect rect = mfVar.t0;
                                                    if (!mfVar.p0) {
                                                        mfVar.r = true;
                                                        mfVar.p0 = true;
                                                        ai0 ai0Var = mfVar.W;
                                                        if (ai0Var != null) {
                                                            ai0Var.invalidate();
                                                        }
                                                        org.telegram.ui.Components.vg vgVar = mfVar.V;
                                                        if (vgVar != null) {
                                                            vgVar.invalidate();
                                                        }
                                                        if (mfVar.P != null) {
                                                            mfVar.q0 = s1Var;
                                                            s1Var.setVisibility(i14);
                                                            mfVar.r0 = f7;
                                                            mfVar.s0 = height;
                                                            org.telegram.ui.Cells.s1 s1Var2 = mfVar.P;
                                                            org.telegram.ui.Cells.s1 s1Var3 = mfVar.q0;
                                                            s1Var2.N7 = s1Var3.N7;
                                                            s1Var2.W7 = s1Var3.W7;
                                                            s1Var2.P7 = s1Var3.P7;
                                                            s1Var2.R7 = s1Var3.R7;
                                                            s1Var2.T7 = s1Var3.T7;
                                                            s1Var2.V7 = s1Var3.V7;
                                                            s1Var2.Z3(s1Var.getMessageObject(), null, s1Var.m3(), s1Var.n3(), s1Var.h3(), false);
                                                            org.telegram.ui.Cells.r1 transitionParams = mfVar.P.getTransitionParams();
                                                            transitionParams.g = mfVar.P.getTransitionParams().f();
                                                            Rect rect2 = transitionParams.D0;
                                                            transitionParams.K1 = 0.0f;
                                                            if (mfVar.P.getTransitionParams().D0.left == mfVar.P.getBackgroundDrawableLeft() && rect2.top == mfVar.P.getBackgroundDrawableTop() && rect2.bottom == mfVar.P.getBackgroundDrawableBottom()) {
                                                                i21 = 1;
                                                            } else {
                                                                rect.bottom = -(mfVar.P.getBackgroundDrawableBottom() - rect2.bottom);
                                                                rect.top = -(mfVar.P.getBackgroundDrawableTop() - rect2.top);
                                                                if (s1Var.getMessageObject().isOutOwner()) {
                                                                    rect.left = -(mfVar.P.getBackgroundDrawableLeft() - rect2.left);
                                                                    rect.right = 0;
                                                                } else {
                                                                    rect.left = 0;
                                                                    rect.right = mfVar.P.getBackgroundDrawableRight() - rect2.right;
                                                                }
                                                                i21 = 1;
                                                                transitionParams.w0 = true;
                                                            }
                                                            int i34 = mfVar.P.Zd;
                                                        } else {
                                                            i21 = 1;
                                                        }
                                                        mfVar.d(new sh0(mfVar, i21), false);
                                                        mfVar.E.invalidate();
                                                        NotificationCenter.getInstance(mfVar.c).removeObserver(mfVar, NotificationCenter.availableEffectsUpdate);
                                                    }
                                                    unVar.Y.L0 = null;
                                                }
                                            }
                                            arrayList3.remove(indexOf);
                                            hk hkVar2 = unVar.Y;
                                            Runnable runnable = hkVar2.f0;
                                            if (runnable != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable);
                                                z27 = true;
                                                hkVar2.g0 = true;
                                                hkVar2.f0.run();
                                                hkVar2.f0 = null;
                                            } else {
                                                z27 = true;
                                            }
                                            unVar.Y.n0(z27);
                                        }
                                        if (!hashMap.isEmpty() && hashMap.containsKey(messageObject2.getDocument())) {
                                            hashMap.remove(messageObject2.getDocument());
                                            qjVar = unVar.y0;
                                            if (qjVar != null) {
                                                org.telegram.ui.Components.vo voVar = unVar.e1;
                                                qjVar.O = e1Var;
                                                qjVar.P = voVar;
                                                r10 = 0;
                                                qjVar.N = false;
                                                if (s1Var.fd) {
                                                    s1Var.fd = r10;
                                                    s1Var.setVisibility(r10);
                                                }
                                                unVar.Fb(s1Var);
                                            }
                                        }
                                        r10 = 0;
                                        if (s1Var.fd) {
                                        }
                                        unVar.Fb(s1Var);
                                    }
                                    z24 = z22;
                                    z23 = z14;
                                }
                                z25 = true;
                                s1Var.setShowTopic(z25);
                                s1Var.Z3(messageObject2, h92, z24, z23, z18, z20);
                                s1Var.setSpoilersSuppressed(unVar.x0.getScrollState() == 0);
                                s1Var.setHighlighted(unVar.X7 == Integer.MAX_VALUE && messageObject2.getId() == unVar.X7);
                                z26 = s1Var.f8;
                                if (!z26) {
                                }
                                if (!z26) {
                                }
                                if (!z26) {
                                }
                                if (unVar.d4 == 7) {
                                    s1Var.U3(str);
                                }
                                if (unVar.X7 != Integer.MAX_VALUE) {
                                }
                                indexOf = arrayList3.indexOf(messageObject2);
                                if (indexOf != -1) {
                                }
                                if (!hashMap.isEmpty()) {
                                    hashMap.remove(messageObject2.getDocument());
                                    qjVar = unVar.y0;
                                    if (qjVar != null) {
                                    }
                                }
                                r10 = 0;
                                if (s1Var.fd) {
                                }
                                unVar.Fb(s1Var);
                            }
                        }
                        z17 = z16;
                        z18 = true;
                        i19 = this.J;
                        if (i10 == i19) {
                        }
                        if (j11 == e1Var.f) {
                        }
                        if (ChatObject.isChannel(unVar.e)) {
                            if (!z17) {
                            }
                            if (!z21) {
                            }
                        }
                        if (!z17) {
                            z22 = false;
                        }
                        boolean z372 = false;
                        messageObject2.updateTranslation(false);
                        if (h92 != null) {
                        }
                        if (!unVar.cb) {
                        }
                        z25 = true;
                        s1Var.setShowTopic(z25);
                        s1Var.Z3(messageObject2, h92, z24, z23, z18, z20);
                        s1Var.setSpoilersSuppressed(unVar.x0.getScrollState() == 0);
                        s1Var.setHighlighted(unVar.X7 == Integer.MAX_VALUE && messageObject2.getId() == unVar.X7);
                        z26 = s1Var.f8;
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (unVar.d4 == 7) {
                        }
                        if (unVar.X7 != Integer.MAX_VALUE) {
                        }
                        indexOf = arrayList3.indexOf(messageObject2);
                        if (indexOf != -1) {
                        }
                        if (!hashMap.isEmpty()) {
                        }
                        r10 = 0;
                        if (s1Var.fd) {
                        }
                        unVar.Fb(s1Var);
                    }
                    i14 = 4;
                    z12 = false;
                    i16 = -100;
                    i15 = -100;
                } else {
                    i14 = 4;
                    i15 = i10 - 1;
                    i16 = i10 + 1;
                    z12 = false;
                }
                z13 = false;
                z30 = false;
                z14 = false;
                int j162 = j(i15);
                boolean z332 = z12;
                j11 = j(i16);
                j(i29);
                if (messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                }
                z15 = z13;
                z16 = z30;
                arrayList2 = arrayList;
                i17 = i16;
                i18 = i17 - this.J;
                if (i18 >= 0) {
                    messageObject = (MessageObject) arrayList2.get(i17 - this.J);
                    if (messageObject != null) {
                        int i312 = i17 + 1;
                        int i322 = i312 - this.J;
                        if (i322 >= 0) {
                        }
                    }
                    if (messageObject != null) {
                        z17 = z16;
                        z18 = false;
                        i19 = this.J;
                        if (i10 == i19) {
                        }
                        if (j11 == e1Var.f) {
                        }
                        if (ChatObject.isChannel(unVar.e)) {
                        }
                        if (!z17) {
                        }
                        boolean z3722 = false;
                        messageObject2.updateTranslation(false);
                        if (h92 != null) {
                        }
                        if (!unVar.cb) {
                        }
                        z25 = true;
                        s1Var.setShowTopic(z25);
                        s1Var.Z3(messageObject2, h92, z24, z23, z18, z20);
                        s1Var.setSpoilersSuppressed(unVar.x0.getScrollState() == 0);
                        s1Var.setHighlighted(unVar.X7 == Integer.MAX_VALUE && messageObject2.getId() == unVar.X7);
                        z26 = s1Var.f8;
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (unVar.d4 == 7) {
                        }
                        if (unVar.X7 != Integer.MAX_VALUE) {
                        }
                        indexOf = arrayList3.indexOf(messageObject2);
                        if (indexOf != -1) {
                        }
                        if (!hashMap.isEmpty()) {
                        }
                        r10 = 0;
                        if (s1Var.fd) {
                        }
                        unVar.Fb(s1Var);
                    }
                }
                z17 = z16;
                z18 = true;
                i19 = this.J;
                if (i10 == i19) {
                }
                if (j11 == e1Var.f) {
                }
                if (ChatObject.isChannel(unVar.e)) {
                }
                if (!z17) {
                }
                boolean z37222 = false;
                messageObject2.updateTranslation(false);
                if (h92 != null) {
                }
                if (!unVar.cb) {
                }
                z25 = true;
                s1Var.setShowTopic(z25);
                s1Var.Z3(messageObject2, h92, z24, z23, z18, z20);
                s1Var.setSpoilersSuppressed(unVar.x0.getScrollState() == 0);
                s1Var.setHighlighted(unVar.X7 == Integer.MAX_VALUE && messageObject2.getId() == unVar.X7);
                z26 = s1Var.f8;
                if (!z26) {
                }
                if (!z26) {
                }
                if (!z26) {
                }
                if (unVar.d4 == 7) {
                }
                if (unVar.X7 != Integer.MAX_VALUE) {
                }
                indexOf = arrayList3.indexOf(messageObject2);
                if (indexOf != -1) {
                }
                if (!hashMap.isEmpty()) {
                }
                r10 = 0;
                if (s1Var.fd) {
                }
                unVar.Fb(s1Var);
            }
        }
        z11 = false;
        s1Var.X7 = z11;
        s1Var.Y7 = unVar.d4 != 0 && (unVar.V4.containsKey(Integer.valueOf(messageObject2.getId())) || !(h92 == null || h92.messages.isEmpty() || !unVar.V4.containsKey(Integer.valueOf(h92.messages.get(0).getId()))));
        i13 = unVar.d4;
        if (i13 != 1) {
        }
        arrayList = arrayList4;
        j10 = 0;
        s1Var.b8 = j10;
        if (i13 == 7) {
        }
        s1Var.c8 = UserObject.isReplyUser(unVar.f);
        s1Var.d8 = unVar.d4 != 2;
        s1Var.E8 = unVar.B9();
        s1Var.F8 = unVar.L9();
        s1Var.G8 = unVar.K9();
        s1Var.H8 = unVar.a9();
        s1Var.I8 = unVar.b9();
        if (messageObject2.isSponsored()) {
        }
        int i292 = i10 + 2;
        if (h92 == null) {
        }
        z13 = false;
        z30 = false;
        z14 = false;
        int j1622 = j(i15);
        boolean z3322 = z12;
        j11 = j(i16);
        j(i292);
        if (messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
        }
        z15 = z13;
        z16 = z30;
        arrayList2 = arrayList;
        i17 = i16;
        i18 = i17 - this.J;
        if (i18 >= 0) {
        }
        z17 = z16;
        z18 = true;
        i19 = this.J;
        if (i10 == i19) {
        }
        if (j11 == e1Var.f) {
        }
        if (ChatObject.isChannel(unVar.e)) {
        }
        if (!z17) {
        }
        boolean z372222 = false;
        messageObject2.updateTranslation(false);
        if (h92 != null) {
        }
        if (!unVar.cb) {
        }
        z25 = true;
        s1Var.setShowTopic(z25);
        s1Var.Z3(messageObject2, h92, z24, z23, z18, z20);
        s1Var.setSpoilersSuppressed(unVar.x0.getScrollState() == 0);
        s1Var.setHighlighted(unVar.X7 == Integer.MAX_VALUE && messageObject2.getId() == unVar.X7);
        z26 = s1Var.f8;
        if (!z26) {
        }
        if (!z26) {
        }
        if (!z26) {
        }
        if (unVar.d4 == 7) {
        }
        if (unVar.X7 != Integer.MAX_VALUE) {
        }
        indexOf = arrayList3.indexOf(messageObject2);
        if (indexOf != -1) {
        }
        if (!hashMap.isEmpty()) {
        }
        r10 = 0;
        if (s1Var.fd) {
        }
        unVar.Fb(s1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.ui.yl] */
    /* JADX WARN: Type inference failed for: r8v11, types: [org.telegram.ui.Cells.v0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [org.telegram.ui.Cells.cb] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Cells.y0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [org.telegram.ui.Cells.g0, org.telegram.ui.xl] */
    /* JADX WARN: Type inference failed for: r8v16, types: [org.telegram.ui.Cells.u1] */
    /* JADX WARN: Type inference failed for: r8v9, types: [org.telegram.ui.Cells.t1] */
    /* JADX WARN: Type inference failed for: r9v16, types: [org.telegram.ui.Cells.v0] */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Cells.s1 s1Var2;
        un unVar = this.Q;
        if (i10 == 0) {
            s1Var = new org.telegram.ui.Cells.s1(this.h, ((org.telegram.ui.ActionBar.r2) unVar).currentAccount, true, unVar.Oa, unVar.qa);
            s1Var.setResourcesProvider(unVar.qa);
            if (unVar.Lc == null) {
                unVar.Lc = new fn(unVar);
            }
            s1Var.setDelegate(unVar.Lc);
            s1Var.Pd = unVar.lc;
            if (unVar.h == null) {
                s1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? ulVar = new ul(context, unVar.qa, true);
                ulVar.setInvalidateColors(true);
                ulVar.setDelegate(new wl(this));
                s1Var = ulVar;
            } else {
                if (i10 == 2) {
                    ?? u1Var = new org.telegram.ui.Cells.u1(context, unVar.qa);
                    org.telegram.ui.ActionBar.f7.V(u1Var.getTextView(), org.telegram.ui.ActionBar.y6.Ee, unVar.qa);
                    Drawable background = u1Var.getBackgroundLayout().getBackground();
                    s1Var2 = u1Var;
                    if (background != null) {
                        org.telegram.ui.ActionBar.f7.y(u1Var.getBackgroundLayout(), u1Var.getBackgroundLayout().getBackground(), org.telegram.ui.ActionBar.y6.Fe, unVar.qa, PorterDuff.Mode.MULTIPLY);
                        s1Var2 = u1Var;
                    }
                } else if (i10 == 3) {
                    ?? xlVar = new xl(this, context, ((org.telegram.ui.ActionBar.r2) unVar).currentAccount, unVar.qa);
                    xlVar.setDelegate(new y0(this, 22));
                    s1Var2 = xlVar;
                } else if (i10 == 4) {
                    s1Var2 = new org.telegram.ui.Cells.y0(context, unVar.qa);
                } else if (i10 == 6) {
                    s1Var2 = new org.telegram.ui.Cells.cb(context, ((org.telegram.ui.ActionBar.r2) unVar).currentAccount, unVar.qa);
                } else if (i10 == 7) {
                    s1Var2 = new org.telegram.ui.Cells.v0(context, unVar.qa, false);
                } else if (i10 == 8) {
                    s1Var2 = new yl(this, context, ((org.telegram.ui.ActionBar.r2) unVar).currentAccount, unVar.qa);
                } else if (i10 == 10) {
                    ?? t1Var = new org.telegram.ui.Cells.t1(context, unVar.qa);
                    if (unVar.Lc == null) {
                        unVar.Lc = new fn(unVar);
                    }
                    t1Var.setDelegate(unVar.Lc);
                    s1Var2 = t1Var;
                } else {
                    s1Var = null;
                }
                s1Var = s1Var2;
            }
        }
        return ic.a.n(s1Var, s1Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        TLRPC.Message message;
        boolean z10;
        boolean z11;
        byte[] bArr;
        Integer num;
        String str;
        String stickerEmoji;
        MessagesController.EmojiSound emojiSound;
        View view = e1Var.a;
        boolean z12 = view instanceof org.telegram.ui.Cells.s1;
        un unVar = this.Q;
        if (z12 || (view instanceof org.telegram.ui.Cells.v0)) {
            unVar.z9();
        }
        boolean z13 = view instanceof org.telegram.ui.Cells.s1;
        if (z13) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject messageObject = s1Var.getMessageObject();
            s1Var.E8 = unVar.B9();
            s1Var.F8 = unVar.L9();
            s1Var.G8 = unVar.K9();
            s1Var.H8 = unVar.a9();
            s1Var.I8 = unVar.b9();
            s1Var.i4(-1, true, false);
            MessageObject messageObject2 = unVar.S3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                s1Var.i4(unVar.T3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = unVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                unVar.getMediaController().playEmojiSound(unVar.getAccountInstance(), stickerEmoji, emojiSound, true);
            }
            if (messageObject.updateTranslation(false)) {
                s1Var.Z3(messageObject, s1Var.getCurrentMessagesGroup(), s1Var.m3(), s1Var.n3(), s1Var.h3(), s1Var.j3());
            } else {
                MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    for (int i10 = 0; i10 < currentMessagesGroup.messages.size(); i10++) {
                        currentMessagesGroup.messages.get(i10).updateTranslation();
                    }
                }
            }
            if (((org.telegram.ui.ActionBar.r2) unVar).actionBar.q() || unVar.J9()) {
                unVar.Z7 = false;
                unVar.a8 = 0L;
                unVar.b8 = null;
                ArrayList arrayList = unVar.m4;
                s1Var.L3(arrayList == null || !arrayList.contains(messageObject), false);
                int i11 = messageObject.getDialogId() == unVar.f6 ? 0 : 1;
                if (unVar.i6[i11].indexOfKey(messageObject.getId()) >= 0) {
                    unVar.sb(messageObject, s1Var, i11, false);
                    z10 = true;
                } else {
                    s1Var.setDrawSelectionBackground(false);
                    s1Var.N3(false, false, false);
                    z10 = false;
                }
                z11 = true;
            } else {
                s1Var.setDrawSelectionBackground(false);
                s1Var.N3(false, false, false);
                s1Var.L3(false, false);
                z10 = false;
                z11 = false;
            }
            s1Var.M3(!z11, z11 && z10);
            if (unVar.d4 != 7 || unVar.G3 == null || (str = unVar.F3) == null) {
                kk kkVar = unVar.d3;
                if (kkVar != null && kkVar.getVisibility() == 0) {
                    if (unVar.getMediaDataController().isMessageFound(messageObject.getId(), messageObject.getDialogId() == unVar.X6) && unVar.getMediaDataController().getLastSearchQuery() != null) {
                        s1Var.U3(unVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                s1Var.U3(null);
            } else {
                s1Var.U3(str);
            }
            if (!((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode || !s1Var.f8) {
                s1Var.setHighlighted(unVar.X7 != Integer.MAX_VALUE && ((s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == unVar.X7) || (s1Var.getCurrentMessagesGroup() != null && s1Var.getCurrentMessagesGroup().contains(unVar.X7))));
                boolean z14 = s1Var.f8;
                if (z14 && unVar.b8 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!s1Var.V3(unVar.b8, true, unVar.Z7 || currentTimeMillis - unVar.a8 < 200, unVar.e8) && unVar.Y7) {
                        org.telegram.ui.Components.wc.b0(unVar).R(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    unVar.Y7 = false;
                    if (unVar.Z7) {
                        unVar.a8 = currentTimeMillis;
                    }
                    unVar.Z7 = false;
                } else if (z14 && (num = unVar.c8) != null) {
                    s1Var.T3(num.intValue());
                } else if (z14 && (bArr = unVar.d8) != null) {
                    s1Var.R3(bArr);
                }
                if (unVar.X7 != Integer.MAX_VALUE) {
                    unVar.lc();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            v0Var.e0 = unVar.B9();
            v0Var.i0 = unVar.L9();
            unVar.K9();
            unVar.a9();
            v0Var.j0 = unVar.b9();
        } else if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(unVar.b9() / 2.0f);
        }
        int b10 = e1Var.b();
        int i12 = this.J;
        if (b10 < i12 || b10 >= this.K) {
            return;
        }
        MessageObject messageObject3 = (MessageObject) (this.L ? this.M : this.N ? this.P : unVar.G6).get(b10 - i12);
        if (messageObject3 == null || (message = messageObject3.messageOwner) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        if (!((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode && unVar.d4 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
            int i13 = unVar.x6 - 1;
            unVar.x6 = i13;
            if (i13 <= 0) {
                unVar.x6 = 0;
                unVar.y6 = true;
                unVar.Wb(false);
            } else {
                unVar.v1.c(2, i13, true);
            }
            unVar.getMessagesController().markMentionMessageAsRead(messageObject3.getId(), ChatObject.isChannel(unVar.e) ? unVar.e.id : 0L, unVar.f6);
            messageObject3.setContentIsRead();
        }
        if (z13) {
            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
            if (((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode) {
                s1Var2.setHighlighted(true);
            } else {
                s1Var2.Q3();
            }
        }
    }
}
