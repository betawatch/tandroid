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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class uu extends dk0 {
    public final /* synthetic */ ev c;

    public uu(ev evVar) {
        this.c = evVar;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 1;
    }

    public final int E(int i7) {
        ev evVar = this.c;
        qu quVar = evVar.p1;
        int i10 = evVar.D1 ? 2 : 1;
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = quVar.c;
            if (i11 >= arrayListArr.length || i11 == i7) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (quVar.c.length > 1) {
                size = Math.min(evVar.y1.J * 2, size);
            }
            i10 += size + 2;
            i11++;
        }
        return i10;
    }

    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    @Override // v4.i0
    public final int b() {
        int i7;
        ArrayList arrayList;
        ev evVar = this.c;
        qu quVar = evVar.p1;
        ?? r22 = (org.telegram.messenger.k10.i(evVar.a).q() || (arrayList = quVar.b) == null || arrayList.size() != 1 || !org.telegram.messenger.gj.V3((TLRPC.TL_messages_stickerSet) quVar.b.get(0))) ? 0 : 1;
        evVar.D1 = r22;
        int i10 = r22 + 1;
        if (quVar.c != null) {
            int i11 = 0;
            i7 = 0;
            while (true) {
                ArrayList[] arrayListArr = quVar.c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i11];
                if (arrayList2 != null) {
                    i7 = (arrayListArr.length == 1 ? arrayList2.size() : Math.min(quVar.f.y1.J * 2, arrayList2.size())) + i7 + 1;
                }
                i11++;
            }
        } else {
            i7 = 0;
        }
        return Math.max(0, quVar.c.length - 1) + i10 + i7;
    }

    @Override // v4.i0
    public final int d(int i7) {
        ev evVar = this.c;
        qu quVar = evVar.p1;
        int i10 = 0;
        if (i7 == 0) {
            return 0;
        }
        int i11 = i7 - 1;
        if (evVar.D1) {
            if (i11 == 1) {
                return 3;
            }
            if (i11 > 0) {
                i11 = i7 - 2;
            }
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = quVar.c;
            if (i10 >= arrayListArr.length) {
                return 1;
            }
            if (i11 == i12) {
                return 2;
            }
            int size = arrayListArr[i10].size();
            if (quVar.c.length > 1) {
                size = Math.min(evVar.y1.J * 2, size);
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
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        zw zwVar;
        TLRPC.Document document;
        boolean z10;
        TextView textView;
        boolean z11;
        TLRPC.StickerSet stickerSet;
        ?? r92;
        ArrayList<TLRPC.Document> arrayList;
        ev evVar = this.c;
        v4.t tVar = evVar.y1;
        qu quVar = evVar.p1;
        int i10 = i7 - 1;
        int i11 = f1Var.f;
        View view = f1Var.a;
        CharSequence charSequence = null;
        charSequence = null;
        charSequence = null;
        int i12 = 1;
        if (i11 == 1) {
            if (evVar.D1) {
                i10 = i7 - 2;
            }
            xu xuVar = (xu) view;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                ArrayList[] arrayListArr = quVar.c;
                if (i14 >= arrayListArr.length) {
                    zwVar = null;
                    break;
                }
                int size = arrayListArr[i14].size();
                if (quVar.c.length > 1) {
                    size = Math.min(tVar.J * 2, size);
                }
                if (i10 > i13 && i10 <= i13 + size) {
                    zwVar = (zw) quVar.c[i14].get((i10 - i13) - 1);
                    break;
                } else {
                    i13 += size + 2;
                    i14++;
                }
            }
            y5 y5Var = xuVar.c;
            if ((y5Var != null || zwVar == null) && ((zwVar != null || y5Var == null) && (zwVar == null || y5Var.documentId == zwVar.b))) {
                return;
            }
            if (zwVar == null) {
                xuVar.c = null;
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zwVar.a;
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.short_name = stickerSet2.short_name;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            if (tL_messages_stickerSet.documents != null) {
                for (int i15 = 0; i15 < zwVar.a.documents.size(); i15++) {
                    document = zwVar.a.documents.get(i15);
                    if (document != null && document.id == zwVar.b) {
                        break;
                    }
                }
            }
            document = null;
            if (document != null) {
                xuVar.c = new y5(document, (Paint.FontMetricsInt) null);
                return;
            } else {
                xuVar.c = new y5(zwVar.b, (Paint.FontMetricsInt) null);
                return;
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            TextView textView2 = (TextView) view;
            textView2.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Of, evVar.J0);
            textView2.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131746811, null)));
            textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(14.0f));
            return;
        }
        if (evVar.D1 && i10 > 0) {
            i10 = i7 - 2;
        }
        int i16 = 0;
        int i17 = 0;
        while (true) {
            ArrayList[] arrayListArr2 = quVar.c;
            if (i16 >= arrayListArr2.length) {
                break;
            }
            int size2 = arrayListArr2[i16].size();
            if (quVar.c.length > 1) {
                size2 = Math.min(tVar.J * 2, size2);
            }
            if (i10 == i17) {
                break;
            }
            i17 += size2 + 2;
            i16++;
        }
        ArrayList arrayList2 = quVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (arrayList2 == null || i16 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) quVar.b.get(i16);
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
            for (int i18 = 0; i18 < tL_messages_stickerSet2.documents.size(); i18++) {
                if (!org.telegram.messenger.gj.m3(tL_messages_stickerSet2.documents.get(i18))) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (i16 < quVar.c.length) {
            av avVar = (av) view;
            int size3 = (tL_messages_stickerSet2 == null || (arrayList = tL_messages_stickerSet2.documents) == null) ? 0 : arrayList.size();
            TextView textView3 = avVar.d;
            TextView textView4 = avVar.c;
            ev evVar2 = avVar.y;
            ug.r0 r0Var = avVar.e;
            m80 m80Var = avVar.a;
            avVar.r = tL_messages_stickerSet2;
            if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.set == null) {
                m80Var.setText((CharSequence) null);
            } else {
                try {
                    if (ev.Q1 == null) {
                        try {
                            ev.Q1 = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                        } catch (Exception e10) {
                            e = e10;
                            r92 = i12;
                            charSequence = charSequence;
                            org.telegram.messenger.a8.g(e, r92);
                            if (charSequence == null) {
                            }
                            m80Var.setText(charSequence);
                            textView = avVar.b;
                            if (textView != null) {
                            }
                            if (z10) {
                            }
                            if (r0Var != null) {
                            }
                            if (textView4 != null) {
                            }
                            if (textView3 != null) {
                            }
                            if (tL_messages_stickerSet2 != null) {
                            }
                            z11 = false;
                            avVar.a(z11, false);
                        }
                    }
                    Matcher matcher = ev.Q1.matcher(tL_messages_stickerSet2.set.title);
                    while (true) {
                        ?? r82 = charSequence;
                        if (!matcher.find()) {
                            break;
                        }
                        if (charSequence == null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messages_stickerSet2.set.title);
                            try {
                                m80Var.setMovementMethod(new org.telegram.messenger.c0(i12));
                                r82 = spannableStringBuilder;
                            } catch (Exception e11) {
                                e = e11;
                                r92 = i12;
                                charSequence = spannableStringBuilder;
                                org.telegram.messenger.a8.g(e, r92);
                                if (charSequence == null) {
                                }
                                m80Var.setText(charSequence);
                                textView = avVar.b;
                                if (textView != null) {
                                }
                                if (z10) {
                                    Pattern pattern = ev.Q1;
                                    if (!org.telegram.messenger.k10.i(evVar2.a).q()) {
                                    }
                                }
                                if (r0Var != null) {
                                }
                                if (textView4 != null) {
                                }
                                if (textView3 != null) {
                                }
                                if (tL_messages_stickerSet2 != null) {
                                }
                                z11 = false;
                                avVar.a(z11, false);
                            }
                        }
                        int start = matcher.start();
                        int end = matcher.end();
                        if (tL_messages_stickerSet2.set.title.charAt(start) != '@') {
                            start++;
                        }
                        Matcher matcher2 = matcher;
                        r82.setSpan(new zu(avVar, tL_messages_stickerSet2.set.title.subSequence(start + 1, end).toString()), start, end, 0);
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
                m80Var.setText(charSequence);
            }
            textView = avVar.b;
            if (textView != null) {
                if (tL_messages_stickerSet2 == null || (stickerSet = tL_messages_stickerSet2.set) == null || stickerSet.emojis) {
                    textView.setText(org.telegram.messenger.hd.G(size3, "EmojiCount", new Object[0]));
                } else {
                    textView.setText(org.telegram.messenger.hd.G(size3, "Stickers", new Object[0]));
                }
            }
            if (z10 && r0Var != null) {
                Pattern pattern2 = ev.Q1;
                if (!org.telegram.messenger.k10.i(evVar2.a).q()) {
                    r0Var.setVisibility(0);
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
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (tL_messages_stickerSet2 != null) {
                Pattern pattern3 = ev.Q1;
                if (org.telegram.messenger.si.d0(evVar2.a).E0(tL_messages_stickerSet2.set.id, true)) {
                    z11 = true;
                    avVar.a(z11, false);
                }
            }
            z11 = false;
            avVar.a(z11, false);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        ev evVar = this.c;
        if (i7 == 0) {
            view = evVar.o1;
        } else {
            if (i7 == 1) {
                xu xuVar = new xu(evVar.getContext());
                xuVar.a = new org.telegram.messenger.hc[2];
                view2 = xuVar;
            } else if (i7 == 2) {
                view2 = new av(evVar, evVar.getContext(), evVar.p1.c.length <= 1);
            } else if (i7 == 3) {
                view2 = new TextView(evVar.getContext());
            } else if (i7 == 4) {
                View dvVar = new dv(evVar.getContext());
                int i10 = org.telegram.ui.ActionBar.m6.Cf;
                Pattern pattern = ev.Q1;
                org.telegram.ui.ActionBar.t6.h(i10, dvVar, evVar.J0);
                v4.q0 q0Var = new v4.q0(-1, org.telegram.messenger.g0.f1());
                ((ViewGroup.MarginLayoutParams) q0Var).topMargin = org.telegram.messenger.g0.L(14.0f);
                dvVar.setLayoutParams(q0Var);
                view2 = dvVar;
            } else {
                view = null;
            }
            view = view2;
        }
        return new mj0(view);
    }
}
