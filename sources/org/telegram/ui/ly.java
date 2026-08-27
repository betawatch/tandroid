package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ly implements org.telegram.ui.Components.sk0 {
    public final Rect a = new Rect();
    public final /* synthetic */ py b;

    public ly(py pyVar) {
        this.b = pyVar;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean c(float f10, float f11, int i10, View view) {
        py pyVar = this.b;
        if (pyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.d4)) {
            ImageView imageView = (ImageView) view.getTag(R.id.object_tag);
            Rect rect = this.a;
            imageView.getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new ky(this, i10, 0));
                pyVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sk0
    public final void i() {
    }

    @Override // org.telegram.ui.Components.sk0
    public final void s(float f10) {
    }
}
