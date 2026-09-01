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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements wk, xd.i, org.telegram.ui.ActionBar.c2, ll0, rg.c, org.telegram.ui.ActionBar.s0, rn, AndroidUtilities.IntColorCallback, y4, ui {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi b;

    public /* synthetic */ tg(mi miVar, int i10) {
        this.a = i10;
        this.b = miVar;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        boolean G1;
        switch (this.a) {
            case 12:
                mi miVar = this.b;
                ei eiVar = miVar.v0;
                if (eiVar != miVar.g0 && eiVar != miVar.n0) {
                    if (!eiVar.H(i10, z4, i11, miVar.s1(), 0L)) {
                        miVar.x2 = true;
                        miVar.dismiss();
                        break;
                    }
                } else {
                    miVar.G1(i10, z4, 0, miVar.s1(), miVar.K0);
                    break;
                }
                break;
            default:
                mi miVar2 = this.b;
                cf cfVar = miVar2.e0;
                long k10 = cfVar != null ? cfVar.k() : 0L;
                vh vhVar = miVar2.F0;
                miVar2.K0 = k10;
                vhVar.setEffect(k10);
                ei eiVar2 = miVar2.v0;
                if (eiVar2 == miVar2.g0 || eiVar2 == miVar2.n0) {
                    G1 = miVar2.G1(i10, z4, i11, miVar2.s1(), k10);
                } else {
                    if (!eiVar2.H(i10, z4, i11, miVar2.s1(), k10)) {
                        miVar2.dismiss();
                    }
                    G1 = false;
                }
                cf cfVar2 = miVar2.e0;
                if (cfVar2 != null) {
                    cfVar2.h(!G1);
                    miVar2.e0 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.rn
    public void b(TLRPC.MessageMedia messageMedia, Editable editable, eh.i iVar, ArrayList arrayList, boolean z4, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.a;
        mi miVar = this.b;
        switch (i11) {
            case 10:
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) miVar.c0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (xnVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, xnVar.Q5, xnVar.k5, xnVar.U3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z4, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = xnVar.C8();
                    of2.payStars = j10;
                    of2.monoForumPeer = xnVar.N8();
                    of2.suggestionParams = xnVar.d5;
                    xnVar.getSendMessagesHelper().sendMessage(of2);
                    xnVar.y6();
                    break;
                }
                break;
            default:
                org.telegram.ui.xn xnVar2 = (org.telegram.ui.xn) miVar.c0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (xnVar2.f7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = xnVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(xnVar2.getAccountInstance(), new eh.k(iVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), xnVar2.Q5, xnVar2.k5, xnVar2.U3, null, xnVar2.i5, z4, i10, xnVar2.C8(), j10, xnVar2.N8(), xnVar2.d5);
                    xnVar2.y6();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.wk
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.xn) this.b.c0).d(messageMedia, i10, z4, i11, 0L);
                break;
            case 9:
                ((org.telegram.ui.xn) this.b.c0).d(messageMedia, i10, z4, i11, j10);
                break;
            default:
                ((org.telegram.ui.xn) this.b.c0).d(messageMedia, i10, z4, i11, j10);
                break;
        }
    }

    @Override // xd.i
    public void e(xd.j jVar) {
        this.b.u1();
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean f(int i10, View view) {
        TLRPC.User user;
        if (!(view instanceof fi)) {
            return false;
        }
        fi fiVar = (fi) view;
        mi miVar = this.b;
        if (miVar.S || (user = fiVar.b) == null) {
            return false;
        }
        miVar.w1(fiVar.c, user);
        return true;
    }

    @Override // rg.c
    public int g(org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        switch (this.a) {
            case 4:
                float f10 = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
                int v02 = org.telegram.ui.ActionBar.k6.v0(z4 ? org.telegram.ui.ActionBar.k6.a7 : org.telegram.ui.ActionBar.k6.i5, g6Var);
                int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, g6Var);
                mi miVar = this.b;
                return miVar.j2 ? i0.a.d(0.75f, v03, miVar.k2) : sg.b.l(f10, v02, v03);
            case 5:
                if (this.b.j2) {
                    return 0;
                }
                return z4 ? 687865855 : -1;
            case 6:
                if (this.b.j2) {
                    return 0;
                }
                return z4 ? 352321535 : -1;
            default:
                mi miVar2 = this.b;
                if (miVar2.j2) {
                    if (AndroidUtilities.computePerceivedBrightness(miVar2.k2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z4) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void h(int i10) {
        this.b.U0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.Components.ui
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        mi miVar = this.b;
        ui uiVar = miVar.V;
        if (uiVar != null) {
            uiVar.i(arrayList, charSequence, z4, i10, i11, j10, z10, j11);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
        if (p2Var == null || !(p2Var instanceof org.telegram.ui.xn)) {
            ki kiVar = miVar.W1;
            if (kiVar != null) {
                kiVar.f2(arrayList, charSequence, z4, i10, i11, j10, z10, j11);
                return;
            }
            return;
        }
        org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var;
        if (xnVar.f7()) {
            xnVar.l8(charSequence, null);
            SendMessagesHelper.prepareSendingAudioDocuments(xnVar.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, xnVar.Q5, xnVar.k5, xnVar.U3, null, z4, i10, i11, xnVar.m5, xnVar.C8(), j10, z10, j11);
            xnVar.y6();
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        mi miVar = this.b;
        miVar.x2 = true;
        miVar.dismiss();
    }

    @Override // org.telegram.messenger.AndroidUtilities.IntColorCallback
    public void run(int i10) {
        mi.o(this.b, i10);
    }

    @Override // xd.i
    public /* synthetic */ void a() {
    }
}
