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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class og1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ og1(pg1 pg1Var, String str, boolean z10, boolean z11, int i9) {
        this.a = i9;
        this.b = pg1Var;
        this.c = str;
        this.d = z10;
        this.e = z11;
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
        char c10;
        String str2;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        String str3;
        int i9;
        switch (this.a) {
            case 0:
                pg1 pg1Var = this.b;
                String str4 = this.c;
                boolean z12 = this.d;
                boolean z13 = this.e;
                pg1Var.getClass();
                AndroidUtilities.runOnUIThread(new og1(pg1Var, str4, z12, z13, 1));
                break;
            case 1:
                pg1 pg1Var2 = this.b;
                String str5 = this.c;
                boolean z14 = this.d;
                boolean z15 = this.e;
                pg1Var2.f.g(str5, true, z14, z14, pg1Var2.v.C, 0L, false, 0, 0);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                og1 og1Var = new og1(pg1Var2, str5, z15, z14, 2);
                pg1Var2.h = og1Var;
                dispatchQueue.postRunnable(og1Var);
                break;
            default:
                pg1 pg1Var3 = this.b;
                String str6 = this.c;
                boolean z16 = this.d;
                boolean z17 = this.e;
                ArrayList arrayList2 = pg1Var3.r;
                String lowerCase = str6.trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i10 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i10];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i11 = 0;
                    while (i11 < arrayList2.size()) {
                        TLObject tLObject = (TLObject) arrayList2.get(i11);
                        String[] strArr2 = new String[3];
                        boolean z18 = tLObject instanceof TLRPC.User;
                        if (!z18) {
                            str = null;
                            c10 = 1;
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            strArr2[0] = chat.title.toLowerCase();
                            str2 = chat.username;
                            break;
                        } else {
                            str = null;
                            TLRPC.User user = (TLRPC.User) tLObject;
                            c10 = 1;
                            strArr2[0] = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                            str2 = UserObject.getPublicUsername(user);
                            if (UserObject.isReplyUser(user)) {
                                strArr2[2] = LocaleController.getString(R.string.RepliesTitle).toLowerCase();
                            } else if (UserObject.isUserSelf(user)) {
                                if (pg1Var3.v.C) {
                                    strArr2[2] = LocaleController.getString(R.string.SavedMessages).toLowerCase();
                                }
                                z10 = z16;
                                z11 = z17;
                                arrayList = arrayList2;
                            } else if (user.bot) {
                            }
                            String translitString2 = LocaleController.getInstance().getTranslitString(strArr2[0]);
                            strArr2[c10] = translitString2;
                            if (strArr2[0].equals(translitString2)) {
                                strArr2[c10] = str;
                            }
                            int i12 = 0;
                            char c11 = 0;
                            while (i12 < i10) {
                                z10 = z16;
                                String str7 = strArr[i12];
                                z11 = z17;
                                arrayList = arrayList2;
                                int i13 = 0;
                                while (i13 < 3) {
                                    String str8 = strArr2[i13];
                                    if (str8 != null) {
                                        if (!str8.startsWith(str7)) {
                                            i9 = i13;
                                            if (org.telegram.messenger.l0.w(" ", str7, str8)) {
                                            }
                                        }
                                        c11 = 1;
                                        if (c11 == 0 && str2 != null && str2.toLowerCase().startsWith(str7)) {
                                            c11 = 2;
                                        }
                                        if (c11 == 0) {
                                            if (c11 != 1) {
                                                str3 = str;
                                                arrayList4.add(AndroidUtilities.generateSearchName(ta.b.d("@", str2), str3, "@" + str7));
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
                                            i12++;
                                            arrayList2 = arrayList;
                                            z16 = z10;
                                            z17 = z11;
                                        }
                                    } else {
                                        i9 = i13;
                                    }
                                    i13 = i9 + 1;
                                }
                                if (c11 == 0) {
                                    c11 = 2;
                                }
                                if (c11 == 0) {
                                }
                            }
                            z10 = z16;
                            z11 = z17;
                            arrayList = arrayList2;
                        }
                        i11++;
                        arrayList2 = arrayList;
                        z16 = z10;
                        z17 = z11;
                    }
                    AndroidUtilities.runOnUIThread(new qc1(pg1Var3, arrayList3, arrayList4, 6));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new qc1(pg1Var3, new ArrayList(), new ArrayList(), 6));
                    break;
                }
        }
    }
}
