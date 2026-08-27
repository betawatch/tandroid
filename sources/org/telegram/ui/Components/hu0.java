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
import android.view.KeyEvent;
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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class hu0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.l2 {
    public static final int[] Z1 = {0, 1, 2, 4};
    public static final sq0 a2 = new sq0(0);
    public final int A;
    public final ArrayList A0;
    public x30 A1;
    public final long B;
    public final ArrayList B0;
    public final org.telegram.ui.ActionBar.c6 B1;
    public final org.telegram.ui.ActionBar.k C;
    public final ArrayList C0;
    public final NotificationCenter.ObserversGroup C1;
    public final ls0 D;
    public final ArrayList D0;
    public boolean D1;
    public final bu0 E;
    public final vr0 E0;
    public final AnimationNotificationsLocker E1;
    public final vt0 F;
    public final sr0 F0;
    public km F1;
    public final ut0 G;
    public final org.telegram.ui.Cells.v0 G0;
    public int G1;
    public final ut0 H;
    public AnimatorSet H0;
    public boolean H1;
    public final ut0 I;
    public final bq0 I0;
    public int I1;
    public final nt0 J;
    public final ArrayList J0;
    public AnimatorSet J1;
    public final us0 K;
    public float K0;
    public final SparseArray K1;
    public final rs0 L;
    public final zr L0;
    public long L1;
    public final ps0 M;
    public final FrameLayout M0;
    public boolean M1;
    public final qt0 N;
    public final rr0 N0;
    public int N1;
    public final st0 O;
    public final int O0;
    public final cs0 O1;
    public final ms0 P;
    public final Paint P0;
    public jh.j6 P1;
    public final vq0 Q;
    public boolean Q0;
    public float Q1;
    public final wq0 R;
    public boolean R0;
    public boolean R1;
    public final ar0 S;
    public ig.q0 S0;
    public SpannableStringBuilder S1;
    public final qs0 T;
    public final int[] T0;
    public int T1;
    public final f2.f0 U;
    public int U0;
    public final HashMap U1;
    public final os0 V;
    public final SparseArray[] V0;
    public final HashMap V1;
    public final eu0 W;
    public int W0;
    public int W1;
    public boolean X0;
    public int X1;
    public long Y0;
    public final wg Y1;
    public TLRPC.ChatFull Z0;
    public boolean a;
    public final uq0 a0;
    public TLRPC.UserFull a1;
    public boolean b;
    public final eu0 b0;
    public AnimatorSet b1;
    public boolean c;
    public final ct0 c0;
    public boolean c1;
    public boolean d;
    public final ct0 d0;
    public boolean d1;
    public int e;
    public final ct0 e0;
    public boolean e1;
    public int f;
    public final xs0 f0;
    public final long f1;
    public final zs0[] g0;
    public boolean g1;
    public float h;
    public final org.telegram.ui.ActionBar.v0 h0;
    public boolean h1;
    public final org.telegram.ui.ActionBar.v0 i0;
    public final int[] i1;
    public final org.telegram.ui.ActionBar.v0 j0;
    public float j1;
    public float k0;
    public boolean k1;
    public float l0;
    public int l1;
    public final TextView m0;
    public int m1;
    public float n;
    public final ImageView n0;
    public final fr0 n1;
    public final ri0 o0;
    public float o1;
    public final org.telegram.ui.ActionBar.v0 p0;
    public final wt0[] p1;
    public final org.telegram.ui.ActionBar.v0 q0;
    public final zt0 q1;
    public boolean r;
    public final org.telegram.ui.ActionBar.v0 r0;
    public final org.telegram.ui.ActionBar.n2 r1;
    public int s;
    public final org.telegram.ui.ActionBar.v0 s0;
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
    public final x9 x0;
    public VelocityTracker x1;
    public final h00 y;
    public final ImageView y0;
    public boolean y1;
    public final org.telegram.ui.ActionBar.g2 z0;
    public final ss0 z1;

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
    /* JADX WARN: Type inference failed for: r10v8, types: [android.graphics.drawable.Drawable, f2.v0, org.telegram.ui.ActionBar.c6] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hu0(Context context, long j10, zt0 zt0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, org.telegram.ui.ActionBar.n2 n2Var, ss0 ss0Var, int i13, org.telegram.ui.ActionBar.c6 c6Var, jg.a aVar) {
        super(context);
        char c10;
        TLRPC.ProfileTab profileTab;
        int i14;
        wt0[] wt0VarArr;
        int i15;
        sr0 sr0Var;
        int i16;
        int i17;
        qt0 qt0Var;
        float f10;
        Context context2;
        org.telegram.ui.ActionBar.v0 v0Var;
        ?? r10;
        org.telegram.ui.ActionBar.c6 c6Var2;
        hu0 hu0Var;
        int i18;
        int i19;
        int i20;
        zs0[] zs0VarArr;
        View view;
        boolean N;
        hu0 hu0Var2;
        ar0 ar0Var;
        int i21;
        int i22;
        cr0 cr0Var;
        ys0 ys0Var;
        ys0 ys0Var2;
        ys0 ys0Var3;
        ys0 ys0Var4;
        ys0 ys0Var5;
        ys0 ys0Var6;
        ys0 ys0Var7;
        ys0 ys0Var8;
        ys0 ys0Var9;
        ys0 ys0Var10;
        ys0 ys0Var11;
        ys0 ys0Var12;
        ys0 ys0Var13;
        ys0 ys0Var14;
        ys0 ys0Var15;
        h00 h00Var;
        h00 h00Var2;
        h00 h00Var3;
        h00 h00Var4;
        iw0 iw0Var;
        iw0 iw0Var2;
        iw0 iw0Var3;
        iw0 iw0Var4;
        iw0 iw0Var5;
        iw0 iw0Var6;
        iw0 iw0Var7;
        iw0 iw0Var8;
        iw0 iw0Var9;
        iw0 iw0Var10;
        h00 h00Var5;
        ys0 ys0Var16;
        iw0 iw0Var11;
        ys0 ys0Var17;
        ys0 ys0Var18;
        zs0 zs0Var;
        cr0 cr0Var2;
        ys0 ys0Var19;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        TL_bots.BotInfo botInfo;
        hu0 hu0Var3 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        hu0Var3.x = new Rect();
        hu0Var3.g0 = new zs0[2];
        hu0Var3.A0 = new ArrayList(10);
        hu0Var3.B0 = new ArrayList(10);
        hu0Var3.C0 = new ArrayList(10);
        hu0Var3.D0 = new ArrayList(10);
        hu0Var3.I0 = new bq0(hu0Var3, 2);
        hu0Var3.J0 = new ArrayList();
        hu0Var3.P0 = new Paint();
        hu0Var3.V0 = new SparseArray[]{new SparseArray(), new SparseArray()};
        hu0Var3.g1 = false;
        hu0Var3.h1 = false;
        hu0Var3.i1 = new int[]{3, 3};
        hu0Var3.n1 = new fr0(hu0Var3);
        hu0Var3.o1 = -5.0f;
        hu0Var3.p1 = new wt0[9];
        hu0Var3.E1 = new AnimationNotificationsLocker();
        hu0Var3.K1 = new SparseArray();
        hu0Var3.N1 = -1;
        hu0Var3.O1 = new cs0(hu0Var3);
        hu0Var3.Q1 = 0.0f;
        hu0Var3.U1 = new HashMap();
        hu0Var3.V1 = new HashMap();
        og.c cVar = new og.c();
        cVar.a(hu0Var3.h0(org.telegram.ui.ActionBar.g6.d6));
        jg.a aVar2 = aVar == null ? new jg.a(cVar) : aVar;
        hu0Var3.A = i13;
        hu0Var3.B1 = c6Var;
        h00 h00Var6 = new h00(context);
        hu0Var3.y = h00Var6;
        h00Var6.setIsSingleCell(true);
        TLRPC.User user = n2Var.getMessagesController().getUser(Long.valueOf(j10));
        hu0Var3.q1 = zt0Var;
        hu0Var3.z1 = ss0Var;
        int[] iArr = zt0Var.c;
        long j11 = zt0Var.s;
        hu0Var3.B = j11;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j11 == 0 ? i10 : 0, iArr[7], iArr[8]};
        hu0Var3.T0 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            if (chatFull2 == null) {
                c10 = 5;
                profileTab = null;
                if (i11 != 14 || i11 == 10 || i11 == 11 || i11 == 6) {
                    hu0Var3.U0 = i11;
                } else if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    hu0Var3.U0 = 13;
                } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                    hu0Var3.U0 = 8;
                } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || hu0Var3.v0()))) {
                    hu0Var3.U0 = 8;
                } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                    if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                        int i28 = iArr2[1];
                        i23 = -1;
                        if (i28 == -1 || i28 > 0) {
                            hu0Var3.U0 = 1;
                        }
                    } else {
                        i23 = -1;
                    }
                    if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i27 = iArr2[c10]) == i23 || i27 > 0)) {
                        hu0Var3.U0 = 5;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i26 = iArr2[3]) == i23 || i26 > 0)) {
                        hu0Var3.U0 = 3;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i25 = iArr2[4]) == i23 || i25 > 0)) {
                        hu0Var3.U0 = 4;
                    } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i24 = iArr2[2]) == i23 || i24 > 0)) {
                        hu0Var3.U0 = 2;
                    } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || hu0Var3.v0())) {
                        hu0Var3.U0 = hu0Var3.getInitialTab();
                    } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                        int i29 = -1;
                        if (i11 == -1 || j11 != 0) {
                            int i30 = 0;
                            while (true) {
                                int[] iArr3 = hu0Var3.T0;
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
                            hu0Var3.U0 = i30;
                        } else {
                            hu0Var3.U0 = i11;
                        }
                    } else {
                        hu0Var3.U0 = 14;
                    }
                } else {
                    hu0Var3.U0 = 14;
                }
                hu0Var3.M0(i11);
                hu0Var3.Z0 = chatFull2;
                hu0Var3.a1 = userFull;
                if (chatFull2 != null) {
                    hu0Var3.Y0 = -chatFull2.migrated_from_chat_id;
                }
                hu0Var3.f1 = j10;
                i14 = 0;
                while (true) {
                    wt0VarArr = hu0Var3.p1;
                    if (i14 < wt0VarArr.length) {
                        break;
                    }
                    wt0VarArr[i14] = new wt0();
                    hu0Var3.p1[i14].j[0] = DialogObject.isEncryptedDialog(hu0Var3.f1) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    hu0Var3.p1[i14].j[1] = Integer.MAX_VALUE;
                    hu0Var3.R(i14);
                    if (hu0Var3.Y0 != 0 && hu0Var3.Z0 != null && hu0Var3.p1[i14].b[1].size() == 0) {
                        wt0 wt0Var = hu0Var3.p1[i14];
                        wt0Var.j[1] = hu0Var3.Z0.migrated_from_max_id;
                        wt0Var.i[1] = false;
                    }
                    i14++;
                }
                hu0Var3.r1 = n2Var;
                hu0Var3.C = n2Var.getActionBar();
                hu0Var3.i1[0] = hu0Var3.S0() > 0 ? SharedConfig.mediaColumnsCount : hu0Var3.S0();
                hu0Var3.i1[1] = hu0Var3.S0() > 0 ? SharedConfig.storiesColumnsCount : hu0Var3.S0();
                hu0Var3.C1 = n2Var.getNotificationCenter().createObserversGroup(hu0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
                for (i15 = 0; i15 < 10; i15++) {
                    if (i11 == 4) {
                        qr0 qr0Var = new qr0(hu0Var3, context);
                        qr0Var.P.c();
                        hu0Var3.C0.add(qr0Var);
                    }
                }
                hu0Var3.O0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
                hu0Var3.R0 = false;
                hu0Var3.S0 = null;
                sr0Var = hu0Var3.F0;
                if (sr0Var != null) {
                    sr0Var.g(false);
                }
                hu0Var3.Q0 = false;
                Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
                hu0Var3.u0 = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(hu0Var3.h0(org.telegram.ui.ActionBar.g6.b7), PorterDuff.Mode.MULTIPLY));
                vr0 vr0Var = hu0Var3.E0;
                int currentTabId = vr0Var == null ? vr0Var.getCurrentTabId() : i11;
                vr0 vr0Var2 = new vr0(hu0Var3, context, hu0Var3.B1);
                i16 = hu0Var3.U0;
                if (i16 != -1) {
                    vr0Var2.setInitialTabId(i16);
                    hu0Var3.U0 = -1;
                }
                vr0Var2.U = 320L;
                int i32 = org.telegram.ui.ActionBar.g6.Fh;
                int i33 = org.telegram.ui.ActionBar.g6.Eh;
                vr0Var2.H = i32;
                vr0Var2.I = i33;
                vr0Var2.d();
                vr0Var2.setUseMinimalWidth(true);
                vr0Var2.setDelegate(new xr0(hu0Var3));
                hu0Var3.E0 = vr0Var2;
                for (i17 = 1; i17 >= 0; i17--) {
                    hu0Var3.V0[i17].clear();
                }
                hu0Var3.W0 = 0;
                hu0Var3.J0.clear();
                qt0Var = hu0Var3.N;
                if (qt0Var != null) {
                    qt0Var.w.clear();
                }
                if (!(hu0Var3 instanceof n30)) {
                    org.telegram.ui.ActionBar.z n10 = hu0Var3.C.n();
                    n10.addOnLayoutChangeListener(new wr0(hu0Var3));
                    if (hu0Var3.f1 == hu0Var3.r1.getUserConfig().getClientUserId() && (hu0Var3.r1 instanceof o90) && hu0Var3.D()) {
                        hu0Var3.i0 = n10.a(11, R.drawable.outline_header_search);
                    }
                    org.telegram.ui.ActionBar.v0 a3 = n10.a(0, 0);
                    a3.F();
                    a3.D = new ds0(hu0Var3);
                    hu0Var3.j0 = a3;
                    a3.setTranslationY(AndroidUtilities.dp(10.0f));
                    sr0 sr0Var2 = hu0Var3.F0;
                    a3.setSearchFieldHint(LocaleController.getString((sr0Var2 != null && sr0Var2.a() && hu0Var3.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
                    a3.setContentDescription(LocaleController.getString("Search", R.string.Search));
                    a3.setVisibility(hu0Var3.v0() ? 8 : 4);
                }
                ImageView imageView = new ImageView(context);
                hu0Var3.n0 = imageView;
                imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
                imageView.setTranslationY(AndroidUtilities.dp(10.0f));
                imageView.setVisibility(4);
                if (!hu0Var3.q0() || hu0Var3.t0()) {
                    f10 = 2.0f;
                } else {
                    hu0Var3.C.addView(imageView, h7.z5.e(48, 56, 85));
                    ri0 ri0Var = new ri0(context);
                    hu0Var3.o0 = ri0Var;
                    ri0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    ri0Var.e(R.raw.options_to_search, 24, 24);
                    ri0Var.getAnimatedDrawable().B *= 2.0f;
                    ri0Var.getAnimatedDrawable().h = true;
                    f10 = 2.0f;
                    ri0Var.setColorFilter(new PorterDuffColorFilter(hu0Var3.h0(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.SRC_IN));
                    ri0Var.setVisibility(8);
                    hu0Var3.C.addView(ri0Var, h7.z5.e(48, 56, 85));
                }
                context2 = context;
                imageView.setOnClickListener(new ks0(hu0Var3, j10, c6Var, context));
                v0Var = hu0Var3.j0;
                if (v0Var != null) {
                    EditTextBoldCursor searchField = v0Var.getSearchField();
                    int i34 = org.telegram.ui.ActionBar.g6.G6;
                    searchField.setTextColor(hu0Var3.h0(i34));
                    searchField.setHintTextColor(hu0Var3.h0(org.telegram.ui.ActionBar.g6.Si));
                    searchField.setCursorColor(hu0Var3.h0(i34));
                }
                hu0Var3.t0 = 0;
                org.telegram.ui.ActionBar.n2 n2Var2 = hu0Var3.r1;
                zu0 zu0Var = (n2Var2 == null && (n2Var2.getFragmentView() instanceof zu0)) ? (zu0) hu0Var3.r1.getFragmentView() : null;
                x9 x9Var = new x9(context2, zu0Var);
                hu0Var3.x0 = x9Var;
                x9Var.setBackgroundColor(hu0Var3.h0(org.telegram.ui.ActionBar.g6.a7));
                x9Var.setAlpha(0.0f);
                x9Var.setClickable(true);
                x9Var.setVisibility(4);
                ImageView imageView2 = new ImageView(context2);
                hu0Var3.y0 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(true);
                hu0Var3.z0 = g2Var;
                imageView2.setImageDrawable(g2Var);
                int i35 = org.telegram.ui.ActionBar.g6.y8;
                g2Var.a(hu0Var3.h0(i35));
                int i36 = org.telegram.ui.ActionBar.g6.z8;
                imageView2.setBackground(org.telegram.ui.ActionBar.g6.e0(hu0Var3.h0(i36), 1));
                imageView2.setContentDescription(LocaleController.getString("Close", R.string.Close));
                x9Var.addView(imageView2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                hu0Var3.J0.add(imageView2);
                imageView2.setOnClickListener(new dq0(hu0Var3, 0));
                NumberTextView numberTextView = new NumberTextView(context2);
                hu0Var3.w0 = numberTextView;
                numberTextView.setTextSize(18);
                numberTextView.setTypeface(AndroidUtilities.bold());
                numberTextView.setTextColor(hu0Var3.h0(i35));
                x9Var.addView(numberTextView, h7.z5.m(1.0f, 0, -1, 18, 0, 0));
                hu0Var3.J0.add(numberTextView);
                if (!DialogObject.isEncryptedDialog(hu0Var3.f1)) {
                    if (!hu0Var3.v0()) {
                        org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(context2, hu0Var3.h0(i36), hu0Var3.h0(i35), false);
                        hu0Var3.q0 = v0Var2;
                        v0Var2.setIcon(R.drawable.msg_message);
                        v0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrGoToMessage));
                        v0Var2.setDuplicateParentStateEnabled(false);
                        x9Var.addView(v0Var2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        hu0Var3.J0.add(v0Var2);
                        v0Var2.setOnClickListener(new dq0(hu0Var3, 1));
                        org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(context2, hu0Var3.h0(i36), hu0Var3.h0(i35), false);
                        hu0Var3.p0 = v0Var3;
                        v0Var3.setIcon(R.drawable.msg_forward);
                        v0Var3.setContentDescription(LocaleController.getString(R.string.Forward));
                        v0Var3.setDuplicateParentStateEnabled(false);
                        x9Var.addView(v0Var3, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                        hu0Var3.J0.add(v0Var3);
                        v0Var3.setOnClickListener(new dq0(hu0Var3, 2));
                    }
                    org.telegram.ui.ActionBar.v0 v0Var4 = new org.telegram.ui.ActionBar.v0(context2, hu0Var3.h0(i36), hu0Var3.h0(i35), false);
                    hu0Var3.r0 = v0Var4;
                    v0Var4.setIcon(R.drawable.msg_pin);
                    v0Var4.setContentDescription(LocaleController.getString(R.string.PinMessage));
                    v0Var4.setDuplicateParentStateEnabled(false);
                    v0Var4.setVisibility(8);
                    x9Var.addView(v0Var4, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    hu0Var3.J0.add(v0Var4);
                    v0Var4.setOnClickListener(new dq0(hu0Var3, 3));
                    org.telegram.ui.ActionBar.v0 v0Var5 = new org.telegram.ui.ActionBar.v0(context2, hu0Var3.h0(i36), hu0Var3.h0(i35), false);
                    hu0Var3.s0 = v0Var5;
                    v0Var5.setIcon(R.drawable.msg_unpin);
                    v0Var5.setContentDescription(LocaleController.getString(R.string.UnpinMessage));
                    v0Var5.setDuplicateParentStateEnabled(false);
                    v0Var5.setVisibility(8);
                    x9Var.addView(v0Var5, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    hu0Var3.J0.add(v0Var5);
                    v0Var5.setOnClickListener(new dq0(hu0Var3, 4));
                    hu0Var3.p1();
                }
                org.telegram.ui.ActionBar.v0 v0Var6 = new org.telegram.ui.ActionBar.v0(context2, hu0Var3.h0(i36), hu0Var3.h0(i35), false);
                hu0Var3.h0 = v0Var6;
                v0Var6.setIcon(R.drawable.msg_delete);
                v0Var6.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
                v0Var6.setDuplicateParentStateEnabled(false);
                x9Var.addView(v0Var6, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                hu0Var3.J0.add(v0Var6);
                v0Var6.setOnClickListener(new dq0(hu0Var3, 5));
                hu0Var3.D = new ls0(hu0Var3, context2);
                hu0Var3.E = new bu0(hu0Var3, context2);
                hu0Var3.G = new ut0(hu0Var3, context2, 1);
                hu0Var3.H = new ut0(hu0Var3, context2, 2);
                hu0Var3.I = new ut0(hu0Var3, context2, 4);
                hu0Var3.J = new nt0(hu0Var3, context2, hu0Var3.r1.getCurrentAccount(), hu0Var3.r1.getResourceProvider());
                hu0Var3.K = new us0(hu0Var3, context2);
                hu0Var3.c0 = new ct0(hu0Var3, context2, 1);
                hu0Var3.d0 = new ct0(hu0Var3, context2, 4);
                hu0Var3.e0 = new ct0(hu0Var3, context2, 3);
                hu0Var3.f0 = new xs0(hu0Var3, context2);
                hu0Var3.L = new rs0(hu0Var3, context2);
                hu0Var3.M = new ps0(hu0Var3, context2);
                hu0Var3.N = new qt0(hu0Var3, context2);
                hu0Var3.O = new st0(hu0Var3, context2);
                if (!hu0Var3.v0() && !hu0Var3.l0() && hu0Var3.B == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", hu0Var3.r1.getUserConfig().getClientUserId());
                    bundle.putInt("chatMode", 3);
                    ms0 ms0Var = new ms0(hu0Var3, context2, hu0Var3.r1.getParentLayout(), bundle);
                    hu0Var3.P = ms0Var;
                    long j12 = hu0Var3.f1;
                    org.telegram.ui.sn snVar = ms0Var.a;
                    snVar.Z3 = j12;
                    snVar.La = true;
                    ms0Var.setClipToOutline(true);
                    ms0Var.setOutlineProvider(new ns0());
                }
                qs0 qs0Var = new qs0(hu0Var3, context2);
                hu0Var3.T = qs0Var;
                if (hu0Var3.B == 0) {
                    qs0Var.e = arrayList;
                    qs0Var.d = currentTabId != 7 ? null : chatFull2;
                }
                hu0Var3.V = new os0(hu0Var3, context2);
                hu0Var3.U = new f2.f0(new tq0(hu0Var3));
                hu0Var3.W = new eu0(hu0Var3, context2, false);
                hu0Var3.a0 = new uq0(hu0Var3, context2);
                hu0Var3.b0 = new eu0(hu0Var3, context2, true);
                hu0Var3.F = new vt0(hu0Var3, context2);
                if (!hu0Var3.r0()) {
                    hu0Var3.Q = new vq0(hu0Var3, context2, hu0Var3.r1, hu0Var3.f1);
                } else if (hu0Var3.r1 instanceof ProfileActivity) {
                    TextView textView = new TextView(context2);
                    hu0Var3.m0 = textView;
                    textView.setText(LocaleController.getString(R.string.Save).toUpperCase());
                    textView.setTypeface(AndroidUtilities.bold());
                    int i37 = org.telegram.ui.ActionBar.g6.Oh;
                    textView.setTextColor(hu0Var3.h0(i37));
                    textView.setTextSize(1, 15.0f);
                    textView.setGravity(17);
                    textView.setBackground(org.telegram.ui.ActionBar.g6.e0(org.telegram.ui.ActionBar.g6.l1(0.15f, hu0Var3.h0(i37)), 3));
                    textView.setPadding(AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f), 0);
                    hu0Var3.C.addView(textView, h7.z5.e(-2, 56, 85));
                    textView.setOnClickListener(new dq0(hu0Var3, 6));
                    textView.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setScaleX(0.4f);
                    textView.setScaleY(0.4f);
                    org.telegram.ui.ActionBar.n2 n2Var3 = hu0Var3.r1;
                    r10 = 0;
                    c6Var2 = c6Var;
                    wq0 wq0Var = new wq0(n2Var3.getCurrentAccount(), ((ProfileActivity) hu0Var3.r1).a(), context2, n2Var3, c6Var2, hu0Var3);
                    context2 = context2;
                    hu0 hu0Var4 = hu0Var3;
                    hu0Var4.R = wq0Var;
                    int dp = AndroidUtilities.dp(48.0f);
                    zr zrVar = hu0Var4.L0;
                    wq0Var.setPaddingTop(dp + (zrVar != null ? (int) zrVar.c(0.0f) : 0));
                    hu0Var4.S = new ar0(hu0Var4, context2, zu0Var, hu0Var4.getStoriesController().B(hu0Var4.f1, true), new zq0(hu0Var4, context2, n2Var, c6Var2));
                    hu0Var = hu0Var4;
                    hu0Var.setWillNotDraw(false);
                    i18 = 0;
                    i19 = -1;
                    i20 = 0;
                    while (true) {
                        zs0VarArr = hu0Var.g0;
                        if (i20 >= zs0VarArr.length) {
                            break;
                        }
                        if (i20 == 0 && (zs0Var = zs0VarArr[i20]) != null && (cr0Var2 = zs0Var.x) != null) {
                            i19 = cr0Var2.L0();
                            if (i19 != hu0Var.g0[i20].x.B() - 1) {
                                ys0Var19 = hu0Var.g0[i20].h;
                                lk0 lk0Var = (lk0) ys0Var19.K(i19);
                                if (lk0Var != null) {
                                    i18 = lk0Var.a.getTop();
                                } else {
                                    i19 = -1;
                                }
                            } else {
                                i21 = i18;
                                i22 = -1;
                                br0 br0Var = new br0(hu0Var, context2);
                                hu0Var.addView(br0Var, h7.z5.d(-1, -1.0f, 51, 0.0f, hu0Var.B0(), 0.0f, 0.0f));
                                if (i20 == 1) {
                                    br0Var.setTranslationX(AndroidUtilities.displaySize.x);
                                }
                                hu0Var.g0[i20] = br0Var;
                                cr0Var = new cr0(hu0Var, br0Var);
                                br0Var.x = cr0Var;
                                cr0Var.z1(new dr0(hu0Var, br0Var));
                                hu0Var.g0[i20].d = new f2.l();
                                hu0Var.g0[i20].d.n(280L);
                                hu0Var.g0[i20].d.o(er.h);
                                zs0 zs0Var2 = hu0Var.g0[i20];
                                zs0Var2.d.m = false;
                                zs0Var2.h = new er0(hu0Var, context2, br0Var, cr0Var);
                                ys0Var = hu0Var.g0[i20].h;
                                ys0Var.setFastScrollEnabled(1);
                                ys0Var2 = hu0Var.g0[i20].h;
                                ys0Var2.setScrollingTouchSlop(1);
                                ys0Var3 = hu0Var.g0[i20].h;
                                ys0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(f10));
                                ys0Var4 = hu0Var.g0[i20].h;
                                ys0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                                ys0Var5 = hu0Var.g0[i20].h;
                                ys0Var5.setItemAnimator(r10);
                                ys0Var6 = hu0Var.g0[i20].h;
                                ys0Var6.setClipToPadding(false);
                                ys0Var7 = hu0Var.g0[i20].h;
                                ys0Var7.setSectionsType(2);
                                ys0Var8 = hu0Var.g0[i20].h;
                                ys0Var8.setLayoutManager(cr0Var);
                                zs0 zs0Var3 = hu0Var.g0[i20];
                                ys0Var9 = zs0Var3.h;
                                zs0Var3.addView(ys0Var9, h7.z5.c(-1.0f, -1));
                                hu0Var.g0[i20].r = new ys0(context2, r10);
                                zs0 zs0Var4 = hu0Var.g0[i20];
                                ys0 ys0Var20 = zs0Var4.r;
                                gr0 gr0Var = new gr0(hu0Var);
                                zs0Var4.s = gr0Var;
                                ys0Var20.setLayoutManager(gr0Var);
                                zs0 zs0Var5 = hu0Var.g0[i20];
                                zs0Var5.addView(zs0Var5.r, h7.z5.c(-1.0f, -1));
                                hu0Var.g0[i20].r.setVisibility(8);
                                hu0Var.g0[i20].r.i(new hr0(br0Var));
                                ys0Var10 = hu0Var.g0[i20].h;
                                ys0Var10.i(new ir0(hu0Var, br0Var));
                                ys0Var11 = hu0Var.g0[i20].h;
                                ys0Var11.setOnItemClickListener(new hh.c3(hu0Var, br0Var, context2, j10, c6Var2, 2));
                                ys0Var12 = hu0Var.g0[i20].h;
                                ys0Var12.setOnScrollListener(new kr0(hu0Var, br0Var, cr0Var));
                                ys0Var13 = hu0Var.g0[i20].h;
                                ys0Var13.setOnItemLongClickListener(new lr0(hu0Var, br0Var));
                                if (i20 == 0 && i22 != -1) {
                                    cr0Var.h1(i22, i21);
                                }
                                ys0Var14 = hu0Var.g0[i20].h;
                                hu0Var.g0[i20].y = new mr0(context2, ys0Var14);
                                hu0Var.g0[i20].y.setVisibility(8);
                                ys0Var15 = hu0Var.g0[i20].h;
                                ys0Var15.D0(hu0Var.g0[i20].y, h7.z5.c(-1.0f, -1));
                                hu0Var.g0[i20].v = new nr0(hu0Var, context2, br0Var);
                                h00Var = hu0Var.g0[i20].v;
                                h00Var.g();
                                h00Var2 = hu0Var.g0[i20].v;
                                h00Var2.setClipToOutline(true);
                                h00Var3 = hu0Var.g0[i20].v;
                                h00Var3.setOutlineProvider(new or0());
                                if (i20 == 0) {
                                    hu0Var.g0[i20].setVisibility(8);
                                }
                                zs0 zs0Var6 = hu0Var.g0[i20];
                                h00Var4 = zs0Var6.v;
                                zs0Var6.w = new pr0(hu0Var, context2, h00Var4);
                                iw0Var = hu0Var.g0[i20].w;
                                iw0Var.d(8, false);
                                iw0Var2 = hu0Var.g0[i20].w;
                                iw0Var2.setAnimateLayoutChange(true);
                                zs0 zs0Var7 = hu0Var.g0[i20];
                                iw0Var3 = zs0Var7.w;
                                zs0Var7.addView(iw0Var3, h7.z5.c(-1.0f, -1));
                                iw0Var4 = hu0Var.g0[i20].w;
                                iw0Var4.setOnTouchListener(new kh.e(23));
                                iw0Var5 = hu0Var.g0[i20].w;
                                iw0Var5.e(true, false);
                                iw0Var6 = hu0Var.g0[i20].w;
                                iw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                iw0Var7 = hu0Var.g0[i20].w;
                                iw0Var7.f.setVisibility(8);
                                iw0Var8 = hu0Var.g0[i20].w;
                                iw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                iw0Var9 = hu0Var.g0[i20].w;
                                iw0Var9.f.setVisibility(8);
                                iw0Var10 = hu0Var.g0[i20].w;
                                h00Var5 = hu0Var.g0[i20].v;
                                iw0Var10.addView(h00Var5, h7.z5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                                ys0Var16 = hu0Var.g0[i20].h;
                                iw0Var11 = hu0Var.g0[i20].w;
                                ys0Var16.setEmptyView(iw0Var11);
                                ys0Var17 = hu0Var.g0[i20].h;
                                ys0Var17.m1(0, true);
                                zs0[] zs0VarArr2 = hu0Var.g0;
                                zs0 zs0Var8 = zs0VarArr2[i20];
                                ys0Var18 = zs0VarArr2[i20].h;
                                zs0Var8.A = new c2.x(ys0Var18, hu0Var.g0[i20].x);
                                i20++;
                                c6Var2 = c6Var;
                                i18 = i21;
                                i19 = i22;
                            }
                        }
                        i21 = i18;
                        i22 = i19;
                        br0 br0Var2 = new br0(hu0Var, context2);
                        hu0Var.addView(br0Var2, h7.z5.d(-1, -1.0f, 51, 0.0f, hu0Var.B0(), 0.0f, 0.0f));
                        if (i20 == 1) {
                        }
                        hu0Var.g0[i20] = br0Var2;
                        cr0Var = new cr0(hu0Var, br0Var2);
                        br0Var2.x = cr0Var;
                        cr0Var.z1(new dr0(hu0Var, br0Var2));
                        hu0Var.g0[i20].d = new f2.l();
                        hu0Var.g0[i20].d.n(280L);
                        hu0Var.g0[i20].d.o(er.h);
                        zs0 zs0Var22 = hu0Var.g0[i20];
                        zs0Var22.d.m = false;
                        zs0Var22.h = new er0(hu0Var, context2, br0Var2, cr0Var);
                        ys0Var = hu0Var.g0[i20].h;
                        ys0Var.setFastScrollEnabled(1);
                        ys0Var2 = hu0Var.g0[i20].h;
                        ys0Var2.setScrollingTouchSlop(1);
                        ys0Var3 = hu0Var.g0[i20].h;
                        ys0Var3.setPinnedSectionOffsetY(-AndroidUtilities.dp(f10));
                        ys0Var4 = hu0Var.g0[i20].h;
                        ys0Var4.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                        ys0Var5 = hu0Var.g0[i20].h;
                        ys0Var5.setItemAnimator(r10);
                        ys0Var6 = hu0Var.g0[i20].h;
                        ys0Var6.setClipToPadding(false);
                        ys0Var7 = hu0Var.g0[i20].h;
                        ys0Var7.setSectionsType(2);
                        ys0Var8 = hu0Var.g0[i20].h;
                        ys0Var8.setLayoutManager(cr0Var);
                        zs0 zs0Var32 = hu0Var.g0[i20];
                        ys0Var9 = zs0Var32.h;
                        zs0Var32.addView(ys0Var9, h7.z5.c(-1.0f, -1));
                        hu0Var.g0[i20].r = new ys0(context2, r10);
                        zs0 zs0Var42 = hu0Var.g0[i20];
                        ys0 ys0Var202 = zs0Var42.r;
                        gr0 gr0Var2 = new gr0(hu0Var);
                        zs0Var42.s = gr0Var2;
                        ys0Var202.setLayoutManager(gr0Var2);
                        zs0 zs0Var52 = hu0Var.g0[i20];
                        zs0Var52.addView(zs0Var52.r, h7.z5.c(-1.0f, -1));
                        hu0Var.g0[i20].r.setVisibility(8);
                        hu0Var.g0[i20].r.i(new hr0(br0Var2));
                        ys0Var10 = hu0Var.g0[i20].h;
                        ys0Var10.i(new ir0(hu0Var, br0Var2));
                        ys0Var11 = hu0Var.g0[i20].h;
                        ys0Var11.setOnItemClickListener(new hh.c3(hu0Var, br0Var2, context2, j10, c6Var2, 2));
                        ys0Var12 = hu0Var.g0[i20].h;
                        ys0Var12.setOnScrollListener(new kr0(hu0Var, br0Var2, cr0Var));
                        ys0Var13 = hu0Var.g0[i20].h;
                        ys0Var13.setOnItemLongClickListener(new lr0(hu0Var, br0Var2));
                        if (i20 == 0) {
                            cr0Var.h1(i22, i21);
                        }
                        ys0Var14 = hu0Var.g0[i20].h;
                        hu0Var.g0[i20].y = new mr0(context2, ys0Var14);
                        hu0Var.g0[i20].y.setVisibility(8);
                        ys0Var15 = hu0Var.g0[i20].h;
                        ys0Var15.D0(hu0Var.g0[i20].y, h7.z5.c(-1.0f, -1));
                        hu0Var.g0[i20].v = new nr0(hu0Var, context2, br0Var2);
                        h00Var = hu0Var.g0[i20].v;
                        h00Var.g();
                        h00Var2 = hu0Var.g0[i20].v;
                        h00Var2.setClipToOutline(true);
                        h00Var3 = hu0Var.g0[i20].v;
                        h00Var3.setOutlineProvider(new or0());
                        if (i20 == 0) {
                        }
                        zs0 zs0Var62 = hu0Var.g0[i20];
                        h00Var4 = zs0Var62.v;
                        zs0Var62.w = new pr0(hu0Var, context2, h00Var4);
                        iw0Var = hu0Var.g0[i20].w;
                        iw0Var.d(8, false);
                        iw0Var2 = hu0Var.g0[i20].w;
                        iw0Var2.setAnimateLayoutChange(true);
                        zs0 zs0Var72 = hu0Var.g0[i20];
                        iw0Var3 = zs0Var72.w;
                        zs0Var72.addView(iw0Var3, h7.z5.c(-1.0f, -1));
                        iw0Var4 = hu0Var.g0[i20].w;
                        iw0Var4.setOnTouchListener(new kh.e(23));
                        iw0Var5 = hu0Var.g0[i20].w;
                        iw0Var5.e(true, false);
                        iw0Var6 = hu0Var.g0[i20].w;
                        iw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                        iw0Var7 = hu0Var.g0[i20].w;
                        iw0Var7.f.setVisibility(8);
                        iw0Var8 = hu0Var.g0[i20].w;
                        iw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        iw0Var9 = hu0Var.g0[i20].w;
                        iw0Var9.f.setVisibility(8);
                        iw0Var10 = hu0Var.g0[i20].w;
                        h00Var5 = hu0Var.g0[i20].v;
                        iw0Var10.addView(h00Var5, h7.z5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                        ys0Var16 = hu0Var.g0[i20].h;
                        iw0Var11 = hu0Var.g0[i20].w;
                        ys0Var16.setEmptyView(iw0Var11);
                        ys0Var17 = hu0Var.g0[i20].h;
                        ys0Var17.m1(0, true);
                        zs0[] zs0VarArr22 = hu0Var.g0;
                        zs0 zs0Var82 = zs0VarArr22[i20];
                        ys0Var18 = zs0VarArr22[i20].h;
                        zs0Var82.A = new c2.x(ys0Var18, hu0Var.g0[i20].x);
                        i20++;
                        c6Var2 = c6Var;
                        i18 = i21;
                        i19 = i22;
                    }
                    view = hu0Var.S;
                    if (view != null) {
                        hu0Var.addView(view, h7.z5.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
                    }
                    org.telegram.ui.Cells.v0 v0Var7 = new org.telegram.ui.Cells.v0(context2);
                    hu0Var.G0 = v0Var7;
                    v0Var7.T((int) (System.currentTimeMillis() / 1000), false, false);
                    v0Var7.setAlpha(0.0f);
                    v0Var7.V(org.telegram.ui.ActionBar.g6.wc, org.telegram.ui.ActionBar.g6.kd);
                    v0Var7.setTranslationY(-AndroidUtilities.dp(48.0f));
                    hu0Var.addView(v0Var7, h7.z5.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                    N = hu0Var.N();
                    hu0Var2 = hu0Var;
                    if (!N) {
                        zr zrVar2 = new zr(context2);
                        hu0Var.L0 = zrVar2;
                        zrVar2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
                        lg.d b10 = aVar2.b(zrVar2, ng.c.m(c6Var));
                        b10.p(AndroidUtilities.dp(24.0f));
                        b10.o(AndroidUtilities.dp(7.0f));
                        zrVar2.setBlurredBackground(b10);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        hu0Var.M0 = frameLayout;
                        zrVar2.addView(frameLayout);
                        zrVar2.i(frameLayout, true, false);
                        zrVar2.setOnAnimatedHeightChangedListener(new bq0(hu0Var, 0));
                        rr0 rr0Var = new rr0(hu0Var, context2, n2Var, this, c6Var);
                        hu0Var.N0 = rr0Var;
                        frameLayout.addView(rr0Var);
                        zrVar2.setCallFragmentContextView(rr0Var);
                        hu0Var.addView(zrVar2, h7.z5.d(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
                        rr0Var.setDelegate(new cq0(hu0Var));
                        lg.d b11 = aVar2.b(hu0Var.E0, ng.c.m(c6Var));
                        b11.p(AndroidUtilities.dp(18.0f));
                        b11.o(AndroidUtilities.dp(6.666f));
                        hu0Var.E0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                        hu0Var.E0.setClipToPadding(false);
                        hu0Var.E0.setBackground(r10);
                        hu0Var.E0.setBlurredBackground(b11);
                        hu0Var.E0.setOpen(false);
                        hu0Var.addView(hu0Var.E0, h7.z5.d(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
                        Context context3 = hu0Var.getContext();
                        org.telegram.ui.ActionBar.n2 n2Var4 = hu0Var.r1;
                        hu0 hu0Var5 = hu0Var;
                        sr0 sr0Var3 = new sr0(n2Var4.getCurrentAccount(), hu0Var.l0() ? 0L : hu0Var.f1, context3, n2Var4, c6Var, hu0Var5);
                        hu0 hu0Var6 = hu0Var5;
                        hu0Var6.F0 = sr0Var3;
                        sr0Var3.d(aVar2, ng.c.m(c6Var));
                        sr0Var3.setShown(0.0f);
                        hu0Var6.addView(sr0Var3, h7.z5.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                        hu0Var6.addView(hu0Var6.x0, h7.z5.e(-1, 48, 51));
                        hu0Var2 = hu0Var6;
                    }
                    hu0Var2.v1(false);
                    hu0Var2.m1(false);
                    if (hu0Var2.T0[0] >= 0) {
                        hu0Var2.z0(false);
                    }
                    ar0Var = hu0Var2.S;
                    if (ar0Var != null && i12 > 0) {
                        ar0Var.setInitialTabId(i12);
                    }
                    hu0Var2.Y1 = new wg(hu0Var2, 2);
                }
                c6Var2 = c6Var;
                r10 = 0;
                hu0Var = hu0Var3;
                hu0Var.setWillNotDraw(false);
                i18 = 0;
                i19 = -1;
                i20 = 0;
                while (true) {
                    zs0VarArr = hu0Var.g0;
                    if (i20 >= zs0VarArr.length) {
                    }
                    zs0 zs0Var622 = hu0Var.g0[i20];
                    h00Var4 = zs0Var622.v;
                    zs0Var622.w = new pr0(hu0Var, context2, h00Var4);
                    iw0Var = hu0Var.g0[i20].w;
                    iw0Var.d(8, false);
                    iw0Var2 = hu0Var.g0[i20].w;
                    iw0Var2.setAnimateLayoutChange(true);
                    zs0 zs0Var722 = hu0Var.g0[i20];
                    iw0Var3 = zs0Var722.w;
                    zs0Var722.addView(iw0Var3, h7.z5.c(-1.0f, -1));
                    iw0Var4 = hu0Var.g0[i20].w;
                    iw0Var4.setOnTouchListener(new kh.e(23));
                    iw0Var5 = hu0Var.g0[i20].w;
                    iw0Var5.e(true, false);
                    iw0Var6 = hu0Var.g0[i20].w;
                    iw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                    iw0Var7 = hu0Var.g0[i20].w;
                    iw0Var7.f.setVisibility(8);
                    iw0Var8 = hu0Var.g0[i20].w;
                    iw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    iw0Var9 = hu0Var.g0[i20].w;
                    iw0Var9.f.setVisibility(8);
                    iw0Var10 = hu0Var.g0[i20].w;
                    h00Var5 = hu0Var.g0[i20].v;
                    iw0Var10.addView(h00Var5, h7.z5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                    ys0Var16 = hu0Var.g0[i20].h;
                    iw0Var11 = hu0Var.g0[i20].w;
                    ys0Var16.setEmptyView(iw0Var11);
                    ys0Var17 = hu0Var.g0[i20].h;
                    ys0Var17.m1(0, true);
                    zs0[] zs0VarArr222 = hu0Var.g0;
                    zs0 zs0Var822 = zs0VarArr222[i20];
                    ys0Var18 = zs0VarArr222[i20].h;
                    zs0Var822.A = new c2.x(ys0Var18, hu0Var.g0[i20].x);
                    i20++;
                    c6Var2 = c6Var;
                    i18 = i21;
                    i19 = i22;
                }
                view = hu0Var.S;
                if (view != null) {
                }
                org.telegram.ui.Cells.v0 v0Var72 = new org.telegram.ui.Cells.v0(context2);
                hu0Var.G0 = v0Var72;
                v0Var72.T((int) (System.currentTimeMillis() / 1000), false, false);
                v0Var72.setAlpha(0.0f);
                v0Var72.V(org.telegram.ui.ActionBar.g6.wc, org.telegram.ui.ActionBar.g6.kd);
                v0Var72.setTranslationY(-AndroidUtilities.dp(48.0f));
                hu0Var.addView(v0Var72, h7.z5.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                N = hu0Var.N();
                hu0Var2 = hu0Var;
                if (!N) {
                }
                hu0Var2.v1(false);
                hu0Var2.m1(false);
                if (hu0Var2.T0[0] >= 0) {
                }
                ar0Var = hu0Var2.S;
                if (ar0Var != null) {
                    ar0Var.setInitialTabId(i12);
                }
                hu0Var2.Y1 = new wg(hu0Var2, 2);
            }
            profileTab = chatFull2.main_tab;
        }
        c10 = 5;
        if (i11 != 14) {
        }
        hu0Var3.U0 = i11;
        hu0Var3.M0(i11);
        hu0Var3.Z0 = chatFull2;
        hu0Var3.a1 = userFull;
        if (chatFull2 != null) {
        }
        hu0Var3.f1 = j10;
        i14 = 0;
        while (true) {
            wt0VarArr = hu0Var3.p1;
            if (i14 < wt0VarArr.length) {
            }
            i14++;
        }
        hu0Var3.r1 = n2Var;
        hu0Var3.C = n2Var.getActionBar();
        hu0Var3.i1[0] = hu0Var3.S0() > 0 ? SharedConfig.mediaColumnsCount : hu0Var3.S0();
        hu0Var3.i1[1] = hu0Var3.S0() > 0 ? SharedConfig.storiesColumnsCount : hu0Var3.S0();
        hu0Var3.C1 = n2Var.getNotificationCenter().createObserversGroup(hu0Var3).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
        while (i15 < 10) {
        }
        hu0Var3.O0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        hu0Var3.R0 = false;
        hu0Var3.S0 = null;
        sr0Var = hu0Var3.F0;
        if (sr0Var != null) {
        }
        hu0Var3.Q0 = false;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        hu0Var3.u0 = drawable2;
        drawable2.setColorFilter(new PorterDuffColorFilter(hu0Var3.h0(org.telegram.ui.ActionBar.g6.b7), PorterDuff.Mode.MULTIPLY));
        vr0 vr0Var3 = hu0Var3.E0;
        if (vr0Var3 == null) {
        }
        vr0 vr0Var22 = new vr0(hu0Var3, context, hu0Var3.B1);
        i16 = hu0Var3.U0;
        if (i16 != -1) {
        }
        vr0Var22.U = 320L;
        int i322 = org.telegram.ui.ActionBar.g6.Fh;
        int i332 = org.telegram.ui.ActionBar.g6.Eh;
        vr0Var22.H = i322;
        vr0Var22.I = i332;
        vr0Var22.d();
        vr0Var22.setUseMinimalWidth(true);
        vr0Var22.setDelegate(new xr0(hu0Var3));
        hu0Var3.E0 = vr0Var22;
        while (i17 >= 0) {
        }
        hu0Var3.W0 = 0;
        hu0Var3.J0.clear();
        qt0Var = hu0Var3.N;
        if (qt0Var != null) {
        }
        if (!(hu0Var3 instanceof n30)) {
        }
        ImageView imageView3 = new ImageView(context);
        hu0Var3.n0 = imageView3;
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        imageView3.setTranslationY(AndroidUtilities.dp(10.0f));
        imageView3.setVisibility(4);
        if (hu0Var3.q0()) {
        }
        f10 = 2.0f;
        context2 = context;
        imageView3.setOnClickListener(new ks0(hu0Var3, j10, c6Var, context));
        v0Var = hu0Var3.j0;
        if (v0Var != null) {
        }
        hu0Var3.t0 = 0;
        org.telegram.ui.ActionBar.n2 n2Var22 = hu0Var3.r1;
        if (n2Var22 == null) {
        }
        x9 x9Var2 = new x9(context2, zu0Var);
        hu0Var3.x0 = x9Var2;
        x9Var2.setBackgroundColor(hu0Var3.h0(org.telegram.ui.ActionBar.g6.a7));
        x9Var2.setAlpha(0.0f);
        x9Var2.setClickable(true);
        x9Var2.setVisibility(4);
        ImageView imageView22 = new ImageView(context2);
        hu0Var3.y0 = imageView22;
        imageView22.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.g2 g2Var2 = new org.telegram.ui.ActionBar.g2(true);
        hu0Var3.z0 = g2Var2;
        imageView22.setImageDrawable(g2Var2);
        int i352 = org.telegram.ui.ActionBar.g6.y8;
        g2Var2.a(hu0Var3.h0(i352));
        int i362 = org.telegram.ui.ActionBar.g6.z8;
        imageView22.setBackground(org.telegram.ui.ActionBar.g6.e0(hu0Var3.h0(i362), 1));
        imageView22.setContentDescription(LocaleController.getString("Close", R.string.Close));
        x9Var2.addView(imageView22, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        hu0Var3.J0.add(imageView22);
        imageView22.setOnClickListener(new dq0(hu0Var3, 0));
        NumberTextView numberTextView2 = new NumberTextView(context2);
        hu0Var3.w0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(AndroidUtilities.bold());
        numberTextView2.setTextColor(hu0Var3.h0(i352));
        x9Var2.addView(numberTextView2, h7.z5.m(1.0f, 0, -1, 18, 0, 0));
        hu0Var3.J0.add(numberTextView2);
        if (!DialogObject.isEncryptedDialog(hu0Var3.f1)) {
        }
        org.telegram.ui.ActionBar.v0 v0Var62 = new org.telegram.ui.ActionBar.v0(context2, hu0Var3.h0(i362), hu0Var3.h0(i352), false);
        hu0Var3.h0 = v0Var62;
        v0Var62.setIcon(R.drawable.msg_delete);
        v0Var62.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        v0Var62.setDuplicateParentStateEnabled(false);
        x9Var2.addView(v0Var62, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        hu0Var3.J0.add(v0Var62);
        v0Var62.setOnClickListener(new dq0(hu0Var3, 5));
        hu0Var3.D = new ls0(hu0Var3, context2);
        hu0Var3.E = new bu0(hu0Var3, context2);
        hu0Var3.G = new ut0(hu0Var3, context2, 1);
        hu0Var3.H = new ut0(hu0Var3, context2, 2);
        hu0Var3.I = new ut0(hu0Var3, context2, 4);
        hu0Var3.J = new nt0(hu0Var3, context2, hu0Var3.r1.getCurrentAccount(), hu0Var3.r1.getResourceProvider());
        hu0Var3.K = new us0(hu0Var3, context2);
        hu0Var3.c0 = new ct0(hu0Var3, context2, 1);
        hu0Var3.d0 = new ct0(hu0Var3, context2, 4);
        hu0Var3.e0 = new ct0(hu0Var3, context2, 3);
        hu0Var3.f0 = new xs0(hu0Var3, context2);
        hu0Var3.L = new rs0(hu0Var3, context2);
        hu0Var3.M = new ps0(hu0Var3, context2);
        hu0Var3.N = new qt0(hu0Var3, context2);
        hu0Var3.O = new st0(hu0Var3, context2);
        if (!hu0Var3.v0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", hu0Var3.r1.getUserConfig().getClientUserId());
            bundle2.putInt("chatMode", 3);
            ms0 ms0Var2 = new ms0(hu0Var3, context2, hu0Var3.r1.getParentLayout(), bundle2);
            hu0Var3.P = ms0Var2;
            long j122 = hu0Var3.f1;
            org.telegram.ui.sn snVar2 = ms0Var2.a;
            snVar2.Z3 = j122;
            snVar2.La = true;
            ms0Var2.setClipToOutline(true);
            ms0Var2.setOutlineProvider(new ns0());
        }
        qs0 qs0Var2 = new qs0(hu0Var3, context2);
        hu0Var3.T = qs0Var2;
        if (hu0Var3.B == 0) {
        }
        hu0Var3.V = new os0(hu0Var3, context2);
        hu0Var3.U = new f2.f0(new tq0(hu0Var3));
        hu0Var3.W = new eu0(hu0Var3, context2, false);
        hu0Var3.a0 = new uq0(hu0Var3, context2);
        hu0Var3.b0 = new eu0(hu0Var3, context2, true);
        hu0Var3.F = new vt0(hu0Var3, context2);
        if (!hu0Var3.r0()) {
        }
        c6Var2 = c6Var;
        r10 = 0;
        hu0Var = hu0Var3;
        hu0Var.setWillNotDraw(false);
        i18 = 0;
        i19 = -1;
        i20 = 0;
        while (true) {
            zs0VarArr = hu0Var.g0;
            if (i20 >= zs0VarArr.length) {
            }
            zs0 zs0Var6222 = hu0Var.g0[i20];
            h00Var4 = zs0Var6222.v;
            zs0Var6222.w = new pr0(hu0Var, context2, h00Var4);
            iw0Var = hu0Var.g0[i20].w;
            iw0Var.d(8, false);
            iw0Var2 = hu0Var.g0[i20].w;
            iw0Var2.setAnimateLayoutChange(true);
            zs0 zs0Var7222 = hu0Var.g0[i20];
            iw0Var3 = zs0Var7222.w;
            zs0Var7222.addView(iw0Var3, h7.z5.c(-1.0f, -1));
            iw0Var4 = hu0Var.g0[i20].w;
            iw0Var4.setOnTouchListener(new kh.e(23));
            iw0Var5 = hu0Var.g0[i20].w;
            iw0Var5.e(true, false);
            iw0Var6 = hu0Var.g0[i20].w;
            iw0Var6.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
            iw0Var7 = hu0Var.g0[i20].w;
            iw0Var7.f.setVisibility(8);
            iw0Var8 = hu0Var.g0[i20].w;
            iw0Var8.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            iw0Var9 = hu0Var.g0[i20].w;
            iw0Var9.f.setVisibility(8);
            iw0Var10 = hu0Var.g0[i20].w;
            h00Var5 = hu0Var.g0[i20].v;
            iw0Var10.addView(h00Var5, h7.z5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
            ys0Var16 = hu0Var.g0[i20].h;
            iw0Var11 = hu0Var.g0[i20].w;
            ys0Var16.setEmptyView(iw0Var11);
            ys0Var17 = hu0Var.g0[i20].h;
            ys0Var17.m1(0, true);
            zs0[] zs0VarArr2222 = hu0Var.g0;
            zs0 zs0Var8222 = zs0VarArr2222[i20];
            ys0Var18 = zs0VarArr2222[i20].h;
            zs0Var8222.A = new c2.x(ys0Var18, hu0Var.g0[i20].x);
            i20++;
            c6Var2 = c6Var;
            i18 = i21;
            i19 = i22;
        }
        view = hu0Var.S;
        if (view != null) {
        }
        org.telegram.ui.Cells.v0 v0Var722 = new org.telegram.ui.Cells.v0(context2);
        hu0Var.G0 = v0Var722;
        v0Var722.T((int) (System.currentTimeMillis() / 1000), false, false);
        v0Var722.setAlpha(0.0f);
        v0Var722.V(org.telegram.ui.ActionBar.g6.wc, org.telegram.ui.ActionBar.g6.kd);
        v0Var722.setTranslationY(-AndroidUtilities.dp(48.0f));
        hu0Var.addView(v0Var722, h7.z5.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        N = hu0Var.N();
        hu0Var2 = hu0Var;
        if (!N) {
        }
        hu0Var2.v1(false);
        hu0Var2.m1(false);
        if (hu0Var2.T0[0] >= 0) {
        }
        ar0Var = hu0Var2.S;
        if (ar0Var != null) {
        }
        hu0Var2.Y1 = new wg(hu0Var2, 2);
    }

    public static ts0 M(int i10, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        ts0 ts0Var = new ts0(context, c6Var);
        TextView textView = ts0Var.a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return ts0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return ts0Var;
        }
        if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return ts0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return ts0Var;
        }
        if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return ts0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return ts0Var;
        }
        if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return ts0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return ts0Var;
        }
        if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return ts0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return ts0Var;
        }
        if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return ts0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return ts0Var;
        }
        ImageView imageView = ts0Var.b;
        if (i10 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
            return ts0Var;
        }
        if (i10 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return ts0Var;
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

    public static void g(hu0 hu0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        km kmVar = new km(hu0Var, i10, storyItem, 10);
        jh.s6 storiesController = hu0Var.getStoriesController();
        long j10 = hu0Var.f1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j10, arrayList);
        mc.a0(hu0Var.r1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), kmVar).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public jh.s6 getStoriesController() {
        return MessagesController.getInstance(this.r1.getCurrentAccount()).getStoriesController();
    }

    public static /* synthetic */ void h(hu0 hu0Var, TL_stories.StoryItem storyItem) {
        hu0Var.getStoriesController().o0(hu0Var.f1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        mc.a0(hu0Var.r1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(hu0 hu0Var, long j10, int i10, String str) {
        jh.f6 B = hu0Var.getStoriesController().B(j10, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((jh.k6) B.h.get(c10)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(hu0 hu0Var, TL_stories.StoryItem storyItem, jh.k6 k6Var) {
        hu0Var.getStoriesController().c(k6Var.a, hu0Var.f1, storyItem);
        AndroidUtilities.runOnUIThread(new lg0(13, hu0Var, k6Var), 100L);
    }

    public static void m(hu0 hu0Var, HashSet hashSet, TL_stories.StoryItem storyItem, b70 b70Var, jh.k6 k6Var) {
        String formatString;
        long j10 = hu0Var.f1;
        if (hashSet.contains(Integer.valueOf(k6Var.a))) {
            hu0Var.getStoriesController().c(k6Var.a, j10, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, k6Var.b);
        } else {
            jh.s6 storiesController = hu0Var.getStoriesController();
            int i10 = k6Var.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j10, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, k6Var.b);
        }
        mc.a0(hu0Var.r1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        b70Var.u();
    }

    public static void n(hu0 hu0Var, long j10, int i10) {
        jh.f6 B = hu0Var.getStoriesController().B(j10, true);
        int i11 = B.a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        jh.k6 k6Var = (jh.k6) B.h.remove(c10);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_deleteAlbum.album_id = k6Var.a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int p(View view) {
        if (view instanceof org.telegram.ui.Cells.o7) {
            return ((org.telegram.ui.Cells.o7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.f7) {
            return ((org.telegram.ui.Cells.f7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.e7) {
            return ((org.telegram.ui.Cells.e7) view).getMessage().getId();
        }
        return 0;
    }

    public static boolean p0(int i10) {
        return i10 == 8 || i10 == 9 || w0(i10);
    }

    public static void q(zs0 zs0Var, wt0[] wt0VarArr, boolean z10) {
        lg0 lg0Var;
        if (!z10) {
            if (zs0Var.C == null || (lg0Var = zs0Var.D) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(lg0Var);
            zs0Var.D.run();
            zs0Var.D = null;
            zs0Var.C = null;
            return;
        }
        if (SharedConfig.fastScrollHintCount <= 0 || zs0Var.C != null || zs0Var.E || zs0Var.h.getFastScroll() == null || !zs0Var.h.getFastScroll().T || zs0Var.h.getFastScroll().getVisibility() != 0 || wt0VarArr[0].e() < 50) {
            return;
        }
        SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
        zs0Var.E = true;
        Context context = zs0Var.getContext();
        zp0 zp0Var = new zp0(context);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        int i10 = org.telegram.ui.ActionBar.g6.pf;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        zp0Var.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.qf, false)));
        zp0Var.addView(textView, h7.z5.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        yp0 yp0Var = new yp0(context);
        yp0Var.a = new Random();
        Paint paint = new Paint(1);
        yp0Var.b = paint;
        Paint paint2 = new Paint(1);
        yp0Var.c = paint2;
        yp0Var.f = 1.0f;
        yp0Var.h = 0.0f;
        paint.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        Paint paint3 = new Paint();
        yp0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        yp0Var.e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        zp0Var.addView(yp0Var, h7.z5.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        zs0Var.C = zp0Var;
        zs0Var.addView(zp0Var, h7.z5.c(-2.0f, -2));
        zs0Var.C.setAlpha(0.0f);
        zs0Var.C.setScaleX(0.8f);
        zs0Var.C.setScaleY(0.8f);
        zs0Var.C.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        zs0Var.invalidate();
        lg0 lg0Var2 = new lg0(12, zs0Var, zp0Var);
        zs0Var.D = lg0Var2;
        AndroidUtilities.runOnUIThread(lg0Var2, 4000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(hu0 hu0Var) {
        hu0 hu0Var2;
        ArrayList arrayList;
        int i10;
        int i11;
        Bitmap bitmap;
        long j10 = hu0Var.f1;
        wt0[] wt0VarArr = hu0Var.p1;
        zs0 W = hu0Var.W(0);
        if (W != null && W.getMeasuredHeight() > 0 && W.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(W.getMeasuredWidth(), W.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e9) {
                FileLog.e(e9);
                bitmap = null;
            }
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                hu0Var.D1 = true;
                W.h.draw(new Canvas(bitmap2));
                View view = new View(W.getContext());
                view.setBackground(new BitmapDrawable(bitmap2));
                W.addView(view);
                hu0Var2 = hu0Var;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new ls(hu0Var2, view, W, bitmap2, 1)).start();
                W.h.setAlpha(0.0f);
                W.h.animate().alpha(1.0f).setUpdateListener(new v60(W, 20)).setDuration(200L).start();
                zt0 zt0Var = hu0Var2.q1;
                int[] iArr = zt0Var.c;
                arrayList = zt0Var.n[0].a;
                wt0 wt0Var = wt0VarArr[0];
                int[] iArr2 = wt0Var.f;
                iArr2[1] = 0;
                i10 = wt0Var.q;
                if (i10 != 0) {
                    iArr2[0] = iArr[0];
                } else if (i10 == 1) {
                    iArr2[0] = iArr[6];
                } else {
                    iArr2[0] = iArr[7];
                }
                wt0Var.h = false;
                hu0Var2.y0(0, !DialogObject.isEncryptedDialog(j10) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
                hu0Var2.z0(false);
                hu0Var2.z1.R();
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j10);
                for (i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    wt0 wt0Var2 = wt0VarArr[0];
                    int i12 = wt0Var2.q;
                    if (i12 == 0) {
                        wt0Var2.a(messageObject, 0, false, isEncryptedDialog);
                    } else if (i12 == 1) {
                        if (messageObject.isPhoto()) {
                            wt0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                        }
                    } else if (!messageObject.isPhoto()) {
                        wt0VarArr[0].a(messageObject, 0, false, isEncryptedDialog);
                    }
                }
            }
        }
        hu0Var2 = hu0Var;
        zt0 zt0Var2 = hu0Var2.q1;
        int[] iArr3 = zt0Var2.c;
        arrayList = zt0Var2.n[0].a;
        wt0 wt0Var3 = wt0VarArr[0];
        int[] iArr22 = wt0Var3.f;
        iArr22[1] = 0;
        i10 = wt0Var3.q;
        if (i10 != 0) {
        }
        wt0Var3.h = false;
        hu0Var2.y0(0, !DialogObject.isEncryptedDialog(j10) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        hu0Var2.z0(false);
        hu0Var2.z1.R();
        boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j10);
        while (i11 < arrayList.size()) {
        }
    }

    public static void t(hu0 hu0Var, int i10, boolean z10) {
        zs0[] zs0VarArr = hu0Var.g0;
        if (zs0VarArr[0].B == i10) {
            return;
        }
        zs0 zs0Var = zs0VarArr[1];
        zs0Var.B = i10;
        zs0Var.setVisibility(0);
        hu0Var.k0();
        hu0Var.m1(true);
        hu0Var.d1 = z10;
        hu0Var.L0();
        hu0Var.A(!hu0Var.s0(i10), true);
        hu0Var.q1(true);
    }

    public static int u(hu0 hu0Var, f2.q0 q0Var) {
        if (q0Var == hu0Var.V) {
            return 8;
        }
        if (q0Var == hu0Var.a0) {
            return 9;
        }
        for (gu0 gu0Var : hu0Var.U1.values()) {
            if (gu0Var.c == q0Var) {
                return gu0Var.a;
            }
        }
        return -1;
    }

    public static int v(hu0 hu0Var, f2.q0 q0Var) {
        if (q0Var == hu0Var.W) {
            return 8;
        }
        if (q0Var == hu0Var.b0) {
            return 9;
        }
        for (gu0 gu0Var : hu0Var.U1.values()) {
            if (gu0Var.d == q0Var) {
                return gu0Var.a;
            }
        }
        return -1;
    }

    public static boolean w0(int i10) {
        return (i10 & (-65536)) == 65536;
    }

    public final void A(boolean z10, boolean z11) {
        ri0 ri0Var = this.o0;
        if (ri0Var == null || this.R1 == z10) {
            return;
        }
        this.R1 = z10;
        if (z10 || ri0Var.getAnimatedDrawable().X >= 20) {
            ri0Var.getAnimatedDrawable().N(this.R1 ? 50 : 100);
        } else {
            ri0Var.getAnimatedDrawable().N(0);
        }
        if (z11) {
            ri0Var.getAnimatedDrawable().start();
        } else {
            ri0Var.getAnimatedDrawable().K(ri0Var.getAnimatedDrawable().f);
        }
    }

    public final void A0(int i10) {
        int i11;
        wt0[] wt0VarArr = this.p1;
        if (i10 == 0) {
            int i12 = wt0VarArr[0].q;
            i11 = i12 == 1 ? 6 : i12 == 2 ? 7 : 0;
        } else {
            i11 = i10 == 1 ? 1 : i10 == 2 ? 2 : i10 == 4 ? 4 : i10 == 5 ? 5 : 3;
        }
        wt0VarArr[i10].g = true;
        org.telegram.ui.ActionBar.n2 n2Var = this.r1;
        n2Var.getMediaDataController().loadMedia(this.f1, 50, 0, wt0VarArr[i10].k, i11, this.B, 1, n2Var.getClassGuid(), wt0VarArr[i10].p, null, null);
    }

    public final void B(int i10) {
        int i11;
        zs0 W = W(this.l1);
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
            ys0 ys0Var = W.r;
            int paddingLeft = ys0Var.getPaddingLeft();
            ys0 ys0Var2 = W.r;
            int Z = Z(W.B);
            ys0Var2.Z2 = Z;
            int paddingRight = W.r.getPaddingRight();
            ys0 ys0Var3 = W.r;
            int Y = Y(v0());
            ys0Var3.a3 = Y;
            ys0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.s.y1(i10);
            W.r.a0();
            int i12 = 0;
            while (true) {
                zs0[] zs0VarArr = this.g0;
                if (i12 >= zs0VarArr.length) {
                    break;
                }
                zs0 zs0Var = zs0VarArr[i12];
                if (zs0Var != null && ((i11 = zs0Var.B) == 0 || p0(i11))) {
                    AndroidUtilities.updateVisibleRows(zs0VarArr[i12].h);
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
            ofFloat.addUpdateListener(new ur0(this, W, i13));
            ofFloat.addListener(new nh.q2(this, p0(W.B) ? 1 : 0, i10, 2));
            ofFloat.setInterpolator(er.f);
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
        org.telegram.ui.ActionBar.n2 n2Var = this.r1;
        if (!r02) {
            return v0() || (n2Var != null && n2Var.getMessagesController().getStoriesController().h(j10));
        }
        TLRPC.User user = MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j10));
        return user != null && user.bot && user.bot_can_edit;
    }

    public final void C0(int i10, View view) {
        vq0 vq0Var;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        TLRPC.User user2;
        qt0 qt0Var = this.N;
        SparseArray[] sparseArrayArr = this.V0;
        org.telegram.ui.ActionBar.n2 n2Var = this.r1;
        final int i11 = 0;
        if (i10 != 101) {
            if (i10 == 100) {
                if (this.a1 != null && n2Var.getMessagesController().isUserNoForwards(this.a1)) {
                    x30 x30Var = this.A1;
                    if (x30Var != null) {
                        x30Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                        this.A1.f(view, true);
                        return;
                    }
                    return;
                }
                if (this.Z0 != null) {
                    TLRPC.Chat chat2 = n2Var.getMessagesController().getChat(Long.valueOf(this.Z0.id));
                    if (n2Var.getMessagesController().isChatNoForwards(chat2)) {
                        x30 x30Var2 = this.A1;
                        if (x30Var2 != null) {
                            x30Var2.setText((!ChatObject.isChannel(chat2) || chat2.megagroup) ? LocaleController.getString(R.string.ForwardsRestrictedInfoGroup) : LocaleController.getString(R.string.ForwardsRestrictedInfoChannel));
                            this.A1.f(view, true);
                            return;
                        }
                        return;
                    }
                }
                if (j0()) {
                    x30 x30Var3 = this.A1;
                    if (x30Var3 != null) {
                        x30Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                        this.A1.f(view, true);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("canSelectTopics", true);
                bundle.putInt("dialogsType", 3);
                org.telegram.ui.gy gyVar = new org.telegram.ui.gy(bundle);
                gyVar.y2 = new cq0(this);
                n2Var.presentFragment(gyVar);
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
                org.telegram.ui.rn rnVar = new org.telegram.ui.rn(bundle2);
                rnVar.H7 = messageObject.getId();
                long j10 = this.B;
                if (j10 != 0) {
                    wf.c.a(rnVar, MessagesStorage.TopicKey.of(dialogId, j10));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                n2Var.presentFragment(rnVar, false);
                return;
            }
            if (i10 == 103 || i10 == 104) {
                if (getClosestTab() == 8) {
                    os0 os0Var = this.V;
                    if (os0Var == null || os0Var.s == null) {
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
                    long j11 = savedMessagesController.allDialogs.get(i13).dialogId;
                    if (qt0Var.w.contains(Long.valueOf(j11))) {
                        arrayList2.add(Long.valueOf(j11));
                    }
                }
                if (savedMessagesController.updatePinned(arrayList2, i10 == 103, true)) {
                    int i14 = 0;
                    while (true) {
                        zs0[] zs0VarArr = this.g0;
                        if (i14 >= zs0VarArr.length) {
                            break;
                        }
                        zs0 zs0Var = zs0VarArr[i14];
                        if (zs0Var.B == 11) {
                            zs0Var.x.h1(0, 0);
                            break;
                        }
                        i14++;
                    }
                } else {
                    n2Var.showDialog(new ag.i1(33, n2Var.getCurrentAccount(), getContext(), n2Var, null));
                }
                L(true);
                return;
            }
            return;
        }
        boolean p02 = p0(getSelectedTab());
        int i15 = 13;
        org.telegram.ui.ActionBar.c6 c6Var = this.B1;
        if (p02 || getSelectedTab() == 13) {
            if (sparseArrayArr[0] != null) {
                if (!r0() || (vq0Var = this.Q) == null || vq0Var.getCurrentList() == null) {
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
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, c6Var);
                    String string = LocaleController.getString(arrayList3.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.N = string;
                    b2Var.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.Components.jq0
                        public final /* synthetic */ hu0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.ui.ActionBar.a2
                        public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i17) {
                            switch (i11) {
                                case 0:
                                    hu0 hu0Var = this.b;
                                    org.telegram.ui.ActionBar.n2 n2Var2 = hu0Var.r1;
                                    jh.s6 storiesController = n2Var2.getMessagesController().getStoriesController();
                                    long j12 = hu0Var.f1;
                                    ArrayList arrayList4 = arrayList3;
                                    storiesController.s(j12, arrayList4);
                                    mc.a0(n2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList4.size(), new Object[0])).j();
                                    hu0Var.L(false);
                                    break;
                                default:
                                    hu0 hu0Var2 = this.b;
                                    hu0Var2.getClass();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (i18 >= arrayList5.size()) {
                                            hu0Var2.L(true);
                                            break;
                                        } else {
                                            hu0Var2.r1.getMessagesController().deleteSavedDialog(((Long) arrayList5.get(i18)).longValue());
                                            i18++;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pc0(i15));
                    b2Var.show();
                    b2Var.h();
                    return;
                }
                jh.b6 currentList = vq0Var.getCurrentList();
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
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, c6Var);
                String string2 = LocaleController.getString(arrayList4.size() > 1 ? R.string.DeleteBotPreviewsTitle : R.string.DeleteBotPreviewTitle);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                b2Var2.N = string2;
                b2Var2.P = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList4.size(), new Object[0]);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new iq0(this, currentList, arrayList4, i11));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new pc0(12));
                b2Var2.show();
                b2Var2.h();
                return;
            }
            return;
        }
        if (getSelectedTab() != 11) {
            long j12 = this.f1;
            if (DialogObject.isEncryptedDialog(j12)) {
                encryptedChat = org.telegram.messenger.y1.n(n2Var.getMessagesController(), j12);
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
            y4.z(n2Var, user, chat, encryptedChat, null, this.Y0, null, this.V0, null, 0, 0, null, new bq0(this, r15 ? 1 : 0), null, this.B1);
            return;
        }
        SavedMessagesController savedMessagesController2 = n2Var.getMessagesController().getSavedMessagesController();
        final ArrayList arrayList5 = new ArrayList();
        for (int i18 = 0; i18 < savedMessagesController2.allDialogs.size(); i18++) {
            long j13 = savedMessagesController2.allDialogs.get(i18).dialogId;
            if (qt0Var.w.contains(Long.valueOf(j13))) {
                arrayList5.add(Long.valueOf(j13));
            }
        }
        String str = "";
        if (arrayList5.isEmpty()) {
            z10 = false;
        } else {
            Long l10 = (Long) arrayList5.get(0);
            long longValue = l10.longValue();
            z10 = longValue == n2Var.getUserConfig().getClientUserId();
            if (longValue < 0) {
                TLRPC.Chat chat4 = n2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat4 != null) {
                    str = chat4.title;
                }
            } else if (longValue >= 0 && (user2 = n2Var.getMessagesController().getUser(l10)) != null) {
                str = UserObject.isAnonymous(user2) ? LocaleController.getString(R.string.AnonymousForward) : UserObject.getUserName(user2);
            }
        }
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, c6Var);
        String formatString = arrayList5.size() == 1 ? LocaleController.formatString(z10 ? R.string.ClearHistoryMyNotesTitle : R.string.ClearHistoryTitleSingle2, str) : LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList5.size(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
        b2Var3.N = formatString;
        b2Var3.P = arrayList5.size() == 1 ? LocaleController.formatString(z10 ? R.string.ClearHistoryMyNotesMessage : R.string.ClearHistoryMessageSingle, str) : LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList5.size(), new Object[0]);
        String string3 = LocaleController.getString(R.string.Remove);
        final int i19 = r15 ? 1 : 0;
        alertDialog$Builder3.k(string3, new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.Components.jq0
            public final /* synthetic */ hu0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var22, int i172) {
                switch (i19) {
                    case 0:
                        hu0 hu0Var = this.b;
                        org.telegram.ui.ActionBar.n2 n2Var2 = hu0Var.r1;
                        jh.s6 storiesController = n2Var2.getMessagesController().getStoriesController();
                        long j122 = hu0Var.f1;
                        ArrayList arrayList42 = arrayList5;
                        storiesController.s(j122, arrayList42);
                        mc.a0(n2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList42.size(), new Object[0])).j();
                        hu0Var.L(false);
                        break;
                    default:
                        hu0 hu0Var2 = this.b;
                        hu0Var2.getClass();
                        int i182 = 0;
                        while (true) {
                            ArrayList arrayList52 = arrayList5;
                            if (i182 >= arrayList52.size()) {
                                hu0Var2.L(true);
                                break;
                            } else {
                                hu0Var2.r1.getMessagesController().deleteSavedDialog(((Long) arrayList52.get(i182)).longValue());
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
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
        }
    }

    public boolean D() {
        return !(this instanceof n30);
    }

    public final boolean E() {
        zs0 zs0Var;
        zs0[] zs0VarArr = this.g0;
        if (zs0VarArr == null || (zs0Var = zs0VarArr[0]) == null) {
            return false;
        }
        if (this.g1 && p0(zs0Var.B)) {
            return false;
        }
        boolean p02 = p0(zs0VarArr[0].B);
        int i10 = this.i1[p02 ? 1 : 0];
        return i10 != X(p02 ? 1 : 0, i10, false);
    }

    public final void F() {
        vr0 vr0Var = this.E0;
        if (vr0Var.e(vr0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = vr0Var.getFirstTabId();
        vr0Var.setInitialTabId(firstTabId);
        this.g0[0].B = firstTabId;
        m1(false);
    }

    public final void F0() {
        jh.j6 j6Var;
        jh.j6 j6Var2;
        this.C1.removeAllObservers();
        os0 os0Var = this.V;
        if (os0Var != null && (j6Var2 = os0Var.s) != null && j6Var2 != null) {
            j6Var2.z(os0Var.v);
        }
        uq0 uq0Var = this.a0;
        if (uq0Var != null && (j6Var = uq0Var.s) != null && j6Var != null) {
            j6Var.z(uq0Var.v);
        }
        Iterator it = this.U1.values().iterator();
        while (it.hasNext()) {
            fu0 fu0Var = ((gu0) it.next()).c;
            jh.j6 j6Var3 = fu0Var.s;
            if (j6Var3 != null && j6Var3 != null) {
                j6Var3.z(fu0Var.v);
            }
        }
    }

    public final void G(zs0 zs0Var, zk0 zk0Var, f2.k0 k0Var) {
        int i10;
        int i11;
        f2.o1 K;
        jh.j6 j6Var;
        if (this.k1 || this.F1 != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (zk0Var.getFastScroll() == null || !zk0Var.getFastScroll().n || currentTimeMillis - zs0Var.a >= 300) {
            zs0Var.a = currentTimeMillis;
            if ((this.R0 && this.Q0 && zs0Var.B != 11) || zs0Var.B == 7) {
                return;
            }
            int L0 = k0Var.L0();
            int abs = L0 == -1 ? 0 : Math.abs(k0Var.N0() - L0) + 1;
            int h = zk0Var.getAdapter() == null ? 0 : zk0Var.getAdapter().h();
            int i12 = zs0Var.B;
            int[] iArr = this.i1;
            wt0[] wt0VarArr = this.p1;
            if (i12 == 0 || i12 == 1 || i12 == 2 || i12 == 4) {
                h = wt0VarArr[i12].d() + wt0VarArr[i12].a.size();
                wt0 wt0Var = wt0VarArr[i12];
                if (wt0Var.h && wt0Var.e.size() > 2 && zs0Var.B == 0 && wt0VarArr[i12].a.size() != 0) {
                    float f10 = i12 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((zk0Var.getMeasuredHeight() / (zk0Var.getMeasuredWidth() / f10)) * f10 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((et0) wt0VarArr[i12].e.get(1)).b) {
                        measuredHeight = ((et0) wt0VarArr[i12].e.get(1)).b;
                    }
                    if ((L0 > h && L0 - h > measuredHeight) || ((i10 = L0 + abs) < wt0VarArr[i12].m && wt0VarArr[0].m - i10 > measuredHeight)) {
                        km kmVar = new km(this, i12, zk0Var, 12);
                        this.F1 = kmVar;
                        AndroidUtilities.runOnUIThread(kmVar);
                        return;
                    }
                }
            }
            int i13 = zs0Var.B;
            if (i13 == 7) {
                return;
            }
            if (p0(i13)) {
                eu0 k12 = k1(zs0Var.B);
                if (k12 == null || (j6Var = k12.s) == null || L0 + abs <= j6Var.i() - iArr[1]) {
                    return;
                }
                k12.P();
                return;
            }
            int i14 = zs0Var.B;
            if (i14 == 6) {
                if (abs > 0) {
                    rs0 rs0Var = this.L;
                    boolean z10 = rs0Var.h;
                    ArrayList arrayList = rs0Var.d;
                    if (z10 || rs0Var.e || arrayList.isEmpty() || L0 + abs < h - 5) {
                        return;
                    }
                    rs0.E(rs0Var, ((TLRPC.Chat) i0.a.i(1, arrayList)).id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var = this.r1;
            if (i14 == 11) {
                int i15 = -1;
                for (int i16 = 0; i16 < zs0Var.h.getChildCount(); i16++) {
                    View childAt = zs0Var.h.getChildAt(i16);
                    zs0Var.h.getClass();
                    i15 = Math.max(RecyclerView.R(childAt), i15);
                }
                f2.q0 adapter = zs0Var.h.getAdapter();
                st0 st0Var = this.O;
                if (adapter != st0Var) {
                    if (i15 + 1 >= n2Var.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                        n2Var.getMessagesController().getSavedMessagesController().loadDialogs(false);
                        return;
                    }
                    return;
                } else {
                    if (i15 + 1 < st0Var.h.size() + st0Var.e.size() || st0Var.s || st0Var.r) {
                        return;
                    }
                    st0Var.r = true;
                    st0Var.F();
                    return;
                }
            }
            if (i14 == 10 || i14 == 12 || i14 == 13 || i14 == 14) {
                return;
            }
            int i17 = i14 == 0 ? 3 : i14 == 5 ? 10 : 6;
            int i18 = i14 == 15 ? 8 : i14;
            if (abs + L0 > h - i17 || wt0VarArr[i18].o) {
                wt0 wt0Var2 = wt0VarArr[i18];
                if (!wt0Var2.g) {
                    if (i14 == 0) {
                        int i19 = wt0VarArr[0].q;
                        i11 = i19 == 1 ? 6 : i19 == 2 ? 7 : 0;
                    } else {
                        i11 = i14 == 1 ? 1 : i14 == 2 ? 2 : i14 == 4 ? 4 : i14 == 5 ? 5 : i14 == 15 ? 8 : 3;
                    }
                    boolean[] zArr = wt0Var2.i;
                    if (!zArr[0]) {
                        wt0Var2.g = true;
                        n2Var.getMediaDataController().loadMedia(this.f1, 50, wt0VarArr[i18].j[0], 0, i11, this.B, 1, n2Var.getClassGuid(), wt0VarArr[i18].p, null, null);
                    } else if (this.Y0 != 0 && !zArr[1]) {
                        wt0Var2.g = true;
                        n2Var.getMediaDataController().loadMedia(this.Y0, 50, wt0VarArr[i18].j[1], 0, i11, this.B, 1, n2Var.getClassGuid(), wt0VarArr[i18].p, null, null);
                    }
                }
            }
            int i20 = wt0VarArr[i18].m;
            if (i18 == 0) {
                i20 = this.D.L(0);
            }
            if (L0 - i20 < i17 + 1) {
                wt0 wt0Var3 = wt0VarArr[i18];
                if (!wt0Var3.g && !wt0Var3.l && !wt0Var3.o) {
                    A0(zs0Var.B);
                }
            }
            zs0 zs0Var2 = this.g0[0];
            if (zs0Var2.h == zk0Var) {
                int i21 = zs0Var2.B;
                if ((i21 != 0 && i21 != 5) || L0 == -1 || (K = zk0Var.K(L0)) == null) {
                    return;
                }
                int i22 = K.f;
                if (i22 == 0 || i22 == 12) {
                    View view = K.a;
                    boolean z11 = view instanceof org.telegram.ui.Cells.p7;
                    org.telegram.ui.Cells.v0 v0Var = this.G0;
                    if (!z11) {
                        if (view instanceof org.telegram.ui.Cells.d2) {
                            v0Var.T(((org.telegram.ui.Cells.d2) view).getDate(), false, true);
                        }
                    } else {
                        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                        MessageObject messageObject = p7Var.e <= 0 ? null : p7Var.b[0];
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
        ar0 ar0Var = this.S;
        if (ar0Var == null || !ar0Var.w) {
            int i12 = 0;
            i12 = 0;
            String str2 = null;
            if (this.y1) {
                int i13 = 8;
                if (i11 == 8 && !C()) {
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
                    org.telegram.ui.ActionBar.v0 v0Var = this.q0;
                    if (v0Var != null) {
                        v0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.p0;
                    if (v0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        v0Var2.setVisibility(i13);
                    }
                    u1();
                }
                this.X0 = false;
                if (view instanceof org.telegram.ui.Cells.f7) {
                    ((org.telegram.ui.Cells.f7) view).b(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.p7) {
                    ((org.telegram.ui.Cells.p7) view).b(0, sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0);
                } else if (view instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) view).f(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.e7) {
                    ((org.telegram.ui.Cells.e7) view).e(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.d2) {
                    ((org.telegram.ui.Cells.d2) view).c(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.o7) {
                    ((org.telegram.ui.Cells.o7) view).i(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                }
            } else {
                fr0 fr0Var = this.n1;
                wt0[] wt0VarArr = this.p1;
                org.telegram.ui.ActionBar.n2 n2Var = this.r1;
                if (i11 == 0) {
                    wt0 wt0Var = wt0VarArr[i11];
                    int i14 = i10 - wt0Var.m;
                    if (i14 >= 0 && i14 < wt0Var.a.size()) {
                        PhotoViewer.t1().K2(null, n2Var, null);
                        PhotoViewer.t1().a2(wt0VarArr[i11].a, i14, this.f1, this.Y0, this.B, fr0Var);
                    }
                } else if (i11 == 2 || i11 == 4) {
                    if (view instanceof org.telegram.ui.Cells.e7) {
                        ((org.telegram.ui.Cells.e7) view).a();
                    }
                } else if (i11 == 5) {
                    PhotoViewer.t1().K2(null, n2Var, null);
                    int indexOf = wt0VarArr[i11].a.indexOf(messageObject);
                    if (indexOf < 0) {
                        PhotoViewer.t1().a2(org.telegram.messenger.y1.m(messageObject), 0, 0L, 0L, 0L, fr0Var);
                    } else {
                        PhotoViewer.t1().a2(wt0VarArr[i11].a, indexOf, this.f1, this.Y0, this.B, fr0Var);
                    }
                } else if (i11 == 1) {
                    if (view instanceof org.telegram.ui.Cells.f7) {
                        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                        TLRPC.Document document = messageObject.getDocument();
                        if (f7Var.C) {
                            if (messageObject.canPreviewDocument()) {
                                PhotoViewer.t1().K2(null, n2Var, null);
                                int indexOf2 = wt0VarArr[i11].a.indexOf(messageObject);
                                if (indexOf2 < 0) {
                                    PhotoViewer.t1().a2(org.telegram.messenger.y1.m(messageObject), 0, 0L, 0L, 0L, fr0Var);
                                    return;
                                } else {
                                    PhotoViewer.t1().a2(wt0VarArr[i11].a, indexOf2, this.f1, this.Y0, this.B, fr0Var);
                                    return;
                                }
                            }
                            AndroidUtilities.openDocument(messageObject, n2Var.getParentActivity(), n2Var);
                        } else if (f7Var.B) {
                            n2Var.getFileLoader().cancelLoadFile(document);
                            f7Var.f(true);
                        } else {
                            MessageObject message = f7Var.getMessage();
                            message.putInDownloadsStore = true;
                            n2Var.getFileLoader().loadFile(document, message, 0, 0);
                            f7Var.f(true);
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
                                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                                    n2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str3 = webPage.embed_url;
                            if (str3 != null && str3.length() != 0) {
                                fu.J(n2Var, messageObject, this.n1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                return;
                            }
                            str = webPage.url;
                        }
                        if (str == null) {
                            ArrayList arrayList = ((org.telegram.ui.Cells.i7) view).A;
                            if (arrayList.size() > 0) {
                                str2 = ((CharSequence) arrayList.get(0)).toString();
                            }
                            str = str2;
                        }
                        if (str != null) {
                            R0(str);
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                } else if (p0(i11)) {
                    eu0 k12 = k1(i11);
                    jh.j6 j6Var = k12 != null ? k12.s : null;
                    if (j6Var == null) {
                        return;
                    }
                    jh.i9 orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int id2 = messageObject.getId();
                    jh.b7 a3 = jh.b7.a(this.g0[0].h);
                    a3.e = new vu(j6Var, 18);
                    if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).o1) {
                        i12 = AndroidUtilities.dp(68.0f);
                    }
                    a3.s += i12;
                    orCreateStoryViewer.C(context, id2, j6Var, a3);
                }
            }
            p1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean H(MotionEvent motionEvent) {
        vq0 vq0Var;
        zs0[] zs0VarArr = this.g0;
        int i10 = zs0VarArr[0].B;
        if (i10 == 13 && (vq0Var = this.Q) != null) {
            View currentView = vq0Var.n.getCurrentView();
            if (currentView instanceof kh.r) {
                kh.r rVar = (kh.r) currentView;
                kh.m mVar = rVar.v;
                kh.j jVar = rVar.f;
                if (rVar.a != null && rVar.getParent() != null) {
                    if (!rVar.b || rVar.G) {
                        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                            if (rVar.H && !rVar.G && motionEvent.getPointerCount() == 2) {
                                rVar.L = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                rVar.M = 1.0f;
                                rVar.J = motionEvent.getPointerId(0);
                                rVar.K = motionEvent.getPointerId(1);
                                jVar.I0(false);
                                jVar.cancelLongPress();
                                jVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) rVar.getParent();
                                rVar.Q = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - rVar.getX());
                                int y10 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - rVar.getY());
                                int i11 = rVar.Q;
                                Rect rect = rVar.R;
                                rVar.O = -1;
                                int i12 = y10 + jVar.T2;
                                for (int i13 = 0; i13 < jVar.getChildCount(); i13++) {
                                    View childAt = jVar.getChildAt(i13);
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
                                    rVar.c = Math.max(0.0f, Math.min(1.0f, z11 ? org.telegram.messenger.y1.a(2.0f, rVar.M, 1.0f, 1.0f) : (1.0f - rVar.M) / 0.5f));
                                } else {
                                    rVar.c = 0.0f;
                                }
                                float f10 = rVar.c;
                                if (f10 == 1.0f || f10 == 0.0f) {
                                    if (f10 == 1.0f) {
                                        int i17 = rVar.e;
                                        int ceil = (((int) Math.ceil(rVar.O / rVar.e)) * i17) + ((int) ((rVar.S.C.v1 / (jVar.getMeasuredWidth() - ((int) (jVar.getMeasuredWidth() / rVar.e)))) * (i17 - 1)));
                                        if (ceil >= mVar.h()) {
                                            ceil = mVar.h() - 1;
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
                                jVar.invalidate();
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
                        zs0VarArr[0].h.I0(false);
                        zs0VarArr[0].h.cancelLongPress();
                        zs0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - zs0VarArr[0].getX());
                        int y11 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - zs0VarArr[0].getY());
                        int i18 = this.w;
                        this.s = -1;
                        int i19 = y11 + zs0VarArr[0].h.T2;
                        if (getY() != 0.0f && this.A == 1) {
                            i19 = 0;
                        }
                        for (int i20 = 0; i20 < zs0VarArr[0].h.getChildCount(); i20++) {
                            View childAt2 = zs0VarArr[0].h.getChildAt(i20);
                            Rect rect2 = this.x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i18, i19)) {
                                zs0VarArr[0].h.getClass();
                                this.s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.z1.T() && this.s == -1) {
                            this.s = (int) (((this.i1[p0(zs0VarArr[0].B) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i18 / zs0VarArr[0].h.getMeasuredWidth(), 0.0f))) + zs0VarArr[0].x.L0());
                            this.v = 0;
                        }
                        this.c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - zs0VarArr[0].getY() > 0.0f) {
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
                            this.j1 = Math.max(0.0f, Math.min(1.0f, z13 ? org.telegram.messenger.y1.a(2.0f, this.n, 1.0f, 1.0f) : (1.0f - this.n) / 0.5f));
                        } else {
                            this.j1 = 0.0f;
                        }
                        float f11 = this.j1;
                        if (f11 == 1.0f || f11 == 0.0f) {
                            f2.q0 k12 = p0(this.l1) ? k1(this.l1) : this.D;
                            if (this.j1 == 1.0f) {
                                int i24 = this.m1;
                                int ceil2 = (((int) Math.ceil(this.s / this.m1)) * i24) + ((int) ((this.v1 / (zs0VarArr[0].h.getMeasuredWidth() - ((int) (zs0VarArr[0].h.getMeasuredWidth() / this.m1)))) * (i24 - 1)));
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
                        zs0VarArr[0].h.invalidate();
                        zs0 zs0Var = zs0VarArr[0];
                        if (zs0Var.C != null) {
                            zs0Var.invalidate();
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
        ar0 ar0Var;
        final TL_stories.StoryItem storyItem;
        os0 os0Var;
        jh.j6 j6Var;
        final int i11 = 0;
        if (!this.y1) {
            org.telegram.ui.ActionBar.n2 n2Var = this.r1;
            if (n2Var.getParentActivity() != null && messageObject != null && ((ar0Var = this.S) == null || !ar0Var.w)) {
                AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
                long j10 = this.f1;
                int i12 = 8;
                final int i13 = 1;
                if (!z10 || (!(w0(getClosestTab()) || getClosestTab() == 8) || this.y1)) {
                    char c10 = messageObject.getDialogId() == j10 ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.V0;
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.W0++;
                    }
                    this.h0.setVisibility(this.W0 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.v0 v0Var = this.q0;
                    if (v0Var != null) {
                        v0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.p0;
                    if (v0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        v0Var2.setVisibility(i12);
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
                    if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.p7) {
                        ((org.telegram.ui.Cells.p7) view).b(i10, true);
                    } else if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.e7) {
                        ((org.telegram.ui.Cells.e7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.d2) {
                        ((org.telegram.ui.Cells.d2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) view).i(true, true);
                    }
                    if (!this.y1) {
                        b1(true);
                    }
                    D0(sparseArrayArr[0]);
                    p1();
                    return true;
                }
                if (view instanceof org.telegram.ui.Cells.o7) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                    o7Var.k(o7Var.n, o7Var.r, true);
                }
                TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean w02 = w0(getClosestTab());
                    b70 I = b70.I(n2Var, view);
                    b70 J = I.J();
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.lt0(I, 25), false);
                    J.k();
                    b70.f(J, getStoriesController().B(j10, true), hashSet, true, new org.telegram.ui.ActionBar.i3(this, storyItem2, I, 28), new cg.e1(this, hashSet, storyItem2, I, 11));
                    I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new gh.f3(I, J, i12), false);
                    I.k();
                    I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new ag.k0(this, messageObject, view, i10, 22), false);
                    final int i15 = 3;
                    if (w02) {
                        int h12 = h1(getClosestTab());
                        String w10 = getStoriesController().w(h12, j10);
                        I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new xl(this, h12, 5), false);
                        storyItem = storyItem2;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new ag.k0(this, h12, storyItem, w10, 23), false);
                    } else {
                        storyItem = storyItem2;
                        if (getClosestTab() == 8 && (os0Var = this.V) != null && (j6Var = os0Var.s) != null) {
                            if (j6Var.m(storyItem.id)) {
                                I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() { // from class: org.telegram.ui.Components.eq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                hu0 hu0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hu0Var.getContext(), 0, hu0Var.B1);
                                                alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kq0(hu0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pc0(14));
                                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                                b2Var.show();
                                                b2Var.h();
                                                break;
                                            case 1:
                                                hu0 hu0Var2 = this;
                                                hu0Var2.getClass();
                                                hu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                hu0 hu0Var3 = this;
                                                hu0Var3.getClass();
                                                hu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                hu0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                final int i16 = 2;
                                I.c(R.drawable.chats_pin, LocaleController.getString(R.string.StoriesAlbumMenuPin), new Runnable() { // from class: org.telegram.ui.Components.eq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                hu0 hu0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hu0Var.getContext(), 0, hu0Var.B1);
                                                alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kq0(hu0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pc0(14));
                                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                                b2Var.show();
                                                b2Var.h();
                                                break;
                                            case 1:
                                                hu0 hu0Var2 = this;
                                                hu0Var2.getClass();
                                                hu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                hu0 hu0Var3 = this;
                                                hu0Var3.getClass();
                                                hu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                hu0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        I.c(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable() { // from class: org.telegram.ui.Components.eq0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        hu0 hu0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hu0Var.getContext(), 0, hu0Var.B1);
                                        alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kq0(hu0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pc0(14));
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                        b2Var.show();
                                        b2Var.h();
                                        break;
                                    case 1:
                                        hu0 hu0Var2 = this;
                                        hu0Var2.getClass();
                                        hu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                        break;
                                    case 2:
                                        hu0 hu0Var3 = this;
                                        hu0Var3.getClass();
                                        hu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                        break;
                                    default:
                                        hu0.h(this, storyItem);
                                        break;
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.Components.eq0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    hu0 hu0Var = this;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hu0Var.getContext(), 0, hu0Var.B1);
                                    alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                    alertDialog$Builder.a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kq0(hu0Var, storyItem));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pc0(14));
                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                    b2Var.show();
                                    b2Var.h();
                                    break;
                                case 1:
                                    hu0 hu0Var2 = this;
                                    hu0Var2.getClass();
                                    hu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                    break;
                                case 2:
                                    hu0 hu0Var3 = this;
                                    hu0Var3.getClass();
                                    hu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                    break;
                                default:
                                    hu0.h(this, storyItem);
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
        zs0[] zs0VarArr = this.g0;
        zs0 zs0Var = zs0VarArr[0];
        if (zs0Var == null || zs0VarArr[1] == null) {
            return;
        }
        float f10 = 0.0f;
        ar0 ar0Var = this.S;
        if (ar0Var != null) {
            char c10 = (!p0(zs0Var.B) || zs0VarArr[0].B == 9) ? (char) 0 : (char) 1;
            if (c10 == (zs0VarArr[1].getVisibility() == 0 ? (!p0(zs0VarArr[1].B) || zs0VarArr[1].B == 9) ? (char) 0 : (char) 1 : c10)) {
                abs = c10 != 0 ? 1.0f : 0.0f;
                ar0Var.setTranslationX(c10 != 0 ? 0.0f : zs0VarArr[0].getMeasuredWidth());
            } else {
                ar0Var.setTranslationX(zs0VarArr[c10 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(ar0Var.getTranslationX()) / ar0Var.getMeasuredWidth());
            }
            float f11 = 0.0f;
            for (int i10 = 0; i10 < zs0VarArr.length; i10++) {
                if (zs0VarArr[i10].getVisibility() == 0) {
                    er0 er0Var = zs0VarArr[i10].h;
                    View childAt = er0Var.getChildCount() == 0 ? null : er0Var.getChildAt(0);
                    f11 += Utilities.clamp01(1.0f - (zs0VarArr[i10].getTranslationX() / zs0VarArr[i10].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - er0Var.getPaddingTop() : er0Var.getChildCount() == 0 ? 0.0f : -AndroidUtilities.dp(48.0f));
                }
            }
            float clamp01 = Utilities.clamp01(1.0f - ((-f11) / AndroidUtilities.dpf2(48.0f)));
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
            ar0Var.setAlpha(clamp01);
            ar0Var.setScaleX(lerp);
            ar0Var.setScaleY(lerp);
            ar0Var.setTranslationY(this.G1 + f11);
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
        zs0[] zs0VarArr = this.g0;
        if (!z10) {
            if (Math.abs(zs0VarArr[1].getTranslationX()) < 1.0f) {
                zs0VarArr[0].setTranslationX(r0.getMeasuredWidth() * (this.d1 ? -1 : 1));
                zs0VarArr[1].setTranslationX(0.0f);
                animatorSet = this.b1;
                if (animatorSet != null) {
                }
                this.c1 = false;
            }
            M0(getTabProgress());
            return this.c1;
        }
        if (Math.abs(zs0VarArr[0].getTranslationX()) < 1.0f) {
            zs0VarArr[0].setTranslationX(0.0f);
            zs0VarArr[1].setTranslationX(zs0VarArr[0].getMeasuredWidth() * (this.d1 ? 1 : -1));
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
        zs0[] zs0VarArr = this.g0;
        if (f10 != 1.0f || zs0VarArr[1].getVisibility() == 0) {
            if (this.d1) {
                zs0VarArr[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                zs0VarArr[1].setTranslationX(zs0VarArr[0].getMeasuredWidth() - (zs0VarArr[0].getMeasuredWidth() * f10));
            } else {
                zs0VarArr[0].setTranslationX(r3.getMeasuredWidth() * f10);
                zs0VarArr[1].setTranslationX((zs0VarArr[0].getMeasuredWidth() * f10) - zs0VarArr[0].getMeasuredWidth());
            }
            M0(getTabProgress());
            float a02 = a0(f10);
            this.l0 = a02;
            this.n0.setVisibility((a02 == 0.0f || !D() || q0()) ? 4 : 0);
            org.telegram.ui.ActionBar.v0 v0Var = this.j0;
            if (v0Var == null || D()) {
                this.k0 = b0(f10);
                t1();
            } else {
                v0Var.setVisibility(v0() ? 8 : 4);
                this.k0 = 0.0f;
            }
            q1(false);
            if (f10 == 1.0f) {
                zs0 zs0Var = zs0VarArr[0];
                zs0VarArr[0] = zs0VarArr[1];
                zs0VarArr[1] = zs0Var;
                zs0Var.setVisibility(8);
                if (v0Var != null && this.t0 == 2) {
                    v0Var.setVisibility(v0() ? 8 : 4);
                }
                this.t0 = 0;
                f1();
            }
        }
    }

    public final void K() {
        zr zrVar = this.L0;
        if (zrVar != null) {
            ar0 ar0Var = this.S;
            float f10 = 0.0f;
            if (ar0Var != null) {
                f10 = 0.0f + (ar0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(ar0Var.getTranslationX() / ar0Var.getMeasuredWidth())));
            }
            zrVar.setTranslationY(this.G1 + f10);
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
        vq0 vq0Var = this.Q;
        if (vq0Var != null) {
            vq0Var.h();
            vq0Var.j();
        }
        b1(false);
        r1(z10);
        qt0 qt0Var = this.N;
        if (qt0Var != null) {
            qt0Var.w.clear();
        }
        return true;
    }

    public void L0() {
        boolean z10 = v0() || q0();
        cu0 cu0Var = this.a0.w;
        if (cu0Var != null) {
            cu0Var.b(z10 && getClosestTab() == 9);
        }
        cu0 cu0Var2 = this.V.w;
        if (cu0Var2 != null) {
            cu0Var2.b(z10 && getClosestTab() == 8);
        }
        for (gu0 gu0Var : this.U1.values()) {
            fu0 fu0Var = gu0Var.c;
            if (fu0Var.s != null) {
                fu0Var.w.b(z10 && getClosestTab() == gu0Var.a);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.j0;
        if (v0Var != null) {
            sr0 sr0Var = this.F0;
            v0Var.setSearchFieldHint(LocaleController.getString((sr0Var != null && sr0Var.a() && getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
        I();
    }

    public void M0(float f10) {
        E0();
    }

    public boolean N() {
        return this instanceof n30;
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x8 = (-view.getX()) - getX();
        zs0[] zs0VarArr = this.g0;
        motionEvent.offsetLocation(x8 - zs0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - zs0VarArr[0].getY()) - zs0VarArr[0].h.getFastScroll().getY());
        return zs0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void O0(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        new org.telegram.ui.n61(n2Var, j10, this.i1[1], new ic(this, j10, i10)).show();
    }

    public void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void P0(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        y4.v0(n2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j10))), LocaleController.getString(R.string.Delete), true, new hh.d9(this, j10, i10, 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            zs0[] zs0VarArr = this.g0;
            if (i10 >= zs0VarArr.length) {
                return;
            }
            zs0 zs0Var = zs0VarArr[i10];
            if (zs0Var != null && zs0Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < zs0VarArr[i10].h.getChildCount(); i11++) {
                    View childAt = zs0VarArr[i10].h.getChildAt(i11);
                    if (childAt.getY() < AndroidUtilities.dp(100.0f) + zs0VarArr[i10].h.T2) {
                        int save = canvas.save();
                        canvas.translate(childAt.getX() + zs0VarArr[i10].getX(), childAt.getY() + zs0VarArr[i10].h.getY() + zs0VarArr[i10].getY() + getY());
                        childAt.draw(canvas);
                        if (arrayList != null && (childAt instanceof wu0)) {
                            arrayList.add((wu0) childAt);
                        }
                        canvas.restoreToCount(save);
                    }
                }
            }
            i10++;
        }
    }

    public final void Q0(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        String w10 = getStoriesController().w(i10, j10);
        Context context = n2Var.getContext();
        org.telegram.ui.ActionBar.c6 resourceProvider = n2Var.getResourceProvider();
        i3.e eVar = new i3.e(this, j10, i10);
        Pattern pattern = y4.a;
        y4.R(context, n2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w10, 12, LocaleController.getString(R.string.Rename), resourceProvider, eVar);
    }

    public final boolean R(int i10) {
        wt0[] wt0VarArr = this.q1.n;
        if (wt0VarArr == null) {
            return false;
        }
        wt0[] wt0VarArr2 = this.p1;
        if (i10 == 0) {
            wt0 wt0Var = wt0VarArr2[i10];
            if (!wt0Var.h) {
                int[] iArr = wt0Var.f;
                int[] iArr2 = wt0VarArr[i10].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = wt0VarArr2[i10].f;
            int[] iArr4 = wt0VarArr[i10].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        wt0VarArr2[i10].a.addAll(wt0VarArr[i10].a);
        wt0VarArr2[i10].c.addAll(wt0VarArr[i10].c);
        for (Map.Entry entry : wt0VarArr[i10].d.entrySet()) {
            wt0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            wt0VarArr2[i10].b[i11] = wt0VarArr[i10].b[i11].clone();
            wt0 wt0Var2 = wt0VarArr2[i10];
            int[] iArr5 = wt0Var2.j;
            wt0 wt0Var3 = wt0VarArr[i10];
            iArr5[i11] = wt0Var3.j[i11];
            wt0Var2.i[i11] = wt0Var3.i[i11];
        }
        wt0VarArr2[i10].e.addAll(wt0VarArr[i10].e);
        return !wt0VarArr[i10].a.isEmpty();
    }

    public final void R0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.n2 n2Var = this.r1;
        if (shouldShowUrlInAlert) {
            y4.q0(n2Var, str, true, true);
        } else {
            we.e.s(n2Var.getParentActivity(), str);
        }
    }

    public final void S(int i10, zk0 zk0Var, boolean z10) {
        ArrayList arrayList = this.p1[i10].e;
        int L0 = ((f2.k0) zk0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            et0 et0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (L0 <= ((et0) arrayList.get(i11)).b) {
                        et0Var = (et0) arrayList.get(i11);
                        break;
                    }
                    i11++;
                }
                if (et0Var == null) {
                    et0Var = (et0) i0.a.i(1, arrayList);
                }
            }
            if (et0Var != null) {
                y0(i10, et0Var.d, et0Var.b + 1, z10);
            }
        }
    }

    public int S0() {
        return -1;
    }

    public final void T() {
        zs0[] zs0VarArr;
        zs0 zs0Var;
        int i10;
        f2.q0 adapter;
        if (this.k1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                zs0VarArr = this.g0;
                if (i12 >= zs0VarArr.length) {
                    zs0Var = null;
                    break;
                }
                zs0Var = zs0VarArr[i12];
                if (zs0Var.B == this.l1) {
                    break;
                } else {
                    i12++;
                }
            }
            if (zs0Var != null) {
                boolean p02 = p0(zs0Var.B);
                float f10 = this.j1;
                wt0[] wt0VarArr = this.p1;
                if (f10 != 1.0f) {
                    if (f10 == 0.0f) {
                        this.k1 = false;
                        if (this.l1 == 0) {
                            wt0VarArr[0].g(false);
                        }
                        zs0Var.r.setVisibility(8);
                        zs0Var.h.invalidate();
                        return;
                    }
                    boolean z10 = f10 > 0.2f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
                    ofFloat.addUpdateListener(new ur0(this, zs0Var, i11));
                    ofFloat.addListener(new org.telegram.ui.ui(this, z10, p02 ? 1 : 0, zs0Var));
                    ofFloat.setInterpolator(er.f);
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
                } else if (c0(zs0Var.B) >= 5) {
                    SharedConfig.setStoriesColumnsCount(this.m1);
                }
                for (int i14 = 0; i14 < zs0VarArr.length; i14++) {
                    zs0 zs0Var2 = zs0VarArr[i14];
                    if (zs0Var2 != null && zs0Var2.h != null && (((i10 = zs0Var2.B) == 0 || p0(i10)) && (adapter = zs0VarArr[i14].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i14 == 0) {
                            wt0VarArr[0].g(false);
                        }
                        zs0VarArr[i14].r.setVisibility(8);
                        zs0VarArr[i14].x.y1(iArr[p02 ? 1 : 0]);
                        zs0VarArr[i14].h.a0();
                        zs0VarArr[i14].h.invalidate();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(zs0VarArr[i14].h);
                        } else {
                            adapter.l();
                        }
                    }
                }
                if (this.s < 0) {
                    X0();
                    return;
                }
                while (i11 < zs0VarArr.length) {
                    zs0 zs0Var3 = zs0VarArr[i11];
                    if (zs0Var3.B == this.l1) {
                        View m10 = zs0Var3.s.m(this.s);
                        if (m10 != null) {
                            this.v = m10.getTop();
                        }
                        zs0 zs0Var4 = zs0VarArr[i11];
                        zs0Var4.x.h1(this.s, (-zs0Var4.h.getPaddingTop()) + this.v);
                    }
                    i11++;
                }
            }
        }
    }

    public final void T0(ArrayList arrayList, boolean z10) {
        os0 os0Var = this.V;
        if (os0Var == null || os0Var.s == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.r1;
        if (z10 && arrayList.size() > n2Var.getMessagesController().storiesPinnedToTopCountMax) {
            mc.a0(n2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", n2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            return;
        }
        jh.j6 j6Var = os0Var.s;
        int i10 = j6Var.c;
        ArrayList arrayList2 = j6Var.g;
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
                j6Var.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(j6Var.d);
                ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new jh.m5(2));
            }
            z11 = z12;
        }
        if (z11) {
            mc.a0(n2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", n2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
        } else if (z10) {
            mc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
        } else {
            mc.a0(n2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
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
        zs0 zs0Var;
        vq0 vq0Var;
        int closestTab = getClosestTab();
        vr0 vr0Var = this.E0;
        int i10 = -1;
        int i11 = vr0Var.K.get(vr0Var.n + (z10 ? 1 : -1), -1);
        ar0 ar0Var = this.S;
        if (ar0Var != null) {
            if (w0(closestTab) || closestTab == 8) {
                o71 o71Var = ar0Var.n;
                i10 = o71Var.U.get(o71Var.B + (z10 ? 1 : -1), -1);
            } else if (w0(i11) || i11 == 8) {
                i10 = ar0Var.getCurrentAlbumId();
            }
            if (i10 == 0) {
                i11 = 8;
            } else if (i10 > 0) {
                i11 = i1(i10).a;
            }
        }
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.v0 v0Var = this.j0;
            if (v0Var == null || D()) {
                this.k0 = b0(0.0f);
                s1(0.0f);
            } else {
                v0Var.setVisibility(v0() ? 8 : 4);
                this.k0 = 0.0f;
            }
            if ((!this.R0 || getSelectedTab() != 11) && (!C() || !this.y1 || (getClosestTab() != 8 && !w0(getClosestTab())))) {
                zs0[] zs0VarArr = this.g0;
                zs0 zs0Var2 = zs0VarArr[0];
                if (zs0Var2 != null && zs0Var2.B == 13 && (vq0Var = this.Q) != null) {
                    kh.a aVar = vq0Var.n;
                    if (!z10) {
                    }
                }
                zs0 zs0Var3 = zs0VarArr[0];
                wq0 wq0Var = this.R;
                if (zs0Var3 != null && zs0Var3.B == 14 && wq0Var != null) {
                    gh.x2 x2Var = wq0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.y1 || (zs0Var = zs0VarArr[0]) == null || zs0Var.B != 13) && ((wq0Var == null || !wq0Var.g()) && (ar0Var == null || !ar0Var.w))) {
                    q1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    k0();
                    this.u1 = false;
                    this.t1 = true;
                    N0(true);
                    this.v1 = (int) motionEvent.getX();
                    this.C.setEnabled(false);
                    vr0Var.setEnabled(false);
                    zs0 zs0Var4 = zs0VarArr[1];
                    zs0Var4.B = i11;
                    zs0Var4.setVisibility(0);
                    this.d1 = z10;
                    m1(true);
                    if (z10) {
                        zs0VarArr[1].setTranslationX(zs0VarArr[0].getMeasuredWidth());
                    } else {
                        zs0VarArr[1].setTranslationX(-zs0VarArr[0].getMeasuredWidth());
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
        vq0 vq0Var;
        if (!r0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (vq0Var = this.Q) != null) {
            return vq0Var.getBotPreviewsSubtitle();
        }
        os0 os0Var = this.V;
        if (os0Var == null || os0Var.s == null) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < os0Var.s.i.size(); i12++) {
                MessageObject messageObject = (MessageObject) os0Var.s.i.get(i12);
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

    public final zs0 W(int i10) {
        int i11 = 0;
        while (true) {
            zs0[] zs0VarArr = this.g0;
            if (i11 >= zs0VarArr.length) {
                return null;
            }
            zs0 zs0Var = zs0VarArr[i11];
            if (zs0Var != null && zs0Var.B == i10) {
                return zs0Var;
            }
            i11++;
        }
    }

    public final void W0(f2.q0 q0Var) {
        if (q0Var instanceof bu0) {
            ArrayList arrayList = this.A0;
            ArrayList arrayList2 = this.B0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (q0Var == this.I) {
            ArrayList arrayList3 = this.C0;
            ArrayList arrayList4 = this.D0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        nt0 nt0Var = this.J;
        if (q0Var == nt0Var) {
            nt0Var.r = null;
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
            zs0[] zs0VarArr = this.g0;
            if (i11 >= zs0VarArr.length) {
                return;
            }
            er0 er0Var = zs0VarArr[i11].h;
            if (er0Var != null) {
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < er0Var.getChildCount(); i14++) {
                    View childAt = er0Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.o7) {
                        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                        int messageId = o7Var.getMessageId();
                        i13 = o7Var.getTop();
                        i12 = messageId;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.f7) {
                        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                        int id2 = f7Var.getMessage().getId();
                        i13 = f7Var.getTop();
                        i12 = id2;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.e7) {
                        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) childAt;
                        i12 = e7Var.getMessage().getId();
                        i13 = e7Var.getTop();
                    }
                    if (i12 != 0) {
                        break;
                    }
                }
                if (i12 != 0) {
                    int i15 = zs0VarArr[i11].B;
                    int i16 = -1;
                    if (p0(i15)) {
                        eu0 k12 = k1(i15);
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
                        wt0[] wt0VarArr = this.p1;
                        if (i15 < wt0VarArr.length) {
                            int i18 = 0;
                            while (true) {
                                if (i18 >= wt0VarArr[i15].a.size()) {
                                    break;
                                }
                                if (i12 == ((MessageObject) wt0VarArr[i15].a.get(i18)).getId()) {
                                    i16 = i18;
                                    break;
                                }
                                i18++;
                            }
                            i10 = wt0VarArr[i15].m + i16;
                        }
                    }
                    if (i16 >= 0) {
                        ((f2.k0) er0Var.getLayoutManager()).h1(i10, (-zs0VarArr[i11].h.getPaddingTop()) + i13);
                        if (this.k1) {
                            zs0 zs0Var = zs0VarArr[i11];
                            zs0Var.s.h1(i10, (-zs0Var.h.getPaddingTop()) + i13);
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
        vr0 vr0Var;
        if (this.H1 || (vr0Var = this.E0) == null) {
            return;
        }
        vr0Var.h(null, i10, vr0Var.L.get(i10));
    }

    public final int Z(int i10) {
        int dp = AndroidUtilities.dp(54.0f) + this.X1;
        ar0 ar0Var = this.S;
        return dp + ((int) ((ar0Var == null || !(w0(i10) || i10 == 8)) ? 0.0f : ar0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f))) + (i10 == 9 ? AndroidUtilities.dp(64.0f) : 0);
    }

    public final void Z0(float f10, int i10) {
        vr0 vr0Var = this.E0;
        if (vr0Var != null) {
            vr0Var.j(f10, w0(i10) ? 8 : i10);
        }
        ar0 ar0Var = this.S;
        if (ar0Var != null) {
            o71 o71Var = ar0Var.n;
            if (w0(i10)) {
                o71Var.f(f10, h1(i10));
            } else if (i10 == 8) {
                o71Var.f(f10, 0);
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
        zs0[] zs0VarArr = this.g0;
        zs0 zs0Var = zs0VarArr[1];
        wq0 wq0Var = this.R;
        if (zs0Var != null && ((i12 = zs0Var.B) == 0 || (((i12 == 8 || w0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = zs0VarArr[1].B) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && wq0Var != null)))) {
            f11 = 0.0f + f10;
        }
        zs0 zs0Var2 = zs0VarArr[0];
        return (zs0Var2 == null || !((i10 = zs0Var2.B) == 0 || (((i10 == 8 || w0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = zs0VarArr[0].B) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && wq0Var != null)))) ? f11 : (1.0f - f10) + f11;
    }

    public final void a1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            zs0[] zs0VarArr = this.g0;
            if (i10 >= zs0VarArr.length) {
                if (this.B == 0) {
                    qs0 qs0Var = this.T;
                    qs0Var.d = chatFull;
                    qs0Var.e = arrayList;
                }
                v1(true);
                for (int i11 = 0; i11 < zs0VarArr.length; i11++) {
                    zs0 zs0Var = zs0VarArr[i11];
                    if (zs0Var.B == 7 && zs0Var.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(zs0VarArr[i11].h);
                    }
                }
                return;
            }
            zs0 zs0Var2 = zs0VarArr[i10];
            if (zs0Var2.B == 7 && zs0Var2.h.getAdapter() != null && zs0VarArr[i10].h.getAdapter().h() != 0 && this.r1.getMessagesController().getStoriesController().j.size() > 0) {
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

    public final float b0(float f10) {
        float f11 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        zs0[] zs0VarArr = this.g0;
        zs0 zs0Var = zs0VarArr[1];
        if (zs0Var != null && s0(zs0Var.B) && zs0VarArr[1].B != 11) {
            f11 = 0.0f + f10;
        }
        zs0 zs0Var2 = zs0VarArr[0];
        return (zs0Var2 == null || !s0(zs0Var2.B) || zs0VarArr[0].B == 11) ? f11 : (1.0f - f10) + f11;
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
        x9 x9Var = this.x0;
        if (z10) {
            x9Var.setVisibility(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.J1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(x9Var, (Property<x9, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.J1.setDuration(180L);
        this.J1.addListener(new org.telegram.ui.go(20, this, z10));
        this.J1.start();
        if (z10) {
            u1();
        }
    }

    public final int c0(int i10) {
        eu0 k12;
        jh.j6 j6Var;
        if (!p0(i10) || (k12 = k1(i10)) == null || (j6Var = k12.s) == null) {
            return 0;
        }
        return j6Var.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(int i10, boolean z10) {
        int i11;
        zs0 W;
        if (z10 && getY() != 0.0f && this.A == 1) {
            return;
        }
        if (z10 && p0(i10) && c0(i10) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f1);
        bundle.putLong("topic_id", this.B);
        wt0[] wt0VarArr = this.p1;
        if (z10 && (W = W(0)) != null) {
            ArrayList arrayList = wt0VarArr[0].e;
            int L0 = W.x.L0();
            if (L0 >= 0) {
                et0 et0Var = null;
                if (arrayList != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        if (L0 <= ((et0) arrayList.get(i12)).b) {
                            et0Var = (et0) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (et0Var == null) {
                        et0Var = (et0) i0.a.i(1, arrayList);
                    }
                }
                if (et0Var != null) {
                    i11 = et0Var.c;
                    if (i10 != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i10 == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    org.telegram.ui.h8 h8Var = new org.telegram.ui.h8(wt0VarArr[0].q, i11, bundle);
                    h8Var.I = new o0.b(this, 10);
                    this.r1.presentFragment(h8Var);
                }
            }
        }
        i11 = 0;
        if (i10 != 9) {
        }
        org.telegram.ui.h8 h8Var2 = new org.telegram.ui.h8(wt0VarArr[0].q, i11, bundle);
        h8Var2.I = new o0.b(this, 10);
        this.r1.presentFragment(h8Var2);
    }

    public final void d1(int i10) {
        int h12 = h1(getClosestTab());
        ar0 ar0Var = this.S;
        if (h12 != i10) {
            if (ar0Var != null) {
                ar0Var.n.d(i10, ar0Var.s.i(i10));
                return;
            }
            return;
        }
        ar0Var.setReorderingAlbums(true);
        gu0 i12 = i1(i10);
        zs0 W = W(i12.a);
        if (W == null) {
            return;
        }
        er0 er0Var = W.h;
        for (int i11 = 0; i11 < er0Var.getChildCount(); i11++) {
            View childAt = er0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.o7) {
                ((org.telegram.ui.Cells.o7) childAt).l(true, true);
            }
        }
        fu0 fu0Var = i12.c;
        if (fu0Var != null && !fu0Var.x) {
            fu0Var.x = true;
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
        er0 er0Var;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i12;
        f2.q0 q0Var;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        int size;
        int i15;
        boolean z12;
        er0 er0Var2;
        int i16;
        int i17;
        er0 er0Var3;
        int i18 = NotificationCenter.mediaDidLoad;
        f2.q0 q0Var2 = this.K;
        f2.q0 q0Var3 = this.I;
        vt0 vt0Var = this.F;
        f2.q0 q0Var4 = this.H;
        f2.q0 q0Var5 = this.G;
        org.telegram.ui.ActionBar.n2 n2Var = this.r1;
        nt0 nt0Var = this.J;
        ls0 ls0Var = this.D;
        long j10 = this.f1;
        zs0[] zs0VarArr = this.g0;
        wt0[] wt0VarArr = this.p1;
        if (i10 == i18) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue != n2Var.getClassGuid() || intValue2 != wt0VarArr[intValue3].p) {
                if (this.q1 == null || !wt0VarArr[intValue3].a.isEmpty() || wt0VarArr[intValue3].o || !R(intValue3)) {
                    return;
                }
                if (intValue3 == 0) {
                    q0Var2 = ls0Var;
                } else if (intValue3 == 1) {
                    q0Var2 = q0Var5;
                } else if (intValue3 == 2) {
                    q0Var2 = q0Var4;
                } else if (intValue3 == 3) {
                    q0Var2 = vt0Var;
                } else if (intValue3 == 4) {
                    q0Var2 = q0Var3;
                } else if (intValue3 != 5) {
                    q0Var2 = intValue3 == 15 ? nt0Var : null;
                }
                if (q0Var2 != null) {
                    for (int i19 = 0; i19 < zs0VarArr.length; i19++) {
                        zs0 zs0Var = zs0VarArr[i19];
                        if (zs0Var != null && (er0Var2 = zs0Var.h) != null && er0Var2.getAdapter() == q0Var2) {
                            zs0VarArr[i19].h.B0();
                        }
                    }
                    q0Var2.l();
                }
                this.X0 = true;
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[2];
            boolean isEncryptedDialog = DialogObject.isEncryptedDialog(j10);
            int i20 = longValue == j10 ? 0 : 1;
            if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                wt0VarArr[intValue3].f[i20] = ((Integer) objArr[1]).intValue();
            }
            if (intValue3 == 0) {
                i16 = intValue3;
                q0Var2 = ls0Var;
            } else if (intValue3 == 1) {
                i16 = intValue3;
                q0Var2 = q0Var5;
            } else if (intValue3 == 2) {
                i16 = intValue3;
                q0Var2 = q0Var4;
            } else if (intValue3 == 3) {
                i16 = intValue3;
                q0Var2 = vt0Var;
            } else if (intValue3 == 4) {
                i16 = intValue3;
                q0Var2 = q0Var3;
            } else if (intValue3 == 5) {
                i16 = intValue3;
            } else if (intValue3 == 15) {
                q0Var2 = nt0Var;
                i16 = 8;
            } else {
                i16 = intValue3;
                q0Var2 = null;
            }
            int size2 = wt0VarArr[i16].a.size();
            if (q0Var2 != null) {
                i17 = q0Var2.h();
                if (q0Var2 instanceof vk0) {
                    ((vk0) q0Var2).L();
                }
            } else {
                i17 = 0;
            }
            wt0VarArr[i16].g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (booleanValue) {
                ?? r13 = 1;
                int size3 = arrayList.size() - 1;
                while (size3 >= 0) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size3);
                    if (wt0VarArr[i16].a(messageObject2, i20, r13, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject2.getId(), r13);
                        wt0 wt0Var = wt0VarArr[i16];
                        int i21 = wt0Var.m - r13;
                        wt0Var.m = i21;
                        if (i21 < 0) {
                            wt0Var.m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                wt0VarArr[i16].l = ((Boolean) objArr[5]).booleanValue();
                wt0 wt0Var2 = wt0VarArr[i16];
                if (wt0Var2.l) {
                    wt0Var2.m = 0;
                }
            } else {
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i22);
                    if (wt0VarArr[i16].a(messageObject3, i20, false, isEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject3.getId(), true);
                        wt0 wt0Var3 = wt0VarArr[i16];
                        int i23 = wt0Var3.n - 1;
                        wt0Var3.n = i23;
                        if (i23 < 0) {
                            wt0Var3.n = 0;
                        }
                    }
                }
                wt0 wt0Var4 = wt0VarArr[i16];
                if (wt0Var4.o && wt0Var4.a.size() > 0) {
                    wt0 wt0Var5 = wt0VarArr[i16];
                    wt0Var5.k = ((MessageObject) wt0Var5.a.get(0)).getId();
                }
                wt0VarArr[i16].i[i20] = ((Boolean) objArr[5]).booleanValue();
                wt0 wt0Var6 = wt0VarArr[i16];
                if (wt0Var6.i[i20]) {
                    int size4 = wt0Var6.b[i20].size();
                    if (i20 == 0) {
                        size4 += wt0VarArr[i16].m;
                    }
                    wt0VarArr[i16].f[i20] = size4;
                }
            }
            if (!booleanValue && i20 == 0) {
                wt0 wt0Var7 = wt0VarArr[i16];
                if (wt0Var7.i[i20] && this.Y0 != 0) {
                    wt0Var7.g = true;
                    n2Var.getMediaDataController().loadMedia(this.Y0, 50, wt0VarArr[i16].j[1], 0, i16, this.B, 1, n2Var.getClassGuid(), wt0VarArr[i16].p, null, null);
                }
            }
            int i24 = i16;
            if (q0Var2 != null) {
                ys0 ys0Var = null;
                for (int i25 = 0; i25 < zs0VarArr.length; i25++) {
                    zs0 zs0Var2 = zs0VarArr[i25];
                    if (zs0Var2 != null && (er0Var3 = zs0Var2.h) != null && er0Var3.getAdapter() == q0Var2) {
                        ys0 ys0Var2 = zs0VarArr[i25].h;
                        ys0Var2.B0();
                        ys0Var = ys0Var2;
                    }
                }
                int h = q0Var2.h();
                if (q0Var2 != ls0Var) {
                    try {
                        q0Var2.l();
                    } catch (Throwable unused) {
                    }
                } else if (ls0Var.h() == i17) {
                    AndroidUtilities.updateVisibleRows(ys0Var);
                } else {
                    ls0Var.l();
                }
                if (!wt0VarArr[i24].a.isEmpty() || wt0VarArr[i24].g) {
                    if (ys0Var != null && (q0Var2 == ls0Var || h >= i17)) {
                        z(ys0Var, i17, sparseBooleanArray);
                    }
                } else if (ys0Var != null) {
                    z(ys0Var, i17, sparseBooleanArray);
                }
                if (ys0Var != null && !wt0VarArr[i24].o) {
                    if (size2 == 0) {
                        for (int i26 = 0; i26 < 2; i26++) {
                            if (zs0VarArr[i26].B == 0) {
                                ((f2.k0) ys0Var.getLayoutManager()).h1(ls0Var.L(0), 0);
                            }
                        }
                    } else {
                        X0();
                    }
                }
            }
            wt0 wt0Var8 = wt0VarArr[i24];
            if (wt0Var8.o) {
                if (wt0Var8.a.size() == 0) {
                    A0(i24);
                } else {
                    wt0VarArr[i24].o = false;
                }
            }
            this.X0 = true;
            return;
        }
        if (i10 == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat chat = DialogObject.isChatDialog(j10) ? n2Var.getMessagesController().getChat(Long.valueOf(-j10)) : null;
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
                        ls0 ls0Var2 = ls0Var;
                        int i28 = 0;
                        while (i28 < wt0VarArr.length) {
                            ArrayList arrayList3 = arrayList2;
                            if (wt0VarArr[i28].b(((Integer) arrayList2.get(i15)).intValue(), i14) != null) {
                                i27 = i28;
                                z12 = true;
                            }
                            i28++;
                            arrayList2 = arrayList3;
                        }
                        i15++;
                        ls0Var = ls0Var2;
                    }
                    ls0 ls0Var3 = ls0Var;
                    if (z12) {
                        this.X0 = true;
                        if (ls0Var3 != null) {
                            ls0Var3.l();
                        }
                        if (q0Var5 != null) {
                            q0Var5.l();
                        }
                        if (q0Var4 != null) {
                            q0Var4.l();
                        }
                        if (vt0Var != null) {
                            vt0Var.X(false);
                        }
                        if (q0Var3 != null) {
                            q0Var3.l();
                        }
                        if (nt0Var != null) {
                            nt0Var.l();
                        }
                        if (q0Var2 != null) {
                            q0Var2.l();
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
            ls0 ls0Var32 = ls0Var;
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
                        wt0 wt0Var9 = wt0VarArr[mediaType];
                        if (wt0Var9.l) {
                            z11 = z13;
                            if (wt0Var9.a(messageObject4, messageObject4.getDialogId() == j10 ? 0 : 1, true, isEncryptedDialog2)) {
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
                    while (i31 < zs0VarArr.length) {
                        int i32 = zs0VarArr[i31].B;
                        if (i32 == 0) {
                            q0Var = ls0Var;
                        } else if (i32 == i30) {
                            q0Var = q0Var5;
                        } else if (i32 == 2) {
                            q0Var = q0Var4;
                        } else if (i32 == 3) {
                            q0Var = vt0Var;
                        } else {
                            if (i32 == 4) {
                                q0Var = q0Var3;
                            } else if (i32 == 5) {
                                q0Var = q0Var2;
                            } else {
                                q0Var = i32 == 15 ? nt0Var : null;
                                if (q0Var != null) {
                                    q0Var.h();
                                    ls0Var.l();
                                    q0Var5.l();
                                    q0Var4.l();
                                    vt0Var.X(false);
                                    q0Var3.l();
                                    nt0Var.l();
                                    q0Var2.l();
                                }
                                i31++;
                                i30 = 1;
                            }
                            if (q0Var != null) {
                            }
                            i31++;
                            i30 = 1;
                        }
                        if (q0Var != null) {
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
                for (wt0 wt0Var10 : wt0VarArr) {
                    wt0Var10.f(i33, num.intValue(), num2.intValue());
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
                for (int i34 = 0; i34 < zs0VarArr.length; i34++) {
                    int childCount = zs0VarArr[i34].h.getChildCount();
                    for (int i35 = 0; i35 < childCount; i35++) {
                        View childAt = zs0VarArr[i34].h.getChildAt(i35);
                        if (childAt instanceof org.telegram.ui.Cells.e7) {
                            org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) childAt;
                            if (e7Var.getMessage() != null) {
                                e7Var.g(false, true);
                            }
                        }
                    }
                }
                return;
            }
            for (int i36 = 0; i36 < zs0VarArr.length; i36++) {
                zs0 zs0Var3 = zs0VarArr[i36];
                if (zs0Var3 != null && (er0Var = zs0Var3.h) != null) {
                    int childCount2 = er0Var.getChildCount();
                    for (int i37 = 0; i37 < childCount2; i37++) {
                        View childAt2 = zs0VarArr[i36].h.getChildAt(i37);
                        if (childAt2 instanceof org.telegram.ui.Cells.e7) {
                            org.telegram.ui.Cells.e7 e7Var2 = (org.telegram.ui.Cells.e7) childAt2;
                            if (e7Var2.getMessage() != null) {
                                e7Var2.g(false, true);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.storiesListUpdated) {
            jh.j6 j6Var = (jh.j6) objArr[0];
            os0 os0Var = this.V;
            if (os0Var == null || j6Var != os0Var.s) {
                uq0 uq0Var = this.a0;
                if (uq0Var == null || j6Var != uq0Var.s) {
                    Iterator it = this.U1.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        gu0 gu0Var = (gu0) it.next();
                        if (gu0Var.c.s == j6Var) {
                            i12 = gu0Var.a;
                            break;
                        }
                    }
                } else {
                    i12 = 9;
                }
            } else {
                i12 = 8;
            }
            zs0 W = W(i12);
            if (W != null) {
                if (W.b != (j6Var.g() > 0)) {
                    W.b = j6Var.g() > 0;
                    o1(W, true);
                }
            }
            if (W != null) {
                AndroidUtilities.notifyDataSetChanged(W.h);
                if (W.h.getLayoutManager() instanceof f2.k0) {
                    zk0 zk0Var = W.h;
                    G(W, zk0Var, (f2.k0) zk0Var.getLayoutManager());
                }
            }
            ss0 ss0Var = this.z1;
            if (ss0Var != null) {
                ss0Var.R();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated) {
            for (zs0 zs0Var4 : zs0VarArr) {
                if (zs0Var4 != null && zs0Var4.h != null && p0(zs0Var4.B)) {
                    if (!r0() || zs0Var4.h.getAdapter() == null) {
                        for (int i38 = 0; i38 < zs0Var4.h.getChildCount(); i38++) {
                            View childAt3 = zs0Var4.h.getChildAt(i38);
                            if (childAt3 instanceof org.telegram.ui.Cells.o7) {
                                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt3;
                                i6 i6Var = o7Var.J;
                                if (!o7Var.W || (messageObject = o7Var.n) == null || (storyItem = messageObject.storyItem) == null || (storyViews = storyItem.views) == null) {
                                    o7Var.H = false;
                                    i6Var.q("", false, true);
                                } else {
                                    int i39 = storyViews.views_count;
                                    o7Var.H = i39 > 0;
                                    i6Var.q(AndroidUtilities.formatWholeNumber(i39, 0), true, true);
                                }
                            }
                        }
                    } else {
                        AndroidUtilities.notifyDataSetChanged(zs0Var4.h);
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
        qt0 qt0Var = this.N;
        if (i10 == i40) {
            if (j10 == 0 || j10 == n2Var.getUserConfig().getClientUserId()) {
                qt0Var.F(true);
                v1(true);
                F();
                L0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogsNeedReload) {
            qt0Var.F(true);
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
            qs0 qs0Var = this.T;
            if (qs0Var != null) {
                TLRPC.ChatFull chatFull = qs0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i41 = 0; i41 < qs0Var.d.participants.participants.size(); i41++) {
                        qs0Var.d.participants.participants.get(i41).setRank(longValue4, str);
                    }
                }
                for (zs0 zs0Var5 : zs0VarArr) {
                    if (zs0Var5.B == 7) {
                        AndroidUtilities.updateVisibleRows(zs0Var5.h);
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
            for (int i42 = 0; i42 < zs0VarArr.length; i42++) {
                if (zs0VarArr[i42].h.getAdapter() == nt0Var) {
                    er0 er0Var4 = zs0VarArr[i42].h;
                    ArrayList arrayList6 = nt0Var.n;
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
                                nt0Var.m(i43);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        vr0 vr0Var = this.E0;
        if (vr0Var != null) {
            canvas.save();
            canvas.translate(vr0Var.getX(), vr0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        rr0 rr0Var = this.N0;
        if (rr0Var != null) {
            int i10 = rr0Var.P;
            if ((i10 == 3 || i10 == 1) && this.L0 == null) {
                canvas.save();
                canvas.translate(rr0Var.getX(), rr0Var.getY());
                rr0Var.setDrawOverlay(true);
                rr0Var.draw(canvas);
                rr0Var.setDrawOverlay(false);
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
        zs0[] zs0VarArr = this.g0;
        float top = zs0VarArr[0].getTop();
        ar0 ar0Var = this.S;
        if (ar0Var != null && ((i10 = zs0VarArr[0].B) == 8 || w0(i10))) {
            top -= ar0Var.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Cells.l2
    public final void e(org.telegram.ui.Cells.p2 p2Var) {
        org.telegram.ui.ActionBar.n2 n2Var = this.r1;
        if (n2Var != null && n2Var.getMessagesController().getStoriesController().I(p2Var.getDialogId())) {
            n2Var.getOrCreateStoryViewer().getClass();
            jh.i9 orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
            Context context = n2Var.getContext();
            long dialogId = p2Var.getDialogId();
            jh.b7 a3 = jh.b7.a((zk0) p2Var.getParent());
            a3.s += ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).o1) ? AndroidUtilities.dp(68.0f) : 0;
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
        zs0[] zs0VarArr;
        zs0 zs0Var;
        if (this.k1) {
            return;
        }
        int i10 = 0;
        while (true) {
            zs0VarArr = this.g0;
            if (i10 >= zs0VarArr.length) {
                zs0Var = null;
                break;
            }
            int i11 = zs0VarArr[i10].B;
            if (i11 == 0 || p0(i11)) {
                break;
            } else {
                i10++;
            }
        }
        if (zs0Var != null) {
            int i12 = zs0Var.B;
            this.l1 = i12;
            boolean p02 = p0(i12);
            int[] iArr = this.i1;
            int X = X(p02 ? 1 : 0, iArr[p02 ? 1 : 0], z10);
            this.m1 = X;
            if (X != iArr[p02 ? 1 : 0]) {
                if (this.g1 && p0(this.l1)) {
                    return;
                }
                zs0Var.r.setVisibility(0);
                if (p0(this.l1)) {
                    zs0Var.r.setAdapter(l1(this.l1));
                } else {
                    zs0Var.r.setAdapter(this.E);
                }
                ys0 ys0Var = zs0Var.r;
                ys0Var.setPadding(ys0Var.getPaddingLeft(), Z(this.l1), zs0Var.r.getPaddingRight(), Y(v0()));
                zs0Var.s.y1(X);
                zs0Var.r.a0();
                zs0Var.s.O = new tr0(this, zs0Var, 0);
                AndroidUtilities.updateVisibleRows(zs0Var.h);
                this.k1 = true;
                if (this.l1 == 0) {
                    this.p1[0].g(true);
                }
                this.j1 = 0.0f;
                if (this.s < 0) {
                    X0();
                    return;
                }
                for (zs0 zs0Var2 : zs0VarArr) {
                    if (zs0Var2.B == this.l1) {
                        zs0Var2.s.h1(this.s, this.v - zs0Var2.r.getPaddingTop());
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
            zs0[] zs0VarArr = this.g0;
            if (i11 >= zs0VarArr.length) {
                break;
            }
            zs0 zs0Var = zs0VarArr[i11];
            if (zs0Var != null) {
                int i13 = zs0Var.B;
                if ((z10 && i10 == 8 && w0(i13)) || i13 == i10) {
                    i12++;
                    width = zs0VarArr[i11].getTranslationX();
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
            zs0[] zs0VarArr = this.g0;
            if (i10 >= zs0VarArr.length) {
                return;
            }
            int childCount = zs0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zs0VarArr[i10].h.getChildAt(i11);
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
        float f10 = 0.0f;
        int i11 = 0;
        while (true) {
            zs0[] zs0VarArr = this.g0;
            if (i11 >= zs0VarArr.length) {
                return f10;
            }
            zs0 zs0Var = zs0VarArr[i11];
            if (zs0Var != null) {
                int i12 = zs0Var.B;
                if ((z10 && i10 == 8 && w0(i12)) || i12 == i10) {
                    f10 = (1.0f - Math.abs(zs0VarArr[i11].getTranslationX() / getWidth())) + f10;
                }
            }
            i11++;
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
        int i10 = 1;
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
            zs0[] zs0VarArr = this.g0;
            float x8 = zs0VarArr[0].getX();
            this.b1 = new AnimatorSet();
            this.e1 = Math.abs(x8) < ((float) zs0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new v60(this, 19));
            boolean z10 = this.e1;
            Property property = View.TRANSLATION_X;
            if (z10) {
                measuredWidth = Math.abs(x8);
                if (this.d1) {
                    this.b1.playTogether(ObjectAnimator.ofFloat(zs0VarArr[0], (Property<zs0, Float>) property, 0.0f), ObjectAnimator.ofFloat(zs0VarArr[1], (Property<zs0, Float>) property, r14.getMeasuredWidth()), ofFloat);
                } else {
                    this.b1.playTogether(ObjectAnimator.ofFloat(zs0VarArr[0], (Property<zs0, Float>) property, 0.0f), ObjectAnimator.ofFloat(zs0VarArr[1], (Property<zs0, Float>) property, -r14.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = zs0VarArr[0].getMeasuredWidth() - Math.abs(x8);
                if (this.d1) {
                    this.b1.playTogether(ObjectAnimator.ofFloat(zs0VarArr[0], (Property<zs0, Float>) property, -r10.getMeasuredWidth()), ObjectAnimator.ofFloat(zs0VarArr[1], (Property<zs0, Float>) property, 0.0f), ofFloat);
                } else {
                    this.b1.playTogether(ObjectAnimator.ofFloat(zs0VarArr[0], (Property<zs0, Float>) property, r10.getMeasuredWidth()), ObjectAnimator.ofFloat(zs0VarArr[1], (Property<zs0, Float>) property, 0.0f), ofFloat);
                }
            }
            this.b1.setInterpolator(a2);
            int measuredWidth2 = getMeasuredWidth();
            float f12 = measuredWidth2 / 2;
            float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
            this.b1.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r0) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.b1.addListener(new yr0(this, i10));
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
        zs0 zs0Var;
        zs0 zs0Var2;
        jh.j6 j6Var;
        jh.j6 j6Var2;
        float f10 = 1.0f;
        zs0[] zs0VarArr = this.g0;
        if (zs0VarArr == null || (zs0Var = zs0VarArr[0]) == null || (zs0Var2 = zs0VarArr[1]) == null || zs0Var.w == null || zs0Var2.w == null) {
            return 1.0f;
        }
        int i10 = zs0Var.B;
        int i11 = zs0Var2.B;
        boolean z10 = w0(i10) || i10 == 8;
        boolean z11 = w0(i11) || i11 == 8;
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - zs0VarArr[0].w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - zs0VarArr[1].w.getVisibilityFactor();
        eu0 k12 = k1(zs0VarArr[0].B);
        if (i10 == 8 || (k12 != null && (j6Var2 = k12.s) != null && j6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        eu0 k13 = k1(i11);
        if (i11 != 8 && (k13 == null || (j6Var = k13.s) == null || j6Var.g() <= 0)) {
            f10 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f10;
        }
        if (!z11) {
            f10 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f10, Math.abs(zs0VarArr[0].getTranslationX() / zs0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        zs0[] zs0VarArr = this.g0;
        zs0 zs0Var = zs0VarArr[1];
        if (zs0Var != null && zs0Var.getVisibility() == 0) {
            if (this.c1 && !this.e1) {
                return zs0VarArr[1].B;
            }
            if (Math.abs(zs0VarArr[1].getTranslationX()) < zs0VarArr[1].getMeasuredWidth() / 2.0f) {
                return zs0VarArr[1].B;
            }
        }
        return getSelectedTab();
    }

    public zk0 getCurrentListView() {
        ms0 ms0Var;
        zs0 zs0Var = this.g0[0];
        int i10 = zs0Var.B;
        return i10 == 13 ? this.Q.getCurrentListView() : i10 == 14 ? this.R.getCurrentListView() : (i10 != 12 || (ms0Var = this.P) == null) ? zs0Var.h : ms0Var.a.t0;
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

    public org.telegram.ui.ActionBar.v0 getSearchItem() {
        return this.j0;
    }

    public ri0 getSearchOptionsItem() {
        return this.o0;
    }

    public int getSelectedTab() {
        int currentTabId = this.E0.getCurrentTabId();
        ar0 ar0Var = this.S;
        if (ar0Var == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = ar0Var.getCurrentAlbumId();
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
            zs0[] zs0VarArr = this.g0;
            if (i10 >= zs0VarArr.length) {
                return f10;
            }
            zs0 zs0Var = zs0VarArr[i10];
            if (zs0Var != null) {
                f10 = ((1.0f - Math.abs(zs0Var.getTranslationX() / getWidth())) * zs0Var.B) + f10;
            }
            i10++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w0, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.z6));
        org.telegram.ui.ActionBar.v0 v0Var = this.h0;
        ri0 iconView = v0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.g6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.z8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.q0;
        if (v0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.p0;
        if (v0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.z0};
        ImageView imageView = this.y0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.x0, 1, null, null, null, null, i12));
        vr0 vr0Var = this.E0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(vr0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.wc;
        org.telegram.ui.Cells.v0 v0Var4 = this.G0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var4, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var4, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.kd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(vr0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(vr0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(vr0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(vr0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.Hh));
        rr0 rr0Var = this.N0;
        if (rr0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(rr0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.v7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(rr0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.w7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(rr0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.u7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(rr0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.t7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(rr0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.x7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(rr0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.y7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(rr0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A7));
        }
        final int i14 = 0;
        while (true) {
            zs0[] zs0VarArr = this.g0;
            if (i14 >= zs0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.h6 h6Var = new org.telegram.ui.ActionBar.h6() { // from class: org.telegram.ui.Components.qq0
                @Override // org.telegram.ui.ActionBar.h6
                public final void b() {
                    zs0[] zs0VarArr2 = hu0.this.g0;
                    int i15 = i14;
                    er0 er0Var = zs0VarArr2[i15].h;
                    if (er0Var != null) {
                        int childCount = er0Var.getChildCount();
                        for (int i16 = 0; i16 < childCount; i16++) {
                            View childAt = zs0VarArr2[i15].h.getChildAt(i16);
                            if (childAt instanceof org.telegram.ui.Cells.p7) {
                                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                                for (int i17 = 0; i17 < 6; i17++) {
                                    p7Var.a[i17].e.invalidate();
                                }
                            } else if (childAt instanceof org.telegram.ui.Cells.e6) {
                                ((org.telegram.ui.Cells.e6) childAt).v(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.sa) {
                                ((org.telegram.ui.Cells.sa) childAt).j(0);
                            }
                        }
                    }
                }

                @Override // org.telegram.ui.ActionBar.h6
                public final /* synthetic */ void a(float f10) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
            nr0 nr0Var = zs0VarArr[i14].v;
            int i15 = org.telegram.ui.ActionBar.g6.d6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(nr0Var, 0, null, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].w, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.c7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
            int i16 = org.telegram.ui.ActionBar.g6.h6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.uh));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.m6));
            int i17 = org.telegram.ui.ActionBar.g6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            int i18 = org.telegram.ui.ActionBar.g6.y6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusColor"}, null, null, -1, h6Var, i18));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusOnlineColor"}, null, null, -1, h6Var, org.telegram.ui.ActionBar.g6.n6));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.g6.r0;
            int i19 = org.telegram.ui.ActionBar.g6.J7;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, null, drawableArr2, null, i19));
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.e6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.g6.D0}, null, -1, null, org.telegram.ui.ActionBar.g6.X8));
            TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.e6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.g6.E0}, null, -1, null, org.telegram.ui.ActionBar.g6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.e6.class}, null, drawableArr2, null, i19));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.U7));
            int i20 = org.telegram.ui.ActionBar.g6.z6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 4, new Class[]{ts0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
            int i21 = org.telegram.ui.ActionBar.g6.Ih;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
            int i22 = org.telegram.ui.ActionBar.g6.i7;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            int i23 = org.telegram.ui.ActionBar.g6.k7;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.zi));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Bi));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.e7.class}, org.telegram.ui.ActionBar.g6.f3, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.e7.class}, org.telegram.ui.ActionBar.g6.g3, null, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.i7.class}, null, null, null, org.telegram.ui.ActionBar.g6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.g6.m0, null, null, org.telegram.ui.ActionBar.g6.K6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Kh));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Jh));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.j7.class}, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, TLObject.FLAG_19, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            int i24 = org.telegram.ui.ActionBar.g6.Lh;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.p7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.p7.class}, null, null, h6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.p7.class}, null, null, h6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.d2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.d2.class}, null, null, h6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.d2.class}, null, null, h6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, null, null, new Drawable[]{this.u0}, null, org.telegram.ui.ActionBar.g6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].w.d, 4, null, null, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].w.e, 4, null, null, null, null, i18));
            i14++;
        }
    }

    public final int h0(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.B1;
        return c6Var != null ? c6Var.N0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    public final int h1(int i10) {
        gu0 j12 = j1(i10);
        if (j12 == null) {
            return -1;
        }
        return j12.b;
    }

    public final boolean i0() {
        return this.r1.getConnectionsManager().getConnectionState() == 3;
    }

    public final gu0 i1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.U1;
        gu0 gu0Var = (gu0) hashMap.get(valueOf);
        if (gu0Var != null) {
            return gu0Var;
        }
        gu0 gu0Var2 = new gu0(this, getContext(), i10);
        hashMap.put(Integer.valueOf(i10), gu0Var2);
        this.V1.put(Integer.valueOf(gu0Var2.a), Integer.valueOf(i10));
        return gu0Var2;
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

    public final gu0 j1(int i10) {
        Integer num = (Integer) this.V1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (gu0) this.U1.get(num);
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
        this.H0.setInterpolator(er.g);
        this.H0.addListener(new yr0(this, 0));
        this.H0.start();
    }

    public final eu0 k1(int i10) {
        gu0 j12;
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

    public final eu0 l1(int i10) {
        gu0 j12;
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
        return !(this instanceof n30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [f2.v0, org.telegram.ui.Components.ys0, org.telegram.ui.Components.zk0] */
    /* JADX WARN: Type inference failed for: r5v85 */
    public final void m1(boolean z10) {
        zs0[] zs0VarArr;
        zs0[] zs0VarArr2;
        f2.d1 d1Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        wt0[] wt0VarArr;
        String str;
        ?? r52;
        int i10;
        boolean z15;
        boolean z16;
        int i11;
        boolean z17;
        f2.d1 d1Var2;
        int i12;
        int i13;
        boolean z18;
        wq0 wq0Var = this.R;
        if (wq0Var != null) {
            wq0Var.i();
        }
        int i14 = 0;
        while (true) {
            zs0VarArr = this.g0;
            if (i14 >= zs0VarArr.length) {
                break;
            }
            zs0VarArr[i14].h.B0();
            i14++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zs0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(B0());
        f2.q0 adapter = zs0VarArr[z10 ? 1 : 0].h.getAdapter();
        f2.q0 q0Var = this.V;
        f2.f0 f0Var = this.U;
        if (adapter == q0Var) {
            f0Var.d(null);
        }
        boolean z19 = this.R0;
        ss0 ss0Var = this.z1;
        nt0 nt0Var = this.J;
        org.telegram.ui.ActionBar.v0 v0Var = this.j0;
        int i15 = 100;
        if (z19 && this.Q0) {
            zs0 zs0Var = zs0VarArr[z10 ? 1 : 0];
            if (zs0Var.f == null) {
                zs0Var.f = new f2.d1();
            }
            zs0 zs0Var2 = zs0VarArr[z10 ? 1 : 0];
            d1Var2 = zs0Var2.f;
            st0 st0Var = this.O;
            xs0 xs0Var = this.f0;
            ct0 ct0Var = this.d0;
            ct0 ct0Var2 = this.e0;
            ct0 ct0Var3 = this.c0;
            if (z10) {
                int i16 = zs0Var2.B;
                if (i16 == 0 || i16 == 2 || i16 == 5 || i16 == 6 || (i16 == 7 && !ss0Var.T())) {
                    this.R0 = false;
                    sr0 sr0Var = this.F0;
                    if (sr0Var != null) {
                        sr0Var.g(false);
                    }
                    this.Q0 = false;
                    m1(true);
                    return;
                }
                String obj = v0Var != null ? v0Var.getSearchField().getText().toString() : "";
                int i17 = zs0VarArr[z10 ? 1 : 0].B;
                if (i17 == 1) {
                    if (ct0Var3 != null) {
                        ct0Var3.G(obj, false);
                        if (adapter != ct0Var3) {
                            W0(adapter);
                            zs0VarArr[z10 ? 1 : 0].h.setAdapter(ct0Var3);
                        }
                    }
                } else if (i17 == 3) {
                    if (ct0Var2 != null) {
                        ct0Var2.G(obj, false);
                        if (adapter != ct0Var2) {
                            W0(adapter);
                            zs0VarArr[z10 ? 1 : 0].h.setAdapter(ct0Var2);
                        }
                    }
                } else if (i17 == 4) {
                    if (ct0Var != null) {
                        ct0Var.G(obj, false);
                        if (adapter != ct0Var) {
                            W0(adapter);
                            zs0VarArr[z10 ? 1 : 0].h.setAdapter(ct0Var);
                        }
                    }
                } else if (i17 == 7) {
                    if (xs0Var != null) {
                        xs0Var.F(obj, false);
                        if (adapter != xs0Var) {
                            W0(adapter);
                            zs0VarArr[z10 ? 1 : 0].h.setAdapter(xs0Var);
                        }
                    }
                } else if (i17 == 11) {
                    if (st0Var != null) {
                        st0Var.E(this.S0, obj);
                        if (adapter != st0Var) {
                            W0(adapter);
                            zs0VarArr[z10 ? 1 : 0].h.setAdapter(st0Var);
                        }
                    }
                } else if (i17 == 15 && nt0Var != null && adapter != nt0Var) {
                    W0(adapter);
                    er0 er0Var = zs0VarArr[z10 ? 1 : 0].h;
                    nt0Var.r = er0Var;
                    er0Var.setAdapter(nt0Var);
                }
            } else if (zs0Var2.h != null) {
                int i18 = zs0Var2.B;
                if (i18 == 1) {
                    if (adapter != ct0Var3) {
                        W0(adapter);
                        zs0VarArr[z10 ? 1 : 0].h.setAdapter(ct0Var3);
                    }
                    ct0Var3.l();
                } else if (i18 == 3) {
                    if (adapter != ct0Var2) {
                        W0(adapter);
                        zs0VarArr[z10 ? 1 : 0].h.setAdapter(ct0Var2);
                    }
                    ct0Var2.l();
                } else if (i18 == 4) {
                    if (adapter != ct0Var) {
                        W0(adapter);
                        zs0VarArr[z10 ? 1 : 0].h.setAdapter(ct0Var);
                    }
                    ct0Var.l();
                } else if (i18 == 7) {
                    if (adapter != xs0Var) {
                        W0(adapter);
                        zs0VarArr[z10 ? 1 : 0].h.setAdapter(xs0Var);
                    }
                    xs0Var.l();
                } else if (i18 == 11) {
                    if (adapter != st0Var) {
                        W0(adapter);
                        zs0VarArr[z10 ? 1 : 0].h.setAdapter(st0Var);
                    }
                    st0Var.l();
                }
            }
            zs0VarArr2 = zs0VarArr;
            z17 = false;
            z16 = false;
            i11 = 100;
        } else {
            zs0 zs0Var3 = zs0VarArr[z10 ? 1 : 0];
            if (zs0Var3.e == null) {
                zs0Var3.e = new f2.d1();
            }
            zs0 zs0Var4 = zs0VarArr[z10 ? 1 : 0];
            f2.d1 d1Var3 = zs0Var4.e;
            zs0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i19 = zs0VarArr[z10 ? 1 : 0].B;
            if (i19 == 8 || w0(i19)) {
                layoutParams.topMargin = AndroidUtilities.dp(B0());
            }
            er0 er0Var2 = zs0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = er0Var2.getPaddingLeft();
            zs0 zs0Var5 = zs0VarArr[z10 ? 1 : 0];
            er0 er0Var3 = zs0Var5.h;
            int Z = Z(zs0Var5.B);
            er0Var3.Z2 = Z;
            int paddingRight = zs0VarArr[z10 ? 1 : 0].h.getPaddingRight();
            zs0VarArr2 = zs0VarArr;
            er0 er0Var4 = zs0VarArr2[z10 ? 1 : 0].h;
            int Y = Y(v0());
            er0Var4.a3 = Y;
            er0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
            int i20 = zs0VarArr2[z10 ? 1 : 0].B;
            int[] iArr = this.i1;
            f2.q0 q0Var2 = this.G;
            View view = this.Q;
            ms0 ms0Var = this.P;
            qt0 qt0Var = this.N;
            rs0 rs0Var = this.L;
            wt0[] wt0VarArr2 = this.p1;
            if (i20 == 0) {
                f2.q0 q0Var3 = this.D;
                if (adapter != q0Var3) {
                    W0(adapter);
                    zs0VarArr2[z10 ? 1 : 0].h.setAdapter(q0Var3);
                }
                int i21 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i21;
                layoutParams.leftMargin = i21;
                wt0 wt0Var = wt0VarArr2[0];
                boolean z20 = wt0Var.h && !wt0Var.e.isEmpty();
                i15 = iArr[0];
                zs0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.u0);
                wt0 wt0Var2 = wt0VarArr2[0];
                if (wt0Var2.x == null) {
                    wt0Var2.x = new f2.d1();
                }
                z13 = z20;
                d1Var = wt0VarArr2[0].x;
                z11 = false;
            } else {
                if (i20 == 1) {
                    wt0 wt0Var3 = wt0VarArr2[1];
                    z12 = wt0Var3.h && !wt0Var3.e.isEmpty();
                    if (adapter != q0Var2) {
                        W0(adapter);
                        zs0VarArr2[z10 ? 1 : 0].h.setAdapter(q0Var2);
                    }
                } else if (i20 == 2) {
                    wt0 wt0Var4 = wt0VarArr2[2];
                    z12 = wt0Var4.h && !wt0Var4.e.isEmpty();
                    if (adapter != this.H) {
                        W0(adapter);
                        zs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.H);
                    }
                } else {
                    if (i20 == 3) {
                        if (adapter != this.F) {
                            W0(adapter);
                            zs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.F);
                        }
                    } else if (i20 == 4) {
                        wt0 wt0Var5 = wt0VarArr2[4];
                        z12 = wt0Var5.h && !wt0Var5.e.isEmpty();
                        if (adapter != this.I) {
                            W0(adapter);
                            zs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.I);
                        }
                    } else {
                        if (i20 == 5) {
                            if (adapter != this.K) {
                                W0(adapter);
                                zs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.K);
                            }
                        } else if (i20 == 15) {
                            if (adapter != nt0Var) {
                                W0(adapter);
                                er0 er0Var5 = zs0VarArr2[z10 ? 1 : 0].h;
                                nt0Var.r = er0Var5;
                                er0Var5.setAdapter(nt0Var);
                            }
                        } else if (i20 == 6) {
                            if (adapter != rs0Var) {
                                W0(adapter);
                                zs0VarArr2[z10 ? 1 : 0].h.setAdapter(rs0Var);
                            }
                        } else if (i20 == 7) {
                            if (adapter != this.T) {
                                W0(adapter);
                                zs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.T);
                            }
                        } else if (p0(i20)) {
                            f2.q0 k12 = k1(zs0VarArr2[z10 ? 1 : 0].B);
                            if (adapter != k12) {
                                W0(adapter);
                                zs0VarArr2[z10 ? 1 : 0].h.setAdapter(k12);
                                zs0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            zs0 zs0Var6 = zs0VarArr2[z10 ? 1 : 0];
                            if (zs0Var6.B != 9) {
                                f0Var.d(zs0Var6.h);
                            }
                            i15 = iArr[1];
                        } else {
                            int i22 = zs0VarArr2[z10 ? 1 : 0].B;
                            if (i22 == 10) {
                                if (adapter != this.M) {
                                    W0(adapter);
                                    zs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.M);
                                }
                            } else if (i22 == 11) {
                                if (adapter != qt0Var) {
                                    W0(adapter);
                                    zs0VarArr2[z10 ? 1 : 0].h.setAdapter(qt0Var);
                                    f2.f0 f0Var2 = qt0Var.v;
                                    er0 er0Var6 = zs0VarArr2[z10 ? 1 : 0].h;
                                    qt0Var.s = er0Var6;
                                    f0Var2.d(er0Var6);
                                }
                                d1Var = qt0Var.r;
                                z11 = true;
                                z13 = false;
                            } else if (i22 == 12) {
                                if (adapter != null) {
                                    W0(adapter);
                                    zs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (ms0Var.getParent() != zs0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(ms0Var);
                                    zs0VarArr2[z10 ? 1 : 0].addView(ms0Var, h7.z5.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                }
                            } else if (i22 == 13) {
                                if (adapter != null) {
                                    W0(adapter);
                                    zs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != zs0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    zs0VarArr2[z10 ? 1 : 0].addView(view);
                                }
                            } else if (i22 == 14) {
                                if (adapter != null) {
                                    W0(adapter);
                                    zs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (wq0Var != null && wq0Var.getParent() != zs0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(wq0Var);
                                    zs0VarArr2[z10 ? 1 : 0].addView(wq0Var);
                                    zs0VarArr2[z10 ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        d1Var = d1Var3;
                        z11 = false;
                        z13 = false;
                    }
                    d1Var = d1Var3;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                d1Var = d1Var3;
                z11 = true;
            }
            int i23 = zs0VarArr2[z10 ? 1 : 0].B;
            boolean z21 = i23 == 0 || p0(i23);
            f2.d1 d1Var4 = d1Var;
            zs0VarArr2[z10 ? 1 : 0].v.setLayoutParams(h7.z5.d(-1, -1.0f, 119, z21 ? 0.0f : 12.0f, (z21 ? 8 : 12) + 48, z21 ? 0.0f : 12.0f, z21 ? 0.0f : 12.0f));
            if (z11) {
                zs0VarArr2[z10 ? 1 : 0].h.setSections(false);
            } else {
                er0 er0Var7 = zs0VarArr2[z10 ? 1 : 0].h;
                er0Var7.getClass();
                er0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, er0Var7.l2));
                er0Var7.E2 = null;
                er0Var7.H2 = 0.0f;
                er0Var7.I2 = null;
                er0Var7.J2 = null;
                er0Var7.F2 = null;
                nk0 nk0Var = er0Var7.D2;
                if (nk0Var != null) {
                    er0Var7.p0(nk0Var);
                    er0Var7.D2 = null;
                }
            }
            zs0 zs0Var7 = zs0VarArr2[z10 ? 1 : 0];
            int i24 = zs0Var7.B;
            org.telegram.ui.ActionBar.n2 n2Var = this.r1;
            if (i24 == 15) {
                z14 = z13;
                wt0VarArr = wt0VarArr2;
                str = "";
                zs0Var7.setBackground(lh.q6.e(zs0Var7.getBackground(), n2Var.getCurrentAccount(), this.f1, org.telegram.ui.ActionBar.g6.I.q()));
                zs0VarArr2[z10 ? 1 : 0].setOutlineProvider(new cg.l1(14));
                zs0VarArr2[z10 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z14 = z13;
                wt0VarArr = wt0VarArr2;
                str = "";
                zs0Var7.setClipToOutline(false);
                r52 = 0;
                zs0VarArr2[z10 ? 1 : 0].setBackground(null);
            }
            zs0 zs0Var8 = zs0VarArr2[z10 ? 1 : 0];
            if (zs0Var8.B == 11) {
                zs0Var8.h.setItemAnimator(zs0Var8.d);
            } else {
                zs0Var8.h.setItemAnimator(r52);
                if (qt0Var != null && zs0VarArr2[z10 ? 1 : 0].h == qt0Var.s) {
                    f2.f0 f0Var3 = qt0Var.v;
                    qt0Var.s = r52;
                    f0Var3.d(r52);
                }
            }
            if (ms0Var != null && zs0VarArr2[z10 ? 1 : 0].B != 12 && ms0Var.getParent() == zs0VarArr2[z10 ? 1 : 0]) {
                ms0Var.a.onRemoveFromParent();
                zs0VarArr2[z10 ? 1 : 0].removeView(ms0Var);
            }
            if (view != null && zs0VarArr2[z10 ? 1 : 0].B != 13) {
                ViewParent parent = view.getParent();
                zs0 zs0Var9 = zs0VarArr2[z10 ? 1 : 0];
                if (parent == zs0Var9) {
                    zs0Var9.removeView(view);
                }
            }
            if (wq0Var != null && zs0VarArr2[z10 ? 1 : 0].B != 14) {
                ViewParent parent2 = wq0Var.getParent();
                zs0 zs0Var10 = zs0VarArr2[z10 ? 1 : 0];
                if (parent2 == zs0Var10) {
                    zs0Var10.removeView(wq0Var);
                }
            }
            int i25 = zs0VarArr2[z10 ? 1 : 0].B;
            if (i25 != 0 && i25 != 11 && !p0(i25) && (i12 = zs0VarArr2[z10 ? 1 : 0].B) != 2 && i12 != 5 && i12 != 6 && ((i12 != 7 || ss0Var.T()) && (i13 = zs0VarArr2[z10 ? 1 : 0].B) != 10 && i13 != 13 && i13 != 14)) {
                if (!z10) {
                    z18 = false;
                    if (v0Var != null) {
                        if (v0Var.getVisibility() == 4) {
                            if (D()) {
                                this.t0 = 0;
                                this.k0 = 1.0f;
                                v0Var.setVisibility(0);
                            } else {
                                v0Var.setVisibility(v0() ? 8 : 4);
                                this.k0 = 0.0f;
                            }
                        }
                        q1(z18);
                    }
                } else if (v0Var == null || v0Var.getVisibility() != 4 || this.C.j0) {
                    z18 = false;
                    this.t0 = 0;
                    this.k0 = 1.0f;
                } else {
                    if (D()) {
                        this.t0 = 1;
                        v0Var.setVisibility(0);
                    } else {
                        v0Var.setVisibility(v0() ? 8 : 4);
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
                if (v0Var != null) {
                    v0Var.setVisibility((v0() || this.R0) ? 8 : 4);
                }
            }
            int i26 = zs0VarArr2[z10 ? 1 : 0].B;
            if (i26 == 6) {
                if (!rs0Var.e && !rs0Var.h && rs0Var.d.isEmpty()) {
                    rs0.E(rs0Var, 0L);
                }
            } else if (i26 != 7) {
                if (p0(i26)) {
                    eu0 k13 = k1(zs0VarArr2[z10 ? 1 : 0].B);
                    if (k13 != null) {
                        jh.j6 j6Var = k13.s;
                        k13.P();
                        zs0VarArr2[z10 ? 1 : 0].w.e(j6Var != null && (j6Var.k() || (i0() && j6Var.g() > 0)), z10);
                        z15 = (j6Var == null || j6Var.g() <= 0 || t0()) ? false : true;
                    } else {
                        z15 = z14;
                    }
                    z14 = z15;
                } else {
                    int i27 = zs0VarArr2[z10 ? 1 : 0].B;
                    if (i27 != 10 && i27 != 11 && i27 != 12 && i27 != 13 && i27 != 14) {
                        if (i27 == 15) {
                            i27 = 8;
                        }
                        wt0 wt0Var6 = wt0VarArr[i27];
                        if (!wt0Var6.g && !wt0Var6.i[0] && wt0Var6.a.isEmpty()) {
                            wt0VarArr[i27].g = true;
                            q0Var2.l();
                            if (i27 == 0) {
                                int i28 = wt0VarArr[0].q;
                                if (i28 == 1) {
                                    i10 = 6;
                                } else if (i28 == 2) {
                                    i10 = 7;
                                }
                                n2Var.getMediaDataController().loadMedia(this.f1, 50, 0, 0, i10, this.B, 1, n2Var.getClassGuid(), wt0VarArr[i10].p, null, null);
                            }
                            i10 = i27;
                            n2Var.getMediaDataController().loadMedia(this.f1, 50, 0, 0, i10, this.B, 1, n2Var.getClassGuid(), wt0VarArr[i10].p, null, null);
                        }
                    }
                }
            }
            int i29 = zs0VarArr2[z10 ? 1 : 0].B;
            if (i29 == 8 || w0(i29)) {
                zs0 zs0Var11 = zs0VarArr2[z10 ? 1 : 0];
                pr0 pr0Var = zs0Var11.w;
                boolean w02 = w0(zs0Var11.B);
                int h12 = h1(zs0VarArr2[z10 ? 1 : 0].B);
                n9 n9Var = pr0Var.b;
                lh.d dVar = pr0Var.f;
                n9Var.setVisibility((w02 || u0() || r0()) ? 8 : 0);
                if (w02) {
                    dVar.setVisibility(0);
                    dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum));
                } else if (u0()) {
                    dVar.setVisibility(8);
                } else {
                    pr0Var.setStickerType(11);
                    dVar.setVisibility(!t0() ? 0 : 8);
                    dVar.h(w());
                }
                if (w02) {
                    pr0Var.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    pr0Var.e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    pr0Var.d.setText(LocaleController.getString(!t0() ? v0() ? R.string.NoPublicStoriesTitle2 : R.string.NoStoriesTitle : R.string.NoHashtagStoriesTitle));
                    pr0Var.e.setText(v0() ? LocaleController.getString(R.string.NoStoriesSubtitle2) : str);
                }
                dVar.setOnClickListener(new gh.w2(this, w02, h12, 1));
            } else {
                zs0 zs0Var12 = zs0VarArr2[z10 ? 1 : 0];
                if (zs0Var12.B == 9) {
                    if (u0()) {
                        zs0VarArr2[z10 ? 1 : 0].w.b.setVisibility(8);
                        zs0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        zs0VarArr2[z10 ? 1 : 0].w.b.setVisibility(0);
                        zs0VarArr2[z10 ? 1 : 0].w.setStickerType(11);
                        zs0VarArr2[z10 ? 1 : 0].w.f.setVisibility(0);
                        zs0VarArr2[z10 ? 1 : 0].w.f.h(w());
                    }
                    zs0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    zs0VarArr2[z10 ? 1 : 0].w.e.setText(v0() ? LocaleController.getString(R.string.NoArchivedStoriesSubtitle) : str);
                    zs0VarArr2[z10 ? 1 : 0].w.f.setOnClickListener(new dq0(this, 7));
                } else {
                    zs0Var12.w.b.setVisibility(0);
                    zs0VarArr2[z10 ? 1 : 0].w.setStickerType(1);
                    zs0VarArr2[z10 ? 1 : 0].w.d.setText(LocaleController.getString(R.string.NoResult));
                    zs0VarArr2[z10 ? 1 : 0].w.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    zs0VarArr2[z10 ? 1 : 0].w.f.setVisibility(8);
                }
            }
            z16 = false;
            zs0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            i11 = i15;
            z17 = z14;
            d1Var2 = d1Var4;
        }
        zs0 zs0Var13 = zs0VarArr2[z10 ? 1 : 0];
        zs0Var13.b = z17;
        o1(zs0Var13, z16);
        zs0VarArr2[z10 ? 1 : 0].x.y1(i11);
        zs0VarArr2[z10 ? 1 : 0].h.a0();
        if (d1Var2 != null) {
            zs0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(d1Var2);
            zs0VarArr2[z10 ? 1 : 0].r.setRecycledViewPool(d1Var2);
        }
        if (this.t0 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.C;
            if (kVar.j0) {
                this.v0 = true;
                kVar.h(true);
                this.t0 = 0;
                this.k0 = 0.0f;
                if (v0Var != null) {
                    v0Var.setVisibility(v0() ? 8 : 4);
                }
                q1(false);
            }
        }
    }

    public final void n0(ViewGroup viewGroup) {
        for (zs0 zs0Var : this.g0) {
            er0 er0Var = zs0Var.h;
            Objects.requireNonNull(er0Var);
            zs0Var.n = new jg.k(er0Var, viewGroup, new ov(er0Var, 4));
        }
        wq0 wq0Var = this.R;
        if (wq0Var != null) {
            wq0Var.O = viewGroup;
            wq0Var.N = new gh.s2(wq0Var, 0);
        }
    }

    public final void n1() {
        ls0 ls0Var = this.D;
        if (ls0Var != null) {
            ls0Var.l();
        }
        ut0 ut0Var = this.G;
        if (ut0Var != null) {
            ut0Var.l();
        }
        ut0 ut0Var2 = this.H;
        if (ut0Var2 != null) {
            ut0Var2.l();
        }
        vt0 vt0Var = this.F;
        if (vt0Var != null) {
            vt0Var.X(false);
        }
        ut0 ut0Var3 = this.I;
        if (ut0Var3 != null) {
            ut0Var3.l();
        }
        nt0 nt0Var = this.J;
        if (nt0Var != null) {
            nt0Var.l();
        }
        us0 us0Var = this.K;
        if (us0Var != null) {
            us0Var.l();
        }
        os0 os0Var = this.V;
        if (os0Var != null) {
            os0Var.l();
        }
        Iterator it = this.U1.values().iterator();
        while (it.hasNext()) {
            ((gu0) it.next()).c.l();
        }
    }

    public final void o1(zs0 zs0Var, boolean z10) {
        boolean z11 = zs0Var.b && this.d;
        ik0 fastScroll = zs0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = zs0Var.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            zs0Var.c.cancel();
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<ik0, Float>) property, fastScroll.getAlpha(), 1.0f);
            zs0Var.c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r1);
            return;
        }
        if (z11 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<ik0, Float>) property, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new org.telegram.ui.go(fastScroll));
        zs0Var.c = ofFloat2;
        ofFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            zs0[] zs0VarArr = this.g0;
            if (i10 >= zs0VarArr.length) {
                return;
            }
            er0 er0Var = zs0VarArr[i10].h;
            if (er0Var != null) {
                er0Var.getViewTreeObserver().addOnPreDrawListener(new bs0(this, i10, 0));
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
        ss0 ss0Var = this.z1;
        int height = ss0Var.f() != null ? ss0Var.f().getHeight() : 0;
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
            } else if (childAt instanceof zs0) {
                i12 = i10;
                measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                er0 er0Var = ((zs0) childAt).h;
                er0Var.setPadding(0, er0Var.U2, 0, er0Var.V2);
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
            org.telegram.ui.ActionBar.n2 n2Var = this.r1;
            if (n2Var.getParentLayout() != null && !((ActionBarLayout) n2Var.getParentLayout()).j() && !J() && !this.a) {
                if (motionEvent != null) {
                    if (this.x1 == null) {
                        this.x1 = VelocityTracker.obtain();
                    }
                    this.x1.addMovement(motionEvent);
                    x30 x30Var = this.A1;
                    if (x30Var != null) {
                        x30Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.t1 && !this.u1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.s1 = motionEvent.getPointerId(0);
                    this.u1 = true;
                    this.v1 = (int) motionEvent.getX();
                    this.w1 = (int) motionEvent.getY();
                    this.x1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.s1) {
                    int x8 = (int) (motionEvent.getX() - this.v1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.w1);
                    boolean z11 = this.t1;
                    zs0[] zs0VarArr = this.g0;
                    if (z11 && (((z10 = this.d1) && x8 > 0) || (!z10 && x8 < 0))) {
                        if (!U0(motionEvent, x8 < 0)) {
                            this.u1 = true;
                            this.t1 = false;
                            N0(false);
                            zs0VarArr[0].setTranslationX(0.0f);
                            zs0VarArr[1].setTranslationX(this.d1 ? zs0VarArr[0].getMeasuredWidth() : -zs0VarArr[0].getMeasuredWidth());
                            Z0(0.0f, zs0VarArr[1].B);
                            M0(getTabProgress());
                        }
                    }
                    if (!this.u1 || this.t1) {
                        if (this.t1) {
                            zs0VarArr[0].setTranslationX(x8);
                            if (this.d1) {
                                zs0VarArr[1].setTranslationX(zs0VarArr[0].getMeasuredWidth() + x8);
                            } else {
                                zs0VarArr[1].setTranslationX(x8 - zs0VarArr[0].getMeasuredWidth());
                            }
                            float abs2 = Math.abs(x8) / zs0VarArr[0].getMeasuredWidth();
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
                            Z0(abs2, zs0VarArr[1].B);
                            M0(getTabProgress());
                            L0();
                        }
                    } else if (Math.abs(x8) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x8) > abs) {
                        U0(motionEvent, x8 < 0);
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
        org.telegram.ui.ActionBar.v0 v0Var = this.p0;
        if (v0Var == null) {
            return;
        }
        boolean z10 = this.r1.getMessagesController().isPeerNoForwards(this.f1) || j0();
        v0Var.setAlpha(z10 ? 0.5f : 1.0f);
        if (z10 && v0Var.getBackground() != null) {
            v0Var.setBackground(null);
        } else {
            if (z10 || v0Var.getBackground() != null) {
                return;
            }
            v0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(h0(org.telegram.ui.ActionBar.g6.z8), 5, -1));
        }
    }

    public boolean q0() {
        return false;
    }

    public final void q1(boolean z10) {
        wq0 wq0Var;
        ar0 ar0Var;
        ri0 ri0Var = this.o0;
        if (ri0Var == null) {
            return;
        }
        float f10 = 0.0f;
        if (!this.R0 && (((wq0Var = this.R) == null || !wq0Var.g()) && ((ar0Var = this.S) == null || !ar0Var.w))) {
            f10 = Utilities.clamp(this.k0 + this.l0, 1.0f, 0.0f);
        }
        ri0Var.setAlpha(f10);
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
            zs0[] zs0VarArr = this.g0;
            if (i10 >= zs0VarArr.length) {
                return;
            }
            int childCount = zs0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zs0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.f7) {
                    ((org.telegram.ui.Cells.f7) childAt).b(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.o7) {
                    ((org.telegram.ui.Cells.o7) childAt).i(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) childAt).f(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.e7) {
                    ((org.telegram.ui.Cells.e7) childAt).e(false, z10);
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

    public final void s1(float f10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.i0;
        if (v0Var == null) {
            return;
        }
        zs0[] zs0VarArr = this.g0;
        zs0 zs0Var = zs0VarArr[1];
        float f11 = 0.0f;
        if (zs0Var != null && zs0Var.B == 11) {
            f11 = 0.0f + f10;
        }
        zs0 zs0Var2 = zs0VarArr[0];
        if (zs0Var2 != null && zs0Var2.B == 11) {
            f11 += 1.0f - f10;
        }
        v0Var.setAlpha(f11);
        float f12 = (0.15f * f11) + 0.85f;
        v0Var.setScaleX(f12);
        v0Var.setScaleY(f12);
        v0Var.setVisibility(f11 <= 0.01f ? 8 : 0);
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
                    wt0[] wt0VarArr = this.p1;
                    if (i10 >= wt0VarArr.length) {
                        break;
                    }
                    if (wt0VarArr[i10].b[1].size() == 0) {
                        wt0 wt0Var = wt0VarArr[i10];
                        wt0Var.j[1] = this.Z0.migrated_from_max_id;
                        wt0Var.i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.Z0;
        if (chatFull3 == null || z10 == chatFull3.stories_pinned_available) {
            return;
        }
        vr0 vr0Var = this.E0;
        if (vr0Var != null) {
            vr0Var.setInitialTabId(q0() ? 9 : 8);
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

    public void setForwardRestrictedHint(x30 x30Var) {
        this.A1 = x30Var;
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
            zs0[] zs0VarArr = this.g0;
            if (i14 >= zs0VarArr.length) {
                break;
            }
            zs0VarArr[i14].setTranslationY(this.G1);
            i14++;
        }
        if (this.L0 != null) {
            K();
        } else {
            rr0 rr0Var = this.N0;
            if (rr0Var != null) {
                rr0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
            }
        }
        this.K0 = i11;
        org.telegram.ui.Cells.v0 v0Var = this.G0;
        v0Var.setTranslationY((v0Var.getTag() == null ? -AndroidUtilities.dp(48.0f) : 0) + this.K0);
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.T1 != i10) {
            this.T1 = i10;
            zs0[] zs0VarArr = this.g0;
            if (zs0VarArr != null) {
                for (zs0 zs0Var : zs0VarArr) {
                    if (zs0Var != null) {
                        er0 er0Var = zs0Var.h;
                        int paddingLeft = er0Var.getPaddingLeft();
                        er0 er0Var2 = zs0Var.h;
                        int i11 = er0Var2.U2;
                        int paddingRight = er0Var2.getPaddingRight();
                        er0 er0Var3 = zs0Var.h;
                        int Y = Y(v0());
                        er0Var3.a3 = Y;
                        er0Var.setPadding(paddingLeft, i11, paddingRight, Y);
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
            zs0[] zs0VarArr = this.g0;
            if (i10 >= zs0VarArr.length) {
                return;
            }
            o1(zs0VarArr[i10], true);
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
            zs0[] zs0VarArr = this.g0;
            if (i11 >= zs0VarArr.length) {
                break;
            }
            float f10 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(zs0VarArr[i11].B == 8 ? 280.0f : 120.0f)))) / 2.0f;
            zs0VarArr[i11].w.setTranslationY(f10);
            zs0VarArr[i11].v.setTranslationY(-f10);
            i11++;
        }
        vq0 vq0Var = this.Q;
        if (vq0Var != null) {
            vq0Var.setVisibleHeight(i10);
        }
        wq0 wq0Var = this.R;
        if (wq0Var != null) {
            wq0Var.setVisibleHeight(i10);
        }
    }

    public boolean t0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void t1() {
        org.telegram.ui.ActionBar.v0 v0Var = this.i0;
        if (v0Var == null) {
            return;
        }
        zs0 zs0Var = this.g0[1];
        boolean z10 = zs0Var != null && zs0Var.B == 11;
        if (z10) {
            v0Var.setVisibility(0);
        }
        v0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.85f).scaleY(z10 ? 1.0f : 0.85f).withEndAction(new f50(3, this, z10)).setDuration(420L).setInterpolator(er.h).start();
    }

    public boolean u0() {
        return false;
    }

    public final void u1() {
        boolean z10;
        jh.j6 j6Var;
        boolean r02 = r0();
        org.telegram.ui.ActionBar.v0 v0Var = this.s0;
        org.telegram.ui.ActionBar.v0 v0Var2 = this.r0;
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
            SparseArray[] sparseArrayArr = this.V0;
            if (i10 >= sparseArrayArr[0].size()) {
                z10 = false;
                break;
            }
            MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i10);
            os0 os0Var = this.V;
            if (os0Var != null && (j6Var = os0Var.s) != null && !j6Var.m(messageObject.getId())) {
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
        int i10;
        boolean z11;
        int i11;
        boolean v02;
        int[] iArr;
        boolean z12;
        boolean z13;
        vr0 vr0Var;
        int selectedTab;
        boolean z14;
        boolean z15;
        long j10;
        TLRPC.UserFull userFull2;
        TLRPC.ChatFull chatFull2;
        Integer num;
        vr0 vr0Var2;
        boolean z16;
        int i12;
        int size;
        int i13;
        Boolean bool;
        String string;
        String str;
        String str2;
        wq0 wq0Var;
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
        zt0 zt0Var;
        vr0 vr0Var3 = this.E0;
        if (vr0Var3 == null) {
            return;
        }
        boolean z17 = !this.z1.r() ? false : z10;
        boolean z18 = (this.P == null || (zt0Var = this.q1) == null || !zt0Var.f) ? false : true;
        org.telegram.ui.ActionBar.n2 n2Var = this.r1;
        long j11 = this.f1;
        if (j11 <= 0 || n2Var == null) {
            c10 = 4;
            user = null;
        } else {
            c10 = 4;
            user = n2Var.getMessagesController().getUser(Long.valueOf(j11));
        }
        boolean z19 = user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        boolean z20 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.a1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z19) ? false : true;
        boolean z21 = (DialogObject.isUserDialog(j11) || DialogObject.isChatDialog(j11)) && !DialogObject.isEncryptedDialog(j11) && (((userFull = this.a1) != null && userFull.stories_pinned_available) || (((chatFull = this.Z0) != null && chatFull.stories_pinned_available) || v0())) && m0();
        wq0 wq0Var2 = this.R;
        boolean z22 = wq0Var2 != null && (((userFull3 = this.a1) != null && userFull3.stargifts_count > 0) || ((chatFull3 = this.Z0) != null && chatFull3.stargifts_count > 0));
        boolean z23 = z20;
        TLRPC.ChatFull chatFull4 = this.Z0;
        if (chatFull4 != null) {
            profileTab2 = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.a1;
            if (userFull5 == null) {
                profileTab = null;
                boolean z24 = z17;
                int i17 = this.M1 == vr0Var3.j0 ? 1 : 0;
                int i18 = (!z21 || z23) == vr0Var3.e(8) ? i17 + 1 : i17;
                if (z19 != vr0Var3.e(13)) {
                    i18++;
                }
                int i19 = i18;
                i10 = t0() == vr0Var3.e(8) ? i19 + 1 : i19;
                if (z22 == vr0Var3.e(14)) {
                    i10++;
                } else if (wq0Var2 != null && z22) {
                    z11 = z18;
                    i11 = 14;
                    if (this.L1 != wq0Var2.getLastEmojisHash()) {
                        i10++;
                    }
                    v02 = v0();
                    qs0 qs0Var = this.T;
                    boolean z25 = z22;
                    int[] iArr2 = this.T0;
                    if (v02) {
                        iArr = iArr2;
                        z12 = false;
                        z13 = false;
                    } else {
                        iArr = iArr2;
                        int i20 = i10;
                        int i21 = (qs0Var.d == null) == vr0Var3.e(7) ? i20 + 1 : i20;
                        int i22 = (iArr[0] <= 0) == vr0Var3.e(0) ? i21 + 1 : i21;
                        int i23 = (iArr[1] <= 0) == vr0Var3.e(1) ? i22 + 1 : i22;
                        if (DialogObject.isEncryptedDialog(j11)) {
                            i15 = i23;
                        } else {
                            int i24 = i23;
                            int i25 = (iArr[3] <= 0) == vr0Var3.e(3) ? i24 + 1 : i24;
                            i15 = (iArr[c10] <= 0) == vr0Var3.e(4) ? i25 + 1 : i25;
                        }
                        int i26 = i16;
                        int i27 = (iArr[2] <= 0) == vr0Var3.e(2) ? i26 + 1 : i26;
                        int i28 = (iArr[5] <= 0) == vr0Var3.e(5) ? i27 + 1 : i27;
                        int i29 = (iArr[6] <= 0) == vr0Var3.e(6) ? i28 + 1 : i28;
                        boolean z26 = !this.M.d.isEmpty();
                        int i30 = i29;
                        i10 = z26 != vr0Var3.e(10) ? i30 + 1 : i30;
                        z12 = l0() && !n2Var.getMessagesController().getSavedMessagesController().unsupported && n2Var.getMessagesController().getSavedMessagesController().hasDialogs();
                        z13 = z26;
                        if (z12 != vr0Var3.e(11)) {
                            i10++;
                        }
                        if (z11 != vr0Var3.e(12)) {
                            i10++;
                        }
                    }
                    if (i10 > 0) {
                        if (z24) {
                            TransitionSet transitionSet = new TransitionSet();
                            transitionSet.setOrdering(0);
                            z14 = z12;
                            transitionSet.addTransition(new ag.u0(3));
                            z15 = z11;
                            j10 = j11;
                            transitionSet.setDuration(200L);
                            TransitionManager.beginDelayedTransition(vr0Var3.getTabsContainer(), transitionSet);
                            vr0Var3.Q = vr0Var3.v;
                            vr0Var3.R = vr0Var3.w;
                        } else {
                            z14 = z12;
                            z15 = z11;
                            j10 = j11;
                        }
                        SparseArray g10 = vr0Var3.g();
                        if (i10 > 3) {
                            g10 = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (t0()) {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                            vr0Var3.U = 420L;
                        }
                        if (z23) {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                        } else if ((DialogObject.isUserDialog(j10) || DialogObject.isChatDialog(j10)) && !DialogObject.isEncryptedDialog(j10) && ((((userFull2 = this.a1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.Z0) != null && chatFull2.stories_pinned_available) || v0())) && m0())) {
                            if (q0()) {
                                arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                                vr0Var3.U = 420L;
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
                            HashMap hashMap = gh.d4.P;
                            hh.m7 m7Var = wq0Var2.d;
                            if (m7Var == null) {
                                wq0Var = wq0Var2;
                                num = 0;
                                vr0Var2 = vr0Var3;
                                z16 = z15;
                                str2 = string2;
                                obj = "";
                            } else {
                                z16 = z15;
                                ArrayList arrayList2 = m7Var.l;
                                str2 = string2;
                                num = 0;
                                vr0Var2 = vr0Var3;
                                Pair pair = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(wq0Var2.c));
                                if (!arrayList2.isEmpty()) {
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList3 = new ArrayList();
                                    int i31 = 0;
                                    while (true) {
                                        wq0Var = wq0Var2;
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
                                        wq0Var2 = wq0Var;
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                                        int i32 = 0;
                                        while (i32 < arrayList3.size()) {
                                            TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i32);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(MessageObject.getEmoji(document2));
                                            spannableStringBuilder2.setSpan(new t5(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
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
                                        this.L1 = wq0Var.getLastEmojisHash();
                                    }
                                } else if (!m7Var.i || (obj2 = (CharSequence) hashMap.get(pair)) == null) {
                                    wq0Var = wq0Var2;
                                } else {
                                    wq0Var = wq0Var2;
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
                            this.L1 = wq0Var.getLastEmojisHash();
                        } else {
                            num = 0;
                            vr0Var2 = vr0Var3;
                            z16 = z15;
                        }
                        if (z19) {
                            arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                        }
                        if (!v0()) {
                            if (z14) {
                                arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                            }
                            if (qs0Var.d != null) {
                                arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                            }
                            if (iArr[0] > 0) {
                                if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && qs0Var.d == null) {
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
                        vr0Var = vr0Var2;
                        if (vr0Var.j0) {
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
                                    if (!vr0Var.e(((Integer) pair2.first).intValue())) {
                                        vr0Var.a(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, g10);
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
                        vr0Var = vr0Var3;
                    }
                    selectedTab = getSelectedTab();
                    if (selectedTab >= 0) {
                        this.g0[0].B = selectedTab;
                    }
                    this.M1 = vr0Var.j0;
                    vr0Var.c();
                    L0();
                    I();
                }
                z11 = z18;
                i11 = 14;
                v02 = v0();
                qs0 qs0Var2 = this.T;
                boolean z252 = z22;
                int[] iArr22 = this.T0;
                if (v02) {
                }
                if (i10 > 0) {
                }
                selectedTab = getSelectedTab();
                if (selectedTab >= 0) {
                }
                this.M1 = vr0Var.j0;
                vr0Var.c();
                L0();
                I();
            }
            profileTab2 = userFull5.main_tab;
        }
        profileTab = profileTab2;
        boolean z242 = z17;
        if (this.M1 == vr0Var3.j0) {
        }
        int i172 = this.M1 == vr0Var3.j0 ? 1 : 0;
        if ((!z21 || z23) == vr0Var3.e(8)) {
        }
        if (z19 != vr0Var3.e(13)) {
        }
        int i192 = i18;
        if (t0() == vr0Var3.e(8)) {
        }
        if (z22 == vr0Var3.e(14)) {
        }
        z11 = z18;
        i11 = 14;
        v02 = v0();
        qs0 qs0Var22 = this.T;
        boolean z2522 = z22;
        int[] iArr222 = this.T0;
        if (v02) {
        }
        if (i10 > 0) {
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
        }
        this.M1 = vr0Var.j0;
        vr0Var.c();
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
                this.S1.setSpan(new cq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.S1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.S1;
    }

    public final Boolean w1(View view, View view2) {
        if (this.k1) {
            return null;
        }
        zs0[] zs0VarArr = this.g0;
        zs0 zs0Var = zs0VarArr[0];
        if (zs0Var == null) {
            return null;
        }
        int i10 = zs0Var.B;
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
            } else if (c0(zs0VarArr[0].B) >= 5 || w0(zs0VarArr[0].B)) {
                SharedConfig.setStoriesColumnsCount(X);
            }
            B(X);
        }
        return Boolean.valueOf(X != X(p02 ? 1 : 0, X, true));
    }

    public final void x(b70 b70Var, org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        String publicUsername = j10 > 0 ? UserObject.getPublicUsername(MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j10))) : ChatObject.getPublicUsername(MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j10)));
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i0.a.z(sb2, MessagesController.getInstance(n2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        b70Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new org.telegram.ui.ActionBar.i3((KeyEvent.Callback) this, (Object) sb2.toString(), n2Var, 29), false);
    }

    public final boolean x0() {
        if (C() && ((getClosestTab() == 8 || getClosestTab() == 13 || w0(getClosestTab())) && this.y1)) {
            return false;
        }
        wq0 wq0Var = this.R;
        if (wq0Var != null && wq0Var.g()) {
            return false;
        }
        ar0 ar0Var = this.S;
        return ((ar0Var != null && ar0Var.w) || this.k1 || this.c1) ? false : true;
    }

    public final Boolean x1(View view, View view2) {
        if (this.k1) {
            return null;
        }
        zs0[] zs0VarArr = this.g0;
        zs0 zs0Var = zs0VarArr[0];
        if (zs0Var == null) {
            return null;
        }
        if (this.g1 && p0(zs0Var.B)) {
            return null;
        }
        int i10 = zs0VarArr[0].B;
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
            } else if (c0(zs0VarArr[0].B) >= 5 || w0(zs0VarArr[0].B)) {
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
    public final void y(b70 b70Var) {
        zs0 zs0Var;
        int x8 = b70Var.x();
        final int i10 = 0;
        b70Var.c(R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn), new Runnable(this) { // from class: org.telegram.ui.Components.mq0
            public final /* synthetic */ hu0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        hu0 hu0Var = this.b;
                        hu0Var.getClass();
                        View[] viewArr = r2;
                        hu0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        hu0 hu0Var2 = this.b;
                        hu0Var2.getClass();
                        View[] viewArr2 = r2;
                        hu0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        b70Var.c(R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut), new Runnable(this) { // from class: org.telegram.ui.Components.mq0
            public final /* synthetic */ hu0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        hu0 hu0Var = this.b;
                        hu0Var.getClass();
                        View[] viewArr = r2;
                        hu0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        hu0 hu0Var2 = this.b;
                        hu0Var2.getClass();
                        View[] viewArr2 = r2;
                        hu0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final View[] viewArr = {b70Var.w(x8), b70Var.w(x8 + 1)};
        zs0[] zs0VarArr = this.g0;
        if (zs0VarArr != null && (zs0Var = zs0VarArr[0]) != null) {
            boolean p02 = p0(zs0Var.B);
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
        wt0[] wt0VarArr = this.p1;
        wt0VarArr[i10].a.clear();
        wt0VarArr[i10].b[0].clear();
        wt0VarArr[i10].b[1].clear();
        wt0 wt0Var = wt0VarArr[i10];
        wt0Var.j[0] = i11;
        wt0Var.i[0] = false;
        wt0Var.l = false;
        wt0Var.m = i12;
        wt0Var.n = (wt0Var.e() - i12) - 1;
        wt0 wt0Var2 = wt0VarArr[i10];
        if (wt0Var2.n < 0) {
            wt0Var2.n = 0;
        }
        wt0Var2.k = i11;
        wt0Var2.o = true;
        wt0Var2.g = false;
        wt0Var2.p++;
        zs0 W = W(i10);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (!z10) {
            return;
        }
        int i13 = 0;
        while (true) {
            zs0[] zs0VarArr = this.g0;
            if (i13 >= zs0VarArr.length) {
                return;
            }
            zs0 zs0Var = zs0VarArr[i13];
            if (zs0Var.B == i10) {
                zs0Var.x.h1(Math.min(wt0VarArr[i10].e() - 1, wt0VarArr[i10].m), 0);
            }
            i13++;
        }
    }

    public final void z(ys0 ys0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = ys0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ys0Var.getChildAt(i11);
            if (childAt instanceof h00) {
                view = childAt;
            }
        }
        if (view != null) {
            ys0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new as0(this, ys0Var, sparseBooleanArray, (h00) view, i10));
    }

    public final void z0(boolean z10) {
        long j10 = this.B;
        if (j10 != 0 || t0()) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            final int i11 = Z1[i10];
            wt0[] wt0VarArr = this.p1;
            if (wt0VarArr[i11].h && !z10) {
                return;
            }
            long j11 = this.f1;
            if (DialogObject.isEncryptedDialog(j11)) {
                return;
            }
            wt0VarArr[i11].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i11 == 0) {
                int i12 = wt0VarArr[i11].q;
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
            org.telegram.ui.ActionBar.n2 n2Var = this.r1;
            tL_messages_getSearchResultsPositions.peer = n2Var.getMessagesController().getInputPeer(j11);
            if (j10 != 0 && n2Var.getUserConfig().getClientUserId() == j11) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = n2Var.getMessagesController().getInputPeer(j10);
            }
            final int i13 = wt0VarArr[i11].p;
            ConnectionsManager.getInstance(n2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(n2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() { // from class: org.telegram.ui.Components.aq0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new hq0(hu0.this, tL_error, i13, i11, tLObject, 0));
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
