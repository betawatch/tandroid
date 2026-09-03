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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class dd extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper B;
    public TLRPC.WallPaper C;
    public TLRPC.WallPaper D;
    public Drawable E;
    public SpannableStringBuilder F;
    public boolean G;
    public org.telegram.ui.Components.gj0 H;
    public org.telegram.ui.ActionBar.w0 I;
    public org.telegram.ui.Components.rl0 J;
    public pc K;
    public FrameLayout L;
    public ph.d M;
    public lc N;
    public int O;
    public int P;
    public int Q;
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
    public org.telegram.ui.ActionBar.p2 i0;
    public mc j0;
    public float k0;
    public ValueAnimator l0;
    public boolean m0;
    public long n;
    public org.telegram.ui.ActionBar.f6 n0;
    public final SparseIntArray o0;
    public final org.telegram.ui.ActionBar.g5 p0;
    public final org.telegram.ui.ActionBar.g5 q0;
    public int r;
    public final org.telegram.ui.ActionBar.g5 r0;
    public int s;
    public final org.telegram.ui.ActionBar.g5 s0;
    public final Drawable t0;
    public final Drawable u0;
    public long v;
    public final Paint v0;
    public long w;
    public TLRPC.EmojiStatus x;
    public TLRPC.EmojiStatus y;

    public dd(long j10) {
        super(null);
        boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
        this.G = q10;
        this.O = 0;
        this.m0 = q10;
        this.o0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.v0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, this.resourceProvider));
        this.t0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.u0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.a = j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            this.b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j10, new nh.z1(1, this, chat));
        this.resourceProvider = new cd(this);
        this.p0 = new org.telegram.ui.ActionBar.g5(0, false, false, this.resourceProvider);
        this.q0 = new org.telegram.ui.ActionBar.g5(0, false, true, this.resourceProvider);
        this.r0 = new org.telegram.ui.ActionBar.g5(0, true, false, this.resourceProvider);
        this.s0 = new org.telegram.ui.ActionBar.g5(0, true, true, this.resourceProvider);
    }

    public static void U(dd ddVar) {
        org.telegram.ui.ActionBar.f6 f6Var = ddVar.resourceProvider;
        if (f6Var instanceof cd) {
            dd ddVar2 = ((cd) f6Var).a;
            ddVar2.G = !ddVar2.G;
            ddVar2.d1();
            ddVar2.Z0(false);
        } else {
            ddVar.G = !ddVar.G;
            ddVar.d1();
        }
        ddVar.U0(ddVar.G, true);
        ddVar.Z0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void V(dd ddVar, TLRPC.ChatFull chatFull, View view, int i10) {
        long j10;
        long emojiStatusDocumentId;
        long j11;
        long j12 = ddVar.a;
        int i11 = 1;
        if (!(view instanceof qc)) {
            if (i10 == ddVar.b0) {
                ddVar.s = -1;
                ddVar.w = 0L;
                if (ddVar.y instanceof TLRPC.TL_emojiStatusCollectible) {
                    ddVar.y = null;
                }
                ddVar.b1();
                ddVar.X0(true);
                ddVar.c1();
                ddVar.Z0(true);
                return;
            }
            if (i10 == ddVar.U) {
                Activity parentActivity = ddVar.getParentActivity();
                long j13 = ddVar.a;
                org.telegram.ui.ActionBar.f6 f6Var = ddVar.resourceProvider;
                y3 y3Var = new y3(ddVar, i11);
                h hVar = new h(ddVar, 12);
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ddVar.c;
                int i12 = org.telegram.ui.Components.jp.f0;
                org.telegram.ui.Components.li liVar = new org.telegram.ui.Components.li(parentActivity, ddVar, false, false, false, f6Var);
                liVar.drawNavigationBar = true;
                liVar.L1(LocaleController.getString(R.string.ChooseBackground));
                liVar.W1 = new org.telegram.ui.Components.xo(liVar, tL_premium_boostsStatus, f6Var, hVar, j13, y3Var, ddVar);
                liVar.J1(1, false);
                liVar.r1();
                liVar.g0.f0();
                liVar.show();
                return;
            }
            return;
        }
        if (i10 == ddVar.g0) {
            if (chatFull == null) {
                return;
            }
            o70 o70Var = new o70(-j12);
            o70Var.e0(chatFull);
            ddVar.presentFragment(o70Var);
            return;
        }
        if (i10 == ddVar.R) {
            emojiStatusDocumentId = ddVar.n;
        } else if (i10 == ddVar.Z) {
            emojiStatusDocumentId = ddVar.w;
        } else {
            if (i10 != ddVar.c0) {
                j10 = 0;
                if (i10 != ddVar.e0) {
                    int H0 = ddVar.H0();
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = ddVar.c;
                    if (tL_premium_boostsStatus2 != null && tL_premium_boostsStatus2.level < H0) {
                        ddVar.T0(29);
                        return;
                    }
                    o70 o70Var2 = new o70(-j12, 0);
                    o70Var2.e0(chatFull);
                    ddVar.presentFragment(o70Var2);
                    return;
                }
                qc qcVar = (qc) view;
                boolean z4 = i10 == ddVar.c0;
                ec ecVar = new ec(ddVar, i10, view);
                int v02 = ddVar.y instanceof TLRPC.TL_emojiStatusCollectible ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, ddVar.resourceProvider) : qcVar.f;
                if (ddVar.N == null) {
                    org.telegram.ui.Components.j5 j5Var = qcVar.c;
                    n61[] n61VarArr = new n61[1];
                    boolean z10 = ((float) (qcVar.getHeight() + qcVar.getTop())) > ((float) ddVar.J.getMeasuredHeight()) / 2.0f;
                    int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                    int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                    Drawable[] drawableArr = j5Var.f;
                    Drawable drawable = drawableArr[1];
                    if (drawable != null) {
                        j11 = 0;
                        if (drawable instanceof org.telegram.ui.Components.l5) {
                            ((org.telegram.ui.Components.l5) drawable).p(j5Var);
                        }
                        drawableArr[1] = null;
                    } else {
                        j11 = 0;
                    }
                    j5Var.f();
                    qcVar.f();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(j5Var.getBounds());
                    int dp = z10 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(qcVar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    kc kcVar = new kc(ddVar, ddVar, ddVar.getParentActivity(), Integer.valueOf(rect.centerX() - (AndroidUtilities.displaySize.x - min2)), z4 ? z10 ? 10 : 9 : z10 ? 5 : 7, ddVar.getResourceProvider(), z10 ? 24 : 16, v02, ecVar, n61VarArr);
                    kcVar.d1 = true;
                    kcVar.setSelected(j10 == j11 ? null : Long.valueOf(j10));
                    kcVar.setSaveState(3);
                    kcVar.y(j5Var, qcVar);
                    lc lcVar = new lc(ddVar, kcVar);
                    ddVar.N = lcVar;
                    n61VarArr[0] = lcVar;
                    lcVar.showAsDropDown(qcVar, 0, dp, 53);
                    n61VarArr[0].b();
                    return;
                }
                return;
            }
            TLRPC.EmojiStatus emojiStatus = ddVar.y;
            emojiStatusDocumentId = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id : DialogObject.getEmojiStatusDocumentId(emojiStatus);
        }
        j10 = emojiStatusDocumentId;
        if (i10 != ddVar.e0) {
        }
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
    public static void W(dd ddVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        int i10;
        int i11;
        long j10 = ddVar.a;
        if (ddVar.e != ddVar.f) {
            MessagesController.PeerColors peerColors = ddVar.getMessagesController().peerColors;
            MessagesController.PeerColor color = peerColors == null ? null : peerColors.getColor(ddVar.f);
            if (color != null && color.getLvl(ddVar.d) > ddVar.b) {
                i10 = color.getLvl(ddVar.d);
                if (ddVar.r != ddVar.s) {
                    MessagesController.PeerColors peerColors2 = ddVar.getMessagesController().profilePeerColors;
                    MessagesController.PeerColor color2 = peerColors2 != null ? peerColors2.getColor(ddVar.s) : null;
                    if (color2 != null && color2.getLvl(ddVar.d) > ddVar.b) {
                        i10 = color2.getLvl(ddVar.d);
                        i11 = 24;
                        int i12 = i10;
                        if (ddVar.h != ddVar.n && ddVar.getMessagesController().channelBgIconLevelMin > ddVar.b) {
                            i11 = 27;
                        }
                        if (ddVar.v != ddVar.w && ddVar.J0() > ddVar.b) {
                            i11 = 28;
                        }
                        if (!DialogObject.emojiStatusesEqual(ddVar.x, ddVar.y) && ddVar.F0() > ddVar.b) {
                            i11 = !(ddVar.y instanceof TLRPC.TL_emojiStatusCollectible) ? 26 : 25;
                        }
                        int i13 = !ChatThemeController.wallpaperEquals(ddVar.B, ddVar.C) ? !TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(ddVar.C)) ? 22 : 23 : i11;
                        if (ddVar.getParentActivity() == null || ddVar.getParentActivity() == null) {
                            return;
                        }
                        jc jcVar = new jc(ddVar, ddVar.getParentActivity(), i13, ddVar.currentAccount, ddVar.getResourceProvider(), i12);
                        jcVar.G1(canApplyBoost);
                        jcVar.F1(ddVar.c, true);
                        jcVar.H1(j10);
                        TLRPC.Chat chat = ddVar.getMessagesController().getChat(Long.valueOf(-j10));
                        if (chat != null) {
                            jcVar.N0 = new hc(0, ddVar, chat);
                        }
                        ddVar.showDialog(jcVar);
                        ddVar.M.setLoading(false);
                        return;
                    }
                }
                i11 = 20;
                int i122 = i10;
                if (ddVar.h != ddVar.n) {
                    i11 = 27;
                }
                if (ddVar.v != ddVar.w) {
                    i11 = 28;
                }
                if (!DialogObject.emojiStatusesEqual(ddVar.x, ddVar.y)) {
                    if (!(ddVar.y instanceof TLRPC.TL_emojiStatusCollectible)) {
                    }
                }
                if (!ChatThemeController.wallpaperEquals(ddVar.B, ddVar.C)) {
                }
                if (ddVar.getParentActivity() == null) {
                    return;
                } else {
                    return;
                }
            }
        }
        i10 = 0;
        if (ddVar.r != ddVar.s) {
        }
        i11 = 20;
        int i1222 = i10;
        if (ddVar.h != ddVar.n) {
        }
        if (ddVar.v != ddVar.w) {
        }
        if (!DialogObject.emojiStatusesEqual(ddVar.x, ddVar.y)) {
        }
        if (!ChatThemeController.wallpaperEquals(ddVar.B, ddVar.C)) {
        }
        if (ddVar.getParentActivity() == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Y0(View view) {
        if (view instanceof qc) {
            qc qcVar = (qc) view;
            qcVar.a.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, qcVar.d));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.n8) {
            ((org.telegram.ui.Cells.n8) view).v();
            return;
        }
        if (view instanceof uc) {
            uc ucVar = (uc) view;
            AndroidUtilities.forEachViews((RecyclerView) ucVar.b, (h5.d) new nh.z1(2, ucVar, MessagesController.getInstance(ucVar.d).peerColors));
            return;
        }
        if (view instanceof bd) {
            bd bdVar = (bd) view;
            ArrayList arrayList = bdVar.c;
            org.telegram.ui.ActionBar.f6 f6Var = bdVar.b;
            int a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.ip) arrayList.get(i10)).c = a2;
            }
            AndroidUtilities.forEachViews((RecyclerView) bdVar.d, (h5.d) new xc(bdVar, 0));
            bdVar.h.l();
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
        return (this.e == this.f && this.h == this.n && this.r == this.s && this.v == this.w && DialogObject.emojiStatusesEqual(this.x, this.y) && ChatThemeController.wallpaperEquals(this.B, this.C)) ? false : true;
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
        return !ChatThemeController.wallpaperEquals(this.B, this.C) ? Math.max(i10, O0()) : i10;
    }

    public final void U0(boolean z4, boolean z10) {
        if (this.m0 == z4) {
            return;
        }
        this.m0 = z4;
        if (z10) {
            org.telegram.ui.Components.gj0 gj0Var = this.H;
            gj0Var.N(z4 ? gj0Var.e[0] : 0);
            org.telegram.ui.Components.gj0 gj0Var2 = this.H;
            if (gj0Var2 != null) {
                gj0Var2.start();
                return;
            }
            return;
        }
        int i10 = z4 ? this.H.e[0] - 1 : 0;
        this.H.L(i10, false, true);
        this.H.N(i10);
        org.telegram.ui.ActionBar.w0 w0Var = this.I;
        if (w0Var != null) {
            w0Var.invalidate();
        }
    }

    public final void V0() {
        if (getVisibleDialog() != null) {
            return;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.ic
            public final /* synthetic */ dd b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
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
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.ic
            public final /* synthetic */ dd b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i112) {
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
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        showDialog(d2Var);
        ((TextView) d2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.q7));
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
            pc pcVar = this.K;
            if (pcVar != null) {
                pcVar.l();
            }
            X0(true);
        }
    }

    public void X0(boolean z4) {
        if (this.M == null || this.c == null) {
            return;
        }
        int S0 = S0();
        if (this.b >= S0) {
            this.M.f(null, z4);
            return;
        }
        if (this.F == null) {
            this.F = new SpannableStringBuilder("l");
            org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(R.drawable.mini_switch_lock, 0);
            lqVar.setTopOffset(1);
            this.F.setSpan(lqVar, 0, 1, 33);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.F).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", S0, new Object[0]));
        this.M.f(spannableStringBuilder, z4);
    }

    public void Z0(boolean z4) {
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.s8));
        this.actionBar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.j6.A8) : -1);
        this.actionBar.C((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.j6.v8) : -1, false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.j6.t8), false);
        if (z4) {
            return;
        }
        org.telegram.ui.Components.rl0 rl0Var = this.J;
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        rl0Var.setBackgroundColor(getThemedColor(i10));
        this.K.l();
        AndroidUtilities.forEachViews((RecyclerView) this.J, (h5.d) new nh.e(this));
        this.L.setBackgroundColor(getThemedColor(i10));
        this.M.j();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void a1(boolean z4) {
        MessageObject messageObject;
        View y02 = y0(this.P);
        View y03 = y0(this.Q);
        View y04 = y0(this.R);
        View y05 = y0(this.T);
        if (y02 instanceof org.telegram.ui.Cells.da) {
            org.telegram.ui.Cells.da daVar = (org.telegram.ui.Cells.da) y02;
            org.telegram.ui.Cells.s1[] cells = daVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.s1 s1Var = cells[i10];
                if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f;
                    messageObject.overrideLinkEmoji = this.n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f10 = ph.k5.f(this.E, this.currentAccount, this.C, this.G);
            this.E = f10;
            daVar.setOverrideBackground(f10);
        }
        if (y03 instanceof kp0) {
            ((kp0) y03).a(this.f, z4);
        } else if (y03 instanceof uc) {
            ((uc) y03).a(this.f, z4);
        }
        if (y04 instanceof qc) {
            qc qcVar = (qc) y04;
            qcVar.a(this.currentAccount, this.f, true);
            qcVar.c(this.n, false, z4);
        }
        if (y05 instanceof bd) {
            bd bdVar = (bd) y05;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.C);
            if (wallpaperEmoticon == null && this.C == null && this.D != null) {
                wallpaperEmoticon = "❌";
            }
            bdVar.a(wallpaperEmoticon, z4);
            bdVar.setGalleryWallpaper(this.D);
        }
    }

    public final void b1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View y02 = y0(this.W);
        View y03 = y0(this.Y);
        View y04 = y0(this.Z);
        View y05 = y0(this.c0);
        View y06 = y0(this.e0);
        View y07 = y0(this.g0);
        if (y02 instanceof wc) {
            TLRPC.EmojiStatus emojiStatus = this.y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                wc wcVar = (wc) y02;
                vc vcVar = wcVar.b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                vcVar.c(fromCollectible, true);
                wcVar.a.c(fromCollectible, true);
                vcVar.d(((TLRPC.TL_emojiStatusCollectible) this.y).pattern_document_id, true, true);
            } else {
                wc wcVar2 = (wc) y02;
                vc vcVar2 = wcVar2.b;
                int i10 = this.s;
                vcVar2.b(i10, true);
                wcVar2.a.b(wcVar2.h.currentAccount, i10, true);
                vcVar2.d(this.w, false, true);
            }
            wc wcVar3 = (wc) y02;
            vc vcVar3 = wcVar3.b;
            vcVar3.e(DialogObject.getEmojiStatusDocumentId(this.y), false, true);
            vcVar3.a(this.f);
            wcVar3.e();
        }
        if (y03 instanceof kp0) {
            ((kp0) y03).a(this.s, true);
        } else if (y03 instanceof uc) {
            ((uc) y03).a(this.f, true);
        }
        if (y04 instanceof qc) {
            qc qcVar = (qc) y04;
            qcVar.a(this.currentAccount, this.s, false);
            qcVar.c(this.w, false, true);
        }
        if (y05 instanceof qc) {
            TLRPC.EmojiStatus emojiStatus2 = this.y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((qc) y05).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((qc) y05).a(this.currentAccount, this.s, false);
            }
            ((qc) y05).c(DialogObject.getEmojiStatusDocumentId(this.y), DialogObject.isEmojiStatusCollectible(this.y), true);
        }
        boolean z4 = y06 instanceof qc;
        long j10 = this.a;
        if (z4) {
            qc qcVar2 = (qc) y06;
            qcVar2.a(this.currentAccount, this.s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull == null || (stickerSet2 = chatFull.emojiset) == null) {
                qcVar2.c(0L, false, false);
            } else {
                qcVar2.c(D0(stickerSet2), false, false);
            }
        }
        if (y07 instanceof qc) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j10);
            if (chatFull2 == null || (stickerSet = chatFull2.stickerset) == null) {
                ((qc) y07).c(0L, false, false);
            } else {
                ((qc) y07).d(C0(stickerSet));
            }
        }
        c1();
    }

    public void c1() {
        pc pcVar;
        pc pcVar2;
        this.P = 0;
        int i10 = 1 + 1;
        this.Q = 1;
        this.R = i10;
        this.S = i10 + 1;
        this.T = i10 + 2;
        this.U = i10 + 3;
        this.V = i10 + 4;
        this.W = i10 + 5;
        this.Y = i10 + 6;
        int i11 = i10 + 8;
        this.O = i11;
        this.Z = i10 + 7;
        if (this.w != 0 || this.s >= 0 || (this.y instanceof TLRPC.TL_emojiStatusCollectible)) {
            boolean z4 = this.b0 >= 0;
            this.O = i10 + 9;
            this.b0 = i11;
            if (!z4 && (pcVar = this.K) != null) {
                pcVar.o(i11);
                this.K.m(this.Z);
            }
        } else {
            int i12 = this.b0;
            this.b0 = -1;
            if (i12 >= 0 && (pcVar2 = this.K) != null) {
                pcVar2.u(i12);
                this.K.m(this.Z);
            }
        }
        int i13 = this.O;
        this.a0 = i13;
        this.c0 = i13 + 1;
        this.O = i13 + 3;
        this.d0 = i13 + 2;
    }

    @Override // org.telegram.ui.ActionBar.p2
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
            this.C = wallPaper;
            this.B = wallPaper;
            if (ChatThemeController.isNotEmoticonWallpaper(wallPaper)) {
                this.D = this.B;
            }
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelColorTitle2));
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 16));
        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.H = gj0Var;
        gj0Var.h = true;
        if (this.G) {
            gj0Var.K(35);
            this.H.N(36);
        } else {
            gj0Var.N(0);
            this.H.K(0);
        }
        this.H.X = true;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J9, this.resourceProvider);
        this.H.O(v02, "Sunny");
        this.H.O(v02, "Path 6");
        this.H.O(v02, "Path");
        this.H.O(v02, "Path 5");
        this.I = this.actionBar.n().d(1, this.H);
        FrameLayout frameLayout = new FrameLayout(context);
        c1();
        x0();
        if (!this.d) {
            this.actionBar.setAdaptiveBackground(this.J);
        }
        org.telegram.ui.Components.rl0 rl0Var = this.J;
        pc pcVar = new pc(this);
        this.K = pcVar;
        rl0Var.setAdapter(pcVar);
        new f2.w(3);
        this.J.setLayoutManager(new f2.i0());
        org.telegram.ui.Components.rl0 rl0Var2 = this.J;
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        rl0Var2.setBackgroundColor(getThemedColor(i10));
        frameLayout.addView(this.J, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 68.0f));
        this.J.setOnItemClickListener(new gg.v0(5, this, chatFull));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.mr.h);
        lVar.C = false;
        lVar.m = false;
        this.J.setItemAnimator(lVar);
        ph.d dVar = new ph.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.M = dVar;
        dVar.g(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.M.setOnClickListener(new a(this, 12));
        X0(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.L.addView(this.M, k7.b6.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.L, k7.b6.e(-1, 68, 80));
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
            org.telegram.ui.ActionBar.i6 N0 = !this.G ? org.telegram.ui.ActionBar.j6.N0(str2) : org.telegram.ui.ActionBar.j6.N0(str);
            this.o0.clear();
            String[] strArr = new String[1];
            String str3 = N0.d;
            Q0 = str3 == null ? org.telegram.ui.ActionBar.j6.Q0(null, str3, strArr) : org.telegram.ui.ActionBar.j6.Q0(new File(N0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.j6.nl;
            if (iArr != null) {
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    this.o0.put(i11, iArr[i11]);
                }
            }
            for (i10 = 0; i10 < Q0.size(); i10++) {
                this.o0.put(Q0.keyAt(i10), Q0.valueAt(i10));
            }
            k10 = N0.k(false);
            if (k10 != null) {
                k10.c(Q0, this.o0);
            }
            this.v0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, this.resourceProvider));
            this.E = ph.k5.f(this.E, this.currentAccount, this.C, this.G);
            y02 = y0(this.P);
            if (y02 instanceof org.telegram.ui.Cells.da) {
                return;
            }
            ((org.telegram.ui.Cells.da) y02).setOverrideBackground(this.E);
            return;
        }
        str = string;
        if (!this.G) {
        }
        this.o0.clear();
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
        this.v0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, this.resourceProvider));
        this.E = ph.k5.f(this.E, this.currentAccount, this.C, this.G);
        y02 = y0(this.P);
        if (y02 instanceof org.telegram.ui.Cells.da) {
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
            getMessagesController().getBoostsController().getBoostsStats(j10, new gc(this, 1));
        } else if (i10 == NotificationCenter.dialogDeleted && j10 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
            if (e5Var == null || e5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !Q0() || this.b < S0();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (this.b < S0() || !Q0()) {
            return super.onBackPressed(z4);
        }
        if (!z4) {
            return false;
        }
        V0();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public boolean onFragmentCreate() {
        getMediaDataController().loadRestrictedStatusEmojis();
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void setResourceProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.n0 = f6Var;
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
        char c3;
        long j10;
        boolean z4;
        long j11;
        int i10;
        long j12;
        ?? r13;
        if (this.c == null || this.M.K) {
            return;
        }
        int i11 = this.b;
        int S0 = S0();
        long j13 = this.a;
        int i12 = 0;
        if (i11 < S0) {
            this.M.setLoading(true);
            getMessagesController().getBoostsController().userCanBoostChannel(j13, this.c, new gc(this, i12));
            return;
        }
        int[] iArr2 = {0};
        final gg.c1 c1Var = new gg.c1(this, new boolean[]{false}, new int[]{0}, iArr2, 5);
        long j14 = -j13;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j14));
        if (chat == null) {
            FileLog.e("channel is null in ChannelColorAcitivity");
            kf.k0.v(R.string.UnknownError, org.telegram.ui.Components.qc.a0(this), R.raw.error, 36);
            return;
        }
        this.M.setLoading(true);
        if (this.e == this.f) {
            iArr = iArr2;
            if (this.h == this.n) {
                j10 = j14;
                z4 = true;
                c3 = 0;
                if (this.r == this.s || this.v != this.w) {
                    TLRPC.TL_channels_updateColor tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
                    j11 = j10;
                    tL_channels_updateColor.channel = getMessagesController().getInputChannel(j11);
                    tL_channels_updateColor.for_profile = z4;
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
                    j12 = this.w;
                    if (j12 == 0) {
                        tL_channels_updateColor.flags |= 1;
                        tL_channels_updateColor.background_emoji_id = j12;
                        TLRPC.PeerColor peerColor2 = chat.profile_color;
                        peerColor2.flags |= 2;
                        peerColor2.background_emoji_id = j12;
                    } else {
                        TLRPC.PeerColor peerColor3 = chat.profile_color;
                        peerColor3.flags &= -3;
                        peerColor3.background_emoji_id = 0L;
                    }
                    iArr[c3] = iArr[c3] + 1;
                    final int i13 = 3;
                    getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) { // from class: org.telegram.ui.dc
                        public final /* synthetic */ dd b;

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
                                    c1Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    c1Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    c1Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    c1Var.run(tL_error);
                                    break;
                            }
                        }
                    });
                } else {
                    j11 = j10;
                }
                if (!ChatThemeController.wallpaperEquals(this.B, this.C)) {
                    TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
                    tL_messages_setChatWallPaper.peer = getMessagesController().getInputPeer(j13);
                    TLRPC.WallPaper wallPaper = this.C;
                    if (wallPaper != null) {
                        if (TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                            tL_messages_setChatWallPaper.flags |= 1;
                            TLRPC.WallPaper wallPaper2 = this.C;
                            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                                TLRPC.WallPaper wallPaper3 = this.C;
                                tL_inputWallPaper.id = wallPaper3.id;
                                tL_inputWallPaper.access_hash = wallPaper3.access_hash;
                                tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaper;
                            } else if (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) {
                                TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                                tL_inputWallPaperNoFile.id = this.C.id;
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
                            tL_wallPaperSettings.emoticon = ChatThemeController.getWallpaperEmoticon(this.C);
                        }
                    }
                    iArr[c3] = iArr[c3] + 1;
                    final int i14 = 0;
                    getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) { // from class: org.telegram.ui.dc
                        public final /* synthetic */ dd b;

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
                                    c1Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    c1Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    c1Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    c1Var.run(tL_error);
                                    break;
                            }
                        }
                    });
                    TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j11);
                    ChatThemeController.getInstance(this.currentAccount).saveChatWallpaper(j13, this.C);
                    if (chatFull != null) {
                        TLRPC.WallPaper wallPaper4 = this.C;
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
                    tL_channels_updateEmojiStatus.channel = getMessagesController().getInputChannel(j11);
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
                    getMessagesController().updateEmojiStatusUntilUpdate(j13, this.y);
                    r13 = 0;
                    final int i16 = 1;
                    iArr[0] = iArr[0] + 1;
                    getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) { // from class: org.telegram.ui.dc
                        public final /* synthetic */ dd b;

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
                                    c1Var.run(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    c1Var.run(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    c1Var.run(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    }
                                    c1Var.run(tL_error);
                                    break;
                            }
                        }
                    });
                } else {
                    r13 = 0;
                }
                if (iArr[r13] != 0) {
                    finishFragment();
                    this.M.setLoading(r13);
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
        tL_channels_updateColor2.channel = getMessagesController().getInputChannel(j14);
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
        c3 = 0;
        int i21 = i20 | 1;
        peerColor4.flags = i21;
        peerColor4.color = i19;
        j10 = j14;
        z4 = true;
        long j15 = this.n;
        if (j15 != 0) {
            tL_channels_updateColor2.flags = i18 | 5;
            tL_channels_updateColor2.background_emoji_id = j15;
            peerColor4.flags = i20 | 3;
            peerColor4.background_emoji_id = j15;
        } else {
            peerColor4.flags = i21 & (-3);
            peerColor4.background_emoji_id = 0L;
        }
        iArr[0] = iArr[0] + 1;
        final int i22 = 2;
        getConnectionsManager().sendRequest(tL_channels_updateColor2, new RequestDelegate(this) { // from class: org.telegram.ui.dc
            public final /* synthetic */ dd b;

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
                        c1Var.run(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        c1Var.run(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        c1Var.run(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        c1Var.run(tL_error);
                        break;
                }
            }
        });
        if (this.r == this.s) {
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor3 = new TLRPC.TL_channels_updateColor();
        j11 = j10;
        tL_channels_updateColor3.channel = getMessagesController().getInputChannel(j11);
        tL_channels_updateColor3.for_profile = z4;
        if (chat.profile_color == null) {
        }
        i10 = this.s;
        if (i10 < 0) {
        }
        j12 = this.w;
        if (j12 == 0) {
        }
        iArr[c3] = iArr[c3] + 1;
        final int i132 = 3;
        getConnectionsManager().sendRequest(tL_channels_updateColor3, new RequestDelegate(this) { // from class: org.telegram.ui.dc
            public final /* synthetic */ dd b;

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
                        c1Var.run(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        c1Var.run(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        c1Var.run(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        c1Var.run(tL_error);
                        break;
                }
            }
        });
        if (!ChatThemeController.wallpaperEquals(this.B, this.C)) {
        }
        if (DialogObject.emojiStatusesEqual(this.x, this.y)) {
        }
        if (iArr[r13] != 0) {
        }
    }

    public void x0() {
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(getParentActivity(), this.resourceProvider);
        this.J = rl0Var;
        rl0Var.setSections(false);
    }

    public final View y0(int i10) {
        for (int i11 = 0; i11 < this.J.getChildCount(); i11++) {
            View childAt = this.J.getChildAt(i11);
            this.J.getClass();
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
