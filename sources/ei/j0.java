package ei;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import bi.a2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.r61;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class j0 extends h0 {
    public final /* synthetic */ k0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        f6 f6Var;
        f6 f6Var2;
        f6 f6Var3;
        f6 f6Var4;
        this.h = k0Var;
        i10 = ((h3) k0Var).currentAccount;
        int i11 = 5;
        t tVar = new t(k0Var, i11);
        u uVar = new u(k0Var, i11);
        f6Var = ((h3) k0Var).resourcesProvider;
        r61 r61Var = new r61(context, i10, 0, false, tVar, uVar, null, f6Var);
        this.d = r61Var;
        r61Var.o1();
        r61 r61Var2 = this.d;
        r61Var2.Y2.r = false;
        r61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new a2(this, 6));
        this.c.addView(this.d, 0, a6.c(-1.0f, -1));
        f6Var2 = ((h3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, f6Var2);
        this.a = lVar;
        lVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.l lVar2 = this.a;
        int i12 = j6.G6;
        lVar2.setTitleColor(k0Var.getThemedColor(i12));
        this.a.A(k0Var.getThemedColor(j6.z8), false);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        this.a.C(k0Var.getThemedColor(j6.y8), false);
        this.a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new di.w(this, 8));
        this.c.addView(this.a, a6.e(-1, 56, 48));
        LinearLayout f7 = em.f(context, 0);
        f7.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        f6Var3 = ((h3) k0Var).resourcesProvider;
        bi.d dVar = new bi.d(context, f6Var3, true);
        dVar.d();
        dVar.setColor(i0.a.d(0.125f, k0Var.getThemedColor(j6.d6), k0Var.getThemedColor(i12)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.e();
        final int i13 = 0;
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ei.i0
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
        f7.addView(dVar, a6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        f6Var4 = ((h3) k0Var).resourcesProvider;
        bi.d dVar2 = new bi.d(context, f6Var4, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.e();
        final int i14 = 1;
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: ei.i0
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
        f7.addView(dVar2, a6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(f7, a6.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
