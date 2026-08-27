package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import f2.o1;
import g7.k8;
import g7.o7;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class g0 extends o1 {
    public c2.z v;
    public final ImageButton w;
    public final MediaRouteVolumeSlider x;
    public final /* synthetic */ p0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(p0 p0Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int c10;
        int c11;
        this.y = p0Var;
        this.w = imageButton;
        this.x = mediaRouteVolumeSlider;
        Context context = p0Var.y;
        Drawable d = k8.d(o7.b(context, R.drawable.mr_cast_mute_button));
        if (g7.b0.h(context)) {
            d.setTint(f0.e.c(context, R.color.mr_dynamic_dialog_icon_light));
        }
        imageButton.setImageDrawable(d);
        if (g7.b0.h(context)) {
            c10 = f0.e.c(context, R.color.mr_cast_progressbar_progress_and_thumb_light);
            c11 = f0.e.c(context, R.color.mr_cast_progressbar_background_light);
        } else {
            c10 = f0.e.c(context, R.color.mr_cast_progressbar_progress_and_thumb_dark);
            c11 = f0.e.c(context, R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(c10, c11);
    }

    public final void t(c2.z zVar) {
        this.v = zVar;
        int i10 = zVar.p;
        boolean z10 = i10 == 0;
        ImageButton imageButton = this.w;
        imageButton.setActivated(z10);
        imageButton.setOnClickListener(new f0(this, 0));
        c2.z zVar2 = this.v;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.x;
        mediaRouteVolumeSlider.setTag(zVar2);
        mediaRouteVolumeSlider.setMax(zVar.q);
        mediaRouteVolumeSlider.setProgress(i10);
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
