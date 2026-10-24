package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public class ir0 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int d1 = 0;
    public final org.telegram.ui.ActionBar.k A0;
    public boolean B0;
    public o1.k C0;
    public TLRPC.Dialog D0;
    public AnimatorSet E;
    public final tq0 E0;
    public final mm0 F;
    public ArrayList F0;
    public final lq0 G;
    public TL_stories.StoryItem G0;
    public final lq0 H;
    public i0.b H0;
    public final s4.s I;
    public int I0;
    public final s4.s J;
    public boolean J0;
    public final xz K;
    public org.telegram.ui.ActionBar.m1 K0;
    public final ar0 L;
    public int L0;
    public final fr0 M;
    public boolean M0;
    public final er0 N;
    public boolean N0;
    public final ArrayList O;
    public int O0;
    public final String[] P;
    public final bh.f P0;
    public final int Q;
    public final gh.d Q0;
    public final wx0 R;
    public final gh.d R0;
    public final Drawable S;
    public final gh.c S0;
    public final View[] T;
    public final bh.b T0;
    public final AnimatorSet[] U;
    public final bh.b U0;
    public final a0.h V;
    public final bh.b V0;
    public final HashMap W;
    public final bh.l W0;
    public final uq0 X;
    public final dh.d X0;
    public int Y;
    public final bh.c Y0;
    public boolean Z;
    public final dh.d Z0;
    public final boolean a0;
    public final ArrayList a1;
    public final FrameLayout b;
    public boolean b0;
    public final RectF b1;
    public final mq0 c;
    public final int c0;
    public boolean c1;
    public final nq0 d;
    public final FrameLayout d0;
    public final ki.y1 e;
    public final LinearLayout e0;
    public final mq0 f;
    public final xp f0;
    public final org.telegram.ui.sn g0;
    public final FrameLayout h;
    public final Activity h0;
    public final boolean i0;
    public boolean j0;
    public final TextPaint k0;
    public TLRPC.TL_exportedMessageLink l0;
    public boolean m0;
    public float n;
    public boolean n0;
    public final boolean o0;
    public final String[] p0;
    public int q0;
    public final ai.jc r;
    public int r0;
    public final FrameLayout s;
    public boolean s0;
    public xq0 t0;
    public float u0;
    public final org.telegram.ui.ActionBar.n5 v;
    public float v0;
    public final FrameLayout w;
    public float w0;
    public final FrameLayout x;
    public ValueAnimator x0;
    public final LinearLayout y;
    public final rl0 y0;
    public final k20 z0;

    public ir0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, g6Var);
    }

    public static void J0(ir0 ir0Var) {
        RectF rectF = ir0Var.b1;
        bh.f fVar = ir0Var.P0;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        rectF.set(0.0f, 0.0f, ir0Var.containerView.getMeasuredWidth(), ir0Var.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(1, ir0Var.a1);
        fVar.e(ir0Var.W0, ir0Var.containerView.getMeasuredWidth(), ir0Var.containerView.getMeasuredHeight());
    }

    public static int O0(ir0 ir0Var) {
        lq0 lq0Var = ir0Var.G;
        if (lq0Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = lq0Var.getChildAt(0);
        wl0 wl0Var = (wl0) lq0Var.G(childAt);
        if (wl0Var == null) {
            return -1000;
        }
        int paddingTop = lq0Var.getPaddingTop();
        if (wl0Var.c() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    public static ir0 S0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        return new ir0(context, messageObject != null ? org.telegram.messenger.v0.k(messageObject) : null, str, null, z10, str2, null, false);
    }

    public static void b1(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        int i11 = 0;
        while (i11 < itemsCount) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i11);
            int i12 = 6;
            int i13 = i11 == 0 ? 6 : 0;
            if (i11 != itemsCount - 1) {
                i12 = 0;
            }
            org.telegram.ui.ActionBar.r6.S(childAt, org.telegram.ui.ActionBar.k6.Z(w02, i13, i12), null, org.telegram.ui.ActionBar.r6.O(i10), g6Var);
            i11++;
        }
    }

    public static /* synthetic */ void m(ir0 ir0Var, AtomicReference atomicReference, pq0 pq0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        pq0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, ir0Var.currentAccount, Long.valueOf(-dialog.id));
    }

    public static boolean n(final ir0 ir0Var) {
        org.telegram.ui.sn snVar;
        ki.y1 y1Var = ir0Var.e;
        boolean z10 = ir0Var.i0;
        Activity activity = ir0Var.h0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(ir0Var.getContext());
        linearLayout.setOrientation(1);
        if (ir0Var.O != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, ir0Var.resourcesProvider);
            if (z10) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.fg, actionBarPopupWindow$ActionBarPopupWindowLayout, ir0Var.resourcesProvider);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new qq0(ir0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new cq0(ir0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, ir0Var.getContext(), ir0Var.resourcesProvider, true, false);
            if (z10) {
                e1Var.setTextColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.k6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.z5.n(-1, 48));
            e1Var.j(LocaleController.getString(R.string.ShowSendersName), 0, null);
            ir0Var.J0 = true;
            e1Var.setChecked(true);
            final org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(1, ir0Var.getContext(), ir0Var.resourcesProvider, false, true);
            if (z10) {
                e1Var2.setTextColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.k6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.z5.n(-1, 48));
            e1Var2.j(LocaleController.getString(R.string.HideSendersName), 0, null);
            e1Var2.setChecked(!ir0Var.J0);
            final int i10 = 0;
            e1Var.setOnClickListener(new View.OnClickListener(ir0Var) { // from class: org.telegram.ui.Components.gq0
                public final /* synthetic */ ir0 b;

                {
                    this.b = ir0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.b.J0 = true;
                            e1Var.setChecked(true);
                            e1Var2.setChecked(!r3.J0);
                            break;
                        default:
                            this.b.J0 = false;
                            e1Var.setChecked(false);
                            e1Var2.setChecked(!r3.J0);
                            break;
                    }
                }
            });
            final int i11 = 1;
            e1Var2.setOnClickListener(new View.OnClickListener(ir0Var) { // from class: org.telegram.ui.Components.gq0
                public final /* synthetic */ ir0 b;

                {
                    this.b = ir0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.b.J0 = true;
                            e1Var.setChecked(true);
                            e1Var2.setChecked(!r3.J0);
                            break;
                        default:
                            this.b.J0 = false;
                            e1Var.setChecked(false);
                            e1Var2.setChecked(!r3.J0);
                            break;
                    }
                }
            });
            b1(actionBarPopupWindow$ActionBarPopupWindowLayout, org.telegram.ui.ActionBar.k6.I5, ir0Var.resourcesProvider);
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.z5.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, ir0Var.resourcesProvider);
        if (z10) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.fg, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new qq0(ir0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new cq0(ir0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, ir0Var.getContext(), ir0Var.resourcesProvider, true, true);
        if (z10) {
            e1Var3.setTextColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.k6.ng));
            e1Var3.setIconColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.k6.H6));
        }
        e1Var3.j(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        e1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(e1Var3, w7.z5.n(-1, 48));
        e1Var3.setOnClickListener(new bq0(ir0Var, 1));
        org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(0, ir0Var.getContext(), ir0Var.resourcesProvider, true, true);
        if (z10) {
            e1Var4.setTextColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.k6.ng));
            e1Var4.setIconColor(ir0Var.getThemedColor(org.telegram.ui.ActionBar.k6.H6));
        }
        e1Var4.j(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        e1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(e1Var4, w7.z5.n(-1, 48));
        e1Var4.setOnClickListener(new bq0(ir0Var, 2));
        b1(actionBarPopupWindow$ActionBarPopupWindowLayout2, org.telegram.ui.ActionBar.k6.I5, ir0Var.resourcesProvider);
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.z5.n(-1, -2));
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        ir0Var.K0 = m1Var;
        m1Var.b = false;
        m1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        ir0Var.K0.setOutsideTouchable(true);
        ir0Var.K0.setClippingEnabled(true);
        ir0Var.K0.setInputMethodMode(2);
        ir0Var.K0.setSoftInputMode(0);
        ir0Var.K0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        ir0Var.K0.setFocusable(true);
        int[] iArr = new int[2];
        y1Var.getLocationInWindow(iArr);
        ir0Var.K0.showAtLocation(y1Var, 51, AndroidUtilities.dp(8.0f) + ((y1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!ir0Var.keyboardVisible || (snVar = ir0Var.g0) == null || snVar.j1.getMeasuredHeight() <= AndroidUtilities.dp(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f) : y1Var.getMeasuredHeight() + iArr[1]);
        ir0Var.K0.b();
        try {
            y1Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void p(ir0 ir0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
        int i11;
        boolean z11;
        char c10;
        MessageObject messageObject;
        long j10;
        int i12;
        long j11;
        String[] strArr;
        MessageObject messageObject2;
        SendMessagesHelper.SendMessageParams of2;
        ArrayList arrayList2;
        TLRPC.TL_forumTopic tL_forumTopic;
        mq0 mq0Var;
        long j12;
        long j13;
        Long l4;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue;
        String[] strArr2 = ir0Var.P;
        nq0 nq0Var = ir0Var.d;
        mq0 mq0Var2 = ir0Var.c;
        HashMap hashMap2 = ir0Var.W;
        Long l10 = 0L;
        a0.h hVar = ir0Var.V;
        ArrayList arrayList3 = ir0Var.O;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i13 = 0;
            boolean z12 = false;
            while (true) {
                if (i13 >= hVar.m()) {
                    arrayList2 = arrayList3;
                    tL_forumTopic = null;
                    break;
                }
                long j14 = hVar.j(i13);
                boolean isMonoForum = MessagesController.getInstance(ir0Var.currentAccount).isMonoForum(j14);
                Long l11 = hashMap == null ? l10 : (Long) hashMap.get(Long.valueOf(j14));
                if (l11 != null && l11.longValue() > 0) {
                    z12 = true;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j14));
                if (tL_forumTopic2 == null || !isMonoForum) {
                    mq0Var = mq0Var2;
                    j12 = j14;
                    j13 = 0;
                } else {
                    mq0Var = mq0Var2;
                    j12 = j14;
                    j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                }
                if (tL_forumTopic2 == null || isMonoForum) {
                    l4 = l10;
                    messageObject3 = null;
                } else {
                    l4 = l10;
                    messageObject3 = new MessageObject(ir0Var.currentAccount, tL_forumTopic2.topicStartMessage, false, false);
                }
                if (messageObject3 != null) {
                    messageObject3.isTopicMainMessage = true;
                }
                if (mq0Var.getTag() == null || nq0Var.a.length() <= 0) {
                    messageObject4 = messageObject3;
                    arrayList2 = arrayList3;
                } else {
                    CharSequence charSequence = charSequenceArr[0];
                    MessageObject messageObject5 = messageObject3;
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(charSequence == null ? null : charSequence.toString(), j12, messageObject5, messageObject3, null, true, arrayList, null, null, z10, 0, 0, null, false);
                    messageObject4 = messageObject5;
                    if (l11 == null) {
                        arrayList2 = arrayList3;
                        longValue = 0;
                    } else {
                        arrayList2 = arrayList3;
                        longValue = l11.longValue();
                    }
                    of3.payStars = longValue;
                    of3.monoForumPeer = j13;
                    SendMessagesHelper.getInstance(ir0Var.currentAccount).sendMessage(of3);
                }
                long j15 = j12;
                int sendMessage = SendMessagesHelper.getInstance(ir0Var.currentAccount).sendMessage(ir0Var.O, j15, !ir0Var.J0, false, z10, 0, 0, messageObject4, i10, l11 == null ? 0L : l11.longValue(), j13, null);
                if (sendMessage != 0) {
                    arrayList4.add(Long.valueOf(j15));
                }
                if (hVar.m() == 1) {
                    tL_forumTopic = null;
                    f5.t0(sendMessage, ir0Var.g0, null);
                    if (sendMessage != 0) {
                        break;
                    }
                }
                i13++;
                arrayList3 = arrayList2;
                mq0Var2 = mq0Var;
                l10 = l4;
            }
            int size = arrayList4.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList4.get(i14);
                i14++;
                long longValue2 = ((Long) obj).longValue();
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(longValue2);
                hVar.l(longValue2);
                if (dialog != null) {
                    hashMap2.remove(dialog);
                }
            }
            if (!hVar.i()) {
                ir0Var.W0(hVar, arrayList2.size(), hVar.m() == 1 ? (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(0)) : tL_forumTopic, !z12);
            }
        } else {
            uq0 uq0Var = ir0Var.X;
            int i15 = uq0Var != null ? uq0Var.e : 0;
            if (ir0Var.G0 != null) {
                int i16 = 0;
                boolean z13 = false;
                while (i16 < hVar.m()) {
                    long j16 = hVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(ir0Var.currentAccount).isMonoForum(j16);
                    Long l12 = hashMap == null ? l10 : (Long) hashMap.get(Long.valueOf(j16));
                    if (l12 != null && l12.longValue() > 0) {
                        z13 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j16));
                    if (tL_forumTopic3 == null || !isMonoForum2) {
                        i12 = i15;
                        j11 = 0;
                    } else {
                        i12 = i15;
                        j11 = DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    }
                    if (tL_forumTopic3 == null || isMonoForum2) {
                        strArr = strArr2;
                        messageObject2 = null;
                    } else {
                        strArr = strArr2;
                        messageObject2 = new MessageObject(ir0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    }
                    if (ir0Var.G0 != null) {
                        if (mq0Var2.getTag() != null && nq0Var.a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(ir0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j16, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = ir0Var.G0;
                    } else if (mq0Var2.getTag() == null || nq0Var.a.length() <= 0) {
                        of2 = SendMessagesHelper.SendMessageParams.of(strArr[i12], j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                    } else {
                        CharSequence charSequence2 = charSequenceArr[0];
                        of2 = SendMessagesHelper.SendMessageParams.of(charSequence2 == null ? null : charSequence2.toString(), j16, messageObject2, messageObject2, null, true, arrayList, null, null, z10, 0, 0, null, false);
                    }
                    of2.payStars = l12 == null ? 0L : l12.longValue();
                    of2.monoForumPeer = j11;
                    SendMessagesHelper.getInstance(ir0Var.currentAccount).sendMessage(of2);
                    i16++;
                    i15 = i12;
                    strArr2 = strArr;
                }
                z11 = z13;
            } else {
                int i17 = i15;
                if (strArr2[i17] != null) {
                    boolean z14 = false;
                    for (int i18 = 0; i18 < hVar.m(); i18++) {
                        long j17 = hVar.j(i18);
                        boolean isMonoForum3 = MessagesController.getInstance(ir0Var.currentAccount).isMonoForum(j17);
                        Long l13 = hashMap == null ? l10 : (Long) hashMap.get(Long.valueOf(j17));
                        if (l13 != null && l13.longValue() > 0) {
                            z14 = true;
                        }
                        TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j17));
                        long peerDialogId = (tL_forumTopic4 == null || !isMonoForum3) ? 0L : DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                        if (tL_forumTopic4 == null || isMonoForum3) {
                            c10 = 0;
                            messageObject = null;
                        } else {
                            c10 = 0;
                            messageObject = new MessageObject(ir0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                        }
                        if (mq0Var2.getTag() == null || nq0Var.a.length() <= 0) {
                            j10 = j17;
                        } else {
                            CharSequence charSequence3 = charSequenceArr[c10];
                            SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(charSequence3 == null ? null : charSequence3.toString(), j17, messageObject, messageObject, null, true, arrayList, null, null, z10, 0, 0, null, false);
                            j10 = j17;
                            of4.payStars = l13 == null ? 0L : l13.longValue();
                            of4.monoForumPeer = peerDialogId;
                            SendMessagesHelper.getInstance(ir0Var.currentAccount).sendMessage(of4);
                        }
                        SendMessagesHelper.SendMessageParams of5 = SendMessagesHelper.SendMessageParams.of(strArr2[i17], j10, messageObject, messageObject, null, true, null, null, null, z10, 0, 0, null, false);
                        of5.payStars = l13 == null ? 0L : l13.longValue();
                        of5.monoForumPeer = peerDialogId;
                        SendMessagesHelper.getInstance(ir0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z14;
                } else {
                    i11 = 0;
                    z11 = false;
                    ir0Var.W0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i11)), !z11);
                }
            }
            i11 = 0;
            ir0Var.W0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i11)), !z11);
        }
        xq0 xq0Var = ir0Var.t0;
        if (xq0Var != null) {
            xq0Var.H();
        }
        ir0Var.dismiss();
    }

    public static void q(ir0 ir0Var, int i10) {
        TLRPC.Dialog dialog;
        k20 k20Var = ir0Var.z0;
        HashMap hashMap = ir0Var.W;
        a0.h hVar = ir0Var.V;
        ar0 ar0Var = ir0Var.L;
        fr0 fr0Var = ir0Var.M;
        if (fr0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = ir0Var.D0;
            if (dialog2 == null) {
                return;
            }
            hVar.k(dialog2, dialog2.id);
            hashMap.remove(dialog2);
            ir0Var.g1(2);
            if (ir0Var.M0 || ir0Var.N0) {
                if (((TLRPC.Dialog) ar0Var.e.f(dialog2.id)) == null) {
                    ar0Var.e.k(dialog2, dialog2.id);
                    ArrayList arrayList = ar0Var.d;
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                ar0Var.l();
                ir0Var.B0 = false;
                k20Var.r.setText("");
                ir0Var.P0(false);
            }
            for (int i11 = 0; i11 < ir0Var.U0().getChildCount(); i11++) {
                View childAt = ir0Var.U0().getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                    if (g7Var.getCurrentDialog() == ir0Var.D0.id) {
                        g7Var.d(null, false, true);
                        g7Var.b(true, true);
                    }
                }
            }
            ir0Var.Q0();
            return;
        }
        TLRPC.TL_forumTopic E = fr0Var.E(i10);
        if (E == null || (dialog = ir0Var.D0) == null) {
            return;
        }
        long j10 = dialog.id;
        boolean isMonoForum = MessagesController.getInstance(ir0Var.currentAccount).isMonoForum(j10);
        TLRPC.Dialog dialog3 = ir0Var.D0;
        hVar.k(dialog3, j10);
        hashMap.put(dialog3, E);
        ir0Var.g1(2);
        if (ir0Var.M0 || ir0Var.N0) {
            if (((TLRPC.Dialog) ar0Var.e.f(dialog3.id)) == null) {
                ar0Var.e.k(dialog3, dialog3.id);
                ArrayList arrayList2 = ar0Var.d;
                arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
            }
            ar0Var.l();
            ir0Var.B0 = false;
            k20Var.r.setText("");
            ir0Var.P0(false);
        }
        for (int i12 = 0; i12 < ir0Var.U0().getChildCount(); i12++) {
            View childAt2 = ir0Var.U0().getChildAt(i12);
            if (childAt2 instanceof org.telegram.ui.Cells.g7) {
                org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) childAt2;
                if (g7Var2.getCurrentDialog() == ir0Var.D0.id) {
                    g7Var2.d(E, isMonoForum, true);
                    g7Var2.b(true, true);
                }
            }
        }
        ir0Var.Q0();
    }

    public static void z0(ir0 ir0Var) {
        lq0 lq0Var = ir0Var.G;
        lq0 lq0Var2 = ir0Var.H;
        mm0 mm0Var = ir0Var.F;
        if (ir0Var.s0) {
            return;
        }
        lq0 lq0Var3 = ir0Var.M0 ? lq0Var2 : lq0Var;
        if (lq0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = lq0Var3.getChildAt(0);
        for (int i10 = 0; i10 < lq0Var3.getChildCount(); i10++) {
            if (lq0Var3.getChildAt(i10).getTop() < childAt.getTop()) {
                childAt = lq0Var3.getChildAt(i10);
            }
        }
        wl0 wl0Var = (wl0) lq0Var3.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i11 = (top <= 0 || wl0Var == null || wl0Var.b() != 0) ? 0 : top;
        if (top < 0 || wl0Var == null || wl0Var.b() != 0) {
            ir0Var.L0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            ir0Var.Y0(true);
            top = i11;
        } else {
            ir0Var.L0 = childAt.getTop();
            ir0Var.Y0(false);
        }
        if (mm0Var.getVisibility() == 0) {
            if (mm0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = mm0Var.getChildAt(0);
            for (int i12 = 0; i12 < mm0Var.getChildCount(); i12++) {
                if (mm0Var.getChildAt(i12).getTop() < childAt2.getTop()) {
                    childAt2 = mm0Var.getChildAt(i12);
                }
            }
            wl0 wl0Var2 = (wl0) mm0Var.G(childAt2);
            int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
            int i13 = (top2 <= 0 || wl0Var2 == null || wl0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || wl0Var2 == null || wl0Var2.b() != 0) {
                ir0Var.L0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                ir0Var.Y0(true);
                top2 = i13;
            } else {
                ir0Var.L0 = childAt2.getTop();
                ir0Var.Y0(false);
            }
            top = AndroidUtilities.lerp(top, top2, mm0Var.getAlpha());
        }
        int i14 = ir0Var.q0;
        if (i14 != top) {
            ir0Var.r0 = i14;
            float f7 = top;
            int i15 = (int) (ir0Var.u0 + f7);
            ir0Var.q0 = i15;
            lq0Var.setTopGlowOffset(i15);
            int i16 = (int) (ir0Var.u0 + f7);
            ir0Var.q0 = i16;
            lq0Var2.setTopGlowOffset(i16);
            int i17 = (int) (f7 + ir0Var.u0);
            ir0Var.q0 = i17;
            mm0Var.setTopGlowOffset(i17);
            ir0Var.b.setTranslationY(ir0Var.q0 + ir0Var.u0);
            ir0Var.R.setTranslationY(ir0Var.q0 + ir0Var.u0);
            ir0Var.containerView.invalidate();
        }
    }

    public final void P0(boolean z10) {
        k20 k20Var = this.z0;
        ei.e2 e2Var = k20Var.r;
        ei.e2 e2Var2 = k20Var.r;
        boolean isEmpty = TextUtils.isEmpty(e2Var.getText());
        lq0 lq0Var = this.G;
        lq0 lq0Var2 = this.H;
        boolean z11 = true;
        if (!isEmpty || ((this.keyboardVisible && e2Var2.hasFocus()) || this.N0)) {
            this.B0 = true;
            if (this.D0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(lq0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(lq0Var2, true);
            }
        } else {
            if (this.D0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(lq0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(lq0Var2, false);
            }
            z11 = false;
        }
        if (this.M0 != z11 || z10) {
            this.M0 = z11;
            er0 er0Var = this.N;
            er0Var.l();
            this.L.l();
            if (this.M0) {
                if (this.L0 == Integer.MAX_VALUE) {
                    ((s4.b0) lq0Var2.getLayoutManager()).h1(0, -lq0Var2.getPaddingTop());
                } else {
                    ((s4.b0) lq0Var2.getLayoutManager()).h1(0, this.L0 - lq0Var2.getPaddingTop());
                }
                er0Var.E(e2Var2.getText().toString());
                return;
            }
            int i10 = this.L0;
            s4.s sVar = this.I;
            if (i10 == Integer.MAX_VALUE) {
                sVar.h1(0, 0);
            } else {
                sVar.h1(0, 0);
            }
        }
    }

    public final void Q0() {
        TLRPC.Dialog dialog = this.D0;
        if (dialog == null) {
            return;
        }
        View view = null;
        this.D0 = null;
        for (int i10 = 0; i10 < U0().getChildCount(); i10++) {
            View childAt = U0().getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) childAt).getCurrentDialog() == dialog.id) {
                view = childAt;
            }
        }
        if (view == null) {
            return;
        }
        o1.k kVar = this.C0;
        if (kVar != null) {
            kVar.c();
        }
        U0().setVisibility(0);
        k20 k20Var = this.z0;
        k20Var.setVisibility(0);
        ei.e2 e2Var = k20Var.r;
        if (this.M0 || this.N0) {
            this.E0.H.v = true;
            e2Var.requestFocus();
            AndroidUtilities.showKeyboard(e2Var);
        }
        int[] iArr = new int[2];
        o1.k kVar2 = new o1.k(new o1.j(1000.0f));
        o1.l lVar = new o1.l(0.0f);
        org.telegram.ui.sn snVar = this.g0;
        lVar.b((snVar == null || !snVar.b) ? 800.0f : 10.0f);
        lVar.a(1.0f);
        kVar2.u = lVar;
        this.C0 = kVar2;
        kVar2.b(new aq0(this, (org.telegram.ui.Cells.g7) view, iArr, 0));
        this.C0.a(new hb(this, 5));
        this.C0.h();
    }

    public final void R0() {
        boolean z10 = false;
        if (this.l0 == null && this.p0[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", T0()));
            xq0 xq0Var = this.t0;
            if (xq0Var != null) {
                xq0Var.g0();
                return;
            }
            if (this.h0 instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.l0;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z10 = true;
                }
                ((LaunchActivity) this.h0).I0(new i2.x(5, z10));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final String T0() {
        String str;
        String[] strArr = this.p0;
        uq0 uq0Var = this.X;
        if (uq0Var != null) {
            str = strArr[uq0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.l0;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        xp xpVar = this.f0;
        if (xpVar != null && xpVar.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.c0)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return str == null ? "" : str;
    }

    public final mm0 U0() {
        return (this.M0 || this.N0) ? this.H : this.G;
    }

    public final void V0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        mm0 mm0Var = this.F;
        mm0Var.setPivotX(width);
        mm0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        mm0Var.setScaleX(f11);
        mm0Var.setScaleY(f11);
        mm0Var.setAlpha(f7);
        mm0 U0 = U0();
        U0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        U0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        U0.setScaleX(f12);
        U0.setScaleY(f12);
        float f13 = 1.0f - f7;
        U0.setAlpha(f13);
        k20 k20Var = this.z0;
        k20Var.setPivotX(k20Var.getWidth() / 2.0f);
        k20Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        k20Var.setScaleX(f14);
        k20Var.setScaleY(f14);
        k20Var.setAlpha(f13);
        org.telegram.ui.ActionBar.k kVar = this.A0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.setAlpha(f7);
        mm0Var.getLocationInWindow(iArr);
        float interpolation = bs.g.getInterpolation(f7);
        for (int i10 = 0; i10 < U0.getChildCount(); i10++) {
            View childAt = U0.getChildAt(i10);
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
        for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
            View childAt2 = mm0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((mm0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        U0.invalidate();
    }

    public final void Y0(boolean z10) {
        View[] viewArr = this.T;
        if ((!z10 || viewArr[0].getTag() == null) && (z10 || viewArr[0].getTag() != null)) {
            return;
        }
        viewArr[0].setTag(z10 ? null : 1);
        if (z10) {
            viewArr[0].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.U;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[0] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        animatorSetArr[0].setDuration(150L);
        animatorSetArr[0].addListener(new rq0(this, z10, 0));
        animatorSetArr[0].start();
    }

    public final void Z0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        ir0 ir0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        dr0 dr0Var;
        if (dialog instanceof zq0) {
            X0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.g7) && ((org.telegram.ui.Cells.g7) view).F) || ((view instanceof org.telegram.ui.Cells.i6) && ((org.telegram.ui.Cells.i6) view).n0)) {
            d1(dialog.id, view);
            return;
        }
        mm0 mm0Var = this.F;
        if (mm0Var.getVisibility() != 8 || (activity = this.h0) == null) {
            return;
        }
        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
        int i10 = this.Q;
        if (isChatDialog) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString(R.string.SendMessageTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.R = string;
                if (i10 == 3) {
                    if (ChatObject.isActionBannedByDefault(chat, 10)) {
                        c2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                    } else {
                        c2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                    }
                } else if (i10 != 2) {
                    c2Var.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                } else if (this.o0) {
                    c2Var.T = LocaleController.getString(R.string.PublicPollCantForward);
                } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                    c2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                } else {
                    c2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                }
                i2.o1.s(R.string.OK, alertDialog$Builder, null);
                return;
            }
        } else if (DialogObject.isEncryptedDialog(dialog.id) && i10 != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String string2 = LocaleController.getString(R.string.SendMessageTitle);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
            c2Var2.R = string2;
            if (i10 == 3) {
                c2Var2.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
            } else if (i10 != 0) {
                c2Var2.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
            } else {
                c2Var2.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
            }
            i2.o1.s(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        long j10 = dialog.id;
        a0.h hVar = this.V;
        if (hVar.h(j10) >= 0) {
            hVar.l(dialog.id);
            this.W.remove(dialog);
            if (view instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) view).s(false, true);
            } else if (view instanceof org.telegram.ui.Cells.g7) {
                ((org.telegram.ui.Cells.g7) view).b(false, true);
            }
            g1(1);
            ir0Var = this;
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if ((UserObject.isBotForum(user) && !(((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id))) || (DialogObject.isChatDialog(dialog.id) && (ChatObject.isForum(chat2) || (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                this.D0 = dialog;
                this.J.h1(0, this.q0 - mm0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                pq0 pq0Var = new pq0(this, dialog, atomicReference, view);
                atomicReference.set(new j90(this, atomicReference, pq0Var, dialog, 5));
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i11 = NotificationCenter.topicsDidLoaded;
                notificationCenter.addObserver(pq0Var, i11);
                if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.id) != null) {
                    pq0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.id));
                    return;
                } else {
                    MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.id);
                    AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            ir0Var = this;
            hVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) view).s(true, true);
            } else if (view instanceof org.telegram.ui.Cells.g7) {
                ((org.telegram.ui.Cells.g7) view).b(true, true);
            }
            g1(2);
            long j11 = UserConfig.getInstance(ir0Var.currentAccount).clientUserId;
            if (ir0Var.M0) {
                ar0 ar0Var = ir0Var.L;
                a0.h hVar2 = ar0Var.e;
                ArrayList arrayList = ar0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.id);
                if (dialog2 == null) {
                    ar0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j11) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                ar0Var.l();
                ir0Var.B0 = false;
                k20 k20Var = ir0Var.z0;
                k20Var.r.setText("");
                P0(false);
                AndroidUtilities.hideKeyboard(k20Var.r);
            }
        }
        er0 er0Var = ir0Var.N;
        if (er0Var == null || (dr0Var = er0Var.H) == null) {
            return;
        }
        dr0Var.q(0, dr0Var.h());
    }

    public final void a1(final boolean z10) {
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            a0.h hVar = this.V;
            int m10 = hVar.m();
            mq0 mq0Var = this.c;
            nq0 nq0Var = this.d;
            if (i12 >= m10) {
                Editable text = nq0Var.getText();
                lu luVar = nq0Var.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                xp xpVar = this.f0;
                int i13 = (xpVar == null || !xpVar.a.q) ? -1 : this.c0;
                ArrayList arrayList = new ArrayList();
                if (this.O != null) {
                    i10 = 0;
                    while (i11 < hVar.m()) {
                        long j10 = hVar.j(i11);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
                        }
                        if (mq0Var.getTag() != null && luVar.length() > 0 && sendPaidMessagesStars > 0) {
                            i10++;
                        }
                        if (sendPaidMessagesStars > 0) {
                            i10++;
                        }
                        if (sendPaidMessagesStars > 0 && !arrayList.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                        }
                        i11++;
                    }
                } else {
                    uq0 uq0Var = this.X;
                    int i14 = uq0Var != null ? uq0Var.e : 0;
                    if (this.G0 != null) {
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < hVar.m()) {
                            long j11 = hVar.j(i15);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
                            }
                            int i17 = i11;
                            if (this.G0 != null && mq0Var.getTag() != null && luVar.length() > 0 && charSequenceArr[i17] != null && sendPaidMessagesStars2 > 0) {
                                i16++;
                            }
                            if (sendPaidMessagesStars2 > 0) {
                                i16++;
                            }
                            if (sendPaidMessagesStars2 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                                arrayList.add(Long.valueOf(j11));
                            }
                            i15++;
                            i11 = i17;
                        }
                        i10 = i16;
                    } else {
                        int i18 = 0;
                        if (this.P[i14] != null) {
                            for (int i19 = 0; i19 < hVar.m(); i19++) {
                                long j12 = hVar.j(i19);
                                long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j12);
                                if (sendPaidMessagesStars3 <= 0) {
                                    sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j12));
                                }
                                if (mq0Var.getTag() != null && luVar.length() > 0 && sendPaidMessagesStars3 > 0) {
                                    i18++;
                                }
                                if (sendPaidMessagesStars3 > 0) {
                                    i18++;
                                }
                                if (sendPaidMessagesStars3 > 0 && !arrayList.contains(Long.valueOf(j12))) {
                                    arrayList.add(Long.valueOf(j12));
                                }
                            }
                        }
                        i10 = i18;
                    }
                }
                final int i20 = i13;
                f5.c0(this.currentAccount, arrayList, i10, new Utilities.Callback() { // from class: org.telegram.ui.Components.hq0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        ir0.p(ir0.this, charSequenceArr, entities, z10, i20, (HashMap) obj);
                    }
                });
                return;
            }
            if (f5.h(getContext(), this.currentAccount, hVar.j(i12), mq0Var.getTag() != null && nq0Var.a.length() > 0)) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void c1(boolean z10) {
        mq0 mq0Var = this.c;
        if (z10 == (mq0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        mq0Var.setTag(z10 ? 1 : null);
        nq0 nq0Var = this.d;
        if (nq0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(nq0Var.getEditText());
        }
        nq0Var.k(true);
        FrameLayout frameLayout = this.d0;
        mq0 mq0Var2 = this.f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            mq0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            mq0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        if (frameLayout2 != null) {
            int i10 = z10 ? 4 : 1;
            WeakHashMap weakHashMap = r0.i0.a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.y;
        if (linearLayout != null) {
            int i11 = z10 ? 4 : 1;
            WeakHashMap weakHashMap2 = r0.i0.a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.E = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f7 = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(mq0Var, (Property<mq0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(mq0Var2, (Property<mq0, Float>) View.SCALE_X, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(mq0Var2, (Property<mq0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(mq0Var2, (Property<mq0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.T[1], (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout3 = this.s;
        if (frameLayout3 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.i0 && z10) {
                f7 = AndroidUtilities.dp(this.e0 != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, f7));
        }
        this.E.playTogether(arrayList);
        this.E.setInterpolator(new DecelerateInterpolator());
        this.E.setDuration(180L);
        this.E.addListener(new rq0(this, z10, 1));
        this.E.start();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void d1(long j10, View view) {
        int i10 = -this.I0;
        this.I0 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j10 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10))) : "";
        boolean premiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
        int i11 = 1;
        FrameLayout frameLayout = this.w;
        (premiumFeaturesBlocked ? new xc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : new xc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new dq0(this, i11))).j();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            ar0 ar0Var = this.L;
            if (ar0Var != null) {
                ar0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        nq0 nq0Var = this.d;
        if (nq0Var != null) {
            AndroidUtilities.hideKeyboard(nq0Var.getEditText());
        }
        this.Z = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public void dismissInternal() {
        super.dismissInternal();
        nq0 nq0Var = this.d;
        if (nq0Var != null) {
            nq0Var.o();
        }
    }

    public final void e1() {
        org.telegram.ui.ActionBar.o1 o1Var;
        mq0 mq0Var = this.c;
        if (mq0Var == null) {
            return;
        }
        nq0 nq0Var = this.d;
        if (nq0Var == null || !nq0Var.m()) {
            tq0 tq0Var = this.E0;
            if (tq0Var != null && (o1Var = tq0Var.H) != null && !o1Var.f) {
                AndroidUtilities.dp(20.0f);
            }
        } else {
            nq0Var.getEmojiPaddingShown();
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.d0;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f7);
        }
        float f10 = -f7;
        mq0Var.setTranslationY(f10);
        this.f.setTranslationY(f10);
    }

    public final void f1() {
        org.telegram.ui.ActionBar.n5 n5Var = this.v;
        if (n5Var != null) {
            String T0 = T0();
            if (T0.startsWith("https://")) {
                T0 = T0.substring(8);
            } else if (T0.startsWith("http://")) {
                T0 = T0.substring(7);
            }
            n5Var.l(T0, false);
        }
    }

    public final void g1(int i10) {
        a0.h hVar = this.V;
        if (hVar.m() == 0) {
            c1(false);
            return;
        }
        ArrayList arrayList = this.O;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.c.getTag();
        nq0 nq0Var = this.d;
        if (tag != null && nq0Var.a.length() > 0) {
            size++;
        }
        long j10 = 0;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            long j11 = ((TLRPC.Dialog) hVar.n(i11)).id;
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
            }
            j10 += sendPaidMessagesStars;
        }
        int max = Math.max(1, hVar.m());
        boolean z10 = i10 != 0;
        ki.y1 y1Var = this.e;
        y1Var.g(max, z10);
        y1Var.i(size, j10, i10 != 0);
        c1(true);
        nq0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), y1Var.l()), 0);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.Y;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        if (this.D0 != null) {
            Q0();
            return;
        }
        nq0 nq0Var = this.d;
        if (nq0Var == null || !nq0Var.e) {
            super.onBackPressed();
        } else {
            nq0Var.k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            gh.c cVar = this.S0;
            if (cVar != null) {
                cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            }
            if (this.container != null) {
                boolean z10 = AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.k6.h5)) > 0.721f;
                if (z10 != this.c1) {
                    this.c1 = z10;
                    AndroidUtilities.setLightNavigationBar(this.container, z10);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public ir0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:130:0x080e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ir0(Context context, org.telegram.ui.sn snVar, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, Integer num, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, true);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        lq0 lq0Var;
        int i13;
        LinearLayout linearLayout;
        final int i14 = 1;
        String[] strArr = new String[2];
        this.P = strArr;
        this.T = new View[2];
        this.U = new AnimatorSet[2];
        this.V = new a0.h();
        this.W = new HashMap();
        this.Y = -1;
        this.Z = false;
        new RectF();
        new Paint(1);
        this.k0 = new TextPaint(1);
        String[] strArr2 = new String[2];
        this.p0 = strArr2;
        this.F0 = new ArrayList();
        int i15 = 4;
        while (true) {
            i10 = 12;
            if (i15 >= 32) {
                i11 = 80;
                break;
            }
            i11 = (1 << i15) - 12;
            if (80 <= i11) {
                break;
            } else {
                i15++;
            }
        }
        int i16 = i11 / 8;
        long[] jArr = new long[i16];
        Object[] objArr = new Object[i16];
        this.H0 = i0.b.e;
        this.I0 = 4;
        this.J0 = true;
        this.L0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        ArrayList arrayList2 = new ArrayList();
        this.a1 = arrayList2;
        RectF rectF = new RectF();
        this.b1 = rectF;
        arrayList2.add(rectF);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        gh.c cVar = new gh.c();
        this.S0 = cVar;
        int i17 = org.telegram.ui.ActionBar.k6.d6;
        cVar.a(getThemedColor(i17));
        if (Build.VERSION.SDK_INT >= 31) {
            this.P0 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.R0 = dVar;
            i12 = 0;
            dVar.k(new k2.w0(this, 14));
            gh.d dVar2 = new gh.d(null);
            this.Q0 = dVar2;
            dVar2.k(new l2.f(this, i10));
            bh.b bVar = new bh.b(dVar);
            this.T0 = bVar;
            bVar.i = LiteMode.isEnabled(262144);
            bh.b bVar2 = new bh.b(dVar2);
            this.U0 = bVar2;
            bVar2.i = LiteMode.isEnabled(262144);
        } else {
            i12 = 0;
            this.P0 = null;
            this.Q0 = null;
            this.R0 = null;
            this.T0 = new bh.b(cVar);
            this.U0 = new bh.b(cVar);
        }
        this.V0 = new bh.b(cVar);
        this.resourcesProvider = g6Var;
        this.a0 = z13;
        this.h0 = AndroidUtilities.findActivity(context);
        this.i0 = z12;
        if (z12) {
            this.resourcesProvider = new ci.k0(i14);
        }
        cVar.a(getThemedColor(i17));
        this.g0 = snVar;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.S = mutate;
        int i18 = org.telegram.ui.ActionBar.k6.h5;
        this.behindKeyboardColorKey = i18;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i18), PorterDuff.Mode.MULTIPLY));
        this.occupyNavigationBarWithoutKeyboard = true;
        this.isFullscreen = z11;
        strArr2[i12] = str3;
        strArr2[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12);
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(messageObject.getDialogId()));
            if (!TextUtils.isEmpty(publicUsername)) {
                StringBuilder sb2 = new StringBuilder("https://");
                a1.g.A(sb2, MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, "/");
                sb2.append(messageObject.getId());
                strArr2[0] = sb2.toString();
                if (arrayList.size() == 1 && messageObject.hasValidGroupId()) {
                    strArr2[0] = a1.g.s(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.O = arrayList;
        this.N = new er0(this, context);
        this.o0 = z10;
        strArr[0] = str;
        strArr[1] = str2;
        this.useSmoothKeyboard = true;
        setDelegate(new org.telegram.ui.i0(this, i14));
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                MessageObject messageObject2 = (MessageObject) this.O.get(i19);
                if (messageObject2.isTodo()) {
                    this.Q = 3;
                } else if (messageObject2.isPoll()) {
                    int i20 = messageObject2.isPublicPoll() ? 2 : 1;
                    this.Q = i20;
                    if (i20 == 2) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        int i21 = 20;
        if (z10) {
            this.m0 = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((MessageObject) arrayList.get(0)).getId();
            tL_channels_exportMessageLink.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(((MessageObject) arrayList.get(0)).messageOwner.peer_id.channel_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_exportMessageLink, new org.telegram.ui.vc(i21, this, context));
        }
        tq0 tq0Var = new tq0(this, context);
        this.E0 = tq0Var;
        this.containerView = tq0Var;
        bh.b bVar3 = this.T0;
        ih.k kVar = new ih.k(this.containerView);
        ViewGroup viewGroup = this.containerView;
        bVar3.f = kVar;
        bVar3.g = viewGroup;
        bh.b bVar4 = this.U0;
        ih.k kVar2 = new ih.k(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        bVar4.f = kVar2;
        bVar4.g = viewGroup2;
        bh.b bVar5 = this.V0;
        ih.k kVar3 = new ih.k(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        bVar5.f = kVar3;
        bVar5.g = viewGroup3;
        viewGroup3.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup4 = this.containerView;
        int i22 = this.backgroundPaddingLeft;
        viewGroup4.setPadding(i22, 0, i22, this.H0.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(new org.telegram.ui.Cells.l0(this));
        if (this.i0 && this.p0[1] != null) {
            uq0 uq0Var = new uq0(this, context);
            this.X = uq0Var;
            frameLayout.addView(uq0Var, w7.z5.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        k20 k20Var = new k20(context, this.resourcesProvider);
        this.z0 = k20Var;
        vq0 vq0Var = new vq0(this);
        ei.e2 e2Var = k20Var.r;
        e2Var.addTextChangedListener(vq0Var);
        e2Var.setHint(LocaleController.getString(R.string.ShareSendTo));
        e2Var.setOnEditorActionListener(new d1(this, 7));
        k20Var.setCloseButtonOnClickListener(new dq0(this, 0));
        frameLayout.addView(k20Var, w7.z5.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        org.telegram.ui.ActionBar.k kVar4 = new org.telegram.ui.ActionBar.k(context, null);
        this.A0 = kVar4;
        kVar4.setOccupyStatusBar(false);
        kVar4.setBackButtonImage(R.drawable.ic_ab_back);
        int i23 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.m(kVar4, 5, i23, this.resourcesProvider);
        org.telegram.ui.ActionBar.r6.m(kVar4, 6, org.telegram.ui.ActionBar.k6.q5, this.resourcesProvider);
        org.telegram.ui.ActionBar.r6.m(kVar4, 1, org.telegram.ui.ActionBar.k6.z6, null);
        org.telegram.ui.ActionBar.r6.m(kVar4, 3, org.telegram.ui.ActionBar.k6.u8, null);
        int i24 = 15;
        kVar4.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, i24));
        kVar4.setVisibility(8);
        frameLayout.addView(kVar4, w7.z5.e(-1, 58, 83));
        mm0 mm0Var = new mm0(context, this.resourcesProvider);
        this.F = mm0Var;
        s4.s sVar = new s4.s(4);
        this.J = sVar;
        mm0Var.setLayoutManager(sVar);
        final int i25 = 0;
        sVar.O = new jq0(this, i25);
        mm0Var.setOnScrollListener(new kq0(this, i25));
        fr0 fr0Var = new fr0(this, context);
        this.M = fr0Var;
        mm0Var.setAdapter(fr0Var);
        int i26 = org.telegram.ui.ActionBar.k6.A5;
        int i27 = 21;
        org.telegram.ui.ActionBar.r6.m(mm0Var, 21, i26, this.resourcesProvider);
        mm0Var.setVerticalScrollBarEnabled(false);
        mm0Var.setHorizontalScrollBarEnabled(false);
        mm0Var.setOverScrollMode(2);
        mm0Var.setSelectorDrawableColor(0);
        mm0Var.setItemSelectorColorProvider(new ud0(i24));
        mm0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        mm0Var.setClipToPadding(false);
        mm0Var.i(new ci.l(5));
        mm0Var.setOnItemClickListener(new am0(this) { // from class: org.telegram.ui.Components.eq0
            public final /* synthetic */ ir0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.am0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i28, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i25) {
                    case 0:
                        ir0.q(this.b, i28);
                        break;
                    case 1:
                        if (i28 >= 0) {
                            ir0 ir0Var = this.b;
                            ArrayList arrayList3 = ir0Var.L.d;
                            int i29 = i28 - 1;
                            TLRPC.Dialog dialog = (i29 < 0 || i29 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i29);
                            if (dialog != null) {
                                ir0Var.Z0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i28 >= 0) {
                            ir0 ir0Var2 = this.b;
                            er0 er0Var = ir0Var2.N;
                            ir0 ir0Var3 = er0Var.K;
                            int i30 = er0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i28 < i30 || i30 < 0) {
                                int i31 = i28 - 1;
                                if (i31 >= 0) {
                                    if (i31 < er0Var.d.size()) {
                                        tL_dialog2 = ((wq0) er0Var.d.get(i31)).a;
                                    } else {
                                        int size2 = i31 - er0Var.d.size();
                                        ArrayList arrayList4 = er0Var.e.d;
                                        if (size2 < arrayList4.size()) {
                                            TLObject tLObject = (TLObject) arrayList4.get(size2);
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
                                    ir0Var2.Z0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i32 = i28 - i30;
                                if (i32 >= 0 && i32 < ir0Var3.F0.size()) {
                                    TLObject tLObject2 = ((hg.g0) ir0Var3.F0.get(i32)).a;
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
        mm0Var.setVisibility(8);
        this.containerView.addView(mm0Var, w7.z5.e(-1, -1, 51));
        lq0 lq0Var2 = new lq0(this, context, this.resourcesProvider, i25);
        this.G = lq0Var2;
        lq0Var2.setSelectorDrawableColor(0);
        lq0Var2.setItemSelectorColorProvider(new ud0(i24));
        lq0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        lq0Var2.setClipToPadding(false);
        getContext();
        s4.s sVar2 = new s4.s(4);
        this.I = sVar2;
        lq0Var2.setLayoutManager(sVar2);
        this.W0 = new bh.l(lq0Var2, this.containerView, new fq0(lq0Var2, i25));
        sVar2.O = new jq0(this, i14);
        lq0Var2.setHorizontalScrollBarEnabled(false);
        lq0Var2.setVerticalScrollBarEnabled(false);
        lq0Var2.setOverScrollMode(2);
        lq0Var2.i(new ci.l(6));
        this.containerView.addView(lq0Var2, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ar0 ar0Var = new ar0(this, context);
        this.L = ar0Var;
        lq0Var2.setAdapter(ar0Var);
        org.telegram.ui.ActionBar.r6.m(lq0Var2, 21, i26, this.resourcesProvider);
        lq0Var2.setOnItemClickListener(new am0(this) { // from class: org.telegram.ui.Components.eq0
            public final /* synthetic */ ir0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.am0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i28, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i14) {
                    case 0:
                        ir0.q(this.b, i28);
                        break;
                    case 1:
                        if (i28 >= 0) {
                            ir0 ir0Var = this.b;
                            ArrayList arrayList3 = ir0Var.L.d;
                            int i29 = i28 - 1;
                            TLRPC.Dialog dialog = (i29 < 0 || i29 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i29);
                            if (dialog != null) {
                                ir0Var.Z0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i28 >= 0) {
                            ir0 ir0Var2 = this.b;
                            er0 er0Var = ir0Var2.N;
                            ir0 ir0Var3 = er0Var.K;
                            int i30 = er0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i28 < i30 || i30 < 0) {
                                int i31 = i28 - 1;
                                if (i31 >= 0) {
                                    if (i31 < er0Var.d.size()) {
                                        tL_dialog2 = ((wq0) er0Var.d.get(i31)).a;
                                    } else {
                                        int size2 = i31 - er0Var.d.size();
                                        ArrayList arrayList4 = er0Var.e.d;
                                        if (size2 < arrayList4.size()) {
                                            TLObject tLObject = (TLObject) arrayList4.get(size2);
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
                                    ir0Var2.Z0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i32 = i28 - i30;
                                if (i32 >= 0 && i32 < ir0Var3.F0.size()) {
                                    TLObject tLObject2 = ((hg.g0) ir0Var3.F0.get(i32)).a;
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
        lq0Var2.setOnScrollListener(new kq0(this, i14));
        lq0 lq0Var3 = new lq0(this, context, this.resourcesProvider, i14);
        this.H = lq0Var3;
        lq0Var3.setItemSelectorColorProvider(new ud0(i24));
        lq0Var3.setSelectorDrawableColor(0);
        lq0Var3.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        lq0Var3.setClipToPadding(false);
        getContext();
        xz xzVar = new xz(4, 0, lq0Var3);
        this.K = xzVar;
        lq0Var3.setLayoutManager(xzVar);
        final int i28 = 2;
        xzVar.O = new jq0(this, i28);
        lq0Var3.setOnItemClickListener(new am0(this) { // from class: org.telegram.ui.Components.eq0
            public final /* synthetic */ ir0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.am0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i282, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i28) {
                    case 0:
                        ir0.q(this.b, i282);
                        break;
                    case 1:
                        if (i282 >= 0) {
                            ir0 ir0Var = this.b;
                            ArrayList arrayList3 = ir0Var.L.d;
                            int i29 = i282 - 1;
                            TLRPC.Dialog dialog = (i29 < 0 || i29 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i29);
                            if (dialog != null) {
                                ir0Var.Z0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i282 >= 0) {
                            ir0 ir0Var2 = this.b;
                            er0 er0Var = ir0Var2.N;
                            ir0 ir0Var3 = er0Var.K;
                            int i30 = er0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i282 < i30 || i30 < 0) {
                                int i31 = i282 - 1;
                                if (i31 >= 0) {
                                    if (i31 < er0Var.d.size()) {
                                        tL_dialog2 = ((wq0) er0Var.d.get(i31)).a;
                                    } else {
                                        int size2 = i31 - er0Var.d.size();
                                        ArrayList arrayList4 = er0Var.e.d;
                                        if (size2 < arrayList4.size()) {
                                            TLObject tLObject = (TLObject) arrayList4.get(size2);
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
                                    ir0Var2.Z0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i32 = i282 - i30;
                                if (i32 >= 0 && i32 < ir0Var3.F0.size()) {
                                    TLObject tLObject2 = ((hg.g0) ir0Var3.F0.get(i32)).a;
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
        lq0Var3.setHasFixedSize(true);
        lq0Var3.setItemAnimator(null);
        lq0Var3.setHorizontalScrollBarEnabled(false);
        lq0Var3.setVerticalScrollBarEnabled(false);
        lq0Var3.setOnScrollListener(new kq0(this, i28));
        lq0Var3.i(new ci.l(7));
        lq0Var3.setAdapter(this.N);
        org.telegram.ui.ActionBar.r6.m(lq0Var3, 21, i26, this.resourcesProvider);
        this.y0 = new rl0(lq0Var3, true);
        b10 b10Var = new b10(context, this.resourcesProvider);
        b10Var.setViewType(12);
        wx0 wx0Var = new wx0(context, b10Var, 1, this.resourcesProvider);
        this.R = wx0Var;
        wx0Var.addView(b10Var, 0);
        wx0Var.setAnimateLayoutChange(true);
        wx0Var.e(false, false);
        boolean z14 = this.i0;
        wh.n nVar = wx0Var.d;
        if (z14) {
            org.telegram.ui.ActionBar.r6.W(nVar, org.telegram.ui.ActionBar.k6.ng, this.resourcesProvider);
        }
        nVar.setText(LocaleController.getString(R.string.NoResult));
        lq0Var3.setEmptyView(wx0Var);
        lq0Var3.setHideIfEmpty(false);
        lq0Var3.W1 = true;
        lq0Var3.X1 = 0;
        this.containerView.addView(wx0Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.containerView.addView(lq0Var3, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ai.jc jcVar = new ai.jc(this, context, i27);
        this.r = jcVar;
        this.containerView.addView(jcVar, w7.z5.e(-1, 300, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp((!this.i0 || this.p0[1] == null) ? 58.0f : 111.0f);
        this.T[0] = new View(context);
        View view = this.T[0];
        int i29 = org.telegram.ui.ActionBar.k6.V5;
        org.telegram.ui.ActionBar.r6.i(i29, view, this.resourcesProvider);
        this.T[0].setAlpha(0.0f);
        this.T[0].setTag(1);
        this.containerView.addView(this.T[0], layoutParams);
        this.containerView.addView(frameLayout, w7.z5.e(-1, (!this.i0 || this.p0[1] == null) ? 58 : 111, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.T[1] = new View(context);
        org.telegram.ui.ActionBar.r6.i(i29, this.T[1], this.resourcesProvider);
        this.T[1].setLayoutParams(layoutParams2);
        if (!this.o0 && this.p0[0] == null) {
            this.T[1].setAlpha(0.0f);
            lq0Var = lq0Var3;
            f7 = 4.0f;
            f10 = 9.0f;
        } else {
            f7 = 4.0f;
            f10 = 9.0f;
            if (this.i0) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.s = frameLayout3;
                frameLayout2.addView(frameLayout3, w7.z5.d(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, w7.z5.e(-1, -1, 119));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                w7.b6.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new bq0(this, 3));
                org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
                this.v = n5Var;
                n5Var.setTextSize(15);
                org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.Tk, this.resourcesProvider);
                n5Var.setEllipsizeByGradient(true);
                f1();
                linearLayout3.addView(n5Var, w7.z5.p(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, this.resourcesProvider);
                textView.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                textView.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                int i30 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(getThemedColor(i30), 4, 4);
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i30);
                org.telegram.ui.ActionBar.g6 g6Var2 = this.resourcesProvider;
                textView.setBackground(Z);
                lq0Var = lq0Var3;
                org.telegram.ui.ActionBar.r6.k(textView, Z, null, O, g6Var2);
                linearLayout3.addView(textView, w7.z5.p(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new bq0(this, 4));
                w7.b6.a(textView);
                this.containerView.addView(frameLayout2, w7.z5.e(-1, 58, 83));
                ArrayList arrayList3 = this.O;
                if (arrayList3 != null && arrayList3.size() > 0 && ((MessageObject) this.O.get(0)).messageOwner != null && ((MessageObject) this.O.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject3 = (MessageObject) this.O.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject3.getDialogId()))) && !messageObject3.isForwarded()) {
                        final int i31 = 0;
                        linearLayout = org.telegram.messenger.sl.e(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.iq0
                            public final /* synthetic */ ir0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i31) {
                                    case 0:
                                        ir0 ir0Var = this.b;
                                        org.telegram.ui.ActionBar.o2 o2Var = ir0Var.g0;
                                        if (o2Var == null) {
                                            o2Var = LaunchActivity.U();
                                        }
                                        if (o2Var != null) {
                                            ir0Var.dismiss();
                                            o2Var.presentFragment(new org.telegram.ui.yi0(messageObject3));
                                            break;
                                        }
                                        break;
                                    default:
                                        ir0 ir0Var2 = this.b;
                                        org.telegram.ui.ActionBar.o2 o2Var2 = ir0Var2.g0;
                                        if (o2Var2 == null) {
                                            o2Var2 = LaunchActivity.U();
                                        }
                                        if (o2Var2 != null) {
                                            ir0Var2.dismiss();
                                            o2Var2.presentFragment(new org.telegram.ui.yi0(messageObject3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                        org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.k6.Z(getThemedColor(i30), 6, 6);
                        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i30);
                        org.telegram.ui.ActionBar.g6 g6Var3 = this.resourcesProvider;
                        linearLayout.setBackground(Z2);
                        org.telegram.ui.ActionBar.r6.k(linearLayout, Z2, null, O2, g6Var3);
                        w7.b6.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i32 = org.telegram.ui.ActionBar.k6.Vk;
                        org.telegram.ui.ActionBar.r6.t(imageView, i32, this.resourcesProvider, PorterDuff.Mode.SRC_IN);
                        linearLayout.addView(imageView, w7.z5.o(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.r6.W(textView2, i32, this.resourcesProvider);
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(LocaleController.formatNumber(messageObject3.messageOwner.forwards, ','));
                        linearLayout.addView(textView2, w7.z5.p(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i13 = 8;
                        linearLayout2.addView(linearLayout3, w7.z5.p(-1, 42, 1.0f, 23, 11, 0, i13, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, w7.z5.p(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                i13 = 11;
                linearLayout = null;
                linearLayout2.addView(linearLayout3, w7.z5.p(-1, 42, 1.0f, 23, 11, 0, i13, 0));
                if (linearLayout != null) {
                }
            } else {
                lq0Var = lq0Var3;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.h = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.s = frameLayout5;
                frameLayout4.addView(frameLayout5, w7.z5.d(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i33 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.Cells.y Z3 = org.telegram.ui.ActionBar.k6.Z(getThemedColor(i33), 20, 20);
                org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i33);
                org.telegram.ui.ActionBar.g6 g6Var4 = this.resourcesProvider;
                textView3.setBackground(Z3);
                org.telegram.ui.ActionBar.r6.k(textView3, Z3, null, O3, g6Var4);
                org.telegram.ui.ActionBar.r6.W(textView3, this.i0 ? org.telegram.ui.ActionBar.k6.pg : org.telegram.ui.ActionBar.k6.n5, this.resourcesProvider);
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setGravity(17);
                if (this.i0 && this.p0[1] != null) {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupCopySpeakerLinkNoCaps).toUpperCase());
                } else {
                    textView3.setText(LocaleController.getString(R.string.CopyLink).toUpperCase());
                }
                textView3.setOnClickListener(new bq0(this, 5));
                frameLayout5.addView(textView3, w7.z5.e(-1, -1, 119));
                this.containerView.addView(frameLayout4, w7.z5.e(-1, 58, 87));
                ArrayList arrayList4 = this.O;
                if (arrayList4 != null && arrayList4.size() > 0 && ((MessageObject) this.O.get(0)).messageOwner != null && ((MessageObject) this.O.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject4 = (MessageObject) this.O.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject4.getDialogId()))) && !messageObject4.isForwarded()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.y = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        org.telegram.ui.Cells.y Z4 = org.telegram.ui.ActionBar.k6.Z(getThemedColor(this.i0 ? org.telegram.ui.ActionBar.k6.eg : i33), 20, 20);
                        org.telegram.ui.ActionBar.n6 O4 = org.telegram.ui.ActionBar.r6.O(this.i0 ? org.telegram.ui.ActionBar.k6.eg : i33);
                        org.telegram.ui.ActionBar.g6 g6Var5 = this.resourcesProvider;
                        linearLayout4.setBackground(Z4);
                        org.telegram.ui.ActionBar.r6.k(linearLayout4, Z4, null, O4, g6Var5);
                        frameLayout5.addView(linearLayout4, w7.z5.e(-2, -1, 21));
                        final int i34 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.iq0
                            public final /* synthetic */ ir0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i34) {
                                    case 0:
                                        ir0 ir0Var = this.b;
                                        org.telegram.ui.ActionBar.o2 o2Var = ir0Var.g0;
                                        if (o2Var == null) {
                                            o2Var = LaunchActivity.U();
                                        }
                                        if (o2Var != null) {
                                            ir0Var.dismiss();
                                            o2Var.presentFragment(new org.telegram.ui.yi0(messageObject4));
                                            break;
                                        }
                                        break;
                                    default:
                                        ir0 ir0Var2 = this.b;
                                        org.telegram.ui.ActionBar.o2 o2Var2 = ir0Var2.g0;
                                        if (o2Var2 == null) {
                                            o2Var2 = LaunchActivity.U();
                                        }
                                        if (o2Var2 != null) {
                                            ir0Var2.dismiss();
                                            o2Var2.presentFragment(new org.telegram.ui.yi0(messageObject4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        org.telegram.ui.ActionBar.r6.t(imageView2, this.i0 ? org.telegram.ui.ActionBar.k6.pg : org.telegram.ui.ActionBar.k6.n5, this.resourcesProvider, PorterDuff.Mode.MULTIPLY);
                        linearLayout4.addView(imageView2, w7.z5.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(messageObject4.messageOwner.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.r6.W(textView4, this.i0 ? org.telegram.ui.ActionBar.k6.pg : org.telegram.ui.ActionBar.k6.n5, this.resourcesProvider);
                        textView4.setGravity(16);
                        textView4.setTypeface(AndroidUtilities.bold());
                        linearLayout4.addView(textView4, w7.z5.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.w = frameLayout6;
        this.containerView.addView(frameLayout6, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.s != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.x = frameLayout7;
        this.containerView.addView(frameLayout7, w7.z5.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        mq0 mq0Var = new mq0(this, context, 0);
        this.c = mq0Var;
        mq0Var.setWillNotDraw(false);
        mq0Var.setAlpha(0.0f);
        mq0Var.setVisibility(4);
        this.containerView.addView(mq0Var, w7.z5.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        mq0Var.setOnTouchListener(new di.d(22));
        org.telegram.ui.ActionBar.e3 e3Var = this.container;
        boolean z15 = AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.k6.h5)) > 0.721f;
        this.c1 = z15;
        AndroidUtilities.setLightNavigationBar(e3Var, z15);
        nq0 nq0Var = new nq0(this, context, tq0Var, this.resourcesProvider);
        this.d = nq0Var;
        nq0Var.J = true;
        if (this.i0) {
            iu editText = nq0Var.getEditText();
            int i35 = org.telegram.ui.ActionBar.k6.ng;
            editText.setTextColor(getThemedColor(i35));
            nq0Var.getEditText().setCursorColor(getThemedColor(i35));
        }
        nq0Var.setHint(LocaleController.getString(R.string.ShareComment));
        nq0Var.s();
        nq0Var.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
        mq0Var.addView(nq0Var, w7.z5.e(-1, -2, 51));
        mq0Var.setClipChildren(false);
        mq0Var.setClipToPadding(false);
        nq0Var.setClipChildren(false);
        nq0Var.getEditText().addTextChangedListener(new ai.u(this, 13));
        mq0 mq0Var2 = new mq0(this, context, 1);
        this.f = mq0Var2;
        mq0Var2.setFocusable(true);
        mq0Var2.setFocusableInTouchMode(true);
        mq0Var2.setVisibility(4);
        mq0Var2.setScaleX(0.2f);
        mq0Var2.setScaleY(0.2f);
        mq0Var2.setAlpha(0.0f);
        this.containerView.addView(mq0Var2, w7.z5.e(110, 50, 85));
        ki.y1 y1Var = new ki.y1(this, context, R.drawable.send_plane_24, this.resourcesProvider, 2);
        this.e = y1Var;
        int dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        y1Var.I = dp;
        y1Var.J = dp2;
        float dp3 = AndroidUtilities.dp(1.0f);
        float dp4 = AndroidUtilities.dp(6.0f);
        y1Var.M = dp3;
        y1Var.N = dp4;
        y1Var.h0 = true;
        mq0Var2.addView(y1Var, w7.z5.g());
        y1Var.setOnClickListener(new bq0(this, 6));
        y1Var.setOnLongClickListener(new u10(this, 2));
        this.k0.setTextSize(AndroidUtilities.dp(12.0f));
        this.k0.setTypeface(AndroidUtilities.bold());
        if (num != null) {
            this.c0 = num.intValue();
            FrameLayout frameLayout8 = new FrameLayout(context);
            this.d0 = frameLayout8;
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.e0 = linearLayout5;
            linearLayout5.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f7));
            linearLayout5.setClipToPadding(false);
            linearLayout5.setOrientation(0);
            int i36 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y Z5 = org.telegram.ui.ActionBar.k6.Z(getThemedColor(i36), 6, 6);
            org.telegram.ui.ActionBar.n6 O5 = org.telegram.ui.ActionBar.r6.O(i36);
            org.telegram.ui.ActionBar.g6 g6Var6 = this.resourcesProvider;
            linearLayout5.setBackground(Z5);
            org.telegram.ui.ActionBar.r6.k(linearLayout5, Z5, null, O5, g6Var6);
            xp xpVar = new xp(context, 24, this.resourcesProvider);
            this.f0 = xpVar;
            xpVar.b(org.telegram.ui.ActionBar.k6.h7, org.telegram.ui.ActionBar.k6.j7, org.telegram.ui.ActionBar.k6.k7);
            xpVar.setDrawUnchecked(true);
            xpVar.a(false, false);
            xpVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(xpVar, w7.z5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            org.telegram.ui.ActionBar.r6.W(textView5, i23, this.resourcesProvider);
            textView5.setTextSize(1, 14.0f);
            textView5.setText(LocaleController.formatString(R.string.VideoShareAddTimestamp, AndroidUtilities.formatShortDuration(num.intValue())));
            linearLayout5.addView(textView5, w7.z5.t(-2, -2, 16, 9, 0, 0, 0));
            w7.b6.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new bq0(this, 0));
            frameLayout8.addView(linearLayout5, w7.z5.e(-2, -2, 17));
            if (this.h == null) {
                View view2 = new View(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view2, this.resourcesProvider);
                frameLayout8.addView(view2, w7.z5.a(-1.0f, this.i0 ? 0.66f : 1.0f / AndroidUtilities.density, 55));
            }
            this.containerView.addView(frameLayout8, w7.z5.e(-1, 58, 83));
            if (this.h == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        bh.c cVar2 = new bh.c(this.V0.c(jcVar, null, false));
        this.Y0 = cVar2;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        cVar2.b(AndroidUtilities.dp(72.0f), true);
        dh.d c10 = this.U0.c(this.E0, fh.c.e(this.resourcesProvider), false);
        this.X0 = c10;
        c10.y = true;
        c10.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c10.u(AndroidUtilities.dp(32.0f));
        c10.v.g = 0.4f;
        c10.k();
        dh.d c11 = this.T0.c(mq0Var, fh.c.e(this.resourcesProvider), false);
        this.Z0 = c11;
        c11.q(AndroidUtilities.dp(22.0f));
        c11.p(AndroidUtilities.dp(f10));
        mq0Var.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(7.0f));
        FrameLayout frameLayout9 = this.s;
        if (frameLayout9 != null) {
            dh.d c12 = this.T0.c(frameLayout9, fh.c.e(this.resourcesProvider), false);
            c12.p(AndroidUtilities.dp(f10));
            c12.q(AndroidUtilities.dp(22.0f));
            this.s.setBackground(c12);
            this.s.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
        }
        FrameLayout frameLayout10 = this.d0;
        if (frameLayout10 != null) {
            dh.d c13 = this.T0.c(frameLayout10, fh.c.e(this.resourcesProvider), false);
            c13.p(AndroidUtilities.dp(f10));
            c13.q(AndroidUtilities.dp(22.0f));
            this.d0.setBackground(c13);
            this.d0.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
        }
        g1(0);
        org.telegram.ui.ey.g4(AccountInstance.getInstance(this.currentAccount));
        if (ar0Var.d.isEmpty()) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        }
        int i37 = this.currentAccount;
        int i38 = 0;
        MessagesStorage.getInstance(i37).getStorageQueue().postRunnable(new hg.n(i37, i38, new oq0(this), i38));
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        AndroidUtilities.updateViewVisibilityAnimated(lq0Var2, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(lq0Var, false, 1.0f, false);
        org.telegram.ui.ActionBar.e3 container = getContainer();
        cq0 cq0Var = new cq0(this, i38);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(container, cq0Var);
    }

    public void X0(View view) {
    }

    public void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
