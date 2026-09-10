package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class bz implements org.telegram.ui.Components.ml0 {
    public final Rect a = new Rect();
    public final /* synthetic */ fz b;

    public bz(fz fzVar) {
        this.b = fzVar;
    }

    @Override // org.telegram.ui.Components.ml0
    public final boolean c(float f7, float f10, int i10, View view) {
        fz fzVar = this.b;
        if (fzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            ImageView imageView = (ImageView) view.getTag(R.id.object_tag);
            Rect rect = this.a;
            imageView.getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fzVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new az(this, i10, 0));
                fzVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void h() {
    }

    @Override // org.telegram.ui.Components.ml0
    public final void p(float f7) {
    }
}
