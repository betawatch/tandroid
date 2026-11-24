// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kq1 extends jb8 {
    public final /* synthetic */ yv1 a;

    public kq1(yv1 yv1Var) {
        this.a = yv1Var;
    }

    @Override // jb8, pb8
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        if (i >= 0) {
            yv1 yv1Var = this.a;
            if (i < yv1Var.fb.size()) {
                yv1Var.yb((TLRPC.BotInlineResult) yv1Var.fb.get(i), z, i2, 0L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0075 A[LOOP:0: B:10:0x0029->B:17:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[SYNTHETIC] */
    @Override // jb8, pb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        es1 es1Var;
        ImageReceiver imageReceiver;
        if (i >= 0) {
            yv1 yv1Var = this.a;
            if (i < yv1Var.fb.size() && (es1Var = yv1Var.X1) != null && es1Var.getListView() != null) {
                int childCount = yv1Var.X1.getListView().getChildCount();
                Object obj = yv1Var.fb.get(i);
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = yv1Var.X1.getListView().getChildAt(i2);
                    if (childAt instanceof lx2) {
                        lx2 lx2Var = (lx2) childAt;
                        if (lx2Var.getResult() == obj) {
                            imageReceiver = lx2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                qb8 qb8Var = new qb8();
                                qb8Var.b = iArr[0];
                                qb8Var.c = iArr[1];
                                qb8Var.d = yv1Var.X1.getListView();
                                qb8Var.a = imageReceiver;
                                qb8Var.e = imageReceiver.p();
                                qb8Var.h = imageReceiver.z();
                                return qb8Var;
                            }
                        }
                    }
                    imageReceiver = null;
                    if (imageReceiver == null) {
                    }
                }
            }
        }
        return null;
    }
}
