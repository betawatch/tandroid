package di;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.a10;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h60;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p9(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 1;
        int i11 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.nc ncVar = (org.telegram.ui.Components.nc) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ncVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.oc.b(hd.N0(2131744976, null), new ai.b1(this.b, context, h6Var, savedStarGift, 4), h6Var, null));
                    ncVar.setText(spannableStringBuilder);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj3;
                bi.w4 w4Var = (bi.w4) obj2;
                ((ai.y1) obj4).a(Boolean.FALSE);
                if (((Boolean) obj).booleanValue()) {
                    if (LaunchActivity.T() != g2Var || k10.t0 != i11) {
                        org.telegram.ui.Components.gc Q = org.telegram.ui.Components.lc.Y().Q(R.raw.contact_check, 36, hd.N0(2131749334, null));
                        Q.j = 5000;
                        Q.j();
                        break;
                    } else {
                        w4Var.run();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.gc Q2 = org.telegram.ui.Components.lc.Y().Q(R.raw.error, 36, hd.N0(2131749333, null));
                    Q2.j = 5000;
                    Q2.j();
                    break;
                }
                break;
            case 2:
                DictationAsr.Z((String) obj4, ((String[]) obj3)[((Integer) obj).intValue()]);
                ((y10) obj2).a(Integer.valueOf(i11));
                break;
            case 3:
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j3 = ((TLRPC.Chat) obj2).id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean T = org.telegram.messenger.v3.T(chat);
                int i12 = this.b;
                if (T) {
                    long j10 = chat.id;
                    np.u1(i12).W2(-j10, j3, false, booleanValue, new bi.n(g2Var2, j10, i10));
                    break;
                } else {
                    org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, g2Var2.getContext(), null);
                    t1Var.r(250L);
                    np.u1(i12).T(g2Var2.getParentActivity(), chat.id, g2Var2, new li.f0(t1Var, g2Var2, i12, j3, booleanValue), null);
                    break;
                }
            case 4:
                oi.a6 a6Var = (oi.a6) obj4;
                oi.a aVar = (oi.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i11 == a6Var.J && a6Var.y == aVar) {
                    Editable text = a6Var.f.getText();
                    if (TextUtils.equals(str, text)) {
                        for (qi.c cVar : (qi.c[]) text.getSpans(0, text.length(), qi.c.class)) {
                            text.removeSpan(cVar);
                        }
                        qi.c[] cVarArr = (qi.c[]) spannableString.getSpans(0, spannableString.length(), qi.c.class);
                        int length = text.length();
                        for (int i13 = 0; i13 < cVarArr.length; i13++) {
                            int spanStart = spannableString.getSpanStart(cVarArr[i13]);
                            int spanEnd = spannableString.getSpanEnd(cVarArr[i13]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(cVarArr[i13], spanStart, spanEnd, 33);
                            }
                        }
                        a6Var.I = str;
                        break;
                    }
                }
                break;
            case 5:
                ev evVar = (ev) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.g2 g2Var3 = evVar.n1;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i11 && iArr[1] > 0) {
                    evVar.dismiss();
                    org.telegram.ui.Components.gc.g(g2Var3, new pv0(g2Var3.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, g2Var3.getResourceProvider()), 1500).j();
                    break;
                }
                break;
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                h60 h60Var = (h60) obj3;
                Long l10 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                String str2 = LaunchActivity.C1;
                try {
                    h60Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                LaunchActivity.Q();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.lc Y = org.telegram.ui.Components.lc.Y();
                    if (Y != null) {
                        org.telegram.messenger.f3.n(null, 2131744487, Y, R.raw.story_bomb2, 36);
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    if (l10.longValue() > 0) {
                        bundle.putLong("user_id", l10.longValue());
                        bundle.putBoolean("my_profile", l10.longValue() == k10.i(launchActivity.P).e());
                    } else {
                        bundle.putLong("chat_id", -l10.longValue());
                    }
                    bundle.putInt("open_story_album_id", i11);
                    launchActivity.t0(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                a10 a10Var = (a10) obj3;
                gj gjVar = (gj) obj2;
                String str3 = (String) obj;
                if (i11 == photoViewer.Q4) {
                    photoViewer.o5 = str3;
                    if (!a10Var.s() || !a10Var.b(gjVar, photoViewer.o5)) {
                        photoViewer.p0.u(19);
                        photoViewer.p0.u(20);
                        break;
                    } else if (photoViewer.n5) {
                        photoViewer.p0.T(20);
                        photoViewer.p0.u(19);
                        break;
                    } else {
                        photoViewer.p0.T(19);
                        photoViewer.p0.u(20);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ p9(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
        this.e = obj3;
    }

    public /* synthetic */ p9(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i7;
    }
}
