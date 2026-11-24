// default package

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ns5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ q59 h;

    public /* synthetic */ ns5(q59 q59Var, TLRPC.User user, String str, boolean z, boolean z2, boolean z3, byte b) {
        this.a = b;
        this.h = q59Var;
        this.b = user;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        ylb ylbVar;
        byte b = this.a;
        q59 q59Var = this.h;
        switch (b) {
            case 0:
                xs5 xs5Var = ((ss5) q59Var).c;
                xhb.b(xs5Var.getContext(), xs5Var.a, -xs5Var.a2, this.b, this.c, this.d, this.e, this.f, xs5Var.J0);
                break;
            case 1:
                ProfileActivity profileActivity = ((lq8) q59Var).e;
                Activity parentActivity = profileActivity.getParentActivity();
                i = ((d) profileActivity).currentAccount;
                long a = profileActivity.a();
                ylbVar = ((d) profileActivity).resourceProvider;
                xhb.b(parentActivity, i, a, this.b, this.c, this.d, this.e, this.f, ylbVar);
                break;
            default:
                nha nhaVar = ((aga) q59Var).f;
                xhb.b(nhaVar.getContext(), nhaVar.y1.getCurrentAccount(), nhaVar.m1, this.b, this.c, this.d, this.e, this.f, nhaVar.I1);
                break;
        }
    }
}
