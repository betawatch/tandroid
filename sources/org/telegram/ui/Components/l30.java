package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l30 extends m2.a {
    public final /* synthetic */ m30 c;

    public l30(m30 m30Var) {
        this.c = m30Var;
    }

    @Override // m2.a
    public final void a(m2.h hVar, Object obj) {
        hVar.removeView((View) obj);
    }

    @Override // m2.a
    public final int b() {
        return this.c.e.length;
    }

    @Override // m2.a
    public final Object e(m2.h hVar, int i10) {
        k30 k30Var = new k30(this, this.c.getContext(), i10, 0);
        k30Var.setOnClickListener(new lh.y0(this, i10, 7));
        k30Var.setFocusable(true);
        k30Var.setTag(Integer.valueOf(i10));
        k30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        k30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        k30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            k30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            k30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            k30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
        }
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i10 == 0 ? R.raw.record_audio : i10 == 1 ? R.raw.record_video_p : R.raw.record_video_l));
        drawable.setAspectFill(false);
        k30Var.setImageDrawable(drawable);
        if (k30Var.getParent() != null) {
            ((ViewGroup) k30Var.getParent()).removeView(k30Var);
        }
        hVar.addView(k30Var, 0);
        return k30Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // m2.a
    public final void h(int i10) {
    }
}
