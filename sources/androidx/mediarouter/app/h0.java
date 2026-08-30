package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import f2.l1;
import j7.h8;
import j7.r7;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class h0 extends l1 {
    public c2.a0 v;
    public final ImageButton w;
    public final MediaRouteVolumeSlider x;
    public final /* synthetic */ p0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(p0 p0Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int c3;
        int c10;
        this.y = p0Var;
        this.w = imageButton;
        this.x = mediaRouteVolumeSlider;
        Context context = p0Var.y;
        Drawable d = h8.d(r7.b(context, R.drawable.mr_cast_mute_button));
        if (j7.z.h(context)) {
            d.setTint(f0.f.c(context, R.color.mr_dynamic_dialog_icon_light));
        }
        imageButton.setImageDrawable(d);
        if (j7.z.h(context)) {
            c3 = f0.f.c(context, R.color.mr_cast_progressbar_progress_and_thumb_light);
            c10 = f0.f.c(context, R.color.mr_cast_progressbar_background_light);
        } else {
            c3 = f0.f.c(context, R.color.mr_cast_progressbar_progress_and_thumb_dark);
            c10 = f0.f.c(context, R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(c3, c10);
    }

    public final void t(c2.a0 a0Var) {
        this.v = a0Var;
        int i10 = a0Var.p;
        boolean z4 = i10 == 0;
        ImageButton imageButton = this.w;
        imageButton.setActivated(z4);
        imageButton.setOnClickListener(new y(this, 1));
        c2.a0 a0Var2 = this.v;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.x;
        mediaRouteVolumeSlider.setTag(a0Var2);
        mediaRouteVolumeSlider.setMax(a0Var.q);
        mediaRouteVolumeSlider.setProgress(i10);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.y.H);
    }

    public final void u(boolean z4) {
        ImageButton imageButton = this.w;
        if (imageButton.isActivated() == z4) {
            return;
        }
        imageButton.setActivated(z4);
        p0 p0Var = this.y;
        if (z4) {
            p0Var.K.put(this.v.c, Integer.valueOf(this.x.getProgress()));
        } else {
            p0Var.K.remove(this.v.c);
        }
    }
}
