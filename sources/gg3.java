// default package

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gg3 {
    public final hg3 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public HashMap f;
    public CharSequence g;

    public gg3(hg3 hg3Var) {
        this.a = hg3Var;
    }

    public final void a(int i, k47 k47Var, TLRPC.Chat chat) {
        int i2;
        ArrayList arrayList;
        long j;
        boolean z;
        int i3;
        boolean z2;
        int e1 = (k47Var == null || chat == null) ? 0 : k47Var.e1();
        if (this.b != e1 || this.e) {
            this.f = null;
            this.c = 0;
            this.d = false;
            this.e = false;
            this.b = e1;
            TextPaint textPaint = cmb.E0[0];
            if (chat != null) {
                ArrayList l = oc7.r1(i).g4.l(chat.id);
                if (l == null || l.isEmpty()) {
                    if (oc7.r1(i).g4.e(chat.id)) {
                        this.g = jb6.M0(sd2.p0(chat) ? 2131747924 : 2131747871, null);
                        return;
                    }
                    oc7.r1(i).g4.n(0, chat.id, true);
                    this.g = jb6.M0(2131748536, null);
                    this.e = true;
                    return;
                }
                ArrayList arrayList2 = new ArrayList(l);
                Collections.sort(arrayList2, Comparator$-CC.comparingInt(new mn((byte) 4)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (k47Var == null || sd2.p0(chat)) {
                    i2 = 1;
                    arrayList = arrayList2;
                    j = 0;
                    z = false;
                    i3 = 0;
                } else {
                    j = k47.b2(i, k47Var.k, true, false);
                    i2 = 1;
                    arrayList = arrayList2;
                    TLRPC.TL_forumTopic f = oc7.r1(i).g4.f(chat.id, j);
                    if (f != null) {
                        CharSequence k = no4.k(f, textPaint, null);
                        spannableStringBuilder.append(k);
                        i3 = f.unread_count > 0 ? k.length() : 0;
                        this.c = k.length();
                        if (k47Var.O3()) {
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
                        spannableStringBuilder.setSpan(new fg3(gm.L(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (sd2.p0(chat)) {
                    this.f = new HashMap();
                    int i4 = 0;
                    while (i4 < Math.min(4, arrayList.size())) {
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "  ");
                        }
                        ArrayList arrayList3 = arrayList;
                        long n = pg3.n(((TLRPC.TL_forumTopic) arrayList3.get(i4)).from_id);
                        ed0 ed0Var = new ed0(i, this.a);
                        ed0Var.h = false;
                        ed0Var.c(n);
                        this.f.put(Long.valueOf(n), ed0Var);
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(pg3.k(z8c.t0, n));
                        valueOf.insert(0, (CharSequence) "  ");
                        valueOf.setSpan(ed0Var, 0, i2, 33);
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
                            spannableStringBuilder.append(no4.k((TLRPC.ForumTopic) arrayList4.get(i5), textPaint, null));
                            z3 = false;
                        }
                    }
                }
                if (i3 > 0) {
                    Typeface o = gm.o();
                    int i6 = cmb.W8;
                    z5c z5cVar = new z5c();
                    z5cVar.a = o;
                    z5cVar.c = i6;
                    z5cVar.b = cmb.w0(null, i6, false);
                    spannableStringBuilder.setSpan(z5cVar, 0, Math.min(spannableStringBuilder.length(), i3 + 2), 0);
                }
                this.g = spannableStringBuilder;
            }
        }
    }
}
