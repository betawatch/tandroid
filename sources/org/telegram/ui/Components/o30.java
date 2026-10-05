package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class o30 extends z4.a {
    public final /* synthetic */ p30 c;

    public o30(p30 p30Var) {
        this.c = p30Var;
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
        n30 n30Var = new n30(this, this.c.getContext(), i10, 0);
        n30Var.setOnClickListener(new ci.n4(this, i10, 10));
        n30Var.setFocusable(true);
        n30Var.setTag(Integer.valueOf(i10));
        n30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        n30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        n30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            n30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            n30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            n30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
        }
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i10 == 0 ? R.raw.record_audio : i10 == 1 ? R.raw.record_video_p : R.raw.record_video_l));
        drawable.setAspectFill(false);
        n30Var.setImageDrawable(drawable);
        if (n30Var.getParent() != null) {
            ((ViewGroup) n30Var.getParent()).removeView(n30Var);
        }
        gVar.addView(n30Var, 0);
        return n30Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // z4.a
    public final void h(int i10) {
    }
}
