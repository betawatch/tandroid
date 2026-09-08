package ji;

import android.text.Editable;
import bi.k8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.vi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.co;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ h0(m4.f1 f1Var, m4.r rVar, int i10, m4.a0 a0Var, int i11, m4.e1 e1Var) {
        this.d = f1Var;
        this.e = rVar;
        this.b = i10;
        this.f = a0Var;
        this.c = i11;
        this.h = e1Var;
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
                h1 h1Var = (h1) obj3;
                q9 q9Var = (q9) obj2;
                j0 j0Var = (j0) obj;
                k0 k0Var = (k0) ((pf.b) obj4).c;
                if (h1Var.length() >= i14 && h1Var.getSelectionStart() != h1Var.getSelectionEnd() && q9Var.k0(j0Var.D(), 0, i13, i14)) {
                    k0Var.d = true;
                    h1Var.setSelection(i14);
                    k0Var.d = false;
                    break;
                }
                break;
            case 1:
                final m4.r rVar = (m4.r) obj3;
                final m4.a0 a0Var = (m4.a0) obj2;
                final m4.e1 e1Var = (m4.e1) obj;
                fg.f fVar = ((m4.f1) obj4).b;
                if (!fVar.C(rVar, i14)) {
                    m4.f1.O0(a0Var, rVar, i13, new m4.p1(-4));
                    break;
                } else {
                    ob.a aVar = a0Var.e;
                    a0Var.s(rVar);
                    aVar.getClass();
                    if (i14 != 27) {
                        fVar.d(rVar, i14, new m4.d() { // from class: m4.z0
                            @Override // m4.d
                            public final i9.w run() {
                                return (i9.w) e1.this.h(a0Var, rVar, i13);
                            }
                        });
                        break;
                    } else {
                        e1Var.h(a0Var, rVar, i13);
                        fVar.d(rVar, i14, new m4.y0());
                        break;
                    }
                }
            case 2:
                uj ujVar = (uj) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                ujVar.getClass();
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
                    uj ujVar2 = ujVar;
                    ArrayList arrayList5 = new ArrayList();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int i16 = 0;
                    while (i16 < arrayList2.size()) {
                        ContactsController.Contact contact = (ContactsController.Contact) arrayList2.get(i16);
                        String lowerCase2 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        uj ujVar3 = ujVar2;
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
                            if ((str == null || !(str.startsWith(str4) || org.telegram.messenger.w1.w(" ", str4, str))) && (str2 == null || !(str2.startsWith(str4) || org.telegram.messenger.w1.w(" ", str4, str2)))) {
                                str3 = str;
                                TLRPC.User user2 = contact.user;
                                r22 = (user2 == null || (publicUsername = UserObject.getPublicUsername(user2)) == null || !publicUsername.startsWith(str4)) ? (lowerCase2.startsWith(str4) || org.telegram.messenger.w1.w(" ", str4, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str4) || org.telegram.messenger.w1.w(" ", str4, translitString2)))) ? 3 : z10 : 2;
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
                                ujVar2 = ujVar3;
                                arrayList2 = arrayList;
                                strArr = strArr2;
                            }
                        }
                        i16++;
                        ujVar2 = ujVar3;
                        arrayList2 = arrayList;
                        strArr = strArr2;
                    }
                    uj ujVar4 = ujVar2;
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
                                if (lowerCase3.startsWith(str6) || org.telegram.messenger.w1.w(" ", str6, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str6) || org.telegram.messenger.w1.w(" ", str6, translitString3)))) {
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
                    AndroidUtilities.runOnUIThread(new k8(ujVar4, this.c, arrayList4, arrayList5, 15));
                    break;
                } else {
                    ujVar.h = -1;
                    AndroidUtilities.runOnUIThread(new k8(ujVar, ujVar.h, new ArrayList(), new ArrayList(), 15));
                    break;
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj4;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                co coVar = (co) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                vi viVar = chatAttachAlertPhotoLayout.b;
                if (!viVar.F || viVar.G) {
                    i11 = i14;
                } else {
                    PhotoViewer.t1().K2(null, n2Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.h = 0;
                    t12.n = false;
                    i11 = 3;
                }
                PhotoViewer.t1().f2(arrayList6, this.c, viVar.H ? 13 : i11, false, chatAttachAlertPhotoLayout.h1, viVar.H ? null : coVar);
                PhotoViewer.t1().x2(viVar.Q);
                if (viVar.F && !viVar.G) {
                    PhotoViewer.t1().O = false;
                } else if (viVar.Q0 != 0) {
                    PhotoViewer.t1().O = true;
                    PhotoViewer.t1().P = viVar.R0 != null;
                }
                if (viVar.G) {
                    PhotoViewer.t1().X0(null, null, false, viVar.J);
                }
                if (ChatAttachAlertPhotoLayout.T()) {
                    PhotoViewer t13 = PhotoViewer.t1();
                    Editable text = viVar.m1().getText();
                    t13.p7 = true;
                    t13.q7 = text;
                    t13.A2(null, text, false, false);
                    t13.t3(null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h0(uj ujVar, String str, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        this.d = ujVar;
        this.e = str;
        this.f = arrayList;
        this.h = arrayList2;
        this.b = i10;
        this.c = i11;
    }

    public /* synthetic */ h0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, int i11, co coVar) {
        this.d = chatAttachAlertPhotoLayout;
        this.b = i10;
        this.e = n2Var;
        this.f = arrayList;
        this.c = i11;
        this.h = coVar;
    }

    public /* synthetic */ h0(pf.b bVar, h1 h1Var, int i10, q9 q9Var, j0 j0Var, int i11) {
        this.d = bVar;
        this.e = h1Var;
        this.b = i10;
        this.f = q9Var;
        this.h = j0Var;
        this.c = i11;
    }
}
