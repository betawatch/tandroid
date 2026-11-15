package di;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c10;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ev0;
import org.telegram.ui.Components.wu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g50;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l9 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l9(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 1;
        int i11 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.ec ecVar = (org.telegram.ui.Components.ec) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ecVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.fc.b(hd.M0(2131745219, null), new ci.p0(this.b, context, e6Var, savedStarGift, 2), e6Var, null));
                    ecVar.setText(spannableStringBuilder);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j3 = ((TLRPC.Chat) obj2).id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean T = org.telegram.messenger.t3.T(chat);
                int i12 = this.b;
                if (T) {
                    long j10 = chat.id;
                    np.s1(i12).Q2(-j10, j3, false, booleanValue, new bi.n(e2Var, j10, i10));
                    break;
                } else {
                    org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, e2Var.getContext(), null);
                    t1Var.r(250L);
                    np.s1(i12).T(e2Var.getParentActivity(), chat.id, e2Var, new li.f0(t1Var, e2Var, i12, j3, booleanValue), null);
                    break;
                }
            case 2:
                oi.y5 y5Var = (oi.y5) obj4;
                oi.a aVar = (oi.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i11 == y5Var.J && y5Var.y == aVar) {
                    Editable text = y5Var.f.getText();
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
                        y5Var.I = str;
                        break;
                    }
                }
                break;
            case 3:
                wu wuVar = (wu) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.e2 e2Var2 = wuVar.n1;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i11 && iArr[1] > 0) {
                    wuVar.dismiss();
                    org.telegram.ui.Components.xb.g(e2Var2, new ev0(e2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, e2Var2.getResourceProvider()), 1500).j();
                    break;
                }
                break;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                g50 g50Var = (g50) obj3;
                Long l10 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                String str2 = LaunchActivity.C1;
                try {
                    g50Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                LaunchActivity.Q();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.cc X = org.telegram.ui.Components.cc.X();
                    if (X != null) {
                        org.telegram.messenger.k5.n(null, 2131744730, X, R.raw.story_bomb2, 36);
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    if (l10.longValue() > 0) {
                        bundle.putLong("user_id", l10.longValue());
                        bundle.putBoolean("my_profile", l10.longValue() == m10.i(launchActivity.P).e());
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
                c10 c10Var = (c10) obj3;
                gj gjVar = (gj) obj2;
                String str3 = (String) obj;
                if (i11 == photoViewer.Q4) {
                    photoViewer.o5 = str3;
                    if (!c10Var.s() || !c10Var.b(gjVar, photoViewer.o5)) {
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

    public /* synthetic */ l9(wu wuVar, int[] iArr, int i7, ArrayList arrayList) {
        this.a = 3;
        this.c = wuVar;
        this.d = iArr;
        this.b = i7;
        this.e = arrayList;
    }

    public /* synthetic */ l9(LaunchActivity launchActivity, g50 g50Var, Long l10, int i7) {
        this.a = 4;
        this.c = launchActivity;
        this.d = g50Var;
        this.e = l10;
        this.b = i7;
    }
}
