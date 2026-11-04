package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import b8.oc;
import org.telegram.messenger.beta.R;
import u4.d1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class f0 extends d1 {
    public r4.w v;
    public final ImageButton w;
    public final MediaRouteVolumeSlider x;
    public final /* synthetic */ o0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(o0 o0Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int color;
        int color2;
        this.y = o0Var;
        this.w = imageButton;
        this.x = mediaRouteVolumeSlider;
        Context context = o0Var.E;
        Drawable b10 = oc.b(context, R.drawable.mr_cast_mute_button);
        if (b8.d1.h(context)) {
            b10.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        imageButton.setImageDrawable(b10);
        if (b8.d1.h(context)) {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_light);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_light);
        } else {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_dark);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(color, color2);
    }

    public final void t(r4.w wVar) {
        this.v = wVar;
        int i3 = wVar.p;
        boolean z10 = i3 == 0;
        ImageButton imageButton = this.w;
        imageButton.setActivated(z10);
        imageButton.setOnClickListener(new w(this, 1));
        r4.w wVar2 = this.v;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.x;
        mediaRouteVolumeSlider.setTag(wVar2);
        mediaRouteVolumeSlider.setMax(wVar.q);
        mediaRouteVolumeSlider.setProgress(i3);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.y.L);
    }

    public final void u(boolean z10) {
        ImageButton imageButton = this.w;
        if (imageButton.isActivated() == z10) {
            return;
        }
        imageButton.setActivated(z10);
        o0 o0Var = this.y;
        if (z10) {
            o0Var.O.put(this.v.c, Integer.valueOf(this.x.getProgress()));
        } else {
            o0Var.O.remove(this.v.c);
        }
    }
}
