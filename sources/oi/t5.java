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
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class t5 implements d1 {
    public final /* synthetic */ z5 a;

    public t5(z5 z5Var) {
        this.a = z5Var;
    }

    @Override // oi.d1
    public final void A(int i7, int i10) {
        e2 e2Var;
        z5 z5Var = this.a;
        w5 w5Var = z5Var.E;
        if (w5Var == null || z5Var.y == null || (e2Var = ((c3) w5Var).a.R3) == null) {
            return;
        }
        e2Var.f(i7, i10);
    }

    @Override // oi.d1
    public final void E0() {
        a aVar;
        z5 z5Var = this.a;
        w5 w5Var = z5Var.E;
        if (w5Var == null || (aVar = z5Var.y) == null) {
            return;
        }
        s3.U1(((c3) w5Var).a, aVar, true);
    }

    @Override // oi.d1
    public final boolean E1(boolean z10) {
        a aVar;
        z5 z5Var = this.a;
        w5 w5Var = z5Var.E;
        if (w5Var == null || (aVar = z5Var.y) == null) {
            return false;
        }
        return ((c3) w5Var).a.Z3(aVar, z10);
    }

    @Override // oi.d1
    public final boolean J(e1 e1Var) {
        a aVar;
        z5 z5Var = this.a;
        w5 w5Var = z5Var.E;
        if (w5Var == null || (aVar = z5Var.y) == null) {
            return false;
        }
        return s3.U1(((c3) w5Var).a, aVar, false);
    }

    @Override // oi.d1
    public final void b1(CharSequence charSequence) {
        w5 w5Var = this.a.E;
        if (w5Var != null) {
            c3 c3Var = (c3) w5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            c3Var.a.w4(charSequence.toString());
        }
    }

    @Override // oi.d1
    public final boolean d2(e1 e1Var) {
        a aVar;
        ClipData primaryClip;
        int indexOf;
        z5 z5Var = this.a;
        w5 w5Var = z5Var.E;
        if (w5Var != null && (aVar = z5Var.y) != null) {
            s3 s3Var = ((c3) w5Var).a;
            ClipboardManager clipboardManager = (ClipboardManager) s3Var.getContext().getSystemService("clipboard");
            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() != 0 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    String htmlText = primaryClip.getItemAt(0).getHtmlText();
                    if (!TextUtils.isEmpty(htmlText)) {
                        HashMap hashMap = new HashMap();
                        try {
                            ArrayList z42 = s3Var.z4(a4.z(htmlText, hashMap));
                            if (!z42.isEmpty() && ((z42.size() != 1 || !s3.I3((a) z42.get(0))) && (indexOf = s3Var.t3.indexOf(aVar)) >= 0)) {
                                int max = Math.max(0, Math.min(e1Var.getSelectionStart(), e1Var.getSelectionEnd()));
                                boolean L4 = s3Var.L4(indexOf, indexOf, max, Math.max(max, Math.max(e1Var.getSelectionStart(), e1Var.getSelectionEnd())), z42);
                                if (L4 && !hashMap.isEmpty()) {
                                    s3Var.u3.putAll(hashMap);
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
    public final void e(e1 e1Var) {
        w5 w5Var = this.a.E;
        if (w5Var != null) {
            s3 s3Var = ((c3) w5Var).a;
            s3.Q1(s3Var, e1Var);
            s3Var.p3.k(e1Var, true);
        }
    }

    @Override // oi.d1
    public final boolean o() {
        z5 z5Var = this.a;
        w5 w5Var = z5Var.E;
        if (w5Var == null || z5Var.y == null) {
            return false;
        }
        return ((c3) w5Var).a.V4();
    }

    @Override // oi.d1
    public final void r1(e1 e1Var, int i7, int i10) {
        w5 w5Var;
        i9 textSelectionHelper;
        z5 z5Var = this.a;
        if (z5Var.G || i7 == i10 || (w5Var = z5Var.E) == null || (textSelectionHelper = ((c3) w5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        z5Var.post(new jg.o1(this, e1Var, i10, textSelectionHelper, i7, 5));
    }

    @Override // oi.d1
    public final void s1(Editable editable) {
        a aVar;
        z5 z5Var = this.a;
        if (z5Var.y == null) {
            return;
        }
        z5Var.E(editable);
        z5Var.K();
        z5.d(z5Var.y.b, editable);
        z5Var.C();
        z5Var.G();
        int i7 = 0;
        if (z5Var.o() && !z5Var.l()) {
            ((TL_iv.pageBlockBlockquote) z5Var.y.b).collapsed = false;
        }
        z5Var.H();
        w5 w5Var = z5Var.E;
        if (w5Var != null) {
            s3 s3Var = ((c3) w5Var).a;
            e2 e2Var = s3Var.R3;
            if (e2Var != null) {
                e2Var.g();
            }
            s3Var.p3.onContentChanged();
        }
        w5 w5Var2 = z5Var.E;
        if (w5Var2 != null) {
            ((c3) w5Var2).a.p3.a0(z5Var, z5.b(editable.toString()));
        }
        String obj = editable.toString();
        a aVar2 = z5Var.y;
        if (aVar2 != null && obj != null && aVar2.c == 0 && (aVar2.b instanceof TL_iv.pageBlockParagraph) && obj.equals("> ")) {
            i7 = 6;
        }
        if (i7 == 0 || z5Var.E == null) {
            y5 s5 = z5.s(editable.toString(), z5Var.y);
            if (s5 != null && z5Var.E != null) {
                z5Var.post(new kg.i0(this, z5Var.y, s5, 17));
            }
        } else {
            z5Var.post(new ai.a1(this, z5Var.y, i7, 25));
        }
        if (z5Var.W || ((aVar = z5Var.y) != null && (aVar.b instanceof TL_iv.pageBlockPullquote))) {
            z5Var.invalidate();
        }
    }

    @Override // oi.d1
    public final void x0(e1 e1Var) {
        int length;
        Spanned spanned;
        boolean z10;
        boolean z11;
        int i7;
        e1 editText;
        Editable text;
        z5 z5Var = this.a;
        if (z5Var.E == null || z5Var.y == null) {
            return;
        }
        String obj = e1Var.getText().toString();
        ((c3) z5Var.E).a.p3.a0(z5Var, null);
        String b10 = z5.b(obj);
        if (b10 != null) {
            ArrayList a10 = j0.a(b10);
            if (!a10.isEmpty()) {
                z5Var.D((j0) a10.get(0));
                return;
            }
        }
        int q10 = z5.q(e1Var.getText().toString());
        if (q10 != 0) {
            ((c3) z5Var.E).c(z5Var.y, q10);
            return;
        }
        y5 r10 = z5.r(e1Var.getText().toString(), z5Var.y);
        if (r10 != null) {
            ((c3) z5Var.E).d(z5Var.y, r10.a, r10.b, r10.c, r10.d, r10.e);
            return;
        }
        if ((z5Var.y.b instanceof TL_iv.pageBlockPullquote) && z5Var.f.length() > 0) {
            z5Var.h();
            return;
        }
        w5 w5Var = z5Var.E;
        a aVar = z5Var.y;
        s3 s3Var = ((c3) w5Var).a;
        ArrayList arrayList = s3Var.x4;
        z41 z41Var = s3Var.g3;
        ArrayList arrayList2 = s3Var.t3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        e2 e2Var = s3Var.R3;
        if (e2Var != null) {
            e2Var.d();
        }
        View C1 = s3Var.C1(aVar);
        boolean z12 = C1 instanceof z5;
        if (z12) {
            e1 editText2 = ((z5) C1).getEditText();
            Spanned text2 = editText2.getText();
            length = editText2.getSelectionEnd();
            spanned = text2;
        } else {
            SpannableStringBuilder A = z5.A(aVar.b);
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
                s3Var.v4();
                z41Var.O(false);
                e2 e2Var2 = s3Var.R3;
                if (e2Var2 != null) {
                    e2Var2.h();
                }
                s3Var.post(new l2(s3Var, aVar, 27));
                return;
            }
            if (aVar.c > 0) {
                s3Var.w2(indexOf);
                s3Var.v4();
                z41Var.O(false);
                e2 e2Var3 = s3Var.R3;
                if (e2Var3 != null) {
                    e2Var3.h();
                }
                s3Var.post(new l2(s3Var, aVar, 28));
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
                s3Var.u3.put(Long.valueOf(a11), richText);
            }
            arrayList4.add(Long.valueOf(a11));
            aVar.b = new TL_iv.pageBlockParagraph();
            z11 = true;
        } else {
            z10 = true;
            z11 = false;
        }
        z5.d(aVar.b, subSequence);
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        z5.d(pageblockparagraph, subSequence2);
        int i10 = aVar.d;
        if (i10 > 0) {
            i10++;
        }
        a aVar2 = new a(pageblockparagraph, aVar.c, i10);
        aVar2.e = aVar.e;
        aVar2.k.addAll(arrayList4);
        int i11 = indexOf + 1;
        arrayList2.add(i11, aVar2);
        s3Var.v4();
        if (z11) {
            z41Var.O(false);
            e2 e2Var4 = s3Var.R3;
            if (e2Var4 != null) {
                e2Var4.h();
            }
            s3Var.post(new l2(s3Var, aVar2, 29));
            return;
        }
        if (z12 && (text = (editText = ((z5) C1).getEditText()).getText()) != null && length >= 0 && length < text.length()) {
            editText.i2 = z10;
            text.delete(length, text.length());
            editText.i2 = false;
        }
        z41Var.T();
        s3Var.s4(i11);
        int indexOf2 = arrayList.indexOf(aVar2);
        if (indexOf2 < 0) {
            z41Var.f();
        } else {
            v4.n0 itemAnimator = s3Var.getItemAnimator();
            s3Var.setItemAnimator(null);
            z41Var.i(indexOf2);
            if (aVar.d > 0 && (i7 = indexOf2 + 1) < arrayList.size()) {
                z41Var.k(i7, (arrayList.size() - indexOf2) - 1);
            }
            s3Var.post(new w2(s3Var, itemAnimator, 0));
        }
        e2 e2Var5 = s3Var.R3;
        if (e2Var5 != null) {
            e2Var5.h();
        }
        s3Var.post(new x2(s3Var, aVar2, 0));
    }
}
