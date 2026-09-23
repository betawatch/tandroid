package fi;

import ai.v0;
import ai.w7;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import ci.f1;
import ci.i2;
import ci.r6;
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
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.v40;
import org.telegram.ui.Components.w9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.qr;
import org.telegram.ui.wu0;
import org.telegram.ui.xn;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class p extends n2 implements u40, NotificationCenter.NotificationCenterDelegate, le.e {
    public v40 E;
    public TLRPC.FileLocation F;
    public bi.o G;
    public TLRPC.Chat H;
    public TLRPC.ChatFull I;
    public final b2[] J;
    public final m K;
    public final le.c a;
    public long b;
    public w7 c;
    public d61 d;
    public String e;
    public boolean f;
    public boolean h;
    public ai.f0 n;
    public n r;
    public r6 s;
    public w9 v;
    public AnimatorSet w;
    public RadialProgressView x;
    public h9 y;

    public p(Bundle bundle) {
        super(bundle);
        this.a = new le.c(0, this, rr.h, 320L, false);
        this.J = new b2[1];
        this.K = new m(this);
    }

    public static boolean U(p pVar, h51 h51Var, View view) {
        long j3;
        boolean canRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        Object obj = h51Var.G;
        if (!(obj instanceof TLRPC.Chat)) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j3 = user.id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, pVar.H);
                z10 = isBot;
                z11 = false;
            }
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        j3 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, pVar.H);
        z11 = isChannelAndNotMegaGroup;
        z10 = false;
        boolean z12 = canRemoveBotFromCommunity;
        long j10 = j3;
        int b10 = u0.b(pVar.currentAccount, j10);
        boolean z13 = b10 == 1 || b10 == 2;
        if (z12 || z13) {
            o70 F = o70.F(pVar.c, null, view);
            F.l(R.drawable.msg_viewintopic, LocaleController.getString(z10 ? R.string.CommunityMenuViewBot : z11 ? R.string.CommunityMenuViewChannel : R.string.CommunityMenuViewGroup), new g(pVar, j10, 1), z13);
            F.m(z12, R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new l(pVar, z10, z11, j10, 0));
            F.W(pVar.d.V0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void V(p pVar, h51 h51Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = h51Var.d;
        if (i10 == 140) {
            if (pVar.E.h() || (chatPhoto = (chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.b))).photo) == null || chatPhoto.photo_big == null) {
                return;
            }
            ImageLocation imageLocation = null;
            PhotoViewer.t1().J2(null, pVar, null);
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
            PhotoViewer.t1().e2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, pVar.K, null, 0L, 0L, 0L, true, null, null);
            return;
        }
        if (i10 == 141) {
            pVar.E.o(pVar.F != null, new h(pVar, 0), new f1(6), 0);
            return;
        }
        if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", pVar.b);
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            qr qrVar = new qr(bundle);
            qrVar.x0(pVar.I);
            pVar.presentFragment(qrVar);
            return;
        }
        if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", pVar.b);
            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            qr qrVar2 = new qr(bundle2);
            qrVar2.x0(pVar.I);
            pVar.presentFragment(qrVar2);
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
            e5.s(pVar, false, pVar.H, null, false, true, true, false, new j(pVar));
            return;
        }
        if (i10 == 146) {
            u0.e(pVar.J, pVar, pVar.currentAccount, pVar.H);
            return;
        }
        Object obj = h51Var.G;
        if (obj instanceof TLRPC.Chat) {
            pVar.presentFragment(xn.R9(-((TLRPC.Chat) obj).id));
        } else if (obj instanceof TLRPC.User) {
            pVar.presentFragment(xn.R9(((TLRPC.User) obj).id));
        }
    }

    public static /* synthetic */ void W(p pVar) {
        pVar.F = null;
        MessagesController.getInstance(pVar.currentAccount).changeChatAvatar(pVar.b, null, null, null, null, 0.0d, null, null, null, null);
        pVar.a0(false, true);
        pVar.v.h(null, null, pVar.y, pVar.H);
    }

    @Override // org.telegram.ui.Components.u40
    public final void B(float f7) {
        RadialProgressView radialProgressView = this.x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // le.e
    public final void D(int i10, float f7, float f10, le.f fVar) {
        this.G.setAlpha(f7);
        this.G.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        this.G.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        this.G.setVisibility(f7 > 0.0f ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.u40
    public final void L(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.u40
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
        j6 j6Var = (j6) this.d.y1(151);
        if (j6Var != null) {
            j6Var.a(!z10);
        }
        j6 j6Var2 = (j6) this.d.y1(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<r6, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.x;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<r6, Float>) property2, 0.0f));
        }
        this.w.setDuration(180L);
        this.w.addListener(new ai.n(15, this, z10));
        this.w.start();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        hg.c.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = 4;
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, i11));
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(h6.d6));
        this.actionBar.M(new ah.c(cVar), eh.b.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        w7 w7Var = new w7(this, context);
        this.c = w7Var;
        w7Var.setBackgroundColor(h6.w0(null, h6.a7, false));
        this.y = new h9(this.H);
        n nVar = new n(context);
        this.r = nVar;
        nVar.a.e(this.H, this.y);
        this.v = this.r.a;
        String name = DialogObject.getName(this.H);
        this.e = name;
        d6 d6Var = this.resourceProvider;
        ai.f0 f0Var = new ai.f0(context, i11);
        o oVar = new o(context, 0);
        f0Var.b = oVar;
        oVar.setTextColor(h6.v0(h6.G6, d6Var));
        oVar.setLinkTextColor(h6.v0(h6.gc, d6Var));
        oVar.setHintTextColor(h6.v0(h6.H6, d6Var));
        oVar.setTextSize(1, 16.0f);
        oVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        oVar.setBackground(null);
        oVar.setImeOptions(oVar.getImeOptions() | TLObject.FLAG_28);
        oVar.setInputType(oVar.getInputType() | 16384);
        oVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        oVar.setMinHeight(AndroidUtilities.dp(50.0f));
        f0Var.addView(oVar, x5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.n = f0Var;
        oVar.setText(name);
        ((o) this.n.b).setSelection(name.length());
        ((o) this.n.b).addTextChangedListener(new i2(this, i10));
        bi.o oVar2 = new bi.o(this, context);
        this.G = oVar2;
        oVar2.setTextColor(getThemedColor(h6.Sh));
        this.G.setText(LocaleController.getString(R.string.Save));
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setTextSize(1, 14.0f);
        this.G.setGravity(17);
        this.G.setVisibility(8);
        this.G.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.G.setOnClickListener(new v0(this, 17));
        z5.a(this.G);
        this.actionBar.addView(this.G, x5.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        r6 r6Var = new r6(this, context);
        this.s = r6Var;
        this.r.addView(r6Var, x5.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.x.setProgressColor(-1);
        this.x.setNoProgress(false);
        this.r.addView(this.x, x5.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        a0(false, false);
        d61 d61Var = new d61(this, new i(this, i10), new j(this), new j(this));
        this.d = d61Var;
        d61Var.setClipToPadding(false);
        d61 d61Var2 = this.d;
        d61Var2.Y2.r = false;
        d61Var2.p1();
        this.actionBar.setBackground(null);
        this.c.addView(this.d, x5.c(-1.0f, -1));
        this.c.addView(this.actionBar, x5.e(-1, -2, 48));
        w7 w7Var2 = this.c;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(w7Var2, jVar);
        w7 w7Var3 = this.c;
        this.fragmentView = w7Var3;
        return w7Var3;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.b) {
                this.I = chatFull;
                this.d.Y2.N(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void dismissCurrentDialog() {
        if (this.E.g(this.visibleDialog)) {
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

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ wu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.u40
    public final String getInitialSearchString() {
        return ((o) this.n.b).getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.E.i(i10, i11, intent);
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
        v40 v40Var = new v40(3, true, true);
        this.E = v40Var;
        v40Var.a = this;
        v40Var.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        v40 v40Var = this.E;
        if (v40Var != null) {
            v40Var.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        this.E.j();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.E.k(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        this.E.l();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void restoreSelfArgs(Bundle bundle) {
        v40 v40Var = this.E;
        if (v40Var != null) {
            v40Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        v40 v40Var = this.E;
        if (v40Var != null && (str = v40Var.f) != null) {
            bundle.putString("path", str);
        }
        ai.f0 f0Var = this.n;
        if (f0Var != null) {
            String obj = ((o) f0Var.b).getText().toString();
            if (obj.isEmpty()) {
                return;
            }
            bundle.putString("nameTextView", obj);
        }
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ void P() {
    }

    @Override // le.e
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
