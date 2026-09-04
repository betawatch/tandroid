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
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class bd extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public Drawable H;
    public SpannableStringBuilder I;
    public boolean J;
    public org.telegram.ui.Components.xi0 K;
    public org.telegram.ui.ActionBar.v0 L;
    public org.telegram.ui.Components.ll0 M;
    public oc N;
    public FrameLayout O;
    public di.d P;
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
    public org.telegram.ui.ActionBar.n2 l0;
    public mc m0;
    public long n;
    public float n0;
    public ValueAnimator o0;
    public boolean p0;
    public org.telegram.ui.ActionBar.f6 q0;
    public int r;
    public final SparseIntArray r0;
    public int s;
    public final org.telegram.ui.ActionBar.f5 s0;
    public final org.telegram.ui.ActionBar.f5 t0;
    public final org.telegram.ui.ActionBar.f5 u0;
    public long v;
    public final org.telegram.ui.ActionBar.f5 v0;
    public long w;
    public final Drawable w0;
    public TLRPC.EmojiStatus x;
    public final Drawable x0;
    public TLRPC.EmojiStatus y;
    public final Paint y0;

    public bd(long j3) {
        super(null);
        boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
        this.J = q6;
        this.R = 0;
        this.p0 = q6;
        this.r0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.y0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, this.resourceProvider));
        this.w0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.x0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.a = j3;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
        if (chat != null) {
            this.b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j3, new bi.t2(3, this, chat));
        this.resourceProvider = new ad(this);
        this.s0 = new org.telegram.ui.ActionBar.f5(0, false, false, this.resourceProvider);
        this.t0 = new org.telegram.ui.ActionBar.f5(0, false, true, this.resourceProvider);
        this.u0 = new org.telegram.ui.ActionBar.f5(0, true, false, this.resourceProvider);
        this.v0 = new org.telegram.ui.ActionBar.f5(0, true, true, this.resourceProvider);
    }

    public static void U(bd bdVar) {
        org.telegram.ui.ActionBar.f6 f6Var = bdVar.resourceProvider;
        if (f6Var instanceof ad) {
            bd bdVar2 = ((ad) f6Var).a;
            bdVar2.J = !bdVar2.J;
            bdVar2.d1();
            bdVar2.Z0(false);
        } else {
            bdVar.J = !bdVar.J;
            bdVar.d1();
        }
        bdVar.U0(bdVar.J, true);
        bdVar.Z0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void V(bd bdVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        int i10;
        int i11;
        long j3 = bdVar.a;
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
                        if (bdVar.v != bdVar.w && bdVar.J0() > bdVar.b) {
                            i11 = 28;
                        }
                        if (!DialogObject.emojiStatusesEqual(bdVar.x, bdVar.y) && bdVar.F0() > bdVar.b) {
                            i11 = !(bdVar.y instanceof TLRPC.TL_emojiStatusCollectible) ? 26 : 25;
                        }
                        int i13 = !ChatThemeController.wallpaperEquals(bdVar.E, bdVar.F) ? !TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(bdVar.F)) ? 22 : 23 : i11;
                        if (bdVar.getParentActivity() == null || bdVar.getParentActivity() == null) {
                            return;
                        }
                        jc jcVar = new jc(bdVar, bdVar.getParentActivity(), i13, bdVar.currentAccount, bdVar.getResourceProvider(), i12);
                        jcVar.G1(canApplyBoost);
                        jcVar.F1(bdVar.c, true);
                        jcVar.H1(j3);
                        TLRPC.Chat chat = bdVar.getMessagesController().getChat(Long.valueOf(-j3));
                        if (chat != null) {
                            jcVar.Q0 = new org.telegram.ui.ActionBar.c6(19, bdVar, chat);
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
        if (bdVar.getParentActivity() == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(bd bdVar, TLRPC.ChatFull chatFull, View view, int i10) {
        long j3;
        long emojiStatusDocumentId;
        long j10;
        long j11 = bdVar.a;
        int i11 = 1;
        if (!(view instanceof pc)) {
            if (i10 == bdVar.e0) {
                bdVar.s = -1;
                bdVar.w = 0L;
                if (bdVar.y instanceof TLRPC.TL_emojiStatusCollectible) {
                    bdVar.y = null;
                }
                bdVar.b1();
                bdVar.X0(true);
                bdVar.c1();
                bdVar.Z0(true);
                return;
            }
            if (i10 == bdVar.X) {
                Activity parentActivity = bdVar.getParentActivity();
                long j12 = bdVar.a;
                org.telegram.ui.ActionBar.f6 f6Var = bdVar.resourceProvider;
                t3 t3Var = new t3(bdVar, i11);
                g gVar = new g(bdVar, 12);
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = bdVar.c;
                int i12 = org.telegram.ui.Components.lp.i0;
                org.telegram.ui.Components.vi viVar = new org.telegram.ui.Components.vi(parentActivity, bdVar, false, false, false, f6Var);
                viVar.drawNavigationBar = true;
                viVar.L1(LocaleController.getString(R.string.ChooseBackground));
                viVar.Z1 = new org.telegram.ui.Components.ap(viVar, tL_premium_boostsStatus, f6Var, gVar, j12, t3Var, bdVar);
                viVar.J1(1, false);
                viVar.r1();
                viVar.j0.f0();
                viVar.show();
                return;
            }
            return;
        }
        if (i10 == bdVar.j0) {
            if (chatFull == null) {
                return;
            }
            u70 u70Var = new u70(-j11);
            u70Var.e0(chatFull);
            bdVar.presentFragment(u70Var);
            return;
        }
        if (i10 == bdVar.U) {
            emojiStatusDocumentId = bdVar.n;
        } else if (i10 == bdVar.c0) {
            emojiStatusDocumentId = bdVar.w;
        } else {
            if (i10 != bdVar.f0) {
                j3 = 0;
                if (i10 != bdVar.h0) {
                    int H0 = bdVar.H0();
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = bdVar.c;
                    if (tL_premium_boostsStatus2 != null && tL_premium_boostsStatus2.level < H0) {
                        bdVar.T0(29);
                        return;
                    }
                    u70 u70Var2 = new u70(-j11, 0);
                    u70Var2.e0(chatFull);
                    bdVar.presentFragment(u70Var2);
                    return;
                }
                pc pcVar = (pc) view;
                boolean z10 = i10 == bdVar.f0;
                ec ecVar = new ec(bdVar, i10, view);
                int v02 = bdVar.y instanceof TLRPC.TL_emojiStatusCollectible ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, bdVar.resourceProvider) : pcVar.f;
                if (bdVar.Q == null) {
                    org.telegram.ui.Components.o5 o5Var = pcVar.c;
                    a71[] a71VarArr = new a71[1];
                    boolean z11 = ((float) (pcVar.getHeight() + pcVar.getTop())) > ((float) bdVar.M.getMeasuredHeight()) / 2.0f;
                    int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                    int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                    Drawable[] drawableArr = o5Var.f;
                    Drawable drawable = drawableArr[1];
                    if (drawable != null) {
                        j10 = 0;
                        if (drawable instanceof org.telegram.ui.Components.q5) {
                            ((org.telegram.ui.Components.q5) drawable).p(o5Var);
                        }
                        drawableArr[1] = null;
                    } else {
                        j10 = 0;
                    }
                    o5Var.f();
                    pcVar.f();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(o5Var.getBounds());
                    int dp = z11 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(pcVar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    kc kcVar = new kc(bdVar, bdVar, bdVar.getParentActivity(), Integer.valueOf(rect.centerX() - (AndroidUtilities.displaySize.x - min2)), z10 ? z11 ? 10 : 9 : z11 ? 5 : 7, bdVar.getResourceProvider(), z11 ? 24 : 16, v02, ecVar, a71VarArr);
                    kcVar.g1 = true;
                    kcVar.setSelected(j3 == j10 ? null : Long.valueOf(j3));
                    kcVar.setSaveState(3);
                    kcVar.y(o5Var, pcVar);
                    lc lcVar = new lc(bdVar, kcVar);
                    bdVar.Q = lcVar;
                    a71VarArr[0] = lcVar;
                    lcVar.showAsDropDown(pcVar, 0, dp, 53);
                    a71VarArr[0].b();
                    return;
                }
                return;
            }
            TLRPC.EmojiStatus emojiStatus = bdVar.y;
            emojiStatusDocumentId = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id : DialogObject.getEmojiStatusDocumentId(emojiStatus);
        }
        j3 = emojiStatusDocumentId;
        if (i10 != bdVar.h0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Y0(View view) {
        if (view instanceof pc) {
            pc pcVar = (pc) view;
            pcVar.a.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, pcVar.d));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.r8) {
            ((org.telegram.ui.Cells.r8) view).v();
            return;
        }
        if (view instanceof sc) {
            sc scVar = (sc) view;
            AndroidUtilities.forEachViews((RecyclerView) scVar.b, (e2.h) new bi.t2(4, scVar, MessagesController.getInstance(scVar.d).peerColors));
            return;
        }
        if (view instanceof zc) {
            zc zcVar = (zc) view;
            ArrayList arrayList = zcVar.c;
            org.telegram.ui.ActionBar.f6 f6Var = zcVar.b;
            int a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.kp) arrayList.get(i10)).c = a2;
            }
            AndroidUtilities.forEachViews((RecyclerView) zcVar.d, (e2.h) new vc(zcVar, 0));
            zcVar.h.l();
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
        long j3 = stickerSet.thumb_document_id;
        if (j3 == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0).id;
            }
        }
        return j3;
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
            org.telegram.ui.Components.xi0 xi0Var = this.K;
            xi0Var.N(z10 ? xi0Var.e[0] : 0);
            org.telegram.ui.Components.xi0 xi0Var2 = this.K;
            if (xi0Var2 != null) {
                xi0Var2.start();
                return;
            }
            return;
        }
        int i10 = z10 ? this.K.e[0] - 1 : 0;
        this.K.L(i10, false, true);
        this.K.N(i10);
        org.telegram.ui.ActionBar.v0 v0Var = this.L;
        if (v0Var != null) {
            v0Var.invalidate();
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
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.hc
            public final /* synthetic */ bd b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
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
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.hc
            public final /* synthetic */ bd b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i112) {
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
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        showDialog(b2Var);
        ((TextView) b2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.q7));
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
            oc ocVar = this.N;
            if (ocVar != null) {
                ocVar.l();
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
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.mini_switch_lock, 0);
            nqVar.setTopOffset(1);
            this.I.setSpan(nqVar, 0, 1, 33);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.I).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", S0, new Object[0]));
        this.P.f(spannableStringBuilder, z10);
    }

    public void Z0(boolean z10) {
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.s8));
        this.actionBar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.j6.A8) : -1);
        this.actionBar.C((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.j6.v8) : -1, false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.j6.t8), false);
        if (z10) {
            return;
        }
        org.telegram.ui.Components.ll0 ll0Var = this.M;
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        ll0Var.setBackgroundColor(getThemedColor(i10));
        this.N.l();
        AndroidUtilities.forEachViews((RecyclerView) this.M, (e2.h) new bi.f(this));
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
        if (y02 instanceof org.telegram.ui.Cells.ia) {
            org.telegram.ui.Cells.ia iaVar = (org.telegram.ui.Cells.ia) y02;
            org.telegram.ui.Cells.t1[] cells = iaVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.t1 t1Var = cells[i10];
                if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f;
                    messageObject.overrideLinkEmoji = this.n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f7 = di.d7.f(this.H, this.currentAccount, this.F, this.J);
            this.H = f7;
            iaVar.setOverrideBackground(f7);
        }
        if (y03 instanceof yp0) {
            ((yp0) y03).a(this.f, z10);
        } else if (y03 instanceof sc) {
            ((sc) y03).a(this.f, z10);
        }
        if (y04 instanceof pc) {
            pc pcVar = (pc) y04;
            pcVar.a(this.currentAccount, this.f, true);
            pcVar.c(this.n, false, z10);
        }
        if (y05 instanceof zc) {
            zc zcVar = (zc) y05;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.F);
            if (wallpaperEmoticon == null && this.F == null && this.G != null) {
                wallpaperEmoticon = "❌";
            }
            zcVar.a(wallpaperEmoticon, z10);
            zcVar.setGalleryWallpaper(this.G);
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
        if (y02 instanceof uc) {
            TLRPC.EmojiStatus emojiStatus = this.y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                uc ucVar = (uc) y02;
                tc tcVar = ucVar.b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                tcVar.c(fromCollectible, true);
                ucVar.a.c(fromCollectible, true);
                tcVar.d(((TLRPC.TL_emojiStatusCollectible) this.y).pattern_document_id, true, true);
            } else {
                uc ucVar2 = (uc) y02;
                tc tcVar2 = ucVar2.b;
                int i10 = this.s;
                tcVar2.b(i10, true);
                ucVar2.a.b(ucVar2.h.currentAccount, i10, true);
                tcVar2.d(this.w, false, true);
            }
            uc ucVar3 = (uc) y02;
            tc tcVar3 = ucVar3.b;
            tcVar3.e(DialogObject.getEmojiStatusDocumentId(this.y), false, true);
            tcVar3.a(this.f);
            ucVar3.d();
        }
        if (y03 instanceof yp0) {
            ((yp0) y03).a(this.s, true);
        } else if (y03 instanceof sc) {
            ((sc) y03).a(this.f, true);
        }
        if (y04 instanceof pc) {
            pc pcVar = (pc) y04;
            pcVar.a(this.currentAccount, this.s, false);
            pcVar.c(this.w, false, true);
        }
        if (y05 instanceof pc) {
            TLRPC.EmojiStatus emojiStatus2 = this.y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((pc) y05).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((pc) y05).a(this.currentAccount, this.s, false);
            }
            ((pc) y05).c(DialogObject.getEmojiStatusDocumentId(this.y), DialogObject.isEmojiStatusCollectible(this.y), true);
        }
        boolean z10 = y06 instanceof pc;
        long j3 = this.a;
        if (z10) {
            pc pcVar2 = (pc) y06;
            pcVar2.a(this.currentAccount, this.s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j3);
            if (chatFull == null || (stickerSet2 = chatFull.emojiset) == null) {
                pcVar2.c(0L, false, false);
            } else {
                pcVar2.c(D0(stickerSet2), false, false);
            }
        }
        if (y07 instanceof pc) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j3);
            if (chatFull2 == null || (stickerSet = chatFull2.stickerset) == null) {
                ((pc) y07).c(0L, false, false);
            } else {
                ((pc) y07).d(C0(stickerSet));
            }
        }
        c1();
    }

    public void c1() {
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

    @Override // org.telegram.ui.ActionBar.n2
    public View createView(Context context) {
        MessagesController messagesController = getMessagesController();
        long j3 = -this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
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
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j3);
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
        this.actionBar.setActionBarMenuOnItemClick(new ic(this, 0));
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.K = xi0Var;
        xi0Var.h = true;
        if (this.J) {
            xi0Var.K(35);
            this.K.N(36);
        } else {
            xi0Var.N(0);
            this.K.K(0);
        }
        this.K.a0 = true;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J9, this.resourceProvider);
        this.K.O(v02, "Sunny");
        this.K.O(v02, "Path 6");
        this.K.O(v02, "Path");
        this.K.O(v02, "Path 5");
        this.L = this.actionBar.n().d(1, this.K);
        FrameLayout frameLayout = new FrameLayout(context);
        c1();
        x0();
        if (!this.d) {
            this.actionBar.setAdaptiveBackground(this.M);
        }
        org.telegram.ui.Components.ll0 ll0Var = this.M;
        oc ocVar = new oc(this);
        this.N = ocVar;
        ll0Var.setAdapter(ocVar);
        new s4.s(3);
        this.M.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.ll0 ll0Var2 = this.M;
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        ll0Var2.setBackgroundColor(getThemedColor(i10));
        frameLayout.addView(this.M, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 68.0f));
        this.M.setOnItemClickListener(new bi.x5(4, this, chatFull));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.pr.h);
        jVar.C = false;
        jVar.m = false;
        this.M.setItemAnimator(jVar);
        di.d dVar = new di.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.P = dVar;
        dVar.g(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.P.setOnClickListener(new a(this, 12));
        X0(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.O.addView(this.P, w7.x5.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.O, w7.x5.e(-1, 68, 80));
        setBulletinDelegate(new z8(this, 1));
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
        SparseIntArray Q0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.h6 k10;
        View y02;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.j6.N0(string) == null || org.telegram.ui.ActionBar.j6.N0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.j6.N0(string2) == null || !org.telegram.ui.ActionBar.j6.N0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (i6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.i6 N0 = !this.J ? org.telegram.ui.ActionBar.j6.N0(str2) : org.telegram.ui.ActionBar.j6.N0(str);
            this.r0.clear();
            String[] strArr = new String[1];
            String str3 = N0.d;
            Q0 = str3 == null ? org.telegram.ui.ActionBar.j6.Q0(null, str3, strArr) : org.telegram.ui.ActionBar.j6.Q0(new File(N0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.j6.nl;
            if (iArr != null) {
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    this.r0.put(i11, iArr[i11]);
                }
            }
            for (i10 = 0; i10 < Q0.size(); i10++) {
                this.r0.put(Q0.keyAt(i10), Q0.valueAt(i10));
            }
            k10 = N0.k(false);
            if (k10 != null) {
                k10.c(Q0, this.r0);
            }
            this.y0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, this.resourceProvider));
            this.H = di.d7.f(this.H, this.currentAccount, this.F, this.J);
            y02 = y0(this.S);
            if (y02 instanceof org.telegram.ui.Cells.ia) {
                return;
            }
            ((org.telegram.ui.Cells.ia) y02).setOverrideBackground(this.H);
            return;
        }
        str = string;
        if (!this.J) {
        }
        this.r0.clear();
        String[] strArr2 = new String[1];
        String str32 = N0.d;
        if (str32 == null) {
        }
        iArr = org.telegram.ui.ActionBar.j6.nl;
        if (iArr != null) {
        }
        while (i10 < Q0.size()) {
        }
        k10 = N0.k(false);
        if (k10 != null) {
        }
        this.y0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, this.resourceProvider));
        this.H = di.d7.f(this.H, this.currentAccount, this.F, this.J);
        y02 = y0(this.S);
        if (y02 instanceof org.telegram.ui.Cells.ia) {
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatWasBoostedByUser;
        long j3 = this.a;
        if (i10 == i12) {
            if (j3 == ((Long) objArr[2]).longValue()) {
                W0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (((Boolean) objArr[1]).booleanValue()) {
                return;
            }
            getMessagesController().getBoostsController().getBoostsStats(j3, new gc(this, 1));
        } else if (i10 == NotificationCenter.dialogDeleted && j3 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
            if (d5Var == null || d5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !Q0() || this.b < S0();
    }

    @Override // org.telegram.ui.ActionBar.n2
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

    @Override // org.telegram.ui.ActionBar.n2
    public boolean onFragmentCreate() {
        getMediaDataController().loadRestrictedStatusEmojis();
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setResourceProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.q0 = f6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0140  */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0() {
        int[] iArr;
        char c10;
        long j3;
        boolean z10;
        long j10;
        int i10;
        long j11;
        ?? r13;
        if (this.c == null || this.P.N) {
            return;
        }
        int i11 = this.b;
        int S0 = S0();
        long j12 = this.a;
        int i12 = 0;
        if (i11 < S0) {
            this.P.setLoading(true);
            getMessagesController().getBoostsController().userCanBoostChannel(j12, this.c, new gc(this, i12));
            return;
        }
        int[] iArr2 = {0};
        final bi.r3 r3Var = new bi.r3(this, new boolean[]{false}, new int[]{0}, iArr2, 3);
        long j13 = -j12;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j13));
        if (chat == null) {
            FileLog.e("channel is null in ChannelColorAcitivity");
            org.telegram.messenger.w1.o(R.string.UnknownError, org.telegram.ui.Components.yc.a0(this), R.raw.error, 36);
            return;
        }
        this.P.setLoading(true);
        if (this.e == this.f) {
            iArr = iArr2;
            if (this.h == this.n) {
                j3 = j13;
                z10 = true;
                c10 = 0;
                if (this.r == this.s || this.v != this.w) {
                    TLRPC.TL_channels_updateColor tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
                    j10 = j3;
                    tL_channels_updateColor.channel = getMessagesController().getInputChannel(j10);
                    tL_channels_updateColor.for_profile = z10;
                    if (chat.profile_color == null) {
                        chat.profile_color = new TLRPC.TL_peerColor();
                        chat.flags2 |= 256;
                    }
                    i10 = this.s;
                    if (i10 < 0) {
                        tL_channels_updateColor.flags |= 4;
                        tL_channels_updateColor.color = i10;
                        TLRPC.PeerColor peerColor = chat.profile_color;
                        peerColor.flags |= 1;
                        peerColor.color = i10;
                    } else {
                        chat.profile_color.flags &= -2;
                    }
                    j11 = this.w;
                    if (j11 == 0) {
                        tL_channels_updateColor.flags |= 1;
                        tL_channels_updateColor.background_emoji_id = j11;
                        TLRPC.PeerColor peerColor2 = chat.profile_color;
                        peerColor2.flags |= 2;
                        peerColor2.background_emoji_id = j11;
                    } else {
                        TLRPC.PeerColor peerColor3 = chat.profile_color;
                        peerColor3.flags &= -3;
                        peerColor3.background_emoji_id = 0L;
                    }
                    iArr[c10] = iArr[c10] + 1;
                    final int i13 = 3;
                    getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) { // from class: org.telegram.ui.dc
                        public final /* synthetic */ bd b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i13) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    r3Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    r3Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    r3Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    r3Var.run(tL_error);
                                    break;
                            }
                        }
                    });
                } else {
                    j10 = j3;
                }
                if (!ChatThemeController.wallpaperEquals(this.E, this.F)) {
                    TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
                    tL_messages_setChatWallPaper.peer = getMessagesController().getInputPeer(j12);
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
                    iArr[c10] = iArr[c10] + 1;
                    final int i14 = 0;
                    getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) { // from class: org.telegram.ui.dc
                        public final /* synthetic */ bd b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i14) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    r3Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    r3Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    r3Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    r3Var.run(tL_error);
                                    break;
                            }
                        }
                    });
                    TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
                    ChatThemeController.getInstance(this.currentAccount).saveChatWallpaper(j12, this.F);
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
                        int i15 = NotificationCenter.chatInfoDidLoad;
                        Boolean bool = Boolean.FALSE;
                        notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, chatFull, 0, bool, bool);
                    }
                }
                if (DialogObject.emojiStatusesEqual(this.x, this.y)) {
                    TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus = new TLRPC.TL_channels_updateEmojiStatus();
                    tL_channels_updateEmojiStatus.channel = getMessagesController().getInputChannel(j10);
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
                    getMessagesController().updateEmojiStatusUntilUpdate(j12, this.y);
                    r13 = 0;
                    final int i16 = 1;
                    iArr[0] = iArr[0] + 1;
                    getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) { // from class: org.telegram.ui.dc
                        public final /* synthetic */ bd b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i16) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    r3Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    r3Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    r3Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    r3Var.run(tL_error);
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
                int i17 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[r13] = Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS);
                notificationCenter2.lambda$postNotificationNameOnUIThread$1(i17, objArr);
                return;
            }
        } else {
            iArr = iArr2;
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor2 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor2.channel = getMessagesController().getInputChannel(j13);
        tL_channels_updateColor2.for_profile = false;
        if (chat.color == null) {
            chat.color = new TLRPC.TL_peerColor();
            chat.flags2 |= 128;
        }
        int i18 = tL_channels_updateColor2.flags;
        tL_channels_updateColor2.flags = i18 | 4;
        int i19 = this.f;
        tL_channels_updateColor2.color = i19;
        TLRPC.PeerColor peerColor4 = chat.color;
        int i20 = peerColor4.flags;
        c10 = 0;
        int i21 = i20 | 1;
        peerColor4.flags = i21;
        peerColor4.color = i19;
        j3 = j13;
        z10 = true;
        long j14 = this.n;
        if (j14 != 0) {
            tL_channels_updateColor2.flags = i18 | 5;
            tL_channels_updateColor2.background_emoji_id = j14;
            peerColor4.flags = i20 | 3;
            peerColor4.background_emoji_id = j14;
        } else {
            peerColor4.flags = i21 & (-3);
            peerColor4.background_emoji_id = 0L;
        }
        iArr[0] = iArr[0] + 1;
        final int i22 = 2;
        getConnectionsManager().sendRequest(tL_channels_updateColor2, new RequestDelegate(this) { // from class: org.telegram.ui.dc
            public final /* synthetic */ bd b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i22) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        r3Var.run(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        r3Var.run(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        r3Var.run(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        r3Var.run(tL_error);
                        break;
                }
            }
        });
        if (this.r == this.s) {
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor3 = new TLRPC.TL_channels_updateColor();
        j10 = j3;
        tL_channels_updateColor3.channel = getMessagesController().getInputChannel(j10);
        tL_channels_updateColor3.for_profile = z10;
        if (chat.profile_color == null) {
        }
        i10 = this.s;
        if (i10 < 0) {
        }
        j11 = this.w;
        if (j11 == 0) {
        }
        iArr[c10] = iArr[c10] + 1;
        final int i132 = 3;
        getConnectionsManager().sendRequest(tL_channels_updateColor3, new RequestDelegate(this) { // from class: org.telegram.ui.dc
            public final /* synthetic */ bd b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i132) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        r3Var.run(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        r3Var.run(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        r3Var.run(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        r3Var.run(tL_error);
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
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(getParentActivity(), this.resourceProvider);
        this.M = ll0Var;
        ll0Var.setSections(false);
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
