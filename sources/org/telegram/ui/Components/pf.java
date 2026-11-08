package org.telegram.ui.Components;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class pf implements ix {
    public final /* synthetic */ ChatActivityEnterView a;

    public pf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.ix
    public final boolean A() {
        return this.a.z3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z9, int i7, int i10, org.telegram.messenger.gf gfVar, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        eg egVar = chatActivityEnterView.F0;
        org.telegram.ui.an anVar = chatActivityEnterView.P2;
        org.telegram.ui.qm qmVar = chatActivityEnterView.V2;
        if (qmVar != null && anVar != null && qmVar.f) {
            anVar.uc();
            return;
        }
        if (c() && i7 == 0) {
            v4.J(chatActivityEnterView.O2, anVar.a(), new org.telegram.ui.pp(this, view, obj, str, obj2, gfVar, z10), chatActivityEnterView.W3);
            return;
        }
        if (chatActivityEnterView.G0 <= 0 || c()) {
            v4.X(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new pd(this, obj, gfVar, z9, i7, i10, z10, str, obj2));
            return;
        }
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar != null) {
            wfVar.i1(view != null ? view : egVar, ((org.telegram.ui.ActionBar.k5) egVar.c).getText(), true);
        }
    }

    @Override // org.telegram.ui.Components.ix
    public final long a() {
        return this.a.Q2;
    }

    @Override // org.telegram.ui.Components.ix
    public final boolean b() {
        org.telegram.ui.an anVar = this.a.P2;
        return anVar != null && anVar.R6();
    }

    @Override // org.telegram.ui.Components.ix
    public final boolean c() {
        org.telegram.ui.an anVar = this.a.P2;
        return anVar != null && anVar.c();
    }

    @Override // org.telegram.ui.Components.ix
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z9) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        of ofVar = chatActivityEnterView.a3;
        if (ofVar != null && !ofVar.I) {
            ofVar.k1.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = chatActivityEnterView.P2;
        if (f2Var == null) {
            f2Var = LaunchActivity.Q();
        }
        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
        if (f2Var2 == null || chatActivityEnterView.O2 == null) {
            return;
        }
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        yv0 yv0Var = new yv0(chatActivityEnterView.O2, f2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.W3);
        f2Var2.showDialog(yv0Var);
        if (z9) {
            yv0Var.N0();
        }
    }

    @Override // org.telegram.ui.Components.ix
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.an anVar = chatActivityEnterView.P2;
        if (anVar == null) {
            return;
        }
        PhotoViewer.p1().H2(null, anVar, anVar.xa);
        if (obj instanceof TLRPC.Document) {
            org.telegram.messenger.w7.G(chatActivityEnterView.Q);
            file = org.telegram.messenger.w7.I((TLRPC.Document) obj);
        } else {
            file = null;
        }
        if (file == null) {
            return;
        }
        File file2 = new File(org.telegram.messenger.w7.z(4), file.getName());
        if (!file.exists()) {
            if (!file2.exists()) {
                return;
            } else {
                file = file2;
            }
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, file.getAbsolutePath(), 0, false, 0, 0);
        gfVar.a = null;
        gfVar.b = true;
        arrayList.add(gfVar);
        PhotoViewer.p1().e2(arrayList, 0, 12, false, new nf(this, obj, obj2, gfVar), chatActivityEnterView.P2);
    }

    @Override // org.telegram.ui.Components.ix
    public final int f() {
        int threadMessageId;
        threadMessageId = this.a.getThreadMessageId();
        return threadMessageId;
    }

    @Override // org.telegram.ui.Components.ix
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        return chatActivityEnterView.Q2 == org.telegram.messenger.p10.i(chatActivityEnterView.Q).e();
    }

    @Override // org.telegram.ui.Components.ix
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.messenger.ui.b0(chatActivityEnterView.Q).f2(chatActivityEnterView.O2, stickerSetCovered, 0, chatActivityEnterView.P2, false, false);
    }

    @Override // org.telegram.ui.Components.ix
    public final void i(int i7) {
        int i10 = ChatActivityEnterView.s5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.m1(i7, true);
        if (i7 != 0) {
            chatActivityEnterView.n1(true, true, false, i7 == 1);
        }
        if (chatActivityEnterView.y3 && chatActivityEnterView.R1 == 2) {
            chatActivityEnterView.G();
        }
    }

    @Override // org.telegram.ui.Components.ix
    public final boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ix
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        TextView textView = chatActivityEnterView.X4;
        if (textView == null) {
            textView = chatActivityEnterView.E0;
        }
        if (textView == null || textView.length() == 0) {
            return false;
        }
        textView.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.ix
    public final void l(String str) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditText editText = chatActivityEnterView.X4;
        if (editText == null) {
            editText = chatActivityEnterView.E0;
        }
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            chatActivityEnterView.S2 = 2;
            CharSequence m10 = org.telegram.messenger.i6.m(str, editText.getPaint().getFontMetricsInt(), false, null, 0);
            editText.setText(editText.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editText.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } finally {
            chatActivityEnterView.S2 = 0;
        }
    }

    @Override // org.telegram.ui.Components.ix
    public final void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.ej ejVar, boolean z9, int i7) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        eg egVar = chatActivityEnterView.F0;
        if (chatActivityEnterView.p5) {
            return;
        }
        of ofVar = chatActivityEnterView.a3;
        if (ofVar != null) {
            ofVar.dismiss();
            chatActivityEnterView.a3 = null;
        }
        if (chatActivityEnterView.G0 > 0 && !c()) {
            wf wfVar = chatActivityEnterView.Z2;
            if (wfVar != null) {
                if (view == null) {
                    view = egVar;
                }
                wfVar.i1(view, ((org.telegram.ui.ActionBar.k5) egVar.c).getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.z3) {
            if (chatActivityEnterView.R1 != 0) {
                chatActivityEnterView.m1(0, true);
                mf mfVar = chatActivityEnterView.U0;
                long j3 = -1;
                if (document != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= document.attributes.size()) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                            TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                            if (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                                j3 = inputStickerSet.id;
                            }
                        } else {
                            i10++;
                        }
                    }
                }
                mfVar.s(j3, true);
                chatActivityEnterView.U0.A();
            }
            chatActivityEnterView.n1(false, true, false, true);
        }
        chatActivityEnterView.a(document, str, obj, ejVar, false, z9, i7, 0);
        if (org.telegram.messenger.m5.C(chatActivityEnterView.Q2) && org.telegram.messenger.ij.t3(document, false)) {
            org.telegram.messenger.qp.s1(chatActivityEnterView.R.a).t4(obj, document);
        }
    }

    @Override // org.telegram.ui.Components.ix
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.an anVar = chatActivityEnterView.P2;
        if (anVar == null || (activity = chatActivityEnterView.O2) == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, chatActivityEnterView.W3);
        String M0 = org.telegram.messenger.id.M0(2131752068, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131752069, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752099, null), new u(this, 17));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        anVar.showDialog(u1Var);
    }

    @Override // org.telegram.ui.Components.ix
    public final void o(t31 t31Var) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = chatActivityEnterView.P2;
        if (f2Var == null) {
            f2Var = LaunchActivity.Q();
        }
        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
        if (f2Var2 != null) {
            chatActivityEnterView.a3 = new of(this, chatActivityEnterView.getContext(), f2Var2, t31Var, chatActivityEnterView.W3);
            wf wfVar = chatActivityEnterView.Z2;
            if (wfVar != null) {
                wfVar.B(true);
            }
            f2Var2.showDialog(chatActivityEnterView.a3);
        }
    }

    @Override // org.telegram.ui.Components.ix
    public final float p() {
        return this.a.w0;
    }

    @Override // org.telegram.ui.Components.ix
    public final void q() {
        org.telegram.ui.ActionBar.f2 f2Var = this.a.P2;
        if (f2Var == null) {
            f2Var = LaunchActivity.Q();
        }
        f2Var.showDialog(new ug.w0(f2Var, 11, false));
    }

    @Override // org.telegram.ui.Components.ix
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.messenger.ui.b0(chatActivityEnterView.Q).f2(chatActivityEnterView.O2, stickerSetCovered, 2, chatActivityEnterView.P2, false, false);
    }

    @Override // org.telegram.ui.Components.ix
    public final void s(int i7) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.Z2.W();
        chatActivityEnterView.Z2.Y1(i7 == 3);
        chatActivityEnterView.post(chatActivityEnterView.s3);
    }

    @Override // org.telegram.ui.Components.ix
    public final void t(ArrayList arrayList) {
        org.telegram.ui.an anVar = this.a.P2;
        if (anVar != null) {
            anVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override // org.telegram.ui.Components.ix
    public final void u() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.ix
    public final void v(View view, Object obj, String str, Object obj2, boolean z9, int i7, int i10) {
        B(view, obj, str, obj2, z9, i7, i10, null, false);
    }

    @Override // org.telegram.ui.Components.ix
    public final void w() {
        org.telegram.ui.an anVar = this.a.P2;
        if (anVar != null) {
            anVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override // org.telegram.ui.Components.ix
    public final void x(long j3, TLRPC.Document document, String str, boolean z9) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.X4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.E0;
        }
        org.telegram.messenger.g0.h3(new bi.o(this, editTextBoldCursor, str, document, j3, z9));
    }

    @Override // org.telegram.ui.Components.ix
    public final void y(long j3) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.an anVar = chatActivityEnterView.P2;
        if (anVar != null) {
            if (org.telegram.messenger.g0.Q1()) {
                chatActivityEnterView.k0(false);
            }
            org.telegram.ui.m50 m50Var = new org.telegram.ui.m50(j3);
            m50Var.j0(chatActivityEnterView.d2);
            anVar.presentFragment(m50Var);
        }
    }

    @Override // org.telegram.ui.Components.ix
    public final boolean z() {
        return this.a.R1 != 0;
    }
}
