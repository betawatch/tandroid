package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class og implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;
    public final /* synthetic */ String c;

    public /* synthetic */ og(co coVar, String str, int i10) {
        this.a = i10;
        this.b = coVar;
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
                    co coVar = this.b;
                    String str = this.c;
                    if (booleanValue) {
                        coVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    coVar.getParentActivity();
                    of.f.n(str);
                    break;
                }
                break;
            default:
                co coVar2 = this.b;
                coVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.c;
                    if (booleanValue2) {
                        coVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    of.f.m(coVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
