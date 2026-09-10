package hi;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.j61;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class a6 implements j1 {
    public final /* synthetic */ g6 a;

    public a6(g6 g6Var) {
        this.a = g6Var;
    }

    @Override // hi.j1
    public final void D(CharSequence charSequence) {
        d6 d6Var = this.a.y;
        if (d6Var != null) {
            h3 h3Var = (h3) d6Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            h3Var.a.s4(charSequence.toString());
        }
    }

    @Override // hi.j1
    public final boolean F(k1 k1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        g6 g6Var = this.a;
        d6 d6Var = g6Var.y;
        if (d6Var != null && (aVar = g6Var.x) != null) {
            z3 z3Var = ((h3) d6Var).a;
            ClipboardManager clipboardManager = (ClipboardManager) z3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList v42 = z3Var.v4(g4.z(htmlText, hashMap));
                            if (!v42.isEmpty() && ((v42.size() != 1 || !z3.E3((a) v42.get(0))) && (indexOf = z3Var.l3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(k1Var.getSelectionStart(), k1Var.getSelectionEnd()));
                                boolean H4 = z3Var.H4(indexOf, indexOf, max, Math.max(max, Math.max(k1Var.getSelectionStart(), k1Var.getSelectionEnd())), v42);
                                if (H4 && !hashMap.isEmpty()) {
                                    z3Var.m3.putAll(hashMap);
                                }
                                return H4;
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    @Override // hi.j1
    public final void G(Editable editable) {
        a aVar;
        g6 g6Var = this.a;
        if (g6Var.x == null) {
            return;
        }
        g6Var.E(editable);
        g6Var.J();
        g6.d(g6Var.x.b, editable);
        g6Var.C();
        g6Var.G();
        int i10 = 0;
        if (g6Var.o() && !g6Var.l()) {
            ((TL_iv.pageBlockBlockquote) g6Var.x.b).collapsed = false;
        }
        g6Var.H();
        d6 d6Var = g6Var.y;
        if (d6Var != null) {
            z3 z3Var = ((h3) d6Var).a;
            k2 k2Var = z3Var.J3;
            if (k2Var != null) {
                k2Var.g();
            }
            z3Var.h3.onContentChanged();
        }
        d6 d6Var2 = g6Var.y;
        if (d6Var2 != null) {
            ((h3) d6Var2).a.h3.h(g6Var, g6.b(editable.toString()));
        }
        String obj = editable.toString();
        a aVar2 = g6Var.x;
        if (aVar2 != null && obj != null && aVar2.c == 0 && (aVar2.b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
            i10 = 6;
        }
        if (i10 == 0 || g6Var.y == null) {
            f6 s10 = g6.s(g6Var.x, editable.toString());
            if (s10 != null && g6Var.y != null) {
                g6Var.post(new gg.a0(this, g6Var.x, s10, 8));
            }
        } else {
            g6Var.post(new bi.g3(this, g6Var.x, i10, 11));
        }
        if (g6Var.T || ((aVar = g6Var.x) != null && (aVar.b instanceof TL_iv.pageBlockPullquote))) {
            g6Var.invalidate();
        }
    }

    @Override // hi.j1
    public final boolean H(boolean z10) {
        a aVar;
        g6 g6Var = this.a;
        d6 d6Var = g6Var.y;
        if (d6Var == null || (aVar = g6Var.x) == null) {
            return false;
        }
        return ((h3) d6Var).a.V3(aVar, z10);
    }

    @Override // hi.j1
    public final boolean P(k1 k1Var) {
        a aVar;
        g6 g6Var = this.a;
        d6 d6Var = g6Var.y;
        if (d6Var == null || (aVar = g6Var.x) == null) {
            return false;
        }
        return z3.P1(((h3) d6Var).a, aVar, false);
    }

    @Override // hi.j1
    public final void b(k1 k1Var) {
        d6 d6Var = this.a.y;
        if (d6Var != null) {
            z3 z3Var = ((h3) d6Var).a;
            z3.L1(z3Var, k1Var);
            z3Var.h3.C(k1Var, true);
        }
    }

    @Override // hi.j1
    public final boolean f() {
        g6 g6Var = this.a;
        d6 d6Var = g6Var.y;
        if (d6Var == null || g6Var.x == null) {
            return false;
        }
        return ((h3) d6Var).a.R4();
    }

    @Override // hi.j1
    public final void h(int i10, int i11) {
        k2 k2Var;
        g6 g6Var = this.a;
        d6 d6Var = g6Var.y;
        if (d6Var == null || g6Var.x == null || (k2Var = ((h3) d6Var).a.J3) == null) {
            return;
        }
        k2Var.f(i10, i11);
    }

    @Override // hi.j1
    public final void r(k1 k1Var, int i10, int i11) {
        d6 d6Var;
        s9 textSelectionHelper;
        g6 g6Var = this.a;
        if (g6Var.F || i10 == i11 || (d6Var = g6Var.y) == null || (textSelectionHelper = ((h3) d6Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        g6Var.post(new di.b5(this, k1Var, i11, textSelectionHelper, i10, 5));
    }

    @Override // hi.j1
    public final void t() {
        a aVar;
        g6 g6Var = this.a;
        d6 d6Var = g6Var.y;
        if (d6Var == null || (aVar = g6Var.x) == null) {
            return;
        }
        z3.P1(((h3) d6Var).a, aVar, true);
    }

    @Override // hi.j1
    public final void x(k1 k1Var) {
        int length;
        Spanned spanned;
        boolean z10;
        int i10;
        k1 editText;
        Editable text;
        g6 g6Var = this.a;
        if (g6Var.y == null || g6Var.x == null) {
            return;
        }
        String obj = k1Var.getText().toString();
        ((h3) g6Var.y).a.h3.h(g6Var, null);
        String b10 = g6.b(obj);
        if (b10 != null) {
            ArrayList a2 = p0.a(b10);
            if (!a2.isEmpty()) {
                g6Var.D((p0) a2.get(0));
                return;
            }
        }
        int q6 = g6.q(k1Var.getText().toString());
        if (q6 != 0) {
            ((h3) g6Var.y).c(g6Var.x, q6);
            return;
        }
        f6 r10 = g6.r(g6Var.x, k1Var.getText().toString());
        if (r10 != null) {
            ((h3) g6Var.y).d(g6Var.x, r10.a, r10.b, r10.c, r10.d, r10.e);
            return;
        }
        if ((g6Var.x.b instanceof TL_iv.pageBlockPullquote) && g6Var.f.length() > 0) {
            g6Var.i();
            return;
        }
        d6 d6Var = g6Var.y;
        a aVar = g6Var.x;
        z3 z3Var = ((h3) d6Var).a;
        ArrayList arrayList = z3Var.p4;
        j61 j61Var = z3Var.Y2;
        ArrayList arrayList2 = z3Var.l3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        k2 k2Var = z3Var.J3;
        if (k2Var != null) {
            k2Var.d();
        }
        View y12 = z3Var.y1(aVar);
        boolean z11 = y12 instanceof g6;
        if (z11) {
            k1 editText2 = ((g6) y12).getEditText();
            Spanned text2 = editText2.getText();
            length = editText2.getSelectionEnd();
            spanned = text2;
        } else {
            SpannableStringBuilder A = g6.A(aVar.b);
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
                z3Var.r4();
                j61Var.N(false);
                k2 k2Var2 = z3Var.J3;
                if (k2Var2 != null) {
                    k2Var2.h();
                }
                z3Var.post(new r2(z3Var, aVar, 27));
                return;
            }
            if (aVar.c > 0) {
                z3Var.s2(indexOf);
                z3Var.r4();
                j61Var.N(false);
                k2 k2Var3 = z3Var.J3;
                if (k2Var3 != null) {
                    k2Var3.h();
                }
                z3Var.post(new r2(z3Var, aVar, 28));
                return;
            }
        }
        CharSequence subSequence = spanned.subSequence(0, length);
        CharSequence subSequence2 = spanned.subSequence(length, spanned.length());
        TL_iv.PageBlock pageBlock = aVar.b;
        ArrayList arrayList4 = aVar.k;
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            long a10 = r0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                z3Var.m3.put(Long.valueOf(a10), richText);
            }
            arrayList4.add(Long.valueOf(a10));
            aVar.b = new TL_iv.pageBlockParagraph();
            z10 = true;
        } else {
            z10 = false;
        }
        g6.d(aVar.b, subSequence);
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        g6.d(pageblockparagraph, subSequence2);
        int i11 = aVar.d;
        if (i11 > 0) {
            i11++;
        }
        a aVar2 = new a(pageblockparagraph, aVar.c, i11);
        aVar2.e = aVar.e;
        aVar2.k.addAll(arrayList4);
        int i12 = indexOf + 1;
        arrayList2.add(i12, aVar2);
        z3Var.r4();
        if (z10) {
            j61Var.N(false);
            k2 k2Var4 = z3Var.J3;
            if (k2Var4 != null) {
                k2Var4.h();
            }
            z3Var.post(new r2(z3Var, aVar2, 29));
            return;
        }
        if (z11 && (text = (editText = ((g6) y12).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
            editText.h = true;
            text.delete(length, text.length());
            editText.h = false;
        }
        j61Var.S();
        z3Var.o4(i12);
        int indexOf2 = arrayList.indexOf(aVar2);
        if (indexOf2 < 0) {
            j61Var.l();
        } else {
            s4.m0 itemAnimator = z3Var.getItemAnimator();
            z3Var.setItemAnimator(null);
            j61Var.o(indexOf2);
            if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                j61Var.q(i10, (arrayList.size() - indexOf2) - 1);
            }
            z3Var.post(new b3(z3Var, itemAnimator, 0));
        }
        k2 k2Var5 = z3Var.J3;
        if (k2Var5 != null) {
            k2Var5.h();
        }
        z3Var.post(new c3(z3Var, aVar2, 0));
    }
}
