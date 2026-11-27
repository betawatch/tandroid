// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hs1 implements h49 {
    public final /* synthetic */ zu1 a;

    public hs1(zu1 zu1Var) {
        this.a = zu1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        if (r4 == null) goto L24;
     */
    @Override // h49
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(View view, w49 w49Var, boolean z, boolean z2) {
        TLRPC.Document e;
        HashSet hashSet;
        int i;
        int i2;
        r47 r47Var;
        TLRPC.Message message;
        zu1 zu1Var = this.a;
        gs1 gs1Var = zu1Var.Mb;
        SparseArray[] sparseArrayArr = zu1Var.o6;
        if (gs1Var != null) {
            if (zu1Var.a() == zu1Var.getUserConfig().e() && !zu1Var.getUserConfig().p()) {
                new xk8((e) zu1Var, 24, true).show();
                zu1Var.L5(false);
                return;
            }
            boolean contains = zu1Var.Mb.getSelectedReactions().contains(w49Var);
            HashSet hashSet2 = new HashSet();
            int i3 = 0;
            boolean z3 = false;
            boolean z4 = false;
            int i4 = 0;
            while (i3 < sparseArrayArr.length) {
                boolean z5 = z3;
                boolean z6 = z4;
                int i5 = i4;
                int i6 = 0;
                while (i6 < sparseArrayArr[i3].size()) {
                    r47 r47Var2 = (r47) sparseArrayArr[i3].valueAt(i6);
                    if (r47Var2.z2()) {
                        m47 v7 = zu1Var.v7(r47Var2);
                        if (v7 != null && !hashSet2.contains(Long.valueOf(v7.a))) {
                            hashSet2.add(Long.valueOf(v7.a));
                            r47Var2 = v7.c();
                        }
                        hashSet = hashSet2;
                        i = i3;
                        i2 = i6;
                        i6 = i2 + 1;
                        i3 = i;
                        hashSet2 = hashSet;
                    }
                    if (r47Var2.v2(w49Var) == contains) {
                        int i7 = i3;
                        r47Var = r47Var2;
                        i2 = i6;
                        i = i7;
                        hashSet = hashSet2;
                        zu1Var.wb(zu1Var.L6(r47Var2.e1(), false), r47Var, null, null, 0.0f, 0.0f, w49Var, false, false, false, true);
                        if (!contains) {
                            i5++;
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i3;
                        i2 = i6;
                        r47Var = r47Var2;
                    }
                    if (r47Var.k != null) {
                        boolean z7 = zu1Var.D0.O;
                        if (z7) {
                            r47 r47Var3 = (r47) zu1Var.G6[0].get(r47Var.e1());
                            if (r47Var3 != null && (message = r47Var3.k) != null) {
                                message.reactions = r47Var.k.reactions;
                            }
                        } else if (!z7 && zu1Var.F3 != null) {
                            z5 = true;
                        }
                    }
                    if (zu1Var.D0.O && !r47Var.v2(zu1Var.F3)) {
                        m47 v72 = zu1Var.v7(r47Var);
                        if (v72 != null) {
                            ArrayList arrayList = v72.d;
                            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                zu1Var.getMediaDataController().P1(((r47) arrayList.get(i8)).e1());
                            }
                        } else {
                            zu1Var.getMediaDataController().P1(r47Var.e1());
                        }
                        yc7 yc7Var = zu1Var.b4;
                        if (yc7Var != null) {
                            yc7Var.f();
                        }
                        z5 = true;
                        z6 = true;
                    }
                    i6 = i2 + 1;
                    i3 = i;
                    hashSet2 = hashSet;
                }
                i3++;
                z3 = z5;
                z4 = z6;
                i4 = i5;
            }
            if (z3) {
                zu1Var.Sc(z4);
            }
            zu1Var.L5(true);
            if (i4 > 0) {
                long j = w49Var.g;
                int i9 = yac.t0;
                if (j == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(i9).r.get(w49Var.f);
                    if (tL_availableReaction == null) {
                        return;
                    } else {
                        e = tL_availableReaction.activate_animation;
                    }
                } else {
                    e = wl.e(i9, j);
                }
                if (e != null) {
                    d31.b0(zu1Var).y(i4, e, null).k(true);
                }
            }
        }
    }

    @Override // h49
    public final boolean j() {
        return true;
    }

    @Override // h49
    public final boolean k() {
        return false;
    }

    @Override // h49
    public final boolean p() {
        return false;
    }

    @Override // h49
    public final void n() {
    }

    @Override // h49
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
