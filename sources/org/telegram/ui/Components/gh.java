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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements gl, le.k, org.telegram.ui.ActionBar.c2, ll0, ch.d, org.telegram.ui.ActionBar.s0, yn, AndroidUtilities.IntColorCallback, c5, gj {
    public final /* synthetic */ int a;
    public final /* synthetic */ yi b;

    public /* synthetic */ gh(yi yiVar, int i10) {
        this.a = i10;
        this.b = yiVar;
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
        boolean G1;
        switch (this.a) {
            case 12:
                yi yiVar = this.b;
                qi qiVar = yiVar.y0;
                if (qiVar != yiVar.j0 && qiVar != yiVar.q0) {
                    if (!qiVar.I(i10, z10, i11, yiVar.s1(), 0L)) {
                        yiVar.A2 = true;
                        yiVar.dismiss();
                        break;
                    }
                } else {
                    yiVar.G1(i10, z10, 0, yiVar.s1(), yiVar.N0);
                    break;
                }
                break;
            default:
                yi yiVar2 = this.b;
                of ofVar = yiVar2.h0;
                long k10 = ofVar != null ? ofVar.k() : 0L;
                ii iiVar = yiVar2.I0;
                yiVar2.N0 = k10;
                iiVar.setEffect(k10);
                qi qiVar2 = yiVar2.y0;
                if (qiVar2 == yiVar2.j0 || qiVar2 == yiVar2.q0) {
                    G1 = yiVar2.G1(i10, z10, i11, yiVar2.s1(), k10);
                } else {
                    if (!qiVar2.I(i10, z10, i11, yiVar2.s1(), k10)) {
                        yiVar2.dismiss();
                    }
                    G1 = false;
                }
                of ofVar2 = yiVar2.h0;
                if (ofVar2 != null) {
                    ofVar2.h(!G1);
                    yiVar2.h0 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.gl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.eo) this.b.f0).b(messageMedia, i10, z10, i11, 0L);
                break;
            case 9:
                ((org.telegram.ui.eo) this.b.f0).b(messageMedia, i10, z10, i11, j3);
                break;
            default:
                ((org.telegram.ui.eo) this.b.f0).b(messageMedia, i10, z10, i11, j3);
                break;
        }
    }

    @Override // org.telegram.ui.Components.yn
    public void c(TLRPC.MessageMedia messageMedia, Editable editable, ph.f fVar, ArrayList arrayList, boolean z10, int i10, long j3) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.a;
        yi yiVar = this.b;
        switch (i11) {
            case 10:
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) yiVar.f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (eoVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, eoVar.T5, eoVar.n5, eoVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = eoVar.C8();
                    of2.payStars = j3;
                    of2.monoForumPeer = eoVar.N8();
                    of2.suggestionParams = eoVar.g5;
                    eoVar.getSendMessagesHelper().sendMessage(of2);
                    eoVar.y6();
                    break;
                }
                break;
            default:
                org.telegram.ui.eo eoVar2 = (org.telegram.ui.eo) yiVar.f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (eoVar2.f7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = eoVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(eoVar2.getAccountInstance(), new ph.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), eoVar2.T5, eoVar2.n5, eoVar2.X3, null, eoVar2.l5, z10, i10, eoVar2.C8(), j3, eoVar2.N8(), eoVar2.g5);
                    eoVar2.y6();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0
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
        yiVar.w1(riVar.c, user);
        return true;
    }

    @Override // le.k
    public void e(le.l lVar) {
        this.b.u1();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        yi yiVar = this.b;
        yiVar.A2 = true;
        yiVar.dismiss();
    }

    @Override // ch.d
    public int g(org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        switch (this.a) {
            case 4:
                float f7 = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
                int v02 = org.telegram.ui.ActionBar.j6.v0(z10 ? org.telegram.ui.ActionBar.j6.a7 : org.telegram.ui.ActionBar.j6.i5, f6Var);
                int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var);
                yi yiVar = this.b;
                return yiVar.m2 ? i0.a.d(0.75f, v03, yiVar.n2) : dh.c.m(f7, v02, v03);
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
                yi yiVar2 = this.b;
                if (yiVar2.m2) {
                    if (AndroidUtilities.computePerceivedBrightness(yiVar2.n2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // org.telegram.ui.Components.gj
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        yi yiVar = this.b;
        gj gjVar = yiVar.Y;
        if (gjVar != null) {
            gjVar.i(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f0;
        if (p2Var == null || !(p2Var instanceof org.telegram.ui.eo)) {
            wi wiVar = yiVar.Z1;
            if (wiVar != null) {
                wiVar.W1(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
                return;
            }
            return;
        }
        org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var;
        if (eoVar.f7()) {
            eoVar.l8(charSequence, null);
            SendMessagesHelper.prepareSendingAudioDocuments(eoVar.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, eoVar.T5, eoVar.n5, eoVar.X3, null, z10, i10, i11, eoVar.p5, eoVar.C8(), j3, z11, j10);
            eoVar.y6();
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void m(int i10) {
        this.b.X0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.messenger.AndroidUtilities.IntColorCallback
    public void run(int i10) {
        yi.o(this.b, i10);
    }

    @Override // le.k
    public /* synthetic */ void a() {
    }
}
