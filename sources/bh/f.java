package bh;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import bi.x1;
import di.o1;
import fi.a4;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.voip.i1;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yq;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.y2;
import vg.n1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i10) {
        this.a = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                int i10 = h.e;
                break;
            case 1:
                int i11 = x1.A0;
                break;
            case 2:
                o1.j();
                break;
            case 3:
                int i12 = a4.d;
                break;
            case 4:
                PhotoViewer.v1().k0(1.0f, 0.0f, 0.0f, false);
                break;
            case 5:
                int i13 = hi.u.n;
                break;
            case 6:
                int i14 = lh.c.e;
                break;
            case 7:
                break;
            case 8:
                int i15 = org.telegram.ui.Cells.w.L;
                break;
            case 9:
                r2 R = LaunchActivity.R();
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
                int i16 = yq.f0;
                break;
            case 12:
                int i17 = hs.w;
                break;
            case 13:
                float[] fArr = FragmentContextView.W0;
                MediaController.getInstance().updateSilent(false);
                break;
            case 14:
                dh0 dh0Var = dh0.p0;
                dv dvVar = dh0Var.U;
                if (dvVar != null) {
                    dvVar.G();
                } else {
                    PhotoViewer photoViewer = dh0Var.V;
                    if (photoViewer != null) {
                        photoViewer.Q0();
                        MediaController.getInstance().tryResumePausedAudio();
                    }
                }
                dh0.j(false);
                break;
            case 15:
                i1.j();
                break;
            case 16:
                ((y1) view).c(!r6.b(), true);
                break;
            case 17:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null) {
                    n2.i();
                    break;
                } else {
                    sharedInstance.hangUp();
                    break;
                }
            case 18:
                n1.e0(0, null);
                break;
            case 19:
                ArrayList arrayList = ExternalActionActivity.x;
                break;
            case 20:
                break;
            case 21:
                Pattern pattern = LaunchActivity.D1;
                break;
            case 22:
                break;
            case 23:
                int i18 = ProfileActivity.R6;
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    break;
                } catch (ActivityNotFoundException e) {
                    FileLog.e(e);
                    return;
                }
            case 24:
                int i19 = y2.W;
                break;
            case 25:
                PhotoViewer.v1().k0(1.0f, 0.0f, 0.0f, false);
                break;
            case 26:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")));
                    break;
                } catch (ActivityNotFoundException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 27:
                int i20 = zh.m.A0;
                break;
            case 28:
                yc[] ycVarArr = zh.v.p0;
                break;
            default:
                int i21 = zh.c0.g0;
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
