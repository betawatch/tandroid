package bg;

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
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.vc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i10) {
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
                } catch (ActivityNotFoundException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 2:
                int i10 = ih.t.w0;
                break;
            case 3:
                vc[] vcVarArr = ih.g0.l0;
                break;
            case 4:
                int i11 = ih.n0.b0;
                break;
            case 5:
                int i12 = jh.j1.z0;
                break;
            case 6:
                int i13 = kg.f.e;
                break;
            case 7:
                lh.i1.j();
                break;
            case 8:
                int i14 = nh.x3.d;
                break;
            case 9:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                break;
            case 10:
                int i15 = org.telegram.ui.Cells.x.H;
                break;
            case 11:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    break;
                }
                break;
            case 12:
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
            case 13:
                int i16 = gq.a0;
                break;
            case 14:
                int i17 = or.s;
                break;
            case 15:
                float[] fArr = FragmentContextView.I0;
                MediaController.getInstance().updateSilent(false);
                break;
            case 16:
                bg0 bg0Var = bg0.l0;
                mu muVar = bg0Var.Q;
                if (muVar != null) {
                    muVar.G();
                } else {
                    PhotoViewer photoViewer = bg0Var.R;
                    if (photoViewer != null) {
                        photoViewer.P0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                bg0.j(false);
                break;
            case 17:
                org.telegram.ui.Components.voip.h1.j();
                break;
            case 18:
                ((org.telegram.ui.Cells.y1) view).c(!r6.b(), true);
                break;
            case 19:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null) {
                    org.telegram.ui.Components.voip.o2.i();
                    break;
                } else {
                    sharedInstance.hangUp();
                    break;
                }
            case 20:
                eg.w2.e0(0, null);
                break;
            case 21:
                ArrayList arrayList = ExternalActionActivity.x;
                break;
            case 22:
                break;
            case 23:
                Pattern pattern = LaunchActivity.x1;
                break;
            case 24:
                break;
            case 25:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    break;
                } catch (ActivityNotFoundException e11) {
                    FileLog.e(e11);
                    return;
                }
            case 26:
                int i18 = ph.l.n;
                break;
            case 27:
                break;
            default:
                int i19 = ug.c.e;
                break;
        }
    }

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
