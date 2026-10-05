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
import org.telegram.ui.Components.w61;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class z5 implements h1 {
    public final /* synthetic */ f6 a;

    public z5(f6 f6Var) {
        this.a = f6Var;
    }

    @Override // ii.h1
    public final void B(Editable editable) {
        a aVar;
        f6 f6Var = this.a;
        if (f6Var.x == null) {
            return;
        }
        f6Var.E(editable);
        f6Var.J();
        f6.d(f6Var.x.b, editable);
        f6Var.C();
        f6Var.G();
        int i10 = 0;
        if (f6Var.o() && !f6Var.l()) {
            ((TL_iv.pageBlockBlockquote) f6Var.x.b).collapsed = false;
        }
        f6Var.H();
        c6 c6Var = f6Var.y;
        if (c6Var != null) {
            x3 x3Var = ((f3) c6Var).a;
            i2 i2Var = x3Var.Q3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.o3.onContentChanged();
        }
        c6 c6Var2 = f6Var.y;
        if (c6Var2 != null) {
            ((f3) c6Var2).a.o3.o(f6Var, f6.b(editable.toString()));
        }
        String obj = editable.toString();
        a aVar2 = f6Var.x;
        if (aVar2 != null && obj != null && aVar2.c == 0 && (aVar2.b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
            i10 = 6;
        }
        if (i10 == 0 || f6Var.y == null) {
            e6 s10 = f6.s(f6Var.x, editable.toString());
            if (s10 != null && f6Var.y != null) {
                f6Var.post(new gg.t(this, f6Var.x, s10, 18));
            }
        } else {
            f6Var.post(new ai.s1(this, f6Var.x, i10, 15));
        }
        if (f6Var.T || ((aVar = f6Var.x) != null && (aVar.b instanceof TL_iv.pageBlockPullquote))) {
            f6Var.invalidate();
        }
    }

    @Override // ii.h1
    public final boolean C(boolean z10) {
        a aVar;
        f6 f6Var = this.a;
        c6 c6Var = f6Var.y;
        if (c6Var == null || (aVar = f6Var.x) == null) {
            return false;
        }
        return ((f3) c6Var).a.X3(aVar, z10);
    }

    @Override // ii.h1
    public final void b(i1 i1Var) {
        c6 c6Var = this.a.y;
        if (c6Var != null) {
            x3 x3Var = ((f3) c6Var).a;
            x3.N1(x3Var, i1Var);
            x3Var.o3.P(i1Var, true);
        }
    }

    @Override // ii.h1
    public final boolean e() {
        f6 f6Var = this.a;
        c6 c6Var = f6Var.y;
        if (c6Var == null || f6Var.x == null) {
            return false;
        }
        return ((f3) c6Var).a.T4();
    }

    @Override // ii.h1
    public final void f(int i10, int i11) {
        i2 i2Var;
        f6 f6Var = this.a;
        c6 c6Var = f6Var.y;
        if (c6Var == null || f6Var.x == null || (i2Var = ((f3) c6Var).a.Q3) == null) {
            return;
        }
        i2Var.f(i10, i11);
    }

    @Override // ii.h1
    public final void l(i1 i1Var) {
        int length;
        Spanned spanned;
        boolean z10;
        int i10;
        i1 editText;
        Editable text;
        f6 f6Var = this.a;
        if (f6Var.y == null || f6Var.x == null) {
            return;
        }
        String obj = i1Var.getText().toString();
        ((f3) f6Var.y).a.o3.o(f6Var, null);
        String b10 = f6.b(obj);
        if (b10 != null) {
            ArrayList a2 = o0.a(b10);
            if (!a2.isEmpty()) {
                f6Var.D((o0) a2.get(0));
                return;
            }
        }
        int q6 = f6.q(i1Var.getText().toString());
        if (q6 != 0) {
            ((f3) f6Var.y).c(f6Var.x, q6);
            return;
        }
        e6 r10 = f6.r(f6Var.x, i1Var.getText().toString());
        if (r10 != null) {
            ((f3) f6Var.y).d(f6Var.x, r10.a, r10.b, r10.c, r10.d, r10.e);
            return;
        }
        if ((f6Var.x.b instanceof TL_iv.pageBlockPullquote) && f6Var.f.length() > 0) {
            f6Var.i();
            return;
        }
        c6 c6Var = f6Var.y;
        a aVar = f6Var.x;
        x3 x3Var = ((f3) c6Var).a;
        ArrayList arrayList = x3Var.w4;
        w61 w61Var = x3Var.f3;
        ArrayList arrayList2 = x3Var.s3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        i2 i2Var = x3Var.Q3;
        if (i2Var != null) {
            i2Var.d();
        }
        View A1 = x3Var.A1(aVar);
        boolean z11 = A1 instanceof f6;
        if (z11) {
            i1 editText2 = ((f6) A1).getEditText();
            Spanned text2 = editText2.getText();
            length = editText2.getSelectionEnd();
            spanned = text2;
        } else {
            SpannableStringBuilder A = f6.A(aVar.b);
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
                x3Var.t4();
                w61Var.N(false);
                i2 i2Var2 = x3Var.Q3;
                if (i2Var2 != null) {
                    i2Var2.h();
                }
                x3Var.post(new p2(x3Var, aVar, 27));
                return;
            }
            if (aVar.c > 0) {
                x3Var.u2(indexOf);
                x3Var.t4();
                w61Var.N(false);
                i2 i2Var3 = x3Var.Q3;
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
                x3Var.t3.put(Long.valueOf(a10), richText);
            }
            arrayList4.add(Long.valueOf(a10));
            aVar.b = new TL_iv.pageBlockParagraph();
            z10 = true;
        } else {
            z10 = false;
        }
        f6.d(aVar.b, subSequence);
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        f6.d(pageblockparagraph, subSequence2);
        int i11 = aVar.d;
        if (i11 > 0) {
            i11++;
        }
        a aVar2 = new a(pageblockparagraph, aVar.c, i11);
        aVar2.e = aVar.e;
        aVar2.k.addAll(arrayList4);
        int i12 = indexOf + 1;
        arrayList2.add(i12, aVar2);
        x3Var.t4();
        if (z10) {
            w61Var.N(false);
            i2 i2Var4 = x3Var.Q3;
            if (i2Var4 != null) {
                i2Var4.h();
            }
            x3Var.post(new p2(x3Var, aVar2, 29));
            return;
        }
        if (z11 && (text = (editText = ((f6) A1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
            editText.h = true;
            text.delete(length, text.length());
            editText.h = false;
        }
        w61Var.S();
        x3Var.q4(i12);
        int indexOf2 = arrayList.indexOf(aVar2);
        if (indexOf2 < 0) {
            w61Var.l();
        } else {
            s4.m0 itemAnimator = x3Var.getItemAnimator();
            x3Var.setItemAnimator(null);
            w61Var.o(indexOf2);
            if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                w61Var.q(i10, (arrayList.size() - indexOf2) - 1);
            }
            x3Var.post(new z2(x3Var, itemAnimator, 0));
        }
        i2 i2Var5 = x3Var.Q3;
        if (i2Var5 != null) {
            i2Var5.h();
        }
        x3Var.post(new a3(x3Var, aVar2, 0));
    }

    @Override // ii.h1
    public final boolean n(i1 i1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        f6 f6Var = this.a;
        c6 c6Var = f6Var.y;
        if (c6Var != null && (aVar = f6Var.x) != null) {
            x3 x3Var = ((f3) c6Var).a;
            ClipboardManager clipboardManager = (ClipboardManager) x3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList x42 = x3Var.x4(e4.z(htmlText, hashMap));
                            if (!x42.isEmpty() && ((x42.size() != 1 || !x3.G3((a) x42.get(0))) && (indexOf = x3Var.s3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(i1Var.getSelectionStart(), i1Var.getSelectionEnd()));
                                boolean J4 = x3Var.J4(indexOf, indexOf, max, Math.max(max, Math.max(i1Var.getSelectionStart(), i1Var.getSelectionEnd())), x42);
                                if (J4 && !hashMap.isEmpty()) {
                                    x3Var.t3.putAll(hashMap);
                                }
                                return J4;
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    @Override // ii.h1
    public final boolean p(i1 i1Var) {
        a aVar;
        f6 f6Var = this.a;
        c6 c6Var = f6Var.y;
        if (c6Var == null || (aVar = f6Var.x) == null) {
            return false;
        }
        return x3.R1(((f3) c6Var).a, aVar, false);
    }

    @Override // ii.h1
    public final void r() {
        a aVar;
        f6 f6Var = this.a;
        c6 c6Var = f6Var.y;
        if (c6Var == null || (aVar = f6Var.x) == null) {
            return;
        }
        x3.R1(((f3) c6Var).a, aVar, true);
    }

    @Override // ii.h1
    public final void t(i1 i1Var, int i10, int i11) {
        c6 c6Var;
        q9 textSelectionHelper;
        f6 f6Var = this.a;
        if (f6Var.F || i10 == i11 || (c6Var = f6Var.y) == null || (textSelectionHelper = ((f3) c6Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        f6Var.post(new ei.y4(this, i1Var, i11, textSelectionHelper, i10, 5));
    }

    @Override // ii.h1
    public final void w(CharSequence charSequence) {
        c6 c6Var = this.a.y;
        if (c6Var != null) {
            f3 f3Var = (f3) c6Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            f3Var.a.u4(charSequence.toString());
        }
    }
}
