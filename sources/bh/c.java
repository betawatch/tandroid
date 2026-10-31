package bh;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kg.x;
import mg.i2;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.w;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.voip.s0;
import org.telegram.ui.Components.voip.t1;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.p3;
import ph.d0;
import ph.m;
import rh.t0;
import th.w0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                int i10 = e.e;
                break;
            case 1:
                break;
            case 2:
                PhotoViewer.v1().k0(1.0f, 0.0f, 0.0f, false);
                break;
            case 3:
                int i11 = w.L;
                break;
            case 4:
                k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    break;
                }
                break;
            case 5:
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
            case 6:
                int i12 = cq.f0;
                break;
            case 7:
                int i13 = lr.x;
                break;
            case 8:
                float[] fArr = FragmentContextView.W0;
                MediaController B = MediaController.B();
                u61 u61Var = B.E0;
                if (u61Var != null) {
                    u61Var.s0(false);
                }
                B.n0();
                B.m();
                jj jjVar = B.u0;
                if (jjVar != null) {
                    zs f7 = zs.f(jjVar.I1);
                    jj jjVar2 = B.u0;
                    f7.k(zs.g2, Integer.valueOf(jjVar2 != null ? jjVar2.f1() : 0));
                    break;
                }
                break;
            case 9:
                jf0 jf0Var = jf0.p0;
                hu huVar = jf0Var.U;
                if (huVar != null) {
                    huVar.I0();
                } else {
                    PhotoViewer photoViewer = jf0Var.V;
                    if (photoViewer != null) {
                        photoViewer.Q0();
                        MediaController.B().F0();
                    }
                }
                jf0.b(false);
                break;
            case 10:
                s0.b();
                break;
            case 11:
                ((c2) view).c(!r6.b(), true);
                break;
            case 12:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null) {
                    t1.a();
                    break;
                } else {
                    sharedInstance.hangUp();
                    break;
                }
            case 13:
                i2.l1(0, null);
                break;
            case 14:
                ArrayList arrayList = ExternalActionActivity.y;
                break;
            case 15:
                break;
            case 16:
                Pattern pattern = LaunchActivity.D1;
                break;
            case 17:
                break;
            case 18:
                RectF rectF = ProfileActivity.R6;
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    break;
                } catch (ActivityNotFoundException e) {
                    f8.g(e, true);
                    return;
                }
            case 19:
                int i14 = p3.W;
                break;
            case 20:
                int i15 = m.s2;
                break;
            case 21:
                ec[] ecVarArr = ph.w.h2;
                break;
            case 22:
                int i16 = d0.Y1;
                break;
            case 23:
                int i17 = t0.s2;
                break;
            case 24:
                int i18 = sg.f.e;
                break;
            case 25:
                w0.b();
                break;
            case 26:
                int i19 = x.e;
                break;
            case 27:
                PhotoViewer.v1().k0(1.0f, 0.0f, 0.0f, false);
                break;
            default:
                int i20 = xh.k.n;
                break;
        }
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
