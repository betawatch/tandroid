package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ b8 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ a8(b8 b8Var, String str, ArrayList arrayList) {
        this.b = b8Var;
        this.d = str;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        String str;
        int i10 = this.a;
        String str2 = this.d;
        ArrayList arrayList = this.c;
        b8 b8Var = this.b;
        switch (i10) {
            case 0:
                b8Var.getClass();
                String lowerCase = str2.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new a8(b8Var, new ArrayList(), str2));
                    break;
                } else {
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
                    ArrayList arrayList2 = new ArrayList();
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i12);
                        int i13 = 0;
                        while (true) {
                            if (i13 < i11) {
                                String str3 = strArr[i13];
                                String documentName = messageObject.getDocumentName();
                                if (documentName != null && documentName.length() != 0) {
                                    if (documentName.toLowerCase().contains(str3)) {
                                        arrayList2.add(messageObject);
                                    } else {
                                        TLRPC.Document document = messageObject.type == 0 ? messageObject.messageOwner.media.webpage.document : messageObject.messageOwner.media.document;
                                        int i14 = 0;
                                        while (true) {
                                            if (i14 < document.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i14);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                    String str4 = documentAttribute.performer;
                                                    z4 = str4 != null ? str4.toLowerCase().contains(str3) : false;
                                                    if (!z4 && (str = documentAttribute.title) != null) {
                                                        z4 = str.toLowerCase().contains(str3);
                                                    }
                                                } else {
                                                    i14++;
                                                }
                                            } else {
                                                z4 = false;
                                            }
                                        }
                                        if (z4) {
                                            arrayList2.add(messageObject);
                                        }
                                    }
                                }
                                i13++;
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new a8(b8Var, arrayList2, str2));
                    break;
                }
                break;
            default:
                c8 c8Var = b8Var.n;
                if (c8Var.h) {
                    c8Var.f = true;
                    b8Var.d = arrayList;
                    b8Var.e = str2;
                    b8Var.l();
                    c8Var.r.n0(0);
                    org.telegram.ui.b.o(R.string.NoAudioFoundPlayerInfo, new Object[]{str2}, c8Var.y);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a8(b8 b8Var, ArrayList arrayList, String str) {
        this.b = b8Var;
        this.c = arrayList;
        this.d = str;
    }
}
