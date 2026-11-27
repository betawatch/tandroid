// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class b47 extends h44 {
    public int A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public final SparseIntArray E0;
    public final a47 F0;
    public t37 G0;
    public t37 H0;
    public t37 I0;
    public t37 J0;
    public t37 K0;
    public t37 L0;
    public t37 M0;
    public t37 N0;
    public final jo0 s0;
    public final v37 t0;
    public final ArrayList u0;
    public final m47 v0;
    public boolean w0;
    public boolean x0;
    public TextureView y0;
    public boolean z0;

    public b47(Context context, PointF pointF, ArrayList arrayList, tl0 tl0Var, boolean z, o00 o00Var) {
        super(context, pointF);
        yt4 yt4Var;
        TLRPC.Message message;
        TLRPC.Message tL_messageService;
        Boolean C;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        this.u0 = new ArrayList();
        this.A0 = 1;
        this.B0 = 1;
        this.C0 = true;
        this.D0 = aob.I.o();
        this.E0 = new SparseIntArray();
        vw7 vw7Var = (vw7) this;
        this.F0 = new a47(vw7Var);
        setRotation(0.0f);
        setScale(1.0f);
        byte b = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            r47 r47Var = (r47) arrayList.get(i);
            TLRPC.Message message2 = r47Var.k;
            int i2 = message2.date;
            if (message2 instanceof TLRPC.TL_message) {
                tL_messageService = new TLRPC.TL_message();
            } else if (message2 instanceof TLRPC.TL_messageService) {
                tL_messageService = new TLRPC.TL_messageService();
            } else {
                message = message2;
                C = c8b.C(r47Var);
                if (C != null && C.booleanValue() && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                    message.from_id = peer;
                    message.peer_id = peer;
                    message.flags &= -5;
                    message.fwd_from = null;
                }
                message.voiceTranscriptionOpen = false;
                int i3 = r47Var.K1;
                r47 r47Var2 = new r47(i3, message, r47Var.C, uc7.s1(i3).d, uc7.s1(r47Var.K1).b, null, null, true, true, 0L, true, z, false, 0);
                r47Var2.K5();
                this.u0.add(r47Var2);
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
            tL_messageService.flags2 = message2.flags2;
            tL_messageService.rich_message = message2.rich_message;
            tL_messageService.translatedRichMessage = message2.translatedRichMessage;
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
            C = c8b.C(r47Var);
            if (C != null) {
                message.from_id = peer;
                message.peer_id = peer;
                message.flags &= -5;
                message.fwd_from = null;
            }
            message.voiceTranscriptionOpen = false;
            int i32 = r47Var.K1;
            r47 r47Var22 = new r47(i32, message, r47Var.C, uc7.s1(i32).d, uc7.s1(r47Var.K1).b, null, null, true, true, 0L, true, z, false, 0);
            r47Var22.K5();
            this.u0.add(r47Var22);
        }
        this.v0 = null;
        if (this.u0.size() > 1) {
            m47 m47Var = new m47();
            this.v0 = m47Var;
            m47Var.d.addAll(this.u0);
            m47Var.a = ((r47) this.u0.get(0)).c1();
            m47Var.a();
        }
        jo0 jo0Var = new jo0(vw7Var, context);
        this.s0 = jo0Var;
        addView(jo0Var, tre.c(-1.0f, -1));
        v37 v37Var = new v37(vw7Var, context, this.F0);
        this.t0 = v37Var;
        v37Var.setAdapter(new y37(vw7Var, context, tl0Var, o00Var, z));
        z37 z37Var = new z37(vw7Var, b);
        byte b2 = 8;
        z37Var.O = new ar1(vw7Var, b2);
        v37Var.setLayoutManager(z37Var);
        v37Var.i(new br1(b2));
        jo0Var.addView(v37Var, tre.c(-1.0f, -1));
        if (o00Var != null && o00Var.g) {
            zj3 zj3Var = new zj3(vw7Var, (byte) 26);
            yt4 yt4Var2 = new yt4((Object) vw7Var, (byte) 17);
            o00Var.b = zj3Var;
            o00Var.c = yt4Var2;
            TextureView textureView = (TextureView) o00Var.a;
            if (textureView != null) {
                zj3Var.a(textureView);
            }
            if (o00Var.d && (yt4Var = (yt4) o00Var.c) != null) {
                yt4Var.a(Integer.valueOf(o00Var.e), Integer.valueOf(o00Var.f));
            }
        }
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public wb2 getCell() {
        v37 v37Var = this.t0;
        if (v37Var == null) {
            return null;
        }
        for (int i = 0; i < v37Var.getChildCount(); i++) {
            if (v37Var.getChildAt(i) instanceof wb2) {
                return (wb2) v37Var.getChildAt(i);
            }
        }
        return null;
    }

    @Override // h44
    public final g44 a() {
        return new r66(this, getContext());
    }

    @Override // h44
    public float getBounceScale() {
        return 0.02f;
    }

    @Override // h44
    public a69 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new a69();
        }
        float scaleX = viewGroup.getScaleX();
        return new a69(((getPositionX() * scaleX) - (((getScale() * getMeasuredWidth()) / 2.0f) * scaleX)) - hl.L(35.5f), ((getPositionY() * scaleX) - (((getScale() * getMeasuredHeight()) / 2.0f) * scaleX)) - hl.L(35.5f), (getScale() * getMeasuredWidth() * scaleX) + hl.L(71.0f), (getScale() * getMeasuredHeight() * scaleX) + hl.L(71.0f));
    }

    @Override // h44
    public final void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
        if (this.x0) {
            s();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (((r47) r0.get(0)).U == 1) goto L11;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z;
        jo0 jo0Var = this.s0;
        jo0Var.measure(i, i2);
        setMeasuredDimension(jo0Var.getMeasuredWidth(), jo0Var.getMeasuredHeight());
        k();
        if (this.C0) {
            ArrayList arrayList = this.u0;
            if (arrayList != null) {
                z = true;
                if (arrayList.size() == 1) {
                }
            }
            z = false;
            float min = Math.min((View.MeasureSpec.getSize(i) - hl.L(z ? 0.0f : 44.0f)) / getMeasuredWidth(), (View.MeasureSpec.getSize(i2) - hl.L(z ? 0.0f : 192.0f)) / getMeasuredHeight());
            if (min < 1.0f) {
                setScale(min);
            }
            PointF position = getPosition();
            if (!z) {
                position.x -= Math.min(1.0f, min) * hl.L(19.0f);
            }
            setPosition(position);
            this.C0 = false;
        }
    }

    public final float r(RectF rectF) {
        float y;
        float f;
        float f2;
        float f3;
        float f4 = 2.1474836E9f;
        float f5 = -2.1474836E9f;
        int i = 0;
        float f6 = 2.1474836E9f;
        float f7 = -2.1474836E9f;
        while (true) {
            v37 v37Var = this.t0;
            if (i >= v37Var.getChildCount()) {
                rectF.set(f4, f6, f7, f5);
                return hl.L(xea.U0);
            }
            View childAt = v37Var.getChildAt(i);
            boolean z = childAt instanceof wb2;
            jo0 jo0Var = this.s0;
            if (z) {
                wb2 wb2Var = (wb2) childAt;
                if (wb2Var.getMessageObject() == null || !wb2Var.getMessageObject().g4() || wb2Var.getPhotoImage() == null) {
                    float x = childAt.getX() + jo0Var.getX() + wb2Var.getBackgroundDrawableLeft() + hl.L(1.0f);
                    if (this.v0 == null) {
                        x += hl.L(8.0f);
                    }
                    float x2 = ((childAt.getX() + jo0Var.getX()) + wb2Var.getBackgroundDrawableRight()) - hl.L(1.66f);
                    float L = hl.L(2.0f) + childAt.getY() + jo0Var.getY() + wb2Var.getBackgroundDrawableTop();
                    y = ((childAt.getY() + jo0Var.getY()) + wb2Var.getBackgroundDrawableBottom()) - hl.L(1.0f);
                    f = x;
                    f2 = x2;
                    f3 = L;
                } else {
                    f = wb2Var.getX() + jo0Var.getX() + wb2Var.getPhotoImage().L0;
                    f2 = wb2Var.getPhotoImage().w() + wb2Var.getX() + jo0Var.getX();
                    f3 = wb2Var.getY() + jo0Var.getY() + wb2Var.getPhotoImage().M0;
                    y = wb2Var.getPhotoImage().x() + wb2Var.getY() + jo0Var.getY();
                }
                f4 = Math.min(Math.min(f4, f), f2);
                f7 = Math.max(Math.max(f7, f), f2);
                f6 = Math.min(Math.min(f6, f3), y);
                f5 = Math.max(Math.max(f5, f3), y);
            } else if (childAt instanceof dl1) {
                dl1 dl1Var = (dl1) childAt;
                if (dl1Var.T()) {
                    float x3 = dl1Var.getX() + jo0Var.getX() + dl1Var.getBoundsLeft();
                    float x4 = dl1Var.getX() + jo0Var.getX() + dl1Var.getBoundsRight();
                    float y2 = dl1Var.getY() + jo0Var.getY();
                    float y3 = dl1Var.getY() + jo0Var.getY() + dl1Var.getMeasuredHeight();
                    f4 = Math.min(Math.min(f4, x3), x4);
                    f7 = Math.max(Math.max(f7, x3), x4);
                    f6 = Math.min(Math.min(f6, y2), y3);
                    f5 = Math.max(Math.max(f5, y2), y3);
                }
            }
            i++;
        }
    }

    public final void s() {
        v37 v37Var = this.t0;
        v37Var.invalidate();
        for (int i = 0; i < v37Var.getChildCount(); i++) {
            v37Var.getChildAt(i).invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[LOOP:1: B:36:0x00a4->B:38:0x00aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setupTheme(c8b c8bVar) {
        SparseIntArray R0;
        int[] iArr;
        int i;
        ynb i2;
        if (c8bVar == null) {
            this.E0.clear();
            return;
        }
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (aob.O0(string) == null || aob.O0(string).o()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (aob.O0(string2) == null || !aob.O0(string2).o()) {
            string2 = "Dark Blue";
        }
        znb znbVar = aob.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (znbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            boolean z = c8bVar.y0;
            this.D0 = z;
            znb O0 = !z ? aob.O0(str2) : aob.O0(str);
            String[] strArr = new String[1];
            String str3 = O0.d;
            R0 = str3 == null ? aob.R0(null, str3, strArr) : aob.R0(new File(O0.b), null, strArr);
            this.E0.clear();
            iArr = aob.hm;
            if (iArr != null) {
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    this.E0.put(i3, iArr[i3]);
                }
            }
            for (i = 0; i < R0.size(); i++) {
                this.E0.put(R0.keyAt(i), R0.valueAt(i));
            }
            i2 = O0.i(false);
            if (i2 != null) {
                i2.d(R0, this.E0);
            }
            s();
        }
        str = string;
        boolean z2 = c8bVar.y0;
        this.D0 = z2;
        if (!z2) {
        }
        String[] strArr2 = new String[1];
        String str32 = O0.d;
        if (str32 == null) {
        }
        this.E0.clear();
        iArr = aob.hm;
        if (iArr != null) {
        }
        while (i < R0.size()) {
        }
        i2 = O0.i(false);
        if (i2 != null) {
        }
        s();
    }
}
