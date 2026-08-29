package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;
    public final /* synthetic */ String c;

    public /* synthetic */ bg(tn tnVar, String str, int i10) {
        this.a = i10;
        this.b = tnVar;
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
                    tn tnVar = this.b;
                    String str = this.c;
                    if (booleanValue) {
                        tnVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    tnVar.getParentActivity();
                    ye.d.n(str);
                    break;
                }
                break;
            default:
                tn tnVar2 = this.b;
                tnVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.c;
                    if (booleanValue2) {
                        tnVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    ye.d.m(tnVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
