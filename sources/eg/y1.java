package eg;

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
import java.io.File;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.sk0;
import qh.n4;
import qh.r6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class y1 extends j {
    public final a9.a A0;
    public h5 B0;
    public h5 C0;
    public h5 D0;
    public h5 E0;
    public h5 F0;
    public h5 G0;
    public h5 H0;
    public h5 I0;
    public final q1 n0;
    public final r1 o0;
    public final ArrayList p0;
    public final MessageObject.GroupedMessages q0;
    public boolean r0;
    public boolean s0;
    public TextureView t0;
    public boolean u0;
    public int v0;
    public int w0;
    public boolean x0;
    public boolean y0;
    public final SparseIntArray z0;

    public y1(Context context, PointF pointF, ArrayList arrayList, ba baVar, boolean z4, qh.h5 h5Var) {
        super(context, pointF);
        p1 p1Var;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.p0 = new ArrayList();
        this.v0 = 1;
        this.w0 = 1;
        this.x0 = true;
        this.y0 = k6.I.q();
        this.z0 = new SparseIntArray();
        n4 n4Var = (n4) this;
        a9.a aVar = new a9.a();
        aVar.f = n4Var;
        TextPaint textPaint = new TextPaint();
        aVar.a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        aVar.b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        aVar.c = textPaint3;
        new Paint(3);
        aVar.d = new Paint(3);
        Paint paint = new Paint(3);
        aVar.e = paint;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
        this.A0 = aVar;
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
                D = r6.D(messageObject);
                if (D != null && D.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i12 = messageObject.currentAccount;
                MessageObject messageObject2 = new MessageObject(i12, message, messageObject.replyMessageObject, MessagesController.getInstance(i12).getUsers(), MessagesController.getInstance(messageObject.currentAccount).getChats(), null, null, true, true, 0L, true, z4, false);
                messageObject2.setType();
                this.p0.add(messageObject2);
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
            D = r6.D(messageObject);
            if (D != null) {
                message.from_id = peer;
                message.peer_id = peer;
                message.flags &= -5;
                message.fwd_from = null;
            }
            message.voiceTranscriptionOpen = false;
            int i122 = messageObject.currentAccount;
            MessageObject messageObject22 = new MessageObject(i122, message, messageObject.replyMessageObject, MessagesController.getInstance(i122).getUsers(), MessagesController.getInstance(messageObject.currentAccount).getChats(), null, null, true, true, 0L, true, z4, false);
            messageObject22.setType();
            this.p0.add(messageObject22);
        }
        this.q0 = null;
        if (this.p0.size() > 1) {
            MessageObject.GroupedMessages groupedMessages = new MessageObject.GroupedMessages();
            this.q0 = groupedMessages;
            groupedMessages.messages.addAll(this.p0);
            groupedMessages.groupId = ((MessageObject) this.p0.get(0)).getGroupId();
            groupedMessages.calculate();
        }
        q1 q1Var = new q1(n4Var, context);
        this.n0 = q1Var;
        addView(q1Var, c6.c(-1.0f, -1));
        r1 r1Var = new r1(n4Var, context, this.A0);
        this.o0 = r1Var;
        r1Var.setAdapter(new u1(n4Var, context, baVar, h5Var, z4));
        v1 v1Var = new v1(n4Var);
        v1Var.O = new w1(n4Var);
        r1Var.setLayoutManager(v1Var);
        r1Var.i(new x1());
        q1Var.addView(r1Var, c6.c(-1.0f, -1));
        if (h5Var != null && h5Var.g) {
            dg.h0 h0Var = new dg.h0(n4Var, 2);
            p1 p1Var2 = new p1(n4Var, 0);
            h5Var.b = h0Var;
            h5Var.c = p1Var2;
            TextureView textureView = h5Var.a;
            if (textureView != null) {
                h0Var.run(textureView);
            }
            if (h5Var.d && (p1Var = h5Var.c) != null) {
                p1Var.run(Integer.valueOf(h5Var.e), Integer.valueOf(h5Var.f));
            }
        }
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.ui.Cells.t1 getCell() {
        r1 r1Var = this.o0;
        if (r1Var == null) {
            return null;
        }
        for (int i10 = 0; i10 < r1Var.getChildCount(); i10++) {
            if (r1Var.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                return (org.telegram.ui.Cells.t1) r1Var.getChildAt(i10);
            }
        }
        return null;
    }

    @Override // eg.j
    public final i a() {
        return new f1(this, getContext());
    }

    @Override // eg.j
    public float getBounceScale() {
        return 0.02f;
    }

    @Override // eg.j
    public sk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new sk0();
        }
        float scaleX = viewGroup.getScaleX();
        return new sk0(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - AndroidUtilities.dp(35.5f), (getScale() * getMeasuredWidth() * scaleX) + AndroidUtilities.dp(71.0f), (getScale() * getMeasuredHeight() * scaleX) + AndroidUtilities.dp(71.0f));
    }

    @Override // eg.j
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.s0) {
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
        boolean z4;
        q1 q1Var = this.n0;
        q1Var.measure(i10, i11);
        setMeasuredDimension(q1Var.getMeasuredWidth(), q1Var.getMeasuredHeight());
        k();
        if (this.x0) {
            ArrayList arrayList = this.p0;
            if (arrayList != null) {
                z4 = true;
                if (arrayList.size() == 1) {
                }
            }
            z4 = false;
            float min = Math.min((View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(z4 ? 0.0f : 44.0f)) / getMeasuredWidth(), (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(z4 ? 0.0f : 192.0f)) / getMeasuredHeight());
            if (min < 1.0f) {
                setScale(min);
            }
            PointF position = getPosition();
            if (!z4) {
                position.x -= Math.min(1.0f, min) * AndroidUtilities.dp(19.0f);
            }
            setPosition(position);
            this.x0 = false;
        }
    }

    public final float r(RectF rectF) {
        float y10;
        float f10;
        float f11;
        float f12;
        float f13 = 2.14748365E9f;
        float f14 = 2.14748365E9f;
        float f15 = -2.14748365E9f;
        float f16 = -2.14748365E9f;
        int i10 = 0;
        while (true) {
            r1 r1Var = this.o0;
            if (i10 >= r1Var.getChildCount()) {
                rectF.set(f13, f14, f15, f16);
                return AndroidUtilities.dp(SharedConfig.bubbleRadius);
            }
            View childAt = r1Var.getChildAt(i10);
            boolean z4 = childAt instanceof org.telegram.ui.Cells.t1;
            q1 q1Var = this.n0;
            if (z4) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                if (t1Var.getMessageObject() == null || !t1Var.getMessageObject().isRoundVideo() || t1Var.getPhotoImage() == null) {
                    float x10 = childAt.getX() + q1Var.getX() + t1Var.getBackgroundDrawableLeft() + AndroidUtilities.dp(1.0f);
                    if (this.q0 == null) {
                        x10 += AndroidUtilities.dp(8.0f);
                    }
                    float x11 = ((childAt.getX() + q1Var.getX()) + t1Var.getBackgroundDrawableRight()) - AndroidUtilities.dp(1.66f);
                    float dp = AndroidUtilities.dp(2.0f) + childAt.getY() + q1Var.getY() + t1Var.getBackgroundDrawableTop();
                    y10 = ((childAt.getY() + q1Var.getY()) + t1Var.getBackgroundDrawableBottom()) - AndroidUtilities.dp(1.0f);
                    f10 = x10;
                    f11 = x11;
                    f12 = dp;
                } else {
                    f10 = t1Var.getPhotoImage().getImageX() + t1Var.getX() + q1Var.getX();
                    f11 = t1Var.getPhotoImage().getImageX2() + t1Var.getX() + q1Var.getX();
                    f12 = t1Var.getPhotoImage().getImageY() + t1Var.getY() + q1Var.getY();
                    y10 = t1Var.getPhotoImage().getImageY2() + t1Var.getY() + q1Var.getY();
                }
                f13 = Math.min(Math.min(f13, f10), f11);
                f15 = Math.max(Math.max(f15, f10), f11);
                f14 = Math.min(Math.min(f14, f12), y10);
                f16 = Math.max(Math.max(f16, f12), y10);
            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                if (v0Var.C0.d()) {
                    float x12 = v0Var.getX() + q1Var.getX() + v0Var.getBoundsLeft();
                    float x13 = v0Var.getX() + q1Var.getX() + v0Var.getBoundsRight();
                    float y11 = v0Var.getY() + q1Var.getY();
                    float y12 = v0Var.getY() + q1Var.getY() + v0Var.getMeasuredHeight();
                    f13 = Math.min(Math.min(f13, x12), x13);
                    f15 = Math.max(Math.max(f15, x12), x13);
                    f14 = Math.min(Math.min(f14, y11), y12);
                    f16 = Math.max(Math.max(f16, y11), y12);
                }
            }
            i10++;
        }
    }

    public final void s() {
        r1 r1Var = this.o0;
        r1Var.invalidate();
        for (int i10 = 0; i10 < r1Var.getChildCount(); i10++) {
            r1Var.getChildAt(i10).invalidate();
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
    public void setupTheme(r6 r6Var) {
        SparseIntArray Q0;
        int[] iArr;
        int i10;
        i6 k10;
        if (r6Var == null) {
            this.z0.clear();
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (k6.N0(string) == null || k6.N0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (k6.N0(string2) == null || !k6.N0(string2).q()) {
            string2 = "Dark Blue";
        }
        j6 j6Var = k6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (j6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            boolean z4 = r6Var.y0;
            this.y0 = z4;
            j6 N0 = !z4 ? k6.N0(str2) : k6.N0(str);
            String[] strArr = new String[1];
            String str3 = N0.d;
            Q0 = str3 == null ? k6.Q0(null, str3, strArr) : k6.Q0(new File(N0.b), null, strArr);
            this.z0.clear();
            iArr = k6.nl;
            if (iArr != null) {
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    this.z0.put(i11, iArr[i11]);
                }
            }
            for (i10 = 0; i10 < Q0.size(); i10++) {
                this.z0.put(Q0.keyAt(i10), Q0.valueAt(i10));
            }
            k10 = N0.k(false);
            if (k10 != null) {
                k10.c(Q0, this.z0);
            }
            s();
        }
        str = string;
        boolean z42 = r6Var.y0;
        this.y0 = z42;
        if (!z42) {
        }
        String[] strArr2 = new String[1];
        String str32 = N0.d;
        if (str32 == null) {
        }
        this.z0.clear();
        iArr = k6.nl;
        if (iArr != null) {
        }
        while (i10 < Q0.size()) {
        }
        k10 = N0.k(false);
        if (k10 != null) {
        }
        s();
    }
}
