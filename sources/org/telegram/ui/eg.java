package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;
    public final /* synthetic */ String c;

    public /* synthetic */ eg(rn rnVar, String str, int i10) {
        this.a = i10;
        this.b = rnVar;
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
                    rn rnVar = this.b;
                    String str = this.c;
                    if (booleanValue) {
                        rnVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    rnVar.getParentActivity();
                    we.e.n(str);
                    break;
                }
                break;
            default:
                rn rnVar2 = this.b;
                rnVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.c;
                    if (booleanValue2) {
                        rnVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    we.e.m(rnVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
