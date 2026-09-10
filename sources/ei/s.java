package ei;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.a2;
import bi.af;
import bi.fa;
import bi.xa;
import com.google.android.gms.internal.vision.e2;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.eo;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class s extends p2 implements le.d {
    public final le.b a;
    public long b;
    public FrameLayout c;
    public r61 d;
    public ih.f e;
    public LinearLayout f;
    public bi.d h;
    public bi.d n;
    public jx0 r;
    public TLRPC.ChatFull s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.a = new le.b(0, this, wr.h, 320L, false);
    }

    public static void U(s sVar, v51 v51Var) {
        Object obj = v51Var.G;
        if (obj instanceof fi.f) {
            fi.f fVar = (fi.f) obj;
            long j3 = fVar.a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j3));
            if (user != null) {
                sVar.presentFragment(eo.R9(user.id));
            } else if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
                sVar.presentFragment(eo.R9(-chat.id));
            } else {
                new gi.c(sVar.getParentActivity(), chat, new af(24, sVar, fVar)).show();
            }
        }
    }

    @Override // le.d
    public final void G(int i10, float f7, float f10, le.e eVar) {
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

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        boolean z10 = true;
        z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, wc.a0(this), this.currentAccount, this.b);
        this.v = t0Var;
        t0Var.h = new xa.c(this, 17);
        t0Var.d();
        this.v.e();
        final int i10 = 0;
        e2.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i11 = j6.a7;
        frameLayout.setBackgroundColor(j6.w0(null, i11, false));
        r61 r61Var = new r61(this, new ai.c0(this, 19), new q(this), new q(this));
        this.d = r61Var;
        r61Var.setClipToPadding(false);
        r61 r61Var2 = this.d;
        r61Var2.Y2.r = false;
        r61Var2.o1();
        this.d.j(new a2(this, 4));
        this.actionBar.setAdaptiveBackground(this.d);
        this.c.addView(this.d, a6.c(-1.0f, -1));
        ih.f fVar = new ih.f(context);
        this.e = fVar;
        fVar.setupColorKey(i11);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.c.addView(this.e, a6.g());
        this.c.addView(this.actionBar, a6.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(0);
        this.f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        bi.d dVar = new bi.d(context, this.resourceProvider, true);
        this.n = dVar;
        dVar.d();
        this.n.setColor(i0.a.d(0.125f, getThemedColor(j6.d6), getThemedColor(j6.G6)));
        this.n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.n.e();
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: ei.r
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
        this.f.addView(this.n, a6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        bi.d dVar2 = new bi.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        bi.d dVar3 = this.h;
        final int i12 = z10 ? 1 : 0;
        dVar3.setOnClickListener(new View.OnClickListener(this) { // from class: ei.r
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
        this.f.addView(this.h, a6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(this.f, a6.e(-1, -2, 80));
        jx0 jx0Var = new jx0(getParentActivity(), null, 16, this.resourceProvider);
        this.r = jx0Var;
        jx0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.r.setAnimateLayoutChange(true);
        this.r.setVisibility(8);
        this.c.addView(this.r, a6.e(-2, -2, 17));
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
        setBulletinDelegate(new fa(4));
        FrameLayout frameLayout3 = this.c;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.b));
        this.s = getMessagesController().getChatFull(this.b);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        xa xaVar = t0Var.i;
        if (xaVar != null) {
            xaVar.run();
        }
        t0Var.i = null;
    }

    @Override // le.d
    public final /* synthetic */ void B(float f7, int i10) {
    }
}
