package org.telegram.ui.Components;

import android.text.Editable;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nj implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ nj(oc.i iVar, th.d1 d1Var, int i10, org.telegram.ui.Cells.k9 k9Var, th.g0 g0Var, int i11) {
        this.e = iVar;
        this.f = d1Var;
        this.b = i10;
        this.c = k9Var;
        this.h = g0Var;
        this.d = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v44 */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        ?? r12;
        String publicUsername;
        int i11;
        int i12 = this.a;
        Object obj = this.h;
        Object obj2 = this.c;
        int i13 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i12) {
            case 0:
                oj ojVar = (oj) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                ojVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i14 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i14];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    oj ojVar2 = ojVar;
                    ArrayList arrayList5 = new ArrayList();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int i15 = 0;
                    while (i15 < arrayList2.size()) {
                        ContactsController.Contact contact = (ContactsController.Contact) arrayList2.get(i15);
                        String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        oj ojVar3 = ojVar2;
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
                        int i16 = i13;
                        int i17 = 0;
                        boolean z10 = false;
                        while (i17 < i14) {
                            int i18 = i17;
                            String str4 = strArr[i18];
                            if ((str == null || !(str.startsWith(str4) || org.telegram.messenger.x3.w(" ", str4, str))) && (str2 == null || !(str2.startsWith(str4) || org.telegram.messenger.x3.w(" ", str4, str2)))) {
                                str3 = str;
                                TLRPC.User user2 = contact.user;
                                r12 = (user2 == null || (publicUsername = UserObject.getPublicUsername(user2)) == null || !publicUsername.startsWith(str4)) ? (lowerCase2.startsWith(str4) || org.telegram.messenger.x3.w(" ", str4, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str4) || org.telegram.messenger.x3.w(" ", str4, translitString2)))) ? 3 : z10 : 2;
                            } else {
                                str3 = str;
                                r12 = 1;
                            }
                            String str5 = lowerCase2;
                            if (r12 == 0 || (contact.phones.isEmpty() && contact.shortPhones.isEmpty())) {
                                i17 = i18 + 1;
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
                                i15++;
                                ojVar2 = ojVar3;
                                arrayList2 = arrayList;
                                i13 = i16;
                            }
                        }
                        i15++;
                        ojVar2 = ojVar3;
                        arrayList2 = arrayList;
                        i13 = i16;
                    }
                    oj ojVar4 = ojVar2;
                    int i19 = i13;
                    int i20 = 0;
                    while (i20 < arrayList3.size()) {
                        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList3.get(i20);
                        if (longSparseIntArray.indexOfKey(tL_contact.user_id) < 0) {
                            TLRPC.User user5 = MessagesController.getInstance(i19).getUser(Long.valueOf(tL_contact.user_id));
                            String lowerCase3 = ContactsController.formatName(user5.first_name, user5.last_name).toLowerCase();
                            String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                            if (lowerCase3.equals(translitString3)) {
                                translitString3 = null;
                            }
                            char c3 = 0;
                            int i21 = 0;
                            while (i21 < i14) {
                                String str6 = strArr[i21];
                                if (lowerCase3.startsWith(str6) || org.telegram.messenger.x3.w(" ", str6, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str6) || org.telegram.messenger.x3.w(" ", str6, translitString3)))) {
                                    i10 = i20;
                                    c3 = 1;
                                } else {
                                    i10 = i20;
                                    String publicUsername2 = UserObject.getPublicUsername(user5);
                                    if (publicUsername2 != null && publicUsername2.startsWith(str6)) {
                                        c3 = 2;
                                    }
                                }
                                if (c3 == 0 || user5.phone == null) {
                                    i21++;
                                    i20 = i10;
                                } else {
                                    if (c3 == 1) {
                                        arrayList5.add(AndroidUtilities.generateSearchName(user5.first_name, user5.last_name, str6));
                                    } else {
                                        arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user5), null, "@" + str6));
                                    }
                                    arrayList4.add(user5);
                                    i20 = i10 + 1;
                                }
                            }
                        }
                        i10 = i20;
                        i20 = i10 + 1;
                    }
                    AndroidUtilities.runOnUIThread(new ag.z1((Object) ojVar4, this.d, arrayList4, (Serializable) arrayList5, 14));
                    break;
                } else {
                    ojVar.h = -1;
                    AndroidUtilities.runOnUIThread(new ag.z1((Object) ojVar, ojVar.h, new ArrayList(), (Serializable) new ArrayList(), 14));
                    break;
                }
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.m1;
                ni niVar = chatAttachAlertPhotoLayout.b;
                if (!niVar.B || niVar.C) {
                    i11 = i13;
                } else {
                    PhotoViewer.t1().K2(null, o2Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.h = 0;
                    t12.n = false;
                    i11 = 3;
                }
                PhotoViewer.t1().f2(arrayList6, this.d, niVar.D ? 13 : i11, false, chatAttachAlertPhotoLayout.d1, niVar.D ? null : tnVar);
                PhotoViewer.t1().x2(niVar.M);
                if (niVar.B && !niVar.C) {
                    PhotoViewer.t1().K = false;
                } else if (niVar.M0 != 0) {
                    PhotoViewer.t1().K = true;
                    PhotoViewer.t1().L = niVar.N0 != null;
                }
                if (niVar.C) {
                    PhotoViewer.t1().X0(null, null, false, niVar.F);
                }
                if (ChatAttachAlertPhotoLayout.T()) {
                    PhotoViewer t13 = PhotoViewer.t1();
                    Editable text = niVar.m1().getText();
                    t13.l7 = true;
                    t13.m7 = text;
                    t13.A2(null, text, false, false);
                    t13.t3(null);
                    break;
                }
                break;
            default:
                th.d1 d1Var = (th.d1) obj3;
                org.telegram.ui.Cells.k9 k9Var = (org.telegram.ui.Cells.k9) obj2;
                th.g0 g0Var = (th.g0) obj;
                th.h0 h0Var = (th.h0) ((oc.i) obj4).c;
                if (d1Var.length() >= i13 && d1Var.getSelectionStart() != d1Var.getSelectionEnd() && k9Var.k0(g0Var.D(), 0, this.d, i13)) {
                    h0Var.d = true;
                    d1Var.setSelection(i13);
                    h0Var.d = false;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ nj(oj ojVar, String str, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.e = ojVar;
        this.f = str;
        this.c = arrayList;
        this.h = arrayList2;
        this.b = i10;
        this.d = i11;
    }

    public /* synthetic */ nj(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, int i11, org.telegram.ui.tn tnVar) {
        this.e = chatAttachAlertPhotoLayout;
        this.b = i10;
        this.f = o2Var;
        this.c = arrayList;
        this.d = i11;
        this.h = tnVar;
    }
}
