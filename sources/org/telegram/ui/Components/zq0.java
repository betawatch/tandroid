package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public class zq0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int W0 = 0;
    public boolean A0;
    public o1.k B0;
    public TLRPC.Dialog C0;
    public final kq0 D0;
    public final zl0 E;
    public ArrayList E0;
    public final aq0 F;
    public TL_stories.StoryItem F0;
    public final aq0 G;
    public i0.b G0;
    public final s4.s H;
    public int H0;
    public final s4.s I;
    public boolean I0;
    public final rz J;
    public org.telegram.ui.ActionBar.n1 J0;
    public final rq0 K;
    public int K0;
    public final wq0 L;
    public boolean L0;
    public final vq0 M;
    public boolean M0;
    public final ArrayList N;
    public int N0;
    public final String[] O;
    public final ah.i O0;
    public final int P;
    public final ah.c P0;
    public final tx0 Q;
    public final ah.c Q0;
    public final Drawable R;
    public final ah.c R0;
    public final View[] S;
    public final mh S0;
    public final AnimatorSet[] T;
    public final ch.d T0;
    public final a0.i U;
    public final ah.e U0;
    public final HashMap V;
    public final ch.d V0;
    public final lq0 W;
    public int X;
    public boolean Y;
    public final boolean Z;
    public boolean a0;
    public final FrameLayout b;
    public final int b0;
    public final dq0 c;
    public final FrameLayout c0;
    public final eq0 d;
    public final LinearLayout d0;
    public final ii.z1 e;
    public final qp e0;
    public final dq0 f;
    public final org.telegram.ui.yn f0;
    public final Activity g0;
    public final FrameLayout h;
    public final boolean h0;
    public boolean i0;
    public final TextPaint j0;
    public TLRPC.TL_exportedMessageLink k0;
    public boolean l0;
    public boolean m0;
    public final ci.ab n;
    public final boolean n0;
    public final String[] o0;
    public int p0;
    public int q0;
    public final FrameLayout r;
    public boolean r0;
    public final org.telegram.ui.ActionBar.i5 s;
    public oq0 s0;
    public float t0;
    public float u0;
    public final FrameLayout v;
    public float v0;
    public final FrameLayout w;
    public ValueAnimator w0;
    public final LinearLayout x;
    public final dl0 x0;
    public AnimatorSet y;
    public final f20 y0;
    public final org.telegram.ui.ActionBar.k z0;

    public zq0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, d6Var);
    }

    public static zq0 K0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        return new zq0(context, messageObject != null ? org.telegram.messenger.f0.k(messageObject) : null, str, null, z10, str2, null, false);
    }

    public static void k0(zq0 zq0Var) {
        aq0 aq0Var = zq0Var.F;
        aq0 aq0Var2 = zq0Var.G;
        zl0 zl0Var = zq0Var.E;
        if (zq0Var.r0) {
            return;
        }
        aq0 aq0Var3 = zq0Var.L0 ? aq0Var2 : aq0Var;
        if (aq0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = aq0Var3.getChildAt(0);
        for (int i10 = 0; i10 < aq0Var3.getChildCount(); i10++) {
            if (aq0Var3.getChildAt(i10).getTop() < childAt.getTop()) {
                childAt = aq0Var3.getChildAt(i10);
            }
        }
        il0 il0Var = (il0) aq0Var3.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i11 = (top <= 0 || il0Var == null || il0Var.b() != 0) ? 0 : top;
        if (top < 0 || il0Var == null || il0Var.b() != 0) {
            zq0Var.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            zq0Var.Q0(true);
            top = i11;
        } else {
            zq0Var.K0 = childAt.getTop();
            zq0Var.Q0(false);
        }
        if (zl0Var.getVisibility() == 0) {
            if (zl0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = zl0Var.getChildAt(0);
            for (int i12 = 0; i12 < zl0Var.getChildCount(); i12++) {
                if (zl0Var.getChildAt(i12).getTop() < childAt2.getTop()) {
                    childAt2 = zl0Var.getChildAt(i12);
                }
            }
            il0 il0Var2 = (il0) zl0Var.G(childAt2);
            int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
            int i13 = (top2 <= 0 || il0Var2 == null || il0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || il0Var2 == null || il0Var2.b() != 0) {
                zq0Var.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                zq0Var.Q0(true);
                top2 = i13;
            } else {
                zq0Var.K0 = childAt2.getTop();
                zq0Var.Q0(false);
            }
            top = AndroidUtilities.lerp(top, top2, zl0Var.getAlpha());
        }
        int i14 = zq0Var.p0;
        if (i14 != top) {
            zq0Var.q0 = i14;
            float f7 = top;
            int i15 = (int) (zq0Var.t0 + f7);
            zq0Var.p0 = i15;
            aq0Var.setTopGlowOffset(i15);
            int i16 = (int) (zq0Var.t0 + f7);
            zq0Var.p0 = i16;
            aq0Var2.setTopGlowOffset(i16);
            int i17 = (int) (f7 + zq0Var.t0);
            zq0Var.p0 = i17;
            zl0Var.setTopGlowOffset(i17);
            zq0Var.b.setTranslationY(zq0Var.p0 + zq0Var.t0);
            zq0Var.Q.setTranslationY(zq0Var.p0 + zq0Var.t0);
            zq0Var.containerView.invalidate();
        }
    }

    public static void m(zq0 zq0Var, int i10) {
        ah.i iVar = zq0Var.O0;
        if (Build.VERSION.SDK_INT < 31 || iVar == null) {
            return;
        }
        if (w7.e0.a(i10, 4)) {
            iVar.h(zq0Var.glassEngine.e());
        }
        iVar.e(zq0Var.S0, zq0Var.containerView.getWidth(), zq0Var.containerView.getHeight());
    }

    public static /* synthetic */ void n(zq0 zq0Var, Canvas canvas, RectF rectF) {
        aq0 aq0Var = zq0Var.F;
        gh.d.a(aq0Var, canvas, rectF, aq0Var, zq0Var.containerView);
    }

    public static void o(zq0 zq0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
        int i11;
        boolean z11;
        char c10;
        MessageObject messageObject;
        long j3;
        int i12;
        long j10;
        String[] strArr;
        MessageObject messageObject2;
        SendMessagesHelper.SendMessageParams of2;
        ArrayList arrayList2;
        TLRPC.TL_forumTopic tL_forumTopic;
        dq0 dq0Var;
        long j11;
        long j12;
        Long l4;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue;
        String[] strArr2 = zq0Var.O;
        eq0 eq0Var = zq0Var.d;
        dq0 dq0Var2 = zq0Var.c;
        HashMap hashMap2 = zq0Var.V;
        Long l10 = 0L;
        a0.i iVar = zq0Var.U;
        ArrayList arrayList3 = zq0Var.N;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i13 = 0;
            boolean z12 = false;
            while (true) {
                if (i13 >= iVar.m()) {
                    arrayList2 = arrayList3;
                    tL_forumTopic = null;
                    break;
                }
                long j13 = iVar.j(i13);
                boolean isMonoForum = MessagesController.getInstance(zq0Var.currentAccount).isMonoForum(j13);
                Long l11 = hashMap == null ? l10 : (Long) hashMap.get(Long.valueOf(j13));
                if (l11 != null && l11.longValue() > 0) {
                    z12 = true;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap2.get(iVar.f(j13));
                if (tL_forumTopic2 == null || !isMonoForum) {
                    dq0Var = dq0Var2;
                    j11 = j13;
                    j12 = 0;
                } else {
                    dq0Var = dq0Var2;
                    j11 = j13;
                    j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                }
                if (tL_forumTopic2 == null || isMonoForum) {
                    l4 = l10;
                    messageObject3 = null;
                } else {
                    l4 = l10;
                    messageObject3 = new MessageObject(zq0Var.currentAccount, tL_forumTopic2.topicStartMessage, false, false);
                }
                if (messageObject3 != null) {
                    messageObject3.isTopicMainMessage = true;
                }
                if (dq0Var.getTag() == null || eq0Var.a.length() <= 0) {
                    messageObject4 = messageObject3;
                    arrayList2 = arrayList3;
                } else {
                    CharSequence charSequence = charSequenceArr[0];
                    MessageObject messageObject5 = messageObject3;
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(charSequence == null ? null : charSequence.toString(), j11, messageObject5, messageObject3, null, true, arrayList, null, null, z10, 0, 0, null, false);
                    messageObject4 = messageObject5;
                    if (l11 == null) {
                        arrayList2 = arrayList3;
                        longValue = 0;
                    } else {
                        arrayList2 = arrayList3;
                        longValue = l11.longValue();
                    }
                    of3.payStars = longValue;
                    of3.monoForumPeer = j12;
                    SendMessagesHelper.getInstance(zq0Var.currentAccount).sendMessage(of3);
                }
                long j14 = j11;
                int sendMessage = SendMessagesHelper.getInstance(zq0Var.currentAccount).sendMessage(zq0Var.N, j14, !zq0Var.I0, false, z10, 0, 0, messageObject4, i10, l11 == null ? 0L : l11.longValue(), j12, null);
                if (sendMessage != 0) {
                    arrayList4.add(Long.valueOf(j14));
                }
                if (iVar.m() == 1) {
                    tL_forumTopic = null;
                    e5.t0(sendMessage, zq0Var.f0, null);
                    if (sendMessage != 0) {
                        break;
                    }
                }
                i13++;
                arrayList3 = arrayList2;
                dq0Var2 = dq0Var;
                l10 = l4;
            }
            int size = arrayList4.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList4.get(i14);
                i14++;
                long longValue2 = ((Long) obj).longValue();
                TLRPC.Dialog dialog = (TLRPC.Dialog) iVar.f(longValue2);
                iVar.l(longValue2);
                if (dialog != null) {
                    hashMap2.remove(dialog);
                }
            }
            if (!iVar.i()) {
                zq0Var.O0(iVar, arrayList2.size(), iVar.m() == 1 ? (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(0)) : tL_forumTopic, !z12);
            }
        } else {
            lq0 lq0Var = zq0Var.W;
            int i15 = lq0Var != null ? lq0Var.d : 0;
            if (zq0Var.F0 != null) {
                int i16 = 0;
                boolean z13 = false;
                while (i16 < iVar.m()) {
                    long j15 = iVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(zq0Var.currentAccount).isMonoForum(j15);
                    Long l12 = hashMap == null ? l10 : (Long) hashMap.get(Long.valueOf(j15));
                    if (l12 != null && l12.longValue() > 0) {
                        z13 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap2.get(iVar.f(j15));
                    if (tL_forumTopic3 == null || !isMonoForum2) {
                        i12 = i15;
                        j10 = 0;
                    } else {
                        i12 = i15;
                        j10 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    }
                    if (tL_forumTopic3 == null || isMonoForum2) {
                        strArr = strArr2;
                        messageObject2 = null;
                    } else {
                        strArr = strArr2;
                        messageObject2 = new MessageObject(zq0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    }
                    if (zq0Var.F0 != null) {
                        if (dq0Var2.getTag() != null && eq0Var.a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(zq0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j15, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j15, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = zq0Var.F0;
                    } else if (dq0Var2.getTag() == null || eq0Var.a.length() <= 0) {
                        of2 = SendMessagesHelper.SendMessageParams.of(strArr[i12], j15, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                    } else {
                        CharSequence charSequence2 = charSequenceArr[0];
                        of2 = SendMessagesHelper.SendMessageParams.of(charSequence2 == null ? null : charSequence2.toString(), j15, messageObject2, messageObject2, null, true, arrayList, null, null, z10, 0, 0, null, false);
                    }
                    of2.payStars = l12 == null ? 0L : l12.longValue();
                    of2.monoForumPeer = j10;
                    SendMessagesHelper.getInstance(zq0Var.currentAccount).sendMessage(of2);
                    i16++;
                    i15 = i12;
                    strArr2 = strArr;
                }
                z11 = z13;
            } else {
                int i17 = i15;
                if (strArr2[i17] != null) {
                    boolean z14 = false;
                    for (int i18 = 0; i18 < iVar.m(); i18++) {
                        long j16 = iVar.j(i18);
                        boolean isMonoForum3 = MessagesController.getInstance(zq0Var.currentAccount).isMonoForum(j16);
                        Long l13 = hashMap == null ? l10 : (Long) hashMap.get(Long.valueOf(j16));
                        if (l13 != null && l13.longValue() > 0) {
                            z14 = true;
                        }
                        TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap2.get(iVar.f(j16));
                        long peerDialogId = (tL_forumTopic4 == null || !isMonoForum3) ? 0L : DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                        if (tL_forumTopic4 == null || isMonoForum3) {
                            c10 = 0;
                            messageObject = null;
                        } else {
                            c10 = 0;
                            messageObject = new MessageObject(zq0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                        }
                        if (dq0Var2.getTag() == null || eq0Var.a.length() <= 0) {
                            j3 = j16;
                        } else {
                            CharSequence charSequence3 = charSequenceArr[c10];
                            SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(charSequence3 == null ? null : charSequence3.toString(), j16, messageObject, messageObject, null, true, arrayList, null, null, z10, 0, 0, null, false);
                            j3 = j16;
                            of4.payStars = l13 == null ? 0L : l13.longValue();
                            of4.monoForumPeer = peerDialogId;
                            SendMessagesHelper.getInstance(zq0Var.currentAccount).sendMessage(of4);
                        }
                        SendMessagesHelper.SendMessageParams of5 = SendMessagesHelper.SendMessageParams.of(strArr2[i17], j3, messageObject, messageObject, null, true, null, null, null, z10, 0, 0, null, false);
                        of5.payStars = l13 == null ? 0L : l13.longValue();
                        of5.monoForumPeer = peerDialogId;
                        SendMessagesHelper.getInstance(zq0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z14;
                } else {
                    i11 = 0;
                    z11 = false;
                    zq0Var.O0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i11)), !z11);
                }
            }
            i11 = 0;
            zq0Var.O0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i11)), !z11);
        }
        oq0 oq0Var = zq0Var.s0;
        if (oq0Var != null) {
            oq0Var.V();
        }
        zq0Var.dismiss();
    }

    public static void p(zq0 zq0Var, int i10) {
        TLRPC.Dialog dialog;
        f20 f20Var = zq0Var.y0;
        HashMap hashMap = zq0Var.V;
        a0.i iVar = zq0Var.U;
        rq0 rq0Var = zq0Var.K;
        wq0 wq0Var = zq0Var.L;
        if (wq0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = zq0Var.C0;
            if (dialog2 == null) {
                return;
            }
            iVar.k(dialog2, dialog2.id);
            hashMap.remove(dialog2);
            zq0Var.X0(2);
            if (zq0Var.L0 || zq0Var.M0) {
                if (((TLRPC.Dialog) rq0Var.e.f(dialog2.id)) == null) {
                    rq0Var.e.k(dialog2, dialog2.id);
                    ArrayList arrayList = rq0Var.d;
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                rq0Var.l();
                zq0Var.A0 = false;
                f20Var.r.setText("");
                zq0Var.H0(false);
            }
            for (int i11 = 0; i11 < zq0Var.M0().getChildCount(); i11++) {
                View childAt = zq0Var.M0().getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                    if (g7Var.getCurrentDialog() == zq0Var.C0.id) {
                        g7Var.d(null, false, true);
                        g7Var.b(true, true);
                    }
                }
            }
            zq0Var.I0();
            return;
        }
        TLRPC.TL_forumTopic E = wq0Var.E(i10);
        if (E == null || (dialog = zq0Var.C0) == null) {
            return;
        }
        long j3 = dialog.id;
        boolean isMonoForum = MessagesController.getInstance(zq0Var.currentAccount).isMonoForum(j3);
        TLRPC.Dialog dialog3 = zq0Var.C0;
        iVar.k(dialog3, j3);
        hashMap.put(dialog3, E);
        zq0Var.X0(2);
        if (zq0Var.L0 || zq0Var.M0) {
            if (((TLRPC.Dialog) rq0Var.e.f(dialog3.id)) == null) {
                rq0Var.e.k(dialog3, dialog3.id);
                ArrayList arrayList2 = rq0Var.d;
                arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
            }
            rq0Var.l();
            zq0Var.A0 = false;
            f20Var.r.setText("");
            zq0Var.H0(false);
        }
        for (int i12 = 0; i12 < zq0Var.M0().getChildCount(); i12++) {
            View childAt2 = zq0Var.M0().getChildAt(i12);
            if (childAt2 instanceof org.telegram.ui.Cells.g7) {
                org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) childAt2;
                if (g7Var2.getCurrentDialog() == zq0Var.C0.id) {
                    g7Var2.d(E, isMonoForum, true);
                    g7Var2.b(true, true);
                }
            }
        }
        zq0Var.I0();
    }

    public static boolean q(final zq0 zq0Var) {
        org.telegram.ui.yn ynVar;
        ii.z1 z1Var = zq0Var.e;
        boolean z10 = zq0Var.h0;
        Activity activity = zq0Var.g0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(zq0Var.getContext());
        linearLayout.setOrientation(1);
        if (zq0Var.N != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, zq0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new hq0(zq0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new up0(zq0Var, 2));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, zq0Var.getContext(), zq0Var.resourcesProvider, true, false);
            if (z10) {
                f1Var.setTextColor(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var, w7.z5.n(-1, 48));
            f1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            zq0Var.I0 = true;
            f1Var.setChecked(true);
            final org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(1, zq0Var.getContext(), zq0Var.resourcesProvider, false, true);
            if (z10) {
                f1Var2.setTextColor(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, w7.z5.n(-1, 48));
            f1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            f1Var2.setChecked(!zq0Var.I0);
            final int i10 = 0;
            f1Var.setOnClickListener(new View.OnClickListener(zq0Var) { // from class: org.telegram.ui.Components.xp0
                public final /* synthetic */ zq0 b;

                {
                    this.b = zq0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.b.I0 = true;
                            f1Var.setChecked(true);
                            f1Var2.setChecked(!r3.I0);
                            break;
                        default:
                            this.b.I0 = false;
                            f1Var.setChecked(false);
                            f1Var2.setChecked(!r3.I0);
                            break;
                    }
                }
            });
            final int i11 = 1;
            f1Var2.setOnClickListener(new View.OnClickListener(zq0Var) { // from class: org.telegram.ui.Components.xp0
                public final /* synthetic */ zq0 b;

                {
                    this.b = zq0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.b.I0 = true;
                            f1Var.setChecked(true);
                            f1Var2.setChecked(!r3.I0);
                            break;
                        default:
                            this.b.I0 = false;
                            f1Var.setChecked(false);
                            f1Var2.setChecked(!r3.I0);
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.z5.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, zq0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new hq0(zq0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new up0(zq0Var, 3));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, zq0Var.getContext(), zq0Var.resourcesProvider, true, true);
        if (z10) {
            f1Var3.setTextColor(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.ng));
            f1Var3.setIconColor(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.H6));
        }
        f1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        f1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(f1Var3, w7.z5.n(-1, 48));
        f1Var3.setOnClickListener(new tp0(zq0Var, 2));
        org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(0, zq0Var.getContext(), zq0Var.resourcesProvider, true, true);
        if (z10) {
            f1Var4.setTextColor(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.ng));
            f1Var4.setIconColor(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.H6));
        }
        f1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        f1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(f1Var4, w7.z5.n(-1, 48));
        f1Var4.setOnClickListener(new tp0(zq0Var, 3));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(zq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.z5.n(-1, -2));
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        zq0Var.J0 = n1Var;
        n1Var.b = false;
        n1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        zq0Var.J0.setOutsideTouchable(true);
        zq0Var.J0.setClippingEnabled(true);
        zq0Var.J0.setInputMethodMode(2);
        zq0Var.J0.setSoftInputMode(0);
        zq0Var.J0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        zq0Var.J0.setFocusable(true);
        int[] iArr = new int[2];
        z1Var.getLocationInWindow(iArr);
        zq0Var.J0.showAtLocation(z1Var, 51, AndroidUtilities.dp(8.0f) + ((z1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!zq0Var.keyboardVisible || (ynVar = zq0Var.f0) == null || ynVar.V0.getMeasuredHeight() <= AndroidUtilities.dp(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f) : z1Var.getMeasuredHeight() + iArr[1]);
        zq0Var.J0.b();
        try {
            z1Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static /* synthetic */ void r(zq0 zq0Var, AtomicReference atomicReference, gq0 gq0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        gq0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, zq0Var.currentAccount, Long.valueOf(-dialog.id));
    }

    public static int s0(zq0 zq0Var) {
        aq0 aq0Var = zq0Var.F;
        if (aq0Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = aq0Var.getChildAt(0);
        il0 il0Var = (il0) aq0Var.G(childAt);
        if (il0Var == null) {
            return -1000;
        }
        int paddingTop = aq0Var.getPaddingTop();
        if (il0Var.c() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    public final void H0(boolean z10) {
        f20 f20Var = this.y0;
        ci.h2 h2Var = f20Var.r;
        ci.h2 h2Var2 = f20Var.r;
        boolean isEmpty = TextUtils.isEmpty(h2Var.getText());
        aq0 aq0Var = this.F;
        aq0 aq0Var2 = this.G;
        boolean z11 = true;
        if (!isEmpty || ((this.keyboardVisible && h2Var2.hasFocus()) || this.M0)) {
            this.A0 = true;
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(aq0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(aq0Var2, true);
            }
        } else {
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(aq0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(aq0Var2, false);
            }
            z11 = false;
        }
        if (this.L0 != z11 || z10) {
            this.L0 = z11;
            vq0 vq0Var = this.M;
            vq0Var.l();
            this.K.l();
            if (this.L0) {
                if (this.K0 == Integer.MAX_VALUE) {
                    ((s4.c0) aq0Var2.getLayoutManager()).h1(0, -aq0Var2.getPaddingTop());
                } else {
                    ((s4.c0) aq0Var2.getLayoutManager()).h1(0, this.K0 - aq0Var2.getPaddingTop());
                }
                vq0Var.E(h2Var2.getText().toString());
                return;
            }
            int i10 = this.K0;
            s4.s sVar = this.H;
            if (i10 == Integer.MAX_VALUE) {
                sVar.h1(0, 0);
            } else {
                sVar.h1(0, 0);
            }
        }
    }

    public final void I0() {
        TLRPC.Dialog dialog = this.C0;
        if (dialog == null) {
            return;
        }
        View view = null;
        this.C0 = null;
        for (int i10 = 0; i10 < M0().getChildCount(); i10++) {
            View childAt = M0().getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) childAt).getCurrentDialog() == dialog.id) {
                view = childAt;
            }
        }
        if (view == null) {
            return;
        }
        o1.k kVar = this.B0;
        if (kVar != null) {
            kVar.c();
        }
        M0().setVisibility(0);
        f20 f20Var = this.y0;
        f20Var.setVisibility(0);
        ci.h2 h2Var = f20Var.r;
        if (this.L0 || this.M0) {
            this.D0.H.v = true;
            h2Var.requestFocus();
            AndroidUtilities.showKeyboard(h2Var);
        }
        int[] iArr = new int[2];
        o1.k kVar2 = new o1.k(new o1.j(1000.0f));
        o1.l lVar = new o1.l(0.0f);
        org.telegram.ui.yn ynVar = this.f0;
        lVar.b((ynVar == null || !ynVar.b) ? 800.0f : 10.0f);
        lVar.a(1.0f);
        kVar2.u = lVar;
        this.B0 = kVar2;
        kVar2.b(new sp0(this, (org.telegram.ui.Cells.g7) view, iArr, 0));
        this.B0.a(new ib(this, 4));
        this.B0.f();
    }

    public final void J0() {
        boolean z10 = false;
        if (this.k0 == null && this.o0[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", L0()));
            oq0 oq0Var = this.s0;
            if (oq0Var != null) {
                oq0Var.x0();
                return;
            }
            if (this.g0 instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.k0;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z10 = true;
                }
                ((LaunchActivity) this.g0).D0(new i2.y(5, z10));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final String L0() {
        String str;
        String[] strArr = this.o0;
        lq0 lq0Var = this.W;
        if (lq0Var != null) {
            str = strArr[lq0Var.d];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.k0;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        qp qpVar = this.e0;
        if (qpVar != null && qpVar.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.b0)).build().toString();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return str == null ? "" : str;
    }

    public final zl0 M0() {
        return (this.L0 || this.M0) ? this.G : this.F;
    }

    public final void N0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        zl0 zl0Var = this.E;
        zl0Var.setPivotX(width);
        zl0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        zl0Var.setScaleX(f11);
        zl0Var.setScaleY(f11);
        zl0Var.setAlpha(f7);
        zl0 M0 = M0();
        M0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        M0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        M0.setScaleX(f12);
        M0.setScaleY(f12);
        float f13 = 1.0f - f7;
        M0.setAlpha(f13);
        f20 f20Var = this.y0;
        f20Var.setPivotX(f20Var.getWidth() / 2.0f);
        f20Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        f20Var.setScaleX(f14);
        f20Var.setScaleY(f14);
        f20Var.setAlpha(f13);
        org.telegram.ui.ActionBar.k kVar = this.z0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.setAlpha(f7);
        zl0Var.getLocationInWindow(iArr);
        float interpolation = tr.g.getInterpolation(f7);
        for (int i10 = 0; i10 < M0.getChildCount(); i10++) {
            View childAt = M0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.g7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f7, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f13);
                }
            }
        }
        for (int i11 = 0; i11 < zl0Var.getChildCount(); i11++) {
            View childAt2 = zl0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((zl0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        M0.invalidate();
    }

    public final void Q0(boolean z10) {
        View[] viewArr = this.S;
        if ((!z10 || viewArr[0].getTag() == null) && (z10 || viewArr[0].getTag() != null)) {
            return;
        }
        viewArr[0].setTag(z10 ? null : 1);
        if (z10) {
            viewArr[0].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.T;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[0] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        animatorSetArr[0].setDuration(150L);
        animatorSetArr[0].addListener(new iq0(this, z10, 0));
        animatorSetArr[0].start();
    }

    public final void R0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        zq0 zq0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        uq0 uq0Var;
        if (dialog instanceof qq0) {
            P0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) view).F) || ((view instanceof org.telegram.ui.Cells.i6) && ((org.telegram.ui.Cells.i6) view).n0)) {
            U0(dialog.id, view);
            return;
        }
        zl0 zl0Var = this.E;
        if (zl0Var.getVisibility() != 8 || (activity = this.g0) == null) {
            return;
        }
        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
        int i10 = this.P;
        if (isChatDialog) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString(R.string.SendMessageTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                if (i10 == 3) {
                    if (ChatObject.isActionBannedByDefault(chat, 10)) {
                        b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                    }
                } else if (i10 != 2) {
                    b2Var.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                } else if (this.n0) {
                    b2Var.T = LocaleController.getString(R.string.PublicPollCantForward);
                } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                    b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                } else {
                    b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                }
                hg.k0.o(R.string.OK, alertDialog$Builder, null);
                return;
            }
        } else if (DialogObject.isEncryptedDialog(dialog.id) && i10 != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String string2 = LocaleController.getString(R.string.SendMessageTitle);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
            b2Var2.R = string2;
            if (i10 == 3) {
                b2Var2.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
            } else if (i10 != 0) {
                b2Var2.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
            } else {
                b2Var2.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
            }
            hg.k0.o(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        long j3 = dialog.id;
        a0.i iVar = this.U;
        if (iVar.h(j3) >= 0) {
            iVar.l(dialog.id);
            this.V.remove(dialog);
            if (view instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) view).s(false, true);
            } else if (view instanceof org.telegram.ui.Cells.g7) {
                ((org.telegram.ui.Cells.g7) view).b(false, true);
            }
            X0(1);
            zq0Var = this;
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if ((UserObject.isBotForum(user) && !(((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id))) || (DialogObject.isChatDialog(dialog.id) && (ChatObject.isForum(chat2) || (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                this.C0 = dialog;
                this.I.h1(0, this.p0 - zl0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                gq0 gq0Var = new gq0(this, dialog, atomicReference, view);
                atomicReference.set(new bo0(this, atomicReference, gq0Var, dialog, 1));
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i11 = NotificationCenter.topicsDidLoaded;
                notificationCenter.addObserver(gq0Var, i11);
                if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.id) != null) {
                    gq0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.id));
                    return;
                } else {
                    MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.id);
                    AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            zq0Var = this;
            iVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) view).s(true, true);
            } else if (view instanceof org.telegram.ui.Cells.g7) {
                ((org.telegram.ui.Cells.g7) view).b(true, true);
            }
            X0(2);
            long j10 = UserConfig.getInstance(zq0Var.currentAccount).clientUserId;
            if (zq0Var.L0) {
                rq0 rq0Var = zq0Var.K;
                a0.i iVar2 = rq0Var.e;
                ArrayList arrayList = rq0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) iVar2.f(dialog.id);
                if (dialog2 == null) {
                    rq0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j10) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                rq0Var.l();
                zq0Var.A0 = false;
                f20 f20Var = zq0Var.y0;
                f20Var.r.setText("");
                H0(false);
                AndroidUtilities.hideKeyboard(f20Var.r);
            }
        }
        vq0 vq0Var = zq0Var.M;
        if (vq0Var == null || (uq0Var = vq0Var.H) == null) {
            return;
        }
        uq0Var.q(0, uq0Var.h());
    }

    public final void S0(final boolean z10) {
        int i10;
        int i11 = 0;
        while (true) {
            a0.i iVar = this.U;
            int m10 = iVar.m();
            dq0 dq0Var = this.c;
            eq0 eq0Var = this.d;
            if (i11 >= m10) {
                Editable text = eq0Var.getText();
                hu huVar = eq0Var.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                qp qpVar = this.e0;
                int i12 = (qpVar == null || !qpVar.a.q) ? -1 : this.b0;
                ArrayList arrayList = new ArrayList();
                if (this.N != null) {
                    i10 = 0;
                    for (int i13 = 0; i13 < iVar.m(); i13++) {
                        long j3 = iVar.j(i13);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j3);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j3));
                        }
                        if (dq0Var.getTag() != null && huVar.length() > 0 && sendPaidMessagesStars > 0) {
                            i10++;
                        }
                        if (sendPaidMessagesStars > 0) {
                            i10++;
                        }
                        if (sendPaidMessagesStars > 0 && !arrayList.contains(Long.valueOf(j3))) {
                            arrayList.add(Long.valueOf(j3));
                        }
                    }
                } else {
                    lq0 lq0Var = this.W;
                    int i14 = lq0Var != null ? lq0Var.d : 0;
                    if (this.F0 != null) {
                        int i15 = 0;
                        for (int i16 = 0; i16 < iVar.m(); i16++) {
                            long j10 = iVar.j(i16);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
                            }
                            if (this.F0 != null && dq0Var.getTag() != null && huVar.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
                                i15++;
                            }
                            if (sendPaidMessagesStars2 > 0) {
                                i15++;
                            }
                            if (sendPaidMessagesStars2 > 0 && !arrayList.contains(Long.valueOf(j10))) {
                                arrayList.add(Long.valueOf(j10));
                            }
                        }
                        i10 = i15;
                    } else {
                        int i17 = 0;
                        if (this.O[i14] != null) {
                            for (int i18 = 0; i18 < iVar.m(); i18++) {
                                long j11 = iVar.j(i18);
                                long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
                                if (sendPaidMessagesStars3 <= 0) {
                                    sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
                                }
                                if (dq0Var.getTag() != null && huVar.length() > 0 && sendPaidMessagesStars3 > 0) {
                                    i17++;
                                }
                                if (sendPaidMessagesStars3 > 0) {
                                    i17++;
                                }
                                if (sendPaidMessagesStars3 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                                    arrayList.add(Long.valueOf(j11));
                                }
                            }
                            i10 = i17;
                        } else {
                            i10 = 0;
                        }
                    }
                }
                final int i19 = i12;
                e5.c0(this.currentAccount, arrayList, i10, new Utilities.Callback() { // from class: org.telegram.ui.Components.yp0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        zq0.o(zq0.this, charSequenceArr, entities, z10, i19, (HashMap) obj);
                    }
                });
                return;
            }
            if (e5.h(getContext(), this.currentAccount, iVar.j(i11), dq0Var.getTag() != null && eq0Var.a.length() > 0)) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void T0(boolean z10) {
        dq0 dq0Var = this.c;
        if (z10 == (dq0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        dq0Var.setTag(z10 ? 1 : null);
        eq0 eq0Var = this.d;
        if (eq0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(eq0Var.getEditText());
        }
        eq0Var.k(true);
        FrameLayout frameLayout = this.c0;
        dq0 dq0Var2 = this.f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            dq0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            dq0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        if (frameLayout2 != null) {
            int i10 = z10 ? 4 : 1;
            WeakHashMap weakHashMap = r0.i0.a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.x;
        if (linearLayout != null) {
            int i11 = z10 ? 4 : 1;
            WeakHashMap weakHashMap2 = r0.i0.a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.y = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f7 = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(dq0Var, (Property<dq0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(dq0Var2, (Property<dq0, Float>) View.SCALE_X, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(dq0Var2, (Property<dq0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(dq0Var2, (Property<dq0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.S[1], (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout3 = this.r;
        if (frameLayout3 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.h0 && z10) {
                f7 = AndroidUtilities.dp(this.d0 != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, f7));
        }
        this.y.playTogether(arrayList);
        this.y.setInterpolator(new DecelerateInterpolator());
        this.y.setDuration(180L);
        this.y.addListener(new iq0(this, z10, 1));
        this.y.start();
    }

    public final void U0(long j3, View view) {
        int i10 = -this.H0;
        this.H0 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j3 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3))) : "";
        boolean premiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
        int i11 = 1;
        FrameLayout frameLayout = this.v;
        (premiumFeaturesBlocked ? new yc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : new yc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new vp0(this, i11))).j();
    }

    public final void V0() {
        org.telegram.ui.ActionBar.p1 p1Var;
        dq0 dq0Var = this.c;
        if (dq0Var == null) {
            return;
        }
        eq0 eq0Var = this.d;
        if (eq0Var == null || !eq0Var.m()) {
            kq0 kq0Var = this.D0;
            if (kq0Var != null && (p1Var = kq0Var.H) != null && !p1Var.f) {
                AndroidUtilities.dp(20.0f);
            }
        } else {
            eq0Var.getEmojiPaddingShown();
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.c0;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            float f10 = -f7;
            frameLayout2.setTranslationY(f10);
            LinearLayout linearLayout = this.x;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f10);
            }
        }
        float f11 = -f7;
        dq0Var.setTranslationY(f11);
        this.f.setTranslationY(f11);
    }

    public final void W0() {
        org.telegram.ui.ActionBar.i5 i5Var = this.s;
        if (i5Var != null) {
            String L0 = L0();
            if (L0.startsWith("https://")) {
                L0 = L0.substring(8);
            } else if (L0.startsWith("http://")) {
                L0 = L0.substring(7);
            }
            i5Var.k(L0);
        }
    }

    public final void X0(int i10) {
        a0.i iVar = this.U;
        if (iVar.m() == 0) {
            T0(false);
            return;
        }
        ArrayList arrayList = this.N;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.c.getTag();
        eq0 eq0Var = this.d;
        if (tag != null && eq0Var.a.length() > 0) {
            size++;
        }
        long j3 = 0;
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            long j10 = ((TLRPC.Dialog) iVar.n(i11)).id;
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
            }
            j3 += sendPaidMessagesStars;
        }
        int max = Math.max(1, iVar.m());
        boolean z10 = i10 != 0;
        ii.z1 z1Var = this.e;
        z1Var.g(max, z10);
        z1Var.i(size, j3, i10 != 0);
        T0(true);
        eq0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), z1Var.l()), 0);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            rq0 rq0Var = this.K;
            if (rq0Var != null) {
                rq0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        eq0 eq0Var = this.d;
        if (eq0Var != null) {
            AndroidUtilities.hideKeyboard(eq0Var.getEditText());
        }
        this.Y = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public void dismissInternal() {
        super.dismissInternal();
        eq0 eq0Var = this.d;
        if (eq0Var != null) {
            eq0Var.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.X;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        if (this.C0 != null) {
            I0();
            return;
        }
        eq0 eq0Var = this.d;
        if (eq0Var == null || !eq0Var.e) {
            super.onBackPressed();
        } else {
            eq0Var.k(true);
        }
    }

    public zq0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:134:0x07f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zq0(Context context, org.telegram.ui.yn ynVar, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, Integer num, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, true);
        int i10;
        float f7;
        float f10;
        aq0 aq0Var;
        aq0 aq0Var2;
        float f11;
        LinearLayout linearLayout;
        int i11;
        final int i12 = 1;
        final int i13 = 2;
        String[] strArr = new String[2];
        this.O = strArr;
        this.S = new View[2];
        this.T = new AnimatorSet[2];
        this.U = new a0.i();
        this.V = new HashMap();
        this.X = -1;
        final int i14 = 0;
        this.Y = false;
        new RectF();
        new Paint(1);
        this.j0 = new TextPaint(1);
        String[] strArr2 = new String[2];
        this.o0 = strArr2;
        this.E0 = new ArrayList();
        int i15 = 4;
        int i16 = 4;
        while (true) {
            if (i16 >= 32) {
                i10 = 80;
                break;
            }
            i10 = (1 << i16) - 12;
            if (80 <= i10) {
                break;
            } else {
                i16++;
            }
        }
        int i17 = i10 / 8;
        long[] jArr = new long[i17];
        Object[] objArr = new Object[i17];
        this.G0 = i0.b.e;
        this.H0 = 4;
        this.I0 = true;
        this.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        fh.c d = this.glassEngine.d(new up0(this, i15));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.i iVar = new ah.i();
            this.O0 = iVar;
            this.glassEngine.a(iVar);
            fh.d dVar = new fh.d(d);
            dVar.f = d;
            dVar.d = iVar;
            dVar.e = -2;
            fh.d dVar2 = new fh.d(d);
            dVar2.f = d;
            dVar2.d = iVar;
            dVar2.e = -3;
            ah.c cVar = new ah.c(dVar);
            this.P0 = cVar;
            cVar.i = LiteMode.isEnabled(262144);
            int dp = LiteMode.isEnabled(262144) ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(48.0f);
            cVar.b = dp;
            cVar.c = dp;
            cVar.h = this.glassEngine;
            ah.c cVar2 = new ah.c(dVar2);
            this.Q0 = cVar2;
            cVar2.i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(48.0f);
            cVar2.b = dp2;
            cVar2.c = dp2;
            li.m mVar = this.glassEngine;
            cVar2.h = mVar;
            ah.c cVar3 = new ah.c(d);
            this.R0 = cVar3;
            cVar3.h = mVar;
        } else {
            this.O0 = null;
            ah.c cVar4 = new ah.c(d);
            cVar4.h = this.glassEngine;
            this.Q0 = cVar4;
            this.P0 = cVar4;
            this.R0 = cVar4;
        }
        this.resourcesProvider = d6Var;
        this.Z = z13;
        this.g0 = AndroidUtilities.findActivity(context);
        this.h0 = z12;
        if (z12) {
            this.resourcesProvider = new ai.a1(i12);
        }
        d.a(getThemedColor(org.telegram.ui.ActionBar.i6.d6));
        this.f0 = ynVar;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.R = mutate;
        int i18 = org.telegram.ui.ActionBar.i6.h5;
        this.behindKeyboardColorKey = i18;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i18), PorterDuff.Mode.MULTIPLY));
        this.occupyNavigationBarWithoutKeyboard = true;
        this.isFullscreen = z11;
        strArr2[0] = str3;
        strArr2[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            MessageObject messageObject = (MessageObject) arrayList.get(0);
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(messageObject.getDialogId()));
            if (!TextUtils.isEmpty(publicUsername)) {
                StringBuilder sb2 = new StringBuilder("https://");
                a4.a.z(sb2, MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, "/");
                sb2.append(messageObject.getId());
                strArr2[0] = sb2.toString();
                if (arrayList.size() == 1 && messageObject.hasValidGroupId()) {
                    strArr2[0] = a4.a.s(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.N = arrayList;
        this.M = new vq0(this, context);
        this.n0 = z10;
        strArr[0] = str;
        strArr[1] = str2;
        this.useSmoothKeyboard = true;
        setDelegate(new org.telegram.ui.h0(this, i12));
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                MessageObject messageObject2 = (MessageObject) this.N.get(i19);
                if (messageObject2.isTodo()) {
                    this.P = 3;
                } else if (messageObject2.isPoll()) {
                    int i20 = messageObject2.isPublicPoll() ? 2 : 1;
                    this.P = i20;
                    if (i20 == 2) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (z10) {
            this.l0 = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((MessageObject) arrayList.get(0)).getId();
            tL_channels_exportMessageLink.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(((MessageObject) arrayList.get(0)).messageOwner.peer_id.channel_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_exportMessageLink, new org.telegram.ui.no(13, this, context));
        }
        kq0 kq0Var = new kq0(this, context);
        this.D0 = kq0Var;
        this.containerView = kq0Var;
        kq0Var.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i21 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i21, 0, i21, this.G0.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        int i22 = org.telegram.ui.ActionBar.i6.h5;
        frameLayout.setBackgroundColor(getThemedColor(i22));
        if (this.h0 && this.o0[1] != null) {
            lq0 lq0Var = new lq0(this, context);
            this.W = lq0Var;
            frameLayout.addView(lq0Var, w7.z5.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        f20 f20Var = new f20(context, this.resourcesProvider);
        this.y0 = f20Var;
        mq0 mq0Var = new mq0(this);
        ci.h2 h2Var = f20Var.r;
        h2Var.addTextChangedListener(mq0Var);
        h2Var.setHint(LocaleController.getString(R.string.ShareSendTo));
        h2Var.setOnEditorActionListener(new e1(this, 6));
        f20Var.setCloseButtonOnClickListener(new vp0(this, i14));
        frameLayout.addView(f20Var, w7.z5.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.z0 = kVar;
        kVar.setOccupyStatusBar(false);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i23 = org.telegram.ui.ActionBar.i6.j5;
        kVar.setTitleColor(getThemedColor(i23));
        kVar.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.i6.q5));
        kVar.B(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.z6, false), false);
        kVar.A(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.u8, false), false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.qo(this, 12));
        kVar.setVisibility(8);
        frameLayout.addView(kVar, w7.z5.e(-1, 58, 83));
        zl0 zl0Var = new zl0(context, this.resourcesProvider);
        this.E = zl0Var;
        s4.s sVar = new s4.s(4);
        this.I = sVar;
        zl0Var.setLayoutManager(sVar);
        sVar.O = new bq0(this, i13);
        zl0Var.setOnScrollListener(new cq0(this, i13));
        wq0 wq0Var = new wq0(this, context);
        this.L = wq0Var;
        zl0Var.setAdapter(wq0Var);
        int i24 = org.telegram.ui.ActionBar.i6.A5;
        zl0Var.setGlowColor(getThemedColor(i24));
        zl0Var.setVerticalScrollBarEnabled(false);
        zl0Var.setHorizontalScrollBarEnabled(false);
        zl0Var.setOverScrollMode(2);
        zl0Var.setSelectorDrawableColor(0);
        int i25 = 21;
        zl0Var.setItemSelectorColorProvider(new ru(i25));
        zl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        zl0Var.setClipToPadding(false);
        zl0Var.i(new ai.t(7));
        zl0Var.setOnItemClickListener(new ml0(this) { // from class: org.telegram.ui.Components.wp0
            public final /* synthetic */ zq0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.ml0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i26, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i14) {
                    case 0:
                        zq0.p(this.b, i26);
                        break;
                    case 1:
                        if (i26 >= 0) {
                            zq0 zq0Var = this.b;
                            ArrayList arrayList2 = zq0Var.K.d;
                            int i27 = i26 - 1;
                            TLRPC.Dialog dialog = (i27 < 0 || i27 >= arrayList2.size()) ? null : (TLRPC.Dialog) arrayList2.get(i27);
                            if (dialog != null) {
                                zq0Var.R0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i26 >= 0) {
                            zq0 zq0Var2 = this.b;
                            vq0 vq0Var = zq0Var2.M;
                            zq0 zq0Var3 = vq0Var.K;
                            int i28 = vq0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i26 < i28 || i28 < 0) {
                                int i29 = i26 - 1;
                                if (i29 >= 0) {
                                    if (i29 < vq0Var.d.size()) {
                                        tL_dialog2 = ((nq0) vq0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - vq0Var.d.size();
                                        ArrayList arrayList3 = vq0Var.e.d;
                                        if (size2 < arrayList3.size()) {
                                            TLObject tLObject = (TLObject) arrayList3.get(size2);
                                            tL_dialog = new TLRPC.TL_dialog();
                                            if (tLObject instanceof TLRPC.User) {
                                                tL_dialog.id = ((TLRPC.User) tLObject).id;
                                            } else if (tLObject instanceof TLRPC.Chat) {
                                                tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                            }
                                            tL_dialog2 = tL_dialog;
                                        }
                                    }
                                }
                                if (tL_dialog2 == null) {
                                    zq0Var2.R0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i26 - i28;
                                if (i30 >= 0 && i30 < zq0Var3.E0.size()) {
                                    TLObject tLObject2 = ((gg.h0) zq0Var3.E0.get(i30)).a;
                                    tL_dialog = new TLRPC.TL_dialog();
                                    if (tLObject2 instanceof TLRPC.User) {
                                        tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                    } else if (tLObject2 instanceof TLRPC.Chat) {
                                        tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                    }
                                    tL_dialog2 = tL_dialog;
                                }
                                if (tL_dialog2 == null) {
                                }
                            }
                        }
                        break;
                }
            }
        });
        zl0Var.setVisibility(8);
        this.containerView.addView(zl0Var, w7.z5.e(-1, -1, 51));
        aq0 aq0Var3 = new aq0(this, context, this.resourcesProvider, i14);
        this.F = aq0Var3;
        aq0Var3.setSelectorDrawableColor(0);
        aq0Var3.setItemSelectorColorProvider(new ru(i25));
        aq0Var3.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        aq0Var3.setClipToPadding(false);
        getContext();
        s4.s sVar2 = new s4.s(4);
        this.H = sVar2;
        aq0Var3.setLayoutManager(sVar2);
        this.S0 = new mh(this, i13);
        sVar2.O = new bq0(this, i14);
        aq0Var3.setHorizontalScrollBarEnabled(false);
        aq0Var3.setVerticalScrollBarEnabled(false);
        aq0Var3.setOverScrollMode(2);
        aq0Var3.i(new ai.t(5));
        this.containerView.addView(aq0Var3, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        rq0 rq0Var = new rq0(this, context);
        this.K = rq0Var;
        aq0Var3.setAdapter(rq0Var);
        aq0Var3.setGlowColor(getThemedColor(i24));
        aq0Var3.setOnItemClickListener(new ml0(this) { // from class: org.telegram.ui.Components.wp0
            public final /* synthetic */ zq0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.ml0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i26, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i12) {
                    case 0:
                        zq0.p(this.b, i26);
                        break;
                    case 1:
                        if (i26 >= 0) {
                            zq0 zq0Var = this.b;
                            ArrayList arrayList2 = zq0Var.K.d;
                            int i27 = i26 - 1;
                            TLRPC.Dialog dialog = (i27 < 0 || i27 >= arrayList2.size()) ? null : (TLRPC.Dialog) arrayList2.get(i27);
                            if (dialog != null) {
                                zq0Var.R0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i26 >= 0) {
                            zq0 zq0Var2 = this.b;
                            vq0 vq0Var = zq0Var2.M;
                            zq0 zq0Var3 = vq0Var.K;
                            int i28 = vq0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i26 < i28 || i28 < 0) {
                                int i29 = i26 - 1;
                                if (i29 >= 0) {
                                    if (i29 < vq0Var.d.size()) {
                                        tL_dialog2 = ((nq0) vq0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - vq0Var.d.size();
                                        ArrayList arrayList3 = vq0Var.e.d;
                                        if (size2 < arrayList3.size()) {
                                            TLObject tLObject = (TLObject) arrayList3.get(size2);
                                            tL_dialog = new TLRPC.TL_dialog();
                                            if (tLObject instanceof TLRPC.User) {
                                                tL_dialog.id = ((TLRPC.User) tLObject).id;
                                            } else if (tLObject instanceof TLRPC.Chat) {
                                                tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                            }
                                            tL_dialog2 = tL_dialog;
                                        }
                                    }
                                }
                                if (tL_dialog2 == null) {
                                    zq0Var2.R0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i26 - i28;
                                if (i30 >= 0 && i30 < zq0Var3.E0.size()) {
                                    TLObject tLObject2 = ((gg.h0) zq0Var3.E0.get(i30)).a;
                                    tL_dialog = new TLRPC.TL_dialog();
                                    if (tLObject2 instanceof TLRPC.User) {
                                        tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                    } else if (tLObject2 instanceof TLRPC.Chat) {
                                        tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                    }
                                    tL_dialog2 = tL_dialog;
                                }
                                if (tL_dialog2 == null) {
                                }
                            }
                        }
                        break;
                }
            }
        });
        aq0Var3.setOnScrollListener(new cq0(this, i14));
        this.glassEngine.b(aq0Var3);
        aq0 aq0Var4 = new aq0(this, context, this.resourcesProvider, i12);
        this.G = aq0Var4;
        aq0Var4.setItemSelectorColorProvider(new ru(i25));
        aq0Var4.setSelectorDrawableColor(0);
        aq0Var4.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        aq0Var4.setClipToPadding(false);
        getContext();
        rz rzVar = new rz(4, 0, aq0Var4);
        this.J = rzVar;
        aq0Var4.setLayoutManager(rzVar);
        rzVar.O = new bq0(this, i12);
        aq0Var4.setOnItemClickListener(new ml0(this) { // from class: org.telegram.ui.Components.wp0
            public final /* synthetic */ zq0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.ml0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i26, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i13) {
                    case 0:
                        zq0.p(this.b, i26);
                        break;
                    case 1:
                        if (i26 >= 0) {
                            zq0 zq0Var = this.b;
                            ArrayList arrayList2 = zq0Var.K.d;
                            int i27 = i26 - 1;
                            TLRPC.Dialog dialog = (i27 < 0 || i27 >= arrayList2.size()) ? null : (TLRPC.Dialog) arrayList2.get(i27);
                            if (dialog != null) {
                                zq0Var.R0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i26 >= 0) {
                            zq0 zq0Var2 = this.b;
                            vq0 vq0Var = zq0Var2.M;
                            zq0 zq0Var3 = vq0Var.K;
                            int i28 = vq0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i26 < i28 || i28 < 0) {
                                int i29 = i26 - 1;
                                if (i29 >= 0) {
                                    if (i29 < vq0Var.d.size()) {
                                        tL_dialog2 = ((nq0) vq0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - vq0Var.d.size();
                                        ArrayList arrayList3 = vq0Var.e.d;
                                        if (size2 < arrayList3.size()) {
                                            TLObject tLObject = (TLObject) arrayList3.get(size2);
                                            tL_dialog = new TLRPC.TL_dialog();
                                            if (tLObject instanceof TLRPC.User) {
                                                tL_dialog.id = ((TLRPC.User) tLObject).id;
                                            } else if (tLObject instanceof TLRPC.Chat) {
                                                tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                            }
                                            tL_dialog2 = tL_dialog;
                                        }
                                    }
                                }
                                if (tL_dialog2 == null) {
                                    zq0Var2.R0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i26 - i28;
                                if (i30 >= 0 && i30 < zq0Var3.E0.size()) {
                                    TLObject tLObject2 = ((gg.h0) zq0Var3.E0.get(i30)).a;
                                    tL_dialog = new TLRPC.TL_dialog();
                                    if (tLObject2 instanceof TLRPC.User) {
                                        tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                    } else if (tLObject2 instanceof TLRPC.Chat) {
                                        tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                    }
                                    tL_dialog2 = tL_dialog;
                                }
                                if (tL_dialog2 == null) {
                                }
                            }
                        }
                        break;
                }
            }
        });
        aq0Var4.setHasFixedSize(true);
        aq0Var4.setItemAnimator(null);
        aq0Var4.setHorizontalScrollBarEnabled(false);
        aq0Var4.setVerticalScrollBarEnabled(false);
        aq0Var4.setOnScrollListener(new cq0(this, i12));
        aq0Var4.i(new ai.t(6));
        aq0Var4.setAdapter(this.M);
        aq0Var4.setGlowColor(getThemedColor(i24));
        this.x0 = new dl0(aq0Var4, true);
        w00 w00Var = new w00(context, this.resourcesProvider);
        w00Var.setViewType(12);
        tx0 tx0Var = new tx0(context, w00Var, 1, this.resourcesProvider);
        this.Q = tx0Var;
        tx0Var.addView(w00Var, 0);
        tx0Var.setAnimateLayoutChange(true);
        tx0Var.e(false, false);
        boolean z14 = this.h0;
        vh.n nVar = tx0Var.d;
        if (z14) {
            nVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.ng));
        }
        nVar.setText(LocaleController.getString(R.string.NoResult));
        aq0Var4.setEmptyView(tx0Var);
        aq0Var4.setHideIfEmpty(false);
        aq0Var4.Y1 = true;
        aq0Var4.Z1 = 0;
        this.containerView.addView(tx0Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.containerView.addView(aq0Var4, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ci.ab abVar = new ci.ab(this, context, i25);
        this.n = abVar;
        this.containerView.addView(abVar, w7.z5.e(-1, 300, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp((!this.h0 || this.o0[1] == null) ? 58.0f : 111.0f);
        this.S[0] = new View(context);
        View view = this.S[0];
        int i26 = org.telegram.ui.ActionBar.i6.V5;
        view.setBackgroundColor(getThemedColor(i26));
        this.S[0].setAlpha(0.0f);
        this.S[0].setTag(1);
        this.containerView.addView(this.S[0], layoutParams);
        this.containerView.addView(frameLayout, w7.z5.e(-1, (!this.h0 || this.o0[1] == null) ? 58 : 111, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.S[1] = new View(context);
        this.S[1].setBackgroundColor(getThemedColor(i26));
        this.S[1].setLayoutParams(layoutParams2);
        if (!this.n0 && this.o0[0] == null) {
            this.S[1].setAlpha(0.0f);
            aq0Var = aq0Var3;
            aq0Var2 = aq0Var4;
            f7 = 4.0f;
            f10 = 22.0f;
            f11 = 9.0f;
        } else {
            f7 = 4.0f;
            f10 = 22.0f;
            if (this.h0) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                f11 = 9.0f;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.r = frameLayout3;
                frameLayout2.addView(frameLayout3, w7.z5.d(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, w7.z5.e(-1, -1, 119));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                w7.b6.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new tp0(this, 4));
                org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
                this.s = i5Var;
                i5Var.setTextSize(15);
                i5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Tk));
                i5Var.setEllipsizeByGradient(true);
                W0();
                linearLayout3.addView(i5Var, w7.z5.p(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                textView.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                textView.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                int i27 = org.telegram.ui.ActionBar.i6.i6;
                textView.setBackground(org.telegram.ui.ActionBar.i6.Y(getThemedColor(i27), 4, 4));
                linearLayout3.addView(textView, w7.z5.p(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new tp0(this, 5));
                w7.b6.a(textView);
                aq0Var = aq0Var3;
                aq0Var2 = aq0Var4;
                this.containerView.addView(frameLayout2, w7.z5.e(-1, 58, 83));
                ArrayList arrayList2 = this.N;
                if (arrayList2 != null && arrayList2.size() > 0 && ((MessageObject) this.N.get(0)).messageOwner != null && ((MessageObject) this.N.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject3 = (MessageObject) this.N.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject3.getDialogId()))) && !messageObject3.isForwarded()) {
                        final int i28 = 0;
                        linearLayout = org.telegram.messenger.ok.f(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zp0
                            public final /* synthetic */ zq0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i28) {
                                    case 0:
                                        zq0 zq0Var = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var = zq0Var.f0;
                                        if (n2Var == null) {
                                            n2Var = LaunchActivity.U();
                                        }
                                        if (n2Var != null) {
                                            zq0Var.dismiss();
                                            n2Var.presentFragment(new org.telegram.ui.hj0(messageObject3));
                                            break;
                                        }
                                        break;
                                    default:
                                        zq0 zq0Var2 = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var2 = zq0Var2.f0;
                                        if (n2Var2 == null) {
                                            n2Var2 = LaunchActivity.U();
                                        }
                                        if (n2Var2 != null) {
                                            zq0Var2.dismiss();
                                            n2Var2.presentFragment(new org.telegram.ui.hj0(messageObject3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                        linearLayout.setBackground(org.telegram.ui.ActionBar.i6.Y(getThemedColor(i27), 6, 6));
                        w7.b6.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i29 = org.telegram.ui.ActionBar.i6.Vk;
                        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i29), PorterDuff.Mode.SRC_IN));
                        linearLayout.addView(imageView, w7.z5.o(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        textView2.setTextColor(getThemedColor(i29));
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(LocaleController.formatNumber(messageObject3.messageOwner.forwards, ','));
                        linearLayout.addView(textView2, w7.z5.p(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i11 = 8;
                        linearLayout2.addView(linearLayout3, w7.z5.p(-1, 42, 1.0f, 23, 11, 0, i11, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, w7.z5.p(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                linearLayout = null;
                i11 = 11;
                linearLayout2.addView(linearLayout3, w7.z5.p(-1, 42, 1.0f, 23, 11, 0, i11, 0));
                if (linearLayout != null) {
                }
            } else {
                aq0Var = aq0Var3;
                aq0Var2 = aq0Var4;
                f11 = 9.0f;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.h = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.r = frameLayout5;
                frameLayout4.addView(frameLayout5, w7.z5.d(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i30 = org.telegram.ui.ActionBar.i6.i6;
                textView3.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i30), 2, AndroidUtilities.dp(22.0f)));
                textView3.setTextColor(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.i6.pg : org.telegram.ui.ActionBar.i6.n5));
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setGravity(17);
                if (this.h0 && this.o0[1] != null) {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupCopySpeakerLinkNoCaps).toUpperCase());
                } else {
                    textView3.setText(LocaleController.getString(R.string.CopyLink).toUpperCase());
                }
                textView3.setOnClickListener(new tp0(this, 6));
                frameLayout5.addView(textView3, w7.z5.e(-1, -1, 119));
                this.containerView.addView(frameLayout4, w7.z5.e(-1, 58, 87));
                ArrayList arrayList3 = this.N;
                if (arrayList3 != null && arrayList3.size() > 0 && ((MessageObject) this.N.get(0)).messageOwner != null && ((MessageObject) this.N.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject4 = (MessageObject) this.N.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject4.getDialogId()))) && !messageObject4.isForwarded()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.x = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        linearLayout4.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.i6.eg : i30), 2, AndroidUtilities.dp(22.0f)));
                        frameLayout5.addView(linearLayout4, w7.z5.d(-2, 48.0f, 85, 6.0f, 0.0f, -6.0f, 0.0f));
                        final int i31 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zp0
                            public final /* synthetic */ zq0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i31) {
                                    case 0:
                                        zq0 zq0Var = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var = zq0Var.f0;
                                        if (n2Var == null) {
                                            n2Var = LaunchActivity.U();
                                        }
                                        if (n2Var != null) {
                                            zq0Var.dismiss();
                                            n2Var.presentFragment(new org.telegram.ui.hj0(messageObject4));
                                            break;
                                        }
                                        break;
                                    default:
                                        zq0 zq0Var2 = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var2 = zq0Var2.f0;
                                        if (n2Var2 == null) {
                                            n2Var2 = LaunchActivity.U();
                                        }
                                        if (n2Var2 != null) {
                                            zq0Var2.dismiss();
                                            n2Var2.presentFragment(new org.telegram.ui.hj0(messageObject4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.i6.pg : org.telegram.ui.ActionBar.i6.n5), PorterDuff.Mode.MULTIPLY));
                        linearLayout4.addView(imageView2, w7.z5.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(messageObject4.messageOwner.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTextColor(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.i6.pg : org.telegram.ui.ActionBar.i6.n5));
                        textView4.setGravity(16);
                        textView4.setTypeface(AndroidUtilities.bold());
                        linearLayout4.addView(textView4, w7.z5.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.v = frameLayout6;
        this.containerView.addView(frameLayout6, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.r != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w = frameLayout7;
        this.containerView.addView(frameLayout7, w7.z5.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        dq0 dq0Var = new dq0(this, context, 0);
        this.c = dq0Var;
        dq0Var.setWillNotDraw(false);
        dq0Var.setAlpha(0.0f);
        dq0Var.setVisibility(4);
        this.containerView.addView(dq0Var, w7.z5.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        dq0Var.setOnTouchListener(new bi.d(22));
        AndroidUtilities.setLightNavigationBar(this.container, AndroidUtilities.computePerceivedBrightness(getThemedColor(i22)) > 0.721f);
        eq0 eq0Var = new eq0(this, context, kq0Var, this.resourcesProvider);
        this.d = eq0Var;
        eq0Var.J = true;
        if (this.h0) {
            eu editText = eq0Var.getEditText();
            int i32 = org.telegram.ui.ActionBar.i6.ng;
            editText.setTextColor(getThemedColor(i32));
            eq0Var.getEditText().setCursorColor(getThemedColor(i32));
        }
        eq0Var.setHint(LocaleController.getString(R.string.ShareComment));
        eq0Var.s();
        eq0Var.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
        dq0Var.addView(eq0Var, w7.z5.e(-1, -2, 51));
        dq0Var.setClipChildren(false);
        dq0Var.setClipToPadding(false);
        eq0Var.setClipChildren(false);
        eq0Var.getEditText().addTextChangedListener(new ci.i2(this, 12));
        dq0 dq0Var2 = new dq0(this, context, 1);
        this.f = dq0Var2;
        dq0Var2.setFocusable(true);
        dq0Var2.setFocusableInTouchMode(true);
        dq0Var2.setVisibility(4);
        dq0Var2.setScaleX(0.2f);
        dq0Var2.setScaleY(0.2f);
        dq0Var2.setAlpha(0.0f);
        this.containerView.addView(dq0Var2, w7.z5.e(110, 50, 85));
        ii.z1 z1Var = new ii.z1((NotificationCenter.NotificationCenterDelegate) this, context, R.drawable.send_plane_24, this.resourcesProvider, 2);
        this.e = z1Var;
        int dp3 = AndroidUtilities.dp(52.0f);
        int dp4 = AndroidUtilities.dp(38.0f);
        z1Var.I = dp3;
        z1Var.J = dp4;
        float dp5 = AndroidUtilities.dp(1.0f);
        float dp6 = AndroidUtilities.dp(6.0f);
        z1Var.M = dp5;
        z1Var.N = dp6;
        z1Var.h0 = true;
        dq0Var2.addView(z1Var, w7.z5.g());
        z1Var.setOnClickListener(new tp0(this, 0));
        z1Var.setOnLongClickListener(new p10(this, 2));
        this.j0.setTextSize(AndroidUtilities.dp(12.0f));
        this.j0.setTypeface(AndroidUtilities.bold());
        if (num != null) {
            this.b0 = num.intValue();
            FrameLayout frameLayout8 = new FrameLayout(context);
            this.c0 = frameLayout8;
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.d0 = linearLayout5;
            linearLayout5.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f7));
            linearLayout5.setClipToPadding(false);
            linearLayout5.setOrientation(0);
            linearLayout5.setBackground(org.telegram.ui.ActionBar.i6.Y(getThemedColor(org.telegram.ui.ActionBar.i6.i6), 6, 6));
            qp qpVar = new qp(context, 24, this.resourcesProvider);
            this.e0 = qpVar;
            qpVar.b(org.telegram.ui.ActionBar.i6.h7, org.telegram.ui.ActionBar.i6.j7, org.telegram.ui.ActionBar.i6.k7);
            qpVar.setDrawUnchecked(true);
            qpVar.a(false, false);
            qpVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(qpVar, w7.z5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            textView5.setTextColor(getThemedColor(i23));
            textView5.setTextSize(1, 14.0f);
            textView5.setText(LocaleController.formatString(R.string.VideoShareAddTimestamp, AndroidUtilities.formatShortDuration(num.intValue())));
            linearLayout5.addView(textView5, w7.z5.t(-2, -2, 16, 9, 0, 0, 0));
            w7.b6.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new tp0(this, 1));
            frameLayout8.addView(linearLayout5, w7.z5.e(-2, -2, 17));
            if (this.h == null) {
                View view2 = new View(context);
                view2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.d7));
                frameLayout8.addView(view2, w7.z5.a(-1.0f, this.h0 ? 0.66f : 1.0f / AndroidUtilities.density, 55));
            }
            this.containerView.addView(frameLayout8, w7.z5.e(-1, 58, 83));
            if (this.h == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        ah.e eVar = new ah.e(this.R0.c(abVar, null, false));
        this.U0 = eVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        eVar.b(AndroidUtilities.dp(72.0f), true);
        ch.d c10 = this.Q0.c(this.D0, eh.b.e(this.resourcesProvider), false);
        this.T0 = c10;
        c10.n = true;
        c10.A(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c10.C(AndroidUtilities.dp(32.0f));
        c10.l.g = 0.4f;
        c10.u();
        ch.d c11 = this.P0.c(dq0Var, eh.b.e(this.resourcesProvider), false);
        this.V0 = c11;
        c11.z(AndroidUtilities.dp(f10));
        c11.y(AndroidUtilities.dp(f11));
        dq0Var.setPadding(AndroidUtilities.dp(f11), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(7.0f));
        FrameLayout frameLayout9 = this.r;
        if (frameLayout9 != null) {
            ch.d c12 = this.P0.c(frameLayout9, eh.b.e(this.resourcesProvider), false);
            c12.y(AndroidUtilities.dp(f11));
            c12.z(AndroidUtilities.dp(f10));
            this.r.setBackground(c12);
            this.r.setPadding(AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
        }
        FrameLayout frameLayout10 = this.c0;
        if (frameLayout10 != null) {
            ch.d c13 = this.P0.c(frameLayout10, eh.b.e(this.resourcesProvider), false);
            c13.y(AndroidUtilities.dp(f11));
            c13.z(AndroidUtilities.dp(f10));
            this.c0.setBackground(c13);
            this.c0.setPadding(AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
        }
        X0(0);
        org.telegram.ui.uy.r4(AccountInstance.getInstance(this.currentAccount));
        if (rq0Var.d.isEmpty()) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        }
        int i33 = this.currentAccount;
        int i34 = 0;
        MessagesStorage.getInstance(i33).getStorageQueue().postRunnable(new gg.n(i33, i34, new fq0(this), i34));
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        this.glassEngine.h(this.containerView);
        li.m mVar2 = this.glassEngine;
        mVar2.a = new up0(this, i34);
        mVar2.d = new ni.b(AndroidUtilities.dp(48.0f));
        AndroidUtilities.updateViewVisibilityAnimated(aq0Var, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(aq0Var2, false, 1.0f, false);
        org.telegram.ui.ActionBar.d3 container = getContainer();
        up0 up0Var = new up0(this, 1);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(container, up0Var);
    }

    public void P0(View view) {
    }

    public void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
