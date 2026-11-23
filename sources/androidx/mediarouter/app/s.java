package androidx.mediarouter.app;

import a8.c7;
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
import org.telegram.messenger.ls;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class s extends ArrayAdapter {
    public final float a;
    public final /* synthetic */ t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.b = tVar;
        this.a = c7.c(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        boolean z10;
        t tVar = this.b;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
        } else {
            t.o(tVar.f0, (LinearLayout) view.findViewById(R.id.volume_item_container));
            View findViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i10 = tVar.e0;
            layoutParams.width = i10;
            layoutParams.height = i10;
            findViewById.setLayoutParams(layoutParams);
        }
        s4.v vVar = (s4.v) getItem(i7);
        if (vVar != null) {
            boolean z11 = vVar.g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z11);
            textView.setText(vVar.d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            Context context = viewGroup.getContext();
            OverlayListView overlayListView = tVar.V;
            int b10 = c7.b(context, 0);
            int alpha = Color.alpha(b10);
            int i11 = ls.e4;
            if (alpha != 255) {
                b10 = i0.a.k(b10, ((Integer) overlayListView.getTag()).intValue());
            }
            mediaRouteVolumeSlider.a(b10, b10);
            mediaRouteVolumeSlider.setTag(vVar);
            tVar.i0.put(vVar, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.b(!z11);
            mediaRouteVolumeSlider.setEnabled(z11);
            if (z11) {
                if (tVar.P) {
                    if (((!vVar.e() || s4.x.g()) ? vVar.o : 0) == 1) {
                        z10 = true;
                        if (z10) {
                            mediaRouteVolumeSlider.setMax(100);
                            mediaRouteVolumeSlider.setProgress(100);
                            mediaRouteVolumeSlider.setEnabled(false);
                        } else {
                            mediaRouteVolumeSlider.setMax(vVar.q);
                            mediaRouteVolumeSlider.setProgress(vVar.p);
                            mediaRouteVolumeSlider.setOnSeekBarChangeListener(tVar.c0);
                        }
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_volume_item_icon);
            if (!z11) {
                i11 = (int) (this.a * 255.0f);
            }
            imageView.setAlpha(i11);
            ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(tVar.a0.contains(vVar) ? 4 : 0);
            HashSet hashSet = tVar.Y;
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
