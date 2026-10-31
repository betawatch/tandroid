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
import org.telegram.messenger.beta.R;
import v7.r7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l0 extends f0 {
    public final ImageView A;
    public final ProgressBar B;
    public final TextView C;
    public final RelativeLayout D;
    public final CheckBox E;
    public final float F;
    public final int G;
    public final w H;
    public final /* synthetic */ m0 I;
    public final View z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l0(m0 m0Var, View view) {
        super(r4, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.I = m0Var;
        o0 o0Var = m0Var.x;
        this.H = new w(this, 3);
        this.z = view;
        this.A = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
        this.B = progressBar;
        this.C = (TextView) view.findViewById(R.id.mr_cast_route_name);
        this.D = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
        this.E = checkBox;
        Context context = o0Var.D;
        Drawable b10 = r7.b(context, R.drawable.mr_cast_checkbox);
        if (v7.a0.h(context)) {
            b10.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        checkBox.setButtonDrawable(b10);
        v7.a0.i(context, progressBar);
        this.F = v7.a0.c(context);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
        this.G = (int) typedValue.getDimension(displayMetrics);
    }

    public final boolean v(p4.w wVar) {
        if (wVar.g()) {
            return true;
        }
        k2.m0 b10 = this.I.x.r.b(wVar);
        if (b10 == null) {
            return false;
        }
        p4.o oVar = (p4.o) b10.a;
        return (oVar != null ? oVar.b : 1) == 3;
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
