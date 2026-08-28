package mh;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.qn;
import qh.f5;
import qh.n5;
import qh.o5;
import qh.s5;
import qh.x4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l4(int i9, int i10, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 2;
        this.d = mediaController;
        this.b = i9;
        this.e = tL_error;
        this.f = tLObject;
        this.c = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ce A[LOOP:1: B:107:0x0258->B:127:0x02ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v23 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        int i9;
        int i10;
        ?? r42;
        Object obj;
        switch (this.a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.d;
                TLRPC.Document document = (TLRPC.Document) this.e;
                q4.g(this.b, user, document, this.c, new h4((org.telegram.ui.web.r) this.f, document, 0));
                break;
            case 1:
                of.o1 o1Var = (of.o1) this.d;
                String str = (String) this.e;
                ArrayList arrayList2 = (ArrayList) this.f;
                o1Var.getClass();
                String lowerCase = str.trim().toLowerCase();
                int length = lowerCase.length();
                int i11 = this.b;
                if (length == 0) {
                    AndroidUtilities.runOnUIThread(new fh.g1(o1Var, i11, new ArrayList(), new ArrayList(), o1Var.D, 5));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i12 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i12];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    int i13 = 0;
                    while (true) {
                        int size = arrayList2.size();
                        int i14 = this.c;
                        if (i13 >= size) {
                            int i15 = i11;
                            if (o1Var.C == null) {
                                o1Var.C = new ArrayList();
                                ArrayList<ContactsController.Contact> arrayList6 = ContactsController.getInstance(i14).phoneBookContacts;
                                int size2 = arrayList6.size();
                                int i16 = 0;
                                while (i16 < size2) {
                                    ContactsController.Contact contact = arrayList6.get(i16);
                                    i16++;
                                    ContactsController.Contact contact2 = contact;
                                    of.n1 n1Var = new of.n1();
                                    n1Var.b = contact2;
                                    n1Var.a = (contact2.first_name + " " + contact2.last_name).toLowerCase();
                                    (contact2.last_name + " " + contact2.first_name).toLowerCase();
                                    o1Var.C.add(n1Var);
                                }
                            }
                            for (int i17 = 0; i17 < o1Var.C.size(); i17++) {
                                of.n1 n1Var2 = (of.n1) o1Var.C.get(i17);
                                if ((translitString != null && (n1Var2.a.toLowerCase().contains(translitString) || n1Var2.a.toLowerCase().contains(translitString))) || n1Var2.a.toLowerCase().contains(lowerCase) || n1Var2.a.toLowerCase().contains(lowerCase)) {
                                    arrayList5.add(n1Var2.b);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new fh.g1(o1Var, i15, arrayList3, arrayList4, arrayList5, 5));
                            break;
                        } else {
                            int i18 = i12;
                            TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i13)).user_id));
                            if (o1Var.v || !user2.self) {
                                String[] strArr2 = new String[3];
                                strArr2[0] = ContactsController.formatName(user2.first_name, user2.last_name).toLowerCase();
                                String translitString2 = LocaleController.getInstance().getTranslitString(strArr2[0]);
                                strArr2[1] = translitString2;
                                if (strArr2[0].equals(translitString2)) {
                                    strArr2[1] = null;
                                }
                                if (UserObject.isReplyUser(user2)) {
                                    strArr2[2] = LocaleController.getString(R.string.RepliesTitle).toLowerCase();
                                } else if (user2.self) {
                                    strArr2[2] = LocaleController.getString(R.string.SavedMessages).toLowerCase();
                                }
                                int i19 = i18;
                                int i20 = 0;
                                boolean z10 = false;
                                while (true) {
                                    arrayList = arrayList2;
                                    if (i20 < i19) {
                                        String str2 = strArr[i20];
                                        i9 = i11;
                                        i10 = i19;
                                        for (int i21 = 0; i21 < 3; i21++) {
                                            String str3 = strArr2[i21];
                                            if (str3 != null && (str3.startsWith(str2) || org.telegram.messenger.l0.w(" ", str2, str3))) {
                                                z10 = true;
                                                String publicUsername = UserObject.getPublicUsername(user2);
                                                r42 = (z10 && publicUsername != null && publicUsername.startsWith(str2)) ? 2 : z10;
                                                if (r42 == 0) {
                                                    if (r42 == 1) {
                                                        arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str2));
                                                        obj = null;
                                                    } else {
                                                        obj = null;
                                                        arrayList4.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user2), null, "@" + str2));
                                                    }
                                                    arrayList3.add(user2);
                                                } else {
                                                    i20++;
                                                    z10 = r42;
                                                    i19 = i10;
                                                    arrayList2 = arrayList;
                                                    i11 = i9;
                                                }
                                            }
                                        }
                                        String publicUsername2 = UserObject.getPublicUsername(user2);
                                        if (z10) {
                                        }
                                        if (r42 == 0) {
                                        }
                                    } else {
                                        i9 = i11;
                                        i10 = i19;
                                    }
                                }
                            } else {
                                arrayList = arrayList2;
                                i9 = i11;
                                i10 = i18;
                            }
                            i13++;
                            i12 = i10;
                            arrayList2 = arrayList;
                            i11 = i9;
                        }
                    }
                }
                break;
            case 2:
                ((MediaController) this.d).lambda$loadMoreMusic$11(this.b, (TLRPC.TL_error) this.e, (TLObject) this.f, this.c);
                break;
            case 3:
                qn qnVar = (qn) this.d;
                CharacterStyle characterStyle = (CharacterStyle) this.e;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f;
                qnVar.sb = this.b;
                qnVar.tb = this.c;
                qnVar.ub = characterStyle;
                t1Var.invalidate();
                break;
            case 4:
                qh.n0 n0Var = (qh.n0) this.d;
                qh.d1 d1Var = (qh.d1) this.e;
                n9 n9Var = (n9) this.f;
                qh.q0 q0Var = n0Var.a;
                int length2 = d1Var.length();
                int i22 = this.b;
                if (length2 >= i22 && d1Var.getSelectionStart() != d1Var.getSelectionEnd() && n9Var.k0(q0Var, 0, this.c, i22)) {
                    q0Var.n = true;
                    d1Var.setSelection(i22);
                    q0Var.n = false;
                    break;
                }
                break;
            case 5:
                n2.p pVar = (n2.p) this.d;
                qh.d1 d1Var2 = (qh.d1) this.e;
                n9 n9Var2 = (n9) this.f;
                x4 x4Var = (x4) pVar.b;
                int length3 = d1Var2.length();
                int i23 = this.b;
                if (length3 >= i23 && d1Var2.getSelectionStart() != d1Var2.getSelectionEnd()) {
                    if (n9Var2.y()) {
                        x4Var.w = true;
                        d1Var2.setSelection(i23);
                        x4Var.w = false;
                        break;
                    } else if (n9Var2.k0(x4Var, 0, this.c, i23)) {
                        x4Var.w = true;
                        d1Var2.setSelection(i23);
                        x4Var.w = false;
                        break;
                    }
                }
                break;
            case 6:
                n5.a0 a0Var = (n5.a0) this.d;
                qh.d1 d1Var3 = (qh.d1) this.e;
                n9 n9Var3 = (n9) this.f;
                f5 f5Var = (f5) a0Var.b;
                int length4 = d1Var3.length();
                int i24 = this.b;
                if (length4 >= i24 && d1Var3.getSelectionStart() != d1Var3.getSelectionEnd() && n9Var3.k0(f5Var, 0, this.c, i24)) {
                    f5Var.C = true;
                    d1Var3.setSelection(i24);
                    f5Var.C = false;
                    break;
                }
                break;
            case 7:
                n5 n5Var = (n5) this.d;
                qh.d1 d1Var4 = (qh.d1) this.e;
                n9 n9Var4 = (n9) this.f;
                s5 s5Var = n5Var.a;
                int length5 = d1Var4.length();
                int i25 = this.b;
                if (length5 >= i25 && d1Var4.getSelectionStart() != d1Var4.getSelectionEnd()) {
                    if (n9Var4.y()) {
                        s5Var.B = true;
                        d1Var4.setSelection(i25);
                        s5Var.B = false;
                        break;
                    } else if (n9Var4.k0(s5Var, 0, this.c, i25)) {
                        s5Var.B = true;
                        d1Var4.setSelection(i25);
                        s5Var.B = false;
                        break;
                    }
                }
                break;
            default:
                o5 o5Var = (o5) this.d;
                qh.d1 d1Var5 = (qh.d1) this.e;
                n9 n9Var5 = (n9) this.f;
                s5 s5Var2 = o5Var.a;
                int length6 = d1Var5.length();
                int i26 = this.b;
                if (length6 >= i26 && d1Var5.getSelectionStart() != d1Var5.getSelectionEnd()) {
                    if (n9Var5.y()) {
                        s5Var2.n = true;
                        d1Var5.setSelection(i26);
                        s5Var2.n = false;
                        break;
                    } else if (n9Var5.k0(s5Var2, 1, this.c, i26)) {
                        s5Var2.n = true;
                        d1Var5.setSelection(i26);
                        s5Var2.n = false;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ l4(int i9, TLRPC.User user, TLRPC.Document document, int i10, org.telegram.ui.web.r rVar) {
        this.a = 0;
        this.b = i9;
        this.d = user;
        this.e = document;
        this.c = i10;
        this.f = rVar;
    }

    public /* synthetic */ l4(Object obj, Object obj2, int i9, Object obj3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i9;
        this.f = obj3;
        this.c = i10;
    }

    public /* synthetic */ l4(qn qnVar, int i9, int i10, CharacterStyle characterStyle, org.telegram.ui.Cells.t1 t1Var) {
        this.a = 3;
        this.d = qnVar;
        this.b = i9;
        this.c = i10;
        this.e = characterStyle;
        this.f = t1Var;
    }
}
