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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xu extends il0 {
    public final /* synthetic */ jv c;

    public xu(jv jvVar) {
        this.c = jvVar;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 1;
    }

    public final int E(int i10) {
        jv jvVar = this.c;
        tu tuVar = jvVar.e;
        int i11 = jvVar.E ? 2 : 1;
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = tuVar.c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (tuVar.c.length > 1) {
                size = Math.min(jvVar.y.J * 2, size);
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
        jv jvVar = this.c;
        tu tuVar = jvVar.e;
        i10 = ((org.telegram.ui.ActionBar.f3) jvVar).currentAccount;
        ?? r22 = (UserConfig.getInstance(i10).isPremium() || (arrayList = tuVar.b) == null || arrayList.size() != 1 || !MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) tuVar.b.get(0))) ? 0 : 1;
        jvVar.E = r22;
        int i12 = r22 + 1;
        if (tuVar.c != null) {
            int i13 = 0;
            i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = tuVar.c;
                if (i13 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i13];
                if (arrayList2 != null) {
                    i11 = (arrayListArr.length == 1 ? arrayList2.size() : Math.min(tuVar.f.y.J * 2, arrayList2.size())) + i11 + 1;
                }
                i13++;
            }
        } else {
            i11 = 0;
        }
        return Math.max(0, tuVar.c.length - 1) + i12 + i11;
    }

    @Override // f2.p0
    public final int j(int i10) {
        jv jvVar = this.c;
        tu tuVar = jvVar.e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (jvVar.E) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = tuVar.c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (tuVar.c.length > 1) {
                size = Math.min(jvVar.y.J * 2, size);
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
    public final void v(f2.n1 n1Var, int i10) {
        ix ixVar;
        TLRPC.Document document;
        boolean z10;
        TextView textView;
        boolean z11;
        int i11;
        int i12;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        jv jvVar = this.c;
        f2.w wVar = jvVar.y;
        tu tuVar = jvVar.e;
        int i13 = i10 - 1;
        int i14 = n1Var.f;
        View view = n1Var.a;
        CharSequence charSequence = null;
        charSequence = null;
        if (i14 == 1) {
            if (jvVar.E) {
                i13 = i10 - 2;
            }
            av avVar = (av) view;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                ArrayList[] arrayListArr = tuVar.c;
                if (i16 >= arrayListArr.length) {
                    ixVar = null;
                    break;
                }
                int size = arrayListArr[i16].size();
                if (tuVar.c.length > 1) {
                    size = Math.min(wVar.J * 2, size);
                }
                if (i13 > i15 && i13 <= i15 + size) {
                    ixVar = (ix) tuVar.c[i16].get((i13 - i15) - 1);
                    break;
                } else {
                    i15 += size + 2;
                    i16++;
                }
            }
            y5 y5Var = avVar.c;
            if ((y5Var != null || ixVar == null) && ((ixVar != null || y5Var == null) && (ixVar == null || y5Var.documentId == ixVar.b))) {
                return;
            }
            if (ixVar == null) {
                avVar.c = null;
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = ixVar.a;
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.short_name = stickerSet2.short_name;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            if (tL_messages_stickerSet.documents != null) {
                for (int i17 = 0; i17 < ixVar.a.documents.size(); i17++) {
                    document = ixVar.a.documents.get(i17);
                    if (document != null && document.id == ixVar.b) {
                        break;
                    }
                }
            }
            document = null;
            if (document != null) {
                avVar.c = new y5(document, (Paint.FontMetricsInt) null);
                return;
            } else {
                avVar.c = new y5(ixVar.b, (Paint.FontMetricsInt) null);
                return;
            }
        }
        if (i14 != 2) {
            if (i14 != 3) {
                return;
            }
            TextView textView2 = (TextView) view;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.We));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PremiumPreviewEmojiPack)));
            textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(14.0f));
            return;
        }
        if (jvVar.E && i13 > 0) {
            i13 = i10 - 2;
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            ArrayList[] arrayListArr2 = tuVar.c;
            if (i18 >= arrayListArr2.length) {
                break;
            }
            int size2 = arrayListArr2[i18].size();
            if (tuVar.c.length > 1) {
                size2 = Math.min(wVar.J * 2, size2);
            }
            if (i13 == i19) {
                break;
            }
            i19 += size2 + 2;
            i18++;
        }
        ArrayList arrayList2 = tuVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (arrayList2 == null || i18 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) tuVar.b.get(i18);
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
            for (int i20 = 0; i20 < tL_messages_stickerSet2.documents.size(); i20++) {
                if (!MessageObject.isFreeEmoji(tL_messages_stickerSet2.documents.get(i20))) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (i18 < tuVar.c.length) {
            ev evVar = (ev) view;
            int size3 = (tL_messages_stickerSet2 == null || (arrayList = tL_messages_stickerSet2.documents) == null) ? 0 : arrayList.size();
            TextView textView3 = evVar.d;
            TextView textView4 = evVar.c;
            jv jvVar2 = evVar.x;
            cg.d1 d1Var = evVar.e;
            y80 y80Var = evVar.a;
            evVar.r = tL_messages_stickerSet2;
            if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.set == null) {
                y80Var.setText((CharSequence) null);
            } else {
                try {
                    if (jv.R == null) {
                        jv.R = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                    }
                    Matcher matcher = jv.R.matcher(tL_messages_stickerSet2.set.title);
                    while (true) {
                        ?? r82 = charSequence;
                        if (!matcher.find()) {
                            break;
                        }
                        if (charSequence == null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messages_stickerSet2.set.title);
                            try {
                                y80Var.setMovementMethod(new hv(0));
                                r82 = spannableStringBuilder;
                            } catch (Exception e10) {
                                e = e10;
                                charSequence = spannableStringBuilder;
                                FileLog.e(e);
                                if (charSequence == null) {
                                }
                                y80Var.setText(charSequence);
                                textView = evVar.b;
                                if (textView != null) {
                                }
                                if (z10) {
                                    i12 = ((org.telegram.ui.ActionBar.f3) jvVar2).currentAccount;
                                    if (!UserConfig.getInstance(i12).isPremium()) {
                                    }
                                }
                                if (d1Var != null) {
                                }
                                if (textView4 != null) {
                                }
                                if (textView3 != null) {
                                }
                                if (tL_messages_stickerSet2 != null) {
                                }
                                z11 = false;
                                evVar.a(z11, false);
                            }
                        }
                        int start = matcher.start();
                        int end = matcher.end();
                        if (tL_messages_stickerSet2.set.title.charAt(start) != '@') {
                            start++;
                        }
                        Matcher matcher2 = matcher;
                        r82.setSpan(new dv(evVar, tL_messages_stickerSet2.set.title.subSequence(start + 1, end).toString()), start, end, 0);
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
                y80Var.setText(charSequence);
            }
            textView = evVar.b;
            if (textView != null) {
                if (tL_messages_stickerSet2 == null || (stickerSet = tL_messages_stickerSet2.set) == null || stickerSet.emojis) {
                    textView.setText(LocaleController.formatPluralString("EmojiCount", size3, new Object[0]));
                } else {
                    textView.setText(LocaleController.formatPluralString("Stickers", size3, new Object[0]));
                }
            }
            if (z10 && d1Var != null) {
                i12 = ((org.telegram.ui.ActionBar.f3) jvVar2).currentAccount;
                if (!UserConfig.getInstance(i12).isPremium()) {
                    d1Var.setVisibility(0);
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
            if (d1Var != null) {
                d1Var.setVisibility(8);
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (tL_messages_stickerSet2 != null) {
                i11 = ((org.telegram.ui.ActionBar.f3) jvVar2).currentAccount;
                if (MediaDataController.getInstance(i11).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                    z11 = true;
                    evVar.a(z11, false);
                }
            }
            z11 = false;
            evVar.a(z11, false);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        jv jvVar = this.c;
        if (i10 == 0) {
            view = jvVar.d;
        } else {
            if (i10 == 1) {
                av avVar = new av(jvVar.getContext());
                avVar.a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = avVar;
            } else if (i10 == 2) {
                view2 = new ev(jvVar, jvVar.getContext(), jvVar.e.c.length <= 1);
            } else if (i10 == 3) {
                view2 = new TextView(jvVar.getContext());
            } else if (i10 == 4) {
                View ivVar = new iv(jvVar.getContext());
                int i11 = org.telegram.ui.ActionBar.g6.Ke;
                Pattern pattern = jv.R;
                ivVar.setBackgroundColor(jvVar.getThemedColor(i11));
                f2.x0 x0Var = new f2.x0(-1, AndroidUtilities.getShadowHeight());
                ((ViewGroup.MarginLayoutParams) x0Var).topMargin = AndroidUtilities.dp(14.0f);
                ivVar.setLayoutParams(x0Var);
                view2 = ivVar;
            } else {
                view = null;
            }
            view = view2;
        }
        return new vk0(view);
    }
}
