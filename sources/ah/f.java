package ah;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import bi.a2;
import di.k4;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                a2.j();
                break;
            case 2:
                int i11 = k4.d;
                break;
            case 3:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                break;
            case 4:
                int i12 = fi.o.n;
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
                n2 R = LaunchActivity.R();
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
                int i15 = lq.e0;
                break;
            case 11:
                int i16 = tr.s;
                break;
            case 12:
                float[] fArr = FragmentContextView.M0;
                MediaController.getInstance().updateSilent(false);
                break;
            case 13:
                eg0 eg0Var = eg0.p0;
                tu tuVar = eg0Var.U;
                if (tuVar != null) {
                    tuVar.H();
                } else {
                    PhotoViewer photoViewer = eg0Var.V;
                    if (photoViewer != null) {
                        photoViewer.P0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                eg0.j(false);
                break;
            case 14:
                org.telegram.ui.Components.voip.h1.j();
                break;
            case 15:
                ((z1) view).c(!r6.b(), true);
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
                ug.n1.e0(0, null);
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
                } catch (ActivityNotFoundException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 23:
                PhotoViewer.t1().j0(1.0f, 0.0f, 0.0f, false);
                break;
            case 24:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    break;
                } catch (ActivityNotFoundException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 25:
                int i17 = yh.m.A0;
                break;
            case 26:
                ad[] adVarArr = yh.v.p0;
                break;
            case 27:
                int i18 = yh.c0.f0;
                break;
            default:
                int i19 = zh.s0.D0;
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
