package bi;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.f10;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.qu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.q10;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ya(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 0;
        int i11 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.jc jcVar = (org.telegram.ui.Components.jc) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.kc.b(org.telegram.messenger.hd.M0(2131745220, null), new ai.a1(this.b, context, f6Var, savedStarGift, 2), f6Var, null));
                    jcVar.setText(spannableStringBuilder);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j3 = ((TLRPC.Chat) obj2).id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean T = org.telegram.messenger.t3.T(chat);
                int i12 = this.b;
                if (T) {
                    long j10 = chat.id;
                    qp.s1(i12).Q2(-j10, j3, false, booleanValue, new ii.g0(f2Var, j10, i10));
                    break;
                } else {
                    org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, f2Var.getContext(), null);
                    u1Var.r(250L);
                    qp.s1(i12).T(f2Var.getParentActivity(), chat.id, f2Var, new ii.f0(u1Var, f2Var, i12, j3, booleanValue), null);
                    break;
                }
            case 2:
                li.a6 a6Var = (li.a6) obj4;
                li.a aVar = (li.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i11 == a6Var.I && a6Var.y == aVar) {
                    Editable text = a6Var.f.getText();
                    if (TextUtils.equals(str, text)) {
                        for (ni.f fVar : (ni.f[]) text.getSpans(0, text.length(), ni.f.class)) {
                            text.removeSpan(fVar);
                        }
                        ni.f[] fVarArr = (ni.f[]) spannableString.getSpans(0, spannableString.length(), ni.f.class);
                        int length = text.length();
                        while (i10 < fVarArr.length) {
                            int spanStart = spannableString.getSpanStart(fVarArr[i10]);
                            int spanEnd = spannableString.getSpanEnd(fVarArr[i10]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(fVarArr[i10], spanStart, spanEnd, 33);
                            }
                            i10++;
                        }
                        a6Var.H = str;
                        break;
                    }
                }
                break;
            case 3:
                qu quVar = (qu) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.f2 f2Var2 = quVar.j1;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i11 && iArr[1] > 0) {
                    quVar.dismiss();
                    org.telegram.ui.Components.cc.g(f2Var2, new cv0(f2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, f2Var2.getResourceProvider()), 1500).j();
                    break;
                }
                break;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                q10 q10Var = (q10) obj3;
                Long l10 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                String str2 = LaunchActivity.B1;
                try {
                    q10Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                LaunchActivity.Q();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.hc X = org.telegram.ui.Components.hc.X();
                    if (X != null) {
                        org.telegram.messenger.k5.o(null, 2131744731, X, R.raw.story_bomb2, 36);
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    if (l10.longValue() > 0) {
                        bundle.putLong("user_id", l10.longValue());
                        bundle.putBoolean("my_profile", l10.longValue() == p10.i(launchActivity.O).e());
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
                f10 f10Var = (f10) obj3;
                ij ijVar = (ij) obj2;
                String str3 = (String) obj;
                if (i11 == photoViewer.P4) {
                    photoViewer.n5 = str3;
                    if (!f10Var.s() || !f10Var.b(ijVar, photoViewer.n5)) {
                        photoViewer.o0.t(19);
                        photoViewer.o0.t(20);
                        break;
                    } else if (photoViewer.m5) {
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
        }
    }

    public /* synthetic */ ya(qu quVar, int[] iArr, int i7, ArrayList arrayList) {
        this.a = 3;
        this.c = quVar;
        this.d = iArr;
        this.b = i7;
        this.e = arrayList;
    }

    public /* synthetic */ ya(LaunchActivity launchActivity, q10 q10Var, Long l10, int i7) {
        this.a = 4;
        this.c = launchActivity;
        this.d = q10Var;
        this.e = l10;
        this.b = i7;
    }
}
