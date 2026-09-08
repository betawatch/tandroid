package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class fv extends kl0 {
    public final /* synthetic */ rv c;

    public fv(rv rvVar) {
        this.c = rvVar;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    public final int E(int i10) {
        rv rvVar = this.c;
        bv bvVar = rvVar.e;
        int i11 = rvVar.I ? 2 : 1;
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = bvVar.c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (bvVar.c.length > 1) {
                size = Math.min(rvVar.y.J * 2, size);
            }
            i11 += size + 2;
            i12++;
        }
        return i11;
    }

    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    @Override // s4.h0
    public final int h() {
        int i10;
        int i11;
        ArrayList arrayList;
        rv rvVar = this.c;
        bv bvVar = rvVar.e;
        i10 = ((org.telegram.ui.ActionBar.f3) rvVar).currentAccount;
        ?? r22 = (UserConfig.getInstance(i10).isPremium() || (arrayList = bvVar.b) == null || arrayList.size() != 1 || !MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) bvVar.b.get(0))) ? 0 : 1;
        rvVar.I = r22;
        int i12 = r22 + 1;
        if (bvVar.c != null) {
            int i13 = 0;
            i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = bvVar.c;
                if (i13 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i13];
                if (arrayList2 != null) {
                    i11 = (arrayListArr.length == 1 ? arrayList2.size() : Math.min(bvVar.f.y.J * 2, arrayList2.size())) + i11 + 1;
                }
                i13++;
            }
        } else {
            i11 = 0;
        }
        return Math.max(0, bvVar.c.length - 1) + i12 + i11;
    }

    @Override // s4.h0
    public final int j(int i10) {
        rv rvVar = this.c;
        bv bvVar = rvVar.e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (rvVar.I) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = bvVar.c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (bvVar.c.length > 1) {
                size = Math.min(rvVar.y.J * 2, size);
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
    /* JADX WARN: Removed duplicated region for block: B:67:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b3  */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18 */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        px pxVar;
        TLRPC.Document document;
        boolean z10;
        TextView textView;
        boolean z11;
        int i11;
        int i12;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        rv rvVar = this.c;
        s4.s sVar = rvVar.y;
        bv bvVar = rvVar.e;
        int i13 = i10 - 1;
        int i14 = c1Var.f;
        View view = c1Var.a;
        CharSequence charSequence = null;
        charSequence = null;
        if (i14 == 1) {
            if (rvVar.I) {
                i13 = i10 - 2;
            }
            iv ivVar = (iv) view;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                ArrayList[] arrayListArr = bvVar.c;
                if (i16 >= arrayListArr.length) {
                    pxVar = null;
                    break;
                }
                int size = arrayListArr[i16].size();
                if (bvVar.c.length > 1) {
                    size = Math.min(sVar.J * 2, size);
                }
                if (i13 > i15 && i13 <= i15 + size) {
                    pxVar = (px) bvVar.c[i16].get((i13 - i15) - 1);
                    break;
                } else {
                    i15 += size + 2;
                    i16++;
                }
            }
            z5 z5Var = ivVar.c;
            if ((z5Var != null || pxVar == null) && ((pxVar != null || z5Var == null) && (pxVar == null || z5Var.documentId == pxVar.b))) {
                return;
            }
            if (pxVar == null) {
                ivVar.c = null;
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = pxVar.a;
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.short_name = stickerSet2.short_name;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            if (tL_messages_stickerSet.documents != null) {
                for (int i17 = 0; i17 < pxVar.a.documents.size(); i17++) {
                    document = pxVar.a.documents.get(i17);
                    if (document != null && document.id == pxVar.b) {
                        break;
                    }
                }
            }
            document = null;
            if (document != null) {
                ivVar.c = new z5(document, (Paint.FontMetricsInt) null);
                return;
            } else {
                ivVar.c = new z5(pxVar.b, (Paint.FontMetricsInt) null);
                return;
            }
        }
        if (i14 != 2) {
            if (i14 != 3) {
                return;
            }
            TextView textView2 = (TextView) view;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(rvVar.getThemedColor(org.telegram.ui.ActionBar.j6.We));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PremiumPreviewEmojiPack)));
            textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(14.0f));
            return;
        }
        if (rvVar.I && i13 > 0) {
            i13 = i10 - 2;
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            ArrayList[] arrayListArr2 = bvVar.c;
            if (i18 >= arrayListArr2.length) {
                break;
            }
            int size2 = arrayListArr2[i18].size();
            if (bvVar.c.length > 1) {
                size2 = Math.min(sVar.J * 2, size2);
            }
            if (i13 == i19) {
                break;
            }
            i19 += size2 + 2;
            i18++;
        }
        ArrayList arrayList2 = bvVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (arrayList2 == null || i18 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) bvVar.b.get(i18);
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
            for (int i20 = 0; i20 < tL_messages_stickerSet2.documents.size(); i20++) {
                if (!MessageObject.isFreeEmoji(tL_messages_stickerSet2.documents.get(i20))) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (i18 < bvVar.c.length) {
            mv mvVar = (mv) view;
            int size3 = (tL_messages_stickerSet2 == null || (arrayList = tL_messages_stickerSet2.documents) == null) ? 0 : arrayList.size();
            TextView textView3 = mvVar.d;
            TextView textView4 = mvVar.c;
            rv rvVar2 = mvVar.x;
            sg.r0 r0Var = mvVar.e;
            d90 d90Var = mvVar.a;
            mvVar.r = tL_messages_stickerSet2;
            if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.set == null) {
                d90Var.setText((CharSequence) null);
            } else {
                try {
                    if (rv.V == null) {
                        rv.V = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                    }
                    Matcher matcher = rv.V.matcher(tL_messages_stickerSet2.set.title);
                    while (true) {
                        ?? r82 = charSequence;
                        if (!matcher.find()) {
                            break;
                        }
                        if (charSequence == null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messages_stickerSet2.set.title);
                            try {
                                d90Var.setMovementMethod(new pv(0));
                                r82 = spannableStringBuilder;
                            } catch (Exception e7) {
                                e = e7;
                                charSequence = spannableStringBuilder;
                                FileLog.e(e);
                                if (charSequence == null) {
                                }
                                d90Var.setText(charSequence);
                                textView = mvVar.b;
                                if (textView != null) {
                                }
                                if (z10) {
                                    i12 = ((org.telegram.ui.ActionBar.f3) rvVar2).currentAccount;
                                    if (!UserConfig.getInstance(i12).isPremium()) {
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
                                mvVar.a(z11, false);
                            }
                        }
                        int start = matcher.start();
                        int end = matcher.end();
                        if (tL_messages_stickerSet2.set.title.charAt(start) != '@') {
                            start++;
                        }
                        Matcher matcher2 = matcher;
                        r82.setSpan(new lv(mvVar, tL_messages_stickerSet2.set.title.subSequence(start + 1, end).toString()), start, end, 0);
                        matcher = matcher2;
                        charSequence = r82;
                    }
                } catch (Exception e10) {
                    e = e10;
                    charSequence = charSequence;
                }
                if (charSequence == null) {
                    charSequence = tL_messages_stickerSet2.set.title;
                }
                d90Var.setText(charSequence);
            }
            textView = mvVar.b;
            if (textView != null) {
                if (tL_messages_stickerSet2 == null || (stickerSet = tL_messages_stickerSet2.set) == null || stickerSet.emojis) {
                    textView.setText(LocaleController.formatPluralString("EmojiCount", size3, new Object[0]));
                } else {
                    textView.setText(LocaleController.formatPluralString("Stickers", size3, new Object[0]));
                }
            }
            if (z10 && r0Var != null) {
                i12 = ((org.telegram.ui.ActionBar.f3) rvVar2).currentAccount;
                if (!UserConfig.getInstance(i12).isPremium()) {
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
                i11 = ((org.telegram.ui.ActionBar.f3) rvVar2).currentAccount;
                if (MediaDataController.getInstance(i11).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                    z11 = true;
                    mvVar.a(z11, false);
                }
            }
            z11 = false;
            mvVar.a(z11, false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        rv rvVar = this.c;
        if (i10 == 0) {
            view = rvVar.d;
        } else {
            if (i10 == 1) {
                iv ivVar = new iv(rvVar.getContext());
                ivVar.a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = ivVar;
            } else if (i10 == 2) {
                view2 = new mv(rvVar, rvVar.getContext(), rvVar.e.c.length <= 1);
            } else if (i10 == 3) {
                view2 = new TextView(rvVar.getContext());
            } else if (i10 == 4) {
                View qvVar = new qv(rvVar.getContext());
                int i11 = org.telegram.ui.ActionBar.j6.Ke;
                Pattern pattern = rv.V;
                qvVar.setBackgroundColor(rvVar.getThemedColor(i11));
                s4.p0 p0Var = new s4.p0(-1, AndroidUtilities.getShadowHeight());
                ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(14.0f);
                qvVar.setLayoutParams(p0Var);
                view2 = qvVar;
            } else {
                view = null;
            }
            view = view2;
        }
        return new vk0(view);
    }
}
