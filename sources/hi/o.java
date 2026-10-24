package hi;

import ai.w1;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import ei.e1;
import ei.g6;
import i2.o1;
import java.util.WeakHashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.jr;
import org.telegram.ui.mu0;
import org.telegram.ui.sn;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class o extends o2 implements d50, NotificationCenter.NotificationCenterDelegate, ne.d {
    public h9 E;
    public e50 F;
    public TLRPC.FileLocation G;
    public di.n H;
    public TLRPC.Chat I;
    public TLRPC.ChatFull J;
    public final c2[] K;
    public final m L;
    public gh.c a;
    public final ne.b b;
    public long c;
    public w1 d;
    public j71 e;
    public String f;
    public boolean h;
    public boolean n;
    public ah.x r;
    public n s;
    public g6 v;
    public w9 w;
    public AnimatorSet x;
    public RadialProgressView y;

    public o(Bundle bundle) {
        super(bundle);
        this.b = new ne.b(0, this, bs.h, 320L, false);
        this.K = new c2[1];
        this.L = new m(this);
    }

    public static boolean U(o oVar, m61 m61Var, View view) {
        long j10;
        boolean canRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        Object obj = m61Var.G;
        if (!(obj instanceof TLRPC.Chat)) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, oVar.I);
                z10 = isBot;
                z11 = false;
            }
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        j10 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, oVar.I);
        z11 = isChannelAndNotMegaGroup;
        z10 = false;
        boolean z12 = canRemoveBotFromCommunity;
        long j11 = j10;
        int b10 = t0.b(oVar.currentAccount, j11);
        boolean z13 = b10 == 1 || b10 == 2;
        if (z12 || z13) {
            j80 F = j80.F(oVar.d, null, view);
            F.l(R.drawable.msg_viewintopic, LocaleController.getString(z10 ? R.string.CommunityMenuViewBot : z11 ? R.string.CommunityMenuViewChannel : R.string.CommunityMenuViewGroup), new g(oVar, j11, 1), z13);
            F.m(z12, R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new l(oVar, z10, z11, j11, 0));
            F.W(oVar.e.W0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void V(o oVar, m61 m61Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = m61Var.d;
        if (i10 == 140) {
            if (oVar.F.g() || (chatPhoto = (chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.c))).photo) == null || chatPhoto.photo_big == null) {
                return;
            }
            ImageLocation imageLocation = null;
            PhotoViewer.u1().M2(null, oVar, null);
            TLRPC.ChatPhoto chatPhoto2 = chat.photo;
            int i11 = chatPhoto2.dc_id;
            if (i11 != 0) {
                chatPhoto2.photo_big.dc_id = i11;
            }
            TLRPC.ChatFull chatFull = oVar.J;
            if (chatFull != null) {
                TLRPC.Photo photo = chatFull.chat_photo;
                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                    imageLocation = ImageLocation.getForPhoto(oVar.J.chat_photo.video_sizes.get(0), oVar.J.chat_photo);
                }
            }
            PhotoViewer.u1().g2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, oVar.L, null, 0L, 0L, 0L, true, null, null);
            return;
        }
        if (i10 == 141) {
            oVar.F.n(oVar.G != null, new h(oVar, 0), new e1(6), 0);
            return;
        }
        if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", oVar.c);
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            jr jrVar = new jr(bundle);
            jrVar.x0(oVar.J);
            oVar.presentFragment(jrVar);
            return;
        }
        if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", oVar.c);
            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            jr jrVar2 = new jr(bundle2);
            jrVar2.x0(oVar.J);
            oVar.presentFragment(jrVar2);
            return;
        }
        if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", oVar.c);
            oVar.presentFragment(new r(bundle3));
            return;
        }
        if (i10 == 150) {
            oVar.Z(true);
            return;
        }
        if (i10 == 151) {
            oVar.Z(false);
            return;
        }
        if (i10 == 145) {
            f5.s(oVar, false, oVar.I, null, false, true, true, false, new j(oVar));
            return;
        }
        if (i10 == 146) {
            t0.e(oVar.K, oVar, oVar.currentAccount, oVar.I);
            return;
        }
        Object obj = m61Var.G;
        if (obj instanceof TLRPC.Chat) {
            oVar.presentFragment(sn.W9(-((TLRPC.Chat) obj).id));
        } else if (obj instanceof TLRPC.User) {
            oVar.presentFragment(sn.W9(((TLRPC.User) obj).id));
        }
    }

    public static /* synthetic */ void W(o oVar) {
        oVar.G = null;
        MessagesController.getInstance(oVar.currentAccount).changeChatAvatar(oVar.c, null, null, null, null, 0.0d, null, null, null, null);
        oVar.a0(false, true);
        oVar.w.h(null, null, oVar.E, oVar.I);
    }

    @Override // org.telegram.ui.Components.d50
    public final void E(float f7) {
        RadialProgressView radialProgressView = this.y;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.d50
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.y;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.d50
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new k(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    public final void Y() {
        this.b.a((this.h == this.n && TextUtils.equals(((ai.t) this.r.b).getText().toString(), this.f)) ? false : true, true);
    }

    public final void Z(boolean z10) {
        if (this.n == z10) {
            return;
        }
        j6 j6Var = (j6) this.e.E1(151);
        if (j6Var != null) {
            j6Var.a(!z10);
        }
        j6 j6Var2 = (j6) this.e.E1(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        if (j6Var2 != null) {
            j6Var2.a(z10);
        }
        this.n = z10;
        Y();
    }

    public final void a0(boolean z10, boolean z11) {
        if (this.y == null) {
            return;
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
        }
        if (!z11) {
            if (z10) {
                this.y.setAlpha(1.0f);
                this.y.setVisibility(0);
                this.v.setAlpha(1.0f);
                this.v.setVisibility(0);
                return;
            }
            this.y.setAlpha(0.0f);
            this.y.setVisibility(4);
            this.v.setAlpha(0.0f);
            this.v.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x = animatorSet2;
        if (z10) {
            this.y.setVisibility(0);
            this.v.setVisibility(0);
            AnimatorSet animatorSet3 = this.x;
            RadialProgressView radialProgressView = this.y;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<g6, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.y;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.v, (Property<g6, Float>) property2, 0.0f));
        }
        this.x.setDuration(180L);
        this.x.addListener(new ah.p0(17, this, z10));
        this.x.start();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        o1.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = 6;
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, i11));
        gh.c cVar = new gh.c();
        this.a = cVar;
        cVar.a(getThemedColor(k6.d6));
        this.actionBar.L(new bh.b(cVar), fh.c.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        w1 w1Var = new w1(this, context);
        this.d = w1Var;
        r6.i(k6.a7, w1Var, null);
        this.E = new h9(this.I);
        n nVar = new n(context);
        this.s = nVar;
        nVar.a.e(this.I, this.E);
        this.w = this.s.a;
        String name = DialogObject.getName(this.I);
        this.f = name;
        org.telegram.ui.ActionBar.g6 g6Var = this.resourceProvider;
        ah.x xVar = new ah.x(context, i11);
        ai.t tVar = new ai.t(context, i10);
        xVar.b = tVar;
        r6.W(tVar, k6.G6, g6Var);
        r6.I(tVar, k6.gc, g6Var);
        r6.F(tVar, k6.H6, g6Var);
        tVar.setTextSize(1, 16.0f);
        tVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        tVar.setBackground(null);
        tVar.setImeOptions(tVar.getImeOptions() | TLObject.FLAG_28);
        tVar.setInputType(tVar.getInputType() | 16384);
        tVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        tVar.setMinHeight(AndroidUtilities.dp(50.0f));
        xVar.addView(tVar, z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.r = xVar;
        tVar.setText(name);
        ((ai.t) this.r.b).setSelection(name.length());
        int i12 = 2;
        ((ai.t) this.r.b).addTextChangedListener(new ai.u(this, i12));
        di.n nVar2 = new di.n(this, context);
        this.H = nVar2;
        r6.W(nVar2, k6.Sh, getResourceProvider());
        this.H.setText(LocaleController.getString(R.string.Save));
        this.H.setTypeface(AndroidUtilities.bold());
        this.H.setTextSize(1, 14.0f);
        this.H.setGravity(17);
        this.H.setVisibility(8);
        this.H.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.H.setOnClickListener(new hg.r0(this, i12));
        b6.a(this.H);
        this.actionBar.addView(this.H, z5.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        g6 g6Var2 = new g6(this, context);
        this.v = g6Var2;
        this.s.addView(g6Var2, z5.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.y = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.y.setProgressColor(-1);
        this.y.setNoProgress(false);
        this.s.addView(this.y, z5.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        a0(false, false);
        j71 j71Var = new j71(this, new i(this, i10), new j(this), new j(this));
        this.e = j71Var;
        j71Var.setClipToPadding(false);
        j71 j71Var2 = this.e;
        b71 b71Var = j71Var2.Z2;
        b71Var.r = false;
        b71Var.s = true;
        j71Var2.t1();
        this.actionBar.setBackground(null);
        this.d.addView(this.e, z5.c(-1.0f, -1));
        this.d.addView(this.actionBar, z5.e(-1, -2, 48));
        w1 w1Var2 = this.d;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(w1Var2, jVar);
        w1 w1Var3 = this.d;
        this.fragmentView = w1Var3;
        return w1Var3;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.c) {
                this.J = chatFull;
                this.e.Z2.N(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void dismissCurrentDialog() {
        if (this.F.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.F.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ mu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public final String getInitialSearchString() {
        return ((ai.t) this.r.b).getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        this.H.setAlpha(f7);
        this.H.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        this.H.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        this.H.setVisibility(f7 > 0.0f ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.F.h(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.c = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.c));
        this.I = chat;
        boolean z10 = chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers);
        this.h = z10;
        this.n = z10;
        this.J = getMessagesController().getChatFull(this.c);
        e50 e50Var = new e50(3, true, true);
        this.F = e50Var;
        e50Var.a = this;
        e50Var.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        e50 e50Var = this.F;
        if (e50Var != null) {
            e50Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        this.F.i();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.F.j(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        this.F.k();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            gh.c cVar = this.a;
            if (cVar != null) {
                cVar.a(getThemedColor(k6.d6));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void restoreSelfArgs(Bundle bundle) {
        e50 e50Var = this.F;
        if (e50Var != null) {
            e50Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        e50 e50Var = this.F;
        if (e50Var != null && (str = e50Var.f) != null) {
            bundle.putString("path", str);
        }
        ah.x xVar = this.r;
        if (xVar != null) {
            String obj = ((ai.t) xVar.b).getText().toString();
            if (obj.isEmpty()) {
                return;
            }
            bundle.putString("nameTextView", obj);
        }
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ void P() {
    }

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }
}
