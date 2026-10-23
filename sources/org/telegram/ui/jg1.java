package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ jg1(kg1 kg1Var, String str, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = kg1Var;
        this.c = str;
        this.d = z10;
        this.e = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ce, code lost:
    
        if (r3 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e2, code lost:
    
        if (r4 == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0182 A[LOOP:1: B:30:0x00fe->B:48:0x0182, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013b A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        String str;
        String str2;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        int i11;
        String str3;
        int i12;
        switch (this.a) {
            case 0:
                kg1 kg1Var = this.b;
                String str4 = this.c;
                boolean z12 = this.d;
                boolean z13 = this.e;
                kg1Var.getClass();
                AndroidUtilities.runOnUIThread(new jg1(kg1Var, str4, z12, z13, 1));
                break;
            case 1:
                kg1 kg1Var2 = this.b;
                String str5 = this.c;
                boolean z14 = this.d;
                boolean z15 = this.e;
                kg1Var2.f.g(str5, true, z14, z14, kg1Var2.v.G, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                jg1 jg1Var = new jg1(kg1Var2, str5, z15, z14, 2);
                kg1Var2.h = jg1Var;
                dispatchQueue.postRunnable(jg1Var);
                break;
            default:
                kg1 kg1Var3 = this.b;
                String str6 = this.c;
                boolean z16 = this.d;
                boolean z17 = this.e;
                ArrayList arrayList2 = kg1Var3.r;
                String lowerCase = str6.trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i13 = 0;
                    int i14 = 1;
                    int i15 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i15];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i16 = 0;
                    while (i16 < arrayList2.size()) {
                        TLObject tLObject = (TLObject) arrayList2.get(i16);
                        String[] strArr2 = new String[3];
                        int i17 = i13;
                        boolean z18 = tLObject instanceof TLRPC.User;
                        if (!z18) {
                            i10 = i14;
                            str = null;
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            strArr2[i17] = chat.title.toLowerCase();
                            str2 = chat.username;
                            break;
                        } else {
                            str = null;
                            TLRPC.User user = (TLRPC.User) tLObject;
                            i10 = i14;
                            strArr2[i17] = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                            str2 = UserObject.getPublicUsername(user);
                            if (UserObject.isReplyUser(user)) {
                                strArr2[2] = LocaleController.getString(R.string.RepliesTitle).toLowerCase();
                            } else if (UserObject.isUserSelf(user)) {
                                if (kg1Var3.v.G) {
                                    strArr2[2] = LocaleController.getString(R.string.SavedMessages).toLowerCase();
                                }
                                z10 = z16;
                                z11 = z17;
                                arrayList = arrayList2;
                                i11 = i10;
                            } else if (user.bot) {
                            }
                            String translitString2 = LocaleController.getInstance().getTranslitString(strArr2[i17]);
                            strArr2[i10] = translitString2;
                            if (strArr2[i17].equals(translitString2)) {
                                strArr2[i10] = str;
                            }
                            int i18 = i17;
                            int i19 = i18;
                            while (i18 < i15) {
                                z10 = z16;
                                String str7 = strArr[i18];
                                z11 = z17;
                                arrayList = arrayList2;
                                int i20 = i17;
                                while (i20 < 3) {
                                    String str8 = strArr2[i20];
                                    if (str8 != null) {
                                        if (!str8.startsWith(str7)) {
                                            i12 = i20;
                                            if (org.telegram.messenger.g0.w(" ", str7, str8)) {
                                            }
                                        }
                                        i19 = i10;
                                        if (i19 == 0 && str2 != null && str2.toLowerCase().startsWith(str7)) {
                                            i19 = 2;
                                        }
                                        if (i19 == 0) {
                                            i11 = i10;
                                            if (i19 != i11) {
                                                str3 = str;
                                                arrayList4.add(AndroidUtilities.generateSearchName(r4.c.h("@", str2), str3, "@" + str7));
                                            } else if (z18) {
                                                TLRPC.User user2 = (TLRPC.User) tLObject;
                                                arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str7));
                                                str3 = str;
                                            } else {
                                                str3 = str;
                                                arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, str3, str7));
                                            }
                                            arrayList3.add(tLObject);
                                        } else {
                                            i18++;
                                            arrayList2 = arrayList;
                                            z16 = z10;
                                            z17 = z11;
                                        }
                                    } else {
                                        i12 = i20;
                                    }
                                    i20 = i12 + 1;
                                }
                                if (i19 == 0) {
                                    i19 = 2;
                                }
                                if (i19 == 0) {
                                }
                            }
                            z10 = z16;
                            z11 = z17;
                            arrayList = arrayList2;
                            i11 = i10;
                        }
                        i16++;
                        i14 = i11;
                        i13 = i17;
                        arrayList2 = arrayList;
                        z16 = z10;
                        z17 = z11;
                    }
                    AndroidUtilities.runOnUIThread(new f71(kg1Var3, arrayList3, arrayList4, 7));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new f71(kg1Var3, new ArrayList(), new ArrayList(), 7));
                    break;
                }
        }
    }
}
