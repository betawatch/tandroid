package fh;

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
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i9) {
        this.a = i9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                int i9 = x.w0;
                break;
            case 1:
                qc[] qcVarArr = k0.l0;
                break;
            case 2:
                int i10 = r0.b0;
                break;
            case 3:
                int i11 = gh.l1.z0;
                break;
            case 4:
                int i12 = hg.f.e;
                break;
            case 5:
                ih.k1.j();
                break;
            case 6:
                int i13 = kh.c4.d;
                break;
            case 7:
                PhotoViewer.t1().i0(1.0f, 0.0f, 0.0f, false);
                break;
            case 8:
                int i14 = mh.n.n;
                break;
            case 9:
                int i15 = org.telegram.ui.Cells.x.H;
                break;
            case 10:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    break;
                }
                break;
            case 11:
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
            case 12:
                int i16 = cq.a0;
                break;
            case 13:
                int i17 = kr.s;
                break;
            case 14:
                float[] fArr = FragmentContextView.I0;
                MediaController.getInstance().updateSilent(false);
                break;
            case 15:
                pf0 pf0Var = pf0.l0;
                gu guVar = pf0Var.Q;
                if (guVar != null) {
                    guVar.G();
                } else {
                    PhotoViewer photoViewer = pf0Var.R;
                    if (photoViewer != null) {
                        photoViewer.P0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                pf0.j(false);
                break;
            case 16:
                org.telegram.ui.Components.voip.g1.j();
                break;
            case 17:
                ((org.telegram.ui.Cells.z1) view).c(!r6.b(), true);
                break;
            case 18:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null) {
                    org.telegram.ui.Components.voip.l2.i();
                    break;
                } else {
                    sharedInstance.hangUp();
                    break;
                }
            case 19:
                bg.g3.d0(0, null);
                break;
            case 20:
                ArrayList arrayList = ExternalActionActivity.x;
                break;
            case 21:
                break;
            case 22:
                Pattern pattern = LaunchActivity.x1;
                break;
            case 23:
                break;
            case 24:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    break;
                } catch (ActivityNotFoundException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 25:
                break;
            case 26:
                int i18 = rg.c.e;
                break;
            case 27:
                PhotoViewer.t1().i0(1.0f, 0.0f, 0.0f, false);
                break;
            default:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    break;
                } catch (ActivityNotFoundException e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }

    public /* synthetic */ n(Object obj, int i9) {
        this.a = i9;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
