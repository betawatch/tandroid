package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String publicUsername;
        ArrayList arrayList;
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
                pf.j1 j1Var = l60Var2.e;
                org.telegram.ui.zt ztVar = l60Var2.n.i0;
                j1Var.g(str3, true, ztVar != null, true, ztVar != null, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                k60 k60Var = new k60(l60Var2, str3, 2);
                l60Var2.h = k60Var;
                dispatchQueue.postRunnable(k60Var);
                break;
            default:
                l60 l60Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList2 = l60Var3.n.a0;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i10 = 0;
                    int i11 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i11];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i12 = 0;
                    while (i12 < arrayList2.size()) {
                        TLObject tLObject = (TLObject) arrayList2.get(i12);
                        boolean z10 = tLObject instanceof TLRPC.User;
                        if (z10) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            str = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                            publicUsername = UserObject.getPublicUsername(user);
                        } else {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            str = chat.title;
                            publicUsername = ChatObject.getPublicUsername(chat);
                        }
                        String translitString2 = LocaleController.getInstance().getTranslitString(str);
                        if (str.equals(translitString2)) {
                            translitString2 = null;
                        }
                        boolean z11 = false;
                        while (true) {
                            if (i10 < i11) {
                                String str5 = strArr[i10];
                                ?? r72 = (str.startsWith(str5) || org.telegram.messenger.y1.x(" ", str5, str) || (translitString2 != null && (translitString2.startsWith(str5) || org.telegram.messenger.y1.x(" ", str5, translitString2)))) ? 1 : (publicUsername == null || !publicUsername.startsWith(str5)) ? z11 : 2;
                                if (r72 != 0) {
                                    arrayList = arrayList2;
                                    if (r72 != 1) {
                                        obj = null;
                                        arrayList4.add(AndroidUtilities.generateSearchName(s3.c.e("@", publicUsername), null, "@" + str5));
                                    } else if (z10) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str5));
                                        obj = null;
                                    } else {
                                        obj = null;
                                        arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                    arrayList3.add(tLObject);
                                } else {
                                    i10++;
                                    arrayList2 = arrayList2;
                                    z11 = r72;
                                }
                            } else {
                                arrayList = arrayList2;
                            }
                        }
                        i12++;
                        arrayList2 = arrayList;
                        i10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3(l60Var3, arrayList3, arrayList4, 20));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3(l60Var3, new ArrayList(), new ArrayList(), 20));
                    break;
                }
                break;
        }
    }
}
