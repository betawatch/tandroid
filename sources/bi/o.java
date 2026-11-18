package bi;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ o(int i7) {
        this.a = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                int i7 = y.w2;
                break;
            case 1:
                nc[] ncVarArr = m0.l2;
                break;
            case 2:
                int i10 = t0.c2;
                break;
            case 3:
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new org.telegram.ui.Wallet.n6());
                    break;
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new org.telegram.ui.Wallet.n6());
                    break;
                }
                break;
            case 5:
                int i11 = ch.f.e;
                break;
            case 6:
                int i12 = di.h1.w2;
                break;
            case 7:
                int i13 = hi.q3.e;
                break;
            case 8:
                PhotoViewer.p1().c0(1.0f, 0.0f, 0.0f, false);
                break;
            case 9:
                int i14 = ki.m.n;
                break;
            case 10:
                int i15 = lh.c.e;
                break;
            case 11:
                break;
            case 12:
                int i16 = org.telegram.ui.Cells.w.M;
                break;
            case 13:
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    break;
                }
                break;
            case 14:
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
            case 15:
                int i17 = kq.g0;
                break;
            case 16:
                int i18 = pr.x;
                break;
            case 17:
                float[] fArr = FragmentContextView.X0;
                MediaController B = MediaController.B();
                f61 f61Var = B.F0;
                if (f61Var != null) {
                    f61Var.s0(false);
                }
                B.n0();
                B.m();
                fj fjVar = B.v0;
                if (fjVar != null) {
                    ks f10 = ks.f(fjVar.K1);
                    fj fjVar2 = B.v0;
                    f10.k(ks.g2, Integer.valueOf(fjVar2 != null ? fjVar2.e1() : 0));
                    break;
                }
                break;
            case 18:
                ((org.telegram.ui.Cells.c2) view).c(!r6.b(), true);
                break;
            case 19:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null) {
                    org.telegram.ui.Components.voip.h2.b();
                    break;
                } else {
                    sharedInstance.hangUp();
                    break;
                }
            case 20:
                a2.l1(false, null);
                break;
            case 21:
                ArrayList arrayList = ExternalActionActivity.y;
                break;
            case 22:
                break;
            case 23:
                String str = LaunchActivity.C1;
                break;
            case 24:
                break;
            case 25:
                RectF rectF = ProfileActivity.Z6;
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    break;
                } catch (ActivityNotFoundException e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 26:
                int i19 = org.telegram.ui.Wallet.w3.X;
                break;
            default:
                PhotoViewer.p1().c0(1.0f, 0.0f, 0.0f, false);
                break;
        }
    }

    public /* synthetic */ o(Object obj, int i7) {
        this.a = i7;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
