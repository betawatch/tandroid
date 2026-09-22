package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class z01 implements o81 {
    public final /* synthetic */ ThemeEditorView a;

    public z01(ThemeEditorView themeEditorView) {
        this.a = themeEditorView;
    }

    @Override // org.telegram.ui.Components.o81
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.a;
            if (i10 >= themeEditorView.c.size()) {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.l;
                int i11 = ThemeEditorView.EditorAlert.M;
                editorAlert.L(true);
                return;
            } else {
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) themeEditorView.c.get(i10);
                int w02 = org.telegram.ui.ActionBar.i6.w0(k6Var.j, k6Var.f, false);
                k6Var.i = w02;
                if (i10 == 0) {
                    themeEditorView.l.b.c(w02);
                }
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.o81
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.h6 h6Var = this.a.m;
        org.telegram.ui.ActionBar.i6.rl.delete(org.telegram.ui.ActionBar.i6.Nd);
        org.telegram.ui.ActionBar.i6.rl.delete(org.telegram.ui.ActionBar.i6.Od);
        org.telegram.ui.ActionBar.i6.rl.delete(org.telegram.ui.ActionBar.i6.Pd);
        org.telegram.ui.ActionBar.i6.rl.delete(org.telegram.ui.ActionBar.i6.Qd);
        org.telegram.ui.ActionBar.i6.rl.delete(org.telegram.ui.ActionBar.i6.Rd);
        org.telegram.ui.ActionBar.i6.h0 = null;
        h6Var.v(null);
        if (bitmap == null) {
            org.telegram.ui.ActionBar.i6.f0 = null;
            org.telegram.ui.ActionBar.i6.e0 = null;
            org.telegram.ui.ActionBar.i6.r1(h6Var, false, false, false);
            org.telegram.ui.ActionBar.i6.o1(true);
            return;
        }
        org.telegram.ui.ActionBar.i6.f0 = new BitmapDrawable(bitmap);
        org.telegram.ui.ActionBar.i6.r1(h6Var, false, false, false);
        int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.i6.f0);
        int i10 = calcDrawableColor[0];
        org.telegram.ui.ActionBar.i6.c0 = i10;
        org.telegram.ui.ActionBar.i6.X = i10;
        int i11 = calcDrawableColor[1];
        org.telegram.ui.ActionBar.i6.d0 = i11;
        org.telegram.ui.ActionBar.i6.b0 = i11;
        Drawable drawable = org.telegram.ui.ActionBar.i6.e0;
        if (drawable != null) {
            org.telegram.ui.ActionBar.i6.i(drawable);
        }
        org.telegram.ui.ActionBar.i6.h(org.telegram.ui.ActionBar.i6.e0);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }
}
