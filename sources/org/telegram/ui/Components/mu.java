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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class mu extends tj0 {
    public final /* synthetic */ wu c;

    public mu(wu wuVar) {
        this.c = wuVar;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f == 1;
    }

    public final int E(int i7) {
        wu wuVar = this.c;
        iu iuVar = wuVar.p1;
        int i10 = wuVar.D1 ? 2 : 1;
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = iuVar.c;
            if (i11 >= arrayListArr.length || i11 == i7) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (iuVar.c.length > 1) {
                size = Math.min(wuVar.y1.J * 2, size);
            }
            i10 += size + 2;
            i11++;
        }
        return i10;
    }

    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    @Override // v4.h0
    public final int b() {
        int i7;
        ArrayList arrayList;
        wu wuVar = this.c;
        iu iuVar = wuVar.p1;
        ?? r22 = (org.telegram.messenger.m10.i(wuVar.a).q() || (arrayList = iuVar.b) == null || arrayList.size() != 1 || !org.telegram.messenger.gj.V3((TLRPC.TL_messages_stickerSet) iuVar.b.get(0))) ? 0 : 1;
        wuVar.D1 = r22;
        int i10 = r22 + 1;
        if (iuVar.c != null) {
            int i11 = 0;
            i7 = 0;
            while (true) {
                ArrayList[] arrayListArr = iuVar.c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i11];
                if (arrayList2 != null) {
                    i7 = (arrayListArr.length == 1 ? arrayList2.size() : Math.min(iuVar.f.y1.J * 2, arrayList2.size())) + i7 + 1;
                }
                i11++;
            }
        } else {
            i7 = 0;
        }
        return Math.max(0, iuVar.c.length - 1) + i10 + i7;
    }

    @Override // v4.h0
    public final int d(int i7) {
        wu wuVar = this.c;
        iu iuVar = wuVar.p1;
        int i10 = 0;
        if (i7 == 0) {
            return 0;
        }
        int i11 = i7 - 1;
        if (wuVar.D1) {
            if (i11 == 1) {
                return 3;
            }
            if (i11 > 0) {
                i11 = i7 - 2;
            }
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = iuVar.c;
            if (i10 >= arrayListArr.length) {
                return 1;
            }
            if (i11 == i12) {
                return 2;
            }
            int size = arrayListArr[i10].size();
            if (iuVar.c.length > 1) {
                size = Math.min(wuVar.y1.J * 2, size);
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
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        rw rwVar;
        TLRPC.Document document;
        boolean z10;
        TextView textView;
        boolean z11;
        TLRPC.StickerSet stickerSet;
        ?? r92;
        ArrayList<TLRPC.Document> arrayList;
        wu wuVar = this.c;
        v4.s sVar = wuVar.y1;
        iu iuVar = wuVar.p1;
        int i10 = i7 - 1;
        int i11 = e1Var.f;
        View view = e1Var.a;
        CharSequence charSequence = null;
        charSequence = null;
        charSequence = null;
        int i12 = 1;
        if (i11 == 1) {
            if (wuVar.D1) {
                i10 = i7 - 2;
            }
            pu puVar = (pu) view;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                ArrayList[] arrayListArr = iuVar.c;
                if (i14 >= arrayListArr.length) {
                    rwVar = null;
                    break;
                }
                int size = arrayListArr[i14].size();
                if (iuVar.c.length > 1) {
                    size = Math.min(sVar.J * 2, size);
                }
                if (i10 > i13 && i10 <= i13 + size) {
                    rwVar = (rw) iuVar.c[i14].get((i10 - i13) - 1);
                    break;
                } else {
                    i13 += size + 2;
                    i14++;
                }
            }
            p5 p5Var = puVar.c;
            if ((p5Var != null || rwVar == null) && ((rwVar != null || p5Var == null) && (rwVar == null || p5Var.documentId == rwVar.b))) {
                return;
            }
            if (rwVar == null) {
                puVar.c = null;
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = rwVar.a;
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.short_name = stickerSet2.short_name;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            if (tL_messages_stickerSet.documents != null) {
                for (int i15 = 0; i15 < rwVar.a.documents.size(); i15++) {
                    document = rwVar.a.documents.get(i15);
                    if (document != null && document.id == rwVar.b) {
                        break;
                    }
                }
            }
            document = null;
            if (document != null) {
                puVar.c = new p5(document, (Paint.FontMetricsInt) null);
                return;
            } else {
                puVar.c = new p5(rwVar.b, (Paint.FontMetricsInt) null);
                return;
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            TextView textView2 = (TextView) view;
            textView2.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.Of, wuVar.J0);
            textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747005, null)));
            textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(14.0f));
            return;
        }
        if (wuVar.D1 && i10 > 0) {
            i10 = i7 - 2;
        }
        int i16 = 0;
        int i17 = 0;
        while (true) {
            ArrayList[] arrayListArr2 = iuVar.c;
            if (i16 >= arrayListArr2.length) {
                break;
            }
            int size2 = arrayListArr2[i16].size();
            if (iuVar.c.length > 1) {
                size2 = Math.min(sVar.J * 2, size2);
            }
            if (i10 == i17) {
                break;
            }
            i17 += size2 + 2;
            i16++;
        }
        ArrayList arrayList2 = iuVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (arrayList2 == null || i16 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) iuVar.b.get(i16);
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
            for (int i18 = 0; i18 < tL_messages_stickerSet2.documents.size(); i18++) {
                if (!org.telegram.messenger.gj.m3(tL_messages_stickerSet2.documents.get(i18))) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (i16 < iuVar.c.length) {
            su suVar = (su) view;
            int size3 = (tL_messages_stickerSet2 == null || (arrayList = tL_messages_stickerSet2.documents) == null) ? 0 : arrayList.size();
            TextView textView3 = suVar.d;
            TextView textView4 = suVar.c;
            wu wuVar2 = suVar.y;
            ug.q0 q0Var = suVar.e;
            z70 z70Var = suVar.a;
            suVar.r = tL_messages_stickerSet2;
            if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.set == null) {
                z70Var.setText((CharSequence) null);
            } else {
                try {
                    if (wu.Q1 == null) {
                        try {
                            wu.Q1 = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                        } catch (Exception e10) {
                            e = e10;
                            r92 = i12;
                            charSequence = charSequence;
                            org.telegram.messenger.a8.g(e, r92);
                            if (charSequence == null) {
                            }
                            z70Var.setText(charSequence);
                            textView = suVar.b;
                            if (textView != null) {
                            }
                            if (z10) {
                            }
                            if (q0Var != null) {
                            }
                            if (textView4 != null) {
                            }
                            if (textView3 != null) {
                            }
                            if (tL_messages_stickerSet2 != null) {
                            }
                            z11 = false;
                            suVar.a(z11, false);
                        }
                    }
                    Matcher matcher = wu.Q1.matcher(tL_messages_stickerSet2.set.title);
                    while (true) {
                        ?? r82 = charSequence;
                        if (!matcher.find()) {
                            break;
                        }
                        if (charSequence == null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messages_stickerSet2.set.title);
                            try {
                                z70Var.setMovementMethod(new org.telegram.messenger.c0(i12));
                                r82 = spannableStringBuilder;
                            } catch (Exception e11) {
                                e = e11;
                                r92 = i12;
                                charSequence = spannableStringBuilder;
                                org.telegram.messenger.a8.g(e, r92);
                                if (charSequence == null) {
                                }
                                z70Var.setText(charSequence);
                                textView = suVar.b;
                                if (textView != null) {
                                }
                                if (z10) {
                                    Pattern pattern = wu.Q1;
                                    if (!org.telegram.messenger.m10.i(wuVar2.a).q()) {
                                    }
                                }
                                if (q0Var != null) {
                                }
                                if (textView4 != null) {
                                }
                                if (textView3 != null) {
                                }
                                if (tL_messages_stickerSet2 != null) {
                                }
                                z11 = false;
                                suVar.a(z11, false);
                            }
                        }
                        int start = matcher.start();
                        int end = matcher.end();
                        if (tL_messages_stickerSet2.set.title.charAt(start) != '@') {
                            start++;
                        }
                        Matcher matcher2 = matcher;
                        r82.setSpan(new ru(suVar, tL_messages_stickerSet2.set.title.subSequence(start + 1, end).toString()), start, end, 0);
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
                z70Var.setText(charSequence);
            }
            textView = suVar.b;
            if (textView != null) {
                if (tL_messages_stickerSet2 == null || (stickerSet = tL_messages_stickerSet2.set) == null || stickerSet.emojis) {
                    textView.setText(org.telegram.messenger.hd.G(size3, "EmojiCount", new Object[0]));
                } else {
                    textView.setText(org.telegram.messenger.hd.G(size3, "Stickers", new Object[0]));
                }
            }
            if (z10 && q0Var != null) {
                Pattern pattern2 = wu.Q1;
                if (!org.telegram.messenger.m10.i(wuVar2.a).q()) {
                    q0Var.setVisibility(0);
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
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (tL_messages_stickerSet2 != null) {
                Pattern pattern3 = wu.Q1;
                if (org.telegram.messenger.si.b0(wuVar2.a).B0(tL_messages_stickerSet2.set.id, true)) {
                    z11 = true;
                    suVar.a(z11, false);
                }
            }
            z11 = false;
            suVar.a(z11, false);
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        wu wuVar = this.c;
        if (i7 == 0) {
            view = wuVar.o1;
        } else {
            if (i7 == 1) {
                pu puVar = new pu(wuVar.getContext());
                puVar.a = new org.telegram.messenger.hc[2];
                view2 = puVar;
            } else if (i7 == 2) {
                view2 = new su(wuVar, wuVar.getContext(), wuVar.p1.c.length <= 1);
            } else if (i7 == 3) {
                view2 = new TextView(wuVar.getContext());
            } else if (i7 == 4) {
                View vuVar = new vu(wuVar.getContext());
                int i10 = org.telegram.ui.ActionBar.j6.Cf;
                Pattern pattern = wu.Q1;
                org.telegram.ui.ActionBar.q6.h(i10, vuVar, wuVar.J0);
                v4.p0 p0Var = new v4.p0(-1, org.telegram.messenger.g0.f1());
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = org.telegram.messenger.g0.L(14.0f);
                vuVar.setLayoutParams(p0Var);
                view2 = vuVar;
            } else {
                view = null;
            }
            view = view2;
        }
        return new cj0(view);
    }
}
