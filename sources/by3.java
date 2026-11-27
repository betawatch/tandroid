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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class by3 extends c79 {
    public final /* synthetic */ ly3 c;

    public by3(ly3 ly3Var) {
        this.c = ly3Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 1;
    }

    public final int E(int i) {
        ly3 ly3Var = this.c;
        xx3 xx3Var = ly3Var.o1;
        int i2 = ly3Var.C1 ? 2 : 1;
        int i3 = 0;
        while (true) {
            ArrayList[] arrayListArr = xx3Var.c;
            if (i3 >= arrayListArr.length || i3 == i) {
                break;
            }
            int size = arrayListArr[i3].size();
            if (xx3Var.c.length > 1) {
                size = Math.min(ly3Var.x1.J << 1, size);
            }
            i2 += size + 2;
            i3++;
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    @Override // j79
    public final int b() {
        int i;
        ArrayList arrayList;
        ly3 ly3Var = this.c;
        xx3 xx3Var = ly3Var.o1;
        ?? r1 = (yac.h(ly3Var.a).p() || (arrayList = xx3Var.b) == null || arrayList.size() != 1 || !r47.U3((TLRPC.TL_messages_stickerSet) xx3Var.b.get(0))) ? 0 : 1;
        ly3Var.C1 = r1;
        int i2 = r1 + 1;
        if (xx3Var.c != null) {
            int i3 = 0;
            i = 0;
            while (true) {
                ArrayList[] arrayListArr = xx3Var.c;
                if (i3 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i3];
                if (arrayList2 != null) {
                    i = (arrayListArr.length == 1 ? arrayList2.size() : Math.min(xx3Var.f.x1.J << 1, arrayList2.size())) + i + 1;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        return Math.max(0, xx3Var.c.length - 1) + i2 + i;
    }

    @Override // j79
    public final int d(int i) {
        ly3 ly3Var = this.c;
        xx3 xx3Var = ly3Var.o1;
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = i - 1;
        if (ly3Var.C1) {
            if (i3 == 1) {
                return 3;
            }
            if (i3 > 0) {
                i3 = i - 2;
            }
        }
        int i4 = 0;
        while (true) {
            ArrayList[] arrayListArr = xx3Var.c;
            if (i2 >= arrayListArr.length) {
                return 1;
            }
            if (i3 == i4) {
                return 2;
            }
            int size = arrayListArr[i2].size();
            if (xx3Var.c.length > 1) {
                size = Math.min(ly3Var.x1.J << 1, size);
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
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        u04 u04Var;
        TLRPC.Document document;
        boolean z;
        TextView textView;
        boolean z2;
        TLRPC.StickerSet stickerSet;
        ?? r7;
        ArrayList<TLRPC.Document> arrayList;
        ly3 ly3Var = this.c;
        u55 u55Var = ly3Var.x1;
        xx3 xx3Var = ly3Var.o1;
        int i2 = i - 1;
        int i3 = f89Var.f;
        View view = f89Var.a;
        CharSequence charSequence = null;
        charSequence = null;
        charSequence = null;
        byte b = 1;
        if (i3 == 1) {
            if (ly3Var.C1) {
                i2 = i - 2;
            }
            ey3 ey3Var = (ey3) view;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                ArrayList[] arrayListArr = xx3Var.c;
                if (i4 >= arrayListArr.length) {
                    u04Var = null;
                    break;
                }
                int size = arrayListArr[i4].size();
                if (xx3Var.c.length > 1) {
                    size = Math.min(u55Var.J << 1, size);
                }
                if (i2 > i5 && i2 <= i5 + size) {
                    u04Var = (u04) xx3Var.c[i4].get((i2 - i5) - 1);
                    break;
                } else {
                    i5 += size + 2;
                    i4++;
                }
            }
            hm hmVar = ey3Var.c;
            if (hmVar != null || u04Var == null) {
                if (u04Var == null) {
                    if (hmVar == null) {
                        return;
                    }
                } else if (hmVar.documentId == u04Var.b) {
                    return;
                }
            }
            if (u04Var == null) {
                ey3Var.c = null;
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = u04Var.a;
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.short_name = stickerSet2.short_name;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            if (tL_messages_stickerSet.documents != null) {
                for (int i6 = 0; i6 < u04Var.a.documents.size(); i6++) {
                    document = u04Var.a.documents.get(i6);
                    if (document != null && document.id == u04Var.b) {
                        break;
                    }
                }
            }
            document = null;
            if (document != null) {
                ey3Var.c = new hm(document, (Paint.FontMetricsInt) null);
                return;
            } else {
                ey3Var.c = new hm(u04Var.b, (Paint.FontMetricsInt) null);
                return;
            }
        }
        if (i3 != 2) {
            if (i3 == 3) {
                TextView textView2 = (TextView) view;
                textView2.setTextSize(1, 13.0f);
                yob.X(textView2, aob.Of, ly3Var.J0);
                textView2.setText(hl.S2(ob6.M0(2131746734, null)));
                textView2.setPadding(hl.L(14.0f), 0, hl.L(30.0f), hl.L(14.0f));
                return;
            }
            return;
        }
        if (ly3Var.C1 && i2 > 0) {
            i2 = i - 2;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            ArrayList[] arrayListArr2 = xx3Var.c;
            if (i7 >= arrayListArr2.length) {
                break;
            }
            int size2 = arrayListArr2[i7].size();
            if (xx3Var.c.length > 1) {
                size2 = Math.min(u55Var.J << 1, size2);
            }
            if (i2 == i8) {
                break;
            }
            i8 += size2 + 2;
            i7++;
        }
        ArrayList arrayList2 = xx3Var.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (arrayList2 == null || i7 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) xx3Var.b.get(i7);
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
            for (int i9 = 0; i9 < tL_messages_stickerSet2.documents.size(); i9++) {
                if (!r47.m3(tL_messages_stickerSet2.documents.get(i9))) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (i7 < xx3Var.c.length) {
            hy3 hy3Var = (hy3) view;
            int size3 = (tL_messages_stickerSet2 == null || (arrayList = tL_messages_stickerSet2.documents) == null) ? 0 : arrayList.size();
            TextView textView3 = hy3Var.d;
            TextView textView4 = hy3Var.c;
            ly3 ly3Var2 = hy3Var.y;
            ok8 ok8Var = hy3Var.e;
            p66 p66Var = hy3Var.a;
            hy3Var.r = tL_messages_stickerSet2;
            if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.set == null) {
                p66Var.setText((CharSequence) null);
            } else {
                try {
                    Pattern pattern = ly3.P1;
                    if (pattern == null) {
                        try {
                            pattern = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                            ly3.P1 = pattern;
                        } catch (Exception e) {
                            e = e;
                            r7 = b;
                            charSequence = charSequence;
                            cc4.g(e, r7);
                            if (charSequence == null) {
                            }
                            p66Var.setText(charSequence);
                            textView = hy3Var.b;
                            if (textView != null) {
                            }
                            if (z) {
                            }
                            if (ok8Var != null) {
                            }
                            if (textView4 != null) {
                            }
                            if (textView3 != null) {
                            }
                            if (tL_messages_stickerSet2 != null) {
                            }
                            z2 = false;
                            hy3Var.a(z2, false);
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
                                p66Var.setMovementMethod(new dl(b));
                                r6 = spannableStringBuilder;
                            } catch (Exception e2) {
                                e = e2;
                                r7 = b;
                                charSequence = spannableStringBuilder;
                                cc4.g(e, r7);
                                if (charSequence == null) {
                                }
                                p66Var.setText(charSequence);
                                textView = hy3Var.b;
                                if (textView != null) {
                                }
                                if (z) {
                                    Pattern pattern2 = ly3.P1;
                                    if (!yac.h(ly3Var2.a).p()) {
                                    }
                                }
                                if (ok8Var != null) {
                                }
                                if (textView4 != null) {
                                }
                                if (textView3 != null) {
                                }
                                if (tL_messages_stickerSet2 != null) {
                                }
                                z2 = false;
                                hy3Var.a(z2, false);
                            }
                        }
                        int start = matcher.start();
                        int end = matcher.end();
                        if (tL_messages_stickerSet2.set.title.charAt(start) != '@') {
                            start++;
                        }
                        r6.setSpan(new gy3(hy3Var, tL_messages_stickerSet2.set.title.subSequence(start + 1, end).toString()), start, end, 0);
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
                p66Var.setText(charSequence);
            }
            textView = hy3Var.b;
            if (textView != null) {
                if (tL_messages_stickerSet2 == null || (stickerSet = tL_messages_stickerSet2.set) == null || stickerSet.emojis) {
                    textView.setText(ob6.G(size3, "EmojiCount", new Object[0]));
                } else {
                    textView.setText(ob6.G(size3, "Stickers", new Object[0]));
                }
            }
            if (z && ok8Var != null) {
                Pattern pattern22 = ly3.P1;
                if (!yac.h(ly3Var2.a).p()) {
                    ok8Var.setVisibility(0);
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
            if (ok8Var != null) {
                ok8Var.setVisibility(8);
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (tL_messages_stickerSet2 != null) {
                Pattern pattern3 = ly3.P1;
                if (ls6.d0(ly3Var2.a).D0(tL_messages_stickerSet2.set.id, true)) {
                    z2 = true;
                    hy3Var.a(z2, false);
                }
            }
            z2 = false;
            hy3Var.a(z2, false);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        View ky3Var;
        ly3 ly3Var = this.c;
        if (i == 0) {
            view = ly3Var.n1;
        } else {
            if (i == 1) {
                ey3 ey3Var = new ey3(ly3Var.getContext());
                ey3Var.a = new ln5[2];
                view = ey3Var;
            } else {
                if (i == 2) {
                    ky3Var = new hy3(ly3Var, ly3Var.getContext(), ly3Var.o1.c.length <= 1);
                } else if (i == 3) {
                    ky3Var = new TextView(ly3Var.getContext());
                } else if (i == 4) {
                    ky3Var = new ky3(ly3Var.getContext());
                    int i2 = aob.Cf;
                    Pattern pattern = ly3.P1;
                    yob.h(i2, ly3Var.J0, ky3Var);
                    r79 r79Var = new r79(-1, hl.e1());
                    ((ViewGroup.MarginLayoutParams) r79Var).topMargin = hl.L(14.0f);
                    ky3Var.setLayoutParams(r79Var);
                } else {
                    view = null;
                }
                view = ky3Var;
            }
        }
        return new n69(view);
    }
}
