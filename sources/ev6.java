// default package

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ev6 extends u69 {
    public final View v;
    public final ImageView w;
    public final ProgressBar x;
    public final TextView y;
    public final /* synthetic */ fv6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev6(fv6 fv6Var, View view) {
        super(view);
        this.z = fv6Var;
        this.v = view;
        this.w = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
        this.x = progressBar;
        this.y = (TextView) view.findViewById(R.id.mr_picker_route_name);
        yqe.i(fv6Var.r.n, progressBar);
    }
}
