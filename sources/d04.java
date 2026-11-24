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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class d04 extends n39 {
    public int E;
    public int F;
    public final /* synthetic */ t14 G;
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

    public d04(t14 t14Var) {
        this.G = t14Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 0 || i == 4 || i == 3 || i == 6;
    }

    public final void E(int i, View view) {
        t14 t14Var = this.G;
        ArrayList arrayList = t14Var.r1;
        int i2 = this.x.get(i);
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        h04 h04Var = (h04) arrayList.get(i2);
        if (h04Var.h) {
            return;
        }
        byte b = 0;
        boolean z = i2 + 1 == arrayList.size();
        int intValue = ((Integer) this.y.get(i2)).intValue();
        t14Var.p1.add(Long.valueOf(h04Var.b.id));
        boolean z2 = y6c.h(t14Var.d1).p() || t14Var.V0;
        int i3 = t14Var.R.J * 3;
        int size = ((h04Var.f && !h04Var.g && (h04Var.e || z2)) || h04Var.h) ? h04Var.c.size() : Math.min(i3, h04Var.c.size());
        Integer num = null;
        Integer valueOf = h04Var.c.size() > i3 ? Integer.valueOf(intValue + 1 + size) : null;
        h04Var.h = true;
        int size2 = h04Var.c.size() - size;
        if (size2 > 0) {
            valueOf = Integer.valueOf(intValue + 1 + size);
            num = Integer.valueOf(size2);
        }
        G(false);
        H();
        if (valueOf == null || num == null) {
            return;
        }
        t14Var.s2 = view;
        t14Var.t2 = valueOf.intValue();
        t14Var.u2 = num.intValue() + valueOf.intValue();
        t14Var.v2 = SystemClock.elapsedRealtime();
        p(valueOf.intValue(), num.intValue());
        g(valueOf.intValue());
        if (z) {
            t14Var.post(new c04(this, num.intValue() > i3 / 2 ? 1.5f : 4.0f, valueOf.intValue(), b));
        }
    }

    public final void F(boolean z) {
        t14 t14Var = this.G;
        ArrayList arrayList = t14Var.o1;
        if (t14Var.T2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        hq6 d0 = hq6.d0(t14Var.d1);
        ArrayList arrayList3 = d0.t0[1];
        arrayList.clear();
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList3.get(i);
            if (!d0.D0(stickerSetCovered.set.id, true) || t14Var.q1.contains(Long.valueOf(stickerSetCovered.set.id))) {
                arrayList.add(stickerSetCovered);
            }
        }
        G(z);
        H();
        r14 r14Var = t14Var.U;
        if (r14Var != null) {
            r14Var.f();
        }
        vu7.a(new ij3(this, arrayList2, (byte) 1), false).c(this);
    }

    public final void G(boolean z) {
        ArrayList arrayList;
        boolean z2;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet a0;
        t14 t14Var = this.G;
        ArrayList arrayList2 = t14Var.o1;
        ArrayList arrayList3 = t14Var.p1;
        int i = t14Var.d1;
        ArrayList arrayList4 = t14Var.r1;
        arrayList4.clear();
        if (t14Var.d2) {
            hq6 d0 = hq6.d0(i);
            if (z || (arrayList = this.h) == null) {
                arrayList = new ArrayList(d0.t0(5));
                this.h = arrayList;
            }
            boolean z3 = y6c.h(i).p() || t14Var.V0;
            TLRPC.ChatFull chatFull = t14Var.K1;
            if (chatFull != null && (stickerSet = chatFull.emojiset) != null && (a0 = d0.a0(stickerSet)) != null) {
                h04 h04Var = new h04();
                h04Var.b = t14Var.K1.emojiset;
                h04Var.c = new ArrayList(a0.documents);
                h04Var.e = true;
                h04Var.f = true;
                h04Var.g = false;
                h04Var.h = true;
                h04Var.i = true;
                arrayList4.add(h04Var);
                TLRPC.StickerSet stickerSet2 = h04Var.b;
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
                    if (tL_messages_stickerSet2 != null && !k27.U3(tL_messages_stickerSet2)) {
                        h04 h04Var2 = new h04();
                        h04Var2.b = tL_messages_stickerSet2.set;
                        h04Var2.c = new ArrayList(tL_messages_stickerSet2.documents);
                        h04Var2.e = true;
                        h04Var2.f = d0.D0(tL_messages_stickerSet2.set.id, true);
                        h04Var2.g = false;
                        h04Var2.h = true;
                        arrayList4.add(h04Var2);
                        arrayList.remove(i3);
                        i3--;
                    }
                    i3++;
                }
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList.get(i4);
                if (z3) {
                    h04 h04Var3 = new h04();
                    TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet3.set;
                    h04Var3.b = stickerSet3;
                    h04Var3.c = tL_messages_stickerSet3.documents;
                    h04Var3.e = false;
                    h04Var3.f = d0.D0(stickerSet3.id, true);
                    h04Var3.g = false;
                    h04Var3.h = true;
                    arrayList4.add(h04Var3);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.documents != null) {
                        for (int i5 = 0; i5 < tL_messages_stickerSet3.documents.size(); i5++) {
                            boolean m3 = k27.m3(tL_messages_stickerSet3.documents.get(i5));
                            ArrayList<TLRPC.Document> arrayList7 = tL_messages_stickerSet3.documents;
                            if (m3) {
                                arrayList5.add(arrayList7.get(i5));
                            } else {
                                arrayList6.add(arrayList7.get(i5));
                            }
                        }
                    }
                    if (arrayList5.size() > 0) {
                        h04 h04Var4 = new h04();
                        h04Var4.b = tL_messages_stickerSet3.set;
                        h04Var4.c = new ArrayList(arrayList5);
                        h04Var4.e = true;
                        h04Var4.f = d0.D0(tL_messages_stickerSet3.set.id, true);
                        h04Var4.g = false;
                        h04Var4.h = true;
                        arrayList4.add(h04Var4);
                    }
                    if (arrayList6.size() > 0) {
                        h04 h04Var5 = new h04();
                        h04Var5.b = tL_messages_stickerSet3.set;
                        h04Var5.c = new ArrayList(arrayList6);
                        h04Var5.e = false;
                        h04Var5.f = d0.D0(tL_messages_stickerSet3.set.id, true);
                        h04Var5.g = false;
                        h04Var5.h = arrayList3.contains(Long.valueOf(h04Var5.b.id));
                        arrayList4.add(h04Var5);
                    }
                }
            }
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i6);
                h04 h04Var6 = new h04();
                h04Var6.f = d0.D0(stickerSetCovered.set.id, true);
                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                h04Var6.b = stickerSet4;
                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                    h04Var6.c = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                    TLRPC.TL_messages_stickerSet m0 = d0.m0(hq6.b0(stickerSet4), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                    if (m0 != null) {
                        h04Var6.c = m0.documents;
                    } else {
                        h04Var6.d = hq6.b0(stickerSetCovered.set);
                    }
                } else {
                    h04Var6.c = stickerSetCovered.covers;
                }
                ArrayList arrayList8 = h04Var6.c;
                if (arrayList8 != null && !arrayList8.isEmpty()) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= h04Var6.c.size()) {
                            z2 = false;
                            break;
                        } else {
                            if (!k27.m3((TLRPC.Document) h04Var6.c.get(i7))) {
                                z2 = true;
                                break;
                            }
                            i7++;
                        }
                    }
                    h04Var6.e = !z2;
                    h04Var6.h = arrayList3.contains(Long.valueOf(h04Var6.b.id));
                    h04Var6.g = true;
                    arrayList4.add(h04Var6);
                }
            }
            yz3 yz3Var = t14Var.J;
            if (yz3Var != null) {
                yz3Var.p(t14Var.getEmojipacks());
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
        throw new UnsupportedOperationException("Method not decompiled: d04.H():void");
    }

    @Override // w39
    public final int b() {
        return this.E;
    }

    @Override // w39
    public final long c(int i) {
        return i;
    }

    @Override // w39
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
            char[] cArr = ow3.a;
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

    @Override // w39
    public final void f() {
        F(false);
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        String str;
        String str2;
        Long l;
        TLRPC.Document document;
        int i2;
        int i3 = i;
        t14 t14Var = this.G;
        String[] strArr = t14Var.b1;
        uz3 uz3Var = t14Var.R;
        int i4 = t14Var.d1;
        ArrayList arrayList = t14Var.r1;
        int i5 = s49Var.f;
        View view = s49Var.a;
        boolean z = true;
        h04 h04Var = null;
        if (i5 != 0) {
            SparseIntArray sparseIntArray = this.r;
            if (i5 == 1) {
                vza vzaVar = (vza) view;
                vzaVar.getClass();
                int i6 = sparseIntArray.get(i3);
                if (i3 == this.c) {
                    vzaVar.b(k96.M0(2131750823, null), R.drawable.msg_close, k96.M0(2131754899, null), 0, 0);
                    return;
                }
                if (i3 == this.f) {
                    vzaVar.a(0, k96.M0(2131746168, null));
                    return;
                } else {
                    if (i6 < strArr.length) {
                        vzaVar.a(0, strArr[i6]);
                        return;
                    }
                    try {
                        vzaVar.a(0, ((h04) arrayList.get(i6 - strArr.length)).b.title);
                        return;
                    } catch (Exception unused) {
                        vzaVar.a(0, "");
                        return;
                    }
                }
            }
            byte b = 6;
            byte b2 = 5;
            if (i5 != 5) {
                if (i5 == 6) {
                    j04 j04Var = (j04) view;
                    int i7 = this.x.get(i3);
                    int i8 = uz3Var.J * 3;
                    if (i7 >= 0 && i7 < arrayList.size()) {
                        h04Var = (h04) arrayList.get(i7);
                    }
                    if (h04Var != null) {
                        j04Var.a.setText("+" + ((h04Var.c.size() - i8) + 1));
                        return;
                    }
                    return;
                }
                return;
            }
            l04 l04Var = (l04) view;
            int length = sparseIntArray.get(i3) - strArr.length;
            h04 h04Var2 = (h04) arrayList.get(length);
            int i9 = length - 1;
            h04 h04Var3 = i9 >= 0 ? (h04) arrayList.get(i9) : null;
            if (h04Var2 == null || !h04Var2.g || (h04Var3 != null && !h04Var3.e && h04Var3.f && !y6c.h(i4).p())) {
                z = false;
            }
            if (h04Var2 != null && h04Var2.d != null) {
                hq6.d0(i4).n0(h04Var2.d, false);
                h04Var2.d = null;
            }
            ah8 ah8Var = l04Var.r;
            if (h04Var2 != null) {
                l04Var.x = h04Var2;
                l04Var.y = z;
                l04Var.d.l(h04Var2.b.title, false);
                l04Var.e.setVisibility(h04Var2.i ? 0 : 8);
                if (!h04Var2.f || h04Var2.b.official) {
                    ah8Var.b(k96.M0(2131743637, null), new k04(l04Var, b), false);
                } else {
                    ah8Var.b(k96.M0(2131745889, null), new k04(l04Var, b2), false);
                }
                l04Var.a(false);
                return;
            }
            return;
        }
        c14 c14Var = (c14) view;
        c14Var.a = i3;
        c14Var.e = null;
        if (t14Var.e0) {
            i3--;
        }
        if (this.f >= 0) {
            i3--;
        }
        if (this.d >= 0) {
            i3 -= 2;
        }
        int size = t14Var.getRecentEmoji().size();
        if (i3 < size) {
            String str3 = t14Var.getRecentEmoji().get(i3);
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
                String[][] strArr2 = ow3.f;
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
                    String str4 = (String) vu3.j.get(str);
                    if (str4 != null) {
                        String c = t14.c(str, str4);
                        str2 = str;
                        str = c;
                    }
                }
            }
            str2 = str;
            if (str2 == null) {
                boolean p = y6c.h(i4).p();
                int i12 = uz3Var.J * 3;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList2 = this.y;
                    if (i13 >= arrayList2.size()) {
                        break;
                    }
                    h04 h04Var4 = (h04) arrayList.get(i13);
                    int intValue = ((Integer) arrayList2.get(i13)).intValue() + 1;
                    int size2 = ((h04Var4.f && !h04Var4.g && (h04Var4.e || p)) || h04Var4.h) ? h04Var4.c.size() : Math.min(i12, h04Var4.c.size());
                    int i14 = c14Var.a;
                    if (i14 < intValue || (i2 = i14 - intValue) >= size2) {
                        i13++;
                    } else {
                        c14Var.e = h04Var4;
                        TLRPC.Document document2 = (TLRPC.Document) h04Var4.c.get(i2);
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
            c14Var.setPadding(gl.L(3.0f), gl.L(3.0f), gl.L(3.0f), gl.L(3.0f));
            c14Var.a(null, z);
            if (c14Var.getSpan() == null || c14Var.getSpan().getDocumentId() != l.longValue()) {
                if (document != null) {
                    c14Var.setSpan(new gm(document, (Paint.FontMetricsInt) null));
                } else {
                    c14Var.setSpan(new gm(l.longValue(), (Paint.FontMetricsInt) null));
                }
            }
        } else {
            c14Var.setPadding(0, 0, 0, 0);
            c14Var.a(vu3.f(str), z);
            c14Var.setSpan(null);
        }
        c14Var.setTag(str2);
        c14Var.setContentDescription(str);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        t14 t14Var = this.G;
        if (i != 0) {
            byte b = 5;
            if (i == 1) {
                vza vzaVar = new vza(t14Var.getContext(), true, false, t14Var.a2, t14Var.j2);
                vzaVar.setOnIconClickListener(new yj3(this, b));
                view = vzaVar;
            } else if (i == 3) {
                view = new i04(t14Var, t14Var.getContext());
            } else if (i == 4) {
                Context context = t14Var.getContext();
                r14 r14Var = new r14(t14Var, true);
                t14Var.U = r14Var;
                fu fuVar = new fu(t14Var, context, r14Var);
                fuVar.setPadding(gl.L(8.0f), gl.L(4.0f), gl.L(8.0f), 0);
                fuVar.setClipToPadding(false);
                fuVar.i(new oq1((byte) 2));
                fuVar.setOnItemClickListener(new u(this, (byte) 24));
                view = fuVar;
            } else if (i == 5) {
                view = new l04(t14Var, t14Var.getContext());
            } else if (i != 6) {
                View view2 = new View(t14Var.getContext());
                view2.setLayoutParams(new e49(-1, t14Var.c1));
                view = view2;
            } else {
                Context context2 = t14Var.getContext();
                wjb wjbVar = t14Var.a2;
                j04 j04Var = new j04(context2);
                TextView textView = new TextView(context2);
                j04Var.a = textView;
                textView.setTextSize(1, 13.0f);
                zkb.X(textView, bkb.c6, wjbVar);
                int L = gl.L(11.0f);
                int i2 = bkb.Kf;
                ShapeDrawable b0 = bkb.b0(L, bm2.o(bkb.v0(i2, wjbVar), 99));
                vkb g = zkb.g(i2, 99);
                textView.setBackground(b0);
                zkb.j(textView, b0, g, null, wjbVar);
                textView.setTypeface(gl.o());
                textView.setPadding(gl.L(6.0f), gl.L(1.66f), gl.L(6.0f), gl.L(2.0f));
                j04Var.addView(textView, nme.e(-2, -2, 17));
                view = j04Var;
            }
        } else {
            view = new c14(t14Var.getContext());
        }
        return new y29(view);
    }
}
