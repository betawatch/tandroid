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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class oj extends f2.x {
    public boolean S;
    public final /* synthetic */ tn T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj(tn tnVar, boolean z10) {
        super(z10);
        this.T = tnVar;
    }

    @Override // f2.x
    public final boolean B1(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        byte b10;
        tn tnVar = this.T;
        em emVar = tnVar.w0;
        int i12 = emVar.F;
        if (i10 >= i12 && i10 < emVar.G && (i11 = i10 - i12) >= 0 && i11 < emVar.L().size() && (X8 = tnVar.X8((messageObject = (MessageObject) tnVar.w0.L().get(i11)))) != null) {
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

    @Override // f2.x
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            return !((org.telegram.ui.Cells.s1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override // f2.w0
    public final int G() {
        if (this.S) {
            return (int) this.T.o9;
        }
        return 0;
    }

    @Override // f2.w0
    public final int J() {
        return this.S ? (int) this.T.o9 : F();
    }

    @Override // f2.w0
    public final int K() {
        return this.S ? (int) ((this.n - this.T.o9) - C()) : super.K();
    }

    @Override // f2.j0
    public final int X0() {
        return (int) this.T.o9;
    }

    @Override // f2.w, f2.j0, f2.w0
    public final void b0(f2.d1 d1Var, f2.k1 k1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(d1Var, k1Var);
            return;
        }
        try {
            super.b0(d1Var, k1Var);
        } catch (Exception e10) {
            FileLog.e(e10);
            AndroidUtilities.runOnUIThread(new ui(this, 2));
        }
    }

    @Override // f2.j0
    public final void i1(int i10, int i11, boolean z10) {
        if (!z10) {
            i11 = (int) ((i11 - F()) + this.T.o9);
        }
        super.i1(i10, i11, z10);
    }

    @Override // f2.j0, f2.w0
    public final int j(f2.k1 k1Var) {
        this.S = true;
        int B0 = B0(k1Var);
        this.S = false;
        return B0;
    }

    @Override // f2.w, f2.j0, f2.w0
    public final int k(f2.k1 k1Var) {
        this.S = true;
        int C0 = C0(k1Var);
        this.S = false;
        return C0;
    }

    @Override // f2.w, f2.j0, f2.w0
    public final int l(f2.k1 k1Var) {
        this.S = true;
        int D0 = D0(k1Var);
        this.S = false;
        return D0;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    @Override // f2.w, f2.j0, f2.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, f2.d1 d1Var, f2.k1 k1Var) {
        int i11;
        boolean z10;
        int i12;
        float f9;
        float f10;
        float f11;
        float f12;
        kg.m0 m0Var;
        lg.e eVar;
        boolean z11 = false;
        tn tnVar = this.T;
        if (i10 < 0) {
            float f13 = tnVar.J9;
            if (f13 != 0.0f) {
                float f14 = f13 + i10;
                tnVar.J9 = f14;
                if (f14 < 0.0f) {
                    i10 = (int) f14;
                    tnVar.J9 = 0.0f;
                    tnVar.t0.invalidate();
                } else {
                    i10 = 0;
                }
            }
        }
        int childCount = tnVar.t0.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                i11 = 0;
                z10 = false;
                break;
            }
            View childAt = tnVar.t0.getChildAt(i13);
            float f15 = tnVar.o9;
            tnVar.t0.getClass();
            if (RecyclerView.R(childAt) == (tnVar.La ? 0 : tnVar.w0.h() - 1)) {
                i11 = super.o0(((float) (childAt.getTop() - i10)) > f15 ? (int) (childAt.getTop() - f15) : i10, d1Var, k1Var);
                z10 = true;
            } else {
                i13++;
            }
        }
        if (!z10) {
            i11 = super.o0(i10, d1Var, k1Var);
        }
        if (!tnVar.sc.f) {
            SparseArray[] sparseArrayArr = tnVar.S5;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i10 > 0 && i11 == 0 && (((ChatObject.isChannel(tnVar.e) && !tnVar.e.megagroup) || (tnVar.d4 && !UserObject.isBotForum(tnVar.f))) && (i12 = tnVar.N3) != 3 && i12 != 9 && i12 != 1 && tnVar.t0.getScrollState() == 1)) {
                lj ljVar = tnVar.t0;
                if (!ljVar.T1 && !ljVar.Z1 && !tnVar.A9()) {
                    if (tnVar.J9 == 0.0f && tnVar.L9 != null) {
                        ArrayList arrayList = tnVar.bb;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            tnVar.L9.i((TLRPC.Chat) tnVar.bb.get(0));
                        } else if (tnVar.d4) {
                            tnVar.L9.j();
                        } else {
                            tnVar.L9.h();
                        }
                    }
                    Animator animator = tnVar.M9;
                    if (animator != null) {
                        animator.removeAllListeners();
                        tnVar.M9.cancel();
                    }
                    if (tnVar.J9 < AndroidUtilities.dp(110.0f)) {
                        float dp = tnVar.J9 / AndroidUtilities.dp(110.0f);
                        f10 = (1.0f - dp) * 0.65f;
                        f11 = dp * 0.45f;
                    } else if (tnVar.J9 < AndroidUtilities.dp(160.0f)) {
                        float dp2 = (tnVar.J9 - AndroidUtilities.dp(110.0f)) / AndroidUtilities.dp(50.0f);
                        f10 = (1.0f - dp2) * 0.45f;
                        f11 = dp2 * 0.05f;
                    } else {
                        f9 = 0.05f;
                        f12 = i10 * f9;
                        tnVar.J9 += f12;
                        int i14 = (int) f12;
                        m0Var = kg.m0.B;
                        if (m0Var != null) {
                            m0Var.r -= i14;
                            if (i14 != 0) {
                                m0Var.u = true;
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 31 && (eVar = tnVar.B) != null) {
                            eVar.f(0.0f, f12);
                        }
                        tnVar.t0.invalidate();
                    }
                    f9 = f11 + f10;
                    f12 = i10 * f9;
                    tnVar.J9 += f12;
                    int i142 = (int) f12;
                    m0Var = kg.m0.B;
                    if (m0Var != null) {
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        eVar.f(0.0f, f12);
                    }
                    tnVar.t0.invalidate();
                }
            }
        }
        if (tnVar.J9 == 0.0f) {
            tnVar.t0.setOverScrollMode(0);
        } else {
            tnVar.t0.setOverScrollMode(2);
        }
        if (tnVar.L9 != null) {
            vd.a aVar = tnVar.qc;
            if (tnVar.J9 > 0.0f && tnVar.t0.getScrollState() == 1) {
                z11 = true;
            }
            aVar.a(z11, true);
        }
        return i11;
    }

    @Override // f2.j0, f2.w0
    public final void v0(RecyclerView recyclerView, f2.k1 k1Var, int i10) {
        this.T.oa = false;
        uh.n nVar = new uh.n(recyclerView.getContext(), 0);
        nVar.a = i10;
        w0(nVar);
    }

    @Override // f2.w, f2.j0, f2.w0
    public final boolean y0() {
        return true;
    }
}
