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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c7 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c7(c8 c8Var, boolean z4, MessageObject messageObject, boolean z10, Runnable runnable, long j10, TLRPC.Document document) {
        this.e = c8Var;
        this.b = z4;
        this.f = messageObject;
        this.c = z10;
        this.g = runnable;
        this.d = j10;
        this.h = document;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                c8.y((c8) this.e, this.b, (MessageObject) this.f, this.c, (Runnable) this.g, this.d, (TLRPC.Document) this.h, tL_error);
                break;
            default:
                final eh0 eh0Var = (eh0) this.e;
                final MessagesController messagesController = (MessagesController) this.f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z4 = this.b;
                final boolean z10 = this.c;
                final long j10 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.dh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z11;
                        eh0 eh0Var2 = eh0.this;
                        int i10 = eh0Var2.b;
                        g61 g61Var = eh0Var2.c;
                        eh0Var2.H = -1;
                        eh0Var2.v = false;
                        eh0Var2.E.setLoading(false);
                        TLObject tLObject2 = tLObject;
                        boolean z12 = tLObject2 instanceof TLRPC.messages_Messages;
                        long j11 = j10;
                        if (!z12) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            if (tL_error2 == null || !tL_error2.text.startsWith("FLOOD_WAIT_") || !tL_error2.text.contains("_OR_STARS_")) {
                                if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                                    eh0Var2.d();
                                    g61Var.V2.N(true);
                                    return;
                                } else {
                                    if (tL_error2 == null || !"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                                        return;
                                    }
                                    eh0Var2.d();
                                    g61Var.V2.N(true);
                                    lh.t7.y(i10, false).q(true, true, new gg.y1(eh0Var2, j11, 19));
                                    return;
                                }
                            }
                            Matcher matcher = Pattern.compile("FLOOD_WAIT_(\\d+)_OR_STARS_(\\d+)").matcher(tL_error2.text);
                            if (matcher == null || !matcher.matches()) {
                                return;
                            }
                            int parseInt = Integer.parseInt(matcher.group(1));
                            int parseInt2 = Integer.parseInt(matcher.group(2));
                            TLRPC.SearchPostsFlood searchPostsFlood = eh0Var2.d;
                            if (searchPostsFlood != null) {
                                searchPostsFlood.flags = 2 | searchPostsFlood.flags;
                                searchPostsFlood.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                eh0Var2.d.stars_amount = parseInt2;
                            }
                            eh0Var2.d();
                            g61Var.V2.N(true);
                            return;
                        }
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        ArrayList<TLRPC.User> arrayList = messages_messages.users;
                        MessagesController messagesController2 = messagesController;
                        messagesController2.putUsers(arrayList, false);
                        messagesController2.putChats(messages_messages.chats, false);
                        TLRPC.SearchPostsFlood searchPostsFlood2 = messages_messages.search_flood;
                        if (searchPostsFlood2 != null) {
                            eh0Var2.d = searchPostsFlood2;
                        }
                        boolean z13 = z4;
                        ArrayList arrayList2 = z13 ? eh0Var2.e : eh0Var2.n;
                        boolean isEmpty = arrayList2.isEmpty();
                        ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            TLRPC.Message message = arrayList3.get(i11);
                            i11++;
                            MessageObject messageObject = new MessageObject(i10, message, false, false);
                            if (!z13) {
                                messageObject.setQuery(tL_channels_searchPosts.query);
                            }
                            arrayList2.add(messageObject);
                        }
                        if (z13) {
                            z11 = true;
                            if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                                eh0Var2.f = messages_messages.next_rate;
                                eh0Var2.h = (messages_messages.flags & 1) == 0;
                            } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                eh0Var2.f = 0;
                                eh0Var2.h = true;
                            } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                eh0Var2.f = 0;
                                eh0Var2.h = true;
                            }
                        } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                            eh0Var2.r = messages_messages.next_rate;
                            eh0Var2.s = (messages_messages.flags & 1) == 0;
                            z11 = true;
                        } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                            eh0Var2.r = 0;
                            z11 = true;
                            eh0Var2.s = true;
                        } else {
                            z11 = true;
                            if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                eh0Var2.r = 0;
                                eh0Var2.s = true;
                            }
                        }
                        eh0Var2.d();
                        if (isEmpty) {
                            g61Var.u0(0);
                        }
                        g61Var.V2.N(z11);
                        if (!arrayList2.isEmpty() && (!z13 ? !eh0Var2.s : !eh0Var2.h)) {
                            AndroidUtilities.runOnUIThread(new lh.r5(eh0Var2, z13, arrayList2, 18));
                        }
                        if (!z10 || j11 <= 0 || z13) {
                            return;
                        }
                        qc.a0(eh0Var2.a).Q(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j11))).j();
                    }
                });
                break;
        }
    }

    public /* synthetic */ c7(eh0 eh0Var, MessagesController messagesController, boolean z4, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z10, long j10, ConnectionsManager connectionsManager) {
        this.e = eh0Var;
        this.f = messagesController;
        this.b = z4;
        this.g = tL_channels_searchPosts;
        this.c = z10;
        this.d = j10;
        this.h = connectionsManager;
    }
}
