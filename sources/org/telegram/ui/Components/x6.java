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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x6 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ x6(w7 w7Var, boolean z10, org.telegram.messenger.jj jjVar, boolean z11, Runnable runnable, long j10, TLRPC.Document document) {
        this.e = w7Var;
        this.b = z10;
        this.f = jjVar;
        this.c = z11;
        this.g = runnable;
        this.d = j10;
        this.h = document;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final w7 w7Var = (w7) this.e;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.f;
                final Runnable runnable = (Runnable) this.g;
                TLRPC.Document document = (TLRPC.Document) this.h;
                final boolean z10 = this.c;
                if (tL_error != null && org.telegram.messenger.w8.r(tL_error.text)) {
                    if (!this.b && jjVar.f1() >= 0) {
                        if (org.telegram.messenger.jj.B0(jjVar.k) < 0) {
                            final int f12 = jjVar.f1();
                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                            tL_channels_getMessages.channel = org.telegram.messenger.vp.r1(w7Var.a).g1(-org.telegram.messenger.jj.B0(jjVar.k));
                            tL_channels_getMessages.id.add(Integer.valueOf(f12));
                            final int i10 = 1;
                            ConnectionsManager.getInstance(w7Var.a).sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: org.telegram.ui.Components.z6
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    TLRPC.Message message;
                                    TLRPC.Message message2;
                                    switch (i10) {
                                        case 0:
                                            boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final w7 w7Var2 = w7Var;
                                            if (!z11) {
                                                if (tL_error2 != null) {
                                                    org.telegram.messenger.i0.g3(new y6(w7Var2, tL_error2, 3));
                                                    break;
                                                }
                                            } else {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                int i11 = 0;
                                                while (true) {
                                                    if (i11 >= messages_messages.messages.size()) {
                                                        message = null;
                                                    } else if (messages_messages.messages.get(i11).id == f12) {
                                                        message = messages_messages.messages.get(i11);
                                                    } else {
                                                        i11++;
                                                    }
                                                }
                                                if (message == null) {
                                                    final int i12 = 1;
                                                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Components.b7
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i13 = i12;
                                                            w7 w7Var3 = w7Var2;
                                                            switch (i13) {
                                                                case 0:
                                                                    new cc((FrameLayout) w7Var3.b, w7Var3.I0).t(org.telegram.messenger.cd.a0(null, null, 2131743903, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new cc((FrameLayout) w7Var3.b, w7Var3.I0).t(org.telegram.messenger.cd.a0(null, null, 2131743903, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    w7Var2.R0(new org.telegram.messenger.jj(w7Var2.a, message, false, true), z10, runnable, true);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final w7 w7Var3 = w7Var;
                                            if (!z12) {
                                                if (tL_error2 != null) {
                                                    org.telegram.messenger.i0.g3(new y6(w7Var3, tL_error2, 2));
                                                    break;
                                                }
                                            } else {
                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                int i13 = 0;
                                                while (true) {
                                                    if (i13 >= messages_messages2.messages.size()) {
                                                        message2 = null;
                                                    } else if (messages_messages2.messages.get(i13).id == f12) {
                                                        message2 = messages_messages2.messages.get(i13);
                                                    } else {
                                                        i13++;
                                                    }
                                                }
                                                if (message2 == null) {
                                                    final int i14 = 0;
                                                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Components.b7
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i132 = i14;
                                                            w7 w7Var32 = w7Var3;
                                                            switch (i132) {
                                                                case 0:
                                                                    new cc((FrameLayout) w7Var32.b, w7Var32.I0).t(org.telegram.messenger.cd.a0(null, null, 2131743903, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new cc((FrameLayout) w7Var32.b, w7Var32.I0).t(org.telegram.messenger.cd.a0(null, null, 2131743903, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    w7Var3.R0(new org.telegram.messenger.jj(w7Var3.a, message2, false, true), z10, runnable, true);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            final int f13 = jjVar.f1();
                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages.id.add(Integer.valueOf(f13));
                            final int i11 = 0;
                            ConnectionsManager.getInstance(w7Var.a).sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: org.telegram.ui.Components.z6
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    TLRPC.Message message;
                                    TLRPC.Message message2;
                                    switch (i11) {
                                        case 0:
                                            boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final w7 w7Var2 = w7Var;
                                            if (!z11) {
                                                if (tL_error2 != null) {
                                                    org.telegram.messenger.i0.g3(new y6(w7Var2, tL_error2, 3));
                                                    break;
                                                }
                                            } else {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                int i112 = 0;
                                                while (true) {
                                                    if (i112 >= messages_messages.messages.size()) {
                                                        message = null;
                                                    } else if (messages_messages.messages.get(i112).id == f13) {
                                                        message = messages_messages.messages.get(i112);
                                                    } else {
                                                        i112++;
                                                    }
                                                }
                                                if (message == null) {
                                                    final int i12 = 1;
                                                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Components.b7
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i132 = i12;
                                                            w7 w7Var32 = w7Var2;
                                                            switch (i132) {
                                                                case 0:
                                                                    new cc((FrameLayout) w7Var32.b, w7Var32.I0).t(org.telegram.messenger.cd.a0(null, null, 2131743903, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new cc((FrameLayout) w7Var32.b, w7Var32.I0).t(org.telegram.messenger.cd.a0(null, null, 2131743903, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    w7Var2.R0(new org.telegram.messenger.jj(w7Var2.a, message, false, true), z10, runnable, true);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final w7 w7Var3 = w7Var;
                                            if (!z12) {
                                                if (tL_error2 != null) {
                                                    org.telegram.messenger.i0.g3(new y6(w7Var3, tL_error2, 2));
                                                    break;
                                                }
                                            } else {
                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                int i13 = 0;
                                                while (true) {
                                                    if (i13 >= messages_messages2.messages.size()) {
                                                        message2 = null;
                                                    } else if (messages_messages2.messages.get(i13).id == f13) {
                                                        message2 = messages_messages2.messages.get(i13);
                                                    } else {
                                                        i13++;
                                                    }
                                                }
                                                if (message2 == null) {
                                                    final int i14 = 0;
                                                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Components.b7
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i132 = i14;
                                                            w7 w7Var32 = w7Var3;
                                                            switch (i132) {
                                                                case 0:
                                                                    new cc((FrameLayout) w7Var32.b, w7Var32.I0).t(org.telegram.messenger.cd.a0(null, null, 2131743903, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new cc((FrameLayout) w7Var32.b, w7Var32.I0).t(org.telegram.messenger.cd.a0(null, null, 2131743903, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    w7Var3.R0(new org.telegram.messenger.jj(w7Var3.a, message2, false, true), z10, runnable, true);
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
                        org.telegram.messenger.i0.g3(new y6(w7Var, tL_error, 0));
                        break;
                    }
                } else {
                    if (tL_error != null) {
                        org.telegram.messenger.i0.g3(new y6(w7Var, tL_error, 1));
                    }
                    org.telegram.messenger.i0.g3(new k2(w7Var, this.d, z10, document, runnable));
                    break;
                }
                break;
            default:
                final cg0 cg0Var = (cg0) this.e;
                final org.telegram.messenger.vp vpVar = (org.telegram.messenger.vp) this.f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z11 = this.b;
                final boolean z12 = this.c;
                final long j10 = this.d;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Components.bg0
                    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
                    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7 A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
                    /* JADX WARN: Removed duplicated region for block: B:49:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        int i12;
                        cg0 cg0Var2 = cg0.this;
                        int i13 = cg0Var2.b;
                        u51 u51Var = cg0Var2.c;
                        cg0Var2.K = -1;
                        boolean z13 = false;
                        cg0Var2.w = false;
                        cg0Var2.H.setLoading(false);
                        TLObject tLObject2 = tLObject;
                        boolean z14 = tLObject2 instanceof TLRPC.messages_Messages;
                        long j11 = j10;
                        if (!z14) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            if (tL_error2 == null || !tL_error2.text.startsWith("FLOOD_WAIT_") || !tL_error2.text.contains("_OR_STARS_")) {
                                if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                                    cg0Var2.d();
                                    u51Var.f3.O(true);
                                    return;
                                } else {
                                    if (tL_error2 == null || !"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                                        return;
                                    }
                                    cg0Var2.d();
                                    u51Var.f3.O(true);
                                    rh.e6.y(i13, false).q(new bi.e(cg0Var2, j11, 13), true, true);
                                    return;
                                }
                            }
                            Matcher matcher = Pattern.compile("FLOOD_WAIT_(\\d+)_OR_STARS_(\\d+)").matcher(tL_error2.text);
                            if (matcher == null || !matcher.matches()) {
                                return;
                            }
                            int parseInt = Integer.parseInt(matcher.group(1));
                            int parseInt2 = Integer.parseInt(matcher.group(2));
                            TLRPC.SearchPostsFlood searchPostsFlood = cg0Var2.d;
                            if (searchPostsFlood != null) {
                                searchPostsFlood.flags = 2 | searchPostsFlood.flags;
                                searchPostsFlood.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                cg0Var2.d.stars_amount = parseInt2;
                            }
                            cg0Var2.d();
                            u51Var.f3.O(true);
                            return;
                        }
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        ArrayList<TLRPC.User> arrayList = messages_messages.users;
                        org.telegram.messenger.vp vpVar2 = vpVar;
                        vpVar2.V3(arrayList, false);
                        vpVar2.P3(messages_messages.chats, false);
                        TLRPC.SearchPostsFlood searchPostsFlood2 = messages_messages.search_flood;
                        if (searchPostsFlood2 != null) {
                            cg0Var2.d = searchPostsFlood2;
                        }
                        boolean z15 = z11;
                        ArrayList arrayList2 = z15 ? cg0Var2.e : cg0Var2.n;
                        boolean isEmpty = arrayList2.isEmpty();
                        ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                        int size = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size) {
                            TLRPC.Message message = arrayList3.get(i14);
                            i14++;
                            org.telegram.messenger.jj jjVar2 = new org.telegram.messenger.jj(i13, message, z13, z13);
                            if (!z15) {
                                jjVar2.J5(tL_channels_searchPosts.query, true);
                            }
                            arrayList2.add(jjVar2);
                            z13 = false;
                        }
                        if (!z15) {
                            if (!(messages_messages instanceof TLRPC.TL_messages_messagesSlice)) {
                                if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    i12 = 0;
                                    cg0Var2.r = 0;
                                    cg0Var2.s = true;
                                } else {
                                    i12 = 0;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        cg0Var2.r = 0;
                                        cg0Var2.s = true;
                                    }
                                }
                                cg0Var2.d();
                                if (isEmpty) {
                                    u51Var.v0(i12);
                                }
                                u51Var.f3.O(true);
                                if (!arrayList2.isEmpty() && (!z15 ? !cg0Var2.s : !cg0Var2.h)) {
                                    org.telegram.messenger.i0.g3(new ag.j0(cg0Var2, z15, arrayList2, 21));
                                }
                                if (z12 || j11 <= 0 || z15) {
                                    return;
                                }
                                org.telegram.messenger.z20.s(org.telegram.messenger.cd.H(',', "SearchPaidStars", (int) j11), cc.a0(cg0Var2.a), R.raw.stars_topup, 36);
                                return;
                            }
                            cg0Var2.r = messages_messages.next_rate;
                            cg0Var2.s = (messages_messages.flags & 1) == 0;
                            i12 = 0;
                            cg0Var2.d();
                            if (isEmpty) {
                            }
                            u51Var.f3.O(true);
                            if (!arrayList2.isEmpty()) {
                                org.telegram.messenger.i0.g3(new ag.j0(cg0Var2, z15, arrayList2, 21));
                            }
                            if (z12) {
                                return;
                            } else {
                                return;
                            }
                        }
                        if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                            cg0Var2.f = messages_messages.next_rate;
                            cg0Var2.h = (messages_messages.flags & 1) == 0;
                            i12 = 0;
                            cg0Var2.d();
                            if (isEmpty) {
                            }
                            u51Var.f3.O(true);
                            if (!arrayList2.isEmpty()) {
                            }
                            if (z12) {
                            }
                        } else {
                            if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                i12 = 0;
                                cg0Var2.f = 0;
                                cg0Var2.h = true;
                            } else {
                                i12 = 0;
                                if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    cg0Var2.f = 0;
                                    cg0Var2.h = true;
                                }
                            }
                            cg0Var2.d();
                            if (isEmpty) {
                            }
                            u51Var.f3.O(true);
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

    public /* synthetic */ x6(cg0 cg0Var, org.telegram.messenger.vp vpVar, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j10, ConnectionsManager connectionsManager) {
        this.e = cg0Var;
        this.f = vpVar;
        this.b = z10;
        this.g = tL_channels_searchPosts;
        this.c = z11;
        this.d = j10;
        this.h = connectionsManager;
    }
}
