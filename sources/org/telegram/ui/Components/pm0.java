package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class pm0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ wm0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ pm0(wm0 wm0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.b = wm0Var;
        this.c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wm0 wm0Var = this.b;
                int i10 = wm0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.c;
                    if (i11 >= size) {
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList4 = this.e;
                            if (i12 >= arrayList4.size()) {
                                AndroidUtilities.runOnUIThread(new pm0(wm0Var, str, arrayList, arrayList2));
                                break;
                            } else {
                                String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList4.get(i12)).getDocument());
                                if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                                    MessageObject messageObject = new MessageObject(i10, ((MessageObject) arrayList4.get(i12)).messageOwner, false, false);
                                    messageObject.mediaExists = ((MessageObject) arrayList4.get(i12)).mediaExists;
                                    messageObject.setQuery(wm0Var.K);
                                    arrayList2.add(messageObject);
                                }
                                i12++;
                            }
                        }
                    } else {
                        String documentFileName2 = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i11)).getDocument());
                        if (documentFileName2 != null && documentFileName2.toLowerCase().contains(str)) {
                            MessageObject messageObject2 = new MessageObject(i10, ((MessageObject) arrayList3.get(i11)).messageOwner, false, false);
                            messageObject2.mediaExists = ((MessageObject) arrayList3.get(i11)).mediaExists;
                            messageObject2.setQuery(wm0Var.K);
                            arrayList.add(messageObject2);
                        }
                        i11++;
                    }
                }
                break;
            default:
                wm0 wm0Var2 = this.b;
                xw0 xw0Var = wm0Var2.a;
                if (this.c.equals(wm0Var2.L)) {
                    if (wm0Var2.r == 0) {
                        wm0Var2.N.b(0);
                    }
                    wm0Var2.e(this.d, this.e, true);
                    if (wm0Var2.r == 0) {
                        xw0Var.e(false, true);
                        d90 d90Var = xw0Var.e;
                        xw0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        d90Var.setVisibility(0);
                        d90Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ pm0(wm0 wm0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.b = wm0Var;
        this.d = arrayList;
        this.c = str;
        this.e = arrayList2;
    }
}
