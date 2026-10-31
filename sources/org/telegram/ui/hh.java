package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ hh(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        View view = this.b;
        switch (i10) {
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
                Drawable[] drawableArr = PhotoViewer.U8;
                org.telegram.messenger.i0.E2(view);
                break;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                view.setVisibility(8);
                break;
            case 4:
                org.telegram.messenger.tz.I(0);
                ((org.telegram.ui.Cells.x9) view).c.c(org.telegram.messenger.cd.L0(2131744427, null), true, true);
                break;
            case 5:
                org.telegram.messenger.tz.I(1);
                ((org.telegram.ui.Cells.x9) view).c.c(org.telegram.messenger.cd.L0(2131744426, null), true, true);
                break;
            default:
                org.telegram.messenger.tz.I(2);
                ((org.telegram.ui.Cells.x9) view).c.c(org.telegram.messenger.cd.L0(2131744425, null), true, true);
                break;
        }
    }
}
