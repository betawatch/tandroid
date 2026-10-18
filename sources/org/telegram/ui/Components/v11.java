package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class v11 implements i91 {
    public final /* synthetic */ ThemeEditorView a;

    public v11(ThemeEditorView themeEditorView) {
        this.a = themeEditorView;
    }

    @Override // org.telegram.ui.Components.i91
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.a;
            if (i10 >= themeEditorView.c.size()) {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.l;
                int i11 = ThemeEditorView.EditorAlert.M;
                editorAlert.M(true);
                return;
            } else {
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) themeEditorView.c.get(i10);
                int x02 = org.telegram.ui.ActionBar.h6.x0(j6Var.j, j6Var.f, false);
                j6Var.i = x02;
                if (i10 == 0) {
                    themeEditorView.l.b.c(x02);
                }
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.i91
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.a.m;
        org.telegram.ui.ActionBar.h6.ul.delete(org.telegram.ui.ActionBar.h6.Nd);
        org.telegram.ui.ActionBar.h6.ul.delete(org.telegram.ui.ActionBar.h6.Od);
        org.telegram.ui.ActionBar.h6.ul.delete(org.telegram.ui.ActionBar.h6.Pd);
        org.telegram.ui.ActionBar.h6.ul.delete(org.telegram.ui.ActionBar.h6.Qd);
        org.telegram.ui.ActionBar.h6.ul.delete(org.telegram.ui.ActionBar.h6.Rd);
        org.telegram.ui.ActionBar.h6.h0 = null;
        g6Var.v(null);
        if (bitmap == null) {
            org.telegram.ui.ActionBar.h6.f0 = null;
            org.telegram.ui.ActionBar.h6.e0 = null;
            org.telegram.ui.ActionBar.h6.s1(g6Var, false, false, false);
            org.telegram.ui.ActionBar.h6.p1(true);
            return;
        }
        org.telegram.ui.ActionBar.h6.f0 = new BitmapDrawable(bitmap);
        org.telegram.ui.ActionBar.h6.s1(g6Var, false, false, false);
        int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.h6.f0);
        int i10 = calcDrawableColor[0];
        org.telegram.ui.ActionBar.h6.c0 = i10;
        org.telegram.ui.ActionBar.h6.X = i10;
        int i11 = calcDrawableColor[1];
        org.telegram.ui.ActionBar.h6.d0 = i11;
        org.telegram.ui.ActionBar.h6.b0 = i11;
        Drawable drawable = org.telegram.ui.ActionBar.h6.e0;
        if (drawable != null) {
            org.telegram.ui.ActionBar.h6.i(drawable);
        }
        org.telegram.ui.ActionBar.h6.h(org.telegram.ui.ActionBar.h6.e0);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }
}
