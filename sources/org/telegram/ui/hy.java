package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hy implements org.telegram.ui.Components.cm0 {
    public final Rect a = new Rect();
    public final /* synthetic */ ly b;

    public hy(ly lyVar) {
        this.b = lyVar;
    }

    @Override // org.telegram.ui.Components.cm0
    public final boolean e(float f7, float f10, int i10, View view) {
        ly lyVar = this.b;
        if (lyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.k4)) {
            ImageView imageView = (ImageView) view.getTag(R.id.object_tag);
            Rect rect = this.a;
            imageView.getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new gy(this, i10, 0));
                lyVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.cm0
    public final void g() {
    }

    @Override // org.telegram.ui.Components.cm0
    public final void o(float f7) {
    }
}
