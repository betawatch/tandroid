// default package

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class et6 extends s49 {
    public final View v;
    public final ImageView w;
    public final ProgressBar x;
    public final TextView y;
    public final /* synthetic */ ft6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et6(ft6 ft6Var, View view) {
        super(view);
        this.z = ft6Var;
        this.v = view;
        this.w = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
        this.x = progressBar;
        this.y = (TextView) view.findViewById(R.id.mr_picker_route_name);
        voe.i(ft6Var.r.n, progressBar);
    }
}
