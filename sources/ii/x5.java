package ii;

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
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.l61;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class x5 implements h1 {
    public final /* synthetic */ d6 a;

    public x5(d6 d6Var) {
        this.a = d6Var;
    }

    @Override // ii.h1
    public final void B(i1 i1Var, int i10, int i11) {
        a6 a6Var;
        q9 textSelectionHelper;
        d6 d6Var = this.a;
        if (d6Var.F || i10 == i11 || (a6Var = d6Var.y) == null || (textSelectionHelper = ((e3) a6Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        d6Var.post(new ei.x4(this, i1Var, i11, textSelectionHelper, i10, 5));
    }

    @Override // ii.h1
    public final void K(CharSequence charSequence) {
        a6 a6Var = this.a.y;
        if (a6Var != null) {
            e3 e3Var = (e3) a6Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            e3Var.a.u4(charSequence.toString());
        }
    }

    @Override // ii.h1
    public final void U(Editable editable) {
        a aVar;
        d6 d6Var = this.a;
        if (d6Var.x == null) {
            return;
        }
        d6Var.E(editable);
        d6Var.J();
        d6.d(d6Var.x.b, editable);
        d6Var.C();
        d6Var.G();
        int i10 = 0;
        if (d6Var.o() && !d6Var.l()) {
            ((TL_iv.pageBlockBlockquote) d6Var.x.b).collapsed = false;
        }
        d6Var.H();
        a6 a6Var = d6Var.y;
        if (a6Var != null) {
            w3 w3Var = ((e3) a6Var).a;
            h2 h2Var = w3Var.J3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.h3.onContentChanged();
        }
        a6 a6Var2 = d6Var.y;
        if (a6Var2 != null) {
            ((e3) a6Var2).a.h3.g(d6Var, d6.b(editable.toString()));
        }
        String obj = editable.toString();
        a aVar2 = d6Var.x;
        if (aVar2 != null && obj != null && aVar2.c == 0 && (aVar2.b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
            i10 = 6;
        }
        if (i10 == 0 || d6Var.y == null) {
            c6 s10 = d6.s(d6Var.x, editable.toString());
            if (s10 != null && d6Var.y != null) {
                d6Var.post(new gg.t(this, d6Var.x, s10, 18));
            }
        } else {
            d6Var.post(new ai.s1(this, d6Var.x, i10, 15));
        }
        if (d6Var.T || ((aVar = d6Var.x) != null && (aVar.b instanceof TL_iv.pageBlockPullquote))) {
            d6Var.invalidate();
        }
    }

    @Override // ii.h1
    public final boolean X(boolean z10) {
        a aVar;
        d6 d6Var = this.a;
        a6 a6Var = d6Var.y;
        if (a6Var == null || (aVar = d6Var.x) == null) {
            return false;
        }
        return ((e3) a6Var).a.X3(aVar, z10);
    }

    @Override // ii.h1
    public final void c(i1 i1Var) {
        a6 a6Var = this.a.y;
        if (a6Var != null) {
            w3 w3Var = ((e3) a6Var).a;
            w3.N1(w3Var, i1Var);
            w3Var.h3.t(i1Var, true);
        }
    }

    @Override // ii.h1
    public final boolean f() {
        d6 d6Var = this.a;
        a6 a6Var = d6Var.y;
        if (a6Var == null || d6Var.x == null) {
            return false;
        }
        return ((e3) a6Var).a.T4();
    }

    @Override // ii.h1
    public final void j(int i10, int i11) {
        h2 h2Var;
        d6 d6Var = this.a;
        a6 a6Var = d6Var.y;
        if (a6Var == null || d6Var.x == null || (h2Var = ((e3) a6Var).a.J3) == null) {
            return;
        }
        h2Var.f(i10, i11);
    }

    @Override // ii.h1
    public final void m(i1 i1Var) {
        int length;
        Spanned spanned;
        boolean z10;
        int i10;
        i1 editText;
        Editable text;
        d6 d6Var = this.a;
        if (d6Var.y == null || d6Var.x == null) {
            return;
        }
        String obj = i1Var.getText().toString();
        ((e3) d6Var.y).a.h3.g(d6Var, null);
        String b10 = d6.b(obj);
        if (b10 != null) {
            ArrayList a2 = o0.a(b10);
            if (!a2.isEmpty()) {
                d6Var.D((o0) a2.get(0));
                return;
            }
        }
        int q6 = d6.q(i1Var.getText().toString());
        if (q6 != 0) {
            ((e3) d6Var.y).c(d6Var.x, q6);
            return;
        }
        c6 r10 = d6.r(d6Var.x, i1Var.getText().toString());
        if (r10 != null) {
            ((e3) d6Var.y).d(d6Var.x, r10.a, r10.b, r10.c, r10.d, r10.e);
            return;
        }
        if ((d6Var.x.b instanceof TL_iv.pageBlockPullquote) && d6Var.f.length() > 0) {
            d6Var.i();
            return;
        }
        a6 a6Var = d6Var.y;
        a aVar = d6Var.x;
        w3 w3Var = ((e3) a6Var).a;
        ArrayList arrayList = w3Var.p4;
        l61 l61Var = w3Var.Y2;
        ArrayList arrayList2 = w3Var.l3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        h2 h2Var = w3Var.J3;
        if (h2Var != null) {
            h2Var.d();
        }
        View A1 = w3Var.A1(aVar);
        boolean z11 = A1 instanceof d6;
        if (z11) {
            i1 editText2 = ((d6) A1).getEditText();
            Spanned text2 = editText2.getText();
            length = editText2.getSelectionEnd();
            spanned = text2;
        } else {
            SpannableStringBuilder A = d6.A(aVar.b);
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
                w3Var.t4();
                l61Var.N(false);
                h2 h2Var2 = w3Var.J3;
                if (h2Var2 != null) {
                    h2Var2.h();
                }
                w3Var.post(new o2(w3Var, aVar, 27));
                return;
            }
            if (aVar.c > 0) {
                w3Var.u2(indexOf);
                w3Var.t4();
                l61Var.N(false);
                h2 h2Var3 = w3Var.J3;
                if (h2Var3 != null) {
                    h2Var3.h();
                }
                w3Var.post(new o2(w3Var, aVar, 28));
                return;
            }
        }
        CharSequence subSequence = spanned.subSequence(0, length);
        CharSequence subSequence2 = spanned.subSequence(length, spanned.length());
        TL_iv.PageBlock pageBlock = aVar.b;
        ArrayList arrayList4 = aVar.k;
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            long a10 = q0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                w3Var.m3.put(Long.valueOf(a10), richText);
            }
            arrayList4.add(Long.valueOf(a10));
            aVar.b = new TL_iv.pageBlockParagraph();
            z10 = true;
        } else {
            z10 = false;
        }
        d6.d(aVar.b, subSequence);
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        d6.d(pageblockparagraph, subSequence2);
        int i11 = aVar.d;
        if (i11 > 0) {
            i11++;
        }
        a aVar2 = new a(pageblockparagraph, aVar.c, i11);
        aVar2.e = aVar.e;
        aVar2.k.addAll(arrayList4);
        int i12 = indexOf + 1;
        arrayList2.add(i12, aVar2);
        w3Var.t4();
        if (z10) {
            l61Var.N(false);
            h2 h2Var4 = w3Var.J3;
            if (h2Var4 != null) {
                h2Var4.h();
            }
            w3Var.post(new o2(w3Var, aVar2, 29));
            return;
        }
        if (z11 && (text = (editText = ((d6) A1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
            editText.h = true;
            text.delete(length, text.length());
            editText.h = false;
        }
        l61Var.S();
        w3Var.q4(i12);
        int indexOf2 = arrayList.indexOf(aVar2);
        if (indexOf2 < 0) {
            l61Var.l();
        } else {
            s4.m0 itemAnimator = w3Var.getItemAnimator();
            w3Var.setItemAnimator(null);
            l61Var.o(indexOf2);
            if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                l61Var.q(i10, (arrayList.size() - indexOf2) - 1);
            }
            w3Var.post(new y2(w3Var, itemAnimator, 0));
        }
        h2 h2Var5 = w3Var.J3;
        if (h2Var5 != null) {
            h2Var5.h();
        }
        w3Var.post(new z2(w3Var, aVar2, 0));
    }

    @Override // ii.h1
    public final boolean p(i1 i1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        d6 d6Var = this.a;
        a6 a6Var = d6Var.y;
        if (a6Var != null && (aVar = d6Var.x) != null) {
            w3 w3Var = ((e3) a6Var).a;
            ClipboardManager clipboardManager = (ClipboardManager) w3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList x42 = w3Var.x4(d4.z(htmlText, hashMap));
                            if (!x42.isEmpty() && ((x42.size() != 1 || !w3.G3((a) x42.get(0))) && (indexOf = w3Var.l3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(i1Var.getSelectionStart(), i1Var.getSelectionEnd()));
                                boolean J4 = w3Var.J4(indexOf, indexOf, max, Math.max(max, Math.max(i1Var.getSelectionStart(), i1Var.getSelectionEnd())), x42);
                                if (J4 && !hashMap.isEmpty()) {
                                    w3Var.m3.putAll(hashMap);
                                }
                                return J4;
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

    @Override // ii.h1
    public final boolean t(i1 i1Var) {
        a aVar;
        d6 d6Var = this.a;
        a6 a6Var = d6Var.y;
        if (a6Var == null || (aVar = d6Var.x) == null) {
            return false;
        }
        return w3.R1(((e3) a6Var).a, aVar, false);
    }

    @Override // ii.h1
    public final void x() {
        a aVar;
        d6 d6Var = this.a;
        a6 a6Var = d6Var.y;
        if (a6Var == null || (aVar = d6Var.x) == null) {
            return;
        }
        w3.R1(((e3) a6Var).a, aVar, true);
    }
}
