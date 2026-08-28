package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class iy implements org.telegram.ui.Components.pk0 {
    public final Rect a = new Rect();
    public final /* synthetic */ my b;

    public iy(my myVar) {
        this.b = myVar;
    }

    @Override // org.telegram.ui.Components.pk0
    public final boolean c(float f10, float f11, int i9, View view) {
        my myVar = this.b;
        if (myVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            ImageView imageView = (ImageView) view.getTag(R.id.object_tag);
            Rect rect = this.a;
            imageView.getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(myVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new hy(this, i9, 0));
                myVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void j() {
    }

    @Override // org.telegram.ui.Components.pk0
    public final void u(float f10) {
    }
}
