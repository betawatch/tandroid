// default package

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class kkc implements n4 {
    public final /* synthetic */ mkc a;

    public kkc(mkc mkcVar) {
        this.a = mkcVar;
    }

    public final void a() {
        mkc mkcVar = this.a;
        if (mkcVar.p0 != 17) {
            if (mkcVar.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                mkcVar.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    mkcVar.i(new azb(this, (byte) 26));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(mkcVar.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", mkcVar.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", mkcVar.U0);
        intent.putExtra("can_video_call", mkcVar.U0);
        intent.putExtra("account", mkcVar.a);
        try {
            mkcVar.b.startService(intent);
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    public final void b() {
        mkc mkcVar = this.a;
        if (mkcVar.p0 == 17) {
            mkcVar.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            mkcVar.u0.b();
        }
    }
}
