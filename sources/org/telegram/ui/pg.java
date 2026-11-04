package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ pg(int i3, View view) {
        this.a = i3;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        View view = this.b;
        switch (i3) {
            case 0:
                try {
                    view.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                view.setBackgroundDrawable(null);
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.V8;
                org.telegram.messenger.g0.E2(view);
                break;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.V8;
                view.setVisibility(8);
                break;
            case 4:
                org.telegram.messenger.az.I(0);
                ((org.telegram.ui.Cells.v9) view).c.c(org.telegram.messenger.bd.M0(2131744411, null), true, true);
                break;
            case 5:
                org.telegram.messenger.az.I(1);
                ((org.telegram.ui.Cells.v9) view).c.c(org.telegram.messenger.bd.M0(2131744410, null), true, true);
                break;
            default:
                org.telegram.messenger.az.I(2);
                ((org.telegram.ui.Cells.v9) view).c.c(org.telegram.messenger.bd.M0(2131744409, null), true, true);
                break;
        }
    }
}
