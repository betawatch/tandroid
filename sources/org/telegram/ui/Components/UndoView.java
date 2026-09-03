package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.text.style.CharacterStyle;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jd1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
@Deprecated
/* loaded from: classes3.dex */
public class UndoView extends FrameLayout {
    public static final /* synthetic */ int b0 = 0;
    public final Paint B;
    public final RectF C;
    public long D;
    public int E;
    public String F;
    public int G;
    public int H;
    public ArrayList I;
    public Runnable J;
    public Runnable K;
    public long L;
    public float M;
    public boolean N;
    public final boolean O;
    public CharSequence P;
    public int Q;
    public final ShapeDrawable R;
    public final org.telegram.ui.ActionBar.g6 S;
    public int T;
    public StaticLayout U;
    public StaticLayout V;
    public float W;
    public int a;
    public float a0;
    public final org.telegram.ui.Cells.x1 b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final kj0 f;
    public final p9 h;
    public final LinearLayout n;
    public int r;
    public final org.telegram.ui.ActionBar.p2 s;
    public Object v;
    public Object w;
    public final int x;
    public final TextPaint y;

    public UndoView(Context context) {
        this(context, null, false, null);
    }

    public boolean a() {
        return true;
    }

    public final int c(int i10) {
        return org.telegram.ui.ActionBar.k6.v0(i10, this.S);
    }

