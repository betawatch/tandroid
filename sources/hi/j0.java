package hi;

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
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ j0(m4.h1 h1Var, m4.r rVar, int i10, m4.b0 b0Var, int i11, m4.g1 g1Var) {
        this.d = h1Var;
        this.e = rVar;
        this.b = i10;
        this.f = b0Var;
        this.c = i11;
        this.h = g1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v53 */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        ?? r22;
        String publicUsername;
        int i11;
        int i12 = this.a;
        final int i13 = this.c;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        int i14 = this.b;
        Object obj4 = this.d;
        switch (i12) {
            case 0:
                k1 k1Var = (k1) obj3;
                s9 s9Var = (s9) obj2;
                l0 l0Var = (l0) obj;
                m0 m0Var = (m0) ((n4.y) obj4).c;
                if (k1Var.length() >= i14 && k1Var.getSelectionStart() != k1Var.getSelectionEnd() && s9Var.k0(l0Var.M(), 0, i13, i14)) {
                    m0Var.d = true;
                    k1Var.setSelection(i14);
                    m0Var.d = false;
                    break;
                }
                break;
            case 1:
                final m4.r rVar = (m4.r) obj3;
                final m4.b0 b0Var = (m4.b0) obj2;
                final m4.g1 g1Var = (m4.g1) obj;
                ki.f fVar = ((m4.h1) obj4).b;
                if (!fVar.A(rVar, i14)) {
                    m4.h1.O0(b0Var, rVar, i13, new m4.r1(-4));
                    break;
                } else {
                    na.d dVar = b0Var.e;
                    b0Var.s(rVar);
                    dVar.getClass();
                    if (i14 != 27) {
                        fVar.d(rVar, i14, new m4.d() { // from class: m4.b1
                            @Override // m4.d
                            public final i9.w run() {
                                return (i9.w) g1.this.i(b0Var, rVar, i13);
                            }
                        });
                        break;
                    } else {
                        g1Var.i(b0Var, rVar, i13);
                        fVar.d(rVar, i14, new m4.a1());
                        break;
                    }
                }
            case 2:
                xj xjVar = (xj) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                xjVar.getClass();
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i15 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i15];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    xj xjVar2 = xjVar;
                    ArrayList arrayList5 = new ArrayList();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int i16 = 0;
                    while (i16 < arrayList2.size()) {
                        ContactsController.Contact contact = (ContactsController.Contact) arrayList2.get(i16);
                        String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        xj xjVar3 = xjVar2;
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
                        String[] strArr2 = strArr;
                        int i17 = 0;
                        boolean z10 = false;
                        while (i17 < i15) {
                            int i18 = i17;
                            String str4 = strArr2[i18];
                            if ((str == null || !(str.startsWith(str4) || org.telegram.messenger.a2.w(" ", str4, str))) && (str2 == null || !(str2.startsWith(str4) || org.telegram.messenger.a2.w(" ", str4, str2)))) {
                                str3 = str;
                                TLRPC.User user2 = contact.user;
                                r22 = (user2 == null || (publicUsername = UserObject.getPublicUsername(user2)) == null || !publicUsername.startsWith(str4)) ? (lowerCase2.startsWith(str4) || org.telegram.messenger.a2.w(" ", str4, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str4) || org.telegram.messenger.a2.w(" ", str4, translitString2)))) ? 3 : z10 : 2;
                            } else {
                                str3 = str;
                                r22 = 1;
                            }
                            String str5 = lowerCase2;
                            if (r22 == 0 || (contact.phones.isEmpty() && contact.shortPhones.isEmpty())) {
                                i17 = i18 + 1;
                                lowerCase2 = str5;
                                z10 = r22;
                                str = str3;
                            } else {
                                if (r22 == 3) {
                                    arrayList5.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str4));
                                } else if (r22 == 1) {
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
                                i16++;
                                xjVar2 = xjVar3;
                                arrayList2 = arrayList;
                                strArr = strArr2;
                            }
                        }
                        i16++;
                        xjVar2 = xjVar3;
                        arrayList2 = arrayList;
                        strArr = strArr2;
                    }
                    xj xjVar4 = xjVar2;
                    String[] strArr3 = strArr;
                    int i19 = 0;
                    while (i19 < arrayList3.size()) {
                        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList3.get(i19);
                        if (longSparseIntArray.indexOfKey(tL_contact.user_id) < 0) {
                            TLRPC.User user5 = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_contact.user_id));
                            String lowerCase3 = ContactsController.formatName(user5.first_name, user5.last_name).toLowerCase();
                            String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                            if (lowerCase3.equals(translitString3)) {
                                translitString3 = null;
                            }
                            char c10 = 0;
                            int i20 = 0;
                            while (i20 < i15) {
                                String str6 = strArr3[i20];
                                if (lowerCase3.startsWith(str6) || org.telegram.messenger.a2.w(" ", str6, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str6) || org.telegram.messenger.a2.w(" ", str6, translitString3)))) {
                                    i10 = i19;
                                    c10 = 1;
                                } else {
                                    i10 = i19;
                                    String publicUsername2 = UserObject.getPublicUsername(user5);
                                    if (publicUsername2 != null && publicUsername2.startsWith(str6)) {
                                        c10 = 2;
                                    }
                                }
                                if (c10 == 0 || user5.phone == null) {
                                    i20++;
                                    i19 = i10;
                                } else {
                                    if (c10 == 1) {
                                        arrayList5.add(AndroidUtilities.generateSearchName(user5.first_name, user5.last_name, str6));
                                    } else {
                                        arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user5), null, "@" + str6));
                                    }
                                    arrayList4.add(user5);
                                    i19 = i10 + 1;
                                }
                            }
                        }
                        i10 = i19;
                        i19 = i10 + 1;
                    }
                    AndroidUtilities.runOnUIThread(new di.q((Object) xjVar4, this.c, arrayList4, (Serializable) arrayList5, 15));
                    break;
                } else {
                    xjVar.h = -1;
                    AndroidUtilities.runOnUIThread(new di.q((Object) xjVar, xjVar.h, new ArrayList(), (Serializable) new ArrayList(), 15));
                    break;
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                eo eoVar = (eo) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                yi yiVar = chatAttachAlertPhotoLayout.b;
                if (!yiVar.F || yiVar.G) {
                    i11 = i14;
                } else {
                    PhotoViewer.t1().K2(null, p2Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.h = 0;
                    t12.n = false;
                    i11 = 3;
                }
                PhotoViewer.t1().f2(arrayList6, this.c, yiVar.H ? 13 : i11, false, chatAttachAlertPhotoLayout.h1, yiVar.H ? null : eoVar);
                PhotoViewer.t1().x2(yiVar.Q);
                if (yiVar.F && !yiVar.G) {
                    PhotoViewer.t1().O = false;
                } else if (yiVar.Q0 != 0) {
                    PhotoViewer.t1().O = true;
                    PhotoViewer.t1().P = yiVar.R0 != null;
                }
                if (yiVar.G) {
                    PhotoViewer.t1().X0(null, null, false, yiVar.J);
                }
                if (ChatAttachAlertPhotoLayout.T()) {
                    PhotoViewer t13 = PhotoViewer.t1();
                    Editable text = yiVar.m1().getText();
                    t13.p7 = true;
                    t13.q7 = text;
                    t13.A2(null, text, false, false);
                    t13.t3(null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j0(n4.y yVar, k1 k1Var, int i10, s9 s9Var, l0 l0Var, int i11) {
        this.d = yVar;
        this.e = k1Var;
        this.b = i10;
        this.f = s9Var;
        this.h = l0Var;
        this.c = i11;
    }

    public /* synthetic */ j0(xj xjVar, String str, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.d = xjVar;
        this.e = str;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ j0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList, int i11, eo eoVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.b = i10;
        this.e = p2Var;
        this.f = arrayList;
        this.c = i11;
        this.h = eoVar;
    }
}
