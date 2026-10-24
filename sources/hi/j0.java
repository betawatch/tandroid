package hi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.j71;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class j0 extends h0 {
    public final /* synthetic */ k0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        g6 g6Var;
        g6 g6Var2;
        g6 g6Var3;
        g6 g6Var4;
        g6 g6Var5;
        g6 g6Var6;
        g6 g6Var7;
        g6 g6Var8;
        this.h = k0Var;
        i10 = ((h3) k0Var).currentAccount;
        int i11 = 5;
        s sVar = new s(k0Var, i11);
        u uVar = new u(k0Var, i11);
        g6Var = ((h3) k0Var).resourcesProvider;
        j71 j71Var = new j71(context, i10, 0, false, sVar, uVar, null, g6Var);
        this.d = j71Var;
        j71Var.t1();
        j71 j71Var2 = this.d;
        j71Var2.Z2.r = false;
        j71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new ah.d0(this, 12));
        this.c.addView(this.d, 0, z5.c(-1.0f, -1));
        g6Var2 = ((h3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var2);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.a;
        int i12 = k6.G6;
        g6Var3 = ((h3) k0Var).resourcesProvider;
        r6.m(kVar2, 5, i12, g6Var3);
        org.telegram.ui.ActionBar.k kVar3 = this.a;
        int i13 = k6.z8;
        g6Var4 = ((h3) k0Var).resourcesProvider;
        r6.m(kVar3, 3, i13, g6Var4);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar4 = this.a;
        int i14 = k6.y8;
        g6Var5 = ((h3) k0Var).resourcesProvider;
        r6.m(kVar4, 1, i14, g6Var5);
        this.a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new ah.s(this, 10));
        this.c.addView(this.a, z5.e(-1, 56, 48));
        LinearLayout e = sl.e(context, 0);
        e.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        g6Var6 = ((h3) k0Var).resourcesProvider;
        ei.d dVar = new ei.d(context, g6Var6, true);
        dVar.e();
        int i15 = k6.d6;
        dVar.setColor(i0.a.f(0.125f, k0Var.getThemedColor(i15), k0Var.getThemedColor(i12)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.f();
        if (dVar.getBackground() != null) {
            Drawable background = dVar.getBackground();
            g6Var8 = ((h3) k0Var).resourcesProvider;
            dVar.setBackground(background);
            m6 p5 = r6.p(dVar, true);
            p5.d = background;
            p5.e = null;
            p5.f = null;
            if (background != null) {
                l6 l6Var = new l6();
                p5.e = l6Var;
                l6Var.c(i15, i12, 3, 0.125f, g6Var8);
                l6Var.g = r6.v(background);
            }
        }
        final int i16 = 0;
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: hi.i0
            public final /* synthetic */ j0 b;

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
        e.addView(dVar, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        g6Var7 = ((h3) k0Var).resourcesProvider;
        ei.d dVar2 = new ei.d(context, g6Var7, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.f();
        final int i17 = 1;
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: hi.i0
            public final /* synthetic */ j0 b;

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
        e.addView(dVar2, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(e, z5.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
