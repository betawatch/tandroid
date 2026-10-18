package hi;

import ai.td;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ei.o8;
import ei.p6;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.sn;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class r extends n2 implements ne.d {
    public final ne.b a;
    public long b;
    public FrameLayout c;
    public a71 d;
    public kh.f e;
    public LinearLayout f;
    public ei.d h;
    public ei.d n;
    public rx0 r;
    public TLRPC.ChatFull s;
    public s0 v;

    public r(Bundle bundle) {
        super(bundle);
        this.a = new ne.b(0, this, bs.h, 320L, false);
    }

    public static void U(r rVar, f61 f61Var) {
        Object obj = f61Var.G;
        if (obj instanceof ii.e) {
            ii.e eVar = (ii.e) obj;
            long j10 = eVar.a;
            TLRPC.Chat chat = MessagesController.getInstance(rVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(rVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                rVar.presentFragment(sn.W9(user.id));
            } else if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
                rVar.presentFragment(sn.W9(-chat.id));
            } else {
                new ji.b(rVar.getParentActivity(), chat, new p6(29, rVar, eVar)).show();
            }
        }
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
        s0 s0Var = new s0(getParentActivity(), this.resourceProvider, xc.a0(this), this.currentAccount, this.b);
        this.v = s0Var;
        s0Var.h = new ya.c(this, 23);
        s0Var.d();
        this.v.e();
        final int i10 = 0;
        i2.d.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 7));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i11 = h6.a7;
        frameLayout.setBackgroundColor(h6.x0(null, i11, false));
        a71 a71Var = new a71(this, new hg.o(this, 1), new p(this), new p(this));
        this.d = a71Var;
        a71Var.setClipToPadding(false);
        a71 a71Var2 = this.d;
        a71Var2.W2.r = false;
        a71Var2.p1();
        this.d.j(new ah.d0(this, 10));
        this.actionBar.setAdaptiveBackground(this.d);
        this.c.addView(this.d, z5.d(-1.0f, -1));
        kh.f fVar = new kh.f(context);
        this.e = fVar;
        fVar.setupColorKey(i11);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.c.addView(this.e, z5.g());
        this.c.addView(this.actionBar, z5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(0);
        this.f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        this.n = dVar;
        dVar.d();
        this.n.setColor(i0.a.f(0.125f, getThemedColor(h6.d6), getThemedColor(h6.G6)));
        this.n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.n.e();
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: hi.q
            public final /* synthetic */ r b;

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
        this.f.addView(this.n, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ei.d dVar2 = new ei.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        ei.d dVar3 = this.h;
        final int i12 = z10 ? 1 : 0;
        dVar3.setOnClickListener(new View.OnClickListener(this) { // from class: hi.q
            public final /* synthetic */ r b;

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
        this.f.addView(this.h, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(this.f, z5.e(-1, -2, 80));
        rx0 rx0Var = new rx0(getParentActivity(), null, 16, this.resourceProvider);
        this.r = rx0Var;
        rx0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.r.setAnimateLayoutChange(true);
        this.r.setVisibility(8);
        this.c.addView(this.r, z5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.c;
        p pVar = new p(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(frameLayout2, pVar);
        setBulletinDelegate(new o8(4));
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
        s0 s0Var = this.v;
        td tdVar = s0Var.i;
        if (tdVar != null) {
            tdVar.run();
        }
        s0Var.i = null;
    }

    @Override // ne.d
    public final void u(int i10, float f7, float f10, ne.e eVar) {
        float f11 = 1.0f - f7;
        this.f.setAlpha(f11);
        this.f.setVisibility(f11 > 0.0f ? 0 : 8);
        this.r.setAlpha(f7);
        this.r.setVisibility(f7 > 0.0f ? 0 : 8);
    }

    @Override // ne.d
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
