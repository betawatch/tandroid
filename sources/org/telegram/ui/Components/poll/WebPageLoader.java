package org.telegram.ui.Components.poll;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* loaded from: classes5.dex */
public class WebPageLoader {
    private final int currentAccount;
    private final HashMap pages = new HashMap();
    private final HashMap callbacks = new HashMap();

    public WebPageLoader(int i) {
        this.currentAccount = i;
    }

    public boolean isLoading(String str) {
        return this.callbacks.containsKey(str);
    }

    public TLRPC.WebPage getWebPage(String str) {
        return (TLRPC.WebPage) this.pages.get(str);
    }

    public void get(final String str, Utilities.Callback2 callback2) {
        if (this.pages.containsKey(str)) {
            callback2.run((TLRPC.WebPage) this.pages.get(str), null);
            return;
        }
        boolean containsKey = this.callbacks.containsKey(str);
        ArrayList arrayList = (ArrayList) this.callbacks.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.callbacks.put(str, arrayList);
        }
        arrayList.add(callback2);
        if (containsKey) {
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(getwebpagepreview, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() { // from class: org.telegram.ui.Components.poll.WebPageLoader$$ExternalSyntheticLambda0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                WebPageLoader.this.lambda$get$0(str, (TL_account.webPagePreview) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$get$0(String str, TL_account.webPagePreview webpagepreview, TLRPC.TL_error tL_error) {
        TLRPC.WebPage webPage;
        ArrayList arrayList;
        if (webpagepreview != null) {
            MessagesController.getInstance(this.currentAccount).putUsers(webpagepreview.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(webpagepreview.chats, false);
            TLRPC.MessageMedia messageMedia = webpagepreview.media;
            if (messageMedia != null) {
                webPage = messageMedia.webpage;
                this.pages.put(str, webPage);
                arrayList = (ArrayList) this.callbacks.remove(str);
                if (arrayList == null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Utilities.Callback2) it.next()).run(webPage, tL_error);
                    }
                    return;
                }
                return;
            }
        }
        webPage = null;
        this.pages.put(str, webPage);
        arrayList = (ArrayList) this.callbacks.remove(str);
        if (arrayList == null) {
        }
    }

    public void apply(LongSparseArray longSparseArray) {
        TLRPC.WebPage webPage;
        for (Map.Entry entry : this.pages.entrySet()) {
            if (entry.getValue() != null && (webPage = (TLRPC.WebPage) longSparseArray.get(((TLRPC.WebPage) entry.getValue()).id)) != null) {
                entry.setValue(webPage);
            }
        }
    }
}
