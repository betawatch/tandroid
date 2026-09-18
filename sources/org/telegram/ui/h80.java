package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i80 b;
    public final /* synthetic */ String c;

    public /* synthetic */ h80(i80 i80Var, String str, int i10) {
        this.a = i10;
        this.b = i80Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.searchQueue.postRunnable(new h80(this.b, this.c, 1));
                break;
            default:
                i80 i80Var = this.b;
                String str = this.c;
                j80 j80Var = i80Var.b;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    j80Var.getClass();
                    AndroidUtilities.runOnUIThread(new xq(j80Var, arrayList, arrayList2, 12));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.isEmpty()) {
                        translitString = null;
                    }
                    int i10 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i10];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    for (int i11 = 0; i11 < j80Var.n.w.size(); i11++) {
                        ContactsController.Contact contact = (ContactsController.Contact) j80Var.n.w.get(i11);
                        String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int i12 = 0;
                        boolean z10 = false;
                        while (true) {
                            if (i12 < i10) {
                                String str2 = strArr[i12];
                                if (lowerCase2.startsWith(str2) || org.telegram.messenger.w1.w(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || org.telegram.messenger.w1.w(" ", str2, translitString2)))) {
                                    z10 = true;
                                }
                                if (z10) {
                                    arrayList4.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str2));
                                    arrayList3.add(contact);
                                } else {
                                    i12++;
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new xq(j80Var, arrayList3, arrayList4, 12));
                    break;
                }
                break;
        }
    }
}
