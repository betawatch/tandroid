// default package

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class jv6 extends f89 {
    public final View v;
    public final ImageView w;
    public final ProgressBar x;
    public final TextView y;
    public final /* synthetic */ kv6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv6(kv6 kv6Var, View view) {
        super(view);
        this.z = kv6Var;
        this.v = view;
        this.w = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
        this.x = progressBar;
        this.y = (TextView) view.findViewById(R.id.mr_picker_route_name);
        nte.i(kv6Var.r.n, progressBar);
    }
}
