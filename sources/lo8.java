// default package

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lo8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ lo8(TLRPC.User user, byte b) {
        this.a = b;
        this.b = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.b;
        switch (b) {
            case 0:
                RectF rectF = ProfileActivity.e7;
                gm.g("@" + m9c.p(user));
                break;
            case 1:
                ok8.g1(new ArrayList(Arrays.asList(user)));
                break;
            case 2:
                ok8.g1(new ArrayList(Arrays.asList(user)));
                break;
            default:
                ok8.g1(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
