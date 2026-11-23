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
import bi.g3;
import bi.j7;
import bi.w1;
import c8.na;
import c8.sa;
import di.d1;
import hi.n1;
import hi.w5;
import hi.z4;
import java.util.WeakHashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.x60;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;
import org.telegram.ui.rq;
import org.telegram.ui.wq0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class o extends g2 implements t30, fs, te.b {
    public RadialProgressView E;
    public a9 F;
    public u30 G;
    public TLRPC.FileLocation H;
    public gi.j I;
    public TLRPC.Chat J;
    public TLRPC.ChatFull K;
    public final t1[] L;
    public final m M;
    public ui.c a;
    public final te.a b;
    public long c;
    public d1 d;
    public g51 e;
    public String f;
    public boolean h;
    public boolean n;
    public g3 r;
    public n s;
    public w5 w;
    public p9 x;
    public AnimatorSet y;

    public o(Bundle bundle) {
        super(bundle);
        this.b = new te.a(0, this, kr.h, 320L, false);
        this.L = new t1[1];
        this.M = new m(this);
    }

    public static boolean Z(o oVar, n41 n41Var, View view) {
        long j3;
        boolean u10;
        boolean z10;
        boolean z11;
        Object obj = n41Var.H;
        int i7 = 1;
        if (!(obj instanceof TLRPC.Chat)) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j3 = user.id;
                u10 = n10.u(user);
                TLRPC.Chat chat = oVar.J;
                z10 = chat != null && ((user.bot && user.bot_can_edit) || v3.y(27, chat));
                z11 = false;
            }
            return false;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
        j3 = -chat2.id;
        boolean V = v3.V(chat2);
        TLRPC.Chat chat3 = oVar.J;
        z10 = chat3 != null && (chat2.creator || v3.y(27, chat3));
        z11 = V;
        u10 = false;
        boolean z12 = z10;
        int b10 = k0.b(oVar.currentAccount, j3);
        boolean z13 = b10 == 1 || b10 == 2;
        if (z12 || z13) {
            x60 G = x60.G(oVar.d, null, view);
            G.l(R.drawable.msg_viewintopic, gd.N0(u10 ? 2131751898 : z11 ? 2131751897 : 2131751896, null), new g(oVar, j3, i7), z13);
            G.m(R.drawable.msg_cancel, new l(oVar, u10, z11, j3, 0), gd.N0(2131751903, null), z12, true);
            G.X(oVar.e.U0(view, true));
            G.a0();
            return true;
        }
        return false;
    }

    public static void a0(o oVar, n41 n41Var) {
        TLRPC.Chat O0;
        TLRPC.ChatPhoto chatPhoto;
        int i7 = n41Var.d;
        if (i7 == 140) {
            if (oVar.G.g() || (chatPhoto = (O0 = oVar.getMessagesController().O0(Long.valueOf(oVar.c))).photo) == null || chatPhoto.photo_big == null) {
                return;
            }
            fc fcVar = null;
            PhotoViewer.p1().J2(null, oVar, null);
            TLRPC.ChatPhoto chatPhoto2 = O0.photo;
            int i10 = chatPhoto2.dc_id;
            if (i10 != 0) {
                chatPhoto2.photo_big.dc_id = i10;
            }
            TLRPC.ChatFull chatFull = oVar.K;
            if (chatFull != null) {
                TLRPC.Photo photo = chatFull.chat_photo;
                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                    fcVar = fc.j(oVar.K.chat_photo.video_sizes.get(0), oVar.K.chat_photo);
                }
            }
            PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, oVar.M, null, 0L, 0L, 0L, true, null, null);
            return;
        }
        if (i7 == 141) {
            oVar.G.n(oVar.H != null, new h(oVar, 0), new n1(6), 0);
            return;
        }
        if (i7 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", oVar.c);
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            rq rqVar = new rq(bundle);
            rqVar.C0(oVar.K);
            oVar.presentFragment(rqVar);
            return;
        }
        if (i7 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", oVar.c);
            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            rq rqVar2 = new rq(bundle2);
            rqVar2.C0(oVar.K);
            oVar.presentFragment(rqVar2);
            return;
        }
        if (i7 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", oVar.c);
            oVar.presentFragment(new r(bundle3));
            return;
        }
        if (i7 == 150) {
            oVar.e0(true);
            return;
        }
        if (i7 == 151) {
            oVar.e0(false);
            return;
        }
        if (i7 == 145) {
            b5.r(oVar, false, oVar.J, null, false, true, true, false, new j(oVar));
            return;
        }
        if (i7 == 146) {
            k0.e(oVar.L, oVar, oVar.currentAccount, oVar.J);
            return;
        }
        Object obj = n41Var.H;
        if (obj instanceof TLRPC.Chat) {
            oVar.presentFragment(bn.ua(-((TLRPC.Chat) obj).id));
        } else if (obj instanceof TLRPC.User) {
            oVar.presentFragment(bn.ua(((TLRPC.User) obj).id));
        }
    }

    public static /* synthetic */ void b0(o oVar) {
        oVar.H = null;
        mp.u1(oVar.currentAccount).B(oVar.c, null, null, null, null, 0.0d, null, null, null, null);
        oVar.f0(false, true);
        oVar.x.j(null, null, oVar.F, oVar.J);
    }

    public static void c0(o oVar, long j3) {
        mp.u1(oVar.currentAccount).W2(j3, oVar.c, true, false, new i(oVar, 0));
    }

    @Override // org.telegram.ui.Components.t30
    public final void H(float f10) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // te.b
    public final void K(int i7, float f10, float f11, te.c cVar) {
        this.I.setAlpha(f10);
        this.I.setScaleX(org.telegram.messenger.g0.T1(0.75f, 1.0f, f10));
        this.I.setScaleY(org.telegram.messenger.g0.T1(0.75f, 1.0f, f10));
        this.I.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.t30
    public final void P(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.t30
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new k(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonDrawable(new x1(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new w1(this, 18));
        ui.c cVar = new ui.c();
        this.a = cVar;
        cVar.a(getThemedColor(n6.d6));
        this.actionBar.P(new dh.c(cVar, cVar, cVar), c8.j0.p(this.resourceProvider), false);
        this.actionBar.R0 = true;
        d1 d1Var = new d1(this, context);
        this.d = d1Var;
        u6.h(n6.a7, d1Var, null);
        this.F = new a9(this.J);
        n nVar = new n(context);
        this.s = nVar;
        nVar.a.f(this.J, this.F);
        this.x = this.s.a;
        String m10 = n5.m(this.J);
        this.f = m10;
        i6 i6Var = this.resourceProvider;
        g3 g3Var = new g3(context, 9);
        di.q qVar = new di.q(context, 2);
        g3Var.b = qVar;
        u6.U(qVar, n6.G6, i6Var);
        u6.G(qVar, n6.Xc, i6Var);
        u6.D(qVar, n6.H6, i6Var);
        qVar.setTextSize(1, 16.0f);
        qVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        qVar.setBackground(null);
        qVar.setImeOptions(qVar.getImeOptions() | TLObject.FLAG_28);
        qVar.setInputType(qVar.getInputType() | TLObject.FLAG_14);
        qVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
        qVar.setMinHeight(org.telegram.messenger.g0.L(50.0f));
        g3Var.addView(qVar, na.d(-1, -2.0f, (gd.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.r = g3Var;
        qVar.setText(m10);
        ((di.q) this.r.b).setSelection(m10.length());
        int i10 = 13;
        ((di.q) this.r.b).addTextChangedListener(new ah.j(this, i10));
        gi.j jVar = new gi.j(this, context);
        this.I = jVar;
        u6.U(jVar, n6.Ji, getResourceProvider());
        this.I.setText(gd.N0(2131745750, null));
        this.I.setTypeface(org.telegram.messenger.g0.o());
        this.I.setTextSize(1, 14.0f);
        this.I.setGravity(17);
        this.I.setVisibility(8);
        this.I.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.I.setOnClickListener(new z4(this, i10));
        sa.a(this.I);
        this.actionBar.addView(this.I, na.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        w5 w5Var = new w5(this, context);
        this.w = w5Var;
        this.s.addView(w5Var, na.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.E = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
        this.E.setProgressColor(-1);
        this.E.setNoProgress(false);
        this.s.addView(this.E, na.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        f0(false, false);
        g51 g51Var = new g51(this, new i(this, i7), new j(this), new j(this));
        this.e = g51Var;
        g51Var.setClipToPadding(false);
        g51 g51Var2 = this.e;
        b51 b51Var = g51Var2.g3;
        b51Var.r = false;
        b51Var.s = true;
        g51Var2.r1();
        this.actionBar.setBackground(null);
        this.d.addView(this.e, na.c(-1.0f, -1));
        this.d.addView(this.actionBar, na.e(-1, -2, 48));
        d1 d1Var2 = this.d;
        j jVar2 = new j(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(d1Var2, jVar2);
        d1 d1Var3 = this.d;
        this.fragmentView = d1Var3;
        return d1Var3;
    }

    public final void d0() {
        this.b.a((this.h == this.n && TextUtils.equals(((di.q) this.r.b).getText().toString(), this.f)) ? false : true, true);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.c) {
                this.K = chatFull;
                this.e.g3.O(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void dismissCurrentDialog() {
        if (this.G.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.G.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0(boolean z10) {
        if (this.n == z10) {
            return;
        }
        h6 h6Var = (h6) this.e.B1(ks.h2);
        if (h6Var != null) {
            h6Var.a(!z10);
        }
        h6 h6Var2 = (h6) this.e.B1(ks.g2);
        if (h6Var2 != null) {
            h6Var2.a(z10);
        }
        this.n = z10;
        d0();
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ boolean f() {
        return true;
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.w, (Property<w5, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.E;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.w, (Property<w5, Float>) property2, 0.0f));
        }
        this.y.setDuration(180L);
        this.y.addListener(new j7(17, this, z10));
        this.y.start();
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.t30
    public final String getInitialSearchString() {
        return ((di.q) this.r.b).getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.G.h(i7, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.c = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.c));
        this.J = O0;
        boolean z10 = O0 != null && ((tL_chatBannedRights = O0.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers);
        this.h = z10;
        this.n = z10;
        this.K = getMessagesController().P0(this.c);
        u30 u30Var = new u30(3, true, true);
        this.G = u30Var;
        u30Var.a = this;
        u30Var.b = this;
        getNotificationCenter().c(this, ks.T);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, ks.T);
        u30 u30Var = this.G;
        if (u30Var != null) {
            u30Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        this.G.i();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        this.G.j(i7, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        this.G.k();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ui.c cVar = this.a;
            if (cVar != null) {
                cVar.a(getThemedColor(n6.d6));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void restoreSelfArgs(Bundle bundle) {
        u30 u30Var = this.G;
        if (u30Var != null) {
            u30Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        u30 u30Var = this.G;
        if (u30Var != null && (str = u30Var.f) != null) {
            bundle.putString("path", str);
        }
        g3 g3Var = this.r;
        if (g3Var != null) {
            String obj = ((di.q) g3Var.b).getText().toString();
            if (obj.isEmpty()) {
                return;
            }
            bundle.putString("nameTextView", obj);
        }
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ void U() {
    }

    @Override // te.b
    public final /* synthetic */ void G(float f10, int i7) {
    }
}
