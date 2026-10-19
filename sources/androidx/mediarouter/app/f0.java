package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import org.telegram.messenger.beta.R;
import s4.b1;
import v7.q7;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class f0 extends b1 {
    public p4.v v;
    public final ImageButton w;
    public final MediaRouteVolumeSlider x;
    public final /* synthetic */ n0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(n0 n0Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int color;
        int color2;
        this.y = n0Var;
        this.w = imageButton;
        this.x = mediaRouteVolumeSlider;
        Context context = n0Var.y;
        Drawable b10 = q7.b(context, R.drawable.mr_cast_mute_button);
        if (v7.a0.h(context)) {
            b10.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        imageButton.setImageDrawable(b10);
        if (v7.a0.h(context)) {
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
        imageButton.setOnClickListener(new w(this, 1));
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
        n0 n0Var = this.y;
        if (z10) {
            n0Var.N.put(this.v.c, Integer.valueOf(this.x.getProgress()));
        } else {
            n0Var.N.remove(this.v.c);
        }
    }
}
