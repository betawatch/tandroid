// default package

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class nf3 {
    public final of3 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public HashMap f;
    public CharSequence g;

    public nf3(of3 of3Var) {
        this.a = of3Var;
    }

    public final void a(int i, r47 r47Var, TLRPC.Chat chat) {
        int i2;
        ArrayList arrayList;
        long j;
        boolean z;
        int i3;
        boolean z2;
        int e1 = (r47Var == null || chat == null) ? 0 : r47Var.e1();
        if (this.b != e1 || this.e) {
            this.f = null;
            this.c = 0;
            this.d = false;
            this.e = false;
            this.b = e1;
            TextPaint textPaint = aob.E0[0];
            if (chat != null) {
                ArrayList l = uc7.s1(i).h4.l(chat.id);
                if (l == null || l.isEmpty()) {
                    if (uc7.s1(i).h4.e(chat.id)) {
                        this.g = ob6.M0(xc2.p0(chat) ? 2131747921 : 2131747868, null);
                        return;
                    }
                    uc7.s1(i).h4.n(0, chat.id, true);
                    this.g = ob6.M0(2131748533, null);
                    this.e = true;
                    return;
                }
                ArrayList arrayList2 = new ArrayList(l);
                Collections.sort(arrayList2, Comparator$-CC.comparingInt(new nm((byte) 4)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (r47Var == null || xc2.p0(chat)) {
                    i2 = 1;
                    arrayList = arrayList2;
                    j = 0;
                    z = false;
                    i3 = 0;
                } else {
                    j = r47.b2(i, r47Var.k, true, false);
                    i2 = 1;
                    arrayList = arrayList2;
                    TLRPC.TL_forumTopic f = uc7.s1(i).h4.f(chat.id, j);
                    if (f != null) {
                        CharSequence k = ro4.k(f, textPaint, null);
                        spannableStringBuilder.append(k);
                        i3 = f.unread_count > 0 ? k.length() : 0;
                        this.c = k.length();
                        if (r47Var.O3()) {
                            this.d = false;
                            z2 = false;
                        } else {
                            z2 = f.unread_count > 0;
                            this.d = z2;
                        }
                    } else {
                        this.d = false;
                        z2 = false;
                        i3 = 0;
                    }
                    if (z2) {
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.setSpan(new mf3(hl.L(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (xc2.p0(chat)) {
                    this.f = new HashMap();
                    int i4 = 0;
                    while (i4 < Math.min(4, arrayList.size())) {
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "  ");
                        }
                        ArrayList arrayList3 = arrayList;
                        long n = wf3.n(((TLRPC.TL_forumTopic) arrayList3.get(i4)).from_id);
                        gc0 gc0Var = new gc0(i, this.a);
                        gc0Var.h = false;
                        gc0Var.c(n);
                        this.f.put(Long.valueOf(n), gc0Var);
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(wf3.k(yac.t0, n));
                        valueOf.insert(0, (CharSequence) "  ");
                        valueOf.setSpan(gc0Var, 0, i2, 33);
                        spannableStringBuilder.append((CharSequence) valueOf);
                        i4++;
                        arrayList = arrayList3;
                        i2 = 1;
                    }
                } else {
                    ArrayList arrayList4 = arrayList;
                    boolean z3 = true;
                    for (int i5 = 0; i5 < Math.min(4, arrayList4.size()); i5++) {
                        TextPaint textPaint2 = textPaint;
                        if (((TLRPC.TL_forumTopic) arrayList4.get(i5)).id == j) {
                            textPaint = textPaint2;
                        } else {
                            if (spannableStringBuilder.length() != 0) {
                                if (z3 && z) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                } else {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                            }
                            textPaint = textPaint2;
                            spannableStringBuilder.append(ro4.k((TLRPC.ForumTopic) arrayList4.get(i5), textPaint, null));
                            z3 = false;
                        }
                    }
                }
                if (i3 > 0) {
                    Typeface o = hl.o();
                    int i6 = aob.X8;
                    y7c y7cVar = new y7c();
                    y7cVar.a = o;
                    y7cVar.c = i6;
                    y7cVar.b = aob.w0(null, i6, false);
                    spannableStringBuilder.setSpan(y7cVar, 0, Math.min(spannableStringBuilder.length(), i3 + 2), 0);
                }
                this.g = spannableStringBuilder;
            }
        }
    }
}
