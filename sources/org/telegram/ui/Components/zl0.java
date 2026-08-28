package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zl0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gm0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ zl0(gm0 gm0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.b = gm0Var;
        this.c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gm0 gm0Var = this.b;
                int i9 = gm0Var.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList3 = this.d;
                    int size = arrayList3.size();
                    String str = this.c;
                    if (i10 >= size) {
                        int i11 = 0;
                        while (true) {
                            ArrayList arrayList4 = this.e;
                            if (i11 >= arrayList4.size()) {
                                AndroidUtilities.runOnUIThread(new zl0(gm0Var, str, arrayList, arrayList2));
                                break;
                            } else {
                                String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList4.get(i11)).getDocument());
                                if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                                    MessageObject messageObject = new MessageObject(i9, ((MessageObject) arrayList4.get(i11)).messageOwner, false, false);
                                    messageObject.mediaExists = ((MessageObject) arrayList4.get(i11)).mediaExists;
                                    messageObject.setQuery(gm0Var.G);
                                    arrayList2.add(messageObject);
                                }
                                i11++;
                            }
                        }
                    } else {
                        String documentFileName2 = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i10)).getDocument());
                        if (documentFileName2 != null && documentFileName2.toLowerCase().contains(str)) {
                            MessageObject messageObject2 = new MessageObject(i9, ((MessageObject) arrayList3.get(i10)).messageOwner, false, false);
                            messageObject2.mediaExists = ((MessageObject) arrayList3.get(i10)).mediaExists;
                            messageObject2.setQuery(gm0Var.G);
                            arrayList.add(messageObject2);
                        }
                        i10++;
                    }
                }
                break;
            default:
                gm0 gm0Var2 = this.b;
                gw0 gw0Var = gm0Var2.a;
                if (this.c.equals(gm0Var2.H)) {
                    if (gm0Var2.r == 0) {
                        gm0Var2.J.b(0);
                    }
                    gm0Var2.e(this.d, this.e, true);
                    if (gm0Var2.r == 0) {
                        gw0Var.e(false, true);
                        l80 l80Var = gw0Var.e;
                        gw0Var.d.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        l80Var.setVisibility(0);
                        l80Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ zl0(gm0 gm0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.b = gm0Var;
        this.d = arrayList;
        this.c = str;
        this.e = arrayList2;
    }
}
