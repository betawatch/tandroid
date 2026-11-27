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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f10 implements RequestDelegate {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ f10(j20 j20Var, boolean z, r47 r47Var, boolean z2, Runnable runnable, long j, TLRPC.Document document) {
        this.e = j20Var;
        this.b = z;
        this.f = r47Var;
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
                final j20 j20Var = (j20) callback;
                r47 r47Var = (r47) obj3;
                final Runnable runnable = (Runnable) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                final boolean z = this.c;
                if (tL_error != null) {
                    if (!xc4.r(tL_error.text)) {
                        hl.c3(new g10(j20Var, tL_error, (byte) 1));
                    } else if (!this.b && r47Var.e1() >= 0) {
                        if (r47.B0(r47Var.k) < 0) {
                            final int e1 = r47Var.e1();
                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                            tL_channels_getMessages.channel = uc7.s1(j20Var.a).h1(-r47.B0(r47Var.k));
                            tL_channels_getMessages.id.add(Integer.valueOf(e1));
                            final byte b2 = 1;
                            ConnectionsManager.getInstance(j20Var.a).sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: h10
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    byte b3 = b2;
                                    TLRPC.Message message = null;
                                    Runnable runnable2 = runnable;
                                    boolean z2 = z;
                                    int i = e1;
                                    final j20 j20Var2 = j20Var;
                                    final byte b4 = 1;
                                    final byte b5 = 0;
                                    switch (b3) {
                                        case 0:
                                            if (!(tLObject2 instanceof TLRPC.messages_Messages)) {
                                                if (tL_error2 != null) {
                                                    hl.c3(new g10(j20Var2, tL_error2, (byte) 3));
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
                                                    hl.c3(new Runnable() { // from class: j10
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b6 = b4;
                                                            j20 j20Var3 = j20Var2;
                                                            switch (b6) {
                                                                case 0:
                                                                    new d31((FrameLayout) j20Var3.b, j20Var3.J0).t(ob6.a0(null, null, 2131743533, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new d31((FrameLayout) j20Var3.b, j20Var3.J0).t(ob6.a0(null, null, 2131743533, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    j20Var2.M0(new r47(j20Var2.a, message, false, true), z2, runnable2, true);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            if (!(tLObject2 instanceof TLRPC.messages_Messages)) {
                                                if (tL_error2 != null) {
                                                    hl.c3(new g10(j20Var2, tL_error2, (byte) 2));
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
                                                    hl.c3(new Runnable() { // from class: j10
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b6 = b5;
                                                            j20 j20Var3 = j20Var2;
                                                            switch (b6) {
                                                                case 0:
                                                                    new d31((FrameLayout) j20Var3.b, j20Var3.J0).t(ob6.a0(null, null, 2131743533, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new d31((FrameLayout) j20Var3.b, j20Var3.J0).t(ob6.a0(null, null, 2131743533, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    j20Var2.M0(new r47(j20Var2.a, message, false, true), z2, runnable2, true);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            final int e12 = r47Var.e1();
                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages.id.add(Integer.valueOf(e12));
                            final byte b3 = 0;
                            ConnectionsManager.getInstance(j20Var.a).sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: h10
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    byte b32 = b3;
                                    TLRPC.Message message = null;
                                    Runnable runnable2 = runnable;
                                    boolean z2 = z;
                                    int i = e12;
                                    final j20 j20Var2 = j20Var;
                                    final byte b4 = 1;
                                    final byte b5 = 0;
                                    switch (b32) {
                                        case 0:
                                            if (!(tLObject2 instanceof TLRPC.messages_Messages)) {
                                                if (tL_error2 != null) {
                                                    hl.c3(new g10(j20Var2, tL_error2, (byte) 3));
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
                                                    hl.c3(new Runnable() { // from class: j10
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b6 = b4;
                                                            j20 j20Var3 = j20Var2;
                                                            switch (b6) {
                                                                case 0:
                                                                    new d31((FrameLayout) j20Var3.b, j20Var3.J0).t(ob6.a0(null, null, 2131743533, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new d31((FrameLayout) j20Var3.b, j20Var3.J0).t(ob6.a0(null, null, 2131743533, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    j20Var2.M0(new r47(j20Var2.a, message, false, true), z2, runnable2, true);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            if (!(tLObject2 instanceof TLRPC.messages_Messages)) {
                                                if (tL_error2 != null) {
                                                    hl.c3(new g10(j20Var2, tL_error2, (byte) 2));
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
                                                    hl.c3(new Runnable() { // from class: j10
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b6 = b5;
                                                            j20 j20Var3 = j20Var2;
                                                            switch (b6) {
                                                                case 0:
                                                                    new d31((FrameLayout) j20Var3.b, j20Var3.J0).t(ob6.a0(null, null, 2131743533, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                                default:
                                                                    new d31((FrameLayout) j20Var3.b, j20Var3.J0).t(ob6.a0(null, null, 2131743533, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                } else {
                                                    j20Var2.M0(new r47(j20Var2.a, message, false, true), z2, runnable2, true);
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
                        hl.c3(new g10(j20Var, tL_error, (byte) 0));
                        break;
                    }
                }
                hl.c3(new re2(j20Var, this.d, z, document, runnable));
                break;
            default:
                final mj8 mj8Var = (mj8) callback;
                final uc7 uc7Var = (uc7) obj3;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) obj2;
                final ConnectionsManager connectionsManager = (ConnectionsManager) obj;
                final boolean z2 = this.b;
                final boolean z3 = this.c;
                final long j = this.d;
                hl.c3(new Runnable() { // from class: lj8
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
                        mj8 mj8Var2 = mj8.this;
                        int i2 = mj8Var2.b;
                        q9c q9cVar = mj8Var2.c;
                        mj8Var2.L = -1;
                        boolean z4 = false;
                        mj8Var2.w = false;
                        mj8Var2.I.setLoading(false);
                        TLObject tLObject2 = tLObject;
                        boolean z5 = tLObject2 instanceof TLRPC.messages_Messages;
                        long j2 = j;
                        if (!z5) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            if (tL_error2 == null || !tL_error2.text.startsWith("FLOOD_WAIT_") || !tL_error2.text.contains("_OR_STARS_")) {
                                if (tL_error2 != null) {
                                    if ("PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                                        mj8Var2.d();
                                        q9cVar.g3.O(true);
                                        return;
                                    } else {
                                        if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                                            mj8Var2.d();
                                            q9cVar.g3.O(true);
                                            jxa.v(i2, false).n(new kt(mj8Var2, j2, (byte) 27), true, true);
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
                            TLRPC.SearchPostsFlood searchPostsFlood = mj8Var2.d;
                            if (searchPostsFlood != null) {
                                searchPostsFlood.flags |= 2;
                                searchPostsFlood.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                mj8Var2.d.stars_amount = parseInt2;
                            }
                            mj8Var2.d();
                            q9cVar.g3.O(true);
                            return;
                        }
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        ArrayList<TLRPC.User> arrayList = messages_messages.users;
                        uc7 uc7Var2 = uc7Var;
                        uc7Var2.j4(arrayList, false);
                        uc7Var2.c4(messages_messages.chats, false);
                        TLRPC.SearchPostsFlood searchPostsFlood2 = messages_messages.search_flood;
                        if (searchPostsFlood2 != null) {
                            mj8Var2.d = searchPostsFlood2;
                        }
                        boolean z6 = z2;
                        ArrayList arrayList2 = z6 ? mj8Var2.e : mj8Var2.n;
                        boolean isEmpty = arrayList2.isEmpty();
                        ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                        int size = arrayList3.size();
                        int i3 = 0;
                        while (i3 < size) {
                            TLRPC.Message message = arrayList3.get(i3);
                            i3++;
                            r47 r47Var2 = new r47(i2, message, z4, z4);
                            if (!z6) {
                                r47Var2.J5(tL_channels_searchPosts.query, true);
                            }
                            arrayList2.add(r47Var2);
                            z4 = false;
                        }
                        if (!z6) {
                            if (!(messages_messages instanceof TLRPC.TL_messages_messagesSlice)) {
                                if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                    i = 0;
                                    mj8Var2.r = 0;
                                    mj8Var2.s = true;
                                } else {
                                    i = 0;
                                    if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                        mj8Var2.r = 0;
                                        mj8Var2.s = true;
                                    }
                                }
                                mj8Var2.d();
                                if (isEmpty) {
                                    q9cVar.x0(i);
                                }
                                q9cVar.g3.O(true);
                                if (!arrayList2.isEmpty() && (!z6 ? !mj8Var2.s : !mj8Var2.h)) {
                                    hl.c3(new yn6(mj8Var2, z6, arrayList2, (byte) 14));
                                }
                                if (z3 || j2 <= 0 || z6) {
                                    return;
                                }
                                c00.v(ob6.H(',', "SearchPaidStars", (int) j2), d31.b0(mj8Var2.a), R.raw.stars_topup, 36);
                                return;
                            }
                            mj8Var2.r = messages_messages.next_rate;
                            mj8Var2.s = (messages_messages.flags & 1) == 0;
                            i = 0;
                            mj8Var2.d();
                            if (isEmpty) {
                            }
                            q9cVar.g3.O(true);
                            if (!arrayList2.isEmpty()) {
                                hl.c3(new yn6(mj8Var2, z6, arrayList2, (byte) 14));
                            }
                            if (z3) {
                                return;
                            } else {
                                return;
                            }
                        }
                        if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                            mj8Var2.f = messages_messages.next_rate;
                            mj8Var2.h = (messages_messages.flags & 1) == 0;
                            i = 0;
                            mj8Var2.d();
                            if (isEmpty) {
                            }
                            q9cVar.g3.O(true);
                            if (!arrayList2.isEmpty()) {
                            }
                            if (z3) {
                            }
                        } else {
                            if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                i = 0;
                                mj8Var2.f = 0;
                                mj8Var2.h = true;
                            } else {
                                i = 0;
                                if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                    mj8Var2.f = 0;
                                    mj8Var2.h = true;
                                }
                            }
                            mj8Var2.d();
                            if (isEmpty) {
                            }
                            q9cVar.g3.O(true);
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

    public /* synthetic */ f10(mj8 mj8Var, uc7 uc7Var, boolean z, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z2, long j, ConnectionsManager connectionsManager) {
        this.e = mj8Var;
        this.f = uc7Var;
        this.b = z;
        this.g = tL_channels_searchPosts;
        this.c = z2;
        this.d = j;
        this.h = connectionsManager;
    }
}
