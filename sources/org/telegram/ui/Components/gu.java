package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class gu extends oj0 {
    public final /* synthetic */ qu c;

    public gu(qu quVar) {
        this.c = quVar;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 1;
    }

    public final int E(int i7) {
        qu quVar = this.c;
        cu cuVar = quVar.o1;
        int i10 = quVar.C1 ? 2 : 1;
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = cuVar.c;
            if (i11 >= arrayListArr.length || i11 == i7) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (cuVar.c.length > 1) {
                size = Math.min(quVar.x1.J * 2, size);
            }
            i10 += size + 2;
            i11++;
        }
        return i10;
    }

    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    @Override // v4.g0
    public final int b() {
        int i7;
        ArrayList arrayList;
        qu quVar = this.c;
        cu cuVar = quVar.o1;
        ?? r22 = (org.telegram.messenger.p10.i(quVar.a).q() || (arrayList = cuVar.b) == null || arrayList.size() != 1 || !org.telegram.messenger.ij.V3((TLRPC.TL_messages_stickerSet) cuVar.b.get(0))) ? 0 : 1;
        quVar.C1 = r22;
        int i10 = r22 + 1;
        if (cuVar.c != null) {
            int i11 = 0;
            i7 = 0;
            while (true) {
                ArrayList[] arrayListArr = cuVar.c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i11];
                if (arrayList2 != null) {
                    i7 = (arrayListArr.length == 1 ? arrayList2.size() : Math.min(cuVar.f.x1.J * 2, arrayList2.size())) + i7 + 1;
                }
                i11++;
            }
        } else {
            i7 = 0;
        }
        return Math.max(0, cuVar.c.length - 1) + i10 + i7;
    }

    @Override // v4.g0
    public final int d(int i7) {
        qu quVar = this.c;
        cu cuVar = quVar.o1;
        int i10 = 0;
        if (i7 == 0) {
            return 0;
        }
        int i11 = i7 - 1;
        if (quVar.C1) {
            if (i11 == 1) {
                return 3;
            }
            if (i11 > 0) {
                i11 = i7 - 2;
            }
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = cuVar.c;
            if (i10 >= arrayListArr.length) {
                return 1;
            }
            if (i11 == i12) {
                return 2;
            }
            int size = arrayListArr[i10].size();
            if (cuVar.c.length > 1) {
                size = Math.min(quVar.x1.J * 2, size);
            }
            int i13 = size + 1 + i12;
            if (i11 == i13) {
                return 4;
            }
            i12 = i13 + 1;
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b4  */
    /* JADX WARN: Type inference failed for: r8v12, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v22 */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        lw lwVar;
        TLRPC.Document document;
        boolean z9;
        TextView textView;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        ?? r92;
        ArrayList<TLRPC.Document> arrayList;
        qu quVar = this.c;
        v4.s sVar = quVar.x1;
        cu cuVar = quVar.o1;
        int i10 = i7 - 1;
        int i11 = d1Var.f;
        View view = d1Var.a;
        CharSequence charSequence = null;
        charSequence = null;
        charSequence = null;
        int i12 = 1;
        if (i11 == 1) {
            if (quVar.C1) {
                i10 = i7 - 2;
            }
            ju juVar = (ju) view;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                ArrayList[] arrayListArr = cuVar.c;
                if (i14 >= arrayListArr.length) {
                    lwVar = null;
                    break;
                }
                int size = arrayListArr[i14].size();
                if (cuVar.c.length > 1) {
                    size = Math.min(sVar.J * 2, size);
                }
                if (i10 > i13 && i10 <= i13 + size) {
                    lwVar = (lw) cuVar.c[i14].get((i10 - i13) - 1);
                    break;
                } else {
                    i13 += size + 2;
                    i14++;
                }
            }
            q5 q5Var = juVar.c;
            if ((q5Var != null || lwVar == null) && ((lwVar != null || q5Var == null) && (lwVar == null || q5Var.documentId == lwVar.b))) {
                return;
            }
            if (lwVar == null) {
                juVar.c = null;
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = lwVar.a;
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.short_name = stickerSet2.short_name;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            if (tL_messages_stickerSet.documents != null) {
                for (int i15 = 0; i15 < lwVar.a.documents.size(); i15++) {
                    document = lwVar.a.documents.get(i15);
                    if (document != null && document.id == lwVar.b) {
                        break;
                    }
                }
            }
            document = null;
            if (document != null) {
                juVar.c = new q5(document, (Paint.FontMetricsInt) null);
                return;
            } else {
                juVar.c = new q5(lwVar.b, (Paint.FontMetricsInt) null);
                return;
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            TextView textView2 = (TextView) view;
            textView2.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Lf, quVar.I0);
            textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131747005, null)));
            textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(14.0f));
            return;
        }
        if (quVar.C1 && i10 > 0) {
            i10 = i7 - 2;
        }
        int i16 = 0;
        int i17 = 0;
        while (true) {
            ArrayList[] arrayListArr2 = cuVar.c;
            if (i16 >= arrayListArr2.length) {
                break;
            }
            int size2 = arrayListArr2[i16].size();
            if (cuVar.c.length > 1) {
                size2 = Math.min(sVar.J * 2, size2);
            }
            if (i10 == i17) {
                break;
            }
            i17 += size2 + 2;
            i16++;
        }
        ArrayList arrayList2 = cuVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (arrayList2 == null || i16 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) cuVar.b.get(i16);
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
            for (int i18 = 0; i18 < tL_messages_stickerSet2.documents.size(); i18++) {
                if (!org.telegram.messenger.ij.m3(tL_messages_stickerSet2.documents.get(i18))) {
                    z9 = true;
                    break;
                }
            }
        }
        z9 = false;
        if (i16 < cuVar.c.length) {
            mu muVar = (mu) view;
            int size3 = (tL_messages_stickerSet2 == null || (arrayList = tL_messages_stickerSet2.documents) == null) ? 0 : arrayList.size();
            TextView textView3 = muVar.d;
            TextView textView4 = muVar.c;
            qu quVar2 = muVar.y;
            ug.p0 p0Var = muVar.e;
            w70 w70Var = muVar.a;
            muVar.r = tL_messages_stickerSet2;
            if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.set == null) {
                w70Var.setText((CharSequence) null);
            } else {
                try {
                    if (qu.P1 == null) {
                        try {
                            qu.P1 = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                        } catch (Exception e10) {
                            e = e10;
                            r92 = i12;
                            charSequence = charSequence;
                            org.telegram.messenger.a8.g(e, r92);
                            if (charSequence == null) {
                            }
                            w70Var.setText(charSequence);
                            textView = muVar.b;
                            if (textView != null) {
                            }
                            if (z9) {
                            }
                            if (p0Var != null) {
                            }
                            if (textView4 != null) {
                            }
                            if (textView3 != null) {
                            }
                            if (tL_messages_stickerSet2 != null) {
                            }
                            z10 = false;
                            muVar.a(z10, false);
                        }
                    }
                    Matcher matcher = qu.P1.matcher(tL_messages_stickerSet2.set.title);
                    while (true) {
                        ?? r82 = charSequence;
                        if (!matcher.find()) {
                            break;
                        }
                        if (charSequence == null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messages_stickerSet2.set.title);
                            try {
                                w70Var.setMovementMethod(new org.telegram.messenger.c0(i12));
                                r82 = spannableStringBuilder;
                            } catch (Exception e11) {
                                e = e11;
                                r92 = i12;
                                charSequence = spannableStringBuilder;
                                org.telegram.messenger.a8.g(e, r92);
                                if (charSequence == null) {
                                }
                                w70Var.setText(charSequence);
                                textView = muVar.b;
                                if (textView != null) {
                                }
                                if (z9) {
                                    Pattern pattern = qu.P1;
                                    if (!org.telegram.messenger.p10.i(quVar2.a).q()) {
                                    }
                                }
                                if (p0Var != null) {
                                }
                                if (textView4 != null) {
                                }
                                if (textView3 != null) {
                                }
                                if (tL_messages_stickerSet2 != null) {
                                }
                                z10 = false;
                                muVar.a(z10, false);
                            }
                        }
                        int start = matcher.start();
                        int end = matcher.end();
                        if (tL_messages_stickerSet2.set.title.charAt(start) != '@') {
                            start++;
                        }
                        Matcher matcher2 = matcher;
                        r82.setSpan(new lu(muVar, tL_messages_stickerSet2.set.title.subSequence(start + 1, end).toString()), start, end, 0);
                        matcher = matcher2;
                        i12 = 1;
                        charSequence = r82;
                    }
                } catch (Exception e12) {
                    e = e12;
                    r92 = 1;
                    charSequence = charSequence;
                }
                if (charSequence == null) {
                    charSequence = tL_messages_stickerSet2.set.title;
                }
                w70Var.setText(charSequence);
            }
            textView = muVar.b;
            if (textView != null) {
                if (tL_messages_stickerSet2 == null || (stickerSet = tL_messages_stickerSet2.set) == null || stickerSet.emojis) {
                    textView.setText(org.telegram.messenger.id.G(size3, "EmojiCount", new Object[0]));
                } else {
                    textView.setText(org.telegram.messenger.id.G(size3, "Stickers", new Object[0]));
                }
            }
            if (z9 && p0Var != null) {
                Pattern pattern2 = qu.P1;
                if (!org.telegram.messenger.p10.i(quVar2.a).q()) {
                    p0Var.setVisibility(0);
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
            if (p0Var != null) {
                p0Var.setVisibility(8);
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (tL_messages_stickerSet2 != null) {
                Pattern pattern3 = qu.P1;
                if (org.telegram.messenger.ui.b0(quVar2.a).B0(tL_messages_stickerSet2.set.id, true)) {
                    z10 = true;
                    muVar.a(z10, false);
                }
            }
            z10 = false;
            muVar.a(z10, false);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        qu quVar = this.c;
        if (i7 == 0) {
            view = quVar.n1;
        } else {
            if (i7 == 1) {
                ju juVar = new ju(quVar.getContext());
                juVar.a = new org.telegram.messenger.ic[2];
                view2 = juVar;
            } else if (i7 == 2) {
                view2 = new mu(quVar, quVar.getContext(), quVar.o1.c.length <= 1);
            } else if (i7 == 3) {
                view2 = new TextView(quVar.getContext());
            } else if (i7 == 4) {
                View puVar = new pu(quVar.getContext());
                int i10 = org.telegram.ui.ActionBar.m6.zf;
                Pattern pattern = qu.P1;
                org.telegram.ui.ActionBar.t6.h(i10, puVar, quVar.I0);
                v4.o0 o0Var = new v4.o0(-1, org.telegram.messenger.g0.f1());
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.g0.L(14.0f);
                puVar.setLayoutParams(o0Var);
                view2 = puVar;
            } else {
                view = null;
            }
            view = view2;
        }
        return new xi0(view);
    }
}
