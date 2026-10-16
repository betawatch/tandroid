package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class x30 extends z4.a {
    public final /* synthetic */ org.telegram.ui.m50 c;

    public x30(org.telegram.ui.m50 m50Var) {
        this.c = m50Var;
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
        w30 w30Var = new w30(this, this.c.getContext(), i10, 0);
        w30Var.setOnClickListener(new di.m4(this, i10, 10));
        w30Var.setFocusable(true);
        w30Var.setTag(Integer.valueOf(i10));
        w30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        w30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        w30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            w30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            w30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            w30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
        }
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i10 == 0 ? R.raw.record_audio : i10 == 1 ? R.raw.record_video_p : R.raw.record_video_l));
        drawable.setAspectFill(false);
        w30Var.setImageDrawable(drawable);
        if (w30Var.getParent() != null) {
            ((ViewGroup) w30Var.getParent()).removeView(w30Var);
        }
        gVar.addView(w30Var, 0);
        return w30Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // z4.a
    public final void h(int i10) {
    }
}
