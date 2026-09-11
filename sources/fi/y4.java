package fi;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import ji.a6;
import ji.b6;
import ji.g6;
import ji.j5;
import ji.s5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.co;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 7;
        this.d = mediaController;
        this.b = i10;
        this.e = tL_error;
        this.f = tLObject;
        this.c = i11;
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
        int i10;
        int i11;
        ?? r42;
        Object obj;
        switch (this.a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.d;
                TLRPC.Document document = (TLRPC.Document) this.e;
                d5.g(this.b, user, document, this.c, new t4((org.telegram.ui.web.s) this.f, document, 0));
                break;
            case 1:
                hg.u1 u1Var = (hg.u1) this.d;
                String str = (String) this.e;
                ArrayList arrayList2 = (ArrayList) this.f;
                u1Var.getClass();
                String lowerCase = str.trim().toLowerCase();
                int length = lowerCase.length();
                int i12 = this.b;
                if (length == 0) {
                    AndroidUtilities.runOnUIThread(new l3(u1Var, i12, new ArrayList(), new ArrayList(), u1Var.H, 3));
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
                            if (u1Var.G == null) {
                                u1Var.G = new ArrayList();
                                ArrayList<ContactsController.Contact> arrayList6 = ContactsController.getInstance(i15).phoneBookContacts;
                                int size2 = arrayList6.size();
                                int i17 = 0;
                                while (i17 < size2) {
                                    ContactsController.Contact contact = arrayList6.get(i17);
                                    i17++;
                                    ContactsController.Contact contact2 = contact;
                                    hg.t1 t1Var = new hg.t1();
                                    t1Var.b = contact2;
                                    t1Var.a = (contact2.first_name + " " + contact2.last_name).toLowerCase();
                                    (contact2.last_name + " " + contact2.first_name).toLowerCase();
                                    u1Var.G.add(t1Var);
                                }
                            }
                            for (int i18 = 0; i18 < u1Var.G.size(); i18++) {
                                hg.t1 t1Var2 = (hg.t1) u1Var.G.get(i18);
                                if ((translitString != null && (t1Var2.a.toLowerCase().contains(translitString) || t1Var2.a.toLowerCase().contains(translitString))) || t1Var2.a.toLowerCase().contains(lowerCase) || t1Var2.a.toLowerCase().contains(lowerCase)) {
                                    arrayList5.add(t1Var2.b);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new l3(u1Var, i16, arrayList3, arrayList4, arrayList5, 3));
                            break;
                        } else {
                            int i19 = i13;
                            TLRPC.User user2 = MessagesController.getInstance(i15).getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i14)).user_id));
                            if (u1Var.v || !user2.self) {
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
                                            if (str3 != null && (str3.startsWith(str2) || org.telegram.messenger.w1.w(" ", str2, str3))) {
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
            case 2:
                ji.q0 q0Var = (ji.q0) this.d;
                ji.h1 h1Var = (ji.h1) this.e;
                q9 q9Var = (q9) this.f;
                ji.t0 t0Var = q0Var.a;
                int length2 = h1Var.length();
                int i23 = this.b;
                if (length2 >= i23 && h1Var.getSelectionStart() != h1Var.getSelectionEnd() && q9Var.k0(t0Var, 0, this.c, i23)) {
                    t0Var.n = true;
                    h1Var.setSelection(i23);
                    t0Var.n = false;
                    break;
                }
                break;
            case 3:
                a6.m mVar = (a6.m) this.d;
                ji.h1 h1Var2 = (ji.h1) this.e;
                q9 q9Var2 = (q9) this.f;
                j5 j5Var = (j5) mVar.b;
                int length3 = h1Var2.length();
                int i24 = this.b;
                if (length3 >= i24 && h1Var2.getSelectionStart() != h1Var2.getSelectionEnd()) {
                    if (q9Var2.y()) {
                        j5Var.w = true;
                        h1Var2.setSelection(i24);
                        j5Var.w = false;
                        break;
                    } else if (q9Var2.k0(j5Var, 0, this.c, i24)) {
                        j5Var.w = true;
                        h1Var2.setSelection(i24);
                        j5Var.w = false;
                        break;
                    }
                }
                break;
            case 4:
                xa.c cVar = (xa.c) this.d;
                ji.h1 h1Var3 = (ji.h1) this.e;
                q9 q9Var3 = (q9) this.f;
                s5 s5Var = (s5) cVar.b;
                int length4 = h1Var3.length();
                int i25 = this.b;
                if (length4 >= i25 && h1Var3.getSelectionStart() != h1Var3.getSelectionEnd() && q9Var3.k0(s5Var, 0, this.c, i25)) {
                    s5Var.G = true;
                    h1Var3.setSelection(i25);
                    s5Var.G = false;
                    break;
                }
                break;
            case 5:
                a6 a6Var = (a6) this.d;
                ji.h1 h1Var4 = (ji.h1) this.e;
                q9 q9Var4 = (q9) this.f;
                g6 g6Var = a6Var.a;
                int length5 = h1Var4.length();
                int i26 = this.b;
                if (length5 >= i26 && h1Var4.getSelectionStart() != h1Var4.getSelectionEnd()) {
                    if (q9Var4.y()) {
                        g6Var.F = true;
                        h1Var4.setSelection(i26);
                        g6Var.F = false;
                        break;
                    } else if (q9Var4.k0(g6Var, 0, this.c, i26)) {
                        g6Var.F = true;
                        h1Var4.setSelection(i26);
                        g6Var.F = false;
                        break;
                    }
                }
                break;
            case 6:
                b6 b6Var = (b6) this.d;
                ji.h1 h1Var5 = (ji.h1) this.e;
                q9 q9Var5 = (q9) this.f;
                g6 g6Var2 = b6Var.a;
                int length6 = h1Var5.length();
                int i27 = this.b;
                if (length6 >= i27 && h1Var5.getSelectionStart() != h1Var5.getSelectionEnd()) {
                    if (q9Var5.y()) {
                        g6Var2.n = true;
                        h1Var5.setSelection(i27);
                        g6Var2.n = false;
                        break;
                    } else if (q9Var5.k0(g6Var2, 1, this.c, i27)) {
                        g6Var2.n = true;
                        h1Var5.setSelection(i27);
                        g6Var2.n = false;
                        break;
                    }
                }
                break;
            case 7:
                ((MediaController) this.d).lambda$loadMoreMusic$11(this.b, (TLRPC.TL_error) this.e, (TLObject) this.f, this.c);
                break;
            default:
                co coVar = (co) this.d;
                CharacterStyle characterStyle = (CharacterStyle) this.e;
                org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) this.f;
                coVar.wb = this.b;
                coVar.xb = this.c;
                coVar.yb = characterStyle;
                t1Var3.invalidate();
                break;
        }
    }

    public /* synthetic */ y4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.s sVar) {
        this.a = 0;
        this.b = i10;
        this.d = user;
        this.e = document;
        this.c = i11;
        this.f = sVar;
    }

    public /* synthetic */ y4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.f = obj3;
        this.c = i11;
    }

    public /* synthetic */ y4(co coVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.t1 t1Var) {
        this.a = 8;
        this.d = coVar;
        this.b = i10;
        this.c = i11;
        this.e = characterStyle;
        this.f = t1Var;
    }
}
