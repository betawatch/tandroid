package bi;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.ns;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.u51;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                ec[] ecVarArr = m0.l2;
                break;
            case 2:
                int i10 = t0.c2;
                break;
            case 3:
                int i11 = ch.f.e;
                break;
            case 4:
                int i12 = di.i1.w2;
                break;
            case 5:
                int i13 = hi.q3.e;
                break;
            case 6:
                PhotoViewer.p1().c0(1.0f, 0.0f, 0.0f, false);
                break;
            case 7:
                int i14 = ki.m.n;
                break;
            case 8:
                int i15 = lh.c.e;
                break;
            case 9:
                break;
            case 10:
                int i16 = org.telegram.ui.Cells.w.M;
                break;
            case 11:
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    break;
                }
                break;
            case 12:
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
            case 13:
                int i17 = dq.g0;
                break;
            case 14:
                int i18 = ir.x;
                break;
            case 15:
                float[] fArr = FragmentContextView.X0;
                MediaController B = MediaController.B();
                u51 u51Var = B.F0;
                if (u51Var != null) {
                    u51Var.s0(false);
                }
                B.n0();
                B.m();
                gj gjVar = B.v0;
                if (gjVar != null) {
                    ns f10 = ns.f(gjVar.K1);
                    gj gjVar2 = B.v0;
                    f10.k(ns.g2, Integer.valueOf(gjVar2 != null ? gjVar2.e1() : 0));
                    break;
                }
                break;
            case 16:
                ((org.telegram.ui.Cells.c2) view).c(!r6.b(), true);
                break;
            case 17:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null) {
                    org.telegram.ui.Components.voip.i2.b();
                    break;
                } else {
                    sharedInstance.hangUp();
                    break;
                }
            case 18:
                wg.c1.l1(0, null);
                break;
            case 19:
                ArrayList arrayList = ExternalActionActivity.y;
                break;
            case 20:
                break;
            case 21:
                String str = LaunchActivity.C1;
                break;
            case 22:
                break;
            case 23:
                RectF rectF = ProfileActivity.X6;
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
                    break;
                } catch (ActivityNotFoundException e10) {
                    a8.g(e10, true);
                    return;
                }
            case 24:
                int i19 = org.telegram.ui.Wallet.o3.X;
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
