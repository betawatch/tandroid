// default package

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class n52 extends v79 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    public n52(qqc qqcVar) {
        this.a = (byte) 1;
        this.c = qqcVar;
        this.b = false;
    }

    @Override // v79
    public final void a(RecyclerView recyclerView, int i) {
        n69 n69Var;
        int topScrollOffset;
        int topScrollOffset2;
        byte b = this.a;
        boolean z = false;
        Object obj = this.c;
        switch (b) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                i52 i52Var = chatAttachAlertPhotoLayout.F;
                n12 n12Var = chatAttachAlertPhotoLayout.b;
                if (i == 0) {
                    int L = hl.L(13.0f);
                    s7 s7Var = n12Var.X2;
                    int L2 = L + (s7Var != null ? hl.L(s7Var.getAlpha() * 26.0f) : 0);
                    int i2 = n12Var.t0;
                    if (((n12Var.Y3[0] - i2) - L2) + i2 < (n12Var.L2.getAlpha() * n12Var.L2.getMeasuredHeight()) + a.getCurrentActionBarHeight() && (n69Var = (n69) i52Var.L(0)) != null) {
                        View view = n69Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            i52Var.y0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
            case 1:
                if (i == 0 && this.b) {
                    this.b = false;
                    ((qqc) obj).f();
                    break;
                }
                break;
            default:
                r9b r9bVar = (r9b) obj;
                d79 d79Var = r9bVar.f;
                if (i == 1) {
                    w9b w9bVar = r9bVar.a0;
                    int i3 = w9b.X1;
                    if (w9bVar.d && r9bVar.y != null) {
                        w9bVar.G0();
                    }
                }
                if (i == 0) {
                    r9bVar.T = !d79Var.canScrollVertically(-1);
                    d79Var.canScrollVertically(1);
                } else {
                    z = true;
                }
                r9bVar.N = z;
                break;
        }
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                n12 n12Var = chatAttachAlertPhotoLayout.b;
                i52 i52Var = chatAttachAlertPhotoLayout.F;
                if (i52Var.getChildCount() > 0) {
                    n12Var.I1(chatAttachAlertPhotoLayout, i2);
                    if (chatAttachAlertPhotoLayout.H.b() > 30) {
                        boolean z = this.b;
                        boolean z2 = n12Var.L1;
                        if (z != z2) {
                            this.b = z2;
                            ik8.s(i52Var.getFastScroll().animate(), this.b ? 1.0f : 0.0f, 100L);
                        }
                    } else {
                        i52Var.getFastScroll().setAlpha(0.0f);
                    }
                    if (i2 != 0) {
                        chatAttachAlertPhotoLayout.V();
                        break;
                    }
                }
                break;
            case 1:
                if (i != 0 || i2 != 0) {
                    this.b = true;
                    break;
                }
            default:
                r9b r9bVar = (r9b) obj;
                w9b w9bVar = r9bVar.a0;
                d79 d79Var = r9bVar.f;
                boolean canScrollVertically = d79Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    r9bVar.r.invalidate();
                    this.b = canScrollVertically;
                }
                r9bVar.e.invalidate();
                int i3 = w9b.X1;
                w9bVar.b.invalidate();
                if (r9bVar.a == 6 && d79Var.getChildCount() > 0 && RecyclerView.S(d79Var.getChildAt(0)) >= uc7.s1(w9bVar.a).O1().L.size()) {
                    uc7.s1(w9bVar.a).O1().R();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n52(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.c = frameLayout;
    }
}
