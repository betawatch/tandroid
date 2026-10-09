package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class e21 implements u91 {
    public final /* synthetic */ ThemeEditorView a;

    public e21(ThemeEditorView themeEditorView) {
        this.a = themeEditorView;
    }

    @Override // org.telegram.ui.Components.u91
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
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) themeEditorView.c.get(i10);
                int x02 = org.telegram.ui.ActionBar.i6.x0(k6Var.j, k6Var.f, false);
                k6Var.i = x02;
                if (i10 == 0) {
                    themeEditorView.l.b.c(x02);
                }
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.u91
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.h6 h6Var = this.a.m;
        org.telegram.ui.ActionBar.i6.ul.delete(org.telegram.ui.ActionBar.i6.Nd);
        org.telegram.ui.ActionBar.i6.ul.delete(org.telegram.ui.ActionBar.i6.Od);
        org.telegram.ui.ActionBar.i6.ul.delete(org.telegram.ui.ActionBar.i6.Pd);
        org.telegram.ui.ActionBar.i6.ul.delete(org.telegram.ui.ActionBar.i6.Qd);
        org.telegram.ui.ActionBar.i6.ul.delete(org.telegram.ui.ActionBar.i6.Rd);
        org.telegram.ui.ActionBar.i6.h0 = null;
        h6Var.v(null);
        if (bitmap == null) {
            org.telegram.ui.ActionBar.i6.f0 = null;
            org.telegram.ui.ActionBar.i6.e0 = null;
            org.telegram.ui.ActionBar.i6.s1(h6Var, false, false, false);
            org.telegram.ui.ActionBar.i6.p1(true);
            return;
        }
        org.telegram.ui.ActionBar.i6.f0 = new BitmapDrawable(bitmap);
        org.telegram.ui.ActionBar.i6.s1(h6Var, false, false, false);
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
