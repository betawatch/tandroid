package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c11 implements r81 {
    public final /* synthetic */ ThemeEditorView a;

    public c11(ThemeEditorView themeEditorView) {
        this.a = themeEditorView;
    }

    @Override // org.telegram.ui.Components.r81
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.a;
            if (i10 >= themeEditorView.c.size()) {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.l;
                int i11 = ThemeEditorView.EditorAlert.J;
                editorAlert.K(true);
                return;
            } else {
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) themeEditorView.c.get(i10);
                int w02 = org.telegram.ui.ActionBar.k6.w0(m6Var.j, m6Var.f, false);
                m6Var.i = w02;
                if (i10 == 0) {
                    themeEditorView.l.b.c(w02);
                }
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.r81
    public final void b(File file, Bitmap bitmap, boolean z4) {
        org.telegram.ui.ActionBar.j6 j6Var = this.a.m;
        org.telegram.ui.ActionBar.k6.rl.delete(org.telegram.ui.ActionBar.k6.Nd);
        org.telegram.ui.ActionBar.k6.rl.delete(org.telegram.ui.ActionBar.k6.Od);
        org.telegram.ui.ActionBar.k6.rl.delete(org.telegram.ui.ActionBar.k6.Pd);
        org.telegram.ui.ActionBar.k6.rl.delete(org.telegram.ui.ActionBar.k6.Qd);
        org.telegram.ui.ActionBar.k6.rl.delete(org.telegram.ui.ActionBar.k6.Rd);
        org.telegram.ui.ActionBar.k6.h0 = null;
        j6Var.v(null);
        if (bitmap == null) {
            org.telegram.ui.ActionBar.k6.f0 = null;
            org.telegram.ui.ActionBar.k6.e0 = null;
            org.telegram.ui.ActionBar.k6.r1(j6Var, false, false, false);
            org.telegram.ui.ActionBar.k6.o1(true);
            return;
        }
        org.telegram.ui.ActionBar.k6.f0 = new BitmapDrawable(bitmap);
        org.telegram.ui.ActionBar.k6.r1(j6Var, false, false, false);
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
