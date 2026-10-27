package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jy implements org.telegram.ui.Components.dm0 {
    public final Rect a = new Rect();
    public final /* synthetic */ ny b;

    public jy(ny nyVar) {
        this.b = nyVar;
    }

    @Override // org.telegram.ui.Components.dm0
    public final boolean e(float f7, float f10, int i10, View view) {
        ny nyVar = this.b;
        if (nyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.k4)) {
            ImageView imageView = (ImageView) view.getTag(R.id.object_tag);
            Rect rect = this.a;
            imageView.getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new iy(this, i10, 0));
                nyVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dm0
    public final void g() {
    }

    @Override // org.telegram.ui.Components.dm0
    public final void o(float f7) {
    }
}
