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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hm extends org.telegram.ui.Components.ol0 {
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
    public final /* synthetic */ wn Q;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public hm(wn wnVar, Context context) {
        this.Q = wnVar;
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
        TLRPC.User user = wnVar.f;
        this.n = user != null && user.bot;
        C(true);
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    public final void K(boolean z10) {
        wn wnVar = this.Q;
        if (UserObject.isBotForum(wnVar.f)) {
            if (z10) {
                wnVar.Nc = true;
            }
            if (this.I < 0 || N()) {
                return;
            }
            super.u(this.I);
            S();
        }
    }

    public final ArrayList L() {
        return this.L ? this.M : this.N ? this.P : this.Q.K6;
    }

    public final void M(MessageObject messageObject) {
        wn wnVar = this.Q;
        int childCount = wnVar.x0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = wnVar.x0.getChildAt(i10);
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
        wn wnVar = this.Q;
        return UserObject.isBotForumWithEditableTopics(wnVar.f) && wnVar.b() == 0 && !wnVar.Nc && wnVar.d4 == 0;
    }

    public final void O(boolean z10) {
        boolean z11;
        wn wnVar = this.Q;
        ArrayList arrayList = wnVar.K6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + wnVar.e6);
        }
        if (z10 && wnVar.e6) {
            s4.m0 itemAnimator = wnVar.x0.getItemAnimator();
            tj tjVar = wnVar.y0;
            if (itemAnimator != tjVar) {
                wnVar.x0.setItemAnimator(tjVar);
            }
        } else {
            wnVar.x0.setItemAnimator(null);
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
        boolean[] zArr = wnVar.S6;
        if ((zArr[0] && (wnVar.b7 == 0 || zArr[1])) || z11) {
            wnVar.U6(((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow);
        }
    }

    public final void P(int i10, boolean z10) {
        MessageObject messageObject;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i10);
            ic.a.w(z10 ? " with thanos effect" : "", sb2);
        }
        wn wnVar = this.Q;
        if (((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = wnVar.x0.getItemAnimator();
            tj tjVar = wnVar.y0;
            if (itemAnimator != tjVar) {
                wnVar.x0.setItemAnimator(tjVar);
            }
        } else {
            wnVar.x0.setItemAnimator(null);
        }
        if (z10 && wnVar.y0 != null) {
            s4.m0 itemAnimator2 = wnVar.x0.getItemAnimator();
            tj tjVar2 = wnVar.y0;
            if (itemAnimator2 == tjVar2) {
                s4.e1 K = wnVar.x0.K(i10);
                if (K == null) {
                    tjVar2.getClass();
                } else {
                    tjVar2.S.add(K);
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
        wn wnVar = this.Q;
        ArrayList arrayList = wnVar.K6;
        if (wnVar.z0 == null || this.L || this.N) {
            return;
        }
        int i12 = 0;
        if (!wnVar.P4 && wnVar.Z7 != null) {
            int childCount = wnVar.x0.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                View childAt = wnVar.x0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                    MessageObject messageObject2 = wnVar.Z7;
                    if (messageObject == messageObject2) {
                        if (arrayList.indexOf(messageObject2) >= 0) {
                            i11 = arrayList.indexOf(wnVar.Z7) + this.J;
                            i12 = wnVar.Y8(childAt);
                        }
                    }
                }
                i13++;
            }
        }
        i11 = -1;
        m(i10);
        if (i11 != -1) {
            wnVar.z0.h1(i11, i12);
        }
    }

    public final org.telegram.ui.Cells.s1 R(MessageObject messageObject, boolean z10, boolean z11) {
        wn wnVar = this.Q;
        if (z10) {
            int childCount = wnVar.x0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = wnVar.x0.getChildAt(i10);
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
        int indexOf = (this.L ? this.M : this.N ? this.P : wnVar.K6).indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (!z11) {
            Q(this.J + indexOf);
            return null;
        }
        int i11 = wn.hd;
        wn.hd = i11 + 1;
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
        wn wnVar = this.Q;
        boolean[] zArr = wnVar.S6;
        this.r = 0;
        ArrayList arrayList = this.L ? this.M : this.N ? this.P : wnVar.K6;
        if (wnVar.d4 == 3 && wnVar.fb) {
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
            TLRPC.User user4 = wnVar.f;
            if (user4 != null && !UserObject.isBot(user4) && !UserObject.isReplyUser(wnVar.f)) {
                TLRPC.PeerSettings peerSettings3 = wnVar.getMessagesController().getPeerSettings(wnVar.f.id);
                int i14 = org.telegram.ui.Cells.cb.O;
                if (peerSettings3 != null && ((peerSettings3.phone_country != null || peerSettings3.registration_month != null) && !MessagesController.isSupportUser(wnVar.f) && wnVar.d4 == 0)) {
                    int i15 = this.r;
                    this.r = i15 + 1;
                    this.y = i15;
                    return;
                }
            }
            if (UserObject.isReplyUser(wnVar.f) || ((user = wnVar.f) != null && user.bot && !MessagesController.isSupportUser(user) && wnVar.d4 == 0)) {
                int i16 = this.r;
                this.r = i16 + 1;
                this.w = i16;
                return;
            }
            return;
        }
        if (!this.N) {
            boolean[] zArr2 = wnVar.U6;
            if (((!zArr2[0] || (wnVar.b7 != 0 && !zArr2[1])) && !wnVar.V6) || wnVar.nb) {
                int i17 = this.r;
                this.r = i17 + 1;
                this.F = i17;
                int i18 = this.r;
                this.J = i18;
                int size = arrayList.size() + i18;
                this.r = size;
                this.K = size;
                user2 = wnVar.f;
                if (user2 != null && !UserObject.isBot(user2) && !UserObject.isReplyUser(wnVar.f)) {
                    peerSettings = wnVar.getMessagesController().getPeerSettings(wnVar.f.id);
                    int i19 = org.telegram.ui.Cells.cb.O;
                    if (peerSettings != null && ((peerSettings.phone_country != null || peerSettings.registration_month != null) && !MessagesController.isSupportUser(wnVar.f) && wnVar.d4 == 0 && zArr[0])) {
                        peerSettings2 = wnVar.getMessagesController().getPeerSettings(wnVar.f.id);
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
                        i10 = wnVar.d4;
                        if (i10 == 9) {
                            int i25 = this.r;
                            this.s = i25;
                            this.r = i25 + 2;
                            this.v = i25 + 1;
                        }
                        if (i10 == 5 && !jg.c2.g(wnVar.c4)) {
                            int i26 = this.r;
                            this.r = i26 + 1;
                            this.s = i26;
                        }
                        if (this.N ? !(!(zArr[0] && (wnVar.b7 == 0 || zArr[1])) && (AndroidUtilities.isTablet() || wnVar.s4 || wnVar.f != null)) : this.O) {
                            this.E = -5;
                            return;
                        }
                        int i27 = this.r;
                        this.r = i27 + 1;
                        this.E = i27;
                        return;
                    }
                }
                if ((!UserObject.isReplyUser(wnVar.f) || ((user3 = wnVar.f) != null && user3.bot && !MessagesController.isSupportUser(user3) && wnVar.d4 == 0)) && zArr[0]) {
                    int i28 = this.r;
                    this.r = i28 + 1;
                    this.w = i28;
                }
                i10 = wnVar.d4;
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
        user2 = wnVar.f;
        if (user2 != null) {
            peerSettings = wnVar.getMessagesController().getPeerSettings(wnVar.f.id);
            int i192 = org.telegram.ui.Cells.cb.O;
            if (peerSettings != null) {
                peerSettings2 = wnVar.getMessagesController().getPeerSettings(wnVar.f.id);
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
                i10 = wnVar.d4;
                if (i10 == 9) {
                }
                if (i10 == 5) {
                }
                if (this.N) {
                }
            }
        }
        if (!UserObject.isReplyUser(wnVar.f)) {
        }
        int i282 = this.r;
        this.r = i282 + 1;
        this.w = i282;
        i10 = wnVar.d4;
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
        wn wnVar = this.Q;
        a0.h hVar = wnVar.t8;
        if (wnVar.c6.get(wnVar.p4, 0) == 0) {
            return this.r;
        }
        TLRPC.User user = wnVar.f;
        if (user == null || !user.bot || wnVar.d4 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(wnVar.f.id)).description == null && ((TL_bots.BotInfo) hVar.f(wnVar.f.id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(wnVar.f.id)).description_document == null)) && !UserObject.isReplyUser(wnVar.f) && !UserObject.isBotForum(wnVar.f))) {
            return 0;
        }
        this.x = 0;
        return 1;
    }

    @Override // s4.h0
    public final long i(int i10) {
        wn wnVar = this.Q;
        if (wnVar.c6.get(wnVar.p4, 0) != 0 && i10 == this.x) {
            return 1L;
        }
        ArrayList arrayList = this.L ? this.M : this.N ? this.P : wnVar.K6;
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
        wn wnVar = this.Q;
        if (wnVar.c6.get(wnVar.p4, 0) != 0 && i10 == this.x) {
            return 3;
        }
        if (i10 == this.s || i10 == this.v) {
            return 1;
        }
        int i11 = this.J;
        if (i10 >= i11 && i10 < this.K) {
            return ((MessageObject) (this.L ? this.M : this.N ? this.P : wnVar.K6).get(i10 - i11)).contentType;
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

    @Override // org.telegram.ui.Components.ol0, s4.h0
    public final void l() {
        O(false);
    }

    @Override // org.telegram.ui.Components.ol0, s4.h0
    public final void m(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item changed " + i10);
        }
        wn wnVar = this.Q;
        if (!((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow || wnVar.Z0) {
            wnVar.x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = wnVar.x0.getItemAnimator();
            tj tjVar = wnVar.y0;
            if (itemAnimator != tjVar) {
                wnVar.x0.setItemAnimator(tjVar);
            }
        }
        S();
        try {
            super.m(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.ol0, s4.h0
    public final void o(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item inserted " + i10);
        }
        wn wnVar = this.Q;
        if (((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = wnVar.x0.getItemAnimator();
            tj tjVar = wnVar.y0;
            if (itemAnimator != tjVar) {
                wnVar.x0.setItemAnimator(tjVar);
            }
        } else {
            wnVar.x0.setItemAnimator(null);
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
        wn wnVar = this.Q;
        if (((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = wnVar.x0.getItemAnimator();
            tj tjVar = wnVar.y0;
            if (itemAnimator != tjVar) {
                wnVar.x0.setItemAnimator(tjVar);
            }
        } else {
            wnVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.p(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.ol0, s4.h0
    public final void q(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range changed " + i10 + ":" + i11);
        }
        wn wnVar = this.Q;
        if (((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = wnVar.x0.getItemAnimator();
            tj tjVar = wnVar.y0;
            if (itemAnimator != tjVar) {
                wnVar.x0.setItemAnimator(tjVar);
            }
        } else {
            wnVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.q(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.ol0, s4.h0
    public final void s(int i10, int i11) {
        int i12;
        int i13;
        wn wnVar = this.Q;
        ArrayList arrayList = wnVar.K6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        if (((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = wnVar.x0.getItemAnimator();
            tj tjVar = wnVar.y0;
            if (itemAnimator != tjVar) {
                wnVar.x0.setItemAnimator(tjVar);
            }
        } else {
            wnVar.x0.setItemAnimator(null);
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.J) && i12 < this.K) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.J) - 1);
            if ((wnVar.e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (wnVar.f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
                m(i10);
            }
        }
        try {
            super.s(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.ol0, s4.h0
    public final void t(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range removed" + i10 + ":" + i11);
        }
        wn wnVar = this.Q;
        if (((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = wnVar.x0.getItemAnimator();
            tj tjVar = wnVar.y0;
            if (itemAnimator != tjVar) {
                wnVar.x0.setItemAnimator(tjVar);
            }
        } else {
            wnVar.x0.setItemAnimator(null);
        }
        S();
        try {
            super.t(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.ol0, s4.h0
    public final void u(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item removed " + i10);
        }
        wn wnVar = this.Q;
        if (((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow) {
            s4.m0 itemAnimator = wnVar.x0.getItemAnimator();
            tj tjVar = wnVar.y0;
            if (itemAnimator != tjVar) {
                wnVar.x0.setItemAnimator(tjVar);
            }
        } else {
            wnVar.x0.setItemAnimator(null);
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
        tj tjVar;
        MessageObject.SendAnimationData sendAnimationData;
        jk jkVar;
        int i20;
        int i21;
        boolean z27;
        org.telegram.ui.Components.u60 u60Var;
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
        wn wnVar = this.Q;
        a0.h hVar = wnVar.t8;
        ArrayList arrayList3 = wnVar.G4;
        HashMap hashMap = wnVar.H4;
        boolean z30 = false;
        if (i10 == this.w || i10 == this.x) {
            org.telegram.ui.Cells.g0 g0Var2 = (org.telegram.ui.Cells.g0) view;
            if (UserObject.isReplyUser(wnVar.f)) {
                g0Var = g0Var2;
                g0Var.b(false, 0L, LocaleController.getString(R.string.RepliesChatInfo), null, null, null);
            } else {
                TLRPC.User user = wnVar.f;
                if (user == null || user.id != UserObject.VERIFY) {
                    TL_bots.BotInfo botInfo = hVar.m() != 0 ? (TL_bots.BotInfo) hVar.f(wnVar.f.id) : null;
                    boolean z31 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && UserObject.isBot(wnVar.f) && (userFull = wnVar.q8) != null && userFull.bot_manager_id != 0 && wnVar.f.bot_can_edit;
                    TLRPC.User user2 = wnVar.f;
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
                    g0Var.b(true, j15, str4, tLObject, botInfo, z31 ? DialogObject.getName(((org.telegram.ui.ActionBar.r2) wnVar).currentAccount, wnVar.q8.bot_manager_id) : null);
                } else {
                    g0Var = g0Var2;
                    g0Var.b(false, 0L, LocaleController.getString(R.string.VerifyChatInfo), null, null, null);
                }
            }
            wn.h4(wnVar, g0Var);
            return;
        }
        if (i10 == this.I) {
            ((org.telegram.ui.Cells.a0) view).setDialogId(wnVar.a());
            return;
        }
        if (i10 == this.y) {
            org.telegram.ui.Cells.cb cbVar = (org.telegram.ui.Cells.cb) view;
            TLRPC.EncryptedChat encryptedChat = wnVar.h;
            long a2 = encryptedChat != null ? encryptedChat.user_id : wnVar.a();
            cbVar.b(a2, wnVar.getMessagesController().getPeerSettings(a2));
            return;
        }
        if (i10 == this.F || i10 == this.E) {
            ((org.telegram.ui.Cells.y0) view).setProgressVisible(wnVar.Z6 > 1);
            return;
        }
        if (i10 == this.H) {
            if (wnVar.getMessagesController().getPeerSettings(wnVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.v0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedName, LocaleController.formatRelativeDate(wnVar.getConnectionsManager().getCurrentTime() - r1.name_change_date)));
            return;
        }
        if (i10 == this.G) {
            if (wnVar.getMessagesController().getPeerSettings(wnVar.a()) == null) {
                return;
            }
            ((org.telegram.ui.Cells.v0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedPhoto, LocaleController.formatRelativeDate(wnVar.getConnectionsManager().getCurrentTime() - r1.photo_change_date)));
            return;
        }
        if (i10 == this.s) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            wn.i4(wnVar);
            v0Var.setMessageObject(wnVar.U3);
            int i23 = wnVar.d4;
            if (i23 == 3) {
                v0Var.setCustomText(LocaleController.getString(R.string.SavedMessagesProfileHint));
            } else if (i23 == 5) {
                v0Var.setCustomText(LocaleController.getString(R.string.BusinessRepliesHint));
            } else if (i23 == 9) {
                v0Var.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint2));
            }
            v0Var.setAlpha(1.0f);
            v0Var.setSpoilersSuppressed(wnVar.x0.getScrollState() != 0);
            return;
        }
        if (i10 == this.v) {
            org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) view;
            wn.j4(wnVar);
            v0Var2.setMessageObject(wnVar.V3);
            v0Var2.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint));
            v0Var2.setAlpha(1.0f);
            v0Var2.setSpoilersSuppressed(wnVar.x0.getScrollState() != 0);
            return;
        }
        int i24 = this.J;
        if (i10 < i24 || i10 >= this.K) {
            return;
        }
        ArrayList arrayList4 = this.L ? this.M : this.N ? this.P : wnVar.K6;
        MessageObject messageObject2 = (MessageObject) arrayList4.get(i10 - i24);
        if (!(view instanceof org.telegram.ui.Cells.s1)) {
            ArrayList arrayList5 = arrayList4;
            MessageObject messageObject3 = null;
            if (!(view instanceof org.telegram.ui.Cells.v0)) {
                if (view instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.setText(LocaleController.getString(R.string.UnreadMessages));
                    u1Var.getTextView().setTranslationX(wnVar.e9() / 2.0f);
                    if (wnVar.T7 != 0) {
                        wnVar.T7 = 0;
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
                    v0Var3.e0 = wnVar.E9();
                    v0Var3.i0 = wnVar.O9();
                    wnVar.N9();
                    wnVar.d9();
                    v0Var3.j0 = wnVar.e9();
                    v0Var3.f0 = ChatObject.isForum(wnVar.e);
                    v0Var3.g0 = ChatObject.isMonoForum(wnVar.e);
                    v0Var3.h0 = UserObject.isBotForum(wnVar.f);
                    boolean z32 = v0Var3.k0 == z10;
                    v0Var3.k0 = z10;
                    v0Var3.X(messageObject2, z32);
                    v0Var3.setAlpha(1.0f);
                    v0Var3.setShowTopic(true);
                    v0Var3.setSpoilersSuppressed(wnVar.x0.getScrollState() == 0);
                    return;
                }
            }
            z10 = false;
            org.telegram.ui.Cells.v0 v0Var32 = (org.telegram.ui.Cells.v0) view;
            v0Var32.e0 = wnVar.E9();
            v0Var32.i0 = wnVar.O9();
            wnVar.N9();
            wnVar.d9();
            v0Var32.j0 = wnVar.e9();
            v0Var32.f0 = ChatObject.isForum(wnVar.e);
            v0Var32.g0 = ChatObject.isMonoForum(wnVar.e);
            v0Var32.h0 = UserObject.isBotForum(wnVar.f);
            if (v0Var32.k0 == z10) {
            }
            v0Var32.k0 = z10;
            v0Var32.X(messageObject2, z32);
            v0Var32.setAlpha(1.0f);
            v0Var32.setShowTopic(true);
            v0Var32.setSpoilersSuppressed(wnVar.x0.getScrollState() == 0);
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
        MessageObject.GroupedMessages k92 = wnVar.k9(messageObject2);
        s1Var.N7 = wnVar.e != null || UserObject.isUserSelf(wnVar.f) || UserObject.isReplyUser(wnVar.f) || wnVar.d4 == 7;
        s1Var.y.a(false, false);
        s1Var.O7 = UserObject.isBotForum(wnVar.f);
        s1Var.a8 = wnVar.M9();
        int i27 = wnVar.d4;
        s1Var.P7 = i27 == 3;
        s1Var.Q7 = i27 == 3 && wnVar.fb;
        TLRPC.User user3 = wnVar.f;
        s1Var.R7 = user3 != null && user3.bot;
        s1Var.S7 = ChatObject.isChannel(wnVar.e) && wnVar.e.megagroup;
        s1Var.T7 = ChatObject.isForum(wnVar.e);
        s1Var.U7 = ChatObject.isMonoForum(wnVar.e);
        s1Var.V7 = ChatObject.isForum(wnVar.e) && wnVar.t4 && wnVar.b() == 1;
        s1Var.W7 = (wnVar.p4 != 0 || (s1Var.T7 && wnVar.t4)) && !s1Var.U7;
        int i28 = wnVar.d4;
        if (i28 != 1 && i28 != 9 && ChatObject.isChannel(wnVar.e)) {
            TLRPC.Chat chat = wnVar.e;
            if (chat.has_link && !chat.megagroup) {
                z11 = true;
                s1Var.X7 = z11;
                s1Var.Y7 = wnVar.d4 != 0 && (wnVar.V4.containsKey(Integer.valueOf(messageObject2.getId())) || !(k92 == null || k92.messages.isEmpty() || !wnVar.V4.containsKey(Integer.valueOf(k92.messages.get(0).getId()))));
                i13 = wnVar.d4;
                if (i13 != 1 || i13 == 9 || (chatFull = wnVar.p8) == null) {
                    arrayList = arrayList4;
                    j10 = 0;
                } else {
                    arrayList = arrayList4;
                    j10 = chatFull.linked_chat_id;
                }
                s1Var.b8 = j10;
                if (i13 == 7 || wnVar.a4 != 1) {
                    s1Var.c8 = UserObject.isReplyUser(wnVar.f);
                } else {
                    s1Var.c8 = UserObject.isReplyUser(messageObject2.getDialogId());
                }
                s1Var.d8 = wnVar.d4 != 2;
                s1Var.E8 = wnVar.E9();
                s1Var.F8 = wnVar.O9();
                s1Var.G8 = wnVar.N9();
                s1Var.H8 = wnVar.d9();
                s1Var.I8 = wnVar.e9();
                if (messageObject2.isSponsored()) {
                    AndroidUtilities.doOnPreDraw(s1Var, new ag.c(25));
                }
                int i29 = i10 + 2;
                if (k92 == null) {
                    MessageObject.GroupedMessagePosition position = k92.getPosition(messageObject2);
                    if (position != null) {
                        if (k92.isDocuments) {
                            int indexOf2 = k92.posArray.indexOf(position) + i10 + 1;
                            i14 = 4;
                            int indexOf3 = k92.posArray.indexOf(position) + (i10 - k92.posArray.size());
                            i16 = indexOf2;
                            z13 = false;
                            z14 = false;
                            i15 = indexOf3;
                            z12 = false;
                        } else {
                            i14 = 4;
                            if ((position.flags & 4) != 0) {
                                i22 = k92.reversed ? k92.posArray.indexOf(position) + (i10 - k92.posArray.size()) : k92.posArray.indexOf(position) + i10 + 1;
                                z12 = false;
                                z29 = false;
                            } else {
                                z12 = true;
                                z29 = true;
                                i22 = -100;
                            }
                            if ((position.flags & 8) != 0) {
                                int i30 = i22;
                                i15 = k92.reversed ? k92.posArray.indexOf(position) + i10 + 1 : k92.posArray.indexOf(position) + (i10 - k92.posArray.size());
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
                            boolean z34 = messageObject5.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject5.messageOwner.date - messageObject2.messageOwner.date) <= 300 || wnVar.d4 == 9);
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
                                    } else if (wnVar.e != null) {
                                        long fromChatId = messageObject5.getFromChatId();
                                        z34 = fromChatId == messageObject2.getFromChatId();
                                        if (!z15) {
                                            if (z34) {
                                                if (fromChatId < 0) {
                                                    if (wnVar.e.megagroup) {
                                                    }
                                                }
                                            }
                                        }
                                        if (DialogObject.getPeerDialogId(messageObject5.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    } else {
                                        if (UserObject.isUserSelf(wnVar.f) || UserObject.isReplyUser(wnVar.f)) {
                                            if (!messageObject2.isPrivateForward()) {
                                                if (!messageObject5.isPrivateForward()) {
                                                }
                                            }
                                        } else if (wnVar.d4 == 7) {
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
                                    boolean z35 = !(messageObject6.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject6.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject6.messageOwner.date - messageObject2.messageOwner.date) <= 300 || wnVar.d4 == 9);
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
                                    } else if (wnVar.e != null) {
                                        long fromChatId2 = messageObject6.getFromChatId();
                                        boolean z36 = (fromChatId2 != messageObject2.getFromChatId() || messageObject2.isImportedForward() || messageObject6.isImportedForward()) ? false : true;
                                        if (!z17 && z36 && fromChatId2 < 0 && wnVar.e.megagroup && wnVar.d4 != 9) {
                                            z36 = false;
                                        }
                                        if (z36 && wnVar.G9()) {
                                            TLRPC.TL_forumTopic tL_forumTopic = messageObject2.replyToForumTopic;
                                            if (tL_forumTopic == null) {
                                                z28 = true;
                                                j12 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.r2) wnVar).currentAccount, messageObject2.messageOwner, true);
                                            } else {
                                                z28 = true;
                                                j12 = tL_forumTopic.id;
                                            }
                                            TLRPC.TL_forumTopic tL_forumTopic2 = messageObject6.replyToForumTopic;
                                            if (tL_forumTopic2 == null) {
                                                z21 = z19;
                                                j13 = j12;
                                                j14 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.r2) wnVar).currentAccount, messageObject6.messageOwner, z28);
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
                                        if (UserObject.isUserSelf(wnVar.f) || UserObject.isReplyUser(wnVar.f)) {
                                            if (!messageObject2.isPrivateForward()) {
                                                if (!messageObject6.isPrivateForward()) {
                                                }
                                            }
                                            z22 = false;
                                        } else if (wnVar.d4 != 7) {
                                            z22 = z35;
                                        }
                                        if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                                        }
                                    }
                                } else {
                                    z21 = z19;
                                    z22 = z33;
                                }
                                if (ChatObject.isChannel(wnVar.e) && wnVar.e.megagroup && messageObject2.getFromChatId() <= 0 && (messageFwdHeader = messageObject2.messageOwner.fwd_from) != null && (messageFwdHeader.saved_from_peer instanceof TLRPC.TL_peerChannel)) {
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
                                if (k92 != null) {
                                    int i33 = 0;
                                    while (i33 < k92.messages.size()) {
                                        k92.messages.get(i33).updateTranslation(z37);
                                        i33++;
                                        z37 = false;
                                    }
                                }
                                if (!wnVar.gb) {
                                    z23 = z22;
                                    z24 = z14;
                                } else {
                                    if (k92 != null) {
                                        z25 = true;
                                        z24 = false;
                                        z23 = false;
                                        s1Var.setShowTopic(z25);
                                        s1Var.Z3(messageObject2, k92, z24, z23, z18, z20);
                                        s1Var.setSpoilersSuppressed(wnVar.x0.getScrollState() == 0);
                                        s1Var.setHighlighted(wnVar.b8 == Integer.MAX_VALUE && messageObject2.getId() == wnVar.b8);
                                        z26 = s1Var.f8;
                                        if (!z26 && wnVar.f8 != null) {
                                            long currentTimeMillis = System.currentTimeMillis();
                                            s1Var.V3(wnVar.f8, true, wnVar.d8 || currentTimeMillis - wnVar.e8 < 200, wnVar.i8);
                                            if (wnVar.d8) {
                                                wnVar.e8 = currentTimeMillis;
                                            }
                                            wnVar.d8 = false;
                                        } else if (!z26 && (num = wnVar.g8) != null) {
                                            s1Var.T3(num.intValue());
                                        } else if (!z26 && (bArr = wnVar.h8) != null) {
                                            s1Var.R3(bArr);
                                        } else if (wnVar.d4 == 7 && wnVar.G3 != null && (str = wnVar.F3) != null) {
                                            s1Var.U3(str);
                                        }
                                        if (wnVar.b8 != Integer.MAX_VALUE) {
                                            wnVar.pc();
                                        }
                                        indexOf = arrayList3.indexOf(messageObject2);
                                        if (indexOf != -1) {
                                            if (messageObject2.type == 5 && (u60Var = wnVar.n3) != null && u60Var.getTextureView() != null) {
                                                ig igVar = wnVar.G7;
                                                if (igVar != null) {
                                                    AndroidUtilities.cancelRunOnUIThread(igVar);
                                                    wnVar.G7 = null;
                                                }
                                                s1Var.getViewTreeObserver().addOnPreDrawListener(new bm(0, this, s1Var));
                                            } else if ((messageObject2.isAnyKindOfSticker() && !messageObject2.isAnimatedEmojiStickers()) || ((sendAnimationData = messageObject2.sendAnimationData) != null && sendAnimationData.fromPreview)) {
                                                if (!messageObject2.sendAnimationData.fromPreview || (jkVar = wnVar.Y) == null || jkVar.L0 == null) {
                                                    s1Var.getViewTreeObserver().addOnPreDrawListener(new gm(this, s1Var));
                                                } else {
                                                    if (((org.telegram.ui.ActionBar.r2) wnVar).actionBar.getVisibility() == 0) {
                                                        int measuredHeight = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.r2) wnVar).actionBar.getTranslationY());
                                                        uk ukVar = wnVar.A1;
                                                        int currentHeight = measuredHeight + (ukVar != null ? ukVar.getCurrentHeight() : 0);
                                                        gk gkVar = wnVar.B1;
                                                        i20 = (((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode ? AndroidUtilities.statusBarHeight : 0) + currentHeight + (gkVar != null ? gkVar.getCurrentHeight() : 0);
                                                    } else {
                                                        i20 = 0;
                                                    }
                                                    float f7 = i20 + wnVar.J9;
                                                    float height = wnVar.fragmentView == null ? 0.0f : r9.getHeight();
                                                    org.telegram.ui.Components.mf mfVar = wnVar.Y.L0;
                                                    Rect rect = mfVar.t0;
                                                    if (!mfVar.p0) {
                                                        mfVar.r = true;
                                                        mfVar.p0 = true;
                                                        ci0 ci0Var = mfVar.W;
                                                        if (ci0Var != null) {
                                                            ci0Var.invalidate();
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
                                                        mfVar.d(new uh0(mfVar, i21), false);
                                                        mfVar.E.invalidate();
                                                        NotificationCenter.getInstance(mfVar.c).removeObserver(mfVar, NotificationCenter.availableEffectsUpdate);
                                                    }
                                                    wnVar.Y.L0 = null;
                                                }
                                            }
                                            arrayList3.remove(indexOf);
                                            jk jkVar2 = wnVar.Y;
                                            Runnable runnable = jkVar2.f0;
                                            if (runnable != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable);
                                                z27 = true;
                                                jkVar2.g0 = true;
                                                jkVar2.f0.run();
                                                jkVar2.f0 = null;
                                            } else {
                                                z27 = true;
                                            }
                                            wnVar.Y.m0(z27);
                                        }
                                        if (!hashMap.isEmpty() && hashMap.containsKey(messageObject2.getDocument())) {
                                            hashMap.remove(messageObject2.getDocument());
                                            tjVar = wnVar.y0;
                                            if (tjVar != null) {
                                                org.telegram.ui.Components.vo voVar = wnVar.e1;
                                                tjVar.O = e1Var;
                                                tjVar.P = voVar;
                                                r10 = 0;
                                                tjVar.N = false;
                                                if (s1Var.fd) {
                                                    s1Var.fd = r10;
                                                    s1Var.setVisibility(r10);
                                                }
                                                wnVar.Jb(s1Var);
                                            }
                                        }
                                        r10 = 0;
                                        if (s1Var.fd) {
                                        }
                                        wnVar.Jb(s1Var);
                                    }
                                    z24 = z22;
                                    z23 = z14;
                                }
                                z25 = true;
                                s1Var.setShowTopic(z25);
                                s1Var.Z3(messageObject2, k92, z24, z23, z18, z20);
                                s1Var.setSpoilersSuppressed(wnVar.x0.getScrollState() == 0);
                                s1Var.setHighlighted(wnVar.b8 == Integer.MAX_VALUE && messageObject2.getId() == wnVar.b8);
                                z26 = s1Var.f8;
                                if (!z26) {
                                }
                                if (!z26) {
                                }
                                if (!z26) {
                                }
                                if (wnVar.d4 == 7) {
                                    s1Var.U3(str);
                                }
                                if (wnVar.b8 != Integer.MAX_VALUE) {
                                }
                                indexOf = arrayList3.indexOf(messageObject2);
                                if (indexOf != -1) {
                                }
                                if (!hashMap.isEmpty()) {
                                    hashMap.remove(messageObject2.getDocument());
                                    tjVar = wnVar.y0;
                                    if (tjVar != null) {
                                    }
                                }
                                r10 = 0;
                                if (s1Var.fd) {
                                }
                                wnVar.Jb(s1Var);
                            }
                        }
                        z17 = z16;
                        z18 = true;
                        i19 = this.J;
                        if (i10 == i19) {
                        }
                        if (j11 == e1Var.f) {
                        }
                        if (ChatObject.isChannel(wnVar.e)) {
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
                        if (k92 != null) {
                        }
                        if (!wnVar.gb) {
                        }
                        z25 = true;
                        s1Var.setShowTopic(z25);
                        s1Var.Z3(messageObject2, k92, z24, z23, z18, z20);
                        s1Var.setSpoilersSuppressed(wnVar.x0.getScrollState() == 0);
                        s1Var.setHighlighted(wnVar.b8 == Integer.MAX_VALUE && messageObject2.getId() == wnVar.b8);
                        z26 = s1Var.f8;
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (wnVar.d4 == 7) {
                        }
                        if (wnVar.b8 != Integer.MAX_VALUE) {
                        }
                        indexOf = arrayList3.indexOf(messageObject2);
                        if (indexOf != -1) {
                        }
                        if (!hashMap.isEmpty()) {
                        }
                        r10 = 0;
                        if (s1Var.fd) {
                        }
                        wnVar.Jb(s1Var);
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
                        if (ChatObject.isChannel(wnVar.e)) {
                        }
                        if (!z17) {
                        }
                        boolean z3722 = false;
                        messageObject2.updateTranslation(false);
                        if (k92 != null) {
                        }
                        if (!wnVar.gb) {
                        }
                        z25 = true;
                        s1Var.setShowTopic(z25);
                        s1Var.Z3(messageObject2, k92, z24, z23, z18, z20);
                        s1Var.setSpoilersSuppressed(wnVar.x0.getScrollState() == 0);
                        s1Var.setHighlighted(wnVar.b8 == Integer.MAX_VALUE && messageObject2.getId() == wnVar.b8);
                        z26 = s1Var.f8;
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (!z26) {
                        }
                        if (wnVar.d4 == 7) {
                        }
                        if (wnVar.b8 != Integer.MAX_VALUE) {
                        }
                        indexOf = arrayList3.indexOf(messageObject2);
                        if (indexOf != -1) {
                        }
                        if (!hashMap.isEmpty()) {
                        }
                        r10 = 0;
                        if (s1Var.fd) {
                        }
                        wnVar.Jb(s1Var);
                    }
                }
                z17 = z16;
                z18 = true;
                i19 = this.J;
                if (i10 == i19) {
                }
                if (j11 == e1Var.f) {
                }
                if (ChatObject.isChannel(wnVar.e)) {
                }
                if (!z17) {
                }
                boolean z37222 = false;
                messageObject2.updateTranslation(false);
                if (k92 != null) {
                }
                if (!wnVar.gb) {
                }
                z25 = true;
                s1Var.setShowTopic(z25);
                s1Var.Z3(messageObject2, k92, z24, z23, z18, z20);
                s1Var.setSpoilersSuppressed(wnVar.x0.getScrollState() == 0);
                s1Var.setHighlighted(wnVar.b8 == Integer.MAX_VALUE && messageObject2.getId() == wnVar.b8);
                z26 = s1Var.f8;
                if (!z26) {
                }
                if (!z26) {
                }
                if (!z26) {
                }
                if (wnVar.d4 == 7) {
                }
                if (wnVar.b8 != Integer.MAX_VALUE) {
                }
                indexOf = arrayList3.indexOf(messageObject2);
                if (indexOf != -1) {
                }
                if (!hashMap.isEmpty()) {
                }
                r10 = 0;
                if (s1Var.fd) {
                }
                wnVar.Jb(s1Var);
            }
        }
        z11 = false;
        s1Var.X7 = z11;
        s1Var.Y7 = wnVar.d4 != 0 && (wnVar.V4.containsKey(Integer.valueOf(messageObject2.getId())) || !(k92 == null || k92.messages.isEmpty() || !wnVar.V4.containsKey(Integer.valueOf(k92.messages.get(0).getId()))));
        i13 = wnVar.d4;
        if (i13 != 1) {
        }
        arrayList = arrayList4;
        j10 = 0;
        s1Var.b8 = j10;
        if (i13 == 7) {
        }
        s1Var.c8 = UserObject.isReplyUser(wnVar.f);
        s1Var.d8 = wnVar.d4 != 2;
        s1Var.E8 = wnVar.E9();
        s1Var.F8 = wnVar.O9();
        s1Var.G8 = wnVar.N9();
        s1Var.H8 = wnVar.d9();
        s1Var.I8 = wnVar.e9();
        if (messageObject2.isSponsored()) {
        }
        int i292 = i10 + 2;
        if (k92 == null) {
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
        if (ChatObject.isChannel(wnVar.e)) {
        }
        if (!z17) {
        }
        boolean z372222 = false;
        messageObject2.updateTranslation(false);
        if (k92 != null) {
        }
        if (!wnVar.gb) {
        }
        z25 = true;
        s1Var.setShowTopic(z25);
        s1Var.Z3(messageObject2, k92, z24, z23, z18, z20);
        s1Var.setSpoilersSuppressed(wnVar.x0.getScrollState() == 0);
        s1Var.setHighlighted(wnVar.b8 == Integer.MAX_VALUE && messageObject2.getId() == wnVar.b8);
        z26 = s1Var.f8;
        if (!z26) {
        }
        if (!z26) {
        }
        if (!z26) {
        }
        if (wnVar.d4 == 7) {
        }
        if (wnVar.b8 != Integer.MAX_VALUE) {
        }
        indexOf = arrayList3.indexOf(messageObject2);
        if (indexOf != -1) {
        }
        if (!hashMap.isEmpty()) {
        }
        r10 = 0;
        if (s1Var.fd) {
        }
        wnVar.Jb(s1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.ui.am] */
    /* JADX WARN: Type inference failed for: r8v11, types: [org.telegram.ui.Cells.v0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [org.telegram.ui.Cells.cb] */
    /* JADX WARN: Type inference failed for: r8v13, types: [org.telegram.ui.Cells.y0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [org.telegram.ui.Cells.g0, org.telegram.ui.zl] */
    /* JADX WARN: Type inference failed for: r8v16, types: [org.telegram.ui.Cells.u1] */
    /* JADX WARN: Type inference failed for: r8v9, types: [org.telegram.ui.Cells.t1] */
    /* JADX WARN: Type inference failed for: r9v16, types: [org.telegram.ui.Cells.v0] */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s1 s1Var;
        org.telegram.ui.Cells.s1 s1Var2;
        wn wnVar = this.Q;
        if (i10 == 0) {
            s1Var = new org.telegram.ui.Cells.s1(this.h, ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount, true, wnVar.Sa, wnVar.ua);
            s1Var.setResourcesProvider(wnVar.ua);
            if (wnVar.Pc == null) {
                wnVar.Pc = new hn(wnVar);
            }
            s1Var.setDelegate(wnVar.Pc);
            s1Var.Pd = wnVar.pc;
            if (wnVar.h == null) {
                s1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? wlVar = new wl(context, wnVar.ua, true);
                wlVar.setInvalidateColors(true);
                wlVar.setDelegate(new yl(this));
                s1Var = wlVar;
            } else {
                if (i10 == 2) {
                    ?? u1Var = new org.telegram.ui.Cells.u1(context, wnVar.ua);
                    org.telegram.ui.ActionBar.f7.V(u1Var.getTextView(), org.telegram.ui.ActionBar.y6.Ee, wnVar.ua);
                    Drawable background = u1Var.getBackgroundLayout().getBackground();
                    s1Var2 = u1Var;
                    if (background != null) {
                        org.telegram.ui.ActionBar.f7.y(u1Var.getBackgroundLayout(), u1Var.getBackgroundLayout().getBackground(), org.telegram.ui.ActionBar.y6.Fe, wnVar.ua, PorterDuff.Mode.MULTIPLY);
                        s1Var2 = u1Var;
                    }
                } else if (i10 == 3) {
                    ?? zlVar = new zl(this, context, ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount, wnVar.ua);
                    zlVar.setDelegate(new y0(this, 22));
                    s1Var2 = zlVar;
                } else if (i10 == 4) {
                    s1Var2 = new org.telegram.ui.Cells.y0(context, wnVar.ua);
                } else if (i10 == 6) {
                    s1Var2 = new org.telegram.ui.Cells.cb(context, ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount, wnVar.ua);
                } else if (i10 == 7) {
                    s1Var2 = new org.telegram.ui.Cells.v0(context, wnVar.ua, false);
                } else if (i10 == 8) {
                    s1Var2 = new am(this, context, ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount, wnVar.ua);
                } else if (i10 == 10) {
                    ?? t1Var = new org.telegram.ui.Cells.t1(context, wnVar.ua);
                    if (wnVar.Pc == null) {
                        wnVar.Pc = new hn(wnVar);
                    }
                    t1Var.setDelegate(wnVar.Pc);
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
        wn wnVar = this.Q;
        if (z12 || (view instanceof org.telegram.ui.Cells.v0)) {
            wnVar.C9();
        }
        boolean z13 = view instanceof org.telegram.ui.Cells.s1;
        if (z13) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject messageObject = s1Var.getMessageObject();
            s1Var.E8 = wnVar.E9();
            s1Var.F8 = wnVar.O9();
            s1Var.G8 = wnVar.N9();
            s1Var.H8 = wnVar.d9();
            s1Var.I8 = wnVar.e9();
            s1Var.i4(-1, true, false);
            MessageObject messageObject2 = wnVar.S3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                s1Var.i4(wnVar.T3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = wnVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                wnVar.getMediaController().playEmojiSound(wnVar.getAccountInstance(), stickerEmoji, emojiSound, true);
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
            if (((org.telegram.ui.ActionBar.r2) wnVar).actionBar.q() || wnVar.M9()) {
                wnVar.d8 = false;
                wnVar.e8 = 0L;
                wnVar.f8 = null;
                ArrayList arrayList = wnVar.m4;
                s1Var.L3(arrayList == null || !arrayList.contains(messageObject), false);
                int i11 = messageObject.getDialogId() == wnVar.j6 ? 0 : 1;
                if (wnVar.m6[i11].indexOfKey(messageObject.getId()) >= 0) {
                    wnVar.wb(messageObject, s1Var, i11, false);
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
            if (wnVar.d4 != 7 || wnVar.G3 == null || (str = wnVar.F3) == null) {
                mk mkVar = wnVar.d3;
                if (mkVar != null && mkVar.getVisibility() == 0) {
                    if (wnVar.getMediaDataController().isMessageFound(messageObject.getId(), messageObject.getDialogId() == wnVar.b7) && wnVar.getMediaDataController().getLastSearchQuery() != null) {
                        s1Var.U3(wnVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                s1Var.U3(null);
            } else {
                s1Var.U3(str);
            }
            if (!((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode || !s1Var.f8) {
                s1Var.setHighlighted(wnVar.b8 != Integer.MAX_VALUE && ((s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == wnVar.b8) || (s1Var.getCurrentMessagesGroup() != null && s1Var.getCurrentMessagesGroup().contains(wnVar.b8))));
                boolean z14 = s1Var.f8;
                if (z14 && wnVar.f8 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!s1Var.V3(wnVar.f8, true, wnVar.d8 || currentTimeMillis - wnVar.e8 < 200, wnVar.i8) && wnVar.c8) {
                        org.telegram.ui.Components.wc.b0(wnVar).R(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    wnVar.c8 = false;
                    if (wnVar.d8) {
                        wnVar.e8 = currentTimeMillis;
                    }
                    wnVar.d8 = false;
                } else if (z14 && (num = wnVar.g8) != null) {
                    s1Var.T3(num.intValue());
                } else if (z14 && (bArr = wnVar.h8) != null) {
                    s1Var.R3(bArr);
                }
                if (wnVar.b8 != Integer.MAX_VALUE) {
                    wnVar.pc();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            v0Var.e0 = wnVar.E9();
            v0Var.i0 = wnVar.O9();
            wnVar.N9();
            wnVar.d9();
            v0Var.j0 = wnVar.e9();
        } else if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(wnVar.e9() / 2.0f);
        }
        int b10 = e1Var.b();
        int i12 = this.J;
        if (b10 < i12 || b10 >= this.K) {
            return;
        }
        MessageObject messageObject3 = (MessageObject) (this.L ? this.M : this.N ? this.P : wnVar.K6).get(b10 - i12);
        if (messageObject3 == null || (message = messageObject3.messageOwner) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        if (!((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode && wnVar.d4 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
            int i13 = wnVar.B6 - 1;
            wnVar.B6 = i13;
            if (i13 <= 0) {
                wnVar.B6 = 0;
                wnVar.C6 = true;
                wnVar.ac(false);
            } else {
                wnVar.v1.c(2, i13, true);
            }
            wnVar.getMessagesController().markMentionMessageAsRead(messageObject3.getId(), ChatObject.isChannel(wnVar.e) ? wnVar.e.id : 0L, wnVar.j6);
            messageObject3.setContentIsRead();
        }
        if (z13) {
            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
            if (((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode) {
                s1Var2.setHighlighted(true);
            } else {
                s1Var2.Q3();
            }
        }
    }
}
