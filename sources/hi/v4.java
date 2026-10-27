package hi;

import android.content.Context;
import android.text.style.CharacterStyle;
import bi.sb;
import java.util.ArrayList;
import li.d6;
import li.g5;
import li.h5;
import li.p5;
import li.x5;
import li.y5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Wallet.n5;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.Wallet.r5;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v4(int i10, int i11, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
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
                a5.g(this.b, user, document, this.c, new q4((org.telegram.ui.web.r) this.f, document, 0));
                break;
            case 1:
                ig.t1 t1Var = (ig.t1) this.d;
                String str = (String) this.e;
                ArrayList arrayList2 = (ArrayList) this.f;
                t1Var.getClass();
                String lowerCase = str.trim().toLowerCase();
                int length = lowerCase.length();
                int i14 = this.b;
                if (length == 0) {
                    AndroidUtilities.runOnUIThread(new sb(t1Var, i14, new ArrayList(), new ArrayList(), t1Var.H, 5));
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
                                    ig.s1 s1Var = new ig.s1();
                                    s1Var.b = contact2;
                                    s1Var.a = (contact2.first_name + " " + contact2.last_name).toLowerCase();
                                    (contact2.last_name + " " + contact2.first_name).toLowerCase();
                                    t1Var.G.add(s1Var);
                                }
                            }
                            for (int i23 = i19; i23 < t1Var.G.size(); i23++) {
                                ig.s1 s1Var2 = (ig.s1) t1Var.G.get(i23);
                                if ((translitString != null && (s1Var2.a.toLowerCase().contains(translitString) || s1Var2.a.toLowerCase().contains(translitString))) || s1Var2.a.toLowerCase().contains(lowerCase) || s1Var2.a.toLowerCase().contains(lowerCase)) {
                                    arrayList5.add(s1Var2.b);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new sb(t1Var, i21, arrayList3, arrayList4, arrayList5, 5));
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
                                            if (str3 != null && (str3.startsWith(str2) || wh.u(" ", str2, str3))) {
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
                li.p0 p0Var = (li.p0) this.d;
                li.g1 g1Var = (li.g1) this.e;
                s9 s9Var = (s9) this.f;
                li.s0 s0Var = p0Var.a;
                int length2 = g1Var.length();
                int i30 = this.b;
                if (length2 >= i30 && g1Var.getSelectionStart() != g1Var.getSelectionEnd() && s9Var.j0(s0Var, 0, this.c, i30)) {
                    s0Var.n = true;
                    g1Var.setSelection(i30);
                    s0Var.n = false;
                    break;
                }
                break;
            case 3:
                li.e3 e3Var = (li.e3) this.d;
                li.g1 g1Var2 = (li.g1) this.e;
                s9 s9Var2 = (s9) this.f;
                g5 g5Var = (g5) e3Var.b;
                int length3 = g1Var2.length();
                int i31 = this.b;
                if (length3 >= i31 && g1Var2.getSelectionStart() != g1Var2.getSelectionEnd()) {
                    if (s9Var2.x()) {
                        g5Var.w = true;
                        g1Var2.setSelection(i31);
                        g5Var.w = false;
                        break;
                    } else if (s9Var2.j0(g5Var, 0, this.c, i31)) {
                        g5Var.w = true;
                        g1Var2.setSelection(i31);
                        g5Var.w = false;
                        break;
                    }
                }
                break;
            case 4:
                h5 h5Var = (h5) this.d;
                li.g1 g1Var3 = (li.g1) this.e;
                s9 s9Var3 = (s9) this.f;
                p5 p5Var = (p5) h5Var.a;
                int length4 = g1Var3.length();
                int i32 = this.b;
                if (length4 >= i32 && g1Var3.getSelectionStart() != g1Var3.getSelectionEnd() && s9Var3.j0(p5Var, 0, this.c, i32)) {
                    p5Var.G = true;
                    g1Var3.setSelection(i32);
                    p5Var.G = false;
                    break;
                }
                break;
            case 5:
                x5 x5Var = (x5) this.d;
                li.g1 g1Var4 = (li.g1) this.e;
                s9 s9Var4 = (s9) this.f;
                d6 d6Var = x5Var.a;
                int length5 = g1Var4.length();
                int i33 = this.b;
                if (length5 >= i33 && g1Var4.getSelectionStart() != g1Var4.getSelectionEnd()) {
                    if (s9Var4.x()) {
                        d6Var.F = true;
                        g1Var4.setSelection(i33);
                        d6Var.F = false;
                        break;
                    } else if (s9Var4.j0(d6Var, 0, this.c, i33)) {
                        d6Var.F = true;
                        g1Var4.setSelection(i33);
                        d6Var.F = false;
                        break;
                    }
                }
                break;
            case 6:
                y5 y5Var = (y5) this.d;
                li.g1 g1Var5 = (li.g1) this.e;
                s9 s9Var5 = (s9) this.f;
                d6 d6Var2 = y5Var.a;
                int length6 = g1Var5.length();
                int i34 = this.b;
                if (length6 >= i34 && g1Var5.getSelectionStart() != g1Var5.getSelectionEnd()) {
                    if (s9Var5.x()) {
                        d6Var2.n = true;
                        g1Var5.setSelection(i34);
                        d6Var2.n = false;
                        break;
                    } else if (s9Var5.j0(d6Var2, 1, this.c, i34)) {
                        d6Var2.n = true;
                        g1Var5.setSelection(i34);
                        d6Var2.n = false;
                        break;
                    }
                }
                break;
            case 7:
                ((MediaController) this.d).lambda$loadMoreMusic$11(this.b, (TLRPC.TL_error) this.e, (TLObject) this.f, this.c);
                break;
            case 8:
                wn wnVar = (wn) this.d;
                CharacterStyle characterStyle = (CharacterStyle) this.e;
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) this.f;
                wnVar.Wb = this.b;
                wnVar.Xb = this.c;
                wnVar.Yb = characterStyle;
                s1Var3.invalidate();
                break;
            default:
                r5 r5Var = (r5) this.d;
                Context context = (Context) this.e;
                o5 o5Var = (o5) this.f;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.h(r5Var, new n5(context.getApplicationContext(), this.b, this.c, o5Var), o5Var, 13));
                break;
        }
    }

    public /* synthetic */ v4(int i10, TLRPC.User user, TLRPC.Document document, int i11, org.telegram.ui.web.r rVar) {
        this.a = 0;
        this.b = i10;
        this.d = user;
        this.e = document;
        this.c = i11;
        this.f = rVar;
    }

    public /* synthetic */ v4(Object obj, Object obj2, int i10, Object obj3, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.f = obj3;
        this.c = i11;
    }

    public /* synthetic */ v4(wn wnVar, int i10, int i11, CharacterStyle characterStyle, org.telegram.ui.Cells.s1 s1Var) {
        this.a = 8;
        this.d = wnVar;
        this.b = i10;
        this.c = i11;
        this.e = characterStyle;
        this.f = s1Var;
    }

    public /* synthetic */ v4(r5 r5Var, Context context, int i10, int i11, o5 o5Var) {
        this.a = 9;
        this.d = r5Var;
        this.e = context;
        this.b = i10;
        this.c = i11;
        this.f = o5Var;
    }
}
