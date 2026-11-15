package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hz0 implements b71 {
    public final /* synthetic */ ThemeEditorView a;

    public hz0(ThemeEditorView themeEditorView) {
        this.a = themeEditorView;
    }

    @Override // org.telegram.ui.Components.b71
    public final void a() {
        int i7 = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.a;
            if (i7 >= themeEditorView.e.size()) {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.n;
                int i10 = ThemeEditorView.EditorAlert.H1;
                editorAlert.L0(true);
                return;
            } else {
                org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) themeEditorView.e.get(i7);
                int x02 = org.telegram.ui.ActionBar.j6.x0(s6Var.i, s6Var.e, false);
                s6Var.h = x02;
                if (i7 == 0) {
                    themeEditorView.n.m1.c(x02);
                }
                i7++;
            }
        }
    }

    @Override // org.telegram.ui.Components.b71
    public final void b(File file, Bitmap bitmap, boolean z10) {
        org.telegram.ui.ActionBar.i6 i6Var = this.a.o;
        org.telegram.ui.ActionBar.j6.lm.delete(org.telegram.ui.ActionBar.j6.Ee);
        org.telegram.ui.ActionBar.j6.lm.delete(org.telegram.ui.ActionBar.j6.Fe);
        org.telegram.ui.ActionBar.j6.lm.delete(org.telegram.ui.ActionBar.j6.Ge);
        org.telegram.ui.ActionBar.j6.lm.delete(org.telegram.ui.ActionBar.j6.He);
        org.telegram.ui.ActionBar.j6.lm.delete(org.telegram.ui.ActionBar.j6.Ie);
        org.telegram.ui.ActionBar.j6.h0 = null;
        i6Var.v(null);
        if (bitmap == null) {
            org.telegram.ui.ActionBar.j6.f0 = null;
            org.telegram.ui.ActionBar.j6.e0 = null;
            org.telegram.ui.ActionBar.j6.x1(i6Var, false, false, false);
            org.telegram.ui.ActionBar.j6.u1(true);
            return;
        }
        org.telegram.ui.ActionBar.j6.f0 = new BitmapDrawable(bitmap);
        org.telegram.ui.ActionBar.j6.x1(i6Var, false, false, false);
        int[] q10 = org.telegram.messenger.g0.q(org.telegram.ui.ActionBar.j6.f0);
        int i7 = q10[0];
        org.telegram.ui.ActionBar.j6.c0 = i7;
        org.telegram.ui.ActionBar.j6.X = i7;
        int i10 = q10[1];
        org.telegram.ui.ActionBar.j6.d0 = i10;
        org.telegram.ui.ActionBar.j6.b0 = i10;
        org.telegram.ui.ActionBar.j6.i();
        org.telegram.ui.ActionBar.j6.h(org.telegram.ui.ActionBar.j6.e0);
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.z4, new Object[0]);
    }
}
