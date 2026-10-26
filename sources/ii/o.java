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
import bi.t1;
import fi.e1;
import fi.f6;
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
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.g50;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.y9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.kr;
import org.telegram.ui.qu0;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class o extends r2 implements f50, NotificationCenter.NotificationCenterDelegate, oe.d {
    public j9 E;
    public g50 F;
    public TLRPC.FileLocation G;
    public ei.n H;
    public TLRPC.Chat I;
    public TLRPC.ChatFull J;
    public final e2[] K;
    public final m L;
    public hh.c a;
    public final oe.b b;
    public long c;
    public t1 d;
    public r71 e;
    public String f;
    public boolean h;
    public boolean n;
    public bh.r r;
    public n s;
    public f6 v;
    public y9 w;
    public AnimatorSet x;
    public RadialProgressView y;

    public o(Bundle bundle) {
        super(bundle);
        this.b = new oe.b(0, this, ds.h, 320L, false);
        this.K = new e2[1];
        this.L = new m(this);
    }

    public static boolean V(o oVar, t61 t61Var, View view) {
        long j10;
        boolean canRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        Object obj = t61Var.G;
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
        z11 = ChatObject.isChannelAndNotMegaGroup(chat);
        canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, oVar.I);
        z10 = false;
        int b10 = s0.b(oVar.currentAccount, j10);
        boolean z12 = b10 == 1 || b10 == 2;
        if (canRemoveBotFromCommunity || z12) {
            k80 F = k80.F(oVar.d, null, view);
            F.l(R.drawable.msg_viewintopic, LocaleController.getString(z10 ? R.string.CommunityMenuViewBot : z11 ? R.string.CommunityMenuViewChannel : R.string.CommunityMenuViewGroup), new g(oVar, j10, 1), z12);
            F.m(R.drawable.msg_cancel, new l(oVar, z10, z11, j10, 0), LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), canRemoveBotFromCommunity, true);
            F.W(oVar.e.V0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void W(o oVar, t61 t61Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = t61Var.d;
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
            oVar.F.n(oVar.G != null, new h(oVar, 0), new e1(7), 0);
            return;
        }
        if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", oVar.c);
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            kr krVar = new kr(bundle);
            krVar.y0(oVar.J);
            oVar.presentFragment(krVar);
            return;
        }
        if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", oVar.c);
            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 0);
            kr krVar2 = new kr(bundle2);
            krVar2.y0(oVar.J);
            oVar.presentFragment(krVar2);
            return;
        }
        if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", oVar.c);
            oVar.presentFragment(new r(bundle3));
            return;
        }
        if (i10 == 150) {
            oVar.a0(true);
            return;
        }
        if (i10 == 151) {
            oVar.a0(false);
            return;
        }
        if (i10 == 145) {
            g5.r(oVar, false, oVar.I, null, false, true, true, false, new j(oVar));
            return;
        }
        if (i10 == 146) {
            s0.e(oVar.K, oVar, oVar.currentAccount, oVar.I);
            return;
        }
        Object obj = t61Var.G;
        if (obj instanceof TLRPC.Chat) {
            oVar.presentFragment(un.ba(-((TLRPC.Chat) obj).id));
        } else if (obj instanceof TLRPC.User) {
            oVar.presentFragment(un.ba(((TLRPC.User) obj).id));
        }
    }

    public static /* synthetic */ void X(o oVar) {
        oVar.G = null;
        MessagesController.getInstance(oVar.currentAccount).changeChatAvatar(oVar.c, null, null, null, null, 0.0d, null, null, null, null);
        oVar.b0(false, true);
        oVar.w.h(null, null, oVar.E, oVar.I);
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        this.H.setAlpha(f7);
        this.H.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        this.H.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        this.H.setVisibility(f7 > 0.0f ? 0 : 8);
    }

    @Override // org.telegram.ui.Components.f50
    public final void F(float f7) {
        RadialProgressView radialProgressView = this.y;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.f50
    public final void L(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.y;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.f50
    public final void R(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new k(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    public final void Z() {
        this.b.a((this.h == this.n && TextUtils.equals(((bi.t) this.r.b).getText().toString(), this.f)) ? false : true, true);
    }

    public final void a0(boolean z10) {
        if (this.n == z10) {
            return;
        }
        n6 n6Var = (n6) this.e.E1(151);
        if (n6Var != null) {
            n6Var.a(!z10);
        }
        n6 n6Var2 = (n6) this.e.E1(ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        if (n6Var2 != null) {
            n6Var2.a(z10);
        }
        this.n = z10;
        Z();
    }

    public final void b0(boolean z10, boolean z11) {
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<f6, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.y;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.v, (Property<f6, Float>) property2, 0.0f));
        }
        this.x.setDuration(180L);
        this.x.addListener(new bh.f0(17, this, z10));
        this.x.start();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonDrawable(new j2(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = 6;
        this.actionBar.setActionBarMenuOnItemClick(new bh.m(this, i11));
        hh.c cVar = new hh.c();
        this.a = cVar;
        cVar.a(getThemedColor(y6.d6));
        this.actionBar.I(new ch.b(cVar), gh.c.p(this.resourceProvider), false);
        this.actionBar.Q0 = true;
        t1 t1Var = new t1(this, context);
        this.d = t1Var;
        f7.i(y6.a7, t1Var, null);
        this.E = new j9(this.I);
        n nVar = new n(context);
        this.s = nVar;
        nVar.a.f(this.I, this.E);
        this.w = this.s.a;
        String name = DialogObject.getName(this.I);
        this.f = name;
        u6 u6Var = this.resourceProvider;
        bh.r rVar = new bh.r(context, i11);
        bi.t tVar = new bi.t(context, i10);
        rVar.b = tVar;
        f7.V(tVar, y6.G6, u6Var);
        f7.H(tVar, y6.gc, u6Var);
        f7.E(tVar, y6.H6, u6Var);
        tVar.setTextSize(1, 16.0f);
        tVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        tVar.setBackground(null);
        tVar.setImeOptions(tVar.getImeOptions() | TLObject.FLAG_28);
        tVar.setInputType(tVar.getInputType() | 16384);
        tVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        tVar.setMinHeight(AndroidUtilities.dp(50.0f));
        int i12 = 3;
        rVar.addView(tVar, gb1.h(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.r = rVar;
        tVar.setText(name);
        ((bi.t) this.r.b).setSelection(name.length());
        ((bi.t) this.r.b).addTextChangedListener(new bi.u(this, 2));
        ei.n nVar2 = new ei.n(this, context);
        this.H = nVar2;
        f7.V(nVar2, y6.Sh, getResourceProvider());
        this.H.setText(LocaleController.getString(R.string.Save));
        this.H.setTypeface(AndroidUtilities.bold());
        this.H.setTextSize(1, 14.0f);
        this.H.setGravity(17);
        this.H.setVisibility(8);
        this.H.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.H.setOnClickListener(new ig.d0(this, i12));
        gb1.b(this.H);
        this.actionBar.addView(this.H, gb1.h(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        f6 f6Var = new f6(this, context);
        this.v = f6Var;
        this.s.addView(f6Var, gb1.h(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.y = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.y.setProgressColor(-1);
        this.y.setNoProgress(false);
        this.s.addView(this.y, gb1.h(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        b0(false, false);
        r71 r71Var = new r71(this, new i(this, i10), new j(this), new j(this));
        this.e = r71Var;
        r71Var.setClipToPadding(false);
        r71 r71Var2 = this.e;
        j71 j71Var = r71Var2.g3;
        j71Var.r = false;
        j71Var.s = true;
        r71Var2.u1();
        this.actionBar.setBackground(null);
        this.d.addView(this.e, gb1.g(-1.0f, -1));
        this.d.addView(this.actionBar, gb1.i(-1, -2, 48));
        t1 t1Var2 = this.d;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(t1Var2, jVar);
        t1 t1Var3 = this.d;
        this.fragmentView = t1Var3;
        return t1Var3;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.c) {
                this.J = chatFull;
                this.e.g3.O(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void dismissCurrentDialog() {
        if (this.F.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.F.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ qu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.f50
    public final String getInitialSearchString() {
        return ((bi.t) this.r.b).getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.F.h(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.c = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.c));
        this.I = chat;
        boolean z10 = chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers);
        this.h = z10;
        this.n = z10;
        this.J = getMessagesController().getChatFull(this.c);
        g50 g50Var = new g50(3, true, true);
        this.F = g50Var;
        g50Var.a = this;
        g50Var.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        g50 g50Var = this.F;
        if (g50Var != null) {
            g50Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        this.F.i();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.F.j(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        this.F.k();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            hh.c cVar = this.a;
            if (cVar != null) {
                cVar.a(getThemedColor(y6.d6));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void restoreSelfArgs(Bundle bundle) {
        g50 g50Var = this.F;
        if (g50Var != null) {
            g50Var.f = bundle.getString("path");
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        g50 g50Var = this.F;
        if (g50Var != null && (str = g50Var.f) != null) {
            bundle.putString("path", str);
        }
        bh.r rVar = this.r;
        if (rVar != null) {
            String obj = ((bi.t) rVar.b).getText().toString();
            if (obj.isEmpty()) {
                return;
            }
            bundle.putString("nameTextView", obj);
        }
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ void Q() {
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
