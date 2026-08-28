package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i80 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ int c;
    public final /* synthetic */ x20 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ i80(LaunchActivity launchActivity, x20 x20Var, int i9, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.a = 0;
        this.b = launchActivity;
        this.d = x20Var;
        this.c = i9;
        this.i = authorizationform;
        this.e = getauthorizationform;
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.i;
        switch (i9) {
            case 0:
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new gh.u6(this.b, this.d, tLObject, this.c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                break;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.x1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.b;
                x20 x20Var = this.d;
                if (authorizationform == null) {
                    AndroidUtilities.runOnUIThread(new jq(launchActivity, x20Var, tL_error, 14));
                    break;
                } else {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i10 = this.c;
                    iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getpassword, new i80(launchActivity, x20Var, i10, authorizationform, getauthorizationform, str, str2, str3));
                    break;
                }
            default:
                Pattern pattern3 = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new gh.u6(this.b, tLObject, (int[]) obj5, this.c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 4));
                break;
        }
    }

    public /* synthetic */ i80(LaunchActivity launchActivity, int[] iArr, int i9, x20 x20Var, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = launchActivity;
        this.i = iArr;
        this.c = i9;
        this.d = x20Var;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }
}
