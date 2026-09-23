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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements cl, le.l, org.telegram.ui.ActionBar.a2, cl0, dh.d, org.telegram.ui.ActionBar.r0, un, AndroidUtilities.IntColorCallback, d5, ej {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi b;

    public /* synthetic */ dh(wi wiVar, int i10) {
        this.a = i10;
        this.b = wiVar;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        boolean G1;
        switch (this.a) {
            case 12:
                wi wiVar = this.b;
                oi oiVar = wiVar.y0;
                if (oiVar != wiVar.j0 && oiVar != wiVar.q0) {
                    if (!oiVar.I(i10, z10, i11, wiVar.s1(), 0L)) {
                        wiVar.A2 = true;
                        wiVar.dismiss();
                        break;
                    }
                } else {
                    wiVar.G1(i10, z10, 0, wiVar.s1(), wiVar.N0);
                    break;
                }
                break;
            default:
                wi wiVar2 = this.b;
                mf mfVar = wiVar2.h0;
                long k10 = mfVar != null ? mfVar.k() : 0L;
                gi giVar = wiVar2.I0;
                wiVar2.N0 = k10;
                giVar.setEffect(k10);
                oi oiVar2 = wiVar2.y0;
                if (oiVar2 == wiVar2.j0 || oiVar2 == wiVar2.q0) {
                    G1 = wiVar2.G1(i10, z10, i11, wiVar2.s1(), k10);
                } else {
                    if (!oiVar2.I(i10, z10, i11, wiVar2.s1(), k10)) {
                        wiVar2.dismiss();
                    }
                    G1 = false;
                }
                mf mfVar2 = wiVar2.h0;
                if (mfVar2 != null) {
                    mfVar2.h(!G1);
                    wiVar2.h0 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.cl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.xn) this.b.f0).b(messageMedia, i10, z10, i11, 0L);
                break;
            case 9:
                ((org.telegram.ui.xn) this.b.f0).b(messageMedia, i10, z10, i11, j3);
                break;
            default:
                ((org.telegram.ui.xn) this.b.f0).b(messageMedia, i10, z10, i11, j3);
                break;
        }
    }

    @Override // le.l
    public void c(le.m mVar) {
        this.b.u1();
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (!(view instanceof pi)) {
            return false;
        }
        pi piVar = (pi) view;
        wi wiVar = this.b;
        if (wiVar.V || (user = piVar.b) == null) {
            return false;
        }
        wiVar.w1(piVar.c, user);
        return true;
    }

    @Override // org.telegram.ui.Components.un
    public void e(TLRPC.MessageMedia messageMedia, Editable editable, qh.f fVar, ArrayList arrayList, boolean z10, int i10, long j3) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.a;
        wi wiVar = this.b;
        switch (i11) {
            case 10:
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) wiVar.f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (xnVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, xnVar.T5, xnVar.n5, xnVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = xnVar.C8();
                    of2.payStars = j3;
                    of2.monoForumPeer = xnVar.N8();
                    of2.suggestionParams = xnVar.g5;
                    xnVar.getSendMessagesHelper().sendMessage(of2);
                    xnVar.y6();
                    break;
                }
                break;
            default:
                org.telegram.ui.xn xnVar2 = (org.telegram.ui.xn) wiVar.f0;
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
                    SendMessagesHelper.prepareSendingPoll(xnVar2.getAccountInstance(), new qh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), xnVar2.T5, xnVar2.n5, xnVar2.X3, null, xnVar2.l5, z10, i10, xnVar2.C8(), j3, xnVar2.N8(), xnVar2.g5);
                    xnVar2.y6();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        wi wiVar = this.b;
        wiVar.A2 = true;
        wiVar.dismiss();
    }

    @Override // dh.d
    public int g(org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        switch (this.a) {
            case 4:
                float f7 = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
                int v02 = org.telegram.ui.ActionBar.h6.v0(z10 ? org.telegram.ui.ActionBar.h6.a7 : org.telegram.ui.ActionBar.h6.i5, d6Var);
                int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, d6Var);
                wi wiVar = this.b;
                return wiVar.m2 ? i0.a.d(0.75f, v03, wiVar.n2) : eh.b.m(f7, v02, v03);
            case 5:
                if (this.b.m2) {
                    return 0;
                }
                return z10 ? 687865855 : -1;
            case 6:
                if (this.b.m2) {
                    return 0;
                }
                return z10 ? 352321535 : -1;
            default:
                wi wiVar2 = this.b;
                if (wiVar2.m2) {
                    if (AndroidUtilities.computePerceivedBrightness(wiVar2.n2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // org.telegram.ui.Components.ej
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        wi wiVar = this.b;
        ej ejVar = wiVar.Y;
        if (ejVar != null) {
            ejVar.h(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = wiVar.f0;
        if (n2Var == null || !(n2Var instanceof org.telegram.ui.xn)) {
            ui uiVar = wiVar.Z1;
            if (uiVar != null) {
                uiVar.W1(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
                return;
            }
            return;
        }
        org.telegram.ui.xn xnVar = (org.telegram.ui.xn) n2Var;
        if (xnVar.f7()) {
            xnVar.l8(charSequence, null);
            SendMessagesHelper.prepareSendingAudioDocuments(xnVar.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, xnVar.T5, xnVar.n5, xnVar.X3, null, z10, i10, i11, xnVar.p5, xnVar.C8(), j3, z11, j10);
            xnVar.y6();
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        this.b.X0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.messenger.AndroidUtilities.IntColorCallback
    public void run(int i10) {
        wi.o(this.b, i10);
    }

    @Override // le.l
    public /* synthetic */ void a() {
    }
}
