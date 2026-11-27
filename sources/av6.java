// default package

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class av6 extends ArrayAdapter {
    public final float a;
    public final /* synthetic */ bv6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av6(bv6 bv6Var, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.b = bv6Var;
        this.a = nte.c(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        bv6 bv6Var = this.b;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
        } else {
            bv6.o(bv6Var.f0, (LinearLayout) view.findViewById(R.id.volume_item_container));
            View findViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i2 = bv6Var.e0;
            layoutParams.width = i2;
            layoutParams.height = i2;
            findViewById.setLayoutParams(layoutParams);
        }
        jw6 jw6Var = (jw6) getItem(i);
        if (jw6Var != null) {
            boolean z = jw6Var.g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z);
            textView.setText(jw6Var.d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            Context context = viewGroup.getContext();
            OverlayListView overlayListView = bv6Var.V;
            int b = nte.b(context);
            int alpha = Color.alpha(b);
            int i3 = jn7.d4;
            if (alpha != 255) {
                b = vm2.k(b, ((Integer) overlayListView.getTag()).intValue());
            }
            mediaRouteVolumeSlider.a(b, b);
            mediaRouteVolumeSlider.setTag(jw6Var);
            bv6Var.i0.put(jw6Var, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.b(!z);
            mediaRouteVolumeSlider.setEnabled(z);
            if (z) {
                if (bv6Var.P) {
                    if (((!jw6Var.e() || lw6.g()) ? jw6Var.o : 0) == 1) {
                        mediaRouteVolumeSlider.setMax(jw6Var.q);
                        mediaRouteVolumeSlider.setProgress(jw6Var.p);
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(bv6Var.c0);
                    }
                }
                mediaRouteVolumeSlider.setMax(100);
                mediaRouteVolumeSlider.setProgress(100);
                mediaRouteVolumeSlider.setEnabled(false);
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_volume_item_icon);
            if (!z) {
                i3 = (int) (this.a * 255.0f);
            }
            imageView.setAlpha(i3);
            ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(bv6Var.a0.contains(jw6Var) ? 4 : 0);
            HashSet hashSet = bv6Var.Y;
            if (hashSet != null && hashSet.contains(jw6Var)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0L);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                view.clearAnimation();
                view.startAnimation(alphaAnimation);
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return false;
    }
}
