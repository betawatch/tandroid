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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class bw0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.o2 {
    public static final int[] d2 = {0, 1, 2, 4};
    public static final ns0 e2 = new ns0(0);
    public final NumberTextView A0;
    public int A1;
    public final ka B0;
    public VelocityTracker B1;
    public final ImageView C0;
    public boolean C1;
    public final org.telegram.ui.ActionBar.g2 D0;
    public final nu0 D1;
    public final int E;
    public final ArrayList E0;
    public z40 E1;
    public final long F;
    public final ArrayList F0;
    public final org.telegram.ui.ActionBar.e6 F1;
    public final org.telegram.ui.ActionBar.k G;
    public final ArrayList G0;
    public final NotificationCenter.ObserversGroup G1;
    public final gu0 H;
    public final ArrayList H0;
    public boolean H1;
    public final vv0 I;
    public final rt0 I0;
    public final AnimationNotificationsLocker I1;
    public final pv0 J;
    public final ot0 J0;
    public zk J1;
    public final ov0 K;
    public final org.telegram.ui.Cells.w0 K0;
    public int K1;
    public final ov0 L;
    public AnimatorSet L0;
    public boolean L1;
    public final ov0 M;
    public final vr0 M0;
    public int M1;
    public final iv0 N;
    public final ArrayList N0;
    public AnimatorSet N1;
    public final pu0 O;
    public float O0;
    public final SparseArray O1;
    public final mu0 P;
    public final at P0;
    public long P1;
    public final ku0 Q;
    public final FrameLayout Q0;
    public boolean Q1;
    public final lv0 R;
    public final nt0 R0;
    public int R1;
    public final mv0 S;
    public final int S0;
    public final yt0 S1;
    public final hu0 T;
    public final Paint T0;
    public ai.e9 T1;
    public final qs0 U;
    public boolean U0;
    public float U1;
    public final rs0 V;
    public boolean V0;
    public boolean V1;
    public final ws0 W;
    public zg.n0 W0;
    public SpannableStringBuilder W1;
    public final int[] X0;
    public int X1;
    public int Y0;
    public final HashMap Y1;
    public final SparseArray[] Z0;
    public final HashMap Z1;
    public boolean a;
    public final lu0 a0;
    public int a1;
    public int a2;
    public boolean b;
    public final s4.z b0;
    public boolean b1;
    public int b2;
    public boolean c;
    public final ju0 c0;
    public long c1;
    public final nh c2;
    public boolean d;
    public final yv0 d0;
    public TLRPC.ChatFull d1;
    public int e;
    public final ps0 e0;
    public TLRPC.UserFull e1;
    public int f;
    public final yv0 f0;
    public AnimatorSet f1;
    public final xu0 g0;
    public boolean g1;
    public float h;
    public final xu0 h0;
    public boolean h1;
    public final xu0 i0;
    public boolean i1;
    public final su0 j0;
    public final long j1;
    public final uu0[] k0;
    public boolean k1;
    public final org.telegram.ui.ActionBar.v0 l0;
    public boolean l1;
    public final org.telegram.ui.ActionBar.v0 m0;
    public final int[] m1;
    public float n;
    public final org.telegram.ui.ActionBar.v0 n0;
    public float n1;
    public float o0;
    public boolean o1;
    public float p0;
    public int p1;
    public final TextView q0;
    public int q1;
    public boolean r;
    public final ImageView r0;
    public final bt0 r1;
    public int s;
    public final fk0 s0;
    public float s1;
    public final org.telegram.ui.ActionBar.v0 t0;
    public final qv0[] t1;
    public final org.telegram.ui.ActionBar.v0 u0;
    public final tv0 u1;
    public int v;
    public final org.telegram.ui.ActionBar.v0 v0;
    public final org.telegram.ui.ActionBar.n2 v1;
    public int w;
    public final org.telegram.ui.ActionBar.v0 w0;
    public int w1;
    public final Rect x;
    public int x0;
    public boolean x1;
    public final j10 y;
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
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b40  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0b49 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0c4f A[EDGE_INSN: B:169:0x0c4f->B:170:0x0c4f BREAK  A[LOOP:3: B:140:0x091d->B:166:0x0b49], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0c55  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0cb6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0e24  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0e2b A[ADDED_TO_REGION] */
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
    public bw0(Context context, long j3, tv0 tv0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, org.telegram.ui.ActionBar.n2 n2Var, nu0 nu0Var, int i13, org.telegram.ui.ActionBar.e6 e6Var, ah.c cVar) {
        super(context);
        int i14;
        TLRPC.ProfileTab profileTab;
        int i15;
        qv0[] qv0VarArr;
        int i16;
        ot0 ot0Var;
        int i17;
        int i18;
        lv0 lv0Var;
        ImageView imageView;
        Context context2;
        org.telegram.ui.ActionBar.v0 v0Var;
        float f7;
        org.telegram.ui.ActionBar.e6 e6Var2;
        bw0 bw0Var;
        int i19;
        int i20;
        int i21;
        uu0[] uu0VarArr;
        View view;
        boolean N;
        bw0 bw0Var2;
        ws0 ws0Var;
        int i22;
        int i23;
        ys0 ys0Var;
        tu0 tu0Var;
        tu0 tu0Var2;
        tu0 tu0Var3;
        tu0 tu0Var4;
        tu0 tu0Var5;
        tu0 tu0Var6;
        tu0 tu0Var7;
        tu0 tu0Var8;
        tu0 tu0Var9;
        tu0 tu0Var10;
        tu0 tu0Var11;
        tu0 tu0Var12;
        tu0 tu0Var13;
        tu0 tu0Var14;
        tu0 tu0Var15;
        j10 j10Var;
        j10 j10Var2;
        j10 j10Var3;
        j10 j10Var4;
        ay0 ay0Var;
        ay0 ay0Var2;
        ay0 ay0Var3;
        ay0 ay0Var4;
        ay0 ay0Var5;
        ay0 ay0Var6;
        ay0 ay0Var7;
        ay0 ay0Var8;
        ay0 ay0Var9;
        ay0 ay0Var10;
        j10 j10Var5;
        tu0 tu0Var16;
        ay0 ay0Var11;
        tu0 tu0Var17;
        tu0 tu0Var18;
        uu0 uu0Var;
        ys0 ys0Var2;
        tu0 tu0Var19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        TL_bots.BotInfo botInfo;
        bw0 bw0Var3 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        bw0Var3.x = new Rect();
        bw0Var3.k0 = new uu0[2];
        bw0Var3.E0 = new ArrayList(10);
        bw0Var3.F0 = new ArrayList(10);
        bw0Var3.G0 = new ArrayList(10);
        bw0Var3.H0 = new ArrayList(10);
        bw0Var3.M0 = new vr0(bw0Var3, 2);
        bw0Var3.N0 = new ArrayList();
        bw0Var3.T0 = new Paint();
        bw0Var3.Z0 = new SparseArray[]{new SparseArray(), new SparseArray()};
        bw0Var3.k1 = false;
        bw0Var3.l1 = false;
        bw0Var3.m1 = new int[]{3, 3};
        bw0Var3.r1 = new bt0(bw0Var3);
        bw0Var3.s1 = -5.0f;
        bw0Var3.t1 = new qv0[9];
        bw0Var3.I1 = new AnimationNotificationsLocker();
        bw0Var3.O1 = new SparseArray();
        bw0Var3.R1 = -1;
        bw0Var3.S1 = new yt0(bw0Var3);
        bw0Var3.U1 = 0.0f;
        bw0Var3.Y1 = new HashMap();
        bw0Var3.Z1 = new HashMap();
        fh.c cVar2 = new fh.c();
        cVar2.a(bw0Var3.h0(org.telegram.ui.ActionBar.i6.d6));
        ah.c cVar3 = cVar == null ? new ah.c(cVar2) : cVar;
        bw0Var3.E = i13;
        bw0Var3.F1 = e6Var;
        j10 j10Var6 = new j10(context);
        bw0Var3.y = j10Var6;
        j10Var6.setIsSingleCell(true);
        TLRPC.User user = n2Var.getMessagesController().getUser(Long.valueOf(j3));
        bw0Var3.u1 = tv0Var;
        bw0Var3.D1 = nu0Var;
        int[] iArr = tv0Var.c;
        long j10 = tv0Var.s;
        bw0Var3.F = j10;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j10 == 0 ? i10 : 0, iArr[7], iArr[8]};
        bw0Var3.X0 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            if (chatFull2 == null) {
                i14 = 1;
                profileTab = null;
                if (i11 != 14 || i11 == 10 || i11 == 11 || i11 == 6) {
                    bw0Var3.Y0 = i11;
                } else if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    bw0Var3.Y0 = 13;
                } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                    bw0Var3.Y0 = 8;
                } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || bw0Var3.v0()))) {
                    bw0Var3.Y0 = 8;
                } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                    if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                        int i29 = iArr2[i14];
                        i24 = -1;
                        if (i29 == -1 || i29 > 0) {
                            bw0Var3.Y0 = i14;
                        }
                    } else {
                        i24 = -1;
                    }
                    if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i28 = iArr2[5]) == i24 || i28 > 0)) {
                        bw0Var3.Y0 = 5;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i27 = iArr2[3]) == i24 || i27 > 0)) {
                        bw0Var3.Y0 = 3;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i26 = iArr2[4]) == i24 || i26 > 0)) {
                        bw0Var3.Y0 = 4;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i25 = iArr2[2]) == i24 || i25 > 0)) {
                        bw0Var3.Y0 = 2;
                    } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || bw0Var3.v0())) {
                        bw0Var3.Y0 = bw0Var3.getInitialTab();
                    } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                        int i30 = -1;
                        if (i11 == -1 || j10 != 0) {
                            int i31 = 0;
                            while (true) {
                                int[] iArr3 = bw0Var3.X0;
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
                            bw0Var3.Y0 = i31;
                        } else {
                            bw0Var3.Y0 = i11;
                        }
                    } else {
                        bw0Var3.Y0 = 14;
                    }
                } else {
                    bw0Var3.Y0 = 14;
                }
                bw0Var3.M0(i11);
                bw0Var3.d1 = chatFull2;
                bw0Var3.e1 = userFull;
                if (chatFull2 != null) {
                    bw0Var3.c1 = -chatFull2.migrated_from_chat_id;
                }
                bw0Var3.j1 = j3;
                i15 = 0;
                while (true) {
                    qv0VarArr = bw0Var3.t1;
                    if (i15 < qv0VarArr.length) {
                        break;
                    }
                    qv0VarArr[i15] = new qv0();
                    bw0Var3.t1[i15].j[0] = DialogObject.isEncryptedDialog(bw0Var3.j1) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
                    bw0Var3.t1[i15].j[1] = Integer.MAX_VALUE;
                    bw0Var3.R(i15);
                    if (bw0Var3.c1 != 0 && bw0Var3.d1 != null && bw0Var3.t1[i15].b[1].size() == 0) {
                        qv0 qv0Var = bw0Var3.t1[i15];
                        qv0Var.j[1] = bw0Var3.d1.migrated_from_max_id;
                        qv0Var.i[1] = false;
                    }
                    i15++;
                }
                bw0Var3.v1 = n2Var;
                bw0Var3.G = n2Var.getActionBar();
                bw0Var3.m1[0] = bw0Var3.S0() > 0 ? SharedConfig.mediaColumnsCount : bw0Var3.S0();
                bw0Var3.m1[1] = bw0Var3.S0() > 0 ? SharedConfig.storiesColumnsCount : bw0Var3.S0();
                bw0Var3.G1 = n2Var.getNotificationCenter().createObserversGroup(bw0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
                for (i16 = 0; i16 < 10; i16++) {
                    if (i11 == 4) {
                        mt0 mt0Var = new mt0(bw0Var3, context);
                        mt0Var.T.c();
                        bw0Var3.G0.add(mt0Var);
                    }
                }
                bw0Var3.S0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                bw0Var3.V0 = false;
                bw0Var3.W0 = null;
                ot0Var = bw0Var3.J0;
                if (ot0Var != null) {
                    ot0Var.g(false);
                }
                bw0Var3.U0 = false;
                Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
                bw0Var3.y0 = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(bw0Var3.h0(org.telegram.ui.ActionBar.i6.b7), PorterDuff.Mode.MULTIPLY));
                rt0 rt0Var = bw0Var3.I0;
                int currentTabId = rt0Var == null ? rt0Var.getCurrentTabId() : i11;
                rt0 rt0Var2 = new rt0(bw0Var3, context, bw0Var3.F1);
                i17 = bw0Var3.Y0;
                if (i17 != -1) {
                    rt0Var2.setInitialTabId(i17);
                    bw0Var3.Y0 = -1;
                }
                rt0Var2.b0 = 320L;
                int i33 = org.telegram.ui.ActionBar.i6.Fh;
                int i34 = org.telegram.ui.ActionBar.i6.Eh;
                rt0Var2.L = i33;
                rt0Var2.M = i34;
                rt0Var2.e();
                rt0Var2.setUseMinimalWidth(true);
                rt0Var2.setDelegate(new tt0(bw0Var3));
                bw0Var3.I0 = rt0Var2;
                for (i18 = 1; i18 >= 0; i18--) {
                    bw0Var3.Z0[i18].clear();
                }
                bw0Var3.a1 = 0;
                bw0Var3.N0.clear();
                lv0Var = bw0Var3.R;
                if (lv0Var != null) {
                    lv0Var.w.clear();
                }
                if (!(bw0Var3 instanceof p40)) {
                    org.telegram.ui.ActionBar.z o9 = bw0Var3.G.o();
                    o9.addOnLayoutChangeListener(new st0(bw0Var3));
                    if (bw0Var3.j1 == bw0Var3.v1.getUserConfig().getClientUserId() && (bw0Var3.v1 instanceof db0) && bw0Var3.D()) {
                        bw0Var3.m0 = o9.a(11, R.drawable.outline_header_search);
                    }
                    org.telegram.ui.ActionBar.v0 a2 = o9.a(0, 0);
                    a2.F();
                    a2.H = new zt0(bw0Var3);
                    bw0Var3.n0 = a2;
                    a2.setTranslationY(AndroidUtilities.dp(10.0f));
                    ot0 ot0Var2 = bw0Var3.J0;
                    a2.setSearchFieldHint(LocaleController.getString((ot0Var2 != null && ot0Var2.a() && bw0Var3.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
                    a2.setContentDescription(LocaleController.getString("Search", R.string.Search));
                    a2.setVisibility(bw0Var3.v0() ? 8 : 4);
                }
                imageView = new ImageView(context);
                bw0Var3.r0 = imageView;
                imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
                imageView.setTranslationY(AndroidUtilities.dp(10.0f));
                imageView.setVisibility(4);
                if (!bw0Var3.q0() && !bw0Var3.t0()) {
                    bw0Var3.G.addView(imageView, w7.x5.e(48, 56, 85));
                    fk0 fk0Var = new fk0(context);
                    bw0Var3.s0 = fk0Var;
                    fk0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    fk0Var.e(R.raw.options_to_search, 24, 24);
                    fk0Var.getAnimatedDrawable().F *= 2.0f;
                    fk0Var.getAnimatedDrawable().h = true;
                    fk0Var.setColorFilter(new PorterDuffColorFilter(bw0Var3.h0(org.telegram.ui.ActionBar.i6.y8), PorterDuff.Mode.SRC_IN));
                    fk0Var.setVisibility(8);
                    bw0Var3.G.addView(fk0Var, w7.x5.e(48, 56, 85));
                }
                int i35 = 5;
                context2 = context;
                imageView.setOnClickListener(new fu0(bw0Var3, j3, e6Var, context));
                v0Var = bw0Var3.n0;
                if (v0Var != null) {
                    EditTextBoldCursor searchField = v0Var.getSearchField();
                    int i36 = org.telegram.ui.ActionBar.i6.G6;
                    searchField.setTextColor(bw0Var3.h0(i36));
                    searchField.setHintTextColor(bw0Var3.h0(org.telegram.ui.ActionBar.i6.Si));
                    searchField.setCursorColor(bw0Var3.h0(i36));
                }
                bw0Var3.x0 = 0;
                org.telegram.ui.ActionBar.n2 n2Var2 = bw0Var3.v1;
                sw0 sw0Var = (n2Var2 == null && (n2Var2.getFragmentView() instanceof sw0)) ? (sw0) bw0Var3.v1.getFragmentView() : null;
                ka kaVar = new ka(context2, sw0Var);
                bw0Var3.B0 = kaVar;
                kaVar.setBackgroundColor(bw0Var3.h0(org.telegram.ui.ActionBar.i6.a7));
                kaVar.setAlpha(0.0f);
                kaVar.setClickable(true);
                kaVar.setVisibility(4);
                ImageView imageView2 = new ImageView(context2);
                bw0Var3.C0 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(true);
                bw0Var3.D0 = g2Var;
                imageView2.setImageDrawable(g2Var);
                int i37 = org.telegram.ui.ActionBar.i6.y8;
                g2Var.a(bw0Var3.h0(i37));
                int i38 = org.telegram.ui.ActionBar.i6.z8;
                imageView2.setBackground(org.telegram.ui.ActionBar.i6.f0(bw0Var3.h0(i38), 1));
                imageView2.setContentDescription(LocaleController.getString("Close", R.string.Close));
                kaVar.addView(imageView2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                bw0Var3.N0.add(imageView2);
                imageView2.setOnClickListener(new xr0(bw0Var3, 0));
                NumberTextView numberTextView = new NumberTextView(context2);
                bw0Var3.A0 = numberTextView;
                numberTextView.setTextSize(18);
                numberTextView.setTypeface(AndroidUtilities.bold());
                numberTextView.setTextColor(bw0Var3.h0(i37));
                kaVar.addView(numberTextView, w7.x5.m(1.0f, 0, -1, 18, 0, 0));
                bw0Var3.N0.add(numberTextView);
                if (!DialogObject.isEncryptedDialog(bw0Var3.j1)) {
                    if (!bw0Var3.v0()) {
                        org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(bw0Var3.h0(i38), bw0Var3.h0(i37), context2, false);
                        bw0Var3.u0 = v0Var2;
                        v0Var2.setIcon(R.drawable.msg_message);
                        v0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrGoToMessage));
                        v0Var2.setDuplicateParentStateEnabled(false);
                        kaVar.addView(v0Var2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        bw0Var3.N0.add(v0Var2);
                        v0Var2.setOnClickListener(new xr0(bw0Var3, 1));
                        org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(bw0Var3.h0(i38), bw0Var3.h0(i37), context2, false);
                        bw0Var3.t0 = v0Var3;
                        v0Var3.setIcon(R.drawable.msg_forward);
                        v0Var3.setContentDescription(LocaleController.getString(R.string.Forward));
                        v0Var3.setDuplicateParentStateEnabled(false);
                        kaVar.addView(v0Var3, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        bw0Var3.N0.add(v0Var3);
                        v0Var3.setOnClickListener(new xr0(bw0Var3, 2));
                    }
                    org.telegram.ui.ActionBar.v0 v0Var4 = new org.telegram.ui.ActionBar.v0(bw0Var3.h0(i38), bw0Var3.h0(i37), context2, false);
                    bw0Var3.v0 = v0Var4;
                    v0Var4.setIcon(R.drawable.msg_pin);
                    v0Var4.setContentDescription(LocaleController.getString(R.string.PinMessage));
                    v0Var4.setDuplicateParentStateEnabled(false);
                    v0Var4.setVisibility(8);
                    kaVar.addView(v0Var4, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    bw0Var3.N0.add(v0Var4);
                    v0Var4.setOnClickListener(new xr0(bw0Var3, 3));
                    org.telegram.ui.ActionBar.v0 v0Var5 = new org.telegram.ui.ActionBar.v0(bw0Var3.h0(i38), bw0Var3.h0(i37), context2, false);
                    bw0Var3.w0 = v0Var5;
                    v0Var5.setIcon(R.drawable.msg_unpin);
                    v0Var5.setContentDescription(LocaleController.getString(R.string.UnpinMessage));
                    v0Var5.setDuplicateParentStateEnabled(false);
                    v0Var5.setVisibility(8);
                    kaVar.addView(v0Var5, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    bw0Var3.N0.add(v0Var5);
                    v0Var5.setOnClickListener(new xr0(bw0Var3, 4));
                    bw0Var3.p1();
                }
                org.telegram.ui.ActionBar.v0 v0Var6 = new org.telegram.ui.ActionBar.v0(bw0Var3.h0(i38), bw0Var3.h0(i37), context2, false);
                bw0Var3.l0 = v0Var6;
                v0Var6.setIcon(R.drawable.msg_delete);
                v0Var6.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
                v0Var6.setDuplicateParentStateEnabled(false);
                kaVar.addView(v0Var6, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                bw0Var3.N0.add(v0Var6);
                v0Var6.setOnClickListener(new xr0(bw0Var3, i35));
                bw0Var3.H = new gu0(bw0Var3, context2);
                bw0Var3.I = new vv0(bw0Var3, context2);
                bw0Var3.K = new ov0(bw0Var3, context2, 1);
                bw0Var3.L = new ov0(bw0Var3, context2, 2);
                bw0Var3.M = new ov0(bw0Var3, context2, 4);
                bw0Var3.N = new iv0(bw0Var3, context2, bw0Var3.v1.getCurrentAccount(), bw0Var3.v1.getResourceProvider());
                bw0Var3.O = new pu0(bw0Var3, context2);
                bw0Var3.g0 = new xu0(bw0Var3, context2, 1);
                bw0Var3.h0 = new xu0(bw0Var3, context2, 4);
                bw0Var3.i0 = new xu0(bw0Var3, context2, 3);
                bw0Var3.j0 = new su0(bw0Var3, context2);
                bw0Var3.P = new mu0(bw0Var3, context2);
                bw0Var3.Q = new ku0(bw0Var3, context2);
                bw0Var3.R = new lv0(bw0Var3, context2);
                bw0Var3.S = new mv0(bw0Var3, context2);
                if (!bw0Var3.v0() && !bw0Var3.l0() && bw0Var3.F == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", bw0Var3.v1.getUserConfig().getClientUserId());
                    bundle.putInt("chatMode", 3);
                    hu0 hu0Var = new hu0(bw0Var3, context2, bw0Var3.v1.getParentLayout(), bundle);
                    bw0Var3.T = hu0Var;
                    long j11 = bw0Var3.j1;
                    org.telegram.ui.ao aoVar = hu0Var.a;
                    aoVar.d4 = j11;
                    aoVar.Qa = true;
                    hu0Var.setClipToOutline(true);
                    hu0Var.setOutlineProvider(new iu0());
                }
                lu0 lu0Var = new lu0(bw0Var3, context2);
                bw0Var3.a0 = lu0Var;
                if (bw0Var3.F == 0) {
                    lu0Var.e = arrayList;
                    lu0Var.d = currentTabId != 7 ? null : chatFull2;
                }
                bw0Var3.c0 = new ju0(bw0Var3, context2);
                bw0Var3.b0 = new s4.z(new os0(bw0Var3));
                bw0Var3.d0 = new yv0(bw0Var3, context2, false);
                bw0Var3.e0 = new ps0(bw0Var3, context2);
                bw0Var3.f0 = new yv0(bw0Var3, context2, true);
                bw0Var3.J = new pv0(bw0Var3, context2);
                f7 = 48.0f;
                if (!bw0Var3.r0()) {
                    bw0Var3.U = new qs0(bw0Var3, context2, bw0Var3.v1, bw0Var3.j1);
                } else if (bw0Var3.v1 instanceof ProfileActivity) {
                    TextView textView = new TextView(context2);
                    bw0Var3.q0 = textView;
                    textView.setText(LocaleController.getString(R.string.Save).toUpperCase());
                    textView.setTypeface(AndroidUtilities.bold());
                    int i39 = org.telegram.ui.ActionBar.i6.Oh;
                    textView.setTextColor(bw0Var3.h0(i39));
                    textView.setTextSize(1, 15.0f);
                    textView.setGravity(17);
                    textView.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.m1(0.15f, bw0Var3.h0(i39)), 3));
                    textView.setPadding(AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f), 0);
                    bw0Var3.G.addView(textView, w7.x5.e(-2, 56, 85));
                    textView.setOnClickListener(new xr0(bw0Var3, 6));
                    textView.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setScaleX(0.4f);
                    textView.setScaleY(0.4f);
                    org.telegram.ui.ActionBar.n2 n2Var3 = bw0Var3.v1;
                    e6Var2 = e6Var;
                    rs0 rs0Var = new rs0(n2Var3.getCurrentAccount(), ((ProfileActivity) bw0Var3.v1).a(), context2, n2Var3, e6Var2, bw0Var3);
                    context2 = context2;
                    bw0 bw0Var4 = bw0Var3;
                    bw0Var4.V = rs0Var;
                    int dp = AndroidUtilities.dp(48.0f);
                    at atVar = bw0Var4.P0;
                    rs0Var.setPaddingTop(dp + (atVar != null ? (int) atVar.c(0.0f) : 0));
                    bw0Var4.W = new ws0(bw0Var4, context2, sw0Var, bw0Var4.getStoriesController().B(bw0Var4.j1, true), new vs0(bw0Var4, context2, n2Var, e6Var2));
                    bw0Var = bw0Var4;
                    bw0Var.setWillNotDraw(false);
                    i19 = 0;
                    i20 = -1;
                    i21 = 0;
                    while (true) {
                        uu0VarArr = bw0Var.k0;
                        if (i21 >= uu0VarArr.length) {
                            break;
                        }
                        if (i21 == 0 && (uu0Var = uu0VarArr[i21]) != null && (ys0Var2 = uu0Var.x) != null) {
                            i20 = ys0Var2.L0();
                            if (i20 != bw0Var.k0[i21].x.B() - 1) {
                                tu0Var19 = bw0Var.k0[i21].h;
                                am0 am0Var = (am0) tu0Var19.K(i20);
                                if (am0Var != null) {
                                    i19 = am0Var.a.getTop();
                                } else {
                                    i20 = -1;
                                }
                            } else {
                                i22 = i19;
                                i23 = -1;
                                xs0 xs0Var = new xs0(bw0Var, context2);
                                bw0Var.addView(xs0Var, w7.x5.a(-1.0f, 0.0f, bw0Var.B0(), 0.0f, 0.0f, -1, 51));
                                if (i21 == 1) {
                                    xs0Var.setTranslationX(AndroidUtilities.displaySize.x);
                                }
                                bw0Var.k0[i21] = xs0Var;
                                ys0Var = new ys0(bw0Var, xs0Var);
                                xs0Var.x = ys0Var;
                                ys0Var.z1(new zs0(bw0Var, xs0Var));
                                bw0Var.k0[i21].d = new s4.j();
                                bw0Var.k0[i21].d.n(280L);
                                bw0Var.k0[i21].d.o(hs.h);
                                uu0 uu0Var2 = bw0Var.k0[i21];
                                uu0Var2.d.m = false;
                                uu0Var2.h = new at0(bw0Var, context2, xs0Var, ys0Var);
                                tu0Var = bw0Var.k0[i21].h;
                                tu0Var.setFastScrollEnabled(1);
                                tu0Var2 = bw0Var.k0[i21].h;
                                tu0Var2.setScrollingTouchSlop(1);
                                tu0Var3 = bw0Var.k0[i21].h;
                                tu0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
                                tu0Var4 = bw0Var.k0[i21].h;
                                tu0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                                tu0Var5 = bw0Var.k0[i21].h;
                                tu0Var5.setItemAnimator(null);
                                tu0Var6 = bw0Var.k0[i21].h;
                                tu0Var6.setClipToPadding(false);
                                tu0Var7 = bw0Var.k0[i21].h;
                                tu0Var7.setSectionsType(2);
                                tu0Var8 = bw0Var.k0[i21].h;
                                tu0Var8.setLayoutManager(ys0Var);
                                uu0 uu0Var3 = bw0Var.k0[i21];
                                tu0Var9 = uu0Var3.h;
                                uu0Var3.addView(tu0Var9, w7.x5.d(-1.0f, -1));
                                bw0Var.k0[i21].r = new tu0(context2, null);
                                uu0 uu0Var4 = bw0Var.k0[i21];
                                tu0 tu0Var20 = uu0Var4.r;
                                ct0 ct0Var = new ct0(bw0Var);
                                uu0Var4.s = ct0Var;
                                tu0Var20.setLayoutManager(ct0Var);
                                uu0 uu0Var5 = bw0Var.k0[i21];
                                uu0Var5.addView(uu0Var5.r, w7.x5.d(-1.0f, -1));
                                bw0Var.k0[i21].r.setVisibility(8);
                                bw0Var.k0[i21].r.i(new dt0(xs0Var));
                                tu0Var10 = bw0Var.k0[i21].h;
                                tu0Var10.i(new et0(bw0Var, xs0Var));
                                tu0Var11 = bw0Var.k0[i21].h;
                                float f10 = f7;
                                tu0Var11.setOnItemClickListener(new org.telegram.ui.xe(bw0Var, xs0Var, context2, j3, e6Var2, 1));
                                tu0Var12 = bw0Var.k0[i21].h;
                                tu0Var12.setOnScrollListener(new gt0(bw0Var, xs0Var, ys0Var));
                                tu0Var13 = bw0Var.k0[i21].h;
                                tu0Var13.setOnItemLongClickListener(new ht0(bw0Var, xs0Var));
                                if (i21 == 0 && i23 != -1) {
                                    ys0Var.h1(i23, i22);
                                }
                                tu0Var14 = bw0Var.k0[i21].h;
                                bw0Var.k0[i21].y = new it0(context2, tu0Var14);
                                bw0Var.k0[i21].y.setVisibility(8);
                                tu0Var15 = bw0Var.k0[i21].h;
                                tu0Var15.D0(bw0Var.k0[i21].y, w7.x5.d(-1.0f, -1));
                                bw0Var.k0[i21].v = new jt0(bw0Var, context2, xs0Var);
                                j10Var = bw0Var.k0[i21].v;
                                j10Var.g();
                                j10Var2 = bw0Var.k0[i21].v;
                                j10Var2.setClipToOutline(true);
                                j10Var3 = bw0Var.k0[i21].v;
                                j10Var3.setOutlineProvider(new kt0());
                                if (i21 == 0) {
                                    bw0Var.k0[i21].setVisibility(8);
                                }
                                uu0 uu0Var6 = bw0Var.k0[i21];
                                j10Var4 = uu0Var6.v;
                                uu0Var6.w = new lt0(bw0Var, context2, j10Var4);
                                ay0Var = bw0Var.k0[i21].w;
                                ay0Var.d(8, false);
                                ay0Var2 = bw0Var.k0[i21].w;
                                ay0Var2.setAnimateLayoutChange(true);
                                uu0 uu0Var7 = bw0Var.k0[i21];
                                ay0Var3 = uu0Var7.w;
                                uu0Var7.addView(ay0Var3, w7.x5.d(-1.0f, -1));
                                ay0Var4 = bw0Var.k0[i21].w;
                                ay0Var4.setOnTouchListener(new bi.d(23));
                                ay0Var5 = bw0Var.k0[i21].w;
                                ay0Var5.e(true, false);
                                ay0Var6 = bw0Var.k0[i21].w;
                                ay0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                ay0Var7 = bw0Var.k0[i21].w;
                                ay0Var7.f.setVisibility(8);
                                ay0Var8 = bw0Var.k0[i21].w;
                                ay0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                ay0Var9 = bw0Var.k0[i21].w;
                                ay0Var9.f.setVisibility(8);
                                ay0Var10 = bw0Var.k0[i21].w;
                                j10Var5 = bw0Var.k0[i21].v;
                                ay0Var10.addView(j10Var5, w7.x5.a(-1.0f, 12.0f, 60.0f, 12.0f, 12.0f, -1, 119));
                                tu0Var16 = bw0Var.k0[i21].h;
                                ay0Var11 = bw0Var.k0[i21].w;
                                tu0Var16.setEmptyView(ay0Var11);
                                tu0Var17 = bw0Var.k0[i21].h;
                                tu0Var17.m1(0, true);
                                uu0[] uu0VarArr2 = bw0Var.k0;
                                uu0 uu0Var8 = uu0VarArr2[i21];
                                tu0Var18 = uu0VarArr2[i21].h;
                                uu0Var8.E = new tl0(tu0Var18, bw0Var.k0[i21].x);
                                i21++;
                                f7 = f10;
                                e6Var2 = e6Var;
                                i19 = i22;
                                i20 = i23;
                            }
                        }
                        i22 = i19;
                        i23 = i20;
                        xs0 xs0Var2 = new xs0(bw0Var, context2);
                        bw0Var.addView(xs0Var2, w7.x5.a(-1.0f, 0.0f, bw0Var.B0(), 0.0f, 0.0f, -1, 51));
                        if (i21 == 1) {
                        }
                        bw0Var.k0[i21] = xs0Var2;
                        ys0Var = new ys0(bw0Var, xs0Var2);
                        xs0Var2.x = ys0Var;
                        ys0Var.z1(new zs0(bw0Var, xs0Var2));
                        bw0Var.k0[i21].d = new s4.j();
                        bw0Var.k0[i21].d.n(280L);
                        bw0Var.k0[i21].d.o(hs.h);
                        uu0 uu0Var22 = bw0Var.k0[i21];
                        uu0Var22.d.m = false;
                        uu0Var22.h = new at0(bw0Var, context2, xs0Var2, ys0Var);
                        tu0Var = bw0Var.k0[i21].h;
                        tu0Var.setFastScrollEnabled(1);
                        tu0Var2 = bw0Var.k0[i21].h;
                        tu0Var2.setScrollingTouchSlop(1);
                        tu0Var3 = bw0Var.k0[i21].h;
                        tu0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
                        tu0Var4 = bw0Var.k0[i21].h;
                        tu0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                        tu0Var5 = bw0Var.k0[i21].h;
                        tu0Var5.setItemAnimator(null);
                        tu0Var6 = bw0Var.k0[i21].h;
                        tu0Var6.setClipToPadding(false);
                        tu0Var7 = bw0Var.k0[i21].h;
                        tu0Var7.setSectionsType(2);
                        tu0Var8 = bw0Var.k0[i21].h;
                        tu0Var8.setLayoutManager(ys0Var);
                        uu0 uu0Var32 = bw0Var.k0[i21];
                        tu0Var9 = uu0Var32.h;
                        uu0Var32.addView(tu0Var9, w7.x5.d(-1.0f, -1));
                        bw0Var.k0[i21].r = new tu0(context2, null);
                        uu0 uu0Var42 = bw0Var.k0[i21];
                        tu0 tu0Var202 = uu0Var42.r;
                        ct0 ct0Var2 = new ct0(bw0Var);
                        uu0Var42.s = ct0Var2;
                        tu0Var202.setLayoutManager(ct0Var2);
                        uu0 uu0Var52 = bw0Var.k0[i21];
                        uu0Var52.addView(uu0Var52.r, w7.x5.d(-1.0f, -1));
                        bw0Var.k0[i21].r.setVisibility(8);
                        bw0Var.k0[i21].r.i(new dt0(xs0Var2));
                        tu0Var10 = bw0Var.k0[i21].h;
                        tu0Var10.i(new et0(bw0Var, xs0Var2));
                        tu0Var11 = bw0Var.k0[i21].h;
                        float f102 = f7;
                        tu0Var11.setOnItemClickListener(new org.telegram.ui.xe(bw0Var, xs0Var2, context2, j3, e6Var2, 1));
                        tu0Var12 = bw0Var.k0[i21].h;
                        tu0Var12.setOnScrollListener(new gt0(bw0Var, xs0Var2, ys0Var));
                        tu0Var13 = bw0Var.k0[i21].h;
                        tu0Var13.setOnItemLongClickListener(new ht0(bw0Var, xs0Var2));
                        if (i21 == 0) {
                            ys0Var.h1(i23, i22);
                        }
                        tu0Var14 = bw0Var.k0[i21].h;
                        bw0Var.k0[i21].y = new it0(context2, tu0Var14);
                        bw0Var.k0[i21].y.setVisibility(8);
                        tu0Var15 = bw0Var.k0[i21].h;
                        tu0Var15.D0(bw0Var.k0[i21].y, w7.x5.d(-1.0f, -1));
                        bw0Var.k0[i21].v = new jt0(bw0Var, context2, xs0Var2);
                        j10Var = bw0Var.k0[i21].v;
                        j10Var.g();
                        j10Var2 = bw0Var.k0[i21].v;
                        j10Var2.setClipToOutline(true);
                        j10Var3 = bw0Var.k0[i21].v;
                        j10Var3.setOutlineProvider(new kt0());
                        if (i21 == 0) {
                        }
                        uu0 uu0Var62 = bw0Var.k0[i21];
                        j10Var4 = uu0Var62.v;
                        uu0Var62.w = new lt0(bw0Var, context2, j10Var4);
                        ay0Var = bw0Var.k0[i21].w;
                        ay0Var.d(8, false);
                        ay0Var2 = bw0Var.k0[i21].w;
                        ay0Var2.setAnimateLayoutChange(true);
                        uu0 uu0Var72 = bw0Var.k0[i21];
                        ay0Var3 = uu0Var72.w;
                        uu0Var72.addView(ay0Var3, w7.x5.d(-1.0f, -1));
                        ay0Var4 = bw0Var.k0[i21].w;
                        ay0Var4.setOnTouchListener(new bi.d(23));
                        ay0Var5 = bw0Var.k0[i21].w;
                        ay0Var5.e(true, false);
                        ay0Var6 = bw0Var.k0[i21].w;
                        ay0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                        ay0Var7 = bw0Var.k0[i21].w;
                        ay0Var7.f.setVisibility(8);
                        ay0Var8 = bw0Var.k0[i21].w;
                        ay0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        ay0Var9 = bw0Var.k0[i21].w;
                        ay0Var9.f.setVisibility(8);
                        ay0Var10 = bw0Var.k0[i21].w;
                        j10Var5 = bw0Var.k0[i21].v;
                        ay0Var10.addView(j10Var5, w7.x5.a(-1.0f, 12.0f, 60.0f, 12.0f, 12.0f, -1, 119));
                        tu0Var16 = bw0Var.k0[i21].h;
                        ay0Var11 = bw0Var.k0[i21].w;
                        tu0Var16.setEmptyView(ay0Var11);
                        tu0Var17 = bw0Var.k0[i21].h;
                        tu0Var17.m1(0, true);
                        uu0[] uu0VarArr22 = bw0Var.k0;
                        uu0 uu0Var82 = uu0VarArr22[i21];
                        tu0Var18 = uu0VarArr22[i21].h;
                        uu0Var82.E = new tl0(tu0Var18, bw0Var.k0[i21].x);
                        i21++;
                        f7 = f102;
                        e6Var2 = e6Var;
                        i19 = i22;
                        i20 = i23;
                    }
                    float f11 = f7;
                    view = bw0Var.W;
                    if (view != null) {
                        bw0Var.addView(view, w7.x5.a(42.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 48));
                    }
                    org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context2);
                    bw0Var.K0 = w0Var;
                    w0Var.X((int) (System.currentTimeMillis() / 1000), false, false);
                    w0Var.setAlpha(0.0f);
                    w0Var.Z(org.telegram.ui.ActionBar.i6.wc, org.telegram.ui.ActionBar.i6.kd);
                    w0Var.setTranslationY(-AndroidUtilities.dp(f11));
                    bw0Var.addView(w0Var, w7.x5.a(-2.0f, 0.0f, 52.0f, 0.0f, 0.0f, -2, 49));
                    N = bw0Var.N();
                    bw0Var2 = bw0Var;
                    if (!N) {
                        at atVar2 = new at(context2);
                        bw0Var.P0 = atVar2;
                        atVar2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
                        ch.d b10 = cVar3.b(atVar2, eh.b.n(e6Var));
                        b10.q(AndroidUtilities.dp(24.0f));
                        b10.p(AndroidUtilities.dp(7.0f));
                        atVar2.setBlurredBackground(b10);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        bw0Var.Q0 = frameLayout;
                        atVar2.addView(frameLayout);
                        atVar2.i(frameLayout, true, false);
                        atVar2.setOnAnimatedHeightChangedListener(new vr0(bw0Var, 0));
                        nt0 nt0Var = new nt0(bw0Var, context2, n2Var, this, e6Var);
                        bw0Var.R0 = nt0Var;
                        frameLayout.addView(nt0Var);
                        atVar2.setCallFragmentContextView(nt0Var);
                        bw0Var.addView(atVar2, w7.x5.a(-2.0f, 0.0f, 34.0f, 0.0f, 0.0f, -1, 48));
                        nt0Var.setDelegate(new wr0(bw0Var));
                        ch.d b11 = cVar3.b(bw0Var.I0, eh.b.n(e6Var));
                        b11.q(AndroidUtilities.dp(18.0f));
                        b11.p(AndroidUtilities.dp(6.666f));
                        bw0Var.I0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                        bw0Var.I0.setClipToPadding(false);
                        bw0Var.I0.setBackground(null);
                        bw0Var.I0.setBlurredBackground(b11);
                        bw0Var.I0.setOpen(false);
                        bw0Var.addView(bw0Var.I0, w7.x5.a(50.0f, -2.0f, 0.0f, -2.0f, 0.0f, -2, 49));
                        Context context3 = bw0Var.getContext();
                        org.telegram.ui.ActionBar.n2 n2Var4 = bw0Var.v1;
                        bw0 bw0Var5 = bw0Var;
                        ot0 ot0Var3 = new ot0(n2Var4.getCurrentAccount(), bw0Var.l0() ? 0L : bw0Var.j1, context3, n2Var4, e6Var, bw0Var5);
                        bw0 bw0Var6 = bw0Var5;
                        bw0Var6.J0 = ot0Var3;
                        ot0Var3.d(cVar3, eh.b.n(e6Var));
                        ot0Var3.setShown(0.0f);
                        bw0Var6.addView(ot0Var3, w7.x5.a(38.0f, 0.0f, 4.0f, 0.0f, 0.0f, -1, 51));
                        bw0Var6.addView(bw0Var6.B0, w7.x5.e(-1, 48, 51));
                        bw0Var2 = bw0Var6;
                    }
                    bw0Var2.v1(false);
                    bw0Var2.m1(false);
                    if (bw0Var2.X0[0] >= 0) {
                        bw0Var2.z0(false);
                    }
                    ws0Var = bw0Var2.W;
                    if (ws0Var != null && i12 > 0) {
                        ws0Var.setInitialTabId(i12);
                    }
                    bw0Var2.c2 = new nh(bw0Var2, 2);
                }
                e6Var2 = e6Var;
                bw0Var = bw0Var3;
                bw0Var.setWillNotDraw(false);
                i19 = 0;
                i20 = -1;
                i21 = 0;
                while (true) {
                    uu0VarArr = bw0Var.k0;
                    if (i21 >= uu0VarArr.length) {
                    }
                    uu0 uu0Var622 = bw0Var.k0[i21];
                    j10Var4 = uu0Var622.v;
                    uu0Var622.w = new lt0(bw0Var, context2, j10Var4);
                    ay0Var = bw0Var.k0[i21].w;
                    ay0Var.d(8, false);
                    ay0Var2 = bw0Var.k0[i21].w;
                    ay0Var2.setAnimateLayoutChange(true);
                    uu0 uu0Var722 = bw0Var.k0[i21];
                    ay0Var3 = uu0Var722.w;
                    uu0Var722.addView(ay0Var3, w7.x5.d(-1.0f, -1));
                    ay0Var4 = bw0Var.k0[i21].w;
                    ay0Var4.setOnTouchListener(new bi.d(23));
                    ay0Var5 = bw0Var.k0[i21].w;
                    ay0Var5.e(true, false);
                    ay0Var6 = bw0Var.k0[i21].w;
                    ay0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                    ay0Var7 = bw0Var.k0[i21].w;
                    ay0Var7.f.setVisibility(8);
                    ay0Var8 = bw0Var.k0[i21].w;
                    ay0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    ay0Var9 = bw0Var.k0[i21].w;
                    ay0Var9.f.setVisibility(8);
                    ay0Var10 = bw0Var.k0[i21].w;
                    j10Var5 = bw0Var.k0[i21].v;
                    ay0Var10.addView(j10Var5, w7.x5.a(-1.0f, 12.0f, 60.0f, 12.0f, 12.0f, -1, 119));
                    tu0Var16 = bw0Var.k0[i21].h;
                    ay0Var11 = bw0Var.k0[i21].w;
                    tu0Var16.setEmptyView(ay0Var11);
                    tu0Var17 = bw0Var.k0[i21].h;
                    tu0Var17.m1(0, true);
                    uu0[] uu0VarArr222 = bw0Var.k0;
                    uu0 uu0Var822 = uu0VarArr222[i21];
                    tu0Var18 = uu0VarArr222[i21].h;
                    uu0Var822.E = new tl0(tu0Var18, bw0Var.k0[i21].x);
                    i21++;
                    f7 = f102;
                    e6Var2 = e6Var;
                    i19 = i22;
                    i20 = i23;
                }
                float f112 = f7;
                view = bw0Var.W;
                if (view != null) {
                }
                org.telegram.ui.Cells.w0 w0Var2 = new org.telegram.ui.Cells.w0(context2);
                bw0Var.K0 = w0Var2;
                w0Var2.X((int) (System.currentTimeMillis() / 1000), false, false);
                w0Var2.setAlpha(0.0f);
                w0Var2.Z(org.telegram.ui.ActionBar.i6.wc, org.telegram.ui.ActionBar.i6.kd);
                w0Var2.setTranslationY(-AndroidUtilities.dp(f112));
                bw0Var.addView(w0Var2, w7.x5.a(-2.0f, 0.0f, 52.0f, 0.0f, 0.0f, -2, 49));
                N = bw0Var.N();
                bw0Var2 = bw0Var;
                if (!N) {
                }
                bw0Var2.v1(false);
                bw0Var2.m1(false);
                if (bw0Var2.X0[0] >= 0) {
                }
                ws0Var = bw0Var2.W;
                if (ws0Var != null) {
                    ws0Var.setInitialTabId(i12);
                }
                bw0Var2.c2 = new nh(bw0Var2, 2);
            }
            profileTab = chatFull2.main_tab;
        }
        i14 = 1;
        if (i11 != 14) {
        }
        bw0Var3.Y0 = i11;
        bw0Var3.M0(i11);
        bw0Var3.d1 = chatFull2;
        bw0Var3.e1 = userFull;
        if (chatFull2 != null) {
        }
        bw0Var3.j1 = j3;
        i15 = 0;
        while (true) {
            qv0VarArr = bw0Var3.t1;
            if (i15 < qv0VarArr.length) {
            }
            i15++;
        }
        bw0Var3.v1 = n2Var;
        bw0Var3.G = n2Var.getActionBar();
        bw0Var3.m1[0] = bw0Var3.S0() > 0 ? SharedConfig.mediaColumnsCount : bw0Var3.S0();
        bw0Var3.m1[1] = bw0Var3.S0() > 0 ? SharedConfig.storiesColumnsCount : bw0Var3.S0();
        bw0Var3.G1 = n2Var.getNotificationCenter().createObserversGroup(bw0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
        while (i16 < 10) {
        }
        bw0Var3.S0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        bw0Var3.V0 = false;
        bw0Var3.W0 = null;
        ot0Var = bw0Var3.J0;
        if (ot0Var != null) {
        }
        bw0Var3.U0 = false;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        bw0Var3.y0 = drawable2;
        drawable2.setColorFilter(new PorterDuffColorFilter(bw0Var3.h0(org.telegram.ui.ActionBar.i6.b7), PorterDuff.Mode.MULTIPLY));
        rt0 rt0Var3 = bw0Var3.I0;
        if (rt0Var3 == null) {
        }
        rt0 rt0Var22 = new rt0(bw0Var3, context, bw0Var3.F1);
        i17 = bw0Var3.Y0;
        if (i17 != -1) {
        }
        rt0Var22.b0 = 320L;
        int i332 = org.telegram.ui.ActionBar.i6.Fh;
        int i342 = org.telegram.ui.ActionBar.i6.Eh;
        rt0Var22.L = i332;
        rt0Var22.M = i342;
        rt0Var22.e();
        rt0Var22.setUseMinimalWidth(true);
        rt0Var22.setDelegate(new tt0(bw0Var3));
        bw0Var3.I0 = rt0Var22;
        while (i18 >= 0) {
        }
        bw0Var3.a1 = 0;
        bw0Var3.N0.clear();
        lv0Var = bw0Var3.R;
        if (lv0Var != null) {
        }
        if (!(bw0Var3 instanceof p40)) {
        }
        imageView = new ImageView(context);
        bw0Var3.r0 = imageView;
        imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        imageView.setTranslationY(AndroidUtilities.dp(10.0f));
        imageView.setVisibility(4);
        if (!bw0Var3.q0()) {
            bw0Var3.G.addView(imageView, w7.x5.e(48, 56, 85));
            fk0 fk0Var2 = new fk0(context);
            bw0Var3.s0 = fk0Var2;
            fk0Var2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            fk0Var2.e(R.raw.options_to_search, 24, 24);
            fk0Var2.getAnimatedDrawable().F *= 2.0f;
            fk0Var2.getAnimatedDrawable().h = true;
            fk0Var2.setColorFilter(new PorterDuffColorFilter(bw0Var3.h0(org.telegram.ui.ActionBar.i6.y8), PorterDuff.Mode.SRC_IN));
            fk0Var2.setVisibility(8);
            bw0Var3.G.addView(fk0Var2, w7.x5.e(48, 56, 85));
        }
        int i352 = 5;
        context2 = context;
        imageView.setOnClickListener(new fu0(bw0Var3, j3, e6Var, context));
        v0Var = bw0Var3.n0;
        if (v0Var != null) {
        }
        bw0Var3.x0 = 0;
        org.telegram.ui.ActionBar.n2 n2Var22 = bw0Var3.v1;
        if (n2Var22 == null) {
        }
        ka kaVar2 = new ka(context2, sw0Var);
        bw0Var3.B0 = kaVar2;
        kaVar2.setBackgroundColor(bw0Var3.h0(org.telegram.ui.ActionBar.i6.a7));
        kaVar2.setAlpha(0.0f);
        kaVar2.setClickable(true);
        kaVar2.setVisibility(4);
        ImageView imageView22 = new ImageView(context2);
        bw0Var3.C0 = imageView22;
        imageView22.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.g2 g2Var2 = new org.telegram.ui.ActionBar.g2(true);
        bw0Var3.D0 = g2Var2;
        imageView22.setImageDrawable(g2Var2);
        int i372 = org.telegram.ui.ActionBar.i6.y8;
        g2Var2.a(bw0Var3.h0(i372));
        int i382 = org.telegram.ui.ActionBar.i6.z8;
        imageView22.setBackground(org.telegram.ui.ActionBar.i6.f0(bw0Var3.h0(i382), 1));
        imageView22.setContentDescription(LocaleController.getString("Close", R.string.Close));
        kaVar2.addView(imageView22, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        bw0Var3.N0.add(imageView22);
        imageView22.setOnClickListener(new xr0(bw0Var3, 0));
        NumberTextView numberTextView2 = new NumberTextView(context2);
        bw0Var3.A0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(AndroidUtilities.bold());
        numberTextView2.setTextColor(bw0Var3.h0(i372));
        kaVar2.addView(numberTextView2, w7.x5.m(1.0f, 0, -1, 18, 0, 0));
        bw0Var3.N0.add(numberTextView2);
        if (!DialogObject.isEncryptedDialog(bw0Var3.j1)) {
        }
        org.telegram.ui.ActionBar.v0 v0Var62 = new org.telegram.ui.ActionBar.v0(bw0Var3.h0(i382), bw0Var3.h0(i372), context2, false);
        bw0Var3.l0 = v0Var62;
        v0Var62.setIcon(R.drawable.msg_delete);
        v0Var62.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        v0Var62.setDuplicateParentStateEnabled(false);
        kaVar2.addView(v0Var62, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        bw0Var3.N0.add(v0Var62);
        v0Var62.setOnClickListener(new xr0(bw0Var3, i352));
        bw0Var3.H = new gu0(bw0Var3, context2);
        bw0Var3.I = new vv0(bw0Var3, context2);
        bw0Var3.K = new ov0(bw0Var3, context2, 1);
        bw0Var3.L = new ov0(bw0Var3, context2, 2);
        bw0Var3.M = new ov0(bw0Var3, context2, 4);
        bw0Var3.N = new iv0(bw0Var3, context2, bw0Var3.v1.getCurrentAccount(), bw0Var3.v1.getResourceProvider());
        bw0Var3.O = new pu0(bw0Var3, context2);
        bw0Var3.g0 = new xu0(bw0Var3, context2, 1);
        bw0Var3.h0 = new xu0(bw0Var3, context2, 4);
        bw0Var3.i0 = new xu0(bw0Var3, context2, 3);
        bw0Var3.j0 = new su0(bw0Var3, context2);
        bw0Var3.P = new mu0(bw0Var3, context2);
        bw0Var3.Q = new ku0(bw0Var3, context2);
        bw0Var3.R = new lv0(bw0Var3, context2);
        bw0Var3.S = new mv0(bw0Var3, context2);
        if (!bw0Var3.v0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", bw0Var3.v1.getUserConfig().getClientUserId());
            bundle2.putInt("chatMode", 3);
            hu0 hu0Var2 = new hu0(bw0Var3, context2, bw0Var3.v1.getParentLayout(), bundle2);
            bw0Var3.T = hu0Var2;
            long j112 = bw0Var3.j1;
            org.telegram.ui.ao aoVar2 = hu0Var2.a;
            aoVar2.d4 = j112;
            aoVar2.Qa = true;
            hu0Var2.setClipToOutline(true);
            hu0Var2.setOutlineProvider(new iu0());
        }
        lu0 lu0Var2 = new lu0(bw0Var3, context2);
        bw0Var3.a0 = lu0Var2;
        if (bw0Var3.F == 0) {
        }
        bw0Var3.c0 = new ju0(bw0Var3, context2);
        bw0Var3.b0 = new s4.z(new os0(bw0Var3));
        bw0Var3.d0 = new yv0(bw0Var3, context2, false);
        bw0Var3.e0 = new ps0(bw0Var3, context2);
        bw0Var3.f0 = new yv0(bw0Var3, context2, true);
        bw0Var3.J = new pv0(bw0Var3, context2);
        f7 = 48.0f;
        if (!bw0Var3.r0()) {
        }
        e6Var2 = e6Var;
        bw0Var = bw0Var3;
        bw0Var.setWillNotDraw(false);
        i19 = 0;
        i20 = -1;
        i21 = 0;
        while (true) {
            uu0VarArr = bw0Var.k0;
            if (i21 >= uu0VarArr.length) {
            }
            uu0 uu0Var6222 = bw0Var.k0[i21];
            j10Var4 = uu0Var6222.v;
            uu0Var6222.w = new lt0(bw0Var, context2, j10Var4);
            ay0Var = bw0Var.k0[i21].w;
            ay0Var.d(8, false);
            ay0Var2 = bw0Var.k0[i21].w;
            ay0Var2.setAnimateLayoutChange(true);
            uu0 uu0Var7222 = bw0Var.k0[i21];
            ay0Var3 = uu0Var7222.w;
            uu0Var7222.addView(ay0Var3, w7.x5.d(-1.0f, -1));
            ay0Var4 = bw0Var.k0[i21].w;
            ay0Var4.setOnTouchListener(new bi.d(23));
            ay0Var5 = bw0Var.k0[i21].w;
            ay0Var5.e(true, false);
            ay0Var6 = bw0Var.k0[i21].w;
            ay0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
            ay0Var7 = bw0Var.k0[i21].w;
            ay0Var7.f.setVisibility(8);
            ay0Var8 = bw0Var.k0[i21].w;
            ay0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            ay0Var9 = bw0Var.k0[i21].w;
            ay0Var9.f.setVisibility(8);
            ay0Var10 = bw0Var.k0[i21].w;
            j10Var5 = bw0Var.k0[i21].v;
            ay0Var10.addView(j10Var5, w7.x5.a(-1.0f, 12.0f, 60.0f, 12.0f, 12.0f, -1, 119));
            tu0Var16 = bw0Var.k0[i21].h;
            ay0Var11 = bw0Var.k0[i21].w;
            tu0Var16.setEmptyView(ay0Var11);
            tu0Var17 = bw0Var.k0[i21].h;
            tu0Var17.m1(0, true);
            uu0[] uu0VarArr2222 = bw0Var.k0;
            uu0 uu0Var8222 = uu0VarArr2222[i21];
            tu0Var18 = uu0VarArr2222[i21].h;
            uu0Var8222.E = new tl0(tu0Var18, bw0Var.k0[i21].x);
            i21++;
            f7 = f102;
            e6Var2 = e6Var;
            i19 = i22;
            i20 = i23;
        }
        float f1122 = f7;
        view = bw0Var.W;
        if (view != null) {
        }
        org.telegram.ui.Cells.w0 w0Var22 = new org.telegram.ui.Cells.w0(context2);
        bw0Var.K0 = w0Var22;
        w0Var22.X((int) (System.currentTimeMillis() / 1000), false, false);
        w0Var22.setAlpha(0.0f);
        w0Var22.Z(org.telegram.ui.ActionBar.i6.wc, org.telegram.ui.ActionBar.i6.kd);
        w0Var22.setTranslationY(-AndroidUtilities.dp(f1122));
        bw0Var.addView(w0Var22, w7.x5.a(-2.0f, 0.0f, 52.0f, 0.0f, 0.0f, -2, 49));
        N = bw0Var.N();
        bw0Var2 = bw0Var;
        if (!N) {
        }
        bw0Var2.v1(false);
        bw0Var2.m1(false);
        if (bw0Var2.X0[0] >= 0) {
        }
        ws0Var = bw0Var2.W;
        if (ws0Var != null) {
        }
        bw0Var2.c2 = new nh(bw0Var2, 2);
    }

    public static ou0 M(int i10, long j3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        ou0 ou0Var = new ou0(context, e6Var);
        TextView textView = ou0Var.a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return ou0Var;
        }
        if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return ou0Var;
        }
        if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return ou0Var;
        }
        if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return ou0Var;
        }
        if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return ou0Var;
        }
        if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return ou0Var;
        }
        ImageView imageView = ou0Var.b;
        if (i10 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
            return ou0Var;
        }
        if (i10 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return ou0Var;
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

    public static void e(bw0 bw0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        zk zkVar = new zk(bw0Var, i10, storyItem, 11);
        ai.m9 storiesController = bw0Var.getStoriesController();
        long j3 = bw0Var.j1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j3, arrayList);
        ad.a0(bw0Var.v1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), zkVar).j();
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

    /* JADX INFO: Access modifiers changed from: private */
    public ai.m9 getStoriesController() {
        return MessagesController.getInstance(this.v1.getCurrentAccount()).getStoriesController();
    }

    public static /* synthetic */ void h(bw0 bw0Var, TL_stories.StoryItem storyItem) {
        bw0Var.getStoriesController().o0(bw0Var.j1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        ad.a0(bw0Var.v1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(bw0 bw0Var, long j3, int i10, String str) {
        ai.y8 B = bw0Var.getStoriesController().B(j3, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((ai.f9) B.h.get(c10)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(bw0 bw0Var, TL_stories.StoryItem storyItem, ai.f9 f9Var) {
        bw0Var.getStoriesController().c(f9Var.a, bw0Var.j1, storyItem);
        AndroidUtilities.runOnUIThread(new ci0(13, bw0Var, f9Var), 100L);
    }

    public static void m(bw0 bw0Var, HashSet hashSet, TL_stories.StoryItem storyItem, p80 p80Var, ai.f9 f9Var) {
        String formatString;
        long j3 = bw0Var.j1;
        if (hashSet.contains(Integer.valueOf(f9Var.a))) {
            bw0Var.getStoriesController().c(f9Var.a, j3, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, f9Var.b);
        } else {
            ai.m9 storiesController = bw0Var.getStoriesController();
            int i10 = f9Var.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j3, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, f9Var.b);
        }
        ad.a0(bw0Var.v1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        p80Var.u();
    }

    public static void n(bw0 bw0Var, long j3, int i10) {
        ai.y8 B = bw0Var.getStoriesController().B(j3, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ai.f9 f9Var = (ai.f9) B.h.remove(c10);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_deleteAlbum.album_id = f9Var.a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int p(View view) {
        if (view instanceof org.telegram.ui.Cells.t7) {
            return ((org.telegram.ui.Cells.t7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            return ((org.telegram.ui.Cells.k7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            return ((org.telegram.ui.Cells.j7) view).getMessage().getId();
        }
        return 0;
    }

    public static boolean p0(int i10) {
        return i10 == 8 || i10 == 9 || w0(i10);
    }

    public static void q(uu0 uu0Var, qv0[] qv0VarArr, boolean z10) {
        ci0 ci0Var;
        if (!z10) {
            if (uu0Var.G == null || (ci0Var = uu0Var.H) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(ci0Var);
            uu0Var.H.run();
            uu0Var.H = null;
            uu0Var.G = null;
            return;
        }
        if (SharedConfig.fastScrollHintCount <= 0 || uu0Var.G != null || uu0Var.I || uu0Var.h.getFastScroll() == null || !uu0Var.h.getFastScroll().a0 || uu0Var.h.getFastScroll().getVisibility() != 0 || qv0VarArr[0].e() < 50) {
            return;
        }
        SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
        uu0Var.I = true;
        Context context = uu0Var.getContext();
        tr0 tr0Var = new tr0(context);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        int i10 = org.telegram.ui.ActionBar.i6.pf;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        tr0Var.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.qf, false)));
        tr0Var.addView(textView, w7.x5.a(-2.0f, 46.0f, 8.0f, 8.0f, 8.0f, -2, 16));
        sr0 sr0Var = new sr0(context);
        sr0Var.a = new Random();
        Paint paint = new Paint(1);
        sr0Var.b = paint;
        Paint paint2 = new Paint(1);
        sr0Var.c = paint2;
        sr0Var.f = 1.0f;
        sr0Var.h = 0.0f;
        paint.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, i10, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        Paint paint3 = new Paint();
        sr0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        sr0Var.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        tr0Var.addView(sr0Var, w7.x5.a(32.0f, 8.0f, 8.0f, 8.0f, 8.0f, 29, 0));
        uu0Var.G = tr0Var;
        uu0Var.addView(tr0Var, w7.x5.d(-2.0f, -2));
        uu0Var.G.setAlpha(0.0f);
        uu0Var.G.setScaleX(0.8f);
        uu0Var.G.setScaleY(0.8f);
        uu0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        uu0Var.invalidate();
        ci0 ci0Var2 = new ci0(12, uu0Var, tr0Var);
        uu0Var.H = ci0Var2;
        AndroidUtilities.runOnUIThread(ci0Var2, 4000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(bw0 bw0Var) {
        bw0 bw0Var2;
        ArrayList arrayList;
        int i10;
        int i11;
        Bitmap bitmap;
        long j3 = bw0Var.j1;
        qv0[] qv0VarArr = bw0Var.t1;
        uu0 W = bw0Var.W(0);
        if (W != null && W.getMeasuredHeight() > 0 && W.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(W.getMeasuredWidth(), W.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e7) {
                FileLog.e(e7);
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                bw0Var.H1 = true;
                W.h.draw(new Canvas(bitmap2));
                View view = new View(W.getContext());
                view.setBackground(new BitmapDrawable(bitmap2));
                W.addView(view);
                bw0Var2 = bw0Var;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new gg.j0((FrameLayout) bw0Var2, view, (View) W, (Object) bitmap2, 3)).start();
                W.h.setAlpha(0.0f);
                W.h.animate().alpha(1.0f).setUpdateListener(new j80(W, 21)).setDuration(200L).start();
                tv0 tv0Var = bw0Var2.u1;
                int[] iArr = tv0Var.c;
                arrayList = tv0Var.n[0].a;
                qv0 qv0Var = qv0VarArr[0];
                int[] iArr2 = qv0Var.f;
                iArr2[1] = 0;
                i10 = qv0Var.q;
                if (i10 != 0) {
                    iArr2[0] = iArr[0];
                } else if (i10 == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                qv0Var.h = false;
                bw0Var2.y0(0, !DialogObject.isEncryptedDialog(j3) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                bw0Var2.z0(false);
                bw0Var2.D1.R();
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j3);
                for (i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    qv0 qv0Var2 = qv0VarArr[0];
                    int i12 = qv0Var2.q;
                    if (i12 == 0) {
                        qv0Var2.a(messageObject, 0, false, isEncryptedDialog);
                    } else if (i12 == 1) {
                        if (messageObject.isPhoto()) {
                            qv0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                        }
                    } else if (!messageObject.isPhoto()) {
                        qv0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                    }
                }
            }
        }
        bw0Var2 = bw0Var;
        tv0 tv0Var2 = bw0Var2.u1;
        int[] iArr3 = tv0Var2.c;
        arrayList = tv0Var2.n[0].a;
        qv0 qv0Var3 = qv0VarArr[0];
        int[] iArr22 = qv0Var3.f;
        iArr22[1] = 0;
        i10 = qv0Var3.q;
        if (i10 != 0) {
        }
        qv0Var3.h = false;
        bw0Var2.y0(0, !DialogObject.isEncryptedDialog(j3) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        bw0Var2.z0(false);
        bw0Var2.D1.R();
        boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j3);
        while (i11 < arrayList.size()) {
        }
    }

    public static void t(bw0 bw0Var, int i10, boolean z10) {
        uu0[] uu0VarArr = bw0Var.k0;
        if (uu0VarArr[0].F == i10) {
            return;
        }
        uu0 uu0Var = uu0VarArr[1];
        uu0Var.F = i10;
        uu0Var.setVisibility(0);
        bw0Var.k0();
        bw0Var.m1(true);
        bw0Var.h1 = z10;
        bw0Var.L0();
        bw0Var.A(!bw0Var.s0(i10), true);
        bw0Var.q1(true);
    }

    public static int u(bw0 bw0Var, s4.i0 i0Var) {
        if (i0Var == bw0Var.c0) {
            return 8;
        }
        if (i0Var == bw0Var.e0) {
            return 9;
        }
        for (aw0 aw0Var : bw0Var.Y1.values()) {
            if (aw0Var.c == i0Var) {
                return aw0Var.a;
            }
        }
        return -1;
    }

    public static int v(bw0 bw0Var, s4.i0 i0Var) {
        if (i0Var == bw0Var.d0) {
            return 8;
        }
        if (i0Var == bw0Var.f0) {
            return 9;
        }
        for (aw0 aw0Var : bw0Var.Y1.values()) {
            if (aw0Var.d == i0Var) {
                return aw0Var.a;
            }
        }
        return -1;
    }

    public static boolean w0(int i10) {
        return (i10 & (-65536)) == 65536;
    }

    public final void A(boolean z10, boolean z11) {
        fk0 fk0Var = this.s0;
        if (fk0Var == null || this.V1 == z10) {
            return;
        }
        this.V1 = z10;
        if (z10 || fk0Var.getAnimatedDrawable().a0 >= 20) {
            fk0Var.getAnimatedDrawable().P(this.V1 ? 50 : 100);
        } else {
            fk0Var.getAnimatedDrawable().P(0);
        }
        if (z11) {
            fk0Var.getAnimatedDrawable().start();
        } else {
            fk0Var.getAnimatedDrawable().M(fk0Var.getAnimatedDrawable().f);
        }
    }

    public final void A0(int i10) {
        int i11;
        int i12 = 2;
        qv0[] qv0VarArr = this.t1;
        if (i10 == 0) {
            int i13 = qv0VarArr[0].q;
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
        qv0VarArr[i10].g = true;
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        n2Var.getMediaDataController().loadMedia(this.j1, 50, 0, qv0VarArr[i10].k, i11, this.F, 1, n2Var.getClassGuid(), qv0VarArr[i10].p, null, null);
    }

    public final void B(int i10) {
        int i11;
        uu0 W = W(this.p1);
        this.s = -1;
        if (W != null) {
            W.h.B0();
            this.q1 = i10;
            W.r.setVisibility(0);
            if (p0(this.p1)) {
                W.r.setAdapter(l1(this.p1));
            } else {
                W.r.setAdapter(this.I);
            }
            tu0 tu0Var = W.r;
            int paddingLeft = tu0Var.getPaddingLeft();
            tu0 tu0Var2 = W.r;
            int Z = Z(W.F);
            tu0Var2.b3 = Z;
            int paddingRight = W.r.getPaddingRight();
            tu0 tu0Var3 = W.r;
            int Y = Y(v0());
            tu0Var3.c3 = Y;
            tu0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.s.y1(i10);
            W.r.a0();
            int i12 = 0;
            while (true) {
                uu0[] uu0VarArr = this.k0;
                if (i12 >= uu0VarArr.length) {
                    break;
                }
                uu0 uu0Var = uu0VarArr[i12];
                if (uu0Var != null && ((i11 = uu0Var.F) == 0 || p0(i11))) {
                    AndroidUtilities.updateVisibleRows(uu0VarArr[i12].h);
                }
                i12++;
            }
            int i13 = 1;
            this.o1 = true;
            if (this.p1 == 0) {
                this.t1[0].g(true);
            }
            this.n1 = 0.0f;
            X0();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I1.lock();
            ofFloat.addUpdateListener(new qt0(this, W, i13));
            ofFloat.addListener(new ei.y2(this, p0(W.F) ? 1 : 0, i10, 2));
            ofFloat.setInterpolator(hs.f);
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
        long j3 = this.j1;
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        if (!r02) {
            return v0() || (n2Var != null && n2Var.getMessagesController().getStoriesController().h(j3));
        }
        TLRPC.User user = MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j3));
        return user != null && user.bot && user.bot_can_edit;
    }

    public final void C0(int i10, View view) {
        qs0 qs0Var;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        lv0 lv0Var = this.R;
        SparseArray[] sparseArrayArr = this.Z0;
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        final int i11 = 0;
        if (i10 != 101) {
            if (i10 == 100) {
                if (this.e1 != null && n2Var.getMessagesController().isUserNoForwards(this.e1)) {
                    z40 z40Var = this.E1;
                    if (z40Var != null) {
                        z40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                        this.E1.f(view, true);
                        return;
                    }
                    return;
                }
                if (this.d1 != null) {
                    TLRPC.Chat chat2 = n2Var.getMessagesController().getChat(Long.valueOf(this.d1.id));
                    if (n2Var.getMessagesController().isChatNoForwards(chat2)) {
                        z40 z40Var2 = this.E1;
                        if (z40Var2 != null) {
                            z40Var2.setText((!ChatObject.isChannel(chat2) || chat2.megagroup) ? LocaleController.getString(R.string.ForwardsRestrictedInfoGroup) : LocaleController.getString(R.string.ForwardsRestrictedInfoChannel));
                            this.E1.f(view, true);
                            return;
                        }
                        return;
                    }
                }
                if (j0()) {
                    z40 z40Var3 = this.E1;
                    if (z40Var3 != null) {
                        z40Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                        this.E1.f(view, true);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("canSelectTopics", true);
                bundle.putInt("dialogsType", 3);
                org.telegram.ui.ty tyVar = new org.telegram.ui.ty(bundle);
                tyVar.C2 = new wr0(this);
                n2Var.presentFragment(tyVar);
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
                org.telegram.ui.zn znVar = new org.telegram.ui.zn(bundle2);
                znVar.L7 = messageObject.getId();
                long j3 = this.F;
                if (j3 != 0) {
                    ng.d.a(znVar, MessagesStorage.TopicKey.of(dialogId, j3));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                n2Var.presentFragment(znVar, false);
                return;
            }
            if (i10 == 103 || i10 == 104) {
                if (getClosestTab() == 8) {
                    ju0 ju0Var = this.c0;
                    if (ju0Var == null || ju0Var.s == null) {
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
                SavedMessagesController savedMessagesController = n2Var.getMessagesController().getSavedMessagesController();
                ArrayList<Long> arrayList2 = new ArrayList<>();
                for (int i13 = 0; i13 < savedMessagesController.allDialogs.size(); i13++) {
                    long j10 = savedMessagesController.allDialogs.get(i13).dialogId;
                    if (lv0Var.w.contains(Long.valueOf(j10))) {
                        arrayList2.add(Long.valueOf(j10));
                    }
                }
                if (savedMessagesController.updatePinned(arrayList2, i10 == 103, true)) {
                    int i14 = 0;
                    while (true) {
                        uu0[] uu0VarArr = this.k0;
                        if (i14 >= uu0VarArr.length) {
                            break;
                        }
                        uu0 uu0Var = uu0VarArr[i14];
                        if (uu0Var.F == 11) {
                            uu0Var.x.h1(0, 0);
                            break;
                        }
                        i14++;
                    }
                } else {
                    n2Var.showDialog(new rg.j0(33, n2Var.getCurrentAccount(), getContext(), n2Var, null));
                }
                L(true);
                return;
            }
            return;
        }
        boolean p02 = p0(getSelectedTab());
        int i15 = 13;
        org.telegram.ui.ActionBar.e6 e6Var = this.F1;
        if (p02 || getSelectedTab() == 13) {
            if (sparseArrayArr[0] != null) {
                if (!r0() || (qs0Var = this.U) == null || qs0Var.getCurrentList() == null) {
                    final ArrayList arrayList3 = new ArrayList();
                    for (int i16 = 0; i16 < sparseArrayArr[0].size(); i16++) {
                        TL_stories.StoryItem storyItem = ((MessageObject) sparseArrayArr[0].valueAt(i16)).storyItem;
                        if (storyItem != null) {
                            arrayList3.add(storyItem);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, e6Var);
                    String string = LocaleController.getString(arrayList3.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.Components.es0
                        public final /* synthetic */ bw0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.a2
                        public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i17) {
                            switch (i11) {
                                case 0:
                                    bw0 bw0Var = this.b;
                                    org.telegram.ui.ActionBar.n2 n2Var2 = bw0Var.v1;
                                    ai.m9 storiesController = n2Var2.getMessagesController().getStoriesController();
                                    long j11 = bw0Var.j1;
                                    ArrayList arrayList4 = arrayList3;
                                    storiesController.s(j11, arrayList4);
                                    ad.a0(n2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList4.size(), new Object[0])).j();
                                    bw0Var.L(false);
                                    break;
                                default:
                                    bw0 bw0Var2 = this.b;
                                    bw0Var2.getClass();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (i18 >= arrayList5.size()) {
                                            bw0Var2.L(true);
                                            break;
                                        } else {
                                            bw0Var2.v1.getMessagesController().deleteSavedDialog(((Long) arrayList5.get(i18)).longValue());
                                            i18++;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fe0(i15));
                    b2Var.show();
                    b2Var.h();
                    return;
                }
                ai.v8 currentList = qs0Var.getCurrentList();
                ArrayList arrayList4 = new ArrayList();
                for (int i17 = 0; i17 < sparseArrayArr[0].size(); i17++) {
                    TL_stories.StoryItem storyItem2 = ((MessageObject) sparseArrayArr[0].valueAt(i17)).storyItem;
                    if (storyItem2 != null) {
                        arrayList4.add(storyItem2.media);
                    }
                }
                if (arrayList4.isEmpty()) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, e6Var);
                String string2 = LocaleController.getString(arrayList4.size() > 1 ? R.string.DeleteBotPreviewsTitle : R.string.DeleteBotPreviewTitle);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                b2Var2.R = string2;
                b2Var2.T = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList4.size(), new Object[0]);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new rz(this, currentList, arrayList4, 2));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new fe0(12));
                b2Var2.show();
                b2Var2.h();
                return;
            }
            return;
        }
        if (getSelectedTab() != 11) {
            long j11 = this.j1;
            if (DialogObject.isEncryptedDialog(j11)) {
                encryptedChat = org.telegram.messenger.q.l(n2Var.getMessagesController(), j11);
                user = null;
                chat = null;
            } else if (DialogObject.isUserDialog(j11)) {
                user = n2Var.getMessagesController().getUser(Long.valueOf(j11));
                chat = null;
                encryptedChat = null;
            } else {
                chat = n2Var.getMessagesController().getChat(Long.valueOf(-j11));
                user = null;
                encryptedChat = null;
            }
            g5.y(n2Var, user, chat, encryptedChat, null, this.c1, null, this.Z0, null, 0, 0, null, new vr0(this, r15 ? 1 : 0), null, this.F1);
            return;
        }
        SavedMessagesController savedMessagesController2 = n2Var.getMessagesController().getSavedMessagesController();
        final ArrayList arrayList5 = new ArrayList();
        for (int i18 = 0; i18 < savedMessagesController2.allDialogs.size(); i18++) {
            long j12 = savedMessagesController2.allDialogs.get(i18).dialogId;
            if (lv0Var.w.contains(Long.valueOf(j12))) {
                arrayList5.add(Long.valueOf(j12));
            }
        }
        String str = "";
        if (arrayList5.isEmpty()) {
            z10 = false;
        } else {
            Long l4 = (Long) arrayList5.get(0);
            long longValue = l4.longValue();
            boolean z11 = longValue == n2Var.getUserConfig().getClientUserId();
            z10 = z11;
            if (longValue < 0) {
                TLRPC.Chat chat4 = n2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                z10 = z11;
                if (chat4 != null) {
                    str = chat4.title;
                    z10 = z11;
                }
            } else if (longValue >= 0) {
                TLRPC.User user2 = n2Var.getMessagesController().getUser(l4);
                z10 = z11;
                if (user2 != null) {
                    if (UserObject.isAnonymous(user2)) {
                        str = LocaleController.getString(R.string.AnonymousForward);
                        z10 = z11;
                    } else {
                        str = UserObject.getUserName(user2);
                        z10 = z11;
                    }
                }
            }
        }
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, e6Var);
        String formatString = arrayList5.size() == 1 ? LocaleController.formatString(z10 ? R.string.ClearHistoryMyNotesTitle : R.string.ClearHistoryTitleSingle2, str) : LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList5.size(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
        b2Var3.R = formatString;
        b2Var3.T = arrayList5.size() == 1 ? LocaleController.formatString(z10 ? R.string.ClearHistoryMyNotesMessage : R.string.ClearHistoryMessageSingle, str) : LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList5.size(), new Object[0]);
        String string3 = LocaleController.getString(R.string.Remove);
        final int i19 = r15 ? 1 : 0;
        alertDialog$Builder3.k(string3, new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.Components.es0
            public final /* synthetic */ bw0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var22, int i172) {
                switch (i19) {
                    case 0:
                        bw0 bw0Var = this.b;
                        org.telegram.ui.ActionBar.n2 n2Var2 = bw0Var.v1;
                        ai.m9 storiesController = n2Var2.getMessagesController().getStoriesController();
                        long j112 = bw0Var.j1;
                        ArrayList arrayList42 = arrayList5;
                        storiesController.s(j112, arrayList42);
                        ad.a0(n2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList42.size(), new Object[0])).j();
                        bw0Var.L(false);
                        break;
                    default:
                        bw0 bw0Var2 = this.b;
                        bw0Var2.getClass();
                        int i182 = 0;
                        while (true) {
                            ArrayList arrayList52 = arrayList5;
                            if (i182 >= arrayList52.size()) {
                                bw0Var2.L(true);
                                break;
                            } else {
                                bw0Var2.v1.getMessagesController().deleteSavedDialog(((Long) arrayList52.get(i182)).longValue());
                                i182++;
                            }
                        }
                }
            }
        });
        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
        n2Var.showDialog(b2Var3);
        TextView textView = (TextView) b2Var3.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
        }
    }

    public boolean D() {
        return !(this instanceof p40);
    }

    public final boolean E() {
        uu0 uu0Var;
        uu0[] uu0VarArr = this.k0;
        if (uu0VarArr == null || (uu0Var = uu0VarArr[0]) == null) {
            return false;
        }
        if (this.k1 && p0(uu0Var.F)) {
            return false;
        }
        boolean p02 = p0(uu0VarArr[0].F);
        int i10 = this.m1[p02 ? 1 : 0];
        return i10 != X(p02 ? 1 : 0, i10, false);
    }

    public final void F() {
        rt0 rt0Var = this.I0;
        if (rt0Var.d(rt0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = rt0Var.getFirstTabId();
        rt0Var.setInitialTabId(firstTabId);
        this.k0[0].F = firstTabId;
        m1(false);
    }

    public final void F0() {
        ai.e9 e9Var;
        ai.e9 e9Var2;
        this.G1.removeAllObservers();
        ju0 ju0Var = this.c0;
        if (ju0Var != null && (e9Var2 = ju0Var.s) != null && e9Var2 != null) {
            e9Var2.z(ju0Var.v);
        }
        ps0 ps0Var = this.e0;
        if (ps0Var != null && (e9Var = ps0Var.s) != null && e9Var != null) {
            e9Var.z(ps0Var.v);
        }
        Iterator it = this.Y1.values().iterator();
        while (it.hasNext()) {
            zv0 zv0Var = ((aw0) it.next()).c;
            ai.e9 e9Var3 = zv0Var.s;
            if (e9Var3 != null && e9Var3 != null) {
                e9Var3.z(zv0Var.v);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(uu0 uu0Var, qm0 qm0Var, s4.d0 d0Var) {
        int i10;
        int i11;
        boolean[] zArr;
        s4.d1 K;
        ai.e9 e9Var;
        if (this.o1 || this.J1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (qm0Var.getFastScroll() == null || !qm0Var.getFastScroll().n || currentTimeMillis - uu0Var.a >= 300) {
            uu0Var.a = currentTimeMillis;
            if (this.V0 && this.U0 && uu0Var.F != 11) {
                return;
            }
            int i12 = 7;
            if (uu0Var.F == 7) {
                return;
            }
            int L0 = d0Var.L0();
            int abs = L0 == -1 ? 0 : Math.abs(d0Var.N0() - L0) + 1;
            int h = qm0Var.getAdapter() == null ? 0 : qm0Var.getAdapter().h();
            int i13 = uu0Var.F;
            int[] iArr = this.m1;
            qv0[] qv0VarArr = this.t1;
            if (i13 == 0 || i13 == 1 || i13 == 2 || i13 == 4) {
                h = qv0VarArr[i13].d() + qv0VarArr[i13].a.size();
                qv0 qv0Var = qv0VarArr[i13];
                if (qv0Var.h && qv0Var.e.size() > 2 && uu0Var.F == 0 && qv0VarArr[i13].a.size() != 0) {
                    float f7 = i13 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((qm0Var.getMeasuredHeight() / (qm0Var.getMeasuredWidth() / f7)) * f7 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((zu0) qv0VarArr[i13].e.get(1)).b) {
                        measuredHeight = ((zu0) qv0VarArr[i13].e.get(1)).b;
                    }
                    if ((L0 > h && L0 - h > measuredHeight) || ((i10 = L0 + abs) < qv0VarArr[i13].m && qv0VarArr[0].m - i10 > measuredHeight)) {
                        zk zkVar = new zk(this, i13, qm0Var, 13);
                        this.J1 = zkVar;
                        AndroidUtilities.runOnUIThread(zkVar);
                        return;
                    }
                }
            }
            int i14 = uu0Var.F;
            if (i14 == 7) {
                return;
            }
            if (p0(i14)) {
                yv0 k12 = k1(uu0Var.F);
                if (k12 == null || (e9Var = k12.s) == null || L0 + abs <= e9Var.i() - iArr[1]) {
                    return;
                }
                k12.P();
                return;
            }
            int i15 = uu0Var.F;
            if (i15 == 6) {
                if (abs > 0) {
                    mu0 mu0Var = this.P;
                    boolean z10 = mu0Var.h;
                    ArrayList arrayList = mu0Var.d;
                    if (z10 || mu0Var.e || arrayList.isEmpty() || L0 + abs < h - 5) {
                        return;
                    }
                    mu0.E(mu0Var, ((TLRPC.Chat) hg.c.g(1, arrayList)).id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var = this.v1;
            if (i15 == 11) {
                int i16 = -1;
                for (int i17 = 0; i17 < uu0Var.h.getChildCount(); i17++) {
                    View childAt = uu0Var.h.getChildAt(i17);
                    uu0Var.h.getClass();
                    i16 = Math.max(RecyclerView.R(childAt), i16);
                }
                s4.i0 adapter = uu0Var.h.getAdapter();
                mv0 mv0Var = this.S;
                if (adapter != mv0Var) {
                    if (i16 + 1 >= n2Var.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                        n2Var.getMessagesController().getSavedMessagesController().loadDialogs(false);
                        return;
                    }
                    return;
                } else {
                    if (i16 + 1 < mv0Var.h.size() + mv0Var.e.size() || mv0Var.s || mv0Var.r) {
                        return;
                    }
                    mv0Var.r = true;
                    mv0Var.F();
                    return;
                }
            }
            if (i15 == 10 || i15 == 12 || i15 == 13 || i15 == 14) {
                return;
            }
            int i18 = i15 == 0 ? 3 : i15 == 5 ? 10 : 6;
            int i19 = i15 == 15 ? 8 : i15;
            if (abs + L0 > h - i18 || qv0VarArr[i19].o) {
                qv0 qv0Var2 = qv0VarArr[i19];
                if (!qv0Var2.g) {
                    if (i15 == 0) {
                        int i20 = qv0VarArr[0].q;
                        if (i20 == 1) {
                            i11 = 6;
                        } else {
                            if (i20 != 2) {
                                i11 = 0;
                            }
                            i11 = i12;
                        }
                        zArr = qv0Var2.i;
                        if (zArr[0]) {
                            qv0Var2.g = true;
                            n2Var.getMediaDataController().loadMedia(this.j1, 50, qv0VarArr[i19].j[0], 0, i11, this.F, 1, n2Var.getClassGuid(), qv0VarArr[i19].p, null, null);
                        } else if (this.c1 != 0 && !zArr[1]) {
                            qv0Var2.g = true;
                            n2Var.getMediaDataController().loadMedia(this.c1, 50, qv0VarArr[i19].j[1], 0, i11, this.F, 1, n2Var.getClassGuid(), qv0VarArr[i19].p, null, null);
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
                        zArr = qv0Var2.i;
                        if (zArr[0]) {
                        }
                    }
                }
            }
            int i21 = qv0VarArr[i19].m;
            if (i19 == 0) {
                i21 = this.H.L(0);
            }
            if (L0 - i21 < i18 + 1) {
                qv0 qv0Var3 = qv0VarArr[i19];
                if (!qv0Var3.g && !qv0Var3.l && !qv0Var3.o) {
                    A0(uu0Var.F);
                }
            }
            uu0 uu0Var2 = this.k0[0];
            if (uu0Var2.h == qm0Var) {
                int i22 = uu0Var2.F;
                if ((i22 != 0 && i22 != 5) || L0 == -1 || (K = qm0Var.K(L0)) == null) {
                    return;
                }
                int i23 = K.f;
                if (i23 == 0 || i23 == 12) {
                    View view = K.a;
                    boolean z11 = view instanceof org.telegram.ui.Cells.u7;
                    org.telegram.ui.Cells.w0 w0Var = this.K0;
                    if (!z11) {
                        if (view instanceof org.telegram.ui.Cells.f2) {
                            w0Var.X(((org.telegram.ui.Cells.f2) view).getDate(), false, true);
                        }
                    } else {
                        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                        MessageObject messageObject = u7Var.e <= 0 ? null : u7Var.b[0];
                        if (messageObject != null) {
                            w0Var.X(messageObject.messageOwner.date, false, true);
                        }
                    }
                }
            }
        }
    }

    public final void G0(int i10, View view, MessageObject messageObject, int i11) {
        String str;
        if (messageObject == null || this.o1) {
            return;
        }
        ws0 ws0Var = this.W;
        if (ws0Var == null || !ws0Var.w) {
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
                D0(sparseArrayArr[0]);
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    b1(false);
                } else {
                    this.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    this.l0.setVisibility(this.a1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.v0 v0Var = this.u0;
                    if (v0Var != null) {
                        v0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.t0;
                    if (v0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        v0Var2.setVisibility(i13);
                    }
                    u1();
                }
                this.b1 = false;
                if (view instanceof org.telegram.ui.Cells.k7) {
                    ((org.telegram.ui.Cells.k7) view).b(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.u7) {
                    ((org.telegram.ui.Cells.u7) view).b(0, sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0);
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    ((org.telegram.ui.Cells.n7) view).f(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    ((org.telegram.ui.Cells.j7) view).e(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    ((org.telegram.ui.Cells.f2) view).c(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.t7) {
                    ((org.telegram.ui.Cells.t7) view).i(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                }
            } else {
                bt0 bt0Var = this.r1;
                qv0[] qv0VarArr = this.t1;
                org.telegram.ui.ActionBar.n2 n2Var = this.v1;
                if (i11 == 0) {
                    qv0 qv0Var = qv0VarArr[i11];
                    int i14 = i10 - qv0Var.m;
                    if (i14 >= 0 && i14 < qv0Var.a.size()) {
                        PhotoViewer.t1().K2(null, n2Var, null);
                        PhotoViewer.t1().b2(qv0VarArr[i11].a, i14, this.j1, this.c1, this.F, bt0Var);
                    }
                } else if (i11 == 2 || i11 == 4) {
                    if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).a();
                    }
                } else if (i11 == 5) {
                    PhotoViewer.t1().K2(null, n2Var, null);
                    int indexOf = qv0VarArr[i11].a.indexOf(messageObject);
                    if (indexOf < 0) {
                        PhotoViewer.t1().b2(org.telegram.messenger.q.k(messageObject), 0, 0L, 0L, 0L, bt0Var);
                    } else {
                        PhotoViewer.t1().b2(qv0VarArr[i11].a, indexOf, this.j1, this.c1, this.F, bt0Var);
                    }
                } else if (i11 == 1) {
                    if (view instanceof org.telegram.ui.Cells.k7) {
                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                        TLRPC.Document document = messageObject.getDocument();
                        if (k7Var.G) {
                            if (messageObject.canPreviewDocument()) {
                                PhotoViewer.t1().K2(null, n2Var, null);
                                int indexOf2 = qv0VarArr[i11].a.indexOf(messageObject);
                                if (indexOf2 < 0) {
                                    PhotoViewer.t1().b2(org.telegram.messenger.q.k(messageObject), 0, 0L, 0L, 0L, bt0Var);
                                    return;
                                } else {
                                    PhotoViewer.t1().b2(qv0VarArr[i11].a, indexOf2, this.j1, this.c1, this.F, bt0Var);
                                    return;
                                }
                            }
                            AndroidUtilities.openDocument(messageObject, n2Var.getParentActivity(), n2Var);
                        } else if (k7Var.F) {
                            n2Var.getFileLoader().cancelLoadFile(document);
                            k7Var.f(true);
                        } else {
                            MessageObject message = k7Var.getMessage();
                            message.putInDownloadsStore = true;
                            n2Var.getFileLoader().loadFile(document, message, 0, 0);
                            k7Var.f(true);
                        }
                    }
                } else if (i11 == 3) {
                    try {
                        TLRPC.WebPage webPage = MessageObject.getMedia(messageObject.messageOwner) != null ? MessageObject.getMedia(messageObject.messageOwner).webpage : null;
                        if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            str = null;
                        } else {
                            if (webPage.cached_page != null) {
                                LaunchActivity launchActivity = LaunchActivity.G1;
                                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                                    n2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str3 = webPage.embed_url;
                            if (str3 != null && str3.length() != 0) {
                                lv.J(n2Var, messageObject, this.r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                return;
                            }
                            str = webPage.url;
                        }
                        if (str == null) {
                            ArrayList arrayList = ((org.telegram.ui.Cells.n7) view).E;
                            if (arrayList.size() > 0) {
                                str2 = ((CharSequence) arrayList.get(0)).toString();
                            }
                            str = str2;
                        }
                        if (str != null) {
                            R0(str);
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                } else if (p0(i11)) {
                    yv0 k12 = k1(i11);
                    ai.e9 e9Var = k12 != null ? k12.s : null;
                    if (e9Var == null) {
                        return;
                    }
                    ai.kc orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int id2 = messageObject.getId();
                    ai.v9 a2 = ai.v9.a(this.k0[0].h);
                    a2.e = new bw(e9Var, 19);
                    if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).s1) {
                        i12 = AndroidUtilities.dp(68.0f);
                    }
                    a2.s += i12;
                    orCreateStoryViewer.C(context, id2, e9Var, a2);
                }
            }
            p1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean H(MotionEvent motionEvent) {
        qs0 qs0Var;
        uu0[] uu0VarArr = this.k0;
        int i10 = uu0VarArr[0].F;
        if (i10 == 13 && (qs0Var = this.U) != null) {
            View currentView = qs0Var.n.getCurrentView();
            if (currentView instanceof bi.u) {
                bi.u uVar = (bi.u) currentView;
                bi.m mVar = uVar.v;
                bi.j jVar = uVar.f;
                if (uVar.a != null && uVar.getParent() != null) {
                    if (!uVar.b || uVar.K) {
                        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                            if (uVar.L && !uVar.K && motionEvent.getPointerCount() == 2) {
                                uVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                uVar.Q = 1.0f;
                                uVar.N = motionEvent.getPointerId(0);
                                uVar.O = motionEvent.getPointerId(1);
                                jVar.I0(false);
                                jVar.cancelLongPress();
                                jVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) uVar.getParent();
                                uVar.U = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - uVar.getX());
                                int y3 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - uVar.getY());
                                int i11 = uVar.U;
                                Rect rect = uVar.V;
                                uVar.S = -1;
                                int i12 = y3 + jVar.V2;
                                for (int i13 = 0; i13 < jVar.getChildCount(); i13++) {
                                    View childAt = jVar.getChildAt(i13);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i11, i12)) {
                                        uVar.S = RecyclerView.S(childAt);
                                        uVar.T = childAt.getTop();
                                    }
                                }
                                uVar.M = true;
                            }
                            if (motionEvent.getActionMasked() == 0) {
                                if ((motionEvent.getY() - ((View) uVar.getParent()).getY()) - uVar.getY() > 0.0f) {
                                    uVar.L = true;
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 2 && (uVar.K || uVar.M)) {
                            int i14 = -1;
                            int i15 = -1;
                            for (int i16 = 0; i16 < motionEvent.getPointerCount(); i16++) {
                                if (uVar.N == motionEvent.getPointerId(i16)) {
                                    i14 = i16;
                                }
                                if (uVar.O == motionEvent.getPointerId(i16)) {
                                    i15 = i16;
                                }
                            }
                            if (i14 == -1 || i15 == -1) {
                                uVar.L = false;
                                uVar.M = false;
                                uVar.K = false;
                                uVar.a();
                                return false;
                            }
                            float hypot = ((float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14))) / uVar.P;
                            uVar.Q = hypot;
                            if (!uVar.K && (hypot > 1.01f || hypot < 0.99f)) {
                                uVar.K = true;
                                boolean z10 = hypot > 1.0f;
                                uVar.R = z10;
                                uVar.b(z10);
                            }
                            if (uVar.K) {
                                boolean z11 = uVar.R;
                                if ((!z11 || uVar.Q >= 1.0f) && (z11 || uVar.Q <= 1.0f)) {
                                    uVar.c = Math.max(0.0f, Math.min(1.0f, z11 ? org.telegram.messenger.q.x(2.0f, uVar.Q, 1.0f, 1.0f) : (1.0f - uVar.Q) / 0.5f));
                                } else {
                                    uVar.c = 0.0f;
                                }
                                float f7 = uVar.c;
                                if (f7 == 1.0f || f7 == 0.0f) {
                                    if (f7 == 1.0f) {
                                        int i17 = uVar.e;
                                        int ceil = (((int) Math.ceil(uVar.S / uVar.e)) * i17) + ((int) ((uVar.W.G.z1 / (jVar.getMeasuredWidth() - ((int) (jVar.getMeasuredWidth() / uVar.e)))) * (i17 - 1)));
                                        if (ceil >= mVar.h()) {
                                            ceil = mVar.h() - 1;
                                        }
                                        uVar.S = ceil;
                                    }
                                    uVar.a();
                                    if (uVar.c == 0.0f) {
                                        uVar.R = !uVar.R;
                                    }
                                    uVar.b(uVar.R);
                                    uVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                jVar.invalidate();
                            }
                        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((uVar.N == motionEvent.getPointerId(0) && uVar.O == motionEvent.getPointerId(1)) || (uVar.N == motionEvent.getPointerId(1) && uVar.O == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && uVar.K) {
                            uVar.M = false;
                            uVar.L = false;
                            uVar.K = false;
                            uVar.a();
                        }
                        return uVar.K;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i10 == 0 || p0(i10)) && getParent() != null) {
            if (!this.o1 || this.a) {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (this.b && !this.a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f = motionEvent.getPointerId(1);
                        uu0VarArr[0].h.I0(false);
                        uu0VarArr[0].h.cancelLongPress();
                        uu0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - uu0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - uu0VarArr[0].getY());
                        int i18 = this.w;
                        this.s = -1;
                        int i19 = y10 + uu0VarArr[0].h.V2;
                        if (getY() != 0.0f && this.E == 1) {
                            i19 = 0;
                        }
                        for (int i20 = 0; i20 < uu0VarArr[0].h.getChildCount(); i20++) {
                            View childAt2 = uu0VarArr[0].h.getChildAt(i20);
                            Rect rect2 = this.x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i18, i19)) {
                                uu0VarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.D1.T() && this.s == -1) {
                            this.s = (int) (((this.m1[p0(uu0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i18 / uu0VarArr[0].h.getMeasuredWidth(), 0.0f))) + uu0VarArr[0].x.L0());
                            this.v = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - uu0VarArr[0].getY() > 0.0f) {
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
                            this.n1 = Math.max(0.0f, Math.min(1.0f, z13 ? org.telegram.messenger.q.x(2.0f, this.n, 1.0f, 1.0f) : (1.0f - this.n) / 0.5f));
                        } else {
                            this.n1 = 0.0f;
                        }
                        float f10 = this.n1;
                        if (f10 == 1.0f || f10 == 0.0f) {
                            s4.i0 k12 = p0(this.p1) ? k1(this.p1) : this.H;
                            if (this.n1 == 1.0f) {
                                int i24 = this.q1;
                                int ceil2 = (((int) Math.ceil(this.s / this.q1)) * i24) + ((int) ((this.z1 / (uu0VarArr[0].h.getMeasuredWidth() - ((int) (uu0VarArr[0].h.getMeasuredWidth() / this.q1)))) * (i24 - 1)));
                                if (ceil2 >= k12.h()) {
                                    ceil2 = k12.h() - 1;
                                }
                                this.s = ceil2;
                            }
                            T();
                            if (this.n1 == 0.0f) {
                                this.r = !this.r;
                            }
                            e1(this.r);
                            this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        }
                        uu0VarArr[0].h.invalidate();
                        uu0 uu0Var = uu0VarArr[0];
                        if (uu0Var.G != null) {
                            uu0Var.invalidate();
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
        ws0 ws0Var;
        final TL_stories.StoryItem storyItem;
        ju0 ju0Var;
        ai.e9 e9Var;
        final int i11 = 0;
        if (!this.C1) {
            org.telegram.ui.ActionBar.n2 n2Var = this.v1;
            if (n2Var.getParentActivity() != null && messageObject != null && ((ws0Var = this.W) == null || !ws0Var.w)) {
                AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
                long j3 = this.j1;
                int i12 = 8;
                final int i13 = 1;
                if (!z10 || (!(w0(getClosestTab()) || getClosestTab() == 8) || this.C1)) {
                    char c10 = messageObject.getDialogId() == j3 ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.Z0;
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.a1++;
                    }
                    this.l0.setVisibility(this.a1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.v0 v0Var = this.u0;
                    if (v0Var != null) {
                        v0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.t0;
                    if (v0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        v0Var2.setVisibility(i12);
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
                    if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.u7) {
                        ((org.telegram.ui.Cells.u7) view).b(i10, true);
                    } else if (view instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.f2) {
                        ((org.telegram.ui.Cells.f2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.t7) {
                        ((org.telegram.ui.Cells.t7) view).i(true, true);
                    }
                    if (!this.C1) {
                        b1(true);
                    }
                    D0(sparseArrayArr[0]);
                    p1();
                    return true;
                }
                if (view instanceof org.telegram.ui.Cells.t7) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                    t7Var.k(t7Var.n, t7Var.r, true);
                }
                TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean w02 = w0(getClosestTab());
                    p80 I = p80.I(n2Var, view);
                    p80 J = I.J();
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.nu0(I, 26), false);
                    J.k();
                    p80.f(J, getStoriesController().B(j3, true), hashSet, true, new og0(this, storyItem2, I, 4), new ai.f4(this, hashSet, storyItem2, I, 10));
                    I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new ei.m2(I, J, 9), false);
                    I.k();
                    I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new ai.d9(this, messageObject, view, i10, 23), false);
                    final int i15 = 3;
                    if (w02) {
                        int h12 = h1(getClosestTab());
                        String w10 = getStoriesController().w(h12, j3);
                        I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new nd(this, h12, 7), false);
                        storyItem = storyItem2;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new ai.d9(this, h12, storyItem, w10, 24), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (ju0Var = this.c0) != null && (e9Var = ju0Var.s) != null) {
                            if (e9Var.m(storyItem.id)) {
                                I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() { // from class: org.telegram.ui.Components.yr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                bw0 bw0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bw0Var.getContext(), 0, bw0Var.F1);
                                                alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new fs0(bw0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fe0(14));
                                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                                b2Var.show();
                                                b2Var.h();
                                                break;
                                            case 1:
                                                bw0 bw0Var2 = this;
                                                bw0Var2.getClass();
                                                bw0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                bw0 bw0Var3 = this;
                                                bw0Var3.getClass();
                                                bw0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                bw0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final int i16 = 2;
                                I.c(R.drawable.chats_pin, LocaleController.getString(R.string.StoriesAlbumMenuPin), new Runnable() { // from class: org.telegram.ui.Components.yr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                bw0 bw0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bw0Var.getContext(), 0, bw0Var.F1);
                                                alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new fs0(bw0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fe0(14));
                                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                                b2Var.show();
                                                b2Var.h();
                                                break;
                                            case 1:
                                                bw0 bw0Var2 = this;
                                                bw0Var2.getClass();
                                                bw0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                bw0 bw0Var3 = this;
                                                bw0Var3.getClass();
                                                bw0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                bw0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        I.c(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable() { // from class: org.telegram.ui.Components.yr0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        bw0 bw0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bw0Var.getContext(), 0, bw0Var.F1);
                                        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new fs0(bw0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fe0(14));
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                        b2Var.show();
                                        b2Var.h();
                                        break;
                                    case 1:
                                        bw0 bw0Var2 = this;
                                        bw0Var2.getClass();
                                        bw0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                        break;
                                    case 2:
                                        bw0 bw0Var3 = this;
                                        bw0Var3.getClass();
                                        bw0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                        break;
                                    default:
                                        bw0.h(this, storyItem);
                                        break;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.Components.yr0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    bw0 bw0Var = this;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bw0Var.getContext(), 0, bw0Var.F1);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                    alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new fs0(bw0Var, storyItem));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fe0(14));
                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                    b2Var.show();
                                    b2Var.h();
                                    break;
                                case 1:
                                    bw0 bw0Var2 = this;
                                    bw0Var2.getClass();
                                    bw0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                    break;
                                case 2:
                                    bw0 bw0Var3 = this;
                                    bw0Var3.getClass();
                                    bw0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                    break;
                                default:
                                    bw0.h(this, storyItem);
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
        uu0[] uu0VarArr = this.k0;
        uu0 uu0Var = uu0VarArr[0];
        if (uu0Var == null || uu0VarArr[1] == null) {
            return;
        }
        float f7 = 0.0f;
        ws0 ws0Var = this.W;
        if (ws0Var != null) {
            char c10 = (!p0(uu0Var.F) || uu0VarArr[0].F == 9) ? (char) 0 : (char) 1;
            if (c10 == (uu0VarArr[1].getVisibility() == 0 ? (!p0(uu0VarArr[1].F) || uu0VarArr[1].F == 9) ? (char) 0 : (char) 1 : c10)) {
                abs = c10 != 0 ? 1.0f : 0.0f;
                ws0Var.setTranslationX(c10 != 0 ? 0.0f : uu0VarArr[0].getMeasuredWidth());
            } else {
                ws0Var.setTranslationX(uu0VarArr[c10 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(ws0Var.getTranslationX()) / ws0Var.getMeasuredWidth());
            }
            float f10 = 0.0f;
            for (int i10 = 0; i10 < uu0VarArr.length; i10++) {
                if (uu0VarArr[i10].getVisibility() == 0) {
                    at0 at0Var = uu0VarArr[i10].h;
                    View childAt = at0Var.getChildCount() == 0 ? null : at0Var.getChildAt(0);
                    f10 += Utilities.clamp01(1.0f - (uu0VarArr[i10].getTranslationX() / uu0VarArr[i10].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - at0Var.getPaddingTop() : at0Var.getChildCount() == 0 ? 0.0f : -AndroidUtilities.dp(48.0f));
                }
            }
            float clamp01 = Utilities.clamp01(1.0f - ((-f10) / AndroidUtilities.dpf2(48.0f)));
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
            ws0Var.setAlpha(clamp01);
            ws0Var.setScaleX(lerp);
            ws0Var.setScaleY(lerp);
            ws0Var.setTranslationY(this.K1 + f10);
            f7 = abs;
        }
        K();
        if (this.U1 != f7) {
            this.U1 = f7;
            o0();
            invalidate();
        }
    }

    public boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
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
        uu0[] uu0VarArr = this.k0;
        if (!z10) {
            if (Math.abs(uu0VarArr[1].getTranslationX()) < 1.0f) {
                uu0VarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.h1 ? -1 : 1));
                uu0VarArr[1].setTranslationX(0.0f);
                animatorSet = this.f1;
                if (animatorSet != null) {
                }
                this.g1 = false;
            }
            M0(getTabProgress());
            return this.g1;
        }
        if (Math.abs(uu0VarArr[0].getTranslationX()) < 1.0f) {
            uu0VarArr[0].setTranslationX(0.0f);
            uu0VarArr[1].setTranslationX(uu0VarArr[0].getMeasuredWidth() * (this.h1 ? 1 : -1));
            animatorSet = this.f1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f1 = null;
            }
            this.g1 = false;
        }
        M0(getTabProgress());
        return this.g1;
    }

    public final void J0(float f7) {
        uu0[] uu0VarArr = this.k0;
        if (f7 != 1.0f || uu0VarArr[1].getVisibility() == 0) {
            if (this.h1) {
                uu0VarArr[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                uu0VarArr[1].setTranslationX(uu0VarArr[0].getMeasuredWidth() - (uu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                uu0VarArr[0].setTranslationX(r3.getMeasuredWidth() * f7);
                uu0VarArr[1].setTranslationX((uu0VarArr[0].getMeasuredWidth() * f7) - uu0VarArr[0].getMeasuredWidth());
            }
            M0(getTabProgress());
            float a02 = a0(f7);
            this.p0 = a02;
            this.r0.setVisibility((a02 == 0.0f || !D() || q0()) ? 4 : 0);
            org.telegram.ui.ActionBar.v0 v0Var = this.n0;
            if (v0Var == null || D()) {
                this.o0 = b0(f7);
                t1();
            } else {
                v0Var.setVisibility(v0() ? 8 : 4);
                this.o0 = 0.0f;
            }
            q1(false);
            if (f7 == 1.0f) {
                uu0 uu0Var = uu0VarArr[0];
                uu0VarArr[0] = uu0VarArr[1];
                uu0VarArr[1] = uu0Var;
                uu0Var.setVisibility(8);
                if (v0Var != null && this.x0 == 2) {
                    v0Var.setVisibility(v0() ? 8 : 4);
                }
                this.x0 = 0;
                f1();
            }
        }
    }

    public final void K() {
        at atVar = this.P0;
        if (atVar != null) {
            ws0 ws0Var = this.W;
            float f7 = 0.0f;
            if (ws0Var != null) {
                f7 = 0.0f + (ws0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(ws0Var.getTranslationX() / ws0Var.getMeasuredWidth())));
            }
            atVar.setTranslationY(this.K1 + f7);
        }
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
        D0(sparseArrayArr[0]);
        qs0 qs0Var = this.U;
        if (qs0Var != null) {
            qs0Var.h();
            qs0Var.j();
        }
        b1(false);
        r1(z10);
        lv0 lv0Var = this.R;
        if (lv0Var != null) {
            lv0Var.w.clear();
        }
        return true;
    }

    public void L0() {
        boolean z10 = v0() || q0();
        wv0 wv0Var = this.e0.w;
        if (wv0Var != null) {
            wv0Var.b(z10 && getClosestTab() == 9);
        }
        wv0 wv0Var2 = this.c0.w;
        if (wv0Var2 != null) {
            wv0Var2.b(z10 && getClosestTab() == 8);
        }
        for (aw0 aw0Var : this.Y1.values()) {
            zv0 zv0Var = aw0Var.c;
            if (zv0Var.s != null) {
                zv0Var.w.b(z10 && getClosestTab() == aw0Var.a);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.n0;
        if (v0Var != null) {
            ot0 ot0Var = this.J0;
            v0Var.setSearchFieldHint(LocaleController.getString((ot0Var != null && ot0Var.a() && getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
        I();
    }

    public void M0(float f7) {
        E0();
    }

    public boolean N() {
        return this instanceof p40;
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        uu0[] uu0VarArr = this.k0;
        motionEvent.offsetLocation(x10 - uu0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - uu0VarArr[0].getY()) - uu0VarArr[0].h.getFastScroll().getY());
        return uu0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void O0(org.telegram.ui.ActionBar.n2 n2Var, long j3, int i10) {
        new org.telegram.ui.x71(n2Var, j3, this.m1[1], new wc(this, j3, i10)).show();
    }

    public void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void P0(org.telegram.ui.ActionBar.n2 n2Var, long j3, int i10) {
        g5.u0(n2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j3))), LocaleController.getString(R.string.Delete), true, new ai.b8(this, j3, i10, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.k0;
            if (i10 >= uu0VarArr.length) {
                return;
            }
            uu0 uu0Var = uu0VarArr[i10];
            if (uu0Var != null && uu0Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < uu0VarArr[i10].h.getChildCount(); i11++) {
                    View childAt = uu0VarArr[i10].h.getChildAt(i11);
                    if (childAt.getY() < AndroidUtilities.dp(100.0f) + uu0VarArr[i10].h.V2) {
                        int save = canvas.save();
                        canvas.translate(childAt.getX() + uu0VarArr[i10].getX(), childAt.getY() + uu0VarArr[i10].h.getY() + uu0VarArr[i10].getY() + getY());
                        childAt.draw(canvas);
                        if (arrayList != null && (childAt instanceof pw0)) {
                            arrayList.add((pw0) childAt);
                        }
                        canvas.restoreToCount(save);
                    }
                }
            }
            i10++;
        }
    }

    public final void Q0(org.telegram.ui.ActionBar.n2 n2Var, long j3, int i10) {
        String w10 = getStoriesController().w(i10, j3);
        Context context = n2Var.getContext();
        org.telegram.ui.ActionBar.e6 resourceProvider = n2Var.getResourceProvider();
        j2.d dVar = new j2.d(this, j3, i10, 6);
        Pattern pattern = g5.a;
        g5.Q(context, n2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w10, 12, LocaleController.getString(R.string.Rename), resourceProvider, dVar);
    }

    public final boolean R(int i10) {
        qv0[] qv0VarArr = this.u1.n;
        if (qv0VarArr == null) {
            return false;
        }
        qv0[] qv0VarArr2 = this.t1;
        if (i10 == 0) {
            qv0 qv0Var = qv0VarArr2[i10];
            if (!qv0Var.h) {
                int[] iArr = qv0Var.f;
                int[] iArr2 = qv0VarArr[i10].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = qv0VarArr2[i10].f;
            int[] iArr4 = qv0VarArr[i10].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        qv0VarArr2[i10].a.addAll(qv0VarArr[i10].a);
        qv0VarArr2[i10].c.addAll(qv0VarArr[i10].c);
        for (Map.Entry entry : qv0VarArr[i10].d.entrySet()) {
            qv0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            qv0VarArr2[i10].b[i11] = qv0VarArr[i10].b[i11].clone();
            qv0 qv0Var2 = qv0VarArr2[i10];
            int[] iArr5 = qv0Var2.j;
            qv0 qv0Var3 = qv0VarArr[i10];
            iArr5[i11] = qv0Var3.j[i11];
            qv0Var2.i[i11] = qv0Var3.i[i11];
        }
        qv0VarArr2[i10].e.addAll(qv0VarArr[i10].e);
        return !qv0VarArr[i10].a.isEmpty();
    }

    public final void R0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        if (shouldShowUrlInAlert) {
            g5.p0(n2Var, str, true, true);
        } else {
            of.f.s(n2Var.getParentActivity(), str);
        }
    }

    public final void S(int i10, qm0 qm0Var, boolean z10) {
        ArrayList arrayList = this.t1[i10].e;
        int L0 = ((s4.d0) qm0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            zu0 zu0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (L0 <= ((zu0) arrayList.get(i11)).b) {
                        zu0Var = (zu0) arrayList.get(i11);
                        break;
                    }
                    i11++;
                }
                if (zu0Var == null) {
                    zu0Var = (zu0) hg.c.g(1, arrayList);
                }
            }
            if (zu0Var != null) {
                y0(i10, zu0Var.d, zu0Var.b + 1, z10);
            }
        }
    }

    public int S0() {
        return -1;
    }

    public final void T() {
        uu0[] uu0VarArr;
        uu0 uu0Var;
        int i10;
        s4.i0 adapter;
        if (this.o1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                uu0VarArr = this.k0;
                if (i12 >= uu0VarArr.length) {
                    uu0Var = null;
                    break;
                }
                uu0Var = uu0VarArr[i12];
                if (uu0Var.F == this.p1) {
                    break;
                } else {
                    i12++;
                }
            }
            if (uu0Var != null) {
                boolean p02 = p0(uu0Var.F);
                float f7 = this.n1;
                qv0[] qv0VarArr = this.t1;
                if (f7 != 1.0f) {
                    if (f7 == 0.0f) {
                        this.o1 = false;
                        if (this.p1 == 0) {
                            qv0VarArr[0].g(false);
                        }
                        uu0Var.r.setVisibility(8);
                        uu0Var.h.invalidate();
                        return;
                    }
                    boolean z10 = f7 > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new qt0(this, uu0Var, i11));
                    ofFloat.addListener(new org.telegram.ui.ej(this, z10, p02 ? 1 : 0, uu0Var));
                    ofFloat.setInterpolator(hs.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.o1 = false;
                int i13 = this.q1;
                int[] iArr = this.m1;
                iArr[p02 ? 1 : 0] = i13;
                if (!p02) {
                    SharedConfig.setMediaColumnsCount(i13);
                } else if (c0(uu0Var.F) >= 5) {
                    SharedConfig.setStoriesColumnsCount(this.q1);
                }
                for (int i14 = 0; i14 < uu0VarArr.length; i14++) {
                    uu0 uu0Var2 = uu0VarArr[i14];
                    if (uu0Var2 != null && uu0Var2.h != null && (((i10 = uu0Var2.F) == 0 || p0(i10)) && (adapter = uu0VarArr[i14].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i14 == 0) {
                            qv0VarArr[0].g(false);
                        }
                        uu0VarArr[i14].r.setVisibility(8);
                        uu0VarArr[i14].x.y1(iArr[p02 ? 1 : 0]);
                        uu0VarArr[i14].h.a0();
                        uu0VarArr[i14].h.invalidate();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(uu0VarArr[i14].h);
                        } else {
                            adapter.l();
                        }
                    }
                }
                if (this.s < 0) {
                    X0();
                    return;
                }
                while (i11 < uu0VarArr.length) {
                    uu0 uu0Var3 = uu0VarArr[i11];
                    if (uu0Var3.F == this.p1) {
                        View m10 = uu0Var3.s.m(this.s);
                        if (m10 != null) {
                            this.v = m10.getTop();
                        }
                        uu0 uu0Var4 = uu0VarArr[i11];
                        uu0Var4.x.h1(this.s, (-uu0Var4.h.getPaddingTop()) + this.v);
                    }
                    i11++;
                }
            }
        }
    }

    public final void T0(ArrayList arrayList, boolean z10) {
        ju0 ju0Var = this.c0;
        if (ju0Var == null || ju0Var.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        if (z10 && arrayList.size() > n2Var.getMessagesController().storiesPinnedToTopCountMax) {
            ad.a0(n2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", n2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            return;
        }
        ai.e9 e9Var = ju0Var.s;
        int i10 = e9Var.c;
        ArrayList arrayList2 = e9Var.g;
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
                e9Var.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(e9Var.d);
                ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new ai.v7(2));
            }
            z11 = z12;
        }
        if (z11) {
            ad.a0(n2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", n2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
        } else if (z10) {
            ad.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
        } else {
            ad.a0(n2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
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

    public final boolean U0(MotionEvent motionEvent, boolean z10) {
        uu0 uu0Var;
        qs0 qs0Var;
        int closestTab = getClosestTab();
        rt0 rt0Var = this.I0;
        int i10 = -1;
        int i11 = rt0Var.O.get(rt0Var.n + (z10 ? 1 : -1), -1);
        ws0 ws0Var = this.W;
        if (ws0Var != null) {
            if (w0(closestTab) || closestTab == 8) {
                n91 n91Var = ws0Var.n;
                i10 = n91Var.b0.get(n91Var.F + (z10 ? 1 : -1), -1);
            } else if (w0(i11) || i11 == 8) {
                i10 = ws0Var.getCurrentAlbumId();
            }
            if (i10 == 0) {
                i11 = 8;
            } else if (i10 > 0) {
                i11 = i1(i10).a;
            }
        }
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.v0 v0Var = this.n0;
            if (v0Var == null || D()) {
                this.o0 = b0(0.0f);
                s1(0.0f);
            } else {
                v0Var.setVisibility(v0() ? 8 : 4);
                this.o0 = 0.0f;
            }
            if ((!this.V0 || getSelectedTab() != 11) && (!C() || !this.C1 || (getClosestTab() != 8 && !w0(getClosestTab())))) {
                uu0[] uu0VarArr = this.k0;
                uu0 uu0Var2 = uu0VarArr[0];
                if (uu0Var2 != null && uu0Var2.F == 13 && (qs0Var = this.U) != null) {
                    bi.a aVar = qs0Var.n;
                    if (!z10) {
                    }
                }
                uu0 uu0Var3 = uu0VarArr[0];
                rs0 rs0Var = this.V;
                if (uu0Var3 != null && uu0Var3.F == 14 && rs0Var != null) {
                    xh.x1 x1Var = rs0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.C1 || (uu0Var = uu0VarArr[0]) == null || uu0Var.F != 13) && ((rs0Var == null || !rs0Var.g()) && (ws0Var == null || !ws0Var.w))) {
                    q1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    k0();
                    this.y1 = false;
                    this.x1 = true;
                    N0(true);
                    this.z1 = (int) motionEvent.getX();
                    this.G.setEnabled(false);
                    rt0Var.setEnabled(false);
                    uu0 uu0Var4 = uu0VarArr[1];
                    uu0Var4.F = i11;
                    uu0Var4.setVisibility(0);
                    this.h1 = z10;
                    m1(true);
                    if (z10) {
                        uu0VarArr[1].setTranslationX(uu0VarArr[0].getMeasuredWidth());
                    } else {
                        uu0VarArr[1].setTranslationX(-uu0VarArr[0].getMeasuredWidth());
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
        qs0 qs0Var;
        if (!r0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (qs0Var = this.U) != null) {
            return qs0Var.getBotPreviewsSubtitle();
        }
        ju0 ju0Var = this.c0;
        if (ju0Var == null || ju0Var.s == null) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < ju0Var.s.i.size(); i12++) {
                MessageObject messageObject = (MessageObject) ju0Var.s.i.get(i12);
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

    public final uu0 W(int i10) {
        int i11 = 0;
        while (true) {
            uu0[] uu0VarArr = this.k0;
            if (i11 >= uu0VarArr.length) {
                return null;
            }
            uu0 uu0Var = uu0VarArr[i11];
            if (uu0Var != null && uu0Var.F == i10) {
                return uu0Var;
            }
            i11++;
        }
    }

    public final void W0(s4.i0 i0Var) {
        if (i0Var instanceof vv0) {
            ArrayList arrayList = this.E0;
            ArrayList arrayList2 = this.F0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (i0Var == this.M) {
            ArrayList arrayList3 = this.G0;
            ArrayList arrayList4 = this.H0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        iv0 iv0Var = this.N;
        if (i0Var == iv0Var) {
            iv0Var.r = null;
        }
    }

    public final int X(int i10, int i11, boolean z10) {
        int i12 = i11 + (!z10 ? 1 : -1);
        if (i12 > 6) {
            i12 = !z10 ? 9 : 6;
        }
        return Utilities.clamp(i12, 9, (this.k1 && i10 == 1) ? 1 : 2);
    }

    public final void X0() {
        int i10;
        int i11 = 0;
        while (true) {
            uu0[] uu0VarArr = this.k0;
            if (i11 >= uu0VarArr.length) {
                return;
            }
            at0 at0Var = uu0VarArr[i11].h;
            if (at0Var != null) {
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < at0Var.getChildCount(); i14++) {
                    View childAt = at0Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.t7) {
                        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                        int messageId = t7Var.getMessageId();
                        i13 = t7Var.getTop();
                        i12 = messageId;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.k7) {
                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                        int id2 = k7Var.getMessage().getId();
                        i13 = k7Var.getTop();
                        i12 = id2;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.j7) {
                        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                        i12 = j7Var.getMessage().getId();
                        i13 = j7Var.getTop();
                    }
                    if (i12 != 0) {
                        break;
                    }
                }
                if (i12 != 0) {
                    int i15 = uu0VarArr[i11].F;
                    int i16 = -1;
                    if (p0(i15)) {
                        yv0 k12 = k1(i15);
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
                        qv0[] qv0VarArr = this.t1;
                        if (i15 < qv0VarArr.length) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= qv0VarArr[i15].a.size()) {
                                    break;
                                }
                                if (i12 == ((MessageObject) qv0VarArr[i15].a.get(i18)).getId()) {
                                    i16 = i18;
                                    break;
                                }
                                i18++;
                            }
                            i10 = qv0VarArr[i15].m + i16;
                        }
                    }
                    if (i16 >= 0) {
                        ((s4.d0) at0Var.getLayoutManager()).h1(i10, (-uu0VarArr[i11].h.getPaddingTop()) + i13);
                        if (this.o1) {
                            uu0 uu0Var = uu0VarArr[i11];
                            uu0Var.s.h1(i10, (-uu0Var.h.getPaddingTop()) + i13);
                        }
                    }
                }
            }
            i11++;
        }
    }

    public final int Y(boolean z10) {
        return this.X1 + (z10 ? AndroidUtilities.dp(52.0f) : 0);
    }

    public final void Y0(int i10) {
        rt0 rt0Var;
        if (this.L1 || (rt0Var = this.I0) == null) {
            return;
        }
        rt0Var.h(null, i10, rt0Var.P.get(i10));
    }

    public final int Z(int i10) {
        int dp = AndroidUtilities.dp(54.0f) + this.b2;
        ws0 ws0Var = this.W;
        return dp + ((int) ((ws0Var == null || !(w0(i10) || i10 == 8)) ? 0.0f : ws0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f))) + (i10 == 9 ? AndroidUtilities.dp(64.0f) : 0);
    }

    public final void Z0(float f7, int i10) {
        rt0 rt0Var = this.I0;
        if (rt0Var != null) {
            rt0Var.j(f7, w0(i10) ? 8 : i10);
        }
        ws0 ws0Var = this.W;
        if (ws0Var != null) {
            n91 n91Var = ws0Var.n;
            if (w0(i10)) {
                n91Var.f(f7, h1(i10));
            } else if (i10 == 8) {
                n91Var.f(f7, 0);
            }
        }
    }

    public final float a0(float f7) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f10 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        uu0[] uu0VarArr = this.k0;
        uu0 uu0Var = uu0VarArr[1];
        rs0 rs0Var = this.V;
        if (uu0Var != null && ((i12 = uu0Var.F) == 0 || (((i12 == 8 || w0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = uu0VarArr[1].F) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && rs0Var != null)))) {
            f10 = 0.0f + f7;
        }
        uu0 uu0Var2 = uu0VarArr[0];
        return (uu0Var2 == null || !((i10 = uu0Var2.F) == 0 || (((i10 == 8 || w0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = uu0VarArr[0].F) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && rs0Var != null)))) ? f10 : (1.0f - f7) + f10;
    }

    public final void a1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.k0;
            if (i10 >= uu0VarArr.length) {
                if (this.F == 0) {
                    lu0 lu0Var = this.a0;
                    lu0Var.d = chatFull;
                    lu0Var.e = arrayList;
                }
                v1(true);
                for (int i11 = 0; i11 < uu0VarArr.length; i11++) {
                    uu0 uu0Var = uu0VarArr[i11];
                    if (uu0Var.F == 7 && uu0Var.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(uu0VarArr[i11].h);
                    }
                }
                return;
            }
            uu0 uu0Var2 = uu0VarArr[i10];
            if (uu0Var2.F == 7 && uu0Var2.h.getAdapter() != null && uu0VarArr[i10].h.getAdapter().h() != 0 && this.v1.getMessagesController().getStoriesController().j.size() > 0) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Cells.o2
    public final boolean b() {
        return false;
    }

    public final float b0(float f7) {
        float f10 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        uu0[] uu0VarArr = this.k0;
        uu0 uu0Var = uu0VarArr[1];
        if (uu0Var != null && s0(uu0Var.F) && uu0VarArr[1].F != 11) {
            f10 = 0.0f + f7;
        }
        uu0 uu0Var2 = uu0VarArr[0];
        return (uu0Var2 == null || !s0(uu0Var2.F) || uu0VarArr[0].F == 11) ? f10 : (1.0f - f7) + f10;
    }

    public void b1(boolean z10) {
        if (this.C1 == z10) {
            return;
        }
        this.C1 = z10;
        AnimatorSet animatorSet = this.N1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ka kaVar = this.B0;
        if (z10) {
            kaVar.setVisibility(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.N1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(kaVar, (Property<ka, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.N1.setDuration(180L);
        this.N1.addListener(new fa(19, this, z10));
        this.N1.start();
        if (z10) {
            u1();
        }
    }

    public final int c0(int i10) {
        yv0 k12;
        ai.e9 e9Var;
        if (!p0(i10) || (k12 = k1(i10)) == null || (e9Var = k12.s) == null) {
            return 0;
        }
        return e9Var.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(int i10, boolean z10) {
        int i11;
        uu0 W;
        if (z10 && getY() != 0.0f && this.E == 1) {
            return;
        }
        if (z10 && p0(i10) && c0(i10) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.j1);
        bundle.putLong("topic_id", this.F);
        qv0[] qv0VarArr = this.t1;
        if (z10 && (W = W(0)) != null) {
            ArrayList arrayList = qv0VarArr[0].e;
            int L0 = W.x.L0();
            if (L0 >= 0) {
                zu0 zu0Var = null;
                if (arrayList != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        if (L0 <= ((zu0) arrayList.get(i12)).b) {
                            zu0Var = (zu0) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (zu0Var == null) {
                        zu0Var = (zu0) hg.c.g(1, arrayList);
                    }
                }
                if (zu0Var != null) {
                    i11 = zu0Var.c;
                    if (i10 != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i10 == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    org.telegram.ui.g8 g8Var = new org.telegram.ui.g8(qv0VarArr[0].q, i11, bundle);
                    g8Var.M = new m.f3(this, 10);
                    this.v1.presentFragment(g8Var);
                }
            }
        }
        i11 = 0;
        if (i10 != 9) {
        }
        org.telegram.ui.g8 g8Var2 = new org.telegram.ui.g8(qv0VarArr[0].q, i11, bundle);
        g8Var2.M = new m.f3(this, 10);
        this.v1.presentFragment(g8Var2);
    }

    public final void d1(int i10) {
        int h12 = h1(getClosestTab());
        ws0 ws0Var = this.W;
        if (h12 != i10) {
            if (ws0Var != null) {
                ws0Var.n.d(i10, ws0Var.s.i(i10));
                return;
            }
            return;
        }
        ws0Var.setReorderingAlbums(true);
        aw0 i12 = i1(i10);
        uu0 W = W(i12.a);
        if (W == null) {
            return;
        }
        at0 at0Var = W.h;
        for (int i11 = 0; i11 < at0Var.getChildCount(); i11++) {
            View childAt = at0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.t7) {
                ((org.telegram.ui.Cells.t7) childAt).l(true, true);
            }
        }
        zv0 zv0Var = i12.c;
        if (zv0Var != null && !zv0Var.x) {
            zv0Var.x = true;
        }
        q1(true);
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
        at0 at0Var;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i12;
        pm0 pm0Var;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        int size;
        int i15;
        boolean z12;
        at0 at0Var2;
        int i16;
        int i17;
        at0 at0Var3;
        int i18 = NotificationCenter.mediaDidLoad;
        pm0 pm0Var2 = this.O;
        pm0 pm0Var3 = this.M;
        pv0 pv0Var = this.J;
        pm0 pm0Var4 = this.L;
        pm0 pm0Var5 = this.K;
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        iv0 iv0Var = this.N;
        gu0 gu0Var = this.H;
        long j3 = this.j1;
        uu0[] uu0VarArr = this.k0;
        qv0[] qv0VarArr = this.t1;
        if (i10 == i18) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != n2Var.getClassGuid() || intValue2 != qv0VarArr[intValue3].p) {
                if (this.u1 == null || !qv0VarArr[intValue3].a.isEmpty() || qv0VarArr[intValue3].o || !R(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    pm0Var2 = gu0Var;
                } else if (intValue3 == 1) {
                    pm0Var2 = pm0Var5;
                } else if (intValue3 == 2) {
                    pm0Var2 = pm0Var4;
                } else if (intValue3 == 3) {
                    pm0Var2 = pv0Var;
                } else if (intValue3 == 4) {
                    pm0Var2 = pm0Var3;
                } else if (intValue3 != 5) {
                    pm0Var2 = intValue3 == 15 ? iv0Var : null;
                }
                if (pm0Var2 != null) {
                    for (int i19 = 0; i19 < uu0VarArr.length; i19++) {
                        uu0 uu0Var = uu0VarArr[i19];
                        if (uu0Var != null && (at0Var2 = uu0Var.h) != null && at0Var2.getAdapter() == pm0Var2) {
                            uu0VarArr[i19].h.B0();
                        }
                    }
                    pm0Var2.l();
                }
                this.b1 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j3);
            int i20 = longValue == j3 ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                qv0VarArr[intValue3].f[i20] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i16 = intValue3;
                pm0Var2 = gu0Var;
            } else if (intValue3 == 1) {
                i16 = intValue3;
                pm0Var2 = pm0Var5;
            } else if (intValue3 == 2) {
                i16 = intValue3;
                pm0Var2 = pm0Var4;
            } else if (intValue3 == 3) {
                i16 = intValue3;
                pm0Var2 = pv0Var;
            } else if (intValue3 == 4) {
                i16 = intValue3;
                pm0Var2 = pm0Var3;
            } else if (intValue3 == 5) {
                i16 = intValue3;
            } else if (intValue3 == 15) {
                pm0Var2 = iv0Var;
                i16 = 8;
            } else {
                i16 = intValue3;
                pm0Var2 = null;
            }
            int size2 = qv0VarArr[i16].a.size();
            if (pm0Var2 != null) {
                i17 = pm0Var2.h();
                if (pm0Var2 instanceof mm0) {
                    ((mm0) pm0Var2).L();
                }
            } else {
                i17 = 0;
            }
            qv0VarArr[i16].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size3);
                    if (qv0VarArr[i16].a(messageObject2, i20, r13, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject2.getId(), r13);
                        qv0 qv0Var = qv0VarArr[i16];
                        int i21 = qv0Var.m - r13;
                        qv0Var.m = i21;
                        if (i21 < 0) {
                            qv0Var.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                qv0VarArr[i16].l = ((Boolean) objArr[5]).booleanValue();
                qv0 qv0Var2 = qv0VarArr[i16];
                if (qv0Var2.l) {
                    qv0Var2.m = 0;
                }
            } else {
                ?? r12 = 0;
                int i22 = 0;
                while (i22 < arrayList.size()) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i22);
                    if (qv0VarArr[i16].a(messageObject3, i20, r12, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject3.getId(), true);
                        qv0 qv0Var3 = qv0VarArr[i16];
                        int i23 = qv0Var3.n - 1;
                        qv0Var3.n = i23;
                        if (i23 < 0) {
                            qv0Var3.n = r12;
                        }
                    }
                    i22++;
                    r12 = 0;
                }
                qv0 qv0Var4 = qv0VarArr[i16];
                if (qv0Var4.o && qv0Var4.a.size() > 0) {
                    qv0 qv0Var5 = qv0VarArr[i16];
                    qv0Var5.k = ((MessageObject) qv0Var5.a.get(0)).getId();
                }
                qv0VarArr[i16].i[i20] = ((Boolean) objArr[5]).booleanValue();
                qv0 qv0Var6 = qv0VarArr[i16];
                if (qv0Var6.i[i20]) {
                    int size4 = qv0Var6.b[i20].size();
                    if (i20 == 0) {
                        size4 += qv0VarArr[i16].m;
                    }
                    qv0VarArr[i16].f[i20] = size4;
                }
            }
            if (!booleanValue && i20 == 0) {
                qv0 qv0Var7 = qv0VarArr[i16];
                if (qv0Var7.i[i20] && this.c1 != 0) {
                    qv0Var7.g = true;
                    n2Var.getMediaDataController().loadMedia(this.c1, 50, qv0VarArr[i16].j[1], 0, i16, this.F, 1, n2Var.getClassGuid(), qv0VarArr[i16].p, null, null);
                }
            }
            int i24 = i16;
            if (pm0Var2 != null) {
                tu0 tu0Var = null;
                for (int i25 = 0; i25 < uu0VarArr.length; i25++) {
                    uu0 uu0Var2 = uu0VarArr[i25];
                    if (uu0Var2 != null && (at0Var3 = uu0Var2.h) != null && at0Var3.getAdapter() == pm0Var2) {
                        tu0 tu0Var2 = uu0VarArr[i25].h;
                        tu0Var2.B0();
                        tu0Var = tu0Var2;
                    }
                }
                int h = pm0Var2.h();
                if (pm0Var2 != gu0Var) {
                    try {
                        pm0Var2.l();
                    } catch (Throwable unused) {
                    }
                } else if (gu0Var.h() == i17) {
                    AndroidUtilities.updateVisibleRows(tu0Var);
                } else {
                    gu0Var.l();
                }
                if (!qv0VarArr[i24].a.isEmpty() || qv0VarArr[i24].g) {
                    if (tu0Var != null && (pm0Var2 == gu0Var || h >= i17)) {
                        z(tu0Var, i17, sparseBooleanArray);
                    }
                } else if (tu0Var != null) {
                    z(tu0Var, i17, sparseBooleanArray);
                }
                if (tu0Var != null && !qv0VarArr[i24].o) {
                    if (size2 == 0) {
                        for (int i26 = 0; i26 < 2; i26++) {
                            if (uu0VarArr[i26].F == 0) {
                                ((s4.d0) tu0Var.getLayoutManager()).h1(gu0Var.L(0), 0);
                            }
                        }
                    } else {
                        X0();
                    }
                }
            }
            qv0 qv0Var8 = qv0VarArr[i24];
            if (qv0Var8.o) {
                if (qv0Var8.a.size() == 0) {
                    A0(i24);
                } else {
                    qv0VarArr[i24].o = false;
                }
            }
            this.b1 = true;
            return;
        }
        if (i10 == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat chat = DialogObject.isChatDialog(j3) ? n2Var.getMessagesController().getChat(Long.valueOf(-j3)) : null;
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
                        gu0 gu0Var2 = gu0Var;
                        int i28 = 0;
                        while (i28 < qv0VarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (qv0VarArr[i28].b(((Integer) arrayList2.get(i15)).intValue(), i14) != null) {
                                i27 = i28;
                                z12 = true;
                            }
                            i28++;
                            arrayList2 = arrayList3;
                        }
                        i15++;
                        gu0Var = gu0Var2;
                    }
                    gu0 gu0Var3 = gu0Var;
                    if (z12) {
                        this.b1 = true;
                        if (gu0Var3 != null) {
                            gu0Var3.l();
                        }
                        if (pm0Var5 != null) {
                            pm0Var5.l();
                        }
                        if (pm0Var4 != null) {
                            pm0Var4.l();
                        }
                        if (pv0Var != null) {
                            pv0Var.X(false);
                        }
                        if (pm0Var3 != null) {
                            pm0Var3.l();
                        }
                        if (iv0Var != null) {
                            iv0Var.l();
                        }
                        if (pm0Var2 != null) {
                            pm0Var2.l();
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
            gu0 gu0Var32 = gu0Var;
            if (z12) {
            }
            W(i272);
            return;
        }
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == j3) {
                ArrayList arrayList4 = (ArrayList) objArr[1];
                boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j3);
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
                        qv0 qv0Var9 = qv0VarArr[mediaType];
                        if (qv0Var9.l) {
                            z11 = z13;
                            if (qv0Var9.a(messageObject4, messageObject4.getDialogId() == j3 ? 0 : 1, true, isEncryptedDialog2)) {
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
                    while (i30 < uu0VarArr.length) {
                        int i31 = uu0VarArr[i30].F;
                        if (i31 == 0) {
                            pm0Var = gu0Var;
                        } else if (i31 == z15) {
                            pm0Var = pm0Var5;
                        } else if (i31 == 2) {
                            pm0Var = pm0Var4;
                        } else if (i31 == 3) {
                            pm0Var = pv0Var;
                        } else {
                            if (i31 == 4) {
                                pm0Var = pm0Var3;
                            } else if (i31 == 5) {
                                pm0Var = pm0Var2;
                            } else {
                                pm0Var = i31 == 15 ? iv0Var : null;
                                if (pm0Var != null) {
                                    pm0Var.h();
                                    gu0Var.l();
                                    pm0Var5.l();
                                    pm0Var4.l();
                                    pv0Var.X(false);
                                    pm0Var3.l();
                                    iv0Var.l();
                                    pm0Var2.l();
                                }
                                i30++;
                                z15 = true;
                            }
                            if (pm0Var != null) {
                            }
                            i30++;
                            z15 = true;
                        }
                        if (pm0Var != null) {
                        }
                        i30++;
                        z15 = true;
                    }
                    v1(z15);
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
            if (l4.longValue() == j3 || l4.longValue() == this.c1) {
                int i32 = l4.longValue() == j3 ? 0 : 1;
                for (qv0 qv0Var10 : qv0VarArr) {
                    qv0Var10.f(i32, num.intValue(), num2.intValue());
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
                for (int i33 = 0; i33 < uu0VarArr.length; i33++) {
                    int childCount = uu0VarArr[i33].h.getChildCount();
                    for (int i34 = 0; i34 < childCount; i34++) {
                        View childAt = uu0VarArr[i33].h.getChildAt(i34);
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                            if (j7Var.getMessage() != null) {
                                j7Var.g(false, true);
                            }
                        }
                    }
                }
                return;
            }
            for (int i35 = 0; i35 < uu0VarArr.length; i35++) {
                uu0 uu0Var3 = uu0VarArr[i35];
                if (uu0Var3 != null && (at0Var = uu0Var3.h) != null) {
                    int childCount2 = at0Var.getChildCount();
                    for (int i36 = 0; i36 < childCount2; i36++) {
                        View childAt2 = uu0VarArr[i35].h.getChildAt(i36);
                        if (childAt2 instanceof org.telegram.ui.Cells.j7) {
                            org.telegram.ui.Cells.j7 j7Var2 = (org.telegram.ui.Cells.j7) childAt2;
                            if (j7Var2.getMessage() != null) {
                                j7Var2.g(false, true);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.storiesListUpdated) {
            ai.e9 e9Var = (ai.e9) objArr[0];
            ju0 ju0Var = this.c0;
            if (ju0Var == null || e9Var != ju0Var.s) {
                ps0 ps0Var = this.e0;
                if (ps0Var == null || e9Var != ps0Var.s) {
                    Iterator it = this.Y1.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        aw0 aw0Var = (aw0) it.next();
                        if (aw0Var.c.s == e9Var) {
                            i12 = aw0Var.a;
                            break;
                        }
                    }
                } else {
                    i12 = 9;
                }
            } else {
                i12 = 8;
            }
            uu0 W = W(i12);
            if (W != null) {
                if (W.b != (e9Var.g() > 0)) {
                    W.b = e9Var.g() > 0;
                    o1(W, true);
                }
            }
            if (W != null) {
                AndroidUtilities.notifyDataSetChanged(W.h);
                if (W.h.getLayoutManager() instanceof s4.d0) {
                    qm0 qm0Var = W.h;
                    G(W, qm0Var, (s4.d0) qm0Var.getLayoutManager());
                }
            }
            nu0 nu0Var = this.D1;
            if (nu0Var != null) {
                nu0Var.R();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated) {
            for (uu0 uu0Var4 : uu0VarArr) {
                if (uu0Var4 != null && uu0Var4.h != null && p0(uu0Var4.F)) {
                    if (!r0() || uu0Var4.h.getAdapter() == null) {
                        for (int i37 = 0; i37 < uu0Var4.h.getChildCount(); i37++) {
                            View childAt3 = uu0Var4.h.getChildAt(i37);
                            if (childAt3 instanceof org.telegram.ui.Cells.t7) {
                                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt3;
                                q6 q6Var = t7Var.N;
                                if (!t7Var.d0 || (messageObject = t7Var.n) == null || (storyItem = messageObject.storyItem) == null || (storyViews = storyItem.views) == null) {
                                    t7Var.L = false;
                                    q6Var.t("", false, true);
                                } else {
                                    int i38 = storyViews.views_count;
                                    t7Var.L = i38 > 0;
                                    q6Var.t(AndroidUtilities.formatWholeNumber(i38, 0), true, true);
                                }
                            }
                        }
                    } else {
                        AndroidUtilities.notifyDataSetChanged(uu0Var4.h);
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.channelRecommendationsLoaded) {
            if (((Long) objArr[0]).longValue() == j3) {
                this.Q.E(true);
                v1(true);
                F();
                return;
            }
            return;
        }
        int i39 = NotificationCenter.savedMessagesDialogsUpdate;
        lv0 lv0Var = this.R;
        if (i10 == i39) {
            if (j3 == 0 || j3 == n2Var.getUserConfig().getClientUserId()) {
                lv0Var.F(true);
                v1(true);
                F();
                L0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogsNeedReload) {
            lv0Var.F(true);
            return;
        }
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() == j3) {
                v1(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updatedChatRanks) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[1]).longValue();
            if (j3 != (-longValue3)) {
                return;
            }
            String str = (String) objArr[2];
            lu0 lu0Var = this.a0;
            if (lu0Var != null) {
                TLRPC.ChatFull chatFull = lu0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i40 = 0; i40 < lu0Var.d.participants.participants.size(); i40++) {
                        lu0Var.d.participants.participants.get(i40).setRank(longValue4, str);
                    }
                }
                for (uu0 uu0Var5 : uu0VarArr) {
                    if (uu0Var5.F == 7) {
                        AndroidUtilities.updateVisibleRows(uu0Var5.h);
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
            for (int i41 = 0; i41 < uu0VarArr.length; i41++) {
                if (uu0VarArr[i41].h.getAdapter() == iv0Var) {
                    at0 at0Var4 = uu0VarArr[i41].h;
                    ArrayList arrayList6 = iv0Var.n;
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
                                iv0Var.m(i42);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        rt0 rt0Var = this.I0;
        if (rt0Var != null) {
            canvas.save();
            canvas.translate(rt0Var.getX(), rt0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        nt0 nt0Var = this.R0;
        if (nt0Var != null) {
            int i10 = nt0Var.U;
            if ((i10 == 3 || i10 == 1) && this.P0 == null) {
                canvas.save();
                canvas.translate(nt0Var.getX(), nt0Var.getY());
                nt0Var.setDrawOverlay(true);
                nt0Var.draw(canvas);
                nt0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i10;
        if (view != this.R0 || this.P0 != null) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        uu0[] uu0VarArr = this.k0;
        float top = uu0VarArr[0].getTop();
        ws0 ws0Var = this.W;
        if (ws0Var != null && ((i10 = uu0VarArr[0].F) == 8 || w0(i10))) {
            top -= ws0Var.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r1 = r2[r1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1(boolean z10) {
        uu0[] uu0VarArr;
        uu0 uu0Var;
        if (this.o1) {
            return;
        }
        int i10 = 0;
        while (true) {
            uu0VarArr = this.k0;
            if (i10 >= uu0VarArr.length) {
                uu0Var = null;
                break;
            }
            int i11 = uu0VarArr[i10].F;
            if (i11 == 0 || p0(i11)) {
                break;
            } else {
                i10++;
            }
        }
        if (uu0Var != null) {
            int i12 = uu0Var.F;
            this.p1 = i12;
            boolean p02 = p0(i12);
            int[] iArr = this.m1;
            int X = X(p02 ? 1 : 0, iArr[p02 ? 1 : 0], z10);
            this.q1 = X;
            if (X != iArr[p02 ? 1 : 0]) {
                if (this.k1 && p0(this.p1)) {
                    return;
                }
                uu0Var.r.setVisibility(0);
                if (p0(this.p1)) {
                    uu0Var.r.setAdapter(l1(this.p1));
                } else {
                    uu0Var.r.setAdapter(this.I);
                }
                tu0 tu0Var = uu0Var.r;
                tu0Var.setPadding(tu0Var.getPaddingLeft(), Z(this.p1), uu0Var.r.getPaddingRight(), Y(v0()));
                uu0Var.s.y1(X);
                uu0Var.r.a0();
                uu0Var.s.O = new pt0(this, uu0Var, 0);
                AndroidUtilities.updateVisibleRows(uu0Var.h);
                this.o1 = true;
                if (this.p1 == 0) {
                    this.t1[0].g(true);
                }
                this.n1 = 0.0f;
                if (this.s < 0) {
                    X0();
                    return;
                }
                for (uu0 uu0Var2 : uu0VarArr) {
                    if (uu0Var2.F == this.p1) {
                        uu0Var2.s.h1(this.s, this.v - uu0Var2.r.getPaddingTop());
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Cells.o2
    public final void f(org.telegram.ui.Cells.s2 s2Var) {
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        if (n2Var != null && n2Var.getMessagesController().getStoriesController().I(s2Var.getDialogId())) {
            n2Var.getOrCreateStoryViewer().getClass();
            ai.kc orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
            Context context = n2Var.getContext();
            long dialogId = s2Var.getDialogId();
            ai.v9 a2 = ai.v9.a((qm0) s2Var.getParent());
            a2.s += ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).s1) ? AndroidUtilities.dp(68.0f) : 0;
            orCreateStoryViewer.D(context, dialogId, a2);
        }
    }

    public final float f0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            uu0[] uu0VarArr = this.k0;
            if (i11 >= uu0VarArr.length) {
                break;
            }
            uu0 uu0Var = uu0VarArr[i11];
            if (uu0Var != null) {
                int i13 = uu0Var.F;
                if ((z10 && i10 == 8 && w0(i13)) || i13 == i10) {
                    i12++;
                    width = uu0VarArr[i11].getTranslationX();
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
            uu0[] uu0VarArr = this.k0;
            if (i10 >= uu0VarArr.length) {
                return;
            }
            int childCount = uu0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = uu0VarArr[i10].h.getChildAt(i11);
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

    public final float g0(int i10, boolean z10) {
        float f7 = 0.0f;
        int i11 = 0;
        while (true) {
            uu0[] uu0VarArr = this.k0;
            if (i11 >= uu0VarArr.length) {
                return f7;
            }
            uu0 uu0Var = uu0VarArr[i11];
            if (uu0Var != null) {
                int i12 = uu0Var.F;
                if ((z10 && i10 == 8 && w0(i12)) || i12 == i10) {
                    f7 = (1.0f - Math.abs(uu0VarArr[i11].getTranslationX() / getWidth())) + f7;
                }
            }
            i11++;
        }
    }

    public final void g1(MotionEvent motionEvent) {
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
                U0(motionEvent, f7 < 0.0f);
            }
        }
        if (this.x1) {
            uu0[] uu0VarArr = this.k0;
            float x10 = uu0VarArr[0].getX();
            this.f1 = new AnimatorSet();
            this.i1 = Math.abs(x10) < ((float) uu0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new j80(this, 20));
            boolean z10 = this.i1;
            Property property = View.TRANSLATION_X;
            if (z10) {
                measuredWidth = Math.abs(x10);
                if (this.h1) {
                    this.f1.playTogether(ObjectAnimator.ofFloat(uu0VarArr[0], (Property<uu0, Float>) property, 0.0f), ObjectAnimator.ofFloat(uu0VarArr[1], (Property<uu0, Float>) property, r14.getMeasuredWidth()), ofFloat);
                } else {
                    this.f1.playTogether(ObjectAnimator.ofFloat(uu0VarArr[0], (Property<uu0, Float>) property, 0.0f), ObjectAnimator.ofFloat(uu0VarArr[1], (Property<uu0, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = uu0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.h1) {
                    this.f1.playTogether(ObjectAnimator.ofFloat(uu0VarArr[0], (Property<uu0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(uu0VarArr[1], (Property<uu0, Float>) property, 0.0f), ofFloat);
                } else {
                    this.f1.playTogether(ObjectAnimator.ofFloat(uu0VarArr[0], (Property<uu0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(uu0VarArr[1], (Property<uu0, Float>) property, 0.0f), ofFloat);
                }
            }
            this.f1.setInterpolator(e2);
            int measuredWidth2 = getMeasuredWidth();
            float f11 = measuredWidth2 / 2;
            float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
            this.f1.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r0) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.f1.addListener(new ut0(this, i10));
            this.f1.start();
            this.g1 = true;
            this.x1 = false;
            L0();
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

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.Z0[0];
    }

    public float getBottomButtonStoriesVisibility() {
        uu0 uu0Var;
        uu0 uu0Var2;
        ai.e9 e9Var;
        ai.e9 e9Var2;
        float f7 = 1.0f;
        uu0[] uu0VarArr = this.k0;
        if (uu0VarArr == null || (uu0Var = uu0VarArr[0]) == null || (uu0Var2 = uu0VarArr[1]) == null || uu0Var.w == null || uu0Var2.w == null) {
            return 1.0f;
        }
        int i10 = uu0Var.F;
        int i11 = uu0Var2.F;
        boolean z10 = w0(i10) || i10 == 8;
        boolean z11 = w0(i11) || i11 == 8;
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - uu0VarArr[0].w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - uu0VarArr[1].w.getVisibilityFactor();
        yv0 k12 = k1(uu0VarArr[0].F);
        if (i10 == 8 || (k12 != null && (e9Var2 = k12.s) != null && e9Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        yv0 k13 = k1(i11);
        if (i11 != 8 && (k13 == null || (e9Var = k13.s) == null || e9Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f7, Math.abs(uu0VarArr[0].getTranslationX() / uu0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        uu0[] uu0VarArr = this.k0;
        uu0 uu0Var = uu0VarArr[1];
        if (uu0Var != null && uu0Var.getVisibility() == 0) {
            if (this.g1 && !this.i1) {
                return uu0VarArr[1].F;
            }
            if (Math.abs(uu0VarArr[1].getTranslationX()) < uu0VarArr[1].getMeasuredWidth() / 2.0f) {
                return uu0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public qm0 getCurrentListView() {
        hu0 hu0Var;
        uu0 uu0Var = this.k0[0];
        int i10 = uu0Var.F;
        return i10 == 13 ? this.U.getCurrentListView() : i10 == 14 ? this.V.getCurrentListView() : (i10 != 12 || (hu0Var = this.T) == null) ? uu0Var.h : hu0Var.a.x0;
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

    public org.telegram.ui.ActionBar.v0 getSearchItem() {
        return this.n0;
    }

    public fk0 getSearchOptionsItem() {
        return this.s0;
    }

    public int getSelectedTab() {
        int currentTabId = this.I0.getCurrentTabId();
        ws0 ws0Var = this.W;
        if (ws0Var == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = ws0Var.getCurrentAlbumId();
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
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.k0;
            if (i10 >= uu0VarArr.length) {
                return f7;
            }
            uu0 uu0Var = uu0VarArr[i10];
            if (uu0Var != null) {
                f7 = ((1.0f - Math.abs(uu0Var.getTranslationX() / getWidth())) * uu0Var.F) + f7;
            }
            i10++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.k6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.k6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.A0, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.z6));
        org.telegram.ui.ActionBar.v0 v0Var = this.l0;
        fk0 iconView = v0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.i6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.i6.z8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.u0;
        if (v0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.t0;
        if (v0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.D0};
        ImageView imageView = this.C0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.B0, 1, null, null, null, null, i12));
        rt0 rt0Var = this.I0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(rt0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.i6.wc;
        org.telegram.ui.Cells.w0 w0Var = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.kd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(rt0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(rt0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(rt0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(rt0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.Hh));
        nt0 nt0Var = this.R0;
        if (nt0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(nt0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.v7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(nt0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.w7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(nt0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.u7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(nt0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.t7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(nt0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.x7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(nt0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.y7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(nt0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.A7));
        }
        final int i14 = 0;
        while (true) {
            uu0[] uu0VarArr = this.k0;
            if (i14 >= uu0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.j6 j6Var = new org.telegram.ui.ActionBar.j6() { // from class: org.telegram.ui.Components.ls0
                @Override // org.telegram.ui.ActionBar.j6
                public final void b() {
                    uu0[] uu0VarArr2 = bw0.this.k0;
                    int i15 = i14;
                    at0 at0Var = uu0VarArr2[i15].h;
                    if (at0Var != null) {
                        int childCount = at0Var.getChildCount();
                        for (int i16 = 0; i16 < childCount; i16++) {
                            View childAt = uu0VarArr2[i15].h.getChildAt(i16);
                            if (childAt instanceof org.telegram.ui.Cells.u7) {
                                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                                for (int i17 = 0; i17 < 6; i17++) {
                                    u7Var.a[i17].e.invalidate();
                                }
                            } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                                ((org.telegram.ui.Cells.i6) childAt).v(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.xa) {
                                ((org.telegram.ui.Cells.xa) childAt).j(0);
                            }
                        }
                    }
                }

                @Override // org.telegram.ui.ActionBar.j6
                public final /* synthetic */ void a(float f7) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.k0, null, null, org.telegram.ui.ActionBar.i6.d7));
            jt0 jt0Var = uu0VarArr[i14].v;
            int i15 = org.telegram.ui.ActionBar.i6.d6;
            arrayList.add(new org.telegram.ui.ActionBar.k6(jt0Var, 0, null, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.s8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].w, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.c7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.i6.e7));
            int i16 = org.telegram.ui.ActionBar.i6.h6;
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.uh));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.m6));
            int i17 = org.telegram.ui.ActionBar.i6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            int i18 = org.telegram.ui.ActionBar.i6.y6;
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"statusColor"}, null, null, -1, j6Var, i18));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"statusOnlineColor"}, null, null, -1, j6Var, org.telegram.ui.ActionBar.i6.n6));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.i6.r0;
            int i19 = org.telegram.ui.ActionBar.i6.J7;
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.xa.class}, null, drawableArr2, null, i19));
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.i6.B0;
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.i6.D0}, null, -1, null, org.telegram.ui.ActionBar.i6.X8));
            TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.i6.C0;
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.i6.E0}, null, -1, null, org.telegram.ui.ActionBar.i6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, drawableArr2, null, i19));
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, org.telegram.ui.ActionBar.i6.U7));
            int i20 = org.telegram.ui.ActionBar.i6.z6;
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 4, new Class[]{ou0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.A6));
            int i21 = org.telegram.ui.ActionBar.i6.Ih;
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
            int i22 = org.telegram.ui.ActionBar.i6.i7;
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            int i23 = org.telegram.ui.ActionBar.i6.k7;
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.zi));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Bi));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.i6.f3, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.i6.g3, null, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, null, null, null, org.telegram.ui.ActionBar.i6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, org.telegram.ui.ActionBar.i6.m0, null, null, org.telegram.ui.ActionBar.i6.K6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Kh));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Jh));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.o7.class}, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            int i24 = org.telegram.ui.ActionBar.i6.Lh;
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.u7.class}, null, null, j6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.u7.class}, null, null, j6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, j6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, j6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].h, 0, null, null, new Drawable[]{this.y0}, null, org.telegram.ui.ActionBar.i6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].w.d, 4, null, null, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.k6(uu0VarArr[i14].w.e, 4, null, null, null, null, i18));
            i14++;
        }
    }

    public final int h0(int i10) {
        org.telegram.ui.ActionBar.e6 e6Var = this.F1;
        return e6Var != null ? e6Var.x0(i10) : org.telegram.ui.ActionBar.i6.x0(null, i10, false);
    }

    public final int h1(int i10) {
        aw0 j12 = j1(i10);
        if (j12 == null) {
            return -1;
        }
        return j12.b;
    }

    public final boolean i0() {
        return this.v1.getConnectionsManager().getConnectionState() == 3;
    }

    public final aw0 i1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.Y1;
        aw0 aw0Var = (aw0) hashMap.get(valueOf);
        if (aw0Var != null) {
            return aw0Var;
        }
        aw0 aw0Var2 = new aw0(this, getContext(), i10);
        hashMap.put(Integer.valueOf(i10), aw0Var2);
        this.Z1.put(Integer.valueOf(aw0Var2.a), Integer.valueOf(i10));
        return aw0Var2;
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

    public final aw0 j1(int i10) {
        Integer num = (Integer) this.Z1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (aw0) this.Y1.get(num);
    }

    public final void k0() {
        AndroidUtilities.cancelRunOnUIThread(this.M0);
        org.telegram.ui.Cells.w0 w0Var = this.K0;
        if (w0Var.getTag() == null) {
            return;
        }
        w0Var.setTag(null);
        AnimatorSet animatorSet = this.L0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.L0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.L0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.L0.playTogether(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.Cells.w0, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.Cells.w0, Float>) View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.O0));
        this.L0.setInterpolator(hs.g);
        this.L0.addListener(new ut0(this, 0));
        this.L0.start();
    }

    public final yv0 k1(int i10) {
        aw0 j12;
        if (i10 == 8) {
            return this.c0;
        }
        if (i10 == 9) {
            return this.e0;
        }
        if (!w0(i10) || (j12 = j1(i10)) == null) {
            return null;
        }
        return j12.c;
    }

    public boolean l0() {
        return false;
    }

    public final yv0 l1(int i10) {
        aw0 j12;
        if (i10 == 8) {
            return this.d0;
        }
        if (i10 == 9) {
            return this.f0;
        }
        if (!w0(i10) || (j12 = j1(i10)) == null) {
            return null;
        }
        return j12.d;
    }

    public boolean m0() {
        return !(this instanceof p40);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [org.telegram.ui.Components.qm0, org.telegram.ui.Components.tu0, s4.n0] */
    /* JADX WARN: Type inference failed for: r5v85 */
    public final void m1(boolean z10) {
        uu0[] uu0VarArr;
        uu0[] uu0VarArr2;
        s4.v0 v0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        qv0[] qv0VarArr;
        String str;
        ?? r52;
        int i10;
        int i11;
        boolean z15;
        int i12;
        boolean z16;
        boolean z17;
        s4.v0 v0Var2;
        int i13;
        int i14;
        boolean z18;
        rs0 rs0Var = this.V;
        if (rs0Var != null) {
            rs0Var.i();
        }
        int i15 = 0;
        while (true) {
            uu0VarArr = this.k0;
            if (i15 >= uu0VarArr.length) {
                break;
            }
            uu0VarArr[i15].h.B0();
            i15++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) uu0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(B0());
        s4.i0 adapter = uu0VarArr[z10 ? 1 : 0].h.getAdapter();
        s4.i0 i0Var = this.c0;
        s4.z zVar = this.b0;
        if (adapter == i0Var) {
            zVar.e(null);
        }
        boolean z19 = this.V0;
        nu0 nu0Var = this.D1;
        iv0 iv0Var = this.N;
        org.telegram.ui.ActionBar.v0 v0Var3 = this.n0;
        int i16 = 100;
        if (z19 && this.U0) {
            uu0 uu0Var = uu0VarArr[z10 ? 1 : 0];
            if (uu0Var.f == null) {
                uu0Var.f = new s4.v0();
            }
            uu0 uu0Var2 = uu0VarArr[z10 ? 1 : 0];
            v0Var2 = uu0Var2.f;
            mv0 mv0Var = this.S;
            su0 su0Var = this.j0;
            xu0 xu0Var = this.h0;
            xu0 xu0Var2 = this.i0;
            xu0 xu0Var3 = this.g0;
            if (z10) {
                int i17 = uu0Var2.F;
                if (i17 == 0 || i17 == 2 || i17 == 5 || i17 == 6 || (i17 == 7 && !nu0Var.T())) {
                    this.V0 = false;
                    ot0 ot0Var = this.J0;
                    if (ot0Var != null) {
                        ot0Var.g(false);
                    }
                    this.U0 = false;
                    m1(true);
                    return;
                }
                String obj = v0Var3 != null ? v0Var3.getSearchField().getText().toString() : "";
                int i18 = uu0VarArr[z10 ? 1 : 0].F;
                if (i18 == 1) {
                    if (xu0Var3 != null) {
                        xu0Var3.G(obj, false);
                        if (adapter != xu0Var3) {
                            W0(adapter);
                            uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var3);
                        }
                    }
                } else if (i18 == 3) {
                    if (xu0Var2 != null) {
                        xu0Var2.G(obj, false);
                        if (adapter != xu0Var2) {
                            W0(adapter);
                            uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var2);
                        }
                    }
                } else if (i18 == 4) {
                    if (xu0Var != null) {
                        xu0Var.G(obj, false);
                        if (adapter != xu0Var) {
                            W0(adapter);
                            uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var);
                        }
                    }
                } else if (i18 == 7) {
                    if (su0Var != null) {
                        su0Var.F(obj, false);
                        if (adapter != su0Var) {
                            W0(adapter);
                            uu0VarArr[z10 ? 1 : 0].h.setAdapter(su0Var);
                        }
                    }
                } else if (i18 == 11) {
                    if (mv0Var != null) {
                        mv0Var.E(this.W0, obj);
                        if (adapter != mv0Var) {
                            W0(adapter);
                            uu0VarArr[z10 ? 1 : 0].h.setAdapter(mv0Var);
                        }
                    }
                } else if (i18 == 15 && iv0Var != null && adapter != iv0Var) {
                    W0(adapter);
                    at0 at0Var = uu0VarArr[z10 ? 1 : 0].h;
                    iv0Var.r = at0Var;
                    at0Var.setAdapter(iv0Var);
                }
            } else if (uu0Var2.h != null) {
                int i19 = uu0Var2.F;
                if (i19 == 1) {
                    if (adapter != xu0Var3) {
                        W0(adapter);
                        uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var3);
                    }
                    xu0Var3.l();
                } else if (i19 == 3) {
                    if (adapter != xu0Var2) {
                        W0(adapter);
                        uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var2);
                    }
                    xu0Var2.l();
                } else if (i19 == 4) {
                    if (adapter != xu0Var) {
                        W0(adapter);
                        uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var);
                    }
                    xu0Var.l();
                } else if (i19 == 7) {
                    if (adapter != su0Var) {
                        W0(adapter);
                        uu0VarArr[z10 ? 1 : 0].h.setAdapter(su0Var);
                    }
                    su0Var.l();
                } else if (i19 == 11) {
                    if (adapter != mv0Var) {
                        W0(adapter);
                        uu0VarArr[z10 ? 1 : 0].h.setAdapter(mv0Var);
                    }
                    mv0Var.l();
                }
            }
            uu0VarArr2 = uu0VarArr;
            z17 = false;
            z16 = false;
            i10 = 4;
            i12 = 8;
        } else {
            uu0 uu0Var3 = uu0VarArr[z10 ? 1 : 0];
            if (uu0Var3.e == null) {
                uu0Var3.e = new s4.v0();
            }
            uu0 uu0Var4 = uu0VarArr[z10 ? 1 : 0];
            s4.v0 v0Var4 = uu0Var4.e;
            uu0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i20 = uu0VarArr[z10 ? 1 : 0].F;
            if (i20 == 8 || w0(i20)) {
                layoutParams.topMargin = AndroidUtilities.dp(B0());
            }
            at0 at0Var2 = uu0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = at0Var2.getPaddingLeft();
            uu0 uu0Var5 = uu0VarArr[z10 ? 1 : 0];
            at0 at0Var3 = uu0Var5.h;
            int Z = Z(uu0Var5.F);
            at0Var3.b3 = Z;
            int paddingRight = uu0VarArr[z10 ? 1 : 0].h.getPaddingRight();
            uu0VarArr2 = uu0VarArr;
            at0 at0Var4 = uu0VarArr2[z10 ? 1 : 0].h;
            int Y = Y(v0());
            at0Var4.c3 = Y;
            at0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
            int i21 = uu0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.m1;
            s4.i0 i0Var2 = this.K;
            View view = this.U;
            hu0 hu0Var = this.T;
            lv0 lv0Var = this.R;
            mu0 mu0Var = this.P;
            qv0[] qv0VarArr2 = this.t1;
            if (i21 == 0) {
                s4.i0 i0Var3 = this.H;
                if (adapter != i0Var3) {
                    W0(adapter);
                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var3);
                }
                int i22 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i22;
                layoutParams.leftMargin = i22;
                qv0 qv0Var = qv0VarArr2[0];
                boolean z20 = qv0Var.h && !qv0Var.e.isEmpty();
                i16 = iArr[0];
                uu0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.y0);
                qv0 qv0Var2 = qv0VarArr2[0];
                if (qv0Var2.x == null) {
                    qv0Var2.x = new s4.v0();
                }
                z13 = z20;
                v0Var = qv0VarArr2[0].x;
                z11 = false;
            } else {
                if (i21 == 1) {
                    qv0 qv0Var3 = qv0VarArr2[1];
                    z12 = qv0Var3.h && !qv0Var3.e.isEmpty();
                    if (adapter != i0Var2) {
                        W0(adapter);
                        uu0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var2);
                    }
                } else if (i21 == 2) {
                    qv0 qv0Var4 = qv0VarArr2[2];
                    z12 = qv0Var4.h && !qv0Var4.e.isEmpty();
                    if (adapter != this.L) {
                        W0(adapter);
                        uu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.L);
                    }
                } else {
                    if (i21 == 3) {
                        if (adapter != this.J) {
                            W0(adapter);
                            uu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.J);
                        }
                    } else if (i21 == 4) {
                        qv0 qv0Var5 = qv0VarArr2[4];
                        z12 = qv0Var5.h && !qv0Var5.e.isEmpty();
                        if (adapter != this.M) {
                            W0(adapter);
                            uu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.M);
                        }
                    } else {
                        if (i21 == 5) {
                            if (adapter != this.O) {
                                W0(adapter);
                                uu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.O);
                            }
                        } else if (i21 == 15) {
                            if (adapter != iv0Var) {
                                W0(adapter);
                                at0 at0Var5 = uu0VarArr2[z10 ? 1 : 0].h;
                                iv0Var.r = at0Var5;
                                at0Var5.setAdapter(iv0Var);
                            }
                        } else if (i21 == 6) {
                            if (adapter != mu0Var) {
                                W0(adapter);
                                uu0VarArr2[z10 ? 1 : 0].h.setAdapter(mu0Var);
                            }
                        } else if (i21 == 7) {
                            if (adapter != this.a0) {
                                W0(adapter);
                                uu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.a0);
                            }
                        } else if (p0(i21)) {
                            s4.i0 k12 = k1(uu0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != k12) {
                                W0(adapter);
                                uu0VarArr2[z10 ? 1 : 0].h.setAdapter(k12);
                                uu0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            uu0 uu0Var6 = uu0VarArr2[z10 ? 1 : 0];
                            if (uu0Var6.F != 9) {
                                zVar.e(uu0Var6.h);
                            }
                            i16 = iArr[1];
                        } else {
                            int i23 = uu0VarArr2[z10 ? 1 : 0].F;
                            if (i23 == 10) {
                                if (adapter != this.Q) {
                                    W0(adapter);
                                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.Q);
                                }
                            } else if (i23 == 11) {
                                if (adapter != lv0Var) {
                                    W0(adapter);
                                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(lv0Var);
                                    s4.z zVar2 = lv0Var.v;
                                    at0 at0Var6 = uu0VarArr2[z10 ? 1 : 0].h;
                                    lv0Var.s = at0Var6;
                                    zVar2.e(at0Var6);
                                }
                                v0Var = lv0Var.r;
                                z11 = true;
                                z13 = false;
                            } else if (i23 == 12) {
                                if (adapter != null) {
                                    W0(adapter);
                                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (hu0Var.getParent() != uu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(hu0Var);
                                    uu0VarArr2[z10 ? 1 : 0].addView(hu0Var, w7.x5.a(-1.0f, 0.0f, 56.0f, 0.0f, 0.0f, -1, 119));
                                }
                            } else if (i23 == 13) {
                                if (adapter != null) {
                                    W0(adapter);
                                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != uu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    uu0VarArr2[z10 ? 1 : 0].addView(view);
                                }
                            } else if (i23 == 14) {
                                if (adapter != null) {
                                    W0(adapter);
                                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (rs0Var != null && rs0Var.getParent() != uu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(rs0Var);
                                    uu0VarArr2[z10 ? 1 : 0].addView(rs0Var);
                                    uu0VarArr2[z10 ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        v0Var = v0Var4;
                        z11 = false;
                        z13 = false;
                    }
                    v0Var = v0Var4;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                v0Var = v0Var4;
                z11 = true;
            }
            int i24 = uu0VarArr2[z10 ? 1 : 0].F;
            boolean z21 = i24 == 0 || p0(i24);
            s4.v0 v0Var5 = v0Var;
            uu0VarArr2[z10 ? 1 : 0].v.setLayoutParams(w7.x5.a(-1.0f, z21 ? 0.0f : 12.0f, (z21 ? 8 : 12) + 48, z21 ? 0.0f : 12.0f, z21 ? 0.0f : 12.0f, -1, 119));
            if (z11) {
                uu0VarArr2[z10 ? 1 : 0].h.setSections(false);
            } else {
                at0 at0Var7 = uu0VarArr2[z10 ? 1 : 0].h;
                at0Var7.getClass();
                at0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, at0Var7.n2));
                at0Var7.G2 = null;
                at0Var7.J2 = 0.0f;
                at0Var7.K2 = null;
                at0Var7.L2 = null;
                at0Var7.H2 = null;
                cm0 cm0Var = at0Var7.F2;
                if (cm0Var != null) {
                    at0Var7.p0(cm0Var);
                    at0Var7.F2 = null;
                }
            }
            uu0 uu0Var7 = uu0VarArr2[z10 ? 1 : 0];
            int i25 = uu0Var7.F;
            org.telegram.ui.ActionBar.n2 n2Var = this.v1;
            if (i25 == 15) {
                z14 = z13;
                qv0VarArr = qv0VarArr2;
                str = "";
                uu0Var7.setBackground(ci.b7.e(uu0Var7.getBackground(), n2Var.getCurrentAccount(), this.j1, org.telegram.ui.ActionBar.i6.I.q()));
                uu0VarArr2[z10 ? 1 : 0].setOutlineProvider(new ai.l2(16));
                uu0VarArr2[z10 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z14 = z13;
                qv0VarArr = qv0VarArr2;
                str = "";
                uu0Var7.setClipToOutline(false);
                r52 = 0;
                uu0VarArr2[z10 ? 1 : 0].setBackground(null);
            }
            uu0 uu0Var8 = uu0VarArr2[z10 ? 1 : 0];
            if (uu0Var8.F == 11) {
                uu0Var8.h.setItemAnimator(uu0Var8.d);
            } else {
                uu0Var8.h.setItemAnimator(r52);
                if (lv0Var != null && uu0VarArr2[z10 ? 1 : 0].h == lv0Var.s) {
                    s4.z zVar3 = lv0Var.v;
                    lv0Var.s = r52;
                    zVar3.e(r52);
                }
            }
            if (hu0Var != null && uu0VarArr2[z10 ? 1 : 0].F != 12 && hu0Var.getParent() == uu0VarArr2[z10 ? 1 : 0]) {
                hu0Var.a.onRemoveFromParent();
                uu0VarArr2[z10 ? 1 : 0].removeView(hu0Var);
            }
            if (view != null && uu0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                uu0 uu0Var9 = uu0VarArr2[z10 ? 1 : 0];
                if (parent == uu0Var9) {
                    uu0Var9.removeView(view);
                }
            }
            if (rs0Var != null && uu0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = rs0Var.getParent();
                uu0 uu0Var10 = uu0VarArr2[z10 ? 1 : 0];
                if (parent2 == uu0Var10) {
                    uu0Var10.removeView(rs0Var);
                }
            }
            int i26 = uu0VarArr2[z10 ? 1 : 0].F;
            if (i26 == 0 || i26 == 11 || p0(i26) || (i13 = uu0VarArr2[z10 ? 1 : 0].F) == 2 || i13 == 5 || i13 == 6 || ((i13 == 7 && !nu0Var.T()) || (i14 = uu0VarArr2[z10 ? 1 : 0].F) == 10 || i14 == 13 || i14 == 14)) {
                i10 = 4;
                if (z10) {
                    this.x0 = 2;
                } else {
                    this.x0 = 0;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility((v0() || this.V0) ? 8 : 4);
                    }
                }
            } else {
                if (!z10) {
                    z18 = false;
                    if (v0Var3 != null) {
                        i10 = 4;
                        if (v0Var3.getVisibility() == 4) {
                            if (D()) {
                                this.x0 = 0;
                                this.o0 = 1.0f;
                                v0Var3.setVisibility(0);
                            } else {
                                v0Var3.setVisibility(v0() ? 8 : 4);
                                this.o0 = 0.0f;
                            }
                        }
                        q1(z18);
                    }
                } else if (v0Var3 == null || v0Var3.getVisibility() != 4 || this.G.n0) {
                    z18 = false;
                    this.x0 = 0;
                    this.o0 = 1.0f;
                } else {
                    if (D()) {
                        this.x0 = 1;
                        v0Var3.setVisibility(0);
                    } else {
                        v0Var3.setVisibility(v0() ? 8 : 4);
                    }
                    float f7 = z10 ? 1.0f : 0.0f;
                    this.o0 = b0(f7);
                    s1(1.0f - f7);
                    z18 = false;
                }
                i10 = 4;
                q1(z18);
            }
            int i27 = uu0VarArr2[z10 ? 1 : 0].F;
            if (i27 == 6) {
                if (!mu0Var.e && !mu0Var.h && mu0Var.d.isEmpty()) {
                    mu0.E(mu0Var, 0L);
                }
            } else if (i27 != 7) {
                if (p0(i27)) {
                    yv0 k13 = k1(uu0VarArr2[z10 ? 1 : 0].F);
                    if (k13 != null) {
                        ai.e9 e9Var = k13.s;
                        k13.P();
                        uu0VarArr2[z10 ? 1 : 0].w.e(e9Var != null && (e9Var.k() || (i0() && e9Var.g() > 0)), z10);
                        z15 = (e9Var == null || e9Var.g() <= 0 || t0()) ? false : true;
                    } else {
                        z15 = z14;
                    }
                    z14 = z15;
                } else {
                    int i28 = uu0VarArr2[z10 ? 1 : 0].F;
                    if (i28 != 10 && i28 != 11 && i28 != 12 && i28 != 13 && i28 != 14) {
                        if (i28 == 15) {
                            i28 = 8;
                        }
                        qv0 qv0Var6 = qv0VarArr[i28];
                        if (!qv0Var6.g && !qv0Var6.i[0] && qv0Var6.a.isEmpty()) {
                            qv0VarArr[i28].g = true;
                            i0Var2.l();
                            if (i28 == 0) {
                                int i29 = qv0VarArr[0].q;
                                if (i29 == 1) {
                                    i11 = 6;
                                } else if (i29 == 2) {
                                    i11 = 7;
                                }
                                n2Var.getMediaDataController().loadMedia(this.j1, 50, 0, 0, i11, this.F, 1, n2Var.getClassGuid(), qv0VarArr[i11].p, null, null);
                            }
                            i11 = i28;
                            n2Var.getMediaDataController().loadMedia(this.j1, 50, 0, 0, i11, this.F, 1, n2Var.getClassGuid(), qv0VarArr[i11].p, null, null);
                        }
                    }
                }
            }
            int i30 = uu0VarArr2[z10 ? 1 : 0].F;
            if (i30 == 8 || w0(i30)) {
                uu0 uu0Var11 = uu0VarArr2[z10 ? 1 : 0];
                lt0 lt0Var = uu0Var11.w;
                boolean w02 = w0(uu0Var11.F);
                int h12 = h1(uu0VarArr2[z10 ? 1 : 0].F);
                y9 y9Var = lt0Var.b;
                ci.d dVar = lt0Var.f;
                y9Var.setVisibility((w02 || u0() || r0()) ? 8 : 0);
                if (w02) {
                    dVar.setVisibility(0);
                    dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum));
                    i12 = 8;
                } else if (u0()) {
                    i12 = 8;
                    dVar.setVisibility(8);
                } else {
                    i12 = 8;
                    lt0Var.setStickerType(11);
                    dVar.setVisibility(!t0() ? 0 : 8);
                    dVar.h(w());
                }
                if (w02) {
                    lt0Var.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    lt0Var.e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    lt0Var.d.setText(LocaleController.getString(!t0() ? v0() ? R.string.NoPublicStoriesTitle2 : R.string.NoStoriesTitle : R.string.NoHashtagStoriesTitle));
                    lt0Var.e.setText(v0() ? LocaleController.getString(R.string.NoStoriesSubtitle2) : str);
                }
                dVar.setOnClickListener(new zr0(this, w02, h12, 0));
            } else {
                uu0 uu0Var12 = uu0VarArr2[z10 ? 1 : 0];
                if (uu0Var12.F == 9) {
                    if (u0()) {
                        uu0VarArr2[z10 ? 1 : 0].w.b.setVisibility(8);
                        uu0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        uu0VarArr2[z10 ? 1 : 0].w.b.setVisibility(0);
                        uu0VarArr2[z10 ? 1 : 0].w.setStickerType(11);
                        uu0VarArr2[z10 ? 1 : 0].w.f.setVisibility(0);
                        uu0VarArr2[z10 ? 1 : 0].w.f.h(w());
                    }
                    uu0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    uu0VarArr2[z10 ? 1 : 0].w.e.setText(v0() ? LocaleController.getString(R.string.NoArchivedStoriesSubtitle) : str);
                    uu0VarArr2[z10 ? 1 : 0].w.f.setOnClickListener(new xr0(this, 7));
                    i12 = 8;
                } else {
                    uu0Var12.w.b.setVisibility(0);
                    uu0VarArr2[z10 ? 1 : 0].w.setStickerType(1);
                    uu0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoResult));
                    uu0VarArr2[z10 ? 1 : 0].w.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    i12 = 8;
                    uu0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                }
            }
            z16 = false;
            uu0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            z17 = z14;
            v0Var2 = v0Var5;
        }
        int i31 = i16;
        uu0 uu0Var13 = uu0VarArr2[z10 ? 1 : 0];
        uu0Var13.b = z17;
        o1(uu0Var13, z16);
        uu0VarArr2[z10 ? 1 : 0].x.y1(i31);
        uu0VarArr2[z10 ? 1 : 0].h.a0();
        if (v0Var2 != null) {
            uu0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(v0Var2);
            uu0VarArr2[z10 ? 1 : 0].r.setRecycledViewPool(v0Var2);
        }
        if (this.x0 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.G;
            if (kVar.n0) {
                this.z0 = true;
                kVar.h(true);
                this.x0 = 0;
                this.o0 = 0.0f;
                if (v0Var3 != null) {
                    v0Var3.setVisibility(v0() ? i12 : i10);
                }
                q1(false);
            }
        }
    }

    public final void n0(ViewGroup viewGroup) {
        for (uu0 uu0Var : this.k0) {
            at0 at0Var = uu0Var.h;
            Objects.requireNonNull(at0Var);
            uu0Var.n = new ah.n(at0Var, viewGroup, new jq0(at0Var, 1));
        }
        rs0 rs0Var = this.V;
        if (rs0Var != null) {
            rs0Var.S = viewGroup;
            rs0Var.R = new ci.w7(rs0Var, 1);
        }
    }

    public final void n1() {
        gu0 gu0Var = this.H;
        if (gu0Var != null) {
            gu0Var.l();
        }
        ov0 ov0Var = this.K;
        if (ov0Var != null) {
            ov0Var.l();
        }
        ov0 ov0Var2 = this.L;
        if (ov0Var2 != null) {
            ov0Var2.l();
        }
        pv0 pv0Var = this.J;
        if (pv0Var != null) {
            pv0Var.X(false);
        }
        ov0 ov0Var3 = this.M;
        if (ov0Var3 != null) {
            ov0Var3.l();
        }
        iv0 iv0Var = this.N;
        if (iv0Var != null) {
            iv0Var.l();
        }
        pu0 pu0Var = this.O;
        if (pu0Var != null) {
            pu0Var.l();
        }
        ju0 ju0Var = this.c0;
        if (ju0Var != null) {
            ju0Var.l();
        }
        Iterator it = this.Y1.values().iterator();
        while (it.hasNext()) {
            ((aw0) it.next()).c.l();
        }
    }

    public final void o1(uu0 uu0Var, boolean z10) {
        boolean z11 = uu0Var.b && this.d;
        xl0 fastScroll = uu0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = uu0Var.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            uu0Var.c.cancel();
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<xl0, Float>) property, fastScroll.getAlpha(), 1.0f);
            uu0Var.c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r1);
            return;
        }
        if (z11 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<xl0, Float>) property, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new fa(fastScroll));
        uu0Var.c = ofFloat2;
        ofFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.k0;
            if (i10 >= uu0VarArr.length) {
                return;
            }
            at0 at0Var = uu0VarArr[i10].h;
            if (at0Var != null) {
                at0Var.getViewTreeObserver().addOnPreDrawListener(new xt0(this, i10, 0));
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
        nu0 nu0Var = this.D1;
        int height = nu0Var.f() != null ? nu0Var.f().getHeight() : 0;
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
            } else if (childAt instanceof uu0) {
                i12 = i10;
                measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                at0 at0Var = ((uu0) childAt).h;
                at0Var.setPadding(0, at0Var.W2, 0, at0Var.X2);
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
                    z40 z40Var = this.E1;
                    if (z40Var != null) {
                        z40Var.b(true);
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
                    uu0[] uu0VarArr = this.k0;
                    if (z11 && (((z10 = this.h1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (!U0(motionEvent, x10 < 0)) {
                            this.y1 = true;
                            this.x1 = false;
                            N0(false);
                            uu0VarArr[0].setTranslationX(0.0f);
                            uu0VarArr[1].setTranslationX(this.h1 ? uu0VarArr[0].getMeasuredWidth() : -uu0VarArr[0].getMeasuredWidth());
                            Z0(0.0f, uu0VarArr[1].F);
                            M0(getTabProgress());
                        }
                    }
                    if (!this.y1 || this.x1) {
                        if (this.x1) {
                            uu0VarArr[0].setTranslationX(x10);
                            if (this.h1) {
                                uu0VarArr[1].setTranslationX(uu0VarArr[0].getMeasuredWidth() + x10);
                            } else {
                                uu0VarArr[1].setTranslationX(x10 - uu0VarArr[0].getMeasuredWidth());
                            }
                            float abs2 = Math.abs(x10) / uu0VarArr[0].getMeasuredWidth();
                            if (D()) {
                                this.o0 = b0(abs2);
                                s1(abs2);
                                float a02 = a0(abs2);
                                this.p0 = a02;
                                this.r0.setVisibility((a02 == 0.0f || !D() || q0()) ? 4 : 0);
                            } else {
                                this.o0 = 0.0f;
                            }
                            q1(false);
                            Z0(abs2, uu0VarArr[1].F);
                            M0(getTabProgress());
                            L0();
                        }
                    } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                        U0(motionEvent, x10 < 0);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.w1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    g1(motionEvent);
                }
                return this.x1;
            }
        }
        return false;
    }

    public final void p1() {
        org.telegram.ui.ActionBar.v0 v0Var = this.t0;
        if (v0Var == null) {
            return;
        }
        boolean z10 = this.v1.getMessagesController().isPeerNoForwards(this.j1) || j0();
        v0Var.setAlpha(z10 ? 0.5f : 1.0f);
        if (z10 && v0Var.getBackground() != null) {
            v0Var.setBackground(null);
        } else {
            if (z10 || v0Var.getBackground() != null) {
                return;
            }
            v0Var.setBackground(org.telegram.ui.ActionBar.i6.g0(h0(org.telegram.ui.ActionBar.i6.z8), 5, -1));
        }
    }

    public boolean q0() {
        return false;
    }

    public final void q1(boolean z10) {
        rs0 rs0Var;
        ws0 ws0Var;
        fk0 fk0Var = this.s0;
        if (fk0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.V0 && (((rs0Var = this.V) == null || !rs0Var.g()) && ((ws0Var = this.W) == null || !ws0Var.w))) {
            f7 = Utilities.clamp(this.o0 + this.p0, 1.0f, 0.0f);
        }
        fk0Var.setAlpha(f7);
        if (z10) {
            A(a0(1.0f) > 0.5f, true);
        } else if (this.x0 == 2) {
            A(this.p0 > 0.1f, true);
        } else {
            A(this.o0 < 0.1f, true);
        }
    }

    public final boolean r0() {
        TLRPC.User user;
        long j3 = this.j1;
        return j3 > 0 && (user = MessagesController.getInstance(this.v1.getCurrentAccount()).getUser(Long.valueOf(j3))) != null && user.bot;
    }

    public final void r1(boolean z10) {
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.k0;
            if (i10 >= uu0VarArr.length) {
                return;
            }
            int childCount = uu0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = uu0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.k7) {
                    ((org.telegram.ui.Cells.k7) childAt).b(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.t7) {
                    ((org.telegram.ui.Cells.t7) childAt).i(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.n7) {
                    ((org.telegram.ui.Cells.n7) childAt).f(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                    ((org.telegram.ui.Cells.j7) childAt).e(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.f2) {
                    ((org.telegram.ui.Cells.f2) childAt).c(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) childAt).V(false, z10);
                }
            }
            i10++;
        }
    }

    public final boolean s0(int i10) {
        return i10 == 7 ? this.D1.T() : (t0() || i10 == 0 || p0(i10) || i10 == 2 || i10 == 5 || i10 == 6 || i10 == 11 || i10 == 10 || i10 == 13 || i10 == 14) ? false : true;
    }

    public final void s1(float f7) {
        org.telegram.ui.ActionBar.v0 v0Var = this.m0;
        if (v0Var == null) {
            return;
        }
        uu0[] uu0VarArr = this.k0;
        uu0 uu0Var = uu0VarArr[1];
        float f10 = 0.0f;
        if (uu0Var != null && uu0Var.F == 11) {
            f10 = 0.0f + f7;
        }
        uu0 uu0Var2 = uu0VarArr[0];
        if (uu0Var2 != null && uu0Var2.F == 11) {
            f10 += 1.0f - f7;
        }
        v0Var.setAlpha(f10);
        float f11 = (0.15f * f10) + 0.85f;
        v0Var.setScaleX(f11);
        v0Var.setScaleY(f11);
        v0Var.setVisibility(f10 <= 0.01f ? 8 : 0);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2 = this.d1;
        boolean z10 = chatFull2 != null && chatFull2.stories_pinned_available;
        this.d1 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.c1 == 0) {
                this.c1 = -j3;
                int i10 = 0;
                while (true) {
                    qv0[] qv0VarArr = this.t1;
                    if (i10 >= qv0VarArr.length) {
                        break;
                    }
                    if (qv0VarArr[i10].b[1].size() == 0) {
                        qv0 qv0Var = qv0VarArr[i10];
                        qv0Var.j[1] = this.d1.migrated_from_max_id;
                        qv0Var.i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.d1;
        if (chatFull3 == null || z10 == chatFull3.stories_pinned_available) {
            return;
        }
        rt0 rt0Var = this.I0;
        if (rt0Var != null) {
            rt0Var.setInitialTabId(q0() ? 9 : 8);
        }
        v1(true);
        m1(false);
    }

    public void setCommonGroupsCount(int i10) {
        if (this.F == 0) {
            this.X0[6] = i10;
        }
        v1(true);
        F();
    }

    public void setForwardRestrictedHint(z40 z40Var) {
        this.E1 = z40Var;
    }

    public void setMergeDialogId(long j3) {
        this.c1 = j3;
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
        v1(true);
        F();
        if (iArr2[0] >= 0) {
            z0(false);
        }
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.K1 = i11;
        int i14 = 0;
        while (true) {
            uu0[] uu0VarArr = this.k0;
            if (i14 >= uu0VarArr.length) {
                break;
            }
            uu0VarArr[i14].setTranslationY(this.K1);
            i14++;
        }
        if (this.P0 != null) {
            K();
        } else {
            nt0 nt0Var = this.R0;
            if (nt0Var != null) {
                nt0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
            }
        }
        this.O0 = i11;
        org.telegram.ui.Cells.w0 w0Var = this.K0;
        w0Var.setTranslationY((w0Var.getTag() == null ? -AndroidUtilities.dp(48.0f) : 0) + this.O0);
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.X1 != i10) {
            this.X1 = i10;
            uu0[] uu0VarArr = this.k0;
            if (uu0VarArr != null) {
                for (uu0 uu0Var : uu0VarArr) {
                    if (uu0Var != null) {
                        at0 at0Var = uu0Var.h;
                        int paddingLeft = at0Var.getPaddingLeft();
                        at0 at0Var2 = uu0Var.h;
                        int i11 = at0Var2.W2;
                        int paddingRight = at0Var2.getPaddingRight();
                        at0 at0Var3 = uu0Var.h;
                        int Y = Y(v0());
                        at0Var3.c3 = Y;
                        at0Var.setPadding(paddingLeft, i11, paddingRight, Y);
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
            uu0[] uu0VarArr = this.k0;
            if (i10 >= uu0VarArr.length) {
                return;
            }
            o1(uu0VarArr[i10], true);
            i10++;
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        TLRPC.UserFull userFull2 = this.e1;
        boolean z10 = userFull2 != null && userFull2.stories_pinned_available;
        this.e1 = userFull;
        v1(true);
        if (userFull == null || z10 == userFull.stories_pinned_available) {
            return;
        }
        Y0(8);
    }

    public void setVisibleHeight(int i10) {
        this.M1 = i10;
        int i11 = 0;
        while (true) {
            uu0[] uu0VarArr = this.k0;
            if (i11 >= uu0VarArr.length) {
                break;
            }
            float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(uu0VarArr[i11].F == 8 ? 280.0f : 120.0f)))) / 2.0f;
            uu0VarArr[i11].w.setTranslationY(f7);
            uu0VarArr[i11].v.setTranslationY(-f7);
            i11++;
        }
        qs0 qs0Var = this.U;
        if (qs0Var != null) {
            qs0Var.setVisibleHeight(i10);
        }
        rs0 rs0Var = this.V;
        if (rs0Var != null) {
            rs0Var.setVisibleHeight(i10);
        }
    }

    public boolean t0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void t1() {
        org.telegram.ui.ActionBar.v0 v0Var = this.m0;
        if (v0Var == null) {
            return;
        }
        uu0 uu0Var = this.k0[1];
        boolean z10 = uu0Var != null && uu0Var.F == 11;
        if (z10) {
            v0Var.setVisibility(0);
        }
        v0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.85f).scaleY(z10 ? 1.0f : 0.85f).withEndAction(new ds0(0, this, z10)).setDuration(420L).setInterpolator(hs.h).start();
    }

    public boolean u0() {
        return false;
    }

    public final void u1() {
        boolean z10;
        ai.e9 e9Var;
        boolean r02 = r0();
        org.telegram.ui.ActionBar.v0 v0Var = this.w0;
        org.telegram.ui.ActionBar.v0 v0Var2 = this.v0;
        if (r02) {
            if (v0Var2 != null) {
                v0Var2.setVisibility(8);
            }
            if (v0Var != null) {
                v0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 9) {
            if (v0Var2 != null) {
                v0Var2.setVisibility(8);
            }
            if (v0Var != null) {
                v0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() != 8) {
            if (w0(getClosestTab())) {
                if (v0Var2 != null) {
                    v0Var2.setVisibility(8);
                }
                if (v0Var != null) {
                    v0Var.setVisibility(8);
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
            ju0 ju0Var = this.c0;
            if (ju0Var != null && (e9Var = ju0Var.s) != null && !e9Var.m(messageObject.getId())) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (v0Var2 != null) {
            v0Var2.setVisibility(z10 ? 0 : 8);
        }
        if (v0Var != null) {
            v0Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public boolean v0() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01f2, code lost:
    
        if ((r9[8] <= 0) == r8.d(15)) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01f4, code lost:
    
        r6 = r37 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x01f7, code lost:
    
        r6 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0209, code lost:
    
        if ((r9[4] <= 0) == r8.d(4)) goto L173;
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
    public void v1(boolean z10) {
        int i10;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ProfileTab profileTab;
        TLRPC.ProfileTab profileTab2;
        int i11;
        boolean v02;
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
        rs0 rs0Var;
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
        tv0 tv0Var;
        rt0 rt0Var = this.I0;
        if (rt0Var == null) {
            return;
        }
        boolean z21 = !this.D1.q() ? false : z10;
        boolean z22 = (this.T == null || (tv0Var = this.u1) == null || !tv0Var.f) ? false : true;
        long j3 = this.j1;
        int i20 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.ActionBar.n2 n2Var = this.v1;
        if (i20 <= 0 || n2Var == null) {
            i10 = 1;
            user = null;
        } else {
            i10 = 1;
            user = n2Var.getMessagesController().getUser(Long.valueOf(j3));
        }
        boolean z23 = (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) ? i10 : false;
        int i21 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.e1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z23) ? 0 : i10;
        int i22 = ((DialogObject.isUserDialog(j3) || DialogObject.isChatDialog(j3)) && !DialogObject.isEncryptedDialog(j3) && (((userFull = this.e1) != null && userFull.stories_pinned_available) || (((chatFull = this.d1) != null && chatFull.stories_pinned_available) || v0())) && m0()) ? i10 : 0;
        rs0 rs0Var2 = this.V;
        int i23 = i21;
        boolean z24 = (rs0Var2 == null || (((userFull3 = this.e1) == null || userFull3.stargifts_count <= 0) && ((chatFull3 = this.d1) == null || chatFull3.stargifts_count <= 0))) ? false : i10;
        int i24 = i22;
        TLRPC.ChatFull chatFull4 = this.d1;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.e1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z25 = z21;
                int i25 = this.Q1 == rt0Var.n0 ? i10 : 0;
                boolean z26 = (i24 == 0 || i23 != 0) ? i10 : false;
                int i26 = i25;
                i11 = z26 == rt0Var.d(8) ? i26 + 1 : i26;
                if (z23 != rt0Var.d(13)) {
                    i11++;
                }
                if (t0() != rt0Var.d(8)) {
                    i11++;
                }
                if (z24 == rt0Var.d(14) || (rs0Var2 != null && z24 && this.P1 != rs0Var2.getLastEmojisHash())) {
                    i11++;
                }
                v02 = v0();
                int i27 = 14;
                lu0 lu0Var = this.a0;
                int[] iArr2 = this.X0;
                if (v02) {
                    z11 = z24;
                    int i28 = i11;
                    int i29 = (lu0Var.d == null ? i10 : false) == rt0Var.d(7) ? i28 + 1 : i28;
                    if (iArr2[0] <= 0) {
                        z19 = i10;
                        i16 = 0;
                    } else {
                        z19 = false;
                        i16 = 0;
                    }
                    int i30 = i29;
                    int i31 = z19 == rt0Var.d(i16) ? i30 + 1 : i30;
                    if (iArr2[i10] <= 0) {
                        z20 = i10;
                        i17 = z20;
                    } else {
                        i17 = i10;
                        z20 = false;
                    }
                    int i32 = i31;
                    int i33 = z20 == rt0Var.d(i17) ? i32 + 1 : i32;
                    if (DialogObject.isEncryptedDialog(j3)) {
                        i18 = i33;
                    } else {
                        int i34 = i33;
                        int i35 = (iArr2[3] <= 0) == rt0Var.d(3) ? i34 + 1 : i34;
                        i18 = (iArr2[4] <= 0) == rt0Var.d(4) ? i35 + 1 : i35;
                    }
                    int i36 = i19;
                    int i37 = (iArr2[2] <= 0) == rt0Var.d(2) ? i36 + 1 : i36;
                    int i38 = (iArr2[5] <= 0) == rt0Var.d(5) ? i37 + 1 : i37;
                    int i39 = (iArr2[6] <= 0) == rt0Var.d(6) ? i38 + 1 : i38;
                    boolean z27 = !this.Q.d.isEmpty();
                    int i40 = i39;
                    i11 = z27 != rt0Var.d(10) ? i40 + 1 : i40;
                    z12 = l0() && !n2Var.getMessagesController().getSavedMessagesController().unsupported && n2Var.getMessagesController().getSavedMessagesController().hasDialogs();
                    z13 = z27;
                    if (z12 != rt0Var.d(11)) {
                        i11++;
                    }
                    if (z22 != rt0Var.d(12)) {
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
                        transitionSet.addTransition(new org.telegram.ui.ActionBar.n0(2));
                        z14 = z22;
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(rt0Var.getTabsContainer(), transitionSet);
                        rt0Var.U = rt0Var.v;
                        rt0Var.V = rt0Var.w;
                    } else {
                        iArr = iArr2;
                        z14 = z22;
                    }
                    SparseArray g10 = rt0Var.g();
                    if (i11 > 3) {
                        g10 = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (t0()) {
                        arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                        rt0Var.b0 = 420L;
                    }
                    if (i23 != 0) {
                        arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                    } else if ((DialogObject.isUserDialog(j3) || DialogObject.isChatDialog(j3)) && !DialogObject.isEncryptedDialog(j3) && ((((userFull2 = this.e1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.d1) != null && chatFull2.stories_pinned_available) || v0())) && m0())) {
                        if (q0()) {
                            arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                            rt0Var.b0 = 420L;
                        } else {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                            if (v0()) {
                                arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                            }
                        }
                    }
                    if (z11) {
                        String string2 = LocaleController.getString(R.string.ProfileGifts);
                        HashMap hashMap = xh.s2.T;
                        yh.e5 e5Var = rs0Var2.d;
                        Object obj2 = "";
                        if (e5Var == null) {
                            rs0Var = rs0Var2;
                            sparseArray = g10;
                            num = 4;
                            z15 = z23;
                            z16 = z12;
                            i12 = i20;
                        } else {
                            z15 = z23;
                            ArrayList arrayList2 = e5Var.l;
                            z16 = z12;
                            i12 = i20;
                            sparseArray = g10;
                            num = 4;
                            Pair pair = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(rs0Var2.c));
                            if (!arrayList2.isEmpty()) {
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList3 = new ArrayList();
                                int i41 = 0;
                                while (true) {
                                    rs0Var = rs0Var2;
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
                                    rs0Var2 = rs0Var;
                                    z14 = z18;
                                }
                                z17 = z14;
                                if (!arrayList3.isEmpty()) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                                    for (int i42 = 0; i42 < arrayList3.size(); i42++) {
                                        TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i42);
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(MessageObject.getEmoji(document2));
                                        spannableStringBuilder2.setSpan(new b6(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
                                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                                    }
                                    c10 = 0;
                                    hashMap.put(pair, spannableStringBuilder);
                                    obj2 = spannableStringBuilder;
                                    CharSequence[] charSequenceArr = new CharSequence[2];
                                    charSequenceArr[c10] = string2;
                                    charSequenceArr[1] = obj2;
                                    arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr)));
                                    this.P1 = rs0Var.getLastEmojisHash();
                                }
                                c10 = 0;
                                CharSequence[] charSequenceArr2 = new CharSequence[2];
                                charSequenceArr2[c10] = string2;
                                charSequenceArr2[1] = obj2;
                                arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr2)));
                                this.P1 = rs0Var.getLastEmojisHash();
                            } else if (!e5Var.i || (obj = (CharSequence) hashMap.get(pair)) == null) {
                                rs0Var = rs0Var2;
                            } else {
                                rs0Var = rs0Var2;
                                obj2 = obj;
                            }
                        }
                        z17 = z14;
                        c10 = 0;
                        CharSequence[] charSequenceArr22 = new CharSequence[2];
                        charSequenceArr22[c10] = string2;
                        charSequenceArr22[1] = obj2;
                        arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr22)));
                        this.P1 = rs0Var.getLastEmojisHash();
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
                    if (!v0()) {
                        if (z16) {
                            arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                        }
                        if (lu0Var.d != null) {
                            arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                        }
                        if (iArr[0] > 0) {
                            if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && lu0Var.d == null) {
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
                        if (DialogObject.isEncryptedDialog(j3)) {
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
                    if (rt0Var.n0) {
                        boolean z28 = this.d1 instanceof TLRPC.TL_channelFull;
                        int i43 = 0;
                        while (i43 < 15) {
                            if (d0(i43, z28) != null) {
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
                        int e02 = e0(profileTab);
                        int i45 = 0;
                        while (true) {
                            if (i45 >= arrayList.size()) {
                                i45 = -1;
                                break;
                            } else if (((Integer) ((Pair) arrayList.get(i45)).first).intValue() == e02) {
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
                                if (rt0Var.d(((Integer) pair2.first).intValue())) {
                                    sparseArray2 = sparseArray;
                                } else {
                                    sparseArray2 = sparseArray;
                                    rt0Var.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, sparseArray2);
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
                this.Q1 = rt0Var.n0;
                rt0Var.c();
                L0();
                I();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z252 = z21;
        if (this.Q1 == rt0Var.n0) {
        }
        if (i24 == 0) {
        }
        int i262 = i25;
        if (z26 == rt0Var.d(8)) {
        }
        if (z23 != rt0Var.d(13)) {
        }
        if (t0() != rt0Var.d(8)) {
        }
        if (z24 == rt0Var.d(14)) {
        }
        i11++;
        v02 = v0();
        int i272 = 14;
        lu0 lu0Var2 = this.a0;
        int[] iArr22 = this.X0;
        if (v02) {
        }
        if (i11 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.Q1 = rt0Var.n0;
        rt0Var.c();
        L0();
        I();
    }

    public final SpannableStringBuilder w() {
        if (this.W1 == null) {
            this.W1 = new SpannableStringBuilder();
            if (r0()) {
                this.W1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.W1.append((CharSequence) "c");
                this.W1.setSpan(new er(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.W1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.W1;
    }

    public final Boolean w1(View view, View view2) {
        if (this.o1) {
            return null;
        }
        uu0[] uu0VarArr = this.k0;
        uu0 uu0Var = uu0VarArr[0];
        if (uu0Var == null) {
            return null;
        }
        int i10 = uu0Var.F;
        this.p1 = i10;
        boolean p02 = p0(i10);
        int[] iArr = this.m1;
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
            } else if (c0(uu0VarArr[0].F) >= 5 || w0(uu0VarArr[0].F)) {
                SharedConfig.setStoriesColumnsCount(X);
            }
            B(X);
        }
        return Boolean.valueOf(X != X(p02 ? 1 : 0, X, true));
    }

    public final void x(p80 p80Var, org.telegram.ui.ActionBar.n2 n2Var, long j3, int i10) {
        String publicUsername = j3 > 0 ? UserObject.getPublicUsername(MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j3))) : ChatObject.getPublicUsername(MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j3)));
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        a1.g.A(sb2, MessagesController.getInstance(n2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        p80Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new og0(this, sb2.toString(), n2Var, 5), false);
    }

    public final boolean x0() {
        if (C() && ((getClosestTab() == 8 || getClosestTab() == 13 || w0(getClosestTab())) && this.C1)) {
            return false;
        }
        rs0 rs0Var = this.V;
        if (rs0Var != null && rs0Var.g()) {
            return false;
        }
        ws0 ws0Var = this.W;
        return ((ws0Var != null && ws0Var.w) || this.o1 || this.g1) ? false : true;
    }

    public final Boolean x1(View view, View view2) {
        if (this.o1) {
            return null;
        }
        uu0[] uu0VarArr = this.k0;
        uu0 uu0Var = uu0VarArr[0];
        if (uu0Var == null) {
            return null;
        }
        if (this.k1 && p0(uu0Var.F)) {
            return null;
        }
        int i10 = uu0VarArr[0].F;
        this.p1 = i10;
        boolean p02 = p0(i10);
        int[] iArr = this.m1;
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
            } else if (c0(uu0VarArr[0].F) >= 5 || w0(uu0VarArr[0].F)) {
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
    public final void y(p80 p80Var) {
        uu0 uu0Var;
        int x10 = p80Var.x();
        final int i10 = 0;
        p80Var.c(R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn), new Runnable(this) { // from class: org.telegram.ui.Components.hs0
            public final /* synthetic */ bw0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        bw0 bw0Var = this.b;
                        bw0Var.getClass();
                        View[] viewArr = r2;
                        bw0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        bw0 bw0Var2 = this.b;
                        bw0Var2.getClass();
                        View[] viewArr2 = r2;
                        bw0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        p80Var.c(R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut), new Runnable(this) { // from class: org.telegram.ui.Components.hs0
            public final /* synthetic */ bw0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        bw0 bw0Var = this.b;
                        bw0Var.getClass();
                        View[] viewArr = r2;
                        bw0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        bw0 bw0Var2 = this.b;
                        bw0Var2.getClass();
                        View[] viewArr2 = r2;
                        bw0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final View[] viewArr = {p80Var.w(x10), p80Var.w(x10 + 1)};
        uu0[] uu0VarArr = this.k0;
        if (uu0VarArr != null && (uu0Var = uu0VarArr[0]) != null) {
            boolean p02 = p0(uu0Var.F);
            int i12 = this.m1[p02 ? 1 : 0];
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
        qv0[] qv0VarArr = this.t1;
        qv0VarArr[i10].a.clear();
        qv0VarArr[i10].b[0].clear();
        qv0VarArr[i10].b[1].clear();
        qv0 qv0Var = qv0VarArr[i10];
        qv0Var.j[0] = i11;
        qv0Var.i[0] = false;
        qv0Var.l = false;
        qv0Var.m = i12;
        qv0Var.n = (qv0Var.e() - i12) - 1;
        qv0 qv0Var2 = qv0VarArr[i10];
        if (qv0Var2.n < 0) {
            qv0Var2.n = 0;
        }
        qv0Var2.k = i11;
        qv0Var2.o = true;
        qv0Var2.g = false;
        qv0Var2.p++;
        uu0 W = W(i10);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (!z10) {
            return;
        }
        int i13 = 0;
        while (true) {
            uu0[] uu0VarArr = this.k0;
            if (i13 >= uu0VarArr.length) {
                return;
            }
            uu0 uu0Var = uu0VarArr[i13];
            if (uu0Var.F == i10) {
                uu0Var.x.h1(Math.min(qv0VarArr[i10].e() - 1, qv0VarArr[i10].m), 0);
            }
            i13++;
        }
    }

    public final void z(tu0 tu0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = tu0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = tu0Var.getChildAt(i11);
            if (childAt instanceof j10) {
                view = childAt;
            }
        }
        if (view != null) {
            tu0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new wt0(this, tu0Var, sparseBooleanArray, (j10) view, i10));
    }

    public final void z0(boolean z10) {
        long j3 = this.F;
        if (j3 != 0 || t0()) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            final int i11 = d2[i10];
            qv0[] qv0VarArr = this.t1;
            if (qv0VarArr[i11].h && !z10) {
                return;
            }
            long j10 = this.j1;
            if (DialogObject.isEncryptedDialog(j10)) {
                return;
            }
            qv0VarArr[i11].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i11 == 0) {
                int i12 = qv0VarArr[i11].q;
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
            tL_messages_getSearchResultsPositions.peer = n2Var.getMessagesController().getInputPeer(j10);
            if (j3 != 0 && n2Var.getUserConfig().getClientUserId() == j10) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = n2Var.getMessagesController().getInputPeer(j3);
            }
            final int i13 = qv0VarArr[i11].p;
            ConnectionsManager.getInstance(n2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(n2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() { // from class: org.telegram.ui.Components.ur0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new cs0(bw0.this, tL_error, i13, i11, tLObject, 0));
                }
            }), n2Var.getClassGuid());
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

    @Override // org.telegram.ui.Cells.o2
    public final void a(org.telegram.ui.Cells.s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.o2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.o2
    public final void d(org.telegram.ui.Cells.s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.o2
    public final void g(org.telegram.ui.Cells.s2 s2Var) {
    }

    public void o0() {
    }
}
