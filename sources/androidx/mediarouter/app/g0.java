package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import org.telegram.messenger.beta.R;
import s4.c1;
import v7.o8;
import v7.u7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class g0 extends c1 {
    public p4.v v;
    public final ImageButton w;
    public final MediaRouteVolumeSlider x;
    public final /* synthetic */ o0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(o0 o0Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int c10;
        int c11;
        this.y = o0Var;
        this.w = imageButton;
        this.x = mediaRouteVolumeSlider;
        Context context = o0Var.y;
        Drawable d = o8.d(u7.b(context, R.drawable.mr_cast_mute_button));
        if (v7.d0.h(context)) {
            d.setTint(f0.e.c(context, R.color.mr_dynamic_dialog_icon_light));
        }
        imageButton.setImageDrawable(d);
        if (v7.d0.h(context)) {
            c10 = f0.e.c(context, R.color.mr_cast_progressbar_progress_and_thumb_light);
            c11 = f0.e.c(context, R.color.mr_cast_progressbar_background_light);
        } else {
            c10 = f0.e.c(context, R.color.mr_cast_progressbar_progress_and_thumb_dark);
            c11 = f0.e.c(context, R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(c10, c11);
    }

    public final void t(p4.v vVar) {
        this.v = vVar;
        int i10 = vVar.p;
        boolean z10 = i10 == 0;
        ImageButton imageButton = this.w;
        imageButton.setActivated(z10);
        imageButton.setOnClickListener(new x(this, 1));
        p4.v vVar2 = this.v;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.x;
        mediaRouteVolumeSlider.setTag(vVar2);
        mediaRouteVolumeSlider.setMax(vVar.q);
        mediaRouteVolumeSlider.setProgress(i10);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.y.K);
    }

    public final void u(boolean z10) {
        ImageButton imageButton = this.w;
        if (imageButton.isActivated() == z10) {
            return;
        }
        imageButton.setActivated(z10);
        o0 o0Var = this.y;
        if (z10) {
            o0Var.N.put(this.v.c, Integer.valueOf(this.x.getProgress()));
        } else {
            o0Var.N.remove(this.v.c);
        }
    }
}
