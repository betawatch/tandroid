package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ String c;

    public /* synthetic */ mg(zn znVar, String str, int i10) {
        this.a = i10;
        this.b = znVar;
        this.c = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                znVar.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    String str = this.c;
                    if (booleanValue) {
                        znVar.getMessagesController().addWebBrowserException(str, true);
                    }
                    nf.f.m(znVar.getParentActivity(), str, false, null);
                    break;
                }
                break;
            default:
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    zn znVar2 = this.b;
                    String str2 = this.c;
                    if (booleanValue2) {
                        znVar2.getMessagesController().addWebBrowserException(str2, false);
                    }
                    znVar2.getParentActivity();
                    nf.f.n(str2);
                    break;
                }
                break;
        }
    }
}
