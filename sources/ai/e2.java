package ai;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.ur;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class e2 implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ e2(int i10) {
        this.a = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                m2.j();
                break;
            case 1:
                int i10 = ci.k4.d;
                break;
            case 2:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                break;
            case 3:
                int i11 = ei.n.n;
                break;
            case 4:
                break;
            case 5:
                int i12 = jh.c.e;
                break;
            case 6:
                int i13 = org.telegram.ui.Cells.x.L;
                break;
            case 7:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    break;
                }
                break;
            case 8:
                if (!MediaController.getInstance().isDownloadingCurrentMessage()) {
                    if (!MediaController.getInstance().isMessagePaused()) {
                        MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                        break;
                    } else {
                        MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                        break;
                    }
                }
                break;
            case 9:
                int i14 = mq.e0;
                break;
            case 10:
                int i15 = ur.s;
                break;
            case 11:
                float[] fArr = FragmentContextView.O0;
                MediaController.getInstance().updateSilent(false);
                break;
            case 12:
                pg0 pg0Var = pg0.p0;
                vu vuVar = pg0Var.U;
                if (vuVar != null) {
                    vuVar.H();
                } else {
                    PhotoViewer photoViewer = pg0Var.V;
                    if (photoViewer != null) {
                        photoViewer.P0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                pg0.j(false);
                break;
            case 13:
                org.telegram.ui.Components.voip.j1.j();
                break;
            case 14:
                ((org.telegram.ui.Cells.a2) view).c(!r6.b(), true);
                break;
            case 15:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null) {
                    org.telegram.ui.Components.voip.m2.i();
                    break;
                } else {
                    sharedInstance.hangUp();
                    break;
                }
            case 16:
                tg.m1.e0(0, null);
                break;
            case 17:
                ArrayList arrayList = ExternalActionActivity.x;
                break;
            case 18:
                break;
            case 19:
                Pattern pattern = LaunchActivity.B1;
                break;
            case 20:
                break;
            case 21:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    break;
                } catch (ActivityNotFoundException e) {
                    FileLog.e(e);
                    return;
                }
            case 22:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                break;
            case 23:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    break;
                } catch (ActivityNotFoundException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 24:
                int i16 = xh.m.A0;
                break;
            case 25:
                zc[] zcVarArr = xh.v.p0;
                break;
            case 26:
                int i17 = xh.c0.f0;
                break;
            case 27:
                int i18 = yh.s0.D0;
                break;
            default:
                int i19 = zg.f.e;
                break;
        }
    }

    public /* synthetic */ e2(Object obj, int i10) {
        this.a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
