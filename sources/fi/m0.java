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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                o2 o2Var = (o2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                long j3 = ((TLRPC.Chat) this.e).id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i10 = this.b;
                if (isChannel) {
                    long j10 = chat.id;
                    MessagesController.getInstance(i10).linkCommunity(-j10, j3, booleanValue, new o0(o2Var, j10, 0));
                    break;
                } else {
                    c2 c2Var = new c2(o2Var.getContext(), 3, null);
                    c2Var.q(250L);
                    MessagesController.getInstance(i10).convertToMegaGroup(o2Var.getParentActivity(), chat.id, o2Var, new n0(c2Var, o2Var, i10, j3, booleanValue));
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
                sv svVar = (sv) this.c;
                int[] iArr = (int[]) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                o2 o2Var2 = svVar.c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == this.b && iArr[1] > 0) {
                    svVar.dismiss();
                    oc.g(o2Var2, new bx0(o2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, o2Var2.getResourceProvider()), 1500).j();
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
                xc xcVar = (xc) this.c;
                Context context = (Context) this.d;
                f6 f6Var = (f6) this.e;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) yc.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new t11(this.b, context, f6Var, savedStarGift, 18), f6Var, null));
                    xcVar.setText(spannableStringBuilder);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m0(sv svVar, int[] iArr, int i10, ArrayList arrayList) {
        this.a = 2;
        this.c = svVar;
        this.d = iArr;
        this.b = i10;
        this.e = arrayList;
    }
}
