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
import org.telegram.ui.Components.j61;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class y5 implements h1 {
    public final /* synthetic */ e6 a;

    public y5(e6 e6Var) {
        this.a = e6Var;
    }

    @Override // ii.h1
    public final void B(i1 i1Var, int i10, int i11) {
        b6 b6Var;
        q9 textSelectionHelper;
        e6 e6Var = this.a;
        if (e6Var.F || i10 == i11 || (b6Var = e6Var.y) == null || (textSelectionHelper = ((f3) b6Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        e6Var.post(new ei.x4(this, i1Var, i11, textSelectionHelper, i10, 5));
    }

    @Override // ii.h1
    public final void K(CharSequence charSequence) {
        b6 b6Var = this.a.y;
        if (b6Var != null) {
            f3 f3Var = (f3) b6Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            f3Var.a.t4(charSequence.toString());
        }
    }

    @Override // ii.h1
    public final void U(Editable editable) {
        a aVar;
        e6 e6Var = this.a;
        if (e6Var.x == null) {
            return;
        }
        e6Var.E(editable);
        e6Var.J();
        e6.d(e6Var.x.b, editable);
        e6Var.C();
        e6Var.G();
        int i10 = 0;
        if (e6Var.o() && !e6Var.l()) {
            ((TL_iv.pageBlockBlockquote) e6Var.x.b).collapsed = false;
        }
        e6Var.H();
        b6 b6Var = e6Var.y;
        if (b6Var != null) {
            x3 x3Var = ((f3) b6Var).a;
            i2 i2Var = x3Var.J3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.h3.onContentChanged();
        }
        b6 b6Var2 = e6Var.y;
        if (b6Var2 != null) {
            ((f3) b6Var2).a.h3.g(e6Var, e6.b(editable.toString()));
        }
        String obj = editable.toString();
        a aVar2 = e6Var.x;
        if (aVar2 != null && obj != null && aVar2.c == 0 && (aVar2.b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
            i10 = 6;
        }
        if (i10 == 0 || e6Var.y == null) {
            d6 s10 = e6.s(e6Var.x, editable.toString());
            if (s10 != null && e6Var.y != null) {
                e6Var.post(new gg.t(this, e6Var.x, s10, 18));
            }
        } else {
            e6Var.post(new ai.s1(this, e6Var.x, i10, 15));
        }
        if (e6Var.T || ((aVar = e6Var.x) != null && (aVar.b instanceof TL_iv.pageBlockPullquote))) {
            e6Var.invalidate();
        }
    }

    @Override // ii.h1
    public final boolean X(boolean z10) {
        a aVar;
        e6 e6Var = this.a;
        b6 b6Var = e6Var.y;
        if (b6Var == null || (aVar = e6Var.x) == null) {
            return false;
        }
        return ((f3) b6Var).a.W3(aVar, z10);
    }

    @Override // ii.h1
    public final void c(i1 i1Var) {
        b6 b6Var = this.a.y;
        if (b6Var != null) {
            x3 x3Var = ((f3) b6Var).a;
            x3.M1(x3Var, i1Var);
            x3Var.h3.t(i1Var, true);
        }
    }

    @Override // ii.h1
    public final boolean f() {
        e6 e6Var = this.a;
        b6 b6Var = e6Var.y;
        if (b6Var == null || e6Var.x == null) {
            return false;
        }
        return ((f3) b6Var).a.S4();
    }

    @Override // ii.h1
    public final void j(int i10, int i11) {
        i2 i2Var;
        e6 e6Var = this.a;
        b6 b6Var = e6Var.y;
        if (b6Var == null || e6Var.x == null || (i2Var = ((f3) b6Var).a.J3) == null) {
            return;
        }
        i2Var.f(i10, i11);
    }

    @Override // ii.h1
    public final void m(i1 i1Var) {
        int length;
        Spanned spanned;
        boolean z10;
        int i10;
        i1 editText;
        Editable text;
        e6 e6Var = this.a;
        if (e6Var.y == null || e6Var.x == null) {
            return;
        }
        String obj = i1Var.getText().toString();
        ((f3) e6Var.y).a.h3.g(e6Var, null);
        String b10 = e6.b(obj);
        if (b10 != null) {
            ArrayList a2 = o0.a(b10);
            if (!a2.isEmpty()) {
                e6Var.D((o0) a2.get(0));
                return;
            }
        }
        int q6 = e6.q(i1Var.getText().toString());
        if (q6 != 0) {
            ((f3) e6Var.y).c(e6Var.x, q6);
            return;
        }
        d6 r10 = e6.r(e6Var.x, i1Var.getText().toString());
        if (r10 != null) {
            ((f3) e6Var.y).d(e6Var.x, r10.a, r10.b, r10.c, r10.d, r10.e);
            return;
        }
        if ((e6Var.x.b instanceof TL_iv.pageBlockPullquote) && e6Var.f.length() > 0) {
            e6Var.i();
            return;
        }
        b6 b6Var = e6Var.y;
        a aVar = e6Var.x;
        x3 x3Var = ((f3) b6Var).a;
        ArrayList arrayList = x3Var.p4;
        j61 j61Var = x3Var.Y2;
        ArrayList arrayList2 = x3Var.l3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        i2 i2Var = x3Var.J3;
        if (i2Var != null) {
            i2Var.d();
        }
        View z12 = x3Var.z1(aVar);
        boolean z11 = z12 instanceof e6;
        if (z11) {
            i1 editText2 = ((e6) z12).getEditText();
            Spanned text2 = editText2.getText();
            length = editText2.getSelectionEnd();
            spanned = text2;
        } else {
            SpannableStringBuilder A = e6.A(aVar.b);
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
                x3Var.s4();
                j61Var.N(false);
                i2 i2Var2 = x3Var.J3;
                if (i2Var2 != null) {
                    i2Var2.h();
                }
                x3Var.post(new p2(x3Var, aVar, 27));
                return;
            }
            if (aVar.c > 0) {
                x3Var.t2(indexOf);
                x3Var.s4();
                j61Var.N(false);
                i2 i2Var3 = x3Var.J3;
                if (i2Var3 != null) {
                    i2Var3.h();
                }
                x3Var.post(new p2(x3Var, aVar, 28));
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
                x3Var.m3.put(Long.valueOf(a10), richText);
            }
            arrayList4.add(Long.valueOf(a10));
            aVar.b = new TL_iv.pageBlockParagraph();
            z10 = true;
        } else {
            z10 = false;
        }
        e6.d(aVar.b, subSequence);
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        e6.d(pageblockparagraph, subSequence2);
        int i11 = aVar.d;
        if (i11 > 0) {
            i11++;
        }
        a aVar2 = new a(pageblockparagraph, aVar.c, i11);
        aVar2.e = aVar.e;
        aVar2.k.addAll(arrayList4);
        int i12 = indexOf + 1;
        arrayList2.add(i12, aVar2);
        x3Var.s4();
        if (z10) {
            j61Var.N(false);
            i2 i2Var4 = x3Var.J3;
            if (i2Var4 != null) {
                i2Var4.h();
            }
            x3Var.post(new p2(x3Var, aVar2, 29));
            return;
        }
        if (z11 && (text = (editText = ((e6) z12).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
            editText.h = true;
            text.delete(length, text.length());
            editText.h = false;
        }
        j61Var.S();
        x3Var.p4(i12);
        int indexOf2 = arrayList.indexOf(aVar2);
        if (indexOf2 < 0) {
            j61Var.l();
        } else {
            s4.m0 itemAnimator = x3Var.getItemAnimator();
            x3Var.setItemAnimator(null);
            j61Var.o(indexOf2);
            if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                j61Var.q(i10, (arrayList.size() - indexOf2) - 1);
            }
            x3Var.post(new z2(x3Var, itemAnimator, 0));
        }
        i2 i2Var5 = x3Var.J3;
        if (i2Var5 != null) {
            i2Var5.h();
        }
        x3Var.post(new a3(x3Var, aVar2, 0));
    }

    @Override // ii.h1
    public final boolean p(i1 i1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        e6 e6Var = this.a;
        b6 b6Var = e6Var.y;
        if (b6Var != null && (aVar = e6Var.x) != null) {
            x3 x3Var = ((f3) b6Var).a;
            ClipboardManager clipboardManager = (ClipboardManager) x3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList w42 = x3Var.w4(e4.z(htmlText, hashMap));
                            if (!w42.isEmpty() && ((w42.size() != 1 || !x3.F3((a) w42.get(0))) && (indexOf = x3Var.l3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(i1Var.getSelectionStart(), i1Var.getSelectionEnd()));
                                boolean I4 = x3Var.I4(indexOf, indexOf, max, Math.max(max, Math.max(i1Var.getSelectionStart(), i1Var.getSelectionEnd())), w42);
                                if (I4 && !hashMap.isEmpty()) {
                                    x3Var.m3.putAll(hashMap);
                                }
                                return I4;
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
        e6 e6Var = this.a;
        b6 b6Var = e6Var.y;
        if (b6Var == null || (aVar = e6Var.x) == null) {
            return false;
        }
        return x3.Q1(((f3) b6Var).a, aVar, false);
    }

    @Override // ii.h1
    public final void x() {
        a aVar;
        e6 e6Var = this.a;
        b6 b6Var = e6Var.y;
        if (b6Var == null || (aVar = e6Var.x) == null) {
            return;
        }
        x3.Q1(((f3) b6Var).a, aVar, true);
    }
}
