package ii;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.kd;
import fi.k8;
import hi.e2;
import hi.u2;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class r extends r2 implements oe.d {
    public final oe.b a;
    public long b;
    public FrameLayout c;
    public s71 d;
    public lh.f e;
    public LinearLayout f;
    public fi.d h;
    public fi.d n;
    public fy0 r;
    public TLRPC.ChatFull s;
    public r0 v;
    public int w;

    public r(Bundle bundle) {
        super(bundle);
        this.a = new oe.b(0, this, ds.h, 320L, false);
    }

    public static void V(r rVar, u61 u61Var) {
        Object obj = u61Var.G;
        if (obj instanceof ji.f) {
            ji.f fVar = (ji.f) obj;
            long j10 = fVar.a;
            TLRPC.Chat chat = MessagesController.getInstance(rVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(rVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                rVar.presentFragment(wn.ea(user.id));
            } else if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
                rVar.presentFragment(wn.ea(-chat.id));
            } else {
                new ki.b(rVar.getParentActivity(), chat, new u2(13, rVar, fVar)).show();
            }
        }
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        float f11 = 1.0f - f7;
        this.f.setAlpha(f11);
        this.f.setVisibility(f11 > 0.0f ? 0 : 8);
        this.r.setAlpha(f7);
        this.r.setVisibility(f7 > 0.0f ? 0 : 8);
    }

    public final void W(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        boolean z10 = true;
        z10 = true;
        setHasOwnBackground(true);
        r0 r0Var = new r0(getParentActivity(), this.resourceProvider, wc.b0(this), this.currentAccount, this.b);
        this.v = r0Var;
        r0Var.h = new rb.c(this, 29);
        r0Var.d();
        this.v.e();
        final int i10 = 0;
        this.actionBar.setBackButtonDrawable(new j2(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new bh.m(this, 7));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i11 = y6.a7;
        f7.i(i11, frameLayout, null);
        s71 s71Var = new s71(this, new e2(this, 4), new p(this), new p(this));
        this.d = s71Var;
        s71Var.setClipToPadding(false);
        s71 s71Var2 = this.d;
        s71Var2.g3.r = false;
        s71Var2.u1();
        this.d.j(new ai.b(this, 14));
        this.actionBar.setAdaptiveBackground(this.d);
        this.c.addView(this.d, kb1.g(-1.0f, -1));
        lh.f fVar = new lh.f(context);
        this.e = fVar;
        fVar.setupColorKey(i11);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.c.addView(this.e, kb1.k());
        this.c.addView(this.actionBar, kb1.i(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(0);
        this.f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.n = dVar;
        dVar.e();
        fi.d dVar2 = this.n;
        int f7 = i0.a.f(0.125f, getThemedColor(y6.d6), getThemedColor(y6.G6));
        this.w = f7;
        dVar2.setColor(f7);
        this.n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.n.f();
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: ii.q
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
        this.f.addView(this.n, kb1.t(0, 48, 1.0f, 0, 4, 0, 4, 0));
        fi.d dVar3 = new fi.d(context, this.resourceProvider, true);
        this.h = dVar3;
        dVar3.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.f();
        fi.d dVar4 = this.h;
        final int i12 = z10 ? 1 : 0;
        dVar4.setOnClickListener(new View.OnClickListener(this) { // from class: ii.q
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
        this.f.addView(this.h, kb1.t(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(this.f, kb1.i(-1, -2, 80));
        fy0 fy0Var = new fy0(getParentActivity(), null, 16, this.resourceProvider);
        this.r = fy0Var;
        fy0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.r.setAnimateLayoutChange(true);
        this.r.setVisibility(8);
        this.c.addView(this.r, kb1.i(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.a.a(z10, false);
        W(0);
        FrameLayout frameLayout2 = this.c;
        p pVar = new p(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(frameLayout2, pVar);
        setBulletinDelegate(new k8(4));
        FrameLayout frameLayout3 = this.c;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.b));
        this.s = getMessagesController().getChatFull(this.b);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        r0 r0Var = this.v;
        kd kdVar = r0Var.i;
        if (kdVar != null) {
            kdVar.run();
        }
        r0Var.i = null;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f7 = i0.a.f(0.125f, getThemedColor(y6.d6), getThemedColor(y6.G6));
            fi.d dVar = this.n;
            if (dVar == null || f7 == this.w) {
                return;
            }
            this.w = f7;
            dVar.setColor(f7);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
