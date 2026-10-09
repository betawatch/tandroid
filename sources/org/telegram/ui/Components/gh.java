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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements sl, org.telegram.ui.ActionBar.a2, me.k, gm0, dh.d, org.telegram.ui.ActionBar.r0, ko, AndroidUtilities.IntColorCallback, f5, hj {
    public final /* synthetic */ int a;
    public final /* synthetic */ yi b;

    public /* synthetic */ gh(yi yiVar, int i10) {
        this.a = i10;
        this.b = yiVar;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        boolean J1;
        switch (this.a) {
            case 12:
                yi yiVar = this.b;
                qi qiVar = yiVar.B0;
                if (qiVar != yiVar.j0 && qiVar != yiVar.q0) {
                    if (!qiVar.K(i10, z10, i11, yiVar.u1(), 0L)) {
                        yiVar.D2 = true;
                        yiVar.dismiss();
                        break;
                    }
                } else {
                    yiVar.J1(i10, z10, 0, yiVar.u1(), yiVar.Q0);
                    break;
                }
                break;
            default:
                yi yiVar2 = this.b;
                pf pfVar = yiVar2.h0;
                long k10 = pfVar != null ? pfVar.k() : 0L;
                ii iiVar = yiVar2.L0;
                yiVar2.Q0 = k10;
                iiVar.setEffect(k10);
                qi qiVar2 = yiVar2.B0;
                if (qiVar2 == yiVar2.j0 || qiVar2 == yiVar2.q0) {
                    J1 = yiVar2.J1(i10, z10, i11, yiVar2.u1(), k10);
                } else {
                    if (!qiVar2.K(i10, z10, i11, yiVar2.u1(), k10)) {
                        yiVar2.dismiss();
                    }
                    J1 = false;
                }
                pf pfVar2 = yiVar2.h0;
                if (pfVar2 != null) {
                    pfVar2.h(!J1);
                    yiVar2.h0 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.sl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.zn) this.b.f0).b(messageMedia, i10, z10, i11, 0L);
                break;
            case 9:
                ((org.telegram.ui.zn) this.b.f0).b(messageMedia, i10, z10, i11, j3);
                break;
            default:
                ((org.telegram.ui.zn) this.b.f0).b(messageMedia, i10, z10, i11, j3);
                break;
        }
    }

    @Override // me.k
    public void c(me.l lVar) {
        this.b.x1();
    }

    @Override // org.telegram.ui.Components.gm0
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (!(view instanceof ri)) {
            return false;
        }
        ri riVar = (ri) view;
        yi yiVar = this.b;
        if (yiVar.V || (user = riVar.b) == null) {
            return false;
        }
        yiVar.z1(riVar.c, user);
        return true;
    }

    @Override // org.telegram.ui.Components.ko
    public void e(TLRPC.MessageMedia messageMedia, Editable editable, qh.f fVar, ArrayList arrayList, boolean z10, int i10, long j3) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.a;
        yi yiVar = this.b;
        switch (i11) {
            case 10:
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) yiVar.f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (znVar.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, znVar.T5, znVar.n5, znVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = znVar.H8();
                    of2.payStars = j3;
                    of2.monoForumPeer = znVar.S8();
                    of2.suggestionParams = znVar.g5;
                    znVar.getSendMessagesHelper().sendMessage(of2);
                    znVar.B6();
                    break;
                }
                break;
            default:
                org.telegram.ui.zn znVar2 = (org.telegram.ui.zn) yiVar.f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (znVar2.i7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = znVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(znVar2.getAccountInstance(), new qh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), znVar2.T5, znVar2.n5, znVar2.X3, null, znVar2.l5, z10, i10, znVar2.H8(), j3, znVar2.S8(), znVar2.g5);
                    znVar2.B6();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        yi yiVar = this.b;
        yiVar.D2 = true;
        yiVar.dismiss();
    }

    @Override // dh.d
    public int g(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        switch (this.a) {
            case 4:
                float f7 = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
                int w02 = org.telegram.ui.ActionBar.i6.w0(z10 ? org.telegram.ui.ActionBar.i6.a7 : org.telegram.ui.ActionBar.i6.i5, e6Var);
                int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var);
                yi yiVar = this.b;
                return yiVar.p2 ? i0.a.d(0.75f, w03, yiVar.q2) : eh.b.m(f7, w02, w03);
            case 5:
                if (this.b.p2) {
                    return 0;
                }
                return z10 ? 687865855 : -1;
            case 6:
                if (this.b.p2) {
                    return 0;
                }
                return z10 ? 352321535 : -1;
            default:
                yi yiVar2 = this.b;
                if (yiVar2.p2) {
                    if (AndroidUtilities.computePerceivedBrightness(yiVar2.q2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // org.telegram.ui.Components.hj
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        yi yiVar = this.b;
        hj hjVar = yiVar.Y;
        if (hjVar != null) {
            hjVar.i(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = yiVar.f0;
        if (n2Var == null || !(n2Var instanceof org.telegram.ui.zn)) {
            wi wiVar = yiVar.c2;
            if (wiVar != null) {
                wiVar.c2(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
                return;
            }
            return;
        }
        org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
        if (znVar.i7()) {
            znVar.o8(charSequence, null);
            SendMessagesHelper.prepareSendingAudioDocuments(znVar.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, znVar.T5, znVar.n5, znVar.X3, null, z10, i10, i11, znVar.p5, znVar.H8(), j3, z11, j10);
            znVar.B6();
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        this.b.a1.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.messenger.AndroidUtilities.IntColorCallback
    public void run(int i10) {
        yi.u(this.b, i10);
    }

    @Override // me.k
    public /* synthetic */ void a() {
    }
}
