package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class i21 implements aa1 {
    public final /* synthetic */ ThemeEditorView a;

    public i21(ThemeEditorView themeEditorView) {
        this.a = themeEditorView;
    }

    @Override // org.telegram.ui.Components.aa1
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.a;
            if (i10 >= themeEditorView.e.size()) {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.n;
                int i11 = ThemeEditorView.EditorAlert.M;
                editorAlert.L(true);
                return;
            } else {
                org.telegram.ui.ActionBar.h7 h7Var = (org.telegram.ui.ActionBar.h7) themeEditorView.e.get(i10);
                int x02 = org.telegram.ui.ActionBar.y6.x0(h7Var.i, h7Var.e, false);
                h7Var.h = x02;
                if (i10 == 0) {
                    themeEditorView.n.b.c(x02);
                }
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.aa1
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.x6 x6Var = this.a.o;
        org.telegram.ui.ActionBar.y6.ul.delete(org.telegram.ui.ActionBar.y6.Nd);
        org.telegram.ui.ActionBar.y6.ul.delete(org.telegram.ui.ActionBar.y6.Od);
        org.telegram.ui.ActionBar.y6.ul.delete(org.telegram.ui.ActionBar.y6.Pd);
        org.telegram.ui.ActionBar.y6.ul.delete(org.telegram.ui.ActionBar.y6.Qd);
        org.telegram.ui.ActionBar.y6.ul.delete(org.telegram.ui.ActionBar.y6.Rd);
        org.telegram.ui.ActionBar.y6.h0 = null;
        x6Var.v(null);
        if (bitmap == null) {
            org.telegram.ui.ActionBar.y6.f0 = null;
            org.telegram.ui.ActionBar.y6.e0 = null;
            org.telegram.ui.ActionBar.y6.u1(x6Var, false, false, false);
            org.telegram.ui.ActionBar.y6.r1(true);
            return;
        }
        org.telegram.ui.ActionBar.y6.f0 = new BitmapDrawable(bitmap);
        org.telegram.ui.ActionBar.y6.u1(x6Var, false, false, false);
        int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.y6.f0);
        int i10 = calcDrawableColor[0];
        org.telegram.ui.ActionBar.y6.c0 = i10;
        org.telegram.ui.ActionBar.y6.X = i10;
        int i11 = calcDrawableColor[1];
        org.telegram.ui.ActionBar.y6.d0 = i11;
        org.telegram.ui.ActionBar.y6.b0 = i11;
        Drawable drawable = org.telegram.ui.ActionBar.y6.e0;
        if (drawable != null) {
            org.telegram.ui.ActionBar.y6.i(drawable);
        }
        org.telegram.ui.ActionBar.y6.h(org.telegram.ui.ActionBar.y6.e0);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }
}
