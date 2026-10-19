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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public class er0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int b1 = 0;
    public final org.telegram.ui.ActionBar.k A0;
    public boolean B0;
    public o1.k C0;
    public TLRPC.Dialog D0;
    public AnimatorSet E;
    public final oq0 E0;
    public final im0 F;
    public ArrayList F0;
    public final gq0 G;
    public TL_stories.StoryItem G0;
    public final gq0 H;
    public i0.b H0;
    public final s4.s I;
    public int I0;
    public final s4.s J;
    public boolean J0;
    public final xz K;
    public org.telegram.ui.ActionBar.m1 K0;
    public final wq0 L;
    public int L0;
    public final br0 M;
    public boolean M0;
    public final ar0 N;
    public boolean N0;
    public final ArrayList O;
    public int O0;
    public final String[] P;
    public final bh.f P0;
    public final int Q;
    public final gh.d Q0;
    public final sx0 R;
    public final gh.d R0;
    public final Drawable S;
    public final bh.b S0;
    public final View[] T;
    public final bh.b T0;
    public final AnimatorSet[] U;
    public final bh.b U0;
    public final a0.h V;
    public final bh.l V0;
    public final HashMap W;
    public final dh.d W0;
    public final qq0 X;
    public final bh.c X0;
    public int Y;
    public final dh.d Y0;
    public boolean Z;
    public final ArrayList Z0;
    public final boolean a0;
    public final RectF a1;
    public final FrameLayout b;
    public boolean b0;
    public final hq0 c;
    public final int c0;
    public final iq0 d;
    public final FrameLayout d0;
    public final ki.y1 e;
    public final LinearLayout e0;
    public final hq0 f;
    public final xp f0;
    public final org.telegram.ui.qn g0;
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
    public final ai.ic r;
    public int r0;
    public final FrameLayout s;
    public boolean s0;
    public tq0 t0;
    public float u0;
    public final org.telegram.ui.ActionBar.j5 v;
    public float v0;
    public final FrameLayout w;
    public float w0;
    public final FrameLayout x;
    public ValueAnimator x0;
    public final LinearLayout y;
    public final nl0 y0;
    public final k20 z0;

    public er0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, d6Var);
    }

    public static void E0(er0 er0Var) {
        RectF rectF = er0Var.a1;
        bh.f fVar = er0Var.P0;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        rectF.set(0.0f, 0.0f, er0Var.containerView.getMeasuredWidth(), er0Var.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(1, er0Var.Z0);
        fVar.e(er0Var.V0, er0Var.containerView.getMeasuredWidth(), er0Var.containerView.getMeasuredHeight());
    }

    public static int J0(er0 er0Var) {
        gq0 gq0Var = er0Var.G;
        if (gq0Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = gq0Var.getChildAt(0);
        sl0 sl0Var = (sl0) gq0Var.G(childAt);
        if (sl0Var == null) {
            return -1000;
        }
        int paddingTop = gq0Var.getPaddingTop();
        if (sl0Var.c() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    public static er0 P0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        return new er0(context, messageObject != null ? org.telegram.messenger.g0.k(messageObject) : null, str, null, z10, str2, null, false);
    }

    public static /* synthetic */ void n(er0 er0Var, AtomicReference atomicReference, kq0 kq0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        kq0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, er0Var.currentAccount, Long.valueOf(-dialog.id));
    }

    public static boolean o(final er0 er0Var) {
        org.telegram.ui.qn qnVar;
        ki.y1 y1Var = er0Var.e;
        boolean z10 = er0Var.i0;
        Activity activity = er0Var.h0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(er0Var.getContext());
        linearLayout.setOrientation(1);
        if (er0Var.O != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, er0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(er0Var.getThemedColor(org.telegram.ui.ActionBar.h6.fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new lq0(er0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new xp0(er0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(1, er0Var.getContext(), er0Var.resourcesProvider, true, false);
            if (z10) {
                e1Var.setTextColor(er0Var.getThemedColor(org.telegram.ui.ActionBar.h6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.z5.n(-1, 48));
            e1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            er0Var.J0 = true;
            e1Var.setChecked(true);
            final org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(1, er0Var.getContext(), er0Var.resourcesProvider, false, true);
            if (z10) {
                e1Var2.setTextColor(er0Var.getThemedColor(org.telegram.ui.ActionBar.h6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.z5.n(-1, 48));
            e1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            e1Var2.setChecked(!er0Var.J0);
            final int i10 = 0;
            e1Var.setOnClickListener(new View.OnClickListener(er0Var) { // from class: org.telegram.ui.Components.bq0
                public final /* synthetic */ er0 b;

                {
                    this.b = er0Var;
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
            e1Var2.setOnClickListener(new View.OnClickListener(er0Var) { // from class: org.telegram.ui.Components.bq0
                public final /* synthetic */ er0 b;

                {
                    this.b = er0Var;
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
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(er0Var.getThemedColor(org.telegram.ui.ActionBar.h6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.z5.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, er0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new lq0(er0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new xp0(er0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(0, er0Var.getContext(), er0Var.resourcesProvider, true, true);
        if (z10) {
            e1Var3.setTextColor(er0Var.getThemedColor(org.telegram.ui.ActionBar.h6.ng));
            e1Var3.setIconColor(er0Var.getThemedColor(org.telegram.ui.ActionBar.h6.H6));
        }
        e1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        e1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(e1Var3, w7.z5.n(-1, 48));
        e1Var3.setOnClickListener(new wp0(er0Var, 1));
        org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(0, er0Var.getContext(), er0Var.resourcesProvider, true, true);
        if (z10) {
            e1Var4.setTextColor(er0Var.getThemedColor(org.telegram.ui.ActionBar.h6.ng));
            e1Var4.setIconColor(er0Var.getThemedColor(org.telegram.ui.ActionBar.h6.H6));
        }
        e1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        e1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(e1Var4, w7.z5.n(-1, 48));
        e1Var4.setOnClickListener(new wp0(er0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(er0Var.getThemedColor(org.telegram.ui.ActionBar.h6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.z5.n(-1, -2));
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(linearLayout, -2, -2);
        er0Var.K0 = m1Var;
        m1Var.b = false;
        m1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        er0Var.K0.setOutsideTouchable(true);
        er0Var.K0.setClippingEnabled(true);
        er0Var.K0.setInputMethodMode(2);
        er0Var.K0.setSoftInputMode(0);
        er0Var.K0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        er0Var.K0.setFocusable(true);
        int[] iArr = new int[2];
        y1Var.getLocationInWindow(iArr);
        er0Var.K0.showAtLocation(y1Var, 51, AndroidUtilities.dp(8.0f) + ((y1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!er0Var.keyboardVisible || (qnVar = er0Var.g0) == null || qnVar.X0.getMeasuredHeight() <= AndroidUtilities.dp(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f) : y1Var.getMeasuredHeight() + iArr[1]);
        er0Var.K0.b();
        try {
            y1Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void p(er0 er0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
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
        hq0 hq0Var;
        long j12;
        long j13;
        Long l4;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue;
        String[] strArr2 = er0Var.P;
        iq0 iq0Var = er0Var.d;
        hq0 hq0Var2 = er0Var.c;
        HashMap hashMap2 = er0Var.W;
        Long l10 = 0L;
        a0.h hVar = er0Var.V;
        ArrayList arrayList3 = er0Var.O;
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
                boolean isMonoForum = MessagesController.getInstance(er0Var.currentAccount).isMonoForum(j14);
                Long l11 = hashMap == null ? l10 : (Long) hashMap.get(Long.valueOf(j14));
                if (l11 != null && l11.longValue() > 0) {
                    z12 = true;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j14));
                if (tL_forumTopic2 == null || !isMonoForum) {
                    hq0Var = hq0Var2;
                    j12 = j14;
                    j13 = 0;
                } else {
                    hq0Var = hq0Var2;
                    j12 = j14;
                    j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                }
                if (tL_forumTopic2 == null || isMonoForum) {
                    l4 = l10;
                    messageObject3 = null;
                } else {
                    l4 = l10;
                    messageObject3 = new MessageObject(er0Var.currentAccount, tL_forumTopic2.topicStartMessage, false, false);
                }
                if (messageObject3 != null) {
                    messageObject3.isTopicMainMessage = true;
                }
                if (hq0Var.getTag() == null || iq0Var.a.length() <= 0) {
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
                    SendMessagesHelper.getInstance(er0Var.currentAccount).sendMessage(of3);
                }
                long j15 = j12;
                int sendMessage = SendMessagesHelper.getInstance(er0Var.currentAccount).sendMessage(er0Var.O, j15, !er0Var.J0, false, z10, 0, 0, messageObject4, i10, l11 == null ? 0L : l11.longValue(), j13, null);
                if (sendMessage != 0) {
                    arrayList4.add(Long.valueOf(j15));
                }
                if (hVar.m() == 1) {
                    tL_forumTopic = null;
                    f5.s0(sendMessage, er0Var.g0, null);
                    if (sendMessage != 0) {
                        break;
                    }
                }
                i13++;
                arrayList3 = arrayList2;
                hq0Var2 = hq0Var;
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
                er0Var.T0(hVar, arrayList2.size(), hVar.m() == 1 ? (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(0)) : tL_forumTopic, !z12);
            }
        } else {
            qq0 qq0Var = er0Var.X;
            int i15 = qq0Var != null ? qq0Var.e : 0;
            if (er0Var.G0 != null) {
                int i16 = 0;
                boolean z13 = false;
                while (i16 < hVar.m()) {
                    long j16 = hVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(er0Var.currentAccount).isMonoForum(j16);
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
                        messageObject2 = new MessageObject(er0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    }
                    if (er0Var.G0 != null) {
                        if (hq0Var2.getTag() != null && iq0Var.a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(er0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j16, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = er0Var.G0;
                    } else if (hq0Var2.getTag() == null || iq0Var.a.length() <= 0) {
                        of2 = SendMessagesHelper.SendMessageParams.of(strArr[i12], j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                    } else {
                        CharSequence charSequence2 = charSequenceArr[0];
                        of2 = SendMessagesHelper.SendMessageParams.of(charSequence2 == null ? null : charSequence2.toString(), j16, messageObject2, messageObject2, null, true, arrayList, null, null, z10, 0, 0, null, false);
                    }
                    of2.payStars = l12 == null ? 0L : l12.longValue();
                    of2.monoForumPeer = j11;
                    SendMessagesHelper.getInstance(er0Var.currentAccount).sendMessage(of2);
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
                        boolean isMonoForum3 = MessagesController.getInstance(er0Var.currentAccount).isMonoForum(j17);
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
                            messageObject = new MessageObject(er0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                        }
                        if (hq0Var2.getTag() == null || iq0Var.a.length() <= 0) {
                            j10 = j17;
                        } else {
                            CharSequence charSequence3 = charSequenceArr[c10];
                            SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(charSequence3 == null ? null : charSequence3.toString(), j17, messageObject, messageObject, null, true, arrayList, null, null, z10, 0, 0, null, false);
                            j10 = j17;
                            of4.payStars = l13 == null ? 0L : l13.longValue();
                            of4.monoForumPeer = peerDialogId;
                            SendMessagesHelper.getInstance(er0Var.currentAccount).sendMessage(of4);
                        }
                        SendMessagesHelper.SendMessageParams of5 = SendMessagesHelper.SendMessageParams.of(strArr2[i17], j10, messageObject, messageObject, null, true, null, null, null, z10, 0, 0, null, false);
                        of5.payStars = l13 == null ? 0L : l13.longValue();
                        of5.monoForumPeer = peerDialogId;
                        SendMessagesHelper.getInstance(er0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z14;
                } else {
                    i11 = 0;
                    z11 = false;
                    er0Var.T0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i11)), !z11);
                }
            }
            i11 = 0;
            er0Var.T0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i11)), !z11);
        }
        tq0 tq0Var = er0Var.t0;
        if (tq0Var != null) {
            tq0Var.H();
        }
        er0Var.dismiss();
    }

    public static void q(er0 er0Var, int i10) {
        TLRPC.Dialog dialog;
        k20 k20Var = er0Var.z0;
        HashMap hashMap = er0Var.W;
        a0.h hVar = er0Var.V;
        wq0 wq0Var = er0Var.L;
        br0 br0Var = er0Var.M;
        if (br0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = er0Var.D0;
            if (dialog2 == null) {
                return;
            }
            hVar.k(dialog2, dialog2.id);
            hashMap.remove(dialog2);
            er0Var.c1(2);
            if (er0Var.M0 || er0Var.N0) {
                if (((TLRPC.Dialog) wq0Var.e.f(dialog2.id)) == null) {
                    wq0Var.e.k(dialog2, dialog2.id);
                    ArrayList arrayList = wq0Var.d;
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                wq0Var.l();
                er0Var.B0 = false;
                k20Var.r.setText("");
                er0Var.M0(false);
            }
            for (int i11 = 0; i11 < er0Var.R0().getChildCount(); i11++) {
                View childAt = er0Var.R0().getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.e7) {
                    org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) childAt;
                    if (e7Var.getCurrentDialog() == er0Var.D0.id) {
                        e7Var.d(null, false, true);
                        e7Var.b(true, true);
                    }
                }
            }
            er0Var.N0();
            return;
        }
        TLRPC.TL_forumTopic E = br0Var.E(i10);
        if (E == null || (dialog = er0Var.D0) == null) {
            return;
        }
        long j10 = dialog.id;
        boolean isMonoForum = MessagesController.getInstance(er0Var.currentAccount).isMonoForum(j10);
        TLRPC.Dialog dialog3 = er0Var.D0;
        hVar.k(dialog3, j10);
        hashMap.put(dialog3, E);
        er0Var.c1(2);
        if (er0Var.M0 || er0Var.N0) {
            if (((TLRPC.Dialog) wq0Var.e.f(dialog3.id)) == null) {
                wq0Var.e.k(dialog3, dialog3.id);
                ArrayList arrayList2 = wq0Var.d;
                arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
            }
            wq0Var.l();
            er0Var.B0 = false;
            k20Var.r.setText("");
            er0Var.M0(false);
        }
        for (int i12 = 0; i12 < er0Var.R0().getChildCount(); i12++) {
            View childAt2 = er0Var.R0().getChildAt(i12);
            if (childAt2 instanceof org.telegram.ui.Cells.e7) {
                org.telegram.ui.Cells.e7 e7Var2 = (org.telegram.ui.Cells.e7) childAt2;
                if (e7Var2.getCurrentDialog() == er0Var.D0.id) {
                    e7Var2.d(E, isMonoForum, true);
                    e7Var2.b(true, true);
                }
            }
        }
        er0Var.N0();
    }

    public static void v0(er0 er0Var) {
        gq0 gq0Var = er0Var.G;
        gq0 gq0Var2 = er0Var.H;
        im0 im0Var = er0Var.F;
        if (er0Var.s0) {
            return;
        }
        gq0 gq0Var3 = er0Var.M0 ? gq0Var2 : gq0Var;
        if (gq0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = gq0Var3.getChildAt(0);
        for (int i10 = 0; i10 < gq0Var3.getChildCount(); i10++) {
            if (gq0Var3.getChildAt(i10).getTop() < childAt.getTop()) {
                childAt = gq0Var3.getChildAt(i10);
            }
        }
        sl0 sl0Var = (sl0) gq0Var3.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i11 = (top <= 0 || sl0Var == null || sl0Var.b() != 0) ? 0 : top;
        if (top < 0 || sl0Var == null || sl0Var.b() != 0) {
            er0Var.L0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            er0Var.V0(true);
            top = i11;
        } else {
            er0Var.L0 = childAt.getTop();
            er0Var.V0(false);
        }
        if (im0Var.getVisibility() == 0) {
            if (im0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = im0Var.getChildAt(0);
            for (int i12 = 0; i12 < im0Var.getChildCount(); i12++) {
                if (im0Var.getChildAt(i12).getTop() < childAt2.getTop()) {
                    childAt2 = im0Var.getChildAt(i12);
                }
            }
            sl0 sl0Var2 = (sl0) im0Var.G(childAt2);
            int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
            int i13 = (top2 <= 0 || sl0Var2 == null || sl0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || sl0Var2 == null || sl0Var2.b() != 0) {
                er0Var.L0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                er0Var.V0(true);
                top2 = i13;
            } else {
                er0Var.L0 = childAt2.getTop();
                er0Var.V0(false);
            }
            top = AndroidUtilities.lerp(top, top2, im0Var.getAlpha());
        }
        int i14 = er0Var.q0;
        if (i14 != top) {
            er0Var.r0 = i14;
            float f7 = top;
            int i15 = (int) (er0Var.u0 + f7);
            er0Var.q0 = i15;
            gq0Var.setTopGlowOffset(i15);
            int i16 = (int) (er0Var.u0 + f7);
            er0Var.q0 = i16;
            gq0Var2.setTopGlowOffset(i16);
            int i17 = (int) (f7 + er0Var.u0);
            er0Var.q0 = i17;
            im0Var.setTopGlowOffset(i17);
            er0Var.b.setTranslationY(er0Var.q0 + er0Var.u0);
            er0Var.R.setTranslationY(er0Var.q0 + er0Var.u0);
            er0Var.containerView.invalidate();
        }
    }

    public final void M0(boolean z10) {
        k20 k20Var = this.z0;
        ei.e2 e2Var = k20Var.r;
        ei.e2 e2Var2 = k20Var.r;
        boolean isEmpty = TextUtils.isEmpty(e2Var.getText());
        gq0 gq0Var = this.G;
        gq0 gq0Var2 = this.H;
        boolean z11 = true;
        if (!isEmpty || ((this.keyboardVisible && e2Var2.hasFocus()) || this.N0)) {
            this.B0 = true;
            if (this.D0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(gq0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(gq0Var2, true);
            }
        } else {
            if (this.D0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(gq0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(gq0Var2, false);
            }
            z11 = false;
        }
        if (this.M0 != z11 || z10) {
            this.M0 = z11;
            ar0 ar0Var = this.N;
            ar0Var.l();
            this.L.l();
            if (this.M0) {
                if (this.L0 == Integer.MAX_VALUE) {
                    ((s4.b0) gq0Var2.getLayoutManager()).h1(0, -gq0Var2.getPaddingTop());
                } else {
                    ((s4.b0) gq0Var2.getLayoutManager()).h1(0, this.L0 - gq0Var2.getPaddingTop());
                }
                ar0Var.E(e2Var2.getText().toString());
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

    public final void N0() {
        TLRPC.Dialog dialog = this.D0;
        if (dialog == null) {
            return;
        }
        View view = null;
        this.D0 = null;
        for (int i10 = 0; i10 < R0().getChildCount(); i10++) {
            View childAt = R0().getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.e7) && ((org.telegram.ui.Cells.e7) childAt).getCurrentDialog() == dialog.id) {
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
        R0().setVisibility(0);
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
        org.telegram.ui.qn qnVar = this.g0;
        lVar.b((qnVar == null || !qnVar.b) ? 800.0f : 10.0f);
        lVar.a(1.0f);
        kVar2.u = lVar;
        this.C0 = kVar2;
        kVar2.b(new vp0(this, (org.telegram.ui.Cells.e7) view, iArr, 0));
        this.C0.a(new hb(this, 5));
        this.C0.h();
    }

    public final void O0() {
        boolean z10 = false;
        if (this.l0 == null && this.p0[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", Q0()));
            tq0 tq0Var = this.t0;
            if (tq0Var != null) {
                tq0Var.g0();
                return;
            }
            if (this.h0 instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.l0;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z10 = true;
                }
                ((LaunchActivity) this.h0).H0(new i2.y(5, z10));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final String Q0() {
        String str;
        String[] strArr = this.p0;
        qq0 qq0Var = this.X;
        if (qq0Var != null) {
            str = strArr[qq0Var.e];
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

    public final im0 R0() {
        return (this.M0 || this.N0) ? this.H : this.G;
    }

    public final void S0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        im0 im0Var = this.F;
        im0Var.setPivotX(width);
        im0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        im0Var.setScaleX(f11);
        im0Var.setScaleY(f11);
        im0Var.setAlpha(f7);
        im0 R0 = R0();
        R0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        R0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        R0.setScaleX(f12);
        R0.setScaleY(f12);
        float f13 = 1.0f - f7;
        R0.setAlpha(f13);
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
        im0Var.getLocationInWindow(iArr);
        float interpolation = bs.g.getInterpolation(f7);
        for (int i10 = 0; i10 < R0.getChildCount(); i10++) {
            View childAt = R0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.e7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f7, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f13);
                }
            }
        }
        for (int i11 = 0; i11 < im0Var.getChildCount(); i11++) {
            View childAt2 = im0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.f7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((im0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        R0.invalidate();
    }

    public final void V0(boolean z10) {
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
        animatorSetArr[0].addListener(new mq0(this, z10, 0));
        animatorSetArr[0].start();
    }

    public final void W0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        er0 er0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        zq0 zq0Var;
        if (dialog instanceof vq0) {
            U0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.e7) && ((org.telegram.ui.Cells.e7) view).F) || ((view instanceof org.telegram.ui.Cells.h6) && ((org.telegram.ui.Cells.h6) view).n0)) {
            Z0(dialog.id, view);
            return;
        }
        im0 im0Var = this.F;
        if (im0Var.getVisibility() != 8 || (activity = this.h0) == null) {
            return;
        }
        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
        int i10 = this.Q;
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
                } else if (this.o0) {
                    b2Var.T = LocaleController.getString(R.string.PublicPollCantForward);
                } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                    b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                } else {
                    b2Var.T = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                }
                i2.e.r(R.string.OK, alertDialog$Builder, null);
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
            i2.e.r(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        long j10 = dialog.id;
        a0.h hVar = this.V;
        if (hVar.h(j10) >= 0) {
            hVar.l(dialog.id);
            this.W.remove(dialog);
            if (view instanceof org.telegram.ui.Cells.h6) {
                ((org.telegram.ui.Cells.h6) view).t(false, true);
            } else if (view instanceof org.telegram.ui.Cells.e7) {
                ((org.telegram.ui.Cells.e7) view).b(false, true);
            }
            c1(1);
            er0Var = this;
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if ((UserObject.isBotForum(user) && !(((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id))) || (DialogObject.isChatDialog(dialog.id) && (ChatObject.isForum(chat2) || (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                this.D0 = dialog;
                this.J.h1(0, this.q0 - im0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                kq0 kq0Var = new kq0(this, dialog, atomicReference, view);
                atomicReference.set(new i90(this, atomicReference, kq0Var, dialog, 5));
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i11 = NotificationCenter.topicsDidLoaded;
                notificationCenter.addObserver(kq0Var, i11);
                if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.id) != null) {
                    kq0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.id));
                    return;
                } else {
                    MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.id);
                    AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            er0Var = this;
            hVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.h6) {
                ((org.telegram.ui.Cells.h6) view).t(true, true);
            } else if (view instanceof org.telegram.ui.Cells.e7) {
                ((org.telegram.ui.Cells.e7) view).b(true, true);
            }
            c1(2);
            long j11 = UserConfig.getInstance(er0Var.currentAccount).clientUserId;
            if (er0Var.M0) {
                wq0 wq0Var = er0Var.L;
                a0.h hVar2 = wq0Var.e;
                ArrayList arrayList = wq0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.id);
                if (dialog2 == null) {
                    wq0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j11) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                wq0Var.l();
                er0Var.B0 = false;
                k20 k20Var = er0Var.z0;
                k20Var.r.setText("");
                M0(false);
                AndroidUtilities.hideKeyboard(k20Var.r);
            }
        }
        ar0 ar0Var = er0Var.N;
        if (ar0Var == null || (zq0Var = ar0Var.H) == null) {
            return;
        }
        zq0Var.q(0, zq0Var.h());
    }

    public final void X0(final boolean z10) {
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            a0.h hVar = this.V;
            int m10 = hVar.m();
            hq0 hq0Var = this.c;
            iq0 iq0Var = this.d;
            if (i12 >= m10) {
                Editable text = iq0Var.getText();
                lu luVar = iq0Var.a;
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
                        if (hq0Var.getTag() != null && luVar.length() > 0 && sendPaidMessagesStars > 0) {
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
                    qq0 qq0Var = this.X;
                    int i14 = qq0Var != null ? qq0Var.e : 0;
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
                            if (this.G0 != null && hq0Var.getTag() != null && luVar.length() > 0 && charSequenceArr[i17] != null && sendPaidMessagesStars2 > 0) {
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
                                if (hq0Var.getTag() != null && luVar.length() > 0 && sendPaidMessagesStars3 > 0) {
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
                f5.b0(this.currentAccount, arrayList, i10, new Utilities.Callback() { // from class: org.telegram.ui.Components.cq0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        er0.p(er0.this, charSequenceArr, entities, z10, i20, (HashMap) obj);
                    }
                });
                return;
            }
            if (f5.g(getContext(), this.currentAccount, hVar.j(i12), hq0Var.getTag() != null && iq0Var.a.length() > 0)) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void Y0(boolean z10) {
        hq0 hq0Var = this.c;
        if (z10 == (hq0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        hq0Var.setTag(z10 ? 1 : null);
        iq0 iq0Var = this.d;
        if (iq0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(iq0Var.getEditText());
        }
        iq0Var.k(true);
        FrameLayout frameLayout = this.d0;
        hq0 hq0Var2 = this.f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            hq0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            hq0Var2.setVisibility(0);
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
        arrayList.add(ObjectAnimator.ofFloat(hq0Var, (Property<hq0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(hq0Var2, (Property<hq0, Float>) View.SCALE_X, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(hq0Var2, (Property<hq0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(hq0Var2, (Property<hq0, Float>) property, z10 ? 1.0f : 0.0f));
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
        this.E.addListener(new mq0(this, z10, 1));
        this.E.start();
    }

    public final void Z0(long j10, View view) {
        int i10 = -this.I0;
        this.I0 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j10 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10))) : "";
        boolean premiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
        int i11 = 1;
        FrameLayout frameLayout = this.w;
        (premiumFeaturesBlocked ? new xc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : new xc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new yp0(this, i11))).j();
    }

    public final void a1() {
        org.telegram.ui.ActionBar.o1 o1Var;
        hq0 hq0Var = this.c;
        if (hq0Var == null) {
            return;
        }
        iq0 iq0Var = this.d;
        if (iq0Var == null || !iq0Var.m()) {
            oq0 oq0Var = this.E0;
            if (oq0Var != null && (o1Var = oq0Var.H) != null && !o1Var.f) {
                AndroidUtilities.dp(20.0f);
            }
        } else {
            iq0Var.getEmojiPaddingShown();
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
        hq0Var.setTranslationY(f10);
        this.f.setTranslationY(f10);
    }

    public final void b1() {
        org.telegram.ui.ActionBar.j5 j5Var = this.v;
        if (j5Var != null) {
            String Q0 = Q0();
            if (Q0.startsWith("https://")) {
                Q0 = Q0.substring(8);
            } else if (Q0.startsWith("http://")) {
                Q0 = Q0.substring(7);
            }
            j5Var.k(Q0);
        }
    }

    public final void c1(int i10) {
        a0.h hVar = this.V;
        if (hVar.m() == 0) {
            Y0(false);
            return;
        }
        ArrayList arrayList = this.O;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.c.getTag();
        iq0 iq0Var = this.d;
        if (tag != null && iq0Var.a.length() > 0) {
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
        Y0(true);
        iq0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), y1Var.l()), 0);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            wq0 wq0Var = this.L;
            if (wq0Var != null) {
                wq0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        iq0 iq0Var = this.d;
        if (iq0Var != null) {
            AndroidUtilities.hideKeyboard(iq0Var.getEditText());
        }
        this.Z = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public void dismissInternal() {
        super.dismissInternal();
        iq0 iq0Var = this.d;
        if (iq0Var != null) {
            iq0Var.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.Y;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        if (this.D0 != null) {
            N0();
            return;
        }
        iq0 iq0Var = this.d;
        if (iq0Var == null || !iq0Var.e) {
            super.onBackPressed();
        } else {
            iq0Var.k(true);
        }
    }

    public er0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0818  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public er0(Context context, org.telegram.ui.qn qnVar, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, Integer num, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, true);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        gq0 gq0Var;
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
        this.Z0 = arrayList2;
        RectF rectF = new RectF();
        this.a1 = rectF;
        arrayList2.add(rectF);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        gh.c cVar = new gh.c();
        int i17 = org.telegram.ui.ActionBar.h6.d6;
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
            this.S0 = bVar;
            bVar.i = LiteMode.isEnabled(262144);
            bh.b bVar2 = new bh.b(dVar2);
            this.T0 = bVar2;
            bVar2.i = LiteMode.isEnabled(262144);
        } else {
            i12 = 0;
            this.P0 = null;
            this.Q0 = null;
            this.R0 = null;
            this.S0 = new bh.b(cVar);
            this.T0 = new bh.b(cVar);
        }
        this.U0 = new bh.b(cVar);
        this.resourcesProvider = d6Var;
        this.a0 = z13;
        this.h0 = AndroidUtilities.findActivity(context);
        this.i0 = z12;
        if (z12) {
            this.resourcesProvider = new ci.k0(i14);
        }
        cVar.a(getThemedColor(i17));
        this.g0 = qnVar;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.S = mutate;
        int i18 = org.telegram.ui.ActionBar.h6.h5;
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
        this.N = new ar0(this, context);
        this.o0 = z10;
        strArr[0] = str;
        strArr[1] = str2;
        this.useSmoothKeyboard = true;
        setDelegate(new org.telegram.ui.j0(this, i14));
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
        oq0 oq0Var = new oq0(this, context);
        this.E0 = oq0Var;
        this.containerView = oq0Var;
        bh.b bVar3 = this.S0;
        ih.j jVar = new ih.j(this.containerView);
        ViewGroup viewGroup = this.containerView;
        bVar3.f = jVar;
        bVar3.g = viewGroup;
        bh.b bVar4 = this.T0;
        ih.j jVar2 = new ih.j(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        bVar4.f = jVar2;
        bVar4.g = viewGroup2;
        bh.b bVar5 = this.U0;
        ih.j jVar3 = new ih.j(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        bVar5.f = jVar3;
        bVar5.g = viewGroup3;
        viewGroup3.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup4 = this.containerView;
        int i22 = this.backgroundPaddingLeft;
        viewGroup4.setPadding(i22, 0, i22, this.H0.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(new pq0(this));
        if (this.i0 && this.p0[1] != null) {
            qq0 qq0Var = new qq0(this, context);
            this.X = qq0Var;
            frameLayout.addView(qq0Var, w7.z5.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        k20 k20Var = new k20(context, this.resourcesProvider);
        this.z0 = k20Var;
        rq0 rq0Var = new rq0(this);
        ei.e2 e2Var = k20Var.r;
        e2Var.addTextChangedListener(rq0Var);
        e2Var.setHint(LocaleController.getString(R.string.ShareSendTo));
        int i23 = 7;
        e2Var.setOnEditorActionListener(new e1(this, i23));
        k20Var.setCloseButtonOnClickListener(new yp0(this, 0));
        frameLayout.addView(k20Var, w7.z5.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.A0 = kVar;
        kVar.setOccupyStatusBar(false);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i24 = org.telegram.ui.ActionBar.h6.j5;
        kVar.setTitleColor(getThemedColor(i24));
        kVar.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.h6.q5));
        kVar.C(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.z6, false), false);
        kVar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.u8, false), false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 15));
        kVar.setVisibility(8);
        frameLayout.addView(kVar, w7.z5.e(-1, 58, 83));
        im0 im0Var = new im0(context, this.resourcesProvider);
        this.F = im0Var;
        s4.s sVar = new s4.s(4);
        this.J = sVar;
        im0Var.setLayoutManager(sVar);
        final int i25 = 0;
        sVar.O = new eq0(this, i25);
        im0Var.setOnScrollListener(new fq0(this, i25));
        br0 br0Var = new br0(this, context);
        this.M = br0Var;
        im0Var.setAdapter(br0Var);
        int i26 = org.telegram.ui.ActionBar.h6.A5;
        im0Var.setGlowColor(getThemedColor(i26));
        im0Var.setVerticalScrollBarEnabled(false);
        im0Var.setHorizontalScrollBarEnabled(false);
        im0Var.setOverScrollMode(2);
        im0Var.setSelectorDrawableColor(0);
        im0Var.setItemSelectorColorProvider(new tg0(i23));
        im0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        im0Var.setClipToPadding(false);
        im0Var.i(new ci.l(5));
        im0Var.setOnItemClickListener(new wl0(this) { // from class: org.telegram.ui.Components.zp0
            public final /* synthetic */ er0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.wl0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(int i27, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i25) {
                    case 0:
                        er0.q(this.b, i27);
                        break;
                    case 1:
                        if (i27 >= 0) {
                            er0 er0Var = this.b;
                            ArrayList arrayList3 = er0Var.L.d;
                            int i28 = i27 - 1;
                            TLRPC.Dialog dialog = (i28 < 0 || i28 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i28);
                            if (dialog != null) {
                                er0Var.W0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i27 >= 0) {
                            er0 er0Var2 = this.b;
                            ar0 ar0Var = er0Var2.N;
                            er0 er0Var3 = ar0Var.K;
                            int i29 = ar0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i27 < i29 || i29 < 0) {
                                int i30 = i27 - 1;
                                if (i30 >= 0) {
                                    if (i30 < ar0Var.d.size()) {
                                        tL_dialog2 = ((sq0) ar0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - ar0Var.d.size();
                                        ArrayList arrayList4 = ar0Var.e.d;
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
                                    er0Var2.W0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i31 = i27 - i29;
                                if (i31 >= 0 && i31 < er0Var3.F0.size()) {
                                    TLObject tLObject2 = ((hg.g0) er0Var3.F0.get(i31)).a;
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
        im0Var.setVisibility(8);
        this.containerView.addView(im0Var, w7.z5.e(-1, -1, 51));
        gq0 gq0Var2 = new gq0(this, context, this.resourcesProvider, i25);
        this.G = gq0Var2;
        gq0Var2.setSelectorDrawableColor(0);
        gq0Var2.setItemSelectorColorProvider(new tg0(i23));
        gq0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        gq0Var2.setClipToPadding(false);
        getContext();
        s4.s sVar2 = new s4.s(4);
        this.I = sVar2;
        gq0Var2.setLayoutManager(sVar2);
        this.V0 = new bh.l(gq0Var2, this.containerView, new aq0(gq0Var2, i25));
        sVar2.O = new eq0(this, i14);
        gq0Var2.setHorizontalScrollBarEnabled(false);
        gq0Var2.setVerticalScrollBarEnabled(false);
        gq0Var2.setOverScrollMode(2);
        gq0Var2.i(new ci.l(6));
        this.containerView.addView(gq0Var2, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        wq0 wq0Var = new wq0(this, context);
        this.L = wq0Var;
        gq0Var2.setAdapter(wq0Var);
        gq0Var2.setGlowColor(getThemedColor(i26));
        gq0Var2.setOnItemClickListener(new wl0(this) { // from class: org.telegram.ui.Components.zp0
            public final /* synthetic */ er0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.wl0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(int i27, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i14) {
                    case 0:
                        er0.q(this.b, i27);
                        break;
                    case 1:
                        if (i27 >= 0) {
                            er0 er0Var = this.b;
                            ArrayList arrayList3 = er0Var.L.d;
                            int i28 = i27 - 1;
                            TLRPC.Dialog dialog = (i28 < 0 || i28 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i28);
                            if (dialog != null) {
                                er0Var.W0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i27 >= 0) {
                            er0 er0Var2 = this.b;
                            ar0 ar0Var = er0Var2.N;
                            er0 er0Var3 = ar0Var.K;
                            int i29 = ar0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i27 < i29 || i29 < 0) {
                                int i30 = i27 - 1;
                                if (i30 >= 0) {
                                    if (i30 < ar0Var.d.size()) {
                                        tL_dialog2 = ((sq0) ar0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - ar0Var.d.size();
                                        ArrayList arrayList4 = ar0Var.e.d;
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
                                    er0Var2.W0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i31 = i27 - i29;
                                if (i31 >= 0 && i31 < er0Var3.F0.size()) {
                                    TLObject tLObject2 = ((hg.g0) er0Var3.F0.get(i31)).a;
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
        gq0Var2.setOnScrollListener(new fq0(this, i14));
        gq0 gq0Var3 = new gq0(this, context, this.resourcesProvider, i14);
        this.H = gq0Var3;
        gq0Var3.setItemSelectorColorProvider(new tg0(i23));
        gq0Var3.setSelectorDrawableColor(0);
        gq0Var3.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        gq0Var3.setClipToPadding(false);
        getContext();
        xz xzVar = new xz(4, 0, gq0Var3);
        this.K = xzVar;
        gq0Var3.setLayoutManager(xzVar);
        final int i27 = 2;
        xzVar.O = new eq0(this, i27);
        gq0Var3.setOnItemClickListener(new wl0(this) { // from class: org.telegram.ui.Components.zp0
            public final /* synthetic */ er0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.wl0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(int i272, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i27) {
                    case 0:
                        er0.q(this.b, i272);
                        break;
                    case 1:
                        if (i272 >= 0) {
                            er0 er0Var = this.b;
                            ArrayList arrayList3 = er0Var.L.d;
                            int i28 = i272 - 1;
                            TLRPC.Dialog dialog = (i28 < 0 || i28 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i28);
                            if (dialog != null) {
                                er0Var.W0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i272 >= 0) {
                            er0 er0Var2 = this.b;
                            ar0 ar0Var = er0Var2.N;
                            er0 er0Var3 = ar0Var.K;
                            int i29 = ar0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i272 < i29 || i29 < 0) {
                                int i30 = i272 - 1;
                                if (i30 >= 0) {
                                    if (i30 < ar0Var.d.size()) {
                                        tL_dialog2 = ((sq0) ar0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - ar0Var.d.size();
                                        ArrayList arrayList4 = ar0Var.e.d;
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
                                    er0Var2.W0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i31 = i272 - i29;
                                if (i31 >= 0 && i31 < er0Var3.F0.size()) {
                                    TLObject tLObject2 = ((hg.g0) er0Var3.F0.get(i31)).a;
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
        gq0Var3.setHasFixedSize(true);
        gq0Var3.setItemAnimator(null);
        gq0Var3.setHorizontalScrollBarEnabled(false);
        gq0Var3.setVerticalScrollBarEnabled(false);
        gq0Var3.setOnScrollListener(new fq0(this, i27));
        gq0Var3.i(new ci.l(i23));
        gq0Var3.setAdapter(this.N);
        gq0Var3.setGlowColor(getThemedColor(i26));
        this.y0 = new nl0(gq0Var3, true);
        b10 b10Var = new b10(context, this.resourcesProvider);
        b10Var.setViewType(12);
        sx0 sx0Var = new sx0(context, b10Var, 1, this.resourcesProvider);
        this.R = sx0Var;
        sx0Var.addView(b10Var, 0);
        sx0Var.setAnimateLayoutChange(true);
        sx0Var.e(false, false);
        boolean z14 = this.i0;
        wh.n nVar = sx0Var.d;
        if (z14) {
            nVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.ng));
        }
        nVar.setText(LocaleController.getString(R.string.NoResult));
        gq0Var3.setEmptyView(sx0Var);
        gq0Var3.setHideIfEmpty(false);
        gq0Var3.W1 = true;
        gq0Var3.X1 = 0;
        this.containerView.addView(sx0Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.containerView.addView(gq0Var3, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ai.ic icVar = new ai.ic(this, context, 22);
        this.r = icVar;
        this.containerView.addView(icVar, w7.z5.e(-1, 300, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp((!this.i0 || this.p0[1] == null) ? 58.0f : 111.0f);
        this.T[0] = new View(context);
        View view = this.T[0];
        int i28 = org.telegram.ui.ActionBar.h6.V5;
        view.setBackgroundColor(getThemedColor(i28));
        this.T[0].setAlpha(0.0f);
        this.T[0].setTag(1);
        this.containerView.addView(this.T[0], layoutParams);
        this.containerView.addView(frameLayout, w7.z5.e(-1, (!this.i0 || this.p0[1] == null) ? 58 : 111, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.T[1] = new View(context);
        this.T[1].setBackgroundColor(getThemedColor(i28));
        this.T[1].setLayoutParams(layoutParams2);
        if (!this.o0 && this.p0[0] == null) {
            this.T[1].setAlpha(0.0f);
            gq0Var = gq0Var3;
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
                linearLayout3.setOnClickListener(new wp0(this, 3));
                org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
                this.v = j5Var;
                j5Var.setTextSize(15);
                j5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Tk));
                j5Var.setEllipsizeByGradient(true);
                b1();
                linearLayout3.addView(j5Var, w7.z5.p(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                textView.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                textView.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                int i29 = org.telegram.ui.ActionBar.h6.i6;
                textView.setBackground(org.telegram.ui.ActionBar.h6.Z(getThemedColor(i29), 4, 4));
                linearLayout3.addView(textView, w7.z5.p(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new wp0(this, 4));
                w7.b6.a(textView);
                gq0Var = gq0Var3;
                this.containerView.addView(frameLayout2, w7.z5.e(-1, 58, 83));
                ArrayList arrayList3 = this.O;
                if (arrayList3 != null && arrayList3.size() > 0 && ((MessageObject) this.O.get(0)).messageOwner != null && ((MessageObject) this.O.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject3 = (MessageObject) this.O.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject3.getDialogId()))) && !messageObject3.isForwarded()) {
                        final int i30 = 0;
                        linearLayout = org.telegram.messenger.kk.e(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dq0
                            public final /* synthetic */ er0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i30) {
                                    case 0:
                                        er0 er0Var = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var = er0Var.g0;
                                        if (n2Var == null) {
                                            n2Var = LaunchActivity.U();
                                        }
                                        if (n2Var != null) {
                                            er0Var.dismiss();
                                            n2Var.presentFragment(new org.telegram.ui.ui0(messageObject3));
                                            break;
                                        }
                                        break;
                                    default:
                                        er0 er0Var2 = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var2 = er0Var2.g0;
                                        if (n2Var2 == null) {
                                            n2Var2 = LaunchActivity.U();
                                        }
                                        if (n2Var2 != null) {
                                            er0Var2.dismiss();
                                            n2Var2.presentFragment(new org.telegram.ui.ui0(messageObject3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                        linearLayout.setBackground(org.telegram.ui.ActionBar.h6.Z(getThemedColor(i29), 6, 6));
                        w7.b6.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i31 = org.telegram.ui.ActionBar.h6.Vk;
                        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i31), PorterDuff.Mode.SRC_IN));
                        linearLayout.addView(imageView, w7.z5.o(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        textView2.setTextColor(getThemedColor(i31));
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
                gq0Var = gq0Var3;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.h = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.s = frameLayout5;
                frameLayout4.addView(frameLayout5, w7.z5.d(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i32 = org.telegram.ui.ActionBar.h6.i6;
                textView3.setBackground(org.telegram.ui.ActionBar.h6.Z(getThemedColor(i32), 20, 20));
                textView3.setTextColor(getThemedColor(this.i0 ? org.telegram.ui.ActionBar.h6.pg : org.telegram.ui.ActionBar.h6.n5));
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setGravity(17);
                if (this.i0 && this.p0[1] != null) {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupCopySpeakerLinkNoCaps).toUpperCase());
                } else {
                    textView3.setText(LocaleController.getString(R.string.CopyLink).toUpperCase());
                }
                textView3.setOnClickListener(new wp0(this, 5));
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
                        linearLayout4.setBackground(org.telegram.ui.ActionBar.h6.Z(getThemedColor(this.i0 ? org.telegram.ui.ActionBar.h6.eg : i32), 20, 20));
                        frameLayout5.addView(linearLayout4, w7.z5.e(-2, -1, 21));
                        final int i33 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dq0
                            public final /* synthetic */ er0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i33) {
                                    case 0:
                                        er0 er0Var = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var = er0Var.g0;
                                        if (n2Var == null) {
                                            n2Var = LaunchActivity.U();
                                        }
                                        if (n2Var != null) {
                                            er0Var.dismiss();
                                            n2Var.presentFragment(new org.telegram.ui.ui0(messageObject4));
                                            break;
                                        }
                                        break;
                                    default:
                                        er0 er0Var2 = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var2 = er0Var2.g0;
                                        if (n2Var2 == null) {
                                            n2Var2 = LaunchActivity.U();
                                        }
                                        if (n2Var2 != null) {
                                            er0Var2.dismiss();
                                            n2Var2.presentFragment(new org.telegram.ui.ui0(messageObject4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(this.i0 ? org.telegram.ui.ActionBar.h6.pg : org.telegram.ui.ActionBar.h6.n5), PorterDuff.Mode.MULTIPLY));
                        linearLayout4.addView(imageView2, w7.z5.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(messageObject4.messageOwner.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTextColor(getThemedColor(this.i0 ? org.telegram.ui.ActionBar.h6.pg : org.telegram.ui.ActionBar.h6.n5));
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
        hq0 hq0Var = new hq0(this, context, 0);
        this.c = hq0Var;
        hq0Var.setWillNotDraw(false);
        hq0Var.setAlpha(0.0f);
        hq0Var.setVisibility(4);
        this.containerView.addView(hq0Var, w7.z5.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        hq0Var.setOnTouchListener(new di.d(22));
        AndroidUtilities.setLightNavigationBar(this.container, AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.h6.h5)) > 0.721f);
        iq0 iq0Var = new iq0(this, context, oq0Var, this.resourcesProvider);
        this.d = iq0Var;
        iq0Var.J = true;
        if (this.i0) {
            iu editText = iq0Var.getEditText();
            int i34 = org.telegram.ui.ActionBar.h6.ng;
            editText.setTextColor(getThemedColor(i34));
            iq0Var.getEditText().setCursorColor(getThemedColor(i34));
        }
        iq0Var.setHint(LocaleController.getString(R.string.ShareComment));
        iq0Var.s();
        iq0Var.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
        hq0Var.addView(iq0Var, w7.z5.e(-1, -2, 51));
        hq0Var.setClipChildren(false);
        hq0Var.setClipToPadding(false);
        iq0Var.setClipChildren(false);
        iq0Var.getEditText().addTextChangedListener(new ai.u(this, 13));
        hq0 hq0Var2 = new hq0(this, context, 1);
        this.f = hq0Var2;
        hq0Var2.setFocusable(true);
        hq0Var2.setFocusableInTouchMode(true);
        hq0Var2.setVisibility(4);
        hq0Var2.setScaleX(0.2f);
        hq0Var2.setScaleY(0.2f);
        hq0Var2.setAlpha(0.0f);
        this.containerView.addView(hq0Var2, w7.z5.e(110, 50, 85));
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
        hq0Var2.addView(y1Var, w7.z5.g());
        y1Var.setOnClickListener(new wp0(this, 6));
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
            linearLayout5.setBackground(org.telegram.ui.ActionBar.h6.Z(getThemedColor(org.telegram.ui.ActionBar.h6.i6), 6, 6));
            xp xpVar = new xp(context, 24, this.resourcesProvider);
            this.f0 = xpVar;
            xpVar.b(org.telegram.ui.ActionBar.h6.h7, org.telegram.ui.ActionBar.h6.j7, org.telegram.ui.ActionBar.h6.k7);
            xpVar.setDrawUnchecked(true);
            xpVar.a(false, false);
            xpVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(xpVar, w7.z5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            textView5.setTextColor(getThemedColor(i24));
            textView5.setTextSize(1, 14.0f);
            textView5.setText(LocaleController.formatString(R.string.VideoShareAddTimestamp, AndroidUtilities.formatShortDuration(num.intValue())));
            linearLayout5.addView(textView5, w7.z5.t(-2, -2, 16, 9, 0, 0, 0));
            w7.b6.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new wp0(this, 0));
            frameLayout8.addView(linearLayout5, w7.z5.e(-2, -2, 17));
            if (this.h == null) {
                View view2 = new View(context);
                view2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d7));
                frameLayout8.addView(view2, w7.z5.a(-1.0f, this.i0 ? 0.66f : 1.0f / AndroidUtilities.density, 55));
            }
            this.containerView.addView(frameLayout8, w7.z5.e(-1, 58, 83));
            if (this.h == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        bh.c cVar2 = new bh.c(this.U0.c(icVar, null, false));
        this.X0 = cVar2;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        cVar2.b(AndroidUtilities.dp(72.0f), true);
        dh.d c10 = this.T0.c(this.E0, fh.c.e(this.resourcesProvider), false);
        this.W0 = c10;
        c10.m = true;
        c10.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c10.u(AndroidUtilities.dp(32.0f));
        c10.j.g = 0.4f;
        c10.k();
        dh.d c11 = this.S0.c(hq0Var, fh.c.e(this.resourcesProvider), false);
        this.Y0 = c11;
        c11.q(AndroidUtilities.dp(22.0f));
        c11.p(AndroidUtilities.dp(f10));
        hq0Var.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(7.0f));
        FrameLayout frameLayout9 = this.s;
        if (frameLayout9 != null) {
            dh.d c12 = this.S0.c(frameLayout9, fh.c.e(this.resourcesProvider), false);
            c12.p(AndroidUtilities.dp(f10));
            c12.q(AndroidUtilities.dp(22.0f));
            this.s.setBackground(c12);
            this.s.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
        }
        FrameLayout frameLayout10 = this.d0;
        if (frameLayout10 != null) {
            dh.d c13 = this.S0.c(frameLayout10, fh.c.e(this.resourcesProvider), false);
            c13.p(AndroidUtilities.dp(f10));
            c13.q(AndroidUtilities.dp(22.0f));
            this.d0.setBackground(c13);
            this.d0.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
        }
        c1(0);
        org.telegram.ui.cy.g4(AccountInstance.getInstance(this.currentAccount));
        if (wq0Var.d.isEmpty()) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        }
        int i35 = this.currentAccount;
        int i36 = 0;
        MessagesStorage.getInstance(i35).getStorageQueue().postRunnable(new hg.n(i35, i36, new jq0(this), i36));
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        AndroidUtilities.updateViewVisibilityAnimated(gq0Var2, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(gq0Var, false, 1.0f, false);
        org.telegram.ui.ActionBar.d3 container = getContainer();
        xp0 xp0Var = new xp0(this, i36);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(container, xp0Var);
    }

    public void U0(View view) {
    }

    public void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
