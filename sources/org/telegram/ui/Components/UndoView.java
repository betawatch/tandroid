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
import org.telegram.ui.ce1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
@Deprecated
/* loaded from: classes3.dex */
public class UndoView extends FrameLayout {
    public static final /* synthetic */ int e0 = 0;
    public final Paint E;
    public final RectF F;
    public long G;
    public int H;
    public String I;
    public int J;
    public int K;
    public ArrayList L;
    public Runnable M;
    public Runnable N;
    public long O;
    public float P;
    public boolean Q;
    public final boolean R;
    public CharSequence S;
    public int T;
    public final ShapeDrawable U;
    public final org.telegram.ui.ActionBar.c6 V;
    public int W;
    public int a;
    public StaticLayout a0;
    public final org.telegram.ui.Cells.y1 b;
    public StaticLayout b0;
    public final TextView c;
    public float c0;
    public final TextView d;
    public float d0;
    public final ImageView e;
    public final bk0 f;
    public final z9 h;
    public final LinearLayout n;
    public int r;
    public final org.telegram.ui.ActionBar.m2 s;
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
        return org.telegram.ui.ActionBar.g6.w0(i10, this.V);
    }

    public final boolean d() {
        int i10;
        Object obj;
        int i11 = this.K;
        if (i11 == 11 || i11 == 24 || i11 == 6 || i11 == 3 || i11 == 5 || i11 == 13 || i11 == 14 || i11 == 74) {
            return true;
        }
        if ((i11 == 7 && MessagesController.getInstance(this.x).dialogFilters.isEmpty()) || (i10 = this.K) == 83 || i10 == 85) {
            return true;
        }
        return i10 == 88 && (obj = this.w) != null && ((Integer) obj).intValue() > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.P == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        float measuredHeight = (getMeasuredHeight() - this.d0) + AndroidUtilities.dp(9.0f);
        if (measuredHeight > 0.0f) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            super.dispatchDraw(canvas);
        }
        canvas.restore();
    }

    public void e(int i10, boolean z10) {
        if (getVisibility() == 0 && this.Q) {
            this.v = null;
            this.w = null;
            int i11 = 0;
            this.Q = false;
            Runnable runnable = this.M;
            if (runnable != null) {
                if (z10) {
                    runnable.run();
                }
                this.M = null;
            }
            Runnable runnable2 = this.N;
            if (runnable2 != null) {
                if (!z10) {
                    runnable2.run();
                }
                this.N = null;
            }
            int i12 = this.K;
            if (i12 == 0 || i12 == 1 || i12 == 95 || i12 == 26 || i12 == 27) {
                for (int i13 = 0; i13 < this.L.size(); i13++) {
                    long longValue = ((Long) this.L.get(i13)).longValue();
                    MessagesController messagesController = MessagesController.getInstance(this.x);
                    int i14 = this.K;
                    messagesController.removeDialogAction(longValue, i14 == 0 || i14 == 26, z10);
                    h(this.K, longValue);
                }
            }
            boolean z11 = this.R;
            if (i10 == 0) {
                setEnterOffset((z11 ? -1.0f : 1.0f) * (this.W + this.r));
                setVisibility(4);
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (i10 == 1) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z11 ? -1.0f : 1.0f) * (this.W + this.r)));
                animatorSet.setDuration(250L);
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.ALPHA, 0.0f));
                animatorSet.setDuration(180L);
            }
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.addListener(new v61(this, i11));
            animatorSet.start();
        }
    }

    public final boolean f() {
        int i10 = this.K;
        return i10 == 12 || i10 == 15 || i10 == 24 || i10 == 74 || i10 == 83;
    }

    public final boolean g() {
        int i10 = this.K;
        return i10 == 6 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 8 || i10 == 87 || i10 == 9 || i10 == 10 || i10 == 13 || i10 == 14 || i10 == 19 || i10 == 20 || i10 == 21 || i10 == 22 || i10 == 23 || i10 == 30 || i10 == 31 || i10 == 32 || i10 == 102 || i10 == 33 || i10 == 34 || i10 == 35 || i10 == 36 || i10 == 74 || i10 == 37 || i10 == 38 || i10 == 39 || i10 == 40 || i10 == 42 || i10 == 43 || i10 == 77 || i10 == 44 || i10 == 78 || i10 == 79 || i10 == 100 || i10 == 101 || i10 == 83;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.U;
    }

    public Object getCurrentInfoObject() {
        return this.v;
    }

    public float getEnterOffset() {
        return this.d0;
    }

    public final void i() {
        org.telegram.ui.ActionBar.g6.x1(-115203550, this.U);
        this.b.setTextColor(-1);
        this.c.setTextColor(-1);
        bk0 bk0Var = this.f;
        bk0Var.h(-14540254, "info1");
        bk0Var.h(-14540254, "info2");
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
    /* JADX WARN: Removed duplicated region for block: B:420:0x16e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x1703  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x1728  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x1813  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x1767  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x1716  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x089d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ArrayList arrayList, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        MovementMethod movementMethod;
        org.telegram.ui.Cells.y1 y1Var;
        String str;
        int i11;
        ImageView imageView;
        TextView textView;
        int i12;
        boolean z10;
        bk0 bk0Var;
        long j10;
        int i13;
        int dp;
        int i14;
        CharSequence replaceTags;
        int i15;
        int i16;
        CharSequence charSequence;
        int i17;
        CharSequence replaceTags2;
        String string;
        int i18;
        String str2;
        int i19;
        int i20;
        SpannableStringBuilder replaceTags3;
        int i21;
        int i22;
        if (!AndroidUtilities.shouldShowClipboardToast() && ((i22 = this.K) == 52 || i22 == 56 || i22 == 57 || i22 == 58 || i22 == 59 || i22 == 60 || i22 == 80 || i22 == 33)) {
            return;
        }
        Runnable runnable3 = this.M;
        if (runnable3 != null) {
            runnable3.run();
        }
        this.Q = true;
        this.M = runnable;
        this.N = runnable2;
        this.L = arrayList;
        Long l4 = (Long) arrayList.get(0);
        long longValue = l4.longValue();
        this.K = i10;
        this.G = 5000L;
        this.v = obj;
        this.w = obj2;
        this.O = SystemClock.elapsedRealtime();
        String string2 = LocaleController.getString(R.string.UndoNoCaps);
        TextView textView2 = this.d;
        textView2.setText(string2);
        ImageView imageView2 = this.e;
        imageView2.setVisibility(0);
        bk0 bk0Var2 = this.f;
        bk0Var2.setPadding(0, 0, 0, 0);
        bk0Var2.setScaleX(1.0f);
        bk0Var2.setScaleY(1.0f);
        org.telegram.ui.Cells.y1 y1Var2 = this.b;
        y1Var2.setTextSize(1, 15.0f);
        z9 z9Var = this.h;
        z9Var.setVisibility(8);
        y1Var2.setGravity(51);
        TextView textView3 = this.c;
        ((FrameLayout.LayoutParams) textView3.getLayoutParams()).leftMargin = AndroidUtilities.dp(58.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y1Var2.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
        layoutParams.bottomMargin = 0;
        bk0Var2.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) bk0Var2.getLayoutParams();
        layoutParams2.gravity = 19;
        layoutParams2.bottomMargin = 0;
        layoutParams2.topMargin = 0;
        layoutParams2.leftMargin = AndroidUtilities.dp(3.0f);
        layoutParams2.width = AndroidUtilities.dp(54.0f);
        layoutParams2.height = -2;
        y1Var2.setMinHeight(0);
        if ((runnable == null && runnable2 == null) || i10 == 83) {
            setOnClickListener(new u61(this, 1));
            movementMethod = null;
            setOnTouchListener(null);
        } else {
            setOnClickListener(null);
            setOnTouchListener(new ci.d(26));
            movementMethod = null;
        }
        y1Var2.setMovementMethod(movementMethod);
        boolean g10 = g();
        LinearLayout linearLayout = this.n;
        int i23 = this.x;
        int i24 = 36;
        if (g10) {
            if (i10 == 83) {
                textView3.setSingleLine(false);
                replaceTags = LocaleController.getString(R.string.SoundAdded);
                charSequence = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SoundAddedSubtitle), runnable);
                this.M = null;
                i16 = R.raw.sound_download;
                this.G = 4000L;
            } else if (i10 == 74) {
                textView3.setSingleLine(false);
                replaceTags = LocaleController.getString(R.string.ReportChatSent);
                charSequence = LocaleController.formatString("ReportSentInfo", R.string.ReportSentInfo, new Object[0]);
                i16 = R.raw.ic_admin;
                this.G = 4000L;
            } else {
                if (i10 == 34) {
                    TLRPC.User user = (TLRPC.User) obj;
                    if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                        i20 = 0;
                        replaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelInvitedUser", R.string.VoipChannelInvitedUser, UserObject.getFirstName(user)));
                    } else {
                        i20 = 0;
                        replaceTags3 = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupInvitedUser", R.string.VoipGroupInvitedUser, UserObject.getFirstName(user)));
                    }
                    k9 k9Var = new k9();
                    k9Var.u(AndroidUtilities.dp(12.0f));
                    k9Var.m(i23, user);
                    z9Var.e(user, k9Var);
                    z9Var.setVisibility(i20);
                    this.G = 3000L;
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
                    k9 k9Var2 = new k9();
                    k9Var2.u(AndroidUtilities.dp(12.0f));
                    TLObject tLObject = (TLObject) obj;
                    k9Var2.j(i23, tLObject);
                    z9Var.e(tLObject, k9Var2);
                    z9Var.setVisibility(0);
                    this.G = 3000L;
                } else if (i10 == 37) {
                    k9 k9Var3 = new k9();
                    k9Var3.u(AndroidUtilities.dp(12.0f));
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj;
                        k9Var3.m(i23, user3);
                        z9Var.e(user3, k9Var3);
                        str2 = ContactsController.formatName(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj;
                        k9Var3.k(i23, chat3);
                        z9Var.e(chat3, k9Var3);
                        str2 = chat3.title;
                    }
                    if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                        i19 = 0;
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelUserChanged", R.string.VoipChannelUserChanged, str2));
                    } else {
                        i19 = 0;
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserChanged", R.string.VoipGroupUserChanged, str2));
                    }
                    z9Var.setVisibility(i19);
                    this.G = 3000L;
                } else {
                    if (i10 == 33) {
                        replaceTags = LocaleController.getString(R.string.VoipGroupCopyInviteLinkCopied);
                        int i25 = R.raw.voip_invite;
                        this.G = 3000L;
                        i16 = i25;
                        y1Var = y1Var2;
                    } else {
                        int i26 = 21;
                        if (i10 == 77) {
                            replaceTags = (CharSequence) obj;
                            i17 = R.raw.payment_success;
                            this.G = 5000L;
                            if (this.s == null || !(obj2 instanceof TLRPC.Message)) {
                                y1Var = y1Var2;
                            } else {
                                setOnTouchListener(null);
                                y1Var = y1Var2;
                                y1Var.setMovementMethod(null);
                                setOnClickListener(new rt(i26, this, (TLRPC.Message) obj2));
                            }
                        } else {
                            y1Var = y1Var2;
                            if (i10 == 30) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeak", R.string.VoipGroupUserCantNowSpeak, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                i17 = R.raw.voip_muted;
                                this.G = 3000L;
                            } else if (i10 == 35) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeakForYou", R.string.VoipGroupUserCantNowSpeakForYou, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : obj instanceof TLRPC.Chat ? ((TLRPC.Chat) obj).title : ""));
                                i17 = R.raw.voip_muted;
                                this.G = 3000L;
                            } else if (i10 == 31) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeak", R.string.VoipGroupUserCanNowSpeak, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                i17 = R.raw.voip_unmuted;
                                this.G = 3000L;
                            } else if (i10 == 38) {
                                replaceTags = obj instanceof TLRPC.Chat ? AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupYouCanNowSpeakIn", R.string.VoipGroupYouCanNowSpeakIn, ((TLRPC.Chat) obj).title)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupYouCanNowSpeak));
                                i17 = R.raw.voip_allow_talk;
                                this.G = 3000L;
                            } else if (i10 == 42) {
                                replaceTags = ChatObject.isChannelOrGiga((TLRPC.Chat) obj) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundMuted)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundMuted));
                                i17 = R.raw.ic_mute;
                                this.G = 3000L;
                            } else if (i10 == 43) {
                                replaceTags = ChatObject.isChannelOrGiga((TLRPC.Chat) obj) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundUnmuted)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundUnmuted));
                                i17 = R.raw.ic_unmute;
                                this.G = 3000L;
                            } else {
                                int i27 = this.K;
                                int i28 = 39;
                                if (i27 != 39) {
                                    if (i27 == 100) {
                                        i28 = 39;
                                    } else {
                                        int i29 = 40;
                                        if (i27 != 40) {
                                            if (i27 == 101) {
                                                i29 = 40;
                                            } else if (i10 == 36) {
                                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeakForYou", R.string.VoipGroupUserCanNowSpeakForYou, obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title));
                                                i17 = R.raw.voip_unmuted;
                                                this.G = 3000L;
                                            } else {
                                                if (i10 == 32 || i10 == 102) {
                                                    String firstName = obj instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) obj) : ((TLRPC.Chat) obj).title;
                                                    replaceTags = i10 == 102 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipConferenceKicked, firstName)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipGroupRemovedFromGroup, firstName));
                                                    i15 = R.raw.ic_ban;
                                                    this.G = 3000L;
                                                } else if (i10 == 9 || i10 == 10) {
                                                    TLRPC.User user4 = (TLRPC.User) obj;
                                                    replaceTags = i10 == 9 ? AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferChannelToast", R.string.EditAdminTransferChannelToast, UserObject.getFirstName(user4))) : AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferGroupToast", R.string.EditAdminTransferGroupToast, UserObject.getFirstName(user4)));
                                                    i15 = R.raw.contact_check;
                                                } else if (i10 == 8) {
                                                    replaceTags = LocaleController.formatString("NowInContacts", R.string.NowInContacts, UserObject.getFirstName((TLRPC.User) obj));
                                                    i16 = R.raw.contact_check;
                                                } else if (i10 == 87) {
                                                    replaceTags = LocaleController.formatString(R.string.ProxyAddedSuccess, new Object[0]);
                                                    i17 = R.raw.contact_check;
                                                } else if (i10 == 22) {
                                                    if (DialogObject.isUserDialog(longValue)) {
                                                        replaceTags = obj == null ? LocaleController.getString(R.string.MainProfilePhotoSetHint) : LocaleController.getString(R.string.MainProfileVideoSetHint);
                                                    } else {
                                                        TLRPC.Chat chat4 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-longValue));
                                                        replaceTags = (!ChatObject.isChannel(chat4) || chat4.megagroup) ? obj == null ? LocaleController.getString(R.string.MainGroupProfilePhotoSetHint) : LocaleController.getString(R.string.MainGroupProfileVideoSetHint) : obj == null ? LocaleController.getString(R.string.MainChannelProfilePhotoSetHint) : LocaleController.getString(R.string.MainChannelProfileVideoSetHint);
                                                    }
                                                    i17 = R.raw.contact_check;
                                                } else if (i10 == 23) {
                                                    replaceTags = LocaleController.getString(R.string.ChatWasMovedToMainList);
                                                    i17 = R.raw.contact_check;
                                                } else {
                                                    if (i10 == 6) {
                                                        replaceTags = LocaleController.getString(R.string.ArchiveHidden);
                                                        charSequence = LocaleController.getString(R.string.ArchiveHiddenInfo);
                                                        i16 = R.raw.chats_swipearchive;
                                                        i24 = 48;
                                                    } else {
                                                        if (i27 == 13) {
                                                            replaceTags = LocaleController.getString(R.string.QuizWellDone);
                                                            charSequence = LocaleController.getString(R.string.QuizWellDoneInfo);
                                                            i16 = R.raw.wallet_congrats;
                                                        } else if (i27 == 14) {
                                                            replaceTags = LocaleController.getString(R.string.QuizWrongAnswer);
                                                            charSequence = LocaleController.getString(R.string.QuizWrongAnswerInfo);
                                                            i16 = R.raw.wallet_science;
                                                        } else {
                                                            if (i10 == 7) {
                                                                replaceTags = LocaleController.getString(R.string.ArchivePinned);
                                                                string = MessagesController.getInstance(i23).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ArchivePinnedInfo) : null;
                                                                i18 = R.raw.chats_infotip;
                                                            } else if (i10 == 20 || i10 == 21) {
                                                                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                                                                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, y1Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, y1Var.getPaint().getFontMetricsInt());
                                                                this.a = dialogFilter.title_noanimate ? 26 : 0;
                                                                long j11 = longValue;
                                                                if (j11 != 0) {
                                                                    if (DialogObject.isEncryptedDialog(j11)) {
                                                                        j11 = org.telegram.messenger.g0.l(MessagesController.getInstance(i23), j11).user_id;
                                                                    }
                                                                    if (DialogObject.isUserDialog(j11)) {
                                                                        TLRPC.User user5 = MessagesController.getInstance(i23).getUser(Long.valueOf(j11));
                                                                        String firstName2 = UserObject.getFirstName(user5);
                                                                        if (UserObject.isUserSelf(user5)) {
                                                                            firstName2 = LocaleController.getString(R.string.SavedMessages);
                                                                        } else if (UserObject.isReplyUser(user5)) {
                                                                            firstName2 = LocaleController.getString(R.string.RepliesTitle);
                                                                        }
                                                                        replaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserAddedToExisting, firstName2, replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserRemovedFrom, firstName2, replaceAnimatedEmoji));
                                                                    } else {
                                                                        TLRPC.Chat chat5 = MessagesController.getInstance(i23).getChat(Long.valueOf(-j11));
                                                                        replaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatAddedToExisting, chat5.title, replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatRemovedFrom, chat5.title, replaceAnimatedEmoji));
                                                                    }
                                                                } else {
                                                                    replaceTags2 = i10 == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsAddedToExisting, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), replaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsRemovedFrom, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), replaceAnimatedEmoji));
                                                                }
                                                                CharSequence charSequence2 = replaceTags2;
                                                                i16 = i10 == 20 ? R.raw.folder_in : R.raw.folder_out;
                                                                replaceTags = charSequence2;
                                                                charSequence = null;
                                                                i24 = 36;
                                                            } else if (i10 == 19) {
                                                                replaceTags = this.S;
                                                                i17 = R.raw.ic_delete;
                                                            } else if (i10 == 82) {
                                                                replaceTags = LocaleController.getString(((MediaController.PhotoEntry) obj).isVideo ? R.string.AttachMediaVideoDeselected : R.string.AttachMediaPhotoDeselected);
                                                                charSequence = null;
                                                                i16 = 0;
                                                            } else if (i10 == 78 || i10 == 79) {
                                                                int intValue = ((Integer) obj).intValue();
                                                                replaceTags = i10 == 78 ? LocaleController.formatPluralString("PinnedDialogsCount", intValue, new Object[0]) : LocaleController.formatPluralString("UnpinnedDialogsCount", intValue, new Object[0]);
                                                                i17 = this.K == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                                                if (obj2 instanceof Integer) {
                                                                    this.G = ((Integer) obj2).intValue();
                                                                }
                                                            } else {
                                                                replaceTags = i10 == 3 ? LocaleController.getString(R.string.ChatArchived) : LocaleController.getString(R.string.ChatsArchived);
                                                                string = MessagesController.getInstance(i23).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ChatArchivedInfo) : null;
                                                                i18 = R.raw.chats_infotip;
                                                            }
                                                            i16 = i18;
                                                            charSequence = string;
                                                        }
                                                        i24 = 44;
                                                    }
                                                    y1Var.setText(replaceTags);
                                                    if (i16 == 0) {
                                                        bk0Var2.e(i16, i24, i24);
                                                        yj0 animatedDrawable = bk0Var2.getAnimatedDrawable();
                                                        animatedDrawable.h = false;
                                                        animatedDrawable.P(animatedDrawable.s());
                                                        bk0Var2.setVisibility(0);
                                                        bk0Var2.setProgress(0.0f);
                                                        bk0Var2.d();
                                                    } else {
                                                        bk0Var2.setVisibility(8);
                                                    }
                                                    if (charSequence == null) {
                                                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                                                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                                                        layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                                                        ((FrameLayout.LayoutParams) textView3.getLayoutParams()).rightMargin = AndroidUtilities.dp(8.0f);
                                                        textView3.setText(charSequence);
                                                        textView3.setVisibility(0);
                                                        y1Var.setTextSize(1, 14.0f);
                                                        y1Var.setTypeface(AndroidUtilities.bold());
                                                        i21 = 8;
                                                    } else {
                                                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                                                        layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                                                        layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                                                        i21 = 8;
                                                        textView3.setVisibility(8);
                                                        y1Var.setTextSize(1, 15.0f);
                                                        y1Var.setTypeface(Typeface.DEFAULT);
                                                    }
                                                    linearLayout.setVisibility(i21);
                                                }
                                                i16 = i15;
                                                charSequence = null;
                                                i24 = 36;
                                                y1Var.setText(replaceTags);
                                                if (i16 == 0) {
                                                }
                                                if (charSequence == null) {
                                                }
                                                linearLayout.setVisibility(i21);
                                            }
                                        }
                                        String string3 = LocaleController.getString(i27 == i29 ? R.string.VoipGroupAudioRecordSaved : R.string.VoipGroupVideoRecordSaved);
                                        i17 = R.raw.voip_record_saved;
                                        this.G = 4000L;
                                        y1Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
                                        int indexOf = string3.indexOf("**");
                                        int lastIndexOf = string3.lastIndexOf("**");
                                        if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                                            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                                            try {
                                                spannableStringBuilder.setSpan(new q61("tg://openmessage?user_id=" + UserConfig.getInstance(i23).getClientUserId()), indexOf, lastIndexOf - 2, 33);
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                        }
                                        replaceTags = spannableStringBuilder;
                                        i24 = 36;
                                    }
                                }
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i27 == i28 ? R.string.VoipGroupAudioRecordStarted : R.string.VoipGroupVideoRecordStarted));
                                i15 = R.raw.voip_record_start;
                                this.G = 3000L;
                                i16 = i15;
                                charSequence = null;
                                i24 = 36;
                                y1Var.setText(replaceTags);
                                if (i16 == 0) {
                                }
                                if (charSequence == null) {
                                }
                                linearLayout.setVisibility(i21);
                            }
                        }
                        i16 = i17;
                    }
                    charSequence = null;
                    y1Var.setText(replaceTags);
                    if (i16 == 0) {
                    }
                    if (charSequence == null) {
                    }
                    linearLayout.setVisibility(i21);
                }
                y1Var = y1Var2;
                charSequence = null;
                i16 = 0;
                y1Var.setText(replaceTags);
                if (i16 == 0) {
                }
                if (charSequence == null) {
                }
                linearLayout.setVisibility(i21);
            }
            y1Var = y1Var2;
            y1Var.setText(replaceTags);
            if (i16 == 0) {
            }
            if (charSequence == null) {
            }
            linearLayout.setVisibility(i21);
        } else {
            y1Var = y1Var2;
            int i30 = this.K;
            if (i30 == 45 || i30 == 46 || i30 == 47 || i30 == 52 || i30 == 53 || i30 == 54 || i30 == 55 || i30 == 56 || i30 == 57 || i30 == 58 || i30 == 59 || i30 == 60 || i30 == 71 || i30 == 70 || i30 == 75 || i30 == 76 || i30 == 41 || i30 == 78 || i30 == 79 || i30 == 61) {
                str = "";
                i11 = i23;
                imageView = imageView2;
                textView = textView2;
                i12 = 8;
            } else {
                if (i30 != 80) {
                    if (i30 == 24 || i30 == 25) {
                        str = "";
                        int intValue2 = ((Integer) obj).intValue();
                        TLRPC.User user6 = (TLRPC.User) obj2;
                        imageView2.setVisibility(8);
                        bk0Var2.setVisibility(0);
                        if (intValue2 != 0) {
                            y1Var.setTypeface(AndroidUtilities.bold());
                            y1Var.setTextSize(1, 14.0f);
                            bk0Var2.a.clear();
                            int i31 = org.telegram.ui.ActionBar.g6.Hi;
                            bk0Var2.h(c(i31), "BODY");
                            bk0Var2.h(c(i31), "Wibe Big");
                            bk0Var2.h(c(i31), "Wibe Big 3");
                            bk0Var2.h(c(i31), "Wibe Small");
                            y1Var.setText(LocaleController.getString(R.string.ProximityAlertSet));
                            bk0Var2.e(R.raw.ic_unmute, 28, 28);
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
                            y1Var.setTypeface(Typeface.DEFAULT);
                            y1Var.setTextSize(1, 15.0f);
                            bk0Var2.a.clear();
                            int i32 = org.telegram.ui.ActionBar.g6.Hi;
                            bk0Var2.h(c(i32), "Body Main");
                            bk0Var2.h(c(i32), "Body Top");
                            bk0Var2.h(c(i32), "Line");
                            bk0Var2.h(c(i32), "Curve Big");
                            bk0Var2.h(c(i32), "Curve Small");
                            layoutParams.topMargin = AndroidUtilities.dp(14.0f);
                            y1Var.setText(LocaleController.getString(R.string.ProximityAlertCancelled));
                            bk0Var2.e(R.raw.ic_mute, 28, 28);
                            textView3.setVisibility(8);
                            textView2.setTextColor(c(org.telegram.ui.ActionBar.g6.Gi));
                            linearLayout.setVisibility(0);
                        }
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        bk0Var2.setProgress(0.0f);
                        bk0Var2.d();
                    } else if (i30 == 11) {
                        y1Var.setText(LocaleController.getString(R.string.AuthAnotherClientOk));
                        bk0Var2.e(R.raw.contact_check, 36, 36);
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                        textView3.setText(((TLRPC.TL_authorization) obj).app_name);
                        textView3.setVisibility(0);
                        y1Var.setTextSize(1, 14.0f);
                        y1Var.setTypeface(AndroidUtilities.bold());
                        textView2.setTextColor(c(org.telegram.ui.ActionBar.g6.p7));
                        imageView2.setVisibility(8);
                        linearLayout.setVisibility(0);
                        bk0Var2.setVisibility(0);
                        bk0Var2.setProgress(0.0f);
                        bk0Var2.d();
                    } else if (i30 == 15) {
                        this.G = 10000L;
                        textView2.setText(LocaleController.getString(R.string.Open));
                        y1Var.setText(LocaleController.getString(R.string.FilterAvailableTitle));
                        bk0Var2.e(R.raw.filter_new, 36, 36);
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
                            spannableStringBuilder2.setSpan(new q61("tg://settings/folders"), indexOf2, lastIndexOf2 - 1, 33);
                        }
                        textView3.setText(spannableStringBuilder2);
                        textView3.setVisibility(0);
                        textView3.setSingleLine(false);
                        textView3.setMaxLines(2);
                        linearLayout.setVisibility(0);
                        imageView2.setVisibility(8);
                        bk0Var2.setVisibility(0);
                        bk0Var2.setProgress(0.0f);
                        bk0Var2.d();
                    } else if (i30 == 16 || i30 == 17) {
                        str = "";
                        this.G = 4000L;
                        y1Var.setTextSize(1, 14.0f);
                        y1Var.setGravity(16);
                        y1Var.setMinHeight(AndroidUtilities.dp(30.0f));
                        String str3 = (String) obj;
                        if ("🎲".equals(str3)) {
                            y1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DiceInfo2)));
                            bk0Var2.setImageResource(R.drawable.dice);
                        } else {
                            if ("🎯".equals(str3)) {
                                y1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DartInfo)));
                            } else {
                                String serverString = LocaleController.getServerString("DiceEmojiInfo_" + str3);
                                if (TextUtils.isEmpty(serverString)) {
                                    y1Var.setText(Emoji.replaceEmoji(LocaleController.formatString("DiceEmojiInfo", R.string.DiceEmojiInfo, str3), y1Var.getPaint().getFontMetricsInt(), false));
                                } else {
                                    y1Var.setText(Emoji.replaceEmoji(serverString, y1Var.getPaint().getFontMetricsInt(), false));
                                }
                            }
                            bk0Var2.setImageDrawable(Emoji.getEmojiDrawable(str3));
                            bk0Var2.setScaleType(ImageView.ScaleType.FIT_XY);
                            layoutParams.topMargin = AndroidUtilities.dp(14.0f);
                            layoutParams.bottomMargin = AndroidUtilities.dp(14.0f);
                            layoutParams2.leftMargin = AndroidUtilities.dp(14.0f);
                            layoutParams2.width = AndroidUtilities.dp(26.0f);
                            layoutParams2.height = AndroidUtilities.dp(26.0f);
                        }
                        textView2.setText(LocaleController.getString(R.string.SendDice));
                        if (this.K == 16) {
                            dp = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                            textView2.setVisibility(0);
                            textView2.setTextColor(c(org.telegram.ui.ActionBar.g6.Gi));
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
                        bk0Var2.setVisibility(0);
                    } else if (i30 == 18) {
                        this.G = Math.max(4000, Math.min((r0.length() / 50) * 1600, 10000));
                        y1Var.setTextSize(1, 14.0f);
                        y1Var.setGravity(16);
                        y1Var.setText((CharSequence) obj);
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
                        bk0Var2.setVisibility(0);
                        bk0Var2.e(R.raw.chats_infotip, 36, 36);
                        bk0Var2.setProgress(0.0f);
                        bk0Var2.d();
                        y1Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    } else if (i30 == 12) {
                        y1Var.setText(LocaleController.getString(R.string.ColorThemeChanged));
                        bk0Var2.setImageResource(R.drawable.toast_pallete);
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
                            spannableStringBuilder3.setSpan(new q61("tg://settings/themes"), indexOf3, lastIndexOf3 - 1, 33);
                        }
                        textView3.setText(spannableStringBuilder3);
                        textView3.setVisibility(0);
                        textView3.setSingleLine(false);
                        textView3.setMaxLines(2);
                        textView2.setVisibility(8);
                        linearLayout.setVisibility(0);
                        bk0Var2.setVisibility(0);
                    } else {
                        str = "";
                        if (i30 == 84) {
                            y1Var.setVisibility(0);
                            y1Var.setTextSize(1, 15.0f);
                            y1Var.setTypeface(Typeface.DEFAULT);
                            y1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumTranscriptionHint)));
                            bk0Var2.setVisibility(0);
                            bk0Var2.e(R.raw.voice_to_text, 36, 36);
                            bk0Var2.setProgress(0.0f);
                            bk0Var2.d();
                            layoutParams.leftMargin = org.telegram.ui.Cells.c1.b(58.0f, R.string.PremiumMore, textView2);
                            layoutParams.rightMargin = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                            int dp4 = AndroidUtilities.dp(6.0f);
                            layoutParams.bottomMargin = dp4;
                            layoutParams.topMargin = dp4;
                            layoutParams.height = -2;
                            z9Var.setVisibility(8);
                            textView3.setVisibility(8);
                            textView2.setVisibility(0);
                            linearLayout.setVisibility(0);
                            imageView2.setVisibility(8);
                        } else if (i30 == 85) {
                            y1Var.setVisibility(0);
                            y1Var.setTextSize(1, 15.0f);
                            y1Var.setTypeface(AndroidUtilities.bold());
                            y1Var.setText(LocaleController.getString(R.string.SwipeToReplyHint));
                            bk0Var2.setVisibility(0);
                            bk0Var2.e(R.raw.hint_swipe_reply, 64, 64);
                            bk0Var2.setProgress(0.0f);
                            bk0Var2.d();
                            textView3.setVisibility(0);
                            layoutParams.leftMargin = org.telegram.ui.Cells.c1.b(58.0f, R.string.SwipeToReplyHintMessage, textView3);
                            layoutParams.rightMargin = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                            layoutParams.topMargin = AndroidUtilities.dp(6.0f);
                            layoutParams.height = -2;
                            z9Var.setVisibility(8);
                            linearLayout.setVisibility(8);
                        } else if (i30 == 90 || i30 == 91 || i30 == 92 || i30 == 93 || i30 == 94) {
                            switch (i30) {
                                case 90:
                                    y1Var.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) ug.s.f(), new Object[0]));
                                    break;
                                case 91:
                                    y1Var.setText(LocaleController.getString(R.string.BoostingSelectUpToWarningUsers));
                                    break;
                                case 92:
                                    y1Var.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]));
                                    break;
                                case 93:
                                    y1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0])));
                                    break;
                                case 94:
                                    y1Var.setText(LocaleController.getString(R.string.BoostingOnlyRecipientCode));
                                    break;
                            }
                            layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                            y1Var.setTextSize(1, 15.0f);
                            linearLayout.setVisibility(8);
                            y1Var.setTypeface(Typeface.DEFAULT);
                            textView3.setVisibility(8);
                            bk0Var2.setVisibility(0);
                            bk0Var2.e(R.raw.chats_infotip, 36, 36);
                            bk0Var2.setProgress(0.0f);
                            bk0Var2.d();
                        } else {
                            if (i30 == 2) {
                                i14 = 2;
                            } else if (i30 == 4) {
                                i14 = 2;
                            } else if (i10 == 82) {
                                layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                                y1Var.setText(LocaleController.getString(photoEntry.isVideo ? R.string.AttachMediaVideoDeselected : R.string.AttachMediaPhotoDeselected));
                                linearLayout.setVisibility(0);
                                y1Var.setTextSize(1, 15.0f);
                                y1Var.setTypeface(Typeface.DEFAULT);
                                textView3.setVisibility(8);
                                z9Var.setVisibility(0);
                                z9Var.setRoundRadius(AndroidUtilities.dp(2.0f));
                                String str4 = photoEntry.thumbPath;
                                if (str4 != null) {
                                    z9Var.f(str4, null, org.telegram.ui.ActionBar.g6.R4);
                                } else if (photoEntry.path != null) {
                                    z9Var.p(photoEntry.orientation, photoEntry.invert, true);
                                    if (photoEntry.isVideo) {
                                        z9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
                                    } else {
                                        z9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
                                    }
                                } else {
                                    z9Var.setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
                                }
                            } else {
                                layoutParams.leftMargin = AndroidUtilities.dp(45.0f);
                                layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                                layoutParams.rightMargin = 0;
                                y1Var.setTextSize(1, 15.0f);
                                linearLayout.setVisibility(0);
                                Typeface typeface = Typeface.DEFAULT;
                                y1Var.setTypeface(typeface);
                                textView3.setVisibility(8);
                                bk0Var2.setVisibility(8);
                                int i33 = this.K;
                                if (i33 == 88) {
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
                                        y1Var.setText(LocaleController.formatString("FolderLinkDeletedTitle", R.string.FolderLinkDeletedTitle, str5));
                                        y1Var.setTypeface(AndroidUtilities.bold());
                                        textView3.setVisibility(0);
                                        textView3.setText(LocaleController.formatPluralString("FolderLinkDeletedSubtitle", intValue3, new Object[0]));
                                    } else {
                                        y1Var.setTypeface(typeface);
                                        int i34 = R.string.FolderLinkDeleted;
                                        if (str5 == null) {
                                            str5 = str;
                                        }
                                        y1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FolderLinkDeleted", i34, str5.replace('*', (char) 10033))));
                                    }
                                } else if (i33 == 81 || i33 == 0 || i33 == 26) {
                                    y1Var.setText(LocaleController.getString(R.string.HistoryClearedUndo));
                                } else if (i33 == 27) {
                                    y1Var.setText(LocaleController.getString(R.string.ChatsDeletedUndo));
                                } else if (i33 == 95) {
                                    if (DialogObject.isChatDialog(longValue)) {
                                        TLRPC.Chat chat6 = MessagesController.getInstance(i23).getChat(Long.valueOf(-longValue));
                                        if (ChatObject.isMonoForum(chat6)) {
                                            y1Var.setText(LocaleController.getString(R.string.MonoforumDeletedUndo));
                                        } else if (!ChatObject.isChannel(chat6) || chat6.megagroup) {
                                            y1Var.setText(LocaleController.getString(R.string.GroupLeftUndo));
                                        } else {
                                            y1Var.setText(LocaleController.getString(R.string.ChannelLeftUndo));
                                        }
                                    } else {
                                        y1Var.setText(LocaleController.getString(R.string.ChatDeletedUndo));
                                    }
                                } else if (DialogObject.isChatDialog(longValue)) {
                                    TLRPC.Chat chat7 = MessagesController.getInstance(i23).getChat(Long.valueOf(-longValue));
                                    if (ChatObject.isMonoForum(chat7)) {
                                        y1Var.setText(LocaleController.getString(R.string.MonoforumDeletedUndo));
                                    } else if (!ChatObject.isChannel(chat7) || chat7.megagroup) {
                                        y1Var.setText(LocaleController.getString(R.string.GroupDeletedUndo));
                                    } else {
                                        y1Var.setText(LocaleController.getString(R.string.ChannelDeletedUndo));
                                    }
                                } else {
                                    y1Var.setText(LocaleController.getString(R.string.ChatDeletedUndo));
                                }
                                if (this.K != 81) {
                                    for (int i35 = 0; i35 < arrayList.size(); i35++) {
                                        MessagesController messagesController = MessagesController.getInstance(i23);
                                        long longValue2 = ((Long) arrayList.get(i35)).longValue();
                                        int i36 = this.K;
                                        messagesController.addDialogAction(longValue2, i36 == 0 || i36 == 26);
                                    }
                                }
                            }
                            if (i10 == i14) {
                                y1Var.setText(LocaleController.getString(R.string.ChatArchived));
                            } else {
                                y1Var.setText(LocaleController.getString(R.string.ChatsArchived));
                            }
                            layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                            layoutParams.topMargin = AndroidUtilities.dp(13.0f);
                            layoutParams.rightMargin = 0;
                            y1Var.setTextSize(1, 15.0f);
                            linearLayout.setVisibility(0);
                            y1Var.setTypeface(Typeface.DEFAULT);
                            textView3.setVisibility(8);
                            bk0Var2.setVisibility(0);
                            bk0Var2.e(R.raw.chats_archived, 36, 36);
                            bk0Var2.setProgress(0.0f);
                            bk0Var2.d();
                        }
                    }
                    z10 = false;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object) y1Var.getText());
                    sb2.append(textView3.getVisibility() != 0 ? ". " + ((Object) textView3.getText()) : str);
                    AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
                    if (!f()) {
                        int measuredWidth = ((ViewGroup) getParent()).getMeasuredWidth();
                        if (measuredWidth == 0) {
                            measuredWidth = AndroidUtilities.displaySize.x;
                        }
                        measureChildWithMargins(textView3, org.telegram.messenger.sk.c(16.0f, measuredWidth, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                        this.r = AndroidUtilities.dp(37.0f) + textView3.getMeasuredHeight();
                    } else if (d()) {
                        this.r = AndroidUtilities.dp(52.0f);
                    } else if (getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) getParent();
                        int measuredWidth2 = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
                        if (measuredWidth2 <= 0) {
                            measuredWidth2 = AndroidUtilities.displaySize.x;
                        }
                        View view = y1Var;
                        measureChildWithMargins(view, org.telegram.messenger.sk.c(16.0f, measuredWidth2, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                        int measuredHeight = view.getMeasuredHeight();
                        int i37 = this.K;
                        int dp6 = AndroidUtilities.dp((i37 == 16 || i37 == 17 || i37 == 18 || i37 == 84 || i37 == 86) ? 14.0f : 28.0f) + measuredHeight;
                        this.r = dp6;
                        int i38 = this.K;
                        if (i38 == 18) {
                            this.r = Math.max(dp6, AndroidUtilities.dp(52.0f));
                        } else if (i38 == 25) {
                            this.r = Math.max(dp6, AndroidUtilities.dp(50.0f));
                        } else if (z10) {
                            this.r = dp6 - AndroidUtilities.dp(8.0f);
                        }
                    }
                    if (getVisibility() == 0) {
                        setVisibility(0);
                        setEnterOffset((this.R ? -1.0f : 1.0f) * (this.W + this.r));
                        AnimatorSet animatorSet = new AnimatorSet();
                        boolean z11 = this.R;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z11 ? -1.0f : 1.0f) * (this.W + this.r), z11 ? 1.0f : -1.0f));
                        animatorSet.setInterpolator(new DecelerateInterpolator());
                        animatorSet.setDuration(180L);
                        animatorSet.start();
                        return;
                    }
                    return;
                }
                str = "";
                i11 = i23;
                imageView = imageView2;
                textView = textView2;
                i12 = 8;
            }
            imageView.setVisibility(i12);
            bk0Var2.setVisibility(0);
            y1Var.setTypeface(Typeface.DEFAULT);
            int i39 = this.K;
            long j12 = -1;
            if (i39 == 76) {
                y1Var.setText(LocaleController.getString(R.string.BroadcastGroupConvertSuccess));
                bk0Var2.e(R.raw.gigagroup_convert, 36, 36);
                layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                y1Var.setTextSize(1, 14.0f);
                z10 = true;
            } else {
                z10 = true;
                if (i39 == 75) {
                    y1Var.setText(LocaleController.getString(R.string.GigagroupConvertCancelHint));
                    bk0Var2.e(R.raw.chats_infotip, 36, 36);
                    layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                    y1Var.setTextSize(1, 14.0f);
                } else {
                    if (i10 == 70) {
                        int intValue4 = ((Integer) obj2).intValue();
                        textView3.setSingleLine(false);
                        y1Var.setText(LocaleController.formatString("AutoDeleteHintOnText", R.string.AutoDeleteHintOnText, LocaleController.formatTTLString(intValue4)));
                        bk0Var2.e(R.raw.fire_on, 36, 36);
                        layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                        this.G = 4000L;
                        bk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                    } else {
                        if (i39 == 71) {
                            y1Var.setText(LocaleController.getString(R.string.AutoDeleteHintOffText));
                            bk0Var2.e(R.raw.fire_off, 36, 36);
                            y1Var.setTextSize(1, 14.0f);
                            this.G = 3000L;
                            bk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                        } else if (i39 == 45) {
                            y1Var.setText(LocaleController.getString(R.string.ImportMutualError));
                            bk0Var2.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            z10 = true;
                            y1Var.setTextSize(1, 14.0f);
                        } else if (i39 == 46) {
                            y1Var.setText(LocaleController.getString(R.string.ImportNotAdmin));
                            bk0Var2.e(R.raw.error, 36, 36);
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            y1Var.setTextSize(1, 14.0f);
                        } else if (i39 == 47) {
                            y1Var.setText(LocaleController.getString(R.string.ImportedInfo));
                            bk0Var2.e(R.raw.imported, 36, 36);
                            bk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(5.0f));
                            layoutParams.topMargin = AndroidUtilities.dp(9.0f);
                            y1Var.setTextSize(1, 14.0f);
                        } else {
                            if (i39 == 52 || i39 == 56 || i39 == 57 || i39 == 58 || i39 == 59 || i39 == 60 || i39 == 80) {
                                bk0Var = bk0Var2;
                                if (!AndroidUtilities.shouldShowClipboardToast()) {
                                    return;
                                }
                                int i40 = R.raw.copy;
                                int i41 = this.K;
                                if (i41 == 80) {
                                    y1Var.setText(LocaleController.getString(R.string.EmailCopied));
                                } else if (i41 == 60) {
                                    y1Var.setText(LocaleController.getString(R.string.PhoneCopied));
                                } else if (i41 == 56) {
                                    y1Var.setText(LocaleController.getString(R.string.UsernameCopied));
                                } else if (i41 == 57) {
                                    y1Var.setText(LocaleController.getString(R.string.HashtagCopied));
                                } else if (i41 == 52) {
                                    y1Var.setText(LocaleController.getString(R.string.MessageCopied));
                                } else if (i41 == 59) {
                                    i40 = R.raw.voip_invite;
                                    y1Var.setText(LocaleController.getString(R.string.LinkCopied));
                                } else {
                                    y1Var.setText(LocaleController.getString(R.string.TextCopied));
                                }
                                bk0Var.e(i40, 30, 30);
                                this.G = 3000L;
                                y1Var.setTextSize(1, 15.0f);
                            } else if (i39 == 54) {
                                y1Var.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOn));
                                bk0Var2.e(R.raw.silent_unmute, 30, 30);
                                this.G = 3000L;
                                y1Var.setTextSize(1, 15.0f);
                            } else if (i39 == 55) {
                                y1Var.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOff));
                                bk0Var2.e(R.raw.silent_mute, 30, 30);
                                this.G = 3000L;
                                y1Var.setTextSize(1, 15.0f);
                            } else if (i39 == 41) {
                                if (obj2 != null) {
                                    y1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                                } else if (longValue == UserConfig.getInstance(i11).clientUserId) {
                                    y1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages)));
                                } else if (DialogObject.isChatDialog(longValue)) {
                                    y1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(i11).getChat(Long.valueOf(-longValue)).title)));
                                } else {
                                    y1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(i11).getUser(l4)))));
                                }
                                bk0Var2.e(R.raw.contact_check, 36, 36);
                                this.G = 3000L;
                            } else if (i39 == 53) {
                                Integer num = (Integer) obj;
                                if (obj2 == null || (obj2 instanceof TLRPC.TL_forumTopic)) {
                                    bk0Var = bk0Var2;
                                    if (longValue == UserConfig.getInstance(i11).clientUserId) {
                                        if (num.intValue() == 1) {
                                            y1Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), new ve(15)));
                                        } else {
                                            y1Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), new ve(15)));
                                        }
                                        bk0Var.e(R.raw.saved_messages, 30, 30);
                                    } else {
                                        if (DialogObject.isChatDialog(longValue)) {
                                            TLRPC.Chat chat8 = MessagesController.getInstance(i11).getChat(Long.valueOf(-longValue));
                                            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                            String i42 = ChatObject.isMonoForum(chat8) ? og.d.i(chat8, i11, false) : null;
                                            if (num.intValue() == 1) {
                                                int i43 = R.string.FwdMessageToGroup;
                                                if (i42 == null) {
                                                    i42 = tL_forumTopic != null ? tL_forumTopic.title : chat8.title;
                                                }
                                                y1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToGroup", i43, i42)));
                                            } else {
                                                int i44 = R.string.FwdMessagesToGroup;
                                                if (i42 == null) {
                                                    i42 = tL_forumTopic != null ? tL_forumTopic.title : chat8.title;
                                                }
                                                y1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToGroup", i44, i42)));
                                            }
                                        } else {
                                            TLRPC.User user7 = MessagesController.getInstance(i11).getUser(l4);
                                            if (num.intValue() == 1) {
                                                y1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToUser", R.string.FwdMessageToUser, UserObject.getFirstName(user7))));
                                            } else {
                                                y1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToUser", R.string.FwdMessagesToUser, UserObject.getFirstName(user7))));
                                            }
                                        }
                                        bk0Var.e(R.raw.forward, 30, 30);
                                        j12 = 300;
                                    }
                                } else {
                                    int intValue5 = ((Integer) obj2).intValue();
                                    if (num.intValue() == 1) {
                                        y1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", intValue5, new Object[0])));
                                    } else {
                                        y1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", intValue5, new Object[0])));
                                    }
                                    bk0Var2.e(R.raw.forward, 30, 30);
                                    j12 = 300;
                                    bk0Var = bk0Var2;
                                }
                                this.G = 3000L;
                            } else {
                                bk0Var = bk0Var2;
                                int i45 = i11;
                                if (i39 == 61) {
                                    if (obj2 != null) {
                                        y1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToChats", R.string.BackgroundToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                                        bk0Var.e(R.raw.forward, 30, 30);
                                    } else if (longValue == UserConfig.getInstance(i45).clientUserId) {
                                        y1Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BackgroundToSavedMessages)));
                                        bk0Var.e(R.raw.saved_messages, 30, 30);
                                    } else {
                                        if (DialogObject.isChatDialog(longValue)) {
                                            y1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToGroup", R.string.BackgroundToGroup, MessagesController.getInstance(i45).getChat(Long.valueOf(-longValue)).title)));
                                        } else {
                                            y1Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToUser", R.string.BackgroundToUser, UserObject.getFirstName(MessagesController.getInstance(i45).getUser(l4)))));
                                        }
                                        bk0Var.e(R.raw.forward, 30, 30);
                                    }
                                    this.G = 3000L;
                                }
                            }
                            j10 = j12;
                            i13 = 8;
                            z10 = false;
                            textView3.setVisibility(i13);
                            textView.setTextColor(c(org.telegram.ui.ActionBar.g6.Gi));
                            linearLayout.setVisibility(i13);
                            layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                            bk0Var.setProgress(0.0f);
                            bk0Var.d();
                            if (j10 > 0) {
                                bk0Var.postDelayed(new kr0(this, 28), j10);
                            }
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append((Object) y1Var.getText());
                            if (textView3.getVisibility() != 0) {
                            }
                            sb22.append(textView3.getVisibility() != 0 ? ". " + ((Object) textView3.getText()) : str);
                            AndroidUtilities.makeAccessibilityAnnouncement(sb22.toString());
                            if (!f()) {
                            }
                            if (getVisibility() == 0) {
                            }
                        }
                        bk0Var = bk0Var2;
                        j10 = j12;
                        i13 = 8;
                        z10 = false;
                        textView3.setVisibility(i13);
                        textView.setTextColor(c(org.telegram.ui.ActionBar.g6.Gi));
                        linearLayout.setVisibility(i13);
                        layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                        bk0Var.setProgress(0.0f);
                        bk0Var.d();
                        if (j10 > 0) {
                        }
                        StringBuilder sb222 = new StringBuilder();
                        sb222.append((Object) y1Var.getText());
                        if (textView3.getVisibility() != 0) {
                        }
                        sb222.append(textView3.getVisibility() != 0 ? ". " + ((Object) textView3.getText()) : str);
                        AndroidUtilities.makeAccessibilityAnnouncement(sb222.toString());
                        if (!f()) {
                        }
                        if (getVisibility() == 0) {
                        }
                    }
                    bk0Var = bk0Var2;
                    j10 = -1;
                    i13 = 8;
                    z10 = true;
                    textView3.setVisibility(i13);
                    textView.setTextColor(c(org.telegram.ui.ActionBar.g6.Gi));
                    linearLayout.setVisibility(i13);
                    layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
                    bk0Var.setProgress(0.0f);
                    bk0Var.d();
                    if (j10 > 0) {
                    }
                    StringBuilder sb2222 = new StringBuilder();
                    sb2222.append((Object) y1Var.getText());
                    if (textView3.getVisibility() != 0) {
                    }
                    sb2222.append(textView3.getVisibility() != 0 ? ". " + ((Object) textView3.getText()) : str);
                    AndroidUtilities.makeAccessibilityAnnouncement(sb2222.toString());
                    if (!f()) {
                    }
                    if (getVisibility() == 0) {
                    }
                }
            }
            bk0Var = bk0Var2;
            j10 = -1;
            i13 = 8;
            textView3.setVisibility(i13);
            textView.setTextColor(c(org.telegram.ui.ActionBar.g6.Gi));
            linearLayout.setVisibility(i13);
            layoutParams.leftMargin = AndroidUtilities.dp(58.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(8.0f);
            bk0Var.setProgress(0.0f);
            bk0Var.d();
            if (j10 > 0) {
            }
            StringBuilder sb22222 = new StringBuilder();
            sb22222.append((Object) y1Var.getText());
            if (textView3.getVisibility() != 0) {
            }
            sb22222.append(textView3.getVisibility() != 0 ? ". " + ((Object) textView3.getText()) : str);
            AndroidUtilities.makeAccessibilityAnnouncement(sb22222.toString());
            if (!f()) {
            }
            if (getVisibility() == 0) {
            }
        }
        str = "";
        z10 = false;
        StringBuilder sb222222 = new StringBuilder();
        sb222222.append((Object) y1Var.getText());
        if (textView3.getVisibility() != 0) {
        }
        sb222222.append(textView3.getVisibility() != 0 ? ". " + ((Object) textView3.getText()) : str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb222222.toString());
        if (!f()) {
        }
        if (getVisibility() == 0) {
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7 = this.P;
        ShapeDrawable shapeDrawable = this.U;
        if (f7 != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.d0) + this.W + AndroidUtilities.dp(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i10 = this.K;
        if (i10 == 1 || i10 == 95 || i10 == 0 || i10 == 27 || i10 == 26 || i10 == 81 || i10 == 88) {
            int ceil = this.G > 0 ? (int) Math.ceil(r10 / 1000.0f) : 0;
            int i11 = this.H;
            TextPaint textPaint = this.y;
            if (i11 != ceil) {
                this.H = ceil;
                this.I = String.format("%d", Integer.valueOf(Math.max(1, ceil)));
                StaticLayout staticLayout = this.a0;
                if (staticLayout != null) {
                    this.b0 = staticLayout;
                    this.c0 = 0.0f;
                }
                this.J = (int) Math.ceil(textPaint.measureText(r2));
                this.a0 = new StaticLayout(this.I, textPaint, ConnectionsManager.DEFAULT_DATACENTER_ID, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f10 = this.c0;
            if (f10 < 1.0f) {
                float f11 = f10 + 0.10666667f;
                this.c0 = f11;
                if (f11 > 1.0f) {
                    this.c0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.b0;
            RectF rectF = this.F;
            if (staticLayout2 != null) {
                float f12 = this.c0;
                if (f12 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.J / 2), (AndroidUtilities.dp(10.0f) * this.c0) + AndroidUtilities.dp(17.2f));
                    this.b0.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.a0 != null) {
                float f13 = this.c0;
                if (f13 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f13));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.J / 2), com.google.android.gms.internal.play_billing.k3.D(1.0f, this.c0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(17.2f)));
                this.a0.draw(canvas);
                if (this.c0 != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (this.G / 5000.0f) * (-360.0f), false, this.E);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.G - (elapsedRealtime - this.O);
        this.G = j10;
        this.O = elapsedRealtime;
        if (j10 <= 0) {
            e(this.T, true);
        }
        if (this.K != 82) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.r, TLObject.FLAG_30));
        this.U.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f7) {
        if (this.P != f7) {
            this.P = f7;
            setTranslationY(((this.d0 - this.W) + AndroidUtilities.dp(8.0f)) - this.P);
            invalidate();
        }
    }

    public void setEnterOffset(float f7) {
        if (this.d0 != f7) {
            this.d0 = f7;
            setTranslationY(((f7 - this.W) + AndroidUtilities.dp(8.0f)) - this.P);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i10) {
        this.W = i10;
    }

    public void setHideAnimationType(int i10) {
        this.T = i10;
    }

    public void setInfoText(CharSequence charSequence) {
        this.S = charSequence;
    }

    public UndoView(Context context, ce1 ce1Var) {
        this(context, ce1Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = 0;
        this.x = UserConfig.selectedAccount;
        this.K = -1;
        this.T = 1;
        this.W = AndroidUtilities.dp(8.0f);
        this.c0 = 1.0f;
        this.V = c6Var;
        this.s = m2Var;
        this.R = z10;
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(this, context, c6Var);
        this.b = y1Var;
        y1Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Hi;
        y1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.Gi;
        y1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        y1Var.setMovementMethod(new w61(this));
        addView(y1Var, w7.z5.a(-2.0f, 45.0f, 13.0f, 0.0f, 0.0f, -2, 51));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        addView(textView, w7.z5.a(-2.0f, 58.0f, 27.0f, 8.0f, 0.0f, -2, 51));
        bk0 bk0Var = new bk0(context);
        this.f = bk0Var;
        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.g6.Fi;
        bk0Var.h(org.telegram.ui.ActionBar.g6.w0(i12, c6Var) | (-16777216), "info1");
        bk0Var.h(org.telegram.ui.ActionBar.g6.w0(i12, c6Var) | (-16777216), "info2");
        bk0Var.h(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), "luc12");
        bk0Var.h(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), "luc11");
        bk0Var.h(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), "luc10");
        bk0Var.h(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), "luc9");
        bk0Var.h(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), "luc8");
        bk0Var.h(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), "luc7");
        bk0Var.h(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), "luc6");
        bk0Var.h(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), "luc5");
        bk0Var.h(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), "luc4");
        bk0Var.h(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), "luc3");
        bk0Var.h(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), "luc2");
        bk0Var.h(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), "luc1");
        bk0Var.h(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), "Oval");
        addView(bk0Var, w7.z5.a(-2.0f, 3.0f, 0.0f, 0.0f, 0.0f, 54, 19));
        z9 z9Var = new z9(context);
        this.h = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(z9Var, w7.z5.a(30.0f, 15.0f, 0.0f, 0.0f, 0.0f, 30, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.w0(i11, c6Var) & 587202559, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
        addView(linearLayout, w7.z5.a(-2.0f, 0.0f, 0.0f, 11.0f, 0.0f, -2, 21));
        linearLayout.setOnClickListener(new u61(this, 0));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView, w7.z5.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        textView2.setText(LocaleController.getString(R.string.UndoNoCaps));
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 19, 6, 4, 8, 4));
        this.F = new RectF(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(33.0f), AndroidUtilities.dp(33.0f));
        Paint paint = new Paint(1);
        this.E = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        TextPaint textPaint = new TextPaint(1);
        this.y = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        setWillNotDraw(false);
        this.U = org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        setOnTouchListener(new ci.d(25));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void h(int i10, long j10) {
    }
}
