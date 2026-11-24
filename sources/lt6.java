// default package

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class lt6 extends jt6 {
    public final int A;
    public final /* synthetic */ pt6 B;
    public final TextView z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lt6(pt6 pt6Var, View view) {
        super(r4, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.B = pt6Var;
        rt6 rt6Var = pt6Var.x;
        this.z = (TextView) view.findViewById(R.id.mr_group_volume_route_name);
        Resources resources = rt6Var.E.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
        this.A = (int) typedValue.getDimension(displayMetrics);
    }
}
