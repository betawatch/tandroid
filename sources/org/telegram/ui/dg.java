package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ String c;

    public /* synthetic */ dg(qn qnVar, String str, int i9) {
        this.a = i9;
        this.b = qnVar;
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
                    qn qnVar = this.b;
                    String str = this.c;
                    if (booleanValue) {
                        qnVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    qnVar.getParentActivity();
                    ve.e.n(str);
                    break;
                }
                break;
            default:
                qn qnVar2 = this.b;
                qnVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.c;
                    if (booleanValue2) {
                        qnVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    ve.e.m(qnVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
