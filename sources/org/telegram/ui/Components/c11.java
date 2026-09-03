package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) themeEditorView.c.get(i10);
                int w02 = org.telegram.ui.ActionBar.j6.w0(l6Var.j, l6Var.f, false);
                l6Var.i = w02;
                if (i10 == 0) {
                    themeEditorView.l.b.c(w02);
                }
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.r81
    public final void b(File file, Bitmap bitmap, boolean z4) {
        org.telegram.ui.ActionBar.i6 i6Var = this.a.m;
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Nd);
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Od);
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Pd);
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Qd);
        org.telegram.ui.ActionBar.j6.rl.delete(org.telegram.ui.ActionBar.j6.Rd);
        org.telegram.ui.ActionBar.j6.h0 = null;
        i6Var.v(null);
        if (bitmap == null) {
            org.telegram.ui.ActionBar.j6.f0 = null;
            org.telegram.ui.ActionBar.j6.e0 = null;
            org.telegram.ui.ActionBar.j6.r1(i6Var, false, false, false);
            org.telegram.ui.ActionBar.j6.o1(true);
            return;
        }
        org.telegram.ui.ActionBar.j6.f0 = new BitmapDrawable(bitmap);
        org.telegram.ui.ActionBar.j6.r1(i6Var, false, false, false);
        int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(org.telegram.ui.ActionBar.j6.f0);
        int i10 = calcDrawableColor[0];
        org.telegram.ui.ActionBar.j6.c0 = i10;
        org.telegram.ui.ActionBar.j6.X = i10;
        int i11 = calcDrawableColor[1];
        org.telegram.ui.ActionBar.j6.d0 = i11;
        org.telegram.ui.ActionBar.j6.b0 = i11;
        Drawable drawable = org.telegram.ui.ActionBar.j6.e0;
        if (drawable != null) {
            org.telegram.ui.ActionBar.j6.i(drawable);
        }
        org.telegram.ui.ActionBar.j6.h(org.telegram.ui.ActionBar.j6.e0);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }
}
