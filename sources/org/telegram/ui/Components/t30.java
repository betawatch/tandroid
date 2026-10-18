package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class t30 extends z4.a {
    public final /* synthetic */ org.telegram.ui.r40 c;

    public t30(org.telegram.ui.r40 r40Var) {
        this.c = r40Var;
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override // z4.a
    public final int b() {
        return this.c.e.length;
    }

    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
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
        gVar.addView(s30Var, 0);
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
