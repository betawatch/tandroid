package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l70 b;
    public final /* synthetic */ String c;

    public /* synthetic */ k70(l70 l70Var, String str, int i9) {
        this.a = i9;
        this.b = l70Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.searchQueue.postRunnable(new k70(this.b, this.c, 1));
                break;
            default:
                l70 l70Var = this.b;
                String str = this.c;
                m70 m70Var = l70Var.b;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    m70Var.getClass();
                    AndroidUtilities.runOnUIThread(new jq(m70Var, arrayList, arrayList2, 12));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.isEmpty()) {
                        translitString = null;
                    }
                    int i9 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i9];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    for (int i10 = 0; i10 < m70Var.n.w.size(); i10++) {
                        ContactsController.Contact contact = (ContactsController.Contact) m70Var.n.w.get(i10);
                        String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int i11 = 0;
                        boolean z10 = false;
                        while (true) {
                            if (i11 < i9) {
                                String str2 = strArr[i11];
                                if (lowerCase2.startsWith(str2) || org.telegram.messenger.l0.w(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || org.telegram.messenger.l0.w(" ", str2, translitString2)))) {
                                    z10 = true;
                                }
                                if (z10) {
                                    arrayList4.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str2));
                                    arrayList3.add(contact);
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new jq(m70Var, arrayList3, arrayList4, 12));
                    break;
                }
                break;
        }
    }
}
