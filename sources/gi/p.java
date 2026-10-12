package gi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import bi.i7;
import di.e1;
import di.h2;
import di.p6;
import java.util.WeakHashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.h50;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.i50;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.z9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fo;
import org.telegram.ui.kv0;
import org.telegram.ui.yr;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class p extends m2 implements h50, NotificationCenter.NotificationCenterDelegate, ne.d {
    public i50 E;
    public TLRPC.FileLocation F;
    public ci.n G;
    public TLRPC.Chat H;
    public TLRPC.ChatFull I;
    public final a2[] J;
    public final m K;
    public final ne.b a;
    public long b;
    public i7 c;
    public h71 d;
    public String e;
    public boolean f;
    public boolean h;
    public ah.x n;
    public n r;
    public p6 s;
    public z9 v;
    public AnimatorSet w;
    public RadialProgressView x;
    public k9 y;

    public p(Bundle bundle) {
        super(bundle);
        this.a = new ne.b(0, this, es.h, 320L, false);
        this.J = new a2[1];
        this.K = new m(this);
    }

    public static boolean U(p pVar, l61 l61Var, View view) {
        long j10;
        boolean canRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        Object obj = l61Var.G;
        if (!(obj instanceof TLRPC.Chat)) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, pVar.H);
                z10 = isBot;
                z11 = false;
            }
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        j10 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, pVar.H);
        z11 = isChannelAndNotMegaGroup;
        z10 = false;
        boolean z12 = canRemoveBotFromCommunity;
        long j11 = j10;
        int b10 = u0.b(pVar.currentAccount, j11);
        boolean z13 = b10 == 1 || b10 == 2;
        if (z12 || z13) {
            m80 F = m80.F(pVar.c, null, view);
            F.l(R.drawable.msg_viewintopic, LocaleController.getString(z10 ? R.string.CommunityMenuViewBot : z11 ? R.string.CommunityMenuViewChannel : R.string.CommunityMenuViewGroup), new g(pVar, j11, 1), z13);
            F.m(z12, R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new l(pVar, z10, z11, j11, 0));
            F.W(pVar.d.V0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void V(p pVar, l61 l61Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = l61Var.d;
        if (i10 == 140) {
            if (pVar.E.g() || (chatPhoto = (chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.b))).photo) == null || chatPhoto.photo_big == null) {
                return;
            }
            ImageLocation imageLocation = null;
            PhotoViewer.t1().K2(null, pVar, null);
            TLRPC.ChatPhoto chatPhoto2 = chat.photo;
            int i11 = chatPhoto2.dc_id;
            if (i11 != 0) {
                chatPhoto2.photo_big.dc_id = i11;
            }
            TLRPC.ChatFull chatFull = pVar.I;
            if (chatFull != null) {
                TLRPC.Photo photo = chatFull.chat_photo;
                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                    imageLocation = ImageLocation.getForPhoto(pVar.I.chat_photo.video_sizes.get(0), pVar.I.chat_photo);
                }
            }
            PhotoViewer.t1().f2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, pVar.K, null, 0L, 0L, 0L, true, null, null);
            return;
        }
        if (i10 == 141) {
            pVar.E.n(pVar.F != null, new h(pVar, 0), new e1(6), 0);
            return;
        }
        if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", pVar.b);
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            yr yrVar = new yr(bundle);
            yrVar.x0(pVar.I);
            pVar.presentFragment(yrVar);
            return;
        }
        if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", pVar.b);
            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            yr yrVar2 = new yr(bundle2);
            yrVar2.x0(pVar.I);
            pVar.presentFragment(yrVar2);
            return;
        }
        if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", pVar.b);
            pVar.presentFragment(new s(bundle3));
            return;
        }
        if (i10 == 150) {
            pVar.Z(true);
            return;
        }
        if (i10 == 151) {
            pVar.Z(false);
            return;
        }
        if (i10 == 145) {
            g5.r(pVar, false, pVar.H, null, false, true, true, false, new j(pVar));
            return;
        }
        if (i10 == 146) {
            u0.e(pVar.J, pVar, pVar.currentAccount, pVar.H);
            return;
        }
        Object obj = l61Var.G;
        if (obj instanceof TLRPC.Chat) {
            pVar.presentFragment(fo.W9(-((TLRPC.Chat) obj).id));
        } else if (obj instanceof TLRPC.User) {
            pVar.presentFragment(fo.W9(((TLRPC.User) obj).id));
        }
    }

    public static /* synthetic */ void W(p pVar) {
        pVar.F = null;
        MessagesController.getInstance(pVar.currentAccount).changeChatAvatar(pVar.b, null, null, null, null, 0.0d, null, null, null, null);
        pVar.a0(false, true);
        pVar.v.h(null, null, pVar.y, pVar.H);
    }

    @Override // org.telegram.ui.Components.h50
    public final void E(float f7) {
        RadialProgressView radialProgressView = this.x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.h50
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.h50
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new k(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    public final void Y() {
        this.a.a((this.f == this.h && TextUtils.equals(((o) this.n.b).getText().toString(), this.e)) ? false : true, true);
    }

    public final void Z(boolean z10) {
        if (this.h == z10) {
            return;
        }
        j6 j6Var = (j6) this.d.z1(151);
        if (j6Var != null) {
            j6Var.a(!z10);
        }
        j6 j6Var2 = (j6) this.d.z1(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        if (j6Var2 != null) {
            j6Var2.a(z10);
        }
        this.h = z10;
        Y();
    }

    public final void a0(boolean z10, boolean z11) {
        if (this.x == null) {
            return;
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w = null;
        }
        if (!z11) {
            if (z10) {
                this.x.setAlpha(1.0f);
                this.x.setVisibility(0);
                this.s.setAlpha(1.0f);
                this.s.setVisibility(0);
                return;
            }
            this.x.setAlpha(0.0f);
            this.x.setVisibility(4);
            this.s.setAlpha(0.0f);
            this.s.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        if (z10) {
            this.x.setVisibility(0);
            this.s.setVisibility(0);
            AnimatorSet animatorSet3 = this.w;
            RadialProgressView radialProgressView = this.x;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<p6, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.x;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<p6, Float>) property2, 0.0f));
        }
        this.w.setDuration(180L);
        this.w.addListener(new ah.p0(16, this, z10));
        this.w.start();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        i2.d.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 5));
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(g6.d6));
        this.actionBar.M(new bh.b(cVar), fh.b.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        i7 i7Var = new i7(this, context);
        this.c = i7Var;
        i7Var.setBackgroundColor(g6.x0(null, g6.a7, false));
        this.y = new k9(this.H);
        n nVar = new n(context);
        this.r = nVar;
        nVar.a.e(this.H, this.y);
        this.v = this.r.a;
        String name = DialogObject.getName(this.H);
        this.e = name;
        c6 c6Var = this.resourceProvider;
        ah.x xVar = new ah.x(context, 4);
        o oVar = new o(context, 0);
        xVar.b = oVar;
        oVar.setTextColor(g6.w0(g6.G6, c6Var));
        oVar.setLinkTextColor(g6.w0(g6.gc, c6Var));
        oVar.setHintTextColor(g6.w0(g6.H6, c6Var));
        oVar.setTextSize(1, 16.0f);
        oVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        oVar.setBackground(null);
        oVar.setImeOptions(oVar.getImeOptions() | TLObject.FLAG_28);
        oVar.setInputType(oVar.getInputType() | 16384);
        oVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        oVar.setMinHeight(AndroidUtilities.dp(50.0f));
        xVar.addView(oVar, a6.a(-2.0f, 13.0f, 0.0f, 13.0f, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 16));
        this.n = xVar;
        oVar.setText(name);
        ((o) this.n.b).setSelection(name.length());
        ((o) this.n.b).addTextChangedListener(new h2(this, i10));
        ci.n nVar2 = new ci.n(this, context);
        this.G = nVar2;
        nVar2.setTextColor(getThemedColor(g6.Sh));
        this.G.setText(LocaleController.getString(R.string.Save));
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setTextSize(1, 14.0f);
        this.G.setGravity(17);
        this.G.setVisibility(8);
        this.G.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.G.setOnClickListener(new ah.g0(this, 18));
        w7.c6.a(this.G);
        this.actionBar.addView(this.G, a6.a(56.0f, 0.0f, 0.0f, 12.0f, 0.0f, -2, 85));
        p6 p6Var = new p6(this, context);
        this.s = p6Var;
        this.r.addView(p6Var, a6.a(72.0f, 0.0f, 0.0f, 0.0f, 28.0f, 72, 81));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.x.setProgressColor(-1);
        this.x.setNoProgress(false);
        this.r.addView(this.x, a6.a(64.0f, 0.0f, 0.0f, 0.0f, 32.0f, 64, 81));
        a0(false, false);
        h71 h71Var = new h71(this, new i(this, i10), new j(this), new j(this));
        this.d = h71Var;
        h71Var.setClipToPadding(false);
        h71 h71Var2 = this.d;
        h71Var2.W2.r = false;
        h71Var2.p1();
        this.actionBar.setBackground(null);
        this.c.addView(this.d, a6.d(-1.0f, -1));
        this.c.addView(this.actionBar, a6.e(-1, -2, 48));
        i7 i7Var2 = this.c;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.i(i7Var2, jVar);
        i7 i7Var3 = this.c;
        this.fragmentView = i7Var3;
        return i7Var3;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.b) {
                this.I = chatFull;
                this.d.W2.N(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void dismissCurrentDialog() {
        if (this.E.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.E.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.h50
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.h50
    public final /* synthetic */ kv0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.h50
    public final String getInitialSearchString() {
        return ((o) this.n.b).getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.E.h(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.b));
        this.H = chat;
        boolean z10 = chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers);
        this.f = z10;
        this.h = z10;
        this.I = getMessagesController().getChatFull(this.b);
        i50 i50Var = new i50(3, true, true);
        this.E = i50Var;
        i50Var.a = this;
        i50Var.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        i50 i50Var = this.E;
        if (i50Var != null) {
            i50Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        this.E.i();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.E.j(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        this.E.k();
    }

    @Override // ne.d
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        this.G.setAlpha(f7);
        this.G.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        this.G.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        this.G.setVisibility(f7 > 0.0f ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void restoreSelfArgs(Bundle bundle) {
        i50 i50Var = this.E;
        if (i50Var != null) {
            i50Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        i50 i50Var = this.E;
        if (i50Var != null && (str = i50Var.f) != null) {
            bundle.putString("path", str);
        }
        ah.x xVar = this.n;
        if (xVar != null) {
            String obj = ((o) xVar.b).getText().toString();
            if (obj.isEmpty()) {
                return;
            }
            bundle.putString("nameTextView", obj);
        }
    }

    @Override // org.telegram.ui.Components.h50
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.h50
    public final /* synthetic */ void P() {
    }

    @Override // ne.d
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
