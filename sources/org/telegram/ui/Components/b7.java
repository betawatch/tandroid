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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b7 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ b7(b8 b8Var, boolean z9, org.telegram.messenger.ij ijVar, boolean z10, Runnable runnable, long j3, TLRPC.Document document) {
        this.e = b8Var;
        this.b = z9;
        this.f = ijVar;
        this.c = z10;
        this.g = runnable;
        this.d = j3;
        this.h = document;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final b8 b8Var = (b8) this.e;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.f;
                final Runnable runnable = (Runnable) this.g;
                TLRPC.Document document = (TLRPC.Document) this.h;
                final boolean z9 = this.c;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text)) {
                    if (!this.b && ijVar.e1() >= 0) {
                        if (org.telegram.messenger.ij.B0(ijVar.k) < 0) {
                            final int e12 = ijVar.e1();
                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                            tL_channels_getMessages.channel = org.telegram.messenger.qp.s1(b8Var.a).h1(-org.telegram.messenger.ij.B0(ijVar.k));
                            tL_channels_getMessages.id.add(Integer.valueOf(e12));
                            final int i7 = 1;
                            ConnectionsManager.getInstance(b8Var.a).sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: org.telegram.ui.Components.d7
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    TLRPC.Message message;
                                    TLRPC.Message message2;
                                    switch (i7) {
                                        case 0:
                                            boolean z10 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final b8 b8Var2 = b8Var;
                                            if (!z10) {
                                                if (tL_error2 != null) {
                                                    org.telegram.messenger.g0.h3(new c7(b8Var2, tL_error2, 3));
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
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.f7
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i12 = i11;
                                                            b8 b8Var3 = b8Var2;
                                                            switch (i12) {
                                                                case 0:
                                                                    new hc((FrameLayout) b8Var3.b, b8Var3.I0).t(org.telegram.messenger.id.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new hc((FrameLayout) b8Var3.b, b8Var3.I0).t(org.telegram.messenger.id.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    b8Var2.R0(new org.telegram.messenger.ij(b8Var2.a, message, false, true), z9, runnable, true);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final b8 b8Var3 = b8Var;
                                            if (!z11) {
                                                if (tL_error2 != null) {
                                                    org.telegram.messenger.g0.h3(new c7(b8Var3, tL_error2, 2));
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
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.f7
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i122 = i13;
                                                            b8 b8Var32 = b8Var3;
                                                            switch (i122) {
                                                                case 0:
                                                                    new hc((FrameLayout) b8Var32.b, b8Var32.I0).t(org.telegram.messenger.id.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new hc((FrameLayout) b8Var32.b, b8Var32.I0).t(org.telegram.messenger.id.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    b8Var3.R0(new org.telegram.messenger.ij(b8Var3.a, message2, false, true), z9, runnable, true);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            final int e13 = ijVar.e1();
                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages.id.add(Integer.valueOf(e13));
                            final int i10 = 0;
                            ConnectionsManager.getInstance(b8Var.a).sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: org.telegram.ui.Components.d7
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    TLRPC.Message message;
                                    TLRPC.Message message2;
                                    switch (i10) {
                                        case 0:
                                            boolean z10 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final b8 b8Var2 = b8Var;
                                            if (!z10) {
                                                if (tL_error2 != null) {
                                                    org.telegram.messenger.g0.h3(new c7(b8Var2, tL_error2, 3));
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
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.f7
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i122 = i11;
                                                            b8 b8Var32 = b8Var2;
                                                            switch (i122) {
                                                                case 0:
                                                                    new hc((FrameLayout) b8Var32.b, b8Var32.I0).t(org.telegram.messenger.id.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new hc((FrameLayout) b8Var32.b, b8Var32.I0).t(org.telegram.messenger.id.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    b8Var2.R0(new org.telegram.messenger.ij(b8Var2.a, message, false, true), z9, runnable, true);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final b8 b8Var3 = b8Var;
                                            if (!z11) {
                                                if (tL_error2 != null) {
                                                    org.telegram.messenger.g0.h3(new c7(b8Var3, tL_error2, 2));
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
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.f7
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i122 = i13;
                                                            b8 b8Var32 = b8Var3;
                                                            switch (i122) {
                                                                case 0:
                                                                    new hc((FrameLayout) b8Var32.b, b8Var32.I0).t(org.telegram.messenger.id.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new hc((FrameLayout) b8Var32.b, b8Var32.I0).t(org.telegram.messenger.id.a0(null, null, 2131743878, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    b8Var3.R0(new org.telegram.messenger.ij(b8Var3.a, message2, false, true), z9, runnable, true);
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
                        org.telegram.messenger.g0.h3(new c7(b8Var, tL_error, 0));
                        break;
                    }
                } else {
                    if (tL_error != null) {
                        org.telegram.messenger.g0.h3(new c7(b8Var, tL_error, 1));
                    }
                    org.telegram.messenger.g0.h3(new j2(b8Var, this.d, z9, document, runnable));
                    break;
                }
                break;
            default:
                final af0 af0Var = (af0) this.e;
                final org.telegram.messenger.qp qpVar = (org.telegram.messenger.qp) this.f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.b;
                final boolean z11 = this.c;
                final long j3 = this.d;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.ze0
                    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
                    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9 A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
                    /* JADX WARN: Removed duplicated region for block: B:49:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        int i11;
                        af0 af0Var2 = af0.this;
                        int i12 = af0Var2.b;
                        r41 r41Var = af0Var2.c;
                        af0Var2.K = -1;
                        boolean z12 = false;
                        af0Var2.w = false;
                        af0Var2.H.setLoading(false);
                        TLObject tLObject2 = tLObject;
                        boolean z13 = tLObject2 instanceof TLRPC.messages_Messages;
                        long j10 = j3;
                        if (!z13) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            if (tL_error2 == null || !tL_error2.text.startsWith("FLOOD_WAIT_") || !tL_error2.text.contains("_OR_STARS_")) {
                                if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                                    af0Var2.d();
                                    r41Var.f3.O(true);
                                    return;
                                } else {
                                    if (tL_error2 == null || !"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                                        return;
                                    }
                                    af0Var2.d();
                                    r41Var.f3.O(true);
                                    bi.ea.y(i12, false).q(new bi.r3(af0Var2, j10, 24), true, true);
                                    return;
                                }
                            }
                            Matcher matcher = Pattern.compile("FLOOD_WAIT_(\\d+)_OR_STARS_(\\d+)").matcher(tL_error2.text);
                            if (matcher == null || !matcher.matches()) {
                                return;
                            }
                            int parseInt = Integer.parseInt(matcher.group(1));
                            int parseInt2 = Integer.parseInt(matcher.group(2));
                            TLRPC.SearchPostsFlood searchPostsFlood = af0Var2.d;
                            if (searchPostsFlood != null) {
                                searchPostsFlood.flags = 2 | searchPostsFlood.flags;
                                searchPostsFlood.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                af0Var2.d.stars_amount = parseInt2;
                            }
                            af0Var2.d();
                            r41Var.f3.O(true);
                            return;
                        }
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        ArrayList<TLRPC.User> arrayList = messages_messages.users;
                        org.telegram.messenger.qp qpVar2 = qpVar;
                        qpVar2.Y3(arrayList, false);
                        qpVar2.S3(messages_messages.chats, false);
                        TLRPC.SearchPostsFlood searchPostsFlood2 = messages_messages.search_flood;
                        if (searchPostsFlood2 != null) {
                            af0Var2.d = searchPostsFlood2;
                        }
                        boolean z14 = z10;
                        ArrayList arrayList2 = z14 ? af0Var2.e : af0Var2.n;
                        boolean isEmpty = arrayList2.isEmpty();
                        ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            TLRPC.Message message = arrayList3.get(i13);
                            i13++;
                            org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(i12, message, z12, z12);
                            if (!z14) {
                                ijVar2.K5(tL_channels_searchPosts.query, true);
                            }
                            arrayList2.add(ijVar2);
                            z12 = false;
                        }
                        if (!z14) {
                            if (!(messages_messages instanceof TLRPC.TL_messages_messagesSlice)) {
                                if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    i11 = 0;
                                    af0Var2.r = 0;
                                    af0Var2.s = true;
                                } else {
                                    i11 = 0;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        af0Var2.r = 0;
                                        af0Var2.s = true;
                                    }
                                }
                                af0Var2.d();
                                if (isEmpty) {
                                    r41Var.v0(i11);
                                }
                                r41Var.f3.O(true);
                                if (!arrayList2.isEmpty() && (!z14 ? !af0Var2.s : !af0Var2.h)) {
                                    org.telegram.messenger.g0.h3(new bi.u7(af0Var2, z14, arrayList2, 24));
                                }
                                if (z11 || j10 <= 0 || z14) {
                                    return;
                                }
                                org.telegram.messenger.camera.q.s(org.telegram.messenger.id.H(',', "SearchPaidStars", (int) j10), hc.a0(af0Var2.a), R.raw.stars_topup, 36);
                                return;
                            }
                            af0Var2.r = messages_messages.next_rate;
                            af0Var2.s = (messages_messages.flags & 1) == 0;
                            i11 = 0;
                            af0Var2.d();
                            if (isEmpty) {
                            }
                            r41Var.f3.O(true);
                            if (!arrayList2.isEmpty()) {
                                org.telegram.messenger.g0.h3(new bi.u7(af0Var2, z14, arrayList2, 24));
                            }
                            if (z11) {
                                return;
                            } else {
                                return;
                            }
                        }
                        if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                            af0Var2.f = messages_messages.next_rate;
                            af0Var2.h = (messages_messages.flags & 1) == 0;
                            i11 = 0;
                            af0Var2.d();
                            if (isEmpty) {
                            }
                            r41Var.f3.O(true);
                            if (!arrayList2.isEmpty()) {
                            }
                            if (z11) {
                            }
                        } else {
                            if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                i11 = 0;
                                af0Var2.f = 0;
                                af0Var2.h = true;
                            } else {
                                i11 = 0;
                                if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    af0Var2.f = 0;
                                    af0Var2.h = true;
                                }
                            }
                            af0Var2.d();
                            if (isEmpty) {
                            }
                            r41Var.f3.O(true);
                            if (!arrayList2.isEmpty()) {
                            }
                            if (z11) {
                            }
                        }
                    }
                });
                break;
        }
    }

    public /* synthetic */ b7(af0 af0Var, org.telegram.messenger.qp qpVar, boolean z9, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z10, long j3, ConnectionsManager connectionsManager) {
        this.e = af0Var;
        this.f = qpVar;
        this.b = z9;
        this.g = tL_channels_searchPosts;
        this.c = z10;
        this.d = j3;
        this.h = connectionsManager;
    }
}
