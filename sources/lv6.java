// default package

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lv6 extends jv6 {
    public final int A;
    public final /* synthetic */ pv6 B;
    public final TextView z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lv6(pv6 pv6Var, View view) {
        super(r4, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.B = pv6Var;
        rv6 rv6Var = pv6Var.x;
        this.z = (TextView) view.findViewById(R.id.mr_group_volume_route_name);
        Resources resources = rv6Var.E.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
        this.A = (int) typedValue.getDimension(displayMetrics);
    }
}
