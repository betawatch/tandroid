// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class e20 implements RequestDelegate {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ e20(i30 i30Var, boolean z, k47 k47Var, boolean z2, Runnable runnable, long j, TLRPC.Document document) {
        this.e = i30Var;
        this.b = z;
        this.f = k47Var;
        this.c = z2;
        this.g = runnable;
        this.d = j;
        this.h = document;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        KeyEvent.Callback callback = this.e;
        switch (b) {
            case 0:
                final i30 i30Var = (i30) callback;
                k47 k47Var = (k47) obj3;
                final Runnable runnable = (Runnable) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                final boolean z = this.c;
                if (tL_error != null) {
                    if (!ad4.r(tL_error.text)) {
                        gm.c3(new f20(i30Var, tL_error, (byte) 1));
                    } else if (!this.b && k47Var.e1() >= 0) {
                        if (k47.B0(k47Var.k) < 0) {
                            final int e1 = k47Var.e1();
                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                            tL_channels_getMessages.channel = oc7.r1(i30Var.a).g1(-k47.B0(k47Var.k));
                            tL_channels_getMessages.id.add(Integer.valueOf(e1));
                            final byte b2 = 1;
                            ConnectionsManager.getInstance(i30Var.a).sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: g20
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    byte b3 = b2;
                                    TLRPC.Message message = null;
                                    Runnable runnable2 = runnable;
                                    boolean z2 = z;
                                    int i = e1;
                                    final i30 i30Var2 = i30Var;
                                    final byte b4 = 1;
                                    final byte b5 = 0;
                                    switch (b3) {
                                        case 0:
                                            if (!(tLObject2 instanceof TLRPC.messages_Messages)) {
                                                if (tL_error2 != null) {
                                                    gm.c3(new f20(i30Var2, tL_error2, (byte) 3));
                                                    break;
                                                }
                                            } else {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                int i2 = 0;
                                                while (true) {
                                                    if (i2 < messages_messages.messages.size()) {
                                                        if (messages_messages.messages.get(i2).id == i) {
                                                            message = messages_messages.messages.get(i2);
                                                        } else {
                                                            i2++;
                                                        }
                                                    }
                                                }
                                                if (message == null) {
                                                    gm.c3(new Runnable() { // from class: i20
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b6 = b4;
                                                            i30 i30Var3 = i30Var2;
                                                            switch (b6) {
                                                                case 0:
                                                                    new c41((FrameLayout) i30Var3.b, i30Var3.J0).t(jb6.a0(null, null, 2131743565, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new c41((FrameLayout) i30Var3.b, i30Var3.J0).t(jb6.a0(null, null, 2131743565, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    i30Var2.L0(new k47(i30Var2.a, message, false, true), z2, runnable2, true);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            if (!(tLObject2 instanceof TLRPC.messages_Messages)) {
                                                if (tL_error2 != null) {
                                                    gm.c3(new f20(i30Var2, tL_error2, (byte) 2));
                                                    break;
                                                }
                                            } else {
                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                int i3 = 0;
                                                while (true) {
                                                    if (i3 < messages_messages2.messages.size()) {
                                                        if (messages_messages2.messages.get(i3).id == i) {
                                                            message = messages_messages2.messages.get(i3);
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                }
                                                if (message == null) {
                                                    gm.c3(new Runnable() { // from class: i20
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b6 = b5;
                                                            i30 i30Var3 = i30Var2;
                                                            switch (b6) {
                                                                case 0:
                                                                    new c41((FrameLayout) i30Var3.b, i30Var3.J0).t(jb6.a0(null, null, 2131743565, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new c41((FrameLayout) i30Var3.b, i30Var3.J0).t(jb6.a0(null, null, 2131743565, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    i30Var2.L0(new k47(i30Var2.a, message, false, true), z2, runnable2, true);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            final int e12 = k47Var.e1();
                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages.id.add(Integer.valueOf(e12));
                            final byte b3 = 0;
                            ConnectionsManager.getInstance(i30Var.a).sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: g20
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    byte b32 = b3;
                                    TLRPC.Message message = null;
                                    Runnable runnable2 = runnable;
                                    boolean z2 = z;
                                    int i = e12;
                                    final i30 i30Var2 = i30Var;
                                    final byte b4 = 1;
                                    final byte b5 = 0;
                                    switch (b32) {
                                        case 0:
                                            if (!(tLObject2 instanceof TLRPC.messages_Messages)) {
                                                if (tL_error2 != null) {
                                                    gm.c3(new f20(i30Var2, tL_error2, (byte) 3));
                                                    break;
                                                }
                                            } else {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                int i2 = 0;
                                                while (true) {
                                                    if (i2 < messages_messages.messages.size()) {
                                                        if (messages_messages.messages.get(i2).id == i) {
                                                            message = messages_messages.messages.get(i2);
                                                        } else {
                                                            i2++;
                                                        }
                                                    }
                                                }
                                                if (message == null) {
                                                    gm.c3(new Runnable() { // from class: i20
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b6 = b4;
                                                            i30 i30Var3 = i30Var2;
                                                            switch (b6) {
                                                                case 0:
                                                                    new c41((FrameLayout) i30Var3.b, i30Var3.J0).t(jb6.a0(null, null, 2131743565, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new c41((FrameLayout) i30Var3.b, i30Var3.J0).t(jb6.a0(null, null, 2131743565, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    i30Var2.L0(new k47(i30Var2.a, message, false, true), z2, runnable2, true);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            if (!(tLObject2 instanceof TLRPC.messages_Messages)) {
                                                if (tL_error2 != null) {
                                                    gm.c3(new f20(i30Var2, tL_error2, (byte) 2));
                                                    break;
                                                }
                                            } else {
                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                int i3 = 0;
                                                while (true) {
                                                    if (i3 < messages_messages2.messages.size()) {
                                                        if (messages_messages2.messages.get(i3).id == i) {
                                                            message = messages_messages2.messages.get(i3);
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                }
                                                if (message == null) {
                                                    gm.c3(new Runnable() { // from class: i20
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b6 = b5;
                                                            i30 i30Var3 = i30Var2;
                                                            switch (b6) {
                                                                case 0:
                                                                    new c41((FrameLayout) i30Var3.b, i30Var3.J0).t(jb6.a0(null, null, 2131743565, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new c41((FrameLayout) i30Var3.b, i30Var3.J0).t(jb6.a0(null, null, 2131743565, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    i30Var2.L0(new k47(i30Var2.a, message, false, true), z2, runnable2, true);
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
                        gm.c3(new f20(i30Var, tL_error, (byte) 0));
                        break;
                    }
                }
                gm.c3(new qf2(i30Var, this.d, z, document, runnable));
                break;
            default:
                final ai8 ai8Var = (ai8) callback;
                final oc7 oc7Var = (oc7) obj3;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) obj2;
                final ConnectionsManager connectionsManager = (ConnectionsManager) obj;
                final boolean z2 = this.b;
                final boolean z3 = this.c;
                final long j = this.d;
                gm.c3(new Runnable() { // from class: zh8
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5 A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
                    /* JADX WARN: Removed duplicated region for block: B:48:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        int i;
                        ai8 ai8Var2 = ai8.this;
                        int i2 = ai8Var2.b;
                        q7c q7cVar = ai8Var2.c;
                        ai8Var2.L = -1;
                        boolean z4 = false;
                        ai8Var2.w = false;
                        ai8Var2.I.setLoading(false);
                        TLObject tLObject2 = tLObject;
                        boolean z5 = tLObject2 instanceof TLRPC.messages_Messages;
                        long j2 = j;
                        if (!z5) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            if (tL_error2 == null || !tL_error2.text.startsWith("FLOOD_WAIT_") || !tL_error2.text.contains("_OR_STARS_")) {
                                if (tL_error2 != null) {
                                    if ("PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                                        ai8Var2.d();
                                        q7cVar.g3.O(true);
                                        return;
                                    } else {
                                        if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                                            ai8Var2.d();
                                            q7cVar.g3.O(true);
                                            jva.v(i2, false).n(new fu(ai8Var2, j2, (byte) 27), true, true);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                return;
                            }
                            Matcher matcher = Pattern.compile("FLOOD_WAIT_(\\d+)_OR_STARS_(\\d+)").matcher(tL_error2.text);
                            if (matcher == null || !matcher.matches()) {
                                return;
                            }
                            int parseInt = Integer.parseInt(matcher.group(1));
                            int parseInt2 = Integer.parseInt(matcher.group(2));
                            TLRPC.SearchPostsFlood searchPostsFlood = ai8Var2.d;
                            if (searchPostsFlood != null) {
                                searchPostsFlood.flags |= 2;
                                searchPostsFlood.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                ai8Var2.d.stars_amount = parseInt2;
                            }
                            ai8Var2.d();
                            q7cVar.g3.O(true);
                            return;
                        }
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        ArrayList<TLRPC.User> arrayList = messages_messages.users;
                        oc7 oc7Var2 = oc7Var;
                        oc7Var2.d4(arrayList, false);
                        oc7Var2.X3(messages_messages.chats, false);
                        TLRPC.SearchPostsFlood searchPostsFlood2 = messages_messages.search_flood;
                        if (searchPostsFlood2 != null) {
                            ai8Var2.d = searchPostsFlood2;
                        }
                        boolean z6 = z2;
                        ArrayList arrayList2 = z6 ? ai8Var2.e : ai8Var2.n;
                        boolean isEmpty = arrayList2.isEmpty();
                        ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                        int size = arrayList3.size();
                        int i3 = 0;
                        while (i3 < size) {
                            TLRPC.Message message = arrayList3.get(i3);
                            i3++;
                            k47 k47Var2 = new k47(i2, message, z4, z4);
                            if (!z6) {
                                k47Var2.J5(tL_channels_searchPosts.query, true);
                            }
                            arrayList2.add(k47Var2);
                            z4 = false;
                        }
                        if (!z6) {
                            if (!(messages_messages instanceof TLRPC.TL_messages_messagesSlice)) {
                                if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    i = 0;
                                    ai8Var2.r = 0;
                                    ai8Var2.s = true;
                                } else {
                                    i = 0;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        ai8Var2.r = 0;
                                        ai8Var2.s = true;
                                    }
                                }
                                ai8Var2.d();
                                if (isEmpty) {
                                    q7cVar.w0(i);
                                }
                                q7cVar.g3.O(true);
                                if (!arrayList2.isEmpty() && (!z6 ? !ai8Var2.s : !ai8Var2.h)) {
                                    gm.c3(new yl6(ai8Var2, z6, arrayList2, (byte) 15));
                                }
                                if (z3 || j2 <= 0 || z6) {
                                    return;
                                }
                                b10.u(jb6.H(',', "SearchPaidStars", (int) j2), c41.b0(ai8Var2.a), R.raw.stars_topup, 36);
                                return;
                            }
                            ai8Var2.r = messages_messages.next_rate;
                            ai8Var2.s = (messages_messages.flags & 1) == 0;
                            i = 0;
                            ai8Var2.d();
                            if (isEmpty) {
                            }
                            q7cVar.g3.O(true);
                            if (!arrayList2.isEmpty()) {
                                gm.c3(new yl6(ai8Var2, z6, arrayList2, (byte) 15));
                            }
                            if (z3) {
                                return;
                            } else {
                                return;
                            }
                        }
                        if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                            ai8Var2.f = messages_messages.next_rate;
                            ai8Var2.h = (messages_messages.flags & 1) == 0;
                            i = 0;
                            ai8Var2.d();
                            if (isEmpty) {
                            }
                            q7cVar.g3.O(true);
                            if (!arrayList2.isEmpty()) {
                            }
                            if (z3) {
                            }
                        } else {
                            if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                i = 0;
                                ai8Var2.f = 0;
                                ai8Var2.h = true;
                            } else {
                                i = 0;
                                if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    ai8Var2.f = 0;
                                    ai8Var2.h = true;
                                }
                            }
                            ai8Var2.d();
                            if (isEmpty) {
                            }
                            q7cVar.g3.O(true);
                            if (!arrayList2.isEmpty()) {
                            }
                            if (z3) {
                            }
                        }
                    }
                });
                break;
        }
    }

    public /* synthetic */ e20(ai8 ai8Var, oc7 oc7Var, boolean z, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z2, long j, ConnectionsManager connectionsManager) {
        this.e = ai8Var;
        this.f = oc7Var;
        this.b = z;
        this.g = tL_channels_searchPosts;
        this.c = z2;
        this.d = j;
        this.h = connectionsManager;
    }
}