    public final boolean d() {
        int i10;
        Object obj;
        int i11 = this.H;
        if (i11 == 11 || i11 == 24 || i11 == 6 || i11 == 3 || i11 == 5 || i11 == 13 || i11 == 14 || i11 == 74) {
            return true;
        }
        if ((i11 == 7 && MessagesController.getInstance(this.x).dialogFilters.isEmpty()) || (i10 = this.H) == 83 || i10 == 85) {
            return true;
        }
        return i10 == 88 && (obj = this.w) != null && ((Integer) obj).intValue() > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.M == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        float measuredHeight = (getMeasuredHeight() - this.a0) + AndroidUtilities.dp(9.0f);
        if (measuredHeight > 0.0f) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            super.dispatchDraw(canvas);
        }
        canvas.restore();
    }

    public void e(int i10, boolean z4) {
        if (getVisibility() == 0 && this.N) {
            this.v = null;
            this.w = null;
            this.N = false;
            Runnable runnable = this.J;
            if (runnable != null) {
                if (z4) {
                    runnable.run();
                }
                this.J = null;
            }
            Runnable runnable2 = this.K;
            if (runnable2 != null) {
                if (!z4) {
                    runnable2.run();
                }
                this.K = null;
            }
            int i11 = this.H;
            if (i11 == 0 || i11 == 1 || i11 == 95 || i11 == 26 || i11 == 27) {
                for (int i12 = 0; i12 < this.I.size(); i12++) {
                    long longValue = ((Long) this.I.get(i12)).longValue();
                    MessagesController messagesController = MessagesController.getInstance(this.x);
                    int i13 = this.H;
                    messagesController.removeDialogAction(longValue, i13 == 0 || i13 == 26, z4);
                    h(this.H, longValue);
                }
            }
            boolean z10 = this.O;
            if (i10 == 0) {
                setEnterOffset((z10 ? -1.0f : 1.0f) * (this.T + this.r));
                setVisibility(4);
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (i10 == 1) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z10 ? -1.0f : 1.0f) * (this.T + this.r)));
                animatorSet.setDuration(250L);
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.ALPHA, 0.0f));
                animatorSet.setDuration(180L);
            }
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.addListener(new pd0(this, 25));
            animatorSet.start();
        }
    }

    public final boolean f() {
        int i10 = this.H;
        return i10 == 12 || i10 == 15 || i10 == 24 || i10 == 74 || i10 == 83;
    }

    public final boolean g() {
        int i10 = this.H;
        return i10 == 6 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 8 || i10 == 87 || i10 == 9 || i10 == 10 || i10 == 13 || i10 == 14 || i10 == 19 || i10 == 20 || i10 == 21 || i10 == 22 || i10 == 23 || i10 == 30 || i10 == 31 || i10 == 32 || i10 == 102 || i10 == 33 || i10 == 34 || i10 == 35 || i10 == 36 || i10 == 74 || i10 == 37 || i10 == 38 || i10 == 39 || i10 == 40 || i10 == 42 || i10 == 43 || i10 == 77 || i10 == 44 || i10 == 78 || i10 == 79 || i10 == 100 || i10 == 101 || i10 == 83;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.R;
    }

    public Object getCurrentInfoObject() {
        return this.v;
    }

    public float getEnterOffset() {
        return this.a0;
    }

    public final void i() {
        org.telegram.ui.ActionBar.k6.w1(-115203550, this.R);
        this.b.setTextColor(-1);
        this.c.setTextColor(-1);
        kj0 kj0Var = this.f;
        kj0Var.h(-14540254, "info1");
        kj0Var.h(-14540254, "info2");
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.b.invalidate();
        this.f.invalidate();
    }

    public final void j(int i10, long j10, Runnable runnable) {
        k(j10, i10, null, null, runnable, null);
    }

    public void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        n(arrayList, i10, obj, obj2, runnable, runnable2);
    }

    public final void l(long j10, int i10, Runnable runnable, Runnable runnable2) {
        k(j10, i10, null, null, runnable, runnable2);
    }

    public final void m(long j10, Object obj, int i10) {
        k(j10, i10, obj, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x16fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x1721  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x180c  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x1760  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x170f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x089d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ArrayList arrayList, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        MovementMethod movementMethod;
        org.telegram.ui.Cells.x1 x1Var;
        String str;
        int i11;
        ImageView imageView;
        TextView textView;
        int i12;
        kj0 kj0Var;
        long j10;
        boolean z4;
        int dp;
        CharSequence replaceTags;
        int i13;
        int i14;
        CharSequence charSequence;
        int i15;
        CharSequence replaceTags2;
        String string;
        int i16;
        String str2;
        int i17;
        int i18;
        SpannableStringBuilder replaceTags3;
        int i19;
        int i20;
        if (!AndroidUtilities.shouldShowClipboardToast() && ((i20 = this.H) == 52 || i20 == 56 || i20 == 57 || i20 == 58 || i20 == 59 || i20 == 60 || i20 == 80 || i20 == 33)) {
            return;
        }
        Runnable runnable3 = this.J;
        if (runnable3 != null) {
            runnable3.run();
        }
        this.N = true;
        this.J = runnable;
        this.K = runnable2;
        this.I = arrayList;
        Long l10 = (Long) arrayList.get(0);
        long longValue = l10.longValue();
        this.H = i10;
        this.D = 5000L;
        this.v = obj;
        this.w = obj2;
        this.L = SystemClock.elapsedRealtime();
        String string2 = LocaleController.getString(R.string.UndoNoCaps);
        TextView textView2 = this.d;
        textView2.setText(string2);
        ImageView imageView2 = this.e;
        imageView2.setVisibility(0);
        kj0 kj0Var2 = this.f;
        kj0Var2.setPadding(0, 0, 0, 0);
        kj0Var2.setScaleX(1.0f);
        kj0Var2.setScaleY(1.0f);
        org.telegram.ui.Cells.x1 x1Var2 = this.b;
        x1Var2.setTextSize(1, 15.0f);
        p9 p9Var = this.h;
        p9Var.setVisibility(8);
        x1Var2.setGravity(51);
        TextView textView3 = this.c;
        ((FrameLayout.LayoutParams) textView3.getLayoutParams()).leftMargin = AndroidUtilities.dp(58.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x1Var2.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
        layoutParams.bottomMargin = 0;
        kj0Var2.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) kj0Var2.getLayoutParams();
        layoutParams2.gravity = 19;
        layoutParams2.bottomMargin = 0;
        layoutParams2.topMargin = 0;
        layoutParams2.leftMargin = AndroidUtilities.dp(3.0f);
        layoutParams2.width = AndroidUtilities.dp(54.0f);
        layoutParams2.height = -2;
        x1Var2.setMinHeight(0);
        if ((runnable == null && runnable2 == null) || i10 == 83) {
            setOnClickListener(new p51(this, 1));
            movementMethod = null;
            setOnTouchListener(null);
        } else {
            setOnClickListener(null);
            setOnTouchListener(new org.telegram.ui.ActionBar.s2(25));
            movementMethod = null;
        }
        x1Var2.setMovementMethod(movementMethod);
        boolean g10 = g();
        LinearLayout linearLayout = this.n;
        int i21 = this.x;
        int i22 = 36;
        if (g10) {
            if (i10 == 83) {
                textView3.setSingleLine(false);
                replaceTags = LocaleController.getString(R.string.SoundAdded);
                charSequence = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SoundAddedSubtitle), runnable);
                this.J = null;
                i14 = R.raw.sound_download;
                this.D = 4000L;
            } else if (i10 == 74) {
                textView3.setSingleLine(false);
                replaceTags = LocaleController.getString(R.string.ReportChatSent);
                charSequence = LocaleController.formatString("ReportSentInfo", R.string.ReportSentInfo, new Object[0]);
                i14 = R.raw.ic_admin;
                this.D = 4000L;
            } else {
                if (i10 == 34) {
                    TLRPC.User user = (TLRPC.User) obj;
                    if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                        i18 = 0;
                        replaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelInvitedUser", R.string.VoipChannelInvitedUser, UserObject.getFirstName(user)));
                    } else {
                        i18 = 0;
                        replaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupInvitedUser", R.string.VoipGroupInvitedUser, UserObject.getFirstName(user)));
                    }
                    z8 z8Var = new z8();
                    z8Var.u(AndroidUtilities.dp(12.0f));
                    z8Var.m(i21, user);
                    p9Var.e(user, z8Var);
                    p9Var.setVisibility(i18);
                    this.D = 3000L;
                    replaceTags = replaceTags3;
                } else if (i10 == 44) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj2;
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user2 = (TLRPC.User) obj;
                        replaceTags = ChatObject.isChannelOrGiga(chat) ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChannelUserJoined, UserObject.getFirstName(user2))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChatUserJoined, UserObject.getFirstName(user2)));
                    } else if (obj instanceof TLRPC.Chat) {
                        TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                        replaceTags = ChatObject.isChannelOrGiga(chat) ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChannelChatJoined, chat2.title)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChatChatJoined, chat2.title));
                    } else {
                        replaceTags = "";
                    }
                    z8 z8Var2 = new z8();
                    z8Var2.u(AndroidUtilities.dp(12.0f));
                    TLObject tLObject = (TLObject) obj;
                    z8Var2.j(i21, tLObject);
                    p9Var.e(tLObject, z8Var2);
                    p9Var.setVisibility(0);
                    this.D = 3000L;
                } else if (i10 == 37) {
                    z8 z8Var3 = new z8();
                    z8Var3.u(AndroidUtilities.dp(12.0f));
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj;
                        z8Var3.m(i21, user3);
                        p9Var.e(user3, z8Var3);
                        str2 = ContactsController.formatName(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj;
                        z8Var3.k(i21, chat3);
                        p9Var.e(chat3, z8Var3);
                        str2 = chat3.title;
                    }
                    if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                        i17 = 0;
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelUserChanged", R.string.VoipChannelUserChanged, str2));
                    } else {
                        i17 = 0;
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserChanged", R.string.VoipGroupUserChanged, str2));
                    }
                    p9Var.setVisibility(i17);
                    this.D = 3000L;
                } else {
                    if (i10 == 33) {
                        replaceTags = LocaleController.getString(R.string.VoipGroupCopyInviteLinkCopied);
                        int i23 = R.raw.voip_invite;
                        this.D = 3000L;
                        i14 = i23;
                        x1Var = x1Var2;
                    } else {
                        int i24 = 6;
                        if (i10 == 77) {
                            replaceTags = (CharSequence) obj;
                            i15 = R.raw.payment_success;
                            this.D = 5000L;
                            if (this.s == null || !(obj2 instanceof TLRPC.Message)) {
                                x1Var = x1Var2;
                            } else {
                                setOnTouchListener(null);
                                x1Var = x1Var2;
                                x1Var.setMovementMethod(null);
                                setOnClickListener(new rx0(i24, this, (TLRPC.Message) obj2));
                            }
                        } else {
                            x1Var = x1Var2;
                            if (i10 == 30) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeak", R.string.VoipGroupUserCantNowSpeak, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                i15 = R.raw.voip_muted;
                                this.D = 3000L;
                            } else if (i10 == 35) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeakForYou", R.string.VoipGroupUserCantNowSpeakForYou, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : ""));
                                i15 = R.raw.voip_muted;
                                this.D = 3000L;
                            } else if (i10 == 31) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeak", R.string.VoipGroupUserCanNowSpeak, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                i15 = R.raw.voip_unmuted;
                                this.D = 3000L;
                            } else if (i10 == 38) {
                                replaceTags = obj instanceof TLRPC.Chat ? AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupYouCanNowSpeakIn", R.string.VoipGroupYouCanNowSpeakIn, ((TLRPC.Chat) obj).title)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupYouCanNowSpeak));
                                i15 = R.raw.voip_allow_talk;
                                this.D = 3000L;
                            } else if (i10 == 42) {
                                replaceTags = ChatObject.isChannelOrGiga((TLRPC.Chat) obj) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundMuted)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundMuted));
                                i15 = R.raw.ic_mute;
                                this.D = 3000L;
                            } else if (i10 == 43) {
                                replaceTags = ChatObject.isChannelOrGiga((TLRPC.Chat) obj) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundUnmuted)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundUnmuted));
                                i15 = R.raw.ic_unmute;
                                this.D = 3000L;
                            } else {
                                int i25 = this.H;
                                int i26 = 39;
                                if (i25 != 39) {
                                    if (i25 == 100) {
                                        i26 = 39;
                                    } else {
                                        int i27 = 40;
                                        if (i25 != 40) {
                                            if (i25 == 101) {
                                                i27 = 40;
                                            } else if (i10 == 36) {
                                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeakForYou", R.string.VoipGroupUserCanNowSpeakForYou, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                                i15 = R.raw.voip_unmuted;
                                                this.D = 3000L;
                                            } else {
                                                if (i10 == 32 || i10 == 102) {
                                                    String firstName = obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title;
                                                    replaceTags = i10 == 102 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipConferenceKicked, firstName)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipGroupRemovedFromGroup, firstName));
                                                    i13 = R.raw.ic_ban;
                                                    this.D = 3000L;
                                                } else if (i10 == 9 || i10 == 10) {
                                                    TLRPC.User user4 = (TLRPC.User) obj;
                                                    replaceTags = i10 == 9 ? AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferChannelToast", R.string.EditAdminTransferChannelToast, UserObject.getFirstName(user4))) : AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferGroupToast", R.string.EditAdminTransferGroupToast, UserObject.getFirstName(user4)));
                                                    i13 = R.raw.contact_check;
                                                } else if (i10 == 8) {
                                                    replaceTags = LocaleController.formatString("NowInContacts", R.string.NowInContacts, UserObject.getFirstName((TLRPC.User) obj));
                                                    i14 = R.raw.contact_check;
                                                } else if (i10 == 87) {
                                                    replaceTags = LocaleController.formatString(R.string.ProxyAddedSuccess, new Object[0]);
                                                    i15 = R.raw.contact_check;
                                                } else if (i10 == 22) {
                                                    if (DialogObject.isUserDialog(longValue)) {
                                                        replaceTags = obj == null ? LocaleController.getString(R.string.MainProfilePhotoSetHint) : LocaleController.getString(R.string.MainProfileVideoSetHint);
                                                    } else {
                                                        TLRPC.Chat chat4 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-longValue));
                                                        replaceTags = (!ChatObject.isChannel(chat4) || chat4.megagroup) ? obj == null ? LocaleController.getString(R.string.MainGroupProfilePhotoSetHint) : LocaleController.getString(R.string.MainGroupProfileVideoSetHint) : obj == null ? LocaleController.getString(R.string.MainChannelProfilePhotoSetHint) : LocaleController.getString(R.string.MainChannelProfileVideoSetHint);
                                                    }
                                                    i15 = R.raw.contact_check;
                                                } else if (i10 == 23) {
                                                    replaceTags = LocaleController.getString(R.string.ChatWasMovedToMainList);
                                                    i15 = R.raw.contact_check;
                                                } else {
                                                    if (i10 == 6) {
                                                        replaceTags = LocaleController.getString(R.string.ArchiveHidden);
                                                        charSequence = LocaleController.getString(R.string.ArchiveHiddenInfo);
                                                        i14 = R.raw.chats_swipearchive;
                                                        i22 = 48;
                                                    } else {
                                                        if (i25 == 13) {
                                                            replaceTags = LocaleController.getString(R.string.QuizWellDone);
                                                            charSequence = LocaleController.getString(R.string.QuizWellDoneInfo);
                                                            i14 = R.raw.wallet_congrats;
                                                        } else if (i25 == 14) {
                                                            replaceTags = LocaleController.getString(R.string.QuizWrongAnswer);
                                                            charSequence = LocaleController.getString(R.string.QuizWrongAnswerInfo);
                                                            i14 = R.raw.wallet_science;
                                                        } else {
                                                            if (i10 == 7) {
                                                                replaceTags = LocaleController.getString(R.string.ArchivePinned);
                                                                string = MessagesController.getInstance(i21).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ArchivePinnedInfo) : null;
                                                                i16 = R.raw.chats_infotip;
                                                            } else if (i10 == 20 || i10 == 21) {
                                                                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                                                                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, x1Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, x1Var.getPaint().getFontMetricsInt());
                                                                this.a = dialogFilter.title_noanimate ? 26 : 0;
                                                                long j11 = longValue;
                                                                if (j11 != 0) {
                                                                    if (DialogObject.isEncryptedDialog(j11)) {
                                                                        j11 = org.telegram.messenger.y3.n(MessagesController.getInstance(i21), j11).user_id;
                                                                    }
                                                                    if (DialogObject.isUserDialog(j11)) {
                                                                        TLRPC.User user5 = MessagesController.getInstance(i21).getUser(Long.valueOf(j11));
                                                                        String firstName2 = UserObject.getFirstName(user5);
                                                                        if (UserObject.isUserSelf(user5)) {
                                                                            firstName2 = LocaleController.getString(R.string.SavedMessages);
                                                                        } else if (UserObject.isReplyUser(user5)) {
                                                                            firstName2 = LocaleController.getString(R.string.RepliesTitle);
                                                                        }
                                                                        replaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserAddedToExisting, firstName2, replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserRemovedFrom, firstName2, replaceAnimatedEmoji));
                                                                    } else {
                                                                        TLRPC.Chat chat5 = MessagesController.getInstance(i21).getChat(Long.valueOf(-j11));
                                                                        replaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatAddedToExisting, chat5.title, replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatRemovedFrom, chat5.title, replaceAnimatedEmoji));
                                                                    }
                                                                } else {
                                                                    replaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsAddedToExisting, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsRemovedFrom, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), replaceAnimatedEmoji));
                                                                }
                                                                CharSequence charSequence2 = replaceTags2;
                                                                i14 = i10 == 20 ? R.raw.folder_in : R.raw.folder_out;
                                                                replaceTags = charSequence2;
                                                                charSequence = null;
                                                                i22 = 36;
                                                            } else if (i10 == 19) {
                                                                replaceTags = this.P;
                                                                i15 = R.raw.ic_delete;
                                                            } else if (i10 == 82) {
                                                                replaceTags = LocaleController.getString(((MediaController.PhotoEntry) obj).isVideo ? R.string.AttachMediaVideoDeselected : R.string.AttachMediaPhotoDeselected);
                                                                charSequence = null;
                                                                i14 = 0;
                                                            } else if (i10 == 78 || i10 == 79) {
                                                                int intValue = ((Integer) obj).intValue();
                                                                replaceTags = i10 == 78 ? LocaleController.formatPluralString("PinnedDialogsCount", intValue, new Object[0]) : LocaleController.formatPluralString("UnpinnedDialogsCount", intValue, new Object[0]);
                                                                i15 = this.H == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                                                if (obj2 instanceof Integer) {
                                                                    this.D = ((Integer) obj2).intValue();
                                                                }
                                                            } else {
                                                                replaceTags = i10 == 3 ? LocaleController.getString(R.string.ChatArchived) : LocaleController.getString(R.string.ChatsArchived);
                                                                string = MessagesController.getInstance(i21).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ChatArchivedInfo) : null;
                                                                i16 = R.raw.chats_infotip;
                                                            }
                                                            i14 = i16;
                                                            charSequence = string;
                                                        }
                                                        i22 = 44;
                                                    }
                                                    x1Var.setText(replaceTags);
                                                    if (i14 == 0) {
                                                        kj0Var2.e(i14, i22, i22);
                                                        hj0 animatedDrawable = kj0Var2.getAnimatedDrawable();
                                                        animatedDrawable.h = false;
                                                        animatedDrawable.N(animatedDrawable.q());
                                                        kj0Var2.setVisibility(0);
                                                        kj0Var2.setProgress(0.0f);
                                                        kj0Var2.d();
                                                    } else {
                                                        kj0Var2.setVisibility(8);
                                                    }
                                                    if (charSequence == null) {
                                                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                                                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                                                        layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                                                        ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = AndroidUtilities.dp(8.0f);
                                                        textView3.setText(charSequence);
                                                        textView3.setVisibility(0);
                                                        x1Var.setTextSize(1, 14.0f);
                                                        x1Var.setTypeface(AndroidUtilities.bold());
                                                        i19 = 8;
                                                    } else {
                                                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                                                        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                                                        layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                                                        i19 = 8;
                                                        textView3.setVisibility(8);
                                                        x1Var.setTextSize(1, 15.0f);
                                                        x1Var.setTypeface(Typeface.DEFAULT);
                                                    }
                                                    linearLayout.setVisibility(i19);
                                                }
                                                i14 = i13;
                                                charSequence = null;
                                                i22 = 36;
                                                x1Var.setText(replaceTags);
                                                if (i14 == 0) {
                                                }
                                                if (charSequence == null) {
                                                }
                                                linearLayout.setVisibility(i19);
                                            }
                                        }
                                        String string3 = LocaleController.getString(i25 == i27 ? R.string.VoipGroupAudioRecordSaved : R.string.VoipGroupVideoRecordSaved);
                                        i15 = R.raw.voip_record_saved;
                                        this.D = 4000L;
                                        x1Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
                                        int indexOf = string3.indexOf("**");
                                        int lastIndexOf = string3.lastIndexOf("**");
                                        if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                                            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                                            try {
                                                spannableStringBuilder.setSpan(new l51("tg://openmessage?user_id=" + UserConfig.getInstance(i21).getClientUserId()), indexOf, lastIndexOf - 2, 33);
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                            }
                                        }
                                        replaceTags = spannableStringBuilder;
                                        i22 = 36;
                                    }
                                }
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i25 == i26 ? R.string.VoipGroupAudioRecordStarted : R.string.VoipGroupVideoRecordStarted));
                                i13 = R.raw.voip_record_start;
                                this.D = 3000L;
                                i14 = i13;
                                charSequence = null;
                                i22 = 36;
                                x1Var.setText(replaceTags);
                                if (i14 == 0) {
                                }
                                if (charSequence == null) {
                                }
                                linearLayout.setVisibility(i19);
                            }
                        }
                        i14 = i15;
                    }
                    charSequence = null;
                    x1Var.setText(replaceTags);
                    if (i14 == 0) {
                    }
                    if (charSequence == null) {
                    }
                    linearLayout.setVisibility(i19);
                }
                x1Var = x1Var2;
                charSequence = null;
                i14 = 0;
                x1Var.setText(replaceTags);
                if (i14 == 0) {
                }
                if (charSequence == null) {
                }
                linearLayout.setVisibility(i19);
            }
            x1Var = x1Var2;
            x1Var.setText(replaceTags);
            if (i14 == 0) {
            }
            if (charSequence == null) {
            }
            linearLayout.setVisibility(i19);
        } else {
            x1Var = x1Var2;
            int i28 = this.H;
            if (i28 == 45 || i28 == 46 || i28 == 47 || i28 == 52 || i28 == 53 || i28 == 54 || i28 == 55 || i28 == 56 || i28 == 57 || i28 == 58 || i28 == 59 || i28 == 60 || i28 == 71 || i28 == 70 || i28 == 75 || i28 == 76 || i28 == 41 || i28 == 78 || i28 == 79 || i28 == 61) {
                str = "";
                i11 = i21;
                imageView = imageView2;
                textView = textView2;
                i12 = 8;
            } else {
                if (i28 != 80) {
                    if (i28 == 24 || i28 == 25) {
                        str = "";
                        int intValue2 = ((Integer) obj).intValue();
                        TLRPC.User user6 = (TLRPC.User) obj2;
                        imageView2.setVisibility(8);
                        kj0Var2.setVisibility(0);
                        if (intValue2 != 0) {
                            x1Var.setTypeface(AndroidUtilities.bold());
                            x1Var.setTextSize(1, 14.0f);
                            kj0Var2.a.clear();
                            int i29 = org.telegram.ui.ActionBar.k6.Hi;
                            kj0Var2.h(c(i29), "BODY");
                            kj0Var2.h(c(i29), "Wibe Big");
                            kj0Var2.h(c(i29), "Wibe Big 3");
                            kj0Var2.h(c(i29), "Wibe Small");
                            x1Var.setText(LocaleController.getString(R.string.ProximityAlertSet));
                            kj0Var2.e(R.raw.ic_unmute, 28, 28);
                            textView3.setVisibility(0);
                            textView3.setSingleLine(false);
                            textView3.setMaxLines(3);
                            if (user6 != null) {
                                textView3.setText(LocaleController.formatString("ProximityAlertSetInfoUser", R.string.ProximityAlertSetInfoUser, UserObject.getFirstName(user6), LocaleController.formatDistance(intValue2, 2)));
                            } else {
                                textView3.setText(LocaleController.formatString("ProximityAlertSetInfoGroup2", R.string.ProximityAlertSetInfoGroup2, LocaleController.formatDistance(intValue2, 2)));
                            }
                            linearLayout.setVisibility(8);
                            layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        } else {
                            x1Var.setTypeface(Typeface.DEFAULT);
                            x1Var.setTextSize(1, 15.0f);
                            kj0Var2.a.clear();
                            int i30 = org.telegram.ui.ActionBar.k6.Hi;
                            kj0Var2.h(c(i30), "Body Main");
                            kj0Var2.h(c(i30), "Body Top");
                            kj0Var2.h(c(i30), "Line");
                            kj0Var2.h(c(i30), "Curve Big");
                            kj0Var2.h(c(i30), "Curve Small");
                            layoutParams.topMargin = AndroidUtilities.dp(14.0f);
                            x1Var.setText(LocaleController.getString(R.string.ProximityAlertCancelled));
                            kj0Var2.e(R.raw.ic_mute, 28, 28);
                            textView3.setVisibility(8);
                            textView2.setTextColor(c(org.telegram.ui.ActionBar.k6.Gi));
                            linearLayout.setVisibility(0);
                        }
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        kj0Var2.setProgress(0.0f);
                        kj0Var2.d();
                    } else if (i28 == 11) {
                        x1Var.setText(LocaleController.getString(R.string.AuthAnotherClientOk));
                        kj0Var2.e(R.raw.contact_check, 36, 36);
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        textView3.setText(((TLRPC.TL_authorization) obj).app_name);
                        textView3.setVisibility(0);
                        x1Var.setTextSize(1, 14.0f);
                        x1Var.setTypeface(AndroidUtilities.bold());
                        textView2.setTextColor(c(org.telegram.ui.ActionBar.k6.p7));
                        imageView2.setVisibility(8);
                        linearLayout.setVisibility(0);
                        kj0Var2.setVisibility(0);
                        kj0Var2.setProgress(0.0f);
                        kj0Var2.d();
                    } else if (i28 == 15) {
                        this.D = 10000L;
                        textView2.setText(LocaleController.getString(R.string.Open));
                        x1Var.setText(LocaleController.getString(R.string.FilterAvailableTitle));
                        kj0Var2.e(R.raw.filter_new, 36, 36);
                        int dp2 = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.rightMargin = dp2;
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = dp2;
                        String string4 = LocaleController.getString(R.string.FilterAvailableText);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string4);
                        int indexOf2 = string4.indexOf(42);
                        int lastIndexOf2 = string4.lastIndexOf(42);
                        if (indexOf2 >= 0 && lastIndexOf2 >= 0 && indexOf2 != lastIndexOf2) {
                            spannableStringBuilder2.replace(lastIndexOf2, lastIndexOf2 + 1, (CharSequence) "");
                            spannableStringBuilder2.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
                            spannableStringBuilder2.setSpan(new l51("tg://settings/folders"), indexOf2, lastIndexOf2 - 1, 33);
                        }
                        textView3.setText(spannableStringBuilder2);
                        textView3.setVisibility(0);
                        textView3.setSingleLine(false);
                        textView3.setMaxLines(2);
                        linearLayout.setVisibility(0);
                        imageView2.setVisibility(8);
                        kj0Var2.setVisibility(0);
                        kj0Var2.setProgress(0.0f);
                        kj0Var2.d();
                    } else if (i28 == 16 || i28 == 17) {
                        str = "";
                        this.D = 4000L;
                        x1Var.setTextSize(1, 14.0f);
                        x1Var.setGravity(16);
                        x1Var.setMinHeight(AndroidUtilities.dp(30.0f));
                        String str3 = (String) obj;
                        if ("🎲".equals(str3)) {
                            x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DiceInfo2)));
                            kj0Var2.setImageResource(R.drawable.dice);
                        } else {
                            if ("🎯".equals(str3)) {
                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DartInfo)));
                            } else {
                                String serverString = LocaleController.getServerString("DiceEmojiInfo_" + str3);
                                if (TextUtils.isEmpty(serverString)) {
                                    x1Var.setText(Emoji.replaceEmoji(LocaleController.formatString("DiceEmojiInfo", R.string.DiceEmojiInfo, str3), x1Var.getPaint().getFontMetricsInt(), false));
                                } else {
                                    x1Var.setText(Emoji.replaceEmoji(serverString, x1Var.getPaint().getFontMetricsInt(), false));
                                }
                            }
                            kj0Var2.setImageDrawable(Emoji.getEmojiDrawable(str3));
                            kj0Var2.setScaleType(ImageView.ScaleType.FIT_XY);
                            layoutParams.topMargin = AndroidUtilities.dp(14.0f);
                            layoutParams.bottomMargin = AndroidUtilities.dp(14.0f);
                            layoutParams2.leftMargin = AndroidUtilities.dp(14.0f);
                            layoutParams2.width = AndroidUtilities.dp(26.0f);
                            layoutParams2.height = AndroidUtilities.dp(26.0f);
                        }
                        textView2.setText(LocaleController.getString(R.string.SendDice));
                        if (this.H == 16) {
                            dp = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                            textView2.setVisibility(0);
                            textView2.setTextColor(c(org.telegram.ui.ActionBar.k6.Gi));
                            imageView2.setVisibility(8);
                            linearLayout.setVisibility(0);
                        } else {
                            dp = AndroidUtilities.dp(8.0f);
                            textView2.setVisibility(8);
                            linearLayout.setVisibility(8);
                        }
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.rightMargin = dp;
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        layoutParams.bottomMargin = AndroidUtilities.dp(7.0f);
                        layoutParams.height = -1;
                        textView3.setVisibility(8);
                        kj0Var2.setVisibility(0);
                    } else if (i28 == 18) {
                        this.D = Math.max(4000, Math.min((r0.length() / 50) * 1600, 10000));
                        x1Var.setTextSize(1, 14.0f);
                        x1Var.setGravity(16);
                        x1Var.setText((CharSequence) obj);
                        textView2.setVisibility(8);
                        linearLayout.setVisibility(8);
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        layoutParams.bottomMargin = AndroidUtilities.dp(7.0f);
                        layoutParams.height = -1;
                        layoutParams2.gravity = 51;
                        int dp3 = AndroidUtilities.dp(8.0f);
                        layoutParams2.bottomMargin = dp3;
                        layoutParams2.topMargin = dp3;
                        kj0Var2.setVisibility(0);
                        kj0Var2.e(R.raw.chats_infotip, 36, 36);
                        kj0Var2.setProgress(0.0f);
                        kj0Var2.d();
                        x1Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    } else if (i28 == 12) {
                        x1Var.setText(LocaleController.getString(R.string.ColorThemeChanged));
                        kj0Var2.setImageResource(R.drawable.toast_pallete);
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.rightMargin = AndroidUtilities.dp(48.0f);
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = AndroidUtilities.dp(48.0f);
                        String string5 = LocaleController.getString(R.string.ColorThemeChangedInfo);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string5);
                        int indexOf3 = string5.indexOf(42);
                        int lastIndexOf3 = string5.lastIndexOf(42);
                        if (indexOf3 >= 0 && lastIndexOf3 >= 0 && indexOf3 != lastIndexOf3) {
                            spannableStringBuilder3.replace(lastIndexOf3, lastIndexOf3 + 1, (CharSequence) "");
                            spannableStringBuilder3.replace(indexOf3, indexOf3 + 1, (CharSequence) "");
                            spannableStringBuilder3.setSpan(new l51("tg://settings/themes"), indexOf3, lastIndexOf3 - 1, 33);
                        }
                        textView3.setText(spannableStringBuilder3);
                        textView3.setVisibility(0);
                        textView3.setSingleLine(false);
                        textView3.setMaxLines(2);
                        textView2.setVisibility(8);
                        linearLayout.setVisibility(0);
                        kj0Var2.setVisibility(0);
                    } else {
                        str = "";
                        if (i28 == 84) {
                            x1Var.setVisibility(0);
                            x1Var.setTextSize(1, 15.0f);
                            x1Var.setTypeface(Typeface.DEFAULT);
                            x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumTranscriptionHint)));
                            kj0Var2.setVisibility(0);
                            kj0Var2.e(R.raw.voice_to_text, 36, 36);
                            kj0Var2.setProgress(0.0f);
                            kj0Var2.d();
                            layoutParams.leftMargin = org.telegram.ui.b.e(58.0f, R.string.PremiumMore, textView2);
                            layoutParams.rightMargin = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                            int dp4 = AndroidUtilities.dp(6.0f);
                            layoutParams.bottomMargin = dp4;
                            layoutParams.topMargin = dp4;
                            layoutParams.height = -2;
                            p9Var.setVisibility(8);
                            textView3.setVisibility(8);
                            textView2.setVisibility(0);
                            linearLayout.setVisibility(0);
                            imageView2.setVisibility(8);
                        } else if (i28 == 85) {
                            x1Var.setVisibility(0);
                            x1Var.setTextSize(1, 15.0f);
                            x1Var.setTypeface(AndroidUtilities.bold());
                            x1Var.setText(LocaleController.getString(R.string.SwipeToReplyHint));
                            kj0Var2.setVisibility(0);
                            kj0Var2.e(R.raw.hint_swipe_reply, 64, 64);
                            kj0Var2.setProgress(0.0f);
                            kj0Var2.d();
                            textView3.setVisibility(0);
                            layoutParams.leftMargin = org.telegram.ui.b.e(58.0f, R.string.SwipeToReplyHintMessage, textView3);
                            layoutParams.rightMargin = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                            layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                            layoutParams.height = -2;
                            p9Var.setVisibility(8);
                            linearLayout.setVisibility(8);
                        } else if (i28 == 90 || i28 == 91 || i28 == 92 || i28 == 93 || i28 == 94) {
                            switch (i28) {
                                case 90:
                                    x1Var.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) hg.p0.f(), new Object[0]));
                                    break;
                                case 91:
                                    x1Var.setText(LocaleController.getString(R.string.BoostingSelectUpToWarningUsers));
                                    break;
                                case 92:
                                    x1Var.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]));
                                    break;
                                case 93:
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0])));
                                    break;
                                case 94:
                                    x1Var.setText(LocaleController.getString(R.string.BoostingOnlyRecipientCode));
                                    break;
                            }
                            layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                            x1Var.setTextSize(1, 15.0f);
                            linearLayout.setVisibility(8);
                            x1Var.setTypeface(Typeface.DEFAULT);
                            textView3.setVisibility(8);
                            kj0Var2.setVisibility(0);
                            kj0Var2.e(R.raw.chats_infotip, 36, 36);
                            kj0Var2.setProgress(0.0f);
                            kj0Var2.d();
                        } else if (i28 == 2 || i28 == 4) {
                            if (i10 == 2) {
                                x1Var.setText(LocaleController.getString(R.string.ChatArchived));
                            } else {
                                x1Var.setText(LocaleController.getString(R.string.ChatsArchived));
                            }
                            layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                            layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                            layoutParams.rightMargin = 0;
                            x1Var.setTextSize(1, 15.0f);
                            linearLayout.setVisibility(0);
                            x1Var.setTypeface(Typeface.DEFAULT);
                            textView3.setVisibility(8);
                            kj0Var2.setVisibility(0);
                            kj0Var2.e(R.raw.chats_archived, 36, 36);
                            kj0Var2.setProgress(0.0f);
                            kj0Var2.d();
                        } else if (i10 == 82) {
                            layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            x1Var.setText(LocaleController.getString(photoEntry.isVideo ? R.string.AttachMediaVideoDeselected : R.string.AttachMediaPhotoDeselected));
                            linearLayout.setVisibility(0);
                            x1Var.setTextSize(1, 15.0f);
                            x1Var.setTypeface(Typeface.DEFAULT);
                            textView3.setVisibility(8);
                            p9Var.setVisibility(0);
                            p9Var.setRoundRadius(AndroidUtilities.dp(2.0f));
                            String str4 = photoEntry.thumbPath;
                            if (str4 != null) {
                                p9Var.f(str4, null, org.telegram.ui.ActionBar.k6.R4);
                            } else if (photoEntry.path != null) {
                                p9Var.p(photoEntry.orientation, photoEntry.invert, true);
                                if (photoEntry.isVideo) {
                                    p9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.k6.R4);
                                } else {
                                    p9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.k6.R4);
                                }
                            } else {
                                p9Var.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
                            }
                        } else {
                            layoutParams.leftMargin = AndroidUtilities.dp(45.0f);
                            layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                            layoutParams.rightMargin = 0;
                            x1Var.setTextSize(1, 15.0f);
                            linearLayout.setVisibility(0);
                            Typeface typeface = Typeface.DEFAULT;
                            x1Var.setTypeface(typeface);
                            textView3.setVisibility(8);
                            kj0Var2.setVisibility(8);
                            int i31 = this.H;
                            if (i31 == 88) {
                                String str5 = (String) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                if (intValue3 > 0) {
                                    int dp5 = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                                    layoutParams.leftMargin = AndroidUtilities.dp(48.0f);
                                    layoutParams.rightMargin = dp5;
                                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView3.getLayoutParams();
                                    layoutParams3.leftMargin = AndroidUtilities.dp(48.0f);
                                    layoutParams3.rightMargin = dp5;
                                    x1Var.setText(LocaleController.formatString("FolderLinkDeletedTitle", R.string.FolderLinkDeletedTitle, str5));
                                    x1Var.setTypeface(AndroidUtilities.bold());
                                    textView3.setVisibility(0);
                                    textView3.setText(LocaleController.formatPluralString("FolderLinkDeletedSubtitle", intValue3, new Object[0]));
                                } else {
                                    x1Var.setTypeface(typeface);
                                    int i32 = R.string.FolderLinkDeleted;
                                    if (str5 == null) {
                                        str5 = str;
                                    }
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FolderLinkDeleted", i32, str5.replace('*', (char) 10033))));
                                }
                            } else if (i31 == 81 || i31 == 0 || i31 == 26) {
                                x1Var.setText(LocaleController.getString(R.string.HistoryClearedUndo));
                            } else if (i31 == 27) {
                                x1Var.setText(LocaleController.getString(R.string.ChatsDeletedUndo));
                            } else if (i31 == 95) {
                                if (DialogObject.isChatDialog(longValue)) {
                                    TLRPC.Chat chat6 = MessagesController.getInstance(i21).getChat(Long.valueOf(-longValue));
                                    if (ChatObject.isMonoForum(chat6)) {
                                        x1Var.setText(LocaleController.getString(R.string.MonoforumDeletedUndo));
                                    } else if (!ChatObject.isChannel(chat6) || chat6.megagroup) {
                                        x1Var.setText(LocaleController.getString(R.string.GroupLeftUndo));
                                    } else {
                                        x1Var.setText(LocaleController.getString(R.string.ChannelLeftUndo));
                                    }
                                } else {
                                    x1Var.setText(LocaleController.getString(R.string.ChatDeletedUndo));
                                }
                            } else if (DialogObject.isChatDialog(longValue)) {
                                TLRPC.Chat chat7 = MessagesController.getInstance(i21).getChat(Long.valueOf(-longValue));
                                if (ChatObject.isMonoForum(chat7)) {
                                    x1Var.setText(LocaleController.getString(R.string.MonoforumDeletedUndo));
                                } else if (!ChatObject.isChannel(chat7) || chat7.megagroup) {
                                    x1Var.setText(LocaleController.getString(R.string.GroupDeletedUndo));
                                } else {
                                    x1Var.setText(LocaleController.getString(R.string.ChannelDeletedUndo));
                                }
                            } else {
                                x1Var.setText(LocaleController.getString(R.string.ChatDeletedUndo));
                            }
                            if (this.H != 81) {
                                for (int i33 = 0; i33 < arrayList.size(); i33++) {
                                    MessagesController messagesController = MessagesController.getInstance(i21);
                                    long longValue2 = ((Long) arrayList.get(i33)).longValue();
                                    int i34 = this.H;
                                    messagesController.addDialogAction(longValue2, i34 == 0 || i34 == 26);
                                }
                            }
                        }
                    }
                    z4 = false;
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) x1Var.getText());
                    sb.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : str);
                    AndroidUtilities.makeAccessibilityAnnouncement(sb.toString());
                    if (f()) {
                        int measuredWidth = ((ViewGroup) getParent()).getMeasuredWidth();
                        if (measuredWidth == 0) {
                            measuredWidth = AndroidUtilities.displaySize.x;
                        }
                        measureChildWithMargins(textView3, org.telegram.ui.b.d(16.0f, measuredWidth, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                        this.r = AndroidUtilities.dp(37.0f) + textView3.getMeasuredHeight();
                    } else if (d()) {
                        this.r = AndroidUtilities.dp(52.0f);
                    } else if (getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) getParent();
                        int measuredWidth2 = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
                        if (measuredWidth2 <= 0) {
                            measuredWidth2 = AndroidUtilities.displaySize.x;
                        }
                        View view = x1Var;
                        measureChildWithMargins(view, org.telegram.ui.b.d(16.0f, measuredWidth2, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                        int measuredHeight = view.getMeasuredHeight();
                        int i35 = this.H;
                        int dp6 = AndroidUtilities.dp((i35 == 16 || i35 == 17 || i35 == 18 || i35 == 84 || i35 == 86) ? 14.0f : 28.0f) + measuredHeight;
                        this.r = dp6;
                        int i36 = this.H;
                        if (i36 == 18) {
                            this.r = Math.max(dp6, AndroidUtilities.dp(52.0f));
                        } else if (i36 == 25) {
                            this.r = Math.max(dp6, AndroidUtilities.dp(50.0f));
                        } else if (z4) {
                            this.r = dp6 - AndroidUtilities.dp(8.0f);
                        }
                    }
                    if (getVisibility() != 0) {
                        setVisibility(0);
                        setEnterOffset((this.O ? -1.0f : 1.0f) * (this.T + this.r));
                        AnimatorSet animatorSet = new AnimatorSet();
                        boolean z10 = this.O;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z10 ? -1.0f : 1.0f) * (this.T + this.r), z10 ? 1.0f : -1.0f));
                        animatorSet.setInterpolator(new DecelerateInterpolator());
                        animatorSet.setDuration(180L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                str = "";
                i11 = i21;
                imageView = imageView2;
                textView = textView2;
                i12 = 8;
            }
            imageView.setVisibility(i12);
            kj0Var2.setVisibility(0);
            x1Var.setTypeface(Typeface.DEFAULT);
            int i37 = this.H;
            long j12 = -1;
            if (i37 == 76) {
                x1Var.setText(LocaleController.getString(R.string.BroadcastGroupConvertSuccess));
                kj0Var2.e(R.raw.gigagroup_convert, 36, 36);
                layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                z4 = true;
                x1Var.setTextSize(1, 14.0f);
                kj0Var = kj0Var2;
                j10 = -1;
            } else {
                if (i37 == 75) {
                    x1Var.setText(LocaleController.getString(R.string.GigagroupConvertCancelHint));
                    kj0Var2.e(R.raw.chats_infotip, 36, 36);
                    layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                    x1Var.setTextSize(1, 14.0f);
                } else if (i10 == 70) {
                    int intValue4 = ((Integer) obj2).intValue();
                    textView3.setSingleLine(false);
                    x1Var.setText(LocaleController.formatString("AutoDeleteHintOnText", R.string.AutoDeleteHintOnText, LocaleController.formatTTLString(intValue4)));
                    kj0Var2.e(R.raw.fire_on, 36, 36);
                    layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                    this.D = 4000L;
                    kj0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                } else {
                    if (i37 == 71) {
                        x1Var.setText(LocaleController.getString(R.string.AutoDeleteHintOffText));
                        kj0Var2.e(R.raw.fire_off, 36, 36);
                        x1Var.setTextSize(1, 14.0f);
                        this.D = 3000L;
                        kj0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                    } else if (i37 == 45) {
                        x1Var.setText(LocaleController.getString(R.string.ImportMutualError));
                        kj0Var2.e(R.raw.error, 36, 36);
                        layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                        x1Var.setTextSize(1, 14.0f);
                    } else if (i37 == 46) {
                        x1Var.setText(LocaleController.getString(R.string.ImportNotAdmin));
                        kj0Var2.e(R.raw.error, 36, 36);
                        layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                        x1Var.setTextSize(1, 14.0f);
                    } else if (i37 == 47) {
                        x1Var.setText(LocaleController.getString(R.string.ImportedInfo));
                        kj0Var2.e(R.raw.imported, 36, 36);
                        kj0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(5.0f));
                        layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                        x1Var.setTextSize(1, 14.0f);
                    } else {
                        if (i37 == 52 || i37 == 56 || i37 == 57 || i37 == 58 || i37 == 59 || i37 == 60 || i37 == 80) {
                            kj0Var = kj0Var2;
                            if (!AndroidUtilities.shouldShowClipboardToast()) {
                                return;
                            }
                            int i38 = R.raw.copy;
                            int i39 = this.H;
                            if (i39 == 80) {
                                x1Var.setText(LocaleController.getString(R.string.EmailCopied));
                            } else if (i39 == 60) {
                                x1Var.setText(LocaleController.getString(R.string.PhoneCopied));
                            } else if (i39 == 56) {
                                x1Var.setText(LocaleController.getString(R.string.UsernameCopied));
                            } else if (i39 == 57) {
                                x1Var.setText(LocaleController.getString(R.string.HashtagCopied));
                            } else if (i39 == 52) {
                                x1Var.setText(LocaleController.getString(R.string.MessageCopied));
                            } else if (i39 == 59) {
                                i38 = R.raw.voip_invite;
                                x1Var.setText(LocaleController.getString(R.string.LinkCopied));
                            } else {
                                x1Var.setText(LocaleController.getString(R.string.TextCopied));
                            }
                            kj0Var.e(i38, 30, 30);
                            this.D = 3000L;
                            x1Var.setTextSize(1, 15.0f);
                        } else if (i37 == 54) {
                            x1Var.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOn));
                            kj0Var2.e(R.raw.silent_unmute, 30, 30);
                            this.D = 3000L;
                            x1Var.setTextSize(1, 15.0f);
                        } else if (i37 == 55) {
                            x1Var.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOff));
                            kj0Var2.e(R.raw.silent_mute, 30, 30);
                            this.D = 3000L;
                            x1Var.setTextSize(1, 15.0f);
                        } else if (i37 == 41) {
                            if (obj2 != null) {
                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                            } else if (longValue == UserConfig.getInstance(i11).clientUserId) {
                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages)));
                            } else if (DialogObject.isChatDialog(longValue)) {
                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(i11).getChat(Long.valueOf(-longValue)).title)));
                            } else {
                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(i11).getUser(l10)))));
                            }
                            kj0Var2.e(R.raw.contact_check, 36, 36);
                            this.D = 3000L;
                        } else if (i37 == 53) {
                            Integer num = (Integer) obj;
                            if (obj2 == null || (obj2 instanceof TLRPC.TL_forumTopic)) {
                                kj0Var = kj0Var2;
                                if (longValue == UserConfig.getInstance(i11).clientUserId) {
                                    if (num.intValue() == 1) {
                                        x1Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), new jc(17)));
                                    } else {
                                        x1Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), new jc(17)));
                                    }
                                    kj0Var.e(R.raw.saved_messages, 30, 30);
                                } else {
                                    if (DialogObject.isChatDialog(longValue)) {
                                        TLRPC.Chat chat8 = MessagesController.getInstance(i11).getChat(Long.valueOf(-longValue));
                                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                        String i40 = ChatObject.isMonoForum(chat8) ? bg.e.i(chat8, i11, false) : null;
                                        if (num.intValue() == 1) {
                                            int i41 = R.string.FwdMessageToGroup;
                                            if (i40 == null) {
                                                i40 = tL_forumTopic != null ? tL_forumTopic.title : chat8.title;
                                            }
                                            x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToGroup", i41, i40)));
                                        } else {
                                            int i42 = R.string.FwdMessagesToGroup;
                                            if (i40 == null) {
                                                i40 = tL_forumTopic != null ? tL_forumTopic.title : chat8.title;
                                            }
                                            x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToGroup", i42, i40)));
                                        }
                                    } else {
                                        TLRPC.User user7 = MessagesController.getInstance(i11).getUser(l10);
                                        if (num.intValue() == 1) {
                                            x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToUser", R.string.FwdMessageToUser, UserObject.getFirstName(user7))));
                                        } else {
                                            x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToUser", R.string.FwdMessagesToUser, UserObject.getFirstName(user7))));
                                        }
                                    }
                                    kj0Var.e(R.raw.forward, 30, 30);
                                    j12 = 300;
                                }
                            } else {
                                int intValue5 = ((Integer) obj2).intValue();
                                if (num.intValue() == 1) {
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", intValue5, new Object[0])));
                                } else {
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", intValue5, new Object[0])));
                                }
                                kj0Var2.e(R.raw.forward, 30, 30);
                                j12 = 300;
                                kj0Var = kj0Var2;
                            }
                            this.D = 3000L;
                        } else {
                            kj0Var = kj0Var2;
                            int i43 = i11;
                            if (i37 == 61) {
                                if (obj2 != null) {
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToChats", R.string.BackgroundToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                                    kj0Var.e(R.raw.forward, 30, 30);
                                } else if (longValue == UserConfig.getInstance(i43).clientUserId) {
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BackgroundToSavedMessages)));
                                    kj0Var.e(R.raw.saved_messages, 30, 30);
                                } else {
                                    if (DialogObject.isChatDialog(longValue)) {
                                        x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToGroup", R.string.BackgroundToGroup, MessagesController.getInstance(i43).getChat(Long.valueOf(-longValue)).title)));
                                    } else {
                                        x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToUser", R.string.BackgroundToUser, UserObject.getFirstName(MessagesController.getInstance(i43).getUser(l10)))));
                                    }
                                    kj0Var.e(R.raw.forward, 30, 30);
                                }
                                this.D = 3000L;
                            }
                        }
                        j10 = j12;
                        z4 = false;
                    }
                    kj0Var = kj0Var2;
                    j10 = j12;
                    z4 = false;
                }
                kj0Var = kj0Var2;
                j10 = -1;
                z4 = true;
            }
            textView3.setVisibility(8);
            textView.setTextColor(c(org.telegram.ui.ActionBar.k6.Gi));
            linearLayout.setVisibility(8);
            layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
            kj0Var.setProgress(0.0f);
            kj0Var.d();
            if (j10 > 0) {
                kj0Var.postDelayed(new nq0(this, 27), j10);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) x1Var.getText());
            if (textView3.getVisibility() == 0) {
            }
            sb2.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : str);
            AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
            if (f()) {
            }
            if (getVisibility() != 0) {
            }
        }
        str = "";
        z4 = false;
        StringBuilder sb22 = new StringBuilder();
        sb22.append((Object) x1Var.getText());
        if (textView3.getVisibility() == 0) {
        }
        sb22.append(textView3.getVisibility() == 0 ? ". " + ((Object) textView3.getText()) : str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb22.toString());
        if (f()) {
        }
        if (getVisibility() != 0) {
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10 = this.M;
        ShapeDrawable shapeDrawable = this.R;
        if (f10 != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.a0) + this.T + AndroidUtilities.dp(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i10 = this.H;
        if (i10 == 1 || i10 == 95 || i10 == 0 || i10 == 27 || i10 == 26 || i10 == 81 || i10 == 88) {
            int ceil = this.D > 0 ? (int) Math.ceil(r2 / 1000.0f) : 0;
            int i11 = this.E;
            TextPaint textPaint = this.y;
            if (i11 != ceil) {
                this.E = ceil;
                this.F = String.format("%d", Integer.valueOf(Math.max(1, ceil)));
                StaticLayout staticLayout = this.U;
                if (staticLayout != null) {
                    this.V = staticLayout;
                    this.W = 0.0f;
                }
                this.G = (int) Math.ceil(textPaint.measureText(r2));
                this.U = new StaticLayout(this.F, textPaint, ConnectionsManager.DEFAULT_DATACENTER_ID, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f11 = this.W;
            if (f11 < 1.0f) {
                float f12 = f11 + 0.10666667f;
                this.W = f12;
                if (f12 > 1.0f) {
                    this.W = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.V;
            RectF rectF = this.C;
            if (staticLayout2 != null) {
                float f13 = this.W;
                if (f13 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f13) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.G / 2), (AndroidUtilities.dp(10.0f) * this.W) + AndroidUtilities.dp(17.2f));
                    this.V.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.U != null) {
                float f14 = this.W;
                if (f14 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f14));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.G / 2), org.telegram.ui.yh.c(1.0f, this.W, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(17.2f)));
                this.U.draw(canvas);
                if (this.W != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (this.D / 5000.0f) * (-360.0f), false, this.B);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.D - (elapsedRealtime - this.L);
        this.D = j10;
        this.L = elapsedRealtime;
        if (j10 <= 0) {
            e(this.Q, true);
        }
        if (this.H != 82) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.r, TLObject.FLAG_30));
        this.R.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f10) {
        if (this.M != f10) {
            this.M = f10;
            setTranslationY(((this.a0 - this.T) + AndroidUtilities.dp(8.0f)) - this.M);
            invalidate();
        }
    }

    public void setEnterOffset(float f10) {
        if (this.a0 != f10) {
            this.a0 = f10;
            setTranslationY(((f10 - this.T) + AndroidUtilities.dp(8.0f)) - this.M);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i10) {
        this.T = i10;
    }

    public void setHideAnimationType(int i10) {
        this.Q = i10;
    }

    public void setInfoText(CharSequence charSequence) {
        this.P = charSequence;
    }

    public UndoView(Context context, jd1 jd1Var) {
        this(context, jd1Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = 0;
        this.x = UserConfig.selectedAccount;
        this.H = -1;
        this.Q = 1;
        this.T = AndroidUtilities.dp(8.0f);
        this.W = 1.0f;
        this.S = g6Var;
        this.s = p2Var;
        this.O = z4;
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, context, g6Var);
        this.b = x1Var;
        x1Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Hi;
        x1Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        int i11 = org.telegram.ui.ActionBar.k6.Gi;
        x1Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        x1Var.setMovementMethod(new r51(this));
        addView(x1Var, k7.c6.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        textView.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        addView(textView, k7.c6.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        kj0 kj0Var = new kj0(context);
        this.f = kj0Var;
        kj0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.k6.Fi;
        kj0Var.h(org.telegram.ui.ActionBar.k6.v0(i12, g6Var) | (-16777216), "info1");
        kj0Var.h(org.telegram.ui.ActionBar.k6.v0(i12, g6Var) | (-16777216), "info2");
        kj0Var.h(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), "luc12");
        kj0Var.h(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), "luc11");
        kj0Var.h(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), "luc10");
        kj0Var.h(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), "luc9");
        kj0Var.h(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), "luc8");
        kj0Var.h(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), "luc7");
        kj0Var.h(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), "luc6");
        kj0Var.h(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), "luc5");
        kj0Var.h(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), "luc4");
        kj0Var.h(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), "luc3");
        kj0Var.h(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), "luc2");
        kj0Var.h(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), "luc1");
        kj0Var.h(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), "Oval");
        addView(kj0Var, k7.c6.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        p9 p9Var = new p9(context);
        this.h = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(p9Var, k7.c6.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.k6.Y(org.telegram.ui.ActionBar.k6.v0(i11, g6Var) & 587202559, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
        addView(linearLayout, k7.c6.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new p51(this, 0));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView, k7.c6.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        textView2.setText(LocaleController.getString(R.string.UndoNoCaps));
        linearLayout.addView(textView2, k7.c6.t(-2, -2, 19, 6, 4, 8, 4));
        this.C = new RectF(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(33.0f), AndroidUtilities.dp(33.0f));
        Paint paint = new Paint(1);
        this.B = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        TextPaint textPaint = new TextPaint(1);
        this.y = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        setWillNotDraw(false);
        this.R = org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
        setOnTouchListener(new org.telegram.ui.ActionBar.s2(24));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void h(int i10, long j10) {
    }
}
