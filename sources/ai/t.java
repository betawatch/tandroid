package ai;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.hs;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.vp;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ t(int i3) {
        this.a = i3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                int i3 = e0.t2;
                break;
            case 1:
                hc[] hcVarArr = s0.i2;
                break;
            case 2:
                int i10 = z0.Z1;
                break;
            case 3:
                int i11 = ci.p1.t2;
                break;
            case 4:
                int i12 = dh.f.e;
                break;
            case 5:
                ei.n1.b();
                break;
            case 6:
                int i13 = gi.q3.e;
                break;
            case 7:
                PhotoViewer.v1().k0(1.0f, 0.0f, 0.0f, false);
                break;
            case 8:
                int i14 = ii.n.n;
                break;
            case 9:
                int i15 = mh.c.e;
                break;
            case 10:
                break;
            case 11:
                int i16 = org.telegram.ui.Cells.w.M;
                break;
            case 12:
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    break;
                }
                break;
            case 13:
                if (!MediaController.B().B0) {
                    if (!MediaController.B().H()) {
                        MediaController.B().R(MediaController.B().v0, true);
                        break;
                    } else {
                        MediaController.B().S(MediaController.B().v0);
                        break;
                    }
                }
                break;
            case 14:
                int i17 = vp.g0;
                break;
            case 15:
                int i18 = br.x;
                break;
            case 16:
                float[] fArr = FragmentContextView.X0;
                MediaController B = MediaController.B();
                m51 m51Var = B.F0;
                if (m51Var != null) {
                    m51Var.s0(false);
                }
                B.n0();
                B.m();
                zi ziVar = B.v0;
                if (ziVar != null) {
                    hs f10 = hs.f(ziVar.I1);
                    zi ziVar2 = B.v0;
                    f10.k(hs.g2, Integer.valueOf(ziVar2 != null ? ziVar2.f1() : 0));
                    break;
                }
                break;
            case 17:
                ie0 ie0Var = ie0.q0;
                ut utVar = ie0Var.V;
                if (utVar != null) {
                    utVar.I0();
                } else {
                    PhotoViewer photoViewer = ie0Var.W;
                    if (photoViewer != null) {
                        photoViewer.Q0();
                        MediaController.B().F0();
                    }
                }
                ie0.b(false);
                break;
            case 18:
                org.telegram.ui.Components.voip.s0.b();
                break;
            case 19:
                ((org.telegram.ui.Cells.c2) view).c(!r6.b(), true);
                break;
            case 20:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null) {
                    org.telegram.ui.Components.voip.u1.a();
                    break;
                } else {
                    sharedInstance.hangUp();
                    break;
                }
            case 21:
                xg.e1.l1(0, null);
                break;
            case 22:
                ArrayList arrayList = ExternalActionActivity.y;
                break;
            case 23:
                break;
            case 24:
                String str = LaunchActivity.E1;
                break;
            case 25:
                break;
            case 26:
                RectF rectF = ProfileActivity.T6;
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    break;
                } catch (ActivityNotFoundException e10) {
                    a8.g(e10, true);
                    return;
                }
            case 27:
                int i19 = org.telegram.ui.Wallet.n3.X;
                break;
            default:
                PhotoViewer.v1().k0(1.0f, 0.0f, 0.0f, false);
                break;
        }
    }

    public /* synthetic */ t(Object obj, int i3) {
        this.a = i3;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
