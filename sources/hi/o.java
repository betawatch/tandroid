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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.w9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hr;
import org.telegram.ui.ju0;
import org.telegram.ui.qn;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class o extends n2 implements d50, NotificationCenter.NotificationCenterDelegate, ne.d {
    public e50 E;
    public TLRPC.FileLocation F;
    public di.n G;
    public TLRPC.Chat H;
    public TLRPC.ChatFull I;
    public final b2[] J;
    public final m K;
    public final ne.b a;
    public long b;
    public w1 c;
    public c71 d;
    public String e;
    public boolean f;
    public boolean h;
    public ah.x n;
    public n r;
    public g6 s;
    public w9 v;
    public AnimatorSet w;
    public RadialProgressView x;
    public h9 y;

    public o(Bundle bundle) {
        super(bundle);
        this.a = new ne.b(0, this, bs.h, 320L, false);
        this.J = new b2[1];
        this.K = new m(this);
    }

    public static boolean U(o oVar, h61 h61Var, View view) {
        long j10;
        boolean canRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        Object obj = h61Var.G;
        if (!(obj instanceof TLRPC.Chat)) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, oVar.H);
                z10 = isBot;
                z11 = false;
            }
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        j10 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, oVar.H);
        z11 = isChannelAndNotMegaGroup;
        z10 = false;
        boolean z12 = canRemoveBotFromCommunity;
        long j11 = j10;
        int b10 = t0.b(oVar.currentAccount, j11);
        boolean z13 = b10 == 1 || b10 == 2;
        if (z12 || z13) {
            i80 F = i80.F(oVar.c, null, view);
            F.l(R.drawable.msg_viewintopic, LocaleController.getString(z10 ? R.string.CommunityMenuViewBot : z11 ? R.string.CommunityMenuViewChannel : R.string.CommunityMenuViewGroup), new g(oVar, j11, 1), z13);
            F.m(z12, R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new l(oVar, z10, z11, j11, 0));
            F.W(oVar.d.V0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void V(o oVar, h61 h61Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = h61Var.d;
        if (i10 == 140) {
            if (oVar.E.g() || (chatPhoto = (chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.b))).photo) == null || chatPhoto.photo_big == null) {
                return;
            }
            ImageLocation imageLocation = null;
            PhotoViewer.u1().M2(null, oVar, null);
            TLRPC.ChatPhoto chatPhoto2 = chat.photo;
            int i11 = chatPhoto2.dc_id;
            if (i11 != 0) {
                chatPhoto2.photo_big.dc_id = i11;
            }
            TLRPC.ChatFull chatFull = oVar.I;
            if (chatFull != null) {
                TLRPC.Photo photo = chatFull.chat_photo;
                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                    imageLocation = ImageLocation.getForPhoto(oVar.I.chat_photo.video_sizes.get(0), oVar.I.chat_photo);
                }
            }
            PhotoViewer.u1().g2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, oVar.K, null, 0L, 0L, 0L, true, null, null);
            return;
        }
        if (i10 == 141) {
            oVar.E.n(oVar.F != null, new h(oVar, 0), new e1(6), 0);
            return;
        }
        if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", oVar.b);
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            hr hrVar = new hr(bundle);
            hrVar.x0(oVar.I);
            oVar.presentFragment(hrVar);
            return;
        }
        if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", oVar.b);
            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            hr hrVar2 = new hr(bundle2);
            hrVar2.x0(oVar.I);
            oVar.presentFragment(hrVar2);
            return;
        }
        if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", oVar.b);
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
            f5.r(oVar, false, oVar.H, null, false, true, true, false, new j(oVar));
            return;
        }
        if (i10 == 146) {
            t0.e(oVar.J, oVar, oVar.currentAccount, oVar.H);
            return;
        }
        Object obj = h61Var.G;
        if (obj instanceof TLRPC.Chat) {
            oVar.presentFragment(qn.W9(-((TLRPC.Chat) obj).id));
        } else if (obj instanceof TLRPC.User) {
            oVar.presentFragment(qn.W9(((TLRPC.User) obj).id));
        }
    }

    public static /* synthetic */ void W(o oVar) {
        oVar.F = null;
        MessagesController.getInstance(oVar.currentAccount).changeChatAvatar(oVar.b, null, null, null, null, 0.0d, null, null, null, null);
        oVar.a0(false, true);
        oVar.v.h(null, null, oVar.y, oVar.H);
    }

    @Override // org.telegram.ui.Components.d50
    public final void E(float f7) {
        RadialProgressView radialProgressView = this.x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.d50
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.x;
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
        this.a.a((this.f == this.h && TextUtils.equals(((ai.t) this.n.b).getText().toString(), this.e)) ? false : true, true);
    }

    public final void Z(boolean z10) {
        if (this.h == z10) {
            return;
        }
        i6 i6Var = (i6) this.d.z1(151);
        if (i6Var != null) {
            i6Var.a(!z10);
        }
        i6 i6Var2 = (i6) this.d.z1(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        if (i6Var2 != null) {
            i6Var2.a(z10);
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<g6, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.x;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<g6, Float>) property2, 0.0f));
        }
        this.w.setDuration(180L);
        this.w.addListener(new ah.p0(17, this, z10));
        this.w.start();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        i2.e.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = 6;
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, i11));
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(h6.d6));
        this.actionBar.M(new bh.b(cVar), fh.c.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        w1 w1Var = new w1(this, context);
        this.c = w1Var;
        w1Var.setBackgroundColor(h6.x0(null, h6.a7, false));
        this.y = new h9(this.H);
        n nVar = new n(context);
        this.r = nVar;
        nVar.a.e(this.H, this.y);
        this.v = this.r.a;
        String name = DialogObject.getName(this.H);
        this.e = name;
        d6 d6Var = this.resourceProvider;
        ah.x xVar = new ah.x(context, i11);
        ai.t tVar = new ai.t(context, i10);
        xVar.b = tVar;
        tVar.setTextColor(h6.w0(h6.G6, d6Var));
        tVar.setLinkTextColor(h6.w0(h6.gc, d6Var));
        tVar.setHintTextColor(h6.w0(h6.H6, d6Var));
        tVar.setTextSize(1, 16.0f);
        tVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        tVar.setBackground(null);
        tVar.setImeOptions(tVar.getImeOptions() | TLObject.FLAG_28);
        tVar.setInputType(tVar.getInputType() | 16384);
        tVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        tVar.setMinHeight(AndroidUtilities.dp(50.0f));
        xVar.addView(tVar, z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.n = xVar;
        tVar.setText(name);
        ((ai.t) this.n.b).setSelection(name.length());
        int i12 = 2;
        ((ai.t) this.n.b).addTextChangedListener(new ai.u(this, i12));
        di.n nVar2 = new di.n(this, context);
        this.G = nVar2;
        nVar2.setTextColor(getThemedColor(h6.Sh));
        this.G.setText(LocaleController.getString(R.string.Save));
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setTextSize(1, 14.0f);
        this.G.setGravity(17);
        this.G.setVisibility(8);
        this.G.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.G.setOnClickListener(new hg.r0(this, i12));
        b6.a(this.G);
        this.actionBar.addView(this.G, z5.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        g6 g6Var = new g6(this, context);
        this.s = g6Var;
        this.r.addView(g6Var, z5.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.x.setProgressColor(-1);
        this.x.setNoProgress(false);
        this.r.addView(this.x, z5.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        a0(false, false);
        c71 c71Var = new c71(this, new i(this, i10), new j(this), new j(this));
        this.d = c71Var;
        c71Var.setClipToPadding(false);
        c71 c71Var2 = this.d;
        c71Var2.W2.r = false;
        c71Var2.p1();
        this.actionBar.setBackground(null);
        this.c.addView(this.d, z5.c(-1.0f, -1));
        this.c.addView(this.actionBar, z5.e(-1, -2, 48));
        w1 w1Var2 = this.c;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(w1Var2, jVar);
        w1 w1Var3 = this.c;
        this.fragmentView = w1Var3;
        return w1Var3;
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

    @Override // org.telegram.ui.ActionBar.n2
    public final void dismissCurrentDialog() {
        if (this.E.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.E.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ ju0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public final String getInitialSearchString() {
        return ((ai.t) this.n.b).getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.E.h(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.b));
        this.H = chat;
        boolean z10 = chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers);
        this.f = z10;
        this.h = z10;
        this.I = getMessagesController().getChatFull(this.b);
        e50 e50Var = new e50(3, true, true);
        this.E = e50Var;
        e50Var.a = this;
        e50Var.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        e50 e50Var = this.E;
        if (e50Var != null) {
            e50Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        this.E.i();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.E.j(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        this.E.k();
    }

    @Override // ne.d
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        this.G.setAlpha(f7);
        this.G.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        this.G.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        this.G.setVisibility(f7 > 0.0f ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void restoreSelfArgs(Bundle bundle) {
        e50 e50Var = this.E;
        if (e50Var != null) {
            e50Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        e50 e50Var = this.E;
        if (e50Var != null && (str = e50Var.f) != null) {
            bundle.putString("path", str);
        }
        ah.x xVar = this.n;
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
