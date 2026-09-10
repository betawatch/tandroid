package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;
    public final /* synthetic */ String c;

    public /* synthetic */ pg(eo eoVar, String str, int i10) {
        this.a = i10;
        this.b = eoVar;
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
                    eo eoVar = this.b;
                    String str = this.c;
                    if (booleanValue) {
                        eoVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    eoVar.getParentActivity();
                    nf.f.n(str);
                    break;
                }
                break;
            default:
                eo eoVar2 = this.b;
                eoVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.c;
                    if (booleanValue2) {
                        eoVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    nf.f.m(eoVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
