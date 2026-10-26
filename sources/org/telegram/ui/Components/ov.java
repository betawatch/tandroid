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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ov extends lm0 {
    public final /* synthetic */ aw c;

    public ov(aw awVar) {
        this.c = awVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 1;
    }

    public final int E(int i10) {
        aw awVar = this.c;
        kv kvVar = awVar.e;
        int i11 = awVar.I ? 2 : 1;
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = kvVar.c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (kvVar.c.length > 1) {
                size = Math.min(awVar.y.J * 2, size);
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
        aw awVar = this.c;
        kv kvVar = awVar.e;
        i10 = ((org.telegram.ui.ActionBar.k3) awVar).currentAccount;
        ?? r22 = (UserConfig.getInstance(i10).isPremium() || (arrayList = kvVar.b) == null || arrayList.size() != 1 || !MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) kvVar.b.get(0))) ? 0 : 1;
        awVar.I = r22;
        int i12 = r22 + 1;
        if (kvVar.c != null) {
            int i13 = 0;
            i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = kvVar.c;
                if (i13 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i13];
                if (arrayList2 != null) {
                    i11 = (arrayListArr.length == 1 ? arrayList2.size() : Math.min(kvVar.f.y.J * 2, arrayList2.size())) + i11 + 1;
                }
                i13++;
            }
        } else {
            i11 = 0;
        }
        return Math.max(0, kvVar.c.length - 1) + i12 + i11;
    }

    @Override // s4.h0
    public final int j(int i10) {
        aw awVar = this.c;
        kv kvVar = awVar.e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (awVar.I) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = kvVar.c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (kvVar.c.length > 1) {
                size = Math.min(awVar.y.J * 2, size);
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
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b2  */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18 */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        vx vxVar;
        TLRPC.Document document;
        boolean z10;
        TextView textView;
        boolean z11;
        int i11;
        int i12;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        org.telegram.ui.ActionBar.u6 u6Var;
        aw awVar = this.c;
        s4.t tVar = awVar.y;
        kv kvVar = awVar.e;
        int i13 = i10 - 1;
        int i14 = e1Var.f;
        View view = e1Var.a;
        CharSequence charSequence = null;
        charSequence = null;
        if (i14 == 1) {
            if (awVar.I) {
                i13 = i10 - 2;
            }
            rv rvVar = (rv) view;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                ArrayList[] arrayListArr = kvVar.c;
                if (i16 >= arrayListArr.length) {
                    vxVar = null;
                    break;
                }
                int size = arrayListArr[i16].size();
                if (kvVar.c.length > 1) {
                    size = Math.min(tVar.J * 2, size);
                }
                if (i13 > i15 && i13 <= i15 + size) {
                    vxVar = (vx) kvVar.c[i16].get((i13 - i15) - 1);
                    break;
                } else {
                    i15 += size + 2;
                    i16++;
                }
            }
            c6 c6Var = rvVar.c;
            if ((c6Var != null || vxVar == null) && ((vxVar != null || c6Var == null) && (vxVar == null || c6Var.documentId == vxVar.b))) {
                return;
            }
            if (vxVar == null) {
                rvVar.c = null;
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = vxVar.a;
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.short_name = stickerSet2.short_name;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            if (tL_messages_stickerSet.documents != null) {
                for (int i17 = 0; i17 < vxVar.a.documents.size(); i17++) {
                    document = vxVar.a.documents.get(i17);
                    if (document != null && document.id == vxVar.b) {
                        break;
                    }
                }
            }
            document = null;
            if (document != null) {
                rvVar.c = new c6(document, (Paint.FontMetricsInt) null);
                return;
            } else {
                rvVar.c = new c6(vxVar.b, (Paint.FontMetricsInt) null);
                return;
            }
        }
        if (i14 != 2) {
            if (i14 != 3) {
                return;
            }
            TextView textView2 = (TextView) view;
            textView2.setTextSize(1, 13.0f);
            int i18 = org.telegram.ui.ActionBar.y6.We;
            u6Var = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
            org.telegram.ui.ActionBar.f7.V(textView2, i18, u6Var);
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PremiumPreviewEmojiPack)));
            textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(14.0f));
            return;
        }
        if (awVar.I && i13 > 0) {
            i13 = i10 - 2;
        }
        int i19 = 0;
        int i20 = 0;
        while (true) {
            ArrayList[] arrayListArr2 = kvVar.c;
            if (i19 >= arrayListArr2.length) {
                break;
            }
            int size2 = arrayListArr2[i19].size();
            if (kvVar.c.length > 1) {
                size2 = Math.min(tVar.J * 2, size2);
            }
            if (i13 == i20) {
                break;
            }
            i20 += size2 + 2;
            i19++;
        }
        ArrayList arrayList2 = kvVar.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (arrayList2 == null || i19 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) kvVar.b.get(i19);
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
            for (int i21 = 0; i21 < tL_messages_stickerSet2.documents.size(); i21++) {
                if (!MessageObject.isFreeEmoji(tL_messages_stickerSet2.documents.get(i21))) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (i19 < kvVar.c.length) {
            vv vvVar = (vv) view;
            int size3 = (tL_messages_stickerSet2 == null || (arrayList = tL_messages_stickerSet2.documents) == null) ? 0 : arrayList.size();
            TextView textView3 = vvVar.d;
            TextView textView4 = vvVar.c;
            aw awVar2 = vvVar.x;
            tg.p0 p0Var = vvVar.e;
            z90 z90Var = vvVar.a;
            vvVar.r = tL_messages_stickerSet2;
            if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.set == null) {
                z90Var.setText((CharSequence) null);
            } else {
                try {
                    if (aw.V == null) {
                        aw.V = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                    }
                    Matcher matcher = aw.V.matcher(tL_messages_stickerSet2.set.title);
                    while (true) {
                        ?? r82 = charSequence;
                        if (!matcher.find()) {
                            break;
                        }
                        if (charSequence == null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messages_stickerSet2.set.title);
                            try {
                                z90Var.setMovementMethod(new yv(0));
                                r82 = spannableStringBuilder;
                            } catch (Exception e) {
                                e = e;
                                charSequence = spannableStringBuilder;
                                FileLog.e(e);
                                if (charSequence == null) {
                                }
                                z90Var.setText(charSequence);
                                textView = vvVar.b;
                                if (textView != null) {
                                }
                                if (z10) {
                                    i12 = ((org.telegram.ui.ActionBar.k3) awVar2).currentAccount;
                                    if (!UserConfig.getInstance(i12).isPremium()) {
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
                                vvVar.a(z11, false);
                            }
                        }
                        int start = matcher.start();
                        int end = matcher.end();
                        if (tL_messages_stickerSet2.set.title.charAt(start) != '@') {
                            start++;
                        }
                        Matcher matcher2 = matcher;
                        r82.setSpan(new uv(vvVar, tL_messages_stickerSet2.set.title.subSequence(start + 1, end).toString()), start, end, 0);
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
                z90Var.setText(charSequence);
            }
            textView = vvVar.b;
            if (textView != null) {
                if (tL_messages_stickerSet2 == null || (stickerSet = tL_messages_stickerSet2.set) == null || stickerSet.emojis) {
                    textView.setText(LocaleController.formatPluralString("EmojiCount", size3, new Object[0]));
                } else {
                    textView.setText(LocaleController.formatPluralString("Stickers", size3, new Object[0]));
                }
            }
            if (z10 && p0Var != null) {
                i12 = ((org.telegram.ui.ActionBar.k3) awVar2).currentAccount;
                if (!UserConfig.getInstance(i12).isPremium()) {
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
                i11 = ((org.telegram.ui.ActionBar.k3) awVar2).currentAccount;
                if (MediaDataController.getInstance(i11).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                    z11 = true;
                    vvVar.a(z11, false);
                }
            }
            z11 = false;
            vvVar.a(z11, false);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.u6 u6Var;
        View view2;
        aw awVar = this.c;
        if (i10 == 0) {
            view = awVar.d;
        } else {
            if (i10 == 1) {
                rv rvVar = new rv(awVar.getContext());
                rvVar.a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                view2 = rvVar;
            } else if (i10 == 2) {
                view2 = new vv(awVar, awVar.getContext(), awVar.e.c.length <= 1);
            } else if (i10 == 3) {
                view2 = new TextView(awVar.getContext());
            } else if (i10 == 4) {
                View zvVar = new zv(awVar.getContext());
                int i11 = org.telegram.ui.ActionBar.y6.Ke;
                u6Var = ((org.telegram.ui.ActionBar.k3) awVar).resourcesProvider;
                org.telegram.ui.ActionBar.f7.i(i11, zvVar, u6Var);
                s4.q0 q0Var = new s4.q0(-1, AndroidUtilities.getShadowHeight());
                ((ViewGroup.MarginLayoutParams) q0Var).topMargin = AndroidUtilities.dp(14.0f);
                zvVar.setLayoutParams(q0Var);
                view2 = zvVar;
            } else {
                view = null;
            }
            view = view2;
        }
        return new vl0(view);
    }
}
