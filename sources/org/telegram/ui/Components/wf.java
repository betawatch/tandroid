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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class wf implements mx {
    public final /* synthetic */ ChatActivityEnterView a;

    public wf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.mx
    public final boolean A() {
        return this.a.h4;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10, org.telegram.messenger.ff ffVar, boolean z11) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        kg kgVar = chatActivityEnterView.G0;
        org.telegram.ui.an anVar = chatActivityEnterView.x3;
        org.telegram.ui.qm qmVar = chatActivityEnterView.D3;
        if (qmVar != null && anVar != null && qmVar.f) {
            anVar.yc();
            return;
        }
        if (c() && i7 == 0) {
            t4.J(chatActivityEnterView.w3, anVar.a(), new org.telegram.ui.rp(this, view, obj, str, obj2, ffVar, z11), chatActivityEnterView.E4);
            return;
        }
        if (chatActivityEnterView.H0 <= 0 || c()) {
            t4.X(chatActivityEnterView.R, 1, chatActivityEnterView.y3, new qd(this, obj, ffVar, z10, i7, i10, z11, str, obj2));
            return;
        }
        cg cgVar = chatActivityEnterView.H3;
        if (cgVar != null) {
            cgVar.s1(view != null ? view : kgVar, ((org.telegram.ui.ActionBar.j5) kgVar.c).getText(), true);
        }
    }

    @Override // org.telegram.ui.Components.mx
    public final long a() {
        return this.a.y3;
    }

    @Override // org.telegram.ui.Components.mx
    public final boolean b() {
        org.telegram.ui.an anVar = this.a.x3;
        return anVar != null && anVar.S6();
    }

    @Override // org.telegram.ui.Components.mx
    public final boolean c() {
        org.telegram.ui.an anVar = this.a.x3;
        return anVar != null && anVar.c();
    }

    @Override // org.telegram.ui.Components.mx
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        vf vfVar = chatActivityEnterView.I3;
        if (vfVar != null && !vfVar.J) {
            vfVar.o1.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = chatActivityEnterView.x3;
        if (e2Var == null) {
            e2Var = LaunchActivity.Q();
        }
        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
        if (e2Var2 == null || chatActivityEnterView.w3 == null) {
            return;
        }
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        bw0 bw0Var = new bw0(chatActivityEnterView.w3, e2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.E4);
        e2Var2.showDialog(bw0Var);
        if (z10) {
            bw0Var.N0();
        }
    }

    @Override // org.telegram.ui.Components.mx
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.an anVar = chatActivityEnterView.x3;
        if (anVar == null) {
            return;
        }
        PhotoViewer.p1().I2(null, anVar, anVar.Aa);
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
        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, file.getAbsolutePath(), 0, false, 0, 0);
        ffVar.a = null;
        ffVar.b = true;
        arrayList.add(ffVar);
        PhotoViewer.p1().f2(arrayList, 0, 12, false, new uf(this, obj, obj2, ffVar), chatActivityEnterView.x3);
    }

    @Override // org.telegram.ui.Components.mx
    public final int f() {
        int threadMessageId;
        threadMessageId = this.a.getThreadMessageId();
        return threadMessageId;
    }

    @Override // org.telegram.ui.Components.mx
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        return chatActivityEnterView.y3 == org.telegram.messenger.m10.i(chatActivityEnterView.R).e();
    }

    @Override // org.telegram.ui.Components.mx
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.messenger.si.b0(chatActivityEnterView.R).f2(chatActivityEnterView.w3, stickerSetCovered, 0, chatActivityEnterView.x3, false, false);
    }

    @Override // org.telegram.ui.Components.mx
    public final void i(int i7) {
        int i10 = ChatActivityEnterView.N6;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.D1(i7, true);
        if (i7 != 0) {
            chatActivityEnterView.E1(true, true, false, i7 == 1);
        }
        if (chatActivityEnterView.g4 && chatActivityEnterView.z2 == 2) {
            chatActivityEnterView.O();
        }
    }

    @Override // org.telegram.ui.Components.mx
    public final boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.mx
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        TextView textView = chatActivityEnterView.s6;
        if (textView == null) {
            textView = chatActivityEnterView.F0;
        }
        if (textView == null || textView.length() == 0) {
            return false;
        }
        textView.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override // org.telegram.ui.Components.mx
    public final void l(String str) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditText editText = chatActivityEnterView.s6;
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
            chatActivityEnterView.A3 = 2;
            CharSequence m10 = org.telegram.messenger.j6.m(str, editText.getPaint().getFontMetricsInt(), false, null, 0);
            editText.setText(editText.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editText.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } finally {
            chatActivityEnterView.A3 = 0;
        }
    }

    @Override // org.telegram.ui.Components.mx
    public final void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.cj cjVar, boolean z10, int i7) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        kg kgVar = chatActivityEnterView.G0;
        if (chatActivityEnterView.K6) {
            return;
        }
        vf vfVar = chatActivityEnterView.I3;
        if (vfVar != null) {
            vfVar.dismiss();
            chatActivityEnterView.I3 = null;
        }
        if (chatActivityEnterView.H0 > 0 && !c()) {
            cg cgVar = chatActivityEnterView.H3;
            if (cgVar != null) {
                if (view == null) {
                    view = kgVar;
                }
                cgVar.s1(view, ((org.telegram.ui.ActionBar.j5) kgVar.c).getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.h4) {
            if (chatActivityEnterView.z2 != 0) {
                chatActivityEnterView.D1(0, true);
                sf sfVar = chatActivityEnterView.V0;
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
                sfVar.s(j3, true);
                chatActivityEnterView.V0.A();
            }
            chatActivityEnterView.E1(false, true, false, true);
        }
        chatActivityEnterView.d(document, str, obj, cjVar, false, z10, i7, 0);
        if (org.telegram.messenger.m5.C(chatActivityEnterView.y3) && org.telegram.messenger.gj.s3(document, false)) {
            org.telegram.messenger.np.s1(chatActivityEnterView.S.a).t4(obj, document);
        }
    }

    @Override // org.telegram.ui.Components.mx
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.an anVar = chatActivityEnterView.x3;
        if (anVar == null || (activity = chatActivityEnterView.w3) == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, chatActivityEnterView.E4);
        String M0 = org.telegram.messenger.hd.M0(2131752068, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131752069, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752099, null), new s(this, 17));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        anVar.showDialog(t1Var);
    }

    @Override // org.telegram.ui.Components.mx
    public final void o(x31 x31Var) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.ActionBar.e2 e2Var = chatActivityEnterView.x3;
        if (e2Var == null) {
            e2Var = LaunchActivity.Q();
        }
        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
        if (e2Var2 != null) {
            chatActivityEnterView.I3 = new vf(this, chatActivityEnterView.getContext(), e2Var2, x31Var, chatActivityEnterView.E4);
            cg cgVar = chatActivityEnterView.H3;
            if (cgVar != null) {
                cgVar.C(true);
            }
            e2Var2.showDialog(chatActivityEnterView.I3);
        }
    }

    @Override // org.telegram.ui.Components.mx
    public final float p() {
        return this.a.x0;
    }

    @Override // org.telegram.ui.Components.mx
    public final void q() {
        org.telegram.ui.ActionBar.e2 e2Var = this.a.x3;
        if (e2Var == null) {
            e2Var = LaunchActivity.Q();
        }
        e2Var.showDialog(new ug.x0(e2Var, 11, false));
    }

    @Override // org.telegram.ui.Components.mx
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.messenger.si.b0(chatActivityEnterView.R).f2(chatActivityEnterView.w3, stickerSetCovered, 2, chatActivityEnterView.x3, false, false);
    }

    @Override // org.telegram.ui.Components.mx
    public final void s(int i7) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.H3.Y();
        chatActivityEnterView.H3.n2(i7 == 3);
        chatActivityEnterView.post(chatActivityEnterView.a4);
    }

    @Override // org.telegram.ui.Components.mx
    public final void t(ArrayList arrayList) {
        org.telegram.ui.an anVar = this.a.x3;
        if (anVar != null) {
            anVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override // org.telegram.ui.Components.mx
    public final void u() {
        this.a.invalidate();
    }

    @Override // org.telegram.ui.Components.mx
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
        B(view, obj, str, obj2, z10, i7, i10, null, false);
    }

    @Override // org.telegram.ui.Components.mx
    public final void w() {
        org.telegram.ui.an anVar = this.a.x3;
        if (anVar != null) {
            anVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override // org.telegram.ui.Components.mx
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.s6;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.F0;
        }
        org.telegram.messenger.g0.h3(new di.l(this, editTextBoldCursor, str, document, j3, z10));
    }

    @Override // org.telegram.ui.Components.mx
    public final void y(long j3) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        org.telegram.ui.an anVar = chatActivityEnterView.x3;
        if (anVar != null) {
            if (org.telegram.messenger.g0.Q1()) {
                chatActivityEnterView.y0(false);
            }
            org.telegram.ui.l50 l50Var = new org.telegram.ui.l50(j3);
            l50Var.j0(chatActivityEnterView.L2);
            anVar.presentFragment(l50Var);
        }
    }

    @Override // org.telegram.ui.Components.mx
    public final boolean z() {
        return this.a.z2 != 0;
    }
}
