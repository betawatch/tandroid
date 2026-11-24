// default package

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kv6 extends u69 {
    public ew6 A;
    public final /* synthetic */ pv6 B;
    public final View v;
    public final ImageView w;
    public final ProgressBar x;
    public final TextView y;
    public final float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv6(pv6 pv6Var, View view) {
        super(view);
        this.B = pv6Var;
        this.v = view;
        this.w = (ImageView) view.findViewById(R.id.mr_cast_group_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_group_progress_bar);
        this.x = progressBar;
        this.y = (TextView) view.findViewById(R.id.mr_cast_group_name);
        rv6 rv6Var = pv6Var.x;
        this.z = yqe.c(rv6Var.E);
        yqe.i(rv6Var.E, progressBar);
    }
}
