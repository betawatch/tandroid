package ag;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;
import lh.b4;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ l2(int i10) {
        this.a = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    break;
                } catch (ActivityNotFoundException e9) {
                    FileLog.e(e9);
                    return;
                }
            case 1:
                int i10 = gh.v.w0;
                break;
            case 2:
                oc[] ocVarArr = gh.i0.l0;
                break;
            case 3:
                int i11 = gh.p0.b0;
                break;
            case 4:
                int i12 = hh.l1.z0;
                break;
            case 5:
                int i13 = ig.f.e;
                break;
            case 6:
                jh.i1.j();
                break;
            case 7:
                int i14 = b4.d;
                break;
            case 8:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                break;
            case 9:
                int i15 = nh.m.n;
                break;
            case 10:
                int i16 = org.telegram.ui.Cells.x.H;
                break;
            case 11:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
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
                int i17 = aq.a0;
                break;
            case 14:
                int i18 = ir.s;
                break;
            case 15:
                float[] fArr = FragmentContextView.I0;
                MediaController.getInstance().updateSilent(false);
                break;
            case 16:
                sf0 sf0Var = sf0.l0;
                fu fuVar = sf0Var.Q;
                if (fuVar != null) {
                    fuVar.H();
                } else {
                    PhotoViewer photoViewer = sf0Var.R;
                    if (photoViewer != null) {
                        photoViewer.P0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                sf0.j(false);
                break;
            case 17:
                org.telegram.ui.Components.voip.g1.j();
                break;
            case 18:
                ((org.telegram.ui.Cells.y1) view).c(!r6.b(), true);
                break;
            case 19:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null) {
                    org.telegram.ui.Components.voip.l2.i();
                    break;
                } else {
                    sharedInstance.hangUp();
                    break;
                }
            case 20:
                cg.y2.e0(0, null);
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
                } catch (ActivityNotFoundException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 26:
                break;
            case 27:
                int i19 = sg.c.e;
                break;
            default:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                break;
        }
    }

    public /* synthetic */ l2(Object obj, int i10) {
        this.a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
