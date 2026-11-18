package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class hr0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ pr0 a;

    public hr0(pr0 pr0Var) {
        this.a = pr0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        pr0 pr0Var = this.a;
        boolean[] zArr = pr0Var.x;
        CharSequence[] charSequenceArr = pr0Var.w;
        bn bnVar = pr0Var.f;
        if (i7 == -1) {
            if (pr0Var.m0(true)) {
                pr0Var.finishFragment();
                return;
            }
            return;
        }
        if (i7 == 1) {
            int i17 = 0;
            if (pr0Var.e0) {
                CharSequence[] charSequenceArr2 = {org.telegram.ui.Components.rn.d0(pr0Var.F)};
                i14 = ((org.telegram.ui.ActionBar.h2) pr0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> Y = org.telegram.messenger.ri.d0(i14).Y(charSequenceArr2, true, true);
                CharSequence charSequence = charSequenceArr2[0];
                int size = Y.size();
                for (int i18 = 0; i18 < size; i18++) {
                    TLRPC.MessageEntity messageEntity = Y.get(i18);
                    if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                        messageEntity.length = charSequence.length() - messageEntity.offset;
                    }
                }
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
                TLRPC.TodoList todoList = new TLRPC.TodoList();
                tL_messageMediaToDo.todo = todoList;
                todoList.others_can_append = pr0Var.I;
                todoList.others_can_complete = pr0Var.K;
                todoList.title = new TLRPC.TL_textWithEntities();
                tL_messageMediaToDo.todo.title.text = charSequence.toString();
                tL_messageMediaToDo.todo.title.entities = Y;
                if (pr0Var.r != null) {
                    int i19 = 0;
                    i15 = 0;
                    while (true) {
                        int[] iArr = pr0Var.r;
                        if (i19 >= iArr.length) {
                            break;
                        }
                        i15 = Math.max(i15, iArr[i19]);
                        i19++;
                    }
                } else {
                    i15 = 0;
                }
                for (int i20 = 0; i20 < charSequenceArr.length; i20++) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.rn.d0(charSequenceArr[i20]))) {
                        CharSequence[] charSequenceArr3 = {org.telegram.ui.Components.rn.d0(charSequenceArr[i20])};
                        i16 = ((org.telegram.ui.ActionBar.h2) pr0Var).currentAccount;
                        ArrayList<TLRPC.MessageEntity> Y2 = org.telegram.messenger.ri.d0(i16).Y(charSequenceArr3, true, true);
                        CharSequence charSequence2 = charSequenceArr3[0];
                        int size2 = Y2.size();
                        for (int i21 = 0; i21 < size2; i21++) {
                            TLRPC.MessageEntity messageEntity2 = Y2.get(i21);
                            if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                            }
                        }
                        TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        todoItem.title = tL_textWithEntities;
                        tL_textWithEntities.text = charSequence2.toString();
                        todoItem.title.entities = Y2;
                        int[] iArr2 = pr0Var.r;
                        if (iArr2 == null || i20 >= iArr2.length) {
                            i15++;
                            todoItem.id = i15;
                        } else {
                            todoItem.id = iArr2[i20];
                        }
                        tL_messageMediaToDo.todo.list.add(todoItem);
                    }
                }
                if (bnVar.c()) {
                    org.telegram.ui.Components.b5.I(bnVar.getParentActivity(), bnVar.a(), new aj0(8, this, tL_messageMediaToDo));
                    return;
                } else {
                    pr0Var.f0.a(tL_messageMediaToDo);
                    pr0Var.finishFragment();
                    return;
                }
            }
            if (pr0Var.M && pr0Var.a.getAlpha() != 1.0f) {
                int i22 = 0;
                while (i17 < zArr.length) {
                    if (!TextUtils.isEmpty(org.telegram.ui.Components.rn.d0(charSequenceArr[i17])) && zArr[i17]) {
                        i22++;
                    }
                    i17++;
                }
                if (i22 <= 0) {
                    for (int i23 = pr0Var.o0; i23 < pr0Var.o0 + pr0Var.E; i23++) {
                        v4.f1 K = pr0Var.c.K(i23);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.b6) {
                                org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
                                if (b6Var.getTop() > org.telegram.messenger.g0.L(40.0f)) {
                                    pr0Var.h.c(b6Var.getCheckBox());
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            CharSequence[] charSequenceArr4 = {org.telegram.ui.Components.rn.d0(pr0Var.F)};
            i10 = ((org.telegram.ui.ActionBar.h2) pr0Var).currentAccount;
            ArrayList<TLRPC.MessageEntity> Y3 = org.telegram.messenger.ri.d0(i10).Y(charSequenceArr4, true, true);
            CharSequence charSequence3 = charSequenceArr4[0];
            int size3 = Y3.size();
            for (int i24 = 0; i24 < size3; i24++) {
                TLRPC.MessageEntity messageEntity3 = Y3.get(i24);
                if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                    messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                }
            }
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
            TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
            tL_messageMediaPoll.poll = tL_poll;
            tL_poll.multiple_choice = pr0Var.L;
            tL_poll.quiz = pr0Var.M;
            tL_poll.public_voters = !pr0Var.H;
            tL_poll.question = new TLRPC.TL_textWithEntities();
            tL_messageMediaPoll.poll.question.text = charSequence3.toString();
            tL_messageMediaPoll.poll.question.entities = Y3;
            ArrayList arrayList = new ArrayList(pr0Var.n);
            int i25 = 0;
            while (i25 < charSequenceArr.length) {
                if (TextUtils.isEmpty(org.telegram.ui.Components.rn.d0(charSequenceArr[i25]))) {
                    i13 = i17;
                } else {
                    CharSequence[] charSequenceArr5 = new CharSequence[1];
                    charSequenceArr5[i17] = org.telegram.ui.Components.rn.d0(charSequenceArr[i25]);
                    i12 = ((org.telegram.ui.ActionBar.h2) pr0Var).currentAccount;
                    ArrayList<TLRPC.MessageEntity> Y4 = org.telegram.messenger.ri.d0(i12).Y(charSequenceArr5, true, true);
                    CharSequence charSequence4 = charSequenceArr5[i17];
                    int size4 = Y4.size();
                    int i26 = i17;
                    while (i26 < size4) {
                        TLRPC.MessageEntity messageEntity4 = Y4.get(i26);
                        int i27 = i17;
                        if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                            messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                        }
                        i26++;
                        i17 = i27;
                    }
                    i13 = i17;
                    TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                    tL_pollAnswer.text = tL_textWithEntities2;
                    tL_textWithEntities2.text = charSequence4.toString();
                    tL_pollAnswer.text.entities = Y4;
                    byte[] bArr = new byte[1];
                    tL_pollAnswer.option = bArr;
                    bArr[i13] = (byte) (tL_messageMediaPoll.poll.answers.size() + 48);
                    if ((pr0Var.L || pr0Var.M) && zArr[i25]) {
                        arrayList.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                    }
                    tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                }
                i25++;
                i17 = i13;
            }
            int i28 = i17;
            tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
            CharSequence d02 = org.telegram.ui.Components.rn.d0(pr0Var.G);
            if (d02 != null) {
                tL_messageMediaPoll.results.solution = d02.toString();
                CharSequence[] charSequenceArr6 = new CharSequence[1];
                charSequenceArr6[i28] = d02;
                i11 = ((org.telegram.ui.ActionBar.h2) pr0Var).currentAccount;
                ArrayList<TLRPC.MessageEntity> Y5 = org.telegram.messenger.ri.d0(i11).Y(charSequenceArr6, true, true);
                if (Y5 != null && !Y5.isEmpty()) {
                    tL_messageMediaPoll.results.solution_entities = Y5;
                }
                if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                    tL_messageMediaPoll.results.flags |= 16;
                }
            }
            if (bnVar.c()) {
                org.telegram.ui.Components.b5.I(bnVar.getParentActivity(), bnVar.a(), new aj0(this, tL_messageMediaPoll, arrayList));
            } else {
                pr0Var.f0.a(tL_messageMediaPoll);
                pr0Var.finishFragment();
            }
        }
    }
}
