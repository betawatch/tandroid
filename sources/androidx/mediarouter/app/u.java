package androidx.mediarouter.app;

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
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u extends ArrayAdapter {
    public final float a;
    public final /* synthetic */ v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.b = vVar;
        this.a = f7.d0.c(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        boolean z10;
        v vVar = this.b;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
        } else {
            v.o(vVar.a0, (LinearLayout) view.findViewById(R.id.volume_item_container));
            View findViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i10 = vVar.Z;
            layoutParams.width = i10;
            layoutParams.height = i10;
            findViewById.setLayoutParams(layoutParams);
        }
        c2.a0 a0Var = (c2.a0) getItem(i9);
        if (a0Var != null) {
            boolean z11 = a0Var.g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z11);
            textView.setText(a0Var.d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            Context context = viewGroup.getContext();
            OverlayListView overlayListView = vVar.Q;
            int b10 = f7.d0.b(context, 0);
            if (Color.alpha(b10) != 255) {
                b10 = i0.a.h(b10, ((Integer) overlayListView.getTag()).intValue());
            }
            mediaRouteVolumeSlider.a(b10, b10);
            mediaRouteVolumeSlider.setTag(a0Var);
            vVar.d0.put(a0Var, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.b(!z11);
            mediaRouteVolumeSlider.setEnabled(z11);
            if (z11) {
                if (vVar.K) {
                    if (((!a0Var.e() || c2.c0.g()) ? a0Var.o : 0) == 1) {
                        z10 = true;
                        if (z10) {
                            mediaRouteVolumeSlider.setMax(100);
                            mediaRouteVolumeSlider.setProgress(100);
                            mediaRouteVolumeSlider.setEnabled(false);
                        } else {
                            mediaRouteVolumeSlider.setMax(a0Var.q);
                            mediaRouteVolumeSlider.setProgress(a0Var.p);
                            mediaRouteVolumeSlider.setOnSeekBarChangeListener(vVar.X);
                        }
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            ((ImageView) view.findViewById(R.id.mr_volume_item_icon)).setAlpha(z11 ? 255 : (int) (this.a * 255.0f));
            ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(vVar.V.contains(a0Var) ? 4 : 0);
            HashSet hashSet = vVar.T;
            if (hashSet != null && hashSet.contains(a0Var)) {
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
    public final boolean isEnabled(int i9) {
        return false;
    }
}
