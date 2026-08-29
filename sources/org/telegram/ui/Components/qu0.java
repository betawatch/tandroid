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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class qu0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.l2 {
    public static final int[] Z1 = {0, 1, 2, 4};
    public static final cr0 a2 = new cr0(0);
    public final int A;
    public final ArrayList A0;
    public g40 A1;
    public final long B;
    public final ArrayList B0;
    public final org.telegram.ui.ActionBar.c6 B1;
    public final org.telegram.ui.ActionBar.l C;
    public final ArrayList C0;
    public final NotificationCenter.ObserversGroup C1;
    public final us0 D;
    public final ArrayList D0;
    public boolean D1;
    public final ku0 E;
    public final fs0 E0;
    public final AnimationNotificationsLocker E1;
    public final eu0 F;
    public final cs0 F0;
    public rm F1;
    public final du0 G;
    public final org.telegram.ui.Cells.v0 G0;
    public int G1;
    public final du0 H;
    public AnimatorSet H0;
    public boolean H1;
    public final du0 I;
    public final mq0 I0;
    public int I1;
    public final wt0 J;
    public final ArrayList J0;
    public AnimatorSet J1;
    public final dt0 K;
    public float K0;
    public final SparseArray K1;
    public final at0 L;
    public final fs L0;
    public long L1;
    public final ys0 M;
    public final FrameLayout M0;
    public boolean M1;
    public final zt0 N;
    public final bs0 N0;
    public int N1;
    public final bu0 O;
    public final int O0;
    public final ms0 O1;
    public final vs0 P;
    public final Paint P0;
    public lh.k6 P1;
    public final fr0 Q;
    public boolean Q0;
    public float Q1;
    public final gr0 R;
    public boolean R0;
    public boolean R1;
    public final kr0 S;
    public kg.q0 S0;
    public SpannableStringBuilder S1;
    public final zs0 T;
    public final int[] T0;
    public int T1;
    public final f2.e0 U;
    public int U0;
    public final HashMap U1;
    public final xs0 V;
    public final SparseArray[] V0;
    public final HashMap V1;
    public final nu0 W;
    public int W0;
    public int W1;
    public boolean X0;
    public int X1;
    public long Y0;
    public final dh Y1;
    public TLRPC.ChatFull Z0;
    public boolean a;
    public final er0 a0;
    public TLRPC.UserFull a1;
    public boolean b;
    public final nu0 b0;
    public AnimatorSet b1;
    public boolean c;
    public final lt0 c0;
    public boolean c1;
    public boolean d;
    public final lt0 d0;
    public boolean d1;
    public int e;
    public final lt0 e0;
    public boolean e1;
    public int f;
    public final gt0 f0;
    public final long f1;
    public final it0[] g0;
    public boolean g1;
    public float h;
    public final org.telegram.ui.ActionBar.w0 h0;
    public boolean h1;
    public final org.telegram.ui.ActionBar.w0 i0;
    public final int[] i1;
    public final org.telegram.ui.ActionBar.w0 j0;
    public float j1;
    public float k0;
    public boolean k1;
    public float l0;
    public int l1;
    public final TextView m0;
    public int m1;
    public float n;
    public final ImageView n0;
    public final pr0 n1;
    public final aj0 o0;
    public float o1;
    public final org.telegram.ui.ActionBar.w0 p0;
    public final fu0[] p1;
    public final org.telegram.ui.ActionBar.w0 q0;
    public final iu0 q1;
    public boolean r;
    public final org.telegram.ui.ActionBar.w0 r0;
    public final org.telegram.ui.ActionBar.o2 r1;
    public int s;
    public final org.telegram.ui.ActionBar.w0 s0;
    public int s1;
    public int t0;
    public boolean t1;
    public final Drawable u0;
    public boolean u1;
    public int v;
    public boolean v0;
    public int v1;
    public int w;
    public final NumberTextView w0;
    public int w1;
    public final Rect x;
    public final ea x0;
    public VelocityTracker x1;
    public final p00 y;
    public final ImageView y0;
    public boolean y1;
    public final org.telegram.ui.ActionBar.h2 z0;
    public final bt0 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b34  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0b3d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0c45 A[EDGE_INSN: B:169:0x0c45->B:170:0x0c45 BREAK  A[LOOP:3: B:140:0x0913->B:166:0x0b3d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0e17  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0e1e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0290 A[EDGE_INSN: B:47:0x0290->B:48:0x0290 BREAK  A[LOOP:0: B:29:0x022f->B:42:0x0289], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ac A[LOOP:2: B:74:0x03aa->B:75:0x03ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03cd  */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [android.graphics.drawable.Drawable, f2.u0, org.telegram.ui.ActionBar.c6] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qu0(Context context, long j10, iu0 iu0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, org.telegram.ui.ActionBar.o2 o2Var, bt0 bt0Var, int i13, org.telegram.ui.ActionBar.c6 c6Var, lg.a aVar) {
        super(context);
        char c3;
        TLRPC.ProfileTab profileTab;
        int i14;
        fu0[] fu0VarArr;
        int i15;
        cs0 cs0Var;
        int i16;
        int i17;
        zt0 zt0Var;
        float f9;
        Context context2;
        org.telegram.ui.ActionBar.w0 w0Var;
        ?? r10;
        org.telegram.ui.ActionBar.c6 c6Var2;
        qu0 qu0Var;
        int i18;
        int i19;
        int i20;
        it0[] it0VarArr;
        View view;
        boolean N;
        qu0 qu0Var2;
        kr0 kr0Var;
        int i21;
        int i22;
        mr0 mr0Var;
        ht0 ht0Var;
        ht0 ht0Var2;
        ht0 ht0Var3;
        ht0 ht0Var4;
        ht0 ht0Var5;
        ht0 ht0Var6;
        ht0 ht0Var7;
        ht0 ht0Var8;
        ht0 ht0Var9;
        ht0 ht0Var10;
        ht0 ht0Var11;
        ht0 ht0Var12;
        ht0 ht0Var13;
        ht0 ht0Var14;
        ht0 ht0Var15;
        p00 p00Var;
        p00 p00Var2;
        p00 p00Var3;
        p00 p00Var4;
        qw0 qw0Var;
        qw0 qw0Var2;
        qw0 qw0Var3;
        qw0 qw0Var4;
        qw0 qw0Var5;
        qw0 qw0Var6;
        qw0 qw0Var7;
        qw0 qw0Var8;
        qw0 qw0Var9;
        qw0 qw0Var10;
        p00 p00Var5;
        ht0 ht0Var16;
        qw0 qw0Var11;
        ht0 ht0Var17;
        ht0 ht0Var18;
        it0 it0Var;
        mr0 mr0Var2;
        ht0 ht0Var19;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        TL_bots.BotInfo botInfo;
        qu0 qu0Var3 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        qu0Var3.x = new Rect();
        qu0Var3.g0 = new it0[2];
        qu0Var3.A0 = new ArrayList(10);
        qu0Var3.B0 = new ArrayList(10);
        qu0Var3.C0 = new ArrayList(10);
        qu0Var3.D0 = new ArrayList(10);
        qu0Var3.I0 = new mq0(qu0Var3, 2);
        qu0Var3.J0 = new ArrayList();
        qu0Var3.P0 = new Paint();
        qu0Var3.V0 = new SparseArray[]{new SparseArray(), new SparseArray()};
        qu0Var3.g1 = false;
        qu0Var3.h1 = false;
        qu0Var3.i1 = new int[]{3, 3};
        qu0Var3.n1 = new pr0(qu0Var3);
        qu0Var3.o1 = -5.0f;
        qu0Var3.p1 = new fu0[9];
        qu0Var3.E1 = new AnimationNotificationsLocker();
        qu0Var3.K1 = new SparseArray();
        qu0Var3.N1 = -1;
        qu0Var3.O1 = new ms0(qu0Var3);
        qu0Var3.Q1 = 0.0f;
        qu0Var3.U1 = new HashMap();
        qu0Var3.V1 = new HashMap();
        qg.c cVar = new qg.c();
        cVar.a(qu0Var3.h0(org.telegram.ui.ActionBar.g6.d6));
        lg.a aVar2 = aVar == null ? new lg.a(cVar) : aVar;
        qu0Var3.A = i13;
        qu0Var3.B1 = c6Var;
        p00 p00Var6 = new p00(context);
        qu0Var3.y = p00Var6;
        p00Var6.setIsSingleCell(true);
        TLRPC.User user = o2Var.getMessagesController().getUser(Long.valueOf(j10));
        qu0Var3.q1 = iu0Var;
        qu0Var3.z1 = bt0Var;
        int[] iArr = iu0Var.c;
        long j11 = iu0Var.s;
        qu0Var3.B = j11;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j11 == 0 ? i10 : 0, iArr[7], iArr[8]};
        qu0Var3.T0 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            if (chatFull2 == null) {
                c3 = 5;
                profileTab = null;
                if (i11 != 14 || i11 == 10 || i11 == 11 || i11 == 6) {
                    qu0Var3.U0 = i11;
                } else if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    qu0Var3.U0 = 13;
                } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                    qu0Var3.U0 = 8;
                } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || qu0Var3.v0()))) {
                    qu0Var3.U0 = 8;
                } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                    if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                        int i28 = iArr2[1];
                        i23 = -1;
                        if (i28 == -1 || i28 > 0) {
                            qu0Var3.U0 = 1;
                        }
                    } else {
                        i23 = -1;
                    }
                    if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i27 = iArr2[c3]) == i23 || i27 > 0)) {
                        qu0Var3.U0 = 5;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i26 = iArr2[3]) == i23 || i26 > 0)) {
                        qu0Var3.U0 = 3;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i25 = iArr2[4]) == i23 || i25 > 0)) {
                        qu0Var3.U0 = 4;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i24 = iArr2[2]) == i23 || i24 > 0)) {
                        qu0Var3.U0 = 2;
                    } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || qu0Var3.v0())) {
                        qu0Var3.U0 = qu0Var3.getInitialTab();
                    } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                        int i29 = -1;
                        if (i11 == -1 || j11 != 0) {
                            int i30 = 0;
                            while (true) {
                                int[] iArr3 = qu0Var3.T0;
                                if (i30 >= iArr3.length) {
                                    break;
                                }
                                int i31 = iArr3[i30];
                                if (i31 == i29 || i31 > 0) {
                                    break;
                                }
                                i30++;
                                i29 = -1;
                            }
                            qu0Var3.U0 = i30;
                        } else {
                            qu0Var3.U0 = i11;
                        }
                    } else {
                        qu0Var3.U0 = 14;
                    }
                } else {
                    qu0Var3.U0 = 14;
                }
                qu0Var3.M0(i11);
                qu0Var3.Z0 = chatFull2;
                qu0Var3.a1 = userFull;
                if (chatFull2 != null) {
                    qu0Var3.Y0 = -chatFull2.migrated_from_chat_id;
                }
                qu0Var3.f1 = j10;
                i14 = 0;
                while (true) {
                    fu0VarArr = qu0Var3.p1;
                    if (i14 < fu0VarArr.length) {
                        break;
                    }
                    fu0VarArr[i14] = new fu0();
                    qu0Var3.p1[i14].j[0] = DialogObject.isEncryptedDialog(qu0Var3.f1) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    qu0Var3.p1[i14].j[1] = Integer.MAX_VALUE;
                    qu0Var3.R(i14);
                    if (qu0Var3.Y0 != 0 && qu0Var3.Z0 != null && qu0Var3.p1[i14].b[1].size() == 0) {
                        fu0 fu0Var = qu0Var3.p1[i14];
                        fu0Var.j[1] = qu0Var3.Z0.migrated_from_max_id;
                        fu0Var.i[1] = false;
                    }
                    i14++;
                }
                qu0Var3.r1 = o2Var;
                qu0Var3.C = o2Var.getActionBar();
                qu0Var3.i1[0] = qu0Var3.S0() > 0 ? SharedConfig.mediaColumnsCount : qu0Var3.S0();
                qu0Var3.i1[1] = qu0Var3.S0() > 0 ? SharedConfig.storiesColumnsCount : qu0Var3.S0();
                qu0Var3.C1 = o2Var.getNotificationCenter().createObserversGroup(qu0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
                for (i15 = 0; i15 < 10; i15++) {
                    if (i11 == 4) {
                        as0 as0Var = new as0(qu0Var3, context);
                        as0Var.P.c();
                        qu0Var3.C0.add(as0Var);
                    }
                }
                qu0Var3.O0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                qu0Var3.R0 = false;
                qu0Var3.S0 = null;
                cs0Var = qu0Var3.F0;
                if (cs0Var != null) {
                    cs0Var.g(false);
                }
                qu0Var3.Q0 = false;
                Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
                qu0Var3.u0 = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(qu0Var3.h0(org.telegram.ui.ActionBar.g6.b7), PorterDuff.Mode.MULTIPLY));
                fs0 fs0Var = qu0Var3.E0;
                int currentTabId = fs0Var == null ? fs0Var.getCurrentTabId() : i11;
                fs0 fs0Var2 = new fs0(qu0Var3, context, qu0Var3.B1);
                i16 = qu0Var3.U0;
                if (i16 != -1) {
                    fs0Var2.setInitialTabId(i16);
                    qu0Var3.U0 = -1;
                }
                fs0Var2.U = 320L;
                int i32 = org.telegram.ui.ActionBar.g6.Fh;
                int i33 = org.telegram.ui.ActionBar.g6.Eh;
                fs0Var2.H = i32;
                fs0Var2.I = i33;
                fs0Var2.e();
                fs0Var2.setUseMinimalWidth(true);
                fs0Var2.setDelegate(new hs0(qu0Var3));
                qu0Var3.E0 = fs0Var2;
                for (i17 = 1; i17 >= 0; i17--) {
                    qu0Var3.V0[i17].clear();
                }
                qu0Var3.W0 = 0;
                qu0Var3.J0.clear();
                zt0Var = qu0Var3.N;
                if (zt0Var != null) {
                    zt0Var.w.clear();
                }
                if (!(qu0Var3 instanceof w30)) {
                    org.telegram.ui.ActionBar.a0 n10 = qu0Var3.C.n();
                    n10.addOnLayoutChangeListener(new gs0(qu0Var3));
                    if (qu0Var3.f1 == qu0Var3.r1.getUserConfig().getClientUserId() && (qu0Var3.r1 instanceof y90) && qu0Var3.D()) {
                        qu0Var3.i0 = n10.a(11, R.drawable.outline_header_search);
                    }
                    org.telegram.ui.ActionBar.w0 a10 = n10.a(0, 0);
                    a10.F();
                    a10.D = new ns0(qu0Var3);
                    qu0Var3.j0 = a10;
                    a10.setTranslationY(AndroidUtilities.dp(10.0f));
                    cs0 cs0Var2 = qu0Var3.F0;
                    a10.setSearchFieldHint(LocaleController.getString((cs0Var2 != null && cs0Var2.a() && qu0Var3.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
                    a10.setContentDescription(LocaleController.getString("Search", R.string.Search));
                    a10.setVisibility(qu0Var3.v0() ? 8 : 4);
                }
                ImageView imageView = new ImageView(context);
                qu0Var3.n0 = imageView;
                imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
                imageView.setTranslationY(AndroidUtilities.dp(10.0f));
                imageView.setVisibility(4);
                if (!qu0Var3.q0() || qu0Var3.t0()) {
                    f9 = 2.0f;
                } else {
                    qu0Var3.C.addView(imageView, i7.f6.e(48, 56, 85));
                    aj0 aj0Var = new aj0(context);
                    qu0Var3.o0 = aj0Var;
                    aj0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    aj0Var.e(R.raw.options_to_search, 24, 24);
                    aj0Var.getAnimatedDrawable().B *= 2.0f;
                    aj0Var.getAnimatedDrawable().h = true;
                    f9 = 2.0f;
                    aj0Var.setColorFilter(new PorterDuffColorFilter(qu0Var3.h0(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.SRC_IN));
                    aj0Var.setVisibility(8);
                    qu0Var3.C.addView(aj0Var, i7.f6.e(48, 56, 85));
                }
                context2 = context;
                imageView.setOnClickListener(new ts0(qu0Var3, j10, c6Var, context));
                w0Var = qu0Var3.j0;
                if (w0Var != null) {
                    EditTextBoldCursor searchField = w0Var.getSearchField();
                    int i34 = org.telegram.ui.ActionBar.g6.G6;
                    searchField.setTextColor(qu0Var3.h0(i34));
                    searchField.setHintTextColor(qu0Var3.h0(org.telegram.ui.ActionBar.g6.Si));
                    searchField.setCursorColor(qu0Var3.h0(i34));
                }
                qu0Var3.t0 = 0;
                org.telegram.ui.ActionBar.o2 o2Var2 = qu0Var3.r1;
                hv0 hv0Var = (o2Var2 == null && (o2Var2.getFragmentView() instanceof hv0)) ? (hv0) qu0Var3.r1.getFragmentView() : null;
                ea eaVar = new ea(context2, hv0Var);
                qu0Var3.x0 = eaVar;
                eaVar.setBackgroundColor(qu0Var3.h0(org.telegram.ui.ActionBar.g6.a7));
                eaVar.setAlpha(0.0f);
                eaVar.setClickable(true);
                eaVar.setVisibility(4);
                ImageView imageView2 = new ImageView(context2);
                qu0Var3.y0 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(true);
                qu0Var3.z0 = h2Var;
                imageView2.setImageDrawable(h2Var);
                int i35 = org.telegram.ui.ActionBar.g6.y8;
                h2Var.a(qu0Var3.h0(i35));
                int i36 = org.telegram.ui.ActionBar.g6.z8;
                imageView2.setBackground(org.telegram.ui.ActionBar.g6.e0(qu0Var3.h0(i36), 1));
                imageView2.setContentDescription(LocaleController.getString("Close", R.string.Close));
                eaVar.addView(imageView2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                qu0Var3.J0.add(imageView2);
                imageView2.setOnClickListener(new oq0(qu0Var3, 0));
                NumberTextView numberTextView = new NumberTextView(context2);
                qu0Var3.w0 = numberTextView;
                numberTextView.setTextSize(18);
                numberTextView.setTypeface(AndroidUtilities.bold());
                numberTextView.setTextColor(qu0Var3.h0(i35));
                eaVar.addView(numberTextView, i7.f6.m(1.0f, 0, -1, 18, 0, 0));
                qu0Var3.J0.add(numberTextView);
                if (!DialogObject.isEncryptedDialog(qu0Var3.f1)) {
                    if (!qu0Var3.v0()) {
                        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context2, qu0Var3.h0(i36), qu0Var3.h0(i35), false);
                        qu0Var3.q0 = w0Var2;
                        w0Var2.setIcon(R.drawable.msg_message);
                        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrGoToMessage));
                        w0Var2.setDuplicateParentStateEnabled(false);
                        eaVar.addView(w0Var2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        qu0Var3.J0.add(w0Var2);
                        w0Var2.setOnClickListener(new oq0(qu0Var3, 1));
                        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context2, qu0Var3.h0(i36), qu0Var3.h0(i35), false);
                        qu0Var3.p0 = w0Var3;
                        w0Var3.setIcon(R.drawable.msg_forward);
                        w0Var3.setContentDescription(LocaleController.getString(R.string.Forward));
                        w0Var3.setDuplicateParentStateEnabled(false);
                        eaVar.addView(w0Var3, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        qu0Var3.J0.add(w0Var3);
                        w0Var3.setOnClickListener(new oq0(qu0Var3, 2));
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context2, qu0Var3.h0(i36), qu0Var3.h0(i35), false);
                    qu0Var3.r0 = w0Var4;
                    w0Var4.setIcon(R.drawable.msg_pin);
                    w0Var4.setContentDescription(LocaleController.getString(R.string.PinMessage));
                    w0Var4.setDuplicateParentStateEnabled(false);
                    w0Var4.setVisibility(8);
                    eaVar.addView(w0Var4, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    qu0Var3.J0.add(w0Var4);
                    w0Var4.setOnClickListener(new oq0(qu0Var3, 3));
                    org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context2, qu0Var3.h0(i36), qu0Var3.h0(i35), false);
                    qu0Var3.s0 = w0Var5;
                    w0Var5.setIcon(R.drawable.msg_unpin);
                    w0Var5.setContentDescription(LocaleController.getString(R.string.UnpinMessage));
                    w0Var5.setDuplicateParentStateEnabled(false);
                    w0Var5.setVisibility(8);
                    eaVar.addView(w0Var5, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    qu0Var3.J0.add(w0Var5);
                    w0Var5.setOnClickListener(new oq0(qu0Var3, 4));
                    qu0Var3.p1();
                }
                org.telegram.ui.ActionBar.w0 w0Var6 = new org.telegram.ui.ActionBar.w0(context2, qu0Var3.h0(i36), qu0Var3.h0(i35), false);
                qu0Var3.h0 = w0Var6;
                w0Var6.setIcon(R.drawable.msg_delete);
                w0Var6.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
                w0Var6.setDuplicateParentStateEnabled(false);
                eaVar.addView(w0Var6, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                qu0Var3.J0.add(w0Var6);
                w0Var6.setOnClickListener(new oq0(qu0Var3, 5));
                qu0Var3.D = new us0(qu0Var3, context2);
                qu0Var3.E = new ku0(qu0Var3, context2);
                qu0Var3.G = new du0(qu0Var3, context2, 1);
                qu0Var3.H = new du0(qu0Var3, context2, 2);
                qu0Var3.I = new du0(qu0Var3, context2, 4);
                qu0Var3.J = new wt0(qu0Var3, context2, qu0Var3.r1.getCurrentAccount(), qu0Var3.r1.getResourceProvider());
                qu0Var3.K = new dt0(qu0Var3, context2);
                qu0Var3.c0 = new lt0(qu0Var3, context2, 1);
                qu0Var3.d0 = new lt0(qu0Var3, context2, 4);
                qu0Var3.e0 = new lt0(qu0Var3, context2, 3);
                qu0Var3.f0 = new gt0(qu0Var3, context2);
                qu0Var3.L = new at0(qu0Var3, context2);
                qu0Var3.M = new ys0(qu0Var3, context2);
                qu0Var3.N = new zt0(qu0Var3, context2);
                qu0Var3.O = new bu0(qu0Var3, context2);
                if (!qu0Var3.v0() && !qu0Var3.l0() && qu0Var3.B == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", qu0Var3.r1.getUserConfig().getClientUserId());
                    bundle.putInt("chatMode", 3);
                    vs0 vs0Var = new vs0(qu0Var3, context2, qu0Var3.r1.getParentLayout(), bundle);
                    qu0Var3.P = vs0Var;
                    long j12 = qu0Var3.f1;
                    org.telegram.ui.un unVar = vs0Var.a;
                    unVar.Z3 = j12;
                    unVar.La = true;
                    vs0Var.setClipToOutline(true);
                    vs0Var.setOutlineProvider(new ws0());
                }
                zs0 zs0Var = new zs0(qu0Var3, context2);
                qu0Var3.T = zs0Var;
                if (qu0Var3.B == 0) {
                    zs0Var.e = arrayList;
                    zs0Var.d = currentTabId != 7 ? null : chatFull2;
                }
                qu0Var3.V = new xs0(qu0Var3, context2);
                qu0Var3.U = new f2.e0(new dr0(qu0Var3));
                qu0Var3.W = new nu0(qu0Var3, context2, false);
                qu0Var3.a0 = new er0(qu0Var3, context2);
                qu0Var3.b0 = new nu0(qu0Var3, context2, true);
                qu0Var3.F = new eu0(qu0Var3, context2);
                if (!qu0Var3.r0()) {
                    qu0Var3.Q = new fr0(qu0Var3, context2, qu0Var3.r1, qu0Var3.f1);
                } else if (qu0Var3.r1 instanceof ProfileActivity) {
                    TextView textView = new TextView(context2);
                    qu0Var3.m0 = textView;
                    textView.setText(LocaleController.getString(R.string.Save).toUpperCase());
                    textView.setTypeface(AndroidUtilities.bold());
                    int i37 = org.telegram.ui.ActionBar.g6.Oh;
                    textView.setTextColor(qu0Var3.h0(i37));
                    textView.setTextSize(1, 15.0f);
                    textView.setGravity(17);
                    textView.setBackground(org.telegram.ui.ActionBar.g6.e0(org.telegram.ui.ActionBar.g6.l1(0.15f, qu0Var3.h0(i37)), 3));
                    textView.setPadding(AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f), 0);
                    qu0Var3.C.addView(textView, i7.f6.e(-2, 56, 85));
                    textView.setOnClickListener(new oq0(qu0Var3, 6));
                    textView.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setScaleX(0.4f);
                    textView.setScaleY(0.4f);
                    org.telegram.ui.ActionBar.o2 o2Var3 = qu0Var3.r1;
                    r10 = 0;
                    c6Var2 = c6Var;
                    gr0 gr0Var = new gr0(o2Var3.getCurrentAccount(), ((ProfileActivity) qu0Var3.r1).a(), context2, o2Var3, c6Var2, qu0Var3);
                    context2 = context2;
                    qu0 qu0Var4 = qu0Var3;
                    qu0Var4.R = gr0Var;
                    int dp = AndroidUtilities.dp(48.0f);
                    fs fsVar = qu0Var4.L0;
                    gr0Var.setPaddingTop(dp + (fsVar != null ? (int) fsVar.c(0.0f) : 0));
                    qu0Var4.S = new kr0(qu0Var4, context2, hv0Var, qu0Var4.getStoriesController().B(qu0Var4.f1, true), new jr0(qu0Var4, context2, o2Var, c6Var2));
                    qu0Var = qu0Var4;
                    qu0Var.setWillNotDraw(false);
                    i18 = 0;
                    i19 = -1;
                    i20 = 0;
                    while (true) {
                        it0VarArr = qu0Var.g0;
                        if (i20 >= it0VarArr.length) {
                            break;
                        }
                        if (i20 == 0 && (it0Var = it0VarArr[i20]) != null && (mr0Var2 = it0Var.x) != null) {
                            i19 = mr0Var2.L0();
                            if (i19 != qu0Var.g0[i20].x.B() - 1) {
                                ht0Var19 = qu0Var.g0[i20].h;
                                vk0 vk0Var = (vk0) ht0Var19.K(i19);
                                if (vk0Var != null) {
                                    i18 = vk0Var.a.getTop();
                                } else {
                                    i19 = -1;
                                }
                            } else {
                                i21 = i18;
                                i22 = -1;
                                lr0 lr0Var = new lr0(qu0Var, context2);
                                qu0Var.addView(lr0Var, i7.f6.d(-1, -1.0f, 51, 0.0f, qu0Var.B0(), 0.0f, 0.0f));
                                if (i20 == 1) {
                                    lr0Var.setTranslationX(AndroidUtilities.displaySize.x);
                                }
                                qu0Var.g0[i20] = lr0Var;
                                mr0Var = new mr0(qu0Var, lr0Var);
                                lr0Var.x = mr0Var;
                                mr0Var.z1(new nr0(qu0Var, lr0Var));
                                qu0Var.g0[i20].d = new f2.l();
                                qu0Var.g0[i20].d.n(280L);
                                qu0Var.g0[i20].d.o(jr.h);
                                it0 it0Var2 = qu0Var.g0[i20];
                                it0Var2.d.m = false;
                                it0Var2.h = new or0(qu0Var, context2, lr0Var, mr0Var);
                                ht0Var = qu0Var.g0[i20].h;
                                ht0Var.setFastScrollEnabled(1);
                                ht0Var2 = qu0Var.g0[i20].h;
                                ht0Var2.setScrollingTouchSlop(1);
                                ht0Var3 = qu0Var.g0[i20].h;
                                ht0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(f9));
                                ht0Var4 = qu0Var.g0[i20].h;
                                ht0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                                ht0Var5 = qu0Var.g0[i20].h;
                                ht0Var5.setItemAnimator(r10);
                                ht0Var6 = qu0Var.g0[i20].h;
                                ht0Var6.setClipToPadding(false);
                                ht0Var7 = qu0Var.g0[i20].h;
                                ht0Var7.setSectionsType(2);
                                ht0Var8 = qu0Var.g0[i20].h;
                                ht0Var8.setLayoutManager(mr0Var);
                                it0 it0Var3 = qu0Var.g0[i20];
                                ht0Var9 = it0Var3.h;
                                it0Var3.addView(ht0Var9, i7.f6.c(-1.0f, -1));
                                qu0Var.g0[i20].r = new ht0(context2, r10);
                                it0 it0Var4 = qu0Var.g0[i20];
                                ht0 ht0Var20 = it0Var4.r;
                                qr0 qr0Var = new qr0(qu0Var);
                                it0Var4.s = qr0Var;
                                ht0Var20.setLayoutManager(qr0Var);
                                it0 it0Var5 = qu0Var.g0[i20];
                                it0Var5.addView(it0Var5.r, i7.f6.c(-1.0f, -1));
                                qu0Var.g0[i20].r.setVisibility(8);
                                qu0Var.g0[i20].r.i(new rr0(lr0Var));
                                ht0Var10 = qu0Var.g0[i20].h;
                                ht0Var10.i(new sr0(qu0Var, lr0Var));
                                ht0Var11 = qu0Var.g0[i20].h;
                                ht0Var11.setOnItemClickListener(new jh.b3(qu0Var, lr0Var, context2, j10, c6Var2, 2));
                                ht0Var12 = qu0Var.g0[i20].h;
                                ht0Var12.setOnScrollListener(new ur0(qu0Var, lr0Var, mr0Var));
                                ht0Var13 = qu0Var.g0[i20].h;
                                ht0Var13.setOnItemLongClickListener(new vr0(qu0Var, lr0Var));
                                if (i20 == 0 && i22 != -1) {
                                    mr0Var.h1(i22, i21);
                                }
                                ht0Var14 = qu0Var.g0[i20].h;
                                qu0Var.g0[i20].y = new wr0(context2, ht0Var14);
                                qu0Var.g0[i20].y.setVisibility(8);
                                ht0Var15 = qu0Var.g0[i20].h;
                                ht0Var15.D0(qu0Var.g0[i20].y, i7.f6.c(-1.0f, -1));
                                qu0Var.g0[i20].v = new xr0(qu0Var, context2, lr0Var);
                                p00Var = qu0Var.g0[i20].v;
                                p00Var.g();
                                p00Var2 = qu0Var.g0[i20].v;
                                p00Var2.setClipToOutline(true);
                                p00Var3 = qu0Var.g0[i20].v;
                                p00Var3.setOutlineProvider(new yr0());
                                if (i20 == 0) {
                                    qu0Var.g0[i20].setVisibility(8);
                                }
                                it0 it0Var6 = qu0Var.g0[i20];
                                p00Var4 = it0Var6.v;
                                it0Var6.w = new zr0(qu0Var, context2, p00Var4);
                                qw0Var = qu0Var.g0[i20].w;
                                qw0Var.d(8, false);
                                qw0Var2 = qu0Var.g0[i20].w;
                                qw0Var2.setAnimateLayoutChange(true);
                                it0 it0Var7 = qu0Var.g0[i20];
                                qw0Var3 = it0Var7.w;
                                it0Var7.addView(qw0Var3, i7.f6.c(-1.0f, -1));
                                qw0Var4 = qu0Var.g0[i20].w;
                                qw0Var4.setOnTouchListener(new mh.d(23));
                                qw0Var5 = qu0Var.g0[i20].w;
                                qw0Var5.e(true, false);
                                qw0Var6 = qu0Var.g0[i20].w;
                                qw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                qw0Var7 = qu0Var.g0[i20].w;
                                qw0Var7.f.setVisibility(8);
                                qw0Var8 = qu0Var.g0[i20].w;
                                qw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                qw0Var9 = qu0Var.g0[i20].w;
                                qw0Var9.f.setVisibility(8);
                                qw0Var10 = qu0Var.g0[i20].w;
                                p00Var5 = qu0Var.g0[i20].v;
                                qw0Var10.addView(p00Var5, i7.f6.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                                ht0Var16 = qu0Var.g0[i20].h;
                                qw0Var11 = qu0Var.g0[i20].w;
                                ht0Var16.setEmptyView(qw0Var11);
                                ht0Var17 = qu0Var.g0[i20].h;
                                ht0Var17.m1(0, true);
                                it0[] it0VarArr2 = qu0Var.g0;
                                it0 it0Var8 = it0VarArr2[i20];
                                ht0Var18 = it0VarArr2[i20].h;
                                it0Var8.A = new c2.z(ht0Var18, qu0Var.g0[i20].x);
                                i20++;
                                c6Var2 = c6Var;
                                i18 = i21;
                                i19 = i22;
                            }
                        }
                        i21 = i18;
                        i22 = i19;
                        lr0 lr0Var2 = new lr0(qu0Var, context2);
                        qu0Var.addView(lr0Var2, i7.f6.d(-1, -1.0f, 51, 0.0f, qu0Var.B0(), 0.0f, 0.0f));
                        if (i20 == 1) {
                        }
                        qu0Var.g0[i20] = lr0Var2;
                        mr0Var = new mr0(qu0Var, lr0Var2);
                        lr0Var2.x = mr0Var;
                        mr0Var.z1(new nr0(qu0Var, lr0Var2));
                        qu0Var.g0[i20].d = new f2.l();
                        qu0Var.g0[i20].d.n(280L);
                        qu0Var.g0[i20].d.o(jr.h);
                        it0 it0Var22 = qu0Var.g0[i20];
                        it0Var22.d.m = false;
                        it0Var22.h = new or0(qu0Var, context2, lr0Var2, mr0Var);
                        ht0Var = qu0Var.g0[i20].h;
                        ht0Var.setFastScrollEnabled(1);
                        ht0Var2 = qu0Var.g0[i20].h;
                        ht0Var2.setScrollingTouchSlop(1);
                        ht0Var3 = qu0Var.g0[i20].h;
                        ht0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(f9));
                        ht0Var4 = qu0Var.g0[i20].h;
                        ht0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                        ht0Var5 = qu0Var.g0[i20].h;
                        ht0Var5.setItemAnimator(r10);
                        ht0Var6 = qu0Var.g0[i20].h;
                        ht0Var6.setClipToPadding(false);
                        ht0Var7 = qu0Var.g0[i20].h;
                        ht0Var7.setSectionsType(2);
                        ht0Var8 = qu0Var.g0[i20].h;
                        ht0Var8.setLayoutManager(mr0Var);
                        it0 it0Var32 = qu0Var.g0[i20];
                        ht0Var9 = it0Var32.h;
                        it0Var32.addView(ht0Var9, i7.f6.c(-1.0f, -1));
                        qu0Var.g0[i20].r = new ht0(context2, r10);
                        it0 it0Var42 = qu0Var.g0[i20];
                        ht0 ht0Var202 = it0Var42.r;
                        qr0 qr0Var2 = new qr0(qu0Var);
                        it0Var42.s = qr0Var2;
                        ht0Var202.setLayoutManager(qr0Var2);
                        it0 it0Var52 = qu0Var.g0[i20];
                        it0Var52.addView(it0Var52.r, i7.f6.c(-1.0f, -1));
                        qu0Var.g0[i20].r.setVisibility(8);
                        qu0Var.g0[i20].r.i(new rr0(lr0Var2));
                        ht0Var10 = qu0Var.g0[i20].h;
                        ht0Var10.i(new sr0(qu0Var, lr0Var2));
                        ht0Var11 = qu0Var.g0[i20].h;
                        ht0Var11.setOnItemClickListener(new jh.b3(qu0Var, lr0Var2, context2, j10, c6Var2, 2));
                        ht0Var12 = qu0Var.g0[i20].h;
                        ht0Var12.setOnScrollListener(new ur0(qu0Var, lr0Var2, mr0Var));
                        ht0Var13 = qu0Var.g0[i20].h;
                        ht0Var13.setOnItemLongClickListener(new vr0(qu0Var, lr0Var2));
                        if (i20 == 0) {
                            mr0Var.h1(i22, i21);
                        }
                        ht0Var14 = qu0Var.g0[i20].h;
                        qu0Var.g0[i20].y = new wr0(context2, ht0Var14);
                        qu0Var.g0[i20].y.setVisibility(8);
                        ht0Var15 = qu0Var.g0[i20].h;
                        ht0Var15.D0(qu0Var.g0[i20].y, i7.f6.c(-1.0f, -1));
                        qu0Var.g0[i20].v = new xr0(qu0Var, context2, lr0Var2);
                        p00Var = qu0Var.g0[i20].v;
                        p00Var.g();
                        p00Var2 = qu0Var.g0[i20].v;
                        p00Var2.setClipToOutline(true);
                        p00Var3 = qu0Var.g0[i20].v;
                        p00Var3.setOutlineProvider(new yr0());
                        if (i20 == 0) {
                        }
                        it0 it0Var62 = qu0Var.g0[i20];
                        p00Var4 = it0Var62.v;
                        it0Var62.w = new zr0(qu0Var, context2, p00Var4);
                        qw0Var = qu0Var.g0[i20].w;
                        qw0Var.d(8, false);
                        qw0Var2 = qu0Var.g0[i20].w;
                        qw0Var2.setAnimateLayoutChange(true);
                        it0 it0Var72 = qu0Var.g0[i20];
                        qw0Var3 = it0Var72.w;
                        it0Var72.addView(qw0Var3, i7.f6.c(-1.0f, -1));
                        qw0Var4 = qu0Var.g0[i20].w;
                        qw0Var4.setOnTouchListener(new mh.d(23));
                        qw0Var5 = qu0Var.g0[i20].w;
                        qw0Var5.e(true, false);
                        qw0Var6 = qu0Var.g0[i20].w;
                        qw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                        qw0Var7 = qu0Var.g0[i20].w;
                        qw0Var7.f.setVisibility(8);
                        qw0Var8 = qu0Var.g0[i20].w;
                        qw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        qw0Var9 = qu0Var.g0[i20].w;
                        qw0Var9.f.setVisibility(8);
                        qw0Var10 = qu0Var.g0[i20].w;
                        p00Var5 = qu0Var.g0[i20].v;
                        qw0Var10.addView(p00Var5, i7.f6.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                        ht0Var16 = qu0Var.g0[i20].h;
                        qw0Var11 = qu0Var.g0[i20].w;
                        ht0Var16.setEmptyView(qw0Var11);
                        ht0Var17 = qu0Var.g0[i20].h;
                        ht0Var17.m1(0, true);
                        it0[] it0VarArr22 = qu0Var.g0;
                        it0 it0Var82 = it0VarArr22[i20];
                        ht0Var18 = it0VarArr22[i20].h;
                        it0Var82.A = new c2.z(ht0Var18, qu0Var.g0[i20].x);
                        i20++;
                        c6Var2 = c6Var;
                        i18 = i21;
                        i19 = i22;
                    }
                    view = qu0Var.S;
                    if (view != null) {
                        qu0Var.addView(view, i7.f6.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
                    }
                    org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context2);
                    qu0Var.G0 = v0Var;
                    v0Var.T((int) (System.currentTimeMillis() / 1000), false, false);
                    v0Var.setAlpha(0.0f);
                    v0Var.V(org.telegram.ui.ActionBar.g6.wc, org.telegram.ui.ActionBar.g6.kd);
                    v0Var.setTranslationY(-AndroidUtilities.dp(48.0f));
                    qu0Var.addView(v0Var, i7.f6.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                    N = qu0Var.N();
                    qu0Var2 = qu0Var;
                    if (!N) {
                        fs fsVar2 = new fs(context2);
                        qu0Var.L0 = fsVar2;
                        fsVar2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
                        ng.d b10 = aVar2.b(fsVar2, pg.a.m(c6Var));
                        b10.p(AndroidUtilities.dp(24.0f));
                        b10.o(AndroidUtilities.dp(7.0f));
                        fsVar2.setBlurredBackground(b10);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        qu0Var.M0 = frameLayout;
                        fsVar2.addView(frameLayout);
                        fsVar2.i(frameLayout, true, false);
                        fsVar2.setOnAnimatedHeightChangedListener(new mq0(qu0Var, 0));
                        bs0 bs0Var = new bs0(qu0Var, context2, o2Var, this, c6Var);
                        qu0Var.N0 = bs0Var;
                        frameLayout.addView(bs0Var);
                        fsVar2.setCallFragmentContextView(bs0Var);
                        qu0Var.addView(fsVar2, i7.f6.d(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
                        bs0Var.setDelegate(new nq0(qu0Var));
                        ng.d b11 = aVar2.b(qu0Var.E0, pg.a.m(c6Var));
                        b11.p(AndroidUtilities.dp(18.0f));
                        b11.o(AndroidUtilities.dp(6.666f));
                        qu0Var.E0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                        qu0Var.E0.setClipToPadding(false);
                        qu0Var.E0.setBackground(r10);
                        qu0Var.E0.setBlurredBackground(b11);
                        qu0Var.E0.setOpen(false);
                        qu0Var.addView(qu0Var.E0, i7.f6.d(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
                        Context context3 = qu0Var.getContext();
                        org.telegram.ui.ActionBar.o2 o2Var4 = qu0Var.r1;
                        qu0 qu0Var5 = qu0Var;
                        cs0 cs0Var3 = new cs0(o2Var4.getCurrentAccount(), qu0Var.l0() ? 0L : qu0Var.f1, context3, o2Var4, c6Var, qu0Var5);
                        qu0 qu0Var6 = qu0Var5;
                        qu0Var6.F0 = cs0Var3;
                        cs0Var3.d(aVar2, pg.a.m(c6Var));
                        cs0Var3.setShown(0.0f);
                        qu0Var6.addView(cs0Var3, i7.f6.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                        qu0Var6.addView(qu0Var6.x0, i7.f6.e(-1, 48, 51));
                        qu0Var2 = qu0Var6;
                    }
                    qu0Var2.v1(false);
                    qu0Var2.m1(false);
                    if (qu0Var2.T0[0] >= 0) {
                        qu0Var2.z0(false);
                    }
                    kr0Var = qu0Var2.S;
                    if (kr0Var != null && i12 > 0) {
                        kr0Var.setInitialTabId(i12);
                    }
                    qu0Var2.Y1 = new dh(qu0Var2, 2);
                }
                c6Var2 = c6Var;
                r10 = 0;
                qu0Var = qu0Var3;
                qu0Var.setWillNotDraw(false);
                i18 = 0;
                i19 = -1;
                i20 = 0;
                while (true) {
                    it0VarArr = qu0Var.g0;
                    if (i20 >= it0VarArr.length) {
                    }
                    it0 it0Var622 = qu0Var.g0[i20];
                    p00Var4 = it0Var622.v;
                    it0Var622.w = new zr0(qu0Var, context2, p00Var4);
                    qw0Var = qu0Var.g0[i20].w;
                    qw0Var.d(8, false);
                    qw0Var2 = qu0Var.g0[i20].w;
                    qw0Var2.setAnimateLayoutChange(true);
                    it0 it0Var722 = qu0Var.g0[i20];
                    qw0Var3 = it0Var722.w;
                    it0Var722.addView(qw0Var3, i7.f6.c(-1.0f, -1));
                    qw0Var4 = qu0Var.g0[i20].w;
                    qw0Var4.setOnTouchListener(new mh.d(23));
                    qw0Var5 = qu0Var.g0[i20].w;
                    qw0Var5.e(true, false);
                    qw0Var6 = qu0Var.g0[i20].w;
                    qw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                    qw0Var7 = qu0Var.g0[i20].w;
                    qw0Var7.f.setVisibility(8);
                    qw0Var8 = qu0Var.g0[i20].w;
                    qw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    qw0Var9 = qu0Var.g0[i20].w;
                    qw0Var9.f.setVisibility(8);
                    qw0Var10 = qu0Var.g0[i20].w;
                    p00Var5 = qu0Var.g0[i20].v;
                    qw0Var10.addView(p00Var5, i7.f6.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                    ht0Var16 = qu0Var.g0[i20].h;
                    qw0Var11 = qu0Var.g0[i20].w;
                    ht0Var16.setEmptyView(qw0Var11);
                    ht0Var17 = qu0Var.g0[i20].h;
                    ht0Var17.m1(0, true);
                    it0[] it0VarArr222 = qu0Var.g0;
                    it0 it0Var822 = it0VarArr222[i20];
                    ht0Var18 = it0VarArr222[i20].h;
                    it0Var822.A = new c2.z(ht0Var18, qu0Var.g0[i20].x);
                    i20++;
                    c6Var2 = c6Var;
                    i18 = i21;
                    i19 = i22;
                }
                view = qu0Var.S;
                if (view != null) {
                }
                org.telegram.ui.Cells.v0 v0Var2 = new org.telegram.ui.Cells.v0(context2);
                qu0Var.G0 = v0Var2;
                v0Var2.T((int) (System.currentTimeMillis() / 1000), false, false);
                v0Var2.setAlpha(0.0f);
                v0Var2.V(org.telegram.ui.ActionBar.g6.wc, org.telegram.ui.ActionBar.g6.kd);
                v0Var2.setTranslationY(-AndroidUtilities.dp(48.0f));
                qu0Var.addView(v0Var2, i7.f6.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                N = qu0Var.N();
                qu0Var2 = qu0Var;
                if (!N) {
                }
                qu0Var2.v1(false);
                qu0Var2.m1(false);
                if (qu0Var2.T0[0] >= 0) {
                }
                kr0Var = qu0Var2.S;
                if (kr0Var != null) {
                    kr0Var.setInitialTabId(i12);
                }
                qu0Var2.Y1 = new dh(qu0Var2, 2);
            }
            profileTab = chatFull2.main_tab;
        }
        c3 = 5;
        if (i11 != 14) {
        }
        qu0Var3.U0 = i11;
        qu0Var3.M0(i11);
        qu0Var3.Z0 = chatFull2;
        qu0Var3.a1 = userFull;
        if (chatFull2 != null) {
        }
        qu0Var3.f1 = j10;
        i14 = 0;
        while (true) {
            fu0VarArr = qu0Var3.p1;
            if (i14 < fu0VarArr.length) {
            }
            i14++;
        }
        qu0Var3.r1 = o2Var;
        qu0Var3.C = o2Var.getActionBar();
        qu0Var3.i1[0] = qu0Var3.S0() > 0 ? SharedConfig.mediaColumnsCount : qu0Var3.S0();
        qu0Var3.i1[1] = qu0Var3.S0() > 0 ? SharedConfig.storiesColumnsCount : qu0Var3.S0();
        qu0Var3.C1 = o2Var.getNotificationCenter().createObserversGroup(qu0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
        while (i15 < 10) {
        }
        qu0Var3.O0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        qu0Var3.R0 = false;
        qu0Var3.S0 = null;
        cs0Var = qu0Var3.F0;
        if (cs0Var != null) {
        }
        qu0Var3.Q0 = false;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        qu0Var3.u0 = drawable2;
        drawable2.setColorFilter(new PorterDuffColorFilter(qu0Var3.h0(org.telegram.ui.ActionBar.g6.b7), PorterDuff.Mode.MULTIPLY));
        fs0 fs0Var3 = qu0Var3.E0;
        if (fs0Var3 == null) {
        }
        fs0 fs0Var22 = new fs0(qu0Var3, context, qu0Var3.B1);
        i16 = qu0Var3.U0;
        if (i16 != -1) {
        }
        fs0Var22.U = 320L;
        int i322 = org.telegram.ui.ActionBar.g6.Fh;
        int i332 = org.telegram.ui.ActionBar.g6.Eh;
        fs0Var22.H = i322;
        fs0Var22.I = i332;
        fs0Var22.e();
        fs0Var22.setUseMinimalWidth(true);
        fs0Var22.setDelegate(new hs0(qu0Var3));
        qu0Var3.E0 = fs0Var22;
        while (i17 >= 0) {
        }
        qu0Var3.W0 = 0;
        qu0Var3.J0.clear();
        zt0Var = qu0Var3.N;
        if (zt0Var != null) {
        }
        if (!(qu0Var3 instanceof w30)) {
        }
        ImageView imageView3 = new ImageView(context);
        qu0Var3.n0 = imageView3;
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        imageView3.setTranslationY(AndroidUtilities.dp(10.0f));
        imageView3.setVisibility(4);
        if (qu0Var3.q0()) {
        }
        f9 = 2.0f;
        context2 = context;
        imageView3.setOnClickListener(new ts0(qu0Var3, j10, c6Var, context));
        w0Var = qu0Var3.j0;
        if (w0Var != null) {
        }
        qu0Var3.t0 = 0;
        org.telegram.ui.ActionBar.o2 o2Var22 = qu0Var3.r1;
        if (o2Var22 == null) {
        }
        ea eaVar2 = new ea(context2, hv0Var);
        qu0Var3.x0 = eaVar2;
        eaVar2.setBackgroundColor(qu0Var3.h0(org.telegram.ui.ActionBar.g6.a7));
        eaVar2.setAlpha(0.0f);
        eaVar2.setClickable(true);
        eaVar2.setVisibility(4);
        ImageView imageView22 = new ImageView(context2);
        qu0Var3.y0 = imageView22;
        imageView22.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.h2 h2Var2 = new org.telegram.ui.ActionBar.h2(true);
        qu0Var3.z0 = h2Var2;
        imageView22.setImageDrawable(h2Var2);
        int i352 = org.telegram.ui.ActionBar.g6.y8;
        h2Var2.a(qu0Var3.h0(i352));
        int i362 = org.telegram.ui.ActionBar.g6.z8;
        imageView22.setBackground(org.telegram.ui.ActionBar.g6.e0(qu0Var3.h0(i362), 1));
        imageView22.setContentDescription(LocaleController.getString("Close", R.string.Close));
        eaVar2.addView(imageView22, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        qu0Var3.J0.add(imageView22);
        imageView22.setOnClickListener(new oq0(qu0Var3, 0));
        NumberTextView numberTextView2 = new NumberTextView(context2);
        qu0Var3.w0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(AndroidUtilities.bold());
        numberTextView2.setTextColor(qu0Var3.h0(i352));
        eaVar2.addView(numberTextView2, i7.f6.m(1.0f, 0, -1, 18, 0, 0));
        qu0Var3.J0.add(numberTextView2);
        if (!DialogObject.isEncryptedDialog(qu0Var3.f1)) {
        }
        org.telegram.ui.ActionBar.w0 w0Var62 = new org.telegram.ui.ActionBar.w0(context2, qu0Var3.h0(i362), qu0Var3.h0(i352), false);
        qu0Var3.h0 = w0Var62;
        w0Var62.setIcon(R.drawable.msg_delete);
        w0Var62.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        w0Var62.setDuplicateParentStateEnabled(false);
        eaVar2.addView(w0Var62, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        qu0Var3.J0.add(w0Var62);
        w0Var62.setOnClickListener(new oq0(qu0Var3, 5));
        qu0Var3.D = new us0(qu0Var3, context2);
        qu0Var3.E = new ku0(qu0Var3, context2);
        qu0Var3.G = new du0(qu0Var3, context2, 1);
        qu0Var3.H = new du0(qu0Var3, context2, 2);
        qu0Var3.I = new du0(qu0Var3, context2, 4);
        qu0Var3.J = new wt0(qu0Var3, context2, qu0Var3.r1.getCurrentAccount(), qu0Var3.r1.getResourceProvider());
        qu0Var3.K = new dt0(qu0Var3, context2);
        qu0Var3.c0 = new lt0(qu0Var3, context2, 1);
        qu0Var3.d0 = new lt0(qu0Var3, context2, 4);
        qu0Var3.e0 = new lt0(qu0Var3, context2, 3);
        qu0Var3.f0 = new gt0(qu0Var3, context2);
        qu0Var3.L = new at0(qu0Var3, context2);
        qu0Var3.M = new ys0(qu0Var3, context2);
        qu0Var3.N = new zt0(qu0Var3, context2);
        qu0Var3.O = new bu0(qu0Var3, context2);
        if (!qu0Var3.v0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", qu0Var3.r1.getUserConfig().getClientUserId());
            bundle2.putInt("chatMode", 3);
            vs0 vs0Var2 = new vs0(qu0Var3, context2, qu0Var3.r1.getParentLayout(), bundle2);
            qu0Var3.P = vs0Var2;
            long j122 = qu0Var3.f1;
            org.telegram.ui.un unVar2 = vs0Var2.a;
            unVar2.Z3 = j122;
            unVar2.La = true;
            vs0Var2.setClipToOutline(true);
            vs0Var2.setOutlineProvider(new ws0());
        }
        zs0 zs0Var2 = new zs0(qu0Var3, context2);
        qu0Var3.T = zs0Var2;
        if (qu0Var3.B == 0) {
        }
        qu0Var3.V = new xs0(qu0Var3, context2);
        qu0Var3.U = new f2.e0(new dr0(qu0Var3));
        qu0Var3.W = new nu0(qu0Var3, context2, false);
        qu0Var3.a0 = new er0(qu0Var3, context2);
        qu0Var3.b0 = new nu0(qu0Var3, context2, true);
        qu0Var3.F = new eu0(qu0Var3, context2);
        if (!qu0Var3.r0()) {
        }
        c6Var2 = c6Var;
        r10 = 0;
        qu0Var = qu0Var3;
        qu0Var.setWillNotDraw(false);
        i18 = 0;
        i19 = -1;
        i20 = 0;
        while (true) {
            it0VarArr = qu0Var.g0;
            if (i20 >= it0VarArr.length) {
            }
            it0 it0Var6222 = qu0Var.g0[i20];
            p00Var4 = it0Var6222.v;
            it0Var6222.w = new zr0(qu0Var, context2, p00Var4);
            qw0Var = qu0Var.g0[i20].w;
            qw0Var.d(8, false);
            qw0Var2 = qu0Var.g0[i20].w;
            qw0Var2.setAnimateLayoutChange(true);
            it0 it0Var7222 = qu0Var.g0[i20];
            qw0Var3 = it0Var7222.w;
            it0Var7222.addView(qw0Var3, i7.f6.c(-1.0f, -1));
            qw0Var4 = qu0Var.g0[i20].w;
            qw0Var4.setOnTouchListener(new mh.d(23));
            qw0Var5 = qu0Var.g0[i20].w;
            qw0Var5.e(true, false);
            qw0Var6 = qu0Var.g0[i20].w;
            qw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
            qw0Var7 = qu0Var.g0[i20].w;
            qw0Var7.f.setVisibility(8);
            qw0Var8 = qu0Var.g0[i20].w;
            qw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            qw0Var9 = qu0Var.g0[i20].w;
            qw0Var9.f.setVisibility(8);
            qw0Var10 = qu0Var.g0[i20].w;
            p00Var5 = qu0Var.g0[i20].v;
            qw0Var10.addView(p00Var5, i7.f6.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
            ht0Var16 = qu0Var.g0[i20].h;
            qw0Var11 = qu0Var.g0[i20].w;
            ht0Var16.setEmptyView(qw0Var11);
            ht0Var17 = qu0Var.g0[i20].h;
            ht0Var17.m1(0, true);
            it0[] it0VarArr2222 = qu0Var.g0;
            it0 it0Var8222 = it0VarArr2222[i20];
            ht0Var18 = it0VarArr2222[i20].h;
            it0Var8222.A = new c2.z(ht0Var18, qu0Var.g0[i20].x);
            i20++;
            c6Var2 = c6Var;
            i18 = i21;
            i19 = i22;
        }
        view = qu0Var.S;
        if (view != null) {
        }
        org.telegram.ui.Cells.v0 v0Var22 = new org.telegram.ui.Cells.v0(context2);
        qu0Var.G0 = v0Var22;
        v0Var22.T((int) (System.currentTimeMillis() / 1000), false, false);
        v0Var22.setAlpha(0.0f);
        v0Var22.V(org.telegram.ui.ActionBar.g6.wc, org.telegram.ui.ActionBar.g6.kd);
        v0Var22.setTranslationY(-AndroidUtilities.dp(48.0f));
        qu0Var.addView(v0Var22, i7.f6.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        N = qu0Var.N();
        qu0Var2 = qu0Var;
        if (!N) {
        }
        qu0Var2.v1(false);
        qu0Var2.m1(false);
        if (qu0Var2.T0[0] >= 0) {
        }
        kr0Var = qu0Var2.S;
        if (kr0Var != null) {
        }
        qu0Var2.Y1 = new dh(qu0Var2, 2);
    }

    public static ct0 M(int i10, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        ct0 ct0Var = new ct0(context, c6Var);
        TextView textView = ct0Var.a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return ct0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return ct0Var;
        }
        if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return ct0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return ct0Var;
        }
        if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return ct0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return ct0Var;
        }
        if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return ct0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return ct0Var;
        }
        if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return ct0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return ct0Var;
        }
        if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return ct0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return ct0Var;
        }
        ImageView imageView = ct0Var.b;
        if (i10 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
            return ct0Var;
        }
        if (i10 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return ct0Var;
    }

    public static TLRPC.ProfileTab d0(int i10, boolean z10) {
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

    public static int e0(TLRPC.ProfileTab profileTab) {
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

    public static void g(qu0 qu0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        rm rmVar = new rm(qu0Var, i10, storyItem, 10);
        lh.s6 storiesController = qu0Var.getStoriesController();
        long j10 = qu0Var.f1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j10, arrayList);
        tc.a0(qu0Var.r1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), rmVar).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public lh.s6 getStoriesController() {
        return MessagesController.getInstance(this.r1.getCurrentAccount()).getStoriesController();
    }

    public static /* synthetic */ void h(qu0 qu0Var, TL_stories.StoryItem storyItem) {
        qu0Var.getStoriesController().o0(qu0Var.f1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        tc.a0(qu0Var.r1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(qu0 qu0Var, long j10, int i10, String str) {
        lh.g6 B = qu0Var.getStoriesController().B(j10, true);
        int i11 = B.a;
        int c3 = B.c(i10);
        if (c3 == -1) {
            return;
        }
        ((lh.l6) B.h.get(c3)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(qu0 qu0Var, TL_stories.StoryItem storyItem, lh.l6 l6Var) {
        qu0Var.getStoriesController().c(l6Var.a, qu0Var.f1, storyItem);
        AndroidUtilities.runOnUIThread(new ii0(10, qu0Var, l6Var), 100L);
    }

    public static void m(qu0 qu0Var, HashSet hashSet, TL_stories.StoryItem storyItem, j70 j70Var, lh.l6 l6Var) {
        String formatString;
        long j10 = qu0Var.f1;
        if (hashSet.contains(Integer.valueOf(l6Var.a))) {
            qu0Var.getStoriesController().c(l6Var.a, j10, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, l6Var.b);
        } else {
            lh.s6 storiesController = qu0Var.getStoriesController();
            int i10 = l6Var.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j10, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, l6Var.b);
        }
        tc.a0(qu0Var.r1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        j70Var.u();
    }

    public static void n(qu0 qu0Var, long j10, int i10) {
        lh.g6 B = qu0Var.getStoriesController().B(j10, true);
        int i11 = B.a;
        int c3 = B.c(i10);
        if (c3 == -1) {
            return;
        }
        lh.l6 l6Var = (lh.l6) B.h.remove(c3);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_deleteAlbum.album_id = l6Var.a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int p(View view) {
        if (view instanceof org.telegram.ui.Cells.p7) {
            return ((org.telegram.ui.Cells.p7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            return ((org.telegram.ui.Cells.g7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.f7) {
            return ((org.telegram.ui.Cells.f7) view).getMessage().getId();
        }
        return 0;
    }

    public static boolean p0(int i10) {
        return i10 == 8 || i10 == 9 || w0(i10);
    }

    public static void q(it0 it0Var, fu0[] fu0VarArr, boolean z10) {
        ii0 ii0Var;
        if (!z10) {
            if (it0Var.C == null || (ii0Var = it0Var.D) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(ii0Var);
            it0Var.D.run();
            it0Var.D = null;
            it0Var.C = null;
            return;
        }
        if (SharedConfig.fastScrollHintCount <= 0 || it0Var.C != null || it0Var.E || it0Var.h.getFastScroll() == null || !it0Var.h.getFastScroll().T || it0Var.h.getFastScroll().getVisibility() != 0 || fu0VarArr[0].e() < 50) {
            return;
        }
        SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
        it0Var.E = true;
        Context context = it0Var.getContext();
        kq0 kq0Var = new kq0(context);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        int i10 = org.telegram.ui.ActionBar.g6.pf;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        kq0Var.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.qf, false)));
        kq0Var.addView(textView, i7.f6.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        jq0 jq0Var = new jq0(context);
        jq0Var.a = new Random();
        Paint paint = new Paint(1);
        jq0Var.b = paint;
        Paint paint2 = new Paint(1);
        jq0Var.c = paint2;
        jq0Var.f = 1.0f;
        jq0Var.h = 0.0f;
        paint.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        Paint paint3 = new Paint();
        jq0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        jq0Var.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        kq0Var.addView(jq0Var, i7.f6.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        it0Var.C = kq0Var;
        it0Var.addView(kq0Var, i7.f6.c(-2.0f, -2));
        it0Var.C.setAlpha(0.0f);
        it0Var.C.setScaleX(0.8f);
        it0Var.C.setScaleY(0.8f);
        it0Var.C.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        it0Var.invalidate();
        ii0 ii0Var2 = new ii0(9, it0Var, kq0Var);
        it0Var.D = ii0Var2;
        AndroidUtilities.runOnUIThread(ii0Var2, 4000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(qu0 qu0Var) {
        qu0 qu0Var2;
        ArrayList arrayList;
        int i10;
        int i11;
        Bitmap bitmap;
        long j10 = qu0Var.f1;
        fu0[] fu0VarArr = qu0Var.p1;
        it0 W = qu0Var.W(0);
        if (W != null && W.getMeasuredHeight() > 0 && W.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(W.getMeasuredWidth(), W.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e10) {
                FileLog.e(e10);
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                qu0Var.D1 = true;
                W.h.draw(new Canvas(bitmap2));
                View view = new View(W.getContext());
                view.setBackground(new BitmapDrawable(bitmap2));
                W.addView(view);
                qu0Var2 = qu0Var;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new rs(qu0Var2, view, W, bitmap2, 1)).start();
                W.h.setAlpha(0.0f);
                W.h.animate().alpha(1.0f).setUpdateListener(new d70(W, 20)).setDuration(200L).start();
                iu0 iu0Var = qu0Var2.q1;
                int[] iArr = iu0Var.c;
                arrayList = iu0Var.n[0].a;
                fu0 fu0Var = fu0VarArr[0];
                int[] iArr2 = fu0Var.f;
                iArr2[1] = 0;
                i10 = fu0Var.q;
                if (i10 != 0) {
                    iArr2[0] = iArr[0];
                } else if (i10 == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                fu0Var.h = false;
                qu0Var2.y0(0, !DialogObject.isEncryptedDialog(j10) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                qu0Var2.z0(false);
                qu0Var2.z1.R();
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j10);
                for (i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    fu0 fu0Var2 = fu0VarArr[0];
                    int i12 = fu0Var2.q;
                    if (i12 == 0) {
                        fu0Var2.a(messageObject, 0, false, isEncryptedDialog);
                    } else if (i12 == 1) {
                        if (messageObject.isPhoto()) {
                            fu0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                        }
                    } else if (!messageObject.isPhoto()) {
                        fu0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                    }
                }
            }
        }
        qu0Var2 = qu0Var;
        iu0 iu0Var2 = qu0Var2.q1;
        int[] iArr3 = iu0Var2.c;
        arrayList = iu0Var2.n[0].a;
        fu0 fu0Var3 = fu0VarArr[0];
        int[] iArr22 = fu0Var3.f;
        iArr22[1] = 0;
        i10 = fu0Var3.q;
        if (i10 != 0) {
        }
        fu0Var3.h = false;
        qu0Var2.y0(0, !DialogObject.isEncryptedDialog(j10) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        qu0Var2.z0(false);
        qu0Var2.z1.R();
        boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j10);
        while (i11 < arrayList.size()) {
        }
    }

    public static void t(qu0 qu0Var, int i10, boolean z10) {
        it0[] it0VarArr = qu0Var.g0;
        if (it0VarArr[0].B == i10) {
            return;
        }
        it0 it0Var = it0VarArr[1];
        it0Var.B = i10;
        it0Var.setVisibility(0);
        qu0Var.k0();
        qu0Var.m1(true);
        qu0Var.d1 = z10;
        qu0Var.L0();
        qu0Var.A(!qu0Var.s0(i10), true);
        qu0Var.q1(true);
    }

    public static int u(qu0 qu0Var, f2.p0 p0Var) {
        if (p0Var == qu0Var.V) {
            return 8;
        }
        if (p0Var == qu0Var.a0) {
            return 9;
        }
        for (pu0 pu0Var : qu0Var.U1.values()) {
            if (pu0Var.c == p0Var) {
                return pu0Var.a;
            }
        }
        return -1;
    }

    public static int v(qu0 qu0Var, f2.p0 p0Var) {
        if (p0Var == qu0Var.W) {
            return 8;
        }
        if (p0Var == qu0Var.b0) {
            return 9;
        }
        for (pu0 pu0Var : qu0Var.U1.values()) {
            if (pu0Var.d == p0Var) {
                return pu0Var.a;
            }
        }
        return -1;
    }

    public static boolean w0(int i10) {
        return (i10 & (-65536)) == 65536;
    }

    public final void A(boolean z10, boolean z11) {
        aj0 aj0Var = this.o0;
        if (aj0Var == null || this.R1 == z10) {
            return;
        }
        this.R1 = z10;
        if (z10 || aj0Var.getAnimatedDrawable().X >= 20) {
            aj0Var.getAnimatedDrawable().N(this.R1 ? 50 : 100);
        } else {
            aj0Var.getAnimatedDrawable().N(0);
        }
        if (z11) {
            aj0Var.getAnimatedDrawable().start();
        } else {
            aj0Var.getAnimatedDrawable().K(aj0Var.getAnimatedDrawable().f);
        }
    }

    public final void A0(int i10) {
        int i11;
        fu0[] fu0VarArr = this.p1;
        if (i10 == 0) {
            int i12 = fu0VarArr[0].q;
            i11 = i12 == 1 ? 6 : i12 == 2 ? 7 : 0;
        } else {
            i11 = i10 == 1 ? 1 : i10 == 2 ? 2 : i10 == 4 ? 4 : i10 == 5 ? 5 : 3;
        }
        fu0VarArr[i10].g = true;
        org.telegram.ui.ActionBar.o2 o2Var = this.r1;
        o2Var.getMediaDataController().loadMedia(this.f1, 50, 0, fu0VarArr[i10].k, i11, this.B, 1, o2Var.getClassGuid(), fu0VarArr[i10].p, null, null);
    }

    public final void B(int i10) {
        int i11;
        it0 W = W(this.l1);
        this.s = -1;
        if (W != null) {
            W.h.B0();
            this.m1 = i10;
            W.r.setVisibility(0);
            if (p0(this.l1)) {
                W.r.setAdapter(l1(this.l1));
            } else {
                W.r.setAdapter(this.E);
            }
            ht0 ht0Var = W.r;
            int paddingLeft = ht0Var.getPaddingLeft();
            ht0 ht0Var2 = W.r;
            int Z = Z(W.B);
            ht0Var2.Z2 = Z;
            int paddingRight = W.r.getPaddingRight();
            ht0 ht0Var3 = W.r;
            int Y = Y(v0());
            ht0Var3.a3 = Y;
            ht0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.s.y1(i10);
            W.r.a0();
            int i12 = 0;
            while (true) {
                it0[] it0VarArr = this.g0;
                if (i12 >= it0VarArr.length) {
                    break;
                }
                it0 it0Var = it0VarArr[i12];
                if (it0Var != null && ((i11 = it0Var.B) == 0 || p0(i11))) {
                    AndroidUtilities.updateVisibleRows(it0VarArr[i12].h);
                }
                i12++;
            }
            int i13 = 1;
            this.k1 = true;
            if (this.l1 == 0) {
                this.p1[0].g(true);
            }
            this.j1 = 0.0f;
            X0();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E1.lock();
            ofFloat.addUpdateListener(new es0(this, W, i13));
            ofFloat.addListener(new m20(this, p0(W.B) ? 1 : 0, i10, i13));
            ofFloat.setInterpolator(jr.f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public int B0() {
        return 0;
    }

    public final boolean C() {
        boolean r02 = r0();
        long j10 = this.f1;
        org.telegram.ui.ActionBar.o2 o2Var = this.r1;
        if (!r02) {
            return v0() || (o2Var != null && o2Var.getMessagesController().getStoriesController().h(j10));
        }
        TLRPC.User user = MessagesController.getInstance(o2Var.getCurrentAccount()).getUser(Long.valueOf(j10));
        return user != null && user.bot && user.bot_can_edit;
    }

    public final void C0(int i10, View view) {
        fr0 fr0Var;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        TLRPC.User user2;
        zt0 zt0Var = this.N;
        SparseArray[] sparseArrayArr = this.V0;
        org.telegram.ui.ActionBar.o2 o2Var = this.r1;
        final int i11 = 0;
        if (i10 != 101) {
            if (i10 == 100) {
                if (this.a1 != null && o2Var.getMessagesController().isUserNoForwards(this.a1)) {
                    g40 g40Var = this.A1;
                    if (g40Var != null) {
                        g40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                        this.A1.f(view, true);
                        return;
                    }
                    return;
                }
                if (this.Z0 != null) {
                    TLRPC.Chat chat2 = o2Var.getMessagesController().getChat(Long.valueOf(this.Z0.id));
                    if (o2Var.getMessagesController().isChatNoForwards(chat2)) {
                        g40 g40Var2 = this.A1;
                        if (g40Var2 != null) {
                            g40Var2.setText((!ChatObject.isChannel(chat2) || chat2.megagroup) ? LocaleController.getString(R.string.ForwardsRestrictedInfoGroup) : LocaleController.getString(R.string.ForwardsRestrictedInfoChannel));
                            this.A1.f(view, true);
                            return;
                        }
                        return;
                    }
                }
                if (j0()) {
                    g40 g40Var3 = this.A1;
                    if (g40Var3 != null) {
                        g40Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                        this.A1.f(view, true);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("canSelectTopics", true);
                bundle.putInt("dialogsType", 3);
                org.telegram.ui.fy fyVar = new org.telegram.ui.fy(bundle);
                fyVar.y2 = new nq0(this);
                o2Var.presentFragment(fyVar);
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
                    TLRPC.Chat chat3 = o2Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                    if (chat3 != null && chat3.migrated_to != null) {
                        bundle2.putLong("migrated_to", dialogId);
                        dialogId = -chat3.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -dialogId);
                }
                bundle2.putInt("message_id", messageObject.getId());
                bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                org.telegram.ui.tn tnVar = new org.telegram.ui.tn(bundle2);
                tnVar.H7 = messageObject.getId();
                long j10 = this.B;
                if (j10 != 0) {
                    yf.d.a(tnVar, MessagesStorage.TopicKey.of(dialogId, j10));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                o2Var.presentFragment(tnVar, false);
                return;
            }
            if (i10 == 103 || i10 == 104) {
                if (getClosestTab() == 8) {
                    xs0 xs0Var = this.V;
                    if (xs0Var == null || xs0Var.s == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < sparseArrayArr[0].size(); i12++) {
                        arrayList.add(Integer.valueOf(((MessageObject) sparseArrayArr[0].valueAt(i12)).getId()));
                    }
                    T0(arrayList, i10 == 103);
                    L(false);
                    return;
                }
                SavedMessagesController savedMessagesController = o2Var.getMessagesController().getSavedMessagesController();
                ArrayList<Long> arrayList2 = new ArrayList<>();
                for (int i13 = 0; i13 < savedMessagesController.allDialogs.size(); i13++) {
                    long j11 = savedMessagesController.allDialogs.get(i13).dialogId;
                    if (zt0Var.w.contains(Long.valueOf(j11))) {
                        arrayList2.add(Long.valueOf(j11));
                    }
                }
                if (savedMessagesController.updatePinned(arrayList2, i10 == 103, true)) {
                    int i14 = 0;
                    while (true) {
                        it0[] it0VarArr = this.g0;
                        if (i14 >= it0VarArr.length) {
                            break;
                        }
                        it0 it0Var = it0VarArr[i14];
                        if (it0Var.B == 11) {
                            it0Var.x.h1(0, 0);
                            break;
                        }
                        i14++;
                    }
                } else {
                    o2Var.showDialog(new cg.v0(33, o2Var.getCurrentAccount(), getContext(), o2Var, null));
                }
                L(true);
                return;
            }
            return;
        }
        boolean p02 = p0(getSelectedTab());
        org.telegram.ui.ActionBar.c6 c6Var = this.B1;
        if (p02 || getSelectedTab() == 13) {
            if (sparseArrayArr[0] != null) {
                if (!r0() || (fr0Var = this.Q) == null || fr0Var.getCurrentList() == null) {
                    final ArrayList arrayList3 = new ArrayList();
                    for (int i15 = 0; i15 < sparseArrayArr[0].size(); i15++) {
                        TL_stories.StoryItem storyItem = ((MessageObject) sparseArrayArr[0].valueAt(i15)).storyItem;
                        if (storyItem != null) {
                            arrayList3.add(storyItem);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, c6Var);
                    String string = LocaleController.getString(arrayList3.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.N = string;
                    c2Var.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.Components.tq0
                        public final /* synthetic */ qu0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.b2
                        public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i16) {
                            switch (i11) {
                                case 0:
                                    qu0 qu0Var = this.b;
                                    org.telegram.ui.ActionBar.o2 o2Var2 = qu0Var.r1;
                                    lh.s6 storiesController = o2Var2.getMessagesController().getStoriesController();
                                    long j12 = qu0Var.f1;
                                    ArrayList arrayList4 = arrayList3;
                                    storiesController.s(j12, arrayList4);
                                    tc.a0(o2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList4.size(), new Object[0])).j();
                                    qu0Var.L(false);
                                    break;
                                default:
                                    qu0 qu0Var2 = this.b;
                                    qu0Var2.getClass();
                                    int i17 = 0;
                                    while (true) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (i17 >= arrayList5.size()) {
                                            qu0Var2.L(true);
                                            break;
                                        } else {
                                            qu0Var2.r1.getMessagesController().deleteSavedDialog(((Long) arrayList5.get(i17)).longValue());
                                            i17++;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xo0(2));
                    c2Var.show();
                    c2Var.h();
                    return;
                }
                lh.c6 currentList = fr0Var.getCurrentList();
                ArrayList arrayList4 = new ArrayList();
                for (int i16 = 0; i16 < sparseArrayArr[0].size(); i16++) {
                    TL_stories.StoryItem storyItem2 = ((MessageObject) sparseArrayArr[0].valueAt(i16)).storyItem;
                    if (storyItem2 != null) {
                        arrayList4.add(storyItem2.media);
                    }
                }
                if (arrayList4.isEmpty()) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, c6Var);
                String string2 = LocaleController.getString(arrayList4.size() > 1 ? R.string.DeleteBotPreviewsTitle : R.string.DeleteBotPreviewTitle);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                c2Var2.N = string2;
                c2Var2.P = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList4.size(), new Object[0]);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new androidx.car.app.utils.a(this, currentList, arrayList4, 28));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new xo0(r15 ? 1 : 0));
                c2Var2.show();
                c2Var2.h();
                return;
            }
            return;
        }
        if (getSelectedTab() != 11) {
            long j12 = this.f1;
            if (DialogObject.isEncryptedDialog(j12)) {
                encryptedChat = org.telegram.messenger.x3.p(o2Var.getMessagesController(), j12);
                user = null;
                chat = null;
            } else if (DialogObject.isUserDialog(j12)) {
                user = o2Var.getMessagesController().getUser(Long.valueOf(j12));
                chat = null;
                encryptedChat = null;
            } else {
                chat = o2Var.getMessagesController().getChat(Long.valueOf(-j12));
                user = null;
                encryptedChat = null;
            }
            c5.z(o2Var, user, chat, encryptedChat, null, this.Y0, null, this.V0, null, 0, 0, null, new mq0(this, r15 ? 1 : 0), null, this.B1);
            return;
        }
        SavedMessagesController savedMessagesController2 = o2Var.getMessagesController().getSavedMessagesController();
        final ArrayList arrayList5 = new ArrayList();
        for (int i17 = 0; i17 < savedMessagesController2.allDialogs.size(); i17++) {
            long j13 = savedMessagesController2.allDialogs.get(i17).dialogId;
            if (zt0Var.w.contains(Long.valueOf(j13))) {
                arrayList5.add(Long.valueOf(j13));
            }
        }
        String str = "";
        if (arrayList5.isEmpty()) {
            z10 = false;
        } else {
            Long l10 = (Long) arrayList5.get(0);
            long longValue = l10.longValue();
            z10 = longValue == o2Var.getUserConfig().getClientUserId();
            if (longValue < 0) {
                TLRPC.Chat chat4 = o2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat4 != null) {
                    str = chat4.title;
                }
            } else if (longValue >= 0 && (user2 = o2Var.getMessagesController().getUser(l10)) != null) {
                str = UserObject.isAnonymous(user2) ? LocaleController.getString(R.string.AnonymousForward) : UserObject.getUserName(user2);
            }
        }
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, c6Var);
        String formatString = arrayList5.size() == 1 ? LocaleController.formatString(z10 ? R.string.ClearHistoryMyNotesTitle : R.string.ClearHistoryTitleSingle2, str) : LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList5.size(), new Object[0]);
        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
        c2Var3.N = formatString;
        c2Var3.P = arrayList5.size() == 1 ? LocaleController.formatString(z10 ? R.string.ClearHistoryMyNotesMessage : R.string.ClearHistoryMessageSingle, str) : LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList5.size(), new Object[0]);
        String string3 = LocaleController.getString(R.string.Remove);
        final int i18 = r15 ? 1 : 0;
        alertDialog$Builder3.k(string3, new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.Components.tq0
            public final /* synthetic */ qu0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i162) {
                switch (i18) {
                    case 0:
                        qu0 qu0Var = this.b;
                        org.telegram.ui.ActionBar.o2 o2Var2 = qu0Var.r1;
                        lh.s6 storiesController = o2Var2.getMessagesController().getStoriesController();
                        long j122 = qu0Var.f1;
                        ArrayList arrayList42 = arrayList5;
                        storiesController.s(j122, arrayList42);
                        tc.a0(o2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList42.size(), new Object[0])).j();
                        qu0Var.L(false);
                        break;
                    default:
                        qu0 qu0Var2 = this.b;
                        qu0Var2.getClass();
                        int i172 = 0;
                        while (true) {
                            ArrayList arrayList52 = arrayList5;
                            if (i172 >= arrayList52.size()) {
                                qu0Var2.L(true);
                                break;
                            } else {
                                qu0Var2.r1.getMessagesController().deleteSavedDialog(((Long) arrayList52.get(i172)).longValue());
                                i172++;
                            }
                        }
                }
            }
        });
        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
        o2Var.showDialog(c2Var3);
        TextView textView = (TextView) c2Var3.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
        }
    }

    public boolean D() {
        return !(this instanceof w30);
    }

    public final boolean E() {
        it0 it0Var;
        it0[] it0VarArr = this.g0;
        if (it0VarArr == null || (it0Var = it0VarArr[0]) == null) {
            return false;
        }
        if (this.g1 && p0(it0Var.B)) {
            return false;
        }
        boolean p02 = p0(it0VarArr[0].B);
        int i10 = this.i1[p02 ? 1 : 0];
        return i10 != X(p02 ? 1 : 0, i10, false);
    }

    public final void F() {
        fs0 fs0Var = this.E0;
        if (fs0Var.d(fs0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = fs0Var.getFirstTabId();
        fs0Var.setInitialTabId(firstTabId);
        this.g0[0].B = firstTabId;
        m1(false);
    }

    public final void F0() {
        lh.k6 k6Var;
        lh.k6 k6Var2;
        this.C1.removeAllObservers();
        xs0 xs0Var = this.V;
        if (xs0Var != null && (k6Var2 = xs0Var.s) != null && k6Var2 != null) {
            k6Var2.z(xs0Var.v);
        }
        er0 er0Var = this.a0;
        if (er0Var != null && (k6Var = er0Var.s) != null && k6Var != null) {
            k6Var.z(er0Var.v);
        }
        Iterator it = this.U1.values().iterator();
        while (it.hasNext()) {
            ou0 ou0Var = ((pu0) it.next()).c;
            lh.k6 k6Var3 = ou0Var.s;
            if (k6Var3 != null && k6Var3 != null) {
                k6Var3.z(ou0Var.v);
            }
        }
    }

    public final void G(it0 it0Var, jl0 jl0Var, f2.j0 j0Var) {
        int i10;
        int i11;
        f2.n1 K;
        lh.k6 k6Var;
        if (this.k1 || this.F1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (jl0Var.getFastScroll() == null || !jl0Var.getFastScroll().n || currentTimeMillis - it0Var.a >= 300) {
            it0Var.a = currentTimeMillis;
            if ((this.R0 && this.Q0 && it0Var.B != 11) || it0Var.B == 7) {
                return;
            }
            int L0 = j0Var.L0();
            int abs = L0 == -1 ? 0 : Math.abs(j0Var.N0() - L0) + 1;
            int h = jl0Var.getAdapter() == null ? 0 : jl0Var.getAdapter().h();
            int i12 = it0Var.B;
            int[] iArr = this.i1;
            fu0[] fu0VarArr = this.p1;
            if (i12 == 0 || i12 == 1 || i12 == 2 || i12 == 4) {
                h = fu0VarArr[i12].d() + fu0VarArr[i12].a.size();
                fu0 fu0Var = fu0VarArr[i12];
                if (fu0Var.h && fu0Var.e.size() > 2 && it0Var.B == 0 && fu0VarArr[i12].a.size() != 0) {
                    float f9 = i12 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((jl0Var.getMeasuredHeight() / (jl0Var.getMeasuredWidth() / f9)) * f9 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((nt0) fu0VarArr[i12].e.get(1)).b) {
                        measuredHeight = ((nt0) fu0VarArr[i12].e.get(1)).b;
                    }
                    if ((L0 > h && L0 - h > measuredHeight) || ((i10 = L0 + abs) < fu0VarArr[i12].m && fu0VarArr[0].m - i10 > measuredHeight)) {
                        rm rmVar = new rm(this, i12, jl0Var, 12);
                        this.F1 = rmVar;
                        AndroidUtilities.runOnUIThread(rmVar);
                        return;
                    }
                }
            }
            int i13 = it0Var.B;
            if (i13 == 7) {
                return;
            }
            if (p0(i13)) {
                nu0 k12 = k1(it0Var.B);
                if (k12 == null || (k6Var = k12.s) == null || L0 + abs <= k6Var.i() - iArr[1]) {
                    return;
                }
                k12.P();
                return;
            }
            int i14 = it0Var.B;
            if (i14 == 6) {
                if (abs > 0) {
                    at0 at0Var = this.L;
                    boolean z10 = at0Var.h;
                    ArrayList arrayList = at0Var.d;
                    if (z10 || at0Var.e || arrayList.isEmpty() || L0 + abs < h - 5) {
                        return;
                    }
                    at0.E(at0Var, ((TLRPC.Chat) j7.l1.i(1, arrayList)).id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.o2 o2Var = this.r1;
            if (i14 == 11) {
                int i15 = -1;
                for (int i16 = 0; i16 < it0Var.h.getChildCount(); i16++) {
                    View childAt = it0Var.h.getChildAt(i16);
                    it0Var.h.getClass();
                    i15 = Math.max(RecyclerView.R(childAt), i15);
                }
                f2.p0 adapter = it0Var.h.getAdapter();
                bu0 bu0Var = this.O;
                if (adapter != bu0Var) {
                    if (i15 + 1 >= o2Var.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                        o2Var.getMessagesController().getSavedMessagesController().loadDialogs(false);
                        return;
                    }
                    return;
                } else {
                    if (i15 + 1 < bu0Var.h.size() + bu0Var.e.size() || bu0Var.s || bu0Var.r) {
                        return;
                    }
                    bu0Var.r = true;
                    bu0Var.F();
                    return;
                }
            }
            if (i14 == 10 || i14 == 12 || i14 == 13 || i14 == 14) {
                return;
            }
            int i17 = i14 == 0 ? 3 : i14 == 5 ? 10 : 6;
            int i18 = i14 == 15 ? 8 : i14;
            if (abs + L0 > h - i17 || fu0VarArr[i18].o) {
                fu0 fu0Var2 = fu0VarArr[i18];
                if (!fu0Var2.g) {
                    if (i14 == 0) {
                        int i19 = fu0VarArr[0].q;
                        i11 = i19 == 1 ? 6 : i19 == 2 ? 7 : 0;
                    } else {
                        i11 = i14 == 1 ? 1 : i14 == 2 ? 2 : i14 == 4 ? 4 : i14 == 5 ? 5 : i14 == 15 ? 8 : 3;
                    }
                    boolean[] zArr = fu0Var2.i;
                    if (!zArr[0]) {
                        fu0Var2.g = true;
                        o2Var.getMediaDataController().loadMedia(this.f1, 50, fu0VarArr[i18].j[0], 0, i11, this.B, 1, o2Var.getClassGuid(), fu0VarArr[i18].p, null, null);
                    } else if (this.Y0 != 0 && !zArr[1]) {
                        fu0Var2.g = true;
                        o2Var.getMediaDataController().loadMedia(this.Y0, 50, fu0VarArr[i18].j[1], 0, i11, this.B, 1, o2Var.getClassGuid(), fu0VarArr[i18].p, null, null);
                    }
                }
            }
            int i20 = fu0VarArr[i18].m;
            if (i18 == 0) {
                i20 = this.D.L(0);
            }
            if (L0 - i20 < i17 + 1) {
                fu0 fu0Var3 = fu0VarArr[i18];
                if (!fu0Var3.g && !fu0Var3.l && !fu0Var3.o) {
                    A0(it0Var.B);
                }
            }
            it0 it0Var2 = this.g0[0];
            if (it0Var2.h == jl0Var) {
                int i21 = it0Var2.B;
                if ((i21 != 0 && i21 != 5) || L0 == -1 || (K = jl0Var.K(L0)) == null) {
                    return;
                }
                int i22 = K.f;
                if (i22 == 0 || i22 == 12) {
                    View view = K.a;
                    boolean z11 = view instanceof org.telegram.ui.Cells.q7;
                    org.telegram.ui.Cells.v0 v0Var = this.G0;
                    if (!z11) {
                        if (view instanceof org.telegram.ui.Cells.d2) {
                            v0Var.T(((org.telegram.ui.Cells.d2) view).getDate(), false, true);
                        }
                    } else {
                        org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
                        MessageObject messageObject = q7Var.e <= 0 ? null : q7Var.b[0];
                        if (messageObject != null) {
                            v0Var.T(messageObject.messageOwner.date, false, true);
                        }
                    }
                }
            }
        }
    }

    public final void G0(int i10, View view, MessageObject messageObject, int i11) {
        String str;
        if (messageObject == null || this.k1) {
            return;
        }
        kr0 kr0Var = this.S;
        if (kr0Var == null || !kr0Var.w) {
            int i12 = 0;
            i12 = 0;
            String str2 = null;
            if (this.y1) {
                int i13 = 8;
                if (i11 == 8 && !C()) {
                    return;
                }
                char c3 = messageObject.getDialogId() == this.f1 ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = this.V0;
                if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                    sparseArrayArr[c3].remove(messageObject.getId());
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.W0--;
                    }
                } else {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        return;
                    }
                    sparseArrayArr[c3].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.W0++;
                    }
                }
                D0(sparseArrayArr[0]);
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    b1(false);
                } else {
                    this.w0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    this.h0.setVisibility(this.W0 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.w0 w0Var = this.q0;
                    if (w0Var != null) {
                        w0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.p0;
                    if (w0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        w0Var2.setVisibility(i13);
                    }
                    u1();
                }
                this.X0 = false;
                if (view instanceof org.telegram.ui.Cells.g7) {
                    ((org.telegram.ui.Cells.g7) view).b(sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.q7) {
                    ((org.telegram.ui.Cells.q7) view).b(0, sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0);
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    ((org.telegram.ui.Cells.j7) view).f(sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.f7) {
                    ((org.telegram.ui.Cells.f7) view).e(sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.d2) {
                    ((org.telegram.ui.Cells.d2) view).c(sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.p7) {
                    ((org.telegram.ui.Cells.p7) view).i(sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0, true);
                }
            } else {
                pr0 pr0Var = this.n1;
                fu0[] fu0VarArr = this.p1;
                org.telegram.ui.ActionBar.o2 o2Var = this.r1;
                if (i11 == 0) {
                    fu0 fu0Var = fu0VarArr[i11];
                    int i14 = i10 - fu0Var.m;
                    if (i14 >= 0 && i14 < fu0Var.a.size()) {
                        PhotoViewer.t1().K2(null, o2Var, null);
                        PhotoViewer.t1().a2(fu0VarArr[i11].a, i14, this.f1, this.Y0, this.B, pr0Var);
                    }
                } else if (i11 == 2 || i11 == 4) {
                    if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).a();
                    }
                } else if (i11 == 5) {
                    PhotoViewer.t1().K2(null, o2Var, null);
                    int indexOf = fu0VarArr[i11].a.indexOf(messageObject);
                    if (indexOf < 0) {
                        PhotoViewer.t1().a2(org.telegram.messenger.x3.n(messageObject), 0, 0L, 0L, 0L, pr0Var);
                    } else {
                        PhotoViewer.t1().a2(fu0VarArr[i11].a, indexOf, this.f1, this.Y0, this.B, pr0Var);
                    }
                } else if (i11 == 1) {
                    if (view instanceof org.telegram.ui.Cells.g7) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                        TLRPC.Document document = messageObject.getDocument();
                        if (g7Var.C) {
                            if (messageObject.canPreviewDocument()) {
                                PhotoViewer.t1().K2(null, o2Var, null);
                                int indexOf2 = fu0VarArr[i11].a.indexOf(messageObject);
                                if (indexOf2 < 0) {
                                    PhotoViewer.t1().a2(org.telegram.messenger.x3.n(messageObject), 0, 0L, 0L, 0L, pr0Var);
                                    return;
                                } else {
                                    PhotoViewer.t1().a2(fu0VarArr[i11].a, indexOf2, this.f1, this.Y0, this.B, pr0Var);
                                    return;
                                }
                            }
                            AndroidUtilities.openDocument(messageObject, o2Var.getParentActivity(), o2Var);
                        } else if (g7Var.B) {
                            o2Var.getFileLoader().cancelLoadFile(document);
                            g7Var.f(true);
                        } else {
                            MessageObject message = g7Var.getMessage();
                            message.putInDownloadsStore = true;
                            o2Var.getFileLoader().loadFile(document, message, 0, 0);
                            g7Var.f(true);
                        }
                    }
                } else if (i11 == 3) {
                    try {
                        TLRPC.WebPage webPage = MessageObject.getMedia(messageObject.messageOwner) != null ? MessageObject.getMedia(messageObject.messageOwner).webpage : null;
                        if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            str = null;
                        } else {
                            if (webPage.cached_page != null) {
                                LaunchActivity launchActivity = LaunchActivity.C1;
                                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().k(messageObject) == null) {
                                    o2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str3 = webPage.embed_url;
                            if (str3 != null && str3.length() != 0) {
                                mu.I(o2Var, messageObject, this.n1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                return;
                            }
                            str = webPage.url;
                        }
                        if (str == null) {
                            ArrayList arrayList = ((org.telegram.ui.Cells.j7) view).A;
                            if (arrayList.size() > 0) {
                                str2 = ((CharSequence) arrayList.get(0)).toString();
                            }
                            str = str2;
                        }
                        if (str != null) {
                            R0(str);
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                } else if (p0(i11)) {
                    nu0 k12 = k1(i11);
                    lh.k6 k6Var = k12 != null ? k12.s : null;
                    if (k6Var == null) {
                        return;
                    }
                    lh.i9 orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int id2 = messageObject.getId();
                    lh.b7 a10 = lh.b7.a(this.g0[0].h);
                    a10.e = new cv(k6Var, 18);
                    if ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).o1) {
                        i12 = AndroidUtilities.dp(68.0f);
                    }
                    a10.s += i12;
                    orCreateStoryViewer.C(context, id2, k6Var, a10);
                }
            }
            p1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean H(MotionEvent motionEvent) {
        fr0 fr0Var;
        it0[] it0VarArr = this.g0;
        int i10 = it0VarArr[0].B;
        if (i10 == 13 && (fr0Var = this.Q) != null) {
            View currentView = fr0Var.n.getCurrentView();
            if (currentView instanceof mh.r) {
                mh.r rVar = (mh.r) currentView;
                mh.l lVar = rVar.v;
                mh.i iVar = rVar.f;
                if (rVar.a != null && rVar.getParent() != null) {
                    if (!rVar.b || rVar.G) {
                        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                            if (rVar.H && !rVar.G && motionEvent.getPointerCount() == 2) {
                                rVar.L = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                rVar.M = 1.0f;
                                rVar.J = motionEvent.getPointerId(0);
                                rVar.K = motionEvent.getPointerId(1);
                                iVar.I0(false);
                                iVar.cancelLongPress();
                                iVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) rVar.getParent();
                                rVar.Q = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - rVar.getX());
                                int y8 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - rVar.getY());
                                int i11 = rVar.Q;
                                Rect rect = rVar.R;
                                rVar.O = -1;
                                int i12 = y8 + iVar.T2;
                                for (int i13 = 0; i13 < iVar.getChildCount(); i13++) {
                                    View childAt = iVar.getChildAt(i13);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i11, i12)) {
                                        rVar.O = RecyclerView.S(childAt);
                                        rVar.P = childAt.getTop();
                                    }
                                }
                                rVar.I = true;
                            }
                            if (motionEvent.getActionMasked() == 0) {
                                if ((motionEvent.getY() - ((View) rVar.getParent()).getY()) - rVar.getY() > 0.0f) {
                                    rVar.H = true;
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 2 && (rVar.G || rVar.I)) {
                            int i14 = -1;
                            int i15 = -1;
                            for (int i16 = 0; i16 < motionEvent.getPointerCount(); i16++) {
                                if (rVar.J == motionEvent.getPointerId(i16)) {
                                    i14 = i16;
                                }
                                if (rVar.K == motionEvent.getPointerId(i16)) {
                                    i15 = i16;
                                }
                            }
                            if (i14 == -1 || i15 == -1) {
                                rVar.H = false;
                                rVar.I = false;
                                rVar.G = false;
                                rVar.a();
                                return false;
                            }
                            float hypot = ((float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14))) / rVar.L;
                            rVar.M = hypot;
                            if (!rVar.G && (hypot > 1.01f || hypot < 0.99f)) {
                                rVar.G = true;
                                boolean z10 = hypot > 1.0f;
                                rVar.N = z10;
                                rVar.b(z10);
                            }
                            if (rVar.G) {
                                boolean z11 = rVar.N;
                                if ((!z11 || rVar.M >= 1.0f) && (z11 || rVar.M <= 1.0f)) {
                                    rVar.c = Math.max(0.0f, Math.min(1.0f, z11 ? org.telegram.messenger.x3.a(2.0f, rVar.M, 1.0f, 1.0f) : (1.0f - rVar.M) / 0.5f));
                                } else {
                                    rVar.c = 0.0f;
                                }
                                float f9 = rVar.c;
                                if (f9 == 1.0f || f9 == 0.0f) {
                                    if (f9 == 1.0f) {
                                        int i17 = rVar.e;
                                        int ceil = (((int) Math.ceil(rVar.O / rVar.e)) * i17) + ((int) ((rVar.S.C.v1 / (iVar.getMeasuredWidth() - ((int) (iVar.getMeasuredWidth() / rVar.e)))) * (i17 - 1)));
                                        if (ceil >= lVar.h()) {
                                            ceil = lVar.h() - 1;
                                        }
                                        rVar.O = ceil;
                                    }
                                    rVar.a();
                                    if (rVar.c == 0.0f) {
                                        rVar.N = !rVar.N;
                                    }
                                    rVar.b(rVar.N);
                                    rVar.L = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                iVar.invalidate();
                            }
                        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((rVar.J == motionEvent.getPointerId(0) && rVar.K == motionEvent.getPointerId(1)) || (rVar.J == motionEvent.getPointerId(1) && rVar.K == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && rVar.G) {
                            rVar.I = false;
                            rVar.H = false;
                            rVar.G = false;
                            rVar.a();
                        }
                        return rVar.G;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i10 == 0 || p0(i10)) && getParent() != null) {
            if (!this.k1 || this.a) {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (this.b && !this.a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f = motionEvent.getPointerId(1);
                        it0VarArr[0].h.I0(false);
                        it0VarArr[0].h.cancelLongPress();
                        it0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - it0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - it0VarArr[0].getY());
                        int i18 = this.w;
                        this.s = -1;
                        int i19 = y10 + it0VarArr[0].h.T2;
                        if (getY() != 0.0f && this.A == 1) {
                            i19 = 0;
                        }
                        for (int i20 = 0; i20 < it0VarArr[0].h.getChildCount(); i20++) {
                            View childAt2 = it0VarArr[0].h.getChildAt(i20);
                            Rect rect2 = this.x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i18, i19)) {
                                it0VarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.z1.T() && this.s == -1) {
                            this.s = (int) (((this.i1[p0(it0VarArr[0].B) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i18 / it0VarArr[0].h.getMeasuredWidth(), 0.0f))) + it0VarArr[0].x.L0());
                            this.v = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - it0VarArr[0].getY() > 0.0f) {
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
                        e1(z12);
                    }
                    if (this.a) {
                        boolean z13 = this.r;
                        if ((!z13 || this.n >= 1.0f) && (z13 || this.n <= 1.0f)) {
                            this.j1 = Math.max(0.0f, Math.min(1.0f, z13 ? org.telegram.messenger.x3.a(2.0f, this.n, 1.0f, 1.0f) : (1.0f - this.n) / 0.5f));
                        } else {
                            this.j1 = 0.0f;
                        }
                        float f10 = this.j1;
                        if (f10 == 1.0f || f10 == 0.0f) {
                            f2.p0 k12 = p0(this.l1) ? k1(this.l1) : this.D;
                            if (this.j1 == 1.0f) {
                                int i24 = this.m1;
                                int ceil2 = (((int) Math.ceil(this.s / this.m1)) * i24) + ((int) ((this.v1 / (it0VarArr[0].h.getMeasuredWidth() - ((int) (it0VarArr[0].h.getMeasuredWidth() / this.m1)))) * (i24 - 1)));
                                if (ceil2 >= k12.h()) {
                                    ceil2 = k12.h() - 1;
                                }
                                this.s = ceil2;
                            }
                            T();
                            if (this.j1 == 0.0f) {
                                this.r = !this.r;
                            }
                            e1(this.r);
                            this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        }
                        it0VarArr[0].h.invalidate();
                        it0 it0Var = it0VarArr[0];
                        if (it0Var.C != null) {
                            it0Var.invalidate();
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

    public final boolean H0(MessageObject messageObject, View view, int i10, boolean z10) {
        kr0 kr0Var;
        final TL_stories.StoryItem storyItem;
        xs0 xs0Var;
        lh.k6 k6Var;
        final int i11 = 0;
        if (!this.y1) {
            org.telegram.ui.ActionBar.o2 o2Var = this.r1;
            if (o2Var.getParentActivity() != null && messageObject != null && ((kr0Var = this.S) == null || !kr0Var.w)) {
                AndroidUtilities.hideKeyboard(o2Var.getParentActivity().getCurrentFocus());
                long j10 = this.f1;
                int i12 = 8;
                final int i13 = 1;
                if (!z10 || (!(w0(getClosestTab()) || getClosestTab() == 8) || this.y1)) {
                    char c3 = messageObject.getDialogId() == j10 ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.V0;
                    sparseArrayArr[c3].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.W0++;
                    }
                    this.h0.setVisibility(this.W0 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.w0 w0Var = this.q0;
                    if (w0Var != null) {
                        w0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.p0;
                    if (w0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        w0Var2.setVisibility(i12);
                    }
                    this.w0.a(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.J0;
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
                    this.X0 = false;
                    if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.q7) {
                        ((org.telegram.ui.Cells.q7) view).b(i10, true);
                    } else if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.d2) {
                        ((org.telegram.ui.Cells.d2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.p7) {
                        ((org.telegram.ui.Cells.p7) view).i(true, true);
                    }
                    if (!this.y1) {
                        b1(true);
                    }
                    D0(sparseArrayArr[0]);
                    p1();
                    return true;
                }
                if (view instanceof org.telegram.ui.Cells.p7) {
                    org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                    p7Var.k(p7Var.n, p7Var.r, true);
                }
                TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean w02 = w0(getClosestTab());
                    j70 I = j70.I(o2Var, view);
                    j70 J = I.J();
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.it0(I, 25), false);
                    J.k();
                    j70.f(J, getStoriesController().B(j10, true), hashSet, true, new g(this, storyItem2, I, 23), new eg.d1(this, hashSet, storyItem2, I, 11));
                    I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new ih.z2(I, J, 7), false);
                    I.k();
                    I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new ag.z1(this, messageObject, view, i10, 22), false);
                    final int i15 = 3;
                    if (w02) {
                        int h12 = h1(getClosestTab());
                        String w10 = getStoriesController().w(h12, j10);
                        I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new i8(this, h12, i12), false);
                        storyItem = storyItem2;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new ag.z1(this, h12, storyItem, w10, 23), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (xs0Var = this.V) != null && (k6Var = xs0Var.s) != null) {
                            if (k6Var.m(storyItem.id)) {
                                I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() { // from class: org.telegram.ui.Components.pq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                qu0 qu0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qu0Var.getContext(), 0, qu0Var.B1);
                                                alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new uq0(qu0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xo0(3));
                                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                                c2Var.show();
                                                c2Var.h();
                                                break;
                                            case 1:
                                                qu0 qu0Var2 = this;
                                                qu0Var2.getClass();
                                                qu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                qu0 qu0Var3 = this;
                                                qu0Var3.getClass();
                                                qu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                qu0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final int i16 = 2;
                                I.c(R.drawable.chats_pin, LocaleController.getString(R.string.StoriesAlbumMenuPin), new Runnable() { // from class: org.telegram.ui.Components.pq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                qu0 qu0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qu0Var.getContext(), 0, qu0Var.B1);
                                                alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new uq0(qu0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xo0(3));
                                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                                c2Var.show();
                                                c2Var.h();
                                                break;
                                            case 1:
                                                qu0 qu0Var2 = this;
                                                qu0Var2.getClass();
                                                qu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                qu0 qu0Var3 = this;
                                                qu0Var3.getClass();
                                                qu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                qu0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        I.c(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable() { // from class: org.telegram.ui.Components.pq0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        qu0 qu0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qu0Var.getContext(), 0, qu0Var.B1);
                                        alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new uq0(qu0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xo0(3));
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                        c2Var.show();
                                        c2Var.h();
                                        break;
                                    case 1:
                                        qu0 qu0Var2 = this;
                                        qu0Var2.getClass();
                                        qu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                        break;
                                    case 2:
                                        qu0 qu0Var3 = this;
                                        qu0Var3.getClass();
                                        qu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                        break;
                                    default:
                                        qu0.h(this, storyItem);
                                        break;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.Components.pq0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    qu0 qu0Var = this;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qu0Var.getContext(), 0, qu0Var.B1);
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                    alertDialog$Builder.a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new uq0(qu0Var, storyItem));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xo0(3));
                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                    c2Var.show();
                                    c2Var.h();
                                    break;
                                case 1:
                                    qu0 qu0Var2 = this;
                                    qu0Var2.getClass();
                                    qu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                    break;
                                case 2:
                                    qu0 qu0Var3 = this;
                                    qu0Var3.getClass();
                                    qu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                    break;
                                default:
                                    qu0.h(this, storyItem);
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

    public final void I() {
        float abs;
        it0[] it0VarArr = this.g0;
        it0 it0Var = it0VarArr[0];
        if (it0Var == null || it0VarArr[1] == null) {
            return;
        }
        float f9 = 0.0f;
        kr0 kr0Var = this.S;
        if (kr0Var != null) {
            char c3 = (!p0(it0Var.B) || it0VarArr[0].B == 9) ? (char) 0 : (char) 1;
            if (c3 == (it0VarArr[1].getVisibility() == 0 ? (!p0(it0VarArr[1].B) || it0VarArr[1].B == 9) ? (char) 0 : (char) 1 : c3)) {
                abs = c3 != 0 ? 1.0f : 0.0f;
                kr0Var.setTranslationX(c3 != 0 ? 0.0f : it0VarArr[0].getMeasuredWidth());
            } else {
                kr0Var.setTranslationX(it0VarArr[c3 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(kr0Var.getTranslationX()) / kr0Var.getMeasuredWidth());
            }
            float f10 = 0.0f;
            for (int i10 = 0; i10 < it0VarArr.length; i10++) {
                if (it0VarArr[i10].getVisibility() == 0) {
                    or0 or0Var = it0VarArr[i10].h;
                    View childAt = or0Var.getChildCount() == 0 ? null : or0Var.getChildAt(0);
                    f10 += Utilities.clamp01(1.0f - (it0VarArr[i10].getTranslationX() / it0VarArr[i10].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - or0Var.getPaddingTop() : or0Var.getChildCount() == 0 ? 0.0f : -AndroidUtilities.dp(48.0f));
                }
            }
            float clamp01 = Utilities.clamp01(1.0f - ((-f10) / AndroidUtilities.dpf2(48.0f)));
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
            kr0Var.setAlpha(clamp01);
            kr0Var.setScaleX(lerp);
            kr0Var.setScaleY(lerp);
            kr0Var.setTranslationY(this.G1 + f10);
            f9 = abs;
        }
        K();
        if (this.Q1 != f9) {
            this.Q1 = f9;
            o0();
            invalidate();
        }
    }

    public boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J() {
        AnimatorSet animatorSet;
        if (!this.c1) {
            return false;
        }
        boolean z10 = this.e1;
        it0[] it0VarArr = this.g0;
        if (!z10) {
            if (Math.abs(it0VarArr[1].getTranslationX()) < 1.0f) {
                it0VarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.d1 ? -1 : 1));
                it0VarArr[1].setTranslationX(0.0f);
                animatorSet = this.b1;
                if (animatorSet != null) {
                }
                this.c1 = false;
            }
            M0(getTabProgress());
            return this.c1;
        }
        if (Math.abs(it0VarArr[0].getTranslationX()) < 1.0f) {
            it0VarArr[0].setTranslationX(0.0f);
            it0VarArr[1].setTranslationX(it0VarArr[0].getMeasuredWidth() * (this.d1 ? 1 : -1));
            animatorSet = this.b1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.b1 = null;
            }
            this.c1 = false;
        }
        M0(getTabProgress());
        return this.c1;
    }

    public final void J0(float f9) {
        it0[] it0VarArr = this.g0;
        if (f9 != 1.0f || it0VarArr[1].getVisibility() == 0) {
            if (this.d1) {
                it0VarArr[0].setTranslationX((-f9) * r3.getMeasuredWidth());
                it0VarArr[1].setTranslationX(it0VarArr[0].getMeasuredWidth() - (it0VarArr[0].getMeasuredWidth() * f9));
            } else {
                it0VarArr[0].setTranslationX(r3.getMeasuredWidth() * f9);
                it0VarArr[1].setTranslationX((it0VarArr[0].getMeasuredWidth() * f9) - it0VarArr[0].getMeasuredWidth());
            }
            M0(getTabProgress());
            float a02 = a0(f9);
            this.l0 = a02;
            this.n0.setVisibility((a02 == 0.0f || !D() || q0()) ? 4 : 0);
            org.telegram.ui.ActionBar.w0 w0Var = this.j0;
            if (w0Var == null || D()) {
                this.k0 = b0(f9);
                t1();
            } else {
                w0Var.setVisibility(v0() ? 8 : 4);
                this.k0 = 0.0f;
            }
            q1(false);
            if (f9 == 1.0f) {
                it0 it0Var = it0VarArr[0];
                it0VarArr[0] = it0VarArr[1];
                it0VarArr[1] = it0Var;
                it0Var.setVisibility(8);
                if (w0Var != null && this.t0 == 2) {
                    w0Var.setVisibility(v0() ? 8 : 4);
                }
                this.t0 = 0;
                f1();
            }
        }
    }

    public final void K() {
        fs fsVar = this.L0;
        if (fsVar != null) {
            kr0 kr0Var = this.S;
            float f9 = 0.0f;
            if (kr0Var != null) {
                f9 = 0.0f + (kr0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(kr0Var.getTranslationX() / kr0Var.getMeasuredWidth())));
            }
            fsVar.setTranslationY(this.G1 + f9);
        }
    }

    public final boolean L(boolean z10) {
        SparseArray[] sparseArrayArr;
        if (!this.y1) {
            return false;
        }
        int i10 = 1;
        while (true) {
            sparseArrayArr = this.V0;
            if (i10 < 0) {
                break;
            }
            sparseArrayArr[i10].clear();
            i10--;
        }
        this.W0 = 0;
        D0(sparseArrayArr[0]);
        fr0 fr0Var = this.Q;
        if (fr0Var != null) {
            fr0Var.h();
            fr0Var.j();
        }
        b1(false);
        r1(z10);
        zt0 zt0Var = this.N;
        if (zt0Var != null) {
            zt0Var.w.clear();
        }
        return true;
    }

    public void L0() {
        boolean z10 = v0() || q0();
        lu0 lu0Var = this.a0.w;
        if (lu0Var != null) {
            lu0Var.b(z10 && getClosestTab() == 9);
        }
        lu0 lu0Var2 = this.V.w;
        if (lu0Var2 != null) {
            lu0Var2.b(z10 && getClosestTab() == 8);
        }
        for (pu0 pu0Var : this.U1.values()) {
            ou0 ou0Var = pu0Var.c;
            if (ou0Var.s != null) {
                ou0Var.w.b(z10 && getClosestTab() == pu0Var.a);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.j0;
        if (w0Var != null) {
            cs0 cs0Var = this.F0;
            w0Var.setSearchFieldHint(LocaleController.getString((cs0Var != null && cs0Var.a() && getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
        I();
    }

    public void M0(float f9) {
        E0();
    }

    public boolean N() {
        return this instanceof w30;
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x4 = (-view.getX()) - getX();
        it0[] it0VarArr = this.g0;
        motionEvent.offsetLocation(x4 - it0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - it0VarArr[0].getY()) - it0VarArr[0].h.getFastScroll().getY());
        return it0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void O0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10) {
        new org.telegram.ui.q61(o2Var, j10, this.i1[1], new pc(this, j10, i10)).show();
    }

    public void P(Canvas canvas, float f9, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void P0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10) {
        c5.v0(o2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j10))), LocaleController.getString(R.string.Delete), true, new jh.z8(this, j10, i10, 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            it0[] it0VarArr = this.g0;
            if (i10 >= it0VarArr.length) {
                return;
            }
            it0 it0Var = it0VarArr[i10];
            if (it0Var != null && it0Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < it0VarArr[i10].h.getChildCount(); i11++) {
                    View childAt = it0VarArr[i10].h.getChildAt(i11);
                    if (childAt.getY() < AndroidUtilities.dp(100.0f) + it0VarArr[i10].h.T2) {
                        int save = canvas.save();
                        canvas.translate(childAt.getX() + it0VarArr[i10].getX(), childAt.getY() + it0VarArr[i10].h.getY() + it0VarArr[i10].getY() + getY());
                        childAt.draw(canvas);
                        if (arrayList != null && (childAt instanceof ev0)) {
                            arrayList.add((ev0) childAt);
                        }
                        canvas.restoreToCount(save);
                    }
                }
            }
            i10++;
        }
    }

    public final void Q0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10) {
        String w10 = getStoriesController().w(i10, j10);
        Context context = o2Var.getContext();
        org.telegram.ui.ActionBar.c6 resourceProvider = o2Var.getResourceProvider();
        k3.e eVar = new k3.e(this, j10, i10);
        Pattern pattern = c5.a;
        c5.R(context, o2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w10, 12, LocaleController.getString(R.string.Rename), resourceProvider, eVar);
    }

    public final boolean R(int i10) {
        fu0[] fu0VarArr = this.q1.n;
        if (fu0VarArr == null) {
            return false;
        }
        fu0[] fu0VarArr2 = this.p1;
        if (i10 == 0) {
            fu0 fu0Var = fu0VarArr2[i10];
            if (!fu0Var.h) {
                int[] iArr = fu0Var.f;
                int[] iArr2 = fu0VarArr[i10].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = fu0VarArr2[i10].f;
            int[] iArr4 = fu0VarArr[i10].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        fu0VarArr2[i10].a.addAll(fu0VarArr[i10].a);
        fu0VarArr2[i10].c.addAll(fu0VarArr[i10].c);
        for (Map.Entry entry : fu0VarArr[i10].d.entrySet()) {
            fu0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            fu0VarArr2[i10].b[i11] = fu0VarArr[i10].b[i11].clone();
            fu0 fu0Var2 = fu0VarArr2[i10];
            int[] iArr5 = fu0Var2.j;
            fu0 fu0Var3 = fu0VarArr[i10];
            iArr5[i11] = fu0Var3.j[i11];
            fu0Var2.i[i11] = fu0Var3.i[i11];
        }
        fu0VarArr2[i10].e.addAll(fu0VarArr[i10].e);
        return !fu0VarArr[i10].a.isEmpty();
    }

    public final void R0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.o2 o2Var = this.r1;
        if (shouldShowUrlInAlert) {
            c5.q0(o2Var, str, true, true);
        } else {
            ye.d.s(o2Var.getParentActivity(), str);
        }
    }

    public final void S(int i10, jl0 jl0Var, boolean z10) {
        ArrayList arrayList = this.p1[i10].e;
        int L0 = ((f2.j0) jl0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            nt0 nt0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (L0 <= ((nt0) arrayList.get(i11)).b) {
                        nt0Var = (nt0) arrayList.get(i11);
                        break;
                    }
                    i11++;
                }
                if (nt0Var == null) {
                    nt0Var = (nt0) j7.l1.i(1, arrayList);
                }
            }
            if (nt0Var != null) {
                y0(i10, nt0Var.d, nt0Var.b + 1, z10);
            }
        }
    }

    public int S0() {
        return -1;
    }

    public final void T() {
        it0[] it0VarArr;
        it0 it0Var;
        int i10;
        f2.p0 adapter;
        if (this.k1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                it0VarArr = this.g0;
                if (i12 >= it0VarArr.length) {
                    it0Var = null;
                    break;
                }
                it0Var = it0VarArr[i12];
                if (it0Var.B == this.l1) {
                    break;
                } else {
                    i12++;
                }
            }
            if (it0Var != null) {
                boolean p02 = p0(it0Var.B);
                float f9 = this.j1;
                fu0[] fu0VarArr = this.p1;
                if (f9 != 1.0f) {
                    if (f9 == 0.0f) {
                        this.k1 = false;
                        if (this.l1 == 0) {
                            fu0VarArr[0].g(false);
                        }
                        it0Var.r.setVisibility(8);
                        it0Var.h.invalidate();
                        return;
                    }
                    boolean z10 = f9 > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, z10 ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new es0(this, it0Var, i11));
                    ofFloat.addListener(new org.telegram.ui.vi(this, z10, p02 ? 1 : 0, it0Var));
                    ofFloat.setInterpolator(jr.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.k1 = false;
                int i13 = this.m1;
                int[] iArr = this.i1;
                iArr[p02 ? 1 : 0] = i13;
                if (!p02) {
                    SharedConfig.setMediaColumnsCount(i13);
                } else if (c0(it0Var.B) >= 5) {
                    SharedConfig.setStoriesColumnsCount(this.m1);
                }
                for (int i14 = 0; i14 < it0VarArr.length; i14++) {
                    it0 it0Var2 = it0VarArr[i14];
                    if (it0Var2 != null && it0Var2.h != null && (((i10 = it0Var2.B) == 0 || p0(i10)) && (adapter = it0VarArr[i14].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i14 == 0) {
                            fu0VarArr[0].g(false);
                        }
                        it0VarArr[i14].r.setVisibility(8);
                        it0VarArr[i14].x.y1(iArr[p02 ? 1 : 0]);
                        it0VarArr[i14].h.a0();
                        it0VarArr[i14].h.invalidate();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(it0VarArr[i14].h);
                        } else {
                            adapter.l();
                        }
                    }
                }
                if (this.s < 0) {
                    X0();
                    return;
                }
                while (i11 < it0VarArr.length) {
                    it0 it0Var3 = it0VarArr[i11];
                    if (it0Var3.B == this.l1) {
                        View m10 = it0Var3.s.m(this.s);
                        if (m10 != null) {
                            this.v = m10.getTop();
                        }
                        it0 it0Var4 = it0VarArr[i11];
                        it0Var4.x.h1(this.s, (-it0Var4.h.getPaddingTop()) + this.v);
                    }
                    i11++;
                }
            }
        }
    }

    public final void T0(ArrayList arrayList, boolean z10) {
        xs0 xs0Var = this.V;
        if (xs0Var == null || xs0Var.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.r1;
        if (z10 && arrayList.size() > o2Var.getMessagesController().storiesPinnedToTopCountMax) {
            tc.a0(o2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", o2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            return;
        }
        lh.k6 k6Var = xs0Var.s;
        int i10 = k6Var.c;
        ArrayList arrayList2 = k6Var.g;
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
                k6Var.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(k6Var.d);
                ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new lh.o5(2));
            }
            z11 = z12;
        }
        if (z11) {
            tc.a0(o2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", o2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
        } else if (z10) {
            tc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
        } else {
            tc.a0(o2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
        }
    }

    public final void U(int i10) {
        ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 0) {
            if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                this.w0.setTextSize(20);
            } else {
                this.w0.setTextSize(18);
            }
        }
        if (i10 == 0) {
            this.D.l();
        }
    }

    public final boolean U0(MotionEvent motionEvent, boolean z10) {
        it0 it0Var;
        fr0 fr0Var;
        int closestTab = getClosestTab();
        fs0 fs0Var = this.E0;
        int i10 = -1;
        int i11 = fs0Var.K.get(fs0Var.n + (z10 ? 1 : -1), -1);
        kr0 kr0Var = this.S;
        if (kr0Var != null) {
            if (w0(closestTab) || closestTab == 8) {
                y71 y71Var = kr0Var.n;
                i10 = y71Var.U.get(y71Var.B + (z10 ? 1 : -1), -1);
            } else if (w0(i11) || i11 == 8) {
                i10 = kr0Var.getCurrentAlbumId();
            }
            if (i10 == 0) {
                i11 = 8;
            } else if (i10 > 0) {
                i11 = i1(i10).a;
            }
        }
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.w0 w0Var = this.j0;
            if (w0Var == null || D()) {
                this.k0 = b0(0.0f);
                s1(0.0f);
            } else {
                w0Var.setVisibility(v0() ? 8 : 4);
                this.k0 = 0.0f;
            }
            if ((!this.R0 || getSelectedTab() != 11) && (!C() || !this.y1 || (getClosestTab() != 8 && !w0(getClosestTab())))) {
                it0[] it0VarArr = this.g0;
                it0 it0Var2 = it0VarArr[0];
                if (it0Var2 != null && it0Var2.B == 13 && (fr0Var = this.Q) != null) {
                    mh.a aVar = fr0Var.n;
                    if (!z10) {
                    }
                }
                it0 it0Var3 = it0VarArr[0];
                gr0 gr0Var = this.R;
                if (it0Var3 != null && it0Var3.B == 14 && gr0Var != null) {
                    ih.r2 r2Var = gr0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.y1 || (it0Var = it0VarArr[0]) == null || it0Var.B != 13) && ((gr0Var == null || !gr0Var.g()) && (kr0Var == null || !kr0Var.w))) {
                    q1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    k0();
                    this.u1 = false;
                    this.t1 = true;
                    N0(true);
                    this.v1 = (int) motionEvent.getX();
                    this.C.setEnabled(false);
                    fs0Var.setEnabled(false);
                    it0 it0Var4 = it0VarArr[1];
                    it0Var4.B = i11;
                    it0Var4.setVisibility(0);
                    this.d1 = z10;
                    m1(true);
                    if (z10) {
                        it0VarArr[1].setTranslationX(it0VarArr[0].getMeasuredWidth());
                    } else {
                        it0VarArr[1].setTranslationX(-it0VarArr[0].getMeasuredWidth());
                    }
                    M0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final String V(boolean z10) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        fr0 fr0Var;
        if (!r0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (fr0Var = this.Q) != null) {
            return fr0Var.getBotPreviewsSubtitle();
        }
        xs0 xs0Var = this.V;
        if (xs0Var == null || xs0Var.s == null) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < xs0Var.s.i.size(); i12++) {
                MessageObject messageObject = (MessageObject) xs0Var.s.i.get(i12);
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

    public final it0 W(int i10) {
        int i11 = 0;
        while (true) {
            it0[] it0VarArr = this.g0;
            if (i11 >= it0VarArr.length) {
                return null;
            }
            it0 it0Var = it0VarArr[i11];
            if (it0Var != null && it0Var.B == i10) {
                return it0Var;
            }
            i11++;
        }
    }

    public final void W0(f2.p0 p0Var) {
        if (p0Var instanceof ku0) {
            ArrayList arrayList = this.A0;
            ArrayList arrayList2 = this.B0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (p0Var == this.I) {
            ArrayList arrayList3 = this.C0;
            ArrayList arrayList4 = this.D0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        wt0 wt0Var = this.J;
        if (p0Var == wt0Var) {
            wt0Var.r = null;
        }
    }

    public final int X(int i10, int i11, boolean z10) {
        int i12 = i11 + (!z10 ? 1 : -1);
        if (i12 > 6) {
            i12 = !z10 ? 9 : 6;
        }
        return Utilities.clamp(i12, 9, (this.g1 && i10 == 1) ? 1 : 2);
    }

    public final void X0() {
        int i10;
        int i11 = 0;
        while (true) {
            it0[] it0VarArr = this.g0;
            if (i11 >= it0VarArr.length) {
                return;
            }
            or0 or0Var = it0VarArr[i11].h;
            if (or0Var != null) {
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < or0Var.getChildCount(); i14++) {
                    View childAt = or0Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.p7) {
                        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                        int messageId = p7Var.getMessageId();
                        i13 = p7Var.getTop();
                        i12 = messageId;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.g7) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                        int id2 = g7Var.getMessage().getId();
                        i13 = g7Var.getTop();
                        i12 = id2;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.f7) {
                        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                        i12 = f7Var.getMessage().getId();
                        i13 = f7Var.getTop();
                    }
                    if (i12 != 0) {
                        break;
                    }
                }
                if (i12 != 0) {
                    int i15 = it0VarArr[i11].B;
                    int i16 = -1;
                    if (p0(i15)) {
                        nu0 k12 = k1(i15);
                        if (k12 != null && k12.s != null) {
                            int i17 = 0;
                            while (true) {
                                if (i17 >= k12.s.i.size()) {
                                    break;
                                }
                                if (i12 == ((MessageObject) k12.s.i.get(i17)).getId()) {
                                    i16 = i17;
                                    break;
                                }
                                i17++;
                            }
                        }
                        i10 = i16;
                    } else if (i15 >= 0) {
                        fu0[] fu0VarArr = this.p1;
                        if (i15 < fu0VarArr.length) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= fu0VarArr[i15].a.size()) {
                                    break;
                                }
                                if (i12 == ((MessageObject) fu0VarArr[i15].a.get(i18)).getId()) {
                                    i16 = i18;
                                    break;
                                }
                                i18++;
                            }
                            i10 = fu0VarArr[i15].m + i16;
                        }
                    }
                    if (i16 >= 0) {
                        ((f2.j0) or0Var.getLayoutManager()).h1(i10, (-it0VarArr[i11].h.getPaddingTop()) + i13);
                        if (this.k1) {
                            it0 it0Var = it0VarArr[i11];
                            it0Var.s.h1(i10, (-it0Var.h.getPaddingTop()) + i13);
                        }
                    }
                }
            }
            i11++;
        }
    }

    public final int Y(boolean z10) {
        return this.T1 + (z10 ? AndroidUtilities.dp(52.0f) : 0);
    }

    public final void Y0(int i10) {
        fs0 fs0Var;
        if (this.H1 || (fs0Var = this.E0) == null) {
            return;
        }
        fs0Var.h(null, i10, fs0Var.L.get(i10));
    }

    public final int Z(int i10) {
        int dp = AndroidUtilities.dp(54.0f) + this.X1;
        kr0 kr0Var = this.S;
        return dp + ((int) ((kr0Var == null || !(w0(i10) || i10 == 8)) ? 0.0f : kr0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f))) + (i10 == 9 ? AndroidUtilities.dp(64.0f) : 0);
    }

    public final void Z0(float f9, int i10) {
        fs0 fs0Var = this.E0;
        if (fs0Var != null) {
            fs0Var.j(f9, w0(i10) ? 8 : i10);
        }
        kr0 kr0Var = this.S;
        if (kr0Var != null) {
            y71 y71Var = kr0Var.n;
            if (w0(i10)) {
                y71Var.f(f9, h1(i10));
            } else if (i10 == 8) {
                y71Var.f(f9, 0);
            }
        }
    }

    public final float a0(float f9) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f10 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        it0[] it0VarArr = this.g0;
        it0 it0Var = it0VarArr[1];
        gr0 gr0Var = this.R;
        if (it0Var != null && ((i12 = it0Var.B) == 0 || (((i12 == 8 || w0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = it0VarArr[1].B) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && gr0Var != null)))) {
            f10 = 0.0f + f9;
        }
        it0 it0Var2 = it0VarArr[0];
        return (it0Var2 == null || !((i10 = it0Var2.B) == 0 || (((i10 == 8 || w0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = it0VarArr[0].B) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && gr0Var != null)))) ? f10 : (1.0f - f9) + f10;
    }

    public final void a1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            it0[] it0VarArr = this.g0;
            if (i10 >= it0VarArr.length) {
                if (this.B == 0) {
                    zs0 zs0Var = this.T;
                    zs0Var.d = chatFull;
                    zs0Var.e = arrayList;
                }
                v1(true);
                for (int i11 = 0; i11 < it0VarArr.length; i11++) {
                    it0 it0Var = it0VarArr[i11];
                    if (it0Var.B == 7 && it0Var.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(it0VarArr[i11].h);
                    }
                }
                return;
            }
            it0 it0Var2 = it0VarArr[i10];
            if (it0Var2.B == 7 && it0Var2.h.getAdapter() != null && it0VarArr[i10].h.getAdapter().h() != 0 && this.r1.getMessagesController().getStoriesController().j.size() > 0) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Cells.l2
    public final boolean b() {
        return false;
    }

    public final float b0(float f9) {
        float f10 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        it0[] it0VarArr = this.g0;
        it0 it0Var = it0VarArr[1];
        if (it0Var != null && s0(it0Var.B) && it0VarArr[1].B != 11) {
            f10 = 0.0f + f9;
        }
        it0 it0Var2 = it0VarArr[0];
        return (it0Var2 == null || !s0(it0Var2.B) || it0VarArr[0].B == 11) ? f10 : (1.0f - f9) + f10;
    }

    public void b1(boolean z10) {
        if (this.y1 == z10) {
            return;
        }
        this.y1 = z10;
        AnimatorSet animatorSet = this.J1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ea eaVar = this.x0;
        if (z10) {
            eaVar.setVisibility(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.J1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(eaVar, (Property<ea, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.J1.setDuration(180L);
        this.J1.addListener(new z9(19, this, z10));
        this.J1.start();
        if (z10) {
            u1();
        }
    }

    public final int c0(int i10) {
        nu0 k12;
        lh.k6 k6Var;
        if (!p0(i10) || (k12 = k1(i10)) == null || (k6Var = k12.s) == null) {
            return 0;
        }
        return k6Var.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(int i10, boolean z10) {
        int i11;
        it0 W;
        if (z10 && getY() != 0.0f && this.A == 1) {
            return;
        }
        if (z10 && p0(i10) && c0(i10) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f1);
        bundle.putLong("topic_id", this.B);
        fu0[] fu0VarArr = this.p1;
        if (z10 && (W = W(0)) != null) {
            ArrayList arrayList = fu0VarArr[0].e;
            int L0 = W.x.L0();
            if (L0 >= 0) {
                nt0 nt0Var = null;
                if (arrayList != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        if (L0 <= ((nt0) arrayList.get(i12)).b) {
                            nt0Var = (nt0) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (nt0Var == null) {
                        nt0Var = (nt0) j7.l1.i(1, arrayList);
                    }
                }
                if (nt0Var != null) {
                    i11 = nt0Var.c;
                    if (i10 != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i10 == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    org.telegram.ui.f8 f8Var = new org.telegram.ui.f8(fu0VarArr[0].q, i11, bundle);
                    f8Var.I = new o1.a(this, 11);
                    this.r1.presentFragment(f8Var);
                }
            }
        }
        i11 = 0;
        if (i10 != 9) {
        }
        org.telegram.ui.f8 f8Var2 = new org.telegram.ui.f8(fu0VarArr[0].q, i11, bundle);
        f8Var2.I = new o1.a(this, 11);
        this.r1.presentFragment(f8Var2);
    }

    public final void d1(int i10) {
        int h12 = h1(getClosestTab());
        kr0 kr0Var = this.S;
        if (h12 != i10) {
            if (kr0Var != null) {
                kr0Var.n.d(i10, kr0Var.s.i(i10));
                return;
            }
            return;
        }
        kr0Var.setReorderingAlbums(true);
        pu0 i12 = i1(i10);
        it0 W = W(i12.a);
        if (W == null) {
            return;
        }
        or0 or0Var = W.h;
        for (int i11 = 0; i11 < or0Var.getChildCount(); i11++) {
            View childAt = or0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.p7) {
                ((org.telegram.ui.Cells.p7) childAt).l(true, true);
            }
        }
        ou0 ou0Var = i12.c;
        if (ou0Var != null && !ou0Var.x) {
            ou0Var.x = true;
        }
        q1(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x048d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v34 */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        or0 or0Var;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i12;
        f2.p0 p0Var;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        int size;
        int i15;
        boolean z12;
        or0 or0Var2;
        int i16;
        int i17;
        or0 or0Var3;
        int i18 = NotificationCenter.mediaDidLoad;
        f2.p0 p0Var2 = this.K;
        f2.p0 p0Var3 = this.I;
        eu0 eu0Var = this.F;
        f2.p0 p0Var4 = this.H;
        f2.p0 p0Var5 = this.G;
        org.telegram.ui.ActionBar.o2 o2Var = this.r1;
        wt0 wt0Var = this.J;
        us0 us0Var = this.D;
        long j10 = this.f1;
        it0[] it0VarArr = this.g0;
        fu0[] fu0VarArr = this.p1;
        if (i10 == i18) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != o2Var.getClassGuid() || intValue2 != fu0VarArr[intValue3].p) {
                if (this.q1 == null || !fu0VarArr[intValue3].a.isEmpty() || fu0VarArr[intValue3].o || !R(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    p0Var2 = us0Var;
                } else if (intValue3 == 1) {
                    p0Var2 = p0Var5;
                } else if (intValue3 == 2) {
                    p0Var2 = p0Var4;
                } else if (intValue3 == 3) {
                    p0Var2 = eu0Var;
                } else if (intValue3 == 4) {
                    p0Var2 = p0Var3;
                } else if (intValue3 != 5) {
                    p0Var2 = intValue3 == 15 ? wt0Var : null;
                }
                if (p0Var2 != null) {
                    for (int i19 = 0; i19 < it0VarArr.length; i19++) {
                        it0 it0Var = it0VarArr[i19];
                        if (it0Var != null && (or0Var2 = it0Var.h) != null && or0Var2.getAdapter() == p0Var2) {
                            it0VarArr[i19].h.B0();
                        }
                    }
                    p0Var2.l();
                }
                this.X0 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j10);
            int i20 = longValue == j10 ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                fu0VarArr[intValue3].f[i20] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i16 = intValue3;
                p0Var2 = us0Var;
            } else if (intValue3 == 1) {
                i16 = intValue3;
                p0Var2 = p0Var5;
            } else if (intValue3 == 2) {
                i16 = intValue3;
                p0Var2 = p0Var4;
            } else if (intValue3 == 3) {
                i16 = intValue3;
                p0Var2 = eu0Var;
            } else if (intValue3 == 4) {
                i16 = intValue3;
                p0Var2 = p0Var3;
            } else if (intValue3 == 5) {
                i16 = intValue3;
            } else if (intValue3 == 15) {
                p0Var2 = wt0Var;
                i16 = 8;
            } else {
                i16 = intValue3;
                p0Var2 = null;
            }
            int size2 = fu0VarArr[i16].a.size();
            if (p0Var2 != null) {
                i17 = p0Var2.h();
                if (p0Var2 instanceof fl0) {
                    ((fl0) p0Var2).L();
                }
            } else {
                i17 = 0;
            }
            fu0VarArr[i16].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size3);
                    if (fu0VarArr[i16].a(messageObject2, i20, r13, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject2.getId(), r13);
                        fu0 fu0Var = fu0VarArr[i16];
                        int i21 = fu0Var.m - r13;
                        fu0Var.m = i21;
                        if (i21 < 0) {
                            fu0Var.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                fu0VarArr[i16].l = ((Boolean) objArr[5]).booleanValue();
                fu0 fu0Var2 = fu0VarArr[i16];
                if (fu0Var2.l) {
                    fu0Var2.m = 0;
                }
            } else {
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i22);
                    if (fu0VarArr[i16].a(messageObject3, i20, false, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject3.getId(), true);
                        fu0 fu0Var3 = fu0VarArr[i16];
                        int i23 = fu0Var3.n - 1;
                        fu0Var3.n = i23;
                        if (i23 < 0) {
                            fu0Var3.n = 0;
                        }
                    }
                }
                fu0 fu0Var4 = fu0VarArr[i16];
                if (fu0Var4.o && fu0Var4.a.size() > 0) {
                    fu0 fu0Var5 = fu0VarArr[i16];
                    fu0Var5.k = ((MessageObject) fu0Var5.a.get(0)).getId();
                }
                fu0VarArr[i16].i[i20] = ((Boolean) objArr[5]).booleanValue();
                fu0 fu0Var6 = fu0VarArr[i16];
                if (fu0Var6.i[i20]) {
                    int size4 = fu0Var6.b[i20].size();
                    if (i20 == 0) {
                        size4 += fu0VarArr[i16].m;
                    }
                    fu0VarArr[i16].f[i20] = size4;
                }
            }
            if (!booleanValue && i20 == 0) {
                fu0 fu0Var7 = fu0VarArr[i16];
                if (fu0Var7.i[i20] && this.Y0 != 0) {
                    fu0Var7.g = true;
                    o2Var.getMediaDataController().loadMedia(this.Y0, 50, fu0VarArr[i16].j[1], 0, i16, this.B, 1, o2Var.getClassGuid(), fu0VarArr[i16].p, null, null);
                }
            }
            int i24 = i16;
            if (p0Var2 != null) {
                ht0 ht0Var = null;
                for (int i25 = 0; i25 < it0VarArr.length; i25++) {
                    it0 it0Var2 = it0VarArr[i25];
                    if (it0Var2 != null && (or0Var3 = it0Var2.h) != null && or0Var3.getAdapter() == p0Var2) {
                        ht0 ht0Var2 = it0VarArr[i25].h;
                        ht0Var2.B0();
                        ht0Var = ht0Var2;
                    }
                }
                int h = p0Var2.h();
                if (p0Var2 != us0Var) {
                    try {
                        p0Var2.l();
                    } catch (Throwable unused) {
                    }
                } else if (us0Var.h() == i17) {
                    AndroidUtilities.updateVisibleRows(ht0Var);
                } else {
                    us0Var.l();
                }
                if (!fu0VarArr[i24].a.isEmpty() || fu0VarArr[i24].g) {
                    if (ht0Var != null && (p0Var2 == us0Var || h >= i17)) {
                        z(ht0Var, i17, sparseBooleanArray);
                    }
                } else if (ht0Var != null) {
                    z(ht0Var, i17, sparseBooleanArray);
                }
                if (ht0Var != null && !fu0VarArr[i24].o) {
                    if (size2 == 0) {
                        for (int i26 = 0; i26 < 2; i26++) {
                            if (it0VarArr[i26].B == 0) {
                                ((f2.j0) ht0Var.getLayoutManager()).h1(us0Var.L(0), 0);
                            }
                        }
                    } else {
                        X0();
                    }
                }
            }
            fu0 fu0Var8 = fu0VarArr[i24];
            if (fu0Var8.o) {
                if (fu0Var8.a.size() == 0) {
                    A0(i24);
                } else {
                    fu0VarArr[i24].o = false;
                }
            }
            this.X0 = true;
            return;
        }
        if (i10 == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat chat = DialogObject.isChatDialog(j10) ? o2Var.getMessagesController().getChat(Long.valueOf(-j10)) : null;
            long longValue2 = ((Long) objArr[1]).longValue();
            if (ChatObject.isChannel(chat)) {
                if (longValue2 == 0 && this.Y0 != 0) {
                    i14 = 1;
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    size = arrayList2.size();
                    int i27 = -1;
                    i15 = 0;
                    z12 = false;
                    while (i15 < size) {
                        us0 us0Var2 = us0Var;
                        int i28 = 0;
                        while (i28 < fu0VarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (fu0VarArr[i28].b(((Integer) arrayList2.get(i15)).intValue(), i14) != null) {
                                i27 = i28;
                                z12 = true;
                            }
                            i28++;
                            arrayList2 = arrayList3;
                        }
                        i15++;
                        us0Var = us0Var2;
                    }
                    us0 us0Var3 = us0Var;
                    if (z12) {
                        this.X0 = true;
                        if (us0Var3 != null) {
                            us0Var3.l();
                        }
                        if (p0Var5 != null) {
                            p0Var5.l();
                        }
                        if (p0Var4 != null) {
                            p0Var4.l();
                        }
                        if (eu0Var != null) {
                            eu0Var.X(false);
                        }
                        if (p0Var3 != null) {
                            p0Var3.l();
                        }
                        if (wt0Var != null) {
                            wt0Var.l();
                        }
                        if (p0Var2 != null) {
                            p0Var2.l();
                        }
                        if (i27 == 0 || i27 == 1 || i27 == 2 || i27 == 4) {
                            z0(true);
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
            us0 us0Var32 = us0Var;
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
                        fu0 fu0Var9 = fu0VarArr[mediaType];
                        if (fu0Var9.l) {
                            z11 = z13;
                            if (fu0Var9.a(messageObject4, messageObject4.getDialogId() == j10 ? 0 : 1, true, isEncryptedDialog2)) {
                                this.T0[mediaType] = 1;
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
                int i30 = 1;
                if (z14) {
                    this.X0 = true;
                    int i31 = 0;
                    while (i31 < it0VarArr.length) {
                        int i32 = it0VarArr[i31].B;
                        if (i32 == 0) {
                            p0Var = us0Var;
                        } else if (i32 == i30) {
                            p0Var = p0Var5;
                        } else if (i32 == 2) {
                            p0Var = p0Var4;
                        } else if (i32 == 3) {
                            p0Var = eu0Var;
                        } else {
                            if (i32 == 4) {
                                p0Var = p0Var3;
                            } else if (i32 == 5) {
                                p0Var = p0Var2;
                            } else {
                                p0Var = i32 == 15 ? wt0Var : null;
                                if (p0Var != null) {
                                    p0Var.h();
                                    us0Var.l();
                                    p0Var5.l();
                                    p0Var4.l();
                                    eu0Var.X(false);
                                    p0Var3.l();
                                    wt0Var.l();
                                    p0Var2.l();
                                }
                                i31++;
                                i30 = 1;
                            }
                            if (p0Var != null) {
                            }
                            i31++;
                            i30 = 1;
                        }
                        if (p0Var != null) {
                        }
                        i31++;
                        i30 = 1;
                    }
                    v1(true);
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
            Long l10 = (Long) objArr[3];
            if (l10.longValue() == j10 || l10.longValue() == this.Y0) {
                int i33 = l10.longValue() == j10 ? 0 : 1;
                for (fu0 fu0Var10 : fu0VarArr) {
                    fu0Var10.f(i33, num.intValue(), num2.intValue());
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
                for (int i34 = 0; i34 < it0VarArr.length; i34++) {
                    int childCount = it0VarArr[i34].h.getChildCount();
                    for (int i35 = 0; i35 < childCount; i35++) {
                        View childAt = it0VarArr[i34].h.getChildAt(i35);
                        if (childAt instanceof org.telegram.ui.Cells.f7) {
                            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                            if (f7Var.getMessage() != null) {
                                f7Var.g(false, true);
                            }
                        }
                    }
                }
                return;
            }
            for (int i36 = 0; i36 < it0VarArr.length; i36++) {
                it0 it0Var3 = it0VarArr[i36];
                if (it0Var3 != null && (or0Var = it0Var3.h) != null) {
                    int childCount2 = or0Var.getChildCount();
                    for (int i37 = 0; i37 < childCount2; i37++) {
                        View childAt2 = it0VarArr[i36].h.getChildAt(i37);
                        if (childAt2 instanceof org.telegram.ui.Cells.f7) {
                            org.telegram.ui.Cells.f7 f7Var2 = (org.telegram.ui.Cells.f7) childAt2;
                            if (f7Var2.getMessage() != null) {
                                f7Var2.g(false, true);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.storiesListUpdated) {
            lh.k6 k6Var = (lh.k6) objArr[0];
            xs0 xs0Var = this.V;
            if (xs0Var == null || k6Var != xs0Var.s) {
                er0 er0Var = this.a0;
                if (er0Var == null || k6Var != er0Var.s) {
                    Iterator it = this.U1.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        pu0 pu0Var = (pu0) it.next();
                        if (pu0Var.c.s == k6Var) {
                            i12 = pu0Var.a;
                            break;
                        }
                    }
                } else {
                    i12 = 9;
                }
            } else {
                i12 = 8;
            }
            it0 W = W(i12);
            if (W != null) {
                if (W.b != (k6Var.g() > 0)) {
                    W.b = k6Var.g() > 0;
                    o1(W, true);
                }
            }
            if (W != null) {
                AndroidUtilities.notifyDataSetChanged(W.h);
                if (W.h.getLayoutManager() instanceof f2.j0) {
                    jl0 jl0Var = W.h;
                    G(W, jl0Var, (f2.j0) jl0Var.getLayoutManager());
                }
            }
            bt0 bt0Var = this.z1;
            if (bt0Var != null) {
                bt0Var.R();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated) {
            for (it0 it0Var4 : it0VarArr) {
                if (it0Var4 != null && it0Var4.h != null && p0(it0Var4.B)) {
                    if (!r0() || it0Var4.h.getAdapter() == null) {
                        for (int i38 = 0; i38 < it0Var4.h.getChildCount(); i38++) {
                            View childAt3 = it0Var4.h.getChildAt(i38);
                            if (childAt3 instanceof org.telegram.ui.Cells.p7) {
                                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt3;
                                n6 n6Var = p7Var.J;
                                if (!p7Var.W || (messageObject = p7Var.n) == null || (storyItem = messageObject.storyItem) == null || (storyViews = storyItem.views) == null) {
                                    p7Var.H = false;
                                    n6Var.q("", false, true);
                                } else {
                                    int i39 = storyViews.views_count;
                                    p7Var.H = i39 > 0;
                                    n6Var.q(AndroidUtilities.formatWholeNumber(i39, 0), true, true);
                                }
                            }
                        }
                    } else {
                        AndroidUtilities.notifyDataSetChanged(it0Var4.h);
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.channelRecommendationsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
                this.M.E(true);
                v1(true);
                F();
                return;
            }
            return;
        }
        int i40 = NotificationCenter.savedMessagesDialogsUpdate;
        zt0 zt0Var = this.N;
        if (i10 == i40) {
            if (j10 == 0 || j10 == o2Var.getUserConfig().getClientUserId()) {
                zt0Var.F(true);
                v1(true);
                F();
                L0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogsNeedReload) {
            zt0Var.F(true);
            return;
        }
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
                v1(true);
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
            zs0 zs0Var = this.T;
            if (zs0Var != null) {
                TLRPC.ChatFull chatFull = zs0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i41 = 0; i41 < zs0Var.d.participants.participants.size(); i41++) {
                        zs0Var.d.participants.participants.get(i41).setRank(longValue4, str);
                    }
                }
                for (it0 it0Var5 : it0VarArr) {
                    if (it0Var5.B == 7) {
                        AndroidUtilities.updateVisibleRows(it0Var5.h);
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
            for (int i42 = 0; i42 < it0VarArr.length; i42++) {
                if (it0VarArr[i42].h.getAdapter() == wt0Var) {
                    or0 or0Var4 = it0VarArr[i42].h;
                    ArrayList arrayList6 = wt0Var.n;
                    for (int i43 = 0; i43 < arrayList6.size(); i43++) {
                        MessageObject messageObject5 = (MessageObject) arrayList6.get(i43);
                        if (messageObject5 != null && messageObject5.getPollId() == longValue5) {
                            TLRPC.MessageMedia messageMedia = messageObject5.messageOwner.media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                if (tL_poll != null) {
                                    tL_messageMediaPoll.poll = tL_poll;
                                }
                                MessageObject.updatePollResults(tL_messageMediaPoll, pollResults);
                                wt0Var.m(i43);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        fs0 fs0Var = this.E0;
        if (fs0Var != null) {
            canvas.save();
            canvas.translate(fs0Var.getX(), fs0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        bs0 bs0Var = this.N0;
        if (bs0Var != null) {
            int i10 = bs0Var.P;
            if ((i10 == 3 || i10 == 1) && this.L0 == null) {
                canvas.save();
                canvas.translate(bs0Var.getX(), bs0Var.getY());
                bs0Var.setDrawOverlay(true);
                bs0Var.draw(canvas);
                bs0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        if (view != this.N0 || this.L0 != null) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        it0[] it0VarArr = this.g0;
        float top = it0VarArr[0].getTop();
        kr0 kr0Var = this.S;
        if (kr0Var != null && ((i10 = it0VarArr[0].B) == 8 || w0(i10))) {
            top -= kr0Var.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Cells.l2
    public final void e(org.telegram.ui.Cells.p2 p2Var) {
        org.telegram.ui.ActionBar.o2 o2Var = this.r1;
        if (o2Var != null && o2Var.getMessagesController().getStoriesController().I(p2Var.getDialogId())) {
            o2Var.getOrCreateStoryViewer().getClass();
            lh.i9 orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
            Context context = o2Var.getContext();
            long dialogId = p2Var.getDialogId();
            lh.b7 a10 = lh.b7.a((jl0) p2Var.getParent());
            a10.s += ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).o1) ? AndroidUtilities.dp(68.0f) : 0;
            orCreateStoryViewer.D(context, dialogId, a10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r1 = r2[r1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1(boolean z10) {
        it0[] it0VarArr;
        it0 it0Var;
        if (this.k1) {
            return;
        }
        int i10 = 0;
        while (true) {
            it0VarArr = this.g0;
            if (i10 >= it0VarArr.length) {
                it0Var = null;
                break;
            }
            int i11 = it0VarArr[i10].B;
            if (i11 == 0 || p0(i11)) {
                break;
            } else {
                i10++;
            }
        }
        if (it0Var != null) {
            int i12 = it0Var.B;
            this.l1 = i12;
            boolean p02 = p0(i12);
            int[] iArr = this.i1;
            int X = X(p02 ? 1 : 0, iArr[p02 ? 1 : 0], z10);
            this.m1 = X;
            if (X != iArr[p02 ? 1 : 0]) {
                if (this.g1 && p0(this.l1)) {
                    return;
                }
                it0Var.r.setVisibility(0);
                if (p0(this.l1)) {
                    it0Var.r.setAdapter(l1(this.l1));
                } else {
                    it0Var.r.setAdapter(this.E);
                }
                ht0 ht0Var = it0Var.r;
                ht0Var.setPadding(ht0Var.getPaddingLeft(), Z(this.l1), it0Var.r.getPaddingRight(), Y(v0()));
                it0Var.s.y1(X);
                it0Var.r.a0();
                it0Var.s.O = new ds0(this, it0Var, 0);
                AndroidUtilities.updateVisibleRows(it0Var.h);
                this.k1 = true;
                if (this.l1 == 0) {
                    this.p1[0].g(true);
                }
                this.j1 = 0.0f;
                if (this.s < 0) {
                    X0();
                    return;
                }
                for (it0 it0Var2 : it0VarArr) {
                    if (it0Var2.B == this.l1) {
                        it0Var2.s.h1(this.s, this.v - it0Var2.r.getPaddingTop());
                    }
                }
            }
        }
    }

    public final float f0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            it0[] it0VarArr = this.g0;
            if (i11 >= it0VarArr.length) {
                break;
            }
            it0 it0Var = it0VarArr[i11];
            if (it0Var != null) {
                int i13 = it0Var.B;
                if ((z10 && i10 == 8 && w0(i13)) || i13 == i10) {
                    i12++;
                    width = it0VarArr[i11].getTranslationX();
                }
            }
            i11++;
        }
        if (i12 == 2) {
            return 0.0f;
        }
        return width;
    }

    public final void f1() {
        int i10 = 0;
        while (true) {
            it0[] it0VarArr = this.g0;
            if (i10 >= it0VarArr.length) {
                return;
            }
            int childCount = it0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = it0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.d2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.d2) childAt).getPhotoImage();
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

    public final float g0(int i10, boolean z10) {
        float f9 = 0.0f;
        int i11 = 0;
        while (true) {
            it0[] it0VarArr = this.g0;
            if (i11 >= it0VarArr.length) {
                return f9;
            }
            it0 it0Var = it0VarArr[i11];
            if (it0Var != null) {
                int i12 = it0Var.B;
                if ((z10 && i10 == 8 && w0(i12)) || i12 == i10) {
                    f9 = (1.0f - Math.abs(it0VarArr[i11].getTranslationX() / getWidth())) + f9;
                }
            }
            i11++;
        }
    }

    public final void g1(MotionEvent motionEvent) {
        float f9;
        float f10;
        float measuredWidth;
        VelocityTracker velocityTracker = this.x1;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.O0);
        int i10 = 1;
        if (motionEvent == null || motionEvent.getAction() == 3) {
            f9 = 0.0f;
            f10 = 0.0f;
        } else {
            f9 = this.x1.getXVelocity();
            f10 = this.x1.getYVelocity();
            if (!this.t1 && Math.abs(f9) >= 3000.0f && Math.abs(f9) > Math.abs(f10)) {
                U0(motionEvent, f9 < 0.0f);
            }
        }
        if (this.t1) {
            it0[] it0VarArr = this.g0;
            float x4 = it0VarArr[0].getX();
            this.b1 = new AnimatorSet();
            this.e1 = Math.abs(x4) < ((float) it0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f9) < 3500.0f || Math.abs(f9) < Math.abs(f10));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new d70(this, 19));
            boolean z10 = this.e1;
            Property property = View.TRANSLATION_X;
            if (z10) {
                measuredWidth = Math.abs(x4);
                if (this.d1) {
                    this.b1.playTogether(ObjectAnimator.ofFloat(it0VarArr[0], (Property<it0, Float>) property, 0.0f), ObjectAnimator.ofFloat(it0VarArr[1], (Property<it0, Float>) property, r14.getMeasuredWidth()), ofFloat);
                } else {
                    this.b1.playTogether(ObjectAnimator.ofFloat(it0VarArr[0], (Property<it0, Float>) property, 0.0f), ObjectAnimator.ofFloat(it0VarArr[1], (Property<it0, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = it0VarArr[0].getMeasuredWidth() - Math.abs(x4);
                if (this.d1) {
                    this.b1.playTogether(ObjectAnimator.ofFloat(it0VarArr[0], (Property<it0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(it0VarArr[1], (Property<it0, Float>) property, 0.0f), ofFloat);
                } else {
                    this.b1.playTogether(ObjectAnimator.ofFloat(it0VarArr[0], (Property<it0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(it0VarArr[1], (Property<it0, Float>) property, 0.0f), ofFloat);
                }
            }
            this.b1.setInterpolator(a2);
            int measuredWidth2 = getMeasuredWidth();
            float f11 = measuredWidth2 / 2;
            float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
            this.b1.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f9) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r0) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.b1.addListener(new is0(this, i10));
            this.b1.start();
            this.c1 = true;
            this.t1 = false;
            L0();
        } else {
            this.u1 = false;
            this.C.setEnabled(true);
            this.E0.setEnabled(true);
        }
        VelocityTracker velocityTracker2 = this.x1;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.x1 = null;
        }
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.V0[0];
    }

    public float getBottomButtonStoriesVisibility() {
        it0 it0Var;
        it0 it0Var2;
        lh.k6 k6Var;
        lh.k6 k6Var2;
        float f9 = 1.0f;
        it0[] it0VarArr = this.g0;
        if (it0VarArr == null || (it0Var = it0VarArr[0]) == null || (it0Var2 = it0VarArr[1]) == null || it0Var.w == null || it0Var2.w == null) {
            return 1.0f;
        }
        int i10 = it0Var.B;
        int i11 = it0Var2.B;
        boolean z10 = w0(i10) || i10 == 8;
        boolean z11 = w0(i11) || i11 == 8;
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - it0VarArr[0].w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - it0VarArr[1].w.getVisibilityFactor();
        nu0 k12 = k1(it0VarArr[0].B);
        if (i10 == 8 || (k12 != null && (k6Var2 = k12.s) != null && k6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        nu0 k13 = k1(i11);
        if (i11 != 8 && (k13 == null || (k6Var = k13.s) == null || k6Var.g() <= 0)) {
            f9 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f9;
        }
        if (!z11) {
            f9 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f9, Math.abs(it0VarArr[0].getTranslationX() / it0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        it0[] it0VarArr = this.g0;
        it0 it0Var = it0VarArr[1];
        if (it0Var != null && it0Var.getVisibility() == 0) {
            if (this.c1 && !this.e1) {
                return it0VarArr[1].B;
            }
            if (Math.abs(it0VarArr[1].getTranslationX()) < it0VarArr[1].getMeasuredWidth() / 2.0f) {
                return it0VarArr[1].B;
            }
        }
        return getSelectedTab();
    }

    public jl0 getCurrentListView() {
        vs0 vs0Var;
        it0 it0Var = this.g0[0];
        int i10 = it0Var.B;
        return i10 == 13 ? this.Q.getCurrentListView() : i10 == 14 ? this.R.getCurrentListView() : (i10 != 12 || (vs0Var = this.P) == null) ? it0Var.h : vs0Var.a.t0;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.p1[0].q;
    }

    public TextView getSaveItem() {
        return this.m0;
    }

    public org.telegram.ui.ActionBar.w0 getSearchItem() {
        return this.j0;
    }

    public aj0 getSearchOptionsItem() {
        return this.o0;
    }

    public int getSelectedTab() {
        int currentTabId = this.E0.getCurrentTabId();
        kr0 kr0Var = this.S;
        if (kr0Var == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = kr0Var.getCurrentAlbumId();
        if (currentAlbumId == 0) {
            return 8;
        }
        return currentAlbumId > 0 ? i1(currentAlbumId).a : currentTabId;
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
        float f9 = 0.0f;
        int i10 = 0;
        while (true) {
            it0[] it0VarArr = this.g0;
            if (i10 >= it0VarArr.length) {
                return f9;
            }
            it0 it0Var = it0VarArr[i10];
            if (it0Var != null) {
                f9 = ((1.0f - Math.abs(it0Var.getTranslationX() / getWidth())) * it0Var.B) + f9;
            }
            i10++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w0, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.z6));
        org.telegram.ui.ActionBar.w0 w0Var = this.h0;
        aj0 iconView = w0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.g6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.z8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.q0;
        if (w0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.p0;
        if (w0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.z0};
        ImageView imageView = this.y0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.x0, 1, null, null, null, null, i12));
        fs0 fs0Var = this.E0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(fs0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.wc;
        org.telegram.ui.Cells.v0 v0Var = this.G0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.kd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(fs0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(fs0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(fs0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(fs0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.Hh));
        bs0 bs0Var = this.N0;
        if (bs0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(bs0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.v7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(bs0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.w7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(bs0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.u7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(bs0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.t7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(bs0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.x7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(bs0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.y7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(bs0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A7));
        }
        final int i14 = 0;
        while (true) {
            it0[] it0VarArr = this.g0;
            if (i14 >= it0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.h6 h6Var = new org.telegram.ui.ActionBar.h6() { // from class: org.telegram.ui.Components.ar0
                @Override // org.telegram.ui.ActionBar.h6
                public final void b() {
                    it0[] it0VarArr2 = qu0.this.g0;
                    int i15 = i14;
                    or0 or0Var = it0VarArr2[i15].h;
                    if (or0Var != null) {
                        int childCount = or0Var.getChildCount();
                        for (int i16 = 0; i16 < childCount; i16++) {
                            View childAt = it0VarArr2[i15].h.getChildAt(i16);
                            if (childAt instanceof org.telegram.ui.Cells.q7) {
                                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) childAt;
                                for (int i17 = 0; i17 < 6; i17++) {
                                    q7Var.a[i17].e.invalidate();
                                }
                            } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                                ((org.telegram.ui.Cells.f6) childAt).u(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.sa) {
                                ((org.telegram.ui.Cells.sa) childAt).j(0);
                            }
                        }
                    }
                }

                @Override // org.telegram.ui.ActionBar.h6
                public final /* synthetic */ void a(float f9) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
            xr0 xr0Var = it0VarArr[i14].v;
            int i15 = org.telegram.ui.ActionBar.g6.d6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(xr0Var, 0, null, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].w, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.c7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
            int i16 = org.telegram.ui.ActionBar.g6.h6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.uh));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.m6));
            int i17 = org.telegram.ui.ActionBar.g6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            int i18 = org.telegram.ui.ActionBar.g6.y6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusColor"}, null, null, -1, h6Var, i18));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusOnlineColor"}, null, null, -1, h6Var, org.telegram.ui.ActionBar.g6.n6));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.g6.r0;
            int i19 = org.telegram.ui.ActionBar.g6.J7;
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, null, drawableArr2, null, i19));
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.f6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.g6.D0}, null, -1, null, org.telegram.ui.ActionBar.g6.X8));
            TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.f6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.g6.E0}, null, -1, null, org.telegram.ui.ActionBar.g6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.f6.class}, null, drawableArr2, null, i19));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.U7));
            int i20 = org.telegram.ui.ActionBar.g6.z6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 4, new Class[]{ct0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
            int i21 = org.telegram.ui.ActionBar.g6.Ih;
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
            int i22 = org.telegram.ui.ActionBar.g6.i7;
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            int i23 = org.telegram.ui.ActionBar.g6.k7;
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.zi));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Bi));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.g6.f3, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.g6.g3, null, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.j7.class}, null, null, null, org.telegram.ui.ActionBar.g6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.g6.m0, null, null, org.telegram.ui.ActionBar.g6.K6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Kh));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Jh));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.k7.class}, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            int i24 = org.telegram.ui.ActionBar.g6.Lh;
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.q7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.q7.class}, null, null, h6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.q7.class}, null, null, h6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.d2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.d2.class}, null, null, h6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.d2.class}, null, null, h6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, null, null, new Drawable[]{this.u0}, null, org.telegram.ui.ActionBar.g6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].w.d, 4, null, null, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].w.e, 4, null, null, null, null, i18));
            i14++;
        }
    }

    public final int h0(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.B1;
        return c6Var != null ? c6Var.C0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    public final int h1(int i10) {
        pu0 j12 = j1(i10);
        if (j12 == null) {
            return -1;
        }
        return j12.b;
    }

    public final boolean i0() {
        return this.r1.getConnectionsManager().getConnectionState() == 3;
    }

    public final pu0 i1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.U1;
        pu0 pu0Var = (pu0) hashMap.get(valueOf);
        if (pu0Var != null) {
            return pu0Var;
        }
        pu0 pu0Var2 = new pu0(this, getContext(), i10);
        hashMap.put(Integer.valueOf(i10), pu0Var2);
        this.V1.put(Integer.valueOf(pu0Var2.a), Integer.valueOf(i10));
        return pu0Var2;
    }

    public final boolean j0() {
        SparseArray[] sparseArrayArr;
        MessageObject messageObject;
        TLRPC.Message message;
        boolean z10 = false;
        for (int i10 = 1; i10 >= 0; i10--) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (true) {
                sparseArrayArr = this.V0;
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

    public final pu0 j1(int i10) {
        Integer num = (Integer) this.V1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (pu0) this.U1.get(num);
    }

    public final void k0() {
        AndroidUtilities.cancelRunOnUIThread(this.I0);
        org.telegram.ui.Cells.v0 v0Var = this.G0;
        if (v0Var.getTag() == null) {
            return;
        }
        v0Var.setTag(null);
        AnimatorSet animatorSet = this.H0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.H0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.H0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.H0.playTogether(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.Cells.v0, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.Cells.v0, Float>) View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.K0));
        this.H0.setInterpolator(jr.g);
        this.H0.addListener(new is0(this, 0));
        this.H0.start();
    }

    public final nu0 k1(int i10) {
        pu0 j12;
        if (i10 == 8) {
            return this.V;
        }
        if (i10 == 9) {
            return this.a0;
        }
        if (!w0(i10) || (j12 = j1(i10)) == null) {
            return null;
        }
        return j12.c;
    }

    public boolean l0() {
        return false;
    }

    public final nu0 l1(int i10) {
        pu0 j12;
        if (i10 == 8) {
            return this.W;
        }
        if (i10 == 9) {
            return this.b0;
        }
        if (!w0(i10) || (j12 = j1(i10)) == null) {
            return null;
        }
        return j12.d;
    }

    public boolean m0() {
        return !(this instanceof w30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [f2.u0, org.telegram.ui.Components.ht0, org.telegram.ui.Components.jl0] */
    /* JADX WARN: Type inference failed for: r5v85 */
    public final void m1(boolean z10) {
        it0[] it0VarArr;
        it0[] it0VarArr2;
        f2.c1 c1Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        fu0[] fu0VarArr;
        String str;
        ?? r52;
        int i10;
        boolean z15;
        boolean z16;
        int i11;
        boolean z17;
        f2.c1 c1Var2;
        int i12;
        int i13;
        boolean z18;
        gr0 gr0Var = this.R;
        if (gr0Var != null) {
            gr0Var.i();
        }
        int i14 = 0;
        while (true) {
            it0VarArr = this.g0;
            if (i14 >= it0VarArr.length) {
                break;
            }
            it0VarArr[i14].h.B0();
            i14++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) it0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(B0());
        f2.p0 adapter = it0VarArr[z10 ? 1 : 0].h.getAdapter();
        f2.p0 p0Var = this.V;
        f2.e0 e0Var = this.U;
        if (adapter == p0Var) {
            e0Var.d(null);
        }
        boolean z19 = this.R0;
        bt0 bt0Var = this.z1;
        wt0 wt0Var = this.J;
        org.telegram.ui.ActionBar.w0 w0Var = this.j0;
        int i15 = 100;
        if (z19 && this.Q0) {
            it0 it0Var = it0VarArr[z10 ? 1 : 0];
            if (it0Var.f == null) {
                it0Var.f = new f2.c1();
            }
            it0 it0Var2 = it0VarArr[z10 ? 1 : 0];
            c1Var2 = it0Var2.f;
            bu0 bu0Var = this.O;
            gt0 gt0Var = this.f0;
            lt0 lt0Var = this.d0;
            lt0 lt0Var2 = this.e0;
            lt0 lt0Var3 = this.c0;
            if (z10) {
                int i16 = it0Var2.B;
                if (i16 == 0 || i16 == 2 || i16 == 5 || i16 == 6 || (i16 == 7 && !bt0Var.T())) {
                    this.R0 = false;
                    cs0 cs0Var = this.F0;
                    if (cs0Var != null) {
                        cs0Var.g(false);
                    }
                    this.Q0 = false;
                    m1(true);
                    return;
                }
                String obj = w0Var != null ? w0Var.getSearchField().getText().toString() : "";
                int i17 = it0VarArr[z10 ? 1 : 0].B;
                if (i17 == 1) {
                    if (lt0Var3 != null) {
                        lt0Var3.G(obj, false);
                        if (adapter != lt0Var3) {
                            W0(adapter);
                            it0VarArr[z10 ? 1 : 0].h.setAdapter(lt0Var3);
                        }
                    }
                } else if (i17 == 3) {
                    if (lt0Var2 != null) {
                        lt0Var2.G(obj, false);
                        if (adapter != lt0Var2) {
                            W0(adapter);
                            it0VarArr[z10 ? 1 : 0].h.setAdapter(lt0Var2);
                        }
                    }
                } else if (i17 == 4) {
                    if (lt0Var != null) {
                        lt0Var.G(obj, false);
                        if (adapter != lt0Var) {
                            W0(adapter);
                            it0VarArr[z10 ? 1 : 0].h.setAdapter(lt0Var);
                        }
                    }
                } else if (i17 == 7) {
                    if (gt0Var != null) {
                        gt0Var.F(obj, false);
                        if (adapter != gt0Var) {
                            W0(adapter);
                            it0VarArr[z10 ? 1 : 0].h.setAdapter(gt0Var);
                        }
                    }
                } else if (i17 == 11) {
                    if (bu0Var != null) {
                        bu0Var.E(this.S0, obj);
                        if (adapter != bu0Var) {
                            W0(adapter);
                            it0VarArr[z10 ? 1 : 0].h.setAdapter(bu0Var);
                        }
                    }
                } else if (i17 == 15 && wt0Var != null && adapter != wt0Var) {
                    W0(adapter);
                    or0 or0Var = it0VarArr[z10 ? 1 : 0].h;
                    wt0Var.r = or0Var;
                    or0Var.setAdapter(wt0Var);
                }
            } else if (it0Var2.h != null) {
                int i18 = it0Var2.B;
                if (i18 == 1) {
                    if (adapter != lt0Var3) {
                        W0(adapter);
                        it0VarArr[z10 ? 1 : 0].h.setAdapter(lt0Var3);
                    }
                    lt0Var3.l();
                } else if (i18 == 3) {
                    if (adapter != lt0Var2) {
                        W0(adapter);
                        it0VarArr[z10 ? 1 : 0].h.setAdapter(lt0Var2);
                    }
                    lt0Var2.l();
                } else if (i18 == 4) {
                    if (adapter != lt0Var) {
                        W0(adapter);
                        it0VarArr[z10 ? 1 : 0].h.setAdapter(lt0Var);
                    }
                    lt0Var.l();
                } else if (i18 == 7) {
                    if (adapter != gt0Var) {
                        W0(adapter);
                        it0VarArr[z10 ? 1 : 0].h.setAdapter(gt0Var);
                    }
                    gt0Var.l();
                } else if (i18 == 11) {
                    if (adapter != bu0Var) {
                        W0(adapter);
                        it0VarArr[z10 ? 1 : 0].h.setAdapter(bu0Var);
                    }
                    bu0Var.l();
                }
            }
            it0VarArr2 = it0VarArr;
            z17 = false;
            z16 = false;
            i11 = 100;
        } else {
            it0 it0Var3 = it0VarArr[z10 ? 1 : 0];
            if (it0Var3.e == null) {
                it0Var3.e = new f2.c1();
            }
            it0 it0Var4 = it0VarArr[z10 ? 1 : 0];
            f2.c1 c1Var3 = it0Var4.e;
            it0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i19 = it0VarArr[z10 ? 1 : 0].B;
            if (i19 == 8 || w0(i19)) {
                layoutParams.topMargin = AndroidUtilities.dp(B0());
            }
            or0 or0Var2 = it0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = or0Var2.getPaddingLeft();
            it0 it0Var5 = it0VarArr[z10 ? 1 : 0];
            or0 or0Var3 = it0Var5.h;
            int Z = Z(it0Var5.B);
            or0Var3.Z2 = Z;
            int paddingRight = it0VarArr[z10 ? 1 : 0].h.getPaddingRight();
            it0VarArr2 = it0VarArr;
            or0 or0Var4 = it0VarArr2[z10 ? 1 : 0].h;
            int Y = Y(v0());
            or0Var4.a3 = Y;
            or0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
            int i20 = it0VarArr2[z10 ? 1 : 0].B;
            int[] iArr = this.i1;
            f2.p0 p0Var2 = this.G;
            View view = this.Q;
            vs0 vs0Var = this.P;
            zt0 zt0Var = this.N;
            at0 at0Var = this.L;
            fu0[] fu0VarArr2 = this.p1;
            if (i20 == 0) {
                f2.p0 p0Var3 = this.D;
                if (adapter != p0Var3) {
                    W0(adapter);
                    it0VarArr2[z10 ? 1 : 0].h.setAdapter(p0Var3);
                }
                int i21 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i21;
                layoutParams.leftMargin = i21;
                fu0 fu0Var = fu0VarArr2[0];
                boolean z20 = fu0Var.h && !fu0Var.e.isEmpty();
                i15 = iArr[0];
                it0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.u0);
                fu0 fu0Var2 = fu0VarArr2[0];
                if (fu0Var2.x == null) {
                    fu0Var2.x = new f2.c1();
                }
                z13 = z20;
                c1Var = fu0VarArr2[0].x;
                z11 = false;
            } else {
                if (i20 == 1) {
                    fu0 fu0Var3 = fu0VarArr2[1];
                    z12 = fu0Var3.h && !fu0Var3.e.isEmpty();
                    if (adapter != p0Var2) {
                        W0(adapter);
                        it0VarArr2[z10 ? 1 : 0].h.setAdapter(p0Var2);
                    }
                } else if (i20 == 2) {
                    fu0 fu0Var4 = fu0VarArr2[2];
                    z12 = fu0Var4.h && !fu0Var4.e.isEmpty();
                    if (adapter != this.H) {
                        W0(adapter);
                        it0VarArr2[z10 ? 1 : 0].h.setAdapter(this.H);
                    }
                } else {
                    if (i20 == 3) {
                        if (adapter != this.F) {
                            W0(adapter);
                            it0VarArr2[z10 ? 1 : 0].h.setAdapter(this.F);
                        }
                    } else if (i20 == 4) {
                        fu0 fu0Var5 = fu0VarArr2[4];
                        z12 = fu0Var5.h && !fu0Var5.e.isEmpty();
                        if (adapter != this.I) {
                            W0(adapter);
                            it0VarArr2[z10 ? 1 : 0].h.setAdapter(this.I);
                        }
                    } else {
                        if (i20 == 5) {
                            if (adapter != this.K) {
                                W0(adapter);
                                it0VarArr2[z10 ? 1 : 0].h.setAdapter(this.K);
                            }
                        } else if (i20 == 15) {
                            if (adapter != wt0Var) {
                                W0(adapter);
                                or0 or0Var5 = it0VarArr2[z10 ? 1 : 0].h;
                                wt0Var.r = or0Var5;
                                or0Var5.setAdapter(wt0Var);
                            }
                        } else if (i20 == 6) {
                            if (adapter != at0Var) {
                                W0(adapter);
                                it0VarArr2[z10 ? 1 : 0].h.setAdapter(at0Var);
                            }
                        } else if (i20 == 7) {
                            if (adapter != this.T) {
                                W0(adapter);
                                it0VarArr2[z10 ? 1 : 0].h.setAdapter(this.T);
                            }
                        } else if (p0(i20)) {
                            f2.p0 k12 = k1(it0VarArr2[z10 ? 1 : 0].B);
                            if (adapter != k12) {
                                W0(adapter);
                                it0VarArr2[z10 ? 1 : 0].h.setAdapter(k12);
                                it0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            it0 it0Var6 = it0VarArr2[z10 ? 1 : 0];
                            if (it0Var6.B != 9) {
                                e0Var.d(it0Var6.h);
                            }
                            i15 = iArr[1];
                        } else {
                            int i22 = it0VarArr2[z10 ? 1 : 0].B;
                            if (i22 == 10) {
                                if (adapter != this.M) {
                                    W0(adapter);
                                    it0VarArr2[z10 ? 1 : 0].h.setAdapter(this.M);
                                }
                            } else if (i22 == 11) {
                                if (adapter != zt0Var) {
                                    W0(adapter);
                                    it0VarArr2[z10 ? 1 : 0].h.setAdapter(zt0Var);
                                    f2.e0 e0Var2 = zt0Var.v;
                                    or0 or0Var6 = it0VarArr2[z10 ? 1 : 0].h;
                                    zt0Var.s = or0Var6;
                                    e0Var2.d(or0Var6);
                                }
                                c1Var = zt0Var.r;
                                z11 = true;
                                z13 = false;
                            } else if (i22 == 12) {
                                if (adapter != null) {
                                    W0(adapter);
                                    it0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (vs0Var.getParent() != it0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(vs0Var);
                                    it0VarArr2[z10 ? 1 : 0].addView(vs0Var, i7.f6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                }
                            } else if (i22 == 13) {
                                if (adapter != null) {
                                    W0(adapter);
                                    it0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != it0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    it0VarArr2[z10 ? 1 : 0].addView(view);
                                }
                            } else if (i22 == 14) {
                                if (adapter != null) {
                                    W0(adapter);
                                    it0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (gr0Var != null && gr0Var.getParent() != it0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(gr0Var);
                                    it0VarArr2[z10 ? 1 : 0].addView(gr0Var);
                                    it0VarArr2[z10 ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        c1Var = c1Var3;
                        z11 = false;
                        z13 = false;
                    }
                    c1Var = c1Var3;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                c1Var = c1Var3;
                z11 = true;
            }
            int i23 = it0VarArr2[z10 ? 1 : 0].B;
            boolean z21 = i23 == 0 || p0(i23);
            f2.c1 c1Var4 = c1Var;
            it0VarArr2[z10 ? 1 : 0].v.setLayoutParams(i7.f6.d(-1, -1.0f, 119, z21 ? 0.0f : 12.0f, (z21 ? 8 : 12) + 48, z21 ? 0.0f : 12.0f, z21 ? 0.0f : 12.0f));
            if (z11) {
                it0VarArr2[z10 ? 1 : 0].h.setSections(false);
            } else {
                or0 or0Var7 = it0VarArr2[z10 ? 1 : 0].h;
                or0Var7.getClass();
                or0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, or0Var7.l2));
                or0Var7.E2 = null;
                or0Var7.H2 = 0.0f;
                or0Var7.I2 = null;
                or0Var7.J2 = null;
                or0Var7.F2 = null;
                xk0 xk0Var = or0Var7.D2;
                if (xk0Var != null) {
                    or0Var7.p0(xk0Var);
                    or0Var7.D2 = null;
                }
            }
            it0 it0Var7 = it0VarArr2[z10 ? 1 : 0];
            int i24 = it0Var7.B;
            org.telegram.ui.ActionBar.o2 o2Var = this.r1;
            if (i24 == 15) {
                z14 = z13;
                fu0VarArr = fu0VarArr2;
                str = "";
                it0Var7.setBackground(nh.f6.e(it0Var7.getBackground(), o2Var.getCurrentAccount(), this.f1, org.telegram.ui.ActionBar.g6.I.q()));
                it0VarArr2[z10 ? 1 : 0].setOutlineProvider(new eg.k1(14));
                it0VarArr2[z10 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z14 = z13;
                fu0VarArr = fu0VarArr2;
                str = "";
                it0Var7.setClipToOutline(false);
                r52 = 0;
                it0VarArr2[z10 ? 1 : 0].setBackground(null);
            }
            it0 it0Var8 = it0VarArr2[z10 ? 1 : 0];
            if (it0Var8.B == 11) {
                it0Var8.h.setItemAnimator(it0Var8.d);
            } else {
                it0Var8.h.setItemAnimator(r52);
                if (zt0Var != null && it0VarArr2[z10 ? 1 : 0].h == zt0Var.s) {
                    f2.e0 e0Var3 = zt0Var.v;
                    zt0Var.s = r52;
                    e0Var3.d(r52);
                }
            }
            if (vs0Var != null && it0VarArr2[z10 ? 1 : 0].B != 12 && vs0Var.getParent() == it0VarArr2[z10 ? 1 : 0]) {
                vs0Var.a.onRemoveFromParent();
                it0VarArr2[z10 ? 1 : 0].removeView(vs0Var);
            }
            if (view != null && it0VarArr2[z10 ? 1 : 0].B != 13) {
                ViewParent parent = view.getParent();
                it0 it0Var9 = it0VarArr2[z10 ? 1 : 0];
                if (parent == it0Var9) {
                    it0Var9.removeView(view);
                }
            }
            if (gr0Var != null && it0VarArr2[z10 ? 1 : 0].B != 14) {
                ViewParent parent2 = gr0Var.getParent();
                it0 it0Var10 = it0VarArr2[z10 ? 1 : 0];
                if (parent2 == it0Var10) {
                    it0Var10.removeView(gr0Var);
                }
            }
            int i25 = it0VarArr2[z10 ? 1 : 0].B;
            if (i25 != 0 && i25 != 11 && !p0(i25) && (i12 = it0VarArr2[z10 ? 1 : 0].B) != 2 && i12 != 5 && i12 != 6 && ((i12 != 7 || bt0Var.T()) && (i13 = it0VarArr2[z10 ? 1 : 0].B) != 10 && i13 != 13 && i13 != 14)) {
                if (!z10) {
                    z18 = false;
                    if (w0Var != null) {
                        if (w0Var.getVisibility() == 4) {
                            if (D()) {
                                this.t0 = 0;
                                this.k0 = 1.0f;
                                w0Var.setVisibility(0);
                            } else {
                                w0Var.setVisibility(v0() ? 8 : 4);
                                this.k0 = 0.0f;
                            }
                        }
                        q1(z18);
                    }
                } else if (w0Var == null || w0Var.getVisibility() != 4 || this.C.j0) {
                    z18 = false;
                    this.t0 = 0;
                    this.k0 = 1.0f;
                } else {
                    if (D()) {
                        this.t0 = 1;
                        w0Var.setVisibility(0);
                    } else {
                        w0Var.setVisibility(v0() ? 8 : 4);
                    }
                    float f9 = z10 ? 1.0f : 0.0f;
                    this.k0 = b0(f9);
                    s1(1.0f - f9);
                    z18 = false;
                }
                q1(z18);
            } else if (z10) {
                this.t0 = 2;
            } else {
                this.t0 = 0;
                if (w0Var != null) {
                    w0Var.setVisibility((v0() || this.R0) ? 8 : 4);
                }
            }
            int i26 = it0VarArr2[z10 ? 1 : 0].B;
            if (i26 == 6) {
                if (!at0Var.e && !at0Var.h && at0Var.d.isEmpty()) {
                    at0.E(at0Var, 0L);
                }
            } else if (i26 != 7) {
                if (p0(i26)) {
                    nu0 k13 = k1(it0VarArr2[z10 ? 1 : 0].B);
                    if (k13 != null) {
                        lh.k6 k6Var = k13.s;
                        k13.P();
                        it0VarArr2[z10 ? 1 : 0].w.e(k6Var != null && (k6Var.k() || (i0() && k6Var.g() > 0)), z10);
                        z15 = (k6Var == null || k6Var.g() <= 0 || t0()) ? false : true;
                    } else {
                        z15 = z14;
                    }
                    z14 = z15;
                } else {
                    int i27 = it0VarArr2[z10 ? 1 : 0].B;
                    if (i27 != 10 && i27 != 11 && i27 != 12 && i27 != 13 && i27 != 14) {
                        if (i27 == 15) {
                            i27 = 8;
                        }
                        fu0 fu0Var6 = fu0VarArr[i27];
                        if (!fu0Var6.g && !fu0Var6.i[0] && fu0Var6.a.isEmpty()) {
                            fu0VarArr[i27].g = true;
                            p0Var2.l();
                            if (i27 == 0) {
                                int i28 = fu0VarArr[0].q;
                                if (i28 == 1) {
                                    i10 = 6;
                                } else if (i28 == 2) {
                                    i10 = 7;
                                }
                                o2Var.getMediaDataController().loadMedia(this.f1, 50, 0, 0, i10, this.B, 1, o2Var.getClassGuid(), fu0VarArr[i10].p, null, null);
                            }
                            i10 = i27;
                            o2Var.getMediaDataController().loadMedia(this.f1, 50, 0, 0, i10, this.B, 1, o2Var.getClassGuid(), fu0VarArr[i10].p, null, null);
                        }
                    }
                }
            }
            int i29 = it0VarArr2[z10 ? 1 : 0].B;
            if (i29 == 8 || w0(i29)) {
                it0 it0Var11 = it0VarArr2[z10 ? 1 : 0];
                zr0 zr0Var = it0Var11.w;
                boolean w02 = w0(it0Var11.B);
                int h12 = h1(it0VarArr2[z10 ? 1 : 0].B);
                t9 t9Var = zr0Var.b;
                nh.d dVar = zr0Var.f;
                t9Var.setVisibility((w02 || u0() || r0()) ? 8 : 0);
                if (w02) {
                    dVar.setVisibility(0);
                    dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum));
                } else if (u0()) {
                    dVar.setVisibility(8);
                } else {
                    zr0Var.setStickerType(11);
                    dVar.setVisibility(!t0() ? 0 : 8);
                    dVar.h(w());
                }
                if (w02) {
                    zr0Var.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    zr0Var.e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    zr0Var.d.setText(LocaleController.getString(!t0() ? v0() ? R.string.NoPublicStoriesTitle2 : R.string.NoStoriesTitle : R.string.NoHashtagStoriesTitle));
                    zr0Var.e.setText(v0() ? LocaleController.getString(R.string.NoStoriesSubtitle2) : str);
                }
                dVar.setOnClickListener(new ih.q2(this, w02, h12, 1));
            } else {
                it0 it0Var12 = it0VarArr2[z10 ? 1 : 0];
                if (it0Var12.B == 9) {
                    if (u0()) {
                        it0VarArr2[z10 ? 1 : 0].w.b.setVisibility(8);
                        it0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        it0VarArr2[z10 ? 1 : 0].w.b.setVisibility(0);
                        it0VarArr2[z10 ? 1 : 0].w.setStickerType(11);
                        it0VarArr2[z10 ? 1 : 0].w.f.setVisibility(0);
                        it0VarArr2[z10 ? 1 : 0].w.f.h(w());
                    }
                    it0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    it0VarArr2[z10 ? 1 : 0].w.e.setText(v0() ? LocaleController.getString(R.string.NoArchivedStoriesSubtitle) : str);
                    it0VarArr2[z10 ? 1 : 0].w.f.setOnClickListener(new oq0(this, 7));
                } else {
                    it0Var12.w.b.setVisibility(0);
                    it0VarArr2[z10 ? 1 : 0].w.setStickerType(1);
                    it0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoResult));
                    it0VarArr2[z10 ? 1 : 0].w.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    it0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                }
            }
            z16 = false;
            it0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            i11 = i15;
            z17 = z14;
            c1Var2 = c1Var4;
        }
        it0 it0Var13 = it0VarArr2[z10 ? 1 : 0];
        it0Var13.b = z17;
        o1(it0Var13, z16);
        it0VarArr2[z10 ? 1 : 0].x.y1(i11);
        it0VarArr2[z10 ? 1 : 0].h.a0();
        if (c1Var2 != null) {
            it0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(c1Var2);
            it0VarArr2[z10 ? 1 : 0].r.setRecycledViewPool(c1Var2);
        }
        if (this.t0 == 2) {
            org.telegram.ui.ActionBar.l lVar = this.C;
            if (lVar.j0) {
                this.v0 = true;
                lVar.h(true);
                this.t0 = 0;
                this.k0 = 0.0f;
                if (w0Var != null) {
                    w0Var.setVisibility(v0() ? 8 : 4);
                }
                q1(false);
            }
        }
    }

    public final void n0(ViewGroup viewGroup) {
        for (it0 it0Var : this.g0) {
            or0 or0Var = it0Var.h;
            Objects.requireNonNull(or0Var);
            it0Var.n = new lg.k(or0Var, viewGroup, new vv(or0Var, 4));
        }
        gr0 gr0Var = this.R;
        if (gr0Var != null) {
            gr0Var.O = viewGroup;
            gr0Var.N = new ih.o2(gr0Var, 0);
        }
    }

    public final void n1() {
        us0 us0Var = this.D;
        if (us0Var != null) {
            us0Var.l();
        }
        du0 du0Var = this.G;
        if (du0Var != null) {
            du0Var.l();
        }
        du0 du0Var2 = this.H;
        if (du0Var2 != null) {
            du0Var2.l();
        }
        eu0 eu0Var = this.F;
        if (eu0Var != null) {
            eu0Var.X(false);
        }
        du0 du0Var3 = this.I;
        if (du0Var3 != null) {
            du0Var3.l();
        }
        wt0 wt0Var = this.J;
        if (wt0Var != null) {
            wt0Var.l();
        }
        dt0 dt0Var = this.K;
        if (dt0Var != null) {
            dt0Var.l();
        }
        xs0 xs0Var = this.V;
        if (xs0Var != null) {
            xs0Var.l();
        }
        Iterator it = this.U1.values().iterator();
        while (it.hasNext()) {
            ((pu0) it.next()).c.l();
        }
    }

    public final void o1(it0 it0Var, boolean z10) {
        boolean z11 = it0Var.b && this.d;
        sk0 fastScroll = it0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = it0Var.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            it0Var.c.cancel();
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<sk0, Float>) property, fastScroll.getAlpha(), 1.0f);
            it0Var.c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r1);
            return;
        }
        if (z11 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<sk0, Float>) property, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new z9(fastScroll));
        it0Var.c = ofFloat2;
        ofFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            it0[] it0VarArr = this.g0;
            if (i10 >= it0VarArr.length) {
                return;
            }
            or0 or0Var = it0VarArr[i10].h;
            if (or0Var != null) {
                or0Var.getViewTreeObserver().addOnPreDrawListener(new ls0(this, i10, 0));
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return J() || this.E0.D || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        bt0 bt0Var = this.z1;
        int height = bt0Var.f() != null ? bt0Var.f().getHeight() : 0;
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
            } else if (childAt instanceof it0) {
                i12 = i10;
                measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                or0 or0Var = ((it0) childAt).h;
                or0Var.setPadding(0, or0Var.U2, 0, or0Var.V2);
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
        if (!this.H1) {
            org.telegram.ui.ActionBar.o2 o2Var = this.r1;
            if (o2Var.getParentLayout() != null && !((ActionBarLayout) o2Var.getParentLayout()).j() && !J() && !this.a) {
                if (motionEvent != null) {
                    if (this.x1 == null) {
                        this.x1 = VelocityTracker.obtain();
                    }
                    this.x1.addMovement(motionEvent);
                    g40 g40Var = this.A1;
                    if (g40Var != null) {
                        g40Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.t1 && !this.u1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.s1 = motionEvent.getPointerId(0);
                    this.u1 = true;
                    this.v1 = (int) motionEvent.getX();
                    this.w1 = (int) motionEvent.getY();
                    this.x1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.s1) {
                    int x4 = (int) (motionEvent.getX() - this.v1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.w1);
                    boolean z11 = this.t1;
                    it0[] it0VarArr = this.g0;
                    if (z11 && (((z10 = this.d1) && x4 > 0) || (!z10 && x4 < 0))) {
                        if (!U0(motionEvent, x4 < 0)) {
                            this.u1 = true;
                            this.t1 = false;
                            N0(false);
                            it0VarArr[0].setTranslationX(0.0f);
                            it0VarArr[1].setTranslationX(this.d1 ? it0VarArr[0].getMeasuredWidth() : -it0VarArr[0].getMeasuredWidth());
                            Z0(0.0f, it0VarArr[1].B);
                            M0(getTabProgress());
                        }
                    }
                    if (!this.u1 || this.t1) {
                        if (this.t1) {
                            it0VarArr[0].setTranslationX(x4);
                            if (this.d1) {
                                it0VarArr[1].setTranslationX(it0VarArr[0].getMeasuredWidth() + x4);
                            } else {
                                it0VarArr[1].setTranslationX(x4 - it0VarArr[0].getMeasuredWidth());
                            }
                            float abs2 = Math.abs(x4) / it0VarArr[0].getMeasuredWidth();
                            if (D()) {
                                this.k0 = b0(abs2);
                                s1(abs2);
                                float a02 = a0(abs2);
                                this.l0 = a02;
                                this.n0.setVisibility((a02 == 0.0f || !D() || q0()) ? 4 : 0);
                            } else {
                                this.k0 = 0.0f;
                            }
                            q1(false);
                            Z0(abs2, it0VarArr[1].B);
                            M0(getTabProgress());
                            L0();
                        }
                    } else if (Math.abs(x4) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x4) > abs) {
                        U0(motionEvent, x4 < 0);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.s1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    g1(motionEvent);
                }
                return this.t1;
            }
        }
        return false;
    }

    public final void p1() {
        org.telegram.ui.ActionBar.w0 w0Var = this.p0;
        if (w0Var == null) {
            return;
        }
        boolean z10 = this.r1.getMessagesController().isPeerNoForwards(this.f1) || j0();
        w0Var.setAlpha(z10 ? 0.5f : 1.0f);
        if (z10 && w0Var.getBackground() != null) {
            w0Var.setBackground(null);
        } else {
            if (z10 || w0Var.getBackground() != null) {
                return;
            }
            w0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(h0(org.telegram.ui.ActionBar.g6.z8), 5, -1));
        }
    }

    public boolean q0() {
        return false;
    }

    public final void q1(boolean z10) {
        gr0 gr0Var;
        kr0 kr0Var;
        aj0 aj0Var = this.o0;
        if (aj0Var == null) {
            return;
        }
        float f9 = 0.0f;
        if (!this.R0 && (((gr0Var = this.R) == null || !gr0Var.g()) && ((kr0Var = this.S) == null || !kr0Var.w))) {
            f9 = Utilities.clamp(this.k0 + this.l0, 1.0f, 0.0f);
        }
        aj0Var.setAlpha(f9);
        if (z10) {
            A(a0(1.0f) > 0.5f, true);
        } else if (this.t0 == 2) {
            A(this.l0 > 0.1f, true);
        } else {
            A(this.k0 < 0.1f, true);
        }
    }

    public final boolean r0() {
        TLRPC.User user;
        long j10 = this.f1;
        return j10 > 0 && (user = MessagesController.getInstance(this.r1.getCurrentAccount()).getUser(Long.valueOf(j10))) != null && user.bot;
    }

    public final void r1(boolean z10) {
        int i10 = 0;
        while (true) {
            it0[] it0VarArr = this.g0;
            if (i10 >= it0VarArr.length) {
                return;
            }
            int childCount = it0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = it0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.g7) {
                    ((org.telegram.ui.Cells.g7) childAt).b(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.p7) {
                    ((org.telegram.ui.Cells.p7) childAt).i(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                    ((org.telegram.ui.Cells.j7) childAt).f(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.f7) {
                    ((org.telegram.ui.Cells.f7) childAt).e(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.d2) {
                    ((org.telegram.ui.Cells.d2) childAt).c(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) childAt).V(false, z10);
                }
            }
            i10++;
        }
    }

    public final boolean s0(int i10) {
        return i10 == 7 ? this.z1.T() : (t0() || i10 == 0 || p0(i10) || i10 == 2 || i10 == 5 || i10 == 6 || i10 == 11 || i10 == 10 || i10 == 13 || i10 == 14) ? false : true;
    }

    public final void s1(float f9) {
        org.telegram.ui.ActionBar.w0 w0Var = this.i0;
        if (w0Var == null) {
            return;
        }
        it0[] it0VarArr = this.g0;
        it0 it0Var = it0VarArr[1];
        float f10 = 0.0f;
        if (it0Var != null && it0Var.B == 11) {
            f10 = 0.0f + f9;
        }
        it0 it0Var2 = it0VarArr[0];
        if (it0Var2 != null && it0Var2.B == 11) {
            f10 += 1.0f - f9;
        }
        w0Var.setAlpha(f10);
        float f11 = (0.15f * f10) + 0.85f;
        w0Var.setScaleX(f11);
        w0Var.setScaleY(f11);
        w0Var.setVisibility(f10 <= 0.01f ? 8 : 0);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2 = this.Z0;
        boolean z10 = chatFull2 != null && chatFull2.stories_pinned_available;
        this.Z0 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.Y0 == 0) {
                this.Y0 = -j10;
                int i10 = 0;
                while (true) {
                    fu0[] fu0VarArr = this.p1;
                    if (i10 >= fu0VarArr.length) {
                        break;
                    }
                    if (fu0VarArr[i10].b[1].size() == 0) {
                        fu0 fu0Var = fu0VarArr[i10];
                        fu0Var.j[1] = this.Z0.migrated_from_max_id;
                        fu0Var.i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.Z0;
        if (chatFull3 == null || z10 == chatFull3.stories_pinned_available) {
            return;
        }
        fs0 fs0Var = this.E0;
        if (fs0Var != null) {
            fs0Var.setInitialTabId(q0() ? 9 : 8);
        }
        v1(true);
        m1(false);
    }

    public void setCommonGroupsCount(int i10) {
        if (this.B == 0) {
            this.T0[6] = i10;
        }
        v1(true);
        F();
    }

    public void setForwardRestrictedHint(g40 g40Var) {
        this.A1 = g40Var;
    }

    public void setMergeDialogId(long j10) {
        this.Y0 = j10;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i10 = 0;
        while (true) {
            iArr2 = this.T0;
            if (i10 > 6 || iArr2[i10] >= 0) {
                break;
            } else {
                i10++;
            }
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        v1(true);
        F();
        if (iArr2[0] >= 0) {
            z0(false);
        }
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.G1 = i11;
        int i14 = 0;
        while (true) {
            it0[] it0VarArr = this.g0;
            if (i14 >= it0VarArr.length) {
                break;
            }
            it0VarArr[i14].setTranslationY(this.G1);
            i14++;
        }
        if (this.L0 != null) {
            K();
        } else {
            bs0 bs0Var = this.N0;
            if (bs0Var != null) {
                bs0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
            }
        }
        this.K0 = i11;
        org.telegram.ui.Cells.v0 v0Var = this.G0;
        v0Var.setTranslationY((v0Var.getTag() == null ? -AndroidUtilities.dp(48.0f) : 0) + this.K0);
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.T1 != i10) {
            this.T1 = i10;
            it0[] it0VarArr = this.g0;
            if (it0VarArr != null) {
                for (it0 it0Var : it0VarArr) {
                    if (it0Var != null) {
                        or0 or0Var = it0Var.h;
                        int paddingLeft = or0Var.getPaddingLeft();
                        or0 or0Var2 = it0Var.h;
                        int i11 = or0Var2.U2;
                        int paddingRight = or0Var2.getPaddingRight();
                        or0 or0Var3 = it0Var.h;
                        int Y = Y(v0());
                        or0Var3.a3 = Y;
                        or0Var.setPadding(paddingLeft, i11, paddingRight, Y);
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
            it0[] it0VarArr = this.g0;
            if (i10 >= it0VarArr.length) {
                return;
            }
            o1(it0VarArr[i10], true);
            i10++;
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        TLRPC.UserFull userFull2 = this.a1;
        boolean z10 = userFull2 != null && userFull2.stories_pinned_available;
        this.a1 = userFull;
        v1(true);
        if (userFull == null || z10 == userFull.stories_pinned_available) {
            return;
        }
        Y0(8);
    }

    public void setVisibleHeight(int i10) {
        this.I1 = i10;
        int i11 = 0;
        while (true) {
            it0[] it0VarArr = this.g0;
            if (i11 >= it0VarArr.length) {
                break;
            }
            float f9 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(it0VarArr[i11].B == 8 ? 280.0f : 120.0f)))) / 2.0f;
            it0VarArr[i11].w.setTranslationY(f9);
            it0VarArr[i11].v.setTranslationY(-f9);
            i11++;
        }
        fr0 fr0Var = this.Q;
        if (fr0Var != null) {
            fr0Var.setVisibleHeight(i10);
        }
        gr0 gr0Var = this.R;
        if (gr0Var != null) {
            gr0Var.setVisibleHeight(i10);
        }
    }

    public boolean t0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void t1() {
        org.telegram.ui.ActionBar.w0 w0Var = this.i0;
        if (w0Var == null) {
            return;
        }
        it0 it0Var = this.g0[1];
        boolean z10 = it0Var != null && it0Var.B == 11;
        if (z10) {
            w0Var.setVisibility(0);
        }
        w0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.85f).scaleY(z10 ? 1.0f : 0.85f).withEndAction(new p90(2, this, z10)).setDuration(420L).setInterpolator(jr.h).start();
    }

    public boolean u0() {
        return false;
    }

    public final void u1() {
        boolean z10;
        lh.k6 k6Var;
        boolean r02 = r0();
        org.telegram.ui.ActionBar.w0 w0Var = this.s0;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.r0;
        if (r02) {
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            if (w0Var != null) {
                w0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 9) {
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            if (w0Var != null) {
                w0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() != 8) {
            if (w0(getClosestTab())) {
                if (w0Var2 != null) {
                    w0Var2.setVisibility(8);
                }
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray[] sparseArrayArr = this.V0;
            if (i10 >= sparseArrayArr[0].size()) {
                z10 = false;
                break;
            }
            MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i10);
            xs0 xs0Var = this.V;
            if (xs0Var != null && (k6Var = xs0Var.s) != null && !k6Var.m(messageObject.getId())) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (w0Var2 != null) {
            w0Var2.setVisibility(z10 ? 0 : 8);
        }
        if (w0Var != null) {
            w0Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public boolean v0() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e5, code lost:
    
        if ((r36[8] <= 0) == r8.d(15)) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01e7, code lost:
    
        r4 = r37 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x01ea, code lost:
    
        r4 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x01fb, code lost:
    
        if ((r36[4] <= 0) == r8.d(4)) goto L176;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v1(boolean z10) {
        char c3;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ProfileTab profileTab;
        TLRPC.ProfileTab profileTab2;
        int i10;
        boolean z11;
        int i11;
        boolean v02;
        int[] iArr;
        boolean z12;
        boolean z13;
        fs0 fs0Var;
        int selectedTab;
        boolean z14;
        boolean z15;
        long j10;
        TLRPC.UserFull userFull2;
        TLRPC.ChatFull chatFull2;
        Integer num;
        fs0 fs0Var2;
        boolean z16;
        int i12;
        int size;
        int i13;
        Boolean bool;
        String string;
        String str;
        String str2;
        gr0 gr0Var;
        char c6;
        int i14;
        Object obj;
        Object obj2;
        Object obj3;
        int i15;
        int i16;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull3;
        TLRPC.UserFull userFull4;
        TL_bots.BotInfo botInfo;
        iu0 iu0Var;
        fs0 fs0Var3 = this.E0;
        if (fs0Var3 == null) {
            return;
        }
        boolean z17 = !this.z1.q() ? false : z10;
        boolean z18 = (this.P == null || (iu0Var = this.q1) == null || !iu0Var.f) ? false : true;
        org.telegram.ui.ActionBar.o2 o2Var = this.r1;
        long j11 = this.f1;
        if (j11 <= 0 || o2Var == null) {
            c3 = 4;
            user = null;
        } else {
            c3 = 4;
            user = o2Var.getMessagesController().getUser(Long.valueOf(j11));
        }
        boolean z19 = user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        boolean z20 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.a1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z19) ? false : true;
        boolean z21 = (DialogObject.isUserDialog(j11) || DialogObject.isChatDialog(j11)) && !DialogObject.isEncryptedDialog(j11) && (((userFull = this.a1) != null && userFull.stories_pinned_available) || (((chatFull = this.Z0) != null && chatFull.stories_pinned_available) || v0())) && m0();
        gr0 gr0Var2 = this.R;
        boolean z22 = gr0Var2 != null && (((userFull3 = this.a1) != null && userFull3.stargifts_count > 0) || ((chatFull3 = this.Z0) != null && chatFull3.stargifts_count > 0));
        boolean z23 = z20;
        TLRPC.ChatFull chatFull4 = this.Z0;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.a1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z24 = z17;
                int i17 = this.M1 == fs0Var3.j0 ? 1 : 0;
                int i18 = (!z21 || z23) == fs0Var3.d(8) ? i17 + 1 : i17;
                if (z19 != fs0Var3.d(13)) {
                    i18++;
                }
                int i19 = i18;
                i10 = t0() == fs0Var3.d(8) ? i19 + 1 : i19;
                if (z22 == fs0Var3.d(14)) {
                    i10++;
                } else if (gr0Var2 != null && z22) {
                    z11 = z18;
                    i11 = 14;
                    if (this.L1 != gr0Var2.getLastEmojisHash()) {
                        i10++;
                    }
                    v02 = v0();
                    zs0 zs0Var = this.T;
                    boolean z25 = z22;
                    int[] iArr2 = this.T0;
                    if (v02) {
                        iArr = iArr2;
                        z12 = false;
                        z13 = false;
                    } else {
                        iArr = iArr2;
                        int i20 = i10;
                        int i21 = (zs0Var.d == null) == fs0Var3.d(7) ? i20 + 1 : i20;
                        int i22 = (iArr[0] <= 0) == fs0Var3.d(0) ? i21 + 1 : i21;
                        int i23 = (iArr[1] <= 0) == fs0Var3.d(1) ? i22 + 1 : i22;
                        if (DialogObject.isEncryptedDialog(j11)) {
                            i15 = i23;
                        } else {
                            int i24 = i23;
                            int i25 = (iArr[3] <= 0) == fs0Var3.d(3) ? i24 + 1 : i24;
                            i15 = (iArr[c3] <= 0) == fs0Var3.d(4) ? i25 + 1 : i25;
                        }
                        int i26 = i16;
                        int i27 = (iArr[2] <= 0) == fs0Var3.d(2) ? i26 + 1 : i26;
                        int i28 = (iArr[5] <= 0) == fs0Var3.d(5) ? i27 + 1 : i27;
                        int i29 = (iArr[6] <= 0) == fs0Var3.d(6) ? i28 + 1 : i28;
                        boolean z26 = !this.M.d.isEmpty();
                        int i30 = i29;
                        i10 = z26 != fs0Var3.d(10) ? i30 + 1 : i30;
                        z12 = l0() && !o2Var.getMessagesController().getSavedMessagesController().unsupported && o2Var.getMessagesController().getSavedMessagesController().hasDialogs();
                        z13 = z26;
                        if (z12 != fs0Var3.d(11)) {
                            i10++;
                        }
                        if (z11 != fs0Var3.d(12)) {
                            i10++;
                        }
                    }
                    if (i10 > 0) {
                        if (z24) {
                            TransitionSet transitionSet = new TransitionSet();
                            transitionSet.setOrdering(0);
                            z14 = z12;
                            transitionSet.addTransition(new cg.j0(3));
                            z15 = z11;
                            j10 = j11;
                            transitionSet.setDuration(200L);
                            TransitionManager.beginDelayedTransition(fs0Var3.getTabsContainer(), transitionSet);
                            fs0Var3.Q = fs0Var3.v;
                            fs0Var3.R = fs0Var3.w;
                        } else {
                            z14 = z12;
                            z15 = z11;
                            j10 = j11;
                        }
                        SparseArray g10 = fs0Var3.g();
                        if (i10 > 3) {
                            g10 = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (t0()) {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                            fs0Var3.U = 420L;
                        }
                        if (z23) {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                        } else if ((DialogObject.isUserDialog(j10) || DialogObject.isChatDialog(j10)) && !DialogObject.isEncryptedDialog(j10) && ((((userFull2 = this.a1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.Z0) != null && chatFull2.stories_pinned_available) || v0())) && m0())) {
                            if (q0()) {
                                arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                                fs0Var3.U = 420L;
                            } else {
                                arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                                if (v0()) {
                                    arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                                }
                            }
                        }
                        if (z25) {
                            Integer valueOf = Integer.valueOf(i11);
                            String string2 = LocaleController.getString(R.string.ProfileGifts);
                            HashMap hashMap = ih.x3.P;
                            jh.k7 k7Var = gr0Var2.d;
                            if (k7Var == null) {
                                gr0Var = gr0Var2;
                                num = 0;
                                fs0Var2 = fs0Var3;
                                z16 = z15;
                                str2 = string2;
                                obj = "";
                            } else {
                                z16 = z15;
                                ArrayList arrayList2 = k7Var.l;
                                str2 = string2;
                                num = 0;
                                fs0Var2 = fs0Var3;
                                Pair pair = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(gr0Var2.c));
                                if (!arrayList2.isEmpty()) {
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList3 = new ArrayList();
                                    int i31 = 0;
                                    while (true) {
                                        gr0Var = gr0Var2;
                                        if (arrayList3.size() >= 3 || i31 >= arrayList2.size()) {
                                            break;
                                        }
                                        TLRPC.Document document = ((TL_stars.SavedStarGift) arrayList2.get(i31)).gift.getDocument();
                                        if (document == null) {
                                            i14 = i31;
                                        } else {
                                            i14 = i31;
                                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                                hashSet.add(Long.valueOf(document.id));
                                                arrayList3.add(document);
                                            }
                                        }
                                        i31 = i14 + 1;
                                        gr0Var2 = gr0Var;
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                                        int i32 = 0;
                                        while (i32 < arrayList3.size()) {
                                            TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i32);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(MessageObject.getEmoji(document2));
                                            spannableStringBuilder2.setSpan(new y5(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
                                            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                                            i32++;
                                            arrayList3 = arrayList3;
                                        }
                                        c6 = 0;
                                        hashMap.put(pair, spannableStringBuilder);
                                        obj3 = spannableStringBuilder;
                                        CharSequence[] charSequenceArr = new CharSequence[2];
                                        charSequenceArr[c6] = str2;
                                        charSequenceArr[1] = obj3;
                                        arrayList.add(new Pair(valueOf, TextUtils.concat(charSequenceArr)));
                                        this.L1 = gr0Var.getLastEmojisHash();
                                    }
                                } else if (!k7Var.i || (obj2 = (CharSequence) hashMap.get(pair)) == null) {
                                    gr0Var = gr0Var2;
                                } else {
                                    gr0Var = gr0Var2;
                                    obj = obj2;
                                }
                                obj = "";
                            }
                            c6 = 0;
                            obj3 = obj;
                            CharSequence[] charSequenceArr2 = new CharSequence[2];
                            charSequenceArr2[c6] = str2;
                            charSequenceArr2[1] = obj3;
                            arrayList.add(new Pair(valueOf, TextUtils.concat(charSequenceArr2)));
                            this.L1 = gr0Var.getLastEmojisHash();
                        } else {
                            num = 0;
                            fs0Var2 = fs0Var3;
                            z16 = z15;
                        }
                        if (z19) {
                            arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                        }
                        if (!v0()) {
                            if (z14) {
                                arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                            }
                            if (zs0Var.d != null) {
                                arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                            }
                            if (iArr[0] > 0) {
                                if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && zs0Var.d == null) {
                                    arrayList.add(new Pair(num, LocaleController.getString(R.string.SharedMediaTabFull2)));
                                } else {
                                    arrayList.add(new Pair(num, LocaleController.getString(R.string.SharedMediaTab2)));
                                }
                            }
                            if (z16) {
                                arrayList.add(new Pair(12, LocaleController.getString(R.string.SavedMessagesTab2)));
                                MessagesController.getGlobalMainSettings().edit().putInt("savedhint", 3).apply();
                            }
                            if (iArr[1] > 0) {
                                arrayList.add(new Pair(1, LocaleController.getString(R.string.SharedFilesTab2)));
                            }
                            if (!DialogObject.isEncryptedDialog(j10)) {
                                if (iArr[3] > 0) {
                                    arrayList.add(new Pair(3, LocaleController.getString(R.string.SharedLinksTab2)));
                                }
                                if (iArr[4] > 0) {
                                    arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
                                }
                                if (iArr[8] > 0) {
                                    arrayList.add(new Pair(15, LocaleController.getString(R.string.SharedPollTab)));
                                }
                            } else if (iArr[4] > 0) {
                                arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
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
                                arrayList.add(new Pair(10, LocaleController.getString(j11 > 0 ? R.string.SimilarBotsTab : R.string.SimilarChannelsTab)));
                            }
                        }
                        fs0Var = fs0Var2;
                        if (fs0Var.j0) {
                            boolean z27 = this.Z0 instanceof TLRPC.TL_channelFull;
                            for (int i33 = 0; i33 < 15; i33++) {
                                if (d0(i33, z27) != null) {
                                    Integer valueOf2 = Integer.valueOf(i33);
                                    int i34 = 0;
                                    while (true) {
                                        if (i34 >= arrayList.size()) {
                                            bool = Boolean.FALSE;
                                            break;
                                        } else {
                                            if (((Pair) arrayList.get(i34)).first == valueOf2) {
                                                bool = Boolean.TRUE;
                                                break;
                                            }
                                            i34++;
                                        }
                                    }
                                    if (!bool.booleanValue()) {
                                        Integer valueOf3 = Integer.valueOf(i33);
                                        if (i33 == 0) {
                                            string = LocaleController.getString(R.string.SharedMediaTabFull2);
                                        } else if (i33 == 1) {
                                            string = LocaleController.getString(R.string.SharedFilesTab2);
                                        } else if (i33 == 2) {
                                            string = LocaleController.getString(R.string.SharedVoiceTab2);
                                        } else if (i33 == 3) {
                                            string = LocaleController.getString(R.string.SharedLinksTab2);
                                        } else if (i33 == 4) {
                                            string = LocaleController.getString(R.string.SharedMusicTab2);
                                        } else if (i33 == 5) {
                                            string = LocaleController.getString(R.string.SharedGIFsTab2);
                                        } else if (i33 == 8) {
                                            string = LocaleController.getString(R.string.ProfileStories);
                                        } else if (i33 != 14) {
                                            str = null;
                                            arrayList.add(new Pair(valueOf3, str));
                                        } else {
                                            string = LocaleController.getString(R.string.ProfileGifts);
                                        }
                                        str = string;
                                        arrayList.add(new Pair(valueOf3, str));
                                    }
                                }
                            }
                        }
                        if (profileTab != null) {
                            int e02 = e0(profileTab);
                            int i35 = 0;
                            while (true) {
                                if (i35 >= arrayList.size()) {
                                    i35 = -1;
                                    break;
                                } else if (((Integer) ((Pair) arrayList.get(i35)).first).intValue() == e02) {
                                    break;
                                } else {
                                    i35++;
                                }
                            }
                            if (i35 >= 0) {
                                i12 = 0;
                                arrayList.add(0, (Pair) arrayList.remove(i35));
                                if (!arrayList.isEmpty()) {
                                    this.N1 = ((Integer) ((Pair) arrayList.get(i12)).first).intValue();
                                }
                                size = arrayList.size();
                                i13 = 0;
                                while (i13 < size) {
                                    Object obj4 = arrayList.get(i13);
                                    i13++;
                                    Pair pair2 = (Pair) obj4;
                                    if (!fs0Var.d(((Integer) pair2.first).intValue())) {
                                        fs0Var.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, g10);
                                    }
                                }
                            }
                        }
                        i12 = 0;
                        if (!arrayList.isEmpty()) {
                        }
                        size = arrayList.size();
                        i13 = 0;
                        while (i13 < size) {
                        }
                    } else {
                        fs0Var = fs0Var3;
                    }
                    selectedTab = getSelectedTab();
                    if (selectedTab >= 0) {
                        this.g0[0].B = selectedTab;
                    }
                    this.M1 = fs0Var.j0;
                    fs0Var.c();
                    L0();
                    I();
                }
                z11 = z18;
                i11 = 14;
                v02 = v0();
                zs0 zs0Var2 = this.T;
                boolean z252 = z22;
                int[] iArr22 = this.T0;
                if (v02) {
                }
                if (i10 > 0) {
                }
                selectedTab = getSelectedTab();
                if (selectedTab >= 0) {
                }
                this.M1 = fs0Var.j0;
                fs0Var.c();
                L0();
                I();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z242 = z17;
        if (this.M1 == fs0Var3.j0) {
        }
        int i172 = this.M1 == fs0Var3.j0 ? 1 : 0;
        if ((!z21 || z23) == fs0Var3.d(8)) {
        }
        if (z19 != fs0Var3.d(13)) {
        }
        int i192 = i18;
        if (t0() == fs0Var3.d(8)) {
        }
        if (z22 == fs0Var3.d(14)) {
        }
        z11 = z18;
        i11 = 14;
        v02 = v0();
        zs0 zs0Var22 = this.T;
        boolean z2522 = z22;
        int[] iArr222 = this.T0;
        if (v02) {
        }
        if (i10 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.M1 = fs0Var.j0;
        fs0Var.c();
        L0();
        I();
    }

    public final SpannableStringBuilder w() {
        if (this.S1 == null) {
            this.S1 = new SpannableStringBuilder();
            if (r0()) {
                this.S1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.S1.append((CharSequence) "c");
                this.S1.setSpan(new iq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.S1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.S1;
    }

    public final Boolean w1(View view, View view2) {
        if (this.k1) {
            return null;
        }
        it0[] it0VarArr = this.g0;
        it0 it0Var = it0VarArr[0];
        if (it0Var == null) {
            return null;
        }
        int i10 = it0Var.B;
        this.l1 = i10;
        boolean p02 = p0(i10);
        int[] iArr = this.i1;
        int X = X(p02 ? 1 : 0, iArr[p02 ? 1 : 0], true);
        if (view != null && X == X(p02 ? 1 : 0, X, true)) {
            view.setEnabled(false);
            view.animate().alpha(0.5f).start();
        }
        if (iArr[p02 ? 1 : 0] != X) {
            if (view2 != null && !view2.isEnabled()) {
                view2.setEnabled(true);
                view2.animate().alpha(1.0f).start();
            }
            if (!p02) {
                SharedConfig.setMediaColumnsCount(X);
            } else if (c0(it0VarArr[0].B) >= 5 || w0(it0VarArr[0].B)) {
                SharedConfig.setStoriesColumnsCount(X);
            }
            B(X);
        }
        return Boolean.valueOf(X != X(p02 ? 1 : 0, X, true));
    }

    public final void x(j70 j70Var, org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10) {
        String publicUsername = j10 > 0 ? UserObject.getPublicUsername(MessagesController.getInstance(o2Var.getCurrentAccount()).getUser(Long.valueOf(j10))) : ChatObject.getPublicUsername(MessagesController.getInstance(o2Var.getCurrentAccount()).getChat(Long.valueOf(-j10)));
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        org.telegram.ui.th.w(sb2, MessagesController.getInstance(o2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        j70Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new g(this, sb2.toString(), o2Var, 24), false);
    }

    public final boolean x0() {
        if (C() && ((getClosestTab() == 8 || getClosestTab() == 13 || w0(getClosestTab())) && this.y1)) {
            return false;
        }
        gr0 gr0Var = this.R;
        if (gr0Var != null && gr0Var.g()) {
            return false;
        }
        kr0 kr0Var = this.S;
        return ((kr0Var != null && kr0Var.w) || this.k1 || this.c1) ? false : true;
    }

    public final Boolean x1(View view, View view2) {
        if (this.k1) {
            return null;
        }
        it0[] it0VarArr = this.g0;
        it0 it0Var = it0VarArr[0];
        if (it0Var == null) {
            return null;
        }
        if (this.g1 && p0(it0Var.B)) {
            return null;
        }
        int i10 = it0VarArr[0].B;
        this.l1 = i10;
        boolean p02 = p0(i10);
        int[] iArr = this.i1;
        int X = X(p02 ? 1 : 0, iArr[p02 ? 1 : 0], false);
        if (view2 != null && X == X(p02 ? 1 : 0, X, false)) {
            view2.setEnabled(false);
            view2.animate().alpha(0.5f).start();
        }
        if (iArr[p02 ? 1 : 0] != X) {
            if (view != null && !view.isEnabled()) {
                view.setEnabled(true);
                view.animate().alpha(1.0f).start();
            }
            if (!p02) {
                SharedConfig.setMediaColumnsCount(X);
            } else if (c0(it0VarArr[0].B) >= 5 || w0(it0VarArr[0].B)) {
                SharedConfig.setStoriesColumnsCount(X);
            }
            B(X);
        }
        return Boolean.valueOf(X != X(p02 ? 1 : 0, X, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0050, code lost:
    
        if (r3 != X(r0 ? 1 : 0, r3, true)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(j70 j70Var) {
        it0 it0Var;
        int x4 = j70Var.x();
        final int i10 = 0;
        j70Var.c(R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn), new Runnable(this) { // from class: org.telegram.ui.Components.wq0
            public final /* synthetic */ qu0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        qu0 qu0Var = this.b;
                        qu0Var.getClass();
                        View[] viewArr = r2;
                        qu0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        qu0 qu0Var2 = this.b;
                        qu0Var2.getClass();
                        View[] viewArr2 = r2;
                        qu0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        j70Var.c(R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut), new Runnable(this) { // from class: org.telegram.ui.Components.wq0
            public final /* synthetic */ qu0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        qu0 qu0Var = this.b;
                        qu0Var.getClass();
                        View[] viewArr = r2;
                        qu0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        qu0 qu0Var2 = this.b;
                        qu0Var2.getClass();
                        View[] viewArr2 = r2;
                        qu0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final View[] viewArr = {j70Var.w(x4), j70Var.w(x4 + 1)};
        it0[] it0VarArr = this.g0;
        if (it0VarArr != null && (it0Var = it0VarArr[0]) != null) {
            boolean p02 = p0(it0Var.B);
            int i12 = this.i1[p02 ? 1 : 0];
        }
        viewArr[0].setEnabled(false);
        viewArr[0].setAlpha(0.5f);
        if (E()) {
            return;
        }
        viewArr[1].setEnabled(false);
        viewArr[1].setAlpha(0.5f);
    }

    public final void y0(int i10, int i11, int i12, boolean z10) {
        fu0[] fu0VarArr = this.p1;
        fu0VarArr[i10].a.clear();
        fu0VarArr[i10].b[0].clear();
        fu0VarArr[i10].b[1].clear();
        fu0 fu0Var = fu0VarArr[i10];
        fu0Var.j[0] = i11;
        fu0Var.i[0] = false;
        fu0Var.l = false;
        fu0Var.m = i12;
        fu0Var.n = (fu0Var.e() - i12) - 1;
        fu0 fu0Var2 = fu0VarArr[i10];
        if (fu0Var2.n < 0) {
            fu0Var2.n = 0;
        }
        fu0Var2.k = i11;
        fu0Var2.o = true;
        fu0Var2.g = false;
        fu0Var2.p++;
        it0 W = W(i10);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (!z10) {
            return;
        }
        int i13 = 0;
        while (true) {
            it0[] it0VarArr = this.g0;
            if (i13 >= it0VarArr.length) {
                return;
            }
            it0 it0Var = it0VarArr[i13];
            if (it0Var.B == i10) {
                it0Var.x.h1(Math.min(fu0VarArr[i10].e() - 1, fu0VarArr[i10].m), 0);
            }
            i13++;
        }
    }

    public final void z(ht0 ht0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = ht0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ht0Var.getChildAt(i11);
            if (childAt instanceof p00) {
                view = childAt;
            }
        }
        if (view != null) {
            ht0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new ks0(this, ht0Var, sparseBooleanArray, (p00) view, i10));
    }

    public final void z0(boolean z10) {
        long j10 = this.B;
        if (j10 != 0 || t0()) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            final int i11 = Z1[i10];
            fu0[] fu0VarArr = this.p1;
            if (fu0VarArr[i11].h && !z10) {
                return;
            }
            long j11 = this.f1;
            if (DialogObject.isEncryptedDialog(j11)) {
                return;
            }
            fu0VarArr[i11].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i11 == 0) {
                int i12 = fu0VarArr[i11].q;
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
            org.telegram.ui.ActionBar.o2 o2Var = this.r1;
            tL_messages_getSearchResultsPositions.peer = o2Var.getMessagesController().getInputPeer(j11);
            if (j10 != 0 && o2Var.getUserConfig().getClientUserId() == j11) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = o2Var.getMessagesController().getInputPeer(j10);
            }
            final int i13 = fu0VarArr[i11].p;
            ConnectionsManager.getInstance(o2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(o2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() { // from class: org.telegram.ui.Components.lq0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new sq0(qu0.this, tL_error, i13, i11, tLObject, 0));
                }
            }), o2Var.getClassGuid());
        }
    }

    public void D0(SparseArray sparseArray) {
    }

    public void E0() {
    }

    public void K0(boolean z10) {
    }

    public void N0(boolean z10) {
    }

    public int V0(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Cells.l2
    public final void a(org.telegram.ui.Cells.p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.l2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.l2
    public final void d(org.telegram.ui.Cells.p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.l2
    public final void f(org.telegram.ui.Cells.p2 p2Var) {
    }

    public void o0() {
    }
}
