// default package

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class be implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ be(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        wt5 wt5Var;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                he heVar = ((ce) obj).d;
                heVar.i(0, heVar.f != null && heVar.w.getScrollY() > heVar.x.getTop());
                if (heVar.u0 != null) {
                    if (heVar.w.getHeight() + heVar.w.getScrollY() < heVar.x.getBottom()) {
                        z = true;
                    }
                }
                heVar.i(1, z);
                heVar.w.invalidate();
                break;
            case 1:
                ((if4) obj).run();
                break;
            case 2:
                bu5 bu5Var = (bu5) obj;
                if (bu5Var.h0 != null && (wt5Var = bu5Var.m) != null && wt5Var.isShowing()) {
                    int[] iArr = new int[2];
                    bu5Var.h0.getLocationOnScreen(iArr);
                    int i = iArr[0];
                    int[] iArr2 = bu5Var.k0;
                    if (i != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i;
                        iArr2[1] = iArr[1];
                        bu5Var.P();
                        break;
                    }
                }
                break;
            case 3:
                mqc mqcVar = (mqc) obj;
                if (mqcVar.i1) {
                    mqcVar.f0();
                    break;
                }
                break;
            default:
                nsc nscVar = (nsc) obj;
                PopupWindow popupWindow = nscVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    nscVar.c();
                    break;
                }
                break;
        }
    }
}
