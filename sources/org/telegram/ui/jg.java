package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ String c;

    public /* synthetic */ jg(zn znVar, String str, int i10) {
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
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    zn znVar = this.b;
                    String str = this.c;
                    if (booleanValue) {
                        znVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    znVar.getParentActivity();
                    ze.d.n(str);
                    break;
                }
                break;
            default:
                zn znVar2 = this.b;
                znVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.c;
                    if (booleanValue2) {
                        znVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    ze.d.m(znVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
