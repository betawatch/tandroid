package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class bz implements org.telegram.ui.Components.dl0 {
    public final Rect a = new Rect();
    public final /* synthetic */ fz b;

    public bz(fz fzVar) {
        this.b = fzVar;
    }

    @Override // org.telegram.ui.Components.dl0
    public final boolean c(float f7, float f10, int i10, View view) {
        fz fzVar = this.b;
        if (fzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.f4)) {
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

    @Override // org.telegram.ui.Components.dl0
    public final void g() {
    }

    @Override // org.telegram.ui.Components.dl0
    public final void q(float f7) {
    }
}
