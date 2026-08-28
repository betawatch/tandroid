package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import f2.q1;
import f7.q8;
import f7.t7;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class h0 extends q1 {
    public c2.a0 v;
    public final ImageButton w;
    public final MediaRouteVolumeSlider x;
    public final /* synthetic */ p0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(p0 p0Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int c10;
        int c11;
        this.y = p0Var;
        this.w = imageButton;
        this.x = mediaRouteVolumeSlider;
        Context context = p0Var.y;
        Drawable d = q8.d(t7.b(context, R.drawable.mr_cast_mute_button));
        if (f7.d0.h(context)) {
            d.setTint(f0.e.c(context, R.color.mr_dynamic_dialog_icon_light));
        }
        imageButton.setImageDrawable(d);
        if (f7.d0.h(context)) {
            c10 = f0.e.c(context, R.color.mr_cast_progressbar_progress_and_thumb_light);
            c11 = f0.e.c(context, R.color.mr_cast_progressbar_background_light);
        } else {
            c10 = f0.e.c(context, R.color.mr_cast_progressbar_progress_and_thumb_dark);
            c11 = f0.e.c(context, R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(c10, c11);
    }

    public final void t(c2.a0 a0Var) {
        this.v = a0Var;
        int i9 = a0Var.p;
        boolean z10 = i9 == 0;
        ImageButton imageButton = this.w;
        imageButton.setActivated(z10);
        imageButton.setOnClickListener(new y(this, 1));
        c2.a0 a0Var2 = this.v;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.x;
        mediaRouteVolumeSlider.setTag(a0Var2);
        mediaRouteVolumeSlider.setMax(a0Var.q);
        mediaRouteVolumeSlider.setProgress(i9);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.y.G);
    }

    public final void u(boolean z10) {
        ImageButton imageButton = this.w;
        if (imageButton.isActivated() == z10) {
            return;
        }
        imageButton.setActivated(z10);
        p0 p0Var = this.y;
        if (z10) {
            p0Var.J.put(this.v.c, Integer.valueOf(this.x.getProgress()));
        } else {
            p0Var.J.remove(this.v.c);
        }
    }
}
