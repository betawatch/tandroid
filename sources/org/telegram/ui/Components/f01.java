package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f01 implements t71 {
    public final /* synthetic */ ThemeEditorView a;

    public f01(ThemeEditorView themeEditorView) {
        this.a = themeEditorView;
    }

    @Override // org.telegram.ui.Components.t71
    public final void a() {
        int i9 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.a;
            if (i9 >= themeEditorView.c.size()) {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.l;
                int i10 = ThemeEditorView.EditorAlert.I;
                editorAlert.K(true);
                return;
            } else {
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) themeEditorView.c.get(i9);
                int w02 = org.telegram.ui.ActionBar.f6.w0(h6Var.j, h6Var.f, false);
                h6Var.i = w02;
                if (i9 == 0) {
                    themeEditorView.l.b.c(w02);
                }
                i9++;
            }
        }
    }

    @Override // org.telegram.ui.Components.t71
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.e6 e6Var = this.a.m;
        org.telegram.ui.ActionBar.f6.rl.delete(org.telegram.ui.ActionBar.f6.Nd);
        org.telegram.ui.ActionBar.f6.rl.delete(org.telegram.ui.ActionBar.f6.Od);
        org.telegram.ui.ActionBar.f6.rl.delete(org.telegram.ui.ActionBar.f6.Pd);
        org.telegram.ui.ActionBar.f6.rl.delete(org.telegram.ui.ActionBar.f6.Qd);
        org.telegram.ui.ActionBar.f6.rl.delete(org.telegram.ui.ActionBar.f6.Rd);
        org.telegram.ui.ActionBar.f6.h0 = null;
        e6Var.v(null);
        if (bitmap == null) {
            org.telegram.ui.ActionBar.f6.f0 = null;
            org.telegram.ui.ActionBar.f6.e0 = null;
            org.telegram.ui.ActionBar.f6.r1(e6Var, false, false, false);
            org.telegram.ui.ActionBar.f6.o1(true);
            return;
        }
        org.telegram.ui.ActionBar.f6.f0 = new BitmapDrawable(bitmap);
        org.telegram.ui.ActionBar.f6.r1(e6Var, false, false, false);
        int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.f6.f0);
        int i9 = calcDrawableColor[0];
        org.telegram.ui.ActionBar.f6.c0 = i9;
        org.telegram.ui.ActionBar.f6.X = i9;
        int i10 = calcDrawableColor[1];
        org.telegram.ui.ActionBar.f6.d0 = i10;
        org.telegram.ui.ActionBar.f6.b0 = i10;
        Drawable drawable = org.telegram.ui.ActionBar.f6.e0;
        if (drawable != null) {
            org.telegram.ui.ActionBar.f6.i(drawable);
        }
        org.telegram.ui.ActionBar.f6.h(org.telegram.ui.ActionBar.f6.e0);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }
}
