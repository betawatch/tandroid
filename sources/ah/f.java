package ah;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import bi.b2;
import di.i4;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.Components.zq;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                b2.j();
                break;
            case 2:
                int i11 = i4.d;
                break;
            case 3:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                break;
            case 4:
                int i12 = fi.n.n;
                break;
            case 5:
                break;
            case 6:
                int i13 = kh.c.e;
                break;
            case 7:
                int i14 = org.telegram.ui.Cells.x.L;
                break;
            case 8:
                m2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    break;
                }
                break;
            case 9:
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
            case 10:
                int i15 = zq.e0;
                break;
            case 11:
                int i16 = is.s;
                break;
            case 12:
                float[] fArr = FragmentContextView.Q0;
                MediaController.getInstance().updateSilent(false);
                break;
            case 13:
                fh0 fh0Var = fh0.p0;
                hv hvVar = fh0Var.U;
                if (hvVar != null) {
                    hvVar.H();
                } else {
                    PhotoViewer photoViewer = fh0Var.V;
                    if (photoViewer != null) {
                        photoViewer.P0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                fh0.j(false);
                break;
            case 14:
                org.telegram.ui.Components.voip.h1.j();
                break;
            case 15:
                ((a2) view).c(!r6.b(), true);
                break;
            case 16:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null) {
                    k2.i();
                    break;
                } else {
                    sharedInstance.hangUp();
                    break;
                }
            case 17:
                ug.m1.f0(0, null);
                break;
            case 18:
                ArrayList arrayList = ExternalActionActivity.x;
                break;
            case 19:
                break;
            case 20:
                Pattern pattern = LaunchActivity.B1;
                break;
            case 21:
                break;
            case 22:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    break;
                } catch (ActivityNotFoundException e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                break;
            case 24:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    break;
                } catch (ActivityNotFoundException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 25:
                int i17 = yh.n.A0;
                break;
            case 26:
                bd[] bdVarArr = yh.w.p0;
                break;
            case 27:
                int i18 = yh.d0.f0;
                break;
            default:
                int i19 = zh.r0.D0;
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
