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
import org.telegram.ui.qc1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
@Deprecated
/* loaded from: classes3.dex */
public class UndoView extends FrameLayout {
    public static final /* synthetic */ int a0 = 0;
    public final Paint A;
    public final RectF B;
    public long C;
    public int D;
    public String E;
    public int F;
    public int G;
    public ArrayList H;
    public Runnable I;
    public Runnable J;
    public long K;
    public float L;
    public boolean M;
    public final boolean N;
    public CharSequence O;
    public int P;
    public final ShapeDrawable Q;
    public final org.telegram.ui.ActionBar.c6 R;
    public int S;
    public StaticLayout T;
    public StaticLayout U;
    public float V;
    public float W;
    public int a;
    public final org.telegram.ui.Cells.w1 b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final aj0 f;
    public final t9 h;
    public final LinearLayout n;
    public int r;
    public final org.telegram.ui.ActionBar.o2 s;
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
        return org.telegram.ui.ActionBar.g6.v0(i10, this.R);
    }

    public final boolean d() {
        int i10;
        Object obj;
        int i11 = this.G;
        if (i11 == 11 || i11 == 24 || i11 == 6 || i11 == 3 || i11 == 5 || i11 == 13 || i11 == 14 || i11 == 74) {
            return true;
        }
        if ((i11 == 7 && MessagesController.getInstance(this.x).dialogFilters.isEmpty()) || (i10 = this.G) == 83 || i10 == 85) {
            return true;
        }
        return i10 == 88 && (obj = this.w) != null && ((Integer) obj).intValue() > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.L == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        float measuredHeight = (getMeasuredHeight() - this.W) + AndroidUtilities.dp(9.0f);
        if (measuredHeight > 0.0f) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            super.dispatchDraw(canvas);
        }
        canvas.restore();
    }

    public void e(int i10, boolean z10) {
        if (getVisibility() == 0 && this.M) {
            this.v = null;
            this.w = null;
            this.M = false;
            Runnable runnable = this.I;
            if (runnable != null) {
                if (z10) {
                    runnable.run();
                }
                this.I = null;
            }
            Runnable runnable2 = this.J;
            if (runnable2 != null) {
                if (!z10) {
                    runnable2.run();
                }
                this.J = null;
            }
            int i11 = this.G;
            if (i11 == 0 || i11 == 1 || i11 == 95 || i11 == 26 || i11 == 27) {
                for (int i12 = 0; i12 < this.H.size(); i12++) {
                    long longValue = ((Long) this.H.get(i12)).longValue();
                    MessagesController messagesController = MessagesController.getInstance(this.x);
                    int i13 = this.G;
                    messagesController.removeDialogAction(longValue, i13 == 0 || i13 == 26, z10);
                    h(this.G, longValue);
                }
            }
            int i14 = 4;
            boolean z11 = this.N;
            if (i10 == 0) {
                setEnterOffset((z11 ? -1.0f : 1.0f) * (this.S + this.r));
                setVisibility(4);
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (i10 == 1) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z11 ? -1.0f : 1.0f) * (this.S + this.r)));
                animatorSet.setDuration(250L);
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.ALPHA, 0.0f));
                animatorSet.setDuration(180L);
            }
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.addListener(new p11(this, i14));
            animatorSet.start();
        }
    }

    public final boolean f() {
        int i10 = this.G;
        return i10 == 12 || i10 == 15 || i10 == 24 || i10 == 74 || i10 == 83;
    }

    public final boolean g() {
        int i10 = this.G;
        return i10 == 6 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 8 || i10 == 87 || i10 == 9 || i10 == 10 || i10 == 13 || i10 == 14 || i10 == 19 || i10 == 20 || i10 == 21 || i10 == 22 || i10 == 23 || i10 == 30 || i10 == 31 || i10 == 32 || i10 == 102 || i10 == 33 || i10 == 34 || i10 == 35 || i10 == 36 || i10 == 74 || i10 == 37 || i10 == 38 || i10 == 39 || i10 == 40 || i10 == 42 || i10 == 43 || i10 == 77 || i10 == 44 || i10 == 78 || i10 == 79 || i10 == 100 || i10 == 101 || i10 == 83;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.Q;
    }

    public Object getCurrentInfoObject() {
        return this.v;
    }

    public float getEnterOffset() {
        return this.W;
    }

    public final void i() {
        org.telegram.ui.ActionBar.g6.w1(-115203550, this.Q);
        this.b.setTextColor(-1);
        this.c.setTextColor(-1);
        aj0 aj0Var = this.f;
        aj0Var.h(-14540254, "info1");
        aj0Var.h(-14540254, "info2");
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
    /* JADX WARN: Removed duplicated region for block: B:45:0x16f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x1718  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x1803  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x16d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x1757  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x1706  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x089d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ArrayList arrayList, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        MovementMethod movementMethod;
        org.telegram.ui.Cells.w1 w1Var;
        String str;
        boolean z10;
        aj0 aj0Var;
        long j10;
        int i11;
        int dp;
        CharSequence replaceTags;
        int i12;
        int i13;
        CharSequence charSequence;
        int i14;
        CharSequence replaceTags2;
        String string;
        int i15;
        String str2;
        int i16;
        int i17;
        SpannableStringBuilder replaceTags3;
        int i18;
        int i19;
        if (!AndroidUtilities.shouldShowClipboardToast() && ((i19 = this.G) == 52 || i19 == 56 || i19 == 57 || i19 == 58 || i19 == 59 || i19 == 60 || i19 == 80 || i19 == 33)) {
            return;
        }
        Runnable runnable3 = this.I;
        if (runnable3 != null) {
            runnable3.run();
        }
        this.M = true;
        this.I = runnable;
        this.J = runnable2;
        this.H = arrayList;
        Long l10 = (Long) arrayList.get(0);
        long longValue = l10.longValue();
        this.G = i10;
        this.C = 5000L;
        this.v = obj;
        this.w = obj2;
        this.K = SystemClock.elapsedRealtime();
        String string2 = LocaleController.getString(R.string.UndoNoCaps);
        TextView textView = this.d;
        textView.setText(string2);
        ImageView imageView = this.e;
        imageView.setVisibility(0);
        aj0 aj0Var2 = this.f;
        aj0Var2.setPadding(0, 0, 0, 0);
        aj0Var2.setScaleX(1.0f);
        aj0Var2.setScaleY(1.0f);
        org.telegram.ui.Cells.w1 w1Var2 = this.b;
        w1Var2.setTextSize(1, 15.0f);
        t9 t9Var = this.h;
        t9Var.setVisibility(8);
        w1Var2.setGravity(51);
        TextView textView2 = this.c;
        ((FrameLayout.LayoutParams) textView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(58.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w1Var2.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
        layoutParams.bottomMargin = 0;
        aj0Var2.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) aj0Var2.getLayoutParams();
        layoutParams2.gravity = 19;
        layoutParams2.bottomMargin = 0;
        layoutParams2.topMargin = 0;
        layoutParams2.leftMargin = AndroidUtilities.dp(3.0f);
        layoutParams2.width = AndroidUtilities.dp(54.0f);
        layoutParams2.height = -2;
        w1Var2.setMinHeight(0);
        if ((runnable == null && runnable2 == null) || i10 == 83) {
            setOnClickListener(new e51(this, 1));
            movementMethod = null;
            setOnTouchListener(null);
        } else {
            setOnClickListener(null);
            setOnTouchListener(new mh.d(26));
            movementMethod = null;
        }
        w1Var2.setMovementMethod(movementMethod);
        boolean g10 = g();
        LinearLayout linearLayout = this.n;
        int i20 = this.x;
        int i21 = 36;
        if (g10) {
            if (i10 == 83) {
                textView2.setSingleLine(false);
                replaceTags = LocaleController.getString(R.string.SoundAdded);
                charSequence = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SoundAddedSubtitle), runnable);
                this.I = null;
                i13 = R.raw.sound_download;
                this.C = 4000L;
            } else if (i10 == 74) {
                textView2.setSingleLine(false);
                replaceTags = LocaleController.getString(R.string.ReportChatSent);
                charSequence = LocaleController.formatString("ReportSentInfo", R.string.ReportSentInfo, new Object[0]);
                i13 = R.raw.ic_admin;
                this.C = 4000L;
            } else {
                if (i10 == 34) {
                    TLRPC.User user = (TLRPC.User) obj;
                    if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                        i17 = 0;
                        replaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelInvitedUser", R.string.VoipChannelInvitedUser, UserObject.getFirstName(user)));
                    } else {
                        i17 = 0;
                        replaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupInvitedUser", R.string.VoipGroupInvitedUser, UserObject.getFirstName(user)));
                    }
                    e9 e9Var = new e9();
                    e9Var.u(AndroidUtilities.dp(12.0f));
                    e9Var.m(i20, user);
                    t9Var.e(user, e9Var);
                    t9Var.setVisibility(i17);
                    this.C = 3000L;
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
                    e9 e9Var2 = new e9();
                    e9Var2.u(AndroidUtilities.dp(12.0f));
                    TLObject tLObject = (TLObject) obj;
                    e9Var2.j(i20, tLObject);
                    t9Var.e(tLObject, e9Var2);
                    t9Var.setVisibility(0);
                    this.C = 3000L;
                } else if (i10 == 37) {
                    e9 e9Var3 = new e9();
                    e9Var3.u(AndroidUtilities.dp(12.0f));
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj;
                        e9Var3.m(i20, user3);
                        t9Var.e(user3, e9Var3);
                        str2 = ContactsController.formatName(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj;
                        e9Var3.k(i20, chat3);
                        t9Var.e(chat3, e9Var3);
                        str2 = chat3.title;
                    }
                    if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                        i16 = 0;
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelUserChanged", R.string.VoipChannelUserChanged, str2));
                    } else {
                        i16 = 0;
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserChanged", R.string.VoipGroupUserChanged, str2));
                    }
                    t9Var.setVisibility(i16);
                    this.C = 3000L;
                } else {
                    if (i10 == 33) {
                        replaceTags = LocaleController.getString(R.string.VoipGroupCopyInviteLinkCopied);
                        int i22 = R.raw.voip_invite;
                        this.C = 3000L;
                        i13 = i22;
                        w1Var = w1Var2;
                    } else {
                        int i23 = 9;
                        if (i10 == 77) {
                            replaceTags = (CharSequence) obj;
                            i14 = R.raw.payment_success;
                            this.C = 5000L;
                            if (this.s == null || !(obj2 instanceof TLRPC.Message)) {
                                w1Var = w1Var2;
                            } else {
                                setOnTouchListener(null);
                                w1Var = w1Var2;
                                w1Var.setMovementMethod(null);
                                setOnClickListener(new fi0(i23, this, (TLRPC.Message) obj2));
                            }
                        } else {
                            w1Var = w1Var2;
                            if (i10 == 30) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeak", R.string.VoipGroupUserCantNowSpeak, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                i14 = R.raw.voip_muted;
                                this.C = 3000L;
                            } else if (i10 == 35) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeakForYou", R.string.VoipGroupUserCantNowSpeakForYou, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : ""));
                                i14 = R.raw.voip_muted;
                                this.C = 3000L;
                            } else if (i10 == 31) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeak", R.string.VoipGroupUserCanNowSpeak, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                i14 = R.raw.voip_unmuted;
                                this.C = 3000L;
                            } else if (i10 == 38) {
                                replaceTags = obj instanceof TLRPC.Chat ? AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupYouCanNowSpeakIn", R.string.VoipGroupYouCanNowSpeakIn, ((TLRPC.Chat) obj).title)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupYouCanNowSpeak));
                                i14 = R.raw.voip_allow_talk;
                                this.C = 3000L;
                            } else if (i10 == 42) {
                                replaceTags = ChatObject.isChannelOrGiga((TLRPC.Chat) obj) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundMuted)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundMuted));
                                i14 = R.raw.ic_mute;
                                this.C = 3000L;
                            } else if (i10 == 43) {
                                replaceTags = ChatObject.isChannelOrGiga((TLRPC.Chat) obj) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundUnmuted)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundUnmuted));
                                i14 = R.raw.ic_unmute;
                                this.C = 3000L;
                            } else {
                                int i24 = this.G;
                                int i25 = 39;
                                if (i24 != 39) {
                                    if (i24 == 100) {
                                        i25 = 39;
                                    } else {
                                        int i26 = 40;
                                        if (i24 != 40) {
                                            if (i24 == 101) {
                                                i26 = 40;
                                            } else if (i10 == 36) {
                                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeakForYou", R.string.VoipGroupUserCanNowSpeakForYou, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                                i14 = R.raw.voip_unmuted;
                                                this.C = 3000L;
                                            } else {
                                                if (i10 == 32 || i10 == 102) {
                                                    String firstName = obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title;
                                                    replaceTags = i10 == 102 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipConferenceKicked, firstName)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipGroupRemovedFromGroup, firstName));
                                                    i12 = R.raw.ic_ban;
                                                    this.C = 3000L;
                                                } else if (i10 == 9 || i10 == 10) {
                                                    TLRPC.User user4 = (TLRPC.User) obj;
                                                    replaceTags = i10 == 9 ? AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferChannelToast", R.string.EditAdminTransferChannelToast, UserObject.getFirstName(user4))) : AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferGroupToast", R.string.EditAdminTransferGroupToast, UserObject.getFirstName(user4)));
                                                    i12 = R.raw.contact_check;
                                                } else if (i10 == 8) {
                                                    replaceTags = LocaleController.formatString("NowInContacts", R.string.NowInContacts, UserObject.getFirstName((TLRPC.User) obj));
                                                    i13 = R.raw.contact_check;
                                                } else if (i10 == 87) {
                                                    replaceTags = LocaleController.formatString(R.string.ProxyAddedSuccess, new Object[0]);
                                                    i14 = R.raw.contact_check;
                                                } else if (i10 == 22) {
                                                    if (DialogObject.isUserDialog(longValue)) {
                                                        replaceTags = obj == null ? LocaleController.getString(R.string.MainProfilePhotoSetHint) : LocaleController.getString(R.string.MainProfileVideoSetHint);
                                                    } else {
                                                        TLRPC.Chat chat4 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-longValue));
                                                        replaceTags = (!ChatObject.isChannel(chat4) || chat4.megagroup) ? obj == null ? LocaleController.getString(R.string.MainGroupProfilePhotoSetHint) : LocaleController.getString(R.string.MainGroupProfileVideoSetHint) : obj == null ? LocaleController.getString(R.string.MainChannelProfilePhotoSetHint) : LocaleController.getString(R.string.MainChannelProfileVideoSetHint);
                                                    }
                                                    i14 = R.raw.contact_check;
                                                } else if (i10 == 23) {
                                                    replaceTags = LocaleController.getString(R.string.ChatWasMovedToMainList);
                                                    i14 = R.raw.contact_check;
                                                } else {
                                                    if (i10 == 6) {
                                                        replaceTags = LocaleController.getString(R.string.ArchiveHidden);
                                                        charSequence = LocaleController.getString(R.string.ArchiveHiddenInfo);
                                                        i13 = R.raw.chats_swipearchive;
                                                        i21 = 48;
                                                    } else {
                                                        if (i24 == 13) {
                                                            replaceTags = LocaleController.getString(R.string.QuizWellDone);
                                                            charSequence = LocaleController.getString(R.string.QuizWellDoneInfo);
                                                            i13 = R.raw.wallet_congrats;
                                                        } else if (i24 == 14) {
                                                            replaceTags = LocaleController.getString(R.string.QuizWrongAnswer);
                                                            charSequence = LocaleController.getString(R.string.QuizWrongAnswerInfo);
                                                            i13 = R.raw.wallet_science;
                                                        } else {
                                                            if (i10 == 7) {
                                                                replaceTags = LocaleController.getString(R.string.ArchivePinned);
                                                                string = MessagesController.getInstance(i20).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ArchivePinnedInfo) : null;
                                                                i15 = R.raw.chats_infotip;
                                                            } else if (i10 == 20 || i10 == 21) {
                                                                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                                                                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, w1Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, w1Var.getPaint().getFontMetricsInt());
                                                                this.a = dialogFilter.title_noanimate ? 26 : 0;
                                                                if (longValue != 0) {
                                                                    long j11 = DialogObject.isEncryptedDialog(longValue) ? org.telegram.messenger.x3.p(MessagesController.getInstance(i20), longValue).user_id : longValue;
                                                                    if (DialogObject.isUserDialog(j11)) {
                                                                        TLRPC.User user5 = MessagesController.getInstance(i20).getUser(Long.valueOf(j11));
                                                                        String firstName2 = UserObject.getFirstName(user5);
                                                                        if (UserObject.isUserSelf(user5)) {
                                                                            firstName2 = LocaleController.getString(R.string.SavedMessages);
                                                                        } else if (UserObject.isReplyUser(user5)) {
                                                                            firstName2 = LocaleController.getString(R.string.RepliesTitle);
                                                                        }
                                                                        replaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserAddedToExisting, firstName2, replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserRemovedFrom, firstName2, replaceAnimatedEmoji));
                                                                    } else {
                                                                        TLRPC.Chat chat5 = MessagesController.getInstance(i20).getChat(Long.valueOf(-j11));
                                                                        replaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatAddedToExisting, chat5.title, replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatRemovedFrom, chat5.title, replaceAnimatedEmoji));
                                                                    }
                                                                } else {
                                                                    replaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsAddedToExisting, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsRemovedFrom, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), replaceAnimatedEmoji));
                                                                }
                                                                CharSequence charSequence2 = replaceTags2;
                                                                i13 = i10 == 20 ? R.raw.folder_in : R.raw.folder_out;
                                                                replaceTags = charSequence2;
                                                                charSequence = null;
                                                                i21 = 36;
                                                            } else if (i10 == 19) {
                                                                replaceTags = this.O;
                                                                i14 = R.raw.ic_delete;
                                                            } else if (i10 == 82) {
                                                                replaceTags = LocaleController.getString(((MediaController.PhotoEntry) obj).isVideo ? R.string.AttachMediaVideoDeselected : R.string.AttachMediaPhotoDeselected);
                                                                charSequence = null;
                                                                i13 = 0;
                                                            } else if (i10 == 78 || i10 == 79) {
                                                                int intValue = ((Integer) obj).intValue();
                                                                replaceTags = i10 == 78 ? LocaleController.formatPluralString("PinnedDialogsCount", intValue, new Object[0]) : LocaleController.formatPluralString("UnpinnedDialogsCount", intValue, new Object[0]);
                                                                i14 = this.G == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                                                if (obj2 instanceof Integer) {
                                                                    this.C = ((Integer) obj2).intValue();
                                                                }
                                                            } else {
                                                                replaceTags = i10 == 3 ? LocaleController.getString(R.string.ChatArchived) : LocaleController.getString(R.string.ChatsArchived);
                                                                string = MessagesController.getInstance(i20).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ChatArchivedInfo) : null;
                                                                i15 = R.raw.chats_infotip;
                                                            }
                                                            i13 = i15;
                                                            charSequence = string;
                                                        }
                                                        i21 = 44;
                                                    }
                                                    w1Var.setText(replaceTags);
                                                    if (i13 == 0) {
                                                        aj0Var2.e(i13, i21, i21);
                                                        xi0 animatedDrawable = aj0Var2.getAnimatedDrawable();
                                                        animatedDrawable.h = false;
                                                        animatedDrawable.N(animatedDrawable.q());
                                                        aj0Var2.setVisibility(0);
                                                        aj0Var2.setProgress(0.0f);
                                                        aj0Var2.d();
                                                    } else {
                                                        aj0Var2.setVisibility(8);
                                                    }
                                                    if (charSequence == null) {
                                                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                                                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                                                        layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                                                        ((FrameLayout.LayoutParams) textView2.getLayoutParams()).rightMargin = AndroidUtilities.dp(8.0f);
                                                        textView2.setText(charSequence);
                                                        textView2.setVisibility(0);
                                                        w1Var.setTextSize(1, 14.0f);
                                                        w1Var.setTypeface(AndroidUtilities.bold());
                                                        i18 = 8;
                                                    } else {
                                                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                                                        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                                                        layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                                                        i18 = 8;
                                                        textView2.setVisibility(8);
                                                        w1Var.setTextSize(1, 15.0f);
                                                        w1Var.setTypeface(Typeface.DEFAULT);
                                                    }
                                                    linearLayout.setVisibility(i18);
                                                }
                                                i13 = i12;
                                                charSequence = null;
                                                i21 = 36;
                                                w1Var.setText(replaceTags);
                                                if (i13 == 0) {
                                                }
                                                if (charSequence == null) {
                                                }
                                                linearLayout.setVisibility(i18);
                                            }
                                        }
                                        String string3 = LocaleController.getString(i24 == i26 ? R.string.VoipGroupAudioRecordSaved : R.string.VoipGroupVideoRecordSaved);
                                        i14 = R.raw.voip_record_saved;
                                        this.C = 4000L;
                                        w1Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
                                        int indexOf = string3.indexOf("**");
                                        int lastIndexOf = string3.lastIndexOf("**");
                                        if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                                            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                                            try {
                                                spannableStringBuilder.setSpan(new a51("tg://openmessage?user_id=" + UserConfig.getInstance(i20).getClientUserId()), indexOf, lastIndexOf - 2, 33);
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                            }
                                        }
                                        replaceTags = spannableStringBuilder;
                                        i21 = 36;
                                    }
                                }
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i24 == i25 ? R.string.VoipGroupAudioRecordStarted : R.string.VoipGroupVideoRecordStarted));
                                i12 = R.raw.voip_record_start;
                                this.C = 3000L;
                                i13 = i12;
                                charSequence = null;
                                i21 = 36;
                                w1Var.setText(replaceTags);
                                if (i13 == 0) {
                                }
                                if (charSequence == null) {
                                }
                                linearLayout.setVisibility(i18);
                            }
                        }
                        i13 = i14;
                    }
                    charSequence = null;
                    w1Var.setText(replaceTags);
                    if (i13 == 0) {
                    }
                    if (charSequence == null) {
                    }
                    linearLayout.setVisibility(i18);
                }
                w1Var = w1Var2;
                charSequence = null;
                i13 = 0;
                w1Var.setText(replaceTags);
                if (i13 == 0) {
                }
                if (charSequence == null) {
                }
                linearLayout.setVisibility(i18);
            }
            w1Var = w1Var2;
            w1Var.setText(replaceTags);
            if (i13 == 0) {
            }
            if (charSequence == null) {
            }
            linearLayout.setVisibility(i18);
        } else {
            w1Var = w1Var2;
            int i27 = this.G;
            if (i27 == 45 || i27 == 46 || i27 == 47 || i27 == 52 || i27 == 53 || i27 == 54 || i27 == 55 || i27 == 56 || i27 == 57 || i27 == 58 || i27 == 59 || i27 == 60 || i27 == 71 || i27 == 70 || i27 == 75 || i27 == 76 || i27 == 41 || i27 == 78 || i27 == 79 || i27 == 61 || i27 == 80) {
                str = "";
                imageView.setVisibility(8);
                aj0Var2.setVisibility(0);
                w1Var.setTypeface(Typeface.DEFAULT);
                int i28 = this.G;
                long j12 = -1;
                if (i28 != 76) {
                    z10 = true;
                    if (i28 == 75) {
                        w1Var.setText(LocaleController.getString(R.string.GigagroupConvertCancelHint));
                        aj0Var2.e(R.raw.chats_infotip, 36, 36);
                        layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                        w1Var.setTextSize(1, 14.0f);
                        aj0Var = aj0Var2;
                        j10 = -1;
                        i11 = 8;
                    } else if (i10 == 70) {
                        int intValue2 = ((Integer) obj2).intValue();
                        textView2.setSingleLine(false);
                        w1Var.setText(LocaleController.formatString("AutoDeleteHintOnText", R.string.AutoDeleteHintOnText, LocaleController.formatTTLString(intValue2)));
                        aj0Var2.e(R.raw.fire_on, 36, 36);
                        layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                        this.C = 4000L;
                        aj0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                    } else {
                        if (i28 == 71) {
                            w1Var.setText(LocaleController.getString(R.string.AutoDeleteHintOffText));
                            aj0Var2.e(R.raw.fire_off, 36, 36);
                            w1Var.setTextSize(1, 14.0f);
                            this.C = 3000L;
                            aj0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                        } else if (i28 == 45) {
                            w1Var.setText(LocaleController.getString(R.string.ImportMutualError));
                            aj0Var2.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            w1Var.setTextSize(1, 14.0f);
                        } else if (i28 == 46) {
                            w1Var.setText(LocaleController.getString(R.string.ImportNotAdmin));
                            aj0Var2.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            w1Var.setTextSize(1, 14.0f);
                        } else if (i28 == 47) {
                            w1Var.setText(LocaleController.getString(R.string.ImportedInfo));
                            aj0Var2.e(R.raw.imported, 36, 36);
                            aj0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(5.0f));
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            w1Var.setTextSize(1, 14.0f);
                        } else {
                            if (i28 == 52 || i28 == 56 || i28 == 57 || i28 == 58 || i28 == 59 || i28 == 60 || i28 == 80) {
                                aj0Var = aj0Var2;
                                if (!AndroidUtilities.shouldShowClipboardToast()) {
                                    return;
                                }
                                int i29 = R.raw.copy;
                                int i30 = this.G;
                                if (i30 == 80) {
                                    w1Var.setText(LocaleController.getString(R.string.EmailCopied));
                                } else if (i30 == 60) {
                                    w1Var.setText(LocaleController.getString(R.string.PhoneCopied));
                                } else if (i30 == 56) {
                                    w1Var.setText(LocaleController.getString(R.string.UsernameCopied));
                                } else if (i30 == 57) {
                                    w1Var.setText(LocaleController.getString(R.string.HashtagCopied));
                                } else if (i30 == 52) {
                                    w1Var.setText(LocaleController.getString(R.string.MessageCopied));
                                } else if (i30 == 59) {
                                    i29 = R.raw.voip_invite;
                                    w1Var.setText(LocaleController.getString(R.string.LinkCopied));
                                } else {
                                    w1Var.setText(LocaleController.getString(R.string.TextCopied));
                                }
                                aj0Var.e(i29, 30, 30);
                                this.C = 3000L;
                                w1Var.setTextSize(1, 15.0f);
                            } else if (i28 == 54) {
                                w1Var.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOn));
                                aj0Var2.e(R.raw.silent_unmute, 30, 30);
                                this.C = 3000L;
                                w1Var.setTextSize(1, 15.0f);
                            } else if (i28 == 55) {
                                w1Var.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOff));
                                aj0Var2.e(R.raw.silent_mute, 30, 30);
                                this.C = 3000L;
                                w1Var.setTextSize(1, 15.0f);
                            } else if (i28 == 41) {
                                if (obj2 != null) {
                                    w1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                                } else if (longValue == UserConfig.getInstance(i20).clientUserId) {
                                    w1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages)));
                                } else if (DialogObject.isChatDialog(longValue)) {
                                    w1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(i20).getChat(Long.valueOf(-longValue)).title)));
                                } else {
                                    w1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(i20).getUser(l10)))));
                                }
                                aj0Var2.e(R.raw.contact_check, 36, 36);
                                this.C = 3000L;
                            } else if (i28 == 53) {
                                Integer num = (Integer) obj;
                                if (obj2 == null || (obj2 instanceof TLRPC.TL_forumTopic)) {
                                    aj0Var = aj0Var2;
                                    if (longValue == UserConfig.getInstance(i20).clientUserId) {
                                        if (num.intValue() == 1) {
                                            w1Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), new g5(19)));
                                        } else {
                                            w1Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), new g5(19)));
                                        }
                                        aj0Var.e(R.raw.saved_messages, 30, 30);
                                    } else {
                                        if (DialogObject.isChatDialog(longValue)) {
                                            TLRPC.Chat chat6 = MessagesController.getInstance(i20).getChat(Long.valueOf(-longValue));
                                            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                            String i31 = ChatObject.isMonoForum(chat6) ? yf.d.i(chat6, i20, false) : null;
                                            if (num.intValue() == 1) {
                                                int i32 = R.string.FwdMessageToGroup;
                                                if (i31 == null) {
                                                    i31 = tL_forumTopic != null ? tL_forumTopic.title : chat6.title;
                                                }
                                                w1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToGroup", i32, i31)));
                                            } else {
                                                int i33 = R.string.FwdMessagesToGroup;
                                                if (i31 == null) {
                                                    i31 = tL_forumTopic != null ? tL_forumTopic.title : chat6.title;
                                                }
                                                w1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToGroup", i33, i31)));
                                            }
                                        } else {
                                            TLRPC.User user6 = MessagesController.getInstance(i20).getUser(l10);
                                            if (num.intValue() == 1) {
                                                w1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToUser", R.string.FwdMessageToUser, UserObject.getFirstName(user6))));
                                            } else {
                                                w1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToUser", R.string.FwdMessagesToUser, UserObject.getFirstName(user6))));
                                            }
                                        }
                                        aj0Var.e(R.raw.forward, 30, 30);
                                        j12 = 300;
                                    }
                                } else {
                                    int intValue3 = ((Integer) obj2).intValue();
                                    if (num.intValue() == 1) {
                                        w1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", intValue3, new Object[0])));
                                    } else {
                                        w1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", intValue3, new Object[0])));
                                    }
                                    aj0Var2.e(R.raw.forward, 30, 30);
                                    j12 = 300;
                                    aj0Var = aj0Var2;
                                }
                                this.C = 3000L;
                            } else {
                                aj0Var = aj0Var2;
                                if (i28 == 61) {
                                    if (obj2 != null) {
                                        w1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToChats", R.string.BackgroundToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                                        aj0Var.e(R.raw.forward, 30, 30);
                                    } else if (longValue == UserConfig.getInstance(i20).clientUserId) {
                                        w1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BackgroundToSavedMessages)));
                                        aj0Var.e(R.raw.saved_messages, 30, 30);
                                    } else {
                                        if (DialogObject.isChatDialog(longValue)) {
                                            w1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToGroup", R.string.BackgroundToGroup, MessagesController.getInstance(i20).getChat(Long.valueOf(-longValue)).title)));
                                        } else {
                                            w1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToUser", R.string.BackgroundToUser, UserObject.getFirstName(MessagesController.getInstance(i20).getUser(l10)))));
                                        }
                                        aj0Var.e(R.raw.forward, 30, 30);
                                    }
                                    this.C = 3000L;
                                }
                            }
                            j10 = j12;
                            i11 = 8;
                            z10 = false;
                        }
                        aj0Var = aj0Var2;
                        j10 = j12;
                        i11 = 8;
                        z10 = false;
                    }
                    textView2.setVisibility(i11);
                    textView.setTextColor(c(org.telegram.ui.ActionBar.g6.Gi));
                    linearLayout.setVisibility(i11);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    aj0Var.setProgress(0.0f);
                    aj0Var.d();
                    if (j10 > 0) {
                        aj0Var.postDelayed(new fq0(this, 27), j10);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object) w1Var.getText());
                    sb2.append(textView2.getVisibility() != 0 ? ". " + ((Object) textView2.getText()) : str);
                    AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
                    if (!f()) {
                        int measuredWidth = ((ViewGroup) getParent()).getMeasuredWidth();
                        if (measuredWidth == 0) {
                            measuredWidth = AndroidUtilities.displaySize.x;
                        }
                        measureChildWithMargins(textView2, org.telegram.ui.b.d(16.0f, measuredWidth, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                        this.r = AndroidUtilities.dp(37.0f) + textView2.getMeasuredHeight();
                    } else if (d()) {
                        this.r = AndroidUtilities.dp(52.0f);
                    } else if (getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) getParent();
                        int measuredWidth2 = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
                        if (measuredWidth2 <= 0) {
                            measuredWidth2 = AndroidUtilities.displaySize.x;
                        }
                        View view = w1Var;
                        measureChildWithMargins(view, org.telegram.ui.b.d(16.0f, measuredWidth2, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                        int measuredHeight = view.getMeasuredHeight();
                        int i34 = this.G;
                        int dp2 = AndroidUtilities.dp((i34 == 16 || i34 == 17 || i34 == 18 || i34 == 84 || i34 == 86) ? 14.0f : 28.0f) + measuredHeight;
                        this.r = dp2;
                        int i35 = this.G;
                        if (i35 == 18) {
                            this.r = Math.max(dp2, AndroidUtilities.dp(52.0f));
                        } else if (i35 == 25) {
                            this.r = Math.max(dp2, AndroidUtilities.dp(50.0f));
                        } else if (z10) {
                            this.r = dp2 - AndroidUtilities.dp(8.0f);
                        }
                    }
                    if (getVisibility() == 0) {
                        setVisibility(0);
                        setEnterOffset((this.N ? -1.0f : 1.0f) * (this.S + this.r));
                        AnimatorSet animatorSet = new AnimatorSet();
                        boolean z11 = this.N;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z11 ? -1.0f : 1.0f) * (this.S + this.r), z11 ? 1.0f : -1.0f));
                        animatorSet.setInterpolator(new DecelerateInterpolator());
                        animatorSet.setDuration(180L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                w1Var.setText(LocaleController.getString(R.string.BroadcastGroupConvertSuccess));
                aj0Var2.e(R.raw.gigagroup_convert, 36, 36);
                layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                w1Var.setTextSize(1, 14.0f);
                aj0Var = aj0Var2;
                j10 = -1;
                i11 = 8;
                z10 = true;
                textView2.setVisibility(i11);
                textView.setTextColor(c(org.telegram.ui.ActionBar.g6.Gi));
                linearLayout.setVisibility(i11);
                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                aj0Var.setProgress(0.0f);
                aj0Var.d();
                if (j10 > 0) {
                }
                StringBuilder sb22 = new StringBuilder();
                sb22.append((Object) w1Var.getText());
                if (textView2.getVisibility() != 0) {
                }
                sb22.append(textView2.getVisibility() != 0 ? ". " + ((Object) textView2.getText()) : str);
                AndroidUtilities.makeAccessibilityAnnouncement(sb22.toString());
                if (!f()) {
                }
                if (getVisibility() == 0) {
                }
            } else {
                if (i27 == 24 || i27 == 25) {
                    str = "";
                    int intValue4 = ((Integer) obj).intValue();
                    TLRPC.User user7 = (TLRPC.User) obj2;
                    imageView.setVisibility(8);
                    aj0Var2.setVisibility(0);
                    if (intValue4 != 0) {
                        w1Var.setTypeface(AndroidUtilities.bold());
                        w1Var.setTextSize(1, 14.0f);
                        aj0Var2.a.clear();
                        int i36 = org.telegram.ui.ActionBar.g6.Hi;
                        aj0Var2.h(c(i36), "BODY");
                        aj0Var2.h(c(i36), "Wibe Big");
                        aj0Var2.h(c(i36), "Wibe Big 3");
                        aj0Var2.h(c(i36), "Wibe Small");
                        w1Var.setText(LocaleController.getString(R.string.ProximityAlertSet));
                        aj0Var2.e(R.raw.ic_unmute, 28, 28);
                        textView2.setVisibility(0);
                        textView2.setSingleLine(false);
                        textView2.setMaxLines(3);
                        if (user7 != null) {
                            textView2.setText(LocaleController.formatString("ProximityAlertSetInfoUser", R.string.ProximityAlertSetInfoUser, UserObject.getFirstName(user7), LocaleController.formatDistance(intValue4, 2)));
                        } else {
                            textView2.setText(LocaleController.formatString("ProximityAlertSetInfoGroup2", R.string.ProximityAlertSetInfoGroup2, LocaleController.formatDistance(intValue4, 2)));
                        }
                        linearLayout.setVisibility(8);
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    } else {
                        w1Var.setTypeface(Typeface.DEFAULT);
                        w1Var.setTextSize(1, 15.0f);
                        aj0Var2.a.clear();
                        int i37 = org.telegram.ui.ActionBar.g6.Hi;
                        aj0Var2.h(c(i37), "Body Main");
                        aj0Var2.h(c(i37), "Body Top");
                        aj0Var2.h(c(i37), "Line");
                        aj0Var2.h(c(i37), "Curve Big");
                        aj0Var2.h(c(i37), "Curve Small");
                        layoutParams.topMargin = AndroidUtilities.dp(14.0f);
                        w1Var.setText(LocaleController.getString(R.string.ProximityAlertCancelled));
                        aj0Var2.e(R.raw.ic_mute, 28, 28);
                        textView2.setVisibility(8);
                        textView.setTextColor(c(org.telegram.ui.ActionBar.g6.Gi));
                        linearLayout.setVisibility(0);
                    }
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    aj0Var2.setProgress(0.0f);
                    aj0Var2.d();
                } else if (i27 == 11) {
                    w1Var.setText(LocaleController.getString(R.string.AuthAnotherClientOk));
                    aj0Var2.e(R.raw.contact_check, 36, 36);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    textView2.setText(((TLRPC.TL_authorization) obj).app_name);
                    textView2.setVisibility(0);
                    w1Var.setTextSize(1, 14.0f);
                    w1Var.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(c(org.telegram.ui.ActionBar.g6.p7));
                    imageView.setVisibility(8);
                    linearLayout.setVisibility(0);
                    aj0Var2.setVisibility(0);
                    aj0Var2.setProgress(0.0f);
                    aj0Var2.d();
                } else if (i27 == 15) {
                    this.C = 10000L;
                    textView.setText(LocaleController.getString(R.string.Open));
                    w1Var.setText(LocaleController.getString(R.string.FilterAvailableTitle));
                    aj0Var2.e(R.raw.filter_new, 36, 36);
                    int dp3 = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = dp3;
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    ((FrameLayout.LayoutParams) textView2.getLayoutParams()).rightMargin = dp3;
                    String string4 = LocaleController.getString(R.string.FilterAvailableText);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string4);
                    int indexOf2 = string4.indexOf(42);
                    int lastIndexOf2 = string4.lastIndexOf(42);
                    if (indexOf2 >= 0 && lastIndexOf2 >= 0 && indexOf2 != lastIndexOf2) {
                        spannableStringBuilder2.replace(lastIndexOf2, lastIndexOf2 + 1, (CharSequence) "");
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
                        spannableStringBuilder2.setSpan(new a51("tg://settings/folders"), indexOf2, lastIndexOf2 - 1, 33);
                    }
                    textView2.setText(spannableStringBuilder2);
                    textView2.setVisibility(0);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(2);
                    linearLayout.setVisibility(0);
                    imageView.setVisibility(8);
                    aj0Var2.setVisibility(0);
                    aj0Var2.setProgress(0.0f);
                    aj0Var2.d();
                } else if (i27 == 16 || i27 == 17) {
                    str = "";
                    this.C = 4000L;
                    w1Var.setTextSize(1, 14.0f);
                    w1Var.setGravity(16);
                    w1Var.setMinHeight(AndroidUtilities.dp(30.0f));
                    String str3 = (String) obj;
                    if ("🎲".equals(str3)) {
                        w1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DiceInfo2)));
                        aj0Var2.setImageResource(R.drawable.dice);
                    } else {
                        if ("🎯".equals(str3)) {
                            w1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DartInfo)));
                        } else {
                            String serverString = LocaleController.getServerString("DiceEmojiInfo_" + str3);
                            if (TextUtils.isEmpty(serverString)) {
                                w1Var.setText(Emoji.replaceEmoji(LocaleController.formatString("DiceEmojiInfo", R.string.DiceEmojiInfo, str3), w1Var.getPaint().getFontMetricsInt(), false));
                            } else {
                                w1Var.setText(Emoji.replaceEmoji(serverString, w1Var.getPaint().getFontMetricsInt(), false));
                            }
                        }
                        aj0Var2.setImageDrawable(Emoji.getEmojiDrawable(str3));
                        aj0Var2.setScaleType(ImageView.ScaleType.FIT_XY);
                        layoutParams.topMargin = AndroidUtilities.dp(14.0f);
                        layoutParams.bottomMargin = AndroidUtilities.dp(14.0f);
                        layoutParams2.leftMargin = AndroidUtilities.dp(14.0f);
                        layoutParams2.width = AndroidUtilities.dp(26.0f);
                        layoutParams2.height = AndroidUtilities.dp(26.0f);
                    }
                    textView.setText(LocaleController.getString(R.string.SendDice));
                    if (this.G == 16) {
                        dp = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                        textView.setVisibility(0);
                        textView.setTextColor(c(org.telegram.ui.ActionBar.g6.Gi));
                        imageView.setVisibility(8);
                        linearLayout.setVisibility(0);
                    } else {
                        dp = AndroidUtilities.dp(8.0f);
                        textView.setVisibility(8);
                        linearLayout.setVisibility(8);
                    }
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = dp;
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    layoutParams.bottomMargin = AndroidUtilities.dp(7.0f);
                    layoutParams.height = -1;
                    textView2.setVisibility(8);
                    aj0Var2.setVisibility(0);
                } else if (i27 == 18) {
                    this.C = Math.max(4000, Math.min((r0.length() / 50) * 1600, 10000));
                    w1Var.setTextSize(1, 14.0f);
                    w1Var.setGravity(16);
                    w1Var.setText((CharSequence) obj);
                    textView.setVisibility(8);
                    linearLayout.setVisibility(8);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    layoutParams.bottomMargin = AndroidUtilities.dp(7.0f);
                    layoutParams.height = -1;
                    layoutParams2.gravity = 51;
                    int dp4 = AndroidUtilities.dp(8.0f);
                    layoutParams2.bottomMargin = dp4;
                    layoutParams2.topMargin = dp4;
                    aj0Var2.setVisibility(0);
                    aj0Var2.e(R.raw.chats_infotip, 36, 36);
                    aj0Var2.setProgress(0.0f);
                    aj0Var2.d();
                    w1Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                } else if (i27 == 12) {
                    w1Var.setText(LocaleController.getString(R.string.ColorThemeChanged));
                    aj0Var2.setImageResource(R.drawable.toast_pallete);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(48.0f);
                    layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                    ((FrameLayout.LayoutParams) textView2.getLayoutParams()).rightMargin = AndroidUtilities.dp(48.0f);
                    String string5 = LocaleController.getString(R.string.ColorThemeChangedInfo);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string5);
                    int indexOf3 = string5.indexOf(42);
                    int lastIndexOf3 = string5.lastIndexOf(42);
                    if (indexOf3 >= 0 && lastIndexOf3 >= 0 && indexOf3 != lastIndexOf3) {
                        spannableStringBuilder3.replace(lastIndexOf3, lastIndexOf3 + 1, (CharSequence) "");
                        spannableStringBuilder3.replace(indexOf3, indexOf3 + 1, (CharSequence) "");
                        spannableStringBuilder3.setSpan(new a51("tg://settings/themes"), indexOf3, lastIndexOf3 - 1, 33);
                    }
                    textView2.setText(spannableStringBuilder3);
                    textView2.setVisibility(0);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(2);
                    textView.setVisibility(8);
                    linearLayout.setVisibility(0);
                    aj0Var2.setVisibility(0);
                } else {
                    str = "";
                    if (i27 == 84) {
                        w1Var.setVisibility(0);
                        w1Var.setTextSize(1, 15.0f);
                        w1Var.setTypeface(Typeface.DEFAULT);
                        w1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumTranscriptionHint)));
                        aj0Var2.setVisibility(0);
                        aj0Var2.e(R.raw.voice_to_text, 36, 36);
                        aj0Var2.setProgress(0.0f);
                        aj0Var2.d();
                        layoutParams.leftMargin = org.telegram.ui.b.e(58.0f, R.string.PremiumMore, textView);
                        layoutParams.rightMargin = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                        int dp5 = AndroidUtilities.dp(6.0f);
                        layoutParams.bottomMargin = dp5;
                        layoutParams.topMargin = dp5;
                        layoutParams.height = -2;
                        t9Var.setVisibility(8);
                        textView2.setVisibility(8);
                        textView.setVisibility(0);
                        linearLayout.setVisibility(0);
                        imageView.setVisibility(8);
                    } else if (i27 == 85) {
                        w1Var.setVisibility(0);
                        w1Var.setTextSize(1, 15.0f);
                        w1Var.setTypeface(AndroidUtilities.bold());
                        w1Var.setText(LocaleController.getString(R.string.SwipeToReplyHint));
                        aj0Var2.setVisibility(0);
                        aj0Var2.e(R.raw.hint_swipe_reply, 64, 64);
                        aj0Var2.setProgress(0.0f);
                        aj0Var2.d();
                        textView2.setVisibility(0);
                        layoutParams.leftMargin = org.telegram.ui.b.e(58.0f, R.string.SwipeToReplyHintMessage, textView2);
                        layoutParams.rightMargin = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        layoutParams.height = -2;
                        t9Var.setVisibility(8);
                        linearLayout.setVisibility(8);
                    } else if (i27 == 90 || i27 == 91 || i27 == 92 || i27 == 93 || i27 == 94) {
                        switch (i27) {
                            case 90:
                                w1Var.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) eg.q0.f(), new Object[0]));
                                break;
                            case 91:
                                w1Var.setText(LocaleController.getString(R.string.BoostingSelectUpToWarningUsers));
                                break;
                            case 92:
                                w1Var.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]));
                                break;
                            case 93:
                                w1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0])));
                                break;
                            case 94:
                                w1Var.setText(LocaleController.getString(R.string.BoostingOnlyRecipientCode));
                                break;
                        }
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                        w1Var.setTextSize(1, 15.0f);
                        linearLayout.setVisibility(8);
                        w1Var.setTypeface(Typeface.DEFAULT);
                        textView2.setVisibility(8);
                        aj0Var2.setVisibility(0);
                        aj0Var2.e(R.raw.chats_infotip, 36, 36);
                        aj0Var2.setProgress(0.0f);
                        aj0Var2.d();
                    } else if (i27 == 2 || i27 == 4) {
                        if (i10 == 2) {
                            w1Var.setText(LocaleController.getString(R.string.ChatArchived));
                        } else {
                            w1Var.setText(LocaleController.getString(R.string.ChatsArchived));
                        }
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                        layoutParams.rightMargin = 0;
                        w1Var.setTextSize(1, 15.0f);
                        linearLayout.setVisibility(0);
                        w1Var.setTypeface(Typeface.DEFAULT);
                        textView2.setVisibility(8);
                        aj0Var2.setVisibility(0);
                        aj0Var2.e(R.raw.chats_archived, 36, 36);
                        aj0Var2.setProgress(0.0f);
                        aj0Var2.d();
                    } else if (i10 == 82) {
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        w1Var.setText(LocaleController.getString(photoEntry.isVideo ? R.string.AttachMediaVideoDeselected : R.string.AttachMediaPhotoDeselected));
                        linearLayout.setVisibility(0);
                        w1Var.setTextSize(1, 15.0f);
                        w1Var.setTypeface(Typeface.DEFAULT);
                        textView2.setVisibility(8);
                        t9Var.setVisibility(0);
                        t9Var.setRoundRadius(AndroidUtilities.dp(2.0f));
                        String str4 = photoEntry.thumbPath;
                        if (str4 != null) {
                            t9Var.f(str4, null, org.telegram.ui.ActionBar.g6.R4);
                        } else if (photoEntry.path != null) {
                            t9Var.p(photoEntry.orientation, photoEntry.invert, true);
                            if (photoEntry.isVideo) {
                                t9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
                            } else {
                                t9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
                            }
                        } else {
                            t9Var.setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
                        }
                    } else {
                        layoutParams.leftMargin = AndroidUtilities.dp(45.0f);
                        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                        layoutParams.rightMargin = 0;
                        w1Var.setTextSize(1, 15.0f);
                        linearLayout.setVisibility(0);
                        Typeface typeface = Typeface.DEFAULT;
                        w1Var.setTypeface(typeface);
                        textView2.setVisibility(8);
                        aj0Var2.setVisibility(8);
                        int i38 = this.G;
                        if (i38 == 88) {
                            String str5 = (String) obj;
                            int intValue5 = ((Integer) obj2).intValue();
                            if (intValue5 > 0) {
                                int dp6 = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString())));
                                layoutParams.leftMargin = AndroidUtilities.dp(48.0f);
                                layoutParams.rightMargin = dp6;
                                layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
                                layoutParams3.leftMargin = AndroidUtilities.dp(48.0f);
                                layoutParams3.rightMargin = dp6;
                                w1Var.setText(LocaleController.formatString("FolderLinkDeletedTitle", R.string.FolderLinkDeletedTitle, str5));
                                w1Var.setTypeface(AndroidUtilities.bold());
                                textView2.setVisibility(0);
                                textView2.setText(LocaleController.formatPluralString("FolderLinkDeletedSubtitle", intValue5, new Object[0]));
                            } else {
                                w1Var.setTypeface(typeface);
                                int i39 = R.string.FolderLinkDeleted;
                                if (str5 == null) {
                                    str5 = str;
                                }
                                w1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FolderLinkDeleted", i39, str5.replace('*', (char) 10033))));
                            }
                        } else if (i38 == 81 || i38 == 0 || i38 == 26) {
                            w1Var.setText(LocaleController.getString(R.string.HistoryClearedUndo));
                        } else if (i38 == 27) {
                            w1Var.setText(LocaleController.getString(R.string.ChatsDeletedUndo));
                        } else if (i38 == 95) {
                            if (DialogObject.isChatDialog(longValue)) {
                                TLRPC.Chat chat7 = MessagesController.getInstance(i20).getChat(Long.valueOf(-longValue));
                                if (ChatObject.isMonoForum(chat7)) {
                                    w1Var.setText(LocaleController.getString(R.string.MonoforumDeletedUndo));
                                } else if (!ChatObject.isChannel(chat7) || chat7.megagroup) {
                                    w1Var.setText(LocaleController.getString(R.string.GroupLeftUndo));
                                } else {
                                    w1Var.setText(LocaleController.getString(R.string.ChannelLeftUndo));
                                }
                            } else {
                                w1Var.setText(LocaleController.getString(R.string.ChatDeletedUndo));
                            }
                        } else if (DialogObject.isChatDialog(longValue)) {
                            TLRPC.Chat chat8 = MessagesController.getInstance(i20).getChat(Long.valueOf(-longValue));
                            if (ChatObject.isMonoForum(chat8)) {
                                w1Var.setText(LocaleController.getString(R.string.MonoforumDeletedUndo));
                            } else if (!ChatObject.isChannel(chat8) || chat8.megagroup) {
                                w1Var.setText(LocaleController.getString(R.string.GroupDeletedUndo));
                            } else {
                                w1Var.setText(LocaleController.getString(R.string.ChannelDeletedUndo));
                            }
                        } else {
                            w1Var.setText(LocaleController.getString(R.string.ChatDeletedUndo));
                        }
                        if (this.G != 81) {
                            for (int i40 = 0; i40 < arrayList.size(); i40++) {
                                MessagesController messagesController = MessagesController.getInstance(i20);
                                long longValue2 = ((Long) arrayList.get(i40)).longValue();
                                int i41 = this.G;
                                messagesController.addDialogAction(longValue2, i41 == 0 || i41 == 26);
                            }
                        }
                    }
                }
                z10 = false;
                StringBuilder sb222 = new StringBuilder();
                sb222.append((Object) w1Var.getText());
                if (textView2.getVisibility() != 0) {
                }
                sb222.append(textView2.getVisibility() != 0 ? ". " + ((Object) textView2.getText()) : str);
                AndroidUtilities.makeAccessibilityAnnouncement(sb222.toString());
                if (!f()) {
                }
                if (getVisibility() == 0) {
                }
            }
        }
        str = "";
        z10 = false;
        StringBuilder sb2222 = new StringBuilder();
        sb2222.append((Object) w1Var.getText());
        if (textView2.getVisibility() != 0) {
        }
        sb2222.append(textView2.getVisibility() != 0 ? ". " + ((Object) textView2.getText()) : str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb2222.toString());
        if (!f()) {
        }
        if (getVisibility() == 0) {
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f9 = this.L;
        ShapeDrawable shapeDrawable = this.Q;
        if (f9 != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.W) + this.S + AndroidUtilities.dp(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i10 = this.G;
        if (i10 == 1 || i10 == 95 || i10 == 0 || i10 == 27 || i10 == 26 || i10 == 81 || i10 == 88) {
            int ceil = this.C > 0 ? (int) Math.ceil(r2 / 1000.0f) : 0;
            int i11 = this.D;
            TextPaint textPaint = this.y;
            if (i11 != ceil) {
                this.D = ceil;
                this.E = String.format("%d", Integer.valueOf(Math.max(1, ceil)));
                StaticLayout staticLayout = this.T;
                if (staticLayout != null) {
                    this.U = staticLayout;
                    this.V = 0.0f;
                }
                this.F = (int) Math.ceil(textPaint.measureText(r2));
                this.T = new StaticLayout(this.E, textPaint, ConnectionsManager.DEFAULT_DATACENTER_ID, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f10 = this.V;
            if (f10 < 1.0f) {
                float f11 = f10 + 0.10666667f;
                this.V = f11;
                if (f11 > 1.0f) {
                    this.V = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.U;
            RectF rectF = this.B;
            if (staticLayout2 != null) {
                float f12 = this.V;
                if (f12 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.F / 2), (AndroidUtilities.dp(10.0f) * this.V) + AndroidUtilities.dp(17.2f));
                    this.U.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.T != null) {
                float f13 = this.V;
                if (f13 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f13));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.F / 2), org.telegram.ui.th.b(1.0f, this.V, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(17.2f)));
                this.T.draw(canvas);
                if (this.V != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (this.C / 5000.0f) * (-360.0f), false, this.A);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.C - (elapsedRealtime - this.K);
        this.C = j10;
        this.K = elapsedRealtime;
        if (j10 <= 0) {
            e(this.P, true);
        }
        if (this.G != 82) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.r, TLObject.FLAG_30));
        this.Q.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f9) {
        if (this.L != f9) {
            this.L = f9;
            setTranslationY(((this.W - this.S) + AndroidUtilities.dp(8.0f)) - this.L);
            invalidate();
        }
    }

    public void setEnterOffset(float f9) {
        if (this.W != f9) {
            this.W = f9;
            setTranslationY(((f9 - this.S) + AndroidUtilities.dp(8.0f)) - this.L);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i10) {
        this.S = i10;
    }

    public void setHideAnimationType(int i10) {
        this.P = i10;
    }

    public void setInfoText(CharSequence charSequence) {
        this.O = charSequence;
    }

    public UndoView(Context context, qc1 qc1Var) {
        this(context, qc1Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = 0;
        this.x = UserConfig.selectedAccount;
        this.G = -1;
        this.P = 1;
        this.S = AndroidUtilities.dp(8.0f);
        this.V = 1.0f;
        this.R = c6Var;
        this.s = o2Var;
        this.N = z10;
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, context, c6Var);
        this.b = w1Var;
        w1Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Hi;
        w1Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.Gi;
        w1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        w1Var.setMovementMethod(new f51(this));
        addView(w1Var, i7.f6.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        addView(textView, i7.f6.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        aj0 aj0Var = new aj0(context);
        this.f = aj0Var;
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.g6.Fi;
        aj0Var.h(org.telegram.ui.ActionBar.g6.v0(i12, c6Var) | (-16777216), "info1");
        aj0Var.h(org.telegram.ui.ActionBar.g6.v0(i12, c6Var) | (-16777216), "info2");
        aj0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc12");
        aj0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc11");
        aj0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc10");
        aj0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc9");
        aj0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc8");
        aj0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc7");
        aj0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc6");
        aj0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc5");
        aj0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc4");
        aj0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc3");
        aj0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc2");
        aj0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "luc1");
        aj0Var.h(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), "Oval");
        addView(aj0Var, i7.f6.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        t9 t9Var = new t9(context);
        this.h = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(t9Var, i7.f6.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(i11, c6Var) & 587202559, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
        addView(linearLayout, i7.f6.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new e51(this, 0));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView, i7.f6.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView2.setText(LocaleController.getString(R.string.UndoNoCaps));
        linearLayout.addView(textView2, i7.f6.t(-2, -2, 19, 6, 4, 8, 4));
        this.B = new RectF(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(33.0f), AndroidUtilities.dp(33.0f));
        Paint paint = new Paint(1);
        this.A = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        TextPaint textPaint = new TextPaint(1);
        this.y = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        setWillNotDraw(false);
        this.Q = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        setOnTouchListener(new mh.d(25));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void h(int i10, long j10) {
    }
}
