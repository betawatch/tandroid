package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dz implements org.telegram.ui.Components.dm0 {
    public final Rect a = new Rect();
    public final /* synthetic */ hz b;

    public dz(hz hzVar) {
        this.b = hzVar;
    }

    @Override // org.telegram.ui.Components.dm0
    public final boolean d(float f7, float f10, int i10, View view) {
        hz hzVar = this.b;
        if (hzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            ImageView imageView = (ImageView) view.getTag(R.id.object_tag);
            Rect rect = this.a;
            imageView.getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hzVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new cz(this, i10, 0));
                hzVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dm0
    public final void h() {
    }

    @Override // org.telegram.ui.Components.dm0
    public final void q(float f7) {
    }
}
