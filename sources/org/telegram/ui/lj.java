package org.telegram.ui;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lj extends f2.z {
    public boolean S;
    public final /* synthetic */ qn T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(qn qnVar, boolean z10) {
        super(z10);
        this.T = qnVar;
    }

    @Override // f2.z
    public final boolean B1(int i9) {
        int i10;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        byte b10;
        qn qnVar = this.T;
        bm bmVar = qnVar.w0;
        int i11 = bmVar.F;
        if (i9 >= i11 && i9 < bmVar.G && (i10 = i9 - i11) >= 0 && i10 < bmVar.L().size() && (X8 = qnVar.X8((messageObject = (MessageObject) qnVar.w0.L().get(i10)))) != null) {
            MessageObject.GroupedMessagePosition position = X8.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = X8.posArray.size();
                for (int i12 = 0; i12 < size; i12++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = X8.posArray.get(i12);
                    if (groupedMessagePosition != position) {
                        byte b11 = groupedMessagePosition.minY;
                        byte b12 = position.minY;
                        if (b11 <= b12 && groupedMessagePosition.maxY >= b12) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // f2.z
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            return !((org.telegram.ui.Cells.t1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override // f2.z0
    public final int G() {
        if (this.S) {
            return (int) this.T.o9;
        }
        return 0;
    }

    @Override // f2.z0
    public final int J() {
        return this.S ? (int) this.T.o9 : F();
    }

    @Override // f2.z0
    public final int K() {
        return this.S ? (int) ((this.n - this.T.o9) - C()) : super.K();
    }

    @Override // f2.m0
    public final int X0() {
        return (int) this.T.o9;
    }

    @Override // f2.y, f2.m0, f2.z0
    public final void b0(f2.g1 g1Var, f2.n1 n1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(g1Var, n1Var);
            return;
        }
        try {
            super.b0(g1Var, n1Var);
        } catch (Exception e10) {
            FileLog.e(e10);
            AndroidUtilities.runOnUIThread(new ri(this, 2));
        }
    }

    @Override // f2.m0
    public final void i1(int i9, int i10, boolean z10) {
        if (!z10) {
            i10 = (int) ((i10 - F()) + this.T.o9);
        }
        super.i1(i9, i10, z10);
    }

    @Override // f2.m0, f2.z0
    public final int j(f2.n1 n1Var) {
        this.S = true;
        int B0 = B0(n1Var);
        this.S = false;
        return B0;
    }

    @Override // f2.y, f2.m0, f2.z0
    public final int k(f2.n1 n1Var) {
        this.S = true;
        int C0 = C0(n1Var);
        this.S = false;
        return C0;
    }

    @Override // f2.y, f2.m0, f2.z0
    public final int l(f2.n1 n1Var) {
        this.S = true;
        int D0 = D0(n1Var);
        this.S = false;
        return D0;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    @Override // f2.y, f2.m0, f2.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i9, f2.g1 g1Var, f2.n1 n1Var) {
        int i10;
        boolean z10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        hg.n0 n0Var;
        ig.e eVar;
        boolean z11 = false;
        qn qnVar = this.T;
        if (i9 < 0) {
            float f14 = qnVar.J9;
            if (f14 != 0.0f) {
                float f15 = f14 + i9;
                qnVar.J9 = f15;
                if (f15 < 0.0f) {
                    i9 = (int) f15;
                    qnVar.J9 = 0.0f;
                    qnVar.t0.invalidate();
                } else {
                    i9 = 0;
                }
            }
        }
        int childCount = qnVar.t0.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                i10 = 0;
                z10 = false;
                break;
            }
            View childAt = qnVar.t0.getChildAt(i12);
            float f16 = qnVar.o9;
            qnVar.t0.getClass();
            if (RecyclerView.R(childAt) == (qnVar.La ? 0 : qnVar.w0.h() - 1)) {
                i10 = super.o0(((float) (childAt.getTop() - i9)) > f16 ? (int) (childAt.getTop() - f16) : i9, g1Var, n1Var);
                z10 = true;
            } else {
                i12++;
            }
        }
        if (!z10) {
            i10 = super.o0(i9, g1Var, n1Var);
        }
        if (!qnVar.sc.f) {
            SparseArray[] sparseArrayArr = qnVar.S5;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i9 > 0 && i10 == 0 && (((ChatObject.isChannel(qnVar.e) && !qnVar.e.megagroup) || (qnVar.d4 && !UserObject.isBotForum(qnVar.f))) && (i11 = qnVar.N3) != 3 && i11 != 9 && i11 != 1 && qnVar.t0.getScrollState() == 1)) {
                ij ijVar = qnVar.t0;
                if (!ijVar.T1 && !ijVar.Z1 && !qnVar.A9()) {
                    if (qnVar.J9 == 0.0f && qnVar.L9 != null) {
                        ArrayList arrayList = qnVar.bb;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            qnVar.L9.i((TLRPC.Chat) qnVar.bb.get(0));
                        } else if (qnVar.d4) {
                            qnVar.L9.j();
                        } else {
                            qnVar.L9.h();
                        }
                    }
                    Animator animator = qnVar.M9;
                    if (animator != null) {
                        animator.removeAllListeners();
                        qnVar.M9.cancel();
                    }
                    if (qnVar.J9 < AndroidUtilities.dp(110.0f)) {
                        float dp = qnVar.J9 / AndroidUtilities.dp(110.0f);
                        f11 = (1.0f - dp) * 0.65f;
                        f12 = dp * 0.45f;
                    } else if (qnVar.J9 < AndroidUtilities.dp(160.0f)) {
                        float dp2 = (qnVar.J9 - AndroidUtilities.dp(110.0f)) / AndroidUtilities.dp(50.0f);
                        f11 = (1.0f - dp2) * 0.45f;
                        f12 = dp2 * 0.05f;
                    } else {
                        f10 = 0.05f;
                        f13 = i9 * f10;
                        qnVar.J9 += f13;
                        int i13 = (int) f13;
                        n0Var = hg.n0.B;
                        if (n0Var != null) {
                            n0Var.r -= i13;
                            if (i13 != 0) {
                                n0Var.u = true;
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 31 && (eVar = qnVar.B) != null) {
                            eVar.f(0.0f, f13);
                        }
                        qnVar.t0.invalidate();
                    }
                    f10 = f12 + f11;
                    f13 = i9 * f10;
                    qnVar.J9 += f13;
                    int i132 = (int) f13;
                    n0Var = hg.n0.B;
                    if (n0Var != null) {
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        eVar.f(0.0f, f13);
                    }
                    qnVar.t0.invalidate();
                }
            }
        }
        if (qnVar.J9 == 0.0f) {
            qnVar.t0.setOverScrollMode(0);
        } else {
            qnVar.t0.setOverScrollMode(2);
        }
        if (qnVar.L9 != null) {
            td.a aVar = qnVar.qc;
            if (qnVar.J9 > 0.0f && qnVar.t0.getScrollState() == 1) {
                z11 = true;
            }
            aVar.a(z11, true);
        }
        return i10;
    }

    @Override // f2.m0, f2.z0
    public final void v0(RecyclerView recyclerView, f2.n1 n1Var, int i9) {
        this.T.oa = false;
        rh.n nVar = new rh.n(recyclerView.getContext(), 0);
        nVar.a = i9;
        w0(nVar);
    }

    @Override // f2.y, f2.m0, f2.z0
    public final boolean y0() {
        return true;
    }
}
