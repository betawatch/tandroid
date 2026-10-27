package androidx.mediarouter.app;

import a8.p1;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import s4.e1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b0 extends e1 {
    public final View v;
    public final ImageView w;
    public final ProgressBar x;
    public final TextView y;
    public final /* synthetic */ c0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, View view) {
        super(view);
        this.z = c0Var;
        this.v = view;
        this.w = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
        this.x = progressBar;
        this.y = (TextView) view.findViewById(R.id.mr_picker_route_name);
        p1.i(c0Var.r.n, progressBar);
    }
}
