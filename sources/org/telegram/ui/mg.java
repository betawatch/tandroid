package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ String c;

    public /* synthetic */ mg(xn xnVar, String str, int i10) {
        this.a = i10;
        this.b = xnVar;
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
                    xn xnVar = this.b;
                    String str = this.c;
                    if (booleanValue) {
                        xnVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    xnVar.getParentActivity();
                    nf.f.n(str);
                    break;
                }
                break;
            default:
                xn xnVar2 = this.b;
                xnVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.c;
                    if (booleanValue2) {
                        xnVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    nf.f.m(xnVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
