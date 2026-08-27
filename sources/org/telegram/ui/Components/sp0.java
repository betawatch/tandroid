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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class sp0 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int W0 = 0;
    public final zk0 A;
    public ArrayList A0;
    public final so0 B;
    public TL_stories.StoryItem B0;
    public final so0 C;
    public i0.c C0;
    public final f2.x D;
    public int D0;
    public final f2.x E;
    public boolean E0;
    public final cz F;
    public org.telegram.ui.ActionBar.n1 F0;
    public final jp0 G;
    public int G0;
    public final pp0 H;
    public boolean H0;
    public final op0 I;
    public boolean I0;
    public final ArrayList J;
    public int J0;
    public final String[] K;
    public final jg.e K0;
    public final int L;
    public final og.d L0;
    public final iw0 M;
    public final og.d M0;
    public final Drawable N;
    public final jg.a N0;
    public final View[] O;
    public final jg.a O0;
    public final AnimatorSet[] P;
    public final jg.a P0;
    public final a0.h Q;
    public final jg.k Q0;
    public final HashMap R;
    public final lg.d R0;
    public final dp0 S;
    public final jg.b S0;
    public int T;
    public final lg.d T0;
    public boolean U;
    public final ArrayList U0;
    public final boolean V;
    public final RectF V0;
    public boolean W;
    public final int X;
    public final FrameLayout Y;
    public final LinearLayout Z;
    public final bp a0;
    public final FrameLayout b;
    public final org.telegram.ui.rn b0;
    public final uo0 c;
    public final Activity c0;
    public final vo0 d;
    public final boolean d0;
    public final wo0 e;
    public boolean e0;
    public final uo0 f;
    public final TextPaint f0;
    public TLRPC.TL_exportedMessageLink g0;
    public final FrameLayout h;
    public boolean h0;
    public boolean i0;
    public final boolean j0;
    public final String[] k0;
    public int l0;
    public int m0;
    public final ag.s0 n;
    public boolean n0;
    public gp0 o0;
    public float p0;
    public float q0;
    public final FrameLayout r;
    public float r0;
    public final org.telegram.ui.ActionBar.h5 s;
    public ValueAnimator s0;
    public final gk0 t0;
    public final p10 u0;
    public final FrameLayout v;
    public final org.telegram.ui.ActionBar.k v0;
    public final FrameLayout w;
    public boolean w0;
    public final LinearLayout x;
    public o1.j x0;
    public AnimatorSet y;
    public TLRPC.Dialog y0;
    public final cp0 z0;

    public sp0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, c6Var);
    }

    public static void A0(sp0 sp0Var) {
        RectF rectF = sp0Var.V0;
        jg.e eVar = sp0Var.K0;
        if (Build.VERSION.SDK_INT < 31 || eVar == null) {
            return;
        }
        rectF.set(0.0f, 0.0f, sp0Var.containerView.getMeasuredWidth(), sp0Var.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(1, sp0Var.U0);
        eVar.e(sp0Var.Q0, sp0Var.containerView.getMeasuredWidth(), sp0Var.containerView.getMeasuredHeight());
    }

    public static int F0(sp0 sp0Var) {
        so0 so0Var = sp0Var.B;
        if (so0Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = so0Var.getChildAt(0);
        lk0 lk0Var = (lk0) so0Var.G(childAt);
        if (lk0Var == null) {
            return -1000;
        }
        int paddingTop = so0Var.getPaddingTop();
        if (lk0Var.c() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    public static sp0 N0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        return new sp0(context, messageObject != null ? org.telegram.messenger.y1.m(messageObject) : null, str, null, z10, str2, null, false);
    }

    public static /* synthetic */ void m(sp0 sp0Var, AtomicReference atomicReference, yo0 yo0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        yo0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, sp0Var.currentAccount, Long.valueOf(-dialog.id));
    }

    public static boolean n(final sp0 sp0Var) {
        org.telegram.ui.rn rnVar;
        wo0 wo0Var = sp0Var.e;
        boolean z10 = sp0Var.d0;
        Activity activity = sp0Var.c0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(sp0Var.getContext());
        linearLayout.setOrientation(1);
        if (sp0Var.J != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, sp0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.g6.fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new zo0(sp0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new lo0(sp0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, sp0Var.getContext(), sp0Var.resourcesProvider, true, false);
            if (z10) {
                f1Var.setTextColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var, h7.z5.n(-1, 48));
            f1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            sp0Var.E0 = true;
            f1Var.setChecked(true);
            final org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(1, sp0Var.getContext(), sp0Var.resourcesProvider, false, true);
            if (z10) {
                f1Var2.setTextColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, h7.z5.n(-1, 48));
            f1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            f1Var2.setChecked(!sp0Var.E0);
            final int i10 = 0;
            f1Var.setOnClickListener(new View.OnClickListener(sp0Var) { // from class: org.telegram.ui.Components.oo0
                public final /* synthetic */ sp0 b;

                {
                    this.b = sp0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.b.E0 = true;
                            f1Var.setChecked(true);
                            f1Var2.setChecked(!r3.E0);
                            break;
                        default:
                            this.b.E0 = false;
                            f1Var.setChecked(false);
                            f1Var2.setChecked(!r3.E0);
                            break;
                    }
                }
            });
            final int i11 = 1;
            f1Var2.setOnClickListener(new View.OnClickListener(sp0Var) { // from class: org.telegram.ui.Components.oo0
                public final /* synthetic */ sp0 b;

                {
                    this.b = sp0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.b.E0 = true;
                            f1Var.setChecked(true);
                            f1Var2.setChecked(!r3.E0);
                            break;
                        default:
                            this.b.E0 = false;
                            f1Var.setChecked(false);
                            f1Var2.setChecked(!r3.E0);
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(sp0Var.getThemedColor(org.telegram.ui.ActionBar.g6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, h7.z5.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, sp0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new zo0(sp0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new lo0(sp0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, sp0Var.getContext(), sp0Var.resourcesProvider, true, true);
        if (z10) {
            f1Var3.setTextColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ng));
            f1Var3.setIconColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.g6.H6));
        }
        f1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        f1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(f1Var3, h7.z5.n(-1, 48));
        f1Var3.setOnClickListener(new ko0(sp0Var, 1));
        org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(0, sp0Var.getContext(), sp0Var.resourcesProvider, true, true);
        if (z10) {
            f1Var4.setTextColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ng));
            f1Var4.setIconColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.g6.H6));
        }
        f1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        f1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(f1Var4, h7.z5.n(-1, 48));
        f1Var4.setOnClickListener(new ko0(sp0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(sp0Var.getThemedColor(org.telegram.ui.ActionBar.g6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, h7.z5.n(-1, -2));
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(linearLayout, -2, -2);
        sp0Var.F0 = n1Var;
        n1Var.b = false;
        n1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        sp0Var.F0.setOutsideTouchable(true);
        sp0Var.F0.setClippingEnabled(true);
        sp0Var.F0.setInputMethodMode(2);
        sp0Var.F0.setSoftInputMode(0);
        sp0Var.F0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        sp0Var.F0.setFocusable(true);
        int[] iArr = new int[2];
        wo0Var.getLocationInWindow(iArr);
        sp0Var.F0.showAtLocation(wo0Var, 51, AndroidUtilities.dp(8.0f) + ((wo0Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!sp0Var.keyboardVisible || (rnVar = sp0Var.b0) == null || rnVar.T0.getMeasuredHeight() <= AndroidUtilities.dp(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f) : wo0Var.getMeasuredHeight() + iArr[1]);
        sp0Var.F0.b();
        try {
            wo0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void p(sp0 sp0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
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
        uo0 uo0Var;
        long j12;
        long j13;
        Long l10;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue;
        String[] strArr2 = sp0Var.K;
        vo0 vo0Var = sp0Var.d;
        uo0 uo0Var2 = sp0Var.c;
        HashMap hashMap2 = sp0Var.R;
        Long l11 = 0L;
        a0.h hVar = sp0Var.Q;
        ArrayList arrayList3 = sp0Var.J;
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
                boolean isMonoForum = MessagesController.getInstance(sp0Var.currentAccount).isMonoForum(j14);
                Long l12 = hashMap == null ? l11 : (Long) hashMap.get(Long.valueOf(j14));
                if (l12 != null && l12.longValue() > 0) {
                    z12 = true;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j14));
                if (tL_forumTopic2 == null || !isMonoForum) {
                    uo0Var = uo0Var2;
                    j12 = j14;
                    j13 = 0;
                } else {
                    uo0Var = uo0Var2;
                    j12 = j14;
                    j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                }
                if (tL_forumTopic2 == null || isMonoForum) {
                    l10 = l11;
                    messageObject3 = null;
                } else {
                    l10 = l11;
                    messageObject3 = new MessageObject(sp0Var.currentAccount, tL_forumTopic2.topicStartMessage, false, false);
                }
                if (messageObject3 != null) {
                    messageObject3.isTopicMainMessage = true;
                }
                if (uo0Var.getTag() == null || vo0Var.a.length() <= 0) {
                    messageObject4 = messageObject3;
                    arrayList2 = arrayList3;
                } else {
                    CharSequence charSequence = charSequenceArr[0];
                    MessageObject messageObject5 = messageObject3;
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(charSequence == null ? null : charSequence.toString(), j12, messageObject5, messageObject3, null, true, arrayList, null, null, z10, 0, 0, null, false);
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
                    SendMessagesHelper.getInstance(sp0Var.currentAccount).sendMessage(of3);
                }
                long j15 = j12;
                int sendMessage = SendMessagesHelper.getInstance(sp0Var.currentAccount).sendMessage(sp0Var.J, j15, !sp0Var.E0, false, z10, 0, 0, messageObject4, i10, l12 == null ? 0L : l12.longValue(), j13, null);
                if (sendMessage != 0) {
                    arrayList4.add(Long.valueOf(j15));
                }
                if (hVar.m() == 1) {
                    tL_forumTopic = null;
                    y4.t0(sendMessage, sp0Var.b0, null);
                    if (sendMessage != 0) {
                        break;
                    }
                }
                i13++;
                arrayList3 = arrayList2;
                uo0Var2 = uo0Var;
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
                sp0Var.R0(hVar, arrayList2.size(), hVar.m() == 1 ? (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(0)) : tL_forumTopic, !z12);
            }
        } else {
            dp0 dp0Var = sp0Var.S;
            int i15 = dp0Var != null ? dp0Var.d : 0;
            if (sp0Var.B0 != null) {
                int i16 = 0;
                boolean z13 = false;
                while (i16 < hVar.m()) {
                    long j16 = hVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(sp0Var.currentAccount).isMonoForum(j16);
                    Long l13 = hashMap == null ? l11 : (Long) hashMap.get(Long.valueOf(j16));
                    if (l13 != null && l13.longValue() > 0) {
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
                        messageObject2 = new MessageObject(sp0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    }
                    if (sp0Var.B0 != null) {
                        if (uo0Var2.getTag() != null && vo0Var.a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(sp0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j16, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = sp0Var.B0;
                    } else if (uo0Var2.getTag() == null || vo0Var.a.length() <= 0) {
                        of2 = SendMessagesHelper.SendMessageParams.of(strArr[i12], j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                    } else {
                        CharSequence charSequence2 = charSequenceArr[0];
                        of2 = SendMessagesHelper.SendMessageParams.of(charSequence2 == null ? null : charSequence2.toString(), j16, messageObject2, messageObject2, null, true, arrayList, null, null, z10, 0, 0, null, false);
                    }
                    of2.payStars = l13 == null ? 0L : l13.longValue();
                    of2.monoForumPeer = j11;
                    SendMessagesHelper.getInstance(sp0Var.currentAccount).sendMessage(of2);
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
                        boolean isMonoForum3 = MessagesController.getInstance(sp0Var.currentAccount).isMonoForum(j17);
                        Long l14 = hashMap == null ? l11 : (Long) hashMap.get(Long.valueOf(j17));
                        if (l14 != null && l14.longValue() > 0) {
                            z14 = true;
                        }
                        TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j17));
                        long peerDialogId = (tL_forumTopic4 == null || !isMonoForum3) ? 0L : DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                        if (tL_forumTopic4 == null || isMonoForum3) {
                            c10 = 0;
                            messageObject = null;
                        } else {
                            c10 = 0;
                            messageObject = new MessageObject(sp0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                        }
                        if (uo0Var2.getTag() == null || vo0Var.a.length() <= 0) {
                            j10 = j17;
                        } else {
                            CharSequence charSequence3 = charSequenceArr[c10];
                            SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(charSequence3 == null ? null : charSequence3.toString(), j17, messageObject, messageObject, null, true, arrayList, null, null, z10, 0, 0, null, false);
                            j10 = j17;
                            of4.payStars = l14 == null ? 0L : l14.longValue();
                            of4.monoForumPeer = peerDialogId;
                            SendMessagesHelper.getInstance(sp0Var.currentAccount).sendMessage(of4);
                        }
                        SendMessagesHelper.SendMessageParams of5 = SendMessagesHelper.SendMessageParams.of(strArr2[i17], j10, messageObject, messageObject, null, true, null, null, null, z10, 0, 0, null, false);
                        of5.payStars = l14 == null ? 0L : l14.longValue();
                        of5.monoForumPeer = peerDialogId;
                        SendMessagesHelper.getInstance(sp0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z14;
                } else {
                    i11 = 0;
                    z11 = false;
                    sp0Var.R0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i11)), !z11);
                }
            }
            i11 = 0;
            sp0Var.R0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i11)), !z11);
        }
        gp0 gp0Var = sp0Var.o0;
        if (gp0Var != null) {
            gp0Var.B();
        }
        sp0Var.dismiss();
    }

    public static void q(sp0 sp0Var, int i10) {
        TLRPC.Dialog dialog;
        p10 p10Var = sp0Var.u0;
        HashMap hashMap = sp0Var.R;
        a0.h hVar = sp0Var.Q;
        jp0 jp0Var = sp0Var.G;
        pp0 pp0Var = sp0Var.H;
        if (pp0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = sp0Var.y0;
            if (dialog2 == null) {
                return;
            }
            hVar.k(dialog2, dialog2.id);
            hashMap.remove(dialog2);
            sp0Var.a1(2);
            if (sp0Var.H0 || sp0Var.I0) {
                if (((TLRPC.Dialog) jp0Var.e.f(dialog2.id)) == null) {
                    jp0Var.e.k(dialog2, dialog2.id);
                    ArrayList arrayList = jp0Var.d;
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                jp0Var.l();
                sp0Var.w0 = false;
                p10Var.r.setText("");
                sp0Var.K0(false);
            }
            for (int i11 = 0; i11 < sp0Var.P0().getChildCount(); i11++) {
                View childAt = sp0Var.P0().getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.b7) {
                    org.telegram.ui.Cells.b7 b7Var = (org.telegram.ui.Cells.b7) childAt;
                    if (b7Var.getCurrentDialog() == sp0Var.y0.id) {
                        b7Var.d(null, false, true);
                        b7Var.b(true, true);
                    }
                }
            }
            sp0Var.L0();
            return;
        }
        TLRPC.TL_forumTopic E = pp0Var.E(i10);
        if (E == null || (dialog = sp0Var.y0) == null) {
            return;
        }
        long j10 = dialog.id;
        boolean isMonoForum = MessagesController.getInstance(sp0Var.currentAccount).isMonoForum(j10);
        TLRPC.Dialog dialog3 = sp0Var.y0;
        hVar.k(dialog3, j10);
        hashMap.put(dialog3, E);
        sp0Var.a1(2);
        if (sp0Var.H0 || sp0Var.I0) {
            if (((TLRPC.Dialog) jp0Var.e.f(dialog3.id)) == null) {
                jp0Var.e.k(dialog3, dialog3.id);
                ArrayList arrayList2 = jp0Var.d;
                arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
            }
            jp0Var.l();
            sp0Var.w0 = false;
            p10Var.r.setText("");
            sp0Var.K0(false);
        }
        for (int i12 = 0; i12 < sp0Var.P0().getChildCount(); i12++) {
            View childAt2 = sp0Var.P0().getChildAt(i12);
            if (childAt2 instanceof org.telegram.ui.Cells.b7) {
                org.telegram.ui.Cells.b7 b7Var2 = (org.telegram.ui.Cells.b7) childAt2;
                if (b7Var2.getCurrentDialog() == sp0Var.y0.id) {
                    b7Var2.d(E, isMonoForum, true);
                    b7Var2.b(true, true);
                }
            }
        }
        sp0Var.L0();
    }

    public static void s0(sp0 sp0Var) {
        so0 so0Var = sp0Var.B;
        so0 so0Var2 = sp0Var.C;
        zk0 zk0Var = sp0Var.A;
        if (sp0Var.n0) {
            return;
        }
        so0 so0Var3 = sp0Var.H0 ? so0Var2 : so0Var;
        if (so0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = so0Var3.getChildAt(0);
        for (int i10 = 0; i10 < so0Var3.getChildCount(); i10++) {
            if (so0Var3.getChildAt(i10).getTop() < childAt.getTop()) {
                childAt = so0Var3.getChildAt(i10);
            }
        }
        lk0 lk0Var = (lk0) so0Var3.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i11 = (top <= 0 || lk0Var == null || lk0Var.b() != 0) ? 0 : top;
        if (top < 0 || lk0Var == null || lk0Var.b() != 0) {
            sp0Var.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            sp0Var.T0(true);
            top = i11;
        } else {
            sp0Var.G0 = childAt.getTop();
            sp0Var.T0(false);
        }
        if (zk0Var.getVisibility() == 0) {
            if (zk0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = zk0Var.getChildAt(0);
            for (int i12 = 0; i12 < zk0Var.getChildCount(); i12++) {
                if (zk0Var.getChildAt(i12).getTop() < childAt2.getTop()) {
                    childAt2 = zk0Var.getChildAt(i12);
                }
            }
            lk0 lk0Var2 = (lk0) zk0Var.G(childAt2);
            int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
            int i13 = (top2 <= 0 || lk0Var2 == null || lk0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || lk0Var2 == null || lk0Var2.b() != 0) {
                sp0Var.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                sp0Var.T0(true);
                top2 = i13;
            } else {
                sp0Var.G0 = childAt2.getTop();
                sp0Var.T0(false);
            }
            top = AndroidUtilities.lerp(top, top2, zk0Var.getAlpha());
        }
        int i14 = sp0Var.l0;
        if (i14 != top) {
            sp0Var.m0 = i14;
            float f10 = top;
            int i15 = (int) (sp0Var.p0 + f10);
            sp0Var.l0 = i15;
            so0Var.setTopGlowOffset(i15);
            int i16 = (int) (sp0Var.p0 + f10);
            sp0Var.l0 = i16;
            so0Var2.setTopGlowOffset(i16);
            int i17 = (int) (f10 + sp0Var.p0);
            sp0Var.l0 = i17;
            zk0Var.setTopGlowOffset(i17);
            sp0Var.b.setTranslationY(sp0Var.l0 + sp0Var.p0);
            sp0Var.M.setTranslationY(sp0Var.l0 + sp0Var.p0);
            sp0Var.containerView.invalidate();
        }
    }

    public final void K0(boolean z10) {
        p10 p10Var = this.u0;
        gg.g gVar = p10Var.r;
        gg.g gVar2 = p10Var.r;
        boolean isEmpty = TextUtils.isEmpty(gVar.getText());
        so0 so0Var = this.B;
        so0 so0Var2 = this.C;
        boolean z11 = true;
        if (!isEmpty || ((this.keyboardVisible && gVar2.hasFocus()) || this.I0)) {
            this.w0 = true;
            if (this.y0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(so0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(so0Var2, true);
            }
        } else {
            if (this.y0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(so0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(so0Var2, false);
            }
            z11 = false;
        }
        if (this.H0 != z11 || z10) {
            this.H0 = z11;
            op0 op0Var = this.I;
            op0Var.l();
            this.G.l();
            if (this.H0) {
                if (this.G0 == Integer.MAX_VALUE) {
                    ((f2.k0) so0Var2.getLayoutManager()).h1(0, -so0Var2.getPaddingTop());
                } else {
                    ((f2.k0) so0Var2.getLayoutManager()).h1(0, this.G0 - so0Var2.getPaddingTop());
                }
                op0Var.E(gVar2.getText().toString());
                return;
            }
            int i10 = this.G0;
            f2.x xVar = this.D;
            if (i10 == Integer.MAX_VALUE) {
                xVar.h1(0, 0);
            } else {
                xVar.h1(0, 0);
            }
        }
    }

    public final void L0() {
        TLRPC.Dialog dialog = this.y0;
        if (dialog == null) {
            return;
        }
        View view = null;
        this.y0 = null;
        for (int i10 = 0; i10 < P0().getChildCount(); i10++) {
            View childAt = P0().getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.b7) && ((org.telegram.ui.Cells.b7) childAt).getCurrentDialog() == dialog.id) {
                view = childAt;
            }
        }
        if (view == null) {
            return;
        }
        o1.j jVar = this.x0;
        if (jVar != null) {
            jVar.c();
        }
        P0().setVisibility(0);
        p10 p10Var = this.u0;
        p10Var.setVisibility(0);
        gg.g gVar = p10Var.r;
        if (this.H0 || this.I0) {
            this.z0.D.v = true;
            gVar.requestFocus();
            AndroidUtilities.showKeyboard(gVar);
        }
        int[] iArr = new int[2];
        o1.j jVar2 = new o1.j(new hb.a(1000.0f));
        o1.k kVar = new o1.k(0.0f);
        org.telegram.ui.rn rnVar = this.b0;
        kVar.b((rnVar == null || !rnVar.b) ? 800.0f : 10.0f);
        kVar.a(1.0f);
        jVar2.u = kVar;
        this.x0 = jVar2;
        jVar2.b(new jo0(this, (org.telegram.ui.Cells.b7) view, iArr, 0));
        this.x0.a(new wa(this, 4));
        this.x0.f();
    }

    public final void M0() {
        boolean z10 = false;
        if (this.g0 == null && this.k0[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
            gp0 gp0Var = this.o0;
            if (gp0Var != null) {
                gp0Var.h0();
                return;
            }
            if (this.c0 instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.g0;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z10 = true;
                }
                ((LaunchActivity) this.c0).D0(new h3.t(2, z10));
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final String O0() {
        String str;
        String[] strArr = this.k0;
        dp0 dp0Var = this.S;
        if (dp0Var != null) {
            str = strArr[dp0Var.d];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.g0;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        bp bpVar = this.a0;
        if (bpVar != null && bpVar.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.X)).build().toString();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        return str == null ? "" : str;
    }

    public final zk0 P0() {
        return (this.H0 || this.I0) ? this.C : this.B;
    }

    public final void Q0(View view, int[] iArr, float f10) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        zk0 zk0Var = this.A;
        zk0Var.setPivotX(width);
        zk0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f11 = 0.25f * f10;
        float f12 = 0.75f + f11;
        zk0Var.setScaleX(f12);
        zk0Var.setScaleY(f12);
        zk0Var.setAlpha(f10);
        zk0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f13 = f11 + 1.0f;
        P0.setScaleX(f13);
        P0.setScaleY(f13);
        float f14 = 1.0f - f10;
        P0.setAlpha(f14);
        p10 p10Var = this.u0;
        p10Var.setPivotX(p10Var.getWidth() / 2.0f);
        p10Var.setPivotY(0.0f);
        float f15 = (0.1f * f14) + 0.9f;
        p10Var.setScaleX(f15);
        p10Var.setScaleY(f15);
        p10Var.setAlpha(f14);
        org.telegram.ui.ActionBar.k kVar = this.v0;
        kVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f14);
        kVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f14);
        kVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f14);
        kVar.setAlpha(f10);
        zk0Var.getLocationInWindow(iArr);
        float interpolation = er.g.getInterpolation(f10);
        for (int i10 = 0; i10 < P0.getChildCount(); i10++) {
            View childAt = P0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.b7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f10, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f14);
                }
            }
        }
        for (int i11 = 0; i11 < zk0Var.getChildCount(); i11++) {
            View childAt2 = zk0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.c7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((zk0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.containerView.requestLayout();
        P0.invalidate();
    }

    public final void T0(boolean z10) {
        View[] viewArr = this.O;
        if ((!z10 || viewArr[0].getTag() == null) && (z10 || viewArr[0].getTag() != null)) {
            return;
        }
        viewArr[0].setTag(z10 ? null : 1);
        if (z10) {
            viewArr[0].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.P;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[0] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        animatorSetArr[0].setDuration(150L);
        animatorSetArr[0].addListener(new ap0(this, z10, 0));
        animatorSetArr[0].start();
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        sp0 sp0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        np0 np0Var;
        if (dialog instanceof ip0) {
            S0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.b7) && ((org.telegram.ui.Cells.b7) view).B) || ((view instanceof org.telegram.ui.Cells.e6) && ((org.telegram.ui.Cells.e6) view).j0)) {
            X0(dialog.id, view);
            return;
        }
        zk0 zk0Var = this.A;
        if (zk0Var.getVisibility() != 8 || (activity = this.c0) == null) {
            return;
        }
        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
        int i10 = this.L;
        if (isChatDialog) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString(R.string.SendMessageTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.N = string;
                if (i10 == 3) {
                    if (ChatObject.isActionBannedByDefault(chat, 10)) {
                        b2Var.P = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                    } else {
                        b2Var.P = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                    }
                } else if (i10 != 2) {
                    b2Var.P = LocaleController.getString(R.string.ChannelCantSendMessage);
                } else if (this.j0) {
                    b2Var.P = LocaleController.getString(R.string.PublicPollCantForward);
                } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                    b2Var.P = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                } else {
                    b2Var.P = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                }
                i0.a.w(R.string.OK, alertDialog$Builder, null);
                return;
            }
        } else if (DialogObject.isEncryptedDialog(dialog.id) && i10 != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String string2 = LocaleController.getString(R.string.SendMessageTitle);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
            b2Var2.N = string2;
            if (i10 == 3) {
                b2Var2.P = LocaleController.getString(R.string.TodoCantForwardSecretChat);
            } else if (i10 != 0) {
                b2Var2.P = LocaleController.getString(R.string.PollCantForwardSecretChat);
            } else {
                b2Var2.P = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
            }
            i0.a.w(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        long j10 = dialog.id;
        a0.h hVar = this.Q;
        if (hVar.h(j10) >= 0) {
            hVar.l(dialog.id);
            this.R.remove(dialog);
            if (view instanceof org.telegram.ui.Cells.e6) {
                ((org.telegram.ui.Cells.e6) view).t(false, true);
            } else if (view instanceof org.telegram.ui.Cells.b7) {
                ((org.telegram.ui.Cells.b7) view).b(false, true);
            }
            a1(1);
            sp0Var = this;
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if ((UserObject.isBotForum(user) && !(((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id))) || (DialogObject.isChatDialog(dialog.id) && (ChatObject.isForum(chat2) || (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                this.y0 = dialog;
                this.E.h1(0, this.l0 - zk0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                yo0 yo0Var = new yo0(this, dialog, atomicReference, view);
                atomicReference.set(new org.telegram.ui.yf(this, atomicReference, yo0Var, dialog, 26));
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i11 = NotificationCenter.topicsDidLoaded;
                notificationCenter.addObserver(yo0Var, i11);
                if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.id) != null) {
                    yo0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.id));
                    return;
                } else {
                    MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.id);
                    AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            sp0Var = this;
            hVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.e6) {
                ((org.telegram.ui.Cells.e6) view).t(true, true);
            } else if (view instanceof org.telegram.ui.Cells.b7) {
                ((org.telegram.ui.Cells.b7) view).b(true, true);
            }
            a1(2);
            long j11 = UserConfig.getInstance(sp0Var.currentAccount).clientUserId;
            if (sp0Var.H0) {
                jp0 jp0Var = sp0Var.G;
                a0.h hVar2 = jp0Var.e;
                ArrayList arrayList = jp0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.id);
                if (dialog2 == null) {
                    jp0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j11) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                jp0Var.l();
                sp0Var.w0 = false;
                p10 p10Var = sp0Var.u0;
                p10Var.r.setText("");
                K0(false);
                AndroidUtilities.hideKeyboard(p10Var.r);
            }
        }
        op0 op0Var = sp0Var.I;
        if (op0Var == null || (np0Var = op0Var.D) == null) {
            return;
        }
        np0Var.q(0, np0Var.h());
    }

    public final void V0(final boolean z10) {
        int i10;
        int i11 = 0;
        while (true) {
            a0.h hVar = this.Q;
            int m10 = hVar.m();
            uo0 uo0Var = this.c;
            vo0 vo0Var = this.d;
            if (i11 >= m10) {
                Editable text = vo0Var.getText();
                ot otVar = vo0Var.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                bp bpVar = this.a0;
                int i12 = (bpVar == null || !bpVar.a.q) ? -1 : this.X;
                ArrayList arrayList = new ArrayList();
                if (this.J != null) {
                    i10 = 0;
                    for (int i13 = 0; i13 < hVar.m(); i13++) {
                        long j10 = hVar.j(i13);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
                        }
                        if (uo0Var.getTag() != null && otVar.length() > 0 && sendPaidMessagesStars > 0) {
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
                    dp0 dp0Var = this.S;
                    int i14 = dp0Var != null ? dp0Var.d : 0;
                    if (this.B0 != null) {
                        int i15 = 0;
                        for (int i16 = 0; i16 < hVar.m(); i16++) {
                            long j11 = hVar.j(i16);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
                            }
                            if (this.B0 != null && uo0Var.getTag() != null && otVar.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
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
                        if (this.K[i14] != null) {
                            for (int i18 = 0; i18 < hVar.m(); i18++) {
                                long j12 = hVar.j(i18);
                                long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j12);
                                if (sendPaidMessagesStars3 <= 0) {
                                    sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j12));
                                }
                                if (uo0Var.getTag() != null && otVar.length() > 0 && sendPaidMessagesStars3 > 0) {
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
                y4.c0(this.currentAccount, arrayList, i10, new Utilities.Callback() { // from class: org.telegram.ui.Components.po0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        sp0.p(sp0.this, charSequenceArr, entities, z10, i19, (HashMap) obj);
                    }
                });
                return;
            }
            if (y4.h(getContext(), this.currentAccount, hVar.j(i11), uo0Var.getTag() != null && vo0Var.a.length() > 0)) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void W0(boolean z10) {
        uo0 uo0Var = this.c;
        if (z10 == (uo0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        uo0Var.setTag(z10 ? 1 : null);
        vo0 vo0Var = this.d;
        if (vo0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(vo0Var.getEditText());
        }
        vo0Var.k(true);
        FrameLayout frameLayout = this.Y;
        uo0 uo0Var2 = this.f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            uo0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            uo0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        if (frameLayout2 != null) {
            int i10 = z10 ? 4 : 1;
            WeakHashMap weakHashMap = r0.j0.a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.x;
        if (linearLayout != null) {
            int i11 = z10 ? 4 : 1;
            WeakHashMap weakHashMap2 = r0.j0.a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.y = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f10 = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(uo0Var, (Property<uo0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(uo0Var2, (Property<uo0, Float>) View.SCALE_X, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(uo0Var2, (Property<uo0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(uo0Var2, (Property<uo0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.O[1], (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout3 = this.r;
        if (frameLayout3 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.d0 && z10) {
                f10 = AndroidUtilities.dp(this.Z != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, f10));
        }
        this.y.playTogether(arrayList);
        this.y.setInterpolator(new DecelerateInterpolator());
        this.y.setDuration(180L);
        this.y.addListener(new ap0(this, z10, 1));
        this.y.start();
    }

    public final void X0(long j10, View view) {
        int i10 = -this.D0;
        this.D0 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j10 >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10))) : "";
        boolean premiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
        int i11 = 1;
        FrameLayout frameLayout = this.v;
        (premiumFeaturesBlocked ? new mc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : new mc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new mo0(this, i11))).j();
    }

    public final void Y0() {
        org.telegram.ui.ActionBar.p1 p1Var;
        uo0 uo0Var = this.c;
        if (uo0Var == null) {
            return;
        }
        vo0 vo0Var = this.d;
        if (vo0Var == null || !vo0Var.m()) {
            cp0 cp0Var = this.z0;
            if (cp0Var != null && (p1Var = cp0Var.D) != null && !p1Var.f) {
                AndroidUtilities.dp(20.0f);
            }
        } else {
            vo0Var.getEmojiPaddingShown();
        }
        float f10 = 0.0f;
        FrameLayout frameLayout = this.Y;
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
        uo0Var.setTranslationY(f12);
        this.f.setTranslationY(f12);
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.h5 h5Var = this.s;
        if (h5Var != null) {
            String O0 = O0();
            if (O0.startsWith("https://")) {
                O0 = O0.substring(8);
            } else if (O0.startsWith("http://")) {
                O0 = O0.substring(7);
            }
            h5Var.k(O0);
        }
    }

    public final void a1(int i10) {
        a0.h hVar = this.Q;
        if (hVar.m() == 0) {
            W0(false);
            return;
        }
        ArrayList arrayList = this.J;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.c.getTag();
        vo0 vo0Var = this.d;
        if (tag != null && vo0Var.a.length() > 0) {
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
        wo0 wo0Var = this.e;
        wo0Var.g(max, z10);
        wo0Var.i(size, j10, i10 != 0);
        W0(true);
        vo0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), wo0Var.l()), 0);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            jp0 jp0Var = this.G;
            if (jp0Var != null) {
                jp0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        vo0 vo0Var = this.d;
        if (vo0Var != null) {
            AndroidUtilities.hideKeyboard(vo0Var.getEditText());
        }
        this.U = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public void dismissInternal() {
        super.dismissInternal();
        vo0 vo0Var = this.d;
        if (vo0Var != null) {
            vo0Var.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.T;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onBackPressed() {
        if (this.y0 != null) {
            L0();
            return;
        }
        vo0 vo0Var = this.d;
        if (vo0Var == null || !vo0Var.e) {
            super.onBackPressed();
        } else {
            vo0Var.k(true);
        }
    }

    public sp0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0821  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sp0(Context context, org.telegram.ui.rn rnVar, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, Integer num, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true, false);
        int i10;
        int i11;
        char c10;
        float f10;
        float f11;
        so0 so0Var;
        so0 so0Var2;
        LinearLayout linearLayout;
        int i12;
        final int i13 = 1;
        String[] strArr = new String[2];
        this.K = strArr;
        this.O = new View[2];
        this.P = new AnimatorSet[2];
        this.Q = new a0.h();
        this.R = new HashMap();
        this.T = -1;
        this.U = false;
        new RectF();
        new Paint(1);
        this.f0 = new TextPaint(1);
        String[] strArr2 = new String[2];
        this.k0 = strArr2;
        this.A0 = new ArrayList();
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
        int i15 = i11 / 8;
        long[] jArr = new long[i15];
        Object[] objArr = new Object[i15];
        this.C0 = i0.c.e;
        this.D0 = 4;
        this.E0 = true;
        this.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        ArrayList arrayList2 = new ArrayList();
        this.U0 = arrayList2;
        RectF rectF = new RectF();
        this.V0 = rectF;
        arrayList2.add(rectF);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        og.c cVar = new og.c();
        int i16 = org.telegram.ui.ActionBar.g6.d6;
        cVar.a(getThemedColor(i16));
        if (Build.VERSION.SDK_INT >= 31) {
            this.K0 = new jg.e(false);
            og.d dVar = new og.d(null);
            this.M0 = dVar;
            dVar.i(new n1.d(this, i10));
            og.d dVar2 = new og.d(null);
            this.L0 = dVar2;
            c10 = 0;
            dVar2.i(new m5.o(this, i10));
            jg.a aVar = new jg.a(dVar);
            this.N0 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            jg.a aVar2 = new jg.a(dVar2);
            this.O0 = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
        } else {
            c10 = 0;
            this.K0 = null;
            this.L0 = null;
            this.M0 = null;
            this.N0 = new jg.a(cVar);
            this.O0 = new jg.a(cVar);
        }
        this.P0 = new jg.a(cVar);
        this.resourcesProvider = c6Var;
        this.V = z13;
        this.c0 = AndroidUtilities.findActivity(context);
        this.d0 = z12;
        if (z12) {
            this.resourcesProvider = new jh.h0(i13);
        }
        cVar.a(getThemedColor(i16));
        this.b0 = rnVar;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.N = mutate;
        int i17 = org.telegram.ui.ActionBar.g6.h5;
        this.behindKeyboardColorKey = i17;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i17), PorterDuff.Mode.MULTIPLY));
        this.occupyNavigationBarWithoutKeyboard = true;
        this.isFullscreen = z11;
        strArr2[c10] = str3;
        strArr2[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            MessageObject messageObject = (MessageObject) arrayList.get(0);
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(messageObject.getDialogId()));
            if (!TextUtils.isEmpty(publicUsername)) {
                StringBuilder sb2 = new StringBuilder("https://");
                i0.a.z(sb2, MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, "/");
                sb2.append(messageObject.getId());
                strArr2[0] = sb2.toString();
                if (arrayList.size() == 1 && messageObject.hasValidGroupId()) {
                    strArr2[0] = a9.p.p(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.J = arrayList;
        this.I = new op0(this, context);
        this.j0 = z10;
        strArr[0] = str;
        strArr[1] = str2;
        this.useSmoothKeyboard = true;
        setDelegate(new org.telegram.ui.k0(this, i13));
        int i18 = 3;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                MessageObject messageObject2 = (MessageObject) this.J.get(i19);
                if (messageObject2.isTodo()) {
                    this.L = 3;
                } else if (messageObject2.isPoll()) {
                    int i20 = messageObject2.isPublicPoll() ? 2 : 1;
                    this.L = i20;
                    if (i20 == 2) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        int i21 = 17;
        if (z10) {
            this.h0 = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((MessageObject) arrayList.get(0)).getId();
            tL_channels_exportMessageLink.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(((MessageObject) arrayList.get(0)).messageOwner.peer_id.channel_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_exportMessageLink, new org.telegram.ui.gg(i21, this, context));
        }
        cp0 cp0Var = new cp0(this, context);
        this.z0 = cp0Var;
        this.containerView = cp0Var;
        jg.a aVar3 = this.N0;
        qg.j jVar = new qg.j(this.containerView);
        ViewGroup viewGroup = this.containerView;
        aVar3.d = jVar;
        aVar3.e = viewGroup;
        jg.a aVar4 = this.O0;
        qg.j jVar2 = new qg.j(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        aVar4.d = jVar2;
        aVar4.e = viewGroup2;
        jg.a aVar5 = this.P0;
        qg.j jVar3 = new qg.j(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        aVar5.d = jVar3;
        aVar5.e = viewGroup3;
        viewGroup3.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup4 = this.containerView;
        int i22 = this.backgroundPaddingLeft;
        viewGroup4.setPadding(i22, 0, i22, this.C0.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        int i23 = org.telegram.ui.ActionBar.g6.h5;
        frameLayout.setBackgroundColor(getThemedColor(i23));
        if (this.d0 && this.k0[1] != null) {
            dp0 dp0Var = new dp0(this, context);
            this.S = dp0Var;
            frameLayout.addView(dp0Var, h7.z5.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        p10 p10Var = new p10(context, this.resourcesProvider);
        this.u0 = p10Var;
        ep0 ep0Var = new ep0(this);
        gg.g gVar = p10Var.r;
        gVar.addTextChangedListener(ep0Var);
        gVar.setHint(LocaleController.getString(R.string.ShareSendTo));
        gVar.setOnEditorActionListener(new c1(this, 6));
        p10Var.setCloseButtonOnClickListener(new mo0(this, 0));
        frameLayout.addView(p10Var, h7.z5.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.v0 = kVar;
        kVar.setOccupyStatusBar(false);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i24 = org.telegram.ui.ActionBar.g6.j5;
        kVar.setTitleColor(getThemedColor(i24));
        kVar.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.g6.q5));
        kVar.D(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z6, false), false);
        kVar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.u8, false), false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.zp(this, 8));
        kVar.setVisibility(8);
        frameLayout.addView(kVar, h7.z5.e(-1, 58, 83));
        zk0 zk0Var = new zk0(context, this.resourcesProvider);
        this.A = zk0Var;
        f2.x xVar = new f2.x(4);
        this.E = xVar;
        zk0Var.setLayoutManager(xVar);
        xVar.O = new to0(this, 2);
        final int i25 = 0;
        zk0Var.setOnScrollListener(new ro0(this, i25));
        pp0 pp0Var = new pp0(this, context);
        this.H = pp0Var;
        zk0Var.setAdapter(pp0Var);
        int i26 = org.telegram.ui.ActionBar.g6.A5;
        zk0Var.setGlowColor(getThemedColor(i26));
        zk0Var.setVerticalScrollBarEnabled(false);
        zk0Var.setHorizontalScrollBarEnabled(false);
        zk0Var.setOverScrollMode(2);
        zk0Var.setSelectorDrawableColor(0);
        int i27 = 11;
        zk0Var.setItemSelectorColorProvider(new pc0(i27));
        zk0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        zk0Var.setClipToPadding(false);
        zk0Var.i(new jh.j(i18));
        zk0Var.setOnItemClickListener(new pk0(this) { // from class: org.telegram.ui.Components.no0
            public final /* synthetic */ sp0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.pk0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(int i28, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i25) {
                    case 0:
                        sp0.q(this.b, i28);
                        break;
                    case 1:
                        if (i28 >= 0) {
                            sp0 sp0Var = this.b;
                            ArrayList arrayList3 = sp0Var.G.d;
                            int i29 = i28 - 1;
                            TLRPC.Dialog dialog = (i29 < 0 || i29 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i29);
                            if (dialog != null) {
                                sp0Var.U0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i28 >= 0) {
                            sp0 sp0Var2 = this.b;
                            op0 op0Var = sp0Var2.I;
                            sp0 sp0Var3 = op0Var.G;
                            int i30 = op0Var.A;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i28 < i30 || i30 < 0) {
                                int i31 = i28 - 1;
                                if (i31 >= 0) {
                                    if (i31 < op0Var.d.size()) {
                                        tL_dialog2 = ((fp0) op0Var.d.get(i31)).a;
                                    } else {
                                        int size2 = i31 - op0Var.d.size();
                                        ArrayList arrayList4 = op0Var.e.d;
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
                                    sp0Var2.U0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i32 = i28 - i30;
                                if (i32 >= 0 && i32 < sp0Var3.A0.size()) {
                                    TLObject tLObject2 = ((pf.y) sp0Var3.A0.get(i32)).a;
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
        zk0Var.setVisibility(8);
        this.containerView.addView(zk0Var, h7.z5.e(-1, -1, 51));
        so0 so0Var3 = new so0(this, context, this.resourcesProvider, i25);
        this.B = so0Var3;
        so0Var3.setSelectorDrawableColor(0);
        so0Var3.setItemSelectorColorProvider(new pc0(i27));
        so0Var3.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        so0Var3.setClipToPadding(false);
        getContext();
        f2.x xVar2 = new f2.x(4);
        this.D = xVar2;
        so0Var3.setLayoutManager(xVar2);
        this.Q0 = new jg.k(so0Var3, this.containerView, new ov(so0Var3, i18));
        xVar2.O = new to0(this, 0);
        so0Var3.setHorizontalScrollBarEnabled(false);
        so0Var3.setVerticalScrollBarEnabled(false);
        so0Var3.setOverScrollMode(2);
        so0Var3.i(new jh.j(4));
        this.containerView.addView(so0Var3, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        jp0 jp0Var = new jp0(this, context);
        this.G = jp0Var;
        so0Var3.setAdapter(jp0Var);
        so0Var3.setGlowColor(getThemedColor(i26));
        so0Var3.setOnItemClickListener(new pk0(this) { // from class: org.telegram.ui.Components.no0
            public final /* synthetic */ sp0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.pk0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(int i28, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i13) {
                    case 0:
                        sp0.q(this.b, i28);
                        break;
                    case 1:
                        if (i28 >= 0) {
                            sp0 sp0Var = this.b;
                            ArrayList arrayList3 = sp0Var.G.d;
                            int i29 = i28 - 1;
                            TLRPC.Dialog dialog = (i29 < 0 || i29 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i29);
                            if (dialog != null) {
                                sp0Var.U0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i28 >= 0) {
                            sp0 sp0Var2 = this.b;
                            op0 op0Var = sp0Var2.I;
                            sp0 sp0Var3 = op0Var.G;
                            int i30 = op0Var.A;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i28 < i30 || i30 < 0) {
                                int i31 = i28 - 1;
                                if (i31 >= 0) {
                                    if (i31 < op0Var.d.size()) {
                                        tL_dialog2 = ((fp0) op0Var.d.get(i31)).a;
                                    } else {
                                        int size2 = i31 - op0Var.d.size();
                                        ArrayList arrayList4 = op0Var.e.d;
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
                                    sp0Var2.U0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i32 = i28 - i30;
                                if (i32 >= 0 && i32 < sp0Var3.A0.size()) {
                                    TLObject tLObject2 = ((pf.y) sp0Var3.A0.get(i32)).a;
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
        so0Var3.setOnScrollListener(new ro0(this, i13));
        so0 so0Var4 = new so0(this, context, this.resourcesProvider, i13);
        this.C = so0Var4;
        so0Var4.setItemSelectorColorProvider(new pc0(i27));
        so0Var4.setSelectorDrawableColor(0);
        so0Var4.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        so0Var4.setClipToPadding(false);
        getContext();
        cz czVar = new cz(4, 0, so0Var4);
        this.F = czVar;
        so0Var4.setLayoutManager(czVar);
        czVar.O = new to0(this, i13);
        final int i28 = 2;
        so0Var4.setOnItemClickListener(new pk0(this) { // from class: org.telegram.ui.Components.no0
            public final /* synthetic */ sp0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.pk0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(int i282, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i28) {
                    case 0:
                        sp0.q(this.b, i282);
                        break;
                    case 1:
                        if (i282 >= 0) {
                            sp0 sp0Var = this.b;
                            ArrayList arrayList3 = sp0Var.G.d;
                            int i29 = i282 - 1;
                            TLRPC.Dialog dialog = (i29 < 0 || i29 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i29);
                            if (dialog != null) {
                                sp0Var.U0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i282 >= 0) {
                            sp0 sp0Var2 = this.b;
                            op0 op0Var = sp0Var2.I;
                            sp0 sp0Var3 = op0Var.G;
                            int i30 = op0Var.A;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i282 < i30 || i30 < 0) {
                                int i31 = i282 - 1;
                                if (i31 >= 0) {
                                    if (i31 < op0Var.d.size()) {
                                        tL_dialog2 = ((fp0) op0Var.d.get(i31)).a;
                                    } else {
                                        int size2 = i31 - op0Var.d.size();
                                        ArrayList arrayList4 = op0Var.e.d;
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
                                    sp0Var2.U0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i32 = i282 - i30;
                                if (i32 >= 0 && i32 < sp0Var3.A0.size()) {
                                    TLObject tLObject2 = ((pf.y) sp0Var3.A0.get(i32)).a;
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
        so0Var4.setHasFixedSize(true);
        so0Var4.setItemAnimator(null);
        so0Var4.setHorizontalScrollBarEnabled(false);
        so0Var4.setVerticalScrollBarEnabled(false);
        so0Var4.setOnScrollListener(new ro0(this, i28));
        so0Var4.i(new jh.j(5));
        so0Var4.setAdapter(this.I);
        so0Var4.setGlowColor(getThemedColor(i26));
        this.t0 = new gk0(so0Var4, true);
        h00 h00Var = new h00(context, this.resourcesProvider);
        h00Var.setViewType(12);
        iw0 iw0Var = new iw0(context, h00Var, 1, this.resourcesProvider);
        this.M = iw0Var;
        iw0Var.addView(h00Var, 0);
        iw0Var.setAnimateLayoutChange(true);
        iw0Var.e(false, false);
        boolean z14 = this.d0;
        eh.s sVar = iw0Var.d;
        if (z14) {
            sVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.ng));
        }
        sVar.setText(LocaleController.getString(R.string.NoResult));
        so0Var4.setEmptyView(iw0Var);
        so0Var4.setHideIfEmpty(false);
        so0Var4.U1 = true;
        so0Var4.V1 = 0;
        this.containerView.addView(iw0Var, h7.z5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.containerView.addView(so0Var4, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ag.s0 s0Var = new ag.s0(this, context, 20);
        this.n = s0Var;
        this.containerView.addView(s0Var, h7.z5.e(-1, 300, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp((!this.d0 || this.k0[1] == null) ? 58.0f : 111.0f);
        this.O[0] = new View(context);
        View view = this.O[0];
        int i29 = org.telegram.ui.ActionBar.g6.V5;
        view.setBackgroundColor(getThemedColor(i29));
        this.O[0].setAlpha(0.0f);
        this.O[0].setTag(1);
        this.containerView.addView(this.O[0], layoutParams);
        this.containerView.addView(frameLayout, h7.z5.e(-1, (!this.d0 || this.k0[1] == null) ? 58 : 111, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.O[1] = new View(context);
        this.O[1].setBackgroundColor(getThemedColor(i29));
        this.O[1].setLayoutParams(layoutParams2);
        if (!this.j0 && this.k0[0] == null) {
            this.O[1].setAlpha(0.0f);
            so0Var = so0Var3;
            so0Var2 = so0Var4;
            f10 = 4.0f;
            f11 = 22.0f;
        } else {
            f10 = 4.0f;
            f11 = 22.0f;
            if (this.d0) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.r = frameLayout3;
                frameLayout2.addView(frameLayout3, h7.z5.d(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, h7.z5.e(-1, -1, 119));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                h7.b6.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new ko0(this, 3));
                org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
                this.s = h5Var;
                h5Var.setTextSize(15);
                h5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Tk));
                h5Var.setEllipsizeByGradient(true);
                Z0();
                linearLayout3.addView(h5Var, h7.z5.p(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                textView.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                textView.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                int i30 = org.telegram.ui.ActionBar.g6.i6;
                textView.setBackground(org.telegram.ui.ActionBar.g6.Y(getThemedColor(i30), 4, 4));
                linearLayout3.addView(textView, h7.z5.p(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new ko0(this, 4));
                h7.b6.a(textView);
                so0Var = so0Var3;
                so0Var2 = so0Var4;
                this.containerView.addView(frameLayout2, h7.z5.e(-1, 58, 83));
                ArrayList arrayList3 = this.J;
                if (arrayList3 != null && arrayList3.size() > 0 && ((MessageObject) this.J.get(0)).messageOwner != null && ((MessageObject) this.J.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject3 = (MessageObject) this.J.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject3.getDialogId()))) && !messageObject3.isForwarded()) {
                        final int i31 = 0;
                        linearLayout = org.telegram.messenger.y1.g(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qo0
                            public final /* synthetic */ sp0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i31) {
                                    case 0:
                                        sp0 sp0Var = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var = sp0Var.b0;
                                        if (n2Var == null) {
                                            n2Var = LaunchActivity.U();
                                        }
                                        if (n2Var != null) {
                                            sp0Var.dismiss();
                                            n2Var.presentFragment(new org.telegram.ui.vi0(messageObject3));
                                            break;
                                        }
                                        break;
                                    default:
                                        sp0 sp0Var2 = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var2 = sp0Var2.b0;
                                        if (n2Var2 == null) {
                                            n2Var2 = LaunchActivity.U();
                                        }
                                        if (n2Var2 != null) {
                                            sp0Var2.dismiss();
                                            n2Var2.presentFragment(new org.telegram.ui.vi0(messageObject3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(getThemedColor(i30), 6, 6));
                        h7.b6.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i32 = org.telegram.ui.ActionBar.g6.Vk;
                        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i32), PorterDuff.Mode.SRC_IN));
                        linearLayout.addView(imageView, h7.z5.o(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        textView2.setTextColor(getThemedColor(i32));
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(LocaleController.formatNumber(messageObject3.messageOwner.forwards, ','));
                        linearLayout.addView(textView2, h7.z5.p(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i12 = 8;
                        linearLayout2.addView(linearLayout3, h7.z5.p(-1, 42, 1.0f, 23, 11, 0, i12, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, h7.z5.p(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                linearLayout = null;
                i12 = 11;
                linearLayout2.addView(linearLayout3, h7.z5.p(-1, 42, 1.0f, 23, 11, 0, i12, 0));
                if (linearLayout != null) {
                }
            } else {
                so0Var = so0Var3;
                so0Var2 = so0Var4;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.h = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.r = frameLayout5;
                frameLayout4.addView(frameLayout5, h7.z5.d(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i33 = org.telegram.ui.ActionBar.g6.i6;
                textView3.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i33), 2, AndroidUtilities.dp(22.0f)));
                textView3.setTextColor(getThemedColor(this.d0 ? org.telegram.ui.ActionBar.g6.pg : org.telegram.ui.ActionBar.g6.n5));
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setGravity(17);
                if (this.d0 && this.k0[1] != null) {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupCopySpeakerLinkNoCaps).toUpperCase());
                } else {
                    textView3.setText(LocaleController.getString(R.string.CopyLink).toUpperCase());
                }
                textView3.setOnClickListener(new ko0(this, 5));
                frameLayout5.addView(textView3, h7.z5.e(-1, -1, 119));
                this.containerView.addView(frameLayout4, h7.z5.e(-1, 58, 87));
                ArrayList arrayList4 = this.J;
                if (arrayList4 != null && arrayList4.size() > 0 && ((MessageObject) this.J.get(0)).messageOwner != null && ((MessageObject) this.J.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject4 = (MessageObject) this.J.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject4.getDialogId()))) && !messageObject4.isForwarded()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.x = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        linearLayout4.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(this.d0 ? org.telegram.ui.ActionBar.g6.eg : i33), 2, AndroidUtilities.dp(22.0f)));
                        frameLayout5.addView(linearLayout4, h7.z5.d(-2, 48.0f, 85, 6.0f, 0.0f, -6.0f, 0.0f));
                        final int i34 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qo0
                            public final /* synthetic */ sp0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i34) {
                                    case 0:
                                        sp0 sp0Var = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var = sp0Var.b0;
                                        if (n2Var == null) {
                                            n2Var = LaunchActivity.U();
                                        }
                                        if (n2Var != null) {
                                            sp0Var.dismiss();
                                            n2Var.presentFragment(new org.telegram.ui.vi0(messageObject4));
                                            break;
                                        }
                                        break;
                                    default:
                                        sp0 sp0Var2 = this.b;
                                        org.telegram.ui.ActionBar.n2 n2Var2 = sp0Var2.b0;
                                        if (n2Var2 == null) {
                                            n2Var2 = LaunchActivity.U();
                                        }
                                        if (n2Var2 != null) {
                                            sp0Var2.dismiss();
                                            n2Var2.presentFragment(new org.telegram.ui.vi0(messageObject4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(this.d0 ? org.telegram.ui.ActionBar.g6.pg : org.telegram.ui.ActionBar.g6.n5), PorterDuff.Mode.MULTIPLY));
                        linearLayout4.addView(imageView2, h7.z5.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(messageObject4.messageOwner.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTextColor(getThemedColor(this.d0 ? org.telegram.ui.ActionBar.g6.pg : org.telegram.ui.ActionBar.g6.n5));
                        textView4.setGravity(16);
                        textView4.setTypeface(AndroidUtilities.bold());
                        linearLayout4.addView(textView4, h7.z5.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.v = frameLayout6;
        this.containerView.addView(frameLayout6, h7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.r != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w = frameLayout7;
        this.containerView.addView(frameLayout7, h7.z5.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        uo0 uo0Var = new uo0(this, context, 0);
        this.c = uo0Var;
        uo0Var.setWillNotDraw(false);
        uo0Var.setAlpha(0.0f);
        uo0Var.setVisibility(4);
        this.containerView.addView(uo0Var, h7.z5.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        uo0Var.setOnTouchListener(new kh.e(22));
        AndroidUtilities.setLightNavigationBar(this.container, AndroidUtilities.computePerceivedBrightness(getThemedColor(i23)) > 0.721f);
        vo0 vo0Var = new vo0(this, context, cp0Var, this.resourcesProvider);
        this.d = vo0Var;
        vo0Var.F = true;
        if (this.d0) {
            lt editText = vo0Var.getEditText();
            int i35 = org.telegram.ui.ActionBar.g6.ng;
            editText.setTextColor(getThemedColor(i35));
            vo0Var.getEditText().setCursorColor(getThemedColor(i35));
        }
        vo0Var.setHint(LocaleController.getString(R.string.ShareComment));
        vo0Var.s();
        vo0Var.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
        uo0Var.addView(vo0Var, h7.z5.e(-1, -2, 51));
        uo0Var.setClipChildren(false);
        uo0Var.setClipToPadding(false);
        vo0Var.setClipChildren(false);
        vo0Var.getEditText().addTextChangedListener(new ch.e(this, 13));
        uo0 uo0Var2 = new uo0(this, context, 1);
        this.f = uo0Var2;
        uo0Var2.setFocusable(true);
        uo0Var2.setFocusableInTouchMode(true);
        uo0Var2.setVisibility(4);
        uo0Var2.setScaleX(0.2f);
        uo0Var2.setScaleY(0.2f);
        uo0Var2.setAlpha(0.0f);
        this.containerView.addView(uo0Var2, h7.z5.e(110, 50, 85));
        wo0 wo0Var = new wo0((NotificationCenter.NotificationCenterDelegate) this, context, R.drawable.send_plane_24, this.resourcesProvider, 0);
        this.e = wo0Var;
        int dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        wo0Var.E = dp;
        wo0Var.F = dp2;
        float dp3 = AndroidUtilities.dp(1.0f);
        float dp4 = AndroidUtilities.dp(6.0f);
        wo0Var.I = dp3;
        wo0Var.J = dp4;
        wo0Var.d0 = true;
        uo0Var2.addView(wo0Var, h7.z5.g());
        wo0Var.setOnClickListener(new ko0(this, 6));
        wo0Var.setOnLongClickListener(new a10(this, 2));
        this.f0.setTextSize(AndroidUtilities.dp(12.0f));
        this.f0.setTypeface(AndroidUtilities.bold());
        if (num != null) {
            this.X = num.intValue();
            FrameLayout frameLayout8 = new FrameLayout(context);
            this.Y = frameLayout8;
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.Z = linearLayout5;
            linearLayout5.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f10));
            linearLayout5.setClipToPadding(false);
            linearLayout5.setOrientation(0);
            linearLayout5.setBackground(org.telegram.ui.ActionBar.g6.Y(getThemedColor(org.telegram.ui.ActionBar.g6.i6), 6, 6));
            bp bpVar = new bp(context, 24, this.resourcesProvider);
            this.a0 = bpVar;
            bpVar.b(org.telegram.ui.ActionBar.g6.h7, org.telegram.ui.ActionBar.g6.j7, org.telegram.ui.ActionBar.g6.k7);
            bpVar.setDrawUnchecked(true);
            bpVar.a(false, false);
            bpVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(bpVar, h7.z5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            textView5.setTextColor(getThemedColor(i24));
            textView5.setTextSize(1, 14.0f);
            textView5.setText(LocaleController.formatString(R.string.VideoShareAddTimestamp, AndroidUtilities.formatShortDuration(num.intValue())));
            linearLayout5.addView(textView5, h7.z5.t(-2, -2, 16, 9, 0, 0, 0));
            h7.b6.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new ko0(this, 0));
            frameLayout8.addView(linearLayout5, h7.z5.e(-2, -2, 17));
            if (this.h == null) {
                View view2 = new View(context);
                view2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d7));
                frameLayout8.addView(view2, h7.z5.a(-1.0f, this.d0 ? 0.66f : 1.0f / AndroidUtilities.density, 55));
            }
            this.containerView.addView(frameLayout8, h7.z5.e(-1, 58, 83));
            if (this.h == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        jg.b bVar = new jg.b(this.P0.c(s0Var, null, false));
        this.S0 = bVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        bVar.b(AndroidUtilities.dp(72.0f), true);
        lg.d c11 = this.O0.c(this.z0, ng.c.e(this.resourcesProvider), false);
        this.R0 = c11;
        c11.k = true;
        c11.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c11.t(AndroidUtilities.dp(32.0f));
        c11.h.g = 0.4f;
        c11.j();
        lg.d c12 = this.N0.c(uo0Var, ng.c.e(this.resourcesProvider), false);
        this.T0 = c12;
        c12.p(AndroidUtilities.dp(f11));
        c12.o(AndroidUtilities.dp(9.0f));
        uo0Var.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        FrameLayout frameLayout9 = this.r;
        if (frameLayout9 != null) {
            lg.d c13 = this.N0.c(frameLayout9, ng.c.e(this.resourcesProvider), false);
            c13.o(AndroidUtilities.dp(9.0f));
            c13.p(AndroidUtilities.dp(f11));
            this.r.setBackground(c13);
            this.r.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        FrameLayout frameLayout10 = this.Y;
        if (frameLayout10 != null) {
            lg.d c14 = this.N0.c(frameLayout10, ng.c.e(this.resourcesProvider), false);
            c14.o(AndroidUtilities.dp(9.0f));
            c14.p(AndroidUtilities.dp(f11));
            this.Y.setBackground(c14);
            this.Y.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        a1(0);
        org.telegram.ui.gy.i4(AccountInstance.getInstance(this.currentAccount));
        if (jp0Var.d.isEmpty()) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        }
        int i36 = this.currentAccount;
        int i37 = 0;
        MessagesStorage.getInstance(i36).getStorageQueue().postRunnable(new h3.z(i36, i37, new xo0(this), 14));
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        AndroidUtilities.updateViewVisibilityAnimated(so0Var, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(so0Var2, false, 1.0f, false);
        org.telegram.ui.ActionBar.c3 container = getContainer();
        lo0 lo0Var = new lo0(this, i37);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(container, lo0Var);
    }

    public void S0(View view) {
    }

    public void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
