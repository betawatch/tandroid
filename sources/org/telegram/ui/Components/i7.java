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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class i7 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ i7(k8 k8Var, boolean z10, MessageObject messageObject, boolean z11, Runnable runnable, long j3, TLRPC.Document document) {
        this.e = k8Var;
        this.b = z10;
        this.f = messageObject;
        this.c = z11;
        this.g = runnable;
        this.d = j3;
        this.h = document;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                k8.y((k8) this.e, this.b, (MessageObject) this.f, this.c, (Runnable) this.g, this.d, (TLRPC.Document) this.h, tL_error);
                break;
            default:
                final yg0 yg0Var = (yg0) this.e;
                final MessagesController messagesController = (MessagesController) this.f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.b;
                final boolean z11 = this.c;
                final long j3 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.xg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z12;
                        yg0 yg0Var2 = yg0.this;
                        int i10 = yg0Var2.b;
                        d61 d61Var = yg0Var2.c;
                        yg0Var2.K = -1;
                        yg0Var2.v = false;
                        yg0Var2.H.setLoading(false);
                        TLObject tLObject2 = tLObject;
                        boolean z13 = tLObject2 instanceof TLRPC.messages_Messages;
                        long j10 = j3;
                        if (!z13) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            if (tL_error2 == null || !tL_error2.text.startsWith("FLOOD_WAIT_") || !tL_error2.text.contains("_OR_STARS_")) {
                                if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                                    yg0Var2.d();
                                    d61Var.Y2.N(true);
                                    return;
                                } else {
                                    if (tL_error2 == null || !"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                                        return;
                                    }
                                    yg0Var2.d();
                                    d61Var.Y2.N(true);
                                    zh.s5.y(i10, false).q(true, true, new bi.g(yg0Var2, j10, 22));
                                    return;
                                }
                            }
                            Matcher matcher = Pattern.compile("FLOOD_WAIT_(\\d+)_OR_STARS_(\\d+)").matcher(tL_error2.text);
                            if (matcher == null || !matcher.matches()) {
                                return;
                            }
                            int parseInt = Integer.parseInt(matcher.group(1));
                            int parseInt2 = Integer.parseInt(matcher.group(2));
                            TLRPC.SearchPostsFlood searchPostsFlood = yg0Var2.d;
                            if (searchPostsFlood != null) {
                                searchPostsFlood.flags = 2 | searchPostsFlood.flags;
                                searchPostsFlood.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                yg0Var2.d.stars_amount = parseInt2;
                            }
                            yg0Var2.d();
                            d61Var.Y2.N(true);
                            return;
                        }
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        ArrayList<TLRPC.User> arrayList = messages_messages.users;
                        MessagesController messagesController2 = messagesController;
                        messagesController2.putUsers(arrayList, false);
                        messagesController2.putChats(messages_messages.chats, false);
                        TLRPC.SearchPostsFlood searchPostsFlood2 = messages_messages.search_flood;
                        if (searchPostsFlood2 != null) {
                            yg0Var2.d = searchPostsFlood2;
                        }
                        boolean z14 = z10;
                        ArrayList arrayList2 = z14 ? yg0Var2.e : yg0Var2.n;
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
                                yg0Var2.f = messages_messages.next_rate;
                                yg0Var2.h = (messages_messages.flags & 1) == 0;
                            } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                yg0Var2.f = 0;
                                yg0Var2.h = true;
                            } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                yg0Var2.f = 0;
                                yg0Var2.h = true;
                            }
                        } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                            yg0Var2.r = messages_messages.next_rate;
                            yg0Var2.s = (messages_messages.flags & 1) == 0;
                            z12 = true;
                        } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                            yg0Var2.r = 0;
                            z12 = true;
                            yg0Var2.s = true;
                        } else {
                            z12 = true;
                            if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                yg0Var2.r = 0;
                                yg0Var2.s = true;
                            }
                        }
                        yg0Var2.d();
                        if (isEmpty) {
                            d61Var.u0(0);
                        }
                        d61Var.Y2.N(z12);
                        if (!arrayList2.isEmpty() && (!z14 ? !yg0Var2.s : !yg0Var2.h)) {
                            AndroidUtilities.runOnUIThread(new di.y0(yg0Var2, z14, arrayList2, 22));
                        }
                        if (!z11 || j10 <= 0 || z14) {
                            return;
                        }
                        yc.a0(yg0Var2.a).Q(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j10))).j();
                    }
                });
                break;
        }
    }

    public /* synthetic */ i7(yg0 yg0Var, MessagesController messagesController, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j3, ConnectionsManager connectionsManager) {
        this.e = yg0Var;
        this.f = messagesController;
        this.b = z10;
        this.g = tL_channels_searchPosts;
        this.c = z11;
        this.d = j3;
        this.h = connectionsManager;
    }
}
