package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ String c;

    public /* synthetic */ ag(wn wnVar, String str, int i10) {
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
                    qf.d.l(wnVar.getParentActivity(), str, false, null);
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
                    qf.d.m(str2);
                    break;
                }
                break;
        }
    }
}
