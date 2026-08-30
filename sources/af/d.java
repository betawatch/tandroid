package af;

import a0.h;
import android.content.Context;
import android.net.Uri;
import f2.l1;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.j4;
import org.telegram.ui.l4;
import org.telegram.ui.p3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ d(f fVar, d2[] d2VarArr, TLObject tLObject, int i10, Uri uri, Context context, boolean z4) {
        this.e = fVar;
        this.f = d2VarArr;
        this.b = tLObject;
        this.c = i10;
        this.h = uri;
        this.n = context;
        this.d = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l1 K;
        int i10 = 0;
        switch (this.a) {
            case 0:
                f fVar = (f) this.e;
                d2[] d2VarArr = (d2[]) this.f;
                TLObject tLObject = this.b;
                int i11 = this.c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.n;
                boolean z4 = this.d;
                if (fVar != null) {
                    fVar.b();
                } else {
                    try {
                        d2VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    d2VarArr[0] = null;
                }
                if (tLObject instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                    MessagesController.getInstance(i11).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i11).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if ((webPage instanceof TLRPC.TL_webPage) && webPage.cached_page != null) {
                            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, tL_messageMediaWebPage.webpage, uri.toString());
                            break;
                        }
                    }
                }
                g.p(context, uri, z4, false);
                break;
            default:
                l4 l4Var = (l4) this.e;
                TLObject tLObject2 = this.b;
                int i12 = this.c;
                TLRPC.WebPage webPage2 = (TLRPC.WebPage) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                boolean z10 = this.d;
                String str = (String) this.n;
                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_webPage;
                TLObject tLObject3 = tLObject2;
                if (z11) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i12).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i12).putChats(tL_messages_webPage.chats, false);
                    tLObject3 = tL_messages_webPage.webpage;
                }
                if (!(tLObject3 instanceof TLRPC.TL_webPage)) {
                    if (tLObject3 instanceof TLRPC.TL_webPageNotModified) {
                        TLRPC.TL_webPageNotModified tL_webPageNotModified = (TLRPC.TL_webPageNotModified) tLObject3;
                        TL_iv.Page page = webPage2.cached_page;
                        if (page != null) {
                            int i13 = page.views;
                            int i14 = tL_webPageNotModified.cached_page_views;
                            if (i13 != i14) {
                                page.views = i14;
                                page.flags |= 8;
                                while (true) {
                                    p3[] p3VarArr = l4Var.r0;
                                    if (i10 >= p3VarArr.length) {
                                        if (messageObject != null) {
                                            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                            tL_messages_messages.messages.add(messageObject.messageOwner);
                                            MessagesStorage.getInstance(i12).putMessages((TLRPC.messages_Messages) tL_messages_messages, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                                            break;
                                        }
                                    } else {
                                        j4 j4Var = p3VarArr[i10].c;
                                        if (j4Var.B == webPage2 && (K = l4Var.r0[i10].b.K(j4Var.h() - 1)) != null) {
                                            l4Var.r0[i10].c.y(K);
                                        }
                                        i10++;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject3;
                    if (tL_webPage.cached_page != null) {
                        if (!l4Var.a0.isEmpty() && l4Var.a0.get(0) == webPage2) {
                            if (messageObject != null) {
                                messageObject.messageOwner.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                tL_messages_messages2.messages.add(messageObject.messageOwner);
                                MessagesStorage.getInstance(i12).putMessages((TLRPC.messages_Messages) tL_messages_messages2, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                            }
                            if (z10) {
                                l4Var.a0.add(tL_webPage);
                            } else {
                                l4Var.a0.set(0, tL_webPage);
                            }
                            if (l4Var.a0.size() == 1) {
                                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.id).commit();
                                l4Var.e0(z10 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    l4Var.V(str, false);
                                }
                            }
                        }
                        h hVar = new h(1);
                        hVar.k(tL_webPage, tL_webPage.id);
                        MessagesStorage.getInstance(i12).putWebPages(hVar);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ d(l4 l4Var, TLObject tLObject, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z4, String str) {
        this.e = l4Var;
        this.b = tLObject;
        this.c = i10;
        this.f = webPage;
        this.h = messageObject;
        this.d = z4;
        this.n = str;
    }
}
