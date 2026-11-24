// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class by5 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ int c;
    public final /* synthetic */ kz5 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ by5(LaunchActivity launchActivity, kz5 kz5Var, int i, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.a = (byte) 0;
        this.b = launchActivity;
        this.d = kz5Var;
        this.c = i;
        this.i = authorizationform;
        this.e = getauthorizationform;
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.i;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                gl.d3(new nx1(this.b, this.d, tLObject, this.c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, (byte) 2));
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
                kz5 kz5Var = this.d;
                if (authorizationform == null) {
                    gl.d3(new sx5((Object) launchActivity, (Object) kz5Var, (Object) tL_error, (byte) 1));
                    break;
                } else {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i = this.c;
                    iArr[0] = ConnectionsManager.getInstance(i).sendRequest(getpassword, new by5(launchActivity, kz5Var, i, authorizationform, getauthorizationform, str2, str3, str4));
                    break;
                }
            default:
                String str6 = LaunchActivity.C1;
                gl.d3(new nx1(this.b, tLObject, (int[]) obj5, this.c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, (byte) 1));
                break;
        }
    }

    public /* synthetic */ by5(LaunchActivity launchActivity, int[] iArr, int i, kz5 kz5Var, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = launchActivity;
        this.i = iArr;
        this.c = i;
        this.d = kz5Var;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }
}
