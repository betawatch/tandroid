package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class s implements qvc {
    public final /* synthetic */ ThemeEditorView a;

    public s(ThemeEditorView themeEditorView) {
        this.a = themeEditorView;
    }

    @Override // qvc
    public final void a() {
        int i = 0;
        while (true) {
            ThemeEditorView themeEditorView = this.a;
            if (i >= themeEditorView.e.size()) {
                ThemeEditorView.EditorAlert editorAlert = themeEditorView.n;
                int i2 = ThemeEditorView.EditorAlert.G1;
                editorAlert.G0(true);
                return;
            } else {
                apb apbVar = (apb) themeEditorView.e.get(i);
                int w0 = aob.w0(apbVar.i, apbVar.e, false);
                apbVar.h = w0;
                if (i == 0) {
                    themeEditorView.n.l1.c(w0);
                }
                i++;
            }
        }
    }

    @Override // qvc
    public final void b(File file, Bitmap bitmap, boolean z) {
        znb znbVar = this.a.o;
        aob.lm.delete(aob.Ee);
        aob.lm.delete(aob.Fe);
        aob.lm.delete(aob.Ge);
        aob.lm.delete(aob.He);
        aob.lm.delete(aob.Ie);
        aob.g0 = null;
        znbVar.v(null);
        if (bitmap == null) {
            aob.e0 = null;
            aob.d0 = null;
            aob.v1(znbVar, false, false, false);
            aob.s1(true);
            return;
        }
        aob.e0 = new BitmapDrawable(bitmap);
        aob.v1(znbVar, false, false, false);
        int[] q = hl.q(aob.e0);
        int i = q[0];
        aob.b0 = i;
        aob.W = i;
        int i2 = q[1];
        aob.c0 = i2;
        aob.a0 = i2;
        aob.h();
        aob.g(aob.d0);
        jn7.e().k(jn7.C4, new Object[0]);
    }
}
