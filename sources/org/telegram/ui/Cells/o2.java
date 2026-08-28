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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o2 {
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
    public final /* synthetic */ r2 q;

    public o2(r2 r2Var) {
        this.q = r2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0111, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r2).getTopicsController().endIsReached(-r1.D0) != false) goto L58;
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
        int i9;
        long j10;
        boolean z10;
        boolean z11;
        TLRPC.DraftMessage draft;
        int i10;
        boolean z12;
        boolean isTranslatingDialog;
        boolean z13;
        int topicId;
        int topicId2;
        int topicId3;
        int topicId4;
        r2 r2Var = this.q;
        int i11 = r2Var.B0;
        TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i11).dialogs_dict.f(r2Var.D0);
        if (dialog == null) {
            if (r2Var.f1 == 3) {
                long j11 = this.a;
                long j12 = r2Var.D0;
                if (j11 != j12) {
                    this.a = j12;
                    return true;
                }
            }
            return false;
        }
        MessageObject messageObject = r2Var.b1;
        int hashCode = messageObject == null ? 0 : r2Var.b1.hashCode() + messageObject.getId();
        long j13 = dialog.read_inbox_max_id + (dialog.read_outbox_max_id << 8) + ((dialog.unread_count + (dialog.unread_mark ? -1 : 0)) << 16) + (dialog.unread_reactions_count > 0 ? 262144 : 0) + (dialog.unread_mentions_count > 0 ? TLObject.FLAG_19 : 0) + (dialog.unread_poll_votes_count > 0 ? TLObject.FLAG_21 : 0);
        if (r2Var.P()) {
            int[] forumUnreadCount = MessagesController.getInstance(i11).getTopicsController().getForumUnreadCount(-r2Var.D0);
            if (forumUnreadCount[2] > 0) {
                j13 |= 1048576;
            }
            if (forumUnreadCount[4] > 0) {
                j13 |= 4194304;
            }
        }
        if (!r2Var.P() && (r2Var.J0 || r2Var.L)) {
            MessagesController messagesController = MessagesController.getInstance(i11);
            long j14 = r2Var.D0;
            topicId3 = r2Var.getTopicId();
            if (!TextUtils.isEmpty(messagesController.getPrintingString(j14, topicId3, true))) {
                MessagesController messagesController2 = MessagesController.getInstance(i11);
                long j15 = r2Var.D0;
                topicId4 = r2Var.getTopicId();
                num = messagesController2.getPrintingStringType(j15, topicId4);
                int measuredWidth = r2Var.getMeasuredWidth() + (r2Var.getMeasuredHeight() << 16);
                if (r2Var.P()) {
                    ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i11).getTopicsController().getTopics(-r2Var.D0);
                    i9 = topics == null ? -1 : topics.size();
                    if (i9 == -1) {
                    }
                    if (!r2Var.L) {
                        j10 = j13;
                        z10 = false;
                        if (r2Var.J0) {
                            z11 = MediaDataController.getInstance(i11).getDraftVoice(r2Var.D0, 0L) != null;
                            draft = !z11 ? MediaDataController.getInstance(i11).getDraft(r2Var.D0, 0L) : null;
                            if (draft == null) {
                            }
                            TLRPC.Chat chat = r2Var.c2;
                            if (chat == null) {
                            }
                            isTranslatingDialog = MessagesController.getInstance(i11).getTranslateController().isTranslatingDialog(r2Var.D0);
                            if (this.h != measuredWidth) {
                            }
                            if (this.a != r2Var.D0) {
                            }
                            if (num != null) {
                            }
                            this.a = r2Var.D0;
                            this.b = hashCode;
                            this.d = dialog.isFolder;
                            this.e = j10;
                            this.g = num;
                            this.h = measuredWidth;
                            this.f = i10;
                            this.i = i9;
                            this.j = r2Var.w3;
                            this.k = z12;
                            this.c = isTranslatingDialog;
                            return true;
                        }
                        z11 = false;
                        draft = null;
                        if (draft == null) {
                        }
                        TLRPC.Chat chat2 = r2Var.c2;
                        if (chat2 == null) {
                        }
                        isTranslatingDialog = MessagesController.getInstance(i11).getTranslateController().isTranslatingDialog(r2Var.D0);
                        if (this.h != measuredWidth) {
                        }
                        if (this.a != r2Var.D0) {
                        }
                        if (num != null) {
                        }
                        this.a = r2Var.D0;
                        this.b = hashCode;
                        this.d = dialog.isFolder;
                        this.e = j10;
                        this.g = num;
                        this.h = measuredWidth;
                        this.f = i10;
                        this.i = i9;
                        this.j = r2Var.w3;
                        this.k = z12;
                        this.c = isTranslatingDialog;
                        return true;
                    }
                    MediaDataController mediaDataController = MediaDataController.getInstance(i11);
                    long j16 = r2Var.D0;
                    topicId = r2Var.getTopicId();
                    z10 = false;
                    z11 = mediaDataController.getDraftVoice(j16, (long) topicId) != null;
                    if (z11) {
                        j10 = j13;
                        draft = null;
                    } else {
                        MediaDataController mediaDataController2 = MediaDataController.getInstance(i11);
                        long j17 = r2Var.D0;
                        topicId2 = r2Var.getTopicId();
                        j10 = j13;
                        draft = mediaDataController2.getDraft(j17, topicId2);
                    }
                    if (draft != null) {
                    }
                    if (draft == null) {
                        i10 = 0;
                    } else {
                        int hashCode2 = draft.message.hashCode();
                        TLRPC.InputReplyTo inputReplyTo = draft.reply_to;
                        i10 = (inputReplyTo != null ? inputReplyTo.reply_to_msg_id << 16 : 0) + hashCode2;
                    }
                    TLRPC.Chat chat22 = r2Var.c2;
                    z12 = chat22 == null && chat22.call_active && chat22.call_not_empty;
                    isTranslatingDialog = MessagesController.getInstance(i11).getTranslateController().isTranslatingDialog(r2Var.D0);
                    if (this.h != measuredWidth && this.b == hashCode && this.c == isTranslatingDialog && this.a == r2Var.D0 && this.d == dialog.isFolder && this.e == j10 && Objects.equals(this.g, num) && this.i == i9 && i10 == this.f && this.j == r2Var.w3 && this.k == z12 && r2Var.g2 == z11) {
                        return z10;
                    }
                    if (this.a != r2Var.D0) {
                        this.l = num == null ? 0.0f : 1.0f;
                        this.o = false;
                    } else if (!Objects.equals(this.g, num) || this.o) {
                        boolean z14 = this.o;
                        if (!z14 && num == null) {
                            this.o = true;
                            this.p = System.currentTimeMillis();
                        } else if (z14 && this.b != hashCode) {
                            z13 = false;
                            this.o = false;
                            if (this.b == hashCode) {
                                this.m = z13;
                            } else {
                                this.m = true;
                            }
                        }
                        z13 = false;
                        if (this.b == hashCode) {
                        }
                    }
                    if (num != null) {
                        this.n = num.intValue();
                    }
                    this.a = r2Var.D0;
                    this.b = hashCode;
                    this.d = dialog.isFolder;
                    this.e = j10;
                    this.g = num;
                    this.h = measuredWidth;
                    this.f = i10;
                    this.i = i9;
                    this.j = r2Var.w3;
                    this.k = z12;
                    this.c = isTranslatingDialog;
                    return true;
                }
                i9 = 0;
                if (!r2Var.L) {
                }
            }
        }
        num = null;
        int measuredWidth2 = r2Var.getMeasuredWidth() + (r2Var.getMeasuredHeight() << 16);
        if (r2Var.P()) {
        }
        i9 = 0;
        if (!r2Var.L) {
        }
    }

    public final void b() {
        boolean z10 = this.o;
        r2 r2Var = this.q;
        if (z10) {
            if (System.currentTimeMillis() - this.p > 100) {
                this.o = false;
            }
            r2Var.invalidate();
            return;
        }
        Integer num = this.g;
        if (num != null && r2Var.b3 != null) {
            float f10 = this.l;
            if (f10 != 1.0f) {
                this.l = f10 + 0.08f;
                r2Var.invalidate();
                this.l = Utilities.clamp(this.l, 1.0f, 0.0f);
            }
        }
        if (num == null) {
            float f11 = this.l;
            if (f11 != 0.0f) {
                this.l = f11 - 0.08f;
                r2Var.invalidate();
            }
        }
        this.l = Utilities.clamp(this.l, 1.0f, 0.0f);
    }
}
