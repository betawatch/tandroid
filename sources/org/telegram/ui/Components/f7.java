package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ f7(e8 e8Var, boolean z10, org.telegram.messenger.fj fjVar, boolean z11, Runnable runnable, long j3, TLRPC.Document document) {
        this.e = e8Var;
        this.b = z10;
        this.f = fjVar;
        this.c = z11;
        this.g = runnable;
        this.d = j3;
        this.h = document;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final e8 e8Var = (e8) this.e;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f;
                final Runnable runnable = (Runnable) this.g;
                TLRPC.Document document = (TLRPC.Document) this.h;
                final boolean z10 = this.c;
                if (tL_error != null && org.telegram.messenger.q8.r(tL_error.text)) {
                    if (!this.b && fjVar.e1() >= 0) {
                        if (org.telegram.messenger.fj.B0(fjVar.k) < 0) {
                            final int e12 = fjVar.e1();
                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                            tL_channels_getMessages.channel = org.telegram.messenger.mp.u1(e8Var.a).j1(-org.telegram.messenger.fj.B0(fjVar.k));
                            tL_channels_getMessages.id.add(Integer.valueOf(e12));
                            final int i7 = 1;
                            ConnectionsManager.getInstance(e8Var.a).sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: org.telegram.ui.Components.h7
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    TLRPC.Message message;
                                    TLRPC.Message message2;
                                    switch (i7) {
                                        case 0:
                                            boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final e8 e8Var2 = e8Var;
                                            if (!z11) {
                                                if (tL_error2 != null) {
                                                    org.telegram.messenger.g0.g3(new g7(e8Var2, tL_error2, 3));
                                                    break;
                                                }
                                            } else {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                int i10 = 0;
                                                while (true) {
                                                    if (i10 >= messages_messages.messages.size()) {
                                                        message = null;
                                                    } else if (messages_messages.messages.get(i10).id == e12) {
                                                        message = messages_messages.messages.get(i10);
                                                    } else {
                                                        i10++;
                                                    }
                                                }
                                                if (message == null) {
                                                    final int i11 = 1;
                                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.j7
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i12 = i11;
                                                            e8 e8Var3 = e8Var2;
                                                            switch (i12) {
                                                                case 0:
                                                                    new kc((FrameLayout) e8Var3.b, e8Var3.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743631, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new kc((FrameLayout) e8Var3.b, e8Var3.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743631, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    e8Var2.S0(new org.telegram.messenger.fj(e8Var2.a, message, false, true), z10, runnable, true);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final e8 e8Var3 = e8Var;
                                            if (!z12) {
                                                if (tL_error2 != null) {
                                                    org.telegram.messenger.g0.g3(new g7(e8Var3, tL_error2, 2));
                                                    break;
                                                }
                                            } else {
                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                int i12 = 0;
                                                while (true) {
                                                    if (i12 >= messages_messages2.messages.size()) {
                                                        message2 = null;
                                                    } else if (messages_messages2.messages.get(i12).id == e12) {
                                                        message2 = messages_messages2.messages.get(i12);
                                                    } else {
                                                        i12++;
                                                    }
                                                }
                                                if (message2 == null) {
                                                    final int i13 = 0;
                                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.j7
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i122 = i13;
                                                            e8 e8Var32 = e8Var3;
                                                            switch (i122) {
                                                                case 0:
                                                                    new kc((FrameLayout) e8Var32.b, e8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743631, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new kc((FrameLayout) e8Var32.b, e8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743631, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    e8Var3.S0(new org.telegram.messenger.fj(e8Var3.a, message2, false, true), z10, runnable, true);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            final int e13 = fjVar.e1();
                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages.id.add(Integer.valueOf(e13));
                            final int i10 = 0;
                            ConnectionsManager.getInstance(e8Var.a).sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: org.telegram.ui.Components.h7
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    TLRPC.Message message;
                                    TLRPC.Message message2;
                                    switch (i10) {
                                        case 0:
                                            boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final e8 e8Var2 = e8Var;
                                            if (!z11) {
                                                if (tL_error2 != null) {
                                                    org.telegram.messenger.g0.g3(new g7(e8Var2, tL_error2, 3));
                                                    break;
                                                }
                                            } else {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                int i102 = 0;
                                                while (true) {
                                                    if (i102 >= messages_messages.messages.size()) {
                                                        message = null;
                                                    } else if (messages_messages.messages.get(i102).id == e13) {
                                                        message = messages_messages.messages.get(i102);
                                                    } else {
                                                        i102++;
                                                    }
                                                }
                                                if (message == null) {
                                                    final int i11 = 1;
                                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.j7
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i122 = i11;
                                                            e8 e8Var32 = e8Var2;
                                                            switch (i122) {
                                                                case 0:
                                                                    new kc((FrameLayout) e8Var32.b, e8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743631, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new kc((FrameLayout) e8Var32.b, e8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743631, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    e8Var2.S0(new org.telegram.messenger.fj(e8Var2.a, message, false, true), z10, runnable, true);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final e8 e8Var3 = e8Var;
                                            if (!z12) {
                                                if (tL_error2 != null) {
                                                    org.telegram.messenger.g0.g3(new g7(e8Var3, tL_error2, 2));
                                                    break;
                                                }
                                            } else {
                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                int i12 = 0;
                                                while (true) {
                                                    if (i12 >= messages_messages2.messages.size()) {
                                                        message2 = null;
                                                    } else if (messages_messages2.messages.get(i12).id == e13) {
                                                        message2 = messages_messages2.messages.get(i12);
                                                    } else {
                                                        i12++;
                                                    }
                                                }
                                                if (message2 == null) {
                                                    final int i13 = 0;
                                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.j7
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i122 = i13;
                                                            e8 e8Var32 = e8Var3;
                                                            switch (i122) {
                                                                case 0:
                                                                    new kc((FrameLayout) e8Var32.b, e8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743631, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new kc((FrameLayout) e8Var32.b, e8Var32.J0).t(org.telegram.messenger.gd.a0(null, null, 2131743631, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    e8Var3.S0(new org.telegram.messenger.fj(e8Var3.a, message2, false, true), z10, runnable, true);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    } else {
                        org.telegram.messenger.g0.g3(new g7(e8Var, tL_error, 0));
                        break;
                    }
                } else {
                    if (tL_error != null) {
                        org.telegram.messenger.g0.g3(new g7(e8Var, tL_error, 1));
                    }
                    org.telegram.messenger.g0.g3(new r2(e8Var, this.d, z10, document, runnable));
                    break;
                }
                break;
            default:
                final nf0 nf0Var = (nf0) this.e;
                final org.telegram.messenger.mp mpVar = (org.telegram.messenger.mp) this.f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z11 = this.b;
                final boolean z12 = this.c;
                final long j3 = this.d;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.mf0
                    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
                    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7 A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
                    /* JADX WARN: Removed duplicated region for block: B:49:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        int i11;
                        nf0 nf0Var2 = nf0.this;
                        int i12 = nf0Var2.b;
                        g51 g51Var = nf0Var2.c;
                        nf0Var2.L = -1;
                        boolean z13 = false;
                        nf0Var2.w = false;
                        nf0Var2.I.setLoading(false);
                        TLObject tLObject2 = tLObject;
                        boolean z14 = tLObject2 instanceof TLRPC.messages_Messages;
                        long j10 = j3;
                        if (!z14) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            if (tL_error2 == null || !tL_error2.text.startsWith("FLOOD_WAIT_") || !tL_error2.text.contains("_OR_STARS_")) {
                                if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                                    nf0Var2.d();
                                    g51Var.g3.O(true);
                                    return;
                                } else {
                                    if (tL_error2 == null || !"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                                        return;
                                    }
                                    nf0Var2.d();
                                    g51Var.g3.O(true);
                                    di.y8.y(i12, false).q(new bi.e4(nf0Var2, j10, 25), true, true);
                                    return;
                                }
                            }
                            Matcher matcher = Pattern.compile("FLOOD_WAIT_(\\d+)_OR_STARS_(\\d+)").matcher(tL_error2.text);
                            if (matcher == null || !matcher.matches()) {
                                return;
                            }
                            int parseInt = Integer.parseInt(matcher.group(1));
                            int parseInt2 = Integer.parseInt(matcher.group(2));
                            TLRPC.SearchPostsFlood searchPostsFlood = nf0Var2.d;
                            if (searchPostsFlood != null) {
                                searchPostsFlood.flags = 2 | searchPostsFlood.flags;
                                searchPostsFlood.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                nf0Var2.d.stars_amount = parseInt2;
                            }
                            nf0Var2.d();
                            g51Var.g3.O(true);
                            return;
                        }
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        ArrayList<TLRPC.User> arrayList = messages_messages.users;
                        org.telegram.messenger.mp mpVar2 = mpVar;
                        mpVar2.f4(arrayList, false);
                        mpVar2.Z3(messages_messages.chats, false);
                        TLRPC.SearchPostsFlood searchPostsFlood2 = messages_messages.search_flood;
                        if (searchPostsFlood2 != null) {
                            nf0Var2.d = searchPostsFlood2;
                        }
                        boolean z15 = z11;
                        ArrayList arrayList2 = z15 ? nf0Var2.e : nf0Var2.n;
                        boolean isEmpty = arrayList2.isEmpty();
                        ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            TLRPC.Message message = arrayList3.get(i13);
                            i13++;
                            org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(i12, message, z13, z13);
                            if (!z15) {
                                fjVar2.K5(tL_channels_searchPosts.query, true);
                            }
                            arrayList2.add(fjVar2);
                            z13 = false;
                        }
                        if (!z15) {
                            if (!(messages_messages instanceof TLRPC.TL_messages_messagesSlice)) {
                                if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    i11 = 0;
                                    nf0Var2.r = 0;
                                    nf0Var2.s = true;
                                } else {
                                    i11 = 0;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        nf0Var2.r = 0;
                                        nf0Var2.s = true;
                                    }
                                }
                                nf0Var2.d();
                                if (isEmpty) {
                                    g51Var.v0(i11);
                                }
                                g51Var.g3.O(true);
                                if (!arrayList2.isEmpty() && (!z15 ? !nf0Var2.s : !nf0Var2.h)) {
                                    org.telegram.messenger.g0.g3(new di.p6(nf0Var2, z15, arrayList2, 24));
                                }
                                if (z12 || j10 <= 0 || z15) {
                                    return;
                                }
                                org.telegram.messenger.m10.u(org.telegram.messenger.gd.H(',', "SearchPaidStars", (int) j10), kc.b0(nf0Var2.a), R.raw.stars_topup, 36);
                                return;
                            }
                            nf0Var2.r = messages_messages.next_rate;
                            nf0Var2.s = (messages_messages.flags & 1) == 0;
                            i11 = 0;
                            nf0Var2.d();
                            if (isEmpty) {
                            }
                            g51Var.g3.O(true);
                            if (!arrayList2.isEmpty()) {
                                org.telegram.messenger.g0.g3(new di.p6(nf0Var2, z15, arrayList2, 24));
                            }
                            if (z12) {
                                return;
                            } else {
                                return;
                            }
                        }
                        if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                            nf0Var2.f = messages_messages.next_rate;
                            nf0Var2.h = (messages_messages.flags & 1) == 0;
                            i11 = 0;
                            nf0Var2.d();
                            if (isEmpty) {
                            }
                            g51Var.g3.O(true);
                            if (!arrayList2.isEmpty()) {
                            }
                            if (z12) {
                            }
                        } else {
                            if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                i11 = 0;
                                nf0Var2.f = 0;
                                nf0Var2.h = true;
                            } else {
                                i11 = 0;
                                if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    nf0Var2.f = 0;
                                    nf0Var2.h = true;
                                }
                            }
                            nf0Var2.d();
                            if (isEmpty) {
                            }
                            g51Var.g3.O(true);
                            if (!arrayList2.isEmpty()) {
                            }
                            if (z12) {
                            }
                        }
                    }
                });
                break;
        }
    }

    public /* synthetic */ f7(nf0 nf0Var, org.telegram.messenger.mp mpVar, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j3, ConnectionsManager connectionsManager) {
        this.e = nf0Var;
        this.f = mpVar;
        this.b = z10;
        this.g = tL_channels_searchPosts;
        this.c = z11;
        this.d = j3;
        this.h = connectionsManager;
    }
}
