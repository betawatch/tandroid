// default package

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class e16 implements xe7 {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ int b;
    public final /* synthetic */ nk3 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ Uri f;
    public final /* synthetic */ he h;

    public /* synthetic */ e16(LaunchActivity launchActivity, int i, nk3 nk3Var, boolean z, ArrayList arrayList, Uri uri, he heVar) {
        this.a = launchActivity;
        this.b = i;
        this.c = nk3Var;
        this.d = z;
        this.e = arrayList;
        this.f = uri;
        this.h = heVar;
    }

    @Override // xe7
    public final void run(long j) {
        he heVar = this.h;
        String str = LaunchActivity.C1;
        LaunchActivity launchActivity = this.a;
        if (j != 0) {
            Bundle l = ts2.l("scrollToTopOnResume", true);
            if (!gm.O1()) {
                nm7.f(this.b).k(nm7.s, new Object[0]);
            }
            if (pg3.D(j)) {
                l.putLong("user_id", j);
            } else {
                l.putLong("chat_id", -j);
            }
            yv1 yv1Var = new yv1(l);
            yv1Var.O9 = true;
            tk5 N = launchActivity.N();
            nk3 nk3Var = this.c;
            ((ActionBarLayout) N).U(yv1Var, nk3Var != null || this.d, nk3Var == null);
        } else {
            ArrayList arrayList = this.e;
            launchActivity.X = arrayList;
            if (arrayList == null) {
                arrayList = new ArrayList();
                launchActivity.X = arrayList;
            }
            arrayList.add(0, this.f);
            launchActivity.j0(true);
        }
        try {
            heVar.dismiss();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
