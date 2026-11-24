// default package

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nr8 implements egc {
    public final /* synthetic */ zo8 a;

    public nr8(zo8 zo8Var) {
        this.a = zo8Var;
    }

    @Override // egc
    public final void a(int i) {
        zo8 zo8Var = this.a;
        int i2 = zo8Var.p1;
        boolean z = i >= i2;
        if (i != i2) {
            zo8Var.p1 = i;
        }
        xb7 xb7Var = zo8Var.T0;
        if (xb7Var != null) {
            sr8 sr8Var = zo8Var.E0;
            xb7Var.b(i - (sr8Var != null ? sr8Var.j() : 0), z);
        }
    }

    @Override // egc
    public final void b(float f, int i, int i2) {
        gn5 gn5Var;
        zo8 zo8Var = this.a;
        zo8Var.B(f, i);
        if (i2 == 0) {
            int k = zo8Var.E0.k(i);
            zo8Var.getCurrentItemView();
            int childCount = zo8Var.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = zo8Var.getChildAt(i3);
                if (childAt instanceof bf0) {
                    sr8 sr8Var = zo8Var.E0;
                    int k2 = sr8Var.k(sr8Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((bf0) childAt).getImageReceiver();
                    boolean z = imageReceiver.u0;
                    if (k2 >= 0 && k2 < zo8Var.X0.size()) {
                        if (k2 == k) {
                            if (!z) {
                                imageReceiver.u0 = true;
                                imageReceiver.w0(false);
                            }
                            gn5 gn5Var2 = (gn5) zo8Var.X0.get(k2);
                            if (gn5Var2 != null) {
                                bc4 G = bc4.G(zo8Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gn5Var2.f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    bc4.K.c(new pv3(G, tL_fileLocationToBeDeprecated, (byte) 23));
                                }
                            }
                        } else if (z) {
                            kn m = imageReceiver.m();
                            if (m != null && (gn5Var = (gn5) zo8Var.X0.get(k2)) != null) {
                                m.y(gn5Var.j, false, true);
                            }
                            imageReceiver.u0 = false;
                            imageReceiver.x0();
                        }
                    }
                }
            }
        }
    }

    @Override // egc
    public final void c(int i) {
    }
}
