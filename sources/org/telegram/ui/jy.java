package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class jy implements org.telegram.ui.Components.zl0 {
    public final Rect a = new Rect();
    public final /* synthetic */ ny b;

    public jy(ny nyVar) {
        this.b = nyVar;
    }

    @Override // org.telegram.ui.Components.zl0
    public final boolean d(float f7, float f10, int i10, View view) {
        ny nyVar = this.b;
        if (nyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.f4)) {
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

    @Override // org.telegram.ui.Components.zl0
    public final void h() {
    }

    @Override // org.telegram.ui.Components.zl0
    public final void o(float f7) {
    }
}
