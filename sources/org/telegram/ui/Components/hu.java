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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class hu extends oj0 {
    public final /* synthetic */ ru c;

    public hu(ru ruVar) {
        this.c = ruVar;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 1;
    }

    public final int E(int i7) {
        ru ruVar = this.c;
        du duVar = ruVar.l1;
        int i10 = ruVar.z1 ? 2 : 1;
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = duVar.c;
            if (i11 >= arrayListArr.length || i11 == i7) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (duVar.c.length > 1) {
                size = Math.min(ruVar.u1.J * 2, size);
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
        ru ruVar = this.c;
        du duVar = ruVar.l1;
        ?? r22 = (org.telegram.messenger.p10.i(ruVar.a).q() || (arrayList = duVar.b) == null || arrayList.size() != 1 || !org.telegram.messenger.ij.W3((TLRPC.TL_messages_stickerSet) duVar.b.get(0))) ? 0 : 1;
        ruVar.z1 = r22;
        int i10 = r22 + 1;
        if (duVar.c != null) {
            int i11 = 0;
            i7 = 0;
            while (true) {
                ArrayList[] arrayListArr = duVar.c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i11];
                if (arrayList2 != null) {
                    i7 = (arrayListArr.length == 1 ? arrayList2.size() : Math.min(duVar.f.u1.J * 2, arrayList2.size())) + i7 + 1;
                }
                i11++;
            }
        } else {
            i7 = 0;
        }
        return Math.max(0, duVar.c.length - 1) + i10 + i7;
    }

    @Override // v4.g0
    public final int d(int i7) {
        ru ruVar = this.c;
        du duVar = ruVar.l1;
        int i10 = 0;
        if (i7 == 0) {
            return 0;
        }
        int i11 = i7 - 1;
        if (ruVar.z1) {
            if (i11 == 1) {
                return 3;
            }
            if (i11 > 0) {
                i11 = i7 - 2;
            }
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = duVar.c;
            if (i10 >= arrayListArr.length) {
                return 1;
            }
            if (i11 == i12) {
                return 2;
            }
            int size = arrayListArr[i10].size();
            if (duVar.c.length > 1) {
                size = Math.min(ruVar.u1.J * 2, size);
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
        mw mwVar;
        TLRPC.Document document;
        boolean z9;
        TextView textView;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        ?? r92;
        ArrayList<TLRPC.Document> arrayList;
        ru ruVar = this.c;
        v4.s sVar = ruVar.u1;
        du duVar = ruVar.l1;
        int i10 = i7 - 1;
        int i11 = d1Var.f;
        View view = d1Var.a;
        CharSequence charSequence = null;
        charSequence = null;
        charSequence = null;
        int i12 = 1;
        if (i11 == 1) {
            if (ruVar.z1) {
                i10 = i7 - 2;
            }
            ku kuVar = (ku) view;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                ArrayList[] arrayListArr = duVar.c;
                if (i14 >= arrayListArr.length) {
                    mwVar = null;
                    break;
                }
                int size = arrayListArr[i14].size();
                if (duVar.c.length > 1) {
                    size = Math.min(sVar.J * 2, size);
                }
                if (i10 > i13 && i10 <= i13 + size) {
                    mwVar = (mw) duVar.c[i14].get((i10 - i13) - 1);
                    break;
                } else {
                    i13 += size + 2;
                    i14++;
                }
            }
            r5 r5Var = kuVar.c;
            if ((r5Var != null || mwVar == null) && ((mwVar != null || r5Var == null) && (mwVar == null || r5Var.documentId == mwVar.b))) {
                return;
            }
            if (mwVar == null) {
                kuVar.c = null;
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = mwVar.a;
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.short_name = stickerSet2.short_name;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            if (tL_messages_stickerSet.documents != null) {
                for (int i15 = 0; i15 < mwVar.a.documents.size(); i15++) {
                    document = mwVar.a.documents.get(i15);
                    if (document != null && document.id == mwVar.b) {
                        break;
                    }
                }
            }
            document = null;
            if (document != null) {
                kuVar.c = new r5(document, (Paint.FontMetricsInt) null);
                return;
            } else {
                kuVar.c = new r5(mwVar.b, (Paint.FontMetricsInt) null);
                return;
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            TextView textView2 = (TextView) view;
            textView2.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Lf, ruVar.I0);
            textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131747006, null)));
            textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(14.0f));
            return;
        }
        if (ruVar.z1 && i10 > 0) {
            i10 = i7 - 2;
        }
        int i16 = 0;
        int i17 = 0;
        while (true) {
            ArrayList[] arrayListArr2 = duVar.c;
            if (i16 >= arrayListArr2.length) {
                break;
            }
            int size2 = arrayListArr2[i16].size();
            if (duVar.c.length > 1) {
                size2 = Math.min(sVar.J * 2, size2);
            }
            if (i10 == i17) {
                break;
            }
            i17 += size2 + 2;
            i16++;
        }
        ArrayList arrayList2 = duVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (arrayList2 == null || i16 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) duVar.b.get(i16);
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
            for (int i18 = 0; i18 < tL_messages_stickerSet2.documents.size(); i18++) {
                if (!org.telegram.messenger.ij.n3(tL_messages_stickerSet2.documents.get(i18))) {
                    z9 = true;
                    break;
                }
            }
        }
        z9 = false;
        if (i16 < duVar.c.length) {
            nu nuVar = (nu) view;
            int size3 = (tL_messages_stickerSet2 == null || (arrayList = tL_messages_stickerSet2.documents) == null) ? 0 : arrayList.size();
            TextView textView3 = nuVar.d;
            TextView textView4 = nuVar.c;
            ru ruVar2 = nuVar.y;
            ug.p0 p0Var = nuVar.e;
            w70 w70Var = nuVar.a;
            nuVar.r = tL_messages_stickerSet2;
            if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.set == null) {
                w70Var.setText((CharSequence) null);
            } else {
                try {
                    if (ru.M1 == null) {
                        try {
                            ru.M1 = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                        } catch (Exception e10) {
                            e = e10;
                            r92 = i12;
                            charSequence = charSequence;
                            org.telegram.messenger.a8.g(e, r92);
                            if (charSequence == null) {
                            }
                            w70Var.setText(charSequence);
                            textView = nuVar.b;
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
                            nuVar.a(z10, false);
                        }
                    }
                    Matcher matcher = ru.M1.matcher(tL_messages_stickerSet2.set.title);
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
                                textView = nuVar.b;
                                if (textView != null) {
                                }
                                if (z9) {
                                    Pattern pattern = ru.M1;
                                    if (!org.telegram.messenger.p10.i(ruVar2.a).q()) {
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
                                nuVar.a(z10, false);
                            }
                        }
                        int start = matcher.start();
                        int end = matcher.end();
                        if (tL_messages_stickerSet2.set.title.charAt(start) != '@') {
                            start++;
                        }
                        Matcher matcher2 = matcher;
                        r82.setSpan(new mu(nuVar, tL_messages_stickerSet2.set.title.subSequence(start + 1, end).toString()), start, end, 0);
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
            textView = nuVar.b;
            if (textView != null) {
                if (tL_messages_stickerSet2 == null || (stickerSet = tL_messages_stickerSet2.set) == null || stickerSet.emojis) {
                    textView.setText(org.telegram.messenger.id.G(size3, "EmojiCount", new Object[0]));
                } else {
                    textView.setText(org.telegram.messenger.id.G(size3, "Stickers", new Object[0]));
                }
            }
            if (z9 && p0Var != null) {
                Pattern pattern2 = ru.M1;
                if (!org.telegram.messenger.p10.i(ruVar2.a).q()) {
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
                Pattern pattern3 = ru.M1;
                if (org.telegram.messenger.ui.b0(ruVar2.a).B0(tL_messages_stickerSet2.set.id, true)) {
                    z10 = true;
                    nuVar.a(z10, false);
                }
            }
            z10 = false;
            nuVar.a(z10, false);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        ru ruVar = this.c;
        if (i7 == 0) {
            view = ruVar.k1;
        } else {
            if (i7 == 1) {
                ku kuVar = new ku(ruVar.getContext());
                kuVar.a = new org.telegram.messenger.ic[2];
                view2 = kuVar;
            } else if (i7 == 2) {
                view2 = new nu(ruVar, ruVar.getContext(), ruVar.l1.c.length <= 1);
            } else if (i7 == 3) {
                view2 = new TextView(ruVar.getContext());
            } else if (i7 == 4) {
                View quVar = new qu(ruVar.getContext());
                int i10 = org.telegram.ui.ActionBar.k6.zf;
                Pattern pattern = ru.M1;
                org.telegram.ui.ActionBar.r6.i(i10, quVar, ruVar.I0);
                v4.o0 o0Var = new v4.o0(-1, org.telegram.messenger.g0.f1());
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.g0.L(14.0f);
                quVar.setLayoutParams(o0Var);
                view2 = quVar;
            } else {
                view = null;
            }
            view = view2;
        }
        return new xi0(view);
    }
}
