package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class og implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ String c;

    public /* synthetic */ og(bo boVar, String str, int i10) {
        this.a = i10;
        this.b = boVar;
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
                    bo boVar = this.b;
                    String str = this.c;
                    if (booleanValue) {
                        boVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    boVar.getParentActivity();
                    nf.f.n(str);
                    break;
                }
                break;
            default:
                bo boVar2 = this.b;
                boVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.c;
                    if (booleanValue2) {
                        boVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    nf.f.m(boVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
