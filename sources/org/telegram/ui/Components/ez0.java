package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ez0 implements s61 {
    public final /* synthetic */ ThemeEditorView a;

    public ez0(ThemeEditorView themeEditorView) {
        this.a = themeEditorView;
    }

    @Override // org.telegram.ui.Components.s61
    public final void a() {
        int i3 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.a;
            if (i3 >= themeEditorView.e.size()) {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.n;
                int i10 = ThemeEditorView.EditorAlert.E1;
                editorAlert.L0(true);
                return;
            } else {
                org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) themeEditorView.e.get(i3);
                int x02 = org.telegram.ui.ActionBar.k6.x0(t6Var.i, t6Var.e, false);
                t6Var.h = x02;
                if (i3 == 0) {
                    themeEditorView.n.j1.c(x02);
                }
                i3++;
            }
        }
    }

    @Override // org.telegram.ui.Components.s61
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.j6 j6Var = this.a.o;
        org.telegram.ui.ActionBar.k6.im.delete(org.telegram.ui.ActionBar.k6.Be);
        org.telegram.ui.ActionBar.k6.im.delete(org.telegram.ui.ActionBar.k6.Ce);
        org.telegram.ui.ActionBar.k6.im.delete(org.telegram.ui.ActionBar.k6.De);
        org.telegram.ui.ActionBar.k6.im.delete(org.telegram.ui.ActionBar.k6.Ee);
        org.telegram.ui.ActionBar.k6.im.delete(org.telegram.ui.ActionBar.k6.Fe);
        org.telegram.ui.ActionBar.k6.h0 = null;
        j6Var.v(null);
        if (bitmap == null) {
            org.telegram.ui.ActionBar.k6.f0 = null;
            org.telegram.ui.ActionBar.k6.e0 = null;
            org.telegram.ui.ActionBar.k6.x1(j6Var, false, false, false);
            org.telegram.ui.ActionBar.k6.u1(true);
            return;
        }
        org.telegram.ui.ActionBar.k6.f0 = new BitmapDrawable(bitmap);
        org.telegram.ui.ActionBar.k6.x1(j6Var, false, false, false);
        int[] q10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.k6.f0);
        int i3 = q10[0];
        org.telegram.ui.ActionBar.k6.c0 = i3;
        org.telegram.ui.ActionBar.k6.X = i3;
        int i10 = q10[1];
        org.telegram.ui.ActionBar.k6.d0 = i10;
        org.telegram.ui.ActionBar.k6.b0 = i10;
        org.telegram.ui.ActionBar.k6.i();
        org.telegram.ui.ActionBar.k6.h(org.telegram.ui.ActionBar.k6.e0);
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.z4, new Object[0]);
    }
}
