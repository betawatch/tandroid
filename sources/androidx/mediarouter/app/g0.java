package androidx.mediarouter.app;

import a8.kc;
import a8.p1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import org.telegram.messenger.beta.R;
import s4.e1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class g0 extends e1 {
    public p4.v v;
    public final ImageButton w;
    public final MediaRouteVolumeSlider x;
    public final /* synthetic */ o0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(o0 o0Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int color;
        int color2;
        this.y = o0Var;
        this.w = imageButton;
        this.x = mediaRouteVolumeSlider;
        Context context = o0Var.y;
        Drawable b10 = kc.b(context, R.drawable.mr_cast_mute_button);
        if (p1.h(context)) {
            b10.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        imageButton.setImageDrawable(b10);
        if (p1.h(context)) {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_light);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_light);
        } else {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_dark);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(color, color2);
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
