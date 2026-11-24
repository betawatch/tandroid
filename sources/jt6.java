// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import java.util.HashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class jt6 extends s49 {
    public eu6 v;
    public final ImageButton w;
    public final MediaRouteVolumeSlider x;
    public final /* synthetic */ rt6 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt6(rt6 rt6Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int color;
        int color2;
        this.y = rt6Var;
        this.w = imageButton;
        this.x = mediaRouteVolumeSlider;
        Context context = rt6Var.E;
        Drawable a = hmd.a(context, R.drawable.mr_cast_mute_button);
        if (voe.h(context)) {
            a.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        imageButton.setImageDrawable(a);
        if (voe.h(context)) {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_light);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_light);
        } else {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_dark);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(color, color2);
    }

    public final void t(eu6 eu6Var) {
        this.v = eu6Var;
        int i = eu6Var.p;
        boolean z = i == 0;
        ImageButton imageButton = this.w;
        imageButton.setActivated(z);
        imageButton.setOnClickListener(new g6(this, (byte) 10));
        eu6 eu6Var2 = this.v;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.x;
        mediaRouteVolumeSlider.setTag(eu6Var2);
        mediaRouteVolumeSlider.setMax(eu6Var.q);
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
