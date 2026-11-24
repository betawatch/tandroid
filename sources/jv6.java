// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import java.util.HashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class jv6 extends u69 {
    public ew6 v;
    public final ImageButton w;
    public final MediaRouteVolumeSlider x;
    public final /* synthetic */ rv6 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv6(rv6 rv6Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int color;
        int color2;
        this.y = rv6Var;
        this.w = imageButton;
        this.x = mediaRouteVolumeSlider;
        Context context = rv6Var.E;
        Drawable a = kod.a(context, R.drawable.mr_cast_mute_button);
        if (yqe.h(context)) {
            a.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        imageButton.setImageDrawable(a);
        if (yqe.h(context)) {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_light);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_light);
        } else {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_dark);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(color, color2);
    }

    public final void t(ew6 ew6Var) {
        this.v = ew6Var;
        int i = ew6Var.p;
        boolean z = i == 0;
        ImageButton imageButton = this.w;
        imageButton.setActivated(z);
        imageButton.setOnClickListener(new g6(this, (byte) 10));
        ew6 ew6Var2 = this.v;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.x;
        mediaRouteVolumeSlider.setTag(ew6Var2);
        mediaRouteVolumeSlider.setMax(ew6Var.q);
        mediaRouteVolumeSlider.setProgress(i);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.y.L);
    }

    public final void u(boolean z) {
        ImageButton imageButton = this.w;
        if (imageButton.isActivated() == z) {
            return;
        }
        imageButton.setActivated(z);
        HashMap hashMap = this.y.O;
        if (z) {
            hashMap.put(this.v.c, Integer.valueOf(this.x.getProgress()));
        } else {
            hashMap.remove(this.v.c);
        }
    }
}
