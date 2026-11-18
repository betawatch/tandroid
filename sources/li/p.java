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
import bi.a3;
import bi.d7;
import bi.r1;
import c8.ma;
import c8.ra;
import di.d1;
import hi.f1;
import hi.m5;
import hi.o0;
import java.util.WeakHashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z41;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;
import org.telegram.ui.rq;
import org.telegram.ui.wq0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class p extends h2 implements t30, fs, te.b {
    public RadialProgressView E;
    public b9 F;
    public u30 G;
    public TLRPC.FileLocation H;
    public gi.j I;
    public TLRPC.Chat J;
    public TLRPC.ChatFull K;
    public final u1[] L;
    public final n M;
    public ui.c a;
    public final te.a b;
    public long c;
    public d1 d;
    public e51 e;
    public String f;
    public boolean h;
    public boolean n;
    public a3 r;
    public o s;
    public m5 w;
    public q9 x;
    public AnimatorSet y;

    public p(Bundle bundle) {
        super(bundle);
        this.b = new te.a(0, this, lr.h, 320L, false);
        this.L = new u1[1];
        this.M = new n(this);
    }

    public static boolean Z(p pVar, l41 l41Var, View view) {
        long j3;
        boolean u10;
        boolean z10;
        boolean z11;
        Object obj = l41Var.H;
        int i7 = 1;
        if (!(obj instanceof TLRPC.Chat)) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j3 = user.id;
                u10 = o10.u(user);
                TLRPC.Chat chat = pVar.J;
                z10 = chat != null && ((user.bot && user.bot_can_edit) || v3.y(27, chat));
                z11 = false;
            }
            return false;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
        j3 = -chat2.id;
        boolean V = v3.V(chat2);
        TLRPC.Chat chat3 = pVar.J;
        z10 = chat3 != null && (chat2.creator || v3.y(27, chat3));
        z11 = V;
        u10 = false;
        boolean z12 = z10;
        int b10 = l0.b(pVar.currentAccount, j3);
        boolean z13 = b10 == 1 || b10 == 2;
        if (z12 || z13) {
            y60 G = y60.G(pVar.d, null, view);
            G.l(R.drawable.msg_viewintopic, gd.M0(u10 ? 2131751899 : z11 ? 2131751898 : 2131751897, null), new h(pVar, j3, i7), z13);
            G.m(R.drawable.msg_cancel, new m(pVar, u10, z11, j3, 0), gd.M0(2131751904, null), z12, true);
            G.X(pVar.e.U0(view, true));
            G.a0();
            return true;
        }
        return false;
    }

    public static void a0(p pVar, l41 l41Var) {
        TLRPC.Chat O0;
        TLRPC.ChatPhoto chatPhoto;
        int i7 = l41Var.d;
        if (i7 == 140) {
            if (pVar.G.g() || (chatPhoto = (O0 = pVar.getMessagesController().O0(Long.valueOf(pVar.c))).photo) == null || chatPhoto.photo_big == null) {
                return;
            }
            fc fcVar = null;
            PhotoViewer.p1().I2(null, pVar, null);
            TLRPC.ChatPhoto chatPhoto2 = O0.photo;
            int i10 = chatPhoto2.dc_id;
            if (i10 != 0) {
                chatPhoto2.photo_big.dc_id = i10;
            }
            TLRPC.ChatFull chatFull = pVar.K;
            if (chatFull != null) {
                TLRPC.Photo photo = chatFull.chat_photo;
                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                    fcVar = fc.j(pVar.K.chat_photo.video_sizes.get(0), pVar.K.chat_photo);
                }
            }
            PhotoViewer.p1().d2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pVar.M, null, 0L, 0L, 0L, true, null, null);
            return;
        }
        if (i7 == 141) {
            pVar.G.n(pVar.H != null, new i(pVar, 0), new f1(6), 0);
            return;
        }
        if (i7 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", pVar.c);
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            rq rqVar = new rq(bundle);
            rqVar.C0(pVar.K);
            pVar.presentFragment(rqVar);
            return;
        }
        if (i7 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", pVar.c);
            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            rq rqVar2 = new rq(bundle2);
            rqVar2.C0(pVar.K);
            pVar.presentFragment(rqVar2);
            return;
        }
        if (i7 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", pVar.c);
            pVar.presentFragment(new s(bundle3));
            return;
        }
        if (i7 == 150) {
            pVar.e0(true);
            return;
        }
        if (i7 == 151) {
            pVar.e0(false);
            return;
        }
        if (i7 == 145) {
            b5.r(pVar, false, pVar.J, null, false, true, true, false, new k(pVar));
            return;
        }
        if (i7 == 146) {
            l0.e(pVar.L, pVar, pVar.currentAccount, pVar.J);
            return;
        }
        Object obj = l41Var.H;
        if (obj instanceof TLRPC.Chat) {
            pVar.presentFragment(bn.ua(-((TLRPC.Chat) obj).id));
        } else if (obj instanceof TLRPC.User) {
            pVar.presentFragment(bn.ua(((TLRPC.User) obj).id));
        }
    }

    public static /* synthetic */ void b0(p pVar) {
        pVar.H = null;
        mp.u1(pVar.currentAccount).B(pVar.c, null, null, null, null, 0.0d, null, null, null, null);
        pVar.f0(false, true);
        pVar.x.j(null, null, pVar.F, pVar.J);
    }

    public static void c0(p pVar, long j3) {
        mp.u1(pVar.currentAccount).W2(j3, pVar.c, true, false, new j(pVar, 0));
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        this.I.setAlpha(f10);
        this.I.setScaleX(org.telegram.messenger.g0.T1(0.75f, 1.0f, f10));
        this.I.setScaleY(org.telegram.messenger.g0.T1(0.75f, 1.0f, f10));
        this.I.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.t30
    public final void I(float f10) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.t30
    public final void Q(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.t30
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new l(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonDrawable(new y1(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new r1(this, 18));
        ui.c cVar = new ui.c();
        this.a = cVar;
        cVar.a(getThemedColor(n6.d6));
        this.actionBar.Q(new dh.c(cVar, cVar, cVar), c8.i0.p(this.resourceProvider), false);
        this.actionBar.R0 = true;
        d1 d1Var = new d1(this, context);
        this.d = d1Var;
        u6.h(n6.a7, d1Var, null);
        this.F = new b9(this.J);
        o oVar = new o(context);
        this.s = oVar;
        oVar.a.f(this.J, this.F);
        this.x = this.s.a;
        String m10 = n5.m(this.J);
        this.f = m10;
        i6 i6Var = this.resourceProvider;
        a3 a3Var = new a3(context, 9);
        di.q qVar = new di.q(context, 2);
        a3Var.b = qVar;
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
        a3Var.addView(qVar, ma.d(-1, -2.0f, (gd.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.r = a3Var;
        qVar.setText(m10);
        ((di.q) this.r.b).setSelection(m10.length());
        ((di.q) this.r.b).addTextChangedListener(new ah.j(this, 13));
        gi.j jVar = new gi.j(this, context);
        this.I = jVar;
        u6.U(jVar, n6.Ji, getResourceProvider());
        this.I.setText(gd.M0(2131745751, null));
        this.I.setTypeface(org.telegram.messenger.g0.o());
        this.I.setTextSize(1, 14.0f);
        this.I.setGravity(17);
        this.I.setVisibility(8);
        this.I.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.I.setOnClickListener(new o0(this, 14));
        ra.a(this.I);
        this.actionBar.addView(this.I, ma.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        m5 m5Var = new m5(this, context);
        this.w = m5Var;
        this.s.addView(m5Var, ma.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.E = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
        this.E.setProgressColor(-1);
        this.E.setNoProgress(false);
        this.s.addView(this.E, ma.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        f0(false, false);
        e51 e51Var = new e51(this, new j(this, i7), new k(this), new k(this));
        this.e = e51Var;
        e51Var.setClipToPadding(false);
        e51 e51Var2 = this.e;
        z41 z41Var = e51Var2.g3;
        z41Var.r = false;
        z41Var.s = true;
        e51Var2.r1();
        this.actionBar.setBackground(null);
        this.d.addView(this.e, ma.c(-1.0f, -1));
        this.d.addView(this.actionBar, ma.e(-1, -2, 48));
        d1 d1Var2 = this.d;
        k kVar = new k(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(d1Var2, kVar);
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

    @Override // org.telegram.ui.ActionBar.h2
    public final void dismissCurrentDialog() {
        if (this.G.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.G.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final void e0(boolean z10) {
        if (this.n == z10) {
            return;
        }
        org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) this.e.B1(ks.h2);
        if (i6Var != null) {
            i6Var.a(!z10);
        }
        org.telegram.ui.Cells.i6 i6Var2 = (org.telegram.ui.Cells.i6) this.e.B1(ks.g2);
        if (i6Var2 != null) {
            i6Var2.a(z10);
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.w, (Property<m5, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.E;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.w, (Property<m5, Float>) property2, 0.0f));
        }
        this.y.setDuration(180L);
        this.y.addListener(new d7(17, this, z10));
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

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.G.h(i7, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.h2
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

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, ks.T);
        u30 u30Var = this.G;
        if (u30Var != null) {
            u30Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onPause() {
        super.onPause();
        this.G.i();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        this.G.j(i7, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onResume() {
        super.onResume();
        this.G.k();
    }

    @Override // org.telegram.ui.ActionBar.h2
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

    @Override // org.telegram.ui.ActionBar.h2
    public final void restoreSelfArgs(Bundle bundle) {
        u30 u30Var = this.G;
        if (u30Var != null) {
            u30Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        u30 u30Var = this.G;
        if (u30Var != null && (str = u30Var.f) != null) {
            bundle.putString("path", str);
        }
        a3 a3Var = this.r;
        if (a3Var != null) {
            String obj = ((di.q) a3Var.b).getText().toString();
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
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
