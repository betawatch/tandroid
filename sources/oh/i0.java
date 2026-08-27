package oh;

import ag.e2;
import ag.z2;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y1;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k51;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class i0 extends g0 {
    public final /* synthetic */ j0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, Context context) {
        super(j0Var, context);
        int i10;
        c6 c6Var;
        c6 c6Var2;
        c6 c6Var3;
        c6 c6Var4;
        this.h = j0Var;
        i10 = ((e3) j0Var).currentAccount;
        int i11 = 5;
        s sVar = new s(j0Var, i11);
        t tVar = new t(j0Var, i11);
        c6Var = ((e3) j0Var).resourcesProvider;
        k51 k51Var = new k51(context, i10, 0, false, sVar, tVar, null, c6Var);
        this.d = k51Var;
        k51Var.p1();
        k51 k51Var2 = this.d;
        k51Var2.U2.r = false;
        k51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new z2(this, 19));
        this.c.addView(this.d, 0, z5.c(-1.0f, -1));
        c6Var2 = ((e3) j0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var2);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.a;
        int i12 = g6.G6;
        kVar2.setTitleColor(j0Var.getThemedColor(i12));
        this.a.C(j0Var.getThemedColor(g6.z8), false);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        this.a.D(j0Var.getThemedColor(g6.y8), false);
        this.a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new e2(this, 12));
        this.c.addView(this.a, z5.e(-1, 56, 48));
        LinearLayout g10 = y1.g(context, 0);
        g10.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        c6Var3 = ((e3) j0Var).resourcesProvider;
        lh.d dVar = new lh.d(context, c6Var3, true);
        dVar.d();
        dVar.setColor(i0.b.d(0.125f, j0Var.getThemedColor(g6.d6), j0Var.getThemedColor(i12)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.e();
        final int i13 = 0;
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: oh.h0
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.h.I.f(false, true);
                        break;
                    default:
                        this.b.h.I.f(true, true);
                        break;
                }
            }
        });
        g10.addView(dVar, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        c6Var4 = ((e3) j0Var).resourcesProvider;
        lh.d dVar2 = new lh.d(context, c6Var4, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.e();
        final int i14 = 1;
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: oh.h0
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.h.I.f(false, true);
                        break;
                    default:
                        this.b.h.I.f(true, true);
                        break;
                }
            }
        });
        g10.addView(dVar2, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(g10, z5.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
