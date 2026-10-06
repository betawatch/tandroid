package ii;

import ai.o8;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.w00;
import org.telegram.ui.br0;
import org.telegram.ui.ge;
import org.telegram.ui.mv;
import org.telegram.ui.nv;
import org.telegram.ui.qs;
import org.telegram.ui.uy;
import org.telegram.ui.wh0;
import org.telegram.ui.yn;
import org.telegram.ui.zq0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class n3 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((x3) this.c).u3.W();
                    break;
                }
                break;
            case 5:
                nv nvVar = (nv) this.c;
                mv[] mvVarArr = nvVar.f;
                ((s4.s0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            mvVarArr[0].d.w0(0, i12, null);
                            ai.w0 w0Var = mvVarArr[0].e;
                            if (w0Var != null) {
                                w0Var.w0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            mvVarArr[0].d.w0(0, i13, null);
                            ai.w0 w0Var2 = mvVarArr[0].e;
                            if (w0Var2 != null) {
                                w0Var2.w0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                br0 br0Var = (br0) this.c;
                zq0[] zq0VarArr = br0Var.n;
                ((s4.s0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) br0Var).actionBar;
                    int i14 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 >= currentActionBarHeight2 / 2) {
                            zq0VarArr[0].d.w0(0, currentActionBarHeight2 - i14, null);
                            break;
                        } else {
                            zq0VarArr[0].d.w0(0, -i14, null);
                            break;
                        }
                    }
                }
                break;
            case 8:
                ((s4.s0) this.b).a(recyclerView, i10);
                ((qa0) this.c).D.getClass();
                break;
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        View F;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                x3 x3Var = (x3) this.c;
                ((v3) this.b).Q(i11);
                x3Var.u3.H();
                i1 i1Var = x3Var.S3;
                if (i1Var != null && (F = x3Var.F(i1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= x3Var.getHeight()) {
                        x3Var.S3 = null;
                        i1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(x3Var);
                        break;
                    }
                }
                break;
            case 1:
                e71 e71Var = ((ge) this.c).a;
                if (e71Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < e71Var.getChildCount(); i14++) {
                        if (!(e71Var.getChildAt(i14) instanceof w00)) {
                        }
                    }
                    break;
                }
                ((o8) this.b).run();
                break;
            case 2:
                yn ynVar = (yn) this.c;
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(ynVar.V0);
                }
                int N0 = ((s4.c0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > ynVar.K3.h - 5) {
                    if (ynVar.P3 != 7) {
                        ynVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!ynVar.E6 && !ynVar.A6[0]) {
                        ynVar.E6 = true;
                        ynVar.f6.add(Integer.valueOf(ynVar.T5));
                        i12 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = ynVar.s3;
                        i13 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
                        int i15 = ynVar.M3;
                        int i16 = ynVar.T5;
                        ynVar.T5 = i16 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i15, i16);
                        break;
                    }
                }
                break;
            case 3:
                uy uyVar = (uy) this.b;
                lh0 lh0Var = (lh0) this.c;
                e71 e71Var2 = lh0Var.c;
                if (!(TextUtils.isEmpty(lh0Var.w) ? lh0Var.e : lh0Var.n).isEmpty()) {
                    if (e71Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < e71Var2.getChildCount(); i17++) {
                            if (!(e71Var2.getChildAt(i17) instanceof w00)) {
                            }
                        }
                    }
                    lh0Var.a(false);
                }
                if (e71Var2.K1 && !lh0Var.Q && uyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(uyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 4:
                if (((qs) this.c).W.K1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 5:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                nv nvVar = (nv) this.c;
                mv mvVar = nvVar.f[0];
                if (recyclerView == mvVar.d || recyclerView == mvVar.e) {
                    kVar = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
                    float translationY = kVar.getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        nv.j0(nvVar, f7);
                        break;
                    }
                }
                break;
            case 6:
                wh0 wh0Var = (wh0) this.c;
                if (wh0Var.b0 && !wh0Var.W) {
                    if (wh0Var.X - ((gg.b0) this.b).N0() < 10) {
                        wh0Var.d0(true);
                        break;
                    }
                }
                break;
            case 7:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                br0 br0Var = (br0) this.c;
                if (recyclerView == br0Var.n[0].d) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) br0Var).actionBar;
                    float translationY2 = kVar2.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        br0.g0(br0Var, f10);
                        break;
                    }
                }
                break;
            case 8:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                ((qa0) this.c).D.b(recyclerView, i10, i11);
                break;
            default:
                xh.o2 o2Var = (xh.o2) this.c;
                xh.j2 j2Var = o2Var.f;
                if (o2Var.isAttachedToWindow()) {
                    if (j2Var.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < j2Var.getChildCount(); i18++) {
                            if (!(j2Var.getChildAt(i18) instanceof w00)) {
                            }
                        }
                    }
                    o2Var.e.a();
                }
                ((gs0) this.b).o();
                break;
        }
    }
}
