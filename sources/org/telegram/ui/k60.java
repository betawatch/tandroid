package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l60 b;
    public final /* synthetic */ String c;

    public /* synthetic */ k60(l60 l60Var, String str, int i10) {
        this.a = i10;
        this.b = l60Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String publicUsername;
        ArrayList arrayList;
        boolean z10;
        int i10;
        Object obj;
        switch (this.a) {
            case 0:
                l60 l60Var = this.b;
                String str2 = this.c;
                l60Var.getClass();
                AndroidUtilities.runOnUIThread(new k60(l60Var, str2, 1));
                break;
            case 1:
                l60 l60Var2 = this.b;
                String str3 = this.c;
                hg.a2 a2Var = l60Var2.f;
                n60 n60Var = l60Var2.I;
                a2Var.g(str3, true, n60Var.O || n60Var.P, true, false, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                k60 k60Var = new k60(l60Var2, str3, 2);
                l60Var2.h = k60Var;
                dispatchQueue.postRunnable(k60Var);
                break;
            default:
                l60 l60Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList2 = l60Var3.r;
                String lowerCase = str4.trim().toLowerCase();
                if (!lowerCase.isEmpty()) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.isEmpty()) {
                        translitString = null;
                    }
                    int i11 = 0;
                    boolean z11 = true;
                    int i12 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i12];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i13 = 0;
                    while (i13 < arrayList2.size()) {
                        TLObject tLObject = (TLObject) arrayList2.get(i13);
                        boolean z12 = tLObject instanceof TLRPC.User;
                        if (z12) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            str = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                            publicUsername = UserObject.getPublicUsername(user);
                        } else {
                            if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                str = chat.title;
                                publicUsername = ChatObject.getPublicUsername(chat);
                            }
                            arrayList = arrayList2;
                            z10 = z11;
                            i13++;
                            z11 = z10;
                            arrayList2 = arrayList;
                            i11 = 0;
                        }
                        String translitString2 = LocaleController.getInstance().getTranslitString(str);
                        if (str.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int i14 = i11;
                        while (i11 < i12) {
                            String str5 = strArr[i11];
                            if (str.startsWith(str5) || org.telegram.messenger.g0.w(" ", str5, str) || (translitString2 != null && (translitString2.startsWith(str5) || org.telegram.messenger.g0.w(" ", str5, translitString2)))) {
                                i10 = 1;
                            } else {
                                if (publicUsername != null && publicUsername.startsWith(str5)) {
                                    i14 = 2;
                                }
                                i10 = i14;
                            }
                            if (i10 != 0) {
                                arrayList = arrayList2;
                                z10 = true;
                                if (i10 == 1) {
                                    if (z12) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str5));
                                    } else if (tLObject instanceof TLRPC.Chat) {
                                        obj = null;
                                        arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                    obj = null;
                                } else {
                                    obj = null;
                                    arrayList4.add(AndroidUtilities.generateSearchName(r4.c.h("@", publicUsername), null, "@" + str5));
                                }
                                arrayList3.add(tLObject);
                                i13++;
                                z11 = z10;
                                arrayList2 = arrayList;
                                i11 = 0;
                            } else {
                                i11++;
                                int i15 = i10;
                                z11 = true;
                                arrayList2 = arrayList2;
                                i14 = i15;
                            }
                        }
                        arrayList = arrayList2;
                        z10 = z11;
                        i13++;
                        z11 = z10;
                        arrayList2 = arrayList;
                        i11 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new lq(l60Var3, arrayList3, arrayList4, 10));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new lq(l60Var3, new ArrayList(), new ArrayList(), 10));
                    break;
                }
                break;
        }
    }
}
