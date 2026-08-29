package bg;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import i7.f6;
import java.io.File;
import java.util.ArrayList;
import nh.e6;
import nh.f5;
import nh.o7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.hk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class d2 extends k {
    public d5 A0;
    public d5 B0;
    public d5 C0;
    public d5 D0;
    public d5 E0;
    public d5 F0;
    public d5 G0;
    public d5 H0;
    public final u1 m0;
    public final v1 n0;
    public final ArrayList o0;
    public final MessageObject.GroupedMessages p0;
    public boolean q0;
    public boolean r0;
    public TextureView s0;
    public boolean t0;
    public int u0;
    public int v0;
    public boolean w0;
    public boolean x0;
    public final SparseIntArray y0;
    public final c2 z0;

    public d2(Context context, PointF pointF, ArrayList arrayList, ga gaVar, boolean z10, e6 e6Var) {
        super(context, pointF);
        t1 t1Var;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.o0 = new ArrayList();
        this.u0 = 1;
        this.v0 = 1;
        this.w0 = true;
        this.x0 = g6.I.q();
        this.y0 = new SparseIntArray();
        f5 f5Var = (f5) this;
        c2 c2Var = new c2();
        c2Var.f = f5Var;
        TextPaint textPaint = new TextPaint();
        c2Var.a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        c2Var.b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        c2Var.c = textPaint3;
        new Paint(3);
        c2Var.d = new Paint(3);
        Paint paint = new Paint(3);
        c2Var.e = paint;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
        this.z0 = c2Var;
        setRotation(0.0f);
        setScale(1.0f);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            TLRPC.Message message2 = messageObject.messageOwner;
            int i11 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else if (message2 instanceof TLRPC.TL_messageService) {
                tL_messageService = new TLRPC.TL_messageService();
            } else {
                message = message2;
                D = o7.D(messageObject);
                if (D != null && D.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i12 = messageObject.currentAccount;
                MessageObject messageObject2 = new MessageObject(i12, message, messageObject.replyMessageObject, MessagesController.getInstance(i12).getUsers(), MessagesController.getInstance(messageObject.currentAccount).getChats(), null, null, true, true, 0L, true, z10, false);
                messageObject2.setType();
                this.o0.add(messageObject2);
            }
            tL_messageService.id = message2.id;
            tL_messageService.from_id = message2.from_id;
            tL_messageService.peer_id = message2.peer_id;
            tL_messageService.date = message2.date;
            tL_messageService.expire_date = message2.expire_date;
            tL_messageService.action = message2.action;
            tL_messageService.message = message2.message;
            tL_messageService.media = message2.media;
            tL_messageService.flags = message2.flags;
            tL_messageService.mentioned = message2.mentioned;
            tL_messageService.media_unread = message2.media_unread;
            tL_messageService.out = message2.out;
            tL_messageService.unread = message2.unread;
            tL_messageService.entities = message2.entities;
            tL_messageService.via_bot_name = message2.via_bot_name;
            tL_messageService.reply_markup = message2.reply_markup;
            tL_messageService.views = message2.views;
            tL_messageService.forwards = message2.forwards;
            tL_messageService.replies = message2.replies;
            tL_messageService.edit_date = message2.edit_date;
            tL_messageService.silent = message2.silent;
            tL_messageService.post = message2.post;
            tL_messageService.from_scheduled = message2.from_scheduled;
            tL_messageService.legacy = message2.legacy;
            tL_messageService.edit_hide = message2.edit_hide;
            tL_messageService.pinned = message2.pinned;
            tL_messageService.fwd_from = message2.fwd_from;
            tL_messageService.via_bot_id = message2.via_bot_id;
            tL_messageService.reply_to = message2.reply_to;
            tL_messageService.post_author = message2.post_author;
            tL_messageService.grouped_id = message2.grouped_id;
            tL_messageService.reactions = message2.reactions;
            tL_messageService.restriction_reason = message2.restriction_reason;
            tL_messageService.ttl_period = message2.ttl_period;
            tL_messageService.noforwards = message2.noforwards;
            tL_messageService.invert_media = message2.invert_media;
            tL_messageService.send_state = message2.send_state;
            tL_messageService.fwd_msg_id = message2.fwd_msg_id;
            tL_messageService.attachPath = message2.attachPath;
            tL_messageService.params = message2.params;
            tL_messageService.random_id = message2.random_id;
            tL_messageService.local_id = message2.local_id;
            tL_messageService.dialog_id = message2.dialog_id;
            tL_messageService.ttl = message2.ttl;
            tL_messageService.destroyTime = message2.destroyTime;
            tL_messageService.destroyTimeMillis = message2.destroyTimeMillis;
            tL_messageService.layer = message2.layer;
            tL_messageService.seq_in = message2.seq_in;
            tL_messageService.seq_out = message2.seq_out;
            tL_messageService.with_my_score = message2.with_my_score;
            tL_messageService.replyMessage = message2.replyMessage;
            tL_messageService.reqId = message2.reqId;
            tL_messageService.realId = message2.realId;
            tL_messageService.stickerVerified = message2.stickerVerified;
            tL_messageService.isThreadMessage = message2.isThreadMessage;
            tL_messageService.voiceTranscription = message2.voiceTranscription;
            tL_messageService.voiceTranscriptionOpen = message2.voiceTranscriptionOpen;
            tL_messageService.voiceTranscriptionRated = message2.voiceTranscriptionRated;
            tL_messageService.voiceTranscriptionFinal = message2.voiceTranscriptionFinal;
            tL_messageService.voiceTranscriptionForce = message2.voiceTranscriptionForce;
            tL_messageService.voiceTranscriptionId = message2.voiceTranscriptionId;
            tL_messageService.premiumEffectWasPlayed = message2.premiumEffectWasPlayed;
            tL_messageService.originalLanguage = message2.originalLanguage;
            tL_messageService.translatedToLanguage = message2.translatedToLanguage;
            tL_messageService.translatedText = message2.translatedText;
            tL_messageService.replyStory = message2.replyStory;
            message = tL_messageService;
            D = o7.D(messageObject);
            if (D != null) {
                message.from_id = peer;
                message.peer_id = peer;
                message.flags &= -5;
                message.fwd_from = null;
            }
            message.voiceTranscriptionOpen = false;
            int i122 = messageObject.currentAccount;
            MessageObject messageObject22 = new MessageObject(i122, message, messageObject.replyMessageObject, MessagesController.getInstance(i122).getUsers(), MessagesController.getInstance(messageObject.currentAccount).getChats(), null, null, true, true, 0L, true, z10, false);
            messageObject22.setType();
            this.o0.add(messageObject22);
        }
        this.p0 = null;
        if (this.o0.size() > 1) {
            MessageObject.GroupedMessages groupedMessages = new MessageObject.GroupedMessages();
            this.p0 = groupedMessages;
            groupedMessages.messages.addAll(this.o0);
            groupedMessages.groupId = ((MessageObject) this.o0.get(0)).getGroupId();
            groupedMessages.calculate();
        }
        u1 u1Var = new u1(f5Var, context);
        this.m0 = u1Var;
        addView(u1Var, f6.c(-1.0f, -1));
        v1 v1Var = new v1(f5Var, context, this.z0);
        this.n0 = v1Var;
        v1Var.setAdapter(new y1(f5Var, context, gaVar, e6Var, z10));
        z1 z1Var = new z1(f5Var);
        z1Var.O = new a2(f5Var);
        v1Var.setLayoutManager(z1Var);
        v1Var.i(new b2());
        u1Var.addView(v1Var, f6.c(-1.0f, -1));
        if (e6Var != null && e6Var.g) {
            ag.i0 i0Var = new ag.i0(f5Var, 2);
            t1 t1Var2 = new t1(f5Var, 0);
            e6Var.b = i0Var;
            e6Var.c = t1Var2;
            TextureView textureView = e6Var.a;
            if (textureView != null) {
                i0Var.run(textureView);
            }
            if (e6Var.d && (t1Var = e6Var.c) != null) {
                t1Var.run(Integer.valueOf(e6Var.e), Integer.valueOf(e6Var.f));
            }
        }
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.Cells.s1 getCell() {
        v1 v1Var = this.n0;
        if (v1Var == null) {
            return null;
        }
        for (int i10 = 0; i10 < v1Var.getChildCount(); i10++) {
            if (v1Var.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                return (org.telegram.ui.Cells.s1) v1Var.getChildAt(i10);
            }
        }
        return null;
    }

    @Override // bg.k
    public final j a() {
        return new j1(this, getContext());
    }

    @Override // bg.k
    public float getBounceScale() {
        return 0.02f;
    }

    @Override // bg.k
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new hk0();
        }
        float scaleX = viewGroup.getScaleX();
        return new hk0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), (getScale() * getMeasuredWidth() * scaleX) + AndroidUtilities.dp(71.0f), (getScale() * getMeasuredHeight() * scaleX) + AndroidUtilities.dp(71.0f));
    }

    @Override // bg.k
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.r0) {
            s();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (((org.telegram.messenger.MessageObject) r0.get(0)).contentType == 1) goto L12;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        u1 u1Var = this.m0;
        u1Var.measure(i10, i11);
        setMeasuredDimension(u1Var.getMeasuredWidth(), u1Var.getMeasuredHeight());
        k();
        if (this.w0) {
            ArrayList arrayList = this.o0;
            if (arrayList != null) {
                z10 = true;
                if (arrayList.size() == 1) {
                }
            }
            z10 = false;
            float min = Math.min((View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(z10 ? 0.0f : 44.0f)) / getMeasuredWidth(), (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(z10 ? 0.0f : 192.0f)) / getMeasuredHeight());
            if (min < 1.0f) {
                setScale(min);
            }
            PointF position = getPosition();
            if (!z10) {
                position.x -= Math.min(1.0f, min) * AndroidUtilities.dp(19.0f);
            }
            setPosition(position);
            this.w0 = false;
        }
    }

    public final float r(RectF rectF) {
        float y8;
        float f9;
        float f10;
        float f11;
        float f12 = 2.14748365E9f;
        float f13 = 2.14748365E9f;
        float f14 = -2.14748365E9f;
        float f15 = -2.14748365E9f;
        int i10 = 0;
        while (true) {
            v1 v1Var = this.n0;
            if (i10 >= v1Var.getChildCount()) {
                rectF.set(f12, f13, f14, f15);
                return AndroidUtilities.dp(SharedConfig.bubbleRadius);
            }
            View childAt = v1Var.getChildAt(i10);
            boolean z10 = childAt instanceof org.telegram.ui.Cells.s1;
            u1 u1Var = this.m0;
            if (z10) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                if (s1Var.getMessageObject() == null || !s1Var.getMessageObject().isRoundVideo() || s1Var.getPhotoImage() == null) {
                    float x4 = childAt.getX() + u1Var.getX() + s1Var.getBackgroundDrawableLeft() + AndroidUtilities.dp(1.0f);
                    if (this.p0 == null) {
                        x4 += AndroidUtilities.dp(8.0f);
                    }
                    float x10 = ((childAt.getX() + u1Var.getX()) + s1Var.getBackgroundDrawableRight()) - AndroidUtilities.dp(1.66f);
                    float dp = AndroidUtilities.dp(2.0f) + childAt.getY() + u1Var.getY() + s1Var.getBackgroundDrawableTop();
                    y8 = ((childAt.getY() + u1Var.getY()) + s1Var.getBackgroundDrawableBottom()) - AndroidUtilities.dp(1.0f);
                    f9 = x4;
                    f10 = x10;
                    f11 = dp;
                } else {
                    f9 = s1Var.getPhotoImage().getImageX() + s1Var.getX() + u1Var.getX();
                    f10 = s1Var.getPhotoImage().getImageX2() + s1Var.getX() + u1Var.getX();
                    f11 = s1Var.getPhotoImage().getImageY() + s1Var.getY() + u1Var.getY();
                    y8 = s1Var.getPhotoImage().getImageY2() + s1Var.getY() + u1Var.getY();
                }
                f12 = Math.min(Math.min(f12, f9), f10);
                f14 = Math.max(Math.max(f14, f9), f10);
                f13 = Math.min(Math.min(f13, f11), y8);
                f15 = Math.max(Math.max(f15, f11), y8);
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                if (v0Var.B0.d()) {
                    float x11 = v0Var.getX() + u1Var.getX() + v0Var.getBoundsLeft();
                    float x12 = v0Var.getX() + u1Var.getX() + v0Var.getBoundsRight();
                    float y10 = v0Var.getY() + u1Var.getY();
                    float y11 = v0Var.getY() + u1Var.getY() + v0Var.getMeasuredHeight();
                    f12 = Math.min(Math.min(f12, x11), x12);
                    f14 = Math.max(Math.max(f14, x11), x12);
                    f13 = Math.min(Math.min(f13, y10), y11);
                    f15 = Math.max(Math.max(f15, y10), y11);
                }
            }
            i10++;
        }
    }

    public final void s() {
        v1 v1Var = this.n0;
        v1Var.invalidate();
        for (int i10 = 0; i10 < v1Var.getChildCount(); i10++) {
            v1Var.getChildAt(i10).invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab A[LOOP:1: B:36:0x00a5->B:38:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setupTheme(o7 o7Var) {
        SparseIntArray Q0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.e6 k9;
        if (o7Var == null) {
            this.y0.clear();
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (g6.N0(string) == null || g6.N0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (g6.N0(string2) == null || !g6.N0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.f6 f6Var = g6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            boolean z10 = o7Var.y0;
            this.x0 = z10;
            org.telegram.ui.ActionBar.f6 N0 = !z10 ? g6.N0(str2) : g6.N0(str);
            String[] strArr = new String[1];
            String str3 = N0.d;
            Q0 = str3 == null ? g6.Q0(null, str3, strArr) : g6.Q0(new File(N0.b), null, strArr);
            this.y0.clear();
            iArr = g6.nl;
            if (iArr != null) {
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    this.y0.put(i11, iArr[i11]);
                }
            }
            for (i10 = 0; i10 < Q0.size(); i10++) {
                this.y0.put(Q0.keyAt(i10), Q0.valueAt(i10));
            }
            k9 = N0.k(false);
            if (k9 != null) {
                k9.c(Q0, this.y0);
            }
            s();
        }
        str = string;
        boolean z102 = o7Var.y0;
        this.x0 = z102;
        if (!z102) {
        }
        String[] strArr2 = new String[1];
        String str32 = N0.d;
        if (str32 == null) {
        }
        this.y0.clear();
        iArr = g6.nl;
        if (iArr != null) {
        }
        while (i10 < Q0.size()) {
        }
        k9 = N0.k(false);
        if (k9 != null) {
        }
        s();
    }
}
