package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v30 extends a5.a {
    public final /* synthetic */ org.telegram.ui.w40 c;

    public v30(org.telegram.ui.w40 w40Var) {
        this.c = w40Var;
    }

    @Override // a5.a
    public final void a(a5.m mVar, Object obj) {
        mVar.removeView((View) obj);
    }

    @Override // a5.a
    public final int b() {
        return this.c.e.length;
    }

    @Override // a5.a
    public final Object e(a5.m mVar, int i10) {
        u30 u30Var = new u30(this, this.c.getContext(), i10, 0);
        u30Var.setOnClickListener(new ai.w(this, i10, 14));
        u30Var.setFocusable(true);
        u30Var.setTag(Integer.valueOf(i10));
        u30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        u30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        u30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            u30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            u30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            u30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
        }
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i10 == 0 ? R.raw.record_audio : i10 == 1 ? R.raw.record_video_p : R.raw.record_video_l));
        drawable.setAspectFill(false);
        u30Var.setImageDrawable(drawable);
        if (u30Var.getParent() != null) {
            ((ViewGroup) u30Var.getParent()).removeView(u30Var);
        }
        mVar.addView(u30Var, 0);
        return u30Var;
    }

    @Override // a5.a
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // a5.a
    public final void h(int i10) {
    }
}
