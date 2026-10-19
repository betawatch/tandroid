package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ String c;

    public /* synthetic */ bg(qn qnVar, String str, int i10) {
        this.a = i10;
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
                    pf.d.m(str);
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
                    pf.d.l(qnVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
