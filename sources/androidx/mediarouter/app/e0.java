package androidx.mediarouter.app;

import a8.c7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import org.telegram.messenger.beta.R;
import v4.e1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class e0 extends e1 {
    public s4.v v;
    public final ImageButton w;
    public final MediaRouteVolumeSlider x;
    public final /* synthetic */ n0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(n0 n0Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int color;
        int color2;
        this.y = n0Var;
        this.w = imageButton;
        this.x = mediaRouteVolumeSlider;
        Context context = n0Var.E;
        Drawable b10 = b5.a.b(context, R.drawable.mr_cast_mute_button);
        if (c7.h(context)) {
            b10.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        imageButton.setImageDrawable(b10);
        if (c7.h(context)) {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_light);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_light);
        } else {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_dark);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(color, color2);
    }

    public final void t(s4.v vVar) {
        this.v = vVar;
        int i7 = vVar.p;
        boolean z10 = i7 == 0;
        ImageButton imageButton = this.w;
        imageButton.setActivated(z10);
        imageButton.setOnClickListener(new w(this, 1));
        s4.v vVar2 = this.v;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.x;
        mediaRouteVolumeSlider.setTag(vVar2);
        mediaRouteVolumeSlider.setMax(vVar.q);
        mediaRouteVolumeSlider.setProgress(i7);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.y.L);
    }

    public final void u(boolean z10) {
        ImageButton imageButton = this.w;
        if (imageButton.isActivated() == z10) {
            return;
        }
        imageButton.setActivated(z10);
        n0 n0Var = this.y;
        if (z10) {
            n0Var.O.put(this.v.c, Integer.valueOf(this.x.getProgress()));
        } else {
            n0Var.O.remove(this.v.c);
        }
    }
}
