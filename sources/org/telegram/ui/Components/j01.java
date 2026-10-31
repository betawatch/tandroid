package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j01 implements b81 {
    public final /* synthetic */ ThemeEditorView a;

    public j01(ThemeEditorView themeEditorView) {
        this.a = themeEditorView;
    }

    @Override // org.telegram.ui.Components.b81
    public final void a() {
        int i10 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.a;
            if (i10 >= themeEditorView.e.size()) {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.n;
                int i11 = ThemeEditorView.EditorAlert.D1;
                editorAlert.L0(true);
                return;
            } else {
                org.telegram.ui.ActionBar.c7 c7Var = (org.telegram.ui.ActionBar.c7) themeEditorView.e.get(i10);
                int x02 = org.telegram.ui.ActionBar.t6.x0(c7Var.i, c7Var.e, false);
                c7Var.h = x02;
                if (i10 == 0) {
                    themeEditorView.n.i1.c(x02);
                }
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.b81
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.s6 s6Var = this.a.o;
        org.telegram.ui.ActionBar.t6.im.delete(org.telegram.ui.ActionBar.t6.Be);
        org.telegram.ui.ActionBar.t6.im.delete(org.telegram.ui.ActionBar.t6.Ce);
        org.telegram.ui.ActionBar.t6.im.delete(org.telegram.ui.ActionBar.t6.De);
        org.telegram.ui.ActionBar.t6.im.delete(org.telegram.ui.ActionBar.t6.Ee);
        org.telegram.ui.ActionBar.t6.im.delete(org.telegram.ui.ActionBar.t6.Fe);
        org.telegram.ui.ActionBar.t6.h0 = null;
        s6Var.v(null);
        if (bitmap == null) {
            org.telegram.ui.ActionBar.t6.f0 = null;
            org.telegram.ui.ActionBar.t6.e0 = null;
            org.telegram.ui.ActionBar.t6.x1(s6Var, false, false, false);
            org.telegram.ui.ActionBar.t6.u1(true);
            return;
        }
        org.telegram.ui.ActionBar.t6.f0 = new BitmapDrawable(bitmap);
        org.telegram.ui.ActionBar.t6.x1(s6Var, false, false, false);
        int[] q6 = org.telegram.messenger.i0.q(org.telegram.ui.ActionBar.t6.f0);
        int i10 = q6[0];
        org.telegram.ui.ActionBar.t6.c0 = i10;
        org.telegram.ui.ActionBar.t6.X = i10;
        int i11 = q6[1];
        org.telegram.ui.ActionBar.t6.d0 = i11;
        org.telegram.ui.ActionBar.t6.b0 = i11;
        org.telegram.ui.ActionBar.t6.i();
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.t6.e0);
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.z4, new Object[0]);
    }
}
