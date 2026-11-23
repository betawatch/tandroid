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
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.c51;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class u5 implements e1 {
    public final /* synthetic */ a6 a;

    public u5(a6 a6Var) {
        this.a = a6Var;
    }

    @Override // oi.e1
    public final void A(int i7, int i10) {
        g2 g2Var;
        a6 a6Var = this.a;
        x5 x5Var = a6Var.E;
        if (x5Var == null || a6Var.y == null || (g2Var = ((d3) x5Var).a.R3) == null) {
            return;
        }
        g2Var.f(i7, i10);
    }

    @Override // oi.e1
    public final void E0() {
        a aVar;
        a6 a6Var = this.a;
        x5 x5Var = a6Var.E;
        if (x5Var == null || (aVar = a6Var.y) == null) {
            return;
        }
        t3.U1(((d3) x5Var).a, aVar, true);
    }

    @Override // oi.e1
    public final boolean E1(boolean z10) {
        a aVar;
        a6 a6Var = this.a;
        x5 x5Var = a6Var.E;
        if (x5Var == null || (aVar = a6Var.y) == null) {
            return false;
        }
        return ((d3) x5Var).a.Z3(aVar, z10);
    }

    @Override // oi.e1
    public final boolean J(f1 f1Var) {
        a aVar;
        a6 a6Var = this.a;
        x5 x5Var = a6Var.E;
        if (x5Var == null || (aVar = a6Var.y) == null) {
            return false;
        }
        return t3.U1(((d3) x5Var).a, aVar, false);
    }

    @Override // oi.e1
    public final void b1(CharSequence charSequence) {
        x5 x5Var = this.a.E;
        if (x5Var != null) {
            d3 d3Var = (d3) x5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            d3Var.a.w4(charSequence.toString());
        }
    }

    @Override // oi.e1
    public final boolean d2(f1 f1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        a6 a6Var = this.a;
        x5 x5Var = a6Var.E;
        if (x5Var != null && (aVar = a6Var.y) != null) {
            t3 t3Var = ((d3) x5Var).a;
            ClipboardManager clipboardManager = (ClipboardManager) t3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList z42 = t3Var.z4(b4.z(htmlText, hashMap));
                            if (!z42.isEmpty() && ((z42.size() != 1 || !t3.I3((a) z42.get(0))) && (indexOf = t3Var.t3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(f1Var.getSelectionStart(), f1Var.getSelectionEnd()));
                                boolean L4 = t3Var.L4(indexOf, indexOf, max, Math.max(max, Math.max(f1Var.getSelectionStart(), f1Var.getSelectionEnd())), z42);
                                if (L4 && !hashMap.isEmpty()) {
                                    t3Var.u3.putAll(hashMap);
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

    @Override // oi.e1
    public final void e(f1 f1Var) {
        x5 x5Var = this.a.E;
        if (x5Var != null) {
            t3 t3Var = ((d3) x5Var).a;
            t3.Q1(t3Var, f1Var);
            t3Var.p3.k(f1Var, true);
        }
    }

    @Override // oi.e1
    public final boolean o() {
        a6 a6Var = this.a;
        x5 x5Var = a6Var.E;
        if (x5Var == null || a6Var.y == null) {
            return false;
        }
        return ((d3) x5Var).a.V4();
    }

    @Override // oi.e1
    public final void r1(f1 f1Var, int i7, int i10) {
        x5 x5Var;
        j9 textSelectionHelper;
        a6 a6Var = this.a;
        if (a6Var.G || i7 == i10 || (x5Var = a6Var.E) == null || (textSelectionHelper = ((d3) x5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        a6Var.post(new jg.o1(this, f1Var, i10, textSelectionHelper, i7, 5));
    }

    @Override // oi.e1
    public final void s1(Editable editable) {
        a aVar;
        a6 a6Var = this.a;
        if (a6Var.y == null) {
            return;
        }
        a6Var.E(editable);
        a6Var.K();
        a6.d(a6Var.y.b, editable);
        a6Var.C();
        a6Var.G();
        int i7 = 0;
        if (a6Var.o() && !a6Var.l()) {
            ((TL_iv.pageBlockBlockquote) a6Var.y.b).collapsed = false;
        }
        a6Var.H();
        x5 x5Var = a6Var.E;
        if (x5Var != null) {
            t3 t3Var = ((d3) x5Var).a;
            g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.g();
            }
            t3Var.p3.onContentChanged();
        }
        x5 x5Var2 = a6Var.E;
        if (x5Var2 != null) {
            ((d3) x5Var2).a.p3.a0(a6Var, a6.b(editable.toString()));
        }
        String obj = editable.toString();
        a aVar2 = a6Var.y;
        if (aVar2 != null && obj != null && aVar2.c == 0 && (aVar2.b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
            i7 = 6;
        }
        if (i7 == 0 || a6Var.E == null) {
            z5 s5 = a6.s(editable.toString(), a6Var.y);
            if (s5 != null && a6Var.E != null) {
                a6Var.post(new kg.y(this, a6Var.y, s5, 18));
            }
        } else {
            a6Var.post(new ai.j1(this, a6Var.y, i7, 24));
        }
        if (a6Var.W || ((aVar = a6Var.y) != null && (aVar.b instanceof TL_iv.pageBlockPullquote))) {
            a6Var.invalidate();
        }
    }

    @Override // oi.e1
    public final void x0(f1 f1Var) {
        int length;
        Spanned spanned;
        boolean z10;
        boolean z11;
        int i7;
        f1 editText;
        Editable text;
        a6 a6Var = this.a;
        if (a6Var.E == null || a6Var.y == null) {
            return;
        }
        String obj = f1Var.getText().toString();
        ((d3) a6Var.E).a.p3.a0(a6Var, null);
        String b10 = a6.b(obj);
        if (b10 != null) {
            ArrayList a10 = k0.a(b10);
            if (!a10.isEmpty()) {
                a6Var.D((k0) a10.get(0));
                return;
            }
        }
        int q10 = a6.q(f1Var.getText().toString());
        if (q10 != 0) {
            ((d3) a6Var.E).c(a6Var.y, q10);
            return;
        }
        z5 r10 = a6.r(f1Var.getText().toString(), a6Var.y);
        if (r10 != null) {
            ((d3) a6Var.E).d(a6Var.y, r10.a, r10.b, r10.c, r10.d, r10.e);
            return;
        }
        if ((a6Var.y.b instanceof TL_iv.pageBlockPullquote) && a6Var.f.length() > 0) {
            a6Var.h();
            return;
        }
        x5 x5Var = a6Var.E;
        a aVar = a6Var.y;
        t3 t3Var = ((d3) x5Var).a;
        ArrayList arrayList = t3Var.x4;
        c51 c51Var = t3Var.g3;
        ArrayList arrayList2 = t3Var.t3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        View C1 = t3Var.C1(aVar);
        boolean z12 = C1 instanceof a6;
        if (z12) {
            f1 editText2 = ((a6) C1).getEditText();
            Spanned text2 = editText2.getText();
            length = editText2.getSelectionEnd();
            spanned = text2;
        } else {
            SpannableStringBuilder A = a6.A(aVar.b);
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
                t3Var.v4();
                c51Var.O(false);
                g2 g2Var2 = t3Var.R3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
                t3Var.post(new n2(t3Var, aVar, 27));
                return;
            }
            if (aVar.c > 0) {
                t3Var.w2(indexOf);
                t3Var.v4();
                c51Var.O(false);
                g2 g2Var3 = t3Var.R3;
                if (g2Var3 != null) {
                    g2Var3.h();
                }
                t3Var.post(new n2(t3Var, aVar, 28));
                return;
            }
        }
        CharSequence subSequence = spanned.subSequence(0, length);
        CharSequence subSequence2 = spanned.subSequence(length, spanned.length());
        TL_iv.PageBlock pageBlock = aVar.b;
        ArrayList arrayList4 = aVar.k;
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            long a11 = m0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.b).caption;
            z10 = true;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                t3Var.u3.put(Long.valueOf(a11), richText);
            }
            arrayList4.add(Long.valueOf(a11));
            aVar.b = new TL_iv.pageBlockParagraph();
            z11 = true;
        } else {
            z10 = true;
            z11 = false;
        }
        a6.d(aVar.b, subSequence);
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        a6.d(pageblockparagraph, subSequence2);
        int i10 = aVar.d;
        if (i10 > 0) {
            i10++;
        }
        a aVar2 = new a(pageblockparagraph, aVar.c, i10);
        aVar2.e = aVar.e;
        aVar2.k.addAll(arrayList4);
        int i11 = indexOf + 1;
        arrayList2.add(i11, aVar2);
        t3Var.v4();
        if (z11) {
            c51Var.O(false);
            g2 g2Var4 = t3Var.R3;
            if (g2Var4 != null) {
                g2Var4.h();
            }
            t3Var.post(new n2(t3Var, aVar2, 29));
            return;
        }
        if (z12 && (text = (editText = ((a6) C1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
            editText.i2 = z10;
            text.delete(length, text.length());
            editText.i2 = false;
        }
        c51Var.T();
        t3Var.s4(i11);
        int indexOf2 = arrayList.indexOf(aVar2);
        if (indexOf2 < 0) {
            c51Var.f();
        } else {
            v4.n0 itemAnimator = t3Var.getItemAnimator();
            t3Var.setItemAnimator(null);
            c51Var.i(indexOf2);
            if (aVar.d > 0 && (i7 = indexOf2 + 1) < arrayList.size()) {
                c51Var.k(i7, (arrayList.size() - indexOf2) - 1);
            }
            t3Var.post(new x2(t3Var, itemAnimator, 0));
        }
        g2 g2Var5 = t3Var.R3;
        if (g2Var5 != null) {
            g2Var5.h();
        }
        t3Var.post(new y2(t3Var, aVar2, 0));
    }
}
