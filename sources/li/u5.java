package li;

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
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class u5 implements f1 {
    public final /* synthetic */ a6 a;

    public u5(a6 a6Var) {
        this.a = a6Var;
    }

    @Override // li.f1
    public final boolean E(g1 g1Var) {
        a aVar;
        a6 a6Var = this.a;
        x5 x5Var = a6Var.D;
        if (x5Var == null || (aVar = a6Var.y) == null) {
            return false;
        }
        return t3.U1(((c3) x5Var).a, aVar, false);
    }

    @Override // li.f1
    public final void F(g1 g1Var) {
        int length;
        Spanned spanned;
        boolean z9;
        boolean z10;
        int i7;
        g1 editText;
        Editable text;
        a6 a6Var = this.a;
        if (a6Var.D == null || a6Var.y == null) {
            return;
        }
        String obj = g1Var.getText().toString();
        ((c3) a6Var.D).a.o3.o(a6Var, null);
        String b10 = a6.b(obj);
        if (b10 != null) {
            ArrayList a10 = l0.a(b10);
            if (!a10.isEmpty()) {
                a6Var.D((l0) a10.get(0));
                return;
            }
        }
        int q10 = a6.q(g1Var.getText().toString());
        if (q10 != 0) {
            ((c3) a6Var.D).c(a6Var.y, q10);
            return;
        }
        z5 r10 = a6.r(g1Var.getText().toString(), a6Var.y);
        if (r10 != null) {
            ((c3) a6Var.D).d(a6Var.y, r10.a, r10.b, r10.c, r10.d, r10.e);
            return;
        }
        if ((a6Var.y.b instanceof TL_iv.pageBlockPullquote) && a6Var.f.length() > 0) {
            a6Var.h();
            return;
        }
        x5 x5Var = a6Var.D;
        a aVar = a6Var.y;
        t3 t3Var = ((c3) x5Var).a;
        ArrayList arrayList = t3Var.w4;
        l41 l41Var = t3Var.f3;
        ArrayList arrayList2 = t3Var.s3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        f2 f2Var = t3Var.Q3;
        if (f2Var != null) {
            f2Var.d();
        }
        View C1 = t3Var.C1(aVar);
        boolean z11 = C1 instanceof a6;
        if (z11) {
            g1 editText2 = ((a6) C1).getEditText();
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
                l41Var.O(false);
                f2 f2Var2 = t3Var.Q3;
                if (f2Var2 != null) {
                    f2Var2.h();
                }
                t3Var.post(new m2(t3Var, aVar, 27));
                return;
            }
            if (aVar.c > 0) {
                t3Var.w2(indexOf);
                t3Var.v4();
                l41Var.O(false);
                f2 f2Var3 = t3Var.Q3;
                if (f2Var3 != null) {
                    f2Var3.h();
                }
                t3Var.post(new m2(t3Var, aVar, 28));
                return;
            }
        }
        CharSequence subSequence = spanned.subSequence(0, length);
        CharSequence subSequence2 = spanned.subSequence(length, spanned.length());
        TL_iv.PageBlock pageBlock = aVar.b;
        ArrayList arrayList4 = aVar.k;
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            long a11 = n0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.b).caption;
            z9 = true;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                t3Var.t3.put(Long.valueOf(a11), richText);
            }
            arrayList4.add(Long.valueOf(a11));
            aVar.b = new TL_iv.pageBlockParagraph();
            z10 = true;
        } else {
            z9 = true;
            z10 = false;
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
        if (z10) {
            l41Var.O(false);
            f2 f2Var4 = t3Var.Q3;
            if (f2Var4 != null) {
                f2Var4.h();
            }
            t3Var.post(new m2(t3Var, aVar2, 29));
            return;
        }
        if (z11 && (text = (editText = ((a6) C1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
            editText.c2 = z9;
            text.delete(length, text.length());
            editText.c2 = false;
        }
        l41Var.T();
        t3Var.s4(i11);
        int indexOf2 = arrayList.indexOf(aVar2);
        if (indexOf2 < 0) {
            l41Var.f();
        } else {
            v4.l0 itemAnimator = t3Var.getItemAnimator();
            t3Var.setItemAnimator(null);
            l41Var.i(indexOf2);
            if (aVar.d > 0 && (i7 = indexOf2 + 1) < arrayList.size()) {
                l41Var.k(i7, (arrayList.size() - indexOf2) - 1);
            }
            t3Var.post(new w2(t3Var, itemAnimator, 0));
        }
        f2 f2Var5 = t3Var.Q3;
        if (f2Var5 != null) {
            f2Var5.h();
        }
        t3Var.post(new x2(t3Var, aVar2, 0));
    }

    @Override // li.f1
    public final void T0(CharSequence charSequence) {
        x5 x5Var = this.a.D;
        if (x5Var != null) {
            c3 c3Var = (c3) x5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            c3Var.a.w4(charSequence.toString());
        }
    }

    @Override // li.f1
    public final void b(g1 g1Var) {
        x5 x5Var = this.a.D;
        if (x5Var != null) {
            t3 t3Var = ((c3) x5Var).a;
            t3.Q1(t3Var, g1Var);
            t3Var.o3.r(g1Var, true);
        }
    }

    @Override // li.f1
    public final void f1(Editable editable) {
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
        x5 x5Var = a6Var.D;
        if (x5Var != null) {
            t3 t3Var = ((c3) x5Var).a;
            f2 f2Var = t3Var.Q3;
            if (f2Var != null) {
                f2Var.g();
            }
            t3Var.o3.onContentChanged();
        }
        x5 x5Var2 = a6Var.D;
        if (x5Var2 != null) {
            ((c3) x5Var2).a.o3.o(a6Var, a6.b(editable.toString()));
        }
        String obj = editable.toString();
        a aVar2 = a6Var.y;
        if (aVar2 != null && obj != null && aVar2.c == 0 && (aVar2.b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
            i7 = 6;
        }
        if (i7 == 0 || a6Var.D == null) {
            z5 s5 = a6.s(editable.toString(), a6Var.y);
            if (s5 != null && a6Var.D != null) {
                a6Var.post(new l2.z0(this, a6Var.y, s5, 6));
            }
        } else {
            a6Var.post(new ai.e0(this, a6Var.y, i7, 21));
        }
        if (a6Var.V || ((aVar = a6Var.y) != null && (aVar.b instanceof TL_iv.pageBlockPullquote))) {
            a6Var.invalidate();
        }
    }

    @Override // li.f1
    public final void l0(g1 g1Var, int i7, int i10) {
        x5 x5Var;
        i9 textSelectionHelper;
        a6 a6Var = this.a;
        if (a6Var.F || i7 == i10 || (x5Var = a6Var.D) == null || (textSelectionHelper = ((c3) x5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        a6Var.post(new hi.j4(this, g1Var, i10, textSelectionHelper, i7, 5));
    }

    @Override // li.f1
    public final boolean l1(boolean z9) {
        a aVar;
        a6 a6Var = this.a;
        x5 x5Var = a6Var.D;
        if (x5Var == null || (aVar = a6Var.y) == null) {
            return false;
        }
        return ((c3) x5Var).a.Z3(aVar, z9);
    }

    @Override // li.f1
    public final boolean m() {
        a6 a6Var = this.a;
        x5 x5Var = a6Var.D;
        if (x5Var == null || a6Var.y == null) {
            return false;
        }
        return ((c3) x5Var).a.V4();
    }

    @Override // li.f1
    public final void r0() {
        a aVar;
        a6 a6Var = this.a;
        x5 x5Var = a6Var.D;
        if (x5Var == null || (aVar = a6Var.y) == null) {
            return;
        }
        t3.U1(((c3) x5Var).a, aVar, true);
    }

    @Override // li.f1
    public final boolean s(g1 g1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        a6 a6Var = this.a;
        x5 x5Var = a6Var.D;
        if (x5Var != null && (aVar = a6Var.y) != null) {
            t3 t3Var = ((c3) x5Var).a;
            ClipboardManager clipboardManager = (ClipboardManager) t3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList z42 = t3Var.z4(b4.z(htmlText, hashMap));
                            if (!z42.isEmpty() && ((z42.size() != 1 || !t3.I3((a) z42.get(0))) && (indexOf = t3Var.s3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(g1Var.getSelectionStart(), g1Var.getSelectionEnd()));
                                boolean L4 = t3Var.L4(indexOf, indexOf, max, Math.max(max, Math.max(g1Var.getSelectionStart(), g1Var.getSelectionEnd())), z42);
                                if (L4 && !hashMap.isEmpty()) {
                                    t3Var.t3.putAll(hashMap);
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

    @Override // li.f1
    public final void w(int i7, int i10) {
        f2 f2Var;
        a6 a6Var = this.a;
        x5 x5Var = a6Var.D;
        if (x5Var == null || a6Var.y == null || (f2Var = ((c3) x5Var).a.Q3) == null) {
            return;
        }
        f2Var.f(i7, i10);
    }
}
