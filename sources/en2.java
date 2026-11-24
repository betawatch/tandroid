// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class en2 extends d implements vl5, gk7, x74 {
    public RadialProgressView E;
    public pb0 F;
    public wl5 G;
    public TLRPC.FileLocation H;
    public t8 I;
    public TLRPC.Chat J;
    public TLRPC.ChatFull K;
    public final hd[] L;
    public final cn2 M;
    public ix4 a;
    public final fm0 b;
    public long c;
    public eb0 d;
    public q5c e;
    public String f;
    public boolean h;
    public boolean n;
    public yc r;
    public dn2 s;
    public s71 w;
    public be0 x;
    public AnimatorSet y;

    public en2(Bundle bundle) {
        super(bundle);
        this.b = new fm0(0, this, s33.h, 320L, false);
        this.L = new hd[1];
        this.M = new cn2(this);
    }

    @Override // vl5
    public final void H(float f) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    @Override // vl5
    public final void O(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // vl5
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gl.c3(new ph1(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    public final void Y() {
        this.b.a((this.h == this.n && TextUtils.equals(((ps0) this.r.b).getText().toString(), this.f)) ? false : true, true);
    }

    public final void Z(long j) {
        na7.q1(this.currentAccount).T2(j, this.c, true, false, new an2(this, (byte) 0));
    }

    public final /* synthetic */ void a0() {
        this.H = null;
        na7.q1(this.currentAccount).x(this.c, null, null, null, null, 0.0d, null, null, null, null);
        e0(false, true);
        this.x.m(null, null, this.F, this.J);
    }

    public final void b0(c4c c4cVar) {
        TLRPC.Chat K0;
        TLRPC.ChatPhoto chatPhoto;
        int i = c4cVar.d;
        byte b = 0;
        if (i == 140) {
            if (this.G.g() || (chatPhoto = (K0 = getMessagesController().K0(Long.valueOf(this.c))).photo) == null || chatPhoto.photo_big == null) {
                return;
            }
            gl5 gl5Var = null;
            PhotoViewer.r0().T1(null, this, null);
            TLRPC.ChatPhoto chatPhoto2 = K0.photo;
            int i2 = chatPhoto2.dc_id;
            if (i2 != 0) {
                chatPhoto2.photo_big.dc_id = i2;
            }
            TLRPC.ChatFull chatFull = this.K;
            if (chatFull != null) {
                TLRPC.Photo photo = chatFull.chat_photo;
                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                    gl5Var = gl5.j(this.K.chat_photo.video_sizes.get(0), this.K.chat_photo);
                }
            }
            PhotoViewer.r0().n1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, this.M, null, 0L, 0L, 0L, true, null, null);
            return;
        }
        if (i == 141) {
            this.G.n(this.H != null, new zm2(this, b), new g5((byte) 6), 0);
            return;
        }
        if (i == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.c);
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            kf2 kf2Var = new kf2(bundle);
            kf2Var.A0(this.K);
            presentFragment(kf2Var);
            return;
        }
        if (i == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", this.c);
            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            kf2 kf2Var2 = new kf2(bundle2);
            kf2Var2.A0(this.K);
            presentFragment(kf2Var2);
            return;
        }
        if (i == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", this.c);
            presentFragment(new pn2(bundle3));
            return;
        }
        if (i == 150) {
            d0(true);
            return;
        }
        if (i == 151) {
            d0(false);
            return;
        }
        if (i == 145) {
            ij.r(this, false, this.J, null, false, true, true, false, new bn2(this));
            return;
        }
        if (i == 146) {
            no2.e(this.L, this, this.currentAccount, this.J);
            return;
        }
        Object obj = c4cVar.H;
        if (obj instanceof TLRPC.Chat) {
            presentFragment(mu1.W9(-((TLRPC.Chat) obj).id));
        } else if (obj instanceof TLRPC.User) {
            presentFragment(mu1.W9(((TLRPC.User) obj).id));
        }
    }

    @Override // vl5
    public final boolean c() {
        return true;
    }

    public final boolean c0(c4c c4cVar, View view) {
        long j;
        boolean v;
        boolean z;
        boolean z2;
        Object obj = c4cVar.H;
        byte b = 1;
        if (!(obj instanceof TLRPC.Chat)) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j = user.id;
                v = l7c.v(user);
                TLRPC.Chat chat = this.J;
                z = chat != null && ((user.bot && user.bot_can_edit) || hc2.y(27, chat));
                z2 = false;
            }
            return false;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
        j = -chat2.id;
        boolean V = hc2.V(chat2);
        TLRPC.Chat chat3 = this.J;
        z = chat3 != null && (chat2.creator || hc2.y(27, chat3));
        z2 = V;
        v = false;
        boolean z3 = z;
        int b2 = no2.b(this.currentAccount, j);
        boolean z4 = b2 == 1 || b2 == 2;
        if (z3 || z4) {
            cs5 G = cs5.G(this.d, null, view);
            G.k(R.drawable.msg_viewintopic, k96.M0(v ? 2131751898 : z2 ? 2131751897 : 2131751896, null), new ym2(this, j, b), z4);
            G.l(R.drawable.msg_cancel, new mo1(this, v, z2, j, (byte) 1), k96.M0(2131751903, null), z3, true);
            G.X(this.e.V0(view, true));
            G.a0();
            return true;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 1;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonDrawable(new ed0(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new vm2(this, b));
        ix4 ix4Var = new ix4();
        this.a = ix4Var;
        ix4Var.a(getThemedColor(bkb.c6));
        this.actionBar.P(new kl0(ix4Var, ix4Var, ix4Var), nod.o(this.resourceProvider), false);
        this.actionBar.R0 = true;
        eb0 eb0Var = new eb0(this, context);
        this.d = eb0Var;
        zkb.h(bkb.Z6, null, eb0Var);
        this.F = new pb0(this.J);
        dn2 dn2Var = new dn2(context);
        this.s = dn2Var;
        dn2Var.a.f(this.J, this.F);
        this.x = this.s.a;
        String l = cf3.l(this.J);
        this.f = l;
        wjb wjbVar = this.resourceProvider;
        byte b2 = 15;
        yc ycVar = new yc(context, b2);
        ps0 ps0Var = new ps0(context, (byte) 2);
        ycVar.b = ps0Var;
        zkb.X(ps0Var, bkb.F6, wjbVar);
        zkb.G(ps0Var, bkb.Wc, wjbVar);
        zkb.D(ps0Var, bkb.G6, wjbVar);
        ps0Var.setTextSize(1, 16.0f);
        ps0Var.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        ps0Var.setBackground(null);
        ps0Var.setImeOptions(ps0Var.getImeOptions() | TLObject.FLAG_28);
        ps0Var.setInputType(ps0Var.getInputType() | TLObject.FLAG_14);
        ps0Var.setPadding(gl.L(4.0f), gl.L(10.0f), gl.L(4.0f), gl.L(11.0f));
        ps0Var.setMinHeight(gl.L(50.0f));
        ycVar.addView(ps0Var, nme.d(-1, -2.0f, (k96.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.r = ycVar;
        ps0Var.setText(l);
        ((ps0) this.r.b).setSelection(l.length());
        ((ps0) this.r.b).addTextChangedListener(new b7(this, b2));
        t8 t8Var = new t8(this, context);
        this.I = t8Var;
        zkb.X(t8Var, bkb.Ii, getResourceProvider());
        this.I.setText(k96.M0(2131745754, null));
        this.I.setTypeface(gl.o());
        this.I.setTextSize(1, 14.0f);
        this.I.setGravity(17);
        this.I.setVisibility(8);
        this.I.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        this.I.setOnClickListener(new x91(this, b2));
        ote.a(this.I);
        this.actionBar.addView(this.I, nme.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        s71 s71Var = new s71(this, context);
        this.w = s71Var;
        this.s.addView(s71Var, nme.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.E = radialProgressView;
        radialProgressView.setSize(gl.L(30.0f));
        this.E.setProgressColor(-1);
        this.E.setNoProgress(false);
        this.s.addView(this.E, nme.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        e0(false, false);
        q5c q5cVar = new q5c(this, new an2(this, b), new bn2(this), new bn2(this));
        this.e = q5cVar;
        q5cVar.setClipToPadding(false);
        q5c q5cVar2 = this.e;
        l5c l5cVar = q5cVar2.g3;
        l5cVar.r = false;
        l5cVar.s = true;
        q5cVar2.r1();
        this.actionBar.setBackground(null);
        this.d.addView(this.e, nme.c(-1.0f, -1));
        this.d.addView(this.actionBar, nme.e(-1, -2, 48));
        eb0 eb0Var2 = this.d;
        bn2 bn2Var = new bn2(this);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(eb0Var2, bn2Var);
        eb0 eb0Var3 = this.d;
        this.fragmentView = eb0Var3;
        return eb0Var3;
    }

    public final void d0(boolean z) {
        if (this.n == z) {
            return;
        }
        uy8 uy8Var = (uy8) this.e.B1(kk7.g2);
        if (uy8Var != null) {
            uy8Var.a(!z);
        }
        uy8 uy8Var2 = (uy8) this.e.B1(kk7.f2);
        if (uy8Var2 != null) {
            uy8Var2.a(z);
        }
        this.n = z;
        Y();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.S) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.c) {
                this.K = chatFull;
                this.e.g3.O(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void dismissCurrentDialog() {
        if (this.G.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.G.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0(boolean z, boolean z2) {
        if (this.E == null) {
            return;
        }
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.y = null;
        }
        if (!z2) {
            RadialProgressView radialProgressView = this.E;
            if (z) {
                radialProgressView.setAlpha(1.0f);
                this.E.setVisibility(0);
                this.w.setAlpha(1.0f);
                this.w.setVisibility(0);
                return;
            }
            radialProgressView.setAlpha(0.0f);
            this.E.setVisibility(4);
            this.w.setAlpha(0.0f);
            this.w.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.y = animatorSet2;
        RadialProgressView radialProgressView2 = this.E;
        if (z) {
            radialProgressView2.setVisibility(0);
            this.w.setVisibility(0);
            AnimatorSet animatorSet3 = this.y;
            RadialProgressView radialProgressView3 = this.E;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView3, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.w, (Property<s71, Float>) property, 1.0f));
        } else {
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.w, (Property<s71, Float>) property2, 0.0f));
        }
        this.y.setDuration(180L);
        this.y.addListener(new y7((byte) 23, (Object) this, z));
        this.y.start();
    }

    @Override // vl5
    public final p98 getCloseIntoObject() {
        return null;
    }

    @Override // vl5
    public final String getInitialSearchString() {
        return ((ps0) this.r.b).getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.G.h(i, i2, intent);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.c = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.c));
        this.J = K0;
        boolean z = K0 != null && ((tL_chatBannedRights = K0.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers);
        this.h = z;
        this.n = z;
        this.K = getMessagesController().L0(this.c);
        wl5 wl5Var = new wl5(3, true, true);
        this.G = wl5Var;
        wl5Var.a = this;
        wl5Var.b = this;
        getNotificationCenter().b(this, kk7.S);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.S);
        wl5 wl5Var = this.G;
        if (wl5Var != null) {
            wl5Var.c();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        this.G.i();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.G.j(i, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        this.G.k();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ix4 ix4Var = this.a;
            if (ix4Var != null) {
                ix4Var.a(getThemedColor(bkb.c6));
            }
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        this.I.setAlpha(f);
        this.I.setScaleX(gl.R1(0.75f, 1.0f, f));
        this.I.setScaleY(gl.R1(0.75f, 1.0f, f));
        this.I.setVisibility(f > 0.0f ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void restoreSelfArgs(Bundle bundle) {
        wl5 wl5Var = this.G;
        if (wl5Var != null) {
            wl5Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        wl5 wl5Var = this.G;
        if (wl5Var != null && (str = wl5Var.f) != null) {
            bundle.putString("path", str);
        }
        yc ycVar = this.r;
        if (ycVar != null) {
            String obj = ((ps0) ycVar.b).getText().toString();
            if (obj.isEmpty()) {
                return;
            }
            bundle.putString("nameTextView", obj);
        }
    }

    @Override // vl5
    public final boolean x() {
        return false;
    }

    @Override // vl5
    public final void T() {
    }

    @Override // x74
    public final void F(float f, int i) {
    }
}
