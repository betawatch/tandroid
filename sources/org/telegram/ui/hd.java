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
import java.util.ArrayList;
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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public class hd extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public Drawable H;
    public SpannableStringBuilder I;
    public boolean J;
    public org.telegram.ui.Components.yj0 K;
    public org.telegram.ui.ActionBar.u0 L;
    public org.telegram.ui.Components.mm0 M;
    public tc N;
    public FrameLayout O;
    public di.d P;
    public qc Q;
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
    public org.telegram.ui.ActionBar.m2 l0;
    public rc m0;
    public long n;
    public float n0;
    public ValueAnimator o0;
    public boolean p0;
    public org.telegram.ui.ActionBar.c6 q0;
    public int r;
    public final SparseIntArray r0;
    public int s;
    public final org.telegram.ui.ActionBar.d5 s0;
    public final org.telegram.ui.ActionBar.d5 t0;
    public final org.telegram.ui.ActionBar.d5 u0;
    public long v;
    public final org.telegram.ui.ActionBar.d5 v0;
    public long w;
    public final Drawable w0;
    public TLRPC.EmojiStatus x;
    public final Drawable x0;
    public TLRPC.EmojiStatus y;
    public final Paint y0;

    public hd(long j10) {
        super(null);
        boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
        this.J = q6;
        this.R = 0;
        this.p0 = q6;
        this.r0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.y0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d7, this.resourceProvider));
        this.w0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.x0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.a = j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            this.b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j10, new bi.v2(29, this, chat));
        this.resourceProvider = new gd(this);
        this.s0 = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.t0 = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
        this.u0 = new org.telegram.ui.ActionBar.d5(0, true, false, this.resourceProvider);
        this.v0 = new org.telegram.ui.ActionBar.d5(0, true, true, this.resourceProvider);
    }

    public static void U(hd hdVar) {
        org.telegram.ui.ActionBar.c6 c6Var = hdVar.resourceProvider;
        if (c6Var instanceof gd) {
            hd hdVar2 = ((gd) c6Var).a;
            hdVar2.J = !hdVar2.J;
            hdVar2.d1();
            hdVar2.Z0(false);
        } else {
            hdVar.J = !hdVar.J;
            hdVar.d1();
        }
        hdVar.U0(hdVar.J, true);
        hdVar.Z0(false);
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
    public static void V(hd hdVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        int i10;
        int i11;
        long j10 = hdVar.a;
        if (hdVar.e != hdVar.f) {
            MessagesController.PeerColors peerColors = hdVar.getMessagesController().peerColors;
            MessagesController.PeerColor color = peerColors == null ? null : peerColors.getColor(hdVar.f);
            if (color != null && color.getLvl(hdVar.d) > hdVar.b) {
                i10 = color.getLvl(hdVar.d);
                if (hdVar.r != hdVar.s) {
                    MessagesController.PeerColors peerColors2 = hdVar.getMessagesController().profilePeerColors;
                    MessagesController.PeerColor color2 = peerColors2 != null ? peerColors2.getColor(hdVar.s) : null;
                    if (color2 != null && color2.getLvl(hdVar.d) > hdVar.b) {
                        i10 = color2.getLvl(hdVar.d);
                        i11 = 24;
                        int i12 = i10;
                        if (hdVar.h != hdVar.n && hdVar.getMessagesController().channelBgIconLevelMin > hdVar.b) {
                            i11 = 27;
                        }
                        if (hdVar.v != hdVar.w && hdVar.J0() > hdVar.b) {
                            i11 = 28;
                        }
                        if (!DialogObject.emojiStatusesEqual(hdVar.x, hdVar.y) && hdVar.F0() > hdVar.b) {
                            i11 = !(hdVar.y instanceof TLRPC.TL_emojiStatusCollectible) ? 26 : 25;
                        }
                        if (!ChatThemeController.wallpaperEquals(hdVar.E, hdVar.F)) {
                            i11 = !TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(hdVar.F)) ? 22 : 23;
                        }
                        int i13 = i11;
                        if (hdVar.getParentActivity() == null || hdVar.getParentActivity() == null) {
                            return;
                        }
                        oc ocVar = new oc(hdVar, hdVar.getParentActivity(), i13, hdVar.currentAccount, hdVar.getResourceProvider(), i12);
                        ocVar.H1(canApplyBoost);
                        ocVar.G1(hdVar.c, true);
                        ocVar.I1(j10);
                        TLRPC.Chat chat = hdVar.getMessagesController().getChat(Long.valueOf(-j10));
                        if (chat != null) {
                            ocVar.Q0 = new fc(1, hdVar, chat);
                        }
                        hdVar.showDialog(ocVar);
                        hdVar.P.setLoading(false);
                        return;
                    }
                }
                i11 = 20;
                int i122 = i10;
                if (hdVar.h != hdVar.n) {
                    i11 = 27;
                }
                if (hdVar.v != hdVar.w) {
                    i11 = 28;
                }
                if (!DialogObject.emojiStatusesEqual(hdVar.x, hdVar.y)) {
                    if (!(hdVar.y instanceof TLRPC.TL_emojiStatusCollectible)) {
                    }
                }
                if (!ChatThemeController.wallpaperEquals(hdVar.E, hdVar.F)) {
                }
                int i132 = i11;
                if (hdVar.getParentActivity() == null) {
                    return;
                } else {
                    return;
                }
            }
        }
        i10 = 0;
        if (hdVar.r != hdVar.s) {
        }
        i11 = 20;
        int i1222 = i10;
        if (hdVar.h != hdVar.n) {
        }
        if (hdVar.v != hdVar.w) {
        }
        if (!DialogObject.emojiStatusesEqual(hdVar.x, hdVar.y)) {
        }
        if (!ChatThemeController.wallpaperEquals(hdVar.E, hdVar.F)) {
        }
        int i1322 = i11;
        if (hdVar.getParentActivity() == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(hd hdVar, TLRPC.ChatFull chatFull, View view, int i10) {
        long j10;
        long emojiStatusDocumentId;
        long j11;
        long j12 = hdVar.a;
        int i11 = 0;
        if (!(view instanceof uc)) {
            if (i10 == hdVar.e0) {
                hdVar.s = -1;
                hdVar.w = 0L;
                if (hdVar.y instanceof TLRPC.TL_emojiStatusCollectible) {
                    hdVar.y = null;
                }
                hdVar.b1();
                hdVar.X0(true);
                hdVar.c1();
                hdVar.Z0(true);
                return;
            }
            if (i10 == hdVar.X) {
                Activity parentActivity = hdVar.getParentActivity();
                long j13 = hdVar.a;
                org.telegram.ui.ActionBar.c6 c6Var = hdVar.resourceProvider;
                lc lcVar = new lc(hdVar, i11);
                g gVar = new g(hdVar, 12);
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = hdVar.c;
                int i12 = org.telegram.ui.Components.zp.i0;
                org.telegram.ui.Components.vi viVar = new org.telegram.ui.Components.vi(parentActivity, hdVar, false, false, false, c6Var);
                viVar.drawNavigationBar = true;
                viVar.P1(LocaleController.getString(R.string.ChooseBackground));
                viVar.c2 = new org.telegram.ui.Components.op(viVar, tL_premium_boostsStatus, c6Var, gVar, j13, lcVar, hdVar);
                viVar.N1(1, false);
                viVar.t1();
                viVar.j0.f0();
                viVar.show();
                return;
            }
            return;
        }
        if (i10 == hdVar.j0) {
            if (chatFull == null) {
                return;
            }
            y70 y70Var = new y70(-j12);
            y70Var.e0(chatFull);
            hdVar.presentFragment(y70Var);
            return;
        }
        if (i10 == hdVar.U) {
            emojiStatusDocumentId = hdVar.n;
        } else if (i10 == hdVar.c0) {
            emojiStatusDocumentId = hdVar.w;
        } else {
            if (i10 != hdVar.f0) {
                j10 = 0;
                if (i10 != hdVar.h0) {
                    int H0 = hdVar.H0();
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = hdVar.c;
                    if (tL_premium_boostsStatus2 != null && tL_premium_boostsStatus2.level < H0) {
                        hdVar.T0(29);
                        return;
                    }
                    y70 y70Var2 = new y70(-j12, 0);
                    y70Var2.e0(chatFull);
                    hdVar.presentFragment(y70Var2);
                    return;
                }
                uc ucVar = (uc) view;
                boolean z10 = i10 == hdVar.f0;
                kc kcVar = new kc(hdVar, i10, view);
                int w02 = hdVar.y instanceof TLRPC.TL_emojiStatusCollectible ? org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.v6, hdVar.resourceProvider) : ucVar.f;
                if (hdVar.Q == null) {
                    org.telegram.ui.Components.q5 q5Var = ucVar.c;
                    i71[] i71VarArr = new i71[1];
                    boolean z11 = ((float) (ucVar.getHeight() + ucVar.getTop())) > ((float) hdVar.M.getMeasuredHeight()) / 2.0f;
                    int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                    int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                    Drawable[] drawableArr = q5Var.f;
                    Drawable drawable = drawableArr[1];
                    if (drawable != null) {
                        j11 = 0;
                        if (drawable instanceof org.telegram.ui.Components.s5) {
                            ((org.telegram.ui.Components.s5) drawable).p(q5Var);
                        }
                        drawableArr[1] = null;
                    } else {
                        j11 = 0;
                    }
                    q5Var.f();
                    ucVar.f();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(q5Var.getBounds());
                    int dp = z11 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(ucVar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    pc pcVar = new pc(hdVar, hdVar, hdVar.getParentActivity(), Integer.valueOf(rect.centerX() - (AndroidUtilities.displaySize.x - min2)), z10 ? z11 ? 10 : 9 : z11 ? 5 : 7, hdVar.getResourceProvider(), z11 ? 24 : 16, w02, kcVar, i71VarArr);
                    pcVar.g1 = true;
                    pcVar.setSelected(j10 == j11 ? null : Long.valueOf(j10));
                    pcVar.setSaveState(3);
                    pcVar.y(q5Var, ucVar);
                    qc qcVar = new qc(hdVar, pcVar);
                    hdVar.Q = qcVar;
                    i71VarArr[0] = qcVar;
                    qcVar.showAsDropDown(ucVar, 0, dp, 53);
                    i71VarArr[0].b();
                    return;
                }
                return;
            }
            TLRPC.EmojiStatus emojiStatus = hdVar.y;
            emojiStatusDocumentId = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id : DialogObject.getEmojiStatusDocumentId(emojiStatus);
        }
        j10 = emojiStatusDocumentId;
        if (i10 != hdVar.h0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Y0(View view) {
        if (view instanceof uc) {
            uc ucVar = (uc) view;
            ucVar.a.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, ucVar.d));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.r8) {
            ((org.telegram.ui.Cells.r8) view).v();
            return;
        }
        if (view instanceof yc) {
            yc ycVar = (yc) view;
            AndroidUtilities.forEachViews((RecyclerView) ycVar.b, (Utilities.Callback<View>) new vc(0, ycVar, MessagesController.getInstance(ycVar.d).peerColors));
            return;
        }
        if (view instanceof fd) {
            fd fdVar = (fd) view;
            ArrayList arrayList = fdVar.c;
            org.telegram.ui.ActionBar.c6 c6Var = fdVar.b;
            int a2 = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.yp) arrayList.get(i10)).c = a2;
            }
            AndroidUtilities.forEachViews((RecyclerView) fdVar.d, (Utilities.Callback<View>) new bd(fdVar, 0));
            fdVar.h.l();
        }
    }

    public int A0() {
        return 0;
    }

    public int B0() {
        return 0;
    }

    public final TLRPC.Document C0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0);
            }
        }
        return null;
    }

    public final long D0(TLRPC.StickerSet stickerSet) {
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

    public int E0() {
        return R.string.ChannelEmojiStatusInfo;
    }

    public int F0() {
        return getMessagesController().channelEmojiStatusLevelMin;
    }

    public int G0() {
        return R.string.ChannelEmojiStatus;
    }

    public int H0() {
        return 0;
    }

    public int I0() {
        return 3;
    }

    public int J0() {
        return getMessagesController().channelProfileIconLevelMin;
    }

    public int K0() {
        return R.string.ChannelProfileInfo;
    }

    public int L0() {
        return 0;
    }

    public int M0() {
        return 0;
    }

    public int N0() {
        return R.string.ChannelWallpaper2Info;
    }

    public int O0() {
        return getMessagesController().channelWallpaperLevelMin;
    }

    public int P0() {
        return R.string.ChannelWallpaper;
    }

    public final boolean Q0() {
        return (this.e == this.f && this.h == this.n && this.r == this.s && this.v == this.w && DialogObject.emojiStatusesEqual(this.x, this.y) && ChatThemeController.wallpaperEquals(this.E, this.F)) ? false : true;
    }

    public boolean R0() {
        return false;
    }

    public final int S0() {
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
            i10 = Math.max(i10, J0());
        }
        if (!DialogObject.emojiStatusesEqual(this.x, this.y)) {
            i10 = Math.max(i10, F0());
        }
        return !ChatThemeController.wallpaperEquals(this.E, this.F) ? Math.max(i10, O0()) : i10;
    }

    public final void U0(boolean z10, boolean z11) {
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

    public final void V0() {
        if (getVisibleDialog() != null) {
            return;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.nc
            public final /* synthetic */ hd b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        this.b.w0();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.nc
            public final /* synthetic */ hd b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        this.b.w0();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        showDialog(a2Var);
        ((TextView) a2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.q7));
    }

    public final void W0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.a));
            this.c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.b = i10;
            if (chat != null) {
                chat.level = i10;
            }
            tc tcVar = this.N;
            if (tcVar != null) {
                tcVar.l();
            }
            X0(true);
        }
    }

    public void X0(boolean z10) {
        if (this.P == null || this.c == null) {
            return;
        }
        int S0 = S0();
        if (this.b >= S0) {
            this.P.f(null, z10);
            return;
        }
        if (this.I == null) {
            this.I = new SpannableStringBuilder("l");
            org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.mini_switch_lock, 0);
            brVar.setTopOffset(1);
            this.I.setSpan(brVar, 0, 1, 33);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.I).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", S0, new Object[0]));
        this.P.f(spannableStringBuilder, z10);
    }

    public void Z0(boolean z10) {
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.s8));
        this.actionBar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.g6.A8) : -1);
        this.actionBar.D((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.g6.v8) : -1, false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.g6.t8), false);
        if (z10) {
            return;
        }
        org.telegram.ui.Components.mm0 mm0Var = this.M;
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        mm0Var.setBackgroundColor(getThemedColor(i10));
        this.N.l();
        AndroidUtilities.forEachViews((RecyclerView) this.M, (Utilities.Callback<View>) new bi.f(this));
        this.O.setBackgroundColor(getThemedColor(i10));
        this.P.j();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void a1(boolean z10) {
        MessageObject messageObject;
        View y02 = y0(this.S);
        View y03 = y0(this.T);
        View y04 = y0(this.U);
        View y05 = y0(this.W);
        if (y02 instanceof org.telegram.ui.Cells.ga) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) y02;
            org.telegram.ui.Cells.u1[] cells = gaVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f;
                    messageObject.overrideLinkEmoji = this.n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f7 = di.a7.f(this.H, this.currentAccount, this.F, this.J);
            this.H = f7;
            gaVar.setOverrideBackground(f7);
        }
        if (y03 instanceof dq0) {
            ((dq0) y03).a(this.f, z10);
        } else if (y03 instanceof yc) {
            ((yc) y03).a(this.f, z10);
        }
        if (y04 instanceof uc) {
            uc ucVar = (uc) y04;
            ucVar.a(this.currentAccount, this.f, true);
            ucVar.c(this.n, false, z10);
        }
        if (y05 instanceof fd) {
            fd fdVar = (fd) y05;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.F);
            if (wallpaperEmoticon == null && this.F == null && this.G != null) {
                wallpaperEmoticon = "❌";
            }
            fdVar.a(wallpaperEmoticon, z10);
            fdVar.setGalleryWallpaper(this.G);
        }
    }

    public final void b1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View y02 = y0(this.Z);
        View y03 = y0(this.b0);
        View y04 = y0(this.c0);
        View y05 = y0(this.f0);
        View y06 = y0(this.h0);
        View y07 = y0(this.j0);
        if (y02 instanceof ad) {
            TLRPC.EmojiStatus emojiStatus = this.y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                ad adVar = (ad) y02;
                zc zcVar = adVar.b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                zcVar.c(fromCollectible, true);
                adVar.a.c(fromCollectible, true);
                zcVar.d(((TLRPC.TL_emojiStatusCollectible) this.y).pattern_document_id, true, true);
            } else {
                ad adVar2 = (ad) y02;
                zc zcVar2 = adVar2.b;
                int i10 = this.s;
                zcVar2.b(i10, true);
                adVar2.a.b(adVar2.h.currentAccount, i10, true);
                zcVar2.d(this.w, false, true);
            }
            ad adVar3 = (ad) y02;
            zc zcVar3 = adVar3.b;
            zcVar3.e(DialogObject.getEmojiStatusDocumentId(this.y), false, true);
            zcVar3.a(this.f);
            adVar3.d();
        }
        if (y03 instanceof dq0) {
            ((dq0) y03).a(this.s, true);
        } else if (y03 instanceof yc) {
            ((yc) y03).a(this.f, true);
        }
        if (y04 instanceof uc) {
            uc ucVar = (uc) y04;
            ucVar.a(this.currentAccount, this.s, false);
            ucVar.c(this.w, false, true);
        }
        if (y05 instanceof uc) {
            TLRPC.EmojiStatus emojiStatus2 = this.y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((uc) y05).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((uc) y05).a(this.currentAccount, this.s, false);
            }
            ((uc) y05).c(DialogObject.getEmojiStatusDocumentId(this.y), DialogObject.isEmojiStatusCollectible(this.y), true);
        }
        boolean z10 = y06 instanceof uc;
        long j10 = this.a;
        if (z10) {
            uc ucVar2 = (uc) y06;
            ucVar2.a(this.currentAccount, this.s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull == null || (stickerSet2 = chatFull.emojiset) == null) {
                ucVar2.c(0L, false, false);
            } else {
                ucVar2.c(D0(stickerSet2), false, false);
            }
        }
        if (y07 instanceof uc) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j10);
            if (chatFull2 == null || (stickerSet = chatFull2.stickerset) == null) {
                ((uc) y07).c(0L, false, false);
            } else {
                ((uc) y07).d(C0(stickerSet));
            }
        }
        c1();
    }

    public void c1() {
        tc tcVar;
        tc tcVar2;
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
            if (!z10 && (tcVar = this.N) != null) {
                tcVar.o(i11);
                this.N.m(this.c0);
            }
        } else {
            int i12 = this.e0;
            this.e0 = -1;
            if (i12 >= 0 && (tcVar2 = this.N) != null) {
                tcVar2.u(i12);
                this.N.m(this.c0);
            }
        }
        int i13 = this.R;
        this.d0 = i13;
        this.f0 = i13 + 1;
        this.R = i13 + 3;
        this.g0 = i13 + 2;
    }

    @Override // org.telegram.ui.ActionBar.m2
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
        this.actionBar.setActionBarMenuOnItemClick(new nb(this, 1));
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
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.J9, this.resourceProvider);
        this.K.Q(w02, "Sunny");
        this.K.Q(w02, "Path 6");
        this.K.Q(w02, "Path");
        this.K.Q(w02, "Path 5");
        this.L = this.actionBar.n().d(1, this.K);
        FrameLayout frameLayout = new FrameLayout(context);
        c1();
        x0();
        if (!this.d) {
            this.actionBar.setAdaptiveBackground(this.M);
        }
        org.telegram.ui.Components.mm0 mm0Var = this.M;
        tc tcVar = new tc(this);
        this.N = tcVar;
        mm0Var.setAdapter(tcVar);
        new s4.s(3);
        this.M.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.M;
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        mm0Var2.setBackgroundColor(getThemedColor(i10));
        frameLayout.addView(this.M, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 68.0f, -1, 119));
        this.M.setOnItemClickListener(new bi.z5(4, this, chatFull));
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.es.h);
        kVar.C = false;
        kVar.m = false;
        this.M.setItemAnimator(kVar);
        di.d dVar = new di.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.P = dVar;
        dVar.g(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.P.setOnClickListener(new a(this, 11));
        X0(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.O.addView(this.P, w7.a6.a(48.0f, 10.0f, 10.0f, 10.0f, 10.0f, -1, 80));
        frameLayout.addView(this.O, w7.a6.e(-1, 68, 80));
        setBulletinDelegate(new c9(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
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
    public final void d1() {
        SparseIntArray R0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.e6 k10;
        View y02;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.g6.O0(string) == null || org.telegram.ui.ActionBar.g6.O0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.g6.O0(string2) == null || !org.telegram.ui.ActionBar.g6.O0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.f6 O0 = !this.J ? org.telegram.ui.ActionBar.g6.O0(str2) : org.telegram.ui.ActionBar.g6.O0(str);
            this.r0.clear();
            String[] strArr = new String[1];
            String str3 = O0.d;
            R0 = str3 == null ? org.telegram.ui.ActionBar.g6.R0(null, str3, strArr) : org.telegram.ui.ActionBar.g6.R0(new File(O0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.g6.ql;
            if (iArr != null) {
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    this.r0.put(i11, iArr[i11]);
                }
            }
            for (i10 = 0; i10 < R0.size(); i10++) {
                this.r0.put(R0.keyAt(i10), R0.valueAt(i10));
            }
            k10 = O0.k(false);
            if (k10 != null) {
                k10.c(R0, this.r0);
            }
            this.y0.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d7, this.resourceProvider));
            this.H = di.a7.f(this.H, this.currentAccount, this.F, this.J);
            y02 = y0(this.S);
            if (y02 instanceof org.telegram.ui.Cells.ga) {
                return;
            }
            ((org.telegram.ui.Cells.ga) y02).setOverrideBackground(this.H);
            return;
        }
        str = string;
        if (!this.J) {
        }
        this.r0.clear();
        String[] strArr2 = new String[1];
        String str32 = O0.d;
        if (str32 == null) {
        }
        iArr = org.telegram.ui.ActionBar.g6.ql;
        if (iArr != null) {
        }
        while (i10 < R0.size()) {
        }
        k10 = O0.k(false);
        if (k10 != null) {
        }
        this.y0.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d7, this.resourceProvider));
        this.H = di.a7.f(this.H, this.currentAccount, this.F, this.J);
        y02 = y0(this.S);
        if (y02 instanceof org.telegram.ui.Cells.ga) {
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatWasBoostedByUser;
        long j10 = this.a;
        if (i10 == i12) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                W0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (((Boolean) objArr[1]).booleanValue()) {
                return;
            }
            getMessagesController().getBoostsController().getBoostsStats(j10, new lc(this, 2));
        } else if (i10 == NotificationCenter.dialogDeleted && j10 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var == null || b5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !Q0() || this.b < S0();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onBackPressed(boolean z10) {
        if (this.b < S0() || !Q0()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        V0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public boolean onFragmentCreate() {
        getMediaDataController().loadRestrictedStatusEmojis();
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void setResourceProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.q0 = c6Var;
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
    public final void w0() {
        int[] iArr;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        long j10;
        ?? r13;
        if (this.c == null || this.P.N) {
            return;
        }
        int i14 = this.b;
        int S0 = S0();
        long j11 = this.a;
        int i15 = 1;
        if (i14 < S0) {
            this.P.setLoading(true);
            getMessagesController().getBoostsController().userCanBoostChannel(j11, this.c, new lc(this, i15));
            return;
        }
        int[] iArr2 = {0};
        final bi.u3 u3Var = new bi.u3(this, new boolean[]{false}, new int[]{0}, iArr2, 4);
        long j12 = -j11;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j12));
        if (chat == null) {
            FileLog.e("channel is null in ChannelColorAcitivity");
            org.telegram.messenger.q.r(R.string.UnknownError, org.telegram.ui.Components.zc.a0(this), R.raw.error, 36);
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
                    getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) { // from class: org.telegram.ui.jc
                        public final /* synthetic */ hd b;

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
                                    u3Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    u3Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    u3Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    u3Var.run(tL_error);
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
                    getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) { // from class: org.telegram.ui.jc
                        public final /* synthetic */ hd b;

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
                                    u3Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    u3Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    u3Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    u3Var.run(tL_error);
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
                    getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) { // from class: org.telegram.ui.jc
                        public final /* synthetic */ hd b;

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
                                    u3Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    u3Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    u3Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    }
                                    u3Var.run(tL_error);
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
        getConnectionsManager().sendRequest(tL_channels_updateColor2, new RequestDelegate(this) { // from class: org.telegram.ui.jc
            public final /* synthetic */ hd b;

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
                        u3Var.run(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        }
                        u3Var.run(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        }
                        u3Var.run(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        }
                        u3Var.run(tL_error);
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
        getConnectionsManager().sendRequest(tL_channels_updateColor3, new RequestDelegate(this) { // from class: org.telegram.ui.jc
            public final /* synthetic */ hd b;

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
                        u3Var.run(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        }
                        u3Var.run(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        }
                        u3Var.run(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                        }
                        u3Var.run(tL_error);
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

    public void x0() {
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(getParentActivity(), this.resourceProvider);
        this.M = mm0Var;
        mm0Var.setSections(false);
    }

    public final View y0(int i10) {
        for (int i11 = 0; i11 < this.M.getChildCount(); i11++) {
            View childAt = this.M.getChildAt(i11);
            this.M.getClass();
            if (RecyclerView.R(childAt) == i10) {
                return childAt;
            }
        }
        return null;
    }

    public int z0() {
        return getMessagesController().channelCustomWallpaperLevelMin;
    }

    public void T0(int i10) {
    }
}
