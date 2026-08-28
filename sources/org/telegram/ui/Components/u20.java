package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u20 extends m2.a {
    public final /* synthetic */ v20 c;

    public u20(v20 v20Var) {
        this.c = v20Var;
    }

    @Override // m2.a
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override // m2.a
    public final int b() {
        return this.c.e.length;
    }

    @Override // m2.a
    public final Object e(m2.g gVar, int i9) {
        t20 t20Var = new t20(this, this.c.getContext(), i9, 0);
        t20Var.setOnClickListener(new gh.z0(this, i9, 9));
        t20Var.setFocusable(true);
        t20Var.setTag(Integer.valueOf(i9));
        t20Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        t20Var.setScaleType(ImageView.ScaleType.FIT_XY);
        t20Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i9 == 0) {
            t20Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i9 == 1) {
            t20Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            t20Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
        }
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i9 == 0 ? R.raw.record_audio : i9 == 1 ? R.raw.record_video_p : R.raw.record_video_l));
        drawable.setAspectFill(false);
        t20Var.setImageDrawable(drawable);
        if (t20Var.getParent() != null) {
            ((ViewGroup) t20Var.getParent()).removeView(t20Var);
        }
        gVar.addView(t20Var, 0);
        return t20Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // m2.a
    public final void h(int i9) {
    }
}
