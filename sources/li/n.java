package li;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import bi.g2;
import bi.v4;
import bi.x4;
import c8.ja;
import c8.na;
import di.e1;
import hi.f1;
import hi.n5;
import hi.p5;
import java.util.WeakHashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.u41;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;
import org.telegram.ui.qq;
import org.telegram.ui.uq0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class n extends e2 implements l30, is, te.b {
    public RadialProgressView E;
    public t8 F;
    public m30 G;
    public TLRPC.FileLocation H;
    public gi.j I;
    public TLRPC.Chat J;
    public TLRPC.ChatFull K;
    public final t1[] L;
    public final l M;
    public ui.c a;
    public final te.a b;
    public long c;
    public e1 d;
    public u41 e;
    public String f;
    public boolean h;
    public boolean n;
    public g2 r;
    public m s;
    public n5 w;
    public i9 x;
    public AnimatorSet y;

    public n(Bundle bundle) {
        super(bundle);
        this.b = new te.a(0, this, er.h, 320L, false);
        this.L = new t1[1];
        this.M = new l(this);
    }

    public static boolean Z(n nVar, b41 b41Var, View view) {
        long j3;
        boolean t6;
        boolean z10;
        boolean z11;
        Object obj = b41Var.G;
        int i7 = 1;
        if (!(obj instanceof TLRPC.Chat)) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j3 = user.id;
                t6 = q10.t(user);
                TLRPC.Chat chat = nVar.J;
                z10 = chat != null && ((user.bot && user.bot_can_edit) || t3.y(27, chat));
                z11 = false;
            }
            return false;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
        j3 = -chat2.id;
        boolean V = t3.V(chat2);
        TLRPC.Chat chat3 = nVar.J;
        z10 = chat3 != null && (chat2.creator || t3.y(27, chat3));
        z11 = V;
        t6 = false;
        boolean z12 = z10;
        int b10 = l0.b(nVar.currentAccount, j3);
        boolean z13 = b10 == 1 || b10 == 2;
        if (z12 || z13) {
            m60 F = m60.F(nVar.d, null, view);
            F.l(R.drawable.msg_viewintopic, hd.M0(t6 ? 2131751910 : z11 ? 2131751909 : 2131751908, null), new f(nVar, j3, i7), z13);
            F.m(R.drawable.msg_cancel, new k(nVar, t6, z11, j3, 0), hd.M0(2131751915, null), z12, true);
            F.W(nVar.e.U0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void a0(n nVar, b41 b41Var) {
        TLRPC.Chat M0;
        TLRPC.ChatPhoto chatPhoto;
        int i7 = b41Var.d;
        if (i7 == 140) {
            if (nVar.G.g() || (chatPhoto = (M0 = nVar.getMessagesController().M0(Long.valueOf(nVar.c))).photo) == null || chatPhoto.photo_big == null) {
                return;
            }
            gc gcVar = null;
            PhotoViewer.p1().I2(null, nVar, null);
            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
            int i10 = chatPhoto2.dc_id;
            if (i10 != 0) {
                chatPhoto2.photo_big.dc_id = i10;
            }
            TLRPC.ChatFull chatFull = nVar.K;
            if (chatFull != null) {
                TLRPC.Photo photo = chatFull.chat_photo;
                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                    gcVar = gc.j(nVar.K.chat_photo.video_sizes.get(0), nVar.K.chat_photo);
                }
            }
            PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, nVar.M, null, 0L, 0L, 0L, true, null, null);
            return;
        }
        if (i7 == 141) {
            nVar.G.n(nVar.H != null, new g(nVar, 0), new f1(6), 0);
            return;
        }
        if (i7 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", nVar.c);
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            qq qqVar = new qq(bundle);
            qqVar.C0(nVar.K);
            nVar.presentFragment(qqVar);
            return;
        }
        if (i7 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", nVar.c);
            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            qq qqVar2 = new qq(bundle2);
            qqVar2.C0(nVar.K);
            nVar.presentFragment(qqVar2);
            return;
        }
        if (i7 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", nVar.c);
            nVar.presentFragment(new r(bundle3));
            return;
        }
        if (i7 == 150) {
            nVar.e0(true);
            return;
        }
        if (i7 == 151) {
            nVar.e0(false);
            return;
        }
        if (i7 == 145) {
            t4.r(nVar, false, nVar.J, null, false, true, true, false, new i(nVar));
            return;
        }
        if (i7 == 146) {
            l0.e(nVar.L, nVar, nVar.currentAccount, nVar.J);
            return;
        }
        Object obj = b41Var.G;
        if (obj instanceof TLRPC.Chat) {
            nVar.presentFragment(an.ua(-((TLRPC.Chat) obj).id));
        } else if (obj instanceof TLRPC.User) {
            nVar.presentFragment(an.ua(((TLRPC.User) obj).id));
        }
    }

    public static /* synthetic */ void b0(n nVar) {
        nVar.H = null;
        np.s1(nVar.currentAccount).B(nVar.c, null, null, null, null, 0.0d, null, null, null, null);
        nVar.f0(false, true);
        nVar.x.j(null, null, nVar.F, nVar.J);
    }

    public static void c0(n nVar, long j3) {
        np.s1(nVar.currentAccount).Q2(j3, nVar.c, true, false, new h(nVar, 0));
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        this.I.setAlpha(f10);
        this.I.setScaleX(org.telegram.messenger.g0.T1(0.75f, 1.0f, f10));
        this.I.setScaleY(org.telegram.messenger.g0.T1(0.75f, 1.0f, f10));
        this.I.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.l30
    public final void I(float f10) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.l30
    public final void O(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.l30
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new j(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonDrawable(new x1(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new x4(this, 16));
        ui.c cVar = new ui.c();
        this.a = cVar;
        cVar.a(getThemedColor(j6.d6));
        this.actionBar.P(new dh.c(cVar, cVar, cVar), c8.g0.o(this.resourceProvider), false);
        this.actionBar.R0 = true;
        e1 e1Var = new e1(this, context);
        this.d = e1Var;
        q6.h(j6.a7, e1Var, null);
        this.F = new t8(this.J);
        m mVar = new m(context);
        this.s = mVar;
        mVar.a.f(this.J, this.F);
        this.x = this.s.a;
        String m10 = m5.m(this.J);
        this.f = m10;
        e6 e6Var = this.resourceProvider;
        g2 g2Var = new g2(context, 9);
        di.q qVar = new di.q(context, 2);
        g2Var.b = qVar;
        q6.U(qVar, j6.G6, e6Var);
        q6.G(qVar, j6.Xc, e6Var);
        q6.D(qVar, j6.H6, e6Var);
        qVar.setTextSize(1, 16.0f);
        qVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        qVar.setBackground(null);
        qVar.setImeOptions(qVar.getImeOptions() | TLObject.FLAG_28);
        qVar.setInputType(qVar.getInputType() | TLObject.FLAG_14);
        qVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
        qVar.setMinHeight(org.telegram.messenger.g0.L(50.0f));
        g2Var.addView(qVar, ja.d(-1, -2.0f, (hd.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.r = g2Var;
        qVar.setText(m10);
        ((di.q) this.r.b).setSelection(m10.length());
        int i10 = 12;
        ((di.q) this.r.b).addTextChangedListener(new ah.j(this, i10));
        gi.j jVar = new gi.j(this, context);
        this.I = jVar;
        q6.U(jVar, j6.Ji, getResourceProvider());
        this.I.setText(hd.M0(2131745946, null));
        this.I.setTypeface(org.telegram.messenger.g0.o());
        this.I.setTextSize(1, 14.0f);
        this.I.setGravity(17);
        this.I.setVisibility(8);
        this.I.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.I.setOnClickListener(new p5(this, i10));
        na.a(this.I);
        this.actionBar.addView(this.I, ja.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        n5 n5Var = new n5(this, context);
        this.w = n5Var;
        this.s.addView(n5Var, ja.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.E = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
        this.E.setProgressColor(-1);
        this.E.setNoProgress(false);
        this.s.addView(this.E, ja.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        f0(false, false);
        u41 u41Var = new u41(this, new h(this, i7), new i(this), new i(this));
        this.e = u41Var;
        u41Var.setClipToPadding(false);
        u41 u41Var2 = this.e;
        p41 p41Var = u41Var2.g3;
        p41Var.r = false;
        p41Var.s = true;
        u41Var2.r1();
        this.actionBar.setBackground(null);
        this.d.addView(this.e, ja.c(-1.0f, -1));
        this.d.addView(this.actionBar, ja.e(-1, -2, 48));
        e1 e1Var2 = this.d;
        i iVar = new i(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(e1Var2, iVar);
        e1 e1Var3 = this.d;
        this.fragmentView = e1Var3;
        return e1Var3;
    }

    public final void d0() {
        this.b.a((this.h == this.n && TextUtils.equals(((di.q) this.r.b).getText().toString(), this.f)) ? false : true, true);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.c) {
                this.K = chatFull;
                this.e.g3.O(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void dismissCurrentDialog() {
        if (this.G.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.G.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final void e0(boolean z10) {
        if (this.n == z10) {
            return;
        }
        g6 g6Var = (g6) this.e.B1(ns.h2);
        if (g6Var != null) {
            g6Var.a(!z10);
        }
        g6 g6Var2 = (g6) this.e.B1(ns.g2);
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
        this.y.addListener(new v4(17, this, z10));
        this.y.start();
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ uq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.l30
    public final String getInitialSearchString() {
        return ((di.q) this.r.b).getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.G.h(i7, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.c = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.c));
        this.J = M0;
        boolean z10 = M0 != null && ((tL_chatBannedRights = M0.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers);
        this.h = z10;
        this.n = z10;
        this.K = getMessagesController().N0(this.c);
        m30 m30Var = new m30(3, true, true);
        this.G = m30Var;
        m30Var.a = this;
        m30Var.b = this;
        getNotificationCenter().c(this, ns.T);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, ns.T);
        m30 m30Var = this.G;
        if (m30Var != null) {
            m30Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onPause() {
        super.onPause();
        this.G.i();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        this.G.j(i7, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        this.G.k();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ui.c cVar = this.a;
            if (cVar != null) {
                cVar.a(getThemedColor(j6.d6));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void restoreSelfArgs(Bundle bundle) {
        m30 m30Var = this.G;
        if (m30Var != null) {
            m30Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        m30 m30Var = this.G;
        if (m30Var != null && (str = m30Var.f) != null) {
            bundle.putString("path", str);
        }
        g2 g2Var = this.r;
        if (g2Var != null) {
            String obj = ((di.q) g2Var.b).getText().toString();
            if (obj.isEmpty()) {
                return;
            }
            bundle.putString("nameTextView", obj);
        }
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ void U() {
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
