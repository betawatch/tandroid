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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class zu0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.n2 {
    public static final int[] d2 = {0, 1, 2, 4};
    public static final kr0 e2 = new kr0(0);
    public final NumberTextView A0;
    public int A1;
    public final fa B0;
    public VelocityTracker B1;
    public final ImageView C0;
    public boolean C1;
    public final org.telegram.ui.ActionBar.h2 D0;
    public final lt0 D1;
    public final int E;
    public final ArrayList E0;
    public i40 E1;
    public final long F;
    public final ArrayList F0;
    public final org.telegram.ui.ActionBar.f6 F1;
    public final org.telegram.ui.ActionBar.k G;
    public final ArrayList G0;
    public final NotificationCenter.ObserversGroup G1;
    public final et0 H;
    public final ArrayList H0;
    public boolean H1;
    public final tu0 I;
    public final ps0 I0;
    public final AnimationNotificationsLocker I1;
    public final nu0 J;
    public final ms0 J0;
    public wm J1;
    public final mu0 K;
    public final org.telegram.ui.Cells.w0 K0;
    public int K1;
    public final mu0 L;
    public AnimatorSet L0;
    public boolean L1;
    public final mu0 M;
    public final rq0 M0;
    public int M1;
    public final gu0 N;
    public final ArrayList N0;
    public AnimatorSet N1;
    public final nt0 O;
    public float O0;
    public final SparseArray O1;
    public final kt0 P;
    public final ks P0;
    public long P1;
    public final it0 Q;
    public final FrameLayout Q0;
    public boolean Q1;
    public final ju0 R;
    public final ls0 R0;
    public int R1;
    public final ku0 S;
    public final int S0;
    public final ws0 S1;
    public final ft0 T;
    public final Paint T0;
    public ai.d9 T1;
    public final nr0 U;
    public boolean U0;
    public float U1;
    public final or0 V;
    public boolean V0;
    public boolean V1;
    public final ur0 W;
    public zg.p0 W0;
    public SpannableStringBuilder W1;
    public final int[] X0;
    public int X1;
    public int Y0;
    public final HashMap Y1;
    public final SparseArray[] Z0;
    public final HashMap Z1;
    public boolean a;
    public final jt0 a0;
    public int a1;
    public int a2;
    public boolean b;
    public final s4.y b0;
    public boolean b1;
    public int b2;
    public boolean c;
    public final ht0 c0;
    public long c1;
    public final jh c2;
    public boolean d;
    public final wu0 d0;
    public TLRPC.ChatFull d1;
    public int e;
    public final mr0 e0;
    public TLRPC.UserFull e1;
    public int f;
    public final wu0 f0;
    public AnimatorSet f1;
    public final vt0 g0;
    public boolean g1;
    public float h;
    public final vt0 h0;
    public boolean h1;
    public final vt0 i0;
    public boolean i1;
    public final qt0 j0;
    public final long j1;
    public final st0[] k0;
    public boolean k1;
    public final org.telegram.ui.ActionBar.w0 l0;
    public boolean l1;
    public final org.telegram.ui.ActionBar.w0 m0;
    public final int[] m1;
    public float n;
    public final org.telegram.ui.ActionBar.w0 n0;
    public float n1;
    public float o0;
    public boolean o1;
    public float p0;
    public int p1;
    public final TextView q0;
    public int q1;
    public boolean r;
    public final ImageView r0;
    public final zr0 r1;
    public int s;
    public final bj0 s0;
    public float s1;
    public final org.telegram.ui.ActionBar.w0 t0;
    public final ou0[] t1;
    public final org.telegram.ui.ActionBar.w0 u0;
    public final ru0 u1;
    public int v;
    public final org.telegram.ui.ActionBar.w0 v0;
    public final org.telegram.ui.ActionBar.o2 v1;
    public int w;
    public final org.telegram.ui.ActionBar.w0 w0;
    public int w1;
    public final Rect x;
    public int x0;
    public boolean x1;
    public final t00 y;
    public final Drawable y0;
    public boolean y1;
    public boolean z0;
    public int z1;

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
    /* JADX WARN: Type inference failed for: r10v8, types: [android.graphics.drawable.Drawable, org.telegram.ui.ActionBar.f6, s4.m0] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zu0(Context context, long j3, ru0 ru0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, org.telegram.ui.ActionBar.o2 o2Var, lt0 lt0Var, int i13, org.telegram.ui.ActionBar.f6 f6Var, ah.c cVar) {
        super(context);
        char c10;
        TLRPC.ProfileTab profileTab;
        int i14;
        ou0[] ou0VarArr;
        int i15;
        ms0 ms0Var;
        int i16;
        int i17;
        ju0 ju0Var;
        float f7;
        Context context2;
        org.telegram.ui.ActionBar.w0 w0Var;
        ?? r10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        zu0 zu0Var;
        int i18;
        int i19;
        int i20;
        st0[] st0VarArr;
        View view;
        boolean N;
        zu0 zu0Var2;
        ur0 ur0Var;
        int i21;
        int i22;
        wr0 wr0Var;
        rt0 rt0Var;
        rt0 rt0Var2;
        rt0 rt0Var3;
        rt0 rt0Var4;
        rt0 rt0Var5;
        rt0 rt0Var6;
        rt0 rt0Var7;
        rt0 rt0Var8;
        rt0 rt0Var9;
        rt0 rt0Var10;
        rt0 rt0Var11;
        rt0 rt0Var12;
        rt0 rt0Var13;
        rt0 rt0Var14;
        rt0 rt0Var15;
        t00 t00Var;
        t00 t00Var2;
        t00 t00Var3;
        t00 t00Var4;
        zw0 zw0Var;
        zw0 zw0Var2;
        zw0 zw0Var3;
        zw0 zw0Var4;
        zw0 zw0Var5;
        zw0 zw0Var6;
        zw0 zw0Var7;
        zw0 zw0Var8;
        zw0 zw0Var9;
        zw0 zw0Var10;
        t00 t00Var5;
        rt0 rt0Var16;
        zw0 zw0Var11;
        rt0 rt0Var17;
        rt0 rt0Var18;
        st0 st0Var;
        wr0 wr0Var2;
        rt0 rt0Var19;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        TL_bots.BotInfo botInfo;
        zu0 zu0Var3 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        zu0Var3.x = new Rect();
        zu0Var3.k0 = new st0[2];
        zu0Var3.E0 = new ArrayList(10);
        zu0Var3.F0 = new ArrayList(10);
        zu0Var3.G0 = new ArrayList(10);
        zu0Var3.H0 = new ArrayList(10);
        zu0Var3.M0 = new rq0(zu0Var3, 2);
        zu0Var3.N0 = new ArrayList();
        zu0Var3.T0 = new Paint();
        zu0Var3.Z0 = new SparseArray[]{new SparseArray(), new SparseArray()};
        zu0Var3.k1 = false;
        zu0Var3.l1 = false;
        zu0Var3.m1 = new int[]{3, 3};
        zu0Var3.r1 = new zr0(zu0Var3);
        zu0Var3.s1 = -5.0f;
        zu0Var3.t1 = new ou0[9];
        zu0Var3.I1 = new AnimationNotificationsLocker();
        zu0Var3.O1 = new SparseArray();
        zu0Var3.R1 = -1;
        zu0Var3.S1 = new ws0(zu0Var3);
        zu0Var3.U1 = 0.0f;
        zu0Var3.Y1 = new HashMap();
        zu0Var3.Z1 = new HashMap();
        fh.c cVar2 = new fh.c();
        cVar2.a(zu0Var3.h0(org.telegram.ui.ActionBar.j6.d6));
        ah.c cVar3 = cVar == null ? new ah.c(cVar2) : cVar;
        zu0Var3.E = i13;
        zu0Var3.F1 = f6Var;
        t00 t00Var6 = new t00(context);
        zu0Var3.y = t00Var6;
        t00Var6.setIsSingleCell(true);
        TLRPC.User user = o2Var.getMessagesController().getUser(Long.valueOf(j3));
        zu0Var3.u1 = ru0Var;
        zu0Var3.D1 = lt0Var;
        int[] iArr = ru0Var.c;
        long j10 = ru0Var.s;
        zu0Var3.F = j10;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j10 == 0 ? i10 : 0, iArr[7], iArr[8]};
        zu0Var3.X0 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            if (chatFull2 == null) {
                c10 = 5;
                profileTab = null;
                if (i11 != 14 || i11 == 10 || i11 == 11 || i11 == 6) {
                    zu0Var3.Y0 = i11;
                } else if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    zu0Var3.Y0 = 13;
                } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                    zu0Var3.Y0 = 8;
                } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || zu0Var3.v0()))) {
                    zu0Var3.Y0 = 8;
                } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                    if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                        int i28 = iArr2[1];
                        i23 = -1;
                        if (i28 == -1 || i28 > 0) {
                            zu0Var3.Y0 = 1;
                        }
                    } else {
                        i23 = -1;
                    }
                    if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i27 = iArr2[c10]) == i23 || i27 > 0)) {
                        zu0Var3.Y0 = 5;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i26 = iArr2[3]) == i23 || i26 > 0)) {
                        zu0Var3.Y0 = 3;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i25 = iArr2[4]) == i23 || i25 > 0)) {
                        zu0Var3.Y0 = 4;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i24 = iArr2[2]) == i23 || i24 > 0)) {
                        zu0Var3.Y0 = 2;
                    } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || zu0Var3.v0())) {
                        zu0Var3.Y0 = zu0Var3.getInitialTab();
                    } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                        int i29 = -1;
                        if (i11 == -1 || j10 != 0) {
                            int i30 = 0;
                            while (true) {
                                int[] iArr3 = zu0Var3.X0;
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
                            zu0Var3.Y0 = i30;
                        } else {
                            zu0Var3.Y0 = i11;
                        }
                    } else {
                        zu0Var3.Y0 = 14;
                    }
                } else {
                    zu0Var3.Y0 = 14;
                }
                zu0Var3.M0(i11);
                zu0Var3.d1 = chatFull2;
                zu0Var3.e1 = userFull;
                if (chatFull2 != null) {
                    zu0Var3.c1 = -chatFull2.migrated_from_chat_id;
                }
                zu0Var3.j1 = j3;
                i14 = 0;
                while (true) {
                    ou0VarArr = zu0Var3.t1;
                    if (i14 < ou0VarArr.length) {
                        break;
                    }
                    ou0VarArr[i14] = new ou0();
                    zu0Var3.t1[i14].j[0] = DialogObject.isEncryptedDialog(zu0Var3.j1) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    zu0Var3.t1[i14].j[1] = Integer.MAX_VALUE;
                    zu0Var3.R(i14);
                    if (zu0Var3.c1 != 0 && zu0Var3.d1 != null && zu0Var3.t1[i14].b[1].size() == 0) {
                        ou0 ou0Var = zu0Var3.t1[i14];
                        ou0Var.j[1] = zu0Var3.d1.migrated_from_max_id;
                        ou0Var.i[1] = false;
                    }
                    i14++;
                }
                zu0Var3.v1 = o2Var;
                zu0Var3.G = o2Var.getActionBar();
                zu0Var3.m1[0] = zu0Var3.S0() > 0 ? SharedConfig.mediaColumnsCount : zu0Var3.S0();
                zu0Var3.m1[1] = zu0Var3.S0() > 0 ? SharedConfig.storiesColumnsCount : zu0Var3.S0();
                zu0Var3.G1 = o2Var.getNotificationCenter().createObserversGroup(zu0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
                for (i15 = 0; i15 < 10; i15++) {
                    if (i11 == 4) {
                        ks0 ks0Var = new ks0(zu0Var3, context);
                        ks0Var.T.c();
                        zu0Var3.G0.add(ks0Var);
                    }
                }
                zu0Var3.S0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                zu0Var3.V0 = false;
                zu0Var3.W0 = null;
                ms0Var = zu0Var3.J0;
                if (ms0Var != null) {
                    ms0Var.g(false);
                }
                zu0Var3.U0 = false;
                Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
                zu0Var3.y0 = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(zu0Var3.h0(org.telegram.ui.ActionBar.j6.b7), PorterDuff.Mode.MULTIPLY));
                ps0 ps0Var = zu0Var3.I0;
                int currentTabId = ps0Var == null ? ps0Var.getCurrentTabId() : i11;
                ps0 ps0Var2 = new ps0(zu0Var3, context, zu0Var3.F1);
                i16 = zu0Var3.Y0;
                if (i16 != -1) {
                    ps0Var2.setInitialTabId(i16);
                    zu0Var3.Y0 = -1;
                }
                ps0Var2.b0 = 320L;
                int i32 = org.telegram.ui.ActionBar.j6.Fh;
                int i33 = org.telegram.ui.ActionBar.j6.Eh;
                ps0Var2.L = i32;
                ps0Var2.M = i33;
                ps0Var2.e();
                ps0Var2.setUseMinimalWidth(true);
                ps0Var2.setDelegate(new rs0(zu0Var3));
                zu0Var3.I0 = ps0Var2;
                for (i17 = 1; i17 >= 0; i17--) {
                    zu0Var3.Z0[i17].clear();
                }
                zu0Var3.a1 = 0;
                zu0Var3.N0.clear();
                ju0Var = zu0Var3.R;
                if (ju0Var != null) {
                    ju0Var.w.clear();
                }
                if (!(zu0Var3 instanceof y30)) {
                    org.telegram.ui.ActionBar.a0 n10 = zu0Var3.G.n();
                    n10.addOnLayoutChangeListener(new qs0(zu0Var3));
                    if (zu0Var3.j1 == zu0Var3.v1.getUserConfig().getClientUserId() && (zu0Var3.v1 instanceof ba0) && zu0Var3.D()) {
                        zu0Var3.m0 = n10.a(11, R.drawable.outline_header_search);
                    }
                    org.telegram.ui.ActionBar.w0 a2 = n10.a(0, 0);
                    a2.F();
                    a2.H = new xs0(zu0Var3);
                    zu0Var3.n0 = a2;
                    a2.setTranslationY(AndroidUtilities.dp(10.0f));
                    ms0 ms0Var2 = zu0Var3.J0;
                    a2.setSearchFieldHint(LocaleController.getString((ms0Var2 != null && ms0Var2.a() && zu0Var3.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
                    a2.setContentDescription(LocaleController.getString("Search", R.string.Search));
                    a2.setVisibility(zu0Var3.v0() ? 8 : 4);
                }
                ImageView imageView = new ImageView(context);
                zu0Var3.r0 = imageView;
                imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
                imageView.setTranslationY(AndroidUtilities.dp(10.0f));
                imageView.setVisibility(4);
                if (!zu0Var3.q0() || zu0Var3.t0()) {
                    f7 = 2.0f;
                } else {
                    zu0Var3.G.addView(imageView, w7.x5.e(48, 56, 85));
                    bj0 bj0Var = new bj0(context);
                    zu0Var3.s0 = bj0Var;
                    bj0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    bj0Var.e(R.raw.options_to_search, 24, 24);
                    bj0Var.getAnimatedDrawable().F *= 2.0f;
                    bj0Var.getAnimatedDrawable().h = true;
                    f7 = 2.0f;
                    bj0Var.setColorFilter(new PorterDuffColorFilter(zu0Var3.h0(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.SRC_IN));
                    bj0Var.setVisibility(8);
                    zu0Var3.G.addView(bj0Var, w7.x5.e(48, 56, 85));
                }
                context2 = context;
                imageView.setOnClickListener(new dt0(zu0Var3, j3, f6Var, context));
                w0Var = zu0Var3.n0;
                if (w0Var != null) {
                    EditTextBoldCursor searchField = w0Var.getSearchField();
                    int i34 = org.telegram.ui.ActionBar.j6.G6;
                    searchField.setTextColor(zu0Var3.h0(i34));
                    searchField.setHintTextColor(zu0Var3.h0(org.telegram.ui.ActionBar.j6.Si));
                    searchField.setCursorColor(zu0Var3.h0(i34));
                }
                zu0Var3.x0 = 0;
                org.telegram.ui.ActionBar.o2 o2Var2 = zu0Var3.v1;
                qv0 qv0Var = (o2Var2 == null && (o2Var2.getFragmentView() instanceof qv0)) ? (qv0) zu0Var3.v1.getFragmentView() : null;
                fa faVar = new fa(context2, qv0Var);
                zu0Var3.B0 = faVar;
                faVar.setBackgroundColor(zu0Var3.h0(org.telegram.ui.ActionBar.j6.a7));
                faVar.setAlpha(0.0f);
                faVar.setClickable(true);
                faVar.setVisibility(4);
                ImageView imageView2 = new ImageView(context2);
                zu0Var3.C0 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(true);
                zu0Var3.D0 = h2Var;
                imageView2.setImageDrawable(h2Var);
                int i35 = org.telegram.ui.ActionBar.j6.y8;
                h2Var.a(zu0Var3.h0(i35));
                int i36 = org.telegram.ui.ActionBar.j6.z8;
                imageView2.setBackground(org.telegram.ui.ActionBar.j6.e0(zu0Var3.h0(i36), 1));
                imageView2.setContentDescription(LocaleController.getString("Close", R.string.Close));
                faVar.addView(imageView2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                zu0Var3.N0.add(imageView2);
                imageView2.setOnClickListener(new tq0(zu0Var3, 0));
                NumberTextView numberTextView = new NumberTextView(context2);
                zu0Var3.A0 = numberTextView;
                numberTextView.setTextSize(18);
                numberTextView.setTypeface(AndroidUtilities.bold());
                numberTextView.setTextColor(zu0Var3.h0(i35));
                faVar.addView(numberTextView, w7.x5.m(1.0f, 0, -1, 18, 0, 0));
                zu0Var3.N0.add(numberTextView);
                if (!DialogObject.isEncryptedDialog(zu0Var3.j1)) {
                    if (!zu0Var3.v0()) {
                        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context2, zu0Var3.h0(i36), zu0Var3.h0(i35), false);
                        zu0Var3.u0 = w0Var2;
                        w0Var2.setIcon(R.drawable.msg_message);
                        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrGoToMessage));
                        w0Var2.setDuplicateParentStateEnabled(false);
                        faVar.addView(w0Var2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        zu0Var3.N0.add(w0Var2);
                        w0Var2.setOnClickListener(new tq0(zu0Var3, 1));
                        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context2, zu0Var3.h0(i36), zu0Var3.h0(i35), false);
                        zu0Var3.t0 = w0Var3;
                        w0Var3.setIcon(R.drawable.msg_forward);
                        w0Var3.setContentDescription(LocaleController.getString(R.string.Forward));
                        w0Var3.setDuplicateParentStateEnabled(false);
                        faVar.addView(w0Var3, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        zu0Var3.N0.add(w0Var3);
                        w0Var3.setOnClickListener(new tq0(zu0Var3, 2));
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context2, zu0Var3.h0(i36), zu0Var3.h0(i35), false);
                    zu0Var3.v0 = w0Var4;
                    w0Var4.setIcon(R.drawable.msg_pin);
                    w0Var4.setContentDescription(LocaleController.getString(R.string.PinMessage));
                    w0Var4.setDuplicateParentStateEnabled(false);
                    w0Var4.setVisibility(8);
                    faVar.addView(w0Var4, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    zu0Var3.N0.add(w0Var4);
                    w0Var4.setOnClickListener(new tq0(zu0Var3, 3));
                    org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context2, zu0Var3.h0(i36), zu0Var3.h0(i35), false);
                    zu0Var3.w0 = w0Var5;
                    w0Var5.setIcon(R.drawable.msg_unpin);
                    w0Var5.setContentDescription(LocaleController.getString(R.string.UnpinMessage));
                    w0Var5.setDuplicateParentStateEnabled(false);
                    w0Var5.setVisibility(8);
                    faVar.addView(w0Var5, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    zu0Var3.N0.add(w0Var5);
                    w0Var5.setOnClickListener(new tq0(zu0Var3, 4));
                    zu0Var3.p1();
                }
                org.telegram.ui.ActionBar.w0 w0Var6 = new org.telegram.ui.ActionBar.w0(context2, zu0Var3.h0(i36), zu0Var3.h0(i35), false);
                zu0Var3.l0 = w0Var6;
                w0Var6.setIcon(R.drawable.msg_delete);
                w0Var6.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
                w0Var6.setDuplicateParentStateEnabled(false);
                faVar.addView(w0Var6, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                zu0Var3.N0.add(w0Var6);
                w0Var6.setOnClickListener(new tq0(zu0Var3, 5));
                zu0Var3.H = new et0(zu0Var3, context2);
                zu0Var3.I = new tu0(zu0Var3, context2);
                zu0Var3.K = new mu0(zu0Var3, context2, 1);
                zu0Var3.L = new mu0(zu0Var3, context2, 2);
                zu0Var3.M = new mu0(zu0Var3, context2, 4);
                zu0Var3.N = new gu0(zu0Var3, context2, zu0Var3.v1.getCurrentAccount(), zu0Var3.v1.getResourceProvider());
                zu0Var3.O = new nt0(zu0Var3, context2);
                zu0Var3.g0 = new vt0(zu0Var3, context2, 1);
                zu0Var3.h0 = new vt0(zu0Var3, context2, 4);
                zu0Var3.i0 = new vt0(zu0Var3, context2, 3);
                zu0Var3.j0 = new qt0(zu0Var3, context2);
                zu0Var3.P = new kt0(zu0Var3, context2);
                zu0Var3.Q = new it0(zu0Var3, context2);
                zu0Var3.R = new ju0(zu0Var3, context2);
                zu0Var3.S = new ku0(zu0Var3, context2);
                if (!zu0Var3.v0() && !zu0Var3.l0() && zu0Var3.F == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", zu0Var3.v1.getUserConfig().getClientUserId());
                    bundle.putInt("chatMode", 3);
                    ft0 ft0Var = new ft0(zu0Var3, context2, zu0Var3.v1.getParentLayout(), bundle);
                    zu0Var3.T = ft0Var;
                    long j11 = zu0Var3.j1;
                    org.telegram.ui.co coVar = ft0Var.a;
                    coVar.d4 = j11;
                    coVar.Pa = true;
                    ft0Var.setClipToOutline(true);
                    ft0Var.setOutlineProvider(new gt0());
                }
                jt0 jt0Var = new jt0(zu0Var3, context2);
                zu0Var3.a0 = jt0Var;
                if (zu0Var3.F == 0) {
                    jt0Var.e = arrayList;
                    jt0Var.d = currentTabId != 7 ? null : chatFull2;
                }
                zu0Var3.c0 = new ht0(zu0Var3, context2);
                zu0Var3.b0 = new s4.y(new lr0(zu0Var3));
                zu0Var3.d0 = new wu0(zu0Var3, context2, false);
                zu0Var3.e0 = new mr0(zu0Var3, context2);
                zu0Var3.f0 = new wu0(zu0Var3, context2, true);
                zu0Var3.J = new nu0(zu0Var3, context2);
                if (!zu0Var3.r0()) {
                    zu0Var3.U = new nr0(zu0Var3, context2, zu0Var3.v1, zu0Var3.j1);
                } else if (zu0Var3.v1 instanceof ProfileActivity) {
                    TextView textView = new TextView(context2);
                    zu0Var3.q0 = textView;
                    textView.setText(LocaleController.getString(R.string.Save).toUpperCase());
                    textView.setTypeface(AndroidUtilities.bold());
                    int i37 = org.telegram.ui.ActionBar.j6.Oh;
                    textView.setTextColor(zu0Var3.h0(i37));
                    textView.setTextSize(1, 15.0f);
                    textView.setGravity(17);
                    textView.setBackground(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.l1(0.15f, zu0Var3.h0(i37)), 3));
                    textView.setPadding(AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f), 0);
                    zu0Var3.G.addView(textView, w7.x5.e(-2, 56, 85));
                    textView.setOnClickListener(new tq0(zu0Var3, 6));
                    textView.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setScaleX(0.4f);
                    textView.setScaleY(0.4f);
                    org.telegram.ui.ActionBar.o2 o2Var3 = zu0Var3.v1;
                    r10 = 0;
                    f6Var2 = f6Var;
                    or0 or0Var = new or0(o2Var3.getCurrentAccount(), ((ProfileActivity) zu0Var3.v1).a(), context2, o2Var3, f6Var2, zu0Var3);
                    context2 = context2;
                    zu0 zu0Var4 = zu0Var3;
                    zu0Var4.V = or0Var;
                    int dp = AndroidUtilities.dp(48.0f);
                    ks ksVar = zu0Var4.P0;
                    or0Var.setPaddingTop(dp + (ksVar != null ? (int) ksVar.c(0.0f) : 0));
                    zu0Var4.W = new ur0(zu0Var4, context2, qv0Var, zu0Var4.getStoriesController().B(zu0Var4.j1, true), new sr0(zu0Var4, context2, o2Var, f6Var2));
                    zu0Var = zu0Var4;
                    zu0Var.setWillNotDraw(false);
                    i18 = 0;
                    i19 = -1;
                    i20 = 0;
                    while (true) {
                        st0VarArr = zu0Var.k0;
                        if (i20 >= st0VarArr.length) {
                            break;
                        }
                        if (i20 == 0 && (st0Var = st0VarArr[i20]) != null && (wr0Var2 = st0Var.x) != null) {
                            i19 = wr0Var2.L0();
                            if (i19 != zu0Var.k0[i20].x.B() - 1) {
                                rt0Var19 = zu0Var.k0[i20].h;
                                wk0 wk0Var = (wk0) rt0Var19.L(i19);
                                if (wk0Var != null) {
                                    i18 = wk0Var.a.getTop();
                                } else {
                                    i19 = -1;
                                }
                            } else {
                                i21 = i18;
                                i22 = -1;
                                vr0 vr0Var = new vr0(zu0Var, context2);
                                zu0Var.addView(vr0Var, w7.x5.d(-1, -1.0f, 51, 0.0f, zu0Var.B0(), 0.0f, 0.0f));
                                if (i20 == 1) {
                                    vr0Var.setTranslationX(AndroidUtilities.displaySize.x);
                                }
                                zu0Var.k0[i20] = vr0Var;
                                wr0Var = new wr0(zu0Var, vr0Var);
                                vr0Var.x = wr0Var;
                                wr0Var.z1(new xr0(zu0Var, vr0Var));
                                zu0Var.k0[i20].d = new s4.j();
                                zu0Var.k0[i20].d.n(280L);
                                zu0Var.k0[i20].d.o(qr.h);
                                st0 st0Var2 = zu0Var.k0[i20];
                                st0Var2.d.m = false;
                                st0Var2.h = new yr0(zu0Var, context2, vr0Var, wr0Var);
                                rt0Var = zu0Var.k0[i20].h;
                                rt0Var.setFastScrollEnabled(1);
                                rt0Var2 = zu0Var.k0[i20].h;
                                rt0Var2.setScrollingTouchSlop(1);
                                rt0Var3 = zu0Var.k0[i20].h;
                                rt0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(f7));
                                rt0Var4 = zu0Var.k0[i20].h;
                                rt0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                                rt0Var5 = zu0Var.k0[i20].h;
                                rt0Var5.setItemAnimator(r10);
                                rt0Var6 = zu0Var.k0[i20].h;
                                rt0Var6.setClipToPadding(false);
                                rt0Var7 = zu0Var.k0[i20].h;
                                rt0Var7.setSectionsType(2);
                                rt0Var8 = zu0Var.k0[i20].h;
                                rt0Var8.setLayoutManager(wr0Var);
                                st0 st0Var3 = zu0Var.k0[i20];
                                rt0Var9 = st0Var3.h;
                                st0Var3.addView(rt0Var9, w7.x5.c(-1.0f, -1));
                                zu0Var.k0[i20].r = new rt0(context2, r10);
                                st0 st0Var4 = zu0Var.k0[i20];
                                rt0 rt0Var20 = st0Var4.r;
                                as0 as0Var = new as0(zu0Var);
                                st0Var4.s = as0Var;
                                rt0Var20.setLayoutManager(as0Var);
                                st0 st0Var5 = zu0Var.k0[i20];
                                st0Var5.addView(st0Var5.r, w7.x5.c(-1.0f, -1));
                                zu0Var.k0[i20].r.setVisibility(8);
                                zu0Var.k0[i20].r.i(new bs0(vr0Var));
                                rt0Var10 = zu0Var.k0[i20].h;
                                rt0Var10.i(new cs0(zu0Var, vr0Var));
                                rt0Var11 = zu0Var.k0[i20].h;
                                rt0Var11.setOnItemClickListener(new org.telegram.ui.ye(zu0Var, vr0Var, context2, j3, f6Var2, 1));
                                rt0Var12 = zu0Var.k0[i20].h;
                                rt0Var12.setOnScrollListener(new es0(zu0Var, vr0Var, wr0Var));
                                rt0Var13 = zu0Var.k0[i20].h;
                                rt0Var13.setOnItemLongClickListener(new fs0(zu0Var, vr0Var));
                                if (i20 == 0 && i22 != -1) {
                                    wr0Var.h1(i22, i21);
                                }
                                rt0Var14 = zu0Var.k0[i20].h;
                                zu0Var.k0[i20].y = new gs0(context2, rt0Var14);
                                zu0Var.k0[i20].y.setVisibility(8);
                                rt0Var15 = zu0Var.k0[i20].h;
                                rt0Var15.E0(zu0Var.k0[i20].y, w7.x5.c(-1.0f, -1));
                                zu0Var.k0[i20].v = new hs0(zu0Var, context2, vr0Var);
                                t00Var = zu0Var.k0[i20].v;
                                t00Var.g();
                                t00Var2 = zu0Var.k0[i20].v;
                                t00Var2.setClipToOutline(true);
                                t00Var3 = zu0Var.k0[i20].v;
                                t00Var3.setOutlineProvider(new is0());
                                if (i20 == 0) {
                                    zu0Var.k0[i20].setVisibility(8);
                                }
                                st0 st0Var6 = zu0Var.k0[i20];
                                t00Var4 = st0Var6.v;
                                st0Var6.w = new js0(zu0Var, context2, t00Var4);
                                zw0Var = zu0Var.k0[i20].w;
                                zw0Var.d(8, false);
                                zw0Var2 = zu0Var.k0[i20].w;
                                zw0Var2.setAnimateLayoutChange(true);
                                st0 st0Var7 = zu0Var.k0[i20];
                                zw0Var3 = st0Var7.w;
                                st0Var7.addView(zw0Var3, w7.x5.c(-1.0f, -1));
                                zw0Var4 = zu0Var.k0[i20].w;
                                zw0Var4.setOnTouchListener(new bi.d(23));
                                zw0Var5 = zu0Var.k0[i20].w;
                                zw0Var5.e(true, false);
                                zw0Var6 = zu0Var.k0[i20].w;
                                zw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                zw0Var7 = zu0Var.k0[i20].w;
                                zw0Var7.f.setVisibility(8);
                                zw0Var8 = zu0Var.k0[i20].w;
                                zw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                zw0Var9 = zu0Var.k0[i20].w;
                                zw0Var9.f.setVisibility(8);
                                zw0Var10 = zu0Var.k0[i20].w;
                                t00Var5 = zu0Var.k0[i20].v;
                                zw0Var10.addView(t00Var5, w7.x5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                                rt0Var16 = zu0Var.k0[i20].h;
                                zw0Var11 = zu0Var.k0[i20].w;
                                rt0Var16.setEmptyView(zw0Var11);
                                rt0Var17 = zu0Var.k0[i20].h;
                                rt0Var17.n1(0, true);
                                st0[] st0VarArr2 = zu0Var.k0;
                                st0 st0Var8 = st0VarArr2[i20];
                                rt0Var18 = st0VarArr2[i20].h;
                                st0Var8.E = new pk0(rt0Var18, zu0Var.k0[i20].x);
                                i20++;
                                f6Var2 = f6Var;
                                i18 = i21;
                                i19 = i22;
                            }
                        }
                        i21 = i18;
                        i22 = i19;
                        vr0 vr0Var2 = new vr0(zu0Var, context2);
                        zu0Var.addView(vr0Var2, w7.x5.d(-1, -1.0f, 51, 0.0f, zu0Var.B0(), 0.0f, 0.0f));
                        if (i20 == 1) {
                        }
                        zu0Var.k0[i20] = vr0Var2;
                        wr0Var = new wr0(zu0Var, vr0Var2);
                        vr0Var2.x = wr0Var;
                        wr0Var.z1(new xr0(zu0Var, vr0Var2));
                        zu0Var.k0[i20].d = new s4.j();
                        zu0Var.k0[i20].d.n(280L);
                        zu0Var.k0[i20].d.o(qr.h);
                        st0 st0Var22 = zu0Var.k0[i20];
                        st0Var22.d.m = false;
                        st0Var22.h = new yr0(zu0Var, context2, vr0Var2, wr0Var);
                        rt0Var = zu0Var.k0[i20].h;
                        rt0Var.setFastScrollEnabled(1);
                        rt0Var2 = zu0Var.k0[i20].h;
                        rt0Var2.setScrollingTouchSlop(1);
                        rt0Var3 = zu0Var.k0[i20].h;
                        rt0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(f7));
                        rt0Var4 = zu0Var.k0[i20].h;
                        rt0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                        rt0Var5 = zu0Var.k0[i20].h;
                        rt0Var5.setItemAnimator(r10);
                        rt0Var6 = zu0Var.k0[i20].h;
                        rt0Var6.setClipToPadding(false);
                        rt0Var7 = zu0Var.k0[i20].h;
                        rt0Var7.setSectionsType(2);
                        rt0Var8 = zu0Var.k0[i20].h;
                        rt0Var8.setLayoutManager(wr0Var);
                        st0 st0Var32 = zu0Var.k0[i20];
                        rt0Var9 = st0Var32.h;
                        st0Var32.addView(rt0Var9, w7.x5.c(-1.0f, -1));
                        zu0Var.k0[i20].r = new rt0(context2, r10);
                        st0 st0Var42 = zu0Var.k0[i20];
                        rt0 rt0Var202 = st0Var42.r;
                        as0 as0Var2 = new as0(zu0Var);
                        st0Var42.s = as0Var2;
                        rt0Var202.setLayoutManager(as0Var2);
                        st0 st0Var52 = zu0Var.k0[i20];
                        st0Var52.addView(st0Var52.r, w7.x5.c(-1.0f, -1));
                        zu0Var.k0[i20].r.setVisibility(8);
                        zu0Var.k0[i20].r.i(new bs0(vr0Var2));
                        rt0Var10 = zu0Var.k0[i20].h;
                        rt0Var10.i(new cs0(zu0Var, vr0Var2));
                        rt0Var11 = zu0Var.k0[i20].h;
                        rt0Var11.setOnItemClickListener(new org.telegram.ui.ye(zu0Var, vr0Var2, context2, j3, f6Var2, 1));
                        rt0Var12 = zu0Var.k0[i20].h;
                        rt0Var12.setOnScrollListener(new es0(zu0Var, vr0Var2, wr0Var));
                        rt0Var13 = zu0Var.k0[i20].h;
                        rt0Var13.setOnItemLongClickListener(new fs0(zu0Var, vr0Var2));
                        if (i20 == 0) {
                            wr0Var.h1(i22, i21);
                        }
                        rt0Var14 = zu0Var.k0[i20].h;
                        zu0Var.k0[i20].y = new gs0(context2, rt0Var14);
                        zu0Var.k0[i20].y.setVisibility(8);
                        rt0Var15 = zu0Var.k0[i20].h;
                        rt0Var15.E0(zu0Var.k0[i20].y, w7.x5.c(-1.0f, -1));
                        zu0Var.k0[i20].v = new hs0(zu0Var, context2, vr0Var2);
                        t00Var = zu0Var.k0[i20].v;
                        t00Var.g();
                        t00Var2 = zu0Var.k0[i20].v;
                        t00Var2.setClipToOutline(true);
                        t00Var3 = zu0Var.k0[i20].v;
                        t00Var3.setOutlineProvider(new is0());
                        if (i20 == 0) {
                        }
                        st0 st0Var62 = zu0Var.k0[i20];
                        t00Var4 = st0Var62.v;
                        st0Var62.w = new js0(zu0Var, context2, t00Var4);
                        zw0Var = zu0Var.k0[i20].w;
                        zw0Var.d(8, false);
                        zw0Var2 = zu0Var.k0[i20].w;
                        zw0Var2.setAnimateLayoutChange(true);
                        st0 st0Var72 = zu0Var.k0[i20];
                        zw0Var3 = st0Var72.w;
                        st0Var72.addView(zw0Var3, w7.x5.c(-1.0f, -1));
                        zw0Var4 = zu0Var.k0[i20].w;
                        zw0Var4.setOnTouchListener(new bi.d(23));
                        zw0Var5 = zu0Var.k0[i20].w;
                        zw0Var5.e(true, false);
                        zw0Var6 = zu0Var.k0[i20].w;
                        zw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                        zw0Var7 = zu0Var.k0[i20].w;
                        zw0Var7.f.setVisibility(8);
                        zw0Var8 = zu0Var.k0[i20].w;
                        zw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        zw0Var9 = zu0Var.k0[i20].w;
                        zw0Var9.f.setVisibility(8);
                        zw0Var10 = zu0Var.k0[i20].w;
                        t00Var5 = zu0Var.k0[i20].v;
                        zw0Var10.addView(t00Var5, w7.x5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                        rt0Var16 = zu0Var.k0[i20].h;
                        zw0Var11 = zu0Var.k0[i20].w;
                        rt0Var16.setEmptyView(zw0Var11);
                        rt0Var17 = zu0Var.k0[i20].h;
                        rt0Var17.n1(0, true);
                        st0[] st0VarArr22 = zu0Var.k0;
                        st0 st0Var82 = st0VarArr22[i20];
                        rt0Var18 = st0VarArr22[i20].h;
                        st0Var82.E = new pk0(rt0Var18, zu0Var.k0[i20].x);
                        i20++;
                        f6Var2 = f6Var;
                        i18 = i21;
                        i19 = i22;
                    }
                    view = zu0Var.W;
                    if (view != null) {
                        zu0Var.addView(view, w7.x5.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
                    }
                    org.telegram.ui.Cells.w0 w0Var7 = new org.telegram.ui.Cells.w0(context2);
                    zu0Var.K0 = w0Var7;
                    w0Var7.T((int) (System.currentTimeMillis() / 1000), false, false);
                    w0Var7.setAlpha(0.0f);
                    w0Var7.V(org.telegram.ui.ActionBar.j6.wc, org.telegram.ui.ActionBar.j6.kd);
                    w0Var7.setTranslationY(-AndroidUtilities.dp(48.0f));
                    zu0Var.addView(w0Var7, w7.x5.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                    N = zu0Var.N();
                    zu0Var2 = zu0Var;
                    if (!N) {
                        ks ksVar2 = new ks(context2);
                        zu0Var.P0 = ksVar2;
                        ksVar2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
                        ch.d b10 = cVar3.b(ksVar2, eh.b.o(f6Var));
                        b10.q(AndroidUtilities.dp(24.0f));
                        b10.p(AndroidUtilities.dp(7.0f));
                        ksVar2.setBlurredBackground(b10);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        zu0Var.Q0 = frameLayout;
                        ksVar2.addView(frameLayout);
                        ksVar2.i(frameLayout, true, false);
                        ksVar2.setOnAnimatedHeightChangedListener(new rq0(zu0Var, 0));
                        ls0 ls0Var = new ls0(zu0Var, context2, o2Var, this, f6Var);
                        zu0Var.R0 = ls0Var;
                        frameLayout.addView(ls0Var);
                        ksVar2.setCallFragmentContextView(ls0Var);
                        zu0Var.addView(ksVar2, w7.x5.d(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
                        ls0Var.setDelegate(new sq0(zu0Var));
                        ch.d b11 = cVar3.b(zu0Var.I0, eh.b.o(f6Var));
                        b11.q(AndroidUtilities.dp(18.0f));
                        b11.p(AndroidUtilities.dp(6.666f));
                        zu0Var.I0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                        zu0Var.I0.setClipToPadding(false);
                        zu0Var.I0.setBackground(r10);
                        zu0Var.I0.setBlurredBackground(b11);
                        zu0Var.I0.setOpen(false);
                        zu0Var.addView(zu0Var.I0, w7.x5.d(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
                        Context context3 = zu0Var.getContext();
                        org.telegram.ui.ActionBar.o2 o2Var4 = zu0Var.v1;
                        zu0 zu0Var5 = zu0Var;
                        ms0 ms0Var3 = new ms0(o2Var4.getCurrentAccount(), zu0Var.l0() ? 0L : zu0Var.j1, context3, o2Var4, f6Var, zu0Var5);
                        zu0 zu0Var6 = zu0Var5;
                        zu0Var6.J0 = ms0Var3;
                        ms0Var3.d(cVar3, eh.b.o(f6Var));
                        ms0Var3.setShown(0.0f);
                        zu0Var6.addView(ms0Var3, w7.x5.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                        zu0Var6.addView(zu0Var6.B0, w7.x5.e(-1, 48, 51));
                        zu0Var2 = zu0Var6;
                    }
                    zu0Var2.v1(false);
                    zu0Var2.m1(false);
                    if (zu0Var2.X0[0] >= 0) {
                        zu0Var2.z0(false);
                    }
                    ur0Var = zu0Var2.W;
                    if (ur0Var != null && i12 > 0) {
                        ur0Var.setInitialTabId(i12);
                    }
                    zu0Var2.c2 = new jh(zu0Var2, 2);
                }
                f6Var2 = f6Var;
                r10 = 0;
                zu0Var = zu0Var3;
                zu0Var.setWillNotDraw(false);
                i18 = 0;
                i19 = -1;
                i20 = 0;
                while (true) {
                    st0VarArr = zu0Var.k0;
                    if (i20 >= st0VarArr.length) {
                    }
                    st0 st0Var622 = zu0Var.k0[i20];
                    t00Var4 = st0Var622.v;
                    st0Var622.w = new js0(zu0Var, context2, t00Var4);
                    zw0Var = zu0Var.k0[i20].w;
                    zw0Var.d(8, false);
                    zw0Var2 = zu0Var.k0[i20].w;
                    zw0Var2.setAnimateLayoutChange(true);
                    st0 st0Var722 = zu0Var.k0[i20];
                    zw0Var3 = st0Var722.w;
                    st0Var722.addView(zw0Var3, w7.x5.c(-1.0f, -1));
                    zw0Var4 = zu0Var.k0[i20].w;
                    zw0Var4.setOnTouchListener(new bi.d(23));
                    zw0Var5 = zu0Var.k0[i20].w;
                    zw0Var5.e(true, false);
                    zw0Var6 = zu0Var.k0[i20].w;
                    zw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                    zw0Var7 = zu0Var.k0[i20].w;
                    zw0Var7.f.setVisibility(8);
                    zw0Var8 = zu0Var.k0[i20].w;
                    zw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    zw0Var9 = zu0Var.k0[i20].w;
                    zw0Var9.f.setVisibility(8);
                    zw0Var10 = zu0Var.k0[i20].w;
                    t00Var5 = zu0Var.k0[i20].v;
                    zw0Var10.addView(t00Var5, w7.x5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                    rt0Var16 = zu0Var.k0[i20].h;
                    zw0Var11 = zu0Var.k0[i20].w;
                    rt0Var16.setEmptyView(zw0Var11);
                    rt0Var17 = zu0Var.k0[i20].h;
                    rt0Var17.n1(0, true);
                    st0[] st0VarArr222 = zu0Var.k0;
                    st0 st0Var822 = st0VarArr222[i20];
                    rt0Var18 = st0VarArr222[i20].h;
                    st0Var822.E = new pk0(rt0Var18, zu0Var.k0[i20].x);
                    i20++;
                    f6Var2 = f6Var;
                    i18 = i21;
                    i19 = i22;
                }
                view = zu0Var.W;
                if (view != null) {
                }
                org.telegram.ui.Cells.w0 w0Var72 = new org.telegram.ui.Cells.w0(context2);
                zu0Var.K0 = w0Var72;
                w0Var72.T((int) (System.currentTimeMillis() / 1000), false, false);
                w0Var72.setAlpha(0.0f);
                w0Var72.V(org.telegram.ui.ActionBar.j6.wc, org.telegram.ui.ActionBar.j6.kd);
                w0Var72.setTranslationY(-AndroidUtilities.dp(48.0f));
                zu0Var.addView(w0Var72, w7.x5.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                N = zu0Var.N();
                zu0Var2 = zu0Var;
                if (!N) {
                }
                zu0Var2.v1(false);
                zu0Var2.m1(false);
                if (zu0Var2.X0[0] >= 0) {
                }
                ur0Var = zu0Var2.W;
                if (ur0Var != null) {
                    ur0Var.setInitialTabId(i12);
                }
                zu0Var2.c2 = new jh(zu0Var2, 2);
            }
            profileTab = chatFull2.main_tab;
        }
        c10 = 5;
        if (i11 != 14) {
        }
        zu0Var3.Y0 = i11;
        zu0Var3.M0(i11);
        zu0Var3.d1 = chatFull2;
        zu0Var3.e1 = userFull;
        if (chatFull2 != null) {
        }
        zu0Var3.j1 = j3;
        i14 = 0;
        while (true) {
            ou0VarArr = zu0Var3.t1;
            if (i14 < ou0VarArr.length) {
            }
            i14++;
        }
        zu0Var3.v1 = o2Var;
        zu0Var3.G = o2Var.getActionBar();
        zu0Var3.m1[0] = zu0Var3.S0() > 0 ? SharedConfig.mediaColumnsCount : zu0Var3.S0();
        zu0Var3.m1[1] = zu0Var3.S0() > 0 ? SharedConfig.storiesColumnsCount : zu0Var3.S0();
        zu0Var3.G1 = o2Var.getNotificationCenter().createObserversGroup(zu0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
        while (i15 < 10) {
        }
        zu0Var3.S0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        zu0Var3.V0 = false;
        zu0Var3.W0 = null;
        ms0Var = zu0Var3.J0;
        if (ms0Var != null) {
        }
        zu0Var3.U0 = false;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        zu0Var3.y0 = drawable2;
        drawable2.setColorFilter(new PorterDuffColorFilter(zu0Var3.h0(org.telegram.ui.ActionBar.j6.b7), PorterDuff.Mode.MULTIPLY));
        ps0 ps0Var3 = zu0Var3.I0;
        if (ps0Var3 == null) {
        }
        ps0 ps0Var22 = new ps0(zu0Var3, context, zu0Var3.F1);
        i16 = zu0Var3.Y0;
        if (i16 != -1) {
        }
        ps0Var22.b0 = 320L;
        int i322 = org.telegram.ui.ActionBar.j6.Fh;
        int i332 = org.telegram.ui.ActionBar.j6.Eh;
        ps0Var22.L = i322;
        ps0Var22.M = i332;
        ps0Var22.e();
        ps0Var22.setUseMinimalWidth(true);
        ps0Var22.setDelegate(new rs0(zu0Var3));
        zu0Var3.I0 = ps0Var22;
        while (i17 >= 0) {
        }
        zu0Var3.a1 = 0;
        zu0Var3.N0.clear();
        ju0Var = zu0Var3.R;
        if (ju0Var != null) {
        }
        if (!(zu0Var3 instanceof y30)) {
        }
        ImageView imageView3 = new ImageView(context);
        zu0Var3.r0 = imageView3;
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        imageView3.setTranslationY(AndroidUtilities.dp(10.0f));
        imageView3.setVisibility(4);
        if (zu0Var3.q0()) {
        }
        f7 = 2.0f;
        context2 = context;
        imageView3.setOnClickListener(new dt0(zu0Var3, j3, f6Var, context));
        w0Var = zu0Var3.n0;
        if (w0Var != null) {
        }
        zu0Var3.x0 = 0;
        org.telegram.ui.ActionBar.o2 o2Var22 = zu0Var3.v1;
        if (o2Var22 == null) {
        }
        fa faVar2 = new fa(context2, qv0Var);
        zu0Var3.B0 = faVar2;
        faVar2.setBackgroundColor(zu0Var3.h0(org.telegram.ui.ActionBar.j6.a7));
        faVar2.setAlpha(0.0f);
        faVar2.setClickable(true);
        faVar2.setVisibility(4);
        ImageView imageView22 = new ImageView(context2);
        zu0Var3.C0 = imageView22;
        imageView22.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.h2 h2Var2 = new org.telegram.ui.ActionBar.h2(true);
        zu0Var3.D0 = h2Var2;
        imageView22.setImageDrawable(h2Var2);
        int i352 = org.telegram.ui.ActionBar.j6.y8;
        h2Var2.a(zu0Var3.h0(i352));
        int i362 = org.telegram.ui.ActionBar.j6.z8;
        imageView22.setBackground(org.telegram.ui.ActionBar.j6.e0(zu0Var3.h0(i362), 1));
        imageView22.setContentDescription(LocaleController.getString("Close", R.string.Close));
        faVar2.addView(imageView22, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        zu0Var3.N0.add(imageView22);
        imageView22.setOnClickListener(new tq0(zu0Var3, 0));
        NumberTextView numberTextView2 = new NumberTextView(context2);
        zu0Var3.A0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(AndroidUtilities.bold());
        numberTextView2.setTextColor(zu0Var3.h0(i352));
        faVar2.addView(numberTextView2, w7.x5.m(1.0f, 0, -1, 18, 0, 0));
        zu0Var3.N0.add(numberTextView2);
        if (!DialogObject.isEncryptedDialog(zu0Var3.j1)) {
        }
        org.telegram.ui.ActionBar.w0 w0Var62 = new org.telegram.ui.ActionBar.w0(context2, zu0Var3.h0(i362), zu0Var3.h0(i352), false);
        zu0Var3.l0 = w0Var62;
        w0Var62.setIcon(R.drawable.msg_delete);
        w0Var62.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        w0Var62.setDuplicateParentStateEnabled(false);
        faVar2.addView(w0Var62, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        zu0Var3.N0.add(w0Var62);
        w0Var62.setOnClickListener(new tq0(zu0Var3, 5));
        zu0Var3.H = new et0(zu0Var3, context2);
        zu0Var3.I = new tu0(zu0Var3, context2);
        zu0Var3.K = new mu0(zu0Var3, context2, 1);
        zu0Var3.L = new mu0(zu0Var3, context2, 2);
        zu0Var3.M = new mu0(zu0Var3, context2, 4);
        zu0Var3.N = new gu0(zu0Var3, context2, zu0Var3.v1.getCurrentAccount(), zu0Var3.v1.getResourceProvider());
        zu0Var3.O = new nt0(zu0Var3, context2);
        zu0Var3.g0 = new vt0(zu0Var3, context2, 1);
        zu0Var3.h0 = new vt0(zu0Var3, context2, 4);
        zu0Var3.i0 = new vt0(zu0Var3, context2, 3);
        zu0Var3.j0 = new qt0(zu0Var3, context2);
        zu0Var3.P = new kt0(zu0Var3, context2);
        zu0Var3.Q = new it0(zu0Var3, context2);
        zu0Var3.R = new ju0(zu0Var3, context2);
        zu0Var3.S = new ku0(zu0Var3, context2);
        if (!zu0Var3.v0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", zu0Var3.v1.getUserConfig().getClientUserId());
            bundle2.putInt("chatMode", 3);
            ft0 ft0Var2 = new ft0(zu0Var3, context2, zu0Var3.v1.getParentLayout(), bundle2);
            zu0Var3.T = ft0Var2;
            long j112 = zu0Var3.j1;
            org.telegram.ui.co coVar2 = ft0Var2.a;
            coVar2.d4 = j112;
            coVar2.Pa = true;
            ft0Var2.setClipToOutline(true);
            ft0Var2.setOutlineProvider(new gt0());
        }
        jt0 jt0Var2 = new jt0(zu0Var3, context2);
        zu0Var3.a0 = jt0Var2;
        if (zu0Var3.F == 0) {
        }
        zu0Var3.c0 = new ht0(zu0Var3, context2);
        zu0Var3.b0 = new s4.y(new lr0(zu0Var3));
        zu0Var3.d0 = new wu0(zu0Var3, context2, false);
        zu0Var3.e0 = new mr0(zu0Var3, context2);
        zu0Var3.f0 = new wu0(zu0Var3, context2, true);
        zu0Var3.J = new nu0(zu0Var3, context2);
        if (!zu0Var3.r0()) {
        }
        f6Var2 = f6Var;
        r10 = 0;
        zu0Var = zu0Var3;
        zu0Var.setWillNotDraw(false);
        i18 = 0;
        i19 = -1;
        i20 = 0;
        while (true) {
            st0VarArr = zu0Var.k0;
            if (i20 >= st0VarArr.length) {
            }
            st0 st0Var6222 = zu0Var.k0[i20];
            t00Var4 = st0Var6222.v;
            st0Var6222.w = new js0(zu0Var, context2, t00Var4);
            zw0Var = zu0Var.k0[i20].w;
            zw0Var.d(8, false);
            zw0Var2 = zu0Var.k0[i20].w;
            zw0Var2.setAnimateLayoutChange(true);
            st0 st0Var7222 = zu0Var.k0[i20];
            zw0Var3 = st0Var7222.w;
            st0Var7222.addView(zw0Var3, w7.x5.c(-1.0f, -1));
            zw0Var4 = zu0Var.k0[i20].w;
            zw0Var4.setOnTouchListener(new bi.d(23));
            zw0Var5 = zu0Var.k0[i20].w;
            zw0Var5.e(true, false);
            zw0Var6 = zu0Var.k0[i20].w;
            zw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
            zw0Var7 = zu0Var.k0[i20].w;
            zw0Var7.f.setVisibility(8);
            zw0Var8 = zu0Var.k0[i20].w;
            zw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            zw0Var9 = zu0Var.k0[i20].w;
            zw0Var9.f.setVisibility(8);
            zw0Var10 = zu0Var.k0[i20].w;
            t00Var5 = zu0Var.k0[i20].v;
            zw0Var10.addView(t00Var5, w7.x5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
            rt0Var16 = zu0Var.k0[i20].h;
            zw0Var11 = zu0Var.k0[i20].w;
            rt0Var16.setEmptyView(zw0Var11);
            rt0Var17 = zu0Var.k0[i20].h;
            rt0Var17.n1(0, true);
            st0[] st0VarArr2222 = zu0Var.k0;
            st0 st0Var8222 = st0VarArr2222[i20];
            rt0Var18 = st0VarArr2222[i20].h;
            st0Var8222.E = new pk0(rt0Var18, zu0Var.k0[i20].x);
            i20++;
            f6Var2 = f6Var;
            i18 = i21;
            i19 = i22;
        }
        view = zu0Var.W;
        if (view != null) {
        }
        org.telegram.ui.Cells.w0 w0Var722 = new org.telegram.ui.Cells.w0(context2);
        zu0Var.K0 = w0Var722;
        w0Var722.T((int) (System.currentTimeMillis() / 1000), false, false);
        w0Var722.setAlpha(0.0f);
        w0Var722.V(org.telegram.ui.ActionBar.j6.wc, org.telegram.ui.ActionBar.j6.kd);
        w0Var722.setTranslationY(-AndroidUtilities.dp(48.0f));
        zu0Var.addView(w0Var722, w7.x5.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        N = zu0Var.N();
        zu0Var2 = zu0Var;
        if (!N) {
        }
        zu0Var2.v1(false);
        zu0Var2.m1(false);
        if (zu0Var2.X0[0] >= 0) {
        }
        ur0Var = zu0Var2.W;
        if (ur0Var != null) {
        }
        zu0Var2.c2 = new jh(zu0Var2, 2);
    }

    public static mt0 M(int i10, long j3, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        mt0 mt0Var = new mt0(context, f6Var);
        TextView textView = mt0Var.a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return mt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return mt0Var;
        }
        if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return mt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return mt0Var;
        }
        if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return mt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return mt0Var;
        }
        if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return mt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return mt0Var;
        }
        if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return mt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return mt0Var;
        }
        if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return mt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return mt0Var;
        }
        ImageView imageView = mt0Var.b;
        if (i10 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
            return mt0Var;
        }
        if (i10 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return mt0Var;
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

    public static void g(zu0 zu0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        wm wmVar = new wm(zu0Var, i10, storyItem, 10);
        ai.l9 storiesController = zu0Var.getStoriesController();
        long j3 = zu0Var.j1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j3, arrayList);
        vc.a0(zu0Var.v1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), wmVar).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ai.l9 getStoriesController() {
        return MessagesController.getInstance(this.v1.getCurrentAccount()).getStoriesController();
    }

    public static /* synthetic */ void h(zu0 zu0Var, TL_stories.StoryItem storyItem) {
        zu0Var.getStoriesController().o0(zu0Var.j1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        vc.a0(zu0Var.v1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(zu0 zu0Var, long j3, int i10, String str) {
        ai.x8 B = zu0Var.getStoriesController().B(j3, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((ai.e9) B.h.get(c10)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(zu0 zu0Var, TL_stories.StoryItem storyItem, ai.e9 e9Var) {
        zu0Var.getStoriesController().c(e9Var.a, zu0Var.j1, storyItem);
        AndroidUtilities.runOnUIThread(new br0(1, zu0Var, e9Var), 100L);
    }

    public static void m(zu0 zu0Var, HashSet hashSet, TL_stories.StoryItem storyItem, n70 n70Var, ai.e9 e9Var) {
        String formatString;
        long j3 = zu0Var.j1;
        if (hashSet.contains(Integer.valueOf(e9Var.a))) {
            zu0Var.getStoriesController().c(e9Var.a, j3, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, e9Var.b);
        } else {
            ai.l9 storiesController = zu0Var.getStoriesController();
            int i10 = e9Var.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j3, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, e9Var.b);
        }
        vc.a0(zu0Var.v1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        n70Var.u();
    }

    public static void n(zu0 zu0Var, long j3, int i10) {
        ai.x8 B = zu0Var.getStoriesController().B(j3, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ai.e9 e9Var = (ai.e9) B.h.remove(c10);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_deleteAlbum.album_id = e9Var.a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int p(View view) {
        if (view instanceof org.telegram.ui.Cells.t7) {
            return ((org.telegram.ui.Cells.t7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            return ((org.telegram.ui.Cells.j7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            return ((org.telegram.ui.Cells.i7) view).getMessage().getId();
        }
        return 0;
    }

    public static boolean p0(int i10) {
        return i10 == 8 || i10 == 9 || w0(i10);
    }

    public static void q(st0 st0Var, ou0[] ou0VarArr, boolean z10) {
        br0 br0Var;
        if (!z10) {
            if (st0Var.G == null || (br0Var = st0Var.H) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(br0Var);
            st0Var.H.run();
            st0Var.H = null;
            st0Var.G = null;
            return;
        }
        if (SharedConfig.fastScrollHintCount <= 0 || st0Var.G != null || st0Var.I || st0Var.h.getFastScroll() == null || !st0Var.h.getFastScroll().a0 || st0Var.h.getFastScroll().getVisibility() != 0) {
            return;
        }
        int i10 = 0;
        if (ou0VarArr[0].e() < 50) {
            return;
        }
        SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
        st0Var.I = true;
        Context context = st0Var.getContext();
        pq0 pq0Var = new pq0(context);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        int i11 = org.telegram.ui.ActionBar.j6.pf;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        pq0Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.qf, false)));
        pq0Var.addView(textView, w7.x5.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        oq0 oq0Var = new oq0(context);
        oq0Var.a = new Random();
        Paint paint = new Paint(1);
        oq0Var.b = paint;
        Paint paint2 = new Paint(1);
        oq0Var.c = paint2;
        oq0Var.f = 1.0f;
        oq0Var.h = 0.0f;
        paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i11, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        Paint paint3 = new Paint();
        oq0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        oq0Var.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        pq0Var.addView(oq0Var, w7.x5.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        st0Var.G = pq0Var;
        st0Var.addView(pq0Var, w7.x5.c(-2.0f, -2));
        st0Var.G.setAlpha(0.0f);
        st0Var.G.setScaleX(0.8f);
        st0Var.G.setScaleY(0.8f);
        st0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        st0Var.invalidate();
        br0 br0Var2 = new br0(i10, st0Var, pq0Var);
        st0Var.H = br0Var2;
        AndroidUtilities.runOnUIThread(br0Var2, 4000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(zu0 zu0Var) {
        zu0 zu0Var2;
        ArrayList arrayList;
        int i10;
        int i11;
        Bitmap bitmap;
        long j3 = zu0Var.j1;
        ou0[] ou0VarArr = zu0Var.t1;
        st0 W = zu0Var.W(0);
        if (W != null && W.getMeasuredHeight() > 0 && W.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(W.getMeasuredWidth(), W.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e) {
                FileLog.e(e);
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                zu0Var.H1 = true;
                W.h.draw(new Canvas(bitmap2));
                View view = new View(W.getContext());
                view.setBackground(new BitmapDrawable(bitmap2));
                W.addView(view);
                zu0Var2 = zu0Var;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new gg.k0((FrameLayout) zu0Var2, view, (View) W, (Object) bitmap2, 3)).start();
                W.h.setAlpha(0.0f);
                W.h.animate().alpha(1.0f).setUpdateListener(new h70(W, 20)).setDuration(200L).start();
                ru0 ru0Var = zu0Var2.u1;
                int[] iArr = ru0Var.c;
                arrayList = ru0Var.n[0].a;
                ou0 ou0Var = ou0VarArr[0];
                int[] iArr2 = ou0Var.f;
                iArr2[1] = 0;
                i10 = ou0Var.q;
                if (i10 != 0) {
                    iArr2[0] = iArr[0];
                } else if (i10 == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                ou0Var.h = false;
                zu0Var2.y0(0, !DialogObject.isEncryptedDialog(j3) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                zu0Var2.z0(false);
                zu0Var2.D1.R();
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j3);
                for (i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    ou0 ou0Var2 = ou0VarArr[0];
                    int i12 = ou0Var2.q;
                    if (i12 == 0) {
                        ou0Var2.a(messageObject, 0, false, isEncryptedDialog);
                    } else if (i12 == 1) {
                        if (messageObject.isPhoto()) {
                            ou0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                        }
                    } else if (!messageObject.isPhoto()) {
                        ou0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                    }
                }
            }
        }
        zu0Var2 = zu0Var;
        ru0 ru0Var2 = zu0Var2.u1;
        int[] iArr3 = ru0Var2.c;
        arrayList = ru0Var2.n[0].a;
        ou0 ou0Var3 = ou0VarArr[0];
        int[] iArr22 = ou0Var3.f;
        iArr22[1] = 0;
        i10 = ou0Var3.q;
        if (i10 != 0) {
        }
        ou0Var3.h = false;
        zu0Var2.y0(0, !DialogObject.isEncryptedDialog(j3) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        zu0Var2.z0(false);
        zu0Var2.D1.R();
        boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j3);
        while (i11 < arrayList.size()) {
        }
    }

    public static void t(zu0 zu0Var, int i10, boolean z10) {
        st0[] st0VarArr = zu0Var.k0;
        if (st0VarArr[0].F == i10) {
            return;
        }
        st0 st0Var = st0VarArr[1];
        st0Var.F = i10;
        st0Var.setVisibility(0);
        zu0Var.k0();
        zu0Var.m1(true);
        zu0Var.h1 = z10;
        zu0Var.L0();
        zu0Var.A(!zu0Var.s0(i10), true);
        zu0Var.q1(true);
    }

    public static int u(zu0 zu0Var, s4.h0 h0Var) {
        if (h0Var == zu0Var.c0) {
            return 8;
        }
        if (h0Var == zu0Var.e0) {
            return 9;
        }
        for (yu0 yu0Var : zu0Var.Y1.values()) {
            if (yu0Var.c == h0Var) {
                return yu0Var.a;
            }
        }
        return -1;
    }

    public static int v(zu0 zu0Var, s4.h0 h0Var) {
        if (h0Var == zu0Var.d0) {
            return 8;
        }
        if (h0Var == zu0Var.f0) {
            return 9;
        }
        for (yu0 yu0Var : zu0Var.Y1.values()) {
            if (yu0Var.d == h0Var) {
                return yu0Var.a;
            }
        }
        return -1;
    }

    public static boolean w0(int i10) {
        return (i10 & (-65536)) == 65536;
    }

    public final void A(boolean z10, boolean z11) {
        bj0 bj0Var = this.s0;
        if (bj0Var == null || this.V1 == z10) {
            return;
        }
        this.V1 = z10;
        if (z10 || bj0Var.getAnimatedDrawable().a0 >= 20) {
            bj0Var.getAnimatedDrawable().P(this.V1 ? 50 : 100);
        } else {
            bj0Var.getAnimatedDrawable().P(0);
        }
        if (z11) {
            bj0Var.getAnimatedDrawable().start();
        } else {
            bj0Var.getAnimatedDrawable().M(bj0Var.getAnimatedDrawable().f);
        }
    }

    public final void A0(int i10) {
        int i11;
        ou0[] ou0VarArr = this.t1;
        if (i10 == 0) {
            int i12 = ou0VarArr[0].q;
            i11 = i12 == 1 ? 6 : i12 == 2 ? 7 : 0;
        } else {
            i11 = i10 == 1 ? 1 : i10 == 2 ? 2 : i10 == 4 ? 4 : i10 == 5 ? 5 : 3;
        }
        ou0VarArr[i10].g = true;
        org.telegram.ui.ActionBar.o2 o2Var = this.v1;
        o2Var.getMediaDataController().loadMedia(this.j1, 50, 0, ou0VarArr[i10].k, i11, this.F, 1, o2Var.getClassGuid(), ou0VarArr[i10].p, null, null);
    }

    public final void B(int i10) {
        int i11;
        st0 W = W(this.p1);
        this.s = -1;
        if (W != null) {
            W.h.C0();
            this.q1 = i10;
            W.r.setVisibility(0);
            if (p0(this.p1)) {
                W.r.setAdapter(l1(this.p1));
            } else {
                W.r.setAdapter(this.I);
            }
            rt0 rt0Var = W.r;
            int paddingLeft = rt0Var.getPaddingLeft();
            rt0 rt0Var2 = W.r;
            int Z = Z(W.F);
            rt0Var2.d3 = Z;
            int paddingRight = W.r.getPaddingRight();
            rt0 rt0Var3 = W.r;
            int Y = Y(v0());
            rt0Var3.e3 = Y;
            rt0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.s.y1(i10);
            W.r.b0();
            int i12 = 0;
            while (true) {
                st0[] st0VarArr = this.k0;
                if (i12 >= st0VarArr.length) {
                    break;
                }
                st0 st0Var = st0VarArr[i12];
                if (st0Var != null && ((i11 = st0Var.F) == 0 || p0(i11))) {
                    AndroidUtilities.updateVisibleRows(st0VarArr[i12].h);
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
            ofFloat.addUpdateListener(new os0(this, W, i13));
            ofFloat.addListener(new ei.y2(this, p0(W.F) ? 1 : 0, i10, 2));
            ofFloat.setInterpolator(qr.f);
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
        org.telegram.ui.ActionBar.o2 o2Var = this.v1;
        if (!r02) {
            return v0() || (o2Var != null && o2Var.getMessagesController().getStoriesController().h(j3));
        }
        TLRPC.User user = MessagesController.getInstance(o2Var.getCurrentAccount()).getUser(Long.valueOf(j3));
        return user != null && user.bot && user.bot_can_edit;
    }

    public final void C0(int i10, View view) {
        nr0 nr0Var;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        TLRPC.User user2;
        ju0 ju0Var = this.R;
        SparseArray[] sparseArrayArr = this.Z0;
        org.telegram.ui.ActionBar.o2 o2Var = this.v1;
        final int i11 = 0;
        if (i10 != 101) {
            if (i10 == 100) {
                if (this.e1 != null && o2Var.getMessagesController().isUserNoForwards(this.e1)) {
                    i40 i40Var = this.E1;
                    if (i40Var != null) {
                        i40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                        this.E1.f(view, true);
                        return;
                    }
                    return;
                }
                if (this.d1 != null) {
                    TLRPC.Chat chat2 = o2Var.getMessagesController().getChat(Long.valueOf(this.d1.id));
                    if (o2Var.getMessagesController().isChatNoForwards(chat2)) {
                        i40 i40Var2 = this.E1;
                        if (i40Var2 != null) {
                            i40Var2.setText((!ChatObject.isChannel(chat2) || chat2.megagroup) ? LocaleController.getString(R.string.ForwardsRestrictedInfoGroup) : LocaleController.getString(R.string.ForwardsRestrictedInfoChannel));
                            this.E1.f(view, true);
                            return;
                        }
                        return;
                    }
                }
                if (j0()) {
                    i40 i40Var3 = this.E1;
                    if (i40Var3 != null) {
                        i40Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                        this.E1.f(view, true);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("canSelectTopics", true);
                bundle.putInt("dialogsType", 3);
                org.telegram.ui.wy wyVar = new org.telegram.ui.wy(bundle);
                wyVar.C2 = new sq0(this);
                o2Var.presentFragment(wyVar);
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
                org.telegram.ui.bo boVar = new org.telegram.ui.bo(bundle2);
                boVar.L7 = messageObject.getId();
                long j3 = this.F;
                if (j3 != 0) {
                    ng.d.a(boVar, MessagesStorage.TopicKey.of(dialogId, j3));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                o2Var.presentFragment(boVar, false);
                return;
            }
            if (i10 == 103 || i10 == 104) {
                if (getClosestTab() == 8) {
                    ht0 ht0Var = this.c0;
                    if (ht0Var == null || ht0Var.s == null) {
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
                    long j10 = savedMessagesController.allDialogs.get(i13).dialogId;
                    if (ju0Var.w.contains(Long.valueOf(j10))) {
                        arrayList2.add(Long.valueOf(j10));
                    }
                }
                if (savedMessagesController.updatePinned(arrayList2, i10 == 103, true)) {
                    int i14 = 0;
                    while (true) {
                        st0[] st0VarArr = this.k0;
                        if (i14 >= st0VarArr.length) {
                            break;
                        }
                        st0 st0Var = st0VarArr[i14];
                        if (st0Var.F == 11) {
                            st0Var.x.h1(0, 0);
                            break;
                        }
                        i14++;
                    }
                } else {
                    o2Var.showDialog(new rg.j0(33, o2Var.getCurrentAccount(), getContext(), o2Var, null));
                }
                L(true);
                return;
            }
            return;
        }
        boolean p02 = p0(getSelectedTab());
        org.telegram.ui.ActionBar.f6 f6Var = this.F1;
        if (p02 || getSelectedTab() == 13) {
            if (sparseArrayArr[0] != null) {
                if (!r0() || (nr0Var = this.U) == null || nr0Var.getCurrentList() == null) {
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
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, f6Var);
                    String string = LocaleController.getString(arrayList3.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.R = string;
                    c2Var.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.Components.zq0
                        public final /* synthetic */ zu0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.b2
                        public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i16) {
                            switch (i11) {
                                case 0:
                                    zu0 zu0Var = this.b;
                                    org.telegram.ui.ActionBar.o2 o2Var2 = zu0Var.v1;
                                    ai.l9 storiesController = o2Var2.getMessagesController().getStoriesController();
                                    long j11 = zu0Var.j1;
                                    ArrayList arrayList4 = arrayList3;
                                    storiesController.s(j11, arrayList4);
                                    vc.a0(o2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList4.size(), new Object[0])).j();
                                    zu0Var.L(false);
                                    break;
                                default:
                                    zu0 zu0Var2 = this.b;
                                    zu0Var2.getClass();
                                    int i17 = 0;
                                    while (true) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (i17 >= arrayList5.size()) {
                                            zu0Var2.L(true);
                                            break;
                                        } else {
                                            zu0Var2.v1.getMessagesController().deleteSavedDialog(((Long) arrayList5.get(i17)).longValue());
                                            i17++;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new bn0(6));
                    c2Var.show();
                    c2Var.h();
                    return;
                }
                ai.t8 currentList = nr0Var.getCurrentList();
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
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, f6Var);
                String string2 = LocaleController.getString(arrayList4.size() > 1 ? R.string.DeleteBotPreviewsTitle : R.string.DeleteBotPreviewTitle);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                c2Var2.R = string2;
                c2Var2.T = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList4.size(), new Object[0]);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new s50(this, currentList, arrayList4, r15 ? 1 : 0));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new bn0(5));
                c2Var2.show();
                c2Var2.h();
                return;
            }
            return;
        }
        if (getSelectedTab() != 11) {
            long j11 = this.j1;
            if (DialogObject.isEncryptedDialog(j11)) {
                encryptedChat = org.telegram.messenger.w1.m(o2Var.getMessagesController(), j11);
                user = null;
                chat = null;
            } else if (DialogObject.isUserDialog(j11)) {
                user = o2Var.getMessagesController().getUser(Long.valueOf(j11));
                chat = null;
                encryptedChat = null;
            } else {
                chat = o2Var.getMessagesController().getChat(Long.valueOf(-j11));
                user = null;
                encryptedChat = null;
            }
            c5.z(o2Var, user, chat, encryptedChat, null, this.c1, null, this.Z0, null, 0, 0, null, new rq0(this, r15 ? 1 : 0), null, this.F1);
            return;
        }
        SavedMessagesController savedMessagesController2 = o2Var.getMessagesController().getSavedMessagesController();
        final ArrayList arrayList5 = new ArrayList();
        for (int i17 = 0; i17 < savedMessagesController2.allDialogs.size(); i17++) {
            long j12 = savedMessagesController2.allDialogs.get(i17).dialogId;
            if (ju0Var.w.contains(Long.valueOf(j12))) {
                arrayList5.add(Long.valueOf(j12));
            }
        }
        String str = "";
        if (arrayList5.isEmpty()) {
            z10 = false;
        } else {
            Long l4 = (Long) arrayList5.get(0);
            long longValue = l4.longValue();
            z10 = longValue == o2Var.getUserConfig().getClientUserId();
            if (longValue < 0) {
                TLRPC.Chat chat4 = o2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat4 != null) {
                    str = chat4.title;
                }
            } else if (longValue >= 0 && (user2 = o2Var.getMessagesController().getUser(l4)) != null) {
                str = UserObject.isAnonymous(user2) ? LocaleController.getString(R.string.AnonymousForward) : UserObject.getUserName(user2);
            }
        }
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, f6Var);
        String formatString = arrayList5.size() == 1 ? LocaleController.formatString(z10 ? R.string.ClearHistoryMyNotesTitle : R.string.ClearHistoryTitleSingle2, str) : LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList5.size(), new Object[0]);
        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
        c2Var3.R = formatString;
        c2Var3.T = arrayList5.size() == 1 ? LocaleController.formatString(z10 ? R.string.ClearHistoryMyNotesMessage : R.string.ClearHistoryMessageSingle, str) : LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList5.size(), new Object[0]);
        String string3 = LocaleController.getString(R.string.Remove);
        final int i18 = r15 ? 1 : 0;
        alertDialog$Builder3.k(string3, new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.Components.zq0
            public final /* synthetic */ zu0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void f(org.telegram.ui.ActionBar.c2 c2Var22, int i162) {
                switch (i18) {
                    case 0:
                        zu0 zu0Var = this.b;
                        org.telegram.ui.ActionBar.o2 o2Var2 = zu0Var.v1;
                        ai.l9 storiesController = o2Var2.getMessagesController().getStoriesController();
                        long j112 = zu0Var.j1;
                        ArrayList arrayList42 = arrayList5;
                        storiesController.s(j112, arrayList42);
                        vc.a0(o2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList42.size(), new Object[0])).j();
                        zu0Var.L(false);
                        break;
                    default:
                        zu0 zu0Var2 = this.b;
                        zu0Var2.getClass();
                        int i172 = 0;
                        while (true) {
                            ArrayList arrayList52 = arrayList5;
                            if (i172 >= arrayList52.size()) {
                                zu0Var2.L(true);
                                break;
                            } else {
                                zu0Var2.v1.getMessagesController().deleteSavedDialog(((Long) arrayList52.get(i172)).longValue());
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
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    public boolean D() {
        return !(this instanceof y30);
    }

    public final boolean E() {
        st0 st0Var;
        st0[] st0VarArr = this.k0;
        if (st0VarArr == null || (st0Var = st0VarArr[0]) == null) {
            return false;
        }
        if (this.k1 && p0(st0Var.F)) {
            return false;
        }
        boolean p02 = p0(st0VarArr[0].F);
        int i10 = this.m1[p02 ? 1 : 0];
        return i10 != X(p02 ? 1 : 0, i10, false);
    }

    public final void F() {
        ps0 ps0Var = this.I0;
        if (ps0Var.d(ps0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = ps0Var.getFirstTabId();
        ps0Var.setInitialTabId(firstTabId);
        this.k0[0].F = firstTabId;
        m1(false);
    }

    public final void F0() {
        ai.d9 d9Var;
        ai.d9 d9Var2;
        this.G1.removeAllObservers();
        ht0 ht0Var = this.c0;
        if (ht0Var != null && (d9Var2 = ht0Var.s) != null && d9Var2 != null) {
            d9Var2.z(ht0Var.v);
        }
        mr0 mr0Var = this.e0;
        if (mr0Var != null && (d9Var = mr0Var.s) != null && d9Var != null) {
            d9Var.z(mr0Var.v);
        }
        Iterator it = this.Y1.values().iterator();
        while (it.hasNext()) {
            xu0 xu0Var = ((yu0) it.next()).c;
            ai.d9 d9Var3 = xu0Var.s;
            if (d9Var3 != null && d9Var3 != null) {
                d9Var3.z(xu0Var.v);
            }
        }
    }

    public final void G(st0 st0Var, ml0 ml0Var, s4.c0 c0Var) {
        int i10;
        int i11;
        s4.c1 L;
        ai.d9 d9Var;
        if (this.o1 || this.J1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (ml0Var.getFastScroll() == null || !ml0Var.getFastScroll().n || currentTimeMillis - st0Var.a >= 300) {
            st0Var.a = currentTimeMillis;
            if ((this.V0 && this.U0 && st0Var.F != 11) || st0Var.F == 7) {
                return;
            }
            int L0 = c0Var.L0();
            int abs = L0 == -1 ? 0 : Math.abs(c0Var.N0() - L0) + 1;
            int h = ml0Var.getAdapter() == null ? 0 : ml0Var.getAdapter().h();
            int i12 = st0Var.F;
            int[] iArr = this.m1;
            ou0[] ou0VarArr = this.t1;
            if (i12 == 0 || i12 == 1 || i12 == 2 || i12 == 4) {
                h = ou0VarArr[i12].d() + ou0VarArr[i12].a.size();
                ou0 ou0Var = ou0VarArr[i12];
                if (ou0Var.h && ou0Var.e.size() > 2 && st0Var.F == 0 && ou0VarArr[i12].a.size() != 0) {
                    float f7 = i12 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((ml0Var.getMeasuredHeight() / (ml0Var.getMeasuredWidth() / f7)) * f7 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((xt0) ou0VarArr[i12].e.get(1)).b) {
                        measuredHeight = ((xt0) ou0VarArr[i12].e.get(1)).b;
                    }
                    if ((L0 > h && L0 - h > measuredHeight) || ((i10 = L0 + abs) < ou0VarArr[i12].m && ou0VarArr[0].m - i10 > measuredHeight)) {
                        wm wmVar = new wm(this, i12, ml0Var, 12);
                        this.J1 = wmVar;
                        AndroidUtilities.runOnUIThread(wmVar);
                        return;
                    }
                }
            }
            int i13 = st0Var.F;
            if (i13 == 7) {
                return;
            }
            if (p0(i13)) {
                wu0 k12 = k1(st0Var.F);
                if (k12 == null || (d9Var = k12.s) == null || L0 + abs <= d9Var.i() - iArr[1]) {
                    return;
                }
                k12.P();
                return;
            }
            int i14 = st0Var.F;
            if (i14 == 6) {
                if (abs > 0) {
                    kt0 kt0Var = this.P;
                    boolean z10 = kt0Var.h;
                    ArrayList arrayList = kt0Var.d;
                    if (z10 || kt0Var.e || arrayList.isEmpty() || L0 + abs < h - 5) {
                        return;
                    }
                    kt0.E(kt0Var, ((TLRPC.Chat) hg.k0.h(1, arrayList)).id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.o2 o2Var = this.v1;
            if (i14 == 11) {
                int i15 = -1;
                for (int i16 = 0; i16 < st0Var.h.getChildCount(); i16++) {
                    View childAt = st0Var.h.getChildAt(i16);
                    st0Var.h.getClass();
                    i15 = Math.max(RecyclerView.S(childAt), i15);
                }
                s4.h0 adapter = st0Var.h.getAdapter();
                ku0 ku0Var = this.S;
                if (adapter != ku0Var) {
                    if (i15 + 1 >= o2Var.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                        o2Var.getMessagesController().getSavedMessagesController().loadDialogs(false);
                        return;
                    }
                    return;
                } else {
                    if (i15 + 1 < ku0Var.h.size() + ku0Var.e.size() || ku0Var.s || ku0Var.r) {
                        return;
                    }
                    ku0Var.r = true;
                    ku0Var.F();
                    return;
                }
            }
            if (i14 == 10 || i14 == 12 || i14 == 13 || i14 == 14) {
                return;
            }
            int i17 = i14 == 0 ? 3 : i14 == 5 ? 10 : 6;
            int i18 = i14 == 15 ? 8 : i14;
            if (abs + L0 > h - i17 || ou0VarArr[i18].o) {
                ou0 ou0Var2 = ou0VarArr[i18];
                if (!ou0Var2.g) {
                    if (i14 == 0) {
                        int i19 = ou0VarArr[0].q;
                        i11 = i19 == 1 ? 6 : i19 == 2 ? 7 : 0;
                    } else {
                        i11 = i14 == 1 ? 1 : i14 == 2 ? 2 : i14 == 4 ? 4 : i14 == 5 ? 5 : i14 == 15 ? 8 : 3;
                    }
                    boolean[] zArr = ou0Var2.i;
                    if (!zArr[0]) {
                        ou0Var2.g = true;
                        o2Var.getMediaDataController().loadMedia(this.j1, 50, ou0VarArr[i18].j[0], 0, i11, this.F, 1, o2Var.getClassGuid(), ou0VarArr[i18].p, null, null);
                    } else if (this.c1 != 0 && !zArr[1]) {
                        ou0Var2.g = true;
                        o2Var.getMediaDataController().loadMedia(this.c1, 50, ou0VarArr[i18].j[1], 0, i11, this.F, 1, o2Var.getClassGuid(), ou0VarArr[i18].p, null, null);
                    }
                }
            }
            int i20 = ou0VarArr[i18].m;
            if (i18 == 0) {
                i20 = this.H.L(0);
            }
            if (L0 - i20 < i17 + 1) {
                ou0 ou0Var3 = ou0VarArr[i18];
                if (!ou0Var3.g && !ou0Var3.l && !ou0Var3.o) {
                    A0(st0Var.F);
                }
            }
            st0 st0Var2 = this.k0[0];
            if (st0Var2.h == ml0Var) {
                int i21 = st0Var2.F;
                if ((i21 != 0 && i21 != 5) || L0 == -1 || (L = ml0Var.L(L0)) == null) {
                    return;
                }
                int i22 = L.f;
                if (i22 == 0 || i22 == 12) {
                    View view = L.a;
                    boolean z11 = view instanceof org.telegram.ui.Cells.u7;
                    org.telegram.ui.Cells.w0 w0Var = this.K0;
                    if (!z11) {
                        if (view instanceof org.telegram.ui.Cells.e2) {
                            w0Var.T(((org.telegram.ui.Cells.e2) view).getDate(), false, true);
                        }
                    } else {
                        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                        MessageObject messageObject = u7Var.e <= 0 ? null : u7Var.b[0];
                        if (messageObject != null) {
                            w0Var.T(messageObject.messageOwner.date, false, true);
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
        ur0 ur0Var = this.W;
        if (ur0Var == null || !ur0Var.w) {
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
                    org.telegram.ui.ActionBar.w0 w0Var = this.u0;
                    if (w0Var != null) {
                        w0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.t0;
                    if (w0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        w0Var2.setVisibility(i13);
                    }
                    u1();
                }
                this.b1 = false;
                if (view instanceof org.telegram.ui.Cells.j7) {
                    ((org.telegram.ui.Cells.j7) view).b(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.u7) {
                    ((org.telegram.ui.Cells.u7) view).b(0, sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0);
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    ((org.telegram.ui.Cells.n7) view).f(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) view).e(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    ((org.telegram.ui.Cells.e2) view).c(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.t7) {
                    ((org.telegram.ui.Cells.t7) view).i(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                }
            } else {
                zr0 zr0Var = this.r1;
                ou0[] ou0VarArr = this.t1;
                org.telegram.ui.ActionBar.o2 o2Var = this.v1;
                if (i11 == 0) {
                    ou0 ou0Var = ou0VarArr[i11];
                    int i14 = i10 - ou0Var.m;
                    if (i14 >= 0 && i14 < ou0Var.a.size()) {
                        PhotoViewer.t1().J2(null, o2Var, null);
                        PhotoViewer.t1().a2(ou0VarArr[i11].a, i14, this.j1, this.c1, this.F, zr0Var);
                    }
                } else if (i11 == 2 || i11 == 4) {
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).a();
                    }
                } else if (i11 == 5) {
                    PhotoViewer.t1().J2(null, o2Var, null);
                    int indexOf = ou0VarArr[i11].a.indexOf(messageObject);
                    if (indexOf < 0) {
                        PhotoViewer.t1().a2(org.telegram.messenger.w1.l(messageObject), 0, 0L, 0L, 0L, zr0Var);
                    } else {
                        PhotoViewer.t1().a2(ou0VarArr[i11].a, indexOf, this.j1, this.c1, this.F, zr0Var);
                    }
                } else if (i11 == 1) {
                    if (view instanceof org.telegram.ui.Cells.j7) {
                        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                        TLRPC.Document document = messageObject.getDocument();
                        if (j7Var.G) {
                            if (messageObject.canPreviewDocument()) {
                                PhotoViewer.t1().J2(null, o2Var, null);
                                int indexOf2 = ou0VarArr[i11].a.indexOf(messageObject);
                                if (indexOf2 < 0) {
                                    PhotoViewer.t1().a2(org.telegram.messenger.w1.l(messageObject), 0, 0L, 0L, 0L, zr0Var);
                                    return;
                                } else {
                                    PhotoViewer.t1().a2(ou0VarArr[i11].a, indexOf2, this.j1, this.c1, this.F, zr0Var);
                                    return;
                                }
                            }
                            AndroidUtilities.openDocument(messageObject, o2Var.getParentActivity(), o2Var);
                        } else if (j7Var.F) {
                            o2Var.getFileLoader().cancelLoadFile(document);
                            j7Var.f(true);
                        } else {
                            MessageObject message = j7Var.getMessage();
                            message.putInDownloadsStore = true;
                            o2Var.getFileLoader().loadFile(document, message, 0, 0);
                            j7Var.f(true);
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
                                    o2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str3 = webPage.embed_url;
                            if (str3 != null && str3.length() != 0) {
                                vu.J(o2Var, messageObject, this.r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
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
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (p0(i11)) {
                    wu0 k12 = k1(i11);
                    ai.d9 d9Var = k12 != null ? k12.s : null;
                    if (d9Var == null) {
                        return;
                    }
                    ai.jc orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int id2 = messageObject.getId();
                    ai.u9 a2 = ai.u9.a(this.k0[0].h);
                    a2.e = new lv(d9Var, 18);
                    if ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).s1) {
                        i12 = AndroidUtilities.dp(68.0f);
                    }
                    a2.s += i12;
                    orCreateStoryViewer.C(context, id2, d9Var, a2);
                }
            }
            p1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean H(MotionEvent motionEvent) {
        nr0 nr0Var;
        st0[] st0VarArr = this.k0;
        int i10 = st0VarArr[0].F;
        if (i10 == 13 && (nr0Var = this.U) != null) {
            View currentView = nr0Var.n.getCurrentView();
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
                                jVar.J0(false);
                                jVar.cancelLongPress();
                                jVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) uVar.getParent();
                                uVar.U = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - uVar.getX());
                                int y3 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - uVar.getY());
                                int i11 = uVar.U;
                                Rect rect = uVar.V;
                                uVar.S = -1;
                                int i12 = y3 + jVar.X2;
                                for (int i13 = 0; i13 < jVar.getChildCount(); i13++) {
                                    View childAt = jVar.getChildAt(i13);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i11, i12)) {
                                        uVar.S = RecyclerView.T(childAt);
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
                                    uVar.c = Math.max(0.0f, Math.min(1.0f, z11 ? org.telegram.messenger.w1.y(2.0f, uVar.Q, 1.0f, 1.0f) : (1.0f - uVar.Q) / 0.5f));
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
                        st0VarArr[0].h.J0(false);
                        st0VarArr[0].h.cancelLongPress();
                        st0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - st0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - st0VarArr[0].getY());
                        int i18 = this.w;
                        this.s = -1;
                        int i19 = y10 + st0VarArr[0].h.X2;
                        if (getY() != 0.0f && this.E == 1) {
                            i19 = 0;
                        }
                        for (int i20 = 0; i20 < st0VarArr[0].h.getChildCount(); i20++) {
                            View childAt2 = st0VarArr[0].h.getChildAt(i20);
                            Rect rect2 = this.x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i18, i19)) {
                                st0VarArr[0].h.getClass();
                                this.s = RecyclerView.T(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.D1.T() && this.s == -1) {
                            this.s = (int) (((this.m1[p0(st0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i18 / st0VarArr[0].h.getMeasuredWidth(), 0.0f))) + st0VarArr[0].x.L0());
                            this.v = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - st0VarArr[0].getY() > 0.0f) {
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
                            this.n1 = Math.max(0.0f, Math.min(1.0f, z13 ? org.telegram.messenger.w1.y(2.0f, this.n, 1.0f, 1.0f) : (1.0f - this.n) / 0.5f));
                        } else {
                            this.n1 = 0.0f;
                        }
                        float f10 = this.n1;
                        if (f10 == 1.0f || f10 == 0.0f) {
                            s4.h0 k12 = p0(this.p1) ? k1(this.p1) : this.H;
                            if (this.n1 == 1.0f) {
                                int i24 = this.q1;
                                int ceil2 = (((int) Math.ceil(this.s / this.q1)) * i24) + ((int) ((this.z1 / (st0VarArr[0].h.getMeasuredWidth() - ((int) (st0VarArr[0].h.getMeasuredWidth() / this.q1)))) * (i24 - 1)));
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
                        st0VarArr[0].h.invalidate();
                        st0 st0Var = st0VarArr[0];
                        if (st0Var.G != null) {
                            st0Var.invalidate();
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
        ur0 ur0Var;
        final TL_stories.StoryItem storyItem;
        ht0 ht0Var;
        ai.d9 d9Var;
        final int i11 = 0;
        if (!this.C1) {
            org.telegram.ui.ActionBar.o2 o2Var = this.v1;
            if (o2Var.getParentActivity() != null && messageObject != null && ((ur0Var = this.W) == null || !ur0Var.w)) {
                AndroidUtilities.hideKeyboard(o2Var.getParentActivity().getCurrentFocus());
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
                    org.telegram.ui.ActionBar.w0 w0Var = this.u0;
                    if (w0Var != null) {
                        w0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.t0;
                    if (w0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        w0Var2.setVisibility(i12);
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
                    if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.u7) {
                        ((org.telegram.ui.Cells.u7) view).b(i10, true);
                    } else if (view instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.e2) {
                        ((org.telegram.ui.Cells.e2) view).c(true, true);
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
                    n70 I = n70.I(o2Var, view);
                    n70 J = I.J();
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.ou0(I, 25), false);
                    J.k();
                    n70.f(J, getStoriesController().B(j3, true), hashSet, true, new org.telegram.ui.ActionBar.q(this, storyItem2, I, 29), new ai.e4(this, hashSet, storyItem2, I, 9));
                    I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new ei.m2(I, J, 9), false);
                    I.k();
                    I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new ai.c9(this, messageObject, view, i10, 23), false);
                    final int i15 = 3;
                    if (w02) {
                        int h12 = h1(getClosestTab());
                        String w10 = getStoriesController().w(h12, j3);
                        I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new id(this, h12, 7), false);
                        storyItem = storyItem2;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new ai.c9(this, h12, storyItem, w10, 24), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (ht0Var = this.c0) != null && (d9Var = ht0Var.s) != null) {
                            if (d9Var.m(storyItem.id)) {
                                I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() { // from class: org.telegram.ui.Components.uq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                zu0 zu0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zu0Var.getContext(), 0, zu0Var.F1);
                                                alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ar0(zu0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new bn0(7));
                                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                                c2Var.show();
                                                c2Var.h();
                                                break;
                                            case 1:
                                                zu0 zu0Var2 = this;
                                                zu0Var2.getClass();
                                                zu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                zu0 zu0Var3 = this;
                                                zu0Var3.getClass();
                                                zu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                zu0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final int i16 = 2;
                                I.c(R.drawable.chats_pin, LocaleController.getString(R.string.StoriesAlbumMenuPin), new Runnable() { // from class: org.telegram.ui.Components.uq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                zu0 zu0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zu0Var.getContext(), 0, zu0Var.F1);
                                                alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ar0(zu0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new bn0(7));
                                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                                c2Var.show();
                                                c2Var.h();
                                                break;
                                            case 1:
                                                zu0 zu0Var2 = this;
                                                zu0Var2.getClass();
                                                zu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                zu0 zu0Var3 = this;
                                                zu0Var3.getClass();
                                                zu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                zu0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        I.c(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable() { // from class: org.telegram.ui.Components.uq0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        zu0 zu0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zu0Var.getContext(), 0, zu0Var.F1);
                                        alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ar0(zu0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new bn0(7));
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                        c2Var.show();
                                        c2Var.h();
                                        break;
                                    case 1:
                                        zu0 zu0Var2 = this;
                                        zu0Var2.getClass();
                                        zu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                        break;
                                    case 2:
                                        zu0 zu0Var3 = this;
                                        zu0Var3.getClass();
                                        zu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                        break;
                                    default:
                                        zu0.h(this, storyItem);
                                        break;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.Components.uq0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    zu0 zu0Var = this;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zu0Var.getContext(), 0, zu0Var.F1);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                    alertDialog$Builder.a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ar0(zu0Var, storyItem));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new bn0(7));
                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                    c2Var.show();
                                    c2Var.h();
                                    break;
                                case 1:
                                    zu0 zu0Var2 = this;
                                    zu0Var2.getClass();
                                    zu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                    break;
                                case 2:
                                    zu0 zu0Var3 = this;
                                    zu0Var3.getClass();
                                    zu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                    break;
                                default:
                                    zu0.h(this, storyItem);
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
        st0[] st0VarArr = this.k0;
        st0 st0Var = st0VarArr[0];
        if (st0Var == null || st0VarArr[1] == null) {
            return;
        }
        float f7 = 0.0f;
        ur0 ur0Var = this.W;
        if (ur0Var != null) {
            char c10 = (!p0(st0Var.F) || st0VarArr[0].F == 9) ? (char) 0 : (char) 1;
            if (c10 == (st0VarArr[1].getVisibility() == 0 ? (!p0(st0VarArr[1].F) || st0VarArr[1].F == 9) ? (char) 0 : (char) 1 : c10)) {
                abs = c10 != 0 ? 1.0f : 0.0f;
                ur0Var.setTranslationX(c10 != 0 ? 0.0f : st0VarArr[0].getMeasuredWidth());
            } else {
                ur0Var.setTranslationX(st0VarArr[c10 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(ur0Var.getTranslationX()) / ur0Var.getMeasuredWidth());
            }
            float f10 = 0.0f;
            for (int i10 = 0; i10 < st0VarArr.length; i10++) {
                if (st0VarArr[i10].getVisibility() == 0) {
                    yr0 yr0Var = st0VarArr[i10].h;
                    View childAt = yr0Var.getChildCount() == 0 ? null : yr0Var.getChildAt(0);
                    f10 += Utilities.clamp01(1.0f - (st0VarArr[i10].getTranslationX() / st0VarArr[i10].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.S(childAt)) == 0 ? childAt.getY() - yr0Var.getPaddingTop() : yr0Var.getChildCount() == 0 ? 0.0f : -AndroidUtilities.dp(48.0f));
                }
            }
            float clamp01 = Utilities.clamp01(1.0f - ((-f10) / AndroidUtilities.dpf2(48.0f)));
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
            ur0Var.setAlpha(clamp01);
            ur0Var.setScaleX(lerp);
            ur0Var.setScaleY(lerp);
            ur0Var.setTranslationY(this.K1 + f10);
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J() {
        AnimatorSet animatorSet;
        if (!this.g1) {
            return false;
        }
        boolean z10 = this.i1;
        st0[] st0VarArr = this.k0;
        if (!z10) {
            if (Math.abs(st0VarArr[1].getTranslationX()) < 1.0f) {
                st0VarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.h1 ? -1 : 1));
                st0VarArr[1].setTranslationX(0.0f);
                animatorSet = this.f1;
                if (animatorSet != null) {
                }
                this.g1 = false;
            }
            M0(getTabProgress());
            return this.g1;
        }
        if (Math.abs(st0VarArr[0].getTranslationX()) < 1.0f) {
            st0VarArr[0].setTranslationX(0.0f);
            st0VarArr[1].setTranslationX(st0VarArr[0].getMeasuredWidth() * (this.h1 ? 1 : -1));
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
        st0[] st0VarArr = this.k0;
        if (f7 != 1.0f || st0VarArr[1].getVisibility() == 0) {
            if (this.h1) {
                st0VarArr[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                st0VarArr[1].setTranslationX(st0VarArr[0].getMeasuredWidth() - (st0VarArr[0].getMeasuredWidth() * f7));
            } else {
                st0VarArr[0].setTranslationX(r3.getMeasuredWidth() * f7);
                st0VarArr[1].setTranslationX((st0VarArr[0].getMeasuredWidth() * f7) - st0VarArr[0].getMeasuredWidth());
            }
            M0(getTabProgress());
            float a02 = a0(f7);
            this.p0 = a02;
            this.r0.setVisibility((a02 == 0.0f || !D() || q0()) ? 4 : 0);
            org.telegram.ui.ActionBar.w0 w0Var = this.n0;
            if (w0Var == null || D()) {
                this.o0 = b0(f7);
                t1();
            } else {
                w0Var.setVisibility(v0() ? 8 : 4);
                this.o0 = 0.0f;
            }
            q1(false);
            if (f7 == 1.0f) {
                st0 st0Var = st0VarArr[0];
                st0VarArr[0] = st0VarArr[1];
                st0VarArr[1] = st0Var;
                st0Var.setVisibility(8);
                if (w0Var != null && this.x0 == 2) {
                    w0Var.setVisibility(v0() ? 8 : 4);
                }
                this.x0 = 0;
                f1();
            }
        }
    }

    public final void K() {
        ks ksVar = this.P0;
        if (ksVar != null) {
            ur0 ur0Var = this.W;
            float f7 = 0.0f;
            if (ur0Var != null) {
                f7 = 0.0f + (ur0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(ur0Var.getTranslationX() / ur0Var.getMeasuredWidth())));
            }
            ksVar.setTranslationY(this.K1 + f7);
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
        nr0 nr0Var = this.U;
        if (nr0Var != null) {
            nr0Var.h();
            nr0Var.j();
        }
        b1(false);
        r1(z10);
        ju0 ju0Var = this.R;
        if (ju0Var != null) {
            ju0Var.w.clear();
        }
        return true;
    }

    public void L0() {
        boolean z10 = v0() || q0();
        uu0 uu0Var = this.e0.w;
        if (uu0Var != null) {
            uu0Var.b(z10 && getClosestTab() == 9);
        }
        uu0 uu0Var2 = this.c0.w;
        if (uu0Var2 != null) {
            uu0Var2.b(z10 && getClosestTab() == 8);
        }
        for (yu0 yu0Var : this.Y1.values()) {
            xu0 xu0Var = yu0Var.c;
            if (xu0Var.s != null) {
                xu0Var.w.b(z10 && getClosestTab() == yu0Var.a);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.n0;
        if (w0Var != null) {
            ms0 ms0Var = this.J0;
            w0Var.setSearchFieldHint(LocaleController.getString((ms0Var != null && ms0Var.a() && getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
        I();
    }

    public void M0(float f7) {
        E0();
    }

    public boolean N() {
        return this instanceof y30;
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        st0[] st0VarArr = this.k0;
        motionEvent.offsetLocation(x10 - st0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - st0VarArr[0].getY()) - st0VarArr[0].h.getFastScroll().getY());
        return st0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void O0(org.telegram.ui.ActionBar.o2 o2Var, long j3, int i10) {
        new org.telegram.ui.v71(o2Var, j3, this.m1[1], new rc(this, j3, i10)).show();
    }

    public void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void P0(org.telegram.ui.ActionBar.o2 o2Var, long j3, int i10) {
        c5.v0(o2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j3))), LocaleController.getString(R.string.Delete), true, new ai.y7(this, j3, i10, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            st0[] st0VarArr = this.k0;
            if (i10 >= st0VarArr.length) {
                return;
            }
            st0 st0Var = st0VarArr[i10];
            if (st0Var != null && st0Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < st0VarArr[i10].h.getChildCount(); i11++) {
                    View childAt = st0VarArr[i10].h.getChildAt(i11);
                    if (childAt.getY() < AndroidUtilities.dp(100.0f) + st0VarArr[i10].h.X2) {
                        int save = canvas.save();
                        canvas.translate(childAt.getX() + st0VarArr[i10].getX(), childAt.getY() + st0VarArr[i10].h.getY() + st0VarArr[i10].getY() + getY());
                        childAt.draw(canvas);
                        if (arrayList != null && (childAt instanceof nv0)) {
                            arrayList.add((nv0) childAt);
                        }
                        canvas.restoreToCount(save);
                    }
                }
            }
            i10++;
        }
    }

    public final void Q0(org.telegram.ui.ActionBar.o2 o2Var, long j3, int i10) {
        String w10 = getStoriesController().w(i10, j3);
        Context context = o2Var.getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = o2Var.getResourceProvider();
        j2.d dVar = new j2.d(this, j3, i10);
        Pattern pattern = c5.a;
        c5.R(context, o2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w10, 12, LocaleController.getString(R.string.Rename), resourceProvider, dVar);
    }

    public final boolean R(int i10) {
        ou0[] ou0VarArr = this.u1.n;
        if (ou0VarArr == null) {
            return false;
        }
        ou0[] ou0VarArr2 = this.t1;
        if (i10 == 0) {
            ou0 ou0Var = ou0VarArr2[i10];
            if (!ou0Var.h) {
                int[] iArr = ou0Var.f;
                int[] iArr2 = ou0VarArr[i10].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = ou0VarArr2[i10].f;
            int[] iArr4 = ou0VarArr[i10].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        ou0VarArr2[i10].a.addAll(ou0VarArr[i10].a);
        ou0VarArr2[i10].c.addAll(ou0VarArr[i10].c);
        for (Map.Entry entry : ou0VarArr[i10].d.entrySet()) {
            ou0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            ou0VarArr2[i10].b[i11] = ou0VarArr[i10].b[i11].clone();
            ou0 ou0Var2 = ou0VarArr2[i10];
            int[] iArr5 = ou0Var2.j;
            ou0 ou0Var3 = ou0VarArr[i10];
            iArr5[i11] = ou0Var3.j[i11];
            ou0Var2.i[i11] = ou0Var3.i[i11];
        }
        ou0VarArr2[i10].e.addAll(ou0VarArr[i10].e);
        return !ou0VarArr[i10].a.isEmpty();
    }

    public final void R0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.o2 o2Var = this.v1;
        if (shouldShowUrlInAlert) {
            c5.q0(o2Var, str, true, true);
        } else {
            nf.f.s(o2Var.getParentActivity(), str);
        }
    }

    public final void S(int i10, ml0 ml0Var, boolean z10) {
        ArrayList arrayList = this.t1[i10].e;
        int L0 = ((s4.c0) ml0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            xt0 xt0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (L0 <= ((xt0) arrayList.get(i11)).b) {
                        xt0Var = (xt0) arrayList.get(i11);
                        break;
                    }
                    i11++;
                }
                if (xt0Var == null) {
                    xt0Var = (xt0) hg.k0.h(1, arrayList);
                }
            }
            if (xt0Var != null) {
                y0(i10, xt0Var.d, xt0Var.b + 1, z10);
            }
        }
    }

    public int S0() {
        return -1;
    }

    public final void T() {
        st0[] st0VarArr;
        st0 st0Var;
        int i10;
        s4.h0 adapter;
        if (this.o1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                st0VarArr = this.k0;
                if (i12 >= st0VarArr.length) {
                    st0Var = null;
                    break;
                }
                st0Var = st0VarArr[i12];
                if (st0Var.F == this.p1) {
                    break;
                } else {
                    i12++;
                }
            }
            if (st0Var != null) {
                boolean p02 = p0(st0Var.F);
                float f7 = this.n1;
                ou0[] ou0VarArr = this.t1;
                if (f7 != 1.0f) {
                    if (f7 == 0.0f) {
                        this.o1 = false;
                        if (this.p1 == 0) {
                            ou0VarArr[0].g(false);
                        }
                        st0Var.r.setVisibility(8);
                        st0Var.h.invalidate();
                        return;
                    }
                    boolean z10 = f7 > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new os0(this, st0Var, i11));
                    ofFloat.addListener(new org.telegram.ui.fj(this, z10, p02 ? 1 : 0, st0Var));
                    ofFloat.setInterpolator(qr.f);
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
                } else if (c0(st0Var.F) >= 5) {
                    SharedConfig.setStoriesColumnsCount(this.q1);
                }
                for (int i14 = 0; i14 < st0VarArr.length; i14++) {
                    st0 st0Var2 = st0VarArr[i14];
                    if (st0Var2 != null && st0Var2.h != null && (((i10 = st0Var2.F) == 0 || p0(i10)) && (adapter = st0VarArr[i14].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i14 == 0) {
                            ou0VarArr[0].g(false);
                        }
                        st0VarArr[i14].r.setVisibility(8);
                        st0VarArr[i14].x.y1(iArr[p02 ? 1 : 0]);
                        st0VarArr[i14].h.b0();
                        st0VarArr[i14].h.invalidate();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(st0VarArr[i14].h);
                        } else {
                            adapter.l();
                        }
                    }
                }
                if (this.s < 0) {
                    X0();
                    return;
                }
                while (i11 < st0VarArr.length) {
                    st0 st0Var3 = st0VarArr[i11];
                    if (st0Var3.F == this.p1) {
                        View m10 = st0Var3.s.m(this.s);
                        if (m10 != null) {
                            this.v = m10.getTop();
                        }
                        st0 st0Var4 = st0VarArr[i11];
                        st0Var4.x.h1(this.s, (-st0Var4.h.getPaddingTop()) + this.v);
                    }
                    i11++;
                }
            }
        }
    }

    public final void T0(ArrayList arrayList, boolean z10) {
        ht0 ht0Var = this.c0;
        if (ht0Var == null || ht0Var.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.v1;
        if (z10 && arrayList.size() > o2Var.getMessagesController().storiesPinnedToTopCountMax) {
            vc.a0(o2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", o2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            return;
        }
        ai.d9 d9Var = ht0Var.s;
        int i10 = d9Var.c;
        ArrayList arrayList2 = d9Var.g;
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
                d9Var.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(d9Var.d);
                ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new ai.t7(2));
            }
            z11 = z12;
        }
        if (z11) {
            vc.a0(o2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", o2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
        } else if (z10) {
            vc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
        } else {
            vc.a0(o2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
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
        st0 st0Var;
        nr0 nr0Var;
        int closestTab = getClosestTab();
        ps0 ps0Var = this.I0;
        int i10 = -1;
        int i11 = ps0Var.O.get(ps0Var.n + (z10 ? 1 : -1), -1);
        ur0 ur0Var = this.W;
        if (ur0Var != null) {
            if (w0(closestTab) || closestTab == 8) {
                i81 i81Var = ur0Var.n;
                i10 = i81Var.b0.get(i81Var.F + (z10 ? 1 : -1), -1);
            } else if (w0(i11) || i11 == 8) {
                i10 = ur0Var.getCurrentAlbumId();
            }
            if (i10 == 0) {
                i11 = 8;
            } else if (i10 > 0) {
                i11 = i1(i10).a;
            }
        }
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.w0 w0Var = this.n0;
            if (w0Var == null || D()) {
                this.o0 = b0(0.0f);
                s1(0.0f);
            } else {
                w0Var.setVisibility(v0() ? 8 : 4);
                this.o0 = 0.0f;
            }
            if ((!this.V0 || getSelectedTab() != 11) && (!C() || !this.C1 || (getClosestTab() != 8 && !w0(getClosestTab())))) {
                st0[] st0VarArr = this.k0;
                st0 st0Var2 = st0VarArr[0];
                if (st0Var2 != null && st0Var2.F == 13 && (nr0Var = this.U) != null) {
                    bi.a aVar = nr0Var.n;
                    if (!z10) {
                    }
                }
                st0 st0Var3 = st0VarArr[0];
                or0 or0Var = this.V;
                if (st0Var3 != null && st0Var3.F == 14 && or0Var != null) {
                    xh.w1 w1Var = or0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.C1 || (st0Var = st0VarArr[0]) == null || st0Var.F != 13) && ((or0Var == null || !or0Var.g()) && (ur0Var == null || !ur0Var.w))) {
                    q1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    k0();
                    this.y1 = false;
                    this.x1 = true;
                    N0(true);
                    this.z1 = (int) motionEvent.getX();
                    this.G.setEnabled(false);
                    ps0Var.setEnabled(false);
                    st0 st0Var4 = st0VarArr[1];
                    st0Var4.F = i11;
                    st0Var4.setVisibility(0);
                    this.h1 = z10;
                    m1(true);
                    if (z10) {
                        st0VarArr[1].setTranslationX(st0VarArr[0].getMeasuredWidth());
                    } else {
                        st0VarArr[1].setTranslationX(-st0VarArr[0].getMeasuredWidth());
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
        nr0 nr0Var;
        if (!r0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (nr0Var = this.U) != null) {
            return nr0Var.getBotPreviewsSubtitle();
        }
        ht0 ht0Var = this.c0;
        if (ht0Var == null || ht0Var.s == null) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < ht0Var.s.i.size(); i12++) {
                MessageObject messageObject = (MessageObject) ht0Var.s.i.get(i12);
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

    public final st0 W(int i10) {
        int i11 = 0;
        while (true) {
            st0[] st0VarArr = this.k0;
            if (i11 >= st0VarArr.length) {
                return null;
            }
            st0 st0Var = st0VarArr[i11];
            if (st0Var != null && st0Var.F == i10) {
                return st0Var;
            }
            i11++;
        }
    }

    public final void W0(s4.h0 h0Var) {
        if (h0Var instanceof tu0) {
            ArrayList arrayList = this.E0;
            ArrayList arrayList2 = this.F0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (h0Var == this.M) {
            ArrayList arrayList3 = this.G0;
            ArrayList arrayList4 = this.H0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        gu0 gu0Var = this.N;
        if (h0Var == gu0Var) {
            gu0Var.r = null;
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
            st0[] st0VarArr = this.k0;
            if (i11 >= st0VarArr.length) {
                return;
            }
            yr0 yr0Var = st0VarArr[i11].h;
            if (yr0Var != null) {
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < yr0Var.getChildCount(); i14++) {
                    View childAt = yr0Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.t7) {
                        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                        int messageId = t7Var.getMessageId();
                        i13 = t7Var.getTop();
                        i12 = messageId;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.j7) {
                        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                        int id2 = j7Var.getMessage().getId();
                        i13 = j7Var.getTop();
                        i12 = id2;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.i7) {
                        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                        i12 = i7Var.getMessage().getId();
                        i13 = i7Var.getTop();
                    }
                    if (i12 != 0) {
                        break;
                    }
                }
                if (i12 != 0) {
                    int i15 = st0VarArr[i11].F;
                    int i16 = -1;
                    if (p0(i15)) {
                        wu0 k12 = k1(i15);
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
                        ou0[] ou0VarArr = this.t1;
                        if (i15 < ou0VarArr.length) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= ou0VarArr[i15].a.size()) {
                                    break;
                                }
                                if (i12 == ((MessageObject) ou0VarArr[i15].a.get(i18)).getId()) {
                                    i16 = i18;
                                    break;
                                }
                                i18++;
                            }
                            i10 = ou0VarArr[i15].m + i16;
                        }
                    }
                    if (i16 >= 0) {
                        ((s4.c0) yr0Var.getLayoutManager()).h1(i10, (-st0VarArr[i11].h.getPaddingTop()) + i13);
                        if (this.o1) {
                            st0 st0Var = st0VarArr[i11];
                            st0Var.s.h1(i10, (-st0Var.h.getPaddingTop()) + i13);
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
        ps0 ps0Var;
        if (this.L1 || (ps0Var = this.I0) == null) {
            return;
        }
        ps0Var.h(null, i10, ps0Var.P.get(i10));
    }

    public final int Z(int i10) {
        int dp = AndroidUtilities.dp(54.0f) + this.b2;
        ur0 ur0Var = this.W;
        return dp + ((int) ((ur0Var == null || !(w0(i10) || i10 == 8)) ? 0.0f : ur0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f))) + (i10 == 9 ? AndroidUtilities.dp(64.0f) : 0);
    }

    public final void Z0(float f7, int i10) {
        ps0 ps0Var = this.I0;
        if (ps0Var != null) {
            ps0Var.j(f7, w0(i10) ? 8 : i10);
        }
        ur0 ur0Var = this.W;
        if (ur0Var != null) {
            i81 i81Var = ur0Var.n;
            if (w0(i10)) {
                i81Var.f(f7, h1(i10));
            } else if (i10 == 8) {
                i81Var.f(f7, 0);
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
        st0[] st0VarArr = this.k0;
        st0 st0Var = st0VarArr[1];
        or0 or0Var = this.V;
        if (st0Var != null && ((i12 = st0Var.F) == 0 || (((i12 == 8 || w0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = st0VarArr[1].F) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && or0Var != null)))) {
            f10 = 0.0f + f7;
        }
        st0 st0Var2 = st0VarArr[0];
        return (st0Var2 == null || !((i10 = st0Var2.F) == 0 || (((i10 == 8 || w0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = st0VarArr[0].F) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && or0Var != null)))) ? f10 : (1.0f - f7) + f10;
    }

    public final void a1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            st0[] st0VarArr = this.k0;
            if (i10 >= st0VarArr.length) {
                if (this.F == 0) {
                    jt0 jt0Var = this.a0;
                    jt0Var.d = chatFull;
                    jt0Var.e = arrayList;
                }
                v1(true);
                for (int i11 = 0; i11 < st0VarArr.length; i11++) {
                    st0 st0Var = st0VarArr[i11];
                    if (st0Var.F == 7 && st0Var.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(st0VarArr[i11].h);
                    }
                }
                return;
            }
            st0 st0Var2 = st0VarArr[i10];
            if (st0Var2.F == 7 && st0Var2.h.getAdapter() != null && st0VarArr[i10].h.getAdapter().h() != 0 && this.v1.getMessagesController().getStoriesController().j.size() > 0) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Cells.n2
    public final boolean b() {
        return false;
    }

    public final float b0(float f7) {
        float f10 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        st0[] st0VarArr = this.k0;
        st0 st0Var = st0VarArr[1];
        if (st0Var != null && s0(st0Var.F) && st0VarArr[1].F != 11) {
            f10 = 0.0f + f7;
        }
        st0 st0Var2 = st0VarArr[0];
        return (st0Var2 == null || !s0(st0Var2.F) || st0VarArr[0].F == 11) ? f10 : (1.0f - f7) + f10;
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
        fa faVar = this.B0;
        if (z10) {
            faVar.setVisibility(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.N1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(faVar, (Property<fa, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.N1.setDuration(180L);
        this.N1.addListener(new aa(19, this, z10));
        this.N1.start();
        if (z10) {
            u1();
        }
    }

    public final int c0(int i10) {
        wu0 k12;
        ai.d9 d9Var;
        if (!p0(i10) || (k12 = k1(i10)) == null || (d9Var = k12.s) == null) {
            return 0;
        }
        return d9Var.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(int i10, boolean z10) {
        int i11;
        st0 W;
        if (z10 && getY() != 0.0f && this.E == 1) {
            return;
        }
        if (z10 && p0(i10) && c0(i10) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.j1);
        bundle.putLong("topic_id", this.F);
        ou0[] ou0VarArr = this.t1;
        if (z10 && (W = W(0)) != null) {
            ArrayList arrayList = ou0VarArr[0].e;
            int L0 = W.x.L0();
            if (L0 >= 0) {
                xt0 xt0Var = null;
                if (arrayList != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        if (L0 <= ((xt0) arrayList.get(i12)).b) {
                            xt0Var = (xt0) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (xt0Var == null) {
                        xt0Var = (xt0) hg.k0.h(1, arrayList);
                    }
                }
                if (xt0Var != null) {
                    i11 = xt0Var.c;
                    if (i10 != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i10 == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    org.telegram.ui.j8 j8Var = new org.telegram.ui.j8(ou0VarArr[0].q, i11, bundle);
                    j8Var.M = new k2.c0(this, 16);
                    this.v1.presentFragment(j8Var);
                }
            }
        }
        i11 = 0;
        if (i10 != 9) {
        }
        org.telegram.ui.j8 j8Var2 = new org.telegram.ui.j8(ou0VarArr[0].q, i11, bundle);
        j8Var2.M = new k2.c0(this, 16);
        this.v1.presentFragment(j8Var2);
    }

    public final void d1(int i10) {
        int h12 = h1(getClosestTab());
        ur0 ur0Var = this.W;
        if (h12 != i10) {
            if (ur0Var != null) {
                ur0Var.n.d(i10, ur0Var.s.i(i10));
                return;
            }
            return;
        }
        ur0Var.setReorderingAlbums(true);
        yu0 i12 = i1(i10);
        st0 W = W(i12.a);
        if (W == null) {
            return;
        }
        yr0 yr0Var = W.h;
        for (int i11 = 0; i11 < yr0Var.getChildCount(); i11++) {
            View childAt = yr0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.t7) {
                ((org.telegram.ui.Cells.t7) childAt).l(true, true);
            }
        }
        xu0 xu0Var = i12.c;
        if (xu0Var != null && !xu0Var.x) {
            xu0Var.x = true;
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
        yr0 yr0Var;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i12;
        s4.h0 h0Var;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        int size;
        int i15;
        boolean z12;
        yr0 yr0Var2;
        int i16;
        int i17;
        yr0 yr0Var3;
        int i18 = NotificationCenter.mediaDidLoad;
        s4.h0 h0Var2 = this.O;
        s4.h0 h0Var3 = this.M;
        nu0 nu0Var = this.J;
        s4.h0 h0Var4 = this.L;
        s4.h0 h0Var5 = this.K;
        org.telegram.ui.ActionBar.o2 o2Var = this.v1;
        gu0 gu0Var = this.N;
        et0 et0Var = this.H;
        long j3 = this.j1;
        st0[] st0VarArr = this.k0;
        ou0[] ou0VarArr = this.t1;
        if (i10 == i18) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != o2Var.getClassGuid() || intValue2 != ou0VarArr[intValue3].p) {
                if (this.u1 == null || !ou0VarArr[intValue3].a.isEmpty() || ou0VarArr[intValue3].o || !R(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    h0Var2 = et0Var;
                } else if (intValue3 == 1) {
                    h0Var2 = h0Var5;
                } else if (intValue3 == 2) {
                    h0Var2 = h0Var4;
                } else if (intValue3 == 3) {
                    h0Var2 = nu0Var;
                } else if (intValue3 == 4) {
                    h0Var2 = h0Var3;
                } else if (intValue3 != 5) {
                    h0Var2 = intValue3 == 15 ? gu0Var : null;
                }
                if (h0Var2 != null) {
                    for (int i19 = 0; i19 < st0VarArr.length; i19++) {
                        st0 st0Var = st0VarArr[i19];
                        if (st0Var != null && (yr0Var2 = st0Var.h) != null && yr0Var2.getAdapter() == h0Var2) {
                            st0VarArr[i19].h.C0();
                        }
                    }
                    h0Var2.l();
                }
                this.b1 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j3);
            int i20 = longValue == j3 ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                ou0VarArr[intValue3].f[i20] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i16 = intValue3;
                h0Var2 = et0Var;
            } else if (intValue3 == 1) {
                i16 = intValue3;
                h0Var2 = h0Var5;
            } else if (intValue3 == 2) {
                i16 = intValue3;
                h0Var2 = h0Var4;
            } else if (intValue3 == 3) {
                i16 = intValue3;
                h0Var2 = nu0Var;
            } else if (intValue3 == 4) {
                i16 = intValue3;
                h0Var2 = h0Var3;
            } else if (intValue3 == 5) {
                i16 = intValue3;
            } else if (intValue3 == 15) {
                h0Var2 = gu0Var;
                i16 = 8;
            } else {
                i16 = intValue3;
                h0Var2 = null;
            }
            int size2 = ou0VarArr[i16].a.size();
            if (h0Var2 != null) {
                i17 = h0Var2.h();
                if (h0Var2 instanceof il0) {
                    ((il0) h0Var2).L();
                }
            } else {
                i17 = 0;
            }
            ou0VarArr[i16].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size3);
                    if (ou0VarArr[i16].a(messageObject2, i20, r13, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject2.getId(), r13);
                        ou0 ou0Var = ou0VarArr[i16];
                        int i21 = ou0Var.m - r13;
                        ou0Var.m = i21;
                        if (i21 < 0) {
                            ou0Var.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                ou0VarArr[i16].l = ((Boolean) objArr[5]).booleanValue();
                ou0 ou0Var2 = ou0VarArr[i16];
                if (ou0Var2.l) {
                    ou0Var2.m = 0;
                }
            } else {
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i22);
                    if (ou0VarArr[i16].a(messageObject3, i20, false, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject3.getId(), true);
                        ou0 ou0Var3 = ou0VarArr[i16];
                        int i23 = ou0Var3.n - 1;
                        ou0Var3.n = i23;
                        if (i23 < 0) {
                            ou0Var3.n = 0;
                        }
                    }
                }
                ou0 ou0Var4 = ou0VarArr[i16];
                if (ou0Var4.o && ou0Var4.a.size() > 0) {
                    ou0 ou0Var5 = ou0VarArr[i16];
                    ou0Var5.k = ((MessageObject) ou0Var5.a.get(0)).getId();
                }
                ou0VarArr[i16].i[i20] = ((Boolean) objArr[5]).booleanValue();
                ou0 ou0Var6 = ou0VarArr[i16];
                if (ou0Var6.i[i20]) {
                    int size4 = ou0Var6.b[i20].size();
                    if (i20 == 0) {
                        size4 += ou0VarArr[i16].m;
                    }
                    ou0VarArr[i16].f[i20] = size4;
                }
            }
            if (!booleanValue && i20 == 0) {
                ou0 ou0Var7 = ou0VarArr[i16];
                if (ou0Var7.i[i20] && this.c1 != 0) {
                    ou0Var7.g = true;
                    o2Var.getMediaDataController().loadMedia(this.c1, 50, ou0VarArr[i16].j[1], 0, i16, this.F, 1, o2Var.getClassGuid(), ou0VarArr[i16].p, null, null);
                }
            }
            int i24 = i16;
            if (h0Var2 != null) {
                rt0 rt0Var = null;
                for (int i25 = 0; i25 < st0VarArr.length; i25++) {
                    st0 st0Var2 = st0VarArr[i25];
                    if (st0Var2 != null && (yr0Var3 = st0Var2.h) != null && yr0Var3.getAdapter() == h0Var2) {
                        rt0 rt0Var2 = st0VarArr[i25].h;
                        rt0Var2.C0();
                        rt0Var = rt0Var2;
                    }
                }
                int h = h0Var2.h();
                if (h0Var2 != et0Var) {
                    try {
                        h0Var2.l();
                    } catch (Throwable unused) {
                    }
                } else if (et0Var.h() == i17) {
                    AndroidUtilities.updateVisibleRows(rt0Var);
                } else {
                    et0Var.l();
                }
                if (!ou0VarArr[i24].a.isEmpty() || ou0VarArr[i24].g) {
                    if (rt0Var != null && (h0Var2 == et0Var || h >= i17)) {
                        z(rt0Var, i17, sparseBooleanArray);
                    }
                } else if (rt0Var != null) {
                    z(rt0Var, i17, sparseBooleanArray);
                }
                if (rt0Var != null && !ou0VarArr[i24].o) {
                    if (size2 == 0) {
                        for (int i26 = 0; i26 < 2; i26++) {
                            if (st0VarArr[i26].F == 0) {
                                ((s4.c0) rt0Var.getLayoutManager()).h1(et0Var.L(0), 0);
                            }
                        }
                    } else {
                        X0();
                    }
                }
            }
            ou0 ou0Var8 = ou0VarArr[i24];
            if (ou0Var8.o) {
                if (ou0Var8.a.size() == 0) {
                    A0(i24);
                } else {
                    ou0VarArr[i24].o = false;
                }
            }
            this.b1 = true;
            return;
        }
        if (i10 == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat chat = DialogObject.isChatDialog(j3) ? o2Var.getMessagesController().getChat(Long.valueOf(-j3)) : null;
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
                        et0 et0Var2 = et0Var;
                        int i28 = 0;
                        while (i28 < ou0VarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (ou0VarArr[i28].b(((Integer) arrayList2.get(i15)).intValue(), i14) != null) {
                                i27 = i28;
                                z12 = true;
                            }
                            i28++;
                            arrayList2 = arrayList3;
                        }
                        i15++;
                        et0Var = et0Var2;
                    }
                    et0 et0Var3 = et0Var;
                    if (z12) {
                        this.b1 = true;
                        if (et0Var3 != null) {
                            et0Var3.l();
                        }
                        if (h0Var5 != null) {
                            h0Var5.l();
                        }
                        if (h0Var4 != null) {
                            h0Var4.l();
                        }
                        if (nu0Var != null) {
                            nu0Var.X(false);
                        }
                        if (h0Var3 != null) {
                            h0Var3.l();
                        }
                        if (gu0Var != null) {
                            gu0Var.l();
                        }
                        if (h0Var2 != null) {
                            h0Var2.l();
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
            et0 et0Var32 = et0Var;
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
                        ou0 ou0Var9 = ou0VarArr[mediaType];
                        if (ou0Var9.l) {
                            z11 = z13;
                            if (ou0Var9.a(messageObject4, messageObject4.getDialogId() == j3 ? 0 : 1, true, isEncryptedDialog2)) {
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
                int i30 = 1;
                if (z14) {
                    this.b1 = true;
                    int i31 = 0;
                    while (i31 < st0VarArr.length) {
                        int i32 = st0VarArr[i31].F;
                        if (i32 == 0) {
                            h0Var = et0Var;
                        } else if (i32 == i30) {
                            h0Var = h0Var5;
                        } else if (i32 == 2) {
                            h0Var = h0Var4;
                        } else if (i32 == 3) {
                            h0Var = nu0Var;
                        } else {
                            if (i32 == 4) {
                                h0Var = h0Var3;
                            } else if (i32 == 5) {
                                h0Var = h0Var2;
                            } else {
                                h0Var = i32 == 15 ? gu0Var : null;
                                if (h0Var != null) {
                                    h0Var.h();
                                    et0Var.l();
                                    h0Var5.l();
                                    h0Var4.l();
                                    nu0Var.X(false);
                                    h0Var3.l();
                                    gu0Var.l();
                                    h0Var2.l();
                                }
                                i31++;
                                i30 = 1;
                            }
                            if (h0Var != null) {
                            }
                            i31++;
                            i30 = 1;
                        }
                        if (h0Var != null) {
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
            Long l4 = (Long) objArr[3];
            if (l4.longValue() == j3 || l4.longValue() == this.c1) {
                int i33 = l4.longValue() == j3 ? 0 : 1;
                for (ou0 ou0Var10 : ou0VarArr) {
                    ou0Var10.f(i33, num.intValue(), num2.intValue());
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
                for (int i34 = 0; i34 < st0VarArr.length; i34++) {
                    int childCount = st0VarArr[i34].h.getChildCount();
                    for (int i35 = 0; i35 < childCount; i35++) {
                        View childAt = st0VarArr[i34].h.getChildAt(i35);
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                            if (i7Var.getMessage() != null) {
                                i7Var.g(false, true);
                            }
                        }
                    }
                }
                return;
            }
            for (int i36 = 0; i36 < st0VarArr.length; i36++) {
                st0 st0Var3 = st0VarArr[i36];
                if (st0Var3 != null && (yr0Var = st0Var3.h) != null) {
                    int childCount2 = yr0Var.getChildCount();
                    for (int i37 = 0; i37 < childCount2; i37++) {
                        View childAt2 = st0VarArr[i36].h.getChildAt(i37);
                        if (childAt2 instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) childAt2;
                            if (i7Var2.getMessage() != null) {
                                i7Var2.g(false, true);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.storiesListUpdated) {
            ai.d9 d9Var = (ai.d9) objArr[0];
            ht0 ht0Var = this.c0;
            if (ht0Var == null || d9Var != ht0Var.s) {
                mr0 mr0Var = this.e0;
                if (mr0Var == null || d9Var != mr0Var.s) {
                    Iterator it = this.Y1.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        yu0 yu0Var = (yu0) it.next();
                        if (yu0Var.c.s == d9Var) {
                            i12 = yu0Var.a;
                            break;
                        }
                    }
                } else {
                    i12 = 9;
                }
            } else {
                i12 = 8;
            }
            st0 W = W(i12);
            if (W != null) {
                if (W.b != (d9Var.g() > 0)) {
                    W.b = d9Var.g() > 0;
                    o1(W, true);
                }
            }
            if (W != null) {
                AndroidUtilities.notifyDataSetChanged(W.h);
                if (W.h.getLayoutManager() instanceof s4.c0) {
                    ml0 ml0Var = W.h;
                    G(W, ml0Var, (s4.c0) ml0Var.getLayoutManager());
                }
            }
            lt0 lt0Var = this.D1;
            if (lt0Var != null) {
                lt0Var.R();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated) {
            for (st0 st0Var4 : st0VarArr) {
                if (st0Var4 != null && st0Var4.h != null && p0(st0Var4.F)) {
                    if (!r0() || st0Var4.h.getAdapter() == null) {
                        for (int i38 = 0; i38 < st0Var4.h.getChildCount(); i38++) {
                            View childAt3 = st0Var4.h.getChildAt(i38);
                            if (childAt3 instanceof org.telegram.ui.Cells.t7) {
                                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt3;
                                m6 m6Var = t7Var.N;
                                if (!t7Var.d0 || (messageObject = t7Var.n) == null || (storyItem = messageObject.storyItem) == null || (storyViews = storyItem.views) == null) {
                                    t7Var.L = false;
                                    m6Var.q("", false, true);
                                } else {
                                    int i39 = storyViews.views_count;
                                    t7Var.L = i39 > 0;
                                    m6Var.q(AndroidUtilities.formatWholeNumber(i39, 0), true, true);
                                }
                            }
                        }
                    } else {
                        AndroidUtilities.notifyDataSetChanged(st0Var4.h);
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
        int i40 = NotificationCenter.savedMessagesDialogsUpdate;
        ju0 ju0Var = this.R;
        if (i10 == i40) {
            if (j3 == 0 || j3 == o2Var.getUserConfig().getClientUserId()) {
                ju0Var.F(true);
                v1(true);
                F();
                L0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogsNeedReload) {
            ju0Var.F(true);
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
            jt0 jt0Var = this.a0;
            if (jt0Var != null) {
                TLRPC.ChatFull chatFull = jt0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i41 = 0; i41 < jt0Var.d.participants.participants.size(); i41++) {
                        jt0Var.d.participants.participants.get(i41).setRank(longValue4, str);
                    }
                }
                for (st0 st0Var5 : st0VarArr) {
                    if (st0Var5.F == 7) {
                        AndroidUtilities.updateVisibleRows(st0Var5.h);
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
            for (int i42 = 0; i42 < st0VarArr.length; i42++) {
                if (st0VarArr[i42].h.getAdapter() == gu0Var) {
                    yr0 yr0Var4 = st0VarArr[i42].h;
                    ArrayList arrayList6 = gu0Var.n;
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
                                gu0Var.m(i43);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ps0 ps0Var = this.I0;
        if (ps0Var != null) {
            canvas.save();
            canvas.translate(ps0Var.getX(), ps0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        ls0 ls0Var = this.R0;
        if (ls0Var != null) {
            int i10 = ls0Var.T;
            if ((i10 == 3 || i10 == 1) && this.P0 == null) {
                canvas.save();
                canvas.translate(ls0Var.getX(), ls0Var.getY());
                ls0Var.setDrawOverlay(true);
                ls0Var.draw(canvas);
                ls0Var.setDrawOverlay(false);
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
        st0[] st0VarArr = this.k0;
        float top = st0VarArr[0].getTop();
        ur0 ur0Var = this.W;
        if (ur0Var != null && ((i10 = st0VarArr[0].F) == 8 || w0(i10))) {
            top -= ur0Var.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(org.telegram.ui.Cells.r2 r2Var) {
        org.telegram.ui.ActionBar.o2 o2Var = this.v1;
        if (o2Var != null && o2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            o2Var.getOrCreateStoryViewer().getClass();
            ai.jc orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
            Context context = o2Var.getContext();
            long dialogId = r2Var.getDialogId();
            ai.u9 a2 = ai.u9.a((ml0) r2Var.getParent());
            a2.s += ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).s1) ? AndroidUtilities.dp(68.0f) : 0;
            orCreateStoryViewer.D(context, dialogId, a2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r1 = r2[r1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1(boolean z10) {
        st0[] st0VarArr;
        st0 st0Var;
        if (this.o1) {
            return;
        }
        int i10 = 0;
        while (true) {
            st0VarArr = this.k0;
            if (i10 >= st0VarArr.length) {
                st0Var = null;
                break;
            }
            int i11 = st0VarArr[i10].F;
            if (i11 == 0 || p0(i11)) {
                break;
            } else {
                i10++;
            }
        }
        if (st0Var != null) {
            int i12 = st0Var.F;
            this.p1 = i12;
            boolean p02 = p0(i12);
            int[] iArr = this.m1;
            int X = X(p02 ? 1 : 0, iArr[p02 ? 1 : 0], z10);
            this.q1 = X;
            if (X != iArr[p02 ? 1 : 0]) {
                if (this.k1 && p0(this.p1)) {
                    return;
                }
                st0Var.r.setVisibility(0);
                if (p0(this.p1)) {
                    st0Var.r.setAdapter(l1(this.p1));
                } else {
                    st0Var.r.setAdapter(this.I);
                }
                rt0 rt0Var = st0Var.r;
                rt0Var.setPadding(rt0Var.getPaddingLeft(), Z(this.p1), st0Var.r.getPaddingRight(), Y(v0()));
                st0Var.s.y1(X);
                st0Var.r.b0();
                st0Var.s.O = new ns0(this, st0Var, 0);
                AndroidUtilities.updateVisibleRows(st0Var.h);
                this.o1 = true;
                if (this.p1 == 0) {
                    this.t1[0].g(true);
                }
                this.n1 = 0.0f;
                if (this.s < 0) {
                    X0();
                    return;
                }
                for (st0 st0Var2 : st0VarArr) {
                    if (st0Var2.F == this.p1) {
                        st0Var2.s.h1(this.s, this.v - st0Var2.r.getPaddingTop());
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
            st0[] st0VarArr = this.k0;
            if (i11 >= st0VarArr.length) {
                break;
            }
            st0 st0Var = st0VarArr[i11];
            if (st0Var != null) {
                int i13 = st0Var.F;
                if ((z10 && i10 == 8 && w0(i13)) || i13 == i10) {
                    i12++;
                    width = st0VarArr[i11].getTranslationX();
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
            st0[] st0VarArr = this.k0;
            if (i10 >= st0VarArr.length) {
                return;
            }
            int childCount = st0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = st0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.e2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) childAt).getPhotoImage();
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
            st0[] st0VarArr = this.k0;
            if (i11 >= st0VarArr.length) {
                return f7;
            }
            st0 st0Var = st0VarArr[i11];
            if (st0Var != null) {
                int i12 = st0Var.F;
                if ((z10 && i10 == 8 && w0(i12)) || i12 == i10) {
                    f7 = (1.0f - Math.abs(st0VarArr[i11].getTranslationX() / getWidth())) + f7;
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
            st0[] st0VarArr = this.k0;
            float x10 = st0VarArr[0].getX();
            this.f1 = new AnimatorSet();
            this.i1 = Math.abs(x10) < ((float) st0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new h70(this, 19));
            boolean z10 = this.i1;
            Property property = View.TRANSLATION_X;
            if (z10) {
                measuredWidth = Math.abs(x10);
                if (this.h1) {
                    this.f1.playTogether(ObjectAnimator.ofFloat(st0VarArr[0], (Property<st0, Float>) property, 0.0f), ObjectAnimator.ofFloat(st0VarArr[1], (Property<st0, Float>) property, r14.getMeasuredWidth()), ofFloat);
                } else {
                    this.f1.playTogether(ObjectAnimator.ofFloat(st0VarArr[0], (Property<st0, Float>) property, 0.0f), ObjectAnimator.ofFloat(st0VarArr[1], (Property<st0, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = st0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.h1) {
                    this.f1.playTogether(ObjectAnimator.ofFloat(st0VarArr[0], (Property<st0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(st0VarArr[1], (Property<st0, Float>) property, 0.0f), ofFloat);
                } else {
                    this.f1.playTogether(ObjectAnimator.ofFloat(st0VarArr[0], (Property<st0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(st0VarArr[1], (Property<st0, Float>) property, 0.0f), ofFloat);
                }
            }
            this.f1.setInterpolator(e2);
            int measuredWidth2 = getMeasuredWidth();
            float f11 = measuredWidth2 / 2;
            float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
            this.f1.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r0) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.f1.addListener(new ss0(this, i10));
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
        st0 st0Var;
        st0 st0Var2;
        ai.d9 d9Var;
        ai.d9 d9Var2;
        float f7 = 1.0f;
        st0[] st0VarArr = this.k0;
        if (st0VarArr == null || (st0Var = st0VarArr[0]) == null || (st0Var2 = st0VarArr[1]) == null || st0Var.w == null || st0Var2.w == null) {
            return 1.0f;
        }
        int i10 = st0Var.F;
        int i11 = st0Var2.F;
        boolean z10 = w0(i10) || i10 == 8;
        boolean z11 = w0(i11) || i11 == 8;
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - st0VarArr[0].w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - st0VarArr[1].w.getVisibilityFactor();
        wu0 k12 = k1(st0VarArr[0].F);
        if (i10 == 8 || (k12 != null && (d9Var2 = k12.s) != null && d9Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        wu0 k13 = k1(i11);
        if (i11 != 8 && (k13 == null || (d9Var = k13.s) == null || d9Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f7, Math.abs(st0VarArr[0].getTranslationX() / st0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        st0[] st0VarArr = this.k0;
        st0 st0Var = st0VarArr[1];
        if (st0Var != null && st0Var.getVisibility() == 0) {
            if (this.g1 && !this.i1) {
                return st0VarArr[1].F;
            }
            if (Math.abs(st0VarArr[1].getTranslationX()) < st0VarArr[1].getMeasuredWidth() / 2.0f) {
                return st0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public ml0 getCurrentListView() {
        ft0 ft0Var;
        st0 st0Var = this.k0[0];
        int i10 = st0Var.F;
        return i10 == 13 ? this.U.getCurrentListView() : i10 == 14 ? this.V.getCurrentListView() : (i10 != 12 || (ft0Var = this.T) == null) ? st0Var.h : ft0Var.a.x0;
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

    public org.telegram.ui.ActionBar.w0 getSearchItem() {
        return this.n0;
    }

    public bj0 getSearchOptionsItem() {
        return this.s0;
    }

    public int getSelectedTab() {
        int currentTabId = this.I0.getCurrentTabId();
        ur0 ur0Var = this.W;
        if (ur0Var == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = ur0Var.getCurrentAlbumId();
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
            st0[] st0VarArr = this.k0;
            if (i10 >= st0VarArr.length) {
                return f7;
            }
            st0 st0Var = st0VarArr[i10];
            if (st0Var != null) {
                f7 = ((1.0f - Math.abs(st0Var.getTranslationX() / getWidth())) * st0Var.F) + f7;
            }
            i10++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.A0, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.z6));
        org.telegram.ui.ActionBar.w0 w0Var = this.l0;
        bj0 iconView = w0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.j6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.z8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.u0;
        if (w0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.t0;
        if (w0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.D0};
        ImageView imageView = this.C0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B0, 1, null, null, null, null, i12));
        ps0 ps0Var = this.I0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ps0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.wc;
        org.telegram.ui.Cells.w0 w0Var4 = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var4, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var4, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ps0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ps0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ps0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ps0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hh));
        ls0 ls0Var = this.R0;
        if (ls0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(ls0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.v7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ls0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.w7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ls0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.u7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ls0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.t7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ls0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.x7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ls0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.y7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ls0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A7));
        }
        final int i14 = 0;
        while (true) {
            st0[] st0VarArr = this.k0;
            if (i14 >= st0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.k6 k6Var = new org.telegram.ui.ActionBar.k6() { // from class: org.telegram.ui.Components.ir0
                @Override // org.telegram.ui.ActionBar.k6
                public final void b() {
                    st0[] st0VarArr2 = zu0.this.k0;
                    int i15 = i14;
                    yr0 yr0Var = st0VarArr2[i15].h;
                    if (yr0Var != null) {
                        int childCount = yr0Var.getChildCount();
                        for (int i16 = 0; i16 < childCount; i16++) {
                            View childAt = st0VarArr2[i15].h.getChildAt(i16);
                            if (childAt instanceof org.telegram.ui.Cells.u7) {
                                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                                for (int i17 = 0; i17 < 6; i17++) {
                                    u7Var.a[i17].e.invalidate();
                                }
                            } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                                ((org.telegram.ui.Cells.h6) childAt).u(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.ab) {
                                ((org.telegram.ui.Cells.ab) childAt).j(0);
                            }
                        }
                    }
                }

                @Override // org.telegram.ui.ActionBar.k6
                public final /* synthetic */ void a(float f7) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
            hs0 hs0Var = st0VarArr[i14].v;
            int i15 = org.telegram.ui.ActionBar.j6.d6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(hs0Var, 0, null, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].w, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.c7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
            int i16 = org.telegram.ui.ActionBar.j6.h6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.uh));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.m6));
            int i17 = org.telegram.ui.ActionBar.j6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            int i18 = org.telegram.ui.ActionBar.j6.y6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusColor"}, null, null, -1, k6Var, i18));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusOnlineColor"}, null, null, -1, k6Var, org.telegram.ui.ActionBar.j6.n6));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.r0;
            int i19 = org.telegram.ui.ActionBar.j6.J7;
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.ab.class}, null, drawableArr2, null, i19));
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.B0;
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.j6.D0}, null, -1, null, org.telegram.ui.ActionBar.j6.X8));
            TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.C0;
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.j6.E0}, null, -1, null, org.telegram.ui.ActionBar.j6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, drawableArr2, null, i19));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.U7));
            int i20 = org.telegram.ui.ActionBar.j6.z6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 4, new Class[]{mt0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
            int i21 = org.telegram.ui.ActionBar.j6.Ih;
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
            int i22 = org.telegram.ui.ActionBar.j6.i7;
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            int i23 = org.telegram.ui.ActionBar.j6.k7;
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.zi));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Bi));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.j6.f3, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.j6.g3, null, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, null, null, null, org.telegram.ui.ActionBar.j6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, org.telegram.ui.ActionBar.j6.m0, null, null, org.telegram.ui.ActionBar.j6.K6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Kh));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Jh));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.o7.class}, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            int i24 = org.telegram.ui.ActionBar.j6.Lh;
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.u7.class}, null, null, k6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.u7.class}, null, null, k6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, k6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, k6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].h, 0, null, null, new Drawable[]{this.y0}, null, org.telegram.ui.ActionBar.j6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].w.d, 4, null, null, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(st0VarArr[i14].w.e, 4, null, null, null, null, i18));
            i14++;
        }
    }

    public final int h0(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.F1;
        return f6Var != null ? f6Var.G0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public final int h1(int i10) {
        yu0 j12 = j1(i10);
        if (j12 == null) {
            return -1;
        }
        return j12.b;
    }

    public final boolean i0() {
        return this.v1.getConnectionsManager().getConnectionState() == 3;
    }

    public final yu0 i1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.Y1;
        yu0 yu0Var = (yu0) hashMap.get(valueOf);
        if (yu0Var != null) {
            return yu0Var;
        }
        yu0 yu0Var2 = new yu0(this, getContext(), i10);
        hashMap.put(Integer.valueOf(i10), yu0Var2);
        this.Z1.put(Integer.valueOf(yu0Var2.a), Integer.valueOf(i10));
        return yu0Var2;
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

    public final yu0 j1(int i10) {
        Integer num = (Integer) this.Z1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (yu0) this.Y1.get(num);
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
        this.L0.setInterpolator(qr.g);
        this.L0.addListener(new ss0(this, 0));
        this.L0.start();
    }

    public final wu0 k1(int i10) {
        yu0 j12;
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

    public final wu0 l1(int i10) {
        yu0 j12;
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
        return !(this instanceof y30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [org.telegram.ui.Components.ml0, org.telegram.ui.Components.rt0, s4.m0] */
    /* JADX WARN: Type inference failed for: r5v85 */
    public final void m1(boolean z10) {
        st0[] st0VarArr;
        st0[] st0VarArr2;
        s4.u0 u0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ou0[] ou0VarArr;
        String str;
        ?? r52;
        int i10;
        boolean z15;
        boolean z16;
        int i11;
        boolean z17;
        s4.u0 u0Var2;
        int i12;
        int i13;
        boolean z18;
        or0 or0Var = this.V;
        if (or0Var != null) {
            or0Var.i();
        }
        int i14 = 0;
        while (true) {
            st0VarArr = this.k0;
            if (i14 >= st0VarArr.length) {
                break;
            }
            st0VarArr[i14].h.C0();
            i14++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) st0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(B0());
        s4.h0 adapter = st0VarArr[z10 ? 1 : 0].h.getAdapter();
        s4.h0 h0Var = this.c0;
        s4.y yVar = this.b0;
        if (adapter == h0Var) {
            yVar.e(null);
        }
        boolean z19 = this.V0;
        lt0 lt0Var = this.D1;
        gu0 gu0Var = this.N;
        org.telegram.ui.ActionBar.w0 w0Var = this.n0;
        int i15 = 100;
        if (z19 && this.U0) {
            st0 st0Var = st0VarArr[z10 ? 1 : 0];
            if (st0Var.f == null) {
                st0Var.f = new s4.u0();
            }
            st0 st0Var2 = st0VarArr[z10 ? 1 : 0];
            u0Var2 = st0Var2.f;
            ku0 ku0Var = this.S;
            qt0 qt0Var = this.j0;
            vt0 vt0Var = this.h0;
            vt0 vt0Var2 = this.i0;
            vt0 vt0Var3 = this.g0;
            if (z10) {
                int i16 = st0Var2.F;
                if (i16 == 0 || i16 == 2 || i16 == 5 || i16 == 6 || (i16 == 7 && !lt0Var.T())) {
                    this.V0 = false;
                    ms0 ms0Var = this.J0;
                    if (ms0Var != null) {
                        ms0Var.g(false);
                    }
                    this.U0 = false;
                    m1(true);
                    return;
                }
                String obj = w0Var != null ? w0Var.getSearchField().getText().toString() : "";
                int i17 = st0VarArr[z10 ? 1 : 0].F;
                if (i17 == 1) {
                    if (vt0Var3 != null) {
                        vt0Var3.G(obj, false);
                        if (adapter != vt0Var3) {
                            W0(adapter);
                            st0VarArr[z10 ? 1 : 0].h.setAdapter(vt0Var3);
                        }
                    }
                } else if (i17 == 3) {
                    if (vt0Var2 != null) {
                        vt0Var2.G(obj, false);
                        if (adapter != vt0Var2) {
                            W0(adapter);
                            st0VarArr[z10 ? 1 : 0].h.setAdapter(vt0Var2);
                        }
                    }
                } else if (i17 == 4) {
                    if (vt0Var != null) {
                        vt0Var.G(obj, false);
                        if (adapter != vt0Var) {
                            W0(adapter);
                            st0VarArr[z10 ? 1 : 0].h.setAdapter(vt0Var);
                        }
                    }
                } else if (i17 == 7) {
                    if (qt0Var != null) {
                        qt0Var.F(obj, false);
                        if (adapter != qt0Var) {
                            W0(adapter);
                            st0VarArr[z10 ? 1 : 0].h.setAdapter(qt0Var);
                        }
                    }
                } else if (i17 == 11) {
                    if (ku0Var != null) {
                        ku0Var.E(this.W0, obj);
                        if (adapter != ku0Var) {
                            W0(adapter);
                            st0VarArr[z10 ? 1 : 0].h.setAdapter(ku0Var);
                        }
                    }
                } else if (i17 == 15 && gu0Var != null && adapter != gu0Var) {
                    W0(adapter);
                    yr0 yr0Var = st0VarArr[z10 ? 1 : 0].h;
                    gu0Var.r = yr0Var;
                    yr0Var.setAdapter(gu0Var);
                }
            } else if (st0Var2.h != null) {
                int i18 = st0Var2.F;
                if (i18 == 1) {
                    if (adapter != vt0Var3) {
                        W0(adapter);
                        st0VarArr[z10 ? 1 : 0].h.setAdapter(vt0Var3);
                    }
                    vt0Var3.l();
                } else if (i18 == 3) {
                    if (adapter != vt0Var2) {
                        W0(adapter);
                        st0VarArr[z10 ? 1 : 0].h.setAdapter(vt0Var2);
                    }
                    vt0Var2.l();
                } else if (i18 == 4) {
                    if (adapter != vt0Var) {
                        W0(adapter);
                        st0VarArr[z10 ? 1 : 0].h.setAdapter(vt0Var);
                    }
                    vt0Var.l();
                } else if (i18 == 7) {
                    if (adapter != qt0Var) {
                        W0(adapter);
                        st0VarArr[z10 ? 1 : 0].h.setAdapter(qt0Var);
                    }
                    qt0Var.l();
                } else if (i18 == 11) {
                    if (adapter != ku0Var) {
                        W0(adapter);
                        st0VarArr[z10 ? 1 : 0].h.setAdapter(ku0Var);
                    }
                    ku0Var.l();
                }
            }
            st0VarArr2 = st0VarArr;
            z17 = false;
            z16 = false;
            i11 = 100;
        } else {
            st0 st0Var3 = st0VarArr[z10 ? 1 : 0];
            if (st0Var3.e == null) {
                st0Var3.e = new s4.u0();
            }
            st0 st0Var4 = st0VarArr[z10 ? 1 : 0];
            s4.u0 u0Var3 = st0Var4.e;
            st0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i19 = st0VarArr[z10 ? 1 : 0].F;
            if (i19 == 8 || w0(i19)) {
                layoutParams.topMargin = AndroidUtilities.dp(B0());
            }
            yr0 yr0Var2 = st0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = yr0Var2.getPaddingLeft();
            st0 st0Var5 = st0VarArr[z10 ? 1 : 0];
            yr0 yr0Var3 = st0Var5.h;
            int Z = Z(st0Var5.F);
            yr0Var3.d3 = Z;
            int paddingRight = st0VarArr[z10 ? 1 : 0].h.getPaddingRight();
            st0VarArr2 = st0VarArr;
            yr0 yr0Var4 = st0VarArr2[z10 ? 1 : 0].h;
            int Y = Y(v0());
            yr0Var4.e3 = Y;
            yr0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
            int i20 = st0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.m1;
            s4.h0 h0Var2 = this.K;
            View view = this.U;
            ft0 ft0Var = this.T;
            ju0 ju0Var = this.R;
            kt0 kt0Var = this.P;
            ou0[] ou0VarArr2 = this.t1;
            if (i20 == 0) {
                s4.h0 h0Var3 = this.H;
                if (adapter != h0Var3) {
                    W0(adapter);
                    st0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var3);
                }
                int i21 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i21;
                layoutParams.leftMargin = i21;
                ou0 ou0Var = ou0VarArr2[0];
                boolean z20 = ou0Var.h && !ou0Var.e.isEmpty();
                i15 = iArr[0];
                st0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.y0);
                ou0 ou0Var2 = ou0VarArr2[0];
                if (ou0Var2.x == null) {
                    ou0Var2.x = new s4.u0();
                }
                z13 = z20;
                u0Var = ou0VarArr2[0].x;
                z11 = false;
            } else {
                if (i20 == 1) {
                    ou0 ou0Var3 = ou0VarArr2[1];
                    z12 = ou0Var3.h && !ou0Var3.e.isEmpty();
                    if (adapter != h0Var2) {
                        W0(adapter);
                        st0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var2);
                    }
                } else if (i20 == 2) {
                    ou0 ou0Var4 = ou0VarArr2[2];
                    z12 = ou0Var4.h && !ou0Var4.e.isEmpty();
                    if (adapter != this.L) {
                        W0(adapter);
                        st0VarArr2[z10 ? 1 : 0].h.setAdapter(this.L);
                    }
                } else {
                    if (i20 == 3) {
                        if (adapter != this.J) {
                            W0(adapter);
                            st0VarArr2[z10 ? 1 : 0].h.setAdapter(this.J);
                        }
                    } else if (i20 == 4) {
                        ou0 ou0Var5 = ou0VarArr2[4];
                        z12 = ou0Var5.h && !ou0Var5.e.isEmpty();
                        if (adapter != this.M) {
                            W0(adapter);
                            st0VarArr2[z10 ? 1 : 0].h.setAdapter(this.M);
                        }
                    } else {
                        if (i20 == 5) {
                            if (adapter != this.O) {
                                W0(adapter);
                                st0VarArr2[z10 ? 1 : 0].h.setAdapter(this.O);
                            }
                        } else if (i20 == 15) {
                            if (adapter != gu0Var) {
                                W0(adapter);
                                yr0 yr0Var5 = st0VarArr2[z10 ? 1 : 0].h;
                                gu0Var.r = yr0Var5;
                                yr0Var5.setAdapter(gu0Var);
                            }
                        } else if (i20 == 6) {
                            if (adapter != kt0Var) {
                                W0(adapter);
                                st0VarArr2[z10 ? 1 : 0].h.setAdapter(kt0Var);
                            }
                        } else if (i20 == 7) {
                            if (adapter != this.a0) {
                                W0(adapter);
                                st0VarArr2[z10 ? 1 : 0].h.setAdapter(this.a0);
                            }
                        } else if (p0(i20)) {
                            s4.h0 k12 = k1(st0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != k12) {
                                W0(adapter);
                                st0VarArr2[z10 ? 1 : 0].h.setAdapter(k12);
                                st0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            st0 st0Var6 = st0VarArr2[z10 ? 1 : 0];
                            if (st0Var6.F != 9) {
                                yVar.e(st0Var6.h);
                            }
                            i15 = iArr[1];
                        } else {
                            int i22 = st0VarArr2[z10 ? 1 : 0].F;
                            if (i22 == 10) {
                                if (adapter != this.Q) {
                                    W0(adapter);
                                    st0VarArr2[z10 ? 1 : 0].h.setAdapter(this.Q);
                                }
                            } else if (i22 == 11) {
                                if (adapter != ju0Var) {
                                    W0(adapter);
                                    st0VarArr2[z10 ? 1 : 0].h.setAdapter(ju0Var);
                                    s4.y yVar2 = ju0Var.v;
                                    yr0 yr0Var6 = st0VarArr2[z10 ? 1 : 0].h;
                                    ju0Var.s = yr0Var6;
                                    yVar2.e(yr0Var6);
                                }
                                u0Var = ju0Var.r;
                                z11 = true;
                                z13 = false;
                            } else if (i22 == 12) {
                                if (adapter != null) {
                                    W0(adapter);
                                    st0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (ft0Var.getParent() != st0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(ft0Var);
                                    st0VarArr2[z10 ? 1 : 0].addView(ft0Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                }
                            } else if (i22 == 13) {
                                if (adapter != null) {
                                    W0(adapter);
                                    st0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != st0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    st0VarArr2[z10 ? 1 : 0].addView(view);
                                }
                            } else if (i22 == 14) {
                                if (adapter != null) {
                                    W0(adapter);
                                    st0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (or0Var != null && or0Var.getParent() != st0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(or0Var);
                                    st0VarArr2[z10 ? 1 : 0].addView(or0Var);
                                    st0VarArr2[z10 ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        u0Var = u0Var3;
                        z11 = false;
                        z13 = false;
                    }
                    u0Var = u0Var3;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                u0Var = u0Var3;
                z11 = true;
            }
            int i23 = st0VarArr2[z10 ? 1 : 0].F;
            boolean z21 = i23 == 0 || p0(i23);
            s4.u0 u0Var4 = u0Var;
            st0VarArr2[z10 ? 1 : 0].v.setLayoutParams(w7.x5.d(-1, -1.0f, 119, z21 ? 0.0f : 12.0f, (z21 ? 8 : 12) + 48, z21 ? 0.0f : 12.0f, z21 ? 0.0f : 12.0f));
            if (z11) {
                st0VarArr2[z10 ? 1 : 0].h.setSections(false);
            } else {
                yr0 yr0Var7 = st0VarArr2[z10 ? 1 : 0].h;
                yr0Var7.getClass();
                yr0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, yr0Var7.p2));
                yr0Var7.I2 = null;
                yr0Var7.L2 = 0.0f;
                yr0Var7.M2 = null;
                yr0Var7.N2 = null;
                yr0Var7.J2 = null;
                yk0 yk0Var = yr0Var7.H2;
                if (yk0Var != null) {
                    yr0Var7.q0(yk0Var);
                    yr0Var7.H2 = null;
                }
            }
            st0 st0Var7 = st0VarArr2[z10 ? 1 : 0];
            int i24 = st0Var7.F;
            org.telegram.ui.ActionBar.o2 o2Var = this.v1;
            if (i24 == 15) {
                z14 = z13;
                ou0VarArr = ou0VarArr2;
                str = "";
                st0Var7.setBackground(ci.d7.e(st0Var7.getBackground(), o2Var.getCurrentAccount(), this.j1, org.telegram.ui.ActionBar.j6.I.q()));
                st0VarArr2[z10 ? 1 : 0].setOutlineProvider(new ai.k2(14));
                st0VarArr2[z10 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z14 = z13;
                ou0VarArr = ou0VarArr2;
                str = "";
                st0Var7.setClipToOutline(false);
                r52 = 0;
                st0VarArr2[z10 ? 1 : 0].setBackground(null);
            }
            st0 st0Var8 = st0VarArr2[z10 ? 1 : 0];
            if (st0Var8.F == 11) {
                st0Var8.h.setItemAnimator(st0Var8.d);
            } else {
                st0Var8.h.setItemAnimator(r52);
                if (ju0Var != null && st0VarArr2[z10 ? 1 : 0].h == ju0Var.s) {
                    s4.y yVar3 = ju0Var.v;
                    ju0Var.s = r52;
                    yVar3.e(r52);
                }
            }
            if (ft0Var != null && st0VarArr2[z10 ? 1 : 0].F != 12 && ft0Var.getParent() == st0VarArr2[z10 ? 1 : 0]) {
                ft0Var.a.onRemoveFromParent();
                st0VarArr2[z10 ? 1 : 0].removeView(ft0Var);
            }
            if (view != null && st0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                st0 st0Var9 = st0VarArr2[z10 ? 1 : 0];
                if (parent == st0Var9) {
                    st0Var9.removeView(view);
                }
            }
            if (or0Var != null && st0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = or0Var.getParent();
                st0 st0Var10 = st0VarArr2[z10 ? 1 : 0];
                if (parent2 == st0Var10) {
                    st0Var10.removeView(or0Var);
                }
            }
            int i25 = st0VarArr2[z10 ? 1 : 0].F;
            if (i25 != 0 && i25 != 11 && !p0(i25) && (i12 = st0VarArr2[z10 ? 1 : 0].F) != 2 && i12 != 5 && i12 != 6 && ((i12 != 7 || lt0Var.T()) && (i13 = st0VarArr2[z10 ? 1 : 0].F) != 10 && i13 != 13 && i13 != 14)) {
                if (!z10) {
                    z18 = false;
                    if (w0Var != null) {
                        if (w0Var.getVisibility() == 4) {
                            if (D()) {
                                this.x0 = 0;
                                this.o0 = 1.0f;
                                w0Var.setVisibility(0);
                            } else {
                                w0Var.setVisibility(v0() ? 8 : 4);
                                this.o0 = 0.0f;
                            }
                        }
                        q1(z18);
                    }
                } else if (w0Var == null || w0Var.getVisibility() != 4 || this.G.n0) {
                    z18 = false;
                    this.x0 = 0;
                    this.o0 = 1.0f;
                } else {
                    if (D()) {
                        this.x0 = 1;
                        w0Var.setVisibility(0);
                    } else {
                        w0Var.setVisibility(v0() ? 8 : 4);
                    }
                    float f7 = z10 ? 1.0f : 0.0f;
                    this.o0 = b0(f7);
                    s1(1.0f - f7);
                    z18 = false;
                }
                q1(z18);
            } else if (z10) {
                this.x0 = 2;
            } else {
                this.x0 = 0;
                if (w0Var != null) {
                    w0Var.setVisibility((v0() || this.V0) ? 8 : 4);
                }
            }
            int i26 = st0VarArr2[z10 ? 1 : 0].F;
            if (i26 == 6) {
                if (!kt0Var.e && !kt0Var.h && kt0Var.d.isEmpty()) {
                    kt0.E(kt0Var, 0L);
                }
            } else if (i26 != 7) {
                if (p0(i26)) {
                    wu0 k13 = k1(st0VarArr2[z10 ? 1 : 0].F);
                    if (k13 != null) {
                        ai.d9 d9Var = k13.s;
                        k13.P();
                        st0VarArr2[z10 ? 1 : 0].w.e(d9Var != null && (d9Var.k() || (i0() && d9Var.g() > 0)), z10);
                        z15 = (d9Var == null || d9Var.g() <= 0 || t0()) ? false : true;
                    } else {
                        z15 = z14;
                    }
                    z14 = z15;
                } else {
                    int i27 = st0VarArr2[z10 ? 1 : 0].F;
                    if (i27 != 10 && i27 != 11 && i27 != 12 && i27 != 13 && i27 != 14) {
                        if (i27 == 15) {
                            i27 = 8;
                        }
                        ou0 ou0Var6 = ou0VarArr[i27];
                        if (!ou0Var6.g && !ou0Var6.i[0] && ou0Var6.a.isEmpty()) {
                            ou0VarArr[i27].g = true;
                            h0Var2.l();
                            if (i27 == 0) {
                                int i28 = ou0VarArr[0].q;
                                if (i28 == 1) {
                                    i10 = 6;
                                } else if (i28 == 2) {
                                    i10 = 7;
                                }
                                o2Var.getMediaDataController().loadMedia(this.j1, 50, 0, 0, i10, this.F, 1, o2Var.getClassGuid(), ou0VarArr[i10].p, null, null);
                            }
                            i10 = i27;
                            o2Var.getMediaDataController().loadMedia(this.j1, 50, 0, 0, i10, this.F, 1, o2Var.getClassGuid(), ou0VarArr[i10].p, null, null);
                        }
                    }
                }
            }
            int i29 = st0VarArr2[z10 ? 1 : 0].F;
            if (i29 == 8 || w0(i29)) {
                st0 st0Var11 = st0VarArr2[z10 ? 1 : 0];
                js0 js0Var = st0Var11.w;
                boolean w02 = w0(st0Var11.F);
                int h12 = h1(st0VarArr2[z10 ? 1 : 0].F);
                u9 u9Var = js0Var.b;
                ci.d dVar = js0Var.f;
                u9Var.setVisibility((w02 || u0() || r0()) ? 8 : 0);
                if (w02) {
                    dVar.setVisibility(0);
                    dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum));
                } else if (u0()) {
                    dVar.setVisibility(8);
                } else {
                    js0Var.setStickerType(11);
                    dVar.setVisibility(!t0() ? 0 : 8);
                    dVar.h(w());
                }
                if (w02) {
                    js0Var.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    js0Var.e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    js0Var.d.setText(LocaleController.getString(!t0() ? v0() ? R.string.NoPublicStoriesTitle2 : R.string.NoStoriesTitle : R.string.NoHashtagStoriesTitle));
                    js0Var.e.setText(v0() ? LocaleController.getString(R.string.NoStoriesSubtitle2) : str);
                }
                dVar.setOnClickListener(new vq0(this, w02, h12, 0));
            } else {
                st0 st0Var12 = st0VarArr2[z10 ? 1 : 0];
                if (st0Var12.F == 9) {
                    if (u0()) {
                        st0VarArr2[z10 ? 1 : 0].w.b.setVisibility(8);
                        st0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        st0VarArr2[z10 ? 1 : 0].w.b.setVisibility(0);
                        st0VarArr2[z10 ? 1 : 0].w.setStickerType(11);
                        st0VarArr2[z10 ? 1 : 0].w.f.setVisibility(0);
                        st0VarArr2[z10 ? 1 : 0].w.f.h(w());
                    }
                    st0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    st0VarArr2[z10 ? 1 : 0].w.e.setText(v0() ? LocaleController.getString(R.string.NoArchivedStoriesSubtitle) : str);
                    st0VarArr2[z10 ? 1 : 0].w.f.setOnClickListener(new tq0(this, 7));
                } else {
                    st0Var12.w.b.setVisibility(0);
                    st0VarArr2[z10 ? 1 : 0].w.setStickerType(1);
                    st0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoResult));
                    st0VarArr2[z10 ? 1 : 0].w.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    st0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                }
            }
            z16 = false;
            st0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            i11 = i15;
            z17 = z14;
            u0Var2 = u0Var4;
        }
        st0 st0Var13 = st0VarArr2[z10 ? 1 : 0];
        st0Var13.b = z17;
        o1(st0Var13, z16);
        st0VarArr2[z10 ? 1 : 0].x.y1(i11);
        st0VarArr2[z10 ? 1 : 0].h.b0();
        if (u0Var2 != null) {
            st0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(u0Var2);
            st0VarArr2[z10 ? 1 : 0].r.setRecycledViewPool(u0Var2);
        }
        if (this.x0 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.G;
            if (kVar.n0) {
                this.z0 = true;
                kVar.h(true);
                this.x0 = 0;
                this.o0 = 0.0f;
                if (w0Var != null) {
                    w0Var.setVisibility(v0() ? 8 : 4);
                }
                q1(false);
            }
        }
    }

    public final void n0(ViewGroup viewGroup) {
        for (st0 st0Var : this.k0) {
            yr0 yr0Var = st0Var.h;
            Objects.requireNonNull(yr0Var);
            st0Var.n = new ah.o(yr0Var, viewGroup, new fp0(yr0Var, 1));
        }
        or0 or0Var = this.V;
        if (or0Var != null) {
            or0Var.S = viewGroup;
            or0Var.R = new ci.z7(or0Var, 1);
        }
    }

    public final void n1() {
        et0 et0Var = this.H;
        if (et0Var != null) {
            et0Var.l();
        }
        mu0 mu0Var = this.K;
        if (mu0Var != null) {
            mu0Var.l();
        }
        mu0 mu0Var2 = this.L;
        if (mu0Var2 != null) {
            mu0Var2.l();
        }
        nu0 nu0Var = this.J;
        if (nu0Var != null) {
            nu0Var.X(false);
        }
        mu0 mu0Var3 = this.M;
        if (mu0Var3 != null) {
            mu0Var3.l();
        }
        gu0 gu0Var = this.N;
        if (gu0Var != null) {
            gu0Var.l();
        }
        nt0 nt0Var = this.O;
        if (nt0Var != null) {
            nt0Var.l();
        }
        ht0 ht0Var = this.c0;
        if (ht0Var != null) {
            ht0Var.l();
        }
        Iterator it = this.Y1.values().iterator();
        while (it.hasNext()) {
            ((yu0) it.next()).c.l();
        }
    }

    public final void o1(st0 st0Var, boolean z10) {
        boolean z11 = st0Var.b && this.d;
        tk0 fastScroll = st0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = st0Var.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            st0Var.c.cancel();
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<tk0, Float>) property, fastScroll.getAlpha(), 1.0f);
            st0Var.c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r1);
            return;
        }
        if (z11 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<tk0, Float>) property, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new aa(fastScroll));
        st0Var.c = ofFloat2;
        ofFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            st0[] st0VarArr = this.k0;
            if (i10 >= st0VarArr.length) {
                return;
            }
            yr0 yr0Var = st0VarArr[i10].h;
            if (yr0Var != null) {
                yr0Var.getViewTreeObserver().addOnPreDrawListener(new vs0(this, i10, 0));
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
        lt0 lt0Var = this.D1;
        int height = lt0Var.f() != null ? lt0Var.f().getHeight() : 0;
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
            } else if (childAt instanceof st0) {
                i12 = i10;
                measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                yr0 yr0Var = ((st0) childAt).h;
                yr0Var.setPadding(0, yr0Var.Y2, 0, yr0Var.Z2);
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
            org.telegram.ui.ActionBar.o2 o2Var = this.v1;
            if (o2Var.getParentLayout() != null && !((ActionBarLayout) o2Var.getParentLayout()).j() && !J() && !this.a) {
                if (motionEvent != null) {
                    if (this.B1 == null) {
                        this.B1 = VelocityTracker.obtain();
                    }
                    this.B1.addMovement(motionEvent);
                    i40 i40Var = this.E1;
                    if (i40Var != null) {
                        i40Var.b(true);
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
                    st0[] st0VarArr = this.k0;
                    if (z11 && (((z10 = this.h1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (!U0(motionEvent, x10 < 0)) {
                            this.y1 = true;
                            this.x1 = false;
                            N0(false);
                            st0VarArr[0].setTranslationX(0.0f);
                            st0VarArr[1].setTranslationX(this.h1 ? st0VarArr[0].getMeasuredWidth() : -st0VarArr[0].getMeasuredWidth());
                            Z0(0.0f, st0VarArr[1].F);
                            M0(getTabProgress());
                        }
                    }
                    if (!this.y1 || this.x1) {
                        if (this.x1) {
                            st0VarArr[0].setTranslationX(x10);
                            if (this.h1) {
                                st0VarArr[1].setTranslationX(st0VarArr[0].getMeasuredWidth() + x10);
                            } else {
                                st0VarArr[1].setTranslationX(x10 - st0VarArr[0].getMeasuredWidth());
                            }
                            float abs2 = Math.abs(x10) / st0VarArr[0].getMeasuredWidth();
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
                            Z0(abs2, st0VarArr[1].F);
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
        org.telegram.ui.ActionBar.w0 w0Var = this.t0;
        if (w0Var == null) {
            return;
        }
        boolean z10 = this.v1.getMessagesController().isPeerNoForwards(this.j1) || j0();
        w0Var.setAlpha(z10 ? 0.5f : 1.0f);
        if (z10 && w0Var.getBackground() != null) {
            w0Var.setBackground(null);
        } else {
            if (z10 || w0Var.getBackground() != null) {
                return;
            }
            w0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(h0(org.telegram.ui.ActionBar.j6.z8), 5, -1));
        }
    }

    public boolean q0() {
        return false;
    }

    public final void q1(boolean z10) {
        or0 or0Var;
        ur0 ur0Var;
        bj0 bj0Var = this.s0;
        if (bj0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.V0 && (((or0Var = this.V) == null || !or0Var.g()) && ((ur0Var = this.W) == null || !ur0Var.w))) {
            f7 = Utilities.clamp(this.o0 + this.p0, 1.0f, 0.0f);
        }
        bj0Var.setAlpha(f7);
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
            st0[] st0VarArr = this.k0;
            if (i10 >= st0VarArr.length) {
                return;
            }
            int childCount = st0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = st0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.j7) {
                    ((org.telegram.ui.Cells.j7) childAt).b(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.t7) {
                    ((org.telegram.ui.Cells.t7) childAt).i(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.n7) {
                    ((org.telegram.ui.Cells.n7) childAt).f(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) childAt).e(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.e2) {
                    ((org.telegram.ui.Cells.e2) childAt).c(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) childAt).V(false, z10);
                }
            }
            i10++;
        }
    }

    public final boolean s0(int i10) {
        return i10 == 7 ? this.D1.T() : (t0() || i10 == 0 || p0(i10) || i10 == 2 || i10 == 5 || i10 == 6 || i10 == 11 || i10 == 10 || i10 == 13 || i10 == 14) ? false : true;
    }

    public final void s1(float f7) {
        org.telegram.ui.ActionBar.w0 w0Var = this.m0;
        if (w0Var == null) {
            return;
        }
        st0[] st0VarArr = this.k0;
        st0 st0Var = st0VarArr[1];
        float f10 = 0.0f;
        if (st0Var != null && st0Var.F == 11) {
            f10 = 0.0f + f7;
        }
        st0 st0Var2 = st0VarArr[0];
        if (st0Var2 != null && st0Var2.F == 11) {
            f10 += 1.0f - f7;
        }
        w0Var.setAlpha(f10);
        float f11 = (0.15f * f10) + 0.85f;
        w0Var.setScaleX(f11);
        w0Var.setScaleY(f11);
        w0Var.setVisibility(f10 <= 0.01f ? 8 : 0);
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
                    ou0[] ou0VarArr = this.t1;
                    if (i10 >= ou0VarArr.length) {
                        break;
                    }
                    if (ou0VarArr[i10].b[1].size() == 0) {
                        ou0 ou0Var = ou0VarArr[i10];
                        ou0Var.j[1] = this.d1.migrated_from_max_id;
                        ou0Var.i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.d1;
        if (chatFull3 == null || z10 == chatFull3.stories_pinned_available) {
            return;
        }
        ps0 ps0Var = this.I0;
        if (ps0Var != null) {
            ps0Var.setInitialTabId(q0() ? 9 : 8);
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

    public void setForwardRestrictedHint(i40 i40Var) {
        this.E1 = i40Var;
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
            st0[] st0VarArr = this.k0;
            if (i14 >= st0VarArr.length) {
                break;
            }
            st0VarArr[i14].setTranslationY(this.K1);
            i14++;
        }
        if (this.P0 != null) {
            K();
        } else {
            ls0 ls0Var = this.R0;
            if (ls0Var != null) {
                ls0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
            }
        }
        this.O0 = i11;
        org.telegram.ui.Cells.w0 w0Var = this.K0;
        w0Var.setTranslationY((w0Var.getTag() == null ? -AndroidUtilities.dp(48.0f) : 0) + this.O0);
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.X1 != i10) {
            this.X1 = i10;
            st0[] st0VarArr = this.k0;
            if (st0VarArr != null) {
                for (st0 st0Var : st0VarArr) {
                    if (st0Var != null) {
                        yr0 yr0Var = st0Var.h;
                        int paddingLeft = yr0Var.getPaddingLeft();
                        yr0 yr0Var2 = st0Var.h;
                        int i11 = yr0Var2.Y2;
                        int paddingRight = yr0Var2.getPaddingRight();
                        yr0 yr0Var3 = st0Var.h;
                        int Y = Y(v0());
                        yr0Var3.e3 = Y;
                        yr0Var.setPadding(paddingLeft, i11, paddingRight, Y);
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
            st0[] st0VarArr = this.k0;
            if (i10 >= st0VarArr.length) {
                return;
            }
            o1(st0VarArr[i10], true);
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
            st0[] st0VarArr = this.k0;
            if (i11 >= st0VarArr.length) {
                break;
            }
            float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(st0VarArr[i11].F == 8 ? 280.0f : 120.0f)))) / 2.0f;
            st0VarArr[i11].w.setTranslationY(f7);
            st0VarArr[i11].v.setTranslationY(-f7);
            i11++;
        }
        nr0 nr0Var = this.U;
        if (nr0Var != null) {
            nr0Var.setVisibleHeight(i10);
        }
        or0 or0Var = this.V;
        if (or0Var != null) {
            or0Var.setVisibleHeight(i10);
        }
    }

    public boolean t0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void t1() {
        org.telegram.ui.ActionBar.w0 w0Var = this.m0;
        if (w0Var == null) {
            return;
        }
        st0 st0Var = this.k0[1];
        boolean z10 = st0Var != null && st0Var.F == 11;
        if (z10) {
            w0Var.setVisibility(0);
        }
        w0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.85f).scaleY(z10 ? 1.0f : 0.85f).withEndAction(new bi.f(28, this, z10)).setDuration(420L).setInterpolator(qr.h).start();
    }

    public boolean u0() {
        return false;
    }

    public final void u1() {
        boolean z10;
        ai.d9 d9Var;
        boolean r02 = r0();
        org.telegram.ui.ActionBar.w0 w0Var = this.w0;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.v0;
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
            SparseArray[] sparseArrayArr = this.Z0;
            if (i10 >= sparseArrayArr[0].size()) {
                z10 = false;
                break;
            }
            MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i10);
            ht0 ht0Var = this.c0;
            if (ht0Var != null && (d9Var = ht0Var.s) != null && !d9Var.m(messageObject.getId())) {
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
        char c10;
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
        ps0 ps0Var;
        int selectedTab;
        boolean z14;
        boolean z15;
        long j3;
        TLRPC.UserFull userFull2;
        TLRPC.ChatFull chatFull2;
        Integer num;
        ps0 ps0Var2;
        boolean z16;
        int i12;
        int size;
        int i13;
        Boolean bool;
        String string;
        String str;
        String str2;
        or0 or0Var;
        char c11;
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
        ru0 ru0Var;
        ps0 ps0Var3 = this.I0;
        if (ps0Var3 == null) {
            return;
        }
        boolean z17 = !this.D1.p() ? false : z10;
        boolean z18 = (this.T == null || (ru0Var = this.u1) == null || !ru0Var.f) ? false : true;
        org.telegram.ui.ActionBar.o2 o2Var = this.v1;
        long j10 = this.j1;
        if (j10 <= 0 || o2Var == null) {
            c10 = 4;
            user = null;
        } else {
            c10 = 4;
            user = o2Var.getMessagesController().getUser(Long.valueOf(j10));
        }
        boolean z19 = user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        boolean z20 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.e1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z19) ? false : true;
        boolean z21 = (DialogObject.isUserDialog(j10) || DialogObject.isChatDialog(j10)) && !DialogObject.isEncryptedDialog(j10) && (((userFull = this.e1) != null && userFull.stories_pinned_available) || (((chatFull = this.d1) != null && chatFull.stories_pinned_available) || v0())) && m0();
        or0 or0Var2 = this.V;
        boolean z22 = or0Var2 != null && (((userFull3 = this.e1) != null && userFull3.stargifts_count > 0) || ((chatFull3 = this.d1) != null && chatFull3.stargifts_count > 0));
        boolean z23 = z20;
        TLRPC.ChatFull chatFull4 = this.d1;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.e1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z24 = z17;
                int i17 = this.Q1 == ps0Var3.n0 ? 1 : 0;
                int i18 = (!z21 || z23) == ps0Var3.d(8) ? i17 + 1 : i17;
                if (z19 != ps0Var3.d(13)) {
                    i18++;
                }
                int i19 = i18;
                i10 = t0() == ps0Var3.d(8) ? i19 + 1 : i19;
                if (z22 == ps0Var3.d(14)) {
                    i10++;
                } else if (or0Var2 != null && z22) {
                    z11 = z18;
                    i11 = 14;
                    if (this.P1 != or0Var2.getLastEmojisHash()) {
                        i10++;
                    }
                    v02 = v0();
                    jt0 jt0Var = this.a0;
                    boolean z25 = z22;
                    int[] iArr2 = this.X0;
                    if (v02) {
                        iArr = iArr2;
                        z12 = false;
                        z13 = false;
                    } else {
                        iArr = iArr2;
                        int i20 = i10;
                        int i21 = (jt0Var.d == null) == ps0Var3.d(7) ? i20 + 1 : i20;
                        int i22 = (iArr[0] <= 0) == ps0Var3.d(0) ? i21 + 1 : i21;
                        int i23 = (iArr[1] <= 0) == ps0Var3.d(1) ? i22 + 1 : i22;
                        if (DialogObject.isEncryptedDialog(j10)) {
                            i15 = i23;
                        } else {
                            int i24 = i23;
                            int i25 = (iArr[3] <= 0) == ps0Var3.d(3) ? i24 + 1 : i24;
                            i15 = (iArr[c10] <= 0) == ps0Var3.d(4) ? i25 + 1 : i25;
                        }
                        int i26 = i16;
                        int i27 = (iArr[2] <= 0) == ps0Var3.d(2) ? i26 + 1 : i26;
                        int i28 = (iArr[5] <= 0) == ps0Var3.d(5) ? i27 + 1 : i27;
                        int i29 = (iArr[6] <= 0) == ps0Var3.d(6) ? i28 + 1 : i28;
                        boolean z26 = !this.Q.d.isEmpty();
                        int i30 = i29;
                        i10 = z26 != ps0Var3.d(10) ? i30 + 1 : i30;
                        z12 = l0() && !o2Var.getMessagesController().getSavedMessagesController().unsupported && o2Var.getMessagesController().getSavedMessagesController().hasDialogs();
                        z13 = z26;
                        if (z12 != ps0Var3.d(11)) {
                            i10++;
                        }
                        if (z11 != ps0Var3.d(12)) {
                            i10++;
                        }
                    }
                    if (i10 > 0) {
                        if (z24) {
                            TransitionSet transitionSet = new TransitionSet();
                            transitionSet.setOrdering(0);
                            z14 = z12;
                            transitionSet.addTransition(new org.telegram.ui.ActionBar.o0(2));
                            z15 = z11;
                            j3 = j10;
                            transitionSet.setDuration(200L);
                            TransitionManager.beginDelayedTransition(ps0Var3.getTabsContainer(), transitionSet);
                            ps0Var3.U = ps0Var3.v;
                            ps0Var3.V = ps0Var3.w;
                        } else {
                            z14 = z12;
                            z15 = z11;
                            j3 = j10;
                        }
                        SparseArray g10 = ps0Var3.g();
                        if (i10 > 3) {
                            g10 = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (t0()) {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                            ps0Var3.b0 = 420L;
                        }
                        if (z23) {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                        } else if ((DialogObject.isUserDialog(j3) || DialogObject.isChatDialog(j3)) && !DialogObject.isEncryptedDialog(j3) && ((((userFull2 = this.e1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.d1) != null && chatFull2.stories_pinned_available) || v0())) && m0())) {
                            if (q0()) {
                                arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                                ps0Var3.b0 = 420L;
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
                            HashMap hashMap = xh.r2.T;
                            yh.n5 n5Var = or0Var2.d;
                            if (n5Var == null) {
                                or0Var = or0Var2;
                                num = 0;
                                ps0Var2 = ps0Var3;
                                z16 = z15;
                                str2 = string2;
                                obj = "";
                            } else {
                                z16 = z15;
                                ArrayList arrayList2 = n5Var.l;
                                str2 = string2;
                                num = 0;
                                ps0Var2 = ps0Var3;
                                Pair pair = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(or0Var2.c));
                                if (!arrayList2.isEmpty()) {
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList3 = new ArrayList();
                                    int i31 = 0;
                                    while (true) {
                                        or0Var = or0Var2;
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
                                        or0Var2 = or0Var;
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                                        int i32 = 0;
                                        while (i32 < arrayList3.size()) {
                                            TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i32);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(MessageObject.getEmoji(document2));
                                            spannableStringBuilder2.setSpan(new x5(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
                                            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                                            i32++;
                                            arrayList3 = arrayList3;
                                        }
                                        c11 = 0;
                                        hashMap.put(pair, spannableStringBuilder);
                                        obj3 = spannableStringBuilder;
                                        CharSequence[] charSequenceArr = new CharSequence[2];
                                        charSequenceArr[c11] = str2;
                                        charSequenceArr[1] = obj3;
                                        arrayList.add(new Pair(valueOf, TextUtils.concat(charSequenceArr)));
                                        this.P1 = or0Var.getLastEmojisHash();
                                    }
                                } else if (!n5Var.i || (obj2 = (CharSequence) hashMap.get(pair)) == null) {
                                    or0Var = or0Var2;
                                } else {
                                    or0Var = or0Var2;
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
                            this.P1 = or0Var.getLastEmojisHash();
                        } else {
                            num = 0;
                            ps0Var2 = ps0Var3;
                            z16 = z15;
                        }
                        if (z19) {
                            arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                        }
                        if (!v0()) {
                            if (z14) {
                                arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                            }
                            if (jt0Var.d != null) {
                                arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                            }
                            if (iArr[0] > 0) {
                                if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && jt0Var.d == null) {
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
                            if (!DialogObject.isEncryptedDialog(j3)) {
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
                                arrayList.add(new Pair(10, LocaleController.getString(j10 > 0 ? R.string.SimilarBotsTab : R.string.SimilarChannelsTab)));
                            }
                        }
                        ps0Var = ps0Var2;
                        if (ps0Var.n0) {
                            boolean z27 = this.d1 instanceof TLRPC.TL_channelFull;
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
                                    this.R1 = ((Integer) ((Pair) arrayList.get(i12)).first).intValue();
                                }
                                size = arrayList.size();
                                i13 = 0;
                                while (i13 < size) {
                                    Object obj4 = arrayList.get(i13);
                                    i13++;
                                    Pair pair2 = (Pair) obj4;
                                    if (!ps0Var.d(((Integer) pair2.first).intValue())) {
                                        ps0Var.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, g10);
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
                        ps0Var = ps0Var3;
                    }
                    selectedTab = getSelectedTab();
                    if (selectedTab >= 0) {
                        this.k0[0].F = selectedTab;
                    }
                    this.Q1 = ps0Var.n0;
                    ps0Var.c();
                    L0();
                    I();
                }
                z11 = z18;
                i11 = 14;
                v02 = v0();
                jt0 jt0Var2 = this.a0;
                boolean z252 = z22;
                int[] iArr22 = this.X0;
                if (v02) {
                }
                if (i10 > 0) {
                }
                selectedTab = getSelectedTab();
                if (selectedTab >= 0) {
                }
                this.Q1 = ps0Var.n0;
                ps0Var.c();
                L0();
                I();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z242 = z17;
        if (this.Q1 == ps0Var3.n0) {
        }
        int i172 = this.Q1 == ps0Var3.n0 ? 1 : 0;
        if ((!z21 || z23) == ps0Var3.d(8)) {
        }
        if (z19 != ps0Var3.d(13)) {
        }
        int i192 = i18;
        if (t0() == ps0Var3.d(8)) {
        }
        if (z22 == ps0Var3.d(14)) {
        }
        z11 = z18;
        i11 = 14;
        v02 = v0();
        jt0 jt0Var22 = this.a0;
        boolean z2522 = z22;
        int[] iArr222 = this.X0;
        if (v02) {
        }
        if (i10 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.Q1 = ps0Var.n0;
        ps0Var.c();
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
                this.W1.setSpan(new oq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.W1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.W1;
    }

    public final Boolean w1(View view, View view2) {
        if (this.o1) {
            return null;
        }
        st0[] st0VarArr = this.k0;
        st0 st0Var = st0VarArr[0];
        if (st0Var == null) {
            return null;
        }
        int i10 = st0Var.F;
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
            } else if (c0(st0VarArr[0].F) >= 5 || w0(st0VarArr[0].F)) {
                SharedConfig.setStoriesColumnsCount(X);
            }
            B(X);
        }
        return Boolean.valueOf(X != X(p02 ? 1 : 0, X, true));
    }

    public final void x(n70 n70Var, org.telegram.ui.ActionBar.o2 o2Var, long j3, int i10) {
        String publicUsername = j3 > 0 ? UserObject.getPublicUsername(MessagesController.getInstance(o2Var.getCurrentAccount()).getUser(Long.valueOf(j3))) : ChatObject.getPublicUsername(MessagesController.getInstance(o2Var.getCurrentAccount()).getChat(Long.valueOf(-j3)));
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        a4.a.z(sb2, MessagesController.getInstance(o2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        n70Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new gr0(this, sb2.toString(), o2Var, 0), false);
    }

    public final boolean x0() {
        if (C() && ((getClosestTab() == 8 || getClosestTab() == 13 || w0(getClosestTab())) && this.C1)) {
            return false;
        }
        or0 or0Var = this.V;
        if (or0Var != null && or0Var.g()) {
            return false;
        }
        ur0 ur0Var = this.W;
        return ((ur0Var != null && ur0Var.w) || this.o1 || this.g1) ? false : true;
    }

    public final Boolean x1(View view, View view2) {
        if (this.o1) {
            return null;
        }
        st0[] st0VarArr = this.k0;
        st0 st0Var = st0VarArr[0];
        if (st0Var == null) {
            return null;
        }
        if (this.k1 && p0(st0Var.F)) {
            return null;
        }
        int i10 = st0VarArr[0].F;
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
            } else if (c0(st0VarArr[0].F) >= 5 || w0(st0VarArr[0].F)) {
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
    public final void y(n70 n70Var) {
        st0 st0Var;
        int x10 = n70Var.x();
        final int i10 = 0;
        n70Var.c(R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn), new Runnable(this) { // from class: org.telegram.ui.Components.dr0
            public final /* synthetic */ zu0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        zu0 zu0Var = this.b;
                        zu0Var.getClass();
                        View[] viewArr = r2;
                        zu0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        zu0 zu0Var2 = this.b;
                        zu0Var2.getClass();
                        View[] viewArr2 = r2;
                        zu0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        n70Var.c(R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut), new Runnable(this) { // from class: org.telegram.ui.Components.dr0
            public final /* synthetic */ zu0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        zu0 zu0Var = this.b;
                        zu0Var.getClass();
                        View[] viewArr = r2;
                        zu0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        zu0 zu0Var2 = this.b;
                        zu0Var2.getClass();
                        View[] viewArr2 = r2;
                        zu0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final View[] viewArr = {n70Var.w(x10), n70Var.w(x10 + 1)};
        st0[] st0VarArr = this.k0;
        if (st0VarArr != null && (st0Var = st0VarArr[0]) != null) {
            boolean p02 = p0(st0Var.F);
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
        ou0[] ou0VarArr = this.t1;
        ou0VarArr[i10].a.clear();
        ou0VarArr[i10].b[0].clear();
        ou0VarArr[i10].b[1].clear();
        ou0 ou0Var = ou0VarArr[i10];
        ou0Var.j[0] = i11;
        ou0Var.i[0] = false;
        ou0Var.l = false;
        ou0Var.m = i12;
        ou0Var.n = (ou0Var.e() - i12) - 1;
        ou0 ou0Var2 = ou0VarArr[i10];
        if (ou0Var2.n < 0) {
            ou0Var2.n = 0;
        }
        ou0Var2.k = i11;
        ou0Var2.o = true;
        ou0Var2.g = false;
        ou0Var2.p++;
        st0 W = W(i10);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (!z10) {
            return;
        }
        int i13 = 0;
        while (true) {
            st0[] st0VarArr = this.k0;
            if (i13 >= st0VarArr.length) {
                return;
            }
            st0 st0Var = st0VarArr[i13];
            if (st0Var.F == i10) {
                st0Var.x.h1(Math.min(ou0VarArr[i10].e() - 1, ou0VarArr[i10].m), 0);
            }
            i13++;
        }
    }

    public final void z(rt0 rt0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = rt0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = rt0Var.getChildAt(i11);
            if (childAt instanceof t00) {
                view = childAt;
            }
        }
        if (view != null) {
            rt0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new us0(this, rt0Var, sparseBooleanArray, (t00) view, i10));
    }

    public final void z0(boolean z10) {
        long j3 = this.F;
        if (j3 != 0 || t0()) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            final int i11 = d2[i10];
            ou0[] ou0VarArr = this.t1;
            if (ou0VarArr[i11].h && !z10) {
                return;
            }
            long j10 = this.j1;
            if (DialogObject.isEncryptedDialog(j10)) {
                return;
            }
            ou0VarArr[i11].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i11 == 0) {
                int i12 = ou0VarArr[i11].q;
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
            org.telegram.ui.ActionBar.o2 o2Var = this.v1;
            tL_messages_getSearchResultsPositions.peer = o2Var.getMessagesController().getInputPeer(j10);
            if (j3 != 0 && o2Var.getUserConfig().getClientUserId() == j10) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = o2Var.getMessagesController().getInputPeer(j3);
            }
            final int i13 = ou0VarArr[i11].p;
            ConnectionsManager.getInstance(o2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(o2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() { // from class: org.telegram.ui.Components.qq0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new yq0(zu0.this, tL_error, i13, i11, tLObject, 0));
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
