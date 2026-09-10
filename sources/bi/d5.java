package bi;

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
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.zu;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class d5 implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ d5(int i10) {
        this.a = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                int i10 = e5.d;
                break;
            case 1:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                break;
            case 2:
                int i11 = di.p.n;
                break;
            case 3:
                break;
            case 4:
                int i12 = ih.c.e;
                break;
            case 5:
                int i13 = org.telegram.ui.Cells.x.L;
                break;
            case 6:
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    break;
                }
                break;
            case 7:
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
            case 8:
                int i14 = sq.e0;
                break;
            case 9:
                int i15 = as.s;
                break;
            case 10:
                float[] fArr = FragmentContextView.M0;
                MediaController.getInstance().updateSilent(false);
                break;
            case 11:
                og0 og0Var = og0.p0;
                zu zuVar = og0Var.U;
                if (zuVar != null) {
                    zuVar.H();
                } else {
                    PhotoViewer photoViewer = og0Var.V;
                    if (photoViewer != null) {
                        photoViewer.P0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                og0.j(false);
                break;
            case 12:
                org.telegram.ui.Components.voip.i1.j();
                break;
            case 13:
                ((org.telegram.ui.Cells.z1) view).c(!r6.b(), true);
                break;
            case 14:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null) {
                    org.telegram.ui.Components.voip.l2.i();
                    break;
                } else {
                    sharedInstance.hangUp();
                    break;
                }
            case 15:
                sg.p1.e0(0, null);
                break;
            case 16:
                ArrayList arrayList = ExternalActionActivity.x;
                break;
            case 17:
                break;
            case 18:
                Pattern pattern = LaunchActivity.B1;
                break;
            case 19:
                break;
            case 20:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    break;
                } catch (ActivityNotFoundException e) {
                    FileLog.e(e);
                    return;
                }
            case 21:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                break;
            case 22:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    break;
                } catch (ActivityNotFoundException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 23:
                int i16 = wh.m.A0;
                break;
            case 24:
                org.telegram.ui.Components.yc[] ycVarArr = wh.w.p0;
                break;
            case 25:
                int i17 = wh.d0.f0;
                break;
            case 26:
                int i18 = xh.s0.D0;
                break;
            case 27:
                int i19 = yg.g.e;
                break;
            default:
                zh.x0.j();
                break;
        }
    }

    public /* synthetic */ d5(Object obj, int i10) {
        this.a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
