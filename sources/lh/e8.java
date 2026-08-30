package lh;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.lw;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e8(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                sc scVar = (sc) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(scVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) tc.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new cg.v1(this.b, context, f6Var, savedStarGift), f6Var, null));
                    scVar.setText(spannableStringBuilder);
                    break;
                }
                break;
            case 1:
                mv mvVar = (mv) this.c;
                int[] iArr = (int[]) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                org.telegram.ui.ActionBar.p2 p2Var = mvVar.c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == this.b && iArr[1] > 0) {
                    mvVar.dismiss();
                    ic.g(p2Var, new bx0(p2Var.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, p2Var.getResourceProvider()), 1500).j();
                    break;
                }
                break;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                TranslateController translateController = (TranslateController) this.d;
                MessageObject messageObject = (MessageObject) this.e;
                String str = (String) obj;
                if (this.b == photoViewer.N4) {
                    photoViewer.l5 = str;
                    if (!translateController.isContextTranslateEnabled() || !translateController.canTranslatePhoto(messageObject, photoViewer.l5)) {
                        photoViewer.l0.r(19);
                        photoViewer.l0.r(20);
                        break;
                    } else if (photoViewer.k5) {
                        photoViewer.l0.K(20);
                        photoViewer.l0.r(19);
                        break;
                    } else {
                        photoViewer.l0.K(19);
                        photoViewer.l0.r(20);
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                long j10 = ((TLRPC.Chat) this.e).id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i10 = this.b;
                if (isChannel) {
                    long j11 = chat.id;
                    MessagesController.getInstance(i10).linkCommunity(-j11, j10, booleanValue, new kh.l(p2Var2, j11, 3));
                    break;
                } else {
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(p2Var2.getContext(), 3, null);
                    d2Var.q(250L);
                    MessagesController.getInstance(i10).convertToMegaGroup(p2Var2.getParentActivity(), chat.id, p2Var2, new lw(d2Var, p2Var2, i10, j10, booleanValue));
                    break;
                }
            default:
                vh.v5 v5Var = (vh.v5) this.c;
                vh.a aVar = (vh.a) this.d;
                String str2 = (String) this.e;
                SpannableString spannableString = (SpannableString) obj;
                if (this.b == v5Var.F && v5Var.x == aVar) {
                    Editable text = v5Var.f.getText();
                    if (TextUtils.equals(str2, text)) {
                        for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
                            text.removeSpan(colorSpan);
                        }
                        CodeHighlighting.ColorSpan[] colorSpanArr = (CodeHighlighting.ColorSpan[]) spannableString.getSpans(0, spannableString.length(), CodeHighlighting.ColorSpan.class);
                        int length = text.length();
                        for (int i11 = 0; i11 < colorSpanArr.length; i11++) {
                            int spanStart = spannableString.getSpanStart(colorSpanArr[i11]);
                            int spanEnd = spannableString.getSpanEnd(colorSpanArr[i11]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(colorSpanArr[i11], spanStart, spanEnd, 33);
                            }
                        }
                        v5Var.E = str2;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ e8(mv mvVar, int[] iArr, int i10, ArrayList arrayList) {
        this.a = 1;
        this.c = mvVar;
        this.d = iArr;
        this.b = i10;
        this.e = arrayList;
    }
}
