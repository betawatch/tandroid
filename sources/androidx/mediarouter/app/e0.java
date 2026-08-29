package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import f2.n1;
import h7.e5;
import h7.l8;
import h7.s7;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class e0 extends n1 {
    public c2.b0 v;
    public final ImageButton w;
    public final MediaRouteVolumeSlider x;
    public final /* synthetic */ m0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(m0 m0Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int c3;
        int c6;
        this.y = m0Var;
        this.w = imageButton;
        this.x = mediaRouteVolumeSlider;
        Context context = m0Var.y;
        Drawable d = l8.d(s7.b(context, R.drawable.mr_cast_mute_button));
        if (e5.h(context)) {
            d.setTint(f0.e.c(context, R.color.mr_dynamic_dialog_icon_light));
        }
        imageButton.setImageDrawable(d);
        if (e5.h(context)) {
            c3 = f0.e.c(context, R.color.mr_cast_progressbar_progress_and_thumb_light);
            c6 = f0.e.c(context, R.color.mr_cast_progressbar_background_light);
        } else {
            c3 = f0.e.c(context, R.color.mr_cast_progressbar_progress_and_thumb_dark);
            c6 = f0.e.c(context, R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(c3, c6);
    }

    public final void t(c2.b0 b0Var) {
        this.v = b0Var;
        int i10 = b0Var.p;
        boolean z10 = i10 == 0;
        ImageButton imageButton = this.w;
        imageButton.setActivated(z10);
        imageButton.setOnClickListener(new v(this, 1));
        c2.b0 b0Var2 = this.v;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.x;
        mediaRouteVolumeSlider.setTag(b0Var2);
        mediaRouteVolumeSlider.setMax(b0Var.q);
        mediaRouteVolumeSlider.setProgress(i10);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.y.G);
    }

    public final void u(boolean z10) {
        ImageButton imageButton = this.w;
        if (imageButton.isActivated() == z10) {
            return;
        }
        imageButton.setActivated(z10);
        m0 m0Var = this.y;
        if (z10) {
            m0Var.J.put(this.v.c, Integer.valueOf(this.x.getProgress()));
        } else {
            m0Var.J.remove(this.v.c);
        }
    }
}
