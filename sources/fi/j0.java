package fi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e71;
import w7.z5;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class j0 extends h0 {
    public final /* synthetic */ k0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        d6 d6Var;
        d6 d6Var2;
        d6 d6Var3;
        d6 d6Var4;
        this.h = k0Var;
        i10 = ((f3) k0Var).currentAccount;
        int i11 = 5;
        t tVar = new t(k0Var, i11);
        u uVar = new u(k0Var, i11);
        d6Var = ((f3) k0Var).resourcesProvider;
        e71 e71Var = new e71(context, i10, 0, false, tVar, uVar, null, d6Var);
        this.d = e71Var;
        e71Var.r1();
        e71 e71Var2 = this.d;
        e71Var2.f3.r = false;
        e71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new ai.r(this, 8));
        this.c.addView(this.d, 0, z5.c(-1.0f, -1));
        d6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var2);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.a;
        int i12 = i6.G6;
        kVar2.setTitleColor(k0Var.getThemedColor(i12));
        this.a.z(k0Var.getThemedColor(i6.z8), false);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        this.a.A(k0Var.getThemedColor(i6.y8), false);
        this.a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new ei.u(this, 8));
        this.c.addView(this.a, z5.e(-1, 56, 48));
        LinearLayout e7 = bi.e(context, 0);
        e7.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        d6Var3 = ((f3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context, d6Var3, true);
        dVar.d();
        dVar.setColor(i0.a.d(0.125f, k0Var.getThemedColor(i6.d6), k0Var.getThemedColor(i12)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.e();
        final int i13 = 0;
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: fi.i0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.h.M.f(false, true);
                        break;
                    default:
                        this.b.h.M.f(true, true);
                        break;
                }
            }
        });
        e7.addView(dVar, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        d6Var4 = ((f3) k0Var).resourcesProvider;
        ci.d dVar2 = new ci.d(context, d6Var4, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.e();
        final int i14 = 1;
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: fi.i0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.h.M.f(false, true);
                        break;
                    default:
                        this.b.h.M.f(true, true);
                        break;
                }
            }
        });
        e7.addView(dVar2, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(e7, z5.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
