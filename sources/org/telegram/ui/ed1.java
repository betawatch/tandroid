package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ ed1(fd1 fd1Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = fd1Var;
        this.c = str;
        this.d = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                fd1 fd1Var = this.b;
                String str = this.c;
                int i10 = this.d;
                fd1Var.getClass();
                Utilities.searchQueue.postRunnable(new ed1(fd1Var, str, i10, 1));
                break;
            default:
                fd1 fd1Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                gd1 gd1Var = fd1Var2.h;
                ArrayList arrayList = gd1Var.f;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = null;
                if (lowerCase.length() != 0) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        arrayList2 = translitString;
                    }
                    int i12 = (arrayList2 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i12];
                    strArr[0] = lowerCase;
                    if (arrayList2 != null) {
                        strArr[1] = arrayList2;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int i13 = 0;
                    ArrayList arrayList4 = new ArrayList();
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
                                    String str3 = strArr[i13];
                                    if (!lowerCase2.startsWith(str3)) {
                                        int i17 = i13;
                                        if (!org.telegram.messenger.g0.w(" ", str3, lowerCase2)) {
                                            i13 = i17 + 1;
                                        }
                                    }
                                    i16 = 1;
                                    if (i16 == 0) {
                                        arrayList3.add(chat);
                                        arrayList4.add((String) gd1Var.h.get(i14));
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bz0(fd1Var2, i11, arrayList3, arrayList4, 14));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bz0(fd1Var2, i11, arrayList2, arrayList2, 14));
                    break;
                }
                break;
        }
    }
}
