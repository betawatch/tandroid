package ah;

import ai.a2;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import ci.o1;
import ei.c4;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.y2;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i10) {
        this.a = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                int i10 = i.e;
                break;
            case 1:
                int i11 = a2.F0;
                break;
            case 2:
                o1.j();
                break;
            case 3:
                int i12 = c4.d;
                break;
            case 4:
                PhotoViewer.u1().k0(1.0f, 0.0f, 0.0f, false);
                break;
            case 5:
                int i13 = gi.n.n;
                break;
            case 6:
                int i14 = kh.c.e;
                break;
            case 7:
                break;
            case 8:
                int i15 = org.telegram.ui.Cells.w.L;
                break;
            case 9:
                o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    break;
                }
                break;
            case 10:
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
            case 11:
                int i16 = wq.f0;
                break;
            case 12:
                int i17 = fs.w;
                break;
            case 13:
                float[] fArr = FragmentContextView.W0;
                MediaController.getInstance().updateSilent(false);
                break;
            case 14:
                dh0 dh0Var = dh0.p0;
                cv cvVar = dh0Var.U;
                if (cvVar != null) {
                    cvVar.F();
                } else {
                    PhotoViewer photoViewer = dh0Var.V;
                    if (photoViewer != null) {
                        photoViewer.R0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                dh0.j(false);
                break;
            case 15:
                org.telegram.ui.Components.voip.h1.j();
                break;
            case 16:
                ((z1) view).c(!r6.b(), true);
                break;
            case 17:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null) {
                    k2.i();
                    break;
                } else {
                    sharedInstance.hangUp();
                    break;
                }
            case 18:
                ug.l1.e0(0, null);
                break;
            case 19:
                ArrayList arrayList = ExternalActionActivity.x;
                break;
            case 20:
                break;
            case 21:
                Pattern pattern = LaunchActivity.E1;
                break;
            case 22:
                break;
            case 23:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    break;
                } catch (ActivityNotFoundException e) {
                    FileLog.e(e);
                    return;
                }
            case 24:
                int i18 = y2.W;
                break;
            case 25:
                PhotoViewer.u1().k0(1.0f, 0.0f, 0.0f, false);
                break;
            case 26:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    break;
                } catch (ActivityNotFoundException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 27:
                int i19 = yh.m.A0;
                break;
            case 28:
                zc[] zcVarArr = yh.v.p0;
                break;
            default:
                int i20 = yh.c0.g0;
                break;
        }
    }

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
