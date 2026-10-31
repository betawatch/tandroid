package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q10 extends TLObject {
    public TLRPC.TL_textWithEntities a;
    public ArrayList b = new ArrayList();
    public TLRPC.TL_textWithEntities c;

    public static q10 a(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        q10 q10Var = new q10();
        q10Var.a = poll.question;
        for (int i10 = 0; i10 < poll.answers.size(); i10++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i10);
            TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
            tL_pollAnswer.text = pollAnswer.text;
            tL_pollAnswer.option = pollAnswer.option;
            q10Var.b.add(tL_pollAnswer);
        }
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !TextUtils.isEmpty(pollResults.solution)) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            q10Var.c = tL_textWithEntities;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            tL_textWithEntities.text = pollResults2.solution;
            tL_textWithEntities.entities = pollResults2.solution_entities;
        }
        return q10Var;
    }

    public static boolean b(jj jjVar, q10 q10Var) {
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        TLRPC.Poll poll;
        TLRPC.MessageMedia n12 = jj.n1(jjVar);
        if (!(n12 instanceof TLRPC.TL_messageMediaPoll) || (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n12).poll) == null) {
            return true;
        }
        if ((poll.question != null) != (q10Var.a != null)) {
            return false;
        }
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        return (pollResults != null && pollResults.solution != null) == (q10Var.c != null) && poll.answers.size() == q10Var.b.size();
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        if ((readInt32 & 1) != 0) {
            this.a = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((readInt32 & 2) != 0) {
            this.b = Vector.deserialize(inputSerializedData, new e9(26), z10);
        }
        if ((readInt32 & 4) != 0) {
            this.c = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(613759672);
        int i10 = this.a != null ? 1 : 0;
        ArrayList arrayList = this.b;
        if (arrayList != null && !arrayList.isEmpty()) {
            i10 |= 2;
        }
        if (this.c != null) {
            i10 |= 4;
        }
        outputSerializedData.writeInt32(i10);
        if ((i10 & 1) != 0) {
            this.a.serializeToStream(outputSerializedData);
        }
        if ((i10 & 2) != 0) {
            Vector.serialize(outputSerializedData, this.b);
        }
        if ((i10 & 4) != 0) {
            this.c.serializeToStream(outputSerializedData);
        }
    }
}
