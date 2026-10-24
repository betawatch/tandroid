package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class t30 extends z4.a {
    public final /* synthetic */ org.telegram.ui.s40 c;

    public t30(org.telegram.ui.s40 s40Var) {
        this.c = s40Var;
    }

    @Override // z4.a
    public final void a(z4.h hVar, Object obj) {
        hVar.removeView((View) obj);
    }

    @Override // z4.a
    public final int b() {
        return this.c.e.length;
    }

    @Override // z4.a
    public final Object e(z4.h hVar, int i10) {
        s30 s30Var = new s30(this, this.c.getContext(), i10, 0);
        s30Var.setOnClickListener(new ai.n1(this, i10, 12));
        s30Var.setFocusable(true);
        s30Var.setTag(Integer.valueOf(i10));
        s30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        s30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        s30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            s30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            s30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            s30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
        }
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i10 == 0 ? R.raw.record_audio : i10 == 1 ? R.raw.record_video_p : R.raw.record_video_l));
        drawable.setAspectFill(false);
        s30Var.setImageDrawable(drawable);
        if (s30Var.getParent() != null) {
            ((ViewGroup) s30Var.getParent()).removeView(s30Var);
        }
        hVar.addView(s30Var, 0);
        return s30Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // z4.a
    public final void h(int i10) {
    }
}
