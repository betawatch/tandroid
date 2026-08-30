package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ String c;

    public /* synthetic */ hg(xn xnVar, String str, int i10) {
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
                    af.g.n(str);
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
                    af.g.m(xnVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
