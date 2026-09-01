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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class cv extends sl0 {
    public final /* synthetic */ ov c;

    public cv(ov ovVar) {
        this.c = ovVar;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 1;
    }

    public final int E(int i10) {
        ov ovVar = this.c;
        yu yuVar = ovVar.e;
        int i11 = ovVar.F ? 2 : 1;
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = yuVar.c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (yuVar.c.length > 1) {
                size = Math.min(ovVar.y.J * 2, size);
            }
            i11 += size + 2;
            i12++;
        }
        return i11;
    }

    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    @Override // f2.p0
    public final int h() {
        int i10;
        int i11;
        ArrayList arrayList;
        ov ovVar = this.c;
        yu yuVar = ovVar.e;
        i10 = ((org.telegram.ui.ActionBar.h3) ovVar).currentAccount;
        ?? r22 = (UserConfig.getInstance(i10).isPremium() || (arrayList = yuVar.b) == null || arrayList.size() != 1 || !MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) yuVar.b.get(0))) ? 0 : 1;
        ovVar.F = r22;
        int i12 = r22 + 1;
        if (yuVar.c != null) {
            int i13 = 0;
            i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = yuVar.c;
                if (i13 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i13];
                if (arrayList2 != null) {
                    i11 = (arrayListArr.length == 1 ? arrayList2.size() : Math.min(yuVar.f.y.J * 2, arrayList2.size())) + i11 + 1;
                }
                i13++;
            }
        } else {
            i11 = 0;
        }
        return Math.max(0, yuVar.c.length - 1) + i12 + i11;
    }

    @Override // f2.p0
    public final int j(int i10) {
        ov ovVar = this.c;
        yu yuVar = ovVar.e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (ovVar.F) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = yuVar.c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (yuVar.c.length > 1) {
                size = Math.min(ovVar.y.J * 2, size);
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
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        px pxVar;
        TLRPC.Document document;
        boolean z4;
        TextView textView;
        boolean z10;
        int i11;
        int i12;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        ov ovVar = this.c;
        f2.w wVar = ovVar.y;
        yu yuVar = ovVar.e;
        int i13 = i10 - 1;
        int i14 = m1Var.f;
        View view = m1Var.a;
        CharSequence charSequence = null;
        charSequence = null;
        if (i14 == 1) {
            if (ovVar.F) {
                i13 = i10 - 2;
            }
            fv fvVar = (fv) view;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                ArrayList[] arrayListArr = yuVar.c;
                if (i16 >= arrayListArr.length) {
                    pxVar = null;
                    break;
                }
                int size = arrayListArr[i16].size();
                if (yuVar.c.length > 1) {
                    size = Math.min(wVar.J * 2, size);
                }
                if (i13 > i15 && i13 <= i15 + size) {
                    pxVar = (px) yuVar.c[i16].get((i13 - i15) - 1);
                    break;
                } else {
                    i15 += size + 2;
                    i16++;
                }
            }
            u5 u5Var = fvVar.c;
            if ((u5Var != null || pxVar == null) && ((pxVar != null || u5Var == null) && (pxVar == null || u5Var.documentId == pxVar.b))) {
                return;
            }
            if (pxVar == null) {
                fvVar.c = null;
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
                fvVar.c = new u5(document, (Paint.FontMetricsInt) null);
                return;
            } else {
                fvVar.c = new u5(pxVar.b, (Paint.FontMetricsInt) null);
                return;
            }
        }
        if (i14 != 2) {
            if (i14 != 3) {
                return;
            }
            TextView textView2 = (TextView) view;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(ovVar.getThemedColor(org.telegram.ui.ActionBar.k6.We));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PremiumPreviewEmojiPack)));
            textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(14.0f));
            return;
        }
        if (ovVar.F && i13 > 0) {
            i13 = i10 - 2;
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            ArrayList[] arrayListArr2 = yuVar.c;
            if (i18 >= arrayListArr2.length) {
                break;
            }
            int size2 = arrayListArr2[i18].size();
            if (yuVar.c.length > 1) {
                size2 = Math.min(wVar.J * 2, size2);
            }
            if (i13 == i19) {
                break;
            }
            i19 += size2 + 2;
            i18++;
        }
        ArrayList arrayList2 = yuVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (arrayList2 == null || i18 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) yuVar.b.get(i18);
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
            for (int i20 = 0; i20 < tL_messages_stickerSet2.documents.size(); i20++) {
                if (!MessageObject.isFreeEmoji(tL_messages_stickerSet2.documents.get(i20))) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        if (i18 < yuVar.c.length) {
            jv jvVar = (jv) view;
            int size3 = (tL_messages_stickerSet2 == null || (arrayList = tL_messages_stickerSet2.documents) == null) ? 0 : arrayList.size();
            TextView textView3 = jvVar.d;
            TextView textView4 = jvVar.c;
            ov ovVar2 = jvVar.x;
            fg.b1 b1Var = jvVar.e;
            g90 g90Var = jvVar.a;
            jvVar.r = tL_messages_stickerSet2;
            if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.set == null) {
                g90Var.setText((CharSequence) null);
            } else {
                try {
                    if (ov.S == null) {
                        ov.S = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                    }
                    Matcher matcher = ov.S.matcher(tL_messages_stickerSet2.set.title);
                    while (true) {
                        ?? r82 = charSequence;
                        if (!matcher.find()) {
                            break;
                        }
                        if (charSequence == null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messages_stickerSet2.set.title);
                            try {
                                g90Var.setMovementMethod(new mv(0));
                                r82 = spannableStringBuilder;
                            } catch (Exception e6) {
                                e = e6;
                                charSequence = spannableStringBuilder;
                                FileLog.e(e);
                                if (charSequence == null) {
                                }
                                g90Var.setText(charSequence);
                                textView = jvVar.b;
                                if (textView != null) {
                                }
                                if (z4) {
                                    i12 = ((org.telegram.ui.ActionBar.h3) ovVar2).currentAccount;
                                    if (!UserConfig.getInstance(i12).isPremium()) {
                                    }
                                }
                                if (b1Var != null) {
                                }
                                if (textView4 != null) {
                                }
                                if (textView3 != null) {
                                }
                                if (tL_messages_stickerSet2 != null) {
                                }
                                z10 = false;
                                jvVar.a(z10, false);
                            }
                        }
                        int start = matcher.start();
                        int end = matcher.end();
                        if (tL_messages_stickerSet2.set.title.charAt(start) != '@') {
                            start++;
                        }
                        Matcher matcher2 = matcher;
                        r82.setSpan(new iv(jvVar, tL_messages_stickerSet2.set.title.subSequence(start + 1, end).toString()), start, end, 0);
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
                g90Var.setText(charSequence);
            }
            textView = jvVar.b;
            if (textView != null) {
                if (tL_messages_stickerSet2 == null || (stickerSet = tL_messages_stickerSet2.set) == null || stickerSet.emojis) {
                    textView.setText(LocaleController.formatPluralString("EmojiCount", size3, new Object[0]));
                } else {
                    textView.setText(LocaleController.formatPluralString("Stickers", size3, new Object[0]));
                }
            }
            if (z4 && b1Var != null) {
                i12 = ((org.telegram.ui.ActionBar.h3) ovVar2).currentAccount;
                if (!UserConfig.getInstance(i12).isPremium()) {
                    b1Var.setVisibility(0);
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
            if (b1Var != null) {
                b1Var.setVisibility(8);
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (tL_messages_stickerSet2 != null) {
                i11 = ((org.telegram.ui.ActionBar.h3) ovVar2).currentAccount;
                if (MediaDataController.getInstance(i11).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                    z10 = true;
                    jvVar.a(z10, false);
                }
            }
            z10 = false;
            jvVar.a(z10, false);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        ov ovVar = this.c;
        if (i10 == 0) {
            view = ovVar.d;
        } else {
            if (i10 == 1) {
                fv fvVar = new fv(ovVar.getContext());
                fvVar.a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = fvVar;
            } else if (i10 == 2) {
                view2 = new jv(ovVar, ovVar.getContext(), ovVar.e.c.length <= 1);
            } else if (i10 == 3) {
                view2 = new TextView(ovVar.getContext());
            } else if (i10 == 4) {
                View nvVar = new nv(ovVar.getContext());
                int i11 = org.telegram.ui.ActionBar.k6.Ke;
                Pattern pattern = ov.S;
                nvVar.setBackgroundColor(ovVar.getThemedColor(i11));
                f2.x0 x0Var = new f2.x0(-1, AndroidUtilities.getShadowHeight());
                ((ViewGroup.MarginLayoutParams) x0Var).topMargin = AndroidUtilities.dp(14.0f);
                nvVar.setLayoutParams(x0Var);
                view2 = nvVar;
            } else {
                view = null;
            }
            view = view2;
        }
        return new fl0(view);
    }
}
