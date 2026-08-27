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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nj extends f2.y {
    public boolean S;
    public final /* synthetic */ rn T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(rn rnVar, boolean z10) {
        super(z10);
        this.T = rnVar;
    }

    @Override // f2.y
    public final boolean B1(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        byte b10;
        rn rnVar = this.T;
        dm dmVar = rnVar.w0;
        int i12 = dmVar.F;
        if (i10 >= i12 && i10 < dmVar.G && (i11 = i10 - i12) >= 0 && i11 < dmVar.L().size() && (X8 = rnVar.X8((messageObject = (MessageObject) rnVar.w0.L().get(i11)))) != null) {
            MessageObject.GroupedMessagePosition position = X8.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = X8.posArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = X8.posArray.get(i13);
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

    @Override // f2.y
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            return !((org.telegram.ui.Cells.s1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override // f2.x0
    public final int G() {
        if (this.S) {
            return (int) this.T.o9;
        }
        return 0;
    }

    @Override // f2.x0
    public final int J() {
        return this.S ? (int) this.T.o9 : F();
    }

    @Override // f2.x0
    public final int K() {
        return this.S ? (int) ((this.n - this.T.o9) - C()) : super.K();
    }

    @Override // f2.k0
    public final int X0() {
        return (int) this.T.o9;
    }

    @Override // f2.x, f2.k0, f2.x0
    public final void b0(f2.e1 e1Var, f2.l1 l1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(e1Var, l1Var);
            return;
        }
        try {
            super.b0(e1Var, l1Var);
        } catch (Exception e9) {
            FileLog.e(e9);
            AndroidUtilities.runOnUIThread(new ti(this, 2));
        }
    }

    @Override // f2.k0
    public final void i1(int i10, int i11, boolean z10) {
        if (!z10) {
            i11 = (int) ((i11 - F()) + this.T.o9);
        }
        super.i1(i10, i11, z10);
    }

    @Override // f2.k0, f2.x0
    public final int j(f2.l1 l1Var) {
        this.S = true;
        int B0 = B0(l1Var);
        this.S = false;
        return B0;
    }

    @Override // f2.x, f2.k0, f2.x0
    public final int k(f2.l1 l1Var) {
        this.S = true;
        int C0 = C0(l1Var);
        this.S = false;
        return C0;
    }

    @Override // f2.x, f2.k0, f2.x0
    public final int l(f2.l1 l1Var) {
        this.S = true;
        int D0 = D0(l1Var);
        this.S = false;
        return D0;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    @Override // f2.x, f2.k0, f2.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, f2.e1 e1Var, f2.l1 l1Var) {
        int i11;
        boolean z10;
        int i12;
        float f10;
        float f11;
        float f12;
        float f13;
        ig.m0 m0Var;
        jg.e eVar;
        boolean z11 = false;
        rn rnVar = this.T;
        if (i10 < 0) {
            float f14 = rnVar.J9;
            if (f14 != 0.0f) {
                float f15 = f14 + i10;
                rnVar.J9 = f15;
                if (f15 < 0.0f) {
                    i10 = (int) f15;
                    rnVar.J9 = 0.0f;
                    rnVar.t0.invalidate();
                } else {
                    i10 = 0;
                }
            }
        }
        int childCount = rnVar.t0.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                i11 = 0;
                z10 = false;
                break;
            }
            View childAt = rnVar.t0.getChildAt(i13);
            float f16 = rnVar.o9;
            rnVar.t0.getClass();
            if (RecyclerView.R(childAt) == (rnVar.La ? 0 : rnVar.w0.h() - 1)) {
                i11 = super.o0(((float) (childAt.getTop() - i10)) > f16 ? (int) (childAt.getTop() - f16) : i10, e1Var, l1Var);
                z10 = true;
            } else {
                i13++;
            }
        }
        if (!z10) {
            i11 = super.o0(i10, e1Var, l1Var);
        }
        if (!rnVar.sc.f) {
            SparseArray[] sparseArrayArr = rnVar.S5;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i10 > 0 && i11 == 0 && (((ChatObject.isChannel(rnVar.e) && !rnVar.e.megagroup) || (rnVar.d4 && !UserObject.isBotForum(rnVar.f))) && (i12 = rnVar.N3) != 3 && i12 != 9 && i12 != 1 && rnVar.t0.getScrollState() == 1)) {
                kj kjVar = rnVar.t0;
                if (!kjVar.T1 && !kjVar.Z1 && !rnVar.A9()) {
                    if (rnVar.J9 == 0.0f && rnVar.L9 != null) {
                        ArrayList arrayList = rnVar.bb;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            rnVar.L9.i((TLRPC.Chat) rnVar.bb.get(0));
                        } else if (rnVar.d4) {
                            rnVar.L9.j();
                        } else {
                            rnVar.L9.h();
                        }
                    }
                    Animator animator = rnVar.M9;
                    if (animator != null) {
                        animator.removeAllListeners();
                        rnVar.M9.cancel();
                    }
                    if (rnVar.J9 < AndroidUtilities.dp(110.0f)) {
                        float dp = rnVar.J9 / AndroidUtilities.dp(110.0f);
                        f11 = (1.0f - dp) * 0.65f;
                        f12 = dp * 0.45f;
                    } else if (rnVar.J9 < AndroidUtilities.dp(160.0f)) {
                        float dp2 = (rnVar.J9 - AndroidUtilities.dp(110.0f)) / AndroidUtilities.dp(50.0f);
                        f11 = (1.0f - dp2) * 0.45f;
                        f12 = dp2 * 0.05f;
                    } else {
                        f10 = 0.05f;
                        f13 = i10 * f10;
                        rnVar.J9 += f13;
                        int i14 = (int) f13;
                        m0Var = ig.m0.B;
                        if (m0Var != null) {
                            m0Var.r -= i14;
                            if (i14 != 0) {
                                m0Var.u = true;
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 31 && (eVar = rnVar.B) != null) {
                            eVar.f(0.0f, f13);
                        }
                        rnVar.t0.invalidate();
                    }
                    f10 = f12 + f11;
                    f13 = i10 * f10;
                    rnVar.J9 += f13;
                    int i142 = (int) f13;
                    m0Var = ig.m0.B;
                    if (m0Var != null) {
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        eVar.f(0.0f, f13);
                    }
                    rnVar.t0.invalidate();
                }
            }
        }
        if (rnVar.J9 == 0.0f) {
            rnVar.t0.setOverScrollMode(0);
        } else {
            rnVar.t0.setOverScrollMode(2);
        }
        if (rnVar.L9 != null) {
            ud.a aVar = rnVar.qc;
            if (rnVar.J9 > 0.0f && rnVar.t0.getScrollState() == 1) {
                z11 = true;
            }
            aVar.a(z11, true);
        }
        return i11;
    }

    @Override // f2.k0, f2.x0
    public final void v0(RecyclerView recyclerView, f2.l1 l1Var, int i10) {
        this.T.oa = false;
        sh.n nVar = new sh.n(recyclerView.getContext(), 0);
        nVar.a = i10;
        w0(nVar);
    }

    @Override // f2.x, f2.k0, f2.x0
    public final boolean y0() {
        return true;
    }
}
