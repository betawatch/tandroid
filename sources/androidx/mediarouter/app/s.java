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
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s extends ArrayAdapter {
    public final float a;
    public final /* synthetic */ t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.b = tVar;
        this.a = v7.a0.c(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z10;
        t tVar = this.b;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
        } else {
            t.o(tVar.e0, (LinearLayout) view.findViewById(R.id.volume_item_container));
            View findViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i11 = tVar.d0;
            layoutParams.width = i11;
            layoutParams.height = i11;
            findViewById.setLayoutParams(layoutParams);
        }
        p4.w wVar = (p4.w) getItem(i10);
        if (wVar != null) {
            boolean z11 = wVar.g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z11);
            textView.setText(wVar.d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            Context context = viewGroup.getContext();
            OverlayListView overlayListView = tVar.U;
            int b10 = v7.a0.b(context, 0);
            int alpha = Color.alpha(b10);
            int i12 = zs.e4;
            if (alpha != 255) {
                b10 = i0.b.k(b10, ((Integer) overlayListView.getTag()).intValue());
            }
            mediaRouteVolumeSlider.a(b10, b10);
            mediaRouteVolumeSlider.setTag(wVar);
            tVar.h0.put(wVar, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.b(!z11);
            mediaRouteVolumeSlider.setEnabled(z11);
            if (z11) {
                if (tVar.O) {
                    if (((!wVar.e() || p4.y.g()) ? wVar.o : 0) == 1) {
                        z10 = true;
                        if (z10) {
                            mediaRouteVolumeSlider.setMax(100);
                            mediaRouteVolumeSlider.setProgress(100);
                            mediaRouteVolumeSlider.setEnabled(false);
                        } else {
                            mediaRouteVolumeSlider.setMax(wVar.q);
                            mediaRouteVolumeSlider.setProgress(wVar.p);
                            mediaRouteVolumeSlider.setOnSeekBarChangeListener(tVar.b0);
                        }
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_volume_item_icon);
            if (!z11) {
                i12 = (int) (this.a * 255.0f);
            }
            imageView.setAlpha(i12);
            ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(tVar.Z.contains(wVar) ? 4 : 0);
            HashSet hashSet = tVar.X;
            if (hashSet != null && hashSet.contains(wVar)) {
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
