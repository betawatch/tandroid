package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class FragmentContextView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener {
    public static final float[] J0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public float A0;
    public ImageView B;
    public boolean B0;
    public org.telegram.ui.ActionBar.w0 C;
    public boolean C0;
    public ef.f D;
    public final Paint D0;
    public org.telegram.ui.ActionBar.c1 E;
    public boolean E0;
    public final org.telegram.ui.ActionBar.u0[] F;
    public int F0;
    public FrameLayout G;
    public float G0;
    public ImageView H;
    public final xd.j H0;
    public org.telegram.ui.pk I;
    public int I0;
    public int J;
    public org.telegram.ui.Components.voip.h K;
    public boolean L;
    public int M;
    public MessageObject N;
    public float O;
    public boolean P;
    public int Q;
    public String R;
    public boolean S;
    public boolean T;
    public d9 U;
    public Paint V;
    public LinearGradient W;
    public final zc a;
    public Matrix a0;
    public ImageView b;
    public int b0;
    public og0 c;
    public TextPaint c0;
    public s10 d;
    public boolean d0;
    public s10 e;
    public boolean e0;
    public AnimatorSet f;
    public final j6 f0;
    public rc g0;
    public final org.telegram.ui.ActionBar.p2 h;
    public boolean h0;
    public final q10 i0;
    public final int j0;
    public final boolean k0;
    public w10 l0;
    public final org.telegram.ui.ActionBar.g6 m0;
    public final rg n;
    public boolean n0;
    public int o0;
    public final m2.b p0;
    public final AnimationNotificationsLocker q0;
    public r10 r;
    public final AnimationNotificationsLocker r0;
    public eh.d s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public View v;
    public boolean v0;
    public lj0 w;
    public boolean w0;
    public u10 x;
    public org.telegram.ui.ej x0;
    public ij0 y;
    public long y0;
    public float z0;

    public FragmentContextView(Context context, org.telegram.ui.py pyVar, boolean z4) {
        this(context, pyVar, null, z4, null);
    }

    private int getTitleTextColor() {
        int i10 = this.Q;
        org.telegram.ui.ActionBar.g6 g6Var = this.m0;
        return i10 == 4 ? org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.t7, g6Var) : (i10 == 1 || i10 == 3) ? org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A7, g6Var) : org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.u7, g6Var);
    }

    public static boolean i(float f10, float f11) {
        return Math.abs(f10 - f11) < 0.05f;
    }

    public static boolean j() {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        return playingMessageObject != null && playingMessageObject.isVoice();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z4) {
        boolean z10;
        ChatObject.Call groupCall;
        boolean z11;
        ChatObject.Call call;
        int i10;
        int i11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (this.P && this.Q == 5 && (sharedInstance == null || sharedInstance.isHangingUp())) {
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.h;
        View fragmentView = p2Var.getFragmentView();
        boolean z12 = (z4 || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z4 : true;
        boolean c3 = c30.c();
        rg rgVar = this.n;
        if (c3) {
            z10 = false;
        } else {
            z10 = (org.telegram.ui.d60.B3 || !this.T || sharedInstance == null || sharedInstance.isHangingUp()) ? false : true;
            if (sharedInstance != null && (call = sharedInstance.groupCall) != null && (call.call instanceof TLRPC.TL_groupCallDiscarded)) {
                z10 = false;
            }
            if (!j() && !org.telegram.ui.d60.B3 && this.T && !z10 && rgVar != null && (groupCall = rgVar.getGroupCall()) != null && groupCall.shouldShowPanel()) {
                z10 = true;
                z11 = true;
                AnimationNotificationsLocker animationNotificationsLocker = this.q0;
                if (z10) {
                    boolean z13 = this.P;
                    if (z13 && ((z12 && this.Q == -1) || (i11 = this.Q) == 4 || i11 == 3 || i11 == 1)) {
                        this.P = false;
                        if (z12) {
                            if (getVisibility() != 8) {
                                setVisibility(8);
                            }
                            setTopPadding(0.0f);
                        } else {
                            AnimatorSet animatorSet = this.f;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                this.f = null;
                            }
                            animationNotificationsLocker.lock();
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.f = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                            this.f.setDuration(220L);
                            this.f.setInterpolator(pr.f);
                            this.f.addListener(new p10(this, 9));
                            this.f.start();
                        }
                    } else if (z13 && ((i10 = this.Q) == -1 || i10 == 4 || i10 == 3 || i10 == 1)) {
                        this.P = false;
                        setVisibility(8);
                    }
                    if (!z12 || rgVar == null || !rgVar.F() || c30.c()) {
                        return;
                    }
                    l.d.v(R.string.InviteExpired, qc.a0(p2Var), R.raw.linkbroken, 36);
                    return;
                }
                b();
                int i12 = z11 ? 4 : sharedInstance.groupCall != null ? 3 : 1;
                int i13 = this.Q;
                if (i12 != i13 && this.f != null && !z12) {
                    this.s0 = true;
                    return;
                }
                if (i12 != i13 && this.P && !z12) {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    animationNotificationsLocker.lock();
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(pr.f);
                    this.f.addListener(new p10(this, 10));
                    this.f.start();
                    return;
                }
                if (z11) {
                    boolean z14 = i13 == 4 && this.P;
                    r(4);
                    ChatObject.Call groupCall2 = rgVar.getGroupCall();
                    TLRPC.Chat g10 = rgVar.g();
                    if (groupCall2.isScheduled()) {
                        if (this.V == null) {
                            TextPaint textPaint = new TextPaint(1);
                            this.c0 = textPaint;
                            textPaint.setColor(-1);
                            this.c0.setTextSize(AndroidUtilities.dp(14.0f));
                            this.c0.setTypeface(AndroidUtilities.bold());
                            Paint paint = new Paint(1);
                            this.V = paint;
                            paint.setColor(-1);
                            this.a0 = new Matrix();
                        }
                        this.d0 = true;
                        LocaleController.getString(R.string.VoipChatNotify);
                        TLRPC.GroupCall groupCall3 = groupCall2.call;
                        this.e0 = groupCall3 != null && groupCall3.schedule_start_subscribed;
                        this.I.setVisibility(8);
                        if (!TextUtils.isEmpty(groupCall2.call.title)) {
                            this.d.b(groupCall2.call.title, false);
                        } else if (ChatObject.isChannelOrGiga(g10)) {
                            this.d.b(LocaleController.getString(R.string.VoipChannelScheduledVoiceChat), false);
                        } else {
                            this.d.b(LocaleController.getString(R.string.VoipGroupScheduledVoiceChat), false);
                        }
                        this.e.b(LocaleController.formatStartsTime(groupCall2.call.schedule_date, 4), false);
                        if (!this.h0) {
                            this.h0 = true;
                            this.i0.run();
                        }
                    } else {
                        this.d0 = false;
                        this.I.setVisibility(0);
                        this.I.setText(LocaleController.getString(R.string.VoipChatJoin));
                        if (!TextUtils.isEmpty(groupCall2.call.title)) {
                            this.d.b(groupCall2.call.title, false);
                        } else if (groupCall2.call.rtmp_stream) {
                            this.d.b(LocaleController.getString(R.string.VoipChannelVoiceChat), false);
                        } else if (ChatObject.isChannelOrGiga(g10)) {
                            this.d.b(LocaleController.getString(R.string.VoipChannelVoiceChat), false);
                        } else {
                            this.d.b(LocaleController.getString(R.string.VoipGroupVoiceChat), false);
                        }
                        TLRPC.GroupCall groupCall4 = groupCall2.call;
                        int i14 = groupCall4.participants_count;
                        if (i14 == 0) {
                            this.e.b(LocaleController.getString(groupCall4.rtmp_stream ? R.string.ViewersWatchingNobody : R.string.MembersTalkingNobody), false);
                        } else {
                            this.e.b(LocaleController.formatPluralString(groupCall4.rtmp_stream ? "ViewersWatching" : "Participants", i14, new Object[0]), false);
                        }
                        this.r.invalidate();
                    }
                    n(this.U.a.d && z14);
                } else if (sharedInstance == null || sharedInstance.groupCall == null) {
                    n(i13 == 1);
                    r(1);
                } else {
                    n(i13 == 3);
                    r(3);
                }
                if (this.P) {
                    return;
                }
                if (z12) {
                    setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                    m();
                } else {
                    AnimatorSet animatorSet5 = this.f;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.r0.lock();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(pr.f);
                    this.f.addListener(new p10(this, 11));
                    this.f.start();
                }
                this.P = true;
                setVisibility(0);
                return;
            }
        }
        z11 = false;
        AnimationNotificationsLocker animationNotificationsLocker2 = this.q0;
        if (z10) {
        }
    }

    public final void b() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        r10 r10Var = new r10(this, context);
        this.r = r10Var;
        this.g0 = new rc(r10Var);
        int i10 = AndroidUtilities.displaySize.x;
        j6 j6Var = this.f0;
        j6Var.G = i10;
        j6Var.v = 0.4f;
        j6Var.setCallback(r10Var);
        j6Var.r(-1);
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.u(AndroidUtilities.bold());
        addView(this.r, k7.c6.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.v = view;
        this.r.addView(view, k7.c6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.b;
        int i11 = org.telegram.ui.ActionBar.k6.w7;
        org.telegram.ui.ActionBar.g6 g6Var = this.m0;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView imageView3 = this.b;
        og0 og0Var = new og0(16);
        this.c = og0Var;
        imageView3.setImageDrawable(og0Var);
        this.b.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i11, g6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.b, k7.c6.e(36, 36, 51));
        final int i12 = 2;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l10
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i13;
                long j10;
                TL_stories.StoryItem u10;
                int i14 = i12;
                FragmentContextView fragmentContextView = this.b;
                switch (i14) {
                    case 0:
                        rg rgVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.g6 g6Var2 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
                        if (fragmentContextView.Q == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, g6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                            d2Var.O = string;
                            if (p2Var instanceof org.telegram.ui.py) {
                                d2Var.Q = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = rgVar.g();
                                TLRPC.User i15 = rgVar.i();
                                if (g10 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    d2Var.Q = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.q7, g6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        rg rgVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.g6 g6Var3 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.Q;
                        int i17 = 6;
                        if (i16 == 6) {
                            oh.e1 e1Var = oh.e1.T;
                            if (e1Var != null) {
                                long j11 = e1Var.b;
                                int i18 = e1Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.D1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(e1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i18).B(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (p2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new c8(findActivity, g6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.D1)) {
                                        new c8(LaunchActivity.D1, g6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (rgVar2 != null ? rgVar2.a() : 0L)) {
                                    fragmentContextView.n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long dialogId = playingMessageObject.getDialogId();
                                    Bundle bundle = new Bundle();
                                    if (DialogObject.isEncryptedDialog(dialogId)) {
                                        bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                                    } else if (DialogObject.isUserDialog(dialogId)) {
                                        bundle.putLong("user_id", dialogId);
                                    } else {
                                        bundle.putLong("chat_id", -dialogId);
                                    }
                                    bundle.putInt("message_id", playingMessageObject.getId());
                                    p2Var2.presentFragment(new org.telegram.ui.xn(bundle), p2Var2 instanceof org.telegram.ui.xn);
                                    break;
                                }
                            }
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i16 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (rgVar2 != null) {
                                j10 = rgVar2.a();
                                i13 = p2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i20 = 0; i20 < 4; i20++) {
                                        if (!LocationController.getInstance(i20).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i20).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i13 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j12;
                                        }
                                    }
                                }
                                i13 = i19;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i13).getSharingLocationInfo(j10));
                                break;
                            } else {
                                p2Var2.showDialog(new dv0(fragmentContextView.getContext(), new k10(fragmentContextView), g6Var3));
                                break;
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (p2Var2.getParentActivity() != null && (groupCall = rgVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = p2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.g2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), p2Var2.getParentActivity(), p2Var2, p2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i16 == 5) {
                                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var2;
                                if (p2Var2.getSendMessagesHelper().getImportingHistory(xnVar.a()) != null) {
                                    a50 a50Var = new a50(fragmentContextView.getContext(), null, xnVar, g6Var3);
                                    a50Var.setOnHideListener(new b1(fragmentContextView, i17));
                                    p2Var2.showDialog(a50Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.d60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.Q == 0) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.J0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.J0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat2 = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat2)) {
                                }
                            }
                            boolean z4 = !sharedInstance.isMicMute();
                            fragmentContextView.L = z4;
                            sharedInstance.setMicMute(z4, false, true);
                            if (fragmentContextView.y.N(fragmentContextView.L ? 15 : 29)) {
                                if (fragmentContextView.L) {
                                    fragmentContextView.y.K(0);
                                } else {
                                    fragmentContextView.y.K(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.k6.D0().c(true);
                            fragmentContextView.a.f(true);
                            try {
                                fragmentContextView.x.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        lj0 lj0Var = new lj0(context);
        this.w = lj0Var;
        lj0Var.setScaleType(scaleType);
        this.w.setAutoRepeat(true);
        this.w.f(R.raw.import_progress, 30, 30, null);
        this.w.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.k6.v0(i11, g6Var)));
        addView(this.w, k7.c6.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        s10 s10Var = new s10(this, context, context, 0);
        this.d = s10Var;
        addView(s10Var, k7.c6.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        s10 s10Var2 = new s10(this, context, context, 1);
        this.e = s10Var2;
        addView(s10Var2, k7.c6.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.K = hVar;
        hVar.g = 1.0f;
        hVar.j = false;
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, context, 1);
        this.I = pkVar;
        pkVar.setText(LocaleController.getString(R.string.VoipChatJoin));
        this.I.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sh, g6Var));
        org.telegram.ui.pk pkVar2 = this.I;
        int dp = AndroidUtilities.dp(16.0f);
        int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
        int v04 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Qh, g6Var);
        pkVar2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, v03, v04, v04));
        this.I.setTextSize(1, 14.0f);
        this.I.setTypeface(AndroidUtilities.bold());
        this.I.setGravity(17);
        this.I.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.I, k7.c6.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        final int i13 = 3;
        this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l10
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i132;
                long j10;
                TL_stories.StoryItem u10;
                int i14 = i13;
                FragmentContextView fragmentContextView = this.b;
                switch (i14) {
                    case 0:
                        rg rgVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.g6 g6Var2 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
                        if (fragmentContextView.Q == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, g6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                            d2Var.O = string;
                            if (p2Var instanceof org.telegram.ui.py) {
                                d2Var.Q = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = rgVar.g();
                                TLRPC.User i15 = rgVar.i();
                                if (g10 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    d2Var.Q = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.q7, g6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        rg rgVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.g6 g6Var3 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.Q;
                        int i17 = 6;
                        if (i16 == 6) {
                            oh.e1 e1Var = oh.e1.T;
                            if (e1Var != null) {
                                long j11 = e1Var.b;
                                int i18 = e1Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.D1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(e1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i18).B(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (p2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new c8(findActivity, g6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.D1)) {
                                        new c8(LaunchActivity.D1, g6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (rgVar2 != null ? rgVar2.a() : 0L)) {
                                    fragmentContextView.n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long dialogId = playingMessageObject.getDialogId();
                                    Bundle bundle = new Bundle();
                                    if (DialogObject.isEncryptedDialog(dialogId)) {
                                        bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                                    } else if (DialogObject.isUserDialog(dialogId)) {
                                        bundle.putLong("user_id", dialogId);
                                    } else {
                                        bundle.putLong("chat_id", -dialogId);
                                    }
                                    bundle.putInt("message_id", playingMessageObject.getId());
                                    p2Var2.presentFragment(new org.telegram.ui.xn(bundle), p2Var2 instanceof org.telegram.ui.xn);
                                    break;
                                }
                            }
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i16 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (rgVar2 != null) {
                                j10 = rgVar2.a();
                                i132 = p2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i20 = 0; i20 < 4; i20++) {
                                        if (!LocationController.getInstance(i20).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i20).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i132 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j12;
                                        }
                                    }
                                }
                                i132 = i19;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i132).getSharingLocationInfo(j10));
                                break;
                            } else {
                                p2Var2.showDialog(new dv0(fragmentContextView.getContext(), new k10(fragmentContextView), g6Var3));
                                break;
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (p2Var2.getParentActivity() != null && (groupCall = rgVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = p2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.g2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), p2Var2.getParentActivity(), p2Var2, p2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i16 == 5) {
                                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var2;
                                if (p2Var2.getSendMessagesHelper().getImportingHistory(xnVar.a()) != null) {
                                    a50 a50Var = new a50(fragmentContextView.getContext(), null, xnVar, g6Var3);
                                    a50Var.setOnHideListener(new b1(fragmentContextView, i17));
                                    p2Var2.showDialog(a50Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.d60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.Q == 0) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.J0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.J0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat2 = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat2)) {
                                }
                            }
                            boolean z4 = !sharedInstance.isMicMute();
                            fragmentContextView.L = z4;
                            sharedInstance.setMicMute(z4, false, true);
                            if (fragmentContextView.y.N(fragmentContextView.L ? 15 : 29)) {
                                if (fragmentContextView.L) {
                                    fragmentContextView.y.K(0);
                                } else {
                                    fragmentContextView.y.K(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.k6.D0().c(true);
                            fragmentContextView.a.f(true);
                            try {
                                fragmentContextView.x.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        if (this.B0) {
            m();
        }
        this.G = new FrameLayout(context);
        ImageView imageView4 = new ImageView(context);
        this.H = imageView4;
        imageView4.setImageResource(R.drawable.msg_mute);
        ImageView imageView5 = this.H;
        int i14 = org.telegram.ui.ActionBar.k6.x7;
        imageView5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i14, g6Var), mode));
        this.G.addView(this.H, k7.c6.e(20, 20, 17));
        this.G.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i14, g6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.G.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.G.setOnClickListener(new eg.m(13));
        this.G.setVisibility(8);
        addView(this.G, k7.c6.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.k0) {
            h();
        }
        d9 d9Var = new d9(context, false);
        this.U = d9Var;
        d9Var.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.U.setDelegate(new o10(this, 1));
        this.U.setVisibility(8);
        addView(this.U, k7.c6.e(108, 36, 51));
        this.y = new ij0(R.raw.voice_muted, "" + R.raw.voice_muted, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        u10 u10Var = new u10(this, context);
        this.x = u10Var;
        u10Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A7, g6Var), PorterDuff.Mode.SRC_IN));
        this.x.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i14, g6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.x.setAnimation(this.y);
        this.x.setScaleType(scaleType);
        this.x.setVisibility(8);
        addView(this.x, k7.c6.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        final int i15 = 4;
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l10
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i132;
                long j10;
                TL_stories.StoryItem u10;
                int i142 = i15;
                FragmentContextView fragmentContextView = this.b;
                switch (i142) {
                    case 0:
                        rg rgVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.g6 g6Var2 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
                        if (fragmentContextView.Q == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, g6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                            d2Var.O = string;
                            if (p2Var instanceof org.telegram.ui.py) {
                                d2Var.Q = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = rgVar.g();
                                TLRPC.User i152 = rgVar.i();
                                if (g10 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i152 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i152)));
                                } else {
                                    d2Var.Q = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.q7, g6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        rg rgVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.g6 g6Var3 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.Q;
                        int i17 = 6;
                        if (i16 == 6) {
                            oh.e1 e1Var = oh.e1.T;
                            if (e1Var != null) {
                                long j11 = e1Var.b;
                                int i18 = e1Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.D1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(e1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i18).B(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (p2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new c8(findActivity, g6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.D1)) {
                                        new c8(LaunchActivity.D1, g6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (rgVar2 != null ? rgVar2.a() : 0L)) {
                                    fragmentContextView.n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long dialogId = playingMessageObject.getDialogId();
                                    Bundle bundle = new Bundle();
                                    if (DialogObject.isEncryptedDialog(dialogId)) {
                                        bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                                    } else if (DialogObject.isUserDialog(dialogId)) {
                                        bundle.putLong("user_id", dialogId);
                                    } else {
                                        bundle.putLong("chat_id", -dialogId);
                                    }
                                    bundle.putInt("message_id", playingMessageObject.getId());
                                    p2Var2.presentFragment(new org.telegram.ui.xn(bundle), p2Var2 instanceof org.telegram.ui.xn);
                                    break;
                                }
                            }
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i16 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (rgVar2 != null) {
                                j10 = rgVar2.a();
                                i132 = p2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i20 = 0; i20 < 4; i20++) {
                                        if (!LocationController.getInstance(i20).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i20).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i132 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j12;
                                        }
                                    }
                                }
                                i132 = i19;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i132).getSharingLocationInfo(j10));
                                break;
                            } else {
                                p2Var2.showDialog(new dv0(fragmentContextView.getContext(), new k10(fragmentContextView), g6Var3));
                                break;
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (p2Var2.getParentActivity() != null && (groupCall = rgVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = p2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.g2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), p2Var2.getParentActivity(), p2Var2, p2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i16 == 5) {
                                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var2;
                                if (p2Var2.getSendMessagesHelper().getImportingHistory(xnVar.a()) != null) {
                                    a50 a50Var = new a50(fragmentContextView.getContext(), null, xnVar, g6Var3);
                                    a50Var.setOnHideListener(new b1(fragmentContextView, i17));
                                    p2Var2.showDialog(a50Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.d60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.Q == 0) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.J0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.J0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat2 = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat2)) {
                                }
                            }
                            boolean z4 = !sharedInstance.isMicMute();
                            fragmentContextView.L = z4;
                            sharedInstance.setMicMute(z4, false, true);
                            if (fragmentContextView.y.N(fragmentContextView.L ? 15 : 29)) {
                                if (fragmentContextView.L) {
                                    fragmentContextView.y.K(0);
                                } else {
                                    fragmentContextView.y.K(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.k6.D0().c(true);
                            fragmentContextView.a.f(true);
                            try {
                                fragmentContextView.x.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.B = imageView6;
        imageView6.setImageResource(R.drawable.miniplayer_close);
        this.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i14, g6Var), mode));
        this.B.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i14, g6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.B.setScaleType(scaleType);
        addView(this.B, k7.c6.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i16 = 0;
        this.B.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l10
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i132;
                long j10;
                TL_stories.StoryItem u10;
                int i142 = i16;
                FragmentContextView fragmentContextView = this.b;
                switch (i142) {
                    case 0:
                        rg rgVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.g6 g6Var2 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
                        if (fragmentContextView.Q == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, g6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                            d2Var.O = string;
                            if (p2Var instanceof org.telegram.ui.py) {
                                d2Var.Q = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = rgVar.g();
                                TLRPC.User i152 = rgVar.i();
                                if (g10 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i152 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i152)));
                                } else {
                                    d2Var.Q = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.q7, g6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        rg rgVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.g6 g6Var3 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.Q;
                        int i17 = 6;
                        if (i162 == 6) {
                            oh.e1 e1Var = oh.e1.T;
                            if (e1Var != null) {
                                long j11 = e1Var.b;
                                int i18 = e1Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.D1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(e1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i18).B(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (p2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new c8(findActivity, g6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.D1)) {
                                        new c8(LaunchActivity.D1, g6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (rgVar2 != null ? rgVar2.a() : 0L)) {
                                    fragmentContextView.n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long dialogId = playingMessageObject.getDialogId();
                                    Bundle bundle = new Bundle();
                                    if (DialogObject.isEncryptedDialog(dialogId)) {
                                        bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                                    } else if (DialogObject.isUserDialog(dialogId)) {
                                        bundle.putLong("user_id", dialogId);
                                    } else {
                                        bundle.putLong("chat_id", -dialogId);
                                    }
                                    bundle.putInt("message_id", playingMessageObject.getId());
                                    p2Var2.presentFragment(new org.telegram.ui.xn(bundle), p2Var2 instanceof org.telegram.ui.xn);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (rgVar2 != null) {
                                j10 = rgVar2.a();
                                i132 = p2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i20 = 0; i20 < 4; i20++) {
                                        if (!LocationController.getInstance(i20).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i20).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i132 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j12;
                                        }
                                    }
                                }
                                i132 = i19;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i132).getSharingLocationInfo(j10));
                                break;
                            } else {
                                p2Var2.showDialog(new dv0(fragmentContextView.getContext(), new k10(fragmentContextView), g6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (p2Var2.getParentActivity() != null && (groupCall = rgVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = p2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.g2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), p2Var2.getParentActivity(), p2Var2, p2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var2;
                                if (p2Var2.getSendMessagesHelper().getImportingHistory(xnVar.a()) != null) {
                                    a50 a50Var = new a50(fragmentContextView.getContext(), null, xnVar, g6Var3);
                                    a50Var.setOnHideListener(new b1(fragmentContextView, i17));
                                    p2Var2.showDialog(a50Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.d60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.Q == 0) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.J0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.J0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat2 = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat2)) {
                                }
                            }
                            boolean z4 = !sharedInstance.isMicMute();
                            fragmentContextView.L = z4;
                            sharedInstance.setMicMute(z4, false, true);
                            if (fragmentContextView.y.N(fragmentContextView.L ? 15 : 29)) {
                                if (fragmentContextView.L) {
                                    fragmentContextView.y.K(0);
                                } else {
                                    fragmentContextView.y.K(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.k6.D0().c(true);
                            fragmentContextView.a.f(true);
                            try {
                                fragmentContextView.x.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        eh.d dVar = new eh.d(getContext(), 15);
        this.s = dVar;
        addView(dVar, k7.c6.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        final int i17 = 1;
        setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.l10
            public final /* synthetic */ FragmentContextView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i132;
                long j10;
                TL_stories.StoryItem u10;
                int i142 = i17;
                FragmentContextView fragmentContextView = this.b;
                switch (i142) {
                    case 0:
                        rg rgVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.g6 g6Var2 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
                        if (fragmentContextView.Q == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, g6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                            d2Var.O = string;
                            if (p2Var instanceof org.telegram.ui.py) {
                                d2Var.Q = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = rgVar.g();
                                TLRPC.User i152 = rgVar.i();
                                if (g10 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i152 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i152)));
                                } else {
                                    d2Var.Q = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.q7, g6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        rg rgVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.g6 g6Var3 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.Q;
                        int i172 = 6;
                        if (i162 == 6) {
                            oh.e1 e1Var = oh.e1.T;
                            if (e1Var != null) {
                                long j11 = e1Var.b;
                                int i18 = e1Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.D1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(e1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i18).B(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (p2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new c8(findActivity, g6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.D1)) {
                                        new c8(LaunchActivity.D1, g6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (rgVar2 != null ? rgVar2.a() : 0L)) {
                                    fragmentContextView.n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
                                    break;
                                } else {
                                    long dialogId = playingMessageObject.getDialogId();
                                    Bundle bundle = new Bundle();
                                    if (DialogObject.isEncryptedDialog(dialogId)) {
                                        bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                                    } else if (DialogObject.isUserDialog(dialogId)) {
                                        bundle.putLong("user_id", dialogId);
                                    } else {
                                        bundle.putLong("chat_id", -dialogId);
                                    }
                                    bundle.putInt("message_id", playingMessageObject.getId());
                                    p2Var2.presentFragment(new org.telegram.ui.xn(bundle), p2Var2 instanceof org.telegram.ui.xn);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (rgVar2 != null) {
                                j10 = rgVar2.a();
                                i132 = p2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i20 = 0; i20 < 4; i20++) {
                                        if (!LocationController.getInstance(i20).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i20).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i132 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j12;
                                        }
                                    }
                                }
                                i132 = i19;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i132).getSharingLocationInfo(j10));
                                break;
                            } else {
                                p2Var2.showDialog(new dv0(fragmentContextView.getContext(), new k10(fragmentContextView), g6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (p2Var2.getParentActivity() != null && (groupCall = rgVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = p2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.g2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), p2Var2.getParentActivity(), p2Var2, p2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var2;
                                if (p2Var2.getSendMessagesHelper().getImportingHistory(xnVar.a()) != null) {
                                    a50 a50Var = new a50(fragmentContextView.getContext(), null, xnVar, g6Var3);
                                    a50Var.setOnHideListener(new b1(fragmentContextView, i172));
                                    p2Var2.showDialog(a50Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.d60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.Q == 0) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                                break;
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.J0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.J0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat2 = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat2)) {
                                }
                            }
                            boolean z4 = !sharedInstance.isMicMute();
                            fragmentContextView.L = z4;
                            sharedInstance.setMicMute(z4, false, true);
                            if (fragmentContextView.y.N(fragmentContextView.L ? 15 : 29)) {
                                if (fragmentContextView.L) {
                                    fragmentContextView.y.K(0);
                                } else {
                                    fragmentContextView.y.K(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.k6.D0().c(true);
                            fragmentContextView.a.f(true);
                            try {
                                fragmentContextView.x.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        setLeftMargin(this.G0);
    }

    public final void c(boolean z4) {
        int i10;
        rg rgVar = this.n;
        if (rgVar != null) {
            if (this.P && ((i10 = this.Q) == 1 || i10 == 3)) {
                return;
            }
            b();
            org.telegram.ui.ActionBar.p2 p2Var = this.h;
            SendMessagesHelper.ImportingHistory importingHistory = p2Var.getSendMessagesHelper().getImportingHistory(rgVar.a());
            View fragmentView = p2Var.getFragmentView();
            if (!z4 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                z4 = true;
            }
            Dialog visibleDialog = p2Var.getVisibleDialog();
            if ((j() || rgVar.n() || ((visibleDialog instanceof a50) && !((a50) visibleDialog).isDismissed())) && importingHistory != null) {
                importingHistory = null;
            }
            AnimationNotificationsLocker animationNotificationsLocker = this.q0;
            if (importingHistory == null) {
                if (!this.P || ((!z4 || this.Q != -1) && this.Q != 5)) {
                    int i11 = this.Q;
                    if (i11 == -1 || i11 == 5) {
                        this.P = false;
                        setVisibility(8);
                        return;
                    }
                    return;
                }
                this.P = false;
                if (z4) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(220L);
                this.f.setInterpolator(pr.f);
                this.f.addListener(new p10(this, 4));
                this.f.start();
                return;
            }
            if (this.Q != 5 && this.f != null && !z4) {
                this.v0 = true;
                return;
            }
            r(5);
            if (z4 && this.O == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                w10 w10Var = this.l0;
                if (w10Var != null) {
                    ((wq0) w10Var).a(true);
                    ((wq0) this.l0).a(false);
                }
            }
            if (!this.P) {
                if (!z4) {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    animationNotificationsLocker.lock();
                    this.f = new AnimatorSet();
                    w10 w10Var2 = this.l0;
                    if (w10Var2 != null) {
                        ((wq0) w10Var2).a(true);
                    }
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f.setDuration(200L);
                    this.f.addListener(new p10(this, 5));
                    this.f.start();
                }
                this.P = true;
                setVisibility(0);
            }
            int i12 = this.M;
            int i13 = importingHistory.uploadProgress;
            if (i12 != i13) {
                this.M = i13;
                this.d.b(AndroidUtilities.replaceTags(LocaleController.formatString("ImportUploading", R.string.ImportUploading, Integer.valueOf(i13))), false);
            }
        }
    }

    public final void d(boolean z4) {
        String formatPluralString;
        String string;
        org.telegram.ui.ActionBar.p2 p2Var = this.h;
        View fragmentView = p2Var.getFragmentView();
        if (!z4 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z4 = true;
        }
        boolean z10 = p2Var instanceof org.telegram.ui.py;
        boolean isSharingLocation = z10 ? LocationController.getLocationsCount() != 0 : LocationController.getInstance(p2Var.getCurrentAccount()).isSharingLocation(this.n.a());
        m2.b bVar = this.p0;
        if (!isSharingLocation) {
            this.o0 = -1;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            if (this.P) {
                this.P = false;
                if (z4) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(200L);
                this.f.addListener(new p10(this, 0));
                this.f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.b.setImageDrawable(new nq0(getContext(), 1));
        if (z4 && this.O == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.P) {
            if (!z4) {
                AnimatorSet animatorSet3 = this.f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new p10(this, 1));
                this.f.start();
            }
            this.P = true;
            setVisibility(0);
        }
        if (!z10) {
            bVar.run();
            f();
            return;
        }
        String string2 = LocaleController.getString(R.string.LiveLocationContext);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 4; i10++) {
            arrayList.addAll(LocationController.getInstance(i10).sharingLocationsUI);
        }
        if (arrayList.size() == 1) {
            LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) arrayList.get(0);
            long dialogId = sharingLocationInfo.messageObject.getDialogId();
            if (DialogObject.isUserDialog(dialogId)) {
                formatPluralString = UserObject.getFirstName(MessagesController.getInstance(sharingLocationInfo.messageObject.currentAccount).getUser(Long.valueOf(dialogId)));
                string = LocaleController.getString(R.string.AttachLiveLocationIsSharing);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(sharingLocationInfo.messageObject.currentAccount).getChat(Long.valueOf(-dialogId));
                formatPluralString = chat != null ? chat.title : "";
                string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChat);
            }
        } else {
            formatPluralString = LocaleController.formatPluralString("Chats", arrayList.size(), new Object[0]);
            string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChats);
        }
        String format = String.format(string, string2, formatPluralString);
        int indexOf = format.indexOf(string2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i11 = 0;
        while (i11 < 2) {
            s10 s10Var = this.d;
            TextView textView = i11 == 0 ? s10Var.getTextView() : s10Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i11++;
        }
        spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.t7, this.m0)), indexOf, string2.length() + indexOf, 18);
        this.d.b(spannableStringBuilder, false);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (i10 == NotificationCenter.liveLocationsChanged) {
            d(false);
            return;
        }
        if (i10 == NotificationCenter.liveStoryUpdated) {
            e(false);
            return;
        }
        int i12 = NotificationCenter.liveLocationsCacheChanged;
        rg rgVar = this.n;
        if (i10 == i12) {
            if (rgVar != null) {
                if (rgVar.a() == ((Long) objArr[0]).longValue()) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart || i10 == NotificationCenter.messagePlayingPlayStateChanged || i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.didEndCall) {
            int i13 = this.Q;
            if (i13 == 1 || i13 == 3 || i13 == 4) {
                a(false);
            }
            g(false);
            return;
        }
        int i14 = NotificationCenter.didStartedCall;
        if (i10 == i14 || i10 == NotificationCenter.groupCallUpdated || i10 == NotificationCenter.groupCallVisibilityChanged) {
            a(false);
            if (this.Q != 3 || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null) {
                return;
            }
            if (i10 == i14) {
                sharedInstance.registerStateListener(this);
            }
            int callState = sharedInstance.getCallState();
            if (callState == 1 || callState == 2 || callState == 6 || callState == 5 || this.x == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId())) == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                return;
            }
            sharedInstance.setMicMute(true, false, false);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.x.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            return;
        }
        if (i10 == NotificationCenter.groupCallTypingsUpdated) {
            b();
            if (this.P && this.Q == 4) {
                ChatObject.Call groupCall = rgVar.getGroupCall();
                if (groupCall != null && this.e != null) {
                    if (groupCall.isScheduled()) {
                        this.e.b(LocaleController.formatStartsTime(groupCall.call.schedule_date, 4), false);
                    } else {
                        TLRPC.GroupCall groupCall2 = groupCall.call;
                        int i15 = groupCall2.participants_count;
                        if (i15 == 0) {
                            this.e.b(LocaleController.getString(groupCall2.rtmp_stream ? R.string.ViewersWatchingNobody : R.string.MembersTalkingNobody), false);
                        } else {
                            this.e.b(LocaleController.formatPluralString(groupCall2.rtmp_stream ? "ViewersWatching" : "Participants", i15, new Object[0]), false);
                        }
                    }
                }
                n(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.historyImportProgressChanged) {
            int i16 = this.Q;
            if (i16 == 1 || i16 == 3 || i16 == 4) {
                a(false);
            }
            c(false);
            return;
        }
        if (i10 == NotificationCenter.messagePlayingSpeedChanged) {
            q(true);
            return;
        }
        int i17 = NotificationCenter.webRtcMicAmplitudeEvent;
        zc zcVar = this.a;
        if (i10 == i17) {
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                this.A0 = 0.0f;
            } else {
                this.A0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
            }
            if (VoIPService.getSharedInstance() != null) {
                org.telegram.ui.ActionBar.k6.D0().a(Math.max(this.z0, this.A0));
                zcVar.d(Math.max(this.z0, this.A0));
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged && this.Q == 0) {
                invalidate();
                return;
            }
            return;
        }
        b();
        this.z0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            this.A0 = 0.0f;
        }
        if (VoIPService.getSharedInstance() != null) {
            org.telegram.ui.ActionBar.k6.D0().a(Math.max(this.z0, this.A0));
            zcVar.d(Math.max(this.z0, this.A0));
        }
        this.U.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        boolean z10;
        float f10;
        float f11;
        long j10;
        int i10;
        float f12;
        boolean z11;
        float f13;
        float f14;
        long j11;
        x10 x10Var;
        float f15;
        MessageObject playingMessageObject;
        if (this.r == null) {
            return;
        }
        if (!this.E0 || getVisibility() == 0) {
            int i11 = this.Q;
            float f16 = 1.0f;
            if (i11 == 3 || i11 == 1) {
                org.telegram.ui.ActionBar.k6.D0().c(this.C0);
                this.a.f(this.C0);
                AndroidUtilities.dp(getStyleHeight());
                y10 D0 = org.telegram.ui.ActionBar.k6.D0();
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                Path path = D0.n;
                Paint paint = D0.m;
                int i12 = 0;
                while (true) {
                    x10[] x10VarArr = D0.a;
                    if (i12 >= x10VarArr.length) {
                        break;
                    }
                    x10 x10Var2 = x10VarArr[i12];
                    int i13 = x10Var2.i;
                    if (i13 == 0) {
                        if (x10Var2.j != org.telegram.ui.ActionBar.k6.w0(null, x10Var2.m, false) || x10Var2.k != org.telegram.ui.ActionBar.k6.w0(null, x10Var2.n, false)) {
                            x10Var2.a();
                        }
                    } else if (i13 == 1) {
                        if (x10Var2.j != org.telegram.ui.ActionBar.k6.w0(null, x10Var2.o, false) || x10Var2.k != org.telegram.ui.ActionBar.k6.w0(null, x10Var2.p, false)) {
                            x10Var2.a();
                        }
                    } else if (i13 == 3 && (x10Var2.j != org.telegram.ui.ActionBar.k6.w0(null, x10Var2.q, false) || x10Var2.k != org.telegram.ui.ActionBar.k6.w0(null, x10Var2.r, false))) {
                        x10Var2.a();
                    }
                    i12++;
                }
                boolean z12 = D0.l.size() > 0;
                if (0.0f <= measuredHeight) {
                    x10 x10Var3 = D0.b;
                    if (x10Var3 != null && (x10Var = D0.c) != null) {
                        int i14 = x10Var.i;
                        int i15 = x10Var3.i;
                        if ((i15 == 1 && i14 == 0) || (i14 == 1 && i15 == 0)) {
                            z4 = true;
                            z10 = z12;
                            if (z12) {
                                f10 = measuredWidth;
                                f11 = 0.0f;
                                j10 = 0;
                            } else {
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                f10 = measuredWidth;
                                f11 = 0.0f;
                                long j12 = elapsedRealtime - D0.j;
                                D0.j = elapsedRealtime;
                                if (j12 > 20) {
                                    j12 = 17;
                                }
                                j10 = j12;
                                if (j12 < 3) {
                                    z10 = false;
                                }
                            }
                            if (z10) {
                                float f17 = D0.g;
                                float f18 = D0.e;
                                if (f17 != f18) {
                                    float f19 = D0.h;
                                    float f20 = (j10 * f19) + f18;
                                    D0.e = f20;
                                    if (f19 > 0.0f) {
                                        if (f20 > f17) {
                                            D0.e = f17;
                                        }
                                    } else if (f20 < f17) {
                                        D0.e = f17;
                                    }
                                    invalidate();
                                }
                                float f21 = D0.g;
                                float f22 = D0.f;
                                if (f21 != f22) {
                                    float f23 = D0.i;
                                    float f24 = (j10 * f23) + f22;
                                    D0.f = f24;
                                    if (f23 > 0.0f) {
                                        if (f24 > f21) {
                                            D0.f = f21;
                                        }
                                    } else if (f24 < f21) {
                                        D0.f = f21;
                                    }
                                    invalidate();
                                }
                                if (D0.c != null) {
                                    float f25 = (j10 / 250.0f) + D0.k;
                                    D0.k = f25;
                                    if (f25 > 1.0f) {
                                        D0.k = 1.0f;
                                        D0.c = null;
                                    }
                                    invalidate();
                                }
                            }
                            i10 = 0;
                            while (i10 < 2) {
                                if (i10 == 0 && D0.c == null) {
                                    z11 = z4;
                                    f14 = f10;
                                    j11 = j10;
                                } else {
                                    if (i10 == 0) {
                                        f13 = f16 - D0.k;
                                        D0.c.b(paint);
                                        z11 = z4;
                                    } else {
                                        x10 x10Var4 = D0.b;
                                        if (x10Var4 == null) {
                                            break;
                                        }
                                        float f26 = D0.c != null ? D0.k : 1.0f;
                                        if (z10) {
                                            int i16 = (int) (measuredHeight - f11);
                                            int i17 = (int) (f10 - 0.0f);
                                            float f27 = D0.e;
                                            Matrix matrix = x10Var4.h;
                                            int i18 = x10Var4.i;
                                            if (i18 == 2) {
                                                f12 = f26;
                                                z11 = z4;
                                            } else {
                                                float f28 = x10Var4.e;
                                                if (f28 == 0.0f || x10Var4.f >= f28) {
                                                    f12 = f26;
                                                    x10Var4.e = Utilities.random.nextInt(700) + 500;
                                                    x10Var4.f = 0.0f;
                                                    if (x10Var4.a != -1.0f) {
                                                        z11 = z4;
                                                    } else if (i18 == 3) {
                                                        z11 = z4;
                                                        x10Var4.a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                        x10Var4.b = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.05f, 100.0f, 0.7f);
                                                    } else {
                                                        z11 = z4;
                                                        if (i18 == 0) {
                                                            x10Var4.a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                            x10Var4.b = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                        } else {
                                                            x10Var4.a = w.c.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                            x10Var4.b = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                                                        }
                                                    }
                                                    x10Var4.c = x10Var4.a;
                                                    x10Var4.d = x10Var4.b;
                                                    if (i18 == 3) {
                                                        x10Var4.a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                        x10Var4.b = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.05f, 100.0f, 0.7f);
                                                    } else if (i18 == 0) {
                                                        x10Var4.a = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                        x10Var4.b = android.support.v4.media.a.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                    } else {
                                                        x10Var4.a = w.c.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                        x10Var4.b = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                                                    }
                                                } else {
                                                    f12 = f26;
                                                    z11 = z4;
                                                }
                                                float f29 = j10;
                                                float f30 = (f29 * 0.02f * f27) + (f29 * 1.0f) + x10Var4.f;
                                                x10Var4.f = f30;
                                                float f31 = x10Var4.e;
                                                if (f30 > f31) {
                                                    x10Var4.f = f31;
                                                }
                                                float interpolation = pr.g.getInterpolation(x10Var4.f / f31);
                                                float f32 = i17;
                                                float f33 = x10Var4.c;
                                                float f34 = ((((x10Var4.a - f33) * interpolation) + f33) * f32) - 200.0f;
                                                float f35 = x10Var4.d;
                                                float f36 = ((((x10Var4.b - f35) * interpolation) + f35) * i16) - 200.0f;
                                                float f37 = (f32 / 400.0f) * ((i18 == 0 || i18 == 3) ? 3.0f : 1.5f);
                                                matrix.reset();
                                                matrix.postTranslate(f34, f36);
                                                matrix.postScale(f37, f37, f34 + 200.0f, f36 + 200.0f);
                                                x10Var4.g.setLocalMatrix(matrix);
                                            }
                                        } else {
                                            f12 = f26;
                                            z11 = z4;
                                        }
                                        D0.b.b(paint);
                                        f13 = f12;
                                    }
                                    if (i10 == 1 && z11) {
                                        paint.setAlpha(255);
                                    } else if (i10 == 1) {
                                        paint.setAlpha((int) (255.0f * f13));
                                    } else {
                                        paint.setAlpha(255);
                                    }
                                    if (i10 == 1 && z11) {
                                        path.rewind();
                                        float f38 = f10;
                                        j11 = j10;
                                        path.addCircle(f10 - AndroidUtilities.dp(18.0f), e2.c.x(measuredHeight, 0.0f, 2.0f, 0.0f), org.telegram.messenger.y3.y(f38, 0.0f, 1.1f, f13), Path.Direction.CW);
                                        canvas.save();
                                        canvas.clipPath(path);
                                        f14 = f38;
                                        canvas.drawRoundRect(0.0f, 0.0f, f14, measuredHeight, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                                        canvas.restore();
                                    } else {
                                        f14 = f10;
                                        j11 = j10;
                                        canvas.drawRoundRect(0.0f, 0.0f, f14, measuredHeight, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                                    }
                                }
                                i10++;
                                j10 = j11;
                                z4 = z11;
                                f16 = 1.0f;
                                f11 = 0.0f;
                                f10 = f14;
                            }
                        }
                    }
                    z4 = false;
                    z10 = z12;
                    if (z12) {
                    }
                    if (z10) {
                    }
                    i10 = 0;
                    while (i10 < 2) {
                    }
                }
                f15 = 1.0f;
                invalidate();
            } else {
                f15 = 1.0f;
            }
            super.dispatchDraw(canvas);
            if (this.Q == 0 && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                float f39 = -AndroidUtilities.dpf2(f15);
                float lerp = AndroidUtilities.lerp(f39, AndroidUtilities.dpf2(f15) + getMeasuredWidth(), playingMessageObject.audioProgress);
                float measuredHeight2 = getMeasuredHeight();
                float dpf2 = measuredHeight2 - AndroidUtilities.dpf2(2.0f);
                int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.hl, this.m0);
                Paint paint2 = this.D0;
                paint2.setColor(v02);
                canvas.drawRoundRect(f39, dpf2, lerp, measuredHeight2, AndroidUtilities.dpf2(f15), AndroidUtilities.dpf2(f15), paint2);
            }
            this.C0 = true;
        }
    }

    public final void e(boolean z4) {
        View fragmentView = this.h.getFragmentView();
        if (!z4 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z4 = true;
        }
        oh.e1 e1Var = oh.e1.T;
        AnimationNotificationsLocker animationNotificationsLocker = this.q0;
        if (e1Var != null) {
            b();
            int i10 = this.Q;
            if (6 != i10 && this.f != null && !z4) {
                this.t0 = true;
                return;
            }
            if (6 != i10 && this.P && !z4) {
                AnimatorSet animatorSet = this.f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f.setDuration(220L);
                this.f.setInterpolator(pr.f);
                this.f.addListener(new p10(this, 7));
                this.f.start();
                return;
            }
            r(6);
            if (this.P) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                setVisibility(0);
            } else {
                if (z4) {
                    setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                    m();
                } else {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.r0.lock();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(pr.f);
                    this.f.addListener(new p10(this, 8));
                    this.f.start();
                }
                this.P = true;
                setVisibility(0);
            }
        } else {
            boolean z10 = this.P;
            if (z10 && ((z4 && this.Q == -1) || this.Q == 6)) {
                this.P = false;
                if (z4) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                } else {
                    AnimatorSet animatorSet4 = this.f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f = null;
                    }
                    animationNotificationsLocker.lock();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(pr.f);
                    this.f.addListener(new p10(this, 6));
                    this.f.start();
                }
            } else if (z10 && this.Q == -1) {
                this.P = false;
                setVisibility(8);
            }
        }
        oh.e1 e1Var2 = oh.e1.T;
        if (e1Var2 == null || this.Q != 6) {
            return;
        }
        s10 s10Var = this.d;
        TLRPC.GroupCall groupCall = e1Var2.v;
        s10Var.setText(LocaleController.formatPluralStringComma("LiveStoryTopPanelWatching", Math.max(1, groupCall != null ? groupCall.participants_count : 0)));
    }

    public final void f() {
        int i10;
        String format;
        rg rgVar = this.n;
        if (rgVar == null || this.d == null) {
            return;
        }
        b();
        long a2 = rgVar.a();
        int currentAccount = this.h.getCurrentAccount();
        ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.f(a2);
        if (!this.n0) {
            LocationController.getInstance(currentAccount).loadLiveLocations(a2);
            this.n0 = true;
        }
        TLRPC.User user = null;
        if (arrayList != null) {
            long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
            int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
            i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.Message message = (TLRPC.Message) arrayList.get(i11);
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                    long fromChatId = MessageObject.getFromChatId(message);
                    if (user == null && fromChatId != clientUserId) {
                        user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(fromChatId));
                    }
                    i10++;
                }
            }
        } else {
            i10 = 0;
        }
        if (this.o0 == i10) {
            return;
        }
        this.o0 = i10;
        String string = LocaleController.getString(R.string.LiveLocationContext);
        if (i10 == 0) {
            format = string;
        } else {
            int i12 = i10 - 1;
            format = LocationController.getInstance(currentAccount).isSharingLocation(a2) ? i12 != 0 ? (i12 != 1 || user == null) ? String.format("%1$s - %2$s %3$s", string, LocaleController.getString(R.string.ChatYourSelfName), LocaleController.formatPluralString("AndOther", i12, new Object[0])) : String.format("%1$s - %2$s", string, LocaleController.formatString("SharingYouAndOtherName", R.string.SharingYouAndOtherName, UserObject.getFirstName(user))) : String.format("%1$s - %2$s", string, LocaleController.getString(R.string.ChatYourSelfName)) : i12 != 0 ? String.format("%1$s - %2$s %3$s", string, UserObject.getFirstName(user), LocaleController.formatPluralString("AndOther", i12, new Object[0])) : String.format("%1$s - %2$s", string, UserObject.getFirstName(user));
        }
        if (format.equals(this.R)) {
            return;
        }
        this.R = format;
        int indexOf = format.indexOf(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i13 = 0;
        while (i13 < 2) {
            s10 s10Var = this.d;
            TextView textView = i13 == 0 ? s10Var.getTextView() : s10Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i13++;
        }
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.t7, this.m0)), indexOf, string.length() + indexOf, 18);
        }
        this.d.b(spannableStringBuilder, false);
    }

    public final void g(boolean z4) {
        rg rgVar;
        SpannableStringBuilder spannableStringBuilder;
        if (this.P) {
            int i10 = this.Q;
            if (i10 == 1 || i10 == 3) {
                return;
            }
            if ((i10 == 4 || i10 == 5) && !j()) {
                return;
            }
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        View fragmentView = this.h.getFragmentView();
        if (!z4 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z4 = true;
        }
        boolean z10 = this.P;
        AnimationNotificationsLocker animationNotificationsLocker = this.q0;
        if (playingMessageObject == null || playingMessageObject.getId() == 0 || playingMessageObject.isVideo()) {
            this.N = null;
            boolean z11 = (!this.T || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || c30.c()) ? false : true;
            if (!j() && !z11 && (rgVar = this.n) != null && !c30.c()) {
                ChatObject.Call groupCall = rgVar.getGroupCall();
                z11 = groupCall != null && groupCall.shouldShowPanel();
            }
            if (z11) {
                a(false);
                return;
            }
            if (!this.P) {
                setVisibility(8);
                return;
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.C;
            if (w0Var != null && w0Var.t()) {
                this.C.M(null, null);
            }
            this.P = false;
            if (z4) {
                if (getVisibility() != 8) {
                    setVisibility(8);
                }
                setTopPadding(0.0f);
                return;
            }
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f = null;
            }
            animationNotificationsLocker.lock();
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f.setDuration(200L);
            w10 w10Var = this.l0;
            if (w10Var != null) {
                ((wq0) w10Var).a(true);
            }
            this.f.addListener(new p10(this, 2));
            this.f.start();
            return;
        }
        b();
        int i11 = this.Q;
        if (i11 != 0 && this.f != null && !z4) {
            this.u0 = true;
            return;
        }
        r(0);
        if (z4 && this.O == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            w10 w10Var2 = this.l0;
            if (w10Var2 != null) {
                ((wq0) w10Var2).a(true);
                ((wq0) this.l0).a(false);
            }
        }
        if (!this.P) {
            if (!z4) {
                AnimatorSet animatorSet3 = this.f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f = null;
                }
                animationNotificationsLocker.lock();
                this.f = new AnimatorSet();
                w10 w10Var3 = this.l0;
                if (w10Var3 != null) {
                    ((wq0) w10Var3).a(true);
                }
                this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new p10(this, 3));
                this.f.start();
            }
            this.P = true;
            setVisibility(0);
        }
        if (MediaController.getInstance().isMessagePaused()) {
            this.c.a(false, !z4);
            this.b.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
        } else {
            this.c.a(true, !z4);
            this.b.setContentDescription(LocaleController.getString(R.string.AccActionPause));
        }
        if (this.N == playingMessageObject && i11 == 0) {
            return;
        }
        this.N = playingMessageObject;
        if (playingMessageObject.isVoice() || this.N.isRoundVideo()) {
            this.S = false;
            org.telegram.ui.ActionBar.w0 w0Var2 = this.C;
            if (w0Var2 != null) {
                w0Var2.setAlpha(1.0f);
                this.C.setEnabled(true);
            }
            this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.J, 0);
            spannableStringBuilder = new SpannableStringBuilder(android.support.v4.media.a.z(playingMessageObject.getMusicAuthor(), " ", playingMessageObject.getMusicTitle()));
            int i12 = 0;
            while (i12 < 2) {
                s10 s10Var = this.d;
                TextView textView = i12 == 0 ? s10Var.getTextView() : s10Var.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                }
                i12++;
            }
            q(false);
        } else {
            this.S = true;
            if (this.C == null) {
                this.d.setPadding(0, 0, this.J, 0);
            } else if (playingMessageObject.getDuration() >= 600.0d) {
                this.C.setAlpha(1.0f);
                this.C.setEnabled(true);
                this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.J, 0);
                q(false);
            } else {
                this.C.setAlpha(0.0f);
                this.C.setEnabled(false);
                this.d.setPadding(0, 0, this.J, 0);
            }
            spannableStringBuilder = new SpannableStringBuilder(android.support.v4.media.a.z(playingMessageObject.getMusicAuthor(), " - ", playingMessageObject.getMusicTitle()));
            int i13 = 0;
            while (i13 < 2) {
                s10 s10Var2 = this.d;
                TextView textView2 = i13 == 0 ? s10Var2.getTextView() : s10Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                }
                i13++;
            }
        }
        spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.t7, this.m0)), 0, playingMessageObject.getMusicAuthor().length(), 18);
        this.d.b(spannableStringBuilder, !z4 && z10 && this.S);
    }

    public zc getCapsuleBlobDrawable() {
        return this.a;
    }

    public int getCurrentStyle() {
        return this.Q;
    }

    public int getStyleHeight() {
        return this.Q == 4 ? 48 : 36;
    }

    public float getTopPadding() {
        return this.O;
    }

    public final void h() {
        if (this.C != null) {
            return;
        }
        Context context = getContext();
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.g6 g6Var = this.m0;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.k6.v0(i10, g6Var), false, this.m0);
        this.C = w0Var;
        w0Var.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        int i11 = 0;
        this.C.setLongClickEnabled(false);
        this.C.setVisibility(8);
        this.C.setTag(null);
        this.C.setShowSubmenuByMove(false);
        this.C.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.C.setDelegate(new k10(this));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.C;
        ef.f fVar = new ef.f();
        this.D = fVar;
        w0Var2.setIcon(fVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), g6Var);
        this.E = c1Var;
        c1Var.setRoundRadiusDp(6.0f);
        this.E.setDrawShadow(true);
        this.E.setOnValueChange(new d(this, 13));
        org.telegram.ui.ActionBar.u0 u10 = this.C.u(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        org.telegram.ui.ActionBar.u0[] u0VarArr = this.F;
        u0VarArr[0] = u10;
        u0VarArr[1] = this.C.u(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        u0VarArr[2] = this.C.u(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        u0VarArr[3] = this.C.u(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        u0VarArr[4] = this.C.u(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        u0VarArr[5] = this.C.u(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            this.C.setPadding(0, 1, 0, 0);
        }
        this.C.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        addView(this.C, k7.c6.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.C.setOnClickListener(new w2(18, this, fArr));
        this.C.setOnLongClickListener(new n10(this, i11));
        q(false);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        int i10 = this.Q;
        if ((i10 == 3 || i10 == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(LocationController.SharingLocationInfo sharingLocationInfo) {
        if (sharingLocationInfo != null) {
            org.telegram.ui.ActionBar.p2 p2Var = this.h;
            if (p2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) p2Var.getParentActivity();
                launchActivity.K0(sharingLocationInfo.messageObject.currentAccount);
                org.telegram.ui.bd0 bd0Var = new org.telegram.ui.bd0(2);
                bd0Var.u0(sharingLocationInfo.messageObject);
                bd0Var.C0 = new f3.e(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 4);
                launchActivity.p0(bd0Var);
            }
        }
    }

    public final void l(float f10, float f11, boolean z4) {
        String formatString;
        int i10;
        if (i(f10, f11)) {
            return;
        }
        if (Math.abs(f11 - 1.0f) < 0.05f) {
            if (f10 < f11) {
                return;
            }
            formatString = LocaleController.getString(R.string.AudioSpeedNormal);
            i10 = Math.abs(f10 - 2.0f) < 0.05f ? R.raw.speed_2to1 : f11 < f10 ? R.raw.speed_slow : R.raw.speed_fast;
        } else if (z4 && i(f11, 1.5f) && i(f10, 1.0f)) {
            formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, ef.f.a(f11));
            i10 = R.raw.speed_1to15;
        } else if (z4 && i(f11, 2.0f) && i(f10, 1.5f)) {
            formatString = LocaleController.getString(R.string.AudioSpeedFast);
            i10 = R.raw.speed_15to2;
        } else {
            formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, ef.f.a(f11));
            i10 = f11 < 1.0f ? R.raw.speed_slow : R.raw.speed_fast;
        }
        qc.a0(this.h).Q(i10, 36, formatString).j();
    }

    public final void m() {
        org.telegram.ui.Components.voip.h hVar = this.K;
        if (hVar == null || hVar.g < 1.0f) {
            this.B0 = true;
        } else {
            this.B0 = false;
            AndroidUtilities.runOnUIThread(new o10(this, 0), 150L);
        }
    }

    public final void n(boolean z4) {
        ChatObject.Call call;
        int i10;
        TLRPC.User user;
        ValueAnimator valueAnimator;
        b();
        if (!z4 && (valueAnimator = this.U.a.f) != null) {
            valueAnimator.cancel();
            this.U.a.f = null;
        }
        c9 c9Var = this.U.a;
        if (c9Var.f != null) {
            c9Var.g = true;
            return;
        }
        int i11 = this.Q;
        int i12 = this.j0;
        rg rgVar = this.n;
        if (i11 == 4) {
            if (rgVar != null) {
                call = rgVar.getGroupCall();
                i12 = this.h.getCurrentAccount();
            } else {
                call = null;
            }
            i10 = i12;
            user = null;
        } else if (VoIPService.getSharedInstance() != null) {
            call = VoIPService.getSharedInstance().groupCall;
            user = rgVar != null ? null : VoIPService.getSharedInstance().getUser();
            i10 = VoIPService.getSharedInstance().getAccount();
        } else {
            call = null;
            i10 = i12;
            user = null;
        }
        if (call != null) {
            int size = call.sortedParticipants.size();
            for (int i13 = 0; i13 < 3; i13++) {
                if (i13 < size) {
                    this.U.b(i13, call.sortedParticipants.get(i13), i10);
                } else {
                    this.U.b(i13, null, i10);
                }
            }
        } else if (user != null) {
            this.U.b(0, user, i10);
            for (int i14 = 1; i14 < 3; i14++) {
                this.U.b(i14, null, i10);
            }
        } else {
            for (int i15 = 0; i15 < 3; i15++) {
                this.U.b(i15, null, i10);
            }
        }
        this.U.a(z4);
        if (this.Q != 4 || call == null) {
            return;
        }
        int min = call.call.rtmp_stream ? 0 : Math.min(3, call.sortedParticipants.size());
        int e6 = (min == 0 ? 10 : e2.c.e(min, 1, 24, 52)) + 3;
        if (z4) {
            int i16 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
            if (AndroidUtilities.dp(e6) != i16) {
                float translationX = (this.d.getTranslationX() + i16) - AndroidUtilities.dp(r3);
                this.d.setTranslationX(translationX);
                this.e.setTranslationX(translationX);
                ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                pr prVar = pr.f;
                duration.setInterpolator(prVar);
                this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(prVar);
            }
        } else {
            this.d.animate().cancel();
            this.e.animate().cancel();
            this.d.setTranslationX(0.0f);
            this.e.setTranslationX(0.0f);
        }
        float f10 = e6;
        this.d.setLayoutParams(k7.c6.d(-1, 20.0f, 51, f10, 5.0f, call.isScheduled() ? 90 : 36, 0.0f));
        this.e.setLayoutParams(k7.c6.d(-1, 20.0f, 51, f10, 25.0f, call.isScheduled() ? 90 : 36, 0.0f));
    }

    public final void o() {
        ChatObject.Call call;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i10 = this.Q;
            if (i10 == 1 || i10 == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(LocaleController.getString(R.string.VoipGroupConnecting), false);
                    return;
                }
                if (sharedInstance.isConference() && (call = sharedInstance.groupCall) != null) {
                    if (call.sortedParticipants.size() <= 1) {
                        this.d.b(LocaleController.getString(R.string.ConferenceChat), false);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i11 = 0; i11 < Math.min(3, sharedInstance.groupCall.sortedParticipants.size()); i11++) {
                        if (i11 > 0) {
                            sb.append(", ");
                        }
                        sb.append(DialogObject.getShortName(sharedInstance.getAccount(), DialogObject.getPeerDialogId(sharedInstance.groupCall.sortedParticipants.get(i11).peer)));
                    }
                    if (sharedInstance.groupCall.sortedParticipants.size() > 3) {
                        sb.append(" ");
                        sb.append(LocaleController.formatPluralString("AndOther", sharedInstance.groupCall.sortedParticipants.size() - 3, new Object[0]));
                    }
                    this.d.b(sb.toString(), false);
                    return;
                }
                TLRPC.Chat chat = sharedInstance.getChat();
                rg rgVar = this.n;
                if (chat == null) {
                    if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (rgVar == null || rgVar.i() == null || rgVar.i().id != user.id) {
                            this.d.setText(ContactsController.formatName(user.first_name, user.last_name));
                            return;
                        } else {
                            this.d.setText(LocaleController.getString(R.string.ReturnToCall));
                            return;
                        }
                    }
                    return;
                }
                if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                    this.d.b(sharedInstance.groupCall.call.title, false);
                    return;
                }
                if (rgVar == null || rgVar.g() == null || rgVar.g().id != sharedInstance.getChat().id) {
                    this.d.b(sharedInstance.getChat().title, false);
                    return;
                }
                TLRPC.Chat g10 = rgVar.g();
                if (VoIPService.hasRtmpStream()) {
                    this.d.b(LocaleController.getString(R.string.VoipChannelViewVoiceChat), false);
                } else if (ChatObject.isChannelOrGiga(g10)) {
                    this.d.b(LocaleController.getString(R.string.VoipChannelViewVoiceChat), false);
                } else {
                    this.d.b(LocaleController.getString(R.string.VoipGroupViewVoiceChat), false);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsCacheChanged);
            d(true);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupCallUpdated);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupCallTypingsUpdated);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.historyImportProgressChanged);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i10).subscribeToCallMessages(0L, this);
            }
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.messagePlayingSpeedChanged);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didStartedCall);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.groupCallVisibilityChanged);
            if (oh.e1.T != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || c30.c()) {
                rg rgVar = this.n;
                if (rgVar != null && this.h.getSendMessagesHelper().getImportingHistory(rgVar.a()) != null && !j()) {
                    c(true);
                } else if (rgVar == null || rgVar.getGroupCall() == null || !rgVar.getGroupCall().shouldShowPanel() || c30.c() || j()) {
                    a(true);
                    g(true);
                    q(false);
                } else {
                    a(true);
                }
            } else {
                a(true);
            }
        }
        int i11 = this.Q;
        if (i11 == 3 || i11 == 1) {
            ArrayList arrayList = org.telegram.ui.ActionBar.k6.D0().l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            zc zcVar = this.a;
            if (!zcVar.u) {
                zcVar.u = true;
                zcVar.t = SystemClock.elapsedRealtime();
                lf.j.d().a(60, zcVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            boolean z4 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            if (this.L != z4 && this.x != null) {
                this.L = z4;
                this.y.N(z4 ? 15 : 29);
                ij0 ij0Var = this.y;
                ij0Var.L(ij0Var.f - 1, false, true);
                this.x.invalidate();
            }
        } else if (i11 == 4 && !this.h0) {
            this.h0 = true;
            this.i0.run();
        }
        if (this.P && this.O == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        this.z0 = 0.0f;
        this.A0 = 0.0f;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z4 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        boolean z10 = this.L;
        zc zcVar = this.a;
        if (z10 != z4) {
            this.L = z4;
            this.y.N(z4 ? 15 : 29);
            ij0 ij0Var = this.y;
            ij0Var.L(ij0Var.f - 1, false, true);
            this.x.invalidate();
            org.telegram.ui.ActionBar.k6.D0().c(this.P);
            zcVar.f(this.P);
        }
        if (this.L) {
            this.A0 = 0.0f;
            org.telegram.ui.ActionBar.k6.D0().a(0.0f);
            zcVar.d(0.0f);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.v0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z4) {
        org.telegram.messenger.voip.v0.c(this, z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f = null;
        }
        if (this.h0) {
            AndroidUtilities.cancelRunOnUIThread(this.i0);
            this.h0 = false;
        }
        this.P = false;
        this.q0.unlock();
        this.O = 0.0f;
        if (this.k0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsCacheChanged);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupCallUpdated);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupCallTypingsUpdated);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.historyImportProgressChanged);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(0L, this);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.messagePlayingSpeedChanged);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didStartedCall);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.groupCallVisibilityChanged);
        }
        int i11 = this.Q;
        if (i11 == 3 || i11 == 1) {
            y10 D0 = org.telegram.ui.ActionBar.k6.D0();
            ArrayList arrayList = D0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                D0.d = D0.b;
                D0.b = null;
                D0.c = null;
            }
            zc zcVar = this.a;
            if (zcVar.u) {
                zcVar.u = false;
                lf.j.d().f(zcVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.C0 = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, AndroidUtilities.dp2(getStyleHeight()));
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.v0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.s == null) {
            return;
        }
        int i10 = this.Q;
        if ((i10 == 1 || i10 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j10) {
            this.I0++;
            if (groupCallMessage.isOut()) {
                return;
            }
            this.H0.i(new v10(this.s, groupCallMessage), true);
        }
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onPopGroupCallMessage() {
        int i10 = this.I0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.I0 = i11;
            if (i11 == 0) {
                this.H0.i(null, true);
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z4) {
        org.telegram.messenger.voip.v0.e(this, z4);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.v0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        o();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z4) {
        org.telegram.messenger.voip.v0.h(this, z4);
    }

    public final void p() {
        g51[] g51VarArr;
        int i10 = !i(MediaController.getInstance().getPlaybackSpeed(this.S), 1.0f) ? org.telegram.ui.ActionBar.k6.Qh : org.telegram.ui.ActionBar.k6.x7;
        org.telegram.ui.ActionBar.g6 g6Var = this.m0;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
        ef.f fVar = this.D;
        if (fVar != null) {
            ((j6) fVar.b).r(v02);
            Paint paint = (Paint) fVar.c;
            if (paint != null) {
                paint.setColor(v02);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.C;
        if (w0Var != null) {
            w0Var.setBackground(org.telegram.ui.ActionBar.k6.f0(v02 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.w7, g6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.B;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.x7, g6Var), PorterDuff.Mode.MULTIPLY));
        }
        if (this.e != null) {
            int i11 = 0;
            while (i11 < 2) {
                s10 s10Var = this.e;
                TextView textView = i11 == 0 ? s10Var.getTextView() : s10Var.getNextTextView();
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.x7, g6Var));
                }
                i11++;
            }
        }
        s10 s10Var2 = this.d;
        if (s10Var2 != null) {
            Object tag = s10Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                int i12 = 0;
                while (i12 < 2) {
                    s10 s10Var3 = this.d;
                    TextView textView2 = i12 == 0 ? s10Var3.getTextView() : s10Var3.getNextTextView();
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(intValue, g6Var));
                        CharSequence text = textView2.getText();
                        if ((text instanceof Spanned) && (g51VarArr = (g51[]) ((Spanned) text).getSpans(0, text.length(), g51.class)) != null) {
                            for (g51 g51Var : g51VarArr) {
                                g51Var.b = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.t7, g6Var);
                            }
                        }
                    }
                    i12++;
                }
            }
        }
    }

    public final void q(boolean z4) {
        if (this.D == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.S);
        this.D.l(playbackSpeed, z4);
        p();
        boolean z10 = this.w0;
        int i10 = 0;
        this.w0 = false;
        while (true) {
            org.telegram.ui.ActionBar.u0[] u0VarArr = this.F;
            if (i10 >= u0VarArr.length) {
                this.E.d(playbackSpeed, z4);
                return;
            }
            org.telegram.ui.ActionBar.g6 g6Var = this.m0;
            if (z10 || Math.abs(playbackSpeed - J0[i10]) >= 0.05f) {
                org.telegram.ui.ActionBar.u0 u0Var = u0VarArr[i10];
                int i11 = org.telegram.ui.ActionBar.k6.E8;
                u0Var.a(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
            } else {
                org.telegram.ui.ActionBar.u0 u0Var2 = u0VarArr[i10];
                int i12 = org.telegram.ui.ActionBar.k6.Qh;
                u0Var2.a(org.telegram.ui.ActionBar.k6.v0(i12, g6Var), org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
            }
            i10++;
        }
    }

    public final void r(int i10) {
        if (this.Q == i10) {
            return;
        }
        b();
        int i11 = this.Q;
        zc zcVar = this.a;
        if (i11 == 3 || i11 == 1) {
            y10 D0 = org.telegram.ui.ActionBar.k6.D0();
            ArrayList arrayList = D0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                D0.d = D0.b;
                D0.b = null;
                D0.c = null;
            }
            if (zcVar.u) {
                zcVar.u = false;
                lf.j.d().f(zcVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
            xd.j jVar = this.H0;
            if (jVar != null) {
                jVar.i(null, true);
            }
        }
        this.Q = i10;
        this.r.setWillNotDraw(i10 != 4);
        if (i10 != 4) {
            this.d0 = false;
        }
        d9 d9Var = this.U;
        if (d9Var != null) {
            d9Var.setStyle(this.Q);
            this.U.setLayoutParams(k7.c6.e(108, getStyleHeight(), 51));
        }
        this.r.setLayoutParams(k7.c6.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
        float f10 = this.O;
        if (f10 > 0.0f && f10 != AndroidUtilities.dp2(getStyleHeight())) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.m0;
        if (i10 == 6) {
            this.v.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            this.r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.nk, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ok, g6Var)}));
            this.r.setTag(null);
            this.e.setVisibility(8);
            this.I.setVisibility(8);
            this.B.setVisibility(8);
            this.b.setVisibility(8);
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.w.i();
            this.U.setVisibility(8);
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.A7));
            int i12 = 0;
            while (i12 < 2) {
                s10 s10Var = this.d;
                TextView textView = i12 == 0 ? s10Var.getTextView() : s10Var.getNextTextView();
                if (textView != null) {
                    textView.setGravity(19);
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A7, g6Var));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextSize(1, 15.0f);
                }
                i12++;
            }
            this.d.setLayoutParams(k7.c6.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            return;
        }
        if (i10 == 5) {
            this.v.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            this.r.setBackgroundColor(0);
            this.r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.v7));
            int i13 = 0;
            while (i13 < 2) {
                s10 s10Var2 = this.d;
                TextView textView2 = i13 == 0 ? s10Var2.getTextView() : s10Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setGravity(19);
                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.u7, g6Var));
                    textView2.setTypeface(Typeface.DEFAULT);
                    textView2.setTextSize(1, 15.0f);
                }
                i13++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.u7));
            this.e.setVisibility(8);
            this.I.setVisibility(8);
            this.B.setVisibility(8);
            this.b.setVisibility(8);
            this.x.setVisibility(8);
            this.U.setVisibility(8);
            this.w.setVisibility(0);
            this.w.d();
            this.B.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
            org.telegram.ui.ActionBar.w0 w0Var = this.C;
            if (w0Var != null) {
                w0Var.setVisibility(8);
                this.C.setTag(null);
            }
            this.d.setLayoutParams(k7.c6.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            return;
        }
        if (i10 == 0 || i10 == 2) {
            this.v.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            this.r.setBackgroundColor(0);
            this.r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.v7));
            this.e.setVisibility(8);
            this.I.setVisibility(8);
            this.B.setVisibility(0);
            this.b.setVisibility(0);
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.w.i();
            this.U.setVisibility(8);
            int i14 = 0;
            while (i14 < 2) {
                s10 s10Var3 = this.d;
                TextView textView3 = i14 == 0 ? s10Var3.getTextView() : s10Var3.getNextTextView();
                if (textView3 != null) {
                    textView3.setGravity(19);
                    textView3.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.u7, g6Var));
                    textView3.setTypeface(Typeface.DEFAULT);
                    textView3.setTextSize(1, 15.0f);
                }
                i14++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.u7));
            if (i10 == 6) {
                this.b.setLayoutParams(k7.c6.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(k7.c6.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                this.B.setVisibility(8);
                return;
            } else {
                if (i10 != 0) {
                    this.b.setLayoutParams(k7.c6.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(k7.c6.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.B.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                    return;
                }
                this.b.setLayoutParams(k7.c6.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(k7.c6.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                h();
                org.telegram.ui.ActionBar.w0 w0Var2 = this.C;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(0);
                    this.C.setTag(1);
                }
                this.B.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                return;
            }
        }
        if (i10 == 4) {
            this.v.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            this.r.setBackgroundColor(0);
            this.r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.v7));
            this.x.setVisibility(8);
            this.e.setVisibility(0);
            int i15 = 0;
            while (i15 < 2) {
                s10 s10Var4 = this.d;
                TextView textView4 = i15 == 0 ? s10Var4.getTextView() : s10Var4.getNextTextView();
                if (textView4 != null) {
                    textView4.setGravity(51);
                    textView4.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.t7, g6Var));
                    textView4.setTypeface(AndroidUtilities.bold());
                    textView4.setTextSize(1, 15.0f);
                }
                i15++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.t7));
            this.d.setPadding(0, 0, this.J, 0);
            this.w.setVisibility(8);
            this.w.i();
            rg rgVar = this.n;
            this.U.setVisibility(!((rgVar == null || rgVar.getGroupCall() == null || rgVar.getGroupCall().call == null || !rgVar.getGroupCall().call.rtmp_stream) ? false : true) ? 0 : 8);
            if (this.U.getVisibility() != 8) {
                n(false);
            } else {
                this.d.setTranslationX(-AndroidUtilities.dp(36.0f));
                this.e.setTranslationX(-AndroidUtilities.dp(36.0f));
            }
            this.B.setVisibility(8);
            this.b.setVisibility(8);
            org.telegram.ui.ActionBar.w0 w0Var3 = this.C;
            if (w0Var3 != null) {
                w0Var3.setVisibility(8);
                this.C.setTag(null);
                return;
            }
            return;
        }
        if (i10 == 1 || i10 == 3) {
            this.v.setBackground(null);
            o();
            boolean hasRtmpStream = VoIPService.hasRtmpStream();
            this.U.setVisibility(!hasRtmpStream ? 0 : 8);
            if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (this.U.getVisibility() != 8) {
                n(false);
            } else {
                this.d.setTranslationX(0.0f);
                this.e.setTranslationX(0.0f);
            }
            this.x.setVisibility(!hasRtmpStream ? 0 : 8);
            boolean z4 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            this.L = z4;
            this.y.N(z4 ? 15 : 29);
            ij0 ij0Var = this.y;
            ij0Var.L(ij0Var.f - 1, false, true);
            this.x.invalidate();
            this.r.setBackground(null);
            this.r.setBackgroundColor(0);
            this.w.setVisibility(8);
            this.w.i();
            ArrayList arrayList2 = org.telegram.ui.ActionBar.k6.D0().l;
            if (!arrayList2.contains(this)) {
                arrayList2.add(this);
            }
            if (!zcVar.u) {
                zcVar.u = true;
                zcVar.t = SystemClock.elapsedRealtime();
                lf.j.d().a(60, zcVar.F);
            }
            invalidate();
            int i16 = 0;
            while (i16 < 2) {
                s10 s10Var5 = this.d;
                TextView textView5 = i16 == 0 ? s10Var5.getTextView() : s10Var5.getNextTextView();
                if (textView5 != null) {
                    textView5.setGravity(19);
                    textView5.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A7, g6Var));
                    textView5.setTypeface(AndroidUtilities.bold());
                    textView5.setTextSize(1, 14.0f);
                }
                i16++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.A7));
            this.B.setVisibility(8);
            this.b.setVisibility(8);
            this.e.setVisibility(8);
            this.I.setVisibility(8);
            this.d.setLayoutParams(k7.c6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
            this.d.setPadding(AndroidUtilities.dp(88.0f), 0, AndroidUtilities.dp(88.0f) + this.J, 0);
            org.telegram.ui.ActionBar.w0 w0Var4 = this.C;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
                this.C.setTag(null);
            }
        }
    }

    public void setDelegate(w10 w10Var) {
        this.l0 = w10Var;
    }

    public void setDrawOverlay(boolean z4) {
        this.E0 = z4;
    }

    public void setLeftMargin(float f10) {
        if (this.r == null) {
            this.G0 = f10;
            return;
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setTranslationX(f10);
        }
        lj0 lj0Var = this.w;
        if (lj0Var != null) {
            lj0Var.setTranslationX(f10);
        }
        s10 s10Var = this.d;
        if (s10Var != null) {
            s10Var.setTranslationX(f10);
        }
        s10 s10Var2 = this.e;
        if (s10Var2 != null) {
            s10Var2.setTranslationX(f10);
        }
        d9 d9Var = this.U;
        if (d9Var != null) {
            d9Var.setTranslationX(f10);
        }
    }

    public void setSupportsCalls(boolean z4) {
        this.T = z4;
    }

    public void setTopPadding(float f10) {
        this.O = f10;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        setTopPadding(this.O);
        if (i10 == 8) {
            this.C0 = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentContextView(Context context, org.telegram.ui.ActionBar.p2 p2Var, View view, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = new zc();
        this.F = new org.telegram.ui.ActionBar.u0[6];
        this.M = -1;
        this.Q = -1;
        this.T = true;
        this.f0 = new j6(false, true, true, false);
        this.i0 = new q10(this);
        this.j0 = UserConfig.selectedAccount;
        this.o0 = -1;
        this.p0 = new m2.b(this, 22);
        this.q0 = new AnimationNotificationsLocker();
        this.r0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.D0 = new Paint(1);
        this.F0 = 0;
        this.H0 = new xd.j(new k10(this), pr.h, 450L);
        this.I0 = 0;
        this.m0 = g6Var;
        this.h = p2Var;
        if (p2Var instanceof rg) {
            this.n = (rg) p2Var;
        }
        this.P = true;
        this.k0 = z4;
        if (view == null) {
            ((ViewGroup) p2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }
}
