package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ String c;

    public /* synthetic */ eg(sn snVar, String str, int i10) {
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
                sn snVar = this.b;
                snVar.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    String str = this.c;
                    if (booleanValue) {
                        snVar.getMessagesController().addWebBrowserException(str, true);
                    }
                    pf.d.l(snVar.getParentActivity(), str, false, null);
                    break;
                }
                break;
            default:
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    sn snVar2 = this.b;
                    String str2 = this.c;
                    if (booleanValue2) {
                        snVar2.getMessagesController().addWebBrowserException(str2, false);
                    }
                    snVar2.getParentActivity();
                    pf.d.m(str2);
                    break;
                }
                break;
        }
    }
}
