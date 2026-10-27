package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qd1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ pd1(qd1 qd1Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = qd1Var;
        this.c = str;
        this.d = i10;
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
                qd1 qd1Var = this.b;
                String str = this.c;
                int i10 = this.d;
                qd1Var.getClass();
                Utilities.searchQueue.postRunnable(new pd1(qd1Var, str, i10, 1));
                break;
            default:
                qd1 qd1Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                rd1 rd1Var = qd1Var2.h;
                ArrayList arrayList = rd1Var.f;
                String lowerCase = str2.trim().toLowerCase();
                String str3 = null;
                if (lowerCase.length() != 0) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        str3 = translitString;
                    }
                    int i12 = (str3 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i12];
                    strArr[0] = lowerCase;
                    if (str3 != null) {
                        strArr[1] = str3;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    ArrayList arrayList3 = new ArrayList();
                    int i14 = 0;
                    while (i14 < arrayList.size()) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i14);
                        int i15 = i13;
                        int i16 = i15;
                        while (true) {
                            if (i15 >= 2) {
                                break;
                            }
                            String publicUsername = i15 == 0 ? chat.title : ChatObject.getPublicUsername(chat);
                            if (publicUsername != null) {
                                String lowerCase2 = publicUsername.toLowerCase();
                                while (i13 < i12) {
                                    String str4 = strArr[i13];
                                    if (!lowerCase2.startsWith(str4)) {
                                        int i17 = i13;
                                        if (!org.telegram.messenger.wh.u(" ", str4, lowerCase2)) {
                                            i13 = i17 + 1;
                                        }
                                    }
                                    i16 = 1;
                                    if (i16 == 0) {
                                        arrayList2.add(chat);
                                        arrayList3.add((String) rd1Var.h.get(i14));
                                    }
                                }
                                if (i16 == 0) {
                                }
                            }
                            i15++;
                            i13 = 0;
                        }
                        i14++;
                        i13 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.as0(qd1Var2, i11, arrayList2, arrayList3, 17));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.as0(qd1Var2, i11, str3, str3, 17));
                    break;
                }
                break;
        }
    }
}
