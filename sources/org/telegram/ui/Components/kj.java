package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kj implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ kj(org.telegram.ui.Cells.e3 e3Var, qh.d1 d1Var, int i9, org.telegram.ui.Cells.n9 n9Var, qh.g0 g0Var, int i10) {
        this.e = e3Var;
        this.f = d1Var;
        this.b = i9;
        this.c = n9Var;
        this.h = g0Var;
        this.d = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v44 */
    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        ?? r12;
        String publicUsername;
        int i10;
        int i11 = this.a;
        Object obj = this.h;
        Object obj2 = this.c;
        int i12 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i11) {
            case 0:
                lj ljVar = (lj) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                ljVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i13 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i13];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    lj ljVar2 = ljVar;
                    ArrayList arrayList5 = new ArrayList();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int i14 = 0;
                    while (i14 < arrayList2.size()) {
                        ContactsController.Contact contact = (ContactsController.Contact) arrayList2.get(i14);
                        String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        lj ljVar3 = ljVar2;
                        TLRPC.User user = contact.user;
                        if (user != null) {
                            arrayList = arrayList2;
                            str = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                            str2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        } else {
                            arrayList = arrayList2;
                            str = null;
                            str2 = null;
                        }
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int i15 = i12;
                        int i16 = 0;
                        boolean z10 = false;
                        while (i16 < i13) {
                            int i17 = i16;
                            String str4 = strArr[i17];
                            if ((str == null || !(str.startsWith(str4) || org.telegram.messenger.l0.w(" ", str4, str))) && (str2 == null || !(str2.startsWith(str4) || org.telegram.messenger.l0.w(" ", str4, str2)))) {
                                str3 = str;
                                TLRPC.User user2 = contact.user;
                                r12 = (user2 == null || (publicUsername = UserObject.getPublicUsername(user2)) == null || !publicUsername.startsWith(str4)) ? (lowerCase2.startsWith(str4) || org.telegram.messenger.l0.w(" ", str4, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str4) || org.telegram.messenger.l0.w(" ", str4, translitString2)))) ? 3 : z10 : 2;
                            } else {
                                str3 = str;
                                r12 = 1;
                            }
                            String str5 = lowerCase2;
                            if (r12 == 0 || (contact.phones.isEmpty() && contact.shortPhones.isEmpty())) {
                                i16 = i17 + 1;
                                lowerCase2 = str5;
                                z10 = r12;
                                str = str3;
                            } else {
                                if (r12 == 3) {
                                    arrayList5.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str4));
                                } else if (r12 == 1) {
                                    TLRPC.User user3 = contact.user;
                                    arrayList5.add(AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, str4));
                                } else {
                                    arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(contact.user), null, "@" + str4));
                                }
                                TLRPC.User user4 = contact.user;
                                if (user4 != null) {
                                    longSparseIntArray.put(user4.id, 1);
                                }
                                arrayList4.add(contact);
                                i14++;
                                ljVar2 = ljVar3;
                                arrayList2 = arrayList;
                                i12 = i15;
                            }
                        }
                        i14++;
                        ljVar2 = ljVar3;
                        arrayList2 = arrayList;
                        i12 = i15;
                    }
                    lj ljVar4 = ljVar2;
                    int i18 = i12;
                    int i19 = 0;
                    while (i19 < arrayList3.size()) {
                        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList3.get(i19);
                        if (longSparseIntArray.indexOfKey(tL_contact.user_id) < 0) {
                            TLRPC.User user5 = MessagesController.getInstance(i18).getUser(Long.valueOf(tL_contact.user_id));
                            String lowerCase3 = ContactsController.formatName(user5.first_name, user5.last_name).toLowerCase();
                            String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                            if (lowerCase3.equals(translitString3)) {
                                translitString3 = null;
                            }
                            char c10 = 0;
                            int i20 = 0;
                            while (i20 < i13) {
                                String str6 = strArr[i20];
                                if (lowerCase3.startsWith(str6) || org.telegram.messenger.l0.w(" ", str6, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str6) || org.telegram.messenger.l0.w(" ", str6, translitString3)))) {
                                    i9 = i19;
                                    c10 = 1;
                                } else {
                                    i9 = i19;
                                    String publicUsername2 = UserObject.getPublicUsername(user5);
                                    if (publicUsername2 != null && publicUsername2.startsWith(str6)) {
                                        c10 = 2;
                                    }
                                }
                                if (c10 == 0 || user5.phone == null) {
                                    i20++;
                                    i19 = i9;
                                } else {
                                    if (c10 == 1) {
                                        arrayList5.add(AndroidUtilities.generateSearchName(user5.first_name, user5.last_name, str6));
                                    } else {
                                        arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user5), null, "@" + str6));
                                    }
                                    arrayList4.add(user5);
                                    i19 = i9 + 1;
                                }
                            }
                        }
                        i9 = i19;
                        i19 = i9 + 1;
                    }
                    AndroidUtilities.runOnUIThread(new c3.d(ljVar4, this.d, arrayList4, arrayList5, 15));
                    break;
                } else {
                    ljVar.h = -1;
                    AndroidUtilities.runOnUIThread(new c3.d(ljVar, ljVar.h, new ArrayList(), new ArrayList(), 15));
                    break;
                }
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.m1;
                ki kiVar = chatAttachAlertPhotoLayout.b;
                if (!kiVar.B || kiVar.C) {
                    i10 = i12;
                } else {
                    PhotoViewer.t1().K2(null, o2Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.h = 0;
                    t12.n = false;
                    i10 = 3;
                }
                PhotoViewer.t1().f2(arrayList6, this.d, kiVar.D ? 13 : i10, false, chatAttachAlertPhotoLayout.d1, kiVar.D ? null : qnVar);
                PhotoViewer.t1().x2(kiVar.M);
                if (kiVar.B && !kiVar.C) {
                    PhotoViewer.t1().K = false;
                } else if (kiVar.M0 != 0) {
                    PhotoViewer.t1().K = true;
                    PhotoViewer.t1().L = kiVar.N0 != null;
                }
                if (kiVar.C) {
                    PhotoViewer.t1().X0(null, null, false, kiVar.F);
                }
                if (ChatAttachAlertPhotoLayout.S()) {
                    PhotoViewer t13 = PhotoViewer.t1();
                    Editable text = kiVar.m1().getText();
                    t13.l7 = true;
                    t13.m7 = text;
                    t13.A2(null, text, false, false);
                    t13.t3(null);
                    break;
                }
                break;
            default:
                qh.d1 d1Var = (qh.d1) obj3;
                org.telegram.ui.Cells.n9 n9Var = (org.telegram.ui.Cells.n9) obj2;
                qh.g0 g0Var = (qh.g0) obj;
                qh.h0 h0Var = (qh.h0) ((org.telegram.ui.Cells.e3) obj4).c;
                if (d1Var.length() >= i12 && d1Var.getSelectionStart() != d1Var.getSelectionEnd() && n9Var.k0(g0Var.H(), 0, this.d, i12)) {
                    h0Var.d = true;
                    d1Var.setSelection(i12);
                    h0Var.d = false;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ kj(lj ljVar, String str, ArrayList arrayList, ArrayList arrayList2, int i9, int i10) {
        this.e = ljVar;
        this.f = str;
        this.c = arrayList;
        this.h = arrayList2;
        this.b = i9;
        this.d = i10;
    }

    public /* synthetic */ kj(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i9, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, int i10, org.telegram.ui.qn qnVar) {
        this.e = chatAttachAlertPhotoLayout;
        this.b = i9;
        this.f = o2Var;
        this.c = arrayList;
        this.d = i10;
        this.h = qnVar;
    }
}
