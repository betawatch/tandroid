package gh;

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
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class g8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g8(Object obj, int i9, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                qc qcVar = (qc) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.e;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) rc.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new c3.d(this.b, context, b6Var, savedStarGift, 1), b6Var, null));
                    qcVar.setText(spannableStringBuilder);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                long j10 = ((TLRPC.Chat) this.e).id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i9 = this.b;
                if (isChannel) {
                    long j11 = chat.id;
                    MessagesController.getInstance(i9).linkCommunity(-j11, j10, booleanValue, new fh.m(o2Var, j11, 1));
                    break;
                } else {
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(o2Var.getContext(), 3, null);
                    c2Var.q(250L);
                    MessagesController.getInstance(i9).convertToMegaGroup(o2Var.getParentActivity(), chat.id, o2Var, new nh.l0(c2Var, o2Var, i9, j10, booleanValue));
                    break;
                }
            case 2:
                dv dvVar = (dv) this.c;
                int[] iArr = (int[]) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                org.telegram.ui.ActionBar.o2 o2Var2 = dvVar.c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == this.b && iArr[1] > 0) {
                    dvVar.dismiss();
                    gc.g(o2Var2, new iw0(o2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, o2Var2.getResourceProvider()), 1500).j();
                    break;
                }
                break;
            case 3:
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
            default:
                qh.s5 s5Var = (qh.s5) this.c;
                qh.a aVar = (qh.a) this.d;
                String str2 = (String) this.e;
                SpannableString spannableString = (SpannableString) obj;
                if (this.b == s5Var.E && s5Var.x == aVar) {
                    Editable text = s5Var.f.getText();
                    if (TextUtils.equals(str2, text)) {
                        for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
                            text.removeSpan(colorSpan);
                        }
                        CodeHighlighting.ColorSpan[] colorSpanArr = (CodeHighlighting.ColorSpan[]) spannableString.getSpans(0, spannableString.length(), CodeHighlighting.ColorSpan.class);
                        int length = text.length();
                        for (int i10 = 0; i10 < colorSpanArr.length; i10++) {
                            int spanStart = spannableString.getSpanStart(colorSpanArr[i10]);
                            int spanEnd = spannableString.getSpanEnd(colorSpanArr[i10]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(colorSpanArr[i10], spanStart, spanEnd, 33);
                            }
                        }
                        s5Var.D = str2;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ g8(dv dvVar, int[] iArr, int i9, ArrayList arrayList) {
        this.a = 2;
        this.c = dvVar;
        this.d = iArr;
        this.b = i9;
        this.e = arrayList;
    }
}
