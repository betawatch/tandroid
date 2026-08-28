package org.telegram.ui.Components;

import android.text.Editable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements sk, td.i, org.telegram.ui.ActionBar.b2, ok0, lg.c, org.telegram.ui.ActionBar.s0, in, AndroidUtilities.IntColorCallback, x4, si {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki b;

    public /* synthetic */ tg(ki kiVar, int i9) {
        this.a = i9;
        this.b = kiVar;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        boolean G1;
        switch (this.a) {
            case 12:
                ki kiVar = this.b;
                ci ciVar = kiVar.u0;
                if (ciVar != kiVar.f0 && ciVar != kiVar.m0) {
                    if (!ciVar.H(i9, z10, i10, kiVar.s1(), 0L)) {
                        kiVar.w2 = true;
                        kiVar.dismiss();
                        break;
                    }
                } else {
                    kiVar.G1(i9, z10, 0, kiVar.s1(), kiVar.J0);
                    break;
                }
                break;
            default:
                ki kiVar2 = this.b;
                cf cfVar = kiVar2.d0;
                long k10 = cfVar != null ? cfVar.k() : 0L;
                vh vhVar = kiVar2.E0;
                kiVar2.J0 = k10;
                vhVar.setEffect(k10);
                ci ciVar2 = kiVar2.u0;
                if (ciVar2 == kiVar2.f0 || ciVar2 == kiVar2.m0) {
                    G1 = kiVar2.G1(i9, z10, i10, kiVar2.s1(), k10);
                } else {
                    if (!ciVar2.H(i9, z10, i10, kiVar2.s1(), k10)) {
                        kiVar2.dismiss();
                    }
                    G1 = false;
                }
                cf cfVar2 = kiVar2.d0;
                if (cfVar2 != null) {
                    cfVar2.h(!G1);
                    kiVar2.d0 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        TLRPC.User user;
        if (!(view instanceof di)) {
            return false;
        }
        di diVar = (di) view;
        ki kiVar = this.b;
        if (kiVar.R || (user = diVar.b) == null) {
            return false;
        }
        kiVar.w1(diVar.c, user);
        return true;
    }

    @Override // td.i
    public void c(td.j jVar) {
        this.b.u1();
    }

    @Override // org.telegram.ui.Components.sk
    public void d(TLRPC.MessageMedia messageMedia, int i9, boolean z10, int i10, long j10) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.qn) this.b.b0).d(messageMedia, i9, z10, i10, 0L);
                break;
            case 9:
                ((org.telegram.ui.qn) this.b.b0).d(messageMedia, i9, z10, i10, j10);
                break;
            default:
                ((org.telegram.ui.qn) this.b.b0).d(messageMedia, i9, z10, i10, j10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.in
    public void e(TLRPC.MessageMedia messageMedia, Editable editable, yg.f fVar, ArrayList arrayList, boolean z10, int i9, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i10 = this.a;
        ki kiVar = this.b;
        switch (i10) {
            case 10:
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) kiVar.b0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (qnVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, qnVar.P5, qnVar.j5, qnVar.T3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i9, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = qnVar.C8();
                    of2.payStars = j10;
                    of2.monoForumPeer = qnVar.N8();
                    of2.suggestionParams = qnVar.c5;
                    qnVar.getSendMessagesHelper().sendMessage(of2);
                    qnVar.y6();
                    break;
                }
                break;
            default:
                org.telegram.ui.qn qnVar2 = (org.telegram.ui.qn) kiVar.b0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (qnVar2.f7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = qnVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(qnVar2.getAccountInstance(), new yg.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), qnVar2.P5, qnVar2.j5, qnVar2.T3, null, qnVar2.h5, z10, i9, qnVar2.C8(), j10, qnVar2.N8(), qnVar2.c5);
                    qnVar2.y6();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        ki kiVar = this.b;
        kiVar.w2 = true;
        kiVar.dismiss();
    }

    @Override // lg.c
    public int g(org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        switch (this.a) {
            case 4:
                float f10 = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
                int v02 = org.telegram.ui.ActionBar.f6.v0(z10 ? org.telegram.ui.ActionBar.f6.a7 : org.telegram.ui.ActionBar.f6.i5, b6Var);
                int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var);
                ki kiVar = this.b;
                return kiVar.i2 ? i0.a.d(0.75f, v03, kiVar.j2) : mg.c.l(f10, v02, v03);
            case 5:
                if (this.b.i2) {
                    return 0;
                }
                return z10 ? 687865855 : -1;
            case 6:
                if (this.b.i2) {
                    return 0;
                }
                return z10 ? 352321535 : -1;
            default:
                ki kiVar2 = this.b;
                if (kiVar2.i2) {
                    if (AndroidUtilities.computePerceivedBrightness(kiVar2.j2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // org.telegram.ui.Components.si
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
        ki kiVar = this.b;
        si siVar = kiVar.U;
        if (siVar != null) {
            siVar.h(arrayList, charSequence, z10, i9, i10, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
        if (o2Var == null || !(o2Var instanceof org.telegram.ui.qn)) {
            ii iiVar = kiVar.V1;
            if (iiVar != null) {
                iiVar.v0(arrayList, charSequence, z10, i9, i10, j10, z11, j11);
                return;
            }
            return;
        }
        org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var;
        if (qnVar.f7()) {
            qnVar.l8(charSequence, null);
            SendMessagesHelper.prepareSendingAudioDocuments(qnVar.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, qnVar.P5, qnVar.j5, qnVar.T3, null, z10, i9, i10, qnVar.l5, qnVar.C8(), j10, z11, j11);
            qnVar.y6();
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i9) {
        this.b.T0.getActionBarMenuOnItemClick().b(i9);
    }

    @Override // org.telegram.messenger.AndroidUtilities.IntColorCallback
    public void run(int i9) {
        ki.o(this.b, i9);
    }

    @Override // td.i
    public /* synthetic */ void b() {
    }
}
