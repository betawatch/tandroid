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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class dq0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int W0 = 0;
    public final jl0 A;
    public ArrayList A0;
    public final dp0 B;
    public TL_stories.StoryItem B0;
    public final dp0 C;
    public i0.b C0;
    public final f2.w D;
    public int D0;
    public final f2.w E;
    public boolean E0;
    public final jz F;
    public org.telegram.ui.ActionBar.o1 F0;
    public final up0 G;
    public int G0;
    public final aq0 H;
    public boolean H0;
    public final zp0 I;
    public boolean I0;
    public final ArrayList J;
    public int J0;
    public final String[] K;
    public final lg.e K0;
    public final int L;
    public final qg.d L0;
    public final qw0 M;
    public final qg.d M0;
    public final Drawable N;
    public final lg.a N0;
    public final View[] O;
    public final lg.a O0;
    public final AnimatorSet[] P;
    public final lg.a P0;
    public final a0.h Q;
    public final lg.k Q0;
    public final HashMap R;
    public final ng.d R0;
    public final op0 S;
    public final lg.b S0;
    public int T;
    public final ng.d T0;
    public boolean U;
    public final ArrayList U0;
    public final boolean V;
    public final RectF V0;
    public boolean W;
    public final int X;
    public final FrameLayout Y;
    public final LinearLayout Z;
    public final hp a0;
    public final FrameLayout b;
    public final org.telegram.ui.tn b0;
    public final fp0 c;
    public final Activity c0;
    public final gp0 d;
    public final boolean d0;
    public final hp0 e;
    public boolean e0;
    public final fp0 f;
    public final TextPaint f0;
    public TLRPC.TL_exportedMessageLink g0;
    public final FrameLayout h;
    public boolean h0;
    public boolean i0;
    public final boolean j0;
    public final String[] k0;
    public int l0;
    public int m0;
    public final cg.h0 n;
    public boolean n0;
    public rp0 o0;
    public float p0;
    public float q0;
    public final FrameLayout r;
    public float r0;
    public final org.telegram.ui.ActionBar.h5 s;
    public ValueAnimator s0;
    public final pk0 t0;
    public final x10 u0;
    public final FrameLayout v;
    public final org.telegram.ui.ActionBar.l v0;
    public final FrameLayout w;
    public boolean w0;
    public final LinearLayout x;
    public o1.k x0;
    public AnimatorSet y;
    public TLRPC.Dialog y0;
    public final np0 z0;

    public dq0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, c6Var);
    }

    public static void A0(dq0 dq0Var) {
        RectF rectF = dq0Var.V0;
        lg.e eVar = dq0Var.K0;
        if (Build.VERSION.SDK_INT < 31 || eVar == null) {
            return;
        }
        rectF.set(0.0f, 0.0f, dq0Var.containerView.getMeasuredWidth(), dq0Var.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(1, dq0Var.U0);
        eVar.e(dq0Var.Q0, dq0Var.containerView.getMeasuredWidth(), dq0Var.containerView.getMeasuredHeight());
    }

    public static int F0(dq0 dq0Var) {
        dp0 dp0Var = dq0Var.B;
        if (dp0Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = dp0Var.getChildAt(0);
        vk0 vk0Var = (vk0) dp0Var.G(childAt);
        if (vk0Var == null) {
            return -1000;
        }
        int paddingTop = dp0Var.getPaddingTop();
        if (vk0Var.c() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    public static dq0 N0(Context context, MessageObject messageObject, String str, boolean z10, String str2) {
        return new dq0(context, messageObject != null ? org.telegram.messenger.x3.n(messageObject) : null, str, null, z10, str2, null, false);
    }

    public static /* synthetic */ void m(dq0 dq0Var, AtomicReference atomicReference, jp0 jp0Var, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        jp0Var.didReceivedNotification(NotificationCenter.topicsDidLoaded, dq0Var.currentAccount, Long.valueOf(-dialog.id));
    }

    public static boolean n(final dq0 dq0Var) {
        org.telegram.ui.tn tnVar;
        hp0 hp0Var = dq0Var.e;
        boolean z10 = dq0Var.d0;
        Activity activity = dq0Var.c0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(dq0Var.getContext());
        linearLayout.setOrientation(1);
        if (dq0Var.J != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, dq0Var.resourcesProvider);
            if (z10) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.fg));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new kp0(dq0Var, 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new vo0(dq0Var, 1));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(1, dq0Var.getContext(), dq0Var.resourcesProvider, true, false);
            if (z10) {
                g1Var.setTextColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, i7.f6.n(-1, 48));
            g1Var.g(LocaleController.getString(R.string.ShowSendersName), 0, null);
            dq0Var.E0 = true;
            g1Var.setChecked(true);
            final org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(1, dq0Var.getContext(), dq0Var.resourcesProvider, false, true);
            if (z10) {
                g1Var2.setTextColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ng));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, i7.f6.n(-1, 48));
            g1Var2.g(LocaleController.getString(R.string.HideSendersName), 0, null);
            g1Var2.setChecked(!dq0Var.E0);
            final int i10 = 0;
            g1Var.setOnClickListener(new View.OnClickListener(dq0Var) { // from class: org.telegram.ui.Components.zo0
                public final /* synthetic */ dq0 b;

                {
                    this.b = dq0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.b.E0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!r3.E0);
                            break;
                        default:
                            this.b.E0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!r3.E0);
                            break;
                    }
                }
            });
            final int i11 = 1;
            g1Var2.setOnClickListener(new View.OnClickListener(dq0Var) { // from class: org.telegram.ui.Components.zo0
                public final /* synthetic */ dq0 b;

                {
                    this.b = dq0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.b.E0 = true;
                            g1Var.setChecked(true);
                            g1Var2.setChecked(!r3.E0);
                            break;
                        default:
                            this.b.E0 = false;
                            g1Var.setChecked(false);
                            g1Var2.setChecked(!r3.E0);
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.I5));
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, i7.f6.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, dq0Var.resourcesProvider);
        if (z10) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.fg, false));
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new kp0(dq0Var, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new vo0(dq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(0, dq0Var.getContext(), dq0Var.resourcesProvider, true, true);
        if (z10) {
            g1Var3.setTextColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ng));
            g1Var3.setIconColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.H6));
        }
        g1Var3.g(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        g1Var3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var3, i7.f6.n(-1, 48));
        g1Var3.setOnClickListener(new uo0(dq0Var, 1));
        org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(0, dq0Var.getContext(), dq0Var.resourcesProvider, true, true);
        if (z10) {
            g1Var4.setTextColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ng));
            g1Var4.setIconColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.H6));
        }
        g1Var4.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        g1Var4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(g1Var4, i7.f6.n(-1, 48));
        g1Var4.setOnClickListener(new uo0(dq0Var, 2));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setupRadialSelectors(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.I5));
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, i7.f6.n(-1, -2));
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(linearLayout, -2, -2);
        dq0Var.F0 = o1Var;
        o1Var.b = false;
        o1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        dq0Var.F0.setOutsideTouchable(true);
        dq0Var.F0.setClippingEnabled(true);
        dq0Var.F0.setInputMethodMode(2);
        dq0Var.F0.setSoftInputMode(0);
        dq0Var.F0.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        dq0Var.F0.setFocusable(true);
        int[] iArr = new int[2];
        hp0Var.getLocationInWindow(iArr);
        dq0Var.F0.showAtLocation(hp0Var, 51, AndroidUtilities.dp(8.0f) + ((hp0Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!dq0Var.keyboardVisible || (tnVar = dq0Var.b0) == null || tnVar.T0.getMeasuredHeight() <= AndroidUtilities.dp(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f) : hp0Var.getMeasuredHeight() + iArr[1]);
        dq0Var.F0.b();
        try {
            hp0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void o(dq0 dq0Var, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z10, int i10, HashMap hashMap) {
        int i11;
        boolean z11;
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
        fp0 fp0Var;
        long j12;
        long j13;
        Long l10;
        MessageObject messageObject3;
        MessageObject messageObject4;
        long longValue;
        String[] strArr2 = dq0Var.K;
        gp0 gp0Var = dq0Var.d;
        fp0 fp0Var2 = dq0Var.c;
        HashMap hashMap2 = dq0Var.R;
        Long l11 = 0L;
        a0.h hVar = dq0Var.Q;
        ArrayList arrayList3 = dq0Var.J;
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
                boolean isMonoForum = MessagesController.getInstance(dq0Var.currentAccount).isMonoForum(j14);
                Long l12 = hashMap == null ? l11 : (Long) hashMap.get(Long.valueOf(j14));
                if (l12 != null && l12.longValue() > 0) {
                    z12 = true;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j14));
                if (tL_forumTopic2 == null || !isMonoForum) {
                    fp0Var = fp0Var2;
                    j12 = j14;
                    j13 = 0;
                } else {
                    fp0Var = fp0Var2;
                    j12 = j14;
                    j13 = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                }
                if (tL_forumTopic2 == null || isMonoForum) {
                    l10 = l11;
                    messageObject3 = null;
                } else {
                    l10 = l11;
                    messageObject3 = new MessageObject(dq0Var.currentAccount, tL_forumTopic2.topicStartMessage, false, false);
                }
                if (messageObject3 != null) {
                    messageObject3.isTopicMainMessage = true;
                }
                if (fp0Var.getTag() == null || gp0Var.a.length() <= 0) {
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
                    SendMessagesHelper.getInstance(dq0Var.currentAccount).sendMessage(of3);
                }
                long j15 = j12;
                int sendMessage = SendMessagesHelper.getInstance(dq0Var.currentAccount).sendMessage(dq0Var.J, j15, !dq0Var.E0, false, z10, 0, 0, messageObject4, i10, l12 == null ? 0L : l12.longValue(), j13, null);
                if (sendMessage != 0) {
                    arrayList4.add(Long.valueOf(j15));
                }
                if (hVar.m() == 1) {
                    tL_forumTopic = null;
                    c5.t0(sendMessage, dq0Var.b0, null);
                    if (sendMessage != 0) {
                        break;
                    }
                }
                i13++;
                arrayList3 = arrayList2;
                fp0Var2 = fp0Var;
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
                dq0Var.R0(hVar, arrayList2.size(), hVar.m() == 1 ? (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(0)) : tL_forumTopic, !z12);
            }
        } else {
            op0 op0Var = dq0Var.S;
            int i15 = op0Var != null ? op0Var.d : 0;
            if (dq0Var.B0 != null) {
                int i16 = 0;
                boolean z13 = false;
                while (i16 < hVar.m()) {
                    long j16 = hVar.j(i16);
                    boolean isMonoForum2 = MessagesController.getInstance(dq0Var.currentAccount).isMonoForum(j16);
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
                        messageObject2 = new MessageObject(dq0Var.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    }
                    if (dq0Var.B0 != null) {
                        if (fp0Var2.getTag() != null && gp0Var.a.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject2;
                            messageObject2 = messageObject6;
                            SendMessagesHelper.getInstance(dq0Var.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j16, null, messageObject6, null, true, null, null, null, z10, 0, 0, null, false));
                        }
                        of2 = SendMessagesHelper.SendMessageParams.of(null, j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                        of2.sendingStory = dq0Var.B0;
                    } else if (fp0Var2.getTag() == null || gp0Var.a.length() <= 0) {
                        of2 = SendMessagesHelper.SendMessageParams.of(strArr[i12], j16, messageObject2, messageObject2, null, true, null, null, null, z10, 0, 0, null, false);
                    } else {
                        CharSequence charSequence2 = charSequenceArr[0];
                        of2 = SendMessagesHelper.SendMessageParams.of(charSequence2 == null ? null : charSequence2.toString(), j16, messageObject2, messageObject2, null, true, arrayList, null, null, z10, 0, 0, null, false);
                    }
                    of2.payStars = l13 == null ? 0L : l13.longValue();
                    of2.monoForumPeer = j11;
                    SendMessagesHelper.getInstance(dq0Var.currentAccount).sendMessage(of2);
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
                        boolean isMonoForum3 = MessagesController.getInstance(dq0Var.currentAccount).isMonoForum(j17);
                        Long l14 = hashMap == null ? l11 : (Long) hashMap.get(Long.valueOf(j17));
                        if (l14 != null && l14.longValue() > 0) {
                            z14 = true;
                        }
                        TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap2.get(hVar.f(j17));
                        long peerDialogId = (tL_forumTopic4 == null || !isMonoForum3) ? 0L : DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                        if (tL_forumTopic4 == null || isMonoForum3) {
                            c3 = 0;
                            messageObject = null;
                        } else {
                            c3 = 0;
                            messageObject = new MessageObject(dq0Var.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                        }
                        if (fp0Var2.getTag() == null || gp0Var.a.length() <= 0) {
                            j10 = j17;
                        } else {
                            CharSequence charSequence3 = charSequenceArr[c3];
                            SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(charSequence3 == null ? null : charSequence3.toString(), j17, messageObject, messageObject, null, true, arrayList, null, null, z10, 0, 0, null, false);
                            j10 = j17;
                            of4.payStars = l14 == null ? 0L : l14.longValue();
                            of4.monoForumPeer = peerDialogId;
                            SendMessagesHelper.getInstance(dq0Var.currentAccount).sendMessage(of4);
                        }
                        SendMessagesHelper.SendMessageParams of5 = SendMessagesHelper.SendMessageParams.of(strArr2[i17], j10, messageObject, messageObject, null, true, null, null, null, z10, 0, 0, null, false);
                        of5.payStars = l14 == null ? 0L : l14.longValue();
                        of5.monoForumPeer = peerDialogId;
                        SendMessagesHelper.getInstance(dq0Var.currentAccount).sendMessage(of5);
                    }
                    z11 = z14;
                } else {
                    i11 = 0;
                    z11 = false;
                    dq0Var.R0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i11)), !z11);
                }
            }
            i11 = 0;
            dq0Var.R0(hVar, 1, (TLRPC.TL_forumTopic) hashMap2.get(hVar.n(i11)), !z11);
        }
        rp0 rp0Var = dq0Var.o0;
        if (rp0Var != null) {
            rp0Var.M();
        }
        dq0Var.dismiss();
    }

    public static void p(dq0 dq0Var, int i10) {
        TLRPC.Dialog dialog;
        x10 x10Var = dq0Var.u0;
        HashMap hashMap = dq0Var.R;
        a0.h hVar = dq0Var.Q;
        up0 up0Var = dq0Var.G;
        aq0 aq0Var = dq0Var.H;
        if (aq0Var.d && i10 == 1) {
            TLRPC.Dialog dialog2 = dq0Var.y0;
            if (dialog2 == null) {
                return;
            }
            hVar.k(dialog2, dialog2.id);
            hashMap.remove(dialog2);
            dq0Var.a1(2);
            if (dq0Var.H0 || dq0Var.I0) {
                if (((TLRPC.Dialog) up0Var.e.f(dialog2.id)) == null) {
                    up0Var.e.k(dialog2, dialog2.id);
                    ArrayList arrayList = up0Var.d;
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                up0Var.l();
                dq0Var.w0 = false;
                x10Var.r.setText("");
                dq0Var.K0(false);
            }
            for (int i11 = 0; i11 < dq0Var.P0().getChildCount(); i11++) {
                View childAt = dq0Var.P0().getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.c7) {
                    org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) childAt;
                    if (c7Var.getCurrentDialog() == dq0Var.y0.id) {
                        c7Var.d(null, false, true);
                        c7Var.b(true, true);
                    }
                }
            }
            dq0Var.L0();
            return;
        }
        TLRPC.TL_forumTopic E = aq0Var.E(i10);
        if (E == null || (dialog = dq0Var.y0) == null) {
            return;
        }
        long j10 = dialog.id;
        boolean isMonoForum = MessagesController.getInstance(dq0Var.currentAccount).isMonoForum(j10);
        TLRPC.Dialog dialog3 = dq0Var.y0;
        hVar.k(dialog3, j10);
        hashMap.put(dialog3, E);
        dq0Var.a1(2);
        if (dq0Var.H0 || dq0Var.I0) {
            if (((TLRPC.Dialog) up0Var.e.f(dialog3.id)) == null) {
                up0Var.e.k(dialog3, dialog3.id);
                ArrayList arrayList2 = up0Var.d;
                arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
            }
            up0Var.l();
            dq0Var.w0 = false;
            x10Var.r.setText("");
            dq0Var.K0(false);
        }
        for (int i12 = 0; i12 < dq0Var.P0().getChildCount(); i12++) {
            View childAt2 = dq0Var.P0().getChildAt(i12);
            if (childAt2 instanceof org.telegram.ui.Cells.c7) {
                org.telegram.ui.Cells.c7 c7Var2 = (org.telegram.ui.Cells.c7) childAt2;
                if (c7Var2.getCurrentDialog() == dq0Var.y0.id) {
                    c7Var2.d(E, isMonoForum, true);
                    c7Var2.b(true, true);
                }
            }
        }
        dq0Var.L0();
    }

    public static void s0(dq0 dq0Var) {
        dp0 dp0Var = dq0Var.B;
        dp0 dp0Var2 = dq0Var.C;
        jl0 jl0Var = dq0Var.A;
        if (dq0Var.n0) {
            return;
        }
        dp0 dp0Var3 = dq0Var.H0 ? dp0Var2 : dp0Var;
        if (dp0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = dp0Var3.getChildAt(0);
        for (int i10 = 0; i10 < dp0Var3.getChildCount(); i10++) {
            if (dp0Var3.getChildAt(i10).getTop() < childAt.getTop()) {
                childAt = dp0Var3.getChildAt(i10);
            }
        }
        vk0 vk0Var = (vk0) dp0Var3.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i11 = (top <= 0 || vk0Var == null || vk0Var.b() != 0) ? 0 : top;
        if (top < 0 || vk0Var == null || vk0Var.b() != 0) {
            dq0Var.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            dq0Var.T0(true);
            top = i11;
        } else {
            dq0Var.G0 = childAt.getTop();
            dq0Var.T0(false);
        }
        if (jl0Var.getVisibility() == 0) {
            if (jl0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = jl0Var.getChildAt(0);
            for (int i12 = 0; i12 < jl0Var.getChildCount(); i12++) {
                if (jl0Var.getChildAt(i12).getTop() < childAt2.getTop()) {
                    childAt2 = jl0Var.getChildAt(i12);
                }
            }
            vk0 vk0Var2 = (vk0) jl0Var.G(childAt2);
            int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
            int i13 = (top2 <= 0 || vk0Var2 == null || vk0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || vk0Var2 == null || vk0Var2.b() != 0) {
                dq0Var.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                dq0Var.T0(true);
                top2 = i13;
            } else {
                dq0Var.G0 = childAt2.getTop();
                dq0Var.T0(false);
            }
            top = AndroidUtilities.lerp(top, top2, jl0Var.getAlpha());
        }
        int i14 = dq0Var.l0;
        if (i14 != top) {
            dq0Var.m0 = i14;
            float f9 = top;
            int i15 = (int) (dq0Var.p0 + f9);
            dq0Var.l0 = i15;
            dp0Var.setTopGlowOffset(i15);
            int i16 = (int) (dq0Var.p0 + f9);
            dq0Var.l0 = i16;
            dp0Var2.setTopGlowOffset(i16);
            int i17 = (int) (f9 + dq0Var.p0);
            dq0Var.l0 = i17;
            jl0Var.setTopGlowOffset(i17);
            dq0Var.b.setTranslationY(dq0Var.l0 + dq0Var.p0);
            dq0Var.M.setTranslationY(dq0Var.l0 + dq0Var.p0);
            dq0Var.containerView.invalidate();
        }
    }

    public final void K0(boolean z10) {
        x10 x10Var = this.u0;
        ig.f fVar = x10Var.r;
        ig.f fVar2 = x10Var.r;
        boolean isEmpty = TextUtils.isEmpty(fVar.getText());
        dp0 dp0Var = this.B;
        dp0 dp0Var2 = this.C;
        boolean z11 = true;
        if (!isEmpty || ((this.keyboardVisible && fVar2.hasFocus()) || this.I0)) {
            this.w0 = true;
            if (this.y0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(dp0Var, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(dp0Var2, true);
            }
        } else {
            if (this.y0 == null) {
                AndroidUtilities.updateViewVisibilityAnimated(dp0Var, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(dp0Var2, false);
            }
            z11 = false;
        }
        if (this.H0 != z11 || z10) {
            this.H0 = z11;
            zp0 zp0Var = this.I;
            zp0Var.l();
            this.G.l();
            if (this.H0) {
                if (this.G0 == Integer.MAX_VALUE) {
                    ((f2.j0) dp0Var2.getLayoutManager()).h1(0, -dp0Var2.getPaddingTop());
                } else {
                    ((f2.j0) dp0Var2.getLayoutManager()).h1(0, this.G0 - dp0Var2.getPaddingTop());
                }
                zp0Var.E(fVar2.getText().toString());
                return;
            }
            int i10 = this.G0;
            f2.w wVar = this.D;
            if (i10 == Integer.MAX_VALUE) {
                wVar.h1(0, 0);
            } else {
                wVar.h1(0, 0);
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
            if ((childAt instanceof org.telegram.ui.Cells.c7) && ((org.telegram.ui.Cells.c7) childAt).getCurrentDialog() == dialog.id) {
                view = childAt;
            }
        }
        if (view == null) {
            return;
        }
        o1.k kVar = this.x0;
        if (kVar != null) {
            kVar.c();
        }
        P0().setVisibility(0);
        x10 x10Var = this.u0;
        x10Var.setVisibility(0);
        ig.f fVar = x10Var.r;
        if (this.H0 || this.I0) {
            this.z0.D.v = true;
            fVar.requestFocus();
            AndroidUtilities.showKeyboard(fVar);
        }
        int[] iArr = new int[2];
        o1.k kVar2 = new o1.k(new ib.a(1000.0f));
        o1.l lVar = new o1.l(0.0f);
        org.telegram.ui.tn tnVar = this.b0;
        lVar.b((tnVar == null || !tnVar.b) ? 800.0f : 10.0f);
        lVar.a(1.0f);
        kVar2.u = lVar;
        this.x0 = kVar2;
        kVar2.b(new to0(this, (org.telegram.ui.Cells.c7) view, iArr, 0));
        this.x0.a(new db(this, 4));
        this.x0.f();
    }

    public final void M0() {
        boolean z10 = false;
        if (this.g0 == null && this.k0[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
            rp0 rp0Var = this.o0;
            if (rp0Var != null) {
                rp0Var.r0();
                return;
            }
            if (this.c0 instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.g0;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z10 = true;
                }
                ((LaunchActivity) this.c0).D0(new j3.t(2, z10));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final String O0() {
        String str;
        String[] strArr = this.k0;
        op0 op0Var = this.S;
        if (op0Var != null) {
            str = strArr[op0Var.d];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.g0;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        hp hpVar = this.a0;
        if (hpVar != null && hpVar.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.X)).build().toString();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return str == null ? "" : str;
    }

    public final jl0 P0() {
        return (this.H0 || this.I0) ? this.C : this.B;
    }

    public final void Q0(View view, int[] iArr, float f9) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        jl0 jl0Var = this.A;
        jl0Var.setPivotX(width);
        jl0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f9;
        float f11 = 0.75f + f10;
        jl0Var.setScaleX(f11);
        jl0Var.setScaleY(f11);
        jl0Var.setAlpha(f9);
        jl0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        P0.setScaleX(f12);
        P0.setScaleY(f12);
        float f13 = 1.0f - f9;
        P0.setAlpha(f13);
        x10 x10Var = this.u0;
        x10Var.setPivotX(x10Var.getWidth() / 2.0f);
        x10Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        x10Var.setScaleX(f14);
        x10Var.setScaleY(f14);
        x10Var.setAlpha(f13);
        org.telegram.ui.ActionBar.l lVar = this.v0;
        lVar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f13);
        lVar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        lVar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f13);
        lVar.setAlpha(f9);
        jl0Var.getLocationInWindow(iArr);
        float interpolation = jr.g.getInterpolation(f9);
        for (int i10 = 0; i10 < P0.getChildCount(); i10++) {
            View childAt = P0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.c7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f9, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f13);
                }
            }
        }
        for (int i11 = 0; i11 < jl0Var.getChildCount(); i11++) {
            View childAt2 = jl0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.d7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((jl0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
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
        animatorSetArr[0].addListener(new lp0(this, z10, 0));
        animatorSetArr[0].start();
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        dq0 dq0Var;
        ArrayList<TLRPC.TL_forumTopic> topics;
        yp0 yp0Var;
        if (dialog instanceof tp0) {
            S0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.c7) && ((org.telegram.ui.Cells.c7) view).B) || ((view instanceof org.telegram.ui.Cells.f6) && ((org.telegram.ui.Cells.f6) view).j0)) {
            X0(dialog.id, view);
            return;
        }
        jl0 jl0Var = this.A;
        if (jl0Var.getVisibility() != 8 || (activity = this.c0) == null) {
            return;
        }
        boolean isChatDialog = DialogObject.isChatDialog(dialog.id);
        int i10 = this.L;
        if (isChatDialog) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.id, this.currentAccount) || i10 == 2 || i10 == 3)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String string = LocaleController.getString(R.string.SendMessageTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                if (i10 == 3) {
                    if (ChatObject.isActionBannedByDefault(chat, 10)) {
                        c2Var.P = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                    } else {
                        c2Var.P = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                    }
                } else if (i10 != 2) {
                    c2Var.P = LocaleController.getString(R.string.ChannelCantSendMessage);
                } else if (this.j0) {
                    c2Var.P = LocaleController.getString(R.string.PublicPollCantForward);
                } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                    c2Var.P = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                } else {
                    c2Var.P = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                }
                j7.l1.u(R.string.OK, alertDialog$Builder, null);
                return;
            }
        } else if (DialogObject.isEncryptedDialog(dialog.id) && i10 != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String string2 = LocaleController.getString(R.string.SendMessageTitle);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
            c2Var2.N = string2;
            if (i10 == 3) {
                c2Var2.P = LocaleController.getString(R.string.TodoCantForwardSecretChat);
            } else if (i10 != 0) {
                c2Var2.P = LocaleController.getString(R.string.PollCantForwardSecretChat);
            } else {
                c2Var2.P = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
            }
            j7.l1.u(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        long j10 = dialog.id;
        a0.h hVar = this.Q;
        if (hVar.h(j10) >= 0) {
            hVar.l(dialog.id);
            this.R.remove(dialog);
            if (view instanceof org.telegram.ui.Cells.f6) {
                ((org.telegram.ui.Cells.f6) view).s(false, true);
            } else if (view instanceof org.telegram.ui.Cells.c7) {
                ((org.telegram.ui.Cells.c7) view).b(false, true);
            }
            a1(1);
            dq0Var = this;
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if ((UserObject.isBotForum(user) && !(((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id))) || (DialogObject.isChatDialog(dialog.id) && (ChatObject.isForum(chat2) || (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                this.y0 = dialog;
                this.E.h1(0, this.l0 - jl0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                jp0 jp0Var = new jp0(this, dialog, atomicReference, view);
                atomicReference.set(new org.telegram.ui.gg(this, atomicReference, jp0Var, dialog, 24));
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i11 = NotificationCenter.topicsDidLoaded;
                notificationCenter.addObserver(jp0Var, i11);
                if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.id) != null) {
                    jp0Var.didReceivedNotification(i11, this.currentAccount, Long.valueOf(-dialog.id));
                    return;
                } else {
                    MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.id);
                    AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            dq0Var = this;
            hVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.f6) {
                ((org.telegram.ui.Cells.f6) view).s(true, true);
            } else if (view instanceof org.telegram.ui.Cells.c7) {
                ((org.telegram.ui.Cells.c7) view).b(true, true);
            }
            a1(2);
            long j11 = UserConfig.getInstance(dq0Var.currentAccount).clientUserId;
            if (dq0Var.H0) {
                up0 up0Var = dq0Var.G;
                a0.h hVar2 = up0Var.e;
                ArrayList arrayList = up0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.id);
                if (dialog2 == null) {
                    up0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j11) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                up0Var.l();
                dq0Var.w0 = false;
                x10 x10Var = dq0Var.u0;
                x10Var.r.setText("");
                K0(false);
                AndroidUtilities.hideKeyboard(x10Var.r);
            }
        }
        zp0 zp0Var = dq0Var.I;
        if (zp0Var == null || (yp0Var = zp0Var.D) == null) {
            return;
        }
        yp0Var.q(0, yp0Var.h());
    }

    public final void V0(final boolean z10) {
        int i10;
        int i11 = 0;
        while (true) {
            a0.h hVar = this.Q;
            int m10 = hVar.m();
            fp0 fp0Var = this.c;
            gp0 gp0Var = this.d;
            if (i11 >= m10) {
                Editable text = gp0Var.getText();
                vt vtVar = gp0Var.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                hp hpVar = this.a0;
                int i12 = (hpVar == null || !hpVar.a.q) ? -1 : this.X;
                ArrayList arrayList = new ArrayList();
                if (this.J != null) {
                    i10 = 0;
                    for (int i13 = 0; i13 < hVar.m(); i13++) {
                        long j10 = hVar.j(i13);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j10);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j10));
                        }
                        if (fp0Var.getTag() != null && vtVar.length() > 0 && sendPaidMessagesStars > 0) {
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
                    op0 op0Var = this.S;
                    int i14 = op0Var != null ? op0Var.d : 0;
                    if (this.B0 != null) {
                        int i15 = 0;
                        for (int i16 = 0; i16 < hVar.m(); i16++) {
                            long j11 = hVar.j(i16);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j11);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j11));
                            }
                            if (this.B0 != null && fp0Var.getTag() != null && vtVar.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
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
                                if (fp0Var.getTag() != null && vtVar.length() > 0 && sendPaidMessagesStars3 > 0) {
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
                c5.c0(this.currentAccount, arrayList, i10, new Utilities.Callback() { // from class: org.telegram.ui.Components.ap0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        dq0.o(dq0.this, charSequenceArr, entities, z10, i19, (HashMap) obj);
                    }
                });
                return;
            }
            if (c5.h(getContext(), this.currentAccount, hVar.j(i11), fp0Var.getTag() != null && gp0Var.a.length() > 0)) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void W0(boolean z10) {
        fp0 fp0Var = this.c;
        if (z10 == (fp0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        fp0Var.setTag(z10 ? 1 : null);
        gp0 gp0Var = this.d;
        if (gp0Var.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(gp0Var.getEditText());
        }
        gp0Var.k(true);
        FrameLayout frameLayout = this.Y;
        fp0 fp0Var2 = this.f;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            fp0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            fp0Var2.setVisibility(0);
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
        float f9 = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(fp0Var, (Property<fp0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(fp0Var2, (Property<fp0, Float>) View.SCALE_X, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(fp0Var2, (Property<fp0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(fp0Var2, (Property<fp0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.O[1], (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout3 = this.r;
        if (frameLayout3 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.d0 && z10) {
                f9 = AndroidUtilities.dp(this.Z != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, f9));
        }
        this.y.playTogether(arrayList);
        this.y.setInterpolator(new DecelerateInterpolator());
        this.y.setDuration(180L);
        this.y.addListener(new lp0(this, z10, 1));
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
        (premiumFeaturesBlocked ? new tc(frameLayout, this.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : new tc(frameLayout, this.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new wo0(this, i11))).j();
    }

    public final void Y0() {
        org.telegram.ui.ActionBar.q1 q1Var;
        fp0 fp0Var = this.c;
        if (fp0Var == null) {
            return;
        }
        gp0 gp0Var = this.d;
        if (gp0Var == null || !gp0Var.m()) {
            np0 np0Var = this.z0;
            if (np0Var != null && (q1Var = np0Var.D) != null && !q1Var.f) {
                AndroidUtilities.dp(20.0f);
            }
        } else {
            gp0Var.getEmojiPaddingShown();
        }
        float f9 = 0.0f;
        FrameLayout frameLayout = this.Y;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f9 = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            float f10 = -f9;
            frameLayout2.setTranslationY(f10);
            LinearLayout linearLayout = this.x;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f10);
            }
        }
        float f11 = -f9;
        fp0Var.setTranslationY(f11);
        this.f.setTranslationY(f11);
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
        gp0 gp0Var = this.d;
        if (tag != null && gp0Var.a.length() > 0) {
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
        hp0 hp0Var = this.e;
        hp0Var.g(max, z10);
        hp0Var.i(size, j10, i10 != 0);
        W0(true);
        gp0Var.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), hp0Var.l()), 0);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.dialogsNeedReload;
        if (i10 == i12) {
            up0 up0Var = this.G;
            if (up0Var != null) {
                up0Var.E();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        gp0 gp0Var = this.d;
        if (gp0Var != null) {
            AndroidUtilities.hideKeyboard(gp0Var.getEditText());
        }
        this.U = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public void dismissInternal() {
        super.dismissInternal();
        gp0 gp0Var = this.d;
        if (gp0Var != null) {
            gp0Var.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.T;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        if (this.y0 != null) {
            L0();
            return;
        }
        gp0 gp0Var = this.d;
        if (gp0Var == null || !gp0Var.e) {
            super.onBackPressed();
        } else {
            gp0Var.k(true);
        }
    }

    public dq0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:130:0x081d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dq0(Context context, org.telegram.ui.tn tnVar, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, Integer num, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true, false);
        int i10;
        float f9;
        dp0 dp0Var;
        dp0 dp0Var2;
        LinearLayout linearLayout;
        int i11;
        final int i12 = 0;
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
        int i13 = 4;
        while (true) {
            if (i13 >= 32) {
                i10 = 80;
                break;
            }
            i10 = (1 << i13) - 12;
            if (80 <= i10) {
                break;
            } else {
                i13++;
            }
        }
        int i14 = i10 / 8;
        long[] jArr = new long[i14];
        Object[] objArr = new Object[i14];
        this.C0 = i0.b.e;
        this.D0 = 4;
        this.E0 = true;
        this.G0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        ArrayList arrayList2 = new ArrayList();
        this.U0 = arrayList2;
        RectF rectF = new RectF();
        this.V0 = rectF;
        arrayList2.add(rectF);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        qg.c cVar = new qg.c();
        int i15 = org.telegram.ui.ActionBar.g6.d6;
        cVar.a(getThemedColor(i15));
        int i16 = 5;
        int i17 = 3;
        if (Build.VERSION.SDK_INT >= 31) {
            this.K0 = new lg.e(false);
            qg.d dVar = new qg.d(null);
            this.M0 = dVar;
            dVar.i(new o4.g(this, i16));
            qg.d dVar2 = new qg.d(null);
            this.L0 = dVar2;
            dVar2.i(new n(this, i17));
            lg.a aVar = new lg.a(dVar);
            this.N0 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            lg.a aVar2 = new lg.a(dVar2);
            this.O0 = aVar2;
            aVar2.f = LiteMode.isEnabled(262144);
        } else {
            this.K0 = null;
            this.L0 = null;
            this.M0 = null;
            this.N0 = new lg.a(cVar);
            this.O0 = new lg.a(cVar);
        }
        this.P0 = new lg.a(cVar);
        this.resourcesProvider = c6Var;
        this.V = z13;
        this.c0 = AndroidUtilities.findActivity(context);
        this.d0 = z12;
        if (z12) {
            this.resourcesProvider = new lh.h0(1);
        }
        cVar.a(getThemedColor(i15));
        this.b0 = tnVar;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.N = mutate;
        int i18 = org.telegram.ui.ActionBar.g6.h5;
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
                org.telegram.ui.th.w(sb2, MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, "/");
                sb2.append(messageObject.getId());
                strArr2[0] = sb2.toString();
                if (arrayList.size() == 1 && messageObject.hasValidGroupId()) {
                    strArr2[0] = a4.w.q(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.J = arrayList;
        this.I = new zp0(this, context);
        this.j0 = z10;
        strArr[0] = str;
        strArr[1] = str2;
        this.useSmoothKeyboard = true;
        setDelegate(new org.telegram.ui.k0(this, 1));
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
        int i21 = 16;
        if (z10) {
            this.h0 = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((MessageObject) arrayList.get(0)).getId();
            tL_channels_exportMessageLink.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(((MessageObject) arrayList.get(0)).messageOwner.peer_id.channel_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_exportMessageLink, new org.telegram.ui.zg(i21, this, context));
        }
        np0 np0Var = new np0(this, context);
        this.z0 = np0Var;
        this.containerView = np0Var;
        lg.a aVar3 = this.N0;
        sg.i iVar = new sg.i(this.containerView);
        ViewGroup viewGroup = this.containerView;
        aVar3.d = iVar;
        aVar3.e = viewGroup;
        lg.a aVar4 = this.O0;
        sg.i iVar2 = new sg.i(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        aVar4.d = iVar2;
        aVar4.e = viewGroup2;
        lg.a aVar5 = this.P0;
        sg.i iVar3 = new sg.i(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        aVar5.d = iVar3;
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
            op0 op0Var = new op0(this, context);
            this.S = op0Var;
            frameLayout.addView(op0Var, i7.f6.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        x10 x10Var = new x10(context, this.resourcesProvider);
        this.u0 = x10Var;
        pp0 pp0Var = new pp0(this);
        ig.f fVar = x10Var.r;
        fVar.addTextChangedListener(pp0Var);
        fVar.setHint(LocaleController.getString(R.string.ShareSendTo));
        fVar.setOnEditorActionListener(new f1(this, 6));
        x10Var.setCloseButtonOnClickListener(new wo0(this, i12));
        frameLayout.addView(x10Var, i7.f6.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, null);
        this.v0 = lVar;
        lVar.setOccupyStatusBar(false);
        lVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i24 = org.telegram.ui.ActionBar.g6.j5;
        lVar.setTitleColor(getThemedColor(i24));
        lVar.setSubtitleColor(getThemedColor(org.telegram.ui.ActionBar.g6.q5));
        lVar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z6, false), false);
        lVar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.u8, false), false);
        lVar.setActionBarMenuOnItemClick(new cg.n1(this, 29));
        lVar.setVisibility(8);
        frameLayout.addView(lVar, i7.f6.e(-1, 58, 83));
        jl0 jl0Var = new jl0(context, this.resourcesProvider);
        this.A = jl0Var;
        f2.w wVar = new f2.w(4);
        this.E = wVar;
        jl0Var.setLayoutManager(wVar);
        wVar.O = new ep0(this, 2);
        jl0Var.setOnScrollListener(new cp0(this, i12));
        aq0 aq0Var = new aq0(this, context);
        this.H = aq0Var;
        jl0Var.setAdapter(aq0Var);
        int i25 = org.telegram.ui.ActionBar.g6.A5;
        jl0Var.setGlowColor(getThemedColor(i25));
        jl0Var.setVerticalScrollBarEnabled(false);
        jl0Var.setHorizontalScrollBarEnabled(false);
        jl0Var.setOverScrollMode(2);
        jl0Var.setSelectorDrawableColor(0);
        jl0Var.setItemSelectorColorProvider(new xo0(i12));
        jl0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        jl0Var.setClipToPadding(false);
        jl0Var.i(new lh.j(i17));
        jl0Var.setOnItemClickListener(new zk0(this) { // from class: org.telegram.ui.Components.yo0
            public final /* synthetic */ dq0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.zk0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i26, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i12) {
                    case 0:
                        dq0.p(this.b, i26);
                        break;
                    case 1:
                        if (i26 >= 0) {
                            dq0 dq0Var = this.b;
                            ArrayList arrayList3 = dq0Var.G.d;
                            int i27 = i26 - 1;
                            TLRPC.Dialog dialog = (i27 < 0 || i27 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i27);
                            if (dialog != null) {
                                dq0Var.U0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i26 >= 0) {
                            dq0 dq0Var2 = this.b;
                            zp0 zp0Var = dq0Var2.I;
                            dq0 dq0Var3 = zp0Var.G;
                            int i28 = zp0Var.A;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i26 < i28 || i28 < 0) {
                                int i29 = i26 - 1;
                                if (i29 >= 0) {
                                    if (i29 < zp0Var.d.size()) {
                                        tL_dialog2 = ((qp0) zp0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - zp0Var.d.size();
                                        ArrayList arrayList4 = zp0Var.e.d;
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
                                    dq0Var2.U0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i26 - i28;
                                if (i30 >= 0 && i30 < dq0Var3.A0.size()) {
                                    TLObject tLObject2 = ((rf.z) dq0Var3.A0.get(i30)).a;
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
        jl0Var.setVisibility(8);
        this.containerView.addView(jl0Var, i7.f6.e(-1, -1, 51));
        dp0 dp0Var3 = new dp0(this, context, this.resourcesProvider, i12);
        this.B = dp0Var3;
        dp0Var3.setSelectorDrawableColor(0);
        dp0Var3.setItemSelectorColorProvider(new xo0(i12));
        dp0Var3.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        dp0Var3.setClipToPadding(false);
        getContext();
        f2.w wVar2 = new f2.w(4);
        this.D = wVar2;
        dp0Var3.setLayoutManager(wVar2);
        this.Q0 = new lg.k(dp0Var3, this.containerView, new vv(dp0Var3, i17));
        wVar2.O = new ep0(this, i12);
        dp0Var3.setHorizontalScrollBarEnabled(false);
        dp0Var3.setVerticalScrollBarEnabled(false);
        dp0Var3.setOverScrollMode(2);
        dp0Var3.i(new lh.j(4));
        this.containerView.addView(dp0Var3, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        up0 up0Var = new up0(this, context);
        this.G = up0Var;
        dp0Var3.setAdapter(up0Var);
        dp0Var3.setGlowColor(getThemedColor(i25));
        final int i26 = 1;
        dp0Var3.setOnItemClickListener(new zk0(this) { // from class: org.telegram.ui.Components.yo0
            public final /* synthetic */ dq0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.zk0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i262, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i26) {
                    case 0:
                        dq0.p(this.b, i262);
                        break;
                    case 1:
                        if (i262 >= 0) {
                            dq0 dq0Var = this.b;
                            ArrayList arrayList3 = dq0Var.G.d;
                            int i27 = i262 - 1;
                            TLRPC.Dialog dialog = (i27 < 0 || i27 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i27);
                            if (dialog != null) {
                                dq0Var.U0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i262 >= 0) {
                            dq0 dq0Var2 = this.b;
                            zp0 zp0Var = dq0Var2.I;
                            dq0 dq0Var3 = zp0Var.G;
                            int i28 = zp0Var.A;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i262 < i28 || i28 < 0) {
                                int i29 = i262 - 1;
                                if (i29 >= 0) {
                                    if (i29 < zp0Var.d.size()) {
                                        tL_dialog2 = ((qp0) zp0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - zp0Var.d.size();
                                        ArrayList arrayList4 = zp0Var.e.d;
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
                                    dq0Var2.U0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i262 - i28;
                                if (i30 >= 0 && i30 < dq0Var3.A0.size()) {
                                    TLObject tLObject2 = ((rf.z) dq0Var3.A0.get(i30)).a;
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
        dp0Var3.setOnScrollListener(new cp0(this, i26));
        dp0 dp0Var4 = new dp0(this, context, this.resourcesProvider, i26);
        this.C = dp0Var4;
        dp0Var4.setItemSelectorColorProvider(new xo0(i12));
        dp0Var4.setSelectorDrawableColor(0);
        dp0Var4.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        dp0Var4.setClipToPadding(false);
        getContext();
        jz jzVar = new jz(4, 0, dp0Var4);
        this.F = jzVar;
        dp0Var4.setLayoutManager(jzVar);
        jzVar.O = new ep0(this, 1);
        final int i27 = 2;
        dp0Var4.setOnItemClickListener(new zk0(this) { // from class: org.telegram.ui.Components.yo0
            public final /* synthetic */ dq0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.zk0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i262, View view) {
                TLRPC.TL_dialog tL_dialog;
                switch (i27) {
                    case 0:
                        dq0.p(this.b, i262);
                        break;
                    case 1:
                        if (i262 >= 0) {
                            dq0 dq0Var = this.b;
                            ArrayList arrayList3 = dq0Var.G.d;
                            int i272 = i262 - 1;
                            TLRPC.Dialog dialog = (i272 < 0 || i272 >= arrayList3.size()) ? null : (TLRPC.Dialog) arrayList3.get(i272);
                            if (dialog != null) {
                                dq0Var.U0(view, dialog);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i262 >= 0) {
                            dq0 dq0Var2 = this.b;
                            zp0 zp0Var = dq0Var2.I;
                            dq0 dq0Var3 = zp0Var.G;
                            int i28 = zp0Var.A;
                            TLRPC.TL_dialog tL_dialog2 = null;
                            if (i262 < i28 || i28 < 0) {
                                int i29 = i262 - 1;
                                if (i29 >= 0) {
                                    if (i29 < zp0Var.d.size()) {
                                        tL_dialog2 = ((qp0) zp0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - zp0Var.d.size();
                                        ArrayList arrayList4 = zp0Var.e.d;
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
                                    dq0Var2.U0(view, tL_dialog2);
                                    break;
                                }
                            } else {
                                int i30 = i262 - i28;
                                if (i30 >= 0 && i30 < dq0Var3.A0.size()) {
                                    TLObject tLObject2 = ((rf.z) dq0Var3.A0.get(i30)).a;
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
        dp0Var4.setHasFixedSize(true);
        dp0Var4.setItemAnimator(null);
        dp0Var4.setHorizontalScrollBarEnabled(false);
        dp0Var4.setVerticalScrollBarEnabled(false);
        dp0Var4.setOnScrollListener(new cp0(this, i27));
        dp0Var4.i(new lh.j(5));
        dp0Var4.setAdapter(this.I);
        dp0Var4.setGlowColor(getThemedColor(i25));
        this.t0 = new pk0(dp0Var4, true);
        p00 p00Var = new p00(context, this.resourcesProvider);
        p00Var.setViewType(12);
        qw0 qw0Var = new qw0(context, p00Var, 1, this.resourcesProvider);
        this.M = qw0Var;
        qw0Var.addView(p00Var, 0);
        qw0Var.setAnimateLayoutChange(true);
        qw0Var.e(false, false);
        boolean z14 = this.d0;
        gh.s sVar = qw0Var.d;
        if (z14) {
            sVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.ng));
        }
        sVar.setText(LocaleController.getString(R.string.NoResult));
        dp0Var4.setEmptyView(qw0Var);
        dp0Var4.setHideIfEmpty(false);
        dp0Var4.U1 = true;
        dp0Var4.V1 = 0;
        this.containerView.addView(qw0Var, i7.f6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.containerView.addView(dp0Var4, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        cg.h0 h0Var = new cg.h0(this, context, 18);
        this.n = h0Var;
        this.containerView.addView(h0Var, i7.f6.e(-1, 300, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp((!this.d0 || this.k0[1] == null) ? 58.0f : 111.0f);
        this.O[0] = new View(context);
        View view = this.O[0];
        int i28 = org.telegram.ui.ActionBar.g6.V5;
        view.setBackgroundColor(getThemedColor(i28));
        this.O[0].setAlpha(0.0f);
        this.O[0].setTag(1);
        this.containerView.addView(this.O[0], layoutParams);
        this.containerView.addView(frameLayout, i7.f6.e(-1, (!this.d0 || this.k0[1] == null) ? 58 : 111, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.O[1] = new View(context);
        this.O[1].setBackgroundColor(getThemedColor(i28));
        this.O[1].setLayoutParams(layoutParams2);
        if (!this.j0 && this.k0[0] == null) {
            this.O[1].setAlpha(0.0f);
            dp0Var = dp0Var3;
            dp0Var2 = dp0Var4;
            f9 = 22.0f;
        } else {
            f9 = 22.0f;
            if (this.d0) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.r = frameLayout3;
                frameLayout2.addView(frameLayout3, i7.f6.d(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, i7.f6.e(-1, -1, 119));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                i7.h6.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new uo0(this, 3));
                org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
                this.s = h5Var;
                h5Var.setTextSize(15);
                h5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Tk));
                h5Var.setEllipsizeByGradient(true);
                Z0();
                linearLayout3.addView(h5Var, i7.f6.p(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                textView.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                textView.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                int i29 = org.telegram.ui.ActionBar.g6.i6;
                textView.setBackground(org.telegram.ui.ActionBar.g6.Y(getThemedColor(i29), 4, 4));
                linearLayout3.addView(textView, i7.f6.p(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new uo0(this, 4));
                i7.h6.a(textView);
                dp0Var = dp0Var3;
                dp0Var2 = dp0Var4;
                this.containerView.addView(frameLayout2, i7.f6.e(-1, 58, 83));
                ArrayList arrayList3 = this.J;
                if (arrayList3 != null && arrayList3.size() > 0 && ((MessageObject) this.J.get(0)).messageOwner != null && ((MessageObject) this.J.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject3 = (MessageObject) this.J.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject3.getDialogId()))) && !messageObject3.isForwarded()) {
                        final int i30 = 0;
                        linearLayout = org.telegram.messenger.x3.g(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bp0
                            public final /* synthetic */ dq0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i30) {
                                    case 0:
                                        dq0 dq0Var = this.b;
                                        org.telegram.ui.ActionBar.o2 o2Var = dq0Var.b0;
                                        if (o2Var == null) {
                                            o2Var = LaunchActivity.U();
                                        }
                                        if (o2Var != null) {
                                            dq0Var.dismiss();
                                            o2Var.presentFragment(new org.telegram.ui.si0(messageObject3));
                                            break;
                                        }
                                        break;
                                    default:
                                        dq0 dq0Var2 = this.b;
                                        org.telegram.ui.ActionBar.o2 o2Var2 = dq0Var2.b0;
                                        if (o2Var2 == null) {
                                            o2Var2 = LaunchActivity.U();
                                        }
                                        if (o2Var2 != null) {
                                            dq0Var2.dismiss();
                                            o2Var2.presentFragment(new org.telegram.ui.si0(messageObject3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(getThemedColor(i29), 6, 6));
                        i7.h6.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i31 = org.telegram.ui.ActionBar.g6.Vk;
                        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i31), PorterDuff.Mode.SRC_IN));
                        linearLayout.addView(imageView, i7.f6.o(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        textView2.setTextColor(getThemedColor(i31));
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(LocaleController.formatNumber(messageObject3.messageOwner.forwards, ','));
                        linearLayout.addView(textView2, i7.f6.p(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i11 = 8;
                        linearLayout2.addView(linearLayout3, i7.f6.p(-1, 42, 1.0f, 23, 11, 0, i11, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, i7.f6.p(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                linearLayout = null;
                i11 = 11;
                linearLayout2.addView(linearLayout3, i7.f6.p(-1, 42, 1.0f, 23, 11, 0, i11, 0));
                if (linearLayout != null) {
                }
            } else {
                dp0Var = dp0Var3;
                dp0Var2 = dp0Var4;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.h = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.r = frameLayout5;
                frameLayout4.addView(frameLayout5, i7.f6.d(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i32 = org.telegram.ui.ActionBar.g6.i6;
                textView3.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i32), 2, AndroidUtilities.dp(22.0f)));
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
                textView3.setOnClickListener(new uo0(this, 5));
                frameLayout5.addView(textView3, i7.f6.e(-1, -1, 119));
                this.containerView.addView(frameLayout4, i7.f6.e(-1, 58, 87));
                ArrayList arrayList4 = this.J;
                if (arrayList4 != null && arrayList4.size() > 0 && ((MessageObject) this.J.get(0)).messageOwner != null && ((MessageObject) this.J.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject4 = (MessageObject) this.J.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject4.getDialogId()))) && !messageObject4.isForwarded()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.x = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        linearLayout4.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(this.d0 ? org.telegram.ui.ActionBar.g6.eg : i32), 2, AndroidUtilities.dp(22.0f)));
                        frameLayout5.addView(linearLayout4, i7.f6.d(-2, 48.0f, 85, 6.0f, 0.0f, -6.0f, 0.0f));
                        final int i33 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bp0
                            public final /* synthetic */ dq0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i33) {
                                    case 0:
                                        dq0 dq0Var = this.b;
                                        org.telegram.ui.ActionBar.o2 o2Var = dq0Var.b0;
                                        if (o2Var == null) {
                                            o2Var = LaunchActivity.U();
                                        }
                                        if (o2Var != null) {
                                            dq0Var.dismiss();
                                            o2Var.presentFragment(new org.telegram.ui.si0(messageObject4));
                                            break;
                                        }
                                        break;
                                    default:
                                        dq0 dq0Var2 = this.b;
                                        org.telegram.ui.ActionBar.o2 o2Var2 = dq0Var2.b0;
                                        if (o2Var2 == null) {
                                            o2Var2 = LaunchActivity.U();
                                        }
                                        if (o2Var2 != null) {
                                            dq0Var2.dismiss();
                                            o2Var2.presentFragment(new org.telegram.ui.si0(messageObject4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(this.d0 ? org.telegram.ui.ActionBar.g6.pg : org.telegram.ui.ActionBar.g6.n5), PorterDuff.Mode.MULTIPLY));
                        linearLayout4.addView(imageView2, i7.f6.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(messageObject4.messageOwner.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTextColor(getThemedColor(this.d0 ? org.telegram.ui.ActionBar.g6.pg : org.telegram.ui.ActionBar.g6.n5));
                        textView4.setGravity(16);
                        textView4.setTypeface(AndroidUtilities.bold());
                        linearLayout4.addView(textView4, i7.f6.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.v = frameLayout6;
        this.containerView.addView(frameLayout6, i7.f6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.r != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w = frameLayout7;
        this.containerView.addView(frameLayout7, i7.f6.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        fp0 fp0Var = new fp0(this, context, 0);
        this.c = fp0Var;
        fp0Var.setWillNotDraw(false);
        fp0Var.setAlpha(0.0f);
        fp0Var.setVisibility(4);
        this.containerView.addView(fp0Var, i7.f6.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        fp0Var.setOnTouchListener(new mh.d(22));
        AndroidUtilities.setLightNavigationBar(this.container, AndroidUtilities.computePerceivedBrightness(getThemedColor(i23)) > 0.721f);
        gp0 gp0Var = new gp0(this, context, np0Var, this.resourcesProvider);
        this.d = gp0Var;
        gp0Var.F = true;
        if (this.d0) {
            st editText = gp0Var.getEditText();
            int i34 = org.telegram.ui.ActionBar.g6.ng;
            editText.setTextColor(getThemedColor(i34));
            gp0Var.getEditText().setCursorColor(getThemedColor(i34));
        }
        gp0Var.setHint(LocaleController.getString(R.string.ShareComment));
        gp0Var.s();
        gp0Var.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
        fp0Var.addView(gp0Var, i7.f6.e(-1, -2, 51));
        fp0Var.setClipChildren(false);
        fp0Var.setClipToPadding(false);
        gp0Var.setClipChildren(false);
        gp0Var.getEditText().addTextChangedListener(new bh.c(this, 13));
        fp0 fp0Var2 = new fp0(this, context, 1);
        this.f = fp0Var2;
        fp0Var2.setFocusable(true);
        fp0Var2.setFocusableInTouchMode(true);
        fp0Var2.setVisibility(4);
        fp0Var2.setScaleX(0.2f);
        fp0Var2.setScaleY(0.2f);
        fp0Var2.setAlpha(0.0f);
        this.containerView.addView(fp0Var2, i7.f6.e(110, 50, 85));
        hp0 hp0Var = new hp0((NotificationCenter.NotificationCenterDelegate) this, context, R.drawable.send_plane_24, this.resourcesProvider, 0);
        this.e = hp0Var;
        int dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(38.0f);
        hp0Var.E = dp;
        hp0Var.F = dp2;
        float dp3 = AndroidUtilities.dp(1.0f);
        float dp4 = AndroidUtilities.dp(6.0f);
        hp0Var.I = dp3;
        hp0Var.J = dp4;
        hp0Var.d0 = true;
        fp0Var2.addView(hp0Var, i7.f6.g());
        hp0Var.setOnClickListener(new uo0(this, 6));
        hp0Var.setOnLongClickListener(new i10(this, 2));
        this.f0.setTextSize(AndroidUtilities.dp(12.0f));
        this.f0.setTypeface(AndroidUtilities.bold());
        if (num != null) {
            this.X = num.intValue();
            FrameLayout frameLayout8 = new FrameLayout(context);
            this.Y = frameLayout8;
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.Z = linearLayout5;
            linearLayout5.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout5.setClipToPadding(false);
            linearLayout5.setOrientation(0);
            linearLayout5.setBackground(org.telegram.ui.ActionBar.g6.Y(getThemedColor(org.telegram.ui.ActionBar.g6.i6), 6, 6));
            hp hpVar = new hp(context, 24, this.resourcesProvider);
            this.a0 = hpVar;
            hpVar.b(org.telegram.ui.ActionBar.g6.h7, org.telegram.ui.ActionBar.g6.j7, org.telegram.ui.ActionBar.g6.k7);
            hpVar.setDrawUnchecked(true);
            hpVar.a(false, false);
            hpVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(hpVar, i7.f6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            textView5.setTextColor(getThemedColor(i24));
            textView5.setTextSize(1, 14.0f);
            textView5.setText(LocaleController.formatString(R.string.VideoShareAddTimestamp, AndroidUtilities.formatShortDuration(num.intValue())));
            linearLayout5.addView(textView5, i7.f6.t(-2, -2, 16, 9, 0, 0, 0));
            i7.h6.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new uo0(this, 0));
            frameLayout8.addView(linearLayout5, i7.f6.e(-2, -2, 17));
            if (this.h == null) {
                View view2 = new View(context);
                view2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d7));
                frameLayout8.addView(view2, i7.f6.a(-1.0f, this.d0 ? 0.66f : 1.0f / AndroidUtilities.density, 55));
            }
            this.containerView.addView(frameLayout8, i7.f6.e(-1, 58, 83));
            if (this.h == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        lg.b bVar = new lg.b(this.P0.c(h0Var, null, false));
        this.S0 = bVar;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        bVar.b(AndroidUtilities.dp(72.0f), true);
        ng.d c3 = this.O0.c(this.z0, pg.a.e(this.resourcesProvider), false);
        this.R0 = c3;
        c3.k = true;
        c3.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        c3.t(AndroidUtilities.dp(32.0f));
        c3.h.g = 0.4f;
        c3.j();
        ng.d c6 = this.N0.c(fp0Var, pg.a.e(this.resourcesProvider), false);
        this.T0 = c6;
        c6.p(AndroidUtilities.dp(f9));
        c6.o(AndroidUtilities.dp(9.0f));
        fp0Var.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        FrameLayout frameLayout9 = this.r;
        if (frameLayout9 != null) {
            ng.d c10 = this.N0.c(frameLayout9, pg.a.e(this.resourcesProvider), false);
            c10.o(AndroidUtilities.dp(9.0f));
            c10.p(AndroidUtilities.dp(f9));
            this.r.setBackground(c10);
            this.r.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        FrameLayout frameLayout10 = this.Y;
        if (frameLayout10 != null) {
            ng.d c11 = this.N0.c(frameLayout10, pg.a.e(this.resourcesProvider), false);
            c11.o(AndroidUtilities.dp(9.0f));
            c11.p(AndroidUtilities.dp(f9));
            this.Y.setBackground(c11);
            this.Y.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        a1(0);
        org.telegram.ui.fy.i4(AccountInstance.getInstance(this.currentAccount));
        if (up0Var.d.isEmpty()) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        }
        int i35 = this.currentAccount;
        int i36 = 0;
        MessagesStorage.getInstance(i35).getStorageQueue().postRunnable(new j3.y(i35, i36, new ip0(this), 14));
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        AndroidUtilities.updateViewVisibilityAnimated(dp0Var, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(dp0Var2, false, 1.0f, false);
        org.telegram.ui.ActionBar.d3 container = getContainer();
        vo0 vo0Var = new vo0(this, i36);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(container, vo0Var);
    }

    public void S0(View view) {
    }

    public void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
