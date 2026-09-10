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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class b70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c70 b;
    public final /* synthetic */ String c;

    public /* synthetic */ b70(c70 c70Var, String str, int i10) {
        this.a = i10;
        this.b = c70Var;
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
                c70 c70Var = this.b;
                String str2 = this.c;
                c70Var.getClass();
                AndroidUtilities.runOnUIThread(new b70(c70Var, str2, 1));
                break;
            case 1:
                c70 c70Var2 = this.b;
                String str3 = this.c;
                fg.d2 d2Var = c70Var2.f;
                e70 e70Var = c70Var2.I;
                d2Var.g(str3, true, e70Var.O || e70Var.P, true, false, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                b70 b70Var = new b70(c70Var2, str3, 2);
                c70Var2.h = b70Var;
                dispatchQueue.postRunnable(b70Var);
                break;
            default:
                c70 c70Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList2 = c70Var3.r;
                String lowerCase = str4.trim().toLowerCase();
                if (!lowerCase.isEmpty()) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.isEmpty()) {
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
                            if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                str = chat.title;
                                publicUsername = ChatObject.getPublicUsername(chat);
                            }
                            arrayList = arrayList2;
                            i12++;
                            arrayList2 = arrayList;
                            i10 = 0;
                        }
                        String translitString2 = LocaleController.getInstance().getTranslitString(str);
                        if (str.equals(translitString2)) {
                            translitString2 = null;
                        }
                        boolean z11 = false;
                        while (i10 < i11) {
                            String str5 = strArr[i10];
                            ?? r72 = (str.startsWith(str5) || org.telegram.messenger.a2.w(" ", str5, str) || (translitString2 != null && (translitString2.startsWith(str5) || org.telegram.messenger.a2.w(" ", str5, translitString2)))) ? 1 : (publicUsername == null || !publicUsername.startsWith(str5)) ? z11 : 2;
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
                                    arrayList4.add(AndroidUtilities.generateSearchName(org.telegram.ui.Cells.r6.i("@", publicUsername), null, "@" + str5));
                                }
                                arrayList3.add(tLObject);
                                i12++;
                                arrayList2 = arrayList;
                                i10 = 0;
                            } else {
                                i10++;
                                arrayList2 = arrayList2;
                                z11 = r72;
                            }
                        }
                        arrayList = arrayList2;
                        i12++;
                        arrayList2 = arrayList;
                        i10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new zq(c70Var3, arrayList3, arrayList4, 10));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new zq(c70Var3, new ArrayList(), new ArrayList(), 10));
                    break;
                }
                break;
        }
    }
}
