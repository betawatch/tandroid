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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ru extends vk0 {
    public final /* synthetic */ dv c;

    public ru(dv dvVar) {
        this.c = dvVar;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 1;
    }

    public final int E(int i9) {
        dv dvVar = this.c;
        nu nuVar = dvVar.e;
        int i10 = dvVar.E ? 2 : 1;
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = nuVar.c;
            if (i11 >= arrayListArr.length || i11 == i9) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (nuVar.c.length > 1) {
                size = Math.min(dvVar.y.J * 2, size);
            }
            i10 += size + 2;
            i11++;
        }
        return i10;
    }

    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    @Override // f2.r0
    public final int h() {
        int i9;
        int i10;
        ArrayList arrayList;
        dv dvVar = this.c;
        nu nuVar = dvVar.e;
        i9 = ((org.telegram.ui.ActionBar.f3) dvVar).currentAccount;
        ?? r22 = (UserConfig.getInstance(i9).isPremium() || (arrayList = nuVar.b) == null || arrayList.size() != 1 || !MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) nuVar.b.get(0))) ? 0 : 1;
        dvVar.E = r22;
        int i11 = r22 + 1;
        if (nuVar.c != null) {
            int i12 = 0;
            i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = nuVar.c;
                if (i12 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i12];
                if (arrayList2 != null) {
                    i10 = (arrayListArr.length == 1 ? arrayList2.size() : Math.min(nuVar.f.y.J * 2, arrayList2.size())) + i10 + 1;
                }
                i12++;
            }
        } else {
            i10 = 0;
        }
        return Math.max(0, nuVar.c.length - 1) + i11 + i10;
    }

    @Override // f2.r0
    public final int j(int i9) {
        dv dvVar = this.c;
        nu nuVar = dvVar.e;
        int i10 = 0;
        if (i9 == 0) {
            return 0;
        }
        int i11 = i9 - 1;
        if (dvVar.E) {
            if (i11 == 1) {
                return 3;
            }
            if (i11 > 0) {
                i11 = i9 - 2;
            }
        }
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = nuVar.c;
            if (i10 >= arrayListArr.length) {
                return 1;
            }
            if (i11 == i12) {
                return 2;
            }
            int size = arrayListArr[i10].size();
            if (nuVar.c.length > 1) {
                size = Math.min(dvVar.y.J * 2, size);
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
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        bx bxVar;
        TLRPC.Document document;
        boolean z10;
        TextView textView;
        boolean z11;
        int i10;
        int i11;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        dv dvVar = this.c;
        f2.y yVar = dvVar.y;
        nu nuVar = dvVar.e;
        int i12 = i9 - 1;
        int i13 = q1Var.f;
        View view = q1Var.a;
        CharSequence charSequence = null;
        charSequence = null;
        if (i13 == 1) {
            if (dvVar.E) {
                i12 = i9 - 2;
            }
            uu uuVar = (uu) view;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                ArrayList[] arrayListArr = nuVar.c;
                if (i15 >= arrayListArr.length) {
                    bxVar = null;
                    break;
                }
                int size = arrayListArr[i15].size();
                if (nuVar.c.length > 1) {
                    size = Math.min(yVar.J * 2, size);
                }
                if (i12 > i14 && i12 <= i14 + size) {
                    bxVar = (bx) nuVar.c[i15].get((i12 - i14) - 1);
                    break;
                } else {
                    i14 += size + 2;
                    i15++;
                }
            }
            t5 t5Var = uuVar.c;
            if ((t5Var != null || bxVar == null) && ((bxVar != null || t5Var == null) && (bxVar == null || t5Var.documentId == bxVar.b))) {
                return;
            }
            if (bxVar == null) {
                uuVar.c = null;
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = bxVar.a;
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.short_name = stickerSet2.short_name;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            if (tL_messages_stickerSet.documents != null) {
                for (int i16 = 0; i16 < bxVar.a.documents.size(); i16++) {
                    document = bxVar.a.documents.get(i16);
                    if (document != null && document.id == bxVar.b) {
                        break;
                    }
                }
            }
            document = null;
            if (document != null) {
                uuVar.c = new t5(document, (Paint.FontMetricsInt) null);
                return;
            } else {
                uuVar.c = new t5(bxVar.b, (Paint.FontMetricsInt) null);
                return;
            }
        }
        if (i13 != 2) {
            if (i13 != 3) {
                return;
            }
            TextView textView2 = (TextView) view;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.We));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PremiumPreviewEmojiPack)));
            textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(14.0f));
            return;
        }
        if (dvVar.E && i12 > 0) {
            i12 = i9 - 2;
        }
        int i17 = 0;
        int i18 = 0;
        while (true) {
            ArrayList[] arrayListArr2 = nuVar.c;
            if (i17 >= arrayListArr2.length) {
                break;
            }
            int size2 = arrayListArr2[i17].size();
            if (nuVar.c.length > 1) {
                size2 = Math.min(yVar.J * 2, size2);
            }
            if (i12 == i18) {
                break;
            }
            i18 += size2 + 2;
            i17++;
        }
        ArrayList arrayList2 = nuVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (arrayList2 == null || i17 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) nuVar.b.get(i17);
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
            for (int i19 = 0; i19 < tL_messages_stickerSet2.documents.size(); i19++) {
                if (!MessageObject.isFreeEmoji(tL_messages_stickerSet2.documents.get(i19))) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (i17 < nuVar.c.length) {
            yu yuVar = (yu) view;
            int size3 = (tL_messages_stickerSet2 == null || (arrayList = tL_messages_stickerSet2.documents) == null) ? 0 : arrayList.size();
            TextView textView3 = yuVar.d;
            TextView textView4 = yuVar.c;
            dv dvVar2 = yuVar.x;
            zf.p0 p0Var = yuVar.e;
            l80 l80Var = yuVar.a;
            yuVar.r = tL_messages_stickerSet2;
            if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.set == null) {
                l80Var.setText((CharSequence) null);
            } else {
                try {
                    if (dv.R == null) {
                        dv.R = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                    }
                    Matcher matcher = dv.R.matcher(tL_messages_stickerSet2.set.title);
                    while (true) {
                        ?? r82 = charSequence;
                        if (!matcher.find()) {
                            break;
                        }
                        if (charSequence == null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messages_stickerSet2.set.title);
                            try {
                                l80Var.setMovementMethod(new bv(0));
                                r82 = spannableStringBuilder;
                            } catch (Exception e10) {
                                e = e10;
                                charSequence = spannableStringBuilder;
                                FileLog.e(e);
                                if (charSequence == null) {
                                }
                                l80Var.setText(charSequence);
                                textView = yuVar.b;
                                if (textView != null) {
                                }
                                if (z10) {
                                    i11 = ((org.telegram.ui.ActionBar.f3) dvVar2).currentAccount;
                                    if (!UserConfig.getInstance(i11).isPremium()) {
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
                        charSequence = r82;
                    }
                } catch (Exception e11) {
                    e = e11;
                    charSequence = charSequence;
                }
                if (charSequence == null) {
                    charSequence = tL_messages_stickerSet2.set.title;
                }
                l80Var.setText(charSequence);
            }
            textView = yuVar.b;
            if (textView != null) {
                if (tL_messages_stickerSet2 == null || (stickerSet = tL_messages_stickerSet2.set) == null || stickerSet.emojis) {
                    textView.setText(LocaleController.formatPluralString("EmojiCount", size3, new Object[0]));
                } else {
                    textView.setText(LocaleController.formatPluralString("Stickers", size3, new Object[0]));
                }
            }
            if (z10 && p0Var != null) {
                i11 = ((org.telegram.ui.ActionBar.f3) dvVar2).currentAccount;
                if (!UserConfig.getInstance(i11).isPremium()) {
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
                i10 = ((org.telegram.ui.ActionBar.f3) dvVar2).currentAccount;
                if (MediaDataController.getInstance(i10).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                    z11 = true;
                    yuVar.a(z11, false);
                }
            }
            z11 = false;
            yuVar.a(z11, false);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        View view2;
        dv dvVar = this.c;
        if (i9 == 0) {
            view = dvVar.d;
        } else {
            if (i9 == 1) {
                uu uuVar = new uu(dvVar.getContext());
                uuVar.a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = uuVar;
            } else if (i9 == 2) {
                view2 = new yu(dvVar, dvVar.getContext(), dvVar.e.c.length <= 1);
            } else if (i9 == 3) {
                view2 = new TextView(dvVar.getContext());
            } else if (i9 == 4) {
                View cvVar = new cv(dvVar.getContext());
                int i10 = org.telegram.ui.ActionBar.f6.Ke;
                Pattern pattern = dv.R;
                cvVar.setBackgroundColor(dvVar.getThemedColor(i10));
                f2.a1 a1Var = new f2.a1(-1, AndroidUtilities.getShadowHeight());
                ((ViewGroup.MarginLayoutParams) a1Var).topMargin = AndroidUtilities.dp(14.0f);
                cvVar.setLayoutParams(a1Var);
                view2 = cvVar;
            } else {
                view = null;
            }
            view = view2;
        }
        return new ik0(view);
    }
}
