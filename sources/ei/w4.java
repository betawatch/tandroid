package ei;

import android.text.style.CharacterStyle;
import ii.a6;
import ii.f6;
import ii.i5;
import ii.q5;
import ii.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 7;
        this.d = mediaController;
        this.b = i10;
        this.e = tL_error;
        this.f = tLObject;
        this.c = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02d2 A[LOOP:1: B:106:0x025a->B:126:0x02d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0293 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        int i13;
        Object obj;
        switch (this.a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.d;
                TLRPC.Document document = (TLRPC.Document) this.e;
                b5.g(this.b, user, document, this.c, new r4((org.telegram.ui.web.q) this.f, document, 0));
                break;
            case 1:
                gg.t1 t1Var = (gg.t1) this.d;
                String str = (String) this.e;
                ArrayList arrayList2 = (ArrayList) this.f;
                t1Var.getClass();
                String lowerCase = str.trim().toLowerCase();
                int length = lowerCase.length();
                int i14 = this.b;
                if (length == 0) {
                    AndroidUtilities.runOnUIThread(new l3(t1Var, i14, new ArrayList(), new ArrayList(), t1Var.H, 3));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i15 = 1;
                    int i16 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i16];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int i17 = 0;
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    int i18 = 0;
                    while (true) {
                        int size = arrayList2.size();
                        int i19 = i17;
                        int i20 = this.c;
                        if (i18 >= size) {
                            int i21 = i14;
                            if (t1Var.G == null) {
                                t1Var.G = new ArrayList();
                                ArrayList<ContactsController.Contact> arrayList6 = ContactsController.getInstance(i20).phoneBookContacts;
                                int size2 = arrayList6.size();
                                int i22 = i19;
                                while (i22 < size2) {
                                    ContactsController.Contact contact = arrayList6.get(i22);
                                    i22++;
                                    ContactsController.Contact contact2 = contact;
                                    gg.s1 s1Var = new gg.s1();
                                    s1Var.b = contact2;
                                    s1Var.a = (contact2.first_name + " " + contact2.last_name).toLowerCase();
                                    (contact2.last_name + " " + contact2.first_name).toLowerCase();
                                    t1Var.G.add(s1Var);
                                }
                            }
                            for (int i23 = i19; i23 < t1Var.G.size(); i23++) {
                                gg.s1 s1Var2 = (gg.s1) t1Var.G.get(i23);
                                if ((translitString != null && (s1Var2.a.toLowerCase().contains(translitString) || s1Var2.a.toLowerCase().contains(translitString))) || s1Var2.a.toLowerCase().contains(lowerCase) || s1Var2.a.toLowerCase().contains(lowerCase)) {
                                    arrayList5.add(s1Var2.b);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new l3(t1Var, i21, arrayList3, arrayList4, arrayList5, 3));
                            break;
                        } else {
                            int i24 = i15;
                            int i25 = i16;
                            TLRPC.User user2 = MessagesController.getInstance(i20).getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i18)).user_id));
                            if (t1Var.v || !user2.self) {
                                String[] strArr2 = new String[3];
                                strArr2[i19] = ContactsController.formatName(user2.first_name, user2.last_name).toLowerCase();
                                String translitString2 = LocaleController.getInstance().getTranslitString(strArr2[i19]);
                                strArr2[i24] = translitString2;
                                if (strArr2[i19].equals(translitString2)) {
                                    strArr2[i24] = null;
                                }
                                if (UserObject.isReplyUser(user2)) {
                                    strArr2[2] = LocaleController.getString(R.string.RepliesTitle).toLowerCase();
                                } else if (user2.self) {
                                    strArr2[2] = LocaleController.getString(R.string.SavedMessages).toLowerCase();
                                }
                                int i26 = i19;
                                int i27 = i26;
                                int i28 = i25;
                                while (true) {
                                    arrayList = arrayList2;
                                    if (i26 < i28) {
                                        String str2 = strArr[i26];
                                        i10 = i14;
                                        i11 = i28;
                                        for (int i29 = i19; i29 < 3; i29++) {
                                            String str3 = strArr2[i29];
                                            if (str3 != null && (str3.startsWith(str2) || bi.w(" ", str2, str3))) {
                                                i27 = i24;
                                                String publicUsername = UserObject.getPublicUsername(user2);
                                                i13 = (i27 == 0 || publicUsername == null || !publicUsername.startsWith(str2)) ? i27 : 2;
                                                if (i13 == 0) {
                                                    i12 = i24;
                                                    if (i13 == i12) {
                                                        arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str2));
                                                        obj = null;
                                                    } else {
                                                        obj = null;
                                                        arrayList4.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user2), null, "@" + str2));
                                                    }
                                                    arrayList3.add(user2);
                                                } else {
                                                    i26++;
                                                    i27 = i13;
                                                    i28 = i11;
                                                    arrayList2 = arrayList;
                                                    i14 = i10;
                                                }
                                            }
                                        }
                                        String publicUsername2 = UserObject.getPublicUsername(user2);
                                        if (i27 == 0) {
                                        }
                                        if (i13 == 0) {
                                        }
                                    } else {
                                        i10 = i14;
                                        i11 = i28;
                                        i12 = i24;
                                    }
                                }
                            } else {
                                arrayList = arrayList2;
                                i10 = i14;
                                i12 = i24;
                                i11 = i25;
                            }
                            i18++;
                            i15 = i12;
                            i17 = i19;
                            i16 = i11;
                            arrayList2 = arrayList;
                            i14 = i10;
                        }
                    }
                }
                break;
            case 2:
                ii.r0 r0Var = (ii.r0) this.d;
                ii.i1 i1Var = (ii.i1) this.e;
                o9 o9Var = (o9) this.f;
                ii.u0 u0Var = r0Var.a;
                int length2 = i1Var.length();
                int i30 = this.b;
                if (length2 >= i30 && i1Var.getSelectionStart() != i1Var.getSelectionEnd() && o9Var.j0(u0Var, 0, this.c, i30)) {
                    u0Var.n = true;
                    i1Var.setSelection(i30);
                    u0Var.n = false;
                    break;
                }
                break;
            case 3:
                a4.l lVar = (a4.l) this.d;
                ii.i1 i1Var2 = (ii.i1) this.e;
                o9 o9Var2 = (o9) this.f;
                i5 i5Var = (i5) lVar.b;
                int length3 = i1Var2.length();
                int i31 = this.b;
                if (length3 >= i31 && i1Var2.getSelectionStart() != i1Var2.getSelectionEnd()) {
                    if (o9Var2.x()) {
                        i5Var.w = true;
                        i1Var2.setSelection(i31);
                        i5Var.w = false;
                        break;
                    } else if (o9Var2.j0(i5Var, 0, this.c, i31)) {
                        i5Var.w = true;
                        i1Var2.setSelection(i31);
                        i5Var.w = false;
                        break;
                    }
                }
                break;
            case 4:
                pb.c cVar = (pb.c) this.d;
                ii.i1 i1Var3 = (ii.i1) this.e;
                o9 o9Var3 = (o9) this.f;
                q5 q5Var = (q5) cVar.b;
                int length4 = i1Var3.length();
                int i32 = this.b;
                if (length4 >= i32 && i1Var3.getSelectionStart() != i1Var3.getSelectionEnd() && o9Var3.j0(q5Var, 0, this.c, i32)) {
                    q5Var.G = true;
                    i1Var3.setSelection(i32);
                    q5Var.G = false;
                    break;
                }
                break;
            case 5:
                z5 z5Var = (z5) this.d;
                ii.i1 i1Var4 = (ii.i1) this.e;
                o9 o9Var4 = (o9) this.f;
                f6 f6Var = z5Var.a;
                int length5 = i1Var4.length();
                int i33 = this.b;
                if (length5 >= i33 && i1Var4.getSelectionStart() != i1Var4.getSelectionEnd()) {
                    if (o9Var4.x()) {
                        f6Var.F = true;
                        i1Var4.setSelection(i33);
                        f6Var.F = false;
                        break;
                    } else if (o9Var4.j0(f6Var, 0, this.c, i33)) {
                        f6Var.F = true;
                        i1Var4.setSelection(i33);
                        f6Var.F = false;
                        break;
                    }
                }
                break;
            case 6:
                a6 a6Var = (a6) this.d;
                ii.i1 i1Var5 = (ii.i1) this.e;
                o9 o9Var5 = (o9) this.f;
                f6 f6Var2 = a6Var.a;
                int length6 = i1Var5.length();
                int i34 = this.b;
                if (length6 >= i34 && i1Var5.getSelectionStart() != i1Var5.getSelectionEnd()) {
                    if (o9Var5.x()) {
                        f6Var2.n = true;
                        i1Var5.setSelection(i34);
                        f6Var2.n = false;
                        break;
                    } else if (o9Var5.j0(f6Var2, 1, this.c, i34)) {
                        f6Var2.n = true;
                        i1Var5.setSelection(i34);
                        f6Var2.n = false;
                        break;
                    }
                }
                break;
            case 7:
                ((MediaController) this.d).lambda$loadMoreMusic$11(this.b, (TLRPC.TL_error) this.e, (TLObject) this.f, this.c);
                break;
            default:
                zn znVar = (zn) this.d;
                CharacterStyle characterStyle = (CharacterStyle) this.e;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f;
                znVar.wb = this.b;
                znVar.xb = this.c;
                znVar.yb = characterStyle;
                u1Var.invalidate();
                break;
        }
    }

    public /* synthetic */ w4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.q qVar) {
        this.a = 0;
        this.b = i10;
        this.d = user;
        this.e = document;
        this.c = i11;
        this.f = qVar;
    }

    public /* synthetic */ w4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.f = obj3;
        this.c = i11;
    }

    public /* synthetic */ w4(zn znVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var) {
        this.a = 8;
        this.d = znVar;
        this.b = i10;
        this.c = i11;
        this.e = characterStyle;
        this.f = u1Var;
    }
}
