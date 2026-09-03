package androidx.mediarouter.app;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import f2.m1;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c0 extends m1 {
    public final View v;
    public final ImageView w;
    public final ProgressBar x;
    public final TextView y;
    public final /* synthetic */ d0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, View view) {
        super(view);
        this.z = d0Var;
        this.v = view;
        this.w = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
        this.x = progressBar;
        this.y = (TextView) view.findViewById(R.id.mr_picker_route_name);
        j7.a0.i(d0Var.r.n, progressBar);
    }
}
