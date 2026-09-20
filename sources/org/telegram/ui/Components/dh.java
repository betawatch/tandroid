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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements bl, le.k, org.telegram.ui.ActionBar.a2, ll0, dh.d, org.telegram.ui.ActionBar.r0, tn, AndroidUtilities.IntColorCallback, c5, dj {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;

    public /* synthetic */ dh(vi viVar, int i10) {
        this.a = i10;
        this.b = viVar;
    }

    @Override // org.telegram.ui.Components.c5
    public void J(int i10, int i11, boolean z10) {
        boolean G1;
        switch (this.a) {
            case 12:
                vi viVar = this.b;
                ni niVar = viVar.y0;
                if (niVar != viVar.j0 && niVar != viVar.q0) {
                    if (!niVar.I(i10, z10, i11, viVar.s1(), 0L)) {
                        viVar.A2 = true;
                        viVar.dismiss();
                        break;
                    }
                } else {
                    viVar.G1(i10, z10, 0, viVar.s1(), viVar.N0);
                    break;
                }
                break;
            default:
                vi viVar2 = this.b;
                mf mfVar = viVar2.h0;
                long k10 = mfVar != null ? mfVar.k() : 0L;
                fi fiVar = viVar2.I0;
                viVar2.N0 = k10;
                fiVar.setEffect(k10);
                ni niVar2 = viVar2.y0;
                if (niVar2 == viVar2.j0 || niVar2 == viVar2.q0) {
                    G1 = viVar2.G1(i10, z10, i11, viVar2.s1(), k10);
                } else {
                    if (!niVar2.I(i10, z10, i11, viVar2.s1(), k10)) {
                        viVar2.dismiss();
                    }
                    G1 = false;
                }
                mf mfVar2 = viVar2.h0;
                if (mfVar2 != null) {
                    mfVar2.h(!G1);
                    viVar2.h0 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.bl
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

    @Override // le.k
    public void c(le.l lVar) {
        this.b.u1();
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (!(view instanceof oi)) {
            return false;
        }
        oi oiVar = (oi) view;
        vi viVar = this.b;
        if (viVar.V || (user = oiVar.b) == null) {
            return false;
        }
        viVar.w1(oiVar.c, user);
        return true;
    }

    @Override // org.telegram.ui.Components.tn
    public void e(TLRPC.MessageMedia messageMedia, Editable editable, qh.f fVar, ArrayList arrayList, boolean z10, int i10, long j3) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.a;
        vi viVar = this.b;
        switch (i11) {
            case 10:
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) viVar.f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (znVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, znVar.T5, znVar.n5, znVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = znVar.C8();
                    of2.payStars = j3;
                    of2.monoForumPeer = znVar.N8();
                    of2.suggestionParams = znVar.g5;
                    znVar.getSendMessagesHelper().sendMessage(of2);
                    znVar.y6();
                    break;
                }
                break;
            default:
                org.telegram.ui.zn znVar2 = (org.telegram.ui.zn) viVar.f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (znVar2.f7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = znVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(znVar2.getAccountInstance(), new qh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), znVar2.T5, znVar2.n5, znVar2.X3, null, znVar2.l5, z10, i10, znVar2.C8(), j3, znVar2.N8(), znVar2.g5);
                    znVar2.y6();
                    break;
                }
                break;
        }
    }

    @Override // dh.d
    public int f(org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        switch (this.a) {
            case 4:
                float f7 = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
                int v02 = org.telegram.ui.ActionBar.j6.v0(z10 ? org.telegram.ui.ActionBar.j6.a7 : org.telegram.ui.ActionBar.j6.i5, f6Var);
                int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var);
                vi viVar = this.b;
                return viVar.m2 ? i0.a.d(0.75f, v03, viVar.n2) : eh.b.n(f7, v02, v03);
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
                vi viVar2 = this.b;
                if (viVar2.m2) {
                    if (AndroidUtilities.computePerceivedBrightness(viVar2.n2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // org.telegram.ui.Components.dj
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        vi viVar = this.b;
        dj djVar = viVar.Y;
        if (djVar != null) {
            djVar.h(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
        if (n2Var == null || !(n2Var instanceof org.telegram.ui.zn)) {
            ti tiVar = viVar.Z1;
            if (tiVar != null) {
                tiVar.W1(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
                return;
            }
            return;
        }
        org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
        if (znVar.f7()) {
            znVar.l8(charSequence, null);
            SendMessagesHelper.prepareSendingAudioDocuments(znVar.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, znVar.T5, znVar.n5, znVar.X3, null, z10, i10, i11, znVar.p5, znVar.C8(), j3, z11, j10);
            znVar.y6();
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        vi viVar = this.b;
        viVar.A2 = true;
        viVar.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        this.b.X0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.messenger.AndroidUtilities.IntColorCallback
    public void run(int i10) {
        vi.o(this.b, i10);
    }

    @Override // le.k
    public /* synthetic */ void a() {
    }
}
