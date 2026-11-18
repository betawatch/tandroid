package hi;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.xl;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class f8 extends v4.u0 {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f8(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.c = frameLayout;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        kj0 kj0Var;
        int topScrollOffset;
        int topScrollOffset2;
        int i10 = this.a;
        Object obj = this.c;
        switch (i10) {
            case 0:
                l8 l8Var = (l8) obj;
                ck0 ck0Var = l8Var.f;
                if (i7 == 1) {
                    q8 q8Var = l8Var.a0;
                    int i11 = q8.Y1;
                    if (q8Var.d && l8Var.y != null) {
                        q8Var.N0();
                    }
                }
                if (i7 == 0) {
                    l8Var.T = !ck0Var.canScrollVertically(-1);
                    ck0Var.canScrollVertically(1);
                }
                l8Var.N = i7 != 0;
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                xl xlVar = chatAttachAlertPhotoLayout.F;
                si siVar = chatAttachAlertPhotoLayout.b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.r0 r0Var = siVar.Y2;
                    int L2 = L + (r0Var != null ? org.telegram.messenger.g0.L(r0Var.getAlpha() * 26.0f) : 0);
                    int i12 = siVar.t0;
                    if (((siVar.Z3[0] - i12) - L2) + i12 < (siVar.M2.getAlpha() * siVar.M2.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (kj0Var = (kj0) xlVar.K(0)) != null) {
                        View view = kj0Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            xlVar.w0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
            default:
                if (i7 == 0 && this.b) {
                    this.b = false;
                    ((org.telegram.ui.Wallet.j6) obj).f();
                    break;
                }
                break;
        }
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 0:
                l8 l8Var = (l8) obj;
                q8 q8Var = l8Var.a0;
                ck0 ck0Var = l8Var.f;
                boolean canScrollVertically = ck0Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    l8Var.r.invalidate();
                    this.b = canScrollVertically;
                }
                l8Var.e.invalidate();
                int i12 = q8.Y1;
                q8Var.b.invalidate();
                if (l8Var.a == 6 && ck0Var.getChildCount() > 0 && RecyclerView.R(ck0Var.getChildAt(0)) >= mp.u1(q8Var.a).R1().L.size()) {
                    mp.u1(q8Var.a).R1().S();
                    break;
                }
                break;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                si siVar = chatAttachAlertPhotoLayout.b;
                xl xlVar = chatAttachAlertPhotoLayout.F;
                if (xlVar.getChildCount() > 0) {
                    siVar.N1(chatAttachAlertPhotoLayout, i10);
                    if (chatAttachAlertPhotoLayout.H.b() > 30) {
                        boolean z10 = this.b;
                        boolean z11 = siVar.M1;
                        if (z10 != z11) {
                            this.b = z11;
                            n10.n(xlVar.getFastScroll().animate(), this.b ? 1.0f : 0.0f, 100L);
                        }
                    } else {
                        xlVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i10 != 0) {
                        chatAttachAlertPhotoLayout.Y();
                        break;
                    }
                }
                break;
            default:
                if (i7 != 0 || i10 != 0) {
                    this.b = true;
                    break;
                }
        }
    }

    public f8(org.telegram.ui.Wallet.j6 j6Var) {
        this.a = 2;
        this.c = j6Var;
        this.b = false;
    }
}
