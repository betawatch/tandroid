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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zu extends ql0 {
    public final /* synthetic */ lv c;

    public zu(lv lvVar) {
        this.c = lvVar;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 1;
    }

    public final int E(int i10) {
        lv lvVar = this.c;
        vu vuVar = lvVar.e;
        int i11 = lvVar.F ? 2 : 1;
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = vuVar.c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (vuVar.c.length > 1) {
                size = Math.min(lvVar.y.J * 2, size);
            }
            i11 += size + 2;
            i12++;
        }
        return i11;
    }

    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    @Override // f2.o0
    public final int h() {
        int i10;
        int i11;
        ArrayList arrayList;
        lv lvVar = this.c;
        vu vuVar = lvVar.e;
        i10 = ((org.telegram.ui.ActionBar.g3) lvVar).currentAccount;
        ?? r22 = (UserConfig.getInstance(i10).isPremium() || (arrayList = vuVar.b) == null || arrayList.size() != 1 || !MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) vuVar.b.get(0))) ? 0 : 1;
        lvVar.F = r22;
        int i12 = r22 + 1;
        if (vuVar.c != null) {
            int i13 = 0;
            i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = vuVar.c;
                if (i13 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i13];
                if (arrayList2 != null) {
                    i11 = (arrayListArr.length == 1 ? arrayList2.size() : Math.min(vuVar.f.y.J * 2, arrayList2.size())) + i11 + 1;
                }
                i13++;
            }
        } else {
            i11 = 0;
        }
        return Math.max(0, vuVar.c.length - 1) + i12 + i11;
    }

    @Override // f2.o0
    public final int j(int i10) {
        lv lvVar = this.c;
        vu vuVar = lvVar.e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (lvVar.F) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = vuVar.c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (vuVar.c.length > 1) {
                size = Math.min(lvVar.y.J * 2, size);
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
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        nx nxVar;
        TLRPC.Document document;
        boolean z4;
        TextView textView;
        boolean z10;
        int i11;
        int i12;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        lv lvVar = this.c;
        f2.w wVar = lvVar.y;
        vu vuVar = lvVar.e;
        int i13 = i10 - 1;
        int i14 = l1Var.f;
        View view = l1Var.a;
        CharSequence charSequence = null;
        charSequence = null;
        if (i14 == 1) {
            if (lvVar.F) {
                i13 = i10 - 2;
            }
            cv cvVar = (cv) view;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                ArrayList[] arrayListArr = vuVar.c;
                if (i16 >= arrayListArr.length) {
                    nxVar = null;
                    break;
                }
                int size = arrayListArr[i16].size();
                if (vuVar.c.length > 1) {
                    size = Math.min(wVar.J * 2, size);
                }
                if (i13 > i15 && i13 <= i15 + size) {
                    nxVar = (nx) vuVar.c[i16].get((i13 - i15) - 1);
                    break;
                } else {
                    i15 += size + 2;
                    i16++;
                }
            }
            u5 u5Var = cvVar.c;
            if ((u5Var != null || nxVar == null) && ((nxVar != null || u5Var == null) && (nxVar == null || u5Var.documentId == nxVar.b))) {
                return;
            }
            if (nxVar == null) {
                cvVar.c = null;
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nxVar.a;
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.short_name = stickerSet2.short_name;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            if (tL_messages_stickerSet.documents != null) {
                for (int i17 = 0; i17 < nxVar.a.documents.size(); i17++) {
                    document = nxVar.a.documents.get(i17);
                    if (document != null && document.id == nxVar.b) {
                        break;
                    }
                }
            }
            document = null;
            if (document != null) {
                cvVar.c = new u5(document, (Paint.FontMetricsInt) null);
                return;
            } else {
                cvVar.c = new u5(nxVar.b, (Paint.FontMetricsInt) null);
                return;
            }
        }
        if (i14 != 2) {
            if (i14 != 3) {
                return;
            }
            TextView textView2 = (TextView) view;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(lvVar.getThemedColor(org.telegram.ui.ActionBar.j6.We));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PremiumPreviewEmojiPack)));
            textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(14.0f));
            return;
        }
        if (lvVar.F && i13 > 0) {
            i13 = i10 - 2;
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            ArrayList[] arrayListArr2 = vuVar.c;
            if (i18 >= arrayListArr2.length) {
                break;
            }
            int size2 = arrayListArr2[i18].size();
            if (vuVar.c.length > 1) {
                size2 = Math.min(wVar.J * 2, size2);
            }
            if (i13 == i19) {
                break;
            }
            i19 += size2 + 2;
            i18++;
        }
        ArrayList arrayList2 = vuVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (arrayList2 == null || i18 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) vuVar.b.get(i18);
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
            for (int i20 = 0; i20 < tL_messages_stickerSet2.documents.size(); i20++) {
                if (!MessageObject.isFreeEmoji(tL_messages_stickerSet2.documents.get(i20))) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        if (i18 < vuVar.c.length) {
            gv gvVar = (gv) view;
            int size3 = (tL_messages_stickerSet2 == null || (arrayList = tL_messages_stickerSet2.documents) == null) ? 0 : arrayList.size();
            TextView textView3 = gvVar.d;
            TextView textView4 = gvVar.c;
            lv lvVar2 = gvVar.x;
            eg.c1 c1Var = gvVar.e;
            f90 f90Var = gvVar.a;
            gvVar.r = tL_messages_stickerSet2;
            if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.set == null) {
                f90Var.setText((CharSequence) null);
            } else {
                try {
                    if (lv.S == null) {
                        lv.S = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                    }
                    Matcher matcher = lv.S.matcher(tL_messages_stickerSet2.set.title);
                    while (true) {
                        ?? r82 = charSequence;
                        if (!matcher.find()) {
                            break;
                        }
                        if (charSequence == null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messages_stickerSet2.set.title);
                            try {
                                f90Var.setMovementMethod(new jv(0));
                                r82 = spannableStringBuilder;
                            } catch (Exception e) {
                                e = e;
                                charSequence = spannableStringBuilder;
                                FileLog.e(e);
                                if (charSequence == null) {
                                }
                                f90Var.setText(charSequence);
                                textView = gvVar.b;
                                if (textView != null) {
                                }
                                if (z4) {
                                    i12 = ((org.telegram.ui.ActionBar.g3) lvVar2).currentAccount;
                                    if (!UserConfig.getInstance(i12).isPremium()) {
                                    }
                                }
                                if (c1Var != null) {
                                }
                                if (textView4 != null) {
                                }
                                if (textView3 != null) {
                                }
                                if (tL_messages_stickerSet2 != null) {
                                }
                                z10 = false;
                                gvVar.a(z10, false);
                            }
                        }
                        int start = matcher.start();
                        int end = matcher.end();
                        if (tL_messages_stickerSet2.set.title.charAt(start) != '@') {
                            start++;
                        }
                        Matcher matcher2 = matcher;
                        r82.setSpan(new fv(gvVar, tL_messages_stickerSet2.set.title.subSequence(start + 1, end).toString()), start, end, 0);
                        matcher = matcher2;
                        charSequence = r82;
                    }
                } catch (Exception e6) {
                    e = e6;
                    charSequence = charSequence;
                }
                if (charSequence == null) {
                    charSequence = tL_messages_stickerSet2.set.title;
                }
                f90Var.setText(charSequence);
            }
            textView = gvVar.b;
            if (textView != null) {
                if (tL_messages_stickerSet2 == null || (stickerSet = tL_messages_stickerSet2.set) == null || stickerSet.emojis) {
                    textView.setText(LocaleController.formatPluralString("EmojiCount", size3, new Object[0]));
                } else {
                    textView.setText(LocaleController.formatPluralString("Stickers", size3, new Object[0]));
                }
            }
            if (z4 && c1Var != null) {
                i12 = ((org.telegram.ui.ActionBar.g3) lvVar2).currentAccount;
                if (!UserConfig.getInstance(i12).isPremium()) {
                    c1Var.setVisibility(0);
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
            if (c1Var != null) {
                c1Var.setVisibility(8);
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (tL_messages_stickerSet2 != null) {
                i11 = ((org.telegram.ui.ActionBar.g3) lvVar2).currentAccount;
                if (MediaDataController.getInstance(i11).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                    z10 = true;
                    gvVar.a(z10, false);
                }
            }
            z10 = false;
            gvVar.a(z10, false);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        lv lvVar = this.c;
        if (i10 == 0) {
            view = lvVar.d;
        } else {
            if (i10 == 1) {
                cv cvVar = new cv(lvVar.getContext());
                cvVar.a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = cvVar;
            } else if (i10 == 2) {
                view2 = new gv(lvVar, lvVar.getContext(), lvVar.e.c.length <= 1);
            } else if (i10 == 3) {
                view2 = new TextView(lvVar.getContext());
            } else if (i10 == 4) {
                View kvVar = new kv(lvVar.getContext());
                int i11 = org.telegram.ui.ActionBar.j6.Ke;
                Pattern pattern = lv.S;
                kvVar.setBackgroundColor(lvVar.getThemedColor(i11));
                f2.w0 w0Var = new f2.w0(-1, AndroidUtilities.getShadowHeight());
                ((ViewGroup.MarginLayoutParams) w0Var).topMargin = AndroidUtilities.dp(14.0f);
                kvVar.setLayoutParams(w0Var);
                view2 = kvVar;
            } else {
                view = null;
            }
            view = view2;
        }
        return new dl0(view);
    }
}
