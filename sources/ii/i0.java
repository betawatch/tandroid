package ii;

import ai.d9;
import android.text.Editable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.bi;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yj;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ i0(m4.b1 b1Var, m4.r rVar, int i10, m4.b0 b0Var, int i11, m4.a1 a1Var) {
        this.d = b1Var;
        this.e = rVar;
        this.b = i10;
        this.f = b0Var;
        this.c = i11;
        this.h = a1Var;
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
                i1 i1Var = (i1) obj3;
                o9 o9Var = (o9) obj2;
                k0 k0Var = (k0) obj;
                l0 l0Var = (l0) ((n4.x) obj4).c;
                if (i1Var.length() >= i14 && i1Var.getSelectionStart() != i1Var.getSelectionEnd() && o9Var.j0(k0Var.C(), 0, i13, i14)) {
                    l0Var.d = true;
                    i1Var.setSelection(i14);
                    l0Var.d = false;
                    break;
                }
                break;
            case 1:
                final m4.r rVar = (m4.r) obj3;
                final m4.b0 b0Var = (m4.b0) obj2;
                final m4.a1 a1Var = (m4.a1) obj;
                oi.f fVar = ((m4.b1) obj4).b;
                if (!fVar.B(rVar, i14)) {
                    m4.b1.N0(b0Var, rVar, i13, new m4.l1(-4));
                    break;
                } else {
                    na.d dVar = b0Var.e;
                    b0Var.s(rVar);
                    dVar.getClass();
                    if (i14 != 27) {
                        fVar.d(rVar, i14, new m4.d() { // from class: m4.w0
                            @Override // m4.d
                            public final i9.w run() {
                                return (i9.w) a1.this.h(b0Var, rVar, i13);
                            }
                        });
                        break;
                    } else {
                        a1Var.h(b0Var, rVar, i13);
                        fVar.d(rVar, i14, new m4.v0());
                        break;
                    }
                }
            case 2:
                yj yjVar = (yj) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                yjVar.getClass();
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
                    yj yjVar2 = yjVar;
                    ArrayList arrayList5 = new ArrayList();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int i16 = 0;
                    while (i16 < arrayList2.size()) {
                        ContactsController.Contact contact = (ContactsController.Contact) arrayList2.get(i16);
                        String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        yj yjVar3 = yjVar2;
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
                            if ((str == null || !(str.startsWith(str4) || bi.w(" ", str4, str))) && (str2 == null || !(str2.startsWith(str4) || bi.w(" ", str4, str2)))) {
                                str3 = str;
                                TLRPC.User user2 = contact.user;
                                r22 = (user2 == null || (publicUsername = UserObject.getPublicUsername(user2)) == null || !publicUsername.startsWith(str4)) ? (lowerCase2.startsWith(str4) || bi.w(" ", str4, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str4) || bi.w(" ", str4, translitString2)))) ? 3 : z10 : 2;
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
                                yjVar2 = yjVar3;
                                arrayList2 = arrayList;
                                strArr = strArr2;
                            }
                        }
                        i16++;
                        yjVar2 = yjVar3;
                        arrayList2 = arrayList;
                        strArr = strArr2;
                    }
                    yj yjVar4 = yjVar2;
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
                            boolean z11 = false;
                            int i20 = 0;
                            while (i20 < i15) {
                                String str6 = strArr3[i20];
                                if (lowerCase3.startsWith(str6) || bi.w(" ", str6, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str6) || bi.w(" ", str6, translitString3)))) {
                                    i10 = i19;
                                    z11 = true;
                                } else {
                                    i10 = i19;
                                    String publicUsername2 = UserObject.getPublicUsername(user5);
                                    if (publicUsername2 != null && publicUsername2.startsWith(str6)) {
                                        z11 = 2;
                                    }
                                }
                                if (!z11 || user5.phone == null) {
                                    i20++;
                                    i19 = i10;
                                } else {
                                    if (z11) {
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
                    AndroidUtilities.runOnUIThread(new d9(yjVar4, this.c, arrayList4, arrayList5, 15));
                    break;
                } else {
                    yjVar.h = -1;
                    AndroidUtilities.runOnUIThread(new d9(yjVar, yjVar.h, new ArrayList(), new ArrayList(), 15));
                    break;
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                zn znVar = (zn) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                yi yiVar = chatAttachAlertPhotoLayout.b;
                if (!yiVar.F || yiVar.G) {
                    i11 = i14;
                } else {
                    PhotoViewer.t1().K2(null, n2Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.h = 0;
                    t12.n = false;
                    i11 = 3;
                }
                if (yiVar.H) {
                    i11 = 13;
                }
                PhotoViewer.t1().g2(arrayList6, this.c, i11, false, chatAttachAlertPhotoLayout.h1, yiVar.H ? null : znVar);
                PhotoViewer.t1().x2(yiVar.Q);
                if (yiVar.F && !yiVar.G) {
                    PhotoViewer.t1().O = false;
                } else if (yiVar.T0 != 0) {
                    PhotoViewer.t1().O = true;
                    PhotoViewer.t1().P = yiVar.U0 != null;
                }
                if (yiVar.G) {
                    PhotoViewer.t1().Y0(null, null, false, yiVar.J);
                }
                if (ChatAttachAlertPhotoLayout.T()) {
                    PhotoViewer t13 = PhotoViewer.t1();
                    Editable text = yiVar.o1().getText();
                    t13.p7 = true;
                    t13.q7 = text;
                    t13.A2(null, text, false, false);
                    t13.t3(null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ i0(n4.x xVar, i1 i1Var, int i10, o9 o9Var, k0 k0Var, int i11) {
        this.d = xVar;
        this.e = i1Var;
        this.b = i10;
        this.f = o9Var;
        this.h = k0Var;
        this.c = i11;
    }

    public /* synthetic */ i0(yj yjVar, String str, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.d = yjVar;
        this.e = str;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ i0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, int i11, zn znVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.b = i10;
        this.e = n2Var;
        this.f = arrayList;
        this.c = i11;
        this.h = znVar;
    }
}
