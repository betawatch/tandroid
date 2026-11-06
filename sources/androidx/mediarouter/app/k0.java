package androidx.mediarouter.app;

import a8.b7;
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
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class k0 extends e0 {
    public final ImageView A;
    public final ProgressBar B;
    public final TextView C;
    public final RelativeLayout D;
    public final CheckBox E;
    public final float F;
    public final int G;
    public final w H;
    public final /* synthetic */ l0 I;
    public final View z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(l0 l0Var, View view) {
        super(r4, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.I = l0Var;
        n0 n0Var = l0Var.x;
        this.H = new w(this, 3);
        this.z = view;
        this.A = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
        this.B = progressBar;
        this.C = (TextView) view.findViewById(R.id.mr_cast_route_name);
        this.D = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
        this.E = checkBox;
        Context context = n0Var.D;
        Drawable b10 = b5.a.b(context, R.drawable.mr_cast_checkbox);
        if (b7.h(context)) {
            b10.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        checkBox.setButtonDrawable(b10);
        b7.i(context, progressBar);
        this.F = b7.c(context);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
        this.G = (int) typedValue.getDimension(displayMetrics);
    }

    public final boolean v(s4.v vVar) {
        if (vVar.g()) {
            return true;
        }
        org.telegram.ui.Components.n b10 = this.I.x.r.b(vVar);
        if (b10 == null) {
            return false;
        }
        s4.o oVar = (s4.o) b10.a;
        return (oVar != null ? oVar.b : 1) == 3;
    }

    public final void w(boolean z9, boolean z10) {
        CheckBox checkBox = this.E;
        checkBox.setEnabled(false);
        this.z.setEnabled(false);
        checkBox.setChecked(z9);
        if (z9) {
            this.A.setVisibility(4);
            this.B.setVisibility(0);
        }
        if (z10) {
            this.I.D(z9 ? this.G : 0, this.D);
        }
    }
}
