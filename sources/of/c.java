package of;

import a0.i;
import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.g4;
import org.telegram.ui.i4;
import org.telegram.ui.m3;
import s4.c1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ c(e eVar, b2[] b2VarArr, TLObject tLObject, int i10, Uri uri, Context context, boolean z10) {
        this.e = eVar;
        this.f = b2VarArr;
        this.b = tLObject;
        this.c = i10;
        this.h = uri;
        this.n = context;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c1 K;
        int i10 = 0;
        switch (this.a) {
            case 0:
                e eVar = (e) this.e;
                b2[] b2VarArr = (b2[]) this.f;
                TLObject tLObject = this.b;
                int i11 = this.c;
                Uri uri = (Uri) this.h;
                Context context = (Context) this.n;
                boolean z10 = this.d;
                if (eVar != null) {
                    eVar.b();
                } else {
                    try {
                        b2VarArr[0].dismiss();
                    } catch (Throwable unused) {
                    }
                    b2VarArr[0] = null;
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
                f.p(context, uri, z10, false);
                break;
            default:
                i4 i4Var = (i4) this.e;
                TLObject tLObject2 = this.b;
                int i12 = this.c;
                TLRPC.WebPage webPage2 = (TLRPC.WebPage) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                boolean z11 = this.d;
                String str = (String) this.n;
                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_webPage;
                TLObject tLObject3 = tLObject2;
                if (z12) {
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
                                    m3[] m3VarArr = i4Var.u0;
                                    if (i10 >= m3VarArr.length) {
                                        if (messageObject != null) {
                                            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                            tL_messages_messages.messages.add(messageObject.messageOwner);
                                            MessagesStorage.getInstance(i12).putMessages((TLRPC.messages_Messages) tL_messages_messages, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                                            break;
                                        }
                                    } else {
                                        g4 g4Var = m3VarArr[i10].c;
                                        if (g4Var.E == webPage2 && (K = i4Var.u0[i10].b.K(g4Var.h() - 1)) != null) {
                                            i4Var.u0[i10].c.y(K);
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
                        if (!i4Var.d0.isEmpty() && i4Var.d0.get(0) == webPage2) {
                            if (messageObject != null) {
                                messageObject.messageOwner.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                tL_messages_messages2.messages.add(messageObject.messageOwner);
                                MessagesStorage.getInstance(i12).putMessages((TLRPC.messages_Messages) tL_messages_messages2, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                            }
                            if (z11) {
                                i4Var.d0.add(tL_webPage);
                            } else {
                                i4Var.d0.set(0, tL_webPage);
                            }
                            if (i4Var.d0.size() == 1) {
                                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.id).commit();
                                i4Var.e0(z11 ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    i4Var.V(str, false);
                                }
                            }
                        }
                        i iVar = new i(1);
                        iVar.k(tL_webPage, tL_webPage.id);
                        MessagesStorage.getInstance(i12).putWebPages(iVar);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ c(i4 i4Var, TLObject tLObject, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.e = i4Var;
        this.b = tLObject;
        this.c = i10;
        this.f = webPage;
        this.h = messageObject;
        this.d = z10;
        this.n = str;
    }
}
