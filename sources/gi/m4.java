package gi;

import ai.vb;
import android.content.Context;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import ki.c6;
import ki.g5;
import ki.o5;
import ki.w5;
import ki.x5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.Wallet.q5;
import org.telegram.ui.Wallet.s5;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 7;
        this.d = mediaController;
        this.b = i10;
        this.e = tL_error;
        this.f = tLObject;
        this.c = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x02f6 A[LOOP:1: B:108:0x027e->B:128:0x02f6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b7 A[SYNTHETIC] */
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
                r4.g(this.b, user, document, this.c, new h4((org.telegram.ui.web.r) this.f, document, 0));
                break;
            case 1:
                hg.t1 t1Var = (hg.t1) this.d;
                String str = (String) this.e;
                ArrayList arrayList2 = (ArrayList) this.f;
                t1Var.getClass();
                String lowerCase = str.trim().toLowerCase();
                int length = lowerCase.length();
                int i14 = this.b;
                if (length == 0) {
                    AndroidUtilities.runOnUIThread(new vb(t1Var, i14, new ArrayList(), new ArrayList(), t1Var.H, 4));
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
                                    hg.s1 s1Var = new hg.s1();
                                    s1Var.b = contact2;
                                    s1Var.a = (contact2.first_name + " " + contact2.last_name).toLowerCase();
                                    (contact2.last_name + " " + contact2.first_name).toLowerCase();
                                    t1Var.G.add(s1Var);
                                }
                            }
                            for (int i23 = i19; i23 < t1Var.G.size(); i23++) {
                                hg.s1 s1Var2 = (hg.s1) t1Var.G.get(i23);
                                if ((translitString != null && (s1Var2.a.toLowerCase().contains(translitString) || s1Var2.a.toLowerCase().contains(translitString))) || s1Var2.a.toLowerCase().contains(lowerCase) || s1Var2.a.toLowerCase().contains(lowerCase)) {
                                    arrayList5.add(s1Var2.b);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new vb(t1Var, i21, arrayList3, arrayList4, arrayList5, 4));
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
                                            if (str3 != null && (str3.startsWith(str2) || org.telegram.messenger.v0.w(" ", str2, str3))) {
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
                ki.q0 q0Var = (ki.q0) this.d;
                ki.h1 h1Var = (ki.h1) this.e;
                o9 o9Var = (o9) this.f;
                ki.t0 t0Var = q0Var.a;
                int length2 = h1Var.length();
                int i30 = this.b;
                if (length2 >= i30 && h1Var.getSelectionStart() != h1Var.getSelectionEnd() && o9Var.j0(t0Var, 0, this.c, i30)) {
                    t0Var.n = true;
                    h1Var.setSelection(i30);
                    t0Var.n = false;
                    break;
                }
                break;
            case 3:
                k2.w0 w0Var = (k2.w0) this.d;
                ki.h1 h1Var2 = (ki.h1) this.e;
                o9 o9Var2 = (o9) this.f;
                g5 g5Var = (g5) w0Var.b;
                int length3 = h1Var2.length();
                int i31 = this.b;
                if (length3 >= i31 && h1Var2.getSelectionStart() != h1Var2.getSelectionEnd()) {
                    if (o9Var2.x()) {
                        g5Var.w = true;
                        h1Var2.setSelection(i31);
                        g5Var.w = false;
                        break;
                    } else if (o9Var2.j0(g5Var, 0, this.c, i31)) {
                        g5Var.w = true;
                        h1Var2.setSelection(i31);
                        g5Var.w = false;
                        break;
                    }
                }
                break;
            case 4:
                ya.c cVar = (ya.c) this.d;
                ki.h1 h1Var3 = (ki.h1) this.e;
                o9 o9Var3 = (o9) this.f;
                o5 o5Var = (o5) cVar.b;
                int length4 = h1Var3.length();
                int i32 = this.b;
                if (length4 >= i32 && h1Var3.getSelectionStart() != h1Var3.getSelectionEnd() && o9Var3.j0(o5Var, 0, this.c, i32)) {
                    o5Var.G = true;
                    h1Var3.setSelection(i32);
                    o5Var.G = false;
                    break;
                }
                break;
            case 5:
                w5 w5Var = (w5) this.d;
                ki.h1 h1Var4 = (ki.h1) this.e;
                o9 o9Var4 = (o9) this.f;
                c6 c6Var = w5Var.a;
                int length5 = h1Var4.length();
                int i33 = this.b;
                if (length5 >= i33 && h1Var4.getSelectionStart() != h1Var4.getSelectionEnd()) {
                    if (o9Var4.x()) {
                        c6Var.F = true;
                        h1Var4.setSelection(i33);
                        c6Var.F = false;
                        break;
                    } else if (o9Var4.j0(c6Var, 0, this.c, i33)) {
                        c6Var.F = true;
                        h1Var4.setSelection(i33);
                        c6Var.F = false;
                        break;
                    }
                }
                break;
            case 6:
                x5 x5Var = (x5) this.d;
                ki.h1 h1Var5 = (ki.h1) this.e;
                o9 o9Var5 = (o9) this.f;
                c6 c6Var2 = x5Var.a;
                int length6 = h1Var5.length();
                int i34 = this.b;
                if (length6 >= i34 && h1Var5.getSelectionStart() != h1Var5.getSelectionEnd()) {
                    if (o9Var5.x()) {
                        c6Var2.n = true;
                        h1Var5.setSelection(i34);
                        c6Var2.n = false;
                        break;
                    } else if (o9Var5.j0(c6Var2, 1, this.c, i34)) {
                        c6Var2.n = true;
                        h1Var5.setSelection(i34);
                        c6Var2.n = false;
                        break;
                    }
                }
                break;
            case 7:
                ((MediaController) this.d).lambda$loadMoreMusic$11(this.b, (TLRPC.TL_error) this.e, (TLObject) this.f, this.c);
                break;
            case 8:
                sn snVar = (sn) this.d;
                CharacterStyle characterStyle = (CharacterStyle) this.e;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.f;
                snVar.Jb = this.b;
                snVar.Kb = this.c;
                snVar.Lb = characterStyle;
                t1Var2.invalidate();
                break;
            default:
                s5 s5Var = (s5) this.d;
                Context context = (Context) this.e;
                q5 q5Var = (q5) this.f;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h(s5Var, new p5(context.getApplicationContext(), this.b, this.c, q5Var), q5Var, 13));
                break;
        }
    }

    public /* synthetic */ m4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.r rVar) {
        this.a = 0;
        this.b = i10;
        this.d = user;
        this.e = document;
        this.c = i11;
        this.f = rVar;
    }

    public /* synthetic */ m4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.f = obj3;
        this.c = i11;
    }

    public /* synthetic */ m4(sn snVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.t1 t1Var) {
        this.a = 8;
        this.d = snVar;
        this.b = i10;
        this.c = i11;
        this.e = characterStyle;
        this.f = t1Var;
    }

    public /* synthetic */ m4(s5 s5Var, Context context, int i10, int i11, q5 q5Var) {
        this.a = 9;
        this.d = s5Var;
        this.e = context;
        this.b = i10;
        this.c = i11;
        this.f = q5Var;
    }
}
