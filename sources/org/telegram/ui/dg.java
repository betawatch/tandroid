package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ String c;

    public /* synthetic */ dg(sn snVar, String str, int i10) {
        this.a = i10;
        this.b = snVar;
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
                    sn snVar = this.b;
                    String str = this.c;
                    if (booleanValue) {
                        snVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    snVar.getParentActivity();
                    pf.d.m(str);
                    break;
                }
                break;
            default:
                sn snVar2 = this.b;
                snVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.c;
                    if (booleanValue2) {
                        snVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    pf.d.l(snVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
