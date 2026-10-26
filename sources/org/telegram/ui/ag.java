package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ String c;

    public /* synthetic */ ag(un unVar, String str, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    un unVar = this.b;
                    String str = this.c;
                    if (booleanValue) {
                        unVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    unVar.getParentActivity();
                    qf.d.m(str);
                    break;
                }
                break;
            default:
                un unVar2 = this.b;
                unVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.c;
                    if (booleanValue2) {
                        unVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    qf.d.l(unVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
