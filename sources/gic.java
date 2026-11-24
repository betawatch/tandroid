// default package

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gic implements m4 {
    public final /* synthetic */ iic a;

    public gic(iic iicVar) {
        this.a = iicVar;
    }

    public final void a() {
        iic iicVar = this.a;
        byte b = 17;
        if (iicVar.p0 != 17) {
            if (iicVar.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                iicVar.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    iicVar.i(new f8c(this, b));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(iicVar.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", iicVar.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", iicVar.U0);
        intent.putExtra("can_video_call", iicVar.U0);
        intent.putExtra("account", iicVar.a);
        try {
            iicVar.b.startService(intent);
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    public final void b() {
        iic iicVar = this.a;
        if (iicVar.p0 == 17) {
            iicVar.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            iicVar.u0.b();
        }
    }
}
