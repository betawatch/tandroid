// default package

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class c9c extends su3 {
    public final /* synthetic */ byte F;
    public final /* synthetic */ UserInfoActivity G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9c(UserInfoActivity userInfoActivity, Context context, String str, int i, ylb ylbVar) {
        super(context, str, true, false, i, ylbVar);
        this.F = (byte) 2;
        this.G = userInfoActivity;
    }

    @Override // su3
    public final void b(Editable editable) {
        byte b = this.F;
        UserInfoActivity userInfoActivity = this.G;
        switch (b) {
            case 0:
                userInfoActivity.f0(true);
                break;
            case 1:
                userInfoActivity.f0(true);
                break;
            default:
                userInfoActivity.f0(true);
                userInfoActivity.j0();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9c(UserInfoActivity userInfoActivity, Context context, String str, ylb ylbVar, byte b) {
        super(context, str, false, false, -1, ylbVar);
        this.F = b;
        this.G = userInfoActivity;
    }
}
