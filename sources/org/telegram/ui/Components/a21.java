package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class a21 implements r91 {
    public final /* synthetic */ ThemeEditorView a;

    public a21(ThemeEditorView themeEditorView) {
        this.a = themeEditorView;
    }

    @Override // org.telegram.ui.Components.r91
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
                org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) themeEditorView.e.get(i10);
                int x02 = org.telegram.ui.ActionBar.k6.x0(t6Var.i, t6Var.e, false);
                t6Var.h = x02;
                if (i10 == 0) {
                    themeEditorView.n.b.c(x02);
                }
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.r91
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.j6 j6Var = this.a.o;
        org.telegram.ui.ActionBar.k6.ul.delete(org.telegram.ui.ActionBar.k6.Nd);
        org.telegram.ui.ActionBar.k6.ul.delete(org.telegram.ui.ActionBar.k6.Od);
        org.telegram.ui.ActionBar.k6.ul.delete(org.telegram.ui.ActionBar.k6.Pd);
        org.telegram.ui.ActionBar.k6.ul.delete(org.telegram.ui.ActionBar.k6.Qd);
        org.telegram.ui.ActionBar.k6.ul.delete(org.telegram.ui.ActionBar.k6.Rd);
        org.telegram.ui.ActionBar.k6.h0 = null;
        j6Var.v(null);
        if (bitmap == null) {
            org.telegram.ui.ActionBar.k6.f0 = null;
            org.telegram.ui.ActionBar.k6.e0 = null;
            org.telegram.ui.ActionBar.k6.u1(j6Var, false, false, false);
            org.telegram.ui.ActionBar.k6.r1(true);
            return;
        }
        org.telegram.ui.ActionBar.k6.f0 = new BitmapDrawable(bitmap);
        org.telegram.ui.ActionBar.k6.u1(j6Var, false, false, false);
        int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.k6.f0);
        int i10 = calcDrawableColor[0];
        org.telegram.ui.ActionBar.k6.c0 = i10;
        org.telegram.ui.ActionBar.k6.X = i10;
        int i11 = calcDrawableColor[1];
        org.telegram.ui.ActionBar.k6.d0 = i11;
        org.telegram.ui.ActionBar.k6.b0 = i11;
        Drawable drawable = org.telegram.ui.ActionBar.k6.e0;
        if (drawable != null) {
            org.telegram.ui.ActionBar.k6.i(drawable);
        }
        org.telegram.ui.ActionBar.k6.h(org.telegram.ui.ActionBar.k6.e0);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }
}
