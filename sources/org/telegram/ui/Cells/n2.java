package org.telegram.ui.Cells;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n2 {
    public long a;
    public long b;
    public boolean c;
    public boolean d;
    public long e;
    public int f;
    public Integer g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public float l;
    public boolean m;
    public int n;
    public boolean o = false;
    public long p;
    public final /* synthetic */ q2 q;

    public n2(q2 q2Var) {
        this.q = q2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0111, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r2).getTopicsController().endIsReached(-r1.E0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014f, code lost:
    
        if (android.text.TextUtils.isEmpty(r5.message) != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        Integer num;
        int i10;
        long j10;
        boolean z4;
        boolean z10;
        TLRPC.DraftMessage draft;
        int i11;
        boolean z11;
        boolean isTranslatingDialog;
        boolean z12;
        int topicId;
        int topicId2;
        int topicId3;
        int topicId4;
        q2 q2Var = this.q;
        int i12 = q2Var.C0;
        TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(q2Var.E0);
        if (dialog == null) {
            if (q2Var.g1 == 3) {
                long j11 = this.a;
                long j12 = q2Var.E0;
                if (j11 != j12) {
                    this.a = j12;
                    return true;
                }
            }
            return false;
        }
        MessageObject messageObject = q2Var.c1;
        int hashCode = messageObject == null ? 0 : q2Var.c1.hashCode() + messageObject.getId();
        long j13 = dialog.read_inbox_max_id + (dialog.read_outbox_max_id << 8) + ((dialog.unread_count + (dialog.unread_mark ? -1 : 0)) << 16) + (dialog.unread_reactions_count > 0 ? 262144 : 0) + (dialog.unread_mentions_count > 0 ? TLObject.FLAG_19 : 0) + (dialog.unread_poll_votes_count > 0 ? TLObject.FLAG_21 : 0);
        if (q2Var.Q()) {
            int[] forumUnreadCount = MessagesController.getInstance(i12).getTopicsController().getForumUnreadCount(-q2Var.E0);
            if (forumUnreadCount[2] > 0) {
                j13 |= 1048576;
            }
            if (forumUnreadCount[4] > 0) {
                j13 |= 4194304;
            }
        }
        if (!q2Var.Q() && (q2Var.K0 || q2Var.M)) {
            MessagesController messagesController = MessagesController.getInstance(i12);
            long j14 = q2Var.E0;
            topicId3 = q2Var.getTopicId();
            if (!TextUtils.isEmpty(messagesController.getPrintingString(j14, topicId3, true))) {
                MessagesController messagesController2 = MessagesController.getInstance(i12);
                long j15 = q2Var.E0;
                topicId4 = q2Var.getTopicId();
                num = messagesController2.getPrintingStringType(j15, topicId4);
                int measuredWidth = q2Var.getMeasuredWidth() + (q2Var.getMeasuredHeight() << 16);
                if (q2Var.Q()) {
                    ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i12).getTopicsController().getTopics(-q2Var.E0);
                    i10 = topics == null ? -1 : topics.size();
                    if (i10 == -1) {
                    }
                    if (!q2Var.M) {
                        j10 = j13;
                        z4 = false;
                        if (q2Var.K0) {
                            z10 = MediaDataController.getInstance(i12).getDraftVoice(q2Var.E0, 0L) != null;
                            draft = !z10 ? MediaDataController.getInstance(i12).getDraft(q2Var.E0, 0L) : null;
                            if (draft == null) {
                            }
                            TLRPC.Chat chat = q2Var.d2;
                            if (chat == null) {
                            }
                            isTranslatingDialog = MessagesController.getInstance(i12).getTranslateController().isTranslatingDialog(q2Var.E0);
                            if (this.h != measuredWidth) {
                            }
                            if (this.a != q2Var.E0) {
                            }
                            if (num != null) {
                            }
                            this.a = q2Var.E0;
                            this.b = hashCode;
                            this.d = dialog.isFolder;
                            this.e = j10;
                            this.g = num;
                            this.h = measuredWidth;
                            this.f = i11;
                            this.i = i10;
                            this.j = q2Var.x3;
                            this.k = z11;
                            this.c = isTranslatingDialog;
                            return true;
                        }
                        z10 = false;
                        draft = null;
                        if (draft == null) {
                        }
                        TLRPC.Chat chat2 = q2Var.d2;
                        if (chat2 == null) {
                        }
                        isTranslatingDialog = MessagesController.getInstance(i12).getTranslateController().isTranslatingDialog(q2Var.E0);
                        if (this.h != measuredWidth) {
                        }
                        if (this.a != q2Var.E0) {
                        }
                        if (num != null) {
                        }
                        this.a = q2Var.E0;
                        this.b = hashCode;
                        this.d = dialog.isFolder;
                        this.e = j10;
                        this.g = num;
                        this.h = measuredWidth;
                        this.f = i11;
                        this.i = i10;
                        this.j = q2Var.x3;
                        this.k = z11;
                        this.c = isTranslatingDialog;
                        return true;
                    }
                    MediaDataController mediaDataController = MediaDataController.getInstance(i12);
                    long j16 = q2Var.E0;
                    topicId = q2Var.getTopicId();
                    z4 = false;
                    z10 = mediaDataController.getDraftVoice(j16, (long) topicId) != null;
                    if (z10) {
                        j10 = j13;
                        draft = null;
                    } else {
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i12);
                        long j17 = q2Var.E0;
                        topicId2 = q2Var.getTopicId();
                        j10 = j13;
                        draft = mediaDataController2.getDraft(j17, topicId2);
                    }
                    if (draft != null) {
                    }
                    if (draft == null) {
                        i11 = 0;
                    } else {
                        int hashCode2 = draft.message.hashCode();
                        TLRPC.InputReplyTo inputReplyTo = draft.reply_to;
                        i11 = (inputReplyTo != null ? inputReplyTo.reply_to_msg_id << 16 : 0) + hashCode2;
                    }
                    TLRPC.Chat chat22 = q2Var.d2;
                    z11 = chat22 == null && chat22.call_active && chat22.call_not_empty;
                    isTranslatingDialog = MessagesController.getInstance(i12).getTranslateController().isTranslatingDialog(q2Var.E0);
                    if (this.h != measuredWidth && this.b == hashCode && this.c == isTranslatingDialog && this.a == q2Var.E0 && this.d == dialog.isFolder && this.e == j10 && Objects.equals(this.g, num) && this.i == i10 && i11 == this.f && this.j == q2Var.x3 && this.k == z11 && q2Var.h2 == z10) {
                        return z4;
                    }
                    if (this.a != q2Var.E0) {
                        this.l = num == null ? 0.0f : 1.0f;
                        this.o = false;
                    } else if (!Objects.equals(this.g, num) || this.o) {
                        boolean z13 = this.o;
                        if (!z13 && num == null) {
                            this.o = true;
                            this.p = System.currentTimeMillis();
                        } else if (z13 && this.b != hashCode) {
                            z12 = false;
                            this.o = false;
                            if (this.b == hashCode) {
                                this.m = z12;
                            } else {
                                this.m = true;
                            }
                        }
                        z12 = false;
                        if (this.b == hashCode) {
                        }
                    }
                    if (num != null) {
                        this.n = num.intValue();
                    }
                    this.a = q2Var.E0;
                    this.b = hashCode;
                    this.d = dialog.isFolder;
                    this.e = j10;
                    this.g = num;
                    this.h = measuredWidth;
                    this.f = i11;
                    this.i = i10;
                    this.j = q2Var.x3;
                    this.k = z11;
                    this.c = isTranslatingDialog;
                    return true;
                }
                i10 = 0;
                if (!q2Var.M) {
                }
            }
        }
        num = null;
        int measuredWidth2 = q2Var.getMeasuredWidth() + (q2Var.getMeasuredHeight() << 16);
        if (q2Var.Q()) {
        }
        i10 = 0;
        if (!q2Var.M) {
        }
    }

    public final void b() {
        boolean z4 = this.o;
        q2 q2Var = this.q;
        if (z4) {
            if (System.currentTimeMillis() - this.p > 100) {
                this.o = false;
            }
            q2Var.invalidate();
            return;
        }
        Integer num = this.g;
        if (num != null && q2Var.c3 != null) {
            float f10 = this.l;
            if (f10 != 1.0f) {
                this.l = f10 + 0.08f;
                q2Var.invalidate();
                this.l = Utilities.clamp(this.l, 1.0f, 0.0f);
            }
        }
        if (num == null) {
            float f11 = this.l;
            if (f11 != 0.0f) {
                this.l = f11 - 0.08f;
                q2Var.invalidate();
            }
        }
        this.l = Utilities.clamp(this.l, 1.0f, 0.0f);
    }
}
