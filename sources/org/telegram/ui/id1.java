package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class id1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jd1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ id1(jd1 jd1Var, String str, int i9, int i10) {
        this.a = i10;
        this.b = jd1Var;
        this.c = str;
        this.d = i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                jd1 jd1Var = this.b;
                String str = this.c;
                int i9 = this.d;
                jd1Var.getClass();
                Utilities.searchQueue.postRunnable(new id1(jd1Var, str, i9, 1));
                break;
            default:
                jd1 jd1Var2 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                kd1 kd1Var = jd1Var2.h;
                ArrayList arrayList = kd1Var.f;
                String lowerCase = str2.trim().toLowerCase();
                String str3 = null;
                if (lowerCase.length() != 0) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        str3 = translitString;
                    }
                    int i11 = (str3 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i11];
                    strArr[0] = lowerCase;
                    if (str3 != null) {
                        strArr[1] = str3;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = 0;
                    ArrayList arrayList3 = new ArrayList();
                    int i13 = 0;
                    while (i13 < arrayList.size()) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i13);
                        int i14 = 0;
                        boolean z10 = false;
                        while (true) {
                            if (i14 >= 2) {
                                break;
                            }
                            String publicUsername = i14 == 0 ? chat.title : ChatObject.getPublicUsername(chat);
                            if (publicUsername != null) {
                                String lowerCase2 = publicUsername.toLowerCase();
                                while (i12 < i11) {
                                    String str4 = strArr[i12];
                                    if (!lowerCase2.startsWith(str4)) {
                                        int i15 = i12;
                                        if (!org.telegram.messenger.l0.w(" ", str4, lowerCase2)) {
                                            i12 = i15 + 1;
                                        }
                                    }
                                    z10 = true;
                                    if (!z10) {
                                        arrayList2.add(chat);
                                        arrayList3.add((String) kd1Var.h.get(i13));
                                    }
                                }
                                if (!z10) {
                                }
                            }
                            i14++;
                            i12 = 0;
                        }
                        i13++;
                        i12 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.y01(jd1Var2, i10, arrayList2, arrayList3, 12));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.y01(jd1Var2, i10, str3, str3, 12));
                    break;
                }
                break;
        }
    }
}
