// default package

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class b7c extends it3 {
    public final /* synthetic */ byte F;
    public final /* synthetic */ UserInfoActivity G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7c(UserInfoActivity userInfoActivity, Context context, String str, int i, wjb wjbVar) {
        super(context, str, true, false, i, wjbVar);
        this.F = (byte) 2;
        this.G = userInfoActivity;
    }

    @Override // it3
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
    public /* synthetic */ b7c(UserInfoActivity userInfoActivity, Context context, String str, wjb wjbVar, byte b) {
        super(context, str, false, false, -1, wjbVar);
        this.F = b;
        this.G = userInfoActivity;
    }
}
