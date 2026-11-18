package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a70 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ int c;
    public final /* synthetic */ n60 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ a70(LaunchActivity launchActivity, n60 n60Var, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.a = 0;
        this.b = launchActivity;
        this.d = n60Var;
        this.c = i7;
        this.i = authorizationform;
        this.e = getauthorizationform;
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.i;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new di.j8(this.b, this.d, tLObject, this.c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                break;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.C1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.b;
                n60 n60Var = this.d;
                if (authorizationform == null) {
                    org.telegram.messenger.g0.g3(new up(launchActivity, n60Var, tL_error, 15));
                    break;
                } else {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i10 = this.c;
                    iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getpassword, new a70(launchActivity, n60Var, i10, authorizationform, getauthorizationform, str2, str3, str4));
                    break;
                }
            default:
                String str6 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new di.j8(this.b, tLObject, (int[]) obj5, this.c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 2));
                break;
        }
    }

    public /* synthetic */ a70(LaunchActivity launchActivity, int[] iArr, int i7, n60 n60Var, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = launchActivity;
        this.i = iArr;
        this.c = i7;
        this.d = n60Var;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }
}
