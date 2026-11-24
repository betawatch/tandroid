// default package

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class kt6 extends s49 {
    public eu6 A;
    public final /* synthetic */ pt6 B;
    public final View v;
    public final ImageView w;
    public final ProgressBar x;
    public final TextView y;
    public final float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt6(pt6 pt6Var, View view) {
        super(view);
        this.B = pt6Var;
        this.v = view;
        this.w = (ImageView) view.findViewById(R.id.mr_cast_group_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_group_progress_bar);
        this.x = progressBar;
        this.y = (TextView) view.findViewById(R.id.mr_cast_group_name);
        rt6 rt6Var = pt6Var.x;
        this.z = voe.c(rt6Var.E);
        voe.i(rt6Var.E, progressBar);
    }
}
