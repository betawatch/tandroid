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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i60 b;
    public final /* synthetic */ String c;

    public /* synthetic */ h60(i60 i60Var, String str, int i9) {
        this.a = i9;
        this.b = i60Var;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String publicUsername;
        ArrayList arrayList;
        Object obj;
        switch (this.a) {
            case 0:
                i60 i60Var = this.b;
                String str2 = this.c;
                i60Var.getClass();
                AndroidUtilities.runOnUIThread(new h60(i60Var, str2, 1));
                break;
            case 1:
                i60 i60Var2 = this.b;
                String str3 = this.c;
                of.v1 v1Var = i60Var2.f;
                k60 k60Var = i60Var2.E;
                v1Var.g(str3, true, k60Var.K || k60Var.L, true, false, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                h60 h60Var = new h60(i60Var2, str3, 2);
                i60Var2.h = h60Var;
                dispatchQueue.postRunnable(h60Var);
                break;
            default:
                i60 i60Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList2 = i60Var3.r;
                String lowerCase = str4.trim().toLowerCase();
                if (!lowerCase.isEmpty()) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.isEmpty()) {
                        translitString = null;
                    }
                    int i9 = 0;
                    int i10 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i10];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i11 = 0;
                    while (i11 < arrayList2.size()) {
                        TLObject tLObject = (TLObject) arrayList2.get(i11);
                        boolean z10 = tLObject instanceof TLRPC.User;
                        if (z10) {
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
                            i11++;
                            arrayList2 = arrayList;
                            i9 = 0;
                        }
                        String translitString2 = LocaleController.getInstance().getTranslitString(str);
                        if (str.equals(translitString2)) {
                            translitString2 = null;
                        }
                        boolean z11 = false;
                        while (i9 < i10) {
                            String str5 = strArr[i9];
                            ?? r72 = (str.startsWith(str5) || org.telegram.messenger.l0.w(" ", str5, str) || (translitString2 != null && (translitString2.startsWith(str5) || org.telegram.messenger.l0.w(" ", str5, translitString2)))) ? 1 : (publicUsername == null || !publicUsername.startsWith(str5)) ? z11 : 2;
                            if (r72 != 0) {
                                arrayList = arrayList2;
                                if (r72 == 1) {
                                    if (z10) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str5));
                                    } else if (tLObject instanceof TLRPC.Chat) {
                                        obj = null;
                                        arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                    obj = null;
                                } else {
                                    obj = null;
                                    arrayList4.add(AndroidUtilities.generateSearchName(ta.b.d("@", publicUsername), null, "@" + str5));
                                }
                                arrayList3.add(tLObject);
                                i11++;
                                arrayList2 = arrayList;
                                i9 = 0;
                            } else {
                                i9++;
                                arrayList2 = arrayList2;
                                z11 = r72;
                            }
                        }
                        arrayList = arrayList2;
                        i11++;
                        arrayList2 = arrayList;
                        i9 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new jq(i60Var3, arrayList3, arrayList4, 10));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new jq(i60Var3, new ArrayList(), new ArrayList(), 10));
                    break;
                }
                break;
        }
    }
}
