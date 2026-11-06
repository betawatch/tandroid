package ii;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import bi.e5;
import bi.s1;
import c8.ha;
import c8.ka;
import fi.d1;
import fi.p5;
import java.util.WeakHashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;
import org.telegram.ui.oq;
import org.telegram.ui.wq0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class p extends f2 implements i30, ls, te.b {
    public RadialProgressView D;
    public w8 E;
    public j30 F;
    public TLRPC.FileLocation G;
    public ei.k H;
    public TLRPC.Chat I;
    public TLRPC.ChatFull J;
    public final u1[] K;
    public final n L;
    public ri.c a;
    public final te.a b;
    public long c;
    public s1 d;
    public q41 e;
    public String f;
    public boolean h;
    public boolean n;
    public e5 r;
    public o s;
    public p5 w;
    public l9 x;
    public AnimatorSet y;

    public p(Bundle bundle) {
        super(bundle);
        this.b = new te.a(0, this, xq.h, 320L, false);
        this.K = new u1[1];
        this.L = new n(this);
    }

    public static boolean Z(p pVar, x31 x31Var, View view) {
        long j3;
        boolean t6;
        boolean z9;
        boolean z10;
        Object obj = x31Var.G;
        int i7 = 1;
        if (!(obj instanceof TLRPC.Chat)) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j3 = user.id;
                t6 = t10.t(user);
                TLRPC.Chat chat = pVar.I;
                z9 = chat != null && ((user.bot && user.bot_can_edit) || t3.y(27, chat));
                z10 = false;
            }
            return false;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
        j3 = -chat2.id;
        boolean V = t3.V(chat2);
        TLRPC.Chat chat3 = pVar.I;
        z9 = chat3 != null && (chat2.creator || t3.y(27, chat3));
        z10 = V;
        t6 = false;
        boolean z11 = z9;
        int b10 = m0.b(pVar.currentAccount, j3);
        boolean z12 = b10 == 1 || b10 == 2;
        if (z11 || z12) {
            k60 F = k60.F(pVar.d, null, view);
            F.l(R.drawable.msg_viewintopic, hd.M0(t6 ? 2131751910 : z10 ? 2131751909 : 2131751908, null), new h(pVar, j3, i7), z12);
            F.m(R.drawable.msg_cancel, new m(pVar, t6, z10, j3, 0), hd.M0(2131751915, null), z11, true);
            F.W(pVar.e.U0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void a0(p pVar, x31 x31Var) {
        TLRPC.Chat M0;
        TLRPC.ChatPhoto chatPhoto;
        int i7 = x31Var.d;
        if (i7 == 140) {
            if (pVar.F.g() || (chatPhoto = (M0 = pVar.getMessagesController().M0(Long.valueOf(pVar.c))).photo) == null || chatPhoto.photo_big == null) {
                return;
            }
            hc hcVar = null;
            PhotoViewer.p1().H2(null, pVar, null);
            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
            int i10 = chatPhoto2.dc_id;
            if (i10 != 0) {
                chatPhoto2.photo_big.dc_id = i10;
            }
            TLRPC.ChatFull chatFull = pVar.J;
            if (chatFull != null) {
                TLRPC.Photo photo = chatFull.chat_photo;
                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                    hcVar = hc.j(pVar.J.chat_photo.video_sizes.get(0), pVar.J.chat_photo);
                }
            }
            PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pVar.L, null, 0L, 0L, 0L, true, null, null);
            return;
        }
        if (i7 == 141) {
            pVar.F.n(pVar.G != null, new i(pVar, 0), new d1(6), 0);
            return;
        }
        if (i7 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", pVar.c);
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            oq oqVar = new oq(bundle);
            oqVar.C0(pVar.J);
            pVar.presentFragment(oqVar);
            return;
        }
        if (i7 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", pVar.c);
            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            oq oqVar2 = new oq(bundle2);
            oqVar2.C0(pVar.J);
            pVar.presentFragment(oqVar2);
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
            v4.r(pVar, false, pVar.I, null, false, true, true, false, new k(pVar));
            return;
        }
        if (i7 == 146) {
            m0.e(pVar.K, pVar, pVar.currentAccount, pVar.I);
            return;
        }
        Object obj = x31Var.G;
        if (obj instanceof TLRPC.Chat) {
            pVar.presentFragment(an.ra(-((TLRPC.Chat) obj).id));
        } else if (obj instanceof TLRPC.User) {
            pVar.presentFragment(an.ra(((TLRPC.User) obj).id));
        }
    }

    public static /* synthetic */ void b0(p pVar) {
        pVar.G = null;
        qp.s1(pVar.currentAccount).B(pVar.c, null, null, null, null, 0.0d, null, null, null, null);
        pVar.f0(false, true);
        pVar.x.j(null, null, pVar.E, pVar.I);
    }

    public static void c0(p pVar, long j3) {
        qp.s1(pVar.currentAccount).Q2(j3, pVar.c, true, false, new j(pVar, 0));
    }

    @Override // org.telegram.ui.Components.i30
    public final void H(float f10) {
        RadialProgressView radialProgressView = this.D;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.i30
    public final void O(boolean z9, boolean z10) {
        RadialProgressView radialProgressView = this.D;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.i30
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new l(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        this.H.setAlpha(f10);
        this.H.setScaleX(org.telegram.messenger.g0.T1(0.75f, 1.0f, f10));
        this.H.setScaleY(org.telegram.messenger.g0.T1(0.75f, 1.0f, f10));
        this.H.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        Object[] objArr = 0;
        this.actionBar.setBackButtonDrawable(new y1(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = 6;
        this.actionBar.setActionBarMenuOnItemClick(new bi.s(this, i10));
        ri.c cVar = new ri.c();
        this.a = cVar;
        cVar.a(getThemedColor(k6.d6));
        this.actionBar.M(new dh.c(cVar, cVar, cVar), c8.g0.p(this.resourceProvider), false);
        this.actionBar.Q0 = true;
        s1 s1Var = new s1(this, context);
        this.d = s1Var;
        r6.i(k6.a7, s1Var, null);
        this.E = new w8(this.I);
        o oVar = new o(context);
        this.s = oVar;
        oVar.a.e(this.I, this.E);
        this.x = this.s.a;
        String m10 = m5.m(this.I);
        this.f = m10;
        f6 f6Var = this.resourceProvider;
        e5 e5Var = new e5(i10, context, false);
        bi.v vVar = new bi.v(context, 2);
        e5Var.b = vVar;
        r6.V(vVar, k6.G6, f6Var);
        r6.H(vVar, k6.Uc, f6Var);
        r6.E(vVar, k6.H6, f6Var);
        vVar.setTextSize(1, 16.0f);
        vVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        vVar.setBackground(null);
        vVar.setImeOptions(vVar.getImeOptions() | TLObject.FLAG_28);
        vVar.setInputType(vVar.getInputType() | TLObject.FLAG_14);
        vVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
        vVar.setMinHeight(org.telegram.messenger.g0.L(50.0f));
        e5Var.addView(vVar, ha.d(-1, -2.0f, (hd.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.r = e5Var;
        vVar.setText(m10);
        ((bi.v) this.r.b).setSelection(m10.length());
        ((bi.v) this.r.b).addTextChangedListener(new ah.j(this, 7));
        ei.k kVar = new ei.k(this, context);
        this.H = kVar;
        r6.V(kVar, k6.Gi, getResourceProvider());
        this.H.setText(hd.M0(2131745947, null));
        this.H.setTypeface(org.telegram.messenger.g0.o());
        this.H.setTextSize(1, 14.0f);
        this.H.setGravity(17);
        this.H.setVisibility(8);
        this.H.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.H.setOnClickListener(new g(this, objArr == true ? 1 : 0));
        ka.a(this.H);
        this.actionBar.addView(this.H, ha.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        p5 p5Var = new p5(this, context);
        this.w = p5Var;
        this.s.addView(p5Var, ha.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.D = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
        this.D.setProgressColor(-1);
        this.D.setNoProgress(false);
        this.s.addView(this.D, ha.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        f0(false, false);
        q41 q41Var = new q41(this, new j(this, i7), new k(this), new k(this));
        this.e = q41Var;
        q41Var.setClipToPadding(false);
        q41 q41Var2 = this.e;
        l41 l41Var = q41Var2.f3;
        l41Var.r = false;
        l41Var.s = true;
        q41Var2.r1();
        this.actionBar.setBackground(null);
        this.d.addView(this.e, ha.c(-1.0f, -1));
        this.d.addView(this.actionBar, ha.e(-1, -2, 48));
        s1 s1Var2 = this.d;
        k kVar2 = new k(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(s1Var2, kVar2);
        s1 s1Var3 = this.d;
        this.fragmentView = s1Var3;
        return s1Var3;
    }

    public final void d0() {
        this.b.a((this.h == this.n && TextUtils.equals(((bi.v) this.r.b).getText().toString(), this.f)) ? false : true, true);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.c) {
                this.J = chatFull;
                this.e.f3.O(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void dismissCurrentDialog() {
        if (this.F.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.F.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final void e0(boolean z9) {
        if (this.n == z9) {
            return;
        }
        h6 h6Var = (h6) this.e.B1(qs.h2);
        if (h6Var != null) {
            h6Var.a(!z9);
        }
        h6 h6Var2 = (h6) this.e.B1(qs.g2);
        if (h6Var2 != null) {
            h6Var2.a(z9);
        }
        this.n = z9;
        d0();
    }

    public final void f0(boolean z9, boolean z10) {
        if (this.D == null) {
            return;
        }
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.y = null;
        }
        if (!z10) {
            if (z9) {
                this.D.setAlpha(1.0f);
                this.D.setVisibility(0);
                this.w.setAlpha(1.0f);
                this.w.setVisibility(0);
                return;
            }
            this.D.setAlpha(0.0f);
            this.D.setVisibility(4);
            this.w.setAlpha(0.0f);
            this.w.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.y = animatorSet2;
        if (z9) {
            this.D.setVisibility(0);
            this.w.setVisibility(0);
            AnimatorSet animatorSet3 = this.y;
            RadialProgressView radialProgressView = this.D;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.w, (Property<p5, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.D;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.w, (Property<p5, Float>) property2, 0.0f));
        }
        this.y.setDuration(180L);
        this.y.addListener(new ch.y(15, this, z9));
        this.y.start();
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.i30
    public final String getInitialSearchString() {
        return ((bi.v) this.r.b).getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.F.h(i7, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.c = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.c));
        this.I = M0;
        boolean z9 = M0 != null && ((tL_chatBannedRights = M0.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers);
        this.h = z9;
        this.n = z9;
        this.J = getMessagesController().N0(this.c);
        j30 j30Var = new j30(3, true, true);
        this.F = j30Var;
        j30Var.a = this;
        j30Var.b = this;
        getNotificationCenter().c(this, qs.T);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, qs.T);
        j30 j30Var = this.F;
        if (j30Var != null) {
            j30Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        this.F.i();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        this.F.j(i7, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        this.F.k();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ri.c cVar = this.a;
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

    @Override // org.telegram.ui.ActionBar.f2
    public final void restoreSelfArgs(Bundle bundle) {
        j30 j30Var = this.F;
        if (j30Var != null) {
            j30Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        j30 j30Var = this.F;
        if (j30Var != null && (str = j30Var.f) != null) {
            bundle.putString("path", str);
        }
        e5 e5Var = this.r;
        if (e5Var != null) {
            String obj = ((bi.v) e5Var.b).getText().toString();
            if (obj.isEmpty()) {
                return;
            }
            bundle.putString("nameTextView", obj);
        }
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ void T() {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
