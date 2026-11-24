// default package

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mm8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ mm8(TLRPC.User user, byte b) {
        this.a = b;
        this.b = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.b;
        switch (b) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
                gl.g("@" + l7c.p(user));
                break;
            case 1:
                mi8.g1(new ArrayList(Arrays.asList(user)));
                break;
            case 2:
                mi8.g1(new ArrayList(Arrays.asList(user)));
                break;
            default:
                mi8.g1(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
