package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class og implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ String c;

    public /* synthetic */ og(fo foVar, String str, int i10) {
        this.a = i10;
        this.b = foVar;
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
                    fo foVar = this.b;
                    String str = this.c;
                    if (booleanValue) {
                        foVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    foVar.getParentActivity();
                    pf.d.n(str);
                    break;
                }
                break;
            default:
                fo foVar2 = this.b;
                foVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.c;
                    if (booleanValue2) {
                        foVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    pf.d.m(foVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
