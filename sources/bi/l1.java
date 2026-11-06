package bi;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.vp;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ l1(int i7) {
        this.a = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                int i7 = w1.s2;
                break;
            case 1:
                int i10 = ch.f.e;
                break;
            case 2:
                int i11 = fi.r3.e;
                break;
            case 3:
                PhotoViewer.p1().c0(1.0f, 0.0f, 0.0f, false);
                break;
            case 4:
                int i12 = hi.l.n;
                break;
            case 5:
                int i13 = lh.c.e;
                break;
            case 6:
                break;
            case 7:
                int i14 = org.telegram.ui.Cells.w.L;
                break;
            case 8:
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    break;
                }
                break;
            case 9:
                if (!MediaController.B().A0) {
                    if (!MediaController.B().H()) {
                        MediaController.B().R(MediaController.B().u0, true);
                        break;
                    } else {
                        MediaController.B().S(MediaController.B().u0);
                        break;
                    }
                }
                break;
            case 10:
                int i15 = vp.f0;
                break;
            case 11:
                int i16 = br.x;
                break;
            case 12:
                float[] fArr = FragmentContextView.W0;
                MediaController B = MediaController.B();
                t51 t51Var = B.E0;
                if (t51Var != null) {
                    t51Var.s0(false);
                }
                B.n0();
                B.m();
                ij ijVar = B.u0;
                if (ijVar != null) {
                    qs f10 = qs.f(ijVar.I1);
                    ij ijVar2 = B.u0;
                    f10.k(qs.g2, Integer.valueOf(ijVar2 != null ? ijVar2.f1() : 0));
                    break;
                }
                break;
            case 13:
                ((org.telegram.ui.Cells.c2) view).c(!r6.b(), true);
                break;
            case 14:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null) {
                    org.telegram.ui.Components.voip.e2.b();
                    break;
                } else {
                    sharedInstance.hangUp();
                    break;
                }
            case 15:
                wg.f1.l1(0, null);
                break;
            case 16:
                ArrayList arrayList = ExternalActionActivity.y;
                break;
            case 17:
                break;
            case 18:
                String str = LaunchActivity.B1;
                break;
            case 19:
                break;
            case 20:
                RectF rectF = ProfileActivity.S6;
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    break;
                } catch (ActivityNotFoundException e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 21:
                int i17 = org.telegram.ui.Wallet.p3.W;
                break;
            case 22:
                PhotoViewer.p1().c0(1.0f, 0.0f, 0.0f, false);
                break;
            case 23:
                int i18 = zh.m.s2;
                break;
            case 24:
                org.telegram.ui.Components.jc[] jcVarArr = zh.v.h2;
                break;
            default:
                int i19 = zh.c0.Y1;
                break;
        }
    }

    public /* synthetic */ l1(Object obj, int i7) {
        this.a = i7;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
