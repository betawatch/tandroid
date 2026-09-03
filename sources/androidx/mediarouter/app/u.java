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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class u extends ArrayAdapter {
    public final float a;
    public final /* synthetic */ v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.b = vVar;
        this.a = j7.z.c(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z4;
        v vVar = this.b;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
        } else {
            v.o(vVar.b0, (LinearLayout) view.findViewById(R.id.volume_item_container));
            View findViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i11 = vVar.a0;
            layoutParams.width = i11;
            layoutParams.height = i11;
            findViewById.setLayoutParams(layoutParams);
        }
        c2.b0 b0Var = (c2.b0) getItem(i10);
        if (b0Var != null) {
            boolean z10 = b0Var.g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z10);
            textView.setText(b0Var.d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            Context context = viewGroup.getContext();
            OverlayListView overlayListView = vVar.R;
            int b10 = j7.z.b(context, 0);
            if (Color.alpha(b10) != 255) {
                b10 = i0.a.h(b10, ((Integer) overlayListView.getTag()).intValue());
            }
            mediaRouteVolumeSlider.a(b10, b10);
            mediaRouteVolumeSlider.setTag(b0Var);
            vVar.e0.put(b0Var, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.b(!z10);
            mediaRouteVolumeSlider.setEnabled(z10);
            if (z10) {
                if (vVar.L) {
                    if (((!b0Var.e() || c2.d0.g()) ? b0Var.o : 0) == 1) {
                        z4 = true;
                        if (z4) {
                            mediaRouteVolumeSlider.setMax(100);
                            mediaRouteVolumeSlider.setProgress(100);
                            mediaRouteVolumeSlider.setEnabled(false);
                        } else {
                            mediaRouteVolumeSlider.setMax(b0Var.q);
                            mediaRouteVolumeSlider.setProgress(b0Var.p);
                            mediaRouteVolumeSlider.setOnSeekBarChangeListener(vVar.Y);
                        }
                    }
                }
                z4 = false;
                if (z4) {
                }
            }
            ((ImageView) view.findViewById(R.id.mr_volume_item_icon)).setAlpha(z10 ? 255 : (int) (this.a * 255.0f));
            ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(vVar.W.contains(b0Var) ? 4 : 0);
            HashSet hashSet = vVar.U;
            if (hashSet != null && hashSet.contains(b0Var)) {
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
    public final boolean isEnabled(int i10) {
        return false;
    }
}
