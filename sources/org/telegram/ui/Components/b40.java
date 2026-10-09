package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class b40 extends z4.a {
    public final /* synthetic */ org.telegram.ui.f50 c;

    public b40(org.telegram.ui.f50 f50Var) {
        this.c = f50Var;
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
        a40 a40Var = new a40(this, this.c.getContext(), i10, 0);
        a40Var.setOnClickListener(new ci.m4(this, i10, 10));
        a40Var.setFocusable(true);
        a40Var.setTag(Integer.valueOf(i10));
        a40Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        a40Var.setScaleType(ImageView.ScaleType.FIT_XY);
        a40Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            a40Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            a40Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            a40Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
        }
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i10 == 0 ? R.raw.record_audio : i10 == 1 ? R.raw.record_video_p : R.raw.record_video_l));
        drawable.setAspectFill(false);
        a40Var.setImageDrawable(drawable);
        if (a40Var.getParent() != null) {
            ((ViewGroup) a40Var.getParent()).removeView(a40Var);
        }
        gVar.addView(a40Var, 0);
        return a40Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // z4.a
    public final void h(int i10) {
    }
}
