package bi;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.f8;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.p51;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class k6 implements m1 {
    public final /* synthetic */ q6 a;

    public k6(q6 q6Var) {
        this.a = q6Var;
    }

    @Override // bi.m1
    public final void B(Editable editable) {
        a aVar;
        q6 q6Var = this.a;
        if (q6Var.y == null) {
            return;
        }
        q6Var.E(editable);
        q6Var.K();
        q6.d(q6Var.y.b, editable);
        q6Var.C();
        q6Var.G();
        int i10 = 0;
        if (q6Var.o() && !q6Var.l()) {
            ((TL_iv.pageBlockBlockquote) q6Var.y.b).collapsed = false;
        }
        q6Var.H();
        n6 n6Var = q6Var.D;
        if (n6Var != null) {
            d4 d4Var = ((m3) n6Var).a;
            o2 o2Var = d4Var.Q3;
            if (o2Var != null) {
                o2Var.g();
            }
            d4Var.o3.onContentChanged();
        }
        n6 n6Var2 = q6Var.D;
        if (n6Var2 != null) {
            ((m3) n6Var2).a.o3.D(q6Var, q6.b(editable.toString()));
        }
        String obj = editable.toString();
        a aVar2 = q6Var.y;
        if (aVar2 != null && obj != null && aVar2.c == 0 && (aVar2.b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
            i10 = 6;
        }
        if (i10 == 0 || q6Var.D == null) {
            p6 s10 = q6.s(q6Var.y, editable.toString());
            if (s10 != null && q6Var.D != null) {
                q6Var.post(new a3.l0(this, q6Var.y, s10, 15));
            }
        } else {
            q6Var.post(new ag.o0(this, q6Var.y, i10, 2));
        }
        if (q6Var.V || ((aVar = q6Var.y) != null && (aVar.b instanceof TL_iv.pageBlockPullquote))) {
            q6Var.invalidate();
        }
    }

    @Override // bi.m1
    public final boolean H(boolean z10) {
        a aVar;
        q6 q6Var = this.a;
        n6 n6Var = q6Var.D;
        if (n6Var == null || (aVar = q6Var.y) == null) {
            return false;
        }
        return ((m3) n6Var).a.Z3(aVar, z10);
    }

    @Override // bi.m1
    public final boolean I(n1 n1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        q6 q6Var = this.a;
        n6 n6Var = q6Var.D;
        if (n6Var != null && (aVar = q6Var.y) != null) {
            d4 d4Var = ((m3) n6Var).a;
            ClipboardManager clipboardManager = (ClipboardManager) d4Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList z42 = d4Var.z4(l4.z(htmlText, hashMap));
                            if (!z42.isEmpty() && ((z42.size() != 1 || !d4.I3((a) z42.get(0))) && (indexOf = d4Var.s3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(n1Var.getSelectionStart(), n1Var.getSelectionEnd()));
                                boolean L4 = d4Var.L4(indexOf, indexOf, max, Math.max(max, Math.max(n1Var.getSelectionStart(), n1Var.getSelectionEnd())), z42);
                                if (L4 && !hashMap.isEmpty()) {
                                    d4Var.t3.putAll(hashMap);
                                }
                                return L4;
                            }
                        } catch (Exception e) {
                            f8.g(e, true);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    @Override // bi.m1
    public final void b(n1 n1Var) {
        n6 n6Var = this.a.D;
        if (n6Var != null) {
            d4 d4Var = ((m3) n6Var).a;
            d4.P1(d4Var, n1Var);
            d4Var.o3.h(n1Var, true);
        }
    }

    @Override // bi.m1
    public final void e(n1 n1Var) {
        int length;
        Spanned spanned;
        boolean z10;
        boolean z11;
        int i10;
        n1 editText;
        Editable text;
        q6 q6Var = this.a;
        if (q6Var.D == null || q6Var.y == null) {
            return;
        }
        String obj = n1Var.getText().toString();
        ((m3) q6Var.D).a.o3.D(q6Var, null);
        String b10 = q6.b(obj);
        if (b10 != null) {
            ArrayList a2 = p0.a(b10);
            if (!a2.isEmpty()) {
                q6Var.D((p0) a2.get(0));
                return;
            }
        }
        int q6 = q6.q(n1Var.getText().toString());
        if (q6 != 0) {
            ((m3) q6Var.D).c(q6Var.y, q6);
            return;
        }
        p6 r10 = q6.r(q6Var.y, n1Var.getText().toString());
        if (r10 != null) {
            ((m3) q6Var.D).d(q6Var.y, r10.a, r10.b, r10.c, r10.d, r10.e);
            return;
        }
        if ((q6Var.y.b instanceof TL_iv.pageBlockPullquote) && q6Var.f.length() > 0) {
            q6Var.i();
            return;
        }
        n6 n6Var = q6Var.D;
        a aVar = q6Var.y;
        d4 d4Var = ((m3) n6Var).a;
        ArrayList arrayList = d4Var.w4;
        p51 p51Var = d4Var.f3;
        ArrayList arrayList2 = d4Var.s3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        o2 o2Var = d4Var.Q3;
        if (o2Var != null) {
            o2Var.d();
        }
        View C1 = d4Var.C1(aVar);
        boolean z12 = C1 instanceof q6;
        if (z12) {
            n1 editText2 = ((q6) C1).getEditText();
            Spanned text2 = editText2.getText();
            length = editText2.getSelectionEnd();
            spanned = text2;
        } else {
            SpannableStringBuilder A = q6.A(aVar.b);
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
                d4Var.v4();
                p51Var.O(false);
                o2 o2Var2 = d4Var.Q3;
                if (o2Var2 != null) {
                    o2Var2.h();
                }
                d4Var.post(new v2(d4Var, aVar, 27));
                return;
            }
            if (aVar.c > 0) {
                d4Var.w2(indexOf);
                d4Var.v4();
                p51Var.O(false);
                o2 o2Var3 = d4Var.Q3;
                if (o2Var3 != null) {
                    o2Var3.h();
                }
                d4Var.post(new v2(d4Var, aVar, 28));
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
            z10 = true;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                d4Var.t3.put(Long.valueOf(a10), richText);
            }
            arrayList4.add(Long.valueOf(a10));
            aVar.b = new TL_iv.pageBlockParagraph();
            z11 = true;
        } else {
            z10 = true;
            z11 = false;
        }
        q6.d(aVar.b, subSequence);
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        q6.d(pageblockparagraph, subSequence2);
        int i11 = aVar.d;
        if (i11 > 0) {
            i11++;
        }
        a aVar2 = new a(pageblockparagraph, aVar.c, i11);
        aVar2.e = aVar.e;
        aVar2.k.addAll(arrayList4);
        int i12 = indexOf + 1;
        arrayList2.add(i12, aVar2);
        d4Var.v4();
        if (z11) {
            p51Var.O(false);
            o2 o2Var4 = d4Var.Q3;
            if (o2Var4 != null) {
                o2Var4.h();
            }
            d4Var.post(new v2(d4Var, aVar2, 29));
            return;
        }
        if (z12 && (text = (editText = ((q6) C1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
            editText.c2 = z10;
            text.delete(length, text.length());
            editText.c2 = false;
        }
        p51Var.T();
        d4Var.s4(i12);
        int indexOf2 = arrayList.indexOf(aVar2);
        if (indexOf2 < 0) {
            p51Var.f();
        } else {
            s4.l0 itemAnimator = d4Var.getItemAnimator();
            d4Var.setItemAnimator(null);
            p51Var.i(indexOf2);
            if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                p51Var.k(i10, (arrayList.size() - indexOf2) - 1);
            }
            d4Var.post(new g3(d4Var, itemAnimator, 0));
        }
        o2 o2Var5 = d4Var.Q3;
        if (o2Var5 != null) {
            o2Var5.h();
        }
        d4Var.post(new h3(d4Var, aVar2, 0));
    }

    @Override // bi.m1
    public final boolean f() {
        q6 q6Var = this.a;
        n6 n6Var = q6Var.D;
        if (n6Var == null || q6Var.y == null) {
            return false;
        }
        return ((m3) n6Var).a.V4();
    }

    @Override // bi.m1
    public final void h(int i10, int i11) {
        o2 o2Var;
        q6 q6Var = this.a;
        n6 n6Var = q6Var.D;
        if (n6Var == null || q6Var.y == null || (o2Var = ((m3) n6Var).a.Q3) == null) {
            return;
        }
        o2Var.f(i10, i11);
    }

    @Override // bi.m1
    public final void i(n1 n1Var, int i10, int i11) {
        n6 n6Var;
        k9 textSelectionHelper;
        q6 q6Var = this.a;
        if (q6Var.F || i10 == i11 || (n6Var = q6Var.D) == null || (textSelectionHelper = ((m3) n6Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        q6Var.post(new u0(this, n1Var, i11, textSelectionHelper, i10, 3));
    }

    @Override // bi.m1
    public final void r() {
        a aVar;
        q6 q6Var = this.a;
        n6 n6Var = q6Var.D;
        if (n6Var == null || (aVar = q6Var.y) == null) {
            return;
        }
        d4.T1(((m3) n6Var).a, aVar, true);
    }

    @Override // bi.m1
    public final void w(CharSequence charSequence) {
        n6 n6Var = this.a.D;
        if (n6Var != null) {
            m3 m3Var = (m3) n6Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            m3Var.a.w4(charSequence.toString());
        }
    }

    @Override // bi.m1
    public final boolean x(n1 n1Var) {
        a aVar;
        q6 q6Var = this.a;
        n6 n6Var = q6Var.D;
        if (n6Var == null || (aVar = q6Var.y) == null) {
            return false;
        }
        return d4.T1(((m3) n6Var).a, aVar, false);
    }
}
