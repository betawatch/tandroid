package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ String c;

    public /* synthetic */ jg(wn wnVar, String str, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                wnVar.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    String str = this.c;
                    if (booleanValue) {
                        wnVar.getMessagesController().addWebBrowserException(str, true);
                    }
                    nf.f.m(wnVar.getParentActivity(), str, false, null);
                    break;
                }
                break;
            default:
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    wn wnVar2 = this.b;
                    String str2 = this.c;
                    if (booleanValue2) {
                        wnVar2.getMessagesController().addWebBrowserException(str2, false);
                    }
                    wnVar2.getParentActivity();
                    nf.f.n(str2);
                    break;
                }
                break;
        }
    }
}
