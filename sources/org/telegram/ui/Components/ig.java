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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ig implements tx {
    public final /* synthetic */ ChatActivityEnterView a;

    public ig(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.tx
    public final boolean A() {
        return this.a.p4;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10, org.telegram.messenger.ef efVar, boolean z11) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        vg vgVar = chatActivityEnterView.G0;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        org.telegram.ui.rm rmVar = chatActivityEnterView.L3;
        if (rmVar != null && bnVar != null && rmVar.f) {
            bnVar.yc();
            return;
        }
        if (c() && i7 == 0) {
            c5.J(chatActivityEnterView.E3, bnVar.a(), new org.telegram.ui.sp(this, view, obj, str, obj2, efVar, z11), chatActivityEnterView.M4);
            return;
        }
        if (chatActivityEnterView.H0 <= 0 || c()) {
            c5.X(chatActivityEnterView.R, 1, chatActivityEnterView.G3, new yd(this, obj, efVar, z10, i7, i10, z11, str, obj2));
            return;
        }
        ng ngVar = chatActivityEnterView.P3;
        if (ngVar != null) {
            ngVar.s1(view != null ? view : vgVar, ((org.telegram.ui.ActionBar.m5) vgVar.c).getText(), true);
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final long a() {
        return this.a.G3;
    }

    @Override // org.telegram.ui.Components.tx
    public final boolean b() {
        org.telegram.ui.bn bnVar = this.a.F3;
        return bnVar != null && bnVar.S6();
    }

    @Override // org.telegram.ui.Components.tx
    public final boolean c() {
        org.telegram.ui.bn bnVar = this.a.F3;
        return bnVar != null && bnVar.c();
    }

    @Override // org.telegram.ui.Components.tx
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        hg hgVar = chatActivityEnterView.Q3;
        if (hgVar != null && !hgVar.J) {
            hgVar.o1.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = chatActivityEnterView.F3;
        if (g2Var == null) {
            g2Var = LaunchActivity.Q();
        }
        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
        if (g2Var2 == null || chatActivityEnterView.E3 == null) {
            return;
        }
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        kw0 kw0Var = new kw0(chatActivityEnterView.E3, g2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.M4);
        g2Var2.showDialog(kw0Var);
        if (z10) {
            kw0Var.O0();
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar == null) {
            return;
        }
        PhotoViewer.p1().I2(null, bnVar, bnVar.Ba);
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
        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, file.getAbsolutePath(), 0, false, 0, 0);
        efVar.a = null;
        efVar.b = true;
        arrayList.add(efVar);
        PhotoViewer.p1().f2(arrayList, 0, 12, false, new gg(this, obj, obj2, efVar), chatActivityEnterView.F3);
    }

    @Override // org.telegram.ui.Components.tx
    public final int f() {
        int threadMessageId;
        threadMessageId = this.a.getThreadMessageId();
        return threadMessageId;
    }

    @Override // org.telegram.ui.Components.tx
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        return chatActivityEnterView.G3 == org.telegram.messenger.j10.i(chatActivityEnterView.R).e();
    }

    @Override // org.telegram.ui.Components.tx
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.messenger.ri.d0(chatActivityEnterView.R).k2(chatActivityEnterView.E3, stickerSetCovered, 0, chatActivityEnterView.F3, false, false);
    }

    @Override // org.telegram.ui.Components.tx
    public final void i(int i7) {
        int i10 = ChatActivityEnterView.s7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.P1(i7, true);
        if (i7 != 0) {
            chatActivityEnterView.Q1(true, true, false, i7 == 1);
        }
        if (chatActivityEnterView.o4 && chatActivityEnterView.H2 == 2) {
            chatActivityEnterView.Q();
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.tx
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        TextView textView = chatActivityEnterView.U6;
        if (textView == null) {
            textView = chatActivityEnterView.F0;
        }
        if (textView == null || textView.length() == 0) {
            return false;
        }
        textView.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.tx
    public final void l(String str) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditText editText = chatActivityEnterView.U6;
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
            chatActivityEnterView.I3 = 2;
            CharSequence m10 = org.telegram.messenger.j6.m(str, editText.getPaint().getFontMetricsInt(), false, null, 0);
            editText.setText(editText.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editText.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } finally {
            chatActivityEnterView.I3 = 0;
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10, int i7) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        vg vgVar = chatActivityEnterView.G0;
        if (chatActivityEnterView.p7) {
            return;
        }
        hg hgVar = chatActivityEnterView.Q3;
        if (hgVar != null) {
            hgVar.dismiss();
            chatActivityEnterView.Q3 = null;
        }
        if (chatActivityEnterView.H0 > 0 && !c()) {
            ng ngVar = chatActivityEnterView.P3;
            if (ngVar != null) {
                if (view == null) {
                    view = vgVar;
                }
                ngVar.s1(view, ((org.telegram.ui.ActionBar.m5) vgVar.c).getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.p4) {
            if (chatActivityEnterView.H2 != 0) {
                chatActivityEnterView.P1(0, true);
                fg fgVar = chatActivityEnterView.V0;
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
                fgVar.s(j3, true);
                chatActivityEnterView.V0.A();
            }
            chatActivityEnterView.Q1(false, true, false, true);
        }
        chatActivityEnterView.d(document, str, obj, bjVar, false, z10, i7, 0);
        if (org.telegram.messenger.n5.C(chatActivityEnterView.G3) && org.telegram.messenger.fj.s3(document, false)) {
            org.telegram.messenger.mp.u1(chatActivityEnterView.S.a).C4(obj, document);
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar == null || (activity = chatActivityEnterView.E3) == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, chatActivityEnterView.M4);
        String N0 = org.telegram.messenger.gd.N0(2131752056, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131752057, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752087, null), new c0(this, 16));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        bnVar.showDialog(t1Var);
    }

    @Override // org.telegram.ui.Components.tx
    public final void o(k41 k41Var) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = chatActivityEnterView.F3;
        if (g2Var == null) {
            g2Var = LaunchActivity.Q();
        }
        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
        if (g2Var2 != null) {
            chatActivityEnterView.Q3 = new hg(this, chatActivityEnterView.getContext(), g2Var2, k41Var, chatActivityEnterView.M4);
            ng ngVar = chatActivityEnterView.P3;
            if (ngVar != null) {
                ngVar.A(true);
            }
            g2Var2.showDialog(chatActivityEnterView.Q3);
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final float p() {
        return this.a.x0;
    }

    @Override // org.telegram.ui.Components.tx
    public final void q() {
        org.telegram.ui.ActionBar.g2 g2Var = this.a.F3;
        if (g2Var == null) {
            g2Var = LaunchActivity.Q();
        }
        g2Var.showDialog(new ug.y0(g2Var, 11, false));
    }

    @Override // org.telegram.ui.Components.tx
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.messenger.ri.d0(chatActivityEnterView.R).k2(chatActivityEnterView.E3, stickerSetCovered, 2, chatActivityEnterView.F3, false, false);
    }

    @Override // org.telegram.ui.Components.tx
    public final void s(int i7) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.P3.V();
        chatActivityEnterView.P3.n2(i7 == 3);
        chatActivityEnterView.post(chatActivityEnterView.i4);
    }

    @Override // org.telegram.ui.Components.tx
    public final void t(ArrayList arrayList) {
        org.telegram.ui.bn bnVar = this.a.F3;
        if (bnVar != null) {
            bnVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final void u() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.tx
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
        B(view, obj, str, obj2, z10, i7, i10, null, false);
    }

    @Override // org.telegram.ui.Components.tx
    public final void w() {
        org.telegram.ui.bn bnVar = this.a.F3;
        if (bnVar != null) {
            bnVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.U6;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.F0;
        }
        org.telegram.messenger.g0.g3(new di.m(this, editTextBoldCursor, str, document, j3, z10));
    }

    @Override // org.telegram.ui.Components.tx
    public final void y(long j3) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null) {
            if (org.telegram.messenger.g0.Q1()) {
                chatActivityEnterView.K0(false);
            }
            org.telegram.ui.n50 n50Var = new org.telegram.ui.n50(j3);
            n50Var.j0(chatActivityEnterView.T2);
            bnVar.presentFragment(n50Var);
        }
    }

    @Override // org.telegram.ui.Components.tx
    public final boolean z() {
        return this.a.H2 != 0;
    }
}
