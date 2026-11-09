package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class gz0 implements b71 {
    public final /* synthetic */ ThemeEditorView a;

    public gz0(ThemeEditorView themeEditorView) {
        this.a = themeEditorView;
    }

    @Override // org.telegram.ui.Components.b71
    public final void a() {
        int i7 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.a;
            if (i7 >= themeEditorView.e.size()) {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.n;
                int i10 = ThemeEditorView.EditorAlert.D1;
                editorAlert.L0(true);
                return;
            } else {
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) themeEditorView.e.get(i7);
                int x02 = org.telegram.ui.ActionBar.l6.x0(u6Var.i, u6Var.e, false);
                u6Var.h = x02;
                if (i7 == 0) {
                    themeEditorView.n.i1.c(x02);
                }
                i7++;
            }
        }
    }

    @Override // org.telegram.ui.Components.b71
    public final void b(File file, Bitmap bitmap, boolean z9) {
        org.telegram.ui.ActionBar.k6 k6Var = this.a.o;
        org.telegram.ui.ActionBar.l6.im.delete(org.telegram.ui.ActionBar.l6.Be);
        org.telegram.ui.ActionBar.l6.im.delete(org.telegram.ui.ActionBar.l6.Ce);
        org.telegram.ui.ActionBar.l6.im.delete(org.telegram.ui.ActionBar.l6.De);
        org.telegram.ui.ActionBar.l6.im.delete(org.telegram.ui.ActionBar.l6.Ee);
        org.telegram.ui.ActionBar.l6.im.delete(org.telegram.ui.ActionBar.l6.Fe);
        org.telegram.ui.ActionBar.l6.h0 = null;
        k6Var.v(null);
        if (bitmap == null) {
            org.telegram.ui.ActionBar.l6.f0 = null;
            org.telegram.ui.ActionBar.l6.e0 = null;
            org.telegram.ui.ActionBar.l6.x1(k6Var, false, false, false);
            org.telegram.ui.ActionBar.l6.u1(true);
            return;
        }
        org.telegram.ui.ActionBar.l6.f0 = new BitmapDrawable(bitmap);
        org.telegram.ui.ActionBar.l6.x1(k6Var, false, false, false);
        int[] q10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.l6.f0);
        int i7 = q10[0];
        org.telegram.ui.ActionBar.l6.c0 = i7;
        org.telegram.ui.ActionBar.l6.X = i7;
        int i10 = q10[1];
        org.telegram.ui.ActionBar.l6.d0 = i10;
        org.telegram.ui.ActionBar.l6.b0 = i10;
        org.telegram.ui.ActionBar.l6.i();
        org.telegram.ui.ActionBar.l6.h(org.telegram.ui.ActionBar.l6.e0);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.z4, new Object[0]);
    }
}
