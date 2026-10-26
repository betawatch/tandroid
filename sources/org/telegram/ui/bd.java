package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class bd extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public Drawable H;
    public SpannableStringBuilder I;
    public boolean J;
    public org.telegram.ui.Components.xj0 K;
    public org.telegram.ui.ActionBar.w0 L;
    public org.telegram.ui.Components.mm0 M;
    public oc N;
    public FrameLayout O;
    public fi.d P;
    public lc Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long a;
    public int a0;
    public int b;
    public int b0;
    public TL_stories.TL_premium_boostsStatus c;
    public int c0;
    public boolean d;
    public int d0;
    public int e;
    public int e0;
    public int f;
    public int f0;
    public int g0;
    public long h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public org.telegram.ui.ActionBar.r2 l0;
    public mc m0;
    public long n;
    public float n0;
    public ValueAnimator o0;
    public boolean p0;
    public org.telegram.ui.ActionBar.u6 q0;
    public int r;
    public final SparseIntArray r0;
    public int s;
    public final org.telegram.ui.ActionBar.l5 s0;
    public final org.telegram.ui.ActionBar.l5 t0;
    public final org.telegram.ui.ActionBar.l5 u0;
    public long v;
    public final org.telegram.ui.ActionBar.l5 v0;
    public long w;
    public final Drawable w0;
    public TLRPC.EmojiStatus x;
    public final Drawable x0;
    public TLRPC.EmojiStatus y;
    public final Paint y0;

    public bd(long j10) {
        super(null);
        boolean q5 = org.telegram.ui.ActionBar.y6.I.q();
        this.J = q5;
        this.R = 0;
        this.p0 = q5;
        this.r0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.y0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d7, this.resourceProvider));
        this.w0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.x0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.a = j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            this.b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j10, new li.s2(7, this, chat));
        this.resourceProvider = new ad(this);
        this.s0 = new org.telegram.ui.ActionBar.l5(0, false, false, this.resourceProvider);
        this.t0 = new org.telegram.ui.ActionBar.l5(0, false, true, this.resourceProvider);
        this.u0 = new org.telegram.ui.ActionBar.l5(0, true, false, this.resourceProvider);
        this.v0 = new org.telegram.ui.ActionBar.l5(0, true, true, this.resourceProvider);
    }

    public static void V(bd bdVar) {
        org.telegram.ui.ActionBar.u6 u6Var = bdVar.resourceProvider;
        if (u6Var instanceof ad) {
            bd bdVar2 = ((ad) u6Var).a;
            bdVar2.J = !bdVar2.J;
            bdVar2.g1();
            bdVar2.c1(false);
        } else {
            bdVar.J = !bdVar.J;
            bdVar.g1();
        }
        bdVar.X0(bdVar.J, true);
        bdVar.c1(false);
        org.telegram.ui.ActionBar.y6.Ll++;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(bd bdVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        int i10;
        int i11;
        long j10 = bdVar.a;
        if (bdVar.e != bdVar.f) {
            MessagesController.PeerColors peerColors = bdVar.getMessagesController().peerColors;
            MessagesController.PeerColor color = peerColors == null ? null : peerColors.getColor(bdVar.f);
            if (color != null && color.getLvl(bdVar.d) > bdVar.b) {
                i10 = color.getLvl(bdVar.d);
                if (bdVar.r != bdVar.s) {
                    MessagesController.PeerColors peerColors2 = bdVar.getMessagesController().profilePeerColors;
                    MessagesController.PeerColor color2 = peerColors2 != null ? peerColors2.getColor(bdVar.s) : null;
                    if (color2 != null && color2.getLvl(bdVar.d) > bdVar.b) {
                        i10 = color2.getLvl(bdVar.d);
                        i11 = 24;
                        int i12 = i10;
                        if (bdVar.h != bdVar.n && bdVar.getMessagesController().channelBgIconLevelMin > bdVar.b) {
                            i11 = 27;
                        }
                        if (bdVar.v != bdVar.w && bdVar.M0() > bdVar.b) {
                            i11 = 28;
                        }
                        if (!DialogObject.emojiStatusesEqual(bdVar.x, bdVar.y) && bdVar.I0() > bdVar.b) {
                            i11 = !(bdVar.y instanceof TLRPC.TL_emojiStatusCollectible) ? 26 : 25;
                        }
                        if (!ChatThemeController.wallpaperEquals(bdVar.E, bdVar.F)) {
                            i11 = !TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(bdVar.F)) ? 22 : 23;
                        }
                        int i13 = i11;
                        if (bdVar.getParentActivity() == null || bdVar.getParentActivity() == null) {
                            return;
                        }
                        jc jcVar = new jc(bdVar, bdVar.getParentActivity(), i13, bdVar.currentAccount, bdVar.getResourceProvider(), i12);
                        jcVar.K1(canApplyBoost);
                        jcVar.J1(bdVar.c, true);
                        jcVar.L1(j10);
                        TLRPC.Chat chat = bdVar.getMessagesController().getChat(Long.valueOf(-j10));
                        if (chat != null) {
                            jcVar.Q0 = new org.telegram.messenger.voip.m0(26, bdVar, chat);
                        }
                        bdVar.showDialog(jcVar);
                        bdVar.P.setLoading(false);
                        return;
                    }
                }
                i11 = 20;
                int i122 = i10;
                if (bdVar.h != bdVar.n) {
                    i11 = 27;
                }
                if (bdVar.v != bdVar.w) {
                    i11 = 28;
                }
                if (!DialogObject.emojiStatusesEqual(bdVar.x, bdVar.y)) {
                    if (!(bdVar.y instanceof TLRPC.TL_emojiStatusCollectible)) {
                    }
                }
                if (!ChatThemeController.wallpaperEquals(bdVar.E, bdVar.F)) {
                }
                int i132 = i11;
                if (bdVar.getParentActivity() == null) {
                    return;
                } else {
                    return;
                }
            }
        }
        i10 = 0;
        if (bdVar.r != bdVar.s) {
        }
        i11 = 20;
        int i1222 = i10;
        if (bdVar.h != bdVar.n) {
        }
        if (bdVar.v != bdVar.w) {
        }
        if (!DialogObject.emojiStatusesEqual(bdVar.x, bdVar.y)) {
        }
        if (!ChatThemeController.wallpaperEquals(bdVar.E, bdVar.F)) {
        }
        int i1322 = i11;
        if (bdVar.getParentActivity() == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void X(bd bdVar, TLRPC.ChatFull chatFull, View view, int i10) {
        long j10;
        long emojiStatusDocumentId;
        long j11;
        long j12 = bdVar.a;
        int i11 = 0;
        if (!(view instanceof pc)) {
            if (i10 == bdVar.e0) {
                bdVar.s = -1;
                bdVar.w = 0L;
                if (bdVar.y instanceof TLRPC.TL_emojiStatusCollectible) {
                    bdVar.y = null;
                }
                bdVar.e1();
                bdVar.a1(true);
                bdVar.f1();
                bdVar.c1(true);
                return;
            }
            if (i10 == bdVar.X) {
                Activity parentActivity = bdVar.getParentActivity();
                long j13 = bdVar.a;
                org.telegram.ui.ActionBar.u6 u6Var = bdVar.resourceProvider;
                gc gcVar = new gc(bdVar, i11);
                f fVar = new f(bdVar, 11);
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = bdVar.c;
                int i12 = org.telegram.ui.Components.yp.l0;
                org.telegram.ui.Components.ti tiVar = new org.telegram.ui.Components.ti(parentActivity, bdVar, false, false, false, u6Var);
                tiVar.drawNavigationBar = true;
                tiVar.S1(LocaleController.getString(R.string.ChooseBackground));
                tiVar.c2 = new org.telegram.ui.Components.op(tiVar, tL_premium_boostsStatus, u6Var, fVar, j13, gcVar, bdVar);
                tiVar.Q1(1, false);
                tiVar.v1();
                tiVar.j0.f0();
                tiVar.show();
                return;
            }
            return;
        }
        if (i10 == bdVar.j0) {
            if (chatFull == null) {
                return;
            }
            f70 f70Var = new f70(-j12);
            f70Var.f0(chatFull);
            bdVar.presentFragment(f70Var);
            return;
        }
        if (i10 == bdVar.U) {
            emojiStatusDocumentId = bdVar.n;
        } else if (i10 == bdVar.c0) {
            emojiStatusDocumentId = bdVar.w;
        } else {
            if (i10 != bdVar.f0) {
                j10 = 0;
                if (i10 != bdVar.h0) {
                    int K0 = bdVar.K0();
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = bdVar.c;
                    if (tL_premium_boostsStatus2 != null && tL_premium_boostsStatus2.level < K0) {
                        bdVar.W0(29);
                        return;
                    }
                    f70 f70Var2 = new f70(-j12, 0);
                    f70Var2.f0(chatFull);
                    bdVar.presentFragment(f70Var2);
                    return;
                }
                pc pcVar = (pc) view;
                boolean z10 = i10 == bdVar.f0;
                fc fcVar = new fc(bdVar, i10, view);
                int w02 = bdVar.y instanceof TLRPC.TL_emojiStatusCollectible ? org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v6, bdVar.resourceProvider) : pcVar.f;
                if (bdVar.Q == null) {
                    org.telegram.ui.Components.r5 r5Var = pcVar.c;
                    t51[] t51VarArr = new t51[1];
                    boolean z11 = ((float) (pcVar.getHeight() + pcVar.getTop())) > ((float) bdVar.M.getMeasuredHeight()) / 2.0f;
                    int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                    int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                    Drawable[] drawableArr = r5Var.f;
                    Drawable drawable = drawableArr[1];
                    if (drawable != null) {
                        j11 = 0;
                        if (drawable instanceof org.telegram.ui.Components.t5) {
                            ((org.telegram.ui.Components.t5) drawable).p(r5Var);
                        }
                        drawableArr[1] = null;
                    } else {
                        j11 = 0;
                    }
                    r5Var.f();
                    pcVar.f();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(r5Var.getBounds());
                    int dp = z11 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(pcVar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    kc kcVar = new kc(bdVar, bdVar, bdVar.getParentActivity(), Integer.valueOf(rect.centerX() - (AndroidUtilities.displaySize.x - min2)), z10 ? z11 ? 10 : 9 : z11 ? 5 : 7, bdVar.getResourceProvider(), z11 ? 24 : 16, w02, fcVar, t51VarArr);
                    kcVar.g1 = true;
                    kcVar.setSelected(j10 == j11 ? null : Long.valueOf(j10));
                    kcVar.setSaveState(3);
                    kcVar.y(r5Var, pcVar);
                    lc lcVar = new lc(bdVar, kcVar);
                    bdVar.Q = lcVar;
                    t51VarArr[0] = lcVar;
                    lcVar.showAsDropDown(pcVar, 0, dp, 53);
                    t51VarArr[0].b();
                    return;
                }
                return;
            }
            TLRPC.EmojiStatus emojiStatus = bdVar.y;
            emojiStatusDocumentId = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id : DialogObject.getEmojiStatusDocumentId(emojiStatus);
        }
        j10 = emojiStatusDocumentId;
        if (i10 != bdVar.h0) {
        }
    }

    public static void b1(View view) {
        if (view instanceof pc) {
            ((pc) view).updateColors();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.v8) {
            ((org.telegram.ui.Cells.v8) view).updateColors();
        } else if (view instanceof sc) {
            ((sc) view).updateColors();
        } else if (view instanceof zc) {
            ((zc) view).updateColors();
        }
    }

    public void A0() {
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(getParentActivity(), this.resourceProvider);
        this.M = mm0Var;
        mm0Var.setSections(false);
    }

    public final View B0(int i10) {
        for (int i11 = 0; i11 < this.M.getChildCount(); i11++) {
            View childAt = this.M.getChildAt(i11);
            this.M.getClass();
            if (RecyclerView.R(childAt) == i10) {
                return childAt;
            }
        }
        return null;
    }

    public int C0() {
        return getMessagesController().channelCustomWallpaperLevelMin;
    }

    public int D0() {
        return 0;
    }

    public int E0() {
        return 0;
    }

    public final TLRPC.Document F0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0);
            }
        }
        return null;
    }

    public final long G0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j10 = stickerSet.thumb_document_id;
        if (j10 == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0).id;
            }
        }
        return j10;
    }

    public int H0() {
        return R.string.ChannelEmojiStatusInfo;
    }

    public int I0() {
        return getMessagesController().channelEmojiStatusLevelMin;
    }

    public int J0() {
        return R.string.ChannelEmojiStatus;
    }

    public int K0() {
        return 0;
    }

    public int L0() {
        return 3;
    }

    public int M0() {
        return getMessagesController().channelProfileIconLevelMin;
    }

    public int N0() {
        return R.string.ChannelProfileInfo;
    }

    public int O0() {
        return 0;
    }

    public int P0() {
        return 0;
    }

    public int Q0() {
        return R.string.ChannelWallpaper2Info;
    }

    public int R0() {
        return getMessagesController().channelWallpaperLevelMin;
    }

    public int S0() {
        return R.string.ChannelWallpaper;
    }

    public final boolean T0() {
        return (this.e == this.f && this.h == this.n && this.r == this.s && this.v == this.w && DialogObject.emojiStatusesEqual(this.x, this.y) && ChatThemeController.wallpaperEquals(this.E, this.F)) ? false : true;
    }

    public boolean U0() {
        return false;
    }

    public final int V0() {
        int i10 = 0;
        if (this.e != this.f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            MessagesController.PeerColor color = peerColors == null ? null : peerColors.getColor(this.f);
            if (color != null) {
                i10 = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.n) {
            i10 = Math.max(i10, getMessagesController().channelBgIconLevelMin);
        }
        if (this.r != this.s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            MessagesController.PeerColor color2 = peerColors2 != null ? peerColors2.getColor(this.s) : null;
            if (color2 != null) {
                i10 = Math.max(i10, color2.getLvl(this.d));
            }
        }
        if (this.v != this.w) {
            i10 = Math.max(i10, M0());
        }
        if (!DialogObject.emojiStatusesEqual(this.x, this.y)) {
            i10 = Math.max(i10, I0());
        }
        return !ChatThemeController.wallpaperEquals(this.E, this.F) ? Math.max(i10, R0()) : i10;
    }

    public final void X0(boolean z10, boolean z11) {
        if (this.p0 == z10) {
            return;
        }
        this.p0 = z10;
        if (z11) {
            org.telegram.ui.Components.xj0 xj0Var = this.K;
            xj0Var.P(z10 ? xj0Var.e[0] : 0);
            org.telegram.ui.Components.xj0 xj0Var2 = this.K;
            if (xj0Var2 != null) {
                xj0Var2.start();
                return;
            }
            return;
        }
        int i10 = z10 ? this.K.e[0] - 1 : 0;
        this.K.N(i10, false, true);
        this.K.P(i10);
        org.telegram.ui.ActionBar.w0 w0Var = this.L;
        if (w0Var != null) {
            w0Var.invalidate();
        }
    }

    public final void Y0() {
        if (getVisibleDialog() != null) {
            return;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.ic
            public final /* synthetic */ bd b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        this.b.z0();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.ic
            public final /* synthetic */ bd b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        this.b.z0();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        showDialog(e2Var);
        org.telegram.ui.ActionBar.f7.V((TextView) e2Var.d(-2), org.telegram.ui.ActionBar.y6.q7, getResourceProvider());
    }

    public final void Z0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.a));
            this.c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.b = i10;
            if (chat != null) {
                chat.level = i10;
            }
            oc ocVar = this.N;
            if (ocVar != null) {
                ocVar.l();
            }
            a1(true);
        }
    }

    public void a1(boolean z10) {
        if (this.P == null || this.c == null) {
            return;
        }
        int V0 = V0();
        if (this.b >= V0) {
            this.P.g(null, z10);
            return;
        }
        if (this.I == null) {
            this.I = new SpannableStringBuilder("l");
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.mini_switch_lock, 0);
            zqVar.setTopOffset(1);
            this.I.setSpan(zqVar, 0, 1, 33);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.I).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", V0, new Object[0]));
        this.P.g(spannableStringBuilder, z10);
    }

    public void c1(boolean z10) {
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        if (r5Var != null) {
            r5Var.updateColors();
        } else {
            this.actionBar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.y6.A8) : -1);
            this.actionBar.y((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.y6.v8) : -1, false);
            this.actionBar.x(getThemedColor(org.telegram.ui.ActionBar.y6.t8), false);
        }
        if (z10) {
            return;
        }
        this.N.l();
        AndroidUtilities.forEachViews((RecyclerView) this.M, (Utilities.Callback<View>) new di.e(this));
        if (this.d) {
            this.O.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.a7));
        }
        this.P.updateColors();
        setNavigationBarColor(getNavigationBarColor());
    }

    @Override // org.telegram.ui.ActionBar.r2
    public View createView(Context context) {
        org.telegram.ui.ActionBar.w0 d;
        MessagesController messagesController = getMessagesController();
        long j10 = -this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.f = colorId;
            this.e = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.n = emojiId;
            this.h = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.s = profileColorId;
            this.r = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.w = profileEmojiId;
            this.v = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.y = emojiStatus;
            this.x = emojiStatus;
        }
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        if (chatFull != null) {
            TLRPC.WallPaper wallPaper = chatFull.wallpaper;
            this.F = wallPaper;
            this.E = wallPaper;
            if (ChatThemeController.isNotEmoticonWallpaper(wallPaper)) {
                this.G = this.E;
            }
        }
        ga gaVar = new ga(this, 2);
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        if (r5Var != null) {
            r5Var.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.ChannelColorTitle2));
            this.simpleActionBar.setActionBarMenuOnItemClick(gaVar);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelColorTitle2));
            this.actionBar.setActionBarMenuOnItemClick(gaVar);
        }
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.K = xj0Var;
        xj0Var.h = true;
        if (this.J) {
            xj0Var.M(35);
            this.K.P(36);
        } else {
            xj0Var.P(0);
            this.K.M(0);
        }
        this.K.Z = true;
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.J9, this.resourceProvider);
        this.K.Q(w02, "Sunny");
        this.K.Q(w02, "Path 6");
        this.K.Q(w02, "Path");
        this.K.Q(w02, "Path 5");
        org.telegram.ui.ActionBar.r5 r5Var2 = this.simpleActionBar;
        if (r5Var2 != null) {
            org.telegram.ui.ActionBar.x5 j11 = r5Var2.j();
            org.telegram.ui.Components.xj0 xj0Var2 = this.K;
            j11.getClass();
            d = j11.b(1, 0, null, xj0Var2, AndroidUtilities.dp(48.0f), null);
        } else {
            d = this.actionBar.l().d(1, this.K);
        }
        this.L = d;
        FrameLayout frameLayout = new FrameLayout(context);
        f1();
        A0();
        if (this.d) {
            this.M.setLegacySections(true);
            this.M.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.a7));
        } else {
            setHasOwnBackground(true);
            this.M.setSectionsDrawBackground(true);
        }
        org.telegram.ui.Components.mm0 mm0Var = this.M;
        oc ocVar = new oc(this);
        this.N = ocVar;
        mm0Var.setAdapter(ocVar);
        new s4.t(3);
        this.M.setLayoutManager(new s4.c0());
        frameLayout.addView(this.M, org.telegram.ui.Components.gb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, this.d ? 68.0f : 0.0f));
        this.M.setOnItemClickListener(new di.x4(4, this, chatFull));
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.m = false;
        this.M.setItemAnimator(lVar);
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.P = dVar;
        dVar.i(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.P.setOnClickListener(new a(this, 11));
        a1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O = frameLayout2;
        if (this.d) {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.a7, frameLayout2, getResourceProvider());
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.O));
        }
        this.O.addView(this.P, org.telegram.ui.Components.gb1.h(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.O, org.telegram.ui.Components.gb1.i(-1, 68, 80));
        setBulletinDelegate(new d9(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1(boolean z10) {
        MessageObject messageObject;
        View B0 = B0(this.S);
        View B02 = B0(this.T);
        View B03 = B0(this.U);
        View B04 = B0(this.W);
        if (B0 instanceof org.telegram.ui.Cells.ka) {
            org.telegram.ui.Cells.ka kaVar = (org.telegram.ui.Cells.ka) B0;
            org.telegram.ui.Cells.s1[] cells = kaVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.s1 s1Var = cells[i10];
                if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f;
                    messageObject.overrideLinkEmoji = this.n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f7 = fi.o6.f(this.H, this.currentAccount, this.F, this.J);
            this.H = f7;
            kaVar.setOverrideBackground(f7);
        }
        if (B02 instanceof op0) {
            ((op0) B02).a(this.f, z10);
        } else if (B02 instanceof sc) {
            ((sc) B02).a(this.f, z10);
        }
        if (B03 instanceof pc) {
            pc pcVar = (pc) B03;
            pcVar.a(this.currentAccount, this.f, true);
            pcVar.c(this.n, false, z10);
        }
        if (B04 instanceof zc) {
            zc zcVar = (zc) B04;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.F);
            if (wallpaperEmoticon == null && this.F == null && this.G != null) {
                wallpaperEmoticon = "❌";
            }
            zcVar.a(wallpaperEmoticon, z10);
            zcVar.setGalleryWallpaper(this.G);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatWasBoostedByUser;
        long j10 = this.a;
        if (i10 == i12) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                Z0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (((Boolean) objArr[1]).booleanValue()) {
                return;
            }
            getMessagesController().getBoostsController().getBoostsStats(j10, new gc(this, 2));
        } else if (i10 == NotificationCenter.dialogDeleted && j10 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
            if (j5Var == null || j5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void e1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View B0 = B0(this.Z);
        View B02 = B0(this.b0);
        View B03 = B0(this.c0);
        View B04 = B0(this.f0);
        View B05 = B0(this.h0);
        View B06 = B0(this.j0);
        if (B0 instanceof uc) {
            TLRPC.EmojiStatus emojiStatus = this.y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                uc ucVar = (uc) B0;
                tc tcVar = ucVar.b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                tcVar.c(fromCollectible, true);
                ucVar.a.c(fromCollectible, true);
                tcVar.d(((TLRPC.TL_emojiStatusCollectible) this.y).pattern_document_id, true, true);
            } else {
                uc ucVar2 = (uc) B0;
                tc tcVar2 = ucVar2.b;
                int i10 = this.s;
                tcVar2.b(i10, true);
                ucVar2.a.b(ucVar2.h.currentAccount, i10, true);
                tcVar2.d(this.w, false, true);
            }
            uc ucVar3 = (uc) B0;
            tc tcVar3 = ucVar3.b;
            tcVar3.e(DialogObject.getEmojiStatusDocumentId(this.y), false, true);
            tcVar3.a(this.f);
            ucVar3.updateColors();
        }
        if (B02 instanceof op0) {
            ((op0) B02).a(this.s, true);
        } else if (B02 instanceof sc) {
            ((sc) B02).a(this.f, true);
        }
        if (B03 instanceof pc) {
            pc pcVar = (pc) B03;
            pcVar.a(this.currentAccount, this.s, false);
            pcVar.c(this.w, false, true);
        }
        if (B04 instanceof pc) {
            TLRPC.EmojiStatus emojiStatus2 = this.y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((pc) B04).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((pc) B04).a(this.currentAccount, this.s, false);
            }
            ((pc) B04).c(DialogObject.getEmojiStatusDocumentId(this.y), DialogObject.isEmojiStatusCollectible(this.y), true);
        }
        boolean z10 = B05 instanceof pc;
        long j10 = this.a;
        if (z10) {
            pc pcVar2 = (pc) B05;
            pcVar2.a(this.currentAccount, this.s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull == null || (stickerSet2 = chatFull.emojiset) == null) {
                pcVar2.c(0L, false, false);
            } else {
                pcVar2.c(G0(stickerSet2), false, false);
            }
        }
        if (B06 instanceof pc) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j10);
            if (chatFull2 == null || (stickerSet = chatFull2.stickerset) == null) {
                ((pc) B06).c(0L, false, false);
            } else {
                ((pc) B06).d(F0(stickerSet));
            }
        }
        f1();
    }

    public void f1() {
        oc ocVar;
        oc ocVar2;
        this.S = 0;
        int i10 = 1 + 1;
        this.T = 1;
        this.U = i10;
        this.V = i10 + 1;
        this.W = i10 + 2;
        this.X = i10 + 3;
        this.Y = i10 + 4;
        this.Z = i10 + 5;
        this.b0 = i10 + 6;
        int i11 = i10 + 8;
        this.R = i11;
        this.c0 = i10 + 7;
        if (this.w != 0 || this.s >= 0 || (this.y instanceof TLRPC.TL_emojiStatusCollectible)) {
            boolean z10 = this.e0 >= 0;
            this.R = i10 + 9;
            this.e0 = i11;
            if (!z10 && (ocVar = this.N) != null) {
                ocVar.o(i11);
                this.N.m(this.c0);
            }
        } else {
            int i12 = this.e0;
            this.e0 = -1;
            if (i12 >= 0 && (ocVar2 = this.N) != null) {
                ocVar2.u(i12);
                this.N.m(this.c0);
            }
        }
        int i13 = this.R;
        this.d0 = i13;
        this.f0 = i13 + 1;
        this.R = i13 + 3;
        this.g0 = i13 + 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[LOOP:1: B:32:0x009b->B:34:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g1() {
        SparseIntArray S0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.w6 k10;
        View B0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.y6.P0(string) == null || org.telegram.ui.ActionBar.y6.P0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.y6.P0(string2) == null || !org.telegram.ui.ActionBar.y6.P0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.x6 x6Var = org.telegram.ui.ActionBar.y6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (x6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.x6 P0 = !this.J ? org.telegram.ui.ActionBar.y6.P0(str2) : org.telegram.ui.ActionBar.y6.P0(str);
            this.r0.clear();
            String[] strArr = new String[1];
            String str3 = P0.d;
            S0 = str3 == null ? org.telegram.ui.ActionBar.y6.S0(null, str3, strArr) : org.telegram.ui.ActionBar.y6.S0(new File(P0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.y6.ql;
            if (iArr != null) {
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    this.r0.put(i11, iArr[i11]);
                }
            }
            for (i10 = 0; i10 < S0.size(); i10++) {
                this.r0.put(S0.keyAt(i10), S0.valueAt(i10));
            }
            k10 = P0.k(false);
            if (k10 != null) {
                k10.c(S0, this.r0);
            }
            this.y0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d7, this.resourceProvider));
            this.H = fi.o6.f(this.H, this.currentAccount, this.F, this.J);
            B0 = B0(this.S);
            if (B0 instanceof org.telegram.ui.Cells.ka) {
                return;
            }
            ((org.telegram.ui.Cells.ka) B0).setOverrideBackground(this.H);
            return;
        }
        str = string;
        if (!this.J) {
        }
        this.r0.clear();
        String[] strArr2 = new String[1];
        String str32 = P0.d;
        if (str32 == null) {
        }
        iArr = org.telegram.ui.ActionBar.y6.ql;
        if (iArr != null) {
        }
        while (i10 < S0.size()) {
        }
        k10 = P0.k(false);
        if (k10 != null) {
        }
        this.y0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d7, this.resourceProvider));
        this.H = fi.o6.f(this.H, this.currentAccount, this.F, this.J);
        B0 = B0(this.S);
        if (B0 instanceof org.telegram.ui.Cells.ka) {
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        if (this.d) {
            return null;
        }
        return this.M;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return !this.d;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !T0() || this.b < V0();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        if (this.b < V0() || !T0()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        Y0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public boolean onFragmentCreate() {
        getMediaDataController().loadRestrictedStatusEmojis();
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        if (this.d || this.O == null) {
            return;
        }
        int dp = AndroidUtilities.dp(68.0f) + i13;
        ViewGroup.LayoutParams layoutParams = this.O.getLayoutParams();
        if (layoutParams.height != dp) {
            layoutParams.height = dp;
            this.O.setLayoutParams(layoutParams);
        }
        if (this.O.getPaddingLeft() != i10 || this.O.getPaddingRight() != i12 || this.O.getPaddingBottom() != i13) {
            this.O.setPadding(i10, 0, i12, i13);
        }
        oi.a.d(this.M, i11, i13, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), AndroidUtilities.dp(68.0f));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            y0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        i0.b bVar = this.mSystemInsets;
        onInsets(bVar.a, bVar.b, bVar.c, bVar.d);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void setResourceProvider(org.telegram.ui.ActionBar.u6 u6Var) {
        this.q0 = u6Var;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public final void x0() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null) {
            return;
        }
        kVar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.y6.A8) : -1);
        this.actionBar.y((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.y6.v8) : -1, false);
    }

    public void y0() {
        x0();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.s8));
        }
        org.telegram.ui.Components.mm0 mm0Var = this.M;
        if (mm0Var != null && this.d) {
            mm0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.a7));
        }
        FrameLayout frameLayout = this.O;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.a7));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0139  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0() {
        int[] iArr;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        long j10;
        ?? r13;
        if (this.c == null || this.P.Q) {
            return;
        }
        int i14 = this.b;
        int V0 = V0();
        long j11 = this.a;
        int i15 = 1;
        if (i14 < V0) {
            this.P.setLoading(true);
            getMessagesController().getBoostsController().userCanBoostChannel(j11, this.c, new gc(this, i15));
            return;
        }
        int[] iArr2 = {0};
        final di.y2 y2Var = new di.y2(this, new boolean[]{false}, new int[]{0}, iArr2, 4);
        long j12 = -j11;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j12));
        if (chat == null) {
            FileLog.e("channel is null in ChannelColorAcitivity");
            org.telegram.messenger.t.q(R.string.UnknownError, org.telegram.ui.Components.wc.b0(this), R.raw.error, 36);
            return;
        }
        this.P.setLoading(true);
        if (this.e == this.f) {
            i10 = 3;
            iArr = iArr2;
            if (this.h == this.n) {
                i11 = 3;
                z10 = true;
                i12 = 0;
                if (this.r == this.s || this.v != this.w) {
                    TLRPC.TL_channels_updateColor tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
                    tL_channels_updateColor.channel = getMessagesController().getInputChannel(j12);
                    tL_channels_updateColor.for_profile = z10;
                    if (chat.profile_color == null) {
                        chat.profile_color = new TLRPC.TL_peerColor();
                        chat.flags2 |= 256;
                    }
                    i13 = this.s;
                    if (i13 < 0) {
                        tL_channels_updateColor.flags |= 4;
                        tL_channels_updateColor.color = i13;
                        TLRPC.PeerColor peerColor = chat.profile_color;
                        peerColor.flags |= 1;
                        peerColor.color = i13;
                    } else {
                        chat.profile_color.flags &= -2;
                    }
                    j10 = this.w;
                    if (j10 == 0) {
                        tL_channels_updateColor.flags |= 1;
                        tL_channels_updateColor.background_emoji_id = j10;
                        TLRPC.PeerColor peerColor2 = chat.profile_color;
                        peerColor2.flags |= 2;
                        peerColor2.background_emoji_id = j10;
                    } else {
                        TLRPC.PeerColor peerColor3 = chat.profile_color;
                        peerColor3.flags &= -3;
                        peerColor3.background_emoji_id = 0L;
                    }
                    iArr[i12] = iArr[i12] + 1;
                    final int i16 = i11;
                    getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) { // from class: org.telegram.ui.ec
                        public final /* synthetic */ bd b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i16) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                            }
                        }
                    });
                }
                if (!ChatThemeController.wallpaperEquals(this.E, this.F)) {
                    TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
                    tL_messages_setChatWallPaper.peer = getMessagesController().getInputPeer(j11);
                    TLRPC.WallPaper wallPaper = this.F;
                    if (wallPaper != null) {
                        if (TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                            tL_messages_setChatWallPaper.flags |= 1;
                            TLRPC.WallPaper wallPaper2 = this.F;
                            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                                TLRPC.WallPaper wallPaper3 = this.F;
                                tL_inputWallPaper.id = wallPaper3.id;
                                tL_inputWallPaper.access_hash = wallPaper3.access_hash;
                                tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaper;
                            } else if (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) {
                                TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                                tL_inputWallPaperNoFile.id = this.F.id;
                                tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile;
                            }
                        } else {
                            tL_messages_setChatWallPaper.flags |= 1;
                            TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile2 = new TLRPC.TL_inputWallPaperNoFile();
                            tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile2;
                            tL_inputWallPaperNoFile2.id = 0L;
                            tL_messages_setChatWallPaper.flags |= 4;
                            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                            tL_messages_setChatWallPaper.settings = tL_wallPaperSettings;
                            tL_wallPaperSettings.flags |= 128;
                            tL_wallPaperSettings.emoticon = ChatThemeController.getWallpaperEmoticon(this.F);
                        }
                    }
                    iArr[i12] = iArr[i12] + 1;
                    final int i17 = i12;
                    getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) { // from class: org.telegram.ui.ec
                        public final /* synthetic */ bd b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i17) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                            }
                        }
                    });
                    TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j12);
                    ChatThemeController.getInstance(this.currentAccount).saveChatWallpaper(j11, this.F);
                    if (chatFull != null) {
                        TLRPC.WallPaper wallPaper4 = this.F;
                        if (wallPaper4 == null) {
                            chatFull.flags2 &= -129;
                            chatFull.wallpaper = null;
                        } else {
                            chatFull.flags2 |= 128;
                            chatFull.wallpaper = wallPaper4;
                        }
                        getMessagesController().putChatFull(chatFull);
                        NotificationCenter notificationCenter = getNotificationCenter();
                        int i18 = NotificationCenter.chatInfoDidLoad;
                        Boolean bool = Boolean.FALSE;
                        notificationCenter.lambda$postNotificationNameOnUIThread$1(i18, chatFull, 0, bool, bool);
                    }
                }
                if (DialogObject.emojiStatusesEqual(this.x, this.y)) {
                    TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus = new TLRPC.TL_channels_updateEmojiStatus();
                    tL_channels_updateEmojiStatus.channel = getMessagesController().getInputChannel(j12);
                    TLRPC.EmojiStatus emojiStatus = this.y;
                    if (emojiStatus == null || (emojiStatus instanceof TLRPC.TL_emojiStatusEmpty)) {
                        tL_channels_updateEmojiStatus.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                        chat.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                        chat.flags2 &= -513;
                    } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                        TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                        tL_inputEmojiStatusCollectible.collectible_id = tL_emojiStatusCollectible.collectible_id;
                        tL_inputEmojiStatusCollectible.flags = tL_emojiStatusCollectible.flags;
                        tL_inputEmojiStatusCollectible.until = tL_emojiStatusCollectible.until;
                        tL_channels_updateEmojiStatus.emoji_status = tL_inputEmojiStatusCollectible;
                        chat.emoji_status = this.y;
                        chat.flags |= 512;
                    } else {
                        tL_channels_updateEmojiStatus.emoji_status = emojiStatus;
                        chat.emoji_status = emojiStatus;
                        chat.flags |= 512;
                    }
                    getMessagesController().updateEmojiStatusUntilUpdate(j11, this.y);
                    r13 = 0;
                    final int i19 = 1;
                    iArr[0] = iArr[0] + 1;
                    getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) { // from class: org.telegram.ui.ec
                        public final /* synthetic */ bd b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i19) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                            }
                        }
                    });
                } else {
                    r13 = 0;
                }
                if (iArr[r13] != 0) {
                    finishFragment();
                    this.P.setLoading(r13);
                    return;
                }
                getMessagesController().putChat(chat, r13);
                NotificationCenter notificationCenter2 = getNotificationCenter();
                int i20 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[r13] = Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS);
                notificationCenter2.lambda$postNotificationNameOnUIThread$1(i20, objArr);
                return;
            }
        } else {
            iArr = iArr2;
            i10 = 3;
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor2 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor2.channel = getMessagesController().getInputChannel(j12);
        tL_channels_updateColor2.for_profile = false;
        if (chat.color == null) {
            chat.color = new TLRPC.TL_peerColor();
            chat.flags2 |= 128;
        }
        int i21 = tL_channels_updateColor2.flags;
        tL_channels_updateColor2.flags = i21 | 4;
        int i22 = this.f;
        tL_channels_updateColor2.color = i22;
        TLRPC.PeerColor peerColor4 = chat.color;
        i11 = i10;
        int i23 = peerColor4.flags;
        i12 = 0;
        int i24 = i23 | 1;
        peerColor4.flags = i24;
        peerColor4.color = i22;
        z10 = true;
        long j13 = this.n;
        if (j13 != 0) {
            tL_channels_updateColor2.flags = i21 | 5;
            tL_channels_updateColor2.background_emoji_id = j13;
            peerColor4.flags = i23 | 3;
            peerColor4.background_emoji_id = j13;
        } else {
            peerColor4.flags = i24 & (-3);
            peerColor4.background_emoji_id = 0L;
        }
        iArr[0] = iArr[0] + 1;
        final int i25 = 2;
        getConnectionsManager().sendRequest(tL_channels_updateColor2, new RequestDelegate(this) { // from class: org.telegram.ui.ec
            public final /* synthetic */ bd b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i25) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                        }
                        y2Var.run(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                        }
                        y2Var.run(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                        }
                        y2Var.run(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                        }
                        y2Var.run(tL_error);
                        break;
                }
            }
        });
        if (this.r == this.s) {
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor3 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor3.channel = getMessagesController().getInputChannel(j12);
        tL_channels_updateColor3.for_profile = z10;
        if (chat.profile_color == null) {
        }
        i13 = this.s;
        if (i13 < 0) {
        }
        j10 = this.w;
        if (j10 == 0) {
        }
        iArr[i12] = iArr[i12] + 1;
        final int i162 = i11;
        getConnectionsManager().sendRequest(tL_channels_updateColor3, new RequestDelegate(this) { // from class: org.telegram.ui.ec
            public final /* synthetic */ bd b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i162) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                        }
                        y2Var.run(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                        }
                        y2Var.run(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                        }
                        y2Var.run(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                        }
                        y2Var.run(tL_error);
                        break;
                }
            }
        });
        if (!ChatThemeController.wallpaperEquals(this.E, this.F)) {
        }
        if (DialogObject.emojiStatusesEqual(this.x, this.y)) {
        }
        if (iArr[r13] != 0) {
        }
    }

    public void W0(int i10) {
    }
}
