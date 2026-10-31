package bi;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.t10;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a80;
import org.telegram.ui.f70;
import org.telegram.ui.sv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class i6 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i6(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        int i11 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                q6 q6Var = (q6) obj4;
                a aVar = (a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i11 == q6Var.I && q6Var.y == aVar) {
                    Editable text = q6Var.f.getText();
                    if (TextUtils.equals(str, text)) {
                        for (di.e eVar : (di.e[]) text.getSpans(0, text.length(), di.e.class)) {
                            text.removeSpan(eVar);
                        }
                        di.e[] eVarArr = (di.e[]) spannableString.getSpans(0, spannableString.length(), di.e.class);
                        int length = text.length();
                        for (int i12 = 0; i12 < eVarArr.length; i12++) {
                            int spanStart = spannableString.getSpanStart(eVarArr[i12]);
                            int spanEnd = spannableString.getSpanEnd(eVarArr[i12]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(eVarArr[i12], spanStart, spanEnd, 33);
                            }
                        }
                        q6Var.H = str;
                        break;
                    }
                }
                break;
            case 1:
                cv cvVar = (cv) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.k2 k2Var = cvVar.j1;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i11 && iArr[1] > 0) {
                    cvVar.dismiss();
                    wb.g(k2Var, new fw0(k2Var.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, k2Var.getResourceProvider()), 1500).j();
                    break;
                }
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                f70 f70Var = (f70) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    f70Var.run();
                } catch (Exception e) {
                    f8.g(e, true);
                }
                LaunchActivity.Q();
                if (tL_storyAlbum == null) {
                    cc X = cc.X();
                    if (X != null) {
                        org.telegram.messenger.m5.n(null, 2131744748, X, R.raw.story_bomb2, 36);
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    if (l4.longValue() > 0) {
                        bundle.putLong("user_id", l4.longValue());
                        bundle.putBoolean("my_profile", l4.longValue() == d20.i(launchActivity.O).e());
                    } else {
                        bundle.putLong("chat_id", -l4.longValue());
                    }
                    bundle.putInt("open_story_album_id", i11);
                    launchActivity.t0(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                t10 t10Var = (t10) obj3;
                jj jjVar = (jj) obj2;
                String str2 = (String) obj;
                if (i11 == photoViewer.Q4) {
                    photoViewer.o5 = str2;
                    if (!t10Var.s() || !t10Var.b(jjVar, photoViewer.o5)) {
                        photoViewer.o0.t(19);
                        photoViewer.o0.t(20);
                        break;
                    } else if (photoViewer.n5) {
                        photoViewer.o0.S(20);
                        photoViewer.o0.t(19);
                        break;
                    } else {
                        photoViewer.o0.S(19);
                        photoViewer.o0.t(20);
                        break;
                    }
                }
                break;
            case 4:
                ec ecVar = (ec) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ecVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) fc.b(cd.L0(2131745237, null), new c11(this.b, context, p6Var, savedStarGift, 19), p6Var, null));
                    ecVar.setText(spannableStringBuilder);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j10 = ((TLRPC.Chat) obj2).id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean T = org.telegram.messenger.w3.T(chat);
                int i13 = this.b;
                if (T) {
                    long j11 = chat.id;
                    vp.r1(i13).O2(-j11, j10, false, booleanValue, new a80(k2Var2, j11, 2));
                    break;
                } else {
                    org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, k2Var2.getContext(), null);
                    x1Var.r(250L);
                    vp.r1(i13).T(k2Var2.getParentActivity(), chat.id, k2Var2, new sv(x1Var, k2Var2, i13, j10, booleanValue), null);
                    break;
                }
        }
    }

    public /* synthetic */ i6(cv cvVar, int[] iArr, int i10, ArrayList arrayList) {
        this.a = 1;
        this.c = cvVar;
        this.d = iArr;
        this.b = i10;
        this.e = arrayList;
    }

    public /* synthetic */ i6(LaunchActivity launchActivity, f70 f70Var, Long l4, int i10) {
        this.a = 2;
        this.c = launchActivity;
        this.d = f70Var;
        this.e = l4;
        this.b = i10;
    }
}
