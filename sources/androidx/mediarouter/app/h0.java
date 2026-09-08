package androidx.mediarouter.app;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import s4.c1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class h0 extends c1 {
    public p4.v A;
    public final /* synthetic */ m0 B;
    public final View v;
    public final ImageView w;
    public final ProgressBar x;
    public final TextView y;
    public final float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m0 m0Var, View view) {
        super(view);
        this.B = m0Var;
        this.v = view;
        this.w = (ImageView) view.findViewById(R.id.mr_cast_group_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_group_progress_bar);
        this.x = progressBar;
        this.y = (TextView) view.findViewById(R.id.mr_cast_group_name);
        o0 o0Var = m0Var.w;
        this.z = v7.d0.c(o0Var.y);
        v7.d0.i(o0Var.y, progressBar);
    }
}
