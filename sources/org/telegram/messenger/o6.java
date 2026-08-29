package org.telegram.messenger;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.il0;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class o6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o6(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.d = mediaController;
        this.b = i10;
        this.e = tL_error;
        this.f = tLObject;
        this.c = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a1 A[LOOP:1: B:103:0x022b->B:123:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v26 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        int i10;
        int i11;
        ?? r42;
        Object obj;
        switch (this.a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$11(this.b, (TLRPC.TL_error) this.e, (TLObject) this.f, this.c);
                break;
            case 1:
                tn tnVar = (tn) this.d;
                CharacterStyle characterStyle = (CharacterStyle) this.e;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f;
                tnVar.sb = this.b;
                tnVar.tb = this.c;
                tnVar.ub = characterStyle;
                s1Var.invalidate();
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) this.d;
                TLRPC.Document document = (TLRPC.Document) this.e;
                ph.w3.g(this.b, user, document, this.c, new ph.o3((org.telegram.ui.web.s) this.f, document, 0));
                break;
            case 3:
                rf.d1 d1Var = (rf.d1) this.d;
                String str = (String) this.e;
                ArrayList arrayList2 = (ArrayList) this.f;
                d1Var.getClass();
                String lowerCase = str.trim().toLowerCase();
                int length = lowerCase.length();
                int i12 = this.b;
                if (length == 0) {
                    AndroidUtilities.runOnUIThread(new bg.j3((il0) d1Var, i12, new ArrayList(), new ArrayList(), d1Var.D, 29));
                    break;
                } else {
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
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        int size = arrayList2.size();
                        int i15 = this.c;
                        if (i14 >= size) {
                            int i16 = i12;
                            if (d1Var.C == null) {
                                d1Var.C = new ArrayList();
                                ArrayList<ContactsController.Contact> arrayList6 = ContactsController.getInstance(i15).phoneBookContacts;
                                int size2 = arrayList6.size();
                                int i17 = 0;
                                while (i17 < size2) {
                                    ContactsController.Contact contact = arrayList6.get(i17);
                                    i17++;
                                    ContactsController.Contact contact2 = contact;
                                    rf.c1 c1Var = new rf.c1();
                                    c1Var.b = contact2;
                                    c1Var.a = (contact2.first_name + " " + contact2.last_name).toLowerCase();
                                    (contact2.last_name + " " + contact2.first_name).toLowerCase();
                                    d1Var.C.add(c1Var);
                                }
                            }
                            for (int i18 = 0; i18 < d1Var.C.size(); i18++) {
                                rf.c1 c1Var2 = (rf.c1) d1Var.C.get(i18);
                                if ((translitString != null && (c1Var2.a.toLowerCase().contains(translitString) || c1Var2.a.toLowerCase().contains(translitString))) || c1Var2.a.toLowerCase().contains(lowerCase) || c1Var2.a.toLowerCase().contains(lowerCase)) {
                                    arrayList5.add(c1Var2.b);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new bg.j3((il0) d1Var, i16, arrayList3, arrayList4, arrayList5, 29));
                            break;
                        } else {
                            int i19 = i13;
                            TLRPC.User user2 = MessagesController.getInstance(i15).getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i14)).user_id));
                            if (d1Var.v || !user2.self) {
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
                                int i20 = i19;
                                int i21 = 0;
                                boolean z10 = false;
                                while (true) {
                                    arrayList = arrayList2;
                                    if (i21 < i20) {
                                        String str2 = strArr[i21];
                                        i10 = i12;
                                        i11 = i20;
                                        for (int i22 = 0; i22 < 3; i22++) {
                                            String str3 = strArr2[i22];
                                            if (str3 != null && (str3.startsWith(str2) || x3.w(" ", str2, str3))) {
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
                                                    i21++;
                                                    z10 = r42;
                                                    i20 = i11;
                                                    arrayList2 = arrayList;
                                                    i12 = i10;
                                                }
                                            }
                                        }
                                        String publicUsername2 = UserObject.getPublicUsername(user2);
                                        if (z10) {
                                        }
                                        if (r42 == 0) {
                                        }
                                    } else {
                                        i10 = i12;
                                        i11 = i20;
                                    }
                                }
                            } else {
                                arrayList = arrayList2;
                                i10 = i12;
                                i11 = i19;
                            }
                            i14++;
                            i13 = i11;
                            arrayList2 = arrayList;
                            i12 = i10;
                        }
                    }
                }
                break;
            case 4:
                th.n0 n0Var = (th.n0) this.d;
                th.d1 d1Var2 = (th.d1) this.e;
                org.telegram.ui.Cells.k9 k9Var = (org.telegram.ui.Cells.k9) this.f;
                th.q0 q0Var = n0Var.a;
                int length2 = d1Var2.length();
                int i23 = this.b;
                if (length2 >= i23 && d1Var2.getSelectionStart() != d1Var2.getSelectionEnd() && k9Var.k0(q0Var, 0, this.c, i23)) {
                    q0Var.n = true;
                    d1Var2.setSelection(i23);
                    q0Var.n = false;
                    break;
                }
                break;
            case 5:
                o4.g gVar = (o4.g) this.d;
                th.d1 d1Var3 = (th.d1) this.e;
                org.telegram.ui.Cells.k9 k9Var2 = (org.telegram.ui.Cells.k9) this.f;
                th.y4 y4Var = (th.y4) gVar.b;
                int length3 = d1Var3.length();
                int i24 = this.b;
                if (length3 >= i24 && d1Var3.getSelectionStart() != d1Var3.getSelectionEnd()) {
                    if (k9Var2.y()) {
                        y4Var.w = true;
                        d1Var3.setSelection(i24);
                        y4Var.w = false;
                        break;
                    } else if (k9Var2.k0(y4Var, 0, this.c, i24)) {
                        y4Var.w = true;
                        d1Var3.setSelection(i24);
                        y4Var.w = false;
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.ui.Components.n nVar = (org.telegram.ui.Components.n) this.d;
                th.d1 d1Var4 = (th.d1) this.e;
                org.telegram.ui.Cells.k9 k9Var3 = (org.telegram.ui.Cells.k9) this.f;
                th.g5 g5Var = (th.g5) nVar.b;
                int length4 = d1Var4.length();
                int i25 = this.b;
                if (length4 >= i25 && d1Var4.getSelectionStart() != d1Var4.getSelectionEnd() && k9Var3.k0(g5Var, 0, this.c, i25)) {
                    g5Var.C = true;
                    d1Var4.setSelection(i25);
                    g5Var.C = false;
                    break;
                }
                break;
            case 7:
                th.o5 o5Var = (th.o5) this.d;
                th.d1 d1Var5 = (th.d1) this.e;
                org.telegram.ui.Cells.k9 k9Var4 = (org.telegram.ui.Cells.k9) this.f;
                th.t5 t5Var = o5Var.a;
                int length5 = d1Var5.length();
                int i26 = this.b;
                if (length5 >= i26 && d1Var5.getSelectionStart() != d1Var5.getSelectionEnd()) {
                    if (k9Var4.y()) {
                        t5Var.B = true;
                        d1Var5.setSelection(i26);
                        t5Var.B = false;
                        break;
                    } else if (k9Var4.k0(t5Var, 0, this.c, i26)) {
                        t5Var.B = true;
                        d1Var5.setSelection(i26);
                        t5Var.B = false;
                        break;
                    }
                }
                break;
            default:
                th.p5 p5Var = (th.p5) this.d;
                th.d1 d1Var6 = (th.d1) this.e;
                org.telegram.ui.Cells.k9 k9Var5 = (org.telegram.ui.Cells.k9) this.f;
                th.t5 t5Var2 = p5Var.a;
                int length6 = d1Var6.length();
                int i27 = this.b;
                if (length6 >= i27 && d1Var6.getSelectionStart() != d1Var6.getSelectionEnd()) {
                    if (k9Var5.y()) {
                        t5Var2.n = true;
                        d1Var6.setSelection(i27);
                        t5Var2.n = false;
                        break;
                    } else if (k9Var5.k0(t5Var2, 1, this.c, i27)) {
                        t5Var2.n = true;
                        d1Var6.setSelection(i27);
                        t5Var2.n = false;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ o6(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.s sVar) {
        this.a = 2;
        this.b = i10;
        this.d = user;
        this.e = document;
        this.c = i11;
        this.f = sVar;
    }

    public /* synthetic */ o6(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.f = obj3;
        this.c = i11;
    }

    public /* synthetic */ o6(tn tnVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.s1 s1Var) {
        this.a = 1;
        this.d = tnVar;
        this.b = i10;
        this.c = i11;
        this.e = characterStyle;
        this.f = s1Var;
    }
}
