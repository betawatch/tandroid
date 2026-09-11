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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class hq0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int a1 = 0;
    public boolean A0;
    public o1.k B0;
    public TLRPC.Dialog C0;
    public final sp0 D0;
    public final ll0 E;
    public ArrayList E0;
    public final jp0 F;
    public TL_stories.StoryItem F0;
    public final jp0 G;
    public i0.c G0;
    public final s4.s H;
    public int H0;
    public final s4.s I;
    public boolean I0;
    public final oz J;
    public org.telegram.ui.ActionBar.n1 J0;
    public final zp0 K;
    public int K0;
    public final eq0 L;
    public boolean L0;
    public final dq0 M;
    public boolean M0;
    public final ArrayList N;
    public int N0;
    public final String[] O;
    public final bh.f O0;
    public final int P;
    public final gh.d P0;
    public final xw0 Q;
    public final gh.d Q0;
    public final Drawable R;
    public final bh.b R0;
    public final View[] S;
    public final bh.b S0;
    public final AnimatorSet[] T;
    public final bh.b T0;
    public final a0.i U;
    public final bh.l U0;
    public final HashMap V;
    public final dh.d V0;
    public final tp0 W;
    public final bh.c W0;
    public int X;
    public final dh.d X0;
    public boolean Y;
    public final ArrayList Y0;
    public final boolean Z;
    public final RectF Z0;
    public boolean a0;
    public final FrameLayout b;
    public final int b0;
    public final lp0 c;
    public final FrameLayout c0;
    public final mp0 d;
    public final LinearLayout d0;
    public final ji.x1 e;
    public final mp e0;
    public final lp0 f;
    public final org.telegram.ui.co f0;
    public final Activity g0;
    public final FrameLayout h;
    public final boolean h0;
    public boolean i0;
    public final TextPaint j0;
    public TLRPC.TL_exportedMessageLink k0;
    public boolean l0;
    public boolean m0;
    public final di.eb n;
    public final boolean n0;
    public final String[] o0;
    public int p0;
    public int q0;
    public final FrameLayout r;
    public boolean r0;
    public final org.telegram.ui.ActionBar.j5 s;
    public wp0 s0;
    public float t0;
    public float u0;
    public final FrameLayout v;
    public float v0;
    public final FrameLayout w;
    public ValueAnimator w0;
    public final LinearLayout x;
    public final qk0 x0;
    public AnimatorSet y;
    public final b20 y0;
    public final org.telegram.ui.ActionBar.k z0;

    public hq0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, f6Var);
    }

    public static void A0(hq0 hq0Var) {
        RectF rectF = hq0Var.Z0;
        bh.f fVar = hq0Var.O0;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        rectF.set(0.0f, 0.0f, hq0Var.containerView.getMeasuredWidth(), hq0Var.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(1, hq0Var.Y0);
        fVar.e(hq0Var.U0, hq0Var.containerView.getMeasuredWidth(), hq0Var.containerView.getMeasuredHeight());
    }

    public static int F0(hq0 hq0Var) {
        jp0 jp0Var = hq0Var.F;
        if (jp0Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = jp0Var.getChildAt(0);
        vk0 vk0Var = (vk0) jp0Var.G(childAt);
        if (vk0Var == null) {
            return -1000;
        }
        int paddingTop = jp0Var.getPaddingTop();
        if (vk0Var.c() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    public static hq0 N0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        return new hq0(context, messageObject != null ? org.telegram.messenger.w1.l(messageObject) : null, str, null, z10, str2, null, false);
    }

    public static /* synthetic */ void m(hq0 hq0Var, AtomicReference atomicReference, op0 op0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        op0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, hq0Var.currentAccount, Long.valueOf(-dialog.id));
    }

    public static boolean n(final hq0 hq0Var) {
        org.telegram.ui.co coVar;
        ji.x1 x1Var = hq0Var.e;
        boolean z10 = hq0Var.h0;
        Activity activity = hq0Var.g0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(hq0Var.getContext());
        linearLayout.setOrientation(1);
        if (hq0Var.N != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, hq0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new pp0(hq0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new cp0(hq0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, hq0Var.getContext(), hq0Var.resourcesProvider, true, false);
            if (z10) {
                f1Var.setTextColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var, w7.x5.n(-1, 48));
            f1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            hq0Var.I0 = true;
            f1Var.setChecked(true);
            final org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(1, hq0Var.getContext(), hq0Var.resourcesProvider, false, true);
            if (z10) {
                f1Var2.setTextColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, w7.x5.n(-1, 48));
            f1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            f1Var2.setChecked(!hq0Var.I0);
            final int i10 = 0;
            f1Var.setOnClickListener(new View.OnClickListener(hq0Var) { // from class: org.telegram.ui.Components.fp0
                public final /* synthetic */ hq0 b;

                {
                    this.b = hq0Var;
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
            f1Var2.setOnClickListener(new View.OnClickListener(hq0Var) { // from class: org.telegram.ui.Components.fp0
                public final /* synthetic */ hq0 b;

                {
                    this.b = hq0Var;
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
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.x5.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, hq0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new pp0(hq0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new cp0(hq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, hq0Var.getContext(), hq0Var.resourcesProvider, true, true);
        if (z10) {
            f1Var3.setTextColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ng));
            f1Var3.setIconColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        }
        f1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        f1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(f1Var3, w7.x5.n(-1, 48));
        f1Var3.setOnClickListener(new bp0(hq0Var, 1));
        org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(0, hq0Var.getContext(), hq0Var.resourcesProvider, true, true);
        if (z10) {
            f1Var4.setTextColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ng));
            f1Var4.setIconColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        }
        f1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        f1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(f1Var4, w7.x5.n(-1, 48));
        f1Var4.setOnClickListener(new bp0(hq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, w7.x5.n(-1, -2));
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        hq0Var.J0 = n1Var;
        n1Var.b = false;
        n1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        hq0Var.J0.setOutsideTouchable(true);
        hq0Var.J0.setClippingEnabled(true);
        hq0Var.J0.setInputMethodMode(2);
        hq0Var.J0.setSoftInputMode(0);
        hq0Var.J0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        hq0Var.J0.setFocusable(true);
        int[] iArr = new int[2];
        x1Var.getLocationInWindow(iArr);
        hq0Var.J0.showAtLocation(x1Var, 51, AndroidUtilities.dp(8.0f) + ((x1Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!hq0Var.keyboardVisible || (coVar = hq0Var.f0) == null || coVar.X0.getMeasuredHeight() <= AndroidUtilities.dp(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f) : x1Var.getMeasuredHeight() + iArr[1]);
        hq0Var.J0.b();
        try {
            x1Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void o(hq0 hq0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
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
        lp0 lp0Var;
        long j11;
        long j12;
        Long l4;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue;
        String[] strArr2 = hq0Var.O;
        mp0 mp0Var = hq0Var.d;
        lp0 lp0Var2 = hq0Var.c;
        HashMap hashMap2 = hq0Var.V;
        Long l10 = 0L;
        a0.i iVar = hq0Var.U;
        ArrayList arrayList3 = hq0Var.N;
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
                boolean isMonoForum = MessagesController.getInstance(hq0Var.currentAccount).isMonoForum(j13);
                Long l11 = hashMap == null ? l10 : (Long) hashMap.get(Long.valueOf(j13));
                if (l11 != null && l11.longValue() > 0) {
                    z12 = true;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap2.get(iVar.f(j13));
                if (tL_forumTopic2 == null || !isMonoForum) {
                    lp0Var = lp0Var2;
                    j11 = j13;
                    j12 = 0;
                } else {
                    lp0Var = lp0Var2;
                    j11 = j13;
                    j12 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                }
                if (tL_forumTopic2 == null || isMonoForum) {
                    l4 = l10;
                    messageObject3 = null;
                } else {
                    l4 = l10;
                    messageObject3 = new MessageObject(hq0Var.currentAccount, tL_forumTopic2.topicStartMessage, false, false);
                }
                if (messageObject3 != null) {
                    messageObject3.isTopicMainMessage = true;
                }
                if (lp0Var.getTag() == null || mp0Var.a.length() <= 0) {
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
                    SendMessagesHelper.getInstance(hq0Var.currentAccount).sendMessage(of3);
                }
                long j14 = j11;
                int sendMessage = SendMessagesHelper.getInstance(hq0Var.currentAccount).sendMessage(hq0Var.N, j14, !hq0Var.I0, false, z10, 0, 0, messageObject4, i10, l11 == null ? 0L : l11.longValue(), j12, null);
                if (sendMessage != 0) {
                    arrayList4.add(Long.valueOf(j14));
                }
                if (iVar.m() == 1) {
                    tL_forumTopic = null;
                    e5.t0(sendMessage, hq0Var.f0, null);
                    if (sendMessage != 0) {
                        break;
                    }
                }
                i13++;
                arrayList3 = arrayList2;
                lp0Var2 = lp0Var;
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
                hq0Var.R0(iVar, arrayList2.size(), iVar.m() == 1 ? (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(0)) : tL_forumTopic, !z12);
            }
        } else {
            tp0 tp0Var = hq0Var.W;
            int i15 = tp0Var != null ? tp0Var.d : 0;
            if (hq0Var.F0 != null) {
                int i16 = 0;
                boolean z13 = false;
                while (i16 < iVar.m()) {
                    long j15 = iVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(hq0Var.currentAccount).isMonoForum(j15);
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
                        messageObject2 = new MessageObject(hq0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    }
                    if (hq0Var.F0 != null) {
                        if (lp0Var2.getTag() != null && mp0Var.a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(hq0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j15, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j15, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = hq0Var.F0;
                    } else if (lp0Var2.getTag() == null || mp0Var.a.length() <= 0) {
                        of2 = SendMessagesHelper.SendMessageParams.of(strArr[i12], j15, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                    } else {
                        CharSequence charSequence2 = charSequenceArr[0];
                        of2 = SendMessagesHelper.SendMessageParams.of(charSequence2 == null ? null : charSequence2.toString(), j15, messageObject2, messageObject2, null, true, arrayList, null, null, z10, 0, 0, null, false);
                    }
                    of2.payStars = l12 == null ? 0L : l12.longValue();
                    of2.monoForumPeer = j10;
                    SendMessagesHelper.getInstance(hq0Var.currentAccount).sendMessage(of2);
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
                        boolean isMonoForum3 = MessagesController.getInstance(hq0Var.currentAccount).isMonoForum(j16);
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
                            messageObject = new MessageObject(hq0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                        }
                        if (lp0Var2.getTag() == null || mp0Var.a.length() <= 0) {
                            j3 = j16;
                        } else {
                            CharSequence charSequence3 = charSequenceArr[c10];
                            SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(charSequence3 == null ? null : charSequence3.toString(), j16, messageObject, messageObject, null, true, arrayList, null, null, z10, 0, 0, null, false);
                            j3 = j16;
                            of4.payStars = l13 == null ? 0L : l13.longValue();
                            of4.monoForumPeer = peerDialogId;
                            SendMessagesHelper.getInstance(hq0Var.currentAccount).sendMessage(of4);
                        }
                        SendMessagesHelper.SendMessageParams of5 = SendMessagesHelper.SendMessageParams.of(strArr2[i17], j3, messageObject, messageObject, null, true, null, null, null, z10, 0, 0, null, false);
                        of5.payStars = l13 == null ? 0L : l13.longValue();
                        of5.monoForumPeer = peerDialogId;
                        SendMessagesHelper.getInstance(hq0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z14;
                } else {
                    i11 = 0;
                    z11 = false;
                    hq0Var.R0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i11)), !z11);
                }
            }
            i11 = 0;
            hq0Var.R0(iVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(iVar.n(i11)), !z11);
        }
        wp0 wp0Var = hq0Var.s0;
        if (wp0Var != null) {
            wp0Var.U();
        }
        hq0Var.dismiss();
    }

    public static void p(hq0 hq0Var, int i10) {
        TLRPC.Dialog dialog;
        b20 b20Var = hq0Var.y0;
        HashMap hashMap = hq0Var.V;
        a0.i iVar = hq0Var.U;
        zp0 zp0Var = hq0Var.K;
        eq0 eq0Var = hq0Var.L;
        if (eq0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = hq0Var.C0;
            if (dialog2 == null) {
                return;
            }
            iVar.k(dialog2, dialog2.id);
            hashMap.remove(dialog2);
            hq0Var.a1(2);
            if (hq0Var.L0 || hq0Var.M0) {
                if (((TLRPC.Dialog) zp0Var.e.f(dialog2.id)) == null) {
                    zp0Var.e.k(dialog2, dialog2.id);
                    ArrayList arrayList = zp0Var.d;
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                zp0Var.l();
                hq0Var.A0 = false;
                b20Var.r.setText("");
                hq0Var.K0(false);
            }
            for (int i11 = 0; i11 < hq0Var.P0().getChildCount(); i11++) {
                View childAt = hq0Var.P0().getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.f7) {
                    org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                    if (f7Var.getCurrentDialog() == hq0Var.C0.id) {
                        f7Var.d(null, false, true);
                        f7Var.b(true, true);
                    }
                }
            }
            hq0Var.L0();
            return;
        }
        TLRPC.TL_forumTopic E = eq0Var.E(i10);
        if (E == null || (dialog = hq0Var.C0) == null) {
            return;
        }
        long j3 = dialog.id;
        boolean isMonoForum = MessagesController.getInstance(hq0Var.currentAccount).isMonoForum(j3);
        TLRPC.Dialog dialog3 = hq0Var.C0;
        iVar.k(dialog3, j3);
        hashMap.put(dialog3, E);
        hq0Var.a1(2);
        if (hq0Var.L0 || hq0Var.M0) {
            if (((TLRPC.Dialog) zp0Var.e.f(dialog3.id)) == null) {
                zp0Var.e.k(dialog3, dialog3.id);
                ArrayList arrayList2 = zp0Var.d;
                arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
            }
            zp0Var.l();
            hq0Var.A0 = false;
            b20Var.r.setText("");
            hq0Var.K0(false);
        }
        for (int i12 = 0; i12 < hq0Var.P0().getChildCount(); i12++) {
            View childAt2 = hq0Var.P0().getChildAt(i12);
            if (childAt2 instanceof org.telegram.ui.Cells.f7) {
                org.telegram.ui.Cells.f7 f7Var2 = (org.telegram.ui.Cells.f7) childAt2;
                if (f7Var2.getCurrentDialog() == hq0Var.C0.id) {
                    f7Var2.d(E, isMonoForum, true);
                    f7Var2.b(true, true);
                }
            }
        }
        hq0Var.L0();
    }

    public static void s0(hq0 hq0Var) {
        jp0 jp0Var = hq0Var.F;
        jp0 jp0Var2 = hq0Var.G;
        ll0 ll0Var = hq0Var.E;
        if (hq0Var.r0) {
            return;
        }
        jp0 jp0Var3 = hq0Var.L0 ? jp0Var2 : jp0Var;
        if (jp0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = jp0Var3.getChildAt(0);
        for (int i10 = 0; i10 < jp0Var3.getChildCount(); i10++) {
            if (jp0Var3.getChildAt(i10).getTop() < childAt.getTop()) {
                childAt = jp0Var3.getChildAt(i10);
            }
        }
        vk0 vk0Var = (vk0) jp0Var3.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i11 = (top <= 0 || vk0Var == null || vk0Var.b() != 0) ? 0 : top;
        if (top < 0 || vk0Var == null || vk0Var.b() != 0) {
            hq0Var.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            hq0Var.T0(true);
            top = i11;
        } else {
            hq0Var.K0 = childAt.getTop();
            hq0Var.T0(false);
        }
        if (ll0Var.getVisibility() == 0) {
            if (ll0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = ll0Var.getChildAt(0);
            for (int i12 = 0; i12 < ll0Var.getChildCount(); i12++) {
                if (ll0Var.getChildAt(i12).getTop() < childAt2.getTop()) {
                    childAt2 = ll0Var.getChildAt(i12);
                }
            }
            vk0 vk0Var2 = (vk0) ll0Var.G(childAt2);
            int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
            int i13 = (top2 <= 0 || vk0Var2 == null || vk0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || vk0Var2 == null || vk0Var2.b() != 0) {
                hq0Var.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                hq0Var.T0(true);
                top2 = i13;
            } else {
                hq0Var.K0 = childAt2.getTop();
                hq0Var.T0(false);
            }
            top = AndroidUtilities.lerp(top, top2, ll0Var.getAlpha());
        }
        int i14 = hq0Var.p0;
        if (i14 != top) {
            hq0Var.q0 = i14;
            float f7 = top;
            int i15 = (int) (hq0Var.t0 + f7);
            hq0Var.p0 = i15;
            jp0Var.setTopGlowOffset(i15);
            int i16 = (int) (hq0Var.t0 + f7);
            hq0Var.p0 = i16;
            jp0Var2.setTopGlowOffset(i16);
            int i17 = (int) (f7 + hq0Var.t0);
            hq0Var.p0 = i17;
            ll0Var.setTopGlowOffset(i17);
            hq0Var.b.setTranslationY(hq0Var.p0 + hq0Var.t0);
            hq0Var.Q.setTranslationY(hq0Var.p0 + hq0Var.t0);
            hq0Var.containerView.invalidate();
        }
    }

    public final void K0(boolean z10) {
        b20 b20Var = this.y0;
        di.h2 h2Var = b20Var.r;
        di.h2 h2Var2 = b20Var.r;
        boolean isEmpty = TextUtils.isEmpty(h2Var.getText());
        jp0 jp0Var = this.F;
        jp0 jp0Var2 = this.G;
        boolean z11 = true;
        if (!isEmpty || ((this.keyboardVisible && h2Var2.hasFocus()) || this.M0)) {
            this.A0 = true;
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(jp0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(jp0Var2, true);
            }
        } else {
            if (this.C0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(jp0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(jp0Var2, false);
            }
            z11 = false;
        }
        if (this.L0 != z11 || z10) {
            this.L0 = z11;
            dq0 dq0Var = this.M;
            dq0Var.l();
            this.K.l();
            if (this.L0) {
                if (this.K0 == Integer.MAX_VALUE) {
                    ((s4.c0) jp0Var2.getLayoutManager()).h1(0, -jp0Var2.getPaddingTop());
                } else {
                    ((s4.c0) jp0Var2.getLayoutManager()).h1(0, this.K0 - jp0Var2.getPaddingTop());
                }
                dq0Var.E(h2Var2.getText().toString());
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

    public final void L0() {
        TLRPC.Dialog dialog = this.C0;
        if (dialog == null) {
            return;
        }
        View view = null;
        this.C0 = null;
        for (int i10 = 0; i10 < P0().getChildCount(); i10++) {
            View childAt = P0().getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.f7) && ((org.telegram.ui.Cells.f7) childAt).getCurrentDialog() == dialog.id) {
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
        P0().setVisibility(0);
        b20 b20Var = this.y0;
        b20Var.setVisibility(0);
        di.h2 h2Var = b20Var.r;
        if (this.L0 || this.M0) {
            this.D0.H.v = true;
            h2Var.requestFocus();
            AndroidUtilities.showKeyboard(h2Var);
        }
        int[] iArr = new int[2];
        o1.k kVar2 = new o1.k(new o1.j(1000.0f));
        o1.l lVar = new o1.l(0.0f);
        org.telegram.ui.co coVar = this.f0;
        lVar.b((coVar == null || !coVar.b) ? 800.0f : 10.0f);
        lVar.a(1.0f);
        kVar2.u = lVar;
        this.B0 = kVar2;
        kVar2.b(new ap0(this, (org.telegram.ui.Cells.f7) view, iArr, 0));
        this.B0.a(new hb(this, 4));
        this.B0.f();
    }

    public final void M0() {
        boolean z10 = false;
        if (this.k0 == null && this.o0[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
            wp0 wp0Var = this.s0;
            if (wp0Var != null) {
                wp0Var.z0();
                return;
            }
            if (this.g0 instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.k0;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z10 = true;
                }
                ((LaunchActivity) this.g0).D0(new i2.y(2, z10));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final String O0() {
        String str;
        String[] strArr = this.o0;
        tp0 tp0Var = this.W;
        if (tp0Var != null) {
            str = strArr[tp0Var.d];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.k0;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        mp mpVar = this.e0;
        if (mpVar != null && mpVar.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.b0)).build().toString();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return str == null ? "" : str;
    }

    public final ll0 P0() {
        return (this.L0 || this.M0) ? this.G : this.F;
    }

    public final void Q0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        ll0 ll0Var = this.E;
        ll0Var.setPivotX(width);
        ll0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        ll0Var.setScaleX(f11);
        ll0Var.setScaleY(f11);
        ll0Var.setAlpha(f7);
        ll0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        P0.setScaleX(f12);
        P0.setScaleY(f12);
        float f13 = 1.0f - f7;
        P0.setAlpha(f13);
        b20 b20Var = this.y0;
        b20Var.setPivotX(b20Var.getWidth() / 2.0f);
        b20Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        b20Var.setScaleX(f14);
        b20Var.setScaleY(f14);
        b20Var.setAlpha(f13);
        org.telegram.ui.ActionBar.k kVar = this.z0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        kVar.setAlpha(f7);
        ll0Var.getLocationInWindow(iArr);
        float interpolation = pr.g.getInterpolation(f7);
        for (int i10 = 0; i10 < P0.getChildCount(); i10++) {
            View childAt = P0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.f7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f7, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f13);
                }
            }
        }
        for (int i11 = 0; i11 < ll0Var.getChildCount(); i11++) {
            View childAt2 = ll0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.g7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((ll0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        P0.invalidate();
    }

    public final void T0(boolean z10) {
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
        animatorSetArr[0].addListener(new qp0(this, z10, 0));
        animatorSetArr[0].start();
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        hq0 hq0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        cq0 cq0Var;
        if (dialog instanceof yp0) {
            S0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.f7) && ((org.telegram.ui.Cells.f7) view).F) || ((view instanceof org.telegram.ui.Cells.h6) && ((org.telegram.ui.Cells.h6) view).n0)) {
            X0(dialog.id, view);
            return;
        }
        ll0 ll0Var = this.E;
        if (ll0Var.getVisibility() != 8 || (activity = this.g0) == null) {
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
                i2.g.r(R.string.OK, alertDialog$Builder, null);
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
            i2.g.r(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        long j3 = dialog.id;
        a0.i iVar = this.U;
        if (iVar.h(j3) >= 0) {
            iVar.l(dialog.id);
            this.V.remove(dialog);
            if (view instanceof org.telegram.ui.Cells.h6) {
                ((org.telegram.ui.Cells.h6) view).s(false, true);
            } else if (view instanceof org.telegram.ui.Cells.f7) {
                ((org.telegram.ui.Cells.f7) view).b(false, true);
            }
            a1(1);
            hq0Var = this;
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if ((UserObject.isBotForum(user) && !(((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id))) || (DialogObject.isChatDialog(dialog.id) && (ChatObject.isForum(chat2) || (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                this.C0 = dialog;
                this.I.h1(0, this.p0 - ll0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                op0 op0Var = new op0(this, dialog, atomicReference, view);
                atomicReference.set(new in0(this, atomicReference, op0Var, dialog, 1));
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i11 = NotificationCenter.topicsDidLoaded;
                notificationCenter.addObserver(op0Var, i11);
                if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.id) != null) {
                    op0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.id));
                    return;
                } else {
                    MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.id);
                    AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            hq0Var = this;
            iVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.h6) {
                ((org.telegram.ui.Cells.h6) view).s(true, true);
            } else if (view instanceof org.telegram.ui.Cells.f7) {
                ((org.telegram.ui.Cells.f7) view).b(true, true);
            }
            a1(2);
            long j10 = UserConfig.getInstance(hq0Var.currentAccount).clientUserId;
            if (hq0Var.L0) {
                zp0 zp0Var = hq0Var.K;
                a0.i iVar2 = zp0Var.e;
                ArrayList arrayList = zp0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) iVar2.f(dialog.id);
                if (dialog2 == null) {
                    zp0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j10) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                zp0Var.l();
                hq0Var.A0 = false;
                b20 b20Var = hq0Var.y0;
                b20Var.r.setText("");
                K0(false);
                AndroidUtilities.hideKeyboard(b20Var.r);
            }
        }
        dq0 dq0Var = hq0Var.M;
        if (dq0Var == null || (cq0Var = dq0Var.H) == null) {
            return;
        }
        cq0Var.q(0, cq0Var.h());
    }

    public final void V0(final boolean z10) {
        int i10;
        int i11 = 0;
        while (true) {
            a0.i iVar = this.U;
            int m10 = iVar.m();
            lp0 lp0Var = this.c;
            mp0 mp0Var = this.d;
            if (i11 >= m10) {
                Editable text = mp0Var.getText();
                cu cuVar = mp0Var.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                mp mpVar = this.e0;
                int i12 = (mpVar == null || !mpVar.a.q) ? -1 : this.b0;
                ArrayList arrayList = new ArrayList();
                if (this.N != null) {
                    i10 = 0;
                    for (int i13 = 0; i13 < iVar.m(); i13++) {
                        long j3 = iVar.j(i13);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j3);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j3));
                        }
                        if (lp0Var.getTag() != null && cuVar.length() > 0 && sendPaidMessagesStars > 0) {
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
                    tp0 tp0Var = this.W;
                    int i14 = tp0Var != null ? tp0Var.d : 0;
                    if (this.F0 != null) {
                        int i15 = 0;
                        for (int i16 = 0; i16 < iVar.m(); i16++) {
                            long j10 = iVar.j(i16);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
                            }
                            if (this.F0 != null && lp0Var.getTag() != null && cuVar.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
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
                                if (lp0Var.getTag() != null && cuVar.length() > 0 && sendPaidMessagesStars3 > 0) {
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
                e5.c0(this.currentAccount, arrayList, i10, new Utilities.Callback() { // from class: org.telegram.ui.Components.gp0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        hq0.o(hq0.this, charSequenceArr, entities, z10, i19, (HashMap) obj);
                    }
                });
                return;
            }
            if (e5.h(getContext(), this.currentAccount, iVar.j(i11), lp0Var.getTag() != null && mp0Var.a.length() > 0)) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void W0(boolean z10) {
        lp0 lp0Var = this.c;
        if (z10 == (lp0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        lp0Var.setTag(z10 ? 1 : null);
        mp0 mp0Var = this.d;
        if (mp0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(mp0Var.getEditText());
        }
        mp0Var.k(true);
        FrameLayout frameLayout = this.c0;
        lp0 lp0Var2 = this.f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            lp0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            lp0Var2.setVisibility(0);
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
        arrayList.add(ObjectAnimator.ofFloat(lp0Var, (Property<lp0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(lp0Var2, (Property<lp0, Float>) View.SCALE_X, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(lp0Var2, (Property<lp0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(lp0Var2, (Property<lp0, Float>) property, z10 ? 1.0f : 0.0f));
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
        this.y.addListener(new qp0(this, z10, 1));
        this.y.start();
    }

    public final void X0(long j3, View view) {
        int i10 = -this.H0;
        this.H0 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j3 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3))) : "";
        boolean premiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
        int i11 = 1;
        FrameLayout frameLayout = this.v;
        (premiumFeaturesBlocked ? new yc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : new yc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new dp0(this, i11))).j();
    }

    public final void Y0() {
        org.telegram.ui.ActionBar.p1 p1Var;
        lp0 lp0Var = this.c;
        if (lp0Var == null) {
            return;
        }
        mp0 mp0Var = this.d;
        if (mp0Var == null || !mp0Var.m()) {
            sp0 sp0Var = this.D0;
            if (sp0Var != null && (p1Var = sp0Var.H) != null && !p1Var.f) {
                AndroidUtilities.dp(20.0f);
            }
        } else {
            mp0Var.getEmojiPaddingShown();
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
        lp0Var.setTranslationY(f11);
        this.f.setTranslationY(f11);
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.j5 j5Var = this.s;
        if (j5Var != null) {
            String O0 = O0();
            if (O0.startsWith("https://")) {
                O0 = O0.substring(8);
            } else if (O0.startsWith("http://")) {
                O0 = O0.substring(7);
            }
            j5Var.k(O0);
        }
    }

    public final void a1(int i10) {
        a0.i iVar = this.U;
        if (iVar.m() == 0) {
            W0(false);
            return;
        }
        ArrayList arrayList = this.N;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.c.getTag();
        mp0 mp0Var = this.d;
        if (tag != null && mp0Var.a.length() > 0) {
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
        ji.x1 x1Var = this.e;
        x1Var.g(max, z10);
        x1Var.i(size, j3, i10 != 0);
        W0(true);
        mp0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), x1Var.l()), 0);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            zp0 zp0Var = this.K;
            if (zp0Var != null) {
                zp0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        mp0 mp0Var = this.d;
        if (mp0Var != null) {
            AndroidUtilities.hideKeyboard(mp0Var.getEditText());
        }
        this.Y = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public void dismissInternal() {
        super.dismissInternal();
        mp0 mp0Var = this.d;
        if (mp0Var != null) {
            mp0Var.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.X;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        if (this.C0 != null) {
            L0();
            return;
        }
        mp0 mp0Var = this.d;
        if (mp0Var == null || !mp0Var.e) {
            super.onBackPressed();
        } else {
            mp0Var.k(true);
        }
    }

    public hq0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0823  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hq0(Context context, org.telegram.ui.co coVar, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, Integer num, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        int i10;
        int i11;
        float f7;
        float f10;
        jp0 jp0Var;
        jp0 jp0Var2;
        LinearLayout linearLayout;
        int i12;
        String[] strArr = new String[2];
        this.O = strArr;
        this.S = new View[2];
        this.T = new AnimatorSet[2];
        this.U = new a0.i();
        this.V = new HashMap();
        this.X = -1;
        final int i13 = 0;
        this.Y = false;
        new RectF();
        new Paint(1);
        this.j0 = new TextPaint(1);
        String[] strArr2 = new String[2];
        this.o0 = strArr2;
        this.E0 = new ArrayList();
        int i14 = 4;
        while (true) {
            i10 = 12;
            if (i14 >= 32) {
                i11 = 80;
                break;
            }
            i11 = (1 << i14) - 12;
            if (80 <= i11) {
                break;
            } else {
                i14++;
            }
        }
        int i15 = 8;
        int i16 = i11 / 8;
        long[] jArr = new long[i16];
        Object[] objArr = new Object[i16];
        this.G0 = i0.c.e;
        this.H0 = 4;
        this.I0 = true;
        this.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        ArrayList arrayList2 = new ArrayList();
        this.Y0 = arrayList2;
        RectF rectF = new RectF();
        this.Z0 = rectF;
        arrayList2.add(rectF);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        gh.c cVar = new gh.c();
        int i17 = org.telegram.ui.ActionBar.j6.d6;
        cVar.a(getThemedColor(i17));
        if (Build.VERSION.SDK_INT >= 31) {
            this.O0 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.Q0 = dVar;
            dVar.j(new mg.n(this, i15));
            gh.d dVar2 = new gh.d(null);
            this.P0 = dVar2;
            dVar2.j(new k2.g0(this, i10));
            bh.b bVar = new bh.b(dVar);
            this.R0 = bVar;
            bVar.f = LiteMode.isEnabled(262144);
            bh.b bVar2 = new bh.b(dVar2);
            this.S0 = bVar2;
            bVar2.f = LiteMode.isEnabled(262144);
        } else {
            this.O0 = null;
            this.P0 = null;
            this.Q0 = null;
            this.R0 = new bh.b(cVar);
            this.S0 = new bh.b(cVar);
        }
        this.T0 = new bh.b(cVar);
        this.resourcesProvider = f6Var;
        this.Z = z13;
        this.g0 = AndroidUtilities.findActivity(context);
        this.h0 = z12;
        if (z12) {
            this.resourcesProvider = new bi.s0(1);
        }
        cVar.a(getThemedColor(i17));
        this.f0 = coVar;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.R = mutate;
        int i18 = org.telegram.ui.ActionBar.j6.h5;
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
        this.M = new dq0(this, context);
        this.n0 = z10;
        strArr[0] = str;
        strArr[1] = str2;
        this.useSmoothKeyboard = true;
        setDelegate(new org.telegram.ui.g0(this, 1));
        int i19 = 3;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i20 = 0; i20 < size; i20++) {
                MessageObject messageObject2 = (MessageObject) this.N.get(i20);
                if (messageObject2.isTodo()) {
                    this.P = 3;
                } else if (messageObject2.isPoll()) {
                    int i21 = messageObject2.isPublicPoll() ? 2 : 1;
                    this.P = i21;
                    if (i21 == 2) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        int i22 = 13;
        if (z10) {
            this.l0 = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((MessageObject) arrayList.get(0)).getId();
            tL_channels_exportMessageLink.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(((MessageObject) arrayList.get(0)).messageOwner.peer_id.channel_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_exportMessageLink, new org.telegram.ui.ro(i22, this, context));
        }
        sp0 sp0Var = new sp0(this, context);
        this.D0 = sp0Var;
        this.containerView = sp0Var;
        bh.b bVar3 = this.R0;
        ih.k kVar = new ih.k(this.containerView);
        ViewGroup viewGroup = this.containerView;
        bVar3.d = kVar;
        bVar3.e = viewGroup;
        bh.b bVar4 = this.S0;
        ih.k kVar2 = new ih.k(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        bVar4.d = kVar2;
        bVar4.e = viewGroup2;
        bh.b bVar5 = this.T0;
        ih.k kVar3 = new ih.k(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        bVar5.d = kVar3;
        bVar5.e = viewGroup3;
        viewGroup3.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup4 = this.containerView;
        int i23 = this.backgroundPaddingLeft;
        viewGroup4.setPadding(i23, 0, i23, this.G0.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        int i24 = org.telegram.ui.ActionBar.j6.h5;
        frameLayout.setBackgroundColor(getThemedColor(i24));
        if (this.h0 && this.o0[1] != null) {
            tp0 tp0Var = new tp0(this, context);
            this.W = tp0Var;
            frameLayout.addView(tp0Var, w7.x5.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        b20 b20Var = new b20(context, this.resourcesProvider);
        this.y0 = b20Var;
        up0 up0Var = new up0(this);
        di.h2 h2Var = b20Var.r;
        h2Var.addTextChangedListener(up0Var);
        h2Var.setHint(LocaleController.getString(R.string.ShareSendTo));
        int i25 = 6;
        h2Var.setOnEditorActionListener(new f1(this, i25));
        b20Var.setCloseButtonOnClickListener(new dp0(this, i13));
        frameLayout.addView(b20Var, w7.x5.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        org.telegram.ui.ActionBar.k kVar4 = new org.telegram.ui.ActionBar.k(context, null);
        this.z0 = kVar4;
        kVar4.setOccupyStatusBar(false);
        kVar4.setBackButtonImage(R.drawable.ic_ab_back);
        int i26 = org.telegram.ui.ActionBar.j6.j5;
        kVar4.setTitleColor(getThemedColor(i26));
        kVar4.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.j6.q5));
        kVar4.C(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z6, false), false);
        kVar4.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.u8, false), false);
        kVar4.setActionBarMenuOnItemClick(new org.telegram.ui.ic(this, i22));
        kVar4.setVisibility(8);
        frameLayout.addView(kVar4, w7.x5.e(-1, 58, 83));
        ll0 ll0Var = new ll0(context, this.resourcesProvider);
        this.E = ll0Var;
        s4.s sVar = new s4.s(4);
        this.I = sVar;
        ll0Var.setLayoutManager(sVar);
        sVar.O = new kp0(this, 2);
        ll0Var.setOnScrollListener(new ip0(this, i13));
        eq0 eq0Var = new eq0(this, context);
        this.L = eq0Var;
        ll0Var.setAdapter(eq0Var);
        int i27 = org.telegram.ui.ActionBar.j6.A5;
        ll0Var.setGlowColor(getThemedColor(i27));
        ll0Var.setVerticalScrollBarEnabled(false);
        ll0Var.setHorizontalScrollBarEnabled(false);
        ll0Var.setOverScrollMode(2);
        ll0Var.setSelectorDrawableColor(0);
        ll0Var.setItemSelectorColorProvider(new wo0(1));
        ll0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        ll0Var.setClipToPadding(false);
        ll0Var.i(new bi.o(5));
        ll0Var.setOnItemClickListener(new zk0(this) { // from class: org.telegram.ui.Components.ep0
            public final /* synthetic */ hq0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.zk0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(int i28, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i13) {
                    case 0:
                        hq0.p(this.b, i28);
                        break;
                    case 1:
                        if (i28 >= 0) {
                            hq0 hq0Var = this.b;
                            ArrayList arrayList3 = hq0Var.K.d;
                            int i29 = i28 - 1;
                            TLRPC.Dialog dialog = (i29 < 0 || i29 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i29);
                            if (dialog != null) {
                                hq0Var.U0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i28 >= 0) {
                            hq0 hq0Var2 = this.b;
                            dq0 dq0Var = hq0Var2.M;
                            hq0 hq0Var3 = dq0Var.K;
                            int i30 = dq0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i28 < i30 || i30 < 0) {
                                int i31 = i28 - 1;
                                if (i31 >= 0) {
                                    if (i31 < dq0Var.d.size()) {
                                        tL_dialog2 = ((vp0) dq0Var.d.get(i31)).a;
                                    } else {
                                        int size2 = i31 - dq0Var.d.size();
                                        ArrayList arrayList4 = dq0Var.e.d;
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
                                    hq0Var2.U0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i32 = i28 - i30;
                                if (i32 >= 0 && i32 < hq0Var3.E0.size()) {
                                    TLObject tLObject2 = ((hg.h0) hq0Var3.E0.get(i32)).a;
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
        ll0Var.setVisibility(8);
        this.containerView.addView(ll0Var, w7.x5.e(-1, -1, 51));
        jp0 jp0Var3 = new jp0(this, context, this.resourcesProvider, i13);
        this.F = jp0Var3;
        jp0Var3.setSelectorDrawableColor(0);
        jp0Var3.setItemSelectorColorProvider(new wo0(1));
        jp0Var3.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        jp0Var3.setClipToPadding(false);
        getContext();
        s4.s sVar2 = new s4.s(4);
        this.H = sVar2;
        jp0Var3.setLayoutManager(sVar2);
        this.U0 = new bh.l(jp0Var3, this.containerView, new dw(jp0Var3, i19));
        sVar2.O = new kp0(this, i13);
        jp0Var3.setHorizontalScrollBarEnabled(false);
        jp0Var3.setVerticalScrollBarEnabled(false);
        jp0Var3.setOverScrollMode(2);
        jp0Var3.i(new bi.o(i25));
        this.containerView.addView(jp0Var3, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        zp0 zp0Var = new zp0(this, context);
        this.K = zp0Var;
        jp0Var3.setAdapter(zp0Var);
        jp0Var3.setGlowColor(getThemedColor(i27));
        final int i28 = 1;
        jp0Var3.setOnItemClickListener(new zk0(this) { // from class: org.telegram.ui.Components.ep0
            public final /* synthetic */ hq0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.zk0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(int i282, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i28) {
                    case 0:
                        hq0.p(this.b, i282);
                        break;
                    case 1:
                        if (i282 >= 0) {
                            hq0 hq0Var = this.b;
                            ArrayList arrayList3 = hq0Var.K.d;
                            int i29 = i282 - 1;
                            TLRPC.Dialog dialog = (i29 < 0 || i29 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i29);
                            if (dialog != null) {
                                hq0Var.U0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i282 >= 0) {
                            hq0 hq0Var2 = this.b;
                            dq0 dq0Var = hq0Var2.M;
                            hq0 hq0Var3 = dq0Var.K;
                            int i30 = dq0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i282 < i30 || i30 < 0) {
                                int i31 = i282 - 1;
                                if (i31 >= 0) {
                                    if (i31 < dq0Var.d.size()) {
                                        tL_dialog2 = ((vp0) dq0Var.d.get(i31)).a;
                                    } else {
                                        int size2 = i31 - dq0Var.d.size();
                                        ArrayList arrayList4 = dq0Var.e.d;
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
                                    hq0Var2.U0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i32 = i282 - i30;
                                if (i32 >= 0 && i32 < hq0Var3.E0.size()) {
                                    TLObject tLObject2 = ((hg.h0) hq0Var3.E0.get(i32)).a;
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
        jp0Var3.setOnScrollListener(new ip0(this, i28));
        jp0 jp0Var4 = new jp0(this, context, this.resourcesProvider, i28);
        this.G = jp0Var4;
        jp0Var4.setItemSelectorColorProvider(new wo0(i28));
        jp0Var4.setSelectorDrawableColor(0);
        jp0Var4.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        jp0Var4.setClipToPadding(false);
        getContext();
        oz ozVar = new oz(4, 0, jp0Var4);
        this.J = ozVar;
        jp0Var4.setLayoutManager(ozVar);
        ozVar.O = new kp0(this, 1);
        final int i29 = 2;
        jp0Var4.setOnItemClickListener(new zk0(this) { // from class: org.telegram.ui.Components.ep0
            public final /* synthetic */ hq0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.zk0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(int i282, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i29) {
                    case 0:
                        hq0.p(this.b, i282);
                        break;
                    case 1:
                        if (i282 >= 0) {
                            hq0 hq0Var = this.b;
                            ArrayList arrayList3 = hq0Var.K.d;
                            int i292 = i282 - 1;
                            TLRPC.Dialog dialog = (i292 < 0 || i292 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i292);
                            if (dialog != null) {
                                hq0Var.U0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i282 >= 0) {
                            hq0 hq0Var2 = this.b;
                            dq0 dq0Var = hq0Var2.M;
                            hq0 hq0Var3 = dq0Var.K;
                            int i30 = dq0Var.E;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i282 < i30 || i30 < 0) {
                                int i31 = i282 - 1;
                                if (i31 >= 0) {
                                    if (i31 < dq0Var.d.size()) {
                                        tL_dialog2 = ((vp0) dq0Var.d.get(i31)).a;
                                    } else {
                                        int size2 = i31 - dq0Var.d.size();
                                        ArrayList arrayList4 = dq0Var.e.d;
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
                                    hq0Var2.U0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i32 = i282 - i30;
                                if (i32 >= 0 && i32 < hq0Var3.E0.size()) {
                                    TLObject tLObject2 = ((hg.h0) hq0Var3.E0.get(i32)).a;
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
        jp0Var4.setHasFixedSize(true);
        jp0Var4.setItemAnimator(null);
        jp0Var4.setHorizontalScrollBarEnabled(false);
        jp0Var4.setVerticalScrollBarEnabled(false);
        jp0Var4.setOnScrollListener(new ip0(this, i29));
        jp0Var4.i(new bi.o(7));
        jp0Var4.setAdapter(this.M);
        jp0Var4.setGlowColor(getThemedColor(i27));
        this.x0 = new qk0(jp0Var4, true);
        t00 t00Var = new t00(context, this.resourcesProvider);
        t00Var.setViewType(12);
        xw0 xw0Var = new xw0(context, t00Var, 1, this.resourcesProvider);
        this.Q = xw0Var;
        xw0Var.addView(t00Var, 0);
        xw0Var.setAnimateLayoutChange(true);
        xw0Var.e(false, false);
        boolean z14 = this.h0;
        wh.p pVar = xw0Var.d;
        if (z14) {
            pVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.ng));
        }
        pVar.setText(LocaleController.getString(R.string.NoResult));
        jp0Var4.setEmptyView(xw0Var);
        jp0Var4.setHideIfEmpty(false);
        jp0Var4.Y1 = true;
        jp0Var4.Z1 = 0;
        this.containerView.addView(xw0Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.containerView.addView(jp0Var4, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        di.eb ebVar = new di.eb(this, context, 21);
        this.n = ebVar;
        this.containerView.addView(ebVar, w7.x5.e(-1, 300, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp((!this.h0 || this.o0[1] == null) ? 58.0f : 111.0f);
        this.S[0] = new View(context);
        View view = this.S[0];
        int i30 = org.telegram.ui.ActionBar.j6.V5;
        view.setBackgroundColor(getThemedColor(i30));
        this.S[0].setAlpha(0.0f);
        this.S[0].setTag(1);
        this.containerView.addView(this.S[0], layoutParams);
        this.containerView.addView(frameLayout, w7.x5.e(-1, (!this.h0 || this.o0[1] == null) ? 58 : 111, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.S[1] = new View(context);
        this.S[1].setBackgroundColor(getThemedColor(i30));
        this.S[1].setLayoutParams(layoutParams2);
        if (!this.n0 && this.o0[0] == null) {
            this.S[1].setAlpha(0.0f);
            jp0Var = jp0Var3;
            jp0Var2 = jp0Var4;
            f7 = 4.0f;
            f10 = 22.0f;
        } else {
            f7 = 4.0f;
            f10 = 22.0f;
            if (this.h0) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.r = frameLayout3;
                frameLayout2.addView(frameLayout3, w7.x5.d(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, w7.x5.e(-1, -1, 119));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                w7.z5.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new bp0(this, 3));
                org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
                this.s = j5Var;
                j5Var.setTextSize(15);
                j5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Tk));
                j5Var.setEllipsizeByGradient(true);
                Z0();
                linearLayout3.addView(j5Var, w7.x5.p(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                textView.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                textView.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                int i31 = org.telegram.ui.ActionBar.j6.i6;
                textView.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(i31), 4, 4));
                linearLayout3.addView(textView, w7.x5.p(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new bp0(this, 4));
                w7.z5.a(textView);
                jp0Var = jp0Var3;
                jp0Var2 = jp0Var4;
                this.containerView.addView(frameLayout2, w7.x5.e(-1, 58, 83));
                ArrayList arrayList3 = this.N;
                if (arrayList3 != null && arrayList3.size() > 0 && ((MessageObject) this.N.get(0)).messageOwner != null && ((MessageObject) this.N.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject3 = (MessageObject) this.N.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject3.getDialogId()))) && !messageObject3.isForwarded()) {
                        final int i32 = 0;
                        linearLayout = org.telegram.messenger.vl.f(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hp0
                            public final /* synthetic */ hq0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i32) {
                                    case 0:
                                        hq0 hq0Var = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var = hq0Var.f0;
                                        if (n2Var == null) {
                                            n2Var = LaunchActivity.U();
                                        }
                                        if (n2Var != null) {
                                            hq0Var.dismiss();
                                            n2Var.presentFragment(new org.telegram.ui.lj0(messageObject3));
                                            break;
                                        }
                                        break;
                                    default:
                                        hq0 hq0Var2 = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var2 = hq0Var2.f0;
                                        if (n2Var2 == null) {
                                            n2Var2 = LaunchActivity.U();
                                        }
                                        if (n2Var2 != null) {
                                            hq0Var2.dismiss();
                                            n2Var2.presentFragment(new org.telegram.ui.lj0(messageObject3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(i31), 6, 6));
                        w7.z5.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i33 = org.telegram.ui.ActionBar.j6.Vk;
                        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i33), PorterDuff.Mode.SRC_IN));
                        linearLayout.addView(imageView, w7.x5.o(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        textView2.setTextColor(getThemedColor(i33));
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(LocaleController.formatNumber(messageObject3.messageOwner.forwards, ','));
                        linearLayout.addView(textView2, w7.x5.p(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i12 = 8;
                        linearLayout2.addView(linearLayout3, w7.x5.p(-1, 42, 1.0f, 23, 11, 0, i12, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, w7.x5.p(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                linearLayout = null;
                i12 = 11;
                linearLayout2.addView(linearLayout3, w7.x5.p(-1, 42, 1.0f, 23, 11, 0, i12, 0));
                if (linearLayout != null) {
                }
            } else {
                jp0Var = jp0Var3;
                jp0Var2 = jp0Var4;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.h = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.r = frameLayout5;
                frameLayout4.addView(frameLayout5, w7.x5.d(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i34 = org.telegram.ui.ActionBar.j6.i6;
                textView3.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(i34), 2, AndroidUtilities.dp(22.0f)));
                textView3.setTextColor(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.j6.pg : org.telegram.ui.ActionBar.j6.n5));
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setGravity(17);
                if (this.h0 && this.o0[1] != null) {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupCopySpeakerLinkNoCaps).toUpperCase());
                } else {
                    textView3.setText(LocaleController.getString(R.string.CopyLink).toUpperCase());
                }
                textView3.setOnClickListener(new bp0(this, 5));
                frameLayout5.addView(textView3, w7.x5.e(-1, -1, 119));
                this.containerView.addView(frameLayout4, w7.x5.e(-1, 58, 87));
                ArrayList arrayList4 = this.N;
                if (arrayList4 != null && arrayList4.size() > 0 && ((MessageObject) this.N.get(0)).messageOwner != null && ((MessageObject) this.N.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject4 = (MessageObject) this.N.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject4.getDialogId()))) && !messageObject4.isForwarded()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.x = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        linearLayout4.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.j6.eg : i34), 2, AndroidUtilities.dp(22.0f)));
                        frameLayout5.addView(linearLayout4, w7.x5.d(-2, 48.0f, 85, 6.0f, 0.0f, -6.0f, 0.0f));
                        final int i35 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hp0
                            public final /* synthetic */ hq0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i35) {
                                    case 0:
                                        hq0 hq0Var = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var = hq0Var.f0;
                                        if (n2Var == null) {
                                            n2Var = LaunchActivity.U();
                                        }
                                        if (n2Var != null) {
                                            hq0Var.dismiss();
                                            n2Var.presentFragment(new org.telegram.ui.lj0(messageObject4));
                                            break;
                                        }
                                        break;
                                    default:
                                        hq0 hq0Var2 = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var2 = hq0Var2.f0;
                                        if (n2Var2 == null) {
                                            n2Var2 = LaunchActivity.U();
                                        }
                                        if (n2Var2 != null) {
                                            hq0Var2.dismiss();
                                            n2Var2.presentFragment(new org.telegram.ui.lj0(messageObject4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.j6.pg : org.telegram.ui.ActionBar.j6.n5), PorterDuff.Mode.MULTIPLY));
                        linearLayout4.addView(imageView2, w7.x5.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(messageObject4.messageOwner.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTextColor(getThemedColor(this.h0 ? org.telegram.ui.ActionBar.j6.pg : org.telegram.ui.ActionBar.j6.n5));
                        textView4.setGravity(16);
                        textView4.setTypeface(AndroidUtilities.bold());
                        linearLayout4.addView(textView4, w7.x5.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.v = frameLayout6;
        this.containerView.addView(frameLayout6, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.r != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w = frameLayout7;
        this.containerView.addView(frameLayout7, w7.x5.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        lp0 lp0Var = new lp0(this, context, 0);
        this.c = lp0Var;
        lp0Var.setWillNotDraw(false);
        lp0Var.setAlpha(0.0f);
        lp0Var.setVisibility(4);
        this.containerView.addView(lp0Var, w7.x5.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        lp0Var.setOnTouchListener(new ci.d(22));
        AndroidUtilities.setLightNavigationBar(this.container, AndroidUtilities.computePerceivedBrightness(getThemedColor(i24)) > 0.721f);
        mp0 mp0Var = new mp0(this, context, sp0Var, this.resourcesProvider);
        this.d = mp0Var;
        mp0Var.J = true;
        if (this.h0) {
            zt editText = mp0Var.getEditText();
            int i36 = org.telegram.ui.ActionBar.j6.ng;
            editText.setTextColor(getThemedColor(i36));
            mp0Var.getEditText().setCursorColor(getThemedColor(i36));
        }
        mp0Var.setHint(LocaleController.getString(R.string.ShareComment));
        mp0Var.s();
        mp0Var.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
        lp0Var.addView(mp0Var, w7.x5.e(-1, -2, 51));
        lp0Var.setClipChildren(false);
        lp0Var.setClipToPadding(false);
        mp0Var.setClipChildren(false);
        mp0Var.getEditText().addTextChangedListener(new di.i2(this, 12));
        lp0 lp0Var2 = new lp0(this, context, 1);
        this.f = lp0Var2;
        lp0Var2.setFocusable(true);
        lp0Var2.setFocusableInTouchMode(true);
        lp0Var2.setVisibility(4);
        lp0Var2.setScaleX(0.2f);
        lp0Var2.setScaleY(0.2f);
        lp0Var2.setAlpha(0.0f);
        this.containerView.addView(lp0Var2, w7.x5.e(110, 50, 85));
        ji.x1 x1Var = new ji.x1((NotificationCenter.NotificationCenterDelegate) this, context, R.drawable.send_plane_24, this.resourcesProvider, 2);
        this.e = x1Var;
        int dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        x1Var.I = dp;
        x1Var.J = dp2;
        float dp3 = AndroidUtilities.dp(1.0f);
        float dp4 = AndroidUtilities.dp(6.0f);
        x1Var.M = dp3;
        x1Var.N = dp4;
        x1Var.h0 = true;
        lp0Var2.addView(x1Var, w7.x5.g());
        x1Var.setOnClickListener(new bp0(this, 6));
        x1Var.setOnLongClickListener(new m10(this, 2));
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
            linearLayout5.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(org.telegram.ui.ActionBar.j6.i6), 6, 6));
            mp mpVar = new mp(context, 24, this.resourcesProvider);
            this.e0 = mpVar;
            mpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
            mpVar.setDrawUnchecked(true);
            mpVar.a(false, false);
            mpVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(mpVar, w7.x5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            textView5.setTextColor(getThemedColor(i26));
            textView5.setTextSize(1, 14.0f);
            textView5.setText(LocaleController.formatString(R.string.VideoShareAddTimestamp, AndroidUtilities.formatShortDuration(num.intValue())));
            linearLayout5.addView(textView5, w7.x5.t(-2, -2, 16, 9, 0, 0, 0));
            w7.z5.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new bp0(this, 0));
            frameLayout8.addView(linearLayout5, w7.x5.e(-2, -2, 17));
            if (this.h == null) {
                View view2 = new View(context);
                view2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d7));
                frameLayout8.addView(view2, w7.x5.a(-1.0f, this.h0 ? 0.66f : 1.0f / AndroidUtilities.density, 55));
            }
            this.containerView.addView(frameLayout8, w7.x5.e(-1, 58, 83));
            if (this.h == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        bh.c cVar2 = new bh.c(this.T0.c(ebVar, null, false));
        this.W0 = cVar2;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        cVar2.b(AndroidUtilities.dp(72.0f), true);
        dh.d c10 = this.S0.c(this.D0, fh.b.e(this.resourcesProvider), false);
        this.V0 = c10;
        c10.k = true;
        c10.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c10.t(AndroidUtilities.dp(32.0f));
        c10.h.g = 0.4f;
        c10.j();
        dh.d c11 = this.R0.c(lp0Var, fh.b.e(this.resourcesProvider), false);
        this.X0 = c11;
        c11.p(AndroidUtilities.dp(f10));
        c11.o(AndroidUtilities.dp(9.0f));
        lp0Var.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        FrameLayout frameLayout9 = this.r;
        if (frameLayout9 != null) {
            dh.d c12 = this.R0.c(frameLayout9, fh.b.e(this.resourcesProvider), false);
            c12.o(AndroidUtilities.dp(9.0f));
            c12.p(AndroidUtilities.dp(f10));
            this.r.setBackground(c12);
            this.r.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        FrameLayout frameLayout10 = this.c0;
        if (frameLayout10 != null) {
            dh.d c13 = this.R0.c(frameLayout10, fh.b.e(this.resourcesProvider), false);
            c13.o(AndroidUtilities.dp(9.0f));
            c13.p(AndroidUtilities.dp(f10));
            this.c0.setBackground(c13);
            this.c0.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        a1(0);
        org.telegram.ui.uy.i4(AccountInstance.getInstance(this.currentAccount));
        if (zp0Var.d.isEmpty()) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        }
        int i37 = this.currentAccount;
        int i38 = 0;
        MessagesStorage.getInstance(i37).getStorageQueue().postRunnable(new hg.n(i37, i38, new np0(this), i38));
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        AndroidUtilities.updateViewVisibilityAnimated(jp0Var, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(jp0Var2, false, 1.0f, false);
        org.telegram.ui.ActionBar.d3 container = getContainer();
        cp0 cp0Var = new cp0(this, i38);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(container, cp0Var);
    }

    public void S0(View view) {
    }

    public void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
