// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gt1 implements u29 {
    public final /* synthetic */ yv1 a;

    public gt1(yv1 yv1Var) {
        this.a = yv1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        if (r4 == null) goto L24;
     */
    @Override // u29
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, k39 k39Var, boolean z, boolean z2) {
        TLRPC.Document e;
        HashSet hashSet;
        int i;
        int i2;
        k47 k47Var;
        TLRPC.Message message;
        yv1 yv1Var = this.a;
        ft1 ft1Var = yv1Var.Jb;
        SparseArray[] sparseArrayArr = yv1Var.o6;
        if (ft1Var != null) {
            if (yv1Var.a() == yv1Var.getUserConfig().e() && !yv1Var.getUserConfig().p()) {
                new kj8((d) yv1Var, 24, true).show();
                yv1Var.M5(false);
                return;
            }
            boolean contains = yv1Var.Jb.getSelectedReactions().contains(k39Var);
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
                    k47 k47Var2 = (k47) sparseArrayArr[i3].valueAt(i6);
                    if (k47Var2.z2()) {
                        f47 v7 = yv1Var.v7(k47Var2);
                        if (v7 != null && !hashSet2.contains(Long.valueOf(v7.a))) {
                            hashSet2.add(Long.valueOf(v7.a));
                            k47Var2 = v7.c();
                        }
                        hashSet = hashSet2;
                        i = i3;
                        i2 = i6;
                        i6 = i2 + 1;
                        i3 = i;
                        hashSet2 = hashSet;
                    }
                    if (k47Var2.v2(k39Var) == contains) {
                        int i7 = i3;
                        k47Var = k47Var2;
                        i2 = i6;
                        i = i7;
                        hashSet = hashSet2;
                        yv1Var.vb(yv1Var.L6(k47Var2.e1(), false), k47Var, null, null, 0.0f, 0.0f, k39Var, false, false, false, true);
                        if (!contains) {
                            i5++;
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i3;
                        i2 = i6;
                        k47Var = k47Var2;
                    }
                    if (k47Var.k != null) {
                        boolean z7 = yv1Var.D0.O;
                        if (z7) {
                            k47 k47Var3 = (k47) yv1Var.G6[0].get(k47Var.e1());
                            if (k47Var3 != null && (message = k47Var3.k) != null) {
                                message.reactions = k47Var.k.reactions;
                            }
                        } else if (!z7 && yv1Var.F3 != null) {
                            z5 = true;
                        }
                    }
                    if (yv1Var.D0.O && !k47Var.v2(yv1Var.F3)) {
                        f47 v72 = yv1Var.v7(k47Var);
                        if (v72 != null) {
                            ArrayList arrayList = v72.d;
                            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                yv1Var.getMediaDataController().P1(((k47) arrayList.get(i8)).e1());
                            }
                        } else {
                            yv1Var.getMediaDataController().P1(k47Var.e1());
                        }
                        sc7 sc7Var = yv1Var.b4;
                        if (sc7Var != null) {
                            sc7Var.f();
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
                yv1Var.Sc(z4);
            }
            yv1Var.M5(true);
            if (i4 > 0) {
                long j = k39Var.g;
                int i9 = z8c.t0;
                if (j == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(i9).r.get(k39Var.f);
                    if (tL_availableReaction == null) {
                        return;
                    } else {
                        e = tL_availableReaction.activate_animation;
                    }
                } else {
                    e = vm.e(i9, j);
                }
                if (e != null) {
                    c41.b0(yv1Var).y(i4, e, null).k(true);
                }
            }
        }
    }

    @Override // u29
    public final boolean h() {
        return true;
    }

    @Override // u29
    public final boolean l() {
        return false;
    }

    @Override // u29
    public final boolean s() {
        return false;
    }

    @Override // u29
    public final void o() {
    }

    @Override // u29
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
