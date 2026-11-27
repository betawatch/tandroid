// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class lp1 extends yc8 {
    public final /* synthetic */ zu1 a;

    public lp1(zu1 zu1Var) {
        this.a = zu1Var;
    }

    @Override // yc8, ed8
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        if (i >= 0) {
            zu1 zu1Var = this.a;
            if (i < zu1Var.fb.size()) {
                zu1Var.zb((TLRPC.BotInlineResult) zu1Var.fb.get(i), z, i2, 0L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0075 A[LOOP:0: B:10:0x0029->B:17:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[SYNTHETIC] */
    @Override // yc8, ed8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        fr1 fr1Var;
        ImageReceiver imageReceiver;
        if (i >= 0) {
            zu1 zu1Var = this.a;
            if (i < zu1Var.fb.size() && (fr1Var = zu1Var.X1) != null && fr1Var.getListView() != null) {
                int childCount = zu1Var.X1.getListView().getChildCount();
                Object obj = zu1Var.fb.get(i);
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = zu1Var.X1.getListView().getChildAt(i2);
                    if (childAt instanceof vw2) {
                        vw2 vw2Var = (vw2) childAt;
                        if (vw2Var.getResult() == obj) {
                            imageReceiver = vw2Var.getPhotoImage();
                            if (imageReceiver == null) {
                                int[] iArr = new int[2];
                                childAt.getLocationInWindow(iArr);
                                fd8 fd8Var = new fd8();
                                fd8Var.b = iArr[0];
                                fd8Var.c = iArr[1];
                                fd8Var.d = zu1Var.X1.getListView();
                                fd8Var.a = imageReceiver;
                                fd8Var.e = imageReceiver.p();
                                fd8Var.h = imageReceiver.z();
                                return fd8Var;
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
