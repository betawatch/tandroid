// default package

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fx3 extends n39 {
    public final /* synthetic */ qx3 c;

    public fx3(qx3 qx3Var) {
        this.c = qx3Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 1;
    }

    public final int E(int i) {
        qx3 qx3Var = this.c;
        bx3 bx3Var = qx3Var.o1;
        int i2 = qx3Var.C1 ? 2 : 1;
        int i3 = 0;
        while (true) {
            ArrayList[] arrayListArr = bx3Var.c;
            if (i3 >= arrayListArr.length || i3 == i) {
                break;
            }
            int size = arrayListArr[i3].size();
            if (bx3Var.c.length > 1) {
                size = Math.min(qx3Var.x1.J << 1, size);
            }
            i2 += size + 2;
            i3++;
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    @Override // w39
    public final int b() {
        int i;
        ArrayList arrayList;
        qx3 qx3Var = this.c;
        bx3 bx3Var = qx3Var.o1;
        ?? r1 = (y6c.h(qx3Var.a).p() || (arrayList = bx3Var.b) == null || arrayList.size() != 1 || !k27.U3((TLRPC.TL_messages_stickerSet) bx3Var.b.get(0))) ? 0 : 1;
        qx3Var.C1 = r1;
        int i2 = r1 + 1;
        if (bx3Var.c != null) {
            int i3 = 0;
            i = 0;
            while (true) {
                ArrayList[] arrayListArr = bx3Var.c;
                if (i3 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i3];
                if (arrayList2 != null) {
                    i = (arrayListArr.length == 1 ? arrayList2.size() : Math.min(bx3Var.f.x1.J << 1, arrayList2.size())) + i + 1;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        return Math.max(0, bx3Var.c.length - 1) + i2 + i;
    }

    @Override // w39
    public final int d(int i) {
        qx3 qx3Var = this.c;
        bx3 bx3Var = qx3Var.o1;
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = i - 1;
        if (qx3Var.C1) {
            if (i3 == 1) {
                return 3;
            }
            if (i3 > 0) {
                i3 = i - 2;
            }
        }
        int i4 = 0;
        while (true) {
            ArrayList[] arrayListArr = bx3Var.c;
            if (i2 >= arrayListArr.length) {
                return 1;
            }
            if (i3 == i4) {
                return 2;
            }
            int size = arrayListArr[i2].size();
            if (bx3Var.c.length > 1) {
                size = Math.min(qx3Var.x1.J << 1, size);
            }
            int i5 = size + 1 + i4;
            if (i3 == i5) {
                return 4;
            }
            i4 = i5 + 1;
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a5  */
    /* JADX WARN: Type inference failed for: r6v12, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        zz3 zz3Var;
        TLRPC.Document document;
        boolean z;
        TextView textView;
        boolean z2;
        TLRPC.StickerSet stickerSet;
        ?? r7;
        ArrayList<TLRPC.Document> arrayList;
        qx3 qx3Var = this.c;
        r35 r35Var = qx3Var.x1;
        bx3 bx3Var = qx3Var.o1;
        int i2 = i - 1;
        int i3 = s49Var.f;
        View view = s49Var.a;
        CharSequence charSequence = null;
        charSequence = null;
        charSequence = null;
        byte b = 1;
        if (i3 == 1) {
            if (qx3Var.C1) {
                i2 = i - 2;
            }
            ix3 ix3Var = (ix3) view;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                ArrayList[] arrayListArr = bx3Var.c;
                if (i4 >= arrayListArr.length) {
                    zz3Var = null;
                    break;
                }
                int size = arrayListArr[i4].size();
                if (bx3Var.c.length > 1) {
                    size = Math.min(r35Var.J << 1, size);
                }
                if (i2 > i5 && i2 <= i5 + size) {
                    zz3Var = (zz3) bx3Var.c[i4].get((i2 - i5) - 1);
                    break;
                } else {
                    i5 += size + 2;
                    i4++;
                }
            }
            gm gmVar = ix3Var.c;
            if (gmVar != null || zz3Var == null) {
                if (zz3Var == null) {
                    if (gmVar == null) {
                        return;
                    }
                } else if (gmVar.documentId == zz3Var.b) {
                    return;
                }
            }
            if (zz3Var == null) {
                ix3Var.c = null;
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zz3Var.a;
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.short_name = stickerSet2.short_name;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            if (tL_messages_stickerSet.documents != null) {
                for (int i6 = 0; i6 < zz3Var.a.documents.size(); i6++) {
                    document = zz3Var.a.documents.get(i6);
                    if (document != null && document.id == zz3Var.b) {
                        break;
                    }
                }
            }
            document = null;
            if (document != null) {
                ix3Var.c = new gm(document, (Paint.FontMetricsInt) null);
                return;
            } else {
                ix3Var.c = new gm(zz3Var.b, (Paint.FontMetricsInt) null);
                return;
            }
        }
        if (i3 != 2) {
            if (i3 == 3) {
                TextView textView2 = (TextView) view;
                textView2.setTextSize(1, 13.0f);
                zkb.X(textView2, bkb.Nf, qx3Var.J0);
                textView2.setText(gl.S2(k96.M0(2131746814, null)));
                textView2.setPadding(gl.L(14.0f), 0, gl.L(30.0f), gl.L(14.0f));
                return;
            }
            return;
        }
        if (qx3Var.C1 && i2 > 0) {
            i2 = i - 2;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            ArrayList[] arrayListArr2 = bx3Var.c;
            if (i7 >= arrayListArr2.length) {
                break;
            }
            int size2 = arrayListArr2[i7].size();
            if (bx3Var.c.length > 1) {
                size2 = Math.min(r35Var.J << 1, size2);
            }
            if (i2 == i8) {
                break;
            }
            i8 += size2 + 2;
            i7++;
        }
        ArrayList arrayList2 = bx3Var.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (arrayList2 == null || i7 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) bx3Var.b.get(i7);
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
            for (int i9 = 0; i9 < tL_messages_stickerSet2.documents.size(); i9++) {
                if (!k27.m3(tL_messages_stickerSet2.documents.get(i9))) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (i7 < bx3Var.c.length) {
            mx3 mx3Var = (mx3) view;
            int size3 = (tL_messages_stickerSet2 == null || (arrayList = tL_messages_stickerSet2.documents) == null) ? 0 : arrayList.size();
            TextView textView3 = mx3Var.d;
            TextView textView4 = mx3Var.c;
            qx3 qx3Var2 = mx3Var.y;
            ah8 ah8Var = mx3Var.e;
            l46 l46Var = mx3Var.a;
            mx3Var.r = tL_messages_stickerSet2;
            if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.set == null) {
                l46Var.setText((CharSequence) null);
            } else {
                try {
                    Pattern pattern = qx3.P1;
                    if (pattern == null) {
                        try {
                            pattern = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                            qx3.P1 = pattern;
                        } catch (Exception e) {
                            e = e;
                            r7 = b;
                            charSequence = charSequence;
                            fa4.g(e, r7);
                            if (charSequence == null) {
                            }
                            l46Var.setText(charSequence);
                            textView = mx3Var.b;
                            if (textView != null) {
                            }
                            if (z) {
                            }
                            if (ah8Var != null) {
                            }
                            if (textView4 != null) {
                            }
                            if (textView3 != null) {
                            }
                            if (tL_messages_stickerSet2 != null) {
                            }
                            z2 = false;
                            mx3Var.a(z2, false);
                        }
                    }
                    Matcher matcher = pattern.matcher(tL_messages_stickerSet2.set.title);
                    while (true) {
                        ?? r6 = charSequence;
                        if (!matcher.find()) {
                            break;
                        }
                        if (charSequence == null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messages_stickerSet2.set.title);
                            try {
                                l46Var.setMovementMethod(new cl(b));
                                r6 = spannableStringBuilder;
                            } catch (Exception e2) {
                                e = e2;
                                r7 = b;
                                charSequence = spannableStringBuilder;
                                fa4.g(e, r7);
                                if (charSequence == null) {
                                }
                                l46Var.setText(charSequence);
                                textView = mx3Var.b;
                                if (textView != null) {
                                }
                                if (z) {
                                    Pattern pattern2 = qx3.P1;
                                    if (!y6c.h(qx3Var2.a).p()) {
                                    }
                                }
                                if (ah8Var != null) {
                                }
                                if (textView4 != null) {
                                }
                                if (textView3 != null) {
                                }
                                if (tL_messages_stickerSet2 != null) {
                                }
                                z2 = false;
                                mx3Var.a(z2, false);
                            }
                        }
                        int start = matcher.start();
                        int end = matcher.end();
                        if (tL_messages_stickerSet2.set.title.charAt(start) != '@') {
                            start++;
                        }
                        r6.setSpan(new lx3(mx3Var, tL_messages_stickerSet2.set.title.subSequence(start + 1, end).toString()), start, end, 0);
                        b = 1;
                        charSequence = r6;
                    }
                } catch (Exception e3) {
                    e = e3;
                    r7 = 1;
                    charSequence = charSequence;
                }
                if (charSequence == null) {
                    charSequence = tL_messages_stickerSet2.set.title;
                }
                l46Var.setText(charSequence);
            }
            textView = mx3Var.b;
            if (textView != null) {
                if (tL_messages_stickerSet2 == null || (stickerSet = tL_messages_stickerSet2.set) == null || stickerSet.emojis) {
                    textView.setText(k96.G(size3, "EmojiCount", new Object[0]));
                } else {
                    textView.setText(k96.G(size3, "Stickers", new Object[0]));
                }
            }
            if (z && ah8Var != null) {
                Pattern pattern22 = qx3.P1;
                if (!y6c.h(qx3Var2.a).p()) {
                    ah8Var.setVisibility(0);
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    }
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                        return;
                    }
                    return;
                }
            }
            if (ah8Var != null) {
                ah8Var.setVisibility(8);
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (tL_messages_stickerSet2 != null) {
                Pattern pattern3 = qx3.P1;
                if (hq6.d0(qx3Var2.a).D0(tL_messages_stickerSet2.set.id, true)) {
                    z2 = true;
                    mx3Var.a(z2, false);
                }
            }
            z2 = false;
            mx3Var.a(z2, false);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        View px3Var;
        qx3 qx3Var = this.c;
        if (i == 0) {
            view = qx3Var.n1;
        } else {
            if (i == 1) {
                ix3 ix3Var = new ix3(qx3Var.getContext());
                ix3Var.a = new il5[2];
                view = ix3Var;
            } else {
                if (i == 2) {
                    px3Var = new mx3(qx3Var, qx3Var.getContext(), qx3Var.o1.c.length <= 1);
                } else if (i == 3) {
                    px3Var = new TextView(qx3Var.getContext());
                } else if (i == 4) {
                    px3Var = new px3(qx3Var.getContext());
                    int i2 = bkb.Bf;
                    Pattern pattern = qx3.P1;
                    zkb.h(i2, qx3Var.J0, px3Var);
                    e49 e49Var = new e49(-1, gl.e1());
                    ((ViewGroup.MarginLayoutParams) e49Var).topMargin = gl.L(14.0f);
                    px3Var.setLayoutParams(e49Var);
                } else {
                    view = null;
                }
                view = px3Var;
            }
        }
        return new y29(view);
    }
}
