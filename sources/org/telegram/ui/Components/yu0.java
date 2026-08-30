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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class yu0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.n2 {
    public static final int[] a2 = {0, 1, 2, 4};
    public static final kr0 b2 = new kr0(0);
    public final org.telegram.ui.ActionBar.i2 A0;
    public final jt0 A1;
    public final int B;
    public final ArrayList B0;
    public k40 B1;
    public final long C;
    public final ArrayList C0;
    public final org.telegram.ui.ActionBar.f6 C1;
    public final org.telegram.ui.ActionBar.k D;
    public final ArrayList D0;
    public final NotificationCenter.ObserversGroup D1;
    public final ct0 E;
    public final ArrayList E0;
    public boolean E1;
    public final su0 F;
    public final ns0 F0;
    public final AnimationNotificationsLocker F1;
    public final mu0 G;
    public final ks0 G0;
    public ey G1;
    public final lu0 H;
    public final org.telegram.ui.Cells.v0 H0;
    public int H1;
    public final lu0 I;
    public AnimatorSet I0;
    public boolean I1;
    public final lu0 J;
    public final uq0 J0;
    public int J1;
    public final eu0 K;
    public final ArrayList K0;
    public AnimatorSet K1;
    public final lt0 L;
    public float L0;
    public final SparseArray L1;
    public final it0 M;
    public final js M0;
    public long M1;
    public final gt0 N;
    public final FrameLayout N0;
    public boolean N1;
    public final hu0 O;
    public final js0 O0;
    public int O1;
    public final ju0 P;
    public final int P0;
    public final us0 P1;
    public final dt0 Q;
    public final Paint Q0;
    public nh.l6 Q1;
    public final nr0 R;
    public boolean R0;
    public float R1;
    public final or0 S;
    public boolean S0;
    public boolean S1;
    public final sr0 T;
    public mg.q0 T0;
    public SpannableStringBuilder T1;
    public final ht0 U;
    public final int[] U0;
    public int U1;
    public final f2.e0 V;
    public int V0;
    public final HashMap V1;
    public final ft0 W;
    public final SparseArray[] W0;
    public final HashMap W1;
    public int X0;
    public int X1;
    public boolean Y0;
    public int Y1;
    public long Z0;
    public final ah Z1;
    public boolean a;
    public final vu0 a0;
    public TLRPC.ChatFull a1;
    public boolean b;
    public final mr0 b0;
    public TLRPC.UserFull b1;
    public boolean c;
    public final vu0 c0;
    public AnimatorSet c1;
    public boolean d;
    public final tt0 d0;
    public boolean d1;
    public int e;
    public final tt0 e0;
    public boolean e1;
    public int f;
    public final tt0 f0;
    public boolean f1;
    public final ot0 g0;
    public final long g1;
    public float h;
    public final qt0[] h0;
    public boolean h1;
    public final org.telegram.ui.ActionBar.w0 i0;
    public boolean i1;
    public final org.telegram.ui.ActionBar.w0 j0;
    public final int[] j1;
    public final org.telegram.ui.ActionBar.w0 k0;
    public float k1;
    public float l0;
    public boolean l1;
    public float m0;
    public int m1;
    public float n;
    public final TextView n0;
    public int n1;
    public final ImageView o0;
    public final xr0 o1;
    public final jj0 p0;
    public float p1;
    public final org.telegram.ui.ActionBar.w0 q0;
    public final nu0[] q1;
    public boolean r;
    public final org.telegram.ui.ActionBar.w0 r0;
    public final qu0 r1;
    public int s;
    public final org.telegram.ui.ActionBar.w0 s0;
    public final org.telegram.ui.ActionBar.p2 s1;
    public final org.telegram.ui.ActionBar.w0 t0;
    public int t1;
    public int u0;
    public boolean u1;
    public int v;
    public final Drawable v0;
    public boolean v1;
    public int w;
    public boolean w0;
    public int w1;
    public final Rect x;
    public final NumberTextView x0;
    public int x1;
    public final t00 y;
    public final z9 y0;
    public VelocityTracker y1;
    public final ImageView z0;
    public boolean z1;

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
    /* JADX WARN: Type inference failed for: r10v8, types: [android.graphics.drawable.Drawable, f2.t0, org.telegram.ui.ActionBar.f6] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yu0(Context context, long j10, qu0 qu0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, org.telegram.ui.ActionBar.p2 p2Var, jt0 jt0Var, int i13, org.telegram.ui.ActionBar.f6 f6Var, ng.a aVar) {
        super(context);
        char c3;
        TLRPC.ProfileTab profileTab;
        int i14;
        nu0[] nu0VarArr;
        int i15;
        ks0 ks0Var;
        int i16;
        int i17;
        hu0 hu0Var;
        float f10;
        Context context2;
        org.telegram.ui.ActionBar.w0 w0Var;
        ?? r10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        yu0 yu0Var;
        int i18;
        int i19;
        int i20;
        qt0[] qt0VarArr;
        View view;
        boolean N;
        yu0 yu0Var2;
        sr0 sr0Var;
        int i21;
        int i22;
        ur0 ur0Var;
        pt0 pt0Var;
        pt0 pt0Var2;
        pt0 pt0Var3;
        pt0 pt0Var4;
        pt0 pt0Var5;
        pt0 pt0Var6;
        pt0 pt0Var7;
        pt0 pt0Var8;
        pt0 pt0Var9;
        pt0 pt0Var10;
        pt0 pt0Var11;
        pt0 pt0Var12;
        pt0 pt0Var13;
        pt0 pt0Var14;
        pt0 pt0Var15;
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
        pt0 pt0Var16;
        zw0 zw0Var11;
        pt0 pt0Var17;
        pt0 pt0Var18;
        qt0 qt0Var;
        ur0 ur0Var2;
        pt0 pt0Var19;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        TL_bots.BotInfo botInfo;
        yu0 yu0Var3 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        yu0Var3.x = new Rect();
        yu0Var3.h0 = new qt0[2];
        yu0Var3.B0 = new ArrayList(10);
        yu0Var3.C0 = new ArrayList(10);
        yu0Var3.D0 = new ArrayList(10);
        yu0Var3.E0 = new ArrayList(10);
        yu0Var3.J0 = new uq0(yu0Var3, 2);
        yu0Var3.K0 = new ArrayList();
        yu0Var3.Q0 = new Paint();
        yu0Var3.W0 = new SparseArray[]{new SparseArray(), new SparseArray()};
        yu0Var3.h1 = false;
        yu0Var3.i1 = false;
        yu0Var3.j1 = new int[]{3, 3};
        yu0Var3.o1 = new xr0(yu0Var3);
        yu0Var3.p1 = -5.0f;
        yu0Var3.q1 = new nu0[9];
        yu0Var3.F1 = new AnimationNotificationsLocker();
        yu0Var3.L1 = new SparseArray();
        yu0Var3.O1 = -1;
        yu0Var3.P1 = new us0(yu0Var3);
        yu0Var3.R1 = 0.0f;
        yu0Var3.V1 = new HashMap();
        yu0Var3.W1 = new HashMap();
        sg.c cVar = new sg.c();
        cVar.a(yu0Var3.h0(org.telegram.ui.ActionBar.j6.d6));
        ng.a aVar2 = aVar == null ? new ng.a(cVar) : aVar;
        yu0Var3.B = i13;
        yu0Var3.C1 = f6Var;
        t00 t00Var6 = new t00(context);
        yu0Var3.y = t00Var6;
        t00Var6.setIsSingleCell(true);
        TLRPC.User user = p2Var.getMessagesController().getUser(Long.valueOf(j10));
        yu0Var3.r1 = qu0Var;
        yu0Var3.A1 = jt0Var;
        int[] iArr = qu0Var.c;
        long j11 = qu0Var.s;
        yu0Var3.C = j11;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j11 == 0 ? i10 : 0, iArr[7], iArr[8]};
        yu0Var3.U0 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            if (chatFull2 == null) {
                c3 = 5;
                profileTab = null;
                if (i11 != 14 || i11 == 10 || i11 == 11 || i11 == 6) {
                    yu0Var3.V0 = i11;
                } else if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    yu0Var3.V0 = 13;
                } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                    yu0Var3.V0 = 8;
                } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || yu0Var3.v0()))) {
                    yu0Var3.V0 = 8;
                } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                    if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                        int i28 = iArr2[1];
                        i23 = -1;
                        if (i28 == -1 || i28 > 0) {
                            yu0Var3.V0 = 1;
                        }
                    } else {
                        i23 = -1;
                    }
                    if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i27 = iArr2[c3]) == i23 || i27 > 0)) {
                        yu0Var3.V0 = 5;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i26 = iArr2[3]) == i23 || i26 > 0)) {
                        yu0Var3.V0 = 3;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i25 = iArr2[4]) == i23 || i25 > 0)) {
                        yu0Var3.V0 = 4;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i24 = iArr2[2]) == i23 || i24 > 0)) {
                        yu0Var3.V0 = 2;
                    } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || yu0Var3.v0())) {
                        yu0Var3.V0 = yu0Var3.getInitialTab();
                    } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                        int i29 = -1;
                        if (i11 == -1 || j11 != 0) {
                            int i30 = 0;
                            while (true) {
                                int[] iArr3 = yu0Var3.U0;
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
                            yu0Var3.V0 = i30;
                        } else {
                            yu0Var3.V0 = i11;
                        }
                    } else {
                        yu0Var3.V0 = 14;
                    }
                } else {
                    yu0Var3.V0 = 14;
                }
                yu0Var3.M0(i11);
                yu0Var3.a1 = chatFull2;
                yu0Var3.b1 = userFull;
                if (chatFull2 != null) {
                    yu0Var3.Z0 = -chatFull2.migrated_from_chat_id;
                }
                yu0Var3.g1 = j10;
                i14 = 0;
                while (true) {
                    nu0VarArr = yu0Var3.q1;
                    if (i14 < nu0VarArr.length) {
                        break;
                    }
                    nu0VarArr[i14] = new nu0();
                    yu0Var3.q1[i14].j[0] = DialogObject.isEncryptedDialog(yu0Var3.g1) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    yu0Var3.q1[i14].j[1] = Integer.MAX_VALUE;
                    yu0Var3.R(i14);
                    if (yu0Var3.Z0 != 0 && yu0Var3.a1 != null && yu0Var3.q1[i14].b[1].size() == 0) {
                        nu0 nu0Var = yu0Var3.q1[i14];
                        nu0Var.j[1] = yu0Var3.a1.migrated_from_max_id;
                        nu0Var.i[1] = false;
                    }
                    i14++;
                }
                yu0Var3.s1 = p2Var;
                yu0Var3.D = p2Var.getActionBar();
                yu0Var3.j1[0] = yu0Var3.S0() > 0 ? SharedConfig.mediaColumnsCount : yu0Var3.S0();
                yu0Var3.j1[1] = yu0Var3.S0() > 0 ? SharedConfig.storiesColumnsCount : yu0Var3.S0();
                yu0Var3.D1 = p2Var.getNotificationCenter().createObserversGroup(yu0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
                for (i15 = 0; i15 < 10; i15++) {
                    if (i11 == 4) {
                        is0 is0Var = new is0(yu0Var3, context);
                        is0Var.Q.c();
                        yu0Var3.D0.add(is0Var);
                    }
                }
                yu0Var3.P0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                yu0Var3.S0 = false;
                yu0Var3.T0 = null;
                ks0Var = yu0Var3.G0;
                if (ks0Var != null) {
                    ks0Var.g(false);
                }
                yu0Var3.R0 = false;
                Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
                yu0Var3.v0 = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(yu0Var3.h0(org.telegram.ui.ActionBar.j6.b7), PorterDuff.Mode.MULTIPLY));
                ns0 ns0Var = yu0Var3.F0;
                int currentTabId = ns0Var == null ? ns0Var.getCurrentTabId() : i11;
                ns0 ns0Var2 = new ns0(yu0Var3, context, yu0Var3.C1);
                i16 = yu0Var3.V0;
                if (i16 != -1) {
                    ns0Var2.setInitialTabId(i16);
                    yu0Var3.V0 = -1;
                }
                ns0Var2.V = 320L;
                int i32 = org.telegram.ui.ActionBar.j6.Fh;
                int i33 = org.telegram.ui.ActionBar.j6.Eh;
                ns0Var2.I = i32;
                ns0Var2.J = i33;
                ns0Var2.e();
                ns0Var2.setUseMinimalWidth(true);
                ns0Var2.setDelegate(new ps0(yu0Var3));
                yu0Var3.F0 = ns0Var2;
                for (i17 = 1; i17 >= 0; i17--) {
                    yu0Var3.W0[i17].clear();
                }
                yu0Var3.X0 = 0;
                yu0Var3.K0.clear();
                hu0Var = yu0Var3.O;
                if (hu0Var != null) {
                    hu0Var.w.clear();
                }
                if (!(yu0Var3 instanceof a40)) {
                    org.telegram.ui.ActionBar.z n10 = yu0Var3.D.n();
                    n10.addOnLayoutChangeListener(new os0(yu0Var3));
                    if (yu0Var3.g1 == yu0Var3.s1.getUserConfig().getClientUserId() && (yu0Var3.s1 instanceof da0) && yu0Var3.D()) {
                        yu0Var3.j0 = n10.a(11, R.drawable.outline_header_search);
                    }
                    org.telegram.ui.ActionBar.w0 a10 = n10.a(0, 0);
                    a10.F();
                    a10.E = new vs0(yu0Var3);
                    yu0Var3.k0 = a10;
                    a10.setTranslationY(AndroidUtilities.dp(10.0f));
                    ks0 ks0Var2 = yu0Var3.G0;
                    a10.setSearchFieldHint(LocaleController.getString((ks0Var2 != null && ks0Var2.a() && yu0Var3.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
                    a10.setContentDescription(LocaleController.getString("Search", R.string.Search));
                    a10.setVisibility(yu0Var3.v0() ? 8 : 4);
                }
                ImageView imageView = new ImageView(context);
                yu0Var3.o0 = imageView;
                imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
                imageView.setTranslationY(AndroidUtilities.dp(10.0f));
                imageView.setVisibility(4);
                if (!yu0Var3.q0() || yu0Var3.t0()) {
                    f10 = 2.0f;
                } else {
                    yu0Var3.D.addView(imageView, k7.b6.e(48, 56, 85));
                    jj0 jj0Var = new jj0(context);
                    yu0Var3.p0 = jj0Var;
                    jj0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    jj0Var.e(R.raw.options_to_search, 24, 24);
                    jj0Var.getAnimatedDrawable().C *= 2.0f;
                    jj0Var.getAnimatedDrawable().h = true;
                    f10 = 2.0f;
                    jj0Var.setColorFilter(new PorterDuffColorFilter(yu0Var3.h0(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.SRC_IN));
                    jj0Var.setVisibility(8);
                    yu0Var3.D.addView(jj0Var, k7.b6.e(48, 56, 85));
                }
                context2 = context;
                imageView.setOnClickListener(new bt0(yu0Var3, j10, f6Var, context));
                w0Var = yu0Var3.k0;
                if (w0Var != null) {
                    EditTextBoldCursor searchField = w0Var.getSearchField();
                    int i34 = org.telegram.ui.ActionBar.j6.G6;
                    searchField.setTextColor(yu0Var3.h0(i34));
                    searchField.setHintTextColor(yu0Var3.h0(org.telegram.ui.ActionBar.j6.Si));
                    searchField.setCursorColor(yu0Var3.h0(i34));
                }
                yu0Var3.u0 = 0;
                org.telegram.ui.ActionBar.p2 p2Var2 = yu0Var3.s1;
                qv0 qv0Var = (p2Var2 == null && (p2Var2.getFragmentView() instanceof qv0)) ? (qv0) yu0Var3.s1.getFragmentView() : null;
                z9 z9Var = new z9(context2, qv0Var);
                yu0Var3.y0 = z9Var;
                z9Var.setBackgroundColor(yu0Var3.h0(org.telegram.ui.ActionBar.j6.a7));
                z9Var.setAlpha(0.0f);
                z9Var.setClickable(true);
                z9Var.setVisibility(4);
                ImageView imageView2 = new ImageView(context2);
                yu0Var3.z0 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(true);
                yu0Var3.A0 = i2Var;
                imageView2.setImageDrawable(i2Var);
                int i35 = org.telegram.ui.ActionBar.j6.y8;
                i2Var.a(yu0Var3.h0(i35));
                int i36 = org.telegram.ui.ActionBar.j6.z8;
                imageView2.setBackground(org.telegram.ui.ActionBar.j6.e0(yu0Var3.h0(i36), 1));
                imageView2.setContentDescription(LocaleController.getString("Close", R.string.Close));
                z9Var.addView(imageView2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                yu0Var3.K0.add(imageView2);
                imageView2.setOnClickListener(new wq0(yu0Var3, 0));
                NumberTextView numberTextView = new NumberTextView(context2);
                yu0Var3.x0 = numberTextView;
                numberTextView.setTextSize(18);
                numberTextView.setTypeface(AndroidUtilities.bold());
                numberTextView.setTextColor(yu0Var3.h0(i35));
                z9Var.addView(numberTextView, k7.b6.m(1.0f, 0, -1, 18, 0, 0));
                yu0Var3.K0.add(numberTextView);
                if (!DialogObject.isEncryptedDialog(yu0Var3.g1)) {
                    if (!yu0Var3.v0()) {
                        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context2, yu0Var3.h0(i36), yu0Var3.h0(i35), false);
                        yu0Var3.r0 = w0Var2;
                        w0Var2.setIcon(R.drawable.msg_message);
                        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrGoToMessage));
                        w0Var2.setDuplicateParentStateEnabled(false);
                        z9Var.addView(w0Var2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        yu0Var3.K0.add(w0Var2);
                        w0Var2.setOnClickListener(new wq0(yu0Var3, 1));
                        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(context2, yu0Var3.h0(i36), yu0Var3.h0(i35), false);
                        yu0Var3.q0 = w0Var3;
                        w0Var3.setIcon(R.drawable.msg_forward);
                        w0Var3.setContentDescription(LocaleController.getString(R.string.Forward));
                        w0Var3.setDuplicateParentStateEnabled(false);
                        z9Var.addView(w0Var3, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        yu0Var3.K0.add(w0Var3);
                        w0Var3.setOnClickListener(new wq0(yu0Var3, 2));
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = new org.telegram.ui.ActionBar.w0(context2, yu0Var3.h0(i36), yu0Var3.h0(i35), false);
                    yu0Var3.s0 = w0Var4;
                    w0Var4.setIcon(R.drawable.msg_pin);
                    w0Var4.setContentDescription(LocaleController.getString(R.string.PinMessage));
                    w0Var4.setDuplicateParentStateEnabled(false);
                    w0Var4.setVisibility(8);
                    z9Var.addView(w0Var4, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    yu0Var3.K0.add(w0Var4);
                    w0Var4.setOnClickListener(new wq0(yu0Var3, 3));
                    org.telegram.ui.ActionBar.w0 w0Var5 = new org.telegram.ui.ActionBar.w0(context2, yu0Var3.h0(i36), yu0Var3.h0(i35), false);
                    yu0Var3.t0 = w0Var5;
                    w0Var5.setIcon(R.drawable.msg_unpin);
                    w0Var5.setContentDescription(LocaleController.getString(R.string.UnpinMessage));
                    w0Var5.setDuplicateParentStateEnabled(false);
                    w0Var5.setVisibility(8);
                    z9Var.addView(w0Var5, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    yu0Var3.K0.add(w0Var5);
                    w0Var5.setOnClickListener(new wq0(yu0Var3, 4));
                    yu0Var3.p1();
                }
                org.telegram.ui.ActionBar.w0 w0Var6 = new org.telegram.ui.ActionBar.w0(context2, yu0Var3.h0(i36), yu0Var3.h0(i35), false);
                yu0Var3.i0 = w0Var6;
                w0Var6.setIcon(R.drawable.msg_delete);
                w0Var6.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
                w0Var6.setDuplicateParentStateEnabled(false);
                z9Var.addView(w0Var6, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                yu0Var3.K0.add(w0Var6);
                w0Var6.setOnClickListener(new wq0(yu0Var3, 5));
                yu0Var3.E = new ct0(yu0Var3, context2);
                yu0Var3.F = new su0(yu0Var3, context2);
                yu0Var3.H = new lu0(yu0Var3, context2, 1);
                yu0Var3.I = new lu0(yu0Var3, context2, 2);
                yu0Var3.J = new lu0(yu0Var3, context2, 4);
                yu0Var3.K = new eu0(yu0Var3, context2, yu0Var3.s1.getCurrentAccount(), yu0Var3.s1.getResourceProvider());
                yu0Var3.L = new lt0(yu0Var3, context2);
                yu0Var3.d0 = new tt0(yu0Var3, context2, 1);
                yu0Var3.e0 = new tt0(yu0Var3, context2, 4);
                yu0Var3.f0 = new tt0(yu0Var3, context2, 3);
                yu0Var3.g0 = new ot0(yu0Var3, context2);
                yu0Var3.M = new it0(yu0Var3, context2);
                yu0Var3.N = new gt0(yu0Var3, context2);
                yu0Var3.O = new hu0(yu0Var3, context2);
                yu0Var3.P = new ju0(yu0Var3, context2);
                if (!yu0Var3.v0() && !yu0Var3.l0() && yu0Var3.C == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", yu0Var3.s1.getUserConfig().getClientUserId());
                    bundle.putInt("chatMode", 3);
                    dt0 dt0Var = new dt0(yu0Var3, context2, yu0Var3.s1.getParentLayout(), bundle);
                    yu0Var3.Q = dt0Var;
                    long j12 = yu0Var3.g1;
                    org.telegram.ui.yn ynVar = dt0Var.a;
                    ynVar.a4 = j12;
                    ynVar.Ma = true;
                    dt0Var.setClipToOutline(true);
                    dt0Var.setOutlineProvider(new et0());
                }
                ht0 ht0Var = new ht0(yu0Var3, context2);
                yu0Var3.U = ht0Var;
                if (yu0Var3.C == 0) {
                    ht0Var.e = arrayList;
                    ht0Var.d = currentTabId != 7 ? null : chatFull2;
                }
                yu0Var3.W = new ft0(yu0Var3, context2);
                yu0Var3.V = new f2.e0(new lr0(yu0Var3));
                yu0Var3.a0 = new vu0(yu0Var3, context2, false);
                yu0Var3.b0 = new mr0(yu0Var3, context2);
                yu0Var3.c0 = new vu0(yu0Var3, context2, true);
                yu0Var3.G = new mu0(yu0Var3, context2);
                if (!yu0Var3.r0()) {
                    yu0Var3.R = new nr0(yu0Var3, context2, yu0Var3.s1, yu0Var3.g1);
                } else if (yu0Var3.s1 instanceof ProfileActivity) {
                    TextView textView = new TextView(context2);
                    yu0Var3.n0 = textView;
                    textView.setText(LocaleController.getString(R.string.Save).toUpperCase());
                    textView.setTypeface(AndroidUtilities.bold());
                    int i37 = org.telegram.ui.ActionBar.j6.Oh;
                    textView.setTextColor(yu0Var3.h0(i37));
                    textView.setTextSize(1, 15.0f);
                    textView.setGravity(17);
                    textView.setBackground(org.telegram.ui.ActionBar.j6.e0(org.telegram.ui.ActionBar.j6.l1(0.15f, yu0Var3.h0(i37)), 3));
                    textView.setPadding(AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f), 0);
                    yu0Var3.D.addView(textView, k7.b6.e(-2, 56, 85));
                    textView.setOnClickListener(new wq0(yu0Var3, 6));
                    textView.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setScaleX(0.4f);
                    textView.setScaleY(0.4f);
                    org.telegram.ui.ActionBar.p2 p2Var3 = yu0Var3.s1;
                    r10 = 0;
                    f6Var2 = f6Var;
                    or0 or0Var = new or0(p2Var3.getCurrentAccount(), ((ProfileActivity) yu0Var3.s1).a(), context2, p2Var3, f6Var2, yu0Var3);
                    context2 = context2;
                    yu0 yu0Var4 = yu0Var3;
                    yu0Var4.S = or0Var;
                    int dp = AndroidUtilities.dp(48.0f);
                    js jsVar = yu0Var4.M0;
                    or0Var.setPaddingTop(dp + (jsVar != null ? (int) jsVar.c(0.0f) : 0));
                    yu0Var4.T = new sr0(yu0Var4, context2, qv0Var, yu0Var4.getStoriesController().B(yu0Var4.g1, true), new rr0(yu0Var4, context2, p2Var, f6Var2));
                    yu0Var = yu0Var4;
                    yu0Var.setWillNotDraw(false);
                    i18 = 0;
                    i19 = -1;
                    i20 = 0;
                    while (true) {
                        qt0VarArr = yu0Var.h0;
                        if (i20 >= qt0VarArr.length) {
                            break;
                        }
                        if (i20 == 0 && (qt0Var = qt0VarArr[i20]) != null && (ur0Var2 = qt0Var.x) != null) {
                            i19 = ur0Var2.L0();
                            if (i19 != yu0Var.h0[i20].x.B() - 1) {
                                pt0Var19 = yu0Var.h0[i20].h;
                                el0 el0Var = (el0) pt0Var19.K(i19);
                                if (el0Var != null) {
                                    i18 = el0Var.a.getTop();
                                } else {
                                    i19 = -1;
                                }
                            } else {
                                i21 = i18;
                                i22 = -1;
                                tr0 tr0Var = new tr0(yu0Var, context2);
                                yu0Var.addView(tr0Var, k7.b6.d(-1, -1.0f, 51, 0.0f, yu0Var.B0(), 0.0f, 0.0f));
                                if (i20 == 1) {
                                    tr0Var.setTranslationX(AndroidUtilities.displaySize.x);
                                }
                                yu0Var.h0[i20] = tr0Var;
                                ur0Var = new ur0(yu0Var, tr0Var);
                                tr0Var.x = ur0Var;
                                ur0Var.z1(new vr0(yu0Var, tr0Var));
                                yu0Var.h0[i20].d = new f2.l();
                                yu0Var.h0[i20].d.n(280L);
                                yu0Var.h0[i20].d.o(nr.h);
                                qt0 qt0Var2 = yu0Var.h0[i20];
                                qt0Var2.d.m = false;
                                qt0Var2.h = new wr0(yu0Var, context2, tr0Var, ur0Var);
                                pt0Var = yu0Var.h0[i20].h;
                                pt0Var.setFastScrollEnabled(1);
                                pt0Var2 = yu0Var.h0[i20].h;
                                pt0Var2.setScrollingTouchSlop(1);
                                pt0Var3 = yu0Var.h0[i20].h;
                                pt0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(f10));
                                pt0Var4 = yu0Var.h0[i20].h;
                                pt0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                                pt0Var5 = yu0Var.h0[i20].h;
                                pt0Var5.setItemAnimator(r10);
                                pt0Var6 = yu0Var.h0[i20].h;
                                pt0Var6.setClipToPadding(false);
                                pt0Var7 = yu0Var.h0[i20].h;
                                pt0Var7.setSectionsType(2);
                                pt0Var8 = yu0Var.h0[i20].h;
                                pt0Var8.setLayoutManager(ur0Var);
                                qt0 qt0Var3 = yu0Var.h0[i20];
                                pt0Var9 = qt0Var3.h;
                                qt0Var3.addView(pt0Var9, k7.b6.c(-1.0f, -1));
                                yu0Var.h0[i20].r = new pt0(context2, r10);
                                qt0 qt0Var4 = yu0Var.h0[i20];
                                pt0 pt0Var20 = qt0Var4.r;
                                yr0 yr0Var = new yr0(yu0Var);
                                qt0Var4.s = yr0Var;
                                pt0Var20.setLayoutManager(yr0Var);
                                qt0 qt0Var5 = yu0Var.h0[i20];
                                qt0Var5.addView(qt0Var5.r, k7.b6.c(-1.0f, -1));
                                yu0Var.h0[i20].r.setVisibility(8);
                                yu0Var.h0[i20].r.i(new zr0(tr0Var));
                                pt0Var10 = yu0Var.h0[i20].h;
                                pt0Var10.i(new as0(yu0Var, tr0Var));
                                pt0Var11 = yu0Var.h0[i20].h;
                                pt0Var11.setOnItemClickListener(new lh.b3(yu0Var, tr0Var, context2, j10, f6Var2, 2));
                                pt0Var12 = yu0Var.h0[i20].h;
                                pt0Var12.setOnScrollListener(new cs0(yu0Var, tr0Var, ur0Var));
                                pt0Var13 = yu0Var.h0[i20].h;
                                pt0Var13.setOnItemLongClickListener(new ds0(yu0Var, tr0Var));
                                if (i20 == 0 && i22 != -1) {
                                    ur0Var.h1(i22, i21);
                                }
                                pt0Var14 = yu0Var.h0[i20].h;
                                yu0Var.h0[i20].y = new es0(context2, pt0Var14);
                                yu0Var.h0[i20].y.setVisibility(8);
                                pt0Var15 = yu0Var.h0[i20].h;
                                pt0Var15.D0(yu0Var.h0[i20].y, k7.b6.c(-1.0f, -1));
                                yu0Var.h0[i20].v = new fs0(yu0Var, context2, tr0Var);
                                t00Var = yu0Var.h0[i20].v;
                                t00Var.g();
                                t00Var2 = yu0Var.h0[i20].v;
                                t00Var2.setClipToOutline(true);
                                t00Var3 = yu0Var.h0[i20].v;
                                t00Var3.setOutlineProvider(new gs0());
                                if (i20 == 0) {
                                    yu0Var.h0[i20].setVisibility(8);
                                }
                                qt0 qt0Var6 = yu0Var.h0[i20];
                                t00Var4 = qt0Var6.v;
                                qt0Var6.w = new hs0(yu0Var, context2, t00Var4);
                                zw0Var = yu0Var.h0[i20].w;
                                zw0Var.d(8, false);
                                zw0Var2 = yu0Var.h0[i20].w;
                                zw0Var2.setAnimateLayoutChange(true);
                                qt0 qt0Var7 = yu0Var.h0[i20];
                                zw0Var3 = qt0Var7.w;
                                qt0Var7.addView(zw0Var3, k7.b6.c(-1.0f, -1));
                                zw0Var4 = yu0Var.h0[i20].w;
                                zw0Var4.setOnTouchListener(new oh.d(23));
                                zw0Var5 = yu0Var.h0[i20].w;
                                zw0Var5.e(true, false);
                                zw0Var6 = yu0Var.h0[i20].w;
                                zw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                zw0Var7 = yu0Var.h0[i20].w;
                                zw0Var7.f.setVisibility(8);
                                zw0Var8 = yu0Var.h0[i20].w;
                                zw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                zw0Var9 = yu0Var.h0[i20].w;
                                zw0Var9.f.setVisibility(8);
                                zw0Var10 = yu0Var.h0[i20].w;
                                t00Var5 = yu0Var.h0[i20].v;
                                zw0Var10.addView(t00Var5, k7.b6.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                                pt0Var16 = yu0Var.h0[i20].h;
                                zw0Var11 = yu0Var.h0[i20].w;
                                pt0Var16.setEmptyView(zw0Var11);
                                pt0Var17 = yu0Var.h0[i20].h;
                                pt0Var17.m1(0, true);
                                qt0[] qt0VarArr2 = yu0Var.h0;
                                qt0 qt0Var8 = qt0VarArr2[i20];
                                pt0Var18 = qt0VarArr2[i20].h;
                                qt0Var8.B = new c2.y(pt0Var18, yu0Var.h0[i20].x);
                                i20++;
                                f6Var2 = f6Var;
                                i18 = i21;
                                i19 = i22;
                            }
                        }
                        i21 = i18;
                        i22 = i19;
                        tr0 tr0Var2 = new tr0(yu0Var, context2);
                        yu0Var.addView(tr0Var2, k7.b6.d(-1, -1.0f, 51, 0.0f, yu0Var.B0(), 0.0f, 0.0f));
                        if (i20 == 1) {
                        }
                        yu0Var.h0[i20] = tr0Var2;
                        ur0Var = new ur0(yu0Var, tr0Var2);
                        tr0Var2.x = ur0Var;
                        ur0Var.z1(new vr0(yu0Var, tr0Var2));
                        yu0Var.h0[i20].d = new f2.l();
                        yu0Var.h0[i20].d.n(280L);
                        yu0Var.h0[i20].d.o(nr.h);
                        qt0 qt0Var22 = yu0Var.h0[i20];
                        qt0Var22.d.m = false;
                        qt0Var22.h = new wr0(yu0Var, context2, tr0Var2, ur0Var);
                        pt0Var = yu0Var.h0[i20].h;
                        pt0Var.setFastScrollEnabled(1);
                        pt0Var2 = yu0Var.h0[i20].h;
                        pt0Var2.setScrollingTouchSlop(1);
                        pt0Var3 = yu0Var.h0[i20].h;
                        pt0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(f10));
                        pt0Var4 = yu0Var.h0[i20].h;
                        pt0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                        pt0Var5 = yu0Var.h0[i20].h;
                        pt0Var5.setItemAnimator(r10);
                        pt0Var6 = yu0Var.h0[i20].h;
                        pt0Var6.setClipToPadding(false);
                        pt0Var7 = yu0Var.h0[i20].h;
                        pt0Var7.setSectionsType(2);
                        pt0Var8 = yu0Var.h0[i20].h;
                        pt0Var8.setLayoutManager(ur0Var);
                        qt0 qt0Var32 = yu0Var.h0[i20];
                        pt0Var9 = qt0Var32.h;
                        qt0Var32.addView(pt0Var9, k7.b6.c(-1.0f, -1));
                        yu0Var.h0[i20].r = new pt0(context2, r10);
                        qt0 qt0Var42 = yu0Var.h0[i20];
                        pt0 pt0Var202 = qt0Var42.r;
                        yr0 yr0Var2 = new yr0(yu0Var);
                        qt0Var42.s = yr0Var2;
                        pt0Var202.setLayoutManager(yr0Var2);
                        qt0 qt0Var52 = yu0Var.h0[i20];
                        qt0Var52.addView(qt0Var52.r, k7.b6.c(-1.0f, -1));
                        yu0Var.h0[i20].r.setVisibility(8);
                        yu0Var.h0[i20].r.i(new zr0(tr0Var2));
                        pt0Var10 = yu0Var.h0[i20].h;
                        pt0Var10.i(new as0(yu0Var, tr0Var2));
                        pt0Var11 = yu0Var.h0[i20].h;
                        pt0Var11.setOnItemClickListener(new lh.b3(yu0Var, tr0Var2, context2, j10, f6Var2, 2));
                        pt0Var12 = yu0Var.h0[i20].h;
                        pt0Var12.setOnScrollListener(new cs0(yu0Var, tr0Var2, ur0Var));
                        pt0Var13 = yu0Var.h0[i20].h;
                        pt0Var13.setOnItemLongClickListener(new ds0(yu0Var, tr0Var2));
                        if (i20 == 0) {
                            ur0Var.h1(i22, i21);
                        }
                        pt0Var14 = yu0Var.h0[i20].h;
                        yu0Var.h0[i20].y = new es0(context2, pt0Var14);
                        yu0Var.h0[i20].y.setVisibility(8);
                        pt0Var15 = yu0Var.h0[i20].h;
                        pt0Var15.D0(yu0Var.h0[i20].y, k7.b6.c(-1.0f, -1));
                        yu0Var.h0[i20].v = new fs0(yu0Var, context2, tr0Var2);
                        t00Var = yu0Var.h0[i20].v;
                        t00Var.g();
                        t00Var2 = yu0Var.h0[i20].v;
                        t00Var2.setClipToOutline(true);
                        t00Var3 = yu0Var.h0[i20].v;
                        t00Var3.setOutlineProvider(new gs0());
                        if (i20 == 0) {
                        }
                        qt0 qt0Var62 = yu0Var.h0[i20];
                        t00Var4 = qt0Var62.v;
                        qt0Var62.w = new hs0(yu0Var, context2, t00Var4);
                        zw0Var = yu0Var.h0[i20].w;
                        zw0Var.d(8, false);
                        zw0Var2 = yu0Var.h0[i20].w;
                        zw0Var2.setAnimateLayoutChange(true);
                        qt0 qt0Var72 = yu0Var.h0[i20];
                        zw0Var3 = qt0Var72.w;
                        qt0Var72.addView(zw0Var3, k7.b6.c(-1.0f, -1));
                        zw0Var4 = yu0Var.h0[i20].w;
                        zw0Var4.setOnTouchListener(new oh.d(23));
                        zw0Var5 = yu0Var.h0[i20].w;
                        zw0Var5.e(true, false);
                        zw0Var6 = yu0Var.h0[i20].w;
                        zw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                        zw0Var7 = yu0Var.h0[i20].w;
                        zw0Var7.f.setVisibility(8);
                        zw0Var8 = yu0Var.h0[i20].w;
                        zw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        zw0Var9 = yu0Var.h0[i20].w;
                        zw0Var9.f.setVisibility(8);
                        zw0Var10 = yu0Var.h0[i20].w;
                        t00Var5 = yu0Var.h0[i20].v;
                        zw0Var10.addView(t00Var5, k7.b6.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                        pt0Var16 = yu0Var.h0[i20].h;
                        zw0Var11 = yu0Var.h0[i20].w;
                        pt0Var16.setEmptyView(zw0Var11);
                        pt0Var17 = yu0Var.h0[i20].h;
                        pt0Var17.m1(0, true);
                        qt0[] qt0VarArr22 = yu0Var.h0;
                        qt0 qt0Var82 = qt0VarArr22[i20];
                        pt0Var18 = qt0VarArr22[i20].h;
                        qt0Var82.B = new c2.y(pt0Var18, yu0Var.h0[i20].x);
                        i20++;
                        f6Var2 = f6Var;
                        i18 = i21;
                        i19 = i22;
                    }
                    view = yu0Var.T;
                    if (view != null) {
                        yu0Var.addView(view, k7.b6.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
                    }
                    org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context2);
                    yu0Var.H0 = v0Var;
                    v0Var.T((int) (System.currentTimeMillis() / 1000), false, false);
                    v0Var.setAlpha(0.0f);
                    v0Var.V(org.telegram.ui.ActionBar.j6.wc, org.telegram.ui.ActionBar.j6.kd);
                    v0Var.setTranslationY(-AndroidUtilities.dp(48.0f));
                    yu0Var.addView(v0Var, k7.b6.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                    N = yu0Var.N();
                    yu0Var2 = yu0Var;
                    if (!N) {
                        js jsVar2 = new js(context2);
                        yu0Var.M0 = jsVar2;
                        jsVar2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
                        pg.b b10 = aVar2.b(jsVar2, rg.b.m(f6Var));
                        b10.p(AndroidUtilities.dp(24.0f));
                        b10.o(AndroidUtilities.dp(7.0f));
                        jsVar2.setBlurredBackground(b10);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        yu0Var.N0 = frameLayout;
                        jsVar2.addView(frameLayout);
                        jsVar2.i(frameLayout, true, false);
                        jsVar2.setOnAnimatedHeightChangedListener(new uq0(yu0Var, 0));
                        js0 js0Var = new js0(yu0Var, context2, p2Var, this, f6Var);
                        yu0Var.O0 = js0Var;
                        frameLayout.addView(js0Var);
                        jsVar2.setCallFragmentContextView(js0Var);
                        yu0Var.addView(jsVar2, k7.b6.d(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
                        js0Var.setDelegate(new vq0(yu0Var));
                        pg.b b11 = aVar2.b(yu0Var.F0, rg.b.m(f6Var));
                        b11.p(AndroidUtilities.dp(18.0f));
                        b11.o(AndroidUtilities.dp(6.666f));
                        yu0Var.F0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                        yu0Var.F0.setClipToPadding(false);
                        yu0Var.F0.setBackground(r10);
                        yu0Var.F0.setBlurredBackground(b11);
                        yu0Var.F0.setOpen(false);
                        yu0Var.addView(yu0Var.F0, k7.b6.d(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
                        Context context3 = yu0Var.getContext();
                        org.telegram.ui.ActionBar.p2 p2Var4 = yu0Var.s1;
                        yu0 yu0Var5 = yu0Var;
                        ks0 ks0Var3 = new ks0(p2Var4.getCurrentAccount(), yu0Var.l0() ? 0L : yu0Var.g1, context3, p2Var4, f6Var, yu0Var5);
                        yu0 yu0Var6 = yu0Var5;
                        yu0Var6.G0 = ks0Var3;
                        ks0Var3.d(aVar2, rg.b.m(f6Var));
                        ks0Var3.setShown(0.0f);
                        yu0Var6.addView(ks0Var3, k7.b6.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                        yu0Var6.addView(yu0Var6.y0, k7.b6.e(-1, 48, 51));
                        yu0Var2 = yu0Var6;
                    }
                    yu0Var2.v1(false);
                    yu0Var2.m1(false);
                    if (yu0Var2.U0[0] >= 0) {
                        yu0Var2.z0(false);
                    }
                    sr0Var = yu0Var2.T;
                    if (sr0Var != null && i12 > 0) {
                        sr0Var.setInitialTabId(i12);
                    }
                    yu0Var2.Z1 = new ah(yu0Var2, 2);
                }
                f6Var2 = f6Var;
                r10 = 0;
                yu0Var = yu0Var3;
                yu0Var.setWillNotDraw(false);
                i18 = 0;
                i19 = -1;
                i20 = 0;
                while (true) {
                    qt0VarArr = yu0Var.h0;
                    if (i20 >= qt0VarArr.length) {
                    }
                    qt0 qt0Var622 = yu0Var.h0[i20];
                    t00Var4 = qt0Var622.v;
                    qt0Var622.w = new hs0(yu0Var, context2, t00Var4);
                    zw0Var = yu0Var.h0[i20].w;
                    zw0Var.d(8, false);
                    zw0Var2 = yu0Var.h0[i20].w;
                    zw0Var2.setAnimateLayoutChange(true);
                    qt0 qt0Var722 = yu0Var.h0[i20];
                    zw0Var3 = qt0Var722.w;
                    qt0Var722.addView(zw0Var3, k7.b6.c(-1.0f, -1));
                    zw0Var4 = yu0Var.h0[i20].w;
                    zw0Var4.setOnTouchListener(new oh.d(23));
                    zw0Var5 = yu0Var.h0[i20].w;
                    zw0Var5.e(true, false);
                    zw0Var6 = yu0Var.h0[i20].w;
                    zw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                    zw0Var7 = yu0Var.h0[i20].w;
                    zw0Var7.f.setVisibility(8);
                    zw0Var8 = yu0Var.h0[i20].w;
                    zw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    zw0Var9 = yu0Var.h0[i20].w;
                    zw0Var9.f.setVisibility(8);
                    zw0Var10 = yu0Var.h0[i20].w;
                    t00Var5 = yu0Var.h0[i20].v;
                    zw0Var10.addView(t00Var5, k7.b6.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                    pt0Var16 = yu0Var.h0[i20].h;
                    zw0Var11 = yu0Var.h0[i20].w;
                    pt0Var16.setEmptyView(zw0Var11);
                    pt0Var17 = yu0Var.h0[i20].h;
                    pt0Var17.m1(0, true);
                    qt0[] qt0VarArr222 = yu0Var.h0;
                    qt0 qt0Var822 = qt0VarArr222[i20];
                    pt0Var18 = qt0VarArr222[i20].h;
                    qt0Var822.B = new c2.y(pt0Var18, yu0Var.h0[i20].x);
                    i20++;
                    f6Var2 = f6Var;
                    i18 = i21;
                    i19 = i22;
                }
                view = yu0Var.T;
                if (view != null) {
                }
                org.telegram.ui.Cells.v0 v0Var2 = new org.telegram.ui.Cells.v0(context2);
                yu0Var.H0 = v0Var2;
                v0Var2.T((int) (System.currentTimeMillis() / 1000), false, false);
                v0Var2.setAlpha(0.0f);
                v0Var2.V(org.telegram.ui.ActionBar.j6.wc, org.telegram.ui.ActionBar.j6.kd);
                v0Var2.setTranslationY(-AndroidUtilities.dp(48.0f));
                yu0Var.addView(v0Var2, k7.b6.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                N = yu0Var.N();
                yu0Var2 = yu0Var;
                if (!N) {
                }
                yu0Var2.v1(false);
                yu0Var2.m1(false);
                if (yu0Var2.U0[0] >= 0) {
                }
                sr0Var = yu0Var2.T;
                if (sr0Var != null) {
                    sr0Var.setInitialTabId(i12);
                }
                yu0Var2.Z1 = new ah(yu0Var2, 2);
            }
            profileTab = chatFull2.main_tab;
        }
        c3 = 5;
        if (i11 != 14) {
        }
        yu0Var3.V0 = i11;
        yu0Var3.M0(i11);
        yu0Var3.a1 = chatFull2;
        yu0Var3.b1 = userFull;
        if (chatFull2 != null) {
        }
        yu0Var3.g1 = j10;
        i14 = 0;
        while (true) {
            nu0VarArr = yu0Var3.q1;
            if (i14 < nu0VarArr.length) {
            }
            i14++;
        }
        yu0Var3.s1 = p2Var;
        yu0Var3.D = p2Var.getActionBar();
        yu0Var3.j1[0] = yu0Var3.S0() > 0 ? SharedConfig.mediaColumnsCount : yu0Var3.S0();
        yu0Var3.j1[1] = yu0Var3.S0() > 0 ? SharedConfig.storiesColumnsCount : yu0Var3.S0();
        yu0Var3.D1 = p2Var.getNotificationCenter().createObserversGroup(yu0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
        while (i15 < 10) {
        }
        yu0Var3.P0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        yu0Var3.S0 = false;
        yu0Var3.T0 = null;
        ks0Var = yu0Var3.G0;
        if (ks0Var != null) {
        }
        yu0Var3.R0 = false;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        yu0Var3.v0 = drawable2;
        drawable2.setColorFilter(new PorterDuffColorFilter(yu0Var3.h0(org.telegram.ui.ActionBar.j6.b7), PorterDuff.Mode.MULTIPLY));
        ns0 ns0Var3 = yu0Var3.F0;
        if (ns0Var3 == null) {
        }
        ns0 ns0Var22 = new ns0(yu0Var3, context, yu0Var3.C1);
        i16 = yu0Var3.V0;
        if (i16 != -1) {
        }
        ns0Var22.V = 320L;
        int i322 = org.telegram.ui.ActionBar.j6.Fh;
        int i332 = org.telegram.ui.ActionBar.j6.Eh;
        ns0Var22.I = i322;
        ns0Var22.J = i332;
        ns0Var22.e();
        ns0Var22.setUseMinimalWidth(true);
        ns0Var22.setDelegate(new ps0(yu0Var3));
        yu0Var3.F0 = ns0Var22;
        while (i17 >= 0) {
        }
        yu0Var3.X0 = 0;
        yu0Var3.K0.clear();
        hu0Var = yu0Var3.O;
        if (hu0Var != null) {
        }
        if (!(yu0Var3 instanceof a40)) {
        }
        ImageView imageView3 = new ImageView(context);
        yu0Var3.o0 = imageView3;
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        imageView3.setTranslationY(AndroidUtilities.dp(10.0f));
        imageView3.setVisibility(4);
        if (yu0Var3.q0()) {
        }
        f10 = 2.0f;
        context2 = context;
        imageView3.setOnClickListener(new bt0(yu0Var3, j10, f6Var, context));
        w0Var = yu0Var3.k0;
        if (w0Var != null) {
        }
        yu0Var3.u0 = 0;
        org.telegram.ui.ActionBar.p2 p2Var22 = yu0Var3.s1;
        if (p2Var22 == null) {
        }
        z9 z9Var2 = new z9(context2, qv0Var);
        yu0Var3.y0 = z9Var2;
        z9Var2.setBackgroundColor(yu0Var3.h0(org.telegram.ui.ActionBar.j6.a7));
        z9Var2.setAlpha(0.0f);
        z9Var2.setClickable(true);
        z9Var2.setVisibility(4);
        ImageView imageView22 = new ImageView(context2);
        yu0Var3.z0 = imageView22;
        imageView22.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.i2 i2Var2 = new org.telegram.ui.ActionBar.i2(true);
        yu0Var3.A0 = i2Var2;
        imageView22.setImageDrawable(i2Var2);
        int i352 = org.telegram.ui.ActionBar.j6.y8;
        i2Var2.a(yu0Var3.h0(i352));
        int i362 = org.telegram.ui.ActionBar.j6.z8;
        imageView22.setBackground(org.telegram.ui.ActionBar.j6.e0(yu0Var3.h0(i362), 1));
        imageView22.setContentDescription(LocaleController.getString("Close", R.string.Close));
        z9Var2.addView(imageView22, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        yu0Var3.K0.add(imageView22);
        imageView22.setOnClickListener(new wq0(yu0Var3, 0));
        NumberTextView numberTextView2 = new NumberTextView(context2);
        yu0Var3.x0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(AndroidUtilities.bold());
        numberTextView2.setTextColor(yu0Var3.h0(i352));
        z9Var2.addView(numberTextView2, k7.b6.m(1.0f, 0, -1, 18, 0, 0));
        yu0Var3.K0.add(numberTextView2);
        if (!DialogObject.isEncryptedDialog(yu0Var3.g1)) {
        }
        org.telegram.ui.ActionBar.w0 w0Var62 = new org.telegram.ui.ActionBar.w0(context2, yu0Var3.h0(i362), yu0Var3.h0(i352), false);
        yu0Var3.i0 = w0Var62;
        w0Var62.setIcon(R.drawable.msg_delete);
        w0Var62.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        w0Var62.setDuplicateParentStateEnabled(false);
        z9Var2.addView(w0Var62, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        yu0Var3.K0.add(w0Var62);
        w0Var62.setOnClickListener(new wq0(yu0Var3, 5));
        yu0Var3.E = new ct0(yu0Var3, context2);
        yu0Var3.F = new su0(yu0Var3, context2);
        yu0Var3.H = new lu0(yu0Var3, context2, 1);
        yu0Var3.I = new lu0(yu0Var3, context2, 2);
        yu0Var3.J = new lu0(yu0Var3, context2, 4);
        yu0Var3.K = new eu0(yu0Var3, context2, yu0Var3.s1.getCurrentAccount(), yu0Var3.s1.getResourceProvider());
        yu0Var3.L = new lt0(yu0Var3, context2);
        yu0Var3.d0 = new tt0(yu0Var3, context2, 1);
        yu0Var3.e0 = new tt0(yu0Var3, context2, 4);
        yu0Var3.f0 = new tt0(yu0Var3, context2, 3);
        yu0Var3.g0 = new ot0(yu0Var3, context2);
        yu0Var3.M = new it0(yu0Var3, context2);
        yu0Var3.N = new gt0(yu0Var3, context2);
        yu0Var3.O = new hu0(yu0Var3, context2);
        yu0Var3.P = new ju0(yu0Var3, context2);
        if (!yu0Var3.v0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", yu0Var3.s1.getUserConfig().getClientUserId());
            bundle2.putInt("chatMode", 3);
            dt0 dt0Var2 = new dt0(yu0Var3, context2, yu0Var3.s1.getParentLayout(), bundle2);
            yu0Var3.Q = dt0Var2;
            long j122 = yu0Var3.g1;
            org.telegram.ui.yn ynVar2 = dt0Var2.a;
            ynVar2.a4 = j122;
            ynVar2.Ma = true;
            dt0Var2.setClipToOutline(true);
            dt0Var2.setOutlineProvider(new et0());
        }
        ht0 ht0Var2 = new ht0(yu0Var3, context2);
        yu0Var3.U = ht0Var2;
        if (yu0Var3.C == 0) {
        }
        yu0Var3.W = new ft0(yu0Var3, context2);
        yu0Var3.V = new f2.e0(new lr0(yu0Var3));
        yu0Var3.a0 = new vu0(yu0Var3, context2, false);
        yu0Var3.b0 = new mr0(yu0Var3, context2);
        yu0Var3.c0 = new vu0(yu0Var3, context2, true);
        yu0Var3.G = new mu0(yu0Var3, context2);
        if (!yu0Var3.r0()) {
        }
        f6Var2 = f6Var;
        r10 = 0;
        yu0Var = yu0Var3;
        yu0Var.setWillNotDraw(false);
        i18 = 0;
        i19 = -1;
        i20 = 0;
        while (true) {
            qt0VarArr = yu0Var.h0;
            if (i20 >= qt0VarArr.length) {
            }
            qt0 qt0Var6222 = yu0Var.h0[i20];
            t00Var4 = qt0Var6222.v;
            qt0Var6222.w = new hs0(yu0Var, context2, t00Var4);
            zw0Var = yu0Var.h0[i20].w;
            zw0Var.d(8, false);
            zw0Var2 = yu0Var.h0[i20].w;
            zw0Var2.setAnimateLayoutChange(true);
            qt0 qt0Var7222 = yu0Var.h0[i20];
            zw0Var3 = qt0Var7222.w;
            qt0Var7222.addView(zw0Var3, k7.b6.c(-1.0f, -1));
            zw0Var4 = yu0Var.h0[i20].w;
            zw0Var4.setOnTouchListener(new oh.d(23));
            zw0Var5 = yu0Var.h0[i20].w;
            zw0Var5.e(true, false);
            zw0Var6 = yu0Var.h0[i20].w;
            zw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
            zw0Var7 = yu0Var.h0[i20].w;
            zw0Var7.f.setVisibility(8);
            zw0Var8 = yu0Var.h0[i20].w;
            zw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            zw0Var9 = yu0Var.h0[i20].w;
            zw0Var9.f.setVisibility(8);
            zw0Var10 = yu0Var.h0[i20].w;
            t00Var5 = yu0Var.h0[i20].v;
            zw0Var10.addView(t00Var5, k7.b6.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
            pt0Var16 = yu0Var.h0[i20].h;
            zw0Var11 = yu0Var.h0[i20].w;
            pt0Var16.setEmptyView(zw0Var11);
            pt0Var17 = yu0Var.h0[i20].h;
            pt0Var17.m1(0, true);
            qt0[] qt0VarArr2222 = yu0Var.h0;
            qt0 qt0Var8222 = qt0VarArr2222[i20];
            pt0Var18 = qt0VarArr2222[i20].h;
            qt0Var8222.B = new c2.y(pt0Var18, yu0Var.h0[i20].x);
            i20++;
            f6Var2 = f6Var;
            i18 = i21;
            i19 = i22;
        }
        view = yu0Var.T;
        if (view != null) {
        }
        org.telegram.ui.Cells.v0 v0Var22 = new org.telegram.ui.Cells.v0(context2);
        yu0Var.H0 = v0Var22;
        v0Var22.T((int) (System.currentTimeMillis() / 1000), false, false);
        v0Var22.setAlpha(0.0f);
        v0Var22.V(org.telegram.ui.ActionBar.j6.wc, org.telegram.ui.ActionBar.j6.kd);
        v0Var22.setTranslationY(-AndroidUtilities.dp(48.0f));
        yu0Var.addView(v0Var22, k7.b6.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        N = yu0Var.N();
        yu0Var2 = yu0Var;
        if (!N) {
        }
        yu0Var2.v1(false);
        yu0Var2.m1(false);
        if (yu0Var2.U0[0] >= 0) {
        }
        sr0Var = yu0Var2.T;
        if (sr0Var != null) {
        }
        yu0Var2.Z1 = new ah(yu0Var2, 2);
    }

    public static kt0 M(int i10, long j10, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        kt0 kt0Var = new kt0(context, f6Var);
        TextView textView = kt0Var.a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return kt0Var;
        }
        if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return kt0Var;
        }
        if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return kt0Var;
        }
        if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return kt0Var;
        }
        if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return kt0Var;
        }
        if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return kt0Var;
        }
        ImageView imageView = kt0Var.b;
        if (i10 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
            return kt0Var;
        }
        if (i10 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return kt0Var;
    }

    public static TLRPC.ProfileTab d0(int i10, boolean z4) {
        if (i10 != 8 && i10 != 14 && !z4) {
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

    public static void g(yu0 yu0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        ey eyVar = new ey(yu0Var, i10, storyItem, 8);
        nh.t6 storiesController = yu0Var.getStoriesController();
        long j10 = yu0Var.g1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j10, arrayList);
        qc.a0(yu0Var.s1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), eyVar).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public nh.t6 getStoriesController() {
        return MessagesController.getInstance(this.s1.getCurrentAccount()).getStoriesController();
    }

    public static /* synthetic */ void h(yu0 yu0Var, TL_stories.StoryItem storyItem) {
        yu0Var.getStoriesController().o0(yu0Var.g1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        qc.a0(yu0Var.s1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(yu0 yu0Var, long j10, int i10, String str) {
        nh.h6 B = yu0Var.getStoriesController().B(j10, true);
        int i11 = B.a;
        int c3 = B.c(i10);
        if (c3 == -1) {
            return;
        }
        ((nh.m6) B.h.get(c3)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(yu0 yu0Var, TL_stories.StoryItem storyItem, nh.m6 m6Var) {
        yu0Var.getStoriesController().c(m6Var.a, yu0Var.g1, storyItem);
        AndroidUtilities.runOnUIThread(new i80(19, yu0Var, m6Var), 100L);
    }

    public static void m(yu0 yu0Var, HashSet hashSet, TL_stories.StoryItem storyItem, o70 o70Var, nh.m6 m6Var) {
        String formatString;
        long j10 = yu0Var.g1;
        if (hashSet.contains(Integer.valueOf(m6Var.a))) {
            yu0Var.getStoriesController().c(m6Var.a, j10, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, m6Var.b);
        } else {
            nh.t6 storiesController = yu0Var.getStoriesController();
            int i10 = m6Var.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j10, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, m6Var.b);
        }
        qc.a0(yu0Var.s1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        o70Var.u();
    }

    public static void n(yu0 yu0Var, long j10, int i10) {
        nh.h6 B = yu0Var.getStoriesController().B(j10, true);
        int i11 = B.a;
        int c3 = B.c(i10);
        if (c3 == -1) {
            return;
        }
        nh.m6 m6Var = (nh.m6) B.h.remove(c3);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_deleteAlbum.album_id = m6Var.a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
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

    public static boolean p0(int i10) {
        return i10 == 8 || i10 == 9 || w0(i10);
    }

    public static void q(qt0 qt0Var, nu0[] nu0VarArr, boolean z4) {
        i80 i80Var;
        if (!z4) {
            if (qt0Var.D == null || (i80Var = qt0Var.E) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(i80Var);
            qt0Var.E.run();
            qt0Var.E = null;
            qt0Var.D = null;
            return;
        }
        if (SharedConfig.fastScrollHintCount <= 0 || qt0Var.D != null || qt0Var.F || qt0Var.h.getFastScroll() == null || !qt0Var.h.getFastScroll().U || qt0Var.h.getFastScroll().getVisibility() != 0 || nu0VarArr[0].e() < 50) {
            return;
        }
        SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
        qt0Var.F = true;
        Context context = qt0Var.getContext();
        sq0 sq0Var = new sq0(context);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        int i10 = org.telegram.ui.ActionBar.j6.pf;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        sq0Var.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.qf, false)));
        sq0Var.addView(textView, k7.b6.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        rq0 rq0Var = new rq0(context);
        rq0Var.a = new Random();
        Paint paint = new Paint(1);
        rq0Var.b = paint;
        Paint paint2 = new Paint(1);
        rq0Var.c = paint2;
        rq0Var.f = 1.0f;
        rq0Var.h = 0.0f;
        paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        Paint paint3 = new Paint();
        rq0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        rq0Var.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        sq0Var.addView(rq0Var, k7.b6.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        qt0Var.D = sq0Var;
        qt0Var.addView(sq0Var, k7.b6.c(-2.0f, -2));
        qt0Var.D.setAlpha(0.0f);
        qt0Var.D.setScaleX(0.8f);
        qt0Var.D.setScaleY(0.8f);
        qt0Var.D.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        qt0Var.invalidate();
        i80 i80Var2 = new i80(18, qt0Var, sq0Var);
        qt0Var.E = i80Var2;
        AndroidUtilities.runOnUIThread(i80Var2, 4000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(yu0 yu0Var) {
        yu0 yu0Var2;
        ArrayList arrayList;
        int i10;
        int i11;
        Bitmap bitmap;
        long j10 = yu0Var.g1;
        nu0[] nu0VarArr = yu0Var.q1;
        qt0 W = yu0Var.W(0);
        if (W != null && W.getMeasuredHeight() > 0 && W.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(W.getMeasuredWidth(), W.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e) {
                FileLog.e(e);
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                yu0Var.E1 = true;
                W.h.draw(new Canvas(bitmap2));
                View view = new View(W.getContext());
                view.setBackground(new BitmapDrawable(bitmap2));
                W.addView(view);
                yu0Var2 = yu0Var;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new vs(yu0Var2, view, W, bitmap2, 1)).start();
                W.h.setAlpha(0.0f);
                W.h.animate().alpha(1.0f).setUpdateListener(new i70(W, 20)).setDuration(200L).start();
                qu0 qu0Var = yu0Var2.r1;
                int[] iArr = qu0Var.c;
                arrayList = qu0Var.n[0].a;
                nu0 nu0Var = nu0VarArr[0];
                int[] iArr2 = nu0Var.f;
                iArr2[1] = 0;
                i10 = nu0Var.q;
                if (i10 != 0) {
                    iArr2[0] = iArr[0];
                } else if (i10 == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                nu0Var.h = false;
                yu0Var2.y0(0, !DialogObject.isEncryptedDialog(j10) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                yu0Var2.z0(false);
                yu0Var2.A1.R();
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j10);
                for (i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    nu0 nu0Var2 = nu0VarArr[0];
                    int i12 = nu0Var2.q;
                    if (i12 == 0) {
                        nu0Var2.a(messageObject, 0, false, isEncryptedDialog);
                    } else if (i12 == 1) {
                        if (messageObject.isPhoto()) {
                            nu0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                        }
                    } else if (!messageObject.isPhoto()) {
                        nu0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                    }
                }
            }
        }
        yu0Var2 = yu0Var;
        qu0 qu0Var2 = yu0Var2.r1;
        int[] iArr3 = qu0Var2.c;
        arrayList = qu0Var2.n[0].a;
        nu0 nu0Var3 = nu0VarArr[0];
        int[] iArr22 = nu0Var3.f;
        iArr22[1] = 0;
        i10 = nu0Var3.q;
        if (i10 != 0) {
        }
        nu0Var3.h = false;
        yu0Var2.y0(0, !DialogObject.isEncryptedDialog(j10) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        yu0Var2.z0(false);
        yu0Var2.A1.R();
        boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j10);
        while (i11 < arrayList.size()) {
        }
    }

    public static void t(yu0 yu0Var, int i10, boolean z4) {
        qt0[] qt0VarArr = yu0Var.h0;
        if (qt0VarArr[0].C == i10) {
            return;
        }
        qt0 qt0Var = qt0VarArr[1];
        qt0Var.C = i10;
        qt0Var.setVisibility(0);
        yu0Var.k0();
        yu0Var.m1(true);
        yu0Var.e1 = z4;
        yu0Var.L0();
        yu0Var.A(!yu0Var.s0(i10), true);
        yu0Var.q1(true);
    }

    public static int u(yu0 yu0Var, f2.o0 o0Var) {
        if (o0Var == yu0Var.W) {
            return 8;
        }
        if (o0Var == yu0Var.b0) {
            return 9;
        }
        for (xu0 xu0Var : yu0Var.V1.values()) {
            if (xu0Var.c == o0Var) {
                return xu0Var.a;
            }
        }
        return -1;
    }

    public static int v(yu0 yu0Var, f2.o0 o0Var) {
        if (o0Var == yu0Var.a0) {
            return 8;
        }
        if (o0Var == yu0Var.c0) {
            return 9;
        }
        for (xu0 xu0Var : yu0Var.V1.values()) {
            if (xu0Var.d == o0Var) {
                return xu0Var.a;
            }
        }
        return -1;
    }

    public static boolean w0(int i10) {
        return (i10 & (-65536)) == 65536;
    }

    public final void A(boolean z4, boolean z10) {
        jj0 jj0Var = this.p0;
        if (jj0Var == null || this.S1 == z4) {
            return;
        }
        this.S1 = z4;
        if (z4 || jj0Var.getAnimatedDrawable().Y >= 20) {
            jj0Var.getAnimatedDrawable().N(this.S1 ? 50 : 100);
        } else {
            jj0Var.getAnimatedDrawable().N(0);
        }
        if (z10) {
            jj0Var.getAnimatedDrawable().start();
        } else {
            jj0Var.getAnimatedDrawable().K(jj0Var.getAnimatedDrawable().f);
        }
    }

    public final void A0(int i10) {
        int i11;
        nu0[] nu0VarArr = this.q1;
        if (i10 == 0) {
            int i12 = nu0VarArr[0].q;
            i11 = i12 == 1 ? 6 : i12 == 2 ? 7 : 0;
        } else {
            i11 = i10 == 1 ? 1 : i10 == 2 ? 2 : i10 == 4 ? 4 : i10 == 5 ? 5 : 3;
        }
        nu0VarArr[i10].g = true;
        org.telegram.ui.ActionBar.p2 p2Var = this.s1;
        p2Var.getMediaDataController().loadMedia(this.g1, 50, 0, nu0VarArr[i10].k, i11, this.C, 1, p2Var.getClassGuid(), nu0VarArr[i10].p, null, null);
    }

    public final void B(int i10) {
        int i11;
        qt0 W = W(this.m1);
        this.s = -1;
        if (W != null) {
            W.h.B0();
            this.n1 = i10;
            W.r.setVisibility(0);
            if (p0(this.m1)) {
                W.r.setAdapter(l1(this.m1));
            } else {
                W.r.setAdapter(this.F);
            }
            pt0 pt0Var = W.r;
            int paddingLeft = pt0Var.getPaddingLeft();
            pt0 pt0Var2 = W.r;
            int Z = Z(W.C);
            pt0Var2.a3 = Z;
            int paddingRight = W.r.getPaddingRight();
            pt0 pt0Var3 = W.r;
            int Y = Y(v0());
            pt0Var3.b3 = Y;
            pt0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.s.y1(i10);
            W.r.a0();
            int i12 = 0;
            while (true) {
                qt0[] qt0VarArr = this.h0;
                if (i12 >= qt0VarArr.length) {
                    break;
                }
                qt0 qt0Var = qt0VarArr[i12];
                if (qt0Var != null && ((i11 = qt0Var.C) == 0 || p0(i11))) {
                    AndroidUtilities.updateVisibleRows(qt0VarArr[i12].h);
                }
                i12++;
            }
            int i13 = 1;
            this.l1 = true;
            if (this.m1 == 0) {
                this.q1[0].g(true);
            }
            this.k1 = 0.0f;
            X0();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F1.lock();
            ofFloat.addUpdateListener(new ms0(this, W, i13));
            ofFloat.addListener(new r20(this, p0(W.C) ? 1 : 0, i10, i13));
            ofFloat.setInterpolator(nr.f);
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
        long j10 = this.g1;
        org.telegram.ui.ActionBar.p2 p2Var = this.s1;
        if (!r02) {
            return v0() || (p2Var != null && p2Var.getMessagesController().getStoriesController().h(j10));
        }
        TLRPC.User user = MessagesController.getInstance(p2Var.getCurrentAccount()).getUser(Long.valueOf(j10));
        return user != null && user.bot && user.bot_can_edit;
    }

    public final void C0(int i10, View view) {
        nr0 nr0Var;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z4;
        TLRPC.User user2;
        hu0 hu0Var = this.O;
        SparseArray[] sparseArrayArr = this.W0;
        org.telegram.ui.ActionBar.p2 p2Var = this.s1;
        final int i11 = 0;
        if (i10 != 101) {
            if (i10 == 100) {
                if (this.b1 != null && p2Var.getMessagesController().isUserNoForwards(this.b1)) {
                    k40 k40Var = this.B1;
                    if (k40Var != null) {
                        k40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                        this.B1.f(view, true);
                        return;
                    }
                    return;
                }
                if (this.a1 != null) {
                    TLRPC.Chat chat2 = p2Var.getMessagesController().getChat(Long.valueOf(this.a1.id));
                    if (p2Var.getMessagesController().isChatNoForwards(chat2)) {
                        k40 k40Var2 = this.B1;
                        if (k40Var2 != null) {
                            k40Var2.setText((!ChatObject.isChannel(chat2) || chat2.megagroup) ? LocaleController.getString(R.string.ForwardsRestrictedInfoGroup) : LocaleController.getString(R.string.ForwardsRestrictedInfoChannel));
                            this.B1.f(view, true);
                            return;
                        }
                        return;
                    }
                }
                if (j0()) {
                    k40 k40Var3 = this.B1;
                    if (k40Var3 != null) {
                        k40Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                        this.B1.f(view, true);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("canSelectTopics", true);
                bundle.putInt("dialogsType", 3);
                org.telegram.ui.oy oyVar = new org.telegram.ui.oy(bundle);
                oyVar.z2 = new vq0(this);
                p2Var.presentFragment(oyVar);
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
                    TLRPC.Chat chat3 = p2Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                    if (chat3 != null && chat3.migrated_to != null) {
                        bundle2.putLong("migrated_to", dialogId);
                        dialogId = -chat3.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -dialogId);
                }
                bundle2.putInt("message_id", messageObject.getId());
                bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                org.telegram.ui.xn xnVar = new org.telegram.ui.xn(bundle2);
                xnVar.I7 = messageObject.getId();
                long j10 = this.C;
                if (j10 != 0) {
                    ag.f.a(xnVar, MessagesStorage.TopicKey.of(dialogId, j10));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                p2Var.presentFragment(xnVar, false);
                return;
            }
            if (i10 == 103 || i10 == 104) {
                if (getClosestTab() == 8) {
                    ft0 ft0Var = this.W;
                    if (ft0Var == null || ft0Var.s == null) {
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
                SavedMessagesController savedMessagesController = p2Var.getMessagesController().getSavedMessagesController();
                ArrayList<Long> arrayList2 = new ArrayList<>();
                for (int i13 = 0; i13 < savedMessagesController.allDialogs.size(); i13++) {
                    long j11 = savedMessagesController.allDialogs.get(i13).dialogId;
                    if (hu0Var.w.contains(Long.valueOf(j11))) {
                        arrayList2.add(Long.valueOf(j11));
                    }
                }
                if (savedMessagesController.updatePinned(arrayList2, i10 == 103, true)) {
                    int i14 = 0;
                    while (true) {
                        qt0[] qt0VarArr = this.h0;
                        if (i14 >= qt0VarArr.length) {
                            break;
                        }
                        qt0 qt0Var = qt0VarArr[i14];
                        if (qt0Var.C == 11) {
                            qt0Var.x.h1(0, 0);
                            break;
                        }
                        i14++;
                    }
                } else {
                    p2Var.showDialog(new eg.v0(33, p2Var.getCurrentAccount(), getContext(), p2Var, null));
                }
                L(true);
                return;
            }
            return;
        }
        boolean p02 = p0(getSelectedTab());
        org.telegram.ui.ActionBar.f6 f6Var = this.C1;
        if (p02 || getSelectedTab() == 13) {
            if (sparseArrayArr[0] != null) {
                if (!r0() || (nr0Var = this.R) == null || nr0Var.getCurrentList() == null) {
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
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    d2Var.O = string;
                    d2Var.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.Components.br0
                        public final /* synthetic */ yu0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.c2
                        public final void i(org.telegram.ui.ActionBar.d2 d2Var2, int i16) {
                            switch (i11) {
                                case 0:
                                    yu0 yu0Var = this.b;
                                    org.telegram.ui.ActionBar.p2 p2Var2 = yu0Var.s1;
                                    nh.t6 storiesController = p2Var2.getMessagesController().getStoriesController();
                                    long j12 = yu0Var.g1;
                                    ArrayList arrayList4 = arrayList3;
                                    storiesController.s(j12, arrayList4);
                                    qc.a0(p2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList4.size(), new Object[0])).j();
                                    yu0Var.L(false);
                                    break;
                                default:
                                    yu0 yu0Var2 = this.b;
                                    yu0Var2.getClass();
                                    int i17 = 0;
                                    while (true) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (i17 >= arrayList5.size()) {
                                            yu0Var2.L(true);
                                            break;
                                        } else {
                                            yu0Var2.s1.getMessagesController().deleteSavedDialog(((Long) arrayList5.get(i17)).longValue());
                                            i17++;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new kh0(7));
                    d2Var.show();
                    d2Var.h();
                    return;
                }
                nh.d6 currentList = nr0Var.getCurrentList();
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
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                d2Var2.O = string2;
                d2Var2.Q = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList4.size(), new Object[0]);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new androidx.car.app.utils.a(this, currentList, arrayList4, 26));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new kh0(6));
                d2Var2.show();
                d2Var2.h();
                return;
            }
            return;
        }
        if (getSelectedTab() != 11) {
            long j12 = this.g1;
            if (DialogObject.isEncryptedDialog(j12)) {
                encryptedChat = org.telegram.messenger.y3.n(p2Var.getMessagesController(), j12);
                user = null;
                chat = null;
            } else if (DialogObject.isUserDialog(j12)) {
                user = p2Var.getMessagesController().getUser(Long.valueOf(j12));
                chat = null;
                encryptedChat = null;
            } else {
                chat = p2Var.getMessagesController().getChat(Long.valueOf(-j12));
                user = null;
                encryptedChat = null;
            }
            z4.z(p2Var, user, chat, encryptedChat, null, this.Z0, null, this.W0, null, 0, 0, null, new uq0(this, r15 ? 1 : 0), null, this.C1);
            return;
        }
        SavedMessagesController savedMessagesController2 = p2Var.getMessagesController().getSavedMessagesController();
        final ArrayList arrayList5 = new ArrayList();
        for (int i17 = 0; i17 < savedMessagesController2.allDialogs.size(); i17++) {
            long j13 = savedMessagesController2.allDialogs.get(i17).dialogId;
            if (hu0Var.w.contains(Long.valueOf(j13))) {
                arrayList5.add(Long.valueOf(j13));
            }
        }
        String str = "";
        if (arrayList5.isEmpty()) {
            z4 = false;
        } else {
            Long l10 = (Long) arrayList5.get(0);
            long longValue = l10.longValue();
            z4 = longValue == p2Var.getUserConfig().getClientUserId();
            if (longValue < 0) {
                TLRPC.Chat chat4 = p2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat4 != null) {
                    str = chat4.title;
                }
            } else if (longValue >= 0 && (user2 = p2Var.getMessagesController().getUser(l10)) != null) {
                str = UserObject.isAnonymous(user2) ? LocaleController.getString(R.string.AnonymousForward) : UserObject.getUserName(user2);
            }
        }
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, f6Var);
        String formatString = arrayList5.size() == 1 ? LocaleController.formatString(z4 ? R.string.ClearHistoryMyNotesTitle : R.string.ClearHistoryTitleSingle2, str) : LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList5.size(), new Object[0]);
        org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
        d2Var3.O = formatString;
        d2Var3.Q = arrayList5.size() == 1 ? LocaleController.formatString(z4 ? R.string.ClearHistoryMyNotesMessage : R.string.ClearHistoryMessageSingle, str) : LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList5.size(), new Object[0]);
        String string3 = LocaleController.getString(R.string.Remove);
        final int i18 = r15 ? 1 : 0;
        alertDialog$Builder3.k(string3, new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.Components.br0
            public final /* synthetic */ yu0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void i(org.telegram.ui.ActionBar.d2 d2Var22, int i162) {
                switch (i18) {
                    case 0:
                        yu0 yu0Var = this.b;
                        org.telegram.ui.ActionBar.p2 p2Var2 = yu0Var.s1;
                        nh.t6 storiesController = p2Var2.getMessagesController().getStoriesController();
                        long j122 = yu0Var.g1;
                        ArrayList arrayList42 = arrayList5;
                        storiesController.s(j122, arrayList42);
                        qc.a0(p2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList42.size(), new Object[0])).j();
                        yu0Var.L(false);
                        break;
                    default:
                        yu0 yu0Var2 = this.b;
                        yu0Var2.getClass();
                        int i172 = 0;
                        while (true) {
                            ArrayList arrayList52 = arrayList5;
                            if (i172 >= arrayList52.size()) {
                                yu0Var2.L(true);
                                break;
                            } else {
                                yu0Var2.s1.getMessagesController().deleteSavedDialog(((Long) arrayList52.get(i172)).longValue());
                                i172++;
                            }
                        }
                }
            }
        });
        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
        p2Var.showDialog(d2Var3);
        TextView textView = (TextView) d2Var3.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        }
    }

    public boolean D() {
        return !(this instanceof a40);
    }

    public final boolean E() {
        qt0 qt0Var;
        qt0[] qt0VarArr = this.h0;
        if (qt0VarArr == null || (qt0Var = qt0VarArr[0]) == null) {
            return false;
        }
        if (this.h1 && p0(qt0Var.C)) {
            return false;
        }
        boolean p02 = p0(qt0VarArr[0].C);
        int i10 = this.j1[p02 ? 1 : 0];
        return i10 != X(p02 ? 1 : 0, i10, false);
    }

    public final void F() {
        ns0 ns0Var = this.F0;
        if (ns0Var.d(ns0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = ns0Var.getFirstTabId();
        ns0Var.setInitialTabId(firstTabId);
        this.h0[0].C = firstTabId;
        m1(false);
    }

    public final void F0() {
        nh.l6 l6Var;
        nh.l6 l6Var2;
        this.D1.removeAllObservers();
        ft0 ft0Var = this.W;
        if (ft0Var != null && (l6Var2 = ft0Var.s) != null && l6Var2 != null) {
            l6Var2.z(ft0Var.v);
        }
        mr0 mr0Var = this.b0;
        if (mr0Var != null && (l6Var = mr0Var.s) != null && l6Var != null) {
            l6Var.z(mr0Var.v);
        }
        Iterator it = this.V1.values().iterator();
        while (it.hasNext()) {
            wu0 wu0Var = ((xu0) it.next()).c;
            nh.l6 l6Var3 = wu0Var.s;
            if (l6Var3 != null && l6Var3 != null) {
                l6Var3.z(wu0Var.v);
            }
        }
    }

    public final void G(qt0 qt0Var, sl0 sl0Var, f2.i0 i0Var) {
        int i10;
        int i11;
        f2.l1 K;
        nh.l6 l6Var;
        if (this.l1 || this.G1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (sl0Var.getFastScroll() == null || !sl0Var.getFastScroll().n || currentTimeMillis - qt0Var.a >= 300) {
            qt0Var.a = currentTimeMillis;
            if ((this.S0 && this.R0 && qt0Var.C != 11) || qt0Var.C == 7) {
                return;
            }
            int L0 = i0Var.L0();
            int abs = L0 == -1 ? 0 : Math.abs(i0Var.N0() - L0) + 1;
            int h = sl0Var.getAdapter() == null ? 0 : sl0Var.getAdapter().h();
            int i12 = qt0Var.C;
            int[] iArr = this.j1;
            nu0[] nu0VarArr = this.q1;
            if (i12 == 0 || i12 == 1 || i12 == 2 || i12 == 4) {
                h = nu0VarArr[i12].d() + nu0VarArr[i12].a.size();
                nu0 nu0Var = nu0VarArr[i12];
                if (nu0Var.h && nu0Var.e.size() > 2 && qt0Var.C == 0 && nu0VarArr[i12].a.size() != 0) {
                    float f10 = i12 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((sl0Var.getMeasuredHeight() / (sl0Var.getMeasuredWidth() / f10)) * f10 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((vt0) nu0VarArr[i12].e.get(1)).b) {
                        measuredHeight = ((vt0) nu0VarArr[i12].e.get(1)).b;
                    }
                    if ((L0 > h && L0 - h > measuredHeight) || ((i10 = L0 + abs) < nu0VarArr[i12].m && nu0VarArr[0].m - i10 > measuredHeight)) {
                        ey eyVar = new ey(this, i12, sl0Var, 10);
                        this.G1 = eyVar;
                        AndroidUtilities.runOnUIThread(eyVar);
                        return;
                    }
                }
            }
            int i13 = qt0Var.C;
            if (i13 == 7) {
                return;
            }
            if (p0(i13)) {
                vu0 k12 = k1(qt0Var.C);
                if (k12 == null || (l6Var = k12.s) == null || L0 + abs <= l6Var.i() - iArr[1]) {
                    return;
                }
                k12.P();
                return;
            }
            int i14 = qt0Var.C;
            if (i14 == 6) {
                if (abs > 0) {
                    it0 it0Var = this.M;
                    boolean z4 = it0Var.h;
                    ArrayList arrayList = it0Var.d;
                    if (z4 || it0Var.e || arrayList.isEmpty() || L0 + abs < h - 5) {
                        return;
                    }
                    it0.E(it0Var, ((TLRPC.Chat) kh.a2.i(1, arrayList)).id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.p2 p2Var = this.s1;
            if (i14 == 11) {
                int i15 = -1;
                for (int i16 = 0; i16 < qt0Var.h.getChildCount(); i16++) {
                    View childAt = qt0Var.h.getChildAt(i16);
                    qt0Var.h.getClass();
                    i15 = Math.max(RecyclerView.R(childAt), i15);
                }
                f2.o0 adapter = qt0Var.h.getAdapter();
                ju0 ju0Var = this.P;
                if (adapter != ju0Var) {
                    if (i15 + 1 >= p2Var.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                        p2Var.getMessagesController().getSavedMessagesController().loadDialogs(false);
                        return;
                    }
                    return;
                } else {
                    if (i15 + 1 < ju0Var.h.size() + ju0Var.e.size() || ju0Var.s || ju0Var.r) {
                        return;
                    }
                    ju0Var.r = true;
                    ju0Var.F();
                    return;
                }
            }
            if (i14 == 10 || i14 == 12 || i14 == 13 || i14 == 14) {
                return;
            }
            int i17 = i14 == 0 ? 3 : i14 == 5 ? 10 : 6;
            int i18 = i14 == 15 ? 8 : i14;
            if (abs + L0 > h - i17 || nu0VarArr[i18].o) {
                nu0 nu0Var2 = nu0VarArr[i18];
                if (!nu0Var2.g) {
                    if (i14 == 0) {
                        int i19 = nu0VarArr[0].q;
                        i11 = i19 == 1 ? 6 : i19 == 2 ? 7 : 0;
                    } else {
                        i11 = i14 == 1 ? 1 : i14 == 2 ? 2 : i14 == 4 ? 4 : i14 == 5 ? 5 : i14 == 15 ? 8 : 3;
                    }
                    boolean[] zArr = nu0Var2.i;
                    if (!zArr[0]) {
                        nu0Var2.g = true;
                        p2Var.getMediaDataController().loadMedia(this.g1, 50, nu0VarArr[i18].j[0], 0, i11, this.C, 1, p2Var.getClassGuid(), nu0VarArr[i18].p, null, null);
                    } else if (this.Z0 != 0 && !zArr[1]) {
                        nu0Var2.g = true;
                        p2Var.getMediaDataController().loadMedia(this.Z0, 50, nu0VarArr[i18].j[1], 0, i11, this.C, 1, p2Var.getClassGuid(), nu0VarArr[i18].p, null, null);
                    }
                }
            }
            int i20 = nu0VarArr[i18].m;
            if (i18 == 0) {
                i20 = this.E.L(0);
            }
            if (L0 - i20 < i17 + 1) {
                nu0 nu0Var3 = nu0VarArr[i18];
                if (!nu0Var3.g && !nu0Var3.l && !nu0Var3.o) {
                    A0(qt0Var.C);
                }
            }
            qt0 qt0Var2 = this.h0[0];
            if (qt0Var2.h == sl0Var) {
                int i21 = qt0Var2.C;
                if ((i21 != 0 && i21 != 5) || L0 == -1 || (K = sl0Var.K(L0)) == null) {
                    return;
                }
                int i22 = K.f;
                if (i22 == 0 || i22 == 12) {
                    View view = K.a;
                    boolean z10 = view instanceof org.telegram.ui.Cells.s7;
                    org.telegram.ui.Cells.v0 v0Var = this.H0;
                    if (!z10) {
                        if (view instanceof org.telegram.ui.Cells.e2) {
                            v0Var.T(((org.telegram.ui.Cells.e2) view).getDate(), false, true);
                        }
                    } else {
                        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                        MessageObject messageObject = s7Var.e <= 0 ? null : s7Var.b[0];
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
        if (messageObject == null || this.l1) {
            return;
        }
        sr0 sr0Var = this.T;
        if (sr0Var == null || !sr0Var.w) {
            int i12 = 0;
            i12 = 0;
            String str2 = null;
            if (this.z1) {
                int i13 = 8;
                if (i11 == 8 && !C()) {
                    return;
                }
                char c3 = messageObject.getDialogId() == this.g1 ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = this.W0;
                if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                    sparseArrayArr[c3].remove(messageObject.getId());
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.X0--;
                    }
                } else {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        return;
                    }
                    sparseArrayArr[c3].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.X0++;
                    }
                }
                D0(sparseArrayArr[0]);
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    b1(false);
                } else {
                    this.x0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    this.i0.setVisibility(this.X0 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.w0 w0Var = this.r0;
                    if (w0Var != null) {
                        w0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.q0;
                    if (w0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        w0Var2.setVisibility(i13);
                    }
                    u1();
                }
                this.Y0 = false;
                if (view instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) view).b(sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.s7) {
                    ((org.telegram.ui.Cells.s7) view).b(0, sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0);
                } else if (view instanceof org.telegram.ui.Cells.l7) {
                    ((org.telegram.ui.Cells.l7) view).f(sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) view).e(sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    ((org.telegram.ui.Cells.e2) view).c(sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.r7) {
                    ((org.telegram.ui.Cells.r7) view).i(sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0, true);
                }
            } else {
                xr0 xr0Var = this.o1;
                nu0[] nu0VarArr = this.q1;
                org.telegram.ui.ActionBar.p2 p2Var = this.s1;
                if (i11 == 0) {
                    nu0 nu0Var = nu0VarArr[i11];
                    int i14 = i10 - nu0Var.m;
                    if (i14 >= 0 && i14 < nu0Var.a.size()) {
                        PhotoViewer.t1().K2(null, p2Var, null);
                        PhotoViewer.t1().a2(nu0VarArr[i11].a, i14, this.g1, this.Z0, this.C, xr0Var);
                    }
                } else if (i11 == 2 || i11 == 4) {
                    if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).a();
                    }
                } else if (i11 == 5) {
                    PhotoViewer.t1().K2(null, p2Var, null);
                    int indexOf = nu0VarArr[i11].a.indexOf(messageObject);
                    if (indexOf < 0) {
                        PhotoViewer.t1().a2(org.telegram.messenger.y3.m(messageObject), 0, 0L, 0L, 0L, xr0Var);
                    } else {
                        PhotoViewer.t1().a2(nu0VarArr[i11].a, indexOf, this.g1, this.Z0, this.C, xr0Var);
                    }
                } else if (i11 == 1) {
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                        TLRPC.Document document = messageObject.getDocument();
                        if (i7Var.D) {
                            if (messageObject.canPreviewDocument()) {
                                PhotoViewer.t1().K2(null, p2Var, null);
                                int indexOf2 = nu0VarArr[i11].a.indexOf(messageObject);
                                if (indexOf2 < 0) {
                                    PhotoViewer.t1().a2(org.telegram.messenger.y3.m(messageObject), 0, 0L, 0L, 0L, xr0Var);
                                    return;
                                } else {
                                    PhotoViewer.t1().a2(nu0VarArr[i11].a, indexOf2, this.g1, this.Z0, this.C, xr0Var);
                                    return;
                                }
                            }
                            AndroidUtilities.openDocument(messageObject, p2Var.getParentActivity(), p2Var);
                        } else if (i7Var.C) {
                            p2Var.getFileLoader().cancelLoadFile(document);
                            i7Var.f(true);
                        } else {
                            MessageObject message = i7Var.getMessage();
                            message.putInDownloadsStore = true;
                            p2Var.getFileLoader().loadFile(document, message, 0, 0);
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
                                LaunchActivity launchActivity = LaunchActivity.D1;
                                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.D1.P().k(messageObject) == null) {
                                    p2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str3 = webPage.embed_url;
                            if (str3 != null && str3.length() != 0) {
                                pu.I(p2Var, messageObject, this.o1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                return;
                            }
                            str = webPage.url;
                        }
                        if (str == null) {
                            ArrayList arrayList = ((org.telegram.ui.Cells.l7) view).B;
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
                    vu0 k12 = k1(i11);
                    nh.l6 l6Var = k12 != null ? k12.s : null;
                    if (l6Var == null) {
                        return;
                    }
                    nh.i9 orCreateStoryViewer = p2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int id2 = messageObject.getId();
                    nh.c7 a10 = nh.c7.a(this.h0[0].h);
                    a10.e = new fv(l6Var, 18);
                    if ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).p1) {
                        i12 = AndroidUtilities.dp(68.0f);
                    }
                    a10.s += i12;
                    orCreateStoryViewer.C(context, id2, l6Var, a10);
                }
            }
            p1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean H(MotionEvent motionEvent) {
        nr0 nr0Var;
        qt0[] qt0VarArr = this.h0;
        int i10 = qt0VarArr[0].C;
        if (i10 == 13 && (nr0Var = this.R) != null) {
            View currentView = nr0Var.n.getCurrentView();
            if (currentView instanceof oh.r) {
                oh.r rVar = (oh.r) currentView;
                oh.l lVar = rVar.v;
                oh.i iVar = rVar.f;
                if (rVar.a != null && rVar.getParent() != null) {
                    if (!rVar.b || rVar.H) {
                        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                            if (rVar.I && !rVar.H && motionEvent.getPointerCount() == 2) {
                                rVar.M = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                rVar.N = 1.0f;
                                rVar.K = motionEvent.getPointerId(0);
                                rVar.L = motionEvent.getPointerId(1);
                                iVar.I0(false);
                                iVar.cancelLongPress();
                                iVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) rVar.getParent();
                                rVar.R = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - rVar.getX());
                                int y10 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - rVar.getY());
                                int i11 = rVar.R;
                                Rect rect = rVar.S;
                                rVar.P = -1;
                                int i12 = y10 + iVar.U2;
                                for (int i13 = 0; i13 < iVar.getChildCount(); i13++) {
                                    View childAt = iVar.getChildAt(i13);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i11, i12)) {
                                        rVar.P = RecyclerView.S(childAt);
                                        rVar.Q = childAt.getTop();
                                    }
                                }
                                rVar.J = true;
                            }
                            if (motionEvent.getActionMasked() == 0) {
                                if ((motionEvent.getY() - ((View) rVar.getParent()).getY()) - rVar.getY() > 0.0f) {
                                    rVar.I = true;
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 2 && (rVar.H || rVar.J)) {
                            int i14 = -1;
                            int i15 = -1;
                            for (int i16 = 0; i16 < motionEvent.getPointerCount(); i16++) {
                                if (rVar.K == motionEvent.getPointerId(i16)) {
                                    i14 = i16;
                                }
                                if (rVar.L == motionEvent.getPointerId(i16)) {
                                    i15 = i16;
                                }
                            }
                            if (i14 == -1 || i15 == -1) {
                                rVar.I = false;
                                rVar.J = false;
                                rVar.H = false;
                                rVar.a();
                                return false;
                            }
                            float hypot = ((float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14))) / rVar.M;
                            rVar.N = hypot;
                            if (!rVar.H && (hypot > 1.01f || hypot < 0.99f)) {
                                rVar.H = true;
                                boolean z4 = hypot > 1.0f;
                                rVar.O = z4;
                                rVar.b(z4);
                            }
                            if (rVar.H) {
                                boolean z10 = rVar.O;
                                if ((!z10 || rVar.N >= 1.0f) && (z10 || rVar.N <= 1.0f)) {
                                    rVar.c = Math.max(0.0f, Math.min(1.0f, z10 ? org.telegram.messenger.y3.a(2.0f, rVar.N, 1.0f, 1.0f) : (1.0f - rVar.N) / 0.5f));
                                } else {
                                    rVar.c = 0.0f;
                                }
                                float f10 = rVar.c;
                                if (f10 == 1.0f || f10 == 0.0f) {
                                    if (f10 == 1.0f) {
                                        int i17 = rVar.e;
                                        int ceil = (((int) Math.ceil(rVar.P / rVar.e)) * i17) + ((int) ((rVar.T.D.w1 / (iVar.getMeasuredWidth() - ((int) (iVar.getMeasuredWidth() / rVar.e)))) * (i17 - 1)));
                                        if (ceil >= lVar.h()) {
                                            ceil = lVar.h() - 1;
                                        }
                                        rVar.P = ceil;
                                    }
                                    rVar.a();
                                    if (rVar.c == 0.0f) {
                                        rVar.O = !rVar.O;
                                    }
                                    rVar.b(rVar.O);
                                    rVar.M = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                iVar.invalidate();
                            }
                        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((rVar.K == motionEvent.getPointerId(0) && rVar.L == motionEvent.getPointerId(1)) || (rVar.K == motionEvent.getPointerId(1) && rVar.L == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && rVar.H) {
                            rVar.J = false;
                            rVar.I = false;
                            rVar.H = false;
                            rVar.a();
                        }
                        return rVar.H;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i10 == 0 || p0(i10)) && getParent() != null) {
            if (!this.l1 || this.a) {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (this.b && !this.a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f = motionEvent.getPointerId(1);
                        qt0VarArr[0].h.I0(false);
                        qt0VarArr[0].h.cancelLongPress();
                        qt0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - qt0VarArr[0].getX());
                        int y11 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - qt0VarArr[0].getY());
                        int i18 = this.w;
                        this.s = -1;
                        int i19 = y11 + qt0VarArr[0].h.U2;
                        if (getY() != 0.0f && this.B == 1) {
                            i19 = 0;
                        }
                        for (int i20 = 0; i20 < qt0VarArr[0].h.getChildCount(); i20++) {
                            View childAt2 = qt0VarArr[0].h.getChildAt(i20);
                            Rect rect2 = this.x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i18, i19)) {
                                qt0VarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.A1.T() && this.s == -1) {
                            this.s = (int) (((this.j1[p0(qt0VarArr[0].C) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i18 / qt0VarArr[0].h.getMeasuredWidth(), 0.0f))) + qt0VarArr[0].x.L0());
                            this.v = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - qt0VarArr[0].getY() > 0.0f) {
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
                        boolean z11 = hypot2 > 1.0f;
                        this.r = z11;
                        e1(z11);
                    }
                    if (this.a) {
                        boolean z12 = this.r;
                        if ((!z12 || this.n >= 1.0f) && (z12 || this.n <= 1.0f)) {
                            this.k1 = Math.max(0.0f, Math.min(1.0f, z12 ? org.telegram.messenger.y3.a(2.0f, this.n, 1.0f, 1.0f) : (1.0f - this.n) / 0.5f));
                        } else {
                            this.k1 = 0.0f;
                        }
                        float f11 = this.k1;
                        if (f11 == 1.0f || f11 == 0.0f) {
                            f2.o0 k12 = p0(this.m1) ? k1(this.m1) : this.E;
                            if (this.k1 == 1.0f) {
                                int i24 = this.n1;
                                int ceil2 = (((int) Math.ceil(this.s / this.n1)) * i24) + ((int) ((this.w1 / (qt0VarArr[0].h.getMeasuredWidth() - ((int) (qt0VarArr[0].h.getMeasuredWidth() / this.n1)))) * (i24 - 1)));
                                if (ceil2 >= k12.h()) {
                                    ceil2 = k12.h() - 1;
                                }
                                this.s = ceil2;
                            }
                            T();
                            if (this.k1 == 0.0f) {
                                this.r = !this.r;
                            }
                            e1(this.r);
                            this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        }
                        qt0VarArr[0].h.invalidate();
                        qt0 qt0Var = qt0VarArr[0];
                        if (qt0Var.D != null) {
                            qt0Var.invalidate();
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

    public final boolean H0(MessageObject messageObject, View view, int i10, boolean z4) {
        sr0 sr0Var;
        final TL_stories.StoryItem storyItem;
        ft0 ft0Var;
        nh.l6 l6Var;
        final int i11 = 0;
        if (!this.z1) {
            org.telegram.ui.ActionBar.p2 p2Var = this.s1;
            if (p2Var.getParentActivity() != null && messageObject != null && ((sr0Var = this.T) == null || !sr0Var.w)) {
                AndroidUtilities.hideKeyboard(p2Var.getParentActivity().getCurrentFocus());
                long j10 = this.g1;
                int i12 = 8;
                final int i13 = 1;
                if (!z4 || (!(w0(getClosestTab()) || getClosestTab() == 8) || this.z1)) {
                    char c3 = messageObject.getDialogId() == j10 ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.W0;
                    sparseArrayArr[c3].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.X0++;
                    }
                    this.i0.setVisibility(this.X0 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.w0 w0Var = this.r0;
                    if (w0Var != null) {
                        w0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.q0;
                    if (w0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        w0Var2.setVisibility(i12);
                    }
                    this.x0.a(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.K0;
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
                    this.Y0 = false;
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.s7) {
                        ((org.telegram.ui.Cells.s7) view).b(i10, true);
                    } else if (view instanceof org.telegram.ui.Cells.l7) {
                        ((org.telegram.ui.Cells.l7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.e2) {
                        ((org.telegram.ui.Cells.e2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.r7) {
                        ((org.telegram.ui.Cells.r7) view).i(true, true);
                    }
                    if (!this.z1) {
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
                    o70 I = o70.I(p2Var, view);
                    o70 J = I.J();
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.rt0(I, 25), false);
                    J.k();
                    o70.f(J, getStoriesController().B(j10, true), hashSet, true, new hp(this, storyItem2, I, 16), new gg.c1(this, hashSet, storyItem2, I, 11));
                    I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new kh.z2(I, J, 7), false);
                    I.k();
                    I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new cg.v1(this, messageObject, view, i10, 22), false);
                    final int i15 = 3;
                    if (w02) {
                        int h12 = h1(getClosestTab());
                        String w10 = getStoriesController().w(h12, j10);
                        I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new hm(this, h12, 5), false);
                        storyItem = storyItem2;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new cg.v1(this, h12, storyItem, w10, 23), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (ft0Var = this.W) != null && (l6Var = ft0Var.s) != null) {
                            if (l6Var.m(storyItem.id)) {
                                I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                yu0 yu0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yu0Var.getContext(), 0, yu0Var.C1);
                                                alertDialog$Builder.a.O = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cr0(yu0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new kh0(8));
                                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                                d2Var.show();
                                                d2Var.h();
                                                break;
                                            case 1:
                                                yu0 yu0Var2 = this;
                                                yu0Var2.getClass();
                                                yu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                yu0 yu0Var3 = this;
                                                yu0Var3.getClass();
                                                yu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                yu0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final int i16 = 2;
                                I.c(R.drawable.chats_pin, LocaleController.getString(R.string.StoriesAlbumMenuPin), new Runnable() { // from class: org.telegram.ui.Components.xq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                yu0 yu0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yu0Var.getContext(), 0, yu0Var.C1);
                                                alertDialog$Builder.a.O = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cr0(yu0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new kh0(8));
                                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                                d2Var.show();
                                                d2Var.h();
                                                break;
                                            case 1:
                                                yu0 yu0Var2 = this;
                                                yu0Var2.getClass();
                                                yu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                yu0 yu0Var3 = this;
                                                yu0Var3.getClass();
                                                yu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                yu0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        I.c(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable() { // from class: org.telegram.ui.Components.xq0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        yu0 yu0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yu0Var.getContext(), 0, yu0Var.C1);
                                        alertDialog$Builder.a.O = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.a.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cr0(yu0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new kh0(8));
                                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                        d2Var.show();
                                        d2Var.h();
                                        break;
                                    case 1:
                                        yu0 yu0Var2 = this;
                                        yu0Var2.getClass();
                                        yu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                        break;
                                    case 2:
                                        yu0 yu0Var3 = this;
                                        yu0Var3.getClass();
                                        yu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                        break;
                                    default:
                                        yu0.h(this, storyItem);
                                        break;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.Components.xq0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    yu0 yu0Var = this;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yu0Var.getContext(), 0, yu0Var.C1);
                                    alertDialog$Builder.a.O = LocaleController.getString(R.string.DeleteStoryTitle);
                                    alertDialog$Builder.a.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cr0(yu0Var, storyItem));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new kh0(8));
                                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                                    d2Var.show();
                                    d2Var.h();
                                    break;
                                case 1:
                                    yu0 yu0Var2 = this;
                                    yu0Var2.getClass();
                                    yu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                    break;
                                case 2:
                                    yu0 yu0Var3 = this;
                                    yu0Var3.getClass();
                                    yu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                    break;
                                default:
                                    yu0.h(this, storyItem);
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
        qt0[] qt0VarArr = this.h0;
        qt0 qt0Var = qt0VarArr[0];
        if (qt0Var == null || qt0VarArr[1] == null) {
            return;
        }
        float f10 = 0.0f;
        sr0 sr0Var = this.T;
        if (sr0Var != null) {
            char c3 = (!p0(qt0Var.C) || qt0VarArr[0].C == 9) ? (char) 0 : (char) 1;
            if (c3 == (qt0VarArr[1].getVisibility() == 0 ? (!p0(qt0VarArr[1].C) || qt0VarArr[1].C == 9) ? (char) 0 : (char) 1 : c3)) {
                abs = c3 != 0 ? 1.0f : 0.0f;
                sr0Var.setTranslationX(c3 != 0 ? 0.0f : qt0VarArr[0].getMeasuredWidth());
            } else {
                sr0Var.setTranslationX(qt0VarArr[c3 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(sr0Var.getTranslationX()) / sr0Var.getMeasuredWidth());
            }
            float f11 = 0.0f;
            for (int i10 = 0; i10 < qt0VarArr.length; i10++) {
                if (qt0VarArr[i10].getVisibility() == 0) {
                    wr0 wr0Var = qt0VarArr[i10].h;
                    View childAt = wr0Var.getChildCount() == 0 ? null : wr0Var.getChildAt(0);
                    f11 += Utilities.clamp01(1.0f - (qt0VarArr[i10].getTranslationX() / qt0VarArr[i10].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - wr0Var.getPaddingTop() : wr0Var.getChildCount() == 0 ? 0.0f : -AndroidUtilities.dp(48.0f));
                }
            }
            float clamp01 = Utilities.clamp01(1.0f - ((-f11) / AndroidUtilities.dpf2(48.0f)));
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
            sr0Var.setAlpha(clamp01);
            sr0Var.setScaleX(lerp);
            sr0Var.setScaleY(lerp);
            sr0Var.setTranslationY(this.H1 + f11);
            f10 = abs;
        }
        K();
        if (this.R1 != f10) {
            this.R1 = f10;
            o0();
            invalidate();
        }
    }

    public boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z4, View view) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J() {
        AnimatorSet animatorSet;
        if (!this.d1) {
            return false;
        }
        boolean z4 = this.f1;
        qt0[] qt0VarArr = this.h0;
        if (!z4) {
            if (Math.abs(qt0VarArr[1].getTranslationX()) < 1.0f) {
                qt0VarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.e1 ? -1 : 1));
                qt0VarArr[1].setTranslationX(0.0f);
                animatorSet = this.c1;
                if (animatorSet != null) {
                }
                this.d1 = false;
            }
            M0(getTabProgress());
            return this.d1;
        }
        if (Math.abs(qt0VarArr[0].getTranslationX()) < 1.0f) {
            qt0VarArr[0].setTranslationX(0.0f);
            qt0VarArr[1].setTranslationX(qt0VarArr[0].getMeasuredWidth() * (this.e1 ? 1 : -1));
            animatorSet = this.c1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.c1 = null;
            }
            this.d1 = false;
        }
        M0(getTabProgress());
        return this.d1;
    }

    public final void J0(float f10) {
        qt0[] qt0VarArr = this.h0;
        if (f10 != 1.0f || qt0VarArr[1].getVisibility() == 0) {
            if (this.e1) {
                qt0VarArr[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                qt0VarArr[1].setTranslationX(qt0VarArr[0].getMeasuredWidth() - (qt0VarArr[0].getMeasuredWidth() * f10));
            } else {
                qt0VarArr[0].setTranslationX(r3.getMeasuredWidth() * f10);
                qt0VarArr[1].setTranslationX((qt0VarArr[0].getMeasuredWidth() * f10) - qt0VarArr[0].getMeasuredWidth());
            }
            M0(getTabProgress());
            float a02 = a0(f10);
            this.m0 = a02;
            this.o0.setVisibility((a02 == 0.0f || !D() || q0()) ? 4 : 0);
            org.telegram.ui.ActionBar.w0 w0Var = this.k0;
            if (w0Var == null || D()) {
                this.l0 = b0(f10);
                t1();
            } else {
                w0Var.setVisibility(v0() ? 8 : 4);
                this.l0 = 0.0f;
            }
            q1(false);
            if (f10 == 1.0f) {
                qt0 qt0Var = qt0VarArr[0];
                qt0VarArr[0] = qt0VarArr[1];
                qt0VarArr[1] = qt0Var;
                qt0Var.setVisibility(8);
                if (w0Var != null && this.u0 == 2) {
                    w0Var.setVisibility(v0() ? 8 : 4);
                }
                this.u0 = 0;
                f1();
            }
        }
    }

    public final void K() {
        js jsVar = this.M0;
        if (jsVar != null) {
            sr0 sr0Var = this.T;
            float f10 = 0.0f;
            if (sr0Var != null) {
                f10 = 0.0f + (sr0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(sr0Var.getTranslationX() / sr0Var.getMeasuredWidth())));
            }
            jsVar.setTranslationY(this.H1 + f10);
        }
    }

    public final boolean L(boolean z4) {
        SparseArray[] sparseArrayArr;
        if (!this.z1) {
            return false;
        }
        int i10 = 1;
        while (true) {
            sparseArrayArr = this.W0;
            if (i10 < 0) {
                break;
            }
            sparseArrayArr[i10].clear();
            i10--;
        }
        this.X0 = 0;
        D0(sparseArrayArr[0]);
        nr0 nr0Var = this.R;
        if (nr0Var != null) {
            nr0Var.h();
            nr0Var.j();
        }
        b1(false);
        r1(z4);
        hu0 hu0Var = this.O;
        if (hu0Var != null) {
            hu0Var.w.clear();
        }
        return true;
    }

    public void L0() {
        boolean z4 = v0() || q0();
        tu0 tu0Var = this.b0.w;
        if (tu0Var != null) {
            tu0Var.b(z4 && getClosestTab() == 9);
        }
        tu0 tu0Var2 = this.W.w;
        if (tu0Var2 != null) {
            tu0Var2.b(z4 && getClosestTab() == 8);
        }
        for (xu0 xu0Var : this.V1.values()) {
            wu0 wu0Var = xu0Var.c;
            if (wu0Var.s != null) {
                wu0Var.w.b(z4 && getClosestTab() == xu0Var.a);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.k0;
        if (w0Var != null) {
            ks0 ks0Var = this.G0;
            w0Var.setSearchFieldHint(LocaleController.getString((ks0Var != null && ks0Var.a() && getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
        I();
    }

    public void M0(float f10) {
        E0();
    }

    public boolean N() {
        return this instanceof a40;
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        qt0[] qt0VarArr = this.h0;
        motionEvent.offsetLocation(x10 - qt0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - qt0VarArr[0].getY()) - qt0VarArr[0].h.getFastScroll().getY());
        return qt0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void O0(org.telegram.ui.ActionBar.p2 p2Var, long j10, int i10) {
        new org.telegram.ui.e71(p2Var, j10, this.j1[1], new lc(this, j10, i10)).show();
    }

    public void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void P0(org.telegram.ui.ActionBar.p2 p2Var, long j10, int i10) {
        z4.v0(p2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j10))), LocaleController.getString(R.string.Delete), true, new lh.a9(this, j10, i10, 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.h0;
            if (i10 >= qt0VarArr.length) {
                return;
            }
            qt0 qt0Var = qt0VarArr[i10];
            if (qt0Var != null && qt0Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < qt0VarArr[i10].h.getChildCount(); i11++) {
                    View childAt = qt0VarArr[i10].h.getChildAt(i11);
                    if (childAt.getY() < AndroidUtilities.dp(100.0f) + qt0VarArr[i10].h.U2) {
                        int save = canvas.save();
                        canvas.translate(childAt.getX() + qt0VarArr[i10].getX(), childAt.getY() + qt0VarArr[i10].h.getY() + qt0VarArr[i10].getY() + getY());
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

    public final void Q0(org.telegram.ui.ActionBar.p2 p2Var, long j10, int i10) {
        String w10 = getStoriesController().w(i10, j10);
        Context context = p2Var.getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = p2Var.getResourceProvider();
        k3.d dVar = new k3.d(this, j10, i10);
        Pattern pattern = z4.a;
        z4.R(context, p2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w10, 12, LocaleController.getString(R.string.Rename), resourceProvider, dVar);
    }

    public final boolean R(int i10) {
        nu0[] nu0VarArr = this.r1.n;
        if (nu0VarArr == null) {
            return false;
        }
        nu0[] nu0VarArr2 = this.q1;
        if (i10 == 0) {
            nu0 nu0Var = nu0VarArr2[i10];
            if (!nu0Var.h) {
                int[] iArr = nu0Var.f;
                int[] iArr2 = nu0VarArr[i10].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = nu0VarArr2[i10].f;
            int[] iArr4 = nu0VarArr[i10].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        nu0VarArr2[i10].a.addAll(nu0VarArr[i10].a);
        nu0VarArr2[i10].c.addAll(nu0VarArr[i10].c);
        for (Map.Entry entry : nu0VarArr[i10].d.entrySet()) {
            nu0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            nu0VarArr2[i10].b[i11] = nu0VarArr[i10].b[i11].clone();
            nu0 nu0Var2 = nu0VarArr2[i10];
            int[] iArr5 = nu0Var2.j;
            nu0 nu0Var3 = nu0VarArr[i10];
            iArr5[i11] = nu0Var3.j[i11];
            nu0Var2.i[i11] = nu0Var3.i[i11];
        }
        nu0VarArr2[i10].e.addAll(nu0VarArr[i10].e);
        return !nu0VarArr[i10].a.isEmpty();
    }

    public final void R0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.p2 p2Var = this.s1;
        if (shouldShowUrlInAlert) {
            z4.q0(p2Var, str, true, true);
        } else {
            af.g.s(p2Var.getParentActivity(), str);
        }
    }

    public final void S(int i10, sl0 sl0Var, boolean z4) {
        ArrayList arrayList = this.q1[i10].e;
        int L0 = ((f2.i0) sl0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            vt0 vt0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (L0 <= ((vt0) arrayList.get(i11)).b) {
                        vt0Var = (vt0) arrayList.get(i11);
                        break;
                    }
                    i11++;
                }
                if (vt0Var == null) {
                    vt0Var = (vt0) kh.a2.i(1, arrayList);
                }
            }
            if (vt0Var != null) {
                y0(i10, vt0Var.d, vt0Var.b + 1, z4);
            }
        }
    }

    public int S0() {
        return -1;
    }

    public final void T() {
        qt0[] qt0VarArr;
        qt0 qt0Var;
        int i10;
        f2.o0 adapter;
        if (this.l1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                qt0VarArr = this.h0;
                if (i12 >= qt0VarArr.length) {
                    qt0Var = null;
                    break;
                }
                qt0Var = qt0VarArr[i12];
                if (qt0Var.C == this.m1) {
                    break;
                } else {
                    i12++;
                }
            }
            if (qt0Var != null) {
                boolean p02 = p0(qt0Var.C);
                float f10 = this.k1;
                nu0[] nu0VarArr = this.q1;
                if (f10 != 1.0f) {
                    if (f10 == 0.0f) {
                        this.l1 = false;
                        if (this.m1 == 0) {
                            nu0VarArr[0].g(false);
                        }
                        qt0Var.r.setVisibility(8);
                        qt0Var.h.invalidate();
                        return;
                    }
                    boolean z4 = f10 > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z4 ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new ms0(this, qt0Var, i11));
                    ofFloat.addListener(new org.telegram.ui.aj(this, z4, p02 ? 1 : 0, qt0Var));
                    ofFloat.setInterpolator(nr.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.l1 = false;
                int i13 = this.n1;
                int[] iArr = this.j1;
                iArr[p02 ? 1 : 0] = i13;
                if (!p02) {
                    SharedConfig.setMediaColumnsCount(i13);
                } else if (c0(qt0Var.C) >= 5) {
                    SharedConfig.setStoriesColumnsCount(this.n1);
                }
                for (int i14 = 0; i14 < qt0VarArr.length; i14++) {
                    qt0 qt0Var2 = qt0VarArr[i14];
                    if (qt0Var2 != null && qt0Var2.h != null && (((i10 = qt0Var2.C) == 0 || p0(i10)) && (adapter = qt0VarArr[i14].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i14 == 0) {
                            nu0VarArr[0].g(false);
                        }
                        qt0VarArr[i14].r.setVisibility(8);
                        qt0VarArr[i14].x.y1(iArr[p02 ? 1 : 0]);
                        qt0VarArr[i14].h.a0();
                        qt0VarArr[i14].h.invalidate();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(qt0VarArr[i14].h);
                        } else {
                            adapter.l();
                        }
                    }
                }
                if (this.s < 0) {
                    X0();
                    return;
                }
                while (i11 < qt0VarArr.length) {
                    qt0 qt0Var3 = qt0VarArr[i11];
                    if (qt0Var3.C == this.m1) {
                        View m9 = qt0Var3.s.m(this.s);
                        if (m9 != null) {
                            this.v = m9.getTop();
                        }
                        qt0 qt0Var4 = qt0VarArr[i11];
                        qt0Var4.x.h1(this.s, (-qt0Var4.h.getPaddingTop()) + this.v);
                    }
                    i11++;
                }
            }
        }
    }

    public final void T0(ArrayList arrayList, boolean z4) {
        ft0 ft0Var = this.W;
        if (ft0Var == null || ft0Var.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.s1;
        if (z4 && arrayList.size() > p2Var.getMessagesController().storiesPinnedToTopCountMax) {
            qc.a0(p2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", p2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            return;
        }
        nh.l6 l6Var = ft0Var.s;
        int i10 = l6Var.c;
        ArrayList arrayList2 = l6Var.g;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        boolean z10 = true;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Integer num = (Integer) arrayList.get(size);
            num.getClass();
            if (z4 && !arrayList3.contains(num)) {
                arrayList3.add(0, num);
            } else if (!z4 && arrayList3.contains(num)) {
                arrayList3.remove(num);
            }
        }
        boolean z11 = arrayList3.size() > MessagesController.getInstance(i10).storiesPinnedToTopCountMax;
        if (!z11) {
            boolean z12 = arrayList2.size() != arrayList3.size();
            if (!z12) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList2.size()) {
                        break;
                    }
                    if (arrayList2.get(i11) != arrayList3.get(i11)) {
                        z12 = true;
                        break;
                    }
                    i11++;
                }
            }
            if (z12) {
                arrayList2.clear();
                arrayList2.addAll(arrayList3);
                l6Var.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(l6Var.d);
                ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new nh.p5(2));
            }
            z10 = z11;
        }
        if (z10) {
            qc.a0(p2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", p2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
        } else if (z4) {
            qc.a0(p2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
        } else {
            qc.a0(p2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
        }
    }

    public final void U(int i10) {
        ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 0) {
            if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                this.x0.setTextSize(20);
            } else {
                this.x0.setTextSize(18);
            }
        }
        if (i10 == 0) {
            this.E.l();
        }
    }

    public final boolean U0(MotionEvent motionEvent, boolean z4) {
        qt0 qt0Var;
        nr0 nr0Var;
        int closestTab = getClosestTab();
        ns0 ns0Var = this.F0;
        int i10 = -1;
        int i11 = ns0Var.L.get(ns0Var.n + (z4 ? 1 : -1), -1);
        sr0 sr0Var = this.T;
        if (sr0Var != null) {
            if (w0(closestTab) || closestTab == 8) {
                k81 k81Var = sr0Var.n;
                i10 = k81Var.V.get(k81Var.C + (z4 ? 1 : -1), -1);
            } else if (w0(i11) || i11 == 8) {
                i10 = sr0Var.getCurrentAlbumId();
            }
            if (i10 == 0) {
                i11 = 8;
            } else if (i10 > 0) {
                i11 = i1(i10).a;
            }
        }
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.w0 w0Var = this.k0;
            if (w0Var == null || D()) {
                this.l0 = b0(0.0f);
                s1(0.0f);
            } else {
                w0Var.setVisibility(v0() ? 8 : 4);
                this.l0 = 0.0f;
            }
            if ((!this.S0 || getSelectedTab() != 11) && (!C() || !this.z1 || (getClosestTab() != 8 && !w0(getClosestTab())))) {
                qt0[] qt0VarArr = this.h0;
                qt0 qt0Var2 = qt0VarArr[0];
                if (qt0Var2 != null && qt0Var2.C == 13 && (nr0Var = this.R) != null) {
                    oh.a aVar = nr0Var.n;
                    if (!z4) {
                    }
                }
                qt0 qt0Var3 = qt0VarArr[0];
                or0 or0Var = this.S;
                if (qt0Var3 != null && qt0Var3.C == 14 && or0Var != null) {
                    kh.r2 r2Var = or0Var.h;
                    if (!z4) {
                    }
                }
                if ((!this.z1 || (qt0Var = qt0VarArr[0]) == null || qt0Var.C != 13) && ((or0Var == null || !or0Var.g()) && (sr0Var == null || !sr0Var.w))) {
                    q1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    k0();
                    this.v1 = false;
                    this.u1 = true;
                    N0(true);
                    this.w1 = (int) motionEvent.getX();
                    this.D.setEnabled(false);
                    ns0Var.setEnabled(false);
                    qt0 qt0Var4 = qt0VarArr[1];
                    qt0Var4.C = i11;
                    qt0Var4.setVisibility(0);
                    this.e1 = z4;
                    m1(true);
                    if (z4) {
                        qt0VarArr[1].setTranslationX(qt0VarArr[0].getMeasuredWidth());
                    } else {
                        qt0VarArr[1].setTranslationX(-qt0VarArr[0].getMeasuredWidth());
                    }
                    M0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final String V(boolean z4) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        nr0 nr0Var;
        if (!r0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z4 && (nr0Var = this.R) != null) {
            return nr0Var.getBotPreviewsSubtitle();
        }
        ft0 ft0Var = this.W;
        if (ft0Var == null || ft0Var.s == null) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < ft0Var.s.i.size(); i12++) {
                MessageObject messageObject = (MessageObject) ft0Var.s.i.get(i12);
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
        StringBuilder sb = new StringBuilder();
        if (i10 > 0) {
            sb.append(LocaleController.formatPluralString("Images", i10, new Object[0]));
        }
        if (i11 > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.formatPluralString("Videos", i11, new Object[0]));
        }
        return sb.toString();
    }

    public final qt0 W(int i10) {
        int i11 = 0;
        while (true) {
            qt0[] qt0VarArr = this.h0;
            if (i11 >= qt0VarArr.length) {
                return null;
            }
            qt0 qt0Var = qt0VarArr[i11];
            if (qt0Var != null && qt0Var.C == i10) {
                return qt0Var;
            }
            i11++;
        }
    }

    public final void W0(f2.o0 o0Var) {
        if (o0Var instanceof su0) {
            ArrayList arrayList = this.B0;
            ArrayList arrayList2 = this.C0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (o0Var == this.J) {
            ArrayList arrayList3 = this.D0;
            ArrayList arrayList4 = this.E0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        eu0 eu0Var = this.K;
        if (o0Var == eu0Var) {
            eu0Var.r = null;
        }
    }

    public final int X(int i10, int i11, boolean z4) {
        int i12 = i11 + (!z4 ? 1 : -1);
        if (i12 > 6) {
            i12 = !z4 ? 9 : 6;
        }
        return Utilities.clamp(i12, 9, (this.h1 && i10 == 1) ? 1 : 2);
    }

    public final void X0() {
        int i10;
        int i11 = 0;
        while (true) {
            qt0[] qt0VarArr = this.h0;
            if (i11 >= qt0VarArr.length) {
                return;
            }
            wr0 wr0Var = qt0VarArr[i11].h;
            if (wr0Var != null) {
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < wr0Var.getChildCount(); i14++) {
                    View childAt = wr0Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.r7) {
                        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) childAt;
                        int messageId = r7Var.getMessageId();
                        i13 = r7Var.getTop();
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
                    int i15 = qt0VarArr[i11].C;
                    int i16 = -1;
                    if (p0(i15)) {
                        vu0 k12 = k1(i15);
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
                        nu0[] nu0VarArr = this.q1;
                        if (i15 < nu0VarArr.length) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= nu0VarArr[i15].a.size()) {
                                    break;
                                }
                                if (i12 == ((MessageObject) nu0VarArr[i15].a.get(i18)).getId()) {
                                    i16 = i18;
                                    break;
                                }
                                i18++;
                            }
                            i10 = nu0VarArr[i15].m + i16;
                        }
                    }
                    if (i16 >= 0) {
                        ((f2.i0) wr0Var.getLayoutManager()).h1(i10, (-qt0VarArr[i11].h.getPaddingTop()) + i13);
                        if (this.l1) {
                            qt0 qt0Var = qt0VarArr[i11];
                            qt0Var.s.h1(i10, (-qt0Var.h.getPaddingTop()) + i13);
                        }
                    }
                }
            }
            i11++;
        }
    }

    public final int Y(boolean z4) {
        return this.U1 + (z4 ? AndroidUtilities.dp(52.0f) : 0);
    }

    public final void Y0(int i10) {
        ns0 ns0Var;
        if (this.I1 || (ns0Var = this.F0) == null) {
            return;
        }
        ns0Var.h(null, i10, ns0Var.M.get(i10));
    }

    public final int Z(int i10) {
        int dp = AndroidUtilities.dp(54.0f) + this.Y1;
        sr0 sr0Var = this.T;
        return dp + ((int) ((sr0Var == null || !(w0(i10) || i10 == 8)) ? 0.0f : sr0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f))) + (i10 == 9 ? AndroidUtilities.dp(64.0f) : 0);
    }

    public final void Z0(float f10, int i10) {
        ns0 ns0Var = this.F0;
        if (ns0Var != null) {
            ns0Var.j(f10, w0(i10) ? 8 : i10);
        }
        sr0 sr0Var = this.T;
        if (sr0Var != null) {
            k81 k81Var = sr0Var.n;
            if (w0(i10)) {
                k81Var.f(f10, h1(i10));
            } else if (i10 == 8) {
                k81Var.f(f10, 0);
            }
        }
    }

    public final float a0(float f10) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f11 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        qt0[] qt0VarArr = this.h0;
        qt0 qt0Var = qt0VarArr[1];
        or0 or0Var = this.S;
        if (qt0Var != null && ((i12 = qt0Var.C) == 0 || (((i12 == 8 || w0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = qt0VarArr[1].C) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && or0Var != null)))) {
            f11 = 0.0f + f10;
        }
        qt0 qt0Var2 = qt0VarArr[0];
        return (qt0Var2 == null || !((i10 = qt0Var2.C) == 0 || (((i10 == 8 || w0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = qt0VarArr[0].C) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && or0Var != null)))) ? f11 : (1.0f - f10) + f11;
    }

    public final void a1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.h0;
            if (i10 >= qt0VarArr.length) {
                if (this.C == 0) {
                    ht0 ht0Var = this.U;
                    ht0Var.d = chatFull;
                    ht0Var.e = arrayList;
                }
                v1(true);
                for (int i11 = 0; i11 < qt0VarArr.length; i11++) {
                    qt0 qt0Var = qt0VarArr[i11];
                    if (qt0Var.C == 7 && qt0Var.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(qt0VarArr[i11].h);
                    }
                }
                return;
            }
            qt0 qt0Var2 = qt0VarArr[i10];
            if (qt0Var2.C == 7 && qt0Var2.h.getAdapter() != null && qt0VarArr[i10].h.getAdapter().h() != 0 && this.s1.getMessagesController().getStoriesController().j.size() > 0) {
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

    public final float b0(float f10) {
        float f11 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        qt0[] qt0VarArr = this.h0;
        qt0 qt0Var = qt0VarArr[1];
        if (qt0Var != null && s0(qt0Var.C) && qt0VarArr[1].C != 11) {
            f11 = 0.0f + f10;
        }
        qt0 qt0Var2 = qt0VarArr[0];
        return (qt0Var2 == null || !s0(qt0Var2.C) || qt0VarArr[0].C == 11) ? f11 : (1.0f - f10) + f11;
    }

    public void b1(boolean z4) {
        if (this.z1 == z4) {
            return;
        }
        this.z1 = z4;
        AnimatorSet animatorSet = this.K1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        z9 z9Var = this.y0;
        if (z4) {
            z9Var.setVisibility(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.K1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(z9Var, (Property<z9, Float>) View.ALPHA, z4 ? 1.0f : 0.0f));
        this.K1.setDuration(180L);
        this.K1.addListener(new l00(11, this, z4));
        this.K1.start();
        if (z4) {
            u1();
        }
    }

    public final int c0(int i10) {
        vu0 k12;
        nh.l6 l6Var;
        if (!p0(i10) || (k12 = k1(i10)) == null || (l6Var = k12.s) == null) {
            return 0;
        }
        return l6Var.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(int i10, boolean z4) {
        int i11;
        qt0 W;
        if (z4 && getY() != 0.0f && this.B == 1) {
            return;
        }
        if (z4 && p0(i10) && c0(i10) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.g1);
        bundle.putLong("topic_id", this.C);
        nu0[] nu0VarArr = this.q1;
        if (z4 && (W = W(0)) != null) {
            ArrayList arrayList = nu0VarArr[0].e;
            int L0 = W.x.L0();
            if (L0 >= 0) {
                vt0 vt0Var = null;
                if (arrayList != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        if (L0 <= ((vt0) arrayList.get(i12)).b) {
                            vt0Var = (vt0) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (vt0Var == null) {
                        vt0Var = (vt0) kh.a2.i(1, arrayList);
                    }
                }
                if (vt0Var != null) {
                    i11 = vt0Var.c;
                    if (i10 != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i10 == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    org.telegram.ui.j8 j8Var = new org.telegram.ui.j8(nu0VarArr[0].q, i11, bundle);
                    j8Var.J = new org.telegram.ui.Cells.f1(this, 7);
                    this.s1.presentFragment(j8Var);
                }
            }
        }
        i11 = 0;
        if (i10 != 9) {
        }
        org.telegram.ui.j8 j8Var2 = new org.telegram.ui.j8(nu0VarArr[0].q, i11, bundle);
        j8Var2.J = new org.telegram.ui.Cells.f1(this, 7);
        this.s1.presentFragment(j8Var2);
    }

    public final void d1(int i10) {
        int h12 = h1(getClosestTab());
        sr0 sr0Var = this.T;
        if (h12 != i10) {
            if (sr0Var != null) {
                sr0Var.n.d(i10, sr0Var.s.i(i10));
                return;
            }
            return;
        }
        sr0Var.setReorderingAlbums(true);
        xu0 i12 = i1(i10);
        qt0 W = W(i12.a);
        if (W == null) {
            return;
        }
        wr0 wr0Var = W.h;
        for (int i11 = 0; i11 < wr0Var.getChildCount(); i11++) {
            View childAt = wr0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.r7) {
                ((org.telegram.ui.Cells.r7) childAt).l(true, true);
            }
        }
        wu0 wu0Var = i12.c;
        if (wu0Var != null && !wu0Var.x) {
            wu0Var.x = true;
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
        wr0 wr0Var;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i12;
        rl0 rl0Var;
        int i13;
        boolean z4;
        boolean z10;
        int i14;
        int size;
        int i15;
        boolean z11;
        wr0 wr0Var2;
        int i16;
        int i17;
        wr0 wr0Var3;
        int i18 = NotificationCenter.mediaDidLoad;
        rl0 rl0Var2 = this.L;
        rl0 rl0Var3 = this.J;
        mu0 mu0Var = this.G;
        rl0 rl0Var4 = this.I;
        rl0 rl0Var5 = this.H;
        org.telegram.ui.ActionBar.p2 p2Var = this.s1;
        eu0 eu0Var = this.K;
        ct0 ct0Var = this.E;
        long j10 = this.g1;
        qt0[] qt0VarArr = this.h0;
        nu0[] nu0VarArr = this.q1;
        if (i10 == i18) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != p2Var.getClassGuid() || intValue2 != nu0VarArr[intValue3].p) {
                if (this.r1 == null || !nu0VarArr[intValue3].a.isEmpty() || nu0VarArr[intValue3].o || !R(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    rl0Var2 = ct0Var;
                } else if (intValue3 == 1) {
                    rl0Var2 = rl0Var5;
                } else if (intValue3 == 2) {
                    rl0Var2 = rl0Var4;
                } else if (intValue3 == 3) {
                    rl0Var2 = mu0Var;
                } else if (intValue3 == 4) {
                    rl0Var2 = rl0Var3;
                } else if (intValue3 != 5) {
                    rl0Var2 = intValue3 == 15 ? eu0Var : null;
                }
                if (rl0Var2 != null) {
                    for (int i19 = 0; i19 < qt0VarArr.length; i19++) {
                        qt0 qt0Var = qt0VarArr[i19];
                        if (qt0Var != null && (wr0Var2 = qt0Var.h) != null && wr0Var2.getAdapter() == rl0Var2) {
                            qt0VarArr[i19].h.B0();
                        }
                    }
                    rl0Var2.l();
                }
                this.Y0 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j10);
            int i20 = longValue == j10 ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                nu0VarArr[intValue3].f[i20] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i16 = intValue3;
                rl0Var2 = ct0Var;
            } else if (intValue3 == 1) {
                i16 = intValue3;
                rl0Var2 = rl0Var5;
            } else if (intValue3 == 2) {
                i16 = intValue3;
                rl0Var2 = rl0Var4;
            } else if (intValue3 == 3) {
                i16 = intValue3;
                rl0Var2 = mu0Var;
            } else if (intValue3 == 4) {
                i16 = intValue3;
                rl0Var2 = rl0Var3;
            } else if (intValue3 == 5) {
                i16 = intValue3;
            } else if (intValue3 == 15) {
                rl0Var2 = eu0Var;
                i16 = 8;
            } else {
                i16 = intValue3;
                rl0Var2 = null;
            }
            int size2 = nu0VarArr[i16].a.size();
            if (rl0Var2 != null) {
                i17 = rl0Var2.h();
                if (rl0Var2 instanceof ol0) {
                    ((ol0) rl0Var2).L();
                }
            } else {
                i17 = 0;
            }
            nu0VarArr[i16].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size3);
                    if (nu0VarArr[i16].a(messageObject2, i20, r13, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject2.getId(), r13);
                        nu0 nu0Var = nu0VarArr[i16];
                        int i21 = nu0Var.m - r13;
                        nu0Var.m = i21;
                        if (i21 < 0) {
                            nu0Var.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                nu0VarArr[i16].l = ((Boolean) objArr[5]).booleanValue();
                nu0 nu0Var2 = nu0VarArr[i16];
                if (nu0Var2.l) {
                    nu0Var2.m = 0;
                }
            } else {
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i22);
                    if (nu0VarArr[i16].a(messageObject3, i20, false, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject3.getId(), true);
                        nu0 nu0Var3 = nu0VarArr[i16];
                        int i23 = nu0Var3.n - 1;
                        nu0Var3.n = i23;
                        if (i23 < 0) {
                            nu0Var3.n = 0;
                        }
                    }
                }
                nu0 nu0Var4 = nu0VarArr[i16];
                if (nu0Var4.o && nu0Var4.a.size() > 0) {
                    nu0 nu0Var5 = nu0VarArr[i16];
                    nu0Var5.k = ((MessageObject) nu0Var5.a.get(0)).getId();
                }
                nu0VarArr[i16].i[i20] = ((Boolean) objArr[5]).booleanValue();
                nu0 nu0Var6 = nu0VarArr[i16];
                if (nu0Var6.i[i20]) {
                    int size4 = nu0Var6.b[i20].size();
                    if (i20 == 0) {
                        size4 += nu0VarArr[i16].m;
                    }
                    nu0VarArr[i16].f[i20] = size4;
                }
            }
            if (!booleanValue && i20 == 0) {
                nu0 nu0Var7 = nu0VarArr[i16];
                if (nu0Var7.i[i20] && this.Z0 != 0) {
                    nu0Var7.g = true;
                    p2Var.getMediaDataController().loadMedia(this.Z0, 50, nu0VarArr[i16].j[1], 0, i16, this.C, 1, p2Var.getClassGuid(), nu0VarArr[i16].p, null, null);
                }
            }
            int i24 = i16;
            if (rl0Var2 != null) {
                pt0 pt0Var = null;
                for (int i25 = 0; i25 < qt0VarArr.length; i25++) {
                    qt0 qt0Var2 = qt0VarArr[i25];
                    if (qt0Var2 != null && (wr0Var3 = qt0Var2.h) != null && wr0Var3.getAdapter() == rl0Var2) {
                        pt0 pt0Var2 = qt0VarArr[i25].h;
                        pt0Var2.B0();
                        pt0Var = pt0Var2;
                    }
                }
                int h = rl0Var2.h();
                if (rl0Var2 != ct0Var) {
                    try {
                        rl0Var2.l();
                    } catch (Throwable unused) {
                    }
                } else if (ct0Var.h() == i17) {
                    AndroidUtilities.updateVisibleRows(pt0Var);
                } else {
                    ct0Var.l();
                }
                if (!nu0VarArr[i24].a.isEmpty() || nu0VarArr[i24].g) {
                    if (pt0Var != null && (rl0Var2 == ct0Var || h >= i17)) {
                        z(pt0Var, i17, sparseBooleanArray);
                    }
                } else if (pt0Var != null) {
                    z(pt0Var, i17, sparseBooleanArray);
                }
                if (pt0Var != null && !nu0VarArr[i24].o) {
                    if (size2 == 0) {
                        for (int i26 = 0; i26 < 2; i26++) {
                            if (qt0VarArr[i26].C == 0) {
                                ((f2.i0) pt0Var.getLayoutManager()).h1(ct0Var.L(0), 0);
                            }
                        }
                    } else {
                        X0();
                    }
                }
            }
            nu0 nu0Var8 = nu0VarArr[i24];
            if (nu0Var8.o) {
                if (nu0Var8.a.size() == 0) {
                    A0(i24);
                } else {
                    nu0VarArr[i24].o = false;
                }
            }
            this.Y0 = true;
            return;
        }
        if (i10 == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat chat = DialogObject.isChatDialog(j10) ? p2Var.getMessagesController().getChat(Long.valueOf(-j10)) : null;
            long longValue2 = ((Long) objArr[1]).longValue();
            if (ChatObject.isChannel(chat)) {
                if (longValue2 == 0 && this.Z0 != 0) {
                    i14 = 1;
                    ArrayList arrayList2 = (ArrayList) objArr[0];
                    size = arrayList2.size();
                    int i27 = -1;
                    i15 = 0;
                    z11 = false;
                    while (i15 < size) {
                        ct0 ct0Var2 = ct0Var;
                        int i28 = 0;
                        while (i28 < nu0VarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (nu0VarArr[i28].b(((Integer) arrayList2.get(i15)).intValue(), i14) != null) {
                                i27 = i28;
                                z11 = true;
                            }
                            i28++;
                            arrayList2 = arrayList3;
                        }
                        i15++;
                        ct0Var = ct0Var2;
                    }
                    ct0 ct0Var3 = ct0Var;
                    if (z11) {
                        this.Y0 = true;
                        if (ct0Var3 != null) {
                            ct0Var3.l();
                        }
                        if (rl0Var5 != null) {
                            rl0Var5.l();
                        }
                        if (rl0Var4 != null) {
                            rl0Var4.l();
                        }
                        if (mu0Var != null) {
                            mu0Var.X(false);
                        }
                        if (rl0Var3 != null) {
                            rl0Var3.l();
                        }
                        if (eu0Var != null) {
                            eu0Var.l();
                        }
                        if (rl0Var2 != null) {
                            rl0Var2.l();
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
            z11 = false;
            while (i15 < size) {
            }
            ct0 ct0Var32 = ct0Var;
            if (z11) {
            }
            W(i272);
            return;
        }
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == j10) {
                ArrayList arrayList4 = (ArrayList) objArr[1];
                boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j10);
                int i29 = 0;
                boolean z12 = false;
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
                        nu0 nu0Var9 = nu0VarArr[mediaType];
                        if (nu0Var9.l) {
                            z10 = z12;
                            if (nu0Var9.a(messageObject4, messageObject4.getDialogId() == j10 ? 0 : 1, true, isEncryptedDialog2)) {
                                this.U0[mediaType] = 1;
                                z4 = true;
                                i29 = i13 + 1;
                                z12 = z4;
                                arrayList4 = arrayList5;
                            }
                            z4 = z10;
                            i29 = i13 + 1;
                            z12 = z4;
                            arrayList4 = arrayList5;
                        }
                    }
                    z10 = z12;
                    z4 = z10;
                    i29 = i13 + 1;
                    z12 = z4;
                    arrayList4 = arrayList5;
                }
                boolean z13 = z12;
                int i30 = 1;
                if (z13) {
                    this.Y0 = true;
                    int i31 = 0;
                    while (i31 < qt0VarArr.length) {
                        int i32 = qt0VarArr[i31].C;
                        if (i32 == 0) {
                            rl0Var = ct0Var;
                        } else if (i32 == i30) {
                            rl0Var = rl0Var5;
                        } else if (i32 == 2) {
                            rl0Var = rl0Var4;
                        } else if (i32 == 3) {
                            rl0Var = mu0Var;
                        } else {
                            if (i32 == 4) {
                                rl0Var = rl0Var3;
                            } else if (i32 == 5) {
                                rl0Var = rl0Var2;
                            } else {
                                rl0Var = i32 == 15 ? eu0Var : null;
                                if (rl0Var != null) {
                                    rl0Var.h();
                                    ct0Var.l();
                                    rl0Var5.l();
                                    rl0Var4.l();
                                    mu0Var.X(false);
                                    rl0Var3.l();
                                    eu0Var.l();
                                    rl0Var2.l();
                                }
                                i31++;
                                i30 = 1;
                            }
                            if (rl0Var != null) {
                            }
                            i31++;
                            i30 = 1;
                        }
                        if (rl0Var != null) {
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
            if (l10.longValue() == j10 || l10.longValue() == this.Z0) {
                int i33 = l10.longValue() == j10 ? 0 : 1;
                for (nu0 nu0Var10 : nu0VarArr) {
                    nu0Var10.f(i33, num.intValue(), num2.intValue());
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
                for (int i34 = 0; i34 < qt0VarArr.length; i34++) {
                    int childCount = qt0VarArr[i34].h.getChildCount();
                    for (int i35 = 0; i35 < childCount; i35++) {
                        View childAt = qt0VarArr[i34].h.getChildAt(i35);
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
            for (int i36 = 0; i36 < qt0VarArr.length; i36++) {
                qt0 qt0Var3 = qt0VarArr[i36];
                if (qt0Var3 != null && (wr0Var = qt0Var3.h) != null) {
                    int childCount2 = wr0Var.getChildCount();
                    for (int i37 = 0; i37 < childCount2; i37++) {
                        View childAt2 = qt0VarArr[i36].h.getChildAt(i37);
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
            nh.l6 l6Var = (nh.l6) objArr[0];
            ft0 ft0Var = this.W;
            if (ft0Var == null || l6Var != ft0Var.s) {
                mr0 mr0Var = this.b0;
                if (mr0Var == null || l6Var != mr0Var.s) {
                    Iterator it = this.V1.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        xu0 xu0Var = (xu0) it.next();
                        if (xu0Var.c.s == l6Var) {
                            i12 = xu0Var.a;
                            break;
                        }
                    }
                } else {
                    i12 = 9;
                }
            } else {
                i12 = 8;
            }
            qt0 W = W(i12);
            if (W != null) {
                if (W.b != (l6Var.g() > 0)) {
                    W.b = l6Var.g() > 0;
                    o1(W, true);
                }
            }
            if (W != null) {
                AndroidUtilities.notifyDataSetChanged(W.h);
                if (W.h.getLayoutManager() instanceof f2.i0) {
                    sl0 sl0Var = W.h;
                    G(W, sl0Var, (f2.i0) sl0Var.getLayoutManager());
                }
            }
            jt0 jt0Var = this.A1;
            if (jt0Var != null) {
                jt0Var.R();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated) {
            for (qt0 qt0Var4 : qt0VarArr) {
                if (qt0Var4 != null && qt0Var4.h != null && p0(qt0Var4.C)) {
                    if (!r0() || qt0Var4.h.getAdapter() == null) {
                        for (int i38 = 0; i38 < qt0Var4.h.getChildCount(); i38++) {
                            View childAt3 = qt0Var4.h.getChildAt(i38);
                            if (childAt3 instanceof org.telegram.ui.Cells.r7) {
                                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) childAt3;
                                j6 j6Var = r7Var.K;
                                if (!r7Var.a0 || (messageObject = r7Var.n) == null || (storyItem = messageObject.storyItem) == null || (storyViews = storyItem.views) == null) {
                                    r7Var.I = false;
                                    j6Var.q("", false, true);
                                } else {
                                    int i39 = storyViews.views_count;
                                    r7Var.I = i39 > 0;
                                    j6Var.q(AndroidUtilities.formatWholeNumber(i39, 0), true, true);
                                }
                            }
                        }
                    } else {
                        AndroidUtilities.notifyDataSetChanged(qt0Var4.h);
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.channelRecommendationsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
                this.N.E(true);
                v1(true);
                F();
                return;
            }
            return;
        }
        int i40 = NotificationCenter.savedMessagesDialogsUpdate;
        hu0 hu0Var = this.O;
        if (i10 == i40) {
            if (j10 == 0 || j10 == p2Var.getUserConfig().getClientUserId()) {
                hu0Var.F(true);
                v1(true);
                F();
                L0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogsNeedReload) {
            hu0Var.F(true);
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
            ht0 ht0Var = this.U;
            if (ht0Var != null) {
                TLRPC.ChatFull chatFull = ht0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i41 = 0; i41 < ht0Var.d.participants.participants.size(); i41++) {
                        ht0Var.d.participants.participants.get(i41).setRank(longValue4, str);
                    }
                }
                for (qt0 qt0Var5 : qt0VarArr) {
                    if (qt0Var5.C == 7) {
                        AndroidUtilities.updateVisibleRows(qt0Var5.h);
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
            for (int i42 = 0; i42 < qt0VarArr.length; i42++) {
                if (qt0VarArr[i42].h.getAdapter() == eu0Var) {
                    wr0 wr0Var4 = qt0VarArr[i42].h;
                    ArrayList arrayList6 = eu0Var.n;
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
                                eu0Var.m(i43);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ns0 ns0Var = this.F0;
        if (ns0Var != null) {
            canvas.save();
            canvas.translate(ns0Var.getX(), ns0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        js0 js0Var = this.O0;
        if (js0Var != null) {
            int i10 = js0Var.Q;
            if ((i10 == 3 || i10 == 1) && this.M0 == null) {
                canvas.save();
                canvas.translate(js0Var.getX(), js0Var.getY());
                js0Var.setDrawOverlay(true);
                js0Var.draw(canvas);
                js0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        if (view != this.O0 || this.M0 != null) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        qt0[] qt0VarArr = this.h0;
        float top = qt0VarArr[0].getTop();
        sr0 sr0Var = this.T;
        if (sr0Var != null && ((i10 = qt0VarArr[0].C) == 8 || w0(i10))) {
            top -= sr0Var.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(org.telegram.ui.Cells.r2 r2Var) {
        org.telegram.ui.ActionBar.p2 p2Var = this.s1;
        if (p2Var != null && p2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            p2Var.getOrCreateStoryViewer().getClass();
            nh.i9 orCreateStoryViewer = p2Var.getOrCreateStoryViewer();
            Context context = p2Var.getContext();
            long dialogId = r2Var.getDialogId();
            nh.c7 a10 = nh.c7.a((sl0) r2Var.getParent());
            a10.s += ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).p1) ? AndroidUtilities.dp(68.0f) : 0;
            orCreateStoryViewer.D(context, dialogId, a10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r1 = r2[r1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1(boolean z4) {
        qt0[] qt0VarArr;
        qt0 qt0Var;
        if (this.l1) {
            return;
        }
        int i10 = 0;
        while (true) {
            qt0VarArr = this.h0;
            if (i10 >= qt0VarArr.length) {
                qt0Var = null;
                break;
            }
            int i11 = qt0VarArr[i10].C;
            if (i11 == 0 || p0(i11)) {
                break;
            } else {
                i10++;
            }
        }
        if (qt0Var != null) {
            int i12 = qt0Var.C;
            this.m1 = i12;
            boolean p02 = p0(i12);
            int[] iArr = this.j1;
            int X = X(p02 ? 1 : 0, iArr[p02 ? 1 : 0], z4);
            this.n1 = X;
            if (X != iArr[p02 ? 1 : 0]) {
                if (this.h1 && p0(this.m1)) {
                    return;
                }
                qt0Var.r.setVisibility(0);
                if (p0(this.m1)) {
                    qt0Var.r.setAdapter(l1(this.m1));
                } else {
                    qt0Var.r.setAdapter(this.F);
                }
                pt0 pt0Var = qt0Var.r;
                pt0Var.setPadding(pt0Var.getPaddingLeft(), Z(this.m1), qt0Var.r.getPaddingRight(), Y(v0()));
                qt0Var.s.y1(X);
                qt0Var.r.a0();
                qt0Var.s.O = new ls0(this, qt0Var, 0);
                AndroidUtilities.updateVisibleRows(qt0Var.h);
                this.l1 = true;
                if (this.m1 == 0) {
                    this.q1[0].g(true);
                }
                this.k1 = 0.0f;
                if (this.s < 0) {
                    X0();
                    return;
                }
                for (qt0 qt0Var2 : qt0VarArr) {
                    if (qt0Var2.C == this.m1) {
                        qt0Var2.s.h1(this.s, this.v - qt0Var2.r.getPaddingTop());
                    }
                }
            }
        }
    }

    public final float f0(int i10, boolean z4) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            qt0[] qt0VarArr = this.h0;
            if (i11 >= qt0VarArr.length) {
                break;
            }
            qt0 qt0Var = qt0VarArr[i11];
            if (qt0Var != null) {
                int i13 = qt0Var.C;
                if ((z4 && i10 == 8 && w0(i13)) || i13 == i10) {
                    i12++;
                    width = qt0VarArr[i11].getTranslationX();
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
            qt0[] qt0VarArr = this.h0;
            if (i10 >= qt0VarArr.length) {
                return;
            }
            int childCount = qt0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = qt0VarArr[i10].h.getChildAt(i11);
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

    public final float g0(int i10, boolean z4) {
        float f10 = 0.0f;
        int i11 = 0;
        while (true) {
            qt0[] qt0VarArr = this.h0;
            if (i11 >= qt0VarArr.length) {
                return f10;
            }
            qt0 qt0Var = qt0VarArr[i11];
            if (qt0Var != null) {
                int i12 = qt0Var.C;
                if ((z4 && i10 == 8 && w0(i12)) || i12 == i10) {
                    f10 = (1.0f - Math.abs(qt0VarArr[i11].getTranslationX() / getWidth())) + f10;
                }
            }
            i11++;
        }
    }

    public final void g1(MotionEvent motionEvent) {
        float f10;
        float f11;
        float measuredWidth;
        VelocityTracker velocityTracker = this.y1;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.P0);
        int i10 = 1;
        if (motionEvent == null || motionEvent.getAction() == 3) {
            f10 = 0.0f;
            f11 = 0.0f;
        } else {
            f10 = this.y1.getXVelocity();
            f11 = this.y1.getYVelocity();
            if (!this.u1 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                U0(motionEvent, f10 < 0.0f);
            }
        }
        if (this.u1) {
            qt0[] qt0VarArr = this.h0;
            float x10 = qt0VarArr[0].getX();
            this.c1 = new AnimatorSet();
            this.f1 = Math.abs(x10) < ((float) qt0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new i70(this, 19));
            boolean z4 = this.f1;
            Property property = View.TRANSLATION_X;
            if (z4) {
                measuredWidth = Math.abs(x10);
                if (this.e1) {
                    this.c1.playTogether(ObjectAnimator.ofFloat(qt0VarArr[0], (Property<qt0, Float>) property, 0.0f), ObjectAnimator.ofFloat(qt0VarArr[1], (Property<qt0, Float>) property, r14.getMeasuredWidth()), ofFloat);
                } else {
                    this.c1.playTogether(ObjectAnimator.ofFloat(qt0VarArr[0], (Property<qt0, Float>) property, 0.0f), ObjectAnimator.ofFloat(qt0VarArr[1], (Property<qt0, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = qt0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.e1) {
                    this.c1.playTogether(ObjectAnimator.ofFloat(qt0VarArr[0], (Property<qt0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(qt0VarArr[1], (Property<qt0, Float>) property, 0.0f), ofFloat);
                } else {
                    this.c1.playTogether(ObjectAnimator.ofFloat(qt0VarArr[0], (Property<qt0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(qt0VarArr[1], (Property<qt0, Float>) property, 0.0f), ofFloat);
                }
            }
            this.c1.setInterpolator(b2);
            int measuredWidth2 = getMeasuredWidth();
            float f12 = measuredWidth2 / 2;
            float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
            this.c1.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r0) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.c1.addListener(new qs0(this, i10));
            this.c1.start();
            this.d1 = true;
            this.u1 = false;
            L0();
        } else {
            this.v1 = false;
            this.D.setEnabled(true);
            this.F0.setEnabled(true);
        }
        VelocityTracker velocityTracker2 = this.y1;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.y1 = null;
        }
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.W0[0];
    }

    public float getBottomButtonStoriesVisibility() {
        qt0 qt0Var;
        qt0 qt0Var2;
        nh.l6 l6Var;
        nh.l6 l6Var2;
        float f10 = 1.0f;
        qt0[] qt0VarArr = this.h0;
        if (qt0VarArr == null || (qt0Var = qt0VarArr[0]) == null || (qt0Var2 = qt0VarArr[1]) == null || qt0Var.w == null || qt0Var2.w == null) {
            return 1.0f;
        }
        int i10 = qt0Var.C;
        int i11 = qt0Var2.C;
        boolean z4 = w0(i10) || i10 == 8;
        boolean z10 = w0(i11) || i11 == 8;
        if (!z4 && !z10) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - qt0VarArr[0].w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - qt0VarArr[1].w.getVisibilityFactor();
        vu0 k12 = k1(qt0VarArr[0].C);
        if (i10 == 8 || (k12 != null && (l6Var2 = k12.s) != null && l6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        vu0 k13 = k1(i11);
        if (i11 != 8 && (k13 == null || (l6Var = k13.s) == null || l6Var.g() <= 0)) {
            f10 = visibilityFactor2;
        }
        if (!z4) {
            visibilityFactor = f10;
        }
        if (!z10) {
            f10 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f10, Math.abs(qt0VarArr[0].getTranslationX() / qt0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        qt0[] qt0VarArr = this.h0;
        qt0 qt0Var = qt0VarArr[1];
        if (qt0Var != null && qt0Var.getVisibility() == 0) {
            if (this.d1 && !this.f1) {
                return qt0VarArr[1].C;
            }
            if (Math.abs(qt0VarArr[1].getTranslationX()) < qt0VarArr[1].getMeasuredWidth() / 2.0f) {
                return qt0VarArr[1].C;
            }
        }
        return getSelectedTab();
    }

    public sl0 getCurrentListView() {
        dt0 dt0Var;
        qt0 qt0Var = this.h0[0];
        int i10 = qt0Var.C;
        return i10 == 13 ? this.R.getCurrentListView() : i10 == 14 ? this.S.getCurrentListView() : (i10 != 12 || (dt0Var = this.Q) == null) ? qt0Var.h : dt0Var.a.u0;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.q1[0].q;
    }

    public TextView getSaveItem() {
        return this.n0;
    }

    public org.telegram.ui.ActionBar.w0 getSearchItem() {
        return this.k0;
    }

    public jj0 getSearchOptionsItem() {
        return this.p0;
    }

    public int getSelectedTab() {
        int currentTabId = this.F0.getCurrentTabId();
        sr0 sr0Var = this.T;
        if (sr0Var == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = sr0Var.getCurrentAlbumId();
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
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.h0;
            if (i10 >= qt0VarArr.length) {
                return f10;
            }
            qt0 qt0Var = qt0VarArr[i10];
            if (qt0Var != null) {
                f10 = ((1.0f - Math.abs(qt0Var.getTranslationX() / getWidth())) * qt0Var.C) + f10;
            }
            i10++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.x0, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.z6));
        org.telegram.ui.ActionBar.w0 w0Var = this.i0;
        jj0 iconView = w0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.j6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.z8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.r0;
        if (w0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.q0;
        if (w0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.A0};
        ImageView imageView = this.z0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.y0, 1, null, null, null, null, i12));
        ns0 ns0Var = this.F0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ns0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.wc;
        org.telegram.ui.Cells.v0 v0Var = this.H0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ns0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ns0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ns0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ns0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hh));
        js0 js0Var = this.O0;
        if (js0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.v7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.w7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.u7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.t7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.x7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.y7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A7));
        }
        final int i14 = 0;
        while (true) {
            qt0[] qt0VarArr = this.h0;
            if (i14 >= qt0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.k6 k6Var = new org.telegram.ui.ActionBar.k6() { // from class: org.telegram.ui.Components.ir0
                @Override // org.telegram.ui.ActionBar.k6
                public final void b() {
                    qt0[] qt0VarArr2 = yu0.this.h0;
                    int i15 = i14;
                    wr0 wr0Var = qt0VarArr2[i15].h;
                    if (wr0Var != null) {
                        int childCount = wr0Var.getChildCount();
                        for (int i16 = 0; i16 < childCount; i16++) {
                            View childAt = qt0VarArr2[i15].h.getChildAt(i16);
                            if (childAt instanceof org.telegram.ui.Cells.s7) {
                                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                                for (int i17 = 0; i17 < 6; i17++) {
                                    s7Var.a[i17].e.invalidate();
                                }
                            } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                                ((org.telegram.ui.Cells.h6) childAt).u(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.va) {
                                ((org.telegram.ui.Cells.va) childAt).j(0);
                            }
                        }
                    }
                }

                @Override // org.telegram.ui.ActionBar.k6
                public final /* synthetic */ void a(float f10) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
            fs0 fs0Var = qt0VarArr[i14].v;
            int i15 = org.telegram.ui.ActionBar.j6.d6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(fs0Var, 0, null, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].w, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.c7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
            int i16 = org.telegram.ui.ActionBar.j6.h6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.uh));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.m6));
            int i17 = org.telegram.ui.ActionBar.j6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            int i18 = org.telegram.ui.ActionBar.j6.y6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, k6Var, i18));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, k6Var, org.telegram.ui.ActionBar.j6.n6));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.r0;
            int i19 = org.telegram.ui.ActionBar.j6.J7;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, drawableArr2, null, i19));
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.B0;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.j6.D0}, null, -1, null, org.telegram.ui.ActionBar.j6.X8));
            TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.C0;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.j6.E0}, null, -1, null, org.telegram.ui.ActionBar.j6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, drawableArr2, null, i19));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.U7));
            int i20 = org.telegram.ui.ActionBar.j6.z6;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{kt0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
            int i21 = org.telegram.ui.ActionBar.j6.Ih;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
            int i22 = org.telegram.ui.ActionBar.j6.i7;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            int i23 = org.telegram.ui.ActionBar.j6.k7;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.zi));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Bi));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.j6.f3, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.j6.g3, null, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, null, null, null, org.telegram.ui.ActionBar.j6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, org.telegram.ui.ActionBar.j6.m0, null, null, org.telegram.ui.ActionBar.j6.K6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Kh));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Jh));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.m7.class}, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            int i24 = org.telegram.ui.ActionBar.j6.Lh;
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.s7.class}, null, null, k6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.s7.class}, null, null, k6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, k6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, k6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, null, null, new Drawable[]{this.v0}, null, org.telegram.ui.ActionBar.j6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].w.d, 4, null, null, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].w.e, 4, null, null, null, null, i18));
            i14++;
        }
    }

    public final int h0(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.C1;
        return f6Var != null ? f6Var.x0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public final int h1(int i10) {
        xu0 j12 = j1(i10);
        if (j12 == null) {
            return -1;
        }
        return j12.b;
    }

    public final boolean i0() {
        return this.s1.getConnectionsManager().getConnectionState() == 3;
    }

    public final xu0 i1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.V1;
        xu0 xu0Var = (xu0) hashMap.get(valueOf);
        if (xu0Var != null) {
            return xu0Var;
        }
        xu0 xu0Var2 = new xu0(this, getContext(), i10);
        hashMap.put(Integer.valueOf(i10), xu0Var2);
        this.W1.put(Integer.valueOf(xu0Var2.a), Integer.valueOf(i10));
        return xu0Var2;
    }

    public final boolean j0() {
        SparseArray[] sparseArrayArr;
        MessageObject messageObject;
        TLRPC.Message message;
        boolean z4 = false;
        for (int i10 = 1; i10 >= 0; i10--) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (true) {
                sparseArrayArr = this.W0;
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
                    z4 = true;
                    break;
                }
            }
            if (z4) {
                return z4;
            }
        }
        return z4;
    }

    public final xu0 j1(int i10) {
        Integer num = (Integer) this.W1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (xu0) this.V1.get(num);
    }

    public final void k0() {
        AndroidUtilities.cancelRunOnUIThread(this.J0);
        org.telegram.ui.Cells.v0 v0Var = this.H0;
        if (v0Var.getTag() == null) {
            return;
        }
        v0Var.setTag(null);
        AnimatorSet animatorSet = this.I0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.I0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.I0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.I0.playTogether(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.Cells.v0, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.Cells.v0, Float>) View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.L0));
        this.I0.setInterpolator(nr.g);
        this.I0.addListener(new qs0(this, 0));
        this.I0.start();
    }

    public final vu0 k1(int i10) {
        xu0 j12;
        if (i10 == 8) {
            return this.W;
        }
        if (i10 == 9) {
            return this.b0;
        }
        if (!w0(i10) || (j12 = j1(i10)) == null) {
            return null;
        }
        return j12.c;
    }

    public boolean l0() {
        return false;
    }

    public final vu0 l1(int i10) {
        xu0 j12;
        if (i10 == 8) {
            return this.a0;
        }
        if (i10 == 9) {
            return this.c0;
        }
        if (!w0(i10) || (j12 = j1(i10)) == null) {
            return null;
        }
        return j12.d;
    }

    public boolean m0() {
        return !(this instanceof a40);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [f2.t0, org.telegram.ui.Components.pt0, org.telegram.ui.Components.sl0] */
    /* JADX WARN: Type inference failed for: r5v85 */
    public final void m1(boolean z4) {
        qt0[] qt0VarArr;
        qt0[] qt0VarArr2;
        f2.b1 b1Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        nu0[] nu0VarArr;
        String str;
        ?? r52;
        int i10;
        boolean z14;
        boolean z15;
        int i11;
        boolean z16;
        f2.b1 b1Var2;
        int i12;
        int i13;
        boolean z17;
        or0 or0Var = this.S;
        if (or0Var != null) {
            or0Var.i();
        }
        int i14 = 0;
        while (true) {
            qt0VarArr = this.h0;
            if (i14 >= qt0VarArr.length) {
                break;
            }
            qt0VarArr[i14].h.B0();
            i14++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qt0VarArr[z4 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(B0());
        f2.o0 adapter = qt0VarArr[z4 ? 1 : 0].h.getAdapter();
        f2.o0 o0Var = this.W;
        f2.e0 e0Var = this.V;
        if (adapter == o0Var) {
            e0Var.d(null);
        }
        boolean z18 = this.S0;
        jt0 jt0Var = this.A1;
        eu0 eu0Var = this.K;
        org.telegram.ui.ActionBar.w0 w0Var = this.k0;
        int i15 = 100;
        if (z18 && this.R0) {
            qt0 qt0Var = qt0VarArr[z4 ? 1 : 0];
            if (qt0Var.f == null) {
                qt0Var.f = new f2.b1();
            }
            qt0 qt0Var2 = qt0VarArr[z4 ? 1 : 0];
            b1Var2 = qt0Var2.f;
            ju0 ju0Var = this.P;
            ot0 ot0Var = this.g0;
            tt0 tt0Var = this.e0;
            tt0 tt0Var2 = this.f0;
            tt0 tt0Var3 = this.d0;
            if (z4) {
                int i16 = qt0Var2.C;
                if (i16 == 0 || i16 == 2 || i16 == 5 || i16 == 6 || (i16 == 7 && !jt0Var.T())) {
                    this.S0 = false;
                    ks0 ks0Var = this.G0;
                    if (ks0Var != null) {
                        ks0Var.g(false);
                    }
                    this.R0 = false;
                    m1(true);
                    return;
                }
                String obj = w0Var != null ? w0Var.getSearchField().getText().toString() : "";
                int i17 = qt0VarArr[z4 ? 1 : 0].C;
                if (i17 == 1) {
                    if (tt0Var3 != null) {
                        tt0Var3.G(obj, false);
                        if (adapter != tt0Var3) {
                            W0(adapter);
                            qt0VarArr[z4 ? 1 : 0].h.setAdapter(tt0Var3);
                        }
                    }
                } else if (i17 == 3) {
                    if (tt0Var2 != null) {
                        tt0Var2.G(obj, false);
                        if (adapter != tt0Var2) {
                            W0(adapter);
                            qt0VarArr[z4 ? 1 : 0].h.setAdapter(tt0Var2);
                        }
                    }
                } else if (i17 == 4) {
                    if (tt0Var != null) {
                        tt0Var.G(obj, false);
                        if (adapter != tt0Var) {
                            W0(adapter);
                            qt0VarArr[z4 ? 1 : 0].h.setAdapter(tt0Var);
                        }
                    }
                } else if (i17 == 7) {
                    if (ot0Var != null) {
                        ot0Var.F(obj, false);
                        if (adapter != ot0Var) {
                            W0(adapter);
                            qt0VarArr[z4 ? 1 : 0].h.setAdapter(ot0Var);
                        }
                    }
                } else if (i17 == 11) {
                    if (ju0Var != null) {
                        ju0Var.E(this.T0, obj);
                        if (adapter != ju0Var) {
                            W0(adapter);
                            qt0VarArr[z4 ? 1 : 0].h.setAdapter(ju0Var);
                        }
                    }
                } else if (i17 == 15 && eu0Var != null && adapter != eu0Var) {
                    W0(adapter);
                    wr0 wr0Var = qt0VarArr[z4 ? 1 : 0].h;
                    eu0Var.r = wr0Var;
                    wr0Var.setAdapter(eu0Var);
                }
            } else if (qt0Var2.h != null) {
                int i18 = qt0Var2.C;
                if (i18 == 1) {
                    if (adapter != tt0Var3) {
                        W0(adapter);
                        qt0VarArr[z4 ? 1 : 0].h.setAdapter(tt0Var3);
                    }
                    tt0Var3.l();
                } else if (i18 == 3) {
                    if (adapter != tt0Var2) {
                        W0(adapter);
                        qt0VarArr[z4 ? 1 : 0].h.setAdapter(tt0Var2);
                    }
                    tt0Var2.l();
                } else if (i18 == 4) {
                    if (adapter != tt0Var) {
                        W0(adapter);
                        qt0VarArr[z4 ? 1 : 0].h.setAdapter(tt0Var);
                    }
                    tt0Var.l();
                } else if (i18 == 7) {
                    if (adapter != ot0Var) {
                        W0(adapter);
                        qt0VarArr[z4 ? 1 : 0].h.setAdapter(ot0Var);
                    }
                    ot0Var.l();
                } else if (i18 == 11) {
                    if (adapter != ju0Var) {
                        W0(adapter);
                        qt0VarArr[z4 ? 1 : 0].h.setAdapter(ju0Var);
                    }
                    ju0Var.l();
                }
            }
            qt0VarArr2 = qt0VarArr;
            z16 = false;
            z15 = false;
            i11 = 100;
        } else {
            qt0 qt0Var3 = qt0VarArr[z4 ? 1 : 0];
            if (qt0Var3.e == null) {
                qt0Var3.e = new f2.b1();
            }
            qt0 qt0Var4 = qt0VarArr[z4 ? 1 : 0];
            f2.b1 b1Var3 = qt0Var4.e;
            qt0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i19 = qt0VarArr[z4 ? 1 : 0].C;
            if (i19 == 8 || w0(i19)) {
                layoutParams.topMargin = AndroidUtilities.dp(B0());
            }
            wr0 wr0Var2 = qt0VarArr[z4 ? 1 : 0].h;
            int paddingLeft = wr0Var2.getPaddingLeft();
            qt0 qt0Var5 = qt0VarArr[z4 ? 1 : 0];
            wr0 wr0Var3 = qt0Var5.h;
            int Z = Z(qt0Var5.C);
            wr0Var3.a3 = Z;
            int paddingRight = qt0VarArr[z4 ? 1 : 0].h.getPaddingRight();
            qt0VarArr2 = qt0VarArr;
            wr0 wr0Var4 = qt0VarArr2[z4 ? 1 : 0].h;
            int Y = Y(v0());
            wr0Var4.b3 = Y;
            wr0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
            int i20 = qt0VarArr2[z4 ? 1 : 0].C;
            int[] iArr = this.j1;
            f2.o0 o0Var2 = this.H;
            View view = this.R;
            dt0 dt0Var = this.Q;
            hu0 hu0Var = this.O;
            it0 it0Var = this.M;
            nu0[] nu0VarArr2 = this.q1;
            if (i20 == 0) {
                f2.o0 o0Var3 = this.E;
                if (adapter != o0Var3) {
                    W0(adapter);
                    qt0VarArr2[z4 ? 1 : 0].h.setAdapter(o0Var3);
                }
                int i21 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i21;
                layoutParams.leftMargin = i21;
                nu0 nu0Var = nu0VarArr2[0];
                boolean z19 = nu0Var.h && !nu0Var.e.isEmpty();
                i15 = iArr[0];
                qt0VarArr2[z4 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.v0);
                nu0 nu0Var2 = nu0VarArr2[0];
                if (nu0Var2.x == null) {
                    nu0Var2.x = new f2.b1();
                }
                z12 = z19;
                b1Var = nu0VarArr2[0].x;
                z10 = false;
            } else {
                if (i20 == 1) {
                    nu0 nu0Var3 = nu0VarArr2[1];
                    z11 = nu0Var3.h && !nu0Var3.e.isEmpty();
                    if (adapter != o0Var2) {
                        W0(adapter);
                        qt0VarArr2[z4 ? 1 : 0].h.setAdapter(o0Var2);
                    }
                } else if (i20 == 2) {
                    nu0 nu0Var4 = nu0VarArr2[2];
                    z11 = nu0Var4.h && !nu0Var4.e.isEmpty();
                    if (adapter != this.I) {
                        W0(adapter);
                        qt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.I);
                    }
                } else {
                    if (i20 == 3) {
                        if (adapter != this.G) {
                            W0(adapter);
                            qt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.G);
                        }
                    } else if (i20 == 4) {
                        nu0 nu0Var5 = nu0VarArr2[4];
                        z11 = nu0Var5.h && !nu0Var5.e.isEmpty();
                        if (adapter != this.J) {
                            W0(adapter);
                            qt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.J);
                        }
                    } else {
                        if (i20 == 5) {
                            if (adapter != this.L) {
                                W0(adapter);
                                qt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.L);
                            }
                        } else if (i20 == 15) {
                            if (adapter != eu0Var) {
                                W0(adapter);
                                wr0 wr0Var5 = qt0VarArr2[z4 ? 1 : 0].h;
                                eu0Var.r = wr0Var5;
                                wr0Var5.setAdapter(eu0Var);
                            }
                        } else if (i20 == 6) {
                            if (adapter != it0Var) {
                                W0(adapter);
                                qt0VarArr2[z4 ? 1 : 0].h.setAdapter(it0Var);
                            }
                        } else if (i20 == 7) {
                            if (adapter != this.U) {
                                W0(adapter);
                                qt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.U);
                            }
                        } else if (p0(i20)) {
                            f2.o0 k12 = k1(qt0VarArr2[z4 ? 1 : 0].C);
                            if (adapter != k12) {
                                W0(adapter);
                                qt0VarArr2[z4 ? 1 : 0].h.setAdapter(k12);
                                qt0VarArr2[z4 ? 1 : 0].h.getClass();
                            }
                            qt0 qt0Var6 = qt0VarArr2[z4 ? 1 : 0];
                            if (qt0Var6.C != 9) {
                                e0Var.d(qt0Var6.h);
                            }
                            i15 = iArr[1];
                        } else {
                            int i22 = qt0VarArr2[z4 ? 1 : 0].C;
                            if (i22 == 10) {
                                if (adapter != this.N) {
                                    W0(adapter);
                                    qt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.N);
                                }
                            } else if (i22 == 11) {
                                if (adapter != hu0Var) {
                                    W0(adapter);
                                    qt0VarArr2[z4 ? 1 : 0].h.setAdapter(hu0Var);
                                    f2.e0 e0Var2 = hu0Var.v;
                                    wr0 wr0Var6 = qt0VarArr2[z4 ? 1 : 0].h;
                                    hu0Var.s = wr0Var6;
                                    e0Var2.d(wr0Var6);
                                }
                                b1Var = hu0Var.r;
                                z10 = true;
                                z12 = false;
                            } else if (i22 == 12) {
                                if (adapter != null) {
                                    W0(adapter);
                                    qt0VarArr2[z4 ? 1 : 0].h.setAdapter(null);
                                }
                                if (dt0Var.getParent() != qt0VarArr2[z4 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(dt0Var);
                                    qt0VarArr2[z4 ? 1 : 0].addView(dt0Var, k7.b6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                }
                            } else if (i22 == 13) {
                                if (adapter != null) {
                                    W0(adapter);
                                    qt0VarArr2[z4 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != qt0VarArr2[z4 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    qt0VarArr2[z4 ? 1 : 0].addView(view);
                                }
                            } else if (i22 == 14) {
                                if (adapter != null) {
                                    W0(adapter);
                                    qt0VarArr2[z4 ? 1 : 0].h.setAdapter(null);
                                }
                                if (or0Var != null && or0Var.getParent() != qt0VarArr2[z4 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(or0Var);
                                    qt0VarArr2[z4 ? 1 : 0].addView(or0Var);
                                    qt0VarArr2[z4 ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        b1Var = b1Var3;
                        z10 = false;
                        z12 = false;
                    }
                    b1Var = b1Var3;
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                b1Var = b1Var3;
                z10 = true;
            }
            int i23 = qt0VarArr2[z4 ? 1 : 0].C;
            boolean z20 = i23 == 0 || p0(i23);
            f2.b1 b1Var4 = b1Var;
            qt0VarArr2[z4 ? 1 : 0].v.setLayoutParams(k7.b6.d(-1, -1.0f, 119, z20 ? 0.0f : 12.0f, (z20 ? 8 : 12) + 48, z20 ? 0.0f : 12.0f, z20 ? 0.0f : 12.0f));
            if (z10) {
                qt0VarArr2[z4 ? 1 : 0].h.setSections(false);
            } else {
                wr0 wr0Var7 = qt0VarArr2[z4 ? 1 : 0].h;
                wr0Var7.getClass();
                wr0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, wr0Var7.m2));
                wr0Var7.F2 = null;
                wr0Var7.I2 = 0.0f;
                wr0Var7.J2 = null;
                wr0Var7.K2 = null;
                wr0Var7.G2 = null;
                gl0 gl0Var = wr0Var7.E2;
                if (gl0Var != null) {
                    wr0Var7.p0(gl0Var);
                    wr0Var7.E2 = null;
                }
            }
            qt0 qt0Var7 = qt0VarArr2[z4 ? 1 : 0];
            int i24 = qt0Var7.C;
            org.telegram.ui.ActionBar.p2 p2Var = this.s1;
            if (i24 == 15) {
                z13 = z12;
                nu0VarArr = nu0VarArr2;
                str = "";
                qt0Var7.setBackground(ph.l5.e(qt0Var7.getBackground(), p2Var.getCurrentAccount(), this.g1, org.telegram.ui.ActionBar.j6.I.q()));
                qt0VarArr2[z4 ? 1 : 0].setOutlineProvider(new gg.j1(12));
                qt0VarArr2[z4 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z13 = z12;
                nu0VarArr = nu0VarArr2;
                str = "";
                qt0Var7.setClipToOutline(false);
                r52 = 0;
                qt0VarArr2[z4 ? 1 : 0].setBackground(null);
            }
            qt0 qt0Var8 = qt0VarArr2[z4 ? 1 : 0];
            if (qt0Var8.C == 11) {
                qt0Var8.h.setItemAnimator(qt0Var8.d);
            } else {
                qt0Var8.h.setItemAnimator(r52);
                if (hu0Var != null && qt0VarArr2[z4 ? 1 : 0].h == hu0Var.s) {
                    f2.e0 e0Var3 = hu0Var.v;
                    hu0Var.s = r52;
                    e0Var3.d(r52);
                }
            }
            if (dt0Var != null && qt0VarArr2[z4 ? 1 : 0].C != 12 && dt0Var.getParent() == qt0VarArr2[z4 ? 1 : 0]) {
                dt0Var.a.onRemoveFromParent();
                qt0VarArr2[z4 ? 1 : 0].removeView(dt0Var);
            }
            if (view != null && qt0VarArr2[z4 ? 1 : 0].C != 13) {
                ViewParent parent = view.getParent();
                qt0 qt0Var9 = qt0VarArr2[z4 ? 1 : 0];
                if (parent == qt0Var9) {
                    qt0Var9.removeView(view);
                }
            }
            if (or0Var != null && qt0VarArr2[z4 ? 1 : 0].C != 14) {
                ViewParent parent2 = or0Var.getParent();
                qt0 qt0Var10 = qt0VarArr2[z4 ? 1 : 0];
                if (parent2 == qt0Var10) {
                    qt0Var10.removeView(or0Var);
                }
            }
            int i25 = qt0VarArr2[z4 ? 1 : 0].C;
            if (i25 != 0 && i25 != 11 && !p0(i25) && (i12 = qt0VarArr2[z4 ? 1 : 0].C) != 2 && i12 != 5 && i12 != 6 && ((i12 != 7 || jt0Var.T()) && (i13 = qt0VarArr2[z4 ? 1 : 0].C) != 10 && i13 != 13 && i13 != 14)) {
                if (!z4) {
                    z17 = false;
                    if (w0Var != null) {
                        if (w0Var.getVisibility() == 4) {
                            if (D()) {
                                this.u0 = 0;
                                this.l0 = 1.0f;
                                w0Var.setVisibility(0);
                            } else {
                                w0Var.setVisibility(v0() ? 8 : 4);
                                this.l0 = 0.0f;
                            }
                        }
                        q1(z17);
                    }
                } else if (w0Var == null || w0Var.getVisibility() != 4 || this.D.k0) {
                    z17 = false;
                    this.u0 = 0;
                    this.l0 = 1.0f;
                } else {
                    if (D()) {
                        this.u0 = 1;
                        w0Var.setVisibility(0);
                    } else {
                        w0Var.setVisibility(v0() ? 8 : 4);
                    }
                    float f10 = z4 ? 1.0f : 0.0f;
                    this.l0 = b0(f10);
                    s1(1.0f - f10);
                    z17 = false;
                }
                q1(z17);
            } else if (z4) {
                this.u0 = 2;
            } else {
                this.u0 = 0;
                if (w0Var != null) {
                    w0Var.setVisibility((v0() || this.S0) ? 8 : 4);
                }
            }
            int i26 = qt0VarArr2[z4 ? 1 : 0].C;
            if (i26 == 6) {
                if (!it0Var.e && !it0Var.h && it0Var.d.isEmpty()) {
                    it0.E(it0Var, 0L);
                }
            } else if (i26 != 7) {
                if (p0(i26)) {
                    vu0 k13 = k1(qt0VarArr2[z4 ? 1 : 0].C);
                    if (k13 != null) {
                        nh.l6 l6Var = k13.s;
                        k13.P();
                        qt0VarArr2[z4 ? 1 : 0].w.e(l6Var != null && (l6Var.k() || (i0() && l6Var.g() > 0)), z4);
                        z14 = (l6Var == null || l6Var.g() <= 0 || t0()) ? false : true;
                    } else {
                        z14 = z13;
                    }
                    z13 = z14;
                } else {
                    int i27 = qt0VarArr2[z4 ? 1 : 0].C;
                    if (i27 != 10 && i27 != 11 && i27 != 12 && i27 != 13 && i27 != 14) {
                        if (i27 == 15) {
                            i27 = 8;
                        }
                        nu0 nu0Var6 = nu0VarArr[i27];
                        if (!nu0Var6.g && !nu0Var6.i[0] && nu0Var6.a.isEmpty()) {
                            nu0VarArr[i27].g = true;
                            o0Var2.l();
                            if (i27 == 0) {
                                int i28 = nu0VarArr[0].q;
                                if (i28 == 1) {
                                    i10 = 6;
                                } else if (i28 == 2) {
                                    i10 = 7;
                                }
                                p2Var.getMediaDataController().loadMedia(this.g1, 50, 0, 0, i10, this.C, 1, p2Var.getClassGuid(), nu0VarArr[i10].p, null, null);
                            }
                            i10 = i27;
                            p2Var.getMediaDataController().loadMedia(this.g1, 50, 0, 0, i10, this.C, 1, p2Var.getClassGuid(), nu0VarArr[i10].p, null, null);
                        }
                    }
                }
            }
            int i29 = qt0VarArr2[z4 ? 1 : 0].C;
            if (i29 == 8 || w0(i29)) {
                qt0 qt0Var11 = qt0VarArr2[z4 ? 1 : 0];
                hs0 hs0Var = qt0Var11.w;
                boolean w02 = w0(qt0Var11.C);
                int h12 = h1(qt0VarArr2[z4 ? 1 : 0].C);
                p9 p9Var = hs0Var.b;
                ph.d dVar = hs0Var.f;
                p9Var.setVisibility((w02 || u0() || r0()) ? 8 : 0);
                if (w02) {
                    dVar.setVisibility(0);
                    dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum));
                } else if (u0()) {
                    dVar.setVisibility(8);
                } else {
                    hs0Var.setStickerType(11);
                    dVar.setVisibility(!t0() ? 0 : 8);
                    dVar.h(w());
                }
                if (w02) {
                    hs0Var.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    hs0Var.e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    hs0Var.d.setText(LocaleController.getString(!t0() ? v0() ? R.string.NoPublicStoriesTitle2 : R.string.NoStoriesTitle : R.string.NoHashtagStoriesTitle));
                    hs0Var.e.setText(v0() ? LocaleController.getString(R.string.NoStoriesSubtitle2) : str);
                }
                dVar.setOnClickListener(new kh.q2(this, w02, h12, 1));
            } else {
                qt0 qt0Var12 = qt0VarArr2[z4 ? 1 : 0];
                if (qt0Var12.C == 9) {
                    if (u0()) {
                        qt0VarArr2[z4 ? 1 : 0].w.b.setVisibility(8);
                        qt0VarArr2[z4 ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        qt0VarArr2[z4 ? 1 : 0].w.b.setVisibility(0);
                        qt0VarArr2[z4 ? 1 : 0].w.setStickerType(11);
                        qt0VarArr2[z4 ? 1 : 0].w.f.setVisibility(0);
                        qt0VarArr2[z4 ? 1 : 0].w.f.h(w());
                    }
                    qt0VarArr2[z4 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    qt0VarArr2[z4 ? 1 : 0].w.e.setText(v0() ? LocaleController.getString(R.string.NoArchivedStoriesSubtitle) : str);
                    qt0VarArr2[z4 ? 1 : 0].w.f.setOnClickListener(new wq0(this, 7));
                } else {
                    qt0Var12.w.b.setVisibility(0);
                    qt0VarArr2[z4 ? 1 : 0].w.setStickerType(1);
                    qt0VarArr2[z4 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoResult));
                    qt0VarArr2[z4 ? 1 : 0].w.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    qt0VarArr2[z4 ? 1 : 0].w.f.setVisibility(8);
                }
            }
            z15 = false;
            qt0VarArr2[z4 ? 1 : 0].h.setVisibility(0);
            i11 = i15;
            z16 = z13;
            b1Var2 = b1Var4;
        }
        qt0 qt0Var13 = qt0VarArr2[z4 ? 1 : 0];
        qt0Var13.b = z16;
        o1(qt0Var13, z15);
        qt0VarArr2[z4 ? 1 : 0].x.y1(i11);
        qt0VarArr2[z4 ? 1 : 0].h.a0();
        if (b1Var2 != null) {
            qt0VarArr2[z4 ? 1 : 0].h.setRecycledViewPool(b1Var2);
            qt0VarArr2[z4 ? 1 : 0].r.setRecycledViewPool(b1Var2);
        }
        if (this.u0 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.D;
            if (kVar.k0) {
                this.w0 = true;
                kVar.h(true);
                this.u0 = 0;
                this.l0 = 0.0f;
                if (w0Var != null) {
                    w0Var.setVisibility(v0() ? 8 : 4);
                }
                q1(false);
            }
        }
    }

    public final void n0(ViewGroup viewGroup) {
        for (qt0 qt0Var : this.h0) {
            wr0 wr0Var = qt0Var.h;
            Objects.requireNonNull(wr0Var);
            qt0Var.n = new ng.k(wr0Var, viewGroup, new zv(wr0Var, 4));
        }
        or0 or0Var = this.S;
        if (or0Var != null) {
            or0Var.P = viewGroup;
            or0Var.O = new kh.o2(or0Var, 0);
        }
    }

    public final void n1() {
        ct0 ct0Var = this.E;
        if (ct0Var != null) {
            ct0Var.l();
        }
        lu0 lu0Var = this.H;
        if (lu0Var != null) {
            lu0Var.l();
        }
        lu0 lu0Var2 = this.I;
        if (lu0Var2 != null) {
            lu0Var2.l();
        }
        mu0 mu0Var = this.G;
        if (mu0Var != null) {
            mu0Var.X(false);
        }
        lu0 lu0Var3 = this.J;
        if (lu0Var3 != null) {
            lu0Var3.l();
        }
        eu0 eu0Var = this.K;
        if (eu0Var != null) {
            eu0Var.l();
        }
        lt0 lt0Var = this.L;
        if (lt0Var != null) {
            lt0Var.l();
        }
        ft0 ft0Var = this.W;
        if (ft0Var != null) {
            ft0Var.l();
        }
        Iterator it = this.V1.values().iterator();
        while (it.hasNext()) {
            ((xu0) it.next()).c.l();
        }
    }

    public final void o1(qt0 qt0Var, boolean z4) {
        boolean z10 = qt0Var.b && this.d;
        bl0 fastScroll = qt0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = qt0Var.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            qt0Var.c.cancel();
        }
        if (!z4) {
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setVisibility(z10 ? 0 : 8);
            fastScroll.setTag(z10 ? 1 : null);
            fastScroll.setAlpha(1.0f);
            fastScroll.setScaleX(1.0f);
            fastScroll.setScaleY(1.0f);
            return;
        }
        Property property = View.ALPHA;
        if (z10 && fastScroll.getTag() == null) {
            fastScroll.animate().setListener(null).cancel();
            if (fastScroll.getVisibility() != 0) {
                fastScroll.setVisibility(0);
                fastScroll.setAlpha(0.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<bl0, Float>) property, fastScroll.getAlpha(), 1.0f);
            qt0Var.c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r1);
            return;
        }
        if (z10 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<bl0, Float>) property, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new l00(fastScroll));
        qt0Var.c = ofFloat2;
        ofFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.h0;
            if (i10 >= qt0VarArr.length) {
                return;
            }
            wr0 wr0Var = qt0VarArr[i10].h;
            if (wr0Var != null) {
                wr0Var.getViewTreeObserver().addOnPreDrawListener(new ts0(this, i10, 0));
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return J() || this.F0.E || onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        jt0 jt0Var = this.A1;
        int height = jt0Var.f() != null ? jt0Var.f().getHeight() : 0;
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
            } else if (childAt instanceof qt0) {
                i12 = i10;
                measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                wr0 wr0Var = ((qt0) childAt).h;
                wr0Var.setPadding(0, wr0Var.V2, 0, wr0Var.W2);
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
        boolean z4;
        if (!this.I1) {
            org.telegram.ui.ActionBar.p2 p2Var = this.s1;
            if (p2Var.getParentLayout() != null && !((ActionBarLayout) p2Var.getParentLayout()).j() && !J() && !this.a) {
                if (motionEvent != null) {
                    if (this.y1 == null) {
                        this.y1 = VelocityTracker.obtain();
                    }
                    this.y1.addMovement(motionEvent);
                    k40 k40Var = this.B1;
                    if (k40Var != null) {
                        k40Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.u1 && !this.v1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.t1 = motionEvent.getPointerId(0);
                    this.v1 = true;
                    this.w1 = (int) motionEvent.getX();
                    this.x1 = (int) motionEvent.getY();
                    this.y1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.t1) {
                    int x10 = (int) (motionEvent.getX() - this.w1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.x1);
                    boolean z10 = this.u1;
                    qt0[] qt0VarArr = this.h0;
                    if (z10 && (((z4 = this.e1) && x10 > 0) || (!z4 && x10 < 0))) {
                        if (!U0(motionEvent, x10 < 0)) {
                            this.v1 = true;
                            this.u1 = false;
                            N0(false);
                            qt0VarArr[0].setTranslationX(0.0f);
                            qt0VarArr[1].setTranslationX(this.e1 ? qt0VarArr[0].getMeasuredWidth() : -qt0VarArr[0].getMeasuredWidth());
                            Z0(0.0f, qt0VarArr[1].C);
                            M0(getTabProgress());
                        }
                    }
                    if (!this.v1 || this.u1) {
                        if (this.u1) {
                            qt0VarArr[0].setTranslationX(x10);
                            if (this.e1) {
                                qt0VarArr[1].setTranslationX(qt0VarArr[0].getMeasuredWidth() + x10);
                            } else {
                                qt0VarArr[1].setTranslationX(x10 - qt0VarArr[0].getMeasuredWidth());
                            }
                            float abs2 = Math.abs(x10) / qt0VarArr[0].getMeasuredWidth();
                            if (D()) {
                                this.l0 = b0(abs2);
                                s1(abs2);
                                float a02 = a0(abs2);
                                this.m0 = a02;
                                this.o0.setVisibility((a02 == 0.0f || !D() || q0()) ? 4 : 0);
                            } else {
                                this.l0 = 0.0f;
                            }
                            q1(false);
                            Z0(abs2, qt0VarArr[1].C);
                            M0(getTabProgress());
                            L0();
                        }
                    } else if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                        U0(motionEvent, x10 < 0);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.t1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    g1(motionEvent);
                }
                return this.u1;
            }
        }
        return false;
    }

    public final void p1() {
        org.telegram.ui.ActionBar.w0 w0Var = this.q0;
        if (w0Var == null) {
            return;
        }
        boolean z4 = this.s1.getMessagesController().isPeerNoForwards(this.g1) || j0();
        w0Var.setAlpha(z4 ? 0.5f : 1.0f);
        if (z4 && w0Var.getBackground() != null) {
            w0Var.setBackground(null);
        } else {
            if (z4 || w0Var.getBackground() != null) {
                return;
            }
            w0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(h0(org.telegram.ui.ActionBar.j6.z8), 5, -1));
        }
    }

    public boolean q0() {
        return false;
    }

    public final void q1(boolean z4) {
        or0 or0Var;
        sr0 sr0Var;
        jj0 jj0Var = this.p0;
        if (jj0Var == null) {
            return;
        }
        float f10 = 0.0f;
        if (!this.S0 && (((or0Var = this.S) == null || !or0Var.g()) && ((sr0Var = this.T) == null || !sr0Var.w))) {
            f10 = Utilities.clamp(this.l0 + this.m0, 1.0f, 0.0f);
        }
        jj0Var.setAlpha(f10);
        if (z4) {
            A(a0(1.0f) > 0.5f, true);
        } else if (this.u0 == 2) {
            A(this.m0 > 0.1f, true);
        } else {
            A(this.l0 < 0.1f, true);
        }
    }

    public final boolean r0() {
        TLRPC.User user;
        long j10 = this.g1;
        return j10 > 0 && (user = MessagesController.getInstance(this.s1.getCurrentAccount()).getUser(Long.valueOf(j10))) != null && user.bot;
    }

    public final void r1(boolean z4) {
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.h0;
            if (i10 >= qt0VarArr.length) {
                return;
            }
            int childCount = qt0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = qt0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) childAt).b(false, z4);
                } else if (childAt instanceof org.telegram.ui.Cells.r7) {
                    ((org.telegram.ui.Cells.r7) childAt).i(false, z4);
                } else if (childAt instanceof org.telegram.ui.Cells.l7) {
                    ((org.telegram.ui.Cells.l7) childAt).f(false, z4);
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) childAt).e(false, z4);
                } else if (childAt instanceof org.telegram.ui.Cells.e2) {
                    ((org.telegram.ui.Cells.e2) childAt).c(false, z4);
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) childAt).V(false, z4);
                }
            }
            i10++;
        }
    }

    public final boolean s0(int i10) {
        return i10 == 7 ? this.A1.T() : (t0() || i10 == 0 || p0(i10) || i10 == 2 || i10 == 5 || i10 == 6 || i10 == 11 || i10 == 10 || i10 == 13 || i10 == 14) ? false : true;
    }

    public final void s1(float f10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.j0;
        if (w0Var == null) {
            return;
        }
        qt0[] qt0VarArr = this.h0;
        qt0 qt0Var = qt0VarArr[1];
        float f11 = 0.0f;
        if (qt0Var != null && qt0Var.C == 11) {
            f11 = 0.0f + f10;
        }
        qt0 qt0Var2 = qt0VarArr[0];
        if (qt0Var2 != null && qt0Var2.C == 11) {
            f11 += 1.0f - f10;
        }
        w0Var.setAlpha(f11);
        float f12 = (0.15f * f11) + 0.85f;
        w0Var.setScaleX(f12);
        w0Var.setScaleY(f12);
        w0Var.setVisibility(f11 <= 0.01f ? 8 : 0);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2 = this.a1;
        boolean z4 = chatFull2 != null && chatFull2.stories_pinned_available;
        this.a1 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.Z0 == 0) {
                this.Z0 = -j10;
                int i10 = 0;
                while (true) {
                    nu0[] nu0VarArr = this.q1;
                    if (i10 >= nu0VarArr.length) {
                        break;
                    }
                    if (nu0VarArr[i10].b[1].size() == 0) {
                        nu0 nu0Var = nu0VarArr[i10];
                        nu0Var.j[1] = this.a1.migrated_from_max_id;
                        nu0Var.i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.a1;
        if (chatFull3 == null || z4 == chatFull3.stories_pinned_available) {
            return;
        }
        ns0 ns0Var = this.F0;
        if (ns0Var != null) {
            ns0Var.setInitialTabId(q0() ? 9 : 8);
        }
        v1(true);
        m1(false);
    }

    public void setCommonGroupsCount(int i10) {
        if (this.C == 0) {
            this.U0[6] = i10;
        }
        v1(true);
        F();
    }

    public void setForwardRestrictedHint(k40 k40Var) {
        this.B1 = k40Var;
    }

    public void setMergeDialogId(long j10) {
        this.Z0 = j10;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i10 = 0;
        while (true) {
            iArr2 = this.U0;
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
        this.H1 = i11;
        int i14 = 0;
        while (true) {
            qt0[] qt0VarArr = this.h0;
            if (i14 >= qt0VarArr.length) {
                break;
            }
            qt0VarArr[i14].setTranslationY(this.H1);
            i14++;
        }
        if (this.M0 != null) {
            K();
        } else {
            js0 js0Var = this.O0;
            if (js0Var != null) {
                js0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
            }
        }
        this.L0 = i11;
        org.telegram.ui.Cells.v0 v0Var = this.H0;
        v0Var.setTranslationY((v0Var.getTag() == null ? -AndroidUtilities.dp(48.0f) : 0) + this.L0);
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.U1 != i10) {
            this.U1 = i10;
            qt0[] qt0VarArr = this.h0;
            if (qt0VarArr != null) {
                for (qt0 qt0Var : qt0VarArr) {
                    if (qt0Var != null) {
                        wr0 wr0Var = qt0Var.h;
                        int paddingLeft = wr0Var.getPaddingLeft();
                        wr0 wr0Var2 = qt0Var.h;
                        int i11 = wr0Var2.V2;
                        int paddingRight = wr0Var2.getPaddingRight();
                        wr0 wr0Var3 = qt0Var.h;
                        int Y = Y(v0());
                        wr0Var3.b3 = Y;
                        wr0Var.setPadding(paddingLeft, i11, paddingRight, Y);
                    }
                }
            }
        }
    }

    public void setPinnedToTop(boolean z4) {
        if (this.d == z4) {
            return;
        }
        this.d = z4;
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.h0;
            if (i10 >= qt0VarArr.length) {
                return;
            }
            o1(qt0VarArr[i10], true);
            i10++;
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        TLRPC.UserFull userFull2 = this.b1;
        boolean z4 = userFull2 != null && userFull2.stories_pinned_available;
        this.b1 = userFull;
        v1(true);
        if (userFull == null || z4 == userFull.stories_pinned_available) {
            return;
        }
        Y0(8);
    }

    public void setVisibleHeight(int i10) {
        this.J1 = i10;
        int i11 = 0;
        while (true) {
            qt0[] qt0VarArr = this.h0;
            if (i11 >= qt0VarArr.length) {
                break;
            }
            float f10 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(qt0VarArr[i11].C == 8 ? 280.0f : 120.0f)))) / 2.0f;
            qt0VarArr[i11].w.setTranslationY(f10);
            qt0VarArr[i11].v.setTranslationY(-f10);
            i11++;
        }
        nr0 nr0Var = this.R;
        if (nr0Var != null) {
            nr0Var.setVisibleHeight(i10);
        }
        or0 or0Var = this.S;
        if (or0Var != null) {
            or0Var.setVisibleHeight(i10);
        }
    }

    public boolean t0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void t1() {
        org.telegram.ui.ActionBar.w0 w0Var = this.j0;
        if (w0Var == null) {
            return;
        }
        qt0 qt0Var = this.h0[1];
        boolean z4 = qt0Var != null && qt0Var.C == 11;
        if (z4) {
            w0Var.setVisibility(0);
        }
        w0Var.animate().alpha(z4 ? 1.0f : 0.0f).scaleX(z4 ? 1.0f : 0.85f).scaleY(z4 ? 1.0f : 0.85f).withEndAction(new jh.f(27, this, z4)).setDuration(420L).setInterpolator(nr.h).start();
    }

    public boolean u0() {
        return false;
    }

    public final void u1() {
        boolean z4;
        nh.l6 l6Var;
        boolean r02 = r0();
        org.telegram.ui.ActionBar.w0 w0Var = this.t0;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.s0;
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
            SparseArray[] sparseArrayArr = this.W0;
            if (i10 >= sparseArrayArr[0].size()) {
                z4 = false;
                break;
            }
            MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i10);
            ft0 ft0Var = this.W;
            if (ft0Var != null && (l6Var = ft0Var.s) != null && !l6Var.m(messageObject.getId())) {
                z4 = true;
                break;
            }
            i10++;
        }
        if (w0Var2 != null) {
            w0Var2.setVisibility(z4 ? 0 : 8);
        }
        if (w0Var != null) {
            w0Var.setVisibility(z4 ? 8 : 0);
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
    public void v1(boolean z4) {
        char c3;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ProfileTab profileTab;
        TLRPC.ProfileTab profileTab2;
        int i10;
        boolean z10;
        int i11;
        boolean v02;
        int[] iArr;
        boolean z11;
        boolean z12;
        ns0 ns0Var;
        int selectedTab;
        boolean z13;
        boolean z14;
        long j10;
        TLRPC.UserFull userFull2;
        TLRPC.ChatFull chatFull2;
        Integer num;
        ns0 ns0Var2;
        boolean z15;
        int i12;
        int size;
        int i13;
        Boolean bool;
        String string;
        String str;
        String str2;
        or0 or0Var;
        char c10;
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
        qu0 qu0Var;
        ns0 ns0Var3 = this.F0;
        if (ns0Var3 == null) {
            return;
        }
        boolean z16 = !this.A1.q() ? false : z4;
        boolean z17 = (this.Q == null || (qu0Var = this.r1) == null || !qu0Var.f) ? false : true;
        org.telegram.ui.ActionBar.p2 p2Var = this.s1;
        long j11 = this.g1;
        if (j11 <= 0 || p2Var == null) {
            c3 = 4;
            user = null;
        } else {
            c3 = 4;
            user = p2Var.getMessagesController().getUser(Long.valueOf(j11));
        }
        boolean z18 = user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        boolean z19 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.b1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z18) ? false : true;
        boolean z20 = (DialogObject.isUserDialog(j11) || DialogObject.isChatDialog(j11)) && !DialogObject.isEncryptedDialog(j11) && (((userFull = this.b1) != null && userFull.stories_pinned_available) || (((chatFull = this.a1) != null && chatFull.stories_pinned_available) || v0())) && m0();
        or0 or0Var2 = this.S;
        boolean z21 = or0Var2 != null && (((userFull3 = this.b1) != null && userFull3.stargifts_count > 0) || ((chatFull3 = this.a1) != null && chatFull3.stargifts_count > 0));
        boolean z22 = z19;
        TLRPC.ChatFull chatFull4 = this.a1;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.b1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z23 = z16;
                int i17 = this.N1 == ns0Var3.k0 ? 1 : 0;
                int i18 = (!z20 || z22) == ns0Var3.d(8) ? i17 + 1 : i17;
                if (z18 != ns0Var3.d(13)) {
                    i18++;
                }
                int i19 = i18;
                i10 = t0() == ns0Var3.d(8) ? i19 + 1 : i19;
                if (z21 == ns0Var3.d(14)) {
                    i10++;
                } else if (or0Var2 != null && z21) {
                    z10 = z17;
                    i11 = 14;
                    if (this.M1 != or0Var2.getLastEmojisHash()) {
                        i10++;
                    }
                    v02 = v0();
                    ht0 ht0Var = this.U;
                    boolean z24 = z21;
                    int[] iArr2 = this.U0;
                    if (v02) {
                        iArr = iArr2;
                        z11 = false;
                        z12 = false;
                    } else {
                        iArr = iArr2;
                        int i20 = i10;
                        int i21 = (ht0Var.d == null) == ns0Var3.d(7) ? i20 + 1 : i20;
                        int i22 = (iArr[0] <= 0) == ns0Var3.d(0) ? i21 + 1 : i21;
                        int i23 = (iArr[1] <= 0) == ns0Var3.d(1) ? i22 + 1 : i22;
                        if (DialogObject.isEncryptedDialog(j11)) {
                            i15 = i23;
                        } else {
                            int i24 = i23;
                            int i25 = (iArr[3] <= 0) == ns0Var3.d(3) ? i24 + 1 : i24;
                            i15 = (iArr[c3] <= 0) == ns0Var3.d(4) ? i25 + 1 : i25;
                        }
                        int i26 = i16;
                        int i27 = (iArr[2] <= 0) == ns0Var3.d(2) ? i26 + 1 : i26;
                        int i28 = (iArr[5] <= 0) == ns0Var3.d(5) ? i27 + 1 : i27;
                        int i29 = (iArr[6] <= 0) == ns0Var3.d(6) ? i28 + 1 : i28;
                        boolean z25 = !this.N.d.isEmpty();
                        int i30 = i29;
                        i10 = z25 != ns0Var3.d(10) ? i30 + 1 : i30;
                        z11 = l0() && !p2Var.getMessagesController().getSavedMessagesController().unsupported && p2Var.getMessagesController().getSavedMessagesController().hasDialogs();
                        z12 = z25;
                        if (z11 != ns0Var3.d(11)) {
                            i10++;
                        }
                        if (z10 != ns0Var3.d(12)) {
                            i10++;
                        }
                    }
                    if (i10 > 0) {
                        if (z23) {
                            TransitionSet transitionSet = new TransitionSet();
                            transitionSet.setOrdering(0);
                            z13 = z11;
                            transitionSet.addTransition(new eg.j0(3));
                            z14 = z10;
                            j10 = j11;
                            transitionSet.setDuration(200L);
                            TransitionManager.beginDelayedTransition(ns0Var3.getTabsContainer(), transitionSet);
                            ns0Var3.R = ns0Var3.v;
                            ns0Var3.S = ns0Var3.w;
                        } else {
                            z13 = z11;
                            z14 = z10;
                            j10 = j11;
                        }
                        SparseArray g10 = ns0Var3.g();
                        if (i10 > 3) {
                            g10 = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (t0()) {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                            ns0Var3.V = 420L;
                        }
                        if (z22) {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                        } else if ((DialogObject.isUserDialog(j10) || DialogObject.isChatDialog(j10)) && !DialogObject.isEncryptedDialog(j10) && ((((userFull2 = this.b1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.a1) != null && chatFull2.stories_pinned_available) || v0())) && m0())) {
                            if (q0()) {
                                arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                                ns0Var3.V = 420L;
                            } else {
                                arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                                if (v0()) {
                                    arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                                }
                            }
                        }
                        if (z24) {
                            Integer valueOf = Integer.valueOf(i11);
                            String string2 = LocaleController.getString(R.string.ProfileGifts);
                            HashMap hashMap = kh.x3.Q;
                            lh.l7 l7Var = or0Var2.d;
                            if (l7Var == null) {
                                or0Var = or0Var2;
                                num = 0;
                                ns0Var2 = ns0Var3;
                                z15 = z14;
                                str2 = string2;
                                obj = "";
                            } else {
                                z15 = z14;
                                ArrayList arrayList2 = l7Var.l;
                                str2 = string2;
                                num = 0;
                                ns0Var2 = ns0Var3;
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
                                            spannableStringBuilder2.setSpan(new u5(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
                                            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                                            i32++;
                                            arrayList3 = arrayList3;
                                        }
                                        c10 = 0;
                                        hashMap.put(pair, spannableStringBuilder);
                                        obj3 = spannableStringBuilder;
                                        CharSequence[] charSequenceArr = new CharSequence[2];
                                        charSequenceArr[c10] = str2;
                                        charSequenceArr[1] = obj3;
                                        arrayList.add(new Pair(valueOf, TextUtils.concat(charSequenceArr)));
                                        this.M1 = or0Var.getLastEmojisHash();
                                    }
                                } else if (!l7Var.i || (obj2 = (CharSequence) hashMap.get(pair)) == null) {
                                    or0Var = or0Var2;
                                } else {
                                    or0Var = or0Var2;
                                    obj = obj2;
                                }
                                obj = "";
                            }
                            c10 = 0;
                            obj3 = obj;
                            CharSequence[] charSequenceArr2 = new CharSequence[2];
                            charSequenceArr2[c10] = str2;
                            charSequenceArr2[1] = obj3;
                            arrayList.add(new Pair(valueOf, TextUtils.concat(charSequenceArr2)));
                            this.M1 = or0Var.getLastEmojisHash();
                        } else {
                            num = 0;
                            ns0Var2 = ns0Var3;
                            z15 = z14;
                        }
                        if (z18) {
                            arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                        }
                        if (!v0()) {
                            if (z13) {
                                arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                            }
                            if (ht0Var.d != null) {
                                arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                            }
                            if (iArr[0] > 0) {
                                if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && ht0Var.d == null) {
                                    arrayList.add(new Pair(num, LocaleController.getString(R.string.SharedMediaTabFull2)));
                                } else {
                                    arrayList.add(new Pair(num, LocaleController.getString(R.string.SharedMediaTab2)));
                                }
                            }
                            if (z15) {
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
                            if (z12) {
                                arrayList.add(new Pair(10, LocaleController.getString(j11 > 0 ? R.string.SimilarBotsTab : R.string.SimilarChannelsTab)));
                            }
                        }
                        ns0Var = ns0Var2;
                        if (ns0Var.k0) {
                            boolean z26 = this.a1 instanceof TLRPC.TL_channelFull;
                            for (int i33 = 0; i33 < 15; i33++) {
                                if (d0(i33, z26) != null) {
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
                                    this.O1 = ((Integer) ((Pair) arrayList.get(i12)).first).intValue();
                                }
                                size = arrayList.size();
                                i13 = 0;
                                while (i13 < size) {
                                    Object obj4 = arrayList.get(i13);
                                    i13++;
                                    Pair pair2 = (Pair) obj4;
                                    if (!ns0Var.d(((Integer) pair2.first).intValue())) {
                                        ns0Var.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, g10);
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
                        ns0Var = ns0Var3;
                    }
                    selectedTab = getSelectedTab();
                    if (selectedTab >= 0) {
                        this.h0[0].C = selectedTab;
                    }
                    this.N1 = ns0Var.k0;
                    ns0Var.c();
                    L0();
                    I();
                }
                z10 = z17;
                i11 = 14;
                v02 = v0();
                ht0 ht0Var2 = this.U;
                boolean z242 = z21;
                int[] iArr22 = this.U0;
                if (v02) {
                }
                if (i10 > 0) {
                }
                selectedTab = getSelectedTab();
                if (selectedTab >= 0) {
                }
                this.N1 = ns0Var.k0;
                ns0Var.c();
                L0();
                I();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z232 = z16;
        if (this.N1 == ns0Var3.k0) {
        }
        int i172 = this.N1 == ns0Var3.k0 ? 1 : 0;
        if ((!z20 || z22) == ns0Var3.d(8)) {
        }
        if (z18 != ns0Var3.d(13)) {
        }
        int i192 = i18;
        if (t0() == ns0Var3.d(8)) {
        }
        if (z21 == ns0Var3.d(14)) {
        }
        z10 = z17;
        i11 = 14;
        v02 = v0();
        ht0 ht0Var22 = this.U;
        boolean z2422 = z21;
        int[] iArr222 = this.U0;
        if (v02) {
        }
        if (i10 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.N1 = ns0Var.k0;
        ns0Var.c();
        L0();
        I();
    }

    public final SpannableStringBuilder w() {
        if (this.T1 == null) {
            this.T1 = new SpannableStringBuilder();
            if (r0()) {
                this.T1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.T1.append((CharSequence) "c");
                this.T1.setSpan(new mq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.T1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.T1;
    }

    public final Boolean w1(View view, View view2) {
        if (this.l1) {
            return null;
        }
        qt0[] qt0VarArr = this.h0;
        qt0 qt0Var = qt0VarArr[0];
        if (qt0Var == null) {
            return null;
        }
        int i10 = qt0Var.C;
        this.m1 = i10;
        boolean p02 = p0(i10);
        int[] iArr = this.j1;
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
            } else if (c0(qt0VarArr[0].C) >= 5 || w0(qt0VarArr[0].C)) {
                SharedConfig.setStoriesColumnsCount(X);
            }
            B(X);
        }
        return Boolean.valueOf(X != X(p02 ? 1 : 0, X, true));
    }

    public final void x(o70 o70Var, org.telegram.ui.ActionBar.p2 p2Var, long j10, int i10) {
        String publicUsername = j10 > 0 ? UserObject.getPublicUsername(MessagesController.getInstance(p2Var.getCurrentAccount()).getUser(Long.valueOf(j10))) : ChatObject.getPublicUsername(MessagesController.getInstance(p2Var.getCurrentAccount()).getChat(Long.valueOf(-j10)));
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("https://");
        org.telegram.ui.yh.x(sb, MessagesController.getInstance(p2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb.append(i10);
        o70Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new hp(this, sb.toString(), p2Var, 17), false);
    }

    public final boolean x0() {
        if (C() && ((getClosestTab() == 8 || getClosestTab() == 13 || w0(getClosestTab())) && this.z1)) {
            return false;
        }
        or0 or0Var = this.S;
        if (or0Var != null && or0Var.g()) {
            return false;
        }
        sr0 sr0Var = this.T;
        return ((sr0Var != null && sr0Var.w) || this.l1 || this.d1) ? false : true;
    }

    public final Boolean x1(View view, View view2) {
        if (this.l1) {
            return null;
        }
        qt0[] qt0VarArr = this.h0;
        qt0 qt0Var = qt0VarArr[0];
        if (qt0Var == null) {
            return null;
        }
        if (this.h1 && p0(qt0Var.C)) {
            return null;
        }
        int i10 = qt0VarArr[0].C;
        this.m1 = i10;
        boolean p02 = p0(i10);
        int[] iArr = this.j1;
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
            } else if (c0(qt0VarArr[0].C) >= 5 || w0(qt0VarArr[0].C)) {
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
    public final void y(o70 o70Var) {
        qt0 qt0Var;
        int x10 = o70Var.x();
        final int i10 = 0;
        o70Var.c(R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn), new Runnable(this) { // from class: org.telegram.ui.Components.er0
            public final /* synthetic */ yu0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        yu0 yu0Var = this.b;
                        yu0Var.getClass();
                        View[] viewArr = r2;
                        yu0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        yu0 yu0Var2 = this.b;
                        yu0Var2.getClass();
                        View[] viewArr2 = r2;
                        yu0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        o70Var.c(R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut), new Runnable(this) { // from class: org.telegram.ui.Components.er0
            public final /* synthetic */ yu0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        yu0 yu0Var = this.b;
                        yu0Var.getClass();
                        View[] viewArr = r2;
                        yu0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        yu0 yu0Var2 = this.b;
                        yu0Var2.getClass();
                        View[] viewArr2 = r2;
                        yu0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final View[] viewArr = {o70Var.w(x10), o70Var.w(x10 + 1)};
        qt0[] qt0VarArr = this.h0;
        if (qt0VarArr != null && (qt0Var = qt0VarArr[0]) != null) {
            boolean p02 = p0(qt0Var.C);
            int i12 = this.j1[p02 ? 1 : 0];
        }
        viewArr[0].setEnabled(false);
        viewArr[0].setAlpha(0.5f);
        if (E()) {
            return;
        }
        viewArr[1].setEnabled(false);
        viewArr[1].setAlpha(0.5f);
    }

    public final void y0(int i10, int i11, int i12, boolean z4) {
        nu0[] nu0VarArr = this.q1;
        nu0VarArr[i10].a.clear();
        nu0VarArr[i10].b[0].clear();
        nu0VarArr[i10].b[1].clear();
        nu0 nu0Var = nu0VarArr[i10];
        nu0Var.j[0] = i11;
        nu0Var.i[0] = false;
        nu0Var.l = false;
        nu0Var.m = i12;
        nu0Var.n = (nu0Var.e() - i12) - 1;
        nu0 nu0Var2 = nu0VarArr[i10];
        if (nu0Var2.n < 0) {
            nu0Var2.n = 0;
        }
        nu0Var2.k = i11;
        nu0Var2.o = true;
        nu0Var2.g = false;
        nu0Var2.p++;
        qt0 W = W(i10);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (!z4) {
            return;
        }
        int i13 = 0;
        while (true) {
            qt0[] qt0VarArr = this.h0;
            if (i13 >= qt0VarArr.length) {
                return;
            }
            qt0 qt0Var = qt0VarArr[i13];
            if (qt0Var.C == i10) {
                qt0Var.x.h1(Math.min(nu0VarArr[i10].e() - 1, nu0VarArr[i10].m), 0);
            }
            i13++;
        }
    }

    public final void z(pt0 pt0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = pt0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = pt0Var.getChildAt(i11);
            if (childAt instanceof t00) {
                view = childAt;
            }
        }
        if (view != null) {
            pt0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new ss0(this, pt0Var, sparseBooleanArray, (t00) view, i10));
    }

    public final void z0(boolean z4) {
        long j10 = this.C;
        if (j10 != 0 || t0()) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            final int i11 = a2[i10];
            nu0[] nu0VarArr = this.q1;
            if (nu0VarArr[i11].h && !z4) {
                return;
            }
            long j11 = this.g1;
            if (DialogObject.isEncryptedDialog(j11)) {
                return;
            }
            nu0VarArr[i11].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i11 == 0) {
                int i12 = nu0VarArr[i11].q;
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
            org.telegram.ui.ActionBar.p2 p2Var = this.s1;
            tL_messages_getSearchResultsPositions.peer = p2Var.getMessagesController().getInputPeer(j11);
            if (j10 != 0 && p2Var.getUserConfig().getClientUserId() == j11) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = p2Var.getMessagesController().getInputPeer(j10);
            }
            final int i13 = nu0VarArr[i11].p;
            ConnectionsManager.getInstance(p2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(p2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() { // from class: org.telegram.ui.Components.tq0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new ar0(yu0.this, tL_error, i13, i11, tLObject, 0));
                }
            }), p2Var.getClassGuid());
        }
    }

    public void D0(SparseArray sparseArray) {
    }

    public void E0() {
    }

    public void K0(boolean z4) {
    }

    public void N0(boolean z4) {
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
