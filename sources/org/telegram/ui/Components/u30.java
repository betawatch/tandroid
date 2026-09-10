package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class u30 extends z4.a {
    public final /* synthetic */ v30 c;

    public u30(v30 v30Var) {
        this.c = v30Var;
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
        t30 t30Var = new t30(this, this.c.getContext(), i10, 0);
        t30Var.setOnClickListener(new bi.j5(this, i10, 10));
        t30Var.setFocusable(true);
        t30Var.setTag(Integer.valueOf(i10));
        t30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        t30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        t30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            t30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            t30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            t30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
        }
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i10 == 0 ? R.raw.record_audio : i10 == 1 ? R.raw.record_video_p : R.raw.record_video_l));
        drawable.setAspectFill(false);
        t30Var.setImageDrawable(drawable);
        if (t30Var.getParent() != null) {
            ((ViewGroup) t30Var.getParent()).removeView(t30Var);
        }
        gVar.addView(t30Var, 0);
        return t30Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // z4.a
    public final void h(int i10) {
    }
}
