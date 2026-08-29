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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class FragmentContextView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener {
    public static final float[] I0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public ImageView A;
    public boolean A0;
    public org.telegram.ui.ActionBar.w0 B;
    public boolean B0;
    public cf.f C;
    public final Paint C0;
    public org.telegram.ui.ActionBar.c1 D;
    public boolean D0;
    public final org.telegram.ui.ActionBar.u0[] E;
    public int E0;
    public FrameLayout F;
    public float F0;
    public ImageView G;
    public final vd.k G0;
    public org.telegram.ui.jk H;
    public int H0;
    public int I;
    public org.telegram.ui.Components.voip.h J;
    public boolean K;
    public int L;
    public MessageObject M;
    public float N;
    public boolean O;
    public int P;
    public String Q;
    public boolean R;
    public boolean S;
    public h9 T;
    public Paint U;
    public LinearGradient V;
    public Matrix W;
    public final cd a;
    public int a0;
    public ImageView b;
    public TextPaint b0;
    public cg0 c;
    public boolean c0;
    public n10 d;
    public boolean d0;
    public n10 e;
    public final n6 e0;
    public AnimatorSet f;
    public uc f0;
    public boolean g0;
    public final org.telegram.ui.ActionBar.o2 h;
    public final l10 h0;
    public final int i0;
    public final boolean j0;
    public r10 k0;
    public final org.telegram.ui.ActionBar.c6 l0;
    public boolean m0;
    public final ug n;
    public int n0;
    public final lh.m7 o0;
    public final AnimationNotificationsLocker p0;
    public final AnimationNotificationsLocker q0;
    public m10 r;
    public boolean r0;
    public bh.d s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public View v;
    public boolean v0;
    public aj0 w;
    public org.telegram.ui.zi w0;
    public p10 x;
    public long x0;
    public xi0 y;
    public float y0;
    public float z0;

    public FragmentContextView(Context context, org.telegram.ui.fy fyVar, boolean z10) {
        this(context, fyVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i10 = this.P;
        org.telegram.ui.ActionBar.c6 c6Var = this.l0;
        return i10 == 4 ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.t7, c6Var) : (i10 == 1 || i10 == 3) ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A7, c6Var) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.u7, c6Var);
    }

    public static boolean i(float f9, float f10) {
        return Math.abs(f9 - f10) < 0.05f;
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
    public final void a(boolean z10) {
        boolean z11;
        ChatObject.Call groupCall;
        boolean z12;
        ChatObject.Call call;
        int i10;
        int i11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (this.O && this.P == 5 && (sharedInstance == null || sharedInstance.isHangingUp())) {
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.h;
        View fragmentView = o2Var.getFragmentView();
        boolean z13 = (z10 || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z10 : true;
        boolean c3 = w20.c();
        ug ugVar = this.n;
        if (c3) {
            z11 = false;
        } else {
            z11 = (org.telegram.ui.r50.A3 || !this.S || sharedInstance == null || sharedInstance.isHangingUp()) ? false : true;
            if (sharedInstance != null && (call = sharedInstance.groupCall) != null && (call.call instanceof TLRPC.TL_groupCallDiscarded)) {
                z11 = false;
            }
            if (!j() && !org.telegram.ui.r50.A3 && this.S && !z11 && ugVar != null && (groupCall = ugVar.getGroupCall()) != null && groupCall.shouldShowPanel()) {
                z11 = true;
                z12 = true;
                AnimationNotificationsLocker animationNotificationsLocker = this.p0;
                if (z11) {
                    boolean z14 = this.O;
                    if (z14 && ((z13 && this.P == -1) || (i11 = this.P) == 4 || i11 == 3 || i11 == 1)) {
                        this.O = false;
                        if (z13) {
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
                            this.f.setInterpolator(jr.f);
                            this.f.addListener(new k10(this, 9));
                            this.f.start();
                        }
                    } else if (z14 && ((i10 = this.P) == -1 || i10 == 4 || i10 == 3 || i10 == 1)) {
                        this.O = false;
                        setVisibility(8);
                    }
                    if (!z13 || ugVar == null || !ugVar.F() || w20.c()) {
                        return;
                    }
                    j7.l1.v(R.string.InviteExpired, tc.a0(o2Var), R.raw.linkbroken, 36);
                    return;
                }
                b();
                int i12 = z12 ? 4 : sharedInstance.groupCall != null ? 3 : 1;
                int i13 = this.P;
                if (i12 != i13 && this.f != null && !z13) {
                    this.r0 = true;
                    return;
                }
                if (i12 != i13 && this.O && !z13) {
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
                    this.f.setInterpolator(jr.f);
                    this.f.addListener(new k10(this, 10));
                    this.f.start();
                    return;
                }
                if (z12) {
                    boolean z15 = i13 == 4 && this.O;
                    r(4);
                    ChatObject.Call groupCall2 = ugVar.getGroupCall();
                    TLRPC.Chat g10 = ugVar.g();
                    if (groupCall2.isScheduled()) {
                        if (this.U == null) {
                            TextPaint textPaint = new TextPaint(1);
                            this.b0 = textPaint;
                            textPaint.setColor(-1);
                            this.b0.setTextSize(AndroidUtilities.dp(14.0f));
                            this.b0.setTypeface(AndroidUtilities.bold());
                            Paint paint = new Paint(1);
                            this.U = paint;
                            paint.setColor(-1);
                            this.W = new Matrix();
                        }
                        this.c0 = true;
                        LocaleController.getString(R.string.VoipChatNotify);
                        TLRPC.GroupCall groupCall3 = groupCall2.call;
                        this.d0 = groupCall3 != null && groupCall3.schedule_start_subscribed;
                        this.H.setVisibility(8);
                        if (!TextUtils.isEmpty(groupCall2.call.title)) {
                            this.d.b(groupCall2.call.title, false);
                        } else if (ChatObject.isChannelOrGiga(g10)) {
                            this.d.b(LocaleController.getString(R.string.VoipChannelScheduledVoiceChat), false);
                        } else {
                            this.d.b(LocaleController.getString(R.string.VoipGroupScheduledVoiceChat), false);
                        }
                        this.e.b(LocaleController.formatStartsTime(groupCall2.call.schedule_date, 4), false);
                        if (!this.g0) {
                            this.g0 = true;
                            this.h0.run();
                        }
                    } else {
                        this.c0 = false;
                        this.H.setVisibility(0);
                        this.H.setText(LocaleController.getString(R.string.VoipChatJoin));
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
                    n(this.T.a.d && z15);
                } else if (sharedInstance == null || sharedInstance.groupCall == null) {
                    n(i13 == 1);
                    r(1);
                } else {
                    n(i13 == 3);
                    r(3);
                }
                if (this.O) {
                    return;
                }
                if (z13) {
                    setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                    m();
                } else {
                    AnimatorSet animatorSet5 = this.f;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.q0.lock();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(jr.f);
                    this.f.addListener(new k10(this, 11));
                    this.f.start();
                }
                this.O = true;
                setVisibility(0);
                return;
            }
        }
        z12 = false;
        AnimationNotificationsLocker animationNotificationsLocker2 = this.p0;
        if (z11) {
        }
    }

    public final void b() {
        if (this.r != null) {
            return;
        }
        Context context = getContext();
        m10 m10Var = new m10(this, context);
        this.r = m10Var;
        this.f0 = new uc(m10Var);
        int i10 = AndroidUtilities.displaySize.x;
        n6 n6Var = this.e0;
        n6Var.G = i10;
        n6Var.v = 0.4f;
        n6Var.setCallback(m10Var);
        n6Var.r(-1);
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.u(AndroidUtilities.bold());
        addView(this.r, i7.f6.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.v = view;
        this.r.addView(view, i7.f6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.b;
        int i11 = org.telegram.ui.ActionBar.g6.w7;
        org.telegram.ui.ActionBar.c6 c6Var = this.l0;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView imageView3 = this.b;
        cg0 cg0Var = new cg0(16);
        this.c = cg0Var;
        imageView3.setImageDrawable(cg0Var);
        this.b.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i11, c6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.b, i7.f6.e(36, 36, 51));
        final int i12 = 2;
        this.b.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g10
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
                        ug ugVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            c2Var.N = string;
                            if (o2Var instanceof org.telegram.ui.fy) {
                                c2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ugVar.g();
                                TLRPC.User i15 = ugVar.i();
                                if (g10 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    c2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new f10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, c6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        ug ugVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.P;
                        int i17 = 6;
                        if (i16 == 6) {
                            lh.d1 d1Var = lh.d1.S;
                            if (d1Var != null) {
                                long j11 = d1Var.b;
                                int i18 = d1Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(d1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i18).B(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new g8(findActivity, c6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new g8(LaunchActivity.C1, c6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (ugVar2 != null ? ugVar2.a() : 0L)) {
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
                                    o2Var2.presentFragment(new org.telegram.ui.tn(bundle), o2Var2 instanceof org.telegram.ui.tn);
                                    break;
                                }
                            }
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i16 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (ugVar2 != null) {
                                j10 = ugVar2.a();
                                i13 = o2Var2.getCurrentAccount();
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
                                o2Var2.showDialog(new uu0(fragmentContextView.getContext(), new f10(fragmentContextView), c6Var3));
                                break;
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (o2Var2.getParentActivity() != null && (groupCall = ugVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.h2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i16 == 5) {
                                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var2;
                                if (o2Var2.getSendMessagesHelper().getImportingHistory(tnVar.a()) != null) {
                                    u40 u40Var = new u40(fragmentContextView.getContext(), null, tnVar, c6Var3);
                                    u40Var.setOnHideListener(new d1(fragmentContextView, i17));
                                    o2Var2.showDialog(u40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.r50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.P == 0) {
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
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.I0;
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
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.K = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.y.N(fragmentContextView.K ? 15 : 29)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.y.K(0);
                                } else {
                                    fragmentContextView.y.K(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
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
        aj0 aj0Var = new aj0(context);
        this.w = aj0Var;
        aj0Var.setScaleType(scaleType);
        this.w.setAutoRepeat(true);
        this.w.f(R.raw.import_progress, 30, 30, null);
        this.w.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        addView(this.w, i7.f6.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        n10 n10Var = new n10(this, context, context, 0);
        this.d = n10Var;
        addView(n10Var, i7.f6.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        n10 n10Var2 = new n10(this, context, context, 1);
        this.e = n10Var2;
        addView(n10Var2, i7.f6.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.J = hVar;
        hVar.g = 1.0f;
        hVar.j = false;
        org.telegram.ui.jk jkVar = new org.telegram.ui.jk(this, context, 1);
        this.H = jkVar;
        jkVar.setText(LocaleController.getString(R.string.VoipChatJoin));
        this.H.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        org.telegram.ui.jk jkVar2 = this.H;
        int dp = AndroidUtilities.dp(16.0f);
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
        jkVar2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v03, v04, v04));
        this.H.setTextSize(1, 14.0f);
        this.H.setTypeface(AndroidUtilities.bold());
        this.H.setGravity(17);
        this.H.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.H, i7.f6.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        final int i13 = 3;
        this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g10
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
                        ug ugVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            c2Var.N = string;
                            if (o2Var instanceof org.telegram.ui.fy) {
                                c2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ugVar.g();
                                TLRPC.User i15 = ugVar.i();
                                if (g10 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    c2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new f10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, c6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        ug ugVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.P;
                        int i17 = 6;
                        if (i16 == 6) {
                            lh.d1 d1Var = lh.d1.S;
                            if (d1Var != null) {
                                long j11 = d1Var.b;
                                int i18 = d1Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(d1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i18).B(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new g8(findActivity, c6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new g8(LaunchActivity.C1, c6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (ugVar2 != null ? ugVar2.a() : 0L)) {
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
                                    o2Var2.presentFragment(new org.telegram.ui.tn(bundle), o2Var2 instanceof org.telegram.ui.tn);
                                    break;
                                }
                            }
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i16 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (ugVar2 != null) {
                                j10 = ugVar2.a();
                                i132 = o2Var2.getCurrentAccount();
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
                                o2Var2.showDialog(new uu0(fragmentContextView.getContext(), new f10(fragmentContextView), c6Var3));
                                break;
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (o2Var2.getParentActivity() != null && (groupCall = ugVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.h2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i16 == 5) {
                                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var2;
                                if (o2Var2.getSendMessagesHelper().getImportingHistory(tnVar.a()) != null) {
                                    u40 u40Var = new u40(fragmentContextView.getContext(), null, tnVar, c6Var3);
                                    u40Var.setOnHideListener(new d1(fragmentContextView, i17));
                                    o2Var2.showDialog(u40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.r50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.P == 0) {
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
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.I0;
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
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.K = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.y.N(fragmentContextView.K ? 15 : 29)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.y.K(0);
                                } else {
                                    fragmentContextView.y.K(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
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
        if (this.A0) {
            m();
        }
        this.F = new FrameLayout(context);
        ImageView imageView4 = new ImageView(context);
        this.G = imageView4;
        imageView4.setImageResource(R.drawable.msg_mute);
        ImageView imageView5 = this.G;
        int i14 = org.telegram.ui.ActionBar.g6.x7;
        imageView5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), mode));
        this.F.addView(this.G, i7.f6.e(20, 20, 17));
        this.F.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i14, c6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.F.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.F.setOnClickListener(new bg.n(15));
        this.F.setVisibility(8);
        addView(this.F, i7.f6.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.j0) {
            h();
        }
        h9 h9Var = new h9(context, false);
        this.T = h9Var;
        h9Var.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.T.setDelegate(new j10(this, 1));
        this.T.setVisibility(8);
        addView(this.T, i7.f6.e(108, 36, 51));
        this.y = new xi0(R.raw.voice_muted, "" + R.raw.voice_muted, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        p10 p10Var = new p10(this, context);
        this.x = p10Var;
        p10Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A7, c6Var), PorterDuff.Mode.SRC_IN));
        this.x.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i14, c6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.x.setAnimation(this.y);
        this.x.setScaleType(scaleType);
        this.x.setVisibility(8);
        addView(this.x, i7.f6.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        final int i15 = 4;
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g10
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
                        ug ugVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            c2Var.N = string;
                            if (o2Var instanceof org.telegram.ui.fy) {
                                c2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ugVar.g();
                                TLRPC.User i152 = ugVar.i();
                                if (g10 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i152 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i152)));
                                } else {
                                    c2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new f10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, c6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        ug ugVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.P;
                        int i17 = 6;
                        if (i16 == 6) {
                            lh.d1 d1Var = lh.d1.S;
                            if (d1Var != null) {
                                long j11 = d1Var.b;
                                int i18 = d1Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(d1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i18).B(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new g8(findActivity, c6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new g8(LaunchActivity.C1, c6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (ugVar2 != null ? ugVar2.a() : 0L)) {
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
                                    o2Var2.presentFragment(new org.telegram.ui.tn(bundle), o2Var2 instanceof org.telegram.ui.tn);
                                    break;
                                }
                            }
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i16 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (ugVar2 != null) {
                                j10 = ugVar2.a();
                                i132 = o2Var2.getCurrentAccount();
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
                                o2Var2.showDialog(new uu0(fragmentContextView.getContext(), new f10(fragmentContextView), c6Var3));
                                break;
                            }
                        } else if (i16 != 3) {
                            if (i16 == 4) {
                                if (o2Var2.getParentActivity() != null && (groupCall = ugVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.h2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i16 == 5) {
                                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var2;
                                if (o2Var2.getSendMessagesHelper().getImportingHistory(tnVar.a()) != null) {
                                    u40 u40Var = new u40(fragmentContextView.getContext(), null, tnVar, c6Var3);
                                    u40Var.setOnHideListener(new d1(fragmentContextView, i17));
                                    o2Var2.showDialog(u40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.r50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.P == 0) {
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
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.I0;
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
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.K = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.y.N(fragmentContextView.K ? 15 : 29)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.y.K(0);
                                } else {
                                    fragmentContextView.y.K(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
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
        this.A = imageView6;
        imageView6.setImageResource(R.drawable.miniplayer_close);
        this.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), mode));
        this.A.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i14, c6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.A.setScaleType(scaleType);
        addView(this.A, i7.f6.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i16 = 0;
        this.A.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g10
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
                        ug ugVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            c2Var.N = string;
                            if (o2Var instanceof org.telegram.ui.fy) {
                                c2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ugVar.g();
                                TLRPC.User i152 = ugVar.i();
                                if (g10 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i152 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i152)));
                                } else {
                                    c2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new f10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, c6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        ug ugVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.P;
                        int i17 = 6;
                        if (i162 == 6) {
                            lh.d1 d1Var = lh.d1.S;
                            if (d1Var != null) {
                                long j11 = d1Var.b;
                                int i18 = d1Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(d1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i18).B(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new g8(findActivity, c6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new g8(LaunchActivity.C1, c6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (ugVar2 != null ? ugVar2.a() : 0L)) {
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
                                    o2Var2.presentFragment(new org.telegram.ui.tn(bundle), o2Var2 instanceof org.telegram.ui.tn);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (ugVar2 != null) {
                                j10 = ugVar2.a();
                                i132 = o2Var2.getCurrentAccount();
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
                                o2Var2.showDialog(new uu0(fragmentContextView.getContext(), new f10(fragmentContextView), c6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (o2Var2.getParentActivity() != null && (groupCall = ugVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.h2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var2;
                                if (o2Var2.getSendMessagesHelper().getImportingHistory(tnVar.a()) != null) {
                                    u40 u40Var = new u40(fragmentContextView.getContext(), null, tnVar, c6Var3);
                                    u40Var.setOnHideListener(new d1(fragmentContextView, i17));
                                    o2Var2.showDialog(u40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.r50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.P == 0) {
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
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.I0;
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
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.K = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.y.N(fragmentContextView.K ? 15 : 29)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.y.K(0);
                                } else {
                                    fragmentContextView.y.K(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
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
        bh.d dVar = new bh.d(getContext(), 16);
        this.s = dVar;
        addView(dVar, i7.f6.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        final int i17 = 1;
        setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.g10
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
                        ug ugVar = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            c2Var.N = string;
                            if (o2Var instanceof org.telegram.ui.fy) {
                                c2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ugVar.g();
                                TLRPC.User i152 = ugVar.i();
                                if (g10 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i152 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i152)));
                                } else {
                                    c2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new f10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, c6Var2));
                                break;
                            }
                        } else {
                            MediaController.getInstance().cleanupPlayer(true, true);
                            break;
                        }
                        break;
                    case 1:
                        ug ugVar2 = fragmentContextView.n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.l0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i162 = fragmentContextView.P;
                        int i172 = 6;
                        if (i162 == 6) {
                            lh.d1 d1Var = lh.d1.S;
                            if (d1Var != null) {
                                long j11 = d1Var.b;
                                int i18 = d1Var.e;
                                if (i18 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i18);
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i18).getStoriesController().u(d1Var.c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i18).B(i18, fragmentContextView.getContext(), u10, null);
                                    break;
                                }
                            }
                        } else if (i162 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new g8(findActivity, c6Var3).show();
                                        break;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new g8(LaunchActivity.C1, c6Var3).show();
                                        break;
                                    }
                                } else if (playingMessageObject.getDialogId() == (ugVar2 != null ? ugVar2.a() : 0L)) {
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
                                    o2Var2.presentFragment(new org.telegram.ui.tn(bundle), o2Var2 instanceof org.telegram.ui.tn);
                                    break;
                                }
                            }
                        } else if (i162 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i162 == 2) {
                            int i19 = UserConfig.selectedAccount;
                            if (ugVar2 != null) {
                                j10 = ugVar2.a();
                                i132 = o2Var2.getCurrentAccount();
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
                                o2Var2.showDialog(new uu0(fragmentContextView.getContext(), new f10(fragmentContextView), c6Var3));
                                break;
                            }
                        } else if (i162 != 3) {
                            if (i162 == 4) {
                                if (o2Var2.getParentActivity() != null && (groupCall = ugVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.h2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                    break;
                                }
                            } else if (i162 == 5) {
                                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var2;
                                if (o2Var2.getSendMessagesHelper().getImportingHistory(tnVar.a()) != null) {
                                    u40 u40Var = new u40(fragmentContextView.getContext(), null, tnVar, c6Var3);
                                    u40Var.setOnHideListener(new d1(fragmentContextView, i172));
                                    o2Var2.showDialog(u40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.r50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.P == 0) {
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
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        break;
                    default:
                        float[] fArr2 = FragmentContextView.I0;
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
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.K = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.y.N(fragmentContextView.K ? 15 : 29)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.y.K(0);
                                } else {
                                    fragmentContextView.y.K(14);
                                }
                            }
                            fragmentContextView.x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
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
        setLeftMargin(this.F0);
    }

    public final void c(boolean z10) {
        int i10;
        ug ugVar = this.n;
        if (ugVar != null) {
            if (this.O && ((i10 = this.P) == 1 || i10 == 3)) {
                return;
            }
            b();
            org.telegram.ui.ActionBar.o2 o2Var = this.h;
            SendMessagesHelper.ImportingHistory importingHistory = o2Var.getSendMessagesHelper().getImportingHistory(ugVar.a());
            View fragmentView = o2Var.getFragmentView();
            if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                z10 = true;
            }
            Dialog visibleDialog = o2Var.getVisibleDialog();
            if ((j() || ugVar.n() || ((visibleDialog instanceof u40) && !((u40) visibleDialog).isDismissed())) && importingHistory != null) {
                importingHistory = null;
            }
            AnimationNotificationsLocker animationNotificationsLocker = this.p0;
            if (importingHistory == null) {
                if (!this.O || ((!z10 || this.P != -1) && this.P != 5)) {
                    int i11 = this.P;
                    if (i11 == -1 || i11 == 5) {
                        this.O = false;
                        setVisibility(8);
                        return;
                    }
                    return;
                }
                this.O = false;
                if (z10) {
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
                this.f.setInterpolator(jr.f);
                this.f.addListener(new k10(this, 4));
                this.f.start();
                return;
            }
            if (this.P != 5 && this.f != null && !z10) {
                this.u0 = true;
                return;
            }
            r(5);
            if (z10 && this.N == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                r10 r10Var = this.k0;
                if (r10Var != null) {
                    ((nq0) r10Var).a(true);
                    ((nq0) this.k0).a(false);
                }
            }
            if (!this.O) {
                if (!z10) {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    animationNotificationsLocker.lock();
                    this.f = new AnimatorSet();
                    r10 r10Var2 = this.k0;
                    if (r10Var2 != null) {
                        ((nq0) r10Var2).a(true);
                    }
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f.setDuration(200L);
                    this.f.addListener(new k10(this, 5));
                    this.f.start();
                }
                this.O = true;
                setVisibility(0);
            }
            int i12 = this.L;
            int i13 = importingHistory.uploadProgress;
            if (i12 != i13) {
                this.L = i13;
                this.d.b(AndroidUtilities.replaceTags(LocaleController.formatString("ImportUploading", R.string.ImportUploading, Integer.valueOf(i13))), false);
            }
        }
    }

    public final void d(boolean z10) {
        String formatPluralString;
        String string;
        org.telegram.ui.ActionBar.o2 o2Var = this.h;
        View fragmentView = o2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = o2Var instanceof org.telegram.ui.fy;
        boolean isSharingLocation = z11 ? LocationController.getLocationsCount() != 0 : LocationController.getInstance(o2Var.getCurrentAccount()).isSharingLocation(this.n.a());
        lh.m7 m7Var = this.o0;
        if (!isSharingLocation) {
            this.n0 = -1;
            AndroidUtilities.cancelRunOnUIThread(m7Var);
            if (this.O) {
                this.O = false;
                if (z10) {
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
                this.f.addListener(new k10(this, 0));
                this.f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.b.setImageDrawable(new eq0(getContext(), 1));
        if (z10 && this.N == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.O) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new k10(this, 1));
                this.f.start();
            }
            this.O = true;
            setVisibility(0);
        }
        if (!z11) {
            m7Var.run();
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
            n10 n10Var = this.d;
            TextView textView = i11 == 0 ? n10Var.getTextView() : n10Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i11++;
        }
        spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.t7, this.l0)), indexOf, string2.length() + indexOf, 18);
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
        ug ugVar = this.n;
        if (i10 == i12) {
            if (ugVar != null) {
                if (ugVar.a() == ((Long) objArr[0]).longValue()) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart || i10 == NotificationCenter.messagePlayingPlayStateChanged || i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.didEndCall) {
            int i13 = this.P;
            if (i13 == 1 || i13 == 3 || i13 == 4) {
                a(false);
            }
            g(false);
            return;
        }
        int i14 = NotificationCenter.didStartedCall;
        if (i10 == i14 || i10 == NotificationCenter.groupCallUpdated || i10 == NotificationCenter.groupCallVisibilityChanged) {
            a(false);
            if (this.P != 3 || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null) {
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
            if (this.O && this.P == 4) {
                ChatObject.Call groupCall = ugVar.getGroupCall();
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
            int i16 = this.P;
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
        cd cdVar = this.a;
        if (i10 == i17) {
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                this.z0 = 0.0f;
            } else {
                this.z0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
            }
            if (VoIPService.getSharedInstance() != null) {
                org.telegram.ui.ActionBar.g6.D0().a(Math.max(this.y0, this.z0));
                cdVar.d(Math.max(this.y0, this.z0));
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged && this.P == 0) {
                invalidate();
                return;
            }
            return;
        }
        b();
        this.y0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            this.z0 = 0.0f;
        }
        if (VoIPService.getSharedInstance() != null) {
            org.telegram.ui.ActionBar.g6.D0().a(Math.max(this.y0, this.z0));
            cdVar.d(Math.max(this.y0, this.z0));
        }
        this.T.invalidate();
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
        boolean z10;
        boolean z11;
        float f9;
        float f10;
        long j10;
        int i10;
        float f11;
        boolean z12;
        float f12;
        float f13;
        long j11;
        s10 s10Var;
        float f14;
        MessageObject playingMessageObject;
        if (this.r == null) {
            return;
        }
        if (!this.D0 || getVisibility() == 0) {
            int i11 = this.P;
            float f15 = 1.0f;
            if (i11 == 3 || i11 == 1) {
                org.telegram.ui.ActionBar.g6.D0().c(this.B0);
                this.a.f(this.B0);
                AndroidUtilities.dp(getStyleHeight());
                t10 D0 = org.telegram.ui.ActionBar.g6.D0();
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                Path path = D0.n;
                Paint paint = D0.m;
                int i12 = 0;
                while (true) {
                    s10[] s10VarArr = D0.a;
                    if (i12 >= s10VarArr.length) {
                        break;
                    }
                    s10 s10Var2 = s10VarArr[i12];
                    int i13 = s10Var2.i;
                    if (i13 == 0) {
                        if (s10Var2.j != org.telegram.ui.ActionBar.g6.w0(null, s10Var2.m, false) || s10Var2.k != org.telegram.ui.ActionBar.g6.w0(null, s10Var2.n, false)) {
                            s10Var2.a();
                        }
                    } else if (i13 == 1) {
                        if (s10Var2.j != org.telegram.ui.ActionBar.g6.w0(null, s10Var2.o, false) || s10Var2.k != org.telegram.ui.ActionBar.g6.w0(null, s10Var2.p, false)) {
                            s10Var2.a();
                        }
                    } else if (i13 == 3 && (s10Var2.j != org.telegram.ui.ActionBar.g6.w0(null, s10Var2.q, false) || s10Var2.k != org.telegram.ui.ActionBar.g6.w0(null, s10Var2.r, false))) {
                        s10Var2.a();
                    }
                    i12++;
                }
                boolean z13 = D0.l.size() > 0;
                if (0.0f <= measuredHeight) {
                    s10 s10Var3 = D0.b;
                    if (s10Var3 != null && (s10Var = D0.c) != null) {
                        int i14 = s10Var.i;
                        int i15 = s10Var3.i;
                        if ((i15 == 1 && i14 == 0) || (i14 == 1 && i15 == 0)) {
                            z10 = true;
                            z11 = z13;
                            if (z13) {
                                f9 = measuredWidth;
                                f10 = 0.0f;
                                j10 = 0;
                            } else {
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                f9 = measuredWidth;
                                f10 = 0.0f;
                                long j12 = elapsedRealtime - D0.j;
                                D0.j = elapsedRealtime;
                                if (j12 > 20) {
                                    j12 = 17;
                                }
                                j10 = j12;
                                if (j12 < 3) {
                                    z11 = false;
                                }
                            }
                            if (z11) {
                                float f16 = D0.g;
                                float f17 = D0.e;
                                if (f16 != f17) {
                                    float f18 = D0.h;
                                    float f19 = (j10 * f18) + f17;
                                    D0.e = f19;
                                    if (f18 > 0.0f) {
                                        if (f19 > f16) {
                                            D0.e = f16;
                                        }
                                    } else if (f19 < f16) {
                                        D0.e = f16;
                                    }
                                    invalidate();
                                }
                                float f20 = D0.g;
                                float f21 = D0.f;
                                if (f20 != f21) {
                                    float f22 = D0.i;
                                    float f23 = (j10 * f22) + f21;
                                    D0.f = f23;
                                    if (f22 > 0.0f) {
                                        if (f23 > f20) {
                                            D0.f = f20;
                                        }
                                    } else if (f23 < f20) {
                                        D0.f = f20;
                                    }
                                    invalidate();
                                }
                                if (D0.c != null) {
                                    float f24 = (j10 / 250.0f) + D0.k;
                                    D0.k = f24;
                                    if (f24 > 1.0f) {
                                        D0.k = 1.0f;
                                        D0.c = null;
                                    }
                                    invalidate();
                                }
                            }
                            i10 = 0;
                            while (i10 < 2) {
                                if (i10 == 0 && D0.c == null) {
                                    z12 = z10;
                                    f13 = f9;
                                    j11 = j10;
                                } else {
                                    if (i10 == 0) {
                                        f12 = f15 - D0.k;
                                        D0.c.b(paint);
                                        z12 = z10;
                                    } else {
                                        s10 s10Var4 = D0.b;
                                        if (s10Var4 == null) {
                                            break;
                                        }
                                        float f25 = D0.c != null ? D0.k : 1.0f;
                                        if (z11) {
                                            int i16 = (int) (measuredHeight - f10);
                                            int i17 = (int) (f9 - 0.0f);
                                            float f26 = D0.e;
                                            Matrix matrix = s10Var4.h;
                                            int i18 = s10Var4.i;
                                            if (i18 == 2) {
                                                f11 = f25;
                                                z12 = z10;
                                            } else {
                                                float f27 = s10Var4.e;
                                                if (f27 == 0.0f || s10Var4.f >= f27) {
                                                    f11 = f25;
                                                    s10Var4.e = Utilities.random.nextInt(700) + 500;
                                                    s10Var4.f = 0.0f;
                                                    if (s10Var4.a != -1.0f) {
                                                        z12 = z10;
                                                    } else if (i18 == 3) {
                                                        z12 = z10;
                                                        s10Var4.a = a4.w.d(Utilities.random.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                        s10Var4.b = a4.w.d(Utilities.random.nextInt(100), 0.05f, 100.0f, 0.7f);
                                                    } else {
                                                        z12 = z10;
                                                        if (i18 == 0) {
                                                            s10Var4.a = a4.w.d(Utilities.random.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                            s10Var4.b = a4.w.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                        } else {
                                                            s10Var4.a = u3.c.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                            s10Var4.b = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                                                        }
                                                    }
                                                    s10Var4.c = s10Var4.a;
                                                    s10Var4.d = s10Var4.b;
                                                    if (i18 == 3) {
                                                        s10Var4.a = a4.w.d(Utilities.random.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                        s10Var4.b = a4.w.d(Utilities.random.nextInt(100), 0.05f, 100.0f, 0.7f);
                                                    } else if (i18 == 0) {
                                                        s10Var4.a = a4.w.d(Utilities.random.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                        s10Var4.b = a4.w.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                    } else {
                                                        s10Var4.a = u3.c.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                        s10Var4.b = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                                                    }
                                                } else {
                                                    f11 = f25;
                                                    z12 = z10;
                                                }
                                                float f28 = j10;
                                                float f29 = (f28 * 0.02f * f26) + (f28 * 1.0f) + s10Var4.f;
                                                s10Var4.f = f29;
                                                float f30 = s10Var4.e;
                                                if (f29 > f30) {
                                                    s10Var4.f = f30;
                                                }
                                                float interpolation = jr.g.getInterpolation(s10Var4.f / f30);
                                                float f31 = i17;
                                                float f32 = s10Var4.c;
                                                float f33 = ((((s10Var4.a - f32) * interpolation) + f32) * f31) - 200.0f;
                                                float f34 = s10Var4.d;
                                                float f35 = ((((s10Var4.b - f34) * interpolation) + f34) * i16) - 200.0f;
                                                float f36 = (f31 / 400.0f) * ((i18 == 0 || i18 == 3) ? 3.0f : 1.5f);
                                                matrix.reset();
                                                matrix.postTranslate(f33, f35);
                                                matrix.postScale(f36, f36, f33 + 200.0f, f35 + 200.0f);
                                                s10Var4.g.setLocalMatrix(matrix);
                                            }
                                        } else {
                                            f11 = f25;
                                            z12 = z10;
                                        }
                                        D0.b.b(paint);
                                        f12 = f11;
                                    }
                                    if (i10 == 1 && z12) {
                                        paint.setAlpha(255);
                                    } else if (i10 == 1) {
                                        paint.setAlpha((int) (255.0f * f12));
                                    } else {
                                        paint.setAlpha(255);
                                    }
                                    if (i10 == 1 && z12) {
                                        path.rewind();
                                        float f37 = f9;
                                        j11 = j10;
                                        path.addCircle(f9 - AndroidUtilities.dp(18.0f), com.google.android.recaptcha.internal.a.A(measuredHeight, 0.0f, 2.0f, 0.0f), org.telegram.messenger.x3.y(f37, 0.0f, 1.1f, f12), Path.Direction.CW);
                                        canvas.save();
                                        canvas.clipPath(path);
                                        f13 = f37;
                                        canvas.drawRoundRect(0.0f, 0.0f, f13, measuredHeight, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                                        canvas.restore();
                                    } else {
                                        f13 = f9;
                                        j11 = j10;
                                        canvas.drawRoundRect(0.0f, 0.0f, f13, measuredHeight, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                                    }
                                }
                                i10++;
                                j10 = j11;
                                z10 = z12;
                                f15 = 1.0f;
                                f10 = 0.0f;
                                f9 = f13;
                            }
                        }
                    }
                    z10 = false;
                    z11 = z13;
                    if (z13) {
                    }
                    if (z11) {
                    }
                    i10 = 0;
                    while (i10 < 2) {
                    }
                }
                f14 = 1.0f;
                invalidate();
            } else {
                f14 = 1.0f;
            }
            super.dispatchDraw(canvas);
            if (this.P == 0 && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                float f38 = -AndroidUtilities.dpf2(f14);
                float lerp = AndroidUtilities.lerp(f38, AndroidUtilities.dpf2(f14) + getMeasuredWidth(), playingMessageObject.audioProgress);
                float measuredHeight2 = getMeasuredHeight();
                float dpf2 = measuredHeight2 - AndroidUtilities.dpf2(2.0f);
                int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.hl, this.l0);
                Paint paint2 = this.C0;
                paint2.setColor(v02);
                canvas.drawRoundRect(f38, dpf2, lerp, measuredHeight2, AndroidUtilities.dpf2(f14), AndroidUtilities.dpf2(f14), paint2);
            }
            this.B0 = true;
        }
    }

    public final void e(boolean z10) {
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        lh.d1 d1Var = lh.d1.S;
        AnimationNotificationsLocker animationNotificationsLocker = this.p0;
        if (d1Var != null) {
            b();
            int i10 = this.P;
            if (6 != i10 && this.f != null && !z10) {
                this.s0 = true;
                return;
            }
            if (6 != i10 && this.O && !z10) {
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
                this.f.setInterpolator(jr.f);
                this.f.addListener(new k10(this, 7));
                this.f.start();
                return;
            }
            r(6);
            if (this.O) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                setVisibility(0);
            } else {
                if (z10) {
                    setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                    m();
                } else {
                    AnimatorSet animatorSet3 = this.f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f = null;
                    }
                    this.f = new AnimatorSet();
                    this.q0.lock();
                    this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f.setDuration(220L);
                    this.f.setInterpolator(jr.f);
                    this.f.addListener(new k10(this, 8));
                    this.f.start();
                }
                this.O = true;
                setVisibility(0);
            }
        } else {
            boolean z11 = this.O;
            if (z11 && ((z10 && this.P == -1) || this.P == 6)) {
                this.O = false;
                if (z10) {
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
                    this.f.setInterpolator(jr.f);
                    this.f.addListener(new k10(this, 6));
                    this.f.start();
                }
            } else if (z11 && this.P == -1) {
                this.O = false;
                setVisibility(8);
            }
        }
        lh.d1 d1Var2 = lh.d1.S;
        if (d1Var2 == null || this.P != 6) {
            return;
        }
        n10 n10Var = this.d;
        TLRPC.GroupCall groupCall = d1Var2.v;
        n10Var.setText(LocaleController.formatPluralStringComma("LiveStoryTopPanelWatching", Math.max(1, groupCall != null ? groupCall.participants_count : 0)));
    }

    public final void f() {
        int i10;
        String format;
        ug ugVar = this.n;
        if (ugVar == null || this.d == null) {
            return;
        }
        b();
        long a2 = ugVar.a();
        int currentAccount = this.h.getCurrentAccount();
        ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.f(a2);
        if (!this.m0) {
            LocationController.getInstance(currentAccount).loadLiveLocations(a2);
            this.m0 = true;
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
        if (this.n0 == i10) {
            return;
        }
        this.n0 = i10;
        String string = LocaleController.getString(R.string.LiveLocationContext);
        if (i10 == 0) {
            format = string;
        } else {
            int i12 = i10 - 1;
            format = LocationController.getInstance(currentAccount).isSharingLocation(a2) ? i12 != 0 ? (i12 != 1 || user == null) ? String.format("%1$s - %2$s %3$s", string, LocaleController.getString(R.string.ChatYourSelfName), LocaleController.formatPluralString("AndOther", i12, new Object[0])) : String.format("%1$s - %2$s", string, LocaleController.formatString("SharingYouAndOtherName", R.string.SharingYouAndOtherName, UserObject.getFirstName(user))) : String.format("%1$s - %2$s", string, LocaleController.getString(R.string.ChatYourSelfName)) : i12 != 0 ? String.format("%1$s - %2$s %3$s", string, UserObject.getFirstName(user), LocaleController.formatPluralString("AndOther", i12, new Object[0])) : String.format("%1$s - %2$s", string, UserObject.getFirstName(user));
        }
        if (format.equals(this.Q)) {
            return;
        }
        this.Q = format;
        int indexOf = format.indexOf(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int i13 = 0;
        while (i13 < 2) {
            n10 n10Var = this.d;
            TextView textView = i13 == 0 ? n10Var.getTextView() : n10Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i13++;
        }
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.t7, this.l0)), indexOf, string.length() + indexOf, 18);
        }
        this.d.b(spannableStringBuilder, false);
    }

    public final void g(boolean z10) {
        ug ugVar;
        SpannableStringBuilder spannableStringBuilder;
        if (this.O) {
            int i10 = this.P;
            if (i10 == 1 || i10 == 3) {
                return;
            }
            if ((i10 == 4 || i10 == 5) && !j()) {
                return;
            }
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = this.O;
        AnimationNotificationsLocker animationNotificationsLocker = this.p0;
        if (playingMessageObject == null || playingMessageObject.getId() == 0 || playingMessageObject.isVideo()) {
            this.M = null;
            boolean z12 = (!this.S || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || w20.c()) ? false : true;
            if (!j() && !z12 && (ugVar = this.n) != null && !w20.c()) {
                ChatObject.Call groupCall = ugVar.getGroupCall();
                z12 = groupCall != null && groupCall.shouldShowPanel();
            }
            if (z12) {
                a(false);
                return;
            }
            if (!this.O) {
                setVisibility(8);
                return;
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.B;
            if (w0Var != null && w0Var.t()) {
                this.B.M(null, null);
            }
            this.O = false;
            if (z10) {
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
            r10 r10Var = this.k0;
            if (r10Var != null) {
                ((nq0) r10Var).a(true);
            }
            this.f.addListener(new k10(this, 2));
            this.f.start();
            return;
        }
        b();
        int i11 = this.P;
        if (i11 != 0 && this.f != null && !z10) {
            this.t0 = true;
            return;
        }
        r(0);
        if (z10 && this.N == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            r10 r10Var2 = this.k0;
            if (r10Var2 != null) {
                ((nq0) r10Var2).a(true);
                ((nq0) this.k0).a(false);
            }
        }
        if (!this.O) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f = null;
                }
                animationNotificationsLocker.lock();
                this.f = new AnimatorSet();
                r10 r10Var3 = this.k0;
                if (r10Var3 != null) {
                    ((nq0) r10Var3).a(true);
                }
                this.f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f.setDuration(200L);
                this.f.addListener(new k10(this, 3));
                this.f.start();
            }
            this.O = true;
            setVisibility(0);
        }
        if (MediaController.getInstance().isMessagePaused()) {
            this.c.a(false, !z10);
            this.b.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
        } else {
            this.c.a(true, !z10);
            this.b.setContentDescription(LocaleController.getString(R.string.AccActionPause));
        }
        if (this.M == playingMessageObject && i11 == 0) {
            return;
        }
        this.M = playingMessageObject;
        if (playingMessageObject.isVoice() || this.M.isRoundVideo()) {
            this.R = false;
            org.telegram.ui.ActionBar.w0 w0Var2 = this.B;
            if (w0Var2 != null) {
                w0Var2.setAlpha(1.0f);
                this.B.setEnabled(true);
            }
            this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.I, 0);
            spannableStringBuilder = new SpannableStringBuilder(a4.w.y(playingMessageObject.getMusicAuthor(), " ", playingMessageObject.getMusicTitle()));
            int i12 = 0;
            while (i12 < 2) {
                n10 n10Var = this.d;
                TextView textView = i12 == 0 ? n10Var.getTextView() : n10Var.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                }
                i12++;
            }
            q(false);
        } else {
            this.R = true;
            if (this.B == null) {
                this.d.setPadding(0, 0, this.I, 0);
            } else if (playingMessageObject.getDuration() >= 600.0d) {
                this.B.setAlpha(1.0f);
                this.B.setEnabled(true);
                this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.I, 0);
                q(false);
            } else {
                this.B.setAlpha(0.0f);
                this.B.setEnabled(false);
                this.d.setPadding(0, 0, this.I, 0);
            }
            spannableStringBuilder = new SpannableStringBuilder(a4.w.y(playingMessageObject.getMusicAuthor(), " - ", playingMessageObject.getMusicTitle()));
            int i13 = 0;
            while (i13 < 2) {
                n10 n10Var2 = this.d;
                TextView textView2 = i13 == 0 ? n10Var2.getTextView() : n10Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                }
                i13++;
            }
        }
        spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.t7, this.l0)), 0, playingMessageObject.getMusicAuthor().length(), 18);
        this.d.b(spannableStringBuilder, !z10 && z11 && this.R);
    }

    public cd getCapsuleBlobDrawable() {
        return this.a;
    }

    public int getCurrentStyle() {
        return this.P;
    }

    public int getStyleHeight() {
        return this.P == 4 ? 48 : 36;
    }

    public float getTopPadding() {
        return this.N;
    }

    public final void h() {
        if (this.B != null) {
            return;
        }
        Context context = getContext();
        int i10 = org.telegram.ui.ActionBar.g6.j5;
        org.telegram.ui.ActionBar.c6 c6Var = this.l0;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), false, this.l0);
        this.B = w0Var;
        w0Var.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        int i11 = 0;
        this.B.setLongClickEnabled(false);
        this.B.setVisibility(8);
        this.B.setTag(null);
        this.B.setShowSubmenuByMove(false);
        this.B.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.B.setDelegate(new f10(this));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.B;
        cf.f fVar = new cf.f();
        this.C = fVar;
        w0Var2.setIcon(fVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), c6Var);
        this.D = c1Var;
        c1Var.setRoundRadiusDp(6.0f);
        this.D.setDrawShadow(true);
        this.D.setOnValueChange(new d(this, 13));
        org.telegram.ui.ActionBar.u0 u10 = this.B.u(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        org.telegram.ui.ActionBar.u0[] u0VarArr = this.E;
        u0VarArr[0] = u10;
        u0VarArr[1] = this.B.u(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        u0VarArr[2] = this.B.u(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        u0VarArr[3] = this.B.u(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        u0VarArr[4] = this.B.u(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        u0VarArr[5] = this.B.u(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            this.B.setPadding(0, 1, 0, 0);
        }
        this.B.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        addView(this.B, i7.f6.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.B.setOnClickListener(new t2(21, this, fArr));
        this.B.setOnLongClickListener(new i10(this, i11));
        q(false);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        int i10 = this.P;
        if ((i10 == 3 || i10 == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(LocationController.SharingLocationInfo sharingLocationInfo) {
        if (sharingLocationInfo != null) {
            org.telegram.ui.ActionBar.o2 o2Var = this.h;
            if (o2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) o2Var.getParentActivity();
                launchActivity.K0(sharingLocationInfo.messageObject.currentAccount);
                org.telegram.ui.rc0 rc0Var = new org.telegram.ui.rc0(2);
                rc0Var.u0(sharingLocationInfo.messageObject);
                rc0Var.B0 = new f3.e(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 5);
                launchActivity.p0(rc0Var);
            }
        }
    }

    public final void l(float f9, float f10, boolean z10) {
        String formatString;
        int i10;
        if (i(f9, f10)) {
            return;
        }
        if (Math.abs(f10 - 1.0f) < 0.05f) {
            if (f9 < f10) {
                return;
            }
            formatString = LocaleController.getString(R.string.AudioSpeedNormal);
            i10 = Math.abs(f9 - 2.0f) < 0.05f ? R.raw.speed_2to1 : f10 < f9 ? R.raw.speed_slow : R.raw.speed_fast;
        } else if (z10 && i(f10, 1.5f) && i(f9, 1.0f)) {
            formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, cf.f.a(f10));
            i10 = R.raw.speed_1to15;
        } else if (z10 && i(f10, 2.0f) && i(f9, 1.5f)) {
            formatString = LocaleController.getString(R.string.AudioSpeedFast);
            i10 = R.raw.speed_15to2;
        } else {
            formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, cf.f.a(f10));
            i10 = f10 < 1.0f ? R.raw.speed_slow : R.raw.speed_fast;
        }
        tc.a0(this.h).Q(i10, 36, formatString).j();
    }

    public final void m() {
        org.telegram.ui.Components.voip.h hVar = this.J;
        if (hVar == null || hVar.g < 1.0f) {
            this.A0 = true;
        } else {
            this.A0 = false;
            AndroidUtilities.runOnUIThread(new j10(this, 0), 150L);
        }
    }

    public final void n(boolean z10) {
        ChatObject.Call call;
        int i10;
        TLRPC.User user;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.T.a.f) != null) {
            valueAnimator.cancel();
            this.T.a.f = null;
        }
        g9 g9Var = this.T.a;
        if (g9Var.f != null) {
            g9Var.g = true;
            return;
        }
        int i11 = this.P;
        int i12 = this.i0;
        ug ugVar = this.n;
        if (i11 == 4) {
            if (ugVar != null) {
                call = ugVar.getGroupCall();
                i12 = this.h.getCurrentAccount();
            } else {
                call = null;
            }
            i10 = i12;
            user = null;
        } else if (VoIPService.getSharedInstance() != null) {
            call = VoIPService.getSharedInstance().groupCall;
            user = ugVar != null ? null : VoIPService.getSharedInstance().getUser();
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
                    this.T.b(i13, call.sortedParticipants.get(i13), i10);
                } else {
                    this.T.b(i13, null, i10);
                }
            }
        } else if (user != null) {
            this.T.b(0, user, i10);
            for (int i14 = 1; i14 < 3; i14++) {
                this.T.b(i14, null, i10);
            }
        } else {
            for (int i15 = 0; i15 < 3; i15++) {
                this.T.b(i15, null, i10);
            }
        }
        this.T.a(z10);
        if (this.P != 4 || call == null) {
            return;
        }
        int min = call.call.rtmp_stream ? 0 : Math.min(3, call.sortedParticipants.size());
        int f9 = (min == 0 ? 10 : com.google.android.recaptcha.internal.a.f(min, 1, 24, 52)) + 3;
        if (z10) {
            int i16 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
            if (AndroidUtilities.dp(f9) != i16) {
                float translationX = (this.d.getTranslationX() + i16) - AndroidUtilities.dp(r3);
                this.d.setTranslationX(translationX);
                this.e.setTranslationX(translationX);
                ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                jr jrVar = jr.f;
                duration.setInterpolator(jrVar);
                this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(jrVar);
            }
        } else {
            this.d.animate().cancel();
            this.e.animate().cancel();
            this.d.setTranslationX(0.0f);
            this.e.setTranslationX(0.0f);
        }
        float f10 = f9;
        this.d.setLayoutParams(i7.f6.d(-1, 20.0f, 51, f10, 5.0f, call.isScheduled() ? 90 : 36, 0.0f));
        this.e.setLayoutParams(i7.f6.d(-1, 20.0f, 51, f10, 25.0f, call.isScheduled() ? 90 : 36, 0.0f));
    }

    public final void o() {
        ChatObject.Call call;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i10 = this.P;
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
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < Math.min(3, sharedInstance.groupCall.sortedParticipants.size()); i11++) {
                        if (i11 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(DialogObject.getShortName(sharedInstance.getAccount(), DialogObject.getPeerDialogId(sharedInstance.groupCall.sortedParticipants.get(i11).peer)));
                    }
                    if (sharedInstance.groupCall.sortedParticipants.size() > 3) {
                        sb2.append(" ");
                        sb2.append(LocaleController.formatPluralString("AndOther", sharedInstance.groupCall.sortedParticipants.size() - 3, new Object[0]));
                    }
                    this.d.b(sb2.toString(), false);
                    return;
                }
                TLRPC.Chat chat = sharedInstance.getChat();
                ug ugVar = this.n;
                if (chat == null) {
                    if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (ugVar == null || ugVar.i() == null || ugVar.i().id != user.id) {
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
                if (ugVar == null || ugVar.g() == null || ugVar.g().id != sharedInstance.getChat().id) {
                    this.d.b(sharedInstance.getChat().title, false);
                    return;
                }
                TLRPC.Chat g10 = ugVar.g();
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
        if (this.j0) {
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
            if (lh.d1.S != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || w20.c()) {
                ug ugVar = this.n;
                if (ugVar != null && this.h.getSendMessagesHelper().getImportingHistory(ugVar.a()) != null && !j()) {
                    c(true);
                } else if (ugVar == null || ugVar.getGroupCall() == null || !ugVar.getGroupCall().shouldShowPanel() || w20.c() || j()) {
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
        int i11 = this.P;
        if (i11 == 3 || i11 == 1) {
            ArrayList arrayList = org.telegram.ui.ActionBar.g6.D0().l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            cd cdVar = this.a;
            if (!cdVar.u) {
                cdVar.u = true;
                cdVar.t = SystemClock.elapsedRealtime();
                jf.j.d().a(60, cdVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            if (this.K != z10 && this.x != null) {
                this.K = z10;
                this.y.N(z10 ? 15 : 29);
                xi0 xi0Var = this.y;
                xi0Var.L(xi0Var.f - 1, false, true);
                this.x.invalidate();
            }
        } else if (i11 == 4 && !this.g0) {
            this.g0 = true;
            this.h0.run();
        }
        if (this.O && this.N == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        this.y0 = 0.0f;
        this.z0 = 0.0f;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        boolean z11 = this.K;
        cd cdVar = this.a;
        if (z11 != z10) {
            this.K = z10;
            this.y.N(z10 ? 15 : 29);
            xi0 xi0Var = this.y;
            xi0Var.L(xi0Var.f - 1, false, true);
            this.x.invalidate();
            org.telegram.ui.ActionBar.g6.D0().c(this.O);
            cdVar.f(this.O);
        }
        if (this.K) {
            this.z0 = 0.0f;
            org.telegram.ui.ActionBar.g6.D0().a(0.0f);
            cdVar.d(0.0f);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.u0.c(this, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f = null;
        }
        if (this.g0) {
            AndroidUtilities.cancelRunOnUIThread(this.h0);
            this.g0 = false;
        }
        this.O = false;
        this.p0.unlock();
        this.N = 0.0f;
        if (this.j0) {
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
        int i11 = this.P;
        if (i11 == 3 || i11 == 1) {
            t10 D0 = org.telegram.ui.ActionBar.g6.D0();
            ArrayList arrayList = D0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                D0.d = D0.b;
                D0.b = null;
                D0.c = null;
            }
            cd cdVar = this.a;
            if (cdVar.u) {
                cdVar.u = false;
                jf.j.d().f(cdVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.B0 = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, AndroidUtilities.dp2(getStyleHeight()));
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.u0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.s == null) {
            return;
        }
        int i10 = this.P;
        if ((i10 == 1 || i10 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j10) {
            this.H0++;
            if (groupCallMessage.isOut()) {
                return;
            }
            this.G0.i(new q10(this.s, groupCallMessage), true);
        }
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onPopGroupCallMessage() {
        int i10 = this.H0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.H0 = i11;
            if (i11 == 0) {
                this.G0.i(null, true);
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.u0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        o();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public final void p() {
        t41[] t41VarArr;
        int i10 = !i(MediaController.getInstance().getPlaybackSpeed(this.R), 1.0f) ? org.telegram.ui.ActionBar.g6.Qh : org.telegram.ui.ActionBar.g6.x7;
        org.telegram.ui.ActionBar.c6 c6Var = this.l0;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        cf.f fVar = this.C;
        if (fVar != null) {
            ((n6) fVar.b).r(v02);
            Paint paint = (Paint) fVar.c;
            if (paint != null) {
                paint.setColor(v02);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.B;
        if (w0Var != null) {
            w0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(v02 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.w7, c6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.A;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.x7, c6Var), PorterDuff.Mode.MULTIPLY));
        }
        if (this.e != null) {
            int i11 = 0;
            while (i11 < 2) {
                n10 n10Var = this.e;
                TextView textView = i11 == 0 ? n10Var.getTextView() : n10Var.getNextTextView();
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.x7, c6Var));
                }
                i11++;
            }
        }
        n10 n10Var2 = this.d;
        if (n10Var2 != null) {
            Object tag = n10Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                int i12 = 0;
                while (i12 < 2) {
                    n10 n10Var3 = this.d;
                    TextView textView2 = i12 == 0 ? n10Var3.getTextView() : n10Var3.getNextTextView();
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(intValue, c6Var));
                        CharSequence text = textView2.getText();
                        if ((text instanceof Spanned) && (t41VarArr = (t41[]) ((Spanned) text).getSpans(0, text.length(), t41.class)) != null) {
                            for (t41 t41Var : t41VarArr) {
                                t41Var.b = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.t7, c6Var);
                            }
                        }
                    }
                    i12++;
                }
            }
        }
    }

    public final void q(boolean z10) {
        if (this.C == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.R);
        this.C.l(playbackSpeed, z10);
        p();
        boolean z11 = this.v0;
        int i10 = 0;
        this.v0 = false;
        while (true) {
            org.telegram.ui.ActionBar.u0[] u0VarArr = this.E;
            if (i10 >= u0VarArr.length) {
                this.D.d(playbackSpeed, z10);
                return;
            }
            org.telegram.ui.ActionBar.c6 c6Var = this.l0;
            if (z11 || Math.abs(playbackSpeed - I0[i10]) >= 0.05f) {
                org.telegram.ui.ActionBar.u0 u0Var = u0VarArr[i10];
                int i11 = org.telegram.ui.ActionBar.g6.E8;
                u0Var.a(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            } else {
                org.telegram.ui.ActionBar.u0 u0Var2 = u0VarArr[i10];
                int i12 = org.telegram.ui.ActionBar.g6.Qh;
                u0Var2.a(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
            }
            i10++;
        }
    }

    public final void r(int i10) {
        if (this.P == i10) {
            return;
        }
        b();
        int i11 = this.P;
        cd cdVar = this.a;
        if (i11 == 3 || i11 == 1) {
            t10 D0 = org.telegram.ui.ActionBar.g6.D0();
            ArrayList arrayList = D0.l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                D0.d = D0.b;
                D0.b = null;
                D0.c = null;
            }
            if (cdVar.u) {
                cdVar.u = false;
                jf.j.d().f(cdVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
            vd.k kVar = this.G0;
            if (kVar != null) {
                kVar.i(null, true);
            }
        }
        this.P = i10;
        this.r.setWillNotDraw(i10 != 4);
        if (i10 != 4) {
            this.c0 = false;
        }
        h9 h9Var = this.T;
        if (h9Var != null) {
            h9Var.setStyle(this.P);
            this.T.setLayoutParams(i7.f6.e(108, getStyleHeight(), 51));
        }
        this.r.setLayoutParams(i7.f6.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
        float f9 = this.N;
        if (f9 > 0.0f && f9 != AndroidUtilities.dp2(getStyleHeight())) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.l0;
        if (i10 == 6) {
            this.v.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            this.r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.nk, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ok, c6Var)}));
            this.r.setTag(null);
            this.e.setVisibility(8);
            this.H.setVisibility(8);
            this.A.setVisibility(8);
            this.b.setVisibility(8);
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.w.i();
            this.T.setVisibility(8);
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.A7));
            int i12 = 0;
            while (i12 < 2) {
                n10 n10Var = this.d;
                TextView textView = i12 == 0 ? n10Var.getTextView() : n10Var.getNextTextView();
                if (textView != null) {
                    textView.setGravity(19);
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A7, c6Var));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextSize(1, 15.0f);
                }
                i12++;
            }
            this.d.setLayoutParams(i7.f6.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            return;
        }
        if (i10 == 5) {
            this.v.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            this.r.setBackgroundColor(0);
            this.r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.v7));
            int i13 = 0;
            while (i13 < 2) {
                n10 n10Var2 = this.d;
                TextView textView2 = i13 == 0 ? n10Var2.getTextView() : n10Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setGravity(19);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.u7, c6Var));
                    textView2.setTypeface(Typeface.DEFAULT);
                    textView2.setTextSize(1, 15.0f);
                }
                i13++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.u7));
            this.e.setVisibility(8);
            this.H.setVisibility(8);
            this.A.setVisibility(8);
            this.b.setVisibility(8);
            this.x.setVisibility(8);
            this.T.setVisibility(8);
            this.w.setVisibility(0);
            this.w.d();
            this.A.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
            org.telegram.ui.ActionBar.w0 w0Var = this.B;
            if (w0Var != null) {
                w0Var.setVisibility(8);
                this.B.setTag(null);
            }
            this.d.setLayoutParams(i7.f6.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            return;
        }
        if (i10 == 0 || i10 == 2) {
            this.v.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            this.r.setBackgroundColor(0);
            this.r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.v7));
            this.e.setVisibility(8);
            this.H.setVisibility(8);
            this.A.setVisibility(0);
            this.b.setVisibility(0);
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.w.i();
            this.T.setVisibility(8);
            int i14 = 0;
            while (i14 < 2) {
                n10 n10Var3 = this.d;
                TextView textView3 = i14 == 0 ? n10Var3.getTextView() : n10Var3.getNextTextView();
                if (textView3 != null) {
                    textView3.setGravity(19);
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.u7, c6Var));
                    textView3.setTypeface(Typeface.DEFAULT);
                    textView3.setTextSize(1, 15.0f);
                }
                i14++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.u7));
            if (i10 == 6) {
                this.b.setLayoutParams(i7.f6.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(i7.f6.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                this.A.setVisibility(8);
                return;
            } else {
                if (i10 != 0) {
                    this.b.setLayoutParams(i7.f6.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(i7.f6.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.A.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                    return;
                }
                this.b.setLayoutParams(i7.f6.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(i7.f6.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                h();
                org.telegram.ui.ActionBar.w0 w0Var2 = this.B;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(0);
                    this.B.setTag(1);
                }
                this.A.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                return;
            }
        }
        if (i10 == 4) {
            this.v.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            this.r.setBackgroundColor(0);
            this.r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.v7));
            this.x.setVisibility(8);
            this.e.setVisibility(0);
            int i15 = 0;
            while (i15 < 2) {
                n10 n10Var4 = this.d;
                TextView textView4 = i15 == 0 ? n10Var4.getTextView() : n10Var4.getNextTextView();
                if (textView4 != null) {
                    textView4.setGravity(51);
                    textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.t7, c6Var));
                    textView4.setTypeface(AndroidUtilities.bold());
                    textView4.setTextSize(1, 15.0f);
                }
                i15++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.t7));
            this.d.setPadding(0, 0, this.I, 0);
            this.w.setVisibility(8);
            this.w.i();
            ug ugVar = this.n;
            this.T.setVisibility(!((ugVar == null || ugVar.getGroupCall() == null || ugVar.getGroupCall().call == null || !ugVar.getGroupCall().call.rtmp_stream) ? false : true) ? 0 : 8);
            if (this.T.getVisibility() != 8) {
                n(false);
            } else {
                this.d.setTranslationX(-AndroidUtilities.dp(36.0f));
                this.e.setTranslationX(-AndroidUtilities.dp(36.0f));
            }
            this.A.setVisibility(8);
            this.b.setVisibility(8);
            org.telegram.ui.ActionBar.w0 w0Var3 = this.B;
            if (w0Var3 != null) {
                w0Var3.setVisibility(8);
                this.B.setTag(null);
                return;
            }
            return;
        }
        if (i10 == 1 || i10 == 3) {
            this.v.setBackground(null);
            o();
            boolean hasRtmpStream = VoIPService.hasRtmpStream();
            this.T.setVisibility(!hasRtmpStream ? 0 : 8);
            if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (this.T.getVisibility() != 8) {
                n(false);
            } else {
                this.d.setTranslationX(0.0f);
                this.e.setTranslationX(0.0f);
            }
            this.x.setVisibility(!hasRtmpStream ? 0 : 8);
            boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            this.K = z10;
            this.y.N(z10 ? 15 : 29);
            xi0 xi0Var = this.y;
            xi0Var.L(xi0Var.f - 1, false, true);
            this.x.invalidate();
            this.r.setBackground(null);
            this.r.setBackgroundColor(0);
            this.w.setVisibility(8);
            this.w.i();
            ArrayList arrayList2 = org.telegram.ui.ActionBar.g6.D0().l;
            if (!arrayList2.contains(this)) {
                arrayList2.add(this);
            }
            if (!cdVar.u) {
                cdVar.u = true;
                cdVar.t = SystemClock.elapsedRealtime();
                jf.j.d().a(60, cdVar.F);
            }
            invalidate();
            int i16 = 0;
            while (i16 < 2) {
                n10 n10Var5 = this.d;
                TextView textView5 = i16 == 0 ? n10Var5.getTextView() : n10Var5.getNextTextView();
                if (textView5 != null) {
                    textView5.setGravity(19);
                    textView5.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A7, c6Var));
                    textView5.setTypeface(AndroidUtilities.bold());
                    textView5.setTextSize(1, 14.0f);
                }
                i16++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.A7));
            this.A.setVisibility(8);
            this.b.setVisibility(8);
            this.e.setVisibility(8);
            this.H.setVisibility(8);
            this.d.setLayoutParams(i7.f6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
            this.d.setPadding(AndroidUtilities.dp(88.0f), 0, AndroidUtilities.dp(88.0f) + this.I, 0);
            org.telegram.ui.ActionBar.w0 w0Var4 = this.B;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
                this.B.setTag(null);
            }
        }
    }

    public void setDelegate(r10 r10Var) {
        this.k0 = r10Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.D0 = z10;
    }

    public void setLeftMargin(float f9) {
        if (this.r == null) {
            this.F0 = f9;
            return;
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setTranslationX(f9);
        }
        aj0 aj0Var = this.w;
        if (aj0Var != null) {
            aj0Var.setTranslationX(f9);
        }
        n10 n10Var = this.d;
        if (n10Var != null) {
            n10Var.setTranslationX(f9);
        }
        n10 n10Var2 = this.e;
        if (n10Var2 != null) {
            n10Var2.setTranslationX(f9);
        }
        h9 h9Var = this.T;
        if (h9Var != null) {
            h9Var.setTranslationX(f9);
        }
    }

    public void setSupportsCalls(boolean z10) {
        this.S = z10;
    }

    public void setTopPadding(float f9) {
        this.N = f9;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        setTopPadding(this.N);
        if (i10 == 8) {
            this.B0 = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentContextView(Context context, org.telegram.ui.ActionBar.o2 o2Var, View view, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = new cd();
        this.E = new org.telegram.ui.ActionBar.u0[6];
        this.L = -1;
        this.P = -1;
        this.S = true;
        this.e0 = new n6(false, true, true, false);
        this.h0 = new l10(this);
        this.i0 = UserConfig.selectedAccount;
        this.n0 = -1;
        this.o0 = new lh.m7(this, 23);
        this.p0 = new AnimationNotificationsLocker();
        this.q0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.C0 = new Paint(1);
        this.E0 = 0;
        this.G0 = new vd.k(new f10(this), jr.h, 450L);
        this.H0 = 0;
        this.l0 = c6Var;
        this.h = o2Var;
        if (o2Var instanceof ug) {
            this.n = (ug) o2Var;
        }
        this.O = true;
        this.j0 = z10;
        if (view == null) {
            ((ViewGroup) o2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }
}
