package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Pair;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public abstract class sv0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.n2 {
    public static final int[] d2 = {0, 1, 2, 4};
    public static final es0 e2 = new es0(0);
    public final NumberTextView A0;
    public int A1;
    public final ha B0;
    public VelocityTracker B1;
    public final ImageView C0;
    public boolean C1;
    public final org.telegram.ui.ActionBar.g2 D0;
    public final eu0 D1;
    public final int E;
    public final ArrayList E0;
    public r40 E1;
    public final long F;
    public final ArrayList F0;
    public final org.telegram.ui.ActionBar.d6 F1;
    public final org.telegram.ui.ActionBar.k G;
    public final ArrayList G0;
    public final NotificationCenter.ObserversGroup G1;
    public final xt0 H;
    public final ArrayList H0;
    public boolean H1;
    public final mv0 I;
    public final it0 I0;
    public final AnimationNotificationsLocker I1;
    public final gv0 J;
    public final ft0 J0;
    public org.telegram.ui.i4 J1;
    public final fv0 K;
    public final org.telegram.ui.Cells.x0 K0;
    public int K1;
    public final fv0 L;
    public AnimatorSet L0;
    public boolean L1;
    public final fv0 M;
    public final mr0 M0;
    public int M1;
    public final zu0 N;
    public final ArrayList N0;
    public AnimatorSet N1;
    public final gu0 O;
    public float O0;
    public final SparseArray O1;
    public final du0 P;
    public final us P0;
    public long P1;
    public final bu0 Q;
    public final FrameLayout Q0;
    public boolean Q1;
    public final cv0 R;
    public final et0 R0;
    public int R1;
    public final dv0 S;
    public final int S0;
    public final pt0 S1;
    public final yt0 T;
    public final Paint T0;
    public ci.a7 T1;
    public final hs0 U;
    public boolean U0;
    public float U1;
    public final is0 V;
    public boolean V0;
    public boolean V1;
    public final ns0 W;
    public ah.i1 W0;
    public SpannableStringBuilder W1;
    public final int[] X0;
    public int X1;
    public int Y0;
    public final HashMap Y1;
    public final SparseArray[] Z0;
    public final HashMap Z1;
    public boolean a;
    public final cu0 a0;
    public int a1;
    public int a2;
    public boolean b;
    public final s4.y b0;
    public boolean b1;
    public int b2;
    public boolean c;
    public final au0 c0;
    public long c1;
    public final kh c2;
    public boolean d;
    public final pv0 d0;
    public TLRPC.ChatFull d1;
    public int e;
    public final gs0 e0;
    public TLRPC.UserFull e1;
    public int f;
    public final pv0 f0;
    public AnimatorSet f1;
    public final ou0 g0;
    public boolean g1;
    public float h;
    public final ou0 h0;
    public boolean h1;
    public final ou0 i0;
    public boolean i1;
    public final ju0 j0;
    public final long j1;
    public final lu0[] k0;
    public boolean k1;
    public final org.telegram.ui.ActionBar.u0 l0;
    public boolean l1;
    public final org.telegram.ui.ActionBar.u0 m0;
    public final int[] m1;
    public float n;
    public final org.telegram.ui.ActionBar.u0 n0;
    public float n1;
    public float o0;
    public boolean o1;
    public float p0;
    public int p1;
    public final TextView q0;
    public int q1;
    public boolean r;
    public final ImageView r0;
    public final ss0 r1;
    public int s;
    public final xj0 s0;
    public float s1;
    public final org.telegram.ui.ActionBar.u0 t0;
    public final hv0[] t1;
    public final org.telegram.ui.ActionBar.u0 u0;
    public final kv0 u1;
    public int v;
    public final org.telegram.ui.ActionBar.u0 v0;
    public final org.telegram.ui.ActionBar.n2 v1;
    public int w;
    public final org.telegram.ui.ActionBar.u0 w0;
    public int w1;
    public final Rect x;
    public int x0;
    public boolean x1;
    public final b10 y;
    public final Drawable y0;
    public boolean y1;
    public boolean z0;
    public int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b3a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0b43 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0c45 A[EDGE_INSN: B:169:0x0c45->B:170:0x0c45 BREAK  A[LOOP:3: B:140:0x091d->B:166:0x0b43], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0e1a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0e21 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x029a A[EDGE_INSN: B:47:0x029a->B:48:0x029a BREAK  A[LOOP:0: B:29:0x023d->B:42:0x0295], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03b6 A[LOOP:2: B:74:0x03b4->B:75:0x03b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sv0(Context context, long j10, kv0 kv0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, org.telegram.ui.ActionBar.n2 n2Var, eu0 eu0Var, int i13, org.telegram.ui.ActionBar.d6 d6Var, bh.b bVar) {
        super(context);
        int i14;
        TLRPC.ProfileTab profileTab;
        int i15;
        hv0[] hv0VarArr;
        int i16;
        ft0 ft0Var;
        int i17;
        int i18;
        cv0 cv0Var;
        ImageView imageView;
        Context context2;
        org.telegram.ui.ActionBar.u0 u0Var;
        float f7;
        org.telegram.ui.ActionBar.d6 d6Var2;
        sv0 sv0Var;
        int i19;
        int i20;
        int i21;
        lu0[] lu0VarArr;
        View view;
        boolean N;
        sv0 sv0Var2;
        ns0 ns0Var;
        int i22;
        int i23;
        ps0 ps0Var;
        ku0 ku0Var;
        ku0 ku0Var2;
        ku0 ku0Var3;
        ku0 ku0Var4;
        ku0 ku0Var5;
        ku0 ku0Var6;
        ku0 ku0Var7;
        ku0 ku0Var8;
        ku0 ku0Var9;
        ku0 ku0Var10;
        ku0 ku0Var11;
        ku0 ku0Var12;
        ku0 ku0Var13;
        ku0 ku0Var14;
        ku0 ku0Var15;
        rx0 rx0Var;
        rx0 rx0Var2;
        rx0 rx0Var3;
        rx0 rx0Var4;
        rx0 rx0Var5;
        rx0 rx0Var6;
        rx0 rx0Var7;
        rx0 rx0Var8;
        rx0 rx0Var9;
        rx0 rx0Var10;
        ku0 ku0Var16;
        rx0 rx0Var11;
        ku0 ku0Var17;
        ku0 ku0Var18;
        lu0 lu0Var;
        ps0 ps0Var2;
        ku0 ku0Var19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        TL_bots.BotInfo botInfo;
        sv0 sv0Var3 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        sv0Var3.x = new Rect();
        sv0Var3.k0 = new lu0[2];
        sv0Var3.E0 = new ArrayList(10);
        sv0Var3.F0 = new ArrayList(10);
        sv0Var3.G0 = new ArrayList(10);
        sv0Var3.H0 = new ArrayList(10);
        sv0Var3.M0 = new mr0(sv0Var3, 2);
        sv0Var3.N0 = new ArrayList();
        sv0Var3.T0 = new Paint();
        sv0Var3.Z0 = new SparseArray[]{new SparseArray(), new SparseArray()};
        sv0Var3.k1 = false;
        sv0Var3.l1 = false;
        sv0Var3.m1 = new int[]{3, 3};
        sv0Var3.r1 = new ss0(sv0Var3);
        sv0Var3.s1 = -5.0f;
        sv0Var3.t1 = new hv0[9];
        sv0Var3.I1 = new AnimationNotificationsLocker();
        sv0Var3.O1 = new SparseArray();
        sv0Var3.R1 = -1;
        sv0Var3.S1 = new pt0(sv0Var3);
        sv0Var3.U1 = 0.0f;
        sv0Var3.Y1 = new HashMap();
        sv0Var3.Z1 = new HashMap();
        gh.c cVar = new gh.c();
        cVar.a(sv0Var3.i0(org.telegram.ui.ActionBar.h6.d6));
        bh.b bVar2 = bVar == null ? new bh.b(cVar) : bVar;
        sv0Var3.E = i13;
        sv0Var3.F1 = d6Var;
        b10 b10Var = new b10(context);
        sv0Var3.y = b10Var;
        b10Var.setIsSingleCell(true);
        TLRPC.User user = n2Var.getMessagesController().getUser(Long.valueOf(j10));
        sv0Var3.u1 = kv0Var;
        sv0Var3.D1 = eu0Var;
        int[] iArr = kv0Var.c;
        long j11 = kv0Var.s;
        sv0Var3.F = j11;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j11 == 0 ? i10 : 0, iArr[7], iArr[8]};
        sv0Var3.X0 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            if (chatFull2 == null) {
                i14 = 1;
                profileTab = null;
                if (i11 != 14 || i11 == 10 || i11 == 11 || i11 == 6) {
                    sv0Var3.Y0 = i11;
                } else if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    sv0Var3.Y0 = 13;
                } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                    sv0Var3.Y0 = 8;
                } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || sv0Var3.x0()))) {
                    sv0Var3.Y0 = 8;
                } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                    if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                        int i29 = iArr2[i14];
                        i24 = -1;
                        if (i29 == -1 || i29 > 0) {
                            sv0Var3.Y0 = i14;
                        }
                    } else {
                        i24 = -1;
                    }
                    if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i28 = iArr2[5]) == i24 || i28 > 0)) {
                        sv0Var3.Y0 = 5;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i27 = iArr2[3]) == i24 || i27 > 0)) {
                        sv0Var3.Y0 = 3;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i26 = iArr2[4]) == i24 || i26 > 0)) {
                        sv0Var3.Y0 = 4;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i25 = iArr2[2]) == i24 || i25 > 0)) {
                        sv0Var3.Y0 = 2;
                    } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || sv0Var3.x0())) {
                        sv0Var3.Y0 = sv0Var3.getInitialTab();
                    } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                        int i30 = -1;
                        if (i11 == -1 || j11 != 0) {
                            int i31 = 0;
                            while (true) {
                                int[] iArr3 = sv0Var3.X0;
                                if (i31 >= iArr3.length) {
                                    break;
                                }
                                int i32 = iArr3[i31];
                                if (i32 == i30 || i32 > 0) {
                                    break;
                                }
                                i31++;
                                i30 = -1;
                            }
                            sv0Var3.Y0 = i31;
                        } else {
                            sv0Var3.Y0 = i11;
                        }
                    } else {
                        sv0Var3.Y0 = 14;
                    }
                } else {
                    sv0Var3.Y0 = 14;
                }
                sv0Var3.O0(i11);
                sv0Var3.d1 = chatFull2;
                sv0Var3.e1 = userFull;
                if (chatFull2 != null) {
                    sv0Var3.c1 = -chatFull2.migrated_from_chat_id;
                }
                sv0Var3.j1 = j10;
                i15 = 0;
                while (true) {
                    hv0VarArr = sv0Var3.t1;
                    if (i15 < hv0VarArr.length) {
                        break;
                    }
                    hv0VarArr[i15] = new hv0();
                    sv0Var3.t1[i15].j[0] = DialogObject.isEncryptedDialog(sv0Var3.j1) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
                    sv0Var3.t1[i15].j[1] = Integer.MAX_VALUE;
                    sv0Var3.R(i15);
                    if (sv0Var3.c1 != 0 && sv0Var3.d1 != null && sv0Var3.t1[i15].b[1].size() == 0) {
                        hv0 hv0Var = sv0Var3.t1[i15];
                        hv0Var.j[1] = sv0Var3.d1.migrated_from_max_id;
                        hv0Var.i[1] = false;
                    }
                    i15++;
                }
                sv0Var3.v1 = n2Var;
                sv0Var3.G = n2Var.getActionBar();
                sv0Var3.m1[0] = sv0Var3.U0() > 0 ? SharedConfig.mediaColumnsCount : sv0Var3.U0();
                sv0Var3.m1[1] = sv0Var3.U0() > 0 ? SharedConfig.storiesColumnsCount : sv0Var3.U0();
                sv0Var3.G1 = n2Var.getNotificationCenter().createObserversGroup(sv0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
                for (i16 = 0; i16 < 10; i16++) {
                    if (i11 == 4) {
                        dt0 dt0Var = new dt0(sv0Var3, context);
                        dt0Var.T.c();
                        sv0Var3.G0.add(dt0Var);
                    }
                }
                sv0Var3.S0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                sv0Var3.V0 = false;
                sv0Var3.W0 = null;
                ft0Var = sv0Var3.J0;
                if (ft0Var != null) {
                    ft0Var.g(false);
                }
                sv0Var3.U0 = false;
                Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
                sv0Var3.y0 = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(sv0Var3.i0(org.telegram.ui.ActionBar.h6.b7), PorterDuff.Mode.MULTIPLY));
                it0 it0Var = sv0Var3.I0;
                int currentTabId = it0Var == null ? it0Var.getCurrentTabId() : i11;
                it0 it0Var2 = new it0(sv0Var3, context, sv0Var3.F1);
                i17 = sv0Var3.Y0;
                if (i17 != -1) {
                    it0Var2.setInitialTabId(i17);
                    sv0Var3.Y0 = -1;
                }
                it0Var2.b0 = 320L;
                int i33 = org.telegram.ui.ActionBar.h6.Fh;
                int i34 = org.telegram.ui.ActionBar.h6.Eh;
                it0Var2.L = i33;
                it0Var2.M = i34;
                it0Var2.d();
                it0Var2.setUseMinimalWidth(true);
                it0Var2.setDelegate(new kt0(sv0Var3));
                sv0Var3.I0 = it0Var2;
                for (i18 = 1; i18 >= 0; i18--) {
                    sv0Var3.Z0[i18].clear();
                }
                sv0Var3.a1 = 0;
                sv0Var3.N0.clear();
                cv0Var = sv0Var3.R;
                if (cv0Var != null) {
                    cv0Var.w.clear();
                }
                if (!(sv0Var3 instanceof h40)) {
                    org.telegram.ui.ActionBar.y n10 = sv0Var3.G.n();
                    n10.addOnLayoutChangeListener(new jt0(sv0Var3));
                    if (sv0Var3.j1 == sv0Var3.v1.getUserConfig().getClientUserId() && (sv0Var3.v1 instanceof wa0) && sv0Var3.D()) {
                        sv0Var3.m0 = n10.a(11, R.drawable.outline_header_search);
                    }
                    org.telegram.ui.ActionBar.u0 a2 = n10.a(0, 0);
                    a2.F();
                    a2.H = new qt0(sv0Var3);
                    sv0Var3.n0 = a2;
                    a2.setTranslationY(AndroidUtilities.dp(10.0f));
                    ft0 ft0Var2 = sv0Var3.J0;
                    a2.setSearchFieldHint(LocaleController.getString((ft0Var2 != null && ft0Var2.a() && sv0Var3.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
                    a2.setContentDescription(LocaleController.getString("Search", R.string.Search));
                    a2.setVisibility(sv0Var3.x0() ? 8 : 4);
                }
                imageView = new ImageView(context);
                sv0Var3.r0 = imageView;
                imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
                imageView.setTranslationY(AndroidUtilities.dp(10.0f));
                imageView.setVisibility(4);
                if (!sv0Var3.r0() && !sv0Var3.v0()) {
                    sv0Var3.G.addView(imageView, w7.z5.e(48, 56, 85));
                    xj0 xj0Var = new xj0(context);
                    sv0Var3.s0 = xj0Var;
                    xj0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    xj0Var.e(R.raw.options_to_search, 24, 24);
                    xj0Var.getAnimatedDrawable().F *= 2.0f;
                    xj0Var.getAnimatedDrawable().h = true;
                    xj0Var.setColorFilter(new PorterDuffColorFilter(sv0Var3.i0(org.telegram.ui.ActionBar.h6.y8), PorterDuff.Mode.SRC_IN));
                    xj0Var.setVisibility(8);
                    sv0Var3.G.addView(xj0Var, w7.z5.e(48, 56, 85));
                }
                int i35 = 5;
                context2 = context;
                imageView.setOnClickListener(new wt0(sv0Var3, j10, d6Var, context));
                u0Var = sv0Var3.n0;
                if (u0Var != null) {
                    EditTextBoldCursor searchField = u0Var.getSearchField();
                    int i36 = org.telegram.ui.ActionBar.h6.G6;
                    searchField.setTextColor(sv0Var3.i0(i36));
                    searchField.setHintTextColor(sv0Var3.i0(org.telegram.ui.ActionBar.h6.Si));
                    searchField.setCursorColor(sv0Var3.i0(i36));
                }
                sv0Var3.x0 = 0;
                org.telegram.ui.ActionBar.n2 n2Var2 = sv0Var3.v1;
                jw0 jw0Var = (n2Var2 == null && (n2Var2.getFragmentView() instanceof jw0)) ? (jw0) sv0Var3.v1.getFragmentView() : null;
                ha haVar = new ha(context2, jw0Var);
                sv0Var3.B0 = haVar;
                haVar.setBackgroundColor(sv0Var3.i0(org.telegram.ui.ActionBar.h6.a7));
                haVar.setAlpha(0.0f);
                haVar.setClickable(true);
                haVar.setVisibility(4);
                ImageView imageView2 = new ImageView(context2);
                sv0Var3.C0 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(true);
                sv0Var3.D0 = g2Var;
                imageView2.setImageDrawable(g2Var);
                int i37 = org.telegram.ui.ActionBar.h6.y8;
                g2Var.a(sv0Var3.i0(i37));
                int i38 = org.telegram.ui.ActionBar.h6.z8;
                imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(sv0Var3.i0(i38), 1));
                imageView2.setContentDescription(LocaleController.getString("Close", R.string.Close));
                haVar.addView(imageView2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                sv0Var3.N0.add(imageView2);
                imageView2.setOnClickListener(new or0(sv0Var3, 0));
                NumberTextView numberTextView = new NumberTextView(context2);
                sv0Var3.A0 = numberTextView;
                numberTextView.setTextSize(18);
                numberTextView.setTypeface(AndroidUtilities.bold());
                numberTextView.setTextColor(sv0Var3.i0(i37));
                haVar.addView(numberTextView, w7.z5.m(1.0f, 0, -1, 18, 0, 0));
                sv0Var3.N0.add(numberTextView);
                if (!DialogObject.isEncryptedDialog(sv0Var3.j1)) {
                    if (!sv0Var3.x0()) {
                        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(sv0Var3.i0(i38), sv0Var3.i0(i37), context2, false);
                        sv0Var3.u0 = u0Var2;
                        u0Var2.setIcon(R.drawable.msg_message);
                        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrGoToMessage));
                        u0Var2.setDuplicateParentStateEnabled(false);
                        haVar.addView(u0Var2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        sv0Var3.N0.add(u0Var2);
                        u0Var2.setOnClickListener(new or0(sv0Var3, 1));
                        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(sv0Var3.i0(i38), sv0Var3.i0(i37), context2, false);
                        sv0Var3.t0 = u0Var3;
                        u0Var3.setIcon(R.drawable.msg_forward);
                        u0Var3.setContentDescription(LocaleController.getString(R.string.Forward));
                        u0Var3.setDuplicateParentStateEnabled(false);
                        haVar.addView(u0Var3, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        sv0Var3.N0.add(u0Var3);
                        u0Var3.setOnClickListener(new or0(sv0Var3, 2));
                    }
                    org.telegram.ui.ActionBar.u0 u0Var4 = new org.telegram.ui.ActionBar.u0(sv0Var3.i0(i38), sv0Var3.i0(i37), context2, false);
                    sv0Var3.v0 = u0Var4;
                    u0Var4.setIcon(R.drawable.msg_pin);
                    u0Var4.setContentDescription(LocaleController.getString(R.string.PinMessage));
                    u0Var4.setDuplicateParentStateEnabled(false);
                    u0Var4.setVisibility(8);
                    haVar.addView(u0Var4, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    sv0Var3.N0.add(u0Var4);
                    u0Var4.setOnClickListener(new or0(sv0Var3, 3));
                    org.telegram.ui.ActionBar.u0 u0Var5 = new org.telegram.ui.ActionBar.u0(sv0Var3.i0(i38), sv0Var3.i0(i37), context2, false);
                    sv0Var3.w0 = u0Var5;
                    u0Var5.setIcon(R.drawable.msg_unpin);
                    u0Var5.setContentDescription(LocaleController.getString(R.string.UnpinMessage));
                    u0Var5.setDuplicateParentStateEnabled(false);
                    u0Var5.setVisibility(8);
                    haVar.addView(u0Var5, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    sv0Var3.N0.add(u0Var5);
                    u0Var5.setOnClickListener(new or0(sv0Var3, 4));
                    sv0Var3.r1();
                }
                org.telegram.ui.ActionBar.u0 u0Var6 = new org.telegram.ui.ActionBar.u0(sv0Var3.i0(i38), sv0Var3.i0(i37), context2, false);
                sv0Var3.l0 = u0Var6;
                u0Var6.setIcon(R.drawable.msg_delete);
                u0Var6.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
                u0Var6.setDuplicateParentStateEnabled(false);
                haVar.addView(u0Var6, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                sv0Var3.N0.add(u0Var6);
                u0Var6.setOnClickListener(new or0(sv0Var3, i35));
                sv0Var3.H = new xt0(sv0Var3, context2);
                sv0Var3.I = new mv0(sv0Var3, context2);
                sv0Var3.K = new fv0(sv0Var3, context2, 1);
                sv0Var3.L = new fv0(sv0Var3, context2, 2);
                sv0Var3.M = new fv0(sv0Var3, context2, 4);
                sv0Var3.N = new zu0(sv0Var3, context2, sv0Var3.v1.getCurrentAccount(), sv0Var3.v1.getResourceProvider());
                sv0Var3.O = new gu0(sv0Var3, context2);
                sv0Var3.g0 = new ou0(sv0Var3, context2, 1);
                sv0Var3.h0 = new ou0(sv0Var3, context2, 4);
                sv0Var3.i0 = new ou0(sv0Var3, context2, 3);
                sv0Var3.j0 = new ju0(sv0Var3, context2);
                sv0Var3.P = new du0(sv0Var3, context2);
                sv0Var3.Q = new bu0(sv0Var3, context2);
                sv0Var3.R = new cv0(sv0Var3, context2);
                sv0Var3.S = new dv0(sv0Var3, context2);
                if (!sv0Var3.x0() && !sv0Var3.m0() && sv0Var3.F == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", sv0Var3.v1.getUserConfig().getClientUserId());
                    bundle.putInt("chatMode", 3);
                    yt0 yt0Var = new yt0(sv0Var3, context2, sv0Var3.v1.getParentLayout(), bundle);
                    sv0Var3.T = yt0Var;
                    long j12 = sv0Var3.j1;
                    org.telegram.ui.tn tnVar = yt0Var.a;
                    tnVar.d4 = j12;
                    tnVar.Qa = true;
                    yt0Var.setClipToOutline(true);
                    yt0Var.setOutlineProvider(new zt0());
                }
                cu0 cu0Var = new cu0(sv0Var3, context2);
                sv0Var3.a0 = cu0Var;
                if (sv0Var3.F == 0) {
                    cu0Var.e = arrayList;
                    cu0Var.d = currentTabId != 7 ? null : chatFull2;
                }
                sv0Var3.c0 = new au0(sv0Var3, context2);
                sv0Var3.b0 = new s4.y(new fs0(sv0Var3));
                sv0Var3.d0 = new pv0(sv0Var3, context2, false);
                sv0Var3.e0 = new gs0(sv0Var3, context2);
                sv0Var3.f0 = new pv0(sv0Var3, context2, true);
                sv0Var3.J = new gv0(sv0Var3, context2);
                f7 = 48.0f;
                if (!sv0Var3.s0()) {
                    sv0Var3.U = new hs0(sv0Var3, context2, sv0Var3.v1, sv0Var3.j1);
                } else if (sv0Var3.v1 instanceof ProfileActivity) {
                    TextView textView = new TextView(context2);
                    sv0Var3.q0 = textView;
                    textView.setText(LocaleController.getString(R.string.Save).toUpperCase());
                    textView.setTypeface(AndroidUtilities.bold());
                    int i39 = org.telegram.ui.ActionBar.h6.Oh;
                    textView.setTextColor(sv0Var3.i0(i39));
                    textView.setTextSize(1, 15.0f);
                    textView.setGravity(17);
                    textView.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.m1(0.15f, sv0Var3.i0(i39)), 3));
                    textView.setPadding(AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f), 0);
                    sv0Var3.G.addView(textView, w7.z5.e(-2, 56, 85));
                    textView.setOnClickListener(new or0(sv0Var3, 6));
                    textView.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setScaleX(0.4f);
                    textView.setScaleY(0.4f);
                    org.telegram.ui.ActionBar.n2 n2Var3 = sv0Var3.v1;
                    d6Var2 = d6Var;
                    is0 is0Var = new is0(n2Var3.getCurrentAccount(), ((ProfileActivity) sv0Var3.v1).a(), context2, n2Var3, d6Var2, sv0Var3);
                    context2 = context2;
                    sv0 sv0Var4 = sv0Var3;
                    sv0Var4.V = is0Var;
                    int dp = AndroidUtilities.dp(48.0f);
                    us usVar = sv0Var4.P0;
                    is0Var.setPaddingTop(dp + (usVar != null ? (int) usVar.c(0.0f) : 0));
                    sv0Var4.W = new ns0(sv0Var4, context2, jw0Var, sv0Var4.getStoriesController().B(sv0Var4.j1, true), new ms0(sv0Var4, context2, n2Var, d6Var2));
                    sv0Var = sv0Var4;
                    sv0Var.setWillNotDraw(false);
                    i19 = 0;
                    i20 = -1;
                    i21 = 0;
                    while (true) {
                        lu0VarArr = sv0Var.k0;
                        if (i21 >= lu0VarArr.length) {
                            break;
                        }
                        if (i21 == 0 && (lu0Var = lu0VarArr[i21]) != null && (ps0Var2 = lu0Var.x) != null) {
                            i20 = ps0Var2.L0();
                            if (i20 != sv0Var.k0[i21].x.B() - 1) {
                                ku0Var19 = sv0Var.k0[i21].h;
                                sl0 sl0Var = (sl0) ku0Var19.K(i20);
                                if (sl0Var != null) {
                                    i19 = sl0Var.a.getTop();
                                } else {
                                    i20 = -1;
                                }
                            } else {
                                i22 = i19;
                                i23 = -1;
                                os0 os0Var = new os0(sv0Var, context2);
                                sv0Var.addView(os0Var, w7.z5.a(-1.0f, 0.0f, sv0Var.D0(), 0.0f, 0.0f, -1, 51));
                                if (i21 == 1) {
                                    os0Var.setTranslationX(AndroidUtilities.displaySize.x);
                                }
                                sv0Var.k0[i21] = os0Var;
                                ps0Var = new ps0(sv0Var, os0Var);
                                os0Var.x = ps0Var;
                                ps0Var.z1(new qs0(sv0Var, os0Var));
                                sv0Var.k0[i21].d = new s4.k();
                                sv0Var.k0[i21].d.n(280L);
                                sv0Var.k0[i21].d.o(bs.h);
                                lu0 lu0Var2 = sv0Var.k0[i21];
                                lu0Var2.d.m = false;
                                lu0Var2.h = new rs0(sv0Var, context2, os0Var, ps0Var);
                                ku0Var = sv0Var.k0[i21].h;
                                ku0Var.setFastScrollEnabled(1);
                                ku0Var2 = sv0Var.k0[i21].h;
                                ku0Var2.setScrollingTouchSlop(1);
                                ku0Var3 = sv0Var.k0[i21].h;
                                ku0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
                                ku0Var4 = sv0Var.k0[i21].h;
                                ku0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                                ku0Var5 = sv0Var.k0[i21].h;
                                ku0Var5.setItemAnimator(null);
                                ku0Var6 = sv0Var.k0[i21].h;
                                ku0Var6.setClipToPadding(false);
                                ku0Var7 = sv0Var.k0[i21].h;
                                ku0Var7.setSectionsType(2);
                                ku0Var8 = sv0Var.k0[i21].h;
                                ku0Var8.setLayoutManager(ps0Var);
                                lu0 lu0Var3 = sv0Var.k0[i21];
                                ku0Var9 = lu0Var3.h;
                                lu0Var3.addView(ku0Var9, w7.z5.d(-1.0f, -1));
                                sv0Var.k0[i21].r = new ku0(context2, null);
                                lu0 lu0Var4 = sv0Var.k0[i21];
                                ku0 ku0Var20 = lu0Var4.r;
                                ts0 ts0Var = new ts0(sv0Var);
                                lu0Var4.s = ts0Var;
                                ku0Var20.setLayoutManager(ts0Var);
                                lu0 lu0Var5 = sv0Var.k0[i21];
                                lu0Var5.addView(lu0Var5.r, w7.z5.d(-1.0f, -1));
                                sv0Var.k0[i21].r.setVisibility(8);
                                sv0Var.k0[i21].r.i(new us0(os0Var));
                                ku0Var10 = sv0Var.k0[i21].h;
                                ku0Var10.i(new vs0(sv0Var, os0Var));
                                ku0Var11 = sv0Var.k0[i21].h;
                                float f10 = f7;
                                ku0Var11.setOnItemClickListener(new ai.q4(sv0Var, os0Var, context2, j10, d6Var2, 2));
                                ku0Var12 = sv0Var.k0[i21].h;
                                ku0Var12.setOnScrollListener(new xs0(sv0Var, os0Var, ps0Var));
                                ku0Var13 = sv0Var.k0[i21].h;
                                ku0Var13.setOnItemLongClickListener(new ys0(sv0Var, os0Var));
                                if (i21 == 0 && i23 != -1) {
                                    ps0Var.h1(i23, i22);
                                }
                                ku0Var14 = sv0Var.k0[i21].h;
                                sv0Var.k0[i21].y = new zs0(context2, ku0Var14);
                                sv0Var.k0[i21].y.setVisibility(8);
                                ku0Var15 = sv0Var.k0[i21].h;
                                ku0Var15.D0(sv0Var.k0[i21].y, w7.z5.d(-1.0f, -1));
                                sv0Var.k0[i21].v = new at0(sv0Var, context2, os0Var);
                                sv0Var.k0[i21].v.g();
                                sv0Var.k0[i21].v.setClipToOutline(true);
                                sv0Var.k0[i21].v.setOutlineProvider(new bt0());
                                if (i21 == 0) {
                                    sv0Var.k0[i21].setVisibility(8);
                                }
                                lu0 lu0Var6 = sv0Var.k0[i21];
                                lu0Var6.w = new ct0(sv0Var, context2, lu0Var6.v);
                                rx0Var = sv0Var.k0[i21].w;
                                rx0Var.d(8, false);
                                rx0Var2 = sv0Var.k0[i21].w;
                                rx0Var2.setAnimateLayoutChange(true);
                                lu0 lu0Var7 = sv0Var.k0[i21];
                                rx0Var3 = lu0Var7.w;
                                lu0Var7.addView(rx0Var3, w7.z5.d(-1.0f, -1));
                                rx0Var4 = sv0Var.k0[i21].w;
                                rx0Var4.setOnTouchListener(new di.d(23));
                                rx0Var5 = sv0Var.k0[i21].w;
                                rx0Var5.e(true, false);
                                rx0Var6 = sv0Var.k0[i21].w;
                                rx0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                rx0Var7 = sv0Var.k0[i21].w;
                                rx0Var7.f.setVisibility(8);
                                rx0Var8 = sv0Var.k0[i21].w;
                                rx0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                rx0Var9 = sv0Var.k0[i21].w;
                                rx0Var9.f.setVisibility(8);
                                rx0Var10 = sv0Var.k0[i21].w;
                                rx0Var10.addView(sv0Var.k0[i21].v, w7.z5.a(-1.0f, 12.0f, 60.0f, 12.0f, 12.0f, -1, 119));
                                ku0Var16 = sv0Var.k0[i21].h;
                                rx0Var11 = sv0Var.k0[i21].w;
                                ku0Var16.setEmptyView(rx0Var11);
                                ku0Var17 = sv0Var.k0[i21].h;
                                ku0Var17.m1(0, true);
                                lu0[] lu0VarArr2 = sv0Var.k0;
                                lu0 lu0Var8 = lu0VarArr2[i21];
                                ku0Var18 = lu0VarArr2[i21].h;
                                lu0Var8.E = new ll0(ku0Var18, sv0Var.k0[i21].x);
                                i21++;
                                f7 = f10;
                                d6Var2 = d6Var;
                                i19 = i22;
                                i20 = i23;
                            }
                        }
                        i22 = i19;
                        i23 = i20;
                        os0 os0Var2 = new os0(sv0Var, context2);
                        sv0Var.addView(os0Var2, w7.z5.a(-1.0f, 0.0f, sv0Var.D0(), 0.0f, 0.0f, -1, 51));
                        if (i21 == 1) {
                        }
                        sv0Var.k0[i21] = os0Var2;
                        ps0Var = new ps0(sv0Var, os0Var2);
                        os0Var2.x = ps0Var;
                        ps0Var.z1(new qs0(sv0Var, os0Var2));
                        sv0Var.k0[i21].d = new s4.k();
                        sv0Var.k0[i21].d.n(280L);
                        sv0Var.k0[i21].d.o(bs.h);
                        lu0 lu0Var22 = sv0Var.k0[i21];
                        lu0Var22.d.m = false;
                        lu0Var22.h = new rs0(sv0Var, context2, os0Var2, ps0Var);
                        ku0Var = sv0Var.k0[i21].h;
                        ku0Var.setFastScrollEnabled(1);
                        ku0Var2 = sv0Var.k0[i21].h;
                        ku0Var2.setScrollingTouchSlop(1);
                        ku0Var3 = sv0Var.k0[i21].h;
                        ku0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
                        ku0Var4 = sv0Var.k0[i21].h;
                        ku0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                        ku0Var5 = sv0Var.k0[i21].h;
                        ku0Var5.setItemAnimator(null);
                        ku0Var6 = sv0Var.k0[i21].h;
                        ku0Var6.setClipToPadding(false);
                        ku0Var7 = sv0Var.k0[i21].h;
                        ku0Var7.setSectionsType(2);
                        ku0Var8 = sv0Var.k0[i21].h;
                        ku0Var8.setLayoutManager(ps0Var);
                        lu0 lu0Var32 = sv0Var.k0[i21];
                        ku0Var9 = lu0Var32.h;
                        lu0Var32.addView(ku0Var9, w7.z5.d(-1.0f, -1));
                        sv0Var.k0[i21].r = new ku0(context2, null);
                        lu0 lu0Var42 = sv0Var.k0[i21];
                        ku0 ku0Var202 = lu0Var42.r;
                        ts0 ts0Var2 = new ts0(sv0Var);
                        lu0Var42.s = ts0Var2;
                        ku0Var202.setLayoutManager(ts0Var2);
                        lu0 lu0Var52 = sv0Var.k0[i21];
                        lu0Var52.addView(lu0Var52.r, w7.z5.d(-1.0f, -1));
                        sv0Var.k0[i21].r.setVisibility(8);
                        sv0Var.k0[i21].r.i(new us0(os0Var2));
                        ku0Var10 = sv0Var.k0[i21].h;
                        ku0Var10.i(new vs0(sv0Var, os0Var2));
                        ku0Var11 = sv0Var.k0[i21].h;
                        float f102 = f7;
                        ku0Var11.setOnItemClickListener(new ai.q4(sv0Var, os0Var2, context2, j10, d6Var2, 2));
                        ku0Var12 = sv0Var.k0[i21].h;
                        ku0Var12.setOnScrollListener(new xs0(sv0Var, os0Var2, ps0Var));
                        ku0Var13 = sv0Var.k0[i21].h;
                        ku0Var13.setOnItemLongClickListener(new ys0(sv0Var, os0Var2));
                        if (i21 == 0) {
                            ps0Var.h1(i23, i22);
                        }
                        ku0Var14 = sv0Var.k0[i21].h;
                        sv0Var.k0[i21].y = new zs0(context2, ku0Var14);
                        sv0Var.k0[i21].y.setVisibility(8);
                        ku0Var15 = sv0Var.k0[i21].h;
                        ku0Var15.D0(sv0Var.k0[i21].y, w7.z5.d(-1.0f, -1));
                        sv0Var.k0[i21].v = new at0(sv0Var, context2, os0Var2);
                        sv0Var.k0[i21].v.g();
                        sv0Var.k0[i21].v.setClipToOutline(true);
                        sv0Var.k0[i21].v.setOutlineProvider(new bt0());
                        if (i21 == 0) {
                        }
                        lu0 lu0Var62 = sv0Var.k0[i21];
                        lu0Var62.w = new ct0(sv0Var, context2, lu0Var62.v);
                        rx0Var = sv0Var.k0[i21].w;
                        rx0Var.d(8, false);
                        rx0Var2 = sv0Var.k0[i21].w;
                        rx0Var2.setAnimateLayoutChange(true);
                        lu0 lu0Var72 = sv0Var.k0[i21];
                        rx0Var3 = lu0Var72.w;
                        lu0Var72.addView(rx0Var3, w7.z5.d(-1.0f, -1));
                        rx0Var4 = sv0Var.k0[i21].w;
                        rx0Var4.setOnTouchListener(new di.d(23));
                        rx0Var5 = sv0Var.k0[i21].w;
                        rx0Var5.e(true, false);
                        rx0Var6 = sv0Var.k0[i21].w;
                        rx0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                        rx0Var7 = sv0Var.k0[i21].w;
                        rx0Var7.f.setVisibility(8);
                        rx0Var8 = sv0Var.k0[i21].w;
                        rx0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        rx0Var9 = sv0Var.k0[i21].w;
                        rx0Var9.f.setVisibility(8);
                        rx0Var10 = sv0Var.k0[i21].w;
                        rx0Var10.addView(sv0Var.k0[i21].v, w7.z5.a(-1.0f, 12.0f, 60.0f, 12.0f, 12.0f, -1, 119));
                        ku0Var16 = sv0Var.k0[i21].h;
                        rx0Var11 = sv0Var.k0[i21].w;
                        ku0Var16.setEmptyView(rx0Var11);
                        ku0Var17 = sv0Var.k0[i21].h;
                        ku0Var17.m1(0, true);
                        lu0[] lu0VarArr22 = sv0Var.k0;
                        lu0 lu0Var82 = lu0VarArr22[i21];
                        ku0Var18 = lu0VarArr22[i21].h;
                        lu0Var82.E = new ll0(ku0Var18, sv0Var.k0[i21].x);
                        i21++;
                        f7 = f102;
                        d6Var2 = d6Var;
                        i19 = i22;
                        i20 = i23;
                    }
                    float f11 = f7;
                    view = sv0Var.W;
                    if (view != null) {
                        sv0Var.addView(view, w7.z5.a(42.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 48));
                    }
                    org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(context2);
                    sv0Var.K0 = x0Var;
                    x0Var.X((int) (System.currentTimeMillis() / 1000), false, false);
                    x0Var.setAlpha(0.0f);
                    x0Var.Z(org.telegram.ui.ActionBar.h6.wc, org.telegram.ui.ActionBar.h6.kd);
                    x0Var.setTranslationY(-AndroidUtilities.dp(f11));
                    sv0Var.addView(x0Var, w7.z5.a(-2.0f, 0.0f, 52.0f, 0.0f, 0.0f, -2, 49));
                    N = sv0Var.N();
                    sv0Var2 = sv0Var;
                    if (!N) {
                        us usVar2 = new us(context2);
                        sv0Var.P0 = usVar2;
                        usVar2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
                        dh.d b10 = bVar2.b(usVar2, fh.c.n(d6Var));
                        b10.q(AndroidUtilities.dp(24.0f));
                        b10.p(AndroidUtilities.dp(7.0f));
                        usVar2.setBlurredBackground(b10);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        sv0Var.Q0 = frameLayout;
                        usVar2.addView(frameLayout);
                        usVar2.i(frameLayout, true, false);
                        usVar2.setOnAnimatedHeightChangedListener(new mr0(sv0Var, 0));
                        et0 et0Var = new et0(sv0Var, context2, n2Var, this, d6Var);
                        sv0Var.R0 = et0Var;
                        frameLayout.addView(et0Var);
                        usVar2.setCallFragmentContextView(et0Var);
                        sv0Var.addView(usVar2, w7.z5.a(-2.0f, 0.0f, 34.0f, 0.0f, 0.0f, -1, 48));
                        et0Var.setDelegate(new nr0(sv0Var));
                        dh.d b11 = bVar2.b(sv0Var.I0, fh.c.n(d6Var));
                        b11.q(AndroidUtilities.dp(18.0f));
                        b11.p(AndroidUtilities.dp(6.666f));
                        sv0Var.I0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                        sv0Var.I0.setClipToPadding(false);
                        sv0Var.I0.setBackground(null);
                        sv0Var.I0.setBlurredBackground(b11);
                        sv0Var.I0.setOpen(false);
                        sv0Var.addView(sv0Var.I0, w7.z5.a(50.0f, -2.0f, 0.0f, -2.0f, 0.0f, -2, 49));
                        Context context3 = sv0Var.getContext();
                        org.telegram.ui.ActionBar.n2 n2Var4 = sv0Var.v1;
                        sv0 sv0Var5 = sv0Var;
                        ft0 ft0Var3 = new ft0(n2Var4.getCurrentAccount(), sv0Var.m0() ? 0L : sv0Var.j1, context3, n2Var4, d6Var, sv0Var5);
                        sv0 sv0Var6 = sv0Var5;
                        sv0Var6.J0 = ft0Var3;
                        ft0Var3.d(bVar2, fh.c.n(d6Var));
                        ft0Var3.setShown(0.0f);
                        sv0Var6.addView(ft0Var3, w7.z5.a(38.0f, 0.0f, 4.0f, 0.0f, 0.0f, -1, 51));
                        sv0Var6.addView(sv0Var6.B0, w7.z5.e(-1, 48, 51));
                        sv0Var2 = sv0Var6;
                    }
                    sv0Var2.y1(false);
                    sv0Var2.o1(false);
                    if (sv0Var2.X0[0] >= 0) {
                        sv0Var2.B0(false);
                    }
                    ns0Var = sv0Var2.W;
                    if (ns0Var != null && i12 > 0) {
                        ns0Var.setInitialTabId(i12);
                    }
                    sv0Var2.c2 = new kh(sv0Var2, 2);
                }
                d6Var2 = d6Var;
                sv0Var = sv0Var3;
                sv0Var.setWillNotDraw(false);
                i19 = 0;
                i20 = -1;
                i21 = 0;
                while (true) {
                    lu0VarArr = sv0Var.k0;
                    if (i21 >= lu0VarArr.length) {
                    }
                    lu0 lu0Var622 = sv0Var.k0[i21];
                    lu0Var622.w = new ct0(sv0Var, context2, lu0Var622.v);
                    rx0Var = sv0Var.k0[i21].w;
                    rx0Var.d(8, false);
                    rx0Var2 = sv0Var.k0[i21].w;
                    rx0Var2.setAnimateLayoutChange(true);
                    lu0 lu0Var722 = sv0Var.k0[i21];
                    rx0Var3 = lu0Var722.w;
                    lu0Var722.addView(rx0Var3, w7.z5.d(-1.0f, -1));
                    rx0Var4 = sv0Var.k0[i21].w;
                    rx0Var4.setOnTouchListener(new di.d(23));
                    rx0Var5 = sv0Var.k0[i21].w;
                    rx0Var5.e(true, false);
                    rx0Var6 = sv0Var.k0[i21].w;
                    rx0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                    rx0Var7 = sv0Var.k0[i21].w;
                    rx0Var7.f.setVisibility(8);
                    rx0Var8 = sv0Var.k0[i21].w;
                    rx0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    rx0Var9 = sv0Var.k0[i21].w;
                    rx0Var9.f.setVisibility(8);
                    rx0Var10 = sv0Var.k0[i21].w;
                    rx0Var10.addView(sv0Var.k0[i21].v, w7.z5.a(-1.0f, 12.0f, 60.0f, 12.0f, 12.0f, -1, 119));
                    ku0Var16 = sv0Var.k0[i21].h;
                    rx0Var11 = sv0Var.k0[i21].w;
                    ku0Var16.setEmptyView(rx0Var11);
                    ku0Var17 = sv0Var.k0[i21].h;
                    ku0Var17.m1(0, true);
                    lu0[] lu0VarArr222 = sv0Var.k0;
                    lu0 lu0Var822 = lu0VarArr222[i21];
                    ku0Var18 = lu0VarArr222[i21].h;
                    lu0Var822.E = new ll0(ku0Var18, sv0Var.k0[i21].x);
                    i21++;
                    f7 = f102;
                    d6Var2 = d6Var;
                    i19 = i22;
                    i20 = i23;
                }
                float f112 = f7;
                view = sv0Var.W;
                if (view != null) {
                }
                org.telegram.ui.Cells.x0 x0Var2 = new org.telegram.ui.Cells.x0(context2);
                sv0Var.K0 = x0Var2;
                x0Var2.X((int) (System.currentTimeMillis() / 1000), false, false);
                x0Var2.setAlpha(0.0f);
                x0Var2.Z(org.telegram.ui.ActionBar.h6.wc, org.telegram.ui.ActionBar.h6.kd);
                x0Var2.setTranslationY(-AndroidUtilities.dp(f112));
                sv0Var.addView(x0Var2, w7.z5.a(-2.0f, 0.0f, 52.0f, 0.0f, 0.0f, -2, 49));
                N = sv0Var.N();
                sv0Var2 = sv0Var;
                if (!N) {
                }
                sv0Var2.y1(false);
                sv0Var2.o1(false);
                if (sv0Var2.X0[0] >= 0) {
                }
                ns0Var = sv0Var2.W;
                if (ns0Var != null) {
                    ns0Var.setInitialTabId(i12);
                }
                sv0Var2.c2 = new kh(sv0Var2, 2);
            }
            profileTab = chatFull2.main_tab;
        }
        i14 = 1;
        if (i11 != 14) {
        }
        sv0Var3.Y0 = i11;
        sv0Var3.O0(i11);
        sv0Var3.d1 = chatFull2;
        sv0Var3.e1 = userFull;
        if (chatFull2 != null) {
        }
        sv0Var3.j1 = j10;
        i15 = 0;
        while (true) {
            hv0VarArr = sv0Var3.t1;
            if (i15 < hv0VarArr.length) {
            }
            i15++;
        }
        sv0Var3.v1 = n2Var;
        sv0Var3.G = n2Var.getActionBar();
        sv0Var3.m1[0] = sv0Var3.U0() > 0 ? SharedConfig.mediaColumnsCount : sv0Var3.U0();
        sv0Var3.m1[1] = sv0Var3.U0() > 0 ? SharedConfig.storiesColumnsCount : sv0Var3.U0();
        sv0Var3.G1 = n2Var.getNotificationCenter().createObserversGroup(sv0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
        while (i16 < 10) {
        }
        sv0Var3.S0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        sv0Var3.V0 = false;
        sv0Var3.W0 = null;
        ft0Var = sv0Var3.J0;
        if (ft0Var != null) {
        }
        sv0Var3.U0 = false;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        sv0Var3.y0 = drawable2;
        drawable2.setColorFilter(new PorterDuffColorFilter(sv0Var3.i0(org.telegram.ui.ActionBar.h6.b7), PorterDuff.Mode.MULTIPLY));
        it0 it0Var3 = sv0Var3.I0;
        if (it0Var3 == null) {
        }
        it0 it0Var22 = new it0(sv0Var3, context, sv0Var3.F1);
        i17 = sv0Var3.Y0;
        if (i17 != -1) {
        }
        it0Var22.b0 = 320L;
        int i332 = org.telegram.ui.ActionBar.h6.Fh;
        int i342 = org.telegram.ui.ActionBar.h6.Eh;
        it0Var22.L = i332;
        it0Var22.M = i342;
        it0Var22.d();
        it0Var22.setUseMinimalWidth(true);
        it0Var22.setDelegate(new kt0(sv0Var3));
        sv0Var3.I0 = it0Var22;
        while (i18 >= 0) {
        }
        sv0Var3.a1 = 0;
        sv0Var3.N0.clear();
        cv0Var = sv0Var3.R;
        if (cv0Var != null) {
        }
        if (!(sv0Var3 instanceof h40)) {
        }
        imageView = new ImageView(context);
        sv0Var3.r0 = imageView;
        imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        imageView.setTranslationY(AndroidUtilities.dp(10.0f));
        imageView.setVisibility(4);
        if (!sv0Var3.r0()) {
            sv0Var3.G.addView(imageView, w7.z5.e(48, 56, 85));
            xj0 xj0Var2 = new xj0(context);
            sv0Var3.s0 = xj0Var2;
            xj0Var2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            xj0Var2.e(R.raw.options_to_search, 24, 24);
            xj0Var2.getAnimatedDrawable().F *= 2.0f;
            xj0Var2.getAnimatedDrawable().h = true;
            xj0Var2.setColorFilter(new PorterDuffColorFilter(sv0Var3.i0(org.telegram.ui.ActionBar.h6.y8), PorterDuff.Mode.SRC_IN));
            xj0Var2.setVisibility(8);
            sv0Var3.G.addView(xj0Var2, w7.z5.e(48, 56, 85));
        }
        int i352 = 5;
        context2 = context;
        imageView.setOnClickListener(new wt0(sv0Var3, j10, d6Var, context));
        u0Var = sv0Var3.n0;
        if (u0Var != null) {
        }
        sv0Var3.x0 = 0;
        org.telegram.ui.ActionBar.n2 n2Var22 = sv0Var3.v1;
        if (n2Var22 == null) {
        }
        ha haVar2 = new ha(context2, jw0Var);
        sv0Var3.B0 = haVar2;
        haVar2.setBackgroundColor(sv0Var3.i0(org.telegram.ui.ActionBar.h6.a7));
        haVar2.setAlpha(0.0f);
        haVar2.setClickable(true);
        haVar2.setVisibility(4);
        ImageView imageView22 = new ImageView(context2);
        sv0Var3.C0 = imageView22;
        imageView22.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.g2 g2Var2 = new org.telegram.ui.ActionBar.g2(true);
        sv0Var3.D0 = g2Var2;
        imageView22.setImageDrawable(g2Var2);
        int i372 = org.telegram.ui.ActionBar.h6.y8;
        g2Var2.a(sv0Var3.i0(i372));
        int i382 = org.telegram.ui.ActionBar.h6.z8;
        imageView22.setBackground(org.telegram.ui.ActionBar.h6.f0(sv0Var3.i0(i382), 1));
        imageView22.setContentDescription(LocaleController.getString("Close", R.string.Close));
        haVar2.addView(imageView22, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        sv0Var3.N0.add(imageView22);
        imageView22.setOnClickListener(new or0(sv0Var3, 0));
        NumberTextView numberTextView2 = new NumberTextView(context2);
        sv0Var3.A0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(AndroidUtilities.bold());
        numberTextView2.setTextColor(sv0Var3.i0(i372));
        haVar2.addView(numberTextView2, w7.z5.m(1.0f, 0, -1, 18, 0, 0));
        sv0Var3.N0.add(numberTextView2);
        if (!DialogObject.isEncryptedDialog(sv0Var3.j1)) {
        }
        org.telegram.ui.ActionBar.u0 u0Var62 = new org.telegram.ui.ActionBar.u0(sv0Var3.i0(i382), sv0Var3.i0(i372), context2, false);
        sv0Var3.l0 = u0Var62;
        u0Var62.setIcon(R.drawable.msg_delete);
        u0Var62.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        u0Var62.setDuplicateParentStateEnabled(false);
        haVar2.addView(u0Var62, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        sv0Var3.N0.add(u0Var62);
        u0Var62.setOnClickListener(new or0(sv0Var3, i352));
        sv0Var3.H = new xt0(sv0Var3, context2);
        sv0Var3.I = new mv0(sv0Var3, context2);
        sv0Var3.K = new fv0(sv0Var3, context2, 1);
        sv0Var3.L = new fv0(sv0Var3, context2, 2);
        sv0Var3.M = new fv0(sv0Var3, context2, 4);
        sv0Var3.N = new zu0(sv0Var3, context2, sv0Var3.v1.getCurrentAccount(), sv0Var3.v1.getResourceProvider());
        sv0Var3.O = new gu0(sv0Var3, context2);
        sv0Var3.g0 = new ou0(sv0Var3, context2, 1);
        sv0Var3.h0 = new ou0(sv0Var3, context2, 4);
        sv0Var3.i0 = new ou0(sv0Var3, context2, 3);
        sv0Var3.j0 = new ju0(sv0Var3, context2);
        sv0Var3.P = new du0(sv0Var3, context2);
        sv0Var3.Q = new bu0(sv0Var3, context2);
        sv0Var3.R = new cv0(sv0Var3, context2);
        sv0Var3.S = new dv0(sv0Var3, context2);
        if (!sv0Var3.x0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", sv0Var3.v1.getUserConfig().getClientUserId());
            bundle2.putInt("chatMode", 3);
            yt0 yt0Var2 = new yt0(sv0Var3, context2, sv0Var3.v1.getParentLayout(), bundle2);
            sv0Var3.T = yt0Var2;
            long j122 = sv0Var3.j1;
            org.telegram.ui.tn tnVar2 = yt0Var2.a;
            tnVar2.d4 = j122;
            tnVar2.Qa = true;
            yt0Var2.setClipToOutline(true);
            yt0Var2.setOutlineProvider(new zt0());
        }
        cu0 cu0Var2 = new cu0(sv0Var3, context2);
        sv0Var3.a0 = cu0Var2;
        if (sv0Var3.F == 0) {
        }
        sv0Var3.c0 = new au0(sv0Var3, context2);
        sv0Var3.b0 = new s4.y(new fs0(sv0Var3));
        sv0Var3.d0 = new pv0(sv0Var3, context2, false);
        sv0Var3.e0 = new gs0(sv0Var3, context2);
        sv0Var3.f0 = new pv0(sv0Var3, context2, true);
        sv0Var3.J = new gv0(sv0Var3, context2);
        f7 = 48.0f;
        if (!sv0Var3.s0()) {
        }
        d6Var2 = d6Var;
        sv0Var = sv0Var3;
        sv0Var.setWillNotDraw(false);
        i19 = 0;
        i20 = -1;
        i21 = 0;
        while (true) {
            lu0VarArr = sv0Var.k0;
            if (i21 >= lu0VarArr.length) {
            }
            lu0 lu0Var6222 = sv0Var.k0[i21];
            lu0Var6222.w = new ct0(sv0Var, context2, lu0Var6222.v);
            rx0Var = sv0Var.k0[i21].w;
            rx0Var.d(8, false);
            rx0Var2 = sv0Var.k0[i21].w;
            rx0Var2.setAnimateLayoutChange(true);
            lu0 lu0Var7222 = sv0Var.k0[i21];
            rx0Var3 = lu0Var7222.w;
            lu0Var7222.addView(rx0Var3, w7.z5.d(-1.0f, -1));
            rx0Var4 = sv0Var.k0[i21].w;
            rx0Var4.setOnTouchListener(new di.d(23));
            rx0Var5 = sv0Var.k0[i21].w;
            rx0Var5.e(true, false);
            rx0Var6 = sv0Var.k0[i21].w;
            rx0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
            rx0Var7 = sv0Var.k0[i21].w;
            rx0Var7.f.setVisibility(8);
            rx0Var8 = sv0Var.k0[i21].w;
            rx0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            rx0Var9 = sv0Var.k0[i21].w;
            rx0Var9.f.setVisibility(8);
            rx0Var10 = sv0Var.k0[i21].w;
            rx0Var10.addView(sv0Var.k0[i21].v, w7.z5.a(-1.0f, 12.0f, 60.0f, 12.0f, 12.0f, -1, 119));
            ku0Var16 = sv0Var.k0[i21].h;
            rx0Var11 = sv0Var.k0[i21].w;
            ku0Var16.setEmptyView(rx0Var11);
            ku0Var17 = sv0Var.k0[i21].h;
            ku0Var17.m1(0, true);
            lu0[] lu0VarArr2222 = sv0Var.k0;
            lu0 lu0Var8222 = lu0VarArr2222[i21];
            ku0Var18 = lu0VarArr2222[i21].h;
            lu0Var8222.E = new ll0(ku0Var18, sv0Var.k0[i21].x);
            i21++;
            f7 = f102;
            d6Var2 = d6Var;
            i19 = i22;
            i20 = i23;
        }
        float f1122 = f7;
        view = sv0Var.W;
        if (view != null) {
        }
        org.telegram.ui.Cells.x0 x0Var22 = new org.telegram.ui.Cells.x0(context2);
        sv0Var.K0 = x0Var22;
        x0Var22.X((int) (System.currentTimeMillis() / 1000), false, false);
        x0Var22.setAlpha(0.0f);
        x0Var22.Z(org.telegram.ui.ActionBar.h6.wc, org.telegram.ui.ActionBar.h6.kd);
        x0Var22.setTranslationY(-AndroidUtilities.dp(f1122));
        sv0Var.addView(x0Var22, w7.z5.a(-2.0f, 0.0f, 52.0f, 0.0f, 0.0f, -2, 49));
        N = sv0Var.N();
        sv0Var2 = sv0Var;
        if (!N) {
        }
        sv0Var2.y1(false);
        sv0Var2.o1(false);
        if (sv0Var2.X0[0] >= 0) {
        }
        ns0Var = sv0Var2.W;
        if (ns0Var != null) {
        }
        sv0Var2.c2 = new kh(sv0Var2, 2);
    }

    public static fu0 M(int i10, long j10, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        fu0 fu0Var = new fu0(context, d6Var);
        TextView textView = fu0Var.a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return fu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return fu0Var;
        }
        if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return fu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return fu0Var;
        }
        if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return fu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return fu0Var;
        }
        if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return fu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return fu0Var;
        }
        if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return fu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return fu0Var;
        }
        if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return fu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return fu0Var;
        }
        ImageView imageView = fu0Var.b;
        if (i10 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
            return fu0Var;
        }
        if (i10 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return fu0Var;
    }

    public static void d(sv0 sv0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.i4 i4Var = new org.telegram.ui.i4(sv0Var, i10, storyItem, 16);
        ci.i7 storiesController = sv0Var.getStoriesController();
        long j10 = sv0Var.j1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j10, arrayList);
        xc.a0(sv0Var.v1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), i4Var).j();
    }

    public static TLRPC.ProfileTab e0(int i10, boolean z10) {
        if (i10 != 8 && i10 != 14 && !z10) {
            return null;
        }
        if (i10 == 0) {
            return new TLRPC.TL_profileTabMedia();
        }
        if (i10 == 1) {
            return new TLRPC.TL_profileTabFiles();
        }
        if (i10 == 2) {
            return new TLRPC.TL_profileTabVoice();
        }
        if (i10 == 3) {
            return new TLRPC.TL_profileTabLinks();
        }
        if (i10 == 4) {
            return new TLRPC.TL_profileTabMusic();
        }
        if (i10 == 5) {
            return new TLRPC.TL_profileTabGifs();
        }
        if (i10 == 8) {
            return new TLRPC.TL_profileTabPosts();
        }
        if (i10 != 14) {
            return null;
        }
        return new TLRPC.TL_profileTabGifts();
    }

    public static int f0(TLRPC.ProfileTab profileTab) {
        if (profileTab instanceof TLRPC.TL_profileTabPosts) {
            return 8;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMedia) {
            return 0;
        }
        if (profileTab instanceof TLRPC.TL_profileTabGifts) {
            return 14;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMusic) {
            return 4;
        }
        if (profileTab instanceof TLRPC.TL_profileTabVoice) {
            return 2;
        }
        if (profileTab instanceof TLRPC.TL_profileTabLinks) {
            return 3;
        }
        if (profileTab instanceof TLRPC.TL_profileTabFiles) {
            return 1;
        }
        return profileTab instanceof TLRPC.TL_profileTabGifs ? 5 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ci.i7 getStoriesController() {
        return MessagesController.getInstance(this.v1.getCurrentAccount()).getStoriesController();
    }

    public static /* synthetic */ void h(sv0 sv0Var, TL_stories.StoryItem storyItem) {
        sv0Var.getStoriesController().o0(sv0Var.j1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        xc.a0(sv0Var.v1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(sv0 sv0Var, long j10, int i10, String str) {
        ci.w6 B = sv0Var.getStoriesController().B(j10, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((ci.b7) B.h.get(c10)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(sv0 sv0Var, TL_stories.StoryItem storyItem, ci.b7 b7Var) {
        sv0Var.getStoriesController().c(b7Var.a, sv0Var.j1, storyItem);
        AndroidUtilities.runOnUIThread(new go0(7, sv0Var, b7Var), 100L);
    }

    public static void m(sv0 sv0Var, HashSet hashSet, TL_stories.StoryItem storyItem, i80 i80Var, ci.b7 b7Var) {
        String formatString;
        long j10 = sv0Var.j1;
        if (hashSet.contains(Integer.valueOf(b7Var.a))) {
            sv0Var.getStoriesController().c(b7Var.a, j10, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, b7Var.b);
        } else {
            ci.i7 storiesController = sv0Var.getStoriesController();
            int i10 = b7Var.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j10, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, b7Var.b);
        }
        xc.a0(sv0Var.v1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        i80Var.u();
    }

    public static void n(sv0 sv0Var, long j10, int i10) {
        ci.w6 B = sv0Var.getStoriesController().B(j10, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ci.b7 b7Var = (ci.b7) B.h.remove(c10);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_deleteAlbum.album_id = b7Var.a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int p(sv0 sv0Var, s4.g0 g0Var) {
        if (g0Var == sv0Var.d0) {
            return 8;
        }
        if (g0Var == sv0Var.f0) {
            return 9;
        }
        for (rv0 rv0Var : sv0Var.Y1.values()) {
            if (rv0Var.d == g0Var) {
                return rv0Var.a;
            }
        }
        return -1;
    }

    public static int q(View view) {
        if (view instanceof org.telegram.ui.Cells.s7) {
            return ((org.telegram.ui.Cells.s7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            return ((org.telegram.ui.Cells.i7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            return ((org.telegram.ui.Cells.h7) view).getMessage().getId();
        }
        return 0;
    }

    public static boolean q0(int i10) {
        return i10 == 8 || i10 == 9 || y0(i10);
    }

    public static void r(lu0 lu0Var, hv0[] hv0VarArr, boolean z10) {
        go0 go0Var;
        if (!z10) {
            if (lu0Var.G == null || (go0Var = lu0Var.H) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(go0Var);
            lu0Var.H.run();
            lu0Var.H = null;
            lu0Var.G = null;
            return;
        }
        if (SharedConfig.fastScrollHintCount <= 0 || lu0Var.G != null || lu0Var.I || lu0Var.h.getFastScroll() == null || !lu0Var.h.getFastScroll().a0 || lu0Var.h.getFastScroll().getVisibility() != 0 || hv0VarArr[0].e() < 50) {
            return;
        }
        SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
        lu0Var.I = true;
        Context context = lu0Var.getContext();
        kr0 kr0Var = new kr0(context);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        int i10 = org.telegram.ui.ActionBar.h6.pf;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        kr0Var.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.qf, false)));
        kr0Var.addView(textView, w7.z5.a(-2.0f, 46.0f, 8.0f, 8.0f, 8.0f, -2, 16));
        jr0 jr0Var = new jr0(context);
        jr0Var.a = new Random();
        Paint paint = new Paint(1);
        jr0Var.b = paint;
        Paint paint2 = new Paint(1);
        jr0Var.c = paint2;
        jr0Var.f = 1.0f;
        jr0Var.h = 0.0f;
        paint.setColor(i0.b.o(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        Paint paint3 = new Paint();
        jr0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        jr0Var.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        kr0Var.addView(jr0Var, w7.z5.a(32.0f, 8.0f, 8.0f, 8.0f, 8.0f, 29, 0));
        lu0Var.G = kr0Var;
        lu0Var.addView(kr0Var, w7.z5.d(-2.0f, -2));
        lu0Var.G.setAlpha(0.0f);
        lu0Var.G.setScaleX(0.8f);
        lu0Var.G.setScaleY(0.8f);
        lu0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        lu0Var.invalidate();
        go0 go0Var2 = new go0(6, lu0Var, kr0Var);
        lu0Var.H = go0Var2;
        AndroidUtilities.runOnUIThread(go0Var2, 4000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(sv0 sv0Var) {
        sv0 sv0Var2;
        ArrayList arrayList;
        int i10;
        int i11;
        Bitmap bitmap;
        long j10 = sv0Var.j1;
        hv0[] hv0VarArr = sv0Var.t1;
        lu0 W = sv0Var.W(0);
        if (W != null && W.getMeasuredHeight() > 0 && W.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(W.getMeasuredWidth(), W.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e) {
                FileLog.e(e);
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                sv0Var.H1 = true;
                W.h.draw(new Canvas(bitmap2));
                View view = new View(W.getContext());
                view.setBackground(new BitmapDrawable(bitmap2));
                W.addView(view);
                sv0Var2 = sv0Var;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new hg.j0((FrameLayout) sv0Var2, view, (View) W, (Object) bitmap2, 3)).start();
                W.h.setAlpha(0.0f);
                W.h.animate().alpha(1.0f).setUpdateListener(new b80(W, 21)).setDuration(200L).start();
                kv0 kv0Var = sv0Var2.u1;
                int[] iArr = kv0Var.c;
                arrayList = kv0Var.n[0].a;
                hv0 hv0Var = hv0VarArr[0];
                int[] iArr2 = hv0Var.f;
                iArr2[1] = 0;
                i10 = hv0Var.q;
                if (i10 != 0) {
                    iArr2[0] = iArr[0];
                } else if (i10 == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                hv0Var.h = false;
                sv0Var2.A0(0, !DialogObject.isEncryptedDialog(j10) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                sv0Var2.B0(false);
                sv0Var2.D1.R();
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j10);
                for (i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    hv0 hv0Var2 = hv0VarArr[0];
                    int i12 = hv0Var2.q;
                    if (i12 == 0) {
                        hv0Var2.a(messageObject, 0, false, isEncryptedDialog);
                    } else if (i12 == 1) {
                        if (messageObject.isPhoto()) {
                            hv0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                        }
                    } else if (!messageObject.isPhoto()) {
                        hv0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                    }
                }
            }
        }
        sv0Var2 = sv0Var;
        kv0 kv0Var2 = sv0Var2.u1;
        int[] iArr3 = kv0Var2.c;
        arrayList = kv0Var2.n[0].a;
        hv0 hv0Var3 = hv0VarArr[0];
        int[] iArr22 = hv0Var3.f;
        iArr22[1] = 0;
        i10 = hv0Var3.q;
        if (i10 != 0) {
        }
        hv0Var3.h = false;
        sv0Var2.A0(0, !DialogObject.isEncryptedDialog(j10) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        sv0Var2.B0(false);
        sv0Var2.D1.R();
        boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j10);
        while (i11 < arrayList.size()) {
        }
    }

    public static void u(sv0 sv0Var, int i10, boolean z10) {
        lu0[] lu0VarArr = sv0Var.k0;
        if (lu0VarArr[0].F == i10) {
            return;
        }
        lu0 lu0Var = lu0VarArr[1];
        lu0Var.F = i10;
        lu0Var.setVisibility(0);
        sv0Var.l0();
        sv0Var.o1(true);
        sv0Var.h1 = z10;
        sv0Var.N0();
        sv0Var.A(!sv0Var.u0(i10), true);
        sv0Var.s1(true);
    }

    public static int v(sv0 sv0Var, s4.g0 g0Var) {
        if (g0Var == sv0Var.c0) {
            return 8;
        }
        if (g0Var == sv0Var.e0) {
            return 9;
        }
        for (rv0 rv0Var : sv0Var.Y1.values()) {
            if (rv0Var.c == g0Var) {
                return rv0Var.a;
            }
        }
        return -1;
    }

    public static boolean y0(int i10) {
        return (i10 & (-65536)) == 65536;
    }

    public final void A(boolean z10, boolean z11) {
        xj0 xj0Var = this.s0;
        if (xj0Var == null || this.V1 == z10) {
            return;
        }
        this.V1 = z10;
        if (z10 || xj0Var.getAnimatedDrawable().a0 >= 20) {
            xj0Var.getAnimatedDrawable().P(this.V1 ? 50 : 100);
        } else {
            xj0Var.getAnimatedDrawable().P(0);
        }
        if (z11) {
            xj0Var.getAnimatedDrawable().start();
        } else {
            xj0Var.getAnimatedDrawable().M(xj0Var.getAnimatedDrawable().f);
        }
    }

    public final void A0(int i10, int i11, int i12, boolean z10) {
        hv0[] hv0VarArr = this.t1;
        hv0VarArr[i10].a.clear();
        hv0VarArr[i10].b[0].clear();
        hv0VarArr[i10].b[1].clear();
        hv0 hv0Var = hv0VarArr[i10];
        hv0Var.j[0] = i11;
        hv0Var.i[0] = false;
        hv0Var.l = false;
        hv0Var.m = i12;
        hv0Var.n = (hv0Var.e() - i12) - 1;
        hv0 hv0Var2 = hv0VarArr[i10];
        if (hv0Var2.n < 0) {
            hv0Var2.n = 0;
        }
        hv0Var2.k = i11;
        hv0Var2.o = true;
        hv0Var2.g = false;
        hv0Var2.p++;
        lu0 W = W(i10);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (!z10) {
            return;
        }
        int i13 = 0;
        while (true) {
            lu0[] lu0VarArr = this.k0;
            if (i13 >= lu0VarArr.length) {
                return;
            }
            lu0 lu0Var = lu0VarArr[i13];
            if (lu0Var.F == i10) {
                lu0Var.x.h1(Math.min(hv0VarArr[i10].e() - 1, hv0VarArr[i10].m), 0);
            }
            i13++;
        }
    }

    public final Boolean A1(View view, View view2) {
        if (this.o1) {
            return null;
        }
        lu0[] lu0VarArr = this.k0;
        lu0 lu0Var = lu0VarArr[0];
        if (lu0Var == null) {
            return null;
        }
        if (this.k1 && q0(lu0Var.F)) {
            return null;
        }
        int i10 = lu0VarArr[0].F;
        this.p1 = i10;
        boolean q02 = q0(i10);
        int[] iArr = this.m1;
        int X = X(q02 ? 1 : 0, iArr[q02 ? 1 : 0], false);
        if (view2 != null && X == X(q02 ? 1 : 0, X, false)) {
            view2.setEnabled(false);
            view2.animate().alpha(0.5f).start();
        }
        if (iArr[q02 ? 1 : 0] != X) {
            if (view != null && !view.isEnabled()) {
                view.setEnabled(true);
                view.animate().alpha(1.0f).start();
            }
            if (!q02) {
                SharedConfig.setMediaColumnsCount(X);
            } else if (c0(lu0VarArr[0].F) >= 5 || y0(lu0VarArr[0].F)) {
                SharedConfig.setStoriesColumnsCount(X);
            }
            B(X);
        }
        return Boolean.valueOf(X != X(q02 ? 1 : 0, X, false));
    }

    public final void B(int i10) {
        int i11;
        lu0 W = W(this.p1);
        this.s = -1;
        if (W != null) {
            W.h.B0();
            this.q1 = i10;
            W.r.setVisibility(0);
            if (q0(this.p1)) {
                W.r.setAdapter(n1(this.p1));
            } else {
                W.r.setAdapter(this.I);
            }
            ku0 ku0Var = W.r;
            int paddingLeft = ku0Var.getPaddingLeft();
            ku0 ku0Var2 = W.r;
            int Z = Z(W.F);
            ku0Var2.b3 = Z;
            int paddingRight = W.r.getPaddingRight();
            ku0 ku0Var3 = W.r;
            int Y = Y(x0());
            ku0Var3.c3 = Y;
            ku0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.s.y1(i10);
            W.r.a0();
            int i12 = 0;
            while (true) {
                lu0[] lu0VarArr = this.k0;
                if (i12 >= lu0VarArr.length) {
                    break;
                }
                lu0 lu0Var = lu0VarArr[i12];
                if (lu0Var != null && ((i11 = lu0Var.F) == 0 || q0(i11))) {
                    AndroidUtilities.updateVisibleRows(lu0VarArr[i12].h);
                }
                i12++;
            }
            int i13 = 1;
            this.o1 = true;
            if (this.p1 == 0) {
                this.t1[0].g(true);
            }
            this.n1 = 0.0f;
            Z0();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I1.lock();
            ofFloat.addUpdateListener(new ht0(this, W, i13));
            ofFloat.addListener(new gi.s2(this, q0(W.F) ? 1 : 0, i10, 2));
            ofFloat.setInterpolator(bs.f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final void B0(boolean z10) {
        long j10 = this.F;
        if (j10 != 0 || v0()) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            final int i11 = d2[i10];
            hv0[] hv0VarArr = this.t1;
            if (hv0VarArr[i11].h && !z10) {
                return;
            }
            long j11 = this.j1;
            if (DialogObject.isEncryptedDialog(j11)) {
                return;
            }
            hv0VarArr[i11].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i11 == 0) {
                int i12 = hv0VarArr[i11].q;
                if (i12 == 1) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                } else if (i12 == 2) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterVideo();
                } else {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                }
            } else if (i11 == 1) {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterDocument();
            } else if (i11 == 2) {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
            } else {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterMusic();
            }
            tL_messages_getSearchResultsPositions.limit = 100;
            org.telegram.ui.ActionBar.n2 n2Var = this.v1;
            tL_messages_getSearchResultsPositions.peer = n2Var.getMessagesController().getInputPeer(j11);
            if (j10 != 0 && n2Var.getUserConfig().getClientUserId() == j11) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = n2Var.getMessagesController().getInputPeer(j10);
            }
            final int i13 = hv0VarArr[i11].p;
            ConnectionsManager.getInstance(n2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(n2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() { // from class: org.telegram.ui.Components.lr0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new tr0(sv0.this, tL_error, i13, i11, tLObject, 0));
                }
            }), n2Var.getClassGuid());
        }
    }

    public final boolean C() {
        boolean s02 = s0();
        long j10 = this.j1;
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        if (!s02) {
            return x0() || (n2Var != null && n2Var.getMessagesController().getStoriesController().h(j10));
        }
        TLRPC.User user = MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j10));
        return user != null && user.bot && user.bot_can_edit;
    }

    public final void C0(int i10) {
        int i11;
        int i12 = 2;
        hv0[] hv0VarArr = this.t1;
        if (i10 == 0) {
            int i13 = hv0VarArr[0].q;
            if (i13 == 1) {
                i12 = 6;
            } else if (i13 == 2) {
                i12 = 7;
            } else {
                i11 = 0;
            }
            i11 = i12;
        } else if (i10 == 1) {
            i11 = 1;
        } else {
            if (i10 != 2) {
                i12 = 4;
                if (i10 != 4) {
                    i12 = 5;
                    if (i10 != 5) {
                        i12 = 3;
                    }
                }
            }
            i11 = i12;
        }
        hv0VarArr[i10].g = true;
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        n2Var.getMediaDataController().loadMedia(this.j1, 50, 0, hv0VarArr[i10].k, i11, this.F, 1, n2Var.getClassGuid(), hv0VarArr[i10].p, null, null);
    }

    public boolean D() {
        return !(this instanceof h40);
    }

    public int D0() {
        return 0;
    }

    public final boolean E() {
        lu0 lu0Var;
        lu0[] lu0VarArr = this.k0;
        if (lu0VarArr == null || (lu0Var = lu0VarArr[0]) == null) {
            return false;
        }
        if (this.k1 && q0(lu0Var.F)) {
            return false;
        }
        boolean q02 = q0(lu0VarArr[0].F);
        int i10 = this.m1[q02 ? 1 : 0];
        return i10 != X(q02 ? 1 : 0, i10, false);
    }

    public final void E0(int i10, View view) {
        boolean z10;
        hs0 hs0Var;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z11;
        int i11 = 8;
        int i12 = 3;
        cv0 cv0Var = this.R;
        SparseArray[] sparseArrayArr = this.Z0;
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        final int i13 = 0;
        if (i10 != 101) {
            if (i10 == 100) {
                if (this.e1 != null && n2Var.getMessagesController().isUserNoForwards(this.e1)) {
                    r40 r40Var = this.E1;
                    if (r40Var != null) {
                        r40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                        this.E1.f(view, true);
                        return;
                    }
                    return;
                }
                if (this.d1 != null) {
                    TLRPC.Chat chat2 = n2Var.getMessagesController().getChat(Long.valueOf(this.d1.id));
                    if (n2Var.getMessagesController().isChatNoForwards(chat2)) {
                        r40 r40Var2 = this.E1;
                        if (r40Var2 != null) {
                            r40Var2.setText((!ChatObject.isChannel(chat2) || chat2.megagroup) ? LocaleController.getString(R.string.ForwardsRestrictedInfoGroup) : LocaleController.getString(R.string.ForwardsRestrictedInfoChannel));
                            this.E1.f(view, true);
                            return;
                        }
                        return;
                    }
                }
                if (k0()) {
                    r40 r40Var3 = this.E1;
                    if (r40Var3 != null) {
                        r40Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                        this.E1.f(view, true);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("canSelectTopics", true);
                bundle.putInt("dialogsType", 3);
                org.telegram.ui.ey eyVar = new org.telegram.ui.ey(bundle);
                eyVar.C2 = new nr0(this);
                n2Var.presentFragment(eyVar);
                return;
            }
            if (i10 == 102) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() != 1) {
                    return;
                }
                MessageObject messageObject = (MessageObject) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
                Bundle bundle2 = new Bundle();
                long dialogId = messageObject.getDialogId();
                if (DialogObject.isEncryptedDialog(dialogId)) {
                    bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                } else if (DialogObject.isUserDialog(dialogId)) {
                    bundle2.putLong("user_id", dialogId);
                } else {
                    TLRPC.Chat chat3 = n2Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                    if (chat3 != null && chat3.migrated_to != null) {
                        bundle2.putLong("migrated_to", dialogId);
                        dialogId = -chat3.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -dialogId);
                }
                bundle2.putInt("message_id", messageObject.getId());
                bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                org.telegram.ui.sn snVar = new org.telegram.ui.sn(bundle2);
                snVar.L7 = messageObject.getId();
                long j10 = this.F;
                if (j10 != 0) {
                    og.d.a(snVar, MessagesStorage.TopicKey.of(dialogId, j10));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                n2Var.presentFragment(snVar, false);
                return;
            }
            if (i10 == 103 || i10 == 104) {
                if (getClosestTab() == 8) {
                    au0 au0Var = this.c0;
                    if (au0Var == null || au0Var.s == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i14 = 0; i14 < sparseArrayArr[0].size(); i14++) {
                        arrayList.add(Integer.valueOf(((MessageObject) sparseArrayArr[0].valueAt(i14)).getId()));
                    }
                    V0(arrayList, i10 == 103);
                    L(false);
                    return;
                }
                SavedMessagesController savedMessagesController = n2Var.getMessagesController().getSavedMessagesController();
                ArrayList<Long> arrayList2 = new ArrayList<>();
                for (int i15 = 0; i15 < savedMessagesController.allDialogs.size(); i15++) {
                    long j11 = savedMessagesController.allDialogs.get(i15).dialogId;
                    if (cv0Var.w.contains(Long.valueOf(j11))) {
                        arrayList2.add(Long.valueOf(j11));
                    }
                }
                if (savedMessagesController.updatePinned(arrayList2, i10 == 103, true)) {
                    z10 = true;
                    int i16 = 0;
                    while (true) {
                        lu0[] lu0VarArr = this.k0;
                        if (i16 >= lu0VarArr.length) {
                            break;
                        }
                        lu0 lu0Var = lu0VarArr[i16];
                        if (lu0Var.F == 11) {
                            lu0Var.x.h1(0, 0);
                            break;
                        }
                        i16++;
                    }
                } else {
                    z10 = true;
                    n2Var.showDialog(new sg.j0(33, n2Var.getCurrentAccount(), getContext(), n2Var, null));
                }
                L(z10);
                return;
            }
            return;
        }
        boolean q02 = q0(getSelectedTab());
        org.telegram.ui.ActionBar.d6 d6Var = this.F1;
        if (q02 || getSelectedTab() == 13) {
            if (sparseArrayArr[0] != null) {
                if (!s0() || (hs0Var = this.U) == null || hs0Var.getCurrentList() == null) {
                    final ArrayList arrayList3 = new ArrayList();
                    for (int i17 = 0; i17 < sparseArrayArr[0].size(); i17++) {
                        TL_stories.StoryItem storyItem = ((MessageObject) sparseArrayArr[0].valueAt(i17)).storyItem;
                        if (storyItem != null) {
                            arrayList3.add(storyItem);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, d6Var);
                    String string = LocaleController.getString(arrayList3.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.Components.vr0
                        public final /* synthetic */ sv0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.a2
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i18) {
                            switch (i13) {
                                case 0:
                                    sv0 sv0Var = this.b;
                                    org.telegram.ui.ActionBar.n2 n2Var2 = sv0Var.v1;
                                    ci.i7 storiesController = n2Var2.getMessagesController().getStoriesController();
                                    long j12 = sv0Var.j1;
                                    ArrayList arrayList4 = arrayList3;
                                    storiesController.s(j12, arrayList4);
                                    xc.a0(n2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList4.size(), new Object[0])).j();
                                    sv0Var.L(false);
                                    break;
                                default:
                                    sv0 sv0Var2 = this.b;
                                    sv0Var2.getClass();
                                    int i19 = 0;
                                    while (true) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (i19 >= arrayList5.size()) {
                                            sv0Var2.L(true);
                                            break;
                                        } else {
                                            sv0Var2.v1.getMessagesController().deleteSavedDialog(((Long) arrayList5.get(i19)).longValue());
                                            i19++;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(9));
                    b2Var.show();
                    b2Var.h();
                    return;
                }
                ci.t6 currentList = hs0Var.getCurrentList();
                ArrayList arrayList4 = new ArrayList();
                for (int i18 = 0; i18 < sparseArrayArr[0].size(); i18++) {
                    TL_stories.StoryItem storyItem2 = ((MessageObject) sparseArrayArr[0].valueAt(i18)).storyItem;
                    if (storyItem2 != null) {
                        arrayList4.add(storyItem2.media);
                    }
                }
                if (arrayList4.isEmpty()) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, d6Var);
                String string2 = LocaleController.getString(arrayList4.size() > 1 ? R.string.DeleteBotPreviewsTitle : R.string.DeleteBotPreviewTitle);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                b2Var2.R = string2;
                b2Var2.T = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList4.size(), new Object[0]);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new ry(this, currentList, arrayList4, i12));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new tg0(i11));
                b2Var2.show();
                b2Var2.h();
                return;
            }
            return;
        }
        if (getSelectedTab() != 11) {
            long j12 = this.j1;
            if (DialogObject.isEncryptedDialog(j12)) {
                encryptedChat = org.telegram.messenger.q.l(n2Var.getMessagesController(), j12);
                user = null;
                chat = null;
            } else if (DialogObject.isUserDialog(j12)) {
                user = n2Var.getMessagesController().getUser(Long.valueOf(j12));
                chat = null;
                encryptedChat = null;
            } else {
                chat = n2Var.getMessagesController().getChat(Long.valueOf(-j12));
                user = null;
                encryptedChat = null;
            }
            f5.y(n2Var, user, chat, encryptedChat, null, this.c1, null, this.Z0, null, 0, 0, null, new mr0(this, r11 ? 1 : 0), null, this.F1);
            return;
        }
        SavedMessagesController savedMessagesController2 = n2Var.getMessagesController().getSavedMessagesController();
        final ArrayList arrayList5 = new ArrayList();
        for (int i19 = 0; i19 < savedMessagesController2.allDialogs.size(); i19++) {
            long j13 = savedMessagesController2.allDialogs.get(i19).dialogId;
            if (cv0Var.w.contains(Long.valueOf(j13))) {
                arrayList5.add(Long.valueOf(j13));
            }
        }
        String str = "";
        if (arrayList5.isEmpty()) {
            z11 = false;
        } else {
            Long l4 = (Long) arrayList5.get(0);
            long longValue = l4.longValue();
            boolean z12 = longValue == n2Var.getUserConfig().getClientUserId();
            z11 = z12;
            if (longValue < 0) {
                TLRPC.Chat chat4 = n2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                z11 = z12;
                if (chat4 != null) {
                    str = chat4.title;
                    z11 = z12;
                }
            } else if (longValue >= 0) {
                TLRPC.User user2 = n2Var.getMessagesController().getUser(l4);
                z11 = z12;
                if (user2 != null) {
                    if (UserObject.isAnonymous(user2)) {
                        str = LocaleController.getString(R.string.AnonymousForward);
                        z11 = z12;
                    } else {
                        str = UserObject.getUserName(user2);
                        z11 = z12;
                    }
                }
            }
        }
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, d6Var);
        String formatString = arrayList5.size() == 1 ? LocaleController.formatString(z11 ? R.string.ClearHistoryMyNotesTitle : R.string.ClearHistoryTitleSingle2, str) : LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList5.size(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
        b2Var3.R = formatString;
        b2Var3.T = arrayList5.size() == 1 ? LocaleController.formatString(z11 ? R.string.ClearHistoryMyNotesMessage : R.string.ClearHistoryMessageSingle, str) : LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList5.size(), new Object[0]);
        String string3 = LocaleController.getString(R.string.Remove);
        final int i20 = r11 ? 1 : 0;
        alertDialog$Builder3.k(string3, new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.Components.vr0
            public final /* synthetic */ sv0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i182) {
                switch (i20) {
                    case 0:
                        sv0 sv0Var = this.b;
                        org.telegram.ui.ActionBar.n2 n2Var2 = sv0Var.v1;
                        ci.i7 storiesController = n2Var2.getMessagesController().getStoriesController();
                        long j122 = sv0Var.j1;
                        ArrayList arrayList42 = arrayList5;
                        storiesController.s(j122, arrayList42);
                        xc.a0(n2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList42.size(), new Object[0])).j();
                        sv0Var.L(false);
                        break;
                    default:
                        sv0 sv0Var2 = this.b;
                        sv0Var2.getClass();
                        int i192 = 0;
                        while (true) {
                            ArrayList arrayList52 = arrayList5;
                            if (i192 >= arrayList52.size()) {
                                sv0Var2.L(true);
                                break;
                            } else {
                                sv0Var2.v1.getMessagesController().deleteSavedDialog(((Long) arrayList52.get(i192)).longValue());
                                i192++;
                            }
                        }
                }
            }
        });
        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
        n2Var.showDialog(b2Var3);
        TextView textView = (TextView) b2Var3.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
        }
    }

    public final void F() {
        it0 it0Var = this.I0;
        if (it0Var.e(it0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = it0Var.getFirstTabId();
        it0Var.setInitialTabId(firstTabId);
        this.k0[0].F = firstTabId;
        o1(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(lu0 lu0Var, im0 im0Var, s4.b0 b0Var) {
        int i10;
        int i11;
        boolean[] zArr;
        s4.b1 K;
        ci.a7 a7Var;
        if (this.o1 || this.J1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (im0Var.getFastScroll() == null || !im0Var.getFastScroll().n || currentTimeMillis - lu0Var.a >= 300) {
            lu0Var.a = currentTimeMillis;
            if (this.V0 && this.U0 && lu0Var.F != 11) {
                return;
            }
            int i12 = 7;
            if (lu0Var.F == 7) {
                return;
            }
            int L0 = b0Var.L0();
            int abs = L0 == -1 ? 0 : Math.abs(b0Var.N0() - L0) + 1;
            int h = im0Var.getAdapter() == null ? 0 : im0Var.getAdapter().h();
            int i13 = lu0Var.F;
            int[] iArr = this.m1;
            hv0[] hv0VarArr = this.t1;
            if (i13 == 0 || i13 == 1 || i13 == 2 || i13 == 4) {
                h = hv0VarArr[i13].d() + hv0VarArr[i13].a.size();
                hv0 hv0Var = hv0VarArr[i13];
                if (hv0Var.h && hv0Var.e.size() > 2 && lu0Var.F == 0 && hv0VarArr[i13].a.size() != 0) {
                    float f7 = i13 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((im0Var.getMeasuredHeight() / (im0Var.getMeasuredWidth() / f7)) * f7 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((qu0) hv0VarArr[i13].e.get(1)).b) {
                        measuredHeight = ((qu0) hv0VarArr[i13].e.get(1)).b;
                    }
                    if ((L0 > h && L0 - h > measuredHeight) || ((i10 = L0 + abs) < hv0VarArr[i13].m && hv0VarArr[0].m - i10 > measuredHeight)) {
                        org.telegram.ui.i4 i4Var = new org.telegram.ui.i4(this, i13, im0Var, 18);
                        this.J1 = i4Var;
                        AndroidUtilities.runOnUIThread(i4Var);
                        return;
                    }
                }
            }
            int i14 = lu0Var.F;
            if (i14 == 7) {
                return;
            }
            if (q0(i14)) {
                pv0 m12 = m1(lu0Var.F);
                if (m12 == null || (a7Var = m12.s) == null || L0 + abs <= a7Var.i() - iArr[1]) {
                    return;
                }
                m12.P();
                return;
            }
            int i15 = lu0Var.F;
            if (i15 == 6) {
                if (abs > 0) {
                    du0 du0Var = this.P;
                    boolean z10 = du0Var.h;
                    ArrayList arrayList = du0Var.d;
                    if (z10 || du0Var.e || arrayList.isEmpty() || L0 + abs < h - 5) {
                        return;
                    }
                    du0.E(du0Var, ((TLRPC.Chat) i0.a.h(1, arrayList)).id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var = this.v1;
            if (i15 == 11) {
                int i16 = -1;
                for (int i17 = 0; i17 < lu0Var.h.getChildCount(); i17++) {
                    View childAt = lu0Var.h.getChildAt(i17);
                    lu0Var.h.getClass();
                    i16 = Math.max(RecyclerView.R(childAt), i16);
                }
                s4.g0 adapter = lu0Var.h.getAdapter();
                dv0 dv0Var = this.S;
                if (adapter != dv0Var) {
                    if (i16 + 1 >= n2Var.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                        n2Var.getMessagesController().getSavedMessagesController().loadDialogs(false);
                        return;
                    }
                    return;
                } else {
                    if (i16 + 1 < dv0Var.h.size() + dv0Var.e.size() || dv0Var.s || dv0Var.r) {
                        return;
                    }
                    dv0Var.r = true;
                    dv0Var.F();
                    return;
                }
            }
            if (i15 == 10 || i15 == 12 || i15 == 13 || i15 == 14) {
                return;
            }
            int i18 = i15 == 0 ? 3 : i15 == 5 ? 10 : 6;
            int i19 = i15 == 15 ? 8 : i15;
            if (abs + L0 > h - i18 || hv0VarArr[i19].o) {
                hv0 hv0Var2 = hv0VarArr[i19];
                if (!hv0Var2.g) {
                    if (i15 == 0) {
                        int i20 = hv0VarArr[0].q;
                        if (i20 == 1) {
                            i11 = 6;
                        } else {
                            if (i20 != 2) {
                                i11 = 0;
                            }
                            i11 = i12;
                        }
                        zArr = hv0Var2.i;
                        if (zArr[0]) {
                            hv0Var2.g = true;
                            n2Var.getMediaDataController().loadMedia(this.j1, 50, hv0VarArr[i19].j[0], 0, i11, this.F, 1, n2Var.getClassGuid(), hv0VarArr[i19].p, null, null);
                        } else if (this.c1 != 0 && !zArr[1]) {
                            hv0Var2.g = true;
                            n2Var.getMediaDataController().loadMedia(this.c1, 50, hv0VarArr[i19].j[1], 0, i11, this.F, 1, n2Var.getClassGuid(), hv0VarArr[i19].p, null, null);
                        }
                    } else {
                        if (i15 == 1) {
                            i11 = 1;
                        } else if (i15 == 2) {
                            i11 = 2;
                        } else {
                            i12 = 4;
                            if (i15 != 4) {
                                i11 = i15 == 5 ? 5 : i15 == 15 ? 8 : 3;
                            }
                            i11 = i12;
                        }
                        zArr = hv0Var2.i;
                        if (zArr[0]) {
                        }
                    }
                }
            }
            int i21 = hv0VarArr[i19].m;
            if (i19 == 0) {
                i21 = this.H.L(0);
            }
            if (L0 - i21 < i18 + 1) {
                hv0 hv0Var3 = hv0VarArr[i19];
                if (!hv0Var3.g && !hv0Var3.l && !hv0Var3.o) {
                    C0(lu0Var.F);
                }
            }
            lu0 lu0Var2 = this.k0[0];
            if (lu0Var2.h == im0Var) {
                int i22 = lu0Var2.F;
                if ((i22 != 0 && i22 != 5) || L0 == -1 || (K = im0Var.K(L0)) == null) {
                    return;
                }
                int i23 = K.f;
                if (i23 == 0 || i23 == 12) {
                    View view = K.a;
                    boolean z11 = view instanceof org.telegram.ui.Cells.t7;
                    org.telegram.ui.Cells.x0 x0Var = this.K0;
                    if (!z11) {
                        if (view instanceof org.telegram.ui.Cells.f2) {
                            x0Var.X(((org.telegram.ui.Cells.f2) view).getDate(), false, true);
                        }
                    } else {
                        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                        MessageObject messageObject = t7Var.e <= 0 ? null : t7Var.b[0];
                        if (messageObject != null) {
                            x0Var.X(messageObject.messageOwner.date, false, true);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean H(MotionEvent motionEvent) {
        hs0 hs0Var;
        lu0[] lu0VarArr = this.k0;
        int i10 = lu0VarArr[0].F;
        if (i10 == 13 && (hs0Var = this.U) != null) {
            View currentView = hs0Var.n.getCurrentView();
            if (currentView instanceof di.r) {
                di.r rVar = (di.r) currentView;
                di.l lVar = rVar.v;
                di.i iVar = rVar.f;
                if (rVar.a != null && rVar.getParent() != null) {
                    if (!rVar.b || rVar.K) {
                        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                            if (rVar.L && !rVar.K && motionEvent.getPointerCount() == 2) {
                                rVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                rVar.Q = 1.0f;
                                rVar.N = motionEvent.getPointerId(0);
                                rVar.O = motionEvent.getPointerId(1);
                                iVar.I0(false);
                                iVar.cancelLongPress();
                                iVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) rVar.getParent();
                                rVar.U = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - rVar.getX());
                                int y3 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - rVar.getY());
                                int i11 = rVar.U;
                                Rect rect = rVar.V;
                                rVar.S = -1;
                                int i12 = y3 + iVar.V2;
                                for (int i13 = 0; i13 < iVar.getChildCount(); i13++) {
                                    View childAt = iVar.getChildAt(i13);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i11, i12)) {
                                        rVar.S = RecyclerView.S(childAt);
                                        rVar.T = childAt.getTop();
                                    }
                                }
                                rVar.M = true;
                            }
                            if (motionEvent.getActionMasked() == 0) {
                                if ((motionEvent.getY() - ((View) rVar.getParent()).getY()) - rVar.getY() > 0.0f) {
                                    rVar.L = true;
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 2 && (rVar.K || rVar.M)) {
                            int i14 = -1;
                            int i15 = -1;
                            for (int i16 = 0; i16 < motionEvent.getPointerCount(); i16++) {
                                if (rVar.N == motionEvent.getPointerId(i16)) {
                                    i14 = i16;
                                }
                                if (rVar.O == motionEvent.getPointerId(i16)) {
                                    i15 = i16;
                                }
                            }
                            if (i14 == -1 || i15 == -1) {
                                rVar.L = false;
                                rVar.M = false;
                                rVar.K = false;
                                rVar.a();
                                return false;
                            }
                            float hypot = ((float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14))) / rVar.P;
                            rVar.Q = hypot;
                            if (!rVar.K && (hypot > 1.01f || hypot < 0.99f)) {
                                rVar.K = true;
                                boolean z10 = hypot > 1.0f;
                                rVar.R = z10;
                                rVar.b(z10);
                            }
                            if (rVar.K) {
                                boolean z11 = rVar.R;
                                if ((!z11 || rVar.Q >= 1.0f) && (z11 || rVar.Q <= 1.0f)) {
                                    rVar.c = Math.max(0.0f, Math.min(1.0f, z11 ? org.telegram.messenger.q.x(2.0f, rVar.Q, 1.0f, 1.0f) : (1.0f - rVar.Q) / 0.5f));
                                } else {
                                    rVar.c = 0.0f;
                                }
                                float f7 = rVar.c;
                                if (f7 == 1.0f || f7 == 0.0f) {
                                    if (f7 == 1.0f) {
                                        int i17 = rVar.e;
                                        int ceil = (((int) Math.ceil(rVar.S / rVar.e)) * i17) + ((int) ((rVar.W.G.z1 / (iVar.getMeasuredWidth() - ((int) (iVar.getMeasuredWidth() / rVar.e)))) * (i17 - 1)));
                                        if (ceil >= lVar.h()) {
                                            ceil = lVar.h() - 1;
                                        }
                                        rVar.S = ceil;
                                    }
                                    rVar.a();
                                    if (rVar.c == 0.0f) {
                                        rVar.R = !rVar.R;
                                    }
                                    rVar.b(rVar.R);
                                    rVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                iVar.invalidate();
                            }
                        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((rVar.N == motionEvent.getPointerId(0) && rVar.O == motionEvent.getPointerId(1)) || (rVar.N == motionEvent.getPointerId(1) && rVar.O == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && rVar.K) {
                            rVar.M = false;
                            rVar.L = false;
                            rVar.K = false;
                            rVar.a();
                        }
                        return rVar.K;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i10 == 0 || q0(i10)) && getParent() != null) {
            if (!this.o1 || this.a) {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (this.b && !this.a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f = motionEvent.getPointerId(1);
                        lu0VarArr[0].h.I0(false);
                        lu0VarArr[0].h.cancelLongPress();
                        lu0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - lu0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - lu0VarArr[0].getY());
                        int i18 = this.w;
                        this.s = -1;
                        int i19 = y10 + lu0VarArr[0].h.V2;
                        if (getY() != 0.0f && this.E == 1) {
                            i19 = 0;
                        }
                        for (int i20 = 0; i20 < lu0VarArr[0].h.getChildCount(); i20++) {
                            View childAt2 = lu0VarArr[0].h.getChildAt(i20);
                            Rect rect2 = this.x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i18, i19)) {
                                lu0VarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.D1.T() && this.s == -1) {
                            this.s = (int) (((this.m1[q0(lu0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i18 / lu0VarArr[0].h.getMeasuredWidth(), 0.0f))) + lu0VarArr[0].x.L0());
                            this.v = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - lu0VarArr[0].getY() > 0.0f) {
                            this.b = true;
                        }
                    }
                } else if (motionEvent.getActionMasked() == 2 && (this.a || this.c)) {
                    int i21 = -1;
                    int i22 = -1;
                    for (int i23 = 0; i23 < motionEvent.getPointerCount(); i23++) {
                        if (this.e == motionEvent.getPointerId(i23)) {
                            i21 = i23;
                        }
                        if (this.f == motionEvent.getPointerId(i23)) {
                            i22 = i23;
                        }
                    }
                    if (i21 == -1 || i22 == -1) {
                        this.b = false;
                        this.c = false;
                        this.a = false;
                        T();
                        return false;
                    }
                    float hypot2 = ((float) Math.hypot(motionEvent.getX(i22) - motionEvent.getX(i21), motionEvent.getY(i22) - motionEvent.getY(i21))) / this.h;
                    this.n = hypot2;
                    if (!this.a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                        this.a = true;
                        boolean z12 = hypot2 > 1.0f;
                        this.r = z12;
                        g1(z12);
                    }
                    if (this.a) {
                        boolean z13 = this.r;
                        if ((!z13 || this.n >= 1.0f) && (z13 || this.n <= 1.0f)) {
                            this.n1 = Math.max(0.0f, Math.min(1.0f, z13 ? org.telegram.messenger.q.x(2.0f, this.n, 1.0f, 1.0f) : (1.0f - this.n) / 0.5f));
                        } else {
                            this.n1 = 0.0f;
                        }
                        float f10 = this.n1;
                        if (f10 == 1.0f || f10 == 0.0f) {
                            s4.g0 m12 = q0(this.p1) ? m1(this.p1) : this.H;
                            if (this.n1 == 1.0f) {
                                int i24 = this.q1;
                                int ceil2 = (((int) Math.ceil(this.s / this.q1)) * i24) + ((int) ((this.z1 / (lu0VarArr[0].h.getMeasuredWidth() - ((int) (lu0VarArr[0].h.getMeasuredWidth() / this.q1)))) * (i24 - 1)));
                                if (ceil2 >= m12.h()) {
                                    ceil2 = m12.h() - 1;
                                }
                                this.s = ceil2;
                            }
                            T();
                            if (this.n1 == 0.0f) {
                                this.r = !this.r;
                            }
                            g1(this.r);
                            this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        }
                        lu0VarArr[0].h.invalidate();
                        lu0 lu0Var = lu0VarArr[0];
                        if (lu0Var.G != null) {
                            lu0Var.invalidate();
                        }
                    }
                } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.e == motionEvent.getPointerId(0) && this.f == motionEvent.getPointerId(1)) || (this.e == motionEvent.getPointerId(1) && this.f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.a) {
                    this.c = false;
                    this.b = false;
                    this.a = false;
                    T();
                }
                return this.a;
            }
            return true;
        }
        return false;
    }

    public final void H0() {
        ci.a7 a7Var;
        ci.a7 a7Var2;
        this.G1.removeAllObservers();
        au0 au0Var = this.c0;
        if (au0Var != null && (a7Var2 = au0Var.s) != null && a7Var2 != null) {
            a7Var2.z(au0Var.v);
        }
        gs0 gs0Var = this.e0;
        if (gs0Var != null && (a7Var = gs0Var.s) != null && a7Var != null) {
            a7Var.z(gs0Var.v);
        }
        Iterator it = this.Y1.values().iterator();
        while (it.hasNext()) {
            qv0 qv0Var = ((rv0) it.next()).c;
            ci.a7 a7Var3 = qv0Var.s;
            if (a7Var3 != null && a7Var3 != null) {
                a7Var3.z(qv0Var.v);
            }
        }
    }

    public final void I() {
        float abs;
        lu0[] lu0VarArr = this.k0;
        lu0 lu0Var = lu0VarArr[0];
        if (lu0Var == null || lu0VarArr[1] == null) {
            return;
        }
        float f7 = 0.0f;
        ns0 ns0Var = this.W;
        if (ns0Var != null) {
            char c10 = (!q0(lu0Var.F) || lu0VarArr[0].F == 9) ? (char) 0 : (char) 1;
            if (c10 == (lu0VarArr[1].getVisibility() == 0 ? (!q0(lu0VarArr[1].F) || lu0VarArr[1].F == 9) ? (char) 0 : (char) 1 : c10)) {
                abs = c10 != 0 ? 1.0f : 0.0f;
                ns0Var.setTranslationX(c10 != 0 ? 0.0f : lu0VarArr[0].getMeasuredWidth());
            } else {
                ns0Var.setTranslationX(lu0VarArr[c10 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(ns0Var.getTranslationX()) / ns0Var.getMeasuredWidth());
            }
            float f10 = 0.0f;
            for (int i10 = 0; i10 < lu0VarArr.length; i10++) {
                if (lu0VarArr[i10].getVisibility() == 0) {
                    rs0 rs0Var = lu0VarArr[i10].h;
                    View childAt = rs0Var.getChildCount() == 0 ? null : rs0Var.getChildAt(0);
                    f10 += Utilities.clamp01(1.0f - (lu0VarArr[i10].getTranslationX() / lu0VarArr[i10].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - rs0Var.getPaddingTop() : rs0Var.getChildCount() == 0 ? 0.0f : -AndroidUtilities.dp(48.0f));
                }
            }
            float clamp01 = Utilities.clamp01(1.0f - ((-f10) / AndroidUtilities.dpf2(48.0f)));
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
            ns0Var.setAlpha(clamp01);
            ns0Var.setScaleX(lerp);
            ns0Var.setScaleY(lerp);
            ns0Var.setTranslationY(this.K1 + f10);
            f7 = abs;
        }
        K();
        if (this.U1 != f7) {
            this.U1 = f7;
            p0();
            invalidate();
        }
    }

    public final void I0(int i10, View view, MessageObject messageObject, int i11) {
        String str;
        if (messageObject == null || this.o1) {
            return;
        }
        ns0 ns0Var = this.W;
        if (ns0Var == null || !ns0Var.w) {
            int i12 = 0;
            i12 = 0;
            String str2 = null;
            if (this.C1) {
                int i13 = 8;
                if (i11 == 8 && !C()) {
                    return;
                }
                char c10 = messageObject.getDialogId() == this.j1 ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = this.Z0;
                if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                    sparseArrayArr[c10].remove(messageObject.getId());
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.a1--;
                    }
                } else {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        return;
                    }
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.a1++;
                    }
                }
                F0(sparseArrayArr[0]);
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    d1(false);
                } else {
                    this.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    this.l0.setVisibility(this.a1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.u0 u0Var = this.u0;
                    if (u0Var != null) {
                        u0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.t0;
                    if (u0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        u0Var2.setVisibility(i13);
                    }
                    x1();
                }
                this.b1 = false;
                if (view instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) view).b(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.t7) {
                    ((org.telegram.ui.Cells.t7) view).b(0, sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0);
                } else if (view instanceof org.telegram.ui.Cells.m7) {
                    ((org.telegram.ui.Cells.m7) view).f(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) view).e(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    ((org.telegram.ui.Cells.f2) view).c(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.s7) {
                    ((org.telegram.ui.Cells.s7) view).i(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                }
            } else {
                ss0 ss0Var = this.r1;
                hv0[] hv0VarArr = this.t1;
                org.telegram.ui.ActionBar.n2 n2Var = this.v1;
                if (i11 == 0) {
                    hv0 hv0Var = hv0VarArr[i11];
                    int i14 = i10 - hv0Var.m;
                    if (i14 >= 0 && i14 < hv0Var.a.size()) {
                        PhotoViewer.t1().K2(null, n2Var, null);
                        PhotoViewer.t1().b2(hv0VarArr[i11].a, i14, this.j1, this.c1, this.F, ss0Var);
                    }
                } else if (i11 == 2 || i11 == 4) {
                    if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).a();
                    }
                } else if (i11 == 5) {
                    PhotoViewer.t1().K2(null, n2Var, null);
                    int indexOf = hv0VarArr[i11].a.indexOf(messageObject);
                    if (indexOf < 0) {
                        PhotoViewer.t1().b2(org.telegram.messenger.q.k(messageObject), 0, 0L, 0L, 0L, ss0Var);
                    } else {
                        PhotoViewer.t1().b2(hv0VarArr[i11].a, indexOf, this.j1, this.c1, this.F, ss0Var);
                    }
                } else if (i11 == 1) {
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                        TLRPC.Document document = messageObject.getDocument();
                        if (i7Var.G) {
                            if (messageObject.canPreviewDocument()) {
                                PhotoViewer.t1().K2(null, n2Var, null);
                                int indexOf2 = hv0VarArr[i11].a.indexOf(messageObject);
                                if (indexOf2 < 0) {
                                    PhotoViewer.t1().b2(org.telegram.messenger.q.k(messageObject), 0, 0L, 0L, 0L, ss0Var);
                                    return;
                                } else {
                                    PhotoViewer.t1().b2(hv0VarArr[i11].a, indexOf2, this.j1, this.c1, this.F, ss0Var);
                                    return;
                                }
                            }
                            AndroidUtilities.openDocument(messageObject, n2Var.getParentActivity(), n2Var);
                        } else if (i7Var.F) {
                            n2Var.getFileLoader().cancelLoadFile(document);
                            i7Var.f(true);
                        } else {
                            MessageObject message = i7Var.getMessage();
                            message.putInDownloadsStore = true;
                            n2Var.getFileLoader().loadFile(document, message, 0, 0);
                            i7Var.f(true);
                        }
                    }
                } else if (i11 == 3) {
                    try {
                        TLRPC.WebPage webPage = MessageObject.getMedia(messageObject.messageOwner) != null ? MessageObject.getMedia(messageObject.messageOwner).webpage : null;
                        if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            str = null;
                        } else {
                            if (webPage.cached_page != null) {
                                LaunchActivity launchActivity = LaunchActivity.H1;
                                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.H1.P().l(messageObject) == null) {
                                    n2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str3 = webPage.embed_url;
                            if (str3 != null && str3.length() != 0) {
                                cv.J(n2Var, messageObject, this.r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                return;
                            }
                            str = webPage.url;
                        }
                        if (str == null) {
                            ArrayList arrayList = ((org.telegram.ui.Cells.m7) view).E;
                            if (arrayList.size() > 0) {
                                str2 = ((CharSequence) arrayList.get(0)).toString();
                            }
                            str = str2;
                        }
                        if (str != null) {
                            T0(str);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (q0(i11)) {
                    pv0 m12 = m1(i11);
                    ci.a7 a7Var = m12 != null ? m12.s : null;
                    if (a7Var == null) {
                        return;
                    }
                    ci.aa orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int id2 = messageObject.getId();
                    ci.r7 a2 = ci.r7.a(this.k0[0].h);
                    a2.e = new tv(a7Var, 19);
                    if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).t1) {
                        i12 = AndroidUtilities.dp(68.0f);
                    }
                    a2.s += i12;
                    orCreateStoryViewer.C(context, id2, a7Var, a2);
                }
            }
            r1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J() {
        AnimatorSet animatorSet;
        if (!this.g1) {
            return false;
        }
        boolean z10 = this.i1;
        lu0[] lu0VarArr = this.k0;
        if (!z10) {
            if (Math.abs(lu0VarArr[1].getTranslationX()) < 1.0f) {
                lu0VarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.h1 ? -1 : 1));
                lu0VarArr[1].setTranslationX(0.0f);
                animatorSet = this.f1;
                if (animatorSet != null) {
                }
                this.g1 = false;
            }
            O0(getTabProgress());
            return this.g1;
        }
        if (Math.abs(lu0VarArr[0].getTranslationX()) < 1.0f) {
            lu0VarArr[0].setTranslationX(0.0f);
            lu0VarArr[1].setTranslationX(lu0VarArr[0].getMeasuredWidth() * (this.h1 ? 1 : -1));
            animatorSet = this.f1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f1 = null;
            }
            this.g1 = false;
        }
        O0(getTabProgress());
        return this.g1;
    }

    public final boolean J0(MessageObject messageObject, View view, int i10, boolean z10) {
        ns0 ns0Var;
        final TL_stories.StoryItem storyItem;
        au0 au0Var;
        ci.a7 a7Var;
        final int i11 = 0;
        if (!this.C1) {
            org.telegram.ui.ActionBar.n2 n2Var = this.v1;
            if (n2Var.getParentActivity() != null && messageObject != null && ((ns0Var = this.W) == null || !ns0Var.w)) {
                AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
                long j10 = this.j1;
                int i12 = 8;
                final int i13 = 1;
                if (!z10 || (!(y0(getClosestTab()) || getClosestTab() == 8) || this.C1)) {
                    char c10 = messageObject.getDialogId() == j10 ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.Z0;
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.a1++;
                    }
                    this.l0.setVisibility(this.a1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.u0 u0Var = this.u0;
                    if (u0Var != null) {
                        u0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.t0;
                    if (u0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        u0Var2.setVisibility(i12);
                    }
                    this.A0.a(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.N0;
                        if (i14 >= arrayList2.size()) {
                            break;
                        }
                        View view2 = (View) arrayList2.get(i14);
                        AndroidUtilities.clearDrawableAnimation(view2);
                        arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        i14++;
                    }
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    this.b1 = false;
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.t7) {
                        ((org.telegram.ui.Cells.t7) view).b(i10, true);
                    } else if (view instanceof org.telegram.ui.Cells.m7) {
                        ((org.telegram.ui.Cells.m7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.f2) {
                        ((org.telegram.ui.Cells.f2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.s7) {
                        ((org.telegram.ui.Cells.s7) view).i(true, true);
                    }
                    if (!this.C1) {
                        d1(true);
                    }
                    F0(sparseArrayArr[0]);
                    r1();
                    return true;
                }
                if (view instanceof org.telegram.ui.Cells.s7) {
                    org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                    s7Var.k(s7Var.n, s7Var.r, true);
                }
                TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean y02 = y0(getClosestTab());
                    i80 I = i80.I(n2Var, view);
                    i80 J = I.J();
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.ut0(I, 26), false);
                    J.k();
                    i80.f(J, getStoriesController().B(j10, true), hashSet, true, new lg(this, storyItem2, I, 20), new ci.z2(this, hashSet, storyItem2, I, 10));
                    I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new gi.g2(I, J, 9), false);
                    I.k();
                    I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new ai.bb(this, messageObject, view, i10, 25), false);
                    final int i15 = 3;
                    if (y02) {
                        int j12 = j1(getClosestTab());
                        String w9 = getStoriesController().w(j12, j10);
                        I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new e2(this, j12, 11), false);
                        storyItem = storyItem2;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new ai.bb(this, j12, storyItem, w9, 26), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (au0Var = this.c0) != null && (a7Var = au0Var.s) != null) {
                            if (a7Var.m(storyItem.id)) {
                                I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() { // from class: org.telegram.ui.Components.pr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                sv0 sv0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sv0Var.getContext(), 0, sv0Var.F1);
                                                alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new wr0(sv0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(10));
                                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                                b2Var.show();
                                                b2Var.h();
                                                break;
                                            case 1:
                                                sv0 sv0Var2 = this;
                                                sv0Var2.getClass();
                                                sv0Var2.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                sv0 sv0Var3 = this;
                                                sv0Var3.getClass();
                                                sv0Var3.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                sv0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final int i16 = 2;
                                I.c(R.drawable.chats_pin, LocaleController.getString(R.string.StoriesAlbumMenuPin), new Runnable() { // from class: org.telegram.ui.Components.pr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                sv0 sv0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sv0Var.getContext(), 0, sv0Var.F1);
                                                alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new wr0(sv0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(10));
                                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                                b2Var.show();
                                                b2Var.h();
                                                break;
                                            case 1:
                                                sv0 sv0Var2 = this;
                                                sv0Var2.getClass();
                                                sv0Var2.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                sv0 sv0Var3 = this;
                                                sv0Var3.getClass();
                                                sv0Var3.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                sv0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        I.c(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable() { // from class: org.telegram.ui.Components.pr0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        sv0 sv0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sv0Var.getContext(), 0, sv0Var.F1);
                                        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new wr0(sv0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(10));
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                        b2Var.show();
                                        b2Var.h();
                                        break;
                                    case 1:
                                        sv0 sv0Var2 = this;
                                        sv0Var2.getClass();
                                        sv0Var2.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                        break;
                                    case 2:
                                        sv0 sv0Var3 = this;
                                        sv0Var3.getClass();
                                        sv0Var3.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                        break;
                                    default:
                                        sv0.h(this, storyItem);
                                        break;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.Components.pr0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    sv0 sv0Var = this;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sv0Var.getContext(), 0, sv0Var.F1);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                    alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new wr0(sv0Var, storyItem));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(10));
                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                    b2Var.show();
                                    b2Var.h();
                                    break;
                                case 1:
                                    sv0 sv0Var2 = this;
                                    sv0Var2.getClass();
                                    sv0Var2.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                    break;
                                case 2:
                                    sv0 sv0Var3 = this;
                                    sv0Var3.getClass();
                                    sv0Var3.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                    break;
                                default:
                                    sv0.h(this, storyItem);
                                    break;
                            }
                        }
                    }, true);
                    I.i = 3;
                    I.u = true;
                    I.v = true;
                    I.L = true;
                    I.M = 3;
                    Point point = AndroidUtilities.displaySize;
                    Point point2 = AndroidUtilities.displaySize;
                    int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                    I.N = min;
                    I.O = (min * 4) / 3;
                    I.t = true;
                    I.P = true;
                    I.W = true;
                    I.Z();
                    return true;
                }
            }
        }
        return false;
    }

    public final void K() {
        us usVar = this.P0;
        if (usVar != null) {
            ns0 ns0Var = this.W;
            float f7 = 0.0f;
            if (ns0Var != null) {
                f7 = 0.0f + (ns0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(ns0Var.getTranslationX() / ns0Var.getMeasuredWidth())));
            }
            usVar.setTranslationY(this.K1 + f7);
        }
    }

    public boolean K0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    public final boolean L(boolean z10) {
        SparseArray[] sparseArrayArr;
        if (!this.C1) {
            return false;
        }
        int i10 = 1;
        while (true) {
            sparseArrayArr = this.Z0;
            if (i10 < 0) {
                break;
            }
            sparseArrayArr[i10].clear();
            i10--;
        }
        this.a1 = 0;
        F0(sparseArrayArr[0]);
        hs0 hs0Var = this.U;
        if (hs0Var != null) {
            hs0Var.h();
            hs0Var.j();
        }
        d1(false);
        u1(z10);
        cv0 cv0Var = this.R;
        if (cv0Var != null) {
            cv0Var.w.clear();
        }
        return true;
    }

    public final void L0(float f7) {
        lu0[] lu0VarArr = this.k0;
        if (f7 != 1.0f || lu0VarArr[1].getVisibility() == 0) {
            if (this.h1) {
                lu0VarArr[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                lu0VarArr[1].setTranslationX(lu0VarArr[0].getMeasuredWidth() - (lu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                lu0VarArr[0].setTranslationX(r3.getMeasuredWidth() * f7);
                lu0VarArr[1].setTranslationX((lu0VarArr[0].getMeasuredWidth() * f7) - lu0VarArr[0].getMeasuredWidth());
            }
            O0(getTabProgress());
            float a02 = a0(f7);
            this.p0 = a02;
            this.r0.setVisibility((a02 == 0.0f || !D() || r0()) ? 4 : 0);
            org.telegram.ui.ActionBar.u0 u0Var = this.n0;
            if (u0Var == null || D()) {
                this.o0 = b0(f7);
                w1();
            } else {
                u0Var.setVisibility(x0() ? 8 : 4);
                this.o0 = 0.0f;
            }
            s1(false);
            if (f7 == 1.0f) {
                lu0 lu0Var = lu0VarArr[0];
                lu0VarArr[0] = lu0VarArr[1];
                lu0VarArr[1] = lu0Var;
                lu0Var.setVisibility(8);
                if (u0Var != null && this.x0 == 2) {
                    u0Var.setVisibility(x0() ? 8 : 4);
                }
                this.x0 = 0;
                h1();
            }
        }
    }

    public boolean N() {
        return this instanceof h40;
    }

    public void N0() {
        boolean z10 = x0() || r0();
        nv0 nv0Var = this.e0.w;
        if (nv0Var != null) {
            nv0Var.b(z10 && getClosestTab() == 9);
        }
        nv0 nv0Var2 = this.c0.w;
        if (nv0Var2 != null) {
            nv0Var2.b(z10 && getClosestTab() == 8);
        }
        for (rv0 rv0Var : this.Y1.values()) {
            qv0 qv0Var = rv0Var.c;
            if (qv0Var.s != null) {
                qv0Var.w.b(z10 && getClosestTab() == rv0Var.a);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.n0;
        if (u0Var != null) {
            ft0 ft0Var = this.J0;
            u0Var.setSearchFieldHint(LocaleController.getString((ft0Var != null && ft0Var.a() && getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
        I();
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        lu0[] lu0VarArr = this.k0;
        motionEvent.offsetLocation(x10 - lu0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - lu0VarArr[0].getY()) - lu0VarArr[0].h.getFastScroll().getY());
        return lu0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public void O0(float f7) {
        G0();
    }

    public void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            lu0[] lu0VarArr = this.k0;
            if (i10 >= lu0VarArr.length) {
                return;
            }
            lu0 lu0Var = lu0VarArr[i10];
            if (lu0Var != null && lu0Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < lu0VarArr[i10].h.getChildCount(); i11++) {
                    View childAt = lu0VarArr[i10].h.getChildAt(i11);
                    if (childAt.getY() < AndroidUtilities.dp(100.0f) + lu0VarArr[i10].h.V2) {
                        int save = canvas.save();
                        canvas.translate(childAt.getX() + lu0VarArr[i10].getX(), childAt.getY() + lu0VarArr[i10].h.getY() + lu0VarArr[i10].getY() + getY());
                        childAt.draw(canvas);
                        if (arrayList != null && (childAt instanceof gw0)) {
                            arrayList.add((gw0) childAt);
                        }
                        canvas.restoreToCount(save);
                    }
                }
            }
            i10++;
        }
    }

    public final void Q0(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        new org.telegram.ui.m61(n2Var, j10, this.m1[1], new ai.e4(this, j10, i10)).show();
    }

    public final boolean R(int i10) {
        hv0[] hv0VarArr = this.u1.n;
        if (hv0VarArr == null) {
            return false;
        }
        hv0[] hv0VarArr2 = this.t1;
        if (i10 == 0) {
            hv0 hv0Var = hv0VarArr2[i10];
            if (!hv0Var.h) {
                int[] iArr = hv0Var.f;
                int[] iArr2 = hv0VarArr[i10].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = hv0VarArr2[i10].f;
            int[] iArr4 = hv0VarArr[i10].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        hv0VarArr2[i10].a.addAll(hv0VarArr[i10].a);
        hv0VarArr2[i10].c.addAll(hv0VarArr[i10].c);
        for (Map.Entry entry : hv0VarArr[i10].d.entrySet()) {
            hv0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            hv0VarArr2[i10].b[i11] = hv0VarArr[i10].b[i11].clone();
            hv0 hv0Var2 = hv0VarArr2[i10];
            int[] iArr5 = hv0Var2.j;
            hv0 hv0Var3 = hv0VarArr[i10];
            iArr5[i11] = hv0Var3.j[i11];
            hv0Var2.i[i11] = hv0Var3.i[i11];
        }
        hv0VarArr2[i10].e.addAll(hv0VarArr[i10].e);
        return !hv0VarArr[i10].a.isEmpty();
    }

    public final void R0(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        f5.u0(n2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j10))), LocaleController.getString(R.string.Delete), true, new ai.yb(this, j10, i10, 8));
    }

    public final void S(int i10, im0 im0Var, boolean z10) {
        ArrayList arrayList = this.t1[i10].e;
        int L0 = ((s4.b0) im0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            qu0 qu0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (L0 <= ((qu0) arrayList.get(i11)).b) {
                        qu0Var = (qu0) arrayList.get(i11);
                        break;
                    }
                    i11++;
                }
                if (qu0Var == null) {
                    qu0Var = (qu0) i0.a.h(1, arrayList);
                }
            }
            if (qu0Var != null) {
                A0(i10, qu0Var.d, qu0Var.b + 1, z10);
            }
        }
    }

    public final void S0(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        String w9 = getStoriesController().w(i10, j10);
        Context context = n2Var.getContext();
        org.telegram.ui.ActionBar.d6 resourceProvider = n2Var.getResourceProvider();
        j2.d dVar = new j2.d(this, j10, i10, 6);
        Pattern pattern = f5.a;
        f5.Q(context, n2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w9, 12, LocaleController.getString(R.string.Rename), resourceProvider, dVar);
    }

    public final void T() {
        lu0[] lu0VarArr;
        lu0 lu0Var;
        int i10;
        s4.g0 adapter;
        if (this.o1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                lu0VarArr = this.k0;
                if (i12 >= lu0VarArr.length) {
                    lu0Var = null;
                    break;
                }
                lu0Var = lu0VarArr[i12];
                if (lu0Var.F == this.p1) {
                    break;
                } else {
                    i12++;
                }
            }
            if (lu0Var != null) {
                boolean q02 = q0(lu0Var.F);
                float f7 = this.n1;
                hv0[] hv0VarArr = this.t1;
                if (f7 != 1.0f) {
                    if (f7 == 0.0f) {
                        this.o1 = false;
                        if (this.p1 == 0) {
                            hv0VarArr[0].g(false);
                        }
                        lu0Var.r.setVisibility(8);
                        lu0Var.h.invalidate();
                        return;
                    }
                    boolean z10 = f7 > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new ht0(this, lu0Var, i11));
                    ofFloat.addListener(new org.telegram.ui.xi(this, z10, q02 ? 1 : 0, lu0Var));
                    ofFloat.setInterpolator(bs.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.o1 = false;
                int i13 = this.q1;
                int[] iArr = this.m1;
                iArr[q02 ? 1 : 0] = i13;
                if (!q02) {
                    SharedConfig.setMediaColumnsCount(i13);
                } else if (c0(lu0Var.F) >= 5) {
                    SharedConfig.setStoriesColumnsCount(this.q1);
                }
                for (int i14 = 0; i14 < lu0VarArr.length; i14++) {
                    lu0 lu0Var2 = lu0VarArr[i14];
                    if (lu0Var2 != null && lu0Var2.h != null && (((i10 = lu0Var2.F) == 0 || q0(i10)) && (adapter = lu0VarArr[i14].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i14 == 0) {
                            hv0VarArr[0].g(false);
                        }
                        lu0VarArr[i14].r.setVisibility(8);
                        lu0VarArr[i14].x.y1(iArr[q02 ? 1 : 0]);
                        lu0VarArr[i14].h.a0();
                        lu0VarArr[i14].h.invalidate();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(lu0VarArr[i14].h);
                        } else {
                            adapter.l();
                        }
                    }
                }
                if (this.s < 0) {
                    Z0();
                    return;
                }
                while (i11 < lu0VarArr.length) {
                    lu0 lu0Var3 = lu0VarArr[i11];
                    if (lu0Var3.F == this.p1) {
                        View m10 = lu0Var3.s.m(this.s);
                        if (m10 != null) {
                            this.v = m10.getTop();
                        }
                        lu0 lu0Var4 = lu0VarArr[i11];
                        lu0Var4.x.h1(this.s, (-lu0Var4.h.getPaddingTop()) + this.v);
                    }
                    i11++;
                }
            }
        }
    }

    public final void T0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        if (shouldShowUrlInAlert) {
            f5.p0(n2Var, str, true, true);
        } else {
            pf.d.r(n2Var.getParentActivity(), str);
        }
    }

    public final void U(int i10) {
        ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 0) {
            if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                this.A0.setTextSize(20);
            } else {
                this.A0.setTextSize(18);
            }
        }
        if (i10 == 0) {
            this.H.l();
        }
    }

    public int U0() {
        return -1;
    }

    public final String V(boolean z10) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        hs0 hs0Var;
        if (!s0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (hs0Var = this.U) != null) {
            return hs0Var.getBotPreviewsSubtitle();
        }
        au0 au0Var = this.c0;
        if (au0Var == null || au0Var.s == null) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < au0Var.s.i.size(); i12++) {
                MessageObject messageObject = (MessageObject) au0Var.s.i.get(i12);
                TL_stories.StoryItem storyItem = messageObject.storyItem;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (MessageObject.isVideoDocument(messageMedia.document)) {
                        i11++;
                    } else if (messageObject.storyItem.media.photo != null) {
                        i10++;
                    }
                }
            }
        }
        if (i10 == 0 && i11 == 0) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            sb2.append(LocaleController.formatPluralString("Images", i10, new Object[0]));
        }
        if (i11 > 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(LocaleController.formatPluralString("Videos", i11, new Object[0]));
        }
        return sb2.toString();
    }

    public final void V0(ArrayList arrayList, boolean z10) {
        au0 au0Var = this.c0;
        if (au0Var == null || au0Var.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        if (z10 && arrayList.size() > n2Var.getMessagesController().storiesPinnedToTopCountMax) {
            xc.a0(n2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", n2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            return;
        }
        ci.a7 a7Var = au0Var.s;
        int i10 = a7Var.c;
        ArrayList arrayList2 = a7Var.g;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        boolean z11 = true;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Integer num = (Integer) arrayList.get(size);
            num.getClass();
            if (z10 && !arrayList3.contains(num)) {
                arrayList3.add(0, num);
            } else if (!z10 && arrayList3.contains(num)) {
                arrayList3.remove(num);
            }
        }
        boolean z12 = arrayList3.size() > MessagesController.getInstance(i10).storiesPinnedToTopCountMax;
        if (!z12) {
            boolean z13 = arrayList2.size() != arrayList3.size();
            if (!z13) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList2.size()) {
                        break;
                    }
                    if (arrayList2.get(i11) != arrayList3.get(i11)) {
                        z13 = true;
                        break;
                    }
                    i11++;
                }
            }
            if (z13) {
                arrayList2.clear();
                arrayList2.addAll(arrayList3);
                a7Var.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(a7Var.d);
                ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new ci.e6(2));
            }
            z11 = z12;
        }
        if (z11) {
            xc.a0(n2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", n2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
        } else if (z10) {
            xc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
        } else {
            xc.a0(n2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
        }
    }

    public final lu0 W(int i10) {
        int i11 = 0;
        while (true) {
            lu0[] lu0VarArr = this.k0;
            if (i11 >= lu0VarArr.length) {
                return null;
            }
            lu0 lu0Var = lu0VarArr[i11];
            if (lu0Var != null && lu0Var.F == i10) {
                return lu0Var;
            }
            i11++;
        }
    }

    public final boolean W0(MotionEvent motionEvent, boolean z10) {
        lu0 lu0Var;
        hs0 hs0Var;
        int closestTab = getClosestTab();
        it0 it0Var = this.I0;
        int i10 = -1;
        int i11 = it0Var.O.get(it0Var.n + (z10 ? 1 : -1), -1);
        ns0 ns0Var = this.W;
        if (ns0Var != null) {
            if (y0(closestTab) || closestTab == 8) {
                b91 b91Var = ns0Var.n;
                i10 = b91Var.b0.get(b91Var.F + (z10 ? 1 : -1), -1);
            } else if (y0(i11) || i11 == 8) {
                i10 = ns0Var.getCurrentAlbumId();
            }
            if (i10 == 0) {
                i11 = 8;
            } else if (i10 > 0) {
                i11 = k1(i10).a;
            }
        }
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.u0 u0Var = this.n0;
            if (u0Var == null || D()) {
                this.o0 = b0(0.0f);
                v1(0.0f);
            } else {
                u0Var.setVisibility(x0() ? 8 : 4);
                this.o0 = 0.0f;
            }
            if ((!this.V0 || getSelectedTab() != 11) && (!C() || !this.C1 || (getClosestTab() != 8 && !y0(getClosestTab())))) {
                lu0[] lu0VarArr = this.k0;
                lu0 lu0Var2 = lu0VarArr[0];
                if (lu0Var2 != null && lu0Var2.F == 13 && (hs0Var = this.U) != null) {
                    di.a aVar = hs0Var.n;
                    if (!z10) {
                    }
                }
                lu0 lu0Var3 = lu0VarArr[0];
                is0 is0Var = this.V;
                if (lu0Var3 != null && lu0Var3.F == 14 && is0Var != null) {
                    yh.v1 v1Var = is0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.C1 || (lu0Var = lu0VarArr[0]) == null || lu0Var.F != 13) && ((is0Var == null || !is0Var.g()) && (ns0Var == null || !ns0Var.w))) {
                    s1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    l0();
                    this.y1 = false;
                    this.x1 = true;
                    P0(true);
                    this.z1 = (int) motionEvent.getX();
                    this.G.setEnabled(false);
                    it0Var.setEnabled(false);
                    lu0 lu0Var4 = lu0VarArr[1];
                    lu0Var4.F = i11;
                    lu0Var4.setVisibility(0);
                    this.h1 = z10;
                    o1(true);
                    if (z10) {
                        lu0VarArr[1].setTranslationX(lu0VarArr[0].getMeasuredWidth());
                    } else {
                        lu0VarArr[1].setTranslationX(-lu0VarArr[0].getMeasuredWidth());
                    }
                    O0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final int X(int i10, int i11, boolean z10) {
        int i12 = i11 + (!z10 ? 1 : -1);
        if (i12 > 6) {
            i12 = !z10 ? 9 : 6;
        }
        return Utilities.clamp(i12, 9, (this.k1 && i10 == 1) ? 1 : 2);
    }

    public final int Y(boolean z10) {
        return this.X1 + (z10 ? AndroidUtilities.dp(52.0f) : 0);
    }

    public final void Y0(s4.g0 g0Var) {
        if (g0Var instanceof mv0) {
            ArrayList arrayList = this.E0;
            ArrayList arrayList2 = this.F0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (g0Var == this.M) {
            ArrayList arrayList3 = this.G0;
            ArrayList arrayList4 = this.H0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        zu0 zu0Var = this.N;
        if (g0Var == zu0Var) {
            zu0Var.r = null;
        }
    }

    public final int Z(int i10) {
        return d0(i10) + AndroidUtilities.dp(54.0f) + this.b2 + (i10 == 9 ? AndroidUtilities.dp(64.0f) : 0);
    }

    public final void Z0() {
        int i10;
        int i11 = 0;
        while (true) {
            lu0[] lu0VarArr = this.k0;
            if (i11 >= lu0VarArr.length) {
                return;
            }
            rs0 rs0Var = lu0VarArr[i11].h;
            if (rs0Var != null) {
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < rs0Var.getChildCount(); i14++) {
                    View childAt = rs0Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.s7) {
                        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                        int messageId = s7Var.getMessageId();
                        i13 = s7Var.getTop();
                        i12 = messageId;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.i7) {
                        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                        int id2 = i7Var.getMessage().getId();
                        i13 = i7Var.getTop();
                        i12 = id2;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.h7) {
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                        i12 = h7Var.getMessage().getId();
                        i13 = h7Var.getTop();
                    }
                    if (i12 != 0) {
                        break;
                    }
                }
                if (i12 != 0) {
                    int i15 = lu0VarArr[i11].F;
                    int i16 = -1;
                    if (q0(i15)) {
                        pv0 m12 = m1(i15);
                        if (m12 != null && m12.s != null) {
                            int i17 = 0;
                            while (true) {
                                if (i17 >= m12.s.i.size()) {
                                    break;
                                }
                                if (i12 == ((MessageObject) m12.s.i.get(i17)).getId()) {
                                    i16 = i17;
                                    break;
                                }
                                i17++;
                            }
                        }
                        i10 = i16;
                    } else if (i15 >= 0) {
                        hv0[] hv0VarArr = this.t1;
                        if (i15 < hv0VarArr.length) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= hv0VarArr[i15].a.size()) {
                                    break;
                                }
                                if (i12 == ((MessageObject) hv0VarArr[i15].a.get(i18)).getId()) {
                                    i16 = i18;
                                    break;
                                }
                                i18++;
                            }
                            i10 = hv0VarArr[i15].m + i16;
                        }
                    }
                    if (i16 >= 0) {
                        ((s4.b0) rs0Var.getLayoutManager()).h1(i10, (-lu0VarArr[i11].h.getPaddingTop()) + i13);
                        if (this.o1) {
                            lu0 lu0Var = lu0VarArr[i11];
                            lu0Var.s.h1(i10, (-lu0Var.h.getPaddingTop()) + i13);
                        }
                    }
                }
            }
            i11++;
        }
    }

    public final float a0(float f7) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f10 = 0.0f;
        if (r0()) {
            return 0.0f;
        }
        lu0[] lu0VarArr = this.k0;
        lu0 lu0Var = lu0VarArr[1];
        is0 is0Var = this.V;
        if (lu0Var != null && ((i12 = lu0Var.F) == 0 || (((i12 == 8 || y0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = lu0VarArr[1].F) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && is0Var != null)))) {
            f10 = 0.0f + f7;
        }
        lu0 lu0Var2 = lu0VarArr[0];
        return (lu0Var2 == null || !((i10 = lu0Var2.F) == 0 || (((i10 == 8 || y0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = lu0VarArr[0].F) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && is0Var != null)))) ? f10 : (1.0f - f7) + f10;
    }

    public final void a1(int i10) {
        it0 it0Var;
        if (this.L1 || (it0Var = this.I0) == null) {
            return;
        }
        it0Var.h(null, i10, it0Var.P.get(i10));
    }

    @Override // org.telegram.ui.Cells.n2
    public final boolean b() {
        return false;
    }

    public final float b0(float f7) {
        float f10 = 0.0f;
        if (r0()) {
            return 0.0f;
        }
        lu0[] lu0VarArr = this.k0;
        lu0 lu0Var = lu0VarArr[1];
        if (lu0Var != null && u0(lu0Var.F) && lu0VarArr[1].F != 11) {
            f10 = 0.0f + f7;
        }
        lu0 lu0Var2 = lu0VarArr[0];
        return (lu0Var2 == null || !u0(lu0Var2.F) || lu0VarArr[0].F == 11) ? f10 : (1.0f - f7) + f10;
    }

    public final void b1(float f7, int i10) {
        it0 it0Var = this.I0;
        if (it0Var != null) {
            it0Var.j(f7, y0(i10) ? 8 : i10);
        }
        ns0 ns0Var = this.W;
        if (ns0Var != null) {
            b91 b91Var = ns0Var.n;
            if (y0(i10)) {
                b91Var.f(f7, j1(i10));
            } else if (i10 == 8) {
                b91Var.f(f7, 0);
            }
        }
    }

    public final int c0(int i10) {
        pv0 m12;
        ci.a7 a7Var;
        if (!q0(i10) || (m12 = m1(i10)) == null || (a7Var = m12.s) == null) {
            return 0;
        }
        return a7Var.g();
    }

    public final void c1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            lu0[] lu0VarArr = this.k0;
            if (i10 >= lu0VarArr.length) {
                if (this.F == 0) {
                    cu0 cu0Var = this.a0;
                    cu0Var.d = chatFull;
                    cu0Var.e = arrayList;
                }
                y1(true);
                for (int i11 = 0; i11 < lu0VarArr.length; i11++) {
                    lu0 lu0Var = lu0VarArr[i11];
                    if (lu0Var.F == 7 && lu0Var.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(lu0VarArr[i11].h);
                    }
                }
                return;
            }
            lu0 lu0Var2 = lu0VarArr[i10];
            if (lu0Var2.F == 7 && lu0Var2.h.getAdapter() != null && lu0VarArr[i10].h.getAdapter().h() != 0 && this.v1.getMessagesController().getStoriesController().j.size() > 0) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final int d0(int i10) {
        ns0 ns0Var = this.W;
        return (int) ((ns0Var == null || !(y0(i10) || i10 == 8)) ? 0.0f : ns0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f));
    }

    public void d1(boolean z10) {
        if (this.C1 == z10) {
            return;
        }
        this.C1 = z10;
        AnimatorSet animatorSet = this.N1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ha haVar = this.B0;
        if (z10) {
            haVar.setVisibility(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.N1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(haVar, (Property<ha, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.N1.setDuration(180L);
        this.N1.addListener(new org.telegram.ui.ho(20, this, z10));
        this.N1.start();
        if (z10) {
            x1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v34 */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        rs0 rs0Var;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i12;
        hm0 hm0Var;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        int size;
        int i15;
        boolean z12;
        rs0 rs0Var2;
        int i16;
        int i17;
        rs0 rs0Var3;
        int i18 = NotificationCenter.mediaDidLoad;
        hm0 hm0Var2 = this.O;
        hm0 hm0Var3 = this.M;
        gv0 gv0Var = this.J;
        hm0 hm0Var4 = this.L;
        hm0 hm0Var5 = this.K;
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        zu0 zu0Var = this.N;
        xt0 xt0Var = this.H;
        long j10 = this.j1;
        lu0[] lu0VarArr = this.k0;
        hv0[] hv0VarArr = this.t1;
        if (i10 == i18) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != n2Var.getClassGuid() || intValue2 != hv0VarArr[intValue3].p) {
                if (this.u1 == null || !hv0VarArr[intValue3].a.isEmpty() || hv0VarArr[intValue3].o || !R(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    hm0Var2 = xt0Var;
                } else if (intValue3 == 1) {
                    hm0Var2 = hm0Var5;
                } else if (intValue3 == 2) {
                    hm0Var2 = hm0Var4;
                } else if (intValue3 == 3) {
                    hm0Var2 = gv0Var;
                } else if (intValue3 == 4) {
                    hm0Var2 = hm0Var3;
                } else if (intValue3 != 5) {
                    hm0Var2 = intValue3 == 15 ? zu0Var : null;
                }
                if (hm0Var2 != null) {
                    for (int i19 = 0; i19 < lu0VarArr.length; i19++) {
                        lu0 lu0Var = lu0VarArr[i19];
                        if (lu0Var != null && (rs0Var2 = lu0Var.h) != null && rs0Var2.getAdapter() == hm0Var2) {
                            lu0VarArr[i19].h.B0();
                        }
                    }
                    hm0Var2.l();
                }
                this.b1 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j10);
            int i20 = longValue == j10 ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                hv0VarArr[intValue3].f[i20] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i16 = intValue3;
                hm0Var2 = xt0Var;
            } else if (intValue3 == 1) {
                i16 = intValue3;
                hm0Var2 = hm0Var5;
            } else if (intValue3 == 2) {
                i16 = intValue3;
                hm0Var2 = hm0Var4;
            } else if (intValue3 == 3) {
                i16 = intValue3;
                hm0Var2 = gv0Var;
            } else if (intValue3 == 4) {
                i16 = intValue3;
                hm0Var2 = hm0Var3;
            } else if (intValue3 == 5) {
                i16 = intValue3;
            } else if (intValue3 == 15) {
                hm0Var2 = zu0Var;
                i16 = 8;
            } else {
                i16 = intValue3;
                hm0Var2 = null;
            }
            int size2 = hv0VarArr[i16].a.size();
            if (hm0Var2 != null) {
                i17 = hm0Var2.h();
                if (hm0Var2 instanceof em0) {
                    ((em0) hm0Var2).L();
                }
            } else {
                i17 = 0;
            }
            hv0VarArr[i16].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size3);
                    if (hv0VarArr[i16].a(messageObject2, i20, r13, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject2.getId(), r13);
                        hv0 hv0Var = hv0VarArr[i16];
                        int i21 = hv0Var.m - r13;
                        hv0Var.m = i21;
                        if (i21 < 0) {
                            hv0Var.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                hv0VarArr[i16].l = ((Boolean) objArr[5]).booleanValue();
                hv0 hv0Var2 = hv0VarArr[i16];
                if (hv0Var2.l) {
                    hv0Var2.m = 0;
                }
            } else {
                ?? r12 = 0;
                int i22 = 0;
                while (i22 < arrayList.size()) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i22);
                    if (hv0VarArr[i16].a(messageObject3, i20, r12, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject3.getId(), true);
                        hv0 hv0Var3 = hv0VarArr[i16];
                        int i23 = hv0Var3.n - 1;
                        hv0Var3.n = i23;
                        if (i23 < 0) {
                            hv0Var3.n = r12;
                        }
                    }
                    i22++;
                    r12 = 0;
                }
                hv0 hv0Var4 = hv0VarArr[i16];
                if (hv0Var4.o && hv0Var4.a.size() > 0) {
                    hv0 hv0Var5 = hv0VarArr[i16];
                    hv0Var5.k = ((MessageObject) hv0Var5.a.get(0)).getId();
                }
                hv0VarArr[i16].i[i20] = ((Boolean) objArr[5]).booleanValue();
                hv0 hv0Var6 = hv0VarArr[i16];
                if (hv0Var6.i[i20]) {
                    int size4 = hv0Var6.b[i20].size();
                    if (i20 == 0) {
                        size4 += hv0VarArr[i16].m;
                    }
                    hv0VarArr[i16].f[i20] = size4;
                }
            }
            if (!booleanValue && i20 == 0) {
                hv0 hv0Var7 = hv0VarArr[i16];
                if (hv0Var7.i[i20] && this.c1 != 0) {
                    hv0Var7.g = true;
                    n2Var.getMediaDataController().loadMedia(this.c1, 50, hv0VarArr[i16].j[1], 0, i16, this.F, 1, n2Var.getClassGuid(), hv0VarArr[i16].p, null, null);
                }
            }
            int i24 = i16;
            if (hm0Var2 != null) {
                ku0 ku0Var = null;
                for (int i25 = 0; i25 < lu0VarArr.length; i25++) {
                    lu0 lu0Var2 = lu0VarArr[i25];
                    if (lu0Var2 != null && (rs0Var3 = lu0Var2.h) != null && rs0Var3.getAdapter() == hm0Var2) {
                        ku0 ku0Var2 = lu0VarArr[i25].h;
                        ku0Var2.B0();
                        ku0Var = ku0Var2;
                    }
                }
                int h = hm0Var2.h();
                if (hm0Var2 != xt0Var) {
                    try {
                        hm0Var2.l();
                    } catch (Throwable unused) {
                    }
                } else if (xt0Var.h() == i17) {
                    AndroidUtilities.updateVisibleRows(ku0Var);
                } else {
                    xt0Var.l();
                }
                if (!hv0VarArr[i24].a.isEmpty() || hv0VarArr[i24].g) {
                    if (ku0Var != null && (hm0Var2 == xt0Var || h >= i17)) {
                        z(ku0Var, i17, sparseBooleanArray);
                    }
                } else if (ku0Var != null) {
                    z(ku0Var, i17, sparseBooleanArray);
                }
                if (ku0Var != null && !hv0VarArr[i24].o) {
                    if (size2 == 0) {
                        for (int i26 = 0; i26 < 2; i26++) {
                            if (lu0VarArr[i26].F == 0) {
                                ((s4.b0) ku0Var.getLayoutManager()).h1(xt0Var.L(0), 0);
                            }
                        }
                    } else {
                        Z0();
                    }
                }
            }
            hv0 hv0Var8 = hv0VarArr[i24];
            if (hv0Var8.o) {
                if (hv0Var8.a.size() == 0) {
                    C0(i24);
                } else {
                    hv0VarArr[i24].o = false;
                }
            }
            this.b1 = true;
            return;
        }
        if (i10 == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat chat = DialogObject.isChatDialog(j10) ? n2Var.getMessagesController().getChat(Long.valueOf(-j10)) : null;
            long longValue2 = ((Long) objArr[1]).longValue();
            if (ChatObject.isChannel(chat)) {
                if (longValue2 == 0 && this.c1 != 0) {
                    i14 = 1;
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    size = arrayList2.size();
                    int i27 = -1;
                    i15 = 0;
                    z12 = false;
                    while (i15 < size) {
                        xt0 xt0Var2 = xt0Var;
                        int i28 = 0;
                        while (i28 < hv0VarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (hv0VarArr[i28].b(((Integer) arrayList2.get(i15)).intValue(), i14) != null) {
                                i27 = i28;
                                z12 = true;
                            }
                            i28++;
                            arrayList2 = arrayList3;
                        }
                        i15++;
                        xt0Var = xt0Var2;
                    }
                    xt0 xt0Var3 = xt0Var;
                    if (z12) {
                        this.b1 = true;
                        if (xt0Var3 != null) {
                            xt0Var3.l();
                        }
                        if (hm0Var5 != null) {
                            hm0Var5.l();
                        }
                        if (hm0Var4 != null) {
                            hm0Var4.l();
                        }
                        if (gv0Var != null) {
                            gv0Var.X(false);
                        }
                        if (hm0Var3 != null) {
                            hm0Var3.l();
                        }
                        if (zu0Var != null) {
                            zu0Var.l();
                        }
                        if (hm0Var2 != null) {
                            hm0Var2.l();
                        }
                        if (i27 == 0 || i27 == 1 || i27 == 2 || i27 == 4) {
                            B0(true);
                        }
                    }
                    W(i27);
                    return;
                }
                if (longValue2 != chat.id) {
                    return;
                }
            } else if (longValue2 != 0) {
                return;
            }
            i14 = 0;
            ArrayList arrayList22 = (ArrayList) objArr[0];
            size = arrayList22.size();
            int i272 = -1;
            i15 = 0;
            z12 = false;
            while (i15 < size) {
            }
            xt0 xt0Var32 = xt0Var;
            if (z12) {
            }
            W(i272);
            return;
        }
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == j10) {
                ArrayList arrayList4 = (ArrayList) objArr[1];
                boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j10);
                int i29 = 0;
                boolean z13 = false;
                while (i29 < arrayList4.size()) {
                    MessageObject messageObject4 = (MessageObject) arrayList4.get(i29);
                    ArrayList arrayList5 = arrayList4;
                    if (MessageObject.getMedia(messageObject4.messageOwner) == null || messageObject4.needDrawBluredPreview()) {
                        i13 = i29;
                    } else {
                        int mediaType = MediaDataController.getMediaType(messageObject4.messageOwner);
                        i13 = i29;
                        if (mediaType == -1) {
                            return;
                        }
                        hv0 hv0Var9 = hv0VarArr[mediaType];
                        if (hv0Var9.l) {
                            z11 = z13;
                            if (hv0Var9.a(messageObject4, messageObject4.getDialogId() == j10 ? 0 : 1, true, isEncryptedDialog2)) {
                                this.X0[mediaType] = 1;
                                z10 = true;
                                i29 = i13 + 1;
                                z13 = z10;
                                arrayList4 = arrayList5;
                            }
                            z10 = z11;
                            i29 = i13 + 1;
                            z13 = z10;
                            arrayList4 = arrayList5;
                        }
                    }
                    z11 = z13;
                    z10 = z11;
                    i29 = i13 + 1;
                    z13 = z10;
                    arrayList4 = arrayList5;
                }
                boolean z14 = z13;
                boolean z15 = true;
                if (z14) {
                    this.b1 = true;
                    int i30 = 0;
                    while (i30 < lu0VarArr.length) {
                        int i31 = lu0VarArr[i30].F;
                        if (i31 == 0) {
                            hm0Var = xt0Var;
                        } else if (i31 == z15) {
                            hm0Var = hm0Var5;
                        } else if (i31 == 2) {
                            hm0Var = hm0Var4;
                        } else if (i31 == 3) {
                            hm0Var = gv0Var;
                        } else {
                            if (i31 == 4) {
                                hm0Var = hm0Var3;
                            } else if (i31 == 5) {
                                hm0Var = hm0Var2;
                            } else {
                                hm0Var = i31 == 15 ? zu0Var : null;
                                if (hm0Var != null) {
                                    hm0Var.h();
                                    xt0Var.l();
                                    hm0Var5.l();
                                    hm0Var4.l();
                                    gv0Var.X(false);
                                    hm0Var3.l();
                                    zu0Var.l();
                                    hm0Var2.l();
                                }
                                i30++;
                                z15 = true;
                            }
                            if (hm0Var != null) {
                            }
                            i30++;
                            z15 = true;
                        }
                        if (hm0Var != null) {
                        }
                        i30++;
                        z15 = true;
                    }
                    y1(z15);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messageReceivedByServer) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l4 = (Long) objArr[3];
            if (l4.longValue() == j10 || l4.longValue() == this.c1) {
                int i32 = l4.longValue() == j10 ? 0 : 1;
                for (hv0 hv0Var10 : hv0VarArr) {
                    hv0Var10.f(i32, num.intValue(), num2.intValue());
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart || i10 == NotificationCenter.messagePlayingPlayStateChanged || i10 == NotificationCenter.messagePlayingDidReset) {
            if (i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
                if (((MessageObject) objArr[0]).eventId != 0) {
                    return;
                }
                for (int i33 = 0; i33 < lu0VarArr.length; i33++) {
                    int childCount = lu0VarArr[i33].h.getChildCount();
                    for (int i34 = 0; i34 < childCount; i34++) {
                        View childAt = lu0VarArr[i33].h.getChildAt(i34);
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                            if (h7Var.getMessage() != null) {
                                h7Var.g(false, true);
                            }
                        }
                    }
                }
                return;
            }
            for (int i35 = 0; i35 < lu0VarArr.length; i35++) {
                lu0 lu0Var3 = lu0VarArr[i35];
                if (lu0Var3 != null && (rs0Var = lu0Var3.h) != null) {
                    int childCount2 = rs0Var.getChildCount();
                    for (int i36 = 0; i36 < childCount2; i36++) {
                        View childAt2 = lu0VarArr[i35].h.getChildAt(i36);
                        if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) childAt2;
                            if (h7Var2.getMessage() != null) {
                                h7Var2.g(false, true);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.storiesListUpdated) {
            ci.a7 a7Var = (ci.a7) objArr[0];
            au0 au0Var = this.c0;
            if (au0Var == null || a7Var != au0Var.s) {
                gs0 gs0Var = this.e0;
                if (gs0Var == null || a7Var != gs0Var.s) {
                    Iterator it = this.Y1.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        rv0 rv0Var = (rv0) it.next();
                        if (rv0Var.c.s == a7Var) {
                            i12 = rv0Var.a;
                            break;
                        }
                    }
                } else {
                    i12 = 9;
                }
            } else {
                i12 = 8;
            }
            lu0 W = W(i12);
            if (W != null) {
                if (W.b != (a7Var.g() > 0)) {
                    W.b = a7Var.g() > 0;
                    q1(W, true);
                }
            }
            if (W != null) {
                AndroidUtilities.notifyDataSetChanged(W.h);
                if (W.h.getLayoutManager() instanceof s4.b0) {
                    im0 im0Var = W.h;
                    G(W, im0Var, (s4.b0) im0Var.getLayoutManager());
                }
            }
            eu0 eu0Var = this.D1;
            if (eu0Var != null) {
                eu0Var.R();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated) {
            for (lu0 lu0Var4 : lu0VarArr) {
                if (lu0Var4 != null && lu0Var4.h != null && q0(lu0Var4.F)) {
                    if (!s0() || lu0Var4.h.getAdapter() == null) {
                        for (int i37 = 0; i37 < lu0Var4.h.getChildCount(); i37++) {
                            View childAt3 = lu0Var4.h.getChildAt(i37);
                            if (childAt3 instanceof org.telegram.ui.Cells.s7) {
                                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt3;
                                p6 p6Var = s7Var.N;
                                if (!s7Var.d0 || (messageObject = s7Var.n) == null || (storyItem = messageObject.storyItem) == null || (storyViews = storyItem.views) == null) {
                                    s7Var.L = false;
                                    p6Var.t("", false, true);
                                } else {
                                    int i38 = storyViews.views_count;
                                    s7Var.L = i38 > 0;
                                    p6Var.t(AndroidUtilities.formatWholeNumber(i38, 0), true, true);
                                }
                            }
                        }
                    } else {
                        AndroidUtilities.notifyDataSetChanged(lu0Var4.h);
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.channelRecommendationsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
                this.Q.E(true);
                y1(true);
                F();
                return;
            }
            return;
        }
        int i39 = NotificationCenter.savedMessagesDialogsUpdate;
        cv0 cv0Var = this.R;
        if (i10 == i39) {
            if (j10 == 0 || j10 == n2Var.getUserConfig().getClientUserId()) {
                cv0Var.F(true);
                y1(true);
                F();
                N0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogsNeedReload) {
            cv0Var.F(true);
            return;
        }
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
                y1(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updatedChatRanks) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[1]).longValue();
            if (j10 != (-longValue3)) {
                return;
            }
            String str = (String) objArr[2];
            cu0 cu0Var = this.a0;
            if (cu0Var != null) {
                TLRPC.ChatFull chatFull = cu0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i40 = 0; i40 < cu0Var.d.participants.participants.size(); i40++) {
                        cu0Var.d.participants.participants.get(i40).setRank(longValue4, str);
                    }
                }
                for (lu0 lu0Var5 : lu0VarArr) {
                    if (lu0Var5.F == 7) {
                        AndroidUtilities.updateVisibleRows(lu0Var5.h);
                    }
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didUpdatePollResults) {
            long longValue5 = ((Long) objArr[0]).longValue();
            TLRPC.TL_poll tL_poll = (TLRPC.TL_poll) objArr[1];
            TLRPC.PollResults pollResults = (TLRPC.PollResults) objArr[2];
            for (int i41 = 0; i41 < lu0VarArr.length; i41++) {
                if (lu0VarArr[i41].h.getAdapter() == zu0Var) {
                    rs0 rs0Var4 = lu0VarArr[i41].h;
                    ArrayList arrayList6 = zu0Var.n;
                    for (int i42 = 0; i42 < arrayList6.size(); i42++) {
                        MessageObject messageObject5 = (MessageObject) arrayList6.get(i42);
                        if (messageObject5 != null && messageObject5.getPollId() == longValue5) {
                            TLRPC.MessageMedia messageMedia = messageObject5.messageOwner.media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                if (tL_poll != null) {
                                    tL_messageMediaPoll.poll = tL_poll;
                                }
                                MessageObject.updatePollResults(tL_messageMediaPoll, pollResults);
                                zu0Var.m(i42);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        it0 it0Var = this.I0;
        if (it0Var != null) {
            canvas.save();
            canvas.translate(it0Var.getX(), it0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        et0 et0Var = this.R0;
        if (et0Var != null) {
            int i10 = et0Var.U;
            if ((i10 == 3 || i10 == 1) && this.P0 == null) {
                canvas.save();
                canvas.translate(et0Var.getX(), et0Var.getY());
                et0Var.setDrawOverlay(true);
                et0Var.draw(canvas);
                et0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        if (view != this.R0 || this.P0 != null) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        lu0[] lu0VarArr = this.k0;
        float top = lu0VarArr[0].getTop();
        ns0 ns0Var = this.W;
        if (ns0Var != null && ((i10 = lu0VarArr[0].F) == 8 || y0(i10))) {
            top -= ns0Var.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1(int i10, boolean z10) {
        int i11;
        lu0 W;
        if (z10 && getY() != 0.0f && this.E == 1) {
            return;
        }
        if (z10 && q0(i10) && c0(i10) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.j1);
        bundle.putLong("topic_id", this.F);
        hv0[] hv0VarArr = this.t1;
        if (z10 && (W = W(0)) != null) {
            ArrayList arrayList = hv0VarArr[0].e;
            int L0 = W.x.L0();
            if (L0 >= 0) {
                qu0 qu0Var = null;
                if (arrayList != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        if (L0 <= ((qu0) arrayList.get(i12)).b) {
                            qu0Var = (qu0) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (qu0Var == null) {
                        qu0Var = (qu0) i0.a.h(1, arrayList);
                    }
                }
                if (qu0Var != null) {
                    i11 = qu0Var.c;
                    if (i10 != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i10 == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    org.telegram.ui.k8 k8Var = new org.telegram.ui.k8(hv0VarArr[0].q, i11, bundle);
                    k8Var.M = new le.b(this, 12);
                    this.v1.presentFragment(k8Var);
                }
            }
        }
        i11 = 0;
        if (i10 != 9) {
        }
        org.telegram.ui.k8 k8Var2 = new org.telegram.ui.k8(hv0VarArr[0].q, i11, bundle);
        k8Var2.M = new le.b(this, 12);
        this.v1.presentFragment(k8Var2);
    }

    @Override // org.telegram.ui.Cells.n2
    public final void f(org.telegram.ui.Cells.r2 r2Var) {
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        if (n2Var != null && n2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            n2Var.getOrCreateStoryViewer().getClass();
            ci.aa orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
            Context context = n2Var.getContext();
            long dialogId = r2Var.getDialogId();
            ci.r7 a2 = ci.r7.a((im0) r2Var.getParent());
            a2.s += ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).t1) ? AndroidUtilities.dp(68.0f) : 0;
            orCreateStoryViewer.D(context, dialogId, a2);
        }
    }

    public final void f1(int i10) {
        int j12 = j1(getClosestTab());
        ns0 ns0Var = this.W;
        if (j12 != i10) {
            if (ns0Var != null) {
                ns0Var.n.d(i10, ns0Var.s.i(i10));
                return;
            }
            return;
        }
        ns0Var.setReorderingAlbums(true);
        rv0 k12 = k1(i10);
        lu0 W = W(k12.a);
        if (W == null) {
            return;
        }
        rs0 rs0Var = W.h;
        for (int i11 = 0; i11 < rs0Var.getChildCount(); i11++) {
            View childAt = rs0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s7) {
                ((org.telegram.ui.Cells.s7) childAt).l(true, true);
            }
        }
        qv0 qv0Var = k12.c;
        if (qv0Var != null && !qv0Var.x) {
            qv0Var.x = true;
        }
        s1(true);
    }

    public final float g0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            lu0[] lu0VarArr = this.k0;
            if (i11 >= lu0VarArr.length) {
                break;
            }
            lu0 lu0Var = lu0VarArr[i11];
            if (lu0Var != null) {
                int i13 = lu0Var.F;
                if ((z10 && i10 == 8 && y0(i13)) || i13 == i10) {
                    i12++;
                    width = lu0VarArr[i11].getTranslationX();
                }
            }
            i11++;
        }
        if (i12 == 2) {
            return 0.0f;
        }
        return width;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r1 = r2[r1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g1(boolean z10) {
        lu0[] lu0VarArr;
        lu0 lu0Var;
        if (this.o1) {
            return;
        }
        int i10 = 0;
        while (true) {
            lu0VarArr = this.k0;
            if (i10 >= lu0VarArr.length) {
                lu0Var = null;
                break;
            }
            int i11 = lu0VarArr[i10].F;
            if (i11 == 0 || q0(i11)) {
                break;
            } else {
                i10++;
            }
        }
        if (lu0Var != null) {
            int i12 = lu0Var.F;
            this.p1 = i12;
            boolean q02 = q0(i12);
            int[] iArr = this.m1;
            int X = X(q02 ? 1 : 0, iArr[q02 ? 1 : 0], z10);
            this.q1 = X;
            if (X != iArr[q02 ? 1 : 0]) {
                if (this.k1 && q0(this.p1)) {
                    return;
                }
                lu0Var.r.setVisibility(0);
                if (q0(this.p1)) {
                    lu0Var.r.setAdapter(n1(this.p1));
                } else {
                    lu0Var.r.setAdapter(this.I);
                }
                ku0 ku0Var = lu0Var.r;
                ku0Var.setPadding(ku0Var.getPaddingLeft(), Z(this.p1), lu0Var.r.getPaddingRight(), Y(x0()));
                lu0Var.s.y1(X);
                lu0Var.r.a0();
                lu0Var.s.O = new gt0(this, lu0Var, 0);
                AndroidUtilities.updateVisibleRows(lu0Var.h);
                this.o1 = true;
                if (this.p1 == 0) {
                    this.t1[0].g(true);
                }
                this.n1 = 0.0f;
                if (this.s < 0) {
                    Z0();
                    return;
                }
                for (lu0 lu0Var2 : lu0VarArr) {
                    if (lu0Var2.F == this.p1) {
                        lu0Var2.s.h1(this.s, this.v - lu0Var2.r.getPaddingTop());
                    }
                }
            }
        }
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.Z0[0];
    }

    public float getBottomButtonStoriesVisibility() {
        lu0 lu0Var;
        lu0 lu0Var2;
        ci.a7 a7Var;
        ci.a7 a7Var2;
        float f7 = 1.0f;
        lu0[] lu0VarArr = this.k0;
        if (lu0VarArr == null || (lu0Var = lu0VarArr[0]) == null || (lu0Var2 = lu0VarArr[1]) == null || lu0Var.w == null || lu0Var2.w == null) {
            return 1.0f;
        }
        int i10 = lu0Var.F;
        int i11 = lu0Var2.F;
        boolean z10 = y0(i10) || i10 == 8;
        boolean z11 = y0(i11) || i11 == 8;
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - lu0VarArr[0].w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - lu0VarArr[1].w.getVisibilityFactor();
        pv0 m12 = m1(lu0VarArr[0].F);
        if (i10 == 8 || (m12 != null && (a7Var2 = m12.s) != null && a7Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        pv0 m13 = m1(i11);
        if (i11 != 8 && (m13 == null || (a7Var = m13.s) == null || a7Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f7, Math.abs(lu0VarArr[0].getTranslationX() / lu0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        lu0[] lu0VarArr = this.k0;
        lu0 lu0Var = lu0VarArr[1];
        if (lu0Var != null && lu0Var.getVisibility() == 0) {
            if (this.g1 && !this.i1) {
                return lu0VarArr[1].F;
            }
            if (Math.abs(lu0VarArr[1].getTranslationX()) < lu0VarArr[1].getMeasuredWidth() / 2.0f) {
                return lu0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public im0 getCurrentListView() {
        yt0 yt0Var;
        lu0 lu0Var = this.k0[0];
        int i10 = lu0Var.F;
        return i10 == 13 ? this.U.getCurrentListView() : i10 == 14 ? this.V.getCurrentListView() : (i10 != 12 || (yt0Var = this.T) == null) ? lu0Var.h : yt0Var.a.x0;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.t1[0].q;
    }

    public TextView getSaveItem() {
        return this.q0;
    }

    public org.telegram.ui.ActionBar.u0 getSearchItem() {
        return this.n0;
    }

    public xj0 getSearchOptionsItem() {
        return this.s0;
    }

    public int getSelectedTab() {
        int currentTabId = this.I0.getCurrentTabId();
        ns0 ns0Var = this.W;
        if (ns0Var == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = ns0Var.getCurrentAlbumId();
        if (currentAlbumId == 0) {
            return 8;
        }
        return currentAlbumId > 0 ? k1(currentAlbumId).a : currentTabId;
    }

    public TL_stories.MediaArea getStoriesArea() {
        return null;
    }

    public String getStoriesHashtag() {
        return null;
    }

    public String getStoriesHashtagUsername() {
        return null;
    }

    @Deprecated
    public float getTabProgress() {
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            lu0[] lu0VarArr = this.k0;
            if (i10 >= lu0VarArr.length) {
                return f7;
            }
            lu0 lu0Var = lu0VarArr[i10];
            if (lu0Var != null) {
                f7 = ((1.0f - Math.abs(lu0Var.getTranslationX() / getWidth())) * lu0Var.F) + f7;
            }
            i10++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.A0, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.z6));
        org.telegram.ui.ActionBar.u0 u0Var = this.l0;
        xj0 iconView = u0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.h6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.z8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.u0;
        if (u0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.t0;
        if (u0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.D0};
        ImageView imageView = this.C0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 1, null, null, null, null, i12));
        it0 it0Var = this.I0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(it0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.wc;
        org.telegram.ui.Cells.x0 x0Var = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(x0Var, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(x0Var, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.kd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(it0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(it0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(it0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(it0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Hh));
        et0 et0Var = this.R0;
        if (et0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(et0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.v7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(et0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.w7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(et0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.u7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(et0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.t7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(et0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.x7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(et0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.y7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(et0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A7));
        }
        final int i14 = 0;
        while (true) {
            lu0[] lu0VarArr = this.k0;
            if (i14 >= lu0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.i6 i6Var = new org.telegram.ui.ActionBar.i6() { // from class: org.telegram.ui.Components.cs0
                @Override // org.telegram.ui.ActionBar.i6
                public final void b() {
                    lu0[] lu0VarArr2 = sv0.this.k0;
                    int i15 = i14;
                    rs0 rs0Var = lu0VarArr2[i15].h;
                    if (rs0Var != null) {
                        int childCount = rs0Var.getChildCount();
                        for (int i16 = 0; i16 < childCount; i16++) {
                            View childAt = lu0VarArr2[i15].h.getChildAt(i16);
                            if (childAt instanceof org.telegram.ui.Cells.t7) {
                                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                                for (int i17 = 0; i17 < 6; i17++) {
                                    t7Var.a[i17].e.invalidate();
                                }
                            } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                                ((org.telegram.ui.Cells.h6) childAt).v(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.va) {
                                ((org.telegram.ui.Cells.va) childAt).j(0);
                            }
                        }
                    }
                }

                @Override // org.telegram.ui.ActionBar.i6
                public final /* synthetic */ void a(float f7) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.k0, null, null, org.telegram.ui.ActionBar.h6.d7));
            at0 at0Var = lu0VarArr[i14].v;
            int i15 = org.telegram.ui.ActionBar.h6.d6;
            arrayList.add(new org.telegram.ui.ActionBar.j6(at0Var, 0, null, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.s8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].w, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.c7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
            int i16 = org.telegram.ui.ActionBar.h6.h6;
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.uh));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.m6));
            int i17 = org.telegram.ui.ActionBar.h6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            int i18 = org.telegram.ui.ActionBar.h6.y6;
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, i6Var, i18));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, i6Var, org.telegram.ui.ActionBar.h6.n6));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.h6.r0;
            int i19 = org.telegram.ui.ActionBar.h6.J7;
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, drawableArr2, null, i19));
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.h6.B0;
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.h6.D0}, null, -1, null, org.telegram.ui.ActionBar.h6.X8));
            TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.h6.C0;
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.h6.E0}, null, -1, null, org.telegram.ui.ActionBar.h6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, drawableArr2, null, i19));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.U7));
            int i20 = org.telegram.ui.ActionBar.h6.z6;
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 4, new Class[]{fu0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
            int i21 = org.telegram.ui.ActionBar.h6.Ih;
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
            int i22 = org.telegram.ui.ActionBar.h6.i7;
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            int i23 = org.telegram.ui.ActionBar.h6.k7;
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.zi));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Bi));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.h6.f3, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.h6.g3, null, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.m7.class}, null, null, null, org.telegram.ui.ActionBar.h6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.m7.class}, org.telegram.ui.ActionBar.h6.m0, null, null, org.telegram.ui.ActionBar.h6.K6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Kh));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Jh));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.n7.class}, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            int i24 = org.telegram.ui.ActionBar.h6.Lh;
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.t7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.t7.class}, null, null, i6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.t7.class}, null, null, i6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, i6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, i6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].h, 0, null, null, new Drawable[]{this.y0}, null, org.telegram.ui.ActionBar.h6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].w.d, 4, null, null, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.j6(lu0VarArr[i14].w.e, 4, null, null, null, null, i18));
            i14++;
        }
    }

    public final float h0(int i10, boolean z10) {
        float f7 = 0.0f;
        int i11 = 0;
        while (true) {
            lu0[] lu0VarArr = this.k0;
            if (i11 >= lu0VarArr.length) {
                return f7;
            }
            lu0 lu0Var = lu0VarArr[i11];
            if (lu0Var != null) {
                int i12 = lu0Var.F;
                if ((z10 && i10 == 8 && y0(i12)) || i12 == i10) {
                    f7 = (1.0f - Math.abs(lu0VarArr[i11].getTranslationX() / getWidth())) + f7;
                }
            }
            i11++;
        }
    }

    public final void h1() {
        int i10 = 0;
        while (true) {
            lu0[] lu0VarArr = this.k0;
            if (i10 >= lu0VarArr.length) {
                return;
            }
            int childCount = lu0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = lu0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.f2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) childAt).getPhotoImage();
                    if (i10 == 0) {
                        photoImage.setAllowStartAnimation(true);
                        photoImage.startAnimation();
                    } else {
                        photoImage.setAllowStartAnimation(false);
                        photoImage.stopAnimation();
                    }
                }
            }
            i10++;
        }
    }

    public final int i0(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var = this.F1;
        return d6Var != null ? d6Var.u(i10) : org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    public final void i1(MotionEvent motionEvent) {
        float f7;
        float f10;
        float measuredWidth;
        VelocityTracker velocityTracker = this.B1;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.S0);
        int i10 = 1;
        if (motionEvent == null || motionEvent.getAction() == 3) {
            f7 = 0.0f;
            f10 = 0.0f;
        } else {
            f7 = this.B1.getXVelocity();
            f10 = this.B1.getYVelocity();
            if (!this.x1 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                W0(motionEvent, f7 < 0.0f);
            }
        }
        if (this.x1) {
            lu0[] lu0VarArr = this.k0;
            float x10 = lu0VarArr[0].getX();
            this.f1 = new AnimatorSet();
            this.i1 = Math.abs(x10) < ((float) lu0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new b80(this, 20));
            boolean z10 = this.i1;
            Property property = View.TRANSLATION_X;
            if (z10) {
                measuredWidth = Math.abs(x10);
                if (this.h1) {
                    this.f1.playTogether(ObjectAnimator.ofFloat(lu0VarArr[0], (Property<lu0, Float>) property, 0.0f), ObjectAnimator.ofFloat(lu0VarArr[1], (Property<lu0, Float>) property, r14.getMeasuredWidth()), ofFloat);
                } else {
                    this.f1.playTogether(ObjectAnimator.ofFloat(lu0VarArr[0], (Property<lu0, Float>) property, 0.0f), ObjectAnimator.ofFloat(lu0VarArr[1], (Property<lu0, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = lu0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.h1) {
                    this.f1.playTogether(ObjectAnimator.ofFloat(lu0VarArr[0], (Property<lu0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(lu0VarArr[1], (Property<lu0, Float>) property, 0.0f), ofFloat);
                } else {
                    this.f1.playTogether(ObjectAnimator.ofFloat(lu0VarArr[0], (Property<lu0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(lu0VarArr[1], (Property<lu0, Float>) property, 0.0f), ofFloat);
                }
            }
            this.f1.setInterpolator(e2);
            int measuredWidth2 = getMeasuredWidth();
            float f11 = measuredWidth2 / 2;
            float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
            this.f1.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r0) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.f1.addListener(new lt0(this, i10));
            this.f1.start();
            this.g1 = true;
            this.x1 = false;
            N0();
        } else {
            this.y1 = false;
            this.G.setEnabled(true);
            this.I0.setEnabled(true);
        }
        VelocityTracker velocityTracker2 = this.B1;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.B1 = null;
        }
    }

    public final boolean j0() {
        return this.v1.getConnectionsManager().getConnectionState() == 3;
    }

    public final int j1(int i10) {
        rv0 l1 = l1(i10);
        if (l1 == null) {
            return -1;
        }
        return l1.b;
    }

    public final boolean k0() {
        SparseArray[] sparseArrayArr;
        MessageObject messageObject;
        TLRPC.Message message;
        boolean z10 = false;
        for (int i10 = 1; i10 >= 0; i10--) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (true) {
                sparseArrayArr = this.Z0;
                if (i11 >= sparseArrayArr[i10].size()) {
                    break;
                }
                arrayList.add(Integer.valueOf(sparseArrayArr[i10].keyAt(i11)));
                i11++;
            }
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                Object obj = arrayList.get(i12);
                i12++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0 && (messageObject = (MessageObject) sparseArrayArr[i10].get(num.intValue())) != null && (message = messageObject.messageOwner) != null && message.noforwards) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                return z10;
            }
        }
        return z10;
    }

    public final rv0 k1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.Y1;
        rv0 rv0Var = (rv0) hashMap.get(valueOf);
        if (rv0Var != null) {
            return rv0Var;
        }
        rv0 rv0Var2 = new rv0(this, getContext(), i10);
        hashMap.put(Integer.valueOf(i10), rv0Var2);
        this.Z1.put(Integer.valueOf(rv0Var2.a), Integer.valueOf(i10));
        return rv0Var2;
    }

    public final void l0() {
        AndroidUtilities.cancelRunOnUIThread(this.M0);
        org.telegram.ui.Cells.x0 x0Var = this.K0;
        if (x0Var.getTag() == null) {
            return;
        }
        x0Var.setTag(null);
        AnimatorSet animatorSet = this.L0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.L0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.L0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.L0.playTogether(ObjectAnimator.ofFloat(x0Var, (Property<org.telegram.ui.Cells.x0, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(x0Var, (Property<org.telegram.ui.Cells.x0, Float>) View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.O0));
        this.L0.setInterpolator(bs.g);
        this.L0.addListener(new lt0(this, 0));
        this.L0.start();
    }

    public final rv0 l1(int i10) {
        Integer num = (Integer) this.Z1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (rv0) this.Y1.get(num);
    }

    public boolean m0() {
        return false;
    }

    public final pv0 m1(int i10) {
        rv0 l1;
        if (i10 == 8) {
            return this.c0;
        }
        if (i10 == 9) {
            return this.e0;
        }
        if (!y0(i10) || (l1 = l1(i10)) == null) {
            return null;
        }
        return l1.c;
    }

    public boolean n0() {
        return !(this instanceof h40);
    }

    public final pv0 n1(int i10) {
        rv0 l1;
        if (i10 == 8) {
            return this.d0;
        }
        if (i10 == 9) {
            return this.f0;
        }
        if (!y0(i10) || (l1 = l1(i10)) == null) {
            return null;
        }
        return l1.d;
    }

    public final void o0(ViewGroup viewGroup) {
        for (lu0 lu0Var : this.k0) {
            rs0 rs0Var = lu0Var.h;
            Objects.requireNonNull(rs0Var);
            lu0Var.n = new bh.l(rs0Var, viewGroup, new aq0(rs0Var, 1));
        }
        is0 is0Var = this.V;
        if (is0Var != null) {
            is0Var.S = viewGroup;
            is0Var.R = new ei.m7(is0Var, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:240:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07e2  */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44, types: [org.telegram.ui.Components.im0, org.telegram.ui.Components.ku0, s4.l0] */
    /* JADX WARN: Type inference failed for: r5v63 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o1(boolean z10) {
        lu0[] lu0VarArr;
        lu0[] lu0VarArr2;
        s4.t0 t0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        String str;
        s4.g0 g0Var;
        ?? r52;
        int i10;
        int i11;
        boolean z15;
        int i12;
        boolean y02;
        int i13;
        boolean z16;
        s4.t0 t0Var2;
        int i14;
        int i15;
        boolean z17;
        is0 is0Var = this.V;
        if (is0Var != null) {
            is0Var.i();
        }
        int i16 = 0;
        while (true) {
            lu0VarArr = this.k0;
            if (i16 >= lu0VarArr.length) {
                break;
            }
            lu0VarArr[i16].h.B0();
            i16++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lu0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(D0());
        s4.g0 adapter = lu0VarArr[z10 ? 1 : 0].h.getAdapter();
        s4.g0 g0Var2 = this.c0;
        s4.y yVar = this.b0;
        if (adapter == g0Var2) {
            yVar.d(null);
        }
        boolean z18 = this.V0;
        eu0 eu0Var = this.D1;
        zu0 zu0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var = this.n0;
        int i17 = 100;
        if (z18 && this.U0) {
            lu0 lu0Var = lu0VarArr[z10 ? 1 : 0];
            if (lu0Var.f == null) {
                lu0Var.f = new s4.t0();
            }
            lu0 lu0Var2 = lu0VarArr[z10 ? 1 : 0];
            t0Var2 = lu0Var2.f;
            dv0 dv0Var = this.S;
            ju0 ju0Var = this.j0;
            ou0 ou0Var = this.h0;
            ou0 ou0Var2 = this.i0;
            ou0 ou0Var3 = this.g0;
            if (z10) {
                int i18 = lu0Var2.F;
                if (i18 == 0 || i18 == 2 || i18 == 5 || i18 == 6 || (i18 == 7 && !eu0Var.T())) {
                    this.V0 = false;
                    ft0 ft0Var = this.J0;
                    if (ft0Var != null) {
                        ft0Var.g(false);
                    }
                    this.U0 = false;
                    o1(true);
                    return;
                }
                String obj = u0Var != null ? u0Var.getSearchField().getText().toString() : "";
                int i19 = lu0VarArr[z10 ? 1 : 0].F;
                if (i19 == 1) {
                    if (ou0Var3 != null) {
                        ou0Var3.G(obj, false);
                        if (adapter != ou0Var3) {
                            Y0(adapter);
                            lu0VarArr[z10 ? 1 : 0].h.setAdapter(ou0Var3);
                        }
                    }
                } else if (i19 == 3) {
                    if (ou0Var2 != null) {
                        ou0Var2.G(obj, false);
                        if (adapter != ou0Var2) {
                            Y0(adapter);
                            lu0VarArr[z10 ? 1 : 0].h.setAdapter(ou0Var2);
                        }
                    }
                } else if (i19 == 4) {
                    if (ou0Var != null) {
                        ou0Var.G(obj, false);
                        if (adapter != ou0Var) {
                            Y0(adapter);
                            lu0VarArr[z10 ? 1 : 0].h.setAdapter(ou0Var);
                        }
                    }
                } else if (i19 == 7) {
                    if (ju0Var != null) {
                        ju0Var.F(obj, false);
                        if (adapter != ju0Var) {
                            Y0(adapter);
                            lu0VarArr[z10 ? 1 : 0].h.setAdapter(ju0Var);
                        }
                    }
                } else if (i19 == 11) {
                    if (dv0Var != null) {
                        dv0Var.E(this.W0, obj);
                        if (adapter != dv0Var) {
                            Y0(adapter);
                            lu0VarArr[z10 ? 1 : 0].h.setAdapter(dv0Var);
                        }
                    }
                } else if (i19 == 15 && zu0Var != null && adapter != zu0Var) {
                    Y0(adapter);
                    rs0 rs0Var = lu0VarArr[z10 ? 1 : 0].h;
                    zu0Var.r = rs0Var;
                    rs0Var.setAdapter(zu0Var);
                }
            } else if (lu0Var2.h != null) {
                int i20 = lu0Var2.F;
                if (i20 == 1) {
                    if (adapter != ou0Var3) {
                        Y0(adapter);
                        lu0VarArr[z10 ? 1 : 0].h.setAdapter(ou0Var3);
                    }
                    ou0Var3.l();
                } else if (i20 == 3) {
                    if (adapter != ou0Var2) {
                        Y0(adapter);
                        lu0VarArr[z10 ? 1 : 0].h.setAdapter(ou0Var2);
                    }
                    ou0Var2.l();
                } else if (i20 == 4) {
                    if (adapter != ou0Var) {
                        Y0(adapter);
                        lu0VarArr[z10 ? 1 : 0].h.setAdapter(ou0Var);
                    }
                    ou0Var.l();
                } else if (i20 == 7) {
                    if (adapter != ju0Var) {
                        Y0(adapter);
                        lu0VarArr[z10 ? 1 : 0].h.setAdapter(ju0Var);
                    }
                    ju0Var.l();
                } else if (i20 == 11) {
                    if (adapter != dv0Var) {
                        Y0(adapter);
                        lu0VarArr[z10 ? 1 : 0].h.setAdapter(dv0Var);
                    }
                    dv0Var.l();
                }
            }
            lu0VarArr2 = lu0VarArr;
            i10 = 4;
            z15 = false;
            z16 = false;
            i13 = 8;
        } else {
            lu0 lu0Var3 = lu0VarArr[z10 ? 1 : 0];
            if (lu0Var3.e == null) {
                lu0Var3.e = new s4.t0();
            }
            lu0 lu0Var4 = lu0VarArr[z10 ? 1 : 0];
            s4.t0 t0Var3 = lu0Var4.e;
            lu0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i21 = lu0VarArr[z10 ? 1 : 0].F;
            if (i21 == 8 || y0(i21)) {
                layoutParams.topMargin = AndroidUtilities.dp(D0());
            }
            rs0 rs0Var2 = lu0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = rs0Var2.getPaddingLeft();
            lu0 lu0Var5 = lu0VarArr[z10 ? 1 : 0];
            rs0 rs0Var3 = lu0Var5.h;
            int Z = Z(lu0Var5.F);
            rs0Var3.b3 = Z;
            int paddingRight = lu0VarArr[z10 ? 1 : 0].h.getPaddingRight();
            lu0VarArr2 = lu0VarArr;
            rs0 rs0Var4 = lu0VarArr2[z10 ? 1 : 0].h;
            int Y = Y(x0());
            rs0Var4.c3 = Y;
            rs0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
            int i22 = lu0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.m1;
            s4.g0 g0Var3 = this.K;
            View view = this.U;
            yt0 yt0Var = this.T;
            cv0 cv0Var = this.R;
            du0 du0Var = this.P;
            hv0[] hv0VarArr = this.t1;
            if (i22 == 0) {
                s4.g0 g0Var4 = this.H;
                if (adapter != g0Var4) {
                    Y0(adapter);
                    lu0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var4);
                }
                int i23 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i23;
                layoutParams.leftMargin = i23;
                hv0 hv0Var = hv0VarArr[0];
                boolean z19 = hv0Var.h && !hv0Var.e.isEmpty();
                i17 = iArr[0];
                lu0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.y0);
                hv0 hv0Var2 = hv0VarArr[0];
                if (hv0Var2.x == null) {
                    hv0Var2.x = new s4.t0();
                }
                z13 = z19;
                t0Var = hv0VarArr[0].x;
                z11 = false;
            } else {
                if (i22 == 1) {
                    hv0 hv0Var3 = hv0VarArr[1];
                    z12 = hv0Var3.h && !hv0Var3.e.isEmpty();
                    if (adapter != g0Var3) {
                        Y0(adapter);
                        lu0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var3);
                    }
                } else if (i22 == 2) {
                    hv0 hv0Var4 = hv0VarArr[2];
                    z12 = hv0Var4.h && !hv0Var4.e.isEmpty();
                    s4.g0 g0Var5 = this.L;
                    if (adapter != g0Var5) {
                        Y0(adapter);
                        lu0VarArr2[z10 ? 1 : 0].h.setAdapter(g0Var5);
                    }
                } else {
                    if (i22 == 3) {
                        if (adapter != this.J) {
                            Y0(adapter);
                            lu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.J);
                        }
                    } else if (i22 == 4) {
                        hv0 hv0Var5 = hv0VarArr[4];
                        z12 = hv0Var5.h && !hv0Var5.e.isEmpty();
                        if (adapter != this.M) {
                            Y0(adapter);
                            lu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.M);
                        }
                    } else {
                        if (i22 == 5) {
                            if (adapter != this.O) {
                                Y0(adapter);
                                lu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.O);
                            }
                        } else if (i22 == 15) {
                            if (adapter != zu0Var) {
                                Y0(adapter);
                                rs0 rs0Var5 = lu0VarArr2[z10 ? 1 : 0].h;
                                zu0Var.r = rs0Var5;
                                rs0Var5.setAdapter(zu0Var);
                            }
                        } else if (i22 == 6) {
                            if (adapter != du0Var) {
                                Y0(adapter);
                                lu0VarArr2[z10 ? 1 : 0].h.setAdapter(du0Var);
                            }
                        } else if (i22 == 7) {
                            if (adapter != this.a0) {
                                Y0(adapter);
                                lu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.a0);
                            }
                        } else if (q0(i22)) {
                            s4.g0 m12 = m1(lu0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != m12) {
                                Y0(adapter);
                                lu0VarArr2[z10 ? 1 : 0].h.setAdapter(m12);
                                lu0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            lu0 lu0Var6 = lu0VarArr2[z10 ? 1 : 0];
                            if (lu0Var6.F != 9) {
                                yVar.d(lu0Var6.h);
                            }
                            i17 = iArr[1];
                        } else {
                            int i24 = lu0VarArr2[z10 ? 1 : 0].F;
                            if (i24 == 10) {
                                if (adapter != this.Q) {
                                    Y0(adapter);
                                    lu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.Q);
                                }
                            } else if (i24 == 11) {
                                if (adapter != cv0Var) {
                                    Y0(adapter);
                                    lu0VarArr2[z10 ? 1 : 0].h.setAdapter(cv0Var);
                                    s4.y yVar2 = cv0Var.v;
                                    rs0 rs0Var6 = lu0VarArr2[z10 ? 1 : 0].h;
                                    cv0Var.s = rs0Var6;
                                    yVar2.d(rs0Var6);
                                }
                                t0Var = cv0Var.r;
                                z11 = true;
                                z13 = false;
                            } else if (i24 == 12) {
                                if (adapter != null) {
                                    Y0(adapter);
                                    lu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (yt0Var.getParent() != lu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(yt0Var);
                                    lu0VarArr2[z10 ? 1 : 0].addView(yt0Var, w7.z5.a(-1.0f, 0.0f, 56.0f, 0.0f, 0.0f, -1, 119));
                                }
                            } else if (i24 == 13) {
                                if (adapter != null) {
                                    Y0(adapter);
                                    lu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != lu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    lu0VarArr2[z10 ? 1 : 0].addView(view);
                                }
                            } else if (i24 == 14) {
                                if (adapter != null) {
                                    Y0(adapter);
                                    lu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (is0Var != null && is0Var.getParent() != lu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(is0Var);
                                    lu0VarArr2[z10 ? 1 : 0].addView(is0Var);
                                    lu0VarArr2[z10 ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        t0Var = t0Var3;
                        z11 = false;
                        z13 = false;
                    }
                    t0Var = t0Var3;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                t0Var = t0Var3;
                z11 = true;
            }
            t1(lu0VarArr2[z10 ? 1 : 0]);
            if (z11) {
                lu0VarArr2[z10 ? 1 : 0].h.setSections(false);
            } else {
                rs0 rs0Var7 = lu0VarArr2[z10 ? 1 : 0].h;
                rs0Var7.getClass();
                rs0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, rs0Var7.n2));
                rs0Var7.G2 = null;
                rs0Var7.J2 = 0.0f;
                rs0Var7.K2 = null;
                rs0Var7.L2 = null;
                rs0Var7.H2 = null;
                ul0 ul0Var = rs0Var7.F2;
                if (ul0Var != null) {
                    rs0Var7.p0(ul0Var);
                    rs0Var7.F2 = null;
                }
            }
            lu0 lu0Var7 = lu0VarArr2[z10 ? 1 : 0];
            int i25 = lu0Var7.F;
            org.telegram.ui.ActionBar.n2 n2Var = this.v1;
            s4.t0 t0Var4 = t0Var;
            if (i25 == 15) {
                z14 = z13;
                str = "";
                g0Var = g0Var3;
                lu0Var7.setBackground(ei.r6.e(lu0Var7.getBackground(), n2Var.getCurrentAccount(), this.j1, org.telegram.ui.ActionBar.h6.I.q()));
                lu0VarArr2[z10 ? 1 : 0].setOutlineProvider(new ci.o1(16));
                lu0VarArr2[z10 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z14 = z13;
                str = "";
                g0Var = g0Var3;
                lu0Var7.setClipToOutline(false);
                r52 = 0;
                lu0VarArr2[z10 ? 1 : 0].setBackground(null);
            }
            lu0 lu0Var8 = lu0VarArr2[z10 ? 1 : 0];
            if (lu0Var8.F == 11) {
                lu0Var8.h.setItemAnimator(lu0Var8.d);
            } else {
                lu0Var8.h.setItemAnimator(r52);
                if (cv0Var != null && lu0VarArr2[z10 ? 1 : 0].h == cv0Var.s) {
                    s4.y yVar3 = cv0Var.v;
                    cv0Var.s = r52;
                    yVar3.d(r52);
                }
            }
            if (yt0Var != null && lu0VarArr2[z10 ? 1 : 0].F != 12 && yt0Var.getParent() == lu0VarArr2[z10 ? 1 : 0]) {
                yt0Var.a.onRemoveFromParent();
                lu0VarArr2[z10 ? 1 : 0].removeView(yt0Var);
            }
            if (view != null && lu0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                lu0 lu0Var9 = lu0VarArr2[z10 ? 1 : 0];
                if (parent == lu0Var9) {
                    lu0Var9.removeView(view);
                }
            }
            if (is0Var != null && lu0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = is0Var.getParent();
                lu0 lu0Var10 = lu0VarArr2[z10 ? 1 : 0];
                if (parent2 == lu0Var10) {
                    lu0Var10.removeView(is0Var);
                }
            }
            int i26 = lu0VarArr2[z10 ? 1 : 0].F;
            if (i26 == 0 || i26 == 11 || q0(i26) || (i14 = lu0VarArr2[z10 ? 1 : 0].F) == 2 || i14 == 5 || i14 == 6 || ((i14 == 7 && !eu0Var.T()) || (i15 = lu0VarArr2[z10 ? 1 : 0].F) == 10 || i15 == 13 || i15 == 14)) {
                i10 = 4;
                if (z10) {
                    this.x0 = 2;
                } else {
                    this.x0 = 0;
                    if (u0Var != null) {
                        u0Var.setVisibility((x0() || this.V0) ? 8 : 4);
                    }
                }
            } else if (!z10) {
                z17 = false;
                if (u0Var != null) {
                    i10 = 4;
                    if (u0Var.getVisibility() == 4) {
                        if (D()) {
                            this.x0 = 0;
                            this.o0 = 1.0f;
                            u0Var.setVisibility(0);
                        } else {
                            u0Var.setVisibility(x0() ? 8 : 4);
                            this.o0 = 0.0f;
                        }
                    }
                    s1(z17);
                }
                i10 = 4;
                s1(z17);
            } else if (u0Var == null || u0Var.getVisibility() != 4 || this.G.n0) {
                z17 = false;
                this.x0 = 0;
                this.o0 = 1.0f;
                i10 = 4;
                s1(z17);
            } else {
                if (D()) {
                    this.x0 = 1;
                    u0Var.setVisibility(0);
                } else {
                    u0Var.setVisibility(x0() ? 8 : 4);
                }
                float f7 = z10 ? 1.0f : 0.0f;
                this.o0 = b0(f7);
                v1(1.0f - f7);
                i10 = 4;
                z17 = false;
                s1(z17);
            }
            int i27 = lu0VarArr2[z10 ? 1 : 0].F;
            if (i27 == 6) {
                if (!du0Var.e && !du0Var.h && du0Var.d.isEmpty()) {
                    du0.E(du0Var, 0L);
                }
            } else if (i27 != 7) {
                if (q0(i27)) {
                    pv0 m13 = m1(lu0VarArr2[z10 ? 1 : 0].F);
                    if (m13 != null) {
                        ci.a7 a7Var = m13.s;
                        m13.P();
                        lu0VarArr2[z10 ? 1 : 0].w.e(a7Var != null && (a7Var.k() || (j0() && a7Var.g() > 0)), z10);
                        z15 = (a7Var == null || a7Var.g() <= 0 || v0()) ? false : true;
                        i12 = lu0VarArr2[z10 ? 1 : 0].F;
                        if (i12 != 8 || y0(i12)) {
                            lu0 lu0Var11 = lu0VarArr2[z10 ? 1 : 0];
                            ct0 ct0Var = lu0Var11.w;
                            y02 = y0(lu0Var11.F);
                            int j12 = j1(lu0VarArr2[z10 ? 1 : 0].F);
                            w9 w9Var = ct0Var.b;
                            ei.d dVar = ct0Var.f;
                            w9Var.setVisibility((!y02 || w0() || s0()) ? 8 : 0);
                            if (!y02) {
                                dVar.setVisibility(0);
                                dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum));
                                i13 = 8;
                            } else if (w0()) {
                                i13 = 8;
                                dVar.setVisibility(8);
                            } else {
                                i13 = 8;
                                ct0Var.setStickerType(11);
                                dVar.setVisibility(!v0() ? 0 : 8);
                                dVar.h(w());
                            }
                            if (y02) {
                                ct0Var.d.setText(LocaleController.getString(!v0() ? x0() ? R.string.NoPublicStoriesTitle2 : R.string.NoStoriesTitle : R.string.NoHashtagStoriesTitle));
                                ct0Var.e.setText(x0() ? LocaleController.getString(R.string.NoStoriesSubtitle2) : str);
                            } else {
                                ct0Var.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                                ct0Var.e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                            }
                            dVar.setOnClickListener(new qr0(this, y02, j12, 0));
                        } else {
                            lu0 lu0Var12 = lu0VarArr2[z10 ? 1 : 0];
                            if (lu0Var12.F == 9) {
                                if (w0()) {
                                    lu0VarArr2[z10 ? 1 : 0].w.b.setVisibility(8);
                                    lu0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                                } else {
                                    lu0VarArr2[z10 ? 1 : 0].w.b.setVisibility(0);
                                    lu0VarArr2[z10 ? 1 : 0].w.setStickerType(11);
                                    lu0VarArr2[z10 ? 1 : 0].w.f.setVisibility(0);
                                    lu0VarArr2[z10 ? 1 : 0].w.f.h(w());
                                }
                                lu0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                                lu0VarArr2[z10 ? 1 : 0].w.e.setText(x0() ? LocaleController.getString(R.string.NoArchivedStoriesSubtitle) : str);
                                lu0VarArr2[z10 ? 1 : 0].w.f.setOnClickListener(new or0(this, 7));
                                i13 = 8;
                            } else {
                                lu0Var12.w.b.setVisibility(0);
                                lu0VarArr2[z10 ? 1 : 0].w.setStickerType(1);
                                lu0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoResult));
                                lu0VarArr2[z10 ? 1 : 0].w.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                i13 = 8;
                                lu0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                            }
                        }
                        z16 = false;
                        lu0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
                        t0Var2 = t0Var4;
                    }
                } else {
                    int i28 = lu0VarArr2[z10 ? 1 : 0].F;
                    if (i28 != 10 && i28 != 11 && i28 != 12 && i28 != 13 && i28 != 14) {
                        if (i28 == 15) {
                            i28 = 8;
                        }
                        hv0 hv0Var6 = hv0VarArr[i28];
                        if (!hv0Var6.g && !hv0Var6.i[0] && hv0Var6.a.isEmpty()) {
                            hv0VarArr[i28].g = true;
                            g0Var.l();
                            if (i28 == 0) {
                                int i29 = hv0VarArr[0].q;
                                if (i29 == 1) {
                                    i11 = 6;
                                } else if (i29 == 2) {
                                    i11 = 7;
                                }
                                n2Var.getMediaDataController().loadMedia(this.j1, 50, 0, 0, i11, this.F, 1, n2Var.getClassGuid(), hv0VarArr[i11].p, null, null);
                            }
                            i11 = i28;
                            n2Var.getMediaDataController().loadMedia(this.j1, 50, 0, 0, i11, this.F, 1, n2Var.getClassGuid(), hv0VarArr[i11].p, null, null);
                        }
                    }
                }
            }
            z15 = z14;
            i12 = lu0VarArr2[z10 ? 1 : 0].F;
            if (i12 != 8) {
            }
            lu0 lu0Var112 = lu0VarArr2[z10 ? 1 : 0];
            ct0 ct0Var2 = lu0Var112.w;
            y02 = y0(lu0Var112.F);
            int j122 = j1(lu0VarArr2[z10 ? 1 : 0].F);
            w9 w9Var2 = ct0Var2.b;
            ei.d dVar2 = ct0Var2.f;
            w9Var2.setVisibility((!y02 || w0() || s0()) ? 8 : 0);
            if (!y02) {
            }
            if (y02) {
            }
            dVar2.setOnClickListener(new qr0(this, y02, j122, 0));
            z16 = false;
            lu0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            t0Var2 = t0Var4;
        }
        int i30 = i17;
        lu0 lu0Var13 = lu0VarArr2[z10 ? 1 : 0];
        lu0Var13.b = z15;
        q1(lu0Var13, z16);
        lu0VarArr2[z10 ? 1 : 0].x.y1(i30);
        lu0VarArr2[z10 ? 1 : 0].h.a0();
        if (t0Var2 != null) {
            lu0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(t0Var2);
            lu0VarArr2[z10 ? 1 : 0].r.setRecycledViewPool(t0Var2);
        }
        if (this.x0 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.G;
            if (kVar.n0) {
                this.z0 = true;
                kVar.h(true);
                this.x0 = 0;
                this.o0 = 0.0f;
                if (u0Var != null) {
                    u0Var.setVisibility(x0() ? i13 : i10);
                }
                s1(false);
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            lu0[] lu0VarArr = this.k0;
            if (i10 >= lu0VarArr.length) {
                return;
            }
            rs0 rs0Var = lu0VarArr[i10].h;
            if (rs0Var != null) {
                rs0Var.getViewTreeObserver().addOnPreDrawListener(new ot0(this, i10, 0));
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return J() || this.I0.H || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        eu0 eu0Var = this.D1;
        int height = eu0Var.f() != null ? eu0Var.f().getHeight() : 0;
        if (height == 0) {
            height = View.MeasureSpec.getSize(i11);
        }
        setMeasuredDimension(size, height);
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt == null || childAt.getVisibility() == 8) {
                i12 = i10;
            } else if (childAt instanceof lu0) {
                i12 = i10;
                measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                rs0 rs0Var = ((lu0) childAt).h;
                rs0Var.setPadding(0, rs0Var.W2, 0, rs0Var.X2);
            } else {
                i12 = i10;
                i13 = i11;
                measureChildWithMargins(childAt, i12, 0, i13, 0);
                i14++;
                i10 = i12;
                i11 = i13;
            }
            i13 = i11;
            i14++;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (!this.L1) {
            org.telegram.ui.ActionBar.n2 n2Var = this.v1;
            if (n2Var.getParentLayout() != null && !((ActionBarLayout) n2Var.getParentLayout()).j() && !J() && !this.a) {
                if (motionEvent != null) {
                    if (this.B1 == null) {
                        this.B1 = VelocityTracker.obtain();
                    }
                    this.B1.addMovement(motionEvent);
                    r40 r40Var = this.E1;
                    if (r40Var != null) {
                        r40Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.x1 && !this.y1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.w1 = motionEvent.getPointerId(0);
                    this.y1 = true;
                    this.z1 = (int) motionEvent.getX();
                    this.A1 = (int) motionEvent.getY();
                    this.B1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.w1) {
                    int x10 = (int) (motionEvent.getX() - this.z1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.A1);
                    boolean z11 = this.x1;
                    lu0[] lu0VarArr = this.k0;
                    if (z11 && (((z10 = this.h1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (!W0(motionEvent, x10 < 0)) {
                            this.y1 = true;
                            this.x1 = false;
                            P0(false);
                            lu0VarArr[0].setTranslationX(0.0f);
                            lu0VarArr[1].setTranslationX(this.h1 ? lu0VarArr[0].getMeasuredWidth() : -lu0VarArr[0].getMeasuredWidth());
                            b1(0.0f, lu0VarArr[1].F);
                            O0(getTabProgress());
                        }
                    }
                    if (!this.y1 || this.x1) {
                        if (this.x1) {
                            lu0VarArr[0].setTranslationX(x10);
                            if (this.h1) {
                                lu0VarArr[1].setTranslationX(lu0VarArr[0].getMeasuredWidth() + x10);
                            } else {
                                lu0VarArr[1].setTranslationX(x10 - lu0VarArr[0].getMeasuredWidth());
                            }
                            float abs2 = Math.abs(x10) / lu0VarArr[0].getMeasuredWidth();
                            if (D()) {
                                this.o0 = b0(abs2);
                                v1(abs2);
                                float a02 = a0(abs2);
                                this.p0 = a02;
                                this.r0.setVisibility((a02 == 0.0f || !D() || r0()) ? 4 : 0);
                            } else {
                                this.o0 = 0.0f;
                            }
                            s1(false);
                            b1(abs2, lu0VarArr[1].F);
                            O0(getTabProgress());
                            N0();
                        }
                    } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                        W0(motionEvent, x10 < 0);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.w1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    i1(motionEvent);
                }
                return this.x1;
            }
        }
        return false;
    }

    public final void p1() {
        xt0 xt0Var = this.H;
        if (xt0Var != null) {
            xt0Var.l();
        }
        fv0 fv0Var = this.K;
        if (fv0Var != null) {
            fv0Var.l();
        }
        fv0 fv0Var2 = this.L;
        if (fv0Var2 != null) {
            fv0Var2.l();
        }
        gv0 gv0Var = this.J;
        if (gv0Var != null) {
            gv0Var.X(false);
        }
        fv0 fv0Var3 = this.M;
        if (fv0Var3 != null) {
            fv0Var3.l();
        }
        zu0 zu0Var = this.N;
        if (zu0Var != null) {
            zu0Var.l();
        }
        gu0 gu0Var = this.O;
        if (gu0Var != null) {
            gu0Var.l();
        }
        au0 au0Var = this.c0;
        if (au0Var != null) {
            au0Var.l();
        }
        Iterator it = this.Y1.values().iterator();
        while (it.hasNext()) {
            ((rv0) it.next()).c.l();
        }
    }

    public final void q1(lu0 lu0Var, boolean z10) {
        boolean z11 = lu0Var.b && this.d;
        pl0 fastScroll = lu0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = lu0Var.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            lu0Var.c.cancel();
        }
        if (!z10) {
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setVisibility(z11 ? 0 : 8);
            fastScroll.setTag(z11 ? 1 : null);
            fastScroll.setAlpha(1.0f);
            fastScroll.setScaleX(1.0f);
            fastScroll.setScaleY(1.0f);
            return;
        }
        Property property = View.ALPHA;
        if (z11 && fastScroll.getTag() == null) {
            fastScroll.animate().setListener(null).cancel();
            if (fastScroll.getVisibility() != 0) {
                fastScroll.setVisibility(0);
                fastScroll.setAlpha(0.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<pl0, Float>) property, fastScroll.getAlpha(), 1.0f);
            lu0Var.c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r1);
            return;
        }
        if (z11 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<pl0, Float>) property, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new org.telegram.ui.ho(fastScroll));
        lu0Var.c = ofFloat2;
        ofFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    public boolean r0() {
        return false;
    }

    public final void r1() {
        org.telegram.ui.ActionBar.u0 u0Var = this.t0;
        if (u0Var == null) {
            return;
        }
        boolean z10 = this.v1.getMessagesController().isPeerNoForwards(this.j1) || k0();
        u0Var.setAlpha(z10 ? 0.5f : 1.0f);
        if (z10 && u0Var.getBackground() != null) {
            u0Var.setBackground(null);
        } else {
            if (z10 || u0Var.getBackground() != null) {
                return;
            }
            u0Var.setBackground(org.telegram.ui.ActionBar.h6.g0(i0(org.telegram.ui.ActionBar.h6.z8), 5, -1));
        }
    }

    public final boolean s0() {
        TLRPC.User user;
        long j10 = this.j1;
        return j10 > 0 && (user = MessagesController.getInstance(this.v1.getCurrentAccount()).getUser(Long.valueOf(j10))) != null && user.bot;
    }

    public final void s1(boolean z10) {
        is0 is0Var;
        ns0 ns0Var;
        xj0 xj0Var = this.s0;
        if (xj0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.V0 && (((is0Var = this.V) == null || !is0Var.g()) && ((ns0Var = this.W) == null || !ns0Var.w))) {
            f7 = Utilities.clamp(this.o0 + this.p0, 1.0f, 0.0f);
        }
        xj0Var.setAlpha(f7);
        if (z10) {
            A(a0(1.0f) > 0.5f, true);
        } else if (this.x0 == 2) {
            A(this.p0 > 0.1f, true);
        } else {
            A(this.o0 < 0.1f, true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2 = this.d1;
        boolean z10 = chatFull2 != null && chatFull2.stories_pinned_available;
        this.d1 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.c1 == 0) {
                this.c1 = -j10;
                int i10 = 0;
                while (true) {
                    hv0[] hv0VarArr = this.t1;
                    if (i10 >= hv0VarArr.length) {
                        break;
                    }
                    if (hv0VarArr[i10].b[1].size() == 0) {
                        hv0 hv0Var = hv0VarArr[i10];
                        hv0Var.j[1] = this.d1.migrated_from_max_id;
                        hv0Var.i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.d1;
        if (chatFull3 == null || z10 == chatFull3.stories_pinned_available) {
            return;
        }
        it0 it0Var = this.I0;
        if (it0Var != null) {
            it0Var.setInitialTabId(r0() ? 9 : 8);
        }
        y1(true);
        o1(false);
    }

    public void setCommonGroupsCount(int i10) {
        if (this.F == 0) {
            this.X0[6] = i10;
        }
        y1(true);
        F();
    }

    public void setForwardRestrictedHint(r40 r40Var) {
        this.E1 = r40Var;
    }

    public void setMergeDialogId(long j10) {
        this.c1 = j10;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i10 = 0;
        while (true) {
            iArr2 = this.X0;
            if (i10 > 6 || iArr2[i10] >= 0) {
                break;
            } else {
                i10++;
            }
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        y1(true);
        F();
        if (iArr2[0] >= 0) {
            B0(false);
        }
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.K1 = i11;
        int i14 = 0;
        while (true) {
            lu0[] lu0VarArr = this.k0;
            if (i14 >= lu0VarArr.length) {
                break;
            }
            lu0VarArr[i14].setTranslationY(this.K1);
            i14++;
        }
        if (this.P0 != null) {
            K();
        } else {
            et0 et0Var = this.R0;
            if (et0Var != null) {
                et0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
            }
        }
        this.O0 = i11;
        org.telegram.ui.Cells.x0 x0Var = this.K0;
        x0Var.setTranslationY((x0Var.getTag() == null ? -AndroidUtilities.dp(48.0f) : 0) + this.O0);
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.X1 != i10) {
            this.X1 = i10;
            lu0[] lu0VarArr = this.k0;
            if (lu0VarArr != null) {
                for (lu0 lu0Var : lu0VarArr) {
                    if (lu0Var != null) {
                        rs0 rs0Var = lu0Var.h;
                        int paddingLeft = rs0Var.getPaddingLeft();
                        rs0 rs0Var2 = lu0Var.h;
                        int i11 = rs0Var2.W2;
                        int paddingRight = rs0Var2.getPaddingRight();
                        rs0 rs0Var3 = lu0Var.h;
                        int Y = Y(x0());
                        rs0Var3.c3 = Y;
                        rs0Var.setPadding(paddingLeft, i11, paddingRight, Y);
                    }
                }
            }
        }
    }

    public void setPinnedToTop(boolean z10) {
        if (this.d == z10) {
            return;
        }
        this.d = z10;
        int i10 = 0;
        while (true) {
            lu0[] lu0VarArr = this.k0;
            if (i10 >= lu0VarArr.length) {
                return;
            }
            q1(lu0VarArr[i10], true);
            i10++;
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        TLRPC.UserFull userFull2 = this.e1;
        boolean z10 = userFull2 != null && userFull2.stories_pinned_available;
        this.e1 = userFull;
        y1(true);
        if (userFull == null || z10 == userFull.stories_pinned_available) {
            return;
        }
        a1(8);
    }

    public void setVisibleHeight(int i10) {
        this.M1 = i10;
        int i11 = 0;
        while (true) {
            lu0[] lu0VarArr = this.k0;
            if (i11 >= lu0VarArr.length) {
                break;
            }
            float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(lu0VarArr[i11].F == 8 ? 280.0f : 120.0f)))) / 2.0f;
            lu0VarArr[i11].w.setTranslationY(f7);
            lu0VarArr[i11].v.setTranslationY(-f7);
            i11++;
        }
        hs0 hs0Var = this.U;
        if (hs0Var != null) {
            hs0Var.setVisibleHeight(i10);
        }
        is0 is0Var = this.V;
        if (is0Var != null) {
            is0Var.setVisibleHeight(i10);
        }
    }

    public final boolean t0() {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (this.d1 == null || (n2Var = this.v1) == null) {
            return false;
        }
        return ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(this.d1.id)));
    }

    public final void t1(lu0 lu0Var) {
        int i10 = lu0Var.F;
        boolean z10 = i10 == 0 || q0(i10);
        FrameLayout.LayoutParams a2 = w7.z5.a(-1.0f, z10 ? 0.0f : 12.0f, (z10 ? 8 : 12) + 48, z10 ? 0.0f : 12.0f, z10 ? 0.0f : 12.0f, -1, 119);
        a2.topMargin = d0(lu0Var.F) + a2.topMargin;
        ViewGroup.LayoutParams layoutParams = lu0Var.v.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == a2.leftMargin && layoutParams2.topMargin == a2.topMargin && layoutParams2.rightMargin == a2.rightMargin && layoutParams2.bottomMargin == a2.bottomMargin && layoutParams2.gravity == a2.gravity) {
                return;
            }
        }
        lu0Var.v.setLayoutParams(a2);
    }

    public final boolean u0(int i10) {
        return i10 == 7 ? this.D1.T() : (v0() || i10 == 0 || q0(i10) || i10 == 2 || i10 == 5 || i10 == 6 || i10 == 11 || i10 == 10 || i10 == 13 || i10 == 14) ? false : true;
    }

    public final void u1(boolean z10) {
        int i10 = 0;
        while (true) {
            lu0[] lu0VarArr = this.k0;
            if (i10 >= lu0VarArr.length) {
                return;
            }
            int childCount = lu0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = lu0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) childAt).b(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.s7) {
                    ((org.telegram.ui.Cells.s7) childAt).i(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.m7) {
                    ((org.telegram.ui.Cells.m7) childAt).f(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) childAt).e(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.f2) {
                    ((org.telegram.ui.Cells.f2) childAt).c(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) childAt).V(false, z10);
                }
            }
            i10++;
        }
    }

    public boolean v0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void v1(float f7) {
        org.telegram.ui.ActionBar.u0 u0Var = this.m0;
        if (u0Var == null) {
            return;
        }
        lu0[] lu0VarArr = this.k0;
        lu0 lu0Var = lu0VarArr[1];
        float f10 = 0.0f;
        if (lu0Var != null && lu0Var.F == 11) {
            f10 = 0.0f + f7;
        }
        lu0 lu0Var2 = lu0VarArr[0];
        if (lu0Var2 != null && lu0Var2.F == 11) {
            f10 += 1.0f - f7;
        }
        u0Var.setAlpha(f10);
        float f11 = (0.15f * f10) + 0.85f;
        u0Var.setScaleX(f11);
        u0Var.setScaleY(f11);
        u0Var.setVisibility(f10 <= 0.01f ? 8 : 0);
    }

    public final SpannableStringBuilder w() {
        if (this.W1 == null) {
            this.W1 = new SpannableStringBuilder();
            if (s0()) {
                this.W1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.W1.append((CharSequence) "c");
                this.W1.setSpan(new yq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.W1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.W1;
    }

    public boolean w0() {
        return false;
    }

    public final void w1() {
        org.telegram.ui.ActionBar.u0 u0Var = this.m0;
        if (u0Var == null) {
            return;
        }
        lu0 lu0Var = this.k0[1];
        boolean z10 = lu0Var != null && lu0Var.F == 11;
        if (z10) {
            u0Var.setVisibility(0);
        }
        u0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.85f).scaleY(z10 ? 1.0f : 0.85f).withEndAction(new b60(3, this, z10)).setDuration(420L).setInterpolator(bs.h).start();
    }

    public final void x(i80 i80Var, org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        String publicUsername = j10 > 0 ? UserObject.getPublicUsername(MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j10))) : ChatObject.getPublicUsername(MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j10)));
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        a1.g.A(sb2, MessagesController.getInstance(n2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        i80Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new lg(this, sb2.toString(), n2Var, 21), false);
    }

    public boolean x0() {
        return false;
    }

    public final void x1() {
        boolean z10;
        ci.a7 a7Var;
        boolean s02 = s0();
        org.telegram.ui.ActionBar.u0 u0Var = this.w0;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.v0;
        if (s02) {
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            if (u0Var != null) {
                u0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 9) {
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            if (u0Var != null) {
                u0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() != 8) {
            if (y0(getClosestTab())) {
                if (u0Var2 != null) {
                    u0Var2.setVisibility(8);
                }
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray[] sparseArrayArr = this.Z0;
            if (i10 >= sparseArrayArr[0].size()) {
                z10 = false;
                break;
            }
            MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i10);
            au0 au0Var = this.c0;
            if (au0Var != null && (a7Var = au0Var.s) != null && !a7Var.m(messageObject.getId())) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (u0Var2 != null) {
            u0Var2.setVisibility(z10 ? 0 : 8);
        }
        if (u0Var != null) {
            u0Var.setVisibility(z10 ? 8 : 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0050, code lost:
    
        if (r3 != X(r0 ? 1 : 0, r3, true)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(i80 i80Var) {
        lu0 lu0Var;
        int x10 = i80Var.x();
        final int i10 = 0;
        i80Var.c(R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn), new Runnable(this) { // from class: org.telegram.ui.Components.yr0
            public final /* synthetic */ sv0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        sv0 sv0Var = this.b;
                        sv0Var.getClass();
                        View[] viewArr = r2;
                        sv0Var.z1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        sv0 sv0Var2 = this.b;
                        sv0Var2.getClass();
                        View[] viewArr2 = r2;
                        sv0Var2.A1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        i80Var.c(R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut), new Runnable(this) { // from class: org.telegram.ui.Components.yr0
            public final /* synthetic */ sv0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        sv0 sv0Var = this.b;
                        sv0Var.getClass();
                        View[] viewArr = r2;
                        sv0Var.z1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        sv0 sv0Var2 = this.b;
                        sv0Var2.getClass();
                        View[] viewArr2 = r2;
                        sv0Var2.A1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final View[] viewArr = {i80Var.w(x10), i80Var.w(x10 + 1)};
        lu0[] lu0VarArr = this.k0;
        if (lu0VarArr != null && (lu0Var = lu0VarArr[0]) != null) {
            boolean q02 = q0(lu0Var.F);
            int i12 = this.m1[q02 ? 1 : 0];
        }
        viewArr[0].setEnabled(false);
        viewArr[0].setAlpha(0.5f);
        if (E()) {
            return;
        }
        viewArr[1].setEnabled(false);
        viewArr[1].setAlpha(0.5f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01f2, code lost:
    
        if ((r9[8] <= 0) == r8.e(15)) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01f4, code lost:
    
        r6 = r37 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x01f7, code lost:
    
        r6 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0209, code lost:
    
        if ((r9[4] <= 0) == r8.e(4)) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y1(boolean z10) {
        int i10;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ProfileTab profileTab;
        TLRPC.ProfileTab profileTab2;
        int i11;
        boolean x02;
        boolean z11;
        boolean z12;
        boolean z13;
        int selectedTab;
        int[] iArr;
        boolean z14;
        TLRPC.UserFull userFull2;
        TLRPC.ChatFull chatFull2;
        SparseArray sparseArray;
        Integer num;
        boolean z15;
        boolean z16;
        int i12;
        boolean z17;
        int i13;
        int size;
        int i14;
        SparseArray sparseArray2;
        int i15;
        Boolean bool;
        String string;
        is0 is0Var;
        char c10;
        boolean z18;
        Object obj;
        boolean z19;
        int i16;
        int i17;
        boolean z20;
        int i18;
        int i19;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull3;
        TLRPC.UserFull userFull4;
        TL_bots.BotInfo botInfo;
        kv0 kv0Var;
        it0 it0Var = this.I0;
        if (it0Var == null) {
            return;
        }
        boolean z21 = !this.D1.q() ? false : z10;
        boolean z22 = (this.T == null || (kv0Var = this.u1) == null || !kv0Var.f) ? false : true;
        long j10 = this.j1;
        int i20 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        if (i20 <= 0 || n2Var == null) {
            i10 = 1;
            user = null;
        } else {
            i10 = 1;
            user = n2Var.getMessagesController().getUser(Long.valueOf(j10));
        }
        boolean z23 = (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) ? i10 : false;
        int i21 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.e1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z23) ? 0 : i10;
        int i22 = ((DialogObject.isUserDialog(j10) || DialogObject.isChatDialog(j10)) && !DialogObject.isEncryptedDialog(j10) && (((userFull = this.e1) != null && userFull.stories_pinned_available) || (((chatFull = this.d1) != null && chatFull.stories_pinned_available) || x0())) && n0()) ? i10 : 0;
        is0 is0Var2 = this.V;
        int i23 = i21;
        boolean z24 = (is0Var2 == null || (((userFull3 = this.e1) == null || userFull3.stargifts_count <= 0) && ((chatFull3 = this.d1) == null || chatFull3.stargifts_count <= 0))) ? false : i10;
        int i24 = i22;
        TLRPC.ChatFull chatFull4 = this.d1;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.e1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z25 = z21;
                int i25 = this.Q1 == it0Var.n0 ? i10 : 0;
                boolean z26 = (i24 == 0 || i23 != 0) ? i10 : false;
                int i26 = i25;
                i11 = z26 == it0Var.e(8) ? i26 + 1 : i26;
                if (z23 != it0Var.e(13)) {
                    i11++;
                }
                if (v0() != it0Var.e(8)) {
                    i11++;
                }
                if (z24 == it0Var.e(14) || (is0Var2 != null && z24 && this.P1 != is0Var2.getLastEmojisHash())) {
                    i11++;
                }
                x02 = x0();
                int i27 = 14;
                cu0 cu0Var = this.a0;
                int[] iArr2 = this.X0;
                if (x02) {
                    z11 = z24;
                    int i28 = i11;
                    int i29 = (cu0Var.d == null ? i10 : false) == it0Var.e(7) ? i28 + 1 : i28;
                    if (iArr2[0] <= 0) {
                        z19 = i10;
                        i16 = 0;
                    } else {
                        z19 = false;
                        i16 = 0;
                    }
                    int i30 = i29;
                    int i31 = z19 == it0Var.e(i16) ? i30 + 1 : i30;
                    if (iArr2[i10] <= 0) {
                        z20 = i10;
                        i17 = z20;
                    } else {
                        i17 = i10;
                        z20 = false;
                    }
                    int i32 = i31;
                    int i33 = z20 == it0Var.e(i17) ? i32 + 1 : i32;
                    if (DialogObject.isEncryptedDialog(j10)) {
                        i18 = i33;
                    } else {
                        int i34 = i33;
                        int i35 = (iArr2[3] <= 0) == it0Var.e(3) ? i34 + 1 : i34;
                        i18 = (iArr2[4] <= 0) == it0Var.e(4) ? i35 + 1 : i35;
                    }
                    int i36 = i19;
                    int i37 = (iArr2[2] <= 0) == it0Var.e(2) ? i36 + 1 : i36;
                    int i38 = (iArr2[5] <= 0) == it0Var.e(5) ? i37 + 1 : i37;
                    int i39 = (iArr2[6] <= 0) == it0Var.e(6) ? i38 + 1 : i38;
                    boolean z27 = !this.Q.d.isEmpty();
                    int i40 = i39;
                    i11 = z27 != it0Var.e(10) ? i40 + 1 : i40;
                    z12 = m0() && !n2Var.getMessagesController().getSavedMessagesController().unsupported && n2Var.getMessagesController().getSavedMessagesController().hasDialogs();
                    z13 = z27;
                    if (z12 != it0Var.e(11)) {
                        i11++;
                    }
                    if (z22 != it0Var.e(12)) {
                        i11++;
                    }
                } else {
                    z11 = z24;
                    z12 = false;
                    z13 = false;
                }
                if (i11 > 0) {
                    if (z25) {
                        TransitionSet transitionSet = new TransitionSet();
                        transitionSet.setOrdering(0);
                        iArr = iArr2;
                        transitionSet.addTransition(new org.telegram.ui.ActionBar.m0(2));
                        z14 = z22;
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(it0Var.getTabsContainer(), transitionSet);
                        it0Var.U = it0Var.v;
                        it0Var.V = it0Var.w;
                    } else {
                        iArr = iArr2;
                        z14 = z22;
                    }
                    SparseArray g10 = it0Var.g();
                    if (i11 > 3) {
                        g10 = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (v0()) {
                        arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                        it0Var.b0 = 420L;
                    }
                    if (i23 != 0) {
                        arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                    } else if ((DialogObject.isUserDialog(j10) || DialogObject.isChatDialog(j10)) && !DialogObject.isEncryptedDialog(j10) && ((((userFull2 = this.e1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.d1) != null && chatFull2.stories_pinned_available) || x0())) && n0())) {
                        if (r0()) {
                            arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                            it0Var.b0 = 420L;
                        } else {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                            if (x0()) {
                                arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                            }
                        }
                    }
                    if (z11) {
                        String string2 = LocaleController.getString(R.string.ProfileGifts);
                        HashMap hashMap = yh.q2.T;
                        ai.x9 x9Var = is0Var2.d;
                        Object obj2 = "";
                        if (x9Var == null) {
                            is0Var = is0Var2;
                            sparseArray = g10;
                            num = 4;
                            z15 = z23;
                            z16 = z12;
                            i12 = i20;
                        } else {
                            z15 = z23;
                            ArrayList arrayList2 = x9Var.l;
                            z16 = z12;
                            i12 = i20;
                            sparseArray = g10;
                            num = 4;
                            Pair pair = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(is0Var2.c));
                            if (!arrayList2.isEmpty()) {
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList3 = new ArrayList();
                                int i41 = 0;
                                while (true) {
                                    is0Var = is0Var2;
                                    if (arrayList3.size() >= 3 || i41 >= arrayList2.size()) {
                                        break;
                                    }
                                    TLRPC.Document document = ((TL_stars.SavedStarGift) arrayList2.get(i41)).gift.getDocument();
                                    if (document == null) {
                                        z18 = z14;
                                    } else {
                                        z18 = z14;
                                        if (!hashSet.contains(Long.valueOf(document.id))) {
                                            hashSet.add(Long.valueOf(document.id));
                                            arrayList3.add(document);
                                        }
                                    }
                                    i41++;
                                    is0Var2 = is0Var;
                                    z14 = z18;
                                }
                                z17 = z14;
                                if (!arrayList3.isEmpty()) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                                    for (int i42 = 0; i42 < arrayList3.size(); i42++) {
                                        TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i42);
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(MessageObject.getEmoji(document2));
                                        spannableStringBuilder2.setSpan(new a6(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
                                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                                    }
                                    c10 = 0;
                                    hashMap.put(pair, spannableStringBuilder);
                                    obj2 = spannableStringBuilder;
                                    CharSequence[] charSequenceArr = new CharSequence[2];
                                    charSequenceArr[c10] = string2;
                                    charSequenceArr[1] = obj2;
                                    arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr)));
                                    this.P1 = is0Var.getLastEmojisHash();
                                }
                                c10 = 0;
                                CharSequence[] charSequenceArr2 = new CharSequence[2];
                                charSequenceArr2[c10] = string2;
                                charSequenceArr2[1] = obj2;
                                arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr2)));
                                this.P1 = is0Var.getLastEmojisHash();
                            } else if (!x9Var.i || (obj = (CharSequence) hashMap.get(pair)) == null) {
                                is0Var = is0Var2;
                            } else {
                                is0Var = is0Var2;
                                obj2 = obj;
                            }
                        }
                        z17 = z14;
                        c10 = 0;
                        CharSequence[] charSequenceArr22 = new CharSequence[2];
                        charSequenceArr22[c10] = string2;
                        charSequenceArr22[1] = obj2;
                        arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr22)));
                        this.P1 = is0Var.getLastEmojisHash();
                    } else {
                        sparseArray = g10;
                        num = 4;
                        z15 = z23;
                        z16 = z12;
                        i12 = i20;
                        z17 = z14;
                    }
                    if (z15) {
                        arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                    }
                    if (!x0()) {
                        if (z16) {
                            arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                        }
                        if (cu0Var.d != null) {
                            arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                        }
                        if (iArr[0] > 0) {
                            if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && cu0Var.d == null) {
                                arrayList.add(new Pair(0, LocaleController.getString(R.string.SharedMediaTabFull2)));
                            } else {
                                arrayList.add(new Pair(0, LocaleController.getString(R.string.SharedMediaTab2)));
                            }
                        }
                        if (z17) {
                            arrayList.add(new Pair(12, LocaleController.getString(R.string.SavedMessagesTab2)));
                            MessagesController.getGlobalMainSettings().edit().putInt("savedhint", 3).apply();
                        }
                        if (iArr[1] > 0) {
                            arrayList.add(new Pair(1, LocaleController.getString(R.string.SharedFilesTab2)));
                        }
                        if (DialogObject.isEncryptedDialog(j10)) {
                            Integer num2 = num;
                            if (iArr[4] > 0) {
                                arrayList.add(new Pair(num2, LocaleController.getString(R.string.SharedMusicTab2)));
                            }
                        } else {
                            if (iArr[3] > 0) {
                                arrayList.add(new Pair(3, LocaleController.getString(R.string.SharedLinksTab2)));
                            }
                            if (iArr[4] > 0) {
                                arrayList.add(new Pair(num, LocaleController.getString(R.string.SharedMusicTab2)));
                            }
                            if (iArr[8] > 0) {
                                arrayList.add(new Pair(15, LocaleController.getString(R.string.SharedPollTab)));
                            }
                        }
                        if (iArr[2] > 0) {
                            arrayList.add(new Pair(2, LocaleController.getString(R.string.SharedVoiceTab2)));
                        }
                        if (iArr[5] > 0) {
                            arrayList.add(new Pair(5, LocaleController.getString(R.string.SharedGIFsTab2)));
                        }
                        if (iArr[6] > 0) {
                            arrayList.add(new Pair(6, LocaleController.getString(R.string.SharedGroupsTab2)));
                        }
                        if (z13) {
                            arrayList.add(new Pair(10, LocaleController.getString(i12 > 0 ? R.string.SimilarBotsTab : R.string.SimilarChannelsTab)));
                        }
                    }
                    if (it0Var.n0) {
                        boolean t02 = t0();
                        int i43 = 0;
                        while (i43 < 15) {
                            if (e0(i43, t02) != null) {
                                Integer valueOf = Integer.valueOf(i43);
                                int i44 = 0;
                                while (true) {
                                    if (i44 >= arrayList.size()) {
                                        bool = Boolean.FALSE;
                                        break;
                                    } else {
                                        if (((Pair) arrayList.get(i44)).first == valueOf) {
                                            bool = Boolean.TRUE;
                                            break;
                                        }
                                        i44++;
                                    }
                                }
                                if (!bool.booleanValue()) {
                                    Integer valueOf2 = Integer.valueOf(i43);
                                    if (i43 == 0) {
                                        i15 = i27;
                                        string = LocaleController.getString(R.string.SharedMediaTabFull2);
                                    } else if (i43 == 1) {
                                        i15 = i27;
                                        string = LocaleController.getString(R.string.SharedFilesTab2);
                                    } else if (i43 == 2) {
                                        i15 = i27;
                                        string = LocaleController.getString(R.string.SharedVoiceTab2);
                                    } else if (i43 == 3) {
                                        i15 = i27;
                                        string = LocaleController.getString(R.string.SharedLinksTab2);
                                    } else if (i43 == 4) {
                                        i15 = i27;
                                        string = LocaleController.getString(R.string.SharedMusicTab2);
                                    } else if (i43 == 5) {
                                        i15 = i27;
                                        string = LocaleController.getString(R.string.SharedGIFsTab2);
                                    } else if (i43 != 8) {
                                        i15 = i27;
                                        string = i43 != i15 ? null : LocaleController.getString(R.string.ProfileGifts);
                                    } else {
                                        i15 = i27;
                                        string = LocaleController.getString(R.string.ProfileStories);
                                    }
                                    arrayList.add(new Pair(valueOf2, string));
                                    i43++;
                                    i27 = i15;
                                }
                            }
                            i15 = i27;
                            i43++;
                            i27 = i15;
                        }
                    }
                    if (profileTab != null) {
                        int f02 = f0(profileTab);
                        int i45 = 0;
                        while (true) {
                            if (i45 >= arrayList.size()) {
                                i45 = -1;
                                break;
                            } else if (((Integer) ((Pair) arrayList.get(i45)).first).intValue() == f02) {
                                break;
                            } else {
                                i45++;
                            }
                        }
                        if (i45 >= 0) {
                            i13 = 0;
                            arrayList.add(0, (Pair) arrayList.remove(i45));
                            if (!arrayList.isEmpty()) {
                                this.R1 = ((Integer) ((Pair) arrayList.get(i13)).first).intValue();
                            }
                            size = arrayList.size();
                            i14 = 0;
                            while (i14 < size) {
                                Object obj3 = arrayList.get(i14);
                                i14++;
                                Pair pair2 = (Pair) obj3;
                                if (it0Var.e(((Integer) pair2.first).intValue())) {
                                    sparseArray2 = sparseArray;
                                } else {
                                    sparseArray2 = sparseArray;
                                    it0Var.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, sparseArray2);
                                }
                                sparseArray = sparseArray2;
                            }
                        }
                    }
                    i13 = 0;
                    if (!arrayList.isEmpty()) {
                    }
                    size = arrayList.size();
                    i14 = 0;
                    while (i14 < size) {
                    }
                }
                selectedTab = getSelectedTab();
                if (selectedTab >= 0) {
                    this.k0[0].F = selectedTab;
                }
                this.Q1 = it0Var.n0;
                it0Var.c();
                N0();
                I();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z252 = z21;
        if (this.Q1 == it0Var.n0) {
        }
        if (i24 == 0) {
        }
        int i262 = i25;
        if (z26 == it0Var.e(8)) {
        }
        if (z23 != it0Var.e(13)) {
        }
        if (v0() != it0Var.e(8)) {
        }
        if (z24 == it0Var.e(14)) {
        }
        i11++;
        x02 = x0();
        int i272 = 14;
        cu0 cu0Var2 = this.a0;
        int[] iArr22 = this.X0;
        if (x02) {
        }
        if (i11 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.Q1 = it0Var.n0;
        it0Var.c();
        N0();
        I();
    }

    public final void z(ku0 ku0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = ku0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ku0Var.getChildAt(i11);
            if (childAt instanceof b10) {
                view = childAt;
            }
        }
        if (view != null) {
            ku0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new nt0(this, ku0Var, sparseBooleanArray, (b10) view, i10));
    }

    public final boolean z0() {
        if (C() && ((getClosestTab() == 8 || getClosestTab() == 13 || y0(getClosestTab())) && this.C1)) {
            return false;
        }
        is0 is0Var = this.V;
        if (is0Var != null && is0Var.g()) {
            return false;
        }
        ns0 ns0Var = this.W;
        return ((ns0Var != null && ns0Var.w) || this.o1 || this.g1) ? false : true;
    }

    public final Boolean z1(View view, View view2) {
        if (this.o1) {
            return null;
        }
        lu0[] lu0VarArr = this.k0;
        lu0 lu0Var = lu0VarArr[0];
        if (lu0Var == null) {
            return null;
        }
        int i10 = lu0Var.F;
        this.p1 = i10;
        boolean q02 = q0(i10);
        int[] iArr = this.m1;
        int X = X(q02 ? 1 : 0, iArr[q02 ? 1 : 0], true);
        if (view != null && X == X(q02 ? 1 : 0, X, true)) {
            view.setEnabled(false);
            view.animate().alpha(0.5f).start();
        }
        if (iArr[q02 ? 1 : 0] != X) {
            if (view2 != null && !view2.isEnabled()) {
                view2.setEnabled(true);
                view2.animate().alpha(1.0f).start();
            }
            if (!q02) {
                SharedConfig.setMediaColumnsCount(X);
            } else if (c0(lu0VarArr[0].F) >= 5 || y0(lu0VarArr[0].F)) {
                SharedConfig.setStoriesColumnsCount(X);
            }
            B(X);
        }
        return Boolean.valueOf(X != X(q02 ? 1 : 0, X, true));
    }

    public void F0(SparseArray sparseArray) {
    }

    public void G0() {
    }

    public void M0(boolean z10) {
    }

    public void P0(boolean z10) {
    }

    public int X0(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Cells.n2
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(org.telegram.ui.Cells.r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void g(org.telegram.ui.Cells.r2 r2Var) {
    }

    public void p0() {
    }
}
