package nh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import fh.w4;
import g7.e6;
import gh.ua;
import java.util.WeakHashMap;
import kh.b8;
import kh.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oc;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class r extends o2 implements td.b {
    public final td.a a;
    public long b;
    public FrameLayout c;
    public i51 d;
    public rg.f e;
    public LinearLayout f;
    public kh.d h;
    public kh.d n;
    public gw0 r;
    public TLRPC.ChatFull s;
    public q0 v;

    public r(Bundle bundle) {
        super(bundle);
        this.a = new td.a(0, this, gr.h, 320L, false);
    }

    public static void T(r rVar, l41 l41Var) {
        Object obj = l41Var.G;
        if (obj instanceof oh.e) {
            oh.e eVar = (oh.e) obj;
            long j10 = eVar.a;
            TLRPC.Chat chat = MessagesController.getInstance(rVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(rVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                rVar.presentFragment(qn.R9(user.id));
            } else if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
                rVar.presentFragment(qn.R9(-chat.id));
            } else {
                new ph.b(rVar.getParentActivity(), chat, new o8(11, rVar, eVar)).show();
            }
        }
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        float f12 = 1.0f - f10;
        this.f.setAlpha(f12);
        this.f.setVisibility(f12 > 0.0f ? 0 : 8);
        this.r.setAlpha(f10);
        this.r.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    public final void U(int i9) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i9);
        this.f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i9);
        this.r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i9);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        boolean z10 = true;
        z10 = true;
        setHasOwnBackground(true);
        q0 q0Var = new q0(getParentActivity(), this.resourceProvider, oc.a0(this), this.currentAccount, this.b);
        this.v = q0Var;
        q0Var.h = new n5.e0(this, 3);
        q0Var.d();
        this.v.e();
        final int i9 = 0;
        j2.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new w4(this, 8));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i10 = f6.a7;
        frameLayout.setBackgroundColor(f6.w0(null, i10, false));
        i51 i51Var = new i51(this, new b8(this, 12), new p(this), new p(this));
        this.d = i51Var;
        i51Var.setClipToPadding(false);
        i51 i51Var2 = this.d;
        i51Var2.U2.r = false;
        i51Var2.p1();
        this.d.j(new bg.o2(this, 16));
        this.actionBar.setAdaptiveBackground(this.d);
        this.c.addView(this.d, e6.c(-1.0f, -1));
        rg.f fVar = new rg.f(context);
        this.e = fVar;
        fVar.setupColorKey(i10);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.c.addView(this.e, e6.g());
        this.c.addView(this.actionBar, e6.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(0);
        this.f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        kh.d dVar = new kh.d(context, this.resourceProvider, true);
        this.n = dVar;
        dVar.d();
        this.n.setColor(i0.a.d(0.125f, getThemedColor(f6.d6), getThemedColor(f6.G6)));
        this.n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.n.e();
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: nh.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        this.b.v.f(false, true);
                        break;
                    default:
                        this.b.v.f(true, true);
                        break;
                }
            }
        });
        this.f.addView(this.n, e6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        kh.d dVar2 = new kh.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        kh.d dVar3 = this.h;
        final int i11 = z10 ? 1 : 0;
        dVar3.setOnClickListener(new View.OnClickListener(this) { // from class: nh.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.v.f(false, true);
                        break;
                    default:
                        this.b.v.f(true, true);
                        break;
                }
            }
        });
        this.f.addView(this.h, e6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(this.f, e6.e(-1, -2, 80));
        gw0 gw0Var = new gw0(getParentActivity(), null, 16, this.resourceProvider);
        this.r = gw0Var;
        gw0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.r.setAnimateLayoutChange(true);
        this.r.setVisibility(8);
        this.c.addView(this.r, e6.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.a.a(z10, false);
        U(0);
        FrameLayout frameLayout2 = this.c;
        p pVar = new p(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(frameLayout2, pVar);
        setBulletinDelegate(new bg.z(8));
        FrameLayout frameLayout3 = this.c;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.b));
        this.s = getMessagesController().getChatFull(this.b);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        q0 q0Var = this.v;
        ua uaVar = q0Var.i;
        if (uaVar != null) {
            uaVar.run();
        }
        q0Var.i = null;
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
