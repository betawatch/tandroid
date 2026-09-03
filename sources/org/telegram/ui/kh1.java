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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lh1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ kh1(lh1 lh1Var, String str, boolean z4, boolean z10, int i10) {
        this.a = i10;
        this.b = lh1Var;
        this.c = str;
        this.d = z4;
        this.e = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00cd, code lost:
    
        if (r3 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e1, code lost:
    
        if (r4 == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017c A[LOOP:1: B:30:0x00fc->B:48:0x017c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        char c3;
        String str2;
        boolean z4;
        boolean z10;
        ArrayList arrayList;
        String str3;
        int i10;
        switch (this.a) {
            case 0:
                lh1 lh1Var = this.b;
                String str4 = this.c;
                boolean z11 = this.d;
                boolean z12 = this.e;
                lh1Var.getClass();
                AndroidUtilities.runOnUIThread(new kh1(lh1Var, str4, z11, z12, 1));
                break;
            case 1:
                lh1 lh1Var2 = this.b;
                String str5 = this.c;
                boolean z13 = this.d;
                boolean z14 = this.e;
                lh1Var2.f.g(str5, true, z13, z13, lh1Var2.v.D, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                kh1 kh1Var = new kh1(lh1Var2, str5, z14, z13, 2);
                lh1Var2.h = kh1Var;
                dispatchQueue.postRunnable(kh1Var);
                break;
            default:
                lh1 lh1Var3 = this.b;
                String str6 = this.c;
                boolean z15 = this.d;
                boolean z16 = this.e;
                ArrayList arrayList2 = lh1Var3.r;
                String lowerCase = str6.trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i11 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i11];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i12 = 0;
                    while (i12 < arrayList2.size()) {
                        TLObject tLObject = (TLObject) arrayList2.get(i12);
                        String[] strArr2 = new String[3];
                        boolean z17 = tLObject instanceof TLRPC.User;
                        if (!z17) {
                            str = null;
                            c3 = 1;
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            strArr2[0] = chat.title.toLowerCase();
                            str2 = chat.username;
                            break;
                        } else {
                            str = null;
                            TLRPC.User user = (TLRPC.User) tLObject;
                            c3 = 1;
                            strArr2[0] = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                            str2 = UserObject.getPublicUsername(user);
                            if (UserObject.isReplyUser(user)) {
                                strArr2[2] = LocaleController.getString(R.string.RepliesTitle).toLowerCase();
                            } else if (UserObject.isUserSelf(user)) {
                                if (lh1Var3.v.D) {
                                    strArr2[2] = LocaleController.getString(R.string.SavedMessages).toLowerCase();
                                }
                                z4 = z15;
                                z10 = z16;
                                arrayList = arrayList2;
                            } else if (user.bot) {
                            }
                            String translitString2 = LocaleController.getInstance().getTranslitString(strArr2[0]);
                            strArr2[c3] = translitString2;
                            if (strArr2[0].equals(translitString2)) {
                                strArr2[c3] = str;
                            }
                            int i13 = 0;
                            char c10 = 0;
                            while (i13 < i11) {
                                z4 = z15;
                                String str7 = strArr[i13];
                                z10 = z16;
                                arrayList = arrayList2;
                                int i14 = 0;
                                while (i14 < 3) {
                                    String str8 = strArr2[i14];
                                    if (str8 != null) {
                                        if (!str8.startsWith(str7)) {
                                            i10 = i14;
                                            if (org.telegram.messenger.y3.w(" ", str7, str8)) {
                                            }
                                        }
                                        c10 = 1;
                                        if (c10 == 0 && str2 != null && str2.toLowerCase().startsWith(str7)) {
                                            c10 = 2;
                                        }
                                        if (c10 == 0) {
                                            if (c10 != 1) {
                                                str3 = str;
                                                arrayList4.add(AndroidUtilities.generateSearchName(yh.k("@", str2), str3, "@" + str7));
                                            } else if (z17) {
                                                TLRPC.User user2 = (TLRPC.User) tLObject;
                                                arrayList4.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str7));
                                                str3 = str;
                                            } else {
                                                str3 = str;
                                                arrayList4.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, str3, str7));
                                            }
                                            arrayList3.add(tLObject);
                                        } else {
                                            i13++;
                                            arrayList2 = arrayList;
                                            z15 = z4;
                                            z16 = z10;
                                        }
                                    } else {
                                        i10 = i14;
                                    }
                                    i14 = i10 + 1;
                                }
                                if (c10 == 0) {
                                    c10 = 2;
                                }
                                if (c10 == 0) {
                                }
                            }
                            z4 = z15;
                            z10 = z16;
                            arrayList = arrayList2;
                        }
                        i12++;
                        arrayList2 = arrayList;
                        z15 = z4;
                        z16 = z10;
                    }
                    AndroidUtilities.runOnUIThread(new ld1(lh1Var3, arrayList3, arrayList4, 6));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new ld1(lh1Var3, new ArrayList(), new ArrayList(), 6));
                    break;
                }
        }
    }
}
