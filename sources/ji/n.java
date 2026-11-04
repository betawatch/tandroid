package ji;

import ai.g5;
import ai.o2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import b8.cd;
import b8.mf;
import b8.pf;
import ci.l1;
import gi.d1;
import gi.n5;
import java.util.WeakHashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.a8;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.mq0;
import org.telegram.ui.nq;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n extends d2 implements e30, cs, qe.b {
    public RadialProgressView E;
    public u8 F;
    public f30 G;
    public TLRPC.FileLocation H;
    public fi.j I;
    public TLRPC.Chat J;
    public TLRPC.ChatFull K;
    public final s1[] L;
    public final l M;
    public si.c a;
    public final qe.a b;
    public long c;
    public l1 d;
    public l41 e;
    public String f;
    public boolean h;
    public boolean n;
    public o2 r;
    public m s;
    public n5 w;
    public k9 x;
    public AnimatorSet y;

    public n(Bundle bundle) {
        super(bundle);
        this.b = new qe.a(0, this, xq.h, 320L, false);
        this.L = new s1[1];
        this.M = new l(this);
    }

    public static boolean Z(n nVar, r31 r31Var, View view) {
        long j10;
        boolean t10;
        boolean z10;
        boolean z11;
        Object obj = r31Var.G;
        int i3 = 1;
        if (!(obj instanceof TLRPC.Chat)) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.id;
                t10 = l10.t(user);
                TLRPC.Chat chat = nVar.J;
                z10 = chat != null && ((user.bot && user.bot_can_edit) || t3.y(27, chat));
                z11 = false;
            }
            return false;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
        j10 = -chat2.id;
        boolean V = t3.V(chat2);
        TLRPC.Chat chat3 = nVar.J;
        z10 = chat3 != null && (chat2.creator || t3.y(27, chat3));
        z11 = V;
        t10 = false;
        boolean z12 = z10;
        int b10 = j0.b(nVar.currentAccount, j10);
        boolean z13 = b10 == 1 || b10 == 2;
        if (z12 || z13) {
            f60 F = f60.F(nVar.d, null, view);
            F.l(R.drawable.msg_viewintopic, bd.M0(t10 ? 2131751910 : z11 ? 2131751909 : 2131751908, null), new f(nVar, j10, i3), z13);
            F.m(R.drawable.msg_cancel, new k(nVar, t10, z11, j10, 0), bd.M0(2131751915, null), z12, true);
            F.W(nVar.e.U0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void a0(n nVar, r31 r31Var) {
        TLRPC.Chat M0;
        TLRPC.ChatPhoto chatPhoto;
        int i3 = r31Var.d;
        if (i3 == 140) {
            if (nVar.G.g() || (chatPhoto = (M0 = nVar.getMessagesController().M0(Long.valueOf(nVar.c))).photo) == null || chatPhoto.photo_big == null) {
                return;
            }
            ac acVar = null;
            PhotoViewer.v1().N2(null, nVar, null);
            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
            int i10 = chatPhoto2.dc_id;
            if (i10 != 0) {
                chatPhoto2.photo_big.dc_id = i10;
            }
            TLRPC.ChatFull chatFull = nVar.K;
            if (chatFull != null) {
                TLRPC.Photo photo = chatFull.chat_photo;
                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                    acVar = ac.j(nVar.K.chat_photo.video_sizes.get(0), nVar.K.chat_photo);
                }
            }
            PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, nVar.M, null, 0L, 0L, 0L, true, null, null);
            return;
        }
        if (i3 == 141) {
            nVar.G.n(nVar.H != null, new g(nVar, 0), new d1(6), 0);
            return;
        }
        if (i3 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", nVar.c);
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            nq nqVar = new nq(bundle);
            nqVar.C0(nVar.K);
            nVar.presentFragment(nqVar);
            return;
        }
        if (i3 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", nVar.c);
            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            nq nqVar2 = new nq(bundle2);
            nqVar2.C0(nVar.K);
            nVar.presentFragment(nqVar2);
            return;
        }
        if (i3 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", nVar.c);
            nVar.presentFragment(new q(bundle3));
            return;
        }
        if (i3 == 150) {
            nVar.e0(true);
            return;
        }
        if (i3 == 151) {
            nVar.e0(false);
            return;
        }
        if (i3 == 145) {
            t4.r(nVar, false, nVar.J, null, false, true, true, false, new i(nVar));
            return;
        }
        if (i3 == 146) {
            j0.e(nVar.L, nVar, nVar.currentAccount, nVar.J);
            return;
        }
        Object obj = r31Var.G;
        if (obj instanceof TLRPC.Chat) {
            nVar.presentFragment(wm.ra(-((TLRPC.Chat) obj).id));
        } else if (obj instanceof TLRPC.User) {
            nVar.presentFragment(wm.ra(((TLRPC.User) obj).id));
        }
    }

    public static /* synthetic */ void b0(n nVar) {
        nVar.H = null;
        hp.s1(nVar.currentAccount).B(nVar.c, null, null, null, null, 0.0d, null, null, null, null);
        nVar.f0(false, true);
        nVar.x.j(null, null, nVar.F, nVar.J);
    }

    public static void c0(n nVar, long j10) {
        hp.s1(nVar.currentAccount).Q2(j10, nVar.c, true, false, new h(nVar, 0));
    }

    @Override // org.telegram.ui.Components.e30
    public final void H(float f10) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.e30
    public final void O(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.e30
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new j(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        this.I.setAlpha(f10);
        this.I.setScaleX(org.telegram.messenger.g0.T1(0.75f, 1.0f, f10));
        this.I.setScaleY(org.telegram.messenger.g0.T1(0.75f, 1.0f, f10));
        this.I.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3 = 1;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonDrawable(new w1(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = 7;
        this.actionBar.setActionBarMenuOnItemClick(new g5(this, i10));
        si.c cVar = new si.c();
        this.a = cVar;
        cVar.a(getThemedColor(k6.d6));
        this.actionBar.M(new eh.c(cVar, cVar, cVar), cd.p(this.resourceProvider), false);
        this.actionBar.R0 = true;
        l1 l1Var = new l1(this, context);
        this.d = l1Var;
        r6.i(k6.a7, l1Var, null);
        this.F = new u8(this.J);
        m mVar = new m(context);
        this.s = mVar;
        mVar.a.e(this.J, this.F);
        this.x = this.s.a;
        String m10 = m5.m(this.J);
        this.f = m10;
        e6 e6Var = this.resourceProvider;
        o2 o2Var = new o2(context, i10);
        ci.s sVar = new ci.s(context, 2);
        o2Var.b = sVar;
        r6.V(sVar, k6.G6, e6Var);
        r6.H(sVar, k6.Uc, e6Var);
        r6.E(sVar, k6.H6, e6Var);
        sVar.setTextSize(1, 16.0f);
        sVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        sVar.setBackground(null);
        sVar.setImeOptions(sVar.getImeOptions() | TLObject.FLAG_28);
        sVar.setInputType(sVar.getInputType() | TLObject.FLAG_14);
        sVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
        sVar.setMinHeight(org.telegram.messenger.g0.L(50.0f));
        int i11 = 3;
        o2Var.addView(sVar, mf.d(-1, -2.0f, (bd.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.r = o2Var;
        sVar.setText(m10);
        ((ci.s) this.r.b).setSelection(m10.length());
        ((ci.s) this.r.b).addTextChangedListener(new bh.h(this, i10));
        fi.j jVar = new fi.j(this, context);
        this.I = jVar;
        r6.V(jVar, k6.Gi, getResourceProvider());
        this.I.setText(bd.M0(2131745956, null));
        this.I.setTypeface(org.telegram.messenger.g0.o());
        this.I.setTextSize(1, 14.0f);
        this.I.setGravity(17);
        this.I.setVisibility(8);
        this.I.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.I.setOnClickListener(new ii.m(this, i11));
        pf.a(this.I);
        this.actionBar.addView(this.I, mf.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        n5 n5Var = new n5(this, context);
        this.w = n5Var;
        this.s.addView(n5Var, mf.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.E = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
        this.E.setProgressColor(-1);
        this.E.setNoProgress(false);
        this.s.addView(this.E, mf.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        f0(false, false);
        l41 l41Var = new l41(this, new h(this, i3), new i(this), new i(this));
        this.e = l41Var;
        l41Var.setClipToPadding(false);
        l41 l41Var2 = this.e;
        f41 f41Var = l41Var2.g3;
        f41Var.r = false;
        f41Var.s = true;
        l41Var2.r1();
        this.actionBar.setBackground(null);
        this.d.addView(this.e, mf.c(-1.0f, -1));
        this.d.addView(this.actionBar, mf.e(-1, -2, 48));
        l1 l1Var2 = this.d;
        i iVar = new i(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(l1Var2, iVar);
        l1 l1Var3 = this.d;
        this.fragmentView = l1Var3;
        return l1Var3;
    }

    public final void d0() {
        this.b.a((this.h == this.n && TextUtils.equals(((ci.s) this.r.b).getText().toString(), this.f)) ? false : true, true);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.c) {
                this.K = chatFull;
                this.e.g3.O(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void dismissCurrentDialog() {
        if (this.G.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.G.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final void e0(boolean z10) {
        if (this.n == z10) {
            return;
        }
        g6 g6Var = (g6) this.e.B1(hs.h2);
        if (g6Var != null) {
            g6Var.a(!z10);
        }
        g6 g6Var2 = (g6) this.e.B1(hs.g2);
        if (g6Var2 != null) {
            g6Var2.a(z10);
        }
        this.n = z10;
        d0();
    }

    public final void f0(boolean z10, boolean z11) {
        if (this.E == null) {
            return;
        }
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.y = null;
        }
        if (!z11) {
            if (z10) {
                this.E.setAlpha(1.0f);
                this.E.setVisibility(0);
                this.w.setAlpha(1.0f);
                this.w.setVisibility(0);
                return;
            }
            this.E.setAlpha(0.0f);
            this.E.setVisibility(4);
            this.w.setAlpha(0.0f);
            this.w.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.y = animatorSet2;
        if (z10) {
            this.E.setVisibility(0);
            this.w.setVisibility(0);
            AnimatorSet animatorSet3 = this.y;
            RadialProgressView radialProgressView = this.E;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.w, (Property<n5, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.E;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.w, (Property<n5, Float>) property2, 0.0f));
        }
        this.y.setDuration(180L);
        this.y.addListener(new dh.x(16, this, z10));
        this.y.start();
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ mq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.e30
    public final String getInitialSearchString() {
        return ((ci.s) this.r.b).getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        this.G.h(i3, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.c = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.c));
        this.J = M0;
        boolean z10 = M0 != null && ((tL_chatBannedRights = M0.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers);
        this.h = z10;
        this.n = z10;
        this.K = getMessagesController().N0(this.c);
        f30 f30Var = new f30(3, true, true);
        this.G = f30Var;
        f30Var.a = this;
        f30Var.b = this;
        getNotificationCenter().c(this, hs.T);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, hs.T);
        f30 f30Var = this.G;
        if (f30Var != null) {
            f30Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        this.G.i();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        this.G.j(i3, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        this.G.k();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            si.c cVar = this.a;
            if (cVar != null) {
                cVar.a(getThemedColor(k6.d6));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void restoreSelfArgs(Bundle bundle) {
        f30 f30Var = this.G;
        if (f30Var != null) {
            f30Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        f30 f30Var = this.G;
        if (f30Var != null && (str = f30Var.f) != null) {
            bundle.putString("path", str);
        }
        o2 o2Var = this.r;
        if (o2Var != null) {
            String obj = ((ci.s) o2Var.b).getText().toString();
            if (obj.isEmpty()) {
                return;
            }
            bundle.putString("nameTextView", obj);
        }
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ void T() {
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
