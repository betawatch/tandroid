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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class eu0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.n2 {
    public static final int[] Z1 = {0, 1, 2, 4};
    public static final rq0 a2 = new rq0(0);
    public final int A;
    public final ArrayList A0;
    public s30 A1;
    public final long B;
    public final ArrayList B0;
    public final org.telegram.ui.ActionBar.b6 B1;
    public final org.telegram.ui.ActionBar.k C;
    public final ArrayList C0;
    public final NotificationCenter.ObserversGroup C1;
    public final js0 D;
    public final ArrayList D0;
    public boolean D1;
    public final yt0 E;
    public final ur0 E0;
    public final AnimationNotificationsLocker E1;
    public final st0 F;
    public final rr0 F0;
    public org.telegram.ui.rl F1;
    public final rt0 G;
    public final org.telegram.ui.Cells.w0 G0;
    public int G1;
    public final rt0 H;
    public AnimatorSet H0;
    public boolean H1;
    public final rt0 I;
    public final aq0 I0;
    public int I1;
    public final lt0 J;
    public final ArrayList J0;
    public AnimatorSet J1;
    public final ss0 K;
    public float K0;
    public final SparseArray K1;
    public final ps0 L;
    public final bs L0;
    public long L1;
    public final ns0 M;
    public final FrameLayout M0;
    public boolean M1;
    public final ot0 N;
    public final qr0 N0;
    public int N1;
    public final pt0 O;
    public final int O0;
    public final bs0 O1;
    public final ks0 P;
    public final Paint P0;
    public ih.n6 P1;
    public final uq0 Q;
    public boolean Q0;
    public float Q1;
    public final vq0 R;
    public boolean R0;
    public boolean R1;
    public final zq0 S;
    public hg.r0 S0;
    public SpannableStringBuilder S1;
    public final os0 T;
    public final int[] T0;
    public int T1;
    public final f2.h0 U;
    public int U0;
    public final HashMap U1;
    public final ms0 V;
    public final SparseArray[] V0;
    public final HashMap V1;
    public final bu0 W;
    public int W0;
    public int W1;
    public boolean X0;
    public int X1;
    public long Y0;
    public final ah Y1;
    public TLRPC.ChatFull Z0;
    public boolean a;
    public final tq0 a0;
    public TLRPC.UserFull a1;
    public boolean b;
    public final bu0 b0;
    public AnimatorSet b1;
    public boolean c;
    public final at0 c0;
    public boolean c1;
    public boolean d;
    public final at0 d0;
    public boolean d1;
    public int e;
    public final at0 e0;
    public boolean e1;
    public int f;
    public final vs0 f0;
    public final long f1;
    public final xs0[] g0;
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
    public final er0 n1;
    public final pi0 o0;
    public float o1;
    public final org.telegram.ui.ActionBar.w0 p0;
    public final tt0[] p1;
    public final org.telegram.ui.ActionBar.w0 q0;
    public final wt0 q1;
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
    public final z9 x0;
    public VelocityTracker x1;
    public final e00 y;
    public final ImageView y0;
    public boolean y1;
    public final org.telegram.ui.ActionBar.h2 z0;
    public final qs0 z1;

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
    /* JADX WARN: Type inference failed for: r10v8, types: [android.graphics.drawable.Drawable, f2.w0, org.telegram.ui.ActionBar.b6] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eu0(Context context, long j10, wt0 wt0Var, int i9, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, int i11, org.telegram.ui.ActionBar.o2 o2Var, qs0 qs0Var, int i12, org.telegram.ui.ActionBar.b6 b6Var, ig.a aVar) {
        super(context);
        char c10;
        TLRPC.ProfileTab profileTab;
        int i13;
        tt0[] tt0VarArr;
        int i14;
        rr0 rr0Var;
        int i15;
        int i16;
        ot0 ot0Var;
        float f10;
        Context context2;
        org.telegram.ui.ActionBar.w0 w0Var;
        ?? r10;
        org.telegram.ui.ActionBar.b6 b6Var2;
        eu0 eu0Var;
        int i17;
        int i18;
        int i19;
        xs0[] xs0VarArr;
        View view;
        boolean N;
        eu0 eu0Var2;
        zq0 zq0Var;
        int i20;
        int i21;
        br0 br0Var;
        ws0 ws0Var;
        ws0 ws0Var2;
        ws0 ws0Var3;
        ws0 ws0Var4;
        ws0 ws0Var5;
        ws0 ws0Var6;
        ws0 ws0Var7;
        ws0 ws0Var8;
        ws0 ws0Var9;
        ws0 ws0Var10;
        ws0 ws0Var11;
        ws0 ws0Var12;
        ws0 ws0Var13;
        ws0 ws0Var14;
        ws0 ws0Var15;
        e00 e00Var;
        e00 e00Var2;
        e00 e00Var3;
        e00 e00Var4;
        gw0 gw0Var;
        gw0 gw0Var2;
        gw0 gw0Var3;
        gw0 gw0Var4;
        gw0 gw0Var5;
        gw0 gw0Var6;
        gw0 gw0Var7;
        gw0 gw0Var8;
        gw0 gw0Var9;
        gw0 gw0Var10;
        e00 e00Var5;
        ws0 ws0Var16;
        gw0 gw0Var11;
        ws0 ws0Var17;
        ws0 ws0Var18;
        xs0 xs0Var;
        br0 br0Var2;
        ws0 ws0Var19;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        TL_bots.BotInfo botInfo;
        eu0 eu0Var3 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        eu0Var3.x = new Rect();
        eu0Var3.g0 = new xs0[2];
        eu0Var3.A0 = new ArrayList(10);
        eu0Var3.B0 = new ArrayList(10);
        eu0Var3.C0 = new ArrayList(10);
        eu0Var3.D0 = new ArrayList(10);
        eu0Var3.I0 = new aq0(eu0Var3, 2);
        eu0Var3.J0 = new ArrayList();
        eu0Var3.P0 = new Paint();
        eu0Var3.V0 = new SparseArray[]{new SparseArray(), new SparseArray()};
        eu0Var3.g1 = false;
        eu0Var3.h1 = false;
        eu0Var3.i1 = new int[]{3, 3};
        eu0Var3.n1 = new er0(eu0Var3);
        eu0Var3.o1 = -5.0f;
        eu0Var3.p1 = new tt0[9];
        eu0Var3.E1 = new AnimationNotificationsLocker();
        eu0Var3.K1 = new SparseArray();
        eu0Var3.N1 = -1;
        eu0Var3.O1 = new bs0(eu0Var3);
        eu0Var3.Q1 = 0.0f;
        eu0Var3.U1 = new HashMap();
        eu0Var3.V1 = new HashMap();
        ng.c cVar = new ng.c();
        cVar.a(eu0Var3.h0(org.telegram.ui.ActionBar.f6.d6));
        ig.a aVar2 = aVar == null ? new ig.a(cVar) : aVar;
        eu0Var3.A = i12;
        eu0Var3.B1 = b6Var;
        e00 e00Var6 = new e00(context);
        eu0Var3.y = e00Var6;
        e00Var6.setIsSingleCell(true);
        TLRPC.User user = o2Var.getMessagesController().getUser(Long.valueOf(j10));
        eu0Var3.q1 = wt0Var;
        eu0Var3.z1 = qs0Var;
        int[] iArr = wt0Var.c;
        long j11 = wt0Var.s;
        eu0Var3.B = j11;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j11 == 0 ? i9 : 0, iArr[7], iArr[8]};
        eu0Var3.T0 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            if (chatFull2 == null) {
                c10 = 5;
                profileTab = null;
                if (i10 != 14 || i10 == 10 || i10 == 11 || i10 == 6) {
                    eu0Var3.U0 = i10;
                } else if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    eu0Var3.U0 = 13;
                } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                    eu0Var3.U0 = 8;
                } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || eu0Var3.v0()))) {
                    eu0Var3.U0 = 8;
                } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                    if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                        int i27 = iArr2[1];
                        i22 = -1;
                        if (i27 == -1 || i27 > 0) {
                            eu0Var3.U0 = 1;
                        }
                    } else {
                        i22 = -1;
                    }
                    if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i26 = iArr2[c10]) == i22 || i26 > 0)) {
                        eu0Var3.U0 = 5;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i25 = iArr2[3]) == i22 || i25 > 0)) {
                        eu0Var3.U0 = 3;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i24 = iArr2[4]) == i22 || i24 > 0)) {
                        eu0Var3.U0 = 4;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i23 = iArr2[2]) == i22 || i23 > 0)) {
                        eu0Var3.U0 = 2;
                    } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || eu0Var3.v0())) {
                        eu0Var3.U0 = eu0Var3.getInitialTab();
                    } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                        int i28 = -1;
                        if (i10 == -1 || j11 != 0) {
                            int i29 = 0;
                            while (true) {
                                int[] iArr3 = eu0Var3.T0;
                                if (i29 >= iArr3.length) {
                                    break;
                                }
                                int i30 = iArr3[i29];
                                if (i30 == i28 || i30 > 0) {
                                    break;
                                }
                                i29++;
                                i28 = -1;
                            }
                            eu0Var3.U0 = i29;
                        } else {
                            eu0Var3.U0 = i10;
                        }
                    } else {
                        eu0Var3.U0 = 14;
                    }
                } else {
                    eu0Var3.U0 = 14;
                }
                eu0Var3.M0(i10);
                eu0Var3.Z0 = chatFull2;
                eu0Var3.a1 = userFull;
                if (chatFull2 != null) {
                    eu0Var3.Y0 = -chatFull2.migrated_from_chat_id;
                }
                eu0Var3.f1 = j10;
                i13 = 0;
                while (true) {
                    tt0VarArr = eu0Var3.p1;
                    if (i13 < tt0VarArr.length) {
                        break;
                    }
                    tt0VarArr[i13] = new tt0();
                    eu0Var3.p1[i13].j[0] = DialogObject.isEncryptedDialog(eu0Var3.f1) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    eu0Var3.p1[i13].j[1] = Integer.MAX_VALUE;
                    eu0Var3.R(i13);
                    if (eu0Var3.Y0 != 0 && eu0Var3.Z0 != null && eu0Var3.p1[i13].b[1].size() == 0) {
                        tt0 tt0Var = eu0Var3.p1[i13];
                        tt0Var.j[1] = eu0Var3.Z0.migrated_from_max_id;
                        tt0Var.i[1] = false;
                    }
                    i13++;
                }
                eu0Var3.r1 = o2Var;
                eu0Var3.C = o2Var.getActionBar();
                eu0Var3.i1[0] = eu0Var3.S0() > 0 ? SharedConfig.mediaColumnsCount : eu0Var3.S0();
                eu0Var3.i1[1] = eu0Var3.S0() > 0 ? SharedConfig.storiesColumnsCount : eu0Var3.S0();
                eu0Var3.C1 = o2Var.getNotificationCenter().createObserversGroup(eu0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
                for (i14 = 0; i14 < 10; i14++) {
                    if (i10 == 4) {
                        pr0 pr0Var = new pr0(eu0Var3, context);
                        pr0Var.P.c();
                        eu0Var3.C0.add(pr0Var);
                    }
                }
                eu0Var3.O0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                eu0Var3.R0 = false;
                eu0Var3.S0 = null;
                rr0Var = eu0Var3.F0;
                if (rr0Var != null) {
                    rr0Var.g(false);
                }
                eu0Var3.Q0 = false;
                Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
                eu0Var3.u0 = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(eu0Var3.h0(org.telegram.ui.ActionBar.f6.b7), PorterDuff.Mode.MULTIPLY));
                ur0 ur0Var = eu0Var3.E0;
                int currentTabId = ur0Var == null ? ur0Var.getCurrentTabId() : i10;
                ur0 ur0Var2 = new ur0(eu0Var3, context, eu0Var3.B1);
                i15 = eu0Var3.U0;
                if (i15 != -1) {
                    ur0Var2.setInitialTabId(i15);
                    eu0Var3.U0 = -1;
                }
                ur0Var2.U = 320L;
                int i31 = org.telegram.ui.ActionBar.f6.Fh;
                int i32 = org.telegram.ui.ActionBar.f6.Eh;
                ur0Var2.H = i31;
                ur0Var2.I = i32;
                ur0Var2.d();
                ur0Var2.setUseMinimalWidth(true);
                ur0Var2.setDelegate(new wr0(eu0Var3));
                eu0Var3.E0 = ur0Var2;
                for (i16 = 1; i16 >= 0; i16--) {
                    eu0Var3.V0[i16].clear();
                }
                eu0Var3.W0 = 0;
                eu0Var3.J0.clear();
                ot0Var = eu0Var3.N;
                if (ot0Var != null) {
                    ot0Var.w.clear();
                }
                if (!(eu0Var3 instanceof i30)) {
                    org.telegram.ui.ActionBar.z n10 = eu0Var3.C.n();
                    n10.addOnLayoutChangeListener(new vr0(eu0Var3));
                    if (eu0Var3.f1 == eu0Var3.r1.getUserConfig().getClientUserId() && (eu0Var3.r1 instanceof k90) && eu0Var3.D()) {
                        eu0Var3.i0 = n10.a(11, R.drawable.outline_header_search);
                    }
                    org.telegram.ui.ActionBar.w0 a3 = n10.a(0, 0);
                    a3.F();
                    a3.D = new cs0(eu0Var3);
                    eu0Var3.j0 = a3;
                    a3.setTranslationY(AndroidUtilities.dp(10.0f));
                    rr0 rr0Var2 = eu0Var3.F0;
                    a3.setSearchFieldHint(LocaleController.getString((rr0Var2 != null && rr0Var2.a() && eu0Var3.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
                    a3.setContentDescription(LocaleController.getString("Search", R.string.Search));
                    a3.setVisibility(eu0Var3.v0() ? 8 : 4);
                }
                ImageView imageView = new ImageView(context);
                eu0Var3.n0 = imageView;
                imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
                imageView.setTranslationY(AndroidUtilities.dp(10.0f));
                imageView.setVisibility(4);
                if (!eu0Var3.q0() || eu0Var3.t0()) {
                    f10 = 2.0f;
                } else {
                    eu0Var3.C.addView(imageView, g7.e6.e(48, 56, 85));
                    pi0 pi0Var = new pi0(context);
                    eu0Var3.o0 = pi0Var;
                    pi0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    pi0Var.e(R.raw.options_to_search, 24, 24);
                    pi0Var.getAnimatedDrawable().B *= 2.0f;
                    pi0Var.getAnimatedDrawable().h = true;
                    f10 = 2.0f;
                    pi0Var.setColorFilter(new PorterDuffColorFilter(eu0Var3.h0(org.telegram.ui.ActionBar.f6.y8), PorterDuff.Mode.SRC_IN));
                    pi0Var.setVisibility(8);
                    eu0Var3.C.addView(pi0Var, g7.e6.e(48, 56, 85));
                }
                context2 = context;
                imageView.setOnClickListener(new is0(eu0Var3, j10, b6Var, context));
                w0Var = eu0Var3.j0;
                if (w0Var != null) {
                    EditTextBoldCursor searchField = w0Var.getSearchField();
                    int i33 = org.telegram.ui.ActionBar.f6.G6;
                    searchField.setTextColor(eu0Var3.h0(i33));
                    searchField.setHintTextColor(eu0Var3.h0(org.telegram.ui.ActionBar.f6.Si));
                    searchField.setCursorColor(eu0Var3.h0(i33));
                }
                eu0Var3.t0 = 0;
                org.telegram.ui.ActionBar.o2 o2Var2 = eu0Var3.r1;
                xu0 xu0Var = (o2Var2 == null && (o2Var2.getFragmentView() instanceof xu0)) ? (xu0) eu0Var3.r1.getFragmentView() : null;
                z9 z9Var = new z9(context2, xu0Var);
                eu0Var3.x0 = z9Var;
                z9Var.setBackgroundColor(eu0Var3.h0(org.telegram.ui.ActionBar.f6.a7));
                z9Var.setAlpha(0.0f);
                z9Var.setClickable(true);
                z9Var.setVisibility(4);
                ImageView imageView2 = new ImageView(context2);
                eu0Var3.y0 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(true);
                eu0Var3.z0 = h2Var;
                imageView2.setImageDrawable(h2Var);
                int i34 = org.telegram.ui.ActionBar.f6.y8;
                h2Var.a(eu0Var3.h0(i34));
                int i35 = org.telegram.ui.ActionBar.f6.z8;
                imageView2.setBackground(org.telegram.ui.ActionBar.f6.e0(eu0Var3.h0(i35), 1));
                imageView2.setContentDescription(LocaleController.getString("Close", R.string.Close));
                z9Var.addView(imageView2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                eu0Var3.J0.add(imageView2);
                imageView2.setOnClickListener(new cq0(eu0Var3, 0));
                NumberTextView numberTextView = new NumberTextView(context2);
                eu0Var3.w0 = numberTextView;
                numberTextView.setTextSize(18);
                numberTextView.setTypeface(AndroidUtilities.bold());
                numberTextView.setTextColor(eu0Var3.h0(i34));
                z9Var.addView(numberTextView, g7.e6.m(1.0f, 0, -1, 18, 0, 0));
                eu0Var3.J0.add(numberTextView);
                if (!DialogObject.isEncryptedDialog(eu0Var3.f1)) {
                    if (!eu0Var3.v0()) {
                        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context2, eu0Var3.h0(i35), eu0Var3.h0(i34), false);
                        eu0Var3.q0 = w0Var2;
                        w0Var2.setIcon(R.drawable.msg_message);
                        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrGoToMessage));
                        w0Var2.setDuplicateParentStateEnabled(false);
                        z9Var.addView(w0Var2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        eu0Var3.J0.add(w0Var2);
                        w0Var2.setOnClickListener(new cq0(eu0Var3, 1));
                        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context2, eu0Var3.h0(i35), eu0Var3.h0(i34), false);
                        eu0Var3.p0 = w0Var3;
                        w0Var3.setIcon(R.drawable.msg_forward);
                        w0Var3.setContentDescription(LocaleController.getString(R.string.Forward));
                        w0Var3.setDuplicateParentStateEnabled(false);
                        z9Var.addView(w0Var3, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        eu0Var3.J0.add(w0Var3);
                        w0Var3.setOnClickListener(new cq0(eu0Var3, 2));
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context2, eu0Var3.h0(i35), eu0Var3.h0(i34), false);
                    eu0Var3.r0 = w0Var4;
                    w0Var4.setIcon(R.drawable.msg_pin);
                    w0Var4.setContentDescription(LocaleController.getString(R.string.PinMessage));
                    w0Var4.setDuplicateParentStateEnabled(false);
                    w0Var4.setVisibility(8);
                    z9Var.addView(w0Var4, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    eu0Var3.J0.add(w0Var4);
                    w0Var4.setOnClickListener(new cq0(eu0Var3, 3));
                    org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context2, eu0Var3.h0(i35), eu0Var3.h0(i34), false);
                    eu0Var3.s0 = w0Var5;
                    w0Var5.setIcon(R.drawable.msg_unpin);
                    w0Var5.setContentDescription(LocaleController.getString(R.string.UnpinMessage));
                    w0Var5.setDuplicateParentStateEnabled(false);
                    w0Var5.setVisibility(8);
                    z9Var.addView(w0Var5, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    eu0Var3.J0.add(w0Var5);
                    w0Var5.setOnClickListener(new cq0(eu0Var3, 4));
                    eu0Var3.p1();
                }
                org.telegram.ui.ActionBar.w0 w0Var6 = new org.telegram.ui.ActionBar.w0(context2, eu0Var3.h0(i35), eu0Var3.h0(i34), false);
                eu0Var3.h0 = w0Var6;
                w0Var6.setIcon(R.drawable.msg_delete);
                w0Var6.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
                w0Var6.setDuplicateParentStateEnabled(false);
                z9Var.addView(w0Var6, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                eu0Var3.J0.add(w0Var6);
                w0Var6.setOnClickListener(new cq0(eu0Var3, 5));
                eu0Var3.D = new js0(eu0Var3, context2);
                eu0Var3.E = new yt0(eu0Var3, context2);
                eu0Var3.G = new rt0(eu0Var3, context2, 1);
                eu0Var3.H = new rt0(eu0Var3, context2, 2);
                eu0Var3.I = new rt0(eu0Var3, context2, 4);
                eu0Var3.J = new lt0(eu0Var3, context2, eu0Var3.r1.getCurrentAccount(), eu0Var3.r1.getResourceProvider());
                eu0Var3.K = new ss0(eu0Var3, context2);
                eu0Var3.c0 = new at0(eu0Var3, context2, 1);
                eu0Var3.d0 = new at0(eu0Var3, context2, 4);
                eu0Var3.e0 = new at0(eu0Var3, context2, 3);
                eu0Var3.f0 = new vs0(eu0Var3, context2);
                eu0Var3.L = new ps0(eu0Var3, context2);
                eu0Var3.M = new ns0(eu0Var3, context2);
                eu0Var3.N = new ot0(eu0Var3, context2);
                eu0Var3.O = new pt0(eu0Var3, context2);
                if (!eu0Var3.v0() && !eu0Var3.l0() && eu0Var3.B == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", eu0Var3.r1.getUserConfig().getClientUserId());
                    bundle.putInt("chatMode", 3);
                    ks0 ks0Var = new ks0(eu0Var3, context2, eu0Var3.r1.getParentLayout(), bundle);
                    eu0Var3.P = ks0Var;
                    long j12 = eu0Var3.f1;
                    org.telegram.ui.rn rnVar = ks0Var.a;
                    rnVar.Z3 = j12;
                    rnVar.La = true;
                    ks0Var.setClipToOutline(true);
                    ks0Var.setOutlineProvider(new ls0());
                }
                os0 os0Var = new os0(eu0Var3, context2);
                eu0Var3.T = os0Var;
                if (eu0Var3.B == 0) {
                    os0Var.e = arrayList;
                    os0Var.d = currentTabId != 7 ? null : chatFull2;
                }
                eu0Var3.V = new ms0(eu0Var3, context2);
                eu0Var3.U = new f2.h0(new sq0(eu0Var3));
                eu0Var3.W = new bu0(eu0Var3, context2, false);
                eu0Var3.a0 = new tq0(eu0Var3, context2);
                eu0Var3.b0 = new bu0(eu0Var3, context2, true);
                eu0Var3.F = new st0(eu0Var3, context2);
                if (!eu0Var3.r0()) {
                    eu0Var3.Q = new uq0(eu0Var3, context2, eu0Var3.r1, eu0Var3.f1);
                } else if (eu0Var3.r1 instanceof ProfileActivity) {
                    TextView textView = new TextView(context2);
                    eu0Var3.m0 = textView;
                    textView.setText(LocaleController.getString(R.string.Save).toUpperCase());
                    textView.setTypeface(AndroidUtilities.bold());
                    int i36 = org.telegram.ui.ActionBar.f6.Oh;
                    textView.setTextColor(eu0Var3.h0(i36));
                    textView.setTextSize(1, 15.0f);
                    textView.setGravity(17);
                    textView.setBackground(org.telegram.ui.ActionBar.f6.e0(org.telegram.ui.ActionBar.f6.l1(0.15f, eu0Var3.h0(i36)), 3));
                    textView.setPadding(AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f), 0);
                    eu0Var3.C.addView(textView, g7.e6.e(-2, 56, 85));
                    textView.setOnClickListener(new cq0(eu0Var3, 6));
                    textView.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setScaleX(0.4f);
                    textView.setScaleY(0.4f);
                    org.telegram.ui.ActionBar.o2 o2Var3 = eu0Var3.r1;
                    r10 = 0;
                    b6Var2 = b6Var;
                    vq0 vq0Var = new vq0(o2Var3.getCurrentAccount(), ((ProfileActivity) eu0Var3.r1).a(), context2, o2Var3, b6Var2, eu0Var3);
                    context2 = context2;
                    eu0 eu0Var4 = eu0Var3;
                    eu0Var4.R = vq0Var;
                    int dp = AndroidUtilities.dp(48.0f);
                    bs bsVar = eu0Var4.L0;
                    vq0Var.setPaddingTop(dp + (bsVar != null ? (int) bsVar.c(0.0f) : 0));
                    eu0Var4.S = new zq0(eu0Var4, context2, xu0Var, eu0Var4.getStoriesController().B(eu0Var4.f1, true), new yq0(eu0Var4, context2, o2Var, b6Var2));
                    eu0Var = eu0Var4;
                    eu0Var.setWillNotDraw(false);
                    i17 = 0;
                    i18 = -1;
                    i19 = 0;
                    while (true) {
                        xs0VarArr = eu0Var.g0;
                        if (i19 >= xs0VarArr.length) {
                            break;
                        }
                        if (i19 == 0 && (xs0Var = xs0VarArr[i19]) != null && (br0Var2 = xs0Var.x) != null) {
                            i18 = br0Var2.L0();
                            if (i18 != eu0Var.g0[i19].x.B() - 1) {
                                ws0Var19 = eu0Var.g0[i19].h;
                                ik0 ik0Var = (ik0) ws0Var19.K(i18);
                                if (ik0Var != null) {
                                    i17 = ik0Var.a.getTop();
                                } else {
                                    i18 = -1;
                                }
                            } else {
                                i20 = i17;
                                i21 = -1;
                                ar0 ar0Var = new ar0(eu0Var, context2);
                                eu0Var.addView(ar0Var, g7.e6.d(-1, -1.0f, 51, 0.0f, eu0Var.B0(), 0.0f, 0.0f));
                                if (i19 == 1) {
                                    ar0Var.setTranslationX(AndroidUtilities.displaySize.x);
                                }
                                eu0Var.g0[i19] = ar0Var;
                                br0Var = new br0(eu0Var, ar0Var);
                                ar0Var.x = br0Var;
                                br0Var.z1(new cr0(eu0Var, ar0Var));
                                eu0Var.g0[i19].d = new f2.n();
                                eu0Var.g0[i19].d.n(280L);
                                eu0Var.g0[i19].d.o(gr.h);
                                xs0 xs0Var2 = eu0Var.g0[i19];
                                xs0Var2.d.m = false;
                                xs0Var2.h = new dr0(eu0Var, context2, ar0Var, br0Var);
                                ws0Var = eu0Var.g0[i19].h;
                                ws0Var.setFastScrollEnabled(1);
                                ws0Var2 = eu0Var.g0[i19].h;
                                ws0Var2.setScrollingTouchSlop(1);
                                ws0Var3 = eu0Var.g0[i19].h;
                                ws0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(f10));
                                ws0Var4 = eu0Var.g0[i19].h;
                                ws0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                                ws0Var5 = eu0Var.g0[i19].h;
                                ws0Var5.setItemAnimator(r10);
                                ws0Var6 = eu0Var.g0[i19].h;
                                ws0Var6.setClipToPadding(false);
                                ws0Var7 = eu0Var.g0[i19].h;
                                ws0Var7.setSectionsType(2);
                                ws0Var8 = eu0Var.g0[i19].h;
                                ws0Var8.setLayoutManager(br0Var);
                                xs0 xs0Var3 = eu0Var.g0[i19];
                                ws0Var9 = xs0Var3.h;
                                xs0Var3.addView(ws0Var9, g7.e6.c(-1.0f, -1));
                                eu0Var.g0[i19].r = new ws0(context2, r10);
                                xs0 xs0Var4 = eu0Var.g0[i19];
                                ws0 ws0Var20 = xs0Var4.r;
                                fr0 fr0Var = new fr0(eu0Var);
                                xs0Var4.s = fr0Var;
                                ws0Var20.setLayoutManager(fr0Var);
                                xs0 xs0Var5 = eu0Var.g0[i19];
                                xs0Var5.addView(xs0Var5.r, g7.e6.c(-1.0f, -1));
                                eu0Var.g0[i19].r.setVisibility(8);
                                eu0Var.g0[i19].r.i(new gr0(ar0Var));
                                ws0Var10 = eu0Var.g0[i19].h;
                                ws0Var10.i(new hr0(eu0Var, ar0Var));
                                ws0Var11 = eu0Var.g0[i19].h;
                                ws0Var11.setOnItemClickListener(new gh.c3(eu0Var, ar0Var, context2, j10, b6Var2, 2));
                                ws0Var12 = eu0Var.g0[i19].h;
                                ws0Var12.setOnScrollListener(new jr0(eu0Var, ar0Var, br0Var));
                                ws0Var13 = eu0Var.g0[i19].h;
                                ws0Var13.setOnItemLongClickListener(new kr0(eu0Var, ar0Var));
                                if (i19 == 0 && i21 != -1) {
                                    br0Var.h1(i21, i20);
                                }
                                ws0Var14 = eu0Var.g0[i19].h;
                                eu0Var.g0[i19].y = new lr0(context2, ws0Var14);
                                eu0Var.g0[i19].y.setVisibility(8);
                                ws0Var15 = eu0Var.g0[i19].h;
                                ws0Var15.D0(eu0Var.g0[i19].y, g7.e6.c(-1.0f, -1));
                                eu0Var.g0[i19].v = new mr0(eu0Var, context2, ar0Var);
                                e00Var = eu0Var.g0[i19].v;
                                e00Var.g();
                                e00Var2 = eu0Var.g0[i19].v;
                                e00Var2.setClipToOutline(true);
                                e00Var3 = eu0Var.g0[i19].v;
                                e00Var3.setOutlineProvider(new nr0());
                                if (i19 == 0) {
                                    eu0Var.g0[i19].setVisibility(8);
                                }
                                xs0 xs0Var6 = eu0Var.g0[i19];
                                e00Var4 = xs0Var6.v;
                                xs0Var6.w = new or0(eu0Var, context2, e00Var4);
                                gw0Var = eu0Var.g0[i19].w;
                                gw0Var.d(8, false);
                                gw0Var2 = eu0Var.g0[i19].w;
                                gw0Var2.setAnimateLayoutChange(true);
                                xs0 xs0Var7 = eu0Var.g0[i19];
                                gw0Var3 = xs0Var7.w;
                                xs0Var7.addView(gw0Var3, g7.e6.c(-1.0f, -1));
                                gw0Var4 = eu0Var.g0[i19].w;
                                gw0Var4.setOnTouchListener(new jh.d(23));
                                gw0Var5 = eu0Var.g0[i19].w;
                                gw0Var5.e(true, false);
                                gw0Var6 = eu0Var.g0[i19].w;
                                gw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                gw0Var7 = eu0Var.g0[i19].w;
                                gw0Var7.f.setVisibility(8);
                                gw0Var8 = eu0Var.g0[i19].w;
                                gw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                gw0Var9 = eu0Var.g0[i19].w;
                                gw0Var9.f.setVisibility(8);
                                gw0Var10 = eu0Var.g0[i19].w;
                                e00Var5 = eu0Var.g0[i19].v;
                                gw0Var10.addView(e00Var5, g7.e6.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                                ws0Var16 = eu0Var.g0[i19].h;
                                gw0Var11 = eu0Var.g0[i19].w;
                                ws0Var16.setEmptyView(gw0Var11);
                                ws0Var17 = eu0Var.g0[i19].h;
                                ws0Var17.m1(0, true);
                                xs0[] xs0VarArr2 = eu0Var.g0;
                                xs0 xs0Var8 = xs0VarArr2[i19];
                                ws0Var18 = xs0VarArr2[i19].h;
                                xs0Var8.A = new c2.y(ws0Var18, eu0Var.g0[i19].x);
                                i19++;
                                b6Var2 = b6Var;
                                i17 = i20;
                                i18 = i21;
                            }
                        }
                        i20 = i17;
                        i21 = i18;
                        ar0 ar0Var2 = new ar0(eu0Var, context2);
                        eu0Var.addView(ar0Var2, g7.e6.d(-1, -1.0f, 51, 0.0f, eu0Var.B0(), 0.0f, 0.0f));
                        if (i19 == 1) {
                        }
                        eu0Var.g0[i19] = ar0Var2;
                        br0Var = new br0(eu0Var, ar0Var2);
                        ar0Var2.x = br0Var;
                        br0Var.z1(new cr0(eu0Var, ar0Var2));
                        eu0Var.g0[i19].d = new f2.n();
                        eu0Var.g0[i19].d.n(280L);
                        eu0Var.g0[i19].d.o(gr.h);
                        xs0 xs0Var22 = eu0Var.g0[i19];
                        xs0Var22.d.m = false;
                        xs0Var22.h = new dr0(eu0Var, context2, ar0Var2, br0Var);
                        ws0Var = eu0Var.g0[i19].h;
                        ws0Var.setFastScrollEnabled(1);
                        ws0Var2 = eu0Var.g0[i19].h;
                        ws0Var2.setScrollingTouchSlop(1);
                        ws0Var3 = eu0Var.g0[i19].h;
                        ws0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(f10));
                        ws0Var4 = eu0Var.g0[i19].h;
                        ws0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                        ws0Var5 = eu0Var.g0[i19].h;
                        ws0Var5.setItemAnimator(r10);
                        ws0Var6 = eu0Var.g0[i19].h;
                        ws0Var6.setClipToPadding(false);
                        ws0Var7 = eu0Var.g0[i19].h;
                        ws0Var7.setSectionsType(2);
                        ws0Var8 = eu0Var.g0[i19].h;
                        ws0Var8.setLayoutManager(br0Var);
                        xs0 xs0Var32 = eu0Var.g0[i19];
                        ws0Var9 = xs0Var32.h;
                        xs0Var32.addView(ws0Var9, g7.e6.c(-1.0f, -1));
                        eu0Var.g0[i19].r = new ws0(context2, r10);
                        xs0 xs0Var42 = eu0Var.g0[i19];
                        ws0 ws0Var202 = xs0Var42.r;
                        fr0 fr0Var2 = new fr0(eu0Var);
                        xs0Var42.s = fr0Var2;
                        ws0Var202.setLayoutManager(fr0Var2);
                        xs0 xs0Var52 = eu0Var.g0[i19];
                        xs0Var52.addView(xs0Var52.r, g7.e6.c(-1.0f, -1));
                        eu0Var.g0[i19].r.setVisibility(8);
                        eu0Var.g0[i19].r.i(new gr0(ar0Var2));
                        ws0Var10 = eu0Var.g0[i19].h;
                        ws0Var10.i(new hr0(eu0Var, ar0Var2));
                        ws0Var11 = eu0Var.g0[i19].h;
                        ws0Var11.setOnItemClickListener(new gh.c3(eu0Var, ar0Var2, context2, j10, b6Var2, 2));
                        ws0Var12 = eu0Var.g0[i19].h;
                        ws0Var12.setOnScrollListener(new jr0(eu0Var, ar0Var2, br0Var));
                        ws0Var13 = eu0Var.g0[i19].h;
                        ws0Var13.setOnItemLongClickListener(new kr0(eu0Var, ar0Var2));
                        if (i19 == 0) {
                            br0Var.h1(i21, i20);
                        }
                        ws0Var14 = eu0Var.g0[i19].h;
                        eu0Var.g0[i19].y = new lr0(context2, ws0Var14);
                        eu0Var.g0[i19].y.setVisibility(8);
                        ws0Var15 = eu0Var.g0[i19].h;
                        ws0Var15.D0(eu0Var.g0[i19].y, g7.e6.c(-1.0f, -1));
                        eu0Var.g0[i19].v = new mr0(eu0Var, context2, ar0Var2);
                        e00Var = eu0Var.g0[i19].v;
                        e00Var.g();
                        e00Var2 = eu0Var.g0[i19].v;
                        e00Var2.setClipToOutline(true);
                        e00Var3 = eu0Var.g0[i19].v;
                        e00Var3.setOutlineProvider(new nr0());
                        if (i19 == 0) {
                        }
                        xs0 xs0Var62 = eu0Var.g0[i19];
                        e00Var4 = xs0Var62.v;
                        xs0Var62.w = new or0(eu0Var, context2, e00Var4);
                        gw0Var = eu0Var.g0[i19].w;
                        gw0Var.d(8, false);
                        gw0Var2 = eu0Var.g0[i19].w;
                        gw0Var2.setAnimateLayoutChange(true);
                        xs0 xs0Var72 = eu0Var.g0[i19];
                        gw0Var3 = xs0Var72.w;
                        xs0Var72.addView(gw0Var3, g7.e6.c(-1.0f, -1));
                        gw0Var4 = eu0Var.g0[i19].w;
                        gw0Var4.setOnTouchListener(new jh.d(23));
                        gw0Var5 = eu0Var.g0[i19].w;
                        gw0Var5.e(true, false);
                        gw0Var6 = eu0Var.g0[i19].w;
                        gw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                        gw0Var7 = eu0Var.g0[i19].w;
                        gw0Var7.f.setVisibility(8);
                        gw0Var8 = eu0Var.g0[i19].w;
                        gw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        gw0Var9 = eu0Var.g0[i19].w;
                        gw0Var9.f.setVisibility(8);
                        gw0Var10 = eu0Var.g0[i19].w;
                        e00Var5 = eu0Var.g0[i19].v;
                        gw0Var10.addView(e00Var5, g7.e6.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                        ws0Var16 = eu0Var.g0[i19].h;
                        gw0Var11 = eu0Var.g0[i19].w;
                        ws0Var16.setEmptyView(gw0Var11);
                        ws0Var17 = eu0Var.g0[i19].h;
                        ws0Var17.m1(0, true);
                        xs0[] xs0VarArr22 = eu0Var.g0;
                        xs0 xs0Var82 = xs0VarArr22[i19];
                        ws0Var18 = xs0VarArr22[i19].h;
                        xs0Var82.A = new c2.y(ws0Var18, eu0Var.g0[i19].x);
                        i19++;
                        b6Var2 = b6Var;
                        i17 = i20;
                        i18 = i21;
                    }
                    view = eu0Var.S;
                    if (view != null) {
                        eu0Var.addView(view, g7.e6.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
                    }
                    org.telegram.ui.Cells.w0 w0Var7 = new org.telegram.ui.Cells.w0(context2);
                    eu0Var.G0 = w0Var7;
                    w0Var7.S((int) (System.currentTimeMillis() / 1000), false, false);
                    w0Var7.setAlpha(0.0f);
                    w0Var7.U(org.telegram.ui.ActionBar.f6.wc, org.telegram.ui.ActionBar.f6.kd);
                    w0Var7.setTranslationY(-AndroidUtilities.dp(48.0f));
                    eu0Var.addView(w0Var7, g7.e6.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                    N = eu0Var.N();
                    eu0Var2 = eu0Var;
                    if (!N) {
                        bs bsVar2 = new bs(context2);
                        eu0Var.L0 = bsVar2;
                        bsVar2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
                        kg.d b10 = aVar2.b(bsVar2, mg.c.m(b6Var));
                        b10.p(AndroidUtilities.dp(24.0f));
                        b10.o(AndroidUtilities.dp(7.0f));
                        bsVar2.setBlurredBackground(b10);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        eu0Var.M0 = frameLayout;
                        bsVar2.addView(frameLayout);
                        bsVar2.i(frameLayout, true, false);
                        bsVar2.setOnAnimatedHeightChangedListener(new aq0(eu0Var, 0));
                        qr0 qr0Var = new qr0(eu0Var, context2, o2Var, this, b6Var);
                        eu0Var.N0 = qr0Var;
                        frameLayout.addView(qr0Var);
                        bsVar2.setCallFragmentContextView(qr0Var);
                        eu0Var.addView(bsVar2, g7.e6.d(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
                        qr0Var.setDelegate(new bq0(eu0Var));
                        kg.d b11 = aVar2.b(eu0Var.E0, mg.c.m(b6Var));
                        b11.p(AndroidUtilities.dp(18.0f));
                        b11.o(AndroidUtilities.dp(6.666f));
                        eu0Var.E0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                        eu0Var.E0.setClipToPadding(false);
                        eu0Var.E0.setBackground(r10);
                        eu0Var.E0.setBlurredBackground(b11);
                        eu0Var.E0.setOpen(false);
                        eu0Var.addView(eu0Var.E0, g7.e6.d(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
                        Context context3 = eu0Var.getContext();
                        org.telegram.ui.ActionBar.o2 o2Var4 = eu0Var.r1;
                        eu0 eu0Var5 = eu0Var;
                        rr0 rr0Var3 = new rr0(o2Var4.getCurrentAccount(), eu0Var.l0() ? 0L : eu0Var.f1, context3, o2Var4, b6Var, eu0Var5);
                        eu0 eu0Var6 = eu0Var5;
                        eu0Var6.F0 = rr0Var3;
                        rr0Var3.d(aVar2, mg.c.m(b6Var));
                        rr0Var3.setShown(0.0f);
                        eu0Var6.addView(rr0Var3, g7.e6.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                        eu0Var6.addView(eu0Var6.x0, g7.e6.e(-1, 48, 51));
                        eu0Var2 = eu0Var6;
                    }
                    eu0Var2.v1(false);
                    eu0Var2.m1(false);
                    if (eu0Var2.T0[0] >= 0) {
                        eu0Var2.z0(false);
                    }
                    zq0Var = eu0Var2.S;
                    if (zq0Var != null && i11 > 0) {
                        zq0Var.setInitialTabId(i11);
                    }
                    eu0Var2.Y1 = new ah(eu0Var2, 2);
                }
                b6Var2 = b6Var;
                r10 = 0;
                eu0Var = eu0Var3;
                eu0Var.setWillNotDraw(false);
                i17 = 0;
                i18 = -1;
                i19 = 0;
                while (true) {
                    xs0VarArr = eu0Var.g0;
                    if (i19 >= xs0VarArr.length) {
                    }
                    xs0 xs0Var622 = eu0Var.g0[i19];
                    e00Var4 = xs0Var622.v;
                    xs0Var622.w = new or0(eu0Var, context2, e00Var4);
                    gw0Var = eu0Var.g0[i19].w;
                    gw0Var.d(8, false);
                    gw0Var2 = eu0Var.g0[i19].w;
                    gw0Var2.setAnimateLayoutChange(true);
                    xs0 xs0Var722 = eu0Var.g0[i19];
                    gw0Var3 = xs0Var722.w;
                    xs0Var722.addView(gw0Var3, g7.e6.c(-1.0f, -1));
                    gw0Var4 = eu0Var.g0[i19].w;
                    gw0Var4.setOnTouchListener(new jh.d(23));
                    gw0Var5 = eu0Var.g0[i19].w;
                    gw0Var5.e(true, false);
                    gw0Var6 = eu0Var.g0[i19].w;
                    gw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                    gw0Var7 = eu0Var.g0[i19].w;
                    gw0Var7.f.setVisibility(8);
                    gw0Var8 = eu0Var.g0[i19].w;
                    gw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    gw0Var9 = eu0Var.g0[i19].w;
                    gw0Var9.f.setVisibility(8);
                    gw0Var10 = eu0Var.g0[i19].w;
                    e00Var5 = eu0Var.g0[i19].v;
                    gw0Var10.addView(e00Var5, g7.e6.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                    ws0Var16 = eu0Var.g0[i19].h;
                    gw0Var11 = eu0Var.g0[i19].w;
                    ws0Var16.setEmptyView(gw0Var11);
                    ws0Var17 = eu0Var.g0[i19].h;
                    ws0Var17.m1(0, true);
                    xs0[] xs0VarArr222 = eu0Var.g0;
                    xs0 xs0Var822 = xs0VarArr222[i19];
                    ws0Var18 = xs0VarArr222[i19].h;
                    xs0Var822.A = new c2.y(ws0Var18, eu0Var.g0[i19].x);
                    i19++;
                    b6Var2 = b6Var;
                    i17 = i20;
                    i18 = i21;
                }
                view = eu0Var.S;
                if (view != null) {
                }
                org.telegram.ui.Cells.w0 w0Var72 = new org.telegram.ui.Cells.w0(context2);
                eu0Var.G0 = w0Var72;
                w0Var72.S((int) (System.currentTimeMillis() / 1000), false, false);
                w0Var72.setAlpha(0.0f);
                w0Var72.U(org.telegram.ui.ActionBar.f6.wc, org.telegram.ui.ActionBar.f6.kd);
                w0Var72.setTranslationY(-AndroidUtilities.dp(48.0f));
                eu0Var.addView(w0Var72, g7.e6.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                N = eu0Var.N();
                eu0Var2 = eu0Var;
                if (!N) {
                }
                eu0Var2.v1(false);
                eu0Var2.m1(false);
                if (eu0Var2.T0[0] >= 0) {
                }
                zq0Var = eu0Var2.S;
                if (zq0Var != null) {
                    zq0Var.setInitialTabId(i11);
                }
                eu0Var2.Y1 = new ah(eu0Var2, 2);
            }
            profileTab = chatFull2.main_tab;
        }
        c10 = 5;
        if (i10 != 14) {
        }
        eu0Var3.U0 = i10;
        eu0Var3.M0(i10);
        eu0Var3.Z0 = chatFull2;
        eu0Var3.a1 = userFull;
        if (chatFull2 != null) {
        }
        eu0Var3.f1 = j10;
        i13 = 0;
        while (true) {
            tt0VarArr = eu0Var3.p1;
            if (i13 < tt0VarArr.length) {
            }
            i13++;
        }
        eu0Var3.r1 = o2Var;
        eu0Var3.C = o2Var.getActionBar();
        eu0Var3.i1[0] = eu0Var3.S0() > 0 ? SharedConfig.mediaColumnsCount : eu0Var3.S0();
        eu0Var3.i1[1] = eu0Var3.S0() > 0 ? SharedConfig.storiesColumnsCount : eu0Var3.S0();
        eu0Var3.C1 = o2Var.getNotificationCenter().createObserversGroup(eu0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
        while (i14 < 10) {
        }
        eu0Var3.O0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        eu0Var3.R0 = false;
        eu0Var3.S0 = null;
        rr0Var = eu0Var3.F0;
        if (rr0Var != null) {
        }
        eu0Var3.Q0 = false;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        eu0Var3.u0 = drawable2;
        drawable2.setColorFilter(new PorterDuffColorFilter(eu0Var3.h0(org.telegram.ui.ActionBar.f6.b7), PorterDuff.Mode.MULTIPLY));
        ur0 ur0Var3 = eu0Var3.E0;
        if (ur0Var3 == null) {
        }
        ur0 ur0Var22 = new ur0(eu0Var3, context, eu0Var3.B1);
        i15 = eu0Var3.U0;
        if (i15 != -1) {
        }
        ur0Var22.U = 320L;
        int i312 = org.telegram.ui.ActionBar.f6.Fh;
        int i322 = org.telegram.ui.ActionBar.f6.Eh;
        ur0Var22.H = i312;
        ur0Var22.I = i322;
        ur0Var22.d();
        ur0Var22.setUseMinimalWidth(true);
        ur0Var22.setDelegate(new wr0(eu0Var3));
        eu0Var3.E0 = ur0Var22;
        while (i16 >= 0) {
        }
        eu0Var3.W0 = 0;
        eu0Var3.J0.clear();
        ot0Var = eu0Var3.N;
        if (ot0Var != null) {
        }
        if (!(eu0Var3 instanceof i30)) {
        }
        ImageView imageView3 = new ImageView(context);
        eu0Var3.n0 = imageView3;
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        imageView3.setTranslationY(AndroidUtilities.dp(10.0f));
        imageView3.setVisibility(4);
        if (eu0Var3.q0()) {
        }
        f10 = 2.0f;
        context2 = context;
        imageView3.setOnClickListener(new is0(eu0Var3, j10, b6Var, context));
        w0Var = eu0Var3.j0;
        if (w0Var != null) {
        }
        eu0Var3.t0 = 0;
        org.telegram.ui.ActionBar.o2 o2Var22 = eu0Var3.r1;
        if (o2Var22 == null) {
        }
        z9 z9Var2 = new z9(context2, xu0Var);
        eu0Var3.x0 = z9Var2;
        z9Var2.setBackgroundColor(eu0Var3.h0(org.telegram.ui.ActionBar.f6.a7));
        z9Var2.setAlpha(0.0f);
        z9Var2.setClickable(true);
        z9Var2.setVisibility(4);
        ImageView imageView22 = new ImageView(context2);
        eu0Var3.y0 = imageView22;
        imageView22.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.h2 h2Var2 = new org.telegram.ui.ActionBar.h2(true);
        eu0Var3.z0 = h2Var2;
        imageView22.setImageDrawable(h2Var2);
        int i342 = org.telegram.ui.ActionBar.f6.y8;
        h2Var2.a(eu0Var3.h0(i342));
        int i352 = org.telegram.ui.ActionBar.f6.z8;
        imageView22.setBackground(org.telegram.ui.ActionBar.f6.e0(eu0Var3.h0(i352), 1));
        imageView22.setContentDescription(LocaleController.getString("Close", R.string.Close));
        z9Var2.addView(imageView22, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        eu0Var3.J0.add(imageView22);
        imageView22.setOnClickListener(new cq0(eu0Var3, 0));
        NumberTextView numberTextView2 = new NumberTextView(context2);
        eu0Var3.w0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(AndroidUtilities.bold());
        numberTextView2.setTextColor(eu0Var3.h0(i342));
        z9Var2.addView(numberTextView2, g7.e6.m(1.0f, 0, -1, 18, 0, 0));
        eu0Var3.J0.add(numberTextView2);
        if (!DialogObject.isEncryptedDialog(eu0Var3.f1)) {
        }
        org.telegram.ui.ActionBar.w0 w0Var62 = new org.telegram.ui.ActionBar.w0(context2, eu0Var3.h0(i352), eu0Var3.h0(i342), false);
        eu0Var3.h0 = w0Var62;
        w0Var62.setIcon(R.drawable.msg_delete);
        w0Var62.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        w0Var62.setDuplicateParentStateEnabled(false);
        z9Var2.addView(w0Var62, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        eu0Var3.J0.add(w0Var62);
        w0Var62.setOnClickListener(new cq0(eu0Var3, 5));
        eu0Var3.D = new js0(eu0Var3, context2);
        eu0Var3.E = new yt0(eu0Var3, context2);
        eu0Var3.G = new rt0(eu0Var3, context2, 1);
        eu0Var3.H = new rt0(eu0Var3, context2, 2);
        eu0Var3.I = new rt0(eu0Var3, context2, 4);
        eu0Var3.J = new lt0(eu0Var3, context2, eu0Var3.r1.getCurrentAccount(), eu0Var3.r1.getResourceProvider());
        eu0Var3.K = new ss0(eu0Var3, context2);
        eu0Var3.c0 = new at0(eu0Var3, context2, 1);
        eu0Var3.d0 = new at0(eu0Var3, context2, 4);
        eu0Var3.e0 = new at0(eu0Var3, context2, 3);
        eu0Var3.f0 = new vs0(eu0Var3, context2);
        eu0Var3.L = new ps0(eu0Var3, context2);
        eu0Var3.M = new ns0(eu0Var3, context2);
        eu0Var3.N = new ot0(eu0Var3, context2);
        eu0Var3.O = new pt0(eu0Var3, context2);
        if (!eu0Var3.v0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", eu0Var3.r1.getUserConfig().getClientUserId());
            bundle2.putInt("chatMode", 3);
            ks0 ks0Var2 = new ks0(eu0Var3, context2, eu0Var3.r1.getParentLayout(), bundle2);
            eu0Var3.P = ks0Var2;
            long j122 = eu0Var3.f1;
            org.telegram.ui.rn rnVar2 = ks0Var2.a;
            rnVar2.Z3 = j122;
            rnVar2.La = true;
            ks0Var2.setClipToOutline(true);
            ks0Var2.setOutlineProvider(new ls0());
        }
        os0 os0Var2 = new os0(eu0Var3, context2);
        eu0Var3.T = os0Var2;
        if (eu0Var3.B == 0) {
        }
        eu0Var3.V = new ms0(eu0Var3, context2);
        eu0Var3.U = new f2.h0(new sq0(eu0Var3));
        eu0Var3.W = new bu0(eu0Var3, context2, false);
        eu0Var3.a0 = new tq0(eu0Var3, context2);
        eu0Var3.b0 = new bu0(eu0Var3, context2, true);
        eu0Var3.F = new st0(eu0Var3, context2);
        if (!eu0Var3.r0()) {
        }
        b6Var2 = b6Var;
        r10 = 0;
        eu0Var = eu0Var3;
        eu0Var.setWillNotDraw(false);
        i17 = 0;
        i18 = -1;
        i19 = 0;
        while (true) {
            xs0VarArr = eu0Var.g0;
            if (i19 >= xs0VarArr.length) {
            }
            xs0 xs0Var6222 = eu0Var.g0[i19];
            e00Var4 = xs0Var6222.v;
            xs0Var6222.w = new or0(eu0Var, context2, e00Var4);
            gw0Var = eu0Var.g0[i19].w;
            gw0Var.d(8, false);
            gw0Var2 = eu0Var.g0[i19].w;
            gw0Var2.setAnimateLayoutChange(true);
            xs0 xs0Var7222 = eu0Var.g0[i19];
            gw0Var3 = xs0Var7222.w;
            xs0Var7222.addView(gw0Var3, g7.e6.c(-1.0f, -1));
            gw0Var4 = eu0Var.g0[i19].w;
            gw0Var4.setOnTouchListener(new jh.d(23));
            gw0Var5 = eu0Var.g0[i19].w;
            gw0Var5.e(true, false);
            gw0Var6 = eu0Var.g0[i19].w;
            gw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
            gw0Var7 = eu0Var.g0[i19].w;
            gw0Var7.f.setVisibility(8);
            gw0Var8 = eu0Var.g0[i19].w;
            gw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            gw0Var9 = eu0Var.g0[i19].w;
            gw0Var9.f.setVisibility(8);
            gw0Var10 = eu0Var.g0[i19].w;
            e00Var5 = eu0Var.g0[i19].v;
            gw0Var10.addView(e00Var5, g7.e6.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
            ws0Var16 = eu0Var.g0[i19].h;
            gw0Var11 = eu0Var.g0[i19].w;
            ws0Var16.setEmptyView(gw0Var11);
            ws0Var17 = eu0Var.g0[i19].h;
            ws0Var17.m1(0, true);
            xs0[] xs0VarArr2222 = eu0Var.g0;
            xs0 xs0Var8222 = xs0VarArr2222[i19];
            ws0Var18 = xs0VarArr2222[i19].h;
            xs0Var8222.A = new c2.y(ws0Var18, eu0Var.g0[i19].x);
            i19++;
            b6Var2 = b6Var;
            i17 = i20;
            i18 = i21;
        }
        view = eu0Var.S;
        if (view != null) {
        }
        org.telegram.ui.Cells.w0 w0Var722 = new org.telegram.ui.Cells.w0(context2);
        eu0Var.G0 = w0Var722;
        w0Var722.S((int) (System.currentTimeMillis() / 1000), false, false);
        w0Var722.setAlpha(0.0f);
        w0Var722.U(org.telegram.ui.ActionBar.f6.wc, org.telegram.ui.ActionBar.f6.kd);
        w0Var722.setTranslationY(-AndroidUtilities.dp(48.0f));
        eu0Var.addView(w0Var722, g7.e6.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        N = eu0Var.N();
        eu0Var2 = eu0Var;
        if (!N) {
        }
        eu0Var2.v1(false);
        eu0Var2.m1(false);
        if (eu0Var2.T0[0] >= 0) {
        }
        zq0Var = eu0Var2.S;
        if (zq0Var != null) {
        }
        eu0Var2.Y1 = new ah(eu0Var2, 2);
    }

    public static rs0 M(int i9, long j10, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        rs0 rs0Var = new rs0(context, b6Var);
        TextView textView = rs0Var.a;
        if (i9 == 0) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return rs0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return rs0Var;
        }
        if (i9 == 1) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return rs0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return rs0Var;
        }
        if (i9 == 2) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return rs0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return rs0Var;
        }
        if (i9 == 3) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return rs0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return rs0Var;
        }
        if (i9 == 4) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return rs0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return rs0Var;
        }
        if (i9 == 5) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return rs0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return rs0Var;
        }
        ImageView imageView = rs0Var.b;
        if (i9 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
            return rs0Var;
        }
        if (i9 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return rs0Var;
    }

    public static TLRPC.ProfileTab d0(int i9, boolean z10) {
        if (i9 != 8 && i9 != 14 && !z10) {
            return null;
        }
        if (i9 == 0) {
            return new TLRPC.TL_profileTabMedia();
        }
        if (i9 == 1) {
            return new TLRPC.TL_profileTabFiles();
        }
        if (i9 == 2) {
            return new TLRPC.TL_profileTabVoice();
        }
        if (i9 == 3) {
            return new TLRPC.TL_profileTabLinks();
        }
        if (i9 == 4) {
            return new TLRPC.TL_profileTabMusic();
        }
        if (i9 == 5) {
            return new TLRPC.TL_profileTabGifs();
        }
        if (i9 == 8) {
            return new TLRPC.TL_profileTabPosts();
        }
        if (i9 != 14) {
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

    public static void g(eu0 eu0Var, int i9, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.rl rlVar = new org.telegram.ui.rl(eu0Var, i9, storyItem, 11);
        ih.v6 storiesController = eu0Var.getStoriesController();
        long j10 = eu0Var.f1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i9, j10, arrayList);
        oc.a0(eu0Var.r1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), rlVar).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ih.v6 getStoriesController() {
        return MessagesController.getInstance(this.r1.getCurrentAccount()).getStoriesController();
    }

    public static /* synthetic */ void h(eu0 eu0Var, TL_stories.StoryItem storyItem) {
        eu0Var.getStoriesController().o0(eu0Var.f1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        oc.a0(eu0Var.r1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(eu0 eu0Var, long j10, int i9, String str) {
        ih.j6 B = eu0Var.getStoriesController().B(j10, true);
        int i10 = B.a;
        int c10 = B.c(i9);
        if (c10 == -1) {
            return;
        }
        ((ih.o6) B.h.get(c10)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i10).getInputPeer(B.b);
        tL_updateAlbum.album_id = i9;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(eu0 eu0Var, TL_stories.StoryItem storyItem, ih.o6 o6Var) {
        eu0Var.getStoriesController().c(o6Var.a, eu0Var.f1, storyItem);
        AndroidUtilities.runOnUIThread(new jg0(13, eu0Var, o6Var), 100L);
    }

    public static void m(eu0 eu0Var, HashSet hashSet, TL_stories.StoryItem storyItem, x60 x60Var, ih.o6 o6Var) {
        String formatString;
        long j10 = eu0Var.f1;
        if (hashSet.contains(Integer.valueOf(o6Var.a))) {
            eu0Var.getStoriesController().c(o6Var.a, j10, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, o6Var.b);
        } else {
            ih.v6 storiesController = eu0Var.getStoriesController();
            int i9 = o6Var.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i9, j10, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, o6Var.b);
        }
        oc.a0(eu0Var.r1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        x60Var.u();
    }

    public static void n(eu0 eu0Var, long j10, int i9) {
        ih.j6 B = eu0Var.getStoriesController().B(j10, true);
        int i10 = B.a;
        int c10 = B.c(i9);
        if (c10 == -1) {
            return;
        }
        ih.o6 o6Var = (ih.o6) B.h.remove(c10);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i10).getInputPeer(B.b);
        tL_deleteAlbum.album_id = o6Var.a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int p(View view) {
        if (view instanceof org.telegram.ui.Cells.r7) {
            return ((org.telegram.ui.Cells.r7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            return ((org.telegram.ui.Cells.i7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            return ((org.telegram.ui.Cells.h7) view).getMessage().getId();
        }
        return 0;
    }

    public static boolean p0(int i9) {
        return i9 == 8 || i9 == 9 || w0(i9);
    }

    public static void q(xs0 xs0Var, tt0[] tt0VarArr, boolean z10) {
        jg0 jg0Var;
        if (!z10) {
            if (xs0Var.C == null || (jg0Var = xs0Var.D) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(jg0Var);
            xs0Var.D.run();
            xs0Var.D = null;
            xs0Var.C = null;
            return;
        }
        if (SharedConfig.fastScrollHintCount <= 0 || xs0Var.C != null || xs0Var.E || xs0Var.h.getFastScroll() == null || !xs0Var.h.getFastScroll().T || xs0Var.h.getFastScroll().getVisibility() != 0 || tt0VarArr[0].e() < 50) {
            return;
        }
        SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
        xs0Var.E = true;
        Context context = xs0Var.getContext();
        yp0 yp0Var = new yp0(context);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        int i9 = org.telegram.ui.ActionBar.f6.pf;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        yp0Var.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.qf, false)));
        yp0Var.addView(textView, g7.e6.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        xp0 xp0Var = new xp0(context);
        xp0Var.a = new Random();
        Paint paint = new Paint(1);
        xp0Var.b = paint;
        Paint paint2 = new Paint(1);
        xp0Var.c = paint2;
        xp0Var.f = 1.0f;
        xp0Var.h = 0.0f;
        paint.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i9, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        Paint paint3 = new Paint();
        xp0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        xp0Var.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        yp0Var.addView(xp0Var, g7.e6.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        xs0Var.C = yp0Var;
        xs0Var.addView(yp0Var, g7.e6.c(-2.0f, -2));
        xs0Var.C.setAlpha(0.0f);
        xs0Var.C.setScaleX(0.8f);
        xs0Var.C.setScaleY(0.8f);
        xs0Var.C.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        xs0Var.invalidate();
        jg0 jg0Var2 = new jg0(12, xs0Var, yp0Var);
        xs0Var.D = jg0Var2;
        AndroidUtilities.runOnUIThread(jg0Var2, 4000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(eu0 eu0Var) {
        eu0 eu0Var2;
        ArrayList arrayList;
        int i9;
        int i10;
        Bitmap bitmap;
        long j10 = eu0Var.f1;
        tt0[] tt0VarArr = eu0Var.p1;
        xs0 W = eu0Var.W(0);
        if (W != null && W.getMeasuredHeight() > 0 && W.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(W.getMeasuredWidth(), W.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e10) {
                FileLog.e(e10);
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                eu0Var.D1 = true;
                W.h.draw(new Canvas(bitmap2));
                View view = new View(W.getContext());
                view.setBackground(new BitmapDrawable(bitmap2));
                W.addView(view);
                eu0Var2 = eu0Var;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new of.h0((FrameLayout) eu0Var2, view, (View) W, (Object) bitmap2, 2)).start();
                W.h.setAlpha(0.0f);
                W.h.animate().alpha(1.0f).setUpdateListener(new q60(W, 20)).setDuration(200L).start();
                wt0 wt0Var = eu0Var2.q1;
                int[] iArr = wt0Var.c;
                arrayList = wt0Var.n[0].a;
                tt0 tt0Var = tt0VarArr[0];
                int[] iArr2 = tt0Var.f;
                iArr2[1] = 0;
                i9 = tt0Var.q;
                if (i9 != 0) {
                    iArr2[0] = iArr[0];
                } else if (i9 == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                tt0Var.h = false;
                eu0Var2.y0(0, !DialogObject.isEncryptedDialog(j10) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                eu0Var2.z0(false);
                eu0Var2.z1.Q();
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j10);
                for (i10 = 0; i10 < arrayList.size(); i10++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    tt0 tt0Var2 = tt0VarArr[0];
                    int i11 = tt0Var2.q;
                    if (i11 == 0) {
                        tt0Var2.a(messageObject, 0, false, isEncryptedDialog);
                    } else if (i11 == 1) {
                        if (messageObject.isPhoto()) {
                            tt0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                        }
                    } else if (!messageObject.isPhoto()) {
                        tt0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                    }
                }
            }
        }
        eu0Var2 = eu0Var;
        wt0 wt0Var2 = eu0Var2.q1;
        int[] iArr3 = wt0Var2.c;
        arrayList = wt0Var2.n[0].a;
        tt0 tt0Var3 = tt0VarArr[0];
        int[] iArr22 = tt0Var3.f;
        iArr22[1] = 0;
        i9 = tt0Var3.q;
        if (i9 != 0) {
        }
        tt0Var3.h = false;
        eu0Var2.y0(0, !DialogObject.isEncryptedDialog(j10) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        eu0Var2.z0(false);
        eu0Var2.z1.Q();
        boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j10);
        while (i10 < arrayList.size()) {
        }
    }

    public static void t(eu0 eu0Var, int i9, boolean z10) {
        xs0[] xs0VarArr = eu0Var.g0;
        if (xs0VarArr[0].B == i9) {
            return;
        }
        xs0 xs0Var = xs0VarArr[1];
        xs0Var.B = i9;
        xs0Var.setVisibility(0);
        eu0Var.k0();
        eu0Var.m1(true);
        eu0Var.d1 = z10;
        eu0Var.L0();
        eu0Var.A(!eu0Var.s0(i9), true);
        eu0Var.q1(true);
    }

    public static int u(eu0 eu0Var, f2.r0 r0Var) {
        if (r0Var == eu0Var.V) {
            return 8;
        }
        if (r0Var == eu0Var.a0) {
            return 9;
        }
        for (du0 du0Var : eu0Var.U1.values()) {
            if (du0Var.c == r0Var) {
                return du0Var.a;
            }
        }
        return -1;
    }

    public static int v(eu0 eu0Var, f2.r0 r0Var) {
        if (r0Var == eu0Var.W) {
            return 8;
        }
        if (r0Var == eu0Var.b0) {
            return 9;
        }
        for (du0 du0Var : eu0Var.U1.values()) {
            if (du0Var.d == r0Var) {
                return du0Var.a;
            }
        }
        return -1;
    }

    public static boolean w0(int i9) {
        return (i9 & (-65536)) == 65536;
    }

    public final void A(boolean z10, boolean z11) {
        pi0 pi0Var = this.o0;
        if (pi0Var == null || this.R1 == z10) {
            return;
        }
        this.R1 = z10;
        if (z10 || pi0Var.getAnimatedDrawable().X >= 20) {
            pi0Var.getAnimatedDrawable().N(this.R1 ? 50 : 100);
        } else {
            pi0Var.getAnimatedDrawable().N(0);
        }
        if (z11) {
            pi0Var.getAnimatedDrawable().start();
        } else {
            pi0Var.getAnimatedDrawable().K(pi0Var.getAnimatedDrawable().f);
        }
    }

    public final void A0(int i9) {
        int i10;
        tt0[] tt0VarArr = this.p1;
        if (i9 == 0) {
            int i11 = tt0VarArr[0].q;
            i10 = i11 == 1 ? 6 : i11 == 2 ? 7 : 0;
        } else {
            i10 = i9 == 1 ? 1 : i9 == 2 ? 2 : i9 == 4 ? 4 : i9 == 5 ? 5 : 3;
        }
        tt0VarArr[i9].g = true;
        org.telegram.ui.ActionBar.o2 o2Var = this.r1;
        o2Var.getMediaDataController().loadMedia(this.f1, 50, 0, tt0VarArr[i9].k, i10, this.B, 1, o2Var.getClassGuid(), tt0VarArr[i9].p, null, null);
    }

    public final void B(int i9) {
        int i10;
        xs0 W = W(this.l1);
        this.s = -1;
        if (W != null) {
            W.h.B0();
            this.m1 = i9;
            W.r.setVisibility(0);
            if (p0(this.l1)) {
                W.r.setAdapter(l1(this.l1));
            } else {
                W.r.setAdapter(this.E);
            }
            ws0 ws0Var = W.r;
            int paddingLeft = ws0Var.getPaddingLeft();
            ws0 ws0Var2 = W.r;
            int Z = Z(W.B);
            ws0Var2.Z2 = Z;
            int paddingRight = W.r.getPaddingRight();
            ws0 ws0Var3 = W.r;
            int Y = Y(v0());
            ws0Var3.a3 = Y;
            ws0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.s.y1(i9);
            W.r.a0();
            int i11 = 0;
            while (true) {
                xs0[] xs0VarArr = this.g0;
                if (i11 >= xs0VarArr.length) {
                    break;
                }
                xs0 xs0Var = xs0VarArr[i11];
                if (xs0Var != null && ((i10 = xs0Var.B) == 0 || p0(i10))) {
                    AndroidUtilities.updateVisibleRows(xs0VarArr[i11].h);
                }
                i11++;
            }
            int i12 = 1;
            this.k1 = true;
            if (this.l1 == 0) {
                this.p1[0].g(true);
            }
            this.j1 = 0.0f;
            X0();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E1.lock();
            ofFloat.addUpdateListener(new tr0(this, W, i12));
            ofFloat.addListener(new mh.r2(this, p0(W.B) ? 1 : 0, i9, 2));
            ofFloat.setInterpolator(gr.f);
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

    public final void C0(int i9, View view) {
        boolean z10;
        uq0 uq0Var;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z11;
        TLRPC.User user2;
        int i10 = 8;
        ot0 ot0Var = this.N;
        SparseArray[] sparseArrayArr = this.V0;
        org.telegram.ui.ActionBar.o2 o2Var = this.r1;
        final int i11 = 0;
        if (i9 != 101) {
            if (i9 == 100) {
                if (this.a1 != null && o2Var.getMessagesController().isUserNoForwards(this.a1)) {
                    s30 s30Var = this.A1;
                    if (s30Var != null) {
                        s30Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                        this.A1.f(view, true);
                        return;
                    }
                    return;
                }
                if (this.Z0 != null) {
                    TLRPC.Chat chat2 = o2Var.getMessagesController().getChat(Long.valueOf(this.Z0.id));
                    if (o2Var.getMessagesController().isChatNoForwards(chat2)) {
                        s30 s30Var2 = this.A1;
                        if (s30Var2 != null) {
                            s30Var2.setText((!ChatObject.isChannel(chat2) || chat2.megagroup) ? LocaleController.getString(R.string.ForwardsRestrictedInfoGroup) : LocaleController.getString(R.string.ForwardsRestrictedInfoChannel));
                            this.A1.f(view, true);
                            return;
                        }
                        return;
                    }
                }
                if (j0()) {
                    s30 s30Var3 = this.A1;
                    if (s30Var3 != null) {
                        s30Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                        this.A1.f(view, true);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("canSelectTopics", true);
                bundle.putInt("dialogsType", 3);
                org.telegram.ui.dy dyVar = new org.telegram.ui.dy(bundle);
                dyVar.y2 = new bq0(this);
                o2Var.presentFragment(dyVar);
                return;
            }
            if (i9 == 102) {
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
                org.telegram.ui.qn qnVar = new org.telegram.ui.qn(bundle2);
                qnVar.H7 = messageObject.getId();
                long j10 = this.B;
                if (j10 != 0) {
                    vf.c.a(qnVar, MessagesStorage.TopicKey.of(dialogId, j10));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                o2Var.presentFragment(qnVar, false);
                return;
            }
            if (i9 == 103 || i9 == 104) {
                if (getClosestTab() == 8) {
                    ms0 ms0Var = this.V;
                    if (ms0Var == null || ms0Var.s == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < sparseArrayArr[0].size(); i12++) {
                        arrayList.add(Integer.valueOf(((MessageObject) sparseArrayArr[0].valueAt(i12)).getId()));
                    }
                    T0(arrayList, i9 == 103);
                    L(false);
                    return;
                }
                SavedMessagesController savedMessagesController = o2Var.getMessagesController().getSavedMessagesController();
                ArrayList<Long> arrayList2 = new ArrayList<>();
                for (int i13 = 0; i13 < savedMessagesController.allDialogs.size(); i13++) {
                    long j11 = savedMessagesController.allDialogs.get(i13).dialogId;
                    if (ot0Var.w.contains(Long.valueOf(j11))) {
                        arrayList2.add(Long.valueOf(j11));
                    }
                }
                if (savedMessagesController.updatePinned(arrayList2, i9 == 103, true)) {
                    z10 = true;
                    int i14 = 0;
                    while (true) {
                        xs0[] xs0VarArr = this.g0;
                        if (i14 >= xs0VarArr.length) {
                            break;
                        }
                        xs0 xs0Var = xs0VarArr[i14];
                        if (xs0Var.B == 11) {
                            xs0Var.x.h1(0, 0);
                            break;
                        }
                        i14++;
                    }
                } else {
                    z10 = true;
                    o2Var.showDialog(new zf.j0(33, o2Var.getCurrentAccount(), getContext(), o2Var, null));
                }
                L(z10);
                return;
            }
            return;
        }
        boolean p02 = p0(getSelectedTab());
        org.telegram.ui.ActionBar.b6 b6Var = this.B1;
        if (p02 || getSelectedTab() == 13) {
            if (sparseArrayArr[0] != null) {
                if (!r0() || (uq0Var = this.Q) == null || uq0Var.getCurrentList() == null) {
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
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, b6Var);
                    String string = LocaleController.getString(arrayList3.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.N = string;
                    c2Var.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.Components.iq0
                        public final /* synthetic */ eu0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.b2
                        public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i16) {
                            switch (i11) {
                                case 0:
                                    eu0 eu0Var = this.b;
                                    org.telegram.ui.ActionBar.o2 o2Var2 = eu0Var.r1;
                                    ih.v6 storiesController = o2Var2.getMessagesController().getStoriesController();
                                    long j12 = eu0Var.f1;
                                    ArrayList arrayList4 = arrayList3;
                                    storiesController.s(j12, arrayList4);
                                    oc.a0(o2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList4.size(), new Object[0])).j();
                                    eu0Var.L(false);
                                    break;
                                default:
                                    eu0 eu0Var2 = this.b;
                                    eu0Var2.getClass();
                                    int i17 = 0;
                                    while (true) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (i17 >= arrayList5.size()) {
                                            eu0Var2.L(true);
                                            break;
                                        } else {
                                            eu0Var2.r1.getMessagesController().deleteSavedDialog(((Long) arrayList5.get(i17)).longValue());
                                            i17++;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new if0(i10));
                    c2Var.show();
                    c2Var.h();
                    return;
                }
                ih.f6 currentList = uq0Var.getCurrentList();
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
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, b6Var);
                String string2 = LocaleController.getString(arrayList4.size() > 1 ? R.string.DeleteBotPreviewsTitle : R.string.DeleteBotPreviewTitle);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                c2Var2.N = string2;
                c2Var2.P = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList4.size(), new Object[0]);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new hq0(this, currentList, arrayList4, i11));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new if0(7));
                c2Var2.show();
                c2Var2.h();
                return;
            }
            return;
        }
        if (getSelectedTab() != 11) {
            long j12 = this.f1;
            if (DialogObject.isEncryptedDialog(j12)) {
                encryptedChat = org.telegram.messenger.l0.l(o2Var.getMessagesController(), j12);
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
            y4.z(o2Var, user, chat, encryptedChat, null, this.Y0, null, this.V0, null, 0, 0, null, new aq0(this, r10 ? 1 : 0), null, this.B1);
            return;
        }
        SavedMessagesController savedMessagesController2 = o2Var.getMessagesController().getSavedMessagesController();
        final ArrayList arrayList5 = new ArrayList();
        for (int i17 = 0; i17 < savedMessagesController2.allDialogs.size(); i17++) {
            long j13 = savedMessagesController2.allDialogs.get(i17).dialogId;
            if (ot0Var.w.contains(Long.valueOf(j13))) {
                arrayList5.add(Long.valueOf(j13));
            }
        }
        String str = "";
        if (arrayList5.isEmpty()) {
            z11 = false;
        } else {
            Long l10 = (Long) arrayList5.get(0);
            long longValue = l10.longValue();
            z11 = longValue == o2Var.getUserConfig().getClientUserId();
            if (longValue < 0) {
                TLRPC.Chat chat4 = o2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat4 != null) {
                    str = chat4.title;
                }
            } else if (longValue >= 0 && (user2 = o2Var.getMessagesController().getUser(l10)) != null) {
                str = UserObject.isAnonymous(user2) ? LocaleController.getString(R.string.AnonymousForward) : UserObject.getUserName(user2);
            }
        }
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, b6Var);
        String formatString = arrayList5.size() == 1 ? LocaleController.formatString(z11 ? R.string.ClearHistoryMyNotesTitle : R.string.ClearHistoryTitleSingle2, str) : LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList5.size(), new Object[0]);
        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
        c2Var3.N = formatString;
        c2Var3.P = arrayList5.size() == 1 ? LocaleController.formatString(z11 ? R.string.ClearHistoryMyNotesMessage : R.string.ClearHistoryMessageSingle, str) : LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList5.size(), new Object[0]);
        String string3 = LocaleController.getString(R.string.Remove);
        final int i18 = r10 ? 1 : 0;
        alertDialog$Builder3.k(string3, new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.Components.iq0
            public final /* synthetic */ eu0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void f(org.telegram.ui.ActionBar.c2 c2Var22, int i162) {
                switch (i18) {
                    case 0:
                        eu0 eu0Var = this.b;
                        org.telegram.ui.ActionBar.o2 o2Var2 = eu0Var.r1;
                        ih.v6 storiesController = o2Var2.getMessagesController().getStoriesController();
                        long j122 = eu0Var.f1;
                        ArrayList arrayList42 = arrayList5;
                        storiesController.s(j122, arrayList42);
                        oc.a0(o2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList42.size(), new Object[0])).j();
                        eu0Var.L(false);
                        break;
                    default:
                        eu0 eu0Var2 = this.b;
                        eu0Var2.getClass();
                        int i172 = 0;
                        while (true) {
                            ArrayList arrayList52 = arrayList5;
                            if (i172 >= arrayList52.size()) {
                                eu0Var2.L(true);
                                break;
                            } else {
                                eu0Var2.r1.getMessagesController().deleteSavedDialog(((Long) arrayList52.get(i172)).longValue());
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
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
        }
    }

    public boolean D() {
        return !(this instanceof i30);
    }

    public final boolean E() {
        xs0 xs0Var;
        xs0[] xs0VarArr = this.g0;
        if (xs0VarArr == null || (xs0Var = xs0VarArr[0]) == null) {
            return false;
        }
        if (this.g1 && p0(xs0Var.B)) {
            return false;
        }
        boolean p02 = p0(xs0VarArr[0].B);
        int i9 = this.i1[p02 ? 1 : 0];
        return i9 != X(p02 ? 1 : 0, i9, false);
    }

    public final void F() {
        ur0 ur0Var = this.E0;
        if (ur0Var.e(ur0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = ur0Var.getFirstTabId();
        ur0Var.setInitialTabId(firstTabId);
        this.g0[0].B = firstTabId;
        m1(false);
    }

    public final void F0() {
        ih.n6 n6Var;
        ih.n6 n6Var2;
        this.C1.removeAllObservers();
        ms0 ms0Var = this.V;
        if (ms0Var != null && (n6Var2 = ms0Var.s) != null && n6Var2 != null) {
            n6Var2.z(ms0Var.v);
        }
        tq0 tq0Var = this.a0;
        if (tq0Var != null && (n6Var = tq0Var.s) != null && n6Var != null) {
            n6Var.z(tq0Var.v);
        }
        Iterator it = this.U1.values().iterator();
        while (it.hasNext()) {
            cu0 cu0Var = ((du0) it.next()).c;
            ih.n6 n6Var3 = cu0Var.s;
            if (n6Var3 != null && n6Var3 != null) {
                n6Var3.z(cu0Var.v);
            }
        }
    }

    public final void G(xs0 xs0Var, wk0 wk0Var, f2.m0 m0Var) {
        int i9;
        int i10;
        f2.q1 K;
        ih.n6 n6Var;
        if (this.k1 || this.F1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (wk0Var.getFastScroll() == null || !wk0Var.getFastScroll().n || currentTimeMillis - xs0Var.a >= 300) {
            xs0Var.a = currentTimeMillis;
            if ((this.R0 && this.Q0 && xs0Var.B != 11) || xs0Var.B == 7) {
                return;
            }
            int L0 = m0Var.L0();
            int abs = L0 == -1 ? 0 : Math.abs(m0Var.N0() - L0) + 1;
            int h = wk0Var.getAdapter() == null ? 0 : wk0Var.getAdapter().h();
            int i11 = xs0Var.B;
            int[] iArr = this.i1;
            tt0[] tt0VarArr = this.p1;
            if (i11 == 0 || i11 == 1 || i11 == 2 || i11 == 4) {
                h = tt0VarArr[i11].d() + tt0VarArr[i11].a.size();
                tt0 tt0Var = tt0VarArr[i11];
                if (tt0Var.h && tt0Var.e.size() > 2 && xs0Var.B == 0 && tt0VarArr[i11].a.size() != 0) {
                    float f10 = i11 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((wk0Var.getMeasuredHeight() / (wk0Var.getMeasuredWidth() / f10)) * f10 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((ct0) tt0VarArr[i11].e.get(1)).b) {
                        measuredHeight = ((ct0) tt0VarArr[i11].e.get(1)).b;
                    }
                    if ((L0 > h && L0 - h > measuredHeight) || ((i9 = L0 + abs) < tt0VarArr[i11].m && tt0VarArr[0].m - i9 > measuredHeight)) {
                        org.telegram.ui.rl rlVar = new org.telegram.ui.rl(this, i11, wk0Var, 13);
                        this.F1 = rlVar;
                        AndroidUtilities.runOnUIThread(rlVar);
                        return;
                    }
                }
            }
            int i12 = xs0Var.B;
            if (i12 == 7) {
                return;
            }
            if (p0(i12)) {
                bu0 k12 = k1(xs0Var.B);
                if (k12 == null || (n6Var = k12.s) == null || L0 + abs <= n6Var.i() - iArr[1]) {
                    return;
                }
                k12.P();
                return;
            }
            int i13 = xs0Var.B;
            if (i13 == 6) {
                if (abs > 0) {
                    ps0 ps0Var = this.L;
                    boolean z10 = ps0Var.h;
                    ArrayList arrayList = ps0Var.d;
                    if (z10 || ps0Var.e || arrayList.isEmpty() || L0 + abs < h - 5) {
                        return;
                    }
                    ps0.E(ps0Var, ((TLRPC.Chat) j3.r0.j(1, arrayList)).id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.o2 o2Var = this.r1;
            if (i13 == 11) {
                int i14 = -1;
                for (int i15 = 0; i15 < xs0Var.h.getChildCount(); i15++) {
                    View childAt = xs0Var.h.getChildAt(i15);
                    xs0Var.h.getClass();
                    i14 = Math.max(RecyclerView.R(childAt), i14);
                }
                f2.r0 adapter = xs0Var.h.getAdapter();
                pt0 pt0Var = this.O;
                if (adapter != pt0Var) {
                    if (i14 + 1 >= o2Var.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                        o2Var.getMessagesController().getSavedMessagesController().loadDialogs(false);
                        return;
                    }
                    return;
                } else {
                    if (i14 + 1 < pt0Var.h.size() + pt0Var.e.size() || pt0Var.s || pt0Var.r) {
                        return;
                    }
                    pt0Var.r = true;
                    pt0Var.F();
                    return;
                }
            }
            if (i13 == 10 || i13 == 12 || i13 == 13 || i13 == 14) {
                return;
            }
            int i16 = i13 == 0 ? 3 : i13 == 5 ? 10 : 6;
            int i17 = i13 == 15 ? 8 : i13;
            if (abs + L0 > h - i16 || tt0VarArr[i17].o) {
                tt0 tt0Var2 = tt0VarArr[i17];
                if (!tt0Var2.g) {
                    if (i13 == 0) {
                        int i18 = tt0VarArr[0].q;
                        i10 = i18 == 1 ? 6 : i18 == 2 ? 7 : 0;
                    } else {
                        i10 = i13 == 1 ? 1 : i13 == 2 ? 2 : i13 == 4 ? 4 : i13 == 5 ? 5 : i13 == 15 ? 8 : 3;
                    }
                    boolean[] zArr = tt0Var2.i;
                    if (!zArr[0]) {
                        tt0Var2.g = true;
                        o2Var.getMediaDataController().loadMedia(this.f1, 50, tt0VarArr[i17].j[0], 0, i10, this.B, 1, o2Var.getClassGuid(), tt0VarArr[i17].p, null, null);
                    } else if (this.Y0 != 0 && !zArr[1]) {
                        tt0Var2.g = true;
                        o2Var.getMediaDataController().loadMedia(this.Y0, 50, tt0VarArr[i17].j[1], 0, i10, this.B, 1, o2Var.getClassGuid(), tt0VarArr[i17].p, null, null);
                    }
                }
            }
            int i19 = tt0VarArr[i17].m;
            if (i17 == 0) {
                i19 = this.D.L(0);
            }
            if (L0 - i19 < i16 + 1) {
                tt0 tt0Var3 = tt0VarArr[i17];
                if (!tt0Var3.g && !tt0Var3.l && !tt0Var3.o) {
                    A0(xs0Var.B);
                }
            }
            xs0 xs0Var2 = this.g0[0];
            if (xs0Var2.h == wk0Var) {
                int i20 = xs0Var2.B;
                if ((i20 != 0 && i20 != 5) || L0 == -1 || (K = wk0Var.K(L0)) == null) {
                    return;
                }
                int i21 = K.f;
                if (i21 == 0 || i21 == 12) {
                    View view = K.a;
                    boolean z11 = view instanceof org.telegram.ui.Cells.s7;
                    org.telegram.ui.Cells.w0 w0Var = this.G0;
                    if (!z11) {
                        if (view instanceof org.telegram.ui.Cells.e2) {
                            w0Var.S(((org.telegram.ui.Cells.e2) view).getDate(), false, true);
                        }
                    } else {
                        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                        MessageObject messageObject = s7Var.e <= 0 ? null : s7Var.b[0];
                        if (messageObject != null) {
                            w0Var.S(messageObject.messageOwner.date, false, true);
                        }
                    }
                }
            }
        }
    }

    public final void G0(int i9, View view, MessageObject messageObject, int i10) {
        String str;
        if (messageObject == null || this.k1) {
            return;
        }
        zq0 zq0Var = this.S;
        if (zq0Var == null || !zq0Var.w) {
            int i11 = 0;
            i11 = 0;
            String str2 = null;
            if (this.y1) {
                int i12 = 8;
                if (i10 == 8 && !C()) {
                    return;
                }
                char c10 = messageObject.getDialogId() == this.f1 ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = this.V0;
                if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                    sparseArrayArr[c10].remove(messageObject.getId());
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.W0--;
                    }
                } else {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        return;
                    }
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
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
                            i12 = 0;
                        }
                        w0Var2.setVisibility(i12);
                    }
                    u1();
                }
                this.X0 = false;
                if (view instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) view).b(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.s7) {
                    ((org.telegram.ui.Cells.s7) view).b(0, sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0);
                } else if (view instanceof org.telegram.ui.Cells.l7) {
                    ((org.telegram.ui.Cells.l7) view).f(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) view).e(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    ((org.telegram.ui.Cells.e2) view).c(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.r7) {
                    ((org.telegram.ui.Cells.r7) view).i(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                }
            } else {
                er0 er0Var = this.n1;
                tt0[] tt0VarArr = this.p1;
                org.telegram.ui.ActionBar.o2 o2Var = this.r1;
                if (i10 == 0) {
                    tt0 tt0Var = tt0VarArr[i10];
                    int i13 = i9 - tt0Var.m;
                    if (i13 >= 0 && i13 < tt0Var.a.size()) {
                        PhotoViewer.t1().K2(null, o2Var, null);
                        PhotoViewer.t1().a2(tt0VarArr[i10].a, i13, this.f1, this.Y0, this.B, er0Var);
                    }
                } else if (i10 == 2 || i10 == 4) {
                    if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).a();
                    }
                } else if (i10 == 5) {
                    PhotoViewer.t1().K2(null, o2Var, null);
                    int indexOf = tt0VarArr[i10].a.indexOf(messageObject);
                    if (indexOf < 0) {
                        PhotoViewer.t1().a2(org.telegram.messenger.l0.k(messageObject), 0, 0L, 0L, 0L, er0Var);
                    } else {
                        PhotoViewer.t1().a2(tt0VarArr[i10].a, indexOf, this.f1, this.Y0, this.B, er0Var);
                    }
                } else if (i10 == 1) {
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                        TLRPC.Document document = messageObject.getDocument();
                        if (i7Var.C) {
                            if (messageObject.canPreviewDocument()) {
                                PhotoViewer.t1().K2(null, o2Var, null);
                                int indexOf2 = tt0VarArr[i10].a.indexOf(messageObject);
                                if (indexOf2 < 0) {
                                    PhotoViewer.t1().a2(org.telegram.messenger.l0.k(messageObject), 0, 0L, 0L, 0L, er0Var);
                                    return;
                                } else {
                                    PhotoViewer.t1().a2(tt0VarArr[i10].a, indexOf2, this.f1, this.Y0, this.B, er0Var);
                                    return;
                                }
                            }
                            AndroidUtilities.openDocument(messageObject, o2Var.getParentActivity(), o2Var);
                        } else if (i7Var.B) {
                            o2Var.getFileLoader().cancelLoadFile(document);
                            i7Var.f(true);
                        } else {
                            MessageObject message = i7Var.getMessage();
                            message.putInDownloadsStore = true;
                            o2Var.getFileLoader().loadFile(document, message, 0, 0);
                            i7Var.f(true);
                        }
                    }
                } else if (i10 == 3) {
                    try {
                        TLRPC.WebPage webPage = MessageObject.getMedia(messageObject.messageOwner) != null ? MessageObject.getMedia(messageObject.messageOwner).webpage : null;
                        if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            str = null;
                        } else {
                            if (webPage.cached_page != null) {
                                LaunchActivity launchActivity = LaunchActivity.C1;
                                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                                    o2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str3 = webPage.embed_url;
                            if (str3 != null && str3.length() != 0) {
                                gu.I(o2Var, messageObject, this.n1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                return;
                            }
                            str = webPage.url;
                        }
                        if (str == null) {
                            ArrayList arrayList = ((org.telegram.ui.Cells.l7) view).A;
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
                } else if (p0(i10)) {
                    bu0 k12 = k1(i10);
                    ih.n6 n6Var = k12 != null ? k12.s : null;
                    if (n6Var == null) {
                        return;
                    }
                    ih.m9 orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int id2 = messageObject.getId();
                    ih.e7 a3 = ih.e7.a(this.g0[0].h);
                    a3.e = new wu(n6Var, 18);
                    if ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).o1) {
                        i11 = AndroidUtilities.dp(68.0f);
                    }
                    a3.s += i11;
                    orCreateStoryViewer.C(context, id2, n6Var, a3);
                }
            }
            p1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean H(MotionEvent motionEvent) {
        uq0 uq0Var;
        xs0[] xs0VarArr = this.g0;
        int i9 = xs0VarArr[0].B;
        if (i9 == 13 && (uq0Var = this.Q) != null) {
            View currentView = uq0Var.n.getCurrentView();
            if (currentView instanceof jh.q) {
                jh.q qVar = (jh.q) currentView;
                jh.l lVar = qVar.v;
                jh.i iVar = qVar.f;
                if (qVar.a != null && qVar.getParent() != null) {
                    if (!qVar.b || qVar.G) {
                        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                            if (qVar.H && !qVar.G && motionEvent.getPointerCount() == 2) {
                                qVar.L = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                qVar.M = 1.0f;
                                qVar.J = motionEvent.getPointerId(0);
                                qVar.K = motionEvent.getPointerId(1);
                                iVar.I0(false);
                                iVar.cancelLongPress();
                                iVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) qVar.getParent();
                                qVar.Q = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - qVar.getX());
                                int y10 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - qVar.getY());
                                int i10 = qVar.Q;
                                Rect rect = qVar.R;
                                qVar.O = -1;
                                int i11 = y10 + iVar.T2;
                                for (int i12 = 0; i12 < iVar.getChildCount(); i12++) {
                                    View childAt = iVar.getChildAt(i12);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i10, i11)) {
                                        qVar.O = RecyclerView.S(childAt);
                                        qVar.P = childAt.getTop();
                                    }
                                }
                                qVar.I = true;
                            }
                            if (motionEvent.getActionMasked() == 0) {
                                if ((motionEvent.getY() - ((View) qVar.getParent()).getY()) - qVar.getY() > 0.0f) {
                                    qVar.H = true;
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 2 && (qVar.G || qVar.I)) {
                            int i13 = -1;
                            int i14 = -1;
                            for (int i15 = 0; i15 < motionEvent.getPointerCount(); i15++) {
                                if (qVar.J == motionEvent.getPointerId(i15)) {
                                    i13 = i15;
                                }
                                if (qVar.K == motionEvent.getPointerId(i15)) {
                                    i14 = i15;
                                }
                            }
                            if (i13 == -1 || i14 == -1) {
                                qVar.H = false;
                                qVar.I = false;
                                qVar.G = false;
                                qVar.a();
                                return false;
                            }
                            float hypot = ((float) Math.hypot(motionEvent.getX(i14) - motionEvent.getX(i13), motionEvent.getY(i14) - motionEvent.getY(i13))) / qVar.L;
                            qVar.M = hypot;
                            if (!qVar.G && (hypot > 1.01f || hypot < 0.99f)) {
                                qVar.G = true;
                                boolean z10 = hypot > 1.0f;
                                qVar.N = z10;
                                qVar.b(z10);
                            }
                            if (qVar.G) {
                                boolean z11 = qVar.N;
                                if ((!z11 || qVar.M >= 1.0f) && (z11 || qVar.M <= 1.0f)) {
                                    qVar.c = Math.max(0.0f, Math.min(1.0f, z11 ? org.telegram.messenger.l0.a(2.0f, qVar.M, 1.0f, 1.0f) : (1.0f - qVar.M) / 0.5f));
                                } else {
                                    qVar.c = 0.0f;
                                }
                                float f10 = qVar.c;
                                if (f10 == 1.0f || f10 == 0.0f) {
                                    if (f10 == 1.0f) {
                                        int i16 = qVar.e;
                                        int ceil = (((int) Math.ceil(qVar.O / qVar.e)) * i16) + ((int) ((qVar.S.C.v1 / (iVar.getMeasuredWidth() - ((int) (iVar.getMeasuredWidth() / qVar.e)))) * (i16 - 1)));
                                        if (ceil >= lVar.h()) {
                                            ceil = lVar.h() - 1;
                                        }
                                        qVar.O = ceil;
                                    }
                                    qVar.a();
                                    if (qVar.c == 0.0f) {
                                        qVar.N = !qVar.N;
                                    }
                                    qVar.b(qVar.N);
                                    qVar.L = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                iVar.invalidate();
                            }
                        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((qVar.J == motionEvent.getPointerId(0) && qVar.K == motionEvent.getPointerId(1)) || (qVar.J == motionEvent.getPointerId(1) && qVar.K == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && qVar.G) {
                            qVar.I = false;
                            qVar.H = false;
                            qVar.G = false;
                            qVar.a();
                        }
                        return qVar.G;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i9 == 0 || p0(i9)) && getParent() != null) {
            if (!this.k1 || this.a) {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (this.b && !this.a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f = motionEvent.getPointerId(1);
                        xs0VarArr[0].h.I0(false);
                        xs0VarArr[0].h.cancelLongPress();
                        xs0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - xs0VarArr[0].getX());
                        int y11 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - xs0VarArr[0].getY());
                        int i17 = this.w;
                        this.s = -1;
                        int i18 = y11 + xs0VarArr[0].h.T2;
                        if (getY() != 0.0f && this.A == 1) {
                            i18 = 0;
                        }
                        for (int i19 = 0; i19 < xs0VarArr[0].h.getChildCount(); i19++) {
                            View childAt2 = xs0VarArr[0].h.getChildAt(i19);
                            Rect rect2 = this.x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i17, i18)) {
                                xs0VarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.z1.S() && this.s == -1) {
                            this.s = (int) (((this.i1[p0(xs0VarArr[0].B) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i17 / xs0VarArr[0].h.getMeasuredWidth(), 0.0f))) + xs0VarArr[0].x.L0());
                            this.v = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - xs0VarArr[0].getY() > 0.0f) {
                            this.b = true;
                        }
                    }
                } else if (motionEvent.getActionMasked() == 2 && (this.a || this.c)) {
                    int i20 = -1;
                    int i21 = -1;
                    for (int i22 = 0; i22 < motionEvent.getPointerCount(); i22++) {
                        if (this.e == motionEvent.getPointerId(i22)) {
                            i20 = i22;
                        }
                        if (this.f == motionEvent.getPointerId(i22)) {
                            i21 = i22;
                        }
                    }
                    if (i20 == -1 || i21 == -1) {
                        this.b = false;
                        this.c = false;
                        this.a = false;
                        T();
                        return false;
                    }
                    float hypot2 = ((float) Math.hypot(motionEvent.getX(i21) - motionEvent.getX(i20), motionEvent.getY(i21) - motionEvent.getY(i20))) / this.h;
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
                            this.j1 = Math.max(0.0f, Math.min(1.0f, z13 ? org.telegram.messenger.l0.a(2.0f, this.n, 1.0f, 1.0f) : (1.0f - this.n) / 0.5f));
                        } else {
                            this.j1 = 0.0f;
                        }
                        float f11 = this.j1;
                        if (f11 == 1.0f || f11 == 0.0f) {
                            f2.r0 k12 = p0(this.l1) ? k1(this.l1) : this.D;
                            if (this.j1 == 1.0f) {
                                int i23 = this.m1;
                                int ceil2 = (((int) Math.ceil(this.s / this.m1)) * i23) + ((int) ((this.v1 / (xs0VarArr[0].h.getMeasuredWidth() - ((int) (xs0VarArr[0].h.getMeasuredWidth() / this.m1)))) * (i23 - 1)));
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
                        xs0VarArr[0].h.invalidate();
                        xs0 xs0Var = xs0VarArr[0];
                        if (xs0Var.C != null) {
                            xs0Var.invalidate();
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

    public final boolean H0(MessageObject messageObject, View view, int i9, boolean z10) {
        zq0 zq0Var;
        final TL_stories.StoryItem storyItem;
        ms0 ms0Var;
        ih.n6 n6Var;
        final int i10 = 0;
        if (!this.y1) {
            org.telegram.ui.ActionBar.o2 o2Var = this.r1;
            if (o2Var.getParentActivity() != null && messageObject != null && ((zq0Var = this.S) == null || !zq0Var.w)) {
                AndroidUtilities.hideKeyboard(o2Var.getParentActivity().getCurrentFocus());
                long j10 = this.f1;
                int i11 = 8;
                final int i12 = 1;
                if (!z10 || (!(w0(getClosestTab()) || getClosestTab() == 8) || this.y1)) {
                    char c10 = messageObject.getDialogId() == j10 ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.V0;
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
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
                            i11 = 0;
                        }
                        w0Var2.setVisibility(i11);
                    }
                    this.w0.a(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.J0;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        View view2 = (View) arrayList2.get(i13);
                        AndroidUtilities.clearDrawableAnimation(view2);
                        arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        i13++;
                    }
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    this.X0 = false;
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.s7) {
                        ((org.telegram.ui.Cells.s7) view).b(i9, true);
                    } else if (view instanceof org.telegram.ui.Cells.l7) {
                        ((org.telegram.ui.Cells.l7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.e2) {
                        ((org.telegram.ui.Cells.e2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.r7) {
                        ((org.telegram.ui.Cells.r7) view).i(true, true);
                    }
                    if (!this.y1) {
                        b1(true);
                    }
                    D0(sparseArrayArr[0]);
                    p1();
                    return true;
                }
                if (view instanceof org.telegram.ui.Cells.r7) {
                    org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                    r7Var.k(r7Var.n, r7Var.r, true);
                }
                TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean w02 = w0(getClosestTab());
                    x60 I = x60.I(o2Var, view);
                    x60 J = I.J();
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.kt0(I, 25), false);
                    J.k();
                    x60.f(J, getStoriesController().B(j10, true), hashSet, true, new ue0(this, storyItem2, I, 4), new bg.j1(this, hashSet, storyItem2, I, 11));
                    I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new fh.k3(I, J, i11), false);
                    I.k();
                    I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new c3.d(this, messageObject, view, i9, 23), false);
                    final int i14 = 3;
                    if (w02) {
                        int h12 = h1(getClosestTab());
                        String w8 = getStoriesController().w(h12, j10);
                        I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new qd(this, h12, 6), false);
                        storyItem = storyItem2;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new c3.d(this, h12, storyItem, w8, 24), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (ms0Var = this.V) != null && (n6Var = ms0Var.s) != null) {
                            if (n6Var.m(storyItem.id)) {
                                I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() { // from class: org.telegram.ui.Components.dq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                eu0 eu0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eu0Var.getContext(), 0, eu0Var.B1);
                                                alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jq0(eu0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new if0(9));
                                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                                c2Var.show();
                                                c2Var.h();
                                                break;
                                            case 1:
                                                eu0 eu0Var2 = this;
                                                eu0Var2.getClass();
                                                eu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                eu0 eu0Var3 = this;
                                                eu0Var3.getClass();
                                                eu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                eu0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final int i15 = 2;
                                I.c(R.drawable.chats_pin, LocaleController.getString(R.string.StoriesAlbumMenuPin), new Runnable() { // from class: org.telegram.ui.Components.dq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                eu0 eu0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eu0Var.getContext(), 0, eu0Var.B1);
                                                alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jq0(eu0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new if0(9));
                                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                                c2Var.show();
                                                c2Var.h();
                                                break;
                                            case 1:
                                                eu0 eu0Var2 = this;
                                                eu0Var2.getClass();
                                                eu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                eu0 eu0Var3 = this;
                                                eu0Var3.getClass();
                                                eu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                eu0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        I.c(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable() { // from class: org.telegram.ui.Components.dq0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        eu0 eu0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eu0Var.getContext(), 0, eu0Var.B1);
                                        alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jq0(eu0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new if0(9));
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                        c2Var.show();
                                        c2Var.h();
                                        break;
                                    case 1:
                                        eu0 eu0Var2 = this;
                                        eu0Var2.getClass();
                                        eu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                        break;
                                    case 2:
                                        eu0 eu0Var3 = this;
                                        eu0Var3.getClass();
                                        eu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                        break;
                                    default:
                                        eu0.h(this, storyItem);
                                        break;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.Components.dq0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    eu0 eu0Var = this;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eu0Var.getContext(), 0, eu0Var.B1);
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                    alertDialog$Builder.a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jq0(eu0Var, storyItem));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new if0(9));
                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                    c2Var.show();
                                    c2Var.h();
                                    break;
                                case 1:
                                    eu0 eu0Var2 = this;
                                    eu0Var2.getClass();
                                    eu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                    break;
                                case 2:
                                    eu0 eu0Var3 = this;
                                    eu0Var3.getClass();
                                    eu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                    break;
                                default:
                                    eu0.h(this, storyItem);
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
        xs0[] xs0VarArr = this.g0;
        xs0 xs0Var = xs0VarArr[0];
        if (xs0Var == null || xs0VarArr[1] == null) {
            return;
        }
        float f10 = 0.0f;
        zq0 zq0Var = this.S;
        if (zq0Var != null) {
            char c10 = (!p0(xs0Var.B) || xs0VarArr[0].B == 9) ? (char) 0 : (char) 1;
            if (c10 == (xs0VarArr[1].getVisibility() == 0 ? (!p0(xs0VarArr[1].B) || xs0VarArr[1].B == 9) ? (char) 0 : (char) 1 : c10)) {
                abs = c10 != 0 ? 1.0f : 0.0f;
                zq0Var.setTranslationX(c10 != 0 ? 0.0f : xs0VarArr[0].getMeasuredWidth());
            } else {
                zq0Var.setTranslationX(xs0VarArr[c10 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(zq0Var.getTranslationX()) / zq0Var.getMeasuredWidth());
            }
            float f11 = 0.0f;
            for (int i9 = 0; i9 < xs0VarArr.length; i9++) {
                if (xs0VarArr[i9].getVisibility() == 0) {
                    dr0 dr0Var = xs0VarArr[i9].h;
                    View childAt = dr0Var.getChildCount() == 0 ? null : dr0Var.getChildAt(0);
                    f11 += Utilities.clamp01(1.0f - (xs0VarArr[i9].getTranslationX() / xs0VarArr[i9].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - dr0Var.getPaddingTop() : dr0Var.getChildCount() == 0 ? 0.0f : -AndroidUtilities.dp(48.0f));
                }
            }
            float clamp01 = Utilities.clamp01(1.0f - ((-f11) / AndroidUtilities.dpf2(48.0f)));
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
            zq0Var.setAlpha(clamp01);
            zq0Var.setScaleX(lerp);
            zq0Var.setScaleY(lerp);
            zq0Var.setTranslationY(this.G1 + f11);
            f10 = abs;
        }
        K();
        if (this.Q1 != f10) {
            this.Q1 = f10;
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
        xs0[] xs0VarArr = this.g0;
        if (!z10) {
            if (Math.abs(xs0VarArr[1].getTranslationX()) < 1.0f) {
                xs0VarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.d1 ? -1 : 1));
                xs0VarArr[1].setTranslationX(0.0f);
                animatorSet = this.b1;
                if (animatorSet != null) {
                }
                this.c1 = false;
            }
            M0(getTabProgress());
            return this.c1;
        }
        if (Math.abs(xs0VarArr[0].getTranslationX()) < 1.0f) {
            xs0VarArr[0].setTranslationX(0.0f);
            xs0VarArr[1].setTranslationX(xs0VarArr[0].getMeasuredWidth() * (this.d1 ? 1 : -1));
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

    public final void J0(float f10) {
        xs0[] xs0VarArr = this.g0;
        if (f10 != 1.0f || xs0VarArr[1].getVisibility() == 0) {
            if (this.d1) {
                xs0VarArr[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                xs0VarArr[1].setTranslationX(xs0VarArr[0].getMeasuredWidth() - (xs0VarArr[0].getMeasuredWidth() * f10));
            } else {
                xs0VarArr[0].setTranslationX(r3.getMeasuredWidth() * f10);
                xs0VarArr[1].setTranslationX((xs0VarArr[0].getMeasuredWidth() * f10) - xs0VarArr[0].getMeasuredWidth());
            }
            M0(getTabProgress());
            float a02 = a0(f10);
            this.l0 = a02;
            this.n0.setVisibility((a02 == 0.0f || !D() || q0()) ? 4 : 0);
            org.telegram.ui.ActionBar.w0 w0Var = this.j0;
            if (w0Var == null || D()) {
                this.k0 = b0(f10);
                t1();
            } else {
                w0Var.setVisibility(v0() ? 8 : 4);
                this.k0 = 0.0f;
            }
            q1(false);
            if (f10 == 1.0f) {
                xs0 xs0Var = xs0VarArr[0];
                xs0VarArr[0] = xs0VarArr[1];
                xs0VarArr[1] = xs0Var;
                xs0Var.setVisibility(8);
                if (w0Var != null && this.t0 == 2) {
                    w0Var.setVisibility(v0() ? 8 : 4);
                }
                this.t0 = 0;
                f1();
            }
        }
    }

    public final void K() {
        bs bsVar = this.L0;
        if (bsVar != null) {
            zq0 zq0Var = this.S;
            float f10 = 0.0f;
            if (zq0Var != null) {
                f10 = 0.0f + (zq0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(zq0Var.getTranslationX() / zq0Var.getMeasuredWidth())));
            }
            bsVar.setTranslationY(this.G1 + f10);
        }
    }

    public final boolean L(boolean z10) {
        SparseArray[] sparseArrayArr;
        if (!this.y1) {
            return false;
        }
        int i9 = 1;
        while (true) {
            sparseArrayArr = this.V0;
            if (i9 < 0) {
                break;
            }
            sparseArrayArr[i9].clear();
            i9--;
        }
        this.W0 = 0;
        D0(sparseArrayArr[0]);
        uq0 uq0Var = this.Q;
        if (uq0Var != null) {
            uq0Var.h();
            uq0Var.j();
        }
        b1(false);
        r1(z10);
        ot0 ot0Var = this.N;
        if (ot0Var != null) {
            ot0Var.w.clear();
        }
        return true;
    }

    public void L0() {
        boolean z10 = v0() || q0();
        zt0 zt0Var = this.a0.w;
        if (zt0Var != null) {
            zt0Var.b(z10 && getClosestTab() == 9);
        }
        zt0 zt0Var2 = this.V.w;
        if (zt0Var2 != null) {
            zt0Var2.b(z10 && getClosestTab() == 8);
        }
        for (du0 du0Var : this.U1.values()) {
            cu0 cu0Var = du0Var.c;
            if (cu0Var.s != null) {
                cu0Var.w.b(z10 && getClosestTab() == du0Var.a);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.j0;
        if (w0Var != null) {
            rr0 rr0Var = this.F0;
            w0Var.setSearchFieldHint(LocaleController.getString((rr0Var != null && rr0Var.a() && getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
        I();
    }

    public void M0(float f10) {
        E0();
    }

    public boolean N() {
        return this instanceof i30;
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        xs0[] xs0VarArr = this.g0;
        motionEvent.offsetLocation(x10 - xs0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - xs0VarArr[0].getY()) - xs0VarArr[0].h.getFastScroll().getY());
        return xs0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void O0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i9) {
        new org.telegram.ui.o61(o2Var, j10, this.i1[1], new kc(this, j10, i9)).show();
    }

    public void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void P0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i9) {
        y4.v0(o2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i9, j10))), LocaleController.getString(R.string.Delete), true, new gh.e9(this, j10, i9, 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i9 = 0;
        while (true) {
            xs0[] xs0VarArr = this.g0;
            if (i9 >= xs0VarArr.length) {
                return;
            }
            xs0 xs0Var = xs0VarArr[i9];
            if (xs0Var != null && xs0Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < xs0VarArr[i9].h.getChildCount(); i10++) {
                    View childAt = xs0VarArr[i9].h.getChildAt(i10);
                    if (childAt.getY() < AndroidUtilities.dp(100.0f) + xs0VarArr[i9].h.T2) {
                        int save = canvas.save();
                        canvas.translate(childAt.getX() + xs0VarArr[i9].getX(), childAt.getY() + xs0VarArr[i9].h.getY() + xs0VarArr[i9].getY() + getY());
                        childAt.draw(canvas);
                        if (arrayList != null && (childAt instanceof uu0)) {
                            arrayList.add((uu0) childAt);
                        }
                        canvas.restoreToCount(save);
                    }
                }
            }
            i9++;
        }
    }

    public final void Q0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i9) {
        String w8 = getStoriesController().w(i9, j10);
        Context context = o2Var.getContext();
        org.telegram.ui.ActionBar.b6 resourceProvider = o2Var.getResourceProvider();
        i3.e eVar = new i3.e(this, j10, i9);
        Pattern pattern = y4.a;
        y4.R(context, o2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w8, 12, LocaleController.getString(R.string.Rename), resourceProvider, eVar);
    }

    public final boolean R(int i9) {
        tt0[] tt0VarArr = this.q1.n;
        if (tt0VarArr == null) {
            return false;
        }
        tt0[] tt0VarArr2 = this.p1;
        if (i9 == 0) {
            tt0 tt0Var = tt0VarArr2[i9];
            if (!tt0Var.h) {
                int[] iArr = tt0Var.f;
                int[] iArr2 = tt0VarArr[i9].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = tt0VarArr2[i9].f;
            int[] iArr4 = tt0VarArr[i9].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        tt0VarArr2[i9].a.addAll(tt0VarArr[i9].a);
        tt0VarArr2[i9].c.addAll(tt0VarArr[i9].c);
        for (Map.Entry entry : tt0VarArr[i9].d.entrySet()) {
            tt0VarArr2[i9].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i10 = 0; i10 < 2; i10++) {
            tt0VarArr2[i9].b[i10] = tt0VarArr[i9].b[i10].clone();
            tt0 tt0Var2 = tt0VarArr2[i9];
            int[] iArr5 = tt0Var2.j;
            tt0 tt0Var3 = tt0VarArr[i9];
            iArr5[i10] = tt0Var3.j[i10];
            tt0Var2.i[i10] = tt0Var3.i[i10];
        }
        tt0VarArr2[i9].e.addAll(tt0VarArr[i9].e);
        return !tt0VarArr[i9].a.isEmpty();
    }

    public final void R0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.o2 o2Var = this.r1;
        if (shouldShowUrlInAlert) {
            y4.q0(o2Var, str, true, true);
        } else {
            ve.e.s(o2Var.getParentActivity(), str);
        }
    }

    public final void S(int i9, wk0 wk0Var, boolean z10) {
        ArrayList arrayList = this.p1[i9].e;
        int L0 = ((f2.m0) wk0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            ct0 ct0Var = null;
            if (arrayList != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (L0 <= ((ct0) arrayList.get(i10)).b) {
                        ct0Var = (ct0) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
                if (ct0Var == null) {
                    ct0Var = (ct0) j3.r0.j(1, arrayList);
                }
            }
            if (ct0Var != null) {
                y0(i9, ct0Var.d, ct0Var.b + 1, z10);
            }
        }
    }

    public int S0() {
        return -1;
    }

    public final void T() {
        xs0[] xs0VarArr;
        xs0 xs0Var;
        int i9;
        f2.r0 adapter;
        if (this.k1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                xs0VarArr = this.g0;
                if (i11 >= xs0VarArr.length) {
                    xs0Var = null;
                    break;
                }
                xs0Var = xs0VarArr[i11];
                if (xs0Var.B == this.l1) {
                    break;
                } else {
                    i11++;
                }
            }
            if (xs0Var != null) {
                boolean p02 = p0(xs0Var.B);
                float f10 = this.j1;
                tt0[] tt0VarArr = this.p1;
                if (f10 != 1.0f) {
                    if (f10 == 0.0f) {
                        this.k1 = false;
                        if (this.l1 == 0) {
                            tt0VarArr[0].g(false);
                        }
                        xs0Var.r.setVisibility(8);
                        xs0Var.h.invalidate();
                        return;
                    }
                    boolean z10 = f10 > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new tr0(this, xs0Var, i10));
                    ofFloat.addListener(new org.telegram.ui.si(this, z10, p02 ? 1 : 0, xs0Var));
                    ofFloat.setInterpolator(gr.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.k1 = false;
                int i12 = this.m1;
                int[] iArr = this.i1;
                iArr[p02 ? 1 : 0] = i12;
                if (!p02) {
                    SharedConfig.setMediaColumnsCount(i12);
                } else if (c0(xs0Var.B) >= 5) {
                    SharedConfig.setStoriesColumnsCount(this.m1);
                }
                for (int i13 = 0; i13 < xs0VarArr.length; i13++) {
                    xs0 xs0Var2 = xs0VarArr[i13];
                    if (xs0Var2 != null && xs0Var2.h != null && (((i9 = xs0Var2.B) == 0 || p0(i9)) && (adapter = xs0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            tt0VarArr[0].g(false);
                        }
                        xs0VarArr[i13].r.setVisibility(8);
                        xs0VarArr[i13].x.y1(iArr[p02 ? 1 : 0]);
                        xs0VarArr[i13].h.a0();
                        xs0VarArr[i13].h.invalidate();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(xs0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                    }
                }
                if (this.s < 0) {
                    X0();
                    return;
                }
                while (i10 < xs0VarArr.length) {
                    xs0 xs0Var3 = xs0VarArr[i10];
                    if (xs0Var3.B == this.l1) {
                        View m10 = xs0Var3.s.m(this.s);
                        if (m10 != null) {
                            this.v = m10.getTop();
                        }
                        xs0 xs0Var4 = xs0VarArr[i10];
                        xs0Var4.x.h1(this.s, (-xs0Var4.h.getPaddingTop()) + this.v);
                    }
                    i10++;
                }
            }
        }
    }

    public final void T0(ArrayList arrayList, boolean z10) {
        ms0 ms0Var = this.V;
        if (ms0Var == null || ms0Var.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.r1;
        if (z10 && arrayList.size() > o2Var.getMessagesController().storiesPinnedToTopCountMax) {
            oc.a0(o2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", o2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            return;
        }
        ih.n6 n6Var = ms0Var.s;
        int i9 = n6Var.c;
        ArrayList arrayList2 = n6Var.g;
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
        boolean z12 = arrayList3.size() > MessagesController.getInstance(i9).storiesPinnedToTopCountMax;
        if (!z12) {
            boolean z13 = arrayList2.size() != arrayList3.size();
            if (!z13) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList2.size()) {
                        break;
                    }
                    if (arrayList2.get(i10) != arrayList3.get(i10)) {
                        z13 = true;
                        break;
                    }
                    i10++;
                }
            }
            if (z13) {
                arrayList2.clear();
                arrayList2.addAll(arrayList3);
                n6Var.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = MessagesController.getInstance(i9).getInputPeer(n6Var.d);
                ConnectionsManager.getInstance(i9).sendRequest(tL_togglePinnedToTop, new ih.q5(2));
            }
            z11 = z12;
        }
        if (z11) {
            oc.a0(o2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", o2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
        } else if (z10) {
            oc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
        } else {
            oc.a0(o2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
        }
    }

    public final void U(int i9) {
        ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i9 == 0) {
            if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                this.w0.setTextSize(20);
            } else {
                this.w0.setTextSize(18);
            }
        }
        if (i9 == 0) {
            this.D.l();
        }
    }

    public final boolean U0(MotionEvent motionEvent, boolean z10) {
        xs0 xs0Var;
        uq0 uq0Var;
        int closestTab = getClosestTab();
        ur0 ur0Var = this.E0;
        int i9 = -1;
        int i10 = ur0Var.K.get(ur0Var.n + (z10 ? 1 : -1), -1);
        zq0 zq0Var = this.S;
        if (zq0Var != null) {
            if (w0(closestTab) || closestTab == 8) {
                m71 m71Var = zq0Var.n;
                i9 = m71Var.U.get(m71Var.B + (z10 ? 1 : -1), -1);
            } else if (w0(i10) || i10 == 8) {
                i9 = zq0Var.getCurrentAlbumId();
            }
            if (i9 == 0) {
                i10 = 8;
            } else if (i9 > 0) {
                i10 = i1(i9).a;
            }
        }
        if (i10 >= 0) {
            org.telegram.ui.ActionBar.w0 w0Var = this.j0;
            if (w0Var == null || D()) {
                this.k0 = b0(0.0f);
                s1(0.0f);
            } else {
                w0Var.setVisibility(v0() ? 8 : 4);
                this.k0 = 0.0f;
            }
            if ((!this.R0 || getSelectedTab() != 11) && (!C() || !this.y1 || (getClosestTab() != 8 && !w0(getClosestTab())))) {
                xs0[] xs0VarArr = this.g0;
                xs0 xs0Var2 = xs0VarArr[0];
                if (xs0Var2 != null && xs0Var2.B == 13 && (uq0Var = this.Q) != null) {
                    jh.a aVar = uq0Var.n;
                    if (!z10) {
                    }
                }
                xs0 xs0Var3 = xs0VarArr[0];
                vq0 vq0Var = this.R;
                if (xs0Var3 != null && xs0Var3.B == 14 && vq0Var != null) {
                    fh.c3 c3Var = vq0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.y1 || (xs0Var = xs0VarArr[0]) == null || xs0Var.B != 13) && ((vq0Var == null || !vq0Var.g()) && (zq0Var == null || !zq0Var.w))) {
                    q1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    k0();
                    this.u1 = false;
                    this.t1 = true;
                    N0(true);
                    this.v1 = (int) motionEvent.getX();
                    this.C.setEnabled(false);
                    ur0Var.setEnabled(false);
                    xs0 xs0Var4 = xs0VarArr[1];
                    xs0Var4.B = i10;
                    xs0Var4.setVisibility(0);
                    this.d1 = z10;
                    m1(true);
                    if (z10) {
                        xs0VarArr[1].setTranslationX(xs0VarArr[0].getMeasuredWidth());
                    } else {
                        xs0VarArr[1].setTranslationX(-xs0VarArr[0].getMeasuredWidth());
                    }
                    M0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final String V(boolean z10) {
        int i9;
        int i10;
        TLRPC.MessageMedia messageMedia;
        uq0 uq0Var;
        if (!r0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (uq0Var = this.Q) != null) {
            return uq0Var.getBotPreviewsSubtitle();
        }
        ms0 ms0Var = this.V;
        if (ms0Var == null || ms0Var.s == null) {
            i9 = 0;
            i10 = 0;
        } else {
            i9 = 0;
            i10 = 0;
            for (int i11 = 0; i11 < ms0Var.s.i.size(); i11++) {
                MessageObject messageObject = (MessageObject) ms0Var.s.i.get(i11);
                TL_stories.StoryItem storyItem = messageObject.storyItem;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (MessageObject.isVideoDocument(messageMedia.document)) {
                        i10++;
                    } else if (messageObject.storyItem.media.photo != null) {
                        i9++;
                    }
                }
            }
        }
        if (i9 == 0 && i10 == 0) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i9 > 0) {
            sb2.append(LocaleController.formatPluralString("Images", i9, new Object[0]));
        }
        if (i10 > 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(LocaleController.formatPluralString("Videos", i10, new Object[0]));
        }
        return sb2.toString();
    }

    public final xs0 W(int i9) {
        int i10 = 0;
        while (true) {
            xs0[] xs0VarArr = this.g0;
            if (i10 >= xs0VarArr.length) {
                return null;
            }
            xs0 xs0Var = xs0VarArr[i10];
            if (xs0Var != null && xs0Var.B == i9) {
                return xs0Var;
            }
            i10++;
        }
    }

    public final void W0(f2.r0 r0Var) {
        if (r0Var instanceof yt0) {
            ArrayList arrayList = this.A0;
            ArrayList arrayList2 = this.B0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (r0Var == this.I) {
            ArrayList arrayList3 = this.C0;
            ArrayList arrayList4 = this.D0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        lt0 lt0Var = this.J;
        if (r0Var == lt0Var) {
            lt0Var.r = null;
        }
    }

    public final int X(int i9, int i10, boolean z10) {
        int i11 = i10 + (!z10 ? 1 : -1);
        if (i11 > 6) {
            i11 = !z10 ? 9 : 6;
        }
        return Utilities.clamp(i11, 9, (this.g1 && i9 == 1) ? 1 : 2);
    }

    public final void X0() {
        int i9;
        int i10 = 0;
        while (true) {
            xs0[] xs0VarArr = this.g0;
            if (i10 >= xs0VarArr.length) {
                return;
            }
            dr0 dr0Var = xs0VarArr[i10].h;
            if (dr0Var != null) {
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < dr0Var.getChildCount(); i13++) {
                    View childAt = dr0Var.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.r7) {
                        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) childAt;
                        int messageId = r7Var.getMessageId();
                        i12 = r7Var.getTop();
                        i11 = messageId;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.i7) {
                        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                        int id2 = i7Var.getMessage().getId();
                        i12 = i7Var.getTop();
                        i11 = id2;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.h7) {
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                        i11 = h7Var.getMessage().getId();
                        i12 = h7Var.getTop();
                    }
                    if (i11 != 0) {
                        break;
                    }
                }
                if (i11 != 0) {
                    int i14 = xs0VarArr[i10].B;
                    int i15 = -1;
                    if (p0(i14)) {
                        bu0 k12 = k1(i14);
                        if (k12 != null && k12.s != null) {
                            int i16 = 0;
                            while (true) {
                                if (i16 >= k12.s.i.size()) {
                                    break;
                                }
                                if (i11 == ((MessageObject) k12.s.i.get(i16)).getId()) {
                                    i15 = i16;
                                    break;
                                }
                                i16++;
                            }
                        }
                        i9 = i15;
                    } else if (i14 >= 0) {
                        tt0[] tt0VarArr = this.p1;
                        if (i14 < tt0VarArr.length) {
                            int i17 = 0;
                            while (true) {
                                if (i17 >= tt0VarArr[i14].a.size()) {
                                    break;
                                }
                                if (i11 == ((MessageObject) tt0VarArr[i14].a.get(i17)).getId()) {
                                    i15 = i17;
                                    break;
                                }
                                i17++;
                            }
                            i9 = tt0VarArr[i14].m + i15;
                        }
                    }
                    if (i15 >= 0) {
                        ((f2.m0) dr0Var.getLayoutManager()).h1(i9, (-xs0VarArr[i10].h.getPaddingTop()) + i12);
                        if (this.k1) {
                            xs0 xs0Var = xs0VarArr[i10];
                            xs0Var.s.h1(i9, (-xs0Var.h.getPaddingTop()) + i12);
                        }
                    }
                }
            }
            i10++;
        }
    }

    public final int Y(boolean z10) {
        return this.T1 + (z10 ? AndroidUtilities.dp(52.0f) : 0);
    }

    public final void Y0(int i9) {
        ur0 ur0Var;
        if (this.H1 || (ur0Var = this.E0) == null) {
            return;
        }
        ur0Var.h(null, i9, ur0Var.L.get(i9));
    }

    public final int Z(int i9) {
        int dp = AndroidUtilities.dp(54.0f) + this.X1;
        zq0 zq0Var = this.S;
        return dp + ((int) ((zq0Var == null || !(w0(i9) || i9 == 8)) ? 0.0f : zq0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f))) + (i9 == 9 ? AndroidUtilities.dp(64.0f) : 0);
    }

    public final void Z0(float f10, int i9) {
        ur0 ur0Var = this.E0;
        if (ur0Var != null) {
            ur0Var.j(f10, w0(i9) ? 8 : i9);
        }
        zq0 zq0Var = this.S;
        if (zq0Var != null) {
            m71 m71Var = zq0Var.n;
            if (w0(i9)) {
                m71Var.f(f10, h1(i9));
            } else if (i9 == 8) {
                m71Var.f(f10, 0);
            }
        }
    }

    public final float a0(float f10) {
        int i9;
        int i10;
        int i11;
        int i12;
        float f11 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        xs0[] xs0VarArr = this.g0;
        xs0 xs0Var = xs0VarArr[1];
        vq0 vq0Var = this.R;
        if (xs0Var != null && ((i11 = xs0Var.B) == 0 || (((i11 == 8 || w0(i11)) && TextUtils.isEmpty(getStoriesHashtag())) || (i12 = xs0VarArr[1].B) == 9 || i12 == 11 || i12 == 13 || (i12 == 14 && vq0Var != null)))) {
            f11 = 0.0f + f10;
        }
        xs0 xs0Var2 = xs0VarArr[0];
        return (xs0Var2 == null || !((i9 = xs0Var2.B) == 0 || (((i9 == 8 || w0(i9)) && TextUtils.isEmpty(getStoriesHashtag())) || (i10 = xs0VarArr[0].B) == 9 || i10 == 11 || i10 == 13 || (i10 == 14 && vq0Var != null)))) ? f11 : (1.0f - f10) + f11;
    }

    public final void a1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i9 = 0;
        while (true) {
            xs0[] xs0VarArr = this.g0;
            if (i9 >= xs0VarArr.length) {
                if (this.B == 0) {
                    os0 os0Var = this.T;
                    os0Var.d = chatFull;
                    os0Var.e = arrayList;
                }
                v1(true);
                for (int i10 = 0; i10 < xs0VarArr.length; i10++) {
                    xs0 xs0Var = xs0VarArr[i10];
                    if (xs0Var.B == 7 && xs0Var.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(xs0VarArr[i10].h);
                    }
                }
                return;
            }
            xs0 xs0Var2 = xs0VarArr[i9];
            if (xs0Var2.B == 7 && xs0Var2.h.getAdapter() != null && xs0VarArr[i9].h.getAdapter().h() != 0 && this.r1.getMessagesController().getStoriesController().j.size() > 0) {
                return;
            } else {
                i9++;
            }
        }
    }

    @Override // org.telegram.ui.Cells.n2
    public final boolean b() {
        return false;
    }

    public final float b0(float f10) {
        float f11 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        xs0[] xs0VarArr = this.g0;
        xs0 xs0Var = xs0VarArr[1];
        if (xs0Var != null && s0(xs0Var.B) && xs0VarArr[1].B != 11) {
            f11 = 0.0f + f10;
        }
        xs0 xs0Var2 = xs0VarArr[0];
        return (xs0Var2 == null || !s0(xs0Var2.B) || xs0VarArr[0].B == 11) ? f11 : (1.0f - f10) + f11;
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
        z9 z9Var = this.x0;
        if (z10) {
            z9Var.setVisibility(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.J1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(z9Var, (Property<z9, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.J1.setDuration(180L);
        this.J1.addListener(new u9(19, this, z10));
        this.J1.start();
        if (z10) {
            u1();
        }
    }

    public final int c0(int i9) {
        bu0 k12;
        ih.n6 n6Var;
        if (!p0(i9) || (k12 = k1(i9)) == null || (n6Var = k12.s) == null) {
            return 0;
        }
        return n6Var.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(int i9, boolean z10) {
        int i10;
        xs0 W;
        if (z10 && getY() != 0.0f && this.A == 1) {
            return;
        }
        if (z10 && p0(i9) && c0(i9) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f1);
        bundle.putLong("topic_id", this.B);
        tt0[] tt0VarArr = this.p1;
        if (z10 && (W = W(0)) != null) {
            ArrayList arrayList = tt0VarArr[0].e;
            int L0 = W.x.L0();
            if (L0 >= 0) {
                ct0 ct0Var = null;
                if (arrayList != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        if (L0 <= ((ct0) arrayList.get(i11)).b) {
                            ct0Var = (ct0) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (ct0Var == null) {
                        ct0Var = (ct0) j3.r0.j(1, arrayList);
                    }
                }
                if (ct0Var != null) {
                    i10 = ct0Var.c;
                    if (i9 != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i9 == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    org.telegram.ui.g8 g8Var = new org.telegram.ui.g8(tt0VarArr[0].q, i10, bundle);
                    g8Var.I = new m5.c0(this, 17);
                    this.r1.presentFragment(g8Var);
                }
            }
        }
        i10 = 0;
        if (i9 != 9) {
        }
        org.telegram.ui.g8 g8Var2 = new org.telegram.ui.g8(tt0VarArr[0].q, i10, bundle);
        g8Var2.I = new m5.c0(this, 17);
        this.r1.presentFragment(g8Var2);
    }

    public final void d1(int i9) {
        int h12 = h1(getClosestTab());
        zq0 zq0Var = this.S;
        if (h12 != i9) {
            if (zq0Var != null) {
                zq0Var.n.d(i9, zq0Var.s.i(i9));
                return;
            }
            return;
        }
        zq0Var.setReorderingAlbums(true);
        du0 i12 = i1(i9);
        xs0 W = W(i12.a);
        if (W == null) {
            return;
        }
        dr0 dr0Var = W.h;
        for (int i10 = 0; i10 < dr0Var.getChildCount(); i10++) {
            View childAt = dr0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r7) {
                ((org.telegram.ui.Cells.r7) childAt).l(true, true);
            }
        }
        cu0 cu0Var = i12.c;
        if (cu0Var != null && !cu0Var.x) {
            cu0Var.x = true;
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        dr0 dr0Var;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i11;
        f2.r0 r0Var;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        int size;
        int i14;
        boolean z12;
        dr0 dr0Var2;
        int i15;
        int i16;
        dr0 dr0Var3;
        int i17 = NotificationCenter.mediaDidLoad;
        f2.r0 r0Var2 = this.K;
        f2.r0 r0Var3 = this.I;
        st0 st0Var = this.F;
        f2.r0 r0Var4 = this.H;
        f2.r0 r0Var5 = this.G;
        org.telegram.ui.ActionBar.o2 o2Var = this.r1;
        lt0 lt0Var = this.J;
        js0 js0Var = this.D;
        long j10 = this.f1;
        xs0[] xs0VarArr = this.g0;
        tt0[] tt0VarArr = this.p1;
        if (i9 == i17) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != o2Var.getClassGuid() || intValue2 != tt0VarArr[intValue3].p) {
                if (this.q1 == null || !tt0VarArr[intValue3].a.isEmpty() || tt0VarArr[intValue3].o || !R(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    r0Var2 = js0Var;
                } else if (intValue3 == 1) {
                    r0Var2 = r0Var5;
                } else if (intValue3 == 2) {
                    r0Var2 = r0Var4;
                } else if (intValue3 == 3) {
                    r0Var2 = st0Var;
                } else if (intValue3 == 4) {
                    r0Var2 = r0Var3;
                } else if (intValue3 != 5) {
                    r0Var2 = intValue3 == 15 ? lt0Var : null;
                }
                if (r0Var2 != null) {
                    for (int i18 = 0; i18 < xs0VarArr.length; i18++) {
                        xs0 xs0Var = xs0VarArr[i18];
                        if (xs0Var != null && (dr0Var2 = xs0Var.h) != null && dr0Var2.getAdapter() == r0Var2) {
                            xs0VarArr[i18].h.B0();
                        }
                    }
                    r0Var2.l();
                }
                this.X0 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j10);
            int i19 = longValue == j10 ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                tt0VarArr[intValue3].f[i19] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i15 = intValue3;
                r0Var2 = js0Var;
            } else if (intValue3 == 1) {
                i15 = intValue3;
                r0Var2 = r0Var5;
            } else if (intValue3 == 2) {
                i15 = intValue3;
                r0Var2 = r0Var4;
            } else if (intValue3 == 3) {
                i15 = intValue3;
                r0Var2 = st0Var;
            } else if (intValue3 == 4) {
                i15 = intValue3;
                r0Var2 = r0Var3;
            } else if (intValue3 == 5) {
                i15 = intValue3;
            } else if (intValue3 == 15) {
                r0Var2 = lt0Var;
                i15 = 8;
            } else {
                i15 = intValue3;
                r0Var2 = null;
            }
            int size2 = tt0VarArr[i15].a.size();
            if (r0Var2 != null) {
                i16 = r0Var2.h();
                if (r0Var2 instanceof sk0) {
                    ((sk0) r0Var2).L();
                }
            } else {
                i16 = 0;
            }
            tt0VarArr[i15].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size3);
                    if (tt0VarArr[i15].a(messageObject2, i19, r13, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject2.getId(), r13);
                        tt0 tt0Var = tt0VarArr[i15];
                        int i20 = tt0Var.m - r13;
                        tt0Var.m = i20;
                        if (i20 < 0) {
                            tt0Var.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                tt0VarArr[i15].l = ((Boolean) objArr[5]).booleanValue();
                tt0 tt0Var2 = tt0VarArr[i15];
                if (tt0Var2.l) {
                    tt0Var2.m = 0;
                }
            } else {
                for (int i21 = 0; i21 < arrayList.size(); i21++) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i21);
                    if (tt0VarArr[i15].a(messageObject3, i19, false, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject3.getId(), true);
                        tt0 tt0Var3 = tt0VarArr[i15];
                        int i22 = tt0Var3.n - 1;
                        tt0Var3.n = i22;
                        if (i22 < 0) {
                            tt0Var3.n = 0;
                        }
                    }
                }
                tt0 tt0Var4 = tt0VarArr[i15];
                if (tt0Var4.o && tt0Var4.a.size() > 0) {
                    tt0 tt0Var5 = tt0VarArr[i15];
                    tt0Var5.k = ((MessageObject) tt0Var5.a.get(0)).getId();
                }
                tt0VarArr[i15].i[i19] = ((Boolean) objArr[5]).booleanValue();
                tt0 tt0Var6 = tt0VarArr[i15];
                if (tt0Var6.i[i19]) {
                    int size4 = tt0Var6.b[i19].size();
                    if (i19 == 0) {
                        size4 += tt0VarArr[i15].m;
                    }
                    tt0VarArr[i15].f[i19] = size4;
                }
            }
            if (!booleanValue && i19 == 0) {
                tt0 tt0Var7 = tt0VarArr[i15];
                if (tt0Var7.i[i19] && this.Y0 != 0) {
                    tt0Var7.g = true;
                    o2Var.getMediaDataController().loadMedia(this.Y0, 50, tt0VarArr[i15].j[1], 0, i15, this.B, 1, o2Var.getClassGuid(), tt0VarArr[i15].p, null, null);
                }
            }
            int i23 = i15;
            if (r0Var2 != null) {
                ws0 ws0Var = null;
                for (int i24 = 0; i24 < xs0VarArr.length; i24++) {
                    xs0 xs0Var2 = xs0VarArr[i24];
                    if (xs0Var2 != null && (dr0Var3 = xs0Var2.h) != null && dr0Var3.getAdapter() == r0Var2) {
                        ws0 ws0Var2 = xs0VarArr[i24].h;
                        ws0Var2.B0();
                        ws0Var = ws0Var2;
                    }
                }
                int h = r0Var2.h();
                if (r0Var2 != js0Var) {
                    try {
                        r0Var2.l();
                    } catch (Throwable unused) {
                    }
                } else if (js0Var.h() == i16) {
                    AndroidUtilities.updateVisibleRows(ws0Var);
                } else {
                    js0Var.l();
                }
                if (!tt0VarArr[i23].a.isEmpty() || tt0VarArr[i23].g) {
                    if (ws0Var != null && (r0Var2 == js0Var || h >= i16)) {
                        z(ws0Var, i16, sparseBooleanArray);
                    }
                } else if (ws0Var != null) {
                    z(ws0Var, i16, sparseBooleanArray);
                }
                if (ws0Var != null && !tt0VarArr[i23].o) {
                    if (size2 == 0) {
                        for (int i25 = 0; i25 < 2; i25++) {
                            if (xs0VarArr[i25].B == 0) {
                                ((f2.m0) ws0Var.getLayoutManager()).h1(js0Var.L(0), 0);
                            }
                        }
                    } else {
                        X0();
                    }
                }
            }
            tt0 tt0Var8 = tt0VarArr[i23];
            if (tt0Var8.o) {
                if (tt0Var8.a.size() == 0) {
                    A0(i23);
                } else {
                    tt0VarArr[i23].o = false;
                }
            }
            this.X0 = true;
            return;
        }
        if (i9 == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat chat = DialogObject.isChatDialog(j10) ? o2Var.getMessagesController().getChat(Long.valueOf(-j10)) : null;
            long longValue2 = ((Long) objArr[1]).longValue();
            if (ChatObject.isChannel(chat)) {
                if (longValue2 == 0 && this.Y0 != 0) {
                    i13 = 1;
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    size = arrayList2.size();
                    int i26 = -1;
                    i14 = 0;
                    z12 = false;
                    while (i14 < size) {
                        js0 js0Var2 = js0Var;
                        int i27 = 0;
                        while (i27 < tt0VarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (tt0VarArr[i27].b(((Integer) arrayList2.get(i14)).intValue(), i13) != null) {
                                i26 = i27;
                                z12 = true;
                            }
                            i27++;
                            arrayList2 = arrayList3;
                        }
                        i14++;
                        js0Var = js0Var2;
                    }
                    js0 js0Var3 = js0Var;
                    if (z12) {
                        this.X0 = true;
                        if (js0Var3 != null) {
                            js0Var3.l();
                        }
                        if (r0Var5 != null) {
                            r0Var5.l();
                        }
                        if (r0Var4 != null) {
                            r0Var4.l();
                        }
                        if (st0Var != null) {
                            st0Var.X(false);
                        }
                        if (r0Var3 != null) {
                            r0Var3.l();
                        }
                        if (lt0Var != null) {
                            lt0Var.l();
                        }
                        if (r0Var2 != null) {
                            r0Var2.l();
                        }
                        if (i26 == 0 || i26 == 1 || i26 == 2 || i26 == 4) {
                            z0(true);
                        }
                    }
                    W(i26);
                    return;
                }
                if (longValue2 != chat.id) {
                    return;
                }
            } else if (longValue2 != 0) {
                return;
            }
            i13 = 0;
            ArrayList arrayList22 = (ArrayList) objArr[0];
            size = arrayList22.size();
            int i262 = -1;
            i14 = 0;
            z12 = false;
            while (i14 < size) {
            }
            js0 js0Var32 = js0Var;
            if (z12) {
            }
            W(i262);
            return;
        }
        if (i9 == NotificationCenter.didReceiveNewMessages) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == j10) {
                ArrayList arrayList4 = (ArrayList) objArr[1];
                boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j10);
                int i28 = 0;
                boolean z13 = false;
                while (i28 < arrayList4.size()) {
                    MessageObject messageObject4 = (MessageObject) arrayList4.get(i28);
                    ArrayList arrayList5 = arrayList4;
                    if (MessageObject.getMedia(messageObject4.messageOwner) == null || messageObject4.needDrawBluredPreview()) {
                        i12 = i28;
                    } else {
                        int mediaType = MediaDataController.getMediaType(messageObject4.messageOwner);
                        i12 = i28;
                        if (mediaType == -1) {
                            return;
                        }
                        tt0 tt0Var9 = tt0VarArr[mediaType];
                        if (tt0Var9.l) {
                            z11 = z13;
                            if (tt0Var9.a(messageObject4, messageObject4.getDialogId() == j10 ? 0 : 1, true, isEncryptedDialog2)) {
                                this.T0[mediaType] = 1;
                                z10 = true;
                                i28 = i12 + 1;
                                z13 = z10;
                                arrayList4 = arrayList5;
                            }
                            z10 = z11;
                            i28 = i12 + 1;
                            z13 = z10;
                            arrayList4 = arrayList5;
                        }
                    }
                    z11 = z13;
                    z10 = z11;
                    i28 = i12 + 1;
                    z13 = z10;
                    arrayList4 = arrayList5;
                }
                boolean z14 = z13;
                int i29 = 1;
                if (z14) {
                    this.X0 = true;
                    int i30 = 0;
                    while (i30 < xs0VarArr.length) {
                        int i31 = xs0VarArr[i30].B;
                        if (i31 == 0) {
                            r0Var = js0Var;
                        } else if (i31 == i29) {
                            r0Var = r0Var5;
                        } else if (i31 == 2) {
                            r0Var = r0Var4;
                        } else if (i31 == 3) {
                            r0Var = st0Var;
                        } else {
                            if (i31 == 4) {
                                r0Var = r0Var3;
                            } else if (i31 == 5) {
                                r0Var = r0Var2;
                            } else {
                                r0Var = i31 == 15 ? lt0Var : null;
                                if (r0Var != null) {
                                    r0Var.h();
                                    js0Var.l();
                                    r0Var5.l();
                                    r0Var4.l();
                                    st0Var.X(false);
                                    r0Var3.l();
                                    lt0Var.l();
                                    r0Var2.l();
                                }
                                i30++;
                                i29 = 1;
                            }
                            if (r0Var != null) {
                            }
                            i30++;
                            i29 = 1;
                        }
                        if (r0Var != null) {
                        }
                        i30++;
                        i29 = 1;
                    }
                    v1(true);
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.messageReceivedByServer) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l10 = (Long) objArr[3];
            if (l10.longValue() == j10 || l10.longValue() == this.Y0) {
                int i32 = l10.longValue() == j10 ? 0 : 1;
                for (tt0 tt0Var10 : tt0VarArr) {
                    tt0Var10.f(i32, num.intValue(), num2.intValue());
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.messagePlayingDidStart || i9 == NotificationCenter.messagePlayingPlayStateChanged || i9 == NotificationCenter.messagePlayingDidReset) {
            if (i9 != NotificationCenter.messagePlayingDidReset && i9 != NotificationCenter.messagePlayingPlayStateChanged) {
                if (((MessageObject) objArr[0]).eventId != 0) {
                    return;
                }
                for (int i33 = 0; i33 < xs0VarArr.length; i33++) {
                    int childCount = xs0VarArr[i33].h.getChildCount();
                    for (int i34 = 0; i34 < childCount; i34++) {
                        View childAt = xs0VarArr[i33].h.getChildAt(i34);
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
            for (int i35 = 0; i35 < xs0VarArr.length; i35++) {
                xs0 xs0Var3 = xs0VarArr[i35];
                if (xs0Var3 != null && (dr0Var = xs0Var3.h) != null) {
                    int childCount2 = dr0Var.getChildCount();
                    for (int i36 = 0; i36 < childCount2; i36++) {
                        View childAt2 = xs0VarArr[i35].h.getChildAt(i36);
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
        if (i9 == NotificationCenter.storiesListUpdated) {
            ih.n6 n6Var = (ih.n6) objArr[0];
            ms0 ms0Var = this.V;
            if (ms0Var == null || n6Var != ms0Var.s) {
                tq0 tq0Var = this.a0;
                if (tq0Var == null || n6Var != tq0Var.s) {
                    Iterator it = this.U1.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = -1;
                            break;
                        }
                        du0 du0Var = (du0) it.next();
                        if (du0Var.c.s == n6Var) {
                            i11 = du0Var.a;
                            break;
                        }
                    }
                } else {
                    i11 = 9;
                }
            } else {
                i11 = 8;
            }
            xs0 W = W(i11);
            if (W != null) {
                if (W.b != (n6Var.g() > 0)) {
                    W.b = n6Var.g() > 0;
                    o1(W, true);
                }
            }
            if (W != null) {
                AndroidUtilities.notifyDataSetChanged(W.h);
                if (W.h.getLayoutManager() instanceof f2.m0) {
                    wk0 wk0Var = W.h;
                    G(W, wk0Var, (f2.m0) wk0Var.getLayoutManager());
                }
            }
            qs0 qs0Var = this.z1;
            if (qs0Var != null) {
                qs0Var.Q();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.storiesUpdated) {
            for (xs0 xs0Var4 : xs0VarArr) {
                if (xs0Var4 != null && xs0Var4.h != null && p0(xs0Var4.B)) {
                    if (!r0() || xs0Var4.h.getAdapter() == null) {
                        for (int i37 = 0; i37 < xs0Var4.h.getChildCount(); i37++) {
                            View childAt3 = xs0Var4.h.getChildAt(i37);
                            if (childAt3 instanceof org.telegram.ui.Cells.r7) {
                                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) childAt3;
                                i6 i6Var = r7Var.J;
                                if (!r7Var.W || (messageObject = r7Var.n) == null || (storyItem = messageObject.storyItem) == null || (storyViews = storyItem.views) == null) {
                                    r7Var.H = false;
                                    i6Var.q("", false, true);
                                } else {
                                    int i38 = storyViews.views_count;
                                    r7Var.H = i38 > 0;
                                    i6Var.q(AndroidUtilities.formatWholeNumber(i38, 0), true, true);
                                }
                            }
                        }
                    } else {
                        AndroidUtilities.notifyDataSetChanged(xs0Var4.h);
                    }
                }
            }
            return;
        }
        if (i9 == NotificationCenter.channelRecommendationsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
                this.M.E(true);
                v1(true);
                F();
                return;
            }
            return;
        }
        int i39 = NotificationCenter.savedMessagesDialogsUpdate;
        ot0 ot0Var = this.N;
        if (i9 == i39) {
            if (j10 == 0 || j10 == o2Var.getUserConfig().getClientUserId()) {
                ot0Var.F(true);
                v1(true);
                F();
                L0();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.dialogsNeedReload) {
            ot0Var.F(true);
            return;
        }
        if (i9 == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
                v1(true);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.updatedChatRanks) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[1]).longValue();
            if (j10 != (-longValue3)) {
                return;
            }
            String str = (String) objArr[2];
            os0 os0Var = this.T;
            if (os0Var != null) {
                TLRPC.ChatFull chatFull = os0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i40 = 0; i40 < os0Var.d.participants.participants.size(); i40++) {
                        os0Var.d.participants.participants.get(i40).setRank(longValue4, str);
                    }
                }
                for (xs0 xs0Var5 : xs0VarArr) {
                    if (xs0Var5.B == 7) {
                        AndroidUtilities.updateVisibleRows(xs0Var5.h);
                    }
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.didUpdatePollResults) {
            long longValue5 = ((Long) objArr[0]).longValue();
            TLRPC.TL_poll tL_poll = (TLRPC.TL_poll) objArr[1];
            TLRPC.PollResults pollResults = (TLRPC.PollResults) objArr[2];
            for (int i41 = 0; i41 < xs0VarArr.length; i41++) {
                if (xs0VarArr[i41].h.getAdapter() == lt0Var) {
                    dr0 dr0Var4 = xs0VarArr[i41].h;
                    ArrayList arrayList6 = lt0Var.n;
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
                                lt0Var.m(i42);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ur0 ur0Var = this.E0;
        if (ur0Var != null) {
            canvas.save();
            canvas.translate(ur0Var.getX(), ur0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        qr0 qr0Var = this.N0;
        if (qr0Var != null) {
            int i9 = qr0Var.P;
            if ((i9 == 3 || i9 == 1) && this.L0 == null) {
                canvas.save();
                canvas.translate(qr0Var.getX(), qr0Var.getY());
                qr0Var.setDrawOverlay(true);
                qr0Var.draw(canvas);
                qr0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i9;
        if (view != this.N0 || this.L0 != null) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        xs0[] xs0VarArr = this.g0;
        float top = xs0VarArr[0].getTop();
        zq0 zq0Var = this.S;
        if (zq0Var != null && ((i9 = xs0VarArr[0].B) == 8 || w0(i9))) {
            top -= zq0Var.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(org.telegram.ui.Cells.r2 r2Var) {
        org.telegram.ui.ActionBar.o2 o2Var = this.r1;
        if (o2Var != null && o2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            o2Var.getOrCreateStoryViewer().getClass();
            ih.m9 orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
            Context context = o2Var.getContext();
            long dialogId = r2Var.getDialogId();
            ih.e7 a3 = ih.e7.a((wk0) r2Var.getParent());
            a3.s += ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).o1) ? AndroidUtilities.dp(68.0f) : 0;
            orCreateStoryViewer.D(context, dialogId, a3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r1 = r2[r1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1(boolean z10) {
        xs0[] xs0VarArr;
        xs0 xs0Var;
        if (this.k1) {
            return;
        }
        int i9 = 0;
        while (true) {
            xs0VarArr = this.g0;
            if (i9 >= xs0VarArr.length) {
                xs0Var = null;
                break;
            }
            int i10 = xs0VarArr[i9].B;
            if (i10 == 0 || p0(i10)) {
                break;
            } else {
                i9++;
            }
        }
        if (xs0Var != null) {
            int i11 = xs0Var.B;
            this.l1 = i11;
            boolean p02 = p0(i11);
            int[] iArr = this.i1;
            int X = X(p02 ? 1 : 0, iArr[p02 ? 1 : 0], z10);
            this.m1 = X;
            if (X != iArr[p02 ? 1 : 0]) {
                if (this.g1 && p0(this.l1)) {
                    return;
                }
                xs0Var.r.setVisibility(0);
                if (p0(this.l1)) {
                    xs0Var.r.setAdapter(l1(this.l1));
                } else {
                    xs0Var.r.setAdapter(this.E);
                }
                ws0 ws0Var = xs0Var.r;
                ws0Var.setPadding(ws0Var.getPaddingLeft(), Z(this.l1), xs0Var.r.getPaddingRight(), Y(v0()));
                xs0Var.s.y1(X);
                xs0Var.r.a0();
                xs0Var.s.O = new sr0(this, xs0Var, 0);
                AndroidUtilities.updateVisibleRows(xs0Var.h);
                this.k1 = true;
                if (this.l1 == 0) {
                    this.p1[0].g(true);
                }
                this.j1 = 0.0f;
                if (this.s < 0) {
                    X0();
                    return;
                }
                for (xs0 xs0Var2 : xs0VarArr) {
                    if (xs0Var2.B == this.l1) {
                        xs0Var2.s.h1(this.s, this.v - xs0Var2.r.getPaddingTop());
                    }
                }
            }
        }
    }

    public final float f0(int i9, boolean z10) {
        float width = getWidth();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            xs0[] xs0VarArr = this.g0;
            if (i10 >= xs0VarArr.length) {
                break;
            }
            xs0 xs0Var = xs0VarArr[i10];
            if (xs0Var != null) {
                int i12 = xs0Var.B;
                if ((z10 && i9 == 8 && w0(i12)) || i12 == i9) {
                    i11++;
                    width = xs0VarArr[i10].getTranslationX();
                }
            }
            i10++;
        }
        if (i11 == 2) {
            return 0.0f;
        }
        return width;
    }

    public final void f1() {
        int i9 = 0;
        while (true) {
            xs0[] xs0VarArr = this.g0;
            if (i9 >= xs0VarArr.length) {
                return;
            }
            int childCount = xs0VarArr[i9].h.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = xs0VarArr[i9].h.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.e2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) childAt).getPhotoImage();
                    if (i9 == 0) {
                        photoImage.setAllowStartAnimation(true);
                        photoImage.startAnimation();
                    } else {
                        photoImage.setAllowStartAnimation(false);
                        photoImage.stopAnimation();
                    }
                }
            }
            i9++;
        }
    }

    public final float g0(int i9, boolean z10) {
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            xs0[] xs0VarArr = this.g0;
            if (i10 >= xs0VarArr.length) {
                return f10;
            }
            xs0 xs0Var = xs0VarArr[i10];
            if (xs0Var != null) {
                int i11 = xs0Var.B;
                if ((z10 && i9 == 8 && w0(i11)) || i11 == i9) {
                    f10 = (1.0f - Math.abs(xs0VarArr[i10].getTranslationX() / getWidth())) + f10;
                }
            }
            i10++;
        }
    }

    public final void g1(MotionEvent motionEvent) {
        float f10;
        float f11;
        float measuredWidth;
        VelocityTracker velocityTracker = this.x1;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.O0);
        int i9 = 1;
        if (motionEvent == null || motionEvent.getAction() == 3) {
            f10 = 0.0f;
            f11 = 0.0f;
        } else {
            f10 = this.x1.getXVelocity();
            f11 = this.x1.getYVelocity();
            if (!this.t1 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                U0(motionEvent, f10 < 0.0f);
            }
        }
        if (this.t1) {
            xs0[] xs0VarArr = this.g0;
            float x10 = xs0VarArr[0].getX();
            this.b1 = new AnimatorSet();
            this.e1 = Math.abs(x10) < ((float) xs0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new q60(this, 19));
            boolean z10 = this.e1;
            Property property = View.TRANSLATION_X;
            if (z10) {
                measuredWidth = Math.abs(x10);
                if (this.d1) {
                    this.b1.playTogether(ObjectAnimator.ofFloat(xs0VarArr[0], (Property<xs0, Float>) property, 0.0f), ObjectAnimator.ofFloat(xs0VarArr[1], (Property<xs0, Float>) property, r14.getMeasuredWidth()), ofFloat);
                } else {
                    this.b1.playTogether(ObjectAnimator.ofFloat(xs0VarArr[0], (Property<xs0, Float>) property, 0.0f), ObjectAnimator.ofFloat(xs0VarArr[1], (Property<xs0, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = xs0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.d1) {
                    this.b1.playTogether(ObjectAnimator.ofFloat(xs0VarArr[0], (Property<xs0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(xs0VarArr[1], (Property<xs0, Float>) property, 0.0f), ofFloat);
                } else {
                    this.b1.playTogether(ObjectAnimator.ofFloat(xs0VarArr[0], (Property<xs0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(xs0VarArr[1], (Property<xs0, Float>) property, 0.0f), ofFloat);
                }
            }
            this.b1.setInterpolator(a2);
            int measuredWidth2 = getMeasuredWidth();
            float f12 = measuredWidth2 / 2;
            float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
            this.b1.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r0) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.b1.addListener(new xr0(this, i9));
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
        xs0 xs0Var;
        xs0 xs0Var2;
        ih.n6 n6Var;
        ih.n6 n6Var2;
        float f10 = 1.0f;
        xs0[] xs0VarArr = this.g0;
        if (xs0VarArr == null || (xs0Var = xs0VarArr[0]) == null || (xs0Var2 = xs0VarArr[1]) == null || xs0Var.w == null || xs0Var2.w == null) {
            return 1.0f;
        }
        int i9 = xs0Var.B;
        int i10 = xs0Var2.B;
        boolean z10 = w0(i9) || i9 == 8;
        boolean z11 = w0(i10) || i10 == 8;
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - xs0VarArr[0].w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - xs0VarArr[1].w.getVisibilityFactor();
        bu0 k12 = k1(xs0VarArr[0].B);
        if (i9 == 8 || (k12 != null && (n6Var2 = k12.s) != null && n6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        bu0 k13 = k1(i10);
        if (i10 != 8 && (k13 == null || (n6Var = k13.s) == null || n6Var.g() <= 0)) {
            f10 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f10;
        }
        if (!z11) {
            f10 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f10, Math.abs(xs0VarArr[0].getTranslationX() / xs0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        xs0[] xs0VarArr = this.g0;
        xs0 xs0Var = xs0VarArr[1];
        if (xs0Var != null && xs0Var.getVisibility() == 0) {
            if (this.c1 && !this.e1) {
                return xs0VarArr[1].B;
            }
            if (Math.abs(xs0VarArr[1].getTranslationX()) < xs0VarArr[1].getMeasuredWidth() / 2.0f) {
                return xs0VarArr[1].B;
            }
        }
        return getSelectedTab();
    }

    public wk0 getCurrentListView() {
        ks0 ks0Var;
        xs0 xs0Var = this.g0[0];
        int i9 = xs0Var.B;
        return i9 == 13 ? this.Q.getCurrentListView() : i9 == 14 ? this.R.getCurrentListView() : (i9 != 12 || (ks0Var = this.P) == null) ? xs0Var.h : ks0Var.a.t0;
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

    public pi0 getSearchOptionsItem() {
        return this.o0;
    }

    public int getSelectedTab() {
        int currentTabId = this.E0.getCurrentTabId();
        zq0 zq0Var = this.S;
        if (zq0Var == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = zq0Var.getCurrentAlbumId();
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
        float f10 = 0.0f;
        int i9 = 0;
        while (true) {
            xs0[] xs0VarArr = this.g0;
            if (i9 >= xs0VarArr.length) {
                return f10;
            }
            xs0 xs0Var = xs0VarArr[i9];
            if (xs0Var != null) {
                f10 = ((1.0f - Math.abs(xs0Var.getTranslationX() / getWidth())) * xs0Var.B) + f10;
            }
            i9++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.h6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.w0, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.z6));
        org.telegram.ui.ActionBar.w0 w0Var = this.h0;
        pi0 iconView = w0Var.getIconView();
        int i9 = org.telegram.ui.ActionBar.f6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(iconView, 8, null, null, null, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.z8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var, 32, null, null, null, null, i10));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.q0;
        if (w0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2.getIconView(), 8, null, null, null, null, i9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 32, null, null, null, null, i10));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.p0;
        if (w0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var3.getIconView(), 8, null, null, null, null, i9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var3, 32, null, null, null, null, i10));
        }
        Drawable[] drawableArr = {this.z0};
        ImageView imageView = this.y0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 8, null, null, drawableArr, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 32, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.x0, 1, null, null, null, null, i11));
        ur0 ur0Var = this.E0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(ur0Var, 1, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.wc;
        org.telegram.ui.Cells.w0 w0Var4 = this.G0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var4, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var4, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.kd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ur0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ur0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.f6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ur0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.f6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ur0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.f6.Hh));
        qr0 qr0Var = this.N0;
        if (qr0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(qr0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.v7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(qr0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.w7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(qr0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.u7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(qr0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.t7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(qr0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.x7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(qr0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.y7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(qr0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A7));
        }
        final int i13 = 0;
        while (true) {
            xs0[] xs0VarArr = this.g0;
            if (i13 >= xs0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.g6 g6Var = new org.telegram.ui.ActionBar.g6() { // from class: org.telegram.ui.Components.pq0
                @Override // org.telegram.ui.ActionBar.g6
                public final void b() {
                    xs0[] xs0VarArr2 = eu0.this.g0;
                    int i14 = i13;
                    dr0 dr0Var = xs0VarArr2[i14].h;
                    if (dr0Var != null) {
                        int childCount = dr0Var.getChildCount();
                        for (int i15 = 0; i15 < childCount; i15++) {
                            View childAt = xs0VarArr2[i14].h.getChildAt(i15);
                            if (childAt instanceof org.telegram.ui.Cells.s7) {
                                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                                for (int i16 = 0; i16 < 6; i16++) {
                                    s7Var.a[i16].e.invalidate();
                                }
                            } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                                ((org.telegram.ui.Cells.h6) childAt).u(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.va) {
                                ((org.telegram.ui.Cells.va) childAt).j(0);
                            }
                        }
                    }
                }

                @Override // org.telegram.ui.ActionBar.g6
                public final /* synthetic */ void a(float f10) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
            mr0 mr0Var = xs0VarArr[i13].v;
            int i14 = org.telegram.ui.ActionBar.f6.d6;
            arrayList.add(new org.telegram.ui.ActionBar.h6(mr0Var, 0, null, null, null, null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].w, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.c7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 524304, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.f6.e7));
            int i15 = org.telegram.ui.ActionBar.f6.h6;
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 4, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.uh));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.m6));
            int i16 = org.telegram.ui.ActionBar.f6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i16));
            int i17 = org.telegram.ui.ActionBar.f6.y6;
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, g6Var, i17));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, g6Var, org.telegram.ui.ActionBar.f6.n6));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.f6.r0;
            int i18 = org.telegram.ui.ActionBar.f6.J7;
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, drawableArr2, null, i18));
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.f6.B0;
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.f6.D0}, null, -1, null, org.telegram.ui.ActionBar.f6.X8));
            TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.f6.C0;
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.f6.E0}, null, -1, null, org.telegram.ui.ActionBar.f6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, drawableArr2, null, i18));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.U7));
            int i19 = org.telegram.ui.ActionBar.f6.z6;
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 4, new Class[]{rs0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i19));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A6));
            int i20 = org.telegram.ui.ActionBar.f6.Ih;
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 2048, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"progressView"}, null, null, -1, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"statusImageView"}, null, null, -1, null, i20));
            int i21 = org.telegram.ui.ActionBar.f6.i7;
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i21));
            int i22 = org.telegram.ui.ActionBar.f6.k7;
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.zi));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Bi));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i21));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.f6.f3, null, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.f6.g3, null, null, i19));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i21));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, null, null, null, org.telegram.ui.ActionBar.f6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, org.telegram.ui.ActionBar.f6.m0, null, null, org.telegram.ui.ActionBar.f6.K6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Kh));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 32, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Jh));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 524304, new Class[]{org.telegram.ui.Cells.m7.class}, null, null, null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i16));
            int i23 = org.telegram.ui.ActionBar.f6.Lh;
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.s7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.s7.class}, null, null, g6Var, i21));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.s7.class}, null, null, g6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, g6Var, i21));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, g6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, null, null, new Drawable[]{this.u0}, null, org.telegram.ui.ActionBar.f6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].w.d, 4, null, null, null, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].w.e, 4, null, null, null, null, i17));
            i13++;
        }
    }

    public final int h0(int i9) {
        org.telegram.ui.ActionBar.b6 b6Var = this.B1;
        return b6Var != null ? b6Var.N0(i9) : org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    public final int h1(int i9) {
        du0 j12 = j1(i9);
        if (j12 == null) {
            return -1;
        }
        return j12.b;
    }

    public final boolean i0() {
        return this.r1.getConnectionsManager().getConnectionState() == 3;
    }

    public final du0 i1(int i9) {
        Integer valueOf = Integer.valueOf(i9);
        HashMap hashMap = this.U1;
        du0 du0Var = (du0) hashMap.get(valueOf);
        if (du0Var != null) {
            return du0Var;
        }
        du0 du0Var2 = new du0(this, getContext(), i9);
        hashMap.put(Integer.valueOf(i9), du0Var2);
        this.V1.put(Integer.valueOf(du0Var2.a), Integer.valueOf(i9));
        return du0Var2;
    }

    public final boolean j0() {
        SparseArray[] sparseArrayArr;
        MessageObject messageObject;
        TLRPC.Message message;
        boolean z10 = false;
        for (int i9 = 1; i9 >= 0; i9--) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                sparseArrayArr = this.V0;
                if (i10 >= sparseArrayArr[i9].size()) {
                    break;
                }
                arrayList.add(Integer.valueOf(sparseArrayArr[i9].keyAt(i10)));
                i10++;
            }
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList.get(i11);
                i11++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0 && (messageObject = (MessageObject) sparseArrayArr[i9].get(num.intValue())) != null && (message = messageObject.messageOwner) != null && message.noforwards) {
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

    public final du0 j1(int i9) {
        Integer num = (Integer) this.V1.get(Integer.valueOf(i9));
        if (num == null) {
            return null;
        }
        return (du0) this.U1.get(num);
    }

    public final void k0() {
        AndroidUtilities.cancelRunOnUIThread(this.I0);
        org.telegram.ui.Cells.w0 w0Var = this.G0;
        if (w0Var.getTag() == null) {
            return;
        }
        w0Var.setTag(null);
        AnimatorSet animatorSet = this.H0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.H0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.H0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.H0.playTogether(ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.Cells.w0, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(w0Var, (Property<org.telegram.ui.Cells.w0, Float>) View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.K0));
        this.H0.setInterpolator(gr.g);
        this.H0.addListener(new xr0(this, 0));
        this.H0.start();
    }

    public final bu0 k1(int i9) {
        du0 j12;
        if (i9 == 8) {
            return this.V;
        }
        if (i9 == 9) {
            return this.a0;
        }
        if (!w0(i9) || (j12 = j1(i9)) == null) {
            return null;
        }
        return j12.c;
    }

    public boolean l0() {
        return false;
    }

    public final bu0 l1(int i9) {
        du0 j12;
        if (i9 == 8) {
            return this.W;
        }
        if (i9 == 9) {
            return this.b0;
        }
        if (!w0(i9) || (j12 = j1(i9)) == null) {
            return null;
        }
        return j12.d;
    }

    public boolean m0() {
        return !(this instanceof i30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [f2.w0, org.telegram.ui.Components.wk0, org.telegram.ui.Components.ws0] */
    /* JADX WARN: Type inference failed for: r5v85 */
    public final void m1(boolean z10) {
        xs0[] xs0VarArr;
        xs0[] xs0VarArr2;
        f2.f1 f1Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        tt0[] tt0VarArr;
        String str;
        ?? r52;
        int i9;
        boolean z15;
        boolean z16;
        int i10;
        boolean z17;
        f2.f1 f1Var2;
        int i11;
        int i12;
        boolean z18;
        vq0 vq0Var = this.R;
        if (vq0Var != null) {
            vq0Var.i();
        }
        int i13 = 0;
        while (true) {
            xs0VarArr = this.g0;
            if (i13 >= xs0VarArr.length) {
                break;
            }
            xs0VarArr[i13].h.B0();
            i13++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xs0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(B0());
        f2.r0 adapter = xs0VarArr[z10 ? 1 : 0].h.getAdapter();
        f2.r0 r0Var = this.V;
        f2.h0 h0Var = this.U;
        if (adapter == r0Var) {
            h0Var.d(null);
        }
        boolean z19 = this.R0;
        qs0 qs0Var = this.z1;
        lt0 lt0Var = this.J;
        org.telegram.ui.ActionBar.w0 w0Var = this.j0;
        int i14 = 100;
        if (z19 && this.Q0) {
            xs0 xs0Var = xs0VarArr[z10 ? 1 : 0];
            if (xs0Var.f == null) {
                xs0Var.f = new f2.f1();
            }
            xs0 xs0Var2 = xs0VarArr[z10 ? 1 : 0];
            f1Var2 = xs0Var2.f;
            pt0 pt0Var = this.O;
            vs0 vs0Var = this.f0;
            at0 at0Var = this.d0;
            at0 at0Var2 = this.e0;
            at0 at0Var3 = this.c0;
            if (z10) {
                int i15 = xs0Var2.B;
                if (i15 == 0 || i15 == 2 || i15 == 5 || i15 == 6 || (i15 == 7 && !qs0Var.S())) {
                    this.R0 = false;
                    rr0 rr0Var = this.F0;
                    if (rr0Var != null) {
                        rr0Var.g(false);
                    }
                    this.Q0 = false;
                    m1(true);
                    return;
                }
                String obj = w0Var != null ? w0Var.getSearchField().getText().toString() : "";
                int i16 = xs0VarArr[z10 ? 1 : 0].B;
                if (i16 == 1) {
                    if (at0Var3 != null) {
                        at0Var3.G(obj, false);
                        if (adapter != at0Var3) {
                            W0(adapter);
                            xs0VarArr[z10 ? 1 : 0].h.setAdapter(at0Var3);
                        }
                    }
                } else if (i16 == 3) {
                    if (at0Var2 != null) {
                        at0Var2.G(obj, false);
                        if (adapter != at0Var2) {
                            W0(adapter);
                            xs0VarArr[z10 ? 1 : 0].h.setAdapter(at0Var2);
                        }
                    }
                } else if (i16 == 4) {
                    if (at0Var != null) {
                        at0Var.G(obj, false);
                        if (adapter != at0Var) {
                            W0(adapter);
                            xs0VarArr[z10 ? 1 : 0].h.setAdapter(at0Var);
                        }
                    }
                } else if (i16 == 7) {
                    if (vs0Var != null) {
                        vs0Var.F(obj, false);
                        if (adapter != vs0Var) {
                            W0(adapter);
                            xs0VarArr[z10 ? 1 : 0].h.setAdapter(vs0Var);
                        }
                    }
                } else if (i16 == 11) {
                    if (pt0Var != null) {
                        pt0Var.E(this.S0, obj);
                        if (adapter != pt0Var) {
                            W0(adapter);
                            xs0VarArr[z10 ? 1 : 0].h.setAdapter(pt0Var);
                        }
                    }
                } else if (i16 == 15 && lt0Var != null && adapter != lt0Var) {
                    W0(adapter);
                    dr0 dr0Var = xs0VarArr[z10 ? 1 : 0].h;
                    lt0Var.r = dr0Var;
                    dr0Var.setAdapter(lt0Var);
                }
            } else if (xs0Var2.h != null) {
                int i17 = xs0Var2.B;
                if (i17 == 1) {
                    if (adapter != at0Var3) {
                        W0(adapter);
                        xs0VarArr[z10 ? 1 : 0].h.setAdapter(at0Var3);
                    }
                    at0Var3.l();
                } else if (i17 == 3) {
                    if (adapter != at0Var2) {
                        W0(adapter);
                        xs0VarArr[z10 ? 1 : 0].h.setAdapter(at0Var2);
                    }
                    at0Var2.l();
                } else if (i17 == 4) {
                    if (adapter != at0Var) {
                        W0(adapter);
                        xs0VarArr[z10 ? 1 : 0].h.setAdapter(at0Var);
                    }
                    at0Var.l();
                } else if (i17 == 7) {
                    if (adapter != vs0Var) {
                        W0(adapter);
                        xs0VarArr[z10 ? 1 : 0].h.setAdapter(vs0Var);
                    }
                    vs0Var.l();
                } else if (i17 == 11) {
                    if (adapter != pt0Var) {
                        W0(adapter);
                        xs0VarArr[z10 ? 1 : 0].h.setAdapter(pt0Var);
                    }
                    pt0Var.l();
                }
            }
            xs0VarArr2 = xs0VarArr;
            z17 = false;
            z16 = false;
            i10 = 100;
        } else {
            xs0 xs0Var3 = xs0VarArr[z10 ? 1 : 0];
            if (xs0Var3.e == null) {
                xs0Var3.e = new f2.f1();
            }
            xs0 xs0Var4 = xs0VarArr[z10 ? 1 : 0];
            f2.f1 f1Var3 = xs0Var4.e;
            xs0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i18 = xs0VarArr[z10 ? 1 : 0].B;
            if (i18 == 8 || w0(i18)) {
                layoutParams.topMargin = AndroidUtilities.dp(B0());
            }
            dr0 dr0Var2 = xs0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = dr0Var2.getPaddingLeft();
            xs0 xs0Var5 = xs0VarArr[z10 ? 1 : 0];
            dr0 dr0Var3 = xs0Var5.h;
            int Z = Z(xs0Var5.B);
            dr0Var3.Z2 = Z;
            int paddingRight = xs0VarArr[z10 ? 1 : 0].h.getPaddingRight();
            xs0VarArr2 = xs0VarArr;
            dr0 dr0Var4 = xs0VarArr2[z10 ? 1 : 0].h;
            int Y = Y(v0());
            dr0Var4.a3 = Y;
            dr0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
            int i19 = xs0VarArr2[z10 ? 1 : 0].B;
            int[] iArr = this.i1;
            f2.r0 r0Var2 = this.G;
            View view = this.Q;
            ks0 ks0Var = this.P;
            ot0 ot0Var = this.N;
            ps0 ps0Var = this.L;
            tt0[] tt0VarArr2 = this.p1;
            if (i19 == 0) {
                f2.r0 r0Var3 = this.D;
                if (adapter != r0Var3) {
                    W0(adapter);
                    xs0VarArr2[z10 ? 1 : 0].h.setAdapter(r0Var3);
                }
                int i20 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i20;
                layoutParams.leftMargin = i20;
                tt0 tt0Var = tt0VarArr2[0];
                boolean z20 = tt0Var.h && !tt0Var.e.isEmpty();
                i14 = iArr[0];
                xs0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.u0);
                tt0 tt0Var2 = tt0VarArr2[0];
                if (tt0Var2.x == null) {
                    tt0Var2.x = new f2.f1();
                }
                z13 = z20;
                f1Var = tt0VarArr2[0].x;
                z11 = false;
            } else {
                if (i19 == 1) {
                    tt0 tt0Var3 = tt0VarArr2[1];
                    z12 = tt0Var3.h && !tt0Var3.e.isEmpty();
                    if (adapter != r0Var2) {
                        W0(adapter);
                        xs0VarArr2[z10 ? 1 : 0].h.setAdapter(r0Var2);
                    }
                } else if (i19 == 2) {
                    tt0 tt0Var4 = tt0VarArr2[2];
                    z12 = tt0Var4.h && !tt0Var4.e.isEmpty();
                    if (adapter != this.H) {
                        W0(adapter);
                        xs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.H);
                    }
                } else {
                    if (i19 == 3) {
                        if (adapter != this.F) {
                            W0(adapter);
                            xs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.F);
                        }
                    } else if (i19 == 4) {
                        tt0 tt0Var5 = tt0VarArr2[4];
                        z12 = tt0Var5.h && !tt0Var5.e.isEmpty();
                        if (adapter != this.I) {
                            W0(adapter);
                            xs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.I);
                        }
                    } else {
                        if (i19 == 5) {
                            if (adapter != this.K) {
                                W0(adapter);
                                xs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.K);
                            }
                        } else if (i19 == 15) {
                            if (adapter != lt0Var) {
                                W0(adapter);
                                dr0 dr0Var5 = xs0VarArr2[z10 ? 1 : 0].h;
                                lt0Var.r = dr0Var5;
                                dr0Var5.setAdapter(lt0Var);
                            }
                        } else if (i19 == 6) {
                            if (adapter != ps0Var) {
                                W0(adapter);
                                xs0VarArr2[z10 ? 1 : 0].h.setAdapter(ps0Var);
                            }
                        } else if (i19 == 7) {
                            if (adapter != this.T) {
                                W0(adapter);
                                xs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.T);
                            }
                        } else if (p0(i19)) {
                            f2.r0 k12 = k1(xs0VarArr2[z10 ? 1 : 0].B);
                            if (adapter != k12) {
                                W0(adapter);
                                xs0VarArr2[z10 ? 1 : 0].h.setAdapter(k12);
                                xs0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            xs0 xs0Var6 = xs0VarArr2[z10 ? 1 : 0];
                            if (xs0Var6.B != 9) {
                                h0Var.d(xs0Var6.h);
                            }
                            i14 = iArr[1];
                        } else {
                            int i21 = xs0VarArr2[z10 ? 1 : 0].B;
                            if (i21 == 10) {
                                if (adapter != this.M) {
                                    W0(adapter);
                                    xs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.M);
                                }
                            } else if (i21 == 11) {
                                if (adapter != ot0Var) {
                                    W0(adapter);
                                    xs0VarArr2[z10 ? 1 : 0].h.setAdapter(ot0Var);
                                    f2.h0 h0Var2 = ot0Var.v;
                                    dr0 dr0Var6 = xs0VarArr2[z10 ? 1 : 0].h;
                                    ot0Var.s = dr0Var6;
                                    h0Var2.d(dr0Var6);
                                }
                                f1Var = ot0Var.r;
                                z11 = true;
                                z13 = false;
                            } else if (i21 == 12) {
                                if (adapter != null) {
                                    W0(adapter);
                                    xs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (ks0Var.getParent() != xs0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(ks0Var);
                                    xs0VarArr2[z10 ? 1 : 0].addView(ks0Var, g7.e6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                }
                            } else if (i21 == 13) {
                                if (adapter != null) {
                                    W0(adapter);
                                    xs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != xs0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    xs0VarArr2[z10 ? 1 : 0].addView(view);
                                }
                            } else if (i21 == 14) {
                                if (adapter != null) {
                                    W0(adapter);
                                    xs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (vq0Var != null && vq0Var.getParent() != xs0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(vq0Var);
                                    xs0VarArr2[z10 ? 1 : 0].addView(vq0Var);
                                    xs0VarArr2[z10 ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        f1Var = f1Var3;
                        z11 = false;
                        z13 = false;
                    }
                    f1Var = f1Var3;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                f1Var = f1Var3;
                z11 = true;
            }
            int i22 = xs0VarArr2[z10 ? 1 : 0].B;
            boolean z21 = i22 == 0 || p0(i22);
            f2.f1 f1Var4 = f1Var;
            xs0VarArr2[z10 ? 1 : 0].v.setLayoutParams(g7.e6.d(-1, -1.0f, 119, z21 ? 0.0f : 12.0f, (z21 ? 8 : 12) + 48, z21 ? 0.0f : 12.0f, z21 ? 0.0f : 12.0f));
            if (z11) {
                xs0VarArr2[z10 ? 1 : 0].h.setSections(false);
            } else {
                dr0 dr0Var7 = xs0VarArr2[z10 ? 1 : 0].h;
                dr0Var7.getClass();
                dr0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, dr0Var7.l2));
                dr0Var7.E2 = null;
                dr0Var7.H2 = 0.0f;
                dr0Var7.I2 = null;
                dr0Var7.J2 = null;
                dr0Var7.F2 = null;
                kk0 kk0Var = dr0Var7.D2;
                if (kk0Var != null) {
                    dr0Var7.p0(kk0Var);
                    dr0Var7.D2 = null;
                }
            }
            xs0 xs0Var7 = xs0VarArr2[z10 ? 1 : 0];
            int i23 = xs0Var7.B;
            org.telegram.ui.ActionBar.o2 o2Var = this.r1;
            if (i23 == 15) {
                z14 = z13;
                tt0VarArr = tt0VarArr2;
                str = "";
                xs0Var7.setBackground(kh.r6.e(xs0Var7.getBackground(), o2Var.getCurrentAccount(), this.f1, org.telegram.ui.ActionBar.f6.I.q()));
                xs0VarArr2[z10 ? 1 : 0].setOutlineProvider(new bg.q1(14));
                xs0VarArr2[z10 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z14 = z13;
                tt0VarArr = tt0VarArr2;
                str = "";
                xs0Var7.setClipToOutline(false);
                r52 = 0;
                xs0VarArr2[z10 ? 1 : 0].setBackground(null);
            }
            xs0 xs0Var8 = xs0VarArr2[z10 ? 1 : 0];
            if (xs0Var8.B == 11) {
                xs0Var8.h.setItemAnimator(xs0Var8.d);
            } else {
                xs0Var8.h.setItemAnimator(r52);
                if (ot0Var != null && xs0VarArr2[z10 ? 1 : 0].h == ot0Var.s) {
                    f2.h0 h0Var3 = ot0Var.v;
                    ot0Var.s = r52;
                    h0Var3.d(r52);
                }
            }
            if (ks0Var != null && xs0VarArr2[z10 ? 1 : 0].B != 12 && ks0Var.getParent() == xs0VarArr2[z10 ? 1 : 0]) {
                ks0Var.a.onRemoveFromParent();
                xs0VarArr2[z10 ? 1 : 0].removeView(ks0Var);
            }
            if (view != null && xs0VarArr2[z10 ? 1 : 0].B != 13) {
                ViewParent parent = view.getParent();
                xs0 xs0Var9 = xs0VarArr2[z10 ? 1 : 0];
                if (parent == xs0Var9) {
                    xs0Var9.removeView(view);
                }
            }
            if (vq0Var != null && xs0VarArr2[z10 ? 1 : 0].B != 14) {
                ViewParent parent2 = vq0Var.getParent();
                xs0 xs0Var10 = xs0VarArr2[z10 ? 1 : 0];
                if (parent2 == xs0Var10) {
                    xs0Var10.removeView(vq0Var);
                }
            }
            int i24 = xs0VarArr2[z10 ? 1 : 0].B;
            if (i24 != 0 && i24 != 11 && !p0(i24) && (i11 = xs0VarArr2[z10 ? 1 : 0].B) != 2 && i11 != 5 && i11 != 6 && ((i11 != 7 || qs0Var.S()) && (i12 = xs0VarArr2[z10 ? 1 : 0].B) != 10 && i12 != 13 && i12 != 14)) {
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
                    float f10 = z10 ? 1.0f : 0.0f;
                    this.k0 = b0(f10);
                    s1(1.0f - f10);
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
            int i25 = xs0VarArr2[z10 ? 1 : 0].B;
            if (i25 == 6) {
                if (!ps0Var.e && !ps0Var.h && ps0Var.d.isEmpty()) {
                    ps0.E(ps0Var, 0L);
                }
            } else if (i25 != 7) {
                if (p0(i25)) {
                    bu0 k13 = k1(xs0VarArr2[z10 ? 1 : 0].B);
                    if (k13 != null) {
                        ih.n6 n6Var = k13.s;
                        k13.P();
                        xs0VarArr2[z10 ? 1 : 0].w.e(n6Var != null && (n6Var.k() || (i0() && n6Var.g() > 0)), z10);
                        z15 = (n6Var == null || n6Var.g() <= 0 || t0()) ? false : true;
                    } else {
                        z15 = z14;
                    }
                    z14 = z15;
                } else {
                    int i26 = xs0VarArr2[z10 ? 1 : 0].B;
                    if (i26 != 10 && i26 != 11 && i26 != 12 && i26 != 13 && i26 != 14) {
                        if (i26 == 15) {
                            i26 = 8;
                        }
                        tt0 tt0Var6 = tt0VarArr[i26];
                        if (!tt0Var6.g && !tt0Var6.i[0] && tt0Var6.a.isEmpty()) {
                            tt0VarArr[i26].g = true;
                            r0Var2.l();
                            if (i26 == 0) {
                                int i27 = tt0VarArr[0].q;
                                if (i27 == 1) {
                                    i9 = 6;
                                } else if (i27 == 2) {
                                    i9 = 7;
                                }
                                o2Var.getMediaDataController().loadMedia(this.f1, 50, 0, 0, i9, this.B, 1, o2Var.getClassGuid(), tt0VarArr[i9].p, null, null);
                            }
                            i9 = i26;
                            o2Var.getMediaDataController().loadMedia(this.f1, 50, 0, 0, i9, this.B, 1, o2Var.getClassGuid(), tt0VarArr[i9].p, null, null);
                        }
                    }
                }
            }
            int i28 = xs0VarArr2[z10 ? 1 : 0].B;
            if (i28 == 8 || w0(i28)) {
                xs0 xs0Var11 = xs0VarArr2[z10 ? 1 : 0];
                or0 or0Var = xs0Var11.w;
                boolean w02 = w0(xs0Var11.B);
                int h12 = h1(xs0VarArr2[z10 ? 1 : 0].B);
                o9 o9Var = or0Var.b;
                kh.d dVar = or0Var.f;
                o9Var.setVisibility((w02 || u0() || r0()) ? 8 : 0);
                if (w02) {
                    dVar.setVisibility(0);
                    dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum));
                } else if (u0()) {
                    dVar.setVisibility(8);
                } else {
                    or0Var.setStickerType(11);
                    dVar.setVisibility(!t0() ? 0 : 8);
                    dVar.h(w());
                }
                if (w02) {
                    or0Var.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    or0Var.e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    or0Var.d.setText(LocaleController.getString(!t0() ? v0() ? R.string.NoPublicStoriesTitle2 : R.string.NoStoriesTitle : R.string.NoHashtagStoriesTitle));
                    or0Var.e.setText(v0() ? LocaleController.getString(R.string.NoStoriesSubtitle2) : str);
                }
                dVar.setOnClickListener(new fh.b3(this, w02, h12, 1));
            } else {
                xs0 xs0Var12 = xs0VarArr2[z10 ? 1 : 0];
                if (xs0Var12.B == 9) {
                    if (u0()) {
                        xs0VarArr2[z10 ? 1 : 0].w.b.setVisibility(8);
                        xs0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        xs0VarArr2[z10 ? 1 : 0].w.b.setVisibility(0);
                        xs0VarArr2[z10 ? 1 : 0].w.setStickerType(11);
                        xs0VarArr2[z10 ? 1 : 0].w.f.setVisibility(0);
                        xs0VarArr2[z10 ? 1 : 0].w.f.h(w());
                    }
                    xs0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    xs0VarArr2[z10 ? 1 : 0].w.e.setText(v0() ? LocaleController.getString(R.string.NoArchivedStoriesSubtitle) : str);
                    xs0VarArr2[z10 ? 1 : 0].w.f.setOnClickListener(new cq0(this, 7));
                } else {
                    xs0Var12.w.b.setVisibility(0);
                    xs0VarArr2[z10 ? 1 : 0].w.setStickerType(1);
                    xs0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoResult));
                    xs0VarArr2[z10 ? 1 : 0].w.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    xs0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                }
            }
            z16 = false;
            xs0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            i10 = i14;
            z17 = z14;
            f1Var2 = f1Var4;
        }
        xs0 xs0Var13 = xs0VarArr2[z10 ? 1 : 0];
        xs0Var13.b = z17;
        o1(xs0Var13, z16);
        xs0VarArr2[z10 ? 1 : 0].x.y1(i10);
        xs0VarArr2[z10 ? 1 : 0].h.a0();
        if (f1Var2 != null) {
            xs0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(f1Var2);
            xs0VarArr2[z10 ? 1 : 0].r.setRecycledViewPool(f1Var2);
        }
        if (this.t0 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.C;
            if (kVar.j0) {
                this.v0 = true;
                kVar.h(true);
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
        for (xs0 xs0Var : this.g0) {
            dr0 dr0Var = xs0Var.h;
            Objects.requireNonNull(dr0Var);
            xs0Var.n = new ig.k(dr0Var, viewGroup, new pv(dr0Var, 4));
        }
        vq0 vq0Var = this.R;
        if (vq0Var != null) {
            vq0Var.O = viewGroup;
            vq0Var.N = new fh.x2(vq0Var, 0);
        }
    }

    public final void n1() {
        js0 js0Var = this.D;
        if (js0Var != null) {
            js0Var.l();
        }
        rt0 rt0Var = this.G;
        if (rt0Var != null) {
            rt0Var.l();
        }
        rt0 rt0Var2 = this.H;
        if (rt0Var2 != null) {
            rt0Var2.l();
        }
        st0 st0Var = this.F;
        if (st0Var != null) {
            st0Var.X(false);
        }
        rt0 rt0Var3 = this.I;
        if (rt0Var3 != null) {
            rt0Var3.l();
        }
        lt0 lt0Var = this.J;
        if (lt0Var != null) {
            lt0Var.l();
        }
        ss0 ss0Var = this.K;
        if (ss0Var != null) {
            ss0Var.l();
        }
        ms0 ms0Var = this.V;
        if (ms0Var != null) {
            ms0Var.l();
        }
        Iterator it = this.U1.values().iterator();
        while (it.hasNext()) {
            ((du0) it.next()).c.l();
        }
    }

    public final void o1(xs0 xs0Var, boolean z10) {
        boolean z11 = xs0Var.b && this.d;
        fk0 fastScroll = xs0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = xs0Var.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            xs0Var.c.cancel();
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<fk0, Float>) property, fastScroll.getAlpha(), 1.0f);
            xs0Var.c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r1);
            return;
        }
        if (z11 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<fk0, Float>) property, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new u9(fastScroll));
        xs0Var.c = ofFloat2;
        ofFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i9 = 0;
        while (true) {
            xs0[] xs0VarArr = this.g0;
            if (i9 >= xs0VarArr.length) {
                return;
            }
            dr0 dr0Var = xs0VarArr[i9].h;
            if (dr0Var != null) {
                dr0Var.getViewTreeObserver().addOnPreDrawListener(new as0(this, i9, 0));
            }
            i9++;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return J() || this.E0.D || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i9);
        qs0 qs0Var = this.z1;
        int height = qs0Var.f() != null ? qs0Var.f().getHeight() : 0;
        if (height == 0) {
            height = View.MeasureSpec.getSize(i10);
        }
        setMeasuredDimension(size, height);
        int childCount = getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt == null || childAt.getVisibility() == 8) {
                i11 = i9;
            } else if (childAt instanceof xs0) {
                i11 = i9;
                measureChildWithMargins(childAt, i11, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                dr0 dr0Var = ((xs0) childAt).h;
                dr0Var.setPadding(0, dr0Var.U2, 0, dr0Var.V2);
            } else {
                i11 = i9;
                i12 = i10;
                measureChildWithMargins(childAt, i11, 0, i12, 0);
                i13++;
                i9 = i11;
                i10 = i12;
            }
            i12 = i10;
            i13++;
            i9 = i11;
            i10 = i12;
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
                    s30 s30Var = this.A1;
                    if (s30Var != null) {
                        s30Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.t1 && !this.u1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.s1 = motionEvent.getPointerId(0);
                    this.u1 = true;
                    this.v1 = (int) motionEvent.getX();
                    this.w1 = (int) motionEvent.getY();
                    this.x1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.s1) {
                    int x10 = (int) (motionEvent.getX() - this.v1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.w1);
                    boolean z11 = this.t1;
                    xs0[] xs0VarArr = this.g0;
                    if (z11 && (((z10 = this.d1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (!U0(motionEvent, x10 < 0)) {
                            this.u1 = true;
                            this.t1 = false;
                            N0(false);
                            xs0VarArr[0].setTranslationX(0.0f);
                            xs0VarArr[1].setTranslationX(this.d1 ? xs0VarArr[0].getMeasuredWidth() : -xs0VarArr[0].getMeasuredWidth());
                            Z0(0.0f, xs0VarArr[1].B);
                            M0(getTabProgress());
                        }
                    }
                    if (!this.u1 || this.t1) {
                        if (this.t1) {
                            xs0VarArr[0].setTranslationX(x10);
                            if (this.d1) {
                                xs0VarArr[1].setTranslationX(xs0VarArr[0].getMeasuredWidth() + x10);
                            } else {
                                xs0VarArr[1].setTranslationX(x10 - xs0VarArr[0].getMeasuredWidth());
                            }
                            float abs2 = Math.abs(x10) / xs0VarArr[0].getMeasuredWidth();
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
                            Z0(abs2, xs0VarArr[1].B);
                            M0(getTabProgress());
                            L0();
                        }
                    } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                        U0(motionEvent, x10 < 0);
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
            w0Var.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(org.telegram.ui.ActionBar.f6.z8), 5, -1));
        }
    }

    public boolean q0() {
        return false;
    }

    public final void q1(boolean z10) {
        vq0 vq0Var;
        zq0 zq0Var;
        pi0 pi0Var = this.o0;
        if (pi0Var == null) {
            return;
        }
        float f10 = 0.0f;
        if (!this.R0 && (((vq0Var = this.R) == null || !vq0Var.g()) && ((zq0Var = this.S) == null || !zq0Var.w))) {
            f10 = Utilities.clamp(this.k0 + this.l0, 1.0f, 0.0f);
        }
        pi0Var.setAlpha(f10);
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
        int i9 = 0;
        while (true) {
            xs0[] xs0VarArr = this.g0;
            if (i9 >= xs0VarArr.length) {
                return;
            }
            int childCount = xs0VarArr[i9].h.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = xs0VarArr[i9].h.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) childAt).b(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.r7) {
                    ((org.telegram.ui.Cells.r7) childAt).i(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.l7) {
                    ((org.telegram.ui.Cells.l7) childAt).f(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) childAt).e(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.e2) {
                    ((org.telegram.ui.Cells.e2) childAt).c(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) childAt).U(false, z10);
                }
            }
            i9++;
        }
    }

    public final boolean s0(int i9) {
        return i9 == 7 ? this.z1.S() : (t0() || i9 == 0 || p0(i9) || i9 == 2 || i9 == 5 || i9 == 6 || i9 == 11 || i9 == 10 || i9 == 13 || i9 == 14) ? false : true;
    }

    public final void s1(float f10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.i0;
        if (w0Var == null) {
            return;
        }
        xs0[] xs0VarArr = this.g0;
        xs0 xs0Var = xs0VarArr[1];
        float f11 = 0.0f;
        if (xs0Var != null && xs0Var.B == 11) {
            f11 = 0.0f + f10;
        }
        xs0 xs0Var2 = xs0VarArr[0];
        if (xs0Var2 != null && xs0Var2.B == 11) {
            f11 += 1.0f - f10;
        }
        w0Var.setAlpha(f11);
        float f12 = (0.15f * f11) + 0.85f;
        w0Var.setScaleX(f12);
        w0Var.setScaleY(f12);
        w0Var.setVisibility(f11 <= 0.01f ? 8 : 0);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2 = this.Z0;
        boolean z10 = chatFull2 != null && chatFull2.stories_pinned_available;
        this.Z0 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.Y0 == 0) {
                this.Y0 = -j10;
                int i9 = 0;
                while (true) {
                    tt0[] tt0VarArr = this.p1;
                    if (i9 >= tt0VarArr.length) {
                        break;
                    }
                    if (tt0VarArr[i9].b[1].size() == 0) {
                        tt0 tt0Var = tt0VarArr[i9];
                        tt0Var.j[1] = this.Z0.migrated_from_max_id;
                        tt0Var.i[1] = false;
                    }
                    i9++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.Z0;
        if (chatFull3 == null || z10 == chatFull3.stories_pinned_available) {
            return;
        }
        ur0 ur0Var = this.E0;
        if (ur0Var != null) {
            ur0Var.setInitialTabId(q0() ? 9 : 8);
        }
        v1(true);
        m1(false);
    }

    public void setCommonGroupsCount(int i9) {
        if (this.B == 0) {
            this.T0[6] = i9;
        }
        v1(true);
        F();
    }

    public void setForwardRestrictedHint(s30 s30Var) {
        this.A1 = s30Var;
    }

    public void setMergeDialogId(long j10) {
        this.Y0 = j10;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i9 = 0;
        while (true) {
            iArr2 = this.T0;
            if (i9 > 6 || iArr2[i9] >= 0) {
                break;
            } else {
                i9++;
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
    public final void setPadding(int i9, int i10, int i11, int i12) {
        this.G1 = i10;
        int i13 = 0;
        while (true) {
            xs0[] xs0VarArr = this.g0;
            if (i13 >= xs0VarArr.length) {
                break;
            }
            xs0VarArr[i13].setTranslationY(this.G1);
            i13++;
        }
        if (this.L0 != null) {
            K();
        } else {
            qr0 qr0Var = this.N0;
            if (qr0Var != null) {
                qr0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i10);
            }
        }
        this.K0 = i10;
        org.telegram.ui.Cells.w0 w0Var = this.G0;
        w0Var.setTranslationY((w0Var.getTag() == null ? -AndroidUtilities.dp(48.0f) : 0) + this.K0);
    }

    public void setPagesPaddingBottom(int i9) {
        if (this.T1 != i9) {
            this.T1 = i9;
            xs0[] xs0VarArr = this.g0;
            if (xs0VarArr != null) {
                for (xs0 xs0Var : xs0VarArr) {
                    if (xs0Var != null) {
                        dr0 dr0Var = xs0Var.h;
                        int paddingLeft = dr0Var.getPaddingLeft();
                        dr0 dr0Var2 = xs0Var.h;
                        int i10 = dr0Var2.U2;
                        int paddingRight = dr0Var2.getPaddingRight();
                        dr0 dr0Var3 = xs0Var.h;
                        int Y = Y(v0());
                        dr0Var3.a3 = Y;
                        dr0Var.setPadding(paddingLeft, i10, paddingRight, Y);
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
        int i9 = 0;
        while (true) {
            xs0[] xs0VarArr = this.g0;
            if (i9 >= xs0VarArr.length) {
                return;
            }
            o1(xs0VarArr[i9], true);
            i9++;
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

    public void setVisibleHeight(int i9) {
        this.I1 = i9;
        int i10 = 0;
        while (true) {
            xs0[] xs0VarArr = this.g0;
            if (i10 >= xs0VarArr.length) {
                break;
            }
            float f10 = (-(getMeasuredHeight() - Math.max(i9, AndroidUtilities.dp(xs0VarArr[i10].B == 8 ? 280.0f : 120.0f)))) / 2.0f;
            xs0VarArr[i10].w.setTranslationY(f10);
            xs0VarArr[i10].v.setTranslationY(-f10);
            i10++;
        }
        uq0 uq0Var = this.Q;
        if (uq0Var != null) {
            uq0Var.setVisibleHeight(i9);
        }
        vq0 vq0Var = this.R;
        if (vq0Var != null) {
            vq0Var.setVisibleHeight(i9);
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
        xs0 xs0Var = this.g0[1];
        boolean z10 = xs0Var != null && xs0Var.B == 11;
        if (z10) {
            w0Var.setVisibility(0);
        }
        w0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.85f).scaleY(z10 ? 1.0f : 0.85f).withEndAction(new a50(3, this, z10)).setDuration(420L).setInterpolator(gr.h).start();
    }

    public boolean u0() {
        return false;
    }

    public final void u1() {
        boolean z10;
        ih.n6 n6Var;
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
        int i9 = 0;
        while (true) {
            SparseArray[] sparseArrayArr = this.V0;
            if (i9 >= sparseArrayArr[0].size()) {
                z10 = false;
                break;
            }
            MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i9);
            ms0 ms0Var = this.V;
            if (ms0Var != null && (n6Var = ms0Var.s) != null && !n6Var.m(messageObject.getId())) {
                z10 = true;
                break;
            }
            i9++;
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
    
        if ((r36[8] <= 0) == r8.e(15)) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01e7, code lost:
    
        r4 = r37 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x01ea, code lost:
    
        r4 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x01fb, code lost:
    
        if ((r36[4] <= 0) == r8.e(4)) goto L176;
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
        char c10;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ProfileTab profileTab;
        TLRPC.ProfileTab profileTab2;
        int i9;
        boolean z11;
        int i10;
        boolean v02;
        int[] iArr;
        boolean z12;
        boolean z13;
        ur0 ur0Var;
        int selectedTab;
        boolean z14;
        boolean z15;
        long j10;
        TLRPC.UserFull userFull2;
        TLRPC.ChatFull chatFull2;
        Integer num;
        ur0 ur0Var2;
        boolean z16;
        int i11;
        int size;
        int i12;
        Boolean bool;
        String string;
        String str;
        String str2;
        vq0 vq0Var;
        char c11;
        int i13;
        Object obj;
        Object obj2;
        Object obj3;
        int i14;
        int i15;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull3;
        TLRPC.UserFull userFull4;
        TL_bots.BotInfo botInfo;
        wt0 wt0Var;
        ur0 ur0Var3 = this.E0;
        if (ur0Var3 == null) {
            return;
        }
        boolean z17 = !this.z1.q() ? false : z10;
        boolean z18 = (this.P == null || (wt0Var = this.q1) == null || !wt0Var.f) ? false : true;
        org.telegram.ui.ActionBar.o2 o2Var = this.r1;
        long j11 = this.f1;
        if (j11 <= 0 || o2Var == null) {
            c10 = 4;
            user = null;
        } else {
            c10 = 4;
            user = o2Var.getMessagesController().getUser(Long.valueOf(j11));
        }
        boolean z19 = user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        boolean z20 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.a1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z19) ? false : true;
        boolean z21 = (DialogObject.isUserDialog(j11) || DialogObject.isChatDialog(j11)) && !DialogObject.isEncryptedDialog(j11) && (((userFull = this.a1) != null && userFull.stories_pinned_available) || (((chatFull = this.Z0) != null && chatFull.stories_pinned_available) || v0())) && m0();
        vq0 vq0Var2 = this.R;
        boolean z22 = vq0Var2 != null && (((userFull3 = this.a1) != null && userFull3.stargifts_count > 0) || ((chatFull3 = this.Z0) != null && chatFull3.stargifts_count > 0));
        boolean z23 = z20;
        TLRPC.ChatFull chatFull4 = this.Z0;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.a1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z24 = z17;
                int i16 = this.M1 == ur0Var3.j0 ? 1 : 0;
                int i17 = (!z21 || z23) == ur0Var3.e(8) ? i16 + 1 : i16;
                if (z19 != ur0Var3.e(13)) {
                    i17++;
                }
                int i18 = i17;
                i9 = t0() == ur0Var3.e(8) ? i18 + 1 : i18;
                if (z22 == ur0Var3.e(14)) {
                    i9++;
                } else if (vq0Var2 != null && z22) {
                    z11 = z18;
                    i10 = 14;
                    if (this.L1 != vq0Var2.getLastEmojisHash()) {
                        i9++;
                    }
                    v02 = v0();
                    os0 os0Var = this.T;
                    boolean z25 = z22;
                    int[] iArr2 = this.T0;
                    if (v02) {
                        iArr = iArr2;
                        z12 = false;
                        z13 = false;
                    } else {
                        iArr = iArr2;
                        int i19 = i9;
                        int i20 = (os0Var.d == null) == ur0Var3.e(7) ? i19 + 1 : i19;
                        int i21 = (iArr[0] <= 0) == ur0Var3.e(0) ? i20 + 1 : i20;
                        int i22 = (iArr[1] <= 0) == ur0Var3.e(1) ? i21 + 1 : i21;
                        if (DialogObject.isEncryptedDialog(j11)) {
                            i14 = i22;
                        } else {
                            int i23 = i22;
                            int i24 = (iArr[3] <= 0) == ur0Var3.e(3) ? i23 + 1 : i23;
                            i14 = (iArr[c10] <= 0) == ur0Var3.e(4) ? i24 + 1 : i24;
                        }
                        int i25 = i15;
                        int i26 = (iArr[2] <= 0) == ur0Var3.e(2) ? i25 + 1 : i25;
                        int i27 = (iArr[5] <= 0) == ur0Var3.e(5) ? i26 + 1 : i26;
                        int i28 = (iArr[6] <= 0) == ur0Var3.e(6) ? i27 + 1 : i27;
                        boolean z26 = !this.M.d.isEmpty();
                        int i29 = i28;
                        i9 = z26 != ur0Var3.e(10) ? i29 + 1 : i29;
                        z12 = l0() && !o2Var.getMessagesController().getSavedMessagesController().unsupported && o2Var.getMessagesController().getSavedMessagesController().hasDialogs();
                        z13 = z26;
                        if (z12 != ur0Var3.e(11)) {
                            i9++;
                        }
                        if (z11 != ur0Var3.e(12)) {
                            i9++;
                        }
                    }
                    if (i9 > 0) {
                        if (z24) {
                            TransitionSet transitionSet = new TransitionSet();
                            transitionSet.setOrdering(0);
                            z14 = z12;
                            transitionSet.addTransition(new org.telegram.ui.ActionBar.o0(2));
                            z15 = z11;
                            j10 = j11;
                            transitionSet.setDuration(200L);
                            TransitionManager.beginDelayedTransition(ur0Var3.getTabsContainer(), transitionSet);
                            ur0Var3.Q = ur0Var3.v;
                            ur0Var3.R = ur0Var3.w;
                        } else {
                            z14 = z12;
                            z15 = z11;
                            j10 = j11;
                        }
                        SparseArray g10 = ur0Var3.g();
                        if (i9 > 3) {
                            g10 = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (t0()) {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                            ur0Var3.U = 420L;
                        }
                        if (z23) {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                        } else if ((DialogObject.isUserDialog(j10) || DialogObject.isChatDialog(j10)) && !DialogObject.isEncryptedDialog(j10) && ((((userFull2 = this.a1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.Z0) != null && chatFull2.stories_pinned_available) || v0())) && m0())) {
                            if (q0()) {
                                arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                                ur0Var3.U = 420L;
                            } else {
                                arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                                if (v0()) {
                                    arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                                }
                            }
                        }
                        if (z25) {
                            Integer valueOf = Integer.valueOf(i10);
                            String string2 = LocaleController.getString(R.string.ProfileGifts);
                            HashMap hashMap = fh.j4.P;
                            gh.n7 n7Var = vq0Var2.d;
                            if (n7Var == null) {
                                vq0Var = vq0Var2;
                                num = 0;
                                ur0Var2 = ur0Var3;
                                z16 = z15;
                                str2 = string2;
                                obj = "";
                            } else {
                                z16 = z15;
                                ArrayList arrayList2 = n7Var.l;
                                str2 = string2;
                                num = 0;
                                ur0Var2 = ur0Var3;
                                Pair pair = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(vq0Var2.c));
                                if (!arrayList2.isEmpty()) {
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList3 = new ArrayList();
                                    int i30 = 0;
                                    while (true) {
                                        vq0Var = vq0Var2;
                                        if (arrayList3.size() >= 3 || i30 >= arrayList2.size()) {
                                            break;
                                        }
                                        TLRPC.Document document = ((TL_stars.SavedStarGift) arrayList2.get(i30)).gift.getDocument();
                                        if (document == null) {
                                            i13 = i30;
                                        } else {
                                            i13 = i30;
                                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                                hashSet.add(Long.valueOf(document.id));
                                                arrayList3.add(document);
                                            }
                                        }
                                        i30 = i13 + 1;
                                        vq0Var2 = vq0Var;
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                                        int i31 = 0;
                                        while (i31 < arrayList3.size()) {
                                            TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i31);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(MessageObject.getEmoji(document2));
                                            spannableStringBuilder2.setSpan(new t5(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
                                            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                                            i31++;
                                            arrayList3 = arrayList3;
                                        }
                                        c11 = 0;
                                        hashMap.put(pair, spannableStringBuilder);
                                        obj3 = spannableStringBuilder;
                                        CharSequence[] charSequenceArr = new CharSequence[2];
                                        charSequenceArr[c11] = str2;
                                        charSequenceArr[1] = obj3;
                                        arrayList.add(new Pair(valueOf, TextUtils.concat(charSequenceArr)));
                                        this.L1 = vq0Var.getLastEmojisHash();
                                    }
                                } else if (!n7Var.i || (obj2 = (CharSequence) hashMap.get(pair)) == null) {
                                    vq0Var = vq0Var2;
                                } else {
                                    vq0Var = vq0Var2;
                                    obj = obj2;
                                }
                                obj = "";
                            }
                            c11 = 0;
                            obj3 = obj;
                            CharSequence[] charSequenceArr2 = new CharSequence[2];
                            charSequenceArr2[c11] = str2;
                            charSequenceArr2[1] = obj3;
                            arrayList.add(new Pair(valueOf, TextUtils.concat(charSequenceArr2)));
                            this.L1 = vq0Var.getLastEmojisHash();
                        } else {
                            num = 0;
                            ur0Var2 = ur0Var3;
                            z16 = z15;
                        }
                        if (z19) {
                            arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                        }
                        if (!v0()) {
                            if (z14) {
                                arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                            }
                            if (os0Var.d != null) {
                                arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                            }
                            if (iArr[0] > 0) {
                                if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && os0Var.d == null) {
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
                        ur0Var = ur0Var2;
                        if (ur0Var.j0) {
                            boolean z27 = this.Z0 instanceof TLRPC.TL_channelFull;
                            for (int i32 = 0; i32 < 15; i32++) {
                                if (d0(i32, z27) != null) {
                                    Integer valueOf2 = Integer.valueOf(i32);
                                    int i33 = 0;
                                    while (true) {
                                        if (i33 >= arrayList.size()) {
                                            bool = Boolean.FALSE;
                                            break;
                                        } else {
                                            if (((Pair) arrayList.get(i33)).first == valueOf2) {
                                                bool = Boolean.TRUE;
                                                break;
                                            }
                                            i33++;
                                        }
                                    }
                                    if (!bool.booleanValue()) {
                                        Integer valueOf3 = Integer.valueOf(i32);
                                        if (i32 == 0) {
                                            string = LocaleController.getString(R.string.SharedMediaTabFull2);
                                        } else if (i32 == 1) {
                                            string = LocaleController.getString(R.string.SharedFilesTab2);
                                        } else if (i32 == 2) {
                                            string = LocaleController.getString(R.string.SharedVoiceTab2);
                                        } else if (i32 == 3) {
                                            string = LocaleController.getString(R.string.SharedLinksTab2);
                                        } else if (i32 == 4) {
                                            string = LocaleController.getString(R.string.SharedMusicTab2);
                                        } else if (i32 == 5) {
                                            string = LocaleController.getString(R.string.SharedGIFsTab2);
                                        } else if (i32 == 8) {
                                            string = LocaleController.getString(R.string.ProfileStories);
                                        } else if (i32 != 14) {
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
                            int i34 = 0;
                            while (true) {
                                if (i34 >= arrayList.size()) {
                                    i34 = -1;
                                    break;
                                } else if (((Integer) ((Pair) arrayList.get(i34)).first).intValue() == e02) {
                                    break;
                                } else {
                                    i34++;
                                }
                            }
                            if (i34 >= 0) {
                                i11 = 0;
                                arrayList.add(0, (Pair) arrayList.remove(i34));
                                if (!arrayList.isEmpty()) {
                                    this.N1 = ((Integer) ((Pair) arrayList.get(i11)).first).intValue();
                                }
                                size = arrayList.size();
                                i12 = 0;
                                while (i12 < size) {
                                    Object obj4 = arrayList.get(i12);
                                    i12++;
                                    Pair pair2 = (Pair) obj4;
                                    if (!ur0Var.e(((Integer) pair2.first).intValue())) {
                                        ur0Var.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, g10);
                                    }
                                }
                            }
                        }
                        i11 = 0;
                        if (!arrayList.isEmpty()) {
                        }
                        size = arrayList.size();
                        i12 = 0;
                        while (i12 < size) {
                        }
                    } else {
                        ur0Var = ur0Var3;
                    }
                    selectedTab = getSelectedTab();
                    if (selectedTab >= 0) {
                        this.g0[0].B = selectedTab;
                    }
                    this.M1 = ur0Var.j0;
                    ur0Var.c();
                    L0();
                    I();
                }
                z11 = z18;
                i10 = 14;
                v02 = v0();
                os0 os0Var2 = this.T;
                boolean z252 = z22;
                int[] iArr22 = this.T0;
                if (v02) {
                }
                if (i9 > 0) {
                }
                selectedTab = getSelectedTab();
                if (selectedTab >= 0) {
                }
                this.M1 = ur0Var.j0;
                ur0Var.c();
                L0();
                I();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z242 = z17;
        if (this.M1 == ur0Var3.j0) {
        }
        int i162 = this.M1 == ur0Var3.j0 ? 1 : 0;
        if ((!z21 || z23) == ur0Var3.e(8)) {
        }
        if (z19 != ur0Var3.e(13)) {
        }
        int i182 = i17;
        if (t0() == ur0Var3.e(8)) {
        }
        if (z22 == ur0Var3.e(14)) {
        }
        z11 = z18;
        i10 = 14;
        v02 = v0();
        os0 os0Var22 = this.T;
        boolean z2522 = z22;
        int[] iArr222 = this.T0;
        if (v02) {
        }
        if (i9 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.M1 = ur0Var.j0;
        ur0Var.c();
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
                this.S1.setSpan(new eq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.S1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.S1;
    }

    public final Boolean w1(View view, View view2) {
        if (this.k1) {
            return null;
        }
        xs0[] xs0VarArr = this.g0;
        xs0 xs0Var = xs0VarArr[0];
        if (xs0Var == null) {
            return null;
        }
        int i9 = xs0Var.B;
        this.l1 = i9;
        boolean p02 = p0(i9);
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
            } else if (c0(xs0VarArr[0].B) >= 5 || w0(xs0VarArr[0].B)) {
                SharedConfig.setStoriesColumnsCount(X);
            }
            B(X);
        }
        return Boolean.valueOf(X != X(p02 ? 1 : 0, X, true));
    }

    public final void x(x60 x60Var, org.telegram.ui.ActionBar.o2 o2Var, long j10, int i9) {
        String publicUsername = j10 > 0 ? UserObject.getPublicUsername(MessagesController.getInstance(o2Var.getCurrentAccount()).getUser(Long.valueOf(j10))) : ChatObject.getPublicUsername(MessagesController.getInstance(o2Var.getCurrentAccount()).getChat(Long.valueOf(-j10)));
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        j3.r0.A(sb2, MessagesController.getInstance(o2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i9);
        x60Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new ue0(this, sb2.toString(), o2Var, 5), false);
    }

    public final boolean x0() {
        if (C() && ((getClosestTab() == 8 || getClosestTab() == 13 || w0(getClosestTab())) && this.y1)) {
            return false;
        }
        vq0 vq0Var = this.R;
        if (vq0Var != null && vq0Var.g()) {
            return false;
        }
        zq0 zq0Var = this.S;
        return ((zq0Var != null && zq0Var.w) || this.k1 || this.c1) ? false : true;
    }

    public final Boolean x1(View view, View view2) {
        if (this.k1) {
            return null;
        }
        xs0[] xs0VarArr = this.g0;
        xs0 xs0Var = xs0VarArr[0];
        if (xs0Var == null) {
            return null;
        }
        if (this.g1 && p0(xs0Var.B)) {
            return null;
        }
        int i9 = xs0VarArr[0].B;
        this.l1 = i9;
        boolean p02 = p0(i9);
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
            } else if (c0(xs0VarArr[0].B) >= 5 || w0(xs0VarArr[0].B)) {
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
    public final void y(x60 x60Var) {
        xs0 xs0Var;
        int x10 = x60Var.x();
        final int i9 = 0;
        x60Var.c(R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn), new Runnable(this) { // from class: org.telegram.ui.Components.lq0
            public final /* synthetic */ eu0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        eu0 eu0Var = this.b;
                        eu0Var.getClass();
                        View[] viewArr = r2;
                        eu0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        eu0 eu0Var2 = this.b;
                        eu0Var2.getClass();
                        View[] viewArr2 = r2;
                        eu0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final int i10 = 1;
        x60Var.c(R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut), new Runnable(this) { // from class: org.telegram.ui.Components.lq0
            public final /* synthetic */ eu0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        eu0 eu0Var = this.b;
                        eu0Var.getClass();
                        View[] viewArr = r2;
                        eu0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        eu0 eu0Var2 = this.b;
                        eu0Var2.getClass();
                        View[] viewArr2 = r2;
                        eu0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final View[] viewArr = {x60Var.w(x10), x60Var.w(x10 + 1)};
        xs0[] xs0VarArr = this.g0;
        if (xs0VarArr != null && (xs0Var = xs0VarArr[0]) != null) {
            boolean p02 = p0(xs0Var.B);
            int i11 = this.i1[p02 ? 1 : 0];
        }
        viewArr[0].setEnabled(false);
        viewArr[0].setAlpha(0.5f);
        if (E()) {
            return;
        }
        viewArr[1].setEnabled(false);
        viewArr[1].setAlpha(0.5f);
    }

    public final void y0(int i9, int i10, int i11, boolean z10) {
        tt0[] tt0VarArr = this.p1;
        tt0VarArr[i9].a.clear();
        tt0VarArr[i9].b[0].clear();
        tt0VarArr[i9].b[1].clear();
        tt0 tt0Var = tt0VarArr[i9];
        tt0Var.j[0] = i10;
        tt0Var.i[0] = false;
        tt0Var.l = false;
        tt0Var.m = i11;
        tt0Var.n = (tt0Var.e() - i11) - 1;
        tt0 tt0Var2 = tt0VarArr[i9];
        if (tt0Var2.n < 0) {
            tt0Var2.n = 0;
        }
        tt0Var2.k = i10;
        tt0Var2.o = true;
        tt0Var2.g = false;
        tt0Var2.p++;
        xs0 W = W(i9);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (!z10) {
            return;
        }
        int i12 = 0;
        while (true) {
            xs0[] xs0VarArr = this.g0;
            if (i12 >= xs0VarArr.length) {
                return;
            }
            xs0 xs0Var = xs0VarArr[i12];
            if (xs0Var.B == i9) {
                xs0Var.x.h1(Math.min(tt0VarArr[i9].e() - 1, tt0VarArr[i9].m), 0);
            }
            i12++;
        }
    }

    public final void z(ws0 ws0Var, int i9, SparseBooleanArray sparseBooleanArray) {
        int childCount = ws0Var.getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ws0Var.getChildAt(i10);
            if (childAt instanceof e00) {
                view = childAt;
            }
        }
        if (view != null) {
            ws0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new zr0(this, ws0Var, sparseBooleanArray, (e00) view, i9));
    }

    public final void z0(boolean z10) {
        long j10 = this.B;
        if (j10 != 0 || t0()) {
            return;
        }
        for (int i9 = 0; i9 < 4; i9++) {
            final int i10 = Z1[i9];
            tt0[] tt0VarArr = this.p1;
            if (tt0VarArr[i10].h && !z10) {
                return;
            }
            long j11 = this.f1;
            if (DialogObject.isEncryptedDialog(j11)) {
                return;
            }
            tt0VarArr[i10].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i10 == 0) {
                int i11 = tt0VarArr[i10].q;
                if (i11 == 1) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                } else if (i11 == 2) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterVideo();
                } else {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                }
            } else if (i10 == 1) {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterDocument();
            } else if (i10 == 2) {
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
            final int i12 = tt0VarArr[i10].p;
            ConnectionsManager.getInstance(o2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(o2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() { // from class: org.telegram.ui.Components.zp0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new gq0(eu0.this, tL_error, i12, i10, tLObject, 0));
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

    public int V0(int i9) {
        return i9;
    }

    @Override // org.telegram.ui.Cells.n2
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void d(org.telegram.ui.Cells.r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void f(org.telegram.ui.Cells.r2 r2Var) {
    }

    public void o0() {
    }
}
