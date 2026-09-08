package gi;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import di.c9;
import di.q9;
import fi.j4;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class s extends n2 implements le.d {
    public final le.b a;
    public long b;
    public FrameLayout c;
    public d61 d;
    public kh.f e;
    public LinearLayout f;
    public di.d h;
    public di.d n;
    public xw0 r;
    public TLRPC.ChatFull s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.a = new le.b(0, this, pr.h, 320L, false);
    }

    public static void U(s sVar, h51 h51Var) {
        Object obj = h51Var.G;
        if (obj instanceof hi.f) {
            hi.f fVar = (hi.f) obj;
            long j3 = fVar.a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j3));
            if (user != null) {
                sVar.presentFragment(co.R9(user.id));
            } else if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
                sVar.presentFragment(co.R9(-chat.id));
            } else {
                new ii.c(sVar.getParentActivity(), chat, new j4(1, sVar, fVar)).show();
            }
        }
    }

    @Override // le.d
    public final void E(int i10, float f7, float f10, le.e eVar) {
        float f11 = 1.0f - f7;
        this.f.setAlpha(f11);
        this.f.setVisibility(f11 > 0.0f ? 0 : 8);
        this.r.setAlpha(f7);
        this.r.setVisibility(f7 > 0.0f ? 0 : 8);
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        boolean z10 = true;
        z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, yc.a0(this), this.currentAccount, this.b);
        this.v = t0Var;
        t0Var.h = new xa.c(this, 19);
        t0Var.d();
        this.v.e();
        final int i10 = 0;
        i2.g.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 6));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i11 = j6.a7;
        frameLayout.setBackgroundColor(j6.w0(null, i11, false));
        d61 d61Var = new d61(this, new ci.u(this, 19), new q(this), new q(this));
        this.d = d61Var;
        d61Var.setClipToPadding(false);
        d61 d61Var2 = this.d;
        d61Var2.Y2.r = false;
        d61Var2.o1();
        this.d.j(new ah.e0(this, 7));
        this.actionBar.setAdaptiveBackground(this.d);
        this.c.addView(this.d, x5.c(-1.0f, -1));
        kh.f fVar = new kh.f(context);
        this.e = fVar;
        fVar.setupColorKey(i11);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.c.addView(this.e, x5.g());
        this.c.addView(this.actionBar, x5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(0);
        this.f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        di.d dVar = new di.d(context, this.resourceProvider, true);
        this.n = dVar;
        dVar.d();
        this.n.setColor(i0.a.d(0.125f, getThemedColor(j6.d6), getThemedColor(j6.G6)));
        this.n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.n.e();
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: gi.r
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.v.f(false, true);
                        break;
                    default:
                        this.b.v.f(true, true);
                        break;
                }
            }
        });
        this.f.addView(this.n, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        di.d dVar2 = new di.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        di.d dVar3 = this.h;
        final int i12 = z10 ? 1 : 0;
        dVar3.setOnClickListener(new View.OnClickListener(this) { // from class: gi.r
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.v.f(false, true);
                        break;
                    default:
                        this.b.v.f(true, true);
                        break;
                }
            }
        });
        this.f.addView(this.h, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(this.f, x5.e(-1, -2, 80));
        xw0 xw0Var = new xw0(getParentActivity(), null, 16, this.resourceProvider);
        this.r = xw0Var;
        xw0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.r.setAnimateLayoutChange(true);
        this.r.setVisibility(8);
        this.c.addView(this.r, x5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(frameLayout2, qVar);
        setBulletinDelegate(new c9(4));
        FrameLayout frameLayout3 = this.c;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.b));
        this.s = getMessagesController().getChatFull(this.b);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        q9 q9Var = t0Var.i;
        if (q9Var != null) {
            q9Var.run();
        }
        t0Var.i = null;
    }

    @Override // le.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
