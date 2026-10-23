package ki;

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
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.b71;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class w5 implements g1 {
    public final /* synthetic */ c6 a;

    public w5(c6 c6Var) {
        this.a = c6Var;
    }

    @Override // ki.g1
    public final void G(Editable editable) {
        a aVar;
        c6 c6Var = this.a;
        if (c6Var.x == null) {
            return;
        }
        c6Var.D(editable);
        c6Var.J();
        c6.d(c6Var.x.b, editable);
        c6Var.B();
        c6Var.F();
        int i10 = 0;
        if (c6Var.n() && !c6Var.k()) {
            ((TL_iv.pageBlockBlockquote) c6Var.x.b).collapsed = false;
        }
        c6Var.G();
        z5 z5Var = c6Var.y;
        if (z5Var != null) {
            w3 w3Var = ((e3) z5Var).a;
            h2 h2Var = w3Var.K3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.i3.onContentChanged();
        }
        z5 z5Var2 = c6Var.y;
        if (z5Var2 != null) {
            ((e3) z5Var2).a.i3.C(c6Var, c6.b(editable.toString()));
        }
        String obj = editable.toString();
        a aVar2 = c6Var.x;
        if (aVar2 != null && obj != null && aVar2.c == 0 && (aVar2.b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
            i10 = 6;
        }
        if (i10 == 0 || c6Var.y == null) {
            b6 r10 = c6.r(editable.toString(), c6Var.x);
            if (r10 != null && c6Var.y != null) {
                c6Var.post(new ig.d2(this, c6Var.x, r10, 6));
            }
        } else {
            c6Var.post(new ah.o(this, c6Var.x, i10, 20));
        }
        if (c6Var.V || ((aVar = c6Var.x) != null && (aVar.b instanceof TL_iv.pageBlockPullquote))) {
            c6Var.invalidate();
        }
    }

    @Override // ki.g1
    public final boolean M(boolean z10) {
        a aVar;
        c6 c6Var = this.a;
        z5 z5Var = c6Var.y;
        if (z5Var == null || (aVar = c6Var.x) == null) {
            return false;
        }
        return ((e3) z5Var).a.c4(aVar, z10);
    }

    @Override // ki.g1
    public final boolean P(h1 h1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        c6 c6Var = this.a;
        z5 z5Var = c6Var.y;
        if (z5Var != null && (aVar = c6Var.x) != null) {
            w3 w3Var = ((e3) z5Var).a;
            ClipboardManager clipboardManager = (ClipboardManager) w3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList C4 = w3Var.C4(d4.z(htmlText, hashMap));
                            if (!C4.isEmpty() && ((C4.size() != 1 || !w3.L3((a) C4.get(0))) && (indexOf = w3Var.m3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(h1Var.getSelectionStart(), h1Var.getSelectionEnd()));
                                boolean O4 = w3Var.O4(indexOf, indexOf, max, Math.max(max, Math.max(h1Var.getSelectionStart(), h1Var.getSelectionEnd())), C4);
                                if (O4 && !hashMap.isEmpty()) {
                                    w3Var.n3.putAll(hashMap);
                                }
                                return O4;
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

    @Override // ki.g1
    public final void R(h1 h1Var, int i10, int i11) {
        z5 z5Var;
        o9 textSelectionHelper;
        c6 c6Var = this.a;
        if (c6Var.F || i10 == i11 || (z5Var = c6Var.y) == null || (textSelectionHelper = ((e3) z5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        c6Var.post(new gi.m4(this, h1Var, i11, textSelectionHelper, i10, 5));
    }

    @Override // ki.g1
    public final void c(h1 h1Var) {
        z5 z5Var = this.a.y;
        if (z5Var != null) {
            w3 w3Var = ((e3) z5Var).a;
            w3.S1(w3Var, h1Var);
            w3Var.i3.o(h1Var, true);
        }
    }

    @Override // ki.g1
    public final boolean e() {
        c6 c6Var = this.a;
        z5 z5Var = c6Var.y;
        if (z5Var == null || c6Var.x == null) {
            return false;
        }
        return ((e3) z5Var).a.Y4();
    }

    @Override // ki.g1
    public final void f(int i10, int i11) {
        h2 h2Var;
        c6 c6Var = this.a;
        z5 z5Var = c6Var.y;
        if (z5Var == null || c6Var.x == null || (h2Var = ((e3) z5Var).a.K3) == null) {
            return;
        }
        h2Var.f(i10, i11);
    }

    @Override // ki.g1
    public final void k(h1 h1Var) {
        int length;
        Spanned spanned;
        boolean z10;
        boolean z11;
        int i10;
        h1 editText;
        Editable text;
        c6 c6Var = this.a;
        if (c6Var.y == null || c6Var.x == null) {
            return;
        }
        String obj = h1Var.getText().toString();
        ((e3) c6Var.y).a.i3.C(c6Var, null);
        String b10 = c6.b(obj);
        if (b10 != null) {
            ArrayList a2 = n0.a(b10);
            if (!a2.isEmpty()) {
                c6Var.C((n0) a2.get(0));
                return;
            }
        }
        int p5 = c6.p(h1Var.getText().toString());
        if (p5 != 0) {
            ((e3) c6Var.y).c(c6Var.x, p5);
            return;
        }
        b6 q6 = c6.q(h1Var.getText().toString(), c6Var.x);
        if (q6 != null) {
            ((e3) c6Var.y).d(c6Var.x, q6.a, q6.b, q6.c, q6.d, q6.e);
            return;
        }
        if ((c6Var.x.b instanceof TL_iv.pageBlockPullquote) && c6Var.f.length() > 0) {
            c6Var.h();
            return;
        }
        z5 z5Var = c6Var.y;
        a aVar = c6Var.x;
        w3 w3Var = ((e3) z5Var).a;
        ArrayList arrayList = w3Var.q4;
        b71 b71Var = w3Var.Z2;
        ArrayList arrayList2 = w3Var.m3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        h2 h2Var = w3Var.K3;
        if (h2Var != null) {
            h2Var.d();
        }
        View F1 = w3Var.F1(aVar);
        boolean z12 = F1 instanceof c6;
        if (z12) {
            h1 editText2 = ((c6) F1).getEditText();
            Spanned text2 = editText2.getText();
            length = editText2.getSelectionEnd();
            spanned = text2;
        } else {
            SpannableStringBuilder z13 = c6.z(aVar.b);
            length = z13.length();
            spanned = z13;
        }
        if (length < 0 || length > spanned.length()) {
            length = spanned.length();
        }
        if (spanned.length() == 0) {
            if (!aVar.k.isEmpty()) {
                ArrayList arrayList3 = aVar.k;
                arrayList3.remove(arrayList3.size() - 1);
                w3Var.y4();
                b71Var.N(false);
                h2 h2Var2 = w3Var.K3;
                if (h2Var2 != null) {
                    h2Var2.h();
                }
                w3Var.post(new o2(w3Var, aVar, 27));
                return;
            }
            if (aVar.c > 0) {
                w3Var.z2(indexOf);
                w3Var.y4();
                b71Var.N(false);
                h2 h2Var3 = w3Var.K3;
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
            long a10 = p0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) aVar.b).caption;
            z10 = true;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                w3Var.n3.put(Long.valueOf(a10), richText);
            }
            arrayList4.add(Long.valueOf(a10));
            aVar.b = new TL_iv.pageBlockParagraph();
            z11 = true;
        } else {
            z10 = true;
            z11 = false;
        }
        c6.d(aVar.b, subSequence);
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        c6.d(pageblockparagraph, subSequence2);
        int i11 = aVar.d;
        if (i11 > 0) {
            i11++;
        }
        a aVar2 = new a(pageblockparagraph, aVar.c, i11);
        aVar2.e = aVar.e;
        aVar2.k.addAll(arrayList4);
        int i12 = indexOf + 1;
        arrayList2.add(i12, aVar2);
        w3Var.y4();
        if (z11) {
            b71Var.N(false);
            h2 h2Var4 = w3Var.K3;
            if (h2Var4 != null) {
                h2Var4.h();
            }
            w3Var.post(new o2(w3Var, aVar2, 29));
            return;
        }
        if (z12 && (text = (editText = ((c6) F1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
            editText.h = z10;
            text.delete(length, text.length());
            editText.h = false;
        }
        b71Var.S();
        w3Var.v4(i12);
        int indexOf2 = arrayList.indexOf(aVar2);
        if (indexOf2 < 0) {
            b71Var.l();
        } else {
            s4.l0 itemAnimator = w3Var.getItemAnimator();
            w3Var.setItemAnimator(null);
            b71Var.o(indexOf2);
            if (aVar.d > 0 && (i10 = indexOf2 + 1) < arrayList.size()) {
                b71Var.q(i10, (arrayList.size() - indexOf2) - 1);
            }
            w3Var.post(new y2(w3Var, itemAnimator, 0));
        }
        h2 h2Var5 = w3Var.K3;
        if (h2Var5 != null) {
            h2Var5.h();
        }
        w3Var.post(new z2(w3Var, aVar2, 0));
    }

    @Override // ki.g1
    public final void m() {
        a aVar;
        c6 c6Var = this.a;
        z5 z5Var = c6Var.y;
        if (z5Var == null || (aVar = c6Var.x) == null) {
            return;
        }
        w3.W1(((e3) z5Var).a, aVar, true);
    }

    @Override // ki.g1
    public final boolean s(h1 h1Var) {
        a aVar;
        c6 c6Var = this.a;
        z5 z5Var = c6Var.y;
        if (z5Var == null || (aVar = c6Var.x) == null) {
            return false;
        }
        return w3.W1(((e3) z5Var).a, aVar, false);
    }

    @Override // ki.g1
    public final void x(CharSequence charSequence) {
        z5 z5Var = this.a.y;
        if (z5Var != null) {
            e3 e3Var = (e3) z5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            e3Var.a.z4(charSequence.toString());
        }
    }
}
