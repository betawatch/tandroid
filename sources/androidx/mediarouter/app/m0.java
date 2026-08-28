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
import f7.q8;
import f7.t7;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m0 extends h0 {
    public final ImageView A;
    public final ProgressBar B;
    public final TextView C;
    public final RelativeLayout D;
    public final CheckBox E;
    public final float F;
    public final int G;
    public final y H;
    public final /* synthetic */ n0 I;
    public final View z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m0(n0 n0Var, View view) {
        super(r4, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.I = n0Var;
        p0 p0Var = n0Var.w;
        this.H = new y(this, 3);
        this.z = view;
        this.A = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
        this.B = progressBar;
        this.C = (TextView) view.findViewById(R.id.mr_cast_route_name);
        this.D = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
        this.E = checkBox;
        Context context = p0Var.y;
        Drawable d = q8.d(t7.b(context, R.drawable.mr_cast_checkbox));
        if (f7.d0.h(context)) {
            d.setTint(f0.e.c(context, R.color.mr_dynamic_dialog_icon_light));
        }
        checkBox.setButtonDrawable(d);
        f7.d0.i(context, progressBar);
        this.F = f7.d0.c(context);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
        this.G = (int) typedValue.getDimension(displayMetrics);
    }

    public final boolean v(c2.a0 a0Var) {
        if (a0Var.g()) {
            return true;
        }
        fa.c b10 = this.I.w.r.b(a0Var);
        if (b10 == null) {
            return false;
        }
        c2.p pVar = (c2.p) b10.b;
        return (pVar != null ? pVar.b : 1) == 3;
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
