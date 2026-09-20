package fi;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import ii.d6;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.zc;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class m0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m0(Object obj, int i10, Object obj2, Object obj3, int i11) {
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
                n2 n2Var = (n2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                long j3 = ((TLRPC.Chat) this.e).id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i10 = this.b;
                if (isChannel) {
                    long j10 = chat.id;
                    MessagesController.getInstance(i10).linkCommunity(-j10, j3, booleanValue, new o0(n2Var, j10, 0));
                    break;
                } else {
                    b2 b2Var = new b2(n2Var.getContext(), 3, null);
                    b2Var.q(250L);
                    MessagesController.getInstance(i10).convertToMegaGroup(n2Var.getParentActivity(), chat.id, n2Var, new n0(b2Var, n2Var, i10, j3, booleanValue));
                    break;
                }
            case 1:
                d6 d6Var = (d6) this.c;
                ii.a aVar = (ii.a) this.d;
                String str = (String) this.e;
                SpannableString spannableString = (SpannableString) obj;
                if (this.b == d6Var.I && d6Var.x == aVar) {
                    Editable text = d6Var.f.getText();
                    if (TextUtils.equals(str, text)) {
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
                        d6Var.H = str;
                        break;
                    }
                }
                break;
            case 2:
                tv tvVar = (tv) this.c;
                int[] iArr = (int[]) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                n2 n2Var2 = tvVar.c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == this.b && iArr[1] > 0) {
                    tvVar.dismiss();
                    pc.g(n2Var2, new lx0(n2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, n2Var2.getResourceProvider()), 1500).j();
                    break;
                }
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                TranslateController translateController = (TranslateController) this.d;
                MessageObject messageObject = (MessageObject) this.e;
                String str2 = (String) obj;
                if (this.b == photoViewer.Q4) {
                    photoViewer.o5 = str2;
                    if (!translateController.isContextTranslateEnabled() || !translateController.canTranslatePhoto(messageObject, photoViewer.o5)) {
                        photoViewer.o0.r(19);
                        photoViewer.o0.r(20);
                        break;
                    } else if (photoViewer.n5) {
                        photoViewer.o0.K(20);
                        photoViewer.o0.r(19);
                        break;
                    } else {
                        photoViewer.o0.K(19);
                        photoViewer.o0.r(20);
                        break;
                    }
                }
                break;
            default:
                zc zcVar = (zc) this.c;
                Context context = (Context) this.d;
                f6 f6Var = (f6) this.e;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ad.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new g21(this.b, context, f6Var, savedStarGift, 18), f6Var, null));
                    zcVar.setText(spannableStringBuilder);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m0(tv tvVar, int[] iArr, int i10, ArrayList arrayList) {
        this.a = 2;
        this.c = tvVar;
        this.d = iArr;
        this.b = i10;
        this.e = arrayList;
    }
}
