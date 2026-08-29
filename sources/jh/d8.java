package jh;

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
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cw;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d8(Object obj, int i10, Object obj2, Object obj3, int i11) {
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
                vc vcVar = (vc) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.e;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(vcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) wc.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new ag.z1(this.b, context, c6Var, savedStarGift), c6Var, null));
                    vcVar.setText(spannableStringBuilder);
                    break;
                }
                break;
            case 1:
                jv jvVar = (jv) this.c;
                int[] iArr = (int[]) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                org.telegram.ui.ActionBar.o2 o2Var = jvVar.c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == this.b && iArr[1] > 0) {
                    jvVar.dismiss();
                    mc.g(o2Var, new sw0(o2Var.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, o2Var.getResourceProvider()), 1500).j();
                    break;
                }
                break;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                TranslateController translateController = (TranslateController) this.d;
                MessageObject messageObject = (MessageObject) this.e;
                String str = (String) obj;
                if (this.b == photoViewer.M4) {
                    photoViewer.k5 = str;
                    if (!translateController.isContextTranslateEnabled() || !translateController.canTranslatePhoto(messageObject, photoViewer.k5)) {
                        photoViewer.k0.r(19);
                        photoViewer.k0.r(20);
                        break;
                    } else if (photoViewer.j5) {
                        photoViewer.k0.K(20);
                        photoViewer.k0.r(19);
                        break;
                    } else {
                        photoViewer.k0.K(19);
                        photoViewer.k0.r(20);
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                long j10 = ((TLRPC.Chat) this.e).id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i10 = this.b;
                if (isChannel) {
                    long j11 = chat.id;
                    MessagesController.getInstance(i10).linkCommunity(-j11, j10, booleanValue, new ih.m(o2Var2, j11, 3));
                    break;
                } else {
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(o2Var2.getContext(), 3, null);
                    c2Var.q(250L);
                    MessagesController.getInstance(i10).convertToMegaGroup(o2Var2.getParentActivity(), chat.id, o2Var2, new cw(c2Var, o2Var2, i10, j10, booleanValue));
                    break;
                }
            default:
                th.t5 t5Var = (th.t5) this.c;
                th.a aVar = (th.a) this.d;
                String str2 = (String) this.e;
                SpannableString spannableString = (SpannableString) obj;
                if (this.b == t5Var.E && t5Var.x == aVar) {
                    Editable text = t5Var.f.getText();
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
                        t5Var.D = str2;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ d8(jv jvVar, int[] iArr, int i10, ArrayList arrayList) {
        this.a = 1;
        this.c = jvVar;
        this.d = iArr;
        this.b = i10;
        this.e = arrayList;
    }
}
