package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ jh(int i10, View view) {
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
                Drawable[] drawableArr = PhotoViewer.T8;
                AndroidUtilities.removeFromParent(view);
                break;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.T8;
                view.setVisibility(8);
                break;
            case 4:
                SharedConfig.setSuggestStickers(0);
                ((org.telegram.ui.Cells.ea) view).c.c(LocaleController.getString(R.string.SuggestStickersAll), true, true);
                break;
            case 5:
                SharedConfig.setSuggestStickers(1);
                ((org.telegram.ui.Cells.ea) view).c.c(LocaleController.getString(R.string.SuggestStickersInstalled), true, true);
                break;
            default:
                SharedConfig.setSuggestStickers(2);
                ((org.telegram.ui.Cells.ea) view).c.c(LocaleController.getString(R.string.SuggestStickersNone), true, true);
                break;
        }
    }
}
