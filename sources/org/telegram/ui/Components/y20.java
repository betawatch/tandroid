package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y20 extends m2.a {
    public final /* synthetic */ z20 c;

    public y20(z20 z20Var) {
        this.c = z20Var;
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
    public final Object e(m2.g gVar, int i10) {
        x20 x20Var = new x20(this, this.c.getContext(), i10, 0);
        x20Var.setOnClickListener(new hh.z0(this, i10, 9));
        x20Var.setFocusable(true);
        x20Var.setTag(Integer.valueOf(i10));
        x20Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        x20Var.setScaleType(ImageView.ScaleType.FIT_XY);
        x20Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            x20Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            x20Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            x20Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
        }
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i10 == 0 ? R.raw.record_audio : i10 == 1 ? R.raw.record_video_p : R.raw.record_video_l));
        drawable.setAspectFill(false);
        x20Var.setImageDrawable(drawable);
        if (x20Var.getParent() != null) {
            ((ViewGroup) x20Var.getParent()).removeView(x20Var);
        }
        gVar.addView(x20Var, 0);
        return x20Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // m2.a
    public final void h(int i10) {
    }
}
