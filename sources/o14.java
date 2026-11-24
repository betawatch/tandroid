// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o14 extends q59 {
    public int E;
    public int F;
    public final /* synthetic */ e34 G;
    public ArrayList h;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public final ArrayList n = new ArrayList();
    public final SparseIntArray r = new SparseIntArray();
    public final SparseIntArray s = new SparseIntArray();
    public final SparseIntArray w = new SparseIntArray();
    public final SparseIntArray x = new SparseIntArray();
    public final ArrayList y = new ArrayList();

    public o14(e34 e34Var) {
        this.G = e34Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 0 || i == 4 || i == 3 || i == 6;
    }

    public final void E(int i, View view) {
        e34 e34Var = this.G;
        ArrayList arrayList = e34Var.r1;
        int i2 = this.x.get(i);
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        s14 s14Var = (s14) arrayList.get(i2);
        if (s14Var.h) {
            return;
        }
        byte b = 0;
        boolean z = i2 + 1 == arrayList.size();
        int intValue = ((Integer) this.y.get(i2)).intValue();
        e34Var.p1.add(Long.valueOf(s14Var.b.id));
        boolean z2 = z8c.h(e34Var.d1).p() || e34Var.V0;
        int i3 = e34Var.R.J * 3;
        int size = ((s14Var.f && !s14Var.g && (s14Var.e || z2)) || s14Var.h) ? s14Var.c.size() : Math.min(i3, s14Var.c.size());
        Integer num = null;
        Integer valueOf = s14Var.c.size() > i3 ? Integer.valueOf(intValue + 1 + size) : null;
        s14Var.h = true;
        int size2 = s14Var.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        e34Var.s2 = view;
        e34Var.t2 = valueOf.intValue();
        e34Var.u2 = num.intValue() + valueOf.intValue();
        e34Var.v2 = SystemClock.elapsedRealtime();
        p(valueOf.intValue(), num.intValue());
        g(valueOf.intValue());
        if (z) {
            e34Var.post(new n14(this, num.intValue() > i3 / 2 ? 1.5f : 4.0f, valueOf.intValue(), b));
        }
    }

    public final void F(boolean z) {
        e34 e34Var = this.G;
        ArrayList arrayList = e34Var.o1;
        if (e34Var.T2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        hs6 d0 = hs6.d0(e34Var.d1);
        ArrayList arrayList3 = d0.t0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i);
            if (!d0.D0(stickerSetCovered.set.id, true) || e34Var.q1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z);
        H();
        c34 c34Var = e34Var.U;
        if (c34Var != null) {
            c34Var.f();
        }
        ww7.a(new tk3(this, arrayList2, (byte) 1), false).c(this);
    }

    public final void G(boolean z) {
        ArrayList arrayList;
        boolean z2;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet a0;
        e34 e34Var = this.G;
        ArrayList arrayList2 = e34Var.o1;
        ArrayList arrayList3 = e34Var.p1;
        int i = e34Var.d1;
        ArrayList arrayList4 = e34Var.r1;
        arrayList4.clear();
        if (e34Var.d2) {
            hs6 d0 = hs6.d0(i);
            if (z || (arrayList = this.h) == null) {
                arrayList = new ArrayList(d0.t0(5));
                this.h = arrayList;
            }
            boolean z3 = z8c.h(i).p() || e34Var.V0;
            TLRPC.ChatFull chatFull = e34Var.K1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (a0 = d0.a0(stickerSet)) != null) {
                s14 s14Var = new s14();
                s14Var.b = e34Var.K1.emojiset;
                s14Var.c = new ArrayList(a0.documents);
                s14Var.e = true;
                s14Var.f = true;
                s14Var.g = false;
                s14Var.h = true;
                s14Var.i = true;
                arrayList4.add(s14Var);
                TLRPC.StickerSet stickerSet2 = s14Var.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i2);
                    if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.id == stickerSet2.id) {
                        arrayList.remove(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (!z3) {
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList.get(i3);
                    if (tL_messages_stickerSet2 != null && !k47.U3(tL_messages_stickerSet2)) {
                        s14 s14Var2 = new s14();
                        s14Var2.b = tL_messages_stickerSet2.set;
                        s14Var2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        s14Var2.e = true;
                        s14Var2.f = d0.D0(tL_messages_stickerSet2.set.id, true);
                        s14Var2.g = false;
                        s14Var2.h = true;
                        arrayList4.add(s14Var2);
                        arrayList.remove(i3);
                        i3--;
                    }
                    i3++;
                }
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList.get(i4);
                if (z3) {
                    s14 s14Var3 = new s14();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    s14Var3.b = stickerSet3;
                    s14Var3.c = tL_messages_stickerSet3.documents;
                    s14Var3.e = false;
                    s14Var3.f = d0.D0(stickerSet3.id, true);
                    s14Var3.g = false;
                    s14Var3.h = true;
                    arrayList4.add(s14Var3);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i5 = 0; i5 < tL_messages_stickerSet3.documents.size(); i5++) {
                            boolean m3 = k47.m3(tL_messages_stickerSet3.documents.get(i5));
                            ArrayList<TLRPC.Document> arrayList7 = tL_messages_stickerSet3.documents;
                            if (m3) {
                                arrayList5.add(arrayList7.get(i5));
                            } else {
                                arrayList6.add(arrayList7.get(i5));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        s14 s14Var4 = new s14();
                        s14Var4.b = tL_messages_stickerSet3.set;
                        s14Var4.c = new ArrayList(arrayList5);
                        s14Var4.e = true;
                        s14Var4.f = d0.D0(tL_messages_stickerSet3.set.id, true);
                        s14Var4.g = false;
                        s14Var4.h = true;
                        arrayList4.add(s14Var4);
                    }
                    if (arrayList6.size() > 0) {
                        s14 s14Var5 = new s14();
                        s14Var5.b = tL_messages_stickerSet3.set;
                        s14Var5.c = new ArrayList(arrayList6);
                        s14Var5.e = false;
                        s14Var5.f = d0.D0(tL_messages_stickerSet3.set.id, true);
                        s14Var5.g = false;
                        s14Var5.h = arrayList3.contains(Long.valueOf(s14Var5.b.id));
                        arrayList4.add(s14Var5);
                    }
                }
            }
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i6);
                s14 s14Var6 = new s14();
                s14Var6.f = d0.D0(stickerSetCovered.set.id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                s14Var6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    s14Var6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet m0 = d0.m0(hs6.b0(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (m0 != null) {
                        s14Var6.c = m0.documents;
                    } else {
                        s14Var6.d = hs6.b0(stickerSetCovered.set);
                    }
                } else {
                    s14Var6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList8 = s14Var6.c;
                if (arrayList8 != null && !arrayList8.isEmpty()) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= s14Var6.c.size()) {
                            z2 = false;
                            break;
                        } else {
                            if (!k47.m3((TLRPC.Document) s14Var6.c.get(i7))) {
                                z2 = true;
                                break;
                            }
                            i7++;
                        }
                    }
                    s14Var6.e = !z2;
                    s14Var6.h = arrayList3.contains(Long.valueOf(s14Var6.b.id));
                    s14Var6.g = true;
                    arrayList4.add(s14Var6);
                }
            }
            j14 j14Var = e34Var.J;
            if (j14Var != null) {
                j14Var.p(e34Var.getEmojipacks());
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v28 boolean, still in use, count: 3, list:
          (r11v28 boolean) from 0x00d9: IF  (r11v28 boolean) == true  -> B:29:0x00dd A[HIDDEN] (LINE:218)
          (r11v28 boolean) from 0x00e5: IF  (r11v28 boolean) == true  -> B:41:0x00e9 A[HIDDEN] (LINE:230)
          (r11v28 boolean) from 0x00fe: IF  (r11v28 boolean) == true  -> B:32:0x0100 A[HIDDEN] (LINE:255)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:106)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:90)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:141)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125 A[LOOP:0: B:43:0x011e->B:45:0x0125, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0146 A[EDGE_INSN: B:46:0x0146->B:47:0x0146 BREAK  A[LOOP:0: B:43:0x011e->B:45:0x0125], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019d A[EDGE_INSN: B:56:0x019d->B:57:0x019d BREAK  A[LOOP:1: B:48:0x0148->B:55:0x0198], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o14.H():void");
    }

    @Override // y59
    public final int b() {
        return this.E;
    }

    @Override // y59
    public final long c(int i) {
        return i;
    }

    @Override // y59
    public final int d(int i) {
        if (i == this.d) {
            return 4;
        }
        if (i == this.c || i == this.f) {
            return 1;
        }
        SparseIntArray sparseIntArray = this.r;
        if (sparseIntArray.indexOfKey(i) >= 0) {
            int i2 = sparseIntArray.get(i);
            char[] cArr = zx3.a;
            return i2 >= 8 ? 5 : 1;
        }
        if (this.G.e0 && i == 0) {
            return 2;
        }
        if (this.w.indexOfKey(i) >= 0) {
            return 3;
        }
        return this.x.indexOfKey(i) >= 0 ? 6 : 0;
    }

    @Override // y59
    public final void f() {
        F(false);
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        String str;
        String str2;
        Long l;
        TLRPC.Document document;
        int i2;
        int i3 = i;
        e34 e34Var = this.G;
        String[] strArr = e34Var.b1;
        f14 f14Var = e34Var.R;
        int i4 = e34Var.d1;
        ArrayList arrayList = e34Var.r1;
        int i5 = u69Var.f;
        View view = u69Var.a;
        boolean z = true;
        s14 s14Var = null;
        if (i5 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i5 == 1) {
                w1b w1bVar = (w1b) view;
                w1bVar.getClass();
                int i6 = sparseIntArray.get(i3);
                if (i3 == this.c) {
                    w1bVar.b(jb6.M0(2131750772, null), R.drawable.msg_close, jb6.M0(2131754899, null), 0, 0);
                    return;
                }
                if (i3 == this.f) {
                    w1bVar.a(0, jb6.M0(2131746094, null));
                    return;
                } else {
                    if (i6 < strArr.length) {
                        w1bVar.a(0, strArr[i6]);
                        return;
                    }
                    try {
                        w1bVar.a(0, ((s14) arrayList.get(i6 - strArr.length)).b.title);
                        return;
                    } catch (Exception unused) {
                        w1bVar.a(0, "");
                        return;
                    }
                }
            }
            byte b = 6;
            byte b2 = 5;
            if (i5 != 5) {
                if (i5 == 6) {
                    u14 u14Var = (u14) view;
                    int i7 = this.x.get(i3);
                    int i8 = f14Var.J * 3;
                    if (i7 >= 0 && i7 < arrayList.size()) {
                        s14Var = (s14) arrayList.get(i7);
                    }
                    if (s14Var != null) {
                        u14Var.a.setText("+" + ((s14Var.c.size() - i8) + 1));
                        return;
                    }
                    return;
                }
                return;
            }
            w14 w14Var = (w14) view;
            int length = sparseIntArray.get(i3) - strArr.length;
            s14 s14Var2 = (s14) arrayList.get(length);
            int i9 = length - 1;
            s14 s14Var3 = i9 >= 0 ? (s14) arrayList.get(i9) : null;
            if (s14Var2 == null || !s14Var2.g || (s14Var3 != null && !s14Var3.e && s14Var3.f && !z8c.h(i4).p())) {
                z = false;
            }
            if (s14Var2 != null && s14Var2.d != null) {
                hs6.d0(i4).n0(s14Var2.d, false);
                s14Var2.d = null;
            }
            cj8 cj8Var = w14Var.r;
            if (s14Var2 != null) {
                w14Var.x = s14Var2;
                w14Var.y = z;
                w14Var.d.l(s14Var2.b.title, false);
                w14Var.e.setVisibility(s14Var2.i ? 0 : 8);
                if (!s14Var2.f || s14Var2.b.official) {
                    cj8Var.b(jb6.M0(2131743563, null), new v14(w14Var, b), false);
                } else {
                    cj8Var.b(jb6.M0(2131745815, null), new v14(w14Var, b2), false);
                }
                w14Var.a(false);
                return;
            }
            return;
        }
        n24 n24Var = (n24) view;
        n24Var.a = i3;
        n24Var.e = null;
        if (e34Var.e0) {
            i3--;
        }
        if (this.f >= 0) {
            i3--;
        }
        if (this.d >= 0) {
            i3 -= 2;
        }
        int size = e34Var.getRecentEmoji().size();
        if (i3 < size) {
            String str3 = e34Var.getRecentEmoji().get(i3);
            if (str3 != null && str3.startsWith("animated_")) {
                try {
                    l = Long.valueOf(Long.parseLong(str3.substring(9)));
                    str = null;
                } catch (Exception unused2) {
                }
                str2 = str;
                document = null;
            }
            str = str3;
            l = null;
            str2 = str;
            document = null;
        } else {
            int i10 = 0;
            while (true) {
                String[][] strArr2 = zx3.f;
                if (i10 >= 8) {
                    str = null;
                    break;
                }
                String[] strArr3 = strArr2[i10];
                int length2 = strArr3.length + 1;
                int i11 = (i3 - size) - 1;
                if (i11 < 0 || i3 >= size + length2) {
                    size += length2;
                    i10++;
                } else {
                    str = strArr3[i11];
                    String str4 = (String) gw3.j.get(str);
                    if (str4 != null) {
                        String c = e34.c(str, str4);
                        str2 = str;
                        str = c;
                    }
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean p = z8c.h(i4).p();
                int i12 = f14Var.J * 3;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList2 = this.y;
                    if (i13 >= arrayList2.size()) {
                        break;
                    }
                    s14 s14Var4 = (s14) arrayList.get(i13);
                    int intValue = ((Integer) arrayList2.get(i13)).intValue() + 1;
                    int size2 = ((s14Var4.f && !s14Var4.g && (s14Var4.e || p)) || s14Var4.h) ? s14Var4.c.size() : Math.min(i12, s14Var4.c.size());
                    int i14 = n24Var.a;
                    if (i14 < intValue || (i2 = i14 - intValue) >= size2) {
                        i13++;
                    } else {
                        n24Var.e = s14Var4;
                        TLRPC.Document document2 = (TLRPC.Document) s14Var4.c.get(i2);
                        document = document2;
                        l = document2 == null ? null : Long.valueOf(document2.id);
                    }
                }
            }
            l = null;
            document = null;
            z = false;
        }
        if (l != null) {
            n24Var.setPadding(gm.L(3.0f), gm.L(3.0f), gm.L(3.0f), gm.L(3.0f));
            n24Var.a(null, z);
            if (n24Var.getSpan() == null || n24Var.getSpan().getDocumentId() != l.longValue()) {
                if (document != null) {
                    n24Var.setSpan(new gn(document, (Paint.FontMetricsInt) null));
                } else {
                    n24Var.setSpan(new gn(l.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            n24Var.setPadding(0, 0, 0, 0);
            n24Var.a(gw3.f(str), z);
            n24Var.setSpan(null);
        }
        n24Var.setTag(str2);
        n24Var.setContentDescription(str);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        e34 e34Var = this.G;
        if (i == 0) {
            view = new n24(e34Var.getContext());
        } else if (i == 1) {
            w1b w1bVar = new w1b(e34Var.getContext(), true, false, e34Var.a2, e34Var.j2);
            w1bVar.setOnIconClickListener(new sf3(this, (byte) 8));
            view = w1bVar;
        } else if (i == 3) {
            view = new t14(e34Var, e34Var.getContext());
        } else if (i == 4) {
            Context context = e34Var.getContext();
            c34 c34Var = new c34(e34Var, true);
            e34Var.U = c34Var;
            fv fvVar = new fv(e34Var, context, c34Var);
            fvVar.setPadding(gm.L(8.0f), gm.L(4.0f), gm.L(8.0f), 0);
            fvVar.setClipToPadding(false);
            fvVar.i(new as1((byte) 2));
            fvVar.setOnItemClickListener(new u(this, (byte) 25));
            view = fvVar;
        } else if (i == 5) {
            view = new w14(e34Var, e34Var.getContext());
        } else if (i != 6) {
            View view2 = new View(e34Var.getContext());
            view2.setLayoutParams(new g69(-1, e34Var.c1));
            view = view2;
        } else {
            Context context2 = e34Var.getContext();
            ylb ylbVar = e34Var.a2;
            u14 u14Var = new u14(context2);
            TextView textView = new TextView(context2);
            u14Var.a = textView;
            textView.setTextSize(1, 13.0f);
            anb.X(textView, cmb.c6, ylbVar);
            int L = gm.L(11.0f);
            int i2 = cmb.Kf;
            ShapeDrawable b0 = cmb.b0(L, on2.p(cmb.v0(i2, ylbVar), 99));
            wmb g = anb.g(i2, 99);
            textView.setBackground(b0);
            anb.j(textView, b0, g, null, ylbVar);
            textView.setTypeface(gm.o());
            textView.setPadding(gm.L(6.0f), gm.L(1.66f), gm.L(6.0f), gm.L(2.0f));
            u14Var.addView(textView, qoe.e(-2, -2, 17));
            view = u14Var;
        }
        return new b59(view);
    }
}
