// default package

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cd implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zt5 zt5Var;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                id idVar = ((dd) obj).d;
                idVar.i(0, idVar.f != null && idVar.w.getScrollY() > idVar.x.getTop());
                if (idVar.u0 != null) {
                    if (idVar.w.getHeight() + idVar.w.getScrollY() < idVar.x.getBottom()) {
                        z = true;
                    }
                }
                idVar.i(1, z);
                idVar.w.invalidate();
                break;
            case 1:
                ((re4) obj).run();
                break;
            case 2:
                fu5 fu5Var = (fu5) obj;
                if (fu5Var.k0 != null && (zt5Var = fu5Var.m) != null && zt5Var.isShowing()) {
                    int[] iArr = new int[2];
                    fu5Var.k0.getLocationOnScreen(iArr);
                    int i = iArr[0];
                    int[] iArr2 = fu5Var.n0;
                    if (i != iArr2[0] || iArr[1] != iArr2[1]) {
                        iArr2[0] = i;
                        iArr2[1] = iArr[1];
                        fu5Var.P();
                        break;
                    }
                }
                break;
            case 3:
                wsc wscVar = (wsc) obj;
                if (wscVar.i1) {
                    wscVar.f0();
                    break;
                }
                break;
            default:
                zuc zucVar = (zuc) obj;
                PopupWindow popupWindow = zucVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    zucVar.c();
                    break;
                }
                break;
        }
    }
}
