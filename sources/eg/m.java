package eg;

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
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.ur;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ m(int i10) {
        this.a = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                break;
            case 1:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    break;
                } catch (ActivityNotFoundException e6) {
                    FileLog.e(e6);
                    return;
                }
            case 2:
                int i10 = lh.s.x0;
                break;
            case 3:
                sc[] scVarArr = lh.f0.m0;
                break;
            case 4:
                int i11 = lh.m0.c0;
                break;
            case 5:
                int i12 = mh.i1.A0;
                break;
            case 6:
                int i13 = ng.f.e;
                break;
            case 7:
                oh.j1.j();
                break;
            case 8:
                int i14 = org.telegram.ui.Cells.x.I;
                break;
            case 9:
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
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
                int i15 = mq.b0;
                break;
            case 12:
                int i16 = ur.s;
                break;
            case 13:
                float[] fArr = FragmentContextView.J0;
                MediaController.getInstance().updateSilent(false);
                break;
            case 14:
                ng0 ng0Var = ng0.m0;
                ru ruVar = ng0Var.R;
                if (ruVar != null) {
                    ruVar.G();
                } else {
                    PhotoViewer photoViewer = ng0Var.S;
                    if (photoViewer != null) {
                        photoViewer.P0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                ng0.j(false);
                break;
            case 15:
                org.telegram.ui.Components.voip.h1.j();
                break;
            case 16:
                ((org.telegram.ui.Cells.z1) view).c(!r6.b(), true);
                break;
            case 17:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null) {
                    org.telegram.ui.Components.voip.n2.i();
                    break;
                } else {
                    sharedInstance.hangUp();
                    break;
                }
            case 18:
                hg.v2.e0(0, null);
                break;
            case 19:
                ArrayList arrayList = ExternalActionActivity.x;
                break;
            case 20:
                break;
            case 21:
                Pattern pattern = LaunchActivity.y1;
                break;
            case 22:
                break;
            case 23:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    break;
                } catch (ActivityNotFoundException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 24:
                int i17 = qh.i3.d;
                break;
            case 25:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                break;
            case 26:
                int i18 = sh.l.n;
                break;
            case 27:
                break;
            default:
                int i19 = xg.c.e;
                break;
        }
    }

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
