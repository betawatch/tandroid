package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.widget.PopupWindow;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.md;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                w0 w0Var = (w0) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                if (callback != null) {
                    callback.run(Boolean.valueOf(w0Var.T));
                    break;
                }
                break;
            default:
                md mdVar = (md) this.b;
                lh.e eVar = (lh.e) this.c;
                ValueAnimator valueAnimator = mdVar.e;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    mdVar.e.cancel();
                    mdVar.e = null;
                }
                mdVar.b.removeOnAttachStateChangeListener(mdVar.i);
                eVar.setCenterMenuVisible(false);
                Bitmap bitmap = mdVar.f;
                if (bitmap != null) {
                    bitmap.recycle();
                    mdVar.f = null;
                    break;
                }
                break;
        }
    }
}
