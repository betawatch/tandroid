package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ky implements org.telegram.ui.Components.cl0 {
    public final Rect a = new Rect();
    public final /* synthetic */ oy b;

    public ky(oy oyVar) {
        this.b = oyVar;
    }

    @Override // org.telegram.ui.Components.cl0
    public final boolean b(float f9, float f10, int i10, View view) {
        oy oyVar = this.b;
        if (oyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.e4)) {
            ImageView imageView = (ImageView) view.getTag(R.id.object_tag);
            Rect rect = this.a;
            imageView.getHitRect(rect);
            if (!rect.contains((int) f9, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new jy(this, i10, 0));
                oyVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.cl0
    public final void h() {
    }

    @Override // org.telegram.ui.Components.cl0
    public final void r(float f9) {
    }
}
