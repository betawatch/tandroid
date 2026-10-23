package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class j60 implements Comparator {
    public static String a(TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.User)) {
            return tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "";
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        return ContactsController.formatName(user.first_name, user.last_name);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return a((TLObject) obj).compareTo(a((TLObject) obj2));
    }
}
