package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m30 extends m2.a {
    public final /* synthetic */ n30 c;

    public m30(n30 n30Var) {
        this.c = n30Var;
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
        l30 l30Var = new l30(this, this.c.getContext(), i10, 0);
        l30Var.setOnClickListener(new lh.y0(this, i10, 7));
        l30Var.setFocusable(true);
        l30Var.setTag(Integer.valueOf(i10));
        l30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        l30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        l30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            l30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            l30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            l30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
        }
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i10 == 0 ? R.raw.record_audio : i10 == 1 ? R.raw.record_video_p : R.raw.record_video_l));
        drawable.setAspectFill(false);
        l30Var.setImageDrawable(drawable);
        if (l30Var.getParent() != null) {
            ((ViewGroup) l30Var.getParent()).removeView(l30Var);
        }
        hVar.addView(l30Var, 0);
        return l30Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // m2.a
    public final void h(int i10) {
    }
}
