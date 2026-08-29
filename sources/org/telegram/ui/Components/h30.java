package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h30 extends m2.a {
    public final /* synthetic */ i30 c;

    public h30(i30 i30Var) {
        this.c = i30Var;
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
        g30 g30Var = new g30(this, this.c.getContext(), i10, 0);
        g30Var.setOnClickListener(new jh.y0(this, i10, 9));
        g30Var.setFocusable(true);
        g30Var.setTag(Integer.valueOf(i10));
        g30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        g30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            g30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            g30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            g30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
        }
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i10 == 0 ? R.raw.record_audio : i10 == 1 ? R.raw.record_video_p : R.raw.record_video_l));
        drawable.setAspectFill(false);
        g30Var.setImageDrawable(drawable);
        if (g30Var.getParent() != null) {
            ((ViewGroup) g30Var.getParent()).removeView(g30Var);
        }
        gVar.addView(g30Var, 0);
        return g30Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // m2.a
    public final void h(int i10) {
    }
}
