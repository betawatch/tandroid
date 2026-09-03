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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z60 b;
    public final /* synthetic */ String c;

    public /* synthetic */ y60(z60 z60Var, String str, int i10) {
        this.a = i10;
        this.b = z60Var;
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
                z60 z60Var = this.b;
                String str2 = this.c;
                z60Var.getClass();
                AndroidUtilities.runOnUIThread(new y60(z60Var, str2, 1));
                break;
            case 1:
                z60 z60Var2 = this.b;
                String str3 = this.c;
                tf.j1 j1Var = z60Var2.e;
                org.telegram.ui.hu huVar = z60Var2.n.j0;
                j1Var.g(str3, true, huVar != null, true, huVar != null, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                y60 y60Var = new y60(z60Var2, str3, 2);
                z60Var2.h = y60Var;
                dispatchQueue.postRunnable(y60Var);
                break;
            default:
                z60 z60Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList2 = z60Var3.n.b0;
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
                        boolean z4 = tLObject instanceof TLRPC.User;
                        if (z4) {
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
                        boolean z10 = false;
                        while (true) {
                            if (i10 < i11) {
                                String str5 = strArr[i10];
                                ?? r72 = (str.startsWith(str5) || org.telegram.messenger.y3.w(" ", str5, str) || (translitString2 != null && (translitString2.startsWith(str5) || org.telegram.messenger.y3.w(" ", str5, translitString2)))) ? 1 : (publicUsername == null || !publicUsername.startsWith(str5)) ? z10 : 2;
                                if (r72 != 0) {
                                    arrayList = arrayList2;
                                    if (r72 != 1) {
                                        obj = null;
                                        arrayList4.add(AndroidUtilities.generateSearchName(vh.w2.e("@", publicUsername), null, "@" + str5));
                                    } else if (z4) {
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
                                    z10 = r72;
                                }
                            } else {
                                arrayList = arrayList2;
                            }
                        }
                        i12++;
                        arrayList2 = arrayList;
                        i10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new gp(z60Var3, arrayList3, arrayList4, 8));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new gp(z60Var3, new ArrayList(), new ArrayList(), 8));
                    break;
                }
                break;
        }
    }
}
