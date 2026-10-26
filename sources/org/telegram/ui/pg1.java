package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ pg1(qg1 qg1Var, String str, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = qg1Var;
        this.c = str;
        this.d = z10;
        this.e = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00cf, code lost:
    
        if (r3 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e3, code lost:
    
        if (r4 == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0183 A[LOOP:1: B:30:0x00ff->B:48:0x0183, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013c A[SYNTHETIC] */
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
                qg1 qg1Var = this.b;
                String str4 = this.c;
                boolean z12 = this.d;
                boolean z13 = this.e;
                qg1Var.getClass();
                AndroidUtilities.runOnUIThread(new pg1(qg1Var, str4, z12, z13, 1));
                break;
            case 1:
                qg1 qg1Var2 = this.b;
                String str5 = this.c;
                boolean z14 = this.d;
                boolean z15 = this.e;
                qg1Var2.f.g(str5, true, z14, z14, qg1Var2.v.G, 0L, false, 0, 0);
                DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
                pg1 pg1Var = new pg1(qg1Var2, str5, z15, z14, 2);
                qg1Var2.h = pg1Var;
                dispatchQueue2.postRunnable(pg1Var);
                break;
            default:
                qg1 qg1Var3 = this.b;
                String str6 = this.c;
                boolean z16 = this.d;
                boolean z17 = this.e;
                ArrayList arrayList2 = qg1Var3.r;
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
                                if (qg1Var3.v.G) {
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
                                            if (org.telegram.messenger.vh.u(" ", str7, str8)) {
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
                                                arrayList4.add(AndroidUtilities.generateSearchName(org.telegram.ui.Components.b10.j("@", str2), str3, "@" + str7));
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
                    AndroidUtilities.runOnUIThread(new h71(qg1Var3, arrayList3, arrayList4, 9));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new h71(qg1Var3, new ArrayList(), new ArrayList(), 9));
                    break;
                }
        }
    }
}
