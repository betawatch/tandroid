package androidx.mediarouter.app;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import f2.q1;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i0 extends q1 {
    public c2.a0 A;
    public final /* synthetic */ n0 B;
    public final View v;
    public final ImageView w;
    public final ProgressBar x;
    public final TextView y;
    public final float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(n0 n0Var, View view) {
        super(view);
        this.B = n0Var;
        this.v = view;
        this.w = (ImageView) view.findViewById(R.id.mr_cast_group_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_group_progress_bar);
        this.x = progressBar;
        this.y = (TextView) view.findViewById(R.id.mr_cast_group_name);
        p0 p0Var = n0Var.w;
        this.z = f7.d0.c(p0Var.y);
        f7.d0.i(p0Var.y, progressBar);
    }
}
