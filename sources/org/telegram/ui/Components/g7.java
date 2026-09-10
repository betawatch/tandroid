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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class g7 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ KeyEvent.Callback e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ g7(j8 j8Var, boolean z10, MessageObject messageObject, boolean z11, Runnable runnable, long j3, TLRPC.Document document) {
        this.e = j8Var;
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
                j8.y((j8) this.e, this.b, (MessageObject) this.f, this.c, (Runnable) this.g, this.d, (TLRPC.Document) this.h, tL_error);
                break;
            default:
                final ih0 ih0Var = (ih0) this.e;
                final MessagesController messagesController = (MessagesController) this.f;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) this.g;
                final ConnectionsManager connectionsManager = (ConnectionsManager) this.h;
                final boolean z10 = this.b;
                final boolean z11 = this.c;
                final long j3 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.hh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z12;
                        ih0 ih0Var2 = ih0.this;
                        int i10 = ih0Var2.b;
                        r61 r61Var = ih0Var2.c;
                        ih0Var2.K = -1;
                        ih0Var2.v = false;
                        ih0Var2.H.setLoading(false);
                        TLObject tLObject2 = tLObject;
                        boolean z13 = tLObject2 instanceof TLRPC.messages_Messages;
                        long j10 = j3;
                        if (!z13) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            if (tL_error2 == null || !tL_error2.text.startsWith("FLOOD_WAIT_") || !tL_error2.text.contains("_OR_STARS_")) {
                                if (tL_error2 != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error2.text)) {
                                    ih0Var2.d();
                                    r61Var.Y2.N(true);
                                    return;
                                } else {
                                    if (tL_error2 == null || !"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error2.text)) {
                                        return;
                                    }
                                    ih0Var2.d();
                                    r61Var.Y2.N(true);
                                    xh.v5.y(i10, false).q(true, true, new bi.va(ih0Var2, j10, 17));
                                    return;
                                }
                            }
                            Matcher matcher = Pattern.compile("FLOOD_WAIT_(\\d+)_OR_STARS_(\\d+)").matcher(tL_error2.text);
                            if (matcher == null || !matcher.matches()) {
                                return;
                            }
                            int parseInt = Integer.parseInt(matcher.group(1));
                            int parseInt2 = Integer.parseInt(matcher.group(2));
                            TLRPC.SearchPostsFlood searchPostsFlood = ih0Var2.d;
                            if (searchPostsFlood != null) {
                                searchPostsFlood.flags = 2 | searchPostsFlood.flags;
                                searchPostsFlood.wait_till = connectionsManager.getCurrentTime() + parseInt;
                                ih0Var2.d.stars_amount = parseInt2;
                            }
                            ih0Var2.d();
                            r61Var.Y2.N(true);
                            return;
                        }
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        ArrayList<TLRPC.User> arrayList = messages_messages.users;
                        MessagesController messagesController2 = messagesController;
                        messagesController2.putUsers(arrayList, false);
                        messagesController2.putChats(messages_messages.chats, false);
                        TLRPC.SearchPostsFlood searchPostsFlood2 = messages_messages.search_flood;
                        if (searchPostsFlood2 != null) {
                            ih0Var2.d = searchPostsFlood2;
                        }
                        boolean z14 = z10;
                        ArrayList arrayList2 = z14 ? ih0Var2.e : ih0Var2.n;
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
                                ih0Var2.f = messages_messages.next_rate;
                                ih0Var2.h = (messages_messages.flags & 1) == 0;
                            } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                                ih0Var2.f = 0;
                                ih0Var2.h = true;
                            } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                ih0Var2.f = 0;
                                ih0Var2.h = true;
                            }
                        } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                            ih0Var2.r = messages_messages.next_rate;
                            ih0Var2.s = (messages_messages.flags & 1) == 0;
                            z12 = true;
                        } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                            ih0Var2.r = 0;
                            z12 = true;
                            ih0Var2.s = true;
                        } else {
                            z12 = true;
                            if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
                                ih0Var2.r = 0;
                                ih0Var2.s = true;
                            }
                        }
                        ih0Var2.d();
                        if (isEmpty) {
                            r61Var.u0(0);
                        }
                        r61Var.Y2.N(z12);
                        if (!arrayList2.isEmpty() && (!z14 ? !ih0Var2.s : !ih0Var2.h)) {
                            AndroidUtilities.runOnUIThread(new bi.c1(ih0Var2, z14, arrayList2, 22));
                        }
                        if (!z11 || j10 <= 0 || z14) {
                            return;
                        }
                        wc.a0(ih0Var2.a).Q(R.raw.stars_topup, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j10))).j();
                    }
                });
                break;
        }
    }

    public /* synthetic */ g7(ih0 ih0Var, MessagesController messagesController, boolean z10, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z11, long j3, ConnectionsManager connectionsManager) {
        this.e = ih0Var;
        this.f = messagesController;
        this.b = z10;
        this.g = tL_channels_searchPosts;
        this.c = z11;
        this.d = j3;
        this.h = connectionsManager;
    }
}
