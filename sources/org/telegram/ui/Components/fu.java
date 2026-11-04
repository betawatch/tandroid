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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fu extends sj0 {
    public final /* synthetic */ pu c;

    public fu(pu puVar) {
        this.c = puVar;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 1;
    }

    public final int E(int i3) {
        pu puVar = this.c;
        bu buVar = puVar.m1;
        int i10 = puVar.A1 ? 2 : 1;
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = buVar.c;
            if (i11 >= arrayListArr.length || i11 == i3) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (buVar.c.length > 1) {
                size = Math.min(puVar.v1.J * 2, size);
            }
            i10 += size + 2;
            i11++;
        }
        return i10;
    }

    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    @Override // u4.h0
    public final int b() {
        int i3;
        ArrayList arrayList;
        pu puVar = this.c;
        bu buVar = puVar.m1;
        ?? r22 = (org.telegram.messenger.h10.i(puVar.a).q() || (arrayList = buVar.b) == null || arrayList.size() != 1 || !org.telegram.messenger.zi.W3((TLRPC.TL_messages_stickerSet) buVar.b.get(0))) ? 0 : 1;
        puVar.A1 = r22;
        int i10 = r22 + 1;
        if (buVar.c != null) {
            int i11 = 0;
            i3 = 0;
            while (true) {
                ArrayList[] arrayListArr = buVar.c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i11];
                if (arrayList2 != null) {
                    i3 = (arrayListArr.length == 1 ? arrayList2.size() : Math.min(buVar.f.v1.J * 2, arrayList2.size())) + i3 + 1;
                }
                i11++;
            }
        } else {
            i3 = 0;
        }
        return Math.max(0, buVar.c.length - 1) + i10 + i3;
    }

    @Override // u4.h0
    public final int d(int i3) {
        pu puVar = this.c;
        bu buVar = puVar.m1;
        int i10 = 0;
        if (i3 == 0) {
            return 0;
        }
        int i11 = i3 - 1;
        if (puVar.A1) {
            if (i11 == 1) {
                return 3;
            }
            if (i11 > 0) {
                i11 = i3 - 2;
            }
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = buVar.c;
            if (i10 >= arrayListArr.length) {
                return 1;
            }
            if (i11 == i12) {
                return 2;
            }
            int size = arrayListArr[i10].size();
            if (buVar.c.length > 1) {
                size = Math.min(puVar.v1.J * 2, size);
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
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        kw kwVar;
        TLRPC.Document document;
        boolean z10;
        TextView textView;
        boolean z11;
        TLRPC.StickerSet stickerSet;
        ?? r9;
        ArrayList<TLRPC.Document> arrayList;
        pu puVar = this.c;
        u4.s sVar = puVar.v1;
        bu buVar = puVar.m1;
        int i10 = i3 - 1;
        int i11 = d1Var.f;
        View view = d1Var.a;
        CharSequence charSequence = null;
        charSequence = null;
        charSequence = null;
        int i12 = 1;
        if (i11 == 1) {
            if (puVar.A1) {
                i10 = i3 - 2;
            }
            iu iuVar = (iu) view;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                ArrayList[] arrayListArr = buVar.c;
                if (i14 >= arrayListArr.length) {
                    kwVar = null;
                    break;
                }
                int size = arrayListArr[i14].size();
                if (buVar.c.length > 1) {
                    size = Math.min(sVar.J * 2, size);
                }
                if (i10 > i13 && i10 <= i13 + size) {
                    kwVar = (kw) buVar.c[i14].get((i10 - i13) - 1);
                    break;
                } else {
                    i13 += size + 2;
                    i14++;
                }
            }
            p5 p5Var = iuVar.c;
            if ((p5Var != null || kwVar == null) && ((kwVar != null || p5Var == null) && (kwVar == null || p5Var.documentId == kwVar.b))) {
                return;
            }
            if (kwVar == null) {
                iuVar.c = null;
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = kwVar.a;
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.short_name = stickerSet2.short_name;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            if (tL_messages_stickerSet.documents != null) {
                for (int i15 = 0; i15 < kwVar.a.documents.size(); i15++) {
                    document = kwVar.a.documents.get(i15);
                    if (document != null && document.id == kwVar.b) {
                        break;
                    }
                }
            }
            document = null;
            if (document != null) {
                iuVar.c = new p5(document, (Paint.FontMetricsInt) null);
                return;
            } else {
                iuVar.c = new p5(kwVar.b, (Paint.FontMetricsInt) null);
                return;
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            TextView textView2 = (TextView) view;
            textView2.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Lf, puVar.J0);
            textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747013, null)));
            textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(14.0f));
            return;
        }
        if (puVar.A1 && i10 > 0) {
            i10 = i3 - 2;
        }
        int i16 = 0;
        int i17 = 0;
        while (true) {
            ArrayList[] arrayListArr2 = buVar.c;
            if (i16 >= arrayListArr2.length) {
                break;
            }
            int size2 = arrayListArr2[i16].size();
            if (buVar.c.length > 1) {
                size2 = Math.min(sVar.J * 2, size2);
            }
            if (i10 == i17) {
                break;
            }
            i17 += size2 + 2;
            i16++;
        }
        ArrayList arrayList2 = buVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (arrayList2 == null || i16 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) buVar.b.get(i16);
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
            for (int i18 = 0; i18 < tL_messages_stickerSet2.documents.size(); i18++) {
                if (!org.telegram.messenger.zi.n3(tL_messages_stickerSet2.documents.get(i18))) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (i16 < buVar.c.length) {
            lu luVar = (lu) view;
            int size3 = (tL_messages_stickerSet2 == null || (arrayList = tL_messages_stickerSet2.documents) == null) ? 0 : arrayList.size();
            TextView textView3 = luVar.d;
            TextView textView4 = luVar.c;
            pu puVar2 = luVar.y;
            vg.o0 o0Var = luVar.e;
            s70 s70Var = luVar.a;
            luVar.r = tL_messages_stickerSet2;
            if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.set == null) {
                s70Var.setText((CharSequence) null);
            } else {
                try {
                    if (pu.N1 == null) {
                        try {
                            pu.N1 = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                        } catch (Exception e10) {
                            e = e10;
                            r9 = i12;
                            charSequence = charSequence;
                            org.telegram.messenger.a8.g(e, r9);
                            if (charSequence == null) {
                            }
                            s70Var.setText(charSequence);
                            textView = luVar.b;
                            if (textView != null) {
                            }
                            if (z10) {
                            }
                            if (o0Var != null) {
                            }
                            if (textView4 != null) {
                            }
                            if (textView3 != null) {
                            }
                            if (tL_messages_stickerSet2 != null) {
                            }
                            z11 = false;
                            luVar.a(z11, false);
                        }
                    }
                    Matcher matcher = pu.N1.matcher(tL_messages_stickerSet2.set.title);
                    while (true) {
                        ?? r82 = charSequence;
                        if (!matcher.find()) {
                            break;
                        }
                        if (charSequence == null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messages_stickerSet2.set.title);
                            try {
                                s70Var.setMovementMethod(new org.telegram.messenger.c0(i12));
                                r82 = spannableStringBuilder;
                            } catch (Exception e11) {
                                e = e11;
                                r9 = i12;
                                charSequence = spannableStringBuilder;
                                org.telegram.messenger.a8.g(e, r9);
                                if (charSequence == null) {
                                }
                                s70Var.setText(charSequence);
                                textView = luVar.b;
                                if (textView != null) {
                                }
                                if (z10) {
                                    Pattern pattern = pu.N1;
                                    if (!org.telegram.messenger.h10.i(puVar2.a).q()) {
                                    }
                                }
                                if (o0Var != null) {
                                }
                                if (textView4 != null) {
                                }
                                if (textView3 != null) {
                                }
                                if (tL_messages_stickerSet2 != null) {
                                }
                                z11 = false;
                                luVar.a(z11, false);
                            }
                        }
                        int start = matcher.start();
                        int end = matcher.end();
                        if (tL_messages_stickerSet2.set.title.charAt(start) != '@') {
                            start++;
                        }
                        Matcher matcher2 = matcher;
                        r82.setSpan(new ku(luVar, tL_messages_stickerSet2.set.title.subSequence(start + 1, end).toString()), start, end, 0);
                        matcher = matcher2;
                        i12 = 1;
                        charSequence = r82;
                    }
                } catch (Exception e12) {
                    e = e12;
                    r9 = 1;
                    charSequence = charSequence;
                }
                if (charSequence == null) {
                    charSequence = tL_messages_stickerSet2.set.title;
                }
                s70Var.setText(charSequence);
            }
            textView = luVar.b;
            if (textView != null) {
                if (tL_messages_stickerSet2 == null || (stickerSet = tL_messages_stickerSet2.set) == null || stickerSet.emojis) {
                    textView.setText(org.telegram.messenger.bd.G(size3, "EmojiCount", new Object[0]));
                } else {
                    textView.setText(org.telegram.messenger.bd.G(size3, "Stickers", new Object[0]));
                }
            }
            if (z10 && o0Var != null) {
                Pattern pattern2 = pu.N1;
                if (!org.telegram.messenger.h10.i(puVar2.a).q()) {
                    o0Var.setVisibility(0);
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
            if (o0Var != null) {
                o0Var.setVisibility(8);
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (tL_messages_stickerSet2 != null) {
                Pattern pattern3 = pu.N1;
                if (org.telegram.messenger.li.b0(puVar2.a).B0(tL_messages_stickerSet2.set.id, true)) {
                    z11 = true;
                    luVar.a(z11, false);
                }
            }
            z11 = false;
            luVar.a(z11, false);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        View view2;
        pu puVar = this.c;
        if (i3 == 0) {
            view = puVar.l1;
        } else {
            if (i3 == 1) {
                iu iuVar = new iu(puVar.getContext());
                iuVar.a = new org.telegram.messenger.bc[2];
                view2 = iuVar;
            } else if (i3 == 2) {
                view2 = new lu(puVar, puVar.getContext(), puVar.m1.c.length <= 1);
            } else if (i3 == 3) {
                view2 = new TextView(puVar.getContext());
            } else if (i3 == 4) {
                View ouVar = new ou(puVar.getContext());
                int i10 = org.telegram.ui.ActionBar.k6.zf;
                Pattern pattern = pu.N1;
                org.telegram.ui.ActionBar.r6.i(i10, ouVar, puVar.J0);
                u4.p0 p0Var = new u4.p0(-1, org.telegram.messenger.g0.f1());
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = org.telegram.messenger.g0.L(14.0f);
                ouVar.setLayoutParams(p0Var);
                view2 = ouVar;
            } else {
                view = null;
            }
            view = view2;
        }
        return new bj0(view);
    }
}
