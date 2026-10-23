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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public class bd extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public Drawable H;
    public SpannableStringBuilder I;
    public boolean J;
    public org.telegram.ui.Components.yj0 K;
    public org.telegram.ui.ActionBar.u0 L;
    public org.telegram.ui.Components.mm0 M;
    public nc N;
    public FrameLayout O;
    public ei.d P;
    public kc Q;
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
    public org.telegram.ui.ActionBar.o2 l0;
    public lc m0;
    public long n;
    public float n0;
    public ValueAnimator o0;
    public boolean p0;
    public org.telegram.ui.ActionBar.g6 q0;
    public int r;
    public final SparseIntArray r0;
    public int s;
    public final org.telegram.ui.ActionBar.j5 s0;
    public final org.telegram.ui.ActionBar.j5 t0;
    public final org.telegram.ui.ActionBar.j5 u0;
    public long v;
    public final org.telegram.ui.ActionBar.j5 v0;
    public long w;
    public final Drawable w0;
    public TLRPC.EmojiStatus x;
    public final Drawable x0;
    public TLRPC.EmojiStatus y;
    public final Paint y0;

    public bd(long j10) {
        super(null);
        boolean q6 = org.telegram.ui.ActionBar.k6.I.q();
        this.J = q6;
        this.R = 0;
        this.p0 = q6;
        this.r0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.y0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d7, this.resourceProvider));
        this.w0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.x0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.a = j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            this.b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j10, new org.telegram.ui.ActionBar.m3(5, this, chat));
        this.resourceProvider = new ad(this);
        this.s0 = new org.telegram.ui.ActionBar.j5(0, false, false, this.resourceProvider);
        this.t0 = new org.telegram.ui.ActionBar.j5(0, false, true, this.resourceProvider);
        this.u0 = new org.telegram.ui.ActionBar.j5(0, true, false, this.resourceProvider);
        this.v0 = new org.telegram.ui.ActionBar.j5(0, true, true, this.resourceProvider);
    }

    public static void U(bd bdVar) {
        org.telegram.ui.ActionBar.g6 g6Var = bdVar.resourceProvider;
        if (g6Var instanceof ad) {
            bd bdVar2 = ((ad) g6Var).a;
            bdVar2.J = !bdVar2.J;
            bdVar2.f1();
            bdVar2.b1(false);
        } else {
            bdVar.J = !bdVar.J;
            bdVar.f1();
        }
        bdVar.W0(bdVar.J, true);
        bdVar.b1(false);
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
    public static void V(bd bdVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
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
                        if (bdVar.v != bdVar.w && bdVar.L0() > bdVar.b) {
                            i11 = 28;
                        }
                        if (!DialogObject.emojiStatusesEqual(bdVar.x, bdVar.y) && bdVar.H0() > bdVar.b) {
                            i11 = !(bdVar.y instanceof TLRPC.TL_emojiStatusCollectible) ? 26 : 25;
                        }
                        if (!ChatThemeController.wallpaperEquals(bdVar.E, bdVar.F)) {
                            i11 = !TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(bdVar.F)) ? 22 : 23;
                        }
                        int i13 = i11;
                        if (bdVar.getParentActivity() == null || bdVar.getParentActivity() == null) {
                            return;
                        }
                        ic icVar = new ic(bdVar, bdVar.getParentActivity(), i13, bdVar.currentAccount, bdVar.getResourceProvider(), i12);
                        icVar.K1(canApplyBoost);
                        icVar.J1(bdVar.c, true);
                        icVar.L1(j10);
                        TLRPC.Chat chat = bdVar.getMessagesController().getChat(Long.valueOf(-j10));
                        if (chat != null) {
                            icVar.Q0 = new h0(15, bdVar, chat);
                        }
                        bdVar.showDialog(icVar);
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
    public static void W(bd bdVar, TLRPC.ChatFull chatFull, View view, int i10) {
        long j10;
        long emojiStatusDocumentId;
        long j11;
        long j12 = bdVar.a;
        int i11 = 0;
        if (!(view instanceof oc)) {
            if (i10 == bdVar.e0) {
                bdVar.s = -1;
                bdVar.w = 0L;
                if (bdVar.y instanceof TLRPC.TL_emojiStatusCollectible) {
                    bdVar.y = null;
                }
                bdVar.d1();
                bdVar.Z0(true);
                bdVar.e1();
                bdVar.b1(true);
                return;
            }
            if (i10 == bdVar.X) {
                Activity parentActivity = bdVar.getParentActivity();
                long j13 = bdVar.a;
                org.telegram.ui.ActionBar.g6 g6Var = bdVar.resourceProvider;
                fc fcVar = new fc(bdVar, i11);
                f fVar = new f(bdVar, 12);
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = bdVar.c;
                int i12 = org.telegram.ui.Components.wp.l0;
                org.telegram.ui.Components.ti tiVar = new org.telegram.ui.Components.ti(parentActivity, bdVar, false, false, false, g6Var);
                tiVar.drawNavigationBar = true;
                tiVar.T1(LocaleController.getString(R.string.ChooseBackground));
                tiVar.c2 = new org.telegram.ui.Components.mp(tiVar, tL_premium_boostsStatus, g6Var, fVar, j13, fcVar, bdVar);
                tiVar.R1(1, false);
                tiVar.w1();
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
            e70 e70Var = new e70(-j12);
            e70Var.e0(chatFull);
            bdVar.presentFragment(e70Var);
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
                    int J0 = bdVar.J0();
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = bdVar.c;
                    if (tL_premium_boostsStatus2 != null && tL_premium_boostsStatus2.level < J0) {
                        bdVar.V0(29);
                        return;
                    }
                    e70 e70Var2 = new e70(-j12, 0);
                    e70Var2.e0(chatFull);
                    bdVar.presentFragment(e70Var2);
                    return;
                }
                oc ocVar = (oc) view;
                boolean z10 = i10 == bdVar.f0;
                ec ecVar = new ec(bdVar, i10, view);
                int w02 = bdVar.y instanceof TLRPC.TL_emojiStatusCollectible ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, bdVar.resourceProvider) : ocVar.f;
                if (bdVar.Q == null) {
                    org.telegram.ui.Components.p5 p5Var = ocVar.c;
                    s51[] s51VarArr = new s51[1];
                    boolean z11 = ((float) (ocVar.getHeight() + ocVar.getTop())) > ((float) bdVar.M.getMeasuredHeight()) / 2.0f;
                    int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                    int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                    Drawable[] drawableArr = p5Var.f;
                    Drawable drawable = drawableArr[1];
                    if (drawable != null) {
                        j11 = 0;
                        if (drawable instanceof org.telegram.ui.Components.r5) {
                            ((org.telegram.ui.Components.r5) drawable).p(p5Var);
                        }
                        drawableArr[1] = null;
                    } else {
                        j11 = 0;
                    }
                    p5Var.f();
                    ocVar.f();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(p5Var.getBounds());
                    int dp = z11 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(ocVar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    jc jcVar = new jc(bdVar, bdVar, bdVar.getParentActivity(), Integer.valueOf(rect.centerX() - (AndroidUtilities.displaySize.x - min2)), z10 ? z11 ? 10 : 9 : z11 ? 5 : 7, bdVar.getResourceProvider(), z11 ? 24 : 16, w02, ecVar, s51VarArr);
                    jcVar.g1 = true;
                    jcVar.setSelected(j10 == j11 ? null : Long.valueOf(j10));
                    jcVar.setSaveState(3);
                    jcVar.y(p5Var, ocVar);
                    kc kcVar = new kc(bdVar, jcVar);
                    bdVar.Q = kcVar;
                    s51VarArr[0] = kcVar;
                    kcVar.showAsDropDown(ocVar, 0, dp, 53);
                    s51VarArr[0].b();
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

    public static void a1(View view) {
        if (view instanceof oc) {
            ((oc) view).updateColors();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.r8) {
            ((org.telegram.ui.Cells.r8) view).updateColors();
        } else if (view instanceof rc) {
            ((rc) view).updateColors();
        } else if (view instanceof zc) {
            ((zc) view).updateColors();
        }
    }

    public final View A0(int i10) {
        for (int i11 = 0; i11 < this.M.getChildCount(); i11++) {
            View childAt = this.M.getChildAt(i11);
            this.M.getClass();
            if (RecyclerView.R(childAt) == i10) {
                return childAt;
            }
        }
        return null;
    }

    public int B0() {
        return getMessagesController().channelCustomWallpaperLevelMin;
    }

    public int C0() {
        return 0;
    }

    public int D0() {
        return 0;
    }

    public final TLRPC.Document E0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0);
            }
        }
        return null;
    }

    public final long F0(TLRPC.StickerSet stickerSet) {
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

    public int G0() {
        return R.string.ChannelEmojiStatusInfo;
    }

    public int H0() {
        return getMessagesController().channelEmojiStatusLevelMin;
    }

    public int I0() {
        return R.string.ChannelEmojiStatus;
    }

    public int J0() {
        return 0;
    }

    public int K0() {
        return 3;
    }

    public int L0() {
        return getMessagesController().channelProfileIconLevelMin;
    }

    public int M0() {
        return R.string.ChannelProfileInfo;
    }

    public int N0() {
        return 0;
    }

    public int O0() {
        return 0;
    }

    public int P0() {
        return R.string.ChannelWallpaper2Info;
    }

    public int Q0() {
        return getMessagesController().channelWallpaperLevelMin;
    }

    public int R0() {
        return R.string.ChannelWallpaper;
    }

    public final boolean S0() {
        return (this.e == this.f && this.h == this.n && this.r == this.s && this.v == this.w && DialogObject.emojiStatusesEqual(this.x, this.y) && ChatThemeController.wallpaperEquals(this.E, this.F)) ? false : true;
    }

    public boolean T0() {
        return false;
    }

    public final int U0() {
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
            i10 = Math.max(i10, L0());
        }
        if (!DialogObject.emojiStatusesEqual(this.x, this.y)) {
            i10 = Math.max(i10, H0());
        }
        return !ChatThemeController.wallpaperEquals(this.E, this.F) ? Math.max(i10, Q0()) : i10;
    }

    public final void W0(boolean z10, boolean z11) {
        if (this.p0 == z10) {
            return;
        }
        this.p0 = z10;
        if (z11) {
            org.telegram.ui.Components.yj0 yj0Var = this.K;
            yj0Var.P(z10 ? yj0Var.e[0] : 0);
            org.telegram.ui.Components.yj0 yj0Var2 = this.K;
            if (yj0Var2 != null) {
                yj0Var2.start();
                return;
            }
            return;
        }
        int i10 = z10 ? this.K.e[0] - 1 : 0;
        this.K.N(i10, false, true);
        this.K.P(i10);
        org.telegram.ui.ActionBar.u0 u0Var = this.L;
        if (u0Var != null) {
            u0Var.invalidate();
        }
    }

    public final void X0() {
        if (getVisibleDialog() != null) {
            return;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.hc
            public final /* synthetic */ bd b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        this.b.y0();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.hc
            public final /* synthetic */ bd b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        this.b.y0();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        showDialog(c2Var);
        org.telegram.ui.ActionBar.r6.W((TextView) c2Var.d(-2), org.telegram.ui.ActionBar.k6.q7, getResourceProvider());
    }

    public final void Y0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.a));
            this.c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.b = i10;
            if (chat != null) {
                chat.level = i10;
            }
            nc ncVar = this.N;
            if (ncVar != null) {
                ncVar.l();
            }
            Z0(true);
        }
    }

    public void Z0(boolean z10) {
        if (this.P == null || this.c == null) {
            return;
        }
        int U0 = U0();
        if (this.b >= U0) {
            this.P.g(null, z10);
            return;
        }
        if (this.I == null) {
            this.I = new SpannableStringBuilder("l");
            org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(R.drawable.mini_switch_lock, 0);
            xqVar.setTopOffset(1);
            this.I.setSpan(xqVar, 0, 1, 33);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.I).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", U0, new Object[0]));
        this.P.g(spannableStringBuilder, z10);
    }

    public void b1(boolean z10) {
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.s8));
        this.actionBar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.k6.A8) : -1);
        this.actionBar.B((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.k6.v8) : -1, false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.k6.t8), false);
        if (z10) {
            return;
        }
        org.telegram.ui.Components.mm0 mm0Var = this.M;
        int i10 = org.telegram.ui.ActionBar.k6.a7;
        mm0Var.setBackgroundColor(getThemedColor(i10));
        this.N.l();
        AndroidUtilities.forEachViews((RecyclerView) this.M, (Utilities.Callback<View>) new ci.e(this));
        this.O.setBackgroundColor(getThemedColor(i10));
        this.P.updateColors();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void c1(boolean z10) {
        MessageObject messageObject;
        View A0 = A0(this.S);
        View A02 = A0(this.T);
        View A03 = A0(this.U);
        View A04 = A0(this.W);
        if (A0 instanceof org.telegram.ui.Cells.ga) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) A0;
            org.telegram.ui.Cells.t1[] cells = gaVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.t1 t1Var = cells[i10];
                if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f;
                    messageObject.overrideLinkEmoji = this.n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f7 = ei.r6.f(this.H, this.currentAccount, this.F, this.J);
            this.H = f7;
            gaVar.setOverrideBackground(f7);
        }
        if (A02 instanceof ip0) {
            ((ip0) A02).a(this.f, z10);
        } else if (A02 instanceof rc) {
            ((rc) A02).a(this.f, z10);
        }
        if (A03 instanceof oc) {
            oc ocVar = (oc) A03;
            ocVar.a(this.currentAccount, this.f, true);
            ocVar.c(this.n, false, z10);
        }
        if (A04 instanceof zc) {
            zc zcVar = (zc) A04;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.F);
            if (wallpaperEmoticon == null && this.F == null && this.G != null) {
                wallpaperEmoticon = "❌";
            }
            zcVar.a(wallpaperEmoticon, z10);
            zcVar.setGalleryWallpaper(this.G);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public View createView(Context context) {
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
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelColorTitle2));
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 2));
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.K = yj0Var;
        yj0Var.h = true;
        if (this.J) {
            yj0Var.M(35);
            this.K.P(36);
        } else {
            yj0Var.P(0);
            this.K.M(0);
        }
        this.K.Z = true;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J9, this.resourceProvider);
        this.K.Q(w02, "Sunny");
        this.K.Q(w02, "Path 6");
        this.K.Q(w02, "Path");
        this.K.Q(w02, "Path 5");
        this.L = this.actionBar.m().d(1, this.K);
        FrameLayout frameLayout = new FrameLayout(context);
        e1();
        z0();
        if (!this.d) {
            this.actionBar.setAdaptiveBackground(this.M);
        }
        org.telegram.ui.Components.mm0 mm0Var = this.M;
        nc ncVar = new nc(this);
        this.N = ncVar;
        mm0Var.setAdapter(ncVar);
        new s4.s(3);
        this.M.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.M;
        int i10 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.ActionBar.r6.i(i10, mm0Var2, getResourceProvider());
        frameLayout.addView(this.M, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 68.0f));
        this.M.setOnItemClickListener(new ci.x4(4, this, chatFull));
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.m = false;
        this.M.setItemAnimator(kVar);
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.P = dVar;
        dVar.i(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.P.setOnClickListener(new a(this, 12));
        Z0(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout2, getResourceProvider());
        this.O.addView(this.P, w7.z5.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.O, w7.z5.e(-1, 68, 80));
        setBulletinDelegate(new b9(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View A0 = A0(this.Z);
        View A02 = A0(this.b0);
        View A03 = A0(this.c0);
        View A04 = A0(this.f0);
        View A05 = A0(this.h0);
        View A06 = A0(this.j0);
        if (A0 instanceof tc) {
            TLRPC.EmojiStatus emojiStatus = this.y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                tc tcVar = (tc) A0;
                sc scVar = tcVar.b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                scVar.c(fromCollectible, true);
                tcVar.a.c(fromCollectible, true);
                scVar.d(((TLRPC.TL_emojiStatusCollectible) this.y).pattern_document_id, true, true);
            } else {
                tc tcVar2 = (tc) A0;
                sc scVar2 = tcVar2.b;
                int i10 = this.s;
                scVar2.b(i10, true);
                tcVar2.a.b(tcVar2.h.currentAccount, i10, true);
                scVar2.d(this.w, false, true);
            }
            tc tcVar3 = (tc) A0;
            sc scVar3 = tcVar3.b;
            scVar3.e(DialogObject.getEmojiStatusDocumentId(this.y), false, true);
            scVar3.a(this.f);
            tcVar3.updateColors();
        }
        if (A02 instanceof ip0) {
            ((ip0) A02).a(this.s, true);
        } else if (A02 instanceof rc) {
            ((rc) A02).a(this.f, true);
        }
        if (A03 instanceof oc) {
            oc ocVar = (oc) A03;
            ocVar.a(this.currentAccount, this.s, false);
            ocVar.c(this.w, false, true);
        }
        if (A04 instanceof oc) {
            TLRPC.EmojiStatus emojiStatus2 = this.y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((oc) A04).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((oc) A04).a(this.currentAccount, this.s, false);
            }
            ((oc) A04).c(DialogObject.getEmojiStatusDocumentId(this.y), DialogObject.isEmojiStatusCollectible(this.y), true);
        }
        boolean z10 = A05 instanceof oc;
        long j10 = this.a;
        if (z10) {
            oc ocVar2 = (oc) A05;
            ocVar2.a(this.currentAccount, this.s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull == null || (stickerSet2 = chatFull.emojiset) == null) {
                ocVar2.c(0L, false, false);
            } else {
                ocVar2.c(F0(stickerSet2), false, false);
            }
        }
        if (A06 instanceof oc) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j10);
            if (chatFull2 == null || (stickerSet = chatFull2.stickerset) == null) {
                ((oc) A06).c(0L, false, false);
            } else {
                ((oc) A06).d(E0(stickerSet));
            }
        }
        e1();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatWasBoostedByUser;
        long j10 = this.a;
        if (i10 == i12) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                Y0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (((Boolean) objArr[1]).booleanValue()) {
                return;
            }
            getMessagesController().getBoostsController().getBoostsStats(j10, new fc(this, 2));
        } else if (i10 == NotificationCenter.dialogDeleted && j10 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
            if (h5Var == null || h5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public void e1() {
        nc ncVar;
        nc ncVar2;
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
            if (!z10 && (ncVar = this.N) != null) {
                ncVar.o(i11);
                this.N.m(this.c0);
            }
        } else {
            int i12 = this.e0;
            this.e0 = -1;
            if (i12 >= 0 && (ncVar2 = this.N) != null) {
                ncVar2.u(i12);
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
    public final void f1() {
        SparseIntArray S0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.i6 k10;
        View A0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.k6.P0(string) == null || org.telegram.ui.ActionBar.k6.P0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.k6.P0(string2) == null || !org.telegram.ui.ActionBar.k6.P0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (j6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.j6 P0 = !this.J ? org.telegram.ui.ActionBar.k6.P0(str2) : org.telegram.ui.ActionBar.k6.P0(str);
            this.r0.clear();
            String[] strArr = new String[1];
            String str3 = P0.d;
            S0 = str3 == null ? org.telegram.ui.ActionBar.k6.S0(null, str3, strArr) : org.telegram.ui.ActionBar.k6.S0(new File(P0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.k6.ql;
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
            this.y0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d7, this.resourceProvider));
            this.H = ei.r6.f(this.H, this.currentAccount, this.F, this.J);
            A0 = A0(this.S);
            if (A0 instanceof org.telegram.ui.Cells.ga) {
                return;
            }
            ((org.telegram.ui.Cells.ga) A0).setOverrideBackground(this.H);
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
        iArr = org.telegram.ui.ActionBar.k6.ql;
        if (iArr != null) {
        }
        while (i10 < S0.size()) {
        }
        k10 = P0.k(false);
        if (k10 != null) {
        }
        this.y0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d7, this.resourceProvider));
        this.H = ei.r6.f(this.H, this.currentAccount, this.F, this.J);
        A0 = A0(this.S);
        if (A0 instanceof org.telegram.ui.Cells.ga) {
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !S0() || this.b < U0();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (this.b < U0() || !S0()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        X0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public boolean onFragmentCreate() {
        getMediaDataController().loadRestrictedStatusEmojis();
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            x0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void setResourceProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.q0 = g6Var;
    }

    public final void w0() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null) {
            return;
        }
        kVar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.k6.A8) : -1);
        this.actionBar.B((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.k6.v8) : -1, false);
    }

    public void x0() {
        w0();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.s8));
        }
        org.telegram.ui.Components.mm0 mm0Var = this.M;
        if (mm0Var != null) {
            mm0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        }
        FrameLayout frameLayout = this.O;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
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
    public final void y0() {
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
        int U0 = U0();
        long j11 = this.a;
        int i15 = 1;
        if (i14 < U0) {
            this.P.setLoading(true);
            getMessagesController().getBoostsController().userCanBoostChannel(j11, this.c, new fc(this, i15));
            return;
        }
        int[] iArr2 = {0};
        final ci.y2 y2Var = new ci.y2(this, new boolean[]{false}, new int[]{0}, iArr2, 4);
        long j12 = -j11;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j12));
        if (chat == null) {
            FileLog.e("channel is null in ChannelColorAcitivity");
            org.telegram.messenger.v0.p(R.string.UnknownError, org.telegram.ui.Components.xc.a0(this), R.raw.error, 36);
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
                    getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) { // from class: org.telegram.ui.dc
                        public final /* synthetic */ bd b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i16) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
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
                    getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) { // from class: org.telegram.ui.dc
                        public final /* synthetic */ bd b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i17) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
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
                    getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) { // from class: org.telegram.ui.dc
                        public final /* synthetic */ bd b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i19) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    y2Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
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
        getConnectionsManager().sendRequest(tL_channels_updateColor2, new RequestDelegate(this) { // from class: org.telegram.ui.dc
            public final /* synthetic */ bd b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i25) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        }
                        y2Var.run(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        }
                        y2Var.run(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        }
                        y2Var.run(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
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
        getConnectionsManager().sendRequest(tL_channels_updateColor3, new RequestDelegate(this) { // from class: org.telegram.ui.dc
            public final /* synthetic */ bd b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i162) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        }
                        y2Var.run(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        }
                        y2Var.run(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        }
                        y2Var.run(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
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

    public void z0() {
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(getParentActivity(), this.resourceProvider);
        this.M = mm0Var;
        mm0Var.setSections(false);
    }

    public void V0(int i10) {
    }
}
