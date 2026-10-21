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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r70 b;
    public final /* synthetic */ String c;

    public /* synthetic */ q70(r70 r70Var, String str, int i10) {
        this.a = i10;
        this.b = r70Var;
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
                r70 r70Var = this.b;
                String str2 = this.c;
                r70Var.getClass();
                AndroidUtilities.runOnUIThread(new q70(r70Var, str2, 1));
                break;
            case 1:
                r70 r70Var2 = this.b;
                String str3 = this.c;
                hg.a2 a2Var = r70Var2.e;
                org.telegram.ui.ut utVar = r70Var2.n.m0;
                boolean z11 = false;
                boolean z12 = utVar != null;
                if (utVar != null) {
                    z11 = true;
                }
                a2Var.g(str3, true, z12, true, z11, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                q70 q70Var = new q70(r70Var2, str3, 2);
                r70Var2.h = q70Var;
                dispatchQueue.postRunnable(q70Var);
                break;
            default:
                r70 r70Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList2 = r70Var3.n.e0;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i11 = 0;
                    boolean z13 = true;
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
                        boolean z14 = tLObject instanceof TLRPC.User;
                        if (z14) {
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
                        int i14 = i11;
                        while (true) {
                            if (i11 < i12) {
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
                                    if (i10 != 1) {
                                        obj = null;
                                        arrayList4.add(AndroidUtilities.generateSearchName(r4.c.h("@", publicUsername), null, "@" + str5));
                                    } else if (z14) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str5));
                                        obj = null;
                                    } else {
                                        obj = null;
                                        arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                    arrayList3.add(tLObject);
                                } else {
                                    i11++;
                                    int i15 = i10;
                                    z13 = true;
                                    arrayList2 = arrayList2;
                                    i14 = i15;
                                }
                            } else {
                                arrayList = arrayList2;
                                z10 = z13;
                            }
                        }
                        i13++;
                        z13 = z10;
                        arrayList2 = arrayList;
                        i11 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new lg((Object) r70Var3, (Object) arrayList3, (Object) arrayList4, 12));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new lg((Object) r70Var3, (Object) new ArrayList(), (Object) new ArrayList(), 12));
                    break;
                }
                break;
        }
    }
}
