package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class n30 extends m2.a {
    public final /* synthetic */ o30 c;

    public n30(o30 o30Var) {
        this.c = o30Var;
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
        m30 m30Var = new m30(this, this.c.getContext(), i10, 0);
        m30Var.setOnClickListener(new mh.x0(this, i10, 7));
        m30Var.setFocusable(true);
        m30Var.setTag(Integer.valueOf(i10));
        m30Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        m30Var.setScaleType(ImageView.ScaleType.FIT_XY);
        m30Var.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
        if (i10 == 0) {
            m30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
        } else if (i10 == 1) {
            m30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
        } else {
            m30Var.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
        }
        SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i10 == 0 ? R.raw.record_audio : i10 == 1 ? R.raw.record_video_p : R.raw.record_video_l));
        drawable.setAspectFill(false);
        m30Var.setImageDrawable(drawable);
        if (m30Var.getParent() != null) {
            ((ViewGroup) m30Var.getParent()).removeView(m30Var);
        }
        hVar.addView(m30Var, 0);
        return m30Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return view.equals(obj);
    }

    @Override // m2.a
    public final void h(int i10) {
    }
}
