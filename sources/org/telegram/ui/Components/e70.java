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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class e70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f70 b;
    public final /* synthetic */ String c;

    public /* synthetic */ e70(f70 f70Var, String str, int i10) {
        this.a = i10;
        this.b = f70Var;
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
                f70 f70Var = this.b;
                String str2 = this.c;
                f70Var.getClass();
                AndroidUtilities.runOnUIThread(new e70(f70Var, str2, 1));
                break;
            case 1:
                f70 f70Var2 = this.b;
                String str3 = this.c;
                gg.c2 c2Var = f70Var2.e;
                org.telegram.ui.fu fuVar = f70Var2.n.m0;
                c2Var.g(str3, true, fuVar != null, true, fuVar != null, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                e70 e70Var = new e70(f70Var2, str3, 2);
                f70Var2.h = e70Var;
                dispatchQueue.postRunnable(e70Var);
                break;
            default:
                f70 f70Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList2 = f70Var3.n.e0;
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
                                ?? r72 = (str.startsWith(str5) || org.telegram.messenger.l0.v(" ", str5, str) || (translitString2 != null && (translitString2.startsWith(str5) || org.telegram.messenger.l0.v(" ", str5, translitString2)))) ? 1 : (publicUsername == null || !publicUsername.startsWith(str5)) ? z11 : 2;
                                if (r72 != 0) {
                                    arrayList = arrayList2;
                                    if (r72 != 1) {
                                        obj = null;
                                        arrayList4.add(AndroidUtilities.generateSearchName(v7.j0.g("@", publicUsername), null, "@" + str5));
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
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(f70Var3, arrayList3, arrayList4, 24));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(f70Var3, new ArrayList(), new ArrayList(), 24));
                    break;
                }
                break;
        }
    }
}
