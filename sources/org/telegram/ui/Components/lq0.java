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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class lq0 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int X0 = 0;
    public final wp0 A0;
    public final rl0 B;
    public ArrayList B0;
    public final lp0 C;
    public TL_stories.StoryItem C0;
    public final lp0 D;
    public i0.b D0;
    public final f2.w E;
    public int E0;
    public final f2.w F;
    public boolean F0;
    public final oz G;
    public org.telegram.ui.ActionBar.p1 G0;
    public final dq0 H;
    public int H0;
    public final iq0 I;
    public boolean I0;
    public final hq0 J;
    public boolean J0;
    public final ArrayList K;
    public int K0;
    public final String[] L;
    public final ng.e L0;
    public final int M;
    public final sg.d M0;
    public final zw0 N;
    public final sg.d N0;
    public final Drawable O;
    public final ng.a O0;
    public final View[] P;
    public final ng.a P0;
    public final AnimatorSet[] Q;
    public final ng.a Q0;
    public final a0.h R;
    public final ng.k R0;
    public final HashMap S;
    public final pg.b S0;
    public final xp0 T;
    public final ng.b T0;
    public int U;
    public final pg.b U0;
    public boolean V;
    public final ArrayList V0;
    public final boolean W;
    public final RectF W0;
    public boolean X;
    public final int Y;
    public final FrameLayout Z;
    public final LinearLayout a0;
    public final FrameLayout b;
    public final kp b0;
    public final np0 c;
    public final org.telegram.ui.zn c0;
    public final op0 d;
    public final Activity d0;
    public final pp0 e;
    public final boolean e0;
    public final np0 f;
    public boolean f0;
    public final TextPaint g0;
    public final FrameLayout h;
    public TLRPC.TL_exportedMessageLink h0;
    public boolean i0;
    public boolean j0;
    public final boolean k0;
    public final String[] l0;
    public int m0;
    public final eg.h0 n;
    public int n0;
    public boolean o0;
    public aq0 p0;
    public float q0;
    public final FrameLayout r;
    public float r0;
    public final org.telegram.ui.ActionBar.k5 s;
    public float s0;
    public ValueAnimator t0;
    public final yk0 u0;
    public final FrameLayout v;
    public final d20 v0;
    public final FrameLayout w;
    public final org.telegram.ui.ActionBar.k w0;
    public final LinearLayout x;
    public boolean x0;
    public AnimatorSet y;
    public o1.j y0;
    public TLRPC.Dialog z0;

    public lq0(Context context, ArrayList arrayList, String str, boolean z4, String str2, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, null, arrayList, str, null, z4, str2, null, z10, false, false, null, f6Var);
    }

    public static void A0(lq0 lq0Var) {
        RectF rectF = lq0Var.W0;
        ng.e eVar = lq0Var.L0;
        if (Build.VERSION.SDK_INT < 31 || eVar == null) {
            return;
        }
        rectF.set(0.0f, 0.0f, lq0Var.containerView.getMeasuredWidth(), lq0Var.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(1, lq0Var.V0);
        eVar.e(lq0Var.R0, lq0Var.containerView.getMeasuredWidth(), lq0Var.containerView.getMeasuredHeight());
    }

    public static int F0(lq0 lq0Var) {
        lp0 lp0Var = lq0Var.C;
        if (lp0Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = lp0Var.getChildAt(0);
        dl0 dl0Var = (dl0) lp0Var.G(childAt);
        if (dl0Var == null) {
            return -1000;
        }
        int paddingTop = lp0Var.getPaddingTop();
        if (dl0Var.c() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    public static lq0 N0(Context context, MessageObject messageObject, String str, boolean z4, String str2) {
        return new lq0(context, messageObject != null ? org.telegram.messenger.y3.m(messageObject) : null, str, null, z4, str2, null, false);
    }

    public static /* synthetic */ void m(lq0 lq0Var, AtomicReference atomicReference, rp0 rp0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        rp0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, lq0Var.currentAccount, Long.valueOf(-dialog.id));
    }

    public static boolean n(final lq0 lq0Var) {
        org.telegram.ui.zn znVar;
        pp0 pp0Var = lq0Var.e;
        boolean z4 = lq0Var.e0;
        Activity activity = lq0Var.d0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(lq0Var.getContext());
        linearLayout.setOrientation(1);
        if (lq0Var.K != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, lq0Var.resourcesProvider);
            if (z4) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new sp0(lq0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new ep0(lq0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, lq0Var.getContext(), lq0Var.resourcesProvider, true, false);
            if (z4) {
                g1Var.setTextColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, k7.b6.n(-1, 48));
            g1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            lq0Var.F0 = true;
            g1Var.setChecked(true);
            final org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(1, lq0Var.getContext(), lq0Var.resourcesProvider, false, true);
            if (z4) {
                g1Var2.setTextColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, k7.b6.n(-1, 48));
            g1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            g1Var2.setChecked(!lq0Var.F0);
            final int i10 = 0;
            g1Var.setOnClickListener(new View.OnClickListener(lq0Var) { // from class: org.telegram.ui.Components.hp0
                public final /* synthetic */ lq0 b;

                {
                    this.b = lq0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.b.F0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!r3.F0);
                            break;
                        default:
                            this.b.F0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!r3.F0);
                            break;
                    }
                }
            });
            final int i11 = 1;
            g1Var2.setOnClickListener(new View.OnClickListener(lq0Var) { // from class: org.telegram.ui.Components.hp0
                public final /* synthetic */ lq0 b;

                {
                    this.b = lq0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.b.F0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!r3.F0);
                            break;
                        default:
                            this.b.F0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!r3.F0);
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, k7.b6.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, lq0Var.resourcesProvider);
        if (z4) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new sp0(lq0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new ep0(lq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, lq0Var.getContext(), lq0Var.resourcesProvider, true, true);
        if (z4) {
            g1Var3.setTextColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ng));
            g1Var3.setIconColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        }
        g1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        g1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var3, k7.b6.n(-1, 48));
        g1Var3.setOnClickListener(new dp0(lq0Var, 1));
        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, lq0Var.getContext(), lq0Var.resourcesProvider, true, true);
        if (z4) {
            g1Var4.setTextColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ng));
            g1Var4.setIconColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        }
        g1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        g1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var4, k7.b6.n(-1, 48));
        g1Var4.setOnClickListener(new dp0(lq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, k7.b6.n(-1, -2));
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(linearLayout, -2, -2);
        lq0Var.G0 = p1Var;
        p1Var.b = false;
        p1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        lq0Var.G0.setOutsideTouchable(true);
        lq0Var.G0.setClippingEnabled(true);
        lq0Var.G0.setInputMethodMode(2);
        lq0Var.G0.setSoftInputMode(0);
        lq0Var.G0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        lq0Var.G0.setFocusable(true);
        int[] iArr = new int[2];
        pp0Var.getLocationInWindow(iArr);
        lq0Var.G0.showAtLocation(pp0Var, 51, AndroidUtilities.dp(8.0f) + ((pp0Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!lq0Var.keyboardVisible || (znVar = lq0Var.c0) == null || znVar.U0.getMeasuredHeight() <= AndroidUtilities.dp(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f) : pp0Var.getMeasuredHeight() + iArr[1]);
        lq0Var.G0.b();
        try {
            pp0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void o(lq0 lq0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z4, int i10, HashMap hashMap) {
        int i11;
        boolean z10;
        char c3;
        MessageObject messageObject;
        long j10;
        int i12;
        long j11;
        String[] strArr;
        MessageObject messageObject2;
        SendMessagesHelper.SendMessageParams of2;
        ArrayList arrayList2;
        TLRPC.TL_forumTopic tL_forumTopic;
        np0 np0Var;
        long j12;
        long j13;
        Long l10;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue;
        String[] strArr2 = lq0Var.L;
        op0 op0Var = lq0Var.d;
        np0 np0Var2 = lq0Var.c;
        HashMap hashMap2 = lq0Var.S;
        Long l11 = 0L;
        a0.h hVar = lq0Var.R;
        ArrayList arrayList3 = lq0Var.K;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            int i13 = 0;
            boolean z11 = false;
            while (true) {
                if (i13 >= hVar.m()) {
                    arrayList2 = arrayList3;
                    tL_forumTopic = null;
                    break;
                }
                long j14 = hVar.j(i13);
                boolean isMonoForum = MessagesController.getInstance(lq0Var.currentAccount).isMonoForum(j14);
                Long l12 = hashMap == null ? l11 : (Long) hashMap.get(Long.valueOf(j14));
                if (l12 != null && l12.longValue() > 0) {
                    z11 = true;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j14));
                if (tL_forumTopic2 == null || !isMonoForum) {
                    np0Var = np0Var2;
                    j12 = j14;
                    j13 = 0;
                } else {
                    np0Var = np0Var2;
                    j12 = j14;
                    j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                }
                if (tL_forumTopic2 == null || isMonoForum) {
                    l10 = l11;
                    messageObject3 = null;
                } else {
                    l10 = l11;
                    messageObject3 = new MessageObject(lq0Var.currentAccount, tL_forumTopic2.topicStartMessage, false, false);
                }
                if (messageObject3 != null) {
                    messageObject3.isTopicMainMessage = true;
                }
                if (np0Var.getTag() == null || op0Var.a.length() <= 0) {
                    messageObject4 = messageObject3;
                    arrayList2 = arrayList3;
                } else {
                    CharSequence charSequence = charSequenceArr[0];
                    MessageObject messageObject5 = messageObject3;
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(charSequence == null ? null : charSequence.toString(), j12, messageObject5, messageObject3, null, true, arrayList, null, null, z4, 0, 0, null, false);
                    messageObject4 = messageObject5;
                    if (l12 == null) {
                        arrayList2 = arrayList3;
                        longValue = 0;
                    } else {
                        arrayList2 = arrayList3;
                        longValue = l12.longValue();
                    }
                    of3.payStars = longValue;
                    of3.monoForumPeer = j13;
                    SendMessagesHelper.getInstance(lq0Var.currentAccount).sendMessage(of3);
                }
                long j15 = j12;
                int sendMessage = SendMessagesHelper.getInstance(lq0Var.currentAccount).sendMessage(lq0Var.K, j15, !lq0Var.F0, false, z4, 0, 0, messageObject4, i10, l12 == null ? 0L : l12.longValue(), j13, null);
                if (sendMessage != 0) {
                    arrayList4.add(Long.valueOf(j15));
                }
                if (hVar.m() == 1) {
                    tL_forumTopic = null;
                    z4.t0(sendMessage, lq0Var.c0, null);
                    if (sendMessage != 0) {
                        break;
                    }
                }
                i13++;
                arrayList3 = arrayList2;
                np0Var2 = np0Var;
                l11 = l10;
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
                lq0Var.R0(hVar, arrayList2.size(), hVar.m() == 1 ? (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(0)) : tL_forumTopic, !z11);
            }
        } else {
            xp0 xp0Var = lq0Var.T;
            int i15 = xp0Var != null ? xp0Var.d : 0;
            if (lq0Var.C0 != null) {
                int i16 = 0;
                boolean z12 = false;
                while (i16 < hVar.m()) {
                    long j16 = hVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(lq0Var.currentAccount).isMonoForum(j16);
                    Long l13 = hashMap == null ? l11 : (Long) hashMap.get(Long.valueOf(j16));
                    if (l13 != null && l13.longValue() > 0) {
                        z12 = true;
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
                        messageObject2 = new MessageObject(lq0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    }
                    if (lq0Var.C0 != null) {
                        if (np0Var2.getTag() != null && op0Var.a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(lq0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j16, null, messageObject6, null, true, null, null, null, z4, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j16, messageObject2, messageObject2, null, true, null, null, null, z4, 0, 0, null, false);
                        of2.sendingStory = lq0Var.C0;
                    } else if (np0Var2.getTag() == null || op0Var.a.length() <= 0) {
                        of2 = SendMessagesHelper.SendMessageParams.of(strArr[i12], j16, messageObject2, messageObject2, null, true, null, null, null, z4, 0, 0, null, false);
                    } else {
                        CharSequence charSequence2 = charSequenceArr[0];
                        of2 = SendMessagesHelper.SendMessageParams.of(charSequence2 == null ? null : charSequence2.toString(), j16, messageObject2, messageObject2, null, true, arrayList, null, null, z4, 0, 0, null, false);
                    }
                    of2.payStars = l13 == null ? 0L : l13.longValue();
                    of2.monoForumPeer = j11;
                    SendMessagesHelper.getInstance(lq0Var.currentAccount).sendMessage(of2);
                    i16++;
                    i15 = i12;
                    strArr2 = strArr;
                }
                z10 = z12;
            } else {
                int i17 = i15;
                if (strArr2[i17] != null) {
                    boolean z13 = false;
                    for (int i18 = 0; i18 < hVar.m(); i18++) {
                        long j17 = hVar.j(i18);
                        boolean isMonoForum3 = MessagesController.getInstance(lq0Var.currentAccount).isMonoForum(j17);
                        Long l14 = hashMap == null ? l11 : (Long) hashMap.get(Long.valueOf(j17));
                        if (l14 != null && l14.longValue() > 0) {
                            z13 = true;
                        }
                        TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j17));
                        long peerDialogId = (tL_forumTopic4 == null || !isMonoForum3) ? 0L : DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                        if (tL_forumTopic4 == null || isMonoForum3) {
                            c3 = 0;
                            messageObject = null;
                        } else {
                            c3 = 0;
                            messageObject = new MessageObject(lq0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                        }
                        if (np0Var2.getTag() == null || op0Var.a.length() <= 0) {
                            j10 = j17;
                        } else {
                            CharSequence charSequence3 = charSequenceArr[c3];
                            SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(charSequence3 == null ? null : charSequence3.toString(), j17, messageObject, messageObject, null, true, arrayList, null, null, z4, 0, 0, null, false);
                            j10 = j17;
                            of4.payStars = l14 == null ? 0L : l14.longValue();
                            of4.monoForumPeer = peerDialogId;
                            SendMessagesHelper.getInstance(lq0Var.currentAccount).sendMessage(of4);
                        }
                        SendMessagesHelper.SendMessageParams of5 = SendMessagesHelper.SendMessageParams.of(strArr2[i17], j10, messageObject, messageObject, null, true, null, null, null, z4, 0, 0, null, false);
                        of5.payStars = l14 == null ? 0L : l14.longValue();
                        of5.monoForumPeer = peerDialogId;
                        SendMessagesHelper.getInstance(lq0Var.currentAccount).sendMessage(of5);
                    }
                    z10 = z13;
                } else {
                    i11 = 0;
                    z10 = false;
                    lq0Var.R0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i11)), !z10);
                }
            }
            i11 = 0;
            lq0Var.R0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i11)), !z10);
        }
        aq0 aq0Var = lq0Var.p0;
        if (aq0Var != null) {
            aq0Var.V();
        }
        lq0Var.dismiss();
    }

    public static void p(lq0 lq0Var, int i10) {
        TLRPC.Dialog dialog;
        d20 d20Var = lq0Var.v0;
        HashMap hashMap = lq0Var.S;
        a0.h hVar = lq0Var.R;
        dq0 dq0Var = lq0Var.H;
        iq0 iq0Var = lq0Var.I;
        if (iq0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = lq0Var.z0;
            if (dialog2 == null) {
                return;
            }
            hVar.k(dialog2, dialog2.id);
            hashMap.remove(dialog2);
            lq0Var.a1(2);
            if (lq0Var.I0 || lq0Var.J0) {
                if (((TLRPC.Dialog) dq0Var.e.f(dialog2.id)) == null) {
                    dq0Var.e.k(dialog2, dialog2.id);
                    ArrayList arrayList = dq0Var.d;
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                dq0Var.l();
                lq0Var.x0 = false;
                d20Var.r.setText("");
                lq0Var.K0(false);
            }
            for (int i11 = 0; i11 < lq0Var.P0().getChildCount(); i11++) {
                View childAt = lq0Var.P0().getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.d7) {
                    org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) childAt;
                    if (d7Var.getCurrentDialog() == lq0Var.z0.id) {
                        d7Var.d(null, false, true);
                        d7Var.b(true, true);
                    }
                }
            }
            lq0Var.L0();
            return;
        }
        TLRPC.TL_forumTopic E = iq0Var.E(i10);
        if (E == null || (dialog = lq0Var.z0) == null) {
            return;
        }
        long j10 = dialog.id;
        boolean isMonoForum = MessagesController.getInstance(lq0Var.currentAccount).isMonoForum(j10);
        TLRPC.Dialog dialog3 = lq0Var.z0;
        hVar.k(dialog3, j10);
        hashMap.put(dialog3, E);
        lq0Var.a1(2);
        if (lq0Var.I0 || lq0Var.J0) {
            if (((TLRPC.Dialog) dq0Var.e.f(dialog3.id)) == null) {
                dq0Var.e.k(dialog3, dialog3.id);
                ArrayList arrayList2 = dq0Var.d;
                arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
            }
            dq0Var.l();
            lq0Var.x0 = false;
            d20Var.r.setText("");
            lq0Var.K0(false);
        }
        for (int i12 = 0; i12 < lq0Var.P0().getChildCount(); i12++) {
            View childAt2 = lq0Var.P0().getChildAt(i12);
            if (childAt2 instanceof org.telegram.ui.Cells.d7) {
                org.telegram.ui.Cells.d7 d7Var2 = (org.telegram.ui.Cells.d7) childAt2;
                if (d7Var2.getCurrentDialog() == lq0Var.z0.id) {
                    d7Var2.d(E, isMonoForum, true);
                    d7Var2.b(true, true);
                }
            }
        }
        lq0Var.L0();
    }

    public static void s0(lq0 lq0Var) {
        lp0 lp0Var = lq0Var.C;
        lp0 lp0Var2 = lq0Var.D;
        rl0 rl0Var = lq0Var.B;
        if (lq0Var.o0) {
            return;
        }
        lp0 lp0Var3 = lq0Var.I0 ? lp0Var2 : lp0Var;
        if (lp0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = lp0Var3.getChildAt(0);
        for (int i10 = 0; i10 < lp0Var3.getChildCount(); i10++) {
            if (lp0Var3.getChildAt(i10).getTop() < childAt.getTop()) {
                childAt = lp0Var3.getChildAt(i10);
            }
        }
        dl0 dl0Var = (dl0) lp0Var3.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i11 = (top <= 0 || dl0Var == null || dl0Var.b() != 0) ? 0 : top;
        if (top < 0 || dl0Var == null || dl0Var.b() != 0) {
            lq0Var.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            lq0Var.T0(true);
            top = i11;
        } else {
            lq0Var.H0 = childAt.getTop();
            lq0Var.T0(false);
        }
        if (rl0Var.getVisibility() == 0) {
            if (rl0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = rl0Var.getChildAt(0);
            for (int i12 = 0; i12 < rl0Var.getChildCount(); i12++) {
                if (rl0Var.getChildAt(i12).getTop() < childAt2.getTop()) {
                    childAt2 = rl0Var.getChildAt(i12);
                }
            }
            dl0 dl0Var2 = (dl0) rl0Var.G(childAt2);
            int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
            int i13 = (top2 <= 0 || dl0Var2 == null || dl0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || dl0Var2 == null || dl0Var2.b() != 0) {
                lq0Var.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                lq0Var.T0(true);
                top2 = i13;
            } else {
                lq0Var.H0 = childAt2.getTop();
                lq0Var.T0(false);
            }
            top = AndroidUtilities.lerp(top, top2, rl0Var.getAlpha());
        }
        int i14 = lq0Var.m0;
        if (i14 != top) {
            lq0Var.n0 = i14;
            float f10 = top;
            int i15 = (int) (lq0Var.q0 + f10);
            lq0Var.m0 = i15;
            lp0Var.setTopGlowOffset(i15);
            int i16 = (int) (lq0Var.q0 + f10);
            lq0Var.m0 = i16;
            lp0Var2.setTopGlowOffset(i16);
            int i17 = (int) (f10 + lq0Var.q0);
            lq0Var.m0 = i17;
            rl0Var.setTopGlowOffset(i17);
            lq0Var.b.setTranslationY(lq0Var.m0 + lq0Var.q0);
            lq0Var.N.setTranslationY(lq0Var.m0 + lq0Var.q0);
            lq0Var.containerView.invalidate();
        }
    }

    public final void K0(boolean z4) {
        d20 d20Var = this.v0;
        kg.f fVar = d20Var.r;
        kg.f fVar2 = d20Var.r;
        boolean isEmpty = TextUtils.isEmpty(fVar.getText());
        lp0 lp0Var = this.C;
        lp0 lp0Var2 = this.D;
        boolean z10 = true;
        if (!isEmpty || ((this.keyboardVisible && fVar2.hasFocus()) || this.J0)) {
            this.x0 = true;
            if (this.z0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(lp0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(lp0Var2, true);
            }
        } else {
            if (this.z0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(lp0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(lp0Var2, false);
            }
            z10 = false;
        }
        if (this.I0 != z10 || z4) {
            this.I0 = z10;
            hq0 hq0Var = this.J;
            hq0Var.l();
            this.H.l();
            if (this.I0) {
                if (this.H0 == Integer.MAX_VALUE) {
                    ((f2.i0) lp0Var2.getLayoutManager()).h1(0, -lp0Var2.getPaddingTop());
                } else {
                    ((f2.i0) lp0Var2.getLayoutManager()).h1(0, this.H0 - lp0Var2.getPaddingTop());
                }
                hq0Var.E(fVar2.getText().toString());
                return;
            }
            int i10 = this.H0;
            f2.w wVar = this.E;
            if (i10 == Integer.MAX_VALUE) {
                wVar.h1(0, 0);
            } else {
                wVar.h1(0, 0);
            }
        }
    }

    public final void L0() {
        TLRPC.Dialog dialog = this.z0;
        if (dialog == null) {
            return;
        }
        View view = null;
        this.z0 = null;
        for (int i10 = 0; i10 < P0().getChildCount(); i10++) {
            View childAt = P0().getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.d7) && ((org.telegram.ui.Cells.d7) childAt).getCurrentDialog() == dialog.id) {
                view = childAt;
            }
        }
        if (view == null) {
            return;
        }
        o1.j jVar = this.y0;
        if (jVar != null) {
            jVar.c();
        }
        P0().setVisibility(0);
        d20 d20Var = this.v0;
        d20Var.setVisibility(0);
        kg.f fVar = d20Var.r;
        if (this.I0 || this.J0) {
            this.A0.E.v = true;
            fVar.requestFocus();
            AndroidUtilities.showKeyboard(fVar);
        }
        int[] iArr = new int[2];
        o1.j jVar2 = new o1.j(new kb.a(1000.0f));
        o1.k kVar = new o1.k(0.0f);
        org.telegram.ui.zn znVar = this.c0;
        kVar.b((znVar == null || !znVar.b) ? 800.0f : 10.0f);
        kVar.a(1.0f);
        jVar2.u = kVar;
        this.y0 = jVar2;
        jVar2.b(new cp0(this, (org.telegram.ui.Cells.d7) view, iArr, 0));
        this.y0.a(new ya(this, 4));
        this.y0.f();
    }

    public final void M0() {
        boolean z4 = false;
        if (this.h0 == null && this.l0[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
            aq0 aq0Var = this.p0;
            if (aq0Var != null) {
                aq0Var.q0();
                return;
            }
            if (this.d0 instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.h0;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z4 = true;
                }
                ((LaunchActivity) this.d0).D0(new j3.x(2, z4));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final String O0() {
        String str;
        String[] strArr = this.l0;
        xp0 xp0Var = this.T;
        if (xp0Var != null) {
            str = strArr[xp0Var.d];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.h0;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        kp kpVar = this.b0;
        if (kpVar != null && kpVar.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.Y)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return str == null ? "" : str;
    }

    public final rl0 P0() {
        return (this.I0 || this.J0) ? this.D : this.C;
    }

    public final void Q0(View view, int[] iArr, float f10) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        rl0 rl0Var = this.B;
        rl0Var.setPivotX(width);
        rl0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f11 = 0.25f * f10;
        float f12 = 0.75f + f11;
        rl0Var.setScaleX(f12);
        rl0Var.setScaleY(f12);
        rl0Var.setAlpha(f10);
        rl0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f13 = f11 + 1.0f;
        P0.setScaleX(f13);
        P0.setScaleY(f13);
        float f14 = 1.0f - f10;
        P0.setAlpha(f14);
        d20 d20Var = this.v0;
        d20Var.setPivotX(d20Var.getWidth() / 2.0f);
        d20Var.setPivotY(0.0f);
        float f15 = (0.1f * f14) + 0.9f;
        d20Var.setScaleX(f15);
        d20Var.setScaleY(f15);
        d20Var.setAlpha(f14);
        org.telegram.ui.ActionBar.k kVar = this.w0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f14);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f14);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f14);
        kVar.setAlpha(f10);
        rl0Var.getLocationInWindow(iArr);
        float interpolation = mr.g.getInterpolation(f10);
        for (int i10 = 0; i10 < P0.getChildCount(); i10++) {
            View childAt = P0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.d7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f10, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f14);
                }
            }
        }
        for (int i11 = 0; i11 < rl0Var.getChildCount(); i11++) {
            View childAt2 = rl0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.e7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((rl0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        P0.invalidate();
    }

    public final void T0(boolean z4) {
        View[] viewArr = this.P;
        if ((!z4 || viewArr[0].getTag() == null) && (z4 || viewArr[0].getTag() != null)) {
            return;
        }
        viewArr[0].setTag(z4 ? null : 1);
        if (z4) {
            viewArr[0].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.Q;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[0] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z4 ? 1.0f : 0.0f));
        animatorSetArr[0].setDuration(150L);
        animatorSetArr[0].addListener(new up0(this, z4, 0));
        animatorSetArr[0].start();
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        lq0 lq0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        gq0 gq0Var;
        if (dialog instanceof cq0) {
            S0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.d7) && ((org.telegram.ui.Cells.d7) view).C) || ((view instanceof org.telegram.ui.Cells.g6) && ((org.telegram.ui.Cells.g6) view).k0)) {
            X0(dialog.id, view);
            return;
        }
        rl0 rl0Var = this.B;
        if (rl0Var.getVisibility() != 8 || (activity = this.d0) == null) {
            return;
        }
        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
        int i10 = this.M;
        if (isChatDialog) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString(R.string.SendMessageTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                if (i10 == 3) {
                    if (ChatObject.isActionBannedByDefault(chat, 10)) {
                        d2Var.Q = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                    } else {
                        d2Var.Q = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                    }
                } else if (i10 != 2) {
                    d2Var.Q = LocaleController.getString(R.string.ChannelCantSendMessage);
                } else if (this.k0) {
                    d2Var.Q = LocaleController.getString(R.string.PublicPollCantForward);
                } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                    d2Var.Q = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                } else {
                    d2Var.Q = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                }
                kf.k0.u(R.string.OK, alertDialog$Builder, null);
                return;
            }
        } else if (DialogObject.isEncryptedDialog(dialog.id) && i10 != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String string2 = LocaleController.getString(R.string.SendMessageTitle);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
            d2Var2.O = string2;
            if (i10 == 3) {
                d2Var2.Q = LocaleController.getString(R.string.TodoCantForwardSecretChat);
            } else if (i10 != 0) {
                d2Var2.Q = LocaleController.getString(R.string.PollCantForwardSecretChat);
            } else {
                d2Var2.Q = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
            }
            kf.k0.u(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        long j10 = dialog.id;
        a0.h hVar = this.R;
        if (hVar.h(j10) >= 0) {
            hVar.l(dialog.id);
            this.S.remove(dialog);
            if (view instanceof org.telegram.ui.Cells.g6) {
                ((org.telegram.ui.Cells.g6) view).s(false, true);
            } else if (view instanceof org.telegram.ui.Cells.d7) {
                ((org.telegram.ui.Cells.d7) view).b(false, true);
            }
            a1(1);
            lq0Var = this;
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if ((UserObject.isBotForum(user) && !(((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id))) || (DialogObject.isChatDialog(dialog.id) && (ChatObject.isForum(chat2) || (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                this.z0 = dialog;
                this.F.h1(0, this.m0 - rl0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                rp0 rp0Var = new rp0(this, dialog, atomicReference, view);
                atomicReference.set(new org.telegram.ui.kh(this, atomicReference, rp0Var, dialog, 22));
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i11 = NotificationCenter.topicsDidLoaded;
                notificationCenter.addObserver(rp0Var, i11);
                if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.id) != null) {
                    rp0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.id));
                    return;
                } else {
                    MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.id);
                    AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            lq0Var = this;
            hVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.g6) {
                ((org.telegram.ui.Cells.g6) view).s(true, true);
            } else if (view instanceof org.telegram.ui.Cells.d7) {
                ((org.telegram.ui.Cells.d7) view).b(true, true);
            }
            a1(2);
            long j11 = UserConfig.getInstance(lq0Var.currentAccount).clientUserId;
            if (lq0Var.I0) {
                dq0 dq0Var = lq0Var.H;
                a0.h hVar2 = dq0Var.e;
                ArrayList arrayList = dq0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.id);
                if (dialog2 == null) {
                    dq0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j11) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                dq0Var.l();
                lq0Var.x0 = false;
                d20 d20Var = lq0Var.v0;
                d20Var.r.setText("");
                K0(false);
                AndroidUtilities.hideKeyboard(d20Var.r);
            }
        }
        hq0 hq0Var = lq0Var.J;
        if (hq0Var == null || (gq0Var = hq0Var.E) == null) {
            return;
        }
        gq0Var.q(0, gq0Var.h());
    }

    public final void V0(final boolean z4) {
        int i10;
        int i11 = 0;
        while (true) {
            a0.h hVar = this.R;
            int m9 = hVar.m();
            np0 np0Var = this.c;
            op0 op0Var = this.d;
            if (i11 >= m9) {
                Editable text = op0Var.getText();
                xt xtVar = op0Var.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                kp kpVar = this.b0;
                int i12 = (kpVar == null || !kpVar.a.q) ? -1 : this.Y;
                ArrayList arrayList = new ArrayList();
                if (this.K != null) {
                    i10 = 0;
                    for (int i13 = 0; i13 < hVar.m(); i13++) {
                        long j10 = hVar.j(i13);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
                        }
                        if (np0Var.getTag() != null && xtVar.length() > 0 && sendPaidMessagesStars > 0) {
                            i10++;
                        }
                        if (sendPaidMessagesStars > 0) {
                            i10++;
                        }
                        if (sendPaidMessagesStars > 0 && !arrayList.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                        }
                    }
                } else {
                    xp0 xp0Var = this.T;
                    int i14 = xp0Var != null ? xp0Var.d : 0;
                    if (this.C0 != null) {
                        int i15 = 0;
                        for (int i16 = 0; i16 < hVar.m(); i16++) {
                            long j11 = hVar.j(i16);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
                            }
                            if (this.C0 != null && np0Var.getTag() != null && xtVar.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
                                i15++;
                            }
                            if (sendPaidMessagesStars2 > 0) {
                                i15++;
                            }
                            if (sendPaidMessagesStars2 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                                arrayList.add(Long.valueOf(j11));
                            }
                        }
                        i10 = i15;
                    } else {
                        int i17 = 0;
                        if (this.L[i14] != null) {
                            for (int i18 = 0; i18 < hVar.m(); i18++) {
                                long j12 = hVar.j(i18);
                                long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j12);
                                if (sendPaidMessagesStars3 <= 0) {
                                    sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j12));
                                }
                                if (np0Var.getTag() != null && xtVar.length() > 0 && sendPaidMessagesStars3 > 0) {
                                    i17++;
                                }
                                if (sendPaidMessagesStars3 > 0) {
                                    i17++;
                                }
                                if (sendPaidMessagesStars3 > 0 && !arrayList.contains(Long.valueOf(j12))) {
                                    arrayList.add(Long.valueOf(j12));
                                }
                            }
                            i10 = i17;
                        } else {
                            i10 = 0;
                        }
                    }
                }
                final int i19 = i12;
                z4.c0(this.currentAccount, arrayList, i10, new Utilities.Callback() { // from class: org.telegram.ui.Components.ip0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        lq0.o(lq0.this, charSequenceArr, entities, z4, i19, (HashMap) obj);
                    }
                });
                return;
            }
            if (z4.h(getContext(), this.currentAccount, hVar.j(i11), np0Var.getTag() != null && op0Var.a.length() > 0)) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void W0(boolean z4) {
        np0 np0Var = this.c;
        if (z4 == (np0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        np0Var.setTag(z4 ? 1 : null);
        op0 op0Var = this.d;
        if (op0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(op0Var.getEditText());
        }
        op0Var.k(true);
        FrameLayout frameLayout = this.Z;
        np0 np0Var2 = this.f;
        FrameLayout frameLayout2 = this.h;
        if (z4) {
            np0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            np0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        if (frameLayout2 != null) {
            int i10 = z4 ? 4 : 1;
            WeakHashMap weakHashMap = r0.j0.a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.x;
        if (linearLayout != null) {
            int i11 = z4 ? 4 : 1;
            WeakHashMap weakHashMap2 = r0.j0.a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.y = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f10 = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(np0Var, (Property<np0, Float>) property, z4 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z4 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(np0Var2, (Property<np0, Float>) View.SCALE_X, z4 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(np0Var2, (Property<np0, Float>) View.SCALE_Y, z4 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(np0Var2, (Property<np0, Float>) property, z4 ? 1.0f : 0.0f));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.P[1], (Property<View, Float>) property, z4 ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout3 = this.r;
        if (frameLayout3 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.e0 && z4) {
                f10 = AndroidUtilities.dp(this.a0 != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, f10));
        }
        this.y.playTogether(arrayList);
        this.y.setInterpolator(new DecelerateInterpolator());
        this.y.setDuration(180L);
        this.y.addListener(new up0(this, z4, 1));
        this.y.start();
    }

    public final void X0(long j10, View view) {
        int i10 = -this.E0;
        this.E0 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j10 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10))) : "";
        boolean premiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
        int i11 = 1;
        FrameLayout frameLayout = this.v;
        (premiumFeaturesBlocked ? new qc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : new qc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new fp0(this, i11))).j();
    }

    public final void Y0() {
        org.telegram.ui.ActionBar.r1 r1Var;
        np0 np0Var = this.c;
        if (np0Var == null) {
            return;
        }
        op0 op0Var = this.d;
        if (op0Var == null || !op0Var.m()) {
            wp0 wp0Var = this.A0;
            if (wp0Var != null && (r1Var = wp0Var.E) != null && !r1Var.f) {
                AndroidUtilities.dp(20.0f);
            }
        } else {
            op0Var.getEmojiPaddingShown();
        }
        float f10 = 0.0f;
        FrameLayout frameLayout = this.Z;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f10 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            float f11 = -f10;
            frameLayout2.setTranslationY(f11);
            LinearLayout linearLayout = this.x;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f11);
            }
        }
        float f12 = -f10;
        np0Var.setTranslationY(f12);
        this.f.setTranslationY(f12);
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.k5 k5Var = this.s;
        if (k5Var != null) {
            String O0 = O0();
            if (O0.startsWith("https://")) {
                O0 = O0.substring(8);
            } else if (O0.startsWith("http://")) {
                O0 = O0.substring(7);
            }
            k5Var.k(O0);
        }
    }

    public final void a1(int i10) {
        a0.h hVar = this.R;
        if (hVar.m() == 0) {
            W0(false);
            return;
        }
        ArrayList arrayList = this.K;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.c.getTag();
        op0 op0Var = this.d;
        if (tag != null && op0Var.a.length() > 0) {
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
        boolean z4 = i10 != 0;
        pp0 pp0Var = this.e;
        pp0Var.g(max, z4);
        pp0Var.i(size, j10, i10 != 0);
        W0(true);
        op0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), pp0Var.l()), 0);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            dq0 dq0Var = this.H;
            if (dq0Var != null) {
                dq0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        op0 op0Var = this.d;
        if (op0Var != null) {
            AndroidUtilities.hideKeyboard(op0Var.getEditText());
        }
        this.V = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public void dismissInternal() {
        super.dismissInternal();
        op0 op0Var = this.d;
        if (op0Var != null) {
            op0Var.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.U;
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onBackPressed() {
        if (this.z0 != null) {
            L0();
            return;
        }
        op0 op0Var = this.d;
        if (op0Var == null || !op0Var.e) {
            super.onBackPressed();
        } else {
            op0Var.k(true);
        }
    }

    public lq0(Context context, ArrayList arrayList, String str, String str2, boolean z4, String str3, String str4, boolean z10) {
        this(context, null, arrayList, str, str2, z4, str3, str4, false, z10, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0811  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lq0(Context context, org.telegram.ui.zn znVar, ArrayList arrayList, String str, String str2, boolean z4, String str3, String str4, boolean z10, boolean z11, boolean z12, Integer num, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true, false);
        int i10;
        float f10;
        lp0 lp0Var;
        lp0 lp0Var2;
        float f11;
        LinearLayout linearLayout;
        int i11;
        final int i12 = 1;
        final int i13 = 0;
        String[] strArr = new String[2];
        this.L = strArr;
        this.P = new View[2];
        this.Q = new AnimatorSet[2];
        this.R = new a0.h();
        this.S = new HashMap();
        this.U = -1;
        this.V = false;
        new RectF();
        new Paint(1);
        this.g0 = new TextPaint(1);
        String[] strArr2 = new String[2];
        this.l0 = strArr2;
        this.B0 = new ArrayList();
        int i14 = 4;
        while (true) {
            if (i14 >= 32) {
                i10 = 80;
                break;
            }
            i10 = (1 << i14) - 12;
            if (80 <= i10) {
                break;
            } else {
                i14++;
            }
        }
        int i15 = i10 / 8;
        long[] jArr = new long[i15];
        Object[] objArr = new Object[i15];
        this.D0 = i0.b.e;
        this.E0 = 4;
        this.F0 = true;
        this.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        ArrayList arrayList2 = new ArrayList();
        this.V0 = arrayList2;
        RectF rectF = new RectF();
        this.W0 = rectF;
        arrayList2.add(rectF);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        sg.c cVar = new sg.c();
        int i16 = org.telegram.ui.ActionBar.j6.d6;
        cVar.a(getThemedColor(i16));
        if (Build.VERSION.SDK_INT >= 31) {
            this.L0 = new ng.e(false);
            sg.d dVar = new sg.d(null);
            this.N0 = dVar;
            dVar.j(new o2.i(this, 7));
            sg.d dVar2 = new sg.d(null);
            this.M0 = dVar2;
            dVar2.j(new tp0(this, i13));
            ng.a aVar = new ng.a(dVar);
            this.O0 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            ng.a aVar2 = new ng.a(dVar2);
            this.P0 = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
        } else {
            this.L0 = null;
            this.M0 = null;
            this.N0 = null;
            this.O0 = new ng.a(cVar);
            this.P0 = new ng.a(cVar);
        }
        this.Q0 = new ng.a(cVar);
        this.resourcesProvider = f6Var;
        this.W = z12;
        this.d0 = AndroidUtilities.findActivity(context);
        this.e0 = z11;
        if (z11) {
            this.resourcesProvider = new nh.i0(i12);
        }
        cVar.a(getThemedColor(i16));
        this.c0 = znVar;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.O = mutate;
        int i17 = org.telegram.ui.ActionBar.j6.h5;
        this.behindKeyboardColorKey = i17;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i17), PorterDuff.Mode.MULTIPLY));
        this.occupyNavigationBarWithoutKeyboard = true;
        this.isFullscreen = z10;
        strArr2[0] = str3;
        strArr2[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            MessageObject messageObject = (MessageObject) arrayList.get(0);
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(messageObject.getDialogId()));
            if (!TextUtils.isEmpty(publicUsername)) {
                StringBuilder sb = new StringBuilder("https://");
                org.telegram.ui.ai.w(sb, MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, "/");
                sb.append(messageObject.getId());
                strArr2[0] = sb.toString();
                if (arrayList.size() == 1 && messageObject.hasValidGroupId()) {
                    strArr2[0] = android.support.v4.media.a.r(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.K = arrayList;
        this.J = new hq0(this, context);
        this.k0 = z4;
        strArr[0] = str;
        strArr[1] = str2;
        this.useSmoothKeyboard = true;
        setDelegate(new org.telegram.ui.k0(this, i12));
        int i18 = 3;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                MessageObject messageObject2 = (MessageObject) this.K.get(i19);
                if (messageObject2.isTodo()) {
                    this.M = 3;
                } else if (messageObject2.isPoll()) {
                    int i20 = messageObject2.isPublicPoll() ? 2 : 1;
                    this.M = i20;
                    if (i20 == 2) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (z4) {
            this.i0 = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((MessageObject) arrayList.get(0)).getId();
            tL_channels_exportMessageLink.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(((MessageObject) arrayList.get(0)).messageOwner.peer_id.channel_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_exportMessageLink, new org.telegram.ui.no(13, this, context));
        }
        wp0 wp0Var = new wp0(this, context);
        this.A0 = wp0Var;
        this.containerView = wp0Var;
        ng.a aVar3 = this.O0;
        ug.i iVar = new ug.i(this.containerView);
        ViewGroup viewGroup = this.containerView;
        aVar3.d = iVar;
        aVar3.e = viewGroup;
        ng.a aVar4 = this.P0;
        ug.i iVar2 = new ug.i(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        aVar4.d = iVar2;
        aVar4.e = viewGroup2;
        ng.a aVar5 = this.Q0;
        ug.i iVar3 = new ug.i(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        aVar5.d = iVar3;
        aVar5.e = viewGroup3;
        viewGroup3.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup4 = this.containerView;
        int i21 = this.backgroundPaddingLeft;
        viewGroup4.setPadding(i21, 0, i21, this.D0.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        int i22 = org.telegram.ui.ActionBar.j6.h5;
        frameLayout.setBackgroundColor(getThemedColor(i22));
        if (this.e0 && this.l0[1] != null) {
            xp0 xp0Var = new xp0(this, context);
            this.T = xp0Var;
            frameLayout.addView(xp0Var, k7.b6.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        d20 d20Var = new d20(context, this.resourcesProvider);
        this.v0 = d20Var;
        yp0 yp0Var = new yp0(this);
        kg.f fVar = d20Var.r;
        fVar.addTextChangedListener(yp0Var);
        fVar.setHint(LocaleController.getString(R.string.ShareSendTo));
        fVar.setOnEditorActionListener(new d1(this, 6));
        d20Var.setCloseButtonOnClickListener(new fp0(this, i13));
        frameLayout.addView(d20Var, k7.b6.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.w0 = kVar;
        kVar.setOccupyStatusBar(false);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i23 = org.telegram.ui.ActionBar.j6.j5;
        kVar.setTitleColor(getThemedColor(i23));
        kVar.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.j6.q5));
        kVar.C(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z6, false), false);
        kVar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.u8, false), false);
        kVar.setActionBarMenuOnItemClick(new eg.m1(this, 29));
        kVar.setVisibility(8);
        frameLayout.addView(kVar, k7.b6.e(-1, 58, 83));
        rl0 rl0Var = new rl0(context, this.resourcesProvider);
        this.B = rl0Var;
        f2.w wVar = new f2.w(4);
        this.F = wVar;
        rl0Var.setLayoutManager(wVar);
        wVar.O = new mp0(this, 2);
        rl0Var.setOnScrollListener(new kp0(this, i13));
        iq0 iq0Var = new iq0(this, context);
        this.I = iq0Var;
        rl0Var.setAdapter(iq0Var);
        int i24 = org.telegram.ui.ActionBar.j6.A5;
        rl0Var.setGlowColor(getThemedColor(i24));
        rl0Var.setVerticalScrollBarEnabled(false);
        rl0Var.setHorizontalScrollBarEnabled(false);
        rl0Var.setOverScrollMode(2);
        rl0Var.setSelectorDrawableColor(0);
        int i25 = 5;
        rl0Var.setItemSelectorColorProvider(new lh0(i25));
        rl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        rl0Var.setClipToPadding(false);
        rl0Var.i(new nh.k(i18));
        rl0Var.setOnItemClickListener(new hl0(this) { // from class: org.telegram.ui.Components.gp0
            public final /* synthetic */ lq0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.hl0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i26, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i13) {
                    case 0:
                        lq0.p(this.b, i26);
                        break;
                    case 1:
                        if (i26 >= 0) {
                            lq0 lq0Var = this.b;
                            ArrayList arrayList3 = lq0Var.H.d;
                            int i27 = i26 - 1;
                            TLRPC.Dialog dialog = (i27 < 0 || i27 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i27);
                            if (dialog != null) {
                                lq0Var.U0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i26 >= 0) {
                            lq0 lq0Var2 = this.b;
                            hq0 hq0Var = lq0Var2.J;
                            lq0 lq0Var3 = hq0Var.H;
                            int i28 = hq0Var.B;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i26 < i28 || i28 < 0) {
                                int i29 = i26 - 1;
                                if (i29 >= 0) {
                                    if (i29 < hq0Var.d.size()) {
                                        tL_dialog2 = ((zp0) hq0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - hq0Var.d.size();
                                        ArrayList arrayList4 = hq0Var.e.d;
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
                                    lq0Var2.U0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i26 - i28;
                                if (i30 >= 0 && i30 < lq0Var3.B0.size()) {
                                    TLObject tLObject2 = ((tf.y) lq0Var3.B0.get(i30)).a;
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
        rl0Var.setVisibility(8);
        this.containerView.addView(rl0Var, k7.b6.e(-1, -1, 51));
        lp0 lp0Var3 = new lp0(this, context, this.resourcesProvider, i13);
        this.C = lp0Var3;
        lp0Var3.setSelectorDrawableColor(0);
        lp0Var3.setItemSelectorColorProvider(new lh0(i25));
        lp0Var3.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        lp0Var3.setClipToPadding(false);
        getContext();
        f2.w wVar2 = new f2.w(4);
        this.E = wVar2;
        lp0Var3.setLayoutManager(wVar2);
        this.R0 = new ng.k(lp0Var3, this.containerView, new yv(lp0Var3, i18));
        wVar2.O = new mp0(this, i13);
        lp0Var3.setHorizontalScrollBarEnabled(false);
        lp0Var3.setVerticalScrollBarEnabled(false);
        lp0Var3.setOverScrollMode(2);
        lp0Var3.i(new nh.k(4));
        this.containerView.addView(lp0Var3, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        dq0 dq0Var = new dq0(this, context);
        this.H = dq0Var;
        lp0Var3.setAdapter(dq0Var);
        lp0Var3.setGlowColor(getThemedColor(i24));
        lp0Var3.setOnItemClickListener(new hl0(this) { // from class: org.telegram.ui.Components.gp0
            public final /* synthetic */ lq0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.hl0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i26, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i12) {
                    case 0:
                        lq0.p(this.b, i26);
                        break;
                    case 1:
                        if (i26 >= 0) {
                            lq0 lq0Var = this.b;
                            ArrayList arrayList3 = lq0Var.H.d;
                            int i27 = i26 - 1;
                            TLRPC.Dialog dialog = (i27 < 0 || i27 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i27);
                            if (dialog != null) {
                                lq0Var.U0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i26 >= 0) {
                            lq0 lq0Var2 = this.b;
                            hq0 hq0Var = lq0Var2.J;
                            lq0 lq0Var3 = hq0Var.H;
                            int i28 = hq0Var.B;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i26 < i28 || i28 < 0) {
                                int i29 = i26 - 1;
                                if (i29 >= 0) {
                                    if (i29 < hq0Var.d.size()) {
                                        tL_dialog2 = ((zp0) hq0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - hq0Var.d.size();
                                        ArrayList arrayList4 = hq0Var.e.d;
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
                                    lq0Var2.U0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i26 - i28;
                                if (i30 >= 0 && i30 < lq0Var3.B0.size()) {
                                    TLObject tLObject2 = ((tf.y) lq0Var3.B0.get(i30)).a;
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
        lp0Var3.setOnScrollListener(new kp0(this, i12));
        lp0 lp0Var4 = new lp0(this, context, this.resourcesProvider, i12);
        this.D = lp0Var4;
        lp0Var4.setItemSelectorColorProvider(new lh0(i25));
        lp0Var4.setSelectorDrawableColor(0);
        lp0Var4.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        lp0Var4.setClipToPadding(false);
        getContext();
        oz ozVar = new oz(4, 0, lp0Var4);
        this.G = ozVar;
        lp0Var4.setLayoutManager(ozVar);
        ozVar.O = new mp0(this, i12);
        final int i26 = 2;
        lp0Var4.setOnItemClickListener(new hl0(this) { // from class: org.telegram.ui.Components.gp0
            public final /* synthetic */ lq0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.hl0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i262, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i26) {
                    case 0:
                        lq0.p(this.b, i262);
                        break;
                    case 1:
                        if (i262 >= 0) {
                            lq0 lq0Var = this.b;
                            ArrayList arrayList3 = lq0Var.H.d;
                            int i27 = i262 - 1;
                            TLRPC.Dialog dialog = (i27 < 0 || i27 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i27);
                            if (dialog != null) {
                                lq0Var.U0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i262 >= 0) {
                            lq0 lq0Var2 = this.b;
                            hq0 hq0Var = lq0Var2.J;
                            lq0 lq0Var3 = hq0Var.H;
                            int i28 = hq0Var.B;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i262 < i28 || i28 < 0) {
                                int i29 = i262 - 1;
                                if (i29 >= 0) {
                                    if (i29 < hq0Var.d.size()) {
                                        tL_dialog2 = ((zp0) hq0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - hq0Var.d.size();
                                        ArrayList arrayList4 = hq0Var.e.d;
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
                                    lq0Var2.U0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i262 - i28;
                                if (i30 >= 0 && i30 < lq0Var3.B0.size()) {
                                    TLObject tLObject2 = ((tf.y) lq0Var3.B0.get(i30)).a;
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
        lp0Var4.setHasFixedSize(true);
        lp0Var4.setItemAnimator(null);
        lp0Var4.setHorizontalScrollBarEnabled(false);
        lp0Var4.setVerticalScrollBarEnabled(false);
        lp0Var4.setOnScrollListener(new kp0(this, i26));
        lp0Var4.i(new nh.k(i25));
        lp0Var4.setAdapter(this.J);
        lp0Var4.setGlowColor(getThemedColor(i24));
        this.u0 = new yk0(lp0Var4, true);
        u00 u00Var = new u00(context, this.resourcesProvider);
        u00Var.setViewType(12);
        zw0 zw0Var = new zw0(context, u00Var, 1, this.resourcesProvider);
        this.N = zw0Var;
        zw0Var.addView(u00Var, 0);
        zw0Var.setAnimateLayoutChange(true);
        zw0Var.e(false, false);
        boolean z13 = this.e0;
        ih.s sVar = zw0Var.d;
        if (z13) {
            sVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.ng));
        }
        sVar.setText(LocaleController.getString(R.string.NoResult));
        lp0Var4.setEmptyView(zw0Var);
        lp0Var4.setHideIfEmpty(false);
        lp0Var4.V1 = true;
        lp0Var4.W1 = 0;
        this.containerView.addView(zw0Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.containerView.addView(lp0Var4, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        eg.h0 h0Var = new eg.h0(this, context, 16);
        this.n = h0Var;
        this.containerView.addView(h0Var, k7.b6.e(-1, 300, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp((!this.e0 || this.l0[1] == null) ? 58.0f : 111.0f);
        this.P[0] = new View(context);
        View view = this.P[0];
        int i27 = org.telegram.ui.ActionBar.j6.V5;
        view.setBackgroundColor(getThemedColor(i27));
        this.P[0].setAlpha(0.0f);
        this.P[0].setTag(1);
        this.containerView.addView(this.P[0], layoutParams);
        this.containerView.addView(frameLayout, k7.b6.e(-1, (!this.e0 || this.l0[1] == null) ? 58 : 111, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.P[1] = new View(context);
        this.P[1].setBackgroundColor(getThemedColor(i27));
        this.P[1].setLayoutParams(layoutParams2);
        if (!this.k0 && this.l0[0] == null) {
            this.P[1].setAlpha(0.0f);
            lp0Var = lp0Var3;
            lp0Var2 = lp0Var4;
            f10 = 4.0f;
            f11 = 22.0f;
        } else {
            f10 = 4.0f;
            if (this.e0) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                f11 = 22.0f;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.r = frameLayout3;
                frameLayout2.addView(frameLayout3, k7.b6.d(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, k7.b6.e(-1, -1, 119));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                k7.d6.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new dp0(this, 3));
                org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                this.s = k5Var;
                k5Var.setTextSize(15);
                k5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Tk));
                k5Var.setEllipsizeByGradient(true);
                Z0();
                linearLayout3.addView(k5Var, k7.b6.p(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                textView.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                textView.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                int i28 = org.telegram.ui.ActionBar.j6.i6;
                textView.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(i28), 4, 4));
                linearLayout3.addView(textView, k7.b6.p(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new dp0(this, 4));
                k7.d6.a(textView);
                lp0Var = lp0Var3;
                lp0Var2 = lp0Var4;
                this.containerView.addView(frameLayout2, k7.b6.e(-1, 58, 83));
                ArrayList arrayList3 = this.K;
                if (arrayList3 != null && arrayList3.size() > 0 && ((MessageObject) this.K.get(0)).messageOwner != null && ((MessageObject) this.K.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject3 = (MessageObject) this.K.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject3.getDialogId()))) && !messageObject3.isForwarded()) {
                        final int i29 = 0;
                        linearLayout = org.telegram.messenger.y3.f(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jp0
                            public final /* synthetic */ lq0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i29) {
                                    case 0:
                                        lq0 lq0Var = this.b;
                                        org.telegram.ui.ActionBar.p2 p2Var = lq0Var.c0;
                                        if (p2Var == null) {
                                            p2Var = LaunchActivity.U();
                                        }
                                        if (p2Var != null) {
                                            lq0Var.dismiss();
                                            p2Var.presentFragment(new org.telegram.ui.cj0(messageObject3));
                                            break;
                                        }
                                        break;
                                    default:
                                        lq0 lq0Var2 = this.b;
                                        org.telegram.ui.ActionBar.p2 p2Var2 = lq0Var2.c0;
                                        if (p2Var2 == null) {
                                            p2Var2 = LaunchActivity.U();
                                        }
                                        if (p2Var2 != null) {
                                            lq0Var2.dismiss();
                                            p2Var2.presentFragment(new org.telegram.ui.cj0(messageObject3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(i28), 6, 6));
                        k7.d6.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i30 = org.telegram.ui.ActionBar.j6.Vk;
                        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i30), PorterDuff.Mode.SRC_IN));
                        linearLayout.addView(imageView, k7.b6.o(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        textView2.setTextColor(getThemedColor(i30));
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(LocaleController.formatNumber(messageObject3.messageOwner.forwards, ','));
                        linearLayout.addView(textView2, k7.b6.p(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i11 = 8;
                        linearLayout2.addView(linearLayout3, k7.b6.p(-1, 42, 1.0f, 23, 11, 0, i11, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, k7.b6.p(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                linearLayout = null;
                i11 = 11;
                linearLayout2.addView(linearLayout3, k7.b6.p(-1, 42, 1.0f, 23, 11, 0, i11, 0));
                if (linearLayout != null) {
                }
            } else {
                lp0Var = lp0Var3;
                lp0Var2 = lp0Var4;
                f11 = 22.0f;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.h = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.r = frameLayout5;
                frameLayout4.addView(frameLayout5, k7.b6.d(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i31 = org.telegram.ui.ActionBar.j6.i6;
                textView3.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i31), 2, AndroidUtilities.dp(22.0f)));
                textView3.setTextColor(getThemedColor(this.e0 ? org.telegram.ui.ActionBar.j6.pg : org.telegram.ui.ActionBar.j6.n5));
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setGravity(17);
                if (this.e0 && this.l0[1] != null) {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupCopySpeakerLinkNoCaps).toUpperCase());
                } else {
                    textView3.setText(LocaleController.getString(R.string.CopyLink).toUpperCase());
                }
                textView3.setOnClickListener(new dp0(this, 5));
                frameLayout5.addView(textView3, k7.b6.e(-1, -1, 119));
                this.containerView.addView(frameLayout4, k7.b6.e(-1, 58, 87));
                ArrayList arrayList4 = this.K;
                if (arrayList4 != null && arrayList4.size() > 0 && ((MessageObject) this.K.get(0)).messageOwner != null && ((MessageObject) this.K.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject4 = (MessageObject) this.K.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject4.getDialogId()))) && !messageObject4.isForwarded()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.x = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        linearLayout4.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(this.e0 ? org.telegram.ui.ActionBar.j6.eg : i31), 2, AndroidUtilities.dp(22.0f)));
                        frameLayout5.addView(linearLayout4, k7.b6.d(-2, 48.0f, 85, 6.0f, 0.0f, -6.0f, 0.0f));
                        final int i32 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jp0
                            public final /* synthetic */ lq0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i32) {
                                    case 0:
                                        lq0 lq0Var = this.b;
                                        org.telegram.ui.ActionBar.p2 p2Var = lq0Var.c0;
                                        if (p2Var == null) {
                                            p2Var = LaunchActivity.U();
                                        }
                                        if (p2Var != null) {
                                            lq0Var.dismiss();
                                            p2Var.presentFragment(new org.telegram.ui.cj0(messageObject4));
                                            break;
                                        }
                                        break;
                                    default:
                                        lq0 lq0Var2 = this.b;
                                        org.telegram.ui.ActionBar.p2 p2Var2 = lq0Var2.c0;
                                        if (p2Var2 == null) {
                                            p2Var2 = LaunchActivity.U();
                                        }
                                        if (p2Var2 != null) {
                                            lq0Var2.dismiss();
                                            p2Var2.presentFragment(new org.telegram.ui.cj0(messageObject4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(this.e0 ? org.telegram.ui.ActionBar.j6.pg : org.telegram.ui.ActionBar.j6.n5), PorterDuff.Mode.MULTIPLY));
                        linearLayout4.addView(imageView2, k7.b6.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(messageObject4.messageOwner.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTextColor(getThemedColor(this.e0 ? org.telegram.ui.ActionBar.j6.pg : org.telegram.ui.ActionBar.j6.n5));
                        textView4.setGravity(16);
                        textView4.setTypeface(AndroidUtilities.bold());
                        linearLayout4.addView(textView4, k7.b6.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.v = frameLayout6;
        this.containerView.addView(frameLayout6, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.r != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w = frameLayout7;
        this.containerView.addView(frameLayout7, k7.b6.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        np0 np0Var = new np0(this, context, 0);
        this.c = np0Var;
        np0Var.setWillNotDraw(false);
        np0Var.setAlpha(0.0f);
        np0Var.setVisibility(4);
        this.containerView.addView(np0Var, k7.b6.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        np0Var.setOnTouchListener(new oh.d(22));
        AndroidUtilities.setLightNavigationBar(this.container, AndroidUtilities.computePerceivedBrightness(getThemedColor(i22)) > 0.721f);
        op0 op0Var = new op0(this, context, wp0Var, this.resourcesProvider);
        this.d = op0Var;
        op0Var.G = true;
        if (this.e0) {
            ut editText = op0Var.getEditText();
            int i33 = org.telegram.ui.ActionBar.j6.ng;
            editText.setTextColor(getThemedColor(i33));
            op0Var.getEditText().setCursorColor(getThemedColor(i33));
        }
        op0Var.setHint(LocaleController.getString(R.string.ShareComment));
        op0Var.s();
        op0Var.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
        np0Var.addView(op0Var, k7.b6.e(-1, -2, 51));
        np0Var.setClipChildren(false);
        np0Var.setClipToPadding(false);
        op0Var.setClipChildren(false);
        op0Var.getEditText().addTextChangedListener(new dh.c(this, 12));
        np0 np0Var2 = new np0(this, context, 1);
        this.f = np0Var2;
        np0Var2.setFocusable(true);
        np0Var2.setFocusableInTouchMode(true);
        np0Var2.setVisibility(4);
        np0Var2.setScaleX(0.2f);
        np0Var2.setScaleY(0.2f);
        np0Var2.setAlpha(0.0f);
        this.containerView.addView(np0Var2, k7.b6.e(110, 50, 85));
        pp0 pp0Var = new pp0((NotificationCenter.NotificationCenterDelegate) this, context, R.drawable.send_plane_24, this.resourcesProvider, 0);
        this.e = pp0Var;
        int dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        pp0Var.F = dp;
        pp0Var.G = dp2;
        float dp3 = AndroidUtilities.dp(1.0f);
        float dp4 = AndroidUtilities.dp(6.0f);
        pp0Var.J = dp3;
        pp0Var.K = dp4;
        pp0Var.e0 = true;
        np0Var2.addView(pp0Var, k7.b6.g());
        pp0Var.setOnClickListener(new dp0(this, 6));
        pp0Var.setOnLongClickListener(new n10(this, 2));
        this.g0.setTextSize(AndroidUtilities.dp(12.0f));
        this.g0.setTypeface(AndroidUtilities.bold());
        if (num != null) {
            this.Y = num.intValue();
            FrameLayout frameLayout8 = new FrameLayout(context);
            this.Z = frameLayout8;
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.a0 = linearLayout5;
            linearLayout5.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f10));
            linearLayout5.setClipToPadding(false);
            linearLayout5.setOrientation(0);
            linearLayout5.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(org.telegram.ui.ActionBar.j6.i6), 6, 6));
            kp kpVar = new kp(context, 24, this.resourcesProvider);
            this.b0 = kpVar;
            kpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
            kpVar.setDrawUnchecked(true);
            kpVar.a(false, false);
            kpVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(kpVar, k7.b6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            textView5.setTextColor(getThemedColor(i23));
            textView5.setTextSize(1, 14.0f);
            textView5.setText(LocaleController.formatString(R.string.VideoShareAddTimestamp, AndroidUtilities.formatShortDuration(num.intValue())));
            linearLayout5.addView(textView5, k7.b6.t(-2, -2, 16, 9, 0, 0, 0));
            k7.d6.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new dp0(this, 0));
            frameLayout8.addView(linearLayout5, k7.b6.e(-2, -2, 17));
            if (this.h == null) {
                View view2 = new View(context);
                view2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d7));
                frameLayout8.addView(view2, k7.b6.a(-1.0f, this.e0 ? 0.66f : 1.0f / AndroidUtilities.density, 55));
            }
            this.containerView.addView(frameLayout8, k7.b6.e(-1, 58, 83));
            if (this.h == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        ng.b bVar = new ng.b(this.Q0.c(h0Var, null, false));
        this.T0 = bVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        bVar.b(AndroidUtilities.dp(72.0f), true);
        pg.b c3 = this.P0.c(this.A0, rg.b.e(this.resourcesProvider), false);
        this.S0 = c3;
        c3.k = true;
        c3.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c3.t(AndroidUtilities.dp(32.0f));
        c3.h.g = 0.4f;
        c3.j();
        pg.b c10 = this.O0.c(np0Var, rg.b.e(this.resourcesProvider), false);
        this.U0 = c10;
        c10.p(AndroidUtilities.dp(f11));
        c10.o(AndroidUtilities.dp(9.0f));
        np0Var.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        FrameLayout frameLayout9 = this.r;
        if (frameLayout9 != null) {
            pg.b c11 = this.O0.c(frameLayout9, rg.b.e(this.resourcesProvider), false);
            c11.o(AndroidUtilities.dp(9.0f));
            c11.p(AndroidUtilities.dp(f11));
            this.r.setBackground(c11);
            this.r.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        FrameLayout frameLayout10 = this.Z;
        if (frameLayout10 != null) {
            pg.b c12 = this.O0.c(frameLayout10, rg.b.e(this.resourcesProvider), false);
            c12.o(AndroidUtilities.dp(9.0f));
            c12.p(AndroidUtilities.dp(f11));
            this.Z.setBackground(c12);
            this.Z.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        a1(0);
        org.telegram.ui.qy.i4(AccountInstance.getInstance(this.currentAccount));
        if (dq0Var.d.isEmpty()) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        }
        int i34 = this.currentAccount;
        int i35 = 0;
        MessagesStorage.getInstance(i34).getStorageQueue().postRunnable(new j3.v(i34, i35, new qp0(this), 14));
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        AndroidUtilities.updateViewVisibilityAnimated(lp0Var, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(lp0Var2, false, 1.0f, false);
        org.telegram.ui.ActionBar.e3 container = getContainer();
        ep0 ep0Var = new ep0(this, i35);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(container, ep0Var);
    }

    public void S0(View view) {
    }

    public void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
    }
}
