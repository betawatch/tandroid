package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ dh(int i10, View view) {
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
                view.setVisibility(8);
                break;
            case 3:
                Drawable[] drawableArr = PhotoViewer.U8;
                AndroidUtilities.removeFromParent(view);
                break;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                view.setVisibility(8);
                break;
            case 5:
                SharedConfig.setSuggestStickers(0);
                ((org.telegram.ui.Cells.ga) view).c.c(LocaleController.getString(R.string.SuggestStickersAll), true, true);
                break;
            case 6:
                SharedConfig.setSuggestStickers(1);
                ((org.telegram.ui.Cells.ga) view).c.c(LocaleController.getString(R.string.SuggestStickersInstalled), true, true);
                break;
            default:
                SharedConfig.setSuggestStickers(2);
                ((org.telegram.ui.Cells.ga) view).c.c(LocaleController.getString(R.string.SuggestStickersNone), true, true);
                break;
        }
    }
}
