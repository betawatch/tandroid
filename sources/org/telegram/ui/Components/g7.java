package org.telegram.ui.Components;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g7 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ g7(g8 g8Var, boolean z10, MessageObject messageObject, boolean z11, Runnable runnable, long j10, TLRPC.Document document) {
        this.e = g8Var;
        this.b = z10;
        this.f = messageObject;
        this.c = z11;
        this.g = runnable;
        this.d = j10;
        this.h = document;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g8.y((g8) this.e, this.b, (MessageObject) this.f, this.c, (Runnable) this.g, this.d, (TLRPC.Document) this.h, tL_error);
                break;
            default:
                final ug0 ug0Var = (ug0) this.e;
                final MessagesController messagesController = (MessagesController) this.f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.b;
                final boolean z11 = this.c;
                final long j10 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.tg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z12;
                        ug0 ug0Var2 = ug0.this;
                        int i10 = ug0Var2.b;
                        u51 u51Var = ug0Var2.c;
                        ug0Var2.G = -1;
                        ug0Var2.v = false;
                        ug0Var2.D.setLoading(false);
                        TLObject tLObject2 = tLObject;
                        boolean z13 = tLObject2 instanceof TLRPC.messages_Messages;
                        long j11 = j10;
                        if (!z13) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            if (tL_error2 == null || !tL_error2.text.startsWith("FLOOD_WAIT_") || !tL_error2.text.contains("_OR_STARS_")) {
                                if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                                    ug0Var2.d();
                                    u51Var.U2.N(true);
                                    return;
                                } else {
                                    if (tL_error2 == null || !"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                                        return;
                                    }
                                    ug0Var2.d();
                                    u51Var.U2.N(true);
                                    jh.s7.y(i10, false).q(true, true, new eg.z1(ug0Var2, j11, 22));
                                    return;
                                }
                            }
                            Matcher matcher = Pattern.compile("FLOOD_WAIT_(\\d+)_OR_STARS_(\\d+)").matcher(tL_error2.text);
                            if (matcher == null || !matcher.matches()) {
                                return;
                            }
                            int parseInt = Integer.parseInt(matcher.group(1));
                            int parseInt2 = Integer.parseInt(matcher.group(2));
                            TLRPC.SearchPostsFlood searchPostsFlood = ug0Var2.d;
                            if (searchPostsFlood != null) {
                                searchPostsFlood.flags = 2 | searchPostsFlood.flags;
                                searchPostsFlood.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                ug0Var2.d.stars_amount = parseInt2;
                            }
                            ug0Var2.d();
                            u51Var.U2.N(true);
                            return;
                        }
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        ArrayList<TLRPC.User> arrayList = messages_messages.users;
                        MessagesController messagesController2 = messagesController;
                        messagesController2.putUsers(arrayList, false);
                        messagesController2.putChats(messages_messages.chats, false);
                        TLRPC.SearchPostsFlood searchPostsFlood2 = messages_messages.search_flood;
                        if (searchPostsFlood2 != null) {
                            ug0Var2.d = searchPostsFlood2;
                        }
                        boolean z14 = z10;
                        ArrayList arrayList2 = z14 ? ug0Var2.e : ug0Var2.n;
                        boolean isEmpty = arrayList2.isEmpty();
                        ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            TLRPC.Message message = arrayList3.get(i11);
                            i11++;
                            MessageObject messageObject = new MessageObject(i10, message, false, false);
                            if (!z14) {
                                messageObject.setQuery(tL_channels_searchPosts.query);
                            }
                            arrayList2.add(messageObject);
                        }
                        if (z14) {
                            z12 = true;
                            if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                ug0Var2.f = messages_messages.next_rate;
                                ug0Var2.h = (messages_messages.flags & 1) == 0;
                            } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                ug0Var2.f = 0;
                                ug0Var2.h = true;
                            } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                ug0Var2.f = 0;
                                ug0Var2.h = true;
                            }
                        } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                            ug0Var2.r = messages_messages.next_rate;
                            ug0Var2.s = (messages_messages.flags & 1) == 0;
                            z12 = true;
                        } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                            ug0Var2.r = 0;
                            z12 = true;
                            ug0Var2.s = true;
                        } else {
                            z12 = true;
                            if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                ug0Var2.r = 0;
                                ug0Var2.s = true;
                            }
                        }
                        ug0Var2.d();
                        if (isEmpty) {
                            u51Var.u0(0);
                        }
                        u51Var.U2.N(z12);
                        if (!arrayList2.isEmpty() && (!z14 ? !ug0Var2.s : !ug0Var2.h)) {
                            AndroidUtilities.runOnUIThread(new jh.r5(ug0Var2, z14, arrayList2, 20));
                        }
                        if (!z11 || j11 <= 0 || z14) {
                            return;
                        }
                        tc.a0(ug0Var2.a).Q(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j11))).j();
                    }
                });
                break;
        }
    }

    public /* synthetic */ g7(ug0 ug0Var, MessagesController messagesController, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j10, ConnectionsManager connectionsManager) {
        this.e = ug0Var;
        this.f = messagesController;
        this.b = z10;
        this.g = tL_channels_searchPosts;
        this.c = z11;
        this.d = j10;
        this.h = connectionsManager;
    }
}
