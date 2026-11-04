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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z6 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ z6(z7 z7Var, boolean z10, org.telegram.messenger.zi ziVar, boolean z11, Runnable runnable, long j10, TLRPC.Document document) {
        this.e = z7Var;
        this.b = z10;
        this.f = ziVar;
        this.c = z11;
        this.g = runnable;
        this.d = j10;
        this.h = document;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final z7 z7Var = (z7) this.e;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.f;
                final Runnable runnable = (Runnable) this.g;
                TLRPC.Document document = (TLRPC.Document) this.h;
                final boolean z10 = this.c;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text)) {
                    if (!this.b && ziVar.f1() >= 0) {
                        if (org.telegram.messenger.zi.B0(ziVar.k) < 0) {
                            final int f12 = ziVar.f1();
                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                            tL_channels_getMessages.channel = org.telegram.messenger.hp.s1(z7Var.a).h1(-org.telegram.messenger.zi.B0(ziVar.k));
                            tL_channels_getMessages.id.add(Integer.valueOf(f12));
                            final int i3 = 1;
                            ConnectionsManager.getInstance(z7Var.a).sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: org.telegram.ui.Components.b7
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    TLRPC.Message message;
                                    TLRPC.Message message2;
                                    switch (i3) {
                                        case 0:
                                            boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final z7 z7Var2 = z7Var;
                                            if (!z11) {
                                                if (tL_error2 != null) {
                                                    org.telegram.messenger.g0.h3(new a7(z7Var2, tL_error2, 3));
                                                    break;
                                                }
                                            } else {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                int i10 = 0;
                                                while (true) {
                                                    if (i10 >= messages_messages.messages.size()) {
                                                        message = null;
                                                    } else if (messages_messages.messages.get(i10).id == f12) {
                                                        message = messages_messages.messages.get(i10);
                                                    } else {
                                                        i10++;
                                                    }
                                                }
                                                if (message == null) {
                                                    final int i11 = 1;
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.d7
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i12 = i11;
                                                            z7 z7Var3 = z7Var2;
                                                            switch (i12) {
                                                                case 0:
                                                                    new fc((FrameLayout) z7Var3.b, z7Var3.J0).t(org.telegram.messenger.bd.a0(null, null, 2131743888, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new fc((FrameLayout) z7Var3.b, z7Var3.J0).t(org.telegram.messenger.bd.a0(null, null, 2131743888, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    z7Var2.R0(new org.telegram.messenger.zi(z7Var2.a, message, false, true), z10, runnable, true);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final z7 z7Var3 = z7Var;
                                            if (!z12) {
                                                if (tL_error2 != null) {
                                                    org.telegram.messenger.g0.h3(new a7(z7Var3, tL_error2, 2));
                                                    break;
                                                }
                                            } else {
                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                int i12 = 0;
                                                while (true) {
                                                    if (i12 >= messages_messages2.messages.size()) {
                                                        message2 = null;
                                                    } else if (messages_messages2.messages.get(i12).id == f12) {
                                                        message2 = messages_messages2.messages.get(i12);
                                                    } else {
                                                        i12++;
                                                    }
                                                }
                                                if (message2 == null) {
                                                    final int i13 = 0;
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.d7
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i122 = i13;
                                                            z7 z7Var32 = z7Var3;
                                                            switch (i122) {
                                                                case 0:
                                                                    new fc((FrameLayout) z7Var32.b, z7Var32.J0).t(org.telegram.messenger.bd.a0(null, null, 2131743888, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new fc((FrameLayout) z7Var32.b, z7Var32.J0).t(org.telegram.messenger.bd.a0(null, null, 2131743888, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    z7Var3.R0(new org.telegram.messenger.zi(z7Var3.a, message2, false, true), z10, runnable, true);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            final int f13 = ziVar.f1();
                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages.id.add(Integer.valueOf(f13));
                            final int i10 = 0;
                            ConnectionsManager.getInstance(z7Var.a).sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: org.telegram.ui.Components.b7
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    TLRPC.Message message;
                                    TLRPC.Message message2;
                                    switch (i10) {
                                        case 0:
                                            boolean z11 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final z7 z7Var2 = z7Var;
                                            if (!z11) {
                                                if (tL_error2 != null) {
                                                    org.telegram.messenger.g0.h3(new a7(z7Var2, tL_error2, 3));
                                                    break;
                                                }
                                            } else {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                int i102 = 0;
                                                while (true) {
                                                    if (i102 >= messages_messages.messages.size()) {
                                                        message = null;
                                                    } else if (messages_messages.messages.get(i102).id == f13) {
                                                        message = messages_messages.messages.get(i102);
                                                    } else {
                                                        i102++;
                                                    }
                                                }
                                                if (message == null) {
                                                    final int i11 = 1;
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.d7
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i122 = i11;
                                                            z7 z7Var32 = z7Var2;
                                                            switch (i122) {
                                                                case 0:
                                                                    new fc((FrameLayout) z7Var32.b, z7Var32.J0).t(org.telegram.messenger.bd.a0(null, null, 2131743888, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new fc((FrameLayout) z7Var32.b, z7Var32.J0).t(org.telegram.messenger.bd.a0(null, null, 2131743888, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    z7Var2.R0(new org.telegram.messenger.zi(z7Var2.a, message, false, true), z10, runnable, true);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                                            final z7 z7Var3 = z7Var;
                                            if (!z12) {
                                                if (tL_error2 != null) {
                                                    org.telegram.messenger.g0.h3(new a7(z7Var3, tL_error2, 2));
                                                    break;
                                                }
                                            } else {
                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                int i12 = 0;
                                                while (true) {
                                                    if (i12 >= messages_messages2.messages.size()) {
                                                        message2 = null;
                                                    } else if (messages_messages2.messages.get(i12).id == f13) {
                                                        message2 = messages_messages2.messages.get(i12);
                                                    } else {
                                                        i12++;
                                                    }
                                                }
                                                if (message2 == null) {
                                                    final int i13 = 0;
                                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.d7
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i122 = i13;
                                                            z7 z7Var32 = z7Var3;
                                                            switch (i122) {
                                                                case 0:
                                                                    new fc((FrameLayout) z7Var32.b, z7Var32.J0).t(org.telegram.messenger.bd.a0(null, null, 2131743888, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new fc((FrameLayout) z7Var32.b, z7Var32.J0).t(org.telegram.messenger.bd.a0(null, null, 2131743888, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    z7Var3.R0(new org.telegram.messenger.zi(z7Var3.a, message2, false, true), z10, runnable, true);
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
                        org.telegram.messenger.g0.h3(new a7(z7Var, tL_error, 0));
                        break;
                    }
                } else {
                    if (tL_error != null) {
                        org.telegram.messenger.g0.h3(new a7(z7Var, tL_error, 1));
                    }
                    org.telegram.messenger.g0.h3(new h2(z7Var, this.d, z10, document, runnable));
                    break;
                }
                break;
            default:
                final bf0 bf0Var = (bf0) this.e;
                final org.telegram.messenger.hp hpVar = (org.telegram.messenger.hp) this.f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z11 = this.b;
                final boolean z12 = this.c;
                final long j10 = this.d;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.af0
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
                        bf0 bf0Var2 = bf0.this;
                        int i12 = bf0Var2.b;
                        l41 l41Var = bf0Var2.c;
                        bf0Var2.L = -1;
                        boolean z13 = false;
                        bf0Var2.w = false;
                        bf0Var2.I.setLoading(false);
                        TLObject tLObject2 = tLObject;
                        boolean z14 = tLObject2 instanceof TLRPC.messages_Messages;
                        long j11 = j10;
                        if (!z14) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            if (tL_error2 == null || !tL_error2.text.startsWith("FLOOD_WAIT_") || !tL_error2.text.contains("_OR_STARS_")) {
                                if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                                    bf0Var2.d();
                                    l41Var.g3.O(true);
                                    return;
                                } else {
                                    if (tL_error2 == null || !"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                                        return;
                                    }
                                    bf0Var2.d();
                                    l41Var.g3.O(true);
                                    ci.e9.y(i12, false).q(new ci.e3(bf0Var2, j11, 24), true, true);
                                    return;
                                }
                            }
                            Matcher matcher = Pattern.compile("FLOOD_WAIT_(\\d+)_OR_STARS_(\\d+)").matcher(tL_error2.text);
                            if (matcher == null || !matcher.matches()) {
                                return;
                            }
                            int parseInt = Integer.parseInt(matcher.group(1));
                            int parseInt2 = Integer.parseInt(matcher.group(2));
                            TLRPC.SearchPostsFlood searchPostsFlood = bf0Var2.d;
                            if (searchPostsFlood != null) {
                                searchPostsFlood.flags = 2 | searchPostsFlood.flags;
                                searchPostsFlood.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                bf0Var2.d.stars_amount = parseInt2;
                            }
                            bf0Var2.d();
                            l41Var.g3.O(true);
                            return;
                        }
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        ArrayList<TLRPC.User> arrayList = messages_messages.users;
                        org.telegram.messenger.hp hpVar2 = hpVar;
                        hpVar2.Y3(arrayList, false);
                        hpVar2.S3(messages_messages.chats, false);
                        TLRPC.SearchPostsFlood searchPostsFlood2 = messages_messages.search_flood;
                        if (searchPostsFlood2 != null) {
                            bf0Var2.d = searchPostsFlood2;
                        }
                        boolean z15 = z11;
                        ArrayList arrayList2 = z15 ? bf0Var2.e : bf0Var2.n;
                        boolean isEmpty = arrayList2.isEmpty();
                        ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            TLRPC.Message message = arrayList3.get(i13);
                            i13++;
                            org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(i12, message, z13, z13);
                            if (!z15) {
                                ziVar2.L5(tL_channels_searchPosts.query, true);
                            }
                            arrayList2.add(ziVar2);
                            z13 = false;
                        }
                        if (!z15) {
                            if (!(messages_messages instanceof TLRPC.TL_messages_messagesSlice)) {
                                if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    i11 = 0;
                                    bf0Var2.r = 0;
                                    bf0Var2.s = true;
                                } else {
                                    i11 = 0;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        bf0Var2.r = 0;
                                        bf0Var2.s = true;
                                    }
                                }
                                bf0Var2.d();
                                if (isEmpty) {
                                    l41Var.v0(i11);
                                }
                                l41Var.g3.O(true);
                                if (!arrayList2.isEmpty() && (!z15 ? !bf0Var2.s : !bf0Var2.h)) {
                                    org.telegram.messenger.g0.h3(new ci.v6(bf0Var2, z15, arrayList2, 24));
                                }
                                if (z12 || j11 <= 0 || z15) {
                                    return;
                                }
                                org.telegram.messenger.camera.q.s(org.telegram.messenger.bd.H(',', "SearchPaidStars", (int) j11), fc.a0(bf0Var2.a), R.raw.stars_topup, 36);
                                return;
                            }
                            bf0Var2.r = messages_messages.next_rate;
                            bf0Var2.s = (messages_messages.flags & 1) == 0;
                            i11 = 0;
                            bf0Var2.d();
                            if (isEmpty) {
                            }
                            l41Var.g3.O(true);
                            if (!arrayList2.isEmpty()) {
                                org.telegram.messenger.g0.h3(new ci.v6(bf0Var2, z15, arrayList2, 24));
                            }
                            if (z12) {
                                return;
                            } else {
                                return;
                            }
                        }
                        if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                            bf0Var2.f = messages_messages.next_rate;
                            bf0Var2.h = (messages_messages.flags & 1) == 0;
                            i11 = 0;
                            bf0Var2.d();
                            if (isEmpty) {
                            }
                            l41Var.g3.O(true);
                            if (!arrayList2.isEmpty()) {
                            }
                            if (z12) {
                            }
                        } else {
                            if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                i11 = 0;
                                bf0Var2.f = 0;
                                bf0Var2.h = true;
                            } else {
                                i11 = 0;
                                if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    bf0Var2.f = 0;
                                    bf0Var2.h = true;
                                }
                            }
                            bf0Var2.d();
                            if (isEmpty) {
                            }
                            l41Var.g3.O(true);
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

    public /* synthetic */ z6(bf0 bf0Var, org.telegram.messenger.hp hpVar, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j10, ConnectionsManager connectionsManager) {
        this.e = bf0Var;
        this.f = hpVar;
        this.b = z10;
        this.g = tL_channels_searchPosts;
        this.c = z11;
        this.d = j10;
        this.h = connectionsManager;
    }
}
