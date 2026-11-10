package androidx.mediarouter.app;

import a8.b7;
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
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class s extends ArrayAdapter {
    public final float a;
    public final /* synthetic */ t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.b = tVar;
        this.a = b7.c(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        boolean z9;
        t tVar = this.b;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
        } else {
            t.o(tVar.e0, (LinearLayout) view.findViewById(R.id.volume_item_container));
            View findViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i10 = tVar.d0;
            layoutParams.width = i10;
            layoutParams.height = i10;
            findViewById.setLayoutParams(layoutParams);
        }
        s4.v vVar = (s4.v) getItem(i7);
        if (vVar != null) {
            boolean z10 = vVar.g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z10);
            textView.setText(vVar.d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            Context context = viewGroup.getContext();
            OverlayListView overlayListView = tVar.U;
            int b10 = b7.b(context, 0);
            int alpha = Color.alpha(b10);
            int i11 = qs.e4;
            if (alpha != 255) {
                b10 = i0.a.k(b10, ((Integer) overlayListView.getTag()).intValue());
            }
            mediaRouteVolumeSlider.a(b10, b10);
            mediaRouteVolumeSlider.setTag(vVar);
            tVar.h0.put(vVar, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.b(!z10);
            mediaRouteVolumeSlider.setEnabled(z10);
            if (z10) {
                if (tVar.O) {
                    if (((!vVar.e() || s4.x.g()) ? vVar.o : 0) == 1) {
                        z9 = true;
                        if (z9) {
                            mediaRouteVolumeSlider.setMax(100);
                            mediaRouteVolumeSlider.setProgress(100);
                            mediaRouteVolumeSlider.setEnabled(false);
                        } else {
                            mediaRouteVolumeSlider.setMax(vVar.q);
                            mediaRouteVolumeSlider.setProgress(vVar.p);
                            mediaRouteVolumeSlider.setOnSeekBarChangeListener(tVar.b0);
                        }
                    }
                }
                z9 = false;
                if (z9) {
                }
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_volume_item_icon);
            if (!z10) {
                i11 = (int) (this.a * 255.0f);
            }
            imageView.setAlpha(i11);
            ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(tVar.Z.contains(vVar) ? 4 : 0);
            HashSet hashSet = tVar.X;
            if (hashSet != null && hashSet.contains(vVar)) {
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
    public final boolean isEnabled(int i7) {
        return false;
    }
}
