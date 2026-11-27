// default package

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class bbc extends zt3 {
    public final /* synthetic */ byte F;
    public final /* synthetic */ UserInfoActivity G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbc(UserInfoActivity userInfoActivity, Context context, String str, int i, vnb vnbVar) {
        super(context, str, true, false, i, vnbVar);
        this.F = (byte) 2;
        this.G = userInfoActivity;
    }

    @Override // zt3
    public final void b(Editable editable) {
        byte b = this.F;
        UserInfoActivity userInfoActivity = this.G;
        switch (b) {
            case 0:
                userInfoActivity.e0(true);
                break;
            case 1:
                userInfoActivity.e0(true);
                break;
            default:
                userInfoActivity.e0(true);
                userInfoActivity.i0();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bbc(UserInfoActivity userInfoActivity, Context context, String str, vnb vnbVar, byte b) {
        super(context, str, false, false, -1, vnbVar);
        this.F = b;
        this.G = userInfoActivity;
    }
}
