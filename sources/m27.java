// default package

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class m27 {
    public final Boolean a;
    public final byte b;
    public final long c;
    public final ArrayList e;
    public final SparseBooleanArray g;
    public final boolean i;
    public final boolean j;
    public final /* synthetic */ o27 k;
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m27(o27 o27Var, Boolean bool, int i, ArrayList arrayList, long j, SparseBooleanArray sparseBooleanArray) {
        LongSparseArray longSparseArray;
        int i2;
        long j2;
        TLRPC.MessageFwdHeader messageFwdHeader;
        k27 k27Var;
        this.k = o27Var;
        this.g = new SparseBooleanArray();
        this.a = bool;
        this.b = i;
        this.c = j;
        this.e = arrayList;
        if (sparseBooleanArray != null) {
            this.g = sparseBooleanArray;
        }
        int i3 = 0;
        while (i3 < arrayList.size()) {
            k27 k27Var2 = (k27) arrayList.get(i3);
            if (i == 0 && sparseBooleanArray == null) {
                this.g.put(k27Var2.e1(), true);
            }
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            if (i != 1) {
                tL_message.date = ConnectionsManager.getInstance(k27Var2.K1).getCurrentTime();
            } else {
                tL_message.date = k27Var2.k.date;
            }
            TLRPC.Message message = k27Var2.k;
            int i4 = k27Var2.K1;
            tL_message.id = message.id;
            int i5 = i3;
            tL_message.grouped_id = message.grouped_id;
            tL_message.peer_id = message.peer_id;
            tL_message.from_id = message.from_id;
            tL_message.message = message.message;
            tL_message.rich_message = message.rich_message;
            tL_message.media = message.media;
            tL_message.action = message.action;
            tL_message.edit_date = 0;
            ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
            if (arrayList2 != null) {
                tL_message.entities.addAll(arrayList2);
            }
            boolean booleanValue = bool == null ? k27Var2.k.out : bool.booleanValue();
            tL_message.out = booleanValue;
            if (booleanValue) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = y6c.h(i4).e();
            }
            tL_message.unread = false;
            TLRPC.Message message2 = k27Var2.k;
            tL_message.via_bot_id = message2.via_bot_id;
            tL_message.reply_markup = message2.reply_markup;
            tL_message.post = message2.post;
            tL_message.legacy = message2.legacy;
            tL_message.restriction_reason = message2.restriction_reason;
            TLRPC.Message message3 = message2.replyMessage;
            tL_message.replyMessage = message3;
            if (message3 == null && (k27Var = k27Var2.C) != null) {
                tL_message.replyMessage = k27Var.k;
            }
            tL_message.reply_to = message2.reply_to;
            tL_message.invert_media = message2.invert_media;
            if (i == 0) {
                long e = y6c.h(i4).e();
                j2 = 0;
                if (o27Var.i) {
                    i2 = i4;
                } else {
                    TLRPC.Message message4 = k27Var2.k;
                    messageFwdHeader = message4.fwd_from;
                    if (messageFwdHeader != null) {
                        if (k27Var2.T2()) {
                            o27Var.m = true;
                        } else {
                            o27Var.h = true;
                        }
                        i2 = i4;
                    } else {
                        i2 = i4;
                        long j3 = message4.from_id.user_id;
                        if (j3 == 0 || message4.dialog_id != e || j3 != e) {
                            messageFwdHeader = new TLRPC.TL_messageFwdHeader();
                            messageFwdHeader.from_id = k27Var2.k.from_id;
                            if (k27Var2.T2()) {
                                o27Var.m = true;
                            } else {
                                o27Var.h = true;
                            }
                        }
                    }
                    if (messageFwdHeader != null) {
                        tL_message.fwd_from = messageFwdHeader;
                        tL_message.flags |= 4;
                    }
                    if (k27Var2.a5()) {
                        tL_message.id = k27Var2.P0();
                        TLRPC.MessageFwdHeader messageFwdHeader2 = tL_message.fwd_from;
                        if (messageFwdHeader2 != null && messageFwdHeader2.from_id != null) {
                            messageFwdHeader2.from_id = (TLRPC.Peer) TLObject.deepCopy(k27Var2.k.peer_id, new yw6((byte) 23));
                            long n = cf3.n(k27Var2.k.from_id);
                            if (n > 0) {
                                tL_message.via_bot_id = n;
                            }
                        }
                    }
                }
                messageFwdHeader = null;
                if (messageFwdHeader != null) {
                }
                if (k27Var2.a5()) {
                }
            } else {
                i2 = i4;
                j2 = 0;
            }
            l27 l27Var = new l27(o27Var, i2, tL_message, i);
            l27Var.u1 = i == 0;
            l27Var.t1 = true;
            if (!this.i) {
                ArrayList<TLRPC.MessageEntity> arrayList3 = l27Var.k.entities;
                int size = arrayList3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        break;
                    }
                    TLRPC.MessageEntity messageEntity = arrayList3.get(i6);
                    i6++;
                    if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                        this.i = true;
                        break;
                    }
                }
            }
            l27Var.k.dialog_id = j;
            if (l27Var.c1() != j2) {
                f27 f27Var = (f27) this.d.get(l27Var.c1(), null);
                if (f27Var == null) {
                    f27Var = new f27();
                    this.d.put(l27Var.c1(), f27Var);
                }
                f27Var.d.add(l27Var);
            }
            this.f.add(0, l27Var);
            if (k27Var2.S3()) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) k27Var2.k.media;
                n27 n27Var = new n27();
                n27Var.poll = tL_messageMediaPoll.poll;
                n27Var.provider = tL_messageMediaPoll.provider;
                TLRPC.TL_pollResults tL_pollResults = new TLRPC.TL_pollResults();
                n27Var.results = tL_pollResults;
                int i7 = tL_messageMediaPoll.results.total_voters;
                tL_pollResults.total_voters = i7;
                n27Var.a = i7;
                l27Var.k.media = n27Var;
                if (k27Var2.C()) {
                    int size2 = tL_messageMediaPoll.results.results.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i8);
                        if (pollAnswerVoters.chosen) {
                            TLRPC.PollAnswerVoters pollAnswerVoters2 = new TLRPC.PollAnswerVoters();
                            pollAnswerVoters2.chosen = pollAnswerVoters.chosen;
                            pollAnswerVoters2.correct = pollAnswerVoters.correct;
                            pollAnswerVoters2.flags = pollAnswerVoters.flags;
                            pollAnswerVoters2.option = pollAnswerVoters.option;
                            pollAnswerVoters2.voters = pollAnswerVoters.voters;
                            this.h.add(pollAnswerVoters2);
                            n27Var.results.results.add(pollAnswerVoters2);
                        } else {
                            n27Var.results.results.add(pollAnswerVoters);
                        }
                    }
                }
            }
            i3 = i5 + 1;
        }
        k27 k27Var3 = null;
        int i9 = 0;
        while (true) {
            int size3 = this.d.size();
            longSparseArray = this.d;
            if (i9 >= size3) {
                break;
            }
            ((f27) longSparseArray.valueAt(i9)).a();
            i9++;
        }
        if (longSparseArray == null || longSparseArray.size() <= 0) {
            if (arrayList.size() == 1) {
                int i10 = ((k27) arrayList.get(0)).D;
                if (i10 == 0 || i10 == 19) {
                    this.j = !TextUtils.isEmpty(r1.v);
                    return;
                } else {
                    this.j = !TextUtils.isEmpty(r1.z);
                    return;
                }
            }
            return;
        }
        f27 f27Var2 = (f27) this.d.valueAt(0);
        ArrayList arrayList4 = f27Var2.d;
        if (!arrayList4.isEmpty() && f27Var2.f.isEmpty()) {
            f27Var2.a();
        }
        k27 k27Var4 = null;
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList4.size()) {
                k27Var3 = k27Var4;
                break;
            }
            k27 k27Var5 = (k27) arrayList4.get(i11);
            if (!TextUtils.isEmpty(k27Var5.z)) {
                if (k27Var4 != null) {
                    break;
                } else {
                    k27Var4 = k27Var5;
                }
            }
            i11++;
        }
        this.j = k27Var3 != null;
    }

    public final m27 a(ArrayList arrayList) {
        ArrayList arrayList2 = this.e;
        if (arrayList2 == null || arrayList2.size() > 1 || arrayList == null) {
            return null;
        }
        boolean z = false;
        for (int i = 0; i < arrayList2.size(); i++) {
            k27 k27Var = (k27) arrayList2.get(i);
            if (k27Var != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    k27 k27Var2 = (k27) arrayList.get(i2);
                    if (k27Var2 != null && k27Var.e1() == k27Var2.e1() && k27.B0(k27Var.k) == k27.B0(k27Var2.k)) {
                        arrayList2.set(i, k27Var2);
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
        }
        if (!z) {
            return null;
        }
        return new m27(this.k, this.a, this.b, arrayList2, this.c, null);
    }

    public final void b(ArrayList arrayList) {
        arrayList.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i >= arrayList2.size()) {
                return;
            }
            k27 k27Var = (k27) arrayList2.get(i);
            if (this.g.get(k27Var.e1(), false)) {
                arrayList.add(k27Var);
            }
            i++;
        }
    }
}
