package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import h7.e5;
import h7.l8;
import h7.s7;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j0 extends e0 {
    public final ImageView A;
    public final ProgressBar B;
    public final TextView C;
    public final RelativeLayout D;
    public final CheckBox E;
    public final float F;
    public final int G;
    public final v H;
    public final /* synthetic */ k0 I;
    public final View z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(k0 k0Var, View view) {
        super(r4, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.I = k0Var;
        m0 m0Var = k0Var.w;
        this.H = new v(this, 3);
        this.z = view;
        this.A = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
        this.B = progressBar;
        this.C = (TextView) view.findViewById(R.id.mr_cast_route_name);
        this.D = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
        this.E = checkBox;
        Context context = m0Var.y;
        Drawable d = l8.d(s7.b(context, R.drawable.mr_cast_checkbox));
        if (e5.h(context)) {
            d.setTint(f0.e.c(context, R.color.mr_dynamic_dialog_icon_light));
        }
        checkBox.setButtonDrawable(d);
        e5.i(context, progressBar);
        this.F = e5.c(context);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
        this.G = (int) typedValue.getDimension(displayMetrics);
    }

    public final boolean v(c2.b0 b0Var) {
        if (b0Var.g()) {
            return true;
        }
        za.c b10 = this.I.w.r.b(b0Var);
        if (b10 == null) {
            return false;
        }
        c2.q qVar = (c2.q) b10.b;
        return (qVar != null ? qVar.b : 1) == 3;
    }

    public final void w(boolean z10, boolean z11) {
        CheckBox checkBox = this.E;
        checkBox.setEnabled(false);
        this.z.setEnabled(false);
        checkBox.setChecked(z10);
        if (z10) {
            this.A.setVisibility(4);
            this.B.setVisibility(0);
        }
        if (z11) {
            this.I.D(z10 ? this.G : 0, this.D);
        }
    }
}
