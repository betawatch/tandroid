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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nf implements fx {
    public final /* synthetic */ ChatActivityEnterView a;

    public nf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.fx
    public final boolean A() {
        return this.a.A3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i3, int i10, org.telegram.messenger.ye yeVar, boolean z11) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        cg cgVar = chatActivityEnterView.G0;
        org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
        org.telegram.ui.mm mmVar = chatActivityEnterView.W2;
        if (mmVar != null && wmVar != null && mmVar.f) {
            wmVar.uc();
            return;
        }
        if (c() && i3 == 0) {
            t4.L(chatActivityEnterView.P2, wmVar.a(), new org.telegram.ui.np(this, view, obj, str, obj2, yeVar, z11), chatActivityEnterView.X3);
            return;
        }
        if (chatActivityEnterView.H0 <= 0 || c()) {
            t4.Z(chatActivityEnterView.R, 1, chatActivityEnterView.R2, new nd(this, obj, yeVar, z10, i3, i10, z11, str, obj2));
            return;
        }
        uf ufVar = chatActivityEnterView.a3;
        if (ufVar != null) {
            ufVar.h1(view != null ? view : cgVar, ((org.telegram.ui.ActionBar.k5) cgVar.c).getText(), true);
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final long a() {
        return this.a.R2;
    }

    @Override // org.telegram.ui.Components.fx
    public final boolean b() {
        org.telegram.ui.wm wmVar = this.a.Q2;
        return wmVar != null && wmVar.R6();
    }

    @Override // org.telegram.ui.Components.fx
    public final boolean c() {
        org.telegram.ui.wm wmVar = this.a.Q2;
        return wmVar != null && wmVar.c();
    }

    @Override // org.telegram.ui.Components.fx
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        mf mfVar = chatActivityEnterView.b3;
        if (mfVar != null && !mfVar.J) {
            mfVar.l1.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = chatActivityEnterView.Q2;
        if (d2Var == null) {
            d2Var = LaunchActivity.Q();
        }
        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
        if (d2Var2 == null || chatActivityEnterView.P2 == null) {
            return;
        }
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        xv0 xv0Var = new xv0(chatActivityEnterView.P2, d2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.X3);
        d2Var2.showDialog(xv0Var);
        if (z10) {
            xv0Var.N0();
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
        if (wmVar == null) {
            return;
        }
        PhotoViewer.v1().N2(null, wmVar, wmVar.ya);
        if (obj instanceof TLRPC.Document) {
            org.telegram.messenger.w7.G(chatActivityEnterView.R);
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
        org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, file.getAbsolutePath(), 0, false, 0, 0);
        yeVar.a = null;
        yeVar.b = true;
        arrayList.add(yeVar);
        PhotoViewer.v1().j2(arrayList, 0, 12, false, new lf(this, obj, obj2, yeVar), chatActivityEnterView.Q2);
    }

    @Override // org.telegram.ui.Components.fx
    public final int f() {
        int threadMessageId;
        threadMessageId = this.a.getThreadMessageId();
        return threadMessageId;
    }

    @Override // org.telegram.ui.Components.fx
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        return chatActivityEnterView.R2 == org.telegram.messenger.h10.i(chatActivityEnterView.R).e();
    }

    @Override // org.telegram.ui.Components.fx
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.messenger.li.b0(chatActivityEnterView.R).f2(chatActivityEnterView.P2, stickerSetCovered, 0, chatActivityEnterView.Q2, false, false);
    }

    @Override // org.telegram.ui.Components.fx
    public final void i(int i3) {
        int i10 = ChatActivityEnterView.t5;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.l1(i3, true);
        if (i3 != 0) {
            chatActivityEnterView.m1(true, true, false, i3 == 1);
        }
        if (chatActivityEnterView.z3 && chatActivityEnterView.S1 == 2) {
            chatActivityEnterView.G();
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.fx
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        TextView textView = chatActivityEnterView.Y4;
        if (textView == null) {
            textView = chatActivityEnterView.F0;
        }
        if (textView == null || textView.length() == 0) {
            return false;
        }
        textView.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.fx
    public final void l(String str) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditText editText = chatActivityEnterView.Y4;
        if (editText == null) {
            editText = chatActivityEnterView.F0;
        }
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            chatActivityEnterView.T2 = 2;
            CharSequence m10 = org.telegram.messenger.i6.m(str, editText.getPaint().getFontMetricsInt(), false, null, 0);
            editText.setText(editText.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editText.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } finally {
            chatActivityEnterView.T2 = 0;
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.vi viVar, boolean z10, int i3) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        cg cgVar = chatActivityEnterView.G0;
        if (chatActivityEnterView.q5) {
            return;
        }
        mf mfVar = chatActivityEnterView.b3;
        if (mfVar != null) {
            mfVar.dismiss();
            chatActivityEnterView.b3 = null;
        }
        if (chatActivityEnterView.H0 > 0 && !c()) {
            uf ufVar = chatActivityEnterView.a3;
            if (ufVar != null) {
                if (view == null) {
                    view = cgVar;
                }
                ufVar.h1(view, ((org.telegram.ui.ActionBar.k5) cgVar.c).getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.A3) {
            if (chatActivityEnterView.S1 != 0) {
                chatActivityEnterView.l1(0, true);
                kf kfVar = chatActivityEnterView.V0;
                long j10 = -1;
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
                                j10 = inputStickerSet.id;
                            }
                        } else {
                            i10++;
                        }
                    }
                }
                kfVar.s(j10, true);
                chatActivityEnterView.V0.A();
            }
            chatActivityEnterView.m1(false, true, false, true);
        }
        chatActivityEnterView.a(document, str, obj, viVar, false, z10, i3, 0);
        if (org.telegram.messenger.m5.C(chatActivityEnterView.R2) && org.telegram.messenger.zi.t3(document, false)) {
            org.telegram.messenger.hp.s1(chatActivityEnterView.S.a).t4(obj, document);
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
        if (wmVar == null || (activity = chatActivityEnterView.P2) == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, chatActivityEnterView.X3);
        String M0 = org.telegram.messenger.bd.M0(2131752068, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131752069, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752099, null), new t(this, 17));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        wmVar.showDialog(s1Var);
    }

    @Override // org.telegram.ui.Components.fx
    public final void o(n31 n31Var) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.ActionBar.d2 d2Var = chatActivityEnterView.Q2;
        if (d2Var == null) {
            d2Var = LaunchActivity.Q();
        }
        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
        if (d2Var2 != null) {
            chatActivityEnterView.b3 = new mf(this, chatActivityEnterView.getContext(), d2Var2, n31Var, chatActivityEnterView.X3);
            uf ufVar = chatActivityEnterView.a3;
            if (ufVar != null) {
                ufVar.A(true);
            }
            d2Var2.showDialog(chatActivityEnterView.b3);
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final float p() {
        return this.a.x0;
    }

    @Override // org.telegram.ui.Components.fx
    public final void q() {
        org.telegram.ui.ActionBar.d2 d2Var = this.a.Q2;
        if (d2Var == null) {
            d2Var = LaunchActivity.Q();
        }
        d2Var.showDialog(new vg.v0(d2Var, 11, false));
    }

    @Override // org.telegram.ui.Components.fx
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.messenger.li.b0(chatActivityEnterView.R).f2(chatActivityEnterView.P2, stickerSetCovered, 2, chatActivityEnterView.Q2, false, false);
    }

    @Override // org.telegram.ui.Components.fx
    public final void s(int i3) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.a3.a0();
        chatActivityEnterView.a3.c2(i3 == 3);
        chatActivityEnterView.post(chatActivityEnterView.t3);
    }

    @Override // org.telegram.ui.Components.fx
    public final void t(ArrayList arrayList) {
        org.telegram.ui.wm wmVar = this.a.Q2;
        if (wmVar != null) {
            wmVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final void u() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.fx
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i3, int i10) {
        B(view, obj, str, obj2, z10, i3, i10, null, false);
    }

    @Override // org.telegram.ui.Components.fx
    public final void w() {
        org.telegram.ui.wm wmVar = this.a.Q2;
        if (wmVar != null) {
            wmVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.Y4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.F0;
        }
        org.telegram.messenger.g0.h3(new ci.n(this, editTextBoldCursor, str, document, j10, z10));
    }

    @Override // org.telegram.ui.Components.fx
    public final void y(long j10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
        if (wmVar != null) {
            if (org.telegram.messenger.g0.Q1()) {
                chatActivityEnterView.j0(false);
            }
            org.telegram.ui.g50 g50Var = new org.telegram.ui.g50(j10);
            g50Var.j0(chatActivityEnterView.e2);
            wmVar.presentFragment(g50Var);
        }
    }

    @Override // org.telegram.ui.Components.fx
    public final boolean z() {
        return this.a.S1 != 0;
    }
}
