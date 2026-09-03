package org.telegram.messenger;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.web.r;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class p6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p6(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
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
                zn znVar = (zn) this.d;
                CharacterStyle characterStyle = (CharacterStyle) this.e;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f;
                znVar.tb = this.b;
                znVar.ub = this.c;
                znVar.vb = characterStyle;
                s1Var.invalidate();
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) this.d;
                TLRPC.Document document = (TLRPC.Document) this.e;
                rh.w3.g(this.b, user, document, this.c, new rh.o3((r) this.f, document, 0));
                break;
            case 3:
                tf.c1 c1Var = (tf.c1) this.d;
                String str = (String) this.e;
                ArrayList arrayList2 = (ArrayList) this.f;
                c1Var.getClass();
                String lowerCase = str.trim().toLowerCase();
                int length = lowerCase.length();
                int i12 = this.b;
                if (length == 0) {
                    AndroidUtilities.runOnUIThread(new dg.f3((ql0) c1Var, i12, new ArrayList(), new ArrayList(), c1Var.E, 28));
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
                            if (c1Var.D == null) {
                                c1Var.D = new ArrayList();
                                ArrayList<ContactsController.Contact> arrayList6 = ContactsController.getInstance(i15).phoneBookContacts;
                                int size2 = arrayList6.size();
                                int i17 = 0;
                                while (i17 < size2) {
                                    ContactsController.Contact contact = arrayList6.get(i17);
                                    i17++;
                                    ContactsController.Contact contact2 = contact;
                                    tf.b1 b1Var = new tf.b1();
                                    b1Var.b = contact2;
                                    b1Var.a = (contact2.first_name + " " + contact2.last_name).toLowerCase();
                                    (contact2.last_name + " " + contact2.first_name).toLowerCase();
                                    c1Var.D.add(b1Var);
                                }
                            }
                            for (int i18 = 0; i18 < c1Var.D.size(); i18++) {
                                tf.b1 b1Var2 = (tf.b1) c1Var.D.get(i18);
                                if ((translitString != null && (b1Var2.a.toLowerCase().contains(translitString) || b1Var2.a.toLowerCase().contains(translitString))) || b1Var2.a.toLowerCase().contains(lowerCase) || b1Var2.a.toLowerCase().contains(lowerCase)) {
                                    arrayList5.add(b1Var2.b);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new dg.f3((ql0) c1Var, i16, arrayList3, arrayList4, arrayList5, 28));
                            break;
                        } else {
                            int i19 = i13;
                            TLRPC.User user2 = MessagesController.getInstance(i15).getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i14)).user_id));
                            if (c1Var.v || !user2.self) {
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
                                boolean z4 = false;
                                while (true) {
                                    arrayList = arrayList2;
                                    if (i21 < i20) {
                                        String str2 = strArr[i21];
                                        i10 = i12;
                                        i11 = i20;
                                        for (int i22 = 0; i22 < 3; i22++) {
                                            String str3 = strArr2[i22];
                                            if (str3 != null && (str3.startsWith(str2) || y3.w(" ", str2, str3))) {
                                                z4 = true;
                                                String publicUsername = UserObject.getPublicUsername(user2);
                                                r42 = (z4 && publicUsername != null && publicUsername.startsWith(str2)) ? 2 : z4;
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
                                                    z4 = r42;
                                                    i20 = i11;
                                                    arrayList2 = arrayList;
                                                    i12 = i10;
                                                }
                                            }
                                        }
                                        String publicUsername2 = UserObject.getPublicUsername(user2);
                                        if (z4) {
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
                vh.o0 o0Var = (vh.o0) this.d;
                vh.e1 e1Var = (vh.e1) this.e;
                org.telegram.ui.Cells.l9 l9Var = (org.telegram.ui.Cells.l9) this.f;
                vh.r0 r0Var = o0Var.a;
                int length2 = e1Var.length();
                int i23 = this.b;
                if (length2 >= i23 && e1Var.getSelectionStart() != e1Var.getSelectionEnd() && l9Var.k0(r0Var, 0, this.c, i23)) {
                    r0Var.n = true;
                    e1Var.setSelection(i23);
                    r0Var.n = false;
                    break;
                }
                break;
            case 5:
                o2.i iVar = (o2.i) this.d;
                vh.e1 e1Var2 = (vh.e1) this.e;
                org.telegram.ui.Cells.l9 l9Var2 = (org.telegram.ui.Cells.l9) this.f;
                vh.b5 b5Var = (vh.b5) iVar.b;
                int length3 = e1Var2.length();
                int i24 = this.b;
                if (length3 >= i24 && e1Var2.getSelectionStart() != e1Var2.getSelectionEnd()) {
                    if (l9Var2.y()) {
                        b5Var.w = true;
                        e1Var2.setSelection(i24);
                        b5Var.w = false;
                        break;
                    } else if (l9Var2.k0(b5Var, 0, this.c, i24)) {
                        b5Var.w = true;
                        e1Var2.setSelection(i24);
                        b5Var.w = false;
                        break;
                    }
                }
                break;
            case 6:
                tp0 tp0Var = (tp0) this.d;
                vh.e1 e1Var3 = (vh.e1) this.e;
                org.telegram.ui.Cells.l9 l9Var3 = (org.telegram.ui.Cells.l9) this.f;
                vh.j5 j5Var = (vh.j5) tp0Var.b;
                int length4 = e1Var3.length();
                int i25 = this.b;
                if (length4 >= i25 && e1Var3.getSelectionStart() != e1Var3.getSelectionEnd() && l9Var3.k0(j5Var, 0, this.c, i25)) {
                    j5Var.D = true;
                    e1Var3.setSelection(i25);
                    j5Var.D = false;
                    break;
                }
                break;
            case 7:
                vh.r5 r5Var = (vh.r5) this.d;
                vh.e1 e1Var4 = (vh.e1) this.e;
                org.telegram.ui.Cells.l9 l9Var4 = (org.telegram.ui.Cells.l9) this.f;
                vh.w5 w5Var = r5Var.a;
                int length5 = e1Var4.length();
                int i26 = this.b;
                if (length5 >= i26 && e1Var4.getSelectionStart() != e1Var4.getSelectionEnd()) {
                    if (l9Var4.y()) {
                        w5Var.C = true;
                        e1Var4.setSelection(i26);
                        w5Var.C = false;
                        break;
                    } else if (l9Var4.k0(w5Var, 0, this.c, i26)) {
                        w5Var.C = true;
                        e1Var4.setSelection(i26);
                        w5Var.C = false;
                        break;
                    }
                }
                break;
            default:
                vh.s5 s5Var = (vh.s5) this.d;
                vh.e1 e1Var5 = (vh.e1) this.e;
                org.telegram.ui.Cells.l9 l9Var5 = (org.telegram.ui.Cells.l9) this.f;
                vh.w5 w5Var2 = s5Var.a;
                int length6 = e1Var5.length();
                int i27 = this.b;
                if (length6 >= i27 && e1Var5.getSelectionStart() != e1Var5.getSelectionEnd()) {
                    if (l9Var5.y()) {
                        w5Var2.n = true;
                        e1Var5.setSelection(i27);
                        w5Var2.n = false;
                        break;
                    } else if (l9Var5.k0(w5Var2, 1, this.c, i27)) {
                        w5Var2.n = true;
                        e1Var5.setSelection(i27);
                        w5Var2.n = false;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ p6(int i10, TLRPC.User user, TLRPC.Document document, int i11, r rVar) {
        this.a = 2;
        this.b = i10;
        this.d = user;
        this.e = document;
        this.c = i11;
        this.f = rVar;
    }

    public /* synthetic */ p6(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.f = obj3;
        this.c = i11;
    }

    public /* synthetic */ p6(zn znVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.s1 s1Var) {
        this.a = 1;
        this.d = znVar;
        this.b = i10;
        this.c = i11;
        this.e = characterStyle;
        this.f = s1Var;
    }
}
