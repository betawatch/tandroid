package nh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import fh.d2;
import fh.w4;
import g7.e6;
import g7.g6;
import gh.h1;
import java.util.WeakHashMap;
import kh.g1;
import kh.h6;
import kh.x8;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bu0;
import org.telegram.ui.jr;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class o extends o2 implements d40, NotificationCenter.NotificationCenterDelegate, td.b {
    public e40 A;
    public TLRPC.FileLocation B;
    public bh.e C;
    public TLRPC.Chat D;
    public TLRPC.ChatFull E;
    public final c2[] F;
    public final m G;
    public final td.a a;
    public long b;
    public h1 c;
    public i51 d;
    public String e;
    public boolean f;
    public boolean h;
    public d2 n;
    public n r;
    public h6 s;
    public o9 v;
    public AnimatorSet w;
    public RadialProgressView x;
    public z8 y;

    public o(Bundle bundle) {
        super(bundle);
        this.a = new td.a(0, this, gr.h, 320L, false);
        this.F = new c2[1];
        this.G = new m(this);
    }

    public static boolean T(o oVar, l41 l41Var, View view) {
        long j10;
        boolean canRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        Object obj = l41Var.G;
        if (!(obj instanceof TLRPC.Chat)) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, oVar.D);
                z10 = isBot;
                z11 = false;
            }
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        j10 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, oVar.D);
        z11 = isChannelAndNotMegaGroup;
        z10 = false;
        boolean z12 = canRemoveBotFromCommunity;
        long j11 = j10;
        int b10 = r0.b(oVar.currentAccount, j11);
        boolean z13 = b10 == 1 || b10 == 2;
        if (z12 || z13) {
            x60 F = x60.F(oVar.c, null, view);
            F.l(R.drawable.msg_viewintopic, LocaleController.getString(z10 ? R.string.CommunityMenuViewBot : z11 ? R.string.CommunityMenuViewChannel : R.string.CommunityMenuViewGroup), new g(oVar, j11, 1), z13);
            F.m(z12, R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new l(oVar, z10, z11, j11, 0));
            F.W(oVar.d.V0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void U(o oVar, l41 l41Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i9 = l41Var.d;
        if (i9 == 140) {
            if (oVar.A.h() || (chatPhoto = (chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.b))).photo) == null || chatPhoto.photo_big == null) {
                return;
            }
            ImageLocation imageLocation = null;
            PhotoViewer.t1().K2(null, oVar, null);
            TLRPC.ChatPhoto chatPhoto2 = chat.photo;
            int i10 = chatPhoto2.dc_id;
            if (i10 != 0) {
                chatPhoto2.photo_big.dc_id = i10;
            }
            TLRPC.ChatFull chatFull = oVar.E;
            if (chatFull != null) {
                TLRPC.Photo photo = chatFull.chat_photo;
                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                    imageLocation = ImageLocation.getForPhoto(oVar.E.chat_photo.video_sizes.get(0), oVar.E.chat_photo);
                }
            }
            PhotoViewer.t1().e2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, oVar.G, null, 0L, 0L, 0L, true, null, null);
            return;
        }
        if (i9 == 141) {
            oVar.A.o(oVar.B != null, new h(oVar, 0), new g1(6), 0);
            return;
        }
        if (i9 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", oVar.b);
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            jr jrVar = new jr(bundle);
            jrVar.w0(oVar.E);
            oVar.presentFragment(jrVar);
            return;
        }
        if (i9 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", oVar.b);
            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            jr jrVar2 = new jr(bundle2);
            jrVar2.w0(oVar.E);
            oVar.presentFragment(jrVar2);
            return;
        }
        if (i9 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", oVar.b);
            oVar.presentFragment(new r(bundle3));
            return;
        }
        if (i9 == 150) {
            oVar.Y(true);
            return;
        }
        if (i9 == 151) {
            oVar.Y(false);
            return;
        }
        if (i9 == 145) {
            y4.s(oVar, false, oVar.D, null, false, true, true, false, new j(oVar));
            return;
        }
        if (i9 == 146) {
            r0.e(oVar.F, oVar, oVar.currentAccount, oVar.D);
            return;
        }
        Object obj = l41Var.G;
        if (obj instanceof TLRPC.Chat) {
            oVar.presentFragment(qn.R9(-((TLRPC.Chat) obj).id));
        } else if (obj instanceof TLRPC.User) {
            oVar.presentFragment(qn.R9(((TLRPC.User) obj).id));
        }
    }

    public static /* synthetic */ void V(o oVar) {
        oVar.B = null;
        MessagesController.getInstance(oVar.currentAccount).changeChatAvatar(oVar.b, null, null, null, null, 0.0d, null, null, null, null);
        oVar.Z(false, true);
        oVar.v.h(null, null, oVar.y, oVar.D);
    }

    @Override // org.telegram.ui.Components.d40
    public final void D(float f10) {
        RadialProgressView radialProgressView = this.x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.d40
    public final void J(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        this.C.setAlpha(f10);
        this.C.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f10));
        this.C.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f10));
        this.C.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.d40
    public final void P(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new k(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    public final void X() {
        this.a.a((this.f == this.h && TextUtils.equals(((gh.o) this.n.b).getText().toString(), this.e)) ? false : true, true);
    }

    public final void Y(boolean z10) {
        if (this.h == z10) {
            return;
        }
        i6 i6Var = (i6) this.d.y1(151);
        if (i6Var != null) {
            i6Var.a(!z10);
        }
        i6 i6Var2 = (i6) this.d.y1(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        if (i6Var2 != null) {
            i6Var2.a(z10);
        }
        this.h = z10;
        X();
    }

    public final void Z(boolean z10, boolean z11) {
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<h6, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.x;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<h6, Float>) property2, 0.0f));
        }
        this.w.setDuration(180L);
        this.w.addListener(new hg.b0(16, this, z10));
        this.w.start();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        int i9 = 1;
        setHasOwnBackground(true);
        j2.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new w4(this, 7));
        ng.c cVar = new ng.c();
        cVar.a(getThemedColor(f6.d6));
        this.actionBar.L(new ig.a(cVar), mg.c.n(this.resourceProvider), false);
        this.actionBar.L0 = true;
        h1 h1Var = new h1(this, context);
        this.c = h1Var;
        h1Var.setBackgroundColor(f6.w0(null, f6.a7, false));
        this.y = new z8(this.D);
        n nVar = new n(context);
        this.r = nVar;
        nVar.a.e(this.D, this.y);
        this.v = this.r.a;
        String name = DialogObject.getName(this.D);
        this.e = name;
        b6 b6Var = this.resourceProvider;
        d2 d2Var = new d2(context, 8);
        gh.o oVar = new gh.o(context, i9);
        d2Var.b = oVar;
        oVar.setTextColor(f6.v0(f6.G6, b6Var));
        oVar.setLinkTextColor(f6.v0(f6.gc, b6Var));
        oVar.setHintTextColor(f6.v0(f6.H6, b6Var));
        oVar.setTextSize(1, 16.0f);
        oVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        oVar.setBackground(null);
        oVar.setImeOptions(oVar.getImeOptions() | TLObject.FLAG_28);
        oVar.setInputType(oVar.getInputType() | 16384);
        oVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        oVar.setMinHeight(AndroidUtilities.dp(50.0f));
        int i10 = 5;
        d2Var.addView(oVar, e6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.n = d2Var;
        oVar.setText(name);
        ((gh.o) this.n.b).setSelection(name.length());
        ((gh.o) this.n.b).addTextChangedListener(new bh.f(this, i10));
        bh.e eVar = new bh.e(this, context);
        this.C = eVar;
        eVar.setTextColor(getThemedColor(f6.Sh));
        this.C.setText(LocaleController.getString(R.string.Save));
        this.C.setTypeface(AndroidUtilities.bold());
        this.C.setTextSize(1, 14.0f);
        this.C.setGravity(17);
        this.C.setVisibility(8);
        this.C.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.C.setOnClickListener(new x8(this, i10));
        g6.a(this.C);
        this.actionBar.addView(this.C, e6.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        h6 h6Var = new h6(this, context);
        this.s = h6Var;
        this.r.addView(h6Var, e6.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.x.setProgressColor(-1);
        this.x.setNoProgress(false);
        this.r.addView(this.x, e6.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        Z(false, false);
        i51 i51Var = new i51(this, new i(this, i9), new j(this), new j(this));
        this.d = i51Var;
        i51Var.setClipToPadding(false);
        i51 i51Var2 = this.d;
        i51Var2.U2.r = false;
        i51Var2.p1();
        this.actionBar.setBackground(null);
        this.c.addView(this.d, e6.c(-1.0f, -1));
        this.c.addView(this.actionBar, e6.e(-1, -2, 48));
        h1 h1Var2 = this.c;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(h1Var2, jVar);
        h1 h1Var3 = this.c;
        this.fragmentView = h1Var3;
        return h1Var3;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.b) {
                this.E = chatFull;
                this.d.U2.N(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void dismissCurrentDialog() {
        if (this.A.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.A.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ bu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d40
    public final String getInitialSearchString() {
        return ((gh.o) this.n.b).getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        this.A.i(i9, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.b));
        this.D = chat;
        boolean z10 = chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers);
        this.f = z10;
        this.h = z10;
        this.E = getMessagesController().getChatFull(this.b);
        e40 e40Var = new e40(3, true, true);
        this.A = e40Var;
        e40Var.a = this;
        e40Var.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        e40 e40Var = this.A;
        if (e40Var != null) {
            e40Var.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        this.A.j();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        this.A.k(i9, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        this.A.l();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void restoreSelfArgs(Bundle bundle) {
        e40 e40Var = this.A;
        if (e40Var != null) {
            e40Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        e40 e40Var = this.A;
        if (e40Var != null && (str = e40Var.f) != null) {
            bundle.putString("path", str);
        }
        d2 d2Var = this.n;
        if (d2Var != null) {
            String obj = ((gh.o) d2Var.b).getText().toString();
            if (obj.isEmpty()) {
                return;
            }
            bundle.putString("nameTextView", obj);
        }
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ void O() {
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
