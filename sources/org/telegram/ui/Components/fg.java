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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class fg implements rx {
    public final /* synthetic */ ChatActivityEnterView a;

    public fg(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.rx
    public final boolean A() {
        return this.a.n4;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10, org.telegram.messenger.ef efVar, boolean z11) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        tg tgVar = chatActivityEnterView.G0;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        org.telegram.ui.rm rmVar = chatActivityEnterView.J3;
        if (rmVar != null && bnVar != null && rmVar.f) {
            bnVar.yc();
            return;
        }
        if (c() && i7 == 0) {
            b5.J(chatActivityEnterView.C3, bnVar.a(), new org.telegram.ui.sp(this, view, obj, str, obj2, efVar, z11), chatActivityEnterView.K4);
            return;
        }
        if (chatActivityEnterView.H0 <= 0 || c()) {
            b5.X(chatActivityEnterView.R, 1, chatActivityEnterView.E3, new yd(this, obj, efVar, z10, i7, i10, z11, str, obj2));
            return;
        }
        kg kgVar = chatActivityEnterView.N3;
        if (kgVar != null) {
            kgVar.s1(view != null ? view : tgVar, ((org.telegram.ui.ActionBar.n5) tgVar.c).getText(), true);
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final long a() {
        return this.a.E3;
    }

    @Override // org.telegram.ui.Components.rx
    public final boolean b() {
        org.telegram.ui.bn bnVar = this.a.D3;
        return bnVar != null && bnVar.S6();
    }

    @Override // org.telegram.ui.Components.rx
    public final boolean c() {
        org.telegram.ui.bn bnVar = this.a.D3;
        return bnVar != null && bnVar.c();
    }

    @Override // org.telegram.ui.Components.rx
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        eg egVar = chatActivityEnterView.O3;
        if (egVar != null && !egVar.J) {
            egVar.o1.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.h2 h2Var = chatActivityEnterView.D3;
        if (h2Var == null) {
            h2Var = LaunchActivity.Q();
        }
        org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
        if (h2Var2 == null || chatActivityEnterView.C3 == null) {
            return;
        }
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        iw0 iw0Var = new iw0(chatActivityEnterView.C3, h2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.K4);
        h2Var2.showDialog(iw0Var);
        if (z10) {
            iw0Var.O0();
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
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
        PhotoViewer.p1().f2(arrayList, 0, 12, false, new dg(this, obj, obj2, efVar), chatActivityEnterView.D3);
    }

    @Override // org.telegram.ui.Components.rx
    public final int f() {
        int threadMessageId;
        threadMessageId = this.a.getThreadMessageId();
        return threadMessageId;
    }

    @Override // org.telegram.ui.Components.rx
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        return chatActivityEnterView.E3 == org.telegram.messenger.j10.i(chatActivityEnterView.R).e();
    }

    @Override // org.telegram.ui.Components.rx
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.messenger.ri.d0(chatActivityEnterView.R).k2(chatActivityEnterView.C3, stickerSetCovered, 0, chatActivityEnterView.D3, false, false);
    }

    @Override // org.telegram.ui.Components.rx
    public final void i(int i7) {
        int i10 = ChatActivityEnterView.n7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.L1(i7, true);
        if (i7 != 0) {
            chatActivityEnterView.M1(true, true, false, i7 == 1);
        }
        if (chatActivityEnterView.m4 && chatActivityEnterView.F2 == 2) {
            chatActivityEnterView.Q();
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.rx
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        TextView textView = chatActivityEnterView.S6;
        if (textView == null) {
            textView = chatActivityEnterView.F0;
        }
        if (textView == null || textView.length() == 0) {
            return false;
        }
        textView.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.rx
    public final void l(String str) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditText editText = chatActivityEnterView.S6;
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
            chatActivityEnterView.G3 = 2;
            CharSequence m10 = org.telegram.messenger.j6.m(str, editText.getPaint().getFontMetricsInt(), false, null, 0);
            editText.setText(editText.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editText.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } finally {
            chatActivityEnterView.G3 = 0;
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10, int i7) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        tg tgVar = chatActivityEnterView.G0;
        if (chatActivityEnterView.k7) {
            return;
        }
        eg egVar = chatActivityEnterView.O3;
        if (egVar != null) {
            egVar.dismiss();
            chatActivityEnterView.O3 = null;
        }
        if (chatActivityEnterView.H0 > 0 && !c()) {
            kg kgVar = chatActivityEnterView.N3;
            if (kgVar != null) {
                if (view == null) {
                    view = tgVar;
                }
                kgVar.s1(view, ((org.telegram.ui.ActionBar.n5) tgVar.c).getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.n4) {
            if (chatActivityEnterView.F2 != 0) {
                chatActivityEnterView.L1(0, true);
                cg cgVar = chatActivityEnterView.V0;
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
                cgVar.s(j3, true);
                chatActivityEnterView.V0.A();
            }
            chatActivityEnterView.M1(false, true, false, true);
        }
        chatActivityEnterView.d(document, str, obj, bjVar, false, z10, i7, 0);
        if (org.telegram.messenger.n5.C(chatActivityEnterView.E3) && org.telegram.messenger.fj.s3(document, false)) {
            org.telegram.messenger.mp.u1(chatActivityEnterView.S.a).C4(obj, document);
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        if (bnVar == null || (activity = chatActivityEnterView.C3) == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, chatActivityEnterView.K4);
        String M0 = org.telegram.messenger.gd.M0(2131752057, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(2131752058, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752088, null), new b0(this, 16));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        bnVar.showDialog(u1Var);
    }

    @Override // org.telegram.ui.Components.rx
    public final void o(h41 h41Var) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.ActionBar.h2 h2Var = chatActivityEnterView.D3;
        if (h2Var == null) {
            h2Var = LaunchActivity.Q();
        }
        org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
        if (h2Var2 != null) {
            chatActivityEnterView.O3 = new eg(this, chatActivityEnterView.getContext(), h2Var2, h41Var, chatActivityEnterView.K4);
            kg kgVar = chatActivityEnterView.N3;
            if (kgVar != null) {
                kgVar.A(true);
            }
            h2Var2.showDialog(chatActivityEnterView.O3);
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final float p() {
        return this.a.x0;
    }

    @Override // org.telegram.ui.Components.rx
    public final void q() {
        org.telegram.ui.ActionBar.h2 h2Var = this.a.D3;
        if (h2Var == null) {
            h2Var = LaunchActivity.Q();
        }
        h2Var.showDialog(new ug.z0(h2Var, 11, false));
    }

    @Override // org.telegram.ui.Components.rx
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.messenger.ri.d0(chatActivityEnterView.R).k2(chatActivityEnterView.C3, stickerSetCovered, 2, chatActivityEnterView.D3, false, false);
    }

    @Override // org.telegram.ui.Components.rx
    public final void s(int i7) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.N3.V();
        chatActivityEnterView.N3.n2(i7 == 3);
        chatActivityEnterView.post(chatActivityEnterView.g4);
    }

    @Override // org.telegram.ui.Components.rx
    public final void t(ArrayList arrayList) {
        org.telegram.ui.bn bnVar = this.a.D3;
        if (bnVar != null) {
            bnVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final void u() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.rx
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
        B(view, obj, str, obj2, z10, i7, i10, null, false);
    }

    @Override // org.telegram.ui.Components.rx
    public final void w() {
        org.telegram.ui.bn bnVar = this.a.D3;
        if (bnVar != null) {
            bnVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.S6;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.F0;
        }
        org.telegram.messenger.g0.g3(new di.m(this, editTextBoldCursor, str, document, j3, z10));
    }

    @Override // org.telegram.ui.Components.rx
    public final void y(long j3) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        if (bnVar != null) {
            if (org.telegram.messenger.g0.Q1()) {
                chatActivityEnterView.G0(false);
            }
            org.telegram.ui.n50 n50Var = new org.telegram.ui.n50(j3);
            n50Var.j0(chatActivityEnterView.R2);
            bnVar.presentFragment(n50Var);
        }
    }

    @Override // org.telegram.ui.Components.rx
    public final boolean z() {
        return this.a.F2 != 0;
    }
}
