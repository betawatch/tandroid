package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ l8 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ k8(l8 l8Var, String str, ArrayList arrayList) {
        this.b = l8Var;
        this.d = str;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        String str;
        int i10 = this.a;
        String str2 = this.d;
        ArrayList arrayList = this.c;
        l8 l8Var = this.b;
        switch (i10) {
            case 0:
                l8Var.getClass();
                String lowerCase = str2.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new k8(l8Var, new ArrayList(), str2));
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
                                                    z10 = str4 != null ? str4.toLowerCase().contains(str3) : false;
                                                    if (!z10 && (str = documentAttribute.title) != null) {
                                                        z10 = str.toLowerCase().contains(str3);
                                                    }
                                                } else {
                                                    i14++;
                                                }
                                            } else {
                                                z10 = false;
                                            }
                                        }
                                        if (z10) {
                                            arrayList2.add(messageObject);
                                        }
                                    }
                                }
                                i13++;
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new k8(l8Var, arrayList2, str2));
                    break;
                }
                break;
            default:
                m8 m8Var = l8Var.n;
                if (m8Var.h) {
                    m8Var.f = true;
                    l8Var.d = arrayList;
                    l8Var.e = str2;
                    l8Var.l();
                    m8Var.r.n0(0);
                    org.telegram.messenger.vh.o(R.string.NoAudioFoundPlayerInfo, new Object[]{str2}, m8Var.x);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ k8(l8 l8Var, ArrayList arrayList, String str) {
        this.b = l8Var;
        this.c = arrayList;
        this.d = str;
    }
}
