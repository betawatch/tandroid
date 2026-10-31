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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class su extends sk0 {
    public final /* synthetic */ cv c;

    public su(cv cvVar) {
        this.c = cvVar;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    public final int E(int i10) {
        cv cvVar = this.c;
        ou ouVar = cvVar.l1;
        int i11 = cvVar.z1 ? 2 : 1;
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = ouVar.c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (ouVar.c.length > 1) {
                size = Math.min(cvVar.u1.J * 2, size);
            }
            i11 += size + 2;
            i12++;
        }
        return i11;
    }

    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    @Override // s4.g0
    public final int b() {
        int i10;
        ArrayList arrayList;
        cv cvVar = this.c;
        ou ouVar = cvVar.l1;
        ?? r22 = (org.telegram.messenger.d20.i(cvVar.a).q() || (arrayList = ouVar.b) == null || arrayList.size() != 1 || !org.telegram.messenger.jj.V3((TLRPC.TL_messages_stickerSet) ouVar.b.get(0))) ? 0 : 1;
        cvVar.z1 = r22;
        int i11 = r22 + 1;
        if (ouVar.c != null) {
            int i12 = 0;
            i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = ouVar.c;
                if (i12 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i12];
                if (arrayList2 != null) {
                    i10 = (arrayListArr.length == 1 ? arrayList2.size() : Math.min(ouVar.f.u1.J * 2, arrayList2.size())) + i10 + 1;
                }
                i12++;
            }
        } else {
            i10 = 0;
        }
        return Math.max(0, ouVar.c.length - 1) + i11 + i10;
    }

    @Override // s4.g0
    public final int d(int i10) {
        cv cvVar = this.c;
        ou ouVar = cvVar.l1;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (cvVar.z1) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = ouVar.c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (ouVar.c.length > 1) {
                size = Math.min(cvVar.u1.J * 2, size);
            }
            int i14 = size + 1 + i13;
            if (i12 == i14) {
                return 4;
            }
            i13 = i14 + 1;
            i11++;
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
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        ax axVar;
        TLRPC.Document document;
        boolean z10;
        TextView textView;
        boolean z11;
        TLRPC.StickerSet stickerSet;
        ?? r92;
        ArrayList<TLRPC.Document> arrayList;
        cv cvVar = this.c;
        s4.r rVar = cvVar.u1;
        ou ouVar = cvVar.l1;
        int i11 = i10 - 1;
        int i12 = c1Var.f;
        View view = c1Var.a;
        CharSequence charSequence = null;
        charSequence = null;
        charSequence = null;
        int i13 = 1;
        if (i12 == 1) {
            if (cvVar.z1) {
                i11 = i10 - 2;
            }
            vu vuVar = (vu) view;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                ArrayList[] arrayListArr = ouVar.c;
                if (i15 >= arrayListArr.length) {
                    axVar = null;
                    break;
                }
                int size = arrayListArr[i15].size();
                if (ouVar.c.length > 1) {
                    size = Math.min(rVar.J * 2, size);
                }
                if (i11 > i14 && i11 <= i14 + size) {
                    axVar = (ax) ouVar.c[i15].get((i11 - i14) - 1);
                    break;
                } else {
                    i14 += size + 2;
                    i15++;
                }
            }
            o5 o5Var = vuVar.c;
            if ((o5Var != null || axVar == null) && ((axVar != null || o5Var == null) && (axVar == null || o5Var.documentId == axVar.b))) {
                return;
            }
            if (axVar == null) {
                vuVar.c = null;
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = axVar.a;
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.short_name = stickerSet2.short_name;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            if (tL_messages_stickerSet.documents != null) {
                for (int i16 = 0; i16 < axVar.a.documents.size(); i16++) {
                    document = axVar.a.documents.get(i16);
                    if (document != null && document.id == axVar.b) {
                        break;
                    }
                }
            }
            document = null;
            if (document != null) {
                vuVar.c = new o5(document, (Paint.FontMetricsInt) null);
                return;
            } else {
                vuVar.c = new o5(axVar.b, (Paint.FontMetricsInt) null);
                return;
            }
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            TextView textView2 = (TextView) view;
            textView2.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Lf, cvVar.I0);
            textView2.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747020, null)));
            textView2.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(14.0f));
            return;
        }
        if (cvVar.z1 && i11 > 0) {
            i11 = i10 - 2;
        }
        int i17 = 0;
        int i18 = 0;
        while (true) {
            ArrayList[] arrayListArr2 = ouVar.c;
            if (i17 >= arrayListArr2.length) {
                break;
            }
            int size2 = arrayListArr2[i17].size();
            if (ouVar.c.length > 1) {
                size2 = Math.min(rVar.J * 2, size2);
            }
            if (i11 == i18) {
                break;
            }
            i18 += size2 + 2;
            i17++;
        }
        ArrayList arrayList2 = ouVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (arrayList2 == null || i17 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) ouVar.b.get(i17);
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
            for (int i19 = 0; i19 < tL_messages_stickerSet2.documents.size(); i19++) {
                if (!org.telegram.messenger.jj.m3(tL_messages_stickerSet2.documents.get(i19))) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (i17 < ouVar.c.length) {
            yu yuVar = (yu) view;
            int size3 = (tL_messages_stickerSet2 == null || (arrayList = tL_messages_stickerSet2.documents) == null) ? 0 : arrayList.size();
            TextView textView3 = yuVar.d;
            TextView textView4 = yuVar.c;
            cv cvVar2 = yuVar.y;
            kg.x0 x0Var = yuVar.e;
            p80 p80Var = yuVar.a;
            yuVar.r = tL_messages_stickerSet2;
            if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.set == null) {
                p80Var.setText((CharSequence) null);
            } else {
                try {
                    if (cv.M1 == null) {
                        try {
                            cv.M1 = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                        } catch (Exception e) {
                            e = e;
                            r92 = i13;
                            charSequence = charSequence;
                            org.telegram.messenger.f8.g(e, r92);
                            if (charSequence == null) {
                            }
                            p80Var.setText(charSequence);
                            textView = yuVar.b;
                            if (textView != null) {
                            }
                            if (z10) {
                            }
                            if (x0Var != null) {
                            }
                            if (textView4 != null) {
                            }
                            if (textView3 != null) {
                            }
                            if (tL_messages_stickerSet2 != null) {
                            }
                            z11 = false;
                            yuVar.a(z11, false);
                        }
                    }
                    Matcher matcher = cv.M1.matcher(tL_messages_stickerSet2.set.title);
                    while (true) {
                        ?? r82 = charSequence;
                        if (!matcher.find()) {
                            break;
                        }
                        if (charSequence == null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messages_stickerSet2.set.title);
                            try {
                                p80Var.setMovementMethod(new org.telegram.messenger.e0(i13));
                                r82 = spannableStringBuilder;
                            } catch (Exception e7) {
                                e = e7;
                                r92 = i13;
                                charSequence = spannableStringBuilder;
                                org.telegram.messenger.f8.g(e, r92);
                                if (charSequence == null) {
                                }
                                p80Var.setText(charSequence);
                                textView = yuVar.b;
                                if (textView != null) {
                                }
                                if (z10) {
                                    Pattern pattern = cv.M1;
                                    if (!org.telegram.messenger.d20.i(cvVar2.a).q()) {
                                    }
                                }
                                if (x0Var != null) {
                                }
                                if (textView4 != null) {
                                }
                                if (textView3 != null) {
                                }
                                if (tL_messages_stickerSet2 != null) {
                                }
                                z11 = false;
                                yuVar.a(z11, false);
                            }
                        }
                        int start = matcher.start();
                        int end = matcher.end();
                        if (tL_messages_stickerSet2.set.title.charAt(start) != '@') {
                            start++;
                        }
                        Matcher matcher2 = matcher;
                        r82.setSpan(new xu(yuVar, tL_messages_stickerSet2.set.title.subSequence(start + 1, end).toString()), start, end, 0);
                        matcher = matcher2;
                        i13 = 1;
                        charSequence = r82;
                    }
                } catch (Exception e10) {
                    e = e10;
                    r92 = 1;
                    charSequence = charSequence;
                }
                if (charSequence == null) {
                    charSequence = tL_messages_stickerSet2.set.title;
                }
                p80Var.setText(charSequence);
            }
            textView = yuVar.b;
            if (textView != null) {
                if (tL_messages_stickerSet2 == null || (stickerSet = tL_messages_stickerSet2.set) == null || stickerSet.emojis) {
                    textView.setText(org.telegram.messenger.cd.G(size3, "EmojiCount", new Object[0]));
                } else {
                    textView.setText(org.telegram.messenger.cd.G(size3, "Stickers", new Object[0]));
                }
            }
            if (z10 && x0Var != null) {
                Pattern pattern2 = cv.M1;
                if (!org.telegram.messenger.d20.i(cvVar2.a).q()) {
                    x0Var.setVisibility(0);
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
            if (x0Var != null) {
                x0Var.setVisibility(8);
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (tL_messages_stickerSet2 != null) {
                Pattern pattern3 = cv.M1;
                if (org.telegram.messenger.ui.b0(cvVar2.a).B0(tL_messages_stickerSet2.set.id, true)) {
                    z11 = true;
                    yuVar.a(z11, false);
                }
            }
            z11 = false;
            yuVar.a(z11, false);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        cv cvVar = this.c;
        if (i10 == 0) {
            view = cvVar.k1;
        } else {
            if (i10 == 1) {
                vu vuVar = new vu(cvVar.getContext());
                vuVar.a = new org.telegram.messenger.jc[2];
                view2 = vuVar;
            } else if (i10 == 2) {
                view2 = new yu(cvVar, cvVar.getContext(), cvVar.l1.c.length <= 1);
            } else if (i10 == 3) {
                view2 = new TextView(cvVar.getContext());
            } else if (i10 == 4) {
                View bvVar = new bv(cvVar.getContext());
                int i11 = org.telegram.ui.ActionBar.t6.zf;
                Pattern pattern = cv.M1;
                org.telegram.ui.ActionBar.a7.i(i11, bvVar, cvVar.I0);
                s4.o0 o0Var = new s4.o0(-1, org.telegram.messenger.i0.f1());
                ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.i0.L(14.0f);
                bvVar.setLayoutParams(o0Var);
                view2 = bvVar;
            } else {
                view = null;
            }
            view = view2;
        }
        return new ck0(view);
    }
}
