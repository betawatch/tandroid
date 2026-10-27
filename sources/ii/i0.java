package ii;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.ActionBar.z6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s71;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i0 extends g0 {
    public final /* synthetic */ j0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, Context context) {
        super(j0Var, context);
        int i10;
        u6 u6Var;
        u6 u6Var2;
        u6 u6Var3;
        u6 u6Var4;
        u6 u6Var5;
        u6 u6Var6;
        u6 u6Var7;
        u6 u6Var8;
        this.h = j0Var;
        i10 = ((k3) j0Var).currentAccount;
        int i11 = 5;
        s sVar = new s(j0Var, i11);
        t tVar = new t(j0Var, i11);
        u6Var = ((k3) j0Var).resourcesProvider;
        s71 s71Var = new s71(context, i10, 0, false, sVar, tVar, null, u6Var);
        this.d = s71Var;
        s71Var.u1();
        s71 s71Var2 = this.d;
        s71Var2.g3.r = false;
        s71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new ai.b(this, 16));
        this.c.addView(this.d, 0, kb1.g(-1.0f, -1));
        u6Var2 = ((k3) j0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, u6Var2);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.a;
        int i12 = y6.G6;
        u6Var3 = ((k3) j0Var).resourcesProvider;
        f7.m(kVar2, 5, i12, u6Var3);
        org.telegram.ui.ActionBar.k kVar3 = this.a;
        int i13 = y6.z8;
        u6Var4 = ((k3) j0Var).resourcesProvider;
        f7.m(kVar3, 3, i13, u6Var4);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar4 = this.a;
        int i14 = y6.y8;
        u6Var5 = ((k3) j0Var).resourcesProvider;
        f7.m(kVar4, 1, i14, u6Var5);
        this.a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new bh.m(this, 10));
        this.c.addView(this.a, kb1.i(-1, 56, 48));
        LinearLayout d = wh.d(context, 0);
        d.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        u6Var6 = ((k3) j0Var).resourcesProvider;
        fi.d dVar = new fi.d(context, u6Var6, true);
        dVar.e();
        int i15 = y6.d6;
        dVar.setColor(i0.a.f(0.125f, j0Var.getThemedColor(i15), j0Var.getThemedColor(i12)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.f();
        if (dVar.getBackground() != null) {
            Drawable background = dVar.getBackground();
            u6Var8 = ((k3) j0Var).resourcesProvider;
            dVar.setBackground(background);
            a7 p10 = f7.p(dVar, true);
            p10.d = background;
            p10.e = null;
            p10.f = null;
            if (background != null) {
                z6 z6Var = new z6();
                p10.e = z6Var;
                z6Var.c(i15, i12, 3, 0.125f, u6Var8);
                z6Var.g = f7.u(background);
            }
        }
        final int i16 = 0;
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ii.h0
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.h.M.f(false, true);
                        break;
                    default:
                        this.b.h.M.f(true, true);
                        break;
                }
            }
        });
        d.addView(dVar, kb1.t(0, 48, 1.0f, 0, 4, 0, 4, 0));
        u6Var7 = ((k3) j0Var).resourcesProvider;
        fi.d dVar2 = new fi.d(context, u6Var7, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.f();
        final int i17 = 1;
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: ii.h0
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        this.b.h.M.f(false, true);
                        break;
                    default:
                        this.b.h.M.f(true, true);
                        break;
                }
            }
        });
        d.addView(dVar2, kb1.t(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(d, kb1.j(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
