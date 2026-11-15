package oi;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.p41;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class s5 implements d1 {
    public final /* synthetic */ y5 a;

    public s5(y5 y5Var) {
        this.a = y5Var;
    }

    @Override // oi.d1
    public final void B() {
        a aVar;
        y5 y5Var = this.a;
        v5 v5Var = y5Var.E;
        if (v5Var == null || (aVar = y5Var.y) == null) {
            return;
        }
        q3.U1(((a3) v5Var).a, aVar, true);
    }

    @Override // oi.d1
    public final void I(CharSequence charSequence) {
        v5 v5Var = this.a.E;
        if (v5Var != null) {
            a3 a3Var = (a3) v5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            a3Var.a.w4(charSequence.toString());
        }
    }

    @Override // oi.d1
    public final void Z(e1 e1Var, int i7, int i10) {
        v5 v5Var;
        h9 textSelectionHelper;
        y5 y5Var = this.a;
        if (y5Var.G || i7 == i10 || (v5Var = y5Var.E) == null || (textSelectionHelper = ((a3) v5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        y5Var.post(new jg.o1(this, e1Var, i10, textSelectionHelper, i7, 5));
    }

    @Override // oi.d1
    public final void b0(Editable editable) {
        a aVar;
        y5 y5Var = this.a;
        if (y5Var.y == null) {
            return;
        }
        y5Var.E(editable);
        y5Var.K();
        y5.d(y5Var.y.b, editable);
        y5Var.C();
        y5Var.G();
        int i7 = 0;
        if (y5Var.o() && !y5Var.l()) {
            ((TL_iv.pageBlockBlockquote) y5Var.y.b).collapsed = false;
        }
        y5Var.H();
        v5 v5Var = y5Var.E;
        if (v5Var != null) {
            q3 q3Var = ((a3) v5Var).a;
            d2 d2Var = q3Var.R3;
            if (d2Var != null) {
                d2Var.g();
            }
            q3Var.p3.onContentChanged();
        }
        v5 v5Var2 = y5Var.E;
        if (v5Var2 != null) {
            ((a3) v5Var2).a.p3.M(y5Var, y5.b(editable.toString()));
        }
        String obj = editable.toString();
        a aVar2 = y5Var.y;
        if (aVar2 != null && obj != null && aVar2.c == 0 && (aVar2.b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
            i7 = 6;
        }
        if (i7 == 0 || y5Var.E == null) {
            x5 s5 = y5.s(editable.toString(), y5Var.y);
            if (s5 != null && y5Var.E != null) {
                y5Var.post(new ki.n(this, y5Var.y, s5, 13));
            }
        } else {
            y5Var.post(new ai.z0(this, y5Var.y, i7, 24));
        }
        if (y5Var.W || ((aVar = y5Var.y) != null && (aVar.b instanceof TL_iv.pageBlockPullquote))) {
            y5Var.invalidate();
        }
    }

    @Override // oi.d1
    public final void d(e1 e1Var) {
        v5 v5Var = this.a.E;
        if (v5Var != null) {
            q3 q3Var = ((a3) v5Var).a;
            q3.Q1(q3Var, e1Var);
            q3Var.p3.b(e1Var, true);
        }
    }

    @Override // oi.d1
    public final boolean g() {
        y5 y5Var = this.a;
        v5 v5Var = y5Var.E;
        if (v5Var == null || y5Var.y == null) {
            return false;
        }
        return ((a3) v5Var).a.V4();
    }

    @Override // oi.d1
    public final boolean h0(boolean z10) {
        a aVar;
        y5 y5Var = this.a;
        v5 v5Var = y5Var.E;
        if (v5Var == null || (aVar = y5Var.y) == null) {
            return false;
        }
        return ((a3) v5Var).a.Z3(aVar, z10);
    }

    @Override // oi.d1
    public final void m(int i7, int i10) {
        d2 d2Var;
        y5 y5Var = this.a;
        v5 v5Var = y5Var.E;
        if (v5Var == null || y5Var.y == null || (d2Var = ((a3) v5Var).a.R3) == null) {
            return;
        }
        d2Var.f(i7, i10);
    }

    @Override // oi.d1
    public final boolean o(e1 e1Var) {
        a aVar;
        y5 y5Var = this.a;
        v5 v5Var = y5Var.E;
        if (v5Var == null || (aVar = y5Var.y) == null) {
            return false;
        }
        return q3.U1(((a3) v5Var).a, aVar, false);
    }

    @Override // oi.d1
    public final boolean q0(e1 e1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        y5 y5Var = this.a;
        v5 v5Var = y5Var.E;
        if (v5Var != null && (aVar = y5Var.y) != null) {
            q3 q3Var = ((a3) v5Var).a;
            ClipboardManager clipboardManager = (ClipboardManager) q3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList z42 = q3Var.z4(y3.z(htmlText, hashMap));
                            if (!z42.isEmpty() && ((z42.size() != 1 || !q3.I3((a) z42.get(0))) && (indexOf = q3Var.t3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(e1Var.getSelectionStart(), e1Var.getSelectionEnd()));
                                boolean L4 = q3Var.L4(indexOf, indexOf, max, Math.max(max, Math.max(e1Var.getSelectionStart(), e1Var.getSelectionEnd())), z42);
                                if (L4 && !hashMap.isEmpty()) {
                                    q3Var.u3.putAll(hashMap);
                                }
                                return L4;
                            }
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    @Override // oi.d1
    public final void z(e1 e1Var) {
        int length;
        Spanned spanned;
        boolean z10;
        boolean z11;
        int i7;
        e1 editText;
        Editable text;
        y5 y5Var = this.a;
        if (y5Var.E == null || y5Var.y == null) {
            return;
        }
        String obj = e1Var.getText().toString();
        ((a3) y5Var.E).a.p3.M(y5Var, null);
        String b10 = y5.b(obj);
        if (b10 != null) {
            ArrayList a10 = j0.a(b10);
            if (!a10.isEmpty()) {
                y5Var.D((j0) a10.get(0));
                return;
            }
        }
        int q10 = y5.q(e1Var.getText().toString());
        if (q10 != 0) {
            ((a3) y5Var.E).c(y5Var.y, q10);
            return;
        }
        x5 r10 = y5.r(e1Var.getText().toString(), y5Var.y);
        if (r10 != null) {
            ((a3) y5Var.E).d(y5Var.y, r10.a, r10.b, r10.c, r10.d, r10.e);
            return;
        }
        if ((y5Var.y.b instanceof TL_iv.pageBlockPullquote) && y5Var.f.length() > 0) {
            y5Var.h();
            return;
        }
        v5 v5Var = y5Var.E;
        a aVar = y5Var.y;
        q3 q3Var = ((a3) v5Var).a;
        ArrayList arrayList = q3Var.x4;
        p41 p41Var = q3Var.g3;
        ArrayList arrayList2 = q3Var.t3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        d2 d2Var = q3Var.R3;
        if (d2Var != null) {
            d2Var.d();
        }
        View C1 = q3Var.C1(aVar);
        boolean z12 = C1 instanceof y5;
        if (z12) {
            e1 editText2 = ((y5) C1).getEditText();
            Spanned text2 = editText2.getText();
            length = editText2.getSelectionEnd();
            spanned = text2;
        } else {
            SpannableStringBuilder A = y5.A(aVar.b);
            length = A.length();
            spanned = A;
        }
        if (length < 0 || length > spanned.length()) {
            length = spanned.length();
        }
        if (spanned.length() == 0) {
            if (!aVar.k.isEmpty()) {
                ArrayList arrayList3 = aVar.k;
                arrayList3.remove(arrayList3.size() - 1);
                q3Var.v4();
                p41Var.O(false);
                d2 d2Var2 = q3Var.R3;
                if (d2Var2 != null) {
                    d2Var2.h();
                }
                q3Var.post(new k2(q3Var, aVar, 27));
                return;
            }
            if (aVar.c > 0) {
                q3Var.w2(indexOf);
                q3Var.v4();
                p41Var.O(false);
                d2 d2Var3 = q3Var.R3;
                if (d2Var3 != null) {
                    d2Var3.h();
                }
                q3Var.post(new k2(q3Var, aVar, 28));
                return;
            }
        }
        CharSequence subSequence = spanned.subSequence(0, length);
        CharSequence subSequence2 = spanned.subSequence(length, spanned.length());
        TL_iv.PageBlock pageBlock = aVar.b;
        ArrayList arrayList4 = aVar.k;
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            long a11 = l0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.b).caption;
            z10 = true;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                q3Var.u3.put(Long.valueOf(a11), richText);
            }
            arrayList4.add(Long.valueOf(a11));
            aVar.b = new TL_iv.pageBlockParagraph();
            z11 = true;
        } else {
            z10 = true;
            z11 = false;
        }
        y5.d(aVar.b, subSequence);
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        y5.d(pageblockparagraph, subSequence2);
        int i10 = aVar.d;
        if (i10 > 0) {
            i10++;
        }
        a aVar2 = new a(pageblockparagraph, aVar.c, i10);
        aVar2.e = aVar.e;
        aVar2.k.addAll(arrayList4);
        int i11 = indexOf + 1;
        arrayList2.add(i11, aVar2);
        q3Var.v4();
        if (z11) {
            p41Var.O(false);
            d2 d2Var4 = q3Var.R3;
            if (d2Var4 != null) {
                d2Var4.h();
            }
            q3Var.post(new k2(q3Var, aVar2, 29));
            return;
        }
        if (z12 && (text = (editText = ((y5) C1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
            editText.i2 = z10;
            text.delete(length, text.length());
            editText.i2 = false;
        }
        p41Var.T();
        q3Var.s4(i11);
        int indexOf2 = arrayList.indexOf(aVar2);
        if (indexOf2 < 0) {
            p41Var.f();
        } else {
            v4.m0 itemAnimator = q3Var.getItemAnimator();
            q3Var.setItemAnimator(null);
            p41Var.i(indexOf2);
            if (aVar.d > 0 && (i7 = indexOf2 + 1) < arrayList.size()) {
                p41Var.k(i7, (arrayList.size() - indexOf2) - 1);
            }
            q3Var.post(new u2(q3Var, itemAnimator, 0));
        }
        d2 d2Var5 = q3Var.R3;
        if (d2Var5 != null) {
            d2Var5.h();
        }
        q3Var.post(new v2(q3Var, aVar2, 0));
    }
}
