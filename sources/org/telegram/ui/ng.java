package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;
    public final /* synthetic */ String c;

    public /* synthetic */ ng(yn ynVar, String str, int i10) {
        this.a = i10;
        this.b = ynVar;
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
                    yn ynVar = this.b;
                    String str = this.c;
                    if (booleanValue) {
                        ynVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    ynVar.getParentActivity();
                    nf.f.n(str);
                    break;
                }
                break;
            default:
                yn ynVar2 = this.b;
                ynVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.c;
                    if (booleanValue2) {
                        ynVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    nf.f.m(ynVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
