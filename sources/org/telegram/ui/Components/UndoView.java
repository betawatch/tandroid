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
import org.telegram.ui.cd1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
    public final org.telegram.ui.ActionBar.f6 S;
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
    public final jj0 f;
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
        return org.telegram.ui.ActionBar.j6.v0(i10, this.S);
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
            animatorSet.addListener(new nd0(this, 25));
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
        org.telegram.ui.ActionBar.j6.w1(-115203550, this.R);
        this.b.setTextColor(-1);
        this.c.setTextColor(-1);
        jj0 jj0Var = this.f;
        jj0Var.h(-14540254, "info1");
        jj0Var.h(-14540254, "info2");
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
    /* JADX WARN: Removed duplicated region for block: B:420:0x16e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x1701  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x1726  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x1811  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x1765  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x1714  */
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
        boolean z4;
        jj0 jj0Var;
        long j10;
        int i13;
        int dp;
        CharSequence replaceTags;
        int i14;
        int i15;
        CharSequence charSequence;
        int i16;
        CharSequence replaceTags2;
        String string;
        int i17;
        String str2;
        int i18;
        int i19;
        SpannableStringBuilder replaceTags3;
        int i20;
        int i21;
        if (!AndroidUtilities.shouldShowClipboardToast() && ((i21 = this.H) == 52 || i21 == 56 || i21 == 57 || i21 == 58 || i21 == 59 || i21 == 60 || i21 == 80 || i21 == 33)) {
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
        jj0 jj0Var2 = this.f;
        jj0Var2.setPadding(0, 0, 0, 0);
        jj0Var2.setScaleX(1.0f);
        jj0Var2.setScaleY(1.0f);
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
        jj0Var2.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) jj0Var2.getLayoutParams();
        layoutParams2.gravity = 19;
        layoutParams2.bottomMargin = 0;
        layoutParams2.topMargin = 0;
        layoutParams2.leftMargin = AndroidUtilities.dp(3.0f);
        layoutParams2.width = AndroidUtilities.dp(54.0f);
        layoutParams2.height = -2;
        x1Var2.setMinHeight(0);
        if ((runnable == null && runnable2 == null) || i10 == 83) {
            setOnClickListener(new q51(this, 1));
            movementMethod = null;
            setOnTouchListener(null);
        } else {
            setOnClickListener(null);
            setOnTouchListener(new oh.d(26));
            movementMethod = null;
        }
        x1Var2.setMovementMethod(movementMethod);
        boolean g10 = g();
        LinearLayout linearLayout = this.n;
        int i22 = this.x;
        int i23 = 36;
        if (g10) {
            if (i10 == 83) {
                textView3.setSingleLine(false);
                replaceTags = LocaleController.getString(R.string.SoundAdded);
                charSequence = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SoundAddedSubtitle), runnable);
                this.J = null;
                i15 = R.raw.sound_download;
                this.D = 4000L;
            } else if (i10 == 74) {
                textView3.setSingleLine(false);
                replaceTags = LocaleController.getString(R.string.ReportChatSent);
                charSequence = LocaleController.formatString("ReportSentInfo", R.string.ReportSentInfo, new Object[0]);
                i15 = R.raw.ic_admin;
                this.D = 4000L;
            } else {
                if (i10 == 34) {
                    TLRPC.User user = (TLRPC.User) obj;
                    if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                        i19 = 0;
                        replaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelInvitedUser", R.string.VoipChannelInvitedUser, UserObject.getFirstName(user)));
                    } else {
                        i19 = 0;
                        replaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupInvitedUser", R.string.VoipGroupInvitedUser, UserObject.getFirstName(user)));
                    }
                    z8 z8Var = new z8();
                    z8Var.u(AndroidUtilities.dp(12.0f));
                    z8Var.m(i22, user);
                    p9Var.e(user, z8Var);
                    p9Var.setVisibility(i19);
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
                    z8Var2.j(i22, tLObject);
                    p9Var.e(tLObject, z8Var2);
                    p9Var.setVisibility(0);
                    this.D = 3000L;
                } else if (i10 == 37) {
                    z8 z8Var3 = new z8();
                    z8Var3.u(AndroidUtilities.dp(12.0f));
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj;
                        z8Var3.m(i22, user3);
                        p9Var.e(user3, z8Var3);
                        str2 = ContactsController.formatName(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj;
                        z8Var3.k(i22, chat3);
                        p9Var.e(chat3, z8Var3);
                        str2 = chat3.title;
                    }
                    if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                        i18 = 0;
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelUserChanged", R.string.VoipChannelUserChanged, str2));
                    } else {
                        i18 = 0;
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserChanged", R.string.VoipGroupUserChanged, str2));
                    }
                    p9Var.setVisibility(i18);
                    this.D = 3000L;
                } else {
                    if (i10 == 33) {
                        replaceTags = LocaleController.getString(R.string.VoipGroupCopyInviteLinkCopied);
                        int i24 = R.raw.voip_invite;
                        this.D = 3000L;
                        i15 = i24;
                        x1Var = x1Var2;
                    } else {
                        int i25 = 6;
                        if (i10 == 77) {
                            replaceTags = (CharSequence) obj;
                            i16 = R.raw.payment_success;
                            this.D = 5000L;
                            if (this.s == null || !(obj2 instanceof TLRPC.Message)) {
                                x1Var = x1Var2;
                            } else {
                                setOnTouchListener(null);
                                x1Var = x1Var2;
                                x1Var.setMovementMethod(null);
                                setOnClickListener(new rx0(i25, this, (TLRPC.Message) obj2));
                            }
                        } else {
                            x1Var = x1Var2;
                            if (i10 == 30) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeak", R.string.VoipGroupUserCantNowSpeak, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                i16 = R.raw.voip_muted;
                                this.D = 3000L;
                            } else if (i10 == 35) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeakForYou", R.string.VoipGroupUserCantNowSpeakForYou, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : ""));
                                i16 = R.raw.voip_muted;
                                this.D = 3000L;
                            } else if (i10 == 31) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeak", R.string.VoipGroupUserCanNowSpeak, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                i16 = R.raw.voip_unmuted;
                                this.D = 3000L;
                            } else if (i10 == 38) {
                                replaceTags = obj instanceof TLRPC.Chat ? AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupYouCanNowSpeakIn", R.string.VoipGroupYouCanNowSpeakIn, ((TLRPC.Chat) obj).title)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupYouCanNowSpeak));
                                i16 = R.raw.voip_allow_talk;
                                this.D = 3000L;
                            } else if (i10 == 42) {
                                replaceTags = ChatObject.isChannelOrGiga((TLRPC.Chat) obj) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundMuted)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundMuted));
                                i16 = R.raw.ic_mute;
                                this.D = 3000L;
                            } else if (i10 == 43) {
                                replaceTags = ChatObject.isChannelOrGiga((TLRPC.Chat) obj) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundUnmuted)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundUnmuted));
                                i16 = R.raw.ic_unmute;
                                this.D = 3000L;
                            } else {
                                int i26 = this.H;
                                int i27 = 39;
                                if (i26 != 39) {
                                    if (i26 == 100) {
                                        i27 = 39;
                                    } else {
                                        int i28 = 40;
                                        if (i26 != 40) {
                                            if (i26 == 101) {
                                                i28 = 40;
                                            } else if (i10 == 36) {
                                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeakForYou", R.string.VoipGroupUserCanNowSpeakForYou, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                                i16 = R.raw.voip_unmuted;
                                                this.D = 3000L;
                                            } else {
                                                if (i10 == 32 || i10 == 102) {
                                                    String firstName = obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title;
                                                    replaceTags = i10 == 102 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipConferenceKicked, firstName)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipGroupRemovedFromGroup, firstName));
                                                    i14 = R.raw.ic_ban;
                                                    this.D = 3000L;
                                                } else if (i10 == 9 || i10 == 10) {
                                                    TLRPC.User user4 = (TLRPC.User) obj;
                                                    replaceTags = i10 == 9 ? AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferChannelToast", R.string.EditAdminTransferChannelToast, UserObject.getFirstName(user4))) : AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferGroupToast", R.string.EditAdminTransferGroupToast, UserObject.getFirstName(user4)));
                                                    i14 = R.raw.contact_check;
                                                } else if (i10 == 8) {
                                                    replaceTags = LocaleController.formatString("NowInContacts", R.string.NowInContacts, UserObject.getFirstName((TLRPC.User) obj));
                                                    i15 = R.raw.contact_check;
                                                } else if (i10 == 87) {
                                                    replaceTags = LocaleController.formatString(R.string.ProxyAddedSuccess, new Object[0]);
                                                    i16 = R.raw.contact_check;
                                                } else if (i10 == 22) {
                                                    if (DialogObject.isUserDialog(longValue)) {
                                                        replaceTags = obj == null ? LocaleController.getString(R.string.MainProfilePhotoSetHint) : LocaleController.getString(R.string.MainProfileVideoSetHint);
                                                    } else {
                                                        TLRPC.Chat chat4 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-longValue));
                                                        replaceTags = (!ChatObject.isChannel(chat4) || chat4.megagroup) ? obj == null ? LocaleController.getString(R.string.MainGroupProfilePhotoSetHint) : LocaleController.getString(R.string.MainGroupProfileVideoSetHint) : obj == null ? LocaleController.getString(R.string.MainChannelProfilePhotoSetHint) : LocaleController.getString(R.string.MainChannelProfileVideoSetHint);
                                                    }
                                                    i16 = R.raw.contact_check;
                                                } else if (i10 == 23) {
                                                    replaceTags = LocaleController.getString(R.string.ChatWasMovedToMainList);
                                                    i16 = R.raw.contact_check;
                                                } else {
                                                    if (i10 == 6) {
                                                        replaceTags = LocaleController.getString(R.string.ArchiveHidden);
                                                        charSequence = LocaleController.getString(R.string.ArchiveHiddenInfo);
                                                        i15 = R.raw.chats_swipearchive;
                                                        i23 = 48;
                                                    } else {
                                                        if (i26 == 13) {
                                                            replaceTags = LocaleController.getString(R.string.QuizWellDone);
                                                            charSequence = LocaleController.getString(R.string.QuizWellDoneInfo);
                                                            i15 = R.raw.wallet_congrats;
                                                        } else if (i26 == 14) {
                                                            replaceTags = LocaleController.getString(R.string.QuizWrongAnswer);
                                                            charSequence = LocaleController.getString(R.string.QuizWrongAnswerInfo);
                                                            i15 = R.raw.wallet_science;
                                                        } else {
                                                            if (i10 == 7) {
                                                                replaceTags = LocaleController.getString(R.string.ArchivePinned);
                                                                string = MessagesController.getInstance(i22).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ArchivePinnedInfo) : null;
                                                                i17 = R.raw.chats_infotip;
                                                            } else if (i10 == 20 || i10 == 21) {
                                                                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                                                                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, x1Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, x1Var.getPaint().getFontMetricsInt());
                                                                this.a = dialogFilter.title_noanimate ? 26 : 0;
                                                                long j11 = longValue;
                                                                if (j11 != 0) {
                                                                    if (DialogObject.isEncryptedDialog(j11)) {
                                                                        j11 = org.telegram.messenger.y3.n(MessagesController.getInstance(i22), j11).user_id;
                                                                    }
                                                                    if (DialogObject.isUserDialog(j11)) {
                                                                        TLRPC.User user5 = MessagesController.getInstance(i22).getUser(Long.valueOf(j11));
                                                                        String firstName2 = UserObject.getFirstName(user5);
                                                                        if (UserObject.isUserSelf(user5)) {
                                                                            firstName2 = LocaleController.getString(R.string.SavedMessages);
                                                                        } else if (UserObject.isReplyUser(user5)) {
                                                                            firstName2 = LocaleController.getString(R.string.RepliesTitle);
                                                                        }
                                                                        replaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserAddedToExisting, firstName2, replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserRemovedFrom, firstName2, replaceAnimatedEmoji));
                                                                    } else {
                                                                        TLRPC.Chat chat5 = MessagesController.getInstance(i22).getChat(Long.valueOf(-j11));
                                                                        replaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatAddedToExisting, chat5.title, replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatRemovedFrom, chat5.title, replaceAnimatedEmoji));
                                                                    }
                                                                } else {
                                                                    replaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsAddedToExisting, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsRemovedFrom, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), replaceAnimatedEmoji));
                                                                }
                                                                CharSequence charSequence2 = replaceTags2;
                                                                i15 = i10 == 20 ? R.raw.folder_in : R.raw.folder_out;
                                                                replaceTags = charSequence2;
                                                                charSequence = null;
                                                                i23 = 36;
                                                            } else if (i10 == 19) {
                                                                replaceTags = this.P;
                                                                i16 = R.raw.ic_delete;
                                                            } else if (i10 == 82) {
                                                                replaceTags = LocaleController.getString(((MediaController.PhotoEntry) obj).isVideo ? R.string.AttachMediaVideoDeselected : R.string.AttachMediaPhotoDeselected);
                                                                charSequence = null;
                                                                i15 = 0;
                                                            } else if (i10 == 78 || i10 == 79) {
                                                                int intValue = ((Integer) obj).intValue();
                                                                replaceTags = i10 == 78 ? LocaleController.formatPluralString("PinnedDialogsCount", intValue, new Object[0]) : LocaleController.formatPluralString("UnpinnedDialogsCount", intValue, new Object[0]);
                                                                i16 = this.H == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                                                if (obj2 instanceof Integer) {
                                                                    this.D = ((Integer) obj2).intValue();
                                                                }
                                                            } else {
                                                                replaceTags = i10 == 3 ? LocaleController.getString(R.string.ChatArchived) : LocaleController.getString(R.string.ChatsArchived);
                                                                string = MessagesController.getInstance(i22).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ChatArchivedInfo) : null;
                                                                i17 = R.raw.chats_infotip;
                                                            }
                                                            i15 = i17;
                                                            charSequence = string;
                                                        }
                                                        i23 = 44;
                                                    }
                                                    x1Var.setText(replaceTags);
                                                    if (i15 == 0) {
                                                        jj0Var2.e(i15, i23, i23);
                                                        gj0 animatedDrawable = jj0Var2.getAnimatedDrawable();
                                                        animatedDrawable.h = false;
                                                        animatedDrawable.N(animatedDrawable.q());
                                                        jj0Var2.setVisibility(0);
                                                        jj0Var2.setProgress(0.0f);
                                                        jj0Var2.d();
                                                    } else {
                                                        jj0Var2.setVisibility(8);
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
                                                        i20 = 8;
                                                    } else {
                                                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                                                        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                                                        layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                                                        i20 = 8;
                                                        textView3.setVisibility(8);
                                                        x1Var.setTextSize(1, 15.0f);
                                                        x1Var.setTypeface(Typeface.DEFAULT);
                                                    }
                                                    linearLayout.setVisibility(i20);
                                                }
                                                i15 = i14;
                                                charSequence = null;
                                                i23 = 36;
                                                x1Var.setText(replaceTags);
                                                if (i15 == 0) {
                                                }
                                                if (charSequence == null) {
                                                }
                                                linearLayout.setVisibility(i20);
                                            }
                                        }
                                        String string3 = LocaleController.getString(i26 == i28 ? R.string.VoipGroupAudioRecordSaved : R.string.VoipGroupVideoRecordSaved);
                                        i16 = R.raw.voip_record_saved;
                                        this.D = 4000L;
                                        x1Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
                                        int indexOf = string3.indexOf("**");
                                        int lastIndexOf = string3.lastIndexOf("**");
                                        if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                                            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                                            try {
                                                spannableStringBuilder.setSpan(new m51("tg://openmessage?user_id=" + UserConfig.getInstance(i22).getClientUserId()), indexOf, lastIndexOf - 2, 33);
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                        }
                                        replaceTags = spannableStringBuilder;
                                        i23 = 36;
                                    }
                                }
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i26 == i27 ? R.string.VoipGroupAudioRecordStarted : R.string.VoipGroupVideoRecordStarted));
                                i14 = R.raw.voip_record_start;
                                this.D = 3000L;
                                i15 = i14;
                                charSequence = null;
                                i23 = 36;
                                x1Var.setText(replaceTags);
                                if (i15 == 0) {
                                }
                                if (charSequence == null) {
                                }
                                linearLayout.setVisibility(i20);
                            }
                        }
                        i15 = i16;
                    }
                    charSequence = null;
                    x1Var.setText(replaceTags);
                    if (i15 == 0) {
                    }
                    if (charSequence == null) {
                    }
                    linearLayout.setVisibility(i20);
                }
                x1Var = x1Var2;
                charSequence = null;
                i15 = 0;
                x1Var.setText(replaceTags);
                if (i15 == 0) {
                }
                if (charSequence == null) {
                }
                linearLayout.setVisibility(i20);
            }
            x1Var = x1Var2;
            x1Var.setText(replaceTags);
            if (i15 == 0) {
            }
            if (charSequence == null) {
            }
            linearLayout.setVisibility(i20);
        } else {
            x1Var = x1Var2;
            int i29 = this.H;
            if (i29 == 45 || i29 == 46 || i29 == 47 || i29 == 52 || i29 == 53 || i29 == 54 || i29 == 55 || i29 == 56 || i29 == 57 || i29 == 58 || i29 == 59 || i29 == 60 || i29 == 71 || i29 == 70 || i29 == 75 || i29 == 76 || i29 == 41 || i29 == 78 || i29 == 79 || i29 == 61) {
                str = "";
                i11 = i22;
                imageView = imageView2;
                textView = textView2;
                i12 = 8;
            } else {
                if (i29 != 80) {
                    if (i29 == 24 || i29 == 25) {
                        str = "";
                        int intValue2 = ((Integer) obj).intValue();
                        TLRPC.User user6 = (TLRPC.User) obj2;
                        imageView2.setVisibility(8);
                        jj0Var2.setVisibility(0);
                        if (intValue2 != 0) {
                            x1Var.setTypeface(AndroidUtilities.bold());
                            x1Var.setTextSize(1, 14.0f);
                            jj0Var2.a.clear();
                            int i30 = org.telegram.ui.ActionBar.j6.Hi;
                            jj0Var2.h(c(i30), "BODY");
                            jj0Var2.h(c(i30), "Wibe Big");
                            jj0Var2.h(c(i30), "Wibe Big 3");
                            jj0Var2.h(c(i30), "Wibe Small");
                            x1Var.setText(LocaleController.getString(R.string.ProximityAlertSet));
                            jj0Var2.e(R.raw.ic_unmute, 28, 28);
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
                            jj0Var2.a.clear();
                            int i31 = org.telegram.ui.ActionBar.j6.Hi;
                            jj0Var2.h(c(i31), "Body Main");
                            jj0Var2.h(c(i31), "Body Top");
                            jj0Var2.h(c(i31), "Line");
                            jj0Var2.h(c(i31), "Curve Big");
                            jj0Var2.h(c(i31), "Curve Small");
                            layoutParams.topMargin = AndroidUtilities.dp(14.0f);
                            x1Var.setText(LocaleController.getString(R.string.ProximityAlertCancelled));
                            jj0Var2.e(R.raw.ic_mute, 28, 28);
                            textView3.setVisibility(8);
                            textView2.setTextColor(c(org.telegram.ui.ActionBar.j6.Gi));
                            linearLayout.setVisibility(0);
                        }
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        jj0Var2.setProgress(0.0f);
                        jj0Var2.d();
                    } else if (i29 == 11) {
                        x1Var.setText(LocaleController.getString(R.string.AuthAnotherClientOk));
                        jj0Var2.e(R.raw.contact_check, 36, 36);
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        textView3.setText(((TLRPC.TL_authorization) obj).app_name);
                        textView3.setVisibility(0);
                        x1Var.setTextSize(1, 14.0f);
                        x1Var.setTypeface(AndroidUtilities.bold());
                        textView2.setTextColor(c(org.telegram.ui.ActionBar.j6.p7));
                        imageView2.setVisibility(8);
                        linearLayout.setVisibility(0);
                        jj0Var2.setVisibility(0);
                        jj0Var2.setProgress(0.0f);
                        jj0Var2.d();
                    } else if (i29 == 15) {
                        this.D = 10000L;
                        textView2.setText(LocaleController.getString(R.string.Open));
                        x1Var.setText(LocaleController.getString(R.string.FilterAvailableTitle));
                        jj0Var2.e(R.raw.filter_new, 36, 36);
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
                            spannableStringBuilder2.setSpan(new m51("tg://settings/folders"), indexOf2, lastIndexOf2 - 1, 33);
                        }
                        textView3.setText(spannableStringBuilder2);
                        textView3.setVisibility(0);
                        textView3.setSingleLine(false);
                        textView3.setMaxLines(2);
                        linearLayout.setVisibility(0);
                        imageView2.setVisibility(8);
                        jj0Var2.setVisibility(0);
                        jj0Var2.setProgress(0.0f);
                        jj0Var2.d();
                    } else if (i29 == 16 || i29 == 17) {
                        str = "";
                        this.D = 4000L;
                        x1Var.setTextSize(1, 14.0f);
                        x1Var.setGravity(16);
                        x1Var.setMinHeight(AndroidUtilities.dp(30.0f));
                        String str3 = (String) obj;
                        if ("🎲".equals(str3)) {
                            x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DiceInfo2)));
                            jj0Var2.setImageResource(R.drawable.dice);
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
                            jj0Var2.setImageDrawable(Emoji.getEmojiDrawable(str3));
                            jj0Var2.setScaleType(ImageView.ScaleType.FIT_XY);
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
                            textView2.setTextColor(c(org.telegram.ui.ActionBar.j6.Gi));
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
                        jj0Var2.setVisibility(0);
                    } else if (i29 == 18) {
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
                        jj0Var2.setVisibility(0);
                        jj0Var2.e(R.raw.chats_infotip, 36, 36);
                        jj0Var2.setProgress(0.0f);
                        jj0Var2.d();
                        x1Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    } else if (i29 == 12) {
                        x1Var.setText(LocaleController.getString(R.string.ColorThemeChanged));
                        jj0Var2.setImageResource(R.drawable.toast_pallete);
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
                            spannableStringBuilder3.setSpan(new m51("tg://settings/themes"), indexOf3, lastIndexOf3 - 1, 33);
                        }
                        textView3.setText(spannableStringBuilder3);
                        textView3.setVisibility(0);
                        textView3.setSingleLine(false);
                        textView3.setMaxLines(2);
                        textView2.setVisibility(8);
                        linearLayout.setVisibility(0);
                        jj0Var2.setVisibility(0);
                    } else {
                        str = "";
                        if (i29 == 84) {
                            x1Var.setVisibility(0);
                            x1Var.setTextSize(1, 15.0f);
                            x1Var.setTypeface(Typeface.DEFAULT);
                            x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumTranscriptionHint)));
                            jj0Var2.setVisibility(0);
                            jj0Var2.e(R.raw.voice_to_text, 36, 36);
                            jj0Var2.setProgress(0.0f);
                            jj0Var2.d();
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
                        } else if (i29 == 85) {
                            x1Var.setVisibility(0);
                            x1Var.setTextSize(1, 15.0f);
                            x1Var.setTypeface(AndroidUtilities.bold());
                            x1Var.setText(LocaleController.getString(R.string.SwipeToReplyHint));
                            jj0Var2.setVisibility(0);
                            jj0Var2.e(R.raw.hint_swipe_reply, 64, 64);
                            jj0Var2.setProgress(0.0f);
                            jj0Var2.d();
                            textView3.setVisibility(0);
                            layoutParams.leftMargin = org.telegram.ui.b.e(58.0f, R.string.SwipeToReplyHintMessage, textView3);
                            layoutParams.rightMargin = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                            layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                            layoutParams.height = -2;
                            p9Var.setVisibility(8);
                            linearLayout.setVisibility(8);
                        } else if (i29 == 90 || i29 == 91 || i29 == 92 || i29 == 93 || i29 == 94) {
                            switch (i29) {
                                case 90:
                                    x1Var.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) gg.p0.f(), new Object[0]));
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
                            jj0Var2.setVisibility(0);
                            jj0Var2.e(R.raw.chats_infotip, 36, 36);
                            jj0Var2.setProgress(0.0f);
                            jj0Var2.d();
                        } else if (i29 == 2 || i29 == 4) {
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
                            jj0Var2.setVisibility(0);
                            jj0Var2.e(R.raw.chats_archived, 36, 36);
                            jj0Var2.setProgress(0.0f);
                            jj0Var2.d();
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
                                p9Var.f(str4, null, org.telegram.ui.ActionBar.j6.R4);
                            } else if (photoEntry.path != null) {
                                p9Var.p(photoEntry.orientation, photoEntry.invert, true);
                                if (photoEntry.isVideo) {
                                    p9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.j6.R4);
                                } else {
                                    p9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.j6.R4);
                                }
                            } else {
                                p9Var.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
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
                            jj0Var2.setVisibility(8);
                            int i32 = this.H;
                            if (i32 == 88) {
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
                                    int i33 = R.string.FolderLinkDeleted;
                                    if (str5 == null) {
                                        str5 = str;
                                    }
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FolderLinkDeleted", i33, str5.replace('*', (char) 10033))));
                                }
                            } else if (i32 == 81 || i32 == 0 || i32 == 26) {
                                x1Var.setText(LocaleController.getString(R.string.HistoryClearedUndo));
                            } else if (i32 == 27) {
                                x1Var.setText(LocaleController.getString(R.string.ChatsDeletedUndo));
                            } else if (i32 == 95) {
                                if (DialogObject.isChatDialog(longValue)) {
                                    TLRPC.Chat chat6 = MessagesController.getInstance(i22).getChat(Long.valueOf(-longValue));
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
                                TLRPC.Chat chat7 = MessagesController.getInstance(i22).getChat(Long.valueOf(-longValue));
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
                                for (int i34 = 0; i34 < arrayList.size(); i34++) {
                                    MessagesController messagesController = MessagesController.getInstance(i22);
                                    long longValue2 = ((Long) arrayList.get(i34)).longValue();
                                    int i35 = this.H;
                                    messagesController.addDialogAction(longValue2, i35 == 0 || i35 == 26);
                                }
                            }
                        }
                    }
                    z4 = false;
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) x1Var.getText());
                    sb.append(textView3.getVisibility() != 0 ? ". " + ((Object) textView3.getText()) : str);
                    AndroidUtilities.makeAccessibilityAnnouncement(sb.toString());
                    if (!f()) {
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
                        int i36 = this.H;
                        int dp6 = AndroidUtilities.dp((i36 == 16 || i36 == 17 || i36 == 18 || i36 == 84 || i36 == 86) ? 14.0f : 28.0f) + measuredHeight;
                        this.r = dp6;
                        int i37 = this.H;
                        if (i37 == 18) {
                            this.r = Math.max(dp6, AndroidUtilities.dp(52.0f));
                        } else if (i37 == 25) {
                            this.r = Math.max(dp6, AndroidUtilities.dp(50.0f));
                        } else if (z4) {
                            this.r = dp6 - AndroidUtilities.dp(8.0f);
                        }
                    }
                    if (getVisibility() == 0) {
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
                i11 = i22;
                imageView = imageView2;
                textView = textView2;
                i12 = 8;
            }
            imageView.setVisibility(i12);
            jj0Var2.setVisibility(0);
            x1Var.setTypeface(Typeface.DEFAULT);
            int i38 = this.H;
            long j12 = -1;
            if (i38 == 76) {
                x1Var.setText(LocaleController.getString(R.string.BroadcastGroupConvertSuccess));
                jj0Var2.e(R.raw.gigagroup_convert, 36, 36);
                layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                x1Var.setTextSize(1, 14.0f);
            } else {
                z4 = true;
                if (i38 == 75) {
                    x1Var.setText(LocaleController.getString(R.string.GigagroupConvertCancelHint));
                    jj0Var2.e(R.raw.chats_infotip, 36, 36);
                    layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                    x1Var.setTextSize(1, 14.0f);
                    jj0Var = jj0Var2;
                    j10 = -1;
                    i13 = 8;
                } else if (i10 == 70) {
                    int intValue4 = ((Integer) obj2).intValue();
                    textView3.setSingleLine(false);
                    x1Var.setText(LocaleController.formatString("AutoDeleteHintOnText", R.string.AutoDeleteHintOnText, LocaleController.formatTTLString(intValue4)));
                    jj0Var2.e(R.raw.fire_on, 36, 36);
                    layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                    this.D = 4000L;
                    jj0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                } else {
                    if (i38 == 71) {
                        x1Var.setText(LocaleController.getString(R.string.AutoDeleteHintOffText));
                        jj0Var2.e(R.raw.fire_off, 36, 36);
                        x1Var.setTextSize(1, 14.0f);
                        this.D = 3000L;
                        jj0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                    } else if (i38 == 45) {
                        x1Var.setText(LocaleController.getString(R.string.ImportMutualError));
                        jj0Var2.e(R.raw.error, 36, 36);
                        layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                        x1Var.setTextSize(1, 14.0f);
                    } else if (i38 == 46) {
                        x1Var.setText(LocaleController.getString(R.string.ImportNotAdmin));
                        jj0Var2.e(R.raw.error, 36, 36);
                        layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                        x1Var.setTextSize(1, 14.0f);
                    } else if (i38 == 47) {
                        x1Var.setText(LocaleController.getString(R.string.ImportedInfo));
                        jj0Var2.e(R.raw.imported, 36, 36);
                        jj0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(5.0f));
                        layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                        x1Var.setTextSize(1, 14.0f);
                    } else {
                        if (i38 == 52 || i38 == 56 || i38 == 57 || i38 == 58 || i38 == 59 || i38 == 60 || i38 == 80) {
                            jj0Var = jj0Var2;
                            if (!AndroidUtilities.shouldShowClipboardToast()) {
                                return;
                            }
                            int i39 = R.raw.copy;
                            int i40 = this.H;
                            if (i40 == 80) {
                                x1Var.setText(LocaleController.getString(R.string.EmailCopied));
                            } else if (i40 == 60) {
                                x1Var.setText(LocaleController.getString(R.string.PhoneCopied));
                            } else if (i40 == 56) {
                                x1Var.setText(LocaleController.getString(R.string.UsernameCopied));
                            } else if (i40 == 57) {
                                x1Var.setText(LocaleController.getString(R.string.HashtagCopied));
                            } else if (i40 == 52) {
                                x1Var.setText(LocaleController.getString(R.string.MessageCopied));
                            } else if (i40 == 59) {
                                i39 = R.raw.voip_invite;
                                x1Var.setText(LocaleController.getString(R.string.LinkCopied));
                            } else {
                                x1Var.setText(LocaleController.getString(R.string.TextCopied));
                            }
                            jj0Var.e(i39, 30, 30);
                            this.D = 3000L;
                            x1Var.setTextSize(1, 15.0f);
                        } else if (i38 == 54) {
                            x1Var.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOn));
                            jj0Var2.e(R.raw.silent_unmute, 30, 30);
                            this.D = 3000L;
                            x1Var.setTextSize(1, 15.0f);
                        } else if (i38 == 55) {
                            x1Var.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOff));
                            jj0Var2.e(R.raw.silent_mute, 30, 30);
                            this.D = 3000L;
                            x1Var.setTextSize(1, 15.0f);
                        } else if (i38 == 41) {
                            if (obj2 != null) {
                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                            } else if (longValue == UserConfig.getInstance(i11).clientUserId) {
                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages)));
                            } else if (DialogObject.isChatDialog(longValue)) {
                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(i11).getChat(Long.valueOf(-longValue)).title)));
                            } else {
                                x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(i11).getUser(l10)))));
                            }
                            jj0Var2.e(R.raw.contact_check, 36, 36);
                            this.D = 3000L;
                        } else if (i38 == 53) {
                            Integer num = (Integer) obj;
                            if (obj2 == null || (obj2 instanceof TLRPC.TL_forumTopic)) {
                                jj0Var = jj0Var2;
                                if (longValue == UserConfig.getInstance(i11).clientUserId) {
                                    if (num.intValue() == 1) {
                                        x1Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), new mc(15)));
                                    } else {
                                        x1Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), new mc(15)));
                                    }
                                    jj0Var.e(R.raw.saved_messages, 30, 30);
                                } else {
                                    if (DialogObject.isChatDialog(longValue)) {
                                        TLRPC.Chat chat8 = MessagesController.getInstance(i11).getChat(Long.valueOf(-longValue));
                                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                        String i41 = ChatObject.isMonoForum(chat8) ? ag.f.i(chat8, i11, false) : null;
                                        if (num.intValue() == 1) {
                                            int i42 = R.string.FwdMessageToGroup;
                                            if (i41 == null) {
                                                i41 = tL_forumTopic != null ? tL_forumTopic.title : chat8.title;
                                            }
                                            x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToGroup", i42, i41)));
                                        } else {
                                            int i43 = R.string.FwdMessagesToGroup;
                                            if (i41 == null) {
                                                i41 = tL_forumTopic != null ? tL_forumTopic.title : chat8.title;
                                            }
                                            x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToGroup", i43, i41)));
                                        }
                                    } else {
                                        TLRPC.User user7 = MessagesController.getInstance(i11).getUser(l10);
                                        if (num.intValue() == 1) {
                                            x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToUser", R.string.FwdMessageToUser, UserObject.getFirstName(user7))));
                                        } else {
                                            x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToUser", R.string.FwdMessagesToUser, UserObject.getFirstName(user7))));
                                        }
                                    }
                                    jj0Var.e(R.raw.forward, 30, 30);
                                    j12 = 300;
                                }
                            } else {
                                int intValue5 = ((Integer) obj2).intValue();
                                if (num.intValue() == 1) {
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", intValue5, new Object[0])));
                                } else {
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", intValue5, new Object[0])));
                                }
                                jj0Var2.e(R.raw.forward, 30, 30);
                                j12 = 300;
                                jj0Var = jj0Var2;
                            }
                            this.D = 3000L;
                        } else {
                            jj0Var = jj0Var2;
                            int i44 = i11;
                            if (i38 == 61) {
                                if (obj2 != null) {
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToChats", R.string.BackgroundToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                                    jj0Var.e(R.raw.forward, 30, 30);
                                } else if (longValue == UserConfig.getInstance(i44).clientUserId) {
                                    x1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BackgroundToSavedMessages)));
                                    jj0Var.e(R.raw.saved_messages, 30, 30);
                                } else {
                                    if (DialogObject.isChatDialog(longValue)) {
                                        x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToGroup", R.string.BackgroundToGroup, MessagesController.getInstance(i44).getChat(Long.valueOf(-longValue)).title)));
                                    } else {
                                        x1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToUser", R.string.BackgroundToUser, UserObject.getFirstName(MessagesController.getInstance(i44).getUser(l10)))));
                                    }
                                    jj0Var.e(R.raw.forward, 30, 30);
                                }
                                this.D = 3000L;
                            }
                        }
                        j10 = j12;
                        i13 = 8;
                        z4 = false;
                    }
                    jj0Var = jj0Var2;
                    j10 = j12;
                    i13 = 8;
                    z4 = false;
                }
                textView3.setVisibility(i13);
                textView.setTextColor(c(org.telegram.ui.ActionBar.j6.Gi));
                linearLayout.setVisibility(i13);
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                jj0Var.setProgress(0.0f);
                jj0Var.d();
                if (j10 > 0) {
                    jj0Var.postDelayed(new nq0(this, 27), j10);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) x1Var.getText());
                if (textView3.getVisibility() != 0) {
                }
                sb2.append(textView3.getVisibility() != 0 ? ". " + ((Object) textView3.getText()) : str);
                AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
                if (!f()) {
                }
                if (getVisibility() == 0) {
                }
            }
            jj0Var = jj0Var2;
            j10 = -1;
            i13 = 8;
            z4 = true;
            textView3.setVisibility(i13);
            textView.setTextColor(c(org.telegram.ui.ActionBar.j6.Gi));
            linearLayout.setVisibility(i13);
            layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
            jj0Var.setProgress(0.0f);
            jj0Var.d();
            if (j10 > 0) {
            }
            StringBuilder sb22 = new StringBuilder();
            sb22.append((Object) x1Var.getText());
            if (textView3.getVisibility() != 0) {
            }
            sb22.append(textView3.getVisibility() != 0 ? ". " + ((Object) textView3.getText()) : str);
            AndroidUtilities.makeAccessibilityAnnouncement(sb22.toString());
            if (!f()) {
            }
            if (getVisibility() == 0) {
            }
        }
        str = "";
        z4 = false;
        StringBuilder sb222 = new StringBuilder();
        sb222.append((Object) x1Var.getText());
        if (textView3.getVisibility() != 0) {
        }
        sb222.append(textView3.getVisibility() != 0 ? ". " + ((Object) textView3.getText()) : str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb222.toString());
        if (!f()) {
        }
        if (getVisibility() == 0) {
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

    public UndoView(Context context, cd1 cd1Var) {
        this(context, cd1Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = 0;
        this.x = UserConfig.selectedAccount;
        this.H = -1;
        this.Q = 1;
        this.T = AndroidUtilities.dp(8.0f);
        this.W = 1.0f;
        this.S = f6Var;
        this.s = p2Var;
        this.O = z4;
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, context, f6Var);
        this.b = x1Var;
        x1Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        x1Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.Gi;
        x1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        x1Var.setMovementMethod(new r51(this));
        addView(x1Var, k7.b6.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        addView(textView, k7.b6.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        jj0 jj0Var = new jj0(context);
        this.f = jj0Var;
        jj0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.j6.Fi;
        jj0Var.h(org.telegram.ui.ActionBar.j6.v0(i12, f6Var) | (-16777216), "info1");
        jj0Var.h(org.telegram.ui.ActionBar.j6.v0(i12, f6Var) | (-16777216), "info2");
        jj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc12");
        jj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc11");
        jj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc10");
        jj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc9");
        jj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc8");
        jj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc7");
        jj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc6");
        jj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc5");
        jj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc4");
        jj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc3");
        jj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc2");
        jj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "luc1");
        jj0Var.h(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), "Oval");
        addView(jj0Var, k7.b6.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        p9 p9Var = new p9(context);
        this.h = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(p9Var, k7.b6.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(i11, f6Var) & 587202559, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
        addView(linearLayout, k7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new q51(this, 0));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView, k7.b6.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView2.setText(LocaleController.getString(R.string.UndoNoCaps));
        linearLayout.addView(textView2, k7.b6.t(-2, -2, 19, 6, 4, 8, 4));
        this.C = new RectF(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(33.0f), AndroidUtilities.dp(33.0f));
        Paint paint = new Paint(1);
        this.B = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        TextPaint textPaint = new TextPaint(1);
        this.y = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        setWillNotDraw(false);
        this.R = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        setOnTouchListener(new oh.d(25));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void h(int i10, long j10) {
    }
}
