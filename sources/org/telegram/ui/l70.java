package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m70 b;
    public final /* synthetic */ String c;

    public /* synthetic */ l70(m70 m70Var, String str, int i10) {
        this.a = i10;
        this.b = m70Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.searchQueue.postRunnable(new l70(this.b, this.c, 1));
                break;
            default:
                m70 m70Var = this.b;
                String str = this.c;
                n70 n70Var = m70Var.b;
                String lowerCase = str.trim().toLowerCase();
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
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = 0;
                    while (i12 < n70Var.n.w.size()) {
                        ContactsController.Contact contact = (ContactsController.Contact) n70Var.n.w.get(i12);
                        String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int i13 = i10;
                        int i14 = i13;
                        while (true) {
                            if (i13 < i11) {
                                String str2 = strArr[i13];
                                if (lowerCase2.startsWith(str2) || org.telegram.messenger.g0.w(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || org.telegram.messenger.g0.w(" ", str2, translitString2)))) {
                                    i14 = 1;
                                }
                                if (i14 != 0) {
                                    arrayList2.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str2));
                                    arrayList.add(contact);
                                } else {
                                    i13++;
                                }
                            }
                        }
                        i12++;
                        i10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new jq(n70Var, arrayList, arrayList2, 12));
                    break;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    n70Var.getClass();
                    AndroidUtilities.runOnUIThread(new jq(n70Var, arrayList3, arrayList4, 12));
                    break;
                }
                break;
        }
    }
}
